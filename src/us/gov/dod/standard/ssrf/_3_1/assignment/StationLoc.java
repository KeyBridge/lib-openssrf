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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * StationLoc (US) provides detailed location information associated with one or
 * more Satellites or Location datasets associated with a specific Station.
 * <p>
 * Element of {@link Station}
 * <p>
 * Example:
 * <pre>
 * &lt;StationLoc&gt;
 *   &lt;LocationExcluded  cls="U"&gt;Yes&lt;/LocationExcluded &gt;
 *   &lt;LocationRadius  cls="U"&gt;458&lt;/LocationRadius &gt;
 *   &lt;LocSatRef cls="U"&gt;GBR::SA:123&lt;/LocSatRef&gt;
 *   &lt;ServiceVolumeHeight  cls="U"&gt;5000&lt;/ServiceVolumeHeight &gt;
 *   &lt;ServiceVolumeLocRef  cls="U"&gt;GBR::SA:123&lt;/ServiceVolumeLocRef &gt;
 *   &lt;ServiceVolumeRadius  cls="U"&gt;252.65&lt;/ServiceVolumeRadius &gt;
 * &lt;/StationLoc&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationLoc", propOrder = {
  "locationExcluded",
  "locSatRef",
  "locationRadius",
  "serviceVolumeLocRef",
  "serviceVolumeRadius",
  "serviceVolumeHeight"
})
public class StationLoc {

