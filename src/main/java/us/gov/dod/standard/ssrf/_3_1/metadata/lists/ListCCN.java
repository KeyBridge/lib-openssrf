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
import us.gov.dod.standard.ssrf._3_1.antenna.AntHardware;

/**
 * Enumerated values for fields using the ListCCN type.
 * <p>
 * Used in {@link AntHardware}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCCN")
@XmlEnum
public enum ListCCN {

  MC("MC"),
  @XmlEnumValue("Micro-coaxial")
  MICRO_COAXIAL("Micro-coaxial"),
  @XmlEnumValue("Micro-miniature coaxial")
  MICRO_MINIATURE_COAXIAL("Micro-miniature coaxial"),
  MMX("MMX"),
  @XmlEnumValue("Neill-Concelman Bayonet")
  NEILL_CONCELMAN_BAYONET("Neill-Concelman Bayonet"),
  @XmlEnumValue("Neill-Concelman Threaded")
  NEILL_CONCELMAN_THREADED("Neill-Concelman Threaded"),
  @XmlEnumValue("Sub-Miniature version A")
  SUB_MINIATURE_VERSION_A("Sub-Miniature version A"),
  @XmlEnumValue("Sub-Miniature version B")
  SUB_MINIATURE_VERSION_B("Sub-Miniature version B"),
  @XmlEnumValue("Sub-Miniature version C")
  SUB_MINIATURE_VERSION_C("Sub-Miniature version C"),
  @XmlEnumValue("Type N")
  TYPE_N("Type N"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCCN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCN fromValue(String v) {
    for (ListCCN c : ListCCN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
