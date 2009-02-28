/*
 * Copyright 2008-2009 Marc Bischof 
 * based on simpel.g by Matthieu Riou
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
grammar BPELscript;

options {
    output=AST; 
   //TokenLabelType=CommonHiddenStreamToken;
    ASTLabelType=CommonTree;
}
tokens {
    ROOT; PROCESS; PICK; SEQUENCE; FLOW; FLOWS; IF; ELSIF; ELSE; WHILE; UNTIL; FOR; INVOKE;PROC_STMTS;
    RECEIVE; REPLY; ASSIGN; THROW; WAIT; EXIT; TIMEOUT; TRY; CATCH; CATCH_ALL; SCOPE; EVENT;
    ALARM; ONMESSAGE; COMPENSATION; COMPENSATE; CORRELATION; CORR_MAP; PARTNERLINK; VARIABLE; VALIDATE; BLOCK_PARAM; 
    SIGNAL; JOIN; WITH; MAP; NOP; RETHROW; OPAQUE;
    EXPR; EXT_EXPR; XML_LITERAL; CALL; NAMESPACE; NS; PATH; EXTENSION; EXTENSIONACT; IMPORT; MESSAGES; CORRSETS; CORRSET;
    XML; JS; FINAL; BRANCH;
    PID; VARIABLES; PARTNERLINKS; PORTTYPE; STD_ATTR;ONALARM;REPEATEVERY;EVENTHDL;MESSAGE; TERMINATION; 
    MSGEX; FAULTNAME; MSGTYPE; VITYPE; VIELT;FAULTELT;EXPRLG; QUERYLG;
}
@parser::header {
/*
 * Copyright 2008-2009 Marc Bischof 
 * based on simpel.g by Matthieu Riou
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

import java.util.HashMap;
}

@lexer::header {
/*
 * Copyright 2008-2009 Marc Bischof 
 * based on simpel.g by Matthieu Riou
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

}

@members{
/**
 * Shortcut with default name "Option"
 * reports a failed predicate exception to system.err.println
 */
public void reportFailedPredicateWarning(FailedPredicateException exc) {
    reportFailedPredicateWarning(exc, "Option");
}

/**
 * reports a failed predicate exception to system.err.println
 */
public void reportFailedPredicateWarning(FailedPredicateException exc, String name) {
    System.err.println("Warning: Duplicate "+name+" definition on line "+exc.line);
}
}

// MAIN BPEL SYNTAX
program	:	declaration+ -> ^(ROOT declaration+);
	
declaration	:	process | sub_declaration;

sub_declaration
		:	namespace | extension | imports;

// Process
process
	:	
	 	( {q==null}? q=queryLg  | {e==null}? e=exprLg  | {sjf==null}? sjf=SJF  | {exitOnStandardFault==null}? exitOnStandardFault=EOSF  )*
		'process' ns_id std_attr
		j+=ajoin? s+=asignal* 
		block eventHdl?
	->	^(PROCESS ns_id block eventHdl? queryLg? exprLg? $sjf? $exitOnStandardFault? std_attr ajoin? asignal*);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}
	
proc_stmts
	:	(join SEMI)? proc_stmt (s+=signal SEMI)* 
	-> 	^(PROC_STMTS join? signal* proc_stmt);

proc_stmt
	:	//structured stmts
		if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act 
		| try_ex | corr_sets
		//simple stmts
		| ((invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit
		| variables | validate | partner_links | compensate | nop | messages | opaque) SEMI!);

block		:	'{' proc_stmts+ '}' -> ^(SEQUENCE proc_stmts+);
	
scope_block	:	'{' sub_declaration* proc_stmts+ '}' -> ^(SEQUENCE sub_declaration* proc_stmts+);

param_block	:	'{' ('|' in+=ID (',' in+=ID)* '|')? proc_stmts+ '}' -> ^(SEQUENCE $in* proc_stmts+);

body		:	block | proc_stmts;

