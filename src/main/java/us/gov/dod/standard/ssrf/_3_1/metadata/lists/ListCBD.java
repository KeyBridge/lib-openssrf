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
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedLobeAnalysis;

/**
 * Enumerated values for fields using the ListCBD type.
 * <p>
 * Used in {@link AntMode}, {@link ObservedLobeAnalysis}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCBD")
@XmlEnum
public enum ListCBD {

  @XmlEnumValue("Cardioid")
  CARDIOID("Cardioid"),
  @XmlEnumValue("Cosecant Squared")
  COSECANT_SQUARED("Cosecant Squared"),
  @XmlEnumValue("Elliptical")
  ELLIPTICAL("Elliptical"),
  @XmlEnumValue("Fan")
  FAN("Fan"),
  @XmlEnumValue("Hyperbolic")
  HYPERBOLIC("Hyperbolic"),
  @XmlEnumValue("Omni")
  OMNI("Omni"),
  @XmlEnumValue("Pencil")
  PENCIL("Pencil"),
  @XmlEnumValue("Shaped Beam")
  SHAPED_BEAM("Shaped Beam"),
  @XmlEnumValue("Single Symmetrical Lobe")
  SINGLE_SYMMETRICAL_LOBE("Single Symmetrical Lobe"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCBD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCBD fromValue(String v) {
    for (ListCBD c : ListCBD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
