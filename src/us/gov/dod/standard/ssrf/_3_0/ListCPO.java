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
 * Java class for ListCPO.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCPO"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="45-degrees"/> &lt;enumeration value="Left-hand circular"/>
 * &lt;enumeration value="Right-hand circular"/> &lt;enumeration value="Dual"/>
 * &lt;enumeration value="Elliptical"/> &lt;enumeration value="Elliptic left"/>
 * &lt;enumeration value="Elliptic right"/> &lt;enumeration value="Horizontal
 * linear"/> &lt;enumeration value="Horizontal and vertical"/> &lt;enumeration
 * value="Linear"/> &lt;enumeration value="Mixed"/> &lt;enumeration
 * value="Oblique, angled, crossed"/> &lt;enumeration value="Rotating"/>
 * &lt;enumeration value="Right-hand slant"/> &lt;enumeration value="Left-hand
 * slant"/> &lt;enumeration value="Right and left-hand circular"/>
 * &lt;enumeration value="Vertical linear"/> &lt;enumeration value="Other or
 * unknown"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCPO")
@XmlEnum
public enum ListCPO {

  @XmlEnumValue("45-degrees")
  VALUE_1("45-degrees"),
  @XmlEnumValue("Left-hand circular")
  VALUE_2("Left-hand circular"),
  @XmlEnumValue("Right-hand circular")
  VALUE_3("Right-hand circular"),
  @XmlEnumValue("Dual")
  VALUE_4("Dual"),
  @XmlEnumValue("Elliptical")
  VALUE_5("Elliptical"),
  @XmlEnumValue("Elliptic left")
  VALUE_6("Elliptic left"),
  @XmlEnumValue("Elliptic right")
  VALUE_7("Elliptic right"),
  @XmlEnumValue("Horizontal linear")
  VALUE_8("Horizontal linear"),
  @XmlEnumValue("Horizontal and vertical")
  VALUE_9("Horizontal and vertical"),
  @XmlEnumValue("Linear")
  VALUE_10("Linear"),
  @XmlEnumValue("Mixed")
  VALUE_11("Mixed"),
  @XmlEnumValue("Oblique, angled, crossed")
  VALUE_12("Oblique, angled, crossed"),
  @XmlEnumValue("Rotating")
  VALUE_13("Rotating"),
  @XmlEnumValue("Right-hand slant")
  VALUE_14("Right-hand slant"),
  @XmlEnumValue("Left-hand slant")
  VALUE_15("Left-hand slant"),
  @XmlEnumValue("Right and left-hand circular")
  VALUE_16("Right and left-hand circular"),
  @XmlEnumValue("Vertical linear")
  VALUE_17("Vertical linear"),
  @XmlEnumValue("Other or unknown")
  VALUE_18("Other or unknown");
  private final String value;

  ListCPO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPO fromValue(String v) {
    for (ListCPO c : ListCPO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
