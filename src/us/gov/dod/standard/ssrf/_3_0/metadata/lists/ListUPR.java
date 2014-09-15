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
 * Java class for ListUPR.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUPR"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Priority 1 Strategic Order"/> &lt;enumeration value="Priority 2 Tasked
 * Plan Execution"/> &lt;enumeration value="Priority 3 Essential Operational
 * Support"/> &lt;enumeration value="Priority 4 Training"/> &lt;enumeration
 * value="Priority 5 VIP Support"/> &lt;enumeration value="Priority 6 RDT&amp;E
 * and General"/> &lt;enumeration value="Priority 7 Miscellaneous"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUPR")
@XmlEnum
public enum ListUPR {

  @XmlEnumValue("Priority 1 Strategic Order")
  PRIORITY___1___STRATEGIC___ORDER("Priority 1 Strategic Order"),
  @XmlEnumValue("Priority 2 Tasked Plan Execution")
  PRIORITY___2___TASKED___PLAN___EXECUTION("Priority 2 Tasked Plan Execution"),
  @XmlEnumValue("Priority 3 Essential Operational Support")
  PRIORITY___3___ESSENTIAL___OPERATIONAL___SUPPORT("Priority 3 Essential Operational Support"),
  @XmlEnumValue("Priority 4 Training")
  PRIORITY___4___TRAINING("Priority 4 Training"),
  @XmlEnumValue("Priority 5 VIP Support")
  PRIORITY___5___VIP___SUPPORT("Priority 5 VIP Support"),
  @XmlEnumValue("Priority 6 RDT&E and General")
  PRIORITY___6___RDT___E___AND___GENERAL("Priority 6 RDT&E and General"),
  @XmlEnumValue("Priority 7 Miscellaneous")
  PRIORITY___7___MISCELLANEOUS("Priority 7 Miscellaneous");
  private final String value;

  ListUPR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUPR fromValue(String v) {
    for (ListUPR c : ListUPR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
