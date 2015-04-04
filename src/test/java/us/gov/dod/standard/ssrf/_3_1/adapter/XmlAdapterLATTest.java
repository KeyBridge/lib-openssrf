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
package us.gov.dod.standard.ssrf._3_1.adapter;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author jesse
 */
public class XmlAdapterLATTest extends TestCase {

  public XmlAdapterLATTest() {
  }

  @Test
  public void testUnmarshal() throws Exception {
    XmlAdapterLAT adapter = new XmlAdapterLAT();

    String[] lats = new String[]{"011404.2N",
                                 "122044.16N",
                                 "232721.6N",
                                 "011404.44S",
                                 "122044.44S",
                                 "232721.6S",
                                 "232724.4S",
                                 "795956.4S",
                                 "795959.99N",
                                 "914545.99N",
                                 "001234.99N",
                                 "126099.99N",
                                 "X"
    };

    for (String lat : lats) {
      try {
        Number number = adapter.unmarshal(lat);
        System.out.println("  " + lat + " unmarshals to " + number);
      } catch (Exception exception) {
        System.out.println("  " + lat + " fails to unmarshal " + exception.getMessage());
      }
    }

  }

  @Test
  public void testMarshal() throws Exception {
    XmlAdapterLAT adapter = new XmlAdapterLAT();

    Number[] numbers = new Number[]{23.456, 23.4567789, 12.3456789, 1.23456789, 79.999, 91.321, 205.321654,
                                    -23.456, -12.3456, -1.2345, -91.654, -320.456};

    for (Number number : numbers) {
      try {
        String lon = adapter.marshal(number);
        System.out.println("  " + number + " marshals to " + lon);
      } catch (Exception exception) {
        System.err.println("  " + number + " fails to marshal " + exception.getMessage());
      }
    }

  }

}
