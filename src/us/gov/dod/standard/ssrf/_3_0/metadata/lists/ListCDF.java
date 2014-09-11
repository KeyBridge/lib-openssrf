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
 * <p>
 * Java class for ListCDF.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCDF"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Bi-Phase-Level"/> &lt;enumeration value="Bi-Phase-Mark"/>
 * &lt;enumeration value="Bi-Phase-Space"/> &lt;enumeration value="Differential
 * Bi-Phase-Level"/> &lt;enumeration value="Differential Bi-Phase-Mark"/>
 * &lt;enumeration value="Differential Bi-Phase-Space"/> &lt;enumeration
 * value="NRZ"/> &lt;enumeration value="NRZ-Mark"/> &lt;enumeration
 * value="NRZ-Space"/> &lt;enumeration value="Return to Zero"/> &lt;enumeration
 * value="Split Phase (Manchester)"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCDF")
@XmlEnum
public enum ListCDF {

  @XmlEnumValue("Bi-Phase-Level")
  BI___PHASE___LEVEL("Bi-Phase-Level"),
  @XmlEnumValue("Bi-Phase-Mark")
  BI___PHASE___MARK("Bi-Phase-Mark"),
  @XmlEnumValue("Bi-Phase-Space")
  BI___PHASE___SPACE("Bi-Phase-Space"),
  @XmlEnumValue("Differential Bi-Phase-Level")
  DIFFERENTIAL___BI___PHASE___LEVEL("Differential Bi-Phase-Level"),
  @XmlEnumValue("Differential Bi-Phase-Mark")
  DIFFERENTIAL___BI___PHASE___MARK("Differential Bi-Phase-Mark"),
  @XmlEnumValue("Differential Bi-Phase-Space")
  DIFFERENTIAL___BI___PHASE___SPACE("Differential Bi-Phase-Space"),
  NRZ("NRZ"),
  @XmlEnumValue("NRZ-Mark")
  NRZ___MARK("NRZ-Mark"),
  @XmlEnumValue("NRZ-Space")
  NRZ___SPACE("NRZ-Space"),
  @XmlEnumValue("Return to Zero")
  RETURN___TO___ZERO("Return to Zero"),
  @XmlEnumValue("Split Phase (Manchester)")
  SPLIT___PHASE____MANCHESTER__("Split Phase (Manchester)"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCDF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDF fromValue(String v) {
    for (ListCDF c : ListCDF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
