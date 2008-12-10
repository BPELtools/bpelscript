// $ANTXR : "bpel.antxr" -> "BpelParser.java"$
// GENERATED CODE - DO NOT EDIT!

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

import iaas.bpel.antlr.BpelBoolean;
import iaas.bpel.antlr.JoinBool;
import iaas.bpel.antlr.JoinPattern;
import iaas.bpel.antlr.Helper;

import java.util.List;
import java.util.Iterator;

import com.javadude.antxr.TokenBuffer;
import com.javadude.antxr.TokenStreamException;
import com.javadude.antxr.TokenStreamIOException;
import com.javadude.antxr.ANTXRException;
import com.javadude.antxr.LLkParser;
import com.javadude.antxr.Token;
import com.javadude.antxr.TokenStream;
import com.javadude.antxr.RecognitionException;
import com.javadude.antxr.NoViableAltException;
import com.javadude.antxr.MismatchedTokenException;
import com.javadude.antxr.SemanticException;
import com.javadude.antxr.ParserSharedInputState;
import com.javadude.antxr.collections.impl.BitSet;

// ANTXR XML Mode Support
import com.javadude.antxr.scanner.XMLToken;
import com.javadude.antxr.scanner.Attribute;
import java.util.Map;
import java.util.HashMap;


public class BpelParser extends com.javadude.antxr.LLkParser       implements BpelParserTokenTypes
 {
	// ANTXR XML Mode Support
	private static Map __xml_namespaceMap = new HashMap();
	public static Map getNamespaceMap() {return __xml_namespaceMap;}
	public static String resolveNamespace(String prefix) {
		if (prefix == null || "".equals(prefix))
			return "";
		return (String)__xml_namespaceMap.get(prefix);
	}


protected BpelParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public BpelParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected BpelParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public BpelParser(TokenStream lexer) {
  this(lexer,1);
}

public BpelParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final String  document() throws RecognitionException, TokenStreamException {
		String bpelscript="";
		
		
		try {      // for error handling
			bpelscript=__xml_process();
			match(Token.EOF_TYPE);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return bpelscript;
	}
	
	public final String  __xml_process() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(4);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
			String tns = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"targetNamespace"); //handled via HashMap
			String qLang = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"queryLanguage");
			String exprLang = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");
			BpelBoolean dpe = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure"));
			BpelBoolean eOSF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"exitOnStandardFault"));
			String xmlns = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"xmlns"); //handled via HashMap
			//
			String proc; //process elements content
			String attr="";//handle attributes
			
			/*
				 * namespace handling
				 *
				 * - extract process namespace.
				 * - then handle all other namespace by extracting their namespace names
				 */
				 
				//handle targetNamespace separate
				text += "namespace pns = \""+((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"targetNamespace")+"\";\n";	
							
				//handle all other namespaces (remove xmlns prefix)
				for(Iterator t = ((XMLToken)__xml_startTag).getAttributes(); t.hasNext();) {
					Attribute m = (Attribute) t.next();
											
					if (m.getLocalName().contains(":")) {//extract namespace name
						getNamespaceMap().put("namespace "+m.getLocalName().substring(m.getLocalName().indexOf(':')+1)+" ", " \""+m.getValue()+"\";");
					}
				}
			
			proc=proc_elt();
			
			/*
			* fetch all namespaces and extensions from the namespace map
			*/
			String ns_ext = "";
				for(Object o : getNamespaceMap().entrySet()) {
					ns_ext += o.toString();
				}
				//sort ns_ext
				ns_ext=Helper.cvNS(ns_ext);
				
				//handle attributes as annotations
				attr=Helper.cvAttr("queryLanguage", qLang);
				attr+=Helper.cvAttr("expressionLanguage", exprLang);
				attr+=Helper.cvBoolAttr("suppressJoinFailure", dpe);
				attr+=Helper.cvBoolAttr("exitOnStandardFault", eOSF);
				
				// set result
				text += ns_ext + "\n";
				
				//handle attributes
				if (!attr.isEmpty()) text+=attr;
				
				//handle content
				text+="process pns::"+name+" {\n\n"+proc+"}";
				
				//reset namespace map
				getNamespaceMap().clear();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return text;
	}
	
	public final String  proc_elt() throws RecognitionException, TokenStreamException {
		String proc="";
		
		
		String text="";
		String handler=null;
		String act="";
		
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case 6:
			{
				__xml_extensions();
				break;
			}
			case 8:
			case 9:
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop5929:
			do {
				if ((LA(1)==8)) {
					__xml_import();
				}
				else {
					break _loop5929;
				}
				
			} while (true);
			}
			{
			switch ( LA(1)) {
			case 9:
			{
				text=__xml_messageExchanges();
				break;
			}
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if (text!=null && !text.isEmpty()) proc+=text+"\n"; text="";
			{
			switch ( LA(1)) {
			case 11:
			{
				text=__xml_partnerLinks();
				if (text!=null && !text.isEmpty()) proc+=text+"\n"; text="";
				break;
			}
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 13:
			{
				text=__xml_variables();
				if (text!=null && !text.isEmpty()) proc+=text+"\n"; text="";
				break;
			}
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 15:
			{
				text=__xml_correlationSets();
				break;
			}
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if (text!=null && !text.isEmpty()) proc+=text+"\n"; text="";
			{
			switch ( LA(1)) {
			case 17:
			{
				text=__xml_faultHandlers();
				if (text!=null && !text.isEmpty()) handler=text; text="";
				break;
			}
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 18:
			{
				text=__xml_eventHandlers();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if (text!=null && !text.isEmpty()) proc+=text+"\n"; text="";
			act=activity(act);
			
				if (handler!=null)
				   	proc += "try {\n"+act+"\n} "+handler;
				else
					proc += act;
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return proc;
	}
	
	public final void __xml_extensions() throws RecognitionException, TokenStreamException {
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(6);
			{
			{
			int _cnt5939=0;
			_loop5939:
			do {
				if ((LA(1)==7)) {
					__xml_extension();
				}
				else {
					if ( _cnt5939>=1 ) { break _loop5939; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt5939++;
			} while (true);
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
	}
	
	public final void __xml_import() throws RecognitionException, TokenStreamException {
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(8);
			{
			
			String ns = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"namespace");
			String loc = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"location");
			String importType = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"importType");
			//
			String mod_import = ""; //to build the import object stored in the ns map
			
			
			/*
				 * lookup namespaces and add a import in the namespace map
				 * 
				 * Therefor, get the keySet and compare the namespaces.
				 * If their namespaces are equal, duplicate the object.
				 *  1) put old one in the map
				 *  2) process the import object
				 *   2.1) check if type present (if yes > append to mod_import)
				 *   2.2) process main part
				 *    2.2.1) process an ID from location
				 *    2.2.2) process namespace and location 
				 * else: insert the 'real' namespace in the tmp_map
				 */
				Map tmp_map = new HashMap<String, String>();
				for (Object o : getNamespaceMap().keySet()) {
					String str_o = (String) o;
					String attr = getNamespaceMap().get(o).toString();
						
					if (ns.equals(attr.subSequence(2, attr.length()-2))) {//omit quotes in attr string
						// put old object back in the map
						tmp_map.put(o, attr);
						//2.1
						if (importType!=null) mod_import+=Helper.cvAttr("type", importType);
						//2.2.1
						// process modified import object for the map
						mod_import+="import "+loc.substring(0, loc.indexOf('.'))+" ";
						
						//2.2.2
						// put modified import to the map
						tmp_map.put(mod_import, str_o.substring(9,str_o.trim().length())+"::\""+loc+"\";"); 
							
					} else { tmp_map.put(o, attr); }	
				}
				//reset namespace map
				__xml_namespaceMap = tmp_map;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
	}
	
	public final String  __xml_messageExchanges() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(9);
			{
			String mex = "";
			{
			int _cnt5947=0;
			_loop5947:
			do {
				if ((LA(1)==10)) {
					mex=__xml_messageExchange(mex);
				}
				else {
					if ( _cnt5947>=1 ) { break _loop5947; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt5947++;
			} while (true);
			}
			text+="messages "+mex+";\n";
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return text;
	}
	
	public final String  __xml_partnerLinks() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(11);
			{
			String pl="";
			{
			int _cnt5953=0;
			_loop5953:
			do {
				if ((LA(1)==12)) {
					pl=__xml_partnerLink(pl);
				}
				else {
					if ( _cnt5953>=1 ) { break _loop5953; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt5953++;
			} while (true);
			}
			text+="partnerLink "+pl+";\n";
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return text;
	}
	
	public final String  __xml_variables() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(13);
			{
			String ret="";
			{
			int _cnt5959=0;
			_loop5959:
			do {
				if ((LA(1)==14)) {
					ret=__xml_variable(ret);
				}
				else {
					if ( _cnt5959>=1 ) { break _loop5959; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt5959++;
			} while (true);
			}
			text+="var "+ret+";\n";
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		return text;
	}
	
	public final String  __xml_correlationSets() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(15);
			{
				String cors="";
			{
			int _cnt5966=0;
			_loop5966:
			do {
				if ((LA(1)==16)) {
					cors=__xml_correlationSet(cors);
				}
				else {
					if ( _cnt5966>=1 ) { break _loop5966; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt5966++;
			} while (true);
			}
			
				text="correlates {"+cors+"\n           }";						
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
		return text;
	}
	
	public final String  __xml_faultHandlers() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(17);
			{
			
				String retval="";  
				String catchs="";  
				String catcha="";
			
			{
			_loop5972:
			do {
				if ((LA(1)==52)) {
					catchs=__xml_catch(catchs);
				}
				else {
					break _loop5972;
				}
				
			} while (true);
			}
			{
			switch ( LA(1)) {
			case 53:
			{
				catcha=__xml_catchAll();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			text+=catchs;
			if (catcha!=null && !catcha.isEmpty()) text+="\n"+catcha;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		return text;
	}
	
	public final String  __xml_eventHandlers() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(18);
			{
				String oE=""; String oA="";
			{
			_loop5977:
			do {
				if ((LA(1)==19)) {
					oE=__xml_onEvent(oE);
				}
				else {
					break _loop5977;
				}
				
			} while (true);
			}
			{
			_loop5979:
			do {
				if ((LA(1)==20)) {
					oA=__xml_onAlarm(oA, false);
				}
				else {
					break _loop5979;
				}
				
			} while (true);
			}
			
				text+="events {\n"+oE+"\n"+oA+"}";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		return text;
	}
	
	public final String  activity(
		String rets
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		String ret="";
		
		try {      // for error handling
			switch ( LA(1)) {
			case 21:
			{
				ret=__xml_receive();
				text+=rets+ret;
				break;
			}
			case 22:
			{
				ret=__xml_reply();
				text+=rets+ret;
				break;
			}
			case 23:
			{
				ret=__xml_invoke();
				text+=rets+ret;
				break;
			}
			case 24:
			{
				ret=__xml_assign();
				text+=rets+ret;
				break;
			}
			case 25:
			{
				ret=__xml_throw();
				text+=rets+ret;
				break;
			}
			case 26:
			{
				ret=__xml_exit();
				text+=rets+ret;
				break;
			}
			case 27:
			{
				ret=__xml_wait();
				text+=rets+ret;
				break;
			}
			case 28:
			{
				ret=__xml_empty();
				text+=rets+ret;
				break;
			}
			case 29:
			{
				ret=__xml_sequence();
				text+=rets+ret;
				break;
			}
			case 30:
			{
				ret=__xml_if();
				text+=rets+ret;
				break;
			}
			case 31:
			{
				ret=__xml_while();
				text+=rets+ret;
				break;
			}
			case 32:
			{
				ret=__xml_repeatUntil();
				text+=rets+ret;
				break;
			}
			case 33:
			{
				ret=__xml_forEach();
				text+=rets+ret;
				break;
			}
			case 34:
			{
				ret=__xml_pick();
				text+=rets+ret;
				break;
			}
			case 36:
			{
				ret=__xml_flow();
				text+=rets+ret;
				break;
			}
			case 37:
			{
				ret=__xml_scope(false);
				text+=rets+ret;
				break;
			}
			case 38:
			{
				ret=__xml_compensate();
				text+=rets+ret;
				break;
			}
			case 39:
			{
				ret=__xml_compensateScope();
				text+=rets+ret;
				break;
			}
			case 40:
			{
				ret=__xml_rethrow();
				text+=rets+ret;
				break;
			}
			case 41:
			{
				ret=__xml_validate();
				text+=rets+ret;
				break;
			}
			case 42:
			{
				ret=__xml_extensionActivity();
				text+=rets+ret;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final void __xml_extension() throws RecognitionException, TokenStreamException {
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(7);
			{
			
			String ns = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"namespace");
			BpelBoolean mUnderstand = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"mustUnderstand"));
			//
			String content="";
			
			
				/*
				 * lookup extension namespaces and change tagging in the namespace map.
				 * 
				 * Therefor, get the keySet and compare the namespaces.
				 * If their namespaces are equal, replace the 'namespace' tag with 'extension' and insert it to the tmp_map
				 * else: insert the 'real' namespace in the tmp_map
				 */
				Map tmp_map = new HashMap<String, String>();
				for (Object o : getNamespaceMap().keySet()) {
					String str_o = (String) o;
					String attr = getNamespaceMap().get(o).toString();
						
					if (ns.equals(attr.subSequence(2, attr.length()-2))) {//omit quotes in attr string
						
						//handle mustUnderstand annotation
						if (mUnderstand!=null) {
						  if(mUnderstand.equals(BpelBoolean.YES)) content="@mustUnderstand\n";
						  else content="@mustUnderstand no\n";
						}
						//prepare content
						content+="extension"+str_o.substring(9);
						
						tmp_map.put(content, attr); //substring(9) = omit 'namespace'
					} else { tmp_map.put(o, attr); }	
				}
				//reset namespace map
				__xml_namespaceMap = tmp_map;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
	}
	
	public final String  __xml_messageExchange(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(10);
			{
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
			
			if (ret!=null && !ret.isEmpty()) text+=ret+", ";
				text+=name;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_11);
		}
		return text;
	}
	
	public final String  __xml_partnerLink(
		String pl
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(12);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
				String plType = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLinkType");
				String mRole = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"myRole");
				String pRole = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerRole");
				BpelBoolean initPRole = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"initializePartnerRole"));
				//
				String attr="";
				String[] plSplit;
			
			switch ( LA(1)) {
			case OTHER_TAG:
			{
				otherTag();
				break;
			}
			case XML_END_TAG:
			{
				
					//separate previous PLs by a comma and newline
					if (pl!=null && !pl.isEmpty()) text+=pl+",\n "; 
					
					//handle attributes
					if (plType!=null) attr+=Helper.strip(plType);
					
					//handle the rest
					if (mRole!=null) attr+=", "+mRole; else attr+=", "+"null";
					if (pRole!=null) attr+=", "+pRole; else attr+=", "+"null";
					
					//handle initPRole annotation
					if (initPRole!=null) attr+=", "+Helper.cvBoolAttr("init", initPRole, false);
					
					text+=name+" = ("+attr+")";
				
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_12);
		}
		return text;
	}
	
	public final void otherTag() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(OTHER_TAG);
			{
			_loop6184:
			do {
				switch ( LA(1)) {
				case OTHER_TAG:
				{
					otherTag();
					break;
				}
				case PCDATA:
				{
					match(PCDATA);
					break;
				}
				default:
				{
					break _loop6184;
				}
				}
			} while (true);
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_13);
		}
	}
	
	public final String  __xml_variable(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(14);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
			String msgType = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageType");
			String type = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"type");
			String elt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"element");
			//
			String fr = "";
			String var = "";
			String with = "";
			
			{
			switch ( LA(1)) {
			case 58:
			{
				fr=__xml_fromParts();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			if (ret!=null && !ret.isEmpty()) text+=ret+", \n    ";
			
			// handle attributes
			var+=Helper.cvAttr("messageType", msgType, null, "\n    ");
			var+=Helper.cvAttr("type", type, null, "\n    ");
			var+=Helper.cvAttr("element", elt, null, "\n    ");
			
			// handle fromParts
			if (fr!=null && !fr.isEmpty()) with=" with ("+fr+")";
			
				text+=var+name+with;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return text;
	}
	
	public final String  __xml_fromParts() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(58);
			{
			
			String fr="";
			
			switch ( LA(1)) {
			case XML_END_TAG:
			case 60:
			{
				{
				_loop6137:
				do {
					if ((LA(1)==60)) {
						fr=__xml_from(fr);
					}
					else {
						break _loop6137;
					}
					
				} while (true);
				}
				break;
			}
			case 59:
			{
				fr=__xml_fromPart();
				
					text+=fr;
				
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return text;
	}
	
	public final String  __xml_correlationSet(
		String cors
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(16);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
			String prop = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"properties");
			
				
				if (cors!=null && !cors.isEmpty()) text+=cors+"\n            ";
				
				text+=name+"("+prop+");";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_16);
		}
		return text;
	}
	
	public final String  __xml_catch(
		String ca
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(52);
			{
			
			String fName = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultName");
			String fVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultVariable");
			String fMsgType = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultMessageType");
			String fElt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultElement");
			//
			String ac="";
			
			ac=activity(ac);
			
				if (ca!=null && !ca.isEmpty()) text+=ca+"\n";//handle previous catchs
			
			//handle attributes as annotations
			text+=Helper.cvAttr("faultMessageType", fMsgType);
			text+=Helper.cvAttr("faultElement", fElt);
			
			//handle content
			text+="catch ("+Helper.strip(fName)+") { |"+fVar+"|\n"+ac+"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_17);
		}
		return text;
	}
	
	public final String  __xml_catchAll() throws RecognitionException, TokenStreamException {
		String catcha="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(53);
			{
			String ac="";
			ac=activity(ac);
			
			catcha+="catchAll {\n"+ ac +"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_18);
		}
		return catcha;
	}
	
	public final String  __xml_onEvent(
		String oE
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(19);
			{
			
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String pt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"portType");
			String op = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"operation");
			//msgType OR elt
			String msgType = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageType"); String elt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"element");
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			String mex = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageExchange");
			//
			String cor=""; String sc=""; String fr =""; //rulevars
			String content=""; //for content handling
			String attr = ""; //for annotation handling
			
			{
			switch ( LA(1)) {
			case 50:
			{
				cor=__xml_correlations();
				break;
			}
			case 37:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 58:
			{
				fr=__xml_fromParts();
				break;
			}
			case 37:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			sc=__xml_scope(true);
			
			//prelude with newline if multiple onEvents 
				if (oE!=null && !oE.isEmpty()) text+=oE+"\n";
				
				//handle attributes as annotations
				attr+=Helper.cvAttr("portType", pt);  	  
				attr+=Helper.cvAttr("messageExchange", mex);
				if (msgType!=null) attr+=Helper.cvAttr("messageType", msgType);
				else if (elt!=null) attr+=Helper.cvAttr("element", elt);
				  	
				//optional variable
				if (var!=null) content+=var+" = ";
				
				//prepare content (mandatory partnerLink and operation)
				content+=pl;
				content+=", "+op;
				
				//optional correlation
				if (cor!=null && !cor.isEmpty()) content+=", "+cor;
				  	
				//put it all together
				text+="event ("+content+")";
				
				//handle optional fromPart
				if (fr!=null && !fr.isEmpty()) text+=" with ("+fr+")";
				
				//handle mandatory scope as scope_short without preluding keyword
				text+=sc;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_19);
		}
		return text;
	}
	
	public final String  __xml_onAlarm(
		String oA, Boolean scope
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(20);
			{
			
				String sc=""; String cond=""; String rE="";
				String alarm=""; String timeout="";  
			
			{
			switch ( LA(1)) {
			case 62:
			{
				alarm=__xml_for();
				break;
			}
			case 63:
			{
				timeout=__xml_until();
				break;
			}
			case 37:
			case 72:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 72:
			{
				rE=__xml_repeatEvery();
				break;
			}
			case 37:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			sc=__xml_scope(scope);
			
				if (oA!=null && !oA.isEmpty()) text+=oA+"\n";
				
				if (alarm!=null && !alarm.isEmpty()) text+="alarm (["+alarm+"])";
				else if (timeout!=null && !timeout.isEmpty()) text+="timeout (["+timeout+"])";
				
				if (rE!=null && !rE.isEmpty()) text+=rE+" ";
				text+=sc;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_20);
		}
		return text;
	}
	
	public final String  __xml_correlations() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(50);
			{
				String cor="";
			{
			int _cnt6116=0;
			_loop6116:
			do {
				if ((LA(1)==51)) {
					cor=__xml_correlation(cor);
				}
				else {
					if ( _cnt6116>=1 ) { break _loop6116; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6116++;
			} while (true);
			}
				
				text+="{"+cor+"}"; //list correlations
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_21);
		}
		return text;
	}
	
	public final String  __xml_scope(
		Boolean isShort
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(37);
			{
			
			BpelBoolean isolated = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"isolated"));
			BpelBoolean exitOnStdFault = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"exitOnStandardFault"));
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; String fh=""; String var=""; String pl=""; String mex=""; 
			String ac=""; String cor="";String ch="";String eh="";String th=""; String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 9:
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 44:
			case 47:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 11:
			{
				pl=__xml_partnerLinks();
				break;
			}
			case 9:
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 9:
			{
				mex=__xml_messageExchanges();
				break;
			}
			case 13:
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 13:
			{
				var=__xml_variables();
				break;
			}
			case 15:
			case 17:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 17:
			{
				fh=__xml_faultHandlers();
				break;
			}
			case 15:
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 15:
			{
				cor=__xml_correlationSets();
				break;
			}
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 54:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 54:
			{
				ch=__xml_compensationHandler();
				break;
			}
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 75:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 75:
			{
				th=__xml_terminationHandler();
				break;
			}
			case 18:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 18:
			{
				eh=__xml_eventHandlers();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			ac=activity(ac);
			
			//handle comment
			text+=doc;
			
			//handle attributes as annotations
				text+=Helper.cvBoolAttr("isolated", isolated);
				text+=Helper.cvBoolAttr("exitOnStandardFault", exitOnStdFault);
				text+=Helper.cvBoolAttr("suppressJoinFailure", supprJF);
				
				//if isShort, provide an embedded scope without preluding keyword
				if (!isShort) text+="scope";
				
				//handle scope name/id
				if (name!=null && !name.isEmpty()) text+=" ("+name+")";
				
				//put '{' newline only without std_elts 
				if (!ac.substring(1,2).contains("@"))
				text+=" {\n";
				
				//if faultHandler present, use try stmt
				if (fh!=null && !fh.isEmpty()) text+="try {\n";
					
				//handle content
				text+=pl+var+cor+mex+ac;
				
				//if faultHandler present, close try stmt
				if (fh!=null && !fh.isEmpty()) text+="} "+fh;
				
				//handle content
				text+="} "+ch+th+eh;
				
				//handle std_elts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_for() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  durationExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(62);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			durationExpr = LT(1);
			match(PCDATA);
			
			text+=durationExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_22);
		}
		return text;
	}
	
	public final String  __xml_until() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  deadlineExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(63);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			deadlineExpr = LT(1);
			match(PCDATA);
			
			text+=deadlineExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_22);
		}
		return text;
	}
	
	public final String  __xml_repeatEvery() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  durationExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(72);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage"); //not supported by BPElscript
			
			durationExpr = LT(1);
			match(PCDATA);
			
			text+=durationExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_23);
		}
		return text;
	}
	
	public final String  __xml_receive() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(21);
			{
			
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String pt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"portType");
			String op = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"operation");
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			BpelBoolean ci = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"createInstance"));
			String mex = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageExchange");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean dpe = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=null; String ret=""; String cors="";;String content="";String fr="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			case 50:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 50:
			{
				cors=__xml_correlations();
				break;
			}
			case XML_END_TAG:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 58:
			{
				fr=__xml_fromParts();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
				
				//handle comment
				text+=doc;
				
				//handle attributes as annotations
				text+=Helper.cvAttr("portType", pt);
				text+=Helper.cvBoolAttr("createInstance", ci);
				text+=Helper.cvAttr("messageExchange", mex);
				text+=Helper.cvStdAttr(name, dpe);
			
			//handle optional variable
				if (var!=null) text+=var+" = ";
				
				//handle mandatory content and optional correlation
				content+=pl+", "+op;
				if (cors!=null && !cors.isEmpty()) content+=", "+cors;
				text+="receive("+content+")";
				
				//handle fromParts
				if (fr!=null && !fr.isEmpty()) text+="with ("+fr+")";
				
				text+=";\n";//close with semicolon
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_reply() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(22);
			{
			
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String pt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"portType");
			String op = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"operation");
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			String fault = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultName");
			String mex = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageExchange");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String content=""; String se=""; String cor=null; String to="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			case 50:
			case 55:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 50:
			{
				cor=__xml_correlations();
				break;
			}
			case XML_END_TAG:
			case 55:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 55:
			{
				to=__xml_toParts();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			//handle doc
			text+=doc;
			
			//handle attributes as annotations
				text+=Helper.cvAttr("portType", pt);
			text+=Helper.cvAttr("faultName", fault);
			text+=Helper.cvAttr("messageExchange", mex);
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle optional variable
				if (var!=null) op+=", "+var;
				
				//handle mandatory content and optional correlation
				content+=pl+", "+op;
				if (cor!=null && !cor.isEmpty()) content+=", "+cor;
				text+="reply("+content+")";
				
				//handle toParts
				if (to!=null && !to.isEmpty()) text+="with ("+to+")";
				
				text+=";\n";//close with semicolon
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_invoke() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(23);
			{
			
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String pt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"portType");
			String op = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"operation");
			String inVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"inputVariable");
			String outVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"outputVariable");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; String content=""; String cor=""; String ca="";String cc="";
			String fr=""; String ch=""; String to=""; String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			case 50:
			case 52:
			case 53:
			case 54:
			case 55:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 50:
			{
				cor=__xml_correlations();
				break;
			}
			case XML_END_TAG:
			case 52:
			case 53:
			case 54:
			case 55:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop6004:
			do {
				if ((LA(1)==52)) {
					cc=__xml_catch(ca);
				}
				else {
					break _loop6004;
				}
				
			} while (true);
			}
			{
			switch ( LA(1)) {
			case 53:
			{
				ca=__xml_catchAll();
				break;
			}
			case XML_END_TAG:
			case 54:
			case 55:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 54:
			{
				ch=__xml_compensationHandler();
				break;
			}
			case XML_END_TAG:
			case 55:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 55:
			{
				to=__xml_toParts();
				break;
			}
			case XML_END_TAG:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 58:
			{
				fr=__xml_fromParts();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			//if catchs are present enclose with a try statement
			if (cc!=null && !cc.isEmpty() || ca!=null && !ca.isEmpty()) {
			text+="try {\n";
			}
			
			//handle comment
			text+=doc;
			
			//handle attributes as annotations
				text+=Helper.cvAttr("portType", pt);
				text+=Helper.cvStdAttr(name, supprJF);
			
			//handle outVar
			if (outVar!=null) text+=outVar+" = ";
			
			//handle mandatory content and optional correlation
				content+=pl+", "+op;
				if (inVar!=null && !inVar.isEmpty()) content+=", "+inVar;
				if (cor!=null && !cor.isEmpty()) content+=", "+cor;  
			text+="invoke("+content+")";
			
			//handle toParts + fromParts
				if (to!=null || fr!=null) text+=fr+to;
				
				//handle compensation
				text+=ch;
				
				text+=";\n";//close with semicolon
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
				
				//if catchs are present enclose with a try statement (here: closing curly bracket)
			if (cc!=null && !cc.isEmpty() || ca!=null && !ca.isEmpty()) {
			text+="}\n";
			
			//provide the catch statements
			if (cc!=null && !cc.isEmpty()) text+=cc+"\n";
			if (ca!=null && !ca.isEmpty()) text+=ca+"\n";
			}
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_assign() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(24);
			{
			
			BpelBoolean val = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"validate"));
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";String copy=""; String eAOp ="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 44:
			case 47:
			case 61:
			case 64:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			int _cnt6013=0;
			_loop6013:
			do {
				switch ( LA(1)) {
				case 64:
				{
					//handle attributes of multiple copy/eAOp
						 if (copy!=null && !copy.isEmpty()) copy+=Helper.cvBoolAttr("validate", val)+Helper.cvStdAttr(name, supprJF);
						 if (eAOp!=null && !eAOp.isEmpty()) eAOp+=Helper.cvBoolAttr("validate", val)+Helper.cvStdAttr(name, supprJF);
						
					copy=__xml_copy(copy);
					break;
				}
				case 61:
				{
					eAOp=__xml_extensionAssignOperation(eAOp);
					break;
				}
				default:
				{
					if ( _cnt6013>=1 ) { break _loop6013; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				}
				_cnt6013++;
			} while (true);
			}
			
			//handle comments
			text+=doc;
			
			//handle attributes
			text+=Helper.cvBoolAttr("validate", val);
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
			if(copy!=null && !copy.isEmpty()) text+=copy;
			if(eAOp!=null && !eAOp.isEmpty()) text+=eAOp;
			
			if (!text.contains(";")) text+=";\n";//close with semicolon if not present
			
			//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_throw() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(25);
			{
			
			String fault = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultName");
			String faultVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"faultVariable");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; //standard elements
			String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle comment
			text+=doc;
			
			//handle attributes
			text+=Helper.cvAttr("faultVariable", faultVar);
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
			text+="throw ("+fault+")";
			
			text+=";\n";//close with semicolon
			
			//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_exit() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(26);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle comment
			text+=doc;
			
			//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
				text+="exit;\n";
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_wait() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(27);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se=""; String cond="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 44:
			case 47:
			case 62:
			case 63:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 62:
			{
				cond=__xml_for();
				break;
			}
			case 63:
			{
				cond=__xml_until();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
				text+=cond;
				
				text+=";\n";//close with semicolon
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_empty() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(28);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
				text+="nop;\n";
				
				//handle stdElts
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_sequence() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(29);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se=""; String ac="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			int _cnt6031=0;
			_loop6031:
			do {
				if ((_tokenSet_8.member(LA(1)))) {
					ac=activity(ac);
				}
				else {
					if ( _cnt6031>=1 ) { break _loop6031; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6031++;
			} while (true);
			}
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle stdElts (block structured)
				text=Helper.cvStdElt(se, text, false);
			
			//handle content
				text+=ac;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_if() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(30);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se=""; String ac=""; String expr=""; String elsi=""; String els=""; String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 44:
			case 47:
			case 65:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			expr=__xml_condition();
			ac=activity(ac);
			{
			_loop6036:
			do {
				if ((LA(1)==66)) {
					elsi=__xml_elseif(elsi);
				}
				else {
					break _loop6036;
				}
				
			} while (true);
			}
			{
			switch ( LA(1)) {
			case 67:
			{
				els=__xml_else();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
				
				//handle content
				text+="if ("+expr+")";
				
				//put '{' newline only without std_elts 
				if (!ac.substring(1,2).contains("@"))
				text+=" {\n";
				
				text+=ac+"} "; //introduction
				
				if (elsi!=null && !elsi.isEmpty()) {//handle else if
					text+=elsi + els;
				} else {//handle else
					text+=els;
				}
				
				//handle stdElts (block structured)
				text=Helper.cvStdElt(se, text, true);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_while() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(31);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se=""; String ac=""; String cond="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 44:
			case 47:
			case 65:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			cond=__xml_condition();
			ac=activity(ac);
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle stdElts (block structured)
				text=Helper.cvStdElt(se, text, false);
				
				text+="while ("+ cond +") {\n"+ ac +"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_repeatUntil() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(32);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
				//
			String se=""; String ac=""; String cond="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			ac=activity(ac);
			cond=__xml_condition();
			
			//handle comment
			text+=doc;
			
				//handle attributes
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle stdElts (block structured)
				text=Helper.cvStdElt(se, text, false);
				
				text+="repeat {\n"+ ac +"} until ("+ cond +")\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_forEach() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(33);
			{
			
			String cntName = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"counterName");
			BpelBoolean parallel = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"parallel"));
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; String sc=""; String sCount=""; String fCount=""; String[] cC=null; String content="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 44:
			case 47:
			case 68:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			sCount=__xml_startCounterValue();
			fCount=__xml_finalCounterValue();
			{
			switch ( LA(1)) {
			case 70:
			{
				cC=__xml_completionCondition();
				break;
			}
			case 37:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			sc=__xml_scope(true);
			
			//handle comment
			text+=doc;
			
			//handle attributes
			text+=Helper.cvBoolAttr("parallel", parallel);
			
			//handle content
			content+=cntName+"="+sCount+"; "+fCount;
			if (cC!=null && !cC[1].isEmpty()) {
			content+="; "+cC[1]; //set completionCondition content (stored in [0])
			text+=cC[0]; //set successfulBranchesOnly annotation (stored in [1])
			} 
			
			//handle standard attributes (after SBO)
			text+=Helper.cvStdAttr(name, supprJF);
			
			text+="for ("+content+")";
			
			//handle stdElts (block structured)
				text=Helper.cvStdElt(se, text, false);
			
			//handle scope
			text+=sc;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_pick() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(34);
			{
			
			BpelBoolean crtInst = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"createInstance"));
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean dpe = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se=""; String onM=""; String oA="";
			String ci="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 35:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			int _cnt6052=0;
			_loop6052:
			do {
				if ((LA(1)==35)) {
					onM=__xml_onMessage(onM);
				}
				else {
					if ( _cnt6052>=1 ) { break _loop6052; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6052++;
			} while (true);
			}
			{
			_loop6054:
			do {
				if ((LA(1)==20)) {
					oA=__xml_onAlarm(oA, true);
				}
				else {
					break _loop6054;
				}
				
			} while (true);
			}
			
			//handle comment
			text+=doc;
			
			//handle attributes
			text+=Helper.cvBoolAttr("createInstance", crtInst);
			text+=Helper.cvStdAttr(name, dpe);
			
			//handle content    
			text+="pick {\n"+ onM +"\n"+ oA +"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_flow() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(36);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String content="";
			String se="";String doc="";
			String act="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 44:
			case 47:
			case 73:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 73:
			{
				__xml_links();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt6064=0;
			_loop6064:
			do {
				if ((_tokenSet_8.member(LA(1)))) {
					if (!act.isEmpty()) act+="} and {\n";
					act=activity(act);
				}
				else {
					if ( _cnt6064>=1 ) { break _loop6064; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6064++;
			} while (true);
			}
			
			//handle comment
			text+=doc;
			
			//handle attributes as annotations
			text+=Helper.cvStdAttr(name, supprJF);
			
			text+="parallel";
			
			//handle standard elements if present
			text=Helper.cvStdElt(se, text, false);
			
			//handle content
			text+=" {\n"+act+"\n}";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_compensate() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(38);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle comment
			text+=doc;
			
				//handle attributes as annotations
				text+=Helper.cvStdAttr(name, supprJF);
			
				//handle content
				text+="compensate;\n";
				
				//handle standard element
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_compensateScope() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(39);
			{
			
			String target = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"target");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";
			
			se=std_elts();
			
			//handle attributes as annotations
				text+=Helper.cvStdAttr(name, supprJF);
			
				//handle content
				text+="compensate ("+ target +");\n";
				
				//handle standard element
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_rethrow() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(40);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle doc
			text+=doc;
			
				//handle attributes as annotations
				text+=Helper.cvStdAttr(name, supprJF);
				
				//handle content
				text+="rethrow;\n";
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_validate() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(41);
			{
			
			String vars = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variables");
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case XML_END_TAG:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			
			//handle doc
			text+=doc;
			
			//handle attributes as annotations
			text+=Helper.cvStdAttr(name, supprJF);
			
			//handle content
			text+="validate "+vars+";";
			
			//handle standard elements
			text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_extensionActivity() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		Token  ExtAct = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(42);
			{
			
				String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name"); BpelBoolean supprJF = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"suppressJoinFailure")); //standard attributes
			//
			String se="";
			String tg=""; String sc=""; String doc="";
			
			{
			switch ( LA(1)) {
			case 78:
			{
				doc=__xml_documentation();
				break;
			}
			case PCDATA:
			case 44:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			se=std_elts();
			{
			switch ( LA(1)) {
			case 44:
			{
				tg=__xml_targets();
				break;
			}
			case PCDATA:
			case 47:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 47:
			{
				sc=__xml_sources();
				break;
			}
			case PCDATA:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			ExtAct = LT(1);
			match(PCDATA);
			
			//handle comment
			text+=doc;
			
				//handle attributes as annotations
				text+=Helper.cvStdAttr(name, supprJF);
				
				//handle content
				text+="{{{\n"+ExtAct.getText().trim()+"\n}}}\n";
				
				//handle standard elements
				text=Helper.cvStdElt(se, text);
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return text;
	}
	
	public final String  __xml_documentation() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  docValue = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(78);
			{
			docValue = LT(1);
			match(PCDATA);
			
				text+=Helper.parseComment(docValue.getText());
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_24);
		}
		return text;
	}
	
	public final String  std_elts() throws RecognitionException, TokenStreamException {
		String text="";
		
		String tg=""; String sc="";
		
		try {      // for error handling
			{
			if ((LA(1)==44)) {
				tg=__xml_targets();
			}
			else if ((_tokenSet_24.member(LA(1)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			{
			if ((LA(1)==47)) {
				sc=__xml_sources();
			}
			else if ((_tokenSet_24.member(LA(1)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			
				text=tg+sc; //list targets and sources
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_24);
		}
		return text;
	}
	
	public final String  __xml_toParts() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(55);
			{
			
			String to="";
			
			switch ( LA(1)) {
			case XML_END_TAG:
			case 57:
			{
				{
				_loop6128:
				do {
					if ((LA(1)==57)) {
						to=__xml_to(to);
					}
					else {
						break _loop6128;
					}
					
				} while (true);
				}
				break;
			}
			case 56:
			{
				to=__xml_toPart();
				
					text+=to;
				
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_25);
		}
		return text;
	}
	
	public final String  __xml_compensationHandler() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(54);
			{
			
				String ac="";
			
			ac=activity(ac);
			
				text+="compensation {\n"+ac+"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_26);
		}
		return text;
	}
	
	public final String  __xml_copy(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(64);
			{
			
			BpelBoolean keepSrcElt = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"keepSrcElementName"));
			BpelBoolean ignMissingData = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"ignoreMissingFromData"));
			//
			String from="";String to="";
			
			from=__xml_from("");
			to=__xml_to("");
			
			//handle previous copies
			text+=ret;
			
			//handle attributes as annotations
			text+=Helper.cvBoolAttr("keepSrcElementName", keepSrcElt);
			text+=Helper.cvBoolAttr("ignoreMissingFromData", ignMissingData);
			
			//handle content
			text+=to+" = "+from+";\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_27);
		}
		return text;
	}
	
	public final String  __xml_extensionAssignOperation(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  assignElementOfOtherNamespace = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(61);
			{
			assignElementOfOtherNamespace = LT(1);
			match(PCDATA);
			
			//handle previous eAOps
			text+=ret;
			
			text+="{{{\n"+assignElementOfOtherNamespace.getText().trim()+"}}}";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_27);
		}
		return text;
	}
	
	public final String  __xml_condition() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		Token  boolExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(65);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			boolExpr = LT(1);
			match(PCDATA);
				
				text+=Helper.strip(boolExpr.getText().trim());
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return text;
	}
	
	public final String  __xml_elseif(
		String els
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(66);
			{
			
				String ac=""; String expr="";
			
			expr=__xml_condition();
			ac=activity(ac);
			
				if (els!=null && !els.isEmpty()) text+=els+" "; //handle previous else ifs
				
				//handle content 
				text+="elseif ("+expr+")";
				
				//put '{' newline only without std_elts 
				if (!ac.substring(1,2).contains("@"))
				text+=" {\n";
				
				text+=ac+"}";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_28);
		}
		return text;
	}
	
	public final String  __xml_else() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(67);
			{
			
				String ac="";
			
			ac=activity(ac);
			
				text+=" else";
				
				//put '{' newline only without std_elts 
				if (!ac.substring(1,2).contains("@"))
				text+=" {\n";
				text+=ac+"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String  __xml_startCounterValue() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		Token  intExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(68);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			intExpr = LT(1);
			match(PCDATA);
			
			text+=intExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_29);
		}
		return text;
	}
	
	public final String  __xml_finalCounterValue() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		Token  intExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(69);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			intExpr = LT(1);
			match(PCDATA);
			
			text+=intExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_30);
		}
		return text;
	}
	
	public final String[]  __xml_completionCondition() throws RecognitionException, TokenStreamException {
		String[] text={"",""};
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(70);
			{
			String[] br={"",""};
			{
			switch ( LA(1)) {
			case 71:
			{
				br=__xml_branches();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
				text=br;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_23);
		}
		return text;
	}
	
	public final String  __xml_onMessage(
		String oM
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(35);
			{
			
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String pt = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"portType");
			String op = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"operation");
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			String mex = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"messageExchange");
			//
				String ac=""; String cor="";String fr="";String attr="";
				String content="";
			
			{
			switch ( LA(1)) {
			case 50:
			{
				cor=__xml_correlations();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 58:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case 58:
			{
				fr=__xml_fromParts();
				break;
			}
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			ac=activity(ac);
			
				if (oM!=null && !oM.isEmpty()) text+=oM+"\n"; //handle previos artefacts
			
			//handle attributes as annotations
				text+=Helper.cvAttr("portType", pt);
				text+=Helper.cvAttr("messageExchange", mex);
			
				//handle content part
				content=pl+", "+op;
				if (cor!=null && !cor.isEmpty()) content+=", "+cor;
				text+="onMessage ("+content+")";
				   	  	
				//handle activity
				text+=" {\n";
				//var+fromPart andling via param block
				if (var!=null && !var.isEmpty()) text+="|"+var+"|\n";
				if (fr!=null && !fr.isEmpty()) text+="|"+fr+"|\n";
				
				text+=ac+"\n}";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_31);
		}
		return text;
	}
	
	public final void __xml_links() throws RecognitionException, TokenStreamException {
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(73);
			{
			{
			int _cnt6171=0;
			_loop6171:
			do {
				if ((LA(1)==74)) {
					__xml_link();
				}
				else {
					if ( _cnt6171>=1 ) { break _loop6171; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6171++;
			} while (true);
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
	}
	
	public final String  __xml_terminationHandler() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(75);
			{
			
				String ac="";
			
			ac=activity(ac);
			
			text+="onTermination {\n"+ac+"}\n";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_32);
		}
		return text;
	}
	
	public final String  __xml_targets() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(44);
			{
			
			String jc=""; String tg="";
			
			{
			switch ( LA(1)) {
			case 45:
			{
				jc=__xml_joinCondition();
				break;
			}
			case 46:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			int _cnt6099=0;
			_loop6099:
			do {
				if ((LA(1)==46)) {
					tg=__xml_target(tg);
				}
				else {
					if ( _cnt6099>=1 ) { break _loop6099; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6099++;
			} while (true);
			}
			
			text+="join("+tg+jc+");"; //list optional joinCondition and list of targets
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_24);
		}
		return text;
	}
	
	public final String  __xml_sources() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(47);
			{
			String sc="";
			{
			int _cnt6107=0;
			_loop6107:
			do {
				if ((LA(1)==48)) {
					sc=__xml_source(sc);
				}
				else {
					if ( _cnt6107>=1 ) { break _loop6107; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt6107++;
			} while (true);
			}
			text+=sc;
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_24);
		}
		return text;
	}
	
	public final String  __xml_joinCondition() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  boolExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(45);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			boolExpr = LT(1);
			match(PCDATA);
			
				text+=", ["+boolExpr.getText().trim()+"]"; //convert PCDATA
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_33);
		}
		return text;
	}
	
	public final String  __xml_target(
		String tgs
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(46);
			{
			
			String ln = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"linkName");
			
			
			if (tgs!=null && !tgs.isEmpty()) text+=tgs+", "; //handle list of targets
			
			//handle content
			text+=ln;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_34);
		}
		return text;
	}
	
	public final String  __xml_source(
		String scs
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(48);
			{
			
			String ln = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"linkName");
			//
			String tc="";
			
			{
			switch ( LA(1)) {
			case 49:
			{
				tc=__xml_transitionCondition();
				break;
			}
			case XML_END_TAG:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
			text+=scs+"signal("+ln;
			
			if (tc!=null && !tc.isEmpty()) text+=", "+tc;
			
			text+=");";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_35);
		}
		return text;
	}
	
	public final String  __xml_transitionCondition() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  boolExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(49);
			{
			
			String exprLG = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			
			boolExpr = LT(1);
			match(PCDATA);
			
				text+="["+boolExpr.getText().trim()+"]"; //convert PCDATA
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String  __xml_correlation(
		String cor
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(51);
			{
			
			String set = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"set");
			JoinBool init = JoinBool.toJoinBool(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"initiate"));
			JoinPattern pattern = JoinPattern.toJoinPattern(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"pattern"));
			
			
				if (cor!=null && !cor.isEmpty()) text+=", "+cor; //handle list of correlations
				
				//handle attributes as prefix
				text+=Helper.cvCorrAttr(init, pattern);
				
				//handle content
				text+=set;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_36);
		}
		return text;
	}
	
	public final String  __xml_to(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  expr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(57);
			{
			
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			String part = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"part"); //
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink"); //
			String prop = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"property"); //
				String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");
				//
				String optPart=""; String q="";
			
			switch ( LA(1)) {
			case XML_END_TAG:
			case 76:
			{
				{
				switch ( LA(1)) {
				case 76:
				{
					q=__xml_query();
					break;
				}
				case XML_END_TAG:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				
					if (part!=null && !part.isEmpty()) optPart="."+part;
					if (prop!=null && !prop.isEmpty()) optPart="."+prop+" @property";
					text+=var+optPart;
				
				break;
			}
			case PCDATA:
			{
				expr = LT(1);
				match(PCDATA);
				
					text+=expr.getText().trim();
				
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_37);
		}
		return text;
	}
	
	public final String  __xml_toPart() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(56);
			{
			
			String part = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"part");
			String frVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"fromVariable");
			
			
				text=frVar+" : out "+part;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String  __xml_query() throws RecognitionException, TokenStreamException {
		String text="";;
		
		Token  __xml_startTag = null;
		Token  queryContent = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(76);
			{
			
			String qLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"queryLanguage"); //not supported by BPELscript
			
			queryContent = LT(1);
			match(PCDATA);
			
			text+=queryContent.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String  __xml_from(
		String ret
	) throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  expr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(60);
			{
			
			String var = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"variable");
			String part = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"part"); //
			String pl = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"partnerLink");
			String epRef = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"endpointReference"); //
			String prop = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"property"); //+var
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");
			//
			String lit=""; String q="";String optPart="";
			
			switch ( LA(1)) {
			case PCDATA:
			{
				expr = LT(1);
				match(PCDATA);
				text+="["+expr.getText().trim()+"]";
				break;
			}
			case 77:
			{
				lit=__xml_literal();
				text+=lit;
				break;
			}
			default:
				if ((LA(1)==XML_END_TAG||LA(1)==76)) {
					{
					switch ( LA(1)) {
					case 76:
					{
						q=__xml_query();
						break;
					}
					case XML_END_TAG:
					{
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					
						if (part!=null && !part.isEmpty()) optPart="."+part;
						if (prop!=null && !prop.isEmpty()) optPart="."+Helper.strip(prop)+" @property";
						
						text+=q+var+optPart;
						
						
				}
				else if ((LA(1)==XML_END_TAG)) {
					
					// handle variable variant
					if (var!=null && prop!=null) {
						if (ret!=null && !ret.isEmpty()) text+=ret+",\n      ";
						text+=var+" : in "+prop;
					}
					
					// handle partnerlink variant 
					if (pl!=null && epRef!=null) text+=pl+"."+epRef;
					
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_38);
		}
		return text;
	}
	
	public final String  __xml_fromPart() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(59);
			{
			
			String part = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"part");
			String toVar = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"toVariable");
			
			
				text=toVar+" : in "+part;
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String  __xml_literal() throws RecognitionException, TokenStreamException {
		String text="";
		
		Token  __xml_startTag = null;
		Token  literalValue = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(77);
			{
			literalValue = LT(1);
			match(PCDATA);
			
				text+="\""+literalValue.getText().trim()+"\"";
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final String[]  __xml_branches() throws RecognitionException, TokenStreamException {
		String[] text={"",""};;
		
		Token  __xml_startTag = null;
		Token  intExpr = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(71);
			{
			
			String exprLg = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"expressionLanguage");//not supported by BPELscript
			BpelBoolean successfulOnly = BpelBoolean.toBpelBoolean(((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"successfulBranchesOnly"));
			
			intExpr = LT(1);
			match(PCDATA);
			
			//handle attribute as annotation
			text[0]=Helper.cvBoolAttr("successfulBranchesOnly", successfulOnly);
			
			//handle content
			text[1]=intExpr.getText().trim();
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return text;
	}
	
	public final void __xml_link() throws RecognitionException, TokenStreamException {
		
		Token  __xml_startTag = null;
		
		try {      // for error handling
			__xml_startTag = LT(1);
			match(74);
			{
			
			String name = ((XMLToken)__xml_startTag).getAttribute(resolveNamespace(""),"name");
			
			}
			match(XML_END_TAG);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_39);
		}
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"<process>\"",
		"XML_END_TAG",
		"\"<extensions>\"",
		"\"<extension>\"",
		"\"<import>\"",
		"\"<messageExchanges>\"",
		"\"<messageExchange>\"",
		"\"<partnerLinks>\"",
		"\"<partnerLink>\"",
		"\"<variables>\"",
		"\"<variable>\"",
		"\"<correlationSets>\"",
		"\"<correlationSet>\"",
		"\"<faultHandlers>\"",
		"\"<eventHandlers>\"",
		"\"<onEvent>\"",
		"\"<onAlarm>\"",
		"\"<receive>\"",
		"\"<reply>\"",
		"\"<invoke>\"",
		"\"<assign>\"",
		"\"<throw>\"",
		"\"<exit>\"",
		"\"<wait>\"",
		"\"<empty>\"",
		"\"<sequence>\"",
		"\"<if>\"",
		"\"<while>\"",
		"\"<repeatUntil>\"",
		"\"<forEach>\"",
		"\"<pick>\"",
		"\"<onMessage>\"",
		"\"<flow>\"",
		"\"<scope>\"",
		"\"<compensate>\"",
		"\"<compensateScope>\"",
		"\"<rethrow>\"",
		"\"<validate>\"",
		"\"<extensionActivity>\"",
		"PCDATA",
		"\"<targets>\"",
		"\"<joinCondition>\"",
		"\"<target>\"",
		"\"<sources>\"",
		"\"<source>\"",
		"\"<transitionCondition>\"",
		"\"<correlations>\"",
		"\"<correlation>\"",
		"\"<catch>\"",
		"\"<catchAll>\"",
		"\"<compensationHandler>\"",
		"\"<toParts>\"",
		"\"<toPart>\"",
		"\"<to>\"",
		"\"<fromParts>\"",
		"\"<fromPart>\"",
		"\"<from>\"",
		"\"<extensionAssignOperation>\"",
		"\"<for>\"",
		"\"<until>\"",
		"\"<copy>\"",
		"\"<condition>\"",
		"\"<elseif>\"",
		"\"<else>\"",
		"\"<startCounterValue>\"",
		"\"<finalCounterValue>\"",
		"\"<completionCondition>\"",
		"\"<branches>\"",
		"\"<repeatEvery>\"",
		"\"<links>\"",
		"\"<link>\"",
		"\"<terminationHandler>\"",
		"\"<query>\"",
		"\"<literal>\"",
		"\"<documentation>\"",
		"OTHER_TAG"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 32L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 8761731623680L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 18023160241104896L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 18023160241103360L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 18023160241094656L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 18023160241061888L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 18023160240963584L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 8761731186688L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 8761731186720L, 14L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 160L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 1056L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 4128L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 8796093022240L, 32768L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 16416L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 8761731186720L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 65568L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 355784370562269216L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 342273571680157728L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 1572896L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { 1048608L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { 355793132293455904L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = { 137438953504L, 256L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = { 137438953472L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = { -1948756816885798368L, 2579L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	private static final long[] mk_tokenSet_25() {
		long[] data = { 288230376151711776L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_25 = new BitSet(mk_tokenSet_25());
	private static final long[] mk_tokenSet_26() {
		long[] data = { 324267934902124576L, 2048L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_26 = new BitSet(mk_tokenSet_26());
	private static final long[] mk_tokenSet_27() {
		long[] data = { 2305843009213693984L, 1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_27 = new BitSet(mk_tokenSet_27());
	private static final long[] mk_tokenSet_28() {
		long[] data = { 32L, 12L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_28 = new BitSet(mk_tokenSet_28());
	private static final long[] mk_tokenSet_29() {
		long[] data = { 0L, 32L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_29 = new BitSet(mk_tokenSet_29());
	private static final long[] mk_tokenSet_30() {
		long[] data = { 137438953472L, 64L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_30 = new BitSet(mk_tokenSet_30());
	private static final long[] mk_tokenSet_31() {
		long[] data = { 34360786976L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_31 = new BitSet(mk_tokenSet_31());
	private static final long[] mk_tokenSet_32() {
		long[] data = { 8761731448832L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_32 = new BitSet(mk_tokenSet_32());
	private static final long[] mk_tokenSet_33() {
		long[] data = { 70368744177664L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_33 = new BitSet(mk_tokenSet_33());
	private static final long[] mk_tokenSet_34() {
		long[] data = { 70368744177696L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_34 = new BitSet(mk_tokenSet_34());
	private static final long[] mk_tokenSet_35() {
		long[] data = { 281474976710688L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_35 = new BitSet(mk_tokenSet_35());
	private static final long[] mk_tokenSet_36() {
		long[] data = { 2251799813685280L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_36 = new BitSet(mk_tokenSet_36());
	private static final long[] mk_tokenSet_37() {
		long[] data = { 144115188075855904L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_37 = new BitSet(mk_tokenSet_37());
	private static final long[] mk_tokenSet_38() {
		long[] data = { 1297036692682702880L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_38 = new BitSet(mk_tokenSet_38());
	private static final long[] mk_tokenSet_39() {
		long[] data = { 32L, 1024L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_39 = new BitSet(mk_tokenSet_39());
	
	}
