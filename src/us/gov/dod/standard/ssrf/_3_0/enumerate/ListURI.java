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
 * Java class for ListURI.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListURI"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Routine Application"/> &lt;enumeration value="Regular Application"/>
 * &lt;enumeration value="Aeronautical Assignment Group (AAG) Application"/>
 * &lt;enumeration value="Marine Assignment Group (MAG) Application"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListURI")
@XmlEnum
public enum ListURI {

  @XmlEnumValue("Routine Application")
  ROUTINE___APPLICATION("Routine Application"),
  @XmlEnumValue("Regular Application")
  REGULAR___APPLICATION("Regular Application"),
  @XmlEnumValue("Aeronautical Assignment Group (AAG) Application")
  AERONAUTICAL___ASSIGNMENT___GROUP____AAG____APPLICATION("Aeronautical Assignment Group (AAG) Application"),
  @XmlEnumValue("Marine Assignment Group (MAG) Application")
  MARINE___ASSIGNMENT___GROUP____MAG____APPLICATION("Marine Assignment Group (MAG) Application");
  private final String value;

  ListURI(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListURI fromValue(String v) {
    for (ListURI c : ListURI.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
