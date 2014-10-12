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
package us.gov.dod.standard.ssrf._3_1;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUFN;

/**
 * DetailedFunctionID (US) is the function identifier for an equipment in the
 * link of a frequency assignment or group of frequency assignments.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedFunction", propOrder = {
  "value"
})
public class DetailedFunction extends AMetadata<DetailedFunction> {

  /**
   * The function identifier for an equipment in the link of a frequency
   * assignment or group of frequency assignments.
   * <p>
   * Format is L:UFN
   */
  @XmlValue
  private ListUFN value;

  /**
   * Get a function identifier for an equipment
   * <p>
   * @return a {@link ListUFN} instance
   */
  public ListUFN getValue() {
    return value;
  }

  /**
   * Set a function identifier for an equipment
   * <p>
   * @param value a {@link ListUFN} instance
   */
  public void setValue(ListUFN value) {
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
   * Set a function identifier for an equipment
   * <p>
   * @param value An instances of type {@link ListUFN}
   * @return The current DetailedFunction object instance
   */
  public DetailedFunction withValue(ListUFN value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this DetailedFunction instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DetailedFunction {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DetailedFunction} requires {@link ListCCL cls} and
   * {@link ListUFN value}.
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
