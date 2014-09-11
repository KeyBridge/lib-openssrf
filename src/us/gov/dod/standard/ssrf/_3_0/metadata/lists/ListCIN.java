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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCIN.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCIN"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Air"/>
 * &lt;enumeration value="Amphibious"/> &lt;enumeration value="Deep Space"/>
 * &lt;enumeration value="Handheld"/> &lt;enumeration value="Land"/>
 * &lt;enumeration value="Land Fixed"/> &lt;enumeration value="Land Mobile"/>
 * &lt;enumeration value="Manpack"/> &lt;enumeration value="Missile"/>
 * &lt;enumeration value="Non Synchronous Orbit"/> &lt;enumeration
 * value="Unmanned Aerial Vehicle (UAV)"/> &lt;enumeration value="Unmanned
 * Aircraft System (UAS)"/> &lt;enumeration value="Unmanned Ground Vehicle
 * (UGV)"/> &lt;enumeration value="Unmanned Surface Vehicle (USV)"/>
 * &lt;enumeration value="Unmanned Underwater Vehicle (UUV)"/> &lt;enumeration
 * value="Satellite"/> &lt;enumeration value="Shipboard"/> &lt;enumeration
 * value="Space"/> &lt;enumeration value="Submarine"/> &lt;enumeration
 * value="Synchronous Orbit"/> &lt;enumeration value="Transport"/>
 * &lt;enumeration value="Water"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCIN")
@XmlEnum
public enum ListCIN {

  @XmlEnumValue("Air")
  AIR("Air"),
  @XmlEnumValue("Amphibious")
  AMPHIBIOUS("Amphibious"),
  @XmlEnumValue("Deep Space")
  DEEP___SPACE("Deep Space"),
  @XmlEnumValue("Handheld")
  HANDHELD("Handheld"),
  @XmlEnumValue("Land")
  LAND("Land"),
  @XmlEnumValue("Land Fixed")
  LAND___FIXED("Land Fixed"),
  @XmlEnumValue("Land Mobile")
  LAND___MOBILE("Land Mobile"),
  @XmlEnumValue("Manpack")
  MANPACK("Manpack"),
  @XmlEnumValue("Missile")
  MISSILE("Missile"),
  @XmlEnumValue("Non Synchronous Orbit")
  NON___SYNCHRONOUS___ORBIT("Non Synchronous Orbit"),
  @XmlEnumValue("Unmanned Aerial Vehicle (UAV)")
  UNMANNED___AERIAL___VEHICLE____UAV__("Unmanned Aerial Vehicle (UAV)"),
  @XmlEnumValue("Unmanned Aircraft System (UAS)")
  UNMANNED___AIRCRAFT___SYSTEM____UAS__("Unmanned Aircraft System (UAS)"),
  @XmlEnumValue("Unmanned Ground Vehicle (UGV)")
  UNMANNED___GROUND___VEHICLE____UGV__("Unmanned Ground Vehicle (UGV)"),
  @XmlEnumValue("Unmanned Surface Vehicle (USV)")
  UNMANNED___SURFACE___VEHICLE____USV__("Unmanned Surface Vehicle (USV)"),
  @XmlEnumValue("Unmanned Underwater Vehicle (UUV)")
  UNMANNED___UNDERWATER___VEHICLE____UUV__("Unmanned Underwater Vehicle (UUV)"),
  @XmlEnumValue("Satellite")
  SATELLITE("Satellite"),
  @XmlEnumValue("Shipboard")
  SHIPBOARD("Shipboard"),
  @XmlEnumValue("Space")
  SPACE("Space"),
  @XmlEnumValue("Submarine")
  SUBMARINE("Submarine"),
  @XmlEnumValue("Synchronous Orbit")
  SYNCHRONOUS___ORBIT("Synchronous Orbit"),
  @XmlEnumValue("Transport")
  TRANSPORT("Transport"),
  @XmlEnumValue("Water")
  WATER("Water"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCIN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIN fromValue(String v) {
    for (ListCIN c : ListCIN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
