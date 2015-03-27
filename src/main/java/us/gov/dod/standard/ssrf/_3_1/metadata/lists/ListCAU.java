/* 
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.antenna.AntFreqs;
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.assignment.Freq;
import us.gov.dod.standard.ssrf._3_1.assignment.FreqOld;
import us.gov.dod.standard.ssrf._3_1.assignment.StationConfig;
import us.gov.dod.standard.ssrf._3_1.jrfl.JRFLEntry;

/**
 * Enumerated values for fields using the ListCAU type.
 * <p>
 * Used in
 * {@link AntFreqs}, {@link AntMode}, {@link AsgnFreqBase}, {@link Freq}, {@link FreqOld}, {@link JRFLEntry}, {@link StationConfig}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAU")
@XmlEnum
public enum ListCAU {

  @XmlEnumValue("Transmit Only")
  TRANSMIT_ONLY("Transmit Only"),
  @XmlEnumValue("Receive Only")
  RECEIVE_ONLY("Receive Only"),
  @XmlEnumValue("Transmit-Receive")
  TRANSMIT_RECEIVE("Transmit-Receive");
  private final String value;

  ListCAU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAU fromValue(String v) {
    for (ListCAU c : ListCAU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
