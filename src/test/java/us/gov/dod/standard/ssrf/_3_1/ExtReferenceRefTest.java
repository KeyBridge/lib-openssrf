/* 
 * Copyright 2015 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf.SSRFTestUtility;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 *
 * @author jesse
 */
public class ExtReferenceRefTest extends TestCase {

  public ExtReferenceRefTest() {
  }

  public void testMinimumPositiveFill() throws Exception {

    ExtReferenceRef ref = new ExtReferenceRef()
            .withValue(new Contact().getSerial().toString())
            .withCls(ListCCL.UNCLASSIFIED)
            .withIdx(120938);

    System.out.println(ref);

    SSRFTestUtility.fill(ref, true);

    System.out.println(SSRFUtility.marshal(ref));

    TOA t = new TOA()
            .withExtReferenceRef(ref);

//    SSRFTestUtility.fill(t, true);
    System.out.println(SSRFUtility.marshal(t));

//    TDecimal td = new TDecimal(12093812.1023810938);    td.setCls(ListCCL.UNCLASSIFIED);    System.out.println("TD " + td);    System.out.println(SSRFUtility.marshal(td));
  }

}
