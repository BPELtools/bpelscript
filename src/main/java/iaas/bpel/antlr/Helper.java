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

/**
 * @author bischomc
 * @category auxiliar functions
 * @see antxr grammar
 * 
 * This file contains several auxiliary functions used by the antxr grammar.
 * Thus the grammar is kept clear by reusing similar functionalities. 
 */
package iaas.bpel.antlr;

import java.util.List;


public class Helper {

	/**
	 * converts a BpelBoolean to a Bpelscript boolean annotation followed by a newline
	 * 
	 * provides a shortcut for the "newline" parameter of cvBoolAttr
	 * 
	 * @param fullname, the name of the Bpelscript boolean annotation
	 * @param value, the BpelBoolean to convert
	 * @param newline, indicates whether to post a newline after the annotation or not
	 * @return converted boolean attribute
	 */
	public static String cvBoolAttr(String fullname, BpelBoolean value) {
		return cvBoolAttr(fullname, value, true);
	}
	
	/**
	 * converts a BpelBoolean to a Bpelscript boolean annotation
	 * 
	 * 1) For a given not null value generate "@fullname"-string.
	 * 2) If "value" is a "NO"-value then append " no".
	 * 3) If "newline" is true, append a newline.  
	 * 
	 * @param fullname, the name of the Bpelscript boolean annotation
	 * @param value, the BpelBoolean to convert
	 * @param newline, indicates whether to post a newline after the annotation or not
	 * @return converted boolean attribute
	 */
	public static String cvBoolAttr(String fullname, BpelBoolean value, Boolean newline) {
		
		String attr="";
		
		//handle 'fullname' annotation
		if (value!=null) {
			attr+="@"+fullname;
			if(value.equals(BpelBoolean.NO)) attr+=" no";
		  		  
			if (newline) attr+="\n";
		}
		
		return attr;
	}
	
	/**
	 * duplicates single ":" if present
	 * 
	 * For a QName which contains a single ":" but not "::" or "://" duplicate the single ":".
	 * This is done by splitting the QName at the ":" and rearrange it
	 * 
	 * @param QName, the QName to strip
	 * @return the stripped QName
	 */
	public static String strip(String QName) {
	String retval = null;
	String plSplit[];
	
	//duplicate single : if present
	 if (!QName.contains("::") && QName.contains(":") && !QName.contains("://")) {
	   plSplit=QName.split(":");
	   
	   //forall ":"s duplicate them
	   for(int i = 0; i+1<plSplit.length; i++) {
		   //initialize step
		   if (i==0) retval=plSplit[i];
		   //append "::" and next item
		   retval+="::"+plSplit[i+1];
	   }
	 } else {retval=QName;}
	 
	 return retval;
	}
	
	/**
	 * converts Bpel-Attributes to Bpelscript annotations
	 * 
	 * provides a shortcut for cvAttr using newline=true and lineend=null
	 * 
	 * @param fullname, the name of the annotation
	 * @param value, the BpelBoolean to convert
	 * @return converted attribute
	 */
	public static String cvAttr(String fullname, String value) {
		return cvAttr(fullname, value, true, null);
	}
	
	/**
	 * converts Bpel-Attributes to Bpelscript annotations
	 * 
	 * provides a shortcut for cvAttr using newline=null
	 * 
	 * @param fullname, the name of the annotation
	 * @param value, the BpelBoolean to convert
	 * @param newline, indicates whether to post a newline after the annotation or not
	 * @return converted attribute
	 */
	public static String cvAttr(String fullname, String value, String newline) {
		return cvAttr(fullname, value, null, newline);
	}

	/**
	 * converts Bpel-Attributes to Bpelscript annotations
	 * 
	 * For a given not null value generate a Bpelscript annotation using the "fullname" and the stripped "value"
	 * If "newline" is not null and true, the attribute is closed by a newline.
	 * If "lineend" is not null, the attribute is closed by "lineend". 
	 * 
	 * @param fullname, the name of the annotation
	 * @param value, the BpelBoolean to convert
	 * @param newline, indicates whether to post a newline after the annotation or not
	 * @param lineend, the string to append at last (e.g. a ";")
	 * @return converted attribute
	 */
	public static String cvAttr(String fullname, String value, Boolean newline, String lineend) {
		
		String attr="";
		
		//handle 'fullname' annotation
		if (value!=null) {
			attr+="@"+fullname+" \""+strip(value)+"\" ";
			
			if (newline!=null && newline) attr+="\n";
			
			if (lineend!=null) attr+=lineend;
		}
		
		return attr;
	}
	
