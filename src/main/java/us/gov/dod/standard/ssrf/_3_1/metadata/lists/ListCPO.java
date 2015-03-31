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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.IntfReport;
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedPolarisationAnalysis;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingTarget;

/**
 * Enumerated values for fields using the ListCPO type.
 * <p>
 * Used in
 * {@link AntMode}, {@link IntfReport}, {@link JammingTarget}, {@link ObservedPolarisationAnalysis}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCPO")
@XmlEnum
public enum ListCPO {

  @XmlEnumValue("45-degrees")
  DEGREES_45("45-degrees"),
  @XmlEnumValue("Left-hand circular")
  LEFT_HAND_CIRCULAR("Left-hand circular"),
  @XmlEnumValue("Right-hand circular")
  RIGHT_HAND_CIRCULAR("Right-hand circular"),
  @XmlEnumValue("Dual")
  DUAL("Dual"),
  @XmlEnumValue("Elliptical")
  ELLIPTICAL("Elliptical"),
  @XmlEnumValue("Elliptic left")
  ELLIPTIC_LEFT("Elliptic left"),
  @XmlEnumValue("Elliptic right")
  ELLIPTIC_RIGHT("Elliptic right"),
  @XmlEnumValue("Horizontal linear")
  HORIZONTAL_LINEAR("Horizontal linear"),
  @XmlEnumValue("Horizontal and vertical")
  HORIZONTAL_AND_VERTICAL("Horizontal and vertical"),
  @XmlEnumValue("Linear")
  LINEAR("Linear"),
  @XmlEnumValue("Mixed")
  MIXED("Mixed"),
  @XmlEnumValue("Oblique, angled, crossed")
  OBLIQUE_ANGLED_CROSSED("Oblique, angled, crossed"),
  @XmlEnumValue("Rotating")
  ROTATING("Rotating"),
  @XmlEnumValue("Right-hand slant")
  RIGHT_HAND_SLANT("Right-hand slant"),
  @XmlEnumValue("Left-hand slant")
  LEFT_HAND_SLANT("Left-hand slant"),
  @XmlEnumValue("Right and left-hand circular")
  RIGHT_AND_LEFT_HAND_CIRCULAR("Right and left-hand circular"),
  @XmlEnumValue("Vertical linear")
  VERTICAL_LINEAR("Vertical linear"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other");

  private final String value;

  ListCPO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPO fromValue(String v) {
    for (ListCPO c : ListCPO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
