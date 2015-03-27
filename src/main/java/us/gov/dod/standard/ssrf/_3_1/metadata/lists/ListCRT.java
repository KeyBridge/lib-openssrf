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
import us.gov.dod.standard.ssrf._3_1.receiver.RxMode;

/**
 * Enumerated values for fields using the ListCRT type.
 * <p>
 * Used in {@link RxMode}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCRT")
@XmlEnum
public enum ListCRT {

  @XmlEnumValue("Coherent")
  COHERENT("Coherent"),
  @XmlEnumValue("Crystal")
  CRYSTAL("Crystal"),
  @XmlEnumValue("Direct View Optics")
  DIRECT_VIEW_OPTICS("Direct View Optics"),
  @XmlEnumValue("Double Conversion Superheterodyne")
  DOUBLE_CONVERSION_SUPERHETERODYNE("Double Conversion Superheterodyne"),
  @XmlEnumValue("Homodyne")
  HOMODYNE("Homodyne"),
  @XmlEnumValue("Imaging Detector")
  IMAGING_DETECTOR("Imaging Detector"),
  @XmlEnumValue("Non-Coherent")
  NON_COHERENT("Non-Coherent"),
  @XmlEnumValue("Non-Imaging Detector")
  NON_IMAGING_DETECTOR("Non-Imaging Detector"),
  @XmlEnumValue("Quad Conversion Superheterodyne")
  QUAD_CONVERSION_SUPERHETERODYNE("Quad Conversion Superheterodyne"),
  @XmlEnumValue("Super Regenerative")
  SUPER_REGENERATIVE("Super Regenerative"),
  @XmlEnumValue("Superheterodyne")
  SUPERHETERODYNE("Superheterodyne"),
  @XmlEnumValue("Triple Conversion Superheterodyne")
  TRIPLE_CONVERSION_SUPERHETERODYNE("Triple Conversion Superheterodyne"),
  @XmlEnumValue("Tuned Radio Frequency")
  TUNED_RADIO_FREQUENCY("Tuned Radio Frequency"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCRT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRT fromValue(String v) {
    for (ListCRT c : ListCRT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
