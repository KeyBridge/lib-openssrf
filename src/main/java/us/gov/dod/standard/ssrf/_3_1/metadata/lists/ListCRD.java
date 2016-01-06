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
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedPolarisationAnalysis;

/**
 * Enumerated values for fields using the ListCRD type.
 * <p>
 * Used in {@link AntMode}, {@link ObservedPolarisationAnalysis}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCRD")
@XmlEnum
public enum ListCRD {

  @XmlEnumValue("Clockwise")
  CLOCKWISE("Clockwise"),
  @XmlEnumValue("Counter-Clockwise")
  COUNTER_CLOCKWISE("Counter-Clockwise");
  private final String value;

  ListCRD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRD fromValue(String v) {
    for (ListCRD c : ListCRD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
