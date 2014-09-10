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
 * Java class for ListCRT.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCRT"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Coherent"/> &lt;enumeration value="Crystal"/> &lt;enumeration
 * value="Direct View Optics"/> &lt;enumeration value="Double Conversion
 * Superheterodyne"/> &lt;enumeration value="Homodyne"/> &lt;enumeration
 * value="Imaging Detector"/> &lt;enumeration value="Non-Coherent"/>
 * &lt;enumeration value="Non-Imaging Detector"/> &lt;enumeration value="Quad
 * Conversion Superheterodyne"/> &lt;enumeration value="Super Regenerative"/>
 * &lt;enumeration value="Superheterodyne"/> &lt;enumeration value="Triple
 * Conversion Superheterodyne"/> &lt;enumeration value="Tuned Radio Frequency"/>
 * &lt;enumeration value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCRT")
@XmlEnum
public enum ListCRT {

  @XmlEnumValue("Coherent")
  COHERENT("Coherent"),
  @XmlEnumValue("Crystal")
  CRYSTAL("Crystal"),
  @XmlEnumValue("Direct View Optics")
  DIRECT___VIEW___OPTICS("Direct View Optics"),
  @XmlEnumValue("Double Conversion Superheterodyne")
  DOUBLE___CONVERSION___SUPERHETERODYNE("Double Conversion Superheterodyne"),
  @XmlEnumValue("Homodyne")
  HOMODYNE("Homodyne"),
  @XmlEnumValue("Imaging Detector")
  IMAGING___DETECTOR("Imaging Detector"),
  @XmlEnumValue("Non-Coherent")
  NON___COHERENT("Non-Coherent"),
  @XmlEnumValue("Non-Imaging Detector")
  NON___IMAGING___DETECTOR("Non-Imaging Detector"),
  @XmlEnumValue("Quad Conversion Superheterodyne")
  QUAD___CONVERSION___SUPERHETERODYNE("Quad Conversion Superheterodyne"),
  @XmlEnumValue("Super Regenerative")
  SUPER___REGENERATIVE("Super Regenerative"),
  @XmlEnumValue("Superheterodyne")
  SUPERHETERODYNE("Superheterodyne"),
  @XmlEnumValue("Triple Conversion Superheterodyne")
  TRIPLE___CONVERSION___SUPERHETERODYNE("Triple Conversion Superheterodyne"),
  @XmlEnumValue("Tuned Radio Frequency")
  TUNED___RADIO___FREQUENCY("Tuned Radio Frequency"),
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
