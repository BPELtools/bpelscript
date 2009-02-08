/*
 * Copyright 2008, 2009 Marc Bischof 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package iaas.bpelscript.antlr;

import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class TestBPELscript {

	// provide a test rig for bosto.a
  public static void main(String[] args) throws Exception {
	    
	  	String namespace = "namespace test = \"http://org.antlr/developers/bosto/test\";" +
	  			"namespace test2 = \"http://org.iaas/developers/antlr/test2\";";
	    String process = "process pc1 {partnerLink p1, p2; var v1;}";
	    String func = "function auticc(muh){muh.ID}";
	    String sampel = "src/main/resources/sampel.bpelscript";
	  	String retval = compile(sampel);
//	    System.out.println(retval );
  }

  public static String compile (String simpelinput) throws RecognitionException, IOException {
	  //load in BPELscript.stg template group, put in templates variable
	  FileReader groupFile = new FileReader(BPELscriptLexer.class.getResource("BPELscript.stg").getPath());
	  StringTemplateGroup templates = new StringTemplateGroup(groupFile);
	  groupFile.close();
	  
	    BPELscriptLexer lexer = new BPELscriptLexer(new ANTLRFileStream(simpelinput));
	    //Create a stream of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//Create a parser attached to the token stream
		BPELscriptParser parser = new BPELscriptParser(tokens);
		//Invoke the program rule in get return value
		BPELscriptParser.program_return r = parser.program();
		CommonTree t = (CommonTree)r.getTree();
		
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
		System.out.println(output.toString());
		
		return t.toStringTree();
  }
  
}
