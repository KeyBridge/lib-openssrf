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
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;

/**
 * Enumerated values for fields using the ListUS2 type.
 * <p>
 * Used in {@link UsingCountries}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUS2")
@XmlEnum
public enum ListUS2 {

  @XmlEnumValue("Producing")
  PRODUCING("Producing"),
  @XmlEnumValue("Source")
  SOURCE("Source"),
  @XmlEnumValue("Using")
  USING("Using"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUS2(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUS2 fromValue(String v) {
    for (ListUS2 c : ListUS2.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
