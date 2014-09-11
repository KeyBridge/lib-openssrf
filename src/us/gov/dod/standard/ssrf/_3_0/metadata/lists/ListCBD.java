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
 * Java class for ListCBD.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCBD"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Cardioid"/> &lt;enumeration value="Cosecant Squared"/> &lt;enumeration
 * value="Elliptical"/> &lt;enumeration value="Fan"/> &lt;enumeration
 * value="Hyperbolic"/> &lt;enumeration value="Omni"/> &lt;enumeration
 * value="Pencil"/> &lt;enumeration value="Shaped Beam"/> &lt;enumeration
 * value="Single Symmetrical Lobe"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCBD")
@XmlEnum
public enum ListCBD {

  @XmlEnumValue("Cardioid")
  CARDIOID("Cardioid"),
  @XmlEnumValue("Cosecant Squared")
  COSECANT___SQUARED("Cosecant Squared"),
  @XmlEnumValue("Elliptical")
  ELLIPTICAL("Elliptical"),
  @XmlEnumValue("Fan")
  FAN("Fan"),
  @XmlEnumValue("Hyperbolic")
  HYPERBOLIC("Hyperbolic"),
  @XmlEnumValue("Omni")
  OMNI("Omni"),
  @XmlEnumValue("Pencil")
  PENCIL("Pencil"),
  @XmlEnumValue("Shaped Beam")
  SHAPED___BEAM("Shaped Beam"),
  @XmlEnumValue("Single Symmetrical Lobe")
  SINGLE___SYMMETRICAL___LOBE("Single Symmetrical Lobe"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCBD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCBD fromValue(String v) {
    for (ListCBD c : ListCBD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