	/**
	 * converts Bpels standard attributes to Bpelscript annotations (i.e. "name" and "suppressJoinFailure")
	 * 
	 * construct standard attribute annotation by using 
	 * a) "cvAttr" for the name
	 * b) "cvBoolAttr" for the suppressJoinFailure
	 * 
	 * @param name, the standard attribute name
	 * @param dpe, the standard attribute suppressJoinFailure
	 * @return converted attribute
	 */
	public static String cvStdAttr(String name, BpelBoolean dpe) {
	
	String attr="";
	
	//handle standard attribute annotation
	attr+=cvAttr("name", name);
	attr+=cvBoolAttr("suppressJoinFailure", dpe);
	
	return attr;
	}
	
	/**
	 * converts Bpels standard elements to Bpelscript annotations (i.e. "join" and "signal")
	 * 
	 * shortcut for cvStdElt using "isSimpelActivity=true"
	 * 
	 * @param stdElt, the standard element to convert
	 * @param act, the corresponding activity
	 * @return converted standard element
	 */
	public static String cvStdElt(String stdElt, String act) {
		return cvStdElt(stdElt, act, true);
	}
	
	/**
	 * converts Bpels standard elements to Bpelscript annotations (i.e. "join" and "signal")
	 * 
	 * For a given not null standard element process element structure if it contains a ";".
	 * Therefore, process a) joins and b) signals.
	 * Within this processing distinguish betwenn simple and structured activities.
	 * For simple activities close statement with ";" since Bpelscript models them as statements.
	 * For structured activities use the annotation concept of Bpelscript.
	 * 
	 * @param stdElt, the standard element to convert
	 * @param text, the corresponding activity
	 * @param isSimpelActivity, indicates if the standard element is a simpel activity (if true) or a structured one (if false)
	 * @return converted standard element
	 */
	public static String cvStdElt(String stdElt, String text, Boolean isSimpelActivity) {
		
		String join = "", signal = "";
		String retval=text;
		
		if (!stdElt.isEmpty()) {
			String[] strStrip;
			
			//process element structure
			if (stdElt.contains(";")) {
			   strStrip=stdElt.split(";");
			   
			   for(final String str : strStrip)
				if (str.contains("join")) {
					//prefix with @ when blockstructured
					if (!isSimpelActivity) join+="@";
					join+=str;
					//close with SEMI only when simpelAct
					if (isSimpelActivity) join+=";\n";
					else join+=" ";
				} else if (str.contains("signal")) {
					//prefix with @ when blockstructured
					if (!isSimpelActivity) signal+="@";
					signal+=str;
					//close with SEMI only when simpelAct
					if (isSimpelActivity) signal+=";\n";
					else signal+=" ";
				}
			}			
		
			/* if isBlockstructured then handle different than normal activities */
			if (!isSimpelActivity) {
				//remove closing whitespace)
				if (signal.length()>0) signal=(String) signal.subSequence(0, signal.length()-1);
				else if (join.length()>0) join=(String) join.subSequence(0, join.length()-1);
				
				//set content
				retval=" "+join+signal+" {\n"+text;
			} else {
				retval=join+text+signal;
				if (!signal.isEmpty()) retval+="\n";
			}
		}
			
		return retval;
	}

