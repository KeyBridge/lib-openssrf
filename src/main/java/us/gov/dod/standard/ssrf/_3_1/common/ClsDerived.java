/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Date", required = true)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * US:Title - Derivative Classification Document Title (Required)
   * <p>
   * The title of the source document.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "Title", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString title;
  /**
   * US:Org - Derivative Classification Publishing Organisa (Required)
   * <p>
   * The publishing organization of the source document.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "Org", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString org;

  /**
   * Get the date of the source document.
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value the Date value in a {@link TCalendar} data type
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDate() {
    return (this.date != null ? this.date.isSetValue() : false);
  }

  /**
   * Get the title of the source document.
   * <p>
   * @return the Title value in a {@link TString} data type
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set the title of the source document.
   * <p>
   * @param value the Title value in a {@link TString} data type
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the publishing organization of the source document.
   * <p>
   * @return the Org value in a {@link TString} data type
   */
  public TString getOrg() {
    return org;
  }

  /**
   * Set the publishing organization of the source document.
   * <p>
   * @param value the Org value in a {@link TString} data type
   */
  public void setOrg(TString value) {
    this.org = value;
  }

  /**
   * Determine if the Org is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrg() {
    return (this.org != null ? this.org.isSetValue() : false);
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current ClsDerived object instance
   */
  public ClsDerived withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date of the source document.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current ClsDerived object instance
   */
  public ClsDerived withDate(Date value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the title of the source document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsDerived object instance
   */
  public ClsDerived withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the publishing organization of the source document.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ClsDerived object instance
   */
  public ClsDerived withOrg(String value) {
    setOrg(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this ClsDerived instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ClsDerived {"
      + (title != null ? " title [" + title + "]" : "")
      + (org != null ? " org [" + org + "]" : "")
      + (date != null ? " date [" + date + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ClsDerived} requires
   * {@link TCalendar Date}, {@link TString Org}, {@link TString Title}.
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
