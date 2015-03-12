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
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Downgrade (US) contains the downgrade security classification from one or
 * more data information sources.
 * <p>
 * Element of {@link SecurityClass}
 * <p>
 * Example:
 * <pre>
 * &lt;Downgrade&gt;
 *   &lt;DownCls&gt;C&lt;/DownCls&gt;
 *   &lt;Date&gt;1999-11-05&lt;/Date&gt;
 * &lt;/Downgrade&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Downgrade", propOrder = {
  "downcls",
  "date",
  "downgradeInfo"
})
public class Downgrade {

  /**
   * US:Downcls - Downgrading Classification (Required)
   * <p>
   * The classification level of the dataset after downgrading.
   * <p>
   * Format is L:CCL
   */
  @XmlElement(name = "Downcls", required = true)
  private TString downcls;
  /**
   * US:Date - Downgrading Date (Required)
   * <p>
   * The date of the permitted downgrading.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "Date", required = true)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * US:DowngradeInfo - Downgrading Information (Optional)
   * <p>
   * Additional downgrading information, if any.
   * <p>
   * Format is S200
   */
  @XmlElement(name = "DowngradeInfo", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS200.class)
  private TString downgradeInfo;

  /**
   * Get the classification level of the dataset after downgrading.
   * <p>
   * @return the Downcls value in a {@link TString} data type
   */
  public TString getDowncls() {
    return downcls;
  }

  /**
   * Set the classification level of the dataset after downgrading.
   * <p>
   * @param value the Downcls value in a {@link TString} data type
   */
  public void setDowncls(TString value) {
    this.downcls = value;
  }

  /**
   * Determine if the Downcls is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDowncls() {
    return (this.downcls != null ? this.downcls.isSetValue() : false);
  }

  /**
   * Get the date of the permitted downgrading.
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the date of the permitted downgrading.
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
   * Get additional downgrading information, if any.
   * <p>
   * @return the DowngradeInfo value in a {@link TString} data type
   */
  public TString getDowngradeInfo() {
    return downgradeInfo;
  }

  /**
   * Set additional downgrading information, if any.
   * <p>
   * @param value the DowngradeInfo value in a {@link TString} data type
   */
  public void setDowngradeInfo(TString value) {
    this.downgradeInfo = value;
  }

  /**
   * Determine if the DowngradeInfo is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDowngradeInfo() {
    return (this.downgradeInfo != null ? this.downgradeInfo.isSetValue() : false);
  }

  /**
   * Set the classification level of the dataset after downgrading.
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Downgrade object instance
   */
  public Downgrade withDowncls(ListCCL value) {
    setDowncls(new TString(value.value()));
    return this;
  }

  /**
   * Set the date of the permitted downgrading.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Downgrade object instance
   */
  public Downgrade withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date of the permitted downgrading.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Downgrade object instance
   */
  public Downgrade withDate(Date value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set additional downgrading information, if any.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Downgrade object instance
   */
  public Downgrade withDowngradeInfo(String value) {
    setDowngradeInfo(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Downgrade instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Downgrade {"
      + (date != null ? " date [" + date + "]" : "")
      + (downgradeInfo != null ? " downgradeInfo [" + downgradeInfo + "]" : "")
      + (downcls != null ? " downcls [" + downcls + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Downgrade} requires {@link TCalendar Date}, {@link TString Downcls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDate() && isSetDowncls();
  }

}
