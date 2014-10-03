/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.LocationRef;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.location.Ellipse;
import us.gov.dod.standard.ssrf._3_1.location.Point;
import us.gov.dod.standard.ssrf._3_1.location.Polygon;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Location is used to describe a geographical location, polygonal or ellipse
 * area, or a set of those.
 * <p>
 * Sub-Elements are
 * {@link Ellipse}, {@link LocationRef}, {@link POCInformation}, {@link Point}, {@link Polygon}
 * <p>
 * Example: A simple fixed location:
 * <pre>
 * &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:111&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Brussels National Airpt&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Point idx="1"&gt;
 *     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;TerrainElevation cls="U"&gt;50&lt;/TerrainElevation&gt;
 *   &lt;/Point&gt;
 * &lt;/Location&gt;
 * A triangle* &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:222&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Melsbroek Approach&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Polygon idx="1"&gt;
 *     &lt;PolygonPoint sequence="1"&gt;
 *       &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *     &lt;PolygonPoint sequence="2"&gt;
 *       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *     &lt;PolygonPoint sequence="3"&gt;
 *       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;504000N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *   &lt;/Polygon&gt;
 * &lt;/Location&gt;
 * A composite area with a hole (doughnut):* &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:333&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;BEL AF Training North&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Ellipse idx="1"&gt;
 *     &lt;Excluded cls="U"&gt;Yes&lt;/Excluded&gt;
 *     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;SemiMajorAxis cls="U"&gt;10&lt;/SemiMajorAxis&gt;
 *     &lt;SemiMinorAxis cls="U"&gt;10&lt;/SemiMinorAxis&gt;
 *     &lt;Azimuth cls="U"&gt;0&lt;/Azimuth&gt;
 *   &lt;/Ellipse&gt;
 *   &lt;LocationRef cls="U"&gt;BEL::LO:222&lt;/LocationRef&gt;
 * &lt;/Location&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Name - Location Name (Required)
   * <p>
   * The name of the location.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * Street - Street Address (Optional)
   * <p>
   * The street address.
   * <p>
   * Format is S255
   * <p>
   * Attribute group Address (Optional)
   */
  @XmlElement(name = "Street", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString street;
  /**
   * CityArea - City or Area (Optional)
   * <p>
   * The city of the address or an operational area name.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address (Optional)
   */
  @XmlElement(name = "CityArea", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString cityArea;
  /**
   * StateCounty - State/County (Optional)
   * <p>
   * The state or other sub-national political area.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address (Optional)
   */
  @XmlElement(name = "StateCounty", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString stateCounty;
  /**
   * PostCode - Zip Code/Post Code (Optional)
   * <p>
   * The zip code or postal code portion of the address.
   * <p>
   * Format is S15
   * <p>
   * Attribute group Address (Optional)
   */
  @XmlElement(name = "PostCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString postCode;
  /**
   * Country - Country/Area (Optional)
   * <p>
   * The country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * Format is L:CAO
   * <p>
   * Attribute group Address (Optional)
   */
  @XmlElement(name = "Country")
  private TString country;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * AntFeedpointHeight - Antenna Feedpoint Height (Optional)
   * <p>
   * The antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "Point")
  private List<Point> point;
  /**
   * Polygon (Optional)
   * <p>
   * Polygon is a closed geometric shape on the surface of the Earth, defined by
   * at least three points, used to describe an operational area or an excluded
   * area.
   */
  @XmlElement(name = "Polygon")
  private List<Polygon> polygon;
  /**
   * Ellipse (Optional)
   * <p>
   * Ellipse on the horizontal plane, defined by its semi-major and semi-minor
   * axis, and by the orientation (azimuth) of the semi-major axis. This element
   * SHALL NOT be used to describe a satellite orbit.
   */
  @XmlElement(name = "Ellipse")
  private List<Ellipse> ellipse;
  /**
   * LocationRef - Element Content (Required)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LocationRef", nillable = true)
  private List<LocationRef> locationRef;

  private Location() {
  }

  public static Location getInstance() {
    return new Location()
      .withSerial(TSerial.getInstance(Location.class))
      .withEffectiveDate(Calendar.getInstance());
  }

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TCalendar} data type
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the name of the location.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of the location.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
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
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a {@link List<POCInformation>} instance
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @return a {@link List<Point>} instance
   */
  public List<Point> getPoint() {
    if (point == null) {
      point = new ArrayList<>();
    }
    return this.point;
  }

  /**
   * Determine if the Point is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPoint() {
    return ((this.point != null) && (!this.point.isEmpty()));
  }

  /**
   * Clear the Point field. This sets the field to null.
   */
  public void unsetPoint() {
    this.point = null;
  }

  /**
   * Get the Polygon
   * <p>
   * Complex element Polygon is a closed geometric shape on the surface of the
   * Earth, defined by at least three points, used to describe an operational
   * area or an excluded area.
   * <p>
   * @return a {@link List<Polygon>} instance
   */
  public List<Polygon> getPolygon() {
    if (polygon == null) {
      polygon = new ArrayList<>();
    }
    return this.polygon;
  }

  /**
   * Determine if the Polygon is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolygon() {
    return ((this.polygon != null) && (!this.polygon.isEmpty()));
  }

  /**
   * Clear the Polygon field. This sets the field to null.
   */
  public void unsetPolygon() {
    this.polygon = null;
  }

  /**
   * Get the Ellipse
   * <p>
   * Complex element Ellipse on the horizontal plane, defined by its semi-major
   * and semi-minor axis, and by the orientation (azimuth) of the semi-major
   * axis. This element SHALL NOT be used to describe a satellite orbit.
   * <p>
   * @return a {@link List<Ellipse>} instance
   */
  public List<Ellipse> getEllipse() {
    if (ellipse == null) {
      ellipse = new ArrayList<>();
    }
    return this.ellipse;
  }

  /**
   * Determine if the Ellipse is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEllipse() {
    return ((this.ellipse != null) && (!this.ellipse.isEmpty()));
  }

  /**
   * Clear the Ellipse field. This sets the field to null.
   */
  public void unsetEllipse() {
    this.ellipse = null;
  }

  /**
   * Get the serial of the referenced Location.
   * <p>
   * @return a {@link List<LocationRef>} instance
   */
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  /**
   * Clear the LocationRef field. This sets the field to null.
   */
  public void unsetLocationRef() {
    this.locationRef = null;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Location object instance
   */
  public Location withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Location object instance
   */
  public Location withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Location object instance
   */
  public Location withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the name of the location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   */
  public Location withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the street address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   */
  public Location withStreet(String value) {
    setStreet(new TString(value));
    return this;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   */
  public Location withCityArea(String value) {
    setCityArea(new TString(value));
    return this;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   */
  public Location withStateCounty(String value) {
    setStateCounty(new TString(value));
    return this;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   */
  public Location withPostCode(String value) {
    setPostCode(new TString(value));
    return this;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current Location object instance
   */
  public Location withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}
   * @return The current Location object instance
   */
  public Location withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current Location object instance
   */
  public Location withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param values One or more instances of type {@link Point...}
   * @return The current Location object instance
   */
  public Location withPoint(Point... values) {
    if (values != null) {
      getPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param values A collection of {@link Point} instances
   * @return The current Location object instance
   */
  public Location withPoint(Collection<Point> values) {
    if (values != null) {
      getPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the Polygon
   * <p>
   * Complex element Polygon is a closed geometric shape on the surface of the
   * Earth, defined by at least three points, used to describe an operational
   * area or an excluded area.
   * <p>
   * @param values One or more instances of type {@link Polygon...}
   * @return The current Location object instance
   */
  public Location withPolygon(Polygon... values) {
    if (values != null) {
      getPolygon().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Polygon
   * <p>
   * Complex element Polygon is a closed geometric shape on the surface of the
   * Earth, defined by at least three points, used to describe an operational
   * area or an excluded area.
   * <p>
   * @param values A collection of {@link Polygon} instances
   * @return The current Location object instance
   */
  public Location withPolygon(Collection<Polygon> values) {
    if (values != null) {
      getPolygon().addAll(values);
    }
    return this;
  }

  /**
   * Set the Ellipse
   * <p>
   * Complex element Ellipse on the horizontal plane, defined by its semi-major
   * and semi-minor axis, and by the orientation (azimuth) of the semi-major
   * axis. This element SHALL NOT be used to describe a satellite orbit.
   * <p>
   * @param values One or more instances of type {@link Ellipse...}
   * @return The current Location object instance
   */
  public Location withEllipse(Ellipse... values) {
    if (values != null) {
      getEllipse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Ellipse
   * <p>
   * Complex element Ellipse on the horizontal plane, defined by its semi-major
   * and semi-minor axis, and by the orientation (azimuth) of the semi-major
   * axis. This element SHALL NOT be used to describe a satellite orbit.
   * <p>
   * @param values A collection of {@link Ellipse} instances
   * @return The current Location object instance
   */
  public Location withEllipse(Collection<Ellipse> values) {
    if (values != null) {
      getEllipse().addAll(values);
    }
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current Location object instance
   */
  public Location withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current Location object instance
   */
  public Location withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Location instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Location {"
      + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
      + " ellipse [" + ellipse + "]"
      + " expirationDate [" + expirationDate + "]"
      + " pocInformation [" + pocInformation + "]"
      + " street [" + street + "]"
      + " postCode [" + postCode + "]"
      + " reviewDate [" + reviewDate + "]"
      + " country [" + country + "]"
      + " polygon [" + polygon + "]"
      + " point [" + point + "]"
      + " cityArea [" + cityArea + "]"
      + " name [" + name + "]"
      + " stateCounty [" + stateCounty + "]"
      + " effectiveDate [" + effectiveDate + "]"
      + "\n  "
      + super.toString()
      + " }";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Location} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetName();
  }

}
