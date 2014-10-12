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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * HostNation indicates the host nations from which supportability is requested.
 * <p>
 * If a SSRequest received by NATO has no HostNation entry, it will be assumed
 * that this SSRequest is for all NATO Nations plus AUS and NZL (in accordance
 * with the FMSC agreement).
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Example:
 * <pre>
 * &lt;HostNation cls="U"&gt;USA&lt;/HostNation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNation", propOrder = {
  "value"
})
public class HostNation extends AMetadata<HostNation> {

  /**
   * The country code of the desired host nation. Use a one to six alphabetic
   * characters representing either an official country code, a group of
   * countries or a NATO Command.
   * <p>
   * Format is L:CAO
   */
  @XmlValue
  private ListCAO value;

  /**
   * Get a country code of the desired host nation.
   * <p>
   * @return a {@link ListCAO} instance
   */
  public ListCAO getValue() {
    return value;
  }

  /**
   * Set a country code of the desired host nation.
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
   * Set a country code of the desired host nation.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current HostNation object instance
   */
  public HostNation withValue(ListCAO value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this HostNation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "HostNation {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link HostNation} requires {@link ListCCL cls} and {@link ListCAO value}.
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
