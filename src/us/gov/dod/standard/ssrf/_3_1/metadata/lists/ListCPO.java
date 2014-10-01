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
import us.gov.dod.standard.ssrf._3_1.IntfReport;
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.ObservedPolarisationAnalysis;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingTarget;

/**
 * Enumerated values for fields using the ListCPO type.
 * <p>
 * Used in
 * {@link AntMode}, {@link IntfReport}, {@link JammingTarget}, {@link ObservedPolarisationAnalysis}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCPO")
@XmlEnum
public enum ListCPO {

  @XmlEnumValue("45-degrees")
  DEGREES_45("45-degrees"),
  @XmlEnumValue("Left-hand circular")
  LEFT_HAND_CIRCULAR("Left-hand circular"),
  @XmlEnumValue("Right-hand circular")
  RIGHT_HAND_CIRCULAR("Right-hand circular"),
  @XmlEnumValue("Dual")
  DUAL("Dual"),
  @XmlEnumValue("Elliptical")
  ELLIPTICAL("Elliptical"),
  @XmlEnumValue("Elliptic left")
  ELLIPTIC_LEFT("Elliptic left"),
  @XmlEnumValue("Elliptic right")
  ELLIPTIC_RIGHT("Elliptic right"),
  @XmlEnumValue("Horizontal linear")
  HORIZONTAL_LINEAR("Horizontal linear"),
  @XmlEnumValue("Horizontal and vertical")
  HORIZONTAL_AND_VERTICAL("Horizontal and vertical"),
  @XmlEnumValue("Linear")
  LINEAR("Linear"),
  @XmlEnumValue("Mixed")
  MIXED("Mixed"),
  @XmlEnumValue("Oblique, angled, crossed")
  OBLIQUE_ANGLED_CROSSED("Oblique, angled, crossed"),
  @XmlEnumValue("Rotating")
  ROTATING("Rotating"),
  @XmlEnumValue("Right-hand slant")
  RIGHT_HAND_SLANT("Right-hand slant"),
  @XmlEnumValue("Left-hand slant")
  LEFT_HAND_SLANT("Left-hand slant"),
  @XmlEnumValue("Right and left-hand circular")
  RIGHT_AND_LEFT_HAND_CIRCULAR("Right and left-hand circular"),
  @XmlEnumValue("Vertical linear")
  VERTICAL_LINEAR("Vertical linear"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other");

  private final String value;

  ListCPO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPO fromValue(String v) {
    for (ListCPO c : ListCPO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
