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

import org.junit.Test;

/**
 *
 * @author jesse
 */
public class XmlAdapterLONTest {

  public XmlAdapterLONTest() {
  }

  @Test
  public void testUnmarshal() {
    System.out.println("Test UN-Marshal");
    XmlAdapterLON adapterLON = new XmlAdapterLON();
    String[] lons = new String[]{"0011404.2W",
                                 "0122044.16W",
                                 "1232721.6W",
                                 "0011404.44E",
                                 "0122044.44E",
                                 "1232721.6E",
                                 "1232724.4E",
                                 "1795956.4E",
                                 "1795959.99W",
                                 "1814545.99W",
                                 "0001234.99W",
                                 "0126099.99W",
                                 "X"
    };
    for (String lon : lons) {
      try {
        Number number = adapterLON.unmarshal(lon);
        System.out.println("  " + lon + " unmarshals to " + number);
      } catch (Exception exception) {
        System.out.println("  " + lon + " fails to unmarshal " + exception.getMessage());
      }
    }

  }

  @Test
  public void testMarshal() {
    System.out.println("Test Marshal");
    XmlAdapterLON adapterLON = new XmlAdapterLON();

    Number[] numbers = new Number[]{123.456, 123.4567789, 12.3456789, 1.23456789, 179.999, 181.321, 205.321654,
                                    -123.456, -12.3456, -1.2345, -181.654, -320.456};

    for (Number number : numbers) {
      try {
        String lon = adapterLON.marshal(number);
        System.out.println("  " + number + " marshals to " + lon);
      } catch (Exception exception) {
        System.err.println("  " + number + " fails to marshal " + exception.getMessage());
      }
    }
  }

}
