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
import us.gov.dod.standard.ssrf._3_1.receiver.RxMode;

/**
 * Enumerated values for fields using the ListCRT type.
 * <p>
 * Used in {@link RxMode}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCRT")
@XmlEnum
public enum ListCRT {

  @XmlEnumValue("Coherent")
  COHERENT("Coherent"),
  @XmlEnumValue("Crystal")
  CRYSTAL("Crystal"),
  @XmlEnumValue("Direct View Optics")
  DIRECT_VIEW_OPTICS("Direct View Optics"),
  @XmlEnumValue("Double Conversion Superheterodyne")
  DOUBLE_CONVERSION_SUPERHETERODYNE("Double Conversion Superheterodyne"),
  @XmlEnumValue("Homodyne")
  HOMODYNE("Homodyne"),
  @XmlEnumValue("Imaging Detector")
  IMAGING_DETECTOR("Imaging Detector"),
  @XmlEnumValue("Non-Coherent")
  NON_COHERENT("Non-Coherent"),
  @XmlEnumValue("Non-Imaging Detector")
  NON_IMAGING_DETECTOR("Non-Imaging Detector"),
  @XmlEnumValue("Quad Conversion Superheterodyne")
  QUAD_CONVERSION_SUPERHETERODYNE("Quad Conversion Superheterodyne"),
  @XmlEnumValue("Super Regenerative")
  SUPER_REGENERATIVE("Super Regenerative"),
  @XmlEnumValue("Superheterodyne")
  SUPERHETERODYNE("Superheterodyne"),
  @XmlEnumValue("Triple Conversion Superheterodyne")
  TRIPLE_CONVERSION_SUPERHETERODYNE("Triple Conversion Superheterodyne"),
  @XmlEnumValue("Tuned Radio Frequency")
  TUNED_RADIO_FREQUENCY("Tuned Radio Frequency"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCRT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRT fromValue(String v) {
    for (ListCRT c : ListCRT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
