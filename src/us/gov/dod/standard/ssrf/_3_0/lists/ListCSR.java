/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCSR.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCSR"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="AG/Band"/> &lt;enumeration value="Air Defense"/> &lt;enumeration
 * value="Airborne Division"/> &lt;enumeration value="Airmobile"/>
 * &lt;enumeration value="Armor"/> &lt;enumeration value="Army"/>
 * &lt;enumeration value="Army Material Command"/> &lt;enumeration
 * value="Aviation"/> &lt;enumeration value="Brigade Combat Team/IDIV"/>
 * &lt;enumeration value="Censorship"/> &lt;enumeration value="Chaplain"/>
 * &lt;enumeration value="Chemical"/> &lt;enumeration value="Civil Affairs"/>
 * &lt;enumeration value="Combat Service Support"/> &lt;enumeration
 * value="Corps"/> &lt;enumeration value="Engineering"/> &lt;enumeration
 * value="Field artillery"/> &lt;enumeration value="Finance"/> &lt;enumeration
 * value="General"/> &lt;enumeration value="Heavy Division/Brigade"/>
 * &lt;enumeration value="Infantry"/> &lt;enumeration value="Judge Advocate"/>
 * &lt;enumeration value="Maintenance"/> &lt;enumeration value="Medical"/>
 * &lt;enumeration value="Military Intelligence (corps and below)"/>
 * &lt;enumeration value="Military intelligence (EAC)"/> &lt;enumeration
 * value="Military intelligence (SIGINT EAC)"/> &lt;enumeration value="Military
 * police"/> &lt;enumeration value="Ordnance"/> &lt;enumeration
 * value="Psychological Operations"/> &lt;enumeration value="Quartermaster"/>
 * &lt;enumeration value="Separate Light Infantry"/> &lt;enumeration
 * value="Signal"/> &lt;enumeration value="Space/Missile Defense"/>
 * &lt;enumeration value="Special Forces"/> &lt;enumeration value="Supply"/>
 * &lt;enumeration value="Transportation"/> &lt;enumeration value="Other"/>
 * &lt;enumeration value="Unknown"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCSR")
@XmlEnum
public enum ListCSR {

  @XmlEnumValue("AG/Band")
  AG___BAND("AG/Band"),
  @XmlEnumValue("Air Defense")
  AIR___DEFENSE("Air Defense"),
  @XmlEnumValue("Airborne Division")
  AIRBORNE___DIVISION("Airborne Division"),
  @XmlEnumValue("Airmobile")
  AIRMOBILE("Airmobile"),
  @XmlEnumValue("Armor")
  ARMOR("Armor"),
  @XmlEnumValue("Army")
  ARMY("Army"),
  @XmlEnumValue("Army Material Command")
  ARMY___MATERIAL___COMMAND("Army Material Command"),
  @XmlEnumValue("Aviation")
  AVIATION("Aviation"),
  @XmlEnumValue("Brigade Combat Team/IDIV")
  BRIGADE___COMBAT___TEAM___IDIV("Brigade Combat Team/IDIV"),
  @XmlEnumValue("Censorship")
  CENSORSHIP("Censorship"),
  @XmlEnumValue("Chaplain")
  CHAPLAIN("Chaplain"),
  @XmlEnumValue("Chemical")
  CHEMICAL("Chemical"),
  @XmlEnumValue("Civil Affairs")
  CIVIL___AFFAIRS("Civil Affairs"),
  @XmlEnumValue("Combat Service Support")
  COMBAT___SERVICE___SUPPORT("Combat Service Support"),
  @XmlEnumValue("Corps")
  CORPS("Corps"),
  @XmlEnumValue("Engineering")
  ENGINEERING("Engineering"),
  @XmlEnumValue("Field artillery")
  FIELD___ARTILLERY("Field artillery"),
  @XmlEnumValue("Finance")
  FINANCE("Finance"),
  @XmlEnumValue("General")
  GENERAL("General"),
  @XmlEnumValue("Heavy Division/Brigade")
  HEAVY___DIVISION___BRIGADE("Heavy Division/Brigade"),
  @XmlEnumValue("Infantry")
  INFANTRY("Infantry"),
  @XmlEnumValue("Judge Advocate")
  JUDGE___ADVOCATE("Judge Advocate"),
  @XmlEnumValue("Maintenance")
  MAINTENANCE("Maintenance"),
  @XmlEnumValue("Medical")
  MEDICAL("Medical"),
  @XmlEnumValue("Military Intelligence (corps and below)")
  MILITARY___INTELLIGENCE____CORPS___AND___BELOW__("Military Intelligence (corps and below)"),
  @XmlEnumValue("Military intelligence (EAC)")
  MILITARY___INTELLIGENCE____EAC__("Military intelligence (EAC)"),
  @XmlEnumValue("Military intelligence (SIGINT EAC)")
  MILITARY___INTELLIGENCE____SIGINT___EAC__("Military intelligence (SIGINT EAC)"),
  @XmlEnumValue("Military police")
  MILITARY___POLICE("Military police"),
  @XmlEnumValue("Ordnance")
  ORDNANCE("Ordnance"),
  @XmlEnumValue("Psychological Operations")
  PSYCHOLOGICAL___OPERATIONS("Psychological Operations"),
  @XmlEnumValue("Quartermaster")
  QUARTERMASTER("Quartermaster"),
  @XmlEnumValue("Separate Light Infantry")
  SEPARATE___LIGHT___INFANTRY("Separate Light Infantry"),
  @XmlEnumValue("Signal")
  SIGNAL("Signal"),
  @XmlEnumValue("Space/Missile Defense")
  SPACE___MISSILE___DEFENSE("Space/Missile Defense"),
  @XmlEnumValue("Special Forces")
  SPECIAL___FORCES("Special Forces"),
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
