/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
 * @author Jesse Caulfield
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
