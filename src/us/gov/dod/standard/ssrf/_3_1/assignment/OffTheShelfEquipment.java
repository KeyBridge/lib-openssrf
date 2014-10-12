/* 
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringS6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * OffTheShelfEquipment (US) defines the function of readily available
 * equipment. It is often commercial equipment that provides a compatible
 * function to DoD or government equipment.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffTheShelfEquipment", propOrder = {
  "value"
})
public class OffTheShelfEquipment extends AMetadata<OffTheShelfEquipment> {

  /**
   * A specialized type of system/equipment used in the frequency assignment, as
   * defined by the following choices: LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC,
   * or ILSGS.
   * <p>
   * Format is S6
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS6.class)
  private String value;

  /**
   * Get a specialized type of system/equipment
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a specialized type of system/equipment.
   * <p>
   * Required choices are [LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC, ILSGS]
   * <p>
   * @param value a {@link String} instance
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Set a specialized type of system/equipment.
   * <p>
   * Required choices are [LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC, ILSGS]
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LocationRestriction object instance
   */
  public OffTheShelfEquipment withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this OffTheShelfEquipment instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "OffTheShelfEquipment {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link OffTheShelfEquipment} requires {@link ListCCL cls} and
   * {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

}
