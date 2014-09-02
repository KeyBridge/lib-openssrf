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
 * Java class for ListCRE.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCRE"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="CF299"/> &lt;enumeration value="Contact Report"/> &lt;enumeration
 * value="Contract"/> &lt;enumeration value="Data Retrofit"/> &lt;enumeration
 * value="Document"/> &lt;enumeration value="ECSA"/> &lt;enumeration
 * value="Email"/> &lt;enumeration value="Eng Report"/> &lt;enumeration
 * value="EWIR"/> &lt;enumeration value="FCC"/> &lt;enumeration value="Industry
 * Publication"/> &lt;enumeration value="Interference"/> &lt;enumeration
 * value="ITU Notification"/> &lt;enumeration value="ITU Sat"/> &lt;enumeration
 * value="Janes"/> &lt;enumeration value="JF12"/> &lt;enumeration
 * value="License"/> &lt;enumeration value="Memo"/> &lt;enumeration
 * value="MIPI"/> &lt;enumeration value="National Number"/> &lt;enumeration
 * value="Nomenclature Card"/> &lt;enumeration value="NTIA"/> &lt;enumeration
 * value="Prev Certification"/> &lt;enumeration value="SIN"/> &lt;enumeration
 * value="Standard"/> &lt;enumeration value="Technical Manual"/> &lt;enumeration
 * value="Spectrum Support Certification"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCRE")
@XmlEnum
public enum ListCRE {

  /**
   * C/F 299 Number
   * <p>
   */
  @XmlEnumValue("CF299")
  CF_299("CF299"),
  /**
   * Contact Report: A brief report of a telephone call or a site visit
   * <p>
   */
  @XmlEnumValue("Contact Report")
  CONTACT___REPORT("Contact Report"),
  /**
   * Contract Reference
   * <p>
   */
  @XmlEnumValue("Contract")
  CONTRACT("Contract"),
  /**
   * Database Retrofit
   * <p>
   */
  @XmlEnumValue("Data Retrofit")
  DATA___RETROFIT("Data Retrofit"),
  /**
   * Document in any format not otherwise covered
   * <p>
   */
  @XmlEnumValue("Document")
  DOCUMENT("Document"),
  /**
   * Equipment Characteristics / Space Archive
   * <p>
   */
  ECSA("ECSA"),
  /**
   * Electronic Mail: any email not covered in one of the other specific
   * categories, or any electronic media/transfer.
   * <p>
   */
  @XmlEnumValue("Email")
  EMAIL("Email"),
  /**
   * Engineering Report
   * <p>
   */
  @XmlEnumValue("Eng Report")
  ENG___REPORT("Eng Report"),
  /**
   * Electronic Warfare Integrated Reprogramming
   * <p>
   */
  EWIR("EWIR"),
  /**
   * Federal Communications Commission Filing: A document registered with the
   * FCC.
   * <p>
   */
  FCC("FCC"),
  /**
   * Industry Publication: any document published by a company. Frequently, they
   * are brochures or Specifications Sheets describing the capabilities of an
   * equipment or system.
   * <p>
   */
  @XmlEnumValue("Industry Publication")
  INDUSTRY___PUBLICATION("Industry Publication"),
  /**
   * Interference Report (to be used only when the interference report is not in
   * SMADEF-XML format)
   * <p>
   */
  @XmlEnumValue("Interference")
  INTERFERENCE("Interference"),
  /**
   * ITU Notification
   * <p>
   */
  @XmlEnumValue("ITU Notification")
  ITU___NOTIFICATION("ITU Notification"),
  /**
   * ITU SSG (Satellite) Filing
   * <p>
   */
  @XmlEnumValue("ITU Sat")
  ITU___SAT("ITU Sat"),
  /**
   * Janes Publications
   * <p>
   */
  @XmlEnumValue("Janes")
  JANES("Janes"),
  /**
   * J/F 12 Document
   * <p>
   */
  @XmlEnumValue("JF12")
  JF_12("JF12"),
  /**
   * General License Reference
   * <p>
   */
  @XmlEnumValue("License")
  LICENSE("License"),
  /**
   * Memorandum
   * <p>
   */
  @XmlEnumValue("Memo")
  MEMO("Memo"),
  /**
   * Multilateral Interoperability Programme Identifier
   * <p>
   */
  MIPI("MIPI"),
  /**
   * National control/request number (may be entered by any organisational
   * level)
   * <p>
   */
  @XmlEnumValue("National Number")
  NATIONAL___NUMBER("National Number"),
  /**
   * Nomenclature Card (DD FORM 61)
   * <p>
   */
  @XmlEnumValue("Nomenclature Card")
  NOMENCLATURE___CARD("Nomenclature Card"),
  /**
   * Spectrum Planning Subcommittee Number (USA code used by NTIA)
   * <p>
   */
  NTIA("NTIA"),
  /**
   * Previous Certification
   * <p>
   */
  @XmlEnumValue("Prev Certification")
  PREV___CERTIFICATION("Prev Certification"),
  /**
   * Systems ID Number (USA code used by NTIA)
   * <p>
   */
  SIN("SIN"),
  /**
   * STANAG or other Standard documentation
   * <p>
   */
  @XmlEnumValue("Standard")
  STANDARD("Standard"),
  /**
   * Technical Manual
   * <p>
   */
  @XmlEnumValue("Technical Manual")
  TECHNICAL___MANUAL("Technical Manual"),
  /**
   * Certification of Spectrum Support
   * <p>
   */
  @XmlEnumValue("Spectrum Support Certification")
  SPECTRUM___SUPPORT___CERTIFICATION("Spectrum Support Certification"),
  /**
   * Any other type not listed in this list; see remarks
   * <p>
   */
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
