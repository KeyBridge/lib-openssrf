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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListUUC type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
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
