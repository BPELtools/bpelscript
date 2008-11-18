// $ANTLR 3.1b2 /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g 2008-11-11 14:52:18

/*
 * Copyright 2008 Marc Bischof 
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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class BPELscriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "STRING", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'@queryLanguage'", "'@expressionLanguage'", "'process'", "'{'", "'}'", "'|'", "','", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@name'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'", "XML_EMPTY_ELEMENT", "XML_ELEMENT", "XML_ATTRIBUTE", "XML_NAME", "XML_ATTRIBUTE_VALUE", "XML_TEXT", "XML_WS", "XML_COMMENT", "XML_CDATA", "XML_PI", "'=>'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=97;
    public static final int NOP=44;
    public static final int T__160=160;
    public static final int PARTNERLINKS=63;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int EVENTHDL=68;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int IMPORT=55;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int FLOWS=9;
    public static final int VALID=87;
    public static final int XML_PI=196;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int TIMEOUT=24;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int PID=61;
    public static final int RETHROW=45;
    public static final int KEY=86;
    public static final int MESSAGES=56;
    public static final int ELSE=12;
    public static final int INT=96;
    public static final int WAIT=22;
    public static final int SJF=78;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int CREATE_INST=82;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=102;
    public static final int T__129=129;
    public static final int SBO=84;
    public static final int CALL=49;
    public static final int EOSF=79;
    public static final int ELSIF=11;
    public static final int INVOKE=16;
    public static final int T__130=130;
    public static final int XML=59;
    public static final int T__131=131;
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
    public static final int ONALARM=66;
    public static final int EXT_EXPR=47;
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
    public static final int BLOCK_PARAM=39;
    public static final int ISOLATED=85;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=89;
    public static final int MSGTYPE=73;
    public static final int SEMI=80;
    public static final int FAULTELT=76;
    public static final int XML_ATTRIBUTE_VALUE=191;
    public static final int XML_ATTRIBUTE=189;
    public static final int VALIDATE=38;
    public static final int TERMINATION=70;
    public static final int CORRSETS=57;
    public static final int INITPARTNER=93;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=100;
    public static final int EXTENSION=53;
    public static final int RECEIVE=18;
    public static final int STRING=77;
    public static final int MSGEX=71;
    public static final int WHILE=13;
    public static final int FAULTNAME=72;
    public static final int REPEATEVERY=67;
    public static final int INIT_COR=94;
    public static final int CATCH_ALL=27;
    public static final int PICK=6;
    public static final int PATH=52;
    public static final int EXTENSIONACT=54;
    public static final int XML_NAME=190;
    public static final int XML_WS=193;
    public static final int XML_CDATA=195;
    public static final int ONMESSAGE=31;
    public static final int EXIT=23;
    public static final int XML_ELEMENT=188;
    public static final int NS=51;
    public static final int CORRELATION=34;
    public static final int PORTTYPE=64;
    public static final int CORR_MAP=35;
    public static final int VIELT=75;
    public static final int TRY=25;
    public static final int NAMESPACE=50;
    public static final int SEQUENCE=7;
    public static final int VITYPE=74;
    public static final int PATTERN_COR=95;
    public static final int SL_COMMENTS=101;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int UNTIL=14;
    public static final int CORRSET=58;
    public static final int REPLY=19;
    public static final int EXT_ACT=91;
    public static final int CATCH=26;
    public static final int THROW=21;
    public static final int KEEPSRC=88;
    public static final int PARALLEL=83;
    public static final int FOR=15;
    public static final int ALARM=30;
    public static final int ID=81;
    public static final int PROP=90;
    public static final int IF=10;
    public static final int XML_EMPTY_ELEMENT=187;
    public static final int XML_COMMENT=194;
    public static final int EXPR=46;
    public static final int T__197=197;
    public static final int SCOPE=28;
    public static final int DIGIT=98;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int MUSTUND=92;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int JS=60;
    public static final int T__181=181;
    public static final int XML_TEXT=192;
    public static final int EVENT=29;
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
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ESCAPE_SEQ=99;
    public static final int MAP=43;
    public static final int VARIABLES=62;
    public static final int ASSIGN=20;
    public static final int XML_LITERAL=48;
    public static final int T__169=169;

    // delegates
    // delegators


        public BPELscriptWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public BPELscriptWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("BPELscriptWalkerTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return BPELscriptWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g"; }


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


    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:101:1: program : ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls);
    public final BPELscriptWalker.program_return program() throws RecognitionException {
        BPELscriptWalker.program_return retval = new BPELscriptWalker.program_return();
        retval.start = input.LT(1);

        List list_decls=null;
        RuleReturnScope decls = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:102:2: ( ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:102:4: ^( ROOT (decls+= declaration )+ )
            {
            match(input,ROOT,FOLLOW_ROOT_in_program115); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:102:16: (decls+= declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PROCESS||LA1_0==NAMESPACE||LA1_0==EXTENSION||LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:102:16: decls+= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program119);
            	    decls=declaration();

            	    state._fsp--;

            	    if (list_decls==null) list_decls=new ArrayList();
            	    list_decls.add(decls.getTemplate());


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


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 104:2: -> list(content_st=$decls)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", list_decls));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:107:1: declaration : ( process -> decl(name_st=$process.st) | sub_declaration );
    public final BPELscriptWalker.declaration_return declaration() throws RecognitionException {
        BPELscriptWalker.declaration_return retval = new BPELscriptWalker.declaration_return();
        retval.start = input.LT(1);

        BPELscriptWalker.process_return process1 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:108:2: ( process -> decl(name_st=$process.st) | sub_declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PROCESS) ) {
                alt2=1;
            }
            else if ( (LA2_0==NAMESPACE||LA2_0==EXTENSION||LA2_0==IMPORT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:108:4: process
                    {
                    pushFollow(FOLLOW_process_in_declaration148);
                    process1=process();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 108:12: -> decl(name_st=$process.st)
                    {
                        retval.st = templateLib.getInstanceOf("decl",
                      new STAttrMap().put("name_st", (process1!=null?process1.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:109:4: sub_declaration
                    {
                    pushFollow(FOLLOW_sub_declaration_in_declaration163);
                    sub_declaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class sub_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sub_declaration"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:112:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptWalker.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptWalker.sub_declaration_return retval = new BPELscriptWalker.sub_declaration_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:113:2: ( namespace | extension | imports )
            int alt3=3;
            switch ( input.LA(1) ) {
            case NAMESPACE:
                {
                alt3=1;
                }
                break;
            case EXTENSION:
                {
                alt3=2;
                }
                break;
            case IMPORT:
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:113:4: namespace
                    {
                    pushFollow(FOLLOW_namespace_in_sub_declaration175);
                    namespace();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:113:16: extension
                    {
                    pushFollow(FOLLOW_extension_in_sub_declaration179);
                    extension();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:113:28: imports
                    {
                    pushFollow(FOLLOW_imports_in_sub_declaration183);
                    imports();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub_declaration"

    public static class process_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "process"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:116:1: process : ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s);
    public final BPELscriptWalker.process_return process() throws RecognitionException {
        BPELscriptWalker.process_return retval = new BPELscriptWalker.process_return();
        retval.start = input.LT(1);

        CommonTree queryLg=null;
        CommonTree exprLg=null;
        CommonTree SJF3=null;
        CommonTree EOSF4=null;
        List list_j=null;
        List list_s=null;
        BPELscriptWalker.ns_id_return ns = null;

        BPELscriptWalker.block_return block2 = null;

        BPELscriptWalker.eventHdl_return eventHdl5 = null;

        BPELscriptWalker.std_attr_return std_attr6 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;

        // auxiliary Map to exclude targetNamespace from global Namespace Map
        HashMap<String, String> loc_ns = new HashMap(glob_ns);
        HashMap<String, String> _vars = new HashMap<String, String>(); 
        HashMap<String, String> _pl = new HashMap<String, String>();
        HashMap<String, String> _messages = new HashMap<String, String>();
        HashMap<String, String> _cs = new HashMap<String, String>();
        HashMap<String, String> _faults = new HashMap<String, String>();
        HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:127:2: ( ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:127:4: ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* )
            {
            match(input,PROCESS,FOLLOW_PROCESS_in_process200); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_process204);
            ns=ns_id();

            state._fsp--;

            pushFollow(FOLLOW_block_in_process206);
            block2=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:127:78: ( eventHdl )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EVENTHDL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:127:78: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process209);
                    eventHdl5=eventHdl();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:11: (queryLg= STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:11: queryLg= STRING
                    {
                    queryLg=(CommonTree)match(input,STRING,FOLLOW_STRING_in_process218); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:26: (exprLg= STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:26: exprLg= STRING
                    {
                    exprLg=(CommonTree)match(input,STRING,FOLLOW_STRING_in_process223); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:35: ( SJF )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SJF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:35: SJF
                    {
                    SJF3=(CommonTree)match(input,SJF,FOLLOW_SJF_in_process226); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:40: ( EOSF )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOSF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:40: EOSF
                    {
                    EOSF4=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_process229); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_process232);
            std_attr6=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:56: (j+= join )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==JOIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:56: j+= join
                    {
                    pushFollow(FOLLOW_join_in_process236);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:65: (s+= signal )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==SIGNAL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:128:65: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_process241);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match(input, Token.UP, null); 
            // remove process' namespace from local namespace list
            		loc_ns.remove((ns!=null?ns.nspre:null));
            	


            // TEMPLATE REWRITE
            // 138:2: -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s)
            {
                retval.st = templateLib.getInstanceOf("process",
              new STAttrMap().put("name", (ns!=null?ns.nsloc:null)).put("tns", glob_ns.get((ns!=null?ns.nspre:null))).put("local", loc_ns).put("content_st", (block2!=null?block2.st:null)).put("queryLg", queryLg).put("exprLg", exprLg).put("sjf", SJF3).put("eOSF", EOSF4).put("exts", extensions).put("imports", imports).put("plinks_p", _pl).put("messages", _messages).put("vars", _vars).put("cors", _cs).put("faultHdl", _faults).put("faultHdl_pb", _faults_pb).put("eventHdl", (eventHdl5!=null?eventHdl5.st:null)).put("std_attr", (std_attr6!=null?std_attr6.st:null)).put("join", list_j).put("signal", list_s));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "process"

    public static class proc_stmts_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "proc_stmts"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:146:1: proc_stmts[Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( PROC_STMTS (j+= join )? (s+= signal )* proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st);
    public final BPELscriptWalker.proc_stmts_return proc_stmts(Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmts_return retval = new BPELscriptWalker.proc_stmts_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.proc_stmt_return proc_stmt7 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:2: ( ^( PROC_STMTS (j+= join )? (s+= signal )* proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:4: ^( PROC_STMTS (j+= join )? (s+= signal )* proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] )
            {
            match(input,PROC_STMTS,FOLLOW_PROC_STMTS_in_proc_stmts412); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:18: (j+= join )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==JOIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:18: j+= join
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts416);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:27: (s+= signal )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SIGNAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:148:27: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts421);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts424);
            proc_stmt7=proc_stmt(list_j, list_s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 149:2: -> list(content_st=$proc_stmt.st)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", (proc_stmt7!=null?proc_stmt7.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmts"

    public static class proc_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "proc_stmt"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:152:1: proc_stmt[List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, \n\t\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$until_ex.st) | foreach[join, signal] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] -> list(content_st=$try_ex.st) | scope_ex[join, signal] -> list(content_st=$scope_ex.st) | receive[join, signal, empty] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb] -> list(content_st=$invoke.st) | reply[join, signal, empty] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null] -> list(content_st=$assign.st) | throw_ex[join, signal, empty] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true] -> list(content_st=$timeout.st) | exit[join, signal, empty] -> list(content_st=$exit.st) | variables[_vars, isInScope] | validate[join, signal, empty, _vars] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope] | compensate[join, signal, empty] -> list(content_st=$compensate.st) | ext_act[join, signal] -> list(content_st=$ext_act.st) | nop[join, signal, empty] -> list(content_st=$nop.st) | messages[_messages, isInScope] | corr_sets[_cs, isInScope] );
    public final BPELscriptWalker.proc_stmt_return proc_stmt(List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmt_return retval = new BPELscriptWalker.proc_stmt_return();
        retval.start = input.LT(1);

        BPELscriptWalker.partnerlinks_return pl = null;

        BPELscriptWalker.pick_return pick8 = null;

        BPELscriptWalker.flow_return flow9 = null;

        BPELscriptWalker.if_ex_return if_ex10 = null;

        BPELscriptWalker.while_ex_return while_ex11 = null;

        BPELscriptWalker.until_ex_return until_ex12 = null;

        BPELscriptWalker.foreach_return foreach13 = null;

        BPELscriptWalker.try_ex_return try_ex14 = null;

        BPELscriptWalker.scope_ex_return scope_ex15 = null;

        BPELscriptWalker.receive_return receive16 = null;

        BPELscriptWalker.invoke_return invoke17 = null;

        BPELscriptWalker.reply_return reply18 = null;

        BPELscriptWalker.assign_return assign19 = null;

        BPELscriptWalker.throw_ex_return throw_ex20 = null;

        BPELscriptWalker.rethrow_ex_return rethrow_ex21 = null;

        BPELscriptWalker.alarm_return alarm22 = null;

        BPELscriptWalker.timeout_return timeout23 = null;

        BPELscriptWalker.exit_return exit24 = null;

        BPELscriptWalker.validate_return validate25 = null;

        BPELscriptWalker.compensate_return compensate26 = null;

        BPELscriptWalker.ext_act_return ext_act27 = null;

        BPELscriptWalker.nop_return nop28 = null;


        boolean empty= join==null && signal==null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:155:2: ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$until_ex.st) | foreach[join, signal] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] -> list(content_st=$try_ex.st) | scope_ex[join, signal] -> list(content_st=$scope_ex.st) | receive[join, signal, empty] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb] -> list(content_st=$invoke.st) | reply[join, signal, empty] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null] -> list(content_st=$assign.st) | throw_ex[join, signal, empty] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true] -> list(content_st=$timeout.st) | exit[join, signal, empty] -> list(content_st=$exit.st) | variables[_vars, isInScope] | validate[join, signal, empty, _vars] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope] | compensate[join, signal, empty] -> list(content_st=$compensate.st) | ext_act[join, signal] -> list(content_st=$ext_act.st) | nop[join, signal, empty] -> list(content_st=$nop.st) | messages[_messages, isInScope] | corr_sets[_cs, isInScope] )
            int alt13=25;
            switch ( input.LA(1) ) {
            case PICK:
                {
                alt13=1;
                }
                break;
            case FLOW:
                {
                alt13=2;
                }
                break;
            case IF:
                {
                alt13=3;
                }
                break;
            case WHILE:
                {
                alt13=4;
                }
                break;
            case UNTIL:
                {
                alt13=5;
                }
                break;
            case FOR:
                {
                alt13=6;
                }
                break;
            case TRY:
                {
                alt13=7;
                }
                break;
            case SCOPE:
                {
                alt13=8;
                }
                break;
            case RECEIVE:
                {
                alt13=9;
                }
                break;
            case INVOKE:
                {
                alt13=10;
                }
                break;
            case REPLY:
                {
                alt13=11;
                }
                break;
            case ASSIGN:
                {
                alt13=12;
                }
                break;
            case THROW:
                {
                alt13=13;
                }
                break;
            case RETHROW:
                {
                alt13=14;
                }
                break;
            case ALARM:
                {
                alt13=15;
                }
                break;
            case TIMEOUT:
                {
                alt13=16;
                }
                break;
            case EXIT:
                {
                alt13=17;
                }
                break;
            case VARIABLES:
                {
                alt13=18;
                }
                break;
            case VALIDATE:
                {
                alt13=19;
                }
                break;
            case PARTNERLINKS:
                {
                alt13=20;
                }
                break;
            case COMPENSATE:
                {
                alt13=21;
                }
                break;
            case EXTENSIONACT:
                {
                alt13=22;
                }
                break;
            case NOP:
                {
                alt13=23;
                }
                break;
            case MESSAGES:
                {
                alt13=24;
                }
                break;
            case CORRSETS:
                {
                alt13=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:155:4: pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_pick_in_proc_stmt455);
                    pick8=pick(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 155:72: -> list(content_st=$pick.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (pick8!=null?pick8.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:156:4: flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_flow_in_proc_stmt471);
                    flow9=flow(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 156:72: -> list(content_st=$flow.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (flow9!=null?flow9.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:157:4: if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_if_ex_in_proc_stmt487);
                    if_ex10=if_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 157:73: -> list(content_st=$if_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (if_ex10!=null?if_ex10.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:158:4: while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_while_ex_in_proc_stmt502);
                    while_ex11=while_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 158:76: -> list(content_st=$while_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (while_ex11!=null?while_ex11.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:159:4: until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_until_ex_in_proc_stmt518);
                    until_ex12=until_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 159:76: -> list(content_st=$until_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (until_ex12!=null?until_ex12.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:160:4: foreach[join, signal]
                    {
                    pushFollow(FOLLOW_foreach_in_proc_stmt534);
                    foreach13=foreach(join, signal);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 160:26: -> list(content_st=$foreach.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (foreach13!=null?foreach13.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:161:4: try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope]
                    {
                    pushFollow(FOLLOW_try_ex_in_proc_stmt549);
                    try_ex14=try_ex(_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 161:71: -> list(content_st=$try_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (try_ex14!=null?try_ex14.st:null)));
                    }


                    }
                    break;
                case 8 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:162:4: scope_ex[join, signal]
                    {
                    pushFollow(FOLLOW_scope_ex_in_proc_stmt564);
                    scope_ex15=scope_ex(join, signal);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 162:27: -> list(content_st=$scope_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (scope_ex15!=null?scope_ex15.st:null)));
                    }


                    }
                    break;
                case 9 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:163:4: receive[join, signal, empty]
                    {
                    pushFollow(FOLLOW_receive_in_proc_stmt579);
                    receive16=receive(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 163:33: -> list(content_st=$receive.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (receive16!=null?receive16.st:null)));
                    }


                    }
                    break;
                case 10 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:164:4: invoke[join, signal, empty, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_invoke_in_proc_stmt594);
                    invoke17=invoke(join, signal, empty, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 164:53: -> list(content_st=$invoke.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (invoke17!=null?invoke17.st:null)));
                    }


                    }
                    break;
                case 11 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:165:4: reply[join, signal, empty]
                    {
                    pushFollow(FOLLOW_reply_in_proc_stmt609);
                    reply18=reply(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 165:31: -> list(content_st=$reply.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (reply18!=null?reply18.st:null)));
                    }


                    }
                    break;
                case 12 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:166:4: assign[join, signal, empty, _vars, _pl, null, null]
                    {
                    pushFollow(FOLLOW_assign_in_proc_stmt624);
                    assign19=assign(join, signal, empty, _vars, _pl, null, null);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 166:56: -> list(content_st=$assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (assign19!=null?assign19.st:null)));
                    }


                    }
                    break;
                case 13 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:167:4: throw_ex[join, signal, empty]
                    {
                    pushFollow(FOLLOW_throw_ex_in_proc_stmt640);
                    throw_ex20=throw_ex(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 167:34: -> list(content_st=$throw_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (throw_ex20!=null?throw_ex20.st:null)));
                    }


                    }
                    break;
                case 14 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:168:4: rethrow_ex[join, signal, empty]
                    {
                    pushFollow(FOLLOW_rethrow_ex_in_proc_stmt655);
                    rethrow_ex21=rethrow_ex(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 168:36: -> list(content_st=$rethrow_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (rethrow_ex21!=null?rethrow_ex21.st:null)));
                    }


                    }
                    break;
                case 15 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:169:4: alarm[join, signal, empty, true]
                    {
                    pushFollow(FOLLOW_alarm_in_proc_stmt670);
                    alarm22=alarm(join, signal, empty, true);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 169:37: -> list(content_st=$alarm.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (alarm22!=null?alarm22.st:null)));
                    }


                    }
                    break;
                case 16 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:170:4: timeout[join, signal, empty, true]
                    {
                    pushFollow(FOLLOW_timeout_in_proc_stmt686);
                    timeout23=timeout(join, signal, empty, true);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 170:39: -> list(content_st=$timeout.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (timeout23!=null?timeout23.st:null)));
                    }


                    }
                    break;
                case 17 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:171:4: exit[join, signal, empty]
                    {
                    pushFollow(FOLLOW_exit_in_proc_stmt702);
                    exit24=exit(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 171:31: -> list(content_st=$exit.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (exit24!=null?exit24.st:null)));
                    }


                    }
                    break;
                case 18 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:172:4: variables[_vars, isInScope]
                    {
                    pushFollow(FOLLOW_variables_in_proc_stmt719);
                    variables(_vars, isInScope);

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:173:4: validate[join, signal, empty, _vars]
                    {
                    pushFollow(FOLLOW_validate_in_proc_stmt726);
                    validate25=validate(join, signal, empty, _vars);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 173:41: -> list(content_st=$validate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (validate25!=null?validate25.st:null)));
                    }


                    }
                    break;
                case 20 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:174:4: pl= partnerlinks[_pl, isInScope]
                    {
                    pushFollow(FOLLOW_partnerlinks_in_proc_stmt743);
                    pl=partnerlinks(_pl, isInScope);

                    state._fsp--;


                    }
                    break;
                case 21 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:175:4: compensate[join, signal, empty]
                    {
                    pushFollow(FOLLOW_compensate_in_proc_stmt750);
                    compensate26=compensate(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 175:36: -> list(content_st=$compensate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (compensate26!=null?compensate26.st:null)));
                    }


                    }
                    break;
                case 22 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:176:4: ext_act[join, signal]
                    {
                    pushFollow(FOLLOW_ext_act_in_proc_stmt765);
                    ext_act27=ext_act(join, signal);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 176:26: -> list(content_st=$ext_act.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (ext_act27!=null?ext_act27.st:null)));
                    }


                    }
                    break;
                case 23 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:177:4: nop[join, signal, empty]
                    {
                    pushFollow(FOLLOW_nop_in_proc_stmt780);
                    nop28=nop(join, signal, empty);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 177:29: -> list(content_st=$nop.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (nop28!=null?nop28.st:null)));
                    }


                    }
                    break;
                case 24 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:178:4: messages[_messages, isInScope]
                    {
                    pushFollow(FOLLOW_messages_in_proc_stmt795);
                    messages(_messages, isInScope);

                    state._fsp--;


                    }
                    break;
                case 25 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:179:4: corr_sets[_cs, isInScope]
                    {
                    pushFollow(FOLLOW_corr_sets_in_proc_stmt802);
                    corr_sets(_cs, isInScope);

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmt"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:183:1: block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.block_return block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.block_return retval = new BPELscriptWalker.block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:185:2: ( ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:185:4: ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_block819); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:185:17: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==PROC_STMTS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:185:17: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block823);
            	    ps=proc_stmts(false, _vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_ps==null) list_ps=new ArrayList();
            	    list_ps.add(ps.getTemplate());


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


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 186:2: -> block(stmts_p=$ps)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("stmts_p", list_ps));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class scope_block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "scope_block"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:190:1: scope_block[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.scope_block_return scope_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.scope_block_return retval = new BPELscriptWalker.scope_block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:192:2: ( ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:192:4: ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_block852); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:192:15: ( sub_declaration )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NAMESPACE||LA15_0==EXTENSION||LA15_0==IMPORT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:192:15: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block854);
            	    sub_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:193:6: (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PROC_STMTS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:193:6: ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block863);
            	    ps=proc_stmts(true, _vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_ps==null) list_ps=new ArrayList();
            	    list_ps.add(ps.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 194:2: -> block(stmts_p=$ps)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("stmts_p", list_ps));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_block"

    public static class param_block_return extends TreeRuleReturnScope {
        public List param_ids;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "param_block"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:197:1: param_block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] returns [List param_ids] : ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps);
    public final BPELscriptWalker.param_block_return param_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.param_block_return retval = new BPELscriptWalker.param_block_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;
        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:2: ( ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:4: ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_param_block896); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:18: (ids+= ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:18: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_param_block900); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:26: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PROC_STMTS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:26: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block905);
            	    ps=proc_stmts(false, _vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_ps==null) list_ps=new ArrayList();
            	    list_ps.add(ps.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input, Token.UP, null); 

            		if(list_ids!=null)	retval.param_ids =list_ids;
            	


            // TEMPLATE REWRITE
            // 204:2: -> block(ids=$idsstmts_p=$ps)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("ids", list_ids).put("stmts_p", list_ps));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_block"

    public static class body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "body"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:207:1: body[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st));
    public final BPELscriptWalker.body_return body(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.body_return retval = new BPELscriptWalker.body_return();
        retval.start = input.LT(1);

        BPELscriptWalker.block_return block29 = null;

        BPELscriptWalker.proc_stmts_return proc_stmts30 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:209:2: ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st))
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==SEQUENCE) ) {
                alt19=1;
            }
            else if ( (LA19_0==PROC_STMTS) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:209:4: block[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_block_in_body941);
                    block29=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 209:59: -> list(content_st=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (block29!=null?block29.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:210:5: proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb]
                    {
                    pushFollow(FOLLOW_proc_stmts_in_body958);
                    proc_stmts30=proc_stmts(false, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 210:66: -> list(content_st=$proc_stmts.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (proc_stmts30!=null?proc_stmts30.st:null)));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class pick_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pick"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:214:1: pick[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.st);
    public final BPELscriptWalker.pick_return pick(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.pick_return retval = new BPELscriptWalker.pick_return();
        retval.start = input.LT(1);

        CommonTree CREATE_INST31=null;
        List list_om=null;
        List list_to=null;
        BPELscriptWalker.std_attr_return std_attr32 = null;

        RuleReturnScope om = null;
        RuleReturnScope to = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:2: ( ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:4: ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr )
            {
            match(input,PICK,FOLLOW_PICK_in_pick983); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:13: (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ONMESSAGE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:13: om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick987);
            	    om=onMessage(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_om==null) list_om=new ArrayList();
            	    list_om.add(om.getTemplate());


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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:77: (to+= onAlarm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ONALARM) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:77: to+= onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick993);
            	    to=onAlarm();

            	    state._fsp--;

            	    if (list_to==null) list_to=new ArrayList();
            	    list_to.add(to.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:88: ( CREATE_INST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CREATE_INST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:88: CREATE_INST
                    {
                    CREATE_INST31=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick996); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_pick999);
            std_attr32=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 217:2: -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("pick",
              new STAttrMap().put("oms", list_om).put("onalarm", list_to).put("join", join).put("signal", signal).put("crt_inst", CREATE_INST31).put("std_attr", (std_attr32!=null?std_attr32.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pick"

    public static class onAlarm_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "onAlarm"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:220:1: onAlarm : ^( ONALARM ( alarm[null, null, true, false] )? ( timeout[null, null, true, false] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st);
    public final BPELscriptWalker.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptWalker.onAlarm_return retval = new BPELscriptWalker.onAlarm_return();
        retval.start = input.LT(1);

        BPELscriptWalker.alarm_return alarm33 = null;

        BPELscriptWalker.timeout_return timeout34 = null;

        BPELscriptWalker.repeatEvery_return repeatEvery35 = null;

        BPELscriptWalker.scope_short_return scope_short36 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:2: ( ^( ONALARM ( alarm[null, null, true, false] )? ( timeout[null, null, true, false] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:4: ^( ONALARM ( alarm[null, null, true, false] )? ( timeout[null, null, true, false] )? ( repeatEvery )? scope_short )
            {
            match(input,ONALARM,FOLLOW_ONALARM_in_onAlarm1048); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:14: ( alarm[null, null, true, false] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ALARM) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:14: alarm[null, null, true, false]
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm1050);
                    alarm33=alarm(null, null, true, false);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:46: ( timeout[null, null, true, false] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TIMEOUT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:46: timeout[null, null, true, false]
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm1054);
                    timeout34=timeout(null, null, true, false);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:80: ( repeatEvery )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==REPEATEVERY) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:80: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm1058);
                    repeatEvery35=repeatEvery();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onAlarm1061);
            scope_short36=scope_short();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 222:2: -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st)
            {
                retval.st = templateLib.getInstanceOf("onAlarm",
              new STAttrMap().put("alarm", (alarm33!=null?alarm33.st:null)).put("timeout", (timeout34!=null?timeout34.st:null)).put("repeat", (repeatEvery35!=null?repeatEvery35.st:null)).put("scope_ex", (scope_short36!=null?scope_short36.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onAlarm"

    public static class alarm_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "alarm"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:225:1: alarm[List join, List signal, Boolean empty, Boolean isWait] : ^( ALARM expr[null] ( std_attr )? ) -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait);
    public final BPELscriptWalker.alarm_return alarm(List join, List signal, Boolean empty, Boolean isWait) throws RecognitionException {
        BPELscriptWalker.alarm_return retval = new BPELscriptWalker.alarm_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr37 = null;

        BPELscriptWalker.std_attr_return std_attr38 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:226:2: ( ^( ALARM expr[null] ( std_attr )? ) -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:226:4: ^( ALARM expr[null] ( std_attr )? )
            {
            match(input,ALARM,FOLLOW_ALARM_in_alarm1109); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_alarm1111);
            expr37=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:226:23: ( std_attr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==STD_ATTR) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:226:23: std_attr
                    {
                    pushFollow(FOLLOW_std_attr_in_alarm1114);
                    std_attr38=std_attr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 227:2: -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "for").put("expr", (expr37!=null?expr37.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr38!=null?std_attr38.st:null)).put("isWait", isWait));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alarm"

    public static class timeout_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "timeout"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:230:1: timeout[List join, List signal, Boolean empty, Boolean isWait] : ^( TIMEOUT expr[null] ( std_attr )? ) -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait);
    public final BPELscriptWalker.timeout_return timeout(List join, List signal, Boolean empty, Boolean isWait) throws RecognitionException {
        BPELscriptWalker.timeout_return retval = new BPELscriptWalker.timeout_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr39 = null;

        BPELscriptWalker.std_attr_return std_attr40 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:231:2: ( ^( TIMEOUT expr[null] ( std_attr )? ) -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:231:4: ^( TIMEOUT expr[null] ( std_attr )? )
            {
            match(input,TIMEOUT,FOLLOW_TIMEOUT_in_timeout1172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_timeout1174);
            expr39=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:231:25: ( std_attr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==STD_ATTR) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:231:25: std_attr
                    {
                    pushFollow(FOLLOW_std_attr_in_timeout1177);
                    std_attr40=std_attr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 232:2: -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWait)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "until").put("expr", (expr39!=null?expr39.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr40!=null?std_attr40.st:null)).put("isWait", isWait));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeout"

    public static class repeatEvery_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "repeatEvery"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:235:1: repeatEvery : ^( REPEATEVERY expr[null] ) -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\");
    public final BPELscriptWalker.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptWalker.repeatEvery_return retval = new BPELscriptWalker.repeatEvery_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr41 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:236:2: ( ^( REPEATEVERY expr[null] ) -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\"))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:236:4: ^( REPEATEVERY expr[null] )
            {
            match(input,REPEATEVERY,FOLLOW_REPEATEVERY_in_repeatEvery1232); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repeatEvery1234);
            expr41=expr(null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 237:2: -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\")
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "repeatEvery").put("expr", (expr41!=null?expr41.st:null)).put("skip", "true"));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "repeatEvery"

    public static class onMessage_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "onMessage"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:240:1: onMessage[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st);
    public final BPELscriptWalker.onMessage_return onMessage(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.onMessage_return retval = new BPELscriptWalker.onMessage_return();
        retval.start = input.LT(1);

        CommonTree p=null;
        CommonTree o=null;
        BPELscriptWalker.param_block_return pb = null;

        BPELscriptWalker.portType_return pt = null;

        BPELscriptWalker.msgEx_return mex = null;

        BPELscriptWalker.correlation_return corr = null;

        BPELscriptWalker.with_ex_return w = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:9: ( ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:12: ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? )
            {
            match(input,ONMESSAGE,FOLLOW_ONMESSAGE_in_onMessage1278); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_param_block_in_onMessage1282);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:13: (pt= portType )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==PORTTYPE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:13: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage1298);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:27: (mex= msgEx )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==MSGEX) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:27: mex= msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage1303);
                    mex=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1308); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1312); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:49: (corr= correlation )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CORRELATION) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:49: corr= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onMessage1316);
                    corr=correlation();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:64: (w= with_ex )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==WITH) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:243:64: w= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage1321);
                    w=with_ex();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 244:9: -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st)
            {
                retval.st = templateLib.getInstanceOf("receive",
              new STAttrMap().put("rec_name", "onMessage").put("path_st", (pb!=null?pb.param_ids:null)).put("pb", (pb!=null?pb.st:null)).put("partner", (p!=null?p.getText():null)).put("op", (o!=null?o.getText():null)).put("portType", (pt!=null?pt.st:null)).put("msgEx", (mex!=null?mex.st:null)).put("correlation_opt", (corr!=null?corr.st:null)).put("with_ex", (w!=null?w.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onMessage"

    public static class flow_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "flow"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:248:1: flow[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.st);
    public final BPELscriptWalker.flow_return flow(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.flow_return retval = new BPELscriptWalker.flow_return();
        retval.start = input.LT(1);

        List list_s=null;
        BPELscriptWalker.std_attr_return std_attr42 = null;

        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:2: ( ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:5: ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow1416); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:13: (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SEQUENCE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:13: s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_sequence_in_flow1420);
            	    s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            pushFollow(FOLLOW_std_attr_in_flow1424);
            std_attr42=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 251:2: -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("flow",
              new STAttrMap().put("sequence", list_s).put("join", join).put("signal", signal).put("std_attr", (std_attr42!=null?std_attr42.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow"

    public static class if_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "if_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:254:1: if_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr ) -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.st);
    public final BPELscriptWalker.if_ex_return if_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.if_ex_return retval = new BPELscriptWalker.if_ex_return();
        retval.start = input.LT(1);

        List list_eiex=null;
        List list_sie=null;
        BPELscriptWalker.expr_return iex = null;

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.sequence_return se = null;

        BPELscriptWalker.std_attr_return std_attr43 = null;

        RuleReturnScope eiex = null;
        RuleReturnScope sie = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:256:2: ( ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr ) -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:256:5: ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr )
            {
            match(input,IF,FOLLOW_IF_in_if_ex1464); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_if_ex1468);
            iex=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_if_ex1473);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:3: ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELSIF) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:4: ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_if_ex1481); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expr_in_if_ex1485);
            	    eiex=expr(null);

            	    state._fsp--;

            	    if (list_eiex==null) list_eiex=new ArrayList();
            	    list_eiex.add(eiex.getTemplate());

            	    pushFollow(FOLLOW_sequence_in_if_ex1490);
            	    sie=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_sie==null) list_sie=new ArrayList();
            	    list_sie.add(sie.getTemplate());


            	    match(input, Token.UP, null); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:258:3: ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:258:4: ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_if_ex1501); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_sequence_in_if_ex1505);
                    se=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_if_ex1511);
            std_attr43=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 259:2: -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("if_ex",
              new STAttrMap().put("iex", (iex!=null?iex.st:null)).put("seq", (s!=null?s.st:null)).put("eiex", list_eiex).put("seqei", list_sie).put("seqe", (se!=null?se.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr43!=null?std_attr43.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_ex"

    public static class signal_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "signal"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:262:1: signal : ^( SIGNAL ID (exp+= expr[null] )? ) -> source(source=$ID.texttrans=$expempty=empty);
    public final BPELscriptWalker.signal_return signal() throws RecognitionException {
        BPELscriptWalker.signal_return retval = new BPELscriptWalker.signal_return();
        retval.start = input.LT(1);

        CommonTree ID44=null;
        List list_exp=null;
        RuleReturnScope exp = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:263:2: ( ^( SIGNAL ID (exp+= expr[null] )? ) -> source(source=$ID.texttrans=$expempty=empty))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:263:4: ^( SIGNAL ID (exp+= expr[null] )? )
            {
            match(input,SIGNAL,FOLLOW_SIGNAL_in_signal1569); 

            match(input, Token.DOWN, null); 
            ID44=(CommonTree)match(input,ID,FOLLOW_ID_in_signal1571); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:263:19: (exp+= expr[null] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EXT_EXPR||LA35_0==CALL||LA35_0==PATH||LA35_0==STRING||LA35_0==INT||(LA35_0>=164 && LA35_0<=168)||(LA35_0>=170 && LA35_0<=173)||LA35_0==197) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:263:19: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_signal1575);
                    exp=expr(null);

                    state._fsp--;

                    if (list_exp==null) list_exp=new ArrayList();
                    list_exp.add(exp.getTemplate());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            //signals whether transitionCondition id null or not to provide a shortcut in template if empty
            		Boolean empty=exp==null; 
            	


            // TEMPLATE REWRITE
            // 267:2: -> source(source=$ID.texttrans=$expempty=empty)
            {
                retval.st = templateLib.getInstanceOf("source",
              new STAttrMap().put("source", (ID44!=null?ID44.getText():null)).put("trans", list_exp).put("empty", empty));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signal"

    public static class join_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "join"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:270:1: join : ^( JOIN (ids+= ID )+ (exp+= expr[null] )? ) -> std_elt(target=$idsjoin=$exp);
    public final BPELscriptWalker.join_return join() throws RecognitionException {
        BPELscriptWalker.join_return retval = new BPELscriptWalker.join_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;
        List list_exp=null;
        RuleReturnScope exp = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:2: ( ^( JOIN (ids+= ID )+ (exp+= expr[null] )? ) -> std_elt(target=$idsjoin=$exp))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:4: ^( JOIN (ids+= ID )+ (exp+= expr[null] )? )
            {
            match(input,JOIN,FOLLOW_JOIN_in_join1614); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:14: (ids+= ID )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_join1618); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:23: (exp+= expr[null] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EXT_EXPR||LA37_0==CALL||LA37_0==PATH||LA37_0==STRING||LA37_0==INT||(LA37_0>=164 && LA37_0<=168)||(LA37_0>=170 && LA37_0<=173)||LA37_0==197) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:23: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_join1623);
                    exp=expr(null);

                    state._fsp--;

                    if (list_exp==null) list_exp=new ArrayList();
                    list_exp.add(exp.getTemplate());


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 272:2: -> std_elt(target=$idsjoin=$exp)
            {
                retval.st = templateLib.getInstanceOf("std_elt",
              new STAttrMap().put("target", list_ids).put("join", list_exp));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join"

    public static class sequence_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sequence"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:275:1: sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.st);
    public final BPELscriptWalker.sequence_return sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.sequence_return retval = new BPELscriptWalker.sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.body_return b = null;

        BPELscriptWalker.std_attr_return std_attr45 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:2: ( ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:4: ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequence1656); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:16: (j+= join )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==JOIN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_sequence1660);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_sequence1665);
            b=body(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:81: (s+= signal )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SIGNAL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:81: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_sequence1670);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            pushFollow(FOLLOW_std_attr_in_sequence1673);
            std_attr45=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 278:2: -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("sequence",
              new STAttrMap().put("content", (b!=null?b.st:null)).put("join", list_j).put("signal", list_s).put("std_attr", (std_attr45!=null?std_attr45.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class scope_sequence_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "scope_sequence"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:282:1: scope_sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\t HashMap<String, String> _cs,HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, StringTemplate handler] : ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler);
    public final BPELscriptWalker.scope_sequence_return scope_sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, StringTemplate handler) throws RecognitionException {
        BPELscriptWalker.scope_sequence_return retval = new BPELscriptWalker.scope_sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.scope_block_return b = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:2: ( ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:4: ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_sequence1713); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:16: (j+= join )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==JOIN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_scope_sequence1717);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_block_in_scope_sequence1722);
            b=scope_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:88: (s+= signal )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==SIGNAL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:284:88: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_scope_sequence1727);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 285:2: -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler)
            {
                retval.st = templateLib.getInstanceOf("scope_sequence",
              new STAttrMap().put("content", (b!=null?b.st:null)).put("join", list_j).put("signal", list_s).put("plinks", _pl).put("messages", _messages).put("vars", _vars).put("cors", _cs).put("faultHdl", _faults).put("faultHdl_pb", _faults_pb).put("compHdl", handler));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_sequence"

    public static class while_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:289:1: while_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st);
    public final BPELscriptWalker.while_ex_return while_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.while_ex_return retval = new BPELscriptWalker.while_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.expr_return expr46 = null;

        BPELscriptWalker.std_attr_return std_attr47 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:291:2: ( ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:291:4: ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_ex1801); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_while_ex1803);
            expr46=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_while_ex1808);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            pushFollow(FOLLOW_std_attr_in_while_ex1811);
            std_attr47=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 292:2: -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("while",
              new STAttrMap().put("expr_st", (expr46!=null?expr46.st:null)).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr47!=null?std_attr47.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_ex"

    public static class until_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "until_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:295:1: until_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st);
    public final BPELscriptWalker.until_ex_return until_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.until_ex_return retval = new BPELscriptWalker.until_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.expr_return expr48 = null;

        BPELscriptWalker.std_attr_return std_attr49 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:297:2: ( ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:297:4: ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr )
            {
            match(input,UNTIL,FOLLOW_UNTIL_in_until_ex1855); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_until_ex1857);
            expr48=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_until_ex1862);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            pushFollow(FOLLOW_std_attr_in_until_ex1865);
            std_attr49=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 298:2: -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("until",
              new STAttrMap().put("expr_st", (expr48!=null?expr48.st:null)).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr49!=null?std_attr49.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "until_ex"

    public static class foreach_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "foreach"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:301:1: foreach[List join, List signal] : ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr ) -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBO);
    public final BPELscriptWalker.foreach_return foreach(List join, List signal) throws RecognitionException {
        BPELscriptWalker.foreach_return retval = new BPELscriptWalker.foreach_return();
        retval.start = input.LT(1);

        CommonTree cName=null;
        CommonTree PARALLEL52=null;
        CommonTree SBO53=null;
        List list_complete=null;
        BPELscriptWalker.expr_return init = null;

        BPELscriptWalker.expr_return cond = null;

        BPELscriptWalker.scope_short_return scope_short50 = null;

        BPELscriptWalker.std_attr_return std_attr51 = null;

        RuleReturnScope complete = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:302:2: ( ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr ) -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBO))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:302:4: ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr )
            {
            match(input,FOR,FOLLOW_FOR_in_foreach1910); 

            match(input, Token.DOWN, null); 
            cName=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach1914); 
            pushFollow(FOLLOW_expr_in_foreach1918);
            init=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_expr_in_foreach1923);
            cond=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:302:59: (complete+= expr[null] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EXT_EXPR||LA42_0==CALL||LA42_0==PATH||LA42_0==STRING||LA42_0==INT||(LA42_0>=164 && LA42_0<=168)||(LA42_0>=170 && LA42_0<=173)||LA42_0==197) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:302:59: complete+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_foreach1928);
                    complete=expr(null);

                    state._fsp--;

                    if (list_complete==null) list_complete=new ArrayList();
                    list_complete.add(complete.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_foreach1936);
            scope_short50=scope_short();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:303:16: ( PARALLEL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==PARALLEL) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:303:16: PARALLEL
                    {
                    PARALLEL52=(CommonTree)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1938); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:303:26: ( SBO )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SBO) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:303:26: SBO
                    {
                    SBO53=(CommonTree)match(input,SBO,FOLLOW_SBO_in_foreach1941); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_foreach1944);
            std_attr51=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 304:2: -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBO)
            {
                retval.st = templateLib.getInstanceOf("foreach",
              new STAttrMap().put("id", cName).put("init_st", (init!=null?init.st:null)).put("cond_st", (cond!=null?cond.st:null)).put("complete", list_complete).put("body_st", (scope_short50!=null?scope_short50.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr51!=null?std_attr51.st:null)).put("parallel", PARALLEL52).put("sbo", SBO53));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach"

    public static class try_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "try_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:308:1: try_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope] : ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c);
    public final BPELscriptWalker.try_ex_return try_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.try_ex_return retval = new BPELscriptWalker.try_ex_return();
        retval.start = input.LT(1);

        List list_cls=null;
        List list_c=null;
        RuleReturnScope cls = null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:2: ( ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:4: ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? )
            {
            match(input,TRY,FOLLOW_TRY_in_try_ex2017); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:13: (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==CATCH) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:13: cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope]
                	    {
                	    pushFollow(FOLLOW_catch_ex_in_try_ex2021);
                	    cls=catch_ex(_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope);

                	    state._fsp--;

                	    if (list_cls==null) list_cls=new ArrayList();
                	    list_cls.add(cls.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:86: (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SEQUENCE||LA46_0==PROC_STMTS) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:310:86: c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                        {
                        pushFollow(FOLLOW_body_in_try_ex2027);
                        c=body(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 311:2: -> list(content_st=$c)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", list_c));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "try_ex"

    public static class catch_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catch_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:314:1: catch_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope] : ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) ;
    public final BPELscriptWalker.catch_ex_return catch_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.catch_ex_return retval = new BPELscriptWalker.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree fMT=null;
        BPELscriptWalker.param_block_return pb = null;

        BPELscriptWalker.ns_id_return ns_id54 = null;

        BPELscriptWalker.faultElt_return faultElt55 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:2: ( ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:4: ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catch_ex2058); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:12: ( ns_id )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==NS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:12: ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_catch_ex2060);
                    ns_id54=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_catch_ex2065);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:86: (fMT= STRING )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:86: fMT= STRING
                    {
                    fMT=(CommonTree)match(input,STRING,FOLLOW_STRING_in_catch_ex2070); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:95: ( faultElt )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==FAULTELT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:316:95: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex2073);
                    faultElt55=faultElt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

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
            		if((ns_id54!=null?ns_id54.nspre:null)!=null) 
            			faultName+=(ns_id54!=null?ns_id54.nspre:null)+":";
            		if ((ns_id54!=null?ns_id54.nsloc:null)!=null)			
            			faultName+=(ns_id54!=null?ns_id54.nsloc:null);
            		else
            			faultName=null;
            		// 2)
            		String attributes = "";
            		
            		/*
            		 * the handling of faultElt differs from fMT because of trouble with ANTLR itself.
            		 * when done this like fMT, the behavior was to write "faultMessageType='faultElementName'"
            		 */
            		if ((pb!=null?pb.param_ids:null)!=null) attributes+="\n       faultVariable=\""+(pb!=null?pb.param_ids:null).get(0)+"\"";
            		if ((fMT!=null?fMT.getText():null)!=null) attributes+="\n       faultMessageType="+(fMT!=null?fMT.getText():null);
            		if ((faultElt55!=null?faultElt55.st:null)!=null) attributes+=(faultElt55!=null?faultElt55.st:null);
            		// 3)
            		Boolean definedIn = _faults.containsKey(faultName);
            				
            		if (faultName != null && definedIn) {
            			throwDefinedWarning("exception", (ns_id54!=null?ns_id54.locID:null));
            		} 
            		// 4)
            		_faults.put(faultName, attributes);
            		_faults_pb.put(faultName, (pb!=null?pb.st:null));
            	
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_ex"

    public static class scope_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "scope_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:360:1: scope_ex[List join, List signal] : ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.text);
    public final BPELscriptWalker.scope_ex_return scope_ex(List join, List signal) throws RecognitionException {
        BPELscriptWalker.scope_ex_return retval = new BPELscriptWalker.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree ISOLATED56=null;
        CommonTree EOSF57=null;
        CommonTree SJF58=null;
        CommonTree id=null;
        List list_id=null;
        BPELscriptWalker.scope_stmt_return handler = null;

        BPELscriptWalker.scope_sequence_return s = null;


        	// reset local HashMaps on begin		
        		HashMap<String, String> _vars = new HashMap<String, String>(); 
                		HashMap<String, String> _pl = new HashMap<String, String>();
                        	HashMap<String, String> _messages = new HashMap<String, String>();
                        	HashMap<String, String> _cs = new HashMap<String, String>();
                        	HashMap<String, String> _faults = new HashMap<String, String>();
        		HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();
        		
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:2: ( ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.text))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:4: ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_ex2100); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:14: (id+= ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:14: id+= ID
                    {
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_scope_ex2104); 
                    if (list_id==null) list_id=new ArrayList();
                    list_id.add(id);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_stmt_in_scope_ex2109);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_ex2114);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:119: ( ISOLATED )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ISOLATED) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:119: ISOLATED
                    {
                    ISOLATED56=(CommonTree)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex2117); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:129: ( EOSF )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EOSF) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:129: EOSF
                    {
                    EOSF57=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_scope_ex2120); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:135: ( SJF )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==SJF) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:369:135: SJF
                    {
                    SJF58=(CommonTree)match(input,SJF,FOLLOW_SJF_in_scope_ex2123); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 370:2: -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.text)
            {
                retval.st = templateLib.getInstanceOf("scope_ex",
              new STAttrMap().put("id_opt", list_id).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("isolated", ISOLATED56).put("eosf", EOSF57).put("std_attr", (SJF58!=null?SJF58.getText():null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_ex"

    public static class scope_short_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "scope_short"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:373:1: scope_short : ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st);
    public final BPELscriptWalker.scope_short_return scope_short() throws RecognitionException {
        BPELscriptWalker.scope_short_return retval = new BPELscriptWalker.scope_short_return();
        retval.start = input.LT(1);

        BPELscriptWalker.scope_stmt_return handler = null;

        BPELscriptWalker.scope_sequence_return s = null;


        	// reset local HashMaps on begin
        		HashMap<String, String> _vars = new HashMap<String, String>(); 
                		HashMap<String, String> _pl = new HashMap<String, String>();
                        	HashMap<String, String> _messages = new HashMap<String, String>();
                        	HashMap<String, String> _cs = new HashMap<String, String>();
                        	HashMap<String, String> _faults = new HashMap<String, String>();
        		HashMap<String, StringTemplate> _faults_pb = new HashMap<String, StringTemplate>();
        		
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:382:2: ( ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:382:4: ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_short2185); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scope_stmt_in_scope_short2189);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_short2193);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 383:2: -> scope_ex(body_st=$s.st)
            {
                retval.st = templateLib.getInstanceOf("scope_ex",
              new STAttrMap().put("body_st", (s!=null?s.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_short"

    public static class scope_stmt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "scope_stmt"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:387:1: scope_stmt : ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c);
    public final BPELscriptWalker.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptWalker.scope_stmt_return retval = new BPELscriptWalker.scope_stmt_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:2: ( ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:4: ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_stmt2219); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:13: (c+= compensation )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMPENSATION) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:13: c+= compensation
                        {
                        pushFollow(FOLLOW_compensation_in_scope_stmt2223);
                        c=compensation();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:30: (c+= termination )?
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==TERMINATION) ) {
                    alt55=1;
                }
                switch (alt55) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:30: c+= termination
                        {
                        pushFollow(FOLLOW_termination_in_scope_stmt2228);
                        c=termination();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:46: (c+= eventHdl )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==EVENTHDL) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:388:46: c+= eventHdl
                        {
                        pushFollow(FOLLOW_eventHdl_in_scope_stmt2233);
                        c=eventHdl();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 389:2: -> list(content_st=$c)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", list_c));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_stmt"

    public static class termination_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "termination"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:392:1: termination : ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st);
    public final BPELscriptWalker.termination_return termination() throws RecognitionException {
        BPELscriptWalker.termination_return retval = new BPELscriptWalker.termination_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body59 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:393:2: ( ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:393:4: ^( TERMINATION body[null, null, null, null,null,null] )
            {
            match(input,TERMINATION,FOLLOW_TERMINATION_in_termination2259); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_termination2261);
            body59=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 393:58: -> termination(body=$body.st)
            {
                retval.st = templateLib.getInstanceOf("termination",
              new STAttrMap().put("body", (body59!=null?body59.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termination"

    public static class eventHdl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "eventHdl"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:396:1: eventHdl : ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c);
    public final BPELscriptWalker.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptWalker.eventHdl_return retval = new BPELscriptWalker.eventHdl_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:2: ( ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:4: ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* )
            {
            match(input,EVENTHDL,FOLLOW_EVENTHDL_in_eventHdl2284); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:16: (c+= onEvent )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==EVENT) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:16: c+= onEvent
                	    {
                	    pushFollow(FOLLOW_onEvent_in_eventHdl2288);
                	    c=onEvent();

                	    state._fsp--;

                	    if (list_c==null) list_c=new ArrayList();
                	    list_c.add(c.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop57;
                    }
                } while (true);

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:28: (c+= onAlarm )*
                loop58:
                do {
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ONALARM) ) {
                        alt58=1;
                    }


                    switch (alt58) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:397:28: c+= onAlarm
                	    {
                	    pushFollow(FOLLOW_onAlarm_in_eventHdl2293);
                	    c=onAlarm();

                	    state._fsp--;

                	    if (list_c==null) list_c=new ArrayList();
                	    list_c.add(c.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop58;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 398:2: -> eventHdl(content=$c)
            {
                retval.st = templateLib.getInstanceOf("eventHdl",
              new STAttrMap().put("content", list_c));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventHdl"

    public static class onEvent_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "onEvent"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:400:1: onEvent : ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st);
    public final BPELscriptWalker.onEvent_return onEvent() throws RecognitionException {
        BPELscriptWalker.onEvent_return retval = new BPELscriptWalker.onEvent_return();
        retval.start = input.LT(1);

        CommonTree p=null;
        CommonTree o=null;
        CommonTree var=null;
        List list_c=null;
        List list_we=null;
        BPELscriptWalker.scope_short_return pb = null;

        RuleReturnScope c = null;
        RuleReturnScope we = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:2: ( ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:4: ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
            match(input,EVENT,FOLLOW_EVENT_in_onEvent2315); 

            match(input, Token.DOWN, null); 
            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2319); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2323); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:23: (c+= correlation )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CORRELATION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:23: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onEvent2327);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:40: (we+= with_ex )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==WITH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:401:40: we+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2332);
                    we=with_ex();

                    state._fsp--;

                    if (list_we==null) list_we=new ArrayList();
                    list_we.add(we.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2337);
            pb=scope_short();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:6: (var= ID )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:6: var= ID
                    {
                    var=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2344); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:11: ( portType )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==PORTTYPE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:11: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent2347);
                    portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:21: ( msgEx )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==MSGEX) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:21: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent2350);
                    msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:28: ( msgType )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==MSGTYPE) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:28: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent2353);
                    msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:37: ( viElt )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==VIELT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:402:37: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent2356);
                    viElt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 403:2: -> event(p=$po=$oparam_block_st=$pb.st)
            {
                retval.st = templateLib.getInstanceOf("event",
              new STAttrMap().put("p", p).put("o", o).put("param_block_st", (pb!=null?pb.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onEvent"

    public static class compensation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compensation"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:406:1: compensation : ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st);
    public final BPELscriptWalker.compensation_return compensation() throws RecognitionException {
        BPELscriptWalker.compensation_return retval = new BPELscriptWalker.compensation_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body60 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:407:2: ( ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:407:4: ^( COMPENSATION body[null, null, null, null,null,null] )
            {
            match(input,COMPENSATION,FOLLOW_COMPENSATION_in_compensation2393); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_compensation2395);
            body60=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 408:2: -> compensation(body_st=$body.st)
            {
                retval.st = templateLib.getInstanceOf("compensation",
              new STAttrMap().put("body_st", (body60!=null?body60.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensation"

    public static class with_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "with_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:411:1: with_ex : ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts);
    public final BPELscriptWalker.with_ex_return with_ex() throws RecognitionException {
        BPELscriptWalker.with_ex_return retval = new BPELscriptWalker.with_ex_return();
        retval.start = input.LT(1);

        List list_maps=null;
        RuleReturnScope maps = null;

        	HashMap<String, StringTemplate> fromParts = new HashMap<String, StringTemplate>();
        	HashMap<String, StringTemplate> toParts = new HashMap<String, StringTemplate>();

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:416:3: ( ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:416:5: ^( WITH (maps+= with_map[fromParts, toParts] )+ )
            {
            match(input,WITH,FOLLOW_WITH_in_with_ex2426); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:416:16: (maps+= with_map[fromParts, toParts] )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==MAP) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:416:16: maps+= with_map[fromParts, toParts]
            	    {
            	    pushFollow(FOLLOW_with_map_in_with_ex2430);
            	    maps=with_map(fromParts, toParts);

            	    state._fsp--;

            	    if (list_maps==null) list_maps=new ArrayList();
            	    list_maps.add(maps.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 417:2: -> with_ex(fromParts=fromPartstoParts=toParts)
            {
                retval.st = templateLib.getInstanceOf("with_ex",
              new STAttrMap().put("fromParts", fromParts).put("toParts", toParts));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_ex"

    public static class with_map_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "with_map"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:420:1: with_map[HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts] : ^( MAP ID ( KEY )? pe= path_expr ) ;
    public final BPELscriptWalker.with_map_return with_map(HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts) throws RecognitionException {
        BPELscriptWalker.with_map_return retval = new BPELscriptWalker.with_map_return();
        retval.start = input.LT(1);

        CommonTree KEY61=null;
        CommonTree ID62=null;
        BPELscriptWalker.path_expr_return pe = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:421:2: ( ^( MAP ID ( KEY )? pe= path_expr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:421:11: ^( MAP ID ( KEY )? pe= path_expr )
            {
            match(input,MAP,FOLLOW_MAP_in_with_map2469); 

            match(input, Token.DOWN, null); 
            ID62=(CommonTree)match(input,ID,FOLLOW_ID_in_with_map2471); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:421:20: ( KEY )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KEY) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:421:20: KEY
                    {
                    KEY61=(CommonTree)match(input,KEY,FOLLOW_KEY_in_with_map2473); 

                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2478);
            pe=path_expr();

            state._fsp--;


            match(input, Token.UP, null); 

            		if (KEY61!=null && (KEY61!=null?KEY61.getText():null).contains("in")) {
            		    fromParts.put((ID62!=null?ID62.getText():null), (pe!=null?pe.st:null));
            		}
            		
            		if ((KEY61!=null?KEY61.getText():null).contains("out")) {
            		    toParts.put((ID62!=null?ID62.getText():null), (pe!=null?pe.st:null));
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_map"

    public static class receive_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "receive"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:434:1: receive[List join, List signal, boolean empty] : ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w);
    public final BPELscriptWalker.receive_return receive(List join, List signal, boolean empty) throws RecognitionException {
        BPELscriptWalker.receive_return retval = new BPELscriptWalker.receive_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree ci=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return pt = null;

        BPELscriptWalker.std_attr_return std_attr63 = null;

        BPELscriptWalker.msgEx_return msgEx64 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:10: ( ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:13: ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? )
            {
            match(input,RECEIVE,FOLLOW_RECEIVE_in_receive2507); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2511); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2515); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:41: (c+= correlation )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CORRELATION) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:41: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_receive2519);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:58: (pt= portType )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==PORTTYPE) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:58: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2524);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:71: (ci= CREATE_INST )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==CREATE_INST) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:71: ci= CREATE_INST
                    {
                    ci=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2529); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:85: ( msgEx )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==MSGEX) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:85: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2532);
                    msgEx64=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_receive2535);
            std_attr63=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:102: (w+= with_ex )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WITH) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:435:102: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2539);
                    w=with_ex();

                    state._fsp--;

                    if (list_w==null) list_w=new ArrayList();
                    list_w.add(w.getTemplate());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            // adjust empty tag to handle correlations, since it signals only presence of standard elements else
                    		if (list_c!=null) empty=false;
                    	


            // TEMPLATE REWRITE
            // 439:2: -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w)
            {
                retval.st = templateLib.getInstanceOf("receive",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (pt!=null?pt.st:null)).put("std_attr", (std_attr63!=null?std_attr63.st:null)).put("crt_inst", (ci!=null?ci.getText():null)).put("msgEx", (msgEx64!=null?msgEx64.st:null)).put("correlation_opt", list_c).put("with_ex", list_w));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "receive"

    public static class reply_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reply"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:445:1: reply[List join, List signal,boolean empty] : ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w);
    public final BPELscriptWalker.reply_return reply(List join, List signal, boolean empty) throws RecognitionException {
        BPELscriptWalker.reply_return retval = new BPELscriptWalker.reply_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree inv=null;
        CommonTree op=null;
        List list_op=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.faultName_return fn = null;

        BPELscriptWalker.portType_return portType65 = null;

        BPELscriptWalker.std_attr_return std_attr66 = null;

        BPELscriptWalker.msgEx_return msgEx67 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:2: ( ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:4: ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? )
            {
            match(input,REPLY,FOLLOW_REPLY_in_reply2635); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2639); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2643); 
            if (list_op==null) list_op=new ArrayList();
            list_op.add(op);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:33: (inv= ID )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:33: inv= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2647); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:39: (c+= correlation )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CORRELATION) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:39: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_reply2652);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:54: ( portType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==PORTTYPE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:54: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply2655);
                    portType65=portType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_reply2658);
            std_attr66=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:75: (fn= faultName )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==FAULTNAME) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:75: fn= faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply2662);
                    fn=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:87: ( msgEx )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==MSGEX) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:87: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply2665);
                    msgEx67=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:95: (w+= with_ex )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==WITH) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:95: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2670);
                    w=with_ex();

                    state._fsp--;

                    if (list_w==null) list_w=new ArrayList();
                    list_w.add(w.getTemplate());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            // adjust empty tag to handle correlations, since it signals only presence of standard elements else
                    		if (list_c!=null) empty=false;
                    	


            // TEMPLATE REWRITE
            // 450:2: -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$w)
            {
                retval.st = templateLib.getInstanceOf("reply",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", list_op).put("inv", (inv!=null?inv.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType65!=null?portType65.st:null)).put("std_attr", (std_attr66!=null?std_attr66.st:null)).put("faultName", (fn!=null?fn.st:null)).put("msgEx", (msgEx67!=null?msgEx67.st:null)).put("correlation_opt", list_c).put("with_ex", list_w));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reply"

    public static class invoke_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "invoke"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:1: invoke[List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.st);
    public final BPELscriptWalker.invoke_return invoke(List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.invoke_return retval = new BPELscriptWalker.invoke_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree inv=null;
        List list_inv=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return portType68 = null;

        BPELscriptWalker.std_attr_return std_attr69 = null;

        BPELscriptWalker.compensation_return compensation70 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;

        HashMap<String, String> __faults = new HashMap<String, String>();
        HashMap<String, StringTemplate> __faults_pb = new HashMap<String, StringTemplate>();

        if (_faults!=null) {
            __faults.putAll(_faults);
            __faults_pb.putAll(_faults_pb);
        }

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:2: ( ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:4: ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? )
            {
            match(input,INVOKE,FOLLOW_INVOKE_in_invoke2772); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2776); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2780); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:33: (inv+= ID )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:33: inv+= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2784); 
                    if (list_inv==null) list_inv=new ArrayList();
                    list_inv.add(inv);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:40: (c+= correlation )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==CORRELATION) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:40: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_invoke2789);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:55: ( portType )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==PORTTYPE) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:55: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke2792);
                    portType68=portType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_invoke2795);
            std_attr69=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:75: (w+= with_ex )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WITH) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:75: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2799);
                    w=with_ex();

                    state._fsp--;

                    if (list_w==null) list_w=new ArrayList();
                    list_w.add(w.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:86: ( compensation )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==COMPENSATION) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:471:86: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2802);
                    compensation70=compensation();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            // adjust empty tag to handle correlations, since it signals only presence of standard elements else
                    		if (list_c!=null || _faults!=null) empty=false;
                    	


            // TEMPLATE REWRITE
            // 475:2: -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.st)
            {
                retval.st = templateLib.getInstanceOf("invoke",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("inv", list_inv).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType68!=null?portType68.st:null)).put("std_attr", (std_attr69!=null?std_attr69.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("faults", __faults).put("faults_pb", __faults_pb).put("compensation", (compensation70!=null?compensation70.st:null)));
            }


            }


            if (_faults!=null) { 
                _faults.clear();
                _faults_pb.clear();   
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invoke"

    public static class assign_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assign"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:480:1: assign[List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb] : ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssign);
    public final BPELscriptWalker.assign_return assign(List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb) throws RecognitionException {
        BPELscriptWalker.assign_return retval = new BPELscriptWalker.assign_return();
        retval.start = input.LT(1);

        CommonTree PROP71=null;
        CommonTree CREATE_INST73=null;
        CommonTree VALID77=null;
        CommonTree KEEPSRC78=null;
        CommonTree IGNORE79=null;
        BPELscriptWalker.path_expr_return pe = null;

        BPELscriptWalker.portType_return portType72 = null;

        BPELscriptWalker.std_attr_return std_attr74 = null;

        BPELscriptWalker.faultName_return faultName75 = null;

        BPELscriptWalker.msgEx_return msgEx76 = null;

        BPELscriptWalker.rvalue_return rvalue80 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:2: ( ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssign))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:4: ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign2899); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_path_expr_in_assign2903);
            pe=path_expr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:26: ( PROP )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==PROP) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:26: PROP
                    {
                    PROP71=(CommonTree)match(input,PROP,FOLLOW_PROP_in_assign2905); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:32: ( portType )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==PORTTYPE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:32: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign2908);
                    portType72=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:42: ( CREATE_INST )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==CREATE_INST) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:42: CREATE_INST
                    {
                    CREATE_INST73=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2911); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_assign2915);
            std_attr74=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:65: ( faultName )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==FAULTNAME) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:65: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign2917);
                    faultName75=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:76: ( msgEx )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==MSGEX) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:76: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign2920);
                    msgEx76=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:83: ( VALID )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==VALID) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:83: VALID
                    {
                    VALID77=(CommonTree)match(input,VALID,FOLLOW_VALID_in_assign2923); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:90: ( KEEPSRC )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEEPSRC) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:90: KEEPSRC
                    {
                    KEEPSRC78=(CommonTree)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2926); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:99: ( IGNORE )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==IGNORE) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:481:99: IGNORE
                    {
                    IGNORE79=(CommonTree)match(input,IGNORE,FOLLOW_IGNORE_in_assign2929); 

                    }
                    break;

            }

            pushFollow(FOLLOW_rvalue_in_assign2935);
            rvalue80=rvalue(_vars, _pl, (pe!=null?pe.st:null), (pe!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(pe.start),
              input.getTreeAdaptor().getTokenStopIndex(pe.start))):null), (PROP71!=null?PROP71.getText():null), join, signal, empty, (portType72!=null?portType72.st:null), (CREATE_INST73!=null?CREATE_INST73.getText():null), (std_attr74!=null?std_attr74.st:null), (faultName75!=null?faultName75.st:null), (msgEx76!=null?msgEx76.st:null), (VALID77!=null?VALID77.getText():null), (KEEPSRC78!=null?KEEPSRC78.getText():null), (IGNORE79!=null?IGNORE79.getText():null), name, pb);

            state._fsp--;


            match(input, Token.UP, null); 

            			boolean isRealAssign = true;
            			if ((rvalue80!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue80.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue80.start))):null).contains("invoke") || (rvalue80!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue80.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue80.start))):null).contains("receive")) isRealAssign=false;
            		


            // TEMPLATE REWRITE
            // 488:2: -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssign)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("rvalue_st", (rvalue80!=null?rvalue80.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("valid", (VALID77!=null?VALID77.getText():null)).put("std_attr", (std_attr74!=null?std_attr74.st:null)).put("real", isRealAssign));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class rvalue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rvalue"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:491:1: rvalue[HashMap<String, String>_vars, HashMap<String, String>_pl, \n\tStringTemplate path_expr, String str_path_expr, String lhs_prop, List join, List signal, boolean empty, \n\tStringTemplate portType, String crtInst, StringTemplate std_attr, StringTemplate faultName, StringTemplate msgEx,\n\tString valid, String keepsrc, String ignore, String name, StringTemplate pb] : (r= receive[null, null, true] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore));
    public final BPELscriptWalker.rvalue_return rvalue(HashMap<String, String>_vars, HashMap<String, String>_pl, StringTemplate path_expr, String str_path_expr, String lhs_prop, List join, List signal, boolean empty, StringTemplate portType, String crtInst, StringTemplate std_attr, StringTemplate faultName, StringTemplate msgEx, String valid, String keepsrc, String ignore, String name, StringTemplate pb) throws RecognitionException {
        BPELscriptWalker.rvalue_return retval = new BPELscriptWalker.rvalue_return();
        retval.start = input.LT(1);

        CommonTree PROP82=null;
        BPELscriptWalker.receive_return r = null;

        BPELscriptWalker.invoke_return i = null;

        BPELscriptWalker.expr_return expr81 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:495:2: (r= receive[null, null, true] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore))
            int alt93=3;
            switch ( input.LA(1) ) {
            case RECEIVE:
                {
                alt93=1;
                }
                break;
            case INVOKE:
                {
                alt93=2;
                }
                break;
            case EXT_EXPR:
            case CALL:
            case PATH:
            case STRING:
            case INT:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 170:
            case 171:
            case 172:
            case 173:
            case 197:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:495:5: r= receive[null, null, true]
                    {
                    pushFollow(FOLLOW_receive_in_rvalue3000);
                    r=receive(null, null, true);

                    state._fsp--;


                    		if (valid!=null || keepsrc!=null || ignore!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}
                    		//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
                    		String[] lhs = str_path_expr.split("\\."); // fetch left hand side
                    		if (!_vars.containsKey(lhs[0])) {
                    		    _vars.put(lhs[0], null);
                    		}
                    		


                    // TEMPLATE REWRITE
                    // 506:2: -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx)
                    {
                        retval.st = templateLib.getInstanceOf("receive",
                      new STAttrMap().put("rec_name", name).put("pb", pb).put("rec_tpl", (r!=null?r.st:null)).put("path_st", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("crt_inst", crtInst).put("std_attr", std_attr).put("faultName", faultName).put("msgEx", msgEx));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:508:5: i= invoke[null, null, true, null, null]
                    {
                    pushFollow(FOLLOW_invoke_in_rvalue3082);
                    i=invoke(null, null, true, null, null);

                    state._fsp--;


                    		if (valid!=null || keepsrc!=null || ignore!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}
                    		//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
                    		String[] lhs = str_path_expr.split("\\."); // fetch left hand side
                    		if (!_vars.containsKey(lhs[0])) {
                    		    _vars.put(lhs[0], null);
                    		}
                    		


                    // TEMPLATE REWRITE
                    // 519:2: -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr)
                    {
                        retval.st = templateLib.getInstanceOf("invoke",
                      new STAttrMap().put("inv_tpl", (i!=null?i.st:null)).put("outvar", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("std_attr", std_attr));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:521:5: expr[$path_expr] ( PROP )?
                    {
                    pushFollow(FOLLOW_expr_in_rvalue3139);
                    expr81=expr(path_expr);

                    state._fsp--;

                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:521:22: ( PROP )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==PROP) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:521:22: PROP
                            {
                            PROP82=(CommonTree)match(input,PROP,FOLLOW_PROP_in_rvalue3142); 

                            }
                            break;

                    }


                    		// display error when atrributes are used which are only allowe for other alternatives
                    		if (portType!=null || faultName!=null || msgEx!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}

                    		String from_spec = (expr81!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expr81.start),
                      input.getTreeAdaptor().getTokenStopIndex(expr81.start))):null); //fetch right hand side
                    		String[] from_part;
                    		
                    		String[] lhs = str_path_expr.split("\\."); // fetch left hand side
                    		
                    		// if 'from_spec' contains a path (to a part, property or endPoint) strip the parts out
                    		if (from_spec.contains(".")) {
                    			//split from_spec with regex '.' (excaped with '\\')
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
                    				    if (lhs.length>1 && !lhs[1].equals("partnerRole")) {
                    				        System.err.println("Error: PartnerLink '"+topl+"' has wrong Endpoint Reference. MUST be empty or 'partnerRole'.");
                    				    }
                    				}
                    			} 
                    		}
                    		
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
                    		/**
                    		 * a RHS-variable should be known at an assignment and might have optional part or property description
                    		 */
                    		if (!isPL) { 
                    		    if (_vars!=null && _vars.containsKey(from_part[0])) {//rhs known as var?
                    			var = from_part[0];
                    			isVar=true;
                    			
                    			//if there is a path expression, set it
                    			if(from_part.length>1 && from_part[1]!=null) {
                    			    if (PROP82!=null) {
                    			    	if ((PROP82!=null?PROP82.getText():null).equals("property")) {
                    				    part="";
                    			        	    for (int j=1; j<from_part.length; j++) {//handle multiple part references
                    	             		            part+=from_part[j];
                               	   		            if (j<from_part.length-1) part+=".";   
                                 		               }
                    			    	} 
                    			    } else {
                    			        property=from_part[1];
                    			    }
                    			}
                    		    } else {// rhs is not known as var and is not partnerlink (only (extended) expression is now possible)
                    		        	/**
                    			 * handling extended expression
                    			 */
                    			from = from_part[0]; 
                    			isPLorVar=false; 
                    			if (from_part[0].contains("[")) {//an extended expression is contained in '[[...]]'
                    			    from = from.substring(1, from.length()-1); //remove brackets
                    			    isExt=true;
                    			}
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
                    			tovar=lhs[0];
                    			isToExpr=true;
                    			    
                    			//if there is a part or property description
                    			if (lhs.length>1 && lhs[1]!=null) {
                    			    //if the annotation '@part' is set on lhs assign it to 'tpart', else it is a property and assigned to 'tprop'
                    			    if (lhs_prop!=null && lhs_prop.equals("property")) {//handle property reference
                    			        tprop=lhs[1];
                    			    } else {//handle part reference
                    			        tpart="";
                    			        for (int j=1; j<lhs.length; j++) {//handle multiple part references
                                 		            tpart+=lhs[j];
                                  		            if (j<lhs.length-1) tpart+=".";   
                                 		        }
                    			    }
                    			}
                    			    
                    			//if LHS is not known in variables HashMap, it must be declared (implicit variable declaration)
                    			if (!_vars.containsKey(lhs[0])) {
                    			    _vars.put(lhs[0], null);
                    			}
                    		}
                    		


                    // TEMPLATE REWRITE
                    // 675:2: -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore)
                    {
                        retval.st = templateLib.getInstanceOf("copy",
                      new STAttrMap().put("from", from).put("empty", isPLorVar).put("ext", isExt).put("pl", pL).put("pl_p", ePR).put("var", var).put("part", part).put("prop", property).put("topart", tpart).put("toprop", tprop).put("topl", topl).put("tovar", tovar).put("toempty", isToExpr).put("keep", keepsrc).put("ignore", ignore));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rvalue"

    public static class throw_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "throw_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:685:1: throw_ex[List join, List signal,boolean empty] : ^( THROW ns_id (faultVar= ID )? std_attr ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.st);
    public final BPELscriptWalker.throw_ex_return throw_ex(List join, List signal, boolean  empty) throws RecognitionException {
        BPELscriptWalker.throw_ex_return retval = new BPELscriptWalker.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree faultVar=null;
        BPELscriptWalker.ns_id_return ns_id83 = null;

        BPELscriptWalker.std_attr_return std_attr84 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:686:2: ( ^( THROW ns_id (faultVar= ID )? std_attr ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:686:4: ^( THROW ns_id (faultVar= ID )? std_attr )
            {
            match(input,THROW,FOLLOW_THROW_in_throw_ex3271); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_throw_ex3273);
            ns_id83=ns_id();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:686:26: (faultVar= ID )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:686:26: faultVar= ID
                    {
                    faultVar=(CommonTree)match(input,ID,FOLLOW_ID_in_throw_ex3277); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_throw_ex3280);
            std_attr84=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 687:2: -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("throw",
              new STAttrMap().put("ns_pre", (ns_id83!=null?ns_id83.nspre:null)).put("ns_loc", (ns_id83!=null?ns_id83.nsloc:null)).put("join", join).put("signal", signal).put("empty", empty).put("faultVar", (faultVar!=null?faultVar.getText():null)).put("std_attr", (std_attr84!=null?std_attr84.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throw_ex"

    public static class rethrow_ex_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rethrow_ex"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:693:1: rethrow_ex[List join, List signal,boolean empty] : ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st);
    public final BPELscriptWalker.rethrow_ex_return rethrow_ex(List join, List signal, boolean  empty) throws RecognitionException {
        BPELscriptWalker.rethrow_ex_return retval = new BPELscriptWalker.rethrow_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr85 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:694:2: ( ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:694:4: ^( RETHROW std_attr )
            {
            match(input,RETHROW,FOLLOW_RETHROW_in_rethrow_ex3345); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_rethrow_ex3347);
            std_attr85=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 695:2: -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("rethrow",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr85!=null?std_attr85.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rethrow_ex"

    public static class compensate_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compensate"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:704:1: compensate[List join, List signal, boolean empty] : ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st);
    public final BPELscriptWalker.compensate_return compensate(List join, List signal, boolean empty) throws RecognitionException {
        BPELscriptWalker.compensate_return retval = new BPELscriptWalker.compensate_return();
        retval.start = input.LT(1);

        CommonTree target=null;
        List list_target=null;
        BPELscriptWalker.std_attr_return std_attr86 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:705:2: ( ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:705:4: ^( COMPENSATE (target+= ID )? std_attr )
            {
            match(input,COMPENSATE,FOLLOW_COMPENSATE_in_compensate3392); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:705:23: (target+= ID )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:705:23: target+= ID
                    {
                    target=(CommonTree)match(input,ID,FOLLOW_ID_in_compensate3396); 
                    if (list_target==null) list_target=new ArrayList();
                    list_target.add(target);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_compensate3399);
            std_attr86=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 706:2: -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("compensate",
              new STAttrMap().put("id_opt", list_target).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr86!=null?std_attr86.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensate"

    public static class exit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exit"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:709:1: exit[List join, List signal, boolean empty] : ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st);
    public final BPELscriptWalker.exit_return exit(List join, List signal, boolean empty) throws RecognitionException {
        BPELscriptWalker.exit_return retval = new BPELscriptWalker.exit_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr87 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:710:2: ( ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:710:4: ^( EXIT std_attr )
            {
            match(input,EXIT,FOLLOW_EXIT_in_exit3444); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_exit3446);
            std_attr87=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 711:2: -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("exit",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr87!=null?std_attr87.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exit"

    public static class validate_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "validate"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:714:1: validate[List join, List signal, boolean empty, HashMap<String, String> _vars] : ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$vars);
    public final BPELscriptWalker.validate_return validate(List join, List signal, boolean empty, HashMap<String, String> _vars) throws RecognitionException {
        BPELscriptWalker.validate_return retval = new BPELscriptWalker.validate_return();
        retval.start = input.LT(1);

        CommonTree vars=null;
        List list_vars=null;
        BPELscriptWalker.std_attr_return std_attr88 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:715:2: ( ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$vars))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:715:4: ^( VALIDATE (vars+= ID )+ std_attr )
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validate3487); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:715:19: (vars+= ID )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==ID) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:715:19: vars+= ID
            	    {
            	    vars=(CommonTree)match(input,ID,FOLLOW_ID_in_validate3491); 
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars);


            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);

            pushFollow(FOLLOW_std_attr_in_validate3494);
            std_attr88=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 

            	


            // TEMPLATE REWRITE
            // 718:2: -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$vars)
            {
                retval.st = templateLib.getInstanceOf("validate",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr88!=null?std_attr88.st:null)).put("var", list_vars));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validate"

    public static class ext_act_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ext_act"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:721:1: ext_act[List join, List signal] : ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.st);
    public final BPELscriptWalker.ext_act_return ext_act(List join, List signal) throws RecognitionException {
        BPELscriptWalker.ext_act_return retval = new BPELscriptWalker.ext_act_return();
        retval.start = input.LT(1);

        CommonTree ea=null;
        BPELscriptWalker.std_attr_return std_attr89 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:722:2: ( ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:722:4: ^( EXTENSIONACT ea= EXT_ACT std_attr )
            {
            match(input,EXTENSIONACT,FOLLOW_EXTENSIONACT_in_ext_act3544); 

            match(input, Token.DOWN, null); 
            ea=(CommonTree)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act3548); 
            pushFollow(FOLLOW_std_attr_in_ext_act3550);
            std_attr89=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 

            		/*
            		 * this is a quite ugly hack to delete the {{{ and }}}.
            		 * they were used in EXT_ACT to support wildcarding
            		 */
            		int pre = ea.token.getText().indexOf("{{{")+3;
                       	int post = ea.token.getText().indexOf("}}}");	
                       	String m = ea.token.getText().substring(pre, post);
            	


            // TEMPLATE REWRITE
            // 732:2: -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("ext_act",
              new STAttrMap().put("join", join).put("signal", signal).put("ext_act", m.trim()).put("std_attr", (std_attr89!=null?std_attr89.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ext_act"

    public static class nop_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nop"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:735:1: nop[List join, List signal, boolean empty] : ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st);
    public final BPELscriptWalker.nop_return nop(List join, List signal, boolean empty) throws RecognitionException {
        BPELscriptWalker.nop_return retval = new BPELscriptWalker.nop_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr90 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:736:2: ( ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:736:4: ^( NOP std_attr )
            {
            match(input,NOP,FOLLOW_NOP_in_nop3594); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_nop3596);
            std_attr90=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 737:2: -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.st)
            {
                retval.st = templateLib.getInstanceOf("nop",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr90!=null?std_attr90.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nop"

    public static class namespace_return extends TreeRuleReturnScope {
        public String id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "namespace"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:741:1: namespace returns [String id] : ^( NAMESPACE ID url= STRING ) ;
    public final BPELscriptWalker.namespace_return namespace() throws RecognitionException {
        BPELscriptWalker.namespace_return retval = new BPELscriptWalker.namespace_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree ID91=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:742:2: ( ^( NAMESPACE ID url= STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:742:4: ^( NAMESPACE ID url= STRING )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace3639); 

            match(input, Token.DOWN, null); 
            ID91=(CommonTree)match(input,ID,FOLLOW_ID_in_namespace3641); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_namespace3645); 

            match(input, Token.UP, null); 
            // insert namespace in global HashMap glob_ns
            		Boolean definedIn = glob_ns.containsKey((ID91!=null?ID91.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("namespace", ID91);
            		} else {
            			glob_ns.put((ID91!=null?ID91.getText():null), (url!=null?url.getText():null));
            		}
            	// set return value
            		retval.id =(ID91!=null?ID91.getText():null);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class extension_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extension"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:756:1: extension : ^( EXTENSION ID url= STRING ( MUSTUND )? ) ;
    public final BPELscriptWalker.extension_return extension() throws RecognitionException {
        BPELscriptWalker.extension_return retval = new BPELscriptWalker.extension_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree MUSTUND92=null;
        CommonTree ID93=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:757:2: ( ^( EXTENSION ID url= STRING ( MUSTUND )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:757:5: ^( EXTENSION ID url= STRING ( MUSTUND )? )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension3675); 

            match(input, Token.DOWN, null); 
            ID93=(CommonTree)match(input,ID,FOLLOW_ID_in_extension3677); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_extension3681); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:757:31: ( MUSTUND )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==MUSTUND) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:757:31: MUSTUND
                    {
                    MUSTUND92=(CommonTree)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension3683); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            		
            		//if mustUnderstand is not empty, append it to modified URL
            		String modUrl = (url!=null?url.getText():null);
            		if (MUSTUND92!=null) modUrl+=(MUSTUND92!=null?MUSTUND92.getText():null);/*" mustUnderstand=\""+$mustUnderstand.get(0)+"\"";*/
            				
            		Boolean definedIn = glob_ns.containsKey((ID93!=null?ID93.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("extension", ID93);
            		} else {
            			// insert extension in namespace HashMap glob_ns and extensions
            			glob_ns.put((ID93!=null?ID93.getText():null), (url!=null?url.getText():null));				
            			extensions.put((ID93!=null?ID93.getText():null), modUrl );
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extension"

    public static class imports_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "imports"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:777:1: imports : ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) ;
    public final BPELscriptWalker.imports_return imports() throws RecognitionException {
        BPELscriptWalker.imports_return retval = new BPELscriptWalker.imports_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        CommonTree loc=null;
        CommonTree ns=null;
        BPELscriptWalker.viType_return viType94 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:2: ( ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:5: ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_imports3705); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:14: (id= ID loc= STRING )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:15: id= ID loc= STRING
            {
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_imports3710); 
            loc=(CommonTree)match(input,STRING,FOLLOW_STRING_in_imports3714); 

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:35: (ns= ID )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:35: ns= ID
                    {
                    ns=(CommonTree)match(input,ID,FOLLOW_ID_in_imports3719); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:40: ( viType )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==VITYPE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:40: viType
                    {
                    pushFollow(FOLLOW_viType_in_imports3722);
                    viType94=viType();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            		String modUrl = "";
            		// resolve NS
            		String ns_resolved = glob_ns.get((ns!=null?ns.getText():null));
            		
            		if (ns_resolved!=null) 
            		{//proceed only if namespace is already known
            			// handle importType
            			if ((viType94!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType94.start),
              input.getTreeAdaptor().getTokenStopIndex(viType94.start))):null)!=null) modUrl+=" importType="+(viType94!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType94.start),
              input.getTreeAdaptor().getTokenStopIndex(viType94.start))):null).substring(5, (viType94!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType94.start),
              input.getTreeAdaptor().getTokenStopIndex(viType94.start))):null).length())+"\n ";
            			// handle location
            			if (loc!=null) modUrl+="location="+loc+"\n ";
            			// handle namespace
            			if ((ns!=null?ns.getText():null)!=null) modUrl+="namespace="+ns_resolved;
            		
            			Boolean definedIn = glob_ns.containsKey((id!=null?id.getText():null));
            		
            			if (definedIn) {
            				throwDefinedWarning("import", id);
            			} else {
            				// insert extension in namespace HashMap glob_ns and extensions
            				//glob_ns.put((id!=null?id.getText():null), (ns!=null?ns.getText():null));
            				imports.put((id!=null?id.getText():null), modUrl ); 
            			}
            		} else {//error since unknown namespace
            			System.err.println("Error on Line "+id.getLine()+":"+id.getCharPositionInLine()+": "+"namespace "+id.getText()+" undefined.");
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "imports"

    public static class messages_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "messages"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:808:1: messages[HashMap<String, String> _messages, Boolean isInScope] : ^( MESSAGES ( message[_messages, isInScope] )+ ) ;
    public final BPELscriptWalker.messages_return messages(HashMap<String, String> _messages, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.messages_return retval = new BPELscriptWalker.messages_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:2: ( ^( MESSAGES ( message[_messages, isInScope] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:4: ^( MESSAGES ( message[_messages, isInScope] )+ )
            {
            match(input,MESSAGES,FOLLOW_MESSAGES_in_messages3741); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:15: ( message[_messages, isInScope] )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==MESSAGE) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:15: message[_messages, isInScope]
            	    {
            	    pushFollow(FOLLOW_message_in_messages3743);
            	    message(_messages, isInScope);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messages"

    public static class message_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "message"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:812:1: message[HashMap<String, String> _messages, Boolean isInScope] : ^( MESSAGE ID ) ;
    public final BPELscriptWalker.message_return message(HashMap<String, String> _messages, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.message_return retval = new BPELscriptWalker.message_return();
        retval.start = input.LT(1);

        CommonTree ID95=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:813:2: ( ^( MESSAGE ID ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:813:4: ^( MESSAGE ID )
            {
            match(input,MESSAGE,FOLLOW_MESSAGE_in_message3761); 

            match(input, Token.DOWN, null); 
            ID95=(CommonTree)match(input,ID,FOLLOW_ID_in_message3763); 

            match(input, Token.UP, null); 
            	
            		Boolean definedIn = _messages.containsKey((ID95!=null?ID95.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("messageExchange", ID95);
            		} 
            		// insert messages in message HashMap
            		_messages.put((ID95!=null?ID95.getText():null), "" );                    
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class variables_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variables"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:826:1: variables[HashMap<String, String> _vars, Boolean isInScope] : ^( VARIABLES ( variable[_vars, isInScope] )+ ) ;
    public final BPELscriptWalker.variables_return variables(HashMap<String, String> _vars, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.variables_return retval = new BPELscriptWalker.variables_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:827:2: ( ^( VARIABLES ( variable[_vars, isInScope] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:827:5: ^( VARIABLES ( variable[_vars, isInScope] )+ )
            {
            match(input,VARIABLES,FOLLOW_VARIABLES_in_variables3782); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:827:17: ( variable[_vars, isInScope] )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==VARIABLE) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:827:17: variable[_vars, isInScope]
            	    {
            	    pushFollow(FOLLOW_variable_in_variables3784);
            	    variable(_vars, isInScope);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variables"

    public static class variable_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:829:1: variable[HashMap<String, String> _vars, Boolean isInScope] : ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) ;
    public final BPELscriptWalker.variable_return variable(HashMap<String, String> _vars, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.variable_return retval = new BPELscriptWalker.variable_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        BPELscriptWalker.msgType_return msgT = null;

        BPELscriptWalker.viType_return viT = null;

        BPELscriptWalker.viElt_return viE = null;

        BPELscriptWalker.with_ex_return with = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:2: ( ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:4: ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? )
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_variable3800); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_variable3804); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:25: (msgT= msgType )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==MSGTYPE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:25: msgT= msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable3808);
                    msgT=msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:38: (viT= viType )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==VITYPE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:38: viT= viType
                    {
                    pushFollow(FOLLOW_viType_in_variable3813);
                    viT=viType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:50: (viE= viElt )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==VIELT) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:50: viE= viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable3818);
                    viE=viElt();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:62: (with= with_ex )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==WITH) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:62: with= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable3823);
                    with=with_ex();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            	boolean empty = (with!=null?with.st:null) == null;
            		/**
            		 * compose value string 'var' for the hashmap
            		 * 
            		 * Therefor check if there are modifiers and append them in positiv case.
            		 * if ID is already in use, ignore the new one and throw a warning
            		 */
            		
            		// Read modifiers in String var
            		String var = null;

                                /**  if ((msgT!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(msgT.start),
              input.getTreeAdaptor().getTokenStopIndex(msgT.start))):null)!=null) {var+="messageType=\""+(msgT!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(msgT.start),
              input.getTreeAdaptor().getTokenStopIndex(msgT.start))):null)+"\"";}
                                  
                                 // if ((viT!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viT.start),
              input.getTreeAdaptor().getTokenStopIndex(viT.start))):null)!=null) {var+="type=\""+(viT!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viT.start),
              input.getTreeAdaptor().getTokenStopIndex(viT.start))):null)+"\"";}
                                  
                                  if ((viE!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viE.start),
              input.getTreeAdaptor().getTokenStopIndex(viE.start))):null)!=null) {var+="element=\""+(viE!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viE.start),
              input.getTreeAdaptor().getTokenStopIndex(viE.start))):null)+"\""}    
                        	*/
                        	var=templateLib.getInstanceOf("variable",
                          new STAttrMap().put("id", (id!=null?id.getText():null)).put("msgT", (msgT!=null?msgT.st:null)).
                             put("viT", (viT!=null?viT.st:null)).put("viE", (viE!=null?viE.st:null)).put("with", with!=null?with.st:null).put("empty", empty)).toString();
                        	
                        	if (_vars!=null) {// check if already known
                        	    Boolean definedIn = _vars.containsKey((id!=null?id.getText():null));
            		
            		    if (definedIn) {
            			throwDefinedWarning("variable", id);
            		    } 
            		
            		    //store variables in hash map
            	    	    _vars.put((id!=null?id.getText():null), var);
            	    	}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class partnerlinks_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "partnerlinks"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:866:1: partnerlinks[HashMap<String, String> _pl, Boolean isInScope] : ^( PARTNERLINKS ( partnerlink[_pl, isInScope] )+ ) ;
    public final BPELscriptWalker.partnerlinks_return partnerlinks(HashMap<String, String> _pl, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.partnerlinks_return retval = new BPELscriptWalker.partnerlinks_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:867:2: ( ^( PARTNERLINKS ( partnerlink[_pl, isInScope] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:867:4: ^( PARTNERLINKS ( partnerlink[_pl, isInScope] )+ )
            {
            match(input,PARTNERLINKS,FOLLOW_PARTNERLINKS_in_partnerlinks3843); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:867:19: ( partnerlink[_pl, isInScope] )+
            int cnt106=0;
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==PID) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:867:19: partnerlink[_pl, isInScope]
            	    {
            	    pushFollow(FOLLOW_partnerlink_in_partnerlinks3845);
            	    partnerlink(_pl, isInScope);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt106 >= 1 ) break loop106;
                        EarlyExitException eee =
                            new EarlyExitException(106, input);
                        throw eee;
                }
                cnt106++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partnerlinks"

    public static class partnerlink_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "partnerlink"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:869:1: partnerlink[HashMap<String, String> _pl, Boolean isInScope] : ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) ;
    public final BPELscriptWalker.partnerlink_return partnerlink(HashMap<String, String> _pl, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.partnerlink_return retval = new BPELscriptWalker.partnerlink_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree ID96=null;
        BPELscriptWalker.ns_id_return plType = null;

        BPELscriptWalker.ns_id_return roleA = null;

        BPELscriptWalker.ns_id_return roleB = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:2: ( ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:4: ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? )
            {
            match(input,PID,FOLLOW_PID_in_partnerlink3859); 

            match(input, Token.DOWN, null); 
            ID96=(CommonTree)match(input,ID,FOLLOW_ID_in_partnerlink3861); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:19: (plType= ns_id )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==NS) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==DOWN) ) {
                    int LA107_3 = input.LA(3);

                    if ( (LA107_3==ID) ) {
                        int LA107_4 = input.LA(4);

                        if ( (LA107_4==UP) ) {
                            alt107=1;
                        }
                        else if ( (LA107_4==ID) ) {
                            int LA107_6 = input.LA(5);

                            if ( (LA107_6==UP) ) {
                                alt107=1;
                            }
                        }
                    }
                }
            }
            switch (alt107) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:19: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3865);
                    plType=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:32: (roleA= ns_id )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==NS) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==DOWN) ) {
                    int LA108_3 = input.LA(3);

                    if ( (LA108_3==ID) ) {
                        int LA108_4 = input.LA(4);

                        if ( (LA108_4==UP) ) {
                            alt108=1;
                        }
                        else if ( (LA108_4==ID) ) {
                            int LA108_6 = input.LA(5);

                            if ( (LA108_6==UP) ) {
                                alt108=1;
                            }
                        }
                    }
                }
            }
            switch (alt108) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:32: roleA= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3870);
                    roleA=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:45: (roleB= ns_id )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NS) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:45: roleB= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3875);
                    roleB=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:57: (init= INITPARTNER )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==INITPARTNER) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:870:57: init= INITPARTNER
                    {
                    init=(CommonTree)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partnerlink3880); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

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
            	if ((plType!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(plType.start),
              input.getTreeAdaptor().getTokenStopIndex(plType.start))):null)!=null) {
            	    if((plType!=null?plType.nspre:null)!=null) {
            	        plT = "partnerLinkType=\""+(plType!=null?plType.nspre:null)+":";
            	    }
            	    plT+=(plType!=null?plType.nsloc:null)+"\"";
            	   /* if (!(roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null).equals("null") || !(roleB!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleB.start),
              input.getTreeAdaptor().getTokenStopIndex(roleB.start))):null).equals("null") | init!=null) plT+="\n ";*/
            	} /*else if ($viType.text!=null) {
            	// 2b)
            	    plT = "partnerLinkType=\""+$viType.text+"\"";
            	}*/
            	// 2a)
            	if ((roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null)!=null && !(roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null).equals("null")) {
            		plT+="\n myRole=\""+(roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null)+"\"";
            	}
            	if ((roleB!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleB.start),
              input.getTreeAdaptor().getTokenStopIndex(roleB.start))):null)!=null && !(roleB!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleB.start),
              input.getTreeAdaptor().getTokenStopIndex(roleB.start))):null).equals("null")) {
            		/*if (!(roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null).equals("null")) plT+="\n ";*/
            		plT+="\n partnerRole=\""+(roleB!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleB.start),
              input.getTreeAdaptor().getTokenStopIndex(roleB.start))):null)+"\"";
            	}
            	// 2b)
            	/*if ($ptA.text!=null) {
            		plT+="myRole=\""+(roleA!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleA.start),
              input.getTreeAdaptor().getTokenStopIndex(roleA.start))):null)+"\"\n ";
            	}
            	if ($ptB.text!=null) {
            		plT+="partnerRole=\""+(roleB!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(roleB.start),
              input.getTreeAdaptor().getTokenStopIndex(roleB.start))):null)+"\"";
            	}*/
            	
            	// 3a)
            	if (init!=null) {
            	    plT+="\n "+(init!=null?init.getText():null);
            	}
            	
            	// 4)
            	Boolean definedIn = _pl.containsKey((ID96!=null?ID96.getText():null));
            		
            	if (definedIn) {
            		throwDefinedWarning("partnerlink", ID96);
            	}
            	// 5)
            	_pl.put((ID96!=null?ID96.getText():null), plT);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partnerlink"

    public static class corr_sets_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "corr_sets"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:934:1: corr_sets[HashMap<String, String>_cs, Boolean isInScope] : ^( CORRSETS (cs+= corr_set[_cs, isInScope] )+ ) ;
    public final BPELscriptWalker.corr_sets_return corr_sets(HashMap<String, String>_cs, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.corr_sets_return retval = new BPELscriptWalker.corr_sets_return();
        retval.start = input.LT(1);

        List list_cs=null;
        RuleReturnScope cs = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:935:2: ( ^( CORRSETS (cs+= corr_set[_cs, isInScope] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:935:4: ^( CORRSETS (cs+= corr_set[_cs, isInScope] )+ )
            {
            match(input,CORRSETS,FOLLOW_CORRSETS_in_corr_sets3899); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:935:17: (cs+= corr_set[_cs, isInScope] )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==CORRSET) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:935:17: cs+= corr_set[_cs, isInScope]
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets3903);
            	    cs=corr_set(_cs, isInScope);

            	    state._fsp--;

            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt111 >= 1 ) break loop111;
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_sets"

    public static class corr_set_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "corr_set"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:937:1: corr_set[HashMap<String, String>_cs, Boolean isInScope] : ^( CORRSET f= ID (params+= ID )+ ) ;
    public final BPELscriptWalker.corr_set_return corr_set(HashMap<String, String>_cs, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.corr_set_return retval = new BPELscriptWalker.corr_set_return();
        retval.start = input.LT(1);

        CommonTree f=null;
        CommonTree params=null;
        List list_params=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:938:2: ( ^( CORRSET f= ID (params+= ID )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:938:4: ^( CORRSET f= ID (params+= ID )+ )
            {
            match(input,CORRSET,FOLLOW_CORRSET_in_corr_set3917); 

            match(input, Token.DOWN, null); 
            f=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set3921); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:938:25: (params+= ID )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==ID) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:938:25: params+= ID
            	    {
            	    params=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set3925); 
            	    if (list_params==null) list_params=new ArrayList();
            	    list_params.add(params);


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
            } while (true);


            match(input, Token.UP, null); 

            	/**
            	 * compose value string 'csP' for the hashmap
            	 *
            	 * 
            	 */

            	String csP ="";
            	
            	if (list_params!=null){
             	    for(Object p:list_params) {
             	        csP+=p.toString()+" ";
             	    }
             	    csP=csP.trim();
            	}
            	
            	// 4)
            	Boolean definedIn = _cs.containsKey((f!=null?f.getText():null));
            		
            	if (definedIn) {
            	    throwDefinedWarning("correlationSet", f);
            	}
            	// 5)
            	_cs.put((f!=null?f.getText():null), csP);
            	
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_set"

    public static class correlation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "correlation"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:968:1: correlation : ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors);
    public final BPELscriptWalker.correlation_return correlation() throws RecognitionException {
        BPELscriptWalker.correlation_return retval = new BPELscriptWalker.correlation_return();
        retval.start = input.LT(1);

        List list_cors=null;
        RuleReturnScope cors = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:969:2: ( ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:969:4: ^( CORRELATION (cors+= corr_mapping )+ )
            {
            match(input,CORRELATION,FOLLOW_CORRELATION_in_correlation3943); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:969:22: (cors+= corr_mapping )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==CORR_MAP) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:969:22: cors+= corr_mapping
            	    {
            	    pushFollow(FOLLOW_corr_mapping_in_correlation3947);
            	    cors=corr_mapping();

            	    state._fsp--;

            	    if (list_cors==null) list_cors=new ArrayList();
            	    list_cors.add(cors.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 970:2: -> list(content_st=$cors)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", list_cors));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlation"

    public static class corr_mapping_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "corr_mapping"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:976:1: corr_mapping : ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern);
    public final BPELscriptWalker.corr_mapping_return corr_mapping() throws RecognitionException {
        BPELscriptWalker.corr_mapping_return retval = new BPELscriptWalker.corr_mapping_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree pattern=null;
        CommonTree ID97=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:2: ( ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:4: ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? )
            {
            match(input,CORR_MAP,FOLLOW_CORR_MAP_in_corr_mapping3975); 

            match(input, Token.DOWN, null); 
            ID97=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_mapping3977); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:22: (init= INIT_COR )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==INIT_COR) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:22: init= INIT_COR
                    {
                    init=(CommonTree)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping3981); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:40: (pattern= PATTERN_COR )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==PATTERN_COR) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:977:40: pattern= PATTERN_COR
                    {
                    pattern=(CommonTree)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping3986); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            	
            		Boolean definedIn = expressions.containsKey((ID97!=null?ID97.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("correlation", ID97);
            			//throw new RecognitionException();
            		} else {
            			expressions.put((ID97!=null?ID97.getText():null), null);/*, $expr.retval);//	System.out.println(expressions);*/
            		}
            	


            // TEMPLATE REWRITE
            // 989:2: -> correlation_map(id=$IDinit=$initpattern=$pattern)
            {
                retval.st = templateLib.getInstanceOf("correlation_map",
              new STAttrMap().put("id", ID97).put("init", init).put("pattern", pattern));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_mapping"

    public static class expr_return extends TreeRuleReturnScope {
        public String retval;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:996:1: expr[StringTemplate path_expr] returns [String retval] : (se= s_expr -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call );
    public final BPELscriptWalker.expr_return expr(StringTemplate path_expr) throws RecognitionException {
        BPELscriptWalker.expr_return retval = new BPELscriptWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree ee=null;
        BPELscriptWalker.s_expr_return se = null;

        BPELscriptWalker.funct_call_return fc = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:997:2: (se= s_expr -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call )
            int alt116=3;
            switch ( input.LA(1) ) {
            case PATH:
            case STRING:
            case INT:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 170:
            case 171:
            case 172:
            case 173:
            case 197:
                {
                alt116=1;
                }
                break;
            case EXT_EXPR:
                {
                alt116=2;
                }
                break;
            case CALL:
                {
                alt116=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:997:5: se= s_expr
                    {
                    pushFollow(FOLLOW_s_expr_in_expr4041);
                    se=s_expr();

                    state._fsp--;

                    retval.retval =(se!=null?se.retval:null);


                    // TEMPLATE REWRITE
                    // 998:2: -> s_expr(value=$se.retvalpath=$path_expr)
                    {
                        retval.st = templateLib.getInstanceOf("s_expr",
                      new STAttrMap().put("value", (se!=null?se.retval:null)).put("path", path_expr));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:999:5: ee= EXT_EXPR
                    {
                    ee=(CommonTree)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr4067); 
                    	
                    		retval.retval =(ee!=null?ee.getText():null);
                    		
                    		//remove expression brackets
                    		retval.retval = retval.retval.substring(1, retval.retval.length()-1);
                    		//change specific syntax
                    		if (retval.retval.contains("<")) retval.retval = retval.retval.replace("<", "&lt;"); 
                    		if (retval.retval.contains(">")) retval.retval = retval.retval.replace("<", "&gt;");       
                    	


                    // TEMPLATE REWRITE
                    // 1009:2: -> expr(expr=$retval)
                    {
                        retval.st = templateLib.getInstanceOf("expr",
                      new STAttrMap().put("expr", retval.retval));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:5: fc= funct_call
                    {
                    pushFollow(FOLLOW_funct_call_in_expr4090);
                    fc=funct_call();

                    state._fsp--;

                    retval.retval =(fc!=null?fc.retval:null);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class funct_call_return extends TreeRuleReturnScope {
        public String retval;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "funct_call"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1016:1: funct_call returns [String retval] : ^( CALL (ids+= ID )+ ) ;
    public final BPELscriptWalker.funct_call_return funct_call() throws RecognitionException {
        BPELscriptWalker.funct_call_return retval = new BPELscriptWalker.funct_call_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1018:2: ( ^( CALL (ids+= ID )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1018:4: ^( CALL (ids+= ID )+ )
            {
            match(input,CALL,FOLLOW_CALL_in_funct_call4112); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1018:14: (ids+= ID )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==ID) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1018:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_funct_call4116); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            match(input, Token.UP, null); 

            		String definedIn = isAlreadyDefined((ids!=null?ids.getText():null));
            		
            		if (definedIn==null) {
            			System.err.println("Error on line "+ids.getLine()+":"+ids.getCharPositionInLine()+": function"+" '"+ids.getText()+"' is not known");
            			throw new RecognitionException();
            		} else {		
            			retval.retval ="TODO: funct_call";
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funct_call"

    public static class s_expr_return extends TreeRuleReturnScope {
        public String retval;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "s_expr"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1040:1: s_expr returns [String retval] : ( ^( '==' s1= s_expr s2= s_expr ) | ^( '!=' s1= s_expr s2= s_expr ) | ^( '<' s1= s_expr s2= s_expr ) | ^( '>' s1= s_expr s2= s_expr ) | ^( '<=' s1= s_expr s2= s_expr ) | ^( '=>' s1= s_expr s2= s_expr ) | ^( '+' s1= s_expr s2= s_expr ) | ^( '-' s1= s_expr s2= s_expr ) | ^( '*' s1= s_expr s2= s_expr ) | ^( '/' s1= s_expr s2= s_expr ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st));
    public final BPELscriptWalker.s_expr_return s_expr() throws RecognitionException {
        BPELscriptWalker.s_expr_return retval = new BPELscriptWalker.s_expr_return();
        retval.start = input.LT(1);

        CommonTree STRING98=null;
        CommonTree INT99=null;
        BPELscriptWalker.s_expr_return s1 = null;

        BPELscriptWalker.s_expr_return s2 = null;

        BPELscriptWalker.path_expr_return pe = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:2: ( ^( '==' s1= s_expr s2= s_expr ) | ^( '!=' s1= s_expr s2= s_expr ) | ^( '<' s1= s_expr s2= s_expr ) | ^( '>' s1= s_expr s2= s_expr ) | ^( '<=' s1= s_expr s2= s_expr ) | ^( '=>' s1= s_expr s2= s_expr ) | ^( '+' s1= s_expr s2= s_expr ) | ^( '-' s1= s_expr s2= s_expr ) | ^( '*' s1= s_expr s2= s_expr ) | ^( '/' s1= s_expr s2= s_expr ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st))
            int alt118=13;
            switch ( input.LA(1) ) {
            case 164:
                {
                alt118=1;
                }
                break;
            case 165:
                {
                alt118=2;
                }
                break;
            case 166:
                {
                alt118=3;
                }
                break;
            case 167:
                {
                alt118=4;
                }
                break;
            case 168:
                {
                alt118=5;
                }
                break;
            case 197:
                {
                alt118=6;
                }
                break;
            case 170:
                {
                alt118=7;
                }
                break;
            case 171:
                {
                alt118=8;
                }
                break;
            case 172:
                {
                alt118=9;
                }
                break;
            case 173:
                {
                alt118=10;
                }
                break;
            case STRING:
                {
                alt118=11;
                }
                break;
            case INT:
                {
                alt118=12;
                }
                break;
            case PATH:
                {
                alt118=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:4: ^( '==' s1= s_expr s2= s_expr )
                    {
                    match(input,164,FOLLOW_164_in_s_expr4146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4150);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4154);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"=="+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1042:4: ^( '!=' s1= s_expr s2= s_expr )
                    {
                    match(input,165,FOLLOW_165_in_s_expr4163); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4167);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4171);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"!="+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1043:4: ^( '<' s1= s_expr s2= s_expr )
                    {
                    match(input,166,FOLLOW_166_in_s_expr4180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4184);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4188);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"&lt;"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 4 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1044:4: ^( '>' s1= s_expr s2= s_expr )
                    {
                    match(input,167,FOLLOW_167_in_s_expr4197); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4201);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4205);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"&gt;"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 5 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1045:4: ^( '<=' s1= s_expr s2= s_expr )
                    {
                    match(input,168,FOLLOW_168_in_s_expr4214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4218);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4222);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"<="+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 6 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1046:4: ^( '=>' s1= s_expr s2= s_expr )
                    {
                    match(input,197,FOLLOW_197_in_s_expr4231); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4235);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4239);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"=>"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 7 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1047:4: ^( '+' s1= s_expr s2= s_expr )
                    {
                    match(input,170,FOLLOW_170_in_s_expr4248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4252);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4256);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"+"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 8 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1048:4: ^( '-' s1= s_expr s2= s_expr )
                    {
                    match(input,171,FOLLOW_171_in_s_expr4265); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4269);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4273);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"-"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 9 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1049:4: ^( '*' s1= s_expr s2= s_expr )
                    {
                    match(input,172,FOLLOW_172_in_s_expr4282); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4286);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4290);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"*"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 10 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:4: ^( '/' s1= s_expr s2= s_expr )
                    {
                    match(input,173,FOLLOW_173_in_s_expr4299); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4303);
                    s1=s_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4307);
                    s2=s_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.retval =(s1!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s1.start),
                      input.getTreeAdaptor().getTokenStopIndex(s1.start))):null)+"/"+ (s2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(s2.start),
                      input.getTreeAdaptor().getTokenStopIndex(s2.start))):null);

                    }
                    break;
                case 11 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1051:4: STRING
                    {
                    STRING98=(CommonTree)match(input,STRING,FOLLOW_STRING_in_s_expr4315); 

                    		retval.retval = (STRING98!=null?STRING98.getText():null);
                    		// remove quotation marks
                    		retval.retval = retval.retval.substring(1, retval.retval.length()-1);
                    	

                    }
                    break;
                case 12 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1057:4: INT
                    {
                    INT99=(CommonTree)match(input,INT,FOLLOW_INT_in_s_expr4323); 
                    retval.retval =(INT99!=null?INT99.getText():null);

                    }
                    break;
                case 13 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1058:4: pe= path_expr
                    {
                    pushFollow(FOLLOW_path_expr_in_s_expr4332);
                    pe=path_expr();

                    state._fsp--;

                    retval.retval =(pe!=null?pe.retval:null);


                    // TEMPLATE REWRITE
                    // 1058:39: -> path_expr(path=pe.st)
                    {
                        retval.st = templateLib.getInstanceOf("path_expr",
                      new STAttrMap().put("path", pe.st));
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "s_expr"

    public static class path_expr_return extends TreeRuleReturnScope {
        public String retval;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "path_expr"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1064:1: path_expr returns [String retval] : ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns);
    public final BPELscriptWalker.path_expr_return path_expr() throws RecognitionException {
        BPELscriptWalker.path_expr_return retval = new BPELscriptWalker.path_expr_return();
        retval.start = input.LT(1);

        List list_ns=null;
        RuleReturnScope ns = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1065:2: ( ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1065:4: ^( PATH (ns+= ns_id )+ )
            {
            match(input,PATH,FOLLOW_PATH_in_path_expr4361); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1065:13: (ns+= ns_id )+
            int cnt119=0;
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==NS) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1065:13: ns+= ns_id
            	    {
            	    pushFollow(FOLLOW_ns_id_in_path_expr4365);
            	    ns=ns_id();

            	    state._fsp--;

            	    if (list_ns==null) list_ns=new ArrayList();
            	    list_ns.add(ns.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
            } while (true);


            match(input, Token.UP, null); 
            //return variable name for use in assign rule (ignoring parts)	
            		retval.retval =list_ns.get(0).toString();
            	


            // TEMPLATE REWRITE
            // 1069:2: -> path_expr(pns_p=$ns)
            {
                retval.st = templateLib.getInstanceOf("path_expr",
              new STAttrMap().put("pns_p", list_ns));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "path_expr"

    public static class ns_id_return extends TreeRuleReturnScope {
        public String nspre;
        public String nsloc;
        public CommonTree locID;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ns_id"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1075:1: ns_id returns [String nspre, String nsloc, CommonTree locID] : ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text);
    public final BPELscriptWalker.ns_id_return ns_id() throws RecognitionException {
        BPELscriptWalker.ns_id_return retval = new BPELscriptWalker.ns_id_return();
        retval.start = input.LT(1);

        CommonTree pre=null;
        CommonTree loc=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1076:2: ( ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1076:4: ^( NS (pre= ID )? loc= ID )
            {
            match(input,NS,FOLLOW_NS_in_ns_id4401); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1076:12: (pre= ID )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ID) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==ID) ) {
                    alt120=1;
                }
            }
            switch (alt120) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1076:12: pre= ID
                    {
                    pre=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id4405); 

                    }
                    break;

            }

            loc=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id4410); 

            match(input, Token.UP, null); 
            // set return values (pre only when not null ;) )
            		
            		if (pre != null) {retval.nspre = (pre!=null?pre.getText():null);} 
            		retval.nsloc = (loc!=null?loc.getText():null);
            		retval.locID =loc;
            	


            // TEMPLATE REWRITE
            // 1083:2: -> ns_id(pre_opt=$preloc=$loc.text)
            {
                retval.st = templateLib.getInstanceOf("ns_id",
              new STAttrMap().put("pre_opt", pre).put("loc", (loc!=null?loc.getText():null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ns_id"

    public static class portType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "portType"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1086:1: portType : ^( PORTTYPE STRING ) -> portType(port=$STRING);
    public final BPELscriptWalker.portType_return portType() throws RecognitionException {
        BPELscriptWalker.portType_return retval = new BPELscriptWalker.portType_return();
        retval.start = input.LT(1);

        CommonTree STRING100=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1087:2: ( ^( PORTTYPE STRING ) -> portType(port=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1087:4: ^( PORTTYPE STRING )
            {
            match(input,PORTTYPE,FOLLOW_PORTTYPE_in_portType4445); 

            match(input, Token.DOWN, null); 
            STRING100=(CommonTree)match(input,STRING,FOLLOW_STRING_in_portType4447); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1088:2: -> portType(port=$STRING)
            {
                retval.st = templateLib.getInstanceOf("portType",
              new STAttrMap().put("port", STRING100));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "portType"

    public static class std_attr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "std_attr"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1091:1: std_attr : ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure);
    public final BPELscriptWalker.std_attr_return std_attr() throws RecognitionException {
        BPELscriptWalker.std_attr_return retval = new BPELscriptWalker.std_attr_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree suppressJoinFailure=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:2: ( ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:4: ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? )
            {
            match(input,STD_ATTR,FOLLOW_STD_ATTR_in_std_attr4471); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:19: (name= STRING )?
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==STRING) ) {
                    alt121=1;
                }
                switch (alt121) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:19: name= STRING
                        {
                        name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_std_attr4475); 

                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:47: (suppressJoinFailure= SJF )?
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==SJF) ) {
                    alt122=1;
                }
                switch (alt122) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1092:47: suppressJoinFailure= SJF
                        {
                        suppressJoinFailure=(CommonTree)match(input,SJF,FOLLOW_SJF_in_std_attr4480); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 1093:2: -> std_attr(name=$namesjf=$suppressJoinFailure)
            {
                retval.st = templateLib.getInstanceOf("std_attr",
              new STAttrMap().put("name", name).put("sjf", suppressJoinFailure));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "std_attr"

    public static class msgEx_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "msgEx"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1096:1: msgEx : ^( MSGEX STRING ) -> msgEx(msgEx=$STRING);
    public final BPELscriptWalker.msgEx_return msgEx() throws RecognitionException {
        BPELscriptWalker.msgEx_return retval = new BPELscriptWalker.msgEx_return();
        retval.start = input.LT(1);

        CommonTree STRING101=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1097:2: ( ^( MSGEX STRING ) -> msgEx(msgEx=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1097:4: ^( MSGEX STRING )
            {
            match(input,MSGEX,FOLLOW_MSGEX_in_msgEx4510); 

            match(input, Token.DOWN, null); 
            STRING101=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgEx4512); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1098:2: -> msgEx(msgEx=$STRING)
            {
                retval.st = templateLib.getInstanceOf("msgEx",
              new STAttrMap().put("msgEx", STRING101));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgEx"

    public static class msgType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "msgType"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1101:1: msgType : ^( MSGTYPE STRING ) -> msgType(msgT=$STRING);
    public final BPELscriptWalker.msgType_return msgType() throws RecognitionException {
        BPELscriptWalker.msgType_return retval = new BPELscriptWalker.msgType_return();
        retval.start = input.LT(1);

        CommonTree STRING102=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:2: ( ^( MSGTYPE STRING ) -> msgType(msgT=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:4: ^( MSGTYPE STRING )
            {
            match(input,MSGTYPE,FOLLOW_MSGTYPE_in_msgType4535); 

            match(input, Token.DOWN, null); 
            STRING102=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgType4537); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1103:2: -> msgType(msgT=$STRING)
            {
                retval.st = templateLib.getInstanceOf("msgType",
              new STAttrMap().put("msgT", STRING102));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgType"

    public static class viType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "viType"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1106:1: viType : ^( VITYPE STRING ) -> viType(type=$STRING);
    public final BPELscriptWalker.viType_return viType() throws RecognitionException {
        BPELscriptWalker.viType_return retval = new BPELscriptWalker.viType_return();
        retval.start = input.LT(1);

        CommonTree STRING103=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1107:2: ( ^( VITYPE STRING ) -> viType(type=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1107:4: ^( VITYPE STRING )
            {
            match(input,VITYPE,FOLLOW_VITYPE_in_viType4562); 

            match(input, Token.DOWN, null); 
            STRING103=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viType4564); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1108:2: -> viType(type=$STRING)
            {
                retval.st = templateLib.getInstanceOf("viType",
              new STAttrMap().put("type", STRING103));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viType"

    public static class viElt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "viElt"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1111:1: viElt : ^( VIELT STRING ) -> viElt(elt=$STRING);
    public final BPELscriptWalker.viElt_return viElt() throws RecognitionException {
        BPELscriptWalker.viElt_return retval = new BPELscriptWalker.viElt_return();
        retval.start = input.LT(1);

        CommonTree STRING104=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1112:2: ( ^( VIELT STRING ) -> viElt(elt=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1112:4: ^( VIELT STRING )
            {
            match(input,VIELT,FOLLOW_VIELT_in_viElt4589); 

            match(input, Token.DOWN, null); 
            STRING104=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viElt4591); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1113:2: -> viElt(elt=$STRING)
            {
                retval.st = templateLib.getInstanceOf("viElt",
              new STAttrMap().put("elt", STRING104));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viElt"

    public static class faultName_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "faultName"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1116:1: faultName : ^( FAULTNAME STRING ) -> faultName(faultName=$STRING);
    public final BPELscriptWalker.faultName_return faultName() throws RecognitionException {
        BPELscriptWalker.faultName_return retval = new BPELscriptWalker.faultName_return();
        retval.start = input.LT(1);

        CommonTree STRING105=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1117:2: ( ^( FAULTNAME STRING ) -> faultName(faultName=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1117:4: ^( FAULTNAME STRING )
            {
            match(input,FAULTNAME,FOLLOW_FAULTNAME_in_faultName4614); 

            match(input, Token.DOWN, null); 
            STRING105=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultName4616); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1118:2: -> faultName(faultName=$STRING)
            {
                retval.st = templateLib.getInstanceOf("faultName",
              new STAttrMap().put("faultName", STRING105));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultName"

    public static class faultElt_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "faultElt"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1121:1: faultElt : ^( FAULTELT STRING ) -> faultElt(name=$STRING);
    public final BPELscriptWalker.faultElt_return faultElt() throws RecognitionException {
        BPELscriptWalker.faultElt_return retval = new BPELscriptWalker.faultElt_return();
        retval.start = input.LT(1);

        CommonTree STRING106=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1122:2: ( ^( FAULTELT STRING ) -> faultElt(name=$STRING))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1122:4: ^( FAULTELT STRING )
            {
            match(input,FAULTELT,FOLLOW_FAULTELT_in_faultElt4639); 

            match(input, Token.DOWN, null); 
            STRING106=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultElt4641); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1123:2: -> faultElt(name=$STRING)
            {
                retval.st = templateLib.getInstanceOf("faultElt",
              new STAttrMap().put("name", STRING106));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultElt"

    // Delegated rules


 

    public static final BitSet FOLLOW_ROOT_in_program115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_program119 = new BitSet(new long[]{0x00A4000000000028L});
    public static final BitSet FOLLOW_process_in_declaration148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESS_in_process200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_process204 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_process206 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_eventHdl_in_process209 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_STRING_in_process218 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_STRING_in_process223 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_SJF_in_process226 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_EOSF_in_process229 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E012L});
    public static final BitSet FOLLOW_std_attr_in_process232 = new BitSet(new long[]{0x0000030000000008L});
    public static final BitSet FOLLOW_join_in_process236 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_signal_in_process241 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_PROC_STMTS_in_proc_stmts412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_proc_stmts416 = new BitSet(new long[]{0xC340314253BDE548L});
    public static final BitSet FOLLOW_signal_in_proc_stmts421 = new BitSet(new long[]{0xC340314253BDE548L});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pick_in_proc_stmt455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_proc_stmt579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reply_in_proc_stmt609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_proc_stmt624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_in_proc_stmt702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_proc_stmt719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validate_in_proc_stmt726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partnerlinks_in_proc_stmt743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nop_in_proc_stmt780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messages_in_proc_stmt795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_block819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_proc_stmts_in_block823 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_block852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block854 = new BitSet(new long[]{0x00A4000000020028L});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block863 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_param_block896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_param_block900 = new BitSet(new long[]{0x0000000000020008L,0x0000000000020000L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block905 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_block_in_body941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICK_in_pick983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onMessage_in_pick987 = new BitSet(new long[]{0x0000000080000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_onAlarm_in_pick993 = new BitSet(new long[]{0x0000000000000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick996 = new BitSet(new long[]{0x0000000000000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_pick999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONALARM_in_onAlarm1048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_alarm_in_onAlarm1050 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_timeout_in_onAlarm1054 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm1058 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm1061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALARM_in_alarm1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_alarm1111 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_alarm1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEOUT_in_timeout1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_timeout1174 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_timeout1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEATEVERY_in_repeatEvery1232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONMESSAGE_in_onMessage1278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_param_block_in_onMessage1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020081L});
    public static final BitSet FOLLOW_portType_in_onMessage1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020080L});
    public static final BitSet FOLLOW_msgEx_in_onMessage1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage1308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage1312 = new BitSet(new long[]{0x0000040400000008L});
    public static final BitSet FOLLOW_correlation_in_onMessage1316 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_onMessage1321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow1416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_flow1420 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_flow1424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_if_ex1464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1468 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_if_ex1473 = new BitSet(new long[]{0x0000000000001800L,0x000000000004E016L});
    public static final BitSet FOLLOW_ELSIF_in_if_ex1481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1485 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_if_ex1490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_if_ex1501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_if_ex1505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNAL_in_signal1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_signal1571 = new BitSet(new long[]{0x0012800000000008L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_signal1575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_join1614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join1618 = new BitSet(new long[]{0x0012800000000008L,0x0000000100022000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_join1623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequence1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_sequence1660 = new BitSet(new long[]{0x0000000000020088L});
    public static final BitSet FOLLOW_body_in_sequence1665 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_signal_in_sequence1670 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_sequence1673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_sequence1713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_scope_sequence1717 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1722 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_signal_in_scope_sequence1727 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_WHILE_in_while_ex1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_ex1803 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_while_ex1808 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_until_ex1855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_until_ex1857 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_until_ex1862 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_foreach1910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_foreach1914 = new BitSet(new long[]{0x0012800000000000L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1918 = new BitSet(new long[]{0x0012800000000000L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1923 = new BitSet(new long[]{0x0012800011000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1928 = new BitSet(new long[]{0x0012800011000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_scope_short_in_foreach1936 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1938 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_SBO_in_foreach1941 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_std_attr_in_foreach1944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_try_ex2017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex2021 = new BitSet(new long[]{0x0000000004020088L});
    public static final BitSet FOLLOW_body_in_try_ex2027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catch_ex2058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex2060 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_param_block_in_catch_ex2065 = new BitSet(new long[]{0x0000000000000008L,0x0000000000003000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex2070 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex2073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_ex2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_scope_ex2104 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex2109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex2114 = new BitSet(new long[]{0x0000000000000008L,0x000000000020C000L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex2117 = new BitSet(new long[]{0x0000000000000008L,0x000000000000C000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex2120 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex2123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_short2185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short2189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short2193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_stmt2219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt2223 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000050L});
    public static final BitSet FOLLOW_termination_in_scope_stmt2228 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt2233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATION_in_termination2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_termination2261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENTHDL_in_eventHdl2284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2288 = new BitSet(new long[]{0x0000000020000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2293 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_EVENT_in_onEvent2315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_onEvent2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent2323 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_correlation_in_onEvent2327 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_with_ex_in_onEvent2332 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_scope_short_in_onEvent2337 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020A81L});
    public static final BitSet FOLLOW_ID_in_onEvent2344 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A81L});
    public static final BitSet FOLLOW_portType_in_onEvent2347 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A80L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2350 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A00L});
    public static final BitSet FOLLOW_msgType_in_onEvent2353 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_viElt_in_onEvent2356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATION_in_compensation2393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_compensation2395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_in_with_ex2426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_map_in_with_ex2430 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_MAP_in_with_map2469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_with_map2471 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEY_in_with_map2473 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_path_expr_in_with_map2478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECEIVE_in_receive2507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_receive2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_receive2515 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_correlation_in_receive2519 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_portType_in_receive2524 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2529 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_msgEx_in_receive2532 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_std_attr_in_receive2535 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_receive2539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLY_in_reply2635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reply2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_reply2643 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_ID_in_reply2647 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_correlation_in_reply2652 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_portType_in_reply2655 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_std_attr_in_reply2658 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000180L});
    public static final BitSet FOLLOW_faultName_in_reply2662 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000080L});
    public static final BitSet FOLLOW_msgEx_in_reply2665 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_reply2670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_invoke2772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_invoke2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_invoke2780 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_ID_in_invoke2784 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_correlation_in_invoke2789 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_portType_in_invoke2792 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_std_attr_in_invoke2795 = new BitSet(new long[]{0x0000040100000008L});
    public static final BitSet FOLLOW_with_ex_in_invoke2799 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_compensation_in_invoke2802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assign2899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_expr_in_assign2903 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_PROP_in_assign2905 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_portType_in_assign2908 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2911 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_assign2915 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_faultName_in_assign2917 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_msgEx_in_assign2920 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VALID_in_assign2923 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2926 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IGNORE_in_assign2929 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rvalue_in_assign2935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_receive_in_rvalue3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue3139 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throw_ex3271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex3273 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_ID_in_throw_ex3277 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_throw_ex3280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETHROW_in_rethrow_ex3345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex3347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATE_in_compensate3392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_compensate3396 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_compensate3399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_exit3444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_exit3446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALIDATE_in_validate3487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_validate3491 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_validate3494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSIONACT_in_ext_act3544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act3548 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_ext_act3550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOP_in_nop3594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_nop3596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace3639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_namespace3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_namespace3645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension3675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension3677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_extension3681 = new BitSet(new long[]{0x0000000000000008L,0x0000000010000000L});
    public static final BitSet FOLLOW_MUSTUND_in_extension3683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_imports3705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_imports3710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_imports3714 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020400L});
    public static final BitSet FOLLOW_ID_in_imports3719 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_viType_in_imports3722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MESSAGES_in_messages3741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_message_in_messages3743 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_MESSAGE_in_message3761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_message3763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLES_in_variables3782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variables3784 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_variable3800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variable3804 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000E00L});
    public static final BitSet FOLLOW_msgType_in_variable3808 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000C00L});
    public static final BitSet FOLLOW_viType_in_variable3813 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_viElt_in_variable3818 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_variable3823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTNERLINKS_in_partnerlinks3843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_partnerlink_in_partnerlinks3845 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_PID_in_partnerlink3859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_partnerlink3861 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3865 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3870 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3875 = new BitSet(new long[]{0x0000000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partnerlink3880 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORRSETS_in_corr_sets3899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets3903 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CORRSET_in_corr_set3917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_set3921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_corr_set3925 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_CORRELATION_in_correlation3943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation3947 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_CORR_MAP_in_corr_mapping3975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_mapping3977 = new BitSet(new long[]{0x0000000000000008L,0x00000000C0000000L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping3981 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping3986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_s_expr_in_expr4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_funct_call4112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funct_call4116 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_164_in_s_expr4146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4150 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_165_in_s_expr4163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4167 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_166_in_s_expr4180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4184 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_167_in_s_expr4197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4201 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_168_in_s_expr4214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4218 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_197_in_s_expr4231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4235 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_170_in_s_expr4248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4252 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_171_in_s_expr4265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4269 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_172_in_s_expr4282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4286 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_173_in_s_expr4299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4303 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_s_expr4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_s_expr4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_s_expr4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_expr4361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4365 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_NS_in_ns_id4401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ns_id4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_ns_id4410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORTTYPE_in_portType4445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_portType4447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STD_ATTR_in_std_attr4471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_std_attr4475 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_std_attr4480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGEX_in_msgEx4510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgEx4512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGTYPE_in_msgType4535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgType4537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VITYPE_in_viType4562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viType4564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VIELT_in_viElt4589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viElt4591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTNAME_in_faultName4614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultName4616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTELT_in_faultElt4639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultElt4641 = new BitSet(new long[]{0x0000000000000008L});

}