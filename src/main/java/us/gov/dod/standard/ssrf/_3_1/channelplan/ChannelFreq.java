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
package us.gov.dod.standard.ssrf._3_1.channelplan;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterFREQM;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ChannelFreq contains one frequency in the channel plan.
 * <p>
 * Element of {@link Channel}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelFreq", propOrder = {"value"})
public class ChannelFreq extends AMetadata<ChannelFreq> implements Comparable<ChannelFreq> {

  /**
   * The value property; one frequency in the channel plan.
   * <p>
   * Format is UN(16,9) [0..1.0E9](MHz)
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterFREQM.class)
  protected BigDecimal value;

  /**
   * Construct a new, empty ChannelFreq instance.
   */
  public ChannelFreq() {
  }

  /**
   * Construct a new ChannelFreq instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public ChannelFreq(BigDecimal value) {
    this.value = value;
  }

  /**
   * Construct a new ChannelFreq instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public ChannelFreq(Double value) {
    this.value = BigDecimal.valueOf(value);
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Determine if the value property is configured.
   * <p>
   * @return TRUE if the value is set, FALSE if the value is null
   */
  public boolean isSetValue() {
    return this.value != null;
  }

  /**
   * Set the frequency in the channel plan. (MHz)
   * <p>
   * Format is FREQ / UN(16,9) [0..1.0E9](MHz)
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current ChannelFreq object instance
   */
  public ChannelFreq withValue(BigDecimal value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this data wrapper value.
   * <p>
   * @return The current data value.
   */
  @Override
  public String toString() {
    return this.value != null ? new DecimalFormat("###.###").format(this.value.doubleValue()) : null;
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

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code from the value.
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object to compare.
   * @return TRUE if the values match exactly.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((ChannelFreq) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(ChannelFreq obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>

}
