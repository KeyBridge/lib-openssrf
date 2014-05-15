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
 * Java class for ListCFE.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCFE"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Specific Platform"/> &lt;enumeration value="Platform Class"/>
 * &lt;enumeration value="Specific Weapon"/> &lt;enumeration value="Weapon
 * Class"/> &lt;enumeration value="Unit"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCFE")
@XmlEnum
public enum ListCFE {

  @XmlEnumValue("Specific Platform")
  SPECIFIC___PLATFORM("Specific Platform"),
  @XmlEnumValue("Platform Class")
  PLATFORM___CLASS("Platform Class"),
  @XmlEnumValue("Specific Weapon")
  SPECIFIC___WEAPON("Specific Weapon"),
  @XmlEnumValue("Weapon Class")
  WEAPON___CLASS("Weapon Class"),
  @XmlEnumValue("Unit")
  UNIT("Unit");
  private final String value;

  ListCFE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCFE fromValue(String v) {
    for (ListCFE c : ListCFE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