	/**
	 * converts Bpels correlation attributes to its Bpelscript representation
	 * 
	 * for given not null parameters:
	 * a) handle "initiate" attribute for "init" parameter
	 *  - a.1) if "YES" > "!"
	 *  - a.2) if "JOIN" > "?"
	 * b) handle "pattern" attribute for "pattern" parameter
	 *  - b.1) if request > "@>"
	 *  - b.2) if response > "@<"
	 *  - b.3) if request-response > "@><"
	 * 
	 * @param init, the initiate attribute
	 * @param pattern, the (join)-pattern attribute
	 * @return the converted attribute
	 */
	public static String cvCorrAttr (JoinBool init, JoinPattern pattern) {
		String retval="";
		String attr="";
		
		//handle initiate (default no=empty string)
		if (init!=null) {
		  if(init.equals(JoinBool.YES)) attr+="!";
		  else if (init.equals(JoinBool.JOIN))attr+="?";
		}
		
		//handle pattern
		if (pattern!=null) {
			  if(pattern.equals(JoinPattern.REQUEST)) attr+="@>";
			  else if(pattern.equals(JoinPattern.RESPONSE)) attr+="@<";
			  if(pattern.equals(JoinPattern.REQRESP)) attr+="@><";
			}
		
		return retval;
	}
	
	/**
	 * strip different kinds of namespaces (e.g. ns, ext, import) and sort them
	 * 
	 * For a given not null string of namespaces split them by ";".
	 * Afterwards, process 3 strings (for namespaces, extensions and imports) and splice them at the end
	 * 
	 * @param all_ns, s string of namespaces
	 * @return the converted, sorted namespaces
	 */
	public static String cvNS (String all_ns) {
		String retval=all_ns;
		
		//strip different kinds of "namespaces" (ns, ext, import) and sort them
		String[] strStrip;
		String ns = "", ext ="", imp ="";
		
		//
		if (all_ns != null && all_ns.contains(";")) {
		   strStrip=all_ns.split(";");
		   
		   for(final String str : strStrip) {
			   //append new content
			   if (str.contains("namespace")) {
				   ns+=str+";";
				   if (!ns.isEmpty()) ns+="\n";
			   } else if (str.contains("extension")) {
				   ext+=str+";";
				   if (!ext.isEmpty()) ext+="\n";
			   } else if (str.contains("import")) {
				   imp+=str+";";
				   if (!imp.isEmpty()) imp+="\n";
			   }
		   }
		   retval=ns+ext+imp;
		}	
		
		return retval;
	}
	
	/**
	 * translates a BPEL documentation to its corresponding BPELscript comment
	 * 
	 * to translate a BPEL documentation one has 
	 *  (a) trim the PCDATA string to remove leading whitespaces
	 *  (b) for each line:
	 *    (b.1) add "//"
	 *    (b.2) trim the line to remove leading whitespaces (respective to its depth)
	 *    (b.3) add closing newline
	 * 
	 * @param sth
	 * @return parsedComment String
	 */
	public static String parseComment(String sth) {
		
		sth=sth.trim();
		
		// split using newline regex
		String[] strComment = sth.split("\n");
		// prepare return
		String strRet="";
		
		// translate each line to remove its leading whitespaces (adding "//", trim() and newline)
		for (String crt : strComment) {
			strRet+="//"+crt.trim()+"\n";
		}
		return strRet;
	}
	
	/**
	 *  Opaque Language Extensions
	 *
	 *	"The common base allows the following uses of opacity in Abstract Processes:
	 *	- Opaque activities are allowed.
	 *	- All WS-BPEL expressions are allowed to be opaque.
	 *	- All WS-BPEL attributes are allowed to be opaque in the common base.
	 *	- The from-spec (e.g. in <assign>) is allowed to be opaque.
	 *	The function of the four types of opaque tokens allowed in Abstract Processes (activities, expressions, attributes and from-specs)" [BPELspec13.1.3]
	 *
	 * @see BPELspec 13.1.3
	 * 
	 * @param opaque, the BpelBoolean value indicating if an expression is opaque
	 * @param value, the String value indicating the executable behavior
	 * @return, value if opaque is "null" or "NO", else "##opaque"
	 */
	public static String cvOpaque(BpelBoolean opaque, String value) {
		String retval=null;
	  	
	  	if (opaque!=null && opaque.equals(BpelBoolean.YES)) {//opaque expression
	  		retval="\"##opaque\"";
	  	} else {//executable expression
	  		retval=value;
	  	}
	  	
		return retval;
	}
}
