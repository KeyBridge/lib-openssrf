/*
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
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
