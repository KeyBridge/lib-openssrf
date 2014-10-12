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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringS20;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * RxModeRef references a RxMode of the receiver used in a specific
 * configuration.
 * <p>
 * Element of {@link RxRef}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxModeRef", propOrder = {
  "value"
})
public class RxModeRef extends AMetadata<RxModeRef> {

  /**
   * The unique Mode Identifier (ModeID) of a RxMode.
   * <p>
   * Format is S20
   * <p>
   * [XSL WRN RELATED] This item, with item Serial in parent element SHOULD
   * refer to an existing Receiver/RxMode in the data repository.
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS20.class)
  private String value;

  /**
   * Get the unique Mode Identifier (ModeID) of a RxMode.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the unique Mode Identifier (ModeID) of a RxMode.
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
   * Set the unique Mode Identifier (ModeID) of a RxMode.
   * <p>
   * Format is S20
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LocationRestriction object instance
   */
  public RxModeRef withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get the string representation of this RxModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxModeRef {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxModeRef} requires {@link ListCCL cls} and {@link String value}.
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
