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

    SSRFTestUtility.minfill(t);

    System.out.println("  test Minimum Positive Fill OK");

    SSRF ssrf = new SSRF().withProperties(SSRFProperties.getDefault()).withTOA(t);
    System.out.println(ssrf);

    System.out.println(ssrf.evaluate());
    System.out.println(ssrf.toXML());

  }

}
