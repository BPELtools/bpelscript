// $ANTLR 3.1b2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g 2009-02-28 19:13:01

/*
 * Copyright 2008, 2009 Marc Bischof 
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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BPELscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "OPAQUE", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "FINAL", "BRANCH", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "EXPRLG", "QUERYLG", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "STRING", "OPAQUE_EXPR", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'process'", "'{'", "'}'", "'|'", "','", "'@name'", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'opaque()'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'", "'@expressionLanguage'", "'@exprLg'", "'@queryLanguage'", "'@queryLg'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=103;
    public static final int NOP=44;
    public static final int T__160=160;
    public static final int PARTNERLINKS=66;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int EVENTHDL=71;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int FINAL=62;
    public static final int IMPORT=56;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int FLOWS=9;
    public static final int VALID=93;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int TIMEOUT=24;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int PID=64;
    public static final int RETHROW=45;
    public static final int KEY=92;
    public static final int MESSAGES=57;
    public static final int ELSE=12;
    public static final int INT=102;
    public static final int WAIT=22;
    public static final int SJF=82;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int CREATE_INST=86;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=108;
    public static final int T__129=129;
    public static final int SBO=90;
    public static final int CALL=50;
    public static final int EOSF=83;
    public static final int ELSIF=11;
    public static final int INVOKE=16;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int XML=60;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int COMPENSATE=33;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int ONALARM=69;
    public static final int EXT_EXPR=48;
    public static final int T__109=109;
    public static final int SIGNAL=40;
    public static final int T__111=111;
    public static final int STD_ATTR=68;
    public static final int QUERYLG=81;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int MESSAGE=72;
    public static final int T__112=112;
    public static final int BLOCK_PARAM=39;
    public static final int EXPRLG=80;
    public static final int ISOLATED=91;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=95;
    public static final int MSGTYPE=76;
    public static final int FAULTELT=79;
    public static final int SEMI=84;
    public static final int VALIDATE=38;
    public static final int TERMINATION=73;
    public static final int BRANCH=63;
    public static final int CORRSETS=58;
    public static final int INITPARTNER=99;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=106;
    public static final int RECEIVE=18;
    public static final int EXTENSION=54;
    public static final int STRING=87;
    public static final int MSGEX=74;
    public static final int WHILE=13;
    public static final int OPAQUE=46;
    public static final int FAULTNAME=75;
    public static final int REPEATEVERY=70;
    public static final int INIT_COR=100;
    public static final int CATCH_ALL=27;
    public static final int PICK=6;
    public static final int PATH=53;
    public static final int EXTENSIONACT=55;
    public static final int ONMESSAGE=31;
    public static final int EXIT=23;
    public static final int NS=52;
    public static final int CORRELATION=34;
    public static final int PORTTYPE=67;
    public static final int CORR_MAP=35;
    public static final int VIELT=78;
    public static final int TRY=25;
    public static final int NAMESPACE=51;
    public static final int SEQUENCE=7;
    public static final int VITYPE=77;
    public static final int SL_COMMENTS=107;
    public static final int PATTERN_COR=101;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int UNTIL=14;
    public static final int CORRSET=59;
    public static final int REPLY=19;
    public static final int EXT_ACT=97;
    public static final int CATCH=26;
    public static final int THROW=21;
    public static final int KEEPSRC=94;
    public static final int PARALLEL=89;
    public static final int FOR=15;
    public static final int ALARM=30;
    public static final int ID=85;
    public static final int PROP=96;
    public static final int IF=10;
    public static final int EXPR=47;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int SCOPE=28;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int DIGIT=104;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int MUSTUND=98;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int JS=61;
    public static final int EVENT=29;
    public static final int ROOT=4;
    public static final int JOIN=41;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int COMPENSATION=32;
    public static final int OPAQUE_EXPR=88;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ESCAPE_SEQ=105;
    public static final int MAP=43;
    public static final int ASSIGN=20;
    public static final int VARIABLES=65;
    public static final int XML_LITERAL=49;
    public static final int T__169=169;

    // delegates
    // delegators


        public BPELscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BPELscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BPELscriptParser.tokenNames; }
    public String getGrammarFileName() { return "/home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g"; }


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


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:1: program : ( declaration )+ -> ^( ROOT ( declaration )+ ) ;
    public final BPELscriptParser.program_return program() throws RecognitionException {
        BPELscriptParser.program_return retval = new BPELscriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.declaration_return declaration1 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:9: ( ( declaration )+ -> ^( ROOT ( declaration )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: ( declaration )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SJF && LA1_0<=EOSF)||LA1_0==MUSTUND||LA1_0==109||(LA1_0>=161 && LA1_0<=162)||LA1_0==187||(LA1_0>=192 && LA1_0<=195)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program328);
            	    declaration1=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:24: -> ^( ROOT ( declaration )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:27: ^( ROOT ( declaration )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROOT, "ROOT"), root_1);

                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:1: declaration : ( process | sub_declaration );
    public final BPELscriptParser.declaration_return declaration() throws RecognitionException {
        BPELscriptParser.declaration_return retval = new BPELscriptParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.process_return process2 = null;

        BPELscriptParser.sub_declaration_return sub_declaration3 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:13: ( process | sub_declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=SJF && LA2_0<=EOSF)||LA2_0==109||(LA2_0>=192 && LA2_0<=195)) ) {
                alt2=1;
            }
            else if ( (LA2_0==MUSTUND||(LA2_0>=161 && LA2_0<=162)||LA2_0==187) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:15: process
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_process_in_declaration347);
                    process2=process();

                    state._fsp--;

                    adaptor.addChild(root_0, process2.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:25: sub_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sub_declaration_in_declaration351);
                    sub_declaration3=sub_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, sub_declaration3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class sub_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub_declaration"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:101:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptParser.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptParser.sub_declaration_return retval = new BPELscriptParser.sub_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.namespace_return namespace4 = null;

        BPELscriptParser.extension_return extension5 = null;

        BPELscriptParser.imports_return imports6 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:3: ( namespace | extension | imports )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 161:
                {
                alt3=1;
                }
                break;
            case MUSTUND:
            case 162:
                {
                alt3=2;
                }
                break;
            case 187:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:5: namespace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_sub_declaration361);
                    namespace4=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace4.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:17: extension
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_extension_in_sub_declaration365);
                    extension5=extension();

                    state._fsp--;

                    adaptor.addChild(root_0, extension5.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:29: imports
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_imports_in_sub_declaration369);
                    imports6=imports();

                    state._fsp--;

                    adaptor.addChild(root_0, imports6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub_declaration"

    public static class process_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "process"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:105:1: process : ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) ;
    public final BPELscriptParser.process_return process() throws RecognitionException {
        BPELscriptParser.process_return retval = new BPELscriptParser.process_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token sjf=null;
        Token exitOnStandardFault=null;
        Token string_literal7=null;
        List list_j=null;
        List list_s=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.ns_id_return ns_id8 = null;

        BPELscriptParser.std_attr_return std_attr9 = null;

        BPELscriptParser.block_return block10 = null;

        BPELscriptParser.eventHdl_return eventHdl11 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        CommonTree sjf_tree=null;
        CommonTree exitOnStandardFault_tree=null;
        CommonTree string_literal7_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:2: ( ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:4: ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:4: ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt4=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt4=2;
                    }
                    break;
                case SJF:
                    {
                    alt4=3;
                    }
                    break;
                case EOSF:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:6: {...}?q= queryLg
            	    {
            	    if ( !(q==null) ) {
            	        throw new FailedPredicateException(input, "process", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_process389);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:30: {...}?e= exprLg
            	    {
            	    if ( !(e==null) ) {
            	        throw new FailedPredicateException(input, "process", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_process398);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:53: {...}?sjf= SJF
            	    {
            	    if ( !(sjf==null) ) {
            	        throw new FailedPredicateException(input, "process", "sjf==null");
            	    }
            	    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_process407);  
            	    stream_SJF.add(sjf);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:77: {...}?exitOnStandardFault= EOSF
            	    {
            	    if ( !(exitOnStandardFault==null) ) {
            	        throw new FailedPredicateException(input, "process", "exitOnStandardFault==null");
            	    }
            	    exitOnStandardFault=(Token)match(input,EOSF,FOLLOW_EOSF_in_process416);  
            	    stream_EOSF.add(exitOnStandardFault);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            string_literal7=(Token)match(input,109,FOLLOW_109_in_process424);  
            stream_109.add(string_literal7);

            pushFollow(FOLLOW_ns_id_in_process426);
            ns_id8=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id8.getTree());
            pushFollow(FOLLOW_std_attr_in_process428);
            std_attr9=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr9.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:4: (j+= ajoin )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==126) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_process434);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: (s+= asignal )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==125) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_process439);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_process445);
            block10=block();

            state._fsp--;

            stream_block.add(block10.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:110:9: ( eventHdl )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==144) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:110:9: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process447);
                    eventHdl11=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl11.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: exitOnStandardFault, exprLg, ajoin, asignal, sjf, std_attr, block, queryLg, eventHdl, ns_id
            // token labels: exitOnStandardFault, sjf
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_exitOnStandardFault=new RewriteRuleTokenStream(adaptor,"token exitOnStandardFault",exitOnStandardFault);
            RewriteRuleTokenStream stream_sjf=new RewriteRuleTokenStream(adaptor,"token sjf",sjf);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:2: -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:5: ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCESS, "PROCESS"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:27: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:37: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:46: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:54: ( $sjf)?
                if ( stream_sjf.hasNext() ) {
                    adaptor.addChild(root_1, stream_sjf.nextNode());

                }
                stream_sjf.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:60: ( $exitOnStandardFault)?
                if ( stream_exitOnStandardFault.hasNext() ) {
                    adaptor.addChild(root_1, stream_exitOnStandardFault.nextNode());

                }
                stream_exitOnStandardFault.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:91: ( ajoin )?
                if ( stream_ajoin.hasNext() ) {
                    adaptor.addChild(root_1, stream_ajoin.nextTree());

                }
                stream_ajoin.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:98: ( asignal )*
                while ( stream_asignal.hasNext() ) {
                    adaptor.addChild(root_1, stream_asignal.nextTree());

                }
                stream_asignal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "process"

    public static class proc_stmts_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proc_stmts"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:114:1: proc_stmts : ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) ;
    public final BPELscriptParser.proc_stmts_return proc_stmts() throws RecognitionException {
        BPELscriptParser.proc_stmts_return retval = new BPELscriptParser.proc_stmts_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI13=null;
        Token SEMI15=null;
        List list_s=null;
        BPELscriptParser.join_return join12 = null;

        BPELscriptParser.proc_stmt_return proc_stmt14 = null;

        RuleReturnScope s = null;
        CommonTree SEMI13_tree=null;
        CommonTree SEMI15_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_proc_stmt=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmt");
        RewriteRuleSubtreeStream stream_signal=new RewriteRuleSubtreeStream(adaptor,"rule signal");
        RewriteRuleSubtreeStream stream_join=new RewriteRuleSubtreeStream(adaptor,"rule join");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:2: ( ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:4: ( join SEMI )? proc_stmt (s+= signal SEMI )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:4: ( join SEMI )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==127) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:5: join SEMI
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts502);
                    join12=join();

                    state._fsp--;

                    stream_join.add(join12.getTree());
                    SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts504);  
                    stream_SEMI.add(SEMI13);


                    }
                    break;

            }

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts508);
            proc_stmt14=proc_stmt();

            state._fsp--;

            stream_proc_stmt.add(proc_stmt14.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:27: (s+= signal SEMI )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==124) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:28: s+= signal SEMI
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts513);
            	    s=signal();

            	    state._fsp--;

            	    stream_signal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);

            	    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts515);  
            	    stream_SEMI.add(SEMI15);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: proc_stmt, signal, join
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:2: -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:6: ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_STMTS, "PROC_STMTS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:19: ( join )?
                if ( stream_join.hasNext() ) {
                    adaptor.addChild(root_1, stream_join.nextTree());

                }
                stream_join.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:25: ( signal )*
                while ( stream_signal.hasNext() ) {
                    adaptor.addChild(root_1, stream_signal.nextTree());

                }
                stream_signal.reset();
                adaptor.addChild(root_1, stream_proc_stmt.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmts"

    public static class proc_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proc_stmt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );
    public final BPELscriptParser.proc_stmt_return proc_stmt() throws RecognitionException {
        BPELscriptParser.proc_stmt_return retval = new BPELscriptParser.proc_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI42=null;
        BPELscriptParser.if_ex_return if_ex16 = null;

        BPELscriptParser.flow_return flow17 = null;

        BPELscriptParser.pick_return pick18 = null;

        BPELscriptParser.while_ex_return while_ex19 = null;

        BPELscriptParser.until_ex_return until_ex20 = null;

        BPELscriptParser.foreach_return foreach21 = null;

        BPELscriptParser.scope_ex_return scope_ex22 = null;

        BPELscriptParser.ext_act_return ext_act23 = null;

        BPELscriptParser.try_ex_return try_ex24 = null;

        BPELscriptParser.corr_sets_return corr_sets25 = null;

        BPELscriptParser.invoke_return invoke26 = null;

        BPELscriptParser.receive_return receive27 = null;

        BPELscriptParser.reply_return reply28 = null;

        BPELscriptParser.assign_return assign29 = null;

        BPELscriptParser.throw_ex_return throw_ex30 = null;

        BPELscriptParser.rethrow_ex_return rethrow_ex31 = null;

        BPELscriptParser.alarm_return alarm32 = null;

        BPELscriptParser.timeout_return timeout33 = null;

        BPELscriptParser.exit_return exit34 = null;

        BPELscriptParser.variables_return variables35 = null;

        BPELscriptParser.validate_return validate36 = null;

        BPELscriptParser.partner_links_return partner_links37 = null;

        BPELscriptParser.compensate_return compensate38 = null;

        BPELscriptParser.nop_return nop39 = null;

        BPELscriptParser.messages_return messages40 = null;

        BPELscriptParser.opaque_return opaque41 = null;


        CommonTree SEMI42_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:2: ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) )
            int alt11=11;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:3: if_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_ex_in_proc_stmt546);
                    if_ex16=if_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, if_ex16.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:11: flow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flow_in_proc_stmt550);
                    flow17=flow();

                    state._fsp--;

                    adaptor.addChild(root_0, flow17.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:18: pick
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pick_in_proc_stmt554);
                    pick18=pick();

                    state._fsp--;

                    adaptor.addChild(root_0, pick18.getTree());

                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:25: while_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_ex_in_proc_stmt558);
                    while_ex19=while_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, while_ex19.getTree());

                    }
                    break;
                case 5 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:36: until_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_until_ex_in_proc_stmt562);
                    until_ex20=until_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, until_ex20.getTree());

                    }
                    break;
                case 6 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:47: foreach
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_in_proc_stmt566);
                    foreach21=foreach();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach21.getTree());

                    }
                    break;
                case 7 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:57: scope_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scope_ex_in_proc_stmt570);
                    scope_ex22=scope_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, scope_ex22.getTree());

                    }
                    break;
                case 8 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:68: ext_act
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ext_act_in_proc_stmt574);
                    ext_act23=ext_act();

                    state._fsp--;

                    adaptor.addChild(root_0, ext_act23.getTree());

                    }
                    break;
                case 9 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:121:5: try_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_ex_in_proc_stmt581);
                    try_ex24=try_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, try_ex24.getTree());

                    }
                    break;
                case 10 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:121:14: corr_sets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_corr_sets_in_proc_stmt585);
                    corr_sets25=corr_sets();

                    state._fsp--;

                    adaptor.addChild(root_0, corr_sets25.getTree());

                    }
                    break;
                case 11 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )
                    int alt10=16;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:7: invoke
                            {
                            pushFollow(FOLLOW_invoke_in_proc_stmt596);
                            invoke26=invoke();

                            state._fsp--;

                            adaptor.addChild(root_0, invoke26.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:16: receive
                            {
                            pushFollow(FOLLOW_receive_in_proc_stmt600);
                            receive27=receive();

                            state._fsp--;

                            adaptor.addChild(root_0, receive27.getTree());

                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:26: reply
                            {
                            pushFollow(FOLLOW_reply_in_proc_stmt604);
                            reply28=reply();

                            state._fsp--;

                            adaptor.addChild(root_0, reply28.getTree());

                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:34: assign
                            {
                            pushFollow(FOLLOW_assign_in_proc_stmt608);
                            assign29=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign29.getTree());

                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:43: throw_ex
                            {
                            pushFollow(FOLLOW_throw_ex_in_proc_stmt612);
                            throw_ex30=throw_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, throw_ex30.getTree());

                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:54: rethrow_ex
                            {
                            pushFollow(FOLLOW_rethrow_ex_in_proc_stmt616);
                            rethrow_ex31=rethrow_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, rethrow_ex31.getTree());

                            }
                            break;
                        case 7 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:67: alarm
                            {
                            pushFollow(FOLLOW_alarm_in_proc_stmt620);
                            alarm32=alarm();

                            state._fsp--;

                            adaptor.addChild(root_0, alarm32.getTree());

                            }
                            break;
                        case 8 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:75: timeout
                            {
                            pushFollow(FOLLOW_timeout_in_proc_stmt624);
                            timeout33=timeout();

                            state._fsp--;

                            adaptor.addChild(root_0, timeout33.getTree());

                            }
                            break;
                        case 9 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:85: exit
                            {
                            pushFollow(FOLLOW_exit_in_proc_stmt628);
                            exit34=exit();

                            state._fsp--;

                            adaptor.addChild(root_0, exit34.getTree());

                            }
                            break;
                        case 10 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:5: variables
                            {
                            pushFollow(FOLLOW_variables_in_proc_stmt634);
                            variables35=variables();

                            state._fsp--;

                            adaptor.addChild(root_0, variables35.getTree());

                            }
                            break;
                        case 11 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:17: validate
                            {
                            pushFollow(FOLLOW_validate_in_proc_stmt638);
                            validate36=validate();

                            state._fsp--;

                            adaptor.addChild(root_0, validate36.getTree());

                            }
                            break;
                        case 12 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:28: partner_links
                            {
                            pushFollow(FOLLOW_partner_links_in_proc_stmt642);
                            partner_links37=partner_links();

                            state._fsp--;

                            adaptor.addChild(root_0, partner_links37.getTree());

                            }
                            break;
                        case 13 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:44: compensate
                            {
                            pushFollow(FOLLOW_compensate_in_proc_stmt646);
                            compensate38=compensate();

                            state._fsp--;

                            adaptor.addChild(root_0, compensate38.getTree());

                            }
                            break;
                        case 14 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:57: nop
                            {
                            pushFollow(FOLLOW_nop_in_proc_stmt650);
                            nop39=nop();

                            state._fsp--;

                            adaptor.addChild(root_0, nop39.getTree());

                            }
                            break;
                        case 15 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:63: messages
                            {
                            pushFollow(FOLLOW_messages_in_proc_stmt654);
                            messages40=messages();

                            state._fsp--;

                            adaptor.addChild(root_0, messages40.getTree());

                            }
                            break;
                        case 16 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:74: opaque
                            {
                            pushFollow(FOLLOW_opaque_in_proc_stmt658);
                            opaque41=opaque();

                            state._fsp--;

                            adaptor.addChild(root_0, opaque41.getTree());

                            }
                            break;

                    }

                    SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmt661); 

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmt"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:1: block : '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) ;
    public final BPELscriptParser.block_return block() throws RecognitionException {
        BPELscriptParser.block_return retval = new BPELscriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        BPELscriptParser.proc_stmts_return proc_stmts44 = null;


        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:8: ( '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:10: '{' ( proc_stmts )+ '}'
            {
            char_literal43=(Token)match(input,110,FOLLOW_110_in_block672);  
            stream_110.add(char_literal43);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:14: ( proc_stmts )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=SJF && LA12_0<=EOSF)||(LA12_0>=ID && LA12_0<=CREATE_INST)||(LA12_0>=OPAQUE_EXPR && LA12_0<=ISOLATED)||(LA12_0>=VALID && LA12_0<=IGNORE)||LA12_0==EXT_ACT||(LA12_0>=114 && LA12_0<=115)||(LA12_0>=119 && LA12_0<=120)||LA12_0==122||(LA12_0>=127 && LA12_0<=128)||(LA12_0>=131 && LA12_0<=132)||LA12_0==134||LA12_0==138||LA12_0==142||(LA12_0>=149 && LA12_0<=160)||(LA12_0>=165 && LA12_0<=169)||(LA12_0>=181 && LA12_0<=184)||(LA12_0>=189 && LA12_0<=190)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:14: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block674);
            	    proc_stmts44=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts44.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            char_literal45=(Token)match(input,111,FOLLOW_111_in_block677);  
            stream_111.add(char_literal45);



            // AST REWRITE
            // elements: proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:30: -> ^( SEQUENCE ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:33: ^( SEQUENCE ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class scope_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:1: scope_block : '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) ;
    public final BPELscriptParser.scope_block_return scope_block() throws RecognitionException {
        BPELscriptParser.scope_block_return retval = new BPELscriptParser.scope_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal46=null;
        Token char_literal49=null;
        BPELscriptParser.sub_declaration_return sub_declaration47 = null;

        BPELscriptParser.proc_stmts_return proc_stmts48 = null;


        CommonTree char_literal46_tree=null;
        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_sub_declaration=new RewriteRuleSubtreeStream(adaptor,"rule sub_declaration");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:13: ( '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:15: '{' ( sub_declaration )* ( proc_stmts )+ '}'
            {
            char_literal46=(Token)match(input,110,FOLLOW_110_in_scope_block695);  
            stream_110.add(char_literal46);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:19: ( sub_declaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MUSTUND||(LA13_0>=161 && LA13_0<=162)||LA13_0==187) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:19: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block697);
            	    sub_declaration47=sub_declaration();

            	    state._fsp--;

            	    stream_sub_declaration.add(sub_declaration47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:36: ( proc_stmts )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=SJF && LA14_0<=EOSF)||(LA14_0>=ID && LA14_0<=CREATE_INST)||(LA14_0>=OPAQUE_EXPR && LA14_0<=ISOLATED)||(LA14_0>=VALID && LA14_0<=IGNORE)||LA14_0==EXT_ACT||(LA14_0>=114 && LA14_0<=115)||(LA14_0>=119 && LA14_0<=120)||LA14_0==122||(LA14_0>=127 && LA14_0<=128)||(LA14_0>=131 && LA14_0<=132)||LA14_0==134||LA14_0==138||LA14_0==142||(LA14_0>=149 && LA14_0<=160)||(LA14_0>=165 && LA14_0<=169)||(LA14_0>=181 && LA14_0<=184)||(LA14_0>=189 && LA14_0<=190)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:36: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block700);
            	    proc_stmts48=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts48.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            char_literal49=(Token)match(input,111,FOLLOW_111_in_scope_block703);  
            stream_111.add(char_literal49);



            // AST REWRITE
            // elements: sub_declaration, proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:52: -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:55: ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:66: ( sub_declaration )*
                while ( stream_sub_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_sub_declaration.nextTree());

                }
                stream_sub_declaration.reset();
                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_block"

    public static class param_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:1: param_block : '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) ;
    public final BPELscriptParser.param_block_return param_block() throws RecognitionException {
        BPELscriptParser.param_block_return retval = new BPELscriptParser.param_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token in=null;
        List list_in=null;
        BPELscriptParser.proc_stmts_return proc_stmts54 = null;


        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree in_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:13: ( '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:15: '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}'
            {
            char_literal50=(Token)match(input,110,FOLLOW_110_in_param_block723);  
            stream_110.add(char_literal50);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:19: ( '|' in+= ID ( ',' in+= ID )* '|' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==112) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:20: '|' in+= ID ( ',' in+= ID )* '|'
                    {
                    char_literal51=(Token)match(input,112,FOLLOW_112_in_param_block726);  
                    stream_112.add(char_literal51);

                    in=(Token)match(input,ID,FOLLOW_ID_in_param_block730);  
                    stream_ID.add(in);

                    if (list_in==null) list_in=new ArrayList();
                    list_in.add(in);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:31: ( ',' in+= ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==113) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:32: ',' in+= ID
                    	    {
                    	    char_literal52=(Token)match(input,113,FOLLOW_113_in_param_block733);  
                    	    stream_113.add(char_literal52);

                    	    in=(Token)match(input,ID,FOLLOW_ID_in_param_block737);  
                    	    stream_ID.add(in);

                    	    if (list_in==null) list_in=new ArrayList();
                    	    list_in.add(in);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal53=(Token)match(input,112,FOLLOW_112_in_param_block741);  
                    stream_112.add(char_literal53);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:51: ( proc_stmts )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=SJF && LA17_0<=EOSF)||(LA17_0>=ID && LA17_0<=CREATE_INST)||(LA17_0>=OPAQUE_EXPR && LA17_0<=ISOLATED)||(LA17_0>=VALID && LA17_0<=IGNORE)||LA17_0==EXT_ACT||(LA17_0>=114 && LA17_0<=115)||(LA17_0>=119 && LA17_0<=120)||LA17_0==122||(LA17_0>=127 && LA17_0<=128)||(LA17_0>=131 && LA17_0<=132)||LA17_0==134||LA17_0==138||LA17_0==142||(LA17_0>=149 && LA17_0<=160)||(LA17_0>=165 && LA17_0<=169)||(LA17_0>=181 && LA17_0<=184)||(LA17_0>=189 && LA17_0<=190)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:51: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block745);
            	    proc_stmts54=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts54.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            char_literal55=(Token)match(input,111,FOLLOW_111_in_param_block748);  
            stream_111.add(char_literal55);



            // AST REWRITE
            // elements: proc_stmts, in
            // token labels: 
            // rule labels: retval
            // token list labels: in
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_in=new RewriteRuleTokenStream(adaptor,"token in", list_in);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:67: -> ^( SEQUENCE ( $in)* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:70: ^( SEQUENCE ( $in)* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:81: ( $in)*
                while ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_block"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:1: body : ( block | proc_stmts );
    public final BPELscriptParser.body_return body() throws RecognitionException {
        BPELscriptParser.body_return retval = new BPELscriptParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.block_return block56 = null;

        BPELscriptParser.proc_stmts_return proc_stmts57 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:7: ( block | proc_stmts )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==110) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=SJF && LA18_0<=EOSF)||(LA18_0>=ID && LA18_0<=CREATE_INST)||(LA18_0>=OPAQUE_EXPR && LA18_0<=ISOLATED)||(LA18_0>=VALID && LA18_0<=IGNORE)||LA18_0==EXT_ACT||(LA18_0>=114 && LA18_0<=115)||(LA18_0>=119 && LA18_0<=120)||LA18_0==122||(LA18_0>=127 && LA18_0<=128)||(LA18_0>=131 && LA18_0<=132)||LA18_0==134||LA18_0==138||LA18_0==142||(LA18_0>=149 && LA18_0<=160)||(LA18_0>=165 && LA18_0<=169)||(LA18_0>=181 && LA18_0<=184)||(LA18_0>=189 && LA18_0<=190)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_body770);
                    block56=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block56.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:17: proc_stmts
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proc_stmts_in_body774);
                    proc_stmts57=proc_stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, proc_stmts57.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class pick_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pick"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:1: pick : ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.pick_return pick() throws RecognitionException {
        BPELscriptParser.pick_return retval = new BPELscriptParser.pick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal63=null;
        BPELscriptParser.onMessage_return onMessage61 = null;

        BPELscriptParser.onAlarm_return onAlarm62 = null;


        CommonTree c_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        RewriteRuleSubtreeStream stream_onMessage=new RewriteRuleSubtreeStream(adaptor,"rule onMessage");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:6: ( ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:8: ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:8: ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case CREATE_INST:
                    {
                    alt19=1;
                    }
                    break;
                case 114:
                    {
                    alt19=2;
                    }
                    break;
                case SJF:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:10: {...}?c= CREATE_INST
            	    {
            	    if ( !(c==null) ) {
            	        throw new FailedPredicateException(input, "pick", "c==null");
            	    }
            	    c=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick789);  
            	    stream_CREATE_INST.add(c);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "pick", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:27: '@name' name= STRING
            	    {
            	    string_literal58=(Token)match(input,114,FOLLOW_114_in_pick816);  
            	    stream_114.add(string_literal58);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_pick820);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "pick", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_pick829);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal59=(Token)match(input,115,FOLLOW_115_in_pick836);  
            stream_115.add(string_literal59);

            char_literal60=(Token)match(input,110,FOLLOW_110_in_pick838);  
            stream_110.add(char_literal60);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:14: ( onMessage )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==116||(LA20_0>=181 && LA20_0<=184)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:14: onMessage
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick840);
            	    onMessage61=onMessage();

            	    state._fsp--;

            	    stream_onMessage.add(onMessage61.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:25: ( onAlarm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SJF||LA21_0==110||LA21_0==114||(LA21_0>=119 && LA21_0<=121)||(LA21_0>=125 && LA21_0<=126)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:25: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick843);
            	    onAlarm62=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm62.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal63=(Token)match(input,111,FOLLOW_111_in_pick846);  
            stream_111.add(char_literal63);



            // AST REWRITE
            // elements: name, onMessage, onAlarm, SJF, CREATE_INST
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:38: -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:41: ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PICK, "PICK"), root_1);

                if ( !(stream_onMessage.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_onMessage.hasNext() ) {
                    adaptor.addChild(root_1, stream_onMessage.nextTree());

                }
                stream_onMessage.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:59: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:68: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:81: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:88: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pick"

    public static class onMessage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onMessage"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:141:1: onMessage : ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) ;
    public final BPELscriptParser.onMessage_return onMessage() throws RecognitionException {
        BPELscriptParser.onMessage_return retval = new BPELscriptParser.onMessage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token string_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        BPELscriptParser.portType_return pT = null;

        BPELscriptParser.msgEx_return m = null;

        BPELscriptParser.correlation_return correlation68 = null;

        BPELscriptParser.with_ex_return with_ex70 = null;

        BPELscriptParser.param_block_return param_block71 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:10: ( ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:12: ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:12: ({...}?pT= portType | {...}?m= msgEx )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=181 && LA22_0<=182)) ) {
                    alt22=1;
                }
                else if ( ((LA22_0>=183 && LA22_0<=184)) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:14: {...}?pT= portType
            	    {
            	    if ( !(pT==null) ) {
            	        throw new FailedPredicateException(input, "onMessage", "pT==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_onMessage899);
            	    pT=portType();

            	    state._fsp--;

            	    stream_portType.add(pT.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:40: {...}?m= msgEx
            	    {
            	    if ( !(m==null) ) {
            	        throw new FailedPredicateException(input, "onMessage", "m==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_onMessage907);
            	    m=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            string_literal64=(Token)match(input,116,FOLLOW_116_in_onMessage914);  
            stream_116.add(string_literal64);

            char_literal65=(Token)match(input,117,FOLLOW_117_in_onMessage916);  
            stream_117.add(char_literal65);

            p=(Token)match(input,ID,FOLLOW_ID_in_onMessage920);  
            stream_ID.add(p);

            char_literal66=(Token)match(input,113,FOLLOW_113_in_onMessage922);  
            stream_113.add(char_literal66);

            o=(Token)match(input,ID,FOLLOW_ID_in_onMessage926);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:33: ( ',' correlation )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==113) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:34: ',' correlation
                    {
                    char_literal67=(Token)match(input,113,FOLLOW_113_in_onMessage929);  
                    stream_113.add(char_literal67);

                    pushFollow(FOLLOW_correlation_in_onMessage931);
                    correlation68=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation68.getTree());

                    }
                    break;

            }

            char_literal69=(Token)match(input,118,FOLLOW_118_in_onMessage935);  
            stream_118.add(char_literal69);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:56: ( with_ex )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==147) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:56: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage937);
                    with_ex70=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex70.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_onMessage950);
            param_block71=param_block();

            state._fsp--;

            stream_param_block.add(param_block71.getTree());


            // AST REWRITE
            // elements: with_ex, portType, param_block, correlation, ID, ID, msgEx
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:11: -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:14: ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONMESSAGE, "ONMESSAGE"), root_1);

                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:38: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:48: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:61: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:74: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onMessage"

    public static class onAlarm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onAlarm"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:148:1: onAlarm : {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) ;
    public final BPELscriptParser.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptParser.onAlarm_return retval = new BPELscriptParser.onAlarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.alarm_return alarm72 = null;

        BPELscriptParser.timeout_return timeout73 = null;

        BPELscriptParser.repeatEvery_return repeatEvery74 = null;

        BPELscriptParser.scope_short_return scope_short75 = null;


        RewriteRuleSubtreeStream stream_alarm=new RewriteRuleSubtreeStream(adaptor,"rule alarm");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_repeatEvery=new RewriteRuleSubtreeStream(adaptor,"rule repeatEvery");
        RewriteRuleSubtreeStream stream_timeout=new RewriteRuleSubtreeStream(adaptor,"rule timeout");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:149:2: ({...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:151:3: {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short
            {
            if ( !(input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"alarm\") || input.LT(1).getText().equals(\"timeout\") || input.LT(1).getText().equals(\"repeatEvery\")");
            }
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:3: ( alarm | timeout )?
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:4: alarm
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm1022);
                    alarm72=alarm();

                    state._fsp--;

                    stream_alarm.add(alarm72.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:12: timeout
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm1026);
                    timeout73=timeout();

                    state._fsp--;

                    stream_timeout.add(timeout73.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:22: ( repeatEvery )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==121) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:22: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm1030);
                    repeatEvery74=repeatEvery();

                    state._fsp--;

                    stream_repeatEvery.add(repeatEvery74.getTree());

                    }
                    break;

            }

            if ( !(input.LT(1).getText().equals("{")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"{\")");
            }
            pushFollow(FOLLOW_scope_short_in_onAlarm1035);
            scope_short75=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short75.getTree());


            // AST REWRITE
            // elements: scope_short, timeout, repeatEvery, alarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:2: -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:5: ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONALARM, "ONALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:15: ( alarm )?
                if ( stream_alarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_alarm.nextTree());

                }
                stream_alarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:22: ( timeout )?
                if ( stream_timeout.hasNext() ) {
                    adaptor.addChild(root_1, stream_timeout.nextTree());

                }
                stream_timeout.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:31: ( repeatEvery )?
                if ( stream_repeatEvery.hasNext() ) {
                    adaptor.addChild(root_1, stream_repeatEvery.nextTree());

                }
                stream_repeatEvery.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onAlarm"

    public static class alarm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alarm"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:1: alarm : std_attr 'alarm' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) ;
    public final BPELscriptParser.alarm_return alarm() throws RecognitionException {
        BPELscriptParser.alarm_return retval = new BPELscriptParser.alarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal77=null;
        Token char_literal78=null;
        Token OPAQUE_EXPR80=null;
        Token char_literal81=null;
        BPELscriptParser.std_attr_return std_attr76 = null;

        BPELscriptParser.expr_return expr79 = null;


        CommonTree string_literal77_tree=null;
        CommonTree char_literal78_tree=null;
        CommonTree OPAQUE_EXPR80_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:8: ( std_attr 'alarm' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:10: std_attr 'alarm' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            pushFollow(FOLLOW_std_attr_in_alarm1070);
            std_attr76=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr76.getTree());
            string_literal77=(Token)match(input,119,FOLLOW_119_in_alarm1075);  
            stream_119.add(string_literal77);

            char_literal78=(Token)match(input,117,FOLLOW_117_in_alarm1077);  
            stream_117.add(char_literal78);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:16: ( expr | OPAQUE_EXPR )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EXT_EXPR||LA27_0==ID||LA27_0==STRING||LA27_0==INT||LA27_0==117) ) {
                alt27=1;
            }
            else if ( (LA27_0==OPAQUE_EXPR) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_alarm1080);
                    expr79=expr();

                    state._fsp--;

                    stream_expr.add(expr79.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:24: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR80=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_alarm1084);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR80);


                    }
                    break;

            }

            char_literal81=(Token)match(input,118,FOLLOW_118_in_alarm1087);  
            stream_118.add(char_literal81);



            // AST REWRITE
            // elements: std_attr, OPAQUE_EXPR, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 157:3: -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:7: ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALARM, "ALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:35: ( std_attr )?
                if ( stream_std_attr.hasNext() ) {
                    adaptor.addChild(root_1, stream_std_attr.nextTree());

                }
                stream_std_attr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alarm"

    public static class timeout_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeout"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:1: timeout : std_attr 'timeout' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) ;
    public final BPELscriptParser.timeout_return timeout() throws RecognitionException {
        BPELscriptParser.timeout_return retval = new BPELscriptParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token OPAQUE_EXPR86=null;
        Token char_literal87=null;
        BPELscriptParser.std_attr_return std_attr82 = null;

        BPELscriptParser.expr_return expr85 = null;


        CommonTree string_literal83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree OPAQUE_EXPR86_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:9: ( std_attr 'timeout' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:11: std_attr 'timeout' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            pushFollow(FOLLOW_std_attr_in_timeout1116);
            std_attr82=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr82.getTree());
            string_literal83=(Token)match(input,120,FOLLOW_120_in_timeout1121);  
            stream_120.add(string_literal83);

            char_literal84=(Token)match(input,117,FOLLOW_117_in_timeout1123);  
            stream_117.add(char_literal84);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:18: ( expr | OPAQUE_EXPR )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EXT_EXPR||LA28_0==ID||LA28_0==STRING||LA28_0==INT||LA28_0==117) ) {
                alt28=1;
            }
            else if ( (LA28_0==OPAQUE_EXPR) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_timeout1126);
                    expr85=expr();

                    state._fsp--;

                    stream_expr.add(expr85.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:26: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR86=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_timeout1130);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR86);


                    }
                    break;

            }

            char_literal87=(Token)match(input,118,FOLLOW_118_in_timeout1133);  
            stream_118.add(char_literal87);



            // AST REWRITE
            // elements: std_attr, expr, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:3: -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:6: ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMEOUT, "TIMEOUT"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:35: ( std_attr )?
                if ( stream_std_attr.hasNext() ) {
                    adaptor.addChild(root_1, stream_std_attr.nextTree());

                }
                stream_std_attr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeout"

    public static class repeatEvery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatEvery"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:1: repeatEvery : 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptParser.repeatEvery_return retval = new BPELscriptParser.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal89=null;
        Token OPAQUE_EXPR91=null;
        Token char_literal92=null;
        BPELscriptParser.expr_return expr90 = null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree OPAQUE_EXPR91_tree=null;
        CommonTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:2: ( 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:4: 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            string_literal88=(Token)match(input,121,FOLLOW_121_in_repeatEvery1161);  
            stream_121.add(string_literal88);

            char_literal89=(Token)match(input,117,FOLLOW_117_in_repeatEvery1163);  
            stream_117.add(char_literal89);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:22: ( expr | OPAQUE_EXPR )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EXT_EXPR||LA29_0==ID||LA29_0==STRING||LA29_0==INT||LA29_0==117) ) {
                alt29=1;
            }
            else if ( (LA29_0==OPAQUE_EXPR) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_repeatEvery1166);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:30: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR91=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_repeatEvery1170);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR91);


                    }
                    break;

            }

            char_literal92=(Token)match(input,118,FOLLOW_118_in_repeatEvery1173);  
            stream_118.add(char_literal92);



            // AST REWRITE
            // elements: expr, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:2: -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:5: ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATEVERY, "REPEATEVERY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:19: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:25: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "repeatEvery"

    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:1: flow : std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) ;
    public final BPELscriptParser.flow_return flow() throws RecognitionException {
        BPELscriptParser.flow_return retval = new BPELscriptParser.flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal94=null;
        Token string_literal95=null;
        List list_s=null;
        BPELscriptParser.std_attr_return std_attr93 = null;

        RuleReturnScope s = null;
        CommonTree string_literal94_tree=null;
        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:7: ( std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:9: std_attr 'parallel' s+= sequence ( 'and' s+= sequence )*
            {
            pushFollow(FOLLOW_std_attr_in_flow1196);
            std_attr93=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr93.getTree());
            string_literal94=(Token)match(input,122,FOLLOW_122_in_flow1200);  
            stream_122.add(string_literal94);

            pushFollow(FOLLOW_sequence_in_flow1204);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            if (list_s==null) list_s=new ArrayList();
            list_s.add(s);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:26: ( 'and' s+= sequence )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==123) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:28: 'and' s+= sequence
            	    {
            	    string_literal95=(Token)match(input,123,FOLLOW_123_in_flow1208);  
            	    stream_123.add(string_literal95);

            	    pushFollow(FOLLOW_sequence_in_flow1212);
            	    s=sequence();

            	    state._fsp--;

            	    stream_sequence.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: std_attr, s
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: s
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            root_0 = (CommonTree)adaptor.nil();
            // 169:2: -> ^( FLOW ( $s)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:6: ^( FLOW ( $s)+ std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLOW, "FLOW"), root_1);

                if ( !(stream_s.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_s.nextTree()).getTree());

                }
                stream_s.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow"

    public static class signal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signal"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:1: signal : 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.signal_return signal() throws RecognitionException {
        BPELscriptParser.signal_return retval = new BPELscriptParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        Token char_literal97=null;
        Token ID98=null;
        Token char_literal99=null;
        Token OPAQUE_EXPR101=null;
        Token char_literal102=null;
        BPELscriptParser.expr_return expr100 = null;


        CommonTree string_literal96_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree ID98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree OPAQUE_EXPR101_tree=null;
        CommonTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:9: ( 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:11: 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal96=(Token)match(input,124,FOLLOW_124_in_signal1239);  
            stream_124.add(string_literal96);

            char_literal97=(Token)match(input,117,FOLLOW_117_in_signal1241);  
            stream_117.add(char_literal97);

            ID98=(Token)match(input,ID,FOLLOW_ID_in_signal1242);  
            stream_ID.add(ID98);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:26: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==113) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:27: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal99=(Token)match(input,113,FOLLOW_113_in_signal1245);  
                    stream_113.add(char_literal99);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:31: ( expr | OPAQUE_EXPR )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==EXT_EXPR||LA31_0==ID||LA31_0==STRING||LA31_0==INT||LA31_0==117) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==OPAQUE_EXPR) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:32: expr
                            {
                            pushFollow(FOLLOW_expr_in_signal1248);
                            expr100=expr();

                            state._fsp--;

                            stream_expr.add(expr100.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:39: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR101=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_signal1252);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR101);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal102=(Token)match(input,118,FOLLOW_118_in_signal1257);  
            stream_118.add(char_literal102);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:58: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:61: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:73: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:79: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signal"

    public static class asignal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asignal"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:1: asignal : '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.asignal_return asignal() throws RecognitionException {
        BPELscriptParser.asignal_return retval = new BPELscriptParser.asignal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal103=null;
        Token char_literal104=null;
        Token ID105=null;
        Token char_literal106=null;
        Token OPAQUE_EXPR108=null;
        Token char_literal109=null;
        BPELscriptParser.expr_return expr107 = null;


        CommonTree string_literal103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree ID105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree OPAQUE_EXPR108_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:9: ( '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:11: '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal103=(Token)match(input,125,FOLLOW_125_in_asignal1279);  
            stream_125.add(string_literal103);

            char_literal104=(Token)match(input,117,FOLLOW_117_in_asignal1281);  
            stream_117.add(char_literal104);

            ID105=(Token)match(input,ID,FOLLOW_ID_in_asignal1282);  
            stream_ID.add(ID105);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:27: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==113) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:28: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal106=(Token)match(input,113,FOLLOW_113_in_asignal1285);  
                    stream_113.add(char_literal106);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:32: ( expr | OPAQUE_EXPR )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==EXT_EXPR||LA33_0==ID||LA33_0==STRING||LA33_0==INT||LA33_0==117) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==OPAQUE_EXPR) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:33: expr
                            {
                            pushFollow(FOLLOW_expr_in_asignal1288);
                            expr107=expr();

                            state._fsp--;

                            stream_expr.add(expr107.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:40: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR108=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_asignal1292);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR108);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal109=(Token)match(input,118,FOLLOW_118_in_asignal1297);  
            stream_118.add(char_literal109);



            // AST REWRITE
            // elements: expr, OPAQUE_EXPR, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 173:59: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:62: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:74: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:80: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "asignal"

    public static class ajoin_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ajoin"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:1: ajoin : '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.ajoin_return ajoin() throws RecognitionException {
        BPELscriptParser.ajoin_return retval = new BPELscriptParser.ajoin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token OPAQUE_EXPR115=null;
        Token char_literal116=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr114 = null;


        CommonTree string_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree OPAQUE_EXPR115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:8: ( '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:10: '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal110=(Token)match(input,126,FOLLOW_126_in_ajoin1320);  
            stream_126.add(string_literal110);

            char_literal111=(Token)match(input,117,FOLLOW_117_in_ajoin1322);  
            stream_117.add(char_literal111);

            k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1326);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:28: ( ',' k+= ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==113) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==ID) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:29: ',' k+= ID
            	    {
            	    char_literal112=(Token)match(input,113,FOLLOW_113_in_ajoin1329);  
            	    stream_113.add(char_literal112);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1333);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:41: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==113) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:42: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal113=(Token)match(input,113,FOLLOW_113_in_ajoin1338);  
                    stream_113.add(char_literal113);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:46: ( expr | OPAQUE_EXPR )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==EXT_EXPR||LA36_0==ID||LA36_0==STRING||LA36_0==INT||LA36_0==117) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==OPAQUE_EXPR) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:47: expr
                            {
                            pushFollow(FOLLOW_expr_in_ajoin1341);
                            expr114=expr();

                            state._fsp--;

                            stream_expr.add(expr114.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:54: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR115=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_ajoin1345);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR115);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal116=(Token)match(input,118,FOLLOW_118_in_ajoin1350);  
            stream_118.add(char_literal116);



            // AST REWRITE
            // elements: expr, k, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:73: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:76: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JOIN, "JOIN"), root_1);

                if ( !(stream_k.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_k.hasNext() ) {
                    adaptor.addChild(root_1, stream_k.nextNode());

                }
                stream_k.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:87: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:93: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ajoin"

    public static class join_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:1: join : 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.join_return join() throws RecognitionException {
        BPELscriptParser.join_return retval = new BPELscriptParser.join_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token OPAQUE_EXPR122=null;
        Token char_literal123=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr121 = null;


        CommonTree string_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree OPAQUE_EXPR122_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:7: ( 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:9: 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal117=(Token)match(input,127,FOLLOW_127_in_join1375);  
            stream_127.add(string_literal117);

            char_literal118=(Token)match(input,117,FOLLOW_117_in_join1377);  
            stream_117.add(char_literal118);

            k=(Token)match(input,ID,FOLLOW_ID_in_join1381);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:26: ( ',' k+= ID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==113) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:27: ',' k+= ID
            	    {
            	    char_literal119=(Token)match(input,113,FOLLOW_113_in_join1384);  
            	    stream_113.add(char_literal119);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_join1388);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:39: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==113) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:40: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal120=(Token)match(input,113,FOLLOW_113_in_join1393);  
                    stream_113.add(char_literal120);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:44: ( expr | OPAQUE_EXPR )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EXT_EXPR||LA39_0==ID||LA39_0==STRING||LA39_0==INT||LA39_0==117) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==OPAQUE_EXPR) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:45: expr
                            {
                            pushFollow(FOLLOW_expr_in_join1396);
                            expr121=expr();

                            state._fsp--;

                            stream_expr.add(expr121.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:52: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR122=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_join1400);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR122);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal123=(Token)match(input,118,FOLLOW_118_in_join1405);  
            stream_118.add(char_literal123);



            // AST REWRITE
            // elements: expr, k, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:71: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:74: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JOIN, "JOIN"), root_1);

                if ( !(stream_k.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_k.hasNext() ) {
                    adaptor.addChild(root_1, stream_k.nextNode());

                }
                stream_k.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:85: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:91: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join"

    public static class if_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:179:1: if_ex : std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr ) ;
    public final BPELscriptParser.if_ex_return if_ex() throws RecognitionException {
        BPELscriptParser.if_ex_return retval = new BPELscriptParser.if_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token iop=null;
        Token eiop=null;
        Token string_literal125=null;
        Token char_literal126=null;
        Token char_literal127=null;
        Token string_literal128=null;
        Token char_literal129=null;
        Token char_literal130=null;
        Token string_literal131=null;
        List list_sei=null;
        BPELscriptParser.expr_return iex = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.expr_return eiex = null;

        BPELscriptParser.sequence_return se = null;

        BPELscriptParser.std_attr_return std_attr124 = null;

        RuleReturnScope sei = null;
        CommonTree iop_tree=null;
        CommonTree eiop_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree char_literal126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:2: ( std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:4: std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )?
            {
            pushFollow(FOLLOW_std_attr_in_if_ex1430);
            std_attr124=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr124.getTree());
            string_literal125=(Token)match(input,128,FOLLOW_128_in_if_ex1434);  
            stream_128.add(string_literal125);

            char_literal126=(Token)match(input,117,FOLLOW_117_in_if_ex1436);  
            stream_117.add(char_literal126);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:12: (iex= expr | iop= OPAQUE_EXPR )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==EXT_EXPR||LA41_0==ID||LA41_0==STRING||LA41_0==INT||LA41_0==117) ) {
                alt41=1;
            }
            else if ( (LA41_0==OPAQUE_EXPR) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:13: iex= expr
                    {
                    pushFollow(FOLLOW_expr_in_if_ex1441);
                    iex=expr();

                    state._fsp--;

                    stream_expr.add(iex.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:22: iop= OPAQUE_EXPR
                    {
                    iop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1445);  
                    stream_OPAQUE_EXPR.add(iop);


                    }
                    break;

            }

            char_literal127=(Token)match(input,118,FOLLOW_118_in_if_ex1448);  
            stream_118.add(char_literal127);

            pushFollow(FOLLOW_sequence_in_if_ex1452);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:3: ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==129) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:4: 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence
            	    {
            	    string_literal128=(Token)match(input,129,FOLLOW_129_in_if_ex1458);  
            	    stream_129.add(string_literal128);

            	    char_literal129=(Token)match(input,117,FOLLOW_117_in_if_ex1460);  
            	    stream_117.add(char_literal129);

            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:17: (eiex= expr | eiop= OPAQUE_EXPR )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==EXT_EXPR||LA42_0==ID||LA42_0==STRING||LA42_0==INT||LA42_0==117) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==OPAQUE_EXPR) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:18: eiex= expr
            	            {
            	            pushFollow(FOLLOW_expr_in_if_ex1465);
            	            eiex=expr();

            	            state._fsp--;

            	            stream_expr.add(eiex.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:28: eiop= OPAQUE_EXPR
            	            {
            	            eiop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1469);  
            	            stream_OPAQUE_EXPR.add(eiop);


            	            }
            	            break;

            	    }

            	    char_literal130=(Token)match(input,118,FOLLOW_118_in_if_ex1472);  
            	    stream_118.add(char_literal130);

            	    pushFollow(FOLLOW_sequence_in_if_ex1476);
            	    sei=sequence();

            	    state._fsp--;

            	    stream_sequence.add(sei.getTree());
            	    if (list_sei==null) list_sei=new ArrayList();
            	    list_sei.add(sei);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:3: ( 'else' se= sequence )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==130) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:4: 'else' se= sequence
                    {
                    string_literal131=(Token)match(input,130,FOLLOW_130_in_if_ex1484);  
                    stream_130.add(string_literal131);

                    pushFollow(FOLLOW_sequence_in_if_ex1488);
                    se=sequence();

                    state._fsp--;

                    stream_sequence.add(se.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: s, iop, iex, eiex, se, std_attr, sei, eiop
            // token labels: iop, eiop
            // rule labels: retval, eiex, iex, s, se
            // token list labels: 
            // rule list labels: sei
            retval.tree = root_0;
            RewriteRuleTokenStream stream_iop=new RewriteRuleTokenStream(adaptor,"token iop",iop);
            RewriteRuleTokenStream stream_eiop=new RewriteRuleTokenStream(adaptor,"token eiop",eiop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_eiex=new RewriteRuleSubtreeStream(adaptor,"token eiex",eiex!=null?eiex.tree:null);
            RewriteRuleSubtreeStream stream_iex=new RewriteRuleSubtreeStream(adaptor,"token iex",iex!=null?iex.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"token se",se!=null?se.tree:null);
            RewriteRuleSubtreeStream stream_sei=new RewriteRuleSubtreeStream(adaptor,"token sei",list_sei);
            root_0 = (CommonTree)adaptor.nil();
            // 184:2: -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:6: ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:11: ( $iex)?
                if ( stream_iex.hasNext() ) {
                    adaptor.addChild(root_1, stream_iex.nextTree());

                }
                stream_iex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:17: ( $iop)?
                if ( stream_iop.hasNext() ) {
                    adaptor.addChild(root_1, stream_iop.nextNode());

                }
                stream_iop.reset();
                adaptor.addChild(root_1, stream_s.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:26: ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )*
                while ( stream_sei.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:27: ^( ELSIF ( $eiex)? ( $eiop)? $sei)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSIF, "ELSIF"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:35: ( $eiex)?
                    if ( stream_eiex.hasNext() ) {
                        adaptor.addChild(root_2, stream_eiex.nextTree());

                    }
                    stream_eiex.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:42: ( $eiop)?
                    if ( stream_eiop.hasNext() ) {
                        adaptor.addChild(root_2, stream_eiop.nextNode());

                    }
                    stream_eiop.reset();
                    adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_sei.nextTree()).getTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_sei.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:57: ( ^( ELSE $se) )?
                if ( stream_se.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:58: ^( ELSE $se)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);

                    adaptor.addChild(root_2, stream_se.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_se.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_ex"

    public static class sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:1: sequence : std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? ) ;
    public final BPELscriptParser.sequence_return sequence() throws RecognitionException {
        BPELscriptParser.sequence_return retval = new BPELscriptParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.body_return b = null;

        BPELscriptParser.std_attr_return std_attr132 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:2: ( std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:4: std_attr (j+= ajoin )? (s+= asignal )* b= body
            {
            pushFollow(FOLLOW_std_attr_in_sequence1549);
            std_attr132=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr132.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:4: (j+= ajoin )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==126) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_sequence1555);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:14: (s+= asignal )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==125) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_sequence1560);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            pushFollow(FOLLOW_body_in_sequence1567);
            b=body();

            state._fsp--;

            stream_body.add(b.getTree());


            // AST REWRITE
            // elements: s, b, j, std_attr
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: s, j
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"token j",list_j);
            root_0 = (CommonTree)adaptor.nil();
            // 190:2: -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:5: ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:23: ( $s)*
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_s.nextTree()).getTree());

                }
                stream_s.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:27: ( std_attr )?
                if ( stream_std_attr.hasNext() ) {
                    adaptor.addChild(root_1, stream_std_attr.nextTree());

                }
                stream_std_attr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class scope_sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_sequence"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:1: scope_sequence : (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) ;
    public final BPELscriptParser.scope_sequence_return scope_sequence() throws RecognitionException {
        BPELscriptParser.scope_sequence_return retval = new BPELscriptParser.scope_sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.scope_block_return b = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_scope_block=new RewriteRuleSubtreeStream(adaptor,"rule scope_block");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:2: ( (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:4: (j+= ajoin )? (s+= asignal )* b= scope_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:5: (j+= ajoin )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==126) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:5: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_scope_sequence1600);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:15: (s+= asignal )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==125) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:15: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_scope_sequence1605);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            pushFollow(FOLLOW_scope_block_in_scope_sequence1613);
            b=scope_block();

            state._fsp--;

            stream_scope_block.add(b.getTree());


            // AST REWRITE
            // elements: j, s, b
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: s, j
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"token b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"token j",list_j);
            root_0 = (CommonTree)adaptor.nil();
            // 196:2: -> ^( SEQUENCE ( $j)? $b ( $s)* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:196:5: ^( SEQUENCE ( $j)? $b ( $s)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:196:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:196:23: ( $s)*
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_s.nextTree()).getTree());

                }
                stream_s.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_sequence"

    public static class while_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:1: while_ex : std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) ;
    public final BPELscriptParser.while_ex_return while_ex() throws RecognitionException {
        BPELscriptParser.while_ex_return retval = new BPELscriptParser.while_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal134=null;
        Token char_literal135=null;
        Token OPAQUE_EXPR137=null;
        Token char_literal138=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr133 = null;

        BPELscriptParser.expr_return expr136 = null;


        CommonTree string_literal134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree OPAQUE_EXPR137_tree=null;
        CommonTree char_literal138_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:10: ( std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:12: std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence
            {
            pushFollow(FOLLOW_std_attr_in_while_ex1639);
            std_attr133=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr133.getTree());
            string_literal134=(Token)match(input,131,FOLLOW_131_in_while_ex1644);  
            stream_131.add(string_literal134);

            char_literal135=(Token)match(input,117,FOLLOW_117_in_while_ex1646);  
            stream_117.add(char_literal135);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:16: ( expr | OPAQUE_EXPR )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==EXT_EXPR||LA49_0==ID||LA49_0==STRING||LA49_0==INT||LA49_0==117) ) {
                alt49=1;
            }
            else if ( (LA49_0==OPAQUE_EXPR) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_while_ex1649);
                    expr136=expr();

                    state._fsp--;

                    stream_expr.add(expr136.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:22: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR137=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_while_ex1651);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR137);


                    }
                    break;

            }

            char_literal138=(Token)match(input,118,FOLLOW_118_in_while_ex1654);  
            stream_118.add(char_literal138);

            pushFollow(FOLLOW_sequence_in_while_ex1658);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());


            // AST REWRITE
            // elements: expr, std_attr, sequence, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 199:50: -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:53: ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:61: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:67: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                adaptor.addChild(root_1, stream_sequence.nextTree());
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_ex"

    public static class until_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "until_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:1: until_ex : std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) ;
    public final BPELscriptParser.until_ex_return until_ex() throws RecognitionException {
        BPELscriptParser.until_ex_return retval = new BPELscriptParser.until_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal140=null;
        Token string_literal141=null;
        Token char_literal142=null;
        Token OPAQUE_EXPR144=null;
        Token char_literal145=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr139 = null;

        BPELscriptParser.expr_return expr143 = null;


        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree char_literal142_tree=null;
        CommonTree OPAQUE_EXPR144_tree=null;
        CommonTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:10: ( std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:12: std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            pushFollow(FOLLOW_std_attr_in_until_ex1682);
            std_attr139=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr139.getTree());
            string_literal140=(Token)match(input,132,FOLLOW_132_in_until_ex1687);  
            stream_132.add(string_literal140);

            pushFollow(FOLLOW_sequence_in_until_ex1691);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            string_literal141=(Token)match(input,133,FOLLOW_133_in_until_ex1693);  
            stream_133.add(string_literal141);

            char_literal142=(Token)match(input,117,FOLLOW_117_in_until_ex1695);  
            stream_117.add(char_literal142);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:36: ( expr | OPAQUE_EXPR )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXT_EXPR||LA50_0==ID||LA50_0==STRING||LA50_0==INT||LA50_0==117) ) {
                alt50=1;
            }
            else if ( (LA50_0==OPAQUE_EXPR) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:37: expr
                    {
                    pushFollow(FOLLOW_expr_in_until_ex1698);
                    expr143=expr();

                    state._fsp--;

                    stream_expr.add(expr143.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:42: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR144=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_until_ex1700);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR144);


                    }
                    break;

            }

            char_literal145=(Token)match(input,118,FOLLOW_118_in_until_ex1703);  
            stream_118.add(char_literal145);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr, std_attr, sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 202:59: -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:62: ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNTIL, "UNTIL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:70: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:76: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                adaptor.addChild(root_1, stream_sequence.nextTree());
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "until_ex"

    public static class foreach_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:1: foreach : ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.foreach_return foreach() throws RecognitionException {
        BPELscriptParser.foreach_return retval = new BPELscriptParser.foreach_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token par=null;
        Token successfulBranchesOnly=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token cName=null;
        Token initop=null;
        Token condop=null;
        Token string_literal146=null;
        Token string_literal147=null;
        Token char_literal148=null;
        Token char_literal149=null;
        Token string_literal150=null;
        Token SEMI151=null;
        Token string_literal152=null;
        Token SEMI153=null;
        Token char_literal154=null;
        Token compop=null;
        List list_compop=null;
        List list_complete=null;
        BPELscriptParser.expr_return init = null;

        BPELscriptParser.expr_return cond = null;

        BPELscriptParser.scope_short_return scope_short155 = null;

        RuleReturnScope complete = null;
        CommonTree par_tree=null;
        CommonTree successfulBranchesOnly_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree cName_tree=null;
        CommonTree initop_tree=null;
        CommonTree condop_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree char_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree SEMI151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree SEMI153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree compop_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_PARALLEL=new RewriteRuleTokenStream(adaptor,"token PARALLEL");
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:2: ( ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:4: ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:4: ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop51:
            do {
                int alt51=5;
                switch ( input.LA(1) ) {
                case PARALLEL:
                    {
                    alt51=1;
                    }
                    break;
                case SBO:
                    {
                    alt51=2;
                    }
                    break;
                case 114:
                    {
                    alt51=3;
                    }
                    break;
                case SJF:
                    {
                    alt51=4;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:5: {...}?par= PARALLEL
            	    {
            	    if ( !(par==null) ) {
            	        throw new FailedPredicateException(input, "foreach", "par==null");
            	    }
            	    par=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1733);  
            	    stream_PARALLEL.add(par);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:33: {...}?successfulBranchesOnly= SBO
            	    {
            	    if ( !(successfulBranchesOnly==null) ) {
            	        throw new FailedPredicateException(input, "foreach", "successfulBranchesOnly==null");
            	    }
            	    successfulBranchesOnly=(Token)match(input,SBO,FOLLOW_SBO_in_foreach1741);  
            	    stream_SBO.add(successfulBranchesOnly);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "foreach", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:27: '@name' name= STRING
            	    {
            	    string_literal146=(Token)match(input,114,FOLLOW_114_in_foreach1768);  
            	    stream_114.add(string_literal146);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_foreach1772);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "foreach", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_foreach1781);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            string_literal147=(Token)match(input,134,FOLLOW_134_in_foreach1788);  
            stream_134.add(string_literal147);

            char_literal148=(Token)match(input,117,FOLLOW_117_in_foreach1790);  
            stream_117.add(char_literal148);

            cName=(Token)match(input,ID,FOLLOW_ID_in_foreach1794);  
            stream_ID.add(cName);

            char_literal149=(Token)match(input,135,FOLLOW_135_in_foreach1796);  
            stream_135.add(char_literal149);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:26: (init= expr | initop= OPAQUE_EXPR )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EXT_EXPR||LA52_0==ID||LA52_0==STRING||LA52_0==INT||LA52_0==117) ) {
                alt52=1;
            }
            else if ( (LA52_0==OPAQUE_EXPR) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:27: init= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach1801);
                    init=expr();

                    state._fsp--;

                    stream_expr.add(init.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:37: initop= OPAQUE_EXPR
                    {
                    initop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1805);  
                    stream_OPAQUE_EXPR.add(initop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:57: ( 'to' | SEMI )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==136) ) {
                alt53=1;
            }
            else if ( (LA53_0==SEMI) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:58: 'to'
                    {
                    string_literal150=(Token)match(input,136,FOLLOW_136_in_foreach1809);  
                    stream_136.add(string_literal150);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:63: SEMI
                    {
                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1811);  
                    stream_SEMI.add(SEMI151);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:69: (cond= expr | condop= OPAQUE_EXPR )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EXT_EXPR||LA54_0==ID||LA54_0==STRING||LA54_0==INT||LA54_0==117) ) {
                alt54=1;
            }
            else if ( (LA54_0==OPAQUE_EXPR) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:70: cond= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach1817);
                    cond=expr();

                    state._fsp--;

                    stream_expr.add(cond.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:82: condop= OPAQUE_EXPR
                    {
                    condop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1823);  
                    stream_OPAQUE_EXPR.add(condop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:102: ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==SEMI||LA57_0==137) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:103: ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:103: ( 'finish' | SEMI )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==137) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==SEMI) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:104: 'finish'
                            {
                            string_literal152=(Token)match(input,137,FOLLOW_137_in_foreach1828);  
                            stream_137.add(string_literal152);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:113: SEMI
                            {
                            SEMI153=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1830);  
                            stream_SEMI.add(SEMI153);


                            }
                            break;

                    }

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:119: (complete+= expr | compop+= OPAQUE_EXPR )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==EXT_EXPR||LA56_0==ID||LA56_0==STRING||LA56_0==INT||LA56_0==117) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==OPAQUE_EXPR) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:120: complete+= expr
                            {
                            pushFollow(FOLLOW_expr_in_foreach1836);
                            complete=expr();

                            state._fsp--;

                            stream_expr.add(complete.getTree());
                            if (list_complete==null) list_complete=new ArrayList();
                            list_complete.add(complete);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:135: compop+= OPAQUE_EXPR
                            {
                            compop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1840);  
                            stream_OPAQUE_EXPR.add(compop);

                            if (list_compop==null) list_compop=new ArrayList();
                            list_compop.add(compop);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal154=(Token)match(input,118,FOLLOW_118_in_foreach1845);  
            stream_118.add(char_literal154);

            pushFollow(FOLLOW_scope_short_in_foreach1847);
            scope_short155=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short155.getTree());


            // AST REWRITE
            // elements: SJF, SBO, scope_short, name, PARALLEL, compop, cName, cond, initop, complete, condop, init
            // token labels: condop, name, cName, initop
            // rule labels: retval, init, cond
            // token list labels: compop
            // rule list labels: complete
            retval.tree = root_0;
            RewriteRuleTokenStream stream_condop=new RewriteRuleTokenStream(adaptor,"token condop",condop);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_cName=new RewriteRuleTokenStream(adaptor,"token cName",cName);
            RewriteRuleTokenStream stream_initop=new RewriteRuleTokenStream(adaptor,"token initop",initop);
            RewriteRuleTokenStream stream_compop=new RewriteRuleTokenStream(adaptor,"token compop", list_compop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"token init",init!=null?init.tree:null);
            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"token cond",cond!=null?cond.tree:null);
            RewriteRuleSubtreeStream stream_complete=new RewriteRuleSubtreeStream(adaptor,"token complete",list_complete);
            root_0 = (CommonTree)adaptor.nil();
            // 209:2: -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:6: ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_cName.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:19: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextTree());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:26: ( $initop)?
                if ( stream_initop.hasNext() ) {
                    adaptor.addChild(root_1, stream_initop.nextNode());

                }
                stream_initop.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:35: ( ^( FINAL ( $cond)? ( $condop)? ) )?
                if ( stream_cond.hasNext()||stream_condop.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:36: ^( FINAL ( $cond)? ( $condop)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FINAL, "FINAL"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:44: ( $cond)?
                    if ( stream_cond.hasNext() ) {
                        adaptor.addChild(root_2, stream_cond.nextTree());

                    }
                    stream_cond.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:51: ( $condop)?
                    if ( stream_condop.hasNext() ) {
                        adaptor.addChild(root_2, stream_condop.nextNode());

                    }
                    stream_condop.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cond.reset();
                stream_condop.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:63: ( ^( BRANCH ( $complete)? ( $compop)? ) )?
                if ( stream_compop.hasNext()||stream_complete.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:64: ^( BRANCH ( $complete)? ( $compop)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:73: ( $complete)?
                    if ( stream_complete.hasNext() ) {
                        adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_complete.nextTree()).getTree());

                    }
                    stream_complete.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:84: ( $compop)?
                    if ( stream_compop.hasNext() ) {
                        adaptor.addChild(root_2, stream_compop.nextNode());

                    }
                    stream_compop.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_compop.reset();
                stream_complete.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:16: ( PARALLEL )?
                if ( stream_PARALLEL.hasNext() ) {
                    adaptor.addChild(root_1, stream_PARALLEL.nextNode());

                }
                stream_PARALLEL.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:26: ( SBO )?
                if ( stream_SBO.hasNext() ) {
                    adaptor.addChild(root_1, stream_SBO.nextNode());

                }
                stream_SBO.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:31: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:38: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach"

    public static class try_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:1: try_ex : 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) ;
    public final BPELscriptParser.try_ex_return try_ex() throws RecognitionException {
        BPELscriptParser.try_ex_return retval = new BPELscriptParser.try_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal156=null;
        BPELscriptParser.body_return body157 = null;

        BPELscriptParser.catch_ex_return catch_ex158 = null;

        BPELscriptParser.catchAll_return catchAll159 = null;


        CommonTree string_literal156_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_catchAll=new RewriteRuleSubtreeStream(adaptor,"rule catchAll");
        RewriteRuleSubtreeStream stream_catch_ex=new RewriteRuleSubtreeStream(adaptor,"rule catch_ex");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:9: ( 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:11: 'try' body ( catch_ex )* ( catchAll )?
            {
            string_literal156=(Token)match(input,138,FOLLOW_138_in_try_ex1930);  
            stream_138.add(string_literal156);

            pushFollow(FOLLOW_body_in_try_ex1932);
            body157=body();

            state._fsp--;

            stream_body.add(body157.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:22: ( catch_ex )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case 139:
                    {
                    alt58=1;
                    }
                    break;
                case 191:
                    {
                    alt58=1;
                    }
                    break;
                case 140:
                    {
                    alt58=1;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:22: catch_ex
            	    {
            	    pushFollow(FOLLOW_catch_ex_in_try_ex1934);
            	    catch_ex158=catch_ex();

            	    state._fsp--;

            	    stream_catch_ex.add(catch_ex158.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:32: ( catchAll )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==141) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:32: catchAll
                    {
                    pushFollow(FOLLOW_catchAll_in_try_ex1937);
                    catchAll159=catchAll();

                    state._fsp--;

                    stream_catchAll.add(catchAll159.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: catch_ex, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 213:41: -> ^( TRY ( catch_ex )* ( body )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:44: ^( TRY ( catch_ex )* ( body )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:50: ( catch_ex )*
                while ( stream_catch_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_ex.nextTree());

                }
                stream_catch_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:60: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "try_ex"

    public static class catch_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:215:1: catch_ex : ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) ;
    public final BPELscriptParser.catch_ex_return catch_ex() throws RecognitionException {
        BPELscriptParser.catch_ex_return retval = new BPELscriptParser.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fMT=null;
        Token string_literal160=null;
        Token string_literal162=null;
        Token char_literal163=null;
        Token char_literal165=null;
        BPELscriptParser.faultElt_return faultElt161 = null;

        BPELscriptParser.ns_id_return ns_id164 = null;

        BPELscriptParser.param_block_return param_block166 = null;


        CommonTree fMT_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_faultElt=new RewriteRuleSubtreeStream(adaptor,"rule faultElt");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:2: ( ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==139) ) {
                alt60=1;
            }
            else if ( (LA60_0==191) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:5: ( '@faultMessageType' fMT= STRING )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:5: ( '@faultMessageType' fMT= STRING )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:6: '@faultMessageType' fMT= STRING
                    {
                    string_literal160=(Token)match(input,139,FOLLOW_139_in_catch_ex1962);  
                    stream_139.add(string_literal160);

                    fMT=(Token)match(input,STRING,FOLLOW_STRING_in_catch_ex1966);  
                    stream_STRING.add(fMT);


                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:41: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex1972);
                    faultElt161=faultElt();

                    state._fsp--;

                    stream_faultElt.add(faultElt161.getTree());

                    }
                    break;

            }

            string_literal162=(Token)match(input,140,FOLLOW_140_in_catch_ex1978);  
            stream_140.add(string_literal162);

            char_literal163=(Token)match(input,117,FOLLOW_117_in_catch_ex1980);  
            stream_117.add(char_literal163);

            pushFollow(FOLLOW_ns_id_in_catch_ex1982);
            ns_id164=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id164.getTree());
            char_literal165=(Token)match(input,118,FOLLOW_118_in_catch_ex1985);  
            stream_118.add(char_literal165);

            pushFollow(FOLLOW_param_block_in_catch_ex1987);
            param_block166=param_block();

            state._fsp--;

            stream_param_block.add(param_block166.getTree());


            // AST REWRITE
            // elements: ns_id, faultElt, param_block, fMT
            // token labels: fMT
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fMT=new RewriteRuleTokenStream(adaptor,"token fMT",fMT);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:2: -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:6: ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:32: ( $fMT)?
                if ( stream_fMT.hasNext() ) {
                    adaptor.addChild(root_1, stream_fMT.nextNode());

                }
                stream_fMT.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:38: ( faultElt )?
                if ( stream_faultElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultElt.nextTree());

                }
                stream_faultElt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_ex"

    public static class catchAll_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchAll"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:1: catchAll : 'catchAll' block -> ^( CATCH block ) ;
    public final BPELscriptParser.catchAll_return catchAll() throws RecognitionException {
        BPELscriptParser.catchAll_return retval = new BPELscriptParser.catchAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal167=null;
        BPELscriptParser.block_return block168 = null;


        CommonTree string_literal167_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:2: ( 'catchAll' block -> ^( CATCH block ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:4: 'catchAll' block
            {
            string_literal167=(Token)match(input,141,FOLLOW_141_in_catchAll2017);  
            stream_141.add(string_literal167);

            pushFollow(FOLLOW_block_in_catchAll2019);
            block168=block();

            state._fsp--;

            stream_block.add(block168.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:2: -> ^( CATCH block )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:6: ^( CATCH block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchAll"

    public static class scope_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:1: scope_ex : ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) ;
    public final BPELscriptParser.scope_ex_return scope_ex() throws RecognitionException {
        BPELscriptParser.scope_ex_return retval = new BPELscriptParser.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token i=null;
        Token eosf=null;
        Token sjf=null;
        Token string_literal169=null;
        Token char_literal170=null;
        Token ID171=null;
        Token char_literal172=null;
        BPELscriptParser.scope_sequence_return scope_sequence173 = null;

        BPELscriptParser.scope_stmt_return scope_stmt174 = null;


        CommonTree i_tree=null;
        CommonTree eosf_tree=null;
        CommonTree sjf_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree ID171_tree=null;
        CommonTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ISOLATED=new RewriteRuleTokenStream(adaptor,"token ISOLATED");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:2: ( ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:4: ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:4: ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )*
            loop61:
            do {
                int alt61=4;
                switch ( input.LA(1) ) {
                case ISOLATED:
                    {
                    alt61=1;
                    }
                    break;
                case EOSF:
                    {
                    alt61=2;
                    }
                    break;
                case SJF:
                    {
                    alt61=3;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:6: {...}?i= ISOLATED
            	    {
            	    if ( !(i==null) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "i==null");
            	    }
            	    i=(Token)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex2044);  
            	    stream_ISOLATED.add(i);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:30: {...}?eosf= EOSF
            	    {
            	    if ( !(eosf==null) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "eosf==null");
            	    }
            	    eosf=(Token)match(input,EOSF,FOLLOW_EOSF_in_scope_ex2052);  
            	    stream_EOSF.add(eosf);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:56: {...}?sjf= SJF
            	    {
            	    if ( !(sjf==null) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "sjf==null");
            	    }
            	    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_scope_ex2060);  
            	    stream_SJF.add(sjf);


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            string_literal169=(Token)match(input,142,FOLLOW_142_in_scope_ex2067);  
            stream_142.add(string_literal169);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:11: ( '(' ( ID )? ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==117) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:12: '(' ( ID )? ')'
                    {
                    char_literal170=(Token)match(input,117,FOLLOW_117_in_scope_ex2070);  
                    stream_117.add(char_literal170);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:16: ( ID )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==ID) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:16: ID
                            {
                            ID171=(Token)match(input,ID,FOLLOW_ID_in_scope_ex2072);  
                            stream_ID.add(ID171);


                            }
                            break;

                    }

                    char_literal172=(Token)match(input,118,FOLLOW_118_in_scope_ex2075);  
                    stream_118.add(char_literal172);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_sequence_in_scope_ex2079);
            scope_sequence173=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence173.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_ex2081);
            scope_stmt174=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt174.getTree());


            // AST REWRITE
            // elements: EOSF, ID, SJF, ISOLATED, scope_sequence, scope_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:2: -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:6: ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:14: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:44: ( ISOLATED )?
                if ( stream_ISOLATED.hasNext() ) {
                    adaptor.addChild(root_1, stream_ISOLATED.nextNode());

                }
                stream_ISOLATED.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:54: ( EOSF )?
                if ( stream_EOSF.hasNext() ) {
                    adaptor.addChild(root_1, stream_EOSF.nextNode());

                }
                stream_EOSF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:60: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_ex"

    public static class scope_short_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_short"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:1: scope_short : scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) ;
    public final BPELscriptParser.scope_short_return scope_short() throws RecognitionException {
        BPELscriptParser.scope_short_return retval = new BPELscriptParser.scope_short_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.scope_sequence_return scope_sequence175 = null;

        BPELscriptParser.scope_stmt_return scope_stmt176 = null;


        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:231:2: ( scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:231:4: scope_sequence scope_stmt
            {
            pushFollow(FOLLOW_scope_sequence_in_scope_short2124);
            scope_sequence175=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence175.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_short2126);
            scope_stmt176=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt176.getTree());


            // AST REWRITE
            // elements: scope_sequence, scope_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 231:30: -> ^( SCOPE scope_stmt scope_sequence )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:231:33: ^( SCOPE scope_stmt scope_sequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_short"

    public static class scope_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_stmt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:1: scope_stmt : ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )* -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) ;
    public final BPELscriptParser.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptParser.scope_stmt_return retval = new BPELscriptParser.scope_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.compensation_return c = null;

        BPELscriptParser.termination_return t = null;

        BPELscriptParser.eventHdl_return e = null;


        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_termination=new RewriteRuleSubtreeStream(adaptor,"rule termination");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:2: ( ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )* -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:4: ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:4: ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )*
            loop64:
            do {
                int alt64=4;
                switch ( input.LA(1) ) {
                case 146:
                    {
                    int LA64_2 = input.LA(2);

                    if ( (c==null) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 143:
                    {
                    int LA64_3 = input.LA(2);

                    if ( (t==null) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 144:
                    {
                    int LA64_4 = input.LA(2);

                    if ( (e==null) ) {
                        alt64=3;
                    }


                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:6: {...}?c= compensation
            	    {
            	    if ( !(c==null) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "c==null");
            	    }
            	    pushFollow(FOLLOW_compensation_in_scope_stmt2151);
            	    c=compensation();

            	    state._fsp--;

            	    stream_compensation.add(c.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:34: {...}?t= termination
            	    {
            	    if ( !(t==null) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "t==null");
            	    }
            	    pushFollow(FOLLOW_termination_in_scope_stmt2159);
            	    t=termination();

            	    state._fsp--;

            	    stream_termination.add(t.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:61: {...}?e= eventHdl
            	    {
            	    if ( !(e==null) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "e==null");
            	    }
            	    pushFollow(FOLLOW_eventHdl_in_scope_stmt2167);
            	    e=eventHdl();

            	    state._fsp--;

            	    stream_eventHdl.add(e.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);



            // AST REWRITE
            // elements: eventHdl, termination, compensation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 235:2: -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:5: ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:13: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:27: ( termination )?
                if ( stream_termination.hasNext() ) {
                    adaptor.addChild(root_1, stream_termination.nextTree());

                }
                stream_termination.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:40: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc, "Alternative");
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_stmt"

    public static class termination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termination"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:1: termination : 'onTermination' body -> ^( TERMINATION body ) ;
    public final BPELscriptParser.termination_return termination() throws RecognitionException {
        BPELscriptParser.termination_return retval = new BPELscriptParser.termination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal177=null;
        BPELscriptParser.body_return body178 = null;


        CommonTree string_literal177_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:2: ( 'onTermination' body -> ^( TERMINATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:4: 'onTermination' body
            {
            string_literal177=(Token)match(input,143,FOLLOW_143_in_termination2203);  
            stream_143.add(string_literal177);

            pushFollow(FOLLOW_body_in_termination2205);
            body178=body();

            state._fsp--;

            stream_body.add(body178.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:25: -> ^( TERMINATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:28: ^( TERMINATION body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TERMINATION, "TERMINATION"), root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termination"

    public static class eventHdl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventHdl"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:1: eventHdl : 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) ;
    public final BPELscriptParser.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptParser.eventHdl_return retval = new BPELscriptParser.eventHdl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal179=null;
        Token char_literal180=null;
        Token char_literal183=null;
        BPELscriptParser.onEvent_return onEvent181 = null;

        BPELscriptParser.onAlarm_return onAlarm182 = null;


        CommonTree string_literal179_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_onEvent=new RewriteRuleSubtreeStream(adaptor,"rule onEvent");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:2: ( 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:4: 'events' '{' ( onEvent )* ( onAlarm )* '}'
            {
            string_literal179=(Token)match(input,144,FOLLOW_144_in_eventHdl2223);  
            stream_144.add(string_literal179);

            char_literal180=(Token)match(input,110,FOLLOW_110_in_eventHdl2225);  
            stream_110.add(char_literal180);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:17: ( onEvent )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==ID||LA65_0==145||(LA65_0>=181 && LA65_0<=186)||LA65_0==188) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:17: onEvent
            	    {
            	    pushFollow(FOLLOW_onEvent_in_eventHdl2227);
            	    onEvent181=onEvent();

            	    state._fsp--;

            	    stream_onEvent.add(onEvent181.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:26: ( onAlarm )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==SJF||LA66_0==110||LA66_0==114||(LA66_0>=119 && LA66_0<=121)||(LA66_0>=125 && LA66_0<=126)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:26: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_eventHdl2230);
            	    onAlarm182=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm182.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            char_literal183=(Token)match(input,111,FOLLOW_111_in_eventHdl2233);  
            stream_111.add(char_literal183);



            // AST REWRITE
            // elements: onAlarm, onEvent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:3: -> ^( EVENTHDL ( onEvent )* ( onAlarm )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:6: ^( EVENTHDL ( onEvent )* ( onAlarm )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENTHDL, "EVENTHDL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:17: ( onEvent )*
                while ( stream_onEvent.hasNext() ) {
                    adaptor.addChild(root_1, stream_onEvent.nextTree());

                }
                stream_onEvent.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:26: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventHdl"

    public static class onEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onEvent"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:1: onEvent : ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) ;
    public final BPELscriptParser.onEvent_return onEvent() throws RecognitionException {
        BPELscriptParser.onEvent_return retval = new BPELscriptParser.onEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token te=null;
        Token var=null;
        Token p=null;
        Token o=null;
        Token char_literal186=null;
        Token string_literal187=null;
        Token char_literal188=null;
        Token char_literal189=null;
        Token char_literal190=null;
        Token char_literal192=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.msgType_return msgType184 = null;

        BPELscriptParser.viElt_return viElt185 = null;

        BPELscriptParser.correlation_return correlation191 = null;

        BPELscriptParser.with_ex_return with_ex193 = null;

        BPELscriptParser.scope_short_return scope_short194 = null;


        CommonTree te_tree=null;
        CommonTree var_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree string_literal187_tree=null;
        CommonTree char_literal188_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:2: ( ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:4: ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:4: ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )*
            loop68:
            do {
                int alt68=4;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt68=1;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt68=2;
                    }
                    break;
                case 185:
                case 186:
                case 188:
                    {
                    alt68=3;
                    }
                    break;

                }

                switch (alt68) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:6: {...}?pt= portType
            	    {
            	    if ( !(pt==null) ) {
            	        throw new FailedPredicateException(input, "onEvent", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_onEvent2264);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:32: {...}?msg= msgEx
            	    {
            	    if ( !(msg==null) ) {
            	        throw new FailedPredicateException(input, "onEvent", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_onEvent2272);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:57: {...}?te= ( msgType | viElt )
            	    {
            	    if ( !(te==null) ) {
            	        throw new FailedPredicateException(input, "onEvent", "te==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:72: ( msgType | viElt )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( ((LA67_0>=185 && LA67_0<=186)) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==188) ) {
            	        alt67=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:74: msgType
            	            {
            	            pushFollow(FOLLOW_msgType_in_onEvent2282);
            	            msgType184=msgType();

            	            state._fsp--;

            	            stream_msgType.add(msgType184.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:84: viElt
            	            {
            	            pushFollow(FOLLOW_viElt_in_onEvent2286);
            	            viElt185=viElt();

            	            state._fsp--;

            	            stream_viElt.add(viElt185.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:3: (var= ID '=' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:4: var= ID '='
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_onEvent2298);  
                    stream_ID.add(var);

                    char_literal186=(Token)match(input,135,FOLLOW_135_in_onEvent2300);  
                    stream_135.add(char_literal186);


                    }
                    break;

            }

            string_literal187=(Token)match(input,145,FOLLOW_145_in_onEvent2305);  
            stream_145.add(string_literal187);

            char_literal188=(Token)match(input,117,FOLLOW_117_in_onEvent2307);  
            stream_117.add(char_literal188);

            p=(Token)match(input,ID,FOLLOW_ID_in_onEvent2311);  
            stream_ID.add(p);

            char_literal189=(Token)match(input,113,FOLLOW_113_in_onEvent2313);  
            stream_113.add(char_literal189);

            o=(Token)match(input,ID,FOLLOW_ID_in_onEvent2317);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:44: ( ',' correlation )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==113) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:45: ',' correlation
                    {
                    char_literal190=(Token)match(input,113,FOLLOW_113_in_onEvent2320);  
                    stream_113.add(char_literal190);

                    pushFollow(FOLLOW_correlation_in_onEvent2322);
                    correlation191=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation191.getTree());

                    }
                    break;

            }

            char_literal192=(Token)match(input,118,FOLLOW_118_in_onEvent2326);  
            stream_118.add(char_literal192);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:67: ( with_ex )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==147) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:67: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2328);
                    with_ex193=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex193.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2331);
            scope_short194=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short194.getTree());


            // AST REWRITE
            // elements: p, msgType, portType, viElt, with_ex, var, o, msgEx, scope_short, correlation
            // token labels: var, p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 248:2: -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:6: ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:20: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:33: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:54: ( $var)?
                if ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextNode());

                }
                stream_var.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:60: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:77: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:86: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onEvent"

    public static class compensation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compensation"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:1: compensation : 'compensation' body -> ^( COMPENSATION body ) ;
    public final BPELscriptParser.compensation_return compensation() throws RecognitionException {
        BPELscriptParser.compensation_return retval = new BPELscriptParser.compensation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal195=null;
        BPELscriptParser.body_return body196 = null;


        CommonTree string_literal195_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:2: ( 'compensation' body -> ^( COMPENSATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:4: 'compensation' body
            {
            string_literal195=(Token)match(input,146,FOLLOW_146_in_compensation2389);  
            stream_146.add(string_literal195);

            pushFollow(FOLLOW_body_in_compensation2391);
            body196=body();

            state._fsp--;

            stream_body.add(body196.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 252:24: -> ^( COMPENSATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:27: ^( COMPENSATION body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATION, "COMPENSATION"), root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensation"

    public static class with_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:1: with_ex : 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) ;
    public final BPELscriptParser.with_ex_return with_ex() throws RecognitionException {
        BPELscriptParser.with_ex_return retval = new BPELscriptParser.with_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal197=null;
        Token char_literal198=null;
        Token char_literal199=null;
        Token char_literal200=null;
        List list_wm=null;
        RuleReturnScope wm = null;
        CommonTree string_literal197_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree char_literal200_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_with_map=new RewriteRuleSubtreeStream(adaptor,"rule with_map");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:3: ( 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:6: 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')'
            {
            string_literal197=(Token)match(input,147,FOLLOW_147_in_with_ex2410);  
            stream_147.add(string_literal197);

            char_literal198=(Token)match(input,117,FOLLOW_117_in_with_ex2412);  
            stream_117.add(char_literal198);

            pushFollow(FOLLOW_with_map_in_with_ex2416);
            wm=with_map();

            state._fsp--;

            stream_with_map.add(wm.getTree());
            if (list_wm==null) list_wm=new ArrayList();
            list_wm.add(wm);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:30: ( ',' wm+= with_map )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==113) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:31: ',' wm+= with_map
            	    {
            	    char_literal199=(Token)match(input,113,FOLLOW_113_in_with_ex2419);  
            	    stream_113.add(char_literal199);

            	    pushFollow(FOLLOW_with_map_in_with_ex2423);
            	    wm=with_map();

            	    state._fsp--;

            	    stream_with_map.add(wm.getTree());
            	    if (list_wm==null) list_wm=new ArrayList();
            	    list_wm.add(wm);


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            char_literal200=(Token)match(input,118,FOLLOW_118_in_with_ex2427);  
            stream_118.add(char_literal200);



            // AST REWRITE
            // elements: wm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: wm
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_wm=new RewriteRuleSubtreeStream(adaptor,"token wm",list_wm);
            root_0 = (CommonTree)adaptor.nil();
            // 255:54: -> ^( WITH ( $wm)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:57: ^( WITH ( $wm)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                if ( !(stream_wm.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_wm.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_wm.nextTree()).getTree());

                }
                stream_wm.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_ex"

    public static class with_map_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_map"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:257:1: with_map : ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) ;
    public final BPELscriptParser.with_map_return with_map() throws RecognitionException {
        BPELscriptParser.with_map_return retval = new BPELscriptParser.with_map_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID201=null;
        Token char_literal202=null;
        Token KEY203=null;
        BPELscriptParser.path_expr_return path_expr204 = null;


        CommonTree ID201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree KEY203_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:2: ( ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:11: ID ':' ( KEY )? path_expr
            {
            ID201=(Token)match(input,ID,FOLLOW_ID_in_with_map2453);  
            stream_ID.add(ID201);

            char_literal202=(Token)match(input,148,FOLLOW_148_in_with_map2455);  
            stream_148.add(char_literal202);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:18: ( KEY )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KEY) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:18: KEY
                    {
                    KEY203=(Token)match(input,KEY,FOLLOW_KEY_in_with_map2457);  
                    stream_KEY.add(KEY203);


                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2460);
            path_expr204=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr204.getTree());


            // AST REWRITE
            // elements: ID, path_expr, KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 258:33: -> ^( MAP ID ( KEY )? path_expr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:36: ^( MAP ID ( KEY )? path_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:45: ( KEY )?
                if ( stream_KEY.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEY.nextNode());

                }
                stream_KEY.reset();
                adaptor.addChild(root_1, stream_path_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_map"

    public static class receive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "receive"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:261:1: receive : ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? ) ;
    public final BPELscriptParser.receive_return receive() throws RecognitionException {
        BPELscriptParser.receive_return retval = new BPELscriptParser.receive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ci=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token string_literal205=null;
        Token string_literal206=null;
        Token char_literal207=null;
        Token char_literal208=null;
        Token char_literal209=null;
        Token char_literal211=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.correlation_return correlation210 = null;

        BPELscriptParser.with_ex_return with_ex212 = null;


        CommonTree ci_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal205_tree=null;
        CommonTree string_literal206_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree char_literal208_tree=null;
        CommonTree char_literal209_tree=null;
        CommonTree char_literal211_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:9: ( ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:12: ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:12: ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop74:
            do {
                int alt74=6;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt74=1;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt74=2;
                    }
                    break;
                case CREATE_INST:
                    {
                    alt74=3;
                    }
                    break;
                case 114:
                    {
                    alt74=4;
                    }
                    break;
                case SJF:
                    {
                    alt74=5;
                    }
                    break;

                }

                switch (alt74) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:14: {...}?pt= portType
            	    {
            	    if ( !(pt==null) ) {
            	        throw new FailedPredicateException(input, "receive", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_receive2497);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:40: {...}?msg= msgEx
            	    {
            	    if ( !(msg==null) ) {
            	        throw new FailedPredicateException(input, "receive", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_receive2505);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:65: {...}?ci= CREATE_INST
            	    {
            	    if ( !(ci==null) ) {
            	        throw new FailedPredicateException(input, "receive", "ci==null");
            	    }
            	    ci=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2513);  
            	    stream_CREATE_INST.add(ci);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "receive", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:27: '@name' name= STRING
            	    {
            	    string_literal205=(Token)match(input,114,FOLLOW_114_in_receive2539);  
            	    stream_114.add(string_literal205);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_receive2543);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "receive", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_receive2552);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            string_literal206=(Token)match(input,149,FOLLOW_149_in_receive2559);  
            stream_149.add(string_literal206);

            char_literal207=(Token)match(input,117,FOLLOW_117_in_receive2561);  
            stream_117.add(char_literal207);

            p=(Token)match(input,ID,FOLLOW_ID_in_receive2565);  
            stream_ID.add(p);

            char_literal208=(Token)match(input,113,FOLLOW_113_in_receive2567);  
            stream_113.add(char_literal208);

            o=(Token)match(input,ID,FOLLOW_ID_in_receive2571);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:31: ( ',' correlation )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==113) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:32: ',' correlation
                    {
                    char_literal209=(Token)match(input,113,FOLLOW_113_in_receive2574);  
                    stream_113.add(char_literal209);

                    pushFollow(FOLLOW_correlation_in_receive2576);
                    correlation210=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation210.getTree());

                    }
                    break;

            }

            char_literal211=(Token)match(input,118,FOLLOW_118_in_receive2580);  
            stream_118.add(char_literal211);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:54: ( with_ex )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==147) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:54: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2582);
                    with_ex212=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex212.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: with_ex, name, correlation, msgEx, p, CREATE_INST, SJF, portType, o
            // token labels: p, name, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:2: -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:6: ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:22: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:35: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:45: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:58: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:65: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:72: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:77: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "receive"

    public static class reply_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reply"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:269:1: reply : ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? ) ;
    public final BPELscriptParser.reply_return reply() throws RecognitionException {
        BPELscriptParser.reply_return retval = new BPELscriptParser.reply_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal213=null;
        Token string_literal214=null;
        Token char_literal215=null;
        Token char_literal216=null;
        Token char_literal217=null;
        Token char_literal218=null;
        Token char_literal220=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.faultName_return fn = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.correlation_return correlation219 = null;

        BPELscriptParser.with_ex_return with_ex221 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal217_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal220_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:2: ( ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:4: ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:4: ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop77:
            do {
                int alt77=6;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt77=1;
                    }
                    break;
                case 189:
                case 190:
                    {
                    alt77=2;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt77=3;
                    }
                    break;
                case 114:
                    {
                    alt77=4;
                    }
                    break;
                case SJF:
                    {
                    alt77=5;
                    }
                    break;

                }

                switch (alt77) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:6: {...}?pt= portType
            	    {
            	    if ( !(pt==null) ) {
            	        throw new FailedPredicateException(input, "reply", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_reply2641);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:32: {...}?fn= faultName
            	    {
            	    if ( !(fn==null) ) {
            	        throw new FailedPredicateException(input, "reply", "fn==null");
            	    }
            	    pushFollow(FOLLOW_faultName_in_reply2649);
            	    fn=faultName();

            	    state._fsp--;

            	    stream_faultName.add(fn.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:270:59: {...}?msg= msgEx
            	    {
            	    if ( !(msg==null) ) {
            	        throw new FailedPredicateException(input, "reply", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_reply2657);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "reply", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:27: '@name' name= STRING
            	    {
            	    string_literal213=(Token)match(input,114,FOLLOW_114_in_reply2682);  
            	    stream_114.add(string_literal213);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_reply2686);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "reply", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_reply2695);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            string_literal214=(Token)match(input,150,FOLLOW_150_in_reply2702);  
            stream_150.add(string_literal214);

            char_literal215=(Token)match(input,117,FOLLOW_117_in_reply2704);  
            stream_117.add(char_literal215);

            p=(Token)match(input,ID,FOLLOW_ID_in_reply2708);  
            stream_ID.add(p);

            char_literal216=(Token)match(input,113,FOLLOW_113_in_reply2710);  
            stream_113.add(char_literal216);

            o=(Token)match(input,ID,FOLLOW_ID_in_reply2714);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:29: ( ',' in= ID )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==113) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==ID) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:30: ',' in= ID
                    {
                    char_literal217=(Token)match(input,113,FOLLOW_113_in_reply2717);  
                    stream_113.add(char_literal217);

                    in=(Token)match(input,ID,FOLLOW_ID_in_reply2721);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:42: ( ',' correlation )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==113) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:43: ',' correlation
                    {
                    char_literal218=(Token)match(input,113,FOLLOW_113_in_reply2726);  
                    stream_113.add(char_literal218);

                    pushFollow(FOLLOW_correlation_in_reply2728);
                    correlation219=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation219.getTree());

                    }
                    break;

            }

            char_literal220=(Token)match(input,118,FOLLOW_118_in_reply2732);  
            stream_118.add(char_literal220);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:66: ( with_ex )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==147) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2735);
                    with_ex221=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex221.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: name, SJF, faultName, ID, ID, ID, with_ex, msgEx, correlation, portType
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 274:2: -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:6: ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPLY, "REPLY"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:24: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:37: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:47: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:54: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:59: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:77: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reply"

    public static class invoke_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoke"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:1: invoke : ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? ) ;
    public final BPELscriptParser.invoke_return invoke() throws RecognitionException {
        BPELscriptParser.invoke_return retval = new BPELscriptParser.invoke_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal222=null;
        Token string_literal223=null;
        Token char_literal224=null;
        Token char_literal225=null;
        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal229=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.correlation_return correlation228 = null;

        BPELscriptParser.with_ex_return with_ex230 = null;

        BPELscriptParser.compensation_return compensation231 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal222_tree=null;
        CommonTree string_literal223_tree=null;
        CommonTree char_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal229_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:2: ( ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:4: ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:4: ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop81:
            do {
                int alt81=4;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt81=1;
                    }
                    break;
                case 114:
                    {
                    alt81=2;
                    }
                    break;
                case SJF:
                    {
                    alt81=3;
                    }
                    break;

                }

                switch (alt81) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:6: {...}?pt= portType
            	    {
            	    if ( !(pt==null) ) {
            	        throw new FailedPredicateException(input, "invoke", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_invoke2795);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "invoke", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:27: '@name' name= STRING
            	    {
            	    string_literal222=(Token)match(input,114,FOLLOW_114_in_invoke2820);  
            	    stream_114.add(string_literal222);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_invoke2824);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "invoke", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_invoke2833);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            string_literal223=(Token)match(input,151,FOLLOW_151_in_invoke2840);  
            stream_151.add(string_literal223);

            char_literal224=(Token)match(input,117,FOLLOW_117_in_invoke2842);  
            stream_117.add(char_literal224);

            p=(Token)match(input,ID,FOLLOW_ID_in_invoke2846);  
            stream_ID.add(p);

            char_literal225=(Token)match(input,113,FOLLOW_113_in_invoke2848);  
            stream_113.add(char_literal225);

            o=(Token)match(input,ID,FOLLOW_ID_in_invoke2852);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:30: ( ',' in= ID )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==113) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==ID) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:31: ',' in= ID
                    {
                    char_literal226=(Token)match(input,113,FOLLOW_113_in_invoke2855);  
                    stream_113.add(char_literal226);

                    in=(Token)match(input,ID,FOLLOW_ID_in_invoke2859);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:43: ( ',' correlation )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==113) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:44: ',' correlation
                    {
                    char_literal227=(Token)match(input,113,FOLLOW_113_in_invoke2864);  
                    stream_113.add(char_literal227);

                    pushFollow(FOLLOW_correlation_in_invoke2866);
                    correlation228=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation228.getTree());

                    }
                    break;

            }

            char_literal229=(Token)match(input,118,FOLLOW_118_in_invoke2870);  
            stream_118.add(char_literal229);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:66: ( with_ex )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==147) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2872);
                    with_ex230=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex230.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:75: ( compensation )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==146) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:75: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2875);
                    compensation231=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation231.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: in, compensation, with_ex, o, SJF, name, p, portType, correlation
            // token labels: p, name, o, in
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleTokenStream stream_in=new RewriteRuleTokenStream(adaptor,"token in",in);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:2: -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:6: ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVOKE, "INVOKE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:21: ( $in)?
                if ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:26: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:39: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:49: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:56: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:61: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:70: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invoke"

    public static class assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:1: assign : ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) ;
    public final BPELscriptParser.assign_return assign() throws RecognitionException {
        BPELscriptParser.assign_return retval = new BPELscriptParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ci=null;
        Token val=null;
        Token ke=null;
        Token ig=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token lhs_opaque=null;
        Token string_literal232=null;
        Token PROP234=null;
        Token char_literal235=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.faultName_return fn = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.path_expr_return path_expr233 = null;

        BPELscriptParser.rvalue_return rvalue236 = null;


        CommonTree ci_tree=null;
        CommonTree val_tree=null;
        CommonTree ke_tree=null;
        CommonTree ig_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree lhs_opaque_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree PROP234_tree=null;
        CommonTree char_literal235_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_IGNORE=new RewriteRuleTokenStream(adaptor,"token IGNORE");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_PROP=new RewriteRuleTokenStream(adaptor,"token PROP");
        RewriteRuleTokenStream stream_KEEPSRC=new RewriteRuleTokenStream(adaptor,"token KEEPSRC");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleTokenStream stream_VALID=new RewriteRuleTokenStream(adaptor,"token VALID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:2: ( ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop86:
            do {
                int alt86=10;
                alt86 = dfa86.predict(input);
                switch (alt86) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:6: {...}?pt= portType
            	    {
            	    if ( !(pt==null) ) {
            	        throw new FailedPredicateException(input, "assign", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_assign2936);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:32: {...}?ci= CREATE_INST
            	    {
            	    if ( !(ci==null) ) {
            	        throw new FailedPredicateException(input, "assign", "ci==null");
            	    }
            	    ci=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2944);  
            	    stream_CREATE_INST.add(ci);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:61: {...}?val= VALID
            	    {
            	    if ( !(val==null) ) {
            	        throw new FailedPredicateException(input, "assign", "val==null");
            	    }
            	    val=(Token)match(input,VALID,FOLLOW_VALID_in_assign2952);  
            	    stream_VALID.add(val);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:86: {...}?ke= KEEPSRC
            	    {
            	    if ( !(ke==null) ) {
            	        throw new FailedPredicateException(input, "assign", "ke==null");
            	    }
            	    ke=(Token)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2960);  
            	    stream_KEEPSRC.add(ke);


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:6: {...}?ig= IGNORE
            	    {
            	    if ( !(ig==null) ) {
            	        throw new FailedPredicateException(input, "assign", "ig==null");
            	    }
            	    ig=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_assign2972);  
            	    stream_IGNORE.add(ig);


            	    }
            	    break;
            	case 6 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:30: {...}?fn= faultName
            	    {
            	    if ( !(fn==null) ) {
            	        throw new FailedPredicateException(input, "assign", "fn==null");
            	    }
            	    pushFollow(FOLLOW_faultName_in_assign2980);
            	    fn=faultName();

            	    state._fsp--;

            	    stream_faultName.add(fn.getTree());

            	    }
            	    break;
            	case 7 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:57: {...}?msg= msgEx
            	    {
            	    if ( !(msg==null) ) {
            	        throw new FailedPredicateException(input, "assign", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_assign2988);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 8 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "assign", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:27: '@name' name= STRING
            	    {
            	    string_literal232=(Token)match(input,114,FOLLOW_114_in_assign3016);  
            	    stream_114.add(string_literal232);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_assign3020);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 9 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "assign", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_assign3029);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:3: (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==OPAQUE_EXPR) ) {
                alt88=1;
            }
            else if ( (LA88_0==ID) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:4: lhs_opaque= OPAQUE_EXPR
                    {
                    lhs_opaque=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_assign3039);  
                    stream_OPAQUE_EXPR.add(lhs_opaque);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:29: path_expr ( PROP )?
                    {
                    pushFollow(FOLLOW_path_expr_in_assign3043);
                    path_expr233=path_expr();

                    state._fsp--;

                    stream_path_expr.add(path_expr233.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:39: ( PROP )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==PROP) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:39: PROP
                            {
                            PROP234=(Token)match(input,PROP,FOLLOW_PROP_in_assign3045);  
                            stream_PROP.add(PROP234);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal235=(Token)match(input,135,FOLLOW_135_in_assign3049);  
            stream_135.add(char_literal235);

            pushFollow(FOLLOW_rvalue_in_assign3051);
            rvalue236=rvalue();

            state._fsp--;

            stream_rvalue.add(rvalue236.getTree());


            // AST REWRITE
            // elements: name, rvalue, portType, path_expr, CREATE_INST, lhs_opaque, IGNORE, KEEPSRC, faultName, SJF, VALID, PROP, msgEx
            // token labels: name, lhs_opaque
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_lhs_opaque=new RewriteRuleTokenStream(adaptor,"token lhs_opaque",lhs_opaque);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 290:2: -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:6: ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:15: ( path_expr )?
                if ( stream_path_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_path_expr.nextTree());

                }
                stream_path_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:26: ( PROP )?
                if ( stream_PROP.hasNext() ) {
                    adaptor.addChild(root_1, stream_PROP.nextNode());

                }
                stream_PROP.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:32: ( $lhs_opaque)?
                if ( stream_lhs_opaque.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_opaque.nextNode());

                }
                stream_lhs_opaque.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:45: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:55: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:68: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:75: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:80: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:91: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:98: ( VALID )?
                if ( stream_VALID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VALID.nextNode());

                }
                stream_VALID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:105: ( KEEPSRC )?
                if ( stream_KEEPSRC.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEEPSRC.nextNode());

                }
                stream_KEEPSRC.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:114: ( IGNORE )?
                if ( stream_IGNORE.hasNext() ) {
                    adaptor.addChild(root_1, stream_IGNORE.nextNode());

                }
                stream_IGNORE.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:122: ( rvalue )?
                if ( stream_rvalue.hasNext() ) {
                    adaptor.addChild(root_1, stream_rvalue.nextTree());

                }
                stream_rvalue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class rvalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rvalue"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );
    public final BPELscriptParser.rvalue_return rvalue() throws RecognitionException {
        BPELscriptParser.rvalue_return retval = new BPELscriptParser.rvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROP240=null;
        Token OPAQUE_EXPR241=null;
        BPELscriptParser.receive_return receive237 = null;

        BPELscriptParser.invoke_return invoke238 = null;

        BPELscriptParser.expr_return expr239 = null;


        CommonTree PROP240_tree=null;
        CommonTree OPAQUE_EXPR241_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:2: ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR )
            int alt90=4;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:4: receive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_receive_in_rvalue3116);
                    receive237=receive();

                    state._fsp--;

                    adaptor.addChild(root_0, receive237.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:295:4: invoke
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_invoke_in_rvalue3121);
                    invoke238=invoke();

                    state._fsp--;

                    adaptor.addChild(root_0, invoke238.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:4: expr ( PROP )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_rvalue3126);
                    expr239=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr239.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:9: ( PROP )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==PROP) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:9: PROP
                            {
                            PROP240=(Token)match(input,PROP,FOLLOW_PROP_in_rvalue3128); 
                            PROP240_tree = (CommonTree)adaptor.create(PROP240);
                            adaptor.addChild(root_0, PROP240_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:4: OPAQUE_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OPAQUE_EXPR241=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_rvalue3134); 
                    OPAQUE_EXPR241_tree = (CommonTree)adaptor.create(OPAQUE_EXPR241);
                    adaptor.addChild(root_0, OPAQUE_EXPR241_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rvalue"

    public static class throw_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throw_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:1: throw_ex : ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? $name ( SJF )? ) ;
    public final BPELscriptParser.throw_ex_return throw_ex() throws RecognitionException {
        BPELscriptParser.throw_ex_return retval = new BPELscriptParser.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token faultVar=null;
        Token f=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal242=null;
        Token string_literal243=null;
        Token string_literal244=null;
        Token string_literal245=null;
        Token char_literal246=null;
        Token char_literal248=null;
        BPELscriptParser.ns_id_return ns_id247 = null;


        CommonTree faultVar_tree=null;
        CommonTree f_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal242_tree=null;
        CommonTree string_literal243_tree=null;
        CommonTree string_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        CommonTree char_literal246_tree=null;
        CommonTree char_literal248_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:2: ( ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? $name ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:4: ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:4: ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop92:
            do {
                int alt92=4;
                switch ( input.LA(1) ) {
                case 152:
                case 153:
                    {
                    alt92=1;
                    }
                    break;
                case 114:
                    {
                    alt92=2;
                    }
                    break;
                case SJF:
                    {
                    alt92=3;
                    }
                    break;

                }

                switch (alt92) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:6: {...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )
            	    {
            	    if ( !(f==null) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "f==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:19: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:20: ( '@faultVariable' | '@faultVar' ) faultVar= ID
            	    {
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:20: ( '@faultVariable' | '@faultVar' )
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==152) ) {
            	        alt91=1;
            	    }
            	    else if ( (LA91_0==153) ) {
            	        alt91=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 91, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:21: '@faultVariable'
            	            {
            	            string_literal242=(Token)match(input,152,FOLLOW_152_in_throw_ex3154);  
            	            stream_152.add(string_literal242);


            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:39: '@faultVar'
            	            {
            	            string_literal243=(Token)match(input,153,FOLLOW_153_in_throw_ex3157);  
            	            stream_153.add(string_literal243);


            	            }
            	            break;

            	    }

            	    faultVar=(Token)match(input,ID,FOLLOW_ID_in_throw_ex3162);  
            	    stream_ID.add(faultVar);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:27: '@name' name= STRING
            	    {
            	    string_literal244=(Token)match(input,114,FOLLOW_114_in_throw_ex3182);  
            	    stream_114.add(string_literal244);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_throw_ex3186);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_throw_ex3195);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            string_literal245=(Token)match(input,154,FOLLOW_154_in_throw_ex3202);  
            stream_154.add(string_literal245);

            char_literal246=(Token)match(input,117,FOLLOW_117_in_throw_ex3204);  
            stream_117.add(char_literal246);

            pushFollow(FOLLOW_ns_id_in_throw_ex3206);
            ns_id247=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id247.getTree());
            char_literal248=(Token)match(input,118,FOLLOW_118_in_throw_ex3208);  
            stream_118.add(char_literal248);



            // AST REWRITE
            // elements: name, SJF, ns_id, faultVar
            // token labels: faultVar, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_faultVar=new RewriteRuleTokenStream(adaptor,"token faultVar",faultVar);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 304:25: -> ^( THROW ns_id ( $faultVar)? $name ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:304:28: ^( THROW ns_id ( $faultVar)? $name ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:304:42: ( $faultVar)?
                if ( stream_faultVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultVar.nextNode());

                }
                stream_faultVar.reset();
                adaptor.addChild(root_1, stream_name.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:304:59: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throw_ex"

    public static class rethrow_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rethrow_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:307:1: rethrow_ex : std_attr 'rethrow' -> ^( RETHROW std_attr ) ;
    public final BPELscriptParser.rethrow_ex_return rethrow_ex() throws RecognitionException {
        BPELscriptParser.rethrow_ex_return retval = new BPELscriptParser.rethrow_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        BPELscriptParser.std_attr_return std_attr249 = null;


        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:2: ( std_attr 'rethrow' -> ^( RETHROW std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:4: std_attr 'rethrow'
            {
            pushFollow(FOLLOW_std_attr_in_rethrow_ex3244);
            std_attr249=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr249.getTree());
            string_literal250=(Token)match(input,155,FOLLOW_155_in_rethrow_ex3248);  
            stream_155.add(string_literal250);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 309:13: -> ^( RETHROW std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:16: ^( RETHROW std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETHROW, "RETHROW"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rethrow_ex"

    public static class compensate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compensate"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:1: compensate : std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) ;
    public final BPELscriptParser.compensate_return compensate() throws RecognitionException {
        BPELscriptParser.compensate_return retval = new BPELscriptParser.compensate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token target=null;
        Token string_literal252=null;
        Token char_literal253=null;
        Token char_literal254=null;
        BPELscriptParser.std_attr_return std_attr251 = null;


        CommonTree target_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree char_literal253_tree=null;
        CommonTree char_literal254_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:312:2: ( std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:312:4: std_attr 'compensate' ( '(' target= ID ')' )?
            {
            pushFollow(FOLLOW_std_attr_in_compensate3265);
            std_attr251=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr251.getTree());
            string_literal252=(Token)match(input,156,FOLLOW_156_in_compensate3269);  
            stream_156.add(string_literal252);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:313:16: ( '(' target= ID ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==117) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:313:17: '(' target= ID ')'
                    {
                    char_literal253=(Token)match(input,117,FOLLOW_117_in_compensate3272);  
                    stream_117.add(char_literal253);

                    target=(Token)match(input,ID,FOLLOW_ID_in_compensate3276);  
                    stream_ID.add(target);

                    char_literal254=(Token)match(input,118,FOLLOW_118_in_compensate3278);  
                    stream_118.add(char_literal254);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 314:2: -> ^( COMPENSATE ( ID )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:6: ^( COMPENSATE ( ID )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATE, "COMPENSATE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:19: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensate"

    public static class exit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:1: exit : std_attr 'exit' -> ^( EXIT std_attr ) ;
    public final BPELscriptParser.exit_return exit() throws RecognitionException {
        BPELscriptParser.exit_return retval = new BPELscriptParser.exit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal256=null;
        BPELscriptParser.std_attr_return std_attr255 = null;


        CommonTree string_literal256_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:7: ( std_attr 'exit' -> ^( EXIT std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:9: std_attr 'exit'
            {
            pushFollow(FOLLOW_std_attr_in_exit3303);
            std_attr255=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr255.getTree());
            string_literal256=(Token)match(input,157,FOLLOW_157_in_exit3308);  
            stream_157.add(string_literal256);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 317:11: -> ^( EXIT std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:14: ^( EXIT std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exit"

    public static class validate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validate"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:1: validate : std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) ;
    public final BPELscriptParser.validate_return validate() throws RecognitionException {
        BPELscriptParser.validate_return retval = new BPELscriptParser.validate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal258=null;
        Token char_literal259=null;
        Token v=null;
        List list_v=null;
        BPELscriptParser.std_attr_return std_attr257 = null;


        CommonTree string_literal258_tree=null;
        CommonTree char_literal259_tree=null;
        CommonTree v_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:10: ( std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:12: std_attr 'validate' v+= ID ( ',' v+= ID )*
            {
            pushFollow(FOLLOW_std_attr_in_validate3325);
            std_attr257=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr257.getTree());
            string_literal258=(Token)match(input,158,FOLLOW_158_in_validate3330);  
            stream_158.add(string_literal258);

            v=(Token)match(input,ID,FOLLOW_ID_in_validate3334);  
            stream_ID.add(v);

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:320:21: ( ',' v+= ID )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==113) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:320:22: ',' v+= ID
            	    {
            	    char_literal259=(Token)match(input,113,FOLLOW_113_in_validate3337);  
            	    stream_113.add(char_literal259);

            	    v=(Token)match(input,ID,FOLLOW_ID_in_validate3341);  
            	    stream_ID.add(v);

            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);



            // AST REWRITE
            // elements: std_attr, v
            // token labels: 
            // rule labels: retval
            // token list labels: v
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v", list_v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 320:33: -> ^( VALIDATE ( $v)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:320:36: ^( VALIDATE ( $v)+ std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALIDATE, "VALIDATE"), root_1);

                if ( !(stream_v.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_v.hasNext() ) {
                    adaptor.addChild(root_1, stream_v.nextNode());

                }
                stream_v.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validate"

    public static class ext_act_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ext_act"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:1: ext_act : std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) ;
    public final BPELscriptParser.ext_act_return ext_act() throws RecognitionException {
        BPELscriptParser.ext_act_return retval = new BPELscriptParser.ext_act_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token e=null;
        BPELscriptParser.std_attr_return std_attr260 = null;


        CommonTree e_tree=null;
        RewriteRuleTokenStream stream_EXT_ACT=new RewriteRuleTokenStream(adaptor,"token EXT_ACT");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:11: ( std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:13: std_attr e= EXT_ACT
            {
            pushFollow(FOLLOW_std_attr_in_ext_act3365);
            std_attr260=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr260.getTree());
            e=(Token)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act3372);  
            stream_EXT_ACT.add(e);



            // AST REWRITE
            // elements: e, std_attr
            // token labels: e
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 323:14: -> ^( EXTENSIONACT $e std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:18: ^( EXTENSIONACT $e std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSIONACT, "EXTENSIONACT"), root_1);

                adaptor.addChild(root_1, stream_e.nextNode());
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ext_act"

    public static class nop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nop"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:1: nop : std_attr 'nop' -> ^( NOP std_attr ) ;
    public final BPELscriptParser.nop_return nop() throws RecognitionException {
        BPELscriptParser.nop_return retval = new BPELscriptParser.nop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal262=null;
        BPELscriptParser.std_attr_return std_attr261 = null;


        CommonTree string_literal262_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:6: ( std_attr 'nop' -> ^( NOP std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:8: std_attr 'nop'
            {
            pushFollow(FOLLOW_std_attr_in_nop3393);
            std_attr261=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr261.getTree());
            string_literal262=(Token)match(input,159,FOLLOW_159_in_nop3398);  
            stream_159.add(string_literal262);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 326:10: -> ^( NOP std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:13: ^( NOP std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOP, "NOP"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nop"

    public static class opaque_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opaque"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:1: opaque : std_attr 'opaque()' -> ^( OPAQUE std_attr ) ;
    public final BPELscriptParser.opaque_return opaque() throws RecognitionException {
        BPELscriptParser.opaque_return retval = new BPELscriptParser.opaque_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal264=null;
        BPELscriptParser.std_attr_return std_attr263 = null;


        CommonTree string_literal264_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:8: ( std_attr 'opaque()' -> ^( OPAQUE std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:10: std_attr 'opaque()'
            {
            pushFollow(FOLLOW_std_attr_in_opaque3417);
            std_attr263=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr263.getTree());
            string_literal264=(Token)match(input,160,FOLLOW_160_in_opaque3422);  
            stream_160.add(string_literal264);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:15: -> ^( OPAQUE std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:18: ^( OPAQUE std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPAQUE, "OPAQUE"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opaque"

    public static class namespace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:1: namespace : 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) ;
    public final BPELscriptParser.namespace_return namespace() throws RecognitionException {
        BPELscriptParser.namespace_return retval = new BPELscriptParser.namespace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal265=null;
        Token ID266=null;
        Token char_literal267=null;
        Token STRING268=null;
        Token SEMI269=null;

        CommonTree string_literal265_tree=null;
        CommonTree ID266_tree=null;
        CommonTree char_literal267_tree=null;
        CommonTree STRING268_tree=null;
        CommonTree SEMI269_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:333:2: ( 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:333:4: 'namespace' ID '=' STRING SEMI
            {
            string_literal265=(Token)match(input,161,FOLLOW_161_in_namespace3441);  
            stream_161.add(string_literal265);

            ID266=(Token)match(input,ID,FOLLOW_ID_in_namespace3443);  
            stream_ID.add(ID266);

            char_literal267=(Token)match(input,135,FOLLOW_135_in_namespace3445);  
            stream_135.add(char_literal267);

            STRING268=(Token)match(input,STRING,FOLLOW_STRING_in_namespace3447);  
            stream_STRING.add(STRING268);

            SEMI269=(Token)match(input,SEMI,FOLLOW_SEMI_in_namespace3449);  
            stream_SEMI.add(SEMI269);



            // AST REWRITE
            // elements: ID, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 333:35: -> ^( NAMESPACE ID STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:333:38: ^( NAMESPACE ID STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class extension_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extension"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:1: extension : ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) ;
    public final BPELscriptParser.extension_return extension() throws RecognitionException {
        BPELscriptParser.extension_return retval = new BPELscriptParser.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUSTUND270=null;
        Token string_literal271=null;
        Token ID272=null;
        Token char_literal273=null;
        Token STRING274=null;
        Token SEMI275=null;

        CommonTree MUSTUND270_tree=null;
        CommonTree string_literal271_tree=null;
        CommonTree ID272_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree STRING274_tree=null;
        CommonTree SEMI275_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_MUSTUND=new RewriteRuleTokenStream(adaptor,"token MUSTUND");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:2: ( ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:5: ( MUSTUND )? 'extension' ID '=' STRING SEMI
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:5: ( MUSTUND )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==MUSTUND) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:5: MUSTUND
                    {
                    MUSTUND270=(Token)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension3470);  
                    stream_MUSTUND.add(MUSTUND270);


                    }
                    break;

            }

            string_literal271=(Token)match(input,162,FOLLOW_162_in_extension3476);  
            stream_162.add(string_literal271);

            ID272=(Token)match(input,ID,FOLLOW_ID_in_extension3478);  
            stream_ID.add(ID272);

            char_literal273=(Token)match(input,135,FOLLOW_135_in_extension3480);  
            stream_135.add(char_literal273);

            STRING274=(Token)match(input,STRING,FOLLOW_STRING_in_extension3482);  
            stream_STRING.add(STRING274);

            SEMI275=(Token)match(input,SEMI,FOLLOW_SEMI_in_extension3484);  
            stream_SEMI.add(SEMI275);



            // AST REWRITE
            // elements: STRING, MUSTUND, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 338:2: -> ^( EXTENSION ID STRING ( MUSTUND )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:6: ^( EXTENSION ID STRING ( MUSTUND )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:28: ( MUSTUND )?
                if ( stream_MUSTUND.hasNext() ) {
                    adaptor.addChild(root_1, stream_MUSTUND.nextNode());

                }
                stream_MUSTUND.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extension"

    public static class imports_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imports"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:1: imports : viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) ;
    public final BPELscriptParser.imports_return imports() throws RecognitionException {
        BPELscriptParser.imports_return retval = new BPELscriptParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token ns=null;
        Token loc=null;
        Token string_literal277=null;
        Token char_literal278=null;
        Token string_literal279=null;
        Token SEMI280=null;
        BPELscriptParser.viType_return viType276 = null;


        CommonTree id_tree=null;
        CommonTree ns_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal277_tree=null;
        CommonTree char_literal278_tree=null;
        CommonTree string_literal279_tree=null;
        CommonTree SEMI280_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:2: ( viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:5: viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI
            {
            pushFollow(FOLLOW_viType_in_imports3509);
            viType276=viType();

            state._fsp--;

            stream_viType.add(viType276.getTree());
            string_literal277=(Token)match(input,163,FOLLOW_163_in_imports3515);  
            stream_163.add(string_literal277);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:12: (id= ID '=' (ns= ID '::' )? loc= STRING )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:13: id= ID '=' (ns= ID '::' )? loc= STRING
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_imports3520);  
            stream_ID.add(id);

            char_literal278=(Token)match(input,135,FOLLOW_135_in_imports3522);  
            stream_135.add(char_literal278);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:23: (ns= ID '::' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==ID) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:24: ns= ID '::'
                    {
                    ns=(Token)match(input,ID,FOLLOW_ID_in_imports3527);  
                    stream_ID.add(ns);

                    string_literal279=(Token)match(input,164,FOLLOW_164_in_imports3529);  
                    stream_164.add(string_literal279);


                    }
                    break;

            }

            loc=(Token)match(input,STRING,FOLLOW_STRING_in_imports3536);  
            stream_STRING.add(loc);


            }

            SEMI280=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports3540);  
            stream_SEMI.add(SEMI280);



            // AST REWRITE
            // elements: ns, loc, viType, id
            // token labels: id, ns, loc
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
            RewriteRuleTokenStream stream_loc=new RewriteRuleTokenStream(adaptor,"token loc",loc);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:2: -> ^( IMPORT $id $loc ( $ns)? ( viType )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:6: ^( IMPORT $id $loc ( $ns)? ( viType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                adaptor.addChild(root_1, stream_loc.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:24: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "imports"

    public static class messages_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messages"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:1: messages : 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) ;
    public final BPELscriptParser.messages_return messages() throws RecognitionException {
        BPELscriptParser.messages_return retval = new BPELscriptParser.messages_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal281=null;
        Token char_literal282=null;
        List list_m=null;
        RuleReturnScope m = null;
        CommonTree string_literal281_tree=null;
        CommonTree char_literal282_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_message=new RewriteRuleSubtreeStream(adaptor,"rule message");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:2: ( 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:4: 'messages' m+= message ( ',' m+= message )*
            {
            string_literal281=(Token)match(input,165,FOLLOW_165_in_messages3572);  
            stream_165.add(string_literal281);

            pushFollow(FOLLOW_message_in_messages3576);
            m=message();

            state._fsp--;

            stream_message.add(m.getTree());
            if (list_m==null) list_m=new ArrayList();
            list_m.add(m);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:26: ( ',' m+= message )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==113) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:27: ',' m+= message
            	    {
            	    char_literal282=(Token)match(input,113,FOLLOW_113_in_messages3579);  
            	    stream_113.add(char_literal282);

            	    pushFollow(FOLLOW_message_in_messages3583);
            	    m=message();

            	    state._fsp--;

            	    stream_message.add(m.getTree());
            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m);


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);



            // AST REWRITE
            // elements: message
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:44: -> ^( MESSAGES ( message )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:47: ^( MESSAGES ( message )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGES, "MESSAGES"), root_1);

                if ( !(stream_message.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_message.hasNext() ) {
                    adaptor.addChild(root_1, stream_message.nextTree());

                }
                stream_message.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messages"

    public static class message_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:1: message : ID -> ^( MESSAGE ID ) ;
    public final BPELscriptParser.message_return message() throws RecognitionException {
        BPELscriptParser.message_return retval = new BPELscriptParser.message_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID283=null;

        CommonTree ID283_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:9: ( ID -> ^( MESSAGE ID ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:11: ID
            {
            ID283=(Token)match(input,ID,FOLLOW_ID_in_message3603);  
            stream_ID.add(ID283);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:14: -> ^( MESSAGE ID )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:17: ^( MESSAGE ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE, "MESSAGE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class variables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:350:1: variables : 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) ;
    public final BPELscriptParser.variables_return variables() throws RecognitionException {
        BPELscriptParser.variables_return retval = new BPELscriptParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal284=null;
        Token char_literal285=null;
        List list_v=null;
        RuleReturnScope v = null;
        CommonTree string_literal284_tree=null;
        CommonTree char_literal285_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:350:11: ( 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:350:13: 'var' v+= variable ( ',' v+= variable )*
            {
            string_literal284=(Token)match(input,166,FOLLOW_166_in_variables3621);  
            stream_166.add(string_literal284);

            pushFollow(FOLLOW_variable_in_variables3625);
            v=variable();

            state._fsp--;

            stream_variable.add(v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:350:31: ( ',' v+= variable )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==113) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:350:32: ',' v+= variable
            	    {
            	    char_literal285=(Token)match(input,113,FOLLOW_113_in_variables3628);  
            	    stream_113.add(char_literal285);

            	    pushFollow(FOLLOW_variable_in_variables3632);
            	    v=variable();

            	    state._fsp--;

            	    stream_variable.add(v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);



            // AST REWRITE
            // elements: variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 351:3: -> ^( VARIABLES ( variable )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:7: ^( VARIABLES ( variable )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES, "VARIABLES"), root_1);

                if ( !(stream_variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_variable.nextTree());

                }
                stream_variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variables"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:353:1: variable : ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) ;
    public final BPELscriptParser.variable_return variable() throws RecognitionException {
        BPELscriptParser.variable_return retval = new BPELscriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID286=null;
        BPELscriptParser.msgType_return msg = null;

        BPELscriptParser.viType_return vi = null;

        BPELscriptParser.viElt_return viE = null;

        BPELscriptParser.with_ex_return with_ex287 = null;


        CommonTree ID286_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:2: ( ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:4: ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:4: ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )*
            loop99:
            do {
                int alt99=4;
                switch ( input.LA(1) ) {
                case 185:
                case 186:
                    {
                    alt99=1;
                    }
                    break;
                case 187:
                    {
                    alt99=2;
                    }
                    break;
                case 188:
                    {
                    alt99=3;
                    }
                    break;

                }

                switch (alt99) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:6: {...}?msg= msgType
            	    {
            	    if ( !(msg==null) ) {
            	        throw new FailedPredicateException(input, "variable", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgType_in_variable3662);
            	    msg=msgType();

            	    state._fsp--;

            	    stream_msgType.add(msg.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:33: {...}?vi= viType
            	    {
            	    if ( !(vi==null) ) {
            	        throw new FailedPredicateException(input, "variable", "vi==null");
            	    }
            	    pushFollow(FOLLOW_viType_in_variable3670);
            	    vi=viType();

            	    state._fsp--;

            	    stream_viType.add(vi.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:57: {...}?viE= viElt
            	    {
            	    if ( !(viE==null) ) {
            	        throw new FailedPredicateException(input, "variable", "viE==null");
            	    }
            	    pushFollow(FOLLOW_viElt_in_variable3678);
            	    viE=viElt();

            	    state._fsp--;

            	    stream_viElt.add(viE.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            ID286=(Token)match(input,ID,FOLLOW_ID_in_variable3685);  
            stream_ID.add(ID286);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:7: ( with_ex )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==147) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:7: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable3688);
                    with_ex287=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex287.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: with_ex, msgType, viType, ID, viElt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 356:2: -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:6: ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:20: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:37: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:44: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class partner_links_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "partner_links"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:359:1: partner_links : ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) ;
    public final BPELscriptParser.partner_links_return partner_links() throws RecognitionException {
        BPELscriptParser.partner_links_return retval = new BPELscriptParser.partner_links_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal288=null;
        Token string_literal289=null;
        Token char_literal290=null;
        List list_pl=null;
        RuleReturnScope pl = null;
        CommonTree string_literal288_tree=null;
        CommonTree string_literal289_tree=null;
        CommonTree char_literal290_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_partner_link=new RewriteRuleSubtreeStream(adaptor,"rule partner_link");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:2: ( ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:4: ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:4: ( 'partnerLink' | 'partnerlink' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==167) ) {
                alt101=1;
            }
            else if ( (LA101_0==168) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:5: 'partnerLink'
                    {
                    string_literal288=(Token)match(input,167,FOLLOW_167_in_partner_links3728);  
                    stream_167.add(string_literal288);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:21: 'partnerlink'
                    {
                    string_literal289=(Token)match(input,168,FOLLOW_168_in_partner_links3732);  
                    stream_168.add(string_literal289);


                    }
                    break;

            }

            pushFollow(FOLLOW_partner_link_in_partner_links3737);
            pl=partner_link();

            state._fsp--;

            stream_partner_link.add(pl.getTree());
            if (list_pl==null) list_pl=new ArrayList();
            list_pl.add(pl);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:53: ( ',' pl+= partner_link )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==113) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:54: ',' pl+= partner_link
            	    {
            	    char_literal290=(Token)match(input,113,FOLLOW_113_in_partner_links3740);  
            	    stream_113.add(char_literal290);

            	    pushFollow(FOLLOW_partner_link_in_partner_links3744);
            	    pl=partner_link();

            	    state._fsp--;

            	    stream_partner_link.add(pl.getTree());
            	    if (list_pl==null) list_pl=new ArrayList();
            	    list_pl.add(pl);


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);



            // AST REWRITE
            // elements: pl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: pl
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pl=new RewriteRuleSubtreeStream(adaptor,"token pl",list_pl);
            root_0 = (CommonTree)adaptor.nil();
            // 360:77: -> ^( PARTNERLINKS ( $pl)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:80: ^( PARTNERLINKS ( $pl)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARTNERLINKS, "PARTNERLINKS"), root_1);

                if ( !(stream_pl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pl.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_pl.nextTree()).getTree());

                }
                stream_pl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partner_links"

    public static class partner_link_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "partner_link"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:1: partner_link : ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) ;
    public final BPELscriptParser.partner_link_return partner_link() throws RecognitionException {
        BPELscriptParser.partner_link_return retval = new BPELscriptParser.partner_link_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token ID291=null;
        Token char_literal292=null;
        Token char_literal293=null;
        Token char_literal294=null;
        Token char_literal295=null;
        Token char_literal296=null;
        Token char_literal297=null;
        BPELscriptParser.ns_id_return plType = null;

        BPELscriptParser.ns_id_return roleA = null;

        BPELscriptParser.ns_id_return roleB = null;


        CommonTree init_tree=null;
        CommonTree ID291_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree char_literal293_tree=null;
        CommonTree char_literal294_tree=null;
        CommonTree char_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_INITPARTNER=new RewriteRuleTokenStream(adaptor,"token INITPARTNER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:2: ( ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:4: ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')'
            {
            ID291=(Token)match(input,ID,FOLLOW_ID_in_partner_link3766);  
            stream_ID.add(ID291);

            char_literal292=(Token)match(input,135,FOLLOW_135_in_partner_link3768);  
            stream_135.add(char_literal292);

            char_literal293=(Token)match(input,117,FOLLOW_117_in_partner_link3770);  
            stream_117.add(char_literal293);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:21: (plType= ns_id )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ID) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:21: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partner_link3774);
                    plType=ns_id();

                    state._fsp--;

                    stream_ns_id.add(plType.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:29: ( ',' roleA= ns_id )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==113) ) {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==ID) ) {
                    alt104=1;
                }
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:30: ',' roleA= ns_id
                    {
                    char_literal294=(Token)match(input,113,FOLLOW_113_in_partner_link3778);  
                    stream_113.add(char_literal294);

                    pushFollow(FOLLOW_ns_id_in_partner_link3782);
                    roleA=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleA.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:48: ( ',' roleB= ns_id )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==113) ) {
                int LA105_1 = input.LA(2);

                if ( (LA105_1==ID) ) {
                    alt105=1;
                }
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:49: ',' roleB= ns_id
                    {
                    char_literal295=(Token)match(input,113,FOLLOW_113_in_partner_link3787);  
                    stream_113.add(char_literal295);

                    pushFollow(FOLLOW_ns_id_in_partner_link3791);
                    roleB=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleB.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:67: ( ',' init= INITPARTNER )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==113) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:68: ',' init= INITPARTNER
                    {
                    char_literal296=(Token)match(input,113,FOLLOW_113_in_partner_link3796);  
                    stream_113.add(char_literal296);

                    init=(Token)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partner_link3800);  
                    stream_INITPARTNER.add(init);


                    }
                    break;

            }

            char_literal297=(Token)match(input,118,FOLLOW_118_in_partner_link3804);  
            stream_118.add(char_literal297);



            // AST REWRITE
            // elements: init, plType, ID, roleB, roleA
            // token labels: init
            // rule labels: retval, roleA, roleB, plType
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_roleA=new RewriteRuleSubtreeStream(adaptor,"token roleA",roleA!=null?roleA.tree:null);
            RewriteRuleSubtreeStream stream_roleB=new RewriteRuleSubtreeStream(adaptor,"token roleB",roleB!=null?roleB.tree:null);
            RewriteRuleSubtreeStream stream_plType=new RewriteRuleSubtreeStream(adaptor,"token plType",plType!=null?plType.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 364:3: -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:7: ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PID, "PID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:16: ( $plType)?
                if ( stream_plType.hasNext() ) {
                    adaptor.addChild(root_1, stream_plType.nextTree());

                }
                stream_plType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:25: ( $roleA)?
                if ( stream_roleA.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleA.nextTree());

                }
                stream_roleA.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:33: ( $roleB)?
                if ( stream_roleB.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleB.nextTree());

                }
                stream_roleB.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:41: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partner_link"

    public static class correlation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlation"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:1: correlation : '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) ;
    public final BPELscriptParser.correlation_return correlation() throws RecognitionException {
        BPELscriptParser.correlation_return retval = new BPELscriptParser.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal298=null;
        Token char_literal300=null;
        Token char_literal302=null;
        BPELscriptParser.corr_mapping_return corr_mapping299 = null;

        BPELscriptParser.corr_mapping_return corr_mapping301 = null;


        CommonTree char_literal298_tree=null;
        CommonTree char_literal300_tree=null;
        CommonTree char_literal302_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_corr_mapping=new RewriteRuleSubtreeStream(adaptor,"rule corr_mapping");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:2: ( '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:4: '{' corr_mapping ( ',' corr_mapping )* '}'
            {
            char_literal298=(Token)match(input,110,FOLLOW_110_in_correlation3840);  
            stream_110.add(char_literal298);

            pushFollow(FOLLOW_corr_mapping_in_correlation3842);
            corr_mapping299=corr_mapping();

            state._fsp--;

            stream_corr_mapping.add(corr_mapping299.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:21: ( ',' corr_mapping )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==113) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:22: ',' corr_mapping
            	    {
            	    char_literal300=(Token)match(input,113,FOLLOW_113_in_correlation3845);  
            	    stream_113.add(char_literal300);

            	    pushFollow(FOLLOW_corr_mapping_in_correlation3847);
            	    corr_mapping301=corr_mapping();

            	    state._fsp--;

            	    stream_corr_mapping.add(corr_mapping301.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            char_literal302=(Token)match(input,111,FOLLOW_111_in_correlation3851);  
            stream_111.add(char_literal302);



            // AST REWRITE
            // elements: corr_mapping
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 367:45: -> ^( CORRELATION ( corr_mapping )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:48: ^( CORRELATION ( corr_mapping )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRELATION, "CORRELATION"), root_1);

                if ( !(stream_corr_mapping.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_corr_mapping.hasNext() ) {
                    adaptor.addChild(root_1, stream_corr_mapping.nextTree());

                }
                stream_corr_mapping.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlation"

    public static class corr_mapping_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_mapping"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:369:1: corr_mapping : ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) ;
    public final BPELscriptParser.corr_mapping_return corr_mapping() throws RecognitionException {
        BPELscriptParser.corr_mapping_return retval = new BPELscriptParser.corr_mapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token pattern=null;
        Token f1=null;

        CommonTree init_tree=null;
        CommonTree pattern_tree=null;
        CommonTree f1_tree=null;
        RewriteRuleTokenStream stream_PATTERN_COR=new RewriteRuleTokenStream(adaptor,"token PATTERN_COR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INIT_COR=new RewriteRuleTokenStream(adaptor,"token INIT_COR");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:2: ( ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:4: ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:4: ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )*
            loop108:
            do {
                int alt108=3;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==INIT_COR) ) {
                    alt108=1;
                }
                else if ( (LA108_0==PATTERN_COR) ) {
                    alt108=2;
                }


                switch (alt108) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:6: {...}?init= INIT_COR
            	    {
            	    if ( !(init==null) ) {
            	        throw new FailedPredicateException(input, "corr_mapping", "init==null");
            	    }
            	    init=(Token)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping3875);  
            	    stream_INIT_COR.add(init);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:36: {...}?pattern= PATTERN_COR
            	    {
            	    if ( !(pattern==null) ) {
            	        throw new FailedPredicateException(input, "corr_mapping", "pattern==null");
            	    }
            	    pattern=(Token)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping3883);  
            	    stream_PATTERN_COR.add(pattern);


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            f1=(Token)match(input,ID,FOLLOW_ID_in_corr_mapping3892);  
            stream_ID.add(f1);



            // AST REWRITE
            // elements: init, pattern, f1
            // token labels: pattern, init, f1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_pattern=new RewriteRuleTokenStream(adaptor,"token pattern",pattern);
            RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
            RewriteRuleTokenStream stream_f1=new RewriteRuleTokenStream(adaptor,"token f1",f1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 372:2: -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:372:6: ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORR_MAP, "CORR_MAP"), root_1);

                adaptor.addChild(root_1, stream_f1.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:372:21: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:372:28: ( $pattern)?
                if ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextNode());

                }
                stream_pattern.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_mapping"

    public static class corr_sets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_sets"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:1: corr_sets : 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) ;
    public final BPELscriptParser.corr_sets_return corr_sets() throws RecognitionException {
        BPELscriptParser.corr_sets_return retval = new BPELscriptParser.corr_sets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal303=null;
        Token char_literal304=null;
        Token char_literal305=null;
        Token char_literal306=null;
        Token char_literal307=null;
        List list_cs=null;
        RuleReturnScope cs = null;
        CommonTree string_literal303_tree=null;
        CommonTree char_literal304_tree=null;
        CommonTree char_literal305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree char_literal307_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_corr_set=new RewriteRuleSubtreeStream(adaptor,"rule corr_set");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:12: ( 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:14: 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}'
            {
            string_literal303=(Token)match(input,169,FOLLOW_169_in_corr_sets3927);  
            stream_169.add(string_literal303);

            char_literal304=(Token)match(input,110,FOLLOW_110_in_corr_sets3929);  
            stream_110.add(char_literal304);

            pushFollow(FOLLOW_corr_set_in_corr_sets3932);
            cs=corr_set();

            state._fsp--;

            stream_corr_set.add(cs.getTree());
            if (list_cs==null) list_cs=new ArrayList();
            list_cs.add(cs);

            char_literal305=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3934);  
            stream_SEMI.add(char_literal305);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:47: (cs+= corr_set ';' )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==ID) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:48: cs+= corr_set ';'
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets3939);
            	    cs=corr_set();

            	    state._fsp--;

            	    stream_corr_set.add(cs.getTree());
            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs);

            	    char_literal306=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3941);  
            	    stream_SEMI.add(char_literal306);


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            char_literal307=(Token)match(input,111,FOLLOW_111_in_corr_sets3945);  
            stream_111.add(char_literal307);



            // AST REWRITE
            // elements: cs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: cs
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_cs=new RewriteRuleSubtreeStream(adaptor,"token cs",list_cs);
            root_0 = (CommonTree)adaptor.nil();
            // 375:71: -> ^( CORRSETS ( $cs)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:74: ^( CORRSETS ( $cs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRSETS, "CORRSETS"), root_1);

                if ( !(stream_cs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_cs.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_cs.nextTree()).getTree());

                }
                stream_cs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_sets"

    public static class corr_set_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_set"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:1: corr_set : f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) ;
    public final BPELscriptParser.corr_set_return corr_set() throws RecognitionException {
        BPELscriptParser.corr_set_return retval = new BPELscriptParser.corr_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token f=null;
        Token char_literal308=null;
        Token char_literal309=null;
        Token char_literal310=null;
        Token par=null;
        List list_par=null;

        CommonTree f_tree=null;
        CommonTree char_literal308_tree=null;
        CommonTree char_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree par_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:10: (f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:12: f= ID '(' par+= ID ( ',' par+= ID )* ')'
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_corr_set3965);  
            stream_ID.add(f);

            char_literal308=(Token)match(input,117,FOLLOW_117_in_corr_set3967);  
            stream_117.add(char_literal308);

            par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3971);  
            stream_ID.add(par);

            if (list_par==null) list_par=new ArrayList();
            list_par.add(par);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:29: ( ',' par+= ID )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==113) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:30: ',' par+= ID
            	    {
            	    char_literal309=(Token)match(input,113,FOLLOW_113_in_corr_set3974);  
            	    stream_113.add(char_literal309);

            	    par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3978);  
            	    stream_ID.add(par);

            	    if (list_par==null) list_par=new ArrayList();
            	    list_par.add(par);


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            char_literal310=(Token)match(input,118,FOLLOW_118_in_corr_set3982);  
            stream_118.add(char_literal310);



            // AST REWRITE
            // elements: f, par
            // token labels: f
            // rule labels: retval
            // token list labels: par
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
            RewriteRuleTokenStream stream_par=new RewriteRuleTokenStream(adaptor,"token par", list_par);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 377:48: -> ^( CORRSET $f ( $par)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:377:51: ^( CORRSET $f ( $par)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRSET, "CORRSET"), root_1);

                adaptor.addChild(root_1, stream_f.nextNode());
                if ( !(stream_par.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_par.hasNext() ) {
                    adaptor.addChild(root_1, stream_par.nextNode());

                }
                stream_par.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_set"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:1: expr : ( s_expr | EXT_EXPR | funct_call );
    public final BPELscriptParser.expr_return expr() throws RecognitionException {
        BPELscriptParser.expr_return retval = new BPELscriptParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXT_EXPR312=null;
        BPELscriptParser.s_expr_return s_expr311 = null;

        BPELscriptParser.funct_call_return funct_call313 = null;


        CommonTree EXT_EXPR312_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:7: ( s_expr | EXT_EXPR | funct_call )
            int alt111=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==SEMI||LA111_1==PROP||LA111_1==118||(LA111_1>=136 && LA111_1<=137)||LA111_1==164||(LA111_1>=170 && LA111_1<=180)) ) {
                    alt111=1;
                }
                else if ( (LA111_1==117) ) {
                    alt111=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case INT:
            case 117:
                {
                alt111=1;
                }
                break;
            case EXT_EXPR:
                {
                alt111=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:9: s_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_s_expr_in_expr4005);
                    s_expr311=s_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, s_expr311.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:18: EXT_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EXT_EXPR312=(Token)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr4009); 
                    EXT_EXPR312_tree = (CommonTree)adaptor.create(EXT_EXPR312);
                    adaptor.addChild(root_0, EXT_EXPR312_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:29: funct_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funct_call_in_expr4013);
                    funct_call313=funct_call();

                    state._fsp--;

                    adaptor.addChild(root_0, funct_call313.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class funct_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funct_call"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:1: funct_call : p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) ;
    public final BPELscriptParser.funct_call_return funct_call() throws RecognitionException {
        BPELscriptParser.funct_call_return retval = new BPELscriptParser.funct_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal314=null;
        Token char_literal315=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal314_tree=null;
        CommonTree char_literal315_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:12: (p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:14: p+= ID '(' (p+= ID )* ')'
            {
            p=(Token)match(input,ID,FOLLOW_ID_in_funct_call4022);  
            stream_ID.add(p);

            if (list_p==null) list_p=new ArrayList();
            list_p.add(p);

            char_literal314=(Token)match(input,117,FOLLOW_117_in_funct_call4024);  
            stream_117.add(char_literal314);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:25: (p+= ID )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==ID) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:25: p+= ID
            	    {
            	    p=(Token)match(input,ID,FOLLOW_ID_in_funct_call4028);  
            	    stream_ID.add(p);

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p);


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            char_literal315=(Token)match(input,118,FOLLOW_118_in_funct_call4031);  
            stream_118.add(char_literal315);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 381:35: -> ^( CALL ( ID )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:38: ^( CALL ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funct_call"

    public static class s_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "s_expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:1: s_expr : condExpr ;
    public final BPELscriptParser.s_expr_return s_expr() throws RecognitionException {
        BPELscriptParser.s_expr_return retval = new BPELscriptParser.s_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.condExpr_return condExpr316 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:9: ( condExpr )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:11: condExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_s_expr4048);
            condExpr316=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr316.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "s_expr"

    public static class condExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:1: condExpr : aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? ;
    public final BPELscriptParser.condExpr_return condExpr() throws RecognitionException {
        BPELscriptParser.condExpr_return retval = new BPELscriptParser.condExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal318=null;
        Token string_literal319=null;
        Token char_literal320=null;
        Token char_literal321=null;
        Token string_literal322=null;
        Token string_literal323=null;
        BPELscriptParser.aexpr_return aexpr317 = null;

        BPELscriptParser.aexpr_return aexpr324 = null;


        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        CommonTree char_literal320_tree=null;
        CommonTree char_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree string_literal323_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:11: ( aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:13: aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr4056);
            aexpr317=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr317.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:19: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=170 && LA114_0<=175)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
                    int alt113=6;
                    switch ( input.LA(1) ) {
                    case 170:
                        {
                        alt113=1;
                        }
                        break;
                    case 171:
                        {
                        alt113=2;
                        }
                        break;
                    case 172:
                        {
                        alt113=3;
                        }
                        break;
                    case 173:
                        {
                        alt113=4;
                        }
                        break;
                    case 174:
                        {
                        alt113=5;
                        }
                        break;
                    case 175:
                        {
                        alt113=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }

                    switch (alt113) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:22: '=='
                            {
                            string_literal318=(Token)match(input,170,FOLLOW_170_in_condExpr4061); 
                            string_literal318_tree = (CommonTree)adaptor.create(string_literal318);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal318_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:29: '!='
                            {
                            string_literal319=(Token)match(input,171,FOLLOW_171_in_condExpr4065); 
                            string_literal319_tree = (CommonTree)adaptor.create(string_literal319);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal319_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:36: '<'
                            {
                            char_literal320=(Token)match(input,172,FOLLOW_172_in_condExpr4069); 
                            char_literal320_tree = (CommonTree)adaptor.create(char_literal320);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal320_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:42: '>'
                            {
                            char_literal321=(Token)match(input,173,FOLLOW_173_in_condExpr4073); 
                            char_literal321_tree = (CommonTree)adaptor.create(char_literal321);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal321_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:48: '<='
                            {
                            string_literal322=(Token)match(input,174,FOLLOW_174_in_condExpr4077); 
                            string_literal322_tree = (CommonTree)adaptor.create(string_literal322);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal322_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:55: '>='
                            {
                            string_literal323=(Token)match(input,175,FOLLOW_175_in_condExpr4081); 
                            string_literal323_tree = (CommonTree)adaptor.create(string_literal323);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal323_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr4086);
                    aexpr324=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr324.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:1: aexpr : mexpr ( ( '+' | '-' ) mexpr )* ;
    public final BPELscriptParser.aexpr_return aexpr() throws RecognitionException {
        BPELscriptParser.aexpr_return retval = new BPELscriptParser.aexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set326=null;
        BPELscriptParser.mexpr_return mexpr325 = null;

        BPELscriptParser.mexpr_return mexpr327 = null;


        CommonTree set326_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:8: ( mexpr ( ( '+' | '-' ) mexpr )* )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:10: mexpr ( ( '+' | '-' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr4097);
            mexpr325=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr325.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:16: ( ( '+' | '-' ) mexpr )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( ((LA115_0>=176 && LA115_0<=177)) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:17: ( '+' | '-' ) mexpr
            	    {
            	    set326=(Token)input.LT(1);
            	    set326=(Token)input.LT(1);
            	    if ( (input.LA(1)>=176 && input.LA(1)<=177) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set326), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr4108);
            	    mexpr327=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr327.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:1: mexpr : ( atom ( ( '*' | '/' ) atom )* | STRING );
    public final BPELscriptParser.mexpr_return mexpr() throws RecognitionException {
        BPELscriptParser.mexpr_return retval = new BPELscriptParser.mexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set329=null;
        Token STRING331=null;
        BPELscriptParser.atom_return atom328 = null;

        BPELscriptParser.atom_return atom330 = null;


        CommonTree set329_tree=null;
        CommonTree STRING331_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:8: ( atom ( ( '*' | '/' ) atom )* | STRING )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ID||LA117_0==INT||LA117_0==117) ) {
                alt117=1;
            }
            else if ( (LA117_0==STRING) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:10: atom ( ( '*' | '/' ) atom )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_mexpr4118);
                    atom328=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom328.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:15: ( ( '*' | '/' ) atom )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( ((LA116_0>=178 && LA116_0<=179)) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:16: ( '*' | '/' ) atom
                    	    {
                    	    set329=(Token)input.LT(1);
                    	    set329=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=178 && input.LA(1)<=179) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set329), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_atom_in_mexpr4129);
                    	    atom330=atom();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, atom330.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING331=(Token)match(input,STRING,FOLLOW_STRING_in_mexpr4135); 
                    STRING331_tree = (CommonTree)adaptor.create(STRING331);
                    adaptor.addChild(root_0, STRING331_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:1: atom : ( path_expr | INT | '(' s_expr ')' -> s_expr );
    public final BPELscriptParser.atom_return atom() throws RecognitionException {
        BPELscriptParser.atom_return retval = new BPELscriptParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT333=null;
        Token char_literal334=null;
        Token char_literal336=null;
        BPELscriptParser.path_expr_return path_expr332 = null;

        BPELscriptParser.s_expr_return s_expr335 = null;


        CommonTree INT333_tree=null;
        CommonTree char_literal334_tree=null;
        CommonTree char_literal336_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_s_expr=new RewriteRuleSubtreeStream(adaptor,"rule s_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:7: ( path_expr | INT | '(' s_expr ')' -> s_expr )
            int alt118=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt118=1;
                }
                break;
            case INT:
                {
                alt118=2;
                }
                break;
            case 117:
                {
                alt118=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:9: path_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_path_expr_in_atom4143);
                    path_expr332=path_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, path_expr332.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:21: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT333=(Token)match(input,INT,FOLLOW_INT_in_atom4147); 
                    INT333_tree = (CommonTree)adaptor.create(INT333);
                    adaptor.addChild(root_0, INT333_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:27: '(' s_expr ')'
                    {
                    char_literal334=(Token)match(input,117,FOLLOW_117_in_atom4151);  
                    stream_117.add(char_literal334);

                    pushFollow(FOLLOW_s_expr_in_atom4153);
                    s_expr335=s_expr();

                    state._fsp--;

                    stream_s_expr.add(s_expr335.getTree());
                    char_literal336=(Token)match(input,118,FOLLOW_118_in_atom4155);  
                    stream_118.add(char_literal336);



                    // AST REWRITE
                    // elements: s_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 386:42: -> s_expr
                    {
                        adaptor.addChild(root_0, stream_s_expr.nextTree());

                    }

                    retval.tree = root_0;retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class path_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "path_expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:1: path_expr : pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) ;
    public final BPELscriptParser.path_expr_return path_expr() throws RecognitionException {
        BPELscriptParser.path_expr_return retval = new BPELscriptParser.path_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal337=null;
        List list_pelmt=null;
        RuleReturnScope pelmt = null;
        CommonTree char_literal337_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:11: (pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:13: pelmt+= ns_id ( '.' pelmt+= ns_id )*
            {
            pushFollow(FOLLOW_ns_id_in_path_expr4168);
            pelmt=ns_id();

            state._fsp--;

            stream_ns_id.add(pelmt.getTree());
            if (list_pelmt==null) list_pelmt=new ArrayList();
            list_pelmt.add(pelmt);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:26: ( '.' pelmt+= ns_id )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==180) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:27: '.' pelmt+= ns_id
            	    {
            	    char_literal337=(Token)match(input,180,FOLLOW_180_in_path_expr4171);  
            	    stream_180.add(char_literal337);

            	    pushFollow(FOLLOW_ns_id_in_path_expr4175);
            	    pelmt=ns_id();

            	    state._fsp--;

            	    stream_ns_id.add(pelmt.getTree());
            	    if (list_pelmt==null) list_pelmt=new ArrayList();
            	    list_pelmt.add(pelmt);


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);



            // AST REWRITE
            // elements: pelmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: pelmt
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pelmt=new RewriteRuleSubtreeStream(adaptor,"token pelmt",list_pelmt);
            root_0 = (CommonTree)adaptor.nil();
            // 387:46: -> ^( PATH ( $pelmt)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:49: ^( PATH ( $pelmt)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PATH, "PATH"), root_1);

                if ( !(stream_pelmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pelmt.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_pelmt.nextTree()).getTree());

                }
                stream_pelmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "path_expr"

    public static class ns_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ns_id"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:1: ns_id : (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) ;
    public final BPELscriptParser.ns_id_return ns_id() throws RecognitionException {
        BPELscriptParser.ns_id_return retval = new BPELscriptParser.ns_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token pr=null;
        Token loc=null;
        Token string_literal338=null;

        CommonTree pr_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal338_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:8: ( (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:10: (pr= ID '::' )? loc= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:10: (pr= ID '::' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ID) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==164) ) {
                    alt120=1;
                }
            }
            switch (alt120) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:11: pr= ID '::'
                    {
                    pr=(Token)match(input,ID,FOLLOW_ID_in_ns_id4198);  
                    stream_ID.add(pr);

                    string_literal338=(Token)match(input,164,FOLLOW_164_in_ns_id4200);  
                    stream_164.add(string_literal338);


                    }
                    break;

            }

            loc=(Token)match(input,ID,FOLLOW_ID_in_ns_id4206);  
            stream_ID.add(loc);



            // AST REWRITE
            // elements: pr, loc
            // token labels: loc, pr
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_loc=new RewriteRuleTokenStream(adaptor,"token loc",loc);
            RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 388:31: -> ^( NS ( $pr)? $loc)
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:34: ^( NS ( $pr)? $loc)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NS, "NS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:39: ( $pr)?
                if ( stream_pr.hasNext() ) {
                    adaptor.addChild(root_1, stream_pr.nextNode());

                }
                stream_pr.reset();
                adaptor.addChild(root_1, stream_loc.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ns_id"

    public static class portType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "portType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:1: portType : ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) ;
    public final BPELscriptParser.portType_return portType() throws RecognitionException {
        BPELscriptParser.portType_return retval = new BPELscriptParser.portType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal339=null;
        Token string_literal340=null;
        Token STRING341=null;

        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree STRING341_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:11: ( ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:13: ( '@portType' | '@pt' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:13: ( '@portType' | '@pt' )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==181) ) {
                alt121=1;
            }
            else if ( (LA121_0==182) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:14: '@portType'
                    {
                    string_literal339=(Token)match(input,181,FOLLOW_181_in_portType4231);  
                    stream_181.add(string_literal339);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:28: '@pt'
                    {
                    string_literal340=(Token)match(input,182,FOLLOW_182_in_portType4235);  
                    stream_182.add(string_literal340);


                    }
                    break;

            }

            STRING341=(Token)match(input,STRING,FOLLOW_STRING_in_portType4238);  
            stream_STRING.add(STRING341);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 393:3: -> ^( PORTTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:6: ^( PORTTYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PORTTYPE, "PORTTYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "portType"

    public static class std_attr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "std_attr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:1: std_attr : ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) ;
    public final BPELscriptParser.std_attr_return std_attr() throws RecognitionException {
        BPELscriptParser.std_attr_return retval = new BPELscriptParser.std_attr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal342=null;

        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal342_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:10: ( ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:12: ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:12: ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop122:
            do {
                int alt122=3;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==114) ) {
                    int LA122_2 = input.LA(2);

                    if ( (name==null) ) {
                        alt122=1;
                    }


                }
                else if ( (LA122_0==SJF) ) {
                    int LA122_3 = input.LA(2);

                    if ( (suppressJoinFailure==null) ) {
                        alt122=2;
                    }


                }


                switch (alt122) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:14: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !(name==null) ) {
            	        throw new FailedPredicateException(input, "std_attr", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:28: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:29: '@name' name= STRING
            	    {
            	    string_literal342=(Token)match(input,114,FOLLOW_114_in_std_attr4262);  
            	    stream_114.add(string_literal342);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_std_attr4266);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:52: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !(suppressJoinFailure==null) ) {
            	        throw new FailedPredicateException(input, "std_attr", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_std_attr4275);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);



            // AST REWRITE
            // elements: name, suppressJoinFailure
            // token labels: suppressJoinFailure, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_suppressJoinFailure=new RewriteRuleTokenStream(adaptor,"token suppressJoinFailure",suppressJoinFailure);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 396:3: -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:396:6: ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STD_ATTR, "STD_ATTR"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:396:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:396:24: ( $suppressJoinFailure)?
                if ( stream_suppressJoinFailure.hasNext() ) {
                    adaptor.addChild(root_1, stream_suppressJoinFailure.nextNode());

                }
                stream_suppressJoinFailure.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "std_attr"

    public static class msgEx_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgEx"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:1: msgEx : ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) ;
    public final BPELscriptParser.msgEx_return msgEx() throws RecognitionException {
        BPELscriptParser.msgEx_return retval = new BPELscriptParser.msgEx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal343=null;
        Token string_literal344=null;
        Token STRING345=null;

        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree STRING345_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:8: ( ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:10: ( '@messageExchange' | '@mex' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:10: ( '@messageExchange' | '@mex' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==183) ) {
                alt123=1;
            }
            else if ( (LA123_0==184) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:11: '@messageExchange'
                    {
                    string_literal343=(Token)match(input,183,FOLLOW_183_in_msgEx4314);  
                    stream_183.add(string_literal343);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:32: '@mex'
                    {
                    string_literal344=(Token)match(input,184,FOLLOW_184_in_msgEx4318);  
                    stream_184.add(string_literal344);


                    }
                    break;

            }

            STRING345=(Token)match(input,STRING,FOLLOW_STRING_in_msgEx4321);  
            stream_STRING.add(STRING345);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 401:3: -> ^( MSGEX STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:6: ^( MSGEX STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGEX, "MSGEX"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgEx"

    public static class msgType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:1: msgType : ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) ;
    public final BPELscriptParser.msgType_return msgType() throws RecognitionException {
        BPELscriptParser.msgType_return retval = new BPELscriptParser.msgType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token msgT=null;
        Token string_literal346=null;
        Token string_literal347=null;

        CommonTree msgT_tree=null;
        CommonTree string_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:10: ( ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:12: ( '@messageType' | '@msgType' ) msgT= STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:12: ( '@messageType' | '@msgType' )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==185) ) {
                alt124=1;
            }
            else if ( (LA124_0==186) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:13: '@messageType'
                    {
                    string_literal346=(Token)match(input,185,FOLLOW_185_in_msgType4341);  
                    stream_185.add(string_literal346);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:30: '@msgType'
                    {
                    string_literal347=(Token)match(input,186,FOLLOW_186_in_msgType4345);  
                    stream_186.add(string_literal347);


                    }
                    break;

            }

            msgT=(Token)match(input,STRING,FOLLOW_STRING_in_msgType4350);  
            stream_STRING.add(msgT);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 404:3: -> ^( MSGTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:6: ^( MSGTYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGTYPE, "MSGTYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgType"

    public static class viType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "viType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:1: viType : '@type' type= STRING -> ^( VITYPE STRING ) ;
    public final BPELscriptParser.viType_return viType() throws RecognitionException {
        BPELscriptParser.viType_return retval = new BPELscriptParser.viType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token string_literal348=null;

        CommonTree type_tree=null;
        CommonTree string_literal348_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:9: ( '@type' type= STRING -> ^( VITYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:11: '@type' type= STRING
            {
            string_literal348=(Token)match(input,187,FOLLOW_187_in_viType4370);  
            stream_187.add(string_literal348);

            type=(Token)match(input,STRING,FOLLOW_STRING_in_viType4374);  
            stream_STRING.add(type);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:3: -> ^( VITYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:6: ^( VITYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VITYPE, "VITYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viType"

    public static class viElt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "viElt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:1: viElt : '@element' elt= STRING -> ^( VIELT STRING ) ;
    public final BPELscriptParser.viElt_return viElt() throws RecognitionException {
        BPELscriptParser.viElt_return retval = new BPELscriptParser.viElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token elt=null;
        Token string_literal349=null;

        CommonTree elt_tree=null;
        CommonTree string_literal349_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:8: ( '@element' elt= STRING -> ^( VIELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:10: '@element' elt= STRING
            {
            string_literal349=(Token)match(input,188,FOLLOW_188_in_viElt4394);  
            stream_188.add(string_literal349);

            elt=(Token)match(input,STRING,FOLLOW_STRING_in_viElt4398);  
            stream_STRING.add(elt);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 411:3: -> ^( VIELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:411:6: ^( VIELT STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIELT, "VIELT"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viElt"

    public static class faultName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "faultName"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:1: faultName : ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) ;
    public final BPELscriptParser.faultName_return faultName() throws RecognitionException {
        BPELscriptParser.faultName_return retval = new BPELscriptParser.faultName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal350=null;
        Token string_literal351=null;
        Token STRING352=null;

        CommonTree string_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        CommonTree STRING352_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:11: ( ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:13: ( '@faultName' | '@fault' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:13: ( '@faultName' | '@fault' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==189) ) {
                alt125=1;
            }
            else if ( (LA125_0==190) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:14: '@faultName'
                    {
                    string_literal350=(Token)match(input,189,FOLLOW_189_in_faultName4417);  
                    stream_189.add(string_literal350);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:29: '@fault'
                    {
                    string_literal351=(Token)match(input,190,FOLLOW_190_in_faultName4421);  
                    stream_190.add(string_literal351);


                    }
                    break;

            }

            STRING352=(Token)match(input,STRING,FOLLOW_STRING_in_faultName4424);  
            stream_STRING.add(STRING352);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 414:3: -> ^( FAULTNAME STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:414:6: ^( FAULTNAME STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FAULTNAME, "FAULTNAME"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultName"

    public static class faultElt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "faultElt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:1: faultElt : '@faultElement' STRING -> ^( FAULTELT STRING ) ;
    public final BPELscriptParser.faultElt_return faultElt() throws RecognitionException {
        BPELscriptParser.faultElt_return retval = new BPELscriptParser.faultElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal353=null;
        Token STRING354=null;

        CommonTree string_literal353_tree=null;
        CommonTree STRING354_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:10: ( '@faultElement' STRING -> ^( FAULTELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:12: '@faultElement' STRING
            {
            string_literal353=(Token)match(input,191,FOLLOW_191_in_faultElt4442);  
            stream_191.add(string_literal353);

            STRING354=(Token)match(input,STRING,FOLLOW_STRING_in_faultElt4444);  
            stream_STRING.add(STRING354);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:3: -> ^( FAULTELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:6: ^( FAULTELT STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FAULTELT, "FAULTELT"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultElt"

    public static class exprLg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:1: exprLg : ( '@expressionLanguage' | '@exprLg' ) STRING -> ^( EXPRLG STRING ) ;
    public final BPELscriptParser.exprLg_return exprLg() throws RecognitionException {
        BPELscriptParser.exprLg_return retval = new BPELscriptParser.exprLg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal355=null;
        Token string_literal356=null;
        Token STRING357=null;

        CommonTree string_literal355_tree=null;
        CommonTree string_literal356_tree=null;
        CommonTree STRING357_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:9: ( ( '@expressionLanguage' | '@exprLg' ) STRING -> ^( EXPRLG STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:11: ( '@expressionLanguage' | '@exprLg' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:11: ( '@expressionLanguage' | '@exprLg' )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==192) ) {
                alt126=1;
            }
            else if ( (LA126_0==193) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:12: '@expressionLanguage'
                    {
                    string_literal355=(Token)match(input,192,FOLLOW_192_in_exprLg4467);  
                    stream_192.add(string_literal355);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:36: '@exprLg'
                    {
                    string_literal356=(Token)match(input,193,FOLLOW_193_in_exprLg4471);  
                    stream_193.add(string_literal356);


                    }
                    break;

            }

            STRING357=(Token)match(input,STRING,FOLLOW_STRING_in_exprLg4474);  
            stream_STRING.add(STRING357);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 420:3: -> ^( EXPRLG STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:6: ^( EXPRLG STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLG, "EXPRLG"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprLg"

    public static class queryLg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "queryLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:1: queryLg : ( '@queryLanguage' | '@queryLg' ) STRING -> ^( QUERYLG STRING ) ;
    public final BPELscriptParser.queryLg_return queryLg() throws RecognitionException {
        BPELscriptParser.queryLg_return retval = new BPELscriptParser.queryLg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal358=null;
        Token string_literal359=null;
        Token STRING360=null;

        CommonTree string_literal358_tree=null;
        CommonTree string_literal359_tree=null;
        CommonTree STRING360_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:9: ( ( '@queryLanguage' | '@queryLg' ) STRING -> ^( QUERYLG STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:11: ( '@queryLanguage' | '@queryLg' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:11: ( '@queryLanguage' | '@queryLg' )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==194) ) {
                alt127=1;
            }
            else if ( (LA127_0==195) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:12: '@queryLanguage'
                    {
                    string_literal358=(Token)match(input,194,FOLLOW_194_in_queryLg4495);  
                    stream_194.add(string_literal358);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:31: '@queryLg'
                    {
                    string_literal359=(Token)match(input,195,FOLLOW_195_in_queryLg4499);  
                    stream_195.add(string_literal359);


                    }
                    break;

            }

            STRING360=(Token)match(input,STRING,FOLLOW_STRING_in_queryLg4502);  
            stream_STRING.add(STRING360);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 423:3: -> ^( QUERYLG STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:6: ^( QUERYLG STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUERYLG, "QUERYLG"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "queryLg"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA11_eotS =
        "\37\uffff";
    static final String DFA11_eofS =
        "\37\uffff";
    static final String DFA11_minS =
        "\1\122\1\127\1\122\2\uffff\1\122\11\uffff\1\122\1\127\1\122\1\127"+
        "\4\122\1\127\2\122\1\127\4\122";
    static final String DFA11_maxS =
        "\1\u00be\1\127\1\u00be\2\uffff\1\u00be\11\uffff\1\u00be\1\127\1"+
        "\u00be\1\127\4\u00be\1\127\2\u00be\1\127\4\u00be";
    static final String DFA11_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\20\uffff";
    static final String DFA11_specialS =
        "\37\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\12\1\uffff\1\16\1\5\1\uffff\1\16\2\11\1\12\1\uffff\3"+
            "\16\1\uffff\1\13\20\uffff\1\1\1\6\3\uffff\2\16\1\uffff\1\4\5"+
            "\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\3\uffff\1\14\3\uffff"+
            "\1\12\6\uffff\14\16\4\uffff\4\16\1\15\13\uffff\4\16\4\uffff"+
            "\2\16",
            "\1\17",
            "\1\2\1\12\1\uffff\1\16\1\21\1\uffff\1\16\2\11\1\12\1\uffff"+
            "\3\16\1\uffff\1\13\20\uffff\1\20\1\6\3\uffff\2\16\1\uffff\1"+
            "\4\5\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\7\uffff\1\12\6"+
            "\uffff\14\16\24\uffff\4\16\4\uffff\2\16",
            "",
            "",
            "\1\23\2\uffff\1\16\1\5\1\uffff\1\16\4\uffff\3\16\22\uffff\1"+
            "\22\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\2\uffff\1\16\1\25\1\uffff\1\16\2\11\2\uffff\3\16\1\uffff"+
            "\1\13\20\uffff\1\1\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3"+
            "\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\14\16\24\uffff\4\16"+
            "\4\uffff\2\16",
            "\1\26",
            "\1\30\2\uffff\1\16\1\21\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\27\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\31",
            "\1\23\2\uffff\1\16\1\5\1\uffff\1\16\4\uffff\3\16\22\uffff\1"+
            "\22\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\24\2\uffff\1\16\1\25\1\uffff\1\16\2\11\2\uffff\3\16\1\uffff"+
            "\1\13\20\uffff\1\1\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3"+
            "\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\14\16\24\uffff\4\16"+
            "\4\uffff\2\16",
            "\1\33\2\uffff\1\16\1\25\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\32\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\34\2\uffff\1\16\1\21\1\uffff\1\16\2\11\2\uffff\3\16\1\uffff"+
            "\1\13\20\uffff\1\20\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3"+
            "\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\14\16\24\uffff\4\16"+
            "\4\uffff\2\16",
            "\1\35",
            "\1\30\2\uffff\1\16\1\21\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\27\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\23\2\uffff\1\16\1\5\1\uffff\1\16\4\uffff\3\16\22\uffff\1"+
            "\22\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\36",
            "\1\33\2\uffff\1\16\1\25\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\32\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\34\2\uffff\1\16\1\21\1\uffff\1\16\2\11\2\uffff\3\16\1\uffff"+
            "\1\13\20\uffff\1\20\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3"+
            "\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\14\16\24\uffff\4\16"+
            "\4\uffff\2\16",
            "\1\30\2\uffff\1\16\1\21\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\27\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16",
            "\1\33\2\uffff\1\16\1\25\1\uffff\1\16\4\uffff\3\16\22\uffff"+
            "\1\32\1\6\41\uffff\1\16\37\uffff\4\16\4\uffff\2\16"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "118:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );";
        }
    }
    static final String DFA10_eotS =
        "\u00bb\uffff";
    static final String DFA10_eofS =
        "\u00bb\uffff";
    static final String DFA10_minS =
        "\1\122\3\127\1\122\1\uffff\2\127\1\122\1\uffff\2\127\16\uffff\2"+
        "\122\7\127\2\122\5\127\2\122\1\127\1\122\2\127\1\122\4\127\1\122"+
        "\4\127\5\122\5\127\1\122\2\127\1\122\3\127\4\122\5\127\3\122\5\127"+
        "\5\122\5\127\1\122\1\127\1\122\5\127\1\122\3\127\5\122\5\127\6\122"+
        "\3\127\4\122\5\127\1\122\1\127\1\122\5\127\1\122\3\127\15\122\5"+
        "\127\17\122";
    static final String DFA10_maxS =
        "\1\u00be\3\127\1\u00be\1\uffff\2\127\1\u00be\1\uffff\2\127\16\uffff"+
        "\2\u00be\7\127\2\u00be\5\127\2\u00be\1\127\1\u00be\2\127\1\u00be"+
        "\4\127\1\u00be\4\127\5\u00be\5\127\1\u00be\2\127\1\u00be\3\127\4"+
        "\u00be\5\127\3\u00be\5\127\5\u00be\5\127\1\u00be\1\127\1\u00be\5"+
        "\127\1\u00be\3\127\5\u00be\5\127\6\u00be\3\127\4\u00be\5\127\1\u00be"+
        "\1\127\1\u00be\5\127\1\u00be\3\127\15\u00be\5\127\17\u00be";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\3\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\1\16\1\17\1\20\u00a1\uffff";
    static final String DFA10_specialS =
        "\u00bb\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\3\4\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\3\16\1\17\1\26\1"+
            "\22\1\24\1\27\1\31\4\uffff\1\30\1\23\2\25\14\uffff\1\1\1\2\1"+
            "\6\1\7\4\uffff\1\12\1\13",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\4\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\34\4\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\3\16\1\17\1\26"+
            "\1\22\1\24\1\27\1\31\24\uffff\1\35\1\36\1\41\1\42\4\uffff\1"+
            "\37\1\40",
            "",
            "\1\44",
            "\1\44",
            "\1\52\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\51\42\uffff\1\11\37\uffff\1\45\1\46\1\47\1\50\4\uffff\2\15",
            "",
            "\1\53",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\54\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\56\1\57\4\uffff"+
            "\1\61\1\62",
            "\1\65\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\3\4\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\3\16\1\17\1\26"+
            "\1\22\1\24\1\27\1\31\24\uffff\1\63\1\64\1\70\1\71\4\uffff\1"+
            "\66\1\67",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\104\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\103\42\uffff\1\11\37\uffff\1\77\1\100\1\101\1\102\4\uffff"+
            "\2\15",
            "\1\113\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\112\42\uffff\1\11\1\14\36\uffff\1\105\1\106\1\6\1\7\4\uffff"+
            "\1\110\1\111",
            "\1\114",
            "\1\114",
            "\1\115",
            "\1\115",
            "\1\116",
            "\1\52\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\51\42\uffff\1\11\37\uffff\1\45\1\46\1\47\1\50\4\uffff\2\15",
            "\1\124\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\123"+
            "\43\uffff\1\14\36\uffff\1\117\1\120\1\121\1\122\4\uffff\1\12"+
            "\1\13",
            "\1\125",
            "\1\55\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\54\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\56\1\57\4\uffff"+
            "\1\61\1\62",
            "\1\126",
            "\1\126",
            "\1\134\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\133\42\uffff\1\11\37\uffff\1\127\1\130\1\131\1\132\4\uffff"+
            "\2\15",
            "\1\135",
            "\1\135",
            "\1\136",
            "\1\136",
            "\1\65\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\3\4\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\3\16\1\17\1\26"+
            "\1\22\1\24\1\27\1\31\24\uffff\1\63\1\64\1\70\1\71\4\uffff\1"+
            "\66\1\67",
            "\1\137",
            "\1\137",
            "\1\140",
            "\1\140",
            "\1\146\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\145\42\uffff\1\11\37\uffff\1\141\1\142\1\143\1\144\4\uffff"+
            "\2\15",
            "\1\4\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\34\4\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\3\16\1\17\1\26"+
            "\1\22\1\24\1\27\1\31\24\uffff\1\35\1\36\1\41\1\42\4\uffff\1"+
            "\37\1\40",
            "\1\150\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\147\42\uffff\1\11\1\14\1\5\35\uffff\1\35\1\36\1\41\1\42\4"+
            "\uffff\1\37\1\40",
            "\1\156\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\155"+
            "\43\uffff\1\14\36\uffff\1\151\1\152\1\153\1\154\4\uffff\1\37"+
            "\1\40",
            "\1\162\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\161\42\uffff\1\11\1\14\36\uffff\1\157\1\160\1\41\1\42\4\uffff"+
            "\1\37\1\40",
            "\1\163",
            "\1\163",
            "\1\164",
            "\1\164",
            "\1\165",
            "\1\104\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\103\42\uffff\1\11\37\uffff\1\77\1\100\1\101\1\102\4\uffff"+
            "\2\15",
            "\1\166",
            "\1\166",
            "\1\174\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\173\42\uffff\1\11\37\uffff\1\167\1\170\1\171\1\172\4\uffff"+
            "\2\15",
            "\1\175",
            "\1\175",
            "\1\176",
            "\1\113\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\112\42\uffff\1\11\1\14\36\uffff\1\105\1\106\1\6\1\7\4\uffff"+
            "\1\110\1\111",
            "\1\52\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\51\42\uffff\1\11\37\uffff\1\45\1\46\1\47\1\50\4\uffff\2\15",
            "\1\52\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\51\42\uffff\1\11\37\uffff\1\45\1\46\1\47\1\50\4\uffff\2\15",
            "\1\52\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\51\42\uffff\1\11\37\uffff\1\45\1\46\1\47\1\50\4\uffff\2\15",
            "\1\177",
            "\1\177",
            "\1\u0080",
            "\1\u0080",
            "\1\u0081",
            "\1\124\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\123"+
            "\43\uffff\1\14\36\uffff\1\117\1\120\1\121\1\122\4\uffff\1\12"+
            "\1\13",
            "\1\55\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\54\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\56\1\57\4\uffff"+
            "\1\61\1\62",
            "\1\u0085\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0084\42\uffff\1\11\1\14\36\uffff\1\u0082\1\u0083\1\56\1"+
            "\57\4\uffff\1\61\1\62",
            "\1\u0086",
            "\1\u0086",
            "\1\u0087",
            "\1\u0087",
            "\1\u0088",
            "\1\134\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\133\42\uffff\1\11\37\uffff\1\127\1\130\1\131\1\132\4\uffff"+
            "\2\15",
            "\1\u008e\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008d\43\uffff\1\14\36\uffff\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\4\uffff\1\61\1\62",
            "\1\u0090\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u008f\42\uffff\1\11\1\14\1\5\35\uffff\1\63\1\64\1\70\1\71"+
            "\4\uffff\1\66\1\67",
            "\1\u0096\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u0095\43\uffff\1\14\36\uffff\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\4\uffff\1\66\1\67",
            "\1\u009a\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0099\42\uffff\1\11\1\14\36\uffff\1\u0097\1\u0098\1\70\1"+
            "\71\4\uffff\1\66\1\67",
            "\1\u009b",
            "\1\u009b",
            "\1\u009c",
            "\1\u009c",
            "\1\u009d",
            "\1\146\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\145\42\uffff\1\11\37\uffff\1\141\1\142\1\143\1\144\4\uffff"+
            "\2\15",
            "\1\u009e",
            "\1\150\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\147\42\uffff\1\11\1\14\1\5\35\uffff\1\35\1\36\1\41\1\42\4"+
            "\uffff\1\37\1\40",
            "\1\u009f",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a0",
            "\1\u00a1",
            "\1\156\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\155"+
            "\43\uffff\1\14\36\uffff\1\151\1\152\1\153\1\154\4\uffff\1\37"+
            "\1\40",
            "\1\u00a2",
            "\1\u00a2",
            "\1\u00a3",
            "\1\162\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\161\42\uffff\1\11\1\14\36\uffff\1\157\1\160\1\41\1\42\4\uffff"+
            "\1\37\1\40",
            "\1\104\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\103\42\uffff\1\11\37\uffff\1\77\1\100\1\101\1\102\4\uffff"+
            "\2\15",
            "\1\104\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\103\42\uffff\1\11\37\uffff\1\77\1\100\1\101\1\102\4\uffff"+
            "\2\15",
            "\1\104\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\103\42\uffff\1\11\37\uffff\1\77\1\100\1\101\1\102\4\uffff"+
            "\2\15",
            "\1\113\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\112\42\uffff\1\11\1\14\36\uffff\1\105\1\106\1\6\1\7\4\uffff"+
            "\1\110\1\111",
            "\1\u00a4",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a5",
            "\1\u00a6",
            "\1\174\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\173\42\uffff\1\11\37\uffff\1\167\1\170\1\171\1\172\4\uffff"+
            "\2\15",
            "\1\u00ac\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ab\43\uffff\1\14\36\uffff\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\4\uffff\1\110\1\111",
            "\1\113\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\112\42\uffff\1\11\1\14\36\uffff\1\105\1\106\1\6\1\7\4\uffff"+
            "\1\110\1\111",
            "\1\124\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\123"+
            "\43\uffff\1\14\36\uffff\1\117\1\120\1\121\1\122\4\uffff\1\12"+
            "\1\13",
            "\1\124\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\123"+
            "\43\uffff\1\14\36\uffff\1\117\1\120\1\121\1\122\4\uffff\1\12"+
            "\1\13",
            "\1\124\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\123"+
            "\43\uffff\1\14\36\uffff\1\117\1\120\1\121\1\122\4\uffff\1\12"+
            "\1\13",
            "\1\u00ad",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u0085\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0084\42\uffff\1\11\1\14\36\uffff\1\u0082\1\u0083\1\56\1"+
            "\57\4\uffff\1\61\1\62",
            "\1\134\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\133\42\uffff\1\11\37\uffff\1\127\1\130\1\131\1\132\4\uffff"+
            "\2\15",
            "\1\134\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\133\42\uffff\1\11\37\uffff\1\127\1\130\1\131\1\132\4\uffff"+
            "\2\15",
            "\1\134\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\133\42\uffff\1\11\37\uffff\1\127\1\130\1\131\1\132\4\uffff"+
            "\2\15",
            "\1\u00af",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u008e\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008d\43\uffff\1\14\36\uffff\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\4\uffff\1\61\1\62",
            "\1\u00b2",
            "\1\u0090\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u008f\42\uffff\1\11\1\14\1\5\35\uffff\1\63\1\64\1\70\1\71"+
            "\4\uffff\1\66\1\67",
            "\1\u00b3",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u0096\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u0095\43\uffff\1\14\36\uffff\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\4\uffff\1\66\1\67",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u009a\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0099\42\uffff\1\11\1\14\36\uffff\1\u0097\1\u0098\1\70\1"+
            "\71\4\uffff\1\66\1\67",
            "\1\146\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\145\42\uffff\1\11\37\uffff\1\141\1\142\1\143\1\144\4\uffff"+
            "\2\15",
            "\1\146\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\145\42\uffff\1\11\37\uffff\1\141\1\142\1\143\1\144\4\uffff"+
            "\2\15",
            "\1\146\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\145\42\uffff\1\11\37\uffff\1\141\1\142\1\143\1\144\4\uffff"+
            "\2\15",
            "\1\150\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\147\42\uffff\1\11\1\14\1\5\35\uffff\1\35\1\36\1\41\1\42\4"+
            "\uffff\1\37\1\40",
            "\1\156\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\155"+
            "\43\uffff\1\14\36\uffff\1\151\1\152\1\153\1\154\4\uffff\1\37"+
            "\1\40",
            "\1\156\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\155"+
            "\43\uffff\1\14\36\uffff\1\151\1\152\1\153\1\154\4\uffff\1\37"+
            "\1\40",
            "\1\156\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\155"+
            "\43\uffff\1\14\36\uffff\1\151\1\152\1\153\1\154\4\uffff\1\37"+
            "\1\40",
            "\1\162\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\161\42\uffff\1\11\1\14\36\uffff\1\157\1\160\1\41\1\42\4\uffff"+
            "\1\37\1\40",
            "\1\162\2\uffff\1\15\1\43\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\161\42\uffff\1\11\1\14\36\uffff\1\157\1\160\1\41\1\42\4\uffff"+
            "\1\37\1\40",
            "\1\174\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\173\42\uffff\1\11\37\uffff\1\167\1\170\1\171\1\172\4\uffff"+
            "\2\15",
            "\1\174\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\173\42\uffff\1\11\37\uffff\1\167\1\170\1\171\1\172\4\uffff"+
            "\2\15",
            "\1\174\2\uffff\1\15\1\107\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\173\42\uffff\1\11\37\uffff\1\167\1\170\1\171\1\172\4\uffff"+
            "\2\15",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00ac\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ab\43\uffff\1\14\36\uffff\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\4\uffff\1\110\1\111",
            "\1\u0085\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0084\42\uffff\1\11\1\14\36\uffff\1\u0082\1\u0083\1\56\1"+
            "\57\4\uffff\1\61\1\62",
            "\1\u0085\2\uffff\1\15\1\60\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0084\42\uffff\1\11\1\14\36\uffff\1\u0082\1\u0083\1\56\1"+
            "\57\4\uffff\1\61\1\62",
            "\1\u008e\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008d\43\uffff\1\14\36\uffff\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\4\uffff\1\61\1\62",
            "\1\u008e\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008d\43\uffff\1\14\36\uffff\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\4\uffff\1\61\1\62",
            "\1\u008e\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008d\43\uffff\1\14\36\uffff\1\u0089\1\u008a\1\u008b\1\u008c"+
            "\4\uffff\1\61\1\62",
            "\1\u0090\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u008f\42\uffff\1\11\1\14\1\5\35\uffff\1\63\1\64\1\70\1\71"+
            "\4\uffff\1\66\1\67",
            "\1\u0096\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u0095\43\uffff\1\14\36\uffff\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\4\uffff\1\66\1\67",
            "\1\u0096\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u0095\43\uffff\1\14\36\uffff\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\4\uffff\1\66\1\67",
            "\1\u0096\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u0095\43\uffff\1\14\36\uffff\1\u0091\1\u0092\1\u0093\1\u0094"+
            "\4\uffff\1\66\1\67",
            "\1\u009a\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0099\42\uffff\1\11\1\14\36\uffff\1\u0097\1\u0098\1\70\1"+
            "\71\4\uffff\1\66\1\67",
            "\1\u009a\2\uffff\1\15\1\72\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0099\42\uffff\1\11\1\14\36\uffff\1\u0097\1\u0098\1\70\1"+
            "\71\4\uffff\1\66\1\67",
            "\1\u00ac\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ab\43\uffff\1\14\36\uffff\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\4\uffff\1\110\1\111",
            "\1\u00ac\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ab\43\uffff\1\14\36\uffff\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\4\uffff\1\110\1\111",
            "\1\u00ac\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ab\43\uffff\1\14\36\uffff\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\4\uffff\1\110\1\111"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )";
        }
    }
    static final String DFA25_eotS =
        "\12\uffff";
    static final String DFA25_eofS =
        "\12\uffff";
    static final String DFA25_minS =
        "\1\122\1\127\1\122\3\uffff\1\122\1\127\2\122";
    static final String DFA25_maxS =
        "\1\176\1\127\1\170\3\uffff\1\170\1\127\2\170";
    static final String DFA25_acceptS =
        "\3\uffff\1\1\1\2\1\3\4\uffff";
    static final String DFA25_specialS =
        "\12\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\33\uffff\1\5\3\uffff\1\1\4\uffff\1\3\1\4\1\5\3\uffff\2"+
            "\5",
            "\1\6",
            "\1\2\37\uffff\1\7\4\uffff\1\3\1\4",
            "",
            "",
            "",
            "\1\10\37\uffff\1\1\4\uffff\1\3\1\4",
            "\1\11",
            "\1\10\37\uffff\1\1\4\uffff\1\3\1\4",
            "\1\2\37\uffff\1\7\4\uffff\1\3\1\4"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "152:3: ( alarm | timeout )?";
        }
    }
    static final String DFA86_eotS =
        "\13\uffff";
    static final String DFA86_eofS =
        "\13\uffff";
    static final String DFA86_minS =
        "\1\122\12\uffff";
    static final String DFA86_maxS =
        "\1\u00be\12\uffff";
    static final String DFA86_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA86_specialS =
        "\13\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\12\2\uffff\1\1\1\3\1\uffff\1\1\4\uffff\1\4\1\5\1\6\22\uffff"+
            "\1\11\102\uffff\2\2\2\10\4\uffff\2\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "()* loopback of 285:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*";
        }
    }
    static final String DFA90_eotS =
        "\27\uffff";
    static final String DFA90_eofS =
        "\27\uffff";
    static final String DFA90_minS =
        "\1\60\2\127\1\uffff\1\127\1\122\3\uffff\2\122\4\127\1\122\2\127"+
        "\5\122";
    static final String DFA90_maxS =
        "\1\u00b8\2\127\1\uffff\1\127\1\u00b8\3\uffff\2\u00b8\4\127\1\u00b8"+
        "\2\127\5\u00b8";
    static final String DFA90_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\1\4\16\uffff";
    static final String DFA90_specialS =
        "\27\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\7\41\uffff\1\5\2\uffff\1\7\1\3\1\7\1\10\15\uffff\1\7\13\uffff"+
            "\1\4\2\uffff\1\7\37\uffff\1\3\1\uffff\1\6\35\uffff\1\1\1\2\2"+
            "\3",
            "\1\11",
            "\1\11",
            "",
            "\1\12",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "",
            "",
            "",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\26",
            "\1\26",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3"
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "293:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program328 = new BitSet(new long[]{0x0000000000000002L,0x00002004000C0000L,0x0800000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_process_in_declaration347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_process389 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_process398 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_process407 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_EOSF_in_process416 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_109_in_process424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_process426 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_std_attr_in_process428 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_ajoin_in_process434 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_asignal_in_process439 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_block_in_process445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_eventHdl_in_process447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_proc_stmts502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts504 = new BitSet(new long[]{0x0000000000000000L,0x058C0002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts508 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_signal_in_proc_stmts513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts515 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_proc_stmt554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_receive_in_proc_stmt600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_reply_in_proc_stmt604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_assign_in_proc_stmt608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_exit_in_proc_stmt628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variables_in_proc_stmt634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_validate_in_proc_stmt638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partner_links_in_proc_stmt642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_nop_in_proc_stmt650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_messages_in_proc_stmt654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_opaque_in_proc_stmt658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmt661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_block672 = new BitSet(new long[]{0x0000000000000000L,0x858C0002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_proc_stmts_in_block674 = new BitSet(new long[]{0x0000000000000000L,0x858C8002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_111_in_block677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_scope_block695 = new BitSet(new long[]{0x0000000000000000L,0x858CA006EF6C0000L,0x69E003E7FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block697 = new BitSet(new long[]{0x0000000000000000L,0x858CA006EF6C0000L,0x69E003E7FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block700 = new BitSet(new long[]{0x0000000000000000L,0x858C8002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_111_in_scope_block703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_param_block723 = new BitSet(new long[]{0x0000000000000000L,0x858D8002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_112_in_param_block726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param_block730 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_param_block733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param_block737 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_param_block741 = new BitSet(new long[]{0x0000000000000000L,0x858D8002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block745 = new BitSet(new long[]{0x0000000000000000L,0x858D8002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_111_in_param_block748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick789 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_114_in_pick816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_pick820 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_SJF_in_pick829 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_115_in_pick836 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_pick838 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_onMessage_in_pick840 = new BitSet(new long[]{0x0000000000000000L,0x6394C00000040000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_onAlarm_in_pick843 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L});
    public static final BitSet FOLLOW_111_in_pick846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onMessage899 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_msgEx_in_onMessage907 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_116_in_onMessage914 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onMessage916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage920 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage926 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage929 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onMessage931 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_onMessage935 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_onMessage937 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_block_in_onMessage950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_onAlarm1022 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L});
    public static final BitSet FOLLOW_timeout_in_onAlarm1026 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm1030 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_alarm1070 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_alarm1075 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_alarm1077 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_alarm1080 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_alarm1084 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_alarm1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_timeout1116 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_timeout1121 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_timeout1123 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_timeout1126 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_timeout1130 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_timeout1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_repeatEvery1161 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_repeatEvery1163 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1166 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_repeatEvery1170 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_repeatEvery1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_flow1196 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_flow1200 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_flow1204 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_flow1208 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_flow1212 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_124_in_signal1239 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_signal1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_signal1242 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_signal1245 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_signal1248 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_signal1252 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_signal1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_asignal1279 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_asignal1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_asignal1282 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_asignal1285 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_asignal1288 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_asignal1292 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_asignal1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ajoin1320 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ajoin1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ajoin1326 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ajoin1333 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1338 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_ajoin1341 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_ajoin1345 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ajoin1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_join1375 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_join1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_join1381 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_join1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_join1388 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_join1393 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_join1396 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_join1400 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_join1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_if_ex1434 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1436 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1441 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1445 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_ex1448 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_if_ex1452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_if_ex1458 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1460 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1465 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1469 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_ex1472 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_if_ex1476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_if_ex1484 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_if_ex1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_sequence1549 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_ajoin_in_sequence1555 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_asignal_in_sequence1560 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_body_in_sequence1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ajoin_in_scope_sequence1600 = new BitSet(new long[]{0x0000000000000000L,0xE78DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_asignal_in_scope_sequence1605 = new BitSet(new long[]{0x0000000000000000L,0xE78DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_while_ex1644 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_while_ex1646 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_while_ex1649 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_while_ex1651 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_while_ex1654 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_while_ex1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_until_ex1687 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_sequence_in_until_ex1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_until_ex1693 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_until_ex1695 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_until_ex1698 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_until_ex1700 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_until_ex1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1733 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SBO_in_foreach1741 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_114_in_foreach1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_foreach1772 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SJF_in_foreach1781 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_foreach1788 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_foreach1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_foreach1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_foreach1796 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_foreach1809 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1811 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1817 = new BitSet(new long[]{0x0000000000000000L,0x0040000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1823 = new BitSet(new long[]{0x0000000000000000L,0x0040000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_foreach1828 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1830 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1836 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1840 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_foreach1845 = new BitSet(new long[]{0x0000000000000000L,0xE78DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_scope_short_in_foreach1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_try_ex1930 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_body_in_try_ex1932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000003800L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex1934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000003800L});
    public static final BitSet FOLLOW_catchAll_in_try_ex1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_catch_ex1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_catch_ex1978 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_catch_ex1980 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex1982 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_catch_ex1985 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_block_in_catch_ex1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_catchAll2017 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_block_in_catchAll2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex2044 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex2052 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex2060 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_scope_ex2067 = new BitSet(new long[]{0x0000000000000000L,0xE7ADC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_117_in_scope_ex2070 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_ID_in_scope_ex2072 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_scope_ex2075 = new BitSet(new long[]{0x0000000000000000L,0xE7ADC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_termination_in_scope_stmt2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt2167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_143_in_termination2203 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_body_in_termination2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_eventHdl2223 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_eventHdl2225 = new BitSet(new long[]{0x0000000000000000L,0xE7BDC002EF6C0000L,0x77E003E1FFE24459L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2227 = new BitSet(new long[]{0x0000000000000000L,0xE7BDC002EF6C0000L,0x77E003E1FFE24459L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2230 = new BitSet(new long[]{0x0000000000000000L,0xE7ADC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_111_in_eventHdl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onEvent2264 = new BitSet(new long[]{0x0000000000000000L,0x0010000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2272 = new BitSet(new long[]{0x0000000000000000L,0x0010000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_msgType_in_onEvent2282 = new BitSet(new long[]{0x0000000000000000L,0x0010000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_viElt_in_onEvent2286 = new BitSet(new long[]{0x0000000000000000L,0x0010000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_onEvent2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_onEvent2305 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onEvent2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onEvent2311 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onEvent2317 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2320 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onEvent2322 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_onEvent2326 = new BitSet(new long[]{0x0000000000000000L,0xE7ADC002EF6C0000L,0x61E003E1FFE84459L});
    public static final BitSet FOLLOW_with_ex_in_onEvent2328 = new BitSet(new long[]{0x0000000000000000L,0xE7ADC002EF6C0000L,0x61E003E1FFE84459L});
    public static final BitSet FOLLOW_scope_short_in_onEvent2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_compensation2389 = new BitSet(new long[]{0x0000000000000000L,0xE58DC002EF6C0000L,0x61E003E1FFE04459L});
    public static final BitSet FOLLOW_body_in_compensation2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_with_ex2410 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_with_ex2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2416 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_with_ex2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2423 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_118_in_with_ex2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_with_map2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_with_map2455 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_KEY_in_with_map2457 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_path_expr_in_with_map2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_receive2497 = new BitSet(new long[]{0x0000000000000000L,0x0014000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_msgEx_in_receive2505 = new BitSet(new long[]{0x0000000000000000L,0x0014000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2513 = new BitSet(new long[]{0x0000000000000000L,0x0014000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_114_in_receive2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_receive2543 = new BitSet(new long[]{0x0000000000000000L,0x0014000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_SJF_in_receive2552 = new BitSet(new long[]{0x0000000000000000L,0x0014000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_149_in_receive2559 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_receive2561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_receive2565 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_receive2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_receive2571 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_receive2574 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_receive2576 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_receive2580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_receive2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_reply2641 = new BitSet(new long[]{0x0000000000000000L,0x0014000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_faultName_in_reply2649 = new BitSet(new long[]{0x0000000000000000L,0x0014000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_msgEx_in_reply2657 = new BitSet(new long[]{0x0000000000000000L,0x0014000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_114_in_reply2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_reply2686 = new BitSet(new long[]{0x0000000000000000L,0x0014000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_SJF_in_reply2695 = new BitSet(new long[]{0x0000000000000000L,0x0014000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_150_in_reply2702 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_reply2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply2708 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_reply2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply2714 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_reply2717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply2721 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_reply2726 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_reply2728 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_reply2732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_reply2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_invoke2795 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_114_in_invoke2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_invoke2824 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_SJF_in_invoke2833 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_151_in_invoke2840 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_invoke2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke2846 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke2852 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke2859 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2864 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_invoke2866 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_invoke2870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_with_ex_in_invoke2872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_compensation_in_invoke2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_assign2936 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2944 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_VALID_in_assign2952 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2960 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_assign2972 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_faultName_in_assign2980 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_msgEx_in_assign2988 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_114_in_assign3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_assign3020 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_SJF_in_assign3029 = new BitSet(new long[]{0x0000000000000000L,0x00140000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_assign3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_path_expr_in_assign3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PROP_in_assign3045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_assign3049 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000A00000L});
    public static final BitSet FOLLOW_rvalue_in_assign3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_rvalue3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue3126 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_rvalue3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_throw_ex3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_153_in_throw_ex3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_throw_ex3162 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_114_in_throw_ex3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_throw_ex3186 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_SJF_in_throw_ex3195 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_154_in_throw_ex3202 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_throw_ex3204 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex3206 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_throw_ex3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_rethrow_ex3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_compensate3265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_compensate3269 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_compensate3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_compensate3276 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_compensate3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_exit3303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_exit3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_validate3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_validate3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_validate3334 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_validate3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_validate3341 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_std_attr_in_ext_act3365 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_nop3393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_nop3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_opaque3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_opaque3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_namespace3441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_namespace3443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_namespace3445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_namespace3447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_namespace3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUSTUND_in_extension3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_extension3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_extension3478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_extension3480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_extension3482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_extension3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_viType_in_imports3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_163_in_imports3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_imports3520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_imports3522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_ID_in_imports3527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_imports3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_imports3536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_imports3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_messages3572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_messages3576 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_messages3579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_messages3583 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_message3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_variables3621 = new BitSet(new long[]{0x0000000000000000L,0x00102004002C0000L,0x1FE0000600020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_variable_in_variables3625 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_variables3628 = new BitSet(new long[]{0x0000000000000000L,0x00102004002C0000L,0x1FE0000600020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_variable_in_variables3632 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_msgType_in_variable3662 = new BitSet(new long[]{0x0000000000000000L,0x00102004002C0000L,0x1FE0000600020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_viType_in_variable3670 = new BitSet(new long[]{0x0000000000000000L,0x00102004002C0000L,0x1FE0000600020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_viElt_in_variable3678 = new BitSet(new long[]{0x0000000000000000L,0x00102004002C0000L,0x1FE0000600020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ID_in_variable3685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_variable3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_partner_links3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_168_in_partner_links3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links3737 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_partner_links3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links3744 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_partner_link3766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_partner_link3768 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_partner_link3770 = new BitSet(new long[]{0x0000000000000000L,0x00460000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3774 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3778 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3782 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3787 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3791 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partner_link3800 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_partner_link3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_correlation3840 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3842 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_113_in_correlation3845 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3847 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_111_in_correlation3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping3875 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping3883 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_ID_in_corr_mapping3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_corr_sets3927 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_corr_sets3929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3934 = new BitSet(new long[]{0x0000000000000000L,0x0000800000200000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3941 = new BitSet(new long[]{0x0000000000000000L,0x0000800000200000L});
    public static final BitSet FOLLOW_111_in_corr_sets3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_corr_set3965 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_corr_set3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_corr_set3971 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_corr_set3974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_corr_set3978 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_118_in_corr_set3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_expr_in_expr4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funct_call4022 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_funct_call4024 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_ID_in_funct_call4028 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_118_in_funct_call4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_s_expr4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr4056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000FC0000000000L});
    public static final BitSet FOLLOW_170_in_condExpr4061 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_171_in_condExpr4065 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_172_in_condExpr4069 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_173_in_condExpr4073 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_174_in_condExpr4077 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_175_in_condExpr4081 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_aexpr_in_condExpr4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr4097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_aexpr4100 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_mexpr_in_aexpr4108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr4118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_mexpr4121 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr4129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_STRING_in_mexpr4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_atom4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_atom4151 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_s_expr_in_atom4153 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_atom4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_path_expr4171 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_ns_id4198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_ns_id4200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ns_id4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_portType4231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_182_in_portType4235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_portType4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_std_attr4262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_std_attr4266 = new BitSet(new long[]{0x0000000000000002L,0x0004000000040000L});
    public static final BitSet FOLLOW_SJF_in_std_attr4275 = new BitSet(new long[]{0x0000000000000002L,0x0004000000040000L});
    public static final BitSet FOLLOW_183_in_msgEx4314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_184_in_msgEx4318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_msgEx4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_msgType4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_186_in_msgType4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_msgType4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_viType4370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_viType4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_viElt4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_viElt4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_faultName4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_190_in_faultName4421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_faultName4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_faultElt4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_faultElt4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_exprLg4467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_193_in_exprLg4471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_exprLg4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_queryLg4495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_195_in_queryLg4499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_queryLg4502 = new BitSet(new long[]{0x0000000000000002L});

}