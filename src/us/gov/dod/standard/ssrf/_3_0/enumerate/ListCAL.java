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
 * Java class for ListCAL.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCAL"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration value="Cable
 * Air Dielectric"/> &lt;enumeration value="Cable Coaxial"/> &lt;enumeration
 * value="Cable Flexible Coaxial"/> &lt;enumeration value="Cable Rigid
 * Coaxial"/> &lt;enumeration value="Line Coplaner Strip"/> &lt;enumeration
 * value="Line Ladder"/> &lt;enumeration value="Line Microstrip"/>
 * &lt;enumeration value="Line Surface-Wave"/> &lt;enumeration value="Open
 * Wire"/> &lt;enumeration value="Twin Lead"/> &lt;enumeration
 * value="Waveguide"/> &lt;enumeration value="Waveguide Beam"/> &lt;enumeration
 * value="Waveguide Circular"/> &lt;enumeration value="Waveguide Dielectric"/>
 * &lt;enumeration value="Waveguide Elliptic"/> &lt;enumeration value="Waveguide
 * Fin-Line"/> &lt;enumeration value="Waveguide Flexible"/> &lt;enumeration
 * value="Waveguide Optic-Fiber"/> &lt;enumeration value="Waveguide
 * Rectangular"/> &lt;enumeration value="Waveguide Ridge"/> &lt;enumeration
 * value="Waveguide Semirigid"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAL")
@XmlEnum
public enum ListCAL {

  @XmlEnumValue("Cable Air Dielectric")
  CABLE___AIR___DIELECTRIC("Cable Air Dielectric"),
  @XmlEnumValue("Cable Coaxial")
  CABLE___COAXIAL("Cable Coaxial"),
  @XmlEnumValue("Cable Flexible Coaxial")
  CABLE___FLEXIBLE___COAXIAL("Cable Flexible Coaxial"),
  @XmlEnumValue("Cable Rigid Coaxial")
  CABLE___RIGID___COAXIAL("Cable Rigid Coaxial"),
  @XmlEnumValue("Line Coplaner Strip")
  LINE___COPLANER___STRIP("Line Coplaner Strip"),
  @XmlEnumValue("Line Ladder")
  LINE___LADDER("Line Ladder"),
  @XmlEnumValue("Line Microstrip")
  LINE___MICROSTRIP("Line Microstrip"),
  @XmlEnumValue("Line Surface-Wave")
  LINE___SURFACE___WAVE("Line Surface-Wave"),
  @XmlEnumValue("Open Wire")
  OPEN___WIRE("Open Wire"),
  @XmlEnumValue("Twin Lead")
  TWIN___LEAD("Twin Lead"),
  @XmlEnumValue("Waveguide")
  WAVEGUIDE("Waveguide"),
  @XmlEnumValue("Waveguide Beam")
  WAVEGUIDE___BEAM("Waveguide Beam"),
  @XmlEnumValue("Waveguide Circular")
  WAVEGUIDE___CIRCULAR("Waveguide Circular"),
  @XmlEnumValue("Waveguide Dielectric")
  WAVEGUIDE___DIELECTRIC("Waveguide Dielectric"),
  @XmlEnumValue("Waveguide Elliptic")
  WAVEGUIDE___ELLIPTIC("Waveguide Elliptic"),
  @XmlEnumValue("Waveguide Fin-Line")
  WAVEGUIDE___FIN___LINE("Waveguide Fin-Line"),
  @XmlEnumValue("Waveguide Flexible")
  WAVEGUIDE___FLEXIBLE("Waveguide Flexible"),
  @XmlEnumValue("Waveguide Optic-Fiber")
  WAVEGUIDE___OPTIC___FIBER("Waveguide Optic-Fiber"),
  @XmlEnumValue("Waveguide Rectangular")
  WAVEGUIDE___RECTANGULAR("Waveguide Rectangular"),
  @XmlEnumValue("Waveguide Ridge")
  WAVEGUIDE___RIDGE("Waveguide Ridge"),
  @XmlEnumValue("Waveguide Semirigid")
  WAVEGUIDE___SEMIRIGID("Waveguide Semirigid"),
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
