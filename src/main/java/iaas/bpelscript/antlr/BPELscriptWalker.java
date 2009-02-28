// $ANTLR 3.1b2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g 2009-02-28 20:24:50

/*
 * Copyright 2008-2009 Marc Bischof 
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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class BPELscriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "OPAQUE", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "FINAL", "BRANCH", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "EXPRLG", "QUERYLG", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "STRING", "OPAQUE_EXPR", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'process'", "'{'", "'}'", "'|'", "','", "'@name'", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'opaque()'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'", "'@expressionLanguage'", "'@exprLg'", "'@queryLanguage'", "'@queryLg'", "XML_EMPTY_ELEMENT", "XML_ELEMENT", "XML_ATTRIBUTE", "XML_NAME", "XML_ATTRIBUTE_VALUE", "XML_TEXT", "XML_WS", "XML_COMMENT", "XML_CDATA", "XML_PI", "'=>'"
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
    public static final int EVENTHDL=71;
    public static final int T__166=166;
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
    public static final int XML_PI=205;
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
    public static final int SJF=82;
    public static final int WAIT=22;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int CREATE_INST=86;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=108;
    public static final int T__129=129;
    public static final int SBO=90;
    public static final int EOSF=83;
    public static final int CALL=50;
    public static final int ELSIF=11;
    public static final int INVOKE=16;
    public static final int T__130=130;
    public static final int XML=60;
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
    public static final int ONALARM=69;
    public static final int T__206=206;
    public static final int EXT_EXPR=48;
    public static final int T__109=109;
    public static final int SIGNAL=40;
    public static final int QUERYLG=81;
    public static final int STD_ATTR=68;
    public static final int T__111=111;
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
    public static final int XML_ATTRIBUTE_VALUE=200;
    public static final int XML_ATTRIBUTE=198;
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
    public static final int XML_NAME=199;
    public static final int XML_WS=202;
    public static final int XML_CDATA=204;
    public static final int ONMESSAGE=31;
    public static final int EXIT=23;
    public static final int XML_ELEMENT=197;
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
    public static final int XML_EMPTY_ELEMENT=196;
    public static final int XML_COMMENT=203;
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
    public static final int XML_TEXT=201;
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
    public static final int MAP=43;
    public static final int ESCAPE_SEQ=105;
    public static final int VARIABLES=65;
    public static final int ASSIGN=20;
    public static final int XML_LITERAL=49;
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
    public String getGrammarFileName() { return "/home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g"; }


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



    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:155:1: program : ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls);
    public final BPELscriptWalker.program_return program() throws RecognitionException {
        BPELscriptWalker.program_return retval = new BPELscriptWalker.program_return();
        retval.start = input.LT(1);

        List list_decls=null;
        RuleReturnScope decls = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:156:2: ( ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:156:4: ^( ROOT (decls+= declaration )+ )
            {
            match(input,ROOT,FOLLOW_ROOT_in_program115); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:156:16: (decls+= declaration )+
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
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:156:16: decls+= declaration
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
            // 158:2: -> list(content_st=$decls)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:161:1: declaration : ( process -> decl(name_st=$process.st) | sub_declaration );
    public final BPELscriptWalker.declaration_return declaration() throws RecognitionException {
        BPELscriptWalker.declaration_return retval = new BPELscriptWalker.declaration_return();
        retval.start = input.LT(1);

        BPELscriptWalker.process_return process1 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:162:2: ( process -> decl(name_st=$process.st) | sub_declaration )
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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:162:4: process
                    {
                    pushFollow(FOLLOW_process_in_declaration148);
                    process1=process();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 162:12: -> decl(name_st=$process.st)
                    {
                        retval.st = templateLib.getInstanceOf("decl",
                      new STAttrMap().put("name_st", (process1!=null?process1.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:163:4: sub_declaration
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:166:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptWalker.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptWalker.sub_declaration_return retval = new BPELscriptWalker.sub_declaration_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:167:2: ( namespace | extension | imports )
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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:167:4: namespace
                    {
                    pushFollow(FOLLOW_namespace_in_sub_declaration175);
                    namespace();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:167:16: extension
                    {
                    pushFollow(FOLLOW_extension_in_sub_declaration179);
                    extension();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:167:28: imports
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:170:1: process : ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? ( queryLg )? ( exprLg )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLg.stexprLg=$exprLg.stsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s);
    public final BPELscriptWalker.process_return process() throws RecognitionException {
        BPELscriptWalker.process_return retval = new BPELscriptWalker.process_return();
        retval.start = input.LT(1);

        CommonTree SJF5=null;
        CommonTree EOSF6=null;
        List list_j=null;
        List list_s=null;
        BPELscriptWalker.ns_id_return ns = null;

        BPELscriptWalker.block_return block2 = null;

        BPELscriptWalker.queryLg_return queryLg3 = null;

        BPELscriptWalker.exprLg_return exprLg4 = null;

        BPELscriptWalker.eventHdl_return eventHdl7 = null;

        BPELscriptWalker.std_attr_return std_attr8 = null;

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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:181:2: ( ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? ( queryLg )? ( exprLg )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLg.stexprLg=$exprLg.stsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:181:4: ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? ( queryLg )? ( exprLg )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* )
            {
            match(input,PROCESS,FOLLOW_PROCESS_in_process200); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_process204);
            ns=ns_id();

            state._fsp--;

            pushFollow(FOLLOW_block_in_process206);
            block2=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:181:78: ( eventHdl )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EVENTHDL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:181:78: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process209);
                    eventHdl7=eventHdl();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:4: ( queryLg )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QUERYLG) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:4: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_process216);
                    queryLg3=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:13: ( exprLg )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXPRLG) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:13: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_process219);
                    exprLg4=exprLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:21: ( SJF )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SJF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:21: SJF
                    {
                    SJF5=(CommonTree)match(input,SJF,FOLLOW_SJF_in_process222); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:26: ( EOSF )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOSF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:26: EOSF
                    {
                    EOSF6=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_process225); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_process228);
            std_attr8=std_attr();

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:42: (j+= join )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==JOIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:42: j+= join
                    {
                    pushFollow(FOLLOW_join_in_process232);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:51: (s+= signal )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==SIGNAL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:182:51: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_process237);
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
            // 192:2: -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLg.stexprLg=$exprLg.stsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s)
            {
                retval.st = templateLib.getInstanceOf("process",
              new STAttrMap().put("name", (ns!=null?ns.nsloc:null)).put("tns", glob_ns.get((ns!=null?ns.nspre:null))).put("local", loc_ns).put("content_st", (block2!=null?block2.st:null)).put("queryLg", (queryLg3!=null?queryLg3.st:null)).put("exprLg", (exprLg4!=null?exprLg4.st:null)).put("sjf", SJF5).put("eOSF", EOSF6).put("exts", extensions).put("imports", imports).put("plinks_p", _pl).put("messages", _messages).put("vars", _vars).put("cors", _cs).put("faultHdl", _faults).put("faultHdl_pb", _faults_pb).put("eventHdl", (eventHdl7!=null?eventHdl7.st:null)).put("std_attr", (std_attr8!=null?std_attr8.st:null)).put("join", list_j).put("signal", list_s));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:200:1: proc_stmts[Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st);
    public final BPELscriptWalker.proc_stmts_return proc_stmts(Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmts_return retval = new BPELscriptWalker.proc_stmts_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.proc_stmt_return p = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:2: ( ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:4: ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] )
            {
            match(input,PROC_STMTS,FOLLOW_PROC_STMTS_in_proc_stmts408); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:18: (j+= join )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==JOIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:18: j+= join
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts412);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:27: (s+= signal )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SIGNAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:202:27: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts417);
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

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts422);
            p=proc_stmt(list_j, list_s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 203:2: -> list(content_st=$proc_stmt.st)
            {
                retval.st = templateLib.getInstanceOf("list",
              new STAttrMap().put("content_st", (p!=null?p.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:206:1: proc_stmt[List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, \n\t\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$until_ex.st) | foreach[join, signal, comments] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments] -> list(content_st=$try_ex.st) | scope_ex[join, signal, comments] -> list(content_st=$scope_ex.st) | receive[join, signal, empty, comments] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb, comments] -> list(content_st=$invoke.st) | reply[join, signal, empty, comments] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null, comments] -> list(content_st=$assign.st) | throw_ex[join, signal, empty, comments] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty, comments] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true, comments] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true, comments] -> list(content_st=$timeout.st) | exit[join, signal, empty, comments] -> list(content_st=$exit.st) | variables[_vars, isInScope, comments] | validate[join, signal, empty, _vars, comments] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope, comments] | compensate[join, signal, empty, comments] -> list(content_st=$compensate.st) | ext_act[join, signal, comments] -> list(content_st=$ext_act.st) | nop[join, signal, empty, comments] -> list(content_st=$nop.st) | messages[_messages, isInScope, comments] | corr_sets[_cs, isInScope, comments] | opaque[join, signal, empty, comments] -> list(content_st=$opaque.st));
    public final BPELscriptWalker.proc_stmt_return proc_stmt(List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmt_return retval = new BPELscriptWalker.proc_stmt_return();
        retval.start = input.LT(1);

        BPELscriptWalker.partnerlinks_return pl = null;

        BPELscriptWalker.pick_return pick9 = null;

        BPELscriptWalker.flow_return flow10 = null;

        BPELscriptWalker.if_ex_return if_ex11 = null;

        BPELscriptWalker.while_ex_return while_ex12 = null;

        BPELscriptWalker.until_ex_return until_ex13 = null;

        BPELscriptWalker.foreach_return foreach14 = null;

        BPELscriptWalker.try_ex_return try_ex15 = null;

        BPELscriptWalker.scope_ex_return scope_ex16 = null;

        BPELscriptWalker.receive_return receive17 = null;

        BPELscriptWalker.invoke_return invoke18 = null;

        BPELscriptWalker.reply_return reply19 = null;

        BPELscriptWalker.assign_return assign20 = null;

        BPELscriptWalker.throw_ex_return throw_ex21 = null;

        BPELscriptWalker.rethrow_ex_return rethrow_ex22 = null;

        BPELscriptWalker.alarm_return alarm23 = null;

        BPELscriptWalker.timeout_return timeout24 = null;

        BPELscriptWalker.exit_return exit25 = null;

        BPELscriptWalker.validate_return validate26 = null;

        BPELscriptWalker.compensate_return compensate27 = null;

        BPELscriptWalker.ext_act_return ext_act28 = null;

        BPELscriptWalker.nop_return nop29 = null;

        BPELscriptWalker.opaque_return opaque30 = null;


        boolean empty= join==null && signal==null;
        	List comments = getComments(retval);
        	if (comments!=null && !comments.isEmpty()) empty=false;
        	
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:212:2: ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$until_ex.st) | foreach[join, signal, comments] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments] -> list(content_st=$try_ex.st) | scope_ex[join, signal, comments] -> list(content_st=$scope_ex.st) | receive[join, signal, empty, comments] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb, comments] -> list(content_st=$invoke.st) | reply[join, signal, empty, comments] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null, comments] -> list(content_st=$assign.st) | throw_ex[join, signal, empty, comments] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty, comments] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true, comments] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true, comments] -> list(content_st=$timeout.st) | exit[join, signal, empty, comments] -> list(content_st=$exit.st) | variables[_vars, isInScope, comments] | validate[join, signal, empty, _vars, comments] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope, comments] | compensate[join, signal, empty, comments] -> list(content_st=$compensate.st) | ext_act[join, signal, comments] -> list(content_st=$ext_act.st) | nop[join, signal, empty, comments] -> list(content_st=$nop.st) | messages[_messages, isInScope, comments] | corr_sets[_cs, isInScope, comments] | opaque[join, signal, empty, comments] -> list(content_st=$opaque.st))
            int alt13=26;
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
            case OPAQUE:
                {
                alt13=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:212:4: pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_pick_in_proc_stmt453);
                    pick9=pick(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 212:82: -> list(content_st=$pick.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (pick9!=null?pick9.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:213:4: flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_flow_in_proc_stmt469);
                    flow10=flow(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 213:82: -> list(content_st=$flow.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (flow10!=null?flow10.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:214:4: if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_if_ex_in_proc_stmt485);
                    if_ex11=if_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 214:83: -> list(content_st=$if_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (if_ex11!=null?if_ex11.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:215:4: while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_while_ex_in_proc_stmt500);
                    while_ex12=while_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 215:86: -> list(content_st=$while_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (while_ex12!=null?while_ex12.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:216:4: until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_until_ex_in_proc_stmt516);
                    until_ex13=until_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 216:86: -> list(content_st=$until_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (until_ex13!=null?until_ex13.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:217:4: foreach[join, signal, comments]
                    {
                    pushFollow(FOLLOW_foreach_in_proc_stmt532);
                    foreach14=foreach(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 217:36: -> list(content_st=$foreach.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (foreach14!=null?foreach14.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:218:4: try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments]
                    {
                    pushFollow(FOLLOW_try_ex_in_proc_stmt547);
                    try_ex15=try_ex(_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 218:81: -> list(content_st=$try_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (try_ex15!=null?try_ex15.st:null)));
                    }


                    }
                    break;
                case 8 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:219:4: scope_ex[join, signal, comments]
                    {
                    pushFollow(FOLLOW_scope_ex_in_proc_stmt562);
                    scope_ex16=scope_ex(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 219:37: -> list(content_st=$scope_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (scope_ex16!=null?scope_ex16.st:null)));
                    }


                    }
                    break;
                case 9 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:220:4: receive[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_receive_in_proc_stmt577);
                    receive17=receive(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 220:43: -> list(content_st=$receive.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (receive17!=null?receive17.st:null)));
                    }


                    }
                    break;
                case 10 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:221:4: invoke[join, signal, empty, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_invoke_in_proc_stmt592);
                    invoke18=invoke(join, signal, empty, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 221:63: -> list(content_st=$invoke.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (invoke18!=null?invoke18.st:null)));
                    }


                    }
                    break;
                case 11 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:222:4: reply[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_reply_in_proc_stmt607);
                    reply19=reply(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 222:41: -> list(content_st=$reply.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (reply19!=null?reply19.st:null)));
                    }


                    }
                    break;
                case 12 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:223:4: assign[join, signal, empty, _vars, _pl, null, null, comments]
                    {
                    pushFollow(FOLLOW_assign_in_proc_stmt622);
                    assign20=assign(join, signal, empty, _vars, _pl, null, null, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 223:66: -> list(content_st=$assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (assign20!=null?assign20.st:null)));
                    }


                    }
                    break;
                case 13 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:224:4: throw_ex[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_throw_ex_in_proc_stmt638);
                    throw_ex21=throw_ex(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 224:44: -> list(content_st=$throw_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (throw_ex21!=null?throw_ex21.st:null)));
                    }


                    }
                    break;
                case 14 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:225:4: rethrow_ex[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_rethrow_ex_in_proc_stmt653);
                    rethrow_ex22=rethrow_ex(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 225:46: -> list(content_st=$rethrow_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (rethrow_ex22!=null?rethrow_ex22.st:null)));
                    }


                    }
                    break;
                case 15 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:226:4: alarm[join, signal, empty, true, comments]
                    {
                    pushFollow(FOLLOW_alarm_in_proc_stmt668);
                    alarm23=alarm(join, signal, empty, true, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 226:47: -> list(content_st=$alarm.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (alarm23!=null?alarm23.st:null)));
                    }


                    }
                    break;
                case 16 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:227:4: timeout[join, signal, empty, true, comments]
                    {
                    pushFollow(FOLLOW_timeout_in_proc_stmt684);
                    timeout24=timeout(join, signal, empty, true, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 227:49: -> list(content_st=$timeout.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (timeout24!=null?timeout24.st:null)));
                    }


                    }
                    break;
                case 17 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:228:4: exit[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_exit_in_proc_stmt700);
                    exit25=exit(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 228:41: -> list(content_st=$exit.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (exit25!=null?exit25.st:null)));
                    }


                    }
                    break;
                case 18 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:229:4: variables[_vars, isInScope, comments]
                    {
                    pushFollow(FOLLOW_variables_in_proc_stmt717);
                    variables(_vars, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:230:4: validate[join, signal, empty, _vars, comments]
                    {
                    pushFollow(FOLLOW_validate_in_proc_stmt724);
                    validate26=validate(join, signal, empty, _vars, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 230:51: -> list(content_st=$validate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (validate26!=null?validate26.st:null)));
                    }


                    }
                    break;
                case 20 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:231:4: pl= partnerlinks[_pl, isInScope, comments]
                    {
                    pushFollow(FOLLOW_partnerlinks_in_proc_stmt741);
                    pl=partnerlinks(_pl, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 21 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:232:4: compensate[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_compensate_in_proc_stmt748);
                    compensate27=compensate(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 232:46: -> list(content_st=$compensate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (compensate27!=null?compensate27.st:null)));
                    }


                    }
                    break;
                case 22 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:233:4: ext_act[join, signal, comments]
                    {
                    pushFollow(FOLLOW_ext_act_in_proc_stmt763);
                    ext_act28=ext_act(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 233:36: -> list(content_st=$ext_act.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (ext_act28!=null?ext_act28.st:null)));
                    }


                    }
                    break;
                case 23 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:234:4: nop[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_nop_in_proc_stmt778);
                    nop29=nop(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 234:39: -> list(content_st=$nop.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (nop29!=null?nop29.st:null)));
                    }


                    }
                    break;
                case 24 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:235:4: messages[_messages, isInScope, comments]
                    {
                    pushFollow(FOLLOW_messages_in_proc_stmt793);
                    messages(_messages, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 25 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:236:4: corr_sets[_cs, isInScope, comments]
                    {
                    pushFollow(FOLLOW_corr_sets_in_proc_stmt800);
                    corr_sets(_cs, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 26 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:237:4: opaque[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_opaque_in_proc_stmt806);
                    opaque30=opaque(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 237:42: -> list(content_st=$opaque.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (opaque30!=null?opaque30.st:null)));
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
    // $ANTLR end "proc_stmt"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:241:1: block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.block_return block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.block_return retval = new BPELscriptWalker.block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:243:2: ( ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:243:4: ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_block832); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:243:17: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:243:17: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block836);
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
            // 244:2: -> block(stmts_p=$ps)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:248:1: scope_block[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.scope_block_return scope_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.scope_block_return retval = new BPELscriptWalker.scope_block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:250:2: ( ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:250:4: ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_block865); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:250:15: ( sub_declaration )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NAMESPACE||LA15_0==EXTENSION||LA15_0==IMPORT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:250:15: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block867);
            	    sub_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:251:6: (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:251:6: ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block876);
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
            // 252:2: -> block(stmts_p=$ps)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:255:1: param_block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] returns [List param_ids] : ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps);
    public final BPELscriptWalker.param_block_return param_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.param_block_return retval = new BPELscriptWalker.param_block_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;
        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:2: ( ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:4: ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_param_block909); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:18: (ids+= ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:18: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_param_block913); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:26: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:258:26: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block918);
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
            // 262:2: -> block(ids=$idsstmts_p=$ps)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:265:1: body[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st));
    public final BPELscriptWalker.body_return body(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.body_return retval = new BPELscriptWalker.body_return();
        retval.start = input.LT(1);

        BPELscriptWalker.block_return block31 = null;

        BPELscriptWalker.proc_stmts_return proc_stmts32 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:267:2: ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st))
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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:267:4: block[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_block_in_body954);
                    block31=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 267:59: -> list(content_st=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (block31!=null?block31.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:268:5: proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb]
                    {
                    pushFollow(FOLLOW_proc_stmts_in_body971);
                    proc_stmts32=proc_stmts(false, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 268:66: -> list(content_st=$proc_stmts.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (proc_stmts32!=null?proc_stmts32.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:272:1: pick[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments] : ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? (name= STRING )? (sjf= SJF )? ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=std_attrcomments=$comments);
    public final BPELscriptWalker.pick_return pick(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.pick_return retval = new BPELscriptWalker.pick_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree CREATE_INST33=null;
        List list_om=null;
        List list_to=null;
        RuleReturnScope om = null;
        RuleReturnScope to = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:2: ( ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? (name= STRING )? (sjf= SJF )? ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=std_attrcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:4: ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? (name= STRING )? (sjf= SJF )? )
            {
            match(input,PICK,FOLLOW_PICK_in_pick996); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:13: (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:13: om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick1000);
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

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:77: (to+= onAlarm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ONALARM) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:77: to+= onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick1006);
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

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:88: ( CREATE_INST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CREATE_INST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:88: CREATE_INST
                    {
                    CREATE_INST33=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick1009); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:105: (name= STRING )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:105: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_pick1014); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:117: (sjf= SJF )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SJF) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:274:117: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_pick1019); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 279:2: -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=std_attrcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("pick",
              new STAttrMap().put("oms", list_om).put("onalarm", list_to).put("join", join).put("signal", signal).put("crt_inst", CREATE_INST33).put("std_attr", std_attr).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:282:1: onAlarm : ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st);
    public final BPELscriptWalker.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptWalker.onAlarm_return retval = new BPELscriptWalker.onAlarm_return();
        retval.start = input.LT(1);

        BPELscriptWalker.alarm_return alarm34 = null;

        BPELscriptWalker.timeout_return timeout35 = null;

        BPELscriptWalker.repeatEvery_return repeatEvery36 = null;

        BPELscriptWalker.scope_short_return scope_short37 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:2: ( ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:4: ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short )
            {
            match(input,ONALARM,FOLLOW_ONALARM_in_onAlarm1077); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:14: ( alarm[null, null, true, false, null] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ALARM) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:14: alarm[null, null, true, false, null]
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm1079);
                    alarm34=alarm(null, null, true, false, null);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:52: ( timeout[null, null, true, false, null] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==TIMEOUT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:52: timeout[null, null, true, false, null]
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm1083);
                    timeout35=timeout(null, null, true, false, null);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:92: ( repeatEvery )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==REPEATEVERY) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:283:92: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm1087);
                    repeatEvery36=repeatEvery();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onAlarm1090);
            scope_short37=scope_short();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 284:2: -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st)
            {
                retval.st = templateLib.getInstanceOf("onAlarm",
              new STAttrMap().put("alarm", (alarm34!=null?alarm34.st:null)).put("timeout", (timeout35!=null?timeout35.st:null)).put("repeat", (repeatEvery36!=null?repeatEvery36.st:null)).put("scope_ex", (scope_short37!=null?scope_short37.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:287:1: alarm[List join, List signal, Boolean empty, Boolean isWait, List comments] : ^( ALARM (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? ) -> wait(art=\"for\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.alarm_return alarm(List join, List signal, Boolean empty, Boolean isWait, List comments) throws RecognitionException {
        BPELscriptWalker.alarm_return retval = new BPELscriptWalker.alarm_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree op=null;
        List list_op=null;
        List list_e=null;
        BPELscriptWalker.queryLg_return queryLg38 = null;

        BPELscriptWalker.exprLg_return exprLg39 = null;

        RuleReturnScope e = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:2: ( ^( ALARM (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? ) -> wait(art=\"for\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:4: ^( ALARM (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? )
            {
            match(input,ALARM,FOLLOW_ALARM_in_alarm1138); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:13: (e+= expr[null] )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=170 && LA28_0<=174)||(LA28_0>=176 && LA28_0<=179)||LA28_0==206) ) {
                    alt28=1;
                }
                else if ( (LA28_0==EXT_EXPR||LA28_0==CALL||LA28_0==PATH||LA28_0==STRING||LA28_0==INT) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:13: e+= expr[null]
                        {
                        pushFollow(FOLLOW_expr_in_alarm1142);
                        e=expr(null);

                        state._fsp--;

                        if (list_e==null) list_e=new ArrayList();
                        list_e.add(e.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:29: (op+= OPAQUE_EXPR )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==OPAQUE_EXPR) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:29: op+= OPAQUE_EXPR
                        {
                        op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_alarm1148); 
                        if (list_op==null) list_op=new ArrayList();
                        list_op.add(op);


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:44: ( queryLg )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==QUERYLG) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:44: queryLg
                        {
                        pushFollow(FOLLOW_queryLg_in_alarm1151);
                        queryLg38=queryLg();

                        state._fsp--;


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:53: ( exprLg )?
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EXPRLG) ) {
                    alt31=1;
                }
                switch (alt31) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:53: exprLg
                        {
                        pushFollow(FOLLOW_exprLg_in_alarm1154);
                        exprLg39=exprLg();

                        state._fsp--;


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:65: (name= STRING )?
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==STRING) ) {
                    alt32=1;
                }
                switch (alt32) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:65: name= STRING
                        {
                        name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_alarm1159); 

                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:77: (sjf= SJF )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SJF) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:288:77: sjf= SJF
                        {
                        sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_alarm1164); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 293:2: -> wait(art=\"for\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "for").put("expr", list_e).put("opaque", list_op).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", std_attr).put("isWait", isWait).put("comments", comments).put("queryLg", (queryLg38!=null?queryLg38.st:null)).put("exprLg", (exprLg39!=null?exprLg39.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:297:1: timeout[List join, List signal, Boolean empty, Boolean isWait, List comments] : ^( TIMEOUT (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? ) -> wait(art=\"until\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.timeout_return timeout(List join, List signal, Boolean empty, Boolean isWait, List comments) throws RecognitionException {
        BPELscriptWalker.timeout_return retval = new BPELscriptWalker.timeout_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree op=null;
        List list_op=null;
        List list_e=null;
        BPELscriptWalker.queryLg_return queryLg40 = null;

        BPELscriptWalker.exprLg_return exprLg41 = null;

        RuleReturnScope e = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:2: ( ^( TIMEOUT (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? ) -> wait(art=\"until\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:4: ^( TIMEOUT (e+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? (name= STRING )? (sjf= SJF )? )
            {
            match(input,TIMEOUT,FOLLOW_TIMEOUT_in_timeout1249); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:15: (e+= expr[null] )?
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=170 && LA34_0<=174)||(LA34_0>=176 && LA34_0<=179)||LA34_0==206) ) {
                    alt34=1;
                }
                else if ( (LA34_0==EXT_EXPR||LA34_0==CALL||LA34_0==PATH||LA34_0==STRING||LA34_0==INT) ) {
                    alt34=1;
                }
                switch (alt34) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:15: e+= expr[null]
                        {
                        pushFollow(FOLLOW_expr_in_timeout1253);
                        e=expr(null);

                        state._fsp--;

                        if (list_e==null) list_e=new ArrayList();
                        list_e.add(e.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:31: (op+= OPAQUE_EXPR )?
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==OPAQUE_EXPR) ) {
                    alt35=1;
                }
                switch (alt35) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:31: op+= OPAQUE_EXPR
                        {
                        op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_timeout1259); 
                        if (list_op==null) list_op=new ArrayList();
                        list_op.add(op);


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:46: ( queryLg )?
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==QUERYLG) ) {
                    alt36=1;
                }
                switch (alt36) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:46: queryLg
                        {
                        pushFollow(FOLLOW_queryLg_in_timeout1262);
                        queryLg40=queryLg();

                        state._fsp--;


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:55: ( exprLg )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==EXPRLG) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:55: exprLg
                        {
                        pushFollow(FOLLOW_exprLg_in_timeout1265);
                        exprLg41=exprLg();

                        state._fsp--;


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:67: (name= STRING )?
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==STRING) ) {
                    alt38=1;
                }
                switch (alt38) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:67: name= STRING
                        {
                        name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_timeout1270); 

                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:78: (sjf= SJF )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SJF) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:298:78: sjf= SJF
                        {
                        sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_timeout1274); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 303:2: -> wait(art=\"until\"expr=$eopaque=$opjoin=$joinsignal=$signalempty=$emptystd_attr=std_attrisWait=isWaitcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "until").put("expr", list_e).put("opaque", list_op).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", std_attr).put("isWait", isWait).put("comments", comments).put("queryLg", (queryLg40!=null?queryLg40.st:null)).put("exprLg", (exprLg41!=null?exprLg41.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:307:1: repeatEvery : ^( REPEATEVERY (e+= expr[null] )? (op+= OPAQUE_EXPR )? ) -> wait(art=\"repeatEvery\"expr=$eopaque=$opskip=\"true\");
    public final BPELscriptWalker.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptWalker.repeatEvery_return retval = new BPELscriptWalker.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree op=null;
        List list_op=null;
        List list_e=null;
        RuleReturnScope e = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:2: ( ^( REPEATEVERY (e+= expr[null] )? (op+= OPAQUE_EXPR )? ) -> wait(art=\"repeatEvery\"expr=$eopaque=$opskip=\"true\"))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:4: ^( REPEATEVERY (e+= expr[null] )? (op+= OPAQUE_EXPR )? )
            {
            match(input,REPEATEVERY,FOLLOW_REPEATEVERY_in_repeatEvery1355); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:19: (e+= expr[null] )?
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==EXT_EXPR||LA40_0==CALL||LA40_0==PATH||LA40_0==STRING||LA40_0==INT||(LA40_0>=170 && LA40_0<=174)||(LA40_0>=176 && LA40_0<=179)||LA40_0==206) ) {
                    alt40=1;
                }
                switch (alt40) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:19: e+= expr[null]
                        {
                        pushFollow(FOLLOW_expr_in_repeatEvery1359);
                        e=expr(null);

                        state._fsp--;

                        if (list_e==null) list_e=new ArrayList();
                        list_e.add(e.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:35: (op+= OPAQUE_EXPR )?
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==OPAQUE_EXPR) ) {
                    alt41=1;
                }
                switch (alt41) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:308:35: op+= OPAQUE_EXPR
                        {
                        op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_repeatEvery1365); 
                        if (list_op==null) list_op=new ArrayList();
                        list_op.add(op);


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 309:2: -> wait(art=\"repeatEvery\"expr=$eopaque=$opskip=\"true\")
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "repeatEvery").put("expr", list_e).put("opaque", list_op).put("skip", "true"));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:312:1: onMessage[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st);
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:314:9: ( ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:314:12: ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? )
            {
            match(input,ONMESSAGE,FOLLOW_ONMESSAGE_in_onMessage1414); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_param_block_in_onMessage1418);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:13: (pt= portType )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==PORTTYPE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:13: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage1434);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:27: (mex= msgEx )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==MSGEX) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:27: mex= msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage1439);
                    mex=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1444); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1448); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:49: (corr= correlation )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==CORRELATION) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:49: corr= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onMessage1452);
                    corr=correlation();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:64: (w= with_ex )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WITH) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:315:64: w= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage1457);
                    w=with_ex();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 316:9: -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:320:1: flow[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.flow_return flow(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.flow_return retval = new BPELscriptWalker.flow_return();
        retval.start = input.LT(1);

        List list_s=null;
        BPELscriptWalker.std_attr_return std_attr42 = null;

        RuleReturnScope s = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:322:2: ( ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:322:5: ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow1552); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:322:13: (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SEQUENCE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:322:13: s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_sequence_in_flow1556);
            	    s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            pushFollow(FOLLOW_std_attr_in_flow1560);
            std_attr42=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 323:2: -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("flow",
              new STAttrMap().put("sequence", list_s).put("join", join).put("signal", signal).put("std_attr", (std_attr42!=null?std_attr42.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:326:1: if_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( IF (iex+= expr[null] )? (iop+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF (eiex+= expr[null] )? (eiop+= OPAQUE_EXPR )? sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> if_ex(iex=$iexiop=$iopseq=$s.steiex=$eiexeiop=$eiopseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.if_ex_return if_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.if_ex_return retval = new BPELscriptWalker.if_ex_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree iop=null;
        CommonTree eiop=null;
        List list_iop=null;
        List list_eiop=null;
        List list_iex=null;
        List list_eiex=null;
        List list_sie=null;
        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.sequence_return se = null;

        BPELscriptWalker.queryLg_return queryLg43 = null;

        BPELscriptWalker.exprLg_return exprLg44 = null;

        RuleReturnScope iex = null;
        RuleReturnScope eiex = null;
        RuleReturnScope sie = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:2: ( ^( IF (iex+= expr[null] )? (iop+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF (eiex+= expr[null] )? (eiop+= OPAQUE_EXPR )? sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> if_ex(iex=$iexiop=$iopseq=$s.steiex=$eiexeiop=$eiopseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:5: ^( IF (iex+= expr[null] )? (iop+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF (eiex+= expr[null] )? (eiop+= OPAQUE_EXPR )? sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? )
            {
            match(input,IF,FOLLOW_IF_in_if_ex1605); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:13: (iex+= expr[null] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EXT_EXPR||LA47_0==CALL||LA47_0==PATH||LA47_0==STRING||LA47_0==INT||(LA47_0>=170 && LA47_0<=174)||(LA47_0>=176 && LA47_0<=179)||LA47_0==206) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:13: iex+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_if_ex1609);
                    iex=expr(null);

                    state._fsp--;

                    if (list_iex==null) list_iex=new ArrayList();
                    list_iex.add(iex.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:30: (iop+= OPAQUE_EXPR )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==OPAQUE_EXPR) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:328:30: iop+= OPAQUE_EXPR
                    {
                    iop=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1615); 
                    if (list_iop==null) list_iop=new ArrayList();
                    list_iop.add(iop);


                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_if_ex1620);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:3: ( ^( ELSIF (eiex+= expr[null] )? (eiop+= OPAQUE_EXPR )? sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==ELSIF) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:4: ^( ELSIF (eiex+= expr[null] )? (eiop+= OPAQUE_EXPR )? sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_if_ex1628); 

            	    match(input, Token.DOWN, null); 
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:16: (eiex+= expr[null] )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==EXT_EXPR||LA49_0==CALL||LA49_0==PATH||LA49_0==STRING||LA49_0==INT||(LA49_0>=170 && LA49_0<=174)||(LA49_0>=176 && LA49_0<=179)||LA49_0==206) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:16: eiex+= expr[null]
            	            {
            	            pushFollow(FOLLOW_expr_in_if_ex1632);
            	            eiex=expr(null);

            	            state._fsp--;

            	            if (list_eiex==null) list_eiex=new ArrayList();
            	            list_eiex.add(eiex.getTemplate());


            	            }
            	            break;

            	    }

            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:34: (eiop+= OPAQUE_EXPR )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==OPAQUE_EXPR) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:329:34: eiop+= OPAQUE_EXPR
            	            {
            	            eiop=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1638); 
            	            if (list_eiop==null) list_eiop=new ArrayList();
            	            list_eiop.add(eiop);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_sequence_in_if_ex1643);
            	    sie=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            	    state._fsp--;

            	    if (list_sie==null) list_sie=new ArrayList();
            	    list_sie.add(sie.getTemplate());


            	    match(input, Token.UP, null); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:3: ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELSE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:4: ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_if_ex1654); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_sequence_in_if_ex1658);
                    se=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:79: (name= STRING )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==STRING) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:79: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_if_ex1666); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:91: (sjf= SJF )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==SJF) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:91: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_if_ex1671); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:97: ( queryLg )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==QUERYLG) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:97: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_if_ex1674);
                    queryLg43=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:106: ( exprLg )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EXPRLG) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:330:106: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_if_ex1677);
                    exprLg44=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

                    		String std_attr =templateLib.getInstanceOf("std_attr",
                          new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 336:2: -> if_ex(iex=$iexiop=$iopseq=$s.steiex=$eiexeiop=$eiopseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("if_ex",
              new STAttrMap().put("iex", list_iex).put("iop", list_iop).put("seq", (s!=null?s.st:null)).put("eiex", list_eiex).put("eiop", list_eiop).put("seqei", list_sie).put("seqe", (se!=null?se.st:null)).put("join", join).put("signal", signal).put("std_attr", std_attr).put("comments", comments).put("queryLg", (queryLg43!=null?queryLg43.st:null)).put("exprLg", (exprLg44!=null?exprLg44.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:340:1: signal : ^( SIGNAL ID (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) -> source(source=$ID.texttrans=$expempty=emptyopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.signal_return signal() throws RecognitionException {
        BPELscriptWalker.signal_return retval = new BPELscriptWalker.signal_return();
        retval.start = input.LT(1);

        CommonTree ID45=null;
        CommonTree op=null;
        List list_op=null;
        List list_exp=null;
        BPELscriptWalker.queryLg_return queryLg46 = null;

        BPELscriptWalker.exprLg_return exprLg47 = null;

        RuleReturnScope exp = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:2: ( ^( SIGNAL ID (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) -> source(source=$ID.texttrans=$expempty=emptyopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:4: ^( SIGNAL ID (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
            {
            match(input,SIGNAL,FOLLOW_SIGNAL_in_signal1768); 

            match(input, Token.DOWN, null); 
            ID45=(CommonTree)match(input,ID,FOLLOW_ID_in_signal1770); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:19: (exp+= expr[null] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EXT_EXPR||LA57_0==CALL||LA57_0==PATH||LA57_0==STRING||LA57_0==INT||(LA57_0>=170 && LA57_0<=174)||(LA57_0>=176 && LA57_0<=179)||LA57_0==206) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:19: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_signal1774);
                    exp=expr(null);

                    state._fsp--;

                    if (list_exp==null) list_exp=new ArrayList();
                    list_exp.add(exp.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:35: (op+= OPAQUE_EXPR )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==OPAQUE_EXPR) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:35: op+= OPAQUE_EXPR
                    {
                    op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_signal1780); 
                    if (list_op==null) list_op=new ArrayList();
                    list_op.add(op);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:50: ( queryLg )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==QUERYLG) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:50: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_signal1783);
                    queryLg46=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:59: ( exprLg )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==EXPRLG) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:341:59: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_signal1786);
                    exprLg47=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            //signals whether transitionCondition id null or not to provide a shortcut in template if empty
            		Boolean empty=exp==null && op==null; 
            	


            // TEMPLATE REWRITE
            // 345:2: -> source(source=$ID.texttrans=$expempty=emptyopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("source",
              new STAttrMap().put("source", (ID45!=null?ID45.getText():null)).put("trans", list_exp).put("empty", empty).put("opaque", list_op).put("queryLg", (queryLg46!=null?queryLg46.st:null)).put("exprLg", (exprLg47!=null?exprLg47.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:348:1: join : ^( JOIN (ids+= ID )+ (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) -> std_elt(target=$idsjoin=$expopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.join_return join() throws RecognitionException {
        BPELscriptWalker.join_return retval = new BPELscriptWalker.join_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        CommonTree op=null;
        List list_ids=null;
        List list_op=null;
        List list_exp=null;
        BPELscriptWalker.queryLg_return queryLg48 = null;

        BPELscriptWalker.exprLg_return exprLg49 = null;

        RuleReturnScope exp = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:2: ( ^( JOIN (ids+= ID )+ (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) -> std_elt(target=$idsjoin=$expopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:4: ^( JOIN (ids+= ID )+ (exp+= expr[null] )? (op+= OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
            {
            match(input,JOIN,FOLLOW_JOIN_in_join1839); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:14: (ids+= ID )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_join1843); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:23: (exp+= expr[null] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==EXT_EXPR||LA62_0==CALL||LA62_0==PATH||LA62_0==STRING||LA62_0==INT||(LA62_0>=170 && LA62_0<=174)||(LA62_0>=176 && LA62_0<=179)||LA62_0==206) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:23: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_join1848);
                    exp=expr(null);

                    state._fsp--;

                    if (list_exp==null) list_exp=new ArrayList();
                    list_exp.add(exp.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:39: (op+= OPAQUE_EXPR )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==OPAQUE_EXPR) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:39: op+= OPAQUE_EXPR
                    {
                    op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_join1854); 
                    if (list_op==null) list_op=new ArrayList();
                    list_op.add(op);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:54: ( queryLg )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==QUERYLG) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:54: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_join1857);
                    queryLg48=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:63: ( exprLg )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==EXPRLG) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:349:63: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_join1860);
                    exprLg49=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 350:2: -> std_elt(target=$idsjoin=$expopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("std_elt",
              new STAttrMap().put("target", list_ids).put("join", list_exp).put("opaque", list_op).put("queryLg", (queryLg48!=null?queryLg48.st:null)).put("exprLg", (exprLg49!=null?exprLg49.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:353:1: sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments);
    public final BPELscriptWalker.sequence_return sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.sequence_return retval = new BPELscriptWalker.sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.body_return b = null;

        BPELscriptWalker.std_attr_return std_attr50 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        List comments = getComments(retval);
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:2: ( ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:4: ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequence1911); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:16: (j+= join )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==JOIN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_sequence1915);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_sequence1920);
            b=body(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:81: (s+= signal )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==SIGNAL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:356:81: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_sequence1925);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            pushFollow(FOLLOW_std_attr_in_sequence1928);
            std_attr50=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 357:2: -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments)
            {
                retval.st = templateLib.getInstanceOf("sequence",
              new STAttrMap().put("content", (b!=null?b.st:null)).put("join", list_j).put("signal", list_s).put("std_attr", (std_attr50!=null?std_attr50.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:361:1: scope_sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\t HashMap<String, String> _cs,HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, StringTemplate handler] : ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler);
    public final BPELscriptWalker.scope_sequence_return scope_sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, StringTemplate handler) throws RecognitionException {
        BPELscriptWalker.scope_sequence_return retval = new BPELscriptWalker.scope_sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.scope_block_return b = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:2: ( ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:4: ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_sequence1973); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:16: (j+= join )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==JOIN) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_scope_sequence1977);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_block_in_scope_sequence1982);
            b=scope_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:88: (s+= signal )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==SIGNAL) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:363:88: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_scope_sequence1987);
            	    s=signal();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 364:2: -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:368:1: while_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( WHILE (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> while(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.while_ex_return while_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.while_ex_return retval = new BPELscriptWalker.while_ex_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree op=null;
        List list_op=null;
        List list_e=null;
        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.queryLg_return queryLg51 = null;

        BPELscriptWalker.exprLg_return exprLg52 = null;

        RuleReturnScope e = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:2: ( ^( WHILE (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> while(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:4: ^( WHILE (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_ex2061); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:13: (e+= expr[null] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EXT_EXPR||LA70_0==CALL||LA70_0==PATH||LA70_0==STRING||LA70_0==INT||(LA70_0>=170 && LA70_0<=174)||(LA70_0>=176 && LA70_0<=179)||LA70_0==206) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:13: e+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_while_ex2065);
                    e=expr(null);

                    state._fsp--;

                    if (list_e==null) list_e=new ArrayList();
                    list_e.add(e.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:29: (op+= OPAQUE_EXPR )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==OPAQUE_EXPR) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:29: op+= OPAQUE_EXPR
                    {
                    op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_while_ex2071); 
                    if (list_op==null) list_op=new ArrayList();
                    list_op.add(op);


                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_while_ex2076);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:108: (name= STRING )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==STRING) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:108: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_while_ex2081); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:120: (sjf= SJF )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==SJF) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:120: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_while_ex2086); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:126: ( queryLg )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==QUERYLG) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:126: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_while_ex2089);
                    queryLg51=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:135: ( exprLg )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EXPRLG) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:370:135: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_while_ex2092);
                    exprLg52=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 376:2: -> while(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("while",
              new STAttrMap().put("expr_st", list_e).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", std_attr).put("comments", comments).put("opaque", list_op).put("queryLg", (queryLg51!=null?queryLg51.st:null)).put("exprLg", (exprLg52!=null?exprLg52.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:379:1: until_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( UNTIL (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> until(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.until_ex_return until_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.until_ex_return retval = new BPELscriptWalker.until_ex_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree op=null;
        List list_op=null;
        List list_e=null;
        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.queryLg_return queryLg53 = null;

        BPELscriptWalker.exprLg_return exprLg54 = null;

        RuleReturnScope e = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:2: ( ^( UNTIL (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> until(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:4: ^( UNTIL (e+= expr[null] )? (op+= OPAQUE_EXPR )? s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? )
            {
            match(input,UNTIL,FOLLOW_UNTIL_in_until_ex2161); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:13: (e+= expr[null] )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EXT_EXPR||LA76_0==CALL||LA76_0==PATH||LA76_0==STRING||LA76_0==INT||(LA76_0>=170 && LA76_0<=174)||(LA76_0>=176 && LA76_0<=179)||LA76_0==206) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:13: e+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_until_ex2165);
                    e=expr(null);

                    state._fsp--;

                    if (list_e==null) list_e=new ArrayList();
                    list_e.add(e.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:29: (op+= OPAQUE_EXPR )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==OPAQUE_EXPR) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:29: op+= OPAQUE_EXPR
                    {
                    op=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_until_ex2171); 
                    if (list_op==null) list_op=new ArrayList();
                    list_op.add(op);


                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_until_ex2176);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:108: (name= STRING )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==STRING) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:108: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_until_ex2181); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:120: (sjf= SJF )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==SJF) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:120: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_until_ex2186); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:126: ( queryLg )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==QUERYLG) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:126: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_until_ex2189);
                    queryLg53=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:135: ( exprLg )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==EXPRLG) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:381:135: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_until_ex2192);
                    exprLg54=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 387:2: -> until(expr_st=$ebody_st=$s.stjoin=$joinsignal=$signalstd_attr=std_attrcomments=$commentsopaque=$opqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("until",
              new STAttrMap().put("expr_st", list_e).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", std_attr).put("comments", comments).put("opaque", list_op).put("queryLg", (queryLg53!=null?queryLg53.st:null)).put("exprLg", (exprLg54!=null?exprLg54.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:390:1: foreach[List join, List signal, List comments] : ^( FOR cName= ID (init+= expr[null] )? (initop+= OPAQUE_EXPR )? ( ^( FINAL (cond+= expr[null] )? (condop+= OPAQUE_EXPR )? ) )? ( ^( BRANCH (complete+= expr[null] )? (comop+= OPAQUE_EXPR )? ) )? scope_short ( PARALLEL )? ( SBO )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> foreach(id=$cNameinit_st=$initinitop=$initopcond_st=$condcondop=$condopcomplete=$completecomop=$comopbody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=std_attrparallel=$PARALLELsbo=$SBOcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st);
    public final BPELscriptWalker.foreach_return foreach(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.foreach_return retval = new BPELscriptWalker.foreach_return();
        retval.start = input.LT(1);

        CommonTree cName=null;
        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree PARALLEL56=null;
        CommonTree SBO57=null;
        CommonTree initop=null;
        CommonTree condop=null;
        CommonTree comop=null;
        List list_initop=null;
        List list_condop=null;
        List list_comop=null;
        List list_init=null;
        List list_cond=null;
        List list_complete=null;
        BPELscriptWalker.scope_short_return scope_short55 = null;

        BPELscriptWalker.queryLg_return queryLg58 = null;

        BPELscriptWalker.exprLg_return exprLg59 = null;

        RuleReturnScope init = null;
        RuleReturnScope cond = null;
        RuleReturnScope complete = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:2: ( ^( FOR cName= ID (init+= expr[null] )? (initop+= OPAQUE_EXPR )? ( ^( FINAL (cond+= expr[null] )? (condop+= OPAQUE_EXPR )? ) )? ( ^( BRANCH (complete+= expr[null] )? (comop+= OPAQUE_EXPR )? ) )? scope_short ( PARALLEL )? ( SBO )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? ) -> foreach(id=$cNameinit_st=$initinitop=$initopcond_st=$condcondop=$condopcomplete=$completecomop=$comopbody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=std_attrparallel=$PARALLELsbo=$SBOcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:4: ^( FOR cName= ID (init+= expr[null] )? (initop+= OPAQUE_EXPR )? ( ^( FINAL (cond+= expr[null] )? (condop+= OPAQUE_EXPR )? ) )? ( ^( BRANCH (complete+= expr[null] )? (comop+= OPAQUE_EXPR )? ) )? scope_short ( PARALLEL )? ( SBO )? (name= STRING )? (sjf= SJF )? ( queryLg )? ( exprLg )? )
            {
            match(input,FOR,FOLLOW_FOR_in_foreach2262); 

            match(input, Token.DOWN, null); 
            cName=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach2266); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:23: (init+= expr[null] )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EXT_EXPR||LA82_0==CALL||LA82_0==PATH||LA82_0==STRING||LA82_0==INT||(LA82_0>=170 && LA82_0<=174)||(LA82_0>=176 && LA82_0<=179)||LA82_0==206) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:23: init+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_foreach2270);
                    init=expr(null);

                    state._fsp--;

                    if (list_init==null) list_init=new ArrayList();
                    list_init.add(init.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:43: (initop+= OPAQUE_EXPR )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==OPAQUE_EXPR) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:391:43: initop+= OPAQUE_EXPR
                    {
                    initop=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2276); 
                    if (list_initop==null) list_initop=new ArrayList();
                    list_initop.add(initop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:4: ( ^( FINAL (cond+= expr[null] )? (condop+= OPAQUE_EXPR )? ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FINAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:5: ^( FINAL (cond+= expr[null] )? (condop+= OPAQUE_EXPR )? )
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_foreach2284); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:17: (cond+= expr[null] )?
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==EXT_EXPR||LA84_0==CALL||LA84_0==PATH||LA84_0==STRING||LA84_0==INT||(LA84_0>=170 && LA84_0<=174)||(LA84_0>=176 && LA84_0<=179)||LA84_0==206) ) {
                            alt84=1;
                        }
                        switch (alt84) {
                            case 1 :
                                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:17: cond+= expr[null]
                                {
                                pushFollow(FOLLOW_expr_in_foreach2288);
                                cond=expr(null);

                                state._fsp--;

                                if (list_cond==null) list_cond=new ArrayList();
                                list_cond.add(cond.getTemplate());


                                }
                                break;

                        }

                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:37: (condop+= OPAQUE_EXPR )?
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==OPAQUE_EXPR) ) {
                            alt85=1;
                        }
                        switch (alt85) {
                            case 1 :
                                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:392:37: condop+= OPAQUE_EXPR
                                {
                                condop=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2294); 
                                if (list_condop==null) list_condop=new ArrayList();
                                list_condop.add(condop);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:4: ( ^( BRANCH (complete+= expr[null] )? (comop+= OPAQUE_EXPR )? ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==BRANCH) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:5: ^( BRANCH (complete+= expr[null] )? (comop+= OPAQUE_EXPR )? )
                    {
                    match(input,BRANCH,FOLLOW_BRANCH_in_foreach2306); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:22: (complete+= expr[null] )?
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==EXT_EXPR||LA87_0==CALL||LA87_0==PATH||LA87_0==STRING||LA87_0==INT||(LA87_0>=170 && LA87_0<=174)||(LA87_0>=176 && LA87_0<=179)||LA87_0==206) ) {
                            alt87=1;
                        }
                        switch (alt87) {
                            case 1 :
                                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:22: complete+= expr[null]
                                {
                                pushFollow(FOLLOW_expr_in_foreach2310);
                                complete=expr(null);

                                state._fsp--;

                                if (list_complete==null) list_complete=new ArrayList();
                                list_complete.add(complete.getTemplate());


                                }
                                break;

                        }

                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:41: (comop+= OPAQUE_EXPR )?
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==OPAQUE_EXPR) ) {
                            alt88=1;
                        }
                        switch (alt88) {
                            case 1 :
                                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:393:41: comop+= OPAQUE_EXPR
                                {
                                comop=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2316); 
                                if (list_comop==null) list_comop=new ArrayList();
                                list_comop.add(comop);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_foreach2325);
            scope_short55=scope_short();

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:16: ( PARALLEL )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==PARALLEL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:16: PARALLEL
                    {
                    PARALLEL56=(CommonTree)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach2327); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:26: ( SBO )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==SBO) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:26: SBO
                    {
                    SBO57=(CommonTree)match(input,SBO,FOLLOW_SBO_in_foreach2330); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:35: (name= STRING )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==STRING) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:35: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_foreach2335); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:47: (sjf= SJF )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==SJF) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:47: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_foreach2340); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:53: ( queryLg )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==QUERYLG) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:53: queryLg
                    {
                    pushFollow(FOLLOW_queryLg_in_foreach2343);
                    queryLg58=queryLg();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:62: ( exprLg )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==EXPRLG) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:394:62: exprLg
                    {
                    pushFollow(FOLLOW_exprLg_in_foreach2346);
                    exprLg59=exprLg();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	


            // TEMPLATE REWRITE
            // 399:2: -> foreach(id=$cNameinit_st=$initinitop=$initopcond_st=$condcondop=$condopcomplete=$completecomop=$comopbody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=std_attrparallel=$PARALLELsbo=$SBOcomments=$commentsqueryLg=$queryLg.stexprLg=$exprLg.st)
            {
                retval.st = templateLib.getInstanceOf("foreach",
              new STAttrMap().put("id", cName).put("init_st", list_init).put("initop", list_initop).put("cond_st", list_cond).put("condop", list_condop).put("complete", list_complete).put("comop", list_comop).put("body_st", (scope_short55!=null?scope_short55.st:null)).put("join", join).put("signal", signal).put("std_attr", std_attr).put("parallel", PARALLEL56).put("sbo", SBO57).put("comments", comments).put("queryLg", (queryLg58!=null?queryLg58.st:null)).put("exprLg", (exprLg59!=null?exprLg59.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:406:1: try_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope, List comments] : ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c);
    public final BPELscriptWalker.try_ex_return try_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.try_ex_return retval = new BPELscriptWalker.try_ex_return();
        retval.start = input.LT(1);

        List list_cls=null;
        List list_c=null;
        RuleReturnScope cls = null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:2: ( ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:4: ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? )
            {
            match(input,TRY,FOLLOW_TRY_in_try_ex2462); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:13: (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==CATCH) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:13: cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope]
                	    {
                	    pushFollow(FOLLOW_catch_ex_in_try_ex2466);
                	    cls=catch_ex(_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope);

                	    state._fsp--;

                	    if (list_cls==null) list_cls=new ArrayList();
                	    list_cls.add(cls.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:86: (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )?
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==SEQUENCE||LA97_0==PROC_STMTS) ) {
                    alt97=1;
                }
                switch (alt97) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:408:86: c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                        {
                        pushFollow(FOLLOW_body_in_try_ex2472);
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
            // 409:2: -> list(content_st=$c)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:412:1: catch_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope] : ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) ;
    public final BPELscriptWalker.catch_ex_return catch_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.catch_ex_return retval = new BPELscriptWalker.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree fMT=null;
        BPELscriptWalker.param_block_return pb = null;

        BPELscriptWalker.ns_id_return ns_id60 = null;

        BPELscriptWalker.faultElt_return faultElt61 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:2: ( ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:4: ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catch_ex2504); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:12: ( ns_id )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==NS) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:12: ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_catch_ex2506);
                    ns_id60=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_catch_ex2511);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:86: (fMT= STRING )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==STRING) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:86: fMT= STRING
                    {
                    fMT=(CommonTree)match(input,STRING,FOLLOW_STRING_in_catch_ex2516); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:95: ( faultElt )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==FAULTELT) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:414:95: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex2519);
                    faultElt61=faultElt();

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
            		if((ns_id60!=null?ns_id60.nspre:null)!=null) 
            			faultName+=(ns_id60!=null?ns_id60.nspre:null)+":";
            		if ((ns_id60!=null?ns_id60.nsloc:null)!=null)			
            			faultName+=(ns_id60!=null?ns_id60.nsloc:null);
            		else
            			faultName=null;
            		// 2)
            		String attributes = "";
            		
            		/*
            		 * the handling of faultElt differs from fMT because of trouble with ANTLR itself.
            		 * when done this like fMT, the behavior was to write "faultMessageType='faultElementName'"
            		 */
            		if ((pb!=null?pb.param_ids:null)!=null) attributes+="\n       faultVariable=\""+(pb!=null?pb.param_ids:null).get(0)+"\"";
            		if ((fMT!=null?fMT.getText():null)!=null) attributes+="\n       faultMessageType="+(fMT!=null?fMT.getText():null).replaceFirst(":", "");
            		if ((faultElt61!=null?faultElt61.st:null)!=null) attributes+=(faultElt61!=null?faultElt61.st:null);
            		// 3)
            		Boolean definedIn = _faults.containsKey(faultName);
            				
            		if (faultName != null && definedIn) {
            			throwDefinedWarning("exception", (ns_id60!=null?ns_id60.locID:null));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:458:1: scope_ex[List join, List signal, List comments] : ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments);
    public final BPELscriptWalker.scope_ex_return scope_ex(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.scope_ex_return retval = new BPELscriptWalker.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree ISOLATED62=null;
        CommonTree EOSF63=null;
        CommonTree SJF64=null;
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:2: ( ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:4: ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_ex2546); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:14: (id+= ID )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ID) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:14: id+= ID
                    {
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_scope_ex2550); 
                    if (list_id==null) list_id=new ArrayList();
                    list_id.add(id);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_stmt_in_scope_ex2555);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_ex2560);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:119: ( ISOLATED )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ISOLATED) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:119: ISOLATED
                    {
                    ISOLATED62=(CommonTree)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex2563); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:129: ( EOSF )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==EOSF) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:129: EOSF
                    {
                    EOSF63=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_scope_ex2566); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:135: ( SJF )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==SJF) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:467:135: SJF
                    {
                    SJF64=(CommonTree)match(input,SJF,FOLLOW_SJF_in_scope_ex2569); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 468:2: -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("scope_ex",
              new STAttrMap().put("id_opt", list_id).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("isolated", ISOLATED62).put("eosf", EOSF63).put("std_attr", (SJF64!=null?SJF64.getText():null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:471:1: scope_short : ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st);
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:480:2: ( ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:480:4: ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_short2636); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scope_stmt_in_scope_short2640);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_short2644);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 481:2: -> scope_ex(body_st=$s.st)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:485:1: scope_stmt : ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c);
    public final BPELscriptWalker.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptWalker.scope_stmt_return retval = new BPELscriptWalker.scope_stmt_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:2: ( ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:4: ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_stmt2670); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:13: (c+= compensation )?
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==COMPENSATION) ) {
                    alt105=1;
                }
                switch (alt105) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:13: c+= compensation
                        {
                        pushFollow(FOLLOW_compensation_in_scope_stmt2674);
                        c=compensation();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:30: (c+= termination )?
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==TERMINATION) ) {
                    alt106=1;
                }
                switch (alt106) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:30: c+= termination
                        {
                        pushFollow(FOLLOW_termination_in_scope_stmt2679);
                        c=termination();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:46: (c+= eventHdl )?
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==EVENTHDL) ) {
                    alt107=1;
                }
                switch (alt107) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:486:46: c+= eventHdl
                        {
                        pushFollow(FOLLOW_eventHdl_in_scope_stmt2684);
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
            // 487:2: -> list(content_st=$c)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:490:1: termination : ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st);
    public final BPELscriptWalker.termination_return termination() throws RecognitionException {
        BPELscriptWalker.termination_return retval = new BPELscriptWalker.termination_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body65 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:491:2: ( ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:491:4: ^( TERMINATION body[null, null, null, null,null,null] )
            {
            match(input,TERMINATION,FOLLOW_TERMINATION_in_termination2710); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_termination2712);
            body65=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 491:58: -> termination(body=$body.st)
            {
                retval.st = templateLib.getInstanceOf("termination",
              new STAttrMap().put("body", (body65!=null?body65.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:494:1: eventHdl : ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c);
    public final BPELscriptWalker.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptWalker.eventHdl_return retval = new BPELscriptWalker.eventHdl_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:2: ( ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:4: ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* )
            {
            match(input,EVENTHDL,FOLLOW_EVENTHDL_in_eventHdl2735); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:16: (c+= onEvent )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==EVENT) ) {
                        alt108=1;
                    }


                    switch (alt108) {
                	case 1 :
                	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:16: c+= onEvent
                	    {
                	    pushFollow(FOLLOW_onEvent_in_eventHdl2739);
                	    c=onEvent();

                	    state._fsp--;

                	    if (list_c==null) list_c=new ArrayList();
                	    list_c.add(c.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop108;
                    }
                } while (true);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:28: (c+= onAlarm )*
                loop109:
                do {
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ONALARM) ) {
                        alt109=1;
                    }


                    switch (alt109) {
                	case 1 :
                	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:495:28: c+= onAlarm
                	    {
                	    pushFollow(FOLLOW_onAlarm_in_eventHdl2744);
                	    c=onAlarm();

                	    state._fsp--;

                	    if (list_c==null) list_c=new ArrayList();
                	    list_c.add(c.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop109;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 496:2: -> eventHdl(content=$c)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:498:1: onEvent : ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st);
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
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:2: ( ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:4: ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
            match(input,EVENT,FOLLOW_EVENT_in_onEvent2766); 

            match(input, Token.DOWN, null); 
            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2770); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2774); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:23: (c+= correlation )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==CORRELATION) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:23: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onEvent2778);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:40: (we+= with_ex )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==WITH) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:499:40: we+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2783);
                    we=with_ex();

                    state._fsp--;

                    if (list_we==null) list_we=new ArrayList();
                    list_we.add(we.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2788);
            pb=scope_short();

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:6: (var= ID )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ID) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:6: var= ID
                    {
                    var=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2795); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:11: ( portType )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==PORTTYPE) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:11: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent2798);
                    portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:21: ( msgEx )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==MSGEX) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:21: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent2801);
                    msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:28: ( msgType )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==MSGTYPE) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:28: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent2804);
                    msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:37: ( viElt )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==VIELT) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:500:37: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent2807);
                    viElt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 501:2: -> event(p=$po=$oparam_block_st=$pb.st)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:504:1: compensation : ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st);
    public final BPELscriptWalker.compensation_return compensation() throws RecognitionException {
        BPELscriptWalker.compensation_return retval = new BPELscriptWalker.compensation_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body66 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:505:2: ( ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:505:4: ^( COMPENSATION body[null, null, null, null,null,null] )
            {
            match(input,COMPENSATION,FOLLOW_COMPENSATION_in_compensation2844); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_compensation2846);
            body66=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 506:2: -> compensation(body_st=$body.st)
            {
                retval.st = templateLib.getInstanceOf("compensation",
              new STAttrMap().put("body_st", (body66!=null?body66.st:null)));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:509:1: with_ex : ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts);
    public final BPELscriptWalker.with_ex_return with_ex() throws RecognitionException {
        BPELscriptWalker.with_ex_return retval = new BPELscriptWalker.with_ex_return();
        retval.start = input.LT(1);

        List list_maps=null;
        RuleReturnScope maps = null;

        	HashMap<String, StringTemplate> fromParts = new HashMap<String, StringTemplate>();
        	HashMap<String, StringTemplate> toParts = new HashMap<String, StringTemplate>();

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:514:3: ( ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:514:5: ^( WITH (maps+= with_map[fromParts, toParts] )+ )
            {
            match(input,WITH,FOLLOW_WITH_in_with_ex2877); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:514:16: (maps+= with_map[fromParts, toParts] )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==MAP) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:514:16: maps+= with_map[fromParts, toParts]
            	    {
            	    pushFollow(FOLLOW_with_map_in_with_ex2881);
            	    maps=with_map(fromParts, toParts);

            	    state._fsp--;

            	    if (list_maps==null) list_maps=new ArrayList();
            	    list_maps.add(maps.getTemplate());


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


            // TEMPLATE REWRITE
            // 515:2: -> with_ex(fromParts=fromPartstoParts=toParts)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:518:1: with_map[HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts] : ^( MAP ID ( KEY )? pe= path_expr ) ;
    public final BPELscriptWalker.with_map_return with_map(HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts) throws RecognitionException {
        BPELscriptWalker.with_map_return retval = new BPELscriptWalker.with_map_return();
        retval.start = input.LT(1);

        CommonTree KEY67=null;
        CommonTree ID68=null;
        BPELscriptWalker.path_expr_return pe = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:519:2: ( ^( MAP ID ( KEY )? pe= path_expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:519:11: ^( MAP ID ( KEY )? pe= path_expr )
            {
            match(input,MAP,FOLLOW_MAP_in_with_map2920); 

            match(input, Token.DOWN, null); 
            ID68=(CommonTree)match(input,ID,FOLLOW_ID_in_with_map2922); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:519:20: ( KEY )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==KEY) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:519:20: KEY
                    {
                    KEY67=(CommonTree)match(input,KEY,FOLLOW_KEY_in_with_map2924); 

                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2929);
            pe=path_expr();

            state._fsp--;


            match(input, Token.UP, null); 

            		if (KEY67!=null && (KEY67!=null?KEY67.getText():null).contains("in")) {
            		    fromParts.put((ID68!=null?ID68.getText():null), (pe!=null?pe.st:null));
            		}
            		
            		if ((KEY67!=null?KEY67.getText():null).contains("out")) {
            		    toParts.put((ID68!=null?ID68.getText():null), (pe!=null?pe.st:null));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:532:1: receive[List join, List signal, boolean empty, List comments] : ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments);
    public final BPELscriptWalker.receive_return receive(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.receive_return retval = new BPELscriptWalker.receive_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree ci=null;
        CommonTree name=null;
        CommonTree sjf=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return pt = null;

        BPELscriptWalker.msgEx_return msgEx69 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:10: ( ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:13: ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? )
            {
            match(input,RECEIVE,FOLLOW_RECEIVE_in_receive2958); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2962); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2966); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:41: (c+= correlation )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==CORRELATION) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:41: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_receive2970);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:58: (pt= portType )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==PORTTYPE) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:58: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2975);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:71: (ci= CREATE_INST )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==CREATE_INST) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:71: ci= CREATE_INST
                    {
                    ci=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2980); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:85: ( msgEx )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==MSGEX) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:85: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2983);
                    msgEx69=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:96: (name= STRING )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==STRING) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:96: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_receive2988); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:108: (sjf= SJF )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==SJF) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:108: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_receive2993); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:115: (w+= with_ex )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==WITH) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:533:115: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2998);
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
                    		
                    		
                    		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
              
                    	


            // TEMPLATE REWRITE
            // 542:2: -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("receive",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (pt!=null?pt.st:null)).put("std_attr", std_attr).put("crt_inst", (ci!=null?ci.getText():null)).put("msgEx", (msgEx69!=null?msgEx69.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:548:1: reply[List join, List signal,boolean empty, List comments] : ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments);
    public final BPELscriptWalker.reply_return reply(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.reply_return retval = new BPELscriptWalker.reply_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree inv=null;
        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree op=null;
        List list_op=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.faultName_return fn = null;

        BPELscriptWalker.portType_return portType70 = null;

        BPELscriptWalker.msgEx_return msgEx71 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:2: ( ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:4: ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (fn= faultName )? ( msgEx )? (w+= with_ex )? )
            {
            match(input,REPLY,FOLLOW_REPLY_in_reply3099); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_reply3103); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_reply3107); 
            if (list_op==null) list_op=new ArrayList();
            list_op.add(op);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:33: (inv= ID )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ID) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:33: inv= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_reply3111); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:39: (c+= correlation )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==CORRELATION) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:39: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_reply3116);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:54: ( portType )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==PORTTYPE) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:54: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply3119);
                    portType70=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:68: (name= STRING )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==STRING) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:68: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_reply3124); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:80: (sjf= SJF )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==SJF) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:80: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_reply3129); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:88: (fn= faultName )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==FAULTNAME) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:88: fn= faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply3134);
                    fn=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:100: ( msgEx )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==MSGEX) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:100: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply3137);
                    msgEx71=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:108: (w+= with_ex )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==WITH) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:549:108: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply3142);
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
                    		
                    		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();

                    	


            // TEMPLATE REWRITE
            // 557:2: -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("reply",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", list_op).put("inv", (inv!=null?inv.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType70!=null?portType70.st:null)).put("std_attr", std_attr).put("faultName", (fn!=null?fn.st:null)).put("msgEx", (msgEx71!=null?msgEx71.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:562:1: invoke[List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments] : ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments);
    public final BPELscriptWalker.invoke_return invoke(List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.invoke_return retval = new BPELscriptWalker.invoke_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree name=null;
        CommonTree sjf=null;
        CommonTree inv=null;
        List list_inv=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return portType72 = null;

        BPELscriptWalker.compensation_return compensation73 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;

        HashMap<String, String> __faults = new HashMap<String, String>();
        HashMap<String, StringTemplate> __faults_pb = new HashMap<String, StringTemplate>();

        if (_faults!=null) {
            __faults.putAll(_faults);
            __faults_pb.putAll(_faults_pb);
        }

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:2: ( ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:4: ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? (name= STRING )? (sjf= SJF )? (w+= with_ex )? ( compensation )? )
            {
            match(input,INVOKE,FOLLOW_INVOKE_in_invoke3249); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke3253); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke3257); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:33: (inv+= ID )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:33: inv+= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke3261); 
                    if (list_inv==null) list_inv=new ArrayList();
                    list_inv.add(inv);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:40: (c+= correlation )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==CORRELATION) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:40: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_invoke3266);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:55: ( portType )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==PORTTYPE) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:55: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke3269);
                    portType72=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:69: (name= STRING )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==STRING) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:69: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_invoke3274); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:81: (sjf= SJF )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==SJF) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:81: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_invoke3279); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:88: (w+= with_ex )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==WITH) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:88: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke3284);
                    w=with_ex();

                    state._fsp--;

                    if (list_w==null) list_w=new ArrayList();
                    list_w.add(w.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:99: ( compensation )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==COMPENSATION) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:578:99: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke3287);
                    compensation73=compensation();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            // adjust empty tag to handle correlations, since it signals only presence of standard elements else
                    		if (list_c!=null || _faults!=null) empty=false;
                    		
                    		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();

                    	


            // TEMPLATE REWRITE
            // 586:2: -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=std_attrcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("invoke",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("inv", list_inv).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType72!=null?portType72.st:null)).put("std_attr", std_attr).put("correlation_opt", list_c).put("with_ex", list_w).put("faults", __faults).put("faults_pb", __faults_pb).put("compensation", (compensation73!=null?compensation73.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:591:1: assign[List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb, List comments] : ^( ASSIGN (pe= path_expr )? ( PROP )? ( OPAQUE_EXPR )? ( portType )? ( CREATE_INST )? (strattrname= STRING )? (sjf= SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, $OPAQUE_EXPR.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, std_attr, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=std_attrreal=isRealAssigncomments=$comments);
    public final BPELscriptWalker.assign_return assign(List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb, List comments) throws RecognitionException {
        BPELscriptWalker.assign_return retval = new BPELscriptWalker.assign_return();
        retval.start = input.LT(1);

        CommonTree strattrname=null;
        CommonTree sjf=null;
        CommonTree PROP74=null;
        CommonTree OPAQUE_EXPR75=null;
        CommonTree CREATE_INST77=null;
        CommonTree VALID80=null;
        CommonTree KEEPSRC81=null;
        CommonTree IGNORE82=null;
        BPELscriptWalker.path_expr_return pe = null;

        BPELscriptWalker.portType_return portType76 = null;

        BPELscriptWalker.faultName_return faultName78 = null;

        BPELscriptWalker.msgEx_return msgEx79 = null;

        BPELscriptWalker.rvalue_return rvalue83 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:2: ( ^( ASSIGN (pe= path_expr )? ( PROP )? ( OPAQUE_EXPR )? ( portType )? ( CREATE_INST )? (strattrname= STRING )? (sjf= SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, $OPAQUE_EXPR.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, std_attr, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=std_attrreal=isRealAssigncomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:4: ^( ASSIGN (pe= path_expr )? ( PROP )? ( OPAQUE_EXPR )? ( portType )? ( CREATE_INST )? (strattrname= STRING )? (sjf= SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, $OPAQUE_EXPR.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, std_attr, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign3389); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:15: (pe= path_expr )?
            int alt141=2;
            alt141 = dfa141.predict(input);
            switch (alt141) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:15: pe= path_expr
                    {
                    pushFollow(FOLLOW_path_expr_in_assign3393);
                    pe=path_expr();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:27: ( PROP )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==PROP) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:27: PROP
                    {
                    PROP74=(CommonTree)match(input,PROP,FOLLOW_PROP_in_assign3396); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:33: ( OPAQUE_EXPR )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==OPAQUE_EXPR) ) {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==INVOKE||LA143_1==RECEIVE||LA143_1==EXT_EXPR||LA143_1==CALL||LA143_1==PATH||LA143_1==PORTTYPE||(LA143_1>=MSGEX && LA143_1<=FAULTNAME)||LA143_1==SJF||(LA143_1>=CREATE_INST && LA143_1<=OPAQUE_EXPR)||(LA143_1>=VALID && LA143_1<=IGNORE)||LA143_1==INT||(LA143_1>=170 && LA143_1<=174)||(LA143_1>=176 && LA143_1<=179)||LA143_1==206) ) {
                    alt143=1;
                }
            }
            switch (alt143) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:33: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR75=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_assign3399); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:46: ( portType )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==PORTTYPE) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:46: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign3402);
                    portType76=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:56: ( CREATE_INST )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==CREATE_INST) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:56: CREATE_INST
                    {
                    CREATE_INST77=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign3405); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:81: (strattrname= STRING )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==STRING) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==INVOKE||LA146_1==RECEIVE||LA146_1==EXT_EXPR||LA146_1==CALL||LA146_1==PATH||(LA146_1>=MSGEX && LA146_1<=FAULTNAME)||LA146_1==SJF||(LA146_1>=STRING && LA146_1<=OPAQUE_EXPR)||(LA146_1>=VALID && LA146_1<=IGNORE)||LA146_1==INT||(LA146_1>=170 && LA146_1<=174)||(LA146_1>=176 && LA146_1<=179)||LA146_1==206) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:81: strattrname= STRING
                    {
                    strattrname=(CommonTree)match(input,STRING,FOLLOW_STRING_in_assign3411); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:93: (sjf= SJF )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==SJF) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:93: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_assign3416); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:99: ( faultName )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==FAULTNAME) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:99: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign3419);
                    faultName78=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:110: ( msgEx )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==MSGEX) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:110: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign3422);
                    msgEx79=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:117: ( VALID )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==VALID) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:117: VALID
                    {
                    VALID80=(CommonTree)match(input,VALID,FOLLOW_VALID_in_assign3425); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:124: ( KEEPSRC )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==KEEPSRC) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:124: KEEPSRC
                    {
                    KEEPSRC81=(CommonTree)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign3428); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:133: ( IGNORE )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IGNORE) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:592:133: IGNORE
                    {
                    IGNORE82=(CommonTree)match(input,IGNORE,FOLLOW_IGNORE_in_assign3431); 

                    }
                    break;

            }


            		        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (strattrname!=null?strattrname.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	           
            pushFollow(FOLLOW_rvalue_in_assign3441);
            rvalue83=rvalue(_vars, _pl, (pe!=null?pe.st:null), (pe!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(pe.start),
              input.getTreeAdaptor().getTokenStopIndex(pe.start))):null), (PROP74!=null?PROP74.getText():null), (OPAQUE_EXPR75!=null?OPAQUE_EXPR75.getText():null), join, signal, empty, (portType76!=null?portType76.st:null), (CREATE_INST77!=null?CREATE_INST77.getText():null), std_attr, (faultName78!=null?faultName78.st:null), (msgEx79!=null?msgEx79.st:null), (VALID80!=null?VALID80.getText():null), (KEEPSRC81!=null?KEEPSRC81.getText():null), (IGNORE82!=null?IGNORE82.getText():null), name, pb);

            state._fsp--;


            match(input, Token.UP, null); 

            			boolean isRealAssign = true;
            			if ((rvalue83!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue83.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue83.start))):null).contains("invoke") || (rvalue83!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue83.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue83.start))):null).contains("receive")) isRealAssign=false;
            		


            // TEMPLATE REWRITE
            // 603:2: -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=std_attrreal=isRealAssigncomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("rvalue_st", (rvalue83!=null?rvalue83.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("valid", (VALID80!=null?VALID80.getText():null)).put("std_attr", std_attr).put("real", isRealAssign).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:606:1: rvalue[HashMap<String, String>_vars, HashMap<String, String>_pl, \n\tStringTemplate path_expr, String str_path_expr, String lhs_prop, String lhs_opaque, List join, List signal, boolean empty, \n\tStringTemplate portType, String crtInst, String std_attr, StringTemplate faultName, StringTemplate msgEx,\n\tString valid, String keepsrc, String ignore, String name, StringTemplate pb] : (r= receive[null, null, true, null] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprtoopaque=lhs_opaquekeep=$keepsrcignore=$ignore) | OPAQUE_EXPR -> copy(from=fromrhs_opaque=$OPAQUE_EXPRempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoopaque=lhs_opaquetoempty=isToExprkeep=$keepsrcignore=$ignore));
    public final BPELscriptWalker.rvalue_return rvalue(HashMap<String, String>_vars, HashMap<String, String>_pl, StringTemplate path_expr, String str_path_expr, String lhs_prop, String lhs_opaque, List join, List signal, boolean empty, StringTemplate portType, String crtInst, String std_attr, StringTemplate faultName, StringTemplate msgEx, String valid, String keepsrc, String ignore, String name, StringTemplate pb) throws RecognitionException {
        BPELscriptWalker.rvalue_return retval = new BPELscriptWalker.rvalue_return();
        retval.start = input.LT(1);

        CommonTree PROP85=null;
        CommonTree OPAQUE_EXPR86=null;
        BPELscriptWalker.receive_return r = null;

        BPELscriptWalker.invoke_return i = null;

        BPELscriptWalker.expr_return expr84 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:610:2: (r= receive[null, null, true, null] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprtoopaque=lhs_opaquekeep=$keepsrcignore=$ignore) | OPAQUE_EXPR -> copy(from=fromrhs_opaque=$OPAQUE_EXPRempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoopaque=lhs_opaquetoempty=isToExprkeep=$keepsrcignore=$ignore))
            int alt154=4;
            switch ( input.LA(1) ) {
            case RECEIVE:
                {
                alt154=1;
                }
                break;
            case INVOKE:
                {
                alt154=2;
                }
                break;
            case EXT_EXPR:
            case CALL:
            case PATH:
            case STRING:
            case INT:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 176:
            case 177:
            case 178:
            case 179:
            case 206:
                {
                alt154=3;
                }
                break;
            case OPAQUE_EXPR:
                {
                alt154=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:610:5: r= receive[null, null, true, null]
                    {
                    pushFollow(FOLLOW_receive_in_rvalue3511);
                    r=receive(null, null, true, null);

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
                    // 621:2: -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx)
                    {
                        retval.st = templateLib.getInstanceOf("receive",
                      new STAttrMap().put("rec_name", name).put("pb", pb).put("rec_tpl", (r!=null?r.st:null)).put("path_st", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("crt_inst", crtInst).put("std_attr", std_attr).put("faultName", faultName).put("msgEx", msgEx));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:623:5: i= invoke[null, null, true, null, null, null]
                    {
                    pushFollow(FOLLOW_invoke_in_rvalue3593);
                    i=invoke(null, null, true, null, null, null);

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
                    // 634:2: -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr)
                    {
                        retval.st = templateLib.getInstanceOf("invoke",
                      new STAttrMap().put("inv_tpl", (i!=null?i.st:null)).put("outvar", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("std_attr", std_attr));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:636:5: expr[$path_expr] ( PROP )?
                    {
                    pushFollow(FOLLOW_expr_in_rvalue3650);
                    expr84=expr(path_expr);

                    state._fsp--;

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:636:22: ( PROP )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==PROP) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:636:22: PROP
                            {
                            PROP85=(CommonTree)match(input,PROP,FOLLOW_PROP_in_rvalue3653); 

                            }
                            break;

                    }


                    		// display error when atrributes are used which are only allowed for other alternatives
                    		if (portType!=null || faultName!=null || msgEx!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}
                    		
                    		String from_spec = (expr84!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expr84.start),
                      input.getTreeAdaptor().getTokenStopIndex(expr84.start))):null); //fetch right hand side
                    		String[] from_part;
                    		
                    		String[] lhs = null;
                    		//distinguish between normal assignment and opaque assignment
                    		if (str_path_expr!=null) {
                    			lhs = str_path_expr.split("\\."); // fetch left hand side
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
                    		for (Object obj : (expr84!=null?expr84.vars:null)) {
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
                    			if((expr84!=null?expr84.vars:null).size()==1 && from_part.length>1 && from_part[1]!=null) {
                    			    var = from_part[0];
                    			    if (PROP85!=null) {
                    			    	if ((PROP85!=null?PROP85.getText():null).equals("property")) {
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
                    			    if (lhs_prop!=null && lhs_prop.equals("property")) {//handle property reference
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
                    		


                    // TEMPLATE REWRITE
                    // 810:2: -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprtoopaque=lhs_opaquekeep=$keepsrcignore=$ignore)
                    {
                        retval.st = templateLib.getInstanceOf("copy",
                      new STAttrMap().put("from", from).put("empty", isPLorVar).put("ext", isExt).put("pl", pL).put("pl_p", ePR).put("var", var).put("part", part).put("prop", property).put("topart", tpart).put("toprop", tprop).put("topl", topl).put("tovar", tovar).put("toempty", isToExpr).put("toopaque", lhs_opaque).put("keep", keepsrc).put("ignore", ignore));
                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:816:4: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR86=(CommonTree)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_rvalue3774); 

                    		// display error when atrributes are used which are only allowed for other alternatives
                    		if (portType!=null || faultName!=null || msgEx!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}
                    		
                    		String from_spec = null; //fetch right hand side
                    		String[] from_part;
                    		
                    		String[] lhs =null;
                    		//distinguish between normal assignment and opaque assignment
                    		if (str_path_expr!=null) {
                    			lhs = str_path_expr.split("\\."); // fetch left hand side
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
                    			    if (lhs_prop!=null && lhs_prop.equals("property")) {//handle property reference
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
                    		


                    // TEMPLATE REWRITE
                    // 897:2: -> copy(from=fromrhs_opaque=$OPAQUE_EXPRempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoopaque=lhs_opaquetoempty=isToExprkeep=$keepsrcignore=$ignore)
                    {
                        retval.st = templateLib.getInstanceOf("copy",
                      new STAttrMap().put("from", from).put("rhs_opaque", OPAQUE_EXPR86).put("empty", isPLorVar).put("ext", isExt).put("pl", pL).put("pl_p", ePR).put("var", var).put("part", part).put("prop", property).put("topart", tpart).put("toprop", tprop).put("topl", topl).put("tovar", tovar).put("toopaque", lhs_opaque).put("toempty", isToExpr).put("keep", keepsrc).put("ignore", ignore));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:908:1: throw_ex[List join, List signal,boolean empty, List comments] : ^( THROW ns_id (faultVar= ID )? (name= STRING )? (sjf= SJF )? ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=std_attrcomments=$comments);
    public final BPELscriptWalker.throw_ex_return throw_ex(List join, List signal, boolean  empty, List comments) throws RecognitionException {
        BPELscriptWalker.throw_ex_return retval = new BPELscriptWalker.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree faultVar=null;
        CommonTree name=null;
        CommonTree sjf=null;
        BPELscriptWalker.ns_id_return ns_id87 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:2: ( ^( THROW ns_id (faultVar= ID )? (name= STRING )? (sjf= SJF )? ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=std_attrcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:4: ^( THROW ns_id (faultVar= ID )? (name= STRING )? (sjf= SJF )? )
            {
            match(input,THROW,FOLLOW_THROW_in_throw_ex3914); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_throw_ex3916);
            ns_id87=ns_id();

            state._fsp--;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:26: (faultVar= ID )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ID) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:26: faultVar= ID
                    {
                    faultVar=(CommonTree)match(input,ID,FOLLOW_ID_in_throw_ex3920); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:35: (name= STRING )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==STRING) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:35: name= STRING
                    {
                    name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_throw_ex3925); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:47: (sjf= SJF )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==SJF) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:909:47: sjf= SJF
                    {
                    sjf=(CommonTree)match(input,SJF,FOLLOW_SJF_in_throw_ex3930); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            	        		String std_attr =templateLib.getInstanceOf("std_attr",
            	              new STAttrMap().put("name", (name!=null?name.getText():null)).put("sjf", (sjf!=null?sjf.getText():null))).toString();
            	 


            // TEMPLATE REWRITE
            // 914:2: -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=std_attrcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("throw",
              new STAttrMap().put("ns_pre", (ns_id87!=null?ns_id87.nspre:null)).put("ns_loc", (ns_id87!=null?ns_id87.nsloc:null)).put("join", join).put("signal", signal).put("empty", empty).put("faultVar", (faultVar!=null?faultVar.getText():null)).put("std_attr", std_attr).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:920:1: rethrow_ex[List join, List signal,boolean empty, List comments] : ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.rethrow_ex_return rethrow_ex(List join, List signal, boolean  empty, List comments) throws RecognitionException {
        BPELscriptWalker.rethrow_ex_return retval = new BPELscriptWalker.rethrow_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr88 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:921:2: ( ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:921:4: ^( RETHROW std_attr )
            {
            match(input,RETHROW,FOLLOW_RETHROW_in_rethrow_ex4004); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_rethrow_ex4006);
            std_attr88=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 922:2: -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("rethrow",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr88!=null?std_attr88.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:931:1: compensate[List join, List signal, boolean empty, List comments] : ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.compensate_return compensate(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.compensate_return retval = new BPELscriptWalker.compensate_return();
        retval.start = input.LT(1);

        CommonTree target=null;
        List list_target=null;
        BPELscriptWalker.std_attr_return std_attr89 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:932:2: ( ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:932:4: ^( COMPENSATE (target+= ID )? std_attr )
            {
            match(input,COMPENSATE,FOLLOW_COMPENSATE_in_compensate4056); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:932:23: (target+= ID )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ID) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:932:23: target+= ID
                    {
                    target=(CommonTree)match(input,ID,FOLLOW_ID_in_compensate4060); 
                    if (list_target==null) list_target=new ArrayList();
                    list_target.add(target);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_compensate4063);
            std_attr89=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 933:2: -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("compensate",
              new STAttrMap().put("id_opt", list_target).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr89!=null?std_attr89.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:936:1: exit[List join, List signal, boolean empty, List comments] : ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.exit_return exit(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.exit_return retval = new BPELscriptWalker.exit_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr90 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:937:2: ( ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:937:4: ^( EXIT std_attr )
            {
            match(input,EXIT,FOLLOW_EXIT_in_exit4113); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_exit4115);
            std_attr90=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 938:2: -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("exit",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr90!=null?std_attr90.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:941:1: validate[List join, List signal, boolean empty, HashMap<String, String> _vars, List comments] : ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments);
    public final BPELscriptWalker.validate_return validate(List join, List signal, boolean empty, HashMap<String, String> _vars, List comments) throws RecognitionException {
        BPELscriptWalker.validate_return retval = new BPELscriptWalker.validate_return();
        retval.start = input.LT(1);

        CommonTree vars=null;
        List list_vars=null;
        BPELscriptWalker.std_attr_return std_attr91 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:942:2: ( ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:942:4: ^( VALIDATE (vars+= ID )+ std_attr )
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validate4161); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:942:19: (vars+= ID )+
            int cnt159=0;
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==ID) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:942:19: vars+= ID
            	    {
            	    vars=(CommonTree)match(input,ID,FOLLOW_ID_in_validate4165); 
            	    if (list_vars==null) list_vars=new ArrayList();
            	    list_vars.add(vars);


            	    }
            	    break;

            	default :
            	    if ( cnt159 >= 1 ) break loop159;
                        EarlyExitException eee =
                            new EarlyExitException(159, input);
                        throw eee;
                }
                cnt159++;
            } while (true);

            pushFollow(FOLLOW_std_attr_in_validate4168);
            std_attr91=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 

            	


            // TEMPLATE REWRITE
            // 945:2: -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("validate",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr91!=null?std_attr91.st:null)).put("var", list_vars).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:948:1: ext_act[List join, List signal, List comments] : ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.ext_act_return ext_act(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.ext_act_return retval = new BPELscriptWalker.ext_act_return();
        retval.start = input.LT(1);

        CommonTree ea=null;
        BPELscriptWalker.std_attr_return std_attr92 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:949:2: ( ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:949:4: ^( EXTENSIONACT ea= EXT_ACT std_attr )
            {
            match(input,EXTENSIONACT,FOLLOW_EXTENSIONACT_in_ext_act4223); 

            match(input, Token.DOWN, null); 
            ea=(CommonTree)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act4227); 
            pushFollow(FOLLOW_std_attr_in_ext_act4229);
            std_attr92=std_attr();

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
            // 959:2: -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("ext_act",
              new STAttrMap().put("join", join).put("signal", signal).put("ext_act", m.trim()).put("std_attr", (std_attr92!=null?std_attr92.st:null)).put("comments", comments));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:962:1: nop[List join, List signal, boolean empty, List comments] : ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.nop_return nop(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.nop_return retval = new BPELscriptWalker.nop_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr93 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:963:2: ( ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:963:4: ^( NOP std_attr )
            {
            match(input,NOP,FOLLOW_NOP_in_nop4278); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_nop4280);
            std_attr93=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 964:2: -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("nop",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr93!=null?std_attr93.st:null)).put("comments", comments));
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

    public static class opaque_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "opaque"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:967:1: opaque[List join, List signal, boolean empty, List comments] : ^( OPAQUE std_attr ) -> opaque(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.opaque_return opaque(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.opaque_return retval = new BPELscriptWalker.opaque_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr94 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:968:2: ( ^( OPAQUE std_attr ) -> opaque(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:968:4: ^( OPAQUE std_attr )
            {
            match(input,OPAQUE,FOLLOW_OPAQUE_in_opaque4326); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_opaque4328);
            std_attr94=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 969:2: -> opaque(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("opaque",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr94!=null?std_attr94.st:null)).put("comments", comments));
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
    // $ANTLR end "opaque"

    public static class namespace_return extends TreeRuleReturnScope {
        public String id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "namespace"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:973:1: namespace returns [String id] : ^( NAMESPACE ID url= STRING ) ;
    public final BPELscriptWalker.namespace_return namespace() throws RecognitionException {
        BPELscriptWalker.namespace_return retval = new BPELscriptWalker.namespace_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree ID95=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:974:2: ( ^( NAMESPACE ID url= STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:974:4: ^( NAMESPACE ID url= STRING )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace4376); 

            match(input, Token.DOWN, null); 
            ID95=(CommonTree)match(input,ID,FOLLOW_ID_in_namespace4378); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_namespace4382); 

            match(input, Token.UP, null); 
            // insert namespace in global HashMap glob_ns
            		Boolean definedIn = glob_ns.containsKey((ID95!=null?ID95.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("namespace", ID95);
            		} else {
            			glob_ns.put((ID95!=null?ID95.getText():null), (url!=null?url.getText():null));
            		}
            	// set return value
            		retval.id =(ID95!=null?ID95.getText():null);
            	

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:988:1: extension : ^( EXTENSION ID url= STRING ( MUSTUND )? ) ;
    public final BPELscriptWalker.extension_return extension() throws RecognitionException {
        BPELscriptWalker.extension_return retval = new BPELscriptWalker.extension_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree MUSTUND96=null;
        CommonTree ID97=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:989:2: ( ^( EXTENSION ID url= STRING ( MUSTUND )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:989:5: ^( EXTENSION ID url= STRING ( MUSTUND )? )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension4412); 

            match(input, Token.DOWN, null); 
            ID97=(CommonTree)match(input,ID,FOLLOW_ID_in_extension4414); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_extension4418); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:989:31: ( MUSTUND )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==MUSTUND) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:989:31: MUSTUND
                    {
                    MUSTUND96=(CommonTree)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension4420); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            		
            		//if mustUnderstand is not empty, append it to modified URL
            		String modUrl = (url!=null?url.getText():null);
            		if (MUSTUND96!=null) modUrl+=(MUSTUND96!=null?MUSTUND96.getText():null);/*" mustUnderstand=\""+$mustUnderstand.get(0)+"\"";*/
            				
            		Boolean definedIn = glob_ns.containsKey((ID97!=null?ID97.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("extension", ID97);
            		} else {
            			// insert extension in namespace HashMap glob_ns and extensions
            			glob_ns.put((ID97!=null?ID97.getText():null), (url!=null?url.getText():null));				
            			extensions.put((ID97!=null?ID97.getText():null), modUrl );
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1009:1: imports : ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) ;
    public final BPELscriptWalker.imports_return imports() throws RecognitionException {
        BPELscriptWalker.imports_return retval = new BPELscriptWalker.imports_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        CommonTree loc=null;
        CommonTree ns=null;
        BPELscriptWalker.viType_return viType98 = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:2: ( ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:5: ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_imports4442); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:14: (id= ID loc= STRING )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:15: id= ID loc= STRING
            {
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_imports4447); 
            loc=(CommonTree)match(input,STRING,FOLLOW_STRING_in_imports4451); 

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:35: (ns= ID )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ID) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:35: ns= ID
                    {
                    ns=(CommonTree)match(input,ID,FOLLOW_ID_in_imports4456); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:40: ( viType )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==VITYPE) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:40: viType
                    {
                    pushFollow(FOLLOW_viType_in_imports4459);
                    viType98=viType();

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
            			if ((viType98!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType98.start),
              input.getTreeAdaptor().getTokenStopIndex(viType98.start))):null)!=null) modUrl+=" importType="+(viType98!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType98.start),
              input.getTreeAdaptor().getTokenStopIndex(viType98.start))):null).substring(5, (viType98!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType98.start),
              input.getTreeAdaptor().getTokenStopIndex(viType98.start))):null).length())+"\n ";
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1040:1: messages[HashMap<String, String> _messages, Boolean isInScope, List comments] : ^( MESSAGES ( message[_messages, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.messages_return messages(HashMap<String, String> _messages, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.messages_return retval = new BPELscriptWalker.messages_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:2: ( ^( MESSAGES ( message[_messages, isInScope, comments] )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:4: ^( MESSAGES ( message[_messages, isInScope, comments] )+ )
            {
            match(input,MESSAGES,FOLLOW_MESSAGES_in_messages4478); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:15: ( message[_messages, isInScope, comments] )+
            int cnt163=0;
            loop163:
            do {
                int alt163=2;
                int LA163_0 = input.LA(1);

                if ( (LA163_0==MESSAGE) ) {
                    alt163=1;
                }


                switch (alt163) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:15: message[_messages, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_message_in_messages4480);
            	    message(_messages, isInScope, comments);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt163 >= 1 ) break loop163;
                        EarlyExitException eee =
                            new EarlyExitException(163, input);
                        throw eee;
                }
                cnt163++;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1044:1: message[HashMap<String, String> _messages, Boolean isInScope, List comments] : ^( MESSAGE ID ) ;
    public final BPELscriptWalker.message_return message(HashMap<String, String> _messages, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.message_return retval = new BPELscriptWalker.message_return();
        retval.start = input.LT(1);

        CommonTree ID99=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1045:2: ( ^( MESSAGE ID ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1045:4: ^( MESSAGE ID )
            {
            match(input,MESSAGE,FOLLOW_MESSAGE_in_message4498); 

            match(input, Token.DOWN, null); 
            ID99=(CommonTree)match(input,ID,FOLLOW_ID_in_message4500); 

            match(input, Token.UP, null); 
            	
            		Boolean definedIn = _messages.containsKey((ID99!=null?ID99.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("messageExchange", ID99);
            		} 
            		// insert messages in message HashMap
            		_messages.put((ID99!=null?ID99.getText():null), "" );                    
            	

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1058:1: variables[HashMap<String, String> _vars, Boolean isInScope, List comments] : ^( VARIABLES ( variable[_vars, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.variables_return variables(HashMap<String, String> _vars, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.variables_return retval = new BPELscriptWalker.variables_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1059:2: ( ^( VARIABLES ( variable[_vars, isInScope, comments] )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1059:5: ^( VARIABLES ( variable[_vars, isInScope, comments] )+ )
            {
            match(input,VARIABLES,FOLLOW_VARIABLES_in_variables4519); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1059:17: ( variable[_vars, isInScope, comments] )+
            int cnt164=0;
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==VARIABLE) ) {
                    alt164=1;
                }


                switch (alt164) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1059:17: variable[_vars, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_variable_in_variables4521);
            	    variable(_vars, isInScope, comments);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt164 >= 1 ) break loop164;
                        EarlyExitException eee =
                            new EarlyExitException(164, input);
                        throw eee;
                }
                cnt164++;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1061:1: variable[HashMap<String, String> _vars, Boolean isInScope, List comments] : ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) ;
    public final BPELscriptWalker.variable_return variable(HashMap<String, String> _vars, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.variable_return retval = new BPELscriptWalker.variable_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        BPELscriptWalker.msgType_return msgT = null;

        BPELscriptWalker.viType_return viT = null;

        BPELscriptWalker.viElt_return viE = null;

        BPELscriptWalker.with_ex_return with = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:2: ( ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:4: ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? )
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_variable4538); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_variable4542); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:25: (msgT= msgType )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==MSGTYPE) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:25: msgT= msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable4546);
                    msgT=msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:38: (viT= viType )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==VITYPE) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:38: viT= viType
                    {
                    pushFollow(FOLLOW_viType_in_variable4551);
                    viT=viType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:50: (viE= viElt )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==VIELT) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:50: viE= viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable4556);
                    viE=viElt();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:62: (with= with_ex )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==WITH) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1062:62: with= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable4561);
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1098:1: partnerlinks[HashMap<String, String> _pl, Boolean isInScope, List comments] : ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.partnerlinks_return partnerlinks(HashMap<String, String> _pl, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.partnerlinks_return retval = new BPELscriptWalker.partnerlinks_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1099:2: ( ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1099:4: ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ )
            {
            match(input,PARTNERLINKS,FOLLOW_PARTNERLINKS_in_partnerlinks4581); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1099:19: ( partnerlink[_pl, isInScope, comments] )+
            int cnt169=0;
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==PID) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1099:19: partnerlink[_pl, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_partnerlink_in_partnerlinks4583);
            	    partnerlink(_pl, isInScope, comments);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt169 >= 1 ) break loop169;
                        EarlyExitException eee =
                            new EarlyExitException(169, input);
                        throw eee;
                }
                cnt169++;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1101:1: partnerlink[HashMap<String, String> _pl, Boolean isInScope, List comments] : ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) ;
    public final BPELscriptWalker.partnerlink_return partnerlink(HashMap<String, String> _pl, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.partnerlink_return retval = new BPELscriptWalker.partnerlink_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree ID100=null;
        BPELscriptWalker.ns_id_return plType = null;

        BPELscriptWalker.ns_id_return roleA = null;

        BPELscriptWalker.ns_id_return roleB = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:2: ( ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:4: ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? )
            {
            match(input,PID,FOLLOW_PID_in_partnerlink4597); 

            match(input, Token.DOWN, null); 
            ID100=(CommonTree)match(input,ID,FOLLOW_ID_in_partnerlink4599); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:19: (plType= ns_id )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==NS) ) {
                int LA170_1 = input.LA(2);

                if ( (LA170_1==DOWN) ) {
                    int LA170_3 = input.LA(3);

                    if ( (LA170_3==ID) ) {
                        int LA170_4 = input.LA(4);

                        if ( (LA170_4==UP) ) {
                            alt170=1;
                        }
                        else if ( (LA170_4==ID) ) {
                            int LA170_6 = input.LA(5);

                            if ( (LA170_6==UP) ) {
                                alt170=1;
                            }
                        }
                    }
                }
            }
            switch (alt170) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:19: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink4603);
                    plType=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:32: (roleA= ns_id )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==NS) ) {
                int LA171_1 = input.LA(2);

                if ( (LA171_1==DOWN) ) {
                    int LA171_3 = input.LA(3);

                    if ( (LA171_3==ID) ) {
                        int LA171_4 = input.LA(4);

                        if ( (LA171_4==UP) ) {
                            alt171=1;
                        }
                        else if ( (LA171_4==ID) ) {
                            int LA171_6 = input.LA(5);

                            if ( (LA171_6==UP) ) {
                                alt171=1;
                            }
                        }
                    }
                }
            }
            switch (alt171) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:32: roleA= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink4608);
                    roleA=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:45: (roleB= ns_id )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==NS) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:45: roleB= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink4613);
                    roleB=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:57: (init= INITPARTNER )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==INITPARTNER) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1102:57: init= INITPARTNER
                    {
                    init=(CommonTree)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partnerlink4618); 

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
            	Boolean definedIn = _pl.containsKey((ID100!=null?ID100.getText():null));
            		
            	if (definedIn) {
            		throwDefinedWarning("partnerlink", ID100);
            	}
            	// 5)
            	_pl.put((ID100!=null?ID100.getText():null), plT);
            	

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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1166:1: corr_sets[HashMap<String, String>_cs, Boolean isInScope, List comments] : ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.corr_sets_return corr_sets(HashMap<String, String>_cs, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.corr_sets_return retval = new BPELscriptWalker.corr_sets_return();
        retval.start = input.LT(1);

        List list_cs=null;
        RuleReturnScope cs = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1167:2: ( ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1167:4: ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ )
            {
            match(input,CORRSETS,FOLLOW_CORRSETS_in_corr_sets4637); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1167:17: (cs+= corr_set[_cs, isInScope, comments] )+
            int cnt174=0;
            loop174:
            do {
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( (LA174_0==CORRSET) ) {
                    alt174=1;
                }


                switch (alt174) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1167:17: cs+= corr_set[_cs, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets4641);
            	    cs=corr_set(_cs, isInScope, comments);

            	    state._fsp--;

            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt174 >= 1 ) break loop174;
                        EarlyExitException eee =
                            new EarlyExitException(174, input);
                        throw eee;
                }
                cnt174++;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1169:1: corr_set[HashMap<String, String>_cs, Boolean isInScope, List comments] : ^( CORRSET f= ID (params+= ID )+ ) ;
    public final BPELscriptWalker.corr_set_return corr_set(HashMap<String, String>_cs, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.corr_set_return retval = new BPELscriptWalker.corr_set_return();
        retval.start = input.LT(1);

        CommonTree f=null;
        CommonTree params=null;
        List list_params=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1170:2: ( ^( CORRSET f= ID (params+= ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1170:4: ^( CORRSET f= ID (params+= ID )+ )
            {
            match(input,CORRSET,FOLLOW_CORRSET_in_corr_set4655); 

            match(input, Token.DOWN, null); 
            f=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set4659); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1170:25: (params+= ID )+
            int cnt175=0;
            loop175:
            do {
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==ID) ) {
                    alt175=1;
                }


                switch (alt175) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1170:25: params+= ID
            	    {
            	    params=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set4663); 
            	    if (list_params==null) list_params=new ArrayList();
            	    list_params.add(params);


            	    }
            	    break;

            	default :
            	    if ( cnt175 >= 1 ) break loop175;
                        EarlyExitException eee =
                            new EarlyExitException(175, input);
                        throw eee;
                }
                cnt175++;
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1200:1: correlation : ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors);
    public final BPELscriptWalker.correlation_return correlation() throws RecognitionException {
        BPELscriptWalker.correlation_return retval = new BPELscriptWalker.correlation_return();
        retval.start = input.LT(1);

        List list_cors=null;
        RuleReturnScope cors = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1201:2: ( ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1201:4: ^( CORRELATION (cors+= corr_mapping )+ )
            {
            match(input,CORRELATION,FOLLOW_CORRELATION_in_correlation4681); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1201:22: (cors+= corr_mapping )+
            int cnt176=0;
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==CORR_MAP) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1201:22: cors+= corr_mapping
            	    {
            	    pushFollow(FOLLOW_corr_mapping_in_correlation4685);
            	    cors=corr_mapping();

            	    state._fsp--;

            	    if (list_cors==null) list_cors=new ArrayList();
            	    list_cors.add(cors.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt176 >= 1 ) break loop176;
                        EarlyExitException eee =
                            new EarlyExitException(176, input);
                        throw eee;
                }
                cnt176++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1202:2: -> list(content_st=$cors)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1208:1: corr_mapping : ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern);
    public final BPELscriptWalker.corr_mapping_return corr_mapping() throws RecognitionException {
        BPELscriptWalker.corr_mapping_return retval = new BPELscriptWalker.corr_mapping_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree pattern=null;
        CommonTree ID101=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:2: ( ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:4: ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? )
            {
            match(input,CORR_MAP,FOLLOW_CORR_MAP_in_corr_mapping4713); 

            match(input, Token.DOWN, null); 
            ID101=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_mapping4715); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:22: (init= INIT_COR )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==INIT_COR) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:22: init= INIT_COR
                    {
                    init=(CommonTree)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping4719); 

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:40: (pattern= PATTERN_COR )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==PATTERN_COR) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1209:40: pattern= PATTERN_COR
                    {
                    pattern=(CommonTree)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping4724); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            	
            		Boolean definedIn = expressions.containsKey((ID101!=null?ID101.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("correlation", ID101);
            			//throw new RecognitionException();
            		} else {
            			expressions.put((ID101!=null?ID101.getText():null), null);/*, $expr.retval);//	System.out.println(expressions);*/
            		}
            	


            // TEMPLATE REWRITE
            // 1221:2: -> correlation_map(id=$IDinit=$initpattern=$pattern)
            {
                retval.st = templateLib.getInstanceOf("correlation_map",
              new STAttrMap().put("id", ID101).put("init", init).put("pattern", pattern));
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
        public List vars=new ArrayList();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1228:1: expr[StringTemplate path_expr] returns [String retval, List vars=new ArrayList()] : (se= s_expr[$vars] -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call );
    public final BPELscriptWalker.expr_return expr(StringTemplate path_expr) throws RecognitionException {
        BPELscriptWalker.expr_return retval = new BPELscriptWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree ee=null;
        BPELscriptWalker.s_expr_return se = null;

        BPELscriptWalker.funct_call_return fc = null;


        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1229:2: (se= s_expr[$vars] -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call )
            int alt179=3;
            switch ( input.LA(1) ) {
            case PATH:
            case STRING:
            case INT:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 176:
            case 177:
            case 178:
            case 179:
            case 206:
                {
                alt179=1;
                }
                break;
            case EXT_EXPR:
                {
                alt179=2;
                }
                break;
            case CALL:
                {
                alt179=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 179, 0, input);

                throw nvae;
            }

            switch (alt179) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1229:5: se= s_expr[$vars]
                    {
                    pushFollow(FOLLOW_s_expr_in_expr4779);
                    se=s_expr(retval.vars);

                    state._fsp--;

                    retval.retval =(se!=null?se.retval:null);retval.vars =(se!=null?se.retvar:null);


                    // TEMPLATE REWRITE
                    // 1230:2: -> s_expr(value=$se.retvalpath=$path_expr)
                    {
                        retval.st = templateLib.getInstanceOf("s_expr",
                      new STAttrMap().put("value", (se!=null?se.retval:null)).put("path", path_expr));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1231:5: ee= EXT_EXPR
                    {
                    ee=(CommonTree)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr4806); 
                    	
                    		retval.retval =(ee!=null?ee.getText():null);
                    		
                    		//remove expression brackets
                    		retval.retval = retval.retval.substring(1, retval.retval.length()-1);
                    		//change specific syntax
                    		if (retval.retval.contains("<")) retval.retval = retval.retval.replace("<", "&lt;"); 
                    		if (retval.retval.contains(">")) retval.retval = retval.retval.replace("<", "&gt;");       
                    	


                    // TEMPLATE REWRITE
                    // 1241:2: -> expr(expr=$retval)
                    {
                        retval.st = templateLib.getInstanceOf("expr",
                      new STAttrMap().put("expr", retval.retval));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1242:5: fc= funct_call
                    {
                    pushFollow(FOLLOW_funct_call_in_expr4829);
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1249:1: funct_call returns [String retval] : ^( CALL (ids+= ID )+ ) ;
    public final BPELscriptWalker.funct_call_return funct_call() throws RecognitionException {
        BPELscriptWalker.funct_call_return retval = new BPELscriptWalker.funct_call_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1251:2: ( ^( CALL (ids+= ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1251:4: ^( CALL (ids+= ID )+ )
            {
            match(input,CALL,FOLLOW_CALL_in_funct_call4852); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1251:14: (ids+= ID )+
            int cnt180=0;
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==ID) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1251:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_funct_call4856); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    if ( cnt180 >= 1 ) break loop180;
                        EarlyExitException eee =
                            new EarlyExitException(180, input);
                        throw eee;
                }
                cnt180++;
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
        public List retvar;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "s_expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1273:1: s_expr[List vars] returns [String retval, List retvar] : ( ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st));
    public final BPELscriptWalker.s_expr_return s_expr(List vars) throws RecognitionException {
        BPELscriptWalker.s_expr_return retval = new BPELscriptWalker.s_expr_return();
        retval.start = input.LT(1);

        CommonTree STRING102=null;
        CommonTree INT103=null;
        BPELscriptWalker.s_expr_return s1 = null;

        BPELscriptWalker.s_expr_return s2 = null;

        BPELscriptWalker.path_expr_return pe = null;


        retval.retvar =vars;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1275:2: ( ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st))
            int alt181=13;
            switch ( input.LA(1) ) {
            case 170:
                {
                alt181=1;
                }
                break;
            case 171:
                {
                alt181=2;
                }
                break;
            case 172:
                {
                alt181=3;
                }
                break;
            case 173:
                {
                alt181=4;
                }
                break;
            case 174:
                {
                alt181=5;
                }
                break;
            case 206:
                {
                alt181=6;
                }
                break;
            case 176:
                {
                alt181=7;
                }
                break;
            case 177:
                {
                alt181=8;
                }
                break;
            case 178:
                {
                alt181=9;
                }
                break;
            case 179:
                {
                alt181=10;
                }
                break;
            case STRING:
                {
                alt181=11;
                }
                break;
            case INT:
                {
                alt181=12;
                }
                break;
            case PATH:
                {
                alt181=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }

            switch (alt181) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1275:4: ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,170,FOLLOW_170_in_s_expr4892); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4896);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4901);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1276:4: ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,171,FOLLOW_171_in_s_expr4911); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4915);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4920);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1277:4: ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,172,FOLLOW_172_in_s_expr4930); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4934);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4939);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1278:4: ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,173,FOLLOW_173_in_s_expr4949); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4953);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4958);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1279:4: ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,174,FOLLOW_174_in_s_expr4968); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4972);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4977);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1280:4: ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,206,FOLLOW_206_in_s_expr4987); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4991);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4996);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1281:4: ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,176,FOLLOW_176_in_s_expr5006); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr5010);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr5015);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1282:4: ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,177,FOLLOW_177_in_s_expr5025); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr5029);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr5034);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1283:4: ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,178,FOLLOW_178_in_s_expr5044); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr5048);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr5053);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1284:4: ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,179,FOLLOW_179_in_s_expr5063); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr5067);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr5072);
                    s2=s_expr(retval.retvar);

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
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1285:4: STRING
                    {
                    STRING102=(CommonTree)match(input,STRING,FOLLOW_STRING_in_s_expr5081); 
                    retval.retval = (STRING102!=null?STRING102.getText():null);

                    }
                    break;
                case 12 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1286:4: INT
                    {
                    INT103=(CommonTree)match(input,INT,FOLLOW_INT_in_s_expr5089); 
                    retval.retval =(INT103!=null?INT103.getText():null);

                    }
                    break;
                case 13 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1287:4: pe= path_expr
                    {
                    pushFollow(FOLLOW_path_expr_in_s_expr5098);
                    pe=path_expr();

                    state._fsp--;

                    retval.retval =(pe!=null?pe.retval:null);retval.retvar.add((pe!=null?pe.retval:null));


                    // TEMPLATE REWRITE
                    // 1287:63: -> path_expr(path=pe.st)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1293:1: path_expr returns [String retval] : ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns);
    public final BPELscriptWalker.path_expr_return path_expr() throws RecognitionException {
        BPELscriptWalker.path_expr_return retval = new BPELscriptWalker.path_expr_return();
        retval.start = input.LT(1);

        List list_ns=null;
        RuleReturnScope ns = null;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1294:2: ( ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1294:4: ^( PATH (ns+= ns_id )+ )
            {
            match(input,PATH,FOLLOW_PATH_in_path_expr5127); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1294:13: (ns+= ns_id )+
            int cnt182=0;
            loop182:
            do {
                int alt182=2;
                int LA182_0 = input.LA(1);

                if ( (LA182_0==NS) ) {
                    alt182=1;
                }


                switch (alt182) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1294:13: ns+= ns_id
            	    {
            	    pushFollow(FOLLOW_ns_id_in_path_expr5131);
            	    ns=ns_id();

            	    state._fsp--;

            	    if (list_ns==null) list_ns=new ArrayList();
            	    list_ns.add(ns.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt182 >= 1 ) break loop182;
                        EarlyExitException eee =
                            new EarlyExitException(182, input);
                        throw eee;
                }
                cnt182++;
            } while (true);


            match(input, Token.UP, null); 
            //return variable name for use in assign rule (ignoring parts)	
            		retval.retval =list_ns.get(0).toString();
            	


            // TEMPLATE REWRITE
            // 1298:2: -> path_expr(pns_p=$ns)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1304:1: ns_id returns [String nspre, String nsloc, CommonTree locID] : ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text);
    public final BPELscriptWalker.ns_id_return ns_id() throws RecognitionException {
        BPELscriptWalker.ns_id_return retval = new BPELscriptWalker.ns_id_return();
        retval.start = input.LT(1);

        CommonTree pre=null;
        CommonTree loc=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1305:2: ( ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1305:4: ^( NS (pre= ID )? loc= ID )
            {
            match(input,NS,FOLLOW_NS_in_ns_id5167); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1305:12: (pre= ID )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==ID) ) {
                int LA183_1 = input.LA(2);

                if ( (LA183_1==ID) ) {
                    alt183=1;
                }
            }
            switch (alt183) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1305:12: pre= ID
                    {
                    pre=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id5171); 

                    }
                    break;

            }

            loc=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id5176); 

            match(input, Token.UP, null); 
            // set return values (pre only when not null ;) )
            		
            		if (pre != null) {retval.nspre = (pre!=null?pre.getText():null);} 
            		retval.nsloc = (loc!=null?loc.getText():null);
            		retval.locID =loc;
            	


            // TEMPLATE REWRITE
            // 1312:2: -> ns_id(pre_opt=$preloc=$loc.text)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1315:1: portType : ^( PORTTYPE s= STRING ) -> portType(port=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.portType_return portType() throws RecognitionException {
        BPELscriptWalker.portType_return retval = new BPELscriptWalker.portType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1316:2: ( ^( PORTTYPE s= STRING ) -> portType(port=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1316:4: ^( PORTTYPE s= STRING )
            {
            match(input,PORTTYPE,FOLLOW_PORTTYPE_in_portType5211); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_portType5215); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1317:2: -> portType(port=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("portType",
              new STAttrMap().put("port", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1320:1: std_attr : ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure);
    public final BPELscriptWalker.std_attr_return std_attr() throws RecognitionException {
        BPELscriptWalker.std_attr_return retval = new BPELscriptWalker.std_attr_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree suppressJoinFailure=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:2: ( ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:4: ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? )
            {
            match(input,STD_ATTR,FOLLOW_STD_ATTR_in_std_attr5239); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:19: (name= STRING )?
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==STRING) ) {
                    alt184=1;
                }
                switch (alt184) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:19: name= STRING
                        {
                        name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_std_attr5243); 

                        }
                        break;

                }

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:47: (suppressJoinFailure= SJF )?
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==SJF) ) {
                    alt185=1;
                }
                switch (alt185) {
                    case 1 :
                        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1321:47: suppressJoinFailure= SJF
                        {
                        suppressJoinFailure=(CommonTree)match(input,SJF,FOLLOW_SJF_in_std_attr5248); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 1322:2: -> std_attr(name=$namesjf=$suppressJoinFailure)
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1325:1: msgEx : ^( MSGEX s= STRING ) -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.msgEx_return msgEx() throws RecognitionException {
        BPELscriptWalker.msgEx_return retval = new BPELscriptWalker.msgEx_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1326:2: ( ^( MSGEX s= STRING ) -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1326:4: ^( MSGEX s= STRING )
            {
            match(input,MSGEX,FOLLOW_MSGEX_in_msgEx5278); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgEx5282); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1327:2: -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("msgEx",
              new STAttrMap().put("msgEx", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1330:1: msgType : ^( MSGTYPE s= STRING ) -> msgType(msgT=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.msgType_return msgType() throws RecognitionException {
        BPELscriptWalker.msgType_return retval = new BPELscriptWalker.msgType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1331:2: ( ^( MSGTYPE s= STRING ) -> msgType(msgT=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1331:4: ^( MSGTYPE s= STRING )
            {
            match(input,MSGTYPE,FOLLOW_MSGTYPE_in_msgType5305); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgType5309); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1332:2: -> msgType(msgT=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("msgType",
              new STAttrMap().put("msgT", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1335:1: viType : ^( VITYPE s= STRING ) -> viType(type=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.viType_return viType() throws RecognitionException {
        BPELscriptWalker.viType_return retval = new BPELscriptWalker.viType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1336:2: ( ^( VITYPE s= STRING ) -> viType(type=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1336:4: ^( VITYPE s= STRING )
            {
            match(input,VITYPE,FOLLOW_VITYPE_in_viType5334); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viType5338); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1337:2: -> viType(type=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("viType",
              new STAttrMap().put("type", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1340:1: viElt : ^( VIELT s= STRING ) -> viElt(elt=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.viElt_return viElt() throws RecognitionException {
        BPELscriptWalker.viElt_return retval = new BPELscriptWalker.viElt_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1341:2: ( ^( VIELT s= STRING ) -> viElt(elt=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1341:4: ^( VIELT s= STRING )
            {
            match(input,VIELT,FOLLOW_VIELT_in_viElt5363); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viElt5367); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1342:2: -> viElt(elt=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("viElt",
              new STAttrMap().put("elt", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1345:1: faultName : ^( FAULTNAME s= STRING ) -> faultName(faultName=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.faultName_return faultName() throws RecognitionException {
        BPELscriptWalker.faultName_return retval = new BPELscriptWalker.faultName_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1346:2: ( ^( FAULTNAME s= STRING ) -> faultName(faultName=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1346:4: ^( FAULTNAME s= STRING )
            {
            match(input,FAULTNAME,FOLLOW_FAULTNAME_in_faultName5390); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultName5394); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1347:2: -> faultName(faultName=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("faultName",
              new STAttrMap().put("faultName", (s!=null?s.getText():null).replaceFirst(":", "")));
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
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1350:1: faultElt : ^( FAULTELT s= STRING ) -> faultElt(name=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.faultElt_return faultElt() throws RecognitionException {
        BPELscriptWalker.faultElt_return retval = new BPELscriptWalker.faultElt_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1351:2: ( ^( FAULTELT s= STRING ) -> faultElt(name=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1351:4: ^( FAULTELT s= STRING )
            {
            match(input,FAULTELT,FOLLOW_FAULTELT_in_faultElt5417); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultElt5421); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1352:2: -> faultElt(name=$s.text.replaceFirst(\":\", \"\"))
            {
                retval.st = templateLib.getInstanceOf("faultElt",
              new STAttrMap().put("name", (s!=null?s.getText():null).replaceFirst(":", "")));
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

    public static class exprLg_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exprLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1355:1: exprLg : ^( EXPRLG s= STRING ) -> exprLg(name=$s.text.replaceAll(\"::\", \":\"));
    public final BPELscriptWalker.exprLg_return exprLg() throws RecognitionException {
        BPELscriptWalker.exprLg_return retval = new BPELscriptWalker.exprLg_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1356:2: ( ^( EXPRLG s= STRING ) -> exprLg(name=$s.text.replaceAll(\"::\", \":\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1356:4: ^( EXPRLG s= STRING )
            {
            match(input,EXPRLG,FOLLOW_EXPRLG_in_exprLg5445); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_exprLg5449); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1357:2: -> exprLg(name=$s.text.replaceAll(\"::\", \":\"))
            {
                retval.st = templateLib.getInstanceOf("exprLg",
              new STAttrMap().put("name", (s!=null?s.getText():null).replaceAll("::", ":")));
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
    // $ANTLR end "exprLg"

    public static class queryLg_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "queryLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1360:1: queryLg : ^( QUERYLG s= STRING ) -> queryLg(name=$s.text.replaceAll(\"::\", \":\"));
    public final BPELscriptWalker.queryLg_return queryLg() throws RecognitionException {
        BPELscriptWalker.queryLg_return retval = new BPELscriptWalker.queryLg_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1361:2: ( ^( QUERYLG s= STRING ) -> queryLg(name=$s.text.replaceAll(\"::\", \":\")))
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscriptWalker.g:1361:4: ^( QUERYLG s= STRING )
            {
            match(input,QUERYLG,FOLLOW_QUERYLG_in_queryLg5473); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_queryLg5477); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1362:2: -> queryLg(name=$s.text.replaceAll(\"::\", \":\"))
            {
                retval.st = templateLib.getInstanceOf("queryLg",
              new STAttrMap().put("name", (s!=null?s.getText():null).replaceAll("::", ":")));
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
    // $ANTLR end "queryLg"

    // Delegated rules


    protected DFA141 dfa141 = new DFA141(this);
    static final String DFA141_eotS =
        "\14\uffff";
    static final String DFA141_eofS =
        "\14\uffff";
    static final String DFA141_minS =
        "\1\20\1\2\1\uffff\1\64\1\2\1\125\5\3\1\uffff";
    static final String DFA141_maxS =
        "\1\u00ce\1\2\1\uffff\1\64\1\2\2\125\1\64\1\3\2\u00ce\1\uffff";
    static final String DFA141_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA141_specialS =
        "\14\uffff}>";
    static final String[] DFA141_transitionS = {
            "\1\2\1\uffff\1\2\35\uffff\1\2\1\uffff\1\2\2\uffff\1\1\15\uffff"+
            "\1\2\6\uffff\2\2\6\uffff\1\2\3\uffff\3\2\4\uffff\4\2\5\uffff"+
            "\1\2\103\uffff\5\2\1\uffff\4\2\32\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\121\uffff\1\10",
            "\1\11\60\uffff\1\4",
            "\1\7",
            "\1\2\14\uffff\1\13\1\uffff\1\13\35\uffff\1\13\1\uffff\1\13"+
            "\2\uffff\1\13\15\uffff\1\13\6\uffff\2\13\6\uffff\1\13\3\uffff"+
            "\3\13\4\uffff\3\13\1\12\5\uffff\1\13\103\uffff\5\13\1\uffff"+
            "\4\13\32\uffff\1\13",
            "\1\2\14\uffff\1\13\1\uffff\1\13\35\uffff\1\13\1\uffff\1\13"+
            "\2\uffff\1\13\15\uffff\1\13\6\uffff\2\13\6\uffff\1\13\3\uffff"+
            "\3\13\4\uffff\3\13\6\uffff\1\13\103\uffff\5\13\1\uffff\4\13"+
            "\32\uffff\1\13",
            ""
    };

    static final short[] DFA141_eot = DFA.unpackEncodedString(DFA141_eotS);
    static final short[] DFA141_eof = DFA.unpackEncodedString(DFA141_eofS);
    static final char[] DFA141_min = DFA.unpackEncodedStringToUnsignedChars(DFA141_minS);
    static final char[] DFA141_max = DFA.unpackEncodedStringToUnsignedChars(DFA141_maxS);
    static final short[] DFA141_accept = DFA.unpackEncodedString(DFA141_acceptS);
    static final short[] DFA141_special = DFA.unpackEncodedString(DFA141_specialS);
    static final short[][] DFA141_transition;

    static {
        int numStates = DFA141_transitionS.length;
        DFA141_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA141_transition[i] = DFA.unpackEncodedString(DFA141_transitionS[i]);
        }
    }

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = DFA141_eot;
            this.eof = DFA141_eof;
            this.min = DFA141_min;
            this.max = DFA141_max;
            this.accept = DFA141_accept;
            this.special = DFA141_special;
            this.transition = DFA141_transition;
        }
        public String getDescription() {
            return "592:15: (pe= path_expr )?";
        }
    }
 

    public static final BitSet FOLLOW_ROOT_in_program115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_program119 = new BitSet(new long[]{0x0148000000000028L});
    public static final BitSet FOLLOW_process_in_declaration148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESS_in_process200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_process204 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_block_in_process206 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_eventHdl_in_process209 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_queryLg_in_process216 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_exprLg_in_process219 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_SJF_in_process222 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_EOSF_in_process225 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0090L});
    public static final BitSet FOLLOW_std_attr_in_process228 = new BitSet(new long[]{0x0000030000000008L});
    public static final BitSet FOLLOW_join_in_process232 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_signal_in_process237 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_PROC_STMTS_in_proc_stmts408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_proc_stmts412 = new BitSet(new long[]{0x0680714253BDE548L,0x0000000000000006L});
    public static final BitSet FOLLOW_signal_in_proc_stmts417 = new BitSet(new long[]{0x0680714253BDE548L,0x0000000000000006L});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pick_in_proc_stmt453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_proc_stmt577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reply_in_proc_stmt607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_proc_stmt622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_in_proc_stmt700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_proc_stmt717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validate_in_proc_stmt724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partnerlinks_in_proc_stmt741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nop_in_proc_stmt778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messages_in_proc_stmt793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opaque_in_proc_stmt806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_block832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_proc_stmts_in_block836 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_block865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block867 = new BitSet(new long[]{0x0148000000020028L});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block876 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_param_block909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_param_block913 = new BitSet(new long[]{0x0000000000020008L,0x0000000000200000L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block918 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_block_in_body954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICK_in_pick996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onMessage_in_pick1000 = new BitSet(new long[]{0x0000000080000008L,0x0000000000C40020L});
    public static final BitSet FOLLOW_onAlarm_in_pick1006 = new BitSet(new long[]{0x0000000000000008L,0x0000000000C40020L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick1009 = new BitSet(new long[]{0x0000000000000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_pick1014 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_pick1019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONALARM_in_onAlarm1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_alarm_in_onAlarm1079 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_timeout_in_onAlarm1083 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm1087 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm1090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALARM_in_alarm1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_alarm1142 = new BitSet(new long[]{0x0000000000000008L,0x0000000001870000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_alarm1148 = new BitSet(new long[]{0x0000000000000008L,0x0000000000870000L});
    public static final BitSet FOLLOW_queryLg_in_alarm1151 = new BitSet(new long[]{0x0000000000000008L,0x0000000000850000L});
    public static final BitSet FOLLOW_exprLg_in_alarm1154 = new BitSet(new long[]{0x0000000000000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_alarm1159 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_alarm1164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEOUT_in_timeout1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_timeout1253 = new BitSet(new long[]{0x0000000000000008L,0x0000000001870000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_timeout1259 = new BitSet(new long[]{0x0000000000000008L,0x0000000000870000L});
    public static final BitSet FOLLOW_queryLg_in_timeout1262 = new BitSet(new long[]{0x0000000000000008L,0x0000000000850000L});
    public static final BitSet FOLLOW_exprLg_in_timeout1265 = new BitSet(new long[]{0x0000000000000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_timeout1270 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_timeout1274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEATEVERY_in_repeatEvery1355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1359 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_repeatEvery1365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONMESSAGE_in_onMessage1414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_param_block_in_onMessage1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200408L});
    public static final BitSet FOLLOW_portType_in_onMessage1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200400L});
    public static final BitSet FOLLOW_msgEx_in_onMessage1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage1448 = new BitSet(new long[]{0x0000040400000008L});
    public static final BitSet FOLLOW_correlation_in_onMessage1452 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_onMessage1457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow1552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_flow1556 = new BitSet(new long[]{0x0000000000000080L,0x00000000000F0090L});
    public static final BitSet FOLLOW_std_attr_in_flow1560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_if_ex1605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1609 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1615 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_sequence_in_if_ex1620 = new BitSet(new long[]{0x0000000000001808L,0x0000000000870000L});
    public static final BitSet FOLLOW_ELSIF_in_if_ex1628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1632 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1638 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_sequence_in_if_ex1643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_if_ex1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_if_ex1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_if_ex1666 = new BitSet(new long[]{0x0000000000000008L,0x0000000000070000L});
    public static final BitSet FOLLOW_SJF_in_if_ex1671 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_if_ex1674 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_if_ex1677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNAL_in_signal1768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_signal1770 = new BitSet(new long[]{0x0025000000000008L,0x0000004001830000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expr_in_signal1774 = new BitSet(new long[]{0x0000000000000008L,0x0000000001030000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_signal1780 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_signal1783 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_signal1786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_join1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join1843 = new BitSet(new long[]{0x0025000000000008L,0x0000004001A30000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expr_in_join1848 = new BitSet(new long[]{0x0000000000000008L,0x0000000001030000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_join1854 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_join1857 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_join1860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequence1911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_sequence1915 = new BitSet(new long[]{0x0000000000020088L});
    public static final BitSet FOLLOW_body_in_sequence1920 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_signal_in_sequence1925 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_std_attr_in_sequence1928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_sequence1973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_scope_sequence1977 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1982 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_signal_in_scope_sequence1987 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_WHILE_in_while_ex2061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_ex2065 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_while_ex2071 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_sequence_in_while_ex2076 = new BitSet(new long[]{0x0000000000000008L,0x0000000000870000L});
    public static final BitSet FOLLOW_STRING_in_while_ex2081 = new BitSet(new long[]{0x0000000000000008L,0x0000000000070000L});
    public static final BitSet FOLLOW_SJF_in_while_ex2086 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_while_ex2089 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_while_ex2092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_until_ex2161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_until_ex2165 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_until_ex2171 = new BitSet(new long[]{0x0000000000000080L,0x00000000010F0090L});
    public static final BitSet FOLLOW_sequence_in_until_ex2176 = new BitSet(new long[]{0x0000000000000008L,0x0000000000870000L});
    public static final BitSet FOLLOW_STRING_in_until_ex2181 = new BitSet(new long[]{0x0000000000000008L,0x0000000000070000L});
    public static final BitSet FOLLOW_SJF_in_until_ex2186 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_until_ex2189 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_until_ex2192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_foreach2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_foreach2266 = new BitSet(new long[]{0xC025000011000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_expr_in_foreach2270 = new BitSet(new long[]{0xC025000011000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2276 = new BitSet(new long[]{0xC025000011000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_FINAL_in_foreach2284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_foreach2288 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BRANCH_in_foreach2306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_foreach2310 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_scope_short_in_foreach2325 = new BitSet(new long[]{0x0000000000000008L,0x0000000006870000L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach2327 = new BitSet(new long[]{0x0000000000000008L,0x0000000004870000L});
    public static final BitSet FOLLOW_SBO_in_foreach2330 = new BitSet(new long[]{0x0000000000000008L,0x0000000000870000L});
    public static final BitSet FOLLOW_STRING_in_foreach2335 = new BitSet(new long[]{0x0000000000000008L,0x0000000000070000L});
    public static final BitSet FOLLOW_SJF_in_foreach2340 = new BitSet(new long[]{0x0000000000000008L,0x0000000000030000L});
    public static final BitSet FOLLOW_queryLg_in_foreach2343 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_exprLg_in_foreach2346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_try_ex2462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex2466 = new BitSet(new long[]{0x0000000004020088L});
    public static final BitSet FOLLOW_body_in_try_ex2472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catch_ex2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex2506 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_param_block_in_catch_ex2511 = new BitSet(new long[]{0x0000000000000008L,0x0000000000808000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex2516 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex2519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_ex2546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_scope_ex2550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex2555 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex2560 = new BitSet(new long[]{0x0000000000000008L,0x00000000080C0000L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex2563 = new BitSet(new long[]{0x0000000000000008L,0x00000000000C0000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex2566 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex2569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_short2636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short2640 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short2644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_stmt2670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt2674 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000280L});
    public static final BitSet FOLLOW_termination_in_scope_stmt2679 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt2684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATION_in_termination2710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_termination2712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENTHDL_in_eventHdl2735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2739 = new BitSet(new long[]{0x0000000020000008L,0x0000000000C40020L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2744 = new BitSet(new long[]{0x0000000000000008L,0x0000000000C40020L});
    public static final BitSet FOLLOW_EVENT_in_onEvent2766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_onEvent2770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onEvent2774 = new BitSet(new long[]{0xC025040411000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_correlation_in_onEvent2778 = new BitSet(new long[]{0xC025040411000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_with_ex_in_onEvent2783 = new BitSet(new long[]{0xC025040411000000L,0x0000004001800040L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_scope_short_in_onEvent2788 = new BitSet(new long[]{0x0000000000000008L,0x0000000000205408L});
    public static final BitSet FOLLOW_ID_in_onEvent2795 = new BitSet(new long[]{0x0000000000000008L,0x0000000000005408L});
    public static final BitSet FOLLOW_portType_in_onEvent2798 = new BitSet(new long[]{0x0000000000000008L,0x0000000000005400L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2801 = new BitSet(new long[]{0x0000000000000008L,0x0000000000005000L});
    public static final BitSet FOLLOW_msgType_in_onEvent2804 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_viElt_in_onEvent2807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATION_in_compensation2844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_compensation2846 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_in_with_ex2877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_map_in_with_ex2881 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_MAP_in_with_map2920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_with_map2922 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KEY_in_with_map2924 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_path_expr_in_with_map2929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECEIVE_in_receive2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_receive2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_receive2966 = new BitSet(new long[]{0x0000040400000008L,0x0000000000C40408L});
    public static final BitSet FOLLOW_correlation_in_receive2970 = new BitSet(new long[]{0x0000040000000008L,0x0000000000C40408L});
    public static final BitSet FOLLOW_portType_in_receive2975 = new BitSet(new long[]{0x0000040000000008L,0x0000000000C40400L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2980 = new BitSet(new long[]{0x0000040000000008L,0x0000000000840400L});
    public static final BitSet FOLLOW_msgEx_in_receive2983 = new BitSet(new long[]{0x0000040000000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_receive2988 = new BitSet(new long[]{0x0000040000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_receive2993 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_receive2998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLY_in_reply3099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reply3103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply3107 = new BitSet(new long[]{0x0000040400000008L,0x0000000000A40C08L});
    public static final BitSet FOLLOW_ID_in_reply3111 = new BitSet(new long[]{0x0000040400000008L,0x0000000000840C08L});
    public static final BitSet FOLLOW_correlation_in_reply3116 = new BitSet(new long[]{0x0000040000000008L,0x0000000000840C08L});
    public static final BitSet FOLLOW_portType_in_reply3119 = new BitSet(new long[]{0x0000040000000008L,0x0000000000840C00L});
    public static final BitSet FOLLOW_STRING_in_reply3124 = new BitSet(new long[]{0x0000040000000008L,0x0000000000040C00L});
    public static final BitSet FOLLOW_SJF_in_reply3129 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000C00L});
    public static final BitSet FOLLOW_faultName_in_reply3134 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_msgEx_in_reply3137 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_reply3142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_invoke3249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_invoke3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke3257 = new BitSet(new long[]{0x0000040500000008L,0x0000000000A40008L});
    public static final BitSet FOLLOW_ID_in_invoke3261 = new BitSet(new long[]{0x0000040500000008L,0x0000000000840008L});
    public static final BitSet FOLLOW_correlation_in_invoke3266 = new BitSet(new long[]{0x0000040100000008L,0x0000000000840008L});
    public static final BitSet FOLLOW_portType_in_invoke3269 = new BitSet(new long[]{0x0000040100000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_invoke3274 = new BitSet(new long[]{0x0000040100000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_invoke3279 = new BitSet(new long[]{0x0000040100000008L});
    public static final BitSet FOLLOW_with_ex_in_invoke3284 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_compensation_in_invoke3287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assign3389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_expr_in_assign3393 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PROP_in_assign3396 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_assign3399 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_portType_in_assign3402 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign3405 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_assign3411 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_assign3416 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_faultName_in_assign3419 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_msgEx_in_assign3422 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_VALID_in_assign3425 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign3428 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IGNORE_in_assign3431 = new BitSet(new long[]{0x0025000000050000L,0x00000041E1C40C08L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rvalue_in_assign3441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_receive_in_rvalue3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue3650 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_rvalue3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throw_ex3914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex3916 = new BitSet(new long[]{0x0000000000000008L,0x0000000000A40000L});
    public static final BitSet FOLLOW_ID_in_throw_ex3920 = new BitSet(new long[]{0x0000000000000008L,0x0000000000840000L});
    public static final BitSet FOLLOW_STRING_in_throw_ex3925 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_throw_ex3930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETHROW_in_rethrow_ex4004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex4006 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATE_in_compensate4056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_compensate4060 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_std_attr_in_compensate4063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_exit4113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_exit4115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALIDATE_in_validate4161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_validate4165 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000002F0096L});
    public static final BitSet FOLLOW_std_attr_in_validate4168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSIONACT_in_ext_act4223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act4227 = new BitSet(new long[]{0x0680714253BDE548L,0x00000000000F0096L});
    public static final BitSet FOLLOW_std_attr_in_ext_act4229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOP_in_nop4278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_nop4280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPAQUE_in_opaque4326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_opaque4328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace4376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_namespace4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_namespace4382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension4412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension4414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_extension4418 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L});
    public static final BitSet FOLLOW_MUSTUND_in_extension4420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_imports4442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_imports4447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_imports4451 = new BitSet(new long[]{0x0000000000000008L,0x0000000000202000L});
    public static final BitSet FOLLOW_ID_in_imports4456 = new BitSet(new long[]{0x0000000000000008L,0x0000000000002000L});
    public static final BitSet FOLLOW_viType_in_imports4459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MESSAGES_in_messages4478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_message_in_messages4480 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_MESSAGE_in_message4498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_message4500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLES_in_variables4519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variables4521 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_variable4538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variable4542 = new BitSet(new long[]{0x0000040000000008L,0x0000000000007000L});
    public static final BitSet FOLLOW_msgType_in_variable4546 = new BitSet(new long[]{0x0000040000000008L,0x0000000000006000L});
    public static final BitSet FOLLOW_viType_in_variable4551 = new BitSet(new long[]{0x0000040000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_viElt_in_variable4556 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_variable4561 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTNERLINKS_in_partnerlinks4581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_partnerlink_in_partnerlinks4583 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_PID_in_partnerlink4597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_partnerlink4599 = new BitSet(new long[]{0x0010000000000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink4603 = new BitSet(new long[]{0x0010000000000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink4608 = new BitSet(new long[]{0x0010000000000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink4613 = new BitSet(new long[]{0x0000000000000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partnerlink4618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORRSETS_in_corr_sets4637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets4641 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CORRSET_in_corr_set4655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_set4659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_corr_set4663 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_CORRELATION_in_correlation4681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation4685 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_CORR_MAP_in_corr_mapping4713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_mapping4715 = new BitSet(new long[]{0x0000000000000008L,0x0000003000000000L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping4719 = new BitSet(new long[]{0x0000000000000008L,0x0000002000000000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping4724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_s_expr_in_expr4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_funct_call4852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funct_call4856 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_170_in_s_expr4892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4896 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_171_in_s_expr4911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4915 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_172_in_s_expr4930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4934 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_173_in_s_expr4949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4953 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_174_in_s_expr4968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4972 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_206_in_s_expr4987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4991 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_176_in_s_expr5006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5010 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_177_in_s_expr5025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5029 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5034 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_178_in_s_expr5044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5048 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_179_in_s_expr5063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5067 = new BitSet(new long[]{0x0020000000000000L,0x0000004010800000L,0x000F7C0000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_s_expr_in_s_expr5072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_s_expr5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_s_expr5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_s_expr5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_expr5127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_path_expr5131 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_NS_in_ns_id5167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ns_id5171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ns_id5176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORTTYPE_in_portType5211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_portType5215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STD_ATTR_in_std_attr5239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_std_attr5243 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_SJF_in_std_attr5248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGEX_in_msgEx5278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgEx5282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGTYPE_in_msgType5305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgType5309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VITYPE_in_viType5334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viType5338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VIELT_in_viElt5363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viElt5367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTNAME_in_faultName5390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultName5394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTELT_in_faultElt5417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultElt5421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRLG_in_exprLg5445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_exprLg5449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERYLG_in_queryLg5473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_queryLg5477 = new BitSet(new long[]{0x0000000000000008L});

}