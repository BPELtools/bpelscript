/*
 * Copyright 2008, 2009 Marc Bischof 
 * based on simpelwalker.g by Matthieu Riou
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
tree grammar BPELscriptWalker;

options {
    tokenVocab=BPELscript; // reuse Grammar tokens
    ASTLabelType=CommonTree; // $label will have type CommonTree
  //backtrack=true; // automatic handling of ambiguities
    output=template; //we will use StringTemplate for output
}

tokens {
    XML_EMPTY_ELEMENT; XML_ELEMENT; XML_ATTRIBUTE; XML_NAME; XML_ATTRIBUTE_VALUE; XML_TEXT; XML_WS; XML_COMMENT; XML_CDATA; 
    XML_PI;
    }

@header {
/*
 * Copyright 2008, 2009 Marc Bischof 
 * based on simpelwalker.g by Matthieu Riou
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package iaas.bpelscript.antlr;

import antlr.CommonASTWithHiddenTokens;
}

@members{
// global HashMap that will contain all namespaces
HashMap<String, String> glob_ns = new HashMap<String,String>();

// global HashMap that will contain all extensions
HashMap<String, String> expressions = new HashMap<String, String>();

// global HashMap that will contain all extensions
HashMap<String, String> extensions = new HashMap<String, String>();

// global HashMap that will contain all imports
HashMap<String, String> imports = new HashMap<String, String>();

/**
 * looks up if 'ID' is defined in the HashMap 'hm' and returns the boolean value
 *
 * Vars:
 *    String, that contains the 'ID'
 *
 * return:
 *    Boolean
 */
public String isAlreadyDefined(String ID) {
    String ret=null;
   
    if (glob_ns.containsKey(ID)) ret="namespace";
    if (expressions.containsKey(ID)) ret="expression";
   
    return ret;
}

/**
 * throws a warning message on System.err
 *
 * If a named value is defined twice a warning should be shown to indicate that something wrong.
 * Therefor get a statement string to name the fault statement and 
 * get an CommonTree token wo print the name and the line of the fault causing token
 *
 * Vars:
 *    String, that contains the statement which is shown in the warning
 *    CommonTree, the Token causes the fault
 */
public void throwDefinedWarning(String stmt, CommonTree ID) {
    	System.err.println("Error on Line "+ID.getLine()+":"+ID.getCharPositionInLine()+": "+stmt
    		+" '"+ID.getText()+"' already defined.");
}


/**
     * looks for hidden token in front of STMT
     *
     * Comments are HiddenToken marked by the lexer.
     * The parser can access them by looking in front of the tokenstream.
     * If a HiddenToken in front of an activity starts with "//" or "#" we found a comment.
     * In case of multiline comments we have to look all HiddenToken in front off the activity.
     * 
     * @param stmt
     * @return HiddenTokenCommentsList
     */
    public List<String> getComments (TreeRuleReturnScope stmt) {
            
            // get token stream
            CommonTokenStream ts = (CommonTokenStream) input.getTokenStream(); 
            // get tree for STMT
            CommonTree ct = new CommonTree((CommonTree) stmt.start);

            // get start/stop indices from tree
            int startidx = ct.getTokenStartIndex()-1;
            int stopidx = ct.getTokenStopIndex()-1;
            
            // get token from token stream
            List<?> l = ts.getTokens(startidx, stopidx);
            CommonToken cto = (CommonToken) l.get(0);
            
            // prepare return
            List<String> ls = new ArrayList<String>();
            
            // look for HIDDEN_CHANNEL token in front of STMT beginning with '//' or '#'
            while ((cto.getText().contains("//") | cto.getText().contains("#"))&& cto.getChannel()==HIDDEN) {
            	// fetch current comment
            	String crtStr = cto.getText();
            	// remove commentchar(s)
            	if (crtStr.contains("//")) crtStr=crtStr.substring(2);
            	else if (crtStr.contains("#")) crtStr=crtStr.substring(1);
            	
            	//remove /n of first comment (we are looking in reverse order and therefore, the first here is the last in BPEL)
            	if (ls.isEmpty()) crtStr=crtStr.trim();
            	
            	// add comment token at begin of the list (we are looking in reverse order)
            	ls.add(0, crtStr);
            	// expand the window to lo for comments
            	l = ts.getTokens(--startidx, stopidx);
            	// get new token
            	cto = (CommonToken) l.get(0);
            }
            return ls;
        }

}


// MAIN BPEL SYNTAX
program
	:	^(ROOT decls+=declaration+) 
	// provide declaration handling (be careful since this rule matches a list instead a single subtree)
	-> 	list(content_st={$decls}) 
	;
	
declaration
	:	process -> decl(name_st={$process.st}) 
	|	sub_declaration
	;
	
sub_declaration
	:	namespace | extension | imports; //are handled with HashMaps

// Process
process
@init {
// auxiliary Map to exclude targetNamespace from global Namespace Map
HashMap<String, String> loc_ns = new HashMap(glob_ns);
HashMap<String, String> _vars = new HashMap<String, String>(); 
HashMap<String, String> _pl = new HashMap<String, String>();
HashMap<String, String> _messages = new HashMap<String, String>();
HashMap<String, String> _cs = new HashMap<String, String>();
HashMap<String, String> _faults = new HashMap<String, String>();
HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();
}
	:	^(PROCESS ns=ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] eventHdl? 
			queryLg? exprLg? SJF? EOSF? std_attr j+=join? s+=signal*)
	{// remove process' namespace from local namespace list
		loc_ns.remove($ns.nspre);
	} 
	/* provide process handling
	 * 
	 * will set up bpel process with mandatory name and targertNamespace (got from ns_id)
	 * and additional Namespaces (got from pruned NamespaceMap)
	 * 
	 */
	-> process(name={$ns.nsloc}, tns={glob_ns.get($ns.nspre)}, local={loc_ns}, 
		      content_st={$block.st},
		      queryLg={$queryLg.st}, exprLg={$exprLg.st}, sjf={$SJF}, eOSF={$EOSF}, 
		      exts={extensions}, imports={imports}, plinks_p={_pl}, messages={_messages}, vars={_vars}, cors={_cs}, 
		      faultHdl={_faults}, faultHdl_pb={_faults_pb}, eventHdl={$eventHdl.st},
		      std_attr={$std_attr.st}, join={$j}, signal={$s} )
	;

proc_stmts[Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb]
	:	^(PROC_STMTS j+=join? s+=signal* p=proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb]) 
	-> 	list(content_st={$proc_stmt.st})
	;

proc_stmt [List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, 
		HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
@init{boolean empty= join==null && signal==null;
	List comments = getComments(retval);
	if (comments!=null && !comments.isEmpty()) empty=false;
	}//compute empty-boolean for use in templates
	: pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st={$pick.st}) 
	| flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st={$flow.st}) // tagged by parallel
	| if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st={$if_ex.st})
	| while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st={$while_ex.st}) 
	| until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st={$until_ex.st}) 
	| foreach[join, signal, comments] -> list(content_st={$foreach.st})
	| try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments] -> list(content_st={$try_ex.st})
	| scope_ex[join, signal, comments] -> list(content_st={$scope_ex.st})
	| receive[join, signal, empty, comments] -> list(content_st={$receive.st})
	| invoke[join, signal, empty, _faults, _faults_pb, comments] -> list(content_st={$invoke.st})
	| reply[join, signal, empty, comments] -> list(content_st={$reply.st})
	| assign[join, signal, empty, _vars, _pl, null, null, comments] -> list(content_st={$assign.st}) 
	| throw_ex[join, signal, empty, comments] -> list(content_st={$throw_ex.st})
	| rethrow_ex[join, signal, empty, comments] -> list(content_st={$rethrow_ex.st})
	| alarm [join, signal, empty, true, comments]-> list(content_st={$alarm.st}) 
	| timeout [join, signal, empty, true, comments]-> list(content_st={$timeout.st}) 
	| exit [join, signal, empty, comments] -> list(content_st={$exit.st}) 
	| variables[_vars, isInScope, comments] // no rewrited necessary here, because variables are stored in global hash map and handled at process
	| validate[join, signal, empty, _vars, comments] -> list(content_st={$validate.st})
	| pl=partnerlinks[_pl, isInScope, comments] // no rewrited necessary here, because they are stored in global hash map and handled at process
	| compensate[join, signal, empty, comments] -> list(content_st={$compensate.st})
	| ext_act[join, signal, comments] -> list(content_st={$ext_act.st})
	| nop[join, signal, empty, comments] -> list(content_st={$nop.st})
	| messages[_messages, isInScope, comments] // no rewrited necessary here, because they are stored in global hash map and handled at process
	| corr_sets[_cs, isInScope, comments]
	| opaque[join, signal, empty, comments] -> list(content_st={$opaque.st})
	;
	

block [ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
	HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
	:	^(SEQUENCE ps+=proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]+) 
	-> 	block(stmts_p={$ps})
	;


scope_block[	HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
	:	^(SEQUENCE sub_declaration* 
			ps+=proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb]+)
	-> 	block(stmts_p={$ps})
	;

param_block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
		returns [List param_ids]
	:	^(SEQUENCE ids+=ID* ps+=proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]+) 
	{
		if($ids!=null)	$param_ids=$ids;
	}
	->	 block(ids={$ids}, stmts_p={$ps})
	;

body [	HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
	HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
	:	block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st={$block.st}) 
	| 	proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st={$proc_stmts.st})
	;

// Structured activities
pick [List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
	HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments]
	:	^(PICK om+=onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb]+ to+=onAlarm* CREATE_INST? name=STRING? sjf=SJF?)
	{
	        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
	}
	-> 	pick(oms={$om}, onalarm={$to}, join={$join}, signal={$signal}, crt_inst={$CREATE_INST}, std_attr={std_attr}, comments={$comments})
	;

onAlarm
	:	^(ONALARM alarm[null, null, true, false, null]? timeout[null, null, true, false, null]? repeatEvery? scope_short)
	->	onAlarm(alarm={$alarm.st},timeout={$timeout.st}, repeat={$repeatEvery.st}, scope_ex={$scope_short.st})
	;
        
alarm [List join, List signal, Boolean empty, Boolean isWait, List comments] 
	:	^(ALARM e+=expr[null]? op+=OPAQUE_EXPR? std_attr?)
	->	wait(art={"for"}, expr={$e}, opaque={$op} , join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, isWait={isWait}, comments={$comments})
	;
	
timeout [List join, List signal, Boolean empty, Boolean isWait, List comments] 
	:	^(TIMEOUT e+=expr[null]? op+=OPAQUE_EXPR? std_attr?)
	->	wait(art={"until"}, expr={$e}, opaque={$op}, join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, isWait={isWait}, comments={$comments})
	;

repeatEvery 
	:	^(REPEATEVERY e+=expr[null]? op+=OPAQUE_EXPR?)
	->	wait(art={"repeatEvery"}, expr={$e}, opaque={$op}, skip={"true"})
	;

onMessage [HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
	HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
        :		^(ONMESSAGE pb=param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] 
        		pt=portType? mex=msgEx? p=ID o=ID corr=correlation? w=with_ex? )
        ->	receive(rec_name={"onMessage"}, path_st={$pb.param_ids}, pb={$pb.st}, partner={$p.text}, op={$o.text}, 
        			portType={$pt.st}, msgEx={$mex.st}, correlation_opt={$corr.st}, with_ex={$w.st})
        ; 

flow [List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments]
	: 	^(FLOW s+=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]+ std_attr)
	->	flow(sequence={$s}, join={$join}, signal={$signal}, std_attr={$std_attr.st}, comments={$comments})
	;

if_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments]
	: 	^(IF iex+=expr[null]? iop+=OPAQUE_EXPR? s=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] 
		(^(ELSIF eiex+=expr[null]? eiop+=OPAQUE_EXPR? sie+=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]))* 
		(^(ELSE se=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]))? std_attr)
	->	if_ex(iex={$iex}, iop={$iop}, seq={$s.st}, eiex={$eiex}, eiop={$eiop}, seqei={$sie}, seqe={$se.st}, join={$join}, signal={$signal}, std_attr={$std_attr.st}, comments={$comments})
	;

signal
	:	^(SIGNAL ID exp+=expr[null]? op+=OPAQUE_EXPR?)
	{//signals whether transitionCondition id null or not to provide a shortcut in template if empty
		Boolean empty=exp==null && op==null; 
	}
	-> 	source(source={$ID.text}, trans={$exp}, empty={empty}, opaque={$op})
	;

join
	:	^(JOIN ids+=ID+ exp+=expr[null]? op+=OPAQUE_EXPR?)
	-> 	std_elt(target={$ids}, join={$exp}, opaque={$op})
	;

sequence [HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb]
@init{List comments = getComments(retval);}
	:	^(SEQUENCE j+=join? b=body[_vars, _pl, _messages, _cs, _faults, _faults_pb] s+=signal* std_attr)
	->	sequence(content={$b.st}, join={$j}, signal={$s}, std_attr={$std_attr.st}, comments={comments})
	;


