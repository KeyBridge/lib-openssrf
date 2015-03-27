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
package us.gov.dod.standard.ssrf._3_1.channelplan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterBigDecimalFREQM;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ChannelFreq contains one frequency in the channel plan.
 * <p>
 * Element of {@link Channel}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelFreq", propOrder = {
  "value"
})
public class ChannelFreq extends AMetadata<ChannelFreq> {

  /**
   * A frequency in the channel plan.
   * <p>
   * Format is FREQ / UN(16,9) [0..1.0E9](MHz)
   */
  @XmlValue
  @XmlTypeValidator(type = BigDecimal.class, value = XmlAdapterBigDecimalFREQM.class)
  private BigDecimal value;

  /**
   * Get the frequency in the channel plan. (MHz)
   * <p>
   * @return a {@link BigDecimal} instance
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set the frequency in the channel plan. (MHz)
   * <p>
   * Format is FREQ / UN(16,9) [0..1.0E9](MHz)
   * <p>
   * @param value a {@link BigDecimal} instance
   */
  public void setValue(BigDecimal value) {
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
   * Set the frequency in the channel plan. (MHz)
   * <p>
   * Format is FREQ / UN(16,9) [0..1.0E9](MHz)
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current ChannelFreq object instance
   */
  public ChannelFreq withValue(Number value) {
    setValue(new BigDecimal(value.toString()));
    return this;
  }

  /**
   * Get the string representation of this ChannelFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ChannelFreq {"
           + value + super.toString()
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ChannelFreq} requires {@link ListCCL cls} and
   * {@link BigDecimal value}.
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
