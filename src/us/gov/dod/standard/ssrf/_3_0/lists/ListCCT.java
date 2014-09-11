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
package us.gov.dod.standard.ssrf._3_0.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCCT.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCCT"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Filter"/> &lt;enumeration value="Selectivity-IF1"/> &lt;enumeration
 * value="Selectivity-IF2"/> &lt;enumeration value="Selectivity-IF3"/>
 * &lt;enumeration value="Selectivity-IF4"/> &lt;enumeration
 * value="Selectivity-IF5"/> &lt;enumeration value="Selectivity-Overall"/>
 * &lt;enumeration value="Selectivity-RF"/> &lt;enumeration value="Tx RF
 * Spectrum"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCCT")
@XmlEnum
public enum ListCCT {

  /**
   * External filter between TxRx and Antenna
   * <p>
   */
  @XmlEnumValue("Filter")
  FILTER("Filter"),
  /**
   * Receiver 1st intermediate frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-IF1")
  SELECTIVITY___IF_1("Selectivity-IF1"),
  /**
   * Receiver 2nd intermediate frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-IF2")
  SELECTIVITY___IF_2("Selectivity-IF2"),
  /**
   * Receiver 3rd intermediate frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-IF3")
  SELECTIVITY___IF_3("Selectivity-IF3"),
  /**
   * Receiver 4th intermediate frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-IF4")
  SELECTIVITY___IF_4("Selectivity-IF4"),
  /**
   * Receiver 5th intermediate frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-IF5")
  SELECTIVITY___IF_5("Selectivity-IF5"),
  /**
   * Overall Selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-Overall")
  SELECTIVITY___OVERALL("Selectivity-Overall"),
  /**
   * Receiver radio-frequency selectivity
   * <p>
   */
  @XmlEnumValue("Selectivity-RF")
  SELECTIVITY___RF("Selectivity-RF"),
  /**
   * Transmitter RF spectrum
   * <p>
   */
  @XmlEnumValue("Tx RF Spectrum")
  TX___RF___SPECTRUM("Tx RF Spectrum");
  private final String value;

  ListCCT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCT fromValue(String v) {
    for (ListCCT c : ListCCT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
