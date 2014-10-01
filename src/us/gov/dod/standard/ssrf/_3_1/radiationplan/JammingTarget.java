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
package us.gov.dod.standard.ssrf._3_1.radiationplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.RadiationPlan;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Bearing", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal bearing;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
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
   */
  @XmlElement(name = "Lat", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  /**
   * In Data Item LoadsetRef (US), the serial of a Loadset dataset that contains
   * the details to be used for this jamming instance.
   */
  @XmlElement(name = "LoadsetRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString loadsetRef;
  /**
   * US:LocationRef - Target Location Serial (Optional)
   * <p>
   * The unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LocationRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locationRef;
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
   */
  @XmlElement(name = "Lon", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  /**
   * US:PolarisationType - Polarisation (Optional)
   * <p>
   * The antenna polarisation planned for the desired jamming instance.
   * <p>
   * Format is L:CPO
   */
  @XmlElement(name = "PolarisationType", required = false)
  private TString polarisationType;
  /**
   * US:Power - Power (Optional)
   * <p>
   * The desired power value planned to be directed at the target.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "Power", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal power;
  /**
   * US:TargetID - Taget ID (Optional)
   * <p>
   * A unique (within the parent JammingPlan) numeric identifier to distinguish
   * one target from another.
   * <p>
   * Format is UN(5)
   */
  @XmlElement(name = "TargetID", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger targetID;
  /**
   * US:JammingPerformance (Optional)
   * <p>
   * JammingPerformance (US) describes Electronic Attack effectiveness and how
   * severely a target's use of the spectrum is expected to be impacted and/or
   * how well it actually was impacted, for a specific jamming mission.
   */
  @XmlElement(name = "JammingPerformance")
  private List<JammingPerformance> jammingPerformance;

  /**
   * Get the method by which the jamming antenna beam is focused.
   * <p>
   * @return the AntStabilisation value in a {@link TString} data type
   */
  public TString getAntStabilisation() {
    return antStabilisation;
  }

  /**
   * Set the method by which the jamming antenna beam is focused.
   * <p>
   * @param value the AntStabilisation value in a {@link TString} data type
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
   * on.
   * <p>
   * @return the Bearing value in a {@link TDecimal} data type
   */
  public TDecimal getBearing() {
    return bearing;
  }

  /**
   * Set the bearing of the target in degrees referenced to the "boresight" of
   * the jammer equipment or the platform that the jammer equipment is mounted
   * on.
   * <p>
   * @param value the Bearing value in a {@link TDecimal} data type
   */
  public void setBearing(TDecimal value) {
    this.bearing = value;
  }

  /**
   * Determine if the Bearing is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBearing() {
    return (this.bearing != null ? this.bearing.isSetValue() : false);
  }

  /**
   * Get the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * enter N or S immediately following the seconds. Use leading zeros.
   * <p>
   * @return the Lat value in a {@link TString} data type
   */
  public TString getLat() {
    return lat;
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
   * @param value the Lat value in a {@link TString} data type
   */
  public void setLat(TString value) {
    this.lat = value;
  }

  /**
   * Determine if the Lat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLat() {
    return (this.lat != null ? this.lat.isSetValue() : false);
  }

  /**
   * Get In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance.
   * <p>
   * @return the LoadsetRef value in a {@link TString} data type
   */
  public TString getLoadsetRef() {
    return loadsetRef;
  }

  /**
   * Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance.
   * <p>
   * @param value the LoadsetRef value in a {@link TString} data type
   */
  public void setLoadsetRef(TString value) {
    this.loadsetRef = value;
  }

  /**
   * Determine if the LoadsetRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadsetRef() {
    return (this.loadsetRef != null ? this.loadsetRef.isSetValue() : false);
  }

  /**
   * Get the unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * @return the LocationRef value in a {@link TString} data type
   */
  public TString getLocationRef() {
    return locationRef;
  }

  /**
   * Set the unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * @param value the LocationRef value in a {@link TString} data type
   */
  public void setLocationRef(TString value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * enter E or W immediately following the seconds. Use leading zeros.
   * <p>
   * @return the Lon value in a {@link TString} data type
   */
  public TString getLon() {
    return lon;
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
   * @param value the Lon value in a {@link TString} data type
   */
  public void setLon(TString value) {
    this.lon = value;
  }

  /**
   * Determine if the Lon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLon() {
    return (this.lon != null ? this.lon.isSetValue() : false);
  }

  /**
   * Get the antenna polarisation planned for the desired jamming instance.
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the antenna polarisation planned for the desired jamming instance.
   * <p>
   * @param value the PolarisationType value in a {@link TString} data type
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
   * Get the desired power value planned to be directed at the target.
   * <p>
   * @return the Power value in a {@link TDecimal} data type
   */
  public TDecimal getPower() {
    return power;
  }

  /**
   * Set the desired power value planned to be directed at the target.
   * <p>
   * @param value the Power value in a {@link TDecimal} data type
   */
  public void setPower(TDecimal value) {
    this.power = value;
  }

  /**
   * Determine if the Power is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return (this.power != null ? this.power.isSetValue() : false);
  }

  /**
   * Get a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another.
   * <p>
   * @return the TargetID value in a {@link TInteger} data type
   */
  public TInteger getTargetID() {
    return targetID;
  }

  /**
   * Set a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another.
   * <p>
   * @param value the TargetID value in a {@link TInteger} data type
   */
  public void setTargetID(TInteger value) {
    this.targetID = value;
  }

  /**
   * Determine if the TargetID is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
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
   * jamming mission.
   * <p>
   * @return a {@link List<JammingPerformance>} instance
   */
  public List<JammingPerformance> getJammingPerformance() {
    if (jammingPerformance == null) {
      jammingPerformance = new ArrayList<>();
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
   * @param value An instances of type {@link ListUWG}
   * @return The current JammingTarget object instance
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
   * @param value An instances of type {@link Double}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withBearing(Double value) {
    setBearing(new TDecimal(value));
    return this;
  }

  /**
   * Set the frequency range maximum value planned for denial of use.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the discrete frequency, or frequency range minimum value, planned for
   * denial of use.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
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
   * @param value An instances of type {@link String}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  /**
   * Set In Data Item LoadsetRef (US), the serial of a Loadset dataset that
   * contains the details to be used for this jamming instance.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withLoadsetRef(String value) {
    setLoadsetRef(new TString(value));
    return this;
  }

  /**
   * Set the unique reference of an existing Location dataset that describes the
   * target location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withLocationRef(String value) {
    setLocationRef(new TString(value));
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
   * @param value An instances of type {@link String}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  /**
   * Set the antenna polarisation planned for the desired jamming instance.
   * <p>
   * @param value An instances of type {@link ListCPO}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withPolarisationType(ListCPO value) {
    setPolarisationType(new TString(value.value()));
    return this;
  }

  /**
   * Set the desired power value planned to be directed at the target.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withPower(Double value) {
    setPower(new TDecimal(value));
    return this;
  }

  /**
   * Set a unique (within the parent JammingPlan) numeric identifier to
   * distinguish one target from another.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JammingTarget object instance
   */
  public JammingTarget withTargetID(Integer value) {
    setTargetID(new TInteger(value));
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
   * @param values One or more instances of type {@link JammingPerformance...}
   * @return The current JammingTarget object instance
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
   * @return The current JammingTarget object instance
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
      + " polarisationType [" + polarisationType + "]"
      + " lon [" + lon + "]"
      + " locationRef [" + locationRef + "]"
      + " targetID [" + targetID + "]"
      + " freqMin [" + freqMin + "]"
      + " jammingPerformance [" + jammingPerformance + "]"
      + " power [" + power + "]"
      + " freqMax [" + freqMax + "]"
      + " bearing [" + bearing + "]"
      + " loadsetRef [" + loadsetRef + "]"
      + " antStabilisation [" + antStabilisation + "]"
      + " lat [" + lat + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingTarget} requires {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

}
