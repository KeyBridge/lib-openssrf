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
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.location.Ellipse;
import us.gov.dod.standard.ssrf._3_0.location.Point;
import us.gov.dod.standard.ssrf._3_0.location.Polygon;
import us.gov.dod.standard.ssrf._3_0.metadata.LocationRef;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;

/**
 * Java class for Location complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="Location"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 * &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 * &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}AddressGrp"
 * minOccurs="0"/> &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Point"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Point" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Polygon"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Polygon" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Ellipse"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Ellipse" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="LocationRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}LocationRef" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
public class Location extends Common<Location> {

  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  @XmlElement(name = "Street", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString street;
  @XmlElement(name = "CityArea", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString cityArea;
  @XmlElement(name = "StateCounty", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString stateCounty;
  @XmlElement(name = "PostCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString postCode;
  @XmlElement(name = "Country")
  private TString country;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "Point")
  private List<Point> point;
  @XmlElement(name = "Polygon")
  private List<Polygon> polygon;
  @XmlElement(name = "Ellipse")
  private List<Ellipse> ellipse;
  @XmlElement(name = "LocationRef", nillable = true)
  private List<LocationRef> locationRef;

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return 
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value 
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return 
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value 
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return 
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value 
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the name property.
   * <p>
   * @return
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
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

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the point property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the point property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPoint().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Point> getPoint() {
    if (point == null) {
      point = new ArrayList<>();
    }
    return this.point;
  }

  public boolean isSetPoint() {
    return ((this.point != null) && (!this.point.isEmpty()));
  }

  public void unsetPoint() {
    this.point = null;
  }

  /**
   * Gets the value of the polygon property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the polygon property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPolygon().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Polygon> getPolygon() {
    if (polygon == null) {
      polygon = new ArrayList<>();
    }
    return this.polygon;
  }

  public boolean isSetPolygon() {
    return ((this.polygon != null) && (!this.polygon.isEmpty()));
  }

  public void unsetPolygon() {
    this.polygon = null;
  }

  /**
   * Gets the value of the ellipse property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the ellipse property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEllipse().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Ellipse> getEllipse() {
    if (ellipse == null) {
      ellipse = new ArrayList<>();
    }
    return this.ellipse;
  }

  public boolean isSetEllipse() {
    return ((this.ellipse != null) && (!this.ellipse.isEmpty()));
  }

  public void unsetEllipse() {
    this.ellipse = null;
  }

  /**
   * Gets the value of the locationRef property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the locationRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocationRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  public void unsetLocationRef() {
    this.locationRef = null;
  }

  public Location withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public Location withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public Location withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Location withName(String value) {
    setName(new TString(value));
    return this;
  }

  public Location withStreet(String value) {
    setStreet(new TString(value));
    return this;
  }

  public Location withCityArea(String value) {
    setCityArea(new TString(value));
    return this;
  }

  public Location withStateCounty(String value) {
    setStateCounty(new TString(value));
    return this;
  }

  public Location withPostCode(String value) {
    setPostCode(new TString(value));
    return this;
  }

  public Location withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  public Location withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Location withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Location withPoint(Point... values) {
    if (values != null) {
      getPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Location withPoint(Collection<Point> values) {
    if (values != null) {
      getPoint().addAll(values);
    }
    return this;
  }

  public Location withPolygon(Polygon... values) {
    if (values != null) {
      getPolygon().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Location withPolygon(Collection<Polygon> values) {
    if (values != null) {
      getPolygon().addAll(values);
    }
    return this;
  }

  public Location withEllipse(Ellipse... values) {
    if (values != null) {
      getEllipse().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Location withEllipse(Collection<Ellipse> values) {
    if (values != null) {
      getEllipse().addAll(values);
    }
    return this;
  }

  public Location withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Location withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

}
