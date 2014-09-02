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

import us.gov.dod.standard.ssrf._3_0.datatype.TS100;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAO;
import us.gov.dod.standard.ssrf._3_0.datatype.TS15;
import us.gov.dod.standard.ssrf._3_0.datatype.TS255;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Location complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}AddressGrp" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Point" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Point" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Polygon" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Polygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ellipse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Ellipse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LocationRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}LocationRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "name",
  "street",
  "cityArea",
  "stateCounty",
  "postCode",
  "country",
  "pocInformation",
  "point",
  "polygon",
  "ellipse",
  "locationRef"
})
public class Location
  extends Common {

  @XmlElementRef(name = "EffectiveDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElement(name = "Name", required = true)
  protected TS100 name;
  @XmlElementRef(name = "Street", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> street;
  @XmlElementRef(name = "CityArea", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> cityArea;
  @XmlElementRef(name = "StateCounty", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> stateCounty;
  @XmlElementRef(name = "PostCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> postCode;
  @XmlElement(name = "Country")
  protected TListCAO country;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "Point")
  protected List<Point> point;
  @XmlElement(name = "Polygon")
  protected List<Polygon> polygon;
  @XmlElement(name = "Ellipse")
  protected List<Ellipse> ellipse;
  @XmlElement(name = "LocationRef", nillable = true)
  protected List<LocationRef> locationRef;

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setEffectiveDate(JAXBElement<TD> value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(JAXBElement<TD> value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the name property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setName(TS100 value) {
    this.name = value;
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

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link POCInformation }
   * <p>
   * <p>
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Gets the value of the point property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the point property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Point }
   * <p>
   * <p>
   */
  public List<Point> getPoint() {
    if (point == null) {
      point = new ArrayList<>();
    }
    return this.point;
  }

  /**
   * Gets the value of the polygon property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the polygon property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPolygon().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Polygon }
   * <p>
   * <p>
   */
  public List<Polygon> getPolygon() {
    if (polygon == null) {
      polygon = new ArrayList<>();
    }
    return this.polygon;
  }

  /**
   * Gets the value of the ellipse property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ellipse property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEllipse().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Ellipse }
   * <p>
   * <p>
   */
  public List<Ellipse> getEllipse() {
    if (ellipse == null) {
      ellipse = new ArrayList<>();
    }
    return this.ellipse;
  }

  /**
   * Gets the value of the locationRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the locationRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocationRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link LocationRef }
   * <p>
   * <p>
   */
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

}
