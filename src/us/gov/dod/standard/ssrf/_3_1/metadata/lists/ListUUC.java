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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListUUC type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUUC")
@XmlEnum
public enum ListUUC {

  @XmlEnumValue("Wartime circuits required to be operated or to be ready for operation in Peacetime")
  WARTIME_CIRCUITS_REQUIRED_TO_BE_OPERATED_OR_TO_BE_READY_FOR_OPERATION_IN_PEACETIME("Wartime circuits required to be operated or to be ready for operation in Peacetime"),
  @XmlEnumValue("Wartime circuits that have a limited capability in peacetime for exchanging traffic between the planned terminals")
  WARTIME_CIRCUITS_THAT_HAVE_A_LIMITED_CAPABILITY_IN_PEACETIME_FOR_EXCHANGING_TRAFFIC_BETWEEN_THE_PLANNED_TERMINALS("Wartime circuits that have a limited capability in peacetime for exchanging traffic between the planned terminals"),
  @XmlEnumValue("Required for wartime only")
  REQUIRED_FOR_WARTIME_ONLY("Required for wartime only"),
  @XmlEnumValue("Required for occasional and temporary usage for training exercises or maneuver purposes")
  REQUIRED_FOR_OCCASIONAL_AND_TEMPORARY_USAGE_FOR_TRAINING_EXERCISES_OR_MANEUVER_PURPOSES("Required for occasional and temporary usage for training exercises or maneuver purposes"),
  @XmlEnumValue("Required for the deployment phase of contingency operations")
  REQUIRED_FOR_THE_DEPLOYMENT_PHASE_OF_CONTINGENCY_OPERATIONS("Required for the deployment phase of contingency operations"),
  @XmlEnumValue("Required for the employment phase of contingency operations")
  REQUIRED_FOR_THE_EMPLOYMENT_PHASE_OF_CONTINGENCY_OPERATIONS("Required for the employment phase of contingency operations"),
  @XmlEnumValue("Required for peacetime only")
  REQUIRED_FOR_PEACETIME_ONLY("Required for peacetime only"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUUC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUUC fromValue(String v) {
    for (ListUUC c : ListUUC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
