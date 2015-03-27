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
import us.gov.dod.standard.ssrf._3_1.receiver.Curve;

/**
 * Enumerated values for fields using the ListCCT type.
 * <p>
 * Used in {@link Curve}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCCT")
@XmlEnum
public enum ListCCT {

  @XmlEnumValue("Filter")
  FILTER("Filter"),
  @XmlEnumValue("Selectivity-IF1")
  SELECTIVITY_IF_1("Selectivity-IF1"),
  @XmlEnumValue("Selectivity-IF2")
  SELECTIVITY_IF_2("Selectivity-IF2"),
  @XmlEnumValue("Selectivity-IF3")
  SELECTIVITY_IF_3("Selectivity-IF3"),
  @XmlEnumValue("Selectivity-IF4")
  SELECTIVITY_IF_4("Selectivity-IF4"),
  @XmlEnumValue("Selectivity-IF5")
  SELECTIVITY_IF_5("Selectivity-IF5"),
  @XmlEnumValue("Selectivity-Overall")
  SELECTIVITY_OVERALL("Selectivity-Overall"),
  @XmlEnumValue("Selectivity-RF")
  SELECTIVITY_RF("Selectivity-RF"),
  @XmlEnumValue("Tx RF Spectrum")
  TX_RF_SPECTRUM("Tx RF Spectrum");
  private final String value;

  ListCCT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCT fromValue(String v) {
    for (ListCCT c : ListCCT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
