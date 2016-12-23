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
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.assignment.Tuning;

/**
 * Enumerated values for fields using the ListCDS type.
 * <p>
 * Used in {@link Receiver}, {@link Transmitter}, {@link Tuning}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCDS")
@XmlEnum
public enum ListCDS {

  @XmlEnumValue("Exactly")
  EXACTLY("Exactly"),
  @XmlEnumValue("Minimum")
  MINIMUM("Minimum");
  private final String value;

  ListCDS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDS fromValue(String v) {
    for (ListCDS c : ListCDS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
