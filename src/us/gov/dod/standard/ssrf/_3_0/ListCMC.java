/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCMC.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCMC"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Admin
 * and Special Services"/> &lt;enumeration value="Armor/Antitank"/>
 * &lt;enumeration value="Artillery /Air and Space Defense"/> &lt;enumeration
 * value="Aviation Support"/> &lt;enumeration value="Aviation/Anti-Aircraft"/>
 * &lt;enumeration value="Chemical/Ordnance"/> &lt;enumeration value="Civil
 * Affairs"/> &lt;enumeration value="Civil Air Patrol"/> &lt;enumeration
 * value="Combat Support"/> &lt;enumeration value="Communications"/>
 * &lt;enumeration value="Composite Forces"/> &lt;enumeration
 * value="Engineering"/> &lt;enumeration value="Finance"/> &lt;enumeration
 * value="Infantry"/> &lt;enumeration value="Intelligence / Psychological Ops"/>
 * &lt;enumeration value="Law enforcement / Security"/> &lt;enumeration
 * value="Maintenance"/> &lt;enumeration value="Major Command"/> &lt;enumeration
 * value="Medical/Dental"/> &lt;enumeration value="Miscellaneous"/>
 * &lt;enumeration value="Multifunction Post"/> &lt;enumeration value="Naval
 * Support"/> &lt;enumeration value="Recruiting"/> &lt;enumeration
 * value="Research and Development"/> &lt;enumeration value="Special Ops"/>
 * &lt;enumeration value="Supply"/> &lt;enumeration value="Tactical Control"/>
 * &lt;enumeration value="Task Organisation"/> &lt;enumeration
 * value="Training"/> &lt;enumeration value="Transportation / Fleet
 * Auxiliaries"/> &lt;enumeration value="Warships"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCMC")
@XmlEnum
public enum ListCMC {

  @XmlEnumValue("Admin and Special Services")
  ADMIN___AND___SPECIAL___SERVICES("Admin and Special Services"),
  @XmlEnumValue("Armor/Antitank")
  ARMOR___ANTITANK("Armor/Antitank"),
  @XmlEnumValue("Artillery /Air and Space Defense")
  ARTILLERY____AIR___AND___SPACE___DEFENSE("Artillery /Air and Space Defense"),
  @XmlEnumValue("Aviation Support")
  AVIATION___SUPPORT("Aviation Support"),
  @XmlEnumValue("Aviation/Anti-Aircraft")
  AVIATION___ANTI___AIRCRAFT("Aviation/Anti-Aircraft"),
  @XmlEnumValue("Chemical/Ordnance")
  CHEMICAL___ORDNANCE("Chemical/Ordnance"),
  @XmlEnumValue("Civil Affairs")
  CIVIL___AFFAIRS("Civil Affairs"),
  @XmlEnumValue("Civil Air Patrol")
  CIVIL___AIR___PATROL("Civil Air Patrol"),
  @XmlEnumValue("Combat Support")
  COMBAT___SUPPORT("Combat Support"),
  @XmlEnumValue("Communications")
  COMMUNICATIONS("Communications"),
  @XmlEnumValue("Composite Forces")
  COMPOSITE___FORCES("Composite Forces"),
  @XmlEnumValue("Engineering")
  ENGINEERING("Engineering"),
  @XmlEnumValue("Finance")
  FINANCE("Finance"),
  @XmlEnumValue("Infantry")
  INFANTRY("Infantry"),
  @XmlEnumValue("Intelligence / Psychological Ops")
  INTELLIGENCE_____PSYCHOLOGICAL___OPS("Intelligence / Psychological Ops"),
  @XmlEnumValue("Law enforcement / Security")
  LAW___ENFORCEMENT_____SECURITY("Law enforcement / Security"),
  @XmlEnumValue("Maintenance")
  MAINTENANCE("Maintenance"),
  @XmlEnumValue("Major Command")
  MAJOR___COMMAND("Major Command"),
  @XmlEnumValue("Medical/Dental")
  MEDICAL___DENTAL("Medical/Dental"),
  @XmlEnumValue("Miscellaneous")
  MISCELLANEOUS("Miscellaneous"),
  @XmlEnumValue("Multifunction Post")
  MULTIFUNCTION___POST("Multifunction Post"),
  @XmlEnumValue("Naval Support")
  NAVAL___SUPPORT("Naval Support"),
  @XmlEnumValue("Recruiting")
  RECRUITING("Recruiting"),
  @XmlEnumValue("Research and Development")
  RESEARCH___AND___DEVELOPMENT("Research and Development"),
  @XmlEnumValue("Special Ops")
  SPECIAL___OPS("Special Ops"),
  @XmlEnumValue("Supply")
  SUPPLY("Supply"),
  @XmlEnumValue("Tactical Control")
  TACTICAL___CONTROL("Tactical Control"),
  @XmlEnumValue("Task Organisation")
  TASK___ORGANISATION("Task Organisation"),
  @XmlEnumValue("Training")
  TRAINING("Training"),
  @XmlEnumValue("Transportation / Fleet Auxiliaries")
  TRANSPORTATION_____FLEET___AUXILIARIES("Transportation / Fleet Auxiliaries"),
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
