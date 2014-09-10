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
package us.gov.dod.standard.ssrf._3_0.enumerate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCCO.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCCO"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Global
 * "/> &lt;enumeration value="Eastern Hemisphere "/> &lt;enumeration
 * value="Western Hemisphere "/> &lt;enumeration value="Northern Hemisphere "/>
 * &lt;enumeration value="Southern Hemisphere "/> &lt;enumeration
 * value="North-eastern Earth Quarter "/> &lt;enumeration value="North-western
 * Earth Quarter "/> &lt;enumeration value="South-eastern Earth Quarter"/>
 * &lt;enumeration value="South-western Earth Quarter "/> &lt;enumeration
 * value="Narrow Beam"/> &lt;enumeration value="Other"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCCO")
@XmlEnum
public enum ListCCO {

  @XmlEnumValue("Global ")
  GLOBAL__("Global "),
  @XmlEnumValue("Eastern Hemisphere ")
  EASTERN___HEMISPHERE__("Eastern Hemisphere "),
  @XmlEnumValue("Western Hemisphere ")
  WESTERN___HEMISPHERE__("Western Hemisphere "),
  @XmlEnumValue("Northern Hemisphere ")
  NORTHERN___HEMISPHERE__("Northern Hemisphere "),
  @XmlEnumValue("Southern Hemisphere ")
  SOUTHERN___HEMISPHERE__("Southern Hemisphere "),
  @XmlEnumValue("North-eastern Earth Quarter ")
  NORTH___EASTERN___EARTH___QUARTER__("North-eastern Earth Quarter "),
  @XmlEnumValue("North-western Earth Quarter ")
  NORTH___WESTERN___EARTH___QUARTER__("North-western Earth Quarter "),
  @XmlEnumValue("South-eastern Earth Quarter")
  SOUTH___EASTERN___EARTH___QUARTER("South-eastern Earth Quarter"),
  @XmlEnumValue("South-western Earth Quarter ")
  SOUTH___WESTERN___EARTH___QUARTER__("South-western Earth Quarter "),
  @XmlEnumValue("Narrow Beam")
  NARROW___BEAM("Narrow Beam"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCCO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCO fromValue(String v) {
    for (ListCCO c : ListCCO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
