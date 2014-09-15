/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.contact;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;

/**
 * Java class for Address complex type.
 * <p>
 * This element contains the address of a Contact, Organisation or Role.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Address"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Description" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}AddressGrp"/> &lt;/sequence>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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
   * Description: Enter the title for the address; for an Organisation, it can
   * be the name of the specific Branch or office; for a Contact or a Role, it
   * can be the job title associated to the address.
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * Street: Enter the street address.
   */
  @XmlElement(name = "Street", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString street;
  /**
   * CityArea: Enter the city of the address or an operational area name.
   */
  @XmlElement(name = "CityArea", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString cityArea;
  /**
   * StateCounty: Enter the state or other sub-national political area.
   */
  @XmlElement(name = "StateCounty", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString stateCounty;
  /**
   * PostCode: Enter the zip code or postal code portion of the address.
   */
  @XmlElement(name = "PostCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString postCode;
  /**
   * Country: Enter the country or area code. Use a one to six alphabetic
   * characters representing either an official country code, a regional body, a
   * group of countries or a NATO Command.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CAO (extract only).
   */
  @XmlElement(name = "Country", required = true)
  private TString country;

  /**
   * Gets the value of the description property.
   * <p>
   * @return 
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value 
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Gets the value of the street property.
   * <p>
   * @return 
   */
  public TString getStreet() {
    return street;
  }

  /**
   * Sets the value of the street property.
   * <p>
   * @param value 
   */
  public void setStreet(TString value) {
    this.street = value;
  }

  public boolean isSetStreet() {
    return (this.street != null);
  }

  /**
   * Gets the value of the cityArea property.
   * <p>
   * @return 
   */
  public TString getCityArea() {
    return cityArea;
  }

  /**
   * Sets the value of the cityArea property.
   * <p>
   * @param value 
   */
  public void setCityArea(TString value) {
    this.cityArea = value;
  }

  public boolean isSetCityArea() {
    return (this.cityArea != null);
  }

  /**
   * Gets the value of the stateCounty property.
   * <p>
   * @return 
   */
  public TString getStateCounty() {
    return stateCounty;
  }

  /**
   * Sets the value of the stateCounty property.
   * <p>
   * @param value 
   */
  public void setStateCounty(TString value) {
    this.stateCounty = value;
  }

  public boolean isSetStateCounty() {
    return (this.stateCounty != null);
  }

  /**
   * Gets the value of the postCode property.
   * <p>
   * @return 
   */
  public TString getPostCode() {
    return postCode;
  }

  /**
   * Sets the value of the postCode property.
   * <p>
   * @param value 
   */
  public void setPostCode(TString value) {
    this.postCode = value;
  }

  public boolean isSetPostCode() {
    return (this.postCode != null);
  }

  /**
   * Gets the value of the country property.
   * <p>
   * @return
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  public Address withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public Address withStreet(String value) {
    setStreet(new TString(value));
    return this;
  }

  public Address withCityArea(String value) {
    setCityArea(new TString(value));
    return this;
  }

  public Address withStateCounty(String value) {
    setStateCounty(new TString(value));
    return this;
  }

  public Address withPostCode(String value) {
    setPostCode(new TString(value));
    return this;
  }

  public Address withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

}
