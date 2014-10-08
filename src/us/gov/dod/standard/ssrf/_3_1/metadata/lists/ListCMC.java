/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCMC")
@XmlEnum
public enum ListCMC {

  @XmlEnumValue("Admin and Special Services")
  ADMIN_AND_SPECIAL_SERVICES("Admin and Special Services"),
  @XmlEnumValue("Armor/Antitank")
  ARMOR_ANTITANK("Armor/Antitank"),
  @XmlEnumValue("Artillery /Air and Space Defense")
  ARTILLERY__AIR_AND_SPACE_DEFENSE("Artillery /Air and Space Defense"),
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
  INTELLIGENCE___PSYCHOLOGICAL_OPS("Intelligence / Psychological Ops"),
  @XmlEnumValue("Law enforcement / Security")
  LAW_ENFORCEMENT___SECURITY("Law enforcement / Security"),
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
  TRANSPORTATION___FLEET_AUXILIARIES("Transportation / Fleet Auxiliaries"),
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
