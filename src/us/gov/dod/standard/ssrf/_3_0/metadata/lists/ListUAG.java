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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListUAG.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUAG"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S20"> &lt;enumeration
 * value="AFRICOM"/> &lt;enumeration value="CENTCOM"/> &lt;enumeration
 * value="EUCOM"/> &lt;enumeration value="JFCOM"/> &lt;enumeration
 * value="NORTHCOM"/> &lt;enumeration value="PACOM"/> &lt;enumeration
 * value="SOCOM"/> &lt;enumeration value="SOUTHCOM"/> &lt;enumeration
 * value="STRATCOM"/> &lt;enumeration value="TRANSCOM"/> &lt;enumeration
 * value="OTHER"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUAG")
@XmlEnum
public enum ListUAG {

  AFRICOM,
  CENTCOM,
  EUCOM,
  JFCOM,
  NORTHCOM,
  PACOM,
  SOCOM,
  SOUTHCOM,
  STRATCOM,
  TRANSCOM,
  OTHER;

  public String value() {
    return name();
  }

  public static ListUAG fromValue(String v) {
    return valueOf(v);
  }

}
