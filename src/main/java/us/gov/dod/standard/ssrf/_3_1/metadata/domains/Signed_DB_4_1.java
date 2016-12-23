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

import java.math.BigDecimal;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterSIGNED_DB_4_1;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF Signed_DB_4_1 data type.
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signed_DB_4_1", propOrder = {"value"})
public class Signed_DB_4_1 extends AMetadata<Signed_DB_4_1> implements Comparable<Signed_DB_4_1> {

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterSIGNED_DB_4_1.class)
  protected BigDecimal value;

  /**
   * Construct a new, empty Signed_DB_4_1 instance.
   */
  public Signed_DB_4_1() {
  }

  /**
   * Construct a new Signed_DB_4_1 instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public Signed_DB_4_1(BigDecimal value) {
    this.value = value;
  }

  /**
   * Construct a new Signed_DB_4_1 instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public Signed_DB_4_1(Double value) {
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
   * @param value the value
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
    return this.value != null ? this.value.toString() : null;
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
    return Objects.equals(this.value, ((Signed_DB_4_1) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(Signed_DB_4_1 obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
