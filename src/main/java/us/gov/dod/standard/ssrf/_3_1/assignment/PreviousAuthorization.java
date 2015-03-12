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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Previous Authorization (US) refers to the frequency assignment's previous
 * Government Master File (GMF) authorization agency serial number.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAuthorization", propOrder = {
  "docketNum",
  "date",
  "agencySerialNum"
})
public class PreviousAuthorization {

  /**
   * US:DocketNum - Docket Number (Required)
   * <p>
   * The previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * Format is S8
   */
  @XmlElement(name = "DocketNum", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS8.class)
  private TString docketNum;
  @XmlElement(name = "Date ", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  /**
   * US:AgencySerialNum - Agency Serial Number (Optional)
   * <p>
   * The externally-assigned unique identifier of a frequency assignment.
   * <p>
   * Format is S12
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;

  /**
   * Get the previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * @return the DocketNum value in a {@link TString} data type
   */
  public TString getDocketNum() {
    return docketNum;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * @param value the DocketNum value in a {@link TString} data type
   */
  public void setDocketNum(TString value) {
    this.docketNum = value;
  }

  /**
   * Determine if the DocketNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDocketNum() {
    return (this.docketNum != null ? this.docketNum.isSetValue() : false);
  }

  /**
   * Get the previous frequency assignment Government Master File (GMF)
   * authorization date.
   * <p>
   * @return the Date value in a {@link TCalendar} data type
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date.
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
   * Get the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @return the AgencySerialNum value in a {@link TString} data type
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value the AgencySerialNum value in a {@link TString} data type
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  /**
   * Determine if the AgencySerialNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null ? this.agencySerialNum.isSetValue() : false);
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PreviousAuthorization object instance
   */
  public PreviousAuthorization withDocketNum(String value) {
    setDocketNum(new TString(value));
    return this;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current PreviousAuthorization object instance
   */
  public PreviousAuthorization withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current PreviousAuthorization object instance
   */
  public PreviousAuthorization withDate(Date value) {
    setDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PreviousAuthorization object instance
   */
  public PreviousAuthorization withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this PreviousAuthorization instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PreviousAuthorization {"
      + (agencySerialNum != null ? " agencySerialNum [" + agencySerialNum + "]" : "")
      + (docketNum != null ? " docketNum [" + docketNum + "]" : "")
      + (date != null ? " date [" + date + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PreviousAuthorization} requires {@link TString DocketNum}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDocketNum();
  }

}
