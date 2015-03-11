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
import us.gov.dod.standard.ssrf._3_1.ForceElement;

/**
 * Enumerated values for fields using the ListCSR type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSR")
@XmlEnum
public enum ListCSR {

  @XmlEnumValue("AG/Band")
  AG_BAND("AG/Band"),
  @XmlEnumValue("Air Defense")
  AIR_DEFENSE("Air Defense"),
  @XmlEnumValue("Airborne Division")
  AIRBORNE_DIVISION("Airborne Division"),
  @XmlEnumValue("Airmobile")
  AIRMOBILE("Airmobile"),
  @XmlEnumValue("Armor")
  ARMOR("Armor"),
  @XmlEnumValue("Army")
  ARMY("Army"),
  @XmlEnumValue("Army Material Command")
  ARMY_MATERIAL_COMMAND("Army Material Command"),
  @XmlEnumValue("Aviation")
  AVIATION("Aviation"),
  @XmlEnumValue("Brigade Combat Team/IDIV")
  BRIGADE_COMBAT_TEAM_IDIV("Brigade Combat Team/IDIV"),
  @XmlEnumValue("Censorship")
  CENSORSHIP("Censorship"),
  @XmlEnumValue("Chaplain")
  CHAPLAIN("Chaplain"),
  @XmlEnumValue("Chemical")
  CHEMICAL("Chemical"),
  @XmlEnumValue("Civil Affairs")
  CIVIL_AFFAIRS("Civil Affairs"),
  @XmlEnumValue("Combat Service Support")
  COMBAT_SERVICE_SUPPORT("Combat Service Support"),
  @XmlEnumValue("Corps")
  CORPS("Corps"),
  @XmlEnumValue("Engineering")
  ENGINEERING("Engineering"),
  @XmlEnumValue("Field artillery")
  FIELD_ARTILLERY("Field artillery"),
  @XmlEnumValue("Finance")
  FINANCE("Finance"),
  @XmlEnumValue("General")
  GENERAL("General"),
  @XmlEnumValue("Heavy Division/Brigade")
  HEAVY_DIVISION_BRIGADE("Heavy Division/Brigade"),
  @XmlEnumValue("Infantry")
  INFANTRY("Infantry"),
  @XmlEnumValue("Judge Advocate")
  JUDGE_ADVOCATE("Judge Advocate"),
  @XmlEnumValue("Maintenance")
  MAINTENANCE("Maintenance"),
  @XmlEnumValue("Medical")
  MEDICAL("Medical"),
  @XmlEnumValue("Military Intelligence (corps and below)")
  MILITARY_INTELLIGENCE_CORPS_AND_BELOW("Military Intelligence (corps and below)"),
  @XmlEnumValue("Military intelligence (EAC)")
  MILITARY_INTELLIGENCE_EAC("Military intelligence (EAC)"),
  @XmlEnumValue("Military intelligence (SIGINT EAC)")
  MILITARY_INTELLIGENCE_SIGINT_EAC("Military intelligence (SIGINT EAC)"),
  @XmlEnumValue("Military police")
  MILITARY_POLICE("Military police"),
  @XmlEnumValue("Ordnance")
  ORDNANCE("Ordnance"),
  @XmlEnumValue("Psychological Operations")
  PSYCHOLOGICAL_OPERATIONS("Psychological Operations"),
  @XmlEnumValue("Quartermaster")
  QUARTERMASTER("Quartermaster"),
  @XmlEnumValue("Separate Light Infantry")
  SEPARATE_LIGHT_INFANTRY("Separate Light Infantry"),
  @XmlEnumValue("Signal")
  SIGNAL("Signal"),
  @XmlEnumValue("Space/Missile Defense")
  SPACE_MISSILE_DEFENSE("Space/Missile Defense"),
  @XmlEnumValue("Special Forces")
  SPECIAL_FORCES("Special Forces"),
  @XmlEnumValue("Supply")
  SUPPLY("Supply"),
  @XmlEnumValue("Transportation")
  TRANSPORTATION("Transportation"),
  @XmlEnumValue("Other")
  OTHER("Other"),
  @XmlEnumValue("Unknown")
  UNKNOWN("Unknown");
  private final String value;

  ListCSR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSR fromValue(String v) {
    for (ListCSR c : ListCSR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
