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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterLAT;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF Latitude data type.
 * <p>
 * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
 * of the Point or center of the Ellipse. Same remarks for seconds and leading
 * zeros. enter N or S immediately following the seconds. The format is:
 * <code>ddmmss.hhH</code> (where ".hh" is optional and H = N or S).
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "(((((([0-8][0-9]))([0-5][0-9]){2})(. [0-9]{1,2})?)|900000)(N|S))|X"
 * <p>
 * Developer note: This <code>Lat</code> is an extension and replacement
 * implementation of the default <code>Lat</code> using a BigDecimal value in
 * Decimal degrees (instead of DMS-encoded string) and relying upon the
 * XmlJavaTypeAdapter for DMS translation.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/04/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lat", propOrder = {"value"})
public class Lat extends AMetadata<Lat> implements Comparable<Lat> {

  /**
   * The value property in decimal degrees.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterLAT.class)
  protected BigDecimal value;

  /**
   * Construct a new, empty Lat instance.
   */
  public Lat() {
  }

  /**
   * Construct a new Lat instance with the given initial value.
   * <p>
   * @param value The initial value in decimal degrees.
   */
  public Lat(BigDecimal value) {
    this.value = value;
  }

  /**
   * Construct a new Lat instance with the given initial value.
   * <p>
   * @param value The initial value in decimal degrees.
   */
  public Lat(Double value) {
    this.value = BigDecimal.valueOf(value);
  }

  /**
   * Construct a new Lat instance with the given initial value.
   * <p>
   * Sets the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the source of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @param value The initial value as aDMS encoded string
   * @throws Exception if the value fails to parse
   */
  public Lat(String value) throws Exception {
    this.value = (BigDecimal) new XmlAdapterLAT().unmarshal(value);
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property in decimal degrees.
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value in decimal degrees.
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
    return Objects.equals(this.value, ((Lat) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(Lat obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
