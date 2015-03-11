/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedPolarisationAnalysis;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedScanAnalysis;
import us.gov.dod.standard.ssrf._3_1.multiple.ObservedERPAnalysis;
import us.gov.dod.standard.ssrf._3_1.transmitter.ObservedMOPAnalysis;
import us.gov.dod.standard.ssrf._3_1.transmitter.ObservedPulseAnalysis;
import us.gov.dod.standard.ssrf._3_1.transmitter.ObservedRFAnalysis;

/**
 * Enumerated values for fields using the ListUS7 type.
 * <p>
 * Used in
 * {@link ObservedERPAnalysis}, {@link ObservedMOPAnalysis}, {@link ObservedPolarisationAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link ObservedScanAnalysis}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUS7")
@XmlEnum
public enum ListUS7 {

  @XmlEnumValue("Adaptive")
  ADAPTIVE("Adaptive"),
  @XmlEnumValue("Non-Patterned")
  NON_PATTERNED("Non-Patterned"),
  @XmlEnumValue("Patterned")
  PATTERNED("Patterned"),
  @XmlEnumValue("Unmodulated")
  UNMODULATED("Unmodulated"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUS7(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUS7 fromValue(String v) {
    for (ListUS7 c : ListUS7.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