scope_sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		    HashMap<String, String> _cs,HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, StringTemplate handler]
	:	^(SEQUENCE j+=join? b=scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] s+=signal*)
	->	scope_sequence(content={$b.st}, join={$j}, signal={$s}, 
		plinks={_pl}, messages={_messages}, vars={_vars}, cors={_cs}, faultHdl={_faults}, faultHdl_pb={_faults_pb}, compHdl={handler})
	;

while_ex [List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments]
	:	^(WHILE e+=expr[null]? op+=OPAQUE_EXPR? s=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr)
	->	while(expr_st={$e},body_st={$s.st}, join={$join}, signal={$signal}, std_attr={$std_attr.st}, comments={$comments}, opaque={$op})
	;

until_ex [List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, 
		HashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments]
	:	^(UNTIL e+=expr[null]? op+=OPAQUE_EXPR? s=sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr)
	-> 	until(expr_st={$e},body_st={$s.st}, join={$join}, signal={$signal}, std_attr={$std_attr.st}, comments={$comments}, opaque={$op})
	;

foreach [List join, List signal, List comments]
	:	^(FOR cName=ID init+=expr[null]? initop+=OPAQUE_EXPR?
		 (^(FINAL cond+=expr[null]? condop+=OPAQUE_EXPR?))? 
		 (^(BRANCH complete+=expr[null]? comop+=OPAQUE_EXPR?))?
			scope_short PARALLEL? SBO? name=STRING? sjf=SJF?)
	{
	        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
	}
	->	foreach(id={$cName}, init_st={$init}, initop={$initop},
			cond_st={$cond}, condop={$condop},
			complete={$complete}, comop={$comop},
			body_st={$scope_short.st}, join={$join}, signal={$signal}, std_attr={std_attr}, parallel={$PARALLEL}, sbo={$SBO}, comments={$comments})
	;

try_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, 
	HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope, List comments]
	:	^(TRY cls+=catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope]* c+=body [_vars, _pl, _messages, _cs, _faults, _faults_pb]? )
	->	list(content_st={$c}) //, comments={$comments} TODO
	;		

catch_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, 
	HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope] 
	:	^(CATCH ns_id? pb=param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] fMT=STRING? faultElt?)	
	{
		/**
		 * handle try-catch expression.
		 *
		 * 1) process faulTName
		 * 2) process attributes list if necessary
		 * 3) check if exception is handled already and throw an Error
		 * 4) store expression in a HashMap (since it has attributes and a included paramblock a StringTemplate is stored)
		 *
		 */
		
		// 1)
		String faultName = "";
		if($ns_id.nspre!=null) 
			faultName+=$ns_id.nspre+":";
		if ($ns_id.nsloc!=null)			
			faultName+=$ns_id.nsloc;
		else
			faultName=null;
		// 2)
		String attributes = "";
		
		/*
		 * the handling of faultElt differs from fMT because of trouble with ANTLR itself.
		 * when done this like fMT, the behavior was to write "faultMessageType='faultElementName'"
		 */
		if ($pb.param_ids!=null) attributes+="\n       faultVariable=\""+$pb.param_ids.get(0)+"\"";
		if ($fMT.text!=null) attributes+="\n       faultMessageType="+$fMT.text.replaceFirst(":", "");
		if ($faultElt.st!=null) attributes+=$faultElt.st;
		// 3)
		Boolean definedIn = _faults.containsKey(faultName);
				
		if (faultName != null && definedIn) {
			throwDefinedWarning("exception", $ns_id.locID);
		} 
		// 4)
		_faults.put(faultName, attributes);
		_faults_pb.put(faultName, $pb.st);
	
	}
	//->	catch_ex(ns={faultName}, content_st={$pb.st})
	;

scope_ex [List join, List signal, List comments]
	@init{	// reset local HashMaps on begin		
		HashMap<String, String> _vars = new HashMap<String, String>(); 
        		HashMap<String, String> _pl = new HashMap<String, String>();
                	HashMap<String, String> _messages = new HashMap<String, String>();
                	HashMap<String, String> _cs = new HashMap<String, String>();
                	HashMap<String, String> _faults = new HashMap<String, String>();
		HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();
		}
	:	^(SCOPE id+=ID? handler=scope_stmt  s=scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ISOLATED? EOSF? SJF?)
	-> 	scope_ex(id_opt={$id}, body_st={$s.st}, join={$join}, signal={$signal}, isolated={$ISOLATED}, eosf={$EOSF}, std_attr={$SJF.text}, comments={$comments})
	;
	
scope_short 
	@init{	// reset local HashMaps on begin
		HashMap<String, String> _vars = new HashMap<String, String>(); 
        		HashMap<String, String> _pl = new HashMap<String, String>();
                	HashMap<String, String> _messages = new HashMap<String, String>();
                	HashMap<String, String> _cs = new HashMap<String, String>();
                	HashMap<String, String> _faults = new HashMap<String, String>();
		HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();
		}
	:	^(SCOPE handler=scope_stmt s=scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st])
	-> 	scope_ex(body_st={$s.st})//, join={$join}, signal={$signal})
	;


scope_stmt
	:	^(SCOPE c+=compensation? c+=termination? c+=eventHdl?)
	-> 	list(content_st={$c})
	;

termination 
	:	^(TERMINATION body[null, null, null, null,null,null]) -> termination(body={$body.st});


eventHdl	
	:	^(EVENTHDL c+=onEvent* c+=onAlarm*)
	->	eventHdl(content={$c});

onEvent
	:	^(EVENT p=ID o=ID c+=correlation? we+=with_ex? pb=scope_short 
		var=ID? portType? msgEx? msgType? viElt?)		//TODO handle correlation, msgEx, withEx, msgType, viElt
	->	event(p={$p}, o={$o}, param_block_st={$pb.st})
	;

compensation // compensationHandler
	:	^(COMPENSATION body[null, null, null, null,null,null])
	-> 	compensation(body_st={$body.st})
	;

with_ex
@init {
	HashMap<String, StringTemplate> fromParts = new HashMap<String, StringTemplate>();
	HashMap<String, StringTemplate> toParts = new HashMap<String, StringTemplate>();
}
	 :	^(WITH maps+=with_map[fromParts, toParts]+)
	->	with_ex(fromParts={fromParts}, toParts={toParts})
	 ;

