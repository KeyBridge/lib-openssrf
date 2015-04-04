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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterLON;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF Longitude data type.
 * <p>
 * The geographical longitude (degrees, minutes, seconds, and hemisphere E or W)
 * of the Point or center of the Ellipse. If the seconds are not known, use 00,
 * except in the case of navigation aid systems, geostationary satellites, and
 * microwave facilities where seconds are required. Use leading zeros as
 * appropriate for degrees, minutes, or seconds. Degrees longitude require three
 * digits. Seconds may have a decimal point followed by up to two decimals.
 * enter E or W immediately following the seconds. The format is: dddmmss.hhH
 * (where ".hh" is optional and H = E or W).
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "((((((0[0-9]{2})|(1[0-7][0-9]))
 * ([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
 * <p>
 * Developer note: This <code>Lon</code> is an extension and replacement
 * implementation of the default <code>Lon</code> using a BigDecimal value in
 * Decimal degrees (instead of DMS-encoded string) and relying upon the
 * XmlJavaTypeAdapter for DMS translation.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/04/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lon", propOrder = {"value"})
public class Lon extends AMetadata<Lon> implements Comparable<Lon> {

  /**
   * The value property in decimal degrees.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterLON.class)
  protected BigDecimal value;

  /**
   * Construct a new, empty Lon instance.
   */
  public Lon() {
  }

  /**
   * Construct a new Lon instance with the given initial value.
   * <p>
   * @param value The initial value in decimal degrees.
   */
  public Lon(BigDecimal value) {
    this.value = value;
  }

  /**
   * Construct a new Lon instance with the given initial value.
   * <p>
   * @param value The initial value in decimal degrees.
   */
  public Lon(Double value) {
    this.value = BigDecimal.valueOf(value);
  }

  /**
   * Construct a new Lon instance with the given initial value.
   * <p>
   * Sets the geographical longitude (degrees, minutes, seconds, and hemisphere
   * E or W) of the source of the interference. If the seconds are not known,
   * use 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @param value The initial value as a string encoded DMS value.
   * @throws Exception if the value fails to parse
   */
  public Lon(String value) throws Exception {
    this.value = (BigDecimal) new XmlAdapterLON().unmarshal(value);
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
    return Objects.equals(this.value, ((Lon) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(Lon obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
