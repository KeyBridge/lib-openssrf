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
 * Enumerated values for fields using the ListCSE type.
 * <p>
 * Used in {@link RxMode}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSE")
@XmlEnum
public enum ListCSE {

  @XmlEnumValue("Pulse Width Opposition")
  PULSE_WIDTH_OPPOSITION("Pulse Width Opposition"),
  @XmlEnumValue("Bit Error Rate")
  BIT_ERROR_RATE("Bit Error Rate"),
  @XmlEnumValue("Minimum Discernible Signal")
  MINIMUM_DISCERNIBLE_SIGNAL("Minimum Discernible Signal"),
  @XmlEnumValue("Minimum Target Recognition")
  MINIMUM_TARGET_RECOGNITION("Minimum Target Recognition"),
  SINAD("SINAD"),
  @XmlEnumValue("S/N")
  S_N("S/N"),
  @XmlEnumValue("(S+N)/N")
  __S_N__N("(S+N)/N");
  private final String value;

  ListCSE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSE fromValue(String v) {
    for (ListCSE c : ListCSE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
