/*
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.satellite;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Satellite;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ServiceArea contains the geographic area serviced by the satellite.
 * <p>
 * Element of {@link Satellite}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceArea", propOrder = {
  "value"
})
public class ServiceArea extends AMetadata<ServiceArea> {

  /**
   * A geographic area code.
   * <p>
   * Format is L:CAO
   */
  @XmlValue
  private ListCAO value;

  /**
   * Get a geographic area code.
   * <p>
   * @return a {@link ListCAO} instance
   */
  public ListCAO getValue() {
    return value;
  }

  /**
   * Set a geographic area code.
   * <p>
   * @param value a {@link ListCAO} instance
   */
  public void setValue(ListCAO value) {
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
   * Set a geographic area code.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current ServiceArea object instance
   */
  public ServiceArea withValue(ListCAO value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this ServiceArea instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ServiceArea {"
           + value + super.toString()
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ServiceArea} requires {@link ListCCL cls} and {@link ListCAO value}.
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
