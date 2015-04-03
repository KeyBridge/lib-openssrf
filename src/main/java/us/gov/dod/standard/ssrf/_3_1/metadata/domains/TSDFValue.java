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
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterTSDFVALUE;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF TSDFValue data type.
 * <p>
 * Time Slot Duty Factor.
 * <p>
 * the time slot duty factor assigned to stations of a time division multiple
 * access (TDMA) system. It is applicable in particular to the MIDS/JTIDS
 * systems as explained in the notes below. For NATO MIDS/JTIDS assignments,
 * enter in value the time slot duty factor expressed as NNN/nn where NNN is the
 * maximum percentage of time that may be used by MIDS/JTIDS users in an
 * operational area (a circle with a 100 nautical mile (183.2 km) radius) and nn
 * is the maximum percentage of time that any individual user may be using
 * MIDS/JTIDS. Optionally, use a Remark to add any amplifying information.
 * <p>
 * Notes:
 * <p>
 * 1. A JTIDS time slot is a 0.0078125 microsecond time interval during which
 * MIDS/JTIDS messages may be transmitted or received.
 * <p>
 * 2. The 40/20 notation specifies that the total MIDS/JTIDS community will not
 * be assigned more than 40% TSDF, with no more than 20% TSDF assigned to a
 * single user. Note that 100% TSDF corresponds to a maximum pulse transmission
 * rate of 396,288 pulses per 12 second period (an average of 33,024 pulses per
 * second). The total number of pulses allowed per 12 second period is 158,515
 * for 40% TSDF and 79,257 for 20% TSDF. Using all 1536 time slots in each 12
 * second period, with 258 pulses per time slot with no contention or multinet
 * overlap conditions results in a TSDF of 100%.
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "([0-9]{1,2}|100)/[0-9]{1,2}"
 * <p>
 * pattern (S6) e.g. 40/20
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSDFValue", propOrder = {"value"})
public class TSDFValue extends AMetadata<TSDFValue> implements Comparable<TSDFValue> {

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterTSDFVALUE.class)
  protected String value;

  /**
   * Construct a new, empty TSDFValue instance.
   */
  public TSDFValue() {
  }

  /**
   * Construct a new TSDFValue instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public TSDFValue(String value) {
    this.value = value;
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value
   */
  public void setValue(String value) {
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
   * Determine if the required fields in this SSRF data type instance are set.
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

  /**
   * Get a string representation of this data wrapper value.
   * <p>
   * @return The current data value.
   */
  @Override
  public String toString() {
    return this.value;
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
    return Objects.equals(this.value, ((TSDFValue) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(TSDFValue obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
