// $ANTLR 3.1b2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g 2009-02-08 13:32:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "OPAQUE", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "STRING", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'@queryLanguage'", "'@expressionLanguage'", "'process'", "'{'", "'}'", "'|'", "','", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'opaque()'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@name'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=98;
    public static final int NOP=44;
    public static final int T__160=160;
    public static final int PARTNERLINKS=64;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int EVENTHDL=69;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int IMPORT=56;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int FLOWS=9;
    public static final int VALID=88;
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
    public static final int PID=62;
    public static final int RETHROW=45;
    public static final int KEY=87;
    public static final int MESSAGES=57;
    public static final int ELSE=12;
    public static final int INT=97;
    public static final int WAIT=22;
    public static final int SJF=79;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int CREATE_INST=83;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=103;
    public static final int T__129=129;
    public static final int SBO=85;
    public static final int CALL=50;
    public static final int EOSF=80;
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
    public static final int ONALARM=67;
    public static final int EXT_EXPR=48;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int SIGNAL=40;
    public static final int T__111=111;
    public static final int STD_ATTR=66;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int MESSAGE=70;
    public static final int T__112=112;
    public static final int BLOCK_PARAM=39;
    public static final int ISOLATED=86;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=90;
    public static final int MSGTYPE=74;
    public static final int FAULTELT=77;
    public static final int SEMI=81;
    public static final int VALIDATE=38;
    public static final int TERMINATION=71;
    public static final int CORRSETS=58;
    public static final int INITPARTNER=94;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=101;
    public static final int RECEIVE=18;
    public static final int EXTENSION=54;
    public static final int STRING=78;
    public static final int MSGEX=72;
    public static final int WHILE=13;
    public static final int OPAQUE=46;
    public static final int FAULTNAME=73;
    public static final int REPEATEVERY=68;
    public static final int INIT_COR=95;
    public static final int CATCH_ALL=27;
    public static final int PICK=6;
    public static final int PATH=53;
    public static final int EXTENSIONACT=55;
    public static final int ONMESSAGE=31;
    public static final int EXIT=23;
    public static final int NS=52;
    public static final int CORRELATION=34;
    public static final int PORTTYPE=65;
    public static final int CORR_MAP=35;
    public static final int VIELT=76;
    public static final int TRY=25;
    public static final int NAMESPACE=51;
    public static final int SEQUENCE=7;
    public static final int VITYPE=75;
    public static final int PATTERN_COR=96;
    public static final int SL_COMMENTS=102;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int UNTIL=14;
    public static final int CORRSET=59;
    public static final int REPLY=19;
    public static final int EXT_ACT=92;
    public static final int CATCH=26;
    public static final int THROW=21;
    public static final int KEEPSRC=89;
    public static final int PARALLEL=84;
    public static final int FOR=15;
    public static final int ALARM=30;
    public static final int ID=82;
    public static final int PROP=91;
    public static final int IF=10;
    public static final int EXPR=47;
    public static final int SCOPE=28;
    public static final int DIGIT=99;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int MUSTUND=93;
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
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int MAP=43;
    public static final int ESCAPE_SEQ=100;
    public static final int ASSIGN=20;
    public static final int VARIABLES=63;
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

                if ( ((LA1_0>=SJF && LA1_0<=EOSF)||LA1_0==MUSTUND||(LA1_0>=104 && LA1_0<=106)||(LA1_0>=157 && LA1_0<=158)||LA1_0==184) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program312);
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

            if ( ((LA2_0>=SJF && LA2_0<=EOSF)||(LA2_0>=104 && LA2_0<=106)) ) {
                alt2=1;
            }
            else if ( (LA2_0==MUSTUND||(LA2_0>=157 && LA2_0<=158)||LA2_0==184) ) {
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

                    pushFollow(FOLLOW_process_in_declaration331);
                    process2=process();

                    state._fsp--;

                    adaptor.addChild(root_0, process2.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:25: sub_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sub_declaration_in_declaration335);
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
            case 157:
                {
                alt3=1;
                }
                break;
            case MUSTUND:
            case 158:
                {
                alt3=2;
                }
                break;
            case 184:
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

                    pushFollow(FOLLOW_namespace_in_sub_declaration345);
                    namespace4=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace4.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:17: extension
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_extension_in_sub_declaration349);
                    extension5=extension();

                    state._fsp--;

                    adaptor.addChild(root_0, extension5.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:29: imports
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_imports_in_sub_declaration353);
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
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
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

            if ( (LA4_0==104) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:5: '@queryLanguage' queryLg= STRING
                    {
                    string_literal7=(Token)match(input,104,FOLLOW_104_in_process364);  
                    stream_104.add(string_literal7);

                    queryLg=(Token)match(input,STRING,FOLLOW_STRING_in_process368);  
                    stream_STRING.add(queryLg);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:3: ( '@expressionLanguage' exprLg= STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==105) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:4: '@expressionLanguage' exprLg= STRING
                    {
                    string_literal8=(Token)match(input,105,FOLLOW_105_in_process375);  
                    stream_105.add(string_literal8);

                    exprLg=(Token)match(input,STRING,FOLLOW_STRING_in_process379);  
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
                    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_process388);  
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
                    exitOnStandardFault=(Token)match(input,EOSF,FOLLOW_EOSF_in_process395);  
                    stream_EOSF.add(exitOnStandardFault);


                    }
                    break;

            }

            string_literal9=(Token)match(input,106,FOLLOW_106_in_process400);  
            stream_106.add(string_literal9);

            pushFollow(FOLLOW_ns_id_in_process402);
            ns_id10=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id10.getTree());
            pushFollow(FOLLOW_std_attr_in_process404);
            std_attr11=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr11.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:4: (j+= ajoin )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==122) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_process410);
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

                if ( (LA9_0==121) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_process415);
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

            pushFollow(FOLLOW_block_in_process421);
            block12=block();

            state._fsp--;

            stream_block.add(block12.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:9: ( eventHdl )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==140) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:9: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process423);
                    eventHdl13=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl13.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: sjf, asignal, eventHdl, ns_id, ajoin, queryLg, block, std_attr, exprLg, exitOnStandardFault
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

            if ( (LA11_0==123) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:5: join SEMI
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts473);
                    join14=join();

                    state._fsp--;

                    stream_join.add(join14.getTree());
                    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts475);  
                    stream_SEMI.add(SEMI15);


                    }
                    break;

            }

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts479);
            proc_stmt16=proc_stmt();

            state._fsp--;

            stream_proc_stmt.add(proc_stmt16.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:27: (s+= signal SEMI )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==120) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:28: s+= signal SEMI
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts484);
            	    s=signal();

            	    state._fsp--;

            	    stream_signal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);

            	    SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts486);  
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

                    pushFollow(FOLLOW_if_ex_in_proc_stmt517);
                    if_ex18=if_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, if_ex18.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:11: flow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flow_in_proc_stmt521);
                    flow19=flow();

                    state._fsp--;

                    adaptor.addChild(root_0, flow19.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:18: pick
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pick_in_proc_stmt525);
                    pick20=pick();

                    state._fsp--;

                    adaptor.addChild(root_0, pick20.getTree());

                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:25: while_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_ex_in_proc_stmt529);
                    while_ex21=while_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, while_ex21.getTree());

                    }
                    break;
                case 5 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:36: until_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_until_ex_in_proc_stmt533);
                    until_ex22=until_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, until_ex22.getTree());

                    }
                    break;
                case 6 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:47: foreach
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_in_proc_stmt537);
                    foreach23=foreach();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach23.getTree());

                    }
                    break;
                case 7 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:57: scope_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scope_ex_in_proc_stmt541);
                    scope_ex24=scope_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, scope_ex24.getTree());

                    }
                    break;
                case 8 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:68: ext_act
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ext_act_in_proc_stmt545);
                    ext_act25=ext_act();

                    state._fsp--;

                    adaptor.addChild(root_0, ext_act25.getTree());

                    }
                    break;
                case 9 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:5: try_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_ex_in_proc_stmt552);
                    try_ex26=try_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, try_ex26.getTree());

                    }
                    break;
                case 10 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:14: corr_sets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_corr_sets_in_proc_stmt556);
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
                            pushFollow(FOLLOW_invoke_in_proc_stmt567);
                            invoke28=invoke();

                            state._fsp--;

                            adaptor.addChild(root_0, invoke28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:16: receive
                            {
                            pushFollow(FOLLOW_receive_in_proc_stmt571);
                            receive29=receive();

                            state._fsp--;

                            adaptor.addChild(root_0, receive29.getTree());

                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:26: reply
                            {
                            pushFollow(FOLLOW_reply_in_proc_stmt575);
                            reply30=reply();

                            state._fsp--;

                            adaptor.addChild(root_0, reply30.getTree());

                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:34: assign
                            {
                            pushFollow(FOLLOW_assign_in_proc_stmt579);
                            assign31=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign31.getTree());

                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:43: throw_ex
                            {
                            pushFollow(FOLLOW_throw_ex_in_proc_stmt583);
                            throw_ex32=throw_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, throw_ex32.getTree());

                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:54: rethrow_ex
                            {
                            pushFollow(FOLLOW_rethrow_ex_in_proc_stmt587);
                            rethrow_ex33=rethrow_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, rethrow_ex33.getTree());

                            }
                            break;
                        case 7 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:67: alarm
                            {
                            pushFollow(FOLLOW_alarm_in_proc_stmt591);
                            alarm34=alarm();

                            state._fsp--;

                            adaptor.addChild(root_0, alarm34.getTree());

                            }
                            break;
                        case 8 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:75: timeout
                            {
                            pushFollow(FOLLOW_timeout_in_proc_stmt595);
                            timeout35=timeout();

                            state._fsp--;

                            adaptor.addChild(root_0, timeout35.getTree());

                            }
                            break;
                        case 9 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:85: exit
                            {
                            pushFollow(FOLLOW_exit_in_proc_stmt599);
                            exit36=exit();

                            state._fsp--;

                            adaptor.addChild(root_0, exit36.getTree());

                            }
                            break;
                        case 10 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:5: variables
                            {
                            pushFollow(FOLLOW_variables_in_proc_stmt605);
                            variables37=variables();

                            state._fsp--;

                            adaptor.addChild(root_0, variables37.getTree());

                            }
                            break;
                        case 11 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:17: validate
                            {
                            pushFollow(FOLLOW_validate_in_proc_stmt609);
                            validate38=validate();

                            state._fsp--;

                            adaptor.addChild(root_0, validate38.getTree());

                            }
                            break;
                        case 12 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:28: partner_links
                            {
                            pushFollow(FOLLOW_partner_links_in_proc_stmt613);
                            partner_links39=partner_links();

                            state._fsp--;

                            adaptor.addChild(root_0, partner_links39.getTree());

                            }
                            break;
                        case 13 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:44: compensate
                            {
                            pushFollow(FOLLOW_compensate_in_proc_stmt617);
                            compensate40=compensate();

                            state._fsp--;

                            adaptor.addChild(root_0, compensate40.getTree());

                            }
                            break;
                        case 14 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:57: nop
                            {
                            pushFollow(FOLLOW_nop_in_proc_stmt621);
                            nop41=nop();

                            state._fsp--;

                            adaptor.addChild(root_0, nop41.getTree());

                            }
                            break;
                        case 15 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:63: messages
                            {
                            pushFollow(FOLLOW_messages_in_proc_stmt625);
                            messages42=messages();

                            state._fsp--;

                            adaptor.addChild(root_0, messages42.getTree());

                            }
                            break;
                        case 16 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:74: opaque
                            {
                            pushFollow(FOLLOW_opaque_in_proc_stmt629);
                            opaque43=opaque();

                            state._fsp--;

                            adaptor.addChild(root_0, opaque43.getTree());

                            }
                            break;

                    }

                    SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmt632); 

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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:8: ( '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:10: '{' ( proc_stmts )+ '}'
            {
            char_literal45=(Token)match(input,107,FOLLOW_107_in_block643);  
            stream_107.add(char_literal45);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: ( proc_stmts )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=SJF && LA15_0<=EOSF)||(LA15_0>=ID && LA15_0<=ISOLATED)||(LA15_0>=VALID && LA15_0<=IGNORE)||LA15_0==EXT_ACT||LA15_0==107||LA15_0==111||(LA15_0>=115 && LA15_0<=116)||LA15_0==118||(LA15_0>=121 && LA15_0<=124)||(LA15_0>=127 && LA15_0<=128)||LA15_0==130||LA15_0==134||LA15_0==138||(LA15_0>=145 && LA15_0<=156)||(LA15_0>=161 && LA15_0<=165)||(LA15_0>=177 && LA15_0<=181)||(LA15_0>=186 && LA15_0<=187)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block645);
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

            char_literal47=(Token)match(input,108,FOLLOW_108_in_block648);  
            stream_108.add(char_literal47);



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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_sub_declaration=new RewriteRuleSubtreeStream(adaptor,"rule sub_declaration");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:13: ( '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:15: '{' ( sub_declaration )* ( proc_stmts )+ '}'
            {
            char_literal48=(Token)match(input,107,FOLLOW_107_in_scope_block666);  
            stream_107.add(char_literal48);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:19: ( sub_declaration )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MUSTUND||(LA16_0>=157 && LA16_0<=158)||LA16_0==184) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:19: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block668);
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

                if ( ((LA17_0>=SJF && LA17_0<=EOSF)||(LA17_0>=ID && LA17_0<=ISOLATED)||(LA17_0>=VALID && LA17_0<=IGNORE)||LA17_0==EXT_ACT||LA17_0==107||LA17_0==111||(LA17_0>=115 && LA17_0<=116)||LA17_0==118||(LA17_0>=121 && LA17_0<=124)||(LA17_0>=127 && LA17_0<=128)||LA17_0==130||LA17_0==134||LA17_0==138||(LA17_0>=145 && LA17_0<=156)||(LA17_0>=161 && LA17_0<=165)||(LA17_0>=177 && LA17_0<=181)||(LA17_0>=186 && LA17_0<=187)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:36: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block671);
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

            char_literal51=(Token)match(input,108,FOLLOW_108_in_scope_block674);  
            stream_108.add(char_literal51);



            // AST REWRITE
            // elements: proc_stmts, sub_declaration
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
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:13: ( '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:15: '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}'
            {
            char_literal52=(Token)match(input,107,FOLLOW_107_in_param_block694);  
            stream_107.add(char_literal52);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:19: ( '|' in+= ID ( ',' in+= ID )* '|' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==109) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:20: '|' in+= ID ( ',' in+= ID )* '|'
                    {
                    char_literal53=(Token)match(input,109,FOLLOW_109_in_param_block697);  
                    stream_109.add(char_literal53);

                    in=(Token)match(input,ID,FOLLOW_ID_in_param_block701);  
                    stream_ID.add(in);

                    if (list_in==null) list_in=new ArrayList();
                    list_in.add(in);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:31: ( ',' in+= ID )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==110) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:32: ',' in+= ID
                    	    {
                    	    char_literal54=(Token)match(input,110,FOLLOW_110_in_param_block704);  
                    	    stream_110.add(char_literal54);

                    	    in=(Token)match(input,ID,FOLLOW_ID_in_param_block708);  
                    	    stream_ID.add(in);

                    	    if (list_in==null) list_in=new ArrayList();
                    	    list_in.add(in);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    char_literal55=(Token)match(input,109,FOLLOW_109_in_param_block712);  
                    stream_109.add(char_literal55);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:51: ( proc_stmts )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=SJF && LA20_0<=EOSF)||(LA20_0>=ID && LA20_0<=ISOLATED)||(LA20_0>=VALID && LA20_0<=IGNORE)||LA20_0==EXT_ACT||LA20_0==107||LA20_0==111||(LA20_0>=115 && LA20_0<=116)||LA20_0==118||(LA20_0>=121 && LA20_0<=124)||(LA20_0>=127 && LA20_0<=128)||LA20_0==130||LA20_0==134||LA20_0==138||(LA20_0>=145 && LA20_0<=156)||(LA20_0>=161 && LA20_0<=165)||(LA20_0>=177 && LA20_0<=181)||(LA20_0>=186 && LA20_0<=187)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:113:51: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block716);
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

            char_literal57=(Token)match(input,108,FOLLOW_108_in_param_block719);  
            stream_108.add(char_literal57);



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

            if ( (LA21_0==107) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=SJF && LA21_0<=EOSF)||(LA21_0>=ID && LA21_0<=ISOLATED)||(LA21_0>=VALID && LA21_0<=IGNORE)||LA21_0==EXT_ACT||LA21_0==111||(LA21_0>=115 && LA21_0<=116)||LA21_0==118||(LA21_0>=123 && LA21_0<=124)||(LA21_0>=127 && LA21_0<=128)||LA21_0==130||LA21_0==134||LA21_0==138||(LA21_0>=145 && LA21_0<=156)||(LA21_0>=161 && LA21_0<=165)||(LA21_0>=177 && LA21_0<=181)||(LA21_0>=186 && LA21_0<=187)) ) {
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

                    pushFollow(FOLLOW_block_in_body741);
                    block58=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block58.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:17: proc_stmts
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proc_stmts_in_body745);
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
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
                    CREATE_INST60=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick754);  
                    stream_CREATE_INST.add(CREATE_INST60);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_pick757);
            std_attr61=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr61.getTree());
            string_literal62=(Token)match(input,111,FOLLOW_111_in_pick761);  
            stream_111.add(string_literal62);

            char_literal63=(Token)match(input,107,FOLLOW_107_in_pick763);  
            stream_107.add(char_literal63);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:14: ( onMessage )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==112||(LA23_0>=177 && LA23_0<=178)||(LA23_0>=180 && LA23_0<=181)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:14: onMessage
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick765);
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

                if ( (LA24_0==SJF||LA24_0==107||(LA24_0>=115 && LA24_0<=117)||(LA24_0>=121 && LA24_0<=122)||LA24_0==179) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:25: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick768);
            	    onAlarm65=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm65.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal66=(Token)match(input,108,FOLLOW_108_in_pick771);  
            stream_108.add(char_literal66);



            // AST REWRITE
            // elements: onAlarm, std_attr, CREATE_INST, onMessage
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
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
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

            if ( ((LA25_0>=177 && LA25_0<=178)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage806);
                    portType67=portType();

                    state._fsp--;

                    stream_portType.add(portType67.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:22: ( msgEx )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=180 && LA26_0<=181)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:122:22: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage809);
                    msgEx68=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx68.getTree());

                    }
                    break;

            }

            string_literal69=(Token)match(input,112,FOLLOW_112_in_onMessage814);  
            stream_112.add(string_literal69);

            char_literal70=(Token)match(input,113,FOLLOW_113_in_onMessage816);  
            stream_113.add(char_literal70);

            p=(Token)match(input,ID,FOLLOW_ID_in_onMessage820);  
            stream_ID.add(p);

            char_literal71=(Token)match(input,110,FOLLOW_110_in_onMessage822);  
            stream_110.add(char_literal71);

            o=(Token)match(input,ID,FOLLOW_ID_in_onMessage826);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:33: ( ',' correlation )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==110) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:34: ',' correlation
                    {
                    char_literal72=(Token)match(input,110,FOLLOW_110_in_onMessage829);  
                    stream_110.add(char_literal72);

                    pushFollow(FOLLOW_correlation_in_onMessage831);
                    correlation73=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation73.getTree());

                    }
                    break;

            }

            char_literal74=(Token)match(input,114,FOLLOW_114_in_onMessage835);  
            stream_114.add(char_literal74);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:56: ( with_ex )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==143) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:56: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage837);
                    with_ex75=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex75.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_onMessage850);
            param_block76=param_block();

            state._fsp--;

            stream_param_block.add(param_block76.getTree());


            // AST REWRITE
            // elements: param_block, ID, msgEx, with_ex, correlation, ID, portType
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
                case 179:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==STRING) ) {
                        switch ( input.LA(3) ) {
                            case SJF:
                                {
                                int LA29_2 = input.LA(4);

                                if ( (LA29_2==116) ) {
                                    alt29=2;
                                }
                                else if ( (LA29_2==115) ) {
                                    alt29=1;
                                }
                                }
                                break;
                            case 115:
                                {
                                alt29=1;
                                }
                                break;
                            case 116:
                                {
                                alt29=2;
                                }
                                break;
                        }

                    }
                    }
                    break;
                case SJF:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==116) ) {
                        alt29=2;
                    }
                    else if ( (LA29_2==115) ) {
                        alt29=1;
                    }
                    }
                    break;
                case 115:
                    {
                    alt29=1;
                    }
                    break;
                case 116:
                    {
                    alt29=2;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:4: alarm
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm915);
                    alarm77=alarm();

                    state._fsp--;

                    stream_alarm.add(alarm77.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:12: timeout
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm919);
                    timeout78=timeout();

                    state._fsp--;

                    stream_timeout.add(timeout78.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:22: ( repeatEvery )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==117) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:131:22: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm923);
                    repeatEvery79=repeatEvery();

                    state._fsp--;

                    stream_repeatEvery.add(repeatEvery79.getTree());

                    }
                    break;

            }

            if ( !(input.LT(1).getText().equals("{")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"{\")");
            }
            pushFollow(FOLLOW_scope_short_in_onAlarm928);
            scope_short80=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short80.getTree());


            // AST REWRITE
            // elements: alarm, scope_short, timeout, repeatEvery
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:1: alarm : std_attr 'alarm' '(' expr ')' -> ^( ALARM expr ( std_attr )? ) ;
    public final BPELscriptParser.alarm_return alarm() throws RecognitionException {
        BPELscriptParser.alarm_return retval = new BPELscriptParser.alarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        BPELscriptParser.std_attr_return std_attr81 = null;

        BPELscriptParser.expr_return expr84 = null;


        CommonTree string_literal82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:8: ( std_attr 'alarm' '(' expr ')' -> ^( ALARM expr ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:134:10: std_attr 'alarm' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_alarm963);
            std_attr81=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr81.getTree());
            string_literal82=(Token)match(input,115,FOLLOW_115_in_alarm968);  
            stream_115.add(string_literal82);

            char_literal83=(Token)match(input,113,FOLLOW_113_in_alarm970);  
            stream_113.add(char_literal83);

            pushFollow(FOLLOW_expr_in_alarm972);
            expr84=expr();

            state._fsp--;

            stream_expr.add(expr84.getTree());
            char_literal85=(Token)match(input,114,FOLLOW_114_in_alarm974);  
            stream_114.add(char_literal85);



            // AST REWRITE
            // elements: std_attr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:3: -> ^( ALARM expr ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:7: ^( ALARM expr ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALARM, "ALARM"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:136:21: ( std_attr )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:1: timeout : std_attr 'timeout' '(' expr ')' -> ^( TIMEOUT expr ( std_attr )? ) ;
    public final BPELscriptParser.timeout_return timeout() throws RecognitionException {
        BPELscriptParser.timeout_return retval = new BPELscriptParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        BPELscriptParser.std_attr_return std_attr86 = null;

        BPELscriptParser.expr_return expr89 = null;


        CommonTree string_literal87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:9: ( std_attr 'timeout' '(' expr ')' -> ^( TIMEOUT expr ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:11: std_attr 'timeout' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_timeout999);
            std_attr86=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr86.getTree());
            string_literal87=(Token)match(input,116,FOLLOW_116_in_timeout1004);  
            stream_116.add(string_literal87);

            char_literal88=(Token)match(input,113,FOLLOW_113_in_timeout1006);  
            stream_113.add(char_literal88);

            pushFollow(FOLLOW_expr_in_timeout1007);
            expr89=expr();

            state._fsp--;

            stream_expr.add(expr89.getTree());
            char_literal90=(Token)match(input,114,FOLLOW_114_in_timeout1009);  
            stream_114.add(char_literal90);



            // AST REWRITE
            // elements: std_attr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:3: -> ^( TIMEOUT expr ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:6: ^( TIMEOUT expr ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMEOUT, "TIMEOUT"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:140:21: ( std_attr )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:1: repeatEvery : 'repeatEvery' '(' expr ')' -> ^( REPEATEVERY expr ) ;
    public final BPELscriptParser.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptParser.repeatEvery_return retval = new BPELscriptParser.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        BPELscriptParser.expr_return expr93 = null;


        CommonTree string_literal91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:2: ( 'repeatEvery' '(' expr ')' -> ^( REPEATEVERY expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:4: 'repeatEvery' '(' expr ')'
            {
            string_literal91=(Token)match(input,117,FOLLOW_117_in_repeatEvery1033);  
            stream_117.add(string_literal91);

            char_literal92=(Token)match(input,113,FOLLOW_113_in_repeatEvery1035);  
            stream_113.add(char_literal92);

            pushFollow(FOLLOW_expr_in_repeatEvery1037);
            expr93=expr();

            state._fsp--;

            stream_expr.add(expr93.getTree());
            char_literal94=(Token)match(input,114,FOLLOW_114_in_repeatEvery1039);  
            stream_114.add(char_literal94);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:2: -> ^( REPEATEVERY expr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:144:5: ^( REPEATEVERY expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATEVERY, "REPEATEVERY"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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

        Token string_literal96=null;
        Token string_literal97=null;
        List list_s=null;
        BPELscriptParser.std_attr_return std_attr95 = null;

        RuleReturnScope s = null;
        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:146:7: ( std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:146:9: std_attr 'parallel' s+= sequence ( 'and' s+= sequence )*
            {
            pushFollow(FOLLOW_std_attr_in_flow1058);
            std_attr95=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr95.getTree());
            string_literal96=(Token)match(input,118,FOLLOW_118_in_flow1062);  
            stream_118.add(string_literal96);

            pushFollow(FOLLOW_sequence_in_flow1066);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            if (list_s==null) list_s=new ArrayList();
            list_s.add(s);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:147:26: ( 'and' s+= sequence )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==119) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:147:28: 'and' s+= sequence
            	    {
            	    string_literal97=(Token)match(input,119,FOLLOW_119_in_flow1070);  
            	    stream_119.add(string_literal97);

            	    pushFollow(FOLLOW_sequence_in_flow1074);
            	    s=sequence();

            	    state._fsp--;

            	    stream_sequence.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:1: signal : 'signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) ;
    public final BPELscriptParser.signal_return signal() throws RecognitionException {
        BPELscriptParser.signal_return retval = new BPELscriptParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal98=null;
        Token char_literal99=null;
        Token ID100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        BPELscriptParser.expr_return expr102 = null;


        CommonTree string_literal98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree ID100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:9: ( 'signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:11: 'signal' '(' ID ( ',' expr )? ')'
            {
            string_literal98=(Token)match(input,120,FOLLOW_120_in_signal1101);  
            stream_120.add(string_literal98);

            char_literal99=(Token)match(input,113,FOLLOW_113_in_signal1103);  
            stream_113.add(char_literal99);

            ID100=(Token)match(input,ID,FOLLOW_ID_in_signal1104);  
            stream_ID.add(ID100);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:26: ( ',' expr )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==110) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:27: ',' expr
                    {
                    char_literal101=(Token)match(input,110,FOLLOW_110_in_signal1107);  
                    stream_110.add(char_literal101);

                    pushFollow(FOLLOW_expr_in_signal1109);
                    expr102=expr();

                    state._fsp--;

                    stream_expr.add(expr102.getTree());

                    }
                    break;

            }

            char_literal103=(Token)match(input,114,FOLLOW_114_in_signal1113);  
            stream_114.add(char_literal103);



            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:42: -> ^( SIGNAL ID ( expr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:45: ^( SIGNAL ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:150:57: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:1: asignal : '@signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) ;
    public final BPELscriptParser.asignal_return asignal() throws RecognitionException {
        BPELscriptParser.asignal_return retval = new BPELscriptParser.asignal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal104=null;
        Token char_literal105=null;
        Token ID106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        BPELscriptParser.expr_return expr108 = null;


        CommonTree string_literal104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree ID106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:9: ( '@signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:11: '@signal' '(' ID ( ',' expr )? ')'
            {
            string_literal104=(Token)match(input,121,FOLLOW_121_in_asignal1132);  
            stream_121.add(string_literal104);

            char_literal105=(Token)match(input,113,FOLLOW_113_in_asignal1134);  
            stream_113.add(char_literal105);

            ID106=(Token)match(input,ID,FOLLOW_ID_in_asignal1135);  
            stream_ID.add(ID106);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:27: ( ',' expr )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==110) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:28: ',' expr
                    {
                    char_literal107=(Token)match(input,110,FOLLOW_110_in_asignal1138);  
                    stream_110.add(char_literal107);

                    pushFollow(FOLLOW_expr_in_asignal1140);
                    expr108=expr();

                    state._fsp--;

                    stream_expr.add(expr108.getTree());

                    }
                    break;

            }

            char_literal109=(Token)match(input,114,FOLLOW_114_in_asignal1144);  
            stream_114.add(char_literal109);



            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:43: -> ^( SIGNAL ID ( expr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:46: ^( SIGNAL ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:58: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:1: ajoin : '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) ;
    public final BPELscriptParser.ajoin_return ajoin() throws RecognitionException {
        BPELscriptParser.ajoin_return retval = new BPELscriptParser.ajoin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr114 = null;


        CommonTree string_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:8: ( '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:10: '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')'
            {
            string_literal110=(Token)match(input,122,FOLLOW_122_in_ajoin1164);  
            stream_122.add(string_literal110);

            char_literal111=(Token)match(input,113,FOLLOW_113_in_ajoin1166);  
            stream_113.add(char_literal111);

            k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1170);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:28: ( ',' k+= ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==110) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:29: ',' k+= ID
            	    {
            	    char_literal112=(Token)match(input,110,FOLLOW_110_in_ajoin1173);  
            	    stream_110.add(char_literal112);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1177);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:41: ( ',' expr )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==110) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:42: ',' expr
                    {
                    char_literal113=(Token)match(input,110,FOLLOW_110_in_ajoin1182);  
                    stream_110.add(char_literal113);

                    pushFollow(FOLLOW_expr_in_ajoin1184);
                    expr114=expr();

                    state._fsp--;

                    stream_expr.add(expr114.getTree());

                    }
                    break;

            }

            char_literal115=(Token)match(input,114,FOLLOW_114_in_ajoin1188);  
            stream_114.add(char_literal115);



            // AST REWRITE
            // elements: k, expr
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 154:57: -> ^( JOIN ( $k)+ ( expr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:60: ^( JOIN ( $k)+ ( expr )? )
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
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:154:71: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:1: join : 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) ;
    public final BPELscriptParser.join_return join() throws RecognitionException {
        BPELscriptParser.join_return retval = new BPELscriptParser.join_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr120 = null;


        CommonTree string_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:7: ( 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:9: 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')'
            {
            string_literal116=(Token)match(input,123,FOLLOW_123_in_join1210);  
            stream_123.add(string_literal116);

            char_literal117=(Token)match(input,113,FOLLOW_113_in_join1212);  
            stream_113.add(char_literal117);

            k=(Token)match(input,ID,FOLLOW_ID_in_join1216);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:26: ( ',' k+= ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==110) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==ID) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:27: ',' k+= ID
            	    {
            	    char_literal118=(Token)match(input,110,FOLLOW_110_in_join1219);  
            	    stream_110.add(char_literal118);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_join1223);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:39: ( ',' expr )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==110) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:40: ',' expr
                    {
                    char_literal119=(Token)match(input,110,FOLLOW_110_in_join1228);  
                    stream_110.add(char_literal119);

                    pushFollow(FOLLOW_expr_in_join1230);
                    expr120=expr();

                    state._fsp--;

                    stream_expr.add(expr120.getTree());

                    }
                    break;

            }

            char_literal121=(Token)match(input,114,FOLLOW_114_in_join1234);  
            stream_114.add(char_literal121);



            // AST REWRITE
            // elements: expr, k
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:55: -> ^( JOIN ( $k)+ ( expr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:58: ^( JOIN ( $k)+ ( expr )? )
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
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:156:69: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:158:1: if_ex : std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr ) ;
    public final BPELscriptParser.if_ex_return if_ex() throws RecognitionException {
        BPELscriptParser.if_ex_return retval = new BPELscriptParser.if_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token string_literal126=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token string_literal129=null;
        List list_eiex=null;
        List list_sei=null;
        BPELscriptParser.expr_return iex = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.sequence_return se = null;

        BPELscriptParser.std_attr_return std_attr122 = null;

        RuleReturnScope eiex = null;
        RuleReturnScope sei = null;
        CommonTree string_literal123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:2: ( std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:4: std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )?
            {
            pushFollow(FOLLOW_std_attr_in_if_ex1256);
            std_attr122=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr122.getTree());
            string_literal123=(Token)match(input,124,FOLLOW_124_in_if_ex1260);  
            stream_124.add(string_literal123);

            char_literal124=(Token)match(input,113,FOLLOW_113_in_if_ex1262);  
            stream_113.add(char_literal124);

            pushFollow(FOLLOW_expr_in_if_ex1266);
            iex=expr();

            state._fsp--;

            stream_expr.add(iex.getTree());
            char_literal125=(Token)match(input,114,FOLLOW_114_in_if_ex1268);  
            stream_114.add(char_literal125);

            pushFollow(FOLLOW_sequence_in_if_ex1272);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:36: ( 'elseif' '(' eiex+= expr ')' sei+= sequence )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==125) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:37: 'elseif' '(' eiex+= expr ')' sei+= sequence
            	    {
            	    string_literal126=(Token)match(input,125,FOLLOW_125_in_if_ex1275);  
            	    stream_125.add(string_literal126);

            	    char_literal127=(Token)match(input,113,FOLLOW_113_in_if_ex1277);  
            	    stream_113.add(char_literal127);

            	    pushFollow(FOLLOW_expr_in_if_ex1281);
            	    eiex=expr();

            	    state._fsp--;

            	    stream_expr.add(eiex.getTree());
            	    if (list_eiex==null) list_eiex=new ArrayList();
            	    list_eiex.add(eiex);

            	    char_literal128=(Token)match(input,114,FOLLOW_114_in_if_ex1283);  
            	    stream_114.add(char_literal128);

            	    pushFollow(FOLLOW_sequence_in_if_ex1287);
            	    sei=sequence();

            	    state._fsp--;

            	    stream_sequence.add(sei.getTree());
            	    if (list_sei==null) list_sei=new ArrayList();
            	    list_sei.add(sei);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:81: ( 'else' se= sequence )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==126) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:160:82: 'else' se= sequence
                    {
                    string_literal129=(Token)match(input,126,FOLLOW_126_in_if_ex1292);  
                    stream_126.add(string_literal129);

                    pushFollow(FOLLOW_sequence_in_if_ex1296);
                    se=sequence();

                    state._fsp--;

                    stream_sequence.add(se.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: s, std_attr, se, eiex, iex, sei
            // token labels: 
            // rule labels: retval, iex, s, se
            // token list labels: 
            // rule list labels: sei, eiex
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_iex=new RewriteRuleSubtreeStream(adaptor,"token iex",iex!=null?iex.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"token se",se!=null?se.tree:null);
            RewriteRuleSubtreeStream stream_sei=new RewriteRuleSubtreeStream(adaptor,"token sei",list_sei);
            RewriteRuleSubtreeStream stream_eiex=new RewriteRuleSubtreeStream(adaptor,"token eiex",list_eiex);
            root_0 = (CommonTree)adaptor.nil();
            // 161:2: -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:6: ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_iex.nextTree());
                adaptor.addChild(root_1, stream_s.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:19: ( ^( ELSIF $eiex $sei) )*
                while ( stream_eiex.hasNext()||stream_sei.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:20: ^( ELSIF $eiex $sei)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSIF, "ELSIF"), root_2);

                    adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_eiex.nextTree()).getTree());
                    adaptor.addChild(root_2, ((ParserRuleReturnScope)stream_sei.nextTree()).getTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_eiex.reset();
                stream_sei.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:42: ( ^( ELSE $se) )?
                if ( stream_se.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:43: ^( ELSE $se)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:1: sequence : std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) ;
    public final BPELscriptParser.sequence_return sequence() throws RecognitionException {
        BPELscriptParser.sequence_return retval = new BPELscriptParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.body_return b = null;

        BPELscriptParser.std_attr_return std_attr130 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:2: ( std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:4: std_attr (j+= ajoin )? (s+= asignal )* b= body
            {
            pushFollow(FOLLOW_std_attr_in_sequence1347);
            std_attr130=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr130.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:4: (j+= ajoin )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==122) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_sequence1353);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:14: (s+= asignal )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==121) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_sequence1358);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            pushFollow(FOLLOW_body_in_sequence1366);
            b=body();

            state._fsp--;

            stream_body.add(b.getTree());


            // AST REWRITE
            // elements: j, std_attr, b, s
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
            // 167:2: -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:5: ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:23: ( $s)*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:1: scope_sequence : (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) ;
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:2: ( (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:4: (j+= ajoin )? (s+= asignal )* b= scope_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:5: (j+= ajoin )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==122) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:5: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_scope_sequence1397);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:15: (s+= asignal )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==121) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:170:15: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_scope_sequence1402);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            pushFollow(FOLLOW_scope_block_in_scope_sequence1410);
            b=scope_block();

            state._fsp--;

            stream_scope_block.add(b.getTree());


            // AST REWRITE
            // elements: s, j, b
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
            // 172:2: -> ^( SEQUENCE ( $j)? $b ( $s)* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:5: ^( SEQUENCE ( $j)? $b ( $s)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:23: ( $s)*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:1: while_ex : std_attr 'while' '(' expr ')' s= sequence -> ^( WHILE expr sequence std_attr ) ;
    public final BPELscriptParser.while_ex_return while_ex() throws RecognitionException {
        BPELscriptParser.while_ex_return retval = new BPELscriptParser.while_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr131 = null;

        BPELscriptParser.expr_return expr134 = null;


        CommonTree string_literal132_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:10: ( std_attr 'while' '(' expr ')' s= sequence -> ^( WHILE expr sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:174:12: std_attr 'while' '(' expr ')' s= sequence
            {
            pushFollow(FOLLOW_std_attr_in_while_ex1436);
            std_attr131=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr131.getTree());
            string_literal132=(Token)match(input,127,FOLLOW_127_in_while_ex1441);  
            stream_127.add(string_literal132);

            char_literal133=(Token)match(input,113,FOLLOW_113_in_while_ex1443);  
            stream_113.add(char_literal133);

            pushFollow(FOLLOW_expr_in_while_ex1445);
            expr134=expr();

            state._fsp--;

            stream_expr.add(expr134.getTree());
            char_literal135=(Token)match(input,114,FOLLOW_114_in_while_ex1447);  
            stream_114.add(char_literal135);

            pushFollow(FOLLOW_sequence_in_while_ex1451);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());


            // AST REWRITE
            // elements: expr, sequence, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:36: -> ^( WHILE expr sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:39: ^( WHILE expr sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:1: until_ex : std_attr 'repeat' s= sequence 'until' '(' expr ')' -> ^( UNTIL expr sequence std_attr ) ;
    public final BPELscriptParser.until_ex_return until_ex() throws RecognitionException {
        BPELscriptParser.until_ex_return retval = new BPELscriptParser.until_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal137=null;
        Token string_literal138=null;
        Token char_literal139=null;
        Token char_literal141=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr136 = null;

        BPELscriptParser.expr_return expr140 = null;


        CommonTree string_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:10: ( std_attr 'repeat' s= sequence 'until' '(' expr ')' -> ^( UNTIL expr sequence std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:177:12: std_attr 'repeat' s= sequence 'until' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_until_ex1471);
            std_attr136=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr136.getTree());
            string_literal137=(Token)match(input,128,FOLLOW_128_in_until_ex1476);  
            stream_128.add(string_literal137);

            pushFollow(FOLLOW_sequence_in_until_ex1480);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            string_literal138=(Token)match(input,129,FOLLOW_129_in_until_ex1482);  
            stream_129.add(string_literal138);

            char_literal139=(Token)match(input,113,FOLLOW_113_in_until_ex1484);  
            stream_113.add(char_literal139);

            pushFollow(FOLLOW_expr_in_until_ex1486);
            expr140=expr();

            state._fsp--;

            stream_expr.add(expr140.getTree());
            char_literal141=(Token)match(input,114,FOLLOW_114_in_until_ex1488);  
            stream_114.add(char_literal141);



            // AST REWRITE
            // elements: sequence, expr, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 178:45: -> ^( UNTIL expr sequence std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:48: ^( UNTIL expr sequence std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNTIL, "UNTIL"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:1: foreach : ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr ) ;
    public final BPELscriptParser.foreach_return foreach() throws RecognitionException {
        BPELscriptParser.foreach_return retval = new BPELscriptParser.foreach_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token successfulBranchesOnly=null;
        Token cName=null;
        Token PARALLEL142=null;
        Token string_literal144=null;
        Token char_literal145=null;
        Token char_literal146=null;
        Token string_literal147=null;
        Token SEMI148=null;
        Token string_literal149=null;
        Token SEMI150=null;
        Token char_literal151=null;
        List list_complete=null;
        BPELscriptParser.expr_return init = null;

        BPELscriptParser.expr_return cond = null;

        BPELscriptParser.std_attr_return std_attr143 = null;

        BPELscriptParser.scope_short_return scope_short152 = null;

        RuleReturnScope complete = null;
        CommonTree successfulBranchesOnly_tree=null;
        CommonTree cName_tree=null;
        CommonTree PARALLEL142_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree char_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        CommonTree SEMI148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree SEMI150_tree=null;
        CommonTree char_literal151_tree=null;
        RewriteRuleTokenStream stream_PARALLEL=new RewriteRuleTokenStream(adaptor,"token PARALLEL");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:2: ( ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:4: ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:4: ( PARALLEL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PARALLEL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:181:4: PARALLEL
                    {
                    PARALLEL142=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1509);  
                    stream_PARALLEL.add(PARALLEL142);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:25: (successfulBranchesOnly= SBO )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SBO) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:25: successfulBranchesOnly= SBO
                    {
                    successfulBranchesOnly=(Token)match(input,SBO,FOLLOW_SBO_in_foreach1516);  
                    stream_SBO.add(successfulBranchesOnly);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_foreach1522);
            std_attr143=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr143.getTree());
            string_literal144=(Token)match(input,130,FOLLOW_130_in_foreach1526);  
            stream_130.add(string_literal144);

            char_literal145=(Token)match(input,113,FOLLOW_113_in_foreach1528);  
            stream_113.add(char_literal145);

            cName=(Token)match(input,ID,FOLLOW_ID_in_foreach1532);  
            stream_ID.add(cName);

            char_literal146=(Token)match(input,131,FOLLOW_131_in_foreach1534);  
            stream_131.add(char_literal146);

            pushFollow(FOLLOW_expr_in_foreach1538);
            init=expr();

            state._fsp--;

            stream_expr.add(init.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:36: ( 'to' | SEMI )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==132) ) {
                alt46=1;
            }
            else if ( (LA46_0==SEMI) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:37: 'to'
                    {
                    string_literal147=(Token)match(input,132,FOLLOW_132_in_foreach1541);  
                    stream_132.add(string_literal147);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:42: SEMI
                    {
                    SEMI148=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1543);  
                    stream_SEMI.add(SEMI148);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_foreach1548);
            cond=expr();

            state._fsp--;

            stream_expr.add(cond.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:58: ( ( 'finish' | SEMI ) complete+= expr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==SEMI||LA48_0==133) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:59: ( 'finish' | SEMI ) complete+= expr
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:59: ( 'finish' | SEMI )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==133) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==SEMI) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:60: 'finish'
                            {
                            string_literal149=(Token)match(input,133,FOLLOW_133_in_foreach1552);  
                            stream_133.add(string_literal149);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:184:69: SEMI
                            {
                            SEMI150=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1554);  
                            stream_SEMI.add(SEMI150);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_foreach1559);
                    complete=expr();

                    state._fsp--;

                    stream_expr.add(complete.getTree());
                    if (list_complete==null) list_complete=new ArrayList();
                    list_complete.add(complete);


                    }
                    break;

            }

            char_literal151=(Token)match(input,114,FOLLOW_114_in_foreach1563);  
            stream_114.add(char_literal151);

            pushFollow(FOLLOW_scope_short_in_foreach1565);
            scope_short152=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short152.getTree());


            // AST REWRITE
            // elements: SBO, init, std_attr, complete, PARALLEL, cName, scope_short, cond
            // token labels: cName
            // rule labels: retval, init, cond
            // token list labels: 
            // rule list labels: complete
            retval.tree = root_0;
            RewriteRuleTokenStream stream_cName=new RewriteRuleTokenStream(adaptor,"token cName",cName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"token init",init!=null?init.tree:null);
            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"token cond",cond!=null?cond.tree:null);
            RewriteRuleSubtreeStream stream_complete=new RewriteRuleSubtreeStream(adaptor,"token complete",list_complete);
            root_0 = (CommonTree)adaptor.nil();
            // 185:2: -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:185:6: ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_cName.nextNode());
                adaptor.addChild(root_1, stream_init.nextTree());
                adaptor.addChild(root_1, stream_cond.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:185:31: ( $complete)?
                if ( stream_complete.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_complete.nextTree()).getTree());

                }
                stream_complete.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:185:54: ( PARALLEL )?
                if ( stream_PARALLEL.hasNext() ) {
                    adaptor.addChild(root_1, stream_PARALLEL.nextNode());

                }
                stream_PARALLEL.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:185:64: ( SBO )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:1: try_ex : 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) ;
    public final BPELscriptParser.try_ex_return try_ex() throws RecognitionException {
        BPELscriptParser.try_ex_return retval = new BPELscriptParser.try_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal153=null;
        BPELscriptParser.body_return body154 = null;

        BPELscriptParser.catch_ex_return catch_ex155 = null;

        BPELscriptParser.catchAll_return catchAll156 = null;


        CommonTree string_literal153_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_catchAll=new RewriteRuleSubtreeStream(adaptor,"rule catchAll");
        RewriteRuleSubtreeStream stream_catch_ex=new RewriteRuleSubtreeStream(adaptor,"rule catch_ex");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:9: ( 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:11: 'try' body ( catch_ex )* ( catchAll )?
            {
            string_literal153=(Token)match(input,134,FOLLOW_134_in_try_ex1605);  
            stream_134.add(string_literal153);

            pushFollow(FOLLOW_body_in_try_ex1607);
            body154=body();

            state._fsp--;

            stream_body.add(body154.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:22: ( catch_ex )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case 135:
                    {
                    alt49=1;
                    }
                    break;
                case 188:
                    {
                    alt49=1;
                    }
                    break;
                case 136:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:22: catch_ex
            	    {
            	    pushFollow(FOLLOW_catch_ex_in_try_ex1609);
            	    catch_ex155=catch_ex();

            	    state._fsp--;

            	    stream_catch_ex.add(catch_ex155.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:32: ( catchAll )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==137) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:32: catchAll
                    {
                    pushFollow(FOLLOW_catchAll_in_try_ex1612);
                    catchAll156=catchAll();

                    state._fsp--;

                    stream_catchAll.add(catchAll156.getTree());

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
            // 187:41: -> ^( TRY ( catch_ex )* ( body )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:44: ^( TRY ( catch_ex )* ( body )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:50: ( catch_ex )*
                while ( stream_catch_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_ex.nextTree());

                }
                stream_catch_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:60: ( body )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:189:1: catch_ex : ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) ;
    public final BPELscriptParser.catch_ex_return catch_ex() throws RecognitionException {
        BPELscriptParser.catch_ex_return retval = new BPELscriptParser.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fMT=null;
        Token string_literal157=null;
        Token string_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        BPELscriptParser.faultElt_return faultElt158 = null;

        BPELscriptParser.ns_id_return ns_id161 = null;

        BPELscriptParser.param_block_return param_block163 = null;


        CommonTree fMT_tree=null;
        CommonTree string_literal157_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree char_literal162_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_faultElt=new RewriteRuleSubtreeStream(adaptor,"rule faultElt");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:2: ( ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==135) ) {
                alt51=1;
            }
            else if ( (LA51_0==188) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:5: ( '@faultMessageType' fMT= STRING )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:5: ( '@faultMessageType' fMT= STRING )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:6: '@faultMessageType' fMT= STRING
                    {
                    string_literal157=(Token)match(input,135,FOLLOW_135_in_catch_ex1637);  
                    stream_135.add(string_literal157);

                    fMT=(Token)match(input,STRING,FOLLOW_STRING_in_catch_ex1641);  
                    stream_STRING.add(fMT);


                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:41: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex1647);
                    faultElt158=faultElt();

                    state._fsp--;

                    stream_faultElt.add(faultElt158.getTree());

                    }
                    break;

            }

            string_literal159=(Token)match(input,136,FOLLOW_136_in_catch_ex1653);  
            stream_136.add(string_literal159);

            char_literal160=(Token)match(input,113,FOLLOW_113_in_catch_ex1655);  
            stream_113.add(char_literal160);

            pushFollow(FOLLOW_ns_id_in_catch_ex1657);
            ns_id161=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id161.getTree());
            char_literal162=(Token)match(input,114,FOLLOW_114_in_catch_ex1660);  
            stream_114.add(char_literal162);

            pushFollow(FOLLOW_param_block_in_catch_ex1662);
            param_block163=param_block();

            state._fsp--;

            stream_param_block.add(param_block163.getTree());


            // AST REWRITE
            // elements: param_block, ns_id, faultElt, fMT
            // token labels: fMT
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fMT=new RewriteRuleTokenStream(adaptor,"token fMT",fMT);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:2: -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:6: ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:32: ( $fMT)?
                if ( stream_fMT.hasNext() ) {
                    adaptor.addChild(root_1, stream_fMT.nextNode());

                }
                stream_fMT.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:38: ( faultElt )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:1: catchAll : 'catchAll' block -> ^( CATCH block ) ;
    public final BPELscriptParser.catchAll_return catchAll() throws RecognitionException {
        BPELscriptParser.catchAll_return retval = new BPELscriptParser.catchAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal164=null;
        BPELscriptParser.block_return block165 = null;


        CommonTree string_literal164_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:2: ( 'catchAll' block -> ^( CATCH block ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:4: 'catchAll' block
            {
            string_literal164=(Token)match(input,137,FOLLOW_137_in_catchAll1692);  
            stream_137.add(string_literal164);

            pushFollow(FOLLOW_block_in_catchAll1694);
            block165=block();

            state._fsp--;

            stream_block.add(block165.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:2: -> ^( CATCH block )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:196:6: ^( CATCH block )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:1: scope_ex : ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) ;
    public final BPELscriptParser.scope_ex_return scope_ex() throws RecognitionException {
        BPELscriptParser.scope_ex_return retval = new BPELscriptParser.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ISOLATED166=null;
        Token EOSF167=null;
        Token SJF168=null;
        Token string_literal169=null;
        Token char_literal170=null;
        Token ID171=null;
        Token char_literal172=null;
        BPELscriptParser.scope_sequence_return scope_sequence173 = null;

        BPELscriptParser.scope_stmt_return scope_stmt174 = null;


        CommonTree ISOLATED166_tree=null;
        CommonTree EOSF167_tree=null;
        CommonTree SJF168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree ID171_tree=null;
        CommonTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_ISOLATED=new RewriteRuleTokenStream(adaptor,"token ISOLATED");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:2: ( ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:4: ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:4: ( ISOLATED )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ISOLATED) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:4: ISOLATED
                    {
                    ISOLATED166=(Token)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex1713);  
                    stream_ISOLATED.add(ISOLATED166);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:14: ( EOSF )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EOSF) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:14: EOSF
                    {
                    EOSF167=(Token)match(input,EOSF,FOLLOW_EOSF_in_scope_ex1716);  
                    stream_EOSF.add(EOSF167);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:20: ( SJF )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SJF) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:20: SJF
                    {
                    SJF168=(Token)match(input,SJF,FOLLOW_SJF_in_scope_ex1719);  
                    stream_SJF.add(SJF168);


                    }
                    break;

            }

            string_literal169=(Token)match(input,138,FOLLOW_138_in_scope_ex1724);  
            stream_138.add(string_literal169);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:200:11: ( '(' ( ID )? ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==113) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:200:12: '(' ( ID )? ')'
                    {
                    char_literal170=(Token)match(input,113,FOLLOW_113_in_scope_ex1727);  
                    stream_113.add(char_literal170);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:200:16: ( ID )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==ID) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:200:16: ID
                            {
                            ID171=(Token)match(input,ID,FOLLOW_ID_in_scope_ex1729);  
                            stream_ID.add(ID171);


                            }
                            break;

                    }

                    char_literal172=(Token)match(input,114,FOLLOW_114_in_scope_ex1732);  
                    stream_114.add(char_literal172);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_sequence_in_scope_ex1736);
            scope_sequence173=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence173.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_ex1738);
            scope_stmt174=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt174.getTree());


            // AST REWRITE
            // elements: ID, scope_sequence, SJF, EOSF, scope_stmt, ISOLATED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:2: -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:6: ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:14: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:44: ( ISOLATED )?
                if ( stream_ISOLATED.hasNext() ) {
                    adaptor.addChild(root_1, stream_ISOLATED.nextNode());

                }
                stream_ISOLATED.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:54: ( EOSF )?
                if ( stream_EOSF.hasNext() ) {
                    adaptor.addChild(root_1, stream_EOSF.nextNode());

                }
                stream_EOSF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:60: ( SJF )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:203:1: scope_short : scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) ;
    public final BPELscriptParser.scope_short_return scope_short() throws RecognitionException {
        BPELscriptParser.scope_short_return retval = new BPELscriptParser.scope_short_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.scope_sequence_return scope_sequence175 = null;

        BPELscriptParser.scope_stmt_return scope_stmt176 = null;


        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:2: ( scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:4: scope_sequence scope_stmt
            {
            pushFollow(FOLLOW_scope_sequence_in_scope_short1774);
            scope_sequence175=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence175.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_short1776);
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
            // 204:30: -> ^( SCOPE scope_stmt scope_sequence )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:33: ^( SCOPE scope_stmt scope_sequence )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:206:1: scope_stmt : ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) ;
    public final BPELscriptParser.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptParser.scope_stmt_return retval = new BPELscriptParser.scope_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.compensation_return compensation177 = null;

        BPELscriptParser.termination_return termination178 = null;

        BPELscriptParser.eventHdl_return eventHdl179 = null;


        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_termination=new RewriteRuleSubtreeStream(adaptor,"rule termination");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:2: ( ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:4: ( compensation )? ( termination )? ( eventHdl )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:4: ( compensation )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==142) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:4: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_scope_stmt1795);
                    compensation177=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation177.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:18: ( termination )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==139) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:18: termination
                    {
                    pushFollow(FOLLOW_termination_in_scope_stmt1798);
                    termination178=termination();

                    state._fsp--;

                    stream_termination.add(termination178.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:31: ( eventHdl )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==140) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:31: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_scope_stmt1801);
                    eventHdl179=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl179.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: termination, eventHdl, compensation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:2: -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:5: ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:13: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:27: ( termination )?
                if ( stream_termination.hasNext() ) {
                    adaptor.addChild(root_1, stream_termination.nextTree());

                }
                stream_termination.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:208:40: ( eventHdl )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:210:1: termination : 'onTermination' body -> ^( TERMINATION body ) ;
    public final BPELscriptParser.termination_return termination() throws RecognitionException {
        BPELscriptParser.termination_return retval = new BPELscriptParser.termination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal180=null;
        BPELscriptParser.body_return body181 = null;


        CommonTree string_literal180_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:2: ( 'onTermination' body -> ^( TERMINATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:4: 'onTermination' body
            {
            string_literal180=(Token)match(input,139,FOLLOW_139_in_termination1828);  
            stream_139.add(string_literal180);

            pushFollow(FOLLOW_body_in_termination1830);
            body181=body();

            state._fsp--;

            stream_body.add(body181.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 211:25: -> ^( TERMINATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:28: ^( TERMINATION body )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:213:1: eventHdl : 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) ;
    public final BPELscriptParser.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptParser.eventHdl_return retval = new BPELscriptParser.eventHdl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal182=null;
        Token char_literal183=null;
        Token char_literal186=null;
        BPELscriptParser.onEvent_return onEvent184 = null;

        BPELscriptParser.onAlarm_return onAlarm185 = null;


        CommonTree string_literal182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_onEvent=new RewriteRuleSubtreeStream(adaptor,"rule onEvent");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:2: ( 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:4: 'events' '{' ( onEvent )* ( onAlarm )* '}'
            {
            string_literal182=(Token)match(input,140,FOLLOW_140_in_eventHdl1848);  
            stream_140.add(string_literal182);

            char_literal183=(Token)match(input,107,FOLLOW_107_in_eventHdl1850);  
            stream_107.add(char_literal183);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:17: ( onEvent )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ID||LA60_0==141||(LA60_0>=177 && LA60_0<=178)||(LA60_0>=180 && LA60_0<=183)||LA60_0==185) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:17: onEvent
            	    {
            	    pushFollow(FOLLOW_onEvent_in_eventHdl1852);
            	    onEvent184=onEvent();

            	    state._fsp--;

            	    stream_onEvent.add(onEvent184.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:26: ( onAlarm )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==SJF||LA61_0==107||(LA61_0>=115 && LA61_0<=117)||(LA61_0>=121 && LA61_0<=122)||LA61_0==179) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:26: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_eventHdl1855);
            	    onAlarm185=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm185.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            char_literal186=(Token)match(input,108,FOLLOW_108_in_eventHdl1858);  
            stream_108.add(char_literal186);



            // AST REWRITE
            // elements: onAlarm, onEvent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 215:3: -> ^( EVENTHDL ( onEvent )* ( onAlarm )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:215:6: ^( EVENTHDL ( onEvent )* ( onAlarm )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENTHDL, "EVENTHDL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:215:17: ( onEvent )*
                while ( stream_onEvent.hasNext() ) {
                    adaptor.addChild(root_1, stream_onEvent.nextTree());

                }
                stream_onEvent.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:215:26: ( onAlarm )*
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:1: onEvent : ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) ;
    public final BPELscriptParser.onEvent_return onEvent() throws RecognitionException {
        BPELscriptParser.onEvent_return retval = new BPELscriptParser.onEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Token p=null;
        Token o=null;
        Token char_literal191=null;
        Token string_literal192=null;
        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        BPELscriptParser.portType_return portType187 = null;

        BPELscriptParser.msgEx_return msgEx188 = null;

        BPELscriptParser.msgType_return msgType189 = null;

        BPELscriptParser.viElt_return viElt190 = null;

        BPELscriptParser.correlation_return correlation196 = null;

        BPELscriptParser.with_ex_return with_ex198 = null;

        BPELscriptParser.scope_short_return scope_short199 = null;


        CommonTree var_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree string_literal192_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal197_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:2: ( ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:4: ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:4: ( portType )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=177 && LA62_0<=178)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent1883);
                    portType187=portType();

                    state._fsp--;

                    stream_portType.add(portType187.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:14: ( msgEx )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=180 && LA63_0<=181)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:218:14: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent1886);
                    msgEx188=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx188.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:219:3: ( msgType | viElt )?
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=182 && LA64_0<=183)) ) {
                alt64=1;
            }
            else if ( (LA64_0==185) ) {
                alt64=2;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:219:5: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent1893);
                    msgType189=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType189.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:219:15: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent1897);
                    viElt190=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt190.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:3: (var= ID '=' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:4: var= ID '='
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_onEvent1912);  
                    stream_ID.add(var);

                    char_literal191=(Token)match(input,131,FOLLOW_131_in_onEvent1914);  
                    stream_131.add(char_literal191);


                    }
                    break;

            }

            string_literal192=(Token)match(input,141,FOLLOW_141_in_onEvent1919);  
            stream_141.add(string_literal192);

            char_literal193=(Token)match(input,113,FOLLOW_113_in_onEvent1921);  
            stream_113.add(char_literal193);

            p=(Token)match(input,ID,FOLLOW_ID_in_onEvent1925);  
            stream_ID.add(p);

            char_literal194=(Token)match(input,110,FOLLOW_110_in_onEvent1927);  
            stream_110.add(char_literal194);

            o=(Token)match(input,ID,FOLLOW_ID_in_onEvent1931);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:44: ( ',' correlation )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==110) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:45: ',' correlation
                    {
                    char_literal195=(Token)match(input,110,FOLLOW_110_in_onEvent1934);  
                    stream_110.add(char_literal195);

                    pushFollow(FOLLOW_correlation_in_onEvent1936);
                    correlation196=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation196.getTree());

                    }
                    break;

            }

            char_literal197=(Token)match(input,114,FOLLOW_114_in_onEvent1940);  
            stream_114.add(char_literal197);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:67: ( with_ex )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==143) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:67: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent1942);
                    with_ex198=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex198.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent1945);
            scope_short199=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short199.getTree());


            // AST REWRITE
            // elements: msgType, p, var, viElt, portType, correlation, msgEx, o, scope_short, with_ex
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
            // 221:2: -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:6: ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:20: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:33: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:54: ( $var)?
                if ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextNode());

                }
                stream_var.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:60: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:77: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:221:86: ( viElt )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:1: compensation : 'compensation' body -> ^( COMPENSATION body ) ;
    public final BPELscriptParser.compensation_return compensation() throws RecognitionException {
        BPELscriptParser.compensation_return retval = new BPELscriptParser.compensation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal200=null;
        BPELscriptParser.body_return body201 = null;


        CommonTree string_literal200_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:2: ( 'compensation' body -> ^( COMPENSATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:4: 'compensation' body
            {
            string_literal200=(Token)match(input,142,FOLLOW_142_in_compensation1996);  
            stream_142.add(string_literal200);

            pushFollow(FOLLOW_body_in_compensation1998);
            body201=body();

            state._fsp--;

            stream_body.add(body201.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 224:24: -> ^( COMPENSATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:27: ^( COMPENSATION body )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:226:1: with_ex : 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) ;
    public final BPELscriptParser.with_ex_return with_ex() throws RecognitionException {
        BPELscriptParser.with_ex_return retval = new BPELscriptParser.with_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal202=null;
        Token char_literal203=null;
        Token char_literal204=null;
        Token char_literal205=null;
        List list_wm=null;
        RuleReturnScope wm = null;
        CommonTree string_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree char_literal204_tree=null;
        CommonTree char_literal205_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_with_map=new RewriteRuleSubtreeStream(adaptor,"rule with_map");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:3: ( 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:6: 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')'
            {
            string_literal202=(Token)match(input,143,FOLLOW_143_in_with_ex2017);  
            stream_143.add(string_literal202);

            char_literal203=(Token)match(input,113,FOLLOW_113_in_with_ex2019);  
            stream_113.add(char_literal203);

            pushFollow(FOLLOW_with_map_in_with_ex2023);
            wm=with_map();

            state._fsp--;

            stream_with_map.add(wm.getTree());
            if (list_wm==null) list_wm=new ArrayList();
            list_wm.add(wm);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:30: ( ',' wm+= with_map )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==110) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:31: ',' wm+= with_map
            	    {
            	    char_literal204=(Token)match(input,110,FOLLOW_110_in_with_ex2026);  
            	    stream_110.add(char_literal204);

            	    pushFollow(FOLLOW_with_map_in_with_ex2030);
            	    wm=with_map();

            	    state._fsp--;

            	    stream_with_map.add(wm.getTree());
            	    if (list_wm==null) list_wm=new ArrayList();
            	    list_wm.add(wm);


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            char_literal205=(Token)match(input,114,FOLLOW_114_in_with_ex2034);  
            stream_114.add(char_literal205);



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
            // 227:54: -> ^( WITH ( $wm)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:57: ^( WITH ( $wm)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:1: with_map : ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) ;
    public final BPELscriptParser.with_map_return with_map() throws RecognitionException {
        BPELscriptParser.with_map_return retval = new BPELscriptParser.with_map_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID206=null;
        Token char_literal207=null;
        Token KEY208=null;
        BPELscriptParser.path_expr_return path_expr209 = null;


        CommonTree ID206_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree KEY208_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:2: ( ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:11: ID ':' ( KEY )? path_expr
            {
            ID206=(Token)match(input,ID,FOLLOW_ID_in_with_map2060);  
            stream_ID.add(ID206);

            char_literal207=(Token)match(input,144,FOLLOW_144_in_with_map2062);  
            stream_144.add(char_literal207);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:18: ( KEY )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEY) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:18: KEY
                    {
                    KEY208=(Token)match(input,KEY,FOLLOW_KEY_in_with_map2064);  
                    stream_KEY.add(KEY208);


                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2067);
            path_expr209=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr209.getTree());


            // AST REWRITE
            // elements: path_expr, ID, KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 230:33: -> ^( MAP ID ( KEY )? path_expr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:36: ^( MAP ID ( KEY )? path_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:45: ( KEY )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:1: receive : ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) ;
    public final BPELscriptParser.receive_return receive() throws RecognitionException {
        BPELscriptParser.receive_return retval = new BPELscriptParser.receive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token CREATE_INST211=null;
        Token string_literal214=null;
        Token char_literal215=null;
        Token char_literal216=null;
        Token char_literal217=null;
        Token char_literal219=null;
        BPELscriptParser.portType_return portType210 = null;

        BPELscriptParser.msgEx_return msgEx212 = null;

        BPELscriptParser.std_attr_return std_attr213 = null;

        BPELscriptParser.correlation_return correlation218 = null;

        BPELscriptParser.with_ex_return with_ex220 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree CREATE_INST211_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal217_tree=null;
        CommonTree char_literal219_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:9: ( ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:12: ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:12: ( portType )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=177 && LA70_0<=178)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2098);
                    portType210=portType();

                    state._fsp--;

                    stream_portType.add(portType210.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:22: ( CREATE_INST )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==CREATE_INST) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:22: CREATE_INST
                    {
                    CREATE_INST211=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2101);  
                    stream_CREATE_INST.add(CREATE_INST211);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:35: ( msgEx )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=180 && LA72_0<=181)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:234:35: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2104);
                    msgEx212=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx212.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_receive2107);
            std_attr213=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr213.getTree());
            string_literal214=(Token)match(input,145,FOLLOW_145_in_receive2111);  
            stream_145.add(string_literal214);

            char_literal215=(Token)match(input,113,FOLLOW_113_in_receive2113);  
            stream_113.add(char_literal215);

            p=(Token)match(input,ID,FOLLOW_ID_in_receive2117);  
            stream_ID.add(p);

            char_literal216=(Token)match(input,110,FOLLOW_110_in_receive2119);  
            stream_110.add(char_literal216);

            o=(Token)match(input,ID,FOLLOW_ID_in_receive2123);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:31: ( ',' correlation )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==110) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:32: ',' correlation
                    {
                    char_literal217=(Token)match(input,110,FOLLOW_110_in_receive2126);  
                    stream_110.add(char_literal217);

                    pushFollow(FOLLOW_correlation_in_receive2128);
                    correlation218=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation218.getTree());

                    }
                    break;

            }

            char_literal219=(Token)match(input,114,FOLLOW_114_in_receive2132);  
            stream_114.add(char_literal219);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:54: ( with_ex )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==143) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:54: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2134);
                    with_ex220=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex220.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: msgEx, with_ex, o, p, std_attr, correlation, CREATE_INST, portType
            // token labels: p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:2: -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:6: ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:22: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:35: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:45: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:58: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:74: ( with_ex )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:1: reply : ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) ;
    public final BPELscriptParser.reply_return reply() throws RecognitionException {
        BPELscriptParser.reply_return retval = new BPELscriptParser.reply_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal225=null;
        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        BPELscriptParser.portType_return portType221 = null;

        BPELscriptParser.faultName_return faultName222 = null;

        BPELscriptParser.msgEx_return msgEx223 = null;

        BPELscriptParser.std_attr_return std_attr224 = null;

        BPELscriptParser.correlation_return correlation230 = null;

        BPELscriptParser.with_ex_return with_ex232 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:2: ( ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:4: ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:4: ( portType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=177 && LA75_0<=178)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply2175);
                    portType221=portType();

                    state._fsp--;

                    stream_portType.add(portType221.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:14: ( faultName )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=186 && LA76_0<=187)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:14: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply2178);
                    faultName222=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName222.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:25: ( msgEx )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=180 && LA77_0<=181)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:239:25: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply2181);
                    msgEx223=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx223.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_reply2184);
            std_attr224=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr224.getTree());
            string_literal225=(Token)match(input,146,FOLLOW_146_in_reply2188);  
            stream_146.add(string_literal225);

            char_literal226=(Token)match(input,113,FOLLOW_113_in_reply2190);  
            stream_113.add(char_literal226);

            p=(Token)match(input,ID,FOLLOW_ID_in_reply2194);  
            stream_ID.add(p);

            char_literal227=(Token)match(input,110,FOLLOW_110_in_reply2196);  
            stream_110.add(char_literal227);

            o=(Token)match(input,ID,FOLLOW_ID_in_reply2200);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:29: ( ',' in= ID )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==110) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==ID) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:30: ',' in= ID
                    {
                    char_literal228=(Token)match(input,110,FOLLOW_110_in_reply2203);  
                    stream_110.add(char_literal228);

                    in=(Token)match(input,ID,FOLLOW_ID_in_reply2207);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:42: ( ',' correlation )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==110) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:43: ',' correlation
                    {
                    char_literal229=(Token)match(input,110,FOLLOW_110_in_reply2212);  
                    stream_110.add(char_literal229);

                    pushFollow(FOLLOW_correlation_in_reply2214);
                    correlation230=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation230.getTree());

                    }
                    break;

            }

            char_literal231=(Token)match(input,114,FOLLOW_114_in_reply2218);  
            stream_114.add(char_literal231);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:66: ( with_ex )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==143) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2221);
                    with_ex232=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex232.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, ID, msgEx, ID, std_attr, correlation, portType, with_ex, faultName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 241:2: -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:6: ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPLY, "REPLY"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:24: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:37: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:56: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:67: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:74: ( with_ex )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:243:1: invoke : ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) ;
    public final BPELscriptParser.invoke_return invoke() throws RecognitionException {
        BPELscriptParser.invoke_return retval = new BPELscriptParser.invoke_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal235=null;
        Token char_literal236=null;
        Token char_literal237=null;
        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal241=null;
        BPELscriptParser.portType_return portType233 = null;

        BPELscriptParser.std_attr_return std_attr234 = null;

        BPELscriptParser.correlation_return correlation240 = null;

        BPELscriptParser.with_ex_return with_ex242 = null;

        BPELscriptParser.compensation_return compensation243 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal239_tree=null;
        CommonTree char_literal241_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:2: ( ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:4: ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:4: ( portType )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=177 && LA81_0<=178)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke2263);
                    portType233=portType();

                    state._fsp--;

                    stream_portType.add(portType233.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_invoke2266);
            std_attr234=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr234.getTree());
            string_literal235=(Token)match(input,147,FOLLOW_147_in_invoke2270);  
            stream_147.add(string_literal235);

            char_literal236=(Token)match(input,113,FOLLOW_113_in_invoke2272);  
            stream_113.add(char_literal236);

            p=(Token)match(input,ID,FOLLOW_ID_in_invoke2276);  
            stream_ID.add(p);

            char_literal237=(Token)match(input,110,FOLLOW_110_in_invoke2278);  
            stream_110.add(char_literal237);

            o=(Token)match(input,ID,FOLLOW_ID_in_invoke2282);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:30: ( ',' in= ID )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==110) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==ID) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:31: ',' in= ID
                    {
                    char_literal238=(Token)match(input,110,FOLLOW_110_in_invoke2285);  
                    stream_110.add(char_literal238);

                    in=(Token)match(input,ID,FOLLOW_ID_in_invoke2289);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:43: ( ',' correlation )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==110) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:44: ',' correlation
                    {
                    char_literal239=(Token)match(input,110,FOLLOW_110_in_invoke2294);  
                    stream_110.add(char_literal239);

                    pushFollow(FOLLOW_correlation_in_invoke2296);
                    correlation240=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation240.getTree());

                    }
                    break;

            }

            char_literal241=(Token)match(input,114,FOLLOW_114_in_invoke2300);  
            stream_114.add(char_literal241);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:66: ( with_ex )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==143) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2302);
                    with_ex242=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex242.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:75: ( compensation )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==142) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:75: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2305);
                    compensation243=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation243.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: compensation, o, correlation, in, std_attr, with_ex, portType, p
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
            // 246:2: -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:6: ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVOKE, "INVOKE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:21: ( $in)?
                if ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:26: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:39: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:58: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:67: ( compensation )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:248:1: assign : ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue ) ;
    public final BPELscriptParser.assign_return assign() throws RecognitionException {
        BPELscriptParser.assign_return retval = new BPELscriptParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE_INST245=null;
        Token VALID246=null;
        Token KEEPSRC247=null;
        Token IGNORE248=null;
        Token PROP253=null;
        Token char_literal254=null;
        BPELscriptParser.portType_return portType244 = null;

        BPELscriptParser.faultName_return faultName249 = null;

        BPELscriptParser.msgEx_return msgEx250 = null;

        BPELscriptParser.std_attr_return std_attr251 = null;

        BPELscriptParser.path_expr_return path_expr252 = null;

        BPELscriptParser.rvalue_return rvalue255 = null;


        CommonTree CREATE_INST245_tree=null;
        CommonTree VALID246_tree=null;
        CommonTree KEEPSRC247_tree=null;
        CommonTree IGNORE248_tree=null;
        CommonTree PROP253_tree=null;
        CommonTree char_literal254_tree=null;
        RewriteRuleTokenStream stream_IGNORE=new RewriteRuleTokenStream(adaptor,"token IGNORE");
        RewriteRuleTokenStream stream_PROP=new RewriteRuleTokenStream(adaptor,"token PROP");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:2: ( ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:4: ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:4: ( portType )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=177 && LA86_0<=178)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign2347);
                    portType244=portType();

                    state._fsp--;

                    stream_portType.add(portType244.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:14: ( CREATE_INST )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==CREATE_INST) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:14: CREATE_INST
                    {
                    CREATE_INST245=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2350);  
                    stream_CREATE_INST.add(CREATE_INST245);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:27: ( VALID )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==VALID) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:27: VALID
                    {
                    VALID246=(Token)match(input,VALID,FOLLOW_VALID_in_assign2353);  
                    stream_VALID.add(VALID246);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:34: ( KEEPSRC )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==KEEPSRC) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:34: KEEPSRC
                    {
                    KEEPSRC247=(Token)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2356);  
                    stream_KEEPSRC.add(KEEPSRC247);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:43: ( IGNORE )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==IGNORE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:43: IGNORE
                    {
                    IGNORE248=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_assign2359);  
                    stream_IGNORE.add(IGNORE248);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:51: ( faultName )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=186 && LA91_0<=187)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:51: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign2362);
                    faultName249=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName249.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:62: ( msgEx )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=180 && LA92_0<=181)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:249:62: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign2365);
                    msgEx250=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx250.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_assign2368);
            std_attr251=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr251.getTree());
            pushFollow(FOLLOW_path_expr_in_assign2373);
            path_expr252=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr252.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:250:13: ( PROP )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==PROP) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:250:13: PROP
                    {
                    PROP253=(Token)match(input,PROP,FOLLOW_PROP_in_assign2375);  
                    stream_PROP.add(PROP253);


                    }
                    break;

            }

            char_literal254=(Token)match(input,131,FOLLOW_131_in_assign2378);  
            stream_131.add(char_literal254);

            pushFollow(FOLLOW_rvalue_in_assign2380);
            rvalue255=rvalue();

            state._fsp--;

            stream_rvalue.add(rvalue255.getTree());


            // AST REWRITE
            // elements: path_expr, faultName, rvalue, IGNORE, CREATE_INST, PROP, KEEPSRC, msgEx, VALID, portType, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 251:2: -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:6: ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_path_expr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:25: ( PROP )?
                if ( stream_PROP.hasNext() ) {
                    adaptor.addChild(root_1, stream_PROP.nextNode());

                }
                stream_PROP.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:31: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:41: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:63: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:74: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:81: ( VALID )?
                if ( stream_VALID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VALID.nextNode());

                }
                stream_VALID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:88: ( KEEPSRC )?
                if ( stream_KEEPSRC.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEEPSRC.nextNode());

                }
                stream_KEEPSRC.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:97: ( IGNORE )?
                if ( stream_IGNORE.hasNext() ) {
                    adaptor.addChild(root_1, stream_IGNORE.nextNode());

                }
                stream_IGNORE.reset();
                adaptor.addChild(root_1, stream_rvalue.nextTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:1: rvalue : ( receive | invoke | expr ( PROP )? );
    public final BPELscriptParser.rvalue_return rvalue() throws RecognitionException {
        BPELscriptParser.rvalue_return retval = new BPELscriptParser.rvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROP259=null;
        BPELscriptParser.receive_return receive256 = null;

        BPELscriptParser.invoke_return invoke257 = null;

        BPELscriptParser.expr_return expr258 = null;


        CommonTree PROP259_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:2: ( receive | invoke | expr ( PROP )? )
            int alt95=3;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:4: receive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_receive_in_rvalue2428);
                    receive256=receive();

                    state._fsp--;

                    adaptor.addChild(root_0, receive256.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:4: invoke
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_invoke_in_rvalue2433);
                    invoke257=invoke();

                    state._fsp--;

                    adaptor.addChild(root_0, invoke257.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:256:4: expr ( PROP )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_rvalue2438);
                    expr258=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr258.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:256:9: ( PROP )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==PROP) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:256:9: PROP
                            {
                            PROP259=(Token)match(input,PROP,FOLLOW_PROP_in_rvalue2440); 
                            PROP259_tree = (CommonTree)adaptor.create(PROP259);
                            adaptor.addChild(root_0, PROP259_tree);


                            }
                            break;

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
    // $ANTLR end "rvalue"

    public static class throw_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throw_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:1: throw_ex : ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) ;
    public final BPELscriptParser.throw_ex_return throw_ex() throws RecognitionException {
        BPELscriptParser.throw_ex_return retval = new BPELscriptParser.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token faultVar=null;
        Token string_literal260=null;
        Token string_literal261=null;
        Token string_literal263=null;
        Token char_literal264=null;
        Token char_literal266=null;
        BPELscriptParser.std_attr_return std_attr262 = null;

        BPELscriptParser.ns_id_return ns_id265 = null;


        CommonTree faultVar_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree string_literal261_tree=null;
        CommonTree string_literal263_tree=null;
        CommonTree char_literal264_tree=null;
        CommonTree char_literal266_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:2: ( ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=148 && LA97_0<=149)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:5: ( '@faultVariable' | '@faultVar' ) faultVar= ID
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:5: ( '@faultVariable' | '@faultVar' )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==148) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==149) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:6: '@faultVariable'
                            {
                            string_literal260=(Token)match(input,148,FOLLOW_148_in_throw_ex2453);  
                            stream_148.add(string_literal260);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:24: '@faultVar'
                            {
                            string_literal261=(Token)match(input,149,FOLLOW_149_in_throw_ex2456);  
                            stream_149.add(string_literal261);


                            }
                            break;

                    }

                    faultVar=(Token)match(input,ID,FOLLOW_ID_in_throw_ex2461);  
                    stream_ID.add(faultVar);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_throw_ex2465);
            std_attr262=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr262.getTree());
            string_literal263=(Token)match(input,150,FOLLOW_150_in_throw_ex2469);  
            stream_150.add(string_literal263);

            char_literal264=(Token)match(input,113,FOLLOW_113_in_throw_ex2471);  
            stream_113.add(char_literal264);

            pushFollow(FOLLOW_ns_id_in_throw_ex2473);
            ns_id265=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id265.getTree());
            char_literal266=(Token)match(input,114,FOLLOW_114_in_throw_ex2475);  
            stream_114.add(char_literal266);



            // AST REWRITE
            // elements: ns_id, faultVar, std_attr
            // token labels: faultVar
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_faultVar=new RewriteRuleTokenStream(adaptor,"token faultVar",faultVar);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 260:25: -> ^( THROW ns_id ( $faultVar)? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:260:28: ^( THROW ns_id ( $faultVar)? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:260:42: ( $faultVar)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:1: rethrow_ex : std_attr 'rethrow' -> ^( RETHROW std_attr ) ;
    public final BPELscriptParser.rethrow_ex_return rethrow_ex() throws RecognitionException {
        BPELscriptParser.rethrow_ex_return retval = new BPELscriptParser.rethrow_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal268=null;
        BPELscriptParser.std_attr_return std_attr267 = null;


        CommonTree string_literal268_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:2: ( std_attr 'rethrow' -> ^( RETHROW std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:4: std_attr 'rethrow'
            {
            pushFollow(FOLLOW_std_attr_in_rethrow_ex2500);
            std_attr267=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr267.getTree());
            string_literal268=(Token)match(input,151,FOLLOW_151_in_rethrow_ex2504);  
            stream_151.add(string_literal268);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 264:13: -> ^( RETHROW std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:264:16: ^( RETHROW std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:1: compensate : std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) ;
    public final BPELscriptParser.compensate_return compensate() throws RecognitionException {
        BPELscriptParser.compensate_return retval = new BPELscriptParser.compensate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token target=null;
        Token string_literal270=null;
        Token char_literal271=null;
        Token char_literal272=null;
        BPELscriptParser.std_attr_return std_attr269 = null;


        CommonTree target_tree=null;
        CommonTree string_literal270_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree char_literal272_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:2: ( std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:4: std_attr 'compensate' ( '(' target= ID ')' )?
            {
            pushFollow(FOLLOW_std_attr_in_compensate2521);
            std_attr269=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr269.getTree());
            string_literal270=(Token)match(input,152,FOLLOW_152_in_compensate2525);  
            stream_152.add(string_literal270);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:16: ( '(' target= ID ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==113) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:17: '(' target= ID ')'
                    {
                    char_literal271=(Token)match(input,113,FOLLOW_113_in_compensate2528);  
                    stream_113.add(char_literal271);

                    target=(Token)match(input,ID,FOLLOW_ID_in_compensate2532);  
                    stream_ID.add(target);

                    char_literal272=(Token)match(input,114,FOLLOW_114_in_compensate2534);  
                    stream_114.add(char_literal272);


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
            // 269:2: -> ^( COMPENSATE ( ID )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:269:6: ^( COMPENSATE ( ID )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATE, "COMPENSATE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:269:19: ( ID )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:271:1: exit : std_attr 'exit' -> ^( EXIT std_attr ) ;
    public final BPELscriptParser.exit_return exit() throws RecognitionException {
        BPELscriptParser.exit_return retval = new BPELscriptParser.exit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal274=null;
        BPELscriptParser.std_attr_return std_attr273 = null;


        CommonTree string_literal274_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:271:7: ( std_attr 'exit' -> ^( EXIT std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:271:9: std_attr 'exit'
            {
            pushFollow(FOLLOW_std_attr_in_exit2559);
            std_attr273=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr273.getTree());
            string_literal274=(Token)match(input,153,FOLLOW_153_in_exit2564);  
            stream_153.add(string_literal274);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 272:11: -> ^( EXIT std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:14: ^( EXIT std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:1: validate : std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) ;
    public final BPELscriptParser.validate_return validate() throws RecognitionException {
        BPELscriptParser.validate_return retval = new BPELscriptParser.validate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal276=null;
        Token char_literal277=null;
        Token v=null;
        List list_v=null;
        BPELscriptParser.std_attr_return std_attr275 = null;


        CommonTree string_literal276_tree=null;
        CommonTree char_literal277_tree=null;
        CommonTree v_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:10: ( std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:12: std_attr 'validate' v+= ID ( ',' v+= ID )*
            {
            pushFollow(FOLLOW_std_attr_in_validate2581);
            std_attr275=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr275.getTree());
            string_literal276=(Token)match(input,154,FOLLOW_154_in_validate2587);  
            stream_154.add(string_literal276);

            v=(Token)match(input,ID,FOLLOW_ID_in_validate2591);  
            stream_ID.add(v);

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:21: ( ',' v+= ID )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==110) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:22: ',' v+= ID
            	    {
            	    char_literal277=(Token)match(input,110,FOLLOW_110_in_validate2594);  
            	    stream_110.add(char_literal277);

            	    v=(Token)match(input,ID,FOLLOW_ID_in_validate2598);  
            	    stream_ID.add(v);

            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop99;
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
            // 275:33: -> ^( VALIDATE ( $v)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:36: ^( VALIDATE ( $v)+ std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:1: ext_act : std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) ;
    public final BPELscriptParser.ext_act_return ext_act() throws RecognitionException {
        BPELscriptParser.ext_act_return retval = new BPELscriptParser.ext_act_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token e=null;
        BPELscriptParser.std_attr_return std_attr278 = null;


        CommonTree e_tree=null;
        RewriteRuleTokenStream stream_EXT_ACT=new RewriteRuleTokenStream(adaptor,"token EXT_ACT");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:11: ( std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:13: std_attr e= EXT_ACT
            {
            pushFollow(FOLLOW_std_attr_in_ext_act2622);
            std_attr278=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr278.getTree());
            e=(Token)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act2630);  
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
            // 278:14: -> ^( EXTENSIONACT $e std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:18: ^( EXTENSIONACT $e std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:1: nop : std_attr 'nop' -> ^( NOP std_attr ) ;
    public final BPELscriptParser.nop_return nop() throws RecognitionException {
        BPELscriptParser.nop_return retval = new BPELscriptParser.nop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal280=null;
        BPELscriptParser.std_attr_return std_attr279 = null;


        CommonTree string_literal280_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:6: ( std_attr 'nop' -> ^( NOP std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:280:8: std_attr 'nop'
            {
            pushFollow(FOLLOW_std_attr_in_nop2651);
            std_attr279=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr279.getTree());
            string_literal280=(Token)match(input,155,FOLLOW_155_in_nop2656);  
            stream_155.add(string_literal280);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:10: -> ^( NOP std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:13: ^( NOP std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:283:1: opaque : std_attr 'opaque()' -> ^( OPAQUE std_attr ) ;
    public final BPELscriptParser.opaque_return opaque() throws RecognitionException {
        BPELscriptParser.opaque_return retval = new BPELscriptParser.opaque_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal282=null;
        BPELscriptParser.std_attr_return std_attr281 = null;


        CommonTree string_literal282_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:283:8: ( std_attr 'opaque()' -> ^( OPAQUE std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:283:10: std_attr 'opaque()'
            {
            pushFollow(FOLLOW_std_attr_in_opaque2675);
            std_attr281=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr281.getTree());
            string_literal282=(Token)match(input,156,FOLLOW_156_in_opaque2680);  
            stream_156.add(string_literal282);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:15: -> ^( OPAQUE std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:18: ^( OPAQUE std_attr )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:287:1: namespace : 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) ;
    public final BPELscriptParser.namespace_return namespace() throws RecognitionException {
        BPELscriptParser.namespace_return retval = new BPELscriptParser.namespace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal283=null;
        Token ID284=null;
        Token char_literal285=null;
        Token STRING286=null;
        Token SEMI287=null;

        CommonTree string_literal283_tree=null;
        CommonTree ID284_tree=null;
        CommonTree char_literal285_tree=null;
        CommonTree STRING286_tree=null;
        CommonTree SEMI287_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:2: ( 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:4: 'namespace' ID '=' STRING SEMI
            {
            string_literal283=(Token)match(input,157,FOLLOW_157_in_namespace2699);  
            stream_157.add(string_literal283);

            ID284=(Token)match(input,ID,FOLLOW_ID_in_namespace2701);  
            stream_ID.add(ID284);

            char_literal285=(Token)match(input,131,FOLLOW_131_in_namespace2703);  
            stream_131.add(char_literal285);

            STRING286=(Token)match(input,STRING,FOLLOW_STRING_in_namespace2705);  
            stream_STRING.add(STRING286);

            SEMI287=(Token)match(input,SEMI,FOLLOW_SEMI_in_namespace2707);  
            stream_SEMI.add(SEMI287);



            // AST REWRITE
            // elements: STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 288:35: -> ^( NAMESPACE ID STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:288:38: ^( NAMESPACE ID STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:1: extension : ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) ;
    public final BPELscriptParser.extension_return extension() throws RecognitionException {
        BPELscriptParser.extension_return retval = new BPELscriptParser.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUSTUND288=null;
        Token string_literal289=null;
        Token ID290=null;
        Token char_literal291=null;
        Token STRING292=null;
        Token SEMI293=null;

        CommonTree MUSTUND288_tree=null;
        CommonTree string_literal289_tree=null;
        CommonTree ID290_tree=null;
        CommonTree char_literal291_tree=null;
        CommonTree STRING292_tree=null;
        CommonTree SEMI293_tree=null;
        RewriteRuleTokenStream stream_MUSTUND=new RewriteRuleTokenStream(adaptor,"token MUSTUND");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:291:2: ( ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:291:5: ( MUSTUND )? 'extension' ID '=' STRING SEMI
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:291:5: ( MUSTUND )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==MUSTUND) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:291:5: MUSTUND
                    {
                    MUSTUND288=(Token)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension2728);  
                    stream_MUSTUND.add(MUSTUND288);


                    }
                    break;

            }

            string_literal289=(Token)match(input,158,FOLLOW_158_in_extension2734);  
            stream_158.add(string_literal289);

            ID290=(Token)match(input,ID,FOLLOW_ID_in_extension2736);  
            stream_ID.add(ID290);

            char_literal291=(Token)match(input,131,FOLLOW_131_in_extension2738);  
            stream_131.add(char_literal291);

            STRING292=(Token)match(input,STRING,FOLLOW_STRING_in_extension2740);  
            stream_STRING.add(STRING292);

            SEMI293=(Token)match(input,SEMI,FOLLOW_SEMI_in_extension2742);  
            stream_SEMI.add(SEMI293);



            // AST REWRITE
            // elements: STRING, ID, MUSTUND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:2: -> ^( EXTENSION ID STRING ( MUSTUND )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:6: ^( EXTENSION ID STRING ( MUSTUND )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:28: ( MUSTUND )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:295:1: imports : viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) ;
    public final BPELscriptParser.imports_return imports() throws RecognitionException {
        BPELscriptParser.imports_return retval = new BPELscriptParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token ns=null;
        Token loc=null;
        Token string_literal295=null;
        Token char_literal296=null;
        Token string_literal297=null;
        Token SEMI298=null;
        BPELscriptParser.viType_return viType294 = null;


        CommonTree id_tree=null;
        CommonTree ns_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree string_literal297_tree=null;
        CommonTree SEMI298_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:2: ( viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:296:5: viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI
            {
            pushFollow(FOLLOW_viType_in_imports2767);
            viType294=viType();

            state._fsp--;

            stream_viType.add(viType294.getTree());
            string_literal295=(Token)match(input,159,FOLLOW_159_in_imports2773);  
            stream_159.add(string_literal295);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:12: (id= ID '=' (ns= ID '::' )? loc= STRING )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:13: id= ID '=' (ns= ID '::' )? loc= STRING
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_imports2778);  
            stream_ID.add(id);

            char_literal296=(Token)match(input,131,FOLLOW_131_in_imports2780);  
            stream_131.add(char_literal296);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:23: (ns= ID '::' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ID) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:24: ns= ID '::'
                    {
                    ns=(Token)match(input,ID,FOLLOW_ID_in_imports2785);  
                    stream_ID.add(ns);

                    string_literal297=(Token)match(input,160,FOLLOW_160_in_imports2787);  
                    stream_160.add(string_literal297);


                    }
                    break;

            }

            loc=(Token)match(input,STRING,FOLLOW_STRING_in_imports2794);  
            stream_STRING.add(loc);


            }

            SEMI298=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports2798);  
            stream_SEMI.add(SEMI298);



            // AST REWRITE
            // elements: loc, ns, viType, id
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
            // 298:2: -> ^( IMPORT $id $loc ( $ns)? ( viType )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:6: ^( IMPORT $id $loc ( $ns)? ( viType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                adaptor.addChild(root_1, stream_loc.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:24: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:29: ( viType )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:1: messages : 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) ;
    public final BPELscriptParser.messages_return messages() throws RecognitionException {
        BPELscriptParser.messages_return retval = new BPELscriptParser.messages_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal299=null;
        Token char_literal300=null;
        List list_m=null;
        RuleReturnScope m = null;
        CommonTree string_literal299_tree=null;
        CommonTree char_literal300_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_message=new RewriteRuleSubtreeStream(adaptor,"rule message");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:2: ( 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:4: 'messages' m+= message ( ',' m+= message )*
            {
            string_literal299=(Token)match(input,161,FOLLOW_161_in_messages2830);  
            stream_161.add(string_literal299);

            pushFollow(FOLLOW_message_in_messages2834);
            m=message();

            state._fsp--;

            stream_message.add(m.getTree());
            if (list_m==null) list_m=new ArrayList();
            list_m.add(m);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:26: ( ',' m+= message )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==110) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:27: ',' m+= message
            	    {
            	    char_literal300=(Token)match(input,110,FOLLOW_110_in_messages2837);  
            	    stream_110.add(char_literal300);

            	    pushFollow(FOLLOW_message_in_messages2841);
            	    m=message();

            	    state._fsp--;

            	    stream_message.add(m.getTree());
            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m);


            	    }
            	    break;

            	default :
            	    break loop102;
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
            // 301:44: -> ^( MESSAGES ( message )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:47: ^( MESSAGES ( message )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:1: message : ID -> ^( MESSAGE ID ) ;
    public final BPELscriptParser.message_return message() throws RecognitionException {
        BPELscriptParser.message_return retval = new BPELscriptParser.message_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID301=null;

        CommonTree ID301_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:9: ( ID -> ^( MESSAGE ID ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:11: ID
            {
            ID301=(Token)match(input,ID,FOLLOW_ID_in_message2861);  
            stream_ID.add(ID301);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 303:14: -> ^( MESSAGE ID )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:303:17: ^( MESSAGE ID )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:1: variables : 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) ;
    public final BPELscriptParser.variables_return variables() throws RecognitionException {
        BPELscriptParser.variables_return retval = new BPELscriptParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal302=null;
        Token char_literal303=null;
        List list_v=null;
        RuleReturnScope v = null;
        CommonTree string_literal302_tree=null;
        CommonTree char_literal303_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:11: ( 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:13: 'var' v+= variable ( ',' v+= variable )*
            {
            string_literal302=(Token)match(input,162,FOLLOW_162_in_variables2879);  
            stream_162.add(string_literal302);

            pushFollow(FOLLOW_variable_in_variables2883);
            v=variable();

            state._fsp--;

            stream_variable.add(v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:31: ( ',' v+= variable )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==110) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:32: ',' v+= variable
            	    {
            	    char_literal303=(Token)match(input,110,FOLLOW_110_in_variables2886);  
            	    stream_110.add(char_literal303);

            	    pushFollow(FOLLOW_variable_in_variables2890);
            	    v=variable();

            	    state._fsp--;

            	    stream_variable.add(v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop103;
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
            // 306:3: -> ^( VARIABLES ( variable )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:7: ^( VARIABLES ( variable )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:1: variable : ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) ;
    public final BPELscriptParser.variable_return variable() throws RecognitionException {
        BPELscriptParser.variable_return retval = new BPELscriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID307=null;
        BPELscriptParser.msgType_return msgType304 = null;

        BPELscriptParser.viType_return viType305 = null;

        BPELscriptParser.viElt_return viElt306 = null;

        BPELscriptParser.with_ex_return with_ex308 = null;


        CommonTree ID307_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:2: ( ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:4: ( msgType )? ( viType )? ( viElt )? ID ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:4: ( msgType )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=182 && LA104_0<=183)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:4: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable2914);
                    msgType304=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType304.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:13: ( viType )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==184) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:13: viType
                    {
                    pushFollow(FOLLOW_viType_in_variable2917);
                    viType305=viType();

                    state._fsp--;

                    stream_viType.add(viType305.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:21: ( viElt )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==185) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:21: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable2920);
                    viElt306=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt306.getTree());

                    }
                    break;

            }

            ID307=(Token)match(input,ID,FOLLOW_ID_in_variable2925);  
            stream_ID.add(ID307);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:7: ( with_ex )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==143) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:7: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable2928);
                    with_ex308=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex308.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: viType, viElt, msgType, ID, with_ex
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 311:2: -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:6: ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:20: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:37: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:311:44: ( with_ex )?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:313:1: partner_links : ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) ;
    public final BPELscriptParser.partner_links_return partner_links() throws RecognitionException {
        BPELscriptParser.partner_links_return retval = new BPELscriptParser.partner_links_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal309=null;
        Token string_literal310=null;
        Token char_literal311=null;
        List list_pl=null;
        RuleReturnScope pl = null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree char_literal311_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_partner_link=new RewriteRuleSubtreeStream(adaptor,"rule partner_link");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:2: ( ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: ( 'partnerLink' | 'partnerlink' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==163) ) {
                alt108=1;
            }
            else if ( (LA108_0==164) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:5: 'partnerLink'
                    {
                    string_literal309=(Token)match(input,163,FOLLOW_163_in_partner_links2961);  
                    stream_163.add(string_literal309);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:21: 'partnerlink'
                    {
                    string_literal310=(Token)match(input,164,FOLLOW_164_in_partner_links2965);  
                    stream_164.add(string_literal310);


                    }
                    break;

            }

            pushFollow(FOLLOW_partner_link_in_partner_links2970);
            pl=partner_link();

            state._fsp--;

            stream_partner_link.add(pl.getTree());
            if (list_pl==null) list_pl=new ArrayList();
            list_pl.add(pl);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:53: ( ',' pl+= partner_link )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==110) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:54: ',' pl+= partner_link
            	    {
            	    char_literal311=(Token)match(input,110,FOLLOW_110_in_partner_links2973);  
            	    stream_110.add(char_literal311);

            	    pushFollow(FOLLOW_partner_link_in_partner_links2977);
            	    pl=partner_link();

            	    state._fsp--;

            	    stream_partner_link.add(pl.getTree());
            	    if (list_pl==null) list_pl=new ArrayList();
            	    list_pl.add(pl);


            	    }
            	    break;

            	default :
            	    break loop109;
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
            // 314:77: -> ^( PARTNERLINKS ( $pl)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:80: ^( PARTNERLINKS ( $pl)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:1: partner_link : ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) ;
    public final BPELscriptParser.partner_link_return partner_link() throws RecognitionException {
        BPELscriptParser.partner_link_return retval = new BPELscriptParser.partner_link_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token ID312=null;
        Token char_literal313=null;
        Token char_literal314=null;
        Token char_literal315=null;
        Token char_literal316=null;
        Token char_literal317=null;
        Token char_literal318=null;
        BPELscriptParser.ns_id_return plType = null;

        BPELscriptParser.ns_id_return roleA = null;

        BPELscriptParser.ns_id_return roleB = null;


        CommonTree init_tree=null;
        CommonTree ID312_tree=null;
        CommonTree char_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree char_literal315_tree=null;
        CommonTree char_literal316_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree char_literal318_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_INITPARTNER=new RewriteRuleTokenStream(adaptor,"token INITPARTNER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:2: ( ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:4: ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')'
            {
            ID312=(Token)match(input,ID,FOLLOW_ID_in_partner_link2999);  
            stream_ID.add(ID312);

            char_literal313=(Token)match(input,131,FOLLOW_131_in_partner_link3001);  
            stream_131.add(char_literal313);

            char_literal314=(Token)match(input,113,FOLLOW_113_in_partner_link3003);  
            stream_113.add(char_literal314);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:21: (plType= ns_id )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:21: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partner_link3007);
                    plType=ns_id();

                    state._fsp--;

                    stream_ns_id.add(plType.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:29: ( ',' roleA= ns_id )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==110) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==ID) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:30: ',' roleA= ns_id
                    {
                    char_literal315=(Token)match(input,110,FOLLOW_110_in_partner_link3011);  
                    stream_110.add(char_literal315);

                    pushFollow(FOLLOW_ns_id_in_partner_link3015);
                    roleA=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleA.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:48: ( ',' roleB= ns_id )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==110) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==ID) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:49: ',' roleB= ns_id
                    {
                    char_literal316=(Token)match(input,110,FOLLOW_110_in_partner_link3020);  
                    stream_110.add(char_literal316);

                    pushFollow(FOLLOW_ns_id_in_partner_link3024);
                    roleB=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleB.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:67: ( ',' init= INITPARTNER )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==110) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:68: ',' init= INITPARTNER
                    {
                    char_literal317=(Token)match(input,110,FOLLOW_110_in_partner_link3029);  
                    stream_110.add(char_literal317);

                    init=(Token)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partner_link3033);  
                    stream_INITPARTNER.add(init);


                    }
                    break;

            }

            char_literal318=(Token)match(input,114,FOLLOW_114_in_partner_link3037);  
            stream_114.add(char_literal318);



            // AST REWRITE
            // elements: roleA, roleB, init, plType, ID
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
            // 318:3: -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:7: ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PID, "PID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:16: ( $plType)?
                if ( stream_plType.hasNext() ) {
                    adaptor.addChild(root_1, stream_plType.nextTree());

                }
                stream_plType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:25: ( $roleA)?
                if ( stream_roleA.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleA.nextTree());

                }
                stream_roleA.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:33: ( $roleB)?
                if ( stream_roleB.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleB.nextTree());

                }
                stream_roleB.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:318:41: ( $init)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:320:1: correlation : '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) ;
    public final BPELscriptParser.correlation_return correlation() throws RecognitionException {
        BPELscriptParser.correlation_return retval = new BPELscriptParser.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal319=null;
        Token char_literal321=null;
        Token char_literal323=null;
        BPELscriptParser.corr_mapping_return corr_mapping320 = null;

        BPELscriptParser.corr_mapping_return corr_mapping322 = null;


        CommonTree char_literal319_tree=null;
        CommonTree char_literal321_tree=null;
        CommonTree char_literal323_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_corr_mapping=new RewriteRuleSubtreeStream(adaptor,"rule corr_mapping");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:2: ( '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:4: '{' corr_mapping ( ',' corr_mapping )* '}'
            {
            char_literal319=(Token)match(input,107,FOLLOW_107_in_correlation3073);  
            stream_107.add(char_literal319);

            pushFollow(FOLLOW_corr_mapping_in_correlation3075);
            corr_mapping320=corr_mapping();

            state._fsp--;

            stream_corr_mapping.add(corr_mapping320.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:21: ( ',' corr_mapping )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==110) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:22: ',' corr_mapping
            	    {
            	    char_literal321=(Token)match(input,110,FOLLOW_110_in_correlation3078);  
            	    stream_110.add(char_literal321);

            	    pushFollow(FOLLOW_corr_mapping_in_correlation3080);
            	    corr_mapping322=corr_mapping();

            	    state._fsp--;

            	    stream_corr_mapping.add(corr_mapping322.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            char_literal323=(Token)match(input,108,FOLLOW_108_in_correlation3084);  
            stream_108.add(char_literal323);



            // AST REWRITE
            // elements: corr_mapping
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 321:45: -> ^( CORRELATION ( corr_mapping )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:48: ^( CORRELATION ( corr_mapping )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:1: corr_mapping : (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) ;
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:2: ( (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:4: (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:8: (init= INIT_COR )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==INIT_COR) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:8: init= INIT_COR
                    {
                    init=(Token)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping3104);  
                    stream_INIT_COR.add(init);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:10: (pattern= PATTERN_COR )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==PATTERN_COR) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:325:10: pattern= PATTERN_COR
                    {
                    pattern=(Token)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping3111);  
                    stream_PATTERN_COR.add(pattern);


                    }
                    break;

            }

            f1=(Token)match(input,ID,FOLLOW_ID_in_corr_mapping3118);  
            stream_ID.add(f1);



            // AST REWRITE
            // elements: f1, init, pattern
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
            // 327:2: -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:327:6: ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORR_MAP, "CORR_MAP"), root_1);

                adaptor.addChild(root_1, stream_f1.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:327:21: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:327:28: ( $pattern)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:1: corr_sets : 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) ;
    public final BPELscriptParser.corr_sets_return corr_sets() throws RecognitionException {
        BPELscriptParser.corr_sets_return retval = new BPELscriptParser.corr_sets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal324=null;
        Token char_literal325=null;
        Token char_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        List list_cs=null;
        RuleReturnScope cs = null;
        CommonTree string_literal324_tree=null;
        CommonTree char_literal325_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree char_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_corr_set=new RewriteRuleSubtreeStream(adaptor,"rule corr_set");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:12: ( 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:14: 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}'
            {
            string_literal324=(Token)match(input,165,FOLLOW_165_in_corr_sets3146);  
            stream_165.add(string_literal324);

            char_literal325=(Token)match(input,107,FOLLOW_107_in_corr_sets3148);  
            stream_107.add(char_literal325);

            pushFollow(FOLLOW_corr_set_in_corr_sets3151);
            cs=corr_set();

            state._fsp--;

            stream_corr_set.add(cs.getTree());
            if (list_cs==null) list_cs=new ArrayList();
            list_cs.add(cs);

            char_literal326=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3153);  
            stream_SEMI.add(char_literal326);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:47: (cs+= corr_set ';' )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==ID) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:48: cs+= corr_set ';'
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets3158);
            	    cs=corr_set();

            	    state._fsp--;

            	    stream_corr_set.add(cs.getTree());
            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs);

            	    char_literal327=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3160);  
            	    stream_SEMI.add(char_literal327);


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            char_literal328=(Token)match(input,108,FOLLOW_108_in_corr_sets3164);  
            stream_108.add(char_literal328);



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
            // 329:71: -> ^( CORRSETS ( $cs)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:74: ^( CORRSETS ( $cs)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:1: corr_set : f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) ;
    public final BPELscriptParser.corr_set_return corr_set() throws RecognitionException {
        BPELscriptParser.corr_set_return retval = new BPELscriptParser.corr_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token f=null;
        Token char_literal329=null;
        Token char_literal330=null;
        Token char_literal331=null;
        Token par=null;
        List list_par=null;

        CommonTree f_tree=null;
        CommonTree char_literal329_tree=null;
        CommonTree char_literal330_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree par_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:10: (f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:12: f= ID '(' par+= ID ( ',' par+= ID )* ')'
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_corr_set3184);  
            stream_ID.add(f);

            char_literal329=(Token)match(input,113,FOLLOW_113_in_corr_set3186);  
            stream_113.add(char_literal329);

            par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3190);  
            stream_ID.add(par);

            if (list_par==null) list_par=new ArrayList();
            list_par.add(par);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:29: ( ',' par+= ID )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==110) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:30: ',' par+= ID
            	    {
            	    char_literal330=(Token)match(input,110,FOLLOW_110_in_corr_set3193);  
            	    stream_110.add(char_literal330);

            	    par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3197);  
            	    stream_ID.add(par);

            	    if (list_par==null) list_par=new ArrayList();
            	    list_par.add(par);


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            char_literal331=(Token)match(input,114,FOLLOW_114_in_corr_set3201);  
            stream_114.add(char_literal331);



            // AST REWRITE
            // elements: par, f
            // token labels: f
            // rule labels: retval
            // token list labels: par
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
            RewriteRuleTokenStream stream_par=new RewriteRuleTokenStream(adaptor,"token par", list_par);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 331:48: -> ^( CORRSET $f ( $par)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:51: ^( CORRSET $f ( $par)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:1: expr : ( s_expr | EXT_EXPR | funct_call );
    public final BPELscriptParser.expr_return expr() throws RecognitionException {
        BPELscriptParser.expr_return retval = new BPELscriptParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXT_EXPR333=null;
        BPELscriptParser.s_expr_return s_expr332 = null;

        BPELscriptParser.funct_call_return funct_call334 = null;


        CommonTree EXT_EXPR333_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:7: ( s_expr | EXT_EXPR | funct_call )
            int alt119=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==SEMI||LA119_1==PROP||LA119_1==114||(LA119_1>=132 && LA119_1<=133)||LA119_1==160||(LA119_1>=166 && LA119_1<=176)) ) {
                    alt119=1;
                }
                else if ( (LA119_1==113) ) {
                    alt119=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case INT:
            case 113:
                {
                alt119=1;
                }
                break;
            case EXT_EXPR:
                {
                alt119=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:9: s_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_s_expr_in_expr3224);
                    s_expr332=s_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, s_expr332.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:18: EXT_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EXT_EXPR333=(Token)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr3228); 
                    EXT_EXPR333_tree = (CommonTree)adaptor.create(EXT_EXPR333);
                    adaptor.addChild(root_0, EXT_EXPR333_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:29: funct_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funct_call_in_expr3232);
                    funct_call334=funct_call();

                    state._fsp--;

                    adaptor.addChild(root_0, funct_call334.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:1: funct_call : p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) ;
    public final BPELscriptParser.funct_call_return funct_call() throws RecognitionException {
        BPELscriptParser.funct_call_return retval = new BPELscriptParser.funct_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal335=null;
        Token char_literal336=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal335_tree=null;
        CommonTree char_literal336_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:12: (p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:14: p+= ID '(' (p+= ID )* ')'
            {
            p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3241);  
            stream_ID.add(p);

            if (list_p==null) list_p=new ArrayList();
            list_p.add(p);

            char_literal335=(Token)match(input,113,FOLLOW_113_in_funct_call3243);  
            stream_113.add(char_literal335);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:25: (p+= ID )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==ID) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:25: p+= ID
            	    {
            	    p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3247);  
            	    stream_ID.add(p);

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p);


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            char_literal336=(Token)match(input,114,FOLLOW_114_in_funct_call3250);  
            stream_114.add(char_literal336);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 335:35: -> ^( CALL ( ID )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:335:38: ^( CALL ( ID )+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:1: s_expr : condExpr ;
    public final BPELscriptParser.s_expr_return s_expr() throws RecognitionException {
        BPELscriptParser.s_expr_return retval = new BPELscriptParser.s_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.condExpr_return condExpr337 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:9: ( condExpr )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:11: condExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_s_expr3267);
            condExpr337=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr337.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:1: condExpr : aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? ;
    public final BPELscriptParser.condExpr_return condExpr() throws RecognitionException {
        BPELscriptParser.condExpr_return retval = new BPELscriptParser.condExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal339=null;
        Token string_literal340=null;
        Token char_literal341=null;
        Token char_literal342=null;
        Token string_literal343=null;
        Token string_literal344=null;
        BPELscriptParser.aexpr_return aexpr338 = null;

        BPELscriptParser.aexpr_return aexpr345 = null;


        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree char_literal341_tree=null;
        CommonTree char_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:11: ( aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:13: aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr3275);
            aexpr338=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr338.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:19: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=166 && LA122_0<=171)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
                    int alt121=6;
                    switch ( input.LA(1) ) {
                    case 166:
                        {
                        alt121=1;
                        }
                        break;
                    case 167:
                        {
                        alt121=2;
                        }
                        break;
                    case 168:
                        {
                        alt121=3;
                        }
                        break;
                    case 169:
                        {
                        alt121=4;
                        }
                        break;
                    case 170:
                        {
                        alt121=5;
                        }
                        break;
                    case 171:
                        {
                        alt121=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }

                    switch (alt121) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:22: '=='
                            {
                            string_literal339=(Token)match(input,166,FOLLOW_166_in_condExpr3280); 
                            string_literal339_tree = (CommonTree)adaptor.create(string_literal339);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal339_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:29: '!='
                            {
                            string_literal340=(Token)match(input,167,FOLLOW_167_in_condExpr3284); 
                            string_literal340_tree = (CommonTree)adaptor.create(string_literal340);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal340_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:36: '<'
                            {
                            char_literal341=(Token)match(input,168,FOLLOW_168_in_condExpr3288); 
                            char_literal341_tree = (CommonTree)adaptor.create(char_literal341);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal341_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:42: '>'
                            {
                            char_literal342=(Token)match(input,169,FOLLOW_169_in_condExpr3292); 
                            char_literal342_tree = (CommonTree)adaptor.create(char_literal342);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal342_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:48: '<='
                            {
                            string_literal343=(Token)match(input,170,FOLLOW_170_in_condExpr3296); 
                            string_literal343_tree = (CommonTree)adaptor.create(string_literal343);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal343_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:55: '>='
                            {
                            string_literal344=(Token)match(input,171,FOLLOW_171_in_condExpr3300); 
                            string_literal344_tree = (CommonTree)adaptor.create(string_literal344);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal344_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr3305);
                    aexpr345=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr345.getTree());

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:1: aexpr : mexpr ( ( '+' | '-' ) mexpr )* ;
    public final BPELscriptParser.aexpr_return aexpr() throws RecognitionException {
        BPELscriptParser.aexpr_return retval = new BPELscriptParser.aexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set347=null;
        BPELscriptParser.mexpr_return mexpr346 = null;

        BPELscriptParser.mexpr_return mexpr348 = null;


        CommonTree set347_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:8: ( mexpr ( ( '+' | '-' ) mexpr )* )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:10: mexpr ( ( '+' | '-' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr3316);
            mexpr346=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr346.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:16: ( ( '+' | '-' ) mexpr )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=172 && LA123_0<=173)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:338:17: ( '+' | '-' ) mexpr
            	    {
            	    set347=(Token)input.LT(1);
            	    set347=(Token)input.LT(1);
            	    if ( (input.LA(1)>=172 && input.LA(1)<=173) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set347), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr3327);
            	    mexpr348=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr348.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:1: mexpr : ( atom ( ( '*' | '/' ) atom )* | STRING );
    public final BPELscriptParser.mexpr_return mexpr() throws RecognitionException {
        BPELscriptParser.mexpr_return retval = new BPELscriptParser.mexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set350=null;
        Token STRING352=null;
        BPELscriptParser.atom_return atom349 = null;

        BPELscriptParser.atom_return atom351 = null;


        CommonTree set350_tree=null;
        CommonTree STRING352_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:8: ( atom ( ( '*' | '/' ) atom )* | STRING )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ID||LA125_0==INT||LA125_0==113) ) {
                alt125=1;
            }
            else if ( (LA125_0==STRING) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:10: atom ( ( '*' | '/' ) atom )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_mexpr3337);
                    atom349=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom349.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:15: ( ( '*' | '/' ) atom )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( ((LA124_0>=174 && LA124_0<=175)) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:16: ( '*' | '/' ) atom
                    	    {
                    	    set350=(Token)input.LT(1);
                    	    set350=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=174 && input.LA(1)<=175) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set350), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_atom_in_mexpr3348);
                    	    atom351=atom();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, atom351.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING352=(Token)match(input,STRING,FOLLOW_STRING_in_mexpr3354); 
                    STRING352_tree = (CommonTree)adaptor.create(STRING352);
                    adaptor.addChild(root_0, STRING352_tree);


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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:1: atom : ( path_expr | INT | '(' s_expr ')' -> s_expr );
    public final BPELscriptParser.atom_return atom() throws RecognitionException {
        BPELscriptParser.atom_return retval = new BPELscriptParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT354=null;
        Token char_literal355=null;
        Token char_literal357=null;
        BPELscriptParser.path_expr_return path_expr353 = null;

        BPELscriptParser.s_expr_return s_expr356 = null;


        CommonTree INT354_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree char_literal357_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_s_expr=new RewriteRuleSubtreeStream(adaptor,"rule s_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:7: ( path_expr | INT | '(' s_expr ')' -> s_expr )
            int alt126=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt126=1;
                }
                break;
            case INT:
                {
                alt126=2;
                }
                break;
            case 113:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:9: path_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_path_expr_in_atom3362);
                    path_expr353=path_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, path_expr353.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:21: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT354=(Token)match(input,INT,FOLLOW_INT_in_atom3366); 
                    INT354_tree = (CommonTree)adaptor.create(INT354);
                    adaptor.addChild(root_0, INT354_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:27: '(' s_expr ')'
                    {
                    char_literal355=(Token)match(input,113,FOLLOW_113_in_atom3370);  
                    stream_113.add(char_literal355);

                    pushFollow(FOLLOW_s_expr_in_atom3372);
                    s_expr356=s_expr();

                    state._fsp--;

                    stream_s_expr.add(s_expr356.getTree());
                    char_literal357=(Token)match(input,114,FOLLOW_114_in_atom3374);  
                    stream_114.add(char_literal357);



                    // AST REWRITE
                    // elements: s_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 340:42: -> s_expr
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:1: path_expr : pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) ;
    public final BPELscriptParser.path_expr_return path_expr() throws RecognitionException {
        BPELscriptParser.path_expr_return retval = new BPELscriptParser.path_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal358=null;
        List list_pelmt=null;
        RuleReturnScope pelmt = null;
        CommonTree char_literal358_tree=null;
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:11: (pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:13: pelmt+= ns_id ( '.' pelmt+= ns_id )*
            {
            pushFollow(FOLLOW_ns_id_in_path_expr3387);
            pelmt=ns_id();

            state._fsp--;

            stream_ns_id.add(pelmt.getTree());
            if (list_pelmt==null) list_pelmt=new ArrayList();
            list_pelmt.add(pelmt);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:26: ( '.' pelmt+= ns_id )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==176) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:27: '.' pelmt+= ns_id
            	    {
            	    char_literal358=(Token)match(input,176,FOLLOW_176_in_path_expr3390);  
            	    stream_176.add(char_literal358);

            	    pushFollow(FOLLOW_ns_id_in_path_expr3394);
            	    pelmt=ns_id();

            	    state._fsp--;

            	    stream_ns_id.add(pelmt.getTree());
            	    if (list_pelmt==null) list_pelmt=new ArrayList();
            	    list_pelmt.add(pelmt);


            	    }
            	    break;

            	default :
            	    break loop127;
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
            // 341:46: -> ^( PATH ( $pelmt)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:341:49: ^( PATH ( $pelmt)+ )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:1: ns_id : (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) ;
    public final BPELscriptParser.ns_id_return ns_id() throws RecognitionException {
        BPELscriptParser.ns_id_return retval = new BPELscriptParser.ns_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token pr=null;
        Token loc=null;
        Token string_literal359=null;

        CommonTree pr_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal359_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:8: ( (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:10: (pr= ID '::' )? loc= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:10: (pr= ID '::' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ID) ) {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==160) ) {
                    alt128=1;
                }
            }
            switch (alt128) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:11: pr= ID '::'
                    {
                    pr=(Token)match(input,ID,FOLLOW_ID_in_ns_id3417);  
                    stream_ID.add(pr);

                    string_literal359=(Token)match(input,160,FOLLOW_160_in_ns_id3419);  
                    stream_160.add(string_literal359);


                    }
                    break;

            }

            loc=(Token)match(input,ID,FOLLOW_ID_in_ns_id3425);  
            stream_ID.add(loc);



            // AST REWRITE
            // elements: loc, pr
            // token labels: loc, pr
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_loc=new RewriteRuleTokenStream(adaptor,"token loc",loc);
            RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 342:31: -> ^( NS ( $pr)? $loc)
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:34: ^( NS ( $pr)? $loc)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NS, "NS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:39: ( $pr)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:1: portType : ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) ;
    public final BPELscriptParser.portType_return portType() throws RecognitionException {
        BPELscriptParser.portType_return retval = new BPELscriptParser.portType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal360=null;
        Token string_literal361=null;
        Token STRING362=null;

        CommonTree string_literal360_tree=null;
        CommonTree string_literal361_tree=null;
        CommonTree STRING362_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:11: ( ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:13: ( '@portType' | '@pt' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:13: ( '@portType' | '@pt' )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==177) ) {
                alt129=1;
            }
            else if ( (LA129_0==178) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:14: '@portType'
                    {
                    string_literal360=(Token)match(input,177,FOLLOW_177_in_portType3449);  
                    stream_177.add(string_literal360);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:28: '@pt'
                    {
                    string_literal361=(Token)match(input,178,FOLLOW_178_in_portType3453);  
                    stream_178.add(string_literal361);


                    }
                    break;

            }

            STRING362=(Token)match(input,STRING,FOLLOW_STRING_in_portType3456);  
            stream_STRING.add(STRING362);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:3: -> ^( PORTTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:6: ^( PORTTYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:1: std_attr : ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) ;
    public final BPELscriptParser.std_attr_return std_attr() throws RecognitionException {
        BPELscriptParser.std_attr_return retval = new BPELscriptParser.std_attr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal363=null;

        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal363_tree=null;
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:10: ( ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:12: ( '@name' name= STRING )? (suppressJoinFailure= SJF )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:12: ( '@name' name= STRING )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==179) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:13: '@name' name= STRING
                    {
                    string_literal363=(Token)match(input,179,FOLLOW_179_in_std_attr3476);  
                    stream_179.add(string_literal363);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_std_attr3480);  
                    stream_STRING.add(name);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:54: (suppressJoinFailure= SJF )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==SJF) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:54: suppressJoinFailure= SJF
                    {
                    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_std_attr3486);  
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
            // 349:3: -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:349:6: ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STD_ATTR, "STD_ATTR"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:349:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:349:24: ( $suppressJoinFailure)?
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:1: msgEx : ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) ;
    public final BPELscriptParser.msgEx_return msgEx() throws RecognitionException {
        BPELscriptParser.msgEx_return retval = new BPELscriptParser.msgEx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal364=null;
        Token string_literal365=null;
        Token STRING366=null;

        CommonTree string_literal364_tree=null;
        CommonTree string_literal365_tree=null;
        CommonTree STRING366_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:8: ( ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:10: ( '@messageExchange' | '@mex' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:10: ( '@messageExchange' | '@mex' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==180) ) {
                alt132=1;
            }
            else if ( (LA132_0==181) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:11: '@messageExchange'
                    {
                    string_literal364=(Token)match(input,180,FOLLOW_180_in_msgEx3514);  
                    stream_180.add(string_literal364);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:351:32: '@mex'
                    {
                    string_literal365=(Token)match(input,181,FOLLOW_181_in_msgEx3518);  
                    stream_181.add(string_literal365);


                    }
                    break;

            }

            STRING366=(Token)match(input,STRING,FOLLOW_STRING_in_msgEx3521);  
            stream_STRING.add(STRING366);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 352:3: -> ^( MSGEX STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:352:6: ^( MSGEX STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:1: msgType : ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) ;
    public final BPELscriptParser.msgType_return msgType() throws RecognitionException {
        BPELscriptParser.msgType_return retval = new BPELscriptParser.msgType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token msgT=null;
        Token string_literal367=null;
        Token string_literal368=null;

        CommonTree msgT_tree=null;
        CommonTree string_literal367_tree=null;
        CommonTree string_literal368_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:10: ( ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:12: ( '@messageType' | '@msgType' ) msgT= STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:12: ( '@messageType' | '@msgType' )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==182) ) {
                alt133=1;
            }
            else if ( (LA133_0==183) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:13: '@messageType'
                    {
                    string_literal367=(Token)match(input,182,FOLLOW_182_in_msgType3541);  
                    stream_182.add(string_literal367);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:354:30: '@msgType'
                    {
                    string_literal368=(Token)match(input,183,FOLLOW_183_in_msgType3545);  
                    stream_183.add(string_literal368);


                    }
                    break;

            }

            msgT=(Token)match(input,STRING,FOLLOW_STRING_in_msgType3550);  
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
            // 355:3: -> ^( MSGTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:6: ^( MSGTYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:1: viType : '@type' type= STRING -> ^( VITYPE STRING ) ;
    public final BPELscriptParser.viType_return viType() throws RecognitionException {
        BPELscriptParser.viType_return retval = new BPELscriptParser.viType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token string_literal369=null;

        CommonTree type_tree=null;
        CommonTree string_literal369_tree=null;
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:9: ( '@type' type= STRING -> ^( VITYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:11: '@type' type= STRING
            {
            string_literal369=(Token)match(input,184,FOLLOW_184_in_viType3570);  
            stream_184.add(string_literal369);

            type=(Token)match(input,STRING,FOLLOW_STRING_in_viType3574);  
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
            // 359:3: -> ^( VITYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:359:6: ^( VITYPE STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:1: viElt : '@element' elt= STRING -> ^( VIELT STRING ) ;
    public final BPELscriptParser.viElt_return viElt() throws RecognitionException {
        BPELscriptParser.viElt_return retval = new BPELscriptParser.viElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token elt=null;
        Token string_literal370=null;

        CommonTree elt_tree=null;
        CommonTree string_literal370_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:8: ( '@element' elt= STRING -> ^( VIELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:10: '@element' elt= STRING
            {
            string_literal370=(Token)match(input,185,FOLLOW_185_in_viElt3594);  
            stream_185.add(string_literal370);

            elt=(Token)match(input,STRING,FOLLOW_STRING_in_viElt3598);  
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
            // 362:3: -> ^( VIELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:6: ^( VIELT STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:1: faultName : ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) ;
    public final BPELscriptParser.faultName_return faultName() throws RecognitionException {
        BPELscriptParser.faultName_return retval = new BPELscriptParser.faultName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal371=null;
        Token string_literal372=null;
        Token STRING373=null;

        CommonTree string_literal371_tree=null;
        CommonTree string_literal372_tree=null;
        CommonTree STRING373_tree=null;
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:11: ( ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:13: ( '@faultName' | '@fault' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:13: ( '@faultName' | '@fault' )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==186) ) {
                alt134=1;
            }
            else if ( (LA134_0==187) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:14: '@faultName'
                    {
                    string_literal371=(Token)match(input,186,FOLLOW_186_in_faultName3617);  
                    stream_186.add(string_literal371);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:364:29: '@fault'
                    {
                    string_literal372=(Token)match(input,187,FOLLOW_187_in_faultName3621);  
                    stream_187.add(string_literal372);


                    }
                    break;

            }

            STRING373=(Token)match(input,STRING,FOLLOW_STRING_in_faultName3624);  
            stream_STRING.add(STRING373);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 365:3: -> ^( FAULTNAME STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:365:6: ^( FAULTNAME STRING )
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:1: faultElt : '@faultElement' STRING -> ^( FAULTELT STRING ) ;
    public final BPELscriptParser.faultElt_return faultElt() throws RecognitionException {
        BPELscriptParser.faultElt_return retval = new BPELscriptParser.faultElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal374=null;
        Token STRING375=null;

        CommonTree string_literal374_tree=null;
        CommonTree STRING375_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:10: ( '@faultElement' STRING -> ^( FAULTELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:367:12: '@faultElement' STRING
            {
            string_literal374=(Token)match(input,188,FOLLOW_188_in_faultElt3642);  
            stream_188.add(string_literal374);

            STRING375=(Token)match(input,STRING,FOLLOW_STRING_in_faultElt3644);  
            stream_STRING.add(STRING375);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:3: -> ^( FAULTELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:6: ^( FAULTELT STRING )
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
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA14_eotS =
        "\24\uffff";
    static final String DFA14_eofS =
        "\24\uffff";
    static final String DFA14_minS =
        "\1\117\1\116\1\122\2\uffff\1\117\11\uffff\1\117\1\116\2\122\1\117";
    static final String DFA14_maxS =
        "\1\u00bb\1\116\1\u009c\2\uffff\1\u00bb\11\uffff\1\u009c\1\116\1"+
        "\u0091\1\u009c\1\u0091";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\5\uffff";
    static final String DFA14_specialS =
        "\24\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\12\1\uffff\1\16\1\5\2\11\1\12\1\uffff\3\16\1\uffff\1"+
            "\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3\2\uffff"+
            "\1\7\1\10\1\uffff\1\11\3\uffff\1\14\3\uffff\1\12\6\uffff\14"+
            "\16\4\uffff\4\16\1\15\13\uffff\2\16\1\1\2\16\4\uffff\2\16",
            "\1\17",
            "\1\16\11\uffff\1\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5"+
            "\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\7\uffff\1\12\6\uffff"+
            "\3\16\2\uffff\7\16",
            "",
            "",
            "\1\21\2\uffff\1\16\5\uffff\3\16\24\uffff\1\6\41\uffff\1\16"+
            "\41\uffff\1\20\2\16\4\uffff\2\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\1\16\11\uffff\1\13\22\uffff\1\6\3\uffff\2\16"+
            "\1\uffff\1\4\5\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff"+
            "\3\16\2\uffff\7\16",
            "\1\23",
            "\1\16\34\uffff\1\6\41\uffff\1\16",
            "\1\16\11\uffff\1\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5"+
            "\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\3\16\2\uffff"+
            "\7\16",
            "\1\21\2\uffff\1\16\34\uffff\1\6\41\uffff\1\16"
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
        "\1\117\3\116\1\122\1\uffff\1\117\2\116\1\uffff\2\116\16\uffff\2"+
        "\117\3\116\1\122\2\117\1\116\1\122\2\117\1\116\1\122\3\116\1\122"+
        "\4\117";
    static final String DFA13_maxS =
        "\1\u00bb\3\116\1\u009c\1\uffff\1\u00bb\2\116\1\uffff\2\116\16\uffff"+
        "\1\u00bb\1\u009c\3\116\1\u0091\1\u00b3\1\u00b5\1\116\1\u0093\1\u00b3"+
        "\1\u0091\1\116\1\u0092\3\116\1\u0092\1\u0093\1\u0092\1\u00b3\1\u0092";
    static final String DFA13_acceptS =
        "\5\uffff\1\1\3\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\1\16\1\17\1\20\26\uffff";
    static final String DFA13_specialS =
        "\60\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\2\uffff\1\15\1\6\4\uffff\3\15\30\uffff\1\20\1\21\34\uffff"+
            "\1\11\1\14\1\5\3\16\1\17\1\26\1\22\1\24\1\27\1\31\4\uffff\1"+
            "\30\1\23\2\25\14\uffff\1\1\1\2\1\3\1\7\1\10\4\uffff\1\12\1\13",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\15\40\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\2\uffff\1\16"+
            "\1\17\1\26\1\22\1\24\1\27\1\31",
            "",
            "\1\37\2\uffff\1\15\5\uffff\3\15\66\uffff\1\11\41\uffff\1\36"+
            "\1\34\1\35\4\uffff\2\15",
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
            "\1\43\2\uffff\1\15\1\6\4\uffff\3\15\66\uffff\1\11\1\14\1\5"+
            "\37\uffff\1\42\1\7\1\10\4\uffff\1\12\1\13",
            "\1\4\2\uffff\1\15\40\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5"+
            "\2\uffff\1\16\1\17\1\26\1\22\1\24\1\27\1\31",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\15\76\uffff\1\11",
            "\1\47\2\uffff\1\15\76\uffff\1\11\1\14\40\uffff\1\46",
            "\1\53\2\uffff\1\15\77\uffff\1\14\40\uffff\1\52\1\50\1\51",
            "\1\54",
            "\1\15\76\uffff\1\11\1\14\1\5",
            "\1\37\2\uffff\1\15\76\uffff\1\11\41\uffff\1\36",
            "\1\37\2\uffff\1\15\76\uffff\1\11",
            "\1\55",
            "\1\15\76\uffff\1\11\1\14",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\15\77\uffff\1\14",
            "\1\43\2\uffff\1\15\76\uffff\1\11\1\14\1\5",
            "\1\47\2\uffff\1\15\76\uffff\1\11\1\14",
            "\1\53\2\uffff\1\15\77\uffff\1\14\40\uffff\1\52",
            "\1\53\2\uffff\1\15\77\uffff\1\14"
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
    static final String DFA95_eotS =
        "\12\uffff";
    static final String DFA95_eofS =
        "\12\uffff";
    static final String DFA95_minS =
        "\1\60\2\116\1\uffff\1\116\1\u0091\2\uffff\2\117";
    static final String DFA95_maxS =
        "\1\u00b5\2\116\1\uffff\1\116\1\u0093\2\uffff\1\u00b5\1\u0093";
    static final String DFA95_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\2\uffff";
    static final String DFA95_specialS =
        "\12\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\7\35\uffff\1\7\1\5\2\uffff\1\7\1\3\15\uffff\1\7\17\uffff"+
            "\1\7\37\uffff\1\3\1\uffff\1\6\35\uffff\1\1\1\2\1\4\2\3",
            "\1\10",
            "\1\10",
            "",
            "\1\11",
            "\1\3\1\uffff\1\6",
            "",
            "",
            "\1\5\3\uffff\1\3\75\uffff\1\3\1\uffff\1\6\37\uffff\1\4\2\3",
            "\1\5\101\uffff\1\3\1\uffff\1\6"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "253:1: rvalue : ( receive | invoke | expr ( PROP )? );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program312 = new BitSet(new long[]{0x0000000000000002L,0x0000070020018000L,0x0100000060000000L});
    public static final BitSet FOLLOW_process_in_declaration331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_process364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_process368 = new BitSet(new long[]{0x0000000000000000L,0x0000060000018000L});
    public static final BitSet FOLLOW_105_in_process375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_process379 = new BitSet(new long[]{0x0000000000000000L,0x0000040000018000L});
    public static final BitSet FOLLOW_SJF_in_process388 = new BitSet(new long[]{0x0000000000000000L,0x0000040000010000L});
    public static final BitSet FOLLOW_EOSF_in_process395 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_process400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ns_id_in_process402 = new BitSet(new long[]{0x0000000000000000L,0x0600080000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_std_attr_in_process404 = new BitSet(new long[]{0x0000000000000000L,0x0600080000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ajoin_in_process410 = new BitSet(new long[]{0x0000000000000000L,0x0600080000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_asignal_in_process415 = new BitSet(new long[]{0x0000000000000000L,0x0600080000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_block_in_process421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_eventHdl_in_process423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_proc_stmts473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts475 = new BitSet(new long[]{0x0000000000000000L,0x90588000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts479 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_signal_in_proc_stmts484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts486 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_proc_stmt525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_receive_in_proc_stmt571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_reply_in_proc_stmt575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_assign_in_proc_stmt579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_exit_in_proc_stmt599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variables_in_proc_stmt605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_validate_in_proc_stmt609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_partner_links_in_proc_stmt613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_nop_in_proc_stmt621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_messages_in_proc_stmt625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_opaque_in_proc_stmt629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmt632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_block643 = new BitSet(new long[]{0x0000000000000000L,0x98588000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_proc_stmts_in_block645 = new BitSet(new long[]{0x0000000000000000L,0x98589000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_108_in_block648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_scope_block666 = new BitSet(new long[]{0x0000000000000000L,0x98589700377D8000L,0x0D3E003E7FFE0445L});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block668 = new BitSet(new long[]{0x0000000000000000L,0x98589700377D8000L,0x0D3E003E7FFE0445L});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block671 = new BitSet(new long[]{0x0000000000000000L,0x98589000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_108_in_scope_block674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_param_block694 = new BitSet(new long[]{0x0000000000000000L,0x9858B000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_109_in_param_block697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_param_block701 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_110_in_param_block704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_param_block708 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_109_in_param_block712 = new BitSet(new long[]{0x0000000000000000L,0x9858B000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block716 = new BitSet(new long[]{0x0000000000000000L,0x9858B000177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_108_in_param_block719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick754 = new BitSet(new long[]{0x0000000000000000L,0x0000800000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_std_attr_in_pick757 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_pick761 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_pick763 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0036000000000000L});
    public static final BitSet FOLLOW_onMessage_in_pick765 = new BitSet(new long[]{0x0000000000000000L,0x0639180000008000L,0x003E000000000000L});
    public static final BitSet FOLLOW_onAlarm_in_pick768 = new BitSet(new long[]{0x0000000000000000L,0x0638180000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_108_in_pick771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onMessage806 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_msgEx_in_onMessage809 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_onMessage814 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_onMessage820 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_onMessage822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_onMessage826 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_onMessage829 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_correlation_in_onMessage831 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_onMessage835 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_with_ex_in_onMessage837 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_param_block_in_onMessage850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_onAlarm915 = new BitSet(new long[]{0x0000000000000000L,0x0638180000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_timeout_in_onAlarm919 = new BitSet(new long[]{0x0000000000000000L,0x0638180000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm923 = new BitSet(new long[]{0x0000000000000000L,0x0638180000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_alarm963 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_alarm968 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_alarm970 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_alarm972 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_alarm974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_timeout999 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_timeout1004 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_timeout1006 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_timeout1007 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_timeout1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_repeatEvery1033 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_repeatEvery1035 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1037 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_repeatEvery1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_flow1058 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_flow1062 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_flow1066 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_flow1070 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_flow1074 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_120_in_signal1101 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_signal1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_signal1104 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_signal1107 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_signal1109 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_signal1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_asignal1132 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_asignal1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_asignal1135 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_asignal1138 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_asignal1140 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_asignal1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ajoin1164 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_ajoin1170 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_ajoin1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_ajoin1177 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_ajoin1182 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_ajoin1184 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ajoin1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_join1210 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_join1212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_join1216 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_join1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_join1223 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_join1228 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_join1230 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_join1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1256 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_if_ex1260 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_ex1262 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1266 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_if_ex1268 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_if_ex1272 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_125_in_if_ex1275 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_ex1277 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1281 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_if_ex1283 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_if_ex1287 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_126_in_if_ex1292 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_if_ex1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_sequence1347 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_ajoin_in_sequence1353 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_asignal_in_sequence1358 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_body_in_sequence1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ajoin_in_scope_sequence1397 = new BitSet(new long[]{0x0000000000000000L,0x9E78B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_asignal_in_scope_sequence1402 = new BitSet(new long[]{0x0000000000000000L,0x9E78B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1436 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_while_ex1441 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_ex1443 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_while_ex1445 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_while_ex1447 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_while_ex1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_until_ex1476 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_sequence_in_until_ex1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_until_ex1482 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_until_ex1484 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_until_ex1486 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_until_ex1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000208000L,0x0008000000000004L});
    public static final BitSet FOLLOW_SBO_in_foreach1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0008000000000004L});
    public static final BitSet FOLLOW_std_attr_in_foreach1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_foreach1526 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_foreach1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_foreach1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_foreach1534 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_foreach1541 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1543 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1548 = new BitSet(new long[]{0x0000000000000000L,0x0004000000020000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_foreach1552 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1554 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1559 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_foreach1563 = new BitSet(new long[]{0x0000000000000000L,0x9E78B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_scope_short_in_foreach1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_try_ex1605 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_body_in_try_ex1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000380L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000380L});
    public static final BitSet FOLLOW_catchAll_in_try_ex1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_catch_ex1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_catch_ex1653 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_catch_ex1655 = new BitSet(new long[]{0x0000000000000000L,0x00000000070C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex1657 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_catch_ex1660 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_param_block_in_catch_ex1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_catchAll1692 = new BitSet(new long[]{0x0000000000000000L,0x0600080000008000L,0x0008000000000000L});
    public static final BitSet FOLLOW_block_in_catchAll1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SJF_in_scope_ex1719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_scope_ex1724 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_113_in_scope_ex1727 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L});
    public static final BitSet FOLLOW_ID_in_scope_ex1729 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_scope_ex1732 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000005800L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000005800L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt1795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_termination_in_scope_stmt1798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_termination1828 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_body_in_termination1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_eventHdl1848 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_eventHdl1850 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0EFE003E1FFE2445L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl1852 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0EFE003E1FFE2445L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl1855 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_108_in_eventHdl1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onEvent1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x02F0000000002000L});
    public static final BitSet FOLLOW_msgEx_in_onEvent1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x02C0000000002000L});
    public static final BitSet FOLLOW_msgType_in_onEvent1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000002000L});
    public static final BitSet FOLLOW_viElt_in_onEvent1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_onEvent1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_onEvent1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_onEvent1919 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent1921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_onEvent1925 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_onEvent1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_onEvent1931 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_onEvent1934 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_correlation_in_onEvent1936 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_onEvent1940 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0C3E003E1FFE8445L});
    public static final BitSet FOLLOW_with_ex_in_onEvent1942 = new BitSet(new long[]{0x0000000000000000L,0x9E7AB800177D8000L,0x0C3E003E1FFE8445L});
    public static final BitSet FOLLOW_scope_short_in_onEvent1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_compensation1996 = new BitSet(new long[]{0x0000000000000000L,0x9E58B800177D8000L,0x0C3E003E1FFE0445L});
    public static final BitSet FOLLOW_body_in_compensation1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_with_ex2017 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_with_ex2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2023 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_with_ex2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2030 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_114_in_with_ex2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_with_map2060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_with_map2062 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_KEY_in_with_map2064 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_path_expr_in_with_map2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_receive2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L,0x0038000000020000L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0038000000020000L});
    public static final BitSet FOLLOW_msgEx_in_receive2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0008000000020000L});
    public static final BitSet FOLLOW_std_attr_in_receive2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_receive2111 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_receive2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_receive2117 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_receive2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_receive2123 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_receive2126 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_correlation_in_receive2128 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_receive2132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_with_ex_in_receive2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_reply2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0C38000000040000L});
    public static final BitSet FOLLOW_faultName_in_reply2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0038000000040000L});
    public static final BitSet FOLLOW_msgEx_in_reply2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0008000000040000L});
    public static final BitSet FOLLOW_std_attr_in_reply2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_reply2188 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_reply2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_reply2194 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_reply2196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_reply2200 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_reply2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_reply2207 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_reply2212 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_correlation_in_reply2214 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_reply2218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_with_ex_in_reply2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_invoke2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0008000000080000L});
    public static final BitSet FOLLOW_std_attr_in_invoke2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_invoke2270 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_invoke2276 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_invoke2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_invoke2282 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_invoke2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_invoke2289 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_invoke2294 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_correlation_in_invoke2296 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_invoke2300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_with_ex_in_invoke2302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_compensation_in_invoke2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_assign2347 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2350 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_VALID_in_assign2353 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2356 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_assign2359 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_faultName_in_assign2362 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_msgEx_in_assign2365 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_std_attr_in_assign2368 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_path_expr_in_assign2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_PROP_in_assign2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_assign2378 = new BitSet(new long[]{0x0001000000000000L,0x00020002070CC000L,0x0C3E0000000A0000L});
    public static final BitSet FOLLOW_rvalue_in_assign2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_rvalue2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue2438 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_throw_ex2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_149_in_throw_ex2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_throw_ex2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0008000000400000L});
    public static final BitSet FOLLOW_std_attr_in_throw_ex2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_throw_ex2469 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_throw_ex2471 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex2473 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_throw_ex2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_rethrow_ex2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_compensate2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_compensate2525 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_compensate2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_compensate2532 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_compensate2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_exit2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_exit2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_validate2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_validate2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_validate2591 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_validate2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_validate2598 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_std_attr_in_ext_act2622 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_nop2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_nop2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_opaque2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_opaque2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_namespace2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_namespace2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_namespace2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_namespace2705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_namespace2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUSTUND_in_extension2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_extension2734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_extension2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_extension2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_extension2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_extension2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_viType_in_imports2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_imports2773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_imports2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_imports2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_ID_in_imports2785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_imports2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_imports2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_imports2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_messages2830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_message_in_messages2834 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_messages2837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_message_in_messages2841 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_message2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_variables2879 = new BitSet(new long[]{0x0000000000000000L,0x0000070020058000L,0x03C0000060000000L});
    public static final BitSet FOLLOW_variable_in_variables2883 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_variables2886 = new BitSet(new long[]{0x0000000000000000L,0x0000070020058000L,0x03C0000060000000L});
    public static final BitSet FOLLOW_variable_in_variables2890 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_msgType_in_variable2914 = new BitSet(new long[]{0x0000000000000000L,0x0000070020058000L,0x0300000060000000L});
    public static final BitSet FOLLOW_viType_in_variable2917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0200000000000000L});
    public static final BitSet FOLLOW_viElt_in_variable2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_variable2925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_with_ex_in_variable2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_partner_links2961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_164_in_partner_links2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links2970 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_partner_links2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links2977 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_partner_link2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_partner_link3001 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3003 = new BitSet(new long[]{0x0000000000000000L,0x00044000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3007 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_partner_link3011 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3015 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_partner_link3020 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link3024 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_partner_link3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partner_link3033 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_partner_link3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_correlation3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000180040000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3075 = new BitSet(new long[]{0x0000000000000000L,0x0000500000000000L});
    public static final BitSet FOLLOW_110_in_correlation3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000180040000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3080 = new BitSet(new long[]{0x0000000000000000L,0x0000500000000000L});
    public static final BitSet FOLLOW_108_in_correlation3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping3104 = new BitSet(new long[]{0x0000000000000000L,0x0000000100040000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping3111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_corr_mapping3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_corr_sets3146 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_corr_sets3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3153 = new BitSet(new long[]{0x0000000000000000L,0x0000100000040000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3160 = new BitSet(new long[]{0x0000000000000000L,0x0000100000040000L});
    public static final BitSet FOLLOW_108_in_corr_sets3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_corr_set3184 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_corr_set3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_corr_set3190 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_110_in_corr_set3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_corr_set3197 = new BitSet(new long[]{0x0000000000000000L,0x0004400000000000L});
    public static final BitSet FOLLOW_114_in_corr_set3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_expr_in_expr3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funct_call3241 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_funct_call3243 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L});
    public static final BitSet FOLLOW_ID_in_funct_call3247 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L});
    public static final BitSet FOLLOW_114_in_funct_call3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_s_expr3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3275 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000FC000000000L});
    public static final BitSet FOLLOW_166_in_condExpr3280 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_167_in_condExpr3284 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_168_in_condExpr3288 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_169_in_condExpr3292 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_170_in_condExpr3296 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_171_in_condExpr3300 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_set_in_aexpr3319 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_mexpr3340 = new BitSet(new long[]{0x0000000000000000L,0x00020002070C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_STRING_in_mexpr3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_atom3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_atom3370 = new BitSet(new long[]{0x0000000000000000L,0x00020002070CC000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_s_expr_in_atom3372 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_atom3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_path_expr3390 = new BitSet(new long[]{0x0000000000000000L,0x00000000078C8000L,0x0C3E000000000000L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3394 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ID_in_ns_id3417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_ns_id3419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_ns_id3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_portType3449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_178_in_portType3453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_portType3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_std_attr3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_std_attr3480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_SJF_in_std_attr3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_msgEx3514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_181_in_msgEx3518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_msgEx3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_msgType3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_183_in_msgType3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_msgType3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_viType3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_viType3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_viElt3594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_viElt3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_faultName3617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_187_in_faultName3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_faultName3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_faultElt3642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_faultElt3644 = new BitSet(new long[]{0x0000000000000002L});

}