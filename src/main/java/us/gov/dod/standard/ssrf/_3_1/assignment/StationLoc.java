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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.Satellite;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Station (US) defines one or more transmitters or receivers or a combination
 * of transmitters and receivers, including the accessory
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
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationExcluded", required = false)
  private TString locationExcluded;
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
  @XmlElement(name = "LocSatRef", required = false)
  private Serial locSatRef;
  /**
   * US:LocationRadius - Location Radius (Optional)
   * <p>
   * The radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRadius", required = false)
  private DistSpace locationRadius;
  /**
   * US:ServiceVolumeLocRef - Service Volume Identifier (Optional)
   * <p>
   * The reference to a Location for an aeronautical coverage area. The area can
   * be modified by the fields ServiceVolumeRadius and ServiceValumeHeight. For
   * example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group SV (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ServiceVolumeLocRef")
  private Serial serviceVolumeLocRef;
  /**
   * US:ServiceVolumeRadius - Service Volume Radius (Optional)
   * <p>
   * The radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * Attribute group SV (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ServiceVolumeRadius", required = false)
  private DistEarth serviceVolumeRadius;
  /**
   * US:ServiceVolumeHeight - Service Volume Height (Optional)
   * <p>
   * The altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group SV (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ServiceVolumeHeight", required = false)
  private Altitude serviceVolumeHeight;

  /**
   * Get "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included..
   * <p>
   * @return the LocationExcluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLocationExcluded() {
    return locationExcluded;
  }

  /**
   * Set "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included..
   * <p>
   * @param value the LocationExcluded value in a {@link TString} data type
   * @since 3.1.0
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
   * inside the Station location..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocSat()} instead.
   */
  @Deprecated
  public Serial getLocSatRef() {
    return locSatRef;
  }

  /**
   * Set the serial of a Location or Satellite dataset.
   * <p>
   * If this location is a
   * complex dataset (more than a single point), the assignment is mobile,
   * inside the Station location.
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocSat(Common)} instead.
   */
  @Deprecated
  public void setLocSatRef(Serial value) {
    this.locSatRef = value;
  }

  /**
   * Determine if the LocSatRef is configured.
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
   * @return a {@link DistSpace} instance
   * @since 3.1.0
   */
  public DistSpace getLocationRadius() {
    return locationRadius;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses..
   * <p>
   * @param value a {@link DistSpace} instance
   * @since 3.1.0
   */
  public void setLocationRadius(DistSpace value) {
    this.locationRadius = value;
  }

  /**
   * Determine if the LocationRadius is configured.
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
   * extended with a radius and height to form a cylinder..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getServiceVolumeLocRef() {
    return serviceVolumeLocRef;
  }

  /**
   * Set the reference to a Location for an aeronautical coverage area. The area
   * can be modified by the fields ServiceVolumeRadius and ServiceValumeHeight.
   * For example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setServiceVolumeLocRef(Serial value) {
    this.serviceVolumeLocRef = value;
  }

  /**
   * Determine if the ServiceVolumeLocRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceVolumeLocRef() {
    return (this.serviceVolumeLocRef != null ? this.serviceVolumeLocRef.isSetValue() : false);
  }

  /**
   * Get the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses..
   * <p>
   * @return a {@link DistEarth} instance
   * @since 3.1.0
   */
  public DistEarth getServiceVolumeRadius() {
    return serviceVolumeRadius;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses..
   * <p>
   * @param value a {@link DistEarth} instance
   * @since 3.1.0
   */
  public void setServiceVolumeRadius(DistEarth value) {
    this.serviceVolumeRadius = value;
  }

  /**
   * Determine if the ServiceVolumeRadius is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceVolumeRadius() {
    return (this.serviceVolumeRadius != null ? this.serviceVolumeRadius.isSetValue() : false);
  }

  /**
   * Get the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL)..
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getServiceVolumeHeight() {
    return serviceVolumeHeight;
  }

  /**
   * Set the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL)..
   * <p>
   * @param value a {@link Altitude} instance
   * @since 3.1.0
   */
  public void setServiceVolumeHeight(Altitude value) {
    this.serviceVolumeHeight = value;
  }

  /**
   * Determine if the ServiceVolumeHeight is configured.
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
   * @param value An instances of type {@link ListCBO}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Serial}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocSat(Common)} instead.
   */
  @Deprecated
  public StationLoc withLocSatRef(Serial value) {
    setLocSatRef(value);
    return this;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
   */
  public StationLoc withLocationRadius(Double value) {
    setLocationRadius(new DistSpace(value));
    return this;
  }

  /**
   * Set the reference to a Location for an aeronautical coverage area. The area
   * can be modified by the fields ServiceVolumeRadius and ServiceValumeHeight.
   * For example, ServiceVolumeLocRef can reference a point location that is
   * extended with a radius and height to form a cylinder.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
   */
  public StationLoc withServiceVolumeLocRef(Serial value) {
    setServiceVolumeLocRef(value);
    return this;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
   */
  public StationLoc withServiceVolumeRadius(Double value) {
    setServiceVolumeRadius(new DistEarth(value));
    return this;
  }

  /**
   * Set the altitude of aeronautical navigational aids, air traffic control
   * assignments for radio frequencies above 30 MHz, and low-frequency beacons.
   * The altitude is referenced to mean sea level (MSL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current StationLoc object instance.
   * @since 3.1.0
   */
  public StationLoc withServiceVolumeHeight(Double value) {
    setServiceVolumeHeight(new Altitude(value));
    return this;
  }

  /**
   * Get a string representation of this StationLoc instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  StationLoc {"
           + (locSatRef != null ? " locSatRef [" + locSatRef + "]" : "")
           + (locationExcluded != null ? " locationExcluded [" + locationExcluded + "]" : "")
           + (locationRadius != null ? " locationRadius [" + locationRadius + "]" : "")
           + (serviceVolumeHeight != null ? " serviceVolumeHeight [" + serviceVolumeHeight + "]" : "")
           + (serviceVolumeLocRef != null ? " serviceVolumeLocRef [" + serviceVolumeLocRef + "]" : "")
           + (serviceVolumeRadius != null ? " serviceVolumeRadius [" + serviceVolumeRadius + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StationLoc} has no configuration requirements.
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
   * inside the Station location..
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
   * Set the serial of a Location or Satellite dataset.
   *
   * If this location is a
   * complex dataset (more than a single point), the assignment is mobile,
   * inside the Station location.
   * <p>
   * @param value An instance of type {@link Common}.
   * @return The current StationLoc object instance.
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
   * @since 3.1.0
   */
  public void prepare() {
    this.locSatRef = locSat != null ? locSat.getSerial() : this.locSatRef;
  }

  /**
   * Update the SSRF data type references in this StationLoc record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #locSat} with values from the
   * imported {@link #locSatRef} field. This method should typically be called
   * after the StationLoc is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locSatRef == null || !locSatRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
    for (Satellite instance : root.getSatellite()) {
      if (locSatRef.equals(instance.getSerial())) {
        locSat = instance;
        return;
      }
    }
  }//</editor-fold>

}
