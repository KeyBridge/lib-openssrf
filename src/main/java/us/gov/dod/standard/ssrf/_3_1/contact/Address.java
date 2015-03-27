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
package us.gov.dod.standard.ssrf._3_1.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.Role;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * Street - Street Address (Optional)
   * <p>
   * The street address.
   * <p>
   * Format is S255
   * <p>
   * Attribute group Address Information (Required)
   */
  @XmlElement(name = "Street", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS255.class)
  private TString street;
  /**
   * CityArea - City or Area (Optional)
   * <p>
   * The city of the address or an operational area name.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   */
  @XmlElement(name = "CityArea", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString cityArea;
  /**
   * StateCounty - State or County (Optional)
   * <p>
   * The state or other sub-national political area.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address Information (Required)
   */
  @XmlElement(name = "StateCounty", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString stateCounty;
  /**
   * PostCode - Zip Code or Post Code (Optional)
   * <p>
   * The zip code or postal code portion of the address.
   * <p>
   * Format is S15
   * <p>
   * Attribute group Address Information (Required)
   */
  @XmlElement(name = "PostCode", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS15.class)
  private TString postCode;
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
   */
  @XmlElement(name = "Country", required = true)
  private TString country;

  /**
   * Get the title for the address; for an Organisation, it can be the name of
   * the specific Branch or office; for a Contact or a Role, it can be the job
   * title associated to the address.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set the title for the address; for an Organisation, it can be the name of
   * the specific Branch or office; for a Contact or a Role, it can be the job
   * title associated to the address.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the street address.
   * <p>
   * @return the Street value in a {@link TString} data type
   */
  public TString getStreet() {
    return street;
  }

  /**
   * Set the street address.
   * <p>
   * @param value the Street value in a {@link TString} data type
   */
  public void setStreet(TString value) {
    this.street = value;
  }

  /**
   * Determine if the Street is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStreet() {
    return (this.street != null ? this.street.isSetValue() : false);
  }

  /**
   * Get the city of the address or an operational area name.
   * <p>
   * @return the CityArea value in a {@link TString} data type
   */
  public TString getCityArea() {
    return cityArea;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value the CityArea value in a {@link TString} data type
   */
  public void setCityArea(TString value) {
    this.cityArea = value;
  }

  /**
   * Determine if the CityArea is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCityArea() {
    return (this.cityArea != null ? this.cityArea.isSetValue() : false);
  }

  /**
   * Get the state or other sub-national political area.
   * <p>
   * @return the StateCounty value in a {@link TString} data type
   */
  public TString getStateCounty() {
    return stateCounty;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value the StateCounty value in a {@link TString} data type
   */
  public void setStateCounty(TString value) {
    this.stateCounty = value;
  }

  /**
   * Determine if the StateCounty is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStateCounty() {
    return (this.stateCounty != null ? this.stateCounty.isSetValue() : false);
  }

  /**
   * Get the zip code or postal code portion of the address.
   * <p>
   * @return the PostCode value in a {@link TString} data type
   */
  public TString getPostCode() {
    return postCode;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value the PostCode value in a {@link TString} data type
   */
  public void setPostCode(TString value) {
    this.postCode = value;
  }

  /**
   * Determine if the PostCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostCode() {
    return (this.postCode != null ? this.postCode.isSetValue() : false);
  }

  /**
   * Get the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @return the Country value in a {@link TString} data type
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value the Country value in a {@link TString} data type
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
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   */
  public Address withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the street address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   */
  public Address withStreet(String value) {
    setStreet(new TString(value));
    return this;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   */
  public Address withCityArea(String value) {
    setCityArea(new TString(value));
    return this;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   */
  public Address withStateCounty(String value) {
    setStateCounty(new TString(value));
    return this;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Address object instance
   */
  public Address withPostCode(String value) {
    setPostCode(new TString(value));
    return this;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current Address object instance
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
    return "Address {"
      + (cityArea != null ? " cityArea [" + cityArea + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (street != null ? " street [" + street + "]" : "")
      + (postCode != null ? " postCode [" + postCode + "]" : "")
      + (stateCounty != null ? " stateCounty [" + stateCounty + "]" : "")
      + (country != null ? " country [" + country + "]" : "")
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
