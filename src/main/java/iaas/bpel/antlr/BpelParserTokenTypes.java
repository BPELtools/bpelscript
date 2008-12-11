// $ANTXR : "bpel.antxr" -> "BpelParser.java"$
// GENERATED CODE - DO NOT EDIT!

/*
 * Copyright 2008 Marc Bischof 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *      http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package iaas.bpel.antlr;

import iaas.bpel.antlr.BpelBoolean;
import iaas.bpel.antlr.JoinBool;
import iaas.bpel.antlr.JoinPattern;
import iaas.bpel.antlr.Helper;

import java.util.List;
import java.util.Iterator;

public interface BpelParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	// "<process>" = 4
	int XML_END_TAG = 5;
	// "<extensions>" = 6
	// "<extension>" = 7
	// "<import>" = 8
	// "<messageExchanges>" = 9
	// "<messageExchange>" = 10
	// "<partnerLinks>" = 11
	// "<partnerLink>" = 12
	// "<variables>" = 13
	// "<variable>" = 14
	// "<correlationSets>" = 15
	// "<correlationSet>" = 16
	// "<faultHandlers>" = 17
	// "<eventHandlers>" = 18
	// "<onEvent>" = 19
	// "<onAlarm>" = 20
	// "<receive>" = 21
	// "<reply>" = 22
	// "<invoke>" = 23
	// "<assign>" = 24
	// "<throw>" = 25
	// "<exit>" = 26
	// "<wait>" = 27
	// "<empty>" = 28
	// "<sequence>" = 29
	// "<if>" = 30
	// "<while>" = 31
	// "<repeatUntil>" = 32
	// "<forEach>" = 33
	// "<pick>" = 34
	// "<onMessage>" = 35
	// "<flow>" = 36
	// "<scope>" = 37
	// "<compensate>" = 38
	// "<compensateScope>" = 39
	// "<rethrow>" = 40
	// "<validate>" = 41
	// "<extensionActivity>" = 42
	int PCDATA = 43;
	// "<targets>" = 44
	// "<joinCondition>" = 45
	// "<target>" = 46
	// "<sources>" = 47
	// "<source>" = 48
	// "<transitionCondition>" = 49
	// "<correlations>" = 50
	// "<correlation>" = 51
	// "<catch>" = 52
	// "<catchAll>" = 53
	// "<compensationHandler>" = 54
	// "<toParts>" = 55
	// "<toPart>" = 56
	// "<to>" = 57
	// "<fromParts>" = 58
	// "<fromPart>" = 59
	// "<from>" = 60
	// "<extensionAssignOperation>" = 61
	// "<for>" = 62
	// "<until>" = 63
	// "<copy>" = 64
	// "<condition>" = 65
	// "<elseif>" = 66
	// "<else>" = 67
	// "<startCounterValue>" = 68
	// "<finalCounterValue>" = 69
	// "<completionCondition>" = 70
	// "<branches>" = 71
	// "<repeatEvery>" = 72
	// "<links>" = 73
	// "<link>" = 74
	// "<terminationHandler>" = 75
	// "<query>" = 76
	// "<literal>" = 77
	// "<documentation>" = 78
	int OTHER_TAG = 79;
}
