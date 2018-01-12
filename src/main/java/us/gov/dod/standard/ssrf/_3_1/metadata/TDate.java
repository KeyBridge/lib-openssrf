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
package us.gov.dod.standard.ssrf._3_1.metadata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterDATE;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * A Calendar instance with SSRF Standard Metadata Attributes. This corresponds
 * to the "xs:date" and "xs:dateTime" types.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDate", propOrder = {"value"})
public class TDate extends AMetadata<TDate> implements IMetadataType, Comparable<TDate> {

  /**
   * UTC. The default time zone.
   */
  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");
  /**
   * "yyyy-MM-dd". The Date pattern.
   * <p>
   * D is a date value formatted in 10 characters as YYYY-MM-DD
   * (year-month-day). This format is compliant with the W3C Recommendation on
   * XML Schema.
   */
  private static final String PATTERN = "yyyy-MM-dd";

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = Calendar.class, value = XmlAdapterDATE.class)
  protected Calendar value;

  public TDate(Calendar value) {
    setValue(value);
  }

  public TDate(Date value) {
    setValue(value);
  }

  /**
   * Zero argument constructor.
   */
  public TDate() {
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
  public Calendar getValue() {
    return (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value the date to set.
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
    this.value.setTimeZone(TIMEZONE);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value the date to set.
   */
  public final void setValue(Date value) {
    if (value != null) {
      this.value = Calendar.getInstance(TIMEZONE);
      this.value.setTime(value);
    } else {
      this.value = null;
    }
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
   * {@link Calendar} requires {@link ListCCL cls} and {@link Calendar value}
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
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    if (value != null) {
      SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
      sdf.setCalendar(value);
      return sdf.format(value.getTime());
    }
    return null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the Calendar value.
   * <p>
   * @return a unique hash code from the Calendar value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the Calendar value.
   * <p>
   * @param obj the other object to compare
   * @return TRUE if the Calendar values match exactly
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((IMetadataType) obj).getValue());
  }

  /**
   * Comparison and sorting is in REVERSE chronological order (Newest to Oldest)
   * <p>
   * @param o the other object to compare
   * @return the reverse chronological order
   */
  @Override
  public int compareTo(TDate o) {
    if (o == null) {
      return 1;
    }
    if (this.value == null) {
      return -1;
    }
    return -1 * this.value.compareTo(o.getValue());
  }//</editor-fold>
}
