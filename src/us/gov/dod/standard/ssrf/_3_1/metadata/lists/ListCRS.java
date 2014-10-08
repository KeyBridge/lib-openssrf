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
import us.gov.dod.standard.ssrf._3_1.Antenna;

/**
 * Enumerated values for fields using the ListCRS type.
 * <p>
 * Used in {@link Antenna}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCRS")
@XmlEnum
public enum ListCRS {

  @XmlEnumValue("Boxed Slot")
  BOXED_SLOT("Boxed Slot"),
  @XmlEnumValue("Cavity")
  CAVITY("Cavity"),
  @XmlEnumValue("Clamshell")
  CLAMSHELL("Clamshell"),
  @XmlEnumValue("Cone")
  CONE("Cone"),
  @XmlEnumValue("Corner")
  CORNER("Corner"),
  @XmlEnumValue("Curved Convergent")
  CURVED_CONVERGENT("Curved Convergent"),
  @XmlEnumValue("Cylindrical")
  CYLINDRICAL("Cylindrical"),
  @XmlEnumValue("Double Corner")
  DOUBLE_CORNER("Double Corner"),
  @XmlEnumValue("Elliptical")
  ELLIPTICAL("Elliptical"),
  @XmlEnumValue("Horn")
  HORN("Horn"),
  @XmlEnumValue("Hyperbolic")
  HYPERBOLIC("Hyperbolic"),
  @XmlEnumValue("Lens")
  LENS("Lens"),
  @XmlEnumValue("Mattress")
  MATTRESS("Mattress"),
  @XmlEnumValue("Orange Peel")
  ORANGE_PEEL("Orange Peel"),
  @XmlEnumValue("Parabolic")
  PARABOLIC("Parabolic"),
  @XmlEnumValue("Parabolic Segment")
  PARABOLIC_SEGMENT("Parabolic Segment"),
  @XmlEnumValue("Parasitic")
  PARASITIC("Parasitic"),
  @XmlEnumValue("Plane")
  PLANE("Plane"),
  @XmlEnumValue("Plate")
  PLATE("Plate"),
  @XmlEnumValue("Polarized")
  POLARIZED("Polarized"),
  @XmlEnumValue("Rectangular")
  RECTANGULAR("Rectangular"),
  @XmlEnumValue("Rod")
  ROD("Rod"),
  @XmlEnumValue("Screen")
  SCREEN("Screen"),
  @XmlEnumValue("Trough")
  TROUGH("Trough"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCRS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRS fromValue(String v) {
    for (ListCRS c : ListCRS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
