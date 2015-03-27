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
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.IMetadataType;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * A Numeric Integer instance with SSRF Standard Metadata Attributes. This
 * corresponds to the "xs:integer" number type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInteger")
public class TInteger extends AMetadata<TInteger> implements IMetadataType, Comparable<TInteger> {

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  protected BigInteger value;

  public TInteger(BigInteger value) {
    this.value = value;
  }

  /**
   * Construct a new TInteger instance from a Double value.
   * <p>
   * @param value the value - only the whole number value is used.
   */
  public TInteger(Number value) {
    this.value = value != null ? BigInteger.valueOf(value.longValue()) : null;
  }

  /**
   * Zero argument constructor.
   */
  public TInteger() {
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
  public BigInteger getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public void setValue(BigInteger value) {
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
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TInteger} requires {@link ListCCL cls} and {@link Integer value}
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
   * Less than.
   * <p>
   * @param value the other value
   * @return TRUE if this value is less than the other value.
   */
  public boolean lt(Double value) {
    return this.value.intValue() < value;
  }

  /**
   * Less than or Equal.
   * <p>
   * @param value the other value
   * @return TRUE if this value is less than or Equal to the other value.
   */
  public boolean ltequal(Double value) {
    return this.value.intValue() <= value;
  }

  /**
   * Greater than.
   * <p>
   * @param value the other value
   * @return TRUE if this value is Greater than the other value.
   */
  public boolean gt(Double value) {
    return this.value.intValue() > value;
  }

  /**
   * Greater than or Equal.
   * <p>
   * @param value the other value
   * @return TRUE if this value is Greater than or Equal to the other value.
   */
  public boolean gtequal(Double value) {
    return this.value.intValue() >= value;
  }

  /**
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    return value != null ? value.toString() : null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code.
   */
  @Override
  public int hashCode() {
    int hash = 3;
    hash = 79 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object
   * @return TRUE if the string values match.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((TString) obj).value);
  }

  /**
   * Comparison and sorting is based upon the value.
   * <p>
   * @param o the other object instance
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(TInteger o) {
    if (o == null) {
      return 1;
    }
    if (value == null) {
      return -1;
    }
    return value.compareTo(o.getValue());
  }//</editor-fold>

}