  /**
   * US:LocationExcluded - Excluded Location Indicator (Optional)
   * <p>
   * "Yes" to indicate that the LocSatRef is to be excluded from the location
   * set for the current station. If omitted, "No" is assumed, meaning that the
   * location is included.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "LocationExcluded", required = false)
  private TString locationExcluded;
  /**
   * US:LocSatRef - Location or Satellite Reference (Optional)
   * <p>
   * The serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point) then the assignment is mobile
   * and inside the Station location (e.g. inside the satellite beam
   * footprint.).
   * <p>
   * Format is SERIAL (S29)
   */
  @XmlElement(name = "LocSatRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locSatRef;
  /**
   * US:LocationRadius - Location Radius (Optional)
   * <p>
   * The radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * Format is UN(9,4) (km)
   */
  @XmlElement(name = "LocationRadius", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTSPACE.class)
  private TDecimal locationRadius;
  /**
   * US:ServiceVolumeLocRef - Service Volume Identifier (Optional)
   * <p>
   * The reference to a Location for an aeronautical coverage area. The area can
   * be modified by the fields ServiceVolumeRadius and ServiceValumeHeight. For
   * example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * Format is SERIAL (S29)
   * <p>
   * Attribute group SV (Optional)
   */
  @XmlElement(name = "ServiceVolumeLocRef")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serviceVolumeLocRef;
  /**
   * US:ServiceVolumeRadius - Service Volume Radius (Optional)
   * <p>
   * The radius (in km) associated with the ServiceVolumeLocRef Location to
   * produce a circle. Radius information only applies to points, and should be
   * ignored in the case of polygons and ellipses.
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * Attribute group SV (Optional)
   */
  @XmlElement(name = "ServiceVolumeRadius", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTEARTH.class)
  private TDecimal serviceVolumeRadius;
  /**
   * US:ServiceVolumeHeight - Service Volume Height (Optional)
   * <p>
   * The the flight altitude in metres of all altitude of aeronautical
   * navigational aids, air traffic control assignments for radio frequencies
   * above 30 MHz, and low-frequency beacons. The altitude is referenced to mean
   * sea level (MSL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group SV (Optional)
   */
  @XmlElement(name = "ServiceVolumeHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal serviceVolumeHeight;

  /**
   * Get "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included.
   * <p>
   * @return the LocationExcluded value in a {@link TString} data type
   */
  public TString getLocationExcluded() {
    return locationExcluded;
  }

  /**
   * Set "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included.
   * <p>
   * @param value the LocationExcluded value in a {@link TString} data type
   */
  public void setLocationExcluded(TString value) {
    this.locationExcluded = value;
  }

  /**
   * Determine if the LocationExcluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationExcluded() {
    return (this.locationExcluded != null ? this.locationExcluded.isSetValue() : false);
  }

  /**
   * Get the serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * @return the LocSatRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocSat()} instead.
   */
  @Deprecated
  public TString getLocSatRef() {
    return locSatRef;
  }

  /**
   * Set the serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * @param value the LocSatRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocSat(Common)} instead.
   */
  @Deprecated
  public void setLocSatRef(TString value) {
    this.locSatRef = value;
  }

  /**
   * Determine if the LocSatRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSatRef() {
    return (this.locSatRef != null ? this.locSatRef.isSetValue() : false);
  }

  /**
   * Get the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @return the LocationRadius value in a {@link TDecimal} data type
   */
  public TDecimal getLocationRadius() {
    return locationRadius;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value the LocationRadius value in a {@link TDecimal} data type
   */
  public void setLocationRadius(TDecimal value) {
    this.locationRadius = value;
  }

  /**
   * Determine if the LocationRadius is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRadius() {
    return (this.locationRadius != null ? this.locationRadius.isSetValue() : false);
  }

  /**
   * Get the reference to a Location for an aeronautical coverage area. The area
   * can be modified by the fields ServiceVolumeRadius and ServiceValumeHeight.
   * For example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * @return the ServiceVolumeLocRef value in a {@link TString} data type
   */
  public TString getServiceVolumeLocRef() {
    return serviceVolumeLocRef;
  }

  /**
   * Set the reference to a Location for an aeronautical coverage area. The area
   * can be modified by the fields ServiceVolumeRadius and ServiceValumeHeight.
   * For example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * @param value the ServiceVolumeLocRef value in a {@link TString} data type
   */
  public void setServiceVolumeLocRef(TString value) {
    this.serviceVolumeLocRef = value;
  }

  /**
   * Determine if the ServiceVolumeLocRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceVolumeLocRef() {
    return (this.serviceVolumeLocRef != null ? this.serviceVolumeLocRef.isSetValue() : false);
  }

  /**
   * Get the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @return the ServiceVolumeRadius value in a {@link TDecimal} data type
   */
  public TDecimal getServiceVolumeRadius() {
    return serviceVolumeRadius;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value the ServiceVolumeRadius value in a {@link TDecimal} data type
   */
  public void setServiceVolumeRadius(TDecimal value) {
    this.serviceVolumeRadius = value;
  }

  /**
   * Determine if the ServiceVolumeRadius is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceVolumeRadius() {
    return (this.serviceVolumeRadius != null ? this.serviceVolumeRadius.isSetValue() : false);
  }

  /**
   * Get the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL).
   * <p>
   * @return the ServiceVolumeHeight value in a {@link TDecimal} data type
   */
  public TDecimal getServiceVolumeHeight() {
    return serviceVolumeHeight;
  }

  /**
   * Set the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL).
   * <p>
   * @param value the ServiceVolumeHeight value in a {@link TDecimal} data type
   */
  public void setServiceVolumeHeight(TDecimal value) {
    this.serviceVolumeHeight = value;
  }

  /**
   * Determine if the ServiceVolumeHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceVolumeHeight() {
    return (this.serviceVolumeHeight != null ? this.serviceVolumeHeight.isSetValue() : false);
  }

  /**
   * Set "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current StationLoc object instance
   */
  public StationLoc withLocationExcluded(ListCBO value) {
    setLocationExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationLoc object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocSat(Common)} instead.
   */
  @Deprecated
  public StationLoc withLocSatRef(String value) {
    setLocSatRef(new TString(value));
    return this;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationLoc object instance
   */
  public StationLoc withLocationRadius(Double value) {
    setLocationRadius(new TDecimal(value));
    return this;
  }

  /**
   * Set the reference to a Location for an aeronautical coverage area. The area
   * can be modified by the fields ServiceVolumeRadius and ServiceValumeHeight.
   * For example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationLoc object instance
   */
  public StationLoc withServiceVolumeLocRef(String value) {
    setServiceVolumeLocRef(new TString(value));
    return this;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationLoc object instance
   */
  public StationLoc withServiceVolumeRadius(Double value) {
    setServiceVolumeRadius(new TDecimal(value));
    return this;
  }

  /**
   * Set the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current StationLoc object instance
   */
  public StationLoc withServiceVolumeHeight(Double value) {
    setServiceVolumeHeight(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this StationLoc instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StationLoc {"
      + (serviceVolumeLocRef != null ? " serviceVolumeLocRef [" + serviceVolumeLocRef + "]" : "")
      + (locationRadius != null ? " locationRadius [" + locationRadius + "]" : "")
      + (locSatRef != null ? " locSatRef [" + locSatRef + "]" : "")
      + (serviceVolumeHeight != null ? " serviceVolumeHeight [" + serviceVolumeHeight + "]" : "")
      + (locationExcluded != null ? " locationExcluded [" + locationExcluded + "]" : "")
      + (serviceVolumeRadius != null ? " serviceVolumeRadius [" + serviceVolumeRadius + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StationLoc} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:LocSatRef - Location or Satellite Reference (Optional)
   * <p>
   * The serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> locSat;

  /**
   * Get the serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getLocSat() {
    return locSat;
  }

  /**
   * Determine if the locSat field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocSat() {
    return this.locSat != null;
  }

  /**
   * Set the serial of a Location or Satellite dataset. If this location is a
   * complex dataset (more than a single point), tthe assignment is mobile,
   * inside the Station location.
   * <p>
   * @param value An instances of type {@link Common<?>}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  public StationLoc withLocSat(Common<?> value) {
    this.locSat = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this StationLoc record.
   * <p>
   * This method builds the exported {@link #locSatRef} field with values from
   * the transient {@link #locSat} field. This method should typically be called
   * after the StationLoc is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @return The current StationLoc object instance
   */
  public StationLoc build() {
    this.locSatRef = locSat != null ? locSat.getSerial() : null;
    return this;
  }//</editor-fold>

}
