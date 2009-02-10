// $ANTLR 3.1b2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g 2009-02-10 18:52:12

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

import antlr.CommonHiddenStreamToken;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BPELscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "OPAQUE", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "FINAL", "BRANCH", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "STRING", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "OPAQUE_EXPR", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'@queryLanguage'", "'@expressionLanguage'", "'process'", "'{'", "'}'", "'|'", "','", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'opaque()'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@name'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=101;
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
    public static final int VALID=91;
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
    public static final int KEY=90;
    public static final int MESSAGES=57;
    public static final int ELSE=12;
    public static final int INT=100;
    public static final int WAIT=22;
    public static final int SJF=81;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int CREATE_INST=85;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=106;
    public static final int T__129=129;
    public static final int SBO=88;
    public static final int CALL=50;
    public static final int EOSF=82;
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
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int SIGNAL=40;
    public static final int T__111=111;
    public static final int STD_ATTR=68;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int MESSAGE=72;
    public static final int T__112=112;
    public static final int BLOCK_PARAM=39;
    public static final int ISOLATED=89;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=93;
    public static final int MSGTYPE=76;
    public static final int FAULTELT=79;
    public static final int SEMI=83;
    public static final int VALIDATE=38;
    public static final int TERMINATION=73;
    public static final int BRANCH=63;
    public static final int CORRSETS=58;
    public static final int INITPARTNER=97;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=104;
    public static final int RECEIVE=18;
    public static final int EXTENSION=54;
    public static final int STRING=80;
    public static final int MSGEX=74;
    public static final int WHILE=13;
    public static final int OPAQUE=46;
    public static final int FAULTNAME=75;
    public static final int REPEATEVERY=70;
    public static final int INIT_COR=98;
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
    public static final int SL_COMMENTS=105;
    public static final int PATTERN_COR=99;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int UNTIL=14;
    public static final int CORRSET=59;
    public static final int REPLY=19;
    public static final int EXT_ACT=95;
    public static final int CATCH=26;
    public static final int THROW=21;
    public static final int KEEPSRC=92;
    public static final int PARALLEL=87;
    public static final int FOR=15;
    public static final int ALARM=30;
    public static final int ID=84;
    public static final int PROP=94;
    public static final int IF=10;
    public static final int EXPR=47;
    public static final int SCOPE=28;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int DIGIT=102;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int MUSTUND=96;
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
    public static final int OPAQUE_EXPR=86;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ESCAPE_SEQ=103;
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


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:1: program : ( declaration )+ -> ^( ROOT ( declaration )+ ) ;
    public final BPELscriptParser.program_return program() throws RecognitionException {
        BPELscriptParser.program_return retval = new BPELscriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.declaration_return declaration1 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:9: ( ( declaration )+ -> ^( ROOT ( declaration )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:11: ( declaration )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:11: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SJF && LA1_0<=EOSF)||LA1_0==MUSTUND||(LA1_0>=107 && LA1_0<=109)||(LA1_0>=160 && LA1_0<=161)||LA1_0==187) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program318);
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
            // 79:24: -> ^( ROOT ( declaration )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:27: ^( ROOT ( declaration )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:1: declaration : ( process | sub_declaration );
    public final BPELscriptParser.declaration_return declaration() throws RecognitionException {
        BPELscriptParser.declaration_return retval = new BPELscriptParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.process_return process2 = null;

        BPELscriptParser.sub_declaration_return sub_declaration3 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:13: ( process | sub_declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=SJF && LA2_0<=EOSF)||(LA2_0>=107 && LA2_0<=109)) ) {
                alt2=1;
            }
            else if ( (LA2_0==MUSTUND||(LA2_0>=160 && LA2_0<=161)||LA2_0==187) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:15: process
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_process_in_declaration337);
                    process2=process();

                    state._fsp--;

                    adaptor.addChild(root_0, process2.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:25: sub_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sub_declaration_in_declaration341);
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:83:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptParser.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptParser.sub_declaration_return retval = new BPELscriptParser.sub_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.namespace_return namespace4 = null;

        BPELscriptParser.extension_return extension5 = null;

        BPELscriptParser.imports_return imports6 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:3: ( namespace | extension | imports )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 160:
                {
                alt3=1;
                }
                break;
            case MUSTUND:
            case 161:
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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:5: namespace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_sub_declaration351);
                    namespace4=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace4.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:17: extension
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_extension_in_sub_declaration355);
                    extension5=extension();

                    state._fsp--;

                    adaptor.addChild(root_0, extension5.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:29: imports
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_imports_in_sub_declaration359);
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:87:1: process : ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) ;
    public final BPELscriptParser.process_return process() throws RecognitionException {
        BPELscriptParser.process_return retval = new BPELscriptParser.process_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token queryLg=null;
        Token exprLg=null;
        Token sjf=null;
        Token exitOnStandardFault=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        List list_j=null;
        List list_s=null;
        BPELscriptParser.ns_id_return ns_id10 = null;

        BPELscriptParser.std_attr_return std_attr11 = null;

        BPELscriptParser.block_return block12 = null;

        BPELscriptParser.eventHdl_return eventHdl13 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        CommonTree queryLg_tree=null;
        CommonTree exprLg_tree=null;
        CommonTree sjf_tree=null;
        CommonTree exitOnStandardFault_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:2: ( ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:4: ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:4: ( '@queryLanguage' queryLg= STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==107) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:5: '@queryLanguage' queryLg= STRING
                    {
                    string_literal7=(Token)match(input,107,FOLLOW_107_in_process370);  
                    stream_107.add(string_literal7);

                    queryLg=(Token)match(input,STRING,FOLLOW_STRING_in_process374);  
                    stream_STRING.add(queryLg);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:3: ( '@expressionLanguage' exprLg= STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==108) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:4: '@expressionLanguage' exprLg= STRING
                    {
                    string_literal8=(Token)match(input,108,FOLLOW_108_in_process381);  
                    stream_108.add(string_literal8);

                    exprLg=(Token)match(input,STRING,FOLLOW_STRING_in_process385);  
                    stream_STRING.add(exprLg);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:90:6: (sjf= SJF )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SJF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:90:6: sjf= SJF
                    {
                    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_process394);  
                    stream_SJF.add(sjf);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:91:22: (exitOnStandardFault= EOSF )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOSF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:91:22: exitOnStandardFault= EOSF
                    {
                    exitOnStandardFault=(Token)match(input,EOSF,FOLLOW_EOSF_in_process401);  
                    stream_EOSF.add(exitOnStandardFault);


                    }
                    break;

            }

            string_literal9=(Token)match(input,109,FOLLOW_109_in_process406);  
            stream_109.add(string_literal9);

            pushFollow(FOLLOW_ns_id_in_process408);
            ns_id10=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id10.getTree());
            pushFollow(FOLLOW_std_attr_in_process410);
            std_attr11=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr11.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:4: (j+= ajoin )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==125) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_process416);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:14: (s+= asignal )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==124) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_process421);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_process427);
            block12=block();

            state._fsp--;

            stream_block.add(block12.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:9: ( eventHdl )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==143) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:9: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process429);
                    eventHdl13=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl13.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: block, sjf, std_attr, eventHdl, ns_id, exitOnStandardFault, exprLg, asignal, ajoin, queryLg
            // token labels: exitOnStandardFault, sjf, queryLg, exprLg
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_exitOnStandardFault=new RewriteRuleTokenStream(adaptor,"token exitOnStandardFault",exitOnStandardFault);
            RewriteRuleTokenStream stream_sjf=new RewriteRuleTokenStream(adaptor,"token sjf",sjf);
            RewriteRuleTokenStream stream_queryLg=new RewriteRuleTokenStream(adaptor,"token queryLg",queryLg);
            RewriteRuleTokenStream stream_exprLg=new RewriteRuleTokenStream(adaptor,"token exprLg",exprLg);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:2: -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:5: ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCESS, "PROCESS"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:27: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:37: ( $queryLg)?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextNode());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:47: ( $exprLg)?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextNode());

                }
                stream_exprLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:56: ( $sjf)?
                if ( stream_sjf.hasNext() ) {
                    adaptor.addChild(root_1, stream_sjf.nextNode());

                }
                stream_sjf.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:62: ( $exitOnStandardFault)?
                if ( stream_exitOnStandardFault.hasNext() ) {
                    adaptor.addChild(root_1, stream_exitOnStandardFault.nextNode());

                }
                stream_exitOnStandardFault.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:93: ( ajoin )?
                if ( stream_ajoin.hasNext() ) {
                    adaptor.addChild(root_1, stream_ajoin.nextTree());

                }
                stream_ajoin.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:100: ( asignal )*
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:1: proc_stmts : ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) ;
    public final BPELscriptParser.proc_stmts_return proc_stmts() throws RecognitionException {
        BPELscriptParser.proc_stmts_return retval = new BPELscriptParser.proc_stmts_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI15=null;
        Token SEMI17=null;
        List list_s=null;
        BPELscriptParser.join_return join14 = null;

        BPELscriptParser.proc_stmt_return proc_stmt16 = null;

        RuleReturnScope s = null;
        CommonTree SEMI15_tree=null;
        CommonTree SEMI17_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_proc_stmt=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmt");
        RewriteRuleSubtreeStream stream_signal=new RewriteRuleSubtreeStream(adaptor,"rule signal");
        RewriteRuleSubtreeStream stream_join=new RewriteRuleSubtreeStream(adaptor,"rule join");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:2: ( ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:4: ( join SEMI )? proc_stmt (s+= signal SEMI )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:4: ( join SEMI )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==126) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:5: join SEMI
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts479);
                    join14=join();

                    state._fsp--;

                    stream_join.add(join14.getTree());
                    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts481);  
                    stream_SEMI.add(SEMI15);


                    }
                    break;

            }

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts485);
            proc_stmt16=proc_stmt();

            state._fsp--;

            stream_proc_stmt.add(proc_stmt16.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:27: (s+= signal SEMI )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==123) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:28: s+= signal SEMI
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts490);
            	    s=signal();

            	    state._fsp--;

            	    stream_signal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);

            	    SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts492);  
            	    stream_SEMI.add(SEMI17);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: signal, proc_stmt, join
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:2: -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:6: ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_STMTS, "PROC_STMTS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:19: ( join )?
                if ( stream_join.hasNext() ) {
                    adaptor.addChild(root_1, stream_join.nextTree());

                }
                stream_join.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:25: ( signal )*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:101:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );
    public final BPELscriptParser.proc_stmt_return proc_stmt() throws RecognitionException {
        BPELscriptParser.proc_stmt_return retval = new BPELscriptParser.proc_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI44=null;
        BPELscriptParser.if_ex_return if_ex18 = null;

        BPELscriptParser.flow_return flow19 = null;

        BPELscriptParser.pick_return pick20 = null;

        BPELscriptParser.while_ex_return while_ex21 = null;

        BPELscriptParser.until_ex_return until_ex22 = null;

        BPELscriptParser.foreach_return foreach23 = null;

        BPELscriptParser.scope_ex_return scope_ex24 = null;

        BPELscriptParser.ext_act_return ext_act25 = null;

        BPELscriptParser.try_ex_return try_ex26 = null;

        BPELscriptParser.corr_sets_return corr_sets27 = null;

        BPELscriptParser.invoke_return invoke28 = null;

        BPELscriptParser.receive_return receive29 = null;

        BPELscriptParser.reply_return reply30 = null;

        BPELscriptParser.assign_return assign31 = null;

        BPELscriptParser.throw_ex_return throw_ex32 = null;

        BPELscriptParser.rethrow_ex_return rethrow_ex33 = null;

        BPELscriptParser.alarm_return alarm34 = null;

        BPELscriptParser.timeout_return timeout35 = null;

        BPELscriptParser.exit_return exit36 = null;

        BPELscriptParser.variables_return variables37 = null;

        BPELscriptParser.validate_return validate38 = null;

        BPELscriptParser.partner_links_return partner_links39 = null;

        BPELscriptParser.compensate_return compensate40 = null;

        BPELscriptParser.nop_return nop41 = null;

        BPELscriptParser.messages_return messages42 = null;

        BPELscriptParser.opaque_return opaque43 = null;


        CommonTree SEMI44_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:2: ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) )
            int alt14=11;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:3: if_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_ex_in_proc_stmt523);
                    if_ex18=if_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, if_ex18.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:11: flow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flow_in_proc_stmt527);
                    flow19=flow();

                    state._fsp--;

                    adaptor.addChild(root_0, flow19.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:18: pick
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pick_in_proc_stmt531);
                    pick20=pick();

                    state._fsp--;

                    adaptor.addChild(root_0, pick20.getTree());

                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:25: while_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_ex_in_proc_stmt535);
                    while_ex21=while_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, while_ex21.getTree());

                    }
                    break;
                case 5 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:36: until_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_until_ex_in_proc_stmt539);
                    until_ex22=until_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, until_ex22.getTree());

                    }
                    break;
                case 6 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:47: foreach
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_in_proc_stmt543);
                    foreach23=foreach();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach23.getTree());

                    }
                    break;
                case 7 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:57: scope_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scope_ex_in_proc_stmt547);
                    scope_ex24=scope_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, scope_ex24.getTree());

                    }
                    break;
                case 8 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:68: ext_act
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ext_act_in_proc_stmt551);
                    ext_act25=ext_act();

                    state._fsp--;

                    adaptor.addChild(root_0, ext_act25.getTree());

                    }
                    break;
                case 9 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:5: try_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_ex_in_proc_stmt558);
                    try_ex26=try_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, try_ex26.getTree());

                    }
                    break;
                case 10 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:14: corr_sets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_corr_sets_in_proc_stmt562);
                    corr_sets27=corr_sets();

                    state._fsp--;

                    adaptor.addChild(root_0, corr_sets27.getTree());

                    }
                    break;
                case 11 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )
                    int alt13=16;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:7: invoke
                            {
                            pushFollow(FOLLOW_invoke_in_proc_stmt573);
                            invoke28=invoke();

                            state._fsp--;

                            adaptor.addChild(root_0, invoke28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:16: receive
                            {
                            pushFollow(FOLLOW_receive_in_proc_stmt577);
                            receive29=receive();

                            state._fsp--;

                            adaptor.addChild(root_0, receive29.getTree());

                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:26: reply
                            {
                            pushFollow(FOLLOW_reply_in_proc_stmt581);
                            reply30=reply();

                            state._fsp--;

                            adaptor.addChild(root_0, reply30.getTree());

                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:34: assign
                            {
                            pushFollow(FOLLOW_assign_in_proc_stmt585);
                            assign31=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign31.getTree());

                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:43: throw_ex
                            {
                            pushFollow(FOLLOW_throw_ex_in_proc_stmt589);
                            throw_ex32=throw_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, throw_ex32.getTree());

                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:54: rethrow_ex
                            {
                            pushFollow(FOLLOW_rethrow_ex_in_proc_stmt593);
                            rethrow_ex33=rethrow_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, rethrow_ex33.getTree());

                            }
                            break;
                        case 7 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:67: alarm
                            {
                            pushFollow(FOLLOW_alarm_in_proc_stmt597);
                            alarm34=alarm();

                            state._fsp--;

                            adaptor.addChild(root_0, alarm34.getTree());

                            }
                            break;
                        case 8 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:75: timeout
                            {
                            pushFollow(FOLLOW_timeout_in_proc_stmt601);
                            timeout35=timeout();

                            state._fsp--;

                            adaptor.addChild(root_0, timeout35.getTree());

                            }
                            break;
                        case 9 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:85: exit
                            {
                            pushFollow(FOLLOW_exit_in_proc_stmt605);
                            exit36=exit();

                            state._fsp--;

                            adaptor.addChild(root_0, exit36.getTree());

                            }
                            break;
                        case 10 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:5: variables
                            {
                            pushFollow(FOLLOW_variables_in_proc_stmt611);
                            variables37=variables();

                            state._fsp--;

                            adaptor.addChild(root_0, variables37.getTree());

                            }
                            break;
                        case 11 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:17: validate
                            {
                            pushFollow(FOLLOW_validate_in_proc_stmt615);
                            validate38=validate();

                            state._fsp--;

                            adaptor.addChild(root_0, validate38.getTree());

                            }
                            break;
                        case 12 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:28: partner_links
                            {
                            pushFollow(FOLLOW_partner_links_in_proc_stmt619);
                            partner_links39=partner_links();

                            state._fsp--;

                            adaptor.addChild(root_0, partner_links39.getTree());

                            }
                            break;
                        case 13 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:44: compensate
                            {
                            pushFollow(FOLLOW_compensate_in_proc_stmt623);
                            compensate40=compensate();

                            state._fsp--;

                            adaptor.addChild(root_0, compensate40.getTree());

                            }
                            break;
                        case 14 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:57: nop
                            {
                            pushFollow(FOLLOW_nop_in_proc_stmt627);
                            nop41=nop();

                            state._fsp--;

                            adaptor.addChild(root_0, nop41.getTree());

                            }
                            break;
                        case 15 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:63: messages
                            {
                            pushFollow(FOLLOW_messages_in_proc_stmt631);
                            messages42=messages();

                            state._fsp--;

                            adaptor.addChild(root_0, messages42.getTree());

                            }
                            break;
                        case 16 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:74: opaque
                            {
                            pushFollow(FOLLOW_opaque_in_proc_stmt635);
                            opaque43=opaque();

                            state._fsp--;

                            adaptor.addChild(root_0, opaque43.getTree());

                            }
                            break;

                    }

                    SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmt638); 

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:1: block : '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) ;
    public final BPELscriptParser.block_return block() throws RecognitionException {
        BPELscriptParser.block_return retval = new BPELscriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal45=null;
        Token char_literal47=null;
        BPELscriptParser.proc_stmts_return proc_stmts46 = null;


        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:8: ( '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:10: '{' ( proc_stmts )+ '}'
            {
            char_literal45=(Token)match(input,110,FOLLOW_110_in_block649);  
            stream_110.add(char_literal45);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: ( proc_stmts )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=SJF && LA15_0<=EOSF)||(LA15_0>=ID && LA15_0<=ISOLATED)||(LA15_0>=VALID && LA15_0<=IGNORE)||LA15_0==EXT_ACT||LA15_0==110||LA15_0==114||(LA15_0>=118 && LA15_0<=119)||LA15_0==121||(LA15_0>=124 && LA15_0<=127)||(LA15_0>=130 && LA15_0<=131)||LA15_0==133||LA15_0==137||LA15_0==141||(LA15_0>=148 && LA15_0<=159)||(LA15_0>=164 && LA15_0<=168)||(LA15_0>=180 && LA15_0<=184)||(LA15_0>=189 && LA15_0<=190)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block651);
            	    proc_stmts46=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts46.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            char_literal47=(Token)match(input,111,FOLLOW_111_in_block654);  
            stream_111.add(char_literal47);



            // AST REWRITE
            // elements: proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:30: -> ^( SEQUENCE ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:33: ^( SEQUENCE ( proc_stmts )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:1: scope_block : '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) ;
    public final BPELscriptParser.scope_block_return scope_block() throws RecognitionException {
        BPELscriptParser.scope_block_return retval = new BPELscriptParser.scope_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal51=null;
        BPELscriptParser.sub_declaration_return sub_declaration49 = null;

        BPELscriptParser.proc_stmts_return proc_stmts50 = null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_sub_declaration=new RewriteRuleSubtreeStream(adaptor,"rule sub_declaration");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:13: ( '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:15: '{' ( sub_declaration )* ( proc_stmts )+ '}'
            {
            char_literal48=(Token)match(input,110,FOLLOW_110_in_scope_block672);  
            stream_110.add(char_literal48);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:19: ( sub_declaration )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MUSTUND||(LA16_0>=160 && LA16_0<=161)||LA16_0==187) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:19: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block674);
            	    sub_declaration49=sub_declaration();

            	    state._fsp--;

            	    stream_sub_declaration.add(sub_declaration49.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:36: ( proc_stmts )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=SJF && LA17_0<=EOSF)||(LA17_0>=ID && LA17_0<=ISOLATED)||(LA17_0>=VALID && LA17_0<=IGNORE)||LA17_0==EXT_ACT||LA17_0==110||LA17_0==114||(LA17_0>=118 && LA17_0<=119)||LA17_0==121||(LA17_0>=124 && LA17_0<=127)||(LA17_0>=130 && LA17_0<=131)||LA17_0==133||LA17_0==137||LA17_0==141||(LA17_0>=148 && LA17_0<=159)||(LA17_0>=164 && LA17_0<=168)||(LA17_0>=180 && LA17_0<=184)||(LA17_0>=189 && LA17_0<=190)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:36: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block677);
            	    proc_stmts50=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts50.getTree());

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

            char_literal51=(Token)match(input,111,FOLLOW_111_in_scope_block680);  
            stream_111.add(char_literal51);



            // AST REWRITE
            // elements: sub_declaration, proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:52: -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:55: ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:66: ( sub_declaration )*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:1: param_block : '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) ;
    public final BPELscriptParser.param_block_return param_block() throws RecognitionException {
        BPELscriptParser.param_block_return retval = new BPELscriptParser.param_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token in=null;
        List list_in=null;
        BPELscriptParser.proc_stmts_return proc_stmts56 = null;


        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree in_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:13: ( '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:15: '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}'
            {
            char_literal52=(Token)match(input,110,FOLLOW_110_in_param_block700);  
            stream_110.add(char_literal52);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:19: ( '|' in+= ID ( ',' in+= ID )* '|' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==112) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:20: '|' in+= ID ( ',' in+= ID )* '|'
                    {
                    char_literal53=(Token)match(input,112,FOLLOW_112_in_param_block703);  
                    stream_112.add(char_literal53);

                    in=(Token)match(input,ID,FOLLOW_ID_in_param_block707);  
                    stream_ID.add(in);

                    if (list_in==null) list_in=new ArrayList();
                    list_in.add(in);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:31: ( ',' in+= ID )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==113) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:32: ',' in+= ID
                    	    {
                    	    char_literal54=(Token)match(input,113,FOLLOW_113_in_param_block710);  
                    	    stream_113.add(char_literal54);

                    	    in=(Token)match(input,ID,FOLLOW_ID_in_param_block714);  
                    	    stream_ID.add(in);

                    	    if (list_in==null) list_in=new ArrayList();
                    	    list_in.add(in);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    char_literal55=(Token)match(input,112,FOLLOW_112_in_param_block718);  
                    stream_112.add(char_literal55);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:51: ( proc_stmts )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=SJF && LA20_0<=EOSF)||(LA20_0>=ID && LA20_0<=ISOLATED)||(LA20_0>=VALID && LA20_0<=IGNORE)||LA20_0==EXT_ACT||LA20_0==110||LA20_0==114||(LA20_0>=118 && LA20_0<=119)||LA20_0==121||(LA20_0>=124 && LA20_0<=127)||(LA20_0>=130 && LA20_0<=131)||LA20_0==133||LA20_0==137||LA20_0==141||(LA20_0>=148 && LA20_0<=159)||(LA20_0>=164 && LA20_0<=168)||(LA20_0>=180 && LA20_0<=184)||(LA20_0>=189 && LA20_0<=190)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:51: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block722);
            	    proc_stmts56=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts56.getTree());

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

            char_literal57=(Token)match(input,111,FOLLOW_111_in_param_block725);  
            stream_111.add(char_literal57);



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
            // 113:67: -> ^( SEQUENCE ( $in)* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:70: ^( SEQUENCE ( $in)* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:81: ( $in)*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:1: body : ( block | proc_stmts );
    public final BPELscriptParser.body_return body() throws RecognitionException {
        BPELscriptParser.body_return retval = new BPELscriptParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.block_return block58 = null;

        BPELscriptParser.proc_stmts_return proc_stmts59 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:7: ( block | proc_stmts )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==110) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=SJF && LA21_0<=EOSF)||(LA21_0>=ID && LA21_0<=ISOLATED)||(LA21_0>=VALID && LA21_0<=IGNORE)||LA21_0==EXT_ACT||LA21_0==114||(LA21_0>=118 && LA21_0<=119)||LA21_0==121||(LA21_0>=126 && LA21_0<=127)||(LA21_0>=130 && LA21_0<=131)||LA21_0==133||LA21_0==137||LA21_0==141||(LA21_0>=148 && LA21_0<=159)||(LA21_0>=164 && LA21_0<=168)||(LA21_0>=180 && LA21_0<=184)||(LA21_0>=189 && LA21_0<=190)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_body747);
                    block58=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block58.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:17: proc_stmts
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proc_stmts_in_body751);
                    proc_stmts59=proc_stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, proc_stmts59.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:1: pick : ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr ) ;
    public final BPELscriptParser.pick_return pick() throws RecognitionException {
        BPELscriptParser.pick_return retval = new BPELscriptParser.pick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE_INST60=null;
        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal66=null;
        BPELscriptParser.std_attr_return std_attr61 = null;

        BPELscriptParser.onMessage_return onMessage64 = null;

        BPELscriptParser.onAlarm_return onAlarm65 = null;


        CommonTree CREATE_INST60_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        RewriteRuleSubtreeStream stream_onMessage=new RewriteRuleSubtreeStream(adaptor,"rule onMessage");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:6: ( ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:8: ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:8: ( CREATE_INST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CREATE_INST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:8: CREATE_INST
                    {
                    CREATE_INST60=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick760);  
                    stream_CREATE_INST.add(CREATE_INST60);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_pick763);
            std_attr61=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr61.getTree());
            string_literal62=(Token)match(input,114,FOLLOW_114_in_pick767);  
            stream_114.add(string_literal62);

            char_literal63=(Token)match(input,110,FOLLOW_110_in_pick769);  
            stream_110.add(char_literal63);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:14: ( onMessage )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==115||(LA23_0>=180 && LA23_0<=181)||(LA23_0>=183 && LA23_0<=184)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:14: onMessage
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick771);
            	    onMessage64=onMessage();

            	    state._fsp--;

            	    stream_onMessage.add(onMessage64.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:25: ( onAlarm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SJF||LA24_0==110||(LA24_0>=118 && LA24_0<=120)||(LA24_0>=124 && LA24_0<=125)||LA24_0==182) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:25: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick774);
            	    onAlarm65=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm65.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal66=(Token)match(input,111,FOLLOW_111_in_pick777);  
            stream_111.add(char_literal66);



            // AST REWRITE
            // elements: CREATE_INST, std_attr, onAlarm, onMessage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:38: -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:41: ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr )
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
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:59: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:68: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
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
    // $ANTLR end "pick"

    public static class onMessage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onMessage"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:121:1: onMessage : ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) ;
    public final BPELscriptParser.onMessage_return onMessage() throws RecognitionException {
        BPELscriptParser.onMessage_return retval = new BPELscriptParser.onMessage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token string_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        BPELscriptParser.portType_return portType67 = null;

        BPELscriptParser.msgEx_return msgEx68 = null;

        BPELscriptParser.correlation_return correlation73 = null;

        BPELscriptParser.with_ex_return with_ex75 = null;

        BPELscriptParser.param_block_return param_block76 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:10: ( ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:12: ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:12: ( portType )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=180 && LA25_0<=181)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage812);
                    portType67=portType();

                    state._fsp--;

                    stream_portType.add(portType67.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:22: ( msgEx )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=183 && LA26_0<=184)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:22: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage815);
                    msgEx68=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx68.getTree());

                    }
                    break;

            }

            string_literal69=(Token)match(input,115,FOLLOW_115_in_onMessage820);  
            stream_115.add(string_literal69);

            char_literal70=(Token)match(input,116,FOLLOW_116_in_onMessage822);  
            stream_116.add(char_literal70);

            p=(Token)match(input,ID,FOLLOW_ID_in_onMessage826);  
            stream_ID.add(p);

            char_literal71=(Token)match(input,113,FOLLOW_113_in_onMessage828);  
            stream_113.add(char_literal71);

            o=(Token)match(input,ID,FOLLOW_ID_in_onMessage832);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:33: ( ',' correlation )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==113) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:34: ',' correlation
                    {
                    char_literal72=(Token)match(input,113,FOLLOW_113_in_onMessage835);  
                    stream_113.add(char_literal72);

                    pushFollow(FOLLOW_correlation_in_onMessage837);
                    correlation73=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation73.getTree());

                    }
                    break;

            }

            char_literal74=(Token)match(input,117,FOLLOW_117_in_onMessage841);  
            stream_117.add(char_literal74);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:56: ( with_ex )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==146) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:56: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage843);
                    with_ex75=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex75.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_onMessage856);
            param_block76=param_block();

            state._fsp--;

            stream_param_block.add(param_block76.getTree());


            // AST REWRITE
            // elements: ID, ID, portType, with_ex, param_block, correlation, msgEx
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:11: -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:125:14: ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONMESSAGE, "ONMESSAGE"), root_1);

                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:125:38: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:125:48: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:125:61: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:125:74: ( with_ex )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:127:1: onAlarm : {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) ;
    public final BPELscriptParser.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptParser.onAlarm_return retval = new BPELscriptParser.onAlarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.alarm_return alarm77 = null;

        BPELscriptParser.timeout_return timeout78 = null;

        BPELscriptParser.repeatEvery_return repeatEvery79 = null;

        BPELscriptParser.scope_short_return scope_short80 = null;


        RewriteRuleSubtreeStream stream_alarm=new RewriteRuleSubtreeStream(adaptor,"rule alarm");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_repeatEvery=new RewriteRuleSubtreeStream(adaptor,"rule repeatEvery");
        RewriteRuleSubtreeStream stream_timeout=new RewriteRuleSubtreeStream(adaptor,"rule timeout");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:2: ({...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:3: {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short
            {
            if ( !(input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"alarm\") || input.LT(1).getText().equals(\"timeout\") || input.LT(1).getText().equals(\"repeatEvery\")");
            }
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:3: ( alarm | timeout )?
            int alt29=3;
            switch ( input.LA(1) ) {
                case 182:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==STRING) ) {
                        switch ( input.LA(3) ) {
                            case SJF:
                                {
                                int LA29_2 = input.LA(4);

                                if ( (LA29_2==119) ) {
                                    alt29=2;
                                }
                                else if ( (LA29_2==118) ) {
                                    alt29=1;
                                }
                                }
                                break;
                            case 119:
                                {
                                alt29=2;
                                }
                                break;
                            case 118:
                                {
                                alt29=1;
                                }
                                break;
                        }

                    }
                    }
                    break;
                case SJF:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==119) ) {
                        alt29=2;
                    }
                    else if ( (LA29_2==118) ) {
                        alt29=1;
                    }
                    }
                    break;
                case 118:
                    {
                    alt29=1;
                    }
                    break;
                case 119:
                    {
                    alt29=2;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:4: alarm
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm921);
                    alarm77=alarm();

                    state._fsp--;

                    stream_alarm.add(alarm77.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:12: timeout
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm925);
                    timeout78=timeout();

                    state._fsp--;

                    stream_timeout.add(timeout78.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:22: ( repeatEvery )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==120) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:22: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm929);
                    repeatEvery79=repeatEvery();

                    state._fsp--;

                    stream_repeatEvery.add(repeatEvery79.getTree());

                    }
                    break;

            }

            if ( !(input.LT(1).getText().equals("{")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"{\")");
            }
            pushFollow(FOLLOW_scope_short_in_onAlarm934);
            scope_short80=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short80.getTree());


            // AST REWRITE
            // elements: repeatEvery, timeout, scope_short, alarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 132:2: -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:5: ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONALARM, "ONALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:15: ( alarm )?
                if ( stream_alarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_alarm.nextTree());

                }
                stream_alarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:22: ( timeout )?
                if ( stream_timeout.hasNext() ) {
                    adaptor.addChild(root_1, stream_timeout.nextTree());

                }
                stream_timeout.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:31: ( repeatEvery )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:1: alarm : std_attr 'alarm' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) ;
    public final BPELscriptParser.alarm_return alarm() throws RecognitionException {
        BPELscriptParser.alarm_return retval = new BPELscriptParser.alarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token OPAQUE_EXPR85=null;
        Token char_literal86=null;
        BPELscriptParser.std_attr_return std_attr81 = null;

        BPELscriptParser.expr_return expr84 = null;


        CommonTree string_literal82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree OPAQUE_EXPR85_tree=null;
        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:8: ( std_attr 'alarm' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:10: std_attr 'alarm' '(' ( expr | OPAQUE_EXPR )? ')'
            {
            pushFollow(FOLLOW_std_attr_in_alarm969);
            std_attr81=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr81.getTree());
            string_literal82=(Token)match(input,118,FOLLOW_118_in_alarm974);  
            stream_118.add(string_literal82);

            char_literal83=(Token)match(input,116,FOLLOW_116_in_alarm976);  
            stream_116.add(char_literal83);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:16: ( expr | OPAQUE_EXPR )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXT_EXPR||LA31_0==STRING||LA31_0==ID||LA31_0==INT||LA31_0==116) ) {
                alt31=1;
            }
            else if ( (LA31_0==OPAQUE_EXPR) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_alarm979);
                    expr84=expr();

                    state._fsp--;

                    stream_expr.add(expr84.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:24: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR85=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_alarm983);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR85);


                    }
                    break;

            }

            char_literal86=(Token)match(input,117,FOLLOW_117_in_alarm987);  
            stream_117.add(char_literal86);



            // AST REWRITE
            // elements: std_attr, OPAQUE_EXPR, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:3: -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:7: ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALARM, "ALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:35: ( std_attr )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:1: timeout : std_attr 'timeout' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) ;
    public final BPELscriptParser.timeout_return timeout() throws RecognitionException {
        BPELscriptParser.timeout_return retval = new BPELscriptParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal89=null;
        Token OPAQUE_EXPR91=null;
        Token char_literal92=null;
        BPELscriptParser.std_attr_return std_attr87 = null;

        BPELscriptParser.expr_return expr90 = null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree OPAQUE_EXPR91_tree=null;
        CommonTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:9: ( std_attr 'timeout' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:11: std_attr 'timeout' '(' ( expr | OPAQUE_EXPR )? ')'
            {
            pushFollow(FOLLOW_std_attr_in_timeout1016);
            std_attr87=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr87.getTree());
            string_literal88=(Token)match(input,119,FOLLOW_119_in_timeout1021);  
            stream_119.add(string_literal88);

            char_literal89=(Token)match(input,116,FOLLOW_116_in_timeout1023);  
            stream_116.add(char_literal89);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:139:18: ( expr | OPAQUE_EXPR )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EXT_EXPR||LA32_0==STRING||LA32_0==ID||LA32_0==INT||LA32_0==116) ) {
                alt32=1;
            }
            else if ( (LA32_0==OPAQUE_EXPR) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:139:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_timeout1026);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:139:26: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR91=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_timeout1030);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR91);


                    }
                    break;

            }

            char_literal92=(Token)match(input,117,FOLLOW_117_in_timeout1034);  
            stream_117.add(char_literal92);



            // AST REWRITE
            // elements: expr, std_attr, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:3: -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:6: ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMEOUT, "TIMEOUT"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:35: ( std_attr )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:1: repeatEvery : 'repeatEvery' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptParser.repeatEvery_return retval = new BPELscriptParser.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal93=null;
        Token char_literal94=null;
        Token OPAQUE_EXPR96=null;
        Token char_literal97=null;
        BPELscriptParser.expr_return expr95 = null;


        CommonTree string_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree OPAQUE_EXPR96_tree=null;
        CommonTree char_literal97_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:2: ( 'repeatEvery' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:4: 'repeatEvery' '(' ( expr | OPAQUE_EXPR )? ')'
            {
            string_literal93=(Token)match(input,120,FOLLOW_120_in_repeatEvery1062);  
            stream_120.add(string_literal93);

            char_literal94=(Token)match(input,116,FOLLOW_116_in_repeatEvery1064);  
            stream_116.add(char_literal94);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:22: ( expr | OPAQUE_EXPR )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EXT_EXPR||LA33_0==STRING||LA33_0==ID||LA33_0==INT||LA33_0==116) ) {
                alt33=1;
            }
            else if ( (LA33_0==OPAQUE_EXPR) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_repeatEvery1067);
                    expr95=expr();

                    state._fsp--;

                    stream_expr.add(expr95.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:30: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR96=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_repeatEvery1071);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR96);


                    }
                    break;

            }

            char_literal97=(Token)match(input,117,FOLLOW_117_in_repeatEvery1075);  
            stream_117.add(char_literal97);



            // AST REWRITE
            // elements: expr, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:2: -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:144:5: ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATEVERY, "REPEATEVERY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:144:19: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:144:25: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:146:1: flow : std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) ;
    public final BPELscriptParser.flow_return flow() throws RecognitionException {
        BPELscriptParser.flow_return retval = new BPELscriptParser.flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal99=null;
        Token string_literal100=null;
        List list_s=null;
        BPELscriptParser.std_attr_return std_attr98 = null;

        RuleReturnScope s = null;
        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:146:7: ( std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:146:9: std_attr 'parallel' s+= sequence ( 'and' s+= sequence )*
            {
            pushFollow(FOLLOW_std_attr_in_flow1098);
            std_attr98=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr98.getTree());
            string_literal99=(Token)match(input,121,FOLLOW_121_in_flow1102);  
            stream_121.add(string_literal99);

            pushFollow(FOLLOW_sequence_in_flow1106);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            if (list_s==null) list_s=new ArrayList();
            list_s.add(s);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:147:26: ( 'and' s+= sequence )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==122) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:147:28: 'and' s+= sequence
            	    {
            	    string_literal100=(Token)match(input,122,FOLLOW_122_in_flow1110);  
            	    stream_122.add(string_literal100);

            	    pushFollow(FOLLOW_sequence_in_flow1114);
            	    s=sequence();

            	    state._fsp--;

            	    stream_sequence.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);



            // AST REWRITE
            // elements: s, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: s
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            root_0 = (CommonTree)adaptor.nil();
            // 148:2: -> ^( FLOW ( $s)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:148:6: ^( FLOW ( $s)+ std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:1: signal : 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.signal_return signal() throws RecognitionException {
        BPELscriptParser.signal_return retval = new BPELscriptParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token char_literal102=null;
        Token ID103=null;
        Token char_literal104=null;
        Token OPAQUE_EXPR106=null;
        Token char_literal107=null;
        BPELscriptParser.expr_return expr105 = null;


        CommonTree string_literal101_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree ID103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree OPAQUE_EXPR106_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:9: ( 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:11: 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal101=(Token)match(input,123,FOLLOW_123_in_signal1141);  
            stream_123.add(string_literal101);

            char_literal102=(Token)match(input,116,FOLLOW_116_in_signal1143);  
            stream_116.add(char_literal102);

            ID103=(Token)match(input,ID,FOLLOW_ID_in_signal1144);  
            stream_ID.add(ID103);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:26: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==113) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:27: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal104=(Token)match(input,113,FOLLOW_113_in_signal1147);  
                    stream_113.add(char_literal104);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:31: ( expr | OPAQUE_EXPR )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==EXT_EXPR||LA35_0==STRING||LA35_0==ID||LA35_0==INT||LA35_0==116) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==OPAQUE_EXPR) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:32: expr
                            {
                            pushFollow(FOLLOW_expr_in_signal1150);
                            expr105=expr();

                            state._fsp--;

                            stream_expr.add(expr105.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:39: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR106=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_signal1154);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR106);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal107=(Token)match(input,117,FOLLOW_117_in_signal1159);  
            stream_117.add(char_literal107);



            // AST REWRITE
            // elements: ID, expr, OPAQUE_EXPR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:58: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:61: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:73: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:79: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:1: asignal : '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.asignal_return asignal() throws RecognitionException {
        BPELscriptParser.asignal_return retval = new BPELscriptParser.asignal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal108=null;
        Token char_literal109=null;
        Token ID110=null;
        Token char_literal111=null;
        Token OPAQUE_EXPR113=null;
        Token char_literal114=null;
        BPELscriptParser.expr_return expr112 = null;


        CommonTree string_literal108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree ID110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree OPAQUE_EXPR113_tree=null;
        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:9: ( '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:11: '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal108=(Token)match(input,124,FOLLOW_124_in_asignal1181);  
            stream_124.add(string_literal108);

            char_literal109=(Token)match(input,116,FOLLOW_116_in_asignal1183);  
            stream_116.add(char_literal109);

            ID110=(Token)match(input,ID,FOLLOW_ID_in_asignal1184);  
            stream_ID.add(ID110);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:27: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==113) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:28: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal111=(Token)match(input,113,FOLLOW_113_in_asignal1187);  
                    stream_113.add(char_literal111);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:32: ( expr | OPAQUE_EXPR )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==EXT_EXPR||LA37_0==STRING||LA37_0==ID||LA37_0==INT||LA37_0==116) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==OPAQUE_EXPR) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:33: expr
                            {
                            pushFollow(FOLLOW_expr_in_asignal1190);
                            expr112=expr();

                            state._fsp--;

                            stream_expr.add(expr112.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:40: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR113=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_asignal1194);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR113);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal114=(Token)match(input,117,FOLLOW_117_in_asignal1199);  
            stream_117.add(char_literal114);



            // AST REWRITE
            // elements: expr, OPAQUE_EXPR, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:59: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:62: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:74: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:80: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:1: ajoin : '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.ajoin_return ajoin() throws RecognitionException {
        BPELscriptParser.ajoin_return retval = new BPELscriptParser.ajoin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token OPAQUE_EXPR120=null;
        Token char_literal121=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr119 = null;


        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree OPAQUE_EXPR120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:8: ( '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:10: '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal115=(Token)match(input,125,FOLLOW_125_in_ajoin1222);  
            stream_125.add(string_literal115);

            char_literal116=(Token)match(input,116,FOLLOW_116_in_ajoin1224);  
            stream_116.add(char_literal116);

            k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1228);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:28: ( ',' k+= ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==113) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==ID) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:29: ',' k+= ID
            	    {
            	    char_literal117=(Token)match(input,113,FOLLOW_113_in_ajoin1231);  
            	    stream_113.add(char_literal117);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1235);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:41: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==113) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:42: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal118=(Token)match(input,113,FOLLOW_113_in_ajoin1240);  
                    stream_113.add(char_literal118);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:46: ( expr | OPAQUE_EXPR )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==EXT_EXPR||LA40_0==STRING||LA40_0==ID||LA40_0==INT||LA40_0==116) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==OPAQUE_EXPR) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:47: expr
                            {
                            pushFollow(FOLLOW_expr_in_ajoin1243);
                            expr119=expr();

                            state._fsp--;

                            stream_expr.add(expr119.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:54: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR120=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_ajoin1247);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR120);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal121=(Token)match(input,117,FOLLOW_117_in_ajoin1252);  
            stream_117.add(char_literal121);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr, k
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 154:73: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:76: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
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
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:87: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:93: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:1: join : 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.join_return join() throws RecognitionException {
        BPELscriptParser.join_return retval = new BPELscriptParser.join_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token OPAQUE_EXPR127=null;
        Token char_literal128=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr126 = null;


        CommonTree string_literal122_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree OPAQUE_EXPR127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:7: ( 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:9: 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal122=(Token)match(input,126,FOLLOW_126_in_join1277);  
            stream_126.add(string_literal122);

            char_literal123=(Token)match(input,116,FOLLOW_116_in_join1279);  
            stream_116.add(char_literal123);

            k=(Token)match(input,ID,FOLLOW_ID_in_join1283);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:26: ( ',' k+= ID )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==113) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==ID) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:27: ',' k+= ID
            	    {
            	    char_literal124=(Token)match(input,113,FOLLOW_113_in_join1286);  
            	    stream_113.add(char_literal124);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_join1290);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:39: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==113) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:40: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal125=(Token)match(input,113,FOLLOW_113_in_join1295);  
                    stream_113.add(char_literal125);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:44: ( expr | OPAQUE_EXPR )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==EXT_EXPR||LA43_0==STRING||LA43_0==ID||LA43_0==INT||LA43_0==116) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==OPAQUE_EXPR) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:45: expr
                            {
                            pushFollow(FOLLOW_expr_in_join1298);
                            expr126=expr();

                            state._fsp--;

                            stream_expr.add(expr126.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:52: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR127=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_join1302);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR127);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal128=(Token)match(input,117,FOLLOW_117_in_join1307);  
            stream_117.add(char_literal128);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr, k
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:71: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:74: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
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
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:85: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:91: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:158:1: if_ex : std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr ) ;
    public final BPELscriptParser.if_ex_return if_ex() throws RecognitionException {
        BPELscriptParser.if_ex_return retval = new BPELscriptParser.if_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token iop=null;
        Token eiop=null;
        Token string_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token string_literal133=null;
        Token char_literal134=null;
        Token char_literal135=null;
        Token string_literal136=null;
        List list_sei=null;
        BPELscriptParser.expr_return iex = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.expr_return eiex = null;

        BPELscriptParser.sequence_return se = null;

        BPELscriptParser.std_attr_return std_attr129 = null;

        RuleReturnScope sei = null;
        CommonTree iop_tree=null;
        CommonTree eiop_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:2: ( std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:4: std_attr 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )* ( 'else' se= sequence )?
            {
            pushFollow(FOLLOW_std_attr_in_if_ex1332);
            std_attr129=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr129.getTree());
            string_literal130=(Token)match(input,127,FOLLOW_127_in_if_ex1336);  
            stream_127.add(string_literal130);

            char_literal131=(Token)match(input,116,FOLLOW_116_in_if_ex1338);  
            stream_116.add(char_literal131);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:12: (iex= expr | iop= OPAQUE_EXPR )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==EXT_EXPR||LA45_0==STRING||LA45_0==ID||LA45_0==INT||LA45_0==116) ) {
                alt45=1;
            }
            else if ( (LA45_0==OPAQUE_EXPR) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:13: iex= expr
                    {
                    pushFollow(FOLLOW_expr_in_if_ex1343);
                    iex=expr();

                    state._fsp--;

                    stream_expr.add(iex.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:22: iop= OPAQUE_EXPR
                    {
                    iop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1347);  
                    stream_OPAQUE_EXPR.add(iop);


                    }
                    break;

            }

            char_literal132=(Token)match(input,117,FOLLOW_117_in_if_ex1350);  
            stream_117.add(char_literal132);

            pushFollow(FOLLOW_sequence_in_if_ex1354);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:3: ( 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==128) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:4: 'elseif' '(' (eiex= expr | eiop= OPAQUE_EXPR ) ')' sei+= sequence
            	    {
            	    string_literal133=(Token)match(input,128,FOLLOW_128_in_if_ex1360);  
            	    stream_128.add(string_literal133);

            	    char_literal134=(Token)match(input,116,FOLLOW_116_in_if_ex1362);  
            	    stream_116.add(char_literal134);

            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:17: (eiex= expr | eiop= OPAQUE_EXPR )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==EXT_EXPR||LA46_0==STRING||LA46_0==ID||LA46_0==INT||LA46_0==116) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==OPAQUE_EXPR) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:18: eiex= expr
            	            {
            	            pushFollow(FOLLOW_expr_in_if_ex1367);
            	            eiex=expr();

            	            state._fsp--;

            	            stream_expr.add(eiex.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:28: eiop= OPAQUE_EXPR
            	            {
            	            eiop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1371);  
            	            stream_OPAQUE_EXPR.add(eiop);


            	            }
            	            break;

            	    }

            	    char_literal135=(Token)match(input,117,FOLLOW_117_in_if_ex1374);  
            	    stream_117.add(char_literal135);

            	    pushFollow(FOLLOW_sequence_in_if_ex1378);
            	    sei=sequence();

            	    state._fsp--;

            	    stream_sequence.add(sei.getTree());
            	    if (list_sei==null) list_sei=new ArrayList();
            	    list_sei.add(sei);


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:162:3: ( 'else' se= sequence )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==129) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:162:4: 'else' se= sequence
                    {
                    string_literal136=(Token)match(input,129,FOLLOW_129_in_if_ex1386);  
                    stream_129.add(string_literal136);

                    pushFollow(FOLLOW_sequence_in_if_ex1390);
                    se=sequence();

                    state._fsp--;

                    stream_sequence.add(se.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: sei, iop, eiop, iex, se, eiex, std_attr, s
            // token labels: iop, eiop
            // rule labels: retval, eiex, s, iex, se
            // token list labels: 
            // rule list labels: sei
            retval.tree = root_0;
            RewriteRuleTokenStream stream_iop=new RewriteRuleTokenStream(adaptor,"token iop",iop);
            RewriteRuleTokenStream stream_eiop=new RewriteRuleTokenStream(adaptor,"token eiop",eiop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_eiex=new RewriteRuleSubtreeStream(adaptor,"token eiex",eiex!=null?eiex.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_iex=new RewriteRuleSubtreeStream(adaptor,"token iex",iex!=null?iex.tree:null);
            RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"token se",se!=null?se.tree:null);
            RewriteRuleSubtreeStream stream_sei=new RewriteRuleSubtreeStream(adaptor,"token sei",list_sei);
            root_0 = (CommonTree)adaptor.nil();
            // 163:2: -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:6: ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )* ( ^( ELSE $se) )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:11: ( $iex)?
                if ( stream_iex.hasNext() ) {
                    adaptor.addChild(root_1, stream_iex.nextTree());

                }
                stream_iex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:17: ( $iop)?
                if ( stream_iop.hasNext() ) {
                    adaptor.addChild(root_1, stream_iop.nextNode());

                }
                stream_iop.reset();
                adaptor.addChild(root_1, stream_s.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:26: ( ^( ELSIF ( $eiex)? ( $eiop)? $sei) )*
                while ( stream_sei.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:27: ^( ELSIF ( $eiex)? ( $eiop)? $sei)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSIF, "ELSIF"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:35: ( $eiex)?
                    if ( stream_eiex.hasNext() ) {
                        adaptor.addChild(root_2, stream_eiex.nextTree());

                    }
                    stream_eiex.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:42: ( $eiop)?
                    if ( stream_eiop.hasNext() ) {
                        adaptor.addChild(root_2, stream_eiop.nextNode());

                    }
                    stream_eiop.reset();
                    adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_sei.nextTree()).getTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_sei.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:57: ( ^( ELSE $se) )?
                if ( stream_se.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:58: ^( ELSE $se)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:1: sequence : std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) ;
    public final BPELscriptParser.sequence_return sequence() throws RecognitionException {
        BPELscriptParser.sequence_return retval = new BPELscriptParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.body_return b = null;

        BPELscriptParser.std_attr_return std_attr137 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:166:2: ( std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:166:4: std_attr (j+= ajoin )? (s+= asignal )* b= body
            {
            pushFollow(FOLLOW_std_attr_in_sequence1452);
            std_attr137=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr137.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:4: (j+= ajoin )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==125) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_sequence1458);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:14: (s+= asignal )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==124) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_sequence1463);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            pushFollow(FOLLOW_body_in_sequence1471);
            b=body();

            state._fsp--;

            stream_body.add(b.getTree());


            // AST REWRITE
            // elements: s, j, std_attr, b
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
            // 169:2: -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:5: ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:23: ( $s)*
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
    // $ANTLR end "sequence"

    public static class scope_sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_sequence"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:1: scope_sequence : (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) ;
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:2: ( (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:4: (j+= ajoin )? (s+= asignal )* b= scope_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:5: (j+= ajoin )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==125) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:5: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_scope_sequence1502);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:15: (s+= asignal )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==124) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:15: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_scope_sequence1507);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            pushFollow(FOLLOW_scope_block_in_scope_sequence1515);
            b=scope_block();

            state._fsp--;

            stream_scope_block.add(b.getTree());


            // AST REWRITE
            // elements: j, b, s
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
            // 174:2: -> ^( SEQUENCE ( $j)? $b ( $s)* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:5: ^( SEQUENCE ( $j)? $b ( $s)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:23: ( $s)*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:1: while_ex : std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) ;
    public final BPELscriptParser.while_ex_return while_ex() throws RecognitionException {
        BPELscriptParser.while_ex_return retval = new BPELscriptParser.while_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal139=null;
        Token char_literal140=null;
        Token OPAQUE_EXPR142=null;
        Token char_literal143=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr138 = null;

        BPELscriptParser.expr_return expr141 = null;


        CommonTree string_literal139_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree OPAQUE_EXPR142_tree=null;
        CommonTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:10: ( std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:12: std_attr 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence
            {
            pushFollow(FOLLOW_std_attr_in_while_ex1541);
            std_attr138=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr138.getTree());
            string_literal139=(Token)match(input,130,FOLLOW_130_in_while_ex1546);  
            stream_130.add(string_literal139);

            char_literal140=(Token)match(input,116,FOLLOW_116_in_while_ex1548);  
            stream_116.add(char_literal140);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:16: ( expr | OPAQUE_EXPR )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EXT_EXPR||LA53_0==STRING||LA53_0==ID||LA53_0==INT||LA53_0==116) ) {
                alt53=1;
            }
            else if ( (LA53_0==OPAQUE_EXPR) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_while_ex1551);
                    expr141=expr();

                    state._fsp--;

                    stream_expr.add(expr141.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:22: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR142=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_while_ex1553);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR142);


                    }
                    break;

            }

            char_literal143=(Token)match(input,117,FOLLOW_117_in_while_ex1556);  
            stream_117.add(char_literal143);

            pushFollow(FOLLOW_sequence_in_while_ex1560);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());


            // AST REWRITE
            // elements: OPAQUE_EXPR, sequence, std_attr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:50: -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:53: ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:61: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:67: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:179:1: until_ex : std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) ;
    public final BPELscriptParser.until_ex_return until_ex() throws RecognitionException {
        BPELscriptParser.until_ex_return retval = new BPELscriptParser.until_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal145=null;
        Token string_literal146=null;
        Token char_literal147=null;
        Token OPAQUE_EXPR149=null;
        Token char_literal150=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr144 = null;

        BPELscriptParser.expr_return expr148 = null;


        CommonTree string_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree char_literal147_tree=null;
        CommonTree OPAQUE_EXPR149_tree=null;
        CommonTree char_literal150_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:179:10: ( std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR )? ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:179:12: std_attr 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR )? ')'
            {
            pushFollow(FOLLOW_std_attr_in_until_ex1584);
            std_attr144=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr144.getTree());
            string_literal145=(Token)match(input,131,FOLLOW_131_in_until_ex1589);  
            stream_131.add(string_literal145);

            pushFollow(FOLLOW_sequence_in_until_ex1593);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            string_literal146=(Token)match(input,132,FOLLOW_132_in_until_ex1595);  
            stream_132.add(string_literal146);

            char_literal147=(Token)match(input,116,FOLLOW_116_in_until_ex1597);  
            stream_116.add(char_literal147);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:36: ( expr | OPAQUE_EXPR )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EXT_EXPR||LA54_0==STRING||LA54_0==ID||LA54_0==INT||LA54_0==116) ) {
                alt54=1;
            }
            else if ( (LA54_0==OPAQUE_EXPR) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:37: expr
                    {
                    pushFollow(FOLLOW_expr_in_until_ex1600);
                    expr148=expr();

                    state._fsp--;

                    stream_expr.add(expr148.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:42: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR149=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_until_ex1602);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR149);


                    }
                    break;

            }

            char_literal150=(Token)match(input,117,FOLLOW_117_in_until_ex1606);  
            stream_117.add(char_literal150);



            // AST REWRITE
            // elements: sequence, expr, OPAQUE_EXPR, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:60: -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:63: ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNTIL, "UNTIL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:71: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:77: ( OPAQUE_EXPR )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:1: foreach : ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? std_attr ) ;
    public final BPELscriptParser.foreach_return foreach() throws RecognitionException {
        BPELscriptParser.foreach_return retval = new BPELscriptParser.foreach_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token successfulBranchesOnly=null;
        Token cName=null;
        Token initop=null;
        Token condop=null;
        Token PARALLEL151=null;
        Token string_literal153=null;
        Token char_literal154=null;
        Token char_literal155=null;
        Token string_literal156=null;
        Token SEMI157=null;
        Token string_literal158=null;
        Token SEMI159=null;
        Token char_literal160=null;
        Token compop=null;
        List list_compop=null;
        List list_complete=null;
        BPELscriptParser.expr_return init = null;

        BPELscriptParser.expr_return cond = null;

        BPELscriptParser.std_attr_return std_attr152 = null;

        BPELscriptParser.scope_short_return scope_short161 = null;

        RuleReturnScope complete = null;
        CommonTree successfulBranchesOnly_tree=null;
        CommonTree cName_tree=null;
        CommonTree initop_tree=null;
        CommonTree condop_tree=null;
        CommonTree PARALLEL151_tree=null;
        CommonTree string_literal153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree SEMI157_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree SEMI159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree compop_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_PARALLEL=new RewriteRuleTokenStream(adaptor,"token PARALLEL");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:2: ( ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:4: ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:4: ( PARALLEL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==PARALLEL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:4: PARALLEL
                    {
                    PARALLEL151=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1631);  
                    stream_PARALLEL.add(PARALLEL151);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:25: (successfulBranchesOnly= SBO )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==SBO) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:25: successfulBranchesOnly= SBO
                    {
                    successfulBranchesOnly=(Token)match(input,SBO,FOLLOW_SBO_in_foreach1638);  
                    stream_SBO.add(successfulBranchesOnly);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_foreach1644);
            std_attr152=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr152.getTree());
            string_literal153=(Token)match(input,133,FOLLOW_133_in_foreach1648);  
            stream_133.add(string_literal153);

            char_literal154=(Token)match(input,116,FOLLOW_116_in_foreach1650);  
            stream_116.add(char_literal154);

            cName=(Token)match(input,ID,FOLLOW_ID_in_foreach1654);  
            stream_ID.add(cName);

            char_literal155=(Token)match(input,134,FOLLOW_134_in_foreach1656);  
            stream_134.add(char_literal155);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:26: (init= expr | initop= OPAQUE_EXPR )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EXT_EXPR||LA57_0==STRING||LA57_0==ID||LA57_0==INT||LA57_0==116) ) {
                alt57=1;
            }
            else if ( (LA57_0==OPAQUE_EXPR) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:27: init= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach1661);
                    init=expr();

                    state._fsp--;

                    stream_expr.add(init.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:37: initop= OPAQUE_EXPR
                    {
                    initop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1665);  
                    stream_OPAQUE_EXPR.add(initop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:57: ( 'to' | SEMI )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==135) ) {
                alt58=1;
            }
            else if ( (LA58_0==SEMI) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:58: 'to'
                    {
                    string_literal156=(Token)match(input,135,FOLLOW_135_in_foreach1669);  
                    stream_135.add(string_literal156);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:63: SEMI
                    {
                    SEMI157=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1671);  
                    stream_SEMI.add(SEMI157);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:69: (cond= expr | condop= OPAQUE_EXPR )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXT_EXPR||LA59_0==STRING||LA59_0==ID||LA59_0==INT||LA59_0==116) ) {
                alt59=1;
            }
            else if ( (LA59_0==OPAQUE_EXPR) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:70: cond= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach1677);
                    cond=expr();

                    state._fsp--;

                    stream_expr.add(cond.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:82: condop= OPAQUE_EXPR
                    {
                    condop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1683);  
                    stream_OPAQUE_EXPR.add(condop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:102: ( ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==SEMI||LA62_0==136) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:103: ( 'finish' | SEMI ) (complete+= expr | compop+= OPAQUE_EXPR )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:103: ( 'finish' | SEMI )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==136) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==SEMI) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:104: 'finish'
                            {
                            string_literal158=(Token)match(input,136,FOLLOW_136_in_foreach1688);  
                            stream_136.add(string_literal158);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:113: SEMI
                            {
                            SEMI159=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1690);  
                            stream_SEMI.add(SEMI159);


                            }
                            break;

                    }

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:119: (complete+= expr | compop+= OPAQUE_EXPR )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==EXT_EXPR||LA61_0==STRING||LA61_0==ID||LA61_0==INT||LA61_0==116) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==OPAQUE_EXPR) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:120: complete+= expr
                            {
                            pushFollow(FOLLOW_expr_in_foreach1696);
                            complete=expr();

                            state._fsp--;

                            stream_expr.add(complete.getTree());
                            if (list_complete==null) list_complete=new ArrayList();
                            list_complete.add(complete);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:186:135: compop+= OPAQUE_EXPR
                            {
                            compop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach1700);  
                            stream_OPAQUE_EXPR.add(compop);

                            if (list_compop==null) list_compop=new ArrayList();
                            list_compop.add(compop);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal160=(Token)match(input,117,FOLLOW_117_in_foreach1705);  
            stream_117.add(char_literal160);

            pushFollow(FOLLOW_scope_short_in_foreach1707);
            scope_short161=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short161.getTree());


            // AST REWRITE
            // elements: std_attr, SBO, scope_short, initop, condop, cond, PARALLEL, complete, cName, init, compop
            // token labels: condop, cName, initop
            // rule labels: retval, init, cond
            // token list labels: compop
            // rule list labels: complete
            retval.tree = root_0;
            RewriteRuleTokenStream stream_condop=new RewriteRuleTokenStream(adaptor,"token condop",condop);
            RewriteRuleTokenStream stream_cName=new RewriteRuleTokenStream(adaptor,"token cName",cName);
            RewriteRuleTokenStream stream_initop=new RewriteRuleTokenStream(adaptor,"token initop",initop);
            RewriteRuleTokenStream stream_compop=new RewriteRuleTokenStream(adaptor,"token compop", list_compop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"token init",init!=null?init.tree:null);
            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"token cond",cond!=null?cond.tree:null);
            RewriteRuleSubtreeStream stream_complete=new RewriteRuleSubtreeStream(adaptor,"token complete",list_complete);
            root_0 = (CommonTree)adaptor.nil();
            // 187:2: -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:6: ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ) )? scope_short ( PARALLEL )? ( SBO )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_cName.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:19: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextTree());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:26: ( $initop)?
                if ( stream_initop.hasNext() ) {
                    adaptor.addChild(root_1, stream_initop.nextNode());

                }
                stream_initop.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:35: ( ^( FINAL ( $cond)? ( $condop)? ) )?
                if ( stream_condop.hasNext()||stream_cond.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:36: ^( FINAL ( $cond)? ( $condop)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FINAL, "FINAL"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:44: ( $cond)?
                    if ( stream_cond.hasNext() ) {
                        adaptor.addChild(root_2, stream_cond.nextTree());

                    }
                    stream_cond.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:51: ( $condop)?
                    if ( stream_condop.hasNext() ) {
                        adaptor.addChild(root_2, stream_condop.nextNode());

                    }
                    stream_condop.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_condop.reset();
                stream_cond.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:63: ( ^( BRANCH ( $complete)? ( $compop)? ) )?
                if ( stream_complete.hasNext()||stream_compop.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:64: ^( BRANCH ( $complete)? ( $compop)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:73: ( $complete)?
                    if ( stream_complete.hasNext() ) {
                        adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_complete.nextTree()).getTree());

                    }
                    stream_complete.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:84: ( $compop)?
                    if ( stream_compop.hasNext() ) {
                        adaptor.addChild(root_2, stream_compop.nextNode());

                    }
                    stream_compop.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_complete.reset();
                stream_compop.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:16: ( PARALLEL )?
                if ( stream_PARALLEL.hasNext() ) {
                    adaptor.addChild(root_1, stream_PARALLEL.nextNode());

                }
                stream_PARALLEL.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:188:26: ( SBO )?
                if ( stream_SBO.hasNext() ) {
                    adaptor.addChild(root_1, stream_SBO.nextNode());

                }
                stream_SBO.reset();
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
    // $ANTLR end "foreach"

    public static class try_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:1: try_ex : 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) ;
    public final BPELscriptParser.try_ex_return try_ex() throws RecognitionException {
        BPELscriptParser.try_ex_return retval = new BPELscriptParser.try_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal162=null;
        BPELscriptParser.body_return body163 = null;

        BPELscriptParser.catch_ex_return catch_ex164 = null;

        BPELscriptParser.catchAll_return catchAll165 = null;


        CommonTree string_literal162_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_catchAll=new RewriteRuleSubtreeStream(adaptor,"rule catchAll");
        RewriteRuleSubtreeStream stream_catch_ex=new RewriteRuleSubtreeStream(adaptor,"rule catch_ex");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:9: ( 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:11: 'try' body ( catch_ex )* ( catchAll )?
            {
            string_literal162=(Token)match(input,137,FOLLOW_137_in_try_ex1778);  
            stream_137.add(string_literal162);

            pushFollow(FOLLOW_body_in_try_ex1780);
            body163=body();

            state._fsp--;

            stream_body.add(body163.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:22: ( catch_ex )*
            loop63:
            do {
                int alt63=2;
                switch ( input.LA(1) ) {
                case 138:
                    {
                    alt63=1;
                    }
                    break;
                case 191:
                    {
                    alt63=1;
                    }
                    break;
                case 139:
                    {
                    alt63=1;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:22: catch_ex
            	    {
            	    pushFollow(FOLLOW_catch_ex_in_try_ex1782);
            	    catch_ex164=catch_ex();

            	    state._fsp--;

            	    stream_catch_ex.add(catch_ex164.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:32: ( catchAll )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==140) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:32: catchAll
                    {
                    pushFollow(FOLLOW_catchAll_in_try_ex1785);
                    catchAll165=catchAll();

                    state._fsp--;

                    stream_catchAll.add(catchAll165.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: body, catch_ex
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 190:41: -> ^( TRY ( catch_ex )* ( body )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:44: ^( TRY ( catch_ex )* ( body )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:50: ( catch_ex )*
                while ( stream_catch_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_ex.nextTree());

                }
                stream_catch_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:60: ( body )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:1: catch_ex : ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) ;
    public final BPELscriptParser.catch_ex_return catch_ex() throws RecognitionException {
        BPELscriptParser.catch_ex_return retval = new BPELscriptParser.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fMT=null;
        Token string_literal166=null;
        Token string_literal168=null;
        Token char_literal169=null;
        Token char_literal171=null;
        BPELscriptParser.faultElt_return faultElt167 = null;

        BPELscriptParser.ns_id_return ns_id170 = null;

        BPELscriptParser.param_block_return param_block172 = null;


        CommonTree fMT_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_faultElt=new RewriteRuleSubtreeStream(adaptor,"rule faultElt");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:2: ( ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==138) ) {
                alt65=1;
            }
            else if ( (LA65_0==191) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:5: ( '@faultMessageType' fMT= STRING )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:5: ( '@faultMessageType' fMT= STRING )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:6: '@faultMessageType' fMT= STRING
                    {
                    string_literal166=(Token)match(input,138,FOLLOW_138_in_catch_ex1810);  
                    stream_138.add(string_literal166);

                    fMT=(Token)match(input,STRING,FOLLOW_STRING_in_catch_ex1814);  
                    stream_STRING.add(fMT);


                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:193:41: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex1820);
                    faultElt167=faultElt();

                    state._fsp--;

                    stream_faultElt.add(faultElt167.getTree());

                    }
                    break;

            }

            string_literal168=(Token)match(input,139,FOLLOW_139_in_catch_ex1826);  
            stream_139.add(string_literal168);

            char_literal169=(Token)match(input,116,FOLLOW_116_in_catch_ex1828);  
            stream_116.add(char_literal169);

            pushFollow(FOLLOW_ns_id_in_catch_ex1830);
            ns_id170=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id170.getTree());
            char_literal171=(Token)match(input,117,FOLLOW_117_in_catch_ex1833);  
            stream_117.add(char_literal171);

            pushFollow(FOLLOW_param_block_in_catch_ex1835);
            param_block172=param_block();

            state._fsp--;

            stream_param_block.add(param_block172.getTree());


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
            // 195:2: -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:6: ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:32: ( $fMT)?
                if ( stream_fMT.hasNext() ) {
                    adaptor.addChild(root_1, stream_fMT.nextNode());

                }
                stream_fMT.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:38: ( faultElt )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:197:1: catchAll : 'catchAll' block -> ^( CATCH block ) ;
    public final BPELscriptParser.catchAll_return catchAll() throws RecognitionException {
        BPELscriptParser.catchAll_return retval = new BPELscriptParser.catchAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal173=null;
        BPELscriptParser.block_return block174 = null;


        CommonTree string_literal173_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:2: ( 'catchAll' block -> ^( CATCH block ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:4: 'catchAll' block
            {
            string_literal173=(Token)match(input,140,FOLLOW_140_in_catchAll1865);  
            stream_140.add(string_literal173);

            pushFollow(FOLLOW_block_in_catchAll1867);
            block174=block();

            state._fsp--;

            stream_block.add(block174.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 199:2: -> ^( CATCH block )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:6: ^( CATCH block )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:1: scope_ex : ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) ;
    public final BPELscriptParser.scope_ex_return scope_ex() throws RecognitionException {
        BPELscriptParser.scope_ex_return retval = new BPELscriptParser.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ISOLATED175=null;
        Token EOSF176=null;
        Token SJF177=null;
        Token string_literal178=null;
        Token char_literal179=null;
        Token ID180=null;
        Token char_literal181=null;
        BPELscriptParser.scope_sequence_return scope_sequence182 = null;

        BPELscriptParser.scope_stmt_return scope_stmt183 = null;


        CommonTree ISOLATED175_tree=null;
        CommonTree EOSF176_tree=null;
        CommonTree SJF177_tree=null;
        CommonTree string_literal178_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree ID180_tree=null;
        CommonTree char_literal181_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ISOLATED=new RewriteRuleTokenStream(adaptor,"token ISOLATED");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:2: ( ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:4: ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:4: ( ISOLATED )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ISOLATED) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:4: ISOLATED
                    {
                    ISOLATED175=(Token)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex1886);  
                    stream_ISOLATED.add(ISOLATED175);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:14: ( EOSF )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EOSF) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:14: EOSF
                    {
                    EOSF176=(Token)match(input,EOSF,FOLLOW_EOSF_in_scope_ex1889);  
                    stream_EOSF.add(EOSF176);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:20: ( SJF )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==SJF) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:202:20: SJF
                    {
                    SJF177=(Token)match(input,SJF,FOLLOW_SJF_in_scope_ex1892);  
                    stream_SJF.add(SJF177);


                    }
                    break;

            }

            string_literal178=(Token)match(input,141,FOLLOW_141_in_scope_ex1897);  
            stream_141.add(string_literal178);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:203:11: ( '(' ( ID )? ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==116) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:203:12: '(' ( ID )? ')'
                    {
                    char_literal179=(Token)match(input,116,FOLLOW_116_in_scope_ex1900);  
                    stream_116.add(char_literal179);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:203:16: ( ID )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==ID) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:203:16: ID
                            {
                            ID180=(Token)match(input,ID,FOLLOW_ID_in_scope_ex1902);  
                            stream_ID.add(ID180);


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,117,FOLLOW_117_in_scope_ex1905);  
                    stream_117.add(char_literal181);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_sequence_in_scope_ex1909);
            scope_sequence182=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence182.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_ex1911);
            scope_stmt183=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt183.getTree());


            // AST REWRITE
            // elements: ISOLATED, scope_stmt, EOSF, SJF, ID, scope_sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 204:2: -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:6: ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:14: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:44: ( ISOLATED )?
                if ( stream_ISOLATED.hasNext() ) {
                    adaptor.addChild(root_1, stream_ISOLATED.nextNode());

                }
                stream_ISOLATED.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:54: ( EOSF )?
                if ( stream_EOSF.hasNext() ) {
                    adaptor.addChild(root_1, stream_EOSF.nextNode());

                }
                stream_EOSF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:60: ( SJF )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:206:1: scope_short : scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) ;
    public final BPELscriptParser.scope_short_return scope_short() throws RecognitionException {
        BPELscriptParser.scope_short_return retval = new BPELscriptParser.scope_short_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.scope_sequence_return scope_sequence184 = null;

        BPELscriptParser.scope_stmt_return scope_stmt185 = null;


        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:2: ( scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:4: scope_sequence scope_stmt
            {
            pushFollow(FOLLOW_scope_sequence_in_scope_short1947);
            scope_sequence184=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence184.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_short1949);
            scope_stmt185=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt185.getTree());


            // AST REWRITE
            // elements: scope_stmt, scope_sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 207:30: -> ^( SCOPE scope_stmt scope_sequence )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:33: ^( SCOPE scope_stmt scope_sequence )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:1: scope_stmt : ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) ;
    public final BPELscriptParser.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptParser.scope_stmt_return retval = new BPELscriptParser.scope_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.compensation_return compensation186 = null;

        BPELscriptParser.termination_return termination187 = null;

        BPELscriptParser.eventHdl_return eventHdl188 = null;


        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_termination=new RewriteRuleSubtreeStream(adaptor,"rule termination");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:2: ( ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:4: ( compensation )? ( termination )? ( eventHdl )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:4: ( compensation )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==145) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:4: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_scope_stmt1968);
                    compensation186=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation186.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:18: ( termination )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==142) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:18: termination
                    {
                    pushFollow(FOLLOW_termination_in_scope_stmt1971);
                    termination187=termination();

                    state._fsp--;

                    stream_termination.add(termination187.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:31: ( eventHdl )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==143) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:31: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_scope_stmt1974);
                    eventHdl188=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl188.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: compensation, eventHdl, termination
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 211:2: -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:5: ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:13: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:27: ( termination )?
                if ( stream_termination.hasNext() ) {
                    adaptor.addChild(root_1, stream_termination.nextTree());

                }
                stream_termination.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:40: ( eventHdl )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:1: termination : 'onTermination' body -> ^( TERMINATION body ) ;
    public final BPELscriptParser.termination_return termination() throws RecognitionException {
        BPELscriptParser.termination_return retval = new BPELscriptParser.termination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal189=null;
        BPELscriptParser.body_return body190 = null;


        CommonTree string_literal189_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:2: ( 'onTermination' body -> ^( TERMINATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:4: 'onTermination' body
            {
            string_literal189=(Token)match(input,142,FOLLOW_142_in_termination2001);  
            stream_142.add(string_literal189);

            pushFollow(FOLLOW_body_in_termination2003);
            body190=body();

            state._fsp--;

            stream_body.add(body190.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 214:25: -> ^( TERMINATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:28: ^( TERMINATION body )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:1: eventHdl : 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) ;
    public final BPELscriptParser.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptParser.eventHdl_return retval = new BPELscriptParser.eventHdl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal191=null;
        Token char_literal192=null;
        Token char_literal195=null;
        BPELscriptParser.onEvent_return onEvent193 = null;

        BPELscriptParser.onAlarm_return onAlarm194 = null;


        CommonTree string_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal195_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_onEvent=new RewriteRuleSubtreeStream(adaptor,"rule onEvent");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:2: ( 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:4: 'events' '{' ( onEvent )* ( onAlarm )* '}'
            {
            string_literal191=(Token)match(input,143,FOLLOW_143_in_eventHdl2021);  
            stream_143.add(string_literal191);

            char_literal192=(Token)match(input,110,FOLLOW_110_in_eventHdl2023);  
            stream_110.add(char_literal192);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:17: ( onEvent )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==ID||LA74_0==144||(LA74_0>=180 && LA74_0<=181)||(LA74_0>=183 && LA74_0<=186)||LA74_0==188) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:17: onEvent
            	    {
            	    pushFollow(FOLLOW_onEvent_in_eventHdl2025);
            	    onEvent193=onEvent();

            	    state._fsp--;

            	    stream_onEvent.add(onEvent193.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:26: ( onAlarm )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==SJF||LA75_0==110||(LA75_0>=118 && LA75_0<=120)||(LA75_0>=124 && LA75_0<=125)||LA75_0==182) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:26: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_eventHdl2028);
            	    onAlarm194=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm194.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            char_literal195=(Token)match(input,111,FOLLOW_111_in_eventHdl2031);  
            stream_111.add(char_literal195);



            // AST REWRITE
            // elements: onEvent, onAlarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:3: -> ^( EVENTHDL ( onEvent )* ( onAlarm )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:6: ^( EVENTHDL ( onEvent )* ( onAlarm )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENTHDL, "EVENTHDL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:17: ( onEvent )*
                while ( stream_onEvent.hasNext() ) {
                    adaptor.addChild(root_1, stream_onEvent.nextTree());

                }
                stream_onEvent.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:26: ( onAlarm )*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:1: onEvent : ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) ;
    public final BPELscriptParser.onEvent_return onEvent() throws RecognitionException {
        BPELscriptParser.onEvent_return retval = new BPELscriptParser.onEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Token p=null;
        Token o=null;
        Token char_literal200=null;
        Token string_literal201=null;
        Token char_literal202=null;
        Token char_literal203=null;
        Token char_literal204=null;
        Token char_literal206=null;
        BPELscriptParser.portType_return portType196 = null;

        BPELscriptParser.msgEx_return msgEx197 = null;

        BPELscriptParser.msgType_return msgType198 = null;

        BPELscriptParser.viElt_return viElt199 = null;

        BPELscriptParser.correlation_return correlation205 = null;

        BPELscriptParser.with_ex_return with_ex207 = null;

        BPELscriptParser.scope_short_return scope_short208 = null;


        CommonTree var_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree char_literal204_tree=null;
        CommonTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:2: ( ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:4: ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:4: ( portType )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=180 && LA76_0<=181)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent2056);
                    portType196=portType();

                    state._fsp--;

                    stream_portType.add(portType196.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:14: ( msgEx )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=183 && LA77_0<=184)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:14: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent2059);
                    msgEx197=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx197.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:3: ( msgType | viElt )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=185 && LA78_0<=186)) ) {
                alt78=1;
            }
            else if ( (LA78_0==188) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:5: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent2066);
                    msgType198=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType198.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:15: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent2070);
                    viElt199=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt199.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:3: (var= ID '=' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:4: var= ID '='
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_onEvent2085);  
                    stream_ID.add(var);

                    char_literal200=(Token)match(input,134,FOLLOW_134_in_onEvent2087);  
                    stream_134.add(char_literal200);


                    }
                    break;

            }

            string_literal201=(Token)match(input,144,FOLLOW_144_in_onEvent2092);  
            stream_144.add(string_literal201);

            char_literal202=(Token)match(input,116,FOLLOW_116_in_onEvent2094);  
            stream_116.add(char_literal202);

            p=(Token)match(input,ID,FOLLOW_ID_in_onEvent2098);  
            stream_ID.add(p);

            char_literal203=(Token)match(input,113,FOLLOW_113_in_onEvent2100);  
            stream_113.add(char_literal203);

            o=(Token)match(input,ID,FOLLOW_ID_in_onEvent2104);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:44: ( ',' correlation )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==113) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:45: ',' correlation
                    {
                    char_literal204=(Token)match(input,113,FOLLOW_113_in_onEvent2107);  
                    stream_113.add(char_literal204);

                    pushFollow(FOLLOW_correlation_in_onEvent2109);
                    correlation205=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation205.getTree());

                    }
                    break;

            }

            char_literal206=(Token)match(input,117,FOLLOW_117_in_onEvent2113);  
            stream_117.add(char_literal206);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:67: ( with_ex )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==146) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:67: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2115);
                    with_ex207=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex207.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2118);
            scope_short208=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short208.getTree());


            // AST REWRITE
            // elements: var, portType, viElt, msgEx, scope_short, correlation, o, p, msgType, with_ex
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
            // 224:2: -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:6: ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:20: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:33: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:54: ( $var)?
                if ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextNode());

                }
                stream_var.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:60: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:77: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:86: ( viElt )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:1: compensation : 'compensation' body -> ^( COMPENSATION body ) ;
    public final BPELscriptParser.compensation_return compensation() throws RecognitionException {
        BPELscriptParser.compensation_return retval = new BPELscriptParser.compensation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal209=null;
        BPELscriptParser.body_return body210 = null;


        CommonTree string_literal209_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:2: ( 'compensation' body -> ^( COMPENSATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:4: 'compensation' body
            {
            string_literal209=(Token)match(input,145,FOLLOW_145_in_compensation2169);  
            stream_145.add(string_literal209);

            pushFollow(FOLLOW_body_in_compensation2171);
            body210=body();

            state._fsp--;

            stream_body.add(body210.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:24: -> ^( COMPENSATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:27: ^( COMPENSATION body )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:1: with_ex : 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) ;
    public final BPELscriptParser.with_ex_return with_ex() throws RecognitionException {
        BPELscriptParser.with_ex_return retval = new BPELscriptParser.with_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal211=null;
        Token char_literal212=null;
        Token char_literal213=null;
        Token char_literal214=null;
        List list_wm=null;
        RuleReturnScope wm = null;
        CommonTree string_literal211_tree=null;
        CommonTree char_literal212_tree=null;
        CommonTree char_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_with_map=new RewriteRuleSubtreeStream(adaptor,"rule with_map");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:3: ( 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:6: 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')'
            {
            string_literal211=(Token)match(input,146,FOLLOW_146_in_with_ex2190);  
            stream_146.add(string_literal211);

            char_literal212=(Token)match(input,116,FOLLOW_116_in_with_ex2192);  
            stream_116.add(char_literal212);

            pushFollow(FOLLOW_with_map_in_with_ex2196);
            wm=with_map();

            state._fsp--;

            stream_with_map.add(wm.getTree());
            if (list_wm==null) list_wm=new ArrayList();
            list_wm.add(wm);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:30: ( ',' wm+= with_map )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==113) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:31: ',' wm+= with_map
            	    {
            	    char_literal213=(Token)match(input,113,FOLLOW_113_in_with_ex2199);  
            	    stream_113.add(char_literal213);

            	    pushFollow(FOLLOW_with_map_in_with_ex2203);
            	    wm=with_map();

            	    state._fsp--;

            	    stream_with_map.add(wm.getTree());
            	    if (list_wm==null) list_wm=new ArrayList();
            	    list_wm.add(wm);


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            char_literal214=(Token)match(input,117,FOLLOW_117_in_with_ex2207);  
            stream_117.add(char_literal214);



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
            // 230:54: -> ^( WITH ( $wm)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:57: ^( WITH ( $wm)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:232:1: with_map : ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) ;
    public final BPELscriptParser.with_map_return with_map() throws RecognitionException {
        BPELscriptParser.with_map_return retval = new BPELscriptParser.with_map_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID215=null;
        Token char_literal216=null;
        Token KEY217=null;
        BPELscriptParser.path_expr_return path_expr218 = null;


        CommonTree ID215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree KEY217_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:2: ( ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:11: ID ':' ( KEY )? path_expr
            {
            ID215=(Token)match(input,ID,FOLLOW_ID_in_with_map2233);  
            stream_ID.add(ID215);

            char_literal216=(Token)match(input,147,FOLLOW_147_in_with_map2235);  
            stream_147.add(char_literal216);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:18: ( KEY )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KEY) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:18: KEY
                    {
                    KEY217=(Token)match(input,KEY,FOLLOW_KEY_in_with_map2237);  
                    stream_KEY.add(KEY217);


                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2240);
            path_expr218=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr218.getTree());


            // AST REWRITE
            // elements: ID, path_expr, KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:33: -> ^( MAP ID ( KEY )? path_expr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:36: ^( MAP ID ( KEY )? path_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:45: ( KEY )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:1: receive : ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) ;
    public final BPELscriptParser.receive_return receive() throws RecognitionException {
        BPELscriptParser.receive_return retval = new BPELscriptParser.receive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token CREATE_INST220=null;
        Token string_literal223=null;
        Token char_literal224=null;
        Token char_literal225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        BPELscriptParser.portType_return portType219 = null;

        BPELscriptParser.msgEx_return msgEx221 = null;

        BPELscriptParser.std_attr_return std_attr222 = null;

        BPELscriptParser.correlation_return correlation227 = null;

        BPELscriptParser.with_ex_return with_ex229 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree CREATE_INST220_tree=null;
        CommonTree string_literal223_tree=null;
        CommonTree char_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:9: ( ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:12: ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:12: ( portType )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=180 && LA84_0<=181)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2271);
                    portType219=portType();

                    state._fsp--;

                    stream_portType.add(portType219.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:22: ( CREATE_INST )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==CREATE_INST) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:22: CREATE_INST
                    {
                    CREATE_INST220=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2274);  
                    stream_CREATE_INST.add(CREATE_INST220);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:35: ( msgEx )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=183 && LA86_0<=184)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:237:35: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2277);
                    msgEx221=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx221.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_receive2280);
            std_attr222=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr222.getTree());
            string_literal223=(Token)match(input,148,FOLLOW_148_in_receive2284);  
            stream_148.add(string_literal223);

            char_literal224=(Token)match(input,116,FOLLOW_116_in_receive2286);  
            stream_116.add(char_literal224);

            p=(Token)match(input,ID,FOLLOW_ID_in_receive2290);  
            stream_ID.add(p);

            char_literal225=(Token)match(input,113,FOLLOW_113_in_receive2292);  
            stream_113.add(char_literal225);

            o=(Token)match(input,ID,FOLLOW_ID_in_receive2296);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:31: ( ',' correlation )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==113) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:32: ',' correlation
                    {
                    char_literal226=(Token)match(input,113,FOLLOW_113_in_receive2299);  
                    stream_113.add(char_literal226);

                    pushFollow(FOLLOW_correlation_in_receive2301);
                    correlation227=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation227.getTree());

                    }
                    break;

            }

            char_literal228=(Token)match(input,117,FOLLOW_117_in_receive2305);  
            stream_117.add(char_literal228);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:54: ( with_ex )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==146) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:54: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2307);
                    with_ex229=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex229.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: std_attr, msgEx, o, p, with_ex, portType, correlation, CREATE_INST
            // token labels: p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:2: -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:6: ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:22: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:35: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:45: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:58: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:74: ( with_ex )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:1: reply : ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) ;
    public final BPELscriptParser.reply_return reply() throws RecognitionException {
        BPELscriptParser.reply_return retval = new BPELscriptParser.reply_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal234=null;
        Token char_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal240=null;
        BPELscriptParser.portType_return portType230 = null;

        BPELscriptParser.faultName_return faultName231 = null;

        BPELscriptParser.msgEx_return msgEx232 = null;

        BPELscriptParser.std_attr_return std_attr233 = null;

        BPELscriptParser.correlation_return correlation239 = null;

        BPELscriptParser.with_ex_return with_ex241 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:2: ( ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:4: ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:4: ( portType )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=180 && LA89_0<=181)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply2348);
                    portType230=portType();

                    state._fsp--;

                    stream_portType.add(portType230.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:14: ( faultName )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=189 && LA90_0<=190)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:14: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply2351);
                    faultName231=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName231.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:25: ( msgEx )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=183 && LA91_0<=184)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:25: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply2354);
                    msgEx232=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx232.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_reply2357);
            std_attr233=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr233.getTree());
            string_literal234=(Token)match(input,149,FOLLOW_149_in_reply2361);  
            stream_149.add(string_literal234);

            char_literal235=(Token)match(input,116,FOLLOW_116_in_reply2363);  
            stream_116.add(char_literal235);

            p=(Token)match(input,ID,FOLLOW_ID_in_reply2367);  
            stream_ID.add(p);

            char_literal236=(Token)match(input,113,FOLLOW_113_in_reply2369);  
            stream_113.add(char_literal236);

            o=(Token)match(input,ID,FOLLOW_ID_in_reply2373);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:29: ( ',' in= ID )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==113) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==ID) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:30: ',' in= ID
                    {
                    char_literal237=(Token)match(input,113,FOLLOW_113_in_reply2376);  
                    stream_113.add(char_literal237);

                    in=(Token)match(input,ID,FOLLOW_ID_in_reply2380);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:42: ( ',' correlation )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==113) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:43: ',' correlation
                    {
                    char_literal238=(Token)match(input,113,FOLLOW_113_in_reply2385);  
                    stream_113.add(char_literal238);

                    pushFollow(FOLLOW_correlation_in_reply2387);
                    correlation239=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation239.getTree());

                    }
                    break;

            }

            char_literal240=(Token)match(input,117,FOLLOW_117_in_reply2391);  
            stream_117.add(char_literal240);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:66: ( with_ex )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==146) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2394);
                    with_ex241=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex241.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, faultName, ID, std_attr, ID, portType, correlation, with_ex, msgEx
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:2: -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:6: ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPLY, "REPLY"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:24: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:37: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:56: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:67: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:74: ( with_ex )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:1: invoke : ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) ;
    public final BPELscriptParser.invoke_return invoke() throws RecognitionException {
        BPELscriptParser.invoke_return retval = new BPELscriptParser.invoke_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal244=null;
        Token char_literal245=null;
        Token char_literal246=null;
        Token char_literal247=null;
        Token char_literal248=null;
        Token char_literal250=null;
        BPELscriptParser.portType_return portType242 = null;

        BPELscriptParser.std_attr_return std_attr243 = null;

        BPELscriptParser.correlation_return correlation249 = null;

        BPELscriptParser.with_ex_return with_ex251 = null;

        BPELscriptParser.compensation_return compensation252 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal244_tree=null;
        CommonTree char_literal245_tree=null;
        CommonTree char_literal246_tree=null;
        CommonTree char_literal247_tree=null;
        CommonTree char_literal248_tree=null;
        CommonTree char_literal250_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:2: ( ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:4: ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:4: ( portType )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=180 && LA95_0<=181)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke2436);
                    portType242=portType();

                    state._fsp--;

                    stream_portType.add(portType242.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_invoke2439);
            std_attr243=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr243.getTree());
            string_literal244=(Token)match(input,150,FOLLOW_150_in_invoke2443);  
            stream_150.add(string_literal244);

            char_literal245=(Token)match(input,116,FOLLOW_116_in_invoke2445);  
            stream_116.add(char_literal245);

            p=(Token)match(input,ID,FOLLOW_ID_in_invoke2449);  
            stream_ID.add(p);

            char_literal246=(Token)match(input,113,FOLLOW_113_in_invoke2451);  
            stream_113.add(char_literal246);

            o=(Token)match(input,ID,FOLLOW_ID_in_invoke2455);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:30: ( ',' in= ID )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==113) ) {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==ID) ) {
                    alt96=1;
                }
            }
            switch (alt96) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:31: ',' in= ID
                    {
                    char_literal247=(Token)match(input,113,FOLLOW_113_in_invoke2458);  
                    stream_113.add(char_literal247);

                    in=(Token)match(input,ID,FOLLOW_ID_in_invoke2462);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:43: ( ',' correlation )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==113) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:44: ',' correlation
                    {
                    char_literal248=(Token)match(input,113,FOLLOW_113_in_invoke2467);  
                    stream_113.add(char_literal248);

                    pushFollow(FOLLOW_correlation_in_invoke2469);
                    correlation249=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation249.getTree());

                    }
                    break;

            }

            char_literal250=(Token)match(input,117,FOLLOW_117_in_invoke2473);  
            stream_117.add(char_literal250);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:66: ( with_ex )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==146) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2475);
                    with_ex251=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex251.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:75: ( compensation )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==145) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:75: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2478);
                    compensation252=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation252.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: compensation, o, with_ex, std_attr, p, correlation, portType, in
            // token labels: p, o, in
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleTokenStream stream_in=new RewriteRuleTokenStream(adaptor,"token in",in);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 249:2: -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:6: ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVOKE, "INVOKE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:21: ( $in)?
                if ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:26: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:39: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:58: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:67: ( compensation )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:1: assign : ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) ;
    public final BPELscriptParser.assign_return assign() throws RecognitionException {
        BPELscriptParser.assign_return retval = new BPELscriptParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lhs_opaque=null;
        Token CREATE_INST254=null;
        Token VALID255=null;
        Token KEEPSRC256=null;
        Token IGNORE257=null;
        Token PROP262=null;
        Token char_literal263=null;
        BPELscriptParser.portType_return portType253 = null;

        BPELscriptParser.faultName_return faultName258 = null;

        BPELscriptParser.msgEx_return msgEx259 = null;

        BPELscriptParser.std_attr_return std_attr260 = null;

        BPELscriptParser.path_expr_return path_expr261 = null;

        BPELscriptParser.rvalue_return rvalue264 = null;


        CommonTree lhs_opaque_tree=null;
        CommonTree CREATE_INST254_tree=null;
        CommonTree VALID255_tree=null;
        CommonTree KEEPSRC256_tree=null;
        CommonTree IGNORE257_tree=null;
        CommonTree PROP262_tree=null;
        CommonTree char_literal263_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_IGNORE=new RewriteRuleTokenStream(adaptor,"token IGNORE");
        RewriteRuleTokenStream stream_PROP=new RewriteRuleTokenStream(adaptor,"token PROP");
        RewriteRuleTokenStream stream_KEEPSRC=new RewriteRuleTokenStream(adaptor,"token KEEPSRC");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleTokenStream stream_VALID=new RewriteRuleTokenStream(adaptor,"token VALID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:2: ( ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:4: ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:4: ( portType )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=180 && LA100_0<=181)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign2520);
                    portType253=portType();

                    state._fsp--;

                    stream_portType.add(portType253.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:14: ( CREATE_INST )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==CREATE_INST) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:14: CREATE_INST
                    {
                    CREATE_INST254=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2523);  
                    stream_CREATE_INST.add(CREATE_INST254);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:27: ( VALID )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==VALID) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:27: VALID
                    {
                    VALID255=(Token)match(input,VALID,FOLLOW_VALID_in_assign2526);  
                    stream_VALID.add(VALID255);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:34: ( KEEPSRC )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KEEPSRC) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:34: KEEPSRC
                    {
                    KEEPSRC256=(Token)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2529);  
                    stream_KEEPSRC.add(KEEPSRC256);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:43: ( IGNORE )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IGNORE) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:43: IGNORE
                    {
                    IGNORE257=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_assign2532);  
                    stream_IGNORE.add(IGNORE257);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:51: ( faultName )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0>=189 && LA105_0<=190)) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:51: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign2535);
                    faultName258=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName258.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:62: ( msgEx )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=183 && LA106_0<=184)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:252:62: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign2538);
                    msgEx259=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx259.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_assign2541);
            std_attr260=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr260.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:3: (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==OPAQUE_EXPR) ) {
                alt108=1;
            }
            else if ( (LA108_0==ID) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:4: lhs_opaque= OPAQUE_EXPR
                    {
                    lhs_opaque=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_assign2549);  
                    stream_OPAQUE_EXPR.add(lhs_opaque);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:29: path_expr ( PROP )?
                    {
                    pushFollow(FOLLOW_path_expr_in_assign2553);
                    path_expr261=path_expr();

                    state._fsp--;

                    stream_path_expr.add(path_expr261.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:39: ( PROP )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==PROP) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:39: PROP
                            {
                            PROP262=(Token)match(input,PROP,FOLLOW_PROP_in_assign2555);  
                            stream_PROP.add(PROP262);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal263=(Token)match(input,134,FOLLOW_134_in_assign2559);  
            stream_134.add(char_literal263);

            pushFollow(FOLLOW_rvalue_in_assign2561);
            rvalue264=rvalue();

            state._fsp--;

            stream_rvalue.add(rvalue264.getTree());


            // AST REWRITE
            // elements: CREATE_INST, portType, std_attr, msgEx, lhs_opaque, VALID, faultName, rvalue, PROP, path_expr, IGNORE, KEEPSRC
            // token labels: lhs_opaque
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_lhs_opaque=new RewriteRuleTokenStream(adaptor,"token lhs_opaque",lhs_opaque);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 254:2: -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:6: ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:15: ( path_expr )?
                if ( stream_path_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_path_expr.nextTree());

                }
                stream_path_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:26: ( PROP )?
                if ( stream_PROP.hasNext() ) {
                    adaptor.addChild(root_1, stream_PROP.nextNode());

                }
                stream_PROP.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:32: ( $lhs_opaque)?
                if ( stream_lhs_opaque.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_opaque.nextNode());

                }
                stream_lhs_opaque.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:45: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:55: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:77: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:88: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:95: ( VALID )?
                if ( stream_VALID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VALID.nextNode());

                }
                stream_VALID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:102: ( KEEPSRC )?
                if ( stream_KEEPSRC.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEEPSRC.nextNode());

                }
                stream_KEEPSRC.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:111: ( IGNORE )?
                if ( stream_IGNORE.hasNext() ) {
                    adaptor.addChild(root_1, stream_IGNORE.nextNode());

                }
                stream_IGNORE.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:119: ( rvalue )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:256:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );
    public final BPELscriptParser.rvalue_return rvalue() throws RecognitionException {
        BPELscriptParser.rvalue_return retval = new BPELscriptParser.rvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROP268=null;
        Token OPAQUE_EXPR269=null;
        BPELscriptParser.receive_return receive265 = null;

        BPELscriptParser.invoke_return invoke266 = null;

        BPELscriptParser.expr_return expr267 = null;


        CommonTree PROP268_tree=null;
        CommonTree OPAQUE_EXPR269_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:257:2: ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR )
            int alt110=4;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:257:4: receive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_receive_in_rvalue2614);
                    receive265=receive();

                    state._fsp--;

                    adaptor.addChild(root_0, receive265.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:4: invoke
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_invoke_in_rvalue2619);
                    invoke266=invoke();

                    state._fsp--;

                    adaptor.addChild(root_0, invoke266.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:4: expr ( PROP )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_rvalue2624);
                    expr267=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr267.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:9: ( PROP )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==PROP) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:9: PROP
                            {
                            PROP268=(Token)match(input,PROP,FOLLOW_PROP_in_rvalue2626); 
                            PROP268_tree = (CommonTree)adaptor.create(PROP268);
                            adaptor.addChild(root_0, PROP268_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:260:4: OPAQUE_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OPAQUE_EXPR269=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_rvalue2632); 
                    OPAQUE_EXPR269_tree = (CommonTree)adaptor.create(OPAQUE_EXPR269);
                    adaptor.addChild(root_0, OPAQUE_EXPR269_tree);


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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:1: throw_ex : ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) ;
    public final BPELscriptParser.throw_ex_return throw_ex() throws RecognitionException {
        BPELscriptParser.throw_ex_return retval = new BPELscriptParser.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token faultVar=null;
        Token string_literal270=null;
        Token string_literal271=null;
        Token string_literal273=null;
        Token char_literal274=null;
        Token char_literal276=null;
        BPELscriptParser.std_attr_return std_attr272 = null;

        BPELscriptParser.ns_id_return ns_id275 = null;


        CommonTree faultVar_tree=null;
        CommonTree string_literal270_tree=null;
        CommonTree string_literal271_tree=null;
        CommonTree string_literal273_tree=null;
        CommonTree char_literal274_tree=null;
        CommonTree char_literal276_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:2: ( ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=151 && LA112_0<=152)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:5: ( '@faultVariable' | '@faultVar' ) faultVar= ID
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:5: ( '@faultVariable' | '@faultVar' )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==151) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==152) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:6: '@faultVariable'
                            {
                            string_literal270=(Token)match(input,151,FOLLOW_151_in_throw_ex2646);  
                            stream_151.add(string_literal270);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:24: '@faultVar'
                            {
                            string_literal271=(Token)match(input,152,FOLLOW_152_in_throw_ex2649);  
                            stream_152.add(string_literal271);


                            }
                            break;

                    }

                    faultVar=(Token)match(input,ID,FOLLOW_ID_in_throw_ex2654);  
                    stream_ID.add(faultVar);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_throw_ex2658);
            std_attr272=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr272.getTree());
            string_literal273=(Token)match(input,153,FOLLOW_153_in_throw_ex2662);  
            stream_153.add(string_literal273);

            char_literal274=(Token)match(input,116,FOLLOW_116_in_throw_ex2664);  
            stream_116.add(char_literal274);

            pushFollow(FOLLOW_ns_id_in_throw_ex2666);
            ns_id275=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id275.getTree());
            char_literal276=(Token)match(input,117,FOLLOW_117_in_throw_ex2668);  
            stream_117.add(char_literal276);



            // AST REWRITE
            // elements: std_attr, ns_id, faultVar
            // token labels: faultVar
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_faultVar=new RewriteRuleTokenStream(adaptor,"token faultVar",faultVar);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:25: -> ^( THROW ns_id ( $faultVar)? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:28: ^( THROW ns_id ( $faultVar)? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:42: ( $faultVar)?
                if ( stream_faultVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultVar.nextNode());

                }
                stream_faultVar.reset();
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
    // $ANTLR end "throw_ex"

    public static class rethrow_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rethrow_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:1: rethrow_ex : std_attr 'rethrow' -> ^( RETHROW std_attr ) ;
    public final BPELscriptParser.rethrow_ex_return rethrow_ex() throws RecognitionException {
        BPELscriptParser.rethrow_ex_return retval = new BPELscriptParser.rethrow_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal278=null;
        BPELscriptParser.std_attr_return std_attr277 = null;


        CommonTree string_literal278_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:2: ( std_attr 'rethrow' -> ^( RETHROW std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:4: std_attr 'rethrow'
            {
            pushFollow(FOLLOW_std_attr_in_rethrow_ex2693);
            std_attr277=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr277.getTree());
            string_literal278=(Token)match(input,154,FOLLOW_154_in_rethrow_ex2697);  
            stream_154.add(string_literal278);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 269:13: -> ^( RETHROW std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:269:16: ^( RETHROW std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:271:1: compensate : std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) ;
    public final BPELscriptParser.compensate_return compensate() throws RecognitionException {
        BPELscriptParser.compensate_return retval = new BPELscriptParser.compensate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token target=null;
        Token string_literal280=null;
        Token char_literal281=null;
        Token char_literal282=null;
        BPELscriptParser.std_attr_return std_attr279 = null;


        CommonTree target_tree=null;
        CommonTree string_literal280_tree=null;
        CommonTree char_literal281_tree=null;
        CommonTree char_literal282_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:2: ( std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:4: std_attr 'compensate' ( '(' target= ID ')' )?
            {
            pushFollow(FOLLOW_std_attr_in_compensate2714);
            std_attr279=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr279.getTree());
            string_literal280=(Token)match(input,155,FOLLOW_155_in_compensate2718);  
            stream_155.add(string_literal280);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:16: ( '(' target= ID ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==116) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:273:17: '(' target= ID ')'
                    {
                    char_literal281=(Token)match(input,116,FOLLOW_116_in_compensate2721);  
                    stream_116.add(char_literal281);

                    target=(Token)match(input,ID,FOLLOW_ID_in_compensate2725);  
                    stream_ID.add(target);

                    char_literal282=(Token)match(input,117,FOLLOW_117_in_compensate2727);  
                    stream_117.add(char_literal282);


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
            // 274:2: -> ^( COMPENSATE ( ID )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:6: ^( COMPENSATE ( ID )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATE, "COMPENSATE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:19: ( ID )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:276:1: exit : std_attr 'exit' -> ^( EXIT std_attr ) ;
    public final BPELscriptParser.exit_return exit() throws RecognitionException {
        BPELscriptParser.exit_return retval = new BPELscriptParser.exit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal284=null;
        BPELscriptParser.std_attr_return std_attr283 = null;


        CommonTree string_literal284_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:276:7: ( std_attr 'exit' -> ^( EXIT std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:276:9: std_attr 'exit'
            {
            pushFollow(FOLLOW_std_attr_in_exit2752);
            std_attr283=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr283.getTree());
            string_literal284=(Token)match(input,156,FOLLOW_156_in_exit2757);  
            stream_156.add(string_literal284);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 277:11: -> ^( EXIT std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:14: ^( EXIT std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:1: validate : std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) ;
    public final BPELscriptParser.validate_return validate() throws RecognitionException {
        BPELscriptParser.validate_return retval = new BPELscriptParser.validate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal286=null;
        Token char_literal287=null;
        Token v=null;
        List list_v=null;
        BPELscriptParser.std_attr_return std_attr285 = null;


        CommonTree string_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        CommonTree v_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:10: ( std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:279:12: std_attr 'validate' v+= ID ( ',' v+= ID )*
            {
            pushFollow(FOLLOW_std_attr_in_validate2774);
            std_attr285=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr285.getTree());
            string_literal286=(Token)match(input,157,FOLLOW_157_in_validate2780);  
            stream_157.add(string_literal286);

            v=(Token)match(input,ID,FOLLOW_ID_in_validate2784);  
            stream_ID.add(v);

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:21: ( ',' v+= ID )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==113) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:22: ',' v+= ID
            	    {
            	    char_literal287=(Token)match(input,113,FOLLOW_113_in_validate2787);  
            	    stream_113.add(char_literal287);

            	    v=(Token)match(input,ID,FOLLOW_ID_in_validate2791);  
            	    stream_ID.add(v);

            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop114;
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
            // 280:33: -> ^( VALIDATE ( $v)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:36: ^( VALIDATE ( $v)+ std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:1: ext_act : std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) ;
    public final BPELscriptParser.ext_act_return ext_act() throws RecognitionException {
        BPELscriptParser.ext_act_return retval = new BPELscriptParser.ext_act_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token e=null;
        BPELscriptParser.std_attr_return std_attr288 = null;


        CommonTree e_tree=null;
        RewriteRuleTokenStream stream_EXT_ACT=new RewriteRuleTokenStream(adaptor,"token EXT_ACT");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:11: ( std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:13: std_attr e= EXT_ACT
            {
            pushFollow(FOLLOW_std_attr_in_ext_act2815);
            std_attr288=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr288.getTree());
            e=(Token)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act2823);  
            stream_EXT_ACT.add(e);



            // AST REWRITE
            // elements: std_attr, e
            // token labels: e
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 283:14: -> ^( EXTENSIONACT $e std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:283:18: ^( EXTENSIONACT $e std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:1: nop : std_attr 'nop' -> ^( NOP std_attr ) ;
    public final BPELscriptParser.nop_return nop() throws RecognitionException {
        BPELscriptParser.nop_return retval = new BPELscriptParser.nop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal290=null;
        BPELscriptParser.std_attr_return std_attr289 = null;


        CommonTree string_literal290_tree=null;
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:6: ( std_attr 'nop' -> ^( NOP std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:8: std_attr 'nop'
            {
            pushFollow(FOLLOW_std_attr_in_nop2844);
            std_attr289=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr289.getTree());
            string_literal290=(Token)match(input,158,FOLLOW_158_in_nop2849);  
            stream_158.add(string_literal290);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 286:10: -> ^( NOP std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:13: ^( NOP std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:1: opaque : std_attr 'opaque()' -> ^( OPAQUE std_attr ) ;
    public final BPELscriptParser.opaque_return opaque() throws RecognitionException {
        BPELscriptParser.opaque_return retval = new BPELscriptParser.opaque_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal292=null;
        BPELscriptParser.std_attr_return std_attr291 = null;


        CommonTree string_literal292_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:8: ( std_attr 'opaque()' -> ^( OPAQUE std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:10: std_attr 'opaque()'
            {
            pushFollow(FOLLOW_std_attr_in_opaque2868);
            std_attr291=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr291.getTree());
            string_literal292=(Token)match(input,159,FOLLOW_159_in_opaque2873);  
            stream_159.add(string_literal292);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:15: -> ^( OPAQUE std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:18: ^( OPAQUE std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:292:1: namespace : 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) ;
    public final BPELscriptParser.namespace_return namespace() throws RecognitionException {
        BPELscriptParser.namespace_return retval = new BPELscriptParser.namespace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal293=null;
        Token ID294=null;
        Token char_literal295=null;
        Token STRING296=null;
        Token SEMI297=null;

        CommonTree string_literal293_tree=null;
        CommonTree ID294_tree=null;
        CommonTree char_literal295_tree=null;
        CommonTree STRING296_tree=null;
        CommonTree SEMI297_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:2: ( 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:4: 'namespace' ID '=' STRING SEMI
            {
            string_literal293=(Token)match(input,160,FOLLOW_160_in_namespace2892);  
            stream_160.add(string_literal293);

            ID294=(Token)match(input,ID,FOLLOW_ID_in_namespace2894);  
            stream_ID.add(ID294);

            char_literal295=(Token)match(input,134,FOLLOW_134_in_namespace2896);  
            stream_134.add(char_literal295);

            STRING296=(Token)match(input,STRING,FOLLOW_STRING_in_namespace2898);  
            stream_STRING.add(STRING296);

            SEMI297=(Token)match(input,SEMI,FOLLOW_SEMI_in_namespace2900);  
            stream_SEMI.add(SEMI297);



            // AST REWRITE
            // elements: STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:35: -> ^( NAMESPACE ID STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:38: ^( NAMESPACE ID STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:295:1: extension : ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) ;
    public final BPELscriptParser.extension_return extension() throws RecognitionException {
        BPELscriptParser.extension_return retval = new BPELscriptParser.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUSTUND298=null;
        Token string_literal299=null;
        Token ID300=null;
        Token char_literal301=null;
        Token STRING302=null;
        Token SEMI303=null;

        CommonTree MUSTUND298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree ID300_tree=null;
        CommonTree char_literal301_tree=null;
        CommonTree STRING302_tree=null;
        CommonTree SEMI303_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_MUSTUND=new RewriteRuleTokenStream(adaptor,"token MUSTUND");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:2: ( ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:5: ( MUSTUND )? 'extension' ID '=' STRING SEMI
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:5: ( MUSTUND )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==MUSTUND) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:5: MUSTUND
                    {
                    MUSTUND298=(Token)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension2921);  
                    stream_MUSTUND.add(MUSTUND298);


                    }
                    break;

            }

            string_literal299=(Token)match(input,161,FOLLOW_161_in_extension2927);  
            stream_161.add(string_literal299);

            ID300=(Token)match(input,ID,FOLLOW_ID_in_extension2929);  
            stream_ID.add(ID300);

            char_literal301=(Token)match(input,134,FOLLOW_134_in_extension2931);  
            stream_134.add(char_literal301);

            STRING302=(Token)match(input,STRING,FOLLOW_STRING_in_extension2933);  
            stream_STRING.add(STRING302);

            SEMI303=(Token)match(input,SEMI,FOLLOW_SEMI_in_extension2935);  
            stream_SEMI.add(SEMI303);



            // AST REWRITE
            // elements: MUSTUND, STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 298:2: -> ^( EXTENSION ID STRING ( MUSTUND )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:6: ^( EXTENSION ID STRING ( MUSTUND )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:28: ( MUSTUND )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:1: imports : viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) ;
    public final BPELscriptParser.imports_return imports() throws RecognitionException {
        BPELscriptParser.imports_return retval = new BPELscriptParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token ns=null;
        Token loc=null;
        Token string_literal305=null;
        Token char_literal306=null;
        Token string_literal307=null;
        Token SEMI308=null;
        BPELscriptParser.viType_return viType304 = null;


        CommonTree id_tree=null;
        CommonTree ns_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree SEMI308_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:2: ( viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:5: viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI
            {
            pushFollow(FOLLOW_viType_in_imports2960);
            viType304=viType();

            state._fsp--;

            stream_viType.add(viType304.getTree());
            string_literal305=(Token)match(input,162,FOLLOW_162_in_imports2966);  
            stream_162.add(string_literal305);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:302:12: (id= ID '=' (ns= ID '::' )? loc= STRING )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:302:13: id= ID '=' (ns= ID '::' )? loc= STRING
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_imports2971);  
            stream_ID.add(id);

            char_literal306=(Token)match(input,134,FOLLOW_134_in_imports2973);  
            stream_134.add(char_literal306);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:302:23: (ns= ID '::' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ID) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:302:24: ns= ID '::'
                    {
                    ns=(Token)match(input,ID,FOLLOW_ID_in_imports2978);  
                    stream_ID.add(ns);

                    string_literal307=(Token)match(input,163,FOLLOW_163_in_imports2980);  
                    stream_163.add(string_literal307);


                    }
                    break;

            }

            loc=(Token)match(input,STRING,FOLLOW_STRING_in_imports2987);  
            stream_STRING.add(loc);


            }

            SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports2991);  
            stream_SEMI.add(SEMI308);



            // AST REWRITE
            // elements: loc, ns, id, viType
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
            // 303:2: -> ^( IMPORT $id $loc ( $ns)? ( viType )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:6: ^( IMPORT $id $loc ( $ns)? ( viType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                adaptor.addChild(root_1, stream_loc.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:24: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:29: ( viType )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:1: messages : 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) ;
    public final BPELscriptParser.messages_return messages() throws RecognitionException {
        BPELscriptParser.messages_return retval = new BPELscriptParser.messages_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal309=null;
        Token char_literal310=null;
        List list_m=null;
        RuleReturnScope m = null;
        CommonTree string_literal309_tree=null;
        CommonTree char_literal310_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_message=new RewriteRuleSubtreeStream(adaptor,"rule message");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:2: ( 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:4: 'messages' m+= message ( ',' m+= message )*
            {
            string_literal309=(Token)match(input,164,FOLLOW_164_in_messages3023);  
            stream_164.add(string_literal309);

            pushFollow(FOLLOW_message_in_messages3027);
            m=message();

            state._fsp--;

            stream_message.add(m.getTree());
            if (list_m==null) list_m=new ArrayList();
            list_m.add(m);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:26: ( ',' m+= message )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==113) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:27: ',' m+= message
            	    {
            	    char_literal310=(Token)match(input,113,FOLLOW_113_in_messages3030);  
            	    stream_113.add(char_literal310);

            	    pushFollow(FOLLOW_message_in_messages3034);
            	    m=message();

            	    state._fsp--;

            	    stream_message.add(m.getTree());
            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m);


            	    }
            	    break;

            	default :
            	    break loop117;
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
            // 306:44: -> ^( MESSAGES ( message )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:47: ^( MESSAGES ( message )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:1: message : ID -> ^( MESSAGE ID ) ;
    public final BPELscriptParser.message_return message() throws RecognitionException {
        BPELscriptParser.message_return retval = new BPELscriptParser.message_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID311=null;

        CommonTree ID311_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:9: ( ID -> ^( MESSAGE ID ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:11: ID
            {
            ID311=(Token)match(input,ID,FOLLOW_ID_in_message3054);  
            stream_ID.add(ID311);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 308:14: -> ^( MESSAGE ID )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:17: ^( MESSAGE ID )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:1: variables : 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) ;
    public final BPELscriptParser.variables_return variables() throws RecognitionException {
        BPELscriptParser.variables_return retval = new BPELscriptParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal312=null;
        Token char_literal313=null;
        List list_v=null;
        RuleReturnScope v = null;
        CommonTree string_literal312_tree=null;
        CommonTree char_literal313_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:11: ( 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:13: 'var' v+= variable ( ',' v+= variable )*
            {
            string_literal312=(Token)match(input,165,FOLLOW_165_in_variables3072);  
            stream_165.add(string_literal312);

            pushFollow(FOLLOW_variable_in_variables3076);
            v=variable();

            state._fsp--;

            stream_variable.add(v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:31: ( ',' v+= variable )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==113) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:32: ',' v+= variable
            	    {
            	    char_literal313=(Token)match(input,113,FOLLOW_113_in_variables3079);  
            	    stream_113.add(char_literal313);

            	    pushFollow(FOLLOW_variable_in_variables3083);
            	    v=variable();

            	    state._fsp--;

            	    stream_variable.add(v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop118;
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
            // 311:3: -> ^( VARIABLES ( variable )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:7: ^( VARIABLES ( variable )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:313:1: variable : ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) ;
    public final BPELscriptParser.variable_return variable() throws RecognitionException {
        BPELscriptParser.variable_return retval = new BPELscriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID317=null;
        BPELscriptParser.msgType_return msgType314 = null;

        BPELscriptParser.viType_return viType315 = null;

        BPELscriptParser.viElt_return viElt316 = null;

        BPELscriptParser.with_ex_return with_ex318 = null;


        CommonTree ID317_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:2: ( ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: ( msgType )? ( viType )? ( viElt )? ID ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: ( msgType )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=185 && LA119_0<=186)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable3107);
                    msgType314=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType314.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:13: ( viType )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==187) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:13: viType
                    {
                    pushFollow(FOLLOW_viType_in_variable3110);
                    viType315=viType();

                    state._fsp--;

                    stream_viType.add(viType315.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:21: ( viElt )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==188) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:21: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable3113);
                    viElt316=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt316.getTree());

                    }
                    break;

            }

            ID317=(Token)match(input,ID,FOLLOW_ID_in_variable3118);  
            stream_ID.add(ID317);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:315:7: ( with_ex )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==146) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:315:7: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable3121);
                    with_ex318=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex318.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: msgType, with_ex, ID, viElt, viType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 316:2: -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:6: ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:20: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:37: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:44: ( with_ex )?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:1: partner_links : ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) ;
    public final BPELscriptParser.partner_links_return partner_links() throws RecognitionException {
        BPELscriptParser.partner_links_return retval = new BPELscriptParser.partner_links_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal319=null;
        Token string_literal320=null;
        Token char_literal321=null;
        List list_pl=null;
        RuleReturnScope pl = null;
        CommonTree string_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree char_literal321_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_partner_link=new RewriteRuleSubtreeStream(adaptor,"rule partner_link");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:2: ( ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:4: ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:4: ( 'partnerLink' | 'partnerlink' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==166) ) {
                alt123=1;
            }
            else if ( (LA123_0==167) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:5: 'partnerLink'
                    {
                    string_literal319=(Token)match(input,166,FOLLOW_166_in_partner_links3154);  
                    stream_166.add(string_literal319);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:21: 'partnerlink'
                    {
                    string_literal320=(Token)match(input,167,FOLLOW_167_in_partner_links3158);  
                    stream_167.add(string_literal320);


                    }
                    break;

            }

            pushFollow(FOLLOW_partner_link_in_partner_links3163);
            pl=partner_link();

            state._fsp--;

            stream_partner_link.add(pl.getTree());
            if (list_pl==null) list_pl=new ArrayList();
            list_pl.add(pl);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:53: ( ',' pl+= partner_link )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==113) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:54: ',' pl+= partner_link
            	    {
            	    char_literal321=(Token)match(input,113,FOLLOW_113_in_partner_links3166);  
            	    stream_113.add(char_literal321);

            	    pushFollow(FOLLOW_partner_link_in_partner_links3170);
            	    pl=partner_link();

            	    state._fsp--;

            	    stream_partner_link.add(pl.getTree());
            	    if (list_pl==null) list_pl=new ArrayList();
            	    list_pl.add(pl);


            	    }
            	    break;

            	default :
            	    break loop124;
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
            // 319:77: -> ^( PARTNERLINKS ( $pl)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:319:80: ^( PARTNERLINKS ( $pl)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:1: partner_link : ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) ;
    public final BPELscriptParser.partner_link_return partner_link() throws RecognitionException {
        BPELscriptParser.partner_link_return retval = new BPELscriptParser.partner_link_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token ID322=null;
        Token char_literal323=null;
        Token char_literal324=null;
        Token char_literal325=null;
        Token char_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        BPELscriptParser.ns_id_return plType = null;

        BPELscriptParser.ns_id_return roleA = null;

        BPELscriptParser.ns_id_return roleB = null;


        CommonTree init_tree=null;
        CommonTree ID322_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree char_literal324_tree=null;
        CommonTree char_literal325_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree char_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_INITPARTNER=new RewriteRuleTokenStream(adaptor,"token INITPARTNER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:2: ( ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:4: ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')'
            {
            ID322=(Token)match(input,ID,FOLLOW_ID_in_partner_link3192);  
            stream_ID.add(ID322);

            char_literal323=(Token)match(input,134,FOLLOW_134_in_partner_link3194);  
            stream_134.add(char_literal323);

            char_literal324=(Token)match(input,116,FOLLOW_116_in_partner_link3196);  
            stream_116.add(char_literal324);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:21: (plType= ns_id )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ID) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:21: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partner_link3200);
                    plType=ns_id();

                    state._fsp--;

                    stream_ns_id.add(plType.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:29: ( ',' roleA= ns_id )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==113) ) {
                int LA126_1 = input.LA(2);

                if ( (LA126_1==ID) ) {
                    alt126=1;
                }
            }
            switch (alt126) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:30: ',' roleA= ns_id
                    {
                    char_literal325=(Token)match(input,113,FOLLOW_113_in_partner_link3204);  
                    stream_113.add(char_literal325);

                    pushFollow(FOLLOW_ns_id_in_partner_link3208);
                    roleA=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleA.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:48: ( ',' roleB= ns_id )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==113) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==ID) ) {
                    alt127=1;
                }
            }
            switch (alt127) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:49: ',' roleB= ns_id
                    {
                    char_literal326=(Token)match(input,113,FOLLOW_113_in_partner_link3213);  
                    stream_113.add(char_literal326);

                    pushFollow(FOLLOW_ns_id_in_partner_link3217);
                    roleB=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleB.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:67: ( ',' init= INITPARTNER )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==113) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:322:68: ',' init= INITPARTNER
                    {
                    char_literal327=(Token)match(input,113,FOLLOW_113_in_partner_link3222);  
                    stream_113.add(char_literal327);

                    init=(Token)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partner_link3226);  
                    stream_INITPARTNER.add(init);


                    }
                    break;

            }

            char_literal328=(Token)match(input,117,FOLLOW_117_in_partner_link3230);  
            stream_117.add(char_literal328);



            // AST REWRITE
            // elements: roleB, plType, init, ID, roleA
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
            // 323:3: -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:7: ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PID, "PID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:16: ( $plType)?
                if ( stream_plType.hasNext() ) {
                    adaptor.addChild(root_1, stream_plType.nextTree());

                }
                stream_plType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:25: ( $roleA)?
                if ( stream_roleA.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleA.nextTree());

                }
                stream_roleA.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:33: ( $roleB)?
                if ( stream_roleB.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleB.nextTree());

                }
                stream_roleB.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:41: ( $init)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:1: correlation : '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) ;
    public final BPELscriptParser.correlation_return correlation() throws RecognitionException {
        BPELscriptParser.correlation_return retval = new BPELscriptParser.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal329=null;
        Token char_literal331=null;
        Token char_literal333=null;
        BPELscriptParser.corr_mapping_return corr_mapping330 = null;

        BPELscriptParser.corr_mapping_return corr_mapping332 = null;


        CommonTree char_literal329_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree char_literal333_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_corr_mapping=new RewriteRuleSubtreeStream(adaptor,"rule corr_mapping");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:2: ( '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:4: '{' corr_mapping ( ',' corr_mapping )* '}'
            {
            char_literal329=(Token)match(input,110,FOLLOW_110_in_correlation3266);  
            stream_110.add(char_literal329);

            pushFollow(FOLLOW_corr_mapping_in_correlation3268);
            corr_mapping330=corr_mapping();

            state._fsp--;

            stream_corr_mapping.add(corr_mapping330.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:21: ( ',' corr_mapping )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==113) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:22: ',' corr_mapping
            	    {
            	    char_literal331=(Token)match(input,113,FOLLOW_113_in_correlation3271);  
            	    stream_113.add(char_literal331);

            	    pushFollow(FOLLOW_corr_mapping_in_correlation3273);
            	    corr_mapping332=corr_mapping();

            	    state._fsp--;

            	    stream_corr_mapping.add(corr_mapping332.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            char_literal333=(Token)match(input,111,FOLLOW_111_in_correlation3277);  
            stream_111.add(char_literal333);



            // AST REWRITE
            // elements: corr_mapping
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 326:45: -> ^( CORRELATION ( corr_mapping )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:326:48: ^( CORRELATION ( corr_mapping )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:1: corr_mapping : (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) ;
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:2: ( (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:4: (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:8: (init= INIT_COR )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==INIT_COR) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:8: init= INIT_COR
                    {
                    init=(Token)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping3297);  
                    stream_INIT_COR.add(init);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:330:10: (pattern= PATTERN_COR )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==PATTERN_COR) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:330:10: pattern= PATTERN_COR
                    {
                    pattern=(Token)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping3304);  
                    stream_PATTERN_COR.add(pattern);


                    }
                    break;

            }

            f1=(Token)match(input,ID,FOLLOW_ID_in_corr_mapping3311);  
            stream_ID.add(f1);



            // AST REWRITE
            // elements: pattern, f1, init
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
            // 332:2: -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:6: ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORR_MAP, "CORR_MAP"), root_1);

                adaptor.addChild(root_1, stream_f1.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:21: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:28: ( $pattern)?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:1: corr_sets : 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) ;
    public final BPELscriptParser.corr_sets_return corr_sets() throws RecognitionException {
        BPELscriptParser.corr_sets_return retval = new BPELscriptParser.corr_sets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal334=null;
        Token char_literal335=null;
        Token char_literal336=null;
        Token char_literal337=null;
        Token char_literal338=null;
        List list_cs=null;
        RuleReturnScope cs = null;
        CommonTree string_literal334_tree=null;
        CommonTree char_literal335_tree=null;
        CommonTree char_literal336_tree=null;
        CommonTree char_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_corr_set=new RewriteRuleSubtreeStream(adaptor,"rule corr_set");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:12: ( 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:14: 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}'
            {
            string_literal334=(Token)match(input,168,FOLLOW_168_in_corr_sets3339);  
            stream_168.add(string_literal334);

            char_literal335=(Token)match(input,110,FOLLOW_110_in_corr_sets3341);  
            stream_110.add(char_literal335);

            pushFollow(FOLLOW_corr_set_in_corr_sets3344);
            cs=corr_set();

            state._fsp--;

            stream_corr_set.add(cs.getTree());
            if (list_cs==null) list_cs=new ArrayList();
            list_cs.add(cs);

            char_literal336=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3346);  
            stream_SEMI.add(char_literal336);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:47: (cs+= corr_set ';' )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==ID) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:48: cs+= corr_set ';'
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets3351);
            	    cs=corr_set();

            	    state._fsp--;

            	    stream_corr_set.add(cs.getTree());
            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs);

            	    char_literal337=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3353);  
            	    stream_SEMI.add(char_literal337);


            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);

            char_literal338=(Token)match(input,111,FOLLOW_111_in_corr_sets3357);  
            stream_111.add(char_literal338);



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
            // 334:71: -> ^( CORRSETS ( $cs)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:74: ^( CORRSETS ( $cs)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:1: corr_set : f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) ;
    public final BPELscriptParser.corr_set_return corr_set() throws RecognitionException {
        BPELscriptParser.corr_set_return retval = new BPELscriptParser.corr_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token f=null;
        Token char_literal339=null;
        Token char_literal340=null;
        Token char_literal341=null;
        Token par=null;
        List list_par=null;

        CommonTree f_tree=null;
        CommonTree char_literal339_tree=null;
        CommonTree char_literal340_tree=null;
        CommonTree char_literal341_tree=null;
        CommonTree par_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:10: (f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:12: f= ID '(' par+= ID ( ',' par+= ID )* ')'
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_corr_set3377);  
            stream_ID.add(f);

            char_literal339=(Token)match(input,116,FOLLOW_116_in_corr_set3379);  
            stream_116.add(char_literal339);

            par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3383);  
            stream_ID.add(par);

            if (list_par==null) list_par=new ArrayList();
            list_par.add(par);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:29: ( ',' par+= ID )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==113) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:30: ',' par+= ID
            	    {
            	    char_literal340=(Token)match(input,113,FOLLOW_113_in_corr_set3386);  
            	    stream_113.add(char_literal340);

            	    par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3390);  
            	    stream_ID.add(par);

            	    if (list_par==null) list_par=new ArrayList();
            	    list_par.add(par);


            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            char_literal341=(Token)match(input,117,FOLLOW_117_in_corr_set3394);  
            stream_117.add(char_literal341);



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
            // 336:48: -> ^( CORRSET $f ( $par)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:51: ^( CORRSET $f ( $par)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:1: expr : ( s_expr | EXT_EXPR | funct_call );
    public final BPELscriptParser.expr_return expr() throws RecognitionException {
        BPELscriptParser.expr_return retval = new BPELscriptParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXT_EXPR343=null;
        BPELscriptParser.s_expr_return s_expr342 = null;

        BPELscriptParser.funct_call_return funct_call344 = null;


        CommonTree EXT_EXPR343_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:7: ( s_expr | EXT_EXPR | funct_call )
            int alt134=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA134_1 = input.LA(2);

                if ( (LA134_1==SEMI||LA134_1==PROP||LA134_1==117||(LA134_1>=135 && LA134_1<=136)||LA134_1==163||(LA134_1>=169 && LA134_1<=179)) ) {
                    alt134=1;
                }
                else if ( (LA134_1==116) ) {
                    alt134=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 134, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case INT:
            case 116:
                {
                alt134=1;
                }
                break;
            case EXT_EXPR:
                {
                alt134=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:9: s_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_s_expr_in_expr3417);
                    s_expr342=s_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, s_expr342.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:18: EXT_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EXT_EXPR343=(Token)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr3421); 
                    EXT_EXPR343_tree = (CommonTree)adaptor.create(EXT_EXPR343);
                    adaptor.addChild(root_0, EXT_EXPR343_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:29: funct_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funct_call_in_expr3425);
                    funct_call344=funct_call();

                    state._fsp--;

                    adaptor.addChild(root_0, funct_call344.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:1: funct_call : p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) ;
    public final BPELscriptParser.funct_call_return funct_call() throws RecognitionException {
        BPELscriptParser.funct_call_return retval = new BPELscriptParser.funct_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal345=null;
        Token char_literal346=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal345_tree=null;
        CommonTree char_literal346_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:12: (p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:14: p+= ID '(' (p+= ID )* ')'
            {
            p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3434);  
            stream_ID.add(p);

            if (list_p==null) list_p=new ArrayList();
            list_p.add(p);

            char_literal345=(Token)match(input,116,FOLLOW_116_in_funct_call3436);  
            stream_116.add(char_literal345);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:25: (p+= ID )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==ID) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:25: p+= ID
            	    {
            	    p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3440);  
            	    stream_ID.add(p);

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p);


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            char_literal346=(Token)match(input,117,FOLLOW_117_in_funct_call3443);  
            stream_117.add(char_literal346);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:35: -> ^( CALL ( ID )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:38: ^( CALL ( ID )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:1: s_expr : condExpr ;
    public final BPELscriptParser.s_expr_return s_expr() throws RecognitionException {
        BPELscriptParser.s_expr_return retval = new BPELscriptParser.s_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.condExpr_return condExpr347 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:9: ( condExpr )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:11: condExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_s_expr3460);
            condExpr347=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr347.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:1: condExpr : aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? ;
    public final BPELscriptParser.condExpr_return condExpr() throws RecognitionException {
        BPELscriptParser.condExpr_return retval = new BPELscriptParser.condExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal349=null;
        Token string_literal350=null;
        Token char_literal351=null;
        Token char_literal352=null;
        Token string_literal353=null;
        Token string_literal354=null;
        BPELscriptParser.aexpr_return aexpr348 = null;

        BPELscriptParser.aexpr_return aexpr355 = null;


        CommonTree string_literal349_tree=null;
        CommonTree string_literal350_tree=null;
        CommonTree char_literal351_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree string_literal354_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:11: ( aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:13: aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr3468);
            aexpr348=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr348.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:19: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=169 && LA137_0<=174)) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
                    int alt136=6;
                    switch ( input.LA(1) ) {
                    case 169:
                        {
                        alt136=1;
                        }
                        break;
                    case 170:
                        {
                        alt136=2;
                        }
                        break;
                    case 171:
                        {
                        alt136=3;
                        }
                        break;
                    case 172:
                        {
                        alt136=4;
                        }
                        break;
                    case 173:
                        {
                        alt136=5;
                        }
                        break;
                    case 174:
                        {
                        alt136=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 136, 0, input);

                        throw nvae;
                    }

                    switch (alt136) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:22: '=='
                            {
                            string_literal349=(Token)match(input,169,FOLLOW_169_in_condExpr3473); 
                            string_literal349_tree = (CommonTree)adaptor.create(string_literal349);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal349_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:29: '!='
                            {
                            string_literal350=(Token)match(input,170,FOLLOW_170_in_condExpr3477); 
                            string_literal350_tree = (CommonTree)adaptor.create(string_literal350);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal350_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:36: '<'
                            {
                            char_literal351=(Token)match(input,171,FOLLOW_171_in_condExpr3481); 
                            char_literal351_tree = (CommonTree)adaptor.create(char_literal351);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal351_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:42: '>'
                            {
                            char_literal352=(Token)match(input,172,FOLLOW_172_in_condExpr3485); 
                            char_literal352_tree = (CommonTree)adaptor.create(char_literal352);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal352_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:48: '<='
                            {
                            string_literal353=(Token)match(input,173,FOLLOW_173_in_condExpr3489); 
                            string_literal353_tree = (CommonTree)adaptor.create(string_literal353);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal353_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:55: '>='
                            {
                            string_literal354=(Token)match(input,174,FOLLOW_174_in_condExpr3493); 
                            string_literal354_tree = (CommonTree)adaptor.create(string_literal354);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal354_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr3498);
                    aexpr355=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr355.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:1: aexpr : mexpr ( ( '+' | '-' ) mexpr )* ;
    public final BPELscriptParser.aexpr_return aexpr() throws RecognitionException {
        BPELscriptParser.aexpr_return retval = new BPELscriptParser.aexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set357=null;
        BPELscriptParser.mexpr_return mexpr356 = null;

        BPELscriptParser.mexpr_return mexpr358 = null;


        CommonTree set357_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:8: ( mexpr ( ( '+' | '-' ) mexpr )* )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:10: mexpr ( ( '+' | '-' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr3509);
            mexpr356=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr356.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:16: ( ( '+' | '-' ) mexpr )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( ((LA138_0>=175 && LA138_0<=176)) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:17: ( '+' | '-' ) mexpr
            	    {
            	    set357=(Token)input.LT(1);
            	    set357=(Token)input.LT(1);
            	    if ( (input.LA(1)>=175 && input.LA(1)<=176) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set357), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr3520);
            	    mexpr358=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr358.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:1: mexpr : ( atom ( ( '*' | '/' ) atom )* | STRING );
    public final BPELscriptParser.mexpr_return mexpr() throws RecognitionException {
        BPELscriptParser.mexpr_return retval = new BPELscriptParser.mexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set360=null;
        Token STRING362=null;
        BPELscriptParser.atom_return atom359 = null;

        BPELscriptParser.atom_return atom361 = null;


        CommonTree set360_tree=null;
        CommonTree STRING362_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:8: ( atom ( ( '*' | '/' ) atom )* | STRING )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==ID||LA140_0==INT||LA140_0==116) ) {
                alt140=1;
            }
            else if ( (LA140_0==STRING) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:10: atom ( ( '*' | '/' ) atom )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_mexpr3530);
                    atom359=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom359.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:15: ( ( '*' | '/' ) atom )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( ((LA139_0>=177 && LA139_0<=178)) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:16: ( '*' | '/' ) atom
                    	    {
                    	    set360=(Token)input.LT(1);
                    	    set360=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=177 && input.LA(1)<=178) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set360), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_atom_in_mexpr3541);
                    	    atom361=atom();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, atom361.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:344:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING362=(Token)match(input,STRING,FOLLOW_STRING_in_mexpr3547); 
                    STRING362_tree = (CommonTree)adaptor.create(STRING362);
                    adaptor.addChild(root_0, STRING362_tree);


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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:1: atom : ( path_expr | INT | '(' s_expr ')' -> s_expr );
    public final BPELscriptParser.atom_return atom() throws RecognitionException {
        BPELscriptParser.atom_return retval = new BPELscriptParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT364=null;
        Token char_literal365=null;
        Token char_literal367=null;
        BPELscriptParser.path_expr_return path_expr363 = null;

        BPELscriptParser.s_expr_return s_expr366 = null;


        CommonTree INT364_tree=null;
        CommonTree char_literal365_tree=null;
        CommonTree char_literal367_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_s_expr=new RewriteRuleSubtreeStream(adaptor,"rule s_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:7: ( path_expr | INT | '(' s_expr ')' -> s_expr )
            int alt141=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt141=1;
                }
                break;
            case INT:
                {
                alt141=2;
                }
                break;
            case 116:
                {
                alt141=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:9: path_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_path_expr_in_atom3555);
                    path_expr363=path_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, path_expr363.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:21: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT364=(Token)match(input,INT,FOLLOW_INT_in_atom3559); 
                    INT364_tree = (CommonTree)adaptor.create(INT364);
                    adaptor.addChild(root_0, INT364_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:27: '(' s_expr ')'
                    {
                    char_literal365=(Token)match(input,116,FOLLOW_116_in_atom3563);  
                    stream_116.add(char_literal365);

                    pushFollow(FOLLOW_s_expr_in_atom3565);
                    s_expr366=s_expr();

                    state._fsp--;

                    stream_s_expr.add(s_expr366.getTree());
                    char_literal367=(Token)match(input,117,FOLLOW_117_in_atom3567);  
                    stream_117.add(char_literal367);



                    // AST REWRITE
                    // elements: s_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 345:42: -> s_expr
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:1: path_expr : pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) ;
    public final BPELscriptParser.path_expr_return path_expr() throws RecognitionException {
        BPELscriptParser.path_expr_return retval = new BPELscriptParser.path_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal368=null;
        List list_pelmt=null;
        RuleReturnScope pelmt = null;
        CommonTree char_literal368_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:11: (pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:13: pelmt+= ns_id ( '.' pelmt+= ns_id )*
            {
            pushFollow(FOLLOW_ns_id_in_path_expr3580);
            pelmt=ns_id();

            state._fsp--;

            stream_ns_id.add(pelmt.getTree());
            if (list_pelmt==null) list_pelmt=new ArrayList();
            list_pelmt.add(pelmt);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:26: ( '.' pelmt+= ns_id )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==179) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:27: '.' pelmt+= ns_id
            	    {
            	    char_literal368=(Token)match(input,179,FOLLOW_179_in_path_expr3583);  
            	    stream_179.add(char_literal368);

            	    pushFollow(FOLLOW_ns_id_in_path_expr3587);
            	    pelmt=ns_id();

            	    state._fsp--;

            	    stream_ns_id.add(pelmt.getTree());
            	    if (list_pelmt==null) list_pelmt=new ArrayList();
            	    list_pelmt.add(pelmt);


            	    }
            	    break;

            	default :
            	    break loop142;
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
            // 346:46: -> ^( PATH ( $pelmt)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:49: ^( PATH ( $pelmt)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:1: ns_id : (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) ;
    public final BPELscriptParser.ns_id_return ns_id() throws RecognitionException {
        BPELscriptParser.ns_id_return retval = new BPELscriptParser.ns_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token pr=null;
        Token loc=null;
        Token string_literal369=null;

        CommonTree pr_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal369_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:8: ( (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:10: (pr= ID '::' )? loc= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:10: (pr= ID '::' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ID) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==163) ) {
                    alt143=1;
                }
            }
            switch (alt143) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:11: pr= ID '::'
                    {
                    pr=(Token)match(input,ID,FOLLOW_ID_in_ns_id3610);  
                    stream_ID.add(pr);

                    string_literal369=(Token)match(input,163,FOLLOW_163_in_ns_id3612);  
                    stream_163.add(string_literal369);


                    }
                    break;

            }

            loc=(Token)match(input,ID,FOLLOW_ID_in_ns_id3618);  
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
            // 347:31: -> ^( NS ( $pr)? $loc)
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:34: ^( NS ( $pr)? $loc)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NS, "NS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:347:39: ( $pr)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:1: portType : ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) ;
    public final BPELscriptParser.portType_return portType() throws RecognitionException {
        BPELscriptParser.portType_return retval = new BPELscriptParser.portType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal370=null;
        Token string_literal371=null;
        Token STRING372=null;

        CommonTree string_literal370_tree=null;
        CommonTree string_literal371_tree=null;
        CommonTree STRING372_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:11: ( ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:13: ( '@portType' | '@pt' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:13: ( '@portType' | '@pt' )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==180) ) {
                alt144=1;
            }
            else if ( (LA144_0==181) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:14: '@portType'
                    {
                    string_literal370=(Token)match(input,180,FOLLOW_180_in_portType3643);  
                    stream_180.add(string_literal370);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:28: '@pt'
                    {
                    string_literal371=(Token)match(input,181,FOLLOW_181_in_portType3647);  
                    stream_181.add(string_literal371);


                    }
                    break;

            }

            STRING372=(Token)match(input,STRING,FOLLOW_STRING_in_portType3650);  
            stream_STRING.add(STRING372);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 352:3: -> ^( PORTTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:352:6: ^( PORTTYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:1: std_attr : ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) ;
    public final BPELscriptParser.std_attr_return std_attr() throws RecognitionException {
        BPELscriptParser.std_attr_return retval = new BPELscriptParser.std_attr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal373=null;

        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal373_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:10: ( ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:12: ( '@name' name= STRING )? (suppressJoinFailure= SJF )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:12: ( '@name' name= STRING )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==182) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:13: '@name' name= STRING
                    {
                    string_literal373=(Token)match(input,182,FOLLOW_182_in_std_attr3670);  
                    stream_182.add(string_literal373);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_std_attr3674);  
                    stream_STRING.add(name);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:54: (suppressJoinFailure= SJF )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==SJF) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:54: suppressJoinFailure= SJF
                    {
                    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_std_attr3680);  
                    stream_SJF.add(suppressJoinFailure);


                    }
                    break;

            }



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
            // 355:3: -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:6: ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STD_ATTR, "STD_ATTR"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:24: ( $suppressJoinFailure)?
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:1: msgEx : ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) ;
    public final BPELscriptParser.msgEx_return msgEx() throws RecognitionException {
        BPELscriptParser.msgEx_return retval = new BPELscriptParser.msgEx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal374=null;
        Token string_literal375=null;
        Token STRING376=null;

        CommonTree string_literal374_tree=null;
        CommonTree string_literal375_tree=null;
        CommonTree STRING376_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:8: ( ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:10: ( '@messageExchange' | '@mex' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:10: ( '@messageExchange' | '@mex' )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==183) ) {
                alt147=1;
            }
            else if ( (LA147_0==184) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:11: '@messageExchange'
                    {
                    string_literal374=(Token)match(input,183,FOLLOW_183_in_msgEx3708);  
                    stream_183.add(string_literal374);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:357:32: '@mex'
                    {
                    string_literal375=(Token)match(input,184,FOLLOW_184_in_msgEx3712);  
                    stream_184.add(string_literal375);


                    }
                    break;

            }

            STRING376=(Token)match(input,STRING,FOLLOW_STRING_in_msgEx3715);  
            stream_STRING.add(STRING376);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 358:3: -> ^( MSGEX STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:6: ^( MSGEX STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:1: msgType : ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) ;
    public final BPELscriptParser.msgType_return msgType() throws RecognitionException {
        BPELscriptParser.msgType_return retval = new BPELscriptParser.msgType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token msgT=null;
        Token string_literal377=null;
        Token string_literal378=null;

        CommonTree msgT_tree=null;
        CommonTree string_literal377_tree=null;
        CommonTree string_literal378_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:10: ( ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:12: ( '@messageType' | '@msgType' ) msgT= STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:12: ( '@messageType' | '@msgType' )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==185) ) {
                alt148=1;
            }
            else if ( (LA148_0==186) ) {
                alt148=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:13: '@messageType'
                    {
                    string_literal377=(Token)match(input,185,FOLLOW_185_in_msgType3735);  
                    stream_185.add(string_literal377);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:30: '@msgType'
                    {
                    string_literal378=(Token)match(input,186,FOLLOW_186_in_msgType3739);  
                    stream_186.add(string_literal378);


                    }
                    break;

            }

            msgT=(Token)match(input,STRING,FOLLOW_STRING_in_msgType3744);  
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
            // 361:3: -> ^( MSGTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:6: ^( MSGTYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:1: viType : '@type' type= STRING -> ^( VITYPE STRING ) ;
    public final BPELscriptParser.viType_return viType() throws RecognitionException {
        BPELscriptParser.viType_return retval = new BPELscriptParser.viType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token string_literal379=null;

        CommonTree type_tree=null;
        CommonTree string_literal379_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:9: ( '@type' type= STRING -> ^( VITYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:11: '@type' type= STRING
            {
            string_literal379=(Token)match(input,187,FOLLOW_187_in_viType3764);  
            stream_187.add(string_literal379);

            type=(Token)match(input,STRING,FOLLOW_STRING_in_viType3768);  
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
            // 365:3: -> ^( VITYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:365:6: ^( VITYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:1: viElt : '@element' elt= STRING -> ^( VIELT STRING ) ;
    public final BPELscriptParser.viElt_return viElt() throws RecognitionException {
        BPELscriptParser.viElt_return retval = new BPELscriptParser.viElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token elt=null;
        Token string_literal380=null;

        CommonTree elt_tree=null;
        CommonTree string_literal380_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:8: ( '@element' elt= STRING -> ^( VIELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:10: '@element' elt= STRING
            {
            string_literal380=(Token)match(input,188,FOLLOW_188_in_viElt3788);  
            stream_188.add(string_literal380);

            elt=(Token)match(input,STRING,FOLLOW_STRING_in_viElt3792);  
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
            // 368:3: -> ^( VIELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:6: ^( VIELT STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:1: faultName : ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) ;
    public final BPELscriptParser.faultName_return faultName() throws RecognitionException {
        BPELscriptParser.faultName_return retval = new BPELscriptParser.faultName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal381=null;
        Token string_literal382=null;
        Token STRING383=null;

        CommonTree string_literal381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree STRING383_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:11: ( ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:13: ( '@faultName' | '@fault' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:13: ( '@faultName' | '@fault' )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==189) ) {
                alt149=1;
            }
            else if ( (LA149_0==190) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:14: '@faultName'
                    {
                    string_literal381=(Token)match(input,189,FOLLOW_189_in_faultName3811);  
                    stream_189.add(string_literal381);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:29: '@fault'
                    {
                    string_literal382=(Token)match(input,190,FOLLOW_190_in_faultName3815);  
                    stream_190.add(string_literal382);


                    }
                    break;

            }

            STRING383=(Token)match(input,STRING,FOLLOW_STRING_in_faultName3818);  
            stream_STRING.add(STRING383);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 371:3: -> ^( FAULTNAME STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:371:6: ^( FAULTNAME STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:373:1: faultElt : '@faultElement' STRING -> ^( FAULTELT STRING ) ;
    public final BPELscriptParser.faultElt_return faultElt() throws RecognitionException {
        BPELscriptParser.faultElt_return retval = new BPELscriptParser.faultElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal384=null;
        Token STRING385=null;

        CommonTree string_literal384_tree=null;
        CommonTree STRING385_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:373:10: ( '@faultElement' STRING -> ^( FAULTELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:373:12: '@faultElement' STRING
            {
            string_literal384=(Token)match(input,191,FOLLOW_191_in_faultElt3836);  
            stream_191.add(string_literal384);

            STRING385=(Token)match(input,STRING,FOLLOW_STRING_in_faultElt3838);  
            stream_STRING.add(STRING385);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 374:3: -> ^( FAULTELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:6: ^( FAULTELT STRING )
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

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA110 dfa110 = new DFA110(this);
    static final String DFA14_eotS =
        "\24\uffff";
    static final String DFA14_eofS =
        "\24\uffff";
    static final String DFA14_minS =
        "\1\121\1\120\1\124\2\uffff\1\121\11\uffff\1\121\1\120\2\124\1\121";
    static final String DFA14_maxS =
        "\1\u00be\1\120\1\u009f\2\uffff\1\u00be\11\uffff\1\u009f\1\120\1"+
        "\u0094\1\u009f\1\u0094";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\5\uffff";
    static final String DFA14_specialS =
        "\24\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\12\1\uffff\1\16\1\5\1\16\2\11\1\12\1\uffff\3\16\1\uffff"+
            "\1\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3\2\uffff"+
            "\1\7\1\10\1\uffff\1\11\3\uffff\1\14\3\uffff\1\12\6\uffff\14"+
            "\16\4\uffff\4\16\1\15\13\uffff\2\16\1\1\2\16\4\uffff\2\16",
            "\1\17",
            "\1\16\1\uffff\1\16\10\uffff\1\13\22\uffff\1\6\3\uffff\2\16"+
            "\1\uffff\1\4\5\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\7\uffff"+
            "\1\12\6\uffff\3\16\2\uffff\7\16",
            "",
            "",
            "\1\21\2\uffff\1\16\1\uffff\1\16\4\uffff\3\16\24\uffff\1\6\41"+
            "\uffff\1\16\41\uffff\1\20\2\16\4\uffff\2\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\1\16\1\uffff\1\16\10\uffff\1\13\22\uffff\1\6"+
            "\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3\2\uffff\1\7\1\10\1\uffff"+
            "\1\11\16\uffff\3\16\2\uffff\7\16",
            "\1\23",
            "\1\16\1\uffff\1\16\33\uffff\1\6\41\uffff\1\16",
            "\1\16\1\uffff\1\16\10\uffff\1\13\22\uffff\1\6\3\uffff\2\16"+
            "\1\uffff\1\4\5\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff"+
            "\3\16\2\uffff\7\16",
            "\1\21\2\uffff\1\16\1\uffff\1\16\33\uffff\1\6\41\uffff\1\16"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "101:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );";
        }
    }
    static final String DFA13_eotS =
        "\60\uffff";
    static final String DFA13_eofS =
        "\60\uffff";
    static final String DFA13_minS =
        "\1\121\3\120\1\124\1\uffff\1\121\2\120\1\uffff\2\120\16\uffff\2"+
        "\121\3\120\1\124\2\121\1\120\1\124\2\121\1\120\1\124\3\120\1\124"+
        "\4\121";
    static final String DFA13_maxS =
        "\1\u00be\3\120\1\u009f\1\uffff\1\u00be\2\120\1\uffff\2\120\16\uffff"+
        "\1\u00be\1\u009f\3\120\1\u0094\1\u00b6\1\u00b8\1\120\1\u0096\1\u00b6"+
        "\1\u0094\1\120\1\u0095\3\120\1\u0095\1\u0096\1\u0095\1\u00b6\1\u0095";
    static final String DFA13_acceptS =
        "\5\uffff\1\1\3\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\1\16\1\17\1\20\26\uffff";
    static final String DFA13_specialS =
        "\60\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\2\uffff\1\15\1\6\1\15\4\uffff\3\15\30\uffff\1\20\1\21\34"+
            "\uffff\1\11\1\14\1\5\3\16\1\17\1\26\1\22\1\24\1\27\1\31\4\uffff"+
            "\1\30\1\23\2\25\14\uffff\1\1\1\2\1\3\1\7\1\10\4\uffff\1\12\1"+
            "\13",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\15\1\uffff\1\15\37\uffff\1\20\1\21\34\uffff\1\11\1\14\1"+
            "\5\2\uffff\1\16\1\17\1\26\1\22\1\24\1\27\1\31",
            "",
            "\1\37\2\uffff\1\15\1\uffff\1\15\4\uffff\3\15\66\uffff\1\11"+
            "\41\uffff\1\36\1\34\1\35\4\uffff\2\15",
            "\1\40",
            "\1\40",
            "",
            "\1\41",
            "\1\41",
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
            "\1\43\2\uffff\1\15\1\6\1\15\4\uffff\3\15\66\uffff\1\11\1\14"+
            "\1\5\37\uffff\1\42\1\7\1\10\4\uffff\1\12\1\13",
            "\1\4\2\uffff\1\15\1\uffff\1\15\37\uffff\1\20\1\21\34\uffff"+
            "\1\11\1\14\1\5\2\uffff\1\16\1\17\1\26\1\22\1\24\1\27\1\31",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\15\1\uffff\1\15\75\uffff\1\11",
            "\1\47\2\uffff\1\15\1\uffff\1\15\75\uffff\1\11\1\14\40\uffff"+
            "\1\46",
            "\1\53\2\uffff\1\15\1\uffff\1\15\76\uffff\1\14\40\uffff\1\52"+
            "\1\50\1\51",
            "\1\54",
            "\1\15\1\uffff\1\15\75\uffff\1\11\1\14\1\5",
            "\1\37\2\uffff\1\15\1\uffff\1\15\75\uffff\1\11\41\uffff\1\36",
            "\1\37\2\uffff\1\15\1\uffff\1\15\75\uffff\1\11",
            "\1\55",
            "\1\15\1\uffff\1\15\75\uffff\1\11\1\14",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\15\1\uffff\1\15\76\uffff\1\14",
            "\1\43\2\uffff\1\15\1\uffff\1\15\75\uffff\1\11\1\14\1\5",
            "\1\47\2\uffff\1\15\1\uffff\1\15\75\uffff\1\11\1\14",
            "\1\53\2\uffff\1\15\1\uffff\1\15\76\uffff\1\14\40\uffff\1\52",
            "\1\53\2\uffff\1\15\1\uffff\1\15\76\uffff\1\14"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "106:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )";
        }
    }
    static final String DFA110_eotS =
        "\13\uffff";
    static final String DFA110_eofS =
        "\13\uffff";
    static final String DFA110_minS =
        "\1\60\2\120\1\uffff\1\120\1\u0094\3\uffff\2\121";
    static final String DFA110_maxS =
        "\1\u00b8\2\120\1\uffff\1\120\1\u0096\3\uffff\1\u00b8\1\u0096";
    static final String DFA110_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\1\4\2\uffff";
    static final String DFA110_specialS =
        "\13\uffff}>";
    static final String[] DFA110_transitionS = {
            "\1\7\37\uffff\1\7\1\5\2\uffff\1\7\1\3\1\10\15\uffff\1\7\17\uffff"+
            "\1\7\37\uffff\1\3\1\uffff\1\6\35\uffff\1\1\1\2\1\4\2\3",
            "\1\11",
            "\1\11",
            "",
            "\1\12",
            "\1\3\1\uffff\1\6",
            "",
            "",
            "",
            "\1\5\3\uffff\1\3\76\uffff\1\3\1\uffff\1\6\37\uffff\1\4\2\3",
            "\1\5\102\uffff\1\3\1\uffff\1\6"
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "256:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program318 = new BitSet(new long[]{0x0000000000000002L,0x0000380100060000L,0x0800000300000000L});
    public static final BitSet FOLLOW_process_in_declaration337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_process370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_process374 = new BitSet(new long[]{0x0000000000000000L,0x0000300000060000L});
    public static final BitSet FOLLOW_108_in_process381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_process385 = new BitSet(new long[]{0x0000000000000000L,0x0000200000060000L});
    public static final BitSet FOLLOW_SJF_in_process394 = new BitSet(new long[]{0x0000000000000000L,0x0000200000040000L});
    public static final BitSet FOLLOW_EOSF_in_process401 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_process406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ns_id_in_process408 = new BitSet(new long[]{0x0000000000000000L,0x3000400000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_std_attr_in_process410 = new BitSet(new long[]{0x0000000000000000L,0x3000400000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ajoin_in_process416 = new BitSet(new long[]{0x0000000000000000L,0x3000400000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_asignal_in_process421 = new BitSet(new long[]{0x0000000000000000L,0x3000400000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_block_in_process427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_eventHdl_in_process429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_proc_stmts479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts481 = new BitSet(new long[]{0x0000000000000000L,0x82C40000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts485 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_signal_in_proc_stmts490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts492 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_proc_stmt531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_receive_in_proc_stmt577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_reply_in_proc_stmt581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_assign_in_proc_stmt585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_exit_in_proc_stmt605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_variables_in_proc_stmt611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_validate_in_proc_stmt615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_partner_links_in_proc_stmt619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_nop_in_proc_stmt627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_messages_in_proc_stmt631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_opaque_in_proc_stmt635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmt638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_block649 = new BitSet(new long[]{0x0000000000000000L,0xC2C40000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_proc_stmts_in_block651 = new BitSet(new long[]{0x0000000000000000L,0xC2C48000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_111_in_block654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_scope_block672 = new BitSet(new long[]{0x0000000000000000L,0xC2C4B801BBF60000L,0x69F001F3FFF0222CL});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block674 = new BitSet(new long[]{0x0000000000000000L,0xC2C4B801BBF60000L,0x69F001F3FFF0222CL});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block677 = new BitSet(new long[]{0x0000000000000000L,0xC2C48000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_111_in_scope_block680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_param_block700 = new BitSet(new long[]{0x0000000000000000L,0xC2C58000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_112_in_param_block703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_param_block707 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_param_block710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_param_block714 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_param_block718 = new BitSet(new long[]{0x0000000000000000L,0xC2C58000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_proc_stmts_in_param_block722 = new BitSet(new long[]{0x0000000000000000L,0xC2C58000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_111_in_param_block725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick760 = new BitSet(new long[]{0x0000000000000000L,0x0004000000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_std_attr_in_pick763 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_pick767 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_pick769 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x01B0000000000000L});
    public static final BitSet FOLLOW_onMessage_in_pick771 = new BitSet(new long[]{0x0000000000000000L,0x31C8C00000020000L,0x01F0000000000000L});
    public static final BitSet FOLLOW_onAlarm_in_pick774 = new BitSet(new long[]{0x0000000000000000L,0x31C0C00000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_111_in_pick777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onMessage812 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_msgEx_in_onMessage815 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_onMessage820 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_onMessage822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_onMessage826 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_onMessage832 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage835 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onMessage837 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onMessage841 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_ex_in_onMessage843 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_param_block_in_onMessage856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_onAlarm921 = new BitSet(new long[]{0x0000000000000000L,0x31C0C00000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_timeout_in_onAlarm925 = new BitSet(new long[]{0x0000000000000000L,0x31C0C00000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm929 = new BitSet(new long[]{0x0000000000000000L,0x31C0C00000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_alarm969 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_alarm974 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_alarm976 = new BitSet(new long[]{0x0001000000000000L,0x0030001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_alarm979 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_alarm983 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_alarm987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_timeout1016 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_timeout1021 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_timeout1023 = new BitSet(new long[]{0x0001000000000000L,0x0030001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_timeout1026 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_timeout1030 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_timeout1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_repeatEvery1062 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_repeatEvery1064 = new BitSet(new long[]{0x0001000000000000L,0x0030001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1067 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_repeatEvery1071 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_repeatEvery1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_flow1098 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_flow1102 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_flow1106 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_flow1110 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_flow1114 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_123_in_signal1141 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_signal1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_signal1144 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_signal1147 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_signal1150 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_signal1154 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_signal1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_asignal1181 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_asignal1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_asignal1184 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_asignal1187 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_asignal1190 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_asignal1194 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_asignal1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ajoin1222 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ajoin1224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_ajoin1228 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_ajoin1235 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1240 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_ajoin1243 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_ajoin1247 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ajoin1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_join1277 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_join1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_join1283 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_join1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_join1290 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_join1295 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_join1298 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_join1302 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_join1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1332 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_if_ex1336 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_if_ex1338 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1343 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1347 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1350 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_if_ex1354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_128_in_if_ex1360 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_if_ex1362 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1367 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1371 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1374 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_if_ex1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_129_in_if_ex1386 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_if_ex1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_sequence1452 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_ajoin_in_sequence1458 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_asignal_in_sequence1463 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_body_in_sequence1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ajoin_in_scope_sequence1502 = new BitSet(new long[]{0x0000000000000000L,0xF3C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_asignal_in_scope_sequence1507 = new BitSet(new long[]{0x0000000000000000L,0xF3C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_while_ex1546 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_while_ex1548 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_while_ex1551 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_while_ex1553 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_while_ex1556 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_while_ex1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_until_ex1589 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_sequence_in_until_ex1593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_until_ex1595 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_until_ex1597 = new BitSet(new long[]{0x0001000000000000L,0x0030001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_until_ex1600 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_until_ex1602 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_until_ex1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000001020000L,0x0040000000000020L});
    public static final BitSet FOLLOW_SBO_in_foreach1638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0040000000000020L});
    public static final BitSet FOLLOW_std_attr_in_foreach1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_foreach1648 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_foreach1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_foreach1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_foreach1656 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_foreach1669 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1671 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1677 = new BitSet(new long[]{0x0000000000000000L,0x0020000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1683 = new BitSet(new long[]{0x0000000000000000L,0x0020000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_foreach1688 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1690 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1696 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach1700 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_foreach1705 = new BitSet(new long[]{0x0000000000000000L,0xF3C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_scope_short_in_foreach1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_try_ex1778 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_body_in_try_ex1780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000001C00L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex1782 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000001C00L});
    public static final BitSet FOLLOW_catchAll_in_try_ex1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_catch_ex1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_catch_ex1826 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_catch_ex1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000038720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex1830 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_catch_ex1833 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_param_block_in_catch_ex1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_catchAll1865 = new BitSet(new long[]{0x0000000000000000L,0x3000400000020000L,0x0040000000000000L});
    public static final BitSet FOLLOW_block_in_catchAll1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L,0x0000000000002000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_scope_ex1897 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_116_in_scope_ex1900 = new BitSet(new long[]{0x0000000000000000L,0x0020000000100000L});
    public static final BitSet FOLLOW_ID_in_scope_ex1902 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_scope_ex1905 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex1909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000002C000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short1947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000002C000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt1968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_termination_in_scope_stmt1971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_termination2001 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_body_in_termination2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_eventHdl2021 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_eventHdl2023 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x77F001F0FFF1222CL});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2025 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x77F001F0FFF1222CL});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2028 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_111_in_eventHdl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onEvent2056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x1780000000010000L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x1600000000010000L});
    public static final BitSet FOLLOW_msgType_in_onEvent2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000010000L});
    public static final BitSet FOLLOW_viElt_in_onEvent2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_onEvent2085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_onEvent2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_onEvent2092 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_onEvent2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_onEvent2098 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_onEvent2104 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2107 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onEvent2109 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onEvent2113 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x61F001F0FFF4222CL});
    public static final BitSet FOLLOW_with_ex_in_onEvent2115 = new BitSet(new long[]{0x0000000000000000L,0xF3D5C000BBF60000L,0x61F001F0FFF4222CL});
    public static final BitSet FOLLOW_scope_short_in_onEvent2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_compensation2169 = new BitSet(new long[]{0x0000000000000000L,0xF2C5C000BBF60000L,0x61F001F0FFF0222CL});
    public static final BitSet FOLLOW_body_in_compensation2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_with_ex2190 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_with_ex2192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2196 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_with_ex2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2203 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_117_in_with_ex2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_with_map2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_with_map2235 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_KEY_in_with_map2237 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_path_expr_in_with_map2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_receive2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000220000L,0x01C0000000100000L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x01C0000000100000L});
    public static final BitSet FOLLOW_msgEx_in_receive2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0040000000100000L});
    public static final BitSet FOLLOW_std_attr_in_receive2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_receive2284 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_receive2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_receive2290 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_receive2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_receive2296 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_receive2299 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_receive2301 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_receive2305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_ex_in_receive2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_reply2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x61C0000000200000L});
    public static final BitSet FOLLOW_faultName_in_reply2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x01C0000000200000L});
    public static final BitSet FOLLOW_msgEx_in_reply2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0040000000200000L});
    public static final BitSet FOLLOW_std_attr_in_reply2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_reply2361 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_reply2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_reply2367 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_reply2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_reply2373 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_reply2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_reply2380 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_reply2385 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_reply2387 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_reply2391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_ex_in_reply2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_invoke2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0040000000400000L});
    public static final BitSet FOLLOW_std_attr_in_invoke2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_invoke2443 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_invoke2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_invoke2449 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_invoke2455 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_invoke2462 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2467 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_invoke2469 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_invoke2473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_with_ex_in_invoke2475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_compensation_in_invoke2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_assign2520 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2523 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_VALID_in_assign2526 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2529 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_assign2532 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_faultName_in_assign2535 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_msgEx_in_assign2538 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_std_attr_in_assign2541 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_assign2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_path_expr_in_assign2553 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PROP_in_assign2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_assign2559 = new BitSet(new long[]{0x0001000000000000L,0x0010001038730000L,0x61F0000000500000L});
    public static final BitSet FOLLOW_rvalue_in_assign2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_rvalue2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue2624 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_rvalue2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_throw_ex2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_152_in_throw_ex2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_throw_ex2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0040000002000000L});
    public static final BitSet FOLLOW_std_attr_in_throw_ex2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_throw_ex2662 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_throw_ex2664 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex2666 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_throw_ex2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex2693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_rethrow_ex2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_compensate2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_compensate2718 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_compensate2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_compensate2725 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_compensate2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_exit2752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_exit2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_validate2774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_validate2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_validate2784 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_validate2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_validate2791 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_std_attr_in_ext_act2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_nop2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_nop2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_opaque2868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_opaque2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_namespace2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_namespace2894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_namespace2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_namespace2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_namespace2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUSTUND_in_extension2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_extension2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_extension2929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_extension2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_extension2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_extension2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_viType_in_imports2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_imports2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_imports2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_imports2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_ID_in_imports2978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_163_in_imports2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_imports2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_imports2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_messages3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_message_in_messages3027 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_messages3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_message_in_messages3034 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_message3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_variables3072 = new BitSet(new long[]{0x0000000000000000L,0x0000380100160000L,0x1E00000300000000L});
    public static final BitSet FOLLOW_variable_in_variables3076 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_variables3079 = new BitSet(new long[]{0x0000000000000000L,0x0000380100160000L,0x1E00000300000000L});
    public static final BitSet FOLLOW_variable_in_variables3083 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_msgType_in_variable3107 = new BitSet(new long[]{0x0000000000000000L,0x0000380100160000L,0x1800000300000000L});
    public static final BitSet FOLLOW_viType_in_variable3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x1000000000000000L});
    public static final BitSet FOLLOW_viElt_in_variable3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_variable3118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_ex_in_variable3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_partner_links3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_167_in_partner_links3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links3163 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_partner_links3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links3170 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_partner_link3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_partner_link3194 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_partner_link3196 = new BitSet(new long[]{0x0000000000000000L,0x002200003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3200 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3204 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3208 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3213 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3217 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3222 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partner_link3226 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_partner_link3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_correlation3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00100000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3268 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_113_in_correlation3271 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00100000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3273 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_111_in_correlation3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping3297 = new BitSet(new long[]{0x0000000000000000L,0x0000000800100000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_corr_mapping3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_corr_sets3339 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_corr_sets3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3346 = new BitSet(new long[]{0x0000000000000000L,0x0000800000100000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3353 = new BitSet(new long[]{0x0000000000000000L,0x0000800000100000L});
    public static final BitSet FOLLOW_111_in_corr_sets3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_corr_set3377 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_corr_set3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_corr_set3383 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_113_in_corr_set3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_corr_set3390 = new BitSet(new long[]{0x0000000000000000L,0x0022000000000000L});
    public static final BitSet FOLLOW_117_in_corr_set3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_expr_in_expr3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funct_call3434 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_funct_call3436 = new BitSet(new long[]{0x0000000000000000L,0x0020000000100000L});
    public static final BitSet FOLLOW_ID_in_funct_call3440 = new BitSet(new long[]{0x0000000000000000L,0x0020000000100000L});
    public static final BitSet FOLLOW_117_in_funct_call3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_s_expr3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00007E0000000000L});
    public static final BitSet FOLLOW_169_in_condExpr3473 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_170_in_condExpr3477 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_171_in_condExpr3481 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_172_in_condExpr3485 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_173_in_condExpr3489 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_174_in_condExpr3493 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_set_in_aexpr3512 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_set_in_mexpr3533 = new BitSet(new long[]{0x0000000000000000L,0x0010001038720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_STRING_in_mexpr3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_atom3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_atom3563 = new BitSet(new long[]{0x0000000000000000L,0x0010001038730000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_s_expr_in_atom3565 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_atom3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_179_in_path_expr3583 = new BitSet(new long[]{0x0000000000000000L,0x000000003C720000L,0x61F0000000000000L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ID_in_ns_id3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_163_in_ns_id3612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_ns_id3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_portType3643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_181_in_portType3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_portType3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_std_attr3670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_std_attr3674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SJF_in_std_attr3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_msgEx3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_184_in_msgEx3712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_msgEx3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_msgType3735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_186_in_msgType3739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_msgType3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_viType3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_viType3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_viElt3788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_viElt3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_faultName3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_190_in_faultName3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_faultName3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_faultElt3836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_faultElt3838 = new BitSet(new long[]{0x0000000000000002L});

}