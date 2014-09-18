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
 * Java class for ListCHN.
 */
@XmlType(name = "ListCHN")
@XmlEnum
public enum ListCHN {

  /**
   * Host Nation Nominations are acceptable.
   * <p>
   */
  @XmlEnumValue("Host nominations acceptable")
  HOST_NOMINATIONS_ACCEPTABLE("Host nominations acceptable"),
  /**
   * The frequency is preassigned by NATO headquarters (NHQC3S/SC3IB).
   * <p>
   */
  @XmlEnumValue("NATO HQ-assigned")
  NATO_HQ_ASSIGNED("NATO HQ-assigned"),
  /**
   * The frequency was assigned by the NATO UHF Frequency Assignment Software
   * (NUFAS) at NHQC3S/SC3IB.
   * <p>
   */
  @XmlEnumValue("NUFAS-assigned")
  NUFAS_ASSIGNED("NUFAS-assigned"),
  /**
   * The frequency was preassigned by the user.
   * <p>
   */
  @XmlEnumValue("User-assigned")
  USER_ASSIGNED("User-assigned");
  private final String value;

  ListCHN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCHN fromValue(String v) {
    for (ListCHN c : ListCHN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
