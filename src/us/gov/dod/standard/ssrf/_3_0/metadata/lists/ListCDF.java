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
 * Java class for ListCDF.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
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
  BI_PHASE_LEVEL("Bi-Phase-Level"),
  @XmlEnumValue("Bi-Phase-Mark")
  BI_PHASE_MARK("Bi-Phase-Mark"),
  @XmlEnumValue("Bi-Phase-Space")
  BI_PHASE_SPACE("Bi-Phase-Space"),
  @XmlEnumValue("Differential Bi-Phase-Level")
  DIFFERENTIAL_BI_PHASE_LEVEL("Differential Bi-Phase-Level"),
  @XmlEnumValue("Differential Bi-Phase-Mark")
  DIFFERENTIAL_BI_PHASE_MARK("Differential Bi-Phase-Mark"),
  @XmlEnumValue("Differential Bi-Phase-Space")
  DIFFERENTIAL_BI_PHASE_SPACE("Differential Bi-Phase-Space"),
  NRZ("NRZ"),
  @XmlEnumValue("NRZ-Mark")
  NRZ_MARK("NRZ-Mark"),
  @XmlEnumValue("NRZ-Space")
  NRZ_SPACE("NRZ-Space"),
  @XmlEnumValue("Return to Zero")
  RETURN_TO_ZERO("Return to Zero"),
  @XmlEnumValue("Split Phase (Manchester)")
  SPLIT_PHASE__MANCHESTER__("Split Phase (Manchester)"),
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
