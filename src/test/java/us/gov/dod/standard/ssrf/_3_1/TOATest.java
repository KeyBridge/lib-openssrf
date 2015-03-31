/*
 * Copyright 2015 OpenSSRF.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1;

import junit.framework.TestCase;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf.SSRFProperties;
import us.gov.dod.standard.ssrf.SSRFTestUtility;

/**
 *
 * @author jesse
 */
public class TOATest extends TestCase {

  public TOATest(String testName) {
    super(testName);
  }

  public TOATest() {
  }

  public void testMaximumPositiveFill() throws Exception {
    TOA t = new TOA();
    SSRFTestUtility.fill(t, true);

    SSRF ssrf = new SSRF().withProperties(SSRFProperties.getDefault()).withTOA(t);
    for (String error : ssrf.evaluate()) {
      System.err.println("ERROR  " + error);
    }
//    System.out.println("FULL " + t.toString() + "\n\n");

    System.out.println("\n\n");
    System.out.println(ssrf.toXML());
  }

  public void testMinimumPositiveFill() throws Exception {
    TOA t = new TOA();
    SSRFTestUtility.fill(t, false);

    SSRF ssrf = new SSRF().withProperties(SSRFProperties.getDefault()).withTOA(t);
    for (String error : ssrf.evaluate()) {
      System.err.println("ERROR  " + error);
    }
    System.out.println("\n\n");

    System.out.println(ssrf.toXML());
  }

}
