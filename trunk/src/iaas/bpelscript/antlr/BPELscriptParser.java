// $ANTLR 3.1b2 /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g 2008-11-11 13:26:06

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BPELscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "STRING", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'@queryLanguage'", "'@expressionLanguage'", "'process'", "'{'", "'}'", "'|'", "','", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@name'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'"
    };
    public static final int MSGEX=71;
    public static final int T__159=159;
    public static final int WHILE=13;
    public static final int T__158=158;
    public static final int LETTER=97;
    public static final int NOP=44;
    public static final int FAULTNAME=72;
    public static final int T__160=160;
    public static final int REPEATEVERY=67;
    public static final int PARTNERLINKS=63;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int INIT_COR=94;
    public static final int EVENTHDL=68;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int IMPORT=55;
    public static final int CATCH_ALL=27;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int PICK=6;
    public static final int PATH=52;
    public static final int EXTENSIONACT=54;
    public static final int FLOWS=9;
    public static final int VALID=87;
    public static final int ONMESSAGE=31;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int TIMEOUT=24;
    public static final int T__153=153;
    public static final int EXIT=23;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int PID=61;
    public static final int RETHROW=45;
    public static final int NS=51;
    public static final int KEY=86;
    public static final int MESSAGES=56;
    public static final int ELSE=12;
    public static final int INT=96;
    public static final int PORTTYPE=64;
    public static final int CORRELATION=34;
    public static final int SJF=78;
    public static final int WAIT=22;
    public static final int CORR_MAP=35;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int VIELT=75;
    public static final int T__140=140;
    public static final int TRY=25;
    public static final int T__145=145;
    public static final int NAMESPACE=50;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int CREATE_INST=82;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int VITYPE=74;
    public static final int T__125=125;
    public static final int SEQUENCE=7;
    public static final int T__128=128;
    public static final int SL_COMMENTS=101;
    public static final int PATTERN_COR=95;
    public static final int T__127=127;
    public static final int WS=102;
    public static final int T__129=129;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int CORRSET=58;
    public static final int UNTIL=14;
    public static final int REPLY=19;
    public static final int EXT_ACT=91;
    public static final int SBO=84;
    public static final int EOSF=79;
    public static final int CALL=49;
    public static final int ELSIF=11;
    public static final int CATCH=26;
    public static final int INVOKE=16;
    public static final int T__130=130;
    public static final int XML=59;
    public static final int T__131=131;
    public static final int THROW=21;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int KEEPSRC=88;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int COMPENSATE=33;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int PARALLEL=83;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int FOR=15;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int ALARM=30;
    public static final int ID=81;
    public static final int PROP=90;
    public static final int ONALARM=66;
    public static final int IF=10;
    public static final int EXPR=46;
    public static final int EXT_EXPR=47;
    public static final int SCOPE=28;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int SIGNAL=40;
    public static final int T__106=106;
    public static final int STD_ATTR=65;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int MESSAGE=69;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int DIGIT=98;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int BLOCK_PARAM=39;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int ISOLATED=85;
    public static final int MUSTUND=92;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int JS=60;
    public static final int T__181=181;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=89;
    public static final int EVENT=29;
    public static final int MSGTYPE=73;
    public static final int SEMI=80;
    public static final int FAULTELT=76;
    public static final int ROOT=4;
    public static final int JOIN=41;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int COMPENSATION=32;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int VALIDATE=38;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ESCAPE_SEQ=99;
    public static final int TERMINATION=70;
    public static final int MAP=43;
    public static final int VARIABLES=62;
    public static final int ASSIGN=20;
    public static final int XML_LITERAL=48;
    public static final int CORRSETS=57;
    public static final int INITPARTNER=93;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=100;
    public static final int T__169=169;
    public static final int EXTENSION=53;
    public static final int RECEIVE=18;
    public static final int STRING=77;

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
    public String getGrammarFileName() { return "/home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:1: program : ( declaration )+ -> ^( ROOT ( declaration )+ ) ;
    public final BPELscriptParser.program_return program() throws RecognitionException {
        BPELscriptParser.program_return retval = new BPELscriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.declaration_return declaration1 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:9: ( ( declaration )+ -> ^( ROOT ( declaration )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:11: ( declaration )+
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:11: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SJF && LA1_0<=EOSF)||LA1_0==MUSTUND||(LA1_0>=103 && LA1_0<=105)||(LA1_0>=155 && LA1_0<=156)||LA1_0==182) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program306);
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
            // 76:24: -> ^( ROOT ( declaration )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:76:27: ^( ROOT ( declaration )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:78:1: declaration : ( process | sub_declaration );
    public final BPELscriptParser.declaration_return declaration() throws RecognitionException {
        BPELscriptParser.declaration_return retval = new BPELscriptParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.process_return process2 = null;

        BPELscriptParser.sub_declaration_return sub_declaration3 = null;



        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:78:13: ( process | sub_declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=SJF && LA2_0<=EOSF)||(LA2_0>=103 && LA2_0<=105)) ) {
                alt2=1;
            }
            else if ( (LA2_0==MUSTUND||(LA2_0>=155 && LA2_0<=156)||LA2_0==182) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:78:15: process
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_process_in_declaration325);
                    process2=process();

                    state._fsp--;

                    adaptor.addChild(root_0, process2.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:78:25: sub_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sub_declaration_in_declaration329);
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:80:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptParser.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptParser.sub_declaration_return retval = new BPELscriptParser.sub_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.namespace_return namespace4 = null;

        BPELscriptParser.extension_return extension5 = null;

        BPELscriptParser.imports_return imports6 = null;



        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:81:3: ( namespace | extension | imports )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt3=1;
                }
                break;
            case MUSTUND:
            case 156:
                {
                alt3=2;
                }
                break;
            case 182:
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:81:5: namespace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_sub_declaration339);
                    namespace4=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace4.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:81:17: extension
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_extension_in_sub_declaration343);
                    extension5=extension();

                    state._fsp--;

                    adaptor.addChild(root_0, extension5.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:81:29: imports
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_imports_in_sub_declaration347);
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:84:1: process : ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:85:2: ( ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:85:4: ( '@queryLanguage' queryLg= STRING )? ( '@expressionLanguage' exprLg= STRING )? (sjf= SJF )? (exitOnStandardFault= EOSF )? 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:85:4: ( '@queryLanguage' queryLg= STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==103) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:85:5: '@queryLanguage' queryLg= STRING
                    {
                    string_literal7=(Token)match(input,103,FOLLOW_103_in_process358);  
                    stream_103.add(string_literal7);

                    queryLg=(Token)match(input,STRING,FOLLOW_STRING_in_process362);  
                    stream_STRING.add(queryLg);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:86:3: ( '@expressionLanguage' exprLg= STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==104) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:86:4: '@expressionLanguage' exprLg= STRING
                    {
                    string_literal8=(Token)match(input,104,FOLLOW_104_in_process369);  
                    stream_104.add(string_literal8);

                    exprLg=(Token)match(input,STRING,FOLLOW_STRING_in_process373);  
                    stream_STRING.add(exprLg);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:87:6: (sjf= SJF )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SJF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:87:6: sjf= SJF
                    {
                    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_process382);  
                    stream_SJF.add(sjf);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:88:22: (exitOnStandardFault= EOSF )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOSF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:88:22: exitOnStandardFault= EOSF
                    {
                    exitOnStandardFault=(Token)match(input,EOSF,FOLLOW_EOSF_in_process389);  
                    stream_EOSF.add(exitOnStandardFault);


                    }
                    break;

            }

            string_literal9=(Token)match(input,105,FOLLOW_105_in_process394);  
            stream_105.add(string_literal9);

            pushFollow(FOLLOW_ns_id_in_process396);
            ns_id10=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id10.getTree());
            pushFollow(FOLLOW_std_attr_in_process398);
            std_attr11=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr11.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:90:4: (j+= ajoin )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==121) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:90:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_process404);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:90:14: (s+= asignal )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==120) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:90:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_process409);
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

            pushFollow(FOLLOW_block_in_process415);
            block12=block();

            state._fsp--;

            stream_block.add(block12.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:91:9: ( eventHdl )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==139) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:91:9: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process417);
                    eventHdl13=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl13.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ajoin, std_attr, exitOnStandardFault, sjf, ns_id, queryLg, asignal, exprLg, block, eventHdl
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
            // 92:2: -> ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:5: ^( PROCESS ns_id block ( eventHdl )? ( $queryLg)? ( $exprLg)? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCESS, "PROCESS"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:27: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:37: ( $queryLg)?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextNode());

                }
                stream_queryLg.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:47: ( $exprLg)?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextNode());

                }
                stream_exprLg.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:56: ( $sjf)?
                if ( stream_sjf.hasNext() ) {
                    adaptor.addChild(root_1, stream_sjf.nextNode());

                }
                stream_sjf.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:62: ( $exitOnStandardFault)?
                if ( stream_exitOnStandardFault.hasNext() ) {
                    adaptor.addChild(root_1, stream_exitOnStandardFault.nextNode());

                }
                stream_exitOnStandardFault.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:93: ( ajoin )?
                if ( stream_ajoin.hasNext() ) {
                    adaptor.addChild(root_1, stream_ajoin.nextTree());

                }
                stream_ajoin.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:92:100: ( asignal )*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:94:1: proc_stmts : ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) ;
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:2: ( ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:4: ( join SEMI )? proc_stmt (s+= signal SEMI )*
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:4: ( join SEMI )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==122) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:5: join SEMI
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts467);
                    join14=join();

                    state._fsp--;

                    stream_join.add(join14.getTree());
                    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts469);  
                    stream_SEMI.add(SEMI15);


                    }
                    break;

            }

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts473);
            proc_stmt16=proc_stmt();

            state._fsp--;

            stream_proc_stmt.add(proc_stmt16.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:27: (s+= signal SEMI )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==119) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:95:28: s+= signal SEMI
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts478);
            	    s=signal();

            	    state._fsp--;

            	    stream_signal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);

            	    SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts480);  
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
            // 96:2: -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:96:6: ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_STMTS, "PROC_STMTS"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:96:19: ( join )?
                if ( stream_join.hasNext() ) {
                    adaptor.addChild(root_1, stream_join.nextTree());

                }
                stream_join.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:96:25: ( signal )*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:98:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI ) );
    public final BPELscriptParser.proc_stmt_return proc_stmt() throws RecognitionException {
        BPELscriptParser.proc_stmt_return retval = new BPELscriptParser.proc_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI43=null;
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


        CommonTree SEMI43_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:99:2: ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI ) )
            int alt14=11;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:3: if_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_ex_in_proc_stmt511);
                    if_ex18=if_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, if_ex18.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:11: flow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flow_in_proc_stmt515);
                    flow19=flow();

                    state._fsp--;

                    adaptor.addChild(root_0, flow19.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:18: pick
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pick_in_proc_stmt519);
                    pick20=pick();

                    state._fsp--;

                    adaptor.addChild(root_0, pick20.getTree());

                    }
                    break;
                case 4 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:25: while_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_ex_in_proc_stmt523);
                    while_ex21=while_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, while_ex21.getTree());

                    }
                    break;
                case 5 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:36: until_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_until_ex_in_proc_stmt527);
                    until_ex22=until_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, until_ex22.getTree());

                    }
                    break;
                case 6 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:47: foreach
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_in_proc_stmt531);
                    foreach23=foreach();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach23.getTree());

                    }
                    break;
                case 7 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:57: scope_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scope_ex_in_proc_stmt535);
                    scope_ex24=scope_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, scope_ex24.getTree());

                    }
                    break;
                case 8 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:100:68: ext_act
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ext_act_in_proc_stmt539);
                    ext_act25=ext_act();

                    state._fsp--;

                    adaptor.addChild(root_0, ext_act25.getTree());

                    }
                    break;
                case 9 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:101:5: try_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_ex_in_proc_stmt546);
                    try_ex26=try_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, try_ex26.getTree());

                    }
                    break;
                case 10 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:101:14: corr_sets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_corr_sets_in_proc_stmt550);
                    corr_sets27=corr_sets();

                    state._fsp--;

                    adaptor.addChild(root_0, corr_sets27.getTree());

                    }
                    break;
                case 11 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI )
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI
                    {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages )
                    int alt13=15;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:7: invoke
                            {
                            pushFollow(FOLLOW_invoke_in_proc_stmt561);
                            invoke28=invoke();

                            state._fsp--;

                            adaptor.addChild(root_0, invoke28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:16: receive
                            {
                            pushFollow(FOLLOW_receive_in_proc_stmt565);
                            receive29=receive();

                            state._fsp--;

                            adaptor.addChild(root_0, receive29.getTree());

                            }
                            break;
                        case 3 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:26: reply
                            {
                            pushFollow(FOLLOW_reply_in_proc_stmt569);
                            reply30=reply();

                            state._fsp--;

                            adaptor.addChild(root_0, reply30.getTree());

                            }
                            break;
                        case 4 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:34: assign
                            {
                            pushFollow(FOLLOW_assign_in_proc_stmt573);
                            assign31=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign31.getTree());

                            }
                            break;
                        case 5 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:43: throw_ex
                            {
                            pushFollow(FOLLOW_throw_ex_in_proc_stmt577);
                            throw_ex32=throw_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, throw_ex32.getTree());

                            }
                            break;
                        case 6 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:54: rethrow_ex
                            {
                            pushFollow(FOLLOW_rethrow_ex_in_proc_stmt581);
                            rethrow_ex33=rethrow_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, rethrow_ex33.getTree());

                            }
                            break;
                        case 7 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:67: alarm
                            {
                            pushFollow(FOLLOW_alarm_in_proc_stmt585);
                            alarm34=alarm();

                            state._fsp--;

                            adaptor.addChild(root_0, alarm34.getTree());

                            }
                            break;
                        case 8 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:75: timeout
                            {
                            pushFollow(FOLLOW_timeout_in_proc_stmt589);
                            timeout35=timeout();

                            state._fsp--;

                            adaptor.addChild(root_0, timeout35.getTree());

                            }
                            break;
                        case 9 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:103:85: exit
                            {
                            pushFollow(FOLLOW_exit_in_proc_stmt593);
                            exit36=exit();

                            state._fsp--;

                            adaptor.addChild(root_0, exit36.getTree());

                            }
                            break;
                        case 10 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:5: variables
                            {
                            pushFollow(FOLLOW_variables_in_proc_stmt599);
                            variables37=variables();

                            state._fsp--;

                            adaptor.addChild(root_0, variables37.getTree());

                            }
                            break;
                        case 11 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:17: validate
                            {
                            pushFollow(FOLLOW_validate_in_proc_stmt603);
                            validate38=validate();

                            state._fsp--;

                            adaptor.addChild(root_0, validate38.getTree());

                            }
                            break;
                        case 12 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:28: partner_links
                            {
                            pushFollow(FOLLOW_partner_links_in_proc_stmt607);
                            partner_links39=partner_links();

                            state._fsp--;

                            adaptor.addChild(root_0, partner_links39.getTree());

                            }
                            break;
                        case 13 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:44: compensate
                            {
                            pushFollow(FOLLOW_compensate_in_proc_stmt611);
                            compensate40=compensate();

                            state._fsp--;

                            adaptor.addChild(root_0, compensate40.getTree());

                            }
                            break;
                        case 14 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:57: nop
                            {
                            pushFollow(FOLLOW_nop_in_proc_stmt615);
                            nop41=nop();

                            state._fsp--;

                            adaptor.addChild(root_0, nop41.getTree());

                            }
                            break;
                        case 15 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:104:63: messages
                            {
                            pushFollow(FOLLOW_messages_in_proc_stmt619);
                            messages42=messages();

                            state._fsp--;

                            adaptor.addChild(root_0, messages42.getTree());

                            }
                            break;

                    }

                    SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmt622); 

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:1: block : '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) ;
    public final BPELscriptParser.block_return block() throws RecognitionException {
        BPELscriptParser.block_return retval = new BPELscriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal44=null;
        Token char_literal46=null;
        BPELscriptParser.proc_stmts_return proc_stmts45 = null;


        CommonTree char_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:8: ( '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:10: '{' ( proc_stmts )+ '}'
            {
            char_literal44=(Token)match(input,106,FOLLOW_106_in_block633);  
            stream_106.add(char_literal44);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:14: ( proc_stmts )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=SJF && LA15_0<=EOSF)||(LA15_0>=ID && LA15_0<=ISOLATED)||(LA15_0>=VALID && LA15_0<=IGNORE)||LA15_0==EXT_ACT||LA15_0==106||LA15_0==110||(LA15_0>=114 && LA15_0<=115)||LA15_0==117||(LA15_0>=120 && LA15_0<=123)||(LA15_0>=126 && LA15_0<=127)||LA15_0==129||LA15_0==133||LA15_0==137||(LA15_0>=144 && LA15_0<=154)||(LA15_0>=159 && LA15_0<=163)||(LA15_0>=175 && LA15_0<=179)||(LA15_0>=184 && LA15_0<=185)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:14: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block635);
            	    proc_stmts45=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts45.getTree());

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

            char_literal46=(Token)match(input,107,FOLLOW_107_in_block638);  
            stream_107.add(char_literal46);



            // AST REWRITE
            // elements: proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:30: -> ^( SEQUENCE ( proc_stmts )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:106:33: ^( SEQUENCE ( proc_stmts )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:1: scope_block : '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) ;
    public final BPELscriptParser.scope_block_return scope_block() throws RecognitionException {
        BPELscriptParser.scope_block_return retval = new BPELscriptParser.scope_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal47=null;
        Token char_literal50=null;
        BPELscriptParser.sub_declaration_return sub_declaration48 = null;

        BPELscriptParser.proc_stmts_return proc_stmts49 = null;


        CommonTree char_literal47_tree=null;
        CommonTree char_literal50_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_sub_declaration=new RewriteRuleSubtreeStream(adaptor,"rule sub_declaration");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:13: ( '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:15: '{' ( sub_declaration )* ( proc_stmts )+ '}'
            {
            char_literal47=(Token)match(input,106,FOLLOW_106_in_scope_block656);  
            stream_106.add(char_literal47);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:19: ( sub_declaration )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MUSTUND||(LA16_0>=155 && LA16_0<=156)||LA16_0==182) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:19: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block658);
            	    sub_declaration48=sub_declaration();

            	    state._fsp--;

            	    stream_sub_declaration.add(sub_declaration48.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:36: ( proc_stmts )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=SJF && LA17_0<=EOSF)||(LA17_0>=ID && LA17_0<=ISOLATED)||(LA17_0>=VALID && LA17_0<=IGNORE)||LA17_0==EXT_ACT||LA17_0==106||LA17_0==110||(LA17_0>=114 && LA17_0<=115)||LA17_0==117||(LA17_0>=120 && LA17_0<=123)||(LA17_0>=126 && LA17_0<=127)||LA17_0==129||LA17_0==133||LA17_0==137||(LA17_0>=144 && LA17_0<=154)||(LA17_0>=159 && LA17_0<=163)||(LA17_0>=175 && LA17_0<=179)||(LA17_0>=184 && LA17_0<=185)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:36: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block661);
            	    proc_stmts49=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts49.getTree());

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

            char_literal50=(Token)match(input,107,FOLLOW_107_in_scope_block664);  
            stream_107.add(char_literal50);



            // AST REWRITE
            // elements: sub_declaration, proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:52: -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:55: ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:108:66: ( sub_declaration )*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:1: param_block : '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) ;
    public final BPELscriptParser.param_block_return param_block() throws RecognitionException {
        BPELscriptParser.param_block_return retval = new BPELscriptParser.param_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token in=null;
        List list_in=null;
        BPELscriptParser.proc_stmts_return proc_stmts55 = null;


        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree in_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:13: ( '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:15: '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}'
            {
            char_literal51=(Token)match(input,106,FOLLOW_106_in_param_block684);  
            stream_106.add(char_literal51);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:19: ( '|' in+= ID ( ',' in+= ID )* '|' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==108) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:20: '|' in+= ID ( ',' in+= ID )* '|'
                    {
                    char_literal52=(Token)match(input,108,FOLLOW_108_in_param_block687);  
                    stream_108.add(char_literal52);

                    in=(Token)match(input,ID,FOLLOW_ID_in_param_block691);  
                    stream_ID.add(in);

                    if (list_in==null) list_in=new ArrayList();
                    list_in.add(in);

                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:31: ( ',' in+= ID )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==109) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:32: ',' in+= ID
                    	    {
                    	    char_literal53=(Token)match(input,109,FOLLOW_109_in_param_block694);  
                    	    stream_109.add(char_literal53);

                    	    in=(Token)match(input,ID,FOLLOW_ID_in_param_block698);  
                    	    stream_ID.add(in);

                    	    if (list_in==null) list_in=new ArrayList();
                    	    list_in.add(in);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    char_literal54=(Token)match(input,108,FOLLOW_108_in_param_block702);  
                    stream_108.add(char_literal54);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:51: ( proc_stmts )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=SJF && LA20_0<=EOSF)||(LA20_0>=ID && LA20_0<=ISOLATED)||(LA20_0>=VALID && LA20_0<=IGNORE)||LA20_0==EXT_ACT||LA20_0==106||LA20_0==110||(LA20_0>=114 && LA20_0<=115)||LA20_0==117||(LA20_0>=120 && LA20_0<=123)||(LA20_0>=126 && LA20_0<=127)||LA20_0==129||LA20_0==133||LA20_0==137||(LA20_0>=144 && LA20_0<=154)||(LA20_0>=159 && LA20_0<=163)||(LA20_0>=175 && LA20_0<=179)||(LA20_0>=184 && LA20_0<=185)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:51: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block706);
            	    proc_stmts55=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts55.getTree());

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

            char_literal56=(Token)match(input,107,FOLLOW_107_in_param_block709);  
            stream_107.add(char_literal56);



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
            // 110:67: -> ^( SEQUENCE ( $in)* ( proc_stmts )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:70: ^( SEQUENCE ( $in)* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:110:81: ( $in)*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:112:1: body : ( block | proc_stmts );
    public final BPELscriptParser.body_return body() throws RecognitionException {
        BPELscriptParser.body_return retval = new BPELscriptParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.block_return block57 = null;

        BPELscriptParser.proc_stmts_return proc_stmts58 = null;



        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:112:7: ( block | proc_stmts )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==106) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=SJF && LA21_0<=EOSF)||(LA21_0>=ID && LA21_0<=ISOLATED)||(LA21_0>=VALID && LA21_0<=IGNORE)||LA21_0==EXT_ACT||LA21_0==110||(LA21_0>=114 && LA21_0<=115)||LA21_0==117||(LA21_0>=122 && LA21_0<=123)||(LA21_0>=126 && LA21_0<=127)||LA21_0==129||LA21_0==133||LA21_0==137||(LA21_0>=144 && LA21_0<=154)||(LA21_0>=159 && LA21_0<=163)||(LA21_0>=175 && LA21_0<=179)||(LA21_0>=184 && LA21_0<=185)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:112:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_body731);
                    block57=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block57.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:112:17: proc_stmts
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proc_stmts_in_body735);
                    proc_stmts58=proc_stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, proc_stmts58.getTree());

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:115:1: pick : ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr ) ;
    public final BPELscriptParser.pick_return pick() throws RecognitionException {
        BPELscriptParser.pick_return retval = new BPELscriptParser.pick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE_INST59=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal65=null;
        BPELscriptParser.std_attr_return std_attr60 = null;

        BPELscriptParser.onMessage_return onMessage63 = null;

        BPELscriptParser.onAlarm_return onAlarm64 = null;


        CommonTree CREATE_INST59_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        RewriteRuleSubtreeStream stream_onMessage=new RewriteRuleSubtreeStream(adaptor,"rule onMessage");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:115:6: ( ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:115:8: ( CREATE_INST )? std_attr 'pick' '{' ( onMessage )+ ( onAlarm )* '}'
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:115:8: ( CREATE_INST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CREATE_INST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:115:8: CREATE_INST
                    {
                    CREATE_INST59=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick744);  
                    stream_CREATE_INST.add(CREATE_INST59);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_pick747);
            std_attr60=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr60.getTree());
            string_literal61=(Token)match(input,110,FOLLOW_110_in_pick751);  
            stream_110.add(string_literal61);

            char_literal62=(Token)match(input,106,FOLLOW_106_in_pick753);  
            stream_106.add(char_literal62);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:14: ( onMessage )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==111||(LA23_0>=175 && LA23_0<=176)||(LA23_0>=178 && LA23_0<=179)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:14: onMessage
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick755);
            	    onMessage63=onMessage();

            	    state._fsp--;

            	    stream_onMessage.add(onMessage63.getTree());

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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:25: ( onAlarm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==SJF||LA24_0==106||(LA24_0>=114 && LA24_0<=116)||(LA24_0>=120 && LA24_0<=121)||LA24_0==177) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:25: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick758);
            	    onAlarm64=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm64.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal65=(Token)match(input,107,FOLLOW_107_in_pick761);  
            stream_107.add(char_literal65);



            // AST REWRITE
            // elements: std_attr, onAlarm, CREATE_INST, onMessage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:38: -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:41: ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? std_attr )
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
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:59: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:116:68: ( CREATE_INST )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:118:1: onMessage : ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) ;
    public final BPELscriptParser.onMessage_return onMessage() throws RecognitionException {
        BPELscriptParser.onMessage_return retval = new BPELscriptParser.onMessage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token string_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        BPELscriptParser.portType_return portType66 = null;

        BPELscriptParser.msgEx_return msgEx67 = null;

        BPELscriptParser.correlation_return correlation72 = null;

        BPELscriptParser.with_ex_return with_ex74 = null;

        BPELscriptParser.param_block_return param_block75 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:10: ( ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:12: ( portType )? ( msgEx )? 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:12: ( portType )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=175 && LA25_0<=176)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage796);
                    portType66=portType();

                    state._fsp--;

                    stream_portType.add(portType66.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:22: ( msgEx )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=178 && LA26_0<=179)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:119:22: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage799);
                    msgEx67=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx67.getTree());

                    }
                    break;

            }

            string_literal68=(Token)match(input,111,FOLLOW_111_in_onMessage804);  
            stream_111.add(string_literal68);

            char_literal69=(Token)match(input,112,FOLLOW_112_in_onMessage806);  
            stream_112.add(char_literal69);

            p=(Token)match(input,ID,FOLLOW_ID_in_onMessage810);  
            stream_ID.add(p);

            char_literal70=(Token)match(input,109,FOLLOW_109_in_onMessage812);  
            stream_109.add(char_literal70);

            o=(Token)match(input,ID,FOLLOW_ID_in_onMessage816);  
            stream_ID.add(o);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:120:33: ( ',' correlation )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==109) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:120:34: ',' correlation
                    {
                    char_literal71=(Token)match(input,109,FOLLOW_109_in_onMessage819);  
                    stream_109.add(char_literal71);

                    pushFollow(FOLLOW_correlation_in_onMessage821);
                    correlation72=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation72.getTree());

                    }
                    break;

            }

            char_literal73=(Token)match(input,113,FOLLOW_113_in_onMessage825);  
            stream_113.add(char_literal73);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:120:56: ( with_ex )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==142) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:120:56: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage827);
                    with_ex74=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex74.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_onMessage840);
            param_block75=param_block();

            state._fsp--;

            stream_param_block.add(param_block75.getTree());


            // AST REWRITE
            // elements: correlation, with_ex, ID, param_block, ID, msgEx, portType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:11: -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:122:14: ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONMESSAGE, "ONMESSAGE"), root_1);

                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:122:38: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:122:48: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:122:61: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:122:74: ( with_ex )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:124:1: onAlarm : {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) ;
    public final BPELscriptParser.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptParser.onAlarm_return retval = new BPELscriptParser.onAlarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.alarm_return alarm76 = null;

        BPELscriptParser.timeout_return timeout77 = null;

        BPELscriptParser.repeatEvery_return repeatEvery78 = null;

        BPELscriptParser.scope_short_return scope_short79 = null;


        RewriteRuleSubtreeStream stream_alarm=new RewriteRuleSubtreeStream(adaptor,"rule alarm");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_repeatEvery=new RewriteRuleSubtreeStream(adaptor,"rule repeatEvery");
        RewriteRuleSubtreeStream stream_timeout=new RewriteRuleSubtreeStream(adaptor,"rule timeout");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:125:2: ({...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:127:3: {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short
            {
            if ( !(input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"alarm\") || input.LT(1).getText().equals(\"timeout\") || input.LT(1).getText().equals(\"repeatEvery\")");
            }
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:128:3: ( alarm | timeout )?
            int alt29=3;
            switch ( input.LA(1) ) {
                case 177:
                    {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==STRING) ) {
                        switch ( input.LA(3) ) {
                            case SJF:
                                {
                                int LA29_2 = input.LA(4);

                                if ( (LA29_2==114) ) {
                                    alt29=1;
                                }
                                else if ( (LA29_2==115) ) {
                                    alt29=2;
                                }
                                }
                                break;
                            case 115:
                                {
                                alt29=2;
                                }
                                break;
                            case 114:
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

                    if ( (LA29_2==114) ) {
                        alt29=1;
                    }
                    else if ( (LA29_2==115) ) {
                        alt29=2;
                    }
                    }
                    break;
                case 114:
                    {
                    alt29=1;
                    }
                    break;
                case 115:
                    {
                    alt29=2;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:128:4: alarm
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm905);
                    alarm76=alarm();

                    state._fsp--;

                    stream_alarm.add(alarm76.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:128:12: timeout
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm909);
                    timeout77=timeout();

                    state._fsp--;

                    stream_timeout.add(timeout77.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:128:22: ( repeatEvery )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==116) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:128:22: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm913);
                    repeatEvery78=repeatEvery();

                    state._fsp--;

                    stream_repeatEvery.add(repeatEvery78.getTree());

                    }
                    break;

            }

            if ( !(input.LT(1).getText().equals("{")) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"{\")");
            }
            pushFollow(FOLLOW_scope_short_in_onAlarm918);
            scope_short79=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short79.getTree());


            // AST REWRITE
            // elements: scope_short, timeout, repeatEvery, alarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:2: -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:129:5: ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONALARM, "ONALARM"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:129:15: ( alarm )?
                if ( stream_alarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_alarm.nextTree());

                }
                stream_alarm.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:129:22: ( timeout )?
                if ( stream_timeout.hasNext() ) {
                    adaptor.addChild(root_1, stream_timeout.nextTree());

                }
                stream_timeout.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:129:31: ( repeatEvery )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:131:1: alarm : std_attr 'alarm' '(' expr ')' -> ^( ALARM expr ( std_attr )? ) ;
    public final BPELscriptParser.alarm_return alarm() throws RecognitionException {
        BPELscriptParser.alarm_return retval = new BPELscriptParser.alarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        BPELscriptParser.std_attr_return std_attr80 = null;

        BPELscriptParser.expr_return expr83 = null;


        CommonTree string_literal81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree char_literal84_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:131:8: ( std_attr 'alarm' '(' expr ')' -> ^( ALARM expr ( std_attr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:131:10: std_attr 'alarm' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_alarm953);
            std_attr80=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr80.getTree());
            string_literal81=(Token)match(input,114,FOLLOW_114_in_alarm958);  
            stream_114.add(string_literal81);

            char_literal82=(Token)match(input,112,FOLLOW_112_in_alarm960);  
            stream_112.add(char_literal82);

            pushFollow(FOLLOW_expr_in_alarm962);
            expr83=expr();

            state._fsp--;

            stream_expr.add(expr83.getTree());
            char_literal84=(Token)match(input,113,FOLLOW_113_in_alarm964);  
            stream_113.add(char_literal84);



            // AST REWRITE
            // elements: expr, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:3: -> ^( ALARM expr ( std_attr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:133:7: ^( ALARM expr ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALARM, "ALARM"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:133:21: ( std_attr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:135:1: timeout : std_attr 'timeout' '(' expr ')' -> ^( TIMEOUT expr ( std_attr )? ) ;
    public final BPELscriptParser.timeout_return timeout() throws RecognitionException {
        BPELscriptParser.timeout_return retval = new BPELscriptParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        BPELscriptParser.std_attr_return std_attr85 = null;

        BPELscriptParser.expr_return expr88 = null;


        CommonTree string_literal86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:135:9: ( std_attr 'timeout' '(' expr ')' -> ^( TIMEOUT expr ( std_attr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:135:11: std_attr 'timeout' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_timeout989);
            std_attr85=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr85.getTree());
            string_literal86=(Token)match(input,115,FOLLOW_115_in_timeout994);  
            stream_115.add(string_literal86);

            char_literal87=(Token)match(input,112,FOLLOW_112_in_timeout996);  
            stream_112.add(char_literal87);

            pushFollow(FOLLOW_expr_in_timeout997);
            expr88=expr();

            state._fsp--;

            stream_expr.add(expr88.getTree());
            char_literal89=(Token)match(input,113,FOLLOW_113_in_timeout999);  
            stream_113.add(char_literal89);



            // AST REWRITE
            // elements: expr, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:3: -> ^( TIMEOUT expr ( std_attr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:137:6: ^( TIMEOUT expr ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMEOUT, "TIMEOUT"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:137:21: ( std_attr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:139:1: repeatEvery : 'repeatEvery' '(' expr ')' -> ^( REPEATEVERY expr ) ;
    public final BPELscriptParser.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptParser.repeatEvery_return retval = new BPELscriptParser.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        BPELscriptParser.expr_return expr92 = null;


        CommonTree string_literal90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:140:2: ( 'repeatEvery' '(' expr ')' -> ^( REPEATEVERY expr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:140:4: 'repeatEvery' '(' expr ')'
            {
            string_literal90=(Token)match(input,116,FOLLOW_116_in_repeatEvery1023);  
            stream_116.add(string_literal90);

            char_literal91=(Token)match(input,112,FOLLOW_112_in_repeatEvery1025);  
            stream_112.add(char_literal91);

            pushFollow(FOLLOW_expr_in_repeatEvery1027);
            expr92=expr();

            state._fsp--;

            stream_expr.add(expr92.getTree());
            char_literal93=(Token)match(input,113,FOLLOW_113_in_repeatEvery1029);  
            stream_113.add(char_literal93);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:2: -> ^( REPEATEVERY expr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:141:5: ^( REPEATEVERY expr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:143:1: flow : std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) ;
    public final BPELscriptParser.flow_return flow() throws RecognitionException {
        BPELscriptParser.flow_return retval = new BPELscriptParser.flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal95=null;
        Token string_literal96=null;
        List list_s=null;
        BPELscriptParser.std_attr_return std_attr94 = null;

        RuleReturnScope s = null;
        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:143:7: ( std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:143:9: std_attr 'parallel' s+= sequence ( 'and' s+= sequence )*
            {
            pushFollow(FOLLOW_std_attr_in_flow1048);
            std_attr94=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr94.getTree());
            string_literal95=(Token)match(input,117,FOLLOW_117_in_flow1052);  
            stream_117.add(string_literal95);

            pushFollow(FOLLOW_sequence_in_flow1056);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            if (list_s==null) list_s=new ArrayList();
            list_s.add(s);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:144:26: ( 'and' s+= sequence )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==118) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:144:28: 'and' s+= sequence
            	    {
            	    string_literal96=(Token)match(input,118,FOLLOW_118_in_flow1060);  
            	    stream_118.add(string_literal96);

            	    pushFollow(FOLLOW_sequence_in_flow1064);
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
            // 145:2: -> ^( FLOW ( $s)+ std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:145:6: ^( FLOW ( $s)+ std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:1: signal : 'signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) ;
    public final BPELscriptParser.signal_return signal() throws RecognitionException {
        BPELscriptParser.signal_return retval = new BPELscriptParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token ID99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        BPELscriptParser.expr_return expr101 = null;


        CommonTree string_literal97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree ID99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:9: ( 'signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:11: 'signal' '(' ID ( ',' expr )? ')'
            {
            string_literal97=(Token)match(input,119,FOLLOW_119_in_signal1091);  
            stream_119.add(string_literal97);

            char_literal98=(Token)match(input,112,FOLLOW_112_in_signal1093);  
            stream_112.add(char_literal98);

            ID99=(Token)match(input,ID,FOLLOW_ID_in_signal1094);  
            stream_ID.add(ID99);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:26: ( ',' expr )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==109) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:27: ',' expr
                    {
                    char_literal100=(Token)match(input,109,FOLLOW_109_in_signal1097);  
                    stream_109.add(char_literal100);

                    pushFollow(FOLLOW_expr_in_signal1099);
                    expr101=expr();

                    state._fsp--;

                    stream_expr.add(expr101.getTree());

                    }
                    break;

            }

            char_literal102=(Token)match(input,113,FOLLOW_113_in_signal1103);  
            stream_113.add(char_literal102);



            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 147:42: -> ^( SIGNAL ID ( expr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:45: ^( SIGNAL ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:147:57: ( expr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:1: asignal : '@signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) ;
    public final BPELscriptParser.asignal_return asignal() throws RecognitionException {
        BPELscriptParser.asignal_return retval = new BPELscriptParser.asignal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal103=null;
        Token char_literal104=null;
        Token ID105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        BPELscriptParser.expr_return expr107 = null;


        CommonTree string_literal103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree ID105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:9: ( '@signal' '(' ID ( ',' expr )? ')' -> ^( SIGNAL ID ( expr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:11: '@signal' '(' ID ( ',' expr )? ')'
            {
            string_literal103=(Token)match(input,120,FOLLOW_120_in_asignal1122);  
            stream_120.add(string_literal103);

            char_literal104=(Token)match(input,112,FOLLOW_112_in_asignal1124);  
            stream_112.add(char_literal104);

            ID105=(Token)match(input,ID,FOLLOW_ID_in_asignal1125);  
            stream_ID.add(ID105);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:27: ( ',' expr )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==109) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:28: ',' expr
                    {
                    char_literal106=(Token)match(input,109,FOLLOW_109_in_asignal1128);  
                    stream_109.add(char_literal106);

                    pushFollow(FOLLOW_expr_in_asignal1130);
                    expr107=expr();

                    state._fsp--;

                    stream_expr.add(expr107.getTree());

                    }
                    break;

            }

            char_literal108=(Token)match(input,113,FOLLOW_113_in_asignal1134);  
            stream_113.add(char_literal108);



            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:43: -> ^( SIGNAL ID ( expr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:46: ^( SIGNAL ID ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:149:58: ( expr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:1: ajoin : '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) ;
    public final BPELscriptParser.ajoin_return ajoin() throws RecognitionException {
        BPELscriptParser.ajoin_return retval = new BPELscriptParser.ajoin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr113 = null;


        CommonTree string_literal109_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:8: ( '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:10: '@join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')'
            {
            string_literal109=(Token)match(input,121,FOLLOW_121_in_ajoin1154);  
            stream_121.add(string_literal109);

            char_literal110=(Token)match(input,112,FOLLOW_112_in_ajoin1156);  
            stream_112.add(char_literal110);

            k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1160);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:28: ( ',' k+= ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==109) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:29: ',' k+= ID
            	    {
            	    char_literal111=(Token)match(input,109,FOLLOW_109_in_ajoin1163);  
            	    stream_109.add(char_literal111);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1167);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:41: ( ',' expr )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==109) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:42: ',' expr
                    {
                    char_literal112=(Token)match(input,109,FOLLOW_109_in_ajoin1172);  
                    stream_109.add(char_literal112);

                    pushFollow(FOLLOW_expr_in_ajoin1174);
                    expr113=expr();

                    state._fsp--;

                    stream_expr.add(expr113.getTree());

                    }
                    break;

            }

            char_literal114=(Token)match(input,113,FOLLOW_113_in_ajoin1178);  
            stream_113.add(char_literal114);



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
            // 151:57: -> ^( JOIN ( $k)+ ( expr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:60: ^( JOIN ( $k)+ ( expr )? )
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
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:151:71: ( expr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:1: join : 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) ;
    public final BPELscriptParser.join_return join() throws RecognitionException {
        BPELscriptParser.join_return retval = new BPELscriptParser.join_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal115=null;
        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr119 = null;


        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:7: ( 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')' -> ^( JOIN ( $k)+ ( expr )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:9: 'join' '(' k+= ID ( ',' k+= ID )* ( ',' expr )? ')'
            {
            string_literal115=(Token)match(input,122,FOLLOW_122_in_join1200);  
            stream_122.add(string_literal115);

            char_literal116=(Token)match(input,112,FOLLOW_112_in_join1202);  
            stream_112.add(char_literal116);

            k=(Token)match(input,ID,FOLLOW_ID_in_join1206);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:26: ( ',' k+= ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==109) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==ID) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:27: ',' k+= ID
            	    {
            	    char_literal117=(Token)match(input,109,FOLLOW_109_in_join1209);  
            	    stream_109.add(char_literal117);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_join1213);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:39: ( ',' expr )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==109) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:40: ',' expr
                    {
                    char_literal118=(Token)match(input,109,FOLLOW_109_in_join1218);  
                    stream_109.add(char_literal118);

                    pushFollow(FOLLOW_expr_in_join1220);
                    expr119=expr();

                    state._fsp--;

                    stream_expr.add(expr119.getTree());

                    }
                    break;

            }

            char_literal120=(Token)match(input,113,FOLLOW_113_in_join1224);  
            stream_113.add(char_literal120);



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
            // 153:55: -> ^( JOIN ( $k)+ ( expr )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:58: ^( JOIN ( $k)+ ( expr )? )
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
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:153:69: ( expr )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:155:1: if_ex : std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr ) ;
    public final BPELscriptParser.if_ex_return if_ex() throws RecognitionException {
        BPELscriptParser.if_ex_return retval = new BPELscriptParser.if_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal122=null;
        Token char_literal123=null;
        Token char_literal124=null;
        Token string_literal125=null;
        Token char_literal126=null;
        Token char_literal127=null;
        Token string_literal128=null;
        List list_eiex=null;
        List list_sei=null;
        BPELscriptParser.expr_return iex = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.sequence_return se = null;

        BPELscriptParser.std_attr_return std_attr121 = null;

        RuleReturnScope eiex = null;
        RuleReturnScope sei = null;
        CommonTree string_literal122_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree char_literal126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:156:2: ( std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:156:4: std_attr 'if' '(' iex= expr ')' s= sequence ( 'elseif' '(' eiex+= expr ')' sei+= sequence )* ( 'else' se= sequence )?
            {
            pushFollow(FOLLOW_std_attr_in_if_ex1246);
            std_attr121=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr121.getTree());
            string_literal122=(Token)match(input,123,FOLLOW_123_in_if_ex1250);  
            stream_123.add(string_literal122);

            char_literal123=(Token)match(input,112,FOLLOW_112_in_if_ex1252);  
            stream_112.add(char_literal123);

            pushFollow(FOLLOW_expr_in_if_ex1256);
            iex=expr();

            state._fsp--;

            stream_expr.add(iex.getTree());
            char_literal124=(Token)match(input,113,FOLLOW_113_in_if_ex1258);  
            stream_113.add(char_literal124);

            pushFollow(FOLLOW_sequence_in_if_ex1262);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:157:36: ( 'elseif' '(' eiex+= expr ')' sei+= sequence )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==124) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:157:37: 'elseif' '(' eiex+= expr ')' sei+= sequence
            	    {
            	    string_literal125=(Token)match(input,124,FOLLOW_124_in_if_ex1265);  
            	    stream_124.add(string_literal125);

            	    char_literal126=(Token)match(input,112,FOLLOW_112_in_if_ex1267);  
            	    stream_112.add(char_literal126);

            	    pushFollow(FOLLOW_expr_in_if_ex1271);
            	    eiex=expr();

            	    state._fsp--;

            	    stream_expr.add(eiex.getTree());
            	    if (list_eiex==null) list_eiex=new ArrayList();
            	    list_eiex.add(eiex);

            	    char_literal127=(Token)match(input,113,FOLLOW_113_in_if_ex1273);  
            	    stream_113.add(char_literal127);

            	    pushFollow(FOLLOW_sequence_in_if_ex1277);
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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:157:81: ( 'else' se= sequence )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==125) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:157:82: 'else' se= sequence
                    {
                    string_literal128=(Token)match(input,125,FOLLOW_125_in_if_ex1282);  
                    stream_125.add(string_literal128);

                    pushFollow(FOLLOW_sequence_in_if_ex1286);
                    se=sequence();

                    state._fsp--;

                    stream_sequence.add(se.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: eiex, iex, sei, std_attr, se, s
            // token labels: 
            // rule labels: retval, s, iex, se
            // token list labels: 
            // rule list labels: sei, eiex
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_iex=new RewriteRuleSubtreeStream(adaptor,"token iex",iex!=null?iex.tree:null);
            RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"token se",se!=null?se.tree:null);
            RewriteRuleSubtreeStream stream_sei=new RewriteRuleSubtreeStream(adaptor,"token sei",list_sei);
            RewriteRuleSubtreeStream stream_eiex=new RewriteRuleSubtreeStream(adaptor,"token eiex",list_eiex);
            root_0 = (CommonTree)adaptor.nil();
            // 158:2: -> ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:158:6: ^( IF $iex $s ( ^( ELSIF $eiex $sei) )* ( ^( ELSE $se) )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_iex.nextTree());
                adaptor.addChild(root_1, stream_s.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:158:19: ( ^( ELSIF $eiex $sei) )*
                while ( stream_eiex.hasNext()||stream_sei.hasNext() ) {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:158:20: ^( ELSIF $eiex $sei)
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
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:158:42: ( ^( ELSE $se) )?
                if ( stream_se.hasNext() ) {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:158:43: ^( ELSE $se)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:160:1: sequence : std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) ;
    public final BPELscriptParser.sequence_return sequence() throws RecognitionException {
        BPELscriptParser.sequence_return retval = new BPELscriptParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.body_return b = null;

        BPELscriptParser.std_attr_return std_attr129 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:161:2: ( std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:161:4: std_attr (j+= ajoin )? (s+= asignal )* b= body
            {
            pushFollow(FOLLOW_std_attr_in_sequence1337);
            std_attr129=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr129.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:162:4: (j+= ajoin )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==121) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:162:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_sequence1343);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:162:14: (s+= asignal )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==120) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:162:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_sequence1348);
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

            pushFollow(FOLLOW_body_in_sequence1356);
            b=body();

            state._fsp--;

            stream_body.add(b.getTree());


            // AST REWRITE
            // elements: std_attr, j, b, s
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
            // 164:2: -> ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:164:5: ^( SEQUENCE ( $j)? $b ( $s)* std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:164:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:164:23: ( $s)*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:166:1: scope_sequence : (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) ;
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:2: ( (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:4: (j+= ajoin )? (s+= asignal )* b= scope_block
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:5: (j+= ajoin )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==121) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:5: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_scope_sequence1387);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:15: (s+= asignal )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==120) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:167:15: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_scope_sequence1392);
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

            pushFollow(FOLLOW_scope_block_in_scope_sequence1400);
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
            // 169:2: -> ^( SEQUENCE ( $j)? $b ( $s)* )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:169:5: ^( SEQUENCE ( $j)? $b ( $s)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:169:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_j.nextTree()).getTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:169:23: ( $s)*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:171:1: while_ex : std_attr 'while' '(' expr ')' s= sequence -> ^( WHILE expr sequence std_attr ) ;
    public final BPELscriptParser.while_ex_return while_ex() throws RecognitionException {
        BPELscriptParser.while_ex_return retval = new BPELscriptParser.while_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr130 = null;

        BPELscriptParser.expr_return expr133 = null;


        CommonTree string_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:171:10: ( std_attr 'while' '(' expr ')' s= sequence -> ^( WHILE expr sequence std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:171:12: std_attr 'while' '(' expr ')' s= sequence
            {
            pushFollow(FOLLOW_std_attr_in_while_ex1426);
            std_attr130=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr130.getTree());
            string_literal131=(Token)match(input,126,FOLLOW_126_in_while_ex1431);  
            stream_126.add(string_literal131);

            char_literal132=(Token)match(input,112,FOLLOW_112_in_while_ex1433);  
            stream_112.add(char_literal132);

            pushFollow(FOLLOW_expr_in_while_ex1435);
            expr133=expr();

            state._fsp--;

            stream_expr.add(expr133.getTree());
            char_literal134=(Token)match(input,113,FOLLOW_113_in_while_ex1437);  
            stream_113.add(char_literal134);

            pushFollow(FOLLOW_sequence_in_while_ex1441);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());


            // AST REWRITE
            // elements: std_attr, sequence, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 172:36: -> ^( WHILE expr sequence std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:172:39: ^( WHILE expr sequence std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:174:1: until_ex : std_attr 'repeat' s= sequence 'until' '(' expr ')' -> ^( UNTIL expr sequence std_attr ) ;
    public final BPELscriptParser.until_ex_return until_ex() throws RecognitionException {
        BPELscriptParser.until_ex_return retval = new BPELscriptParser.until_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal136=null;
        Token string_literal137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.std_attr_return std_attr135 = null;

        BPELscriptParser.expr_return expr139 = null;


        CommonTree string_literal136_tree=null;
        CommonTree string_literal137_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:174:10: ( std_attr 'repeat' s= sequence 'until' '(' expr ')' -> ^( UNTIL expr sequence std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:174:12: std_attr 'repeat' s= sequence 'until' '(' expr ')'
            {
            pushFollow(FOLLOW_std_attr_in_until_ex1461);
            std_attr135=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr135.getTree());
            string_literal136=(Token)match(input,127,FOLLOW_127_in_until_ex1466);  
            stream_127.add(string_literal136);

            pushFollow(FOLLOW_sequence_in_until_ex1470);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            string_literal137=(Token)match(input,128,FOLLOW_128_in_until_ex1472);  
            stream_128.add(string_literal137);

            char_literal138=(Token)match(input,112,FOLLOW_112_in_until_ex1474);  
            stream_112.add(char_literal138);

            pushFollow(FOLLOW_expr_in_until_ex1476);
            expr139=expr();

            state._fsp--;

            stream_expr.add(expr139.getTree());
            char_literal140=(Token)match(input,113,FOLLOW_113_in_until_ex1478);  
            stream_113.add(char_literal140);



            // AST REWRITE
            // elements: std_attr, expr, sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:45: -> ^( UNTIL expr sequence std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:175:48: ^( UNTIL expr sequence std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:177:1: foreach : ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr ) ;
    public final BPELscriptParser.foreach_return foreach() throws RecognitionException {
        BPELscriptParser.foreach_return retval = new BPELscriptParser.foreach_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token successfulBranchesOnly=null;
        Token cName=null;
        Token PARALLEL141=null;
        Token string_literal143=null;
        Token char_literal144=null;
        Token char_literal145=null;
        Token string_literal146=null;
        Token SEMI147=null;
        Token string_literal148=null;
        Token SEMI149=null;
        Token char_literal150=null;
        List list_complete=null;
        BPELscriptParser.expr_return init = null;

        BPELscriptParser.expr_return cond = null;

        BPELscriptParser.std_attr_return std_attr142 = null;

        BPELscriptParser.scope_short_return scope_short151 = null;

        RuleReturnScope complete = null;
        CommonTree successfulBranchesOnly_tree=null;
        CommonTree cName_tree=null;
        CommonTree PARALLEL141_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree SEMI147_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree SEMI149_tree=null;
        CommonTree char_literal150_tree=null;
        RewriteRuleTokenStream stream_PARALLEL=new RewriteRuleTokenStream(adaptor,"token PARALLEL");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:178:2: ( ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:178:4: ( PARALLEL )? (successfulBranchesOnly= SBO )? std_attr 'for' '(' cName= ID '=' init= expr ( 'to' | SEMI ) cond= expr ( ( 'finish' | SEMI ) complete+= expr )? ')' scope_short
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:178:4: ( PARALLEL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PARALLEL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:178:4: PARALLEL
                    {
                    PARALLEL141=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1499);  
                    stream_PARALLEL.add(PARALLEL141);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:179:25: (successfulBranchesOnly= SBO )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SBO) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:179:25: successfulBranchesOnly= SBO
                    {
                    successfulBranchesOnly=(Token)match(input,SBO,FOLLOW_SBO_in_foreach1506);  
                    stream_SBO.add(successfulBranchesOnly);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_foreach1512);
            std_attr142=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr142.getTree());
            string_literal143=(Token)match(input,129,FOLLOW_129_in_foreach1516);  
            stream_129.add(string_literal143);

            char_literal144=(Token)match(input,112,FOLLOW_112_in_foreach1518);  
            stream_112.add(char_literal144);

            cName=(Token)match(input,ID,FOLLOW_ID_in_foreach1522);  
            stream_ID.add(cName);

            char_literal145=(Token)match(input,130,FOLLOW_130_in_foreach1524);  
            stream_130.add(char_literal145);

            pushFollow(FOLLOW_expr_in_foreach1528);
            init=expr();

            state._fsp--;

            stream_expr.add(init.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:36: ( 'to' | SEMI )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==131) ) {
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:37: 'to'
                    {
                    string_literal146=(Token)match(input,131,FOLLOW_131_in_foreach1531);  
                    stream_131.add(string_literal146);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:42: SEMI
                    {
                    SEMI147=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1533);  
                    stream_SEMI.add(SEMI147);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_foreach1538);
            cond=expr();

            state._fsp--;

            stream_expr.add(cond.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:58: ( ( 'finish' | SEMI ) complete+= expr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==SEMI||LA48_0==132) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:59: ( 'finish' | SEMI ) complete+= expr
                    {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:59: ( 'finish' | SEMI )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==132) ) {
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
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:60: 'finish'
                            {
                            string_literal148=(Token)match(input,132,FOLLOW_132_in_foreach1542);  
                            stream_132.add(string_literal148);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:181:69: SEMI
                            {
                            SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach1544);  
                            stream_SEMI.add(SEMI149);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_foreach1549);
                    complete=expr();

                    state._fsp--;

                    stream_expr.add(complete.getTree());
                    if (list_complete==null) list_complete=new ArrayList();
                    list_complete.add(complete);


                    }
                    break;

            }

            char_literal150=(Token)match(input,113,FOLLOW_113_in_foreach1553);  
            stream_113.add(char_literal150);

            pushFollow(FOLLOW_scope_short_in_foreach1555);
            scope_short151=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short151.getTree());


            // AST REWRITE
            // elements: init, std_attr, cond, PARALLEL, cName, scope_short, SBO, complete
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
            // 182:2: -> ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:182:6: ^( FOR $cName $init $cond ( $complete)? scope_short ( PARALLEL )? ( SBO )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_cName.nextNode());
                adaptor.addChild(root_1, stream_init.nextTree());
                adaptor.addChild(root_1, stream_cond.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:182:31: ( $complete)?
                if ( stream_complete.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_complete.nextTree()).getTree());

                }
                stream_complete.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:182:54: ( PARALLEL )?
                if ( stream_PARALLEL.hasNext() ) {
                    adaptor.addChild(root_1, stream_PARALLEL.nextNode());

                }
                stream_PARALLEL.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:182:64: ( SBO )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:1: try_ex : 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) ;
    public final BPELscriptParser.try_ex_return try_ex() throws RecognitionException {
        BPELscriptParser.try_ex_return retval = new BPELscriptParser.try_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal152=null;
        BPELscriptParser.body_return body153 = null;

        BPELscriptParser.catch_ex_return catch_ex154 = null;

        BPELscriptParser.catchAll_return catchAll155 = null;


        CommonTree string_literal152_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_catchAll=new RewriteRuleSubtreeStream(adaptor,"rule catchAll");
        RewriteRuleSubtreeStream stream_catch_ex=new RewriteRuleSubtreeStream(adaptor,"rule catch_ex");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:9: ( 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:11: 'try' body ( catch_ex )* ( catchAll )?
            {
            string_literal152=(Token)match(input,133,FOLLOW_133_in_try_ex1595);  
            stream_133.add(string_literal152);

            pushFollow(FOLLOW_body_in_try_ex1597);
            body153=body();

            state._fsp--;

            stream_body.add(body153.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:22: ( catch_ex )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case 134:
                    {
                    alt49=1;
                    }
                    break;
                case 186:
                    {
                    alt49=1;
                    }
                    break;
                case 135:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:22: catch_ex
            	    {
            	    pushFollow(FOLLOW_catch_ex_in_try_ex1599);
            	    catch_ex154=catch_ex();

            	    state._fsp--;

            	    stream_catch_ex.add(catch_ex154.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:32: ( catchAll )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==136) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:32: catchAll
                    {
                    pushFollow(FOLLOW_catchAll_in_try_ex1602);
                    catchAll155=catchAll();

                    state._fsp--;

                    stream_catchAll.add(catchAll155.getTree());

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
            // 184:41: -> ^( TRY ( catch_ex )* ( body )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:44: ^( TRY ( catch_ex )* ( body )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:50: ( catch_ex )*
                while ( stream_catch_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_ex.nextTree());

                }
                stream_catch_ex.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:184:60: ( body )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:186:1: catch_ex : ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) ;
    public final BPELscriptParser.catch_ex_return catch_ex() throws RecognitionException {
        BPELscriptParser.catch_ex_return retval = new BPELscriptParser.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fMT=null;
        Token string_literal156=null;
        Token string_literal158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        BPELscriptParser.faultElt_return faultElt157 = null;

        BPELscriptParser.ns_id_return ns_id160 = null;

        BPELscriptParser.param_block_return param_block162 = null;


        CommonTree fMT_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_faultElt=new RewriteRuleSubtreeStream(adaptor,"rule faultElt");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:2: ( ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==134) ) {
                alt51=1;
            }
            else if ( (LA51_0==186) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:5: ( '@faultMessageType' fMT= STRING )
                    {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:5: ( '@faultMessageType' fMT= STRING )
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:6: '@faultMessageType' fMT= STRING
                    {
                    string_literal156=(Token)match(input,134,FOLLOW_134_in_catch_ex1627);  
                    stream_134.add(string_literal156);

                    fMT=(Token)match(input,STRING,FOLLOW_STRING_in_catch_ex1631);  
                    stream_STRING.add(fMT);


                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:187:41: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex1637);
                    faultElt157=faultElt();

                    state._fsp--;

                    stream_faultElt.add(faultElt157.getTree());

                    }
                    break;

            }

            string_literal158=(Token)match(input,135,FOLLOW_135_in_catch_ex1643);  
            stream_135.add(string_literal158);

            char_literal159=(Token)match(input,112,FOLLOW_112_in_catch_ex1645);  
            stream_112.add(char_literal159);

            pushFollow(FOLLOW_ns_id_in_catch_ex1647);
            ns_id160=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id160.getTree());
            char_literal161=(Token)match(input,113,FOLLOW_113_in_catch_ex1650);  
            stream_113.add(char_literal161);

            pushFollow(FOLLOW_param_block_in_catch_ex1652);
            param_block162=param_block();

            state._fsp--;

            stream_param_block.add(param_block162.getTree());


            // AST REWRITE
            // elements: param_block, fMT, ns_id, faultElt
            // token labels: fMT
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fMT=new RewriteRuleTokenStream(adaptor,"token fMT",fMT);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 189:2: -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:189:6: ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:189:32: ( $fMT)?
                if ( stream_fMT.hasNext() ) {
                    adaptor.addChild(root_1, stream_fMT.nextNode());

                }
                stream_fMT.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:189:38: ( faultElt )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:191:1: catchAll : 'catchAll' block -> ^( CATCH block ) ;
    public final BPELscriptParser.catchAll_return catchAll() throws RecognitionException {
        BPELscriptParser.catchAll_return retval = new BPELscriptParser.catchAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal163=null;
        BPELscriptParser.block_return block164 = null;


        CommonTree string_literal163_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:192:2: ( 'catchAll' block -> ^( CATCH block ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:192:4: 'catchAll' block
            {
            string_literal163=(Token)match(input,136,FOLLOW_136_in_catchAll1682);  
            stream_136.add(string_literal163);

            pushFollow(FOLLOW_block_in_catchAll1684);
            block164=block();

            state._fsp--;

            stream_block.add(block164.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 193:2: -> ^( CATCH block )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:193:6: ^( CATCH block )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:195:1: scope_ex : ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) ;
    public final BPELscriptParser.scope_ex_return scope_ex() throws RecognitionException {
        BPELscriptParser.scope_ex_return retval = new BPELscriptParser.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ISOLATED165=null;
        Token EOSF166=null;
        Token SJF167=null;
        Token string_literal168=null;
        Token char_literal169=null;
        Token ID170=null;
        Token char_literal171=null;
        BPELscriptParser.scope_sequence_return scope_sequence172 = null;

        BPELscriptParser.scope_stmt_return scope_stmt173 = null;


        CommonTree ISOLATED165_tree=null;
        CommonTree EOSF166_tree=null;
        CommonTree SJF167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree ID170_tree=null;
        CommonTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_ISOLATED=new RewriteRuleTokenStream(adaptor,"token ISOLATED");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:2: ( ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:4: ( ISOLATED )? ( EOSF )? ( SJF )? 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:4: ( ISOLATED )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ISOLATED) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:4: ISOLATED
                    {
                    ISOLATED165=(Token)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex1703);  
                    stream_ISOLATED.add(ISOLATED165);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:14: ( EOSF )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EOSF) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:14: EOSF
                    {
                    EOSF166=(Token)match(input,EOSF,FOLLOW_EOSF_in_scope_ex1706);  
                    stream_EOSF.add(EOSF166);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:20: ( SJF )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SJF) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:196:20: SJF
                    {
                    SJF167=(Token)match(input,SJF,FOLLOW_SJF_in_scope_ex1709);  
                    stream_SJF.add(SJF167);


                    }
                    break;

            }

            string_literal168=(Token)match(input,137,FOLLOW_137_in_scope_ex1714);  
            stream_137.add(string_literal168);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:197:11: ( '(' ( ID )? ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==112) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:197:12: '(' ( ID )? ')'
                    {
                    char_literal169=(Token)match(input,112,FOLLOW_112_in_scope_ex1717);  
                    stream_112.add(char_literal169);

                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:197:16: ( ID )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==ID) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:197:16: ID
                            {
                            ID170=(Token)match(input,ID,FOLLOW_ID_in_scope_ex1719);  
                            stream_ID.add(ID170);


                            }
                            break;

                    }

                    char_literal171=(Token)match(input,113,FOLLOW_113_in_scope_ex1722);  
                    stream_113.add(char_literal171);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_sequence_in_scope_ex1726);
            scope_sequence172=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence172.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_ex1728);
            scope_stmt173=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt173.getTree());


            // AST REWRITE
            // elements: ID, SJF, scope_sequence, ISOLATED, EOSF, scope_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 198:2: -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:198:6: ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:198:14: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:198:44: ( ISOLATED )?
                if ( stream_ISOLATED.hasNext() ) {
                    adaptor.addChild(root_1, stream_ISOLATED.nextNode());

                }
                stream_ISOLATED.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:198:54: ( EOSF )?
                if ( stream_EOSF.hasNext() ) {
                    adaptor.addChild(root_1, stream_EOSF.nextNode());

                }
                stream_EOSF.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:198:60: ( SJF )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:200:1: scope_short : scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) ;
    public final BPELscriptParser.scope_short_return scope_short() throws RecognitionException {
        BPELscriptParser.scope_short_return retval = new BPELscriptParser.scope_short_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.scope_sequence_return scope_sequence174 = null;

        BPELscriptParser.scope_stmt_return scope_stmt175 = null;


        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:201:2: ( scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:201:4: scope_sequence scope_stmt
            {
            pushFollow(FOLLOW_scope_sequence_in_scope_short1764);
            scope_sequence174=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence174.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_short1766);
            scope_stmt175=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt175.getTree());


            // AST REWRITE
            // elements: scope_sequence, scope_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 201:30: -> ^( SCOPE scope_stmt scope_sequence )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:201:33: ^( SCOPE scope_stmt scope_sequence )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:203:1: scope_stmt : ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) ;
    public final BPELscriptParser.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptParser.scope_stmt_return retval = new BPELscriptParser.scope_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.compensation_return compensation176 = null;

        BPELscriptParser.termination_return termination177 = null;

        BPELscriptParser.eventHdl_return eventHdl178 = null;


        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_termination=new RewriteRuleSubtreeStream(adaptor,"rule termination");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:2: ( ( compensation )? ( termination )? ( eventHdl )? -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:4: ( compensation )? ( termination )? ( eventHdl )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:4: ( compensation )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==141) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:4: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_scope_stmt1785);
                    compensation176=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation176.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:18: ( termination )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==138) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:18: termination
                    {
                    pushFollow(FOLLOW_termination_in_scope_stmt1788);
                    termination177=termination();

                    state._fsp--;

                    stream_termination.add(termination177.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:31: ( eventHdl )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==139) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:204:31: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_scope_stmt1791);
                    eventHdl178=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl178.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: compensation, termination, eventHdl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 205:2: -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:205:5: ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:205:13: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:205:27: ( termination )?
                if ( stream_termination.hasNext() ) {
                    adaptor.addChild(root_1, stream_termination.nextTree());

                }
                stream_termination.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:205:40: ( eventHdl )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:207:1: termination : 'onTermination' body -> ^( TERMINATION body ) ;
    public final BPELscriptParser.termination_return termination() throws RecognitionException {
        BPELscriptParser.termination_return retval = new BPELscriptParser.termination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal179=null;
        BPELscriptParser.body_return body180 = null;


        CommonTree string_literal179_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:208:2: ( 'onTermination' body -> ^( TERMINATION body ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:208:4: 'onTermination' body
            {
            string_literal179=(Token)match(input,138,FOLLOW_138_in_termination1818);  
            stream_138.add(string_literal179);

            pushFollow(FOLLOW_body_in_termination1820);
            body180=body();

            state._fsp--;

            stream_body.add(body180.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 208:25: -> ^( TERMINATION body )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:208:28: ^( TERMINATION body )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:210:1: eventHdl : 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) ;
    public final BPELscriptParser.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptParser.eventHdl_return retval = new BPELscriptParser.eventHdl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal181=null;
        Token char_literal182=null;
        Token char_literal185=null;
        BPELscriptParser.onEvent_return onEvent183 = null;

        BPELscriptParser.onAlarm_return onAlarm184 = null;


        CommonTree string_literal181_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal185_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_onEvent=new RewriteRuleSubtreeStream(adaptor,"rule onEvent");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:2: ( 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:4: 'events' '{' ( onEvent )* ( onAlarm )* '}'
            {
            string_literal181=(Token)match(input,139,FOLLOW_139_in_eventHdl1838);  
            stream_139.add(string_literal181);

            char_literal182=(Token)match(input,106,FOLLOW_106_in_eventHdl1840);  
            stream_106.add(char_literal182);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:17: ( onEvent )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ID||LA60_0==140||(LA60_0>=175 && LA60_0<=176)||(LA60_0>=178 && LA60_0<=181)||LA60_0==183) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:17: onEvent
            	    {
            	    pushFollow(FOLLOW_onEvent_in_eventHdl1842);
            	    onEvent183=onEvent();

            	    state._fsp--;

            	    stream_onEvent.add(onEvent183.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:26: ( onAlarm )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==SJF||LA61_0==106||(LA61_0>=114 && LA61_0<=116)||(LA61_0>=120 && LA61_0<=121)||LA61_0==177) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:211:26: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_eventHdl1845);
            	    onAlarm184=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm184.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            char_literal185=(Token)match(input,107,FOLLOW_107_in_eventHdl1848);  
            stream_107.add(char_literal185);



            // AST REWRITE
            // elements: onEvent, onAlarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 212:3: -> ^( EVENTHDL ( onEvent )* ( onAlarm )* )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:212:6: ^( EVENTHDL ( onEvent )* ( onAlarm )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENTHDL, "EVENTHDL"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:212:17: ( onEvent )*
                while ( stream_onEvent.hasNext() ) {
                    adaptor.addChild(root_1, stream_onEvent.nextTree());

                }
                stream_onEvent.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:212:26: ( onAlarm )*
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:214:1: onEvent : ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) ;
    public final BPELscriptParser.onEvent_return onEvent() throws RecognitionException {
        BPELscriptParser.onEvent_return retval = new BPELscriptParser.onEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Token p=null;
        Token o=null;
        Token char_literal190=null;
        Token string_literal191=null;
        Token char_literal192=null;
        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal196=null;
        BPELscriptParser.portType_return portType186 = null;

        BPELscriptParser.msgEx_return msgEx187 = null;

        BPELscriptParser.msgType_return msgType188 = null;

        BPELscriptParser.viElt_return viElt189 = null;

        BPELscriptParser.correlation_return correlation195 = null;

        BPELscriptParser.with_ex_return with_ex197 = null;

        BPELscriptParser.scope_short_return scope_short198 = null;


        CommonTree var_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal196_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:2: ( ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:4: ( portType )? ( msgEx )? ( msgType | viElt )? (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:4: ( portType )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=175 && LA62_0<=176)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent1873);
                    portType186=portType();

                    state._fsp--;

                    stream_portType.add(portType186.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:14: ( msgEx )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=178 && LA63_0<=179)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:215:14: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent1876);
                    msgEx187=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx187.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:216:3: ( msgType | viElt )?
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=180 && LA64_0<=181)) ) {
                alt64=1;
            }
            else if ( (LA64_0==183) ) {
                alt64=2;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:216:5: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent1883);
                    msgType188=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType188.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:216:15: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent1887);
                    viElt189=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt189.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:3: (var= ID '=' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:4: var= ID '='
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_onEvent1902);  
                    stream_ID.add(var);

                    char_literal190=(Token)match(input,130,FOLLOW_130_in_onEvent1904);  
                    stream_130.add(char_literal190);


                    }
                    break;

            }

            string_literal191=(Token)match(input,140,FOLLOW_140_in_onEvent1909);  
            stream_140.add(string_literal191);

            char_literal192=(Token)match(input,112,FOLLOW_112_in_onEvent1911);  
            stream_112.add(char_literal192);

            p=(Token)match(input,ID,FOLLOW_ID_in_onEvent1915);  
            stream_ID.add(p);

            char_literal193=(Token)match(input,109,FOLLOW_109_in_onEvent1917);  
            stream_109.add(char_literal193);

            o=(Token)match(input,ID,FOLLOW_ID_in_onEvent1921);  
            stream_ID.add(o);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:44: ( ',' correlation )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==109) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:45: ',' correlation
                    {
                    char_literal194=(Token)match(input,109,FOLLOW_109_in_onEvent1924);  
                    stream_109.add(char_literal194);

                    pushFollow(FOLLOW_correlation_in_onEvent1926);
                    correlation195=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation195.getTree());

                    }
                    break;

            }

            char_literal196=(Token)match(input,113,FOLLOW_113_in_onEvent1930);  
            stream_113.add(char_literal196);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:67: ( with_ex )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==142) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:217:67: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent1932);
                    with_ex197=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex197.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent1935);
            scope_short198=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short198.getTree());


            // AST REWRITE
            // elements: msgType, scope_short, var, correlation, o, p, portType, with_ex, viElt, msgEx
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
            // 218:2: -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:6: ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:20: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:33: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:54: ( $var)?
                if ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextNode());

                }
                stream_var.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:60: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:77: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:218:86: ( viElt )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:220:1: compensation : 'compensation' body -> ^( COMPENSATION body ) ;
    public final BPELscriptParser.compensation_return compensation() throws RecognitionException {
        BPELscriptParser.compensation_return retval = new BPELscriptParser.compensation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal199=null;
        BPELscriptParser.body_return body200 = null;


        CommonTree string_literal199_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:221:2: ( 'compensation' body -> ^( COMPENSATION body ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:221:4: 'compensation' body
            {
            string_literal199=(Token)match(input,141,FOLLOW_141_in_compensation1986);  
            stream_141.add(string_literal199);

            pushFollow(FOLLOW_body_in_compensation1988);
            body200=body();

            state._fsp--;

            stream_body.add(body200.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 221:24: -> ^( COMPENSATION body )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:221:27: ^( COMPENSATION body )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:223:1: with_ex : 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) ;
    public final BPELscriptParser.with_ex_return with_ex() throws RecognitionException {
        BPELscriptParser.with_ex_return retval = new BPELscriptParser.with_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal201=null;
        Token char_literal202=null;
        Token char_literal203=null;
        Token char_literal204=null;
        List list_wm=null;
        RuleReturnScope wm = null;
        CommonTree string_literal201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_with_map=new RewriteRuleSubtreeStream(adaptor,"rule with_map");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:224:3: ( 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:224:6: 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')'
            {
            string_literal201=(Token)match(input,142,FOLLOW_142_in_with_ex2007);  
            stream_142.add(string_literal201);

            char_literal202=(Token)match(input,112,FOLLOW_112_in_with_ex2009);  
            stream_112.add(char_literal202);

            pushFollow(FOLLOW_with_map_in_with_ex2013);
            wm=with_map();

            state._fsp--;

            stream_with_map.add(wm.getTree());
            if (list_wm==null) list_wm=new ArrayList();
            list_wm.add(wm);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:224:30: ( ',' wm+= with_map )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==109) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:224:31: ',' wm+= with_map
            	    {
            	    char_literal203=(Token)match(input,109,FOLLOW_109_in_with_ex2016);  
            	    stream_109.add(char_literal203);

            	    pushFollow(FOLLOW_with_map_in_with_ex2020);
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

            char_literal204=(Token)match(input,113,FOLLOW_113_in_with_ex2024);  
            stream_113.add(char_literal204);



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
            // 224:54: -> ^( WITH ( $wm)+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:224:57: ^( WITH ( $wm)+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:226:1: with_map : ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) ;
    public final BPELscriptParser.with_map_return with_map() throws RecognitionException {
        BPELscriptParser.with_map_return retval = new BPELscriptParser.with_map_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID205=null;
        Token char_literal206=null;
        Token KEY207=null;
        BPELscriptParser.path_expr_return path_expr208 = null;


        CommonTree ID205_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree KEY207_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:2: ( ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:11: ID ':' ( KEY )? path_expr
            {
            ID205=(Token)match(input,ID,FOLLOW_ID_in_with_map2050);  
            stream_ID.add(ID205);

            char_literal206=(Token)match(input,143,FOLLOW_143_in_with_map2052);  
            stream_143.add(char_literal206);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:18: ( KEY )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEY) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:18: KEY
                    {
                    KEY207=(Token)match(input,KEY,FOLLOW_KEY_in_with_map2054);  
                    stream_KEY.add(KEY207);


                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2057);
            path_expr208=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr208.getTree());


            // AST REWRITE
            // elements: path_expr, KEY, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:33: -> ^( MAP ID ( KEY )? path_expr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:36: ^( MAP ID ( KEY )? path_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:227:45: ( KEY )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:230:1: receive : ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) ;
    public final BPELscriptParser.receive_return receive() throws RecognitionException {
        BPELscriptParser.receive_return retval = new BPELscriptParser.receive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token CREATE_INST210=null;
        Token string_literal213=null;
        Token char_literal214=null;
        Token char_literal215=null;
        Token char_literal216=null;
        Token char_literal218=null;
        BPELscriptParser.portType_return portType209 = null;

        BPELscriptParser.msgEx_return msgEx211 = null;

        BPELscriptParser.std_attr_return std_attr212 = null;

        BPELscriptParser.correlation_return correlation217 = null;

        BPELscriptParser.with_ex_return with_ex219 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree CREATE_INST210_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal218_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:9: ( ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:12: ( portType )? ( CREATE_INST )? ( msgEx )? std_attr 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:12: ( portType )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=175 && LA70_0<=176)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:12: portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2088);
                    portType209=portType();

                    state._fsp--;

                    stream_portType.add(portType209.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:22: ( CREATE_INST )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==CREATE_INST) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:22: CREATE_INST
                    {
                    CREATE_INST210=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2091);  
                    stream_CREATE_INST.add(CREATE_INST210);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:35: ( msgEx )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=178 && LA72_0<=179)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:231:35: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2094);
                    msgEx211=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx211.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_receive2097);
            std_attr212=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr212.getTree());
            string_literal213=(Token)match(input,144,FOLLOW_144_in_receive2101);  
            stream_144.add(string_literal213);

            char_literal214=(Token)match(input,112,FOLLOW_112_in_receive2103);  
            stream_112.add(char_literal214);

            p=(Token)match(input,ID,FOLLOW_ID_in_receive2107);  
            stream_ID.add(p);

            char_literal215=(Token)match(input,109,FOLLOW_109_in_receive2109);  
            stream_109.add(char_literal215);

            o=(Token)match(input,ID,FOLLOW_ID_in_receive2113);  
            stream_ID.add(o);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:232:31: ( ',' correlation )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==109) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:232:32: ',' correlation
                    {
                    char_literal216=(Token)match(input,109,FOLLOW_109_in_receive2116);  
                    stream_109.add(char_literal216);

                    pushFollow(FOLLOW_correlation_in_receive2118);
                    correlation217=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation217.getTree());

                    }
                    break;

            }

            char_literal218=(Token)match(input,113,FOLLOW_113_in_receive2122);  
            stream_113.add(char_literal218);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:232:54: ( with_ex )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==142) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:232:54: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2124);
                    with_ex219=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex219.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: o, p, correlation, std_attr, with_ex, msgEx, CREATE_INST, portType
            // token labels: p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:2: -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:6: ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? std_attr ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:22: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:35: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:45: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:58: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:233:74: ( with_ex )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:235:1: reply : ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) ;
    public final BPELscriptParser.reply_return reply() throws RecognitionException {
        BPELscriptParser.reply_return retval = new BPELscriptParser.reply_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal224=null;
        Token char_literal225=null;
        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token char_literal230=null;
        BPELscriptParser.portType_return portType220 = null;

        BPELscriptParser.faultName_return faultName221 = null;

        BPELscriptParser.msgEx_return msgEx222 = null;

        BPELscriptParser.std_attr_return std_attr223 = null;

        BPELscriptParser.correlation_return correlation229 = null;

        BPELscriptParser.with_ex_return with_ex231 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal228_tree=null;
        CommonTree char_literal230_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:2: ( ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:4: ( portType )? ( faultName )? ( msgEx )? std_attr 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:4: ( portType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=175 && LA75_0<=176)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply2165);
                    portType220=portType();

                    state._fsp--;

                    stream_portType.add(portType220.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:14: ( faultName )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=184 && LA76_0<=185)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:14: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply2168);
                    faultName221=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName221.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:25: ( msgEx )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=178 && LA77_0<=179)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:236:25: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply2171);
                    msgEx222=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx222.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_reply2174);
            std_attr223=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr223.getTree());
            string_literal224=(Token)match(input,145,FOLLOW_145_in_reply2178);  
            stream_145.add(string_literal224);

            char_literal225=(Token)match(input,112,FOLLOW_112_in_reply2180);  
            stream_112.add(char_literal225);

            p=(Token)match(input,ID,FOLLOW_ID_in_reply2184);  
            stream_ID.add(p);

            char_literal226=(Token)match(input,109,FOLLOW_109_in_reply2186);  
            stream_109.add(char_literal226);

            o=(Token)match(input,ID,FOLLOW_ID_in_reply2190);  
            stream_ID.add(o);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:29: ( ',' in= ID )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==109) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==ID) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:30: ',' in= ID
                    {
                    char_literal227=(Token)match(input,109,FOLLOW_109_in_reply2193);  
                    stream_109.add(char_literal227);

                    in=(Token)match(input,ID,FOLLOW_ID_in_reply2197);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:42: ( ',' correlation )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==109) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:43: ',' correlation
                    {
                    char_literal228=(Token)match(input,109,FOLLOW_109_in_reply2202);  
                    stream_109.add(char_literal228);

                    pushFollow(FOLLOW_correlation_in_reply2204);
                    correlation229=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation229.getTree());

                    }
                    break;

            }

            char_literal230=(Token)match(input,113,FOLLOW_113_in_reply2208);  
            stream_113.add(char_literal230);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:66: ( with_ex )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==142) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:237:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2211);
                    with_ex231=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex231.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: portType, msgEx, ID, correlation, with_ex, faultName, ID, ID, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:2: -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:6: ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? std_attr ( faultName )? ( msgEx )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPLY, "REPLY"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:24: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:37: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:56: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:67: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:238:74: ( with_ex )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:240:1: invoke : ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) ;
    public final BPELscriptParser.invoke_return invoke() throws RecognitionException {
        BPELscriptParser.invoke_return retval = new BPELscriptParser.invoke_return();
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
        BPELscriptParser.portType_return portType232 = null;

        BPELscriptParser.std_attr_return std_attr233 = null;

        BPELscriptParser.correlation_return correlation239 = null;

        BPELscriptParser.with_ex_return with_ex241 = null;

        BPELscriptParser.compensation_return compensation242 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree char_literal235_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:241:2: ( ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:241:4: ( portType )? std_attr 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:241:4: ( portType )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=175 && LA81_0<=176)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:241:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke2253);
                    portType232=portType();

                    state._fsp--;

                    stream_portType.add(portType232.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_invoke2256);
            std_attr233=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr233.getTree());
            string_literal234=(Token)match(input,146,FOLLOW_146_in_invoke2260);  
            stream_146.add(string_literal234);

            char_literal235=(Token)match(input,112,FOLLOW_112_in_invoke2262);  
            stream_112.add(char_literal235);

            p=(Token)match(input,ID,FOLLOW_ID_in_invoke2266);  
            stream_ID.add(p);

            char_literal236=(Token)match(input,109,FOLLOW_109_in_invoke2268);  
            stream_109.add(char_literal236);

            o=(Token)match(input,ID,FOLLOW_ID_in_invoke2272);  
            stream_ID.add(o);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:30: ( ',' in= ID )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==109) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==ID) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:31: ',' in= ID
                    {
                    char_literal237=(Token)match(input,109,FOLLOW_109_in_invoke2275);  
                    stream_109.add(char_literal237);

                    in=(Token)match(input,ID,FOLLOW_ID_in_invoke2279);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:43: ( ',' correlation )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==109) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:44: ',' correlation
                    {
                    char_literal238=(Token)match(input,109,FOLLOW_109_in_invoke2284);  
                    stream_109.add(char_literal238);

                    pushFollow(FOLLOW_correlation_in_invoke2286);
                    correlation239=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation239.getTree());

                    }
                    break;

            }

            char_literal240=(Token)match(input,113,FOLLOW_113_in_invoke2290);  
            stream_113.add(char_literal240);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:66: ( with_ex )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==142) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2292);
                    with_ex241=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex241.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:75: ( compensation )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==141) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:242:75: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2295);
                    compensation242=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation242.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: std_attr, p, in, portType, compensation, with_ex, correlation, o
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
            // 243:2: -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:6: ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? std_attr ( with_ex )? ( compensation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVOKE, "INVOKE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:21: ( $in)?
                if ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:26: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:39: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:58: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:243:67: ( compensation )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:245:1: assign : ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue ) ;
    public final BPELscriptParser.assign_return assign() throws RecognitionException {
        BPELscriptParser.assign_return retval = new BPELscriptParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CREATE_INST244=null;
        Token VALID245=null;
        Token KEEPSRC246=null;
        Token IGNORE247=null;
        Token PROP252=null;
        Token char_literal253=null;
        BPELscriptParser.portType_return portType243 = null;

        BPELscriptParser.faultName_return faultName248 = null;

        BPELscriptParser.msgEx_return msgEx249 = null;

        BPELscriptParser.std_attr_return std_attr250 = null;

        BPELscriptParser.path_expr_return path_expr251 = null;

        BPELscriptParser.rvalue_return rvalue254 = null;


        CommonTree CREATE_INST244_tree=null;
        CommonTree VALID245_tree=null;
        CommonTree KEEPSRC246_tree=null;
        CommonTree IGNORE247_tree=null;
        CommonTree PROP252_tree=null;
        CommonTree char_literal253_tree=null;
        RewriteRuleTokenStream stream_IGNORE=new RewriteRuleTokenStream(adaptor,"token IGNORE");
        RewriteRuleTokenStream stream_PROP=new RewriteRuleTokenStream(adaptor,"token PROP");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:2: ( ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:4: ( portType )? ( CREATE_INST )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( faultName )? ( msgEx )? std_attr path_expr ( PROP )? '=' rvalue
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:4: ( portType )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=175 && LA86_0<=176)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:4: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign2337);
                    portType243=portType();

                    state._fsp--;

                    stream_portType.add(portType243.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:14: ( CREATE_INST )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==CREATE_INST) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:14: CREATE_INST
                    {
                    CREATE_INST244=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2340);  
                    stream_CREATE_INST.add(CREATE_INST244);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:27: ( VALID )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==VALID) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:27: VALID
                    {
                    VALID245=(Token)match(input,VALID,FOLLOW_VALID_in_assign2343);  
                    stream_VALID.add(VALID245);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:34: ( KEEPSRC )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==KEEPSRC) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:34: KEEPSRC
                    {
                    KEEPSRC246=(Token)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2346);  
                    stream_KEEPSRC.add(KEEPSRC246);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:43: ( IGNORE )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==IGNORE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:43: IGNORE
                    {
                    IGNORE247=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_assign2349);  
                    stream_IGNORE.add(IGNORE247);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:51: ( faultName )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=184 && LA91_0<=185)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:51: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign2352);
                    faultName248=faultName();

                    state._fsp--;

                    stream_faultName.add(faultName248.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:62: ( msgEx )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=178 && LA92_0<=179)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:246:62: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign2355);
                    msgEx249=msgEx();

                    state._fsp--;

                    stream_msgEx.add(msgEx249.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_assign2358);
            std_attr250=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr250.getTree());
            pushFollow(FOLLOW_path_expr_in_assign2363);
            path_expr251=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr251.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:247:13: ( PROP )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==PROP) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:247:13: PROP
                    {
                    PROP252=(Token)match(input,PROP,FOLLOW_PROP_in_assign2365);  
                    stream_PROP.add(PROP252);


                    }
                    break;

            }

            char_literal253=(Token)match(input,130,FOLLOW_130_in_assign2368);  
            stream_130.add(char_literal253);

            pushFollow(FOLLOW_rvalue_in_assign2370);
            rvalue254=rvalue();

            state._fsp--;

            stream_rvalue.add(rvalue254.getTree());


            // AST REWRITE
            // elements: CREATE_INST, path_expr, faultName, PROP, VALID, msgEx, std_attr, portType, IGNORE, rvalue, KEEPSRC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 248:2: -> ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:6: ^( ASSIGN path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_path_expr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:25: ( PROP )?
                if ( stream_PROP.hasNext() ) {
                    adaptor.addChild(root_1, stream_PROP.nextNode());

                }
                stream_PROP.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:31: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:41: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:63: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:74: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:81: ( VALID )?
                if ( stream_VALID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VALID.nextNode());

                }
                stream_VALID.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:88: ( KEEPSRC )?
                if ( stream_KEEPSRC.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEEPSRC.nextNode());

                }
                stream_KEEPSRC.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:248:97: ( IGNORE )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:250:1: rvalue : ( receive | invoke | expr ( PROP )? );
    public final BPELscriptParser.rvalue_return rvalue() throws RecognitionException {
        BPELscriptParser.rvalue_return retval = new BPELscriptParser.rvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROP258=null;
        BPELscriptParser.receive_return receive255 = null;

        BPELscriptParser.invoke_return invoke256 = null;

        BPELscriptParser.expr_return expr257 = null;


        CommonTree PROP258_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:251:2: ( receive | invoke | expr ( PROP )? )
            int alt95=3;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:251:4: receive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_receive_in_rvalue2418);
                    receive255=receive();

                    state._fsp--;

                    adaptor.addChild(root_0, receive255.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:252:4: invoke
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_invoke_in_rvalue2423);
                    invoke256=invoke();

                    state._fsp--;

                    adaptor.addChild(root_0, invoke256.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:253:4: expr ( PROP )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_rvalue2428);
                    expr257=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr257.getTree());
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:253:9: ( PROP )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==PROP) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:253:9: PROP
                            {
                            PROP258=(Token)match(input,PROP,FOLLOW_PROP_in_rvalue2430); 
                            PROP258_tree = (CommonTree)adaptor.create(PROP258);
                            adaptor.addChild(root_0, PROP258_tree);


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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:255:1: throw_ex : ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) ;
    public final BPELscriptParser.throw_ex_return throw_ex() throws RecognitionException {
        BPELscriptParser.throw_ex_return retval = new BPELscriptParser.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token faultVar=null;
        Token string_literal259=null;
        Token string_literal260=null;
        Token string_literal262=null;
        Token char_literal263=null;
        Token char_literal265=null;
        BPELscriptParser.std_attr_return std_attr261 = null;

        BPELscriptParser.ns_id_return ns_id264 = null;


        CommonTree faultVar_tree=null;
        CommonTree string_literal259_tree=null;
        CommonTree string_literal260_tree=null;
        CommonTree string_literal262_tree=null;
        CommonTree char_literal263_tree=null;
        CommonTree char_literal265_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:2: ( ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )? std_attr 'throw' '(' ns_id ')'
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:4: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=147 && LA97_0<=148)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:5: ( '@faultVariable' | '@faultVar' ) faultVar= ID
                    {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:5: ( '@faultVariable' | '@faultVar' )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==147) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==148) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:6: '@faultVariable'
                            {
                            string_literal259=(Token)match(input,147,FOLLOW_147_in_throw_ex2443);  
                            stream_147.add(string_literal259);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:256:24: '@faultVar'
                            {
                            string_literal260=(Token)match(input,148,FOLLOW_148_in_throw_ex2446);  
                            stream_148.add(string_literal260);


                            }
                            break;

                    }

                    faultVar=(Token)match(input,ID,FOLLOW_ID_in_throw_ex2451);  
                    stream_ID.add(faultVar);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_throw_ex2455);
            std_attr261=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr261.getTree());
            string_literal262=(Token)match(input,149,FOLLOW_149_in_throw_ex2459);  
            stream_149.add(string_literal262);

            char_literal263=(Token)match(input,112,FOLLOW_112_in_throw_ex2461);  
            stream_112.add(char_literal263);

            pushFollow(FOLLOW_ns_id_in_throw_ex2463);
            ns_id264=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id264.getTree());
            char_literal265=(Token)match(input,113,FOLLOW_113_in_throw_ex2465);  
            stream_113.add(char_literal265);



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
            // 257:25: -> ^( THROW ns_id ( $faultVar)? std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:257:28: ^( THROW ns_id ( $faultVar)? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:257:42: ( $faultVar)?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:259:1: rethrow_ex : std_attr 'rethrow' -> ^( RETHROW std_attr ) ;
    public final BPELscriptParser.rethrow_ex_return rethrow_ex() throws RecognitionException {
        BPELscriptParser.rethrow_ex_return retval = new BPELscriptParser.rethrow_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal267=null;
        BPELscriptParser.std_attr_return std_attr266 = null;


        CommonTree string_literal267_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:260:2: ( std_attr 'rethrow' -> ^( RETHROW std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:260:4: std_attr 'rethrow'
            {
            pushFollow(FOLLOW_std_attr_in_rethrow_ex2490);
            std_attr266=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr266.getTree());
            string_literal267=(Token)match(input,150,FOLLOW_150_in_rethrow_ex2494);  
            stream_150.add(string_literal267);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 261:13: -> ^( RETHROW std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:261:16: ^( RETHROW std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:263:1: compensate : std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) ;
    public final BPELscriptParser.compensate_return compensate() throws RecognitionException {
        BPELscriptParser.compensate_return retval = new BPELscriptParser.compensate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token target=null;
        Token string_literal269=null;
        Token char_literal270=null;
        Token char_literal271=null;
        BPELscriptParser.std_attr_return std_attr268 = null;


        CommonTree target_tree=null;
        CommonTree string_literal269_tree=null;
        CommonTree char_literal270_tree=null;
        CommonTree char_literal271_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:264:2: ( std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:264:4: std_attr 'compensate' ( '(' target= ID ')' )?
            {
            pushFollow(FOLLOW_std_attr_in_compensate2511);
            std_attr268=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr268.getTree());
            string_literal269=(Token)match(input,151,FOLLOW_151_in_compensate2515);  
            stream_151.add(string_literal269);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:265:16: ( '(' target= ID ')' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==112) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:265:17: '(' target= ID ')'
                    {
                    char_literal270=(Token)match(input,112,FOLLOW_112_in_compensate2518);  
                    stream_112.add(char_literal270);

                    target=(Token)match(input,ID,FOLLOW_ID_in_compensate2522);  
                    stream_ID.add(target);

                    char_literal271=(Token)match(input,113,FOLLOW_113_in_compensate2524);  
                    stream_113.add(char_literal271);


                    }
                    break;

            }



            // AST REWRITE
            // elements: std_attr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 266:2: -> ^( COMPENSATE ( ID )? std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:266:6: ^( COMPENSATE ( ID )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATE, "COMPENSATE"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:266:19: ( ID )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:268:1: exit : std_attr 'exit' -> ^( EXIT std_attr ) ;
    public final BPELscriptParser.exit_return exit() throws RecognitionException {
        BPELscriptParser.exit_return retval = new BPELscriptParser.exit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal273=null;
        BPELscriptParser.std_attr_return std_attr272 = null;


        CommonTree string_literal273_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:268:7: ( std_attr 'exit' -> ^( EXIT std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:268:9: std_attr 'exit'
            {
            pushFollow(FOLLOW_std_attr_in_exit2549);
            std_attr272=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr272.getTree());
            string_literal273=(Token)match(input,152,FOLLOW_152_in_exit2554);  
            stream_152.add(string_literal273);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 269:11: -> ^( EXIT std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:269:14: ^( EXIT std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:271:1: validate : std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) ;
    public final BPELscriptParser.validate_return validate() throws RecognitionException {
        BPELscriptParser.validate_return retval = new BPELscriptParser.validate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal275=null;
        Token char_literal276=null;
        Token v=null;
        List list_v=null;
        BPELscriptParser.std_attr_return std_attr274 = null;


        CommonTree string_literal275_tree=null;
        CommonTree char_literal276_tree=null;
        CommonTree v_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:271:10: ( std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:271:12: std_attr 'validate' v+= ID ( ',' v+= ID )*
            {
            pushFollow(FOLLOW_std_attr_in_validate2571);
            std_attr274=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr274.getTree());
            string_literal275=(Token)match(input,153,FOLLOW_153_in_validate2577);  
            stream_153.add(string_literal275);

            v=(Token)match(input,ID,FOLLOW_ID_in_validate2581);  
            stream_ID.add(v);

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:272:21: ( ',' v+= ID )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==109) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:272:22: ',' v+= ID
            	    {
            	    char_literal276=(Token)match(input,109,FOLLOW_109_in_validate2584);  
            	    stream_109.add(char_literal276);

            	    v=(Token)match(input,ID,FOLLOW_ID_in_validate2588);  
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
            // elements: v, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: v
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v", list_v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 272:33: -> ^( VALIDATE ( $v)+ std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:272:36: ^( VALIDATE ( $v)+ std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:274:1: ext_act : std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) ;
    public final BPELscriptParser.ext_act_return ext_act() throws RecognitionException {
        BPELscriptParser.ext_act_return retval = new BPELscriptParser.ext_act_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token e=null;
        BPELscriptParser.std_attr_return std_attr277 = null;


        CommonTree e_tree=null;
        RewriteRuleTokenStream stream_EXT_ACT=new RewriteRuleTokenStream(adaptor,"token EXT_ACT");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:274:11: ( std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:274:13: std_attr e= EXT_ACT
            {
            pushFollow(FOLLOW_std_attr_in_ext_act2612);
            std_attr277=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr277.getTree());
            e=(Token)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act2620);  
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
            // 275:14: -> ^( EXTENSIONACT $e std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:275:18: ^( EXTENSIONACT $e std_attr )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:277:1: nop : std_attr 'nop' -> ^( NOP std_attr ) ;
    public final BPELscriptParser.nop_return nop() throws RecognitionException {
        BPELscriptParser.nop_return retval = new BPELscriptParser.nop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal279=null;
        BPELscriptParser.std_attr_return std_attr278 = null;


        CommonTree string_literal279_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:277:6: ( std_attr 'nop' -> ^( NOP std_attr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:277:8: std_attr 'nop'
            {
            pushFollow(FOLLOW_std_attr_in_nop2641);
            std_attr278=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr278.getTree());
            string_literal279=(Token)match(input,154,FOLLOW_154_in_nop2646);  
            stream_154.add(string_literal279);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:10: -> ^( NOP std_attr )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:278:13: ^( NOP std_attr )
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

    public static class namespace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:281:1: namespace : 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) ;
    public final BPELscriptParser.namespace_return namespace() throws RecognitionException {
        BPELscriptParser.namespace_return retval = new BPELscriptParser.namespace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal280=null;
        Token ID281=null;
        Token char_literal282=null;
        Token STRING283=null;
        Token SEMI284=null;

        CommonTree string_literal280_tree=null;
        CommonTree ID281_tree=null;
        CommonTree char_literal282_tree=null;
        CommonTree STRING283_tree=null;
        CommonTree SEMI284_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:282:2: ( 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:282:4: 'namespace' ID '=' STRING SEMI
            {
            string_literal280=(Token)match(input,155,FOLLOW_155_in_namespace2664);  
            stream_155.add(string_literal280);

            ID281=(Token)match(input,ID,FOLLOW_ID_in_namespace2666);  
            stream_ID.add(ID281);

            char_literal282=(Token)match(input,130,FOLLOW_130_in_namespace2668);  
            stream_130.add(char_literal282);

            STRING283=(Token)match(input,STRING,FOLLOW_STRING_in_namespace2670);  
            stream_STRING.add(STRING283);

            SEMI284=(Token)match(input,SEMI,FOLLOW_SEMI_in_namespace2672);  
            stream_SEMI.add(SEMI284);



            // AST REWRITE
            // elements: STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 282:35: -> ^( NAMESPACE ID STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:282:38: ^( NAMESPACE ID STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:284:1: extension : ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) ;
    public final BPELscriptParser.extension_return extension() throws RecognitionException {
        BPELscriptParser.extension_return retval = new BPELscriptParser.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUSTUND285=null;
        Token string_literal286=null;
        Token ID287=null;
        Token char_literal288=null;
        Token STRING289=null;
        Token SEMI290=null;

        CommonTree MUSTUND285_tree=null;
        CommonTree string_literal286_tree=null;
        CommonTree ID287_tree=null;
        CommonTree char_literal288_tree=null;
        CommonTree STRING289_tree=null;
        CommonTree SEMI290_tree=null;
        RewriteRuleTokenStream stream_MUSTUND=new RewriteRuleTokenStream(adaptor,"token MUSTUND");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:285:2: ( ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:285:5: ( MUSTUND )? 'extension' ID '=' STRING SEMI
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:285:5: ( MUSTUND )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==MUSTUND) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:285:5: MUSTUND
                    {
                    MUSTUND285=(Token)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension2693);  
                    stream_MUSTUND.add(MUSTUND285);


                    }
                    break;

            }

            string_literal286=(Token)match(input,156,FOLLOW_156_in_extension2699);  
            stream_156.add(string_literal286);

            ID287=(Token)match(input,ID,FOLLOW_ID_in_extension2701);  
            stream_ID.add(ID287);

            char_literal288=(Token)match(input,130,FOLLOW_130_in_extension2703);  
            stream_130.add(char_literal288);

            STRING289=(Token)match(input,STRING,FOLLOW_STRING_in_extension2705);  
            stream_STRING.add(STRING289);

            SEMI290=(Token)match(input,SEMI,FOLLOW_SEMI_in_extension2707);  
            stream_SEMI.add(SEMI290);



            // AST REWRITE
            // elements: MUSTUND, ID, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 287:2: -> ^( EXTENSION ID STRING ( MUSTUND )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:287:6: ^( EXTENSION ID STRING ( MUSTUND )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:287:28: ( MUSTUND )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:289:1: imports : viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) ;
    public final BPELscriptParser.imports_return imports() throws RecognitionException {
        BPELscriptParser.imports_return retval = new BPELscriptParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token ns=null;
        Token loc=null;
        Token string_literal292=null;
        Token char_literal293=null;
        Token string_literal294=null;
        Token SEMI295=null;
        BPELscriptParser.viType_return viType291 = null;


        CommonTree id_tree=null;
        CommonTree ns_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal292_tree=null;
        CommonTree char_literal293_tree=null;
        CommonTree string_literal294_tree=null;
        CommonTree SEMI295_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:290:2: ( viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:290:5: viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI
            {
            pushFollow(FOLLOW_viType_in_imports2732);
            viType291=viType();

            state._fsp--;

            stream_viType.add(viType291.getTree());
            string_literal292=(Token)match(input,157,FOLLOW_157_in_imports2738);  
            stream_157.add(string_literal292);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:291:12: (id= ID '=' (ns= ID '::' )? loc= STRING )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:291:13: id= ID '=' (ns= ID '::' )? loc= STRING
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_imports2743);  
            stream_ID.add(id);

            char_literal293=(Token)match(input,130,FOLLOW_130_in_imports2745);  
            stream_130.add(char_literal293);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:291:23: (ns= ID '::' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ID) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:291:24: ns= ID '::'
                    {
                    ns=(Token)match(input,ID,FOLLOW_ID_in_imports2750);  
                    stream_ID.add(ns);

                    string_literal294=(Token)match(input,158,FOLLOW_158_in_imports2752);  
                    stream_158.add(string_literal294);


                    }
                    break;

            }

            loc=(Token)match(input,STRING,FOLLOW_STRING_in_imports2759);  
            stream_STRING.add(loc);


            }

            SEMI295=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports2763);  
            stream_SEMI.add(SEMI295);



            // AST REWRITE
            // elements: id, ns, loc, viType
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
            // 292:2: -> ^( IMPORT $id $loc ( $ns)? ( viType )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:292:6: ^( IMPORT $id $loc ( $ns)? ( viType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                adaptor.addChild(root_1, stream_loc.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:292:24: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:292:29: ( viType )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:294:1: messages : 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) ;
    public final BPELscriptParser.messages_return messages() throws RecognitionException {
        BPELscriptParser.messages_return retval = new BPELscriptParser.messages_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal296=null;
        Token char_literal297=null;
        List list_m=null;
        RuleReturnScope m = null;
        CommonTree string_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_message=new RewriteRuleSubtreeStream(adaptor,"rule message");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:295:2: ( 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:295:4: 'messages' m+= message ( ',' m+= message )*
            {
            string_literal296=(Token)match(input,159,FOLLOW_159_in_messages2795);  
            stream_159.add(string_literal296);

            pushFollow(FOLLOW_message_in_messages2799);
            m=message();

            state._fsp--;

            stream_message.add(m.getTree());
            if (list_m==null) list_m=new ArrayList();
            list_m.add(m);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:295:26: ( ',' m+= message )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==109) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:295:27: ',' m+= message
            	    {
            	    char_literal297=(Token)match(input,109,FOLLOW_109_in_messages2802);  
            	    stream_109.add(char_literal297);

            	    pushFollow(FOLLOW_message_in_messages2806);
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
            // 295:44: -> ^( MESSAGES ( message )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:295:47: ^( MESSAGES ( message )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:297:1: message : ID -> ^( MESSAGE ID ) ;
    public final BPELscriptParser.message_return message() throws RecognitionException {
        BPELscriptParser.message_return retval = new BPELscriptParser.message_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID298=null;

        CommonTree ID298_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:297:9: ( ID -> ^( MESSAGE ID ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:297:11: ID
            {
            ID298=(Token)match(input,ID,FOLLOW_ID_in_message2826);  
            stream_ID.add(ID298);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:14: -> ^( MESSAGE ID )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:297:17: ^( MESSAGE ID )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:299:1: variables : 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) ;
    public final BPELscriptParser.variables_return variables() throws RecognitionException {
        BPELscriptParser.variables_return retval = new BPELscriptParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal299=null;
        Token char_literal300=null;
        List list_v=null;
        RuleReturnScope v = null;
        CommonTree string_literal299_tree=null;
        CommonTree char_literal300_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:299:11: ( 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:299:13: 'var' v+= variable ( ',' v+= variable )*
            {
            string_literal299=(Token)match(input,160,FOLLOW_160_in_variables2844);  
            stream_160.add(string_literal299);

            pushFollow(FOLLOW_variable_in_variables2848);
            v=variable();

            state._fsp--;

            stream_variable.add(v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:299:31: ( ',' v+= variable )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==109) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:299:32: ',' v+= variable
            	    {
            	    char_literal300=(Token)match(input,109,FOLLOW_109_in_variables2851);  
            	    stream_109.add(char_literal300);

            	    pushFollow(FOLLOW_variable_in_variables2855);
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
            // 300:3: -> ^( VARIABLES ( variable )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:300:7: ^( VARIABLES ( variable )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:302:1: variable : ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) ;
    public final BPELscriptParser.variable_return variable() throws RecognitionException {
        BPELscriptParser.variable_return retval = new BPELscriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID304=null;
        BPELscriptParser.msgType_return msgType301 = null;

        BPELscriptParser.viType_return viType302 = null;

        BPELscriptParser.viElt_return viElt303 = null;

        BPELscriptParser.with_ex_return with_ex305 = null;


        CommonTree ID304_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:2: ( ( msgType )? ( viType )? ( viElt )? ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:4: ( msgType )? ( viType )? ( viElt )? ID ( with_ex )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:4: ( msgType )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=180 && LA104_0<=181)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:4: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable2879);
                    msgType301=msgType();

                    state._fsp--;

                    stream_msgType.add(msgType301.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:13: ( viType )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==182) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:13: viType
                    {
                    pushFollow(FOLLOW_viType_in_variable2882);
                    viType302=viType();

                    state._fsp--;

                    stream_viType.add(viType302.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:21: ( viElt )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==183) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:303:21: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable2885);
                    viElt303=viElt();

                    state._fsp--;

                    stream_viElt.add(viElt303.getTree());

                    }
                    break;

            }

            ID304=(Token)match(input,ID,FOLLOW_ID_in_variable2890);  
            stream_ID.add(ID304);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:304:7: ( with_ex )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==142) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:304:7: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable2893);
                    with_ex305=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex305.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, viElt, viType, msgType, with_ex
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 305:2: -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:305:6: ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:305:20: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:305:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:305:37: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:305:44: ( with_ex )?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:307:1: partner_links : ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) ;
    public final BPELscriptParser.partner_links_return partner_links() throws RecognitionException {
        BPELscriptParser.partner_links_return retval = new BPELscriptParser.partner_links_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal306=null;
        Token string_literal307=null;
        Token char_literal308=null;
        List list_pl=null;
        RuleReturnScope pl = null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree char_literal308_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_partner_link=new RewriteRuleSubtreeStream(adaptor,"rule partner_link");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:2: ( ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:4: ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )*
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:4: ( 'partnerLink' | 'partnerlink' )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==161) ) {
                alt108=1;
            }
            else if ( (LA108_0==162) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:5: 'partnerLink'
                    {
                    string_literal306=(Token)match(input,161,FOLLOW_161_in_partner_links2926);  
                    stream_161.add(string_literal306);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:21: 'partnerlink'
                    {
                    string_literal307=(Token)match(input,162,FOLLOW_162_in_partner_links2930);  
                    stream_162.add(string_literal307);


                    }
                    break;

            }

            pushFollow(FOLLOW_partner_link_in_partner_links2935);
            pl=partner_link();

            state._fsp--;

            stream_partner_link.add(pl.getTree());
            if (list_pl==null) list_pl=new ArrayList();
            list_pl.add(pl);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:53: ( ',' pl+= partner_link )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==109) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:54: ',' pl+= partner_link
            	    {
            	    char_literal308=(Token)match(input,109,FOLLOW_109_in_partner_links2938);  
            	    stream_109.add(char_literal308);

            	    pushFollow(FOLLOW_partner_link_in_partner_links2942);
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
            // 308:77: -> ^( PARTNERLINKS ( $pl)+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:308:80: ^( PARTNERLINKS ( $pl)+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:310:1: partner_link : ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) ;
    public final BPELscriptParser.partner_link_return partner_link() throws RecognitionException {
        BPELscriptParser.partner_link_return retval = new BPELscriptParser.partner_link_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token ID309=null;
        Token char_literal310=null;
        Token char_literal311=null;
        Token char_literal312=null;
        Token char_literal313=null;
        Token char_literal314=null;
        Token char_literal315=null;
        BPELscriptParser.ns_id_return plType = null;

        BPELscriptParser.ns_id_return roleA = null;

        BPELscriptParser.ns_id_return roleB = null;


        CommonTree init_tree=null;
        CommonTree ID309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree char_literal311_tree=null;
        CommonTree char_literal312_tree=null;
        CommonTree char_literal313_tree=null;
        CommonTree char_literal314_tree=null;
        CommonTree char_literal315_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_INITPARTNER=new RewriteRuleTokenStream(adaptor,"token INITPARTNER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:2: ( ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:4: ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')'
            {
            ID309=(Token)match(input,ID,FOLLOW_ID_in_partner_link2964);  
            stream_ID.add(ID309);

            char_literal310=(Token)match(input,130,FOLLOW_130_in_partner_link2966);  
            stream_130.add(char_literal310);

            char_literal311=(Token)match(input,112,FOLLOW_112_in_partner_link2968);  
            stream_112.add(char_literal311);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:21: (plType= ns_id )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ID) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:21: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partner_link2972);
                    plType=ns_id();

                    state._fsp--;

                    stream_ns_id.add(plType.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:29: ( ',' roleA= ns_id )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==109) ) {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==ID) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:30: ',' roleA= ns_id
                    {
                    char_literal312=(Token)match(input,109,FOLLOW_109_in_partner_link2976);  
                    stream_109.add(char_literal312);

                    pushFollow(FOLLOW_ns_id_in_partner_link2980);
                    roleA=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleA.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:48: ( ',' roleB= ns_id )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==109) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==ID) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:49: ',' roleB= ns_id
                    {
                    char_literal313=(Token)match(input,109,FOLLOW_109_in_partner_link2985);  
                    stream_109.add(char_literal313);

                    pushFollow(FOLLOW_ns_id_in_partner_link2989);
                    roleB=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleB.getTree());

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:67: ( ',' init= INITPARTNER )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==109) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:311:68: ',' init= INITPARTNER
                    {
                    char_literal314=(Token)match(input,109,FOLLOW_109_in_partner_link2994);  
                    stream_109.add(char_literal314);

                    init=(Token)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partner_link2998);  
                    stream_INITPARTNER.add(init);


                    }
                    break;

            }

            char_literal315=(Token)match(input,113,FOLLOW_113_in_partner_link3002);  
            stream_113.add(char_literal315);



            // AST REWRITE
            // elements: roleA, ID, roleB, init, plType
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
            // 312:3: -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:312:7: ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PID, "PID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:312:16: ( $plType)?
                if ( stream_plType.hasNext() ) {
                    adaptor.addChild(root_1, stream_plType.nextTree());

                }
                stream_plType.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:312:25: ( $roleA)?
                if ( stream_roleA.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleA.nextTree());

                }
                stream_roleA.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:312:33: ( $roleB)?
                if ( stream_roleB.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleB.nextTree());

                }
                stream_roleB.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:312:41: ( $init)?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:314:1: correlation : '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) ;
    public final BPELscriptParser.correlation_return correlation() throws RecognitionException {
        BPELscriptParser.correlation_return retval = new BPELscriptParser.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal316=null;
        Token char_literal318=null;
        Token char_literal320=null;
        BPELscriptParser.corr_mapping_return corr_mapping317 = null;

        BPELscriptParser.corr_mapping_return corr_mapping319 = null;


        CommonTree char_literal316_tree=null;
        CommonTree char_literal318_tree=null;
        CommonTree char_literal320_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_corr_mapping=new RewriteRuleSubtreeStream(adaptor,"rule corr_mapping");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:315:2: ( '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:315:4: '{' corr_mapping ( ',' corr_mapping )* '}'
            {
            char_literal316=(Token)match(input,106,FOLLOW_106_in_correlation3038);  
            stream_106.add(char_literal316);

            pushFollow(FOLLOW_corr_mapping_in_correlation3040);
            corr_mapping317=corr_mapping();

            state._fsp--;

            stream_corr_mapping.add(corr_mapping317.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:315:21: ( ',' corr_mapping )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==109) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:315:22: ',' corr_mapping
            	    {
            	    char_literal318=(Token)match(input,109,FOLLOW_109_in_correlation3043);  
            	    stream_109.add(char_literal318);

            	    pushFollow(FOLLOW_corr_mapping_in_correlation3045);
            	    corr_mapping319=corr_mapping();

            	    state._fsp--;

            	    stream_corr_mapping.add(corr_mapping319.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            char_literal320=(Token)match(input,107,FOLLOW_107_in_correlation3049);  
            stream_107.add(char_literal320);



            // AST REWRITE
            // elements: corr_mapping
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 315:45: -> ^( CORRELATION ( corr_mapping )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:315:48: ^( CORRELATION ( corr_mapping )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:317:1: corr_mapping : (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) ;
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:318:2: ( (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:318:4: (init= INIT_COR )? (pattern= PATTERN_COR )? f1= ID
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:318:8: (init= INIT_COR )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==INIT_COR) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:318:8: init= INIT_COR
                    {
                    init=(Token)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping3069);  
                    stream_INIT_COR.add(init);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:319:10: (pattern= PATTERN_COR )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==PATTERN_COR) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:319:10: pattern= PATTERN_COR
                    {
                    pattern=(Token)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping3076);  
                    stream_PATTERN_COR.add(pattern);


                    }
                    break;

            }

            f1=(Token)match(input,ID,FOLLOW_ID_in_corr_mapping3083);  
            stream_ID.add(f1);



            // AST REWRITE
            // elements: pattern, init, f1
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
            // 321:2: -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:321:6: ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORR_MAP, "CORR_MAP"), root_1);

                adaptor.addChild(root_1, stream_f1.nextNode());
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:321:21: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:321:28: ( $pattern)?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:1: corr_sets : 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) ;
    public final BPELscriptParser.corr_sets_return corr_sets() throws RecognitionException {
        BPELscriptParser.corr_sets_return retval = new BPELscriptParser.corr_sets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal321=null;
        Token char_literal322=null;
        Token char_literal323=null;
        Token char_literal324=null;
        Token char_literal325=null;
        List list_cs=null;
        RuleReturnScope cs = null;
        CommonTree string_literal321_tree=null;
        CommonTree char_literal322_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree char_literal324_tree=null;
        CommonTree char_literal325_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_corr_set=new RewriteRuleSubtreeStream(adaptor,"rule corr_set");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:12: ( 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:14: 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}'
            {
            string_literal321=(Token)match(input,163,FOLLOW_163_in_corr_sets3111);  
            stream_163.add(string_literal321);

            char_literal322=(Token)match(input,106,FOLLOW_106_in_corr_sets3113);  
            stream_106.add(char_literal322);

            pushFollow(FOLLOW_corr_set_in_corr_sets3116);
            cs=corr_set();

            state._fsp--;

            stream_corr_set.add(cs.getTree());
            if (list_cs==null) list_cs=new ArrayList();
            list_cs.add(cs);

            char_literal323=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3118);  
            stream_SEMI.add(char_literal323);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:47: (cs+= corr_set ';' )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==ID) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:48: cs+= corr_set ';'
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets3123);
            	    cs=corr_set();

            	    state._fsp--;

            	    stream_corr_set.add(cs.getTree());
            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs);

            	    char_literal324=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets3125);  
            	    stream_SEMI.add(char_literal324);


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            char_literal325=(Token)match(input,107,FOLLOW_107_in_corr_sets3129);  
            stream_107.add(char_literal325);



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
            // 323:71: -> ^( CORRSETS ( $cs)+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:323:74: ^( CORRSETS ( $cs)+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:1: corr_set : f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) ;
    public final BPELscriptParser.corr_set_return corr_set() throws RecognitionException {
        BPELscriptParser.corr_set_return retval = new BPELscriptParser.corr_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token f=null;
        Token char_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        Token par=null;
        List list_par=null;

        CommonTree f_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree char_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree par_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:10: (f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:12: f= ID '(' par+= ID ( ',' par+= ID )* ')'
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_corr_set3149);  
            stream_ID.add(f);

            char_literal326=(Token)match(input,112,FOLLOW_112_in_corr_set3151);  
            stream_112.add(char_literal326);

            par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3155);  
            stream_ID.add(par);

            if (list_par==null) list_par=new ArrayList();
            list_par.add(par);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:29: ( ',' par+= ID )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==109) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:30: ',' par+= ID
            	    {
            	    char_literal327=(Token)match(input,109,FOLLOW_109_in_corr_set3158);  
            	    stream_109.add(char_literal327);

            	    par=(Token)match(input,ID,FOLLOW_ID_in_corr_set3162);  
            	    stream_ID.add(par);

            	    if (list_par==null) list_par=new ArrayList();
            	    list_par.add(par);


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            char_literal328=(Token)match(input,113,FOLLOW_113_in_corr_set3166);  
            stream_113.add(char_literal328);



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
            // 325:48: -> ^( CORRSET $f ( $par)+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:325:51: ^( CORRSET $f ( $par)+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:328:1: expr : ( s_expr | EXT_EXPR | funct_call );
    public final BPELscriptParser.expr_return expr() throws RecognitionException {
        BPELscriptParser.expr_return retval = new BPELscriptParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXT_EXPR330=null;
        BPELscriptParser.s_expr_return s_expr329 = null;

        BPELscriptParser.funct_call_return funct_call331 = null;


        CommonTree EXT_EXPR330_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:328:7: ( s_expr | EXT_EXPR | funct_call )
            int alt119=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==SEMI||LA119_1==PROP||LA119_1==113||(LA119_1>=131 && LA119_1<=132)||LA119_1==158||(LA119_1>=164 && LA119_1<=174)) ) {
                    alt119=1;
                }
                else if ( (LA119_1==112) ) {
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
            case 112:
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:328:9: s_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_s_expr_in_expr3189);
                    s_expr329=s_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, s_expr329.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:328:18: EXT_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EXT_EXPR330=(Token)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr3193); 
                    EXT_EXPR330_tree = (CommonTree)adaptor.create(EXT_EXPR330);
                    adaptor.addChild(root_0, EXT_EXPR330_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:328:29: funct_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funct_call_in_expr3197);
                    funct_call331=funct_call();

                    state._fsp--;

                    adaptor.addChild(root_0, funct_call331.getTree());

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:1: funct_call : p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) ;
    public final BPELscriptParser.funct_call_return funct_call() throws RecognitionException {
        BPELscriptParser.funct_call_return retval = new BPELscriptParser.funct_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal332=null;
        Token char_literal333=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal332_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:12: (p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:14: p+= ID '(' (p+= ID )* ')'
            {
            p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3206);  
            stream_ID.add(p);

            if (list_p==null) list_p=new ArrayList();
            list_p.add(p);

            char_literal332=(Token)match(input,112,FOLLOW_112_in_funct_call3208);  
            stream_112.add(char_literal332);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:25: (p+= ID )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==ID) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:25: p+= ID
            	    {
            	    p=(Token)match(input,ID,FOLLOW_ID_in_funct_call3212);  
            	    stream_ID.add(p);

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p);


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            char_literal333=(Token)match(input,113,FOLLOW_113_in_funct_call3215);  
            stream_113.add(char_literal333);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:35: -> ^( CALL ( ID )+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:329:38: ^( CALL ( ID )+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:330:1: s_expr : condExpr ;
    public final BPELscriptParser.s_expr_return s_expr() throws RecognitionException {
        BPELscriptParser.s_expr_return retval = new BPELscriptParser.s_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.condExpr_return condExpr334 = null;



        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:330:9: ( condExpr )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:330:11: condExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_s_expr3232);
            condExpr334=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr334.getTree());

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:1: condExpr : aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? ;
    public final BPELscriptParser.condExpr_return condExpr() throws RecognitionException {
        BPELscriptParser.condExpr_return retval = new BPELscriptParser.condExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal336=null;
        Token string_literal337=null;
        Token char_literal338=null;
        Token char_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;
        BPELscriptParser.aexpr_return aexpr335 = null;

        BPELscriptParser.aexpr_return aexpr342 = null;


        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree char_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:11: ( aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:13: aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr3240);
            aexpr335=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr335.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:19: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=164 && LA122_0<=169)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr
                    {
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
                    int alt121=6;
                    switch ( input.LA(1) ) {
                    case 164:
                        {
                        alt121=1;
                        }
                        break;
                    case 165:
                        {
                        alt121=2;
                        }
                        break;
                    case 166:
                        {
                        alt121=3;
                        }
                        break;
                    case 167:
                        {
                        alt121=4;
                        }
                        break;
                    case 168:
                        {
                        alt121=5;
                        }
                        break;
                    case 169:
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
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:22: '=='
                            {
                            string_literal336=(Token)match(input,164,FOLLOW_164_in_condExpr3245); 
                            string_literal336_tree = (CommonTree)adaptor.create(string_literal336);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal336_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:29: '!='
                            {
                            string_literal337=(Token)match(input,165,FOLLOW_165_in_condExpr3249); 
                            string_literal337_tree = (CommonTree)adaptor.create(string_literal337);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal337_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:36: '<'
                            {
                            char_literal338=(Token)match(input,166,FOLLOW_166_in_condExpr3253); 
                            char_literal338_tree = (CommonTree)adaptor.create(char_literal338);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal338_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:42: '>'
                            {
                            char_literal339=(Token)match(input,167,FOLLOW_167_in_condExpr3257); 
                            char_literal339_tree = (CommonTree)adaptor.create(char_literal339);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal339_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:48: '<='
                            {
                            string_literal340=(Token)match(input,168,FOLLOW_168_in_condExpr3261); 
                            string_literal340_tree = (CommonTree)adaptor.create(string_literal340);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal340_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:331:55: '>='
                            {
                            string_literal341=(Token)match(input,169,FOLLOW_169_in_condExpr3265); 
                            string_literal341_tree = (CommonTree)adaptor.create(string_literal341);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal341_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr3270);
                    aexpr342=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr342.getTree());

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:332:1: aexpr : mexpr ( ( '+' | '-' ) mexpr )* ;
    public final BPELscriptParser.aexpr_return aexpr() throws RecognitionException {
        BPELscriptParser.aexpr_return retval = new BPELscriptParser.aexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set344=null;
        BPELscriptParser.mexpr_return mexpr343 = null;

        BPELscriptParser.mexpr_return mexpr345 = null;


        CommonTree set344_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:332:8: ( mexpr ( ( '+' | '-' ) mexpr )* )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:332:10: mexpr ( ( '+' | '-' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr3281);
            mexpr343=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr343.getTree());
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:332:16: ( ( '+' | '-' ) mexpr )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=170 && LA123_0<=171)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:332:17: ( '+' | '-' ) mexpr
            	    {
            	    set344=(Token)input.LT(1);
            	    set344=(Token)input.LT(1);
            	    if ( (input.LA(1)>=170 && input.LA(1)<=171) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set344), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr3292);
            	    mexpr345=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr345.getTree());

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:1: mexpr : ( atom ( ( '*' | '/' ) atom )* | STRING );
    public final BPELscriptParser.mexpr_return mexpr() throws RecognitionException {
        BPELscriptParser.mexpr_return retval = new BPELscriptParser.mexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set347=null;
        Token STRING349=null;
        BPELscriptParser.atom_return atom346 = null;

        BPELscriptParser.atom_return atom348 = null;


        CommonTree set347_tree=null;
        CommonTree STRING349_tree=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:8: ( atom ( ( '*' | '/' ) atom )* | STRING )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ID||LA125_0==INT||LA125_0==112) ) {
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:10: atom ( ( '*' | '/' ) atom )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_mexpr3302);
                    atom346=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom346.getTree());
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:15: ( ( '*' | '/' ) atom )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( ((LA124_0>=172 && LA124_0<=173)) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:16: ( '*' | '/' ) atom
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

                    	    pushFollow(FOLLOW_atom_in_mexpr3313);
                    	    atom348=atom();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, atom348.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:333:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING349=(Token)match(input,STRING,FOLLOW_STRING_in_mexpr3319); 
                    STRING349_tree = (CommonTree)adaptor.create(STRING349);
                    adaptor.addChild(root_0, STRING349_tree);


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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:334:1: atom : ( path_expr | INT | '(' s_expr ')' -> s_expr );
    public final BPELscriptParser.atom_return atom() throws RecognitionException {
        BPELscriptParser.atom_return retval = new BPELscriptParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT351=null;
        Token char_literal352=null;
        Token char_literal354=null;
        BPELscriptParser.path_expr_return path_expr350 = null;

        BPELscriptParser.s_expr_return s_expr353 = null;


        CommonTree INT351_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree char_literal354_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_s_expr=new RewriteRuleSubtreeStream(adaptor,"rule s_expr");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:334:7: ( path_expr | INT | '(' s_expr ')' -> s_expr )
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
            case 112:
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:334:9: path_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_path_expr_in_atom3327);
                    path_expr350=path_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, path_expr350.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:334:21: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT351=(Token)match(input,INT,FOLLOW_INT_in_atom3331); 
                    INT351_tree = (CommonTree)adaptor.create(INT351);
                    adaptor.addChild(root_0, INT351_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:334:27: '(' s_expr ')'
                    {
                    char_literal352=(Token)match(input,112,FOLLOW_112_in_atom3335);  
                    stream_112.add(char_literal352);

                    pushFollow(FOLLOW_s_expr_in_atom3337);
                    s_expr353=s_expr();

                    state._fsp--;

                    stream_s_expr.add(s_expr353.getTree());
                    char_literal354=(Token)match(input,113,FOLLOW_113_in_atom3339);  
                    stream_113.add(char_literal354);



                    // AST REWRITE
                    // elements: s_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 334:42: -> s_expr
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:1: path_expr : pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) ;
    public final BPELscriptParser.path_expr_return path_expr() throws RecognitionException {
        BPELscriptParser.path_expr_return retval = new BPELscriptParser.path_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal355=null;
        List list_pelmt=null;
        RuleReturnScope pelmt = null;
        CommonTree char_literal355_tree=null;
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:11: (pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:13: pelmt+= ns_id ( '.' pelmt+= ns_id )*
            {
            pushFollow(FOLLOW_ns_id_in_path_expr3352);
            pelmt=ns_id();

            state._fsp--;

            stream_ns_id.add(pelmt.getTree());
            if (list_pelmt==null) list_pelmt=new ArrayList();
            list_pelmt.add(pelmt);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:26: ( '.' pelmt+= ns_id )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==174) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:27: '.' pelmt+= ns_id
            	    {
            	    char_literal355=(Token)match(input,174,FOLLOW_174_in_path_expr3355);  
            	    stream_174.add(char_literal355);

            	    pushFollow(FOLLOW_ns_id_in_path_expr3359);
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
            // 335:46: -> ^( PATH ( $pelmt)+ )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:335:49: ^( PATH ( $pelmt)+ )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:1: ns_id : (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) ;
    public final BPELscriptParser.ns_id_return ns_id() throws RecognitionException {
        BPELscriptParser.ns_id_return retval = new BPELscriptParser.ns_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token pr=null;
        Token loc=null;
        Token string_literal356=null;

        CommonTree pr_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal356_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:8: ( (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:10: (pr= ID '::' )? loc= ID
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:10: (pr= ID '::' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ID) ) {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==158) ) {
                    alt128=1;
                }
            }
            switch (alt128) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:11: pr= ID '::'
                    {
                    pr=(Token)match(input,ID,FOLLOW_ID_in_ns_id3382);  
                    stream_ID.add(pr);

                    string_literal356=(Token)match(input,158,FOLLOW_158_in_ns_id3384);  
                    stream_158.add(string_literal356);


                    }
                    break;

            }

            loc=(Token)match(input,ID,FOLLOW_ID_in_ns_id3390);  
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
            // 336:31: -> ^( NS ( $pr)? $loc)
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:34: ^( NS ( $pr)? $loc)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NS, "NS"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:336:39: ( $pr)?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:1: portType : ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) ;
    public final BPELscriptParser.portType_return portType() throws RecognitionException {
        BPELscriptParser.portType_return retval = new BPELscriptParser.portType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal357=null;
        Token string_literal358=null;
        Token STRING359=null;

        CommonTree string_literal357_tree=null;
        CommonTree string_literal358_tree=null;
        CommonTree STRING359_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:11: ( ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:13: ( '@portType' | '@pt' ) STRING
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:13: ( '@portType' | '@pt' )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==175) ) {
                alt129=1;
            }
            else if ( (LA129_0==176) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:14: '@portType'
                    {
                    string_literal357=(Token)match(input,175,FOLLOW_175_in_portType3414);  
                    stream_175.add(string_literal357);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:339:28: '@pt'
                    {
                    string_literal358=(Token)match(input,176,FOLLOW_176_in_portType3418);  
                    stream_176.add(string_literal358);


                    }
                    break;

            }

            STRING359=(Token)match(input,STRING,FOLLOW_STRING_in_portType3421);  
            stream_STRING.add(STRING359);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:3: -> ^( PORTTYPE STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:340:6: ^( PORTTYPE STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:1: std_attr : ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) ;
    public final BPELscriptParser.std_attr_return std_attr() throws RecognitionException {
        BPELscriptParser.std_attr_return retval = new BPELscriptParser.std_attr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal360=null;

        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal360_tree=null;
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:10: ( ( '@name' name= STRING )? (suppressJoinFailure= SJF )? -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:12: ( '@name' name= STRING )? (suppressJoinFailure= SJF )?
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:12: ( '@name' name= STRING )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==177) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:13: '@name' name= STRING
                    {
                    string_literal360=(Token)match(input,177,FOLLOW_177_in_std_attr3441);  
                    stream_177.add(string_literal360);

                    name=(Token)match(input,STRING,FOLLOW_STRING_in_std_attr3445);  
                    stream_STRING.add(name);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:54: (suppressJoinFailure= SJF )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==SJF) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:342:54: suppressJoinFailure= SJF
                    {
                    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_std_attr3451);  
                    stream_SJF.add(suppressJoinFailure);


                    }
                    break;

            }



            // AST REWRITE
            // elements: suppressJoinFailure, name
            // token labels: suppressJoinFailure, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_suppressJoinFailure=new RewriteRuleTokenStream(adaptor,"token suppressJoinFailure",suppressJoinFailure);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:3: -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:343:6: ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STD_ATTR, "STD_ATTR"), root_1);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:343:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:343:24: ( $suppressJoinFailure)?
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:1: msgEx : ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) ;
    public final BPELscriptParser.msgEx_return msgEx() throws RecognitionException {
        BPELscriptParser.msgEx_return retval = new BPELscriptParser.msgEx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal361=null;
        Token string_literal362=null;
        Token STRING363=null;

        CommonTree string_literal361_tree=null;
        CommonTree string_literal362_tree=null;
        CommonTree STRING363_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:8: ( ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:10: ( '@messageExchange' | '@mex' ) STRING
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:10: ( '@messageExchange' | '@mex' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==178) ) {
                alt132=1;
            }
            else if ( (LA132_0==179) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:11: '@messageExchange'
                    {
                    string_literal361=(Token)match(input,178,FOLLOW_178_in_msgEx3479);  
                    stream_178.add(string_literal361);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:345:32: '@mex'
                    {
                    string_literal362=(Token)match(input,179,FOLLOW_179_in_msgEx3483);  
                    stream_179.add(string_literal362);


                    }
                    break;

            }

            STRING363=(Token)match(input,STRING,FOLLOW_STRING_in_msgEx3486);  
            stream_STRING.add(STRING363);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:3: -> ^( MSGEX STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:346:6: ^( MSGEX STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:1: msgType : ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) ;
    public final BPELscriptParser.msgType_return msgType() throws RecognitionException {
        BPELscriptParser.msgType_return retval = new BPELscriptParser.msgType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token msgT=null;
        Token string_literal364=null;
        Token string_literal365=null;

        CommonTree msgT_tree=null;
        CommonTree string_literal364_tree=null;
        CommonTree string_literal365_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:10: ( ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:12: ( '@messageType' | '@msgType' ) msgT= STRING
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:12: ( '@messageType' | '@msgType' )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==180) ) {
                alt133=1;
            }
            else if ( (LA133_0==181) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:13: '@messageType'
                    {
                    string_literal364=(Token)match(input,180,FOLLOW_180_in_msgType3506);  
                    stream_180.add(string_literal364);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:348:30: '@msgType'
                    {
                    string_literal365=(Token)match(input,181,FOLLOW_181_in_msgType3510);  
                    stream_181.add(string_literal365);


                    }
                    break;

            }

            msgT=(Token)match(input,STRING,FOLLOW_STRING_in_msgType3515);  
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
            // 349:3: -> ^( MSGTYPE STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:349:6: ^( MSGTYPE STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:352:1: viType : '@type' type= STRING -> ^( VITYPE STRING ) ;
    public final BPELscriptParser.viType_return viType() throws RecognitionException {
        BPELscriptParser.viType_return retval = new BPELscriptParser.viType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token string_literal366=null;

        CommonTree type_tree=null;
        CommonTree string_literal366_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:352:9: ( '@type' type= STRING -> ^( VITYPE STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:352:11: '@type' type= STRING
            {
            string_literal366=(Token)match(input,182,FOLLOW_182_in_viType3535);  
            stream_182.add(string_literal366);

            type=(Token)match(input,STRING,FOLLOW_STRING_in_viType3539);  
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
            // 353:3: -> ^( VITYPE STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:353:6: ^( VITYPE STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:355:1: viElt : '@element' elt= STRING -> ^( VIELT STRING ) ;
    public final BPELscriptParser.viElt_return viElt() throws RecognitionException {
        BPELscriptParser.viElt_return retval = new BPELscriptParser.viElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token elt=null;
        Token string_literal367=null;

        CommonTree elt_tree=null;
        CommonTree string_literal367_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:355:8: ( '@element' elt= STRING -> ^( VIELT STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:355:10: '@element' elt= STRING
            {
            string_literal367=(Token)match(input,183,FOLLOW_183_in_viElt3559);  
            stream_183.add(string_literal367);

            elt=(Token)match(input,STRING,FOLLOW_STRING_in_viElt3563);  
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
            // 356:3: -> ^( VIELT STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:356:6: ^( VIELT STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:1: faultName : ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) ;
    public final BPELscriptParser.faultName_return faultName() throws RecognitionException {
        BPELscriptParser.faultName_return retval = new BPELscriptParser.faultName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal368=null;
        Token string_literal369=null;
        Token STRING370=null;

        CommonTree string_literal368_tree=null;
        CommonTree string_literal369_tree=null;
        CommonTree STRING370_tree=null;
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:11: ( ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:13: ( '@faultName' | '@fault' ) STRING
            {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:13: ( '@faultName' | '@fault' )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==184) ) {
                alt134=1;
            }
            else if ( (LA134_0==185) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:14: '@faultName'
                    {
                    string_literal368=(Token)match(input,184,FOLLOW_184_in_faultName3582);  
                    stream_184.add(string_literal368);


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:358:29: '@fault'
                    {
                    string_literal369=(Token)match(input,185,FOLLOW_185_in_faultName3586);  
                    stream_185.add(string_literal369);


                    }
                    break;

            }

            STRING370=(Token)match(input,STRING,FOLLOW_STRING_in_faultName3589);  
            stream_STRING.add(STRING370);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:3: -> ^( FAULTNAME STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:359:6: ^( FAULTNAME STRING )
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:361:1: faultElt : '@faultElement' STRING -> ^( FAULTELT STRING ) ;
    public final BPELscriptParser.faultElt_return faultElt() throws RecognitionException {
        BPELscriptParser.faultElt_return retval = new BPELscriptParser.faultElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal371=null;
        Token STRING372=null;

        CommonTree string_literal371_tree=null;
        CommonTree STRING372_tree=null;
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:361:10: ( '@faultElement' STRING -> ^( FAULTELT STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:361:12: '@faultElement' STRING
            {
            string_literal371=(Token)match(input,186,FOLLOW_186_in_faultElt3607);  
            stream_186.add(string_literal371);

            STRING372=(Token)match(input,STRING,FOLLOW_STRING_in_faultElt3609);  
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
            // 362:3: -> ^( FAULTELT STRING )
            {
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscript.g:362:6: ^( FAULTELT STRING )
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
        "\1\116\1\115\1\121\2\uffff\1\116\11\uffff\1\116\1\115\2\121\1\116";
    static final String DFA14_maxS =
        "\1\u00b9\1\115\1\u009a\2\uffff\1\u00b9\11\uffff\1\u009a\1\115\1"+
        "\u0090\1\u009a\1\u0090";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\5\uffff";
    static final String DFA14_specialS =
        "\24\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\12\1\uffff\1\16\1\5\2\11\1\12\1\uffff\3\16\1\uffff\1"+
            "\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5\uffff\1\3\2\uffff"+
            "\1\7\1\10\1\uffff\1\11\3\uffff\1\14\3\uffff\1\12\6\uffff\13"+
            "\16\4\uffff\4\16\1\15\13\uffff\2\16\1\1\2\16\4\uffff\2\16",
            "\1\17",
            "\1\16\11\uffff\1\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5"+
            "\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\7\uffff\1\12\6\uffff"+
            "\3\16\2\uffff\6\16",
            "",
            "",
            "\1\21\2\uffff\1\16\5\uffff\3\16\24\uffff\1\6\41\uffff\1\16"+
            "\40\uffff\1\20\2\16\4\uffff\2\16",
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
            "\3\16\2\uffff\6\16",
            "\1\23",
            "\1\16\34\uffff\1\6\41\uffff\1\16",
            "\1\16\11\uffff\1\13\22\uffff\1\6\3\uffff\2\16\1\uffff\1\4\5"+
            "\uffff\1\3\2\uffff\1\7\1\10\1\uffff\1\11\16\uffff\3\16\2\uffff"+
            "\6\16",
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
            return "98:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages ) SEMI ) );";
        }
    }
    static final String DFA13_eotS =
        "\57\uffff";
    static final String DFA13_eofS =
        "\57\uffff";
    static final String DFA13_minS =
        "\1\116\3\115\1\121\1\uffff\1\116\2\115\1\uffff\2\115\15\uffff\2"+
        "\116\3\115\1\121\2\116\1\115\1\121\2\116\1\115\1\121\3\115\1\121"+
        "\4\116";
    static final String DFA13_maxS =
        "\1\u00b9\3\115\1\u009a\1\uffff\1\u00b9\2\115\1\uffff\2\115\15\uffff"+
        "\1\u00b9\1\u009a\3\115\1\u0090\1\u00b1\1\u00b3\1\115\1\u0092\1\u00b1"+
        "\1\u0090\1\115\1\u0091\3\115\1\u0091\1\u0092\1\u0091\1\u00b1\1\u0091";
    static final String DFA13_acceptS =
        "\5\uffff\1\1\3\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
        "\12\1\13\1\14\1\15\1\16\1\17\26\uffff";
    static final String DFA13_specialS =
        "\57\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\2\uffff\1\15\1\6\4\uffff\3\15\30\uffff\1\20\1\21\34\uffff"+
            "\1\11\1\14\1\5\3\16\1\17\1\26\1\22\1\24\1\27\4\uffff\1\30\1"+
            "\23\2\25\14\uffff\1\1\1\2\1\3\1\7\1\10\4\uffff\1\12\1\13",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\15\40\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5\2\uffff\1\16"+
            "\1\17\1\26\1\22\1\24\1\27",
            "",
            "\1\36\2\uffff\1\15\5\uffff\3\15\66\uffff\1\11\40\uffff\1\35"+
            "\1\33\1\34\4\uffff\2\15",
            "\1\37",
            "\1\37",
            "",
            "\1\40",
            "\1\40",
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
            "\1\42\2\uffff\1\15\1\6\4\uffff\3\15\66\uffff\1\11\1\14\1\5"+
            "\36\uffff\1\41\1\7\1\10\4\uffff\1\12\1\13",
            "\1\4\2\uffff\1\15\40\uffff\1\20\1\21\34\uffff\1\11\1\14\1\5"+
            "\2\uffff\1\16\1\17\1\26\1\22\1\24\1\27",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\15\76\uffff\1\11",
            "\1\46\2\uffff\1\15\76\uffff\1\11\1\14\37\uffff\1\45",
            "\1\52\2\uffff\1\15\77\uffff\1\14\37\uffff\1\51\1\47\1\50",
            "\1\53",
            "\1\15\76\uffff\1\11\1\14\1\5",
            "\1\36\2\uffff\1\15\76\uffff\1\11\40\uffff\1\35",
            "\1\36\2\uffff\1\15\76\uffff\1\11",
            "\1\54",
            "\1\15\76\uffff\1\11\1\14",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\15\77\uffff\1\14",
            "\1\42\2\uffff\1\15\76\uffff\1\11\1\14\1\5",
            "\1\46\2\uffff\1\15\76\uffff\1\11\1\14",
            "\1\52\2\uffff\1\15\77\uffff\1\14\37\uffff\1\51",
            "\1\52\2\uffff\1\15\77\uffff\1\14"
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
            return "103:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages )";
        }
    }
    static final String DFA95_eotS =
        "\12\uffff";
    static final String DFA95_eofS =
        "\12\uffff";
    static final String DFA95_minS =
        "\1\57\2\115\1\uffff\1\115\1\u0090\2\uffff\2\116";
    static final String DFA95_maxS =
        "\1\u00b3\2\115\1\uffff\1\115\1\u0092\2\uffff\1\u00b3\1\u0092";
    static final String DFA95_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\2\uffff";
    static final String DFA95_specialS =
        "\12\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\7\35\uffff\1\7\1\5\2\uffff\1\7\1\3\15\uffff\1\7\17\uffff"+
            "\1\7\37\uffff\1\3\1\uffff\1\6\34\uffff\1\1\1\2\1\4\2\3",
            "\1\10",
            "\1\10",
            "",
            "\1\11",
            "\1\3\1\uffff\1\6",
            "",
            "",
            "\1\5\3\uffff\1\3\75\uffff\1\3\1\uffff\1\6\36\uffff\1\4\2\3",
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
            return "250:1: rvalue : ( receive | invoke | expr ( PROP )? );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program306 = new BitSet(new long[]{0x0000000000000002L,0x000003801000C000L,0x0040000018000000L});
    public static final BitSet FOLLOW_process_in_declaration325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_process358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_process362 = new BitSet(new long[]{0x0000000000000000L,0x000003000000C000L});
    public static final BitSet FOLLOW_104_in_process369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_process373 = new BitSet(new long[]{0x0000000000000000L,0x000002000000C000L});
    public static final BitSet FOLLOW_SJF_in_process382 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008000L});
    public static final BitSet FOLLOW_EOSF_in_process389 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_process394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ns_id_in_process396 = new BitSet(new long[]{0x0000000000000000L,0x0300040000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_std_attr_in_process398 = new BitSet(new long[]{0x0000000000000000L,0x0300040000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ajoin_in_process404 = new BitSet(new long[]{0x0000000000000000L,0x0300040000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_asignal_in_process409 = new BitSet(new long[]{0x0000000000000000L,0x0300040000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_process415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_eventHdl_in_process417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_proc_stmts467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts469 = new BitSet(new long[]{0x0000000000000000L,0xC82C40000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts473 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_signal_in_proc_stmts478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts480 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_proc_stmt519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_receive_in_proc_stmt565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_reply_in_proc_stmt569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_assign_in_proc_stmt573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_exit_in_proc_stmt593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_variables_in_proc_stmt599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_validate_in_proc_stmt603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_partner_links_in_proc_stmt607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_nop_in_proc_stmt615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_messages_in_proc_stmt619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmt622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_block633 = new BitSet(new long[]{0x0000000000000000L,0xCC2C40000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_proc_stmts_in_block635 = new BitSet(new long[]{0x0000000000000000L,0xCC2C48000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_107_in_block638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_scope_block656 = new BitSet(new long[]{0x0000000000000000L,0xCC2C4B801BBEC000L,0x034F800F9FFF0222L});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block658 = new BitSet(new long[]{0x0000000000000000L,0xCC2C4B801BBEC000L,0x034F800F9FFF0222L});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block661 = new BitSet(new long[]{0x0000000000000000L,0xCC2C48000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_107_in_scope_block664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_param_block684 = new BitSet(new long[]{0x0000000000000000L,0xCC2C58000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_108_in_param_block687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_param_block691 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_109_in_param_block694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_param_block698 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_108_in_param_block702 = new BitSet(new long[]{0x0000000000000000L,0xCC2C58000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block706 = new BitSet(new long[]{0x0000000000000000L,0xCC2C58000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_107_in_param_block709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick744 = new BitSet(new long[]{0x0000000000000000L,0x0000400000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_std_attr_in_pick747 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_pick751 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_pick753 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x000D800000000000L});
    public static final BitSet FOLLOW_onMessage_in_pick755 = new BitSet(new long[]{0x0000000000000000L,0x031C8C0000004000L,0x000F800000000000L});
    public static final BitSet FOLLOW_onAlarm_in_pick758 = new BitSet(new long[]{0x0000000000000000L,0x031C0C0000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_107_in_pick761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onMessage796 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_msgEx_in_onMessage799 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_onMessage804 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_onMessage806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage810 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_onMessage812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage816 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_onMessage819 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_correlation_in_onMessage821 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage825 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_ex_in_onMessage827 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_param_block_in_onMessage840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_onAlarm905 = new BitSet(new long[]{0x0000000000000000L,0x031C0C0000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_timeout_in_onAlarm909 = new BitSet(new long[]{0x0000000000000000L,0x031C0C0000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm913 = new BitSet(new long[]{0x0000000000000000L,0x031C0C0000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_alarm953 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_alarm958 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_alarm960 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_alarm962 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_alarm964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_timeout989 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_timeout994 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_timeout996 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_timeout997 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_timeout999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_repeatEvery1023 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_repeatEvery1025 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1027 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_repeatEvery1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_flow1048 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_flow1052 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_flow1056 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_flow1060 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_flow1064 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_119_in_signal1091 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_signal1093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_signal1094 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_signal1097 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_signal1099 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_signal1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_asignal1122 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_asignal1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_asignal1125 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_asignal1128 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_asignal1130 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_asignal1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ajoin1154 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ajoin1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_ajoin1160 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_ajoin1163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_ajoin1167 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_ajoin1172 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_ajoin1174 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_join1200 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_join1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_join1206 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_join1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_join1213 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_join1218 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_join1220 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_join1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1246 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_if_ex1250 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_ex1252 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1256 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_ex1258 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_if_ex1262 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_124_in_if_ex1265 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_if_ex1267 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1271 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_if_ex1273 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_if_ex1277 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_125_in_if_ex1282 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_if_ex1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_sequence1337 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_ajoin_in_sequence1343 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_asignal_in_sequence1348 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_body_in_sequence1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ajoin_in_scope_sequence1387 = new BitSet(new long[]{0x0000000000000000L,0xCF3C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_asignal_in_scope_sequence1392 = new BitSet(new long[]{0x0000000000000000L,0xCF3C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1426 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_while_ex1431 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_while_ex1433 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_while_ex1435 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_while_ex1437 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_while_ex1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1461 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_until_ex1466 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_sequence_in_until_ex1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_until_ex1472 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_until_ex1474 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_until_ex1476 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_until_ex1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L,0x0002000000000002L});
    public static final BitSet FOLLOW_SBO_in_foreach1506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000000002L});
    public static final BitSet FOLLOW_std_attr_in_foreach1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_foreach1516 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_foreach1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_foreach1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_foreach1524 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_foreach1531 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1533 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1538 = new BitSet(new long[]{0x0000000000000000L,0x0002000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_foreach1542 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_SEMI_in_foreach1544 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_expr_in_foreach1549 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_foreach1553 = new BitSet(new long[]{0x0000000000000000L,0xCF3C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_scope_short_in_foreach1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_try_ex1595 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_body_in_try_ex1597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x04000000000001C0L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex1599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x04000000000001C0L});
    public static final BitSet FOLLOW_catchAll_in_try_ex1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_catch_ex1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_catch_ex1643 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_catch_ex1645 = new BitSet(new long[]{0x0000000000000000L,0x0000000003864000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex1647 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_catch_ex1650 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_param_block_in_catch_ex1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_catchAll1682 = new BitSet(new long[]{0x0000000000000000L,0x0300040000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_catchAll1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex1703 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SJF_in_scope_ex1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_scope_ex1714 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_112_in_scope_ex1717 = new BitSet(new long[]{0x0000000000000000L,0x0002000000020000L});
    public static final BitSet FOLLOW_ID_in_scope_ex1719 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_scope_ex1722 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002C00L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002C00L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt1785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_termination_in_scope_stmt1788 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_termination1818 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_body_in_termination1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_eventHdl1838 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_eventHdl1840 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x03BF800F87FF1222L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl1842 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x03BF800F87FF1222L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl1845 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_107_in_eventHdl1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onEvent1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x00BC000000001000L});
    public static final BitSet FOLLOW_msgEx_in_onEvent1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x00B0000000001000L});
    public static final BitSet FOLLOW_msgType_in_onEvent1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_viElt_in_onEvent1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_onEvent1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_onEvent1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_onEvent1909 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_onEvent1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent1915 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_onEvent1917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent1921 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_onEvent1924 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_correlation_in_onEvent1926 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent1930 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x030F800F87FF4222L});
    public static final BitSet FOLLOW_with_ex_in_onEvent1932 = new BitSet(new long[]{0x0000000000000000L,0xCF3D5C000BBEC000L,0x030F800F87FF4222L});
    public static final BitSet FOLLOW_scope_short_in_onEvent1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_compensation1986 = new BitSet(new long[]{0x0000000000000000L,0xCF2C5C000BBEC000L,0x030F800F87FF0222L});
    public static final BitSet FOLLOW_body_in_compensation1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_with_ex2007 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_with_ex2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2013 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_with_ex2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2020 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_113_in_with_ex2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_with_map2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_with_map2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_KEY_in_with_map2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_path_expr_in_with_map2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_receive2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L,0x000E000000010000L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x000E000000010000L});
    public static final BitSet FOLLOW_msgEx_in_receive2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000010000L});
    public static final BitSet FOLLOW_std_attr_in_receive2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_receive2101 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_receive2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_receive2107 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_receive2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_receive2113 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_receive2116 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_correlation_in_receive2118 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_receive2122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_ex_in_receive2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_reply2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x030E000000020000L});
    public static final BitSet FOLLOW_faultName_in_reply2168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x000E000000020000L});
    public static final BitSet FOLLOW_msgEx_in_reply2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000020000L});
    public static final BitSet FOLLOW_std_attr_in_reply2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_reply2178 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_reply2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_reply2184 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_reply2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_reply2190 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_reply2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_reply2197 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_reply2202 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_correlation_in_reply2204 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_reply2208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_ex_in_reply2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_invoke2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000040000L});
    public static final BitSet FOLLOW_std_attr_in_invoke2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_invoke2260 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_invoke2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_invoke2266 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_invoke2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_invoke2272 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_invoke2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_invoke2279 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_invoke2284 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_correlation_in_invoke2286 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_invoke2290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_with_ex_in_invoke2292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_compensation_in_invoke2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_assign2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_VALID_in_assign2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_IGNORE_in_assign2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_faultName_in_assign2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_msgEx_in_assign2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_std_attr_in_assign2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_path_expr_in_assign2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PROP_in_assign2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_assign2368 = new BitSet(new long[]{0x0000800000000000L,0x0001000103866000L,0x030F800000050000L});
    public static final BitSet FOLLOW_rvalue_in_assign2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_rvalue2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue2428 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_throw_ex2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_148_in_throw_ex2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_throw_ex2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000200000L});
    public static final BitSet FOLLOW_std_attr_in_throw_ex2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_throw_ex2459 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_throw_ex2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex2463 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_throw_ex2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex2490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_rethrow_ex2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_compensate2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_compensate2515 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_compensate2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_compensate2522 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_compensate2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_exit2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_exit2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_validate2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_validate2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_validate2581 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_validate2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_validate2588 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_std_attr_in_ext_act2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_nop2641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_nop2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_namespace2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_namespace2666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_namespace2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_namespace2670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_namespace2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUSTUND_in_extension2693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_extension2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_extension2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_extension2703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_extension2705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_extension2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_viType_in_imports2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_imports2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_imports2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_imports2745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000022000L});
    public static final BitSet FOLLOW_ID_in_imports2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_imports2752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_imports2759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_imports2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_messages2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_message_in_messages2799 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_messages2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_message_in_messages2806 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_message2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_variables2844 = new BitSet(new long[]{0x0000000000000000L,0x000003801002C000L,0x00F0000018000000L});
    public static final BitSet FOLLOW_variable_in_variables2848 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_variables2851 = new BitSet(new long[]{0x0000000000000000L,0x000003801002C000L,0x00F0000018000000L});
    public static final BitSet FOLLOW_variable_in_variables2855 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_msgType_in_variable2879 = new BitSet(new long[]{0x0000000000000000L,0x000003801002C000L,0x00C0000018000000L});
    public static final BitSet FOLLOW_viType_in_variable2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0080000000000000L});
    public static final BitSet FOLLOW_viElt_in_variable2885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_variable2890 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_ex_in_variable2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_partner_links2926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_162_in_partner_links2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links2935 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_partner_links2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links2942 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_partner_link2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_partner_link2966 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_partner_link2968 = new BitSet(new long[]{0x0000000000000000L,0x0002200003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link2972 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_partner_link2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link2980 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_partner_link2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link2989 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_partner_link2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partner_link2998 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_correlation3038 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0020000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3040 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_correlation3043 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0020000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3045 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_correlation3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000080020000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_corr_mapping3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_corr_sets3111 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_corr_sets3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3118 = new BitSet(new long[]{0x0000000000000000L,0x0000080000020000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets3125 = new BitSet(new long[]{0x0000000000000000L,0x0000080000020000L});
    public static final BitSet FOLLOW_107_in_corr_sets3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_corr_set3149 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_corr_set3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_corr_set3155 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_109_in_corr_set3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_corr_set3162 = new BitSet(new long[]{0x0000000000000000L,0x0002200000000000L});
    public static final BitSet FOLLOW_113_in_corr_set3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_expr_in_expr3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funct_call3206 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_funct_call3208 = new BitSet(new long[]{0x0000000000000000L,0x0002000000020000L});
    public static final BitSet FOLLOW_ID_in_funct_call3212 = new BitSet(new long[]{0x0000000000000000L,0x0002000000020000L});
    public static final BitSet FOLLOW_113_in_funct_call3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_s_expr3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000003F000000000L});
    public static final BitSet FOLLOW_164_in_condExpr3245 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_165_in_condExpr3249 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_166_in_condExpr3253 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_167_in_condExpr3257 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_168_in_condExpr3261 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_169_in_condExpr3265 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_aexpr_in_condExpr3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_set_in_aexpr3284 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_mexpr_in_aexpr3292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_set_in_mexpr3305 = new BitSet(new long[]{0x0000000000000000L,0x0001000103864000L,0x030F800000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr3313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_STRING_in_mexpr3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_atom3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_atom3335 = new BitSet(new long[]{0x0000000000000000L,0x0001000103866000L,0x030F800000000000L});
    public static final BitSet FOLLOW_s_expr_in_atom3337 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_atom3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_174_in_path_expr3355 = new BitSet(new long[]{0x0000000000000000L,0x0000000003C64000L,0x030F800000000000L});
    public static final BitSet FOLLOW_ns_id_in_path_expr3359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_ns_id3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_ns_id3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_ns_id3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_portType3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_176_in_portType3418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_portType3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_std_attr3441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_std_attr3445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_std_attr3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_msgEx3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_179_in_msgEx3483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_msgEx3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_msgType3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_181_in_msgType3510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_msgType3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_viType3535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_viType3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_viElt3559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_viElt3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_faultName3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_185_in_faultName3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_faultName3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_faultElt3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_faultElt3609 = new BitSet(new long[]{0x0000000000000002L});

}