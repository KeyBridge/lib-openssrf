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
import us.gov.dod.standard.ssrf._3_1.ExternalReference;

/**
 * Enumerated values for fields using the ListCRE type.
 * <p>
 * Used in {@link ExternalReference}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCRE")
@XmlEnum
public enum ListCRE {

  @XmlEnumValue("CF299")
  CF_299("CF299"),
  @XmlEnumValue("Contact Report")
  CONTACT_REPORT("Contact Report"),
  @XmlEnumValue("Contract")
  CONTRACT("Contract"),
  @XmlEnumValue("Data Retrofit")
  DATA_RETROFIT("Data Retrofit"),
  @XmlEnumValue("Document")
  DOCUMENT("Document"),
  ECSA("ECSA"),
  @XmlEnumValue("Email")
  EMAIL("Email"),
  @XmlEnumValue("Eng Report")
  ENG_REPORT("Eng Report"),
  EWIR("EWIR"),
  FCC("FCC"),
  @XmlEnumValue("Industry Publication")
  INDUSTRY_PUBLICATION("Industry Publication"),
  @XmlEnumValue("Interference")
  INTERFERENCE("Interference"),
  @XmlEnumValue("ITU Notification")
  ITU_NOTIFICATION("ITU Notification"),
  @XmlEnumValue("ITU Sat")
  ITU_SAT("ITU Sat"),
  @XmlEnumValue("Janes")
  JANES("Janes"),
  @XmlEnumValue("JF12")
  JF_12("JF12"),
  @XmlEnumValue("License")
  LICENSE("License"),
  @XmlEnumValue("Memo")
  MEMO("Memo"),
  MIPI("MIPI"),
  @XmlEnumValue("National Number")
  NATIONAL_NUMBER("National Number"),
  @XmlEnumValue("Nomenclature Card")
  NOMENCLATURE_CARD("Nomenclature Card"),
  NTIA("NTIA"),
  @XmlEnumValue("Prev Certification")
  PREV_CERTIFICATION("Prev Certification"),
  SIN("SIN"),
  @XmlEnumValue("Standard")
  STANDARD("Standard"),
  @XmlEnumValue("Technical Manual")
  TECHNICAL_MANUAL("Technical Manual"),
  @XmlEnumValue("Spectrum Support Certification")
  SPECTRUM_SUPPORT_CERTIFICATION("Spectrum Support Certification"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCRE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCRE fromValue(String v) {
    for (ListCRE c : ListCRE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
