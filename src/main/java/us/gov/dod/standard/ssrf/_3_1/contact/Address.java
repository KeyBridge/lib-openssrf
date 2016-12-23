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
package us.gov.dod.standard.ssrf._3_1.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.Role;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

/**
 * Address contains the address of a Contact, Organisation or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;Address&gt;
 *   &lt;CityArea  cls="U"&gt;Annapolis&lt;/CityArea &gt;
 *   &lt;Country  cls="U"&gt;USA&lt;/Country &gt;
 *   &lt;Description  cls="U"&gt;Engineering Services Organization&lt;/Description &gt;
 *   &lt;PostCode  cls="U"&gt;21402&lt;/PostCode &gt;
 *   &lt;StateCounty  cls="U"&gt;Maryland&lt;/StateCounty &gt;
 *   &lt;Street  cls="U"&gt;Turbot&lt;/Street &gt;
 * &lt;/Address&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
  "description",
  "street",
  "cityArea",
  "stateCounty",
  "postCode",
  "country"
})
public class Address {

  /**
   * Description - Address Title (Optional)
   * <p>
   * The title for the address; for an Organisation, it can be the name of the
   * specific Branch or office; for a Contact or a Role, it can be the job title
   * associated to the address.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S100 description;
  /**
   * Street - Street Address (Optional)
   * <p>
   * The street address.
   * <p>
   * Format is S255
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Street", required = false)
  private S255 street;
  /**
   * CityArea - City or Area (Optional)
   * <p>
   * The city of the address or an operational area name.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CityArea", required = false)
  private S50 cityArea;
  /**
   * StateCounty - State or County (Optional)
   * <p>
   * The state or other sub-national political area.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StateCounty", required = false)
  private S50 stateCounty;
  /**
   * PostCode - Zip Code or Post Code (Optional)
   * <p>
   * The zip code or postal code portion of the address.
   * <p>
   * Format is S15
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostCode", required = false)
  private S15 postCode;
  /**
   * Country - Country or Area (Required)
   * <p>
   * The country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * Format is L:CAO
   * <p>
   * Attribute group Address Information (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country", required = true)
  private TString country;

  /**
   * Get the title for the address; for an Organisation, it can be the name of
   * the specific Branch or office; for a Contact or a Role, it can be the job
   * title associated to the address..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set the title for the address; for an Organisation, it can be the name of
   * the specific Branch or office; for a Contact or a Role, it can be the job
   * title associated to the address..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setDescription(S100 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the street address..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getStreet() {
    return street;
  }

  /**
   * Set the street address..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setStreet(S255 value) {
    this.street = value;
  }

  /**
   * Determine if the Street is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStreet() {
    return (this.street != null ? this.street.isSetValue() : false);
  }

  /**
   * Get the city of the address or an operational area name..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getCityArea() {
    return cityArea;
  }

  /**
   * Set the city of the address or an operational area name..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setCityArea(S50 value) {
    this.cityArea = value;
  }

  /**
   * Determine if the CityArea is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCityArea() {
    return (this.cityArea != null ? this.cityArea.isSetValue() : false);
  }

  /**
   * Get the state or other sub-national political area..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getStateCounty() {
    return stateCounty;
  }

  /**
   * Set the state or other sub-national political area..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setStateCounty(S50 value) {
    this.stateCounty = value;
  }

  /**
   * Determine if the StateCounty is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStateCounty() {
    return (this.stateCounty != null ? this.stateCounty.isSetValue() : false);
  }

  /**
   * Get the zip code or postal code portion of the address..
   * <p>
   * @return a {@link S15} instance
   * @since 3.1.0
   */
  public S15 getPostCode() {
    return postCode;
  }

  /**
   * Set the zip code or postal code portion of the address..
   * <p>
   * @param value a {@link S15} instance
   * @since 3.1.0
   */
  public void setPostCode(S15 value) {
    this.postCode = value;
  }

  /**
   * Determine if the PostCode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostCode() {
    return (this.postCode != null ? this.postCode.isSetValue() : false);
  }

  /**
   * Get the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command..
   * <p>
   * @return the Country value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command..
   * <p>
   * @param value the Country value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return (this.country != null ? this.country.isSetValue() : false);
  }

  /**
   * Set the title for the address; for an Organisation, it can be the name of
   * the specific Branch or office; for a Contact or a Role, it can be the job
   * title associated to the address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set the street address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withStreet(String value) {
    setStreet(new S255(value));
    return this;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withCityArea(String value) {
    setCityArea(new S50(value));
    return this;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withStateCounty(String value) {
    setStateCounty(new S50(value));
    return this;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withPostCode(String value) {
    setPostCode(new S15(value));
    return this;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current Address object instance.
   * @since 3.1.0
   */
  public Address withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Address instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Address {"
           + (cityArea != null ? " cityArea [" + cityArea + "]" : "")
           + (country != null ? " country [" + country + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (postCode != null ? " postCode [" + postCode + "]" : "")
           + (stateCounty != null ? " stateCounty [" + stateCounty + "]" : "")
           + (street != null ? " street [" + street + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Address} requires {@link TString Country}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCountry();
  }

}
