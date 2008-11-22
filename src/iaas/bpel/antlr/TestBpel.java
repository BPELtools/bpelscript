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

package iaas.bpel.antlr;

import junit.framework.TestCase;
import java.io.*;
import java.lang.reflect.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import com.javadude.antxr.scanner.BasicCrimsonXMLTokenStream;

public class TestBpel extends TestCase {
	String stdout;
	String stderr;
	String prefix = "src/iaas/testcases/";

	public void testDocument1() throws Exception {
		// test input: "doc_extension"
		Object retval = execParser("document", prefix+""+"doc_extension"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"doc_extension"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"doc_extension", expecting, actual);
	}

	public void testDocument2() throws Exception {
		// test input: "doc_loanApproval"
		Object retval = execParser("document", prefix+""+"doc_loanApproval"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"doc_loanApproval"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"doc_loanApproval", expecting, actual);
	}

	public void testDocument3() throws Exception {
		// test input: "doc_simpelProcess"
		Object retval = execParser("document", prefix+""+"doc_simpelProcess"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"doc_simpelProcess"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"doc_simpelProcess", expecting, actual);
	}

	public void testDocument4() throws Exception {
		// test input: "vars"
		Object retval = execParser("document", prefix+""+"vars"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"vars"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"vars", expecting, actual);
	}

	public void testDocument5() throws Exception {
		// test input: "partner"
		Object retval = execParser("document", prefix+""+"partner"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"partner"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"partner", expecting, actual);
	}

	public void testDocument6() throws Exception {
		// test input: "import"
		Object retval = execParser("document", prefix+""+"import"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"import"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"import", expecting, actual);
	}

	public void testDocument7() throws Exception {
		// test input: "faultHdl"
		Object retval = execParser("document", prefix+""+"faultHdl"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"faultHdl"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"faultHdl", expecting, actual);
	}

	public void testDocument8() throws Exception {
		// test input: "implicit_b"
		Object retval = execParser("document", prefix+""+"implicit_b"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+""+"implicit_b"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"implicit_b", expecting, actual);
	}

	public void testDocument9() throws Exception {
		// test input: "assign_b"
		Object retval = execParser("document", prefix+"activities/"+"assign_b"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"assign_b"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"assign_b", expecting, actual);
	}

	public void testDocument10() throws Exception {
		// test input: "assign2"
		Object retval = execParser("document", prefix+"activities/"+"assign2"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"assign2"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"assign2", expecting, actual);
	}

	public void testDocument11() throws Exception {
		// test input: "corrSet_b"
		Object retval = execParser("document", prefix+"activities/"+"corrSet_b"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"corrSet_b"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"corrSet_b", expecting, actual);
	}

	public void testDocument12() throws Exception {
		// test input: "invoke"
		Object retval = execParser("document", prefix+"activities/"+"invoke"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"invoke"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"invoke", expecting, actual);
	}

	public void testDocument13() throws Exception {
		// test input: "pick"
		Object retval = execParser("document", prefix+"activities/"+"pick"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"pick"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"pick", expecting, actual);
	}

	public void testDocument14() throws Exception {
		// test input: "receive"
		Object retval = execParser("document", prefix+"activities/"+"receive"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"receive"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"receive", expecting, actual);
	}

	public void testDocument15() throws Exception {
		// test input: "receive2"
		Object retval = execParser("document", prefix+"activities/"+"receive2"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"receive2"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"receive2", expecting, actual);
	}

	public void testDocument16() throws Exception {
		// test input: "reply"
		Object retval = execParser("document", prefix+"activities/"+"reply"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"reply"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"reply", expecting, actual);
	}

	public void testDocument17() throws Exception {
		// test input: "rethrow"
		Object retval = execParser("document", prefix+"activities/"+"rethrow"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"activities/"+"rethrow"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"rethrow", expecting, actual);
	}

	public void testDocument18() throws Exception {
		// test input: "ext_act_b"
		Object retval = execParser("document", prefix+"blockstructs/"+"ext_act_b"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"ext_act_b"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"ext_act_b", expecting, actual);
	}

	public void testDocument19() throws Exception {
		// test input: "forall"
		Object retval = execParser("document", prefix+"blockstructs/"+"forall"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"forall"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"forall", expecting, actual);
	}

	public void testDocument20() throws Exception {
		// test input: "foreach"
		Object retval = execParser("document", prefix+"blockstructs/"+"foreach"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"foreach"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"foreach", expecting, actual);
	}

