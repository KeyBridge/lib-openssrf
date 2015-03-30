package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
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
 * {@link Ellipse}, {@link POCInformation}, {@link Point}, {@link Polygon}
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private D effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private D expirationDate;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * Name - Location Name (Required)
   * <p>
   * The name of the location.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S100 name;
  /**
   * Street - Street Address (Optional)
   * <p>
   * The street address.
   * <p>
   * Format is S255
   * <p>
   * Attribute group Address (Optional)
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
   * Attribute group Address (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CityArea", required = false)
  private S50 cityArea;
  /**
   * StateCounty - State/County (Optional)
   * <p>
   * The state or other sub-national political area.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Address (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StateCounty", required = false)
  private S50 stateCounty;
  /**
   * PostCode - Zip Code/Post Code (Optional)
   * <p>
   * The zip code or postal code portion of the address.
   * <p>
   * Format is S15
   * <p>
   * Attribute group Address (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostCode", required = false)
  private S15 postCode;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country")
  private TString country;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Point")
  private Set<Point> point;
  /**
   * Polygon (Optional)
   * <p>
   * Polygon is a closed geometric shape on the surface of the Earth, defined by
   * at least three points, used to describe an operational area or an excluded
   * area.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Polygon")
  private Set<Polygon> polygon;
  /**
   * Ellipse (Optional)
   * <p>
   * Ellipse on the horizontal plane, defined by its semi-major and semi-minor
   * axis, and by the orientation (azimuth) of the semi-major axis. This element
   * SHALL NOT be used to describe a satellite orbit.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Ellipse")
  private Set<Ellipse> ellipse;
  /**
   * LocationRef - Element Content (Required)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", nillable = true)
  private Set<Serial> locationRef;

  /**
   * Get the date by which the dataset is to be operational or effective..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
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
   * equipment..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the name of the location..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set the name of the location..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
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
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
   */
  public Set<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new HashSet<>();
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
   * above ground..
   * <p>
   * @return a {@link Point} instance
   * @since 3.1.0
   */
  public Set<Point> getPoint() {
    if (point == null) {
      point = new HashSet<>();
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
   * area or an excluded area..
   * <p>
   * @return a {@link Polygon} instance
   * @since 3.1.0
   */
  public Set<Polygon> getPolygon() {
    if (polygon == null) {
      polygon = new HashSet<>();
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
   * axis. This element SHALL NOT be used to describe a satellite orbit..
   * <p>
   * @return a {@link Ellipse} instance
   * @since 3.1.0
   */
  public Set<Ellipse> getEllipse() {
    if (ellipse == null) {
      ellipse = new HashSet<>();
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
   * Get the serial of the referenced Location..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public Set<Serial> getLocationRef() {
    if (locationRef == null) {
      locationRef = new HashSet<>();
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
   * @param value An instances of type {@link Calendar}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withExpirationDate(Date value) {
    setExpirationDate(new D(value));
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
   * @param value An instances of type {@link Calendar}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withReviewDate(Calendar value) {
    setReviewDate(new D(value));
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
   * @param value An instances of type {@link Date}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the name of the location.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set the street address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withStreet(String value) {
    setStreet(new S255(value));
    return this;
  }

  /**
   * Set the city of the address or an operational area name.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withCityArea(String value) {
    setCityArea(new S50(value));
    return this;
  }

  /**
   * Set the state or other sub-national political area.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withStateCounty(String value) {
    setStateCounty(new S50(value));
    return this;
  }

  /**
   * Set the zip code or postal code portion of the address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withPostCode(String value) {
    setPostCode(new S15(value));
    return this;
  }

  /**
   * Set the country or area code. Use a one to six alphabetic characters
   * representing either an official country code, a regional body, a group of
   * countries or a NATO Command.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @param values One or more instances of type {@link Point...}.
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @param values One or more instances of type {@link Polygon...}.
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @param values One or more instances of type {@link Ellipse...}.
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @return The current Location object instance.
   * @since 3.1.0
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
   * @param values One or more instances of type {@link LocationRef...}.
   * @return The current Location object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location...)} instead.
   */
  @Deprecated
  public Location withLocationRef(Serial... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Location object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location...)} instead.
   */
  @Deprecated
  public Location withLocationRef(Collection<Serial> values) {
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
           + (cityArea != null ? " cityArea [" + cityArea + "]" : "")
           + (country != null ? " country [" + country + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (ellipse != null ? " ellipse [" + ellipse + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (point != null ? " point [" + point + "]" : "")
           + (polygon != null ? " polygon [" + polygon + "]" : "")
           + (postCode != null ? " postCode [" + postCode + "]" : "")
           + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
           + (stateCounty != null ? " stateCounty [" + stateCounty + "]" : "")
           + (street != null ? " street [" + street + "]" : "")
           + "}\n  Location." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Location} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link S100 Name}.
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

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocationRef - Element Content (Required)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Location> location;

  /**
   * Get the serial of the referenced Location..
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Set<Location> getLocation() {
    if (location == null) {
      location = new HashSet<>();
    }
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null && !this.location.isEmpty();
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param values An instances of type {@link Location}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withLocation(Location... values) {
    return withLocation(Arrays.asList(values));
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param values An instances of type {@link Location}.
   * @return The current Location object instance.
   * @since 3.1.0
   */
  public Location withLocation(Collection<Location> values) {
    getLocation().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Location record.
   * <p>
   * This method builds the exported {@link #locationRef} field with values from
   * the transient {@link #location} field. This method should typically be
   * called after the Location is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.locationRef = new HashSet<>();
    for (Location instance : getLocation()) {
      this.locationRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Location record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #location} with values from the
   * imported {@link #locationRef} field. This method should typically be called
   * after the Location is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (locationRef == null || locationRef.isEmpty()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.contains(instance.getSerial())) {
        location.add(instance);
      }
    }
  }//</editor-fold>

}
