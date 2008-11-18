/*
 * Copyright 2008 Marc Bischof 
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

import junit.framework.TestCase;
import java.io.*;
import java.lang.reflect.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import iaas.bpelscript.antlr.BPELscriptLexer;
import iaas.bpelscript.antlr.BPELscriptParser;
import iaas.bpelscript.antlr.BPELscriptWalker;
import org.antlr.stringtemplate.StringTemplateGroup;

public class TestBPELscriptWalker extends TestCase {
	String stdout;
	String stderr;
	String prefix = "src/iaas/testcases/";
	String templatePath = "src/iaas/bpelscript/antlr/BPELscript.stg";

	public void testProgram_walks_Program1() throws Exception {
		// test input: "doc_extension"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"doc_extension"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"doc_extension"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"doc_extension", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program2() throws Exception {
		// test input: "doc_loanApproval"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"doc_loanApproval"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"doc_loanApproval"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"doc_loanApproval", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program3() throws Exception {
		// test input: "doc_simpelProcess"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"doc_simpelProcess"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"doc_simpelProcess"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"doc_simpelProcess", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program4() throws Exception {
		// test input: "vars"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"vars"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"vars"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"vars", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program5() throws Exception {
		// test input: "partner"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"partner"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"partner"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"partner", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program6() throws Exception {
		// test input: "import"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"import"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"import"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"import", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program7() throws Exception {
		// test input: "faultHdl"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"faultHdl"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"faultHdl"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"faultHdl", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program8() throws Exception {
		// test input: "implicit_bs"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+""+"implicit_bs"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+""+"implicit_bs"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"implicit_bs", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program9() throws Exception {
		// test input: "assign_bs"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"assign_bs"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"assign_bs"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"assign_bs", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program10() throws Exception {
		// test input: "corrSet_bs"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"corrSet_bs"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"corrSet_bs"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"corrSet_bs", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program11() throws Exception {
		// test input: "invoke"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"invoke"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"invoke"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"invoke", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program12() throws Exception {
		// test input: "pick"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"pick"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"pick"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"pick", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program13() throws Exception {
		// test input: "receive"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"receive"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"receive"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"receive", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program14() throws Exception {
		// test input: "receive2"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"receive2"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"receive2"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"receive2", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program15() throws Exception {
		// test input: "reply"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"reply"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"reply"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"reply", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program16() throws Exception {
		// test input: "rethrow"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"activities/"+"rethrow"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"activities/"+"rethrow"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"rethrow", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program17() throws Exception {
		// test input: "ext_act_bs"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"ext_act_bs"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"ext_act_bs"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"ext_act_bs", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program18() throws Exception {
		// test input: "forall"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"forall"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"forall"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"forall", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program19() throws Exception {
		// test input: "foreach"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"foreach"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"foreach"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"foreach", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program20() throws Exception {
		// test input: "scope"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"scope"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"scope"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"scope", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program21() throws Exception {
		// test input: "until"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"until"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"until"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"until", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program22() throws Exception {
		// test input: "while"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/"+"while"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/"+"while"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"while", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program23() throws Exception {
		// test input: "if_all"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_all"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_all"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_all", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program24() throws Exception {
		// test input: "if_combInner"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_combInner"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combInner"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_combInner", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program25() throws Exception {
		// test input: "if_combJS"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_combJS"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combJS"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_combJS", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program26() throws Exception {
		// test input: "if_combMultInner"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_combMultInner"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combMultInner"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_combMultInner", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program27() throws Exception {
		// test input: "if_else_elsif"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_else_elsif"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_else_elsif"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_else_elsif", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program28() throws Exception {
		// test input: "if_else"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_else"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_else"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_else", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program29() throws Exception {
		// test input: "if_elsif"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_elsif"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_elsif"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_elsif", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program30() throws Exception {
		// test input: "if_innerJoin"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_innerJoin"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_innerJoin"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_innerJoin", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program31() throws Exception {
		// test input: "if_innerSignal"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_innerSignal"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_innerSignal"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_innerSignal", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program32() throws Exception {
		// test input: "if_join"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_join"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_join"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_join", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program33() throws Exception {
		// test input: "if_signal"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_signal"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_signal"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_signal", expecting, actual.toString().trim());
	}

	public void testProgram_walks_Program34() throws Exception {
		// test input: "if_simple"
		Object retval = null;
		retval = execTreeParser("program", "program", prefix+"blockstructs/if_ex/"+"if_simple"+".bpelscript", true);
		Object actual = examineParserExecResult(8, retval);
		Object expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_simple"+".bpel");
		assertEquals("testing rule/file "+"program"+"/"+"if_simple", expecting, actual.toString().trim());
	}

	// Invoke target parser.rule
	public Object execTreeParser(String testTreeRuleName, String testRuleName, String testInput, boolean isFile) throws Exception {
		CharStream input;
		if ( isFile==true ) {
			input = new ANTLRFileStream(testInput);
		}
		else {
			input = new ANTLRStringStream(testInput);
		}
		try {
			FileReader groupFileBPELscript = new FileReader(templatePath);
			StringTemplateGroup templates = new StringTemplateGroup(groupFileBPELscript);
			groupFileBPELscript.close();
			BPELscriptLexer lexer = new BPELscriptLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			BPELscriptParser parser = new BPELscriptParser(tokens);
			/** Use Reflection to get rule method from parser */
			Method ruleName = Class.forName("iaas.bpelscript.antlr.BPELscriptParser").getMethod(testRuleName);

			/** Start of I/O Redirecting */
			PipedInputStream pipedIn = new PipedInputStream();
			PipedOutputStream pipedOut = new PipedOutputStream();
			PipedInputStream pipedErrIn = new PipedInputStream();
			PipedOutputStream pipedErrOut = new PipedOutputStream();
			try {
				pipedOut.connect(pipedIn);
				pipedErrOut.connect(pipedErrIn);
			}
			catch(IOException e) {
				System.err.println("connection failed...");
				System.exit(1);
			}
			PrintStream console = System.out;
			PrintStream consoleErr = System.err;
			PrintStream ps = new PrintStream(pipedOut);
			PrintStream ps2 = new PrintStream(pipedErrOut);
			System.setOut(ps);
			System.setErr(ps2);
			/** End of redirecting */

			/** Invoke grammar rule, and get the return value */
			Object ruleReturn = ruleName.invoke(parser);
			
			Class _return = Class.forName("iaas.bpelscript.antlr.BPELscriptParser"+"$"+testRuleName+"_return");            	
        	Method returnName = _return.getMethod("getTree");
        	CommonTree tree = (CommonTree) returnName.invoke(ruleReturn);
			
			// Walk resulting tree; create tree nodes stream first
        	CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        	// AST nodes have payload that point into token stream
        	nodes.setTokenStream(tokens);
        	// Create a tree walker attached to the nodes stream
        	BPELscriptWalker treeParser = new BPELscriptWalker(nodes);
        	treeParser.setTemplateLib(templates);
        	/** Invoke the tree rule, and store the return value if there is */
            Method treeRuleName = Class.forName("iaas.bpelscript.antlr.BPELscriptWalker").getMethod(testTreeRuleName);
            Object treeRuleReturn = treeRuleName.invoke(treeParser);
            
            String astString = null;
            /** If tree rule has return value, determine if it's an AST */
            if ( treeRuleReturn!=null ) {
            	/** If return object is instanceof AST, get the toStringTree */
                if ( treeRuleReturn.toString().indexOf(testTreeRuleName+"_return")>0 ) {
                	try {	// NullPointerException may happen here...
                		Class _treeReturn = Class.forName("iaas.bpelscript.antlr.BPELscriptWalker"+"$"+testTreeRuleName+"_return");
                		Method[] methods = _treeReturn.getDeclaredMethods();
			            for(Method method : methods) {
			                if ( method.getName().equals("getTree") ) {
			                	Method treeReturnName = _treeReturn.getMethod("getTree");
		                    	CommonTree returnTree = (CommonTree) treeReturnName.invoke(treeRuleReturn);
		                        astString = returnTree.toStringTree();
			                }
			            }
                	}
                	catch(Exception e) {
                		System.err.println(e);
                	}
                }
            }

			org.antlr.gunit.gUnitExecuter.StreamVacuum stdoutVacuum = new org.antlr.gunit.gUnitExecuter.StreamVacuum(pipedIn);
			org.antlr.gunit.gUnitExecuter.StreamVacuum stderrVacuum = new org.antlr.gunit.gUnitExecuter.StreamVacuum(pipedErrIn);
			ps.close();
			ps2.close();
			System.setOut(console);			// Reset standard output
			System.setErr(consoleErr);		// Reset standard err out
			this.stdout = null;
			this.stderr = null;
			stdoutVacuum.start();
			stderrVacuum.start();			
			stdoutVacuum.join();
			stderrVacuum.join();
			// retVal could be actual return object from rule, stderr or stdout
			if ( stderrVacuum.toString().length()>0 ) {
				this.stderr = stderrVacuum.toString();
				return this.stderr;
			}
			if ( stdoutVacuum.toString().length()>0 ) {
				this.stdout = stdoutVacuum.toString();
			}
			if ( astString!=null ) {	// Return toStringTree of AST
				return astString;
			}
			if ( treeRuleReturn!=null ) {
				return treeRuleReturn;
			}
			if ( stderrVacuum.toString().length()==0 && stdoutVacuum.toString().length()==0 ) {
				return null;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); System.exit(1);
		} catch (SecurityException e) {
			e.printStackTrace(); System.exit(1);
		} catch (NoSuchMethodException e) {
			e.printStackTrace(); System.exit(1);
		} catch (IllegalAccessException e) {
			e.printStackTrace(); System.exit(1);
		} catch (InvocationTargetException e) {
			e.printStackTrace(); System.exit(1);
		} catch (InterruptedException e) {
			e.printStackTrace(); System.exit(1);
		} catch (Exception e) {
			e.printStackTrace(); System.exit(1);
		}
		return stdout;
	}

	// Modify the return value if the expected token type is OK or FAIL
	public Object examineParserExecResult(int tokenType, Object retVal) {	
		if ( tokenType==27 ) {	// expected Token: OK
			if ( this.stderr==null ) {
				return "OK";
			}
			else {
				return "FAIL";
			}
		}
		else if ( tokenType==28 ) {	// expected Token: FAIL
			if ( this.stderr!=null ) {
				return "FAIL";
			}
			else {
				return "OK";
			}
		}
		else {	// return the same object for the other token types
			return retVal;
		}		
	}
	
	public Object readOutput (String file) {	
		FileReader groupFileBPELscript = null;
		String tmp,result = null;
		BufferedReader br = null;
		try {
			groupFileBPELscript = new FileReader(file);
			br = new BufferedReader(groupFileBPELscript);
			
			tmp=br.readLine();
			if (tmp !=null) result="";
			while (tmp != null) {
				result+=tmp;
				tmp=br.readLine();
				if (tmp !=null) result+="\n";
			}
		    br.close();
			
			groupFileBPELscript.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return result;
	}

}