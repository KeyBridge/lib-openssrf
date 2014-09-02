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
 * Java class for ListCPT.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCPT">
 *   &lt;restriction base="{urn:us:gov:dod:standard:ssrf:3.0.0}S10">
 *     &lt;enumeration value="C8b"/>
 *     &lt;enumeration value="Carrier"/>
 *     &lt;enumeration value="Mean"/>
 *     &lt;enumeration value="PEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCPT")
@XmlEnum
public enum ListCPT {

  /**
   * Use this entry for the submission of space data to the ITU if the maximum
   * peak power and power density values are of type C8b.
   * <p>
   */
  @XmlEnumValue("C8b")
  C_8_B("C8b"),
  /**
   * Carrier Power
   * <p>
   */
  @XmlEnumValue("Carrier")
  CARRIER("Carrier"),
  /**
   * Mean Power
   * <p>
   */
  @XmlEnumValue("Mean")
  MEAN("Mean"),
  /**
   * Peak Envelope Power
   * <p>
   */
  PEP("PEP");
  private final String value;

  ListCPT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPT fromValue(String v) {
    for (ListCPT c : ListCPT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
