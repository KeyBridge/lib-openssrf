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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCLS;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSP;
import us.gov.dod.standard.ssrf._3_1.satellite.EarthStation;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;

/**
 * Satellite contains station information related to the space service.
 * <p>
 * Sub-Elements are
 * {@link EarthStation}, {@link Nomenclature}, {@link ServiceArea}
 * <p>
 * Example:
 * <pre>
 * &lt;Satellite cls="U"&gt;
 *   &lt;Serial cls="U"&gt;GBR::SA:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;OrbitType cls="U"&gt;GEO Stationary&lt;/OrbitType&gt;
 *   &lt;LaunchStatus cls="U"&gt;Operational&lt;/LaunchStatus&gt;
 *   &lt;GeoNominalLon cls="U"&gt;0053000E&lt;/GeoNominalLon&gt;
 *   &lt;NetworkName cls="U"&gt;SKYNET 4&lt;/NetworkName&gt;
 * &lt;/Satellite&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Satellite", propOrder = {
  "reviewDate",
  "callSign",
  "orbitType",
  "launchStatus",
  "launchLocRef",
  "launchDate",
  "geoNominalLon",
  "geoAltitude",
  "nonGeoPeriod",
  "nonGeoNumSatellites",
  "nonGeoApogee",
  "nonGeoPerigee",
  "nonGeoInclination",
  "internationalDesignator",
  "objectNum",
  "administration",
  "networkName",
  "rfSystemRef",
  "earthStation",
  "serviceArea",
  "nomenclature"
})
public class Satellite extends Common<Satellite> {

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
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * CallSign - Call Sign (Optional)
   * <p>
   * The call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CallSign", required = false)
  private S20 callSign;
  /**
   * OrbitType - Orbit Type (Optional)
   * <p>
   * The type of orbit.
   * <p>
   * Format is L:CSP
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OrbitType", required = false)
  private TString orbitType;
  /**
   * LaunchStatus - Launch Status (Optional)
   * <p>
   * The status of the satellite.
   * <p>
   * Format is L:CLS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchStatus", required = false)
  private TString launchStatus;
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchLocRef", required = false)
  private Serial launchLocRef;
  /**
   * LaunchDate - Launch Date (Optional)
   * <p>
   * The date of the satellite launch.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LaunchDate", required = false)
  private D launchDate;
  /**
   * GeoNominalLon - Geostationary Nominal Longitude (Optional)
   * <p>
   * The longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GeoNominalLon", required = false)
  private Lon geoNominalLon;
  /**
   * GeoAltitude - Geostationary Altitude (Optional)
   * <p>
   * The altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GeoAltitude", required = false)
  private DistSpace geoAltitude;
  /**
   * NonGeoPeriod - Non-Geostationary Period (Optional)
   * <p>
   * The time required for the non-geostationary satellite to make one complete
   * orbit around the earth.
   * <p>
   * Format is UN(10,4) (min)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoPeriod", required = false)
  private minutes nonGeoPeriod;
  /**
   * NonGeoNumSatellites - Number of Non-Geostationary Satellites (Optional)
   * <p>
   * The number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * Format is UN(4)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoNumSatellites", required = false)
  private UN4 nonGeoNumSatellites;
  /**
   * NonGeoApogee - Non-Geostationary Apogee (Optional)
   * <p>
   * The maximum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoApogee", required = false)
  private DistSpace nonGeoApogee;
  /**
   * NonGeoPerigee - Non-Geostationary Perigee (Optional)
   * <p>
   * The minimum altitude of the non-geostationary satellite relative to Mean
   * Sea Level (MSL).
   * <p>
   * Format is UN(9,4) (km)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoPerigee", required = false)
  private DistSpace nonGeoPerigee;
  /**
   * NonGeoInclination - Non-Geostationary Inclination (Optional)
   * <p>
   * The angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NonGeoInclination", required = false)
  private Elev nonGeoInclination;
  /**
   * InternationalDesignator - International Designator (Optional)
   * <p>
   * The externally-assigned International Designator for the satellite.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InternationalDesignator", required = false)
  private S20 internationalDesignator;
  /**
   * ObjectNum - Object Number (Optional)
   * <p>
   * The USSPACECOM-assigned space object identification number.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObjectNum", required = false)
  private S20 objectNum;
  /**
   * Administration - Notifying Administration (Optional)
   * <p>
   * The country and/or administration which registered the satellite.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", required = false)
  private S100 administration;
  /**
   * NetworkName - Network Name (Optional)
   * <p>
   * The name of the network to which the satellite belongs.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NetworkName", required = false)
  private S50 networkName;
  /**
   * RFSystemRef (Optional)
   * <p>
   * RFSystemRef contains a reference to a RF System used on the satellite.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFSystemRef", nillable = true)
  private Set<Serial> rfSystemRef;
  /**
   * EarthStation (Optional)
   * <p>
   * EarthStation contains the name and type of an earth station used in a
   * satellite network.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EarthStation")
  private Set<EarthStation> earthStation;
  /**
   * ServiceArea (Optional)
   * <p>
   * ServiceArea contains the geographic area serviced by the satellite.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ServiceArea", nillable = true)
  private Set<ServiceArea> serviceArea;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature")
  private Set<Nomenclature> nomenclature;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Satellite() {
    super();
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
   * Get the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getCallSign() {
    return callSign;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setCallSign(S20 value) {
    this.callSign = value;
  }

  /**
   * Determine if the CallSign is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCallSign() {
    return (this.callSign != null ? this.callSign.isSetValue() : false);
  }

  /**
   * Get the type of orbit..
   * <p>
   * @return the OrbitType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOrbitType() {
    return orbitType;
  }

  /**
   * Set the type of orbit..
   * <p>
   * @param value the OrbitType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOrbitType(TString value) {
    this.orbitType = value;
  }

  /**
   * Determine if the OrbitType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrbitType() {
    return (this.orbitType != null ? this.orbitType.isSetValue() : false);
  }

  /**
   * Get the status of the satellite..
   * <p>
   * @return the LaunchStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLaunchStatus() {
    return launchStatus;
  }

  /**
   * Set the status of the satellite..
   * <p>
   * @param value the LaunchStatus value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLaunchStatus(TString value) {
    this.launchStatus = value;
  }

  /**
   * Determine if the LaunchStatus is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchStatus() {
    return (this.launchStatus != null ? this.launchStatus.isSetValue() : false);
  }

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLaunchLoc()} instead.
   */
  @Deprecated
  public Serial getLaunchLocRef() {
    return launchLocRef;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLaunchLoc(Location)} instead.
   */
  @Deprecated
  public void setLaunchLocRef(Serial value) {
    this.launchLocRef = value;
  }

  /**
   * Determine if the LaunchLocRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLocRef() {
    return (this.launchLocRef != null ? this.launchLocRef.isSetValue() : false);
  }

  /**
   * Get the date of the satellite launch..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getLaunchDate() {
    return launchDate;
  }

  /**
   * Set the date of the satellite launch..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setLaunchDate(D value) {
    this.launchDate = value;
  }

  /**
   * Determine if the LaunchDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchDate() {
    return (this.launchDate != null ? this.launchDate.isSetValue() : false);
  }

  /**
   * Get the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West..
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getGeoNominalLon() {
    return geoNominalLon;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West..
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setGeoNominalLon(Lon value) {
    this.geoNominalLon = value;
  }

  /**
   * Determine if the GeoNominalLon is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoNominalLon() {
    return (this.geoNominalLon != null ? this.geoNominalLon.isSetValue() : false);
  }

  /**
   * Get the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL)..
   * <p>
   * @return a {@link DistSpace} instance
   * @since 3.1.0
   */
  public DistSpace getGeoAltitude() {
    return geoAltitude;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL)..
   * <p>
   * @param value a {@link DistSpace} instance
   * @since 3.1.0
   */
  public void setGeoAltitude(DistSpace value) {
    this.geoAltitude = value;
  }

  /**
   * Determine if the GeoAltitude is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoAltitude() {
    return (this.geoAltitude != null ? this.geoAltitude.isSetValue() : false);
  }

  /**
   * Get the time required for the non-geostationary satellite to make one
   * complete orbit around the earth..
   * <p>
   * @return a {@link minutes} instance
   * @since 3.1.0
   */
  public minutes getNonGeoPeriod() {
    return nonGeoPeriod;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth..
   * <p>
   * @param value a {@link minutes} instance
   * @since 3.1.0
   */
  public void setNonGeoPeriod(minutes value) {
    this.nonGeoPeriod = value;
  }

  /**
   * Determine if the NonGeoPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPeriod() {
    return (this.nonGeoPeriod != null ? this.nonGeoPeriod.isSetValue() : false);
  }

  /**
   * Get the number of non-geostationary satellites in a system having similar
   * orbital characteristics..
   * <p>
   * @return a {@link UN4} instance
   * @since 3.1.0
   */
  public UN4 getNonGeoNumSatellites() {
    return nonGeoNumSatellites;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics..
   * <p>
   * @param value a {@link UN4} instance
   * @since 3.1.0
   */
  public void setNonGeoNumSatellites(UN4 value) {
    this.nonGeoNumSatellites = value;
  }

  /**
   * Determine if the NonGeoNumSatellites is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoNumSatellites() {
    return (this.nonGeoNumSatellites != null ? this.nonGeoNumSatellites.isSetValue() : false);
  }

  /**
   * Get the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL)..
   * <p>
   * @return a {@link DistSpace} instance
   * @since 3.1.0
   */
  public DistSpace getNonGeoApogee() {
    return nonGeoApogee;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL)..
   * <p>
   * @param value a {@link DistSpace} instance
   * @since 3.1.0
   */
  public void setNonGeoApogee(DistSpace value) {
    this.nonGeoApogee = value;
  }

  /**
   * Determine if the NonGeoApogee is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoApogee() {
    return (this.nonGeoApogee != null ? this.nonGeoApogee.isSetValue() : false);
  }

  /**
   * Get the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL)..
   * <p>
   * @return a {@link DistSpace} instance
   * @since 3.1.0
   */
  public DistSpace getNonGeoPerigee() {
    return nonGeoPerigee;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL)..
   * <p>
   * @param value a {@link DistSpace} instance
   * @since 3.1.0
   */
  public void setNonGeoPerigee(DistSpace value) {
    this.nonGeoPerigee = value;
  }

  /**
   * Determine if the NonGeoPerigee is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoPerigee() {
    return (this.nonGeoPerigee != null ? this.nonGeoPerigee.isSetValue() : false);
  }

  /**
   * Get the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth..
   * <p>
   * @return a {@link Elev} instance
   * @since 3.1.0
   */
  public Elev getNonGeoInclination() {
    return nonGeoInclination;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth..
   * <p>
   * @param value a {@link Elev} instance
   * @since 3.1.0
   */
  public void setNonGeoInclination(Elev value) {
    this.nonGeoInclination = value;
  }

  /**
   * Determine if the NonGeoInclination is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNonGeoInclination() {
    return (this.nonGeoInclination != null ? this.nonGeoInclination.isSetValue() : false);
  }

  /**
   * Get the externally-assigned International Designator for the satellite..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getInternationalDesignator() {
    return internationalDesignator;
  }

  /**
   * Set the externally-assigned International Designator for the satellite..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setInternationalDesignator(S20 value) {
    this.internationalDesignator = value;
  }

  /**
   * Determine if the InternationalDesignator is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInternationalDesignator() {
    return (this.internationalDesignator != null ? this.internationalDesignator.isSetValue() : false);
  }

  /**
   * Get the USSPACECOM-assigned space object identification number..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getObjectNum() {
    return objectNum;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setObjectNum(S20 value) {
    this.objectNum = value;
  }

  /**
   * Determine if the ObjectNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObjectNum() {
    return (this.objectNum != null ? this.objectNum.isSetValue() : false);
  }

  /**
   * Get the country and/or administration which registered the satellite..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getAdministration() {
    return administration;
  }

  /**
   * Set the country and/or administration which registered the satellite..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setAdministration(S100 value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
  }

  /**
   * Get the name of the network to which the satellite belongs..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getNetworkName() {
    return networkName;
  }

  /**
   * Set the name of the network to which the satellite belongs..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setNetworkName(S50 value) {
    this.networkName = value;
  }

  /**
   * Determine if the NetworkName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetworkName() {
    return (this.networkName != null ? this.networkName.isSetValue() : false);
  }

  /**
   * Get the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Set<Serial> getRFSystemRef() {
    if (rfSystemRef == null) {
      rfSystemRef = new HashSet<>();
    }
    return this.rfSystemRef;
  }

  /**
   * Determine if the RFSystemRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSystemRef() {
    return ((this.rfSystemRef != null) && (!this.rfSystemRef.isEmpty()));
  }

  /**
   * Clear the RFSystemRef field. This sets the field to null.
   */
  public void unsetRFSystemRef() {
    this.rfSystemRef = null;
  }

  /**
   * Get the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network..
   * <p>
   * @return a {@link EarthStation} instance
   * @since 3.1.0
   */
  public Set<EarthStation> getEarthStation() {
    if (earthStation == null) {
      earthStation = new HashSet<>();
    }
    return this.earthStation;
  }

  /**
   * Determine if the EarthStation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEarthStation() {
    return ((this.earthStation != null) && (!this.earthStation.isEmpty()));
  }

  /**
   * Clear the EarthStation field. This sets the field to null.
   */
  public void unsetEarthStation() {
    this.earthStation = null;
  }

  /**
   * Get the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite..
   * <p>
   * @return a {@link ServiceArea} instance
   * @since 3.1.0
   */
  public Set<ServiceArea> getServiceArea() {
    if (serviceArea == null) {
      serviceArea = new HashSet<>();
    }
    return this.serviceArea;
  }

  /**
   * Determine if the ServiceArea is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetServiceArea() {
    return ((this.serviceArea != null) && (!this.serviceArea.isEmpty()));
  }

  /**
   * Clear the ServiceArea field. This sets the field to null.
   */
  public void unsetServiceArea() {
    this.serviceArea = null;
  }

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number..
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
    }
    return this.nomenclature;
  }

  /**
   * Determine if the Nomenclature is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
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
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withReviewDate(Calendar value) {
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
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the call sign assigned to the transmitting station. It can be an
   * internationally allocated call sign or the tactical call sign assigned by
   * the operational authority when the Station is used within a Net. For
   * navigational aids, enter the NAVAIDS identifier.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withCallSign(String value) {
    setCallSign(new S20(value));
    return this;
  }

  /**
   * Set the type of orbit.
   * <p>
   * @param value An instances of type {@link ListCSP}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withOrbitType(ListCSP value) {
    setOrbitType(new TString(value.value()));
    return this;
  }

  /**
   * Set the status of the satellite.
   * <p>
   * @param value An instances of type {@link ListCLS}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withLaunchStatus(ListCLS value) {
    setLaunchStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLaunchLoc(Location)} instead.
   */
  @Deprecated
  public Satellite withLaunchLocRef(Serial value) {
    setLaunchLocRef(value);
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withLaunchDate(Calendar value) {
    setLaunchDate(new D(value));
    return this;
  }

  /**
   * Set the date of the satellite launch.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withLaunchDate(Date value) {
    setLaunchDate(new D(value));
    return this;
  }

  /**
   * Set the longitude of the geostationary satellite in the following format:
   * dddmmss[.hh]H, where H represents "E" for East or "W" for West.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withGeoNominalLon(String value) {
    setGeoNominalLon(new Lon(value));
    return this;
  }

  /**
   * Set the altitude of the geostationary satellite, relative to Mean Sea Level
   * (MSL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withGeoAltitude(Double value) {
    setGeoAltitude(new DistSpace(value));
    return this;
  }

  /**
   * Set the time required for the non-geostationary satellite to make one
   * complete orbit around the earth.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNonGeoPeriod(Double value) {
    setNonGeoPeriod(new minutes(value));
    return this;
  }

  /**
   * Set the number of non-geostationary satellites in a system having similar
   * orbital characteristics.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNonGeoNumSatellites(Integer value) {
    setNonGeoNumSatellites(new UN4(value));
    return this;
  }

  /**
   * Set the maximum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNonGeoApogee(Double value) {
    setNonGeoApogee(new DistSpace(value));
    return this;
  }

  /**
   * Set the minimum altitude of the non-geostationary satellite relative to
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNonGeoPerigee(Double value) {
    setNonGeoPerigee(new DistSpace(value));
    return this;
  }

  /**
   * Set the angle determined by the plane containing the orbit of the
   * non-geostationary satellite and the equatorial plane of the earth.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNonGeoInclination(Double value) {
    setNonGeoInclination(new Elev(value));
    return this;
  }

  /**
   * Set the externally-assigned International Designator for the satellite.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withInternationalDesignator(String value) {
    setInternationalDesignator(new S20(value));
    return this;
  }

  /**
   * Set the USSPACECOM-assigned space object identification number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withObjectNum(String value) {
    setObjectNum(new S20(value));
    return this;
  }

  /**
   * Set the country and/or administration which registered the satellite.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withAdministration(String value) {
    setAdministration(new S100(value));
    return this;
  }

  /**
   * Set the name of the network to which the satellite belongs.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNetworkName(String value) {
    setNetworkName(new S50(value));
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link RFSystemRef...}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withRFSystemRef(Serial... values) {
    if (values != null) {
      getRFSystemRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RFSystemRef
   * <p>
   * Complex element RFSystemRef contains a reference to a RF System used on the
   * satellite.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withRFSystemRef(Collection<Serial> values) {
    if (values != null) {
      getRFSystemRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values One or more instances of type {@link EarthStation...}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withEarthStation(EarthStation... values) {
    if (values != null) {
      getEarthStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the EarthStation
   * <p>
   * Complex element EarthStation contains the name and type of an earth station
   * used in a satellite network.
   * <p>
   * @param values A collection of {@link EarthStation} instances
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withEarthStation(Collection<EarthStation> values) {
    if (values != null) {
      getEarthStation().addAll(values);
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values One or more instances of type {@link ServiceArea...}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withServiceArea(ServiceArea... values) {
    if (values != null) {
      getServiceArea().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ServiceArea
   * <p>
   * Complex element ServiceArea contains the geographic area serviced by the
   * satellite.
   * <p>
   * @param values A collection of {@link ServiceArea} instances
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withServiceArea(Collection<ServiceArea> values) {
    if (values != null) {
      getServiceArea().addAll(values);
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Satellite instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Satellite {"
           + (administration != null ? "\n administration [" + administration + "]" : "")
           + (callSign != null ? "\n callSign [" + callSign + "]" : "")
           + (earthStation != null ? "\n earthStation [" + earthStation + "]" : "")
           + (geoAltitude != null ? "\n geoAltitude [" + geoAltitude + "]" : "")
           + (geoNominalLon != null ? "\n geoNominalLon [" + geoNominalLon + "]" : "")
           + (internationalDesignator != null ? "\n internationalDesignator [" + internationalDesignator + "]" : "")
           + (launchDate != null ? "\n launchDate [" + launchDate + "]" : "")
           + (launchLocRef != null ? "\n launchLocRef [" + launchLocRef + "]" : "")
           + (launchStatus != null ? "\n launchStatus [" + launchStatus + "]" : "")
           + (networkName != null ? "\n networkName [" + networkName + "]" : "")
           + (nomenclature != null ? "\n nomenclature [" + nomenclature + "]" : "")
           + (nonGeoApogee != null ? "\n nonGeoApogee [" + nonGeoApogee + "]" : "")
           + (nonGeoInclination != null ? "\n nonGeoInclination [" + nonGeoInclination + "]" : "")
           + (nonGeoNumSatellites != null ? "\n nonGeoNumSatellites [" + nonGeoNumSatellites + "]" : "")
           + (nonGeoPerigee != null ? "\n nonGeoPerigee [" + nonGeoPerigee + "]" : "")
           + (nonGeoPeriod != null ? "\n nonGeoPeriod [" + nonGeoPeriod + "]" : "")
           + (objectNum != null ? "\n objectNum [" + objectNum + "]" : "")
           + (orbitType != null ? "\n orbitType [" + orbitType + "]" : "")
           + (reviewDate != null ? "\n reviewDate [" + reviewDate + "]" : "")
           + (rfSystemRef != null ? "\n rfSystemRef [" + rfSystemRef + "]" : "")
           + (serviceArea != null ? "\n serviceArea [" + serviceArea + "]" : "")
           + "}\n  Satellite." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Satellite} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LaunchLocRef - Launch Location Serial (Optional)
   * <p>
   * A reference to a Location that identifies the satellite launch location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location launchLoc;

  /**
   * Get a reference to a Location that identifies the satellite launch
   * location..
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLaunchLoc() {
    return launchLoc;
  }

  /**
   * Determine if the launchLoc field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLaunchLoc() {
    return this.launchLoc != null;
  }

  /**
   * Set a reference to a Location that identifies the satellite launch
   * location.
   * <p>
   * @param value An instances of type {@link Location}.
   * @return The current Satellite object instance.
   * @since 3.1.0
   */
  public Satellite withLaunchLoc(Location value) {
    this.launchLoc = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this Satellite record.
   * <p>
   * This method builds the exported {@link #launchLocRef} field with values
   * from the transient {@link #launchLoc} field. This method should typically
   * be called after the Satellite is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.launchLocRef = launchLoc != null ? launchLoc.getSerial() : this.launchLocRef;
  }

  /**
   * Update the SSRF data type references in this Satellite record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #launchLoc} with values from the
   * imported {@link #launchLocRef} field. This method should typically be
   * called after the Satellite is imported from XML. * @param root the SSRF
   * root instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (launchLocRef == null || !launchLocRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (launchLocRef.equals(instance.getSerial())) {
        launchLoc = instance;
        return;
      }
    }
  }//</editor-fold>

}
