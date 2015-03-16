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

import org.junit.Test;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf.SSRFProperties;
import us.gov.dod.standard.ssrf.SSRFTestUtility;
import us.gov.dod.standard.ssrf.SSRFUtility;

/**
 *
 * @author jesse
 */
public class TOATest {

  public TOATest() {
  }

  @Test
  public void testMinimumPositiveFill() throws Exception {

    TOA t = new TOA();
    System.out.println("t.serial " + t.getSerial());

    SSRFTestUtility.fill(t, false);

    SSRFUtility.prepare(t, null);

    System.out.println(t);
    System.out.println(SSRFUtility.marshal(t));
//    for (FreqBand freqBand : t.getFreqBand()) {      freqBand.getFreqMin().setCls(ListCCL.S);      freqBand.getFreqMax().setCls(ListCCL.R);    }
//    System.out.println(SSRFUtility.marshal(t));
//    System.out.println("  test Minimum Positive Fill OK");
    SSRF ssrf = new SSRF().withProperties(SSRFProperties.getDefault()).withTOA(t);
//    System.out.println(ssrf);

    for (String error : ssrf.evaluate()) {
      System.err.println("ERROR  " + error);
    }

//    System.out.println(ssrf.getTOA());
//    System.out.println(ssrf.toXML());
//    TDecimal td = new TDecimal(12093812.1023810938);    td.setCls(ListCCL.U);    System.out.println("TD " + td);    System.out.println(SSRFUtility.marshal(td));
  }

}
