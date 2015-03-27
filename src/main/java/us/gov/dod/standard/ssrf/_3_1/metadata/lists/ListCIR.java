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
import us.gov.dod.standard.ssrf._3_1.assignment.Assigned;

/**
 * Enumerated values for fields using the ListCIR type.
 * <p>
 * Used in {@link Assigned}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCIR")
@XmlEnum
public enum ListCIR {

  @XmlEnumValue("Not requested-Security")
  NOT_REQUESTED_SECURITY("Not requested-Security"),
  @XmlEnumValue("Not required")
  NOT_REQUIRED("Not required"),
  @XmlEnumValue("Outside Rules")
  OUTSIDE_RULES("Outside Rules"),
  @XmlEnumValue("Pending")
  PENDING("Pending"),
  @XmlEnumValue("Registered")
  REGISTERED("Registered"),
  @XmlEnumValue("Registered on Insistence")
  REGISTERED_ON_INSISTENCE("Registered on Insistence"),
  @XmlEnumValue("Registered-Needs modification")
  REGISTERED_NEEDS_MODIFICATION("Registered-Needs modification"),
  @XmlEnumValue("Required")
  REQUIRED("Required"),
  @XmlEnumValue("Unfavourable")
  UNFAVOURABLE("Unfavourable");
  private final String value;

  ListCIR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIR fromValue(String v) {
    for (ListCIR c : ListCIR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
