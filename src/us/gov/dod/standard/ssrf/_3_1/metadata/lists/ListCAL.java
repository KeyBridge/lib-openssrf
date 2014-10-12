/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.antenna.AntHardware;

/**
 * Enumerated values for fields using the ListCAL type.
 * <p>
 * Used in {@link AntHardware}
 * <p>
 * @author Jesse Caulfield
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
