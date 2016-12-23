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
import us.gov.dod.standard.ssrf._3_1.ForceElement;

/**
 * Enumerated values for fields using the ListCMC type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCMC")
@XmlEnum
public enum ListCMC {

  @XmlEnumValue("Admin and Special Services")
  ADMIN_AND_SPECIAL_SERVICES("Admin and Special Services"),
  @XmlEnumValue("Armor/Antitank")
  ARMOR_ANTITANK("Armor/Antitank"),
  @XmlEnumValue("Artillery /Air and Space Defense")
  ARTILLERY_AIR_AND_SPACE_DEFENSE("Artillery /Air and Space Defense"),
  @XmlEnumValue("Aviation Support")
  AVIATION_SUPPORT("Aviation Support"),
  @XmlEnumValue("Aviation/Anti-Aircraft")
  AVIATION_ANTI_AIRCRAFT("Aviation/Anti-Aircraft"),
  @XmlEnumValue("Chemical/Ordnance")
  CHEMICAL_ORDNANCE("Chemical/Ordnance"),
  @XmlEnumValue("Civil Affairs")
  CIVIL_AFFAIRS("Civil Affairs"),
  @XmlEnumValue("Civil Air Patrol")
  CIVIL_AIR_PATROL("Civil Air Patrol"),
  @XmlEnumValue("Combat Support")
  COMBAT_SUPPORT("Combat Support"),
  @XmlEnumValue("Communications")
  COMMUNICATIONS("Communications"),
  @XmlEnumValue("Composite Forces")
  COMPOSITE_FORCES("Composite Forces"),
  @XmlEnumValue("Engineering")
  ENGINEERING("Engineering"),
  @XmlEnumValue("Finance")
  FINANCE("Finance"),
  @XmlEnumValue("Infantry")
  INFANTRY("Infantry"),
  @XmlEnumValue("Intelligence / Psychological Ops")
  INTELLIGENCE_PSYCHOLOGICAL_OPS("Intelligence / Psychological Ops"),
  @XmlEnumValue("Law enforcement / Security")
  LAW_ENFORCEMENT_SECURITY("Law enforcement / Security"),
  @XmlEnumValue("Maintenance")
  MAINTENANCE("Maintenance"),
  @XmlEnumValue("Major Command")
  MAJOR_COMMAND("Major Command"),
  @XmlEnumValue("Medical/Dental")
  MEDICAL_DENTAL("Medical/Dental"),
  @XmlEnumValue("Miscellaneous")
  MISCELLANEOUS("Miscellaneous"),
  @XmlEnumValue("Multifunction Post")
  MULTIFUNCTION_POST("Multifunction Post"),
  @XmlEnumValue("Naval Support")
  NAVAL_SUPPORT("Naval Support"),
  @XmlEnumValue("Recruiting")
  RECRUITING("Recruiting"),
  @XmlEnumValue("Research and Development")
  RESEARCH_AND_DEVELOPMENT("Research and Development"),
  @XmlEnumValue("Special Ops")
  SPECIAL_OPS("Special Ops"),
  @XmlEnumValue("Supply")
  SUPPLY("Supply"),
  @XmlEnumValue("Tactical Control")
  TACTICAL_CONTROL("Tactical Control"),
  @XmlEnumValue("Task Organisation")
  TASK_ORGANISATION("Task Organisation"),
  @XmlEnumValue("Training")
  TRAINING("Training"),
  @XmlEnumValue("Transportation / Fleet Auxiliaries")
  TRANSPORTATION_FLEET_AUXILIARIES("Transportation / Fleet Auxiliaries"),
  @XmlEnumValue("Warships")
  WARSHIPS("Warships"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCMC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCMC fromValue(String v) {
    for (ListCMC c : ListCMC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
