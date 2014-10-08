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
import us.gov.dod.standard.ssrf._3_1.antenna.AntHardware;

/**
 * Enumerated values for fields using the ListCAL type.
 * <p>
 * Used in {@link AntHardware}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAL")
@XmlEnum
public enum ListCAL {

  @XmlEnumValue("Cable Air Dielectric")
  CABLE_AIR_DIELECTRIC("Cable Air Dielectric"),
  @XmlEnumValue("Cable Coaxial")
  CABLE_COAXIAL("Cable Coaxial"),
  @XmlEnumValue("Cable Flexible Coaxial")
  CABLE_FLEXIBLE_COAXIAL("Cable Flexible Coaxial"),
  @XmlEnumValue("Cable Rigid Coaxial")
  CABLE_RIGID_COAXIAL("Cable Rigid Coaxial"),
  @XmlEnumValue("Line Coplaner Strip")
  LINE_COPLANER_STRIP("Line Coplaner Strip"),
  @XmlEnumValue("Line Ladder")
  LINE_LADDER("Line Ladder"),
  @XmlEnumValue("Line Microstrip")
  LINE_MICROSTRIP("Line Microstrip"),
  @XmlEnumValue("Line Surface-Wave")
  LINE_SURFACE_WAVE("Line Surface-Wave"),
  @XmlEnumValue("Open Wire")
  OPEN_WIRE("Open Wire"),
  @XmlEnumValue("Twin Lead")
  TWIN_LEAD("Twin Lead"),
  @XmlEnumValue("Waveguide")
  WAVEGUIDE("Waveguide"),
  @XmlEnumValue("Waveguide Beam")
  WAVEGUIDE_BEAM("Waveguide Beam"),
  @XmlEnumValue("Waveguide Circular")
  WAVEGUIDE_CIRCULAR("Waveguide Circular"),
  @XmlEnumValue("Waveguide Dielectric")
  WAVEGUIDE_DIELECTRIC("Waveguide Dielectric"),
  @XmlEnumValue("Waveguide Elliptic")
  WAVEGUIDE_ELLIPTIC("Waveguide Elliptic"),
  @XmlEnumValue("Waveguide Fin-Line")
  WAVEGUIDE_FIN_LINE("Waveguide Fin-Line"),
  @XmlEnumValue("Waveguide Flexible")
  WAVEGUIDE_FLEXIBLE("Waveguide Flexible"),
  @XmlEnumValue("Waveguide Optic-Fiber")
  WAVEGUIDE_OPTIC_FIBER("Waveguide Optic-Fiber"),
  @XmlEnumValue("Waveguide Rectangular")
  WAVEGUIDE_RECTANGULAR("Waveguide Rectangular"),
  @XmlEnumValue("Waveguide Ridge")
  WAVEGUIDE_RIDGE("Waveguide Ridge"),
  @XmlEnumValue("Waveguide Semirigid")
  WAVEGUIDE_SEMIRIGID("Waveguide Semirigid"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCAL(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAL fromValue(String v) {
    for (ListCAL c : ListCAL.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