	public void testDocument21() throws Exception {
		// test input: "scope"
		Object retval = execParser("document", prefix+"blockstructs/"+"scope"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"scope"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"scope", expecting, actual);
	}

	public void testDocument22() throws Exception {
		// test input: "until"
		Object retval = execParser("document", prefix+"blockstructs/"+"until"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"until"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"until", expecting, actual);
	}

	public void testDocument23() throws Exception {
		// test input: "while"
		Object retval = execParser("document", prefix+"blockstructs/"+"while"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/"+"while"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"while", expecting, actual);
	}

	public void testDocument24() throws Exception {
		// test input: "if_all"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_all"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_all"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_all", expecting, actual);
	}

	public void testDocument25() throws Exception {
		// test input: "if_combInner"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_combInner"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combInner"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_combInner", expecting, actual);
	}

	public void testDocument26() throws Exception {
		// test input: "if_combJS"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_combJS"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combJS"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_combJS", expecting, actual);
	}

	public void testDocument27() throws Exception {
		// test input: "if_combMultInner"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_combMultInner"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_combMultInner"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_combMultInner", expecting, actual);
	}

	public void testDocument28() throws Exception {
		// test input: "if_else_elsif"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_else_elsif"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_else_elsif"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_else_elsif", expecting, actual);
	}

	public void testDocument29() throws Exception {
		// test input: "if_else"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_else"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_else"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_else", expecting, actual);
	}

	public void testDocument30() throws Exception {
		// test input: "if_elsif"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_elsif"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_elsif"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_elsif", expecting, actual);
	}

	public void testDocument31() throws Exception {
		// test input: "if_innerJoin"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_innerJoin"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_innerJoin"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_innerJoin", expecting, actual);
	}

	public void testDocument32() throws Exception {
		// test input: "if_innerSignal"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_innerSignal"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_innerSignal"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_innerSignal", expecting, actual);
	}

	public void testDocument33() throws Exception {
		// test input: "if_join"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_join"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_join"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_join", expecting, actual);
	}

	public void testDocument34() throws Exception {
		// test input: "if_signal"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_signal"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_signal"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_signal", expecting, actual);
	}

	public void testDocument35() throws Exception {
		// test input: "if_simple"
		Object retval = execParser("document", prefix+"blockstructs/if_ex/"+"if_simple"+".bpel", true);
		Object actual = examineParserExecResult(8, retval).toString().trim();
		Object expecting = null;
		expecting = readOutput(prefix+"blockstructs/if_ex/"+"if_simple"+".bpelscript");

		assertEquals("testing rule/file "+"document"+"/"+"if_simple", expecting, actual);
	}

	// Invoke target parser.rule
	public Object execParser(String testRuleName, String testInput, boolean isFile) throws Exception {
		CharStream input;
		/** Set up ANTLR input stream based on input source, file or String */
		if ( isFile==true ) {
			input = new ANTLRFileStream(testInput);
		}
		else {
			input = new ANTLRStringStream(testInput);
		}
		try {
			//use SAX XML Parser as Lexer
			BasicCrimsonXMLTokenStream stream = 
			     		new BasicCrimsonXMLTokenStream(new FileReader(testInput),
                                     BpelParser.class, false, false);
		    // Create our ANTLR parser
    		BpelParser parser = new BpelParser(stream);
			/** Use Reflection to get rule method from parser */
			Method ruleName = Class.forName("iaas.bpel.antlr.BpelParser").getMethod(testRuleName);

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

			/** Invoke grammar rule, and store if there is a return value */
			Object ruleReturn = ruleName.invoke(parser);
			String astString = null;
			/** If rule has return value, determine if it's an AST */
			if ( ruleReturn!=null ) {
				/** If return object is instanceof AST, get the toStringTree */
				if ( ruleReturn.toString().indexOf(testRuleName+"_return")>0 ) {
					try {	// NullPointerException may happen here...
						Class _return = Class.forName("iaas.bpel.antlr.BpelParser"+"$"+testRuleName+"_return");            	
						Method[] methods = _return.getDeclaredMethods();
                		for(Method method : methods) {
			                if ( method.getName().equals("getTree") ) {
			                	Method returnName = _return.getMethod("getTree");
		                    	CommonTree tree = (CommonTree) returnName.invoke(ruleReturn);
		                    	astString = tree.toStringTree();
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
			if ( ruleReturn!=null ) {
				return ruleReturn;
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