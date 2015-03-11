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
import us.gov.dod.standard.ssrf._3_1.assignment.CoordinationData;

/**
 * Enumerated values for fields using the ListUCJ type.
 * <p>
 * Used in {@link CoordinationData}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUCJ")
@XmlEnum
public enum ListUCJ {

  @XmlEnumValue("Canada")
  CANADA("Canada"),
  @XmlEnumValue("Mexico")
  MEXICO("Mexico"),
  NATO("NATO"),
  @XmlEnumValue("Host Nation")
  HOST_NATION("Host Nation"),
  @XmlEnumValue("NTIA Fas Members")
  NTIA_FAS_MEMBERS("NTIA Fas Members"),
  FAA("FAA"),
  @XmlEnumValue("DoD Joint Chiefs of Staff")
  DO_D_JOINT_CHIEFS_OF_STAFF("DoD Joint Chiefs of Staff"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUCJ(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUCJ fromValue(String v) {
    for (ListUCJ c : ListUCJ.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
