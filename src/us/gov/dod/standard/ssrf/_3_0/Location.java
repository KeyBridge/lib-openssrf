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
 * This element contains the parameters of a Location used to describe a
 * geographical location, polygonal or ellipse area, or a set of those. It
 * inherits attributes and sub-elements from element Common. To be meaningful, a
 * Location SHOULD contain at least one of the sub-elements Point, Polygon,
 * Ellipse or LocationRef.
 * <p>
 * [XSL ERR DSTYPE] Part 3 of the Serial reference (dataset type) MUST be "LO".
 * <p>
 * Accurate geographical location data for emitting and, to a lesser extent,
 * receiving stations is key to effective spectrum management. All transmitting
 * stations must have either a fixed location or an area of operation within
 * which authorization to emit electromagnetic energy has been obtained.
 * <p>
 * Each location and area of operation must be uniquely defined. Fixed locations
 * will be described as a point and defined by the coordinates of the antenna
 * location. An Area of Operation will be defined as a polygon with coordinates
 * for each vertex. Location datasets are included in the data repository once
 * and referenced by other datasets after the initial entry. To ensure
 * referential integrity, location datasets should not be modified or deleted if
 * one or more other datasets refer to that location.
 * <p>
 * Circular Areas of Operation and Service Volumes are not Location datasets.
 * They represent authorization information and are included under the Link
 * element of an Assignment or Allotment.
 * <ul>
 * <li> Circular Areas of Operation are defined by a fixed Location dataset and
 * a radius. </li>
 * <li>A Service Volume defines airspace within which a protected operation is
 * permitted. Service Volumes are based upon an area defined by either a polygon
 * dataset or circular area of operation with a vertical component called
 * “height”. </li>
 * </ul>
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

  /**
   * EffectiveDate: This data element indicates the date/time by which the
   * dataset is to be operational or effective, formatted as yyyy-mm-dd
   * (year-month-day).
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate: Enter the date at which the dataset will expire, formatted
   * as yyyy-mm-dd (year-month- day). The Expiration date should be less than
   * five years from current date.
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate: Enter the date by which the dataset is to be reviewed,
   * formatted as yyyy-mm-dd (year-month- day). The Review date should be less
   * than five years from the effective date. In Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Name: Enter the name of the location.
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
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
   * CAO.
   */
  @XmlElement(name = "Country")
  private TString country;
  /**
   * Data element POC contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * Data element Point contains the coordinates (WGS 84) of point(s) that
   * represent a fixed site. It contains also the terrain elevation, in metres
   * above mean sea level (MSL) of this point. If the antenna installed at this
   * point is located on a structure such as a tower or a building, the site
   * elevation is specified as the ground elevation at the base of the
   * structure.
   */
  @XmlElement(name = "Point")
  private List<Point> point;
  /**
   * A polygon is a closed geometric shape on the surface of the Earth, defined
   * by at least three points, used to describe an operational area or an
   * excluded area.
   */
  @XmlElement(name = "Polygon")
  private List<Polygon> polygon;
  /**
   * This type of Location is an ellipse on the horizontal plane, defined by its
   * semi-major and semi-minor axis, and by the orientation (azimuth) of the
   * semi-major axis.
   */
  @XmlElement(name = "Ellipse")
  private List<Ellipse> ellipse;
  /**
   * This element references a Location dataset by the serial of the referenced
   * Location.
   */
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
