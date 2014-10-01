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
 * Enumerated values for fields using the ListCSR type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
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
  MILITARY_INTELLIGENCE__CORPS_AND_BELOW__("Military Intelligence (corps and below)"),
  @XmlEnumValue("Military intelligence (EAC)")
  MILITARY_INTELLIGENCE__EAC__("Military intelligence (EAC)"),
  @XmlEnumValue("Military intelligence (SIGINT EAC)")
  MILITARY_INTELLIGENCE__SIGINT_EAC__("Military intelligence (SIGINT EAC)"),
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
