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
 * Java class for ListCAP.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCAP"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S10"> &lt;enumeration
 * value="Azimuth"/> &lt;enumeration value="Elevation"/> &lt;enumeration
 * value="ELHH"/> &lt;enumeration value="ELHV"/> &lt;enumeration value="ELVH"/>
 * &lt;enumeration value="ELVV"/> &lt;enumeration value="HH"/> &lt;enumeration
 * value="HV"/> &lt;enumeration value="VH"/> &lt;enumeration value="VV"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAP")
@XmlEnum
public enum ListCAP {

  /**
   * Pattern in the horizontal plane
   * <p>
   */
  @XmlEnumValue("Azimuth")
  AZIMUTH("Azimuth"),
  /**
   * Pattern in the vertical plane
   * <p>
   */
  @XmlEnumValue("Elevation")
  ELEVATION("Elevation"),
  /**
   * Horizontal polarised port response to a horizontally polarised signal in
   * the vertical direction
   * <p>
   */
  ELHH("ELHH"),
  /**
   * Horizontal polarised port response to a vertically polarised signal in the
   * vertical direction
   * <p>
   */
  ELHV("ELHV"),
  /**
   * Vertically polarised port response to a horizontally polarised signal in
   * the vertical direction
   * <p>
   */
  ELVH("ELVH"),
  /**
   * Vertically polarised port response to a vertically polarised signal in the
   * vertical direction
   * <p>
   */
  ELVV("ELVV"),
  /**
   * Horizontal polarised port response to a horizontally polarised signal in
   * the horizontal direction
   * <p>
   */
  HH("HH"),
  /**
   * Horizontal polarised port response to a vertically polarised signal in the
   * horizontal direction
   * <p>
   */
  HV("HV"),
  /**
   * Vertically polarised port response to a horizontally polarised signal in
   * the horizontal direction
   * <p>
   */
  VH("VH"),
  /**
   * Vertically polarised port response to a vertically polarised signal in the
   * horizontal direction
   * <p>
   */
  VV("VV");
  private final String value;

  ListCAP(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAP fromValue(String v) {
    for (ListCAP c : ListCAP.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
