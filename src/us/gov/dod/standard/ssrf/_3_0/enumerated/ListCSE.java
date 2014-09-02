/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0.enumerated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCSE.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCSE"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Pulse
 * Width Opposition"/> &lt;enumeration value="Bit Error Rate"/> &lt;enumeration
 * value="Minimum Discernable Signal"/> &lt;enumeration value="Minimum Target
 * Recognition"/> &lt;enumeration value="SINAD"/> &lt;enumeration value="S/N"/>
 * &lt;enumeration value="(S+N)/N"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCSE")
@XmlEnum
public enum ListCSE {

  /**
   * Pulse Width Opposition; value is in dB
   * <p>
   */
  @XmlEnumValue("Pulse Width Opposition")
  PULSE___WIDTH___OPPOSITION("Pulse Width Opposition"),
  /**
   * Bit Error Rate; value is a number in scientific notation
   * <p>
   */
  @XmlEnumValue("Bit Error Rate")
  BIT___ERROR___RATE("Bit Error Rate"),
  /**
   * Minimum Discernable Signal
   * <p>
   */
  @XmlEnumValue("Minimum Discernable Signal")
  MINIMUM___DISCERNABLE___SIGNAL("Minimum Discernable Signal"),
  /**
   * Minimum Target Recognition
   * <p>
   */
  @XmlEnumValue("Minimum Target Recognition")
  MINIMUM___TARGET___RECOGNITION("Minimum Target Recognition"),
  /**
   * Signal-Plus-Noise-Plus-Distortion to Noise-Plus-Distortion; value is in dB
   * <p>
   */
  SINAD("SINAD"),
  /**
   * Signal-to-Noise ratio; value is in dB
   * <p>
   */
  @XmlEnumValue("S/N")
  S___N("S/N"),
  /**
   * (Signal plus-Noise)-to-Noise ratio; value is in dB
   * <p>
   */
  @XmlEnumValue("(S+N)/N")
  __S___N____N("(S+N)/N");
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
