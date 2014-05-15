/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Address complex type.
 * <p>
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

  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> description;
  @XmlElementRef(name = "Street", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> street;
  @XmlElementRef(name = "CityArea", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> cityArea;
  @XmlElementRef(name = "StateCounty", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> stateCounty;
  @XmlElementRef(name = "PostCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> postCode;
  @XmlElement(name = "Country", required = true)
  protected TListCAO country;

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setDescription(JAXBElement<TS100> value) {
    this.description = value;
  }

  /**
   * Gets the value of the street property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getStreet() {
    return street;
  }

  /**
   * Sets the value of the street property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setStreet(JAXBElement<TS255> value) {
    this.street = value;
  }

  /**
   * Gets the value of the cityArea property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getCityArea() {
    return cityArea;
  }

  /**
   * Sets the value of the cityArea property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setCityArea(JAXBElement<TS50> value) {
    this.cityArea = value;
  }

  /**
   * Gets the value of the stateCounty property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getStateCounty() {
    return stateCounty;
  }

  /**
   * Sets the value of the stateCounty property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setStateCounty(JAXBElement<TS50> value) {
    this.stateCounty = value;
  }

  /**
   * Gets the value of the postCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public JAXBElement<TS15> getPostCode() {
    return postCode;
  }

  /**
   * Sets the value of the postCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setPostCode(JAXBElement<TS15> value) {
    this.postCode = value;
  }

  /**
   * Gets the value of the country property.
   * <p>
   * @return possible object is {@link TListCAO }
   * <p>
   */
  public TListCAO getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value allowed object is {@link TListCAO }
   * <p>
   */
  public void setCountry(TListCAO value) {
    this.country = value;
  }

}
