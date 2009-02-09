// $ANTLR 3.1b2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g 2009-02-09 19:13:37

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BPELscriptLexer extends Lexer {
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
    public static final int SJF=81;
    public static final int WAIT=22;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int CREATE_INST=85;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=106;
    public static final int T__129=129;
    public static final int SBO=88;
    public static final int EOSF=82;
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
    public static final int VARIABLES=65;
    public static final int ASSIGN=20;
    public static final int XML_LITERAL=49;
    public static final int T__169=169;

    // delegates
    // delegators

    public BPELscriptLexer() {;} 
    public BPELscriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BPELscriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g"; }

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:24:8: ( '@queryLanguage' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:24:10: '@queryLanguage'
            {
            match("@queryLanguage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:25:8: ( '@expressionLanguage' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:25:10: '@expressionLanguage'
            {
            match("@expressionLanguage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:26:8: ( 'process' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:26:10: 'process'
            {
            match("process"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:27:8: ( '{' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:27:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:28:8: ( '}' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:28:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:29:8: ( '|' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:29:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:30:8: ( ',' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:30:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:31:8: ( 'pick' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:31:10: 'pick'
            {
            match("pick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:32:8: ( 'onMessage' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:32:10: 'onMessage'
            {
            match("onMessage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:33:8: ( '(' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:33:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:34:8: ( ')' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:34:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:35:8: ( 'alarm' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:35:10: 'alarm'
            {
            match("alarm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:36:8: ( 'timeout' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:36:10: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:37:8: ( 'repeatEvery' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:37:10: 'repeatEvery'
            {
            match("repeatEvery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:38:8: ( 'parallel' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:38:10: 'parallel'
            {
            match("parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:39:8: ( 'and' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:39:10: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:40:8: ( 'signal' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:40:10: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:41:8: ( '@signal' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:41:10: '@signal'
            {
            match("@signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:42:8: ( '@join' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:42:10: '@join'
            {
            match("@join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:43:8: ( 'join' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:43:10: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:44:8: ( 'if' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:44:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:45:8: ( 'elseif' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:45:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:46:8: ( 'else' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:46:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:47:8: ( 'while' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:47:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:48:8: ( 'repeat' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:48:10: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:49:8: ( 'until' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:49:10: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:50:8: ( 'for' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:50:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:51:8: ( '=' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:51:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:52:8: ( 'to' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:52:10: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:53:8: ( 'finish' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:53:10: 'finish'
            {
            match("finish"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:54:8: ( 'try' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:54:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:55:8: ( '@faultMessageType' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:55:10: '@faultMessageType'
            {
            match("@faultMessageType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:56:8: ( 'catch' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:56:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:57:8: ( 'catchAll' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:57:10: 'catchAll'
            {
            match("catchAll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:58:8: ( 'scope' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:58:10: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:59:8: ( 'onTermination' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:59:10: 'onTermination'
            {
            match("onTermination"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:60:8: ( 'events' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:60:10: 'events'
            {
            match("events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:61:8: ( 'event' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:61:10: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:62:8: ( 'compensation' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:62:10: 'compensation'
            {
            match("compensation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:63:8: ( 'with' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:63:10: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:64:8: ( ':' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:64:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:65:8: ( 'receive' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:65:10: 'receive'
            {
            match("receive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:66:8: ( 'reply' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:66:10: 'reply'
            {
            match("reply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:67:8: ( 'invoke' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:67:10: 'invoke'
            {
            match("invoke"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:68:8: ( '@faultVariable' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:68:10: '@faultVariable'
            {
            match("@faultVariable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:69:8: ( '@faultVar' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:69:10: '@faultVar'
            {
            match("@faultVar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:70:8: ( 'throw' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:70:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:71:8: ( 'rethrow' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:71:10: 'rethrow'
            {
            match("rethrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:72:8: ( 'compensate' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:72:10: 'compensate'
            {
            match("compensate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:73:8: ( 'exit' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:73:10: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:74:8: ( 'validate' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:74:10: 'validate'
            {
            match("validate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:75:8: ( 'nop' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:75:10: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:76:8: ( 'opaque()' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:76:10: 'opaque()'
            {
            match("opaque()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:77:8: ( 'namespace' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:77:10: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:78:8: ( 'extension' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:78:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:8: ( 'import' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:79:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:80:8: ( '::' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:80:10: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:8: ( 'messages' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:81:10: 'messages'
            {
            match("messages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:82:8: ( 'var' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:82:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:83:8: ( 'partnerLink' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:83:10: 'partnerLink'
            {
            match("partnerLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:8: ( 'partnerlink' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:84:10: 'partnerlink'
            {
            match("partnerlink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:85:8: ( 'correlates' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:85:10: 'correlates'
            {
            match("correlates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:86:8: ( '==' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:86:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:87:8: ( '!=' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:87:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:8: ( '<' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:88:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:8: ( '>' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:89:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:90:8: ( '<=' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:90:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:91:8: ( '>=' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:91:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:92:8: ( '+' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:92:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:8: ( '-' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:93:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:8: ( '*' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:94:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:8: ( '/' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:95:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:96:8: ( '.' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:96:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:8: ( '@portType' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:10: '@portType'
            {
            match("@portType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:8: ( '@pt' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:98:10: '@pt'
            {
            match("@pt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:8: ( '@name' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:10: '@name'
            {
            match("@name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:100:8: ( '@messageExchange' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:100:10: '@messageExchange'
            {
            match("@messageExchange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:101:8: ( '@mex' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:101:10: '@mex'
            {
            match("@mex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:8: ( '@messageType' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:10: '@messageType'
            {
            match("@messageType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:8: ( '@msgType' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:103:10: '@msgType'
            {
            match("@msgType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:8: ( '@type' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:104:10: '@type'
            {
            match("@type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:105:8: ( '@element' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:105:10: '@element'
            {
            match("@element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:8: ( '@faultName' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:10: '@faultName'
            {
            match("@faultName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:8: ( '@fault' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:10: '@fault'
            {
            match("@fault"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:108:8: ( '@faultElement' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:108:10: '@faultElement'
            {
            match("@faultElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "EXT_EXPR"
    public final void mEXT_EXPR() throws RecognitionException {
        try {
            int _type = EXT_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:11: ( '[' ( options {greedy=false; } : . )* ']' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:13: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXT_EXPR"

    // $ANTLR start "EXT_ACT"
    public final void mEXT_ACT() throws RecognitionException {
        try {
            int _type = EXT_ACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token pre=null;
            Token post=null;
            int c;

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:10: (pre= '{{{' ( options {greedy=false; } : c= . )* post= '}}}' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:12: pre= '{{{' ( options {greedy=false; } : c= . )* post= '}}}'
            {
            int preStart = getCharIndex();
            match("{{{"); 
            pre = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, preStart, getCharIndex()-1);
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:22: ( options {greedy=false; } : c= . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='}') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='}') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='|')||(LA2_3>='~' && LA2_3<='\uFFFE')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='|')||(LA2_1>='~' && LA2_1<='\uFFFE')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:49: c= .
            	    {
            	    c = input.LA(1);
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            int postStart = getCharIndex();
            match("}}}"); 
            post = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, postStart, getCharIndex()-1);

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXT_ACT"

    // $ANTLR start "OPAQUE_EXPR"
    public final void mOPAQUE_EXPR() throws RecognitionException {
        try {
            int _type = OPAQUE_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:13: ( '##opaque' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:15: '##opaque'
            {
            match("##opaque"); 

            setText(" opaque=\"yes\"");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPAQUE_EXPR"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:379:7: ( 'in' | 'out' | 'inout' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='i') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='n') ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3=='o') ) {
                        alt3=3;
                    }
                    else {
                        alt3=1;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0=='o') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:379:9: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:379:16: 'out'
                    {
                    match("out"); 


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:379:24: 'inout'
                    {
                    match("inout"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:8: ( ';' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:6: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' | '-' )* )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:8: ( LETTER | '_' ) ( LETTER | DIGIT | '_' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:381:24: ( LETTER | DIGIT | '_' | '-' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:7: ( ( DIGIT )+ )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:9: ( DIGIT )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:9: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:9: ( '\"' ( ESCAPE_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:11: '\"' ( ESCAPE_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:15: ( ESCAPE_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:17: ESCAPE_SEQ
            	    {
            	    mESCAPE_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:30: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESCAPE_SEQ"
    public final void mESCAPE_SEQ() throws RecognitionException {
        try {
            int _type = ESCAPE_SEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:15: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQ"

    // $ANTLR start "SL_COMMENTS"
    public final void mSL_COMMENTS() throws RecognitionException {
        try {
            int _type = SL_COMMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:13: ( ( '//' ) ( . )* CR )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:15: ( '//' ) ( . )* CR
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:15: ( '//' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:17: '//'
            {
            match("//"); 


            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:23: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:385:23: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mCR(); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENTS"

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:6: ( ( '\\r' | '\\n' )+ )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:8: ( '\\r' | '\\n' )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:8: ( '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:6: ( ( ' ' | '\\t' )+ )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:8: ( ' ' | '\\t' )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:8: ( ' ' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:16: ( '0' .. '9' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:388:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:389:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "EOSF"
    public final void mEOSF() throws RecognitionException {
        try {
            int _type = EOSF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:2: ( ( '@exitOnStandardFault' | '@exit' ) | ( '@exitOnStandardFault no' | '@exit no' ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:4: ( '@exitOnStandardFault' | '@exit' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:4: ( '@exitOnStandardFault' | '@exit' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='@') ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1=='e') ) {
                            int LA10_2 = input.LA(3);

                            if ( (LA10_2=='x') ) {
                                int LA10_3 = input.LA(4);

                                if ( (LA10_3=='i') ) {
                                    int LA10_4 = input.LA(5);

                                    if ( (LA10_4=='t') ) {
                                        int LA10_5 = input.LA(6);

                                        if ( (LA10_5=='O') ) {
                                            alt10=1;
                                        }
                                        else {
                                            alt10=2;}
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 10, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:5: '@exitOnStandardFault'
                            {
                            match("@exitOnStandardFault"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:393:30: '@exit'
                            {
                            match("@exit"); 


                            }
                            break;

                    }

                    setText("exitOnStandardFault=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:394:4: ( '@exitOnStandardFault no' | '@exit no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:394:4: ( '@exitOnStandardFault no' | '@exit no' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='@') ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1=='e') ) {
                            int LA11_2 = input.LA(3);

                            if ( (LA11_2=='x') ) {
                                int LA11_3 = input.LA(4);

                                if ( (LA11_3=='i') ) {
                                    int LA11_4 = input.LA(5);

                                    if ( (LA11_4=='t') ) {
                                        int LA11_5 = input.LA(6);

                                        if ( (LA11_5=='O') ) {
                                            alt11=1;
                                        }
                                        else if ( (LA11_5==' ') ) {
                                            alt11=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 11, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 11, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:394:5: '@exitOnStandardFault no'
                            {
                            match("@exitOnStandardFault no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:394:33: '@exit no'
                            {
                            match("@exit no"); 


                            }
                            break;

                    }

                    setText("exitOnStandardFault=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EOSF"

    // $ANTLR start "SJF"
    public final void mSJF() throws RecognitionException {
        try {
            int _type = SJF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:2: ( ( '@suppressJoinFailure' | '@dpe' ) | ( '@suppressJoinFailure no' | '@dpe no' ) )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:4: ( '@suppressJoinFailure' | '@dpe' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:4: ( '@suppressJoinFailure' | '@dpe' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='@') ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1=='s') ) {
                            alt13=1;
                        }
                        else if ( (LA13_1=='d') ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:5: '@suppressJoinFailure'
                            {
                            match("@suppressJoinFailure"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:30: '@dpe'
                            {
                            match("@dpe"); 


                            }
                            break;

                    }

                    setText("suppressJoinFailure=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:398:4: ( '@suppressJoinFailure no' | '@dpe no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:398:4: ( '@suppressJoinFailure no' | '@dpe no' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='@') ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1=='s') ) {
                            alt14=1;
                        }
                        else if ( (LA14_1=='d') ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:398:5: '@suppressJoinFailure no'
                            {
                            match("@suppressJoinFailure no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:398:33: '@dpe no'
                            {
                            match("@dpe no"); 


                            }
                            break;

                    }

                    setText("suppressJoinFailure=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SJF"

    // $ANTLR start "PARALLEL"
    public final void mPARALLEL() throws RecognitionException {
        try {
            int _type = PARALLEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:2: ( ( '@parallel' | '@par' ) | ( '@parallel no' | '@par no' ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:4: ( '@parallel' | '@par' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:4: ( '@parallel' | '@par' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='@') ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1=='p') ) {
                            int LA16_2 = input.LA(3);

                            if ( (LA16_2=='a') ) {
                                int LA16_3 = input.LA(4);

                                if ( (LA16_3=='r') ) {
                                    int LA16_4 = input.LA(5);

                                    if ( (LA16_4=='a') ) {
                                        alt16=1;
                                    }
                                    else {
                                        alt16=2;}
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 16, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:5: '@parallel'
                            {
                            match("@parallel"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:19: '@par'
                            {
                            match("@par"); 


                            }
                            break;

                    }

                    setText("parallel=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:4: ( '@parallel no' | '@par no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:4: ( '@parallel no' | '@par no' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='@') ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1=='p') ) {
                            int LA17_2 = input.LA(3);

                            if ( (LA17_2=='a') ) {
                                int LA17_3 = input.LA(4);

                                if ( (LA17_3=='r') ) {
                                    int LA17_4 = input.LA(5);

                                    if ( (LA17_4=='a') ) {
                                        alt17=1;
                                    }
                                    else if ( (LA17_4==' ') ) {
                                        alt17=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 17, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 17, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:5: '@parallel no'
                            {
                            match("@parallel no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:22: '@par no'
                            {
                            match("@par no"); 


                            }
                            break;

                    }

                    setText("parallel=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARALLEL"

    // $ANTLR start "SBO"
    public final void mSBO() throws RecognitionException {
        try {
            int _type = SBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:2: ( ( '@successfulBranchesOnly' | '@success' | '@sbo' ) | ( '@successfulBranchesOnly no' | '@sbo no' ) )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:4: ( '@successfulBranchesOnly' | '@success' | '@sbo' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:4: ( '@successfulBranchesOnly' | '@success' | '@sbo' )
                    int alt19=3;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:5: '@successfulBranchesOnly'
                            {
                            match("@successfulBranchesOnly"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:33: '@success'
                            {
                            match("@success"); 


                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:46: '@sbo'
                            {
                            match("@sbo"); 


                            }
                            break;

                    }

                    setText("successfulBranchesOnly=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:4: ( '@successfulBranchesOnly no' | '@sbo no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:4: ( '@successfulBranchesOnly no' | '@sbo no' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='@') ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1=='s') ) {
                            int LA20_2 = input.LA(3);

                            if ( (LA20_2=='u') ) {
                                alt20=1;
                            }
                            else if ( (LA20_2=='b') ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:5: '@successfulBranchesOnly no'
                            {
                            match("@successfulBranchesOnly no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:36: '@sbo no'
                            {
                            match("@sbo no"); 


                            }
                            break;

                    }

                    setText("successfulBranchesOnly=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SBO"

    // $ANTLR start "INITPARTNER"
    public final void mINITPARTNER() throws RecognitionException {
        try {
            int _type = INITPARTNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:409:2: ( ( '@initializePartner' | '@init' ) | ( '@initializePartner no' | '@init no' ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:409:4: ( '@initializePartner' | '@init' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:409:4: ( '@initializePartner' | '@init' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='@') ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1=='i') ) {
                            int LA22_2 = input.LA(3);

                            if ( (LA22_2=='n') ) {
                                int LA22_3 = input.LA(4);

                                if ( (LA22_3=='i') ) {
                                    int LA22_4 = input.LA(5);

                                    if ( (LA22_4=='t') ) {
                                        int LA22_5 = input.LA(6);

                                        if ( (LA22_5=='i') ) {
                                            alt22=1;
                                        }
                                        else {
                                            alt22=2;}
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 22, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 22, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:409:5: '@initializePartner'
                            {
                            match("@initializePartner"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:409:28: '@init'
                            {
                            match("@init"); 


                            }
                            break;

                    }

                    setText("initializePartnerRole=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:4: ( '@initializePartner no' | '@init no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:4: ( '@initializePartner no' | '@init no' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='@') ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1=='i') ) {
                            int LA23_2 = input.LA(3);

                            if ( (LA23_2=='n') ) {
                                int LA23_3 = input.LA(4);

                                if ( (LA23_3=='i') ) {
                                    int LA23_4 = input.LA(5);

                                    if ( (LA23_4=='t') ) {
                                        int LA23_5 = input.LA(6);

                                        if ( (LA23_5=='i') ) {
                                            alt23=1;
                                        }
                                        else if ( (LA23_5==' ') ) {
                                            alt23=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 23, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 23, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 23, 3, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:5: '@initializePartner no'
                            {
                            match("@initializePartner no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:410:31: '@init no'
                            {
                            match("@init no"); 


                            }
                            break;

                    }

                    setText("initializePartnerRole=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITPARTNER"

    // $ANTLR start "INIT_COR"
    public final void mINIT_COR() throws RecognitionException {
        try {
            int _type = INIT_COR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:2: ( ( '!' | 'force' ) | ( '?' | 'join' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='!'||LA27_0=='f') ) {
                alt27=1;
            }
            else if ( (LA27_0=='?'||LA27_0=='j') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:4: ( '!' | 'force' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:4: ( '!' | 'force' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='!') ) {
                        alt25=1;
                    }
                    else if ( (LA25_0=='f') ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:5: '!'
                            {
                            match('!'); 

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:11: 'force'
                            {
                            match("force"); 


                            }
                            break;

                    }

                    setText("initiate=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:414:4: ( '?' | 'join' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:414:4: ( '?' | 'join' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='?') ) {
                        alt26=1;
                    }
                    else if ( (LA26_0=='j') ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:414:5: '?'
                            {
                            match('?'); 

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:414:11: 'join'
                            {
                            match("join"); 


                            }
                            break;

                    }

                    setText("initiate=\"join\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INIT_COR"

    // $ANTLR start "PATTERN_COR"
    public final void mPATTERN_COR() throws RecognitionException {
        try {
            int _type = PATTERN_COR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:2: ( ( '@>' | 'request' ) | ( '@<' | 'response' ) | ( '@><' | 'request-response' ) )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:4: ( '@>' | 'request' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:4: ( '@>' | 'request' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='@') ) {
                        alt28=1;
                    }
                    else if ( (LA28_0=='r') ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:5: '@>'
                            {
                            match("@>"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:417:12: 'request'
                            {
                            match("request"); 


                            }
                            break;

                    }

                    setText("pattern=\"request\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:418:4: ( '@<' | 'response' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:418:4: ( '@<' | 'response' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='@') ) {
                        alt29=1;
                    }
                    else if ( (LA29_0=='r') ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:418:5: '@<'
                            {
                            match("@<"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:418:12: 'response'
                            {
                            match("response"); 


                            }
                            break;

                    }

                    setText("pattern=\"response\"");

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:4: ( '@><' | 'request-response' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:4: ( '@><' | 'request-response' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='@') ) {
                        alt30=1;
                    }
                    else if ( (LA30_0=='r') ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:5: '@><'
                            {
                            match("@><"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:419:13: 'request-response'
                            {
                            match("request-response"); 


                            }
                            break;

                    }

                    setText("pattern=\"request-response\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PATTERN_COR"

    // $ANTLR start "ISOLATED"
    public final void mISOLATED() throws RecognitionException {
        try {
            int _type = ISOLATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:2: ( '@isolated' | '@isolated no' )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:422:4: '@isolated'
                    {
                    match("@isolated"); 

                    setText("isolated=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:4: '@isolated no'
                    {
                    match("@isolated no"); 

                    setText("isolated=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOLATED"

    // $ANTLR start "CREATE_INST"
    public final void mCREATE_INST() throws RecognitionException {
        try {
            int _type = CREATE_INST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:426:2: ( ( '@createInstance' | '@ci' ) | ( '@createInstance no' | '@ci no' ) )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:426:4: ( '@createInstance' | '@ci' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:426:4: ( '@createInstance' | '@ci' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='@') ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1=='c') ) {
                            int LA33_2 = input.LA(3);

                            if ( (LA33_2=='r') ) {
                                alt33=1;
                            }
                            else if ( (LA33_2=='i') ) {
                                alt33=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:426:5: '@createInstance'
                            {
                            match("@createInstance"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:426:25: '@ci'
                            {
                            match("@ci"); 


                            }
                            break;

                    }

                    setText(" createInstance=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:4: ( '@createInstance no' | '@ci no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:4: ( '@createInstance no' | '@ci no' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='@') ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1=='c') ) {
                            int LA34_2 = input.LA(3);

                            if ( (LA34_2=='r') ) {
                                alt34=1;
                            }
                            else if ( (LA34_2=='i') ) {
                                alt34=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 34, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:5: '@createInstance no'
                            {
                            match("@createInstance no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:28: '@ci no'
                            {
                            match("@ci no"); 


                            }
                            break;

                    }

                    setText(" createInstance=\"not\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE_INST"

    // $ANTLR start "VALID"
    public final void mVALID() throws RecognitionException {
        try {
            int _type = VALID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:430:2: ( '@validate' | '@validate no' )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:430:4: '@validate'
                    {
                    match("@validate"); 

                    setText("validate=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:431:4: '@validate no'
                    {
                    match("@validate no"); 

                    setText("validate=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALID"

    // $ANTLR start "KEEPSRC"
    public final void mKEEPSRC() throws RecognitionException {
        try {
            int _type = KEEPSRC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:2: ( ( '@keepSrcElementName' | '@keepSrc' ) | ( '@keepSrcElementName no' | '@keepSrc no' ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:4: ( '@keepSrcElementName' | '@keepSrc' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:4: ( '@keepSrcElementName' | '@keepSrc' )
                    int alt37=2;
                    alt37 = dfa37.predict(input);
                    switch (alt37) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:5: '@keepSrcElementName'
                            {
                            match("@keepSrcElementName"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:29: '@keepSrc'
                            {
                            match("@keepSrc"); 


                            }
                            break;

                    }

                    setText("keepSrcElementName=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:435:4: ( '@keepSrcElementName no' | '@keepSrc no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:435:4: ( '@keepSrcElementName no' | '@keepSrc no' )
                    int alt38=2;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:435:5: '@keepSrcElementName no'
                            {
                            match("@keepSrcElementName no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:435:32: '@keepSrc no'
                            {
                            match("@keepSrc no"); 


                            }
                            break;

                    }

                    setText("keepSrcElementName=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEEPSRC"

    // $ANTLR start "IGNORE"
    public final void mIGNORE() throws RecognitionException {
        try {
            int _type = IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:438:2: ( '@ignoreMisssingFromData' | '@ignore' | ( '@ignoreMisssingFromData no' | '@ignore no' ) )
            int alt41=3;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:438:4: '@ignoreMisssingFromData'
                    {
                    match("@ignoreMisssingFromData"); 


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:438:32: '@ignore'
                    {
                    match("@ignore"); 

                    setText("ignoreMisssingFromData=\"yes\"");

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:4: ( '@ignoreMisssingFromData no' | '@ignore no' )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:4: ( '@ignoreMisssingFromData no' | '@ignore no' )
                    int alt40=2;
                    alt40 = dfa40.predict(input);
                    switch (alt40) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:5: '@ignoreMisssingFromData no'
                            {
                            match("@ignoreMisssingFromData no"); 


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:36: '@ignore no'
                            {
                            match("@ignore no"); 


                            }
                            break;

                    }

                    setText("ignoreMisssingFromData=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IGNORE"

    // $ANTLR start "PROP"
    public final void mPROP() throws RecognitionException {
        try {
            int _type = PROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:2: ( '@property' )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:4: '@property'
            {
            match("@property"); 

            setText("property");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROP"

    // $ANTLR start "MUSTUND"
    public final void mMUSTUND() throws RecognitionException {
        try {
            int _type = MUSTUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:445:2: ( '@mustUnderstand' | '@mustUnderstand no' )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:445:4: '@mustUnderstand'
                    {
                    match("@mustUnderstand"); 

                    setText("mustUnderstand=\"yes\"");

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:446:4: '@mustUnderstand no'
                    {
                    match("@mustUnderstand no"); 

                    setText("mustUnderstand=\"no\"");

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUSTUND"

    public void mTokens() throws RecognitionException {
        // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:8: ( T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | EXT_EXPR | EXT_ACT | OPAQUE_EXPR | KEY | SEMI | ID | INT | STRING | ESCAPE_SEQ | SL_COMMENTS | CR | WS | EOSF | SJF | PARALLEL | SBO | INITPARTNER | INIT_COR | PATTERN_COR | ISOLATED | CREATE_INST | VALID | KEEPSRC | IGNORE | PROP | MUSTUND )
        int alt43=111;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:10: T__107
                {
                mT__107(); 

                }
                break;
            case 2 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:17: T__108
                {
                mT__108(); 

                }
                break;
            case 3 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:24: T__109
                {
                mT__109(); 

                }
                break;
            case 4 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:31: T__110
                {
                mT__110(); 

                }
                break;
            case 5 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:38: T__111
                {
                mT__111(); 

                }
                break;
            case 6 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:45: T__112
                {
                mT__112(); 

                }
                break;
            case 7 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:52: T__113
                {
                mT__113(); 

                }
                break;
            case 8 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:59: T__114
                {
                mT__114(); 

                }
                break;
            case 9 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:66: T__115
                {
                mT__115(); 

                }
                break;
            case 10 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:73: T__116
                {
                mT__116(); 

                }
                break;
            case 11 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:80: T__117
                {
                mT__117(); 

                }
                break;
            case 12 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:87: T__118
                {
                mT__118(); 

                }
                break;
            case 13 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:94: T__119
                {
                mT__119(); 

                }
                break;
            case 14 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:101: T__120
                {
                mT__120(); 

                }
                break;
            case 15 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:108: T__121
                {
                mT__121(); 

                }
                break;
            case 16 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:115: T__122
                {
                mT__122(); 

                }
                break;
            case 17 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:122: T__123
                {
                mT__123(); 

                }
                break;
            case 18 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:129: T__124
                {
                mT__124(); 

                }
                break;
            case 19 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:136: T__125
                {
                mT__125(); 

                }
                break;
            case 20 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:143: T__126
                {
                mT__126(); 

                }
                break;
            case 21 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:150: T__127
                {
                mT__127(); 

                }
                break;
            case 22 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:157: T__128
                {
                mT__128(); 

                }
                break;
            case 23 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:164: T__129
                {
                mT__129(); 

                }
                break;
            case 24 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:171: T__130
                {
                mT__130(); 

                }
                break;
            case 25 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:178: T__131
                {
                mT__131(); 

                }
                break;
            case 26 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:185: T__132
                {
                mT__132(); 

                }
                break;
            case 27 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:192: T__133
                {
                mT__133(); 

                }
                break;
            case 28 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:199: T__134
                {
                mT__134(); 

                }
                break;
            case 29 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:206: T__135
                {
                mT__135(); 

                }
                break;
            case 30 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:213: T__136
                {
                mT__136(); 

                }
                break;
            case 31 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:220: T__137
                {
                mT__137(); 

                }
                break;
            case 32 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:227: T__138
                {
                mT__138(); 

                }
                break;
            case 33 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:234: T__139
                {
                mT__139(); 

                }
                break;
            case 34 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:241: T__140
                {
                mT__140(); 

                }
                break;
            case 35 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:248: T__141
                {
                mT__141(); 

                }
                break;
            case 36 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:255: T__142
                {
                mT__142(); 

                }
                break;
            case 37 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:262: T__143
                {
                mT__143(); 

                }
                break;
            case 38 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:269: T__144
                {
                mT__144(); 

                }
                break;
            case 39 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:276: T__145
                {
                mT__145(); 

                }
                break;
            case 40 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:283: T__146
                {
                mT__146(); 

                }
                break;
            case 41 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:290: T__147
                {
                mT__147(); 

                }
                break;
            case 42 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:297: T__148
                {
                mT__148(); 

                }
                break;
            case 43 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:304: T__149
                {
                mT__149(); 

                }
                break;
            case 44 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:311: T__150
                {
                mT__150(); 

                }
                break;
            case 45 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:318: T__151
                {
                mT__151(); 

                }
                break;
            case 46 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:325: T__152
                {
                mT__152(); 

                }
                break;
            case 47 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:332: T__153
                {
                mT__153(); 

                }
                break;
            case 48 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:339: T__154
                {
                mT__154(); 

                }
                break;
            case 49 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:346: T__155
                {
                mT__155(); 

                }
                break;
            case 50 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:353: T__156
                {
                mT__156(); 

                }
                break;
            case 51 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:360: T__157
                {
                mT__157(); 

                }
                break;
            case 52 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:367: T__158
                {
                mT__158(); 

                }
                break;
            case 53 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:374: T__159
                {
                mT__159(); 

                }
                break;
            case 54 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:381: T__160
                {
                mT__160(); 

                }
                break;
            case 55 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:388: T__161
                {
                mT__161(); 

                }
                break;
            case 56 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:395: T__162
                {
                mT__162(); 

                }
                break;
            case 57 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:402: T__163
                {
                mT__163(); 

                }
                break;
            case 58 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:409: T__164
                {
                mT__164(); 

                }
                break;
            case 59 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:416: T__165
                {
                mT__165(); 

                }
                break;
            case 60 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:423: T__166
                {
                mT__166(); 

                }
                break;
            case 61 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:430: T__167
                {
                mT__167(); 

                }
                break;
            case 62 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:437: T__168
                {
                mT__168(); 

                }
                break;
            case 63 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:444: T__169
                {
                mT__169(); 

                }
                break;
            case 64 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:451: T__170
                {
                mT__170(); 

                }
                break;
            case 65 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:458: T__171
                {
                mT__171(); 

                }
                break;
            case 66 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:465: T__172
                {
                mT__172(); 

                }
                break;
            case 67 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:472: T__173
                {
                mT__173(); 

                }
                break;
            case 68 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:479: T__174
                {
                mT__174(); 

                }
                break;
            case 69 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:486: T__175
                {
                mT__175(); 

                }
                break;
            case 70 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:493: T__176
                {
                mT__176(); 

                }
                break;
            case 71 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:500: T__177
                {
                mT__177(); 

                }
                break;
            case 72 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:507: T__178
                {
                mT__178(); 

                }
                break;
            case 73 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:514: T__179
                {
                mT__179(); 

                }
                break;
            case 74 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:521: T__180
                {
                mT__180(); 

                }
                break;
            case 75 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:528: T__181
                {
                mT__181(); 

                }
                break;
            case 76 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:535: T__182
                {
                mT__182(); 

                }
                break;
            case 77 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:542: T__183
                {
                mT__183(); 

                }
                break;
            case 78 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:549: T__184
                {
                mT__184(); 

                }
                break;
            case 79 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:556: T__185
                {
                mT__185(); 

                }
                break;
            case 80 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:563: T__186
                {
                mT__186(); 

                }
                break;
            case 81 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:570: T__187
                {
                mT__187(); 

                }
                break;
            case 82 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:577: T__188
                {
                mT__188(); 

                }
                break;
            case 83 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:584: T__189
                {
                mT__189(); 

                }
                break;
            case 84 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:591: T__190
                {
                mT__190(); 

                }
                break;
            case 85 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:598: T__191
                {
                mT__191(); 

                }
                break;
            case 86 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:605: EXT_EXPR
                {
                mEXT_EXPR(); 

                }
                break;
            case 87 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:614: EXT_ACT
                {
                mEXT_ACT(); 

                }
                break;
            case 88 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:622: OPAQUE_EXPR
                {
                mOPAQUE_EXPR(); 

                }
                break;
            case 89 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:634: KEY
                {
                mKEY(); 

                }
                break;
            case 90 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:638: SEMI
                {
                mSEMI(); 

                }
                break;
            case 91 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:643: ID
                {
                mID(); 

                }
                break;
            case 92 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:646: INT
                {
                mINT(); 

                }
                break;
            case 93 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:650: STRING
                {
                mSTRING(); 

                }
                break;
            case 94 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:657: ESCAPE_SEQ
                {
                mESCAPE_SEQ(); 

                }
                break;
            case 95 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:668: SL_COMMENTS
                {
                mSL_COMMENTS(); 

                }
                break;
            case 96 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:680: CR
                {
                mCR(); 

                }
                break;
            case 97 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:683: WS
                {
                mWS(); 

                }
                break;
            case 98 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:686: EOSF
                {
                mEOSF(); 

                }
                break;
            case 99 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:691: SJF
                {
                mSJF(); 

                }
                break;
            case 100 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:695: PARALLEL
                {
                mPARALLEL(); 

                }
                break;
            case 101 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:704: SBO
                {
                mSBO(); 

                }
                break;
            case 102 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:708: INITPARTNER
                {
                mINITPARTNER(); 

                }
                break;
            case 103 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:720: INIT_COR
                {
                mINIT_COR(); 

                }
                break;
            case 104 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:729: PATTERN_COR
                {
                mPATTERN_COR(); 

                }
                break;
            case 105 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:741: ISOLATED
                {
                mISOLATED(); 

                }
                break;
            case 106 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:750: CREATE_INST
                {
                mCREATE_INST(); 

                }
                break;
            case 107 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:762: VALID
                {
                mVALID(); 

                }
                break;
            case 108 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:768: KEEPSRC
                {
                mKEEPSRC(); 

                }
                break;
            case 109 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:776: IGNORE
                {
                mIGNORE(); 

                }
                break;
            case 110 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:783: PROP
                {
                mPROP(); 

                }
                break;
            case 111 :
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:1:788: MUSTUND
                {
                mMUSTUND(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA12_eotS =
        "\5\uffff\1\10\20\uffff\1\10";
    static final String DFA12_eofS =
        "\27\uffff";
    static final String DFA12_minS =
        "\1\100\1\145\1\170\1\151\1\164\1\40\1\156\2\uffff\1\123\1\164\1"+
        "\141\1\156\1\144\1\141\1\162\1\144\1\106\1\141\1\165\1\154\1\164"+
        "\1\40";
    static final String DFA12_maxS =
        "\1\100\1\145\1\170\1\151\1\164\1\117\1\156\2\uffff\1\123\1\164\1"+
        "\141\1\156\1\144\1\141\1\162\1\144\1\106\1\141\1\165\1\154\1\164"+
        "\1\40";
    static final String DFA12_acceptS =
        "\7\uffff\1\2\1\1\16\uffff";
    static final String DFA12_specialS =
        "\27\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\56\uffff\1\6",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\7"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "392:11: protected EOSF : ( ( '@exitOnStandardFault' | '@exit' ) | ( '@exitOnStandardFault no' | '@exit no' ) );";
        }
    }
    static final String DFA15_eotS =
        "\7\uffff\1\12\21\uffff\1\12";
    static final String DFA15_eofS =
        "\32\uffff";
    static final String DFA15_minS =
        "\1\100\1\144\1\165\2\160\1\145\1\160\1\40\1\162\2\uffff\1\145\2"+
        "\163\1\112\1\157\1\151\1\156\1\106\1\141\1\151\1\154\1\165\1\162"+
        "\1\145\1\40";
    static final String DFA15_maxS =
        "\1\100\1\163\1\165\2\160\1\145\1\160\1\40\1\162\2\uffff\1\145\2"+
        "\163\1\112\1\157\1\151\1\156\1\106\1\141\1\151\1\154\1\165\1\162"+
        "\1\145\1\40";
    static final String DFA15_acceptS =
        "\11\uffff\1\2\1\1\17\uffff";
    static final String DFA15_specialS =
        "\32\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\3\16\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\11"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "396:11: protected SJF : ( ( '@suppressJoinFailure' | '@dpe' ) | ( '@suppressJoinFailure no' | '@dpe no' ) );";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff\1\7\6\uffff\1\7";
    static final String DFA18_eofS =
        "\14\uffff";
    static final String DFA18_minS =
        "\1\100\1\160\1\141\1\162\1\40\1\154\2\uffff\1\154\1\145\1\154\1"+
        "\40";
    static final String DFA18_maxS =
        "\1\100\1\160\1\141\1\162\1\141\1\154\2\uffff\1\154\1\145\1\154\1"+
        "\40";
    static final String DFA18_acceptS =
        "\6\uffff\1\2\1\1\4\uffff";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\6\100\uffff\1\5",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\6"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "400:11: protected PARALLEL : ( ( '@parallel' | '@par' ) | ( '@parallel no' | '@par no' ) );";
        }
    }
    static final String DFA21_eotS =
        "\6\uffff\1\11\5\uffff\1\11\16\uffff\1\11";
    static final String DFA21_eofS =
        "\34\uffff";
    static final String DFA21_minS =
        "\1\100\1\163\1\142\1\143\1\157\1\143\1\40\1\145\2\uffff\2\163\1"+
        "\146\1\165\1\154\1\102\1\162\1\141\1\156\1\143\1\150\1\145\1\163"+
        "\1\117\1\156\1\154\1\171\1\40";
    static final String DFA21_maxS =
        "\1\100\1\163\1\165\1\143\1\157\1\143\1\40\1\145\2\uffff\2\163\1"+
        "\146\1\165\1\154\1\102\1\162\1\141\1\156\1\143\1\150\1\145\1\163"+
        "\1\117\1\156\1\154\1\171\1\40";
    static final String DFA21_acceptS =
        "\10\uffff\1\2\1\1\22\uffff";
    static final String DFA21_specialS =
        "\34\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\22\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\10"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "404:11: protected SBO : ( ( '@successfulBranchesOnly' | '@success' | '@sbo' ) | ( '@successfulBranchesOnly no' | '@sbo no' ) );";
        }
    }
    static final String DFA19_eotS =
        "\11\uffff\1\13\2\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\100\1\163\1\142\1\143\1\uffff\1\143\1\145\2\163\1\146\2\uffff";
    static final String DFA19_maxS =
        "\1\100\1\163\1\165\1\143\1\uffff\1\143\1\145\2\163\1\146\2\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\3\5\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\22\uffff\1\3",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "405:4: ( '@successfulBranchesOnly' | '@success' | '@sbo' )";
        }
    }
    static final String DFA24_eotS =
        "\5\uffff\1\10\16\uffff\1\10";
    static final String DFA24_eofS =
        "\25\uffff";
    static final String DFA24_minS =
        "\1\100\1\151\1\156\1\151\1\164\1\40\1\141\2\uffff\1\154\1\151\1"+
        "\172\1\145\1\120\1\141\1\162\1\164\1\156\1\145\1\162\1\40";
    static final String DFA24_maxS =
        "\1\100\1\151\1\156\1\151\1\164\1\151\1\141\2\uffff\1\154\1\151\1"+
        "\172\1\145\1\120\1\141\1\162\1\164\1\156\1\145\1\162\1\40";
    static final String DFA24_acceptS =
        "\7\uffff\1\2\1\1\14\uffff";
    static final String DFA24_specialS =
        "\25\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\110\uffff\1\6",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\7"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "408:11: protected INITPARTNER : ( ( '@initializePartner' | '@init' ) | ( '@initializePartner no' | '@init no' ) );";
        }
    }
    static final String DFA31_eotS =
        "\3\uffff\1\7\10\uffff\1\7";
    static final String DFA31_eofS =
        "\15\uffff";
    static final String DFA31_minS =
        "\1\100\1\74\1\145\1\74\1\uffff\1\161\2\uffff\1\165\1\145\1\163\1"+
        "\164\1\55";
    static final String DFA31_maxS =
        "\1\162\1\76\1\145\1\74\1\uffff\1\163\2\uffff\1\165\1\145\1\163\1"+
        "\164\1\55";
    static final String DFA31_acceptS =
        "\4\uffff\1\2\1\uffff\1\3\1\1\5\uffff";
    static final String DFA31_specialS =
        "\15\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\61\uffff\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\6",
            "",
            "\1\10\1\uffff\1\4",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\6"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "416:11: protected PATTERN_COR : ( ( '@>' | 'request' ) | ( '@<' | 'response' ) | ( '@><' | 'request-response' ) );";
        }
    }
    static final String DFA32_eotS =
        "\11\uffff\1\13\2\uffff";
    static final String DFA32_eofS =
        "\14\uffff";
    static final String DFA32_minS =
        "\1\100\1\151\1\163\1\157\1\154\1\141\1\164\1\145\1\144\1\40\2\uffff";
    static final String DFA32_maxS =
        "\1\100\1\151\1\163\1\157\1\154\1\141\1\164\1\145\1\144\1\40\2\uffff";
    static final String DFA32_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\14\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "421:11: protected ISOLATED : ( '@isolated' | '@isolated no' );";
        }
    }
    static final String DFA35_eotS =
        "\4\uffff\1\7\15\uffff\1\7";
    static final String DFA35_eofS =
        "\23\uffff";
    static final String DFA35_minS =
        "\1\100\1\143\1\151\1\145\1\40\1\141\2\uffff\1\164\1\145\1\111\1"+
        "\156\1\163\1\164\1\141\1\156\1\143\1\145\1\40";
    static final String DFA35_maxS =
        "\1\100\1\143\1\162\1\145\1\40\1\141\2\uffff\1\164\1\145\1\111\1"+
        "\156\1\163\1\164\1\141\1\156\1\143\1\145\1\40";
    static final String DFA35_acceptS =
        "\6\uffff\1\2\1\1\13\uffff";
    static final String DFA35_specialS =
        "\23\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\10\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\6"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "425:11: protected CREATE_INST : ( ( '@createInstance' | '@ci' ) | ( '@createInstance no' | '@ci no' ) );";
        }
    }
    static final String DFA36_eotS =
        "\11\uffff\1\13\2\uffff";
    static final String DFA36_eofS =
        "\14\uffff";
    static final String DFA36_minS =
        "\1\100\1\166\1\141\1\154\1\151\1\144\1\141\1\164\1\145\1\40\2\uffff";
    static final String DFA36_maxS =
        "\1\100\1\166\1\141\1\154\1\151\1\144\1\141\1\164\1\145\1\40\2\uffff";
    static final String DFA36_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA36_specialS =
        "\14\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "429:11: protected VALID : ( '@validate' | '@validate no' );";
        }
    }
    static final String DFA39_eotS =
        "\10\uffff\1\13\14\uffff\1\13";
    static final String DFA39_eofS =
        "\26\uffff";
    static final String DFA39_minS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\40\1\154\2\uffff\1"+
        "\145\1\155\1\145\1\156\1\164\1\116\1\141\1\155\1\145\1\40";
    static final String DFA39_maxS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\105\1\154\2\uffff\1"+
        "\145\1\155\1\145\1\156\1\164\1\116\1\141\1\155\1\145\1\40";
    static final String DFA39_acceptS =
        "\12\uffff\1\2\1\1\12\uffff";
    static final String DFA39_specialS =
        "\26\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\12\44\uffff\1\11",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\12"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "433:11: protected KEEPSRC : ( ( '@keepSrcElementName' | '@keepSrc' ) | ( '@keepSrcElementName no' | '@keepSrc no' ) );";
        }
    }
    static final String DFA37_eotS =
        "\10\uffff\1\12\2\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\105\2\uffff";
    static final String DFA37_maxS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\105\2\uffff";
    static final String DFA37_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "434:4: ( '@keepSrcElementName' | '@keepSrc' )";
        }
    }
    static final String DFA38_eotS =
        "\13\uffff";
    static final String DFA38_eofS =
        "\13\uffff";
    static final String DFA38_minS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\40\2\uffff";
    static final String DFA38_maxS =
        "\1\100\1\153\2\145\1\160\1\123\1\162\1\143\1\105\2\uffff";
    static final String DFA38_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA38_specialS =
        "\13\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\12\44\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "435:4: ( '@keepSrcElementName no' | '@keepSrc no' )";
        }
    }
    static final String DFA41_eotS =
        "\7\uffff\1\12\21\uffff\1\32\1\uffff";
    static final String DFA41_eofS =
        "\33\uffff";
    static final String DFA41_minS =
        "\1\100\1\151\1\147\1\156\1\157\1\162\1\145\1\40\1\151\2\uffff\3"+
        "\163\1\151\1\156\1\147\1\106\1\162\1\157\1\155\1\104\1\141\1\164"+
        "\1\141\1\40\1\uffff";
    static final String DFA41_maxS =
        "\1\100\1\151\1\147\1\156\1\157\1\162\1\145\1\115\1\151\2\uffff\3"+
        "\163\1\151\1\156\1\147\1\106\1\162\1\157\1\155\1\104\1\141\1\164"+
        "\1\141\1\40\1\uffff";
    static final String DFA41_acceptS =
        "\11\uffff\1\3\1\2\17\uffff\1\1";
    static final String DFA41_specialS =
        "\33\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\54\uffff\1\10",
            "\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\11",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "437:11: protected IGNORE : ( '@ignoreMisssingFromData' | '@ignore' | ( '@ignoreMisssingFromData no' | '@ignore no' ) );";
        }
    }
    static final String DFA40_eotS =
        "\12\uffff";
    static final String DFA40_eofS =
        "\12\uffff";
    static final String DFA40_minS =
        "\1\100\1\151\1\147\1\156\1\157\1\162\1\145\1\40\2\uffff";
    static final String DFA40_maxS =
        "\1\100\1\151\1\147\1\156\1\157\1\162\1\145\1\115\2\uffff";
    static final String DFA40_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA40_specialS =
        "\12\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\54\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "439:4: ( '@ignoreMisssingFromData no' | '@ignore no' )";
        }
    }
    static final String DFA42_eotS =
        "\17\uffff\1\21\2\uffff";
    static final String DFA42_eofS =
        "\22\uffff";
    static final String DFA42_minS =
        "\1\100\1\155\1\165\1\163\1\164\1\125\1\156\1\144\1\145\1\162\1\163"+
        "\1\164\1\141\1\156\1\144\1\40\2\uffff";
    static final String DFA42_maxS =
        "\1\100\1\155\1\165\1\163\1\164\1\125\1\156\1\144\1\145\1\162\1\163"+
        "\1\164\1\141\1\156\1\144\1\40\2\uffff";
    static final String DFA42_acceptS =
        "\20\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\22\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "444:11: protected MUSTUND : ( '@mustUnderstand' | '@mustUnderstand no' );";
        }
    }
    static final String DFA43_eotS =
        "\2\uffff\1\45\1\77\3\uffff\1\45\2\uffff\12\45\1\131\1\45\1\135\3"+
        "\45\1\53\1\144\1\146\3\uffff\1\150\32\uffff\3\45\2\uffff\6\45\1"+
        "\u0083\6\45\1\u008e\1\u0091\11\45\2\uffff\2\45\2\uffff\4\45\27\uffff"+
        "\6\45\1\u0091\1\45\1\u00b1\1\45\1\uffff\1\u00b3\11\45\1\uffff\2"+
        "\45\1\uffff\10\45\1\u00c9\5\45\1\u00cf\1\u00d0\2\45\5\uffff\1\45"+
        "\1\u00d6\6\45\1\uffff\1\45\1\uffff\11\45\1\u00e7\3\45\1\u00ec\1"+
        "\45\1\u00ee\2\45\1\u00f1\2\45\1\uffff\5\45\2\uffff\2\45\2\uffff"+
        "\1\45\1\uffff\5\45\1\u0103\1\45\1\u0105\1\45\1\u0107\5\45\1\u010d"+
        "\1\uffff\1\45\1\u0091\2\45\1\uffff\1\u0112\1\uffff\1\45\1\u0114"+
        "\1\uffff\1\u0115\1\uffff\1\45\1\u0118\5\45\1\u0122\1\uffff\6\45"+
        "\1\uffff\1\45\1\uffff\1\u012c\1\uffff\4\45\1\u0131\1\uffff\1\u0132"+
        "\1\u0133\1\u0134\1\u0135\1\uffff\1\45\2\uffff\1\u0137\1\45\1\uffff"+
        "\5\45\6\uffff\1\u0140\4\45\1\uffff\1\u0146\1\45\1\uffff\1\u0148"+
        "\1\u0149\2\45\5\uffff\1\45\1\uffff\6\45\3\uffff\1\u0156\4\45\1\uffff"+
        "\1\45\2\uffff\1\45\1\uffff\1\45\1\u015e\2\45\1\u0161\1\45\1\u0163"+
        "\1\u0165\3\uffff\2\45\1\u0168\3\45\1\u016c\1\uffff\2\45\1\uffff"+
        "\1\u0170\3\uffff\2\45\1\uffff\3\45\1\uffff\1\45\1\u0177\1\u0178"+
        "\1\uffff\1\u0179\1\u017a\1\45\1\u017c\2\45\4\uffff\1\45\1\uffff"+
        "\1\45\1\u0181\1\u0182\1\45\2\uffff\2\45\1\uffff";
    static final String DFA43_eofS =
        "\u0186\uffff";
    static final String DFA43_minS =
        "\1\11\1\74\1\141\1\173\3\uffff\1\156\2\uffff\1\154\1\150\1\145\1"+
        "\143\1\157\1\146\1\154\1\150\1\156\1\151\1\75\1\141\1\72\2\141\1"+
        "\145\3\75\3\uffff\1\57\14\uffff\1\154\1\142\1\uffff\2\141\1\uffff"+
        "\1\145\2\uffff\1\147\4\uffff\1\157\1\143\1\162\2\uffff\1\115\1\141"+
        "\1\164\1\141\1\144\1\155\1\55\1\171\1\162\1\143\1\147\1\157\1\151"+
        "\2\55\1\160\1\163\1\145\2\151\2\164\1\162\1\156\2\uffff\1\164\1"+
        "\155\2\uffff\1\154\1\160\1\155\1\163\7\uffff\1\151\2\uffff\1\143"+
        "\1\uffff\1\165\4\uffff\1\163\5\uffff\1\143\1\153\1\141\2\145\1\161"+
        "\1\55\1\162\1\55\1\145\1\uffff\1\55\1\157\2\145\1\150\1\165\1\160"+
        "\1\156\1\160\1\156\1\uffff\1\157\1\165\1\uffff\1\157\1\145\1\156"+
        "\1\164\1\145\1\154\1\150\1\151\1\55\1\151\1\143\1\160\1\162\1\151"+
        "\2\55\1\145\1\163\2\uffff\1\154\1\163\1\uffff\1\145\1\55\1\154\1"+
        "\156\1\163\1\162\1\165\1\155\1\uffff\1\157\1\uffff\1\167\1\141\1"+
        "\171\1\151\1\162\1\145\1\157\1\141\1\145\1\55\1\153\1\164\1\162"+
        "\1\55\1\164\1\55\1\156\1\145\1\55\1\154\1\145\1\uffff\1\163\1\150"+
        "\2\145\1\144\2\uffff\1\163\1\141\1\164\1\141\1\163\1\uffff\1\154"+
        "\1\145\1\163\1\155\1\145\1\55\1\165\1\55\1\164\1\55\1\166\1\157"+
        "\1\163\1\156\1\154\1\55\1\uffff\1\145\1\55\1\164\1\146\1\uffff\1"+
        "\55\1\uffff\1\163\1\55\1\uffff\1\55\1\uffff\1\150\1\55\1\156\1\154"+
        "\1\141\1\160\1\147\1\105\1\147\1\163\1\145\1\162\1\141\1\151\1\50"+
        "\1\uffff\1\164\1\uffff\1\55\1\uffff\1\145\1\167\1\164\1\163\1\55"+
        "\1\uffff\4\55\1\uffff\1\151\2\uffff\1\55\1\154\1\uffff\1\163\1\141"+
        "\1\164\1\141\1\145\1\uffff\1\141\3\uffff\1\145\1\55\1\154\1\114"+
        "\1\147\1\156\1\uffff\1\55\1\166\1\uffff\3\55\1\145\5\uffff\1\157"+
        "\1\uffff\1\154\1\141\1\164\1\145\1\143\1\163\1\162\1\105\1\uffff"+
        "\1\55\2\151\1\145\1\141\1\uffff\1\145\2\uffff\1\162\1\uffff\1\156"+
        "\1\55\1\164\1\145\1\55\1\145\1\55\1\151\3\uffff\2\156\1\55\1\164"+
        "\1\162\1\145\1\55\1\uffff\1\145\1\163\1\uffff\1\55\3\uffff\2\153"+
        "\1\uffff\1\151\1\171\1\163\1\uffff\1\157\2\55\1\uffff\2\55\1\157"+
        "\1\55\1\160\1\156\4\uffff\1\156\1\uffff\1\157\2\55\1\156\2\uffff"+
        "\1\163\1\145\1\uffff";
    static final String DFA43_maxS =
        "\1\175\1\166\1\162\1\173\3\uffff\1\165\2\uffff\1\156\1\162\1\145"+
        "\1\151\1\157\1\156\1\170\1\151\1\156\1\157\1\75\1\157\1\72\1\141"+
        "\1\157\1\145\3\75\3\uffff\1\57\14\uffff\1\170\1\165\1\uffff\1\141"+
        "\1\164\1\uffff\1\165\2\uffff\1\163\4\uffff\1\157\1\143\1\162\2\uffff"+
        "\1\124\1\141\1\164\1\141\1\144\1\155\1\172\1\171\1\162\1\164\1\147"+
        "\1\157\1\151\2\172\1\160\1\163\1\145\1\164\1\151\2\164\1\162\1\156"+
        "\2\uffff\1\164\1\162\2\uffff\1\162\1\160\1\155\1\163\7\uffff\1\160"+
        "\2\uffff\1\160\1\uffff\1\165\4\uffff\1\170\5\uffff\1\143\1\153\1"+
        "\164\2\145\1\161\1\172\1\162\1\172\1\145\1\uffff\1\172\1\157\1\154"+
        "\1\145\1\150\1\165\1\160\1\156\1\160\1\156\1\uffff\1\157\1\165\1"+
        "\uffff\1\157\1\145\1\156\1\164\1\145\1\154\1\150\1\151\1\172\1\151"+
        "\1\143\1\160\1\162\1\151\2\172\1\145\1\163\2\uffff\1\154\1\163\1"+
        "\uffff\1\145\1\172\1\154\1\156\1\163\1\162\1\165\1\155\1\uffff\1"+
        "\157\1\uffff\1\167\1\141\1\171\1\151\1\162\1\145\1\157\1\141\1\145"+
        "\1\172\1\153\1\164\1\162\1\172\1\164\1\172\1\156\1\145\1\172\1\154"+
        "\1\145\1\uffff\1\163\1\150\2\145\1\144\2\uffff\1\163\1\141\1\164"+
        "\1\141\1\163\1\uffff\1\154\1\145\1\163\1\155\1\145\1\172\1\165\1"+
        "\172\1\164\1\172\1\166\1\157\1\163\1\156\1\154\1\172\1\uffff\1\145"+
        "\1\172\1\164\1\146\1\uffff\1\172\1\uffff\1\163\1\172\1\uffff\1\172"+
        "\1\uffff\1\150\1\172\1\156\1\154\1\141\1\160\1\147\1\126\1\147\1"+
        "\163\1\145\1\162\1\141\1\151\1\50\1\uffff\1\164\1\uffff\1\172\1"+
        "\uffff\1\145\1\167\1\164\1\163\1\172\1\uffff\4\172\1\uffff\1\151"+
        "\2\uffff\1\172\1\154\1\uffff\1\163\1\141\1\164\1\141\1\145\1\uffff"+
        "\1\141\3\uffff\1\145\1\172\2\154\1\147\1\156\1\uffff\1\172\1\166"+
        "\1\uffff\2\172\1\55\1\145\5\uffff\1\157\1\uffff\1\154\1\141\1\164"+
        "\1\145\1\143\1\163\1\162\1\124\1\uffff\1\172\2\151\1\145\1\141\1"+
        "\uffff\1\145\2\uffff\1\162\1\uffff\1\156\1\172\1\164\1\145\1\172"+
        "\1\145\1\172\1\151\3\uffff\2\156\1\172\1\164\1\162\1\145\1\172\1"+
        "\uffff\1\151\1\163\1\uffff\1\172\3\uffff\2\153\1\uffff\1\151\1\171"+
        "\1\163\1\uffff\1\157\2\172\1\uffff\2\172\1\157\1\172\1\160\1\156"+
        "\4\uffff\1\156\1\uffff\1\157\2\172\1\156\2\uffff\1\163\1\145\1\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\5\1\6\1\7\1\uffff\1\12\1\13\23\uffff\1\105\1\106\1\107"+
        "\1\uffff\1\111\1\126\1\130\1\132\1\133\1\134\1\135\1\136\1\140\1"+
        "\141\1\147\1\1\2\uffff\1\23\2\uffff\1\114\1\uffff\1\121\1\143\1"+
        "\uffff\1\150\1\152\1\153\1\154\3\uffff\1\127\1\4\30\uffff\1\77\1"+
        "\34\2\uffff\1\71\1\51\4\uffff\1\100\1\103\1\101\1\104\1\102\1\137"+
        "\1\110\1\uffff\1\122\1\22\1\uffff\1\145\1\uffff\1\112\1\113\1\144"+
        "\1\156\1\uffff\1\120\1\157\1\146\1\151\1\155\12\uffff\1\35\12\uffff"+
        "\1\25\2\uffff\1\131\22\uffff\1\2\1\142\2\uffff\1\116\10\uffff\1"+
        "\20\1\uffff\1\37\25\uffff\1\33\5\uffff\1\73\1\64\5\uffff\1\10\20"+
        "\uffff\1\24\4\uffff\1\27\1\uffff\1\62\2\uffff\1\50\1\uffff\1\133"+
        "\17\uffff\1\14\1\uffff\1\57\1\uffff\1\53\5\uffff\1\43\4\uffff\1"+
        "\46\1\uffff\1\30\1\32\2\uffff\1\41\5\uffff\1\40\1\uffff\1\123\1"+
        "\125\1\124\6\uffff\1\65\2\uffff\1\31\4\uffff\1\21\1\54\1\70\1\26"+
        "\1\45\1\uffff\1\36\10\uffff\1\3\5\uffff\1\15\1\uffff\1\52\1\60\1"+
        "\uffff\1\133\10\uffff\1\115\1\117\1\17\7\uffff\1\42\2\uffff\1\63"+
        "\1\uffff\1\72\1\55\1\56\2\uffff\1\11\3\uffff\1\67\3\uffff\1\66\6"+
        "\uffff\1\61\1\76\1\74\1\75\1\uffff\1\16\4\uffff\1\47\1\44\2\uffff"+
        "\1\133";
    static final String DFA43_specialS =
        "\u0186\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\52\1\51\2\uffff\1\51\22\uffff\1\52\1\32\1\47\1\43\4\uffff"+
            "\1\10\1\11\1\37\1\35\1\6\1\36\1\41\1\40\12\46\1\26\1\44\1\33"+
            "\1\24\1\34\1\53\1\1\32\45\1\42\1\50\2\uffff\1\45\1\uffff\1\12"+
            "\1\45\1\25\1\45\1\20\1\23\2\45\1\17\1\16\2\45\1\31\1\30\1\7"+
            "\1\2\1\45\1\14\1\15\1\13\1\22\1\27\1\21\3\45\1\3\1\5\1\4",
            "\1\67\1\uffff\1\67\44\uffff\1\70\1\65\1\55\1\60\2\uffff\1\66"+
            "\1\57\1\72\1\uffff\1\63\1\62\1\uffff\1\61\1\54\1\uffff\1\56"+
            "\1\64\1\uffff\1\71",
            "\1\75\7\uffff\1\74\10\uffff\1\73",
            "\1\76",
            "",
            "",
            "",
            "\1\100\1\uffff\1\101\4\uffff\1\102",
            "",
            "",
            "\1\103\1\uffff\1\104",
            "\1\110\1\105\5\uffff\1\106\2\uffff\1\107",
            "\1\111",
            "\1\113\5\uffff\1\112",
            "\1\114",
            "\1\115\6\uffff\1\117\1\116",
            "\1\120\11\uffff\1\121\1\uffff\1\122",
            "\1\123\1\124",
            "\1\125",
            "\1\127\5\uffff\1\126",
            "\1\130",
            "\1\132\15\uffff\1\133",
            "\1\134",
            "\1\136",
            "\1\140\15\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\145",
            "",
            "",
            "",
            "\1\147",
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
            "\1\152\13\uffff\1\151",
            "\1\155\6\uffff\1\153\13\uffff\1\154",
            "",
            "\1\156",
            "\1\161\15\uffff\1\157\2\uffff\1\162\1\uffff\1\160",
            "",
            "\1\163\15\uffff\1\164\1\uffff\1\165",
            "",
            "",
            "\1\170\6\uffff\1\166\4\uffff\1\167",
            "",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174\6\uffff\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\14\uffff\1\u0086\1\u0089\1\uffff\1\u008a\1\u0088",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45"+
            "\1\u0090\6\45\1\u008f\4\45",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\12\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\1\u009c",
            "\1\u009d\4\uffff\1\u009e",
            "",
            "",
            "\1\u009f\5\uffff\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5\6\uffff\1\u00a4",
            "",
            "",
            "\1\155\14\uffff\1\65",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "\1\u00a7\4\uffff\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\22\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b0",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b2",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b4",
            "\1\u00b5\6\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45"+
            "\1\u00c8\27\45",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45"+
            "\1\u00eb\21\45",
            "\1\u00ed",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ef",
            "\1\u00f0",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0104",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0106",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u010e",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45"+
            "\1\u0111\7\45",
            "",
            "\1\u0113",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0116",
            "\1\45\2\uffff\12\45\7\uffff\1\u0117\31\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u0121\7\uffff\1\u011e\1\u0120\7\uffff\1\u011f",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "",
            "\1\45\2\uffff\12\45\7\uffff\4\45\1\u012b\25\45\4\uffff\1\45"+
            "\1\uffff\32\45",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0136",
            "",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "",
            "",
            "",
            "\1\u013f",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0141",
            "\1\u0142\37\uffff\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0147",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u014a",
            "\1\u014b",
            "",
            "",
            "",
            "",
            "",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154\16\uffff\1\u0155",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b",
            "",
            "",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u015f",
            "\1\u0160",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0162",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0164",
            "",
            "",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u016e\3\uffff\1\u016d",
            "\1\u016f",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\u0171",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\1\u0176",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u017b",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u017d",
            "\1\u017e",
            "",
            "",
            "",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0183",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | EXT_EXPR | EXT_ACT | OPAQUE_EXPR | KEY | SEMI | ID | INT | STRING | ESCAPE_SEQ | SL_COMMENTS | CR | WS | EOSF | SJF | PARALLEL | SBO | INITPARTNER | INIT_COR | PATTERN_COR | ISOLATED | CREATE_INST | VALID | KEEPSRC | IGNORE | PROP | MUSTUND );";
        }
    }
 

}