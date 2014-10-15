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
package us.gov.dod.standard.ssrf._3_1.toa;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSC;

/**
 * StnClass contains the station class associated with the TOA frequency usage.
 * <p>
 * Element of {@link Allocation}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnClass", propOrder = {
  "value"
})
public class StnClass extends AMetadata<StnClass> {

  /**
   * The station class, as defined by the appropriate Administration. When
   * exchanging with NATO, only include ITU entries.
   * <p>
   * Format is L:USC.
   */
  @XmlValue
  private ListUSC value;

  /**
   * Get the station class.
   * <p>
   * @return a {@link ListUSC} instance
   */
  public ListUSC getValue() {
    return value;
  }

  /**
   * Set the station class.
   * <p>
   * @param value a {@link ListUSC} instance
   */
  public void setValue(ListUSC value) {
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
   * Set the station class.
   * <p>
   * @param value An instances of type {@link ListUSC}
   * @return The current StnClass object instance
   */
  public StnClass withValue(ListUSC value) {
    setValue(value);
    return this;
  }

  /**
   * Get the string representation of this StnClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StnClass {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StnClass} requires {@link ListCCL cls} and {@link ListUSC value}.
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
