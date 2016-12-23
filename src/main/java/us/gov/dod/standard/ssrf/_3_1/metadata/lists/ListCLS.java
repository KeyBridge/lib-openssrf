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
import us.gov.dod.standard.ssrf._3_1.Satellite;

/**
 * Enumerated values for fields using the ListCLS type.
 * <p>
 * Used in {@link Satellite}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCLS")
@XmlEnum
public enum ListCLS {

  @XmlEnumValue("Cancelled")
  CANCELLED("Cancelled"),
  @XmlEnumValue("Decayed")
  DECAYED("Decayed"),
  @XmlEnumValue("Firm Future")
  FIRM_FUTURE("Firm Future"),
  @XmlEnumValue("Ground Spare")
  GROUND_SPARE("Ground Spare"),
  @XmlEnumValue("Inoperative")
  INOPERATIVE("Inoperative"),
  @XmlEnumValue("Launched")
  LAUNCHED("Launched"),
  @XmlEnumValue("Operational")
  OPERATIONAL("Operational"),
  @XmlEnumValue("Orbital Spare")
  ORBITAL_SPARE("Orbital Spare"),
  @XmlEnumValue("Orbital Test")
  ORBITAL_TEST("Orbital Test"),
  @XmlEnumValue("Partially Operational")
  PARTIALLY_OPERATIONAL("Partially Operational"),
  @XmlEnumValue("Possible Future")
  POSSIBLE_FUTURE("Possible Future"),
  @XmlEnumValue("Retired")
  RETIRED("Retired"),
  @XmlEnumValue("Total Launch Failure")
  TOTAL_LAUNCH_FAILURE("Total Launch Failure"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCLS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCLS fromValue(String v) {
    for (ListCLS c : ListCLS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
