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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.antenna.AntHardware;
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAT;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCRS;

/**
 * Antenna is the XML root for all parameters of an Antenna. It also contains
 * various technical parameters of the antenna.
 * <p>
 * Sub-Elements are
 * {@link AntHardware}, {@link AntMode}, {@link Nomenclature}, {@link POCInformation}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Antenna cls="U"&gt;
 *   &lt;Serial cls="U"&gt;TUR::AN:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
 *   &lt;AntType cls="U"&gt;Billboard&lt;/AntType&gt;
 *   &lt;Nomenclature&gt;
 *     &lt;Name cls="U"&gt;XYZ&lt;/Name&gt;
 *   &lt;/Nomenclature&gt;
 *   &lt;AntMode&gt;
 *     &lt;All_AntMode_elements/&gt;
 *     &lt;/AntMode&gt;
 *   &lt;/Antenna&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Antenna", propOrder = {
  "generic",
  "antType",
  "phArrayNumMainBeams",
  "phArrayNumElements",
  "shape",
  "diameter",
  "horzDimension",
  "vertDimension",
  "apertureDiameter",
  "horzAperture",
  "vertAperture",
  "horzSidelobeSuppressed",
  "horzSidelobeAz",
  "horzSidelobeAttenuation",
  "vertSidelobeSuppressed",
  "vertSidelobeElev",
  "vertSidelobeAttenuation",
  "pocInformation",
  "nomenclature",
  "antHardware",
  "antMode",
  "usingCountries"
})
public class Antenna extends Common<Antenna> {

  /**
   * Generic - Generic indicator (Required)
   * <p>
   * "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Generic", required = true)
  private TString generic;
  /**
   * AntType - Antenna Type (Required)
   * <p>
   * The type of antenna.
   * <p>
   * Format is L:CAT
   */
  @XmlElement(name = "AntType", required = true)
  private TString antType;
  /**
   * PhArrayNumMainBeams - Number of Main Beams in the Phased Array (Optional)
   * <p>
   * The number of main beams in the phased array antenna.
   * <p>
   * Format is UN(3)
   */
  @XmlElement(name = "PhArrayNumMainBeams", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN3.class)
  private TInteger phArrayNumMainBeams;
  /**
   * PhArrayNumElements - Number of elements in the Phased Array (Optional)
   * <p>
   * The number of antenna elements in the phased array antenna.
   * <p>
   * Format is UN(5)
   */
  @XmlElement(name = "PhArrayNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger phArrayNumElements;
  /**
   * Shape - Antenna Shape (Optional)
   * <p>
   * A code used to describe the general shape of the antenna reflector.
   * <p>
   * Format is L:CRS
   * <p>
   * Attribute group Dimension (Optional)
   */
  @XmlElement(name = "Shape", required = false)
  private TString shape;
  /**
   * ApertureDiameter - Aperture Diameter (Optional)
   * <p>
   * The cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Aperture (Optional)
   */
  @XmlElement(name = "Diameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal diameter;
  /**
   * HorzDimension - Horizontal Dimension (Optional)
   * <p>
   * The linear horizontal dimension of the antenna.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Dimension (Optional)
   */
  @XmlElement(name = "HorzDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal horzDimension;
  /**
   * VertDimension - Vertical Dimension (Optional)
   * <p>
   * The linear vertical dimension of the antenna.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Dimension (Optional)
   */
  @XmlElement(name = "VertDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal vertDimension;
  /**
   * ApertureDiameter - Aperture Diameter (Optional)
   * <p>
   * The cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Aperture (Optional)
   */
  @XmlElement(name = "ApertureDiameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal apertureDiameter;
  /**
   * HorzAperture - Horizontal Aperture (Optional)
   * <p>
   * The horizontal cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Aperture (Optional)
   */
  @XmlElement(name = "HorzAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal horzAperture;
  /**
   * VertAperture - Vertical Aperture (Optional)
   * <p>
   * The vertical cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Aperture (Optional)
   */
  @XmlElement(name = "VertAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDIMENSION.class)
  private TDecimal vertAperture;
  /**
   * HorzSidelobeSuppressed - Horizontal Sidelobe is Suppressed (Optional)
   * <p>
   * If the sidelobe has been suppressed. Enter Yes (if the sidelobe is
   * suppressed) or No (sidelobe not suppressed).
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "HorzSidelobeSuppressed", required = false)
  private TString horzSidelobeSuppressed;
  /**
   * HorzSidelobeAz - Horizontal Sidelobe Azimuth (Optional)
   * <p>
   * The direction of the sidelobe in reference to the direction of maximum
   * gain.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "HorzSidelobeAz", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzSidelobeAz;
  /**
   * HorzSidelobeAttenuation - Horizontal Sidelobe Attenuation (Optional)
   * <p>
   * The amount of suppression relative to the main beam gain of the antenna.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "HorzSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal horzSidelobeAttenuation;
  /**
   * VertSidelobeSuppressed - Vertical Sidelobe is Suppressed (Optional)
   * <p>
   * Whether a portion of the radiation from an antenna outside of the main beam
   * has been suppressed or eliminated..
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "VertSidelobeSuppressed", required = false)
  private TString vertSidelobeSuppressed;
  /**
   * VertSidelobeElev - Vertical Sidelobe Elevation (Optional)
   * <p>
   * The first sidelobe in the vertical plane. Enter the clockwise angular
   * difference (in degrees) between the centre line of the main beam gain and
   * the sidelobe.
   * <p>
   * Format is UN(5,2) [-180..180] (deg)
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "VertSidelobeElev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV180.class)
  private TDecimal vertSidelobeElev;
  /**
   * VertSidelobeAttenuation - Vertical Sidelobe Attenuation (Optional)
   * <p>
   * The attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * Attribute group Sidelobe (Optional)
   */
  @XmlElement(name = "VertSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal vertSidelobeAttenuation;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   */
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  /**
   * AntHardware (Optional)
   * <p>
   * AntHardware contains the physical parameters related to the antenna feed
   * and lead.
   */
  @XmlElement(name = "AntHardware")
  private List<AntHardware> antHardware;
  /**
   * AntMode (Optional)
   * <p>
   * AntMode contains the technical characteristics of one antenna mode.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) AntModes
   */
  @XmlElement(name = "AntMode")
  private List<AntMode> antMode;
  /**
   * US:UsingCountries (Optional)
   * <p>
   * UsingCountries (US) describes the countries that manufacture (Producing),
   * supply (Source), and use (Using) the Antenna.
   */
  @XmlElement(name = "UsingCountries")
  private List<UsingCountries> usingCountries;

  /**
   * Get "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model.
   * <p>
   * @return the Generic value in a {@link TString} data type
   */
  public TString getGeneric() {
    return generic;
  }

  /**
   * Set "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model.
   * <p>
   * @param value the Generic value in a {@link TString} data type
   */
  public void setGeneric(TString value) {
    this.generic = value;
  }

  /**
   * Determine if the Generic is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeneric() {
    return (this.generic != null ? this.generic.isSetValue() : false);
  }

  /**
   * Get the type of antenna.
   * <p>
   * @return the AntType value in a {@link TString} data type
   */
  public TString getAntType() {
    return antType;
  }

  /**
   * Set the type of antenna.
   * <p>
   * @param value the AntType value in a {@link TString} data type
   */
  public void setAntType(TString value) {
    this.antType = value;
  }

  /**
   * Determine if the AntType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntType() {
    return (this.antType != null ? this.antType.isSetValue() : false);
  }

  /**
   * Get the number of main beams in the phased array antenna.
   * <p>
   * @return the PhArrayNumMainBeams value in a {@link TInteger} data type
   */
  public TInteger getPhArrayNumMainBeams() {
    return phArrayNumMainBeams;
  }

  /**
   * Set the number of main beams in the phased array antenna.
   * <p>
   * @param value the PhArrayNumMainBeams value in a {@link TInteger} data type
   */
  public void setPhArrayNumMainBeams(TInteger value) {
    this.phArrayNumMainBeams = value;
  }

  /**
   * Determine if the PhArrayNumMainBeams is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPhArrayNumMainBeams() {
    return (this.phArrayNumMainBeams != null ? this.phArrayNumMainBeams.isSetValue() : false);
  }

  /**
   * Get the number of antenna elements in the phased array antenna.
   * <p>
   * @return the PhArrayNumElements value in a {@link TInteger} data type
   */
  public TInteger getPhArrayNumElements() {
    return phArrayNumElements;
  }

  /**
   * Set the number of antenna elements in the phased array antenna.
   * <p>
   * @param value the PhArrayNumElements value in a {@link TInteger} data type
   */
  public void setPhArrayNumElements(TInteger value) {
    this.phArrayNumElements = value;
  }

  /**
   * Determine if the PhArrayNumElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPhArrayNumElements() {
    return (this.phArrayNumElements != null ? this.phArrayNumElements.isSetValue() : false);
  }

  /**
   * Get a code used to describe the general shape of the antenna reflector.
   * <p>
   * @return the Shape value in a {@link TString} data type
   */
  public TString getShape() {
    return shape;
  }

  /**
   * Set a code used to describe the general shape of the antenna reflector.
   * <p>
   * @param value the Shape value in a {@link TString} data type
   */
  public void setShape(TString value) {
    this.shape = value;
  }

  /**
   * Determine if the Shape is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetShape() {
    return (this.shape != null ? this.shape.isSetValue() : false);
  }

  /**
   * Get the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @return the Diameter value in a {@link TDecimal} data type
   */
  public TDecimal getDiameter() {
    return diameter;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value the Diameter value in a {@link TDecimal} data type
   */
  public void setDiameter(TDecimal value) {
    this.diameter = value;
  }

  /**
   * Determine if the Diameter is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDiameter() {
    return (this.diameter != null ? this.diameter.isSetValue() : false);
  }

  /**
   * Get the linear horizontal dimension of the antenna.
   * <p>
   * @return the HorzDimension value in a {@link TDecimal} data type
   */
  public TDecimal getHorzDimension() {
    return horzDimension;
  }

  /**
   * Set the linear horizontal dimension of the antenna.
   * <p>
   * @param value the HorzDimension value in a {@link TDecimal} data type
   */
  public void setHorzDimension(TDecimal value) {
    this.horzDimension = value;
  }

  /**
   * Determine if the HorzDimension is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzDimension() {
    return (this.horzDimension != null ? this.horzDimension.isSetValue() : false);
  }

  /**
   * Get the linear vertical dimension of the antenna.
   * <p>
   * @return the VertDimension value in a {@link TDecimal} data type
   */
  public TDecimal getVertDimension() {
    return vertDimension;
  }

  /**
   * Set the linear vertical dimension of the antenna.
   * <p>
   * @param value the VertDimension value in a {@link TDecimal} data type
   */
  public void setVertDimension(TDecimal value) {
    this.vertDimension = value;
  }

  /**
   * Determine if the VertDimension is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertDimension() {
    return (this.vertDimension != null ? this.vertDimension.isSetValue() : false);
  }

  /**
   * Get the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @return the ApertureDiameter value in a {@link TDecimal} data type
   */
  public TDecimal getApertureDiameter() {
    return apertureDiameter;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value the ApertureDiameter value in a {@link TDecimal} data type
   */
  public void setApertureDiameter(TDecimal value) {
    this.apertureDiameter = value;
  }

  /**
   * Determine if the ApertureDiameter is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApertureDiameter() {
    return (this.apertureDiameter != null ? this.apertureDiameter.isSetValue() : false);
  }

  /**
   * Get the horizontal cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @return the HorzAperture value in a {@link TDecimal} data type
   */
  public TDecimal getHorzAperture() {
    return horzAperture;
  }

  /**
   * Set the horizontal cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @param value the HorzAperture value in a {@link TDecimal} data type
   */
  public void setHorzAperture(TDecimal value) {
    this.horzAperture = value;
  }

  /**
   * Determine if the HorzAperture is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzAperture() {
    return (this.horzAperture != null ? this.horzAperture.isSetValue() : false);
  }

  /**
   * Get the vertical cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @return the VertAperture value in a {@link TDecimal} data type
   */
  public TDecimal getVertAperture() {
    return vertAperture;
  }

  /**
   * Set the vertical cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @param value the VertAperture value in a {@link TDecimal} data type
   */
  public void setVertAperture(TDecimal value) {
    this.vertAperture = value;
  }

  /**
   * Determine if the VertAperture is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertAperture() {
    return (this.vertAperture != null ? this.vertAperture.isSetValue() : false);
  }

  /**
   * Get if the sidelobe has been suppressed. Enter Yes (if the sidelobe is
   * suppressed) or No (sidelobe not suppressed).
   * <p>
   * @return the HorzSidelobeSuppressed value in a {@link TString} data type
   */
  public TString getHorzSidelobeSuppressed() {
    return horzSidelobeSuppressed;
  }

  /**
   * Set if the sidelobe has been suppressed. Enter Yes (if the sidelobe is
   * suppressed) or No (sidelobe not suppressed).
   * <p>
   * @param value the HorzSidelobeSuppressed value in a {@link TString} data
   *              type
   */
  public void setHorzSidelobeSuppressed(TString value) {
    this.horzSidelobeSuppressed = value;
  }

  /**
   * Determine if the HorzSidelobeSuppressed is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzSidelobeSuppressed() {
    return (this.horzSidelobeSuppressed != null ? this.horzSidelobeSuppressed.isSetValue() : false);
  }

  /**
   * Get the direction of the sidelobe in reference to the direction of maximum
   * gain.
   * <p>
   * @return the HorzSidelobeAz value in a {@link TDecimal} data type
   */
  public TDecimal getHorzSidelobeAz() {
    return horzSidelobeAz;
  }

  /**
   * Set the direction of the sidelobe in reference to the direction of maximum
   * gain.
   * <p>
   * @param value the HorzSidelobeAz value in a {@link TDecimal} data type
   */
  public void setHorzSidelobeAz(TDecimal value) {
    this.horzSidelobeAz = value;
  }

  /**
   * Determine if the HorzSidelobeAz is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzSidelobeAz() {
    return (this.horzSidelobeAz != null ? this.horzSidelobeAz.isSetValue() : false);
  }

  /**
   * Get the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @return the HorzSidelobeAttenuation value in a {@link TDecimal} data type
   */
  public TDecimal getHorzSidelobeAttenuation() {
    return horzSidelobeAttenuation;
  }

  /**
   * Set the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @param value the HorzSidelobeAttenuation value in a {@link TDecimal} data
   *              type
   */
  public void setHorzSidelobeAttenuation(TDecimal value) {
    this.horzSidelobeAttenuation = value;
  }

  /**
   * Determine if the HorzSidelobeAttenuation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzSidelobeAttenuation() {
    return (this.horzSidelobeAttenuation != null ? this.horzSidelobeAttenuation.isSetValue() : false);
  }

  /**
   * Get whether a portion of the radiation from an antenna outside of the main
   * beam has been suppressed or eliminated..
   * <p>
   * @return the VertSidelobeSuppressed value in a {@link TString} data type
   */
  public TString getVertSidelobeSuppressed() {
    return vertSidelobeSuppressed;
  }

  /**
   * Set whether a portion of the radiation from an antenna outside of the main
   * beam has been suppressed or eliminated..
   * <p>
   * @param value the VertSidelobeSuppressed value in a {@link TString} data
   *              type
   */
  public void setVertSidelobeSuppressed(TString value) {
    this.vertSidelobeSuppressed = value;
  }

  /**
   * Determine if the VertSidelobeSuppressed is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertSidelobeSuppressed() {
    return (this.vertSidelobeSuppressed != null ? this.vertSidelobeSuppressed.isSetValue() : false);
  }

  /**
   * Get the first sidelobe in the vertical plane. Enter the clockwise angular
   * difference (in degrees) between the centre line of the main beam gain and
   * the sidelobe.
   * <p>
   * @return the VertSidelobeElev value in a {@link TDecimal} data type
   */
  public TDecimal getVertSidelobeElev() {
    return vertSidelobeElev;
  }

  /**
   * Set the first sidelobe in the vertical plane. Enter the clockwise angular
   * difference (in degrees) between the centre line of the main beam gain and
   * the sidelobe.
   * <p>
   * @param value the VertSidelobeElev value in a {@link TDecimal} data type
   */
  public void setVertSidelobeElev(TDecimal value) {
    this.vertSidelobeElev = value;
  }

  /**
   * Determine if the VertSidelobeElev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertSidelobeElev() {
    return (this.vertSidelobeElev != null ? this.vertSidelobeElev.isSetValue() : false);
  }

  /**
   * Get the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @return the VertSidelobeAttenuation value in a {@link TDecimal} data type
   */
  public TDecimal getVertSidelobeAttenuation() {
    return vertSidelobeAttenuation;
  }

  /**
   * Set the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @param value the VertSidelobeAttenuation value in a {@link TDecimal} data
   *              type
   */
  public void setVertSidelobeAttenuation(TDecimal value) {
    this.vertSidelobeAttenuation = value;
  }

  /**
   * Determine if the VertSidelobeAttenuation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertSidelobeAttenuation() {
    return (this.vertSidelobeAttenuation != null ? this.vertSidelobeAttenuation.isSetValue() : false);
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link POCInformation}
   *         instances
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
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a non-null but possibly empty list of {@link Nomenclature}
   *         instances
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
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
   * Get the AntHardware
   * <p>
   * Complex element AntHardware contains the physical parameters related to the
   * antenna feed and lead.
   * <p>
   * @return a non-null but possibly empty list of {@link AntHardware} instances
   */
  public List<AntHardware> getAntHardware() {
    if (antHardware == null) {
      antHardware = new ArrayList<>();
    }
    return this.antHardware;
  }

  /**
   * Determine if the AntHardware is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntHardware() {
    return ((this.antHardware != null) && (!this.antHardware.isEmpty()));
  }

  /**
   * Clear the AntHardware field. This sets the field to null.
   */
  public void unsetAntHardware() {
    this.antHardware = null;
  }

  /**
   * Get the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @return a non-null but possibly empty list of {@link AntMode} instances
   */
  public List<AntMode> getAntMode() {
    if (antMode == null) {
      antMode = new ArrayList<>();
    }
    return this.antMode;
  }

  /**
   * Determine if the AntMode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntMode() {
    return ((this.antMode != null) && (!this.antMode.isEmpty()));
  }

  /**
   * Clear the AntMode field. This sets the field to null.
   */
  public void unsetAntMode() {
    this.antMode = null;
  }

  /**
   * Get the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Antenna.
   * <p>
   * @return a non-null but possibly empty list of {@link UsingCountries}
   *         instances
   */
  public List<UsingCountries> getUsingCountries() {
    if (usingCountries == null) {
      usingCountries = new ArrayList<>();
    }
    return this.usingCountries;
  }

  /**
   * Determine if the UsingCountries is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsingCountries() {
    return ((this.usingCountries != null) && (!this.usingCountries.isEmpty()));
  }

  /**
   * Clear the UsingCountries field. This sets the field to null.
   */
  public void unsetUsingCountries() {
    this.usingCountries = null;
  }

  /**
   * Set "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Antenna object instance
   */
  public Antenna withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of antenna.
   * <p>
   * @param value An instances of type {@link ListCAT}
   * @return The current Antenna object instance
   */
  public Antenna withAntType(ListCAT value) {
    setAntType(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of main beams in the phased array antenna.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Antenna object instance
   */
  public Antenna withPhArrayNumMainBeams(Integer value) {
    setPhArrayNumMainBeams(new TInteger(value));
    return this;
  }

  /**
   * Set the number of antenna elements in the phased array antenna.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Antenna object instance
   */
  public Antenna withPhArrayNumElements(Integer value) {
    setPhArrayNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set a code used to describe the general shape of the antenna reflector.
   * <p>
   * @param value An instances of type {@link ListCRS}
   * @return The current Antenna object instance
   */
  public Antenna withShape(ListCRS value) {
    setShape(new TString(value.value()));
    return this;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withDiameter(Double value) {
    setDiameter(new TDecimal(value));
    return this;
  }

  /**
   * Set the linear horizontal dimension of the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withHorzDimension(Double value) {
    setHorzDimension(new TDecimal(value));
    return this;
  }

  /**
   * Set the linear vertical dimension of the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withVertDimension(Double value) {
    setVertDimension(new TDecimal(value));
    return this;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withApertureDiameter(Double value) {
    setApertureDiameter(new TDecimal(value));
    return this;
  }

  /**
   * Set the horizontal cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withHorzAperture(Double value) {
    setHorzAperture(new TDecimal(value));
    return this;
  }

  /**
   * Set the vertical cross-section of the antenna radiation pattern in the
   * direction of highest gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withVertAperture(Double value) {
    setVertAperture(new TDecimal(value));
    return this;
  }

  /**
   * Set if the sidelobe has been suppressed. Enter Yes (if the sidelobe is
   * suppressed) or No (sidelobe not suppressed).
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Antenna object instance
   */
  public Antenna withHorzSidelobeSuppressed(ListCBO value) {
    setHorzSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  /**
   * Set the direction of the sidelobe in reference to the direction of maximum
   * gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withHorzSidelobeAz(Double value) {
    setHorzSidelobeAz(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withHorzSidelobeAttenuation(Double value) {
    setHorzSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  /**
   * Set whether a portion of the radiation from an antenna outside of the main
   * beam has been suppressed or eliminated..
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Antenna object instance
   */
  public Antenna withVertSidelobeSuppressed(ListCBO value) {
    setVertSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  /**
   * Set the first sidelobe in the vertical plane. Enter the clockwise angular
   * difference (in degrees) between the centre line of the main beam gain and
   * the sidelobe.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withVertSidelobeElev(Double value) {
    setVertSidelobeElev(new TDecimal(value));
    return this;
  }

  /**
   * Set the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Antenna object instance
   */
  public Antenna withVertSidelobeAttenuation(Double value) {
    setVertSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation}
   * @return The current Antenna object instance
   */
  public Antenna withPOCInformation(POCInformation... values) {
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
   * @return The current Antenna object instance
   */
  public Antenna withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
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
   * @param values One or more instances of type {@link Nomenclature}
   * @return The current Antenna object instance
   */
  public Antenna withNomenclature(Nomenclature... values) {
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
   * @return The current Antenna object instance
   */
  public Antenna withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntHardware
   * <p>
   * Complex element AntHardware contains the physical parameters related to the
   * antenna feed and lead.
   * <p>
   * @param values One or more instances of type {@link AntHardware}
   * @return The current Antenna object instance
   */
  public Antenna withAntHardware(AntHardware... values) {
    if (values != null) {
      getAntHardware().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntHardware
   * <p>
   * Complex element AntHardware contains the physical parameters related to the
   * antenna feed and lead.
   * <p>
   * @param values A collection of {@link AntHardware} instances
   * @return The current Antenna object instance
   */
  public Antenna withAntHardware(Collection<AntHardware> values) {
    if (values != null) {
      getAntHardware().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @param values One or more instances of type {@link AntMode}
   * @return The current Antenna object instance
   */
  public Antenna withAntMode(AntMode... values) {
    if (values != null) {
      getAntMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @param values A collection of {@link AntMode} instances
   * @return The current Antenna object instance
   */
  public Antenna withAntMode(Collection<AntMode> values) {
    if (values != null) {
      getAntMode().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Antenna.
   * <p>
   * @param values One or more instances of type {@link UsingCountries}
   * @return The current Antenna object instance
   */
  public Antenna withUsingCountries(UsingCountries... values) {
    if (values != null) {
      getUsingCountries().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Antenna.
   * <p>
   * @param values A collection of {@link UsingCountries} instances
   * @return The current Antenna object instance
   */
  public Antenna withUsingCountries(Collection<UsingCountries> values) {
    if (values != null) {
      getUsingCountries().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Antenna instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Antenna {"
      + (generic != null ? " generic [" + generic + "]" : "")
      + (phArrayNumElements != null ? " phArrayNumElements [" + phArrayNumElements + "]" : "")
      + (horzAperture != null ? " horzAperture [" + horzAperture + "]" : "")
      + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
      + (diameter != null ? " diameter [" + diameter + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (horzSidelobeAz != null ? " horzSidelobeAz [" + horzSidelobeAz + "]" : "")
      + (phArrayNumMainBeams != null ? " phArrayNumMainBeams [" + phArrayNumMainBeams + "]" : "")
      + (vertAperture != null ? " vertAperture [" + vertAperture + "]" : "")
      + (vertSidelobeAttenuation != null ? " vertSidelobeAttenuation [" + vertSidelobeAttenuation + "]" : "")
      + (antMode != null ? " antMode [" + antMode + "]" : "")
      + (vertDimension != null ? " vertDimension [" + vertDimension + "]" : "")
      + (shape != null ? " shape [" + shape + "]" : "")
      + (horzDimension != null ? " horzDimension [" + horzDimension + "]" : "")
      + (vertSidelobeSuppressed != null ? " vertSidelobeSuppressed [" + vertSidelobeSuppressed + "]" : "")
      + (antType != null ? " antType [" + antType + "]" : "")
      + (antHardware != null ? " antHardware [" + antHardware + "]" : "")
      + (vertSidelobeElev != null ? " vertSidelobeElev [" + vertSidelobeElev + "]" : "")
      + (horzSidelobeAttenuation != null ? " horzSidelobeAttenuation [" + horzSidelobeAttenuation + "]" : "")
      + (usingCountries != null ? " usingCountries [" + usingCountries + "]" : "")
      + (apertureDiameter != null ? " apertureDiameter [" + apertureDiameter + "]" : "")
      + (horzSidelobeSuppressed != null ? " horzSidelobeSuppressed [" + horzSidelobeSuppressed + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Antenna} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString AntType}, {@link TString Generic}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAntType() && isSetGeneric();
  }

}
