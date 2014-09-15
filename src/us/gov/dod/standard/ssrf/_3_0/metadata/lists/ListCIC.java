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
 * Java class for ListCIC.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCIC"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Airborne"/> &lt;enumeration value="Earth"/> &lt;enumeration
 * value="Fixed"/> &lt;enumeration value="Land"/> &lt;enumeration value="Land
 * Mobile"/> &lt;enumeration value="METAIDS Ground"/> &lt;enumeration
 * value="METAIDS Radar"/> &lt;enumeration value="METAIDS Radiosonde"/>
 * &lt;enumeration value="Mobile Earth-Air"/> &lt;enumeration value="Mobile
 * Earth-Land"/> &lt;enumeration value="Mobile Earth-Sea"/> &lt;enumeration
 * value="Radar-Air"/> &lt;enumeration value="Radar-Land"/> &lt;enumeration
 * value="Radar-Sea"/> &lt;enumeration value="Satellite"/> &lt;enumeration
 * value="Sea"/> &lt;enumeration value="Secondary Radar-Air"/> &lt;enumeration
 * value="Secondary Radar-Land"/> &lt;enumeration value="Secondary Radar-Sea"/>
 * &lt;enumeration value="Target"/> &lt;enumeration value="Transport"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCIC")
@XmlEnum
public enum ListCIC {

  @XmlEnumValue("Airborne")
  AIRBORNE("Airborne"),
  @XmlEnumValue("Earth")
  EARTH("Earth"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Land")
  LAND("Land"),
  @XmlEnumValue("Land Mobile")
  LAND___MOBILE("Land Mobile"),
  @XmlEnumValue("METAIDS Ground")
  METAIDS___GROUND("METAIDS Ground"),
  @XmlEnumValue("METAIDS Radar")
  METAIDS___RADAR("METAIDS Radar"),
  @XmlEnumValue("METAIDS Radiosonde")
  METAIDS___RADIOSONDE("METAIDS Radiosonde"),
  @XmlEnumValue("Mobile Earth-Air")
  MOBILE___EARTH___AIR("Mobile Earth-Air"),
  @XmlEnumValue("Mobile Earth-Land")
  MOBILE___EARTH___LAND("Mobile Earth-Land"),
  @XmlEnumValue("Mobile Earth-Sea")
  MOBILE___EARTH___SEA("Mobile Earth-Sea"),
  @XmlEnumValue("Radar-Air")
  RADAR___AIR("Radar-Air"),
  @XmlEnumValue("Radar-Land")
  RADAR___LAND("Radar-Land"),
  @XmlEnumValue("Radar-Sea")
  RADAR___SEA("Radar-Sea"),
  @XmlEnumValue("Satellite")
  SATELLITE("Satellite"),
  @XmlEnumValue("Sea")
  SEA("Sea"),
  @XmlEnumValue("Secondary Radar-Air")
  SECONDARY___RADAR___AIR("Secondary Radar-Air"),
  @XmlEnumValue("Secondary Radar-Land")
  SECONDARY___RADAR___LAND("Secondary Radar-Land"),
  @XmlEnumValue("Secondary Radar-Sea")
  SECONDARY___RADAR___SEA("Secondary Radar-Sea"),
  @XmlEnumValue("Target")
  TARGET("Target"),
  @XmlEnumValue("Transport")
  TRANSPORT("Transport");
  private final String value;

  ListCIC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIC fromValue(String v) {
    for (ListCIC c : ListCIC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
