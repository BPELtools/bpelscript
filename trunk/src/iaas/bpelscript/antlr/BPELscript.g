/*
 * Copyright 2008 Marc Bischof 
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
    ASTLabelType=CommonTree;
}
tokens {
    ROOT; PROCESS; PICK; SEQUENCE; FLOW; FLOWS; IF; ELSIF; ELSE; WHILE; UNTIL; FOR; INVOKE;PROC_STMTS;
    RECEIVE; REPLY; ASSIGN; THROW; WAIT; EXIT; TIMEOUT; TRY; CATCH; CATCH_ALL; SCOPE; EVENT;
    ALARM; ONMESSAGE; COMPENSATION; COMPENSATE; CORRELATION; CORR_MAP; PARTNERLINK; VARIABLE; VALIDATE; BLOCK_PARAM; 
    SIGNAL; JOIN; WITH; MAP; NOP; RETHROW; 
    EXPR; EXT_EXPR; XML_LITERAL; CALL; NAMESPACE; NS; PATH; EXTENSION; EXTENSIONACT; IMPORT; MESSAGES; CORRSETS; CORRSET;
    XML; JS;
    PID; VARIABLES; PARTNERLINKS; PORTTYPE; STD_ATTR;ONALARM;REPEATEVERY;EVENTHDL;MESSAGE; TERMINATION; 
    MSGEX; FAULTNAME; MSGTYPE; VITYPE; VIELT;FAULTELT;
}
@parser::header {
/*
 * Copyright 2008 Marc Bischof 
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

@lexer::header {
/*
 * Copyright 2008 Marc Bischof 
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

// MAIN BPEL SYNTAX
program	:	declaration+ -> ^(ROOT declaration+);
	
declaration	:	process | sub_declaration;

sub_declaration
		:	namespace | extension | imports;

// Process
process
	:	('@queryLanguage' queryLg=STRING)?
		('@expressionLanguage' exprLg=STRING)?	
		sjf=SJF?
		exitOnStandardFault=EOSF?
		'process' ns_id std_attr
		j+=ajoin? s+=asignal* 
		block eventHdl?
	->	^(PROCESS ns_id block eventHdl? $queryLg? $exprLg? $sjf? $exitOnStandardFault? std_attr ajoin? asignal*);
	
proc_stmts
	:	(join SEMI)? proc_stmt (s+=signal SEMI)* 
	-> 	^(PROC_STMTS join? signal* proc_stmt);

proc_stmt
	:	//structured stmts
		if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act 
		| try_ex | corr_sets
		//simple stmts
		| ((invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit
		| variables | validate | partner_links | compensate | nop | messages) SEMI!);

block		:	'{' proc_stmts+ '}' -> ^(SEQUENCE proc_stmts+);
	
scope_block	:	'{' sub_declaration* proc_stmts+ '}' -> ^(SEQUENCE sub_declaration* proc_stmts+);

param_block	:	'{' ('|' in+=ID (',' in+=ID)* '|')? proc_stmts+ '}' -> ^(SEQUENCE $in* proc_stmts+);

body		:	block | proc_stmts;

// Structured activities
pick	:	CREATE_INST? std_attr
		'pick' '{' onMessage+ onAlarm* '}' -> ^(PICK onMessage+ onAlarm* CREATE_INST? std_attr);

onMessage 
        	:	portType? msgEx?
		'onMessage' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex?
        		param_block 
        		-> ^(ONMESSAGE param_block portType? msgEx? ID ID correlation? with_ex?);
        
onAlarm 
	:	// use syntactic predicate to garantie that at least one expression must be there 
		// (also garanties that standard attributes are not used in this context)
		{input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")}? 
		(alarm | timeout)? repeatEvery? {input.LT(1).getText().equals("{")}? scope_short
	->	^(ONALARM alarm? timeout? repeatEvery? scope_short);
        
alarm		:	std_attr
			'alarm' '(' expr ')' 
		-> 	^(ALARM  expr std_attr?);
	
timeout	:	std_attr
			'timeout' '('expr ')' 
		->	^(TIMEOUT expr std_attr?);
	
repeatEvery
	:	'repeatEvery' '(' expr ')'
	->	^(REPEATEVERY expr);
	
flow 	:	std_attr
		'parallel' s+=sequence ( 'and' s+=sequence)*
	-> 	^(FLOW  $s+ std_attr) ;

signal		:	'signal' '('ID (',' expr)? ')' -> ^(SIGNAL ID expr?);

asignal	:	'@signal' '('ID (',' expr)? ')' -> ^(SIGNAL ID expr?);

ajoin		:	'@join' '(' k+=ID (',' k+=ID)* (',' expr)? ')' -> ^(JOIN $k+ expr?);

join		:	'join' '(' k+=ID (',' k+=ID)* (',' expr)? ')' -> ^(JOIN $k+ expr?);

if_ex
	:	std_attr
		'if' '(' iex=expr ')' s=sequence ('elseif' '(' eiex+=expr ')' sei+=sequence)* ('else' se=sequence)? 
	-> 	^(IF $iex $s (^(ELSIF $eiex $sei))* (^(ELSE $se))? std_attr);

sequence
	:	std_attr
		j+=ajoin? s+=asignal* 
		b=body
	->	^(SEQUENCE $j? $b $s* std_attr);

scope_sequence
	:	j+=ajoin? s+=asignal* 
		b=scope_block
	->	^(SEQUENCE $j? $b $s*);

while_ex	:	std_attr
			'while' '(' expr ')' s=sequence -> ^(WHILE expr sequence std_attr);

until_ex	:	std_attr
			'repeat' s=sequence 'until' '(' expr ')' -> ^(UNTIL expr sequence std_attr);

foreach
	:	PARALLEL?
		successfulBranchesOnly=SBO? 
		std_attr
		'for' '(' cName=ID '=' init=expr ('to'|SEMI) cond=expr (('finish'|SEMI) complete+=expr)? ')' scope_short
	-> 	^(FOR $cName $init $cond $complete? scope_short PARALLEL? SBO? std_attr);

try_ex		:	'try' body catch_ex* catchAll?-> ^(TRY catch_ex* body?);		

catch_ex
	:	(('@faultMessageType' fMT=STRING) |  faultElt)?
		'catch' '(' ns_id  ')' param_block 
	-> 	^(CATCH ns_id param_block $fMT? faultElt?);
	
catchAll
	:	'catchAll' block
	-> 	^(CATCH block);

scope_ex
	:	ISOLATED? EOSF? SJF?
		'scope' ('(' ID? ')')? scope_sequence scope_stmt 
	-> 	^(SCOPE ID? scope_stmt scope_sequence ISOLATED? EOSF? SJF?);
	
scope_short 
	:	scope_sequence scope_stmt -> ^(SCOPE scope_stmt scope_sequence);

scope_stmt
	:	compensation? termination? eventHdl?
	->	^(SCOPE compensation? termination? eventHdl?);

termination 
	:	'onTermination' body -> ^(TERMINATION body);

eventHdl	
	:	'events' '{' onEvent* onAlarm* '}'
		->	^(EVENTHDL onEvent* onAlarm*);
	
onEvent	
	:	portType? msgEx?
		( msgType | viElt )?					
		(var=ID '=' )? 'event' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex? scope_short 
	-> 	^(EVENT $p $o correlation? with_ex? scope_short $var? portType? msgEx? msgType? viElt?);
		
compensation //compensation handler
	:	'compensation' body -> ^(COMPENSATION body);

with_ex
	 :	 'with' '(' wm+=with_map (',' wm+=with_map)* ')' -> ^(WITH $wm+);

with_map
	:       	ID ':' KEY? path_expr -> ^(MAP ID KEY? path_expr);

// Simple activities
receive
        :		portType? CREATE_INST? msgEx? std_attr
		'receive' '(' p=ID ',' o=ID (',' correlation)? ')' with_ex?
	-> 	^(RECEIVE $p $o correlation? portType? CREATE_INST? msgEx? std_attr with_ex?);

reply
	:	portType? faultName? msgEx? std_attr
		'reply' '(' p=ID ',' o=ID (',' in=ID)? (',' correlation)? ')'  with_ex?
	-> 	^(REPLY ID ID ID? correlation? portType? std_attr faultName? msgEx? with_ex?);

invoke
	:	portType? std_attr
		'invoke' '(' p=ID ',' o=ID (',' in=ID)? (',' correlation)? ')' with_ex? compensation?
	-> 	^(INVOKE $p $o $in? correlation? portType? std_attr with_ex? compensation?);

assign
	:	portType? CREATE_INST? VALID? KEEPSRC? IGNORE? faultName? msgEx? std_attr //only receive and invoke
		path_expr PROP? '=' rvalue 
	-> 	^(ASSIGN path_expr PROP? portType? CREATE_INST? std_attr faultName? msgEx? VALID? KEEPSRC? IGNORE? rvalue);

rvalue
	:	receive
	|	invoke
	|	expr PROP?;
	
throw_ex
	:	(('@faultVariable' |'@faultVar') faultVar=ID)? std_attr
		'throw' '(' ns_id ')' -> ^(THROW ns_id $faultVar? std_attr);
		
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
	:	msgType? viType? viElt?
		ID  with_ex?
	-> 	^(VARIABLE ID msgType? viType? viElt? with_ex?);

partner_links
	:	('partnerLink' | 'partnerlink') pl+=partner_link (',' pl+=partner_link)* -> ^(PARTNERLINKS $pl+);
	
partner_link
	:	ID '=' '(' plType=ns_id? (',' roleA=ns_id)? (',' roleB=ns_id)? (',' init=INITPARTNER)? ')'
		-> 	^(PID ID $plType? $roleA? $roleB? $init?);

correlation
	:	'{' corr_mapping (',' corr_mapping)* '}' -> ^(CORRELATION corr_mapping+);

corr_mapping
	:	init=INIT_COR?
		pattern=PATTERN_COR?
		f1=ID
	-> 	^(CORR_MAP $f1 $init? $pattern?);

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
	
std_attr	:	('@name' name=STRING)? suppressJoinFailure=SJF?
		->	^(STD_ATTR $name? $suppressJoinFailure?);
	
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

// LEXER RULES
EXT_EXPR		:	'[' (options {greedy=false;} : .)* ']';
EXT_ACT		:	pre='{{{' (options {greedy=false;} : c=.)* post='}}}';

// Basic tokens
KEY			:	'in' | 'out' | 'inout';
SEMI			:	';';
ID			:	(LETTER | '_' ) (LETTER | DIGIT | '_' | '-' )*;
INT			:	(DIGIT )+ ;
STRING		:	'"' ( ESCAPE_SEQ | ~('\\'|'"') )* '"';
ESCAPE_SEQ		:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
SL_COMMENTS	:	('#'|'//') .* CR { $channel = HIDDEN; };
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
	:	('@initializePartner' | '@init') {setText("initializePartnerRole=\"yes\"");}
	|	('@initializePartner no' | '@init no') {setText("initializePartnerRole=\"no\"");};

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