// Structured activities
pick	:	( {c==null}? c=CREATE_INST 
	        //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'pick' '{' onMessage+ onAlarm* '}' -> ^(PICK onMessage+ onAlarm* CREATE_INST? $name? SJF?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

onMessage 
        	:	( {pT==null}? pT=portType | {m==null}? m=msgEx )*
		'onMessage' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex?
        		param_block 
        		-> ^(ONMESSAGE param_block portType? msgEx? ID ID correlation? with_ex?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}
        
onAlarm 
	:	// use syntactic predicate to garantie that at least one expression must be there 
		// (also garanties that standard attributes are not used in this context)
		{input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")|| input.LT(1).getText().contains("@")}? 
		(alarm | timeout)? repeatEvery? {input.LT(1).getText().equals("{")}? scope_short
	->	^(ONALARM alarm? timeout? repeatEvery? scope_short);
        
alarm		:	( {q==null}? q=queryLg  | {e==null}? e=exprLg 	        
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
			'alarm' '(' (expr | OPAQUE_EXPR) ')' 
		-> 	^(ALARM  expr? OPAQUE_EXPR? queryLg? exprLg? $name? SJF?);
	
timeout	:	( {q==null}? q=queryLg  | {e==null}? e=exprLg 	        
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
			'timeout' '(' (expr | OPAQUE_EXPR) ')' 
		->	^(TIMEOUT expr? OPAQUE_EXPR? queryLg? exprLg? $name? SJF?);
	
repeatEvery
	:	'repeatEvery' '(' (expr | OPAQUE_EXPR) ')'
	->	^(REPEATEVERY expr? OPAQUE_EXPR?);
	
flow 	:	std_attr
		'parallel' s+=sequence ( 'and' s+=sequence)*
	-> 	^(FLOW  $s+ std_attr) ;

signal		:	( q=queryLg?  | exprLg?  | {q==null}? q=queryLg) 
			'signal' '('ID (',' (expr | OPAQUE_EXPR))? ')' -> ^(SIGNAL ID expr? OPAQUE_EXPR? queryLg? exprLg?);

asignal	:	'@signal' '('ID (',' (expr | OPAQUE_EXPR))? ')' -> ^(SIGNAL ID expr? OPAQUE_EXPR?);

ajoin		:	'@join' '(' k+=ID (',' k+=ID)* (',' (expr | OPAQUE_EXPR))? ')' -> ^(JOIN $k+ expr? OPAQUE_EXPR?);

join		:	( q=queryLg?  | exprLg?  | {q==null}? q=queryLg)
			'join' '(' k+=ID (',' k+=ID)* (',' (expr | OPAQUE_EXPR))? ')' -> ^(JOIN $k+ expr? OPAQUE_EXPR? queryLg? exprLg?);

if_ex
	:	( {q==null}? q=queryLg  | {e==null}? e=exprLg 	        
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'if' '(' (iex=expr|iop=OPAQUE_EXPR) ')' s=sequence 
		('elseif' '(' (eiex=expr|eiop=OPAQUE_EXPR) ')' sei+=sequence)* //todo add expr,querLg as annotation
		('else' se=sequence)? 
	-> 	^(IF $iex? $iop? $s (^(ELSIF $eiex? $eiop? $sei))* (^(ELSE $se))? $name? SJF? queryLg? exprLg?);

sequence
	:	std_attr
		j+=ajoin? s+=asignal*
		b=body
	->	^(SEQUENCE $j? $b $s* std_attr?);
//	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

scope_sequence
	:	j+=ajoin? s+=asignal* 
		b=scope_block
	->	^(SEQUENCE $j? $b $s*);

while_ex	:	( {q==null}? q=queryLg  | {e==null}? e=exprLg 	        
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
			'while' '(' (expr|OPAQUE_EXPR) ')' s=sequence -> ^(WHILE expr? OPAQUE_EXPR? sequence $name? SJF? queryLg? exprLg?);

until_ex	:	( {q==null}? q=queryLg  | {e==null}? e=exprLg 	        
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
			'repeat' s=sequence 'until' '(' (expr|OPAQUE_EXPR) ')' -> ^(UNTIL expr? OPAQUE_EXPR? sequence $name? SJF? queryLg? exprLg?);

foreach //todo add exprlanguae
	:	({par==null}? par=PARALLEL | {successfulBranchesOnly==null}? successfulBranchesOnly=SBO | {q==null}? q=queryLg  | {e==null}? e=exprLg
	        //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'for' '(' cName=ID '=' (init=expr|initop=OPAQUE_EXPR) ('to'|SEMI) (cond=expr | condop=OPAQUE_EXPR) (('finish'|SEMI) (complete+=expr|compop+=OPAQUE_EXPR))? ')' scope_short
	-> 	^(FOR $cName $init? $initop? (^(FINAL $cond? $condop?))? (^(BRANCH $complete? $compop?))?
			scope_short PARALLEL? SBO? $name? SJF? queryLg? exprLg?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

try_ex		:	'try' body catch_ex* catchAll?-> ^(TRY catch_ex* body?);		

catch_ex
	:	(('@faultMessageType' fMT=STRING) |  faultElt)?
		'catch' '(' ns_id  ')' param_block 
	-> 	^(CATCH ns_id param_block $fMT? faultElt?);
	
catchAll
	:	'catchAll' block
	-> 	^(CATCH block);

scope_ex
	:	( {i==null}? i=ISOLATED | {eosf==null}? eosf=EOSF | {sjf==null}? sjf=SJF )*
		'scope' ('(' ID? ')')? scope_sequence scope_stmt 
	-> 	^(SCOPE ID? scope_stmt scope_sequence ISOLATED? EOSF? SJF?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}
	
scope_short 
	:	scope_sequence scope_stmt -> ^(SCOPE scope_stmt scope_sequence);

scope_stmt
	:	( {c==null}? c=compensation | {t==null}? t=termination | {e==null}? e=eventHdl )*
	->	^(SCOPE compensation? termination? eventHdl?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc, "Alternative");}

termination 
	:	'onTermination' body -> ^(TERMINATION body);

eventHdl	
	:	'events' '{' onEvent* onAlarm* '}'
		->	^(EVENTHDL onEvent* onAlarm*);
	
onEvent	
	:	( {pt==null}? pt=portType | {msg==null}? msg=msgEx | {te==null}? te=( msgType | viElt ) )*
		(var=ID '=' )? 'event' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex? scope_short 
	-> 	^(EVENT $p $o correlation? with_ex? scope_short $var? portType? msgEx? msgType? viElt?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}
		
compensation //compensation handler
	:	'compensation' body -> ^(COMPENSATION body);

with_ex
	 :	 'with' '(' wm+=with_map (',' wm+=with_map)* ')' -> ^(WITH $wm+);

with_map
	:       	ID ':' KEY? path_expr -> ^(MAP ID KEY? path_expr);

// Simple activities
receive
        :		( {pt==null}? pt=portType | {msg==null}? msg=msgEx | {ci==null}? ci=CREATE_INST 
        //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'receive' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex?
	-> 	^(RECEIVE $p $o correlation? portType? CREATE_INST? msgEx? $name? SJF? with_ex?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

reply
	:	( {pt==null}? pt=portType | {fn==null}? fn=faultName | {msg==null}? msg=msgEx
        //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'reply' '(' p=ID ',' o=ID (',' in=ID)? (',' correlation)? ')'  with_ex?
	-> 	^(REPLY ID ID ID? correlation? portType? $name? SJF? faultName? msgEx? with_ex?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

invoke
	:	( {pt==null}? pt=portType         //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'invoke' '(' p=ID ',' o=ID (',' in=ID)? (',' correlation)? ')' with_ex? compensation?
	-> 	^(INVOKE $p $o $in? correlation? portType? $name? SJF? with_ex? compensation?);
		catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

assign
	:	( {pt==null}? pt=portType | {ci==null}? ci=CREATE_INST | {val==null}? val=VALID | {ke==null}? ke=KEEPSRC 
	  | {ig==null}? ig=IGNORE | {fn==null}? fn=faultName | {msg==null}? msg=msgEx 
          //should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		(lhs_opaque=OPAQUE_EXPR | path_expr PROP?) '=' rvalue
	-> 	^(ASSIGN path_expr? PROP? $lhs_opaque? portType? CREATE_INST? $name? SJF? faultName? msgEx? VALID? KEEPSRC? IGNORE? rvalue?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

rvalue
	:	receive
	|	invoke
	|	expr PROP?
	|	OPAQUE_EXPR
	;
	
throw_ex
	:	( {f==null}? f=(('@faultVariable' |'@faultVar') faultVar=ID) 
	//should be std_attr. but did not work with occurence-order-independency
        	| {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		'throw' '(' ns_id ')' -> ^(THROW ns_id $faultVar? $name? SJF?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}
		
rethrow_ex
	:	std_attr
		'rethrow' -> ^(RETHROW std_attr);

compensate
	:	std_attr
		'compensate' ('(' target=ID ')')? 
	-> 	^(COMPENSATE ID? std_attr);

exit		:	std_attr
			'exit' -> ^(EXIT std_attr);
	
validate	:	std_attr
			'validate' v+=ID (',' v+=ID)*-> ^(VALIDATE $v+ std_attr);
	
ext_act  	:	std_attr
			e=EXT_ACT ->  ^(EXTENSIONACT $e std_attr);

nop		:	std_attr
			'nop' -> ^(NOP std_attr);
			
opaque	:	std_attr
			'opaque()' -> ^(OPAQUE std_attr); 

// Others
namespace
	:	'namespace' ID '=' STRING SEMI -> ^(NAMESPACE ID STRING);
	
extension
	: 	MUSTUND? 
		'extension' ID '=' STRING SEMI
	-> 	^(EXTENSION ID STRING MUSTUND?);

imports
	: 	viType  
		'import' (id=ID '=' (ns=ID '::' )? loc=STRING ) SEMI 
	-> 	^(IMPORT $id $loc $ns? viType?);

messages //Exchange
	:	'messages' m+=message (',' m+=message)* -> ^(MESSAGES message+);
	
message	:	ID -> ^(MESSAGE ID);
		
variables	:	'var' v+=variable (',' v+=variable)* 
		-> 	^(VARIABLES variable+);

variable
	:	( {msg==null}? msg=msgType | {vi==null}? vi=viType | {viE==null}? viE=viElt )*
		ID  with_ex?
	-> 	^(VARIABLE ID msgType? viType? viElt? with_ex?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

partner_links
	:	('partnerLink' | 'partnerlink') pl+=partner_link (',' pl+=partner_link)* -> ^(PARTNERLINKS $pl+);
	
partner_link
	:	ID '=' '(' plType=ns_id? (',' roleA=ns_id)? (',' roleB=ns_id)? (',' init=INITPARTNER)? ')'
		-> 	^(PID ID $plType? $roleA? $roleB? $init?);

correlation
	:	'{' corr_mapping (',' corr_mapping)* '}' -> ^(CORRELATION corr_mapping+);

corr_mapping
	:	( {init==null}? init=INIT_COR | {pattern==null}? pattern=PATTERN_COR )*
		f1=ID
	-> 	^(CORR_MAP $f1 $init? $pattern?);
	catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

corr_sets 	:	'correlates' '{'cs+=corr_set ';' (cs+=corr_set ';')* '}' -> ^(CORRSETS $cs+);

corr_set	:	f=ID '(' par+=ID (',' par+=ID)* ')' -> ^(CORRSET $f $par+);

// Expressions
expr		:	s_expr | EXT_EXPR | funct_call;
funct_call	:	p+=ID '(' p+=ID* ')' -> ^(CALL ID+);
s_expr		:	condExpr;
condExpr 	:	aexpr ( ('==' ^|'!=' ^|'<' ^|'>' ^|'<=' ^|'>=' ^) aexpr )?;
aexpr		:	mexpr (('+'|'-') ^ mexpr)*;
mexpr		:	atom (('*'|'/') ^ atom)* | STRING;
atom		:	path_expr | INT | '(' s_expr ')' -> s_expr;
path_expr	:	pelmt+=ns_id ('.' pelmt+=ns_id)* -> ^(PATH $pelmt+);
ns_id		:	(pr=ID '::')? loc=ID -> ^(NS $pr? $loc);


//optional attributes 
portType 	:	('@portType' | '@pt') STRING
		->	^(PORTTYPE STRING);
	
std_attr	:	( {name==null}? ('@name' name=STRING) | {suppressJoinFailure==null}? suppressJoinFailure=SJF )*
		->	^(STD_ATTR $name? $suppressJoinFailure?);
		catch [FailedPredicateException exc] {	reportFailedPredicateWarning(exc);}

	
msgEx 	:	('@messageExchange' | '@mex') STRING
		->	^(MSGEX STRING);

msgType 	:	('@messageType' | '@msgType') msgT=STRING
		->	^(MSGTYPE STRING);

//var or import type
viType 	:	'@type' type=STRING
		->	^(VITYPE STRING);
	
viElt		:	'@element' elt=STRING
		->	^(VIELT STRING);

faultName	:	('@faultName' | '@fault') STRING
		->	^(FAULTNAME STRING);

faultElt	:	'@faultElement' STRING
		->	^(FAULTELT STRING);	
		
exprLg		:	('@expressionLanguage' | '@exprLg') STRING
		->	^(EXPRLG STRING);
		
queryLg	:	('@queryLanguage' | '@queryLg') STRING
		->	^(QUERYLG STRING);

// LEXER RULES
EXT_EXPR		:	'[' (options {greedy=false;} : .)* ']';
EXT_ACT		:	pre='{{{' (options {greedy=false;} : c=.)* post='}}}';
OPAQUE_EXPR	:	'##opaque' {setText(" opaque=\"yes\"");};

// Basic tokens
KEY			:	'in' | 'out' | 'inout';
SEMI			:	';';
ID			:	(LETTER | '_' ) (LETTER | DIGIT | '_' | '-' )*;
INT			:	(DIGIT )+ ;
STRING		:	'"' ( ESCAPE_SEQ | ~('\\'|'"') )* '"';
ESCAPE_SEQ		:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
SL_COMMENTS	:	( '//') .* CR { $channel = HIDDEN; };
CR			:	('\r' | '\n' )+ { $channel = HIDDEN; };
WS			:	( ' ' | '\t' )+ { skip(); };
fragment DIGIT	:	'0'..'9';
fragment LETTER  	:	 'a'..'z' | 'A'..'Z';

// Boolean annotations as LEXER rules
protected EOSF
	:	('@exitOnStandardFault' | '@exit') {setText("exitOnStandardFault=\"yes\"");}
	|	('@exitOnStandardFault no' | '@exit no') {setText("exitOnStandardFault=\"no\"");};
	
protected SJF
	:	('@suppressJoinFailure' | '@dpe') {setText("suppressJoinFailure=\"yes\"");}
	|	('@suppressJoinFailure no' | '@dpe no') {setText("suppressJoinFailure=\"no\"");};
	
protected PARALLEL
	:	('@parallel' | '@par') {setText("parallel=\"yes\"");}
	|	('@parallel no' | '@par no') {setText("parallel=\"no\"");};
	
protected SBO
	:	('@successfulBranchesOnly' | '@success' | '@sbo') {setText("successfulBranchesOnly=\"yes\"");}
	|	('@successfulBranchesOnly no' | '@sbo no') {setText("successfulBranchesOnly=\"no\"");};
	
protected INITPARTNER
	:	('@initializePartnerRole' | '@init') {setText("initializePartnerRole=\"yes\"");}
	|	('@initializePartnerRole no' | '@init no') {setText("initializePartnerRole=\"no\"");};

protected INIT_COR
	:	('!' | 'force') {setText("initiate=\"yes\"");}
	|	('?' | 'join') {setText("initiate=\"join\"");};
		
protected PATTERN_COR
	:	('@>' | 'request') {setText("pattern=\"request\"");}
	|	('@<' | 'response') {setText("pattern=\"response\"");}
	|	('@><' | 'request-response') {setText("pattern=\"request-response\"");};
	
protected ISOLATED
	:	'@isolated' {setText("isolated=\"yes\"");}
	|	'@isolated no' {setText("isolated=\"no\"");};
	
protected CREATE_INST
	:	('@createInstance' | '@ci') {setText(" createInstance=\"yes\"");}
	|	('@createInstance no' | '@ci no') {setText(" createInstance=\"not\"");};

protected VALID
	:	'@validate' {setText("validate=\"yes\"");}
	|	'@validate no' {setText("validate=\"no\"");}	;
	
protected KEEPSRC
	:	('@keepSrcElementName' | '@keepSrc') {setText("keepSrcElementName=\"yes\"");}
	|	('@keepSrcElementName no' | '@keepSrc no') {setText("keepSrcElementName=\"no\"");};
	
protected IGNORE
	:	'@ignoreMisssingFromData' | '@ignore' {setText("ignoreMisssingFromData=\"yes\"");}
	|	('@ignoreMisssingFromData no' | '@ignore no') {setText("ignoreMisssingFromData=\"no\"");};

protected PROP
	:	'@property' {setText("property");};

protected MUSTUND
	:	'@mustUnderstand' {setText("mustUnderstand=\"yes\"");}
	|	'@mustUnderstand no' {setText("mustUnderstand=\"no\"");};
