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
 * Java class for ListCAD.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCAD"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Directional"/> &lt;enumeration value="Non-Dir Or Omni"/>
 * &lt;enumeration value="Rotating"/> &lt;enumeration value="Sector Scan H"/>
 * &lt;enumeration value="Sector Scan V"/> &lt;enumeration value="Steerable"/>
 * &lt;enumeration value="Tracking"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAD")
@XmlEnum
public enum ListCAD {

  /**
   * The antenna radiates towards a fixed direction
   * <p>
   */
  @XmlEnumValue("Directional")
  DIRECTIONAL("Directional"),
  /**
   * Non-Directional Or Omnidirectional (the direction cannot be determined or
   * the radiation is non directional)
   * <p>
   */
  @XmlEnumValue("Non-Dir Or Omni")
  NON_DIR_OR_OMNI("Non-Dir Or Omni"),
  /**
   * The antenna rotates at a fixed rate
   * <p>
   */
  @XmlEnumValue("Rotating")
  ROTATING("Rotating"),
  /**
   * Scanning horizontally through a limited sector
   * <p>
   */
  @XmlEnumValue("Sector Scan H")
  SECTOR_SCAN_H("Sector Scan H"),
  /**
   * Scanning vertically through a limited sector
   * <p>
   */
  @XmlEnumValue("Sector Scan V")
  SECTOR_SCAN_V("Sector Scan V"),
  /**
   * Fixed direction but steerable in the reference plane
   * <p>
   */
  @XmlEnumValue("Steerable")
  STEERABLE("Steerable"),
  /**
   * Tracking that can observe a moving object
   * <p>
   */
  @XmlEnumValue("Tracking")
  TRACKING("Tracking");
  private final String value;

  ListCAD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAD fromValue(String v) {
    for (ListCAD c : ListCAD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
