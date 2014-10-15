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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringS40;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Installation identifies the specific platforms on which an equipment is
 * installed, whether it is mounted at a fixed site atop a mountain, in a
 * shelter, in a vehicle, aboard a helicopter, etc.
 * <p>
 * Element of {@link Deployment}
 * <p>
 * Example:
 * <pre>
 * &lt;Installation cls="U"&gt;C-130 aircraft&lt;/Installation&gt;
 * &lt;Installation cls="U"&gt;carried by military police&lt;/Installation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Installation", propOrder = {
  "value"
})
public class Installation extends AMetadata<Installation> {

  /**
   * A platform upon which the system is mounted. All vehicles should be
   * identified by their proper nomenclature. If the system is portable and not
   * mounted in a vehicle, the platform user should be identified.
   * <p>
   * Format is S40
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS40.class)
  private String value;

  /**
   * Get the platform upon which the system is mounted.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the platform upon which the system is mounted.
   * <p>
   * Format is S40.
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
   * Set the platform upon which the system is mounted.
   * <p>
   * Format is S40.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LocationRestriction object instance
   */
  public Installation withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get the string representation of this Installation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Installation {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Installation} requires {@link ListCCL cls} and {@link String value}.
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