with_map[HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts]
	:       	^(MAP ID KEY? pe=path_expr)
	{
		if ($KEY!=null && $KEY.text.contains("in")) {
		    fromParts.put($ID.text, $pe.st);
		}
		
		if ($KEY.text.contains("out")) {
		    toParts.put($ID.text, $pe.st);
		}
	}
	;

// Simple activities
receive	 [List join, List signal, boolean empty, List comments]
        	:		^(RECEIVE partner=ID op=ID c+=correlation? pt=portType? ci=CREATE_INST? msgEx? name=STRING? sjf=SJF? w+=with_ex? )
        	{// adjust empty tag to handle correlations, since it signals only presence of standard elements else
        		if ($c!=null) empty=false;
        		
        		
        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
  
        	}
	-> 	receive(partner={$partner.text},op={$op.text}, join={$join}, signal={$signal}, empty={$empty},
			portType={$portType.st},std_attr={std_attr}, crt_inst={$ci.text}, msgEx={$msgEx.st},
			correlation_opt={$c}, with_ex={$w}, comments={$comments}) 
	;


reply [List join, List signal,boolean empty, List comments] 
	:	^(REPLY partner=ID op+=ID inv=ID? c+=correlation? portType? name=STRING? sjf=SJF? fn=faultName? msgEx? w+=with_ex?)
	{// adjust empty tag to handle correlations, since it signals only presence of standard elements else
        		if ($c!=null) empty=false;
        		
        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();

        	}
	-> 	reply(partner={$partner.text}, op={$op}, inv={$inv.text}, join={$join}, signal={$signal}, empty={$empty},
			portType={$portType.st},std_attr={std_attr}, faultName={$fn.st}, msgEx={$msgEx.st},
			correlation_opt={$c}, with_ex={$w}, comments={$comments}) 
	;

invoke	 [List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments]
@init {
HashMap<String, String> __faults = new HashMap<String, String>();
HashMap<String, StringTemplate> __faults_pb = new HashMap<String, StringTemplate>();

if (_faults!=null) {
    __faults.putAll(_faults);
    __faults_pb.putAll(_faults_pb);
}
}
@after {
if (_faults!=null) { 
    _faults.clear();
    _faults_pb.clear();   
}
}
	:	^(INVOKE partner=ID op=ID inv+=ID? c+=correlation? portType? name=STRING? sjf=SJF? w+=with_ex? compensation?)
	{// adjust empty tag to handle correlations, since it signals only presence of standard elements else
        		if ($c!=null || $_faults!=null) empty=false;
        		
        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();

        	}
	->	invoke(partner={$partner.text}, op={$op.text}, inv={$inv}, join={$join}, signal={$signal}, empty={$empty},
			portType={$portType.st}, std_attr={std_attr}, correlation_opt={$c}, with_ex={$w}, 
			faults={__faults}, faults_pb={__faults_pb}, compensation={$compensation.st}, comments={$comments})
	;

