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
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedLobeAnalysis;

/**
 * Enumerated values for fields using the ListCBD type.
 * <p>
 * Used in {@link AntMode}, {@link ObservedLobeAnalysis}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCBD")
@XmlEnum
public enum ListCBD {

  @XmlEnumValue("Cardioid")
  CARDIOID("Cardioid"),
  @XmlEnumValue("Cosecant Squared")
  COSECANT_SQUARED("Cosecant Squared"),
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
  SHAPED_BEAM("Shaped Beam"),
  @XmlEnumValue("Single Symmetrical Lobe")
  SINGLE_SYMMETRICAL_LOBE("Single Symmetrical Lobe"),
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
