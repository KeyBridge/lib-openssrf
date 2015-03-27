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
import us.gov.dod.standard.ssrf._3_1.IntfReport;

/**
 * Enumerated values for fields using the ListCJ1 type.
 * <p>
 * Used in {@link IntfReport}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCJ1")
@XmlEnum
public enum ListCJ1 {

  @XmlEnumValue("Environmental")
  ENVIRONMENTAL("Environmental"),
  @XmlEnumValue("Interference")
  INTERFERENCE("Interference"),
  @XmlEnumValue("Intrusion")
  INTRUSION("Intrusion"),
  @XmlEnumValue("Jamming")
  JAMMING("Jamming"),
  @XmlEnumValue("Meaconing")
  MEACONING("Meaconing");
  private final String value;

  ListCJ1(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCJ1 fromValue(String v) {
    for (ListCJ1 c : ListCJ1.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
