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

import java.util.List;


public class Helper {

	
	public static String cvBoolAttr(String fullname, BpelBoolean value) {
		return cvBoolAttr(fullname, value, true);
	}
	
	
	public static String cvBoolAttr(String fullname, BpelBoolean value, Boolean newline) {
		
		String attr="";
		
		//handle 'fullname' annotation
		if (value!=null) {
		  if(value.equals(BpelBoolean.YES)) attr+="@"+fullname;
		  else attr+="@"+fullname+" no ";
		  
		  if (newline) attr+="\n";
		}
		
		return attr;
	}
	
	public static String strip(String QName) {
	String retval=QName;
	String plSplit[];
	
	//duplicate single : if present
	 if (!QName.contains("::") && QName.contains(":") && !QName.contains("://")) {
	   plSplit=QName.split(":");
	   retval=plSplit[0]+"::"+plSplit[1];  	  
	 }
	 
	 return retval;
	}
	
	public static String cvAttr(String fullname, String value) {
		return cvAttr(fullname, value, true, null);
	}
	
	public static String cvAttr(String fullname, String value, String newline) {
		return cvAttr(fullname, value, null, newline);
	}

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

	public static String cvStdAttr(String name, BpelBoolean dpe) {
	
	String attr="";
	
	//handle standard attribute annotation
	attr+=cvAttr("name", name);
	attr+=cvBoolAttr("suppressJoinFailure", dpe);
	
	return attr;
	}
	
	public static String cvStdElt(String stdElt, String act) {
		return cvStdElt(stdElt, act, true);
	}
	
	public static String cvStdElt(String stdElt, String text, Boolean isSimpelActivity) {
		
		String join = "", signal = "";
		String retval=text;
		
		if (!stdElt.isEmpty()) {
			String[] strStrip;
			
			//
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
	
}
