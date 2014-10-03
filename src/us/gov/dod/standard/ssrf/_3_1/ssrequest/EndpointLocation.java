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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * EndpointLocation defines locations where the diagram endpoint is allowed or
 * forbidden from use.
 * <p>
 * Element of {@link DiagramEndpoint}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointLocation", propOrder = {
  "antennaHeight",
  "excluded",
  "locSatRef",
  "minPointAngle",
  "siteElevation"
})
public class EndpointLocation {

  /**
   * AntennaHeight - Antenna Height (Optional)
   * <p>
   * The antenna height above the ground level.
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "AntennaHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal antennaHeight;
  /**
   * Excluded - Exclude Location (Optional)
   * <p>
   * Whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * LocSatRef - Location or Satellite Reference (Optional)
   * <p>
   * A reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LocSatRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locSatRef;
  /**
   * MinPointAngle - Minimum Pointing Angle (Optional)
   * <p>
   * The minimum vertical pointing angle for satellite ground station antennas.
   * <p>
   * Format is UN(5,2) [0..180] (deg)
   */
  @XmlElement(name = "MinPointAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal minPointAngle;
  /**
   * SiteElevation - Site Elevation (Optional)
   * <p>
   * The site elevation of each base station and repeater in a trunking system.
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "SiteElevation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal siteElevation;

  /**
   * Get the antenna height above the ground level.
   * <p>
   * @return the AntennaHeight value in a {@link TDecimal} data type
   */
  public TDecimal getAntennaHeight() {
    return antennaHeight;
  }

  /**
   * Set the antenna height above the ground level.
   * <p>
   * @param value the AntennaHeight value in a {@link TDecimal} data type
   */
  public void setAntennaHeight(TDecimal value) {
    this.antennaHeight = value;
  }

  /**
   * Determine if the AntennaHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntennaHeight() {
    return (this.antennaHeight != null ? this.antennaHeight.isSetValue() : false);
  }

  /**
   * Get whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @return the Excluded value in a {@link TString} data type
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @param value the Excluded value in a {@link TString} data type
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  /**
   * Determine if the Excluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExcluded() {
    return (this.excluded != null ? this.excluded.isSetValue() : false);
  }

  /**
   * Get a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @return the LocSatRef value in a {@link TString} data type
   */
  public TString getLocSatRef() {
    return locSatRef;
  }

  /**
   * Set a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @param value the LocSatRef value in a {@link TString} data type
   */
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
   * Get the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @return the MinPointAngle value in a {@link TDecimal} data type
   */
  public TDecimal getMinPointAngle() {
    return minPointAngle;
  }

  /**
   * Set the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @param value the MinPointAngle value in a {@link TDecimal} data type
   */
  public void setMinPointAngle(TDecimal value) {
    this.minPointAngle = value;
  }

  /**
   * Determine if the MinPointAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMinPointAngle() {
    return (this.minPointAngle != null ? this.minPointAngle.isSetValue() : false);
  }

  /**
   * Get the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @return the SiteElevation value in a {@link TDecimal} data type
   */
  public TDecimal getSiteElevation() {
    return siteElevation;
  }

  /**
   * Set the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @param value the SiteElevation value in a {@link TDecimal} data type
   */
  public void setSiteElevation(TDecimal value) {
    this.siteElevation = value;
  }

  /**
   * Determine if the SiteElevation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSiteElevation() {
    return (this.siteElevation != null ? this.siteElevation.isSetValue() : false);
  }

  /**
   * Set the antenna height above the ground level.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation withAntennaHeight(Double value) {
    setAntennaHeight(new TDecimal(value));
    return this;
  }

  /**
   * Set whether the referenced Location is included or excluded at this diagram
   * endpoint.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set a reference to a geographic location or satellite associated with this
   * diagram endpoint. Note for the USA: When coordinating with NTIA, a location
   * is required for base stations and repeaters of trunking systems and
   * satellite ground stations, and satellite orbital characteristics are
   * required for space systems.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation withLocSatRef(String value) {
    setLocSatRef(new TString(value));
    return this;
  }

  /**
   * Set the minimum vertical pointing angle for satellite ground station
   * antennas.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation withMinPointAngle(Double value) {
    setMinPointAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the site elevation of each base station and repeater in a trunking
   * system.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current EndpointLocation object instance
   */
  public EndpointLocation withSiteElevation(Double value) {
    setSiteElevation(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this EndpointLocation instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EndpointLocation {"
      + (excluded != null ? " excluded [" + excluded + "]" : "")
      + (antennaHeight != null ? " antennaHeight [" + antennaHeight + "]" : "")
      + (locSatRef != null ? " locSatRef [" + locSatRef + "]" : "")
      + (siteElevation != null ? " siteElevation [" + siteElevation + "]" : "")
      + (minPointAngle != null ? " minPointAngle [" + minPointAngle + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EndpointLocation} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
