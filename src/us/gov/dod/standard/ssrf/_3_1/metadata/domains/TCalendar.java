/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * A Calendar instance with SSRF Standard Metadata Attributes. This corresponds
 * to the "xs:date" and "xs:dateTime" types.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCalendar")
public class TCalendar extends AMetadata<TCalendar> implements IMetadataType, Comparable<TCalendar> {

  /**
   * UTC. The default time zone.
   */
  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");
  /**
   * "yyyy-MM-dd'T'HH:mm:ss.SSSZ". The default DATETIME pattern.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  protected Calendar value;

  public TCalendar(Calendar value) {
    setValue(value);
  }

  public TCalendar(Date value) {
    setValue(value);
  }

  /**
   * Zero argument constructor.
   */
  public TCalendar() {
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
   * @param value
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
    this.value.setTimeZone(TIMEZONE);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
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
   * {@link TCalendar} requires {@link ListCCL cls} and {@link Calendar value}
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
      return sdf.format(value.getTime()) + " " + super.toString();
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
    return Objects.equals(this.value, ((TCalendar) obj).getValue());
  }

  /**
   * Comparison and sorting is in REVERSE chronological order (Newest to Oldest)
   * <p>
   * @param o the other object to compare
   * @return the reverse chronological order
   */
  @Override
  public int compareTo(TCalendar o) {
    if (o == null) {
      return 1;
    }
    if (this.value == null) {
      return -1;
    }
    return -1 * this.value.compareTo(o.getValue());
  }//</editor-fold>
}
