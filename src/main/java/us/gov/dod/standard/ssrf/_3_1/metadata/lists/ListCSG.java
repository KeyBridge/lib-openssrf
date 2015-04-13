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
import us.gov.dod.standard.ssrf._3_1.ExternalReference;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.ssrequest.Stage;

/**
 * Enumerated values for fields using the ListCSG type.
 * <p>
 * Used in
 * {@link ExternalReference}, {@link RFSystem}, {@link SSRequest}, {@link Stage}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCSG")
@XmlEnum
public enum ListCSG {

  @XmlEnumValue("Conceptual")
  CONCEPTUAL("Conceptual"),
  @XmlEnumValue("Developmental")
  DEVELOPMENTAL("Developmental"),
  @XmlEnumValue("Experimental")
  EXPERIMENTAL("Experimental"),
  @XmlEnumValue("Operational")
  OPERATIONAL("Operational");
  private final String value;

  ListCSG(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSG fromValue(String v) {
    for (ListCSG c : ListCSG.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
