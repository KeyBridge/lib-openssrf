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
import us.gov.dod.standard.ssrf._3_1.IntfReport;

/**
 * Enumerated values for fields using the ListUPR type.
 * <p>
 * Used in {@link IntfReport}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUPR")
@XmlEnum
public enum ListUPR {

  @XmlEnumValue("Priority 1 Strategic Order")
  PRIORITY_1_STRATEGIC_ORDER("Priority 1 Strategic Order"),
  @XmlEnumValue("Priority 2 Tasked Plan Execution")
  PRIORITY_2_TASKED_PLAN_EXECUTION("Priority 2 Tasked Plan Execution"),
  @XmlEnumValue("Priority 3 Essential Operational Support")
  PRIORITY_3_ESSENTIAL_OPERATIONAL_SUPPORT("Priority 3 Essential Operational Support"),
  @XmlEnumValue("Priority 4 Training")
  PRIORITY_4_TRAINING("Priority 4 Training"),
  @XmlEnumValue("Priority 5 VIP Support")
  PRIORITY_5_VIP_SUPPORT("Priority 5 VIP Support"),
  @XmlEnumValue("Priority 6 RDT&E and General")
  PRIORITY_6_RDT_E_AND_GENERAL("Priority 6 RDT&E and General"),
  @XmlEnumValue("Priority 7 Miscellaneous")
  PRIORITY_7_MISCELLANEOUS("Priority 7 Miscellaneous"),
  @XmlEnumValue("Other")
  OTHER("Other");
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
