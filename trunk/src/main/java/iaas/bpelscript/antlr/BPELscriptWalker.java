// $ANTLR 3.1b2 /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g 2008-12-10 11:47:58

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:155:1: program : ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls);
    public final BPELscriptWalker.program_return program() throws RecognitionException {
        BPELscriptWalker.program_return retval = new BPELscriptWalker.program_return();
        retval.start = input.LT(1);

        List list_decls=null;
        RuleReturnScope decls = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:156:2: ( ^( ROOT (decls+= declaration )+ ) -> list(content_st=$decls))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:156:4: ^( ROOT (decls+= declaration )+ )
            {
            match(input,ROOT,FOLLOW_ROOT_in_program115); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:156:16: (decls+= declaration )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:156:16: decls+= declaration
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:161:1: declaration : ( process -> decl(name_st=$process.st) | sub_declaration );
    public final BPELscriptWalker.declaration_return declaration() throws RecognitionException {
        BPELscriptWalker.declaration_return retval = new BPELscriptWalker.declaration_return();
        retval.start = input.LT(1);

        BPELscriptWalker.process_return process1 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:162:2: ( process -> decl(name_st=$process.st) | sub_declaration )
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:162:4: process
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:163:4: sub_declaration
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:166:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptWalker.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptWalker.sub_declaration_return retval = new BPELscriptWalker.sub_declaration_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:167:2: ( namespace | extension | imports )
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:167:4: namespace
                    {
                    pushFollow(FOLLOW_namespace_in_sub_declaration175);
                    namespace();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:167:16: extension
                    {
                    pushFollow(FOLLOW_extension_in_sub_declaration179);
                    extension();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:167:28: imports
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:170:1: process : ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s);
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:181:2: ( ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* ) -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:181:4: ^( PROCESS ns= ns_id block[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( eventHdl )? (queryLg= STRING )? (exprLg= STRING )? ( SJF )? ( EOSF )? std_attr (j+= join )? (s+= signal )* )
            {
            match(input,PROCESS,FOLLOW_PROCESS_in_process200); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_process204);
            ns=ns_id();

            state._fsp--;

            pushFollow(FOLLOW_block_in_process206);
            block2=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:181:78: ( eventHdl )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EVENTHDL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:181:78: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process209);
                    eventHdl5=eventHdl();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:11: (queryLg= STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:11: queryLg= STRING
                    {
                    queryLg=(CommonTree)match(input,STRING,FOLLOW_STRING_in_process218); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:26: (exprLg= STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:26: exprLg= STRING
                    {
                    exprLg=(CommonTree)match(input,STRING,FOLLOW_STRING_in_process223); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:35: ( SJF )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SJF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:35: SJF
                    {
                    SJF3=(CommonTree)match(input,SJF,FOLLOW_SJF_in_process226); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:40: ( EOSF )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOSF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:40: EOSF
                    {
                    EOSF4=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_process229); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_process232);
            std_attr6=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:56: (j+= join )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==JOIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:56: j+= join
                    {
                    pushFollow(FOLLOW_join_in_process236);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:65: (s+= signal )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==SIGNAL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:182:65: s+= signal
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
            // 192:2: -> process(name=$ns.nsloctns=glob_ns.get($ns.nspre)local=loc_nscontent_st=$block.stqueryLg=$queryLgexprLg=$exprLgsjf=$SJFeOSF=$EOSFexts=extensionsimports=importsplinks_p=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbeventHdl=$eventHdl.ststd_attr=$std_attr.stjoin=$jsignal=$s)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:200:1: proc_stmts[Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st);
    public final BPELscriptWalker.proc_stmts_return proc_stmts(Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmts_return retval = new BPELscriptWalker.proc_stmts_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.proc_stmt_return p = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:2: ( ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] ) -> list(content_st=$proc_stmt.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:4: ^( PROC_STMTS (j+= join )? (s+= signal )* p= proc_stmt[$j, $s, isInScope, _vars, _pl, _messages, _cs, _faults, _faults_pb] )
            {
            match(input,PROC_STMTS,FOLLOW_PROC_STMTS_in_proc_stmts412); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:18: (j+= join )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==JOIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:18: j+= join
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts416);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:27: (s+= signal )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SIGNAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:202:27: s+= signal
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

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts426);
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:206:1: proc_stmt[List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, \n\t\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$until_ex.st) | foreach[join, signal, comments] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments] -> list(content_st=$try_ex.st) | scope_ex[join, signal, comments] -> list(content_st=$scope_ex.st) | receive[join, signal, empty, comments] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb, comments] -> list(content_st=$invoke.st) | reply[join, signal, empty, comments] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null, comments] -> list(content_st=$assign.st) | throw_ex[join, signal, empty, comments] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty, comments] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true, comments] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true, comments] -> list(content_st=$timeout.st) | exit[join, signal, empty, comments] -> list(content_st=$exit.st) | variables[_vars, isInScope, comments] | validate[join, signal, empty, _vars, comments] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope, comments] | compensate[join, signal, empty, comments] -> list(content_st=$compensate.st) | ext_act[join, signal, comments] -> list(content_st=$ext_act.st) | nop[join, signal, empty, comments] -> list(content_st=$nop.st) | messages[_messages, isInScope, comments] | corr_sets[_cs, isInScope, comments] );
    public final BPELscriptWalker.proc_stmt_return proc_stmt(List join, List signal, Boolean isInScope, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.proc_stmt_return retval = new BPELscriptWalker.proc_stmt_return();
        retval.start = input.LT(1);

        BPELscriptWalker.partnerlinks_return pl = null;

        BPELscriptWalker.pick_return pick7 = null;

        BPELscriptWalker.flow_return flow8 = null;

        BPELscriptWalker.if_ex_return if_ex9 = null;

        BPELscriptWalker.while_ex_return while_ex10 = null;

        BPELscriptWalker.until_ex_return until_ex11 = null;

        BPELscriptWalker.foreach_return foreach12 = null;

        BPELscriptWalker.try_ex_return try_ex13 = null;

        BPELscriptWalker.scope_ex_return scope_ex14 = null;

        BPELscriptWalker.receive_return receive15 = null;

        BPELscriptWalker.invoke_return invoke16 = null;

        BPELscriptWalker.reply_return reply17 = null;

        BPELscriptWalker.assign_return assign18 = null;

        BPELscriptWalker.throw_ex_return throw_ex19 = null;

        BPELscriptWalker.rethrow_ex_return rethrow_ex20 = null;

        BPELscriptWalker.alarm_return alarm21 = null;

        BPELscriptWalker.timeout_return timeout22 = null;

        BPELscriptWalker.exit_return exit23 = null;

        BPELscriptWalker.validate_return validate24 = null;

        BPELscriptWalker.compensate_return compensate25 = null;

        BPELscriptWalker.ext_act_return ext_act26 = null;

        BPELscriptWalker.nop_return nop27 = null;


        boolean empty= join==null && signal==null;
        	List comments = getComments(retval);
        	if (comments!=null && !comments.isEmpty()) empty=false;
        	
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:212:2: ( pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$pick.st) | flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$flow.st) | if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$if_ex.st) | while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$while_ex.st) | until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments] -> list(content_st=$until_ex.st) | foreach[join, signal, comments] -> list(content_st=$foreach.st) | try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments] -> list(content_st=$try_ex.st) | scope_ex[join, signal, comments] -> list(content_st=$scope_ex.st) | receive[join, signal, empty, comments] -> list(content_st=$receive.st) | invoke[join, signal, empty, _faults, _faults_pb, comments] -> list(content_st=$invoke.st) | reply[join, signal, empty, comments] -> list(content_st=$reply.st) | assign[join, signal, empty, _vars, _pl, null, null, comments] -> list(content_st=$assign.st) | throw_ex[join, signal, empty, comments] -> list(content_st=$throw_ex.st) | rethrow_ex[join, signal, empty, comments] -> list(content_st=$rethrow_ex.st) | alarm[join, signal, empty, true, comments] -> list(content_st=$alarm.st) | timeout[join, signal, empty, true, comments] -> list(content_st=$timeout.st) | exit[join, signal, empty, comments] -> list(content_st=$exit.st) | variables[_vars, isInScope, comments] | validate[join, signal, empty, _vars, comments] -> list(content_st=$validate.st) | pl= partnerlinks[_pl, isInScope, comments] | compensate[join, signal, empty, comments] -> list(content_st=$compensate.st) | ext_act[join, signal, comments] -> list(content_st=$ext_act.st) | nop[join, signal, empty, comments] -> list(content_st=$nop.st) | messages[_messages, isInScope, comments] | corr_sets[_cs, isInScope, comments] )
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:212:4: pick[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_pick_in_proc_stmt457);
                    pick7=pick(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 212:82: -> list(content_st=$pick.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (pick7!=null?pick7.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:213:4: flow[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_flow_in_proc_stmt473);
                    flow8=flow(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 213:82: -> list(content_st=$flow.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (flow8!=null?flow8.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:214:4: if_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_if_ex_in_proc_stmt489);
                    if_ex9=if_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 214:83: -> list(content_st=$if_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (if_ex9!=null?if_ex9.st:null)));
                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:215:4: while_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_while_ex_in_proc_stmt504);
                    while_ex10=while_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 215:86: -> list(content_st=$while_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (while_ex10!=null?while_ex10.st:null)));
                    }


                    }
                    break;
                case 5 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:216:4: until_ex[join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_until_ex_in_proc_stmt520);
                    until_ex11=until_ex(join, signal, _vars, _pl, _messages, _cs, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 216:86: -> list(content_st=$until_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (until_ex11!=null?until_ex11.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:217:4: foreach[join, signal, comments]
                    {
                    pushFollow(FOLLOW_foreach_in_proc_stmt536);
                    foreach12=foreach(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 217:36: -> list(content_st=$foreach.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (foreach12!=null?foreach12.st:null)));
                    }


                    }
                    break;
                case 7 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:218:4: try_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments]
                    {
                    pushFollow(FOLLOW_try_ex_in_proc_stmt551);
                    try_ex13=try_ex(_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 218:81: -> list(content_st=$try_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (try_ex13!=null?try_ex13.st:null)));
                    }


                    }
                    break;
                case 8 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:219:4: scope_ex[join, signal, comments]
                    {
                    pushFollow(FOLLOW_scope_ex_in_proc_stmt566);
                    scope_ex14=scope_ex(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 219:37: -> list(content_st=$scope_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (scope_ex14!=null?scope_ex14.st:null)));
                    }


                    }
                    break;
                case 9 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:220:4: receive[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_receive_in_proc_stmt581);
                    receive15=receive(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 220:43: -> list(content_st=$receive.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (receive15!=null?receive15.st:null)));
                    }


                    }
                    break;
                case 10 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:221:4: invoke[join, signal, empty, _faults, _faults_pb, comments]
                    {
                    pushFollow(FOLLOW_invoke_in_proc_stmt596);
                    invoke16=invoke(join, signal, empty, _faults, _faults_pb, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 221:63: -> list(content_st=$invoke.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (invoke16!=null?invoke16.st:null)));
                    }


                    }
                    break;
                case 11 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:222:4: reply[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_reply_in_proc_stmt611);
                    reply17=reply(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 222:41: -> list(content_st=$reply.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (reply17!=null?reply17.st:null)));
                    }


                    }
                    break;
                case 12 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:223:4: assign[join, signal, empty, _vars, _pl, null, null, comments]
                    {
                    pushFollow(FOLLOW_assign_in_proc_stmt626);
                    assign18=assign(join, signal, empty, _vars, _pl, null, null, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 223:66: -> list(content_st=$assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (assign18!=null?assign18.st:null)));
                    }


                    }
                    break;
                case 13 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:224:4: throw_ex[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_throw_ex_in_proc_stmt642);
                    throw_ex19=throw_ex(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 224:44: -> list(content_st=$throw_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (throw_ex19!=null?throw_ex19.st:null)));
                    }


                    }
                    break;
                case 14 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:225:4: rethrow_ex[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_rethrow_ex_in_proc_stmt657);
                    rethrow_ex20=rethrow_ex(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 225:46: -> list(content_st=$rethrow_ex.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (rethrow_ex20!=null?rethrow_ex20.st:null)));
                    }


                    }
                    break;
                case 15 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:226:4: alarm[join, signal, empty, true, comments]
                    {
                    pushFollow(FOLLOW_alarm_in_proc_stmt672);
                    alarm21=alarm(join, signal, empty, true, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 226:47: -> list(content_st=$alarm.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (alarm21!=null?alarm21.st:null)));
                    }


                    }
                    break;
                case 16 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:227:4: timeout[join, signal, empty, true, comments]
                    {
                    pushFollow(FOLLOW_timeout_in_proc_stmt688);
                    timeout22=timeout(join, signal, empty, true, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 227:49: -> list(content_st=$timeout.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (timeout22!=null?timeout22.st:null)));
                    }


                    }
                    break;
                case 17 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:228:4: exit[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_exit_in_proc_stmt704);
                    exit23=exit(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 228:41: -> list(content_st=$exit.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (exit23!=null?exit23.st:null)));
                    }


                    }
                    break;
                case 18 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:229:4: variables[_vars, isInScope, comments]
                    {
                    pushFollow(FOLLOW_variables_in_proc_stmt721);
                    variables(_vars, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:230:4: validate[join, signal, empty, _vars, comments]
                    {
                    pushFollow(FOLLOW_validate_in_proc_stmt728);
                    validate24=validate(join, signal, empty, _vars, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 230:51: -> list(content_st=$validate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (validate24!=null?validate24.st:null)));
                    }


                    }
                    break;
                case 20 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:231:4: pl= partnerlinks[_pl, isInScope, comments]
                    {
                    pushFollow(FOLLOW_partnerlinks_in_proc_stmt745);
                    pl=partnerlinks(_pl, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 21 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:232:4: compensate[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_compensate_in_proc_stmt752);
                    compensate25=compensate(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 232:46: -> list(content_st=$compensate.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (compensate25!=null?compensate25.st:null)));
                    }


                    }
                    break;
                case 22 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:233:4: ext_act[join, signal, comments]
                    {
                    pushFollow(FOLLOW_ext_act_in_proc_stmt767);
                    ext_act26=ext_act(join, signal, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 233:36: -> list(content_st=$ext_act.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (ext_act26!=null?ext_act26.st:null)));
                    }


                    }
                    break;
                case 23 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:234:4: nop[join, signal, empty, comments]
                    {
                    pushFollow(FOLLOW_nop_in_proc_stmt782);
                    nop27=nop(join, signal, empty, comments);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 234:39: -> list(content_st=$nop.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (nop27!=null?nop27.st:null)));
                    }


                    }
                    break;
                case 24 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:235:4: messages[_messages, isInScope, comments]
                    {
                    pushFollow(FOLLOW_messages_in_proc_stmt797);
                    messages(_messages, isInScope, comments);

                    state._fsp--;


                    }
                    break;
                case 25 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:236:4: corr_sets[_cs, isInScope, comments]
                    {
                    pushFollow(FOLLOW_corr_sets_in_proc_stmt804);
                    corr_sets(_cs, isInScope, comments);

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:240:1: block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.block_return block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.block_return retval = new BPELscriptWalker.block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:2: ( ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:4: ^( SEQUENCE (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_block821); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:17: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:242:17: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block825);
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
            // 243:2: -> block(stmts_p=$ps)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:247:1: scope_block[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps);
    public final BPELscriptWalker.scope_block_return scope_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.scope_block_return retval = new BPELscriptWalker.scope_block_return();
        retval.start = input.LT(1);

        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:249:2: ( ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(stmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:249:4: ^( SEQUENCE ( sub_declaration )* (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_block854); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:249:15: ( sub_declaration )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NAMESPACE||LA15_0==EXTENSION||LA15_0==IMPORT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:249:15: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block856);
            	    sub_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:6: (ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:250:6: ps+= proc_stmts[true, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block865);
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
            // 251:2: -> block(stmts_p=$ps)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:254:1: param_block[ HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] returns [List param_ids] : ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps);
    public final BPELscriptWalker.param_block_return param_block(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.param_block_return retval = new BPELscriptWalker.param_block_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;
        List list_ps=null;
        RuleReturnScope ps = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:2: ( ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ ) -> block(ids=$idsstmts_p=$ps))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:4: ^( SEQUENCE (ids+= ID )* (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+ )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_param_block898); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:18: (ids+= ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:18: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_param_block902); 
            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:26: (ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:257:26: ps+= proc_stmts[false, _vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block907);
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
            // 261:2: -> block(ids=$idsstmts_p=$ps)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:264:1: body[\tHashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st));
    public final BPELscriptWalker.body_return body(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.body_return retval = new BPELscriptWalker.body_return();
        retval.start = input.LT(1);

        BPELscriptWalker.block_return block28 = null;

        BPELscriptWalker.proc_stmts_return proc_stmts29 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:266:2: ( block[_vars, _pl, _messages, _cs, _faults, _faults_pb] -> list(content_st=$block.st) | proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb] -> list(content_st=$proc_stmts.st))
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:266:4: block[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                    {
                    pushFollow(FOLLOW_block_in_body943);
                    block28=block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 266:59: -> list(content_st=$block.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (block28!=null?block28.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:267:5: proc_stmts[false,_vars,_pl,_messages,_cs,_faults,_faults_pb]
                    {
                    pushFollow(FOLLOW_proc_stmts_in_body960);
                    proc_stmts29=proc_stmts(false, _vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 267:66: -> list(content_st=$proc_stmts.st)
                    {
                        retval.st = templateLib.getInstanceOf("list",
                      new STAttrMap().put("content_st", (proc_stmts29!=null?proc_stmts29.st:null)));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:271:1: pick[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments] : ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.pick_return pick(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.pick_return retval = new BPELscriptWalker.pick_return();
        retval.start = input.LT(1);

        CommonTree CREATE_INST30=null;
        List list_om=null;
        List list_to=null;
        BPELscriptWalker.std_attr_return std_attr31 = null;

        RuleReturnScope om = null;
        RuleReturnScope to = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:2: ( ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr ) -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:4: ^( PICK (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ (to+= onAlarm )* ( CREATE_INST )? std_attr )
            {
            match(input,PICK,FOLLOW_PICK_in_pick985); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:13: (om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:13: om+= onMessage[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick989);
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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:77: (to+= onAlarm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ONALARM) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:77: to+= onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick995);
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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:88: ( CREATE_INST )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==CREATE_INST) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:273:88: CREATE_INST
                    {
                    CREATE_INST30=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick998); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_pick1001);
            std_attr31=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 274:2: -> pick(oms=$omonalarm=$tojoin=$joinsignal=$signalcrt_inst=$CREATE_INSTstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("pick",
              new STAttrMap().put("oms", list_om).put("onalarm", list_to).put("join", join).put("signal", signal).put("crt_inst", CREATE_INST30).put("std_attr", (std_attr31!=null?std_attr31.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:277:1: onAlarm : ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st);
    public final BPELscriptWalker.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptWalker.onAlarm_return retval = new BPELscriptWalker.onAlarm_return();
        retval.start = input.LT(1);

        BPELscriptWalker.alarm_return alarm32 = null;

        BPELscriptWalker.timeout_return timeout33 = null;

        BPELscriptWalker.repeatEvery_return repeatEvery34 = null;

        BPELscriptWalker.scope_short_return scope_short35 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:2: ( ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short ) -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:4: ^( ONALARM ( alarm[null, null, true, false, null] )? ( timeout[null, null, true, false, null] )? ( repeatEvery )? scope_short )
            {
            match(input,ONALARM,FOLLOW_ONALARM_in_onAlarm1055); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:14: ( alarm[null, null, true, false, null] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ALARM) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:14: alarm[null, null, true, false, null]
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm1057);
                    alarm32=alarm(null, null, true, false, null);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:52: ( timeout[null, null, true, false, null] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TIMEOUT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:52: timeout[null, null, true, false, null]
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm1061);
                    timeout33=timeout(null, null, true, false, null);

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:92: ( repeatEvery )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==REPEATEVERY) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:278:92: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm1065);
                    repeatEvery34=repeatEvery();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onAlarm1068);
            scope_short35=scope_short();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 279:2: -> onAlarm(alarm=$alarm.sttimeout=$timeout.strepeat=$repeatEvery.stscope_ex=$scope_short.st)
            {
                retval.st = templateLib.getInstanceOf("onAlarm",
              new STAttrMap().put("alarm", (alarm32!=null?alarm32.st:null)).put("timeout", (timeout33!=null?timeout33.st:null)).put("repeat", (repeatEvery34!=null?repeatEvery34.st:null)).put("scope_ex", (scope_short35!=null?scope_short35.st:null)));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:282:1: alarm[List join, List signal, Boolean empty, Boolean isWait, List comments] : ^( ALARM expr[null] ( std_attr )? ) -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments);
    public final BPELscriptWalker.alarm_return alarm(List join, List signal, Boolean empty, Boolean isWait, List comments) throws RecognitionException {
        BPELscriptWalker.alarm_return retval = new BPELscriptWalker.alarm_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr36 = null;

        BPELscriptWalker.std_attr_return std_attr37 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:283:2: ( ^( ALARM expr[null] ( std_attr )? ) -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:283:4: ^( ALARM expr[null] ( std_attr )? )
            {
            match(input,ALARM,FOLLOW_ALARM_in_alarm1116); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_alarm1118);
            expr36=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:283:23: ( std_attr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==STD_ATTR) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:283:23: std_attr
                    {
                    pushFollow(FOLLOW_std_attr_in_alarm1121);
                    std_attr37=std_attr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 284:2: -> wait(art=\"for\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "for").put("expr", (expr36!=null?expr36.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr37!=null?std_attr37.st:null)).put("isWait", isWait).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:287:1: timeout[List join, List signal, Boolean empty, Boolean isWait, List comments] : ^( TIMEOUT expr[null] ( std_attr )? ) -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments);
    public final BPELscriptWalker.timeout_return timeout(List join, List signal, Boolean empty, Boolean isWait, List comments) throws RecognitionException {
        BPELscriptWalker.timeout_return retval = new BPELscriptWalker.timeout_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr38 = null;

        BPELscriptWalker.std_attr_return std_attr39 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:288:2: ( ^( TIMEOUT expr[null] ( std_attr )? ) -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:288:4: ^( TIMEOUT expr[null] ( std_attr )? )
            {
            match(input,TIMEOUT,FOLLOW_TIMEOUT_in_timeout1184); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_timeout1186);
            expr38=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:288:25: ( std_attr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==STD_ATTR) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:288:25: std_attr
                    {
                    pushFollow(FOLLOW_std_attr_in_timeout1189);
                    std_attr39=std_attr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 289:2: -> wait(art=\"until\"expr=$expr.stjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stisWait=isWaitcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "until").put("expr", (expr38!=null?expr38.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr39!=null?std_attr39.st:null)).put("isWait", isWait).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:292:1: repeatEvery : ^( REPEATEVERY expr[null] ) -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\");
    public final BPELscriptWalker.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptWalker.repeatEvery_return retval = new BPELscriptWalker.repeatEvery_return();
        retval.start = input.LT(1);

        BPELscriptWalker.expr_return expr40 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:293:2: ( ^( REPEATEVERY expr[null] ) -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\"))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:293:4: ^( REPEATEVERY expr[null] )
            {
            match(input,REPEATEVERY,FOLLOW_REPEATEVERY_in_repeatEvery1249); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repeatEvery1251);
            expr40=expr(null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 294:2: -> wait(art=\"repeatEvery\"expr=$expr.stskip=\"true\")
            {
                retval.st = templateLib.getInstanceOf("wait",
              new STAttrMap().put("art", "repeatEvery").put("expr", (expr40!=null?expr40.st:null)).put("skip", "true"));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:297:1: onMessage[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\tHashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb] : ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st);
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:299:9: ( ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? ) -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:299:12: ^( ONMESSAGE pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (pt= portType )? (mex= msgEx )? p= ID o= ID (corr= correlation )? (w= with_ex )? )
            {
            match(input,ONMESSAGE,FOLLOW_ONMESSAGE_in_onMessage1295); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_param_block_in_onMessage1299);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:13: (pt= portType )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==PORTTYPE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:13: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_onMessage1315);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:27: (mex= msgEx )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==MSGEX) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:27: mex= msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onMessage1320);
                    mex=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1325); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onMessage1329); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:49: (corr= correlation )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CORRELATION) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:49: corr= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onMessage1333);
                    corr=correlation();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:64: (w= with_ex )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==WITH) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:300:64: w= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage1338);
                    w=with_ex();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 301:9: -> receive(rec_name=\"onMessage\"path_st=$pb.param_idspb=$pb.stpartner=$p.textop=$o.textportType=$pt.stmsgEx=$mex.stcorrelation_opt=$corr.stwith_ex=$w.st)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:305:1: flow[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.flow_return flow(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.flow_return retval = new BPELscriptWalker.flow_return();
        retval.start = input.LT(1);

        List list_s=null;
        BPELscriptWalker.std_attr_return std_attr41 = null;

        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:307:2: ( ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr ) -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:307:5: ^( FLOW (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+ std_attr )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow1433); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:307:13: (s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:307:13: s+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb]
            	    {
            	    pushFollow(FOLLOW_sequence_in_flow1437);
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

            pushFollow(FOLLOW_std_attr_in_flow1441);
            std_attr41=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 308:2: -> flow(sequence=$sjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("flow",
              new STAttrMap().put("sequence", list_s).put("join", join).put("signal", signal).put("std_attr", (std_attr41!=null?std_attr41.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:311:1: if_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr ) -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.if_ex_return if_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.if_ex_return retval = new BPELscriptWalker.if_ex_return();
        retval.start = input.LT(1);

        List list_eiex=null;
        List list_sie=null;
        BPELscriptWalker.expr_return iex = null;

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.sequence_return se = null;

        BPELscriptWalker.std_attr_return std_attr42 = null;

        RuleReturnScope eiex = null;
        RuleReturnScope sie = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:313:2: ( ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr ) -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:313:5: ^( IF iex= expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )* ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )? std_attr )
            {
            match(input,IF,FOLLOW_IF_in_if_ex1486); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_if_ex1490);
            iex=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_if_ex1495);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:314:3: ( ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELSIF) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:314:4: ^( ELSIF eiex+= expr[null] sie+= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_if_ex1503); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expr_in_if_ex1507);
            	    eiex=expr(null);

            	    state._fsp--;

            	    if (list_eiex==null) list_eiex=new ArrayList();
            	    list_eiex.add(eiex.getTemplate());

            	    pushFollow(FOLLOW_sequence_in_if_ex1512);
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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:315:3: ( ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:315:4: ^( ELSE se= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_if_ex1523); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_sequence_in_if_ex1527);
                    se=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_if_ex1533);
            std_attr42=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 316:2: -> if_ex(iex=$iex.stseq=$s.steiex=$eiexseqei=$sieseqe=$se.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("if_ex",
              new STAttrMap().put("iex", (iex!=null?iex.st:null)).put("seq", (s!=null?s.st:null)).put("eiex", list_eiex).put("seqei", list_sie).put("seqe", (se!=null?se.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr42!=null?std_attr42.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:319:1: signal : ^( SIGNAL ID (exp+= expr[null] )? ) -> source(source=$ID.texttrans=$expempty=empty);
    public final BPELscriptWalker.signal_return signal() throws RecognitionException {
        BPELscriptWalker.signal_return retval = new BPELscriptWalker.signal_return();
        retval.start = input.LT(1);

        CommonTree ID43=null;
        List list_exp=null;
        RuleReturnScope exp = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:320:2: ( ^( SIGNAL ID (exp+= expr[null] )? ) -> source(source=$ID.texttrans=$expempty=empty))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:320:4: ^( SIGNAL ID (exp+= expr[null] )? )
            {
            match(input,SIGNAL,FOLLOW_SIGNAL_in_signal1596); 

            match(input, Token.DOWN, null); 
            ID43=(CommonTree)match(input,ID,FOLLOW_ID_in_signal1598); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:320:19: (exp+= expr[null] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EXT_EXPR||LA35_0==CALL||LA35_0==PATH||LA35_0==STRING||LA35_0==INT||(LA35_0>=164 && LA35_0<=168)||(LA35_0>=170 && LA35_0<=173)||LA35_0==197) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:320:19: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_signal1602);
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
            // 324:2: -> source(source=$ID.texttrans=$expempty=empty)
            {
                retval.st = templateLib.getInstanceOf("source",
              new STAttrMap().put("source", (ID43!=null?ID43.getText():null)).put("trans", list_exp).put("empty", empty));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:327:1: join : ^( JOIN (ids+= ID )+ (exp+= expr[null] )? ) -> std_elt(target=$idsjoin=$exp);
    public final BPELscriptWalker.join_return join() throws RecognitionException {
        BPELscriptWalker.join_return retval = new BPELscriptWalker.join_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;
        List list_exp=null;
        RuleReturnScope exp = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:2: ( ^( JOIN (ids+= ID )+ (exp+= expr[null] )? ) -> std_elt(target=$idsjoin=$exp))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:4: ^( JOIN (ids+= ID )+ (exp+= expr[null] )? )
            {
            match(input,JOIN,FOLLOW_JOIN_in_join1641); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:14: (ids+= ID )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_join1645); 
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

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:23: (exp+= expr[null] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EXT_EXPR||LA37_0==CALL||LA37_0==PATH||LA37_0==STRING||LA37_0==INT||(LA37_0>=164 && LA37_0<=168)||(LA37_0>=170 && LA37_0<=173)||LA37_0==197) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:328:23: exp+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_join1650);
                    exp=expr(null);

                    state._fsp--;

                    if (list_exp==null) list_exp=new ArrayList();
                    list_exp.add(exp.getTemplate());


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 329:2: -> std_elt(target=$idsjoin=$exp)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:332:1: sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb] : ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments);
    public final BPELscriptWalker.sequence_return sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb) throws RecognitionException {
        BPELscriptWalker.sequence_return retval = new BPELscriptWalker.sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.body_return b = null;

        BPELscriptWalker.std_attr_return std_attr44 = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        List comments = getComments(retval);
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:2: ( ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr ) -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:4: ^( SEQUENCE (j+= join )? b= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* std_attr )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequence1687); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:16: (j+= join )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==JOIN) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_sequence1691);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_body_in_sequence1696);
            b=body(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:81: (s+= signal )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==SIGNAL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:335:81: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_sequence1701);
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

            pushFollow(FOLLOW_std_attr_in_sequence1704);
            std_attr44=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 336:2: -> sequence(content=$b.stjoin=$jsignal=$sstd_attr=$std_attr.stcomments=comments)
            {
                retval.st = templateLib.getInstanceOf("sequence",
              new STAttrMap().put("content", (b!=null?b.st:null)).put("join", list_j).put("signal", list_s).put("std_attr", (std_attr44!=null?std_attr44.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:340:1: scope_sequence[HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\t HashMap<String, String> _cs,HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, StringTemplate handler] : ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler);
    public final BPELscriptWalker.scope_sequence_return scope_sequence(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, StringTemplate handler) throws RecognitionException {
        BPELscriptWalker.scope_sequence_return retval = new BPELscriptWalker.scope_sequence_return();
        retval.start = input.LT(1);

        List list_j=null;
        List list_s=null;
        BPELscriptWalker.scope_block_return b = null;

        RuleReturnScope j = null;
        RuleReturnScope s = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:2: ( ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* ) -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:4: ^( SEQUENCE (j+= join )? b= scope_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (s+= signal )* )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_scope_sequence1749); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:16: (j+= join )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==JOIN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:16: j+= join
                    {
                    pushFollow(FOLLOW_join_in_scope_sequence1753);
                    j=join();

                    state._fsp--;

                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_block_in_scope_sequence1758);
            b=scope_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:88: (s+= signal )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==SIGNAL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:342:88: s+= signal
            	    {
            	    pushFollow(FOLLOW_signal_in_scope_sequence1763);
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
            // 343:2: -> scope_sequence(content=$b.stjoin=$jsignal=$splinks=_plmessages=_messagesvars=_varscors=_csfaultHdl=_faultsfaultHdl_pb=_faults_pbcompHdl=handler)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:347:1: while_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.while_ex_return while_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.while_ex_return retval = new BPELscriptWalker.while_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.expr_return expr45 = null;

        BPELscriptWalker.std_attr_return std_attr46 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:349:2: ( ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:349:4: ^( WHILE expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr )
            {
            match(input,WHILE,FOLLOW_WHILE_in_while_ex1837); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_while_ex1839);
            expr45=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_while_ex1844);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            pushFollow(FOLLOW_std_attr_in_while_ex1847);
            std_attr46=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 350:2: -> while(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("while",
              new STAttrMap().put("expr_st", (expr45!=null?expr45.st:null)).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr46!=null?std_attr46.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:353:1: until_ex[List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, \n\t\tHashMap<String, String> _cs, HashMap<String, String> _faults,HashMap<String, StringTemplate> _faults_pb, List comments] : ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.until_ex_return until_ex(List join, List signal, HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.until_ex_return retval = new BPELscriptWalker.until_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.sequence_return s = null;

        BPELscriptWalker.expr_return expr47 = null;

        BPELscriptWalker.std_attr_return std_attr48 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:355:2: ( ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr ) -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:355:4: ^( UNTIL expr[null] s= sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb] std_attr )
            {
            match(input,UNTIL,FOLLOW_UNTIL_in_until_ex1896); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_until_ex1898);
            expr47=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_sequence_in_until_ex1903);
            s=sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            pushFollow(FOLLOW_std_attr_in_until_ex1906);
            std_attr48=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 356:2: -> until(expr_st=$expr.stbody_st=$s.stjoin=$joinsignal=$signalstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("until",
              new STAttrMap().put("expr_st", (expr47!=null?expr47.st:null)).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr48!=null?std_attr48.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:359:1: foreach[List join, List signal, List comments] : ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr ) -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBOcomments=$comments);
    public final BPELscriptWalker.foreach_return foreach(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.foreach_return retval = new BPELscriptWalker.foreach_return();
        retval.start = input.LT(1);

        CommonTree cName=null;
        CommonTree PARALLEL51=null;
        CommonTree SBO52=null;
        List list_complete=null;
        BPELscriptWalker.expr_return init = null;

        BPELscriptWalker.expr_return cond = null;

        BPELscriptWalker.scope_short_return scope_short49 = null;

        BPELscriptWalker.std_attr_return std_attr50 = null;

        RuleReturnScope complete = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:360:2: ( ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr ) -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBOcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:360:4: ^( FOR cName= ID init= expr[null] cond= expr[null] (complete+= expr[null] )? scope_short ( PARALLEL )? ( SBO )? std_attr )
            {
            match(input,FOR,FOLLOW_FOR_in_foreach1956); 

            match(input, Token.DOWN, null); 
            cName=(CommonTree)match(input,ID,FOLLOW_ID_in_foreach1960); 
            pushFollow(FOLLOW_expr_in_foreach1964);
            init=expr(null);

            state._fsp--;

            pushFollow(FOLLOW_expr_in_foreach1969);
            cond=expr(null);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:360:59: (complete+= expr[null] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EXT_EXPR||LA42_0==CALL||LA42_0==PATH||LA42_0==STRING||LA42_0==INT||(LA42_0>=164 && LA42_0<=168)||(LA42_0>=170 && LA42_0<=173)||LA42_0==197) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:360:59: complete+= expr[null]
                    {
                    pushFollow(FOLLOW_expr_in_foreach1974);
                    complete=expr(null);

                    state._fsp--;

                    if (list_complete==null) list_complete=new ArrayList();
                    list_complete.add(complete.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_foreach1982);
            scope_short49=scope_short();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:361:16: ( PARALLEL )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==PARALLEL) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:361:16: PARALLEL
                    {
                    PARALLEL51=(CommonTree)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach1984); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:361:26: ( SBO )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SBO) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:361:26: SBO
                    {
                    SBO52=(CommonTree)match(input,SBO,FOLLOW_SBO_in_foreach1987); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_foreach1990);
            std_attr50=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 362:2: -> foreach(id=$cNameinit_st=$init.stcond_st=$cond.stcomplete=$completebody_st=$scope_short.stjoin=$joinsignal=$signalstd_attr=$std_attr.stparallel=$PARALLELsbo=$SBOcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("foreach",
              new STAttrMap().put("id", cName).put("init_st", (init!=null?init.st:null)).put("cond_st", (cond!=null?cond.st:null)).put("complete", list_complete).put("body_st", (scope_short49!=null?scope_short49.st:null)).put("join", join).put("signal", signal).put("std_attr", (std_attr50!=null?std_attr50.st:null)).put("parallel", PARALLEL51).put("sbo", SBO52).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:366:1: try_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope, List comments] : ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c);
    public final BPELscriptWalker.try_ex_return try_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.try_ex_return retval = new BPELscriptWalker.try_ex_return();
        retval.start = input.LT(1);

        List list_cls=null;
        List list_c=null;
        RuleReturnScope cls = null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:2: ( ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? ) -> list(content_st=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:4: ^( TRY (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )* (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )? )
            {
            match(input,TRY,FOLLOW_TRY_in_try_ex2068); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:13: (cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope] )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==CATCH) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:13: cls+= catch_ex[_vars, _pl, _messages, _cs, _faults, _faults_pb, isInScope]
                	    {
                	    pushFollow(FOLLOW_catch_ex_in_try_ex2072);
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

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:86: (c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb] )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SEQUENCE||LA46_0==PROC_STMTS) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:368:86: c+= body[_vars, _pl, _messages, _cs, _faults, _faults_pb]
                        {
                        pushFollow(FOLLOW_body_in_try_ex2078);
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
            // 369:2: -> list(content_st=$c)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:372:1: catch_ex[HashMap<String, String> _vars, HashMap<String, String> _pl, \n\tHashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope] : ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) ;
    public final BPELscriptWalker.catch_ex_return catch_ex(HashMap<String, String> _vars, HashMap<String, String> _pl, HashMap<String, String> _messages, HashMap<String, String> _cs, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, Boolean isInScope) throws RecognitionException {
        BPELscriptWalker.catch_ex_return retval = new BPELscriptWalker.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree fMT=null;
        BPELscriptWalker.param_block_return pb = null;

        BPELscriptWalker.ns_id_return ns_id53 = null;

        BPELscriptWalker.faultElt_return faultElt54 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:2: ( ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:4: ^( CATCH ( ns_id )? pb= param_block[_vars, _pl, _messages, _cs, _faults, _faults_pb] (fMT= STRING )? ( faultElt )? )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catch_ex2110); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:12: ( ns_id )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==NS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:12: ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_catch_ex2112);
                    ns_id53=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_catch_ex2117);
            pb=param_block(_vars, _pl, _messages, _cs, _faults, _faults_pb);

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:86: (fMT= STRING )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:86: fMT= STRING
                    {
                    fMT=(CommonTree)match(input,STRING,FOLLOW_STRING_in_catch_ex2122); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:95: ( faultElt )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==FAULTELT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:374:95: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex2125);
                    faultElt54=faultElt();

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
            		if((ns_id53!=null?ns_id53.nspre:null)!=null) 
            			faultName+=(ns_id53!=null?ns_id53.nspre:null)+":";
            		if ((ns_id53!=null?ns_id53.nsloc:null)!=null)			
            			faultName+=(ns_id53!=null?ns_id53.nsloc:null);
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
            		if ((faultElt54!=null?faultElt54.st:null)!=null) attributes+=(faultElt54!=null?faultElt54.st:null);
            		// 3)
            		Boolean definedIn = _faults.containsKey(faultName);
            				
            		if (faultName != null && definedIn) {
            			throwDefinedWarning("exception", (ns_id53!=null?ns_id53.locID:null));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:418:1: scope_ex[List join, List signal, List comments] : ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments);
    public final BPELscriptWalker.scope_ex_return scope_ex(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.scope_ex_return retval = new BPELscriptWalker.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree ISOLATED55=null;
        CommonTree EOSF56=null;
        CommonTree SJF57=null;
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:2: ( ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? ) -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:4: ^( SCOPE (id+= ID )? handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_ex2152); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:14: (id+= ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:14: id+= ID
                    {
                    id=(CommonTree)match(input,ID,FOLLOW_ID_in_scope_ex2156); 
                    if (list_id==null) list_id=new ArrayList();
                    list_id.add(id);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_stmt_in_scope_ex2161);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_ex2166);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:119: ( ISOLATED )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ISOLATED) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:119: ISOLATED
                    {
                    ISOLATED55=(CommonTree)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex2169); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:129: ( EOSF )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EOSF) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:129: EOSF
                    {
                    EOSF56=(CommonTree)match(input,EOSF,FOLLOW_EOSF_in_scope_ex2172); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:135: ( SJF )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==SJF) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:427:135: SJF
                    {
                    SJF57=(CommonTree)match(input,SJF,FOLLOW_SJF_in_scope_ex2175); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 428:2: -> scope_ex(id_opt=$idbody_st=$s.stjoin=$joinsignal=$signalisolated=$ISOLATEDeosf=$EOSFstd_attr=$SJF.textcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("scope_ex",
              new STAttrMap().put("id_opt", list_id).put("body_st", (s!=null?s.st:null)).put("join", join).put("signal", signal).put("isolated", ISOLATED55).put("eosf", EOSF56).put("std_attr", (SJF57!=null?SJF57.getText():null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:431:1: scope_short : ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st);
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:440:2: ( ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] ) -> scope_ex(body_st=$s.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:440:4: ^( SCOPE handler= scope_stmt s= scope_sequence[_vars, _pl, _messages, _cs, _faults, _faults_pb, $handler.st] )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_short2242); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_scope_stmt_in_scope_short2246);
            handler=scope_stmt();

            state._fsp--;

            pushFollow(FOLLOW_scope_sequence_in_scope_short2250);
            s=scope_sequence(_vars, _pl, _messages, _cs, _faults, _faults_pb, (handler!=null?handler.st:null));

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 441:2: -> scope_ex(body_st=$s.st)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:445:1: scope_stmt : ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c);
    public final BPELscriptWalker.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptWalker.scope_stmt_return retval = new BPELscriptWalker.scope_stmt_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:2: ( ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? ) -> list(content_st=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:4: ^( SCOPE (c+= compensation )? (c+= termination )? (c+= eventHdl )? )
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_scope_stmt2276); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:13: (c+= compensation )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMPENSATION) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:13: c+= compensation
                        {
                        pushFollow(FOLLOW_compensation_in_scope_stmt2280);
                        c=compensation();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:30: (c+= termination )?
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==TERMINATION) ) {
                    alt55=1;
                }
                switch (alt55) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:30: c+= termination
                        {
                        pushFollow(FOLLOW_termination_in_scope_stmt2285);
                        c=termination();

                        state._fsp--;

                        if (list_c==null) list_c=new ArrayList();
                        list_c.add(c.getTemplate());


                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:46: (c+= eventHdl )?
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==EVENTHDL) ) {
                    alt56=1;
                }
                switch (alt56) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:446:46: c+= eventHdl
                        {
                        pushFollow(FOLLOW_eventHdl_in_scope_stmt2290);
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
            // 447:2: -> list(content_st=$c)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:450:1: termination : ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st);
    public final BPELscriptWalker.termination_return termination() throws RecognitionException {
        BPELscriptWalker.termination_return retval = new BPELscriptWalker.termination_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body58 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:451:2: ( ^( TERMINATION body[null, null, null, null,null,null] ) -> termination(body=$body.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:451:4: ^( TERMINATION body[null, null, null, null,null,null] )
            {
            match(input,TERMINATION,FOLLOW_TERMINATION_in_termination2316); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_termination2318);
            body58=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 451:58: -> termination(body=$body.st)
            {
                retval.st = templateLib.getInstanceOf("termination",
              new STAttrMap().put("body", (body58!=null?body58.st:null)));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:454:1: eventHdl : ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c);
    public final BPELscriptWalker.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptWalker.eventHdl_return retval = new BPELscriptWalker.eventHdl_return();
        retval.start = input.LT(1);

        List list_c=null;
        RuleReturnScope c = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:2: ( ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* ) -> eventHdl(content=$c))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:4: ^( EVENTHDL (c+= onEvent )* (c+= onAlarm )* )
            {
            match(input,EVENTHDL,FOLLOW_EVENTHDL_in_eventHdl2341); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:16: (c+= onEvent )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==EVENT) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:16: c+= onEvent
                	    {
                	    pushFollow(FOLLOW_onEvent_in_eventHdl2345);
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

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:28: (c+= onAlarm )*
                loop58:
                do {
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ONALARM) ) {
                        alt58=1;
                    }


                    switch (alt58) {
                	case 1 :
                	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:455:28: c+= onAlarm
                	    {
                	    pushFollow(FOLLOW_onAlarm_in_eventHdl2350);
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
            // 456:2: -> eventHdl(content=$c)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:458:1: onEvent : ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st);
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
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:2: ( ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) -> event(p=$po=$oparam_block_st=$pb.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:4: ^( EVENT p= ID o= ID (c+= correlation )? (we+= with_ex )? pb= scope_short (var= ID )? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
            match(input,EVENT,FOLLOW_EVENT_in_onEvent2372); 

            match(input, Token.DOWN, null); 
            p=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2376); 
            o=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2380); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:23: (c+= correlation )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CORRELATION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:23: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_onEvent2384);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:40: (we+= with_ex )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==WITH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:459:40: we+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2389);
                    we=with_ex();

                    state._fsp--;

                    if (list_we==null) list_we=new ArrayList();
                    list_we.add(we.getTemplate());


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2394);
            pb=scope_short();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:6: (var= ID )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==ID) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:6: var= ID
                    {
                    var=(CommonTree)match(input,ID,FOLLOW_ID_in_onEvent2401); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:11: ( portType )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==PORTTYPE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:11: portType
                    {
                    pushFollow(FOLLOW_portType_in_onEvent2404);
                    portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:21: ( msgEx )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==MSGEX) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:21: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_onEvent2407);
                    msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:28: ( msgType )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==MSGTYPE) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:28: msgType
                    {
                    pushFollow(FOLLOW_msgType_in_onEvent2410);
                    msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:37: ( viElt )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==VIELT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:460:37: viElt
                    {
                    pushFollow(FOLLOW_viElt_in_onEvent2413);
                    viElt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 461:2: -> event(p=$po=$oparam_block_st=$pb.st)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:464:1: compensation : ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st);
    public final BPELscriptWalker.compensation_return compensation() throws RecognitionException {
        BPELscriptWalker.compensation_return retval = new BPELscriptWalker.compensation_return();
        retval.start = input.LT(1);

        BPELscriptWalker.body_return body59 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:465:2: ( ^( COMPENSATION body[null, null, null, null,null,null] ) -> compensation(body_st=$body.st))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:465:4: ^( COMPENSATION body[null, null, null, null,null,null] )
            {
            match(input,COMPENSATION,FOLLOW_COMPENSATION_in_compensation2450); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_compensation2452);
            body59=body(null, null, null, null, null, null);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 466:2: -> compensation(body_st=$body.st)
            {
                retval.st = templateLib.getInstanceOf("compensation",
              new STAttrMap().put("body_st", (body59!=null?body59.st:null)));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:469:1: with_ex : ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts);
    public final BPELscriptWalker.with_ex_return with_ex() throws RecognitionException {
        BPELscriptWalker.with_ex_return retval = new BPELscriptWalker.with_ex_return();
        retval.start = input.LT(1);

        List list_maps=null;
        RuleReturnScope maps = null;

        	HashMap<String, StringTemplate> fromParts = new HashMap<String, StringTemplate>();
        	HashMap<String, StringTemplate> toParts = new HashMap<String, StringTemplate>();

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:474:3: ( ^( WITH (maps+= with_map[fromParts, toParts] )+ ) -> with_ex(fromParts=fromPartstoParts=toParts))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:474:5: ^( WITH (maps+= with_map[fromParts, toParts] )+ )
            {
            match(input,WITH,FOLLOW_WITH_in_with_ex2483); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:474:16: (maps+= with_map[fromParts, toParts] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:474:16: maps+= with_map[fromParts, toParts]
            	    {
            	    pushFollow(FOLLOW_with_map_in_with_ex2487);
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
            // 475:2: -> with_ex(fromParts=fromPartstoParts=toParts)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:478:1: with_map[HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts] : ^( MAP ID ( KEY )? pe= path_expr ) ;
    public final BPELscriptWalker.with_map_return with_map(HashMap<String, StringTemplate> fromParts, HashMap<String, StringTemplate> toParts) throws RecognitionException {
        BPELscriptWalker.with_map_return retval = new BPELscriptWalker.with_map_return();
        retval.start = input.LT(1);

        CommonTree KEY60=null;
        CommonTree ID61=null;
        BPELscriptWalker.path_expr_return pe = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:479:2: ( ^( MAP ID ( KEY )? pe= path_expr ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:479:11: ^( MAP ID ( KEY )? pe= path_expr )
            {
            match(input,MAP,FOLLOW_MAP_in_with_map2526); 

            match(input, Token.DOWN, null); 
            ID61=(CommonTree)match(input,ID,FOLLOW_ID_in_with_map2528); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:479:20: ( KEY )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KEY) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:479:20: KEY
                    {
                    KEY60=(CommonTree)match(input,KEY,FOLLOW_KEY_in_with_map2530); 

                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map2535);
            pe=path_expr();

            state._fsp--;


            match(input, Token.UP, null); 

            		if (KEY60!=null && (KEY60!=null?KEY60.getText():null).contains("in")) {
            		    fromParts.put((ID61!=null?ID61.getText():null), (pe!=null?pe.st:null));
            		}
            		
            		if ((KEY60!=null?KEY60.getText():null).contains("out")) {
            		    toParts.put((ID61!=null?ID61.getText():null), (pe!=null?pe.st:null));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:492:1: receive[List join, List signal, boolean empty, List comments] : ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments);
    public final BPELscriptWalker.receive_return receive(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.receive_return retval = new BPELscriptWalker.receive_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree ci=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return pt = null;

        BPELscriptWalker.std_attr_return std_attr62 = null;

        BPELscriptWalker.msgEx_return msgEx63 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:10: ( ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? ) -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:13: ^( RECEIVE partner= ID op= ID (c+= correlation )? (pt= portType )? (ci= CREATE_INST )? ( msgEx )? std_attr (w+= with_ex )? )
            {
            match(input,RECEIVE,FOLLOW_RECEIVE_in_receive2564); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2568); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_receive2572); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:41: (c+= correlation )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CORRELATION) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:41: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_receive2576);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:58: (pt= portType )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==PORTTYPE) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:58: pt= portType
                    {
                    pushFollow(FOLLOW_portType_in_receive2581);
                    pt=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:71: (ci= CREATE_INST )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==CREATE_INST) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:71: ci= CREATE_INST
                    {
                    ci=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive2586); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:85: ( msgEx )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==MSGEX) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:85: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_receive2589);
                    msgEx63=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_receive2592);
            std_attr62=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:102: (w+= with_ex )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WITH) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:493:102: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive2596);
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
            // 497:2: -> receive(partner=$partner.textop=$op.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcrt_inst=$ci.textmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("receive",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (pt!=null?pt.st:null)).put("std_attr", (std_attr62!=null?std_attr62.st:null)).put("crt_inst", (ci!=null?ci.getText():null)).put("msgEx", (msgEx63!=null?msgEx63.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:503:1: reply[List join, List signal,boolean empty, List comments] : ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments);
    public final BPELscriptWalker.reply_return reply(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.reply_return retval = new BPELscriptWalker.reply_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree inv=null;
        CommonTree op=null;
        List list_op=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.faultName_return fn = null;

        BPELscriptWalker.portType_return portType64 = null;

        BPELscriptWalker.std_attr_return std_attr65 = null;

        BPELscriptWalker.msgEx_return msgEx66 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:2: ( ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? ) -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:4: ^( REPLY partner= ID op+= ID (inv= ID )? (c+= correlation )? ( portType )? std_attr (fn= faultName )? ( msgEx )? (w+= with_ex )? )
            {
            match(input,REPLY,FOLLOW_REPLY_in_reply2697); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2701); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2705); 
            if (list_op==null) list_op=new ArrayList();
            list_op.add(op);

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:33: (inv= ID )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:33: inv= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_reply2709); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:39: (c+= correlation )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CORRELATION) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:39: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_reply2714);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:54: ( portType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==PORTTYPE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:54: portType
                    {
                    pushFollow(FOLLOW_portType_in_reply2717);
                    portType64=portType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_reply2720);
            std_attr65=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:75: (fn= faultName )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==FAULTNAME) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:75: fn= faultName
                    {
                    pushFollow(FOLLOW_faultName_in_reply2724);
                    fn=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:87: ( msgEx )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==MSGEX) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:87: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_reply2727);
                    msgEx66=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:95: (w+= with_ex )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==WITH) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:504:95: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply2732);
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
            // 508:2: -> reply(partner=$partner.textop=$opinv=$inv.textjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stfaultName=$fn.stmsgEx=$msgEx.stcorrelation_opt=$cwith_ex=$wcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("reply",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", list_op).put("inv", (inv!=null?inv.getText():null)).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType64!=null?portType64.st:null)).put("std_attr", (std_attr65!=null?std_attr65.st:null)).put("faultName", (fn!=null?fn.st:null)).put("msgEx", (msgEx66!=null?msgEx66.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:513:1: invoke[List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments] : ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments);
    public final BPELscriptWalker.invoke_return invoke(List join, List signal, boolean empty, HashMap<String, String> _faults, HashMap<String, StringTemplate> _faults_pb, List comments) throws RecognitionException {
        BPELscriptWalker.invoke_return retval = new BPELscriptWalker.invoke_return();
        retval.start = input.LT(1);

        CommonTree partner=null;
        CommonTree op=null;
        CommonTree inv=null;
        List list_inv=null;
        List list_c=null;
        List list_w=null;
        BPELscriptWalker.portType_return portType67 = null;

        BPELscriptWalker.std_attr_return std_attr68 = null;

        BPELscriptWalker.compensation_return compensation69 = null;

        RuleReturnScope c = null;
        RuleReturnScope w = null;

        HashMap<String, String> __faults = new HashMap<String, String>();
        HashMap<String, StringTemplate> __faults_pb = new HashMap<String, StringTemplate>();

        if (_faults!=null) {
            __faults.putAll(_faults);
            __faults_pb.putAll(_faults_pb);
        }

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:2: ( ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? ) -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:4: ^( INVOKE partner= ID op= ID (inv+= ID )? (c+= correlation )? ( portType )? std_attr (w+= with_ex )? ( compensation )? )
            {
            match(input,INVOKE,FOLLOW_INVOKE_in_invoke2839); 

            match(input, Token.DOWN, null); 
            partner=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2843); 
            op=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2847); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:33: (inv+= ID )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:33: inv+= ID
                    {
                    inv=(CommonTree)match(input,ID,FOLLOW_ID_in_invoke2851); 
                    if (list_inv==null) list_inv=new ArrayList();
                    list_inv.add(inv);


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:40: (c+= correlation )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==CORRELATION) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:40: c+= correlation
                    {
                    pushFollow(FOLLOW_correlation_in_invoke2856);
                    c=correlation();

                    state._fsp--;

                    if (list_c==null) list_c=new ArrayList();
                    list_c.add(c.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:55: ( portType )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==PORTTYPE) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:55: portType
                    {
                    pushFollow(FOLLOW_portType_in_invoke2859);
                    portType67=portType();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_invoke2862);
            std_attr68=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:75: (w+= with_ex )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WITH) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:75: w+= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke2866);
                    w=with_ex();

                    state._fsp--;

                    if (list_w==null) list_w=new ArrayList();
                    list_w.add(w.getTemplate());


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:86: ( compensation )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==COMPENSATION) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:529:86: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke2869);
                    compensation69=compensation();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            // adjust empty tag to handle correlations, since it signals only presence of standard elements else
                    		if (list_c!=null || _faults!=null) empty=false;
                    	


            // TEMPLATE REWRITE
            // 533:2: -> invoke(partner=$partner.textop=$op.textinv=$invjoin=$joinsignal=$signalempty=$emptyportType=$portType.ststd_attr=$std_attr.stcorrelation_opt=$cwith_ex=$wfaults=__faultsfaults_pb=__faults_pbcompensation=$compensation.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("invoke",
              new STAttrMap().put("partner", (partner!=null?partner.getText():null)).put("op", (op!=null?op.getText():null)).put("inv", list_inv).put("join", join).put("signal", signal).put("empty", empty).put("portType", (portType67!=null?portType67.st:null)).put("std_attr", (std_attr68!=null?std_attr68.st:null)).put("correlation_opt", list_c).put("with_ex", list_w).put("faults", __faults).put("faults_pb", __faults_pb).put("compensation", (compensation69!=null?compensation69.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:538:1: assign[List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb, List comments] : ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssigncomments=$comments);
    public final BPELscriptWalker.assign_return assign(List join, List signal, boolean empty, HashMap<String, String>_vars, HashMap<String, String>_pl, String name, StringTemplate pb, List comments) throws RecognitionException {
        BPELscriptWalker.assign_return retval = new BPELscriptWalker.assign_return();
        retval.start = input.LT(1);

        CommonTree PROP70=null;
        CommonTree CREATE_INST72=null;
        CommonTree VALID76=null;
        CommonTree KEEPSRC77=null;
        CommonTree IGNORE78=null;
        BPELscriptWalker.path_expr_return pe = null;

        BPELscriptWalker.portType_return portType71 = null;

        BPELscriptWalker.std_attr_return std_attr73 = null;

        BPELscriptWalker.faultName_return faultName74 = null;

        BPELscriptWalker.msgEx_return msgEx75 = null;

        BPELscriptWalker.rvalue_return rvalue79 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:2: ( ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] ) -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssigncomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:4: ^( ASSIGN pe= path_expr ( PROP )? ( portType )? ( CREATE_INST )? std_attr ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? rvalue[_vars, _pl, $pe.st, $pe.text, $PROP.text, join, signal, empty, \n\t\t\t$portType.st, $CREATE_INST.text, $std_attr.st, $faultName.st, $msgEx.st, $VALID.text, $KEEPSRC.text, $IGNORE.text, name, pb] )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assign2971); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_path_expr_in_assign2975);
            pe=path_expr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:26: ( PROP )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==PROP) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:26: PROP
                    {
                    PROP70=(CommonTree)match(input,PROP,FOLLOW_PROP_in_assign2977); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:32: ( portType )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==PORTTYPE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:32: portType
                    {
                    pushFollow(FOLLOW_portType_in_assign2980);
                    portType71=portType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:42: ( CREATE_INST )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==CREATE_INST) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:42: CREATE_INST
                    {
                    CREATE_INST72=(CommonTree)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign2983); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_assign2987);
            std_attr73=std_attr();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:65: ( faultName )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==FAULTNAME) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:65: faultName
                    {
                    pushFollow(FOLLOW_faultName_in_assign2989);
                    faultName74=faultName();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:76: ( msgEx )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==MSGEX) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:76: msgEx
                    {
                    pushFollow(FOLLOW_msgEx_in_assign2992);
                    msgEx75=msgEx();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:83: ( VALID )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==VALID) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:83: VALID
                    {
                    VALID76=(CommonTree)match(input,VALID,FOLLOW_VALID_in_assign2995); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:90: ( KEEPSRC )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEEPSRC) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:90: KEEPSRC
                    {
                    KEEPSRC77=(CommonTree)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign2998); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:99: ( IGNORE )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==IGNORE) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:539:99: IGNORE
                    {
                    IGNORE78=(CommonTree)match(input,IGNORE,FOLLOW_IGNORE_in_assign3001); 

                    }
                    break;

            }

            pushFollow(FOLLOW_rvalue_in_assign3007);
            rvalue79=rvalue(_vars, _pl, (pe!=null?pe.st:null), (pe!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(pe.start),
              input.getTreeAdaptor().getTokenStopIndex(pe.start))):null), (PROP70!=null?PROP70.getText():null), join, signal, empty, (portType71!=null?portType71.st:null), (CREATE_INST72!=null?CREATE_INST72.getText():null), (std_attr73!=null?std_attr73.st:null), (faultName74!=null?faultName74.st:null), (msgEx75!=null?msgEx75.st:null), (VALID76!=null?VALID76.getText():null), (KEEPSRC77!=null?KEEPSRC77.getText():null), (IGNORE78!=null?IGNORE78.getText():null), name, pb);

            state._fsp--;


            match(input, Token.UP, null); 

            			boolean isRealAssign = true;
            			if ((rvalue79!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue79.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue79.start))):null).contains("invoke") || (rvalue79!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(rvalue79.start),
              input.getTreeAdaptor().getTokenStopIndex(rvalue79.start))):null).contains("receive")) isRealAssign=false;
            		


            // TEMPLATE REWRITE
            // 546:2: -> assign(rvalue_st=$rvalue.stjoin=$joinsignal=$signalempty=$emptyvalid=$VALID.textstd_attr=$std_attr.streal=isRealAssigncomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("rvalue_st", (rvalue79!=null?rvalue79.st:null)).put("join", join).put("signal", signal).put("empty", empty).put("valid", (VALID76!=null?VALID76.getText():null)).put("std_attr", (std_attr73!=null?std_attr73.st:null)).put("real", isRealAssign).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:549:1: rvalue[HashMap<String, String>_vars, HashMap<String, String>_pl, \n\tStringTemplate path_expr, String str_path_expr, String lhs_prop, List join, List signal, boolean empty, \n\tStringTemplate portType, String crtInst, StringTemplate std_attr, StringTemplate faultName, StringTemplate msgEx,\n\tString valid, String keepsrc, String ignore, String name, StringTemplate pb] : (r= receive[null, null, true, null] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore));
    public final BPELscriptWalker.rvalue_return rvalue(HashMap<String, String>_vars, HashMap<String, String>_pl, StringTemplate path_expr, String str_path_expr, String lhs_prop, List join, List signal, boolean empty, StringTemplate portType, String crtInst, StringTemplate std_attr, StringTemplate faultName, StringTemplate msgEx, String valid, String keepsrc, String ignore, String name, StringTemplate pb) throws RecognitionException {
        BPELscriptWalker.rvalue_return retval = new BPELscriptWalker.rvalue_return();
        retval.start = input.LT(1);

        CommonTree PROP81=null;
        BPELscriptWalker.receive_return r = null;

        BPELscriptWalker.invoke_return i = null;

        BPELscriptWalker.expr_return expr80 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:553:2: (r= receive[null, null, true, null] -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx) | i= invoke[null, null, true, null, null, null] -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr) | expr[$path_expr] ( PROP )? -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore))
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:553:5: r= receive[null, null, true, null]
                    {
                    pushFollow(FOLLOW_receive_in_rvalue3077);
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
                    // 564:2: -> receive(rec_name=namepb=pbrec_tpl=$r.stpath_st=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypecrt_inst=crtInststd_attr=$std_attrfaultName=$faultNamemsgEx=$msgEx)
                    {
                        retval.st = templateLib.getInstanceOf("receive",
                      new STAttrMap().put("rec_name", name).put("pb", pb).put("rec_tpl", (r!=null?r.st:null)).put("path_st", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("crt_inst", crtInst).put("std_attr", std_attr).put("faultName", faultName).put("msgEx", msgEx));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:566:5: i= invoke[null, null, true, null, null, null]
                    {
                    pushFollow(FOLLOW_invoke_in_rvalue3159);
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
                    // 577:2: -> invoke(inv_tpl=$i.stoutvar=$path_exprjoin=joinsignal=signalempty=emptyportType=$portTypestd_attr=$std_attr)
                    {
                        retval.st = templateLib.getInstanceOf("invoke",
                      new STAttrMap().put("inv_tpl", (i!=null?i.st:null)).put("outvar", path_expr).put("join", join).put("signal", signal).put("empty", empty).put("portType", portType).put("std_attr", std_attr));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:579:5: expr[$path_expr] ( PROP )?
                    {
                    pushFollow(FOLLOW_expr_in_rvalue3216);
                    expr80=expr(path_expr);

                    state._fsp--;

                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:579:22: ( PROP )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==PROP) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:579:22: PROP
                            {
                            PROP81=(CommonTree)match(input,PROP,FOLLOW_PROP_in_rvalue3219); 

                            }
                            break;

                    }


                    		// display error when atrributes are used which are only allowe for other alternatives
                    		if (portType!=null || faultName!=null || msgEx!=null) {
                    			System.err.println("Error-Info: these attributes are not allowed in this context.");
                    		}
                    		
                    		String from_spec = (expr80!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expr80.start),
                      input.getTreeAdaptor().getTokenStopIndex(expr80.start))):null); //fetch right hand side
                    		String[] from_part;
                    		
                    		String[] lhs = str_path_expr.split("\\."); // fetch left hand side
                    		
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
                    		
                    		// check if vars in rhs are all known
                    		Boolean rhsKnown=false;
                    		if (_vars!=null) {
                    		for (Object obj : (expr80!=null?expr80.vars:null)) {
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
                    			if((expr80!=null?expr80.vars:null).size()==1 && from_part.length>1 && from_part[1]!=null) {
                    			    var = from_part[0];
                    			    if (PROP81!=null) {
                    			    	if ((PROP81!=null?PROP81.getText():null).equals("property")) {
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
                    			tovar=lhs[0];
                    			isToExpr=true;
                    			    
                    			//if there is a part or property description
                    			if (lhs.length>1 && lhs[1]!=null) {
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
                    			if (!_vars.containsKey(lhs[0])) {
                    			    _vars.put(lhs[0], null);
                    			}
                    		}
                    		


                    // TEMPLATE REWRITE
                    // 748:2: -> copy(from=fromempty=isPLorVarext=isExtpl=pLpl_p=ePRvar=varpart=partprop=propertytopart=tparttoprop=tproptopl=topltovar=tovartoempty=isToExprkeep=$keepsrcignore=$ignore)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:758:1: throw_ex[List join, List signal,boolean empty, List comments] : ^( THROW ns_id (faultVar= ID )? std_attr ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.throw_ex_return throw_ex(List join, List signal, boolean  empty, List comments) throws RecognitionException {
        BPELscriptWalker.throw_ex_return retval = new BPELscriptWalker.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree faultVar=null;
        BPELscriptWalker.ns_id_return ns_id82 = null;

        BPELscriptWalker.std_attr_return std_attr83 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:759:2: ( ^( THROW ns_id (faultVar= ID )? std_attr ) -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:759:4: ^( THROW ns_id (faultVar= ID )? std_attr )
            {
            match(input,THROW,FOLLOW_THROW_in_throw_ex3348); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ns_id_in_throw_ex3350);
            ns_id82=ns_id();

            state._fsp--;

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:759:26: (faultVar= ID )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ID) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:759:26: faultVar= ID
                    {
                    faultVar=(CommonTree)match(input,ID,FOLLOW_ID_in_throw_ex3354); 

                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_throw_ex3357);
            std_attr83=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 760:2: -> throw(ns_pre=$ns_id.nsprens_loc=$ns_id.nslocjoin=$joinsignal=$signalempty=$emptyfaultVar=$faultVar.textstd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("throw",
              new STAttrMap().put("ns_pre", (ns_id82!=null?ns_id82.nspre:null)).put("ns_loc", (ns_id82!=null?ns_id82.nsloc:null)).put("join", join).put("signal", signal).put("empty", empty).put("faultVar", (faultVar!=null?faultVar.getText():null)).put("std_attr", (std_attr83!=null?std_attr83.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:766:1: rethrow_ex[List join, List signal,boolean empty, List comments] : ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.rethrow_ex_return rethrow_ex(List join, List signal, boolean  empty, List comments) throws RecognitionException {
        BPELscriptWalker.rethrow_ex_return retval = new BPELscriptWalker.rethrow_ex_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr84 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:767:2: ( ^( RETHROW std_attr ) -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:767:4: ^( RETHROW std_attr )
            {
            match(input,RETHROW,FOLLOW_RETHROW_in_rethrow_ex3427); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_rethrow_ex3429);
            std_attr84=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 768:2: -> rethrow(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("rethrow",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr84!=null?std_attr84.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:777:1: compensate[List join, List signal, boolean empty, List comments] : ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.compensate_return compensate(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.compensate_return retval = new BPELscriptWalker.compensate_return();
        retval.start = input.LT(1);

        CommonTree target=null;
        List list_target=null;
        BPELscriptWalker.std_attr_return std_attr85 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:2: ( ^( COMPENSATE (target+= ID )? std_attr ) -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:4: ^( COMPENSATE (target+= ID )? std_attr )
            {
            match(input,COMPENSATE,FOLLOW_COMPENSATE_in_compensate3479); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:23: (target+= ID )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==ID) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:778:23: target+= ID
                    {
                    target=(CommonTree)match(input,ID,FOLLOW_ID_in_compensate3483); 
                    if (list_target==null) list_target=new ArrayList();
                    list_target.add(target);


                    }
                    break;

            }

            pushFollow(FOLLOW_std_attr_in_compensate3486);
            std_attr85=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 779:2: -> compensate(id_opt=$targetjoin=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("compensate",
              new STAttrMap().put("id_opt", list_target).put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr85!=null?std_attr85.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:782:1: exit[List join, List signal, boolean empty, List comments] : ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.exit_return exit(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.exit_return retval = new BPELscriptWalker.exit_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr86 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:783:2: ( ^( EXIT std_attr ) -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:783:4: ^( EXIT std_attr )
            {
            match(input,EXIT,FOLLOW_EXIT_in_exit3536); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_exit3538);
            std_attr86=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 784:2: -> exit(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("exit",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr86!=null?std_attr86.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:787:1: validate[List join, List signal, boolean empty, HashMap<String, String> _vars, List comments] : ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments);
    public final BPELscriptWalker.validate_return validate(List join, List signal, boolean empty, HashMap<String, String> _vars, List comments) throws RecognitionException {
        BPELscriptWalker.validate_return retval = new BPELscriptWalker.validate_return();
        retval.start = input.LT(1);

        CommonTree vars=null;
        List list_vars=null;
        BPELscriptWalker.std_attr_return std_attr87 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:788:2: ( ^( VALIDATE (vars+= ID )+ std_attr ) -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:788:4: ^( VALIDATE (vars+= ID )+ std_attr )
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validate3584); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:788:19: (vars+= ID )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:788:19: vars+= ID
            	    {
            	    vars=(CommonTree)match(input,ID,FOLLOW_ID_in_validate3588); 
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

            pushFollow(FOLLOW_std_attr_in_validate3591);
            std_attr87=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 

            	


            // TEMPLATE REWRITE
            // 791:2: -> validate(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stvar=$varscomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("validate",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr87!=null?std_attr87.st:null)).put("var", list_vars).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:794:1: ext_act[List join, List signal, List comments] : ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.ext_act_return ext_act(List join, List signal, List comments) throws RecognitionException {
        BPELscriptWalker.ext_act_return retval = new BPELscriptWalker.ext_act_return();
        retval.start = input.LT(1);

        CommonTree ea=null;
        BPELscriptWalker.std_attr_return std_attr88 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:795:2: ( ^( EXTENSIONACT ea= EXT_ACT std_attr ) -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:795:4: ^( EXTENSIONACT ea= EXT_ACT std_attr )
            {
            match(input,EXTENSIONACT,FOLLOW_EXTENSIONACT_in_ext_act3646); 

            match(input, Token.DOWN, null); 
            ea=(CommonTree)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act3650); 
            pushFollow(FOLLOW_std_attr_in_ext_act3652);
            std_attr88=std_attr();

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
            // 805:2: -> ext_act(join=$joinsignal=$signalext_act=m.trim()std_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("ext_act",
              new STAttrMap().put("join", join).put("signal", signal).put("ext_act", m.trim()).put("std_attr", (std_attr88!=null?std_attr88.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:808:1: nop[List join, List signal, boolean empty, List comments] : ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments);
    public final BPELscriptWalker.nop_return nop(List join, List signal, boolean empty, List comments) throws RecognitionException {
        BPELscriptWalker.nop_return retval = new BPELscriptWalker.nop_return();
        retval.start = input.LT(1);

        BPELscriptWalker.std_attr_return std_attr89 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:2: ( ^( NOP std_attr ) -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:809:4: ^( NOP std_attr )
            {
            match(input,NOP,FOLLOW_NOP_in_nop3701); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_std_attr_in_nop3703);
            std_attr89=std_attr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 810:2: -> nop(join=$joinsignal=$signalempty=$emptystd_attr=$std_attr.stcomments=$comments)
            {
                retval.st = templateLib.getInstanceOf("nop",
              new STAttrMap().put("join", join).put("signal", signal).put("empty", empty).put("std_attr", (std_attr89!=null?std_attr89.st:null)).put("comments", comments));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:814:1: namespace returns [String id] : ^( NAMESPACE ID url= STRING ) ;
    public final BPELscriptWalker.namespace_return namespace() throws RecognitionException {
        BPELscriptWalker.namespace_return retval = new BPELscriptWalker.namespace_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree ID90=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:815:2: ( ^( NAMESPACE ID url= STRING ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:815:4: ^( NAMESPACE ID url= STRING )
            {
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace3751); 

            match(input, Token.DOWN, null); 
            ID90=(CommonTree)match(input,ID,FOLLOW_ID_in_namespace3753); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_namespace3757); 

            match(input, Token.UP, null); 
            // insert namespace in global HashMap glob_ns
            		Boolean definedIn = glob_ns.containsKey((ID90!=null?ID90.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("namespace", ID90);
            		} else {
            			glob_ns.put((ID90!=null?ID90.getText():null), (url!=null?url.getText():null));
            		}
            	// set return value
            		retval.id =(ID90!=null?ID90.getText():null);
            	

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:829:1: extension : ^( EXTENSION ID url= STRING ( MUSTUND )? ) ;
    public final BPELscriptWalker.extension_return extension() throws RecognitionException {
        BPELscriptWalker.extension_return retval = new BPELscriptWalker.extension_return();
        retval.start = input.LT(1);

        CommonTree url=null;
        CommonTree MUSTUND91=null;
        CommonTree ID92=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:2: ( ^( EXTENSION ID url= STRING ( MUSTUND )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:5: ^( EXTENSION ID url= STRING ( MUSTUND )? )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension3787); 

            match(input, Token.DOWN, null); 
            ID92=(CommonTree)match(input,ID,FOLLOW_ID_in_extension3789); 
            url=(CommonTree)match(input,STRING,FOLLOW_STRING_in_extension3793); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:31: ( MUSTUND )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==MUSTUND) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:830:31: MUSTUND
                    {
                    MUSTUND91=(CommonTree)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension3795); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            		
            		//if mustUnderstand is not empty, append it to modified URL
            		String modUrl = (url!=null?url.getText():null);
            		if (MUSTUND91!=null) modUrl+=(MUSTUND91!=null?MUSTUND91.getText():null);/*" mustUnderstand=\""+$mustUnderstand.get(0)+"\"";*/
            				
            		Boolean definedIn = glob_ns.containsKey((ID92!=null?ID92.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("extension", ID92);
            		} else {
            			// insert extension in namespace HashMap glob_ns and extensions
            			glob_ns.put((ID92!=null?ID92.getText():null), (url!=null?url.getText():null));				
            			extensions.put((ID92!=null?ID92.getText():null), modUrl );
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:850:1: imports : ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) ;
    public final BPELscriptWalker.imports_return imports() throws RecognitionException {
        BPELscriptWalker.imports_return retval = new BPELscriptWalker.imports_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        CommonTree loc=null;
        CommonTree ns=null;
        BPELscriptWalker.viType_return viType93 = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:2: ( ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:5: ^( IMPORT (id= ID loc= STRING ) (ns= ID )? ( viType )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_imports3817); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:14: (id= ID loc= STRING )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:15: id= ID loc= STRING
            {
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_imports3822); 
            loc=(CommonTree)match(input,STRING,FOLLOW_STRING_in_imports3826); 

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:35: (ns= ID )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:35: ns= ID
                    {
                    ns=(CommonTree)match(input,ID,FOLLOW_ID_in_imports3831); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:40: ( viType )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==VITYPE) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:851:40: viType
                    {
                    pushFollow(FOLLOW_viType_in_imports3834);
                    viType93=viType();

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
            			if ((viType93!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType93.start),
              input.getTreeAdaptor().getTokenStopIndex(viType93.start))):null)!=null) modUrl+=" importType="+(viType93!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType93.start),
              input.getTreeAdaptor().getTokenStopIndex(viType93.start))):null).substring(5, (viType93!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(viType93.start),
              input.getTreeAdaptor().getTokenStopIndex(viType93.start))):null).length())+"\n ";
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:881:1: messages[HashMap<String, String> _messages, Boolean isInScope, List comments] : ^( MESSAGES ( message[_messages, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.messages_return messages(HashMap<String, String> _messages, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.messages_return retval = new BPELscriptWalker.messages_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:882:2: ( ^( MESSAGES ( message[_messages, isInScope, comments] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:882:4: ^( MESSAGES ( message[_messages, isInScope, comments] )+ )
            {
            match(input,MESSAGES,FOLLOW_MESSAGES_in_messages3853); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:882:15: ( message[_messages, isInScope, comments] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:882:15: message[_messages, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_message_in_messages3855);
            	    message(_messages, isInScope, comments);

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:885:1: message[HashMap<String, String> _messages, Boolean isInScope, List comments] : ^( MESSAGE ID ) ;
    public final BPELscriptWalker.message_return message(HashMap<String, String> _messages, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.message_return retval = new BPELscriptWalker.message_return();
        retval.start = input.LT(1);

        CommonTree ID94=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:886:2: ( ^( MESSAGE ID ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:886:4: ^( MESSAGE ID )
            {
            match(input,MESSAGE,FOLLOW_MESSAGE_in_message3873); 

            match(input, Token.DOWN, null); 
            ID94=(CommonTree)match(input,ID,FOLLOW_ID_in_message3875); 

            match(input, Token.UP, null); 
            	
            		Boolean definedIn = _messages.containsKey((ID94!=null?ID94.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("messageExchange", ID94);
            		} 
            		// insert messages in message HashMap
            		_messages.put((ID94!=null?ID94.getText():null), "" );                    
            	

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:899:1: variables[HashMap<String, String> _vars, Boolean isInScope, List comments] : ^( VARIABLES ( variable[_vars, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.variables_return variables(HashMap<String, String> _vars, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.variables_return retval = new BPELscriptWalker.variables_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:900:2: ( ^( VARIABLES ( variable[_vars, isInScope, comments] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:900:5: ^( VARIABLES ( variable[_vars, isInScope, comments] )+ )
            {
            match(input,VARIABLES,FOLLOW_VARIABLES_in_variables3894); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:900:17: ( variable[_vars, isInScope, comments] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:900:17: variable[_vars, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_variable_in_variables3896);
            	    variable(_vars, isInScope, comments);

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:902:1: variable[HashMap<String, String> _vars, Boolean isInScope, List comments] : ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) ;
    public final BPELscriptWalker.variable_return variable(HashMap<String, String> _vars, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.variable_return retval = new BPELscriptWalker.variable_return();
        retval.start = input.LT(1);

        CommonTree id=null;
        BPELscriptWalker.msgType_return msgT = null;

        BPELscriptWalker.viType_return viT = null;

        BPELscriptWalker.viElt_return viE = null;

        BPELscriptWalker.with_ex_return with = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:2: ( ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:4: ^( VARIABLE id= ID (msgT= msgType )? (viT= viType )? (viE= viElt )? (with= with_ex )? )
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_variable3913); 

            match(input, Token.DOWN, null); 
            id=(CommonTree)match(input,ID,FOLLOW_ID_in_variable3917); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:25: (msgT= msgType )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==MSGTYPE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:25: msgT= msgType
                    {
                    pushFollow(FOLLOW_msgType_in_variable3921);
                    msgT=msgType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:38: (viT= viType )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==VITYPE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:38: viT= viType
                    {
                    pushFollow(FOLLOW_viType_in_variable3926);
                    viT=viType();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:50: (viE= viElt )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==VIELT) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:50: viE= viElt
                    {
                    pushFollow(FOLLOW_viElt_in_variable3931);
                    viE=viElt();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:62: (with= with_ex )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==WITH) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:903:62: with= with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable3936);
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:939:1: partnerlinks[HashMap<String, String> _pl, Boolean isInScope, List comments] : ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.partnerlinks_return partnerlinks(HashMap<String, String> _pl, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.partnerlinks_return retval = new BPELscriptWalker.partnerlinks_return();
        retval.start = input.LT(1);

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:940:2: ( ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:940:4: ^( PARTNERLINKS ( partnerlink[_pl, isInScope, comments] )+ )
            {
            match(input,PARTNERLINKS,FOLLOW_PARTNERLINKS_in_partnerlinks3956); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:940:19: ( partnerlink[_pl, isInScope, comments] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:940:19: partnerlink[_pl, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_partnerlink_in_partnerlinks3958);
            	    partnerlink(_pl, isInScope, comments);

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:942:1: partnerlink[HashMap<String, String> _pl, Boolean isInScope, List comments] : ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) ;
    public final BPELscriptWalker.partnerlink_return partnerlink(HashMap<String, String> _pl, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.partnerlink_return retval = new BPELscriptWalker.partnerlink_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree ID95=null;
        BPELscriptWalker.ns_id_return plType = null;

        BPELscriptWalker.ns_id_return roleA = null;

        BPELscriptWalker.ns_id_return roleB = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:2: ( ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:4: ^( PID ID (plType= ns_id )? (roleA= ns_id )? (roleB= ns_id )? (init= INITPARTNER )? )
            {
            match(input,PID,FOLLOW_PID_in_partnerlink3972); 

            match(input, Token.DOWN, null); 
            ID95=(CommonTree)match(input,ID,FOLLOW_ID_in_partnerlink3974); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:19: (plType= ns_id )?
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:19: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3978);
                    plType=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:32: (roleA= ns_id )?
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:32: roleA= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3983);
                    roleA=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:45: (roleB= ns_id )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==NS) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:45: roleB= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partnerlink3988);
                    roleB=ns_id();

                    state._fsp--;


                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:57: (init= INITPARTNER )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==INITPARTNER) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:943:57: init= INITPARTNER
                    {
                    init=(CommonTree)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partnerlink3993); 

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
            	Boolean definedIn = _pl.containsKey((ID95!=null?ID95.getText():null));
            		
            	if (definedIn) {
            		throwDefinedWarning("partnerlink", ID95);
            	}
            	// 5)
            	_pl.put((ID95!=null?ID95.getText():null), plT);
            	

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1007:1: corr_sets[HashMap<String, String>_cs, Boolean isInScope, List comments] : ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ ) ;
    public final BPELscriptWalker.corr_sets_return corr_sets(HashMap<String, String>_cs, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.corr_sets_return retval = new BPELscriptWalker.corr_sets_return();
        retval.start = input.LT(1);

        List list_cs=null;
        RuleReturnScope cs = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1008:2: ( ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1008:4: ^( CORRSETS (cs+= corr_set[_cs, isInScope, comments] )+ )
            {
            match(input,CORRSETS,FOLLOW_CORRSETS_in_corr_sets4012); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1008:17: (cs+= corr_set[_cs, isInScope, comments] )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1008:17: cs+= corr_set[_cs, isInScope, comments]
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets4016);
            	    cs=corr_set(_cs, isInScope, comments);

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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1010:1: corr_set[HashMap<String, String>_cs, Boolean isInScope, List comments] : ^( CORRSET f= ID (params+= ID )+ ) ;
    public final BPELscriptWalker.corr_set_return corr_set(HashMap<String, String>_cs, Boolean isInScope, List comments) throws RecognitionException {
        BPELscriptWalker.corr_set_return retval = new BPELscriptWalker.corr_set_return();
        retval.start = input.LT(1);

        CommonTree f=null;
        CommonTree params=null;
        List list_params=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1011:2: ( ^( CORRSET f= ID (params+= ID )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1011:4: ^( CORRSET f= ID (params+= ID )+ )
            {
            match(input,CORRSET,FOLLOW_CORRSET_in_corr_set4030); 

            match(input, Token.DOWN, null); 
            f=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set4034); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1011:25: (params+= ID )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1011:25: params+= ID
            	    {
            	    params=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_set4038); 
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1041:1: correlation : ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors);
    public final BPELscriptWalker.correlation_return correlation() throws RecognitionException {
        BPELscriptWalker.correlation_return retval = new BPELscriptWalker.correlation_return();
        retval.start = input.LT(1);

        List list_cors=null;
        RuleReturnScope cors = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1042:2: ( ^( CORRELATION (cors+= corr_mapping )+ ) -> list(content_st=$cors))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1042:4: ^( CORRELATION (cors+= corr_mapping )+ )
            {
            match(input,CORRELATION,FOLLOW_CORRELATION_in_correlation4056); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1042:22: (cors+= corr_mapping )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1042:22: cors+= corr_mapping
            	    {
            	    pushFollow(FOLLOW_corr_mapping_in_correlation4060);
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
            // 1043:2: -> list(content_st=$cors)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1049:1: corr_mapping : ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern);
    public final BPELscriptWalker.corr_mapping_return corr_mapping() throws RecognitionException {
        BPELscriptWalker.corr_mapping_return retval = new BPELscriptWalker.corr_mapping_return();
        retval.start = input.LT(1);

        CommonTree init=null;
        CommonTree pattern=null;
        CommonTree ID96=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:2: ( ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? ) -> correlation_map(id=$IDinit=$initpattern=$pattern))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:4: ^( CORR_MAP ID (init= INIT_COR )? (pattern= PATTERN_COR )? )
            {
            match(input,CORR_MAP,FOLLOW_CORR_MAP_in_corr_mapping4088); 

            match(input, Token.DOWN, null); 
            ID96=(CommonTree)match(input,ID,FOLLOW_ID_in_corr_mapping4090); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:22: (init= INIT_COR )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==INIT_COR) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:22: init= INIT_COR
                    {
                    init=(CommonTree)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping4094); 

                    }
                    break;

            }

            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:40: (pattern= PATTERN_COR )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==PATTERN_COR) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1050:40: pattern= PATTERN_COR
                    {
                    pattern=(CommonTree)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping4099); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            	
            		Boolean definedIn = expressions.containsKey((ID96!=null?ID96.getText():null));
            		
            		if (definedIn) {
            			throwDefinedWarning("correlation", ID96);
            			//throw new RecognitionException();
            		} else {
            			expressions.put((ID96!=null?ID96.getText():null), null);/*, $expr.retval);//	System.out.println(expressions);*/
            		}
            	


            // TEMPLATE REWRITE
            // 1062:2: -> correlation_map(id=$IDinit=$initpattern=$pattern)
            {
                retval.st = templateLib.getInstanceOf("correlation_map",
              new STAttrMap().put("id", ID96).put("init", init).put("pattern", pattern));
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1069:1: expr[StringTemplate path_expr] returns [String retval, List vars=new ArrayList()] : (se= s_expr[$vars] -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call );
    public final BPELscriptWalker.expr_return expr(StringTemplate path_expr) throws RecognitionException {
        BPELscriptWalker.expr_return retval = new BPELscriptWalker.expr_return();
        retval.start = input.LT(1);

        CommonTree ee=null;
        BPELscriptWalker.s_expr_return se = null;

        BPELscriptWalker.funct_call_return fc = null;


        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1070:2: (se= s_expr[$vars] -> s_expr(value=$se.retvalpath=$path_expr) | ee= EXT_EXPR -> expr(expr=$retval) | fc= funct_call )
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1070:5: se= s_expr[$vars]
                    {
                    pushFollow(FOLLOW_s_expr_in_expr4154);
                    se=s_expr(retval.vars);

                    state._fsp--;

                    retval.retval =(se!=null?se.retval:null);retval.vars =(se!=null?se.retvar:null);


                    // TEMPLATE REWRITE
                    // 1071:2: -> s_expr(value=$se.retvalpath=$path_expr)
                    {
                        retval.st = templateLib.getInstanceOf("s_expr",
                      new STAttrMap().put("value", (se!=null?se.retval:null)).put("path", path_expr));
                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1072:5: ee= EXT_EXPR
                    {
                    ee=(CommonTree)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr4181); 
                    	
                    		retval.retval =(ee!=null?ee.getText():null);
                    		
                    		//remove expression brackets
                    		retval.retval = retval.retval.substring(1, retval.retval.length()-1);
                    		//change specific syntax
                    		if (retval.retval.contains("<")) retval.retval = retval.retval.replace("<", "&lt;"); 
                    		if (retval.retval.contains(">")) retval.retval = retval.retval.replace("<", "&gt;");       
                    	


                    // TEMPLATE REWRITE
                    // 1082:2: -> expr(expr=$retval)
                    {
                        retval.st = templateLib.getInstanceOf("expr",
                      new STAttrMap().put("expr", retval.retval));
                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1083:5: fc= funct_call
                    {
                    pushFollow(FOLLOW_funct_call_in_expr4204);
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1089:1: funct_call returns [String retval] : ^( CALL (ids+= ID )+ ) ;
    public final BPELscriptWalker.funct_call_return funct_call() throws RecognitionException {
        BPELscriptWalker.funct_call_return retval = new BPELscriptWalker.funct_call_return();
        retval.start = input.LT(1);

        CommonTree ids=null;
        List list_ids=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1091:2: ( ^( CALL (ids+= ID )+ ) )
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1091:4: ^( CALL (ids+= ID )+ )
            {
            match(input,CALL,FOLLOW_CALL_in_funct_call4226); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1091:14: (ids+= ID )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1091:14: ids+= ID
            	    {
            	    ids=(CommonTree)match(input,ID,FOLLOW_ID_in_funct_call4230); 
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
        public List retvar;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "s_expr"
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1113:1: s_expr[List vars] returns [String retval, List retvar] : ( ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st));
    public final BPELscriptWalker.s_expr_return s_expr(List vars) throws RecognitionException {
        BPELscriptWalker.s_expr_return retval = new BPELscriptWalker.s_expr_return();
        retval.start = input.LT(1);

        CommonTree STRING97=null;
        CommonTree INT98=null;
        BPELscriptWalker.s_expr_return s1 = null;

        BPELscriptWalker.s_expr_return s2 = null;

        BPELscriptWalker.path_expr_return pe = null;


        retval.retvar =vars;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1115:2: ( ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] ) | STRING | INT | pe= path_expr -> path_expr(path=pe.st))
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1115:4: ^( '==' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,164,FOLLOW_164_in_s_expr4266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4270);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4275);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1116:4: ^( '!=' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,165,FOLLOW_165_in_s_expr4285); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4289);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4294);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1117:4: ^( '<' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,166,FOLLOW_166_in_s_expr4304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4308);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4313);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1118:4: ^( '>' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,167,FOLLOW_167_in_s_expr4323); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4327);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4332);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1119:4: ^( '<=' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,168,FOLLOW_168_in_s_expr4342); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4346);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4351);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1120:4: ^( '=>' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,197,FOLLOW_197_in_s_expr4361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4365);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4370);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1121:4: ^( '+' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,170,FOLLOW_170_in_s_expr4380); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4384);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4389);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1122:4: ^( '-' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,171,FOLLOW_171_in_s_expr4399); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4403);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4408);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1123:4: ^( '*' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,172,FOLLOW_172_in_s_expr4418); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4422);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4427);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1124:4: ^( '/' s1= s_expr[$retvar] s2= s_expr[$retvar] )
                    {
                    match(input,173,FOLLOW_173_in_s_expr4437); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_s_expr_in_s_expr4441);
                    s1=s_expr(retval.retvar);

                    state._fsp--;

                    pushFollow(FOLLOW_s_expr_in_s_expr4446);
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1125:4: STRING
                    {
                    STRING97=(CommonTree)match(input,STRING,FOLLOW_STRING_in_s_expr4455); 
                    retval.retval = (STRING97!=null?STRING97.getText():null);

                    }
                    break;
                case 12 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1126:4: INT
                    {
                    INT98=(CommonTree)match(input,INT,FOLLOW_INT_in_s_expr4463); 
                    retval.retval =(INT98!=null?INT98.getText():null);

                    }
                    break;
                case 13 :
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1127:4: pe= path_expr
                    {
                    pushFollow(FOLLOW_path_expr_in_s_expr4472);
                    pe=path_expr();

                    state._fsp--;

                    retval.retval =(pe!=null?pe.retval:null);retval.retvar.add((pe!=null?pe.retval:null));


                    // TEMPLATE REWRITE
                    // 1127:63: -> path_expr(path=pe.st)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1133:1: path_expr returns [String retval] : ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns);
    public final BPELscriptWalker.path_expr_return path_expr() throws RecognitionException {
        BPELscriptWalker.path_expr_return retval = new BPELscriptWalker.path_expr_return();
        retval.start = input.LT(1);

        List list_ns=null;
        RuleReturnScope ns = null;
        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1134:2: ( ^( PATH (ns+= ns_id )+ ) -> path_expr(pns_p=$ns))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1134:4: ^( PATH (ns+= ns_id )+ )
            {
            match(input,PATH,FOLLOW_PATH_in_path_expr4501); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1134:13: (ns+= ns_id )+
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
            	    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1134:13: ns+= ns_id
            	    {
            	    pushFollow(FOLLOW_ns_id_in_path_expr4505);
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
            // 1138:2: -> path_expr(pns_p=$ns)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1144:1: ns_id returns [String nspre, String nsloc, CommonTree locID] : ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text);
    public final BPELscriptWalker.ns_id_return ns_id() throws RecognitionException {
        BPELscriptWalker.ns_id_return retval = new BPELscriptWalker.ns_id_return();
        retval.start = input.LT(1);

        CommonTree pre=null;
        CommonTree loc=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1145:2: ( ^( NS (pre= ID )? loc= ID ) -> ns_id(pre_opt=$preloc=$loc.text))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1145:4: ^( NS (pre= ID )? loc= ID )
            {
            match(input,NS,FOLLOW_NS_in_ns_id4541); 

            match(input, Token.DOWN, null); 
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1145:12: (pre= ID )?
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
                    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1145:12: pre= ID
                    {
                    pre=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id4545); 

                    }
                    break;

            }

            loc=(CommonTree)match(input,ID,FOLLOW_ID_in_ns_id4550); 

            match(input, Token.UP, null); 
            // set return values (pre only when not null ;) )
            		
            		if (pre != null) {retval.nspre = (pre!=null?pre.getText():null);} 
            		retval.nsloc = (loc!=null?loc.getText():null);
            		retval.locID =loc;
            	


            // TEMPLATE REWRITE
            // 1152:2: -> ns_id(pre_opt=$preloc=$loc.text)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1155:1: portType : ^( PORTTYPE s= STRING ) -> portType(port=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.portType_return portType() throws RecognitionException {
        BPELscriptWalker.portType_return retval = new BPELscriptWalker.portType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1156:2: ( ^( PORTTYPE s= STRING ) -> portType(port=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1156:4: ^( PORTTYPE s= STRING )
            {
            match(input,PORTTYPE,FOLLOW_PORTTYPE_in_portType4585); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_portType4589); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1157:2: -> portType(port=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1160:1: std_attr : ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure);
    public final BPELscriptWalker.std_attr_return std_attr() throws RecognitionException {
        BPELscriptWalker.std_attr_return retval = new BPELscriptWalker.std_attr_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree suppressJoinFailure=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:2: ( ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? ) -> std_attr(name=$namesjf=$suppressJoinFailure))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:4: ^( STD_ATTR (name= STRING )? (suppressJoinFailure= SJF )? )
            {
            match(input,STD_ATTR,FOLLOW_STD_ATTR_in_std_attr4613); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:19: (name= STRING )?
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==STRING) ) {
                    alt121=1;
                }
                switch (alt121) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:19: name= STRING
                        {
                        name=(CommonTree)match(input,STRING,FOLLOW_STRING_in_std_attr4617); 

                        }
                        break;

                }

                // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:47: (suppressJoinFailure= SJF )?
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==SJF) ) {
                    alt122=1;
                }
                switch (alt122) {
                    case 1 :
                        // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1161:47: suppressJoinFailure= SJF
                        {
                        suppressJoinFailure=(CommonTree)match(input,SJF,FOLLOW_SJF_in_std_attr4622); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 1162:2: -> std_attr(name=$namesjf=$suppressJoinFailure)
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1165:1: msgEx : ^( MSGEX s= STRING ) -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.msgEx_return msgEx() throws RecognitionException {
        BPELscriptWalker.msgEx_return retval = new BPELscriptWalker.msgEx_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1166:2: ( ^( MSGEX s= STRING ) -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1166:4: ^( MSGEX s= STRING )
            {
            match(input,MSGEX,FOLLOW_MSGEX_in_msgEx4652); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgEx4656); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1167:2: -> msgEx(msgEx=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1170:1: msgType : ^( MSGTYPE s= STRING ) -> msgType(msgT=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.msgType_return msgType() throws RecognitionException {
        BPELscriptWalker.msgType_return retval = new BPELscriptWalker.msgType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1171:2: ( ^( MSGTYPE s= STRING ) -> msgType(msgT=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1171:4: ^( MSGTYPE s= STRING )
            {
            match(input,MSGTYPE,FOLLOW_MSGTYPE_in_msgType4679); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_msgType4683); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1172:2: -> msgType(msgT=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1175:1: viType : ^( VITYPE s= STRING ) -> viType(type=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.viType_return viType() throws RecognitionException {
        BPELscriptWalker.viType_return retval = new BPELscriptWalker.viType_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1176:2: ( ^( VITYPE s= STRING ) -> viType(type=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1176:4: ^( VITYPE s= STRING )
            {
            match(input,VITYPE,FOLLOW_VITYPE_in_viType4708); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viType4712); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1177:2: -> viType(type=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1180:1: viElt : ^( VIELT s= STRING ) -> viElt(elt=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.viElt_return viElt() throws RecognitionException {
        BPELscriptWalker.viElt_return retval = new BPELscriptWalker.viElt_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1181:2: ( ^( VIELT s= STRING ) -> viElt(elt=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1181:4: ^( VIELT s= STRING )
            {
            match(input,VIELT,FOLLOW_VIELT_in_viElt4737); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_viElt4741); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1182:2: -> viElt(elt=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1185:1: faultName : ^( FAULTNAME s= STRING ) -> faultName(faultName=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.faultName_return faultName() throws RecognitionException {
        BPELscriptWalker.faultName_return retval = new BPELscriptWalker.faultName_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1186:2: ( ^( FAULTNAME s= STRING ) -> faultName(faultName=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1186:4: ^( FAULTNAME s= STRING )
            {
            match(input,FAULTNAME,FOLLOW_FAULTNAME_in_faultName4764); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultName4768); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1187:2: -> faultName(faultName=$s.text.replaceFirst(\":\", \"\"))
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
    // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1190:1: faultElt : ^( FAULTELT s= STRING ) -> faultElt(name=$s.text.replaceFirst(\":\", \"\"));
    public final BPELscriptWalker.faultElt_return faultElt() throws RecognitionException {
        BPELscriptWalker.faultElt_return retval = new BPELscriptWalker.faultElt_return();
        retval.start = input.LT(1);

        CommonTree s=null;

        try {
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1191:2: ( ^( FAULTELT s= STRING ) -> faultElt(name=$s.text.replaceFirst(\":\", \"\")))
            // /home/bischomc/studienarbeit/workspace/BPELscript/src/iaas/bpelscript/antlr/BPELscriptWalker.g:1191:4: ^( FAULTELT s= STRING )
            {
            match(input,FAULTELT,FOLLOW_FAULTELT_in_faultElt4791); 

            match(input, Token.DOWN, null); 
            s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_faultElt4795); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1192:2: -> faultElt(name=$s.text.replaceFirst(\":\", \"\"))
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
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pick_in_proc_stmt457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_proc_stmt581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reply_in_proc_stmt611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_proc_stmt626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_in_proc_stmt704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_proc_stmt721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validate_in_proc_stmt728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partnerlinks_in_proc_stmt745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nop_in_proc_stmt782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messages_in_proc_stmt797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_block821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_proc_stmts_in_block825 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_block854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block856 = new BitSet(new long[]{0x00A4000000020028L});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block865 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_SEQUENCE_in_param_block898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_param_block902 = new BitSet(new long[]{0x0000000000020008L,0x0000000000020000L});
    public static final BitSet FOLLOW_proc_stmts_in_param_block907 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_block_in_body943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICK_in_pick985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onMessage_in_pick989 = new BitSet(new long[]{0x0000000080000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_onAlarm_in_pick995 = new BitSet(new long[]{0x0000000000000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick998 = new BitSet(new long[]{0x0000000000000000L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_pick1001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONALARM_in_onAlarm1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_alarm_in_onAlarm1057 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_timeout_in_onAlarm1061 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm1065 = new BitSet(new long[]{0x0000000011000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_scope_short_in_onAlarm1068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALARM_in_alarm1116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_alarm1118 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_alarm1121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEOUT_in_timeout1184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_timeout1186 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_timeout1189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEATEVERY_in_repeatEvery1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONMESSAGE_in_onMessage1295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_param_block_in_onMessage1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020081L});
    public static final BitSet FOLLOW_portType_in_onMessage1315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020080L});
    public static final BitSet FOLLOW_msgEx_in_onMessage1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage1325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onMessage1329 = new BitSet(new long[]{0x0000040400000008L});
    public static final BitSet FOLLOW_correlation_in_onMessage1333 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_onMessage1338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow1433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_flow1437 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_flow1441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_if_ex1486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1490 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_if_ex1495 = new BitSet(new long[]{0x0000000000001800L,0x000000000004E016L});
    public static final BitSet FOLLOW_ELSIF_in_if_ex1503 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_if_ex1507 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_if_ex1512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_if_ex1523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequence_in_if_ex1527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_std_attr_in_if_ex1533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNAL_in_signal1596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_signal1598 = new BitSet(new long[]{0x0012800000000008L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_signal1602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_join1641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join1645 = new BitSet(new long[]{0x0012800000000008L,0x0000000100022000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_join1650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequence1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_sequence1691 = new BitSet(new long[]{0x0000000000020088L});
    public static final BitSet FOLLOW_body_in_sequence1696 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_signal_in_sequence1701 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_sequence1704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEQUENCE_in_scope_sequence1749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_in_scope_sequence1753 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1758 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_signal_in_scope_sequence1763 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_WHILE_in_while_ex1837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_while_ex1839 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_while_ex1844 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_while_ex1847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_in_until_ex1896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_until_ex1898 = new BitSet(new long[]{0x0000000000000080L,0x000000000004E016L});
    public static final BitSet FOLLOW_sequence_in_until_ex1903 = new BitSet(new long[]{0xC340314253BDFD48L,0x000000000004E016L});
    public static final BitSet FOLLOW_std_attr_in_until_ex1906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_foreach1956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_foreach1960 = new BitSet(new long[]{0x0012800000000000L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1964 = new BitSet(new long[]{0x0012800000000000L,0x0000000100002000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1969 = new BitSet(new long[]{0x0012800011000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_expr_in_foreach1974 = new BitSet(new long[]{0x0012800011000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_scope_short_in_foreach1982 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach1984 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_SBO_in_foreach1987 = new BitSet(new long[]{0xC340314253BDFD48L,0x00000000001CE016L});
    public static final BitSet FOLLOW_std_attr_in_foreach1990 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_try_ex2068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex2072 = new BitSet(new long[]{0x0000000004020088L});
    public static final BitSet FOLLOW_body_in_try_ex2078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catch_ex2110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex2112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_param_block_in_catch_ex2117 = new BitSet(new long[]{0x0000000000000008L,0x0000000000003000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex2122 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex2125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_ex2152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_scope_ex2156 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex2161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex2166 = new BitSet(new long[]{0x0000000000000008L,0x000000000020C000L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex2169 = new BitSet(new long[]{0x0000000000000008L,0x000000000000C000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex2172 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex2175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_short2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short2246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCOPE_in_scope_stmt2276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt2280 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000050L});
    public static final BitSet FOLLOW_termination_in_scope_stmt2285 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt2290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATION_in_termination2316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_termination2318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENTHDL_in_eventHdl2341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2345 = new BitSet(new long[]{0x0000000020000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2350 = new BitSet(new long[]{0x0000000000000008L,0x000000000004E016L});
    public static final BitSet FOLLOW_EVENT_in_onEvent2372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_onEvent2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent2380 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_correlation_in_onEvent2384 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_with_ex_in_onEvent2389 = new BitSet(new long[]{0x0012840411000000L,0x0000000100002008L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_scope_short_in_onEvent2394 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020A81L});
    public static final BitSet FOLLOW_ID_in_onEvent2401 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A81L});
    public static final BitSet FOLLOW_portType_in_onEvent2404 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A80L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2407 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000A00L});
    public static final BitSet FOLLOW_msgType_in_onEvent2410 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_viElt_in_onEvent2413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATION_in_compensation2450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_compensation2452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WITH_in_with_ex2483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_with_map_in_with_ex2487 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_MAP_in_with_map2526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_with_map2528 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEY_in_with_map2530 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_path_expr_in_with_map2535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECEIVE_in_receive2564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_receive2568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_receive2572 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_correlation_in_receive2576 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_portType_in_receive2581 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive2586 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_msgEx_in_receive2589 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001CE097L});
    public static final BitSet FOLLOW_std_attr_in_receive2592 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_receive2596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLY_in_reply2697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reply2701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_reply2705 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_ID_in_reply2709 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_correlation_in_reply2714 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_portType_in_reply2717 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_std_attr_in_reply2720 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000180L});
    public static final BitSet FOLLOW_faultName_in_reply2724 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000080L});
    public static final BitSet FOLLOW_msgEx_in_reply2727 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_reply2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOKE_in_invoke2839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_invoke2843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_invoke2847 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_ID_in_invoke2851 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_correlation_in_invoke2856 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_portType_in_invoke2859 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000001EE097L});
    public static final BitSet FOLLOW_std_attr_in_invoke2862 = new BitSet(new long[]{0x0000040100000008L});
    public static final BitSet FOLLOW_with_ex_in_invoke2866 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_compensation_in_invoke2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assign2971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_expr_in_assign2975 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_PROP_in_assign2977 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_portType_in_assign2980 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign2983 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_assign2987 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_faultName_in_assign2989 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_msgEx_in_assign2992 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VALID_in_assign2995 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign2998 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IGNORE_in_assign3001 = new BitSet(new long[]{0x0012800000050000L,0x0000000103802180L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rvalue_in_assign3007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_receive_in_rvalue3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue3216 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throw_ex3348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex3350 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_ID_in_throw_ex3354 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_throw_ex3357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETHROW_in_rethrow_ex3427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex3429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPENSATE_in_compensate3479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_compensate3483 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_compensate3486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXIT_in_exit3536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_exit3538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALIDATE_in_validate3584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_validate3588 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_validate3591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSIONACT_in_ext_act3646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act3650 = new BitSet(new long[]{0xC340314653BDFD48L,0x00000000041EE097L});
    public static final BitSet FOLLOW_std_attr_in_ext_act3652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOP_in_nop3701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_std_attr_in_nop3703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace3751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_namespace3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_namespace3757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension3787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension3789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_extension3793 = new BitSet(new long[]{0x0000000000000008L,0x0000000010000000L});
    public static final BitSet FOLLOW_MUSTUND_in_extension3795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_imports3817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_imports3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STRING_in_imports3826 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020400L});
    public static final BitSet FOLLOW_ID_in_imports3831 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_viType_in_imports3834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MESSAGES_in_messages3853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_message_in_messages3855 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_MESSAGE_in_message3873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_message3875 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLES_in_variables3894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variables3896 = new BitSet(new long[]{0x0000002000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_variable3913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_variable3917 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000E00L});
    public static final BitSet FOLLOW_msgType_in_variable3921 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000C00L});
    public static final BitSet FOLLOW_viType_in_variable3926 = new BitSet(new long[]{0x0000040000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_viElt_in_variable3931 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_with_ex_in_variable3936 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTNERLINKS_in_partnerlinks3956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_partnerlink_in_partnerlinks3958 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_PID_in_partnerlink3972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_partnerlink3974 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3978 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3983 = new BitSet(new long[]{0x0008000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_ns_id_in_partnerlink3988 = new BitSet(new long[]{0x0000000000000008L,0x0000000020000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partnerlink3993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CORRSETS_in_corr_sets4012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets4016 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CORRSET_in_corr_set4030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_set4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_corr_set4038 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_CORRELATION_in_correlation4056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation4060 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_CORR_MAP_in_corr_mapping4088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_corr_mapping4090 = new BitSet(new long[]{0x0000000000000008L,0x00000000C0000000L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping4094 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping4099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_s_expr_in_expr4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_funct_call4226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_funct_call4230 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_164_in_s_expr4266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4270 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_165_in_s_expr4285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4289 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_166_in_s_expr4304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4308 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_167_in_s_expr4323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4327 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_168_in_s_expr4342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4346 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_197_in_s_expr4361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4365 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_170_in_s_expr4380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4384 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_171_in_s_expr4399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4403 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_172_in_s_expr4418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4422 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_173_in_s_expr4437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4441 = new BitSet(new long[]{0x0010000000000000L,0x0000000100402000L,0x00003DF000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_s_expr_in_s_expr4446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_s_expr4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_s_expr4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_s_expr4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_expr4501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4505 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_NS_in_ns_id4541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ns_id4545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_ns_id4550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORTTYPE_in_portType4585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_portType4589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STD_ATTR_in_std_attr4613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_std_attr4617 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_std_attr4622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGEX_in_msgEx4652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgEx4656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MSGTYPE_in_msgType4679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_msgType4683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VITYPE_in_viType4708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viType4712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VIELT_in_viElt4737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_viElt4741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTNAME_in_faultName4764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultName4768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FAULTELT_in_faultElt4791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_faultElt4795 = new BitSet(new long[]{0x0000000000000008L});

}