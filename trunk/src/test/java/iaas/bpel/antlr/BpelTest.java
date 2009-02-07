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

import java.io.FileReader;
import com.javadude.antxr.scanner.BasicCrimsonXMLTokenStream;
import com.javadude.antxr.scanner.BasicXercesXMLTokenStream;

public class BpelTest {

  public static void main(String[] args) throws Exception {
//    // Create our scanner (using a simple SAX parser setup)
    BasicCrimsonXMLTokenStream stream =
        new BasicCrimsonXMLTokenStream(new FileReader("src/main/resources/loan.bpel"),
                                       BpelParser.class, false, false);

    // Create our ANTLR parser
    BpelParser bpelParser = new BpelParser(stream);

    // parse the document
    System.out.println(bpelParser.document());
  }
}