assign	 [List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb, List comments]
	:	^(ASSIGN pe=path_expr? PROP? OPAQUE_EXPR? portType? CREATE_INST?  strattrname=STRING? sjf=SJF? faultName? msgEx? VALID? KEEPSRC? IGNORE? 
		{
		        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (strattrname!=null?strattrname.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
	           }
		rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, $OPAQUE_EXPR.text, join, signal, empty, 
			$portType.st, $CREATE_INST.text, std_attr, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) 
		{
			boolean isRealAssign = true;
			if ($rvalue.text.contains("invoke") || $rvalue.text.contains("receive")) isRealAssign=false;
		}
	-> 	assign(rvalue_st={$rvalue.st}, join={$join}, signal={$signal}, empty={$empty}, valid={$VALID.text}, std_attr={std_attr}, real={isRealAssign}, comments={$comments})
	;

rvalue [HashMap<String, String>_vars, HashMap<String, String>_pl, 
	StringTemplate path_expr, String str_path_expr, String lhs_prop, String lhs_opaque, List join, List signal, boolean empty, 
	StringTemplate portType, String crtInst, String std_attr, StringTemplate faultName, StringTemplate msgEx,
	String valid, String keepsrc, String ignore, String name, StringTemplate pb]
	: 	r=receive[null, null, true, null]
		{
		if ($valid!=null || $keepsrc!=null || $ignore!=null) {
			System.err.println("Error-Info: these attributes are not allowed in this context.");
		}	
		//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
		String[] lhs = $str_path_expr.split("\\."); // fetch left hand side
		if (!_vars.containsKey(lhs[0])) {
		    _vars.put(lhs[0], null);
		}
		}
	-> 	receive(rec_name={name}, pb={pb}, rec_tpl={$r.st},path_st={$path_expr}, join={join}, signal={signal}, empty={empty}, 
			portType={$portType}, crt_inst={crtInst}, std_attr={$std_attr}, faultName={$faultName}, msgEx={$msgEx})
	| 	i=invoke[null, null, true, null, null, null]
		{
		if ($valid!=null || $keepsrc!=null || $ignore!=null) {
			System.err.println("Error-Info: these attributes are not allowed in this context.");
		}
		//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
		String[] lhs = $str_path_expr.split("\\."); // fetch left hand side
		if (!_vars.containsKey(lhs[0])) {
		    _vars.put(lhs[0], null);
		}
		}
	-> 	invoke(inv_tpl={$i.st}, outvar={$path_expr}, join={join}, signal={signal}, empty={empty}, portType={$portType}, std_attr={$std_attr})
	| 	
	  	expr[$path_expr] PROP?
	  	{
		// display error when atrributes are used which are only allowed for other alternatives
		if ($portType!=null || $faultName!=null || $msgEx!=null) {
			System.err.println("Error-Info: these attributes are not allowed in this context.");
		}
		
		String from_spec = $expr.text; //fetch right hand side
		String[] from_part;
		
		String[] lhs = null;
		//distinguish between normal assignment and opaque assignment
		if ($str_path_expr!=null) {
			lhs = $str_path_expr.split("\\."); // fetch left hand side
		} 
		
		// if 'from_spec' contains a path (to a part, property or endPoint) strip the parts out
		if (from_spec.contains(".")) {
			//split from_spec with regex '.' (escaped with '\\')
			from_part = from_spec.split("\\.");
		} else {//else use 'from_spec' itself
			from_part=new String[]{from_spec};
		}

		/** 
		 * Handling of PartnerLinks 
		 * if rhs is contained in partnerlink HashMap and has path like 'myRole' or 'partnerRole' it is a partnerlink
		 */			
		
		// if from part known as partnerlink set its content for the template
		String ePR = null; //endPointReference
		String pL = null;//partnerLink
		String topl=null; //partnerLink of to-part
		Boolean isToExpr=false;
		Boolean isPL = false; //signals if lhs is a partnerlink or not (used by variables-handling)

		if (_pl!=null && _pl.containsKey(from_part[0])) { //rhs could only be a partnerlink if it is already known
			
			
			if(from_part.length>1 && from_part[1]!=null) {//if there is a not null path expression, handle it
				ePR=from_part[1]; //within partnerlinks this MUST be the endPointReference
				pL =from_part[0];//the partnerlink ID
				isPL =true;
				/** 
				 * if the rhs is ALSO KNOWN AS VARIABLE and the endPointReference is not set properly 
				 * (must be 'myRole' or 'partnerRole') it is NOT a partnerlink
				 * if the rhs is NOT KNOWN as variable and the endPointReference is not set properly throw an ERROR
				 */
				if (_vars.containsKey(pL) && (!ePR.equals("myRole") && !ePR.equals("partnerRole"))) {
				    // kill all partnerlink information since we have found a variable which is handled later
				    isPL=false; 
				    ePR=null;
				    pL=null;
				} else if (!ePR.equals("myRole") && !ePR.equals("partnerRole")) {// if it is a partnerlink, inform user about wrong attribute
				    System.err.println("Error: PartnerLink '"+pL+"' has wrong Endpoint Reference. MUST be 'myRole' or 'partnerRole'.");
				}
				
				// if we have still a partnerlink, check whether the LHS is a partnerlink too and set it to 'topl'
				if (isPL) {
				    topl=lhs[0];
				    isToExpr=true;
				    if (lhs!=null && !_pl.containsKey(topl)) {//a partnerlink should be known at an assignment
				        System.err.println("Type-Error: "+topl+" should be 'partnerLink'");
				    }

				    //since BPEL states an implicit partnerrole assignment allow only a partnerole description (but is ignored)
				    if (lhs!=null && lhs.length>1 && !lhs[1].equals("partnerRole")) {
				        System.err.println("Error: PartnerLink '"+topl+"' has wrong Endpoint Reference. MUST be empty or 'partnerRole'.");
				    }
				}
			} 
		}
		
		/** 
		 * Handling of (RHS)-Variables 
		 * if the rhs is contained in variables HashMap (and is not a partnerlink)
		 */
		
		// check if vars in rhs are all known
		Boolean rhsKnown=false;
		if (_vars!=null) {
		for (Object obj : $expr.vars) {
                      	rhsKnown = _vars.containsKey(obj);
                                 if (!rhsKnown) System.err.println("undefined Variable "+obj);
                      }}		
		
		String var = null; //the variable
		String part = null; //the part description
		String property = null; //the property description
		Boolean isVar=false; //signals if rhs is a variable or not
		String from = null;
		Boolean isExt=false; //signals if rhs is an extended expression or not
		Boolean isPLorVar=true; //signal whether an expression is present or not
		/**
		 * a RHS-variable should be known at an assignment and might have optional part or property description
		 */
		if (!isPL) { 
		    if (_vars!=null && rhsKnown) {//_vars.containsKey(from_part[0])) {//rhs known as var?
			
			//if there is a path expression, set it
			if($expr.vars.size()==1 && from_part.length>1 && from_part[1]!=null) {
			    var = from_part[0];
			    if ($PROP!=null) {
			    	if ($PROP.text.equals("property")) {
				    property="";
			        	    for (int j=1; j<from_part.length; j++) {//handle multiple part references
					//set currentFromPart and remove double colon	             		            
	             		            property+=from_part[j].replaceFirst(":", "");
	             		            
           	   		            if (j<from_part.length-1) property+=".";   
             		               }
			    	} 
			    } else {
			        part=from_part[1].replaceFirst(":", "");
			    }
			} else if (rhsKnown) {
			    from = from_part[0]; 
			    isExt=true;
			    isPLorVar=false;
			}
			
		    } else {// rhs is not known as var and is not partnerlink (only (extended) expression is now possible)
		        	/**
			 * handling extended expression or literals
			 */
			from = from_part[0]; //may set a literal here
			isPLorVar=false; 
			if (from_part[0].contains("[")) {//an extended expression is contained in '[...]'
			    from = from.substring(1, from.length()-1); //remove brackets
			    isExt=true;
			} else from = from.substring(1, from.length()-1); //remove colons from literal

		    }
		} 
		
		/** 
		 * handle LHS 
		 */
		String tpart=null; //the part description of the lhs
		String tprop=null; //the property description of the lhs
		String tovar=null; //the lhs
		// topl is set in partnerlink-code
		Boolean isToEmpty=true; //signal whether an expression is present or not
		
		if (!isPL) {//handling only if it is no partnerlink
		    /**
		     * lhs could only be an extended expression or a variable description
		     */
		     
		    //handle variable description
			tovar=lhs==null?null:lhs[0];
			//tovar=lhs[0];
			isToExpr=true;
			    
			//if there is a part or property description
			if (lhs!=null && lhs.length>1 && lhs[1]!=null) {
			    //if the annotation '@part' is set on lhs assign it to 'tpart', else it is a property and assigned to 'tprop'
			    if ($lhs_prop!=null && $lhs_prop.equals("property")) {//handle property reference
			        tprop=lhs[1].replaceFirst(":", "");;
			    } else {//handle part reference
			        tpart="";
			        for (int j=1; j<lhs.length; j++) {//handle multiple part references
             		            tpart+=lhs[j].replaceFirst(":", "");;
              		            if (j<lhs.length-1) tpart+=".";   
             		        }
			    }
			}
			    
			//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
			if (lhs!=null && !_vars.containsKey(lhs[0])) {
			    _vars.put(lhs[0], null);
			}
		}
		}	
	->	copy(	from={from}, //from is only set when it is an expression (extended one or normal)
			empty={isPLorVar}, ext={isExt}, //signals if it is an extended expression or not
			pl={pL}, pl_p={ePR}, //partnerlink parts
			var={var}, part={part}, prop={property}, //variable parts
			topart={tpart}, toprop={tprop}, topl={topl}, tovar={tovar}, toempty={isToExpr}, toopaque={lhs_opaque},//LHS part
		  	keep={$keepsrc}, ignore={$ignore}) //attributes of 'copy'-tag
	|	OPAQUE_EXPR
	{
		// display error when atrributes are used which are only allowed for other alternatives
		if ($portType!=null || $faultName!=null || $msgEx!=null) {
			System.err.println("Error-Info: these attributes are not allowed in this context.");
		}
		
		String from_spec = null; //fetch right hand side
		String[] from_part;
		
		String[] lhs =null;
		//distinguish between normal assignment and opaque assignment
		if ($str_path_expr!=null) {
			lhs = $str_path_expr.split("\\."); // fetch left hand side
		}
		
		from_part=new String[]{from_spec};

		// if from part known as partnerlink set its content for the template
		String ePR = null; //endPointReference
		String pL = null;//partnerLink
		String topl=null; //partnerLink of to-part
		Boolean isToExpr=false;
		Boolean isPL = false; //signals if lhs is a partnerlink or not (used by variables-handling)

		/** 
		 * Handling of (RHS)-Variables 
		 * if the rhs is contained in variables HashMap (and is not a partnerlink)
		 */
		
		String var = null; //the variable
		String part = null; //the part description
		String property = null; //the property description
		Boolean isVar=false; //signals if rhs is a variable or not
		String from = null;
		Boolean isExt=false; //signals if rhs is an extended expression or not
		Boolean isPLorVar=true; //signal whether an expression is present or not
					
		from = from_part[0]; 
		isExt=true;
		//isPLorVar=null;
		 
		/** 
		 * handle LHS 
		 */
		String tpart=null; //the part description of the lhs
		String tprop=null; //the property description of the lhs
		String tovar=null; //the lhs
		// topl is set in partnerlink-code
		Boolean isToEmpty=true; //signal whether an expression is present or not
		
		if (!isPL) {//handling only if it is no partnerlink
		    /**
		     * lhs could only be an extended expression or a variable description
		     */
		     
		    //handle variable description
			tovar=lhs==null?null:lhs[0];
			//tovar=lhs[0];
			isToExpr=true;
			    
			//if there is a part or property description
			if (lhs!=null && lhs.length>1 && lhs[1]!=null) {
			    //if the annotation '@part' is set on lhs assign it to 'tpart', else it is a property and assigned to 'tprop'
			    if ($lhs_prop!=null && $lhs_prop.equals("property")) {//handle property reference
			        tprop=lhs[1].replaceFirst(":", "");;
			    } else {//handle part reference
			        tpart="";
			        for (int j=1; j<lhs.length; j++) {//handle multiple part references
             		            tpart+=lhs[j].replaceFirst(":", "");;
              		            if (j<lhs.length-1) tpart+=".";   
             		        }
			    }
			}
			    
			//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
			if (lhs!=null && !_vars.containsKey(lhs[0])) {
			    _vars.put(lhs[0], null);
			}
		}
		}	
	->	copy(	from={from}, rhs_opaque={$OPAQUE_EXPR},//from is only set when it is an expression (extended one or normal)
			empty={isPLorVar}, ext={isExt}, //signals if it is an extended expression or not
			pl={pL}, pl_p={ePR}, //partnerlink parts
			var={var}, part={part}, prop={property}, //variable parts
			topart={tpart}, toprop={tprop}, topl={topl}, 
			tovar={tovar}, toopaque={lhs_opaque},//
			toempty={isToExpr}, //LHS part
		  	keep={$keepsrc}, ignore={$ignore}) //attributes of 'copy'-tag
//	->	walk(xmlelt_st={$elt.text})
	;
	
throw_ex [List join, List signal,boolean  empty, List comments]
	:	^(THROW ns_id faultVar=ID? name=STRING? sjf=SJF?)
	{
	        		String std_attr =templateLib.getInstanceOf("std_attr",
	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
	 }
	->	throw(  ns_pre={$ns_id.nspre}, ns_loc={$ns_id.nsloc}, 
			join={$join}, signal={$signal}, empty={$empty},
			faultVar={$faultVar.text}, std_attr={std_attr}, comments={$comments})
	;


rethrow_ex [List join, List signal,boolean  empty, List comments]
	:	^(RETHROW std_attr)
	->	rethrow(join={$join}, signal={$signal}, empty={$empty},std_attr={$std_attr.st}, comments={$comments})
	;

//delayed execution
//wait_ex [List join, List signal, boolean empty]
//	:	^(WAIT alarm[join, signal, empty]? timeout[join, signal, empty]?)
//	->	wait(expr_st={$expr.st}, join={$join}, signal={$signal}, empty={$empty})
//	;

compensate [List join, List signal, boolean empty, List comments]
	:	^(COMPENSATE target+=ID? std_attr)
	->	compensate(id_opt={$target}, join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, comments={$comments})
	;

exit [List join, List signal, boolean empty, List comments]
	:	^(EXIT std_attr)
	->	exit(join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, comments={$comments})
	;
		
validate[List join, List signal, boolean empty, HashMap<String, String> _vars, List comments]
	:	^(VALIDATE vars+=ID+ std_attr)
	{
	}
	->	validate(join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, var={$vars}, comments={$comments})
	;
	
ext_act	 [List join, List signal, List comments]
	:	^(EXTENSIONACT ea=EXT_ACT std_attr)	
	{
		/*
		 * this is a quite ugly hack to delete the {{{ and }}}.
		 * they were used in EXT_ACT to support wildcarding
		 */
		int pre = ea.token.getText().indexOf("{{{")+3;
           	int post = ea.token.getText().indexOf("}}}");	
           	String m = ea.token.getText().substring(pre, post);
	}
	->	ext_act(join={$join}, signal={$signal}, ext_act={m.trim()}, std_attr={$std_attr.st}, comments={$comments})
	;

nop [List join, List signal, boolean empty, List comments]
	:	^(NOP std_attr)
	->	nop(join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, comments={$comments})
	;
	
opaque [List join, List signal, boolean empty, List comments]
	:	^(OPAQUE std_attr)
	->	opaque(join={$join}, signal={$signal}, empty={$empty}, std_attr={$std_attr.st}, comments={$comments})
	;

// Others
namespace returns [String id]
	:	^(NAMESPACE ID url=STRING) 
	{// insert namespace in global HashMap glob_ns
		Boolean definedIn = glob_ns.containsKey($ID.text);
		
		if (definedIn) {
			throwDefinedWarning("namespace", $ID);
		} else {
			glob_ns.put($ID.text, $url.text);
		}
	// set return value
		$id=$ID.text;
	}
	;//no rewrite because namespaces are included in the header
		
extension 									
	: 	^(EXTENSION ID url=STRING MUSTUND?)//mustUnderstand+=expr[null]?)
	{		
		//if mustUnderstand is not empty, append it to modified URL
		String modUrl = $url.text;
		if ($MUSTUND!=null) modUrl+=$MUSTUND.text;/*" mustUnderstand=\""+$mustUnderstand.get(0)+"\"";*/
				
		Boolean definedIn = glob_ns.containsKey($ID.text);
		
		if (definedIn) {
			throwDefinedWarning("extension", $ID);
		} else {
			// insert extension in namespace HashMap glob_ns and extensions
			glob_ns.put($ID.text, $url.text);				
			extensions.put($ID.text, modUrl );
		}
	}
	// set template that provide extension handling #this does not work. look at partnerLink
	//-> 	extension(name={$ID.text}, content={$url})
	;

imports
	: 	^(IMPORT (id=ID loc=STRING) ns=ID? viType?)
	{
		String modUrl = "";
		// resolve NS
		String ns_resolved = glob_ns.get($ns.text);
		
		if (ns_resolved!=null) 
		{//proceed only if namespace is already known
			// handle importType
			if ($viType.text!=null) modUrl+=" importType="+$viType.text.substring(5, $viType.text.length())+"\n ";
			// handle location
			if (loc!=null) modUrl+="location="+loc+"\n ";
			// handle namespace
			if ($ns.text!=null) modUrl+="namespace="+ns_resolved;
		
			Boolean definedIn = glob_ns.containsKey($id.text);
		
			if (definedIn) {
				throwDefinedWarning("import", $id);
			} else {
				// insert extension in namespace HashMap glob_ns and extensions
				//glob_ns.put($id.text, $ns.text);
				imports.put($id.text, modUrl ); 
			}
		} else {//error since unknown namespace
			System.err.println("Error on Line "+$id.getLine()+":"+$id.getCharPositionInLine()+": "+"namespace "+$id.getText()+" undefined.");
		}
	}
	;//no rewrite because imports are included in the header

messages[HashMap<String, String> _messages, Boolean isInScope, List comments] //Exchange  //TODO , comments={$comments}
	:	^(MESSAGES message[_messages, isInScope, comments]+)
	;
	
message[HashMap<String, String> _messages, Boolean isInScope, List comments] 
	:	^(MESSAGE ID)
	{	
		Boolean definedIn = _messages.containsKey($ID.text);
		
		if (definedIn) {
			throwDefinedWarning("messageExchange", $ID);
		} 
		// insert messages in message HashMap
		_messages.put($ID.text, "" );                    
	}
	;//no rewrite because messages are included in the header	


variables[HashMap<String, String> _vars, Boolean isInScope, List comments]
	:	 ^(VARIABLES variable[_vars, isInScope, comments]+);
		
variable[HashMap<String, String> _vars, Boolean isInScope, List comments] //TODO , comments={$comments}
	:	^(VARIABLE id=ID msgT=msgType? viT=viType? viE=viElt? with=with_ex?)
	{	boolean empty = $with.st == null;
		/**
		 * compose value string 'var' for the hashmap
		 * 
		 * Therefor check if there are modifiers and append them in positiv case.
		 * if ID is already in use, ignore the new one and throw a warning
		 */
		
		// Read modifiers in String var
		String var = null;

                    /**  if ($msgType.text!=null) {var+="messageType=\""+$msgType.text+"\"";}
                      
                     // if ($viType.text!=null) {var+="type=\""+$viType.text+"\"";}
                      
                      if ($viElt.text!=null) {var+="element=\""+$viElt.text+"\""}    
            	*/
            	var=templateLib.getInstanceOf("variable",
              new STAttrMap().put("id", (id!=null?id.getText():null)).put("msgT", (msgT!=null?msgT.st:null)).
                 put("viT", (viT!=null?viT.st:null)).put("viE", (viE!=null?viE.st:null)).put("with", with!=null?with.st:null).put("empty", empty)).toString();
            	
            	if (_vars!=null) {// check if already known
            	    Boolean definedIn = _vars.containsKey($ID.text);
		
		    if (definedIn) {
			throwDefinedWarning("variable", $ID);
		    } 
		
		    //store variables in hash map
	    	    _vars.put($ID.text, var);
	    	}
	}
//	-> variable(id={$ID.text}, msgT={$msgT.st}, viT={$viT.st}, viE={$viE.st}, with={with.st}, empty={empty})
	;// no rewrite necessary because variables are stored in global hash map 'variables'

partnerlinks[HashMap<String, String> _pl, Boolean isInScope, List comments]	//TODO , comments={$comments}
	:	^(PARTNERLINKS partnerlink[_pl, isInScope, comments]+);

partnerlink[HashMap<String, String> _pl, Boolean isInScope, List comments]
	:	^(PID ID plType=ns_id? roleA=ns_id? roleB=ns_id? init=INITPARTNER?)
	{
	/**
	 * compose value string 'plT' for the hashmap
	 *
	 * Therefor:
	 *  in case of partnerLinkType usage:
	 * 1a) cast partnerlink type by removing second ':'
	 * 2a) append self role and partner role if present
	 * 3a) if initializePartnerRole is present append it too
	 *
	 * in case of portType usage:
	 * 1b) cast portType and role specification
	 * 2b) if type annotation is present provide a partnerLinkType
	 *
	 * 4) if ID is already in use, throw an error
	 * 5) store partnerlink in its HashMap
	 */

	String plT ="";
	
	// 1a)
	if ($plType.text!=null) {
	    if($plType.nspre!=null) {
	        plT = "partnerLinkType=\""+$plType.nspre+":";
	    }
	    plT+=$plType.nsloc+"\"";
	   /* if (!$roleA.text.equals("null") || !$roleB.text.equals("null") | $init!=null) plT+="\n ";*/
	} /*else if ($viType.text!=null) {
	// 2b)
	    plT = "partnerLinkType=\""+$viType.text+"\"";
	}*/
	// 2a)
	if ($roleA.text!=null && !$roleA.text.equals("null")) {
		plT+="\n myRole=\""+$roleA.text+"\"";
	}
	if ($roleB.text!=null && !$roleB.text.equals("null")) {
		/*if (!$roleA.text.equals("null")) plT+="\n ";*/
		plT+="\n partnerRole=\""+$roleB.text+"\"";
	}
	// 2b)
	/*if ($ptA.text!=null) {
		plT+="myRole=\""+$roleA.text+"\"\n ";
	}
	if ($ptB.text!=null) {
		plT+="partnerRole=\""+$roleB.text+"\"";
	}*/
	
	// 3a)
	if ($init!=null) {
	    plT+="\n "+$init.text;
	}
	
	// 4)
	Boolean definedIn = _pl.containsKey($ID.text);
		
	if (definedIn) {
		throwDefinedWarning("partnerlink", $ID);
	}
	// 5)
	_pl.put($ID.text, plT);
	}
	;// no rewrite necessary because partnerlinks are stored in global hash map 'pl'

corr_sets[HashMap<String, String>_cs, Boolean isInScope, List comments] //TODO , comments={$comments}
	:	^(CORRSETS cs+=corr_set[_cs, isInScope, comments]+);

corr_set[HashMap<String, String>_cs, Boolean isInScope, List comments]
	:	^(CORRSET f=ID params+=ID+)
	{
	/**
	 * compose value string 'csP' for the hashmap
	 *
	 * 
	 */

	String csP ="";
	
	if ($params!=null){
 	    for(Object p:$params) {
 	        csP+=p.toString()+" ";
 	    }
 	    csP=csP.trim();
	}
	
	// 4)
	Boolean definedIn = _cs.containsKey($f.text);
		
	if (definedIn) {
	    throwDefinedWarning("correlationSet", $f);
	}
	// 5)
	_cs.put($f.text, csP);
	
	}
	;// no rewrite necessary because corrsets are stored in global hash map 'pl';


correlation
	:	^(CORRELATION cors+=corr_mapping+)
	-> 	list(content_st={$cors})
	;

/*
 * stores the correlation mapping in global expression-HashMap		TODO!!!!!!!!!!! Handle Pattner, Init
 */
corr_mapping 
	:	^(CORR_MAP ID init=INIT_COR? pattern=PATTERN_COR?) /*expr[null]*/
	// store mapping in expressions-HashMap
	{	
		Boolean definedIn = expressions.containsKey($ID.text);
		
		if (definedIn) {
			throwDefinedWarning("correlation", $ID);
			//throw new RecognitionException();
		} else {
			expressions.put($ID.text, null);/*, $expr.retval);//	System.out.println(expressions);*/
		}
	}
	->	correlation_map(id={$ID}, init={$init}, pattern={$pattern}) /*expr={$expr.st},*/
	;

// Expressions
/*
 * returns the respective expression as string
 */
expr [StringTemplate path_expr] returns [String retval, List vars=new ArrayList()] 
	: 	se=s_expr[$vars] {$retval=$se.retval;$vars=$se.retvar;}
	-> 	s_expr(value={$se.retval}, path={$path_expr})
	| 	ee=EXT_EXPR
	{	
		$retval=$ee.text;
		
		//remove expression brackets
		$retval = $retval.substring(1, $retval.length()-1);
		//change specific syntax
		if ($retval.contains("<")) $retval = $retval.replace("<", "&lt;"); 
		if ($retval.contains(">")) $retval = $retval.replace("<", "&gt;");       
	} 
	-> 	expr(expr={$retval})
	| 	fc=funct_call {$retval=$fc.retval;}//-> expr(expr={$fc.text})//TODO
	;


/*
 * shall return function call list >>>>>>TODO: validate!
 */
funct_call returns [String retval]
	// first element is function name, then the parameters follows
	:	^(CALL ids+=ID+) 
	{
		String definedIn = isAlreadyDefined($ID.text);
		
		if (definedIn==null) {
			System.err.println("Error on line "+$ID.getLine()+":"+$ID.getCharPositionInLine()+": function"+" '"+$ID.getText()+"' is not known");
			throw new RecognitionException();
		} else {		
			$retval="TODO: funct_call";
		}
	}
//	-> funct_call(args_p={$ids})
	;

//js_block
//	:	EXT_ACT
//	{System.out.println(EXT_ACT.text);}
//	;

/*
 * returns the statement expression string
 */
s_expr [List vars] returns [String retval, List retvar]// TODO add && || !
@init{$retvar=$vars;}
	: ^('==' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"=="+ $s2.text;}
	| ^('!=' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"!="+ $s2.text;}
	| ^('<' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"&lt;"+ $s2.text;}
	| ^('>' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"&gt;"+ $s2.text;}
	| ^('<=' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"<="+ $s2.text;}
	| ^('=>' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"=>"+ $s2.text;}
	| ^('+' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"+"+ $s2.text;}
	| ^('-' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"-"+ $s2.text;}
	| ^('*' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"*"+ $s2.text;}
	| ^('/' s1=s_expr[$retvar] s2=s_expr[$retvar]) {$retval=$s1.text+"/"+ $s2.text;}
	| STRING {$retval = $STRING.text;} //literal
	| INT {$retval=$INT.text;}
	| pe=path_expr {$retval=$pe.retval;$retvar.add($pe.retval);} -> path_expr(path={pe.st})
	;

/*
 * returns the paths expression by giving a >nspre":"nsloc< string
 */
path_expr returns [String retval]
	:	^(PATH ns+=ns_id+) 
	{//return variable name for use in assign rule (ignoring parts)	
		$retval=$ns.get(0).toString();
	} 
	-> 	path_expr(pns_p={$ns})
	;

/* 
 * returns prefix and location in order to distinguish in upper rules
 */
ns_id returns [String nspre, String nsloc, CommonTree locID]
	:	^(NS pre=ID? loc=ID)				
	{// set return values (pre only when not null ;) )
		
		if ($pre != null) {$nspre = $pre.text;} 
		$nsloc = $loc.text;
		$locID=$loc;
	}
	-> ns_id(pre_opt={$pre},loc={$loc.text})
	;
	
portType
	:	^(PORTTYPE s=STRING)
	->	portType(port={$s.text.replaceFirst(":", "")})
	;
	
std_attr
	:	^(STD_ATTR name=STRING? suppressJoinFailure=SJF?)
	->	std_attr(name={$name}, sjf={$suppressJoinFailure})
	;
	
msgEx
	:	^(MSGEX s=STRING)
	->	msgEx(msgEx={$s.text.replaceFirst(":", "")})
	;

msgType
	:	^(MSGTYPE s=STRING)
	->	msgType(msgT={$s.text.replaceFirst(":", "")})
	;
	
viType //var or import type
	:	^(VITYPE s=STRING)
	->	viType(type={$s.text.replaceFirst(":", "")})
	;
	
viElt	
	:	^(VIELT s=STRING)
	->	viElt(elt={$s.text.replaceFirst(":", "")})
	;

faultName
	:	^(FAULTNAME s=STRING)
	->	faultName(faultName={$s.text.replaceFirst(":", "")})
	;

faultElt
	:	^(FAULTELT s=STRING)
	->	faultElt(name={$s.text.replaceFirst(":", "")})
	;
	
exprLg
	:	^(EXPRLG s=STRING)
	->	exprLg(name={$s.text.replaceAll("::", ":")})
	;
	
queryLg
	:	^(QUERYLG s=STRING)
	->	queryLg(name={$s.text.replaceAll("::", ":")})
	;
