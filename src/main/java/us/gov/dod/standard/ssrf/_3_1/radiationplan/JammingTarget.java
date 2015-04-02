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
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUWG;

/**
 * JammingTarget (US) describes the target location and identifies the jamming
 * loadset to be used.
 * <p>
 * Element of {@link JammingPlan}
 * <p>
 * Sub-Element is {@link JammingPerformance}
 * <p>
 * Example: See {@link RadiationPlan}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingTarget", propOrder = {
  "antStabilisation",
  "bearing",
  "freqMax",
  "freqMin",
  "lat",
  "loadsetRef",
  "locationRef",
  "lon",
  "polarisationType",
  "power",
  "targetID",
  "jammingPerformance"
})
public class JammingTarget {

  /**
   * US:AntStabilisation - Antenna Stabilisation Type (Optional)
   * <p>
   * The method by which the jamming antenna beam is focused.
   * <p>
   * Format is L:UWG
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntStabilisation", required = false)
  private TString antStabilisation;
  /**
   * US:Bearing - Target Bearing (Optional)
   * <p>
   * The bearing of the target in degrees referenced to the "boresight" of the
   * jammer equipment or the platform that the jammer equipment is mounted on.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Bearing", required = false)
  private Az bearing;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * US:Lat - Latitude (Optional)
   * <p>
   * The geographic latitude of the target location, including hemisphere (H).
   * The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may have a
   * decimal point followed by up to two numerals. If seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities, where seconds MUST be entered. Degrees latitude
   * requires two digits and should not exceed 90 degrees; enter N or S
   * immediately following the seconds. Use leading zeros.
   * <p>
   * Format is pattern (S10) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lat", required = false)
  private Lat lat;
  /**
   * In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains
   * the details to be used for this jamming instance.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LoadsetRef", required = false)
  private Serial loadsetRef;
  /**
   * US:LocationRef - Target Location Serial (Optional)
   * <p>
   * The unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", required = false)
  private Serial locationRef;
  /**
   * US:Lon - Longitude (Optional)
   * <p>
   * The geographical longitude of the target location, including hemisphere
   * (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees longitude requires three digits and should not exceed 180 degrees;
   * enter E or W immediately following the seconds. Use leading zeros.
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lon", required = false)
  private Lon lon;
  /**
   * US:PolarisationType - Polarisation (Optional)
   * <p>
   * The antenna polarisation planned for the desired jamming instance.
   * <p>
   * Format is L:CPO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationType", required = false)
  private TString polarisationType;
  /**
   * US:Power - Power (Optional)
   * <p>
   * The desired power value planned to be directed at the target.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Power", required = false)
  private dBW power;
  /**
   * US:TargetID - Taget ID (Optional)
   * <p>
   * A unique (within the parent JammingPlan) numeric identifier to distinguish
   * one target from another.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TargetID", required = false)
  private UN5 targetID;
  /**
   * US:JammingPerformance (Optional)
   * <p>
   * JammingPerformance (US) describes Electronic Attack effectiveness and how
   * severely a target's use of the spectrum is expected to be impacted and/or
   * how well it actually was impacted, for a specific jamming mission.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JammingPerformance")
  private Set<JammingPerformance> jammingPerformance;

  /**
   * Get the method by which the jamming antenna beam is focused..
   * <p>
   * @return the AntStabilisation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAntStabilisation() {
    return antStabilisation;
  }

  /**
   * Set the method by which the jamming antenna beam is focused..
   * <p>
   * @param value the AntStabilisation value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAntStabilisation(TString value) {
    this.antStabilisation = value;
  }

  /**
   * Determine if the AntStabilisation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntStabilisation() {
    return (this.antStabilisation != null ? this.antStabilisation.isSetValue() : false);
  }

  /**
   * Get the bearing of the target in degrees referenced to the "boresight" of
   * the jammer equipment or the platform that the jammer equipment is mounted
   * on..
   * <p>
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getBearing() {
    return bearing;
  }

  /**
   * Set the bearing of the target in degrees referenced to the "boresight" of
   * the jammer equipment or the platform that the jammer equipment is mounted
   * on..
   * <p>
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setBearing(Az value) {
    this.bearing = value;
  }

  /**
   * Determine if the Bearing is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBearing() {
    return (this.bearing != null ? this.bearing.isSetValue() : false);
  }

  /**
   * Get the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the discrete frequency, or frequency range minimum value, planned for
   * denial of use..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the discrete frequency, or frequency range minimum value, planned for
   * denial of use..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the geographic latitude of the target location, including hemisphere
   * (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees latitude requires two digits and should not exceed 90 degrees;
   * enter N or S immediately following the seconds. Use leading zeros..
   * <p>
   * @return a {@link Lat} instance
   * @since 3.1.0
   */
  public Lat getLat() {
    return lat;
  }

  /**
   * Set the geographic latitude of the target location, including hemisphere
   * (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees latitude requires two digits and should not exceed 90 degrees;
   * enter N or S immediately following the seconds. Use leading zeros..
   * <p>
   * @param value a {@link Lat} instance
   * @since 3.1.0
   */
  public void setLat(Lat value) {
    this.lat = value;
  }

  /**
   * Determine if the Lat is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLat() {
    return (this.lat != null ? this.lat.isSetValue() : false);
  }

  /**
   * Get In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLoadset()} instead.
   */
  @Deprecated
  public Serial getLoadsetRef() {
    return loadsetRef;
  }

  /**
   * Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLoadset(Loadset)} instead.
   */
  @Deprecated
  public void setLoadsetRef(Serial value) {
    this.loadsetRef = value;
  }

  /**
   * Determine if the LoadsetRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadsetRef() {
    return (this.loadsetRef != null ? this.loadsetRef.isSetValue() : false);
  }

  /**
   * Get the unique reference of an existing Location dataset that describes the
   * target location. .
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getLocationRef() {
    return locationRef;
  }

  /**
   * Set the unique reference of an existing Location dataset that describes the
   * target location. .
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setLocationRef(Serial value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Get the geographical longitude of the target location, including hemisphere
   * (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees longitude requires three digits and should not exceed 180 degrees;
   * enter E or W immediately following the seconds. Use leading zeros..
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getLon() {
    return lon;
  }

  /**
   * Set the geographical longitude of the target location, including hemisphere
   * (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees longitude requires three digits and should not exceed 180 degrees;
   * enter E or W immediately following the seconds. Use leading zeros..
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setLon(Lon value) {
    this.lon = value;
  }

  /**
   * Determine if the Lon is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLon() {
    return (this.lon != null ? this.lon.isSetValue() : false);
  }

  /**
   * Get the antenna polarisation planned for the desired jamming instance..
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the antenna polarisation planned for the desired jamming instance..
   * <p>
   * @param value the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPolarisationType(TString value) {
    this.polarisationType = value;
  }

  /**
   * Determine if the PolarisationType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationType() {
    return (this.polarisationType != null ? this.polarisationType.isSetValue() : false);
  }

  /**
   * Get the desired power value planned to be directed at the target..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPower() {
    return power;
  }

  /**
   * Set the desired power value planned to be directed at the target..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPower(dBW value) {
    this.power = value;
  }

  /**
   * Determine if the Power is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return (this.power != null ? this.power.isSetValue() : false);
  }

  /**
   * Get a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getTargetID() {
    return targetID;
  }

  /**
   * Set a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setTargetID(UN5 value) {
    this.targetID = value;
  }

  /**
   * Determine if the TargetID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTargetID() {
    return (this.targetID != null ? this.targetID.isSetValue() : false);
  }

  /**
   * Get the US:JammingPerformance
   * <p>
   * Complex element JammingPerformance (US) describes Electronic Attack
   * effectiveness and how severely a target's use of the spectrum is expected
   * to be impacted and/or how well it actually was impacted, for a specific
   * jamming mission..
   * <p>
   * @return a {@link JammingPerformance} instance
   * @since 3.1.0
   */
  public Set<JammingPerformance> getJammingPerformance() {
    if (jammingPerformance == null) {
      jammingPerformance = new HashSet<>();
    }
    return this.jammingPerformance;
  }

  /**
   * Determine if the JammingPerformance is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJammingPerformance() {
    return ((this.jammingPerformance != null) && (!this.jammingPerformance.isEmpty()));
  }

  /**
   * Clear the JammingPerformance field. This sets the field to null.
   */
  public void unsetJammingPerformance() {
    this.jammingPerformance = null;
  }

  /**
   * Set the method by which the jamming antenna beam is focused.
   * <p>
   * @param value An instances of type {@link ListUWG}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withAntStabilisation(ListUWG value) {
    setAntStabilisation(new TString(value.value()));
    return this;
  }

  /**
   * Set the bearing of the target in degrees referenced to the "boresight" of
   * the jammer equipment or the platform that the jammer equipment is mounted
   * on.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withBearing(Double value) {
    setBearing(new Az(value));
    return this;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the geographic latitude of the target location, including hemisphere
   * (H). The format for Lat is ddmmss[.hh]H (where H = N or S). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees latitude requires two digits and should not exceed 90 degrees;
   * enter N or S immediately following the seconds. Use leading zeros.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withLat(String value) {
    setLat(new Lat(value));
    return this;
  }

  /**
   * Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLoadset(Loadset)} instead.
   */
  @Deprecated
  public JammingTarget withLoadsetRef(Serial value) {
    setLoadsetRef(value);
    return this;
  }

  /**
   * Set the unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withLocationRef(Serial value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set the geographical longitude of the target location, including hemisphere
   * (H). The format for Lon is dddmmss[.hh]H (where H = E or W). Seconds may
   * have a decimal point followed by up to two numerals. If seconds are not
   * known, use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities, where seconds MUST be entered.
   * Degrees longitude requires three digits and should not exceed 180 degrees;
   * enter E or W immediately following the seconds. Use leading zeros.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withLon(String value) {
    setLon(new Lon(value));
    return this;
  }

  /**
   * Set the antenna polarisation planned for the desired jamming instance.
   * <p>
   * @param value An instances of type {@link ListCPO}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withPolarisationType(ListCPO value) {
    setPolarisationType(new TString(value.value()));
    return this;
  }

  /**
   * Set the desired power value planned to be directed at the target.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withPower(Double value) {
    setPower(new dBW(value));
    return this;
  }

  /**
   * Set a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withTargetID(Integer value) {
    setTargetID(new UN5(value));
    return this;
  }

  /**
   * Set the US:JammingPerformance
   * <p>
   * Complex element JammingPerformance (US) describes Electronic Attack
   * effectiveness and how severely a target's use of the spectrum is expected
   * to be impacted and/or how well it actually was impacted, for a specific
   * jamming mission.
   * <p>
   * @param values One or more instances of type {@link JammingPerformance...}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withJammingPerformance(JammingPerformance... values) {
    if (values != null) {
      getJammingPerformance().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:JammingPerformance
   * <p>
   * Complex element JammingPerformance (US) describes Electronic Attack
   * effectiveness and how severely a target's use of the spectrum is expected
   * to be impacted and/or how well it actually was impacted, for a specific
   * jamming mission.
   * <p>
   * @param values A collection of {@link JammingPerformance} instances
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withJammingPerformance(Collection<JammingPerformance> values) {
    if (values != null) {
      getJammingPerformance().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JammingTarget instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JammingTarget {"
           + (antStabilisation != null ? "\n antStabilisation [" + antStabilisation + "]" : "")
           + (bearing != null ? "\n bearing [" + bearing + "]" : "")
           + (freqMax != null ? "\n freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? "\n freqMin [" + freqMin + "]" : "")
           + (jammingPerformance != null ? "\n jammingPerformance [" + jammingPerformance + "]" : "")
           + (lat != null ? "\n lat [" + lat + "]" : "")
           + (loadsetRef != null ? "\n loadsetRef [" + loadsetRef + "]" : "")
           + (locationRef != null ? "\n locationRef [" + locationRef + "]" : "")
           + (lon != null ? "\n lon [" + lon + "]" : "")
           + (polarisationType != null ? "\n polarisationType [" + polarisationType + "]" : "")
           + (power != null ? "\n power [" + power + "]" : "")
           + (targetID != null ? "\n targetID [" + targetID + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingTarget} requires {@link FreqM FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains
   * the details to be used for this jamming instance.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Loadset loadset;

  /**
   * Get In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance..
   * <p>
   * @return a {@link Loadset} instance
   * @since 3.1.0
   */
  public Loadset getLoadset() {
    return loadset;
  }

  /**
   * Determine if the loadset field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadset() {
    return this.loadset != null;
  }

  /**
   * Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance.
   * <p>
   * @param value An instances of type {@link Loadset}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withLoadset(Loadset value) {
    this.loadset = value;
    return this;
  }

  /**
   * LocationRef - Location Serial (Optional)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location location;

  /**
   * Get the serial of the referenced Location..
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value An instances of type {@link Location}.
   * @return The current JammingTarget object instance.
   * @since 3.1.0
   */
  public JammingTarget withLocation(Location value) {
    this.location = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this JammingTarget record.
   * <p>
   * This method builds the exported {@link #loadsetRef} field with values from
   * the transient {@link #loadset} field. This method should typically be
   * called after the JammingTarget is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.loadsetRef = loadset != null ? loadset.getSerial() : this.loadsetRef;
    this.locationRef = location != null ? location.getSerial() : this.locationRef;
  }

  /**
   * Update the SSRF data type references in this JammingTarget record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #loadset} with values from the
   * imported {@link #loadsetRef} field. This method should typically be called
   * after the JammingTarget is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (loadsetRef == null || !loadsetRef.isSetValue()) {
      return;
    }
    for (Loadset instance : root.getLoadset()) {
      if (loadsetRef.equals(instance.getSerial())) {
        loadset = instance;
        return;
      }
    }
    if (locationRef == null || !locationRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.equals(instance.getSerial())) {
        location = instance;
        return;
      }
    }
  }//</editor-fold>

}
