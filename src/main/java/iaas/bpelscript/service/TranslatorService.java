package iaas.bpelscript.service;

import iaas.bpel.antlr.BpelParser;
import iaas.bpelscript.antlr.BPELscriptLexer;
import iaas.bpelscript.antlr.BPELscriptParser;
import iaas.bpelscript.antlr.BPELscriptWalker;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.util.concurrent.Executor;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import com.javadude.antxr.scanner.BasicCrimsonXMLTokenStream;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


/**
 * Simple RESTful translator service implementation.
 * 
 * @author Tammo van Lessen
 */
public class TranslatorService implements HttpHandler {

	public void handle(HttpExchange t) throws IOException {
		int code = 200;
		String response = "";
		if ("POST".equalsIgnoreCase(t.getRequestMethod())) {
			InputStream is = t.getRequestBody();
			try {
				if (t.getRequestURI().getPath().contains("b2bs")) {
					response = doB2BS(decodeRequest(is));
				} else if (t.getRequestURI().getPath().contains("bs2b")) {
					response = doBS2B(decodeRequest(is));
					t.getResponseHeaders().add("Content-Type", "text/xml");
				} else {
					code = 404;
					response = "Not found.";
				}
			} catch (Exception e) {
				code = 500;
				e.printStackTrace();
				response = e.toString();
			}
		} else {
			code = 200;
			response = "<h1>BPEL to BPELscript</h1><form method=\"POST\" action=\"/b2bs\"><textarea name=\"input\"></textarea><br/><input type=\"submit\"/></form>";
			response += "<h1>BPELscript to BPEL</h1><form method=\"POST\" action=\"/bs2b\"><textarea name=\"input\"></textarea><br/><input type=\"submit\"/></form>";
		}

		//		byte[] bBody = new byte[1000];
		//		int count = is.read(bBody);
		//		String sBody = bBody.toString();
		t.sendResponseHeaders(code, response.length());
		OutputStream os = t.getResponseBody();
		os.write(response.getBytes());
		os.close();	
	}

	private String doBS2B(String input) throws Exception {
		System.out.println(input);
		//load in SimPEL.stg template group, put in templates variable
		InputStream groupFileBPELScript = this.getClass().getResourceAsStream("/iaas/bpelscript/antlr/BPELscript.stg");
		//FileReader groupFileSimPEL = new FileReader("src/iaas/bpelscript/antlr/BPELscript.stg");
		//StringTemplateGroup templates = new StringTemplateGroup(groupFileSimPEL);
		StringTemplateGroup templates = new StringTemplateGroup(new InputStreamReader(groupFileBPELScript));

		BPELscriptLexer lexer = new BPELscriptLexer(new ANTLRStringStream(input));
		//Create a stream of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//Create a parser attached to the token stream
		BPELscriptParser parser = new BPELscriptParser(tokens);
		//Invoke the program rule in get return value
		BPELscriptParser.program_return r = parser.program();
		CommonTree t = (CommonTree)r.getTree();

		//		System.out.println(t.toStringTree());

		//Walk resulting tree; create treenode stream first
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		//AST nodes have payloads that oint into token stream
		nodes.setTokenStream(tokens);
		//create a tree Walker attached to the nodes stream
		BPELscriptWalker walker = new BPELscriptWalker(nodes);
		walker.setTemplateLib(templates);

		//invoke the start symbol; rule program
		BPELscriptWalker.program_return r2 = walker.program();

		StringTemplate output = (StringTemplate) r2.getTemplate();

		return output.toString();
	}

	private String doB2BS(String input) throws Exception {
	    BasicCrimsonXMLTokenStream stream =
	        new BasicCrimsonXMLTokenStream(new StringReader(input),
	                                       BpelParser.class, false, false);

	    // Create our ANTLR parser
	    BpelParser bpelParser = new BpelParser(stream);

	    // parse the document
	    return bpelParser.document();
	}

	private String decodeRequest(InputStream is) throws Exception {
        
		StringBuilder buf = new StringBuilder();
        int b;
        
        while ((b = is.read()) != -1) {
            buf.append((char) b);
        }

        is.close();

        if (buf.length() > 0) {
        	//XXX: fieser hack! "input=" wird einfach vorne abgeschnitten, eigentlich
        	//müsste man die Requestparameter korrekt rausparsen.
        	String result = URLDecoder.decode(buf.toString(), "UTF-8");
        	return result.substring(6);
        } else {
            return null;
        }	
		
	}
	
	
	public static void main(String[] args) {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8123),0);
			HttpContext ctx = server.createContext("/",new TranslatorService());
			server.setExecutor(new DirectExecutor());
			System.out.println("Starting BPELscript translation server...");
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 static class DirectExecutor implements Executor {
	     public void execute(Runnable r) {
	         r.run();
	     }
	 }
}
