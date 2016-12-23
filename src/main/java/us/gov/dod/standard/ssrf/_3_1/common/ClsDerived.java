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
package us.gov.dod.standard.ssrf._3_1.common;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.D;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.S30;

/**
 * ClsDerived (US) contains the derived security classification from one or more
 * data information sources.
 * <p>
 * Element of {@link SecurityClass}
 * <p>
 * Example:
 * <pre>
 * &lt;ClsDerived&gt;
 *   &lt;Date&gt;1993-08-15&lt;/Date&gt;
 *   &lt;Title&gt;B-1B SCG&lt;/Title&gt;
 *   &lt;Org&gt;OC-ALC/LAB&lt;/Org&gt;
 * &lt;/ClsDerived&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsDerived", propOrder = {
  "date",
  "title",
  "org"
})
public class ClsDerived {

  /**
   * US:Date - Derivative Classification Date (Required)
   * <p>
   * The date of the source document.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Date", required = true)
  private D date;
  /**
   * US:Title - Derivative Classification Document Title (Required)
   * <p>
   * The title of the source document.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = true)
  private S30 title;
  /**
   * US:Org - Derivative Classification Publishing Organisa (Required)
   * <p>
   * The publishing organization of the source document.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Org", required = true)
  private S30 org;

  /**
   * Get the date of the source document..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDate() {
    return date;
  }

  /**
   * Set the date of the source document..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDate(D value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDate() {
    return (this.date != null ? this.date.isSetValue() : false);
  }

  /**
   * Get the title of the source document..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getTitle() {
    return title;
  }

  /**
   * Set the title of the source document..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setTitle(S30 value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the publishing organization of the source document..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getOrg() {
    return org;
  }

  /**
   * Set the publishing organization of the source document..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setOrg(S30 value) {
    this.org = value;
  }

  /**
   * Determine if the Org is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrg() {
    return (this.org != null ? this.org.isSetValue() : false);
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current ClsDerived object instance.
   * @since 3.1.0
   */
  public ClsDerived withDate(Calendar value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current ClsDerived object instance.
   * @since 3.1.0
   */
  public ClsDerived withDate(Date value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the title of the source document.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ClsDerived object instance.
   * @since 3.1.0
   */
  public ClsDerived withTitle(String value) {
    setTitle(new S30(value));
    return this;
  }

  /**
   * Set the publishing organization of the source document.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ClsDerived object instance.
   * @since 3.1.0
   */
  public ClsDerived withOrg(String value) {
    setOrg(new S30(value));
    return this;
  }

  /**
   * Get a string representation of this ClsDerived instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ClsDerived {"
           + (date != null ? " date [" + date + "]" : "")
           + (org != null ? " org [" + org + "]" : "")
           + (title != null ? " title [" + title + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ClsDerived} requires
   * {@link D Date}, {@link S30 Org}, {@link S30 Title}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDate() && isSetOrg() && isSetTitle();
  }

}
