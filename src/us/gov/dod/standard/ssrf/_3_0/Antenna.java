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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;

/**
 * Java class for Antenna complex type.
 * <p>
 * This dataset is the XML root for all parameters of an Antenna. It inherits
 * attributes and sub-elements from element Common. It also contains various
 * technical parameters of the antenna: the type of antenna pattern, the antenna
 * use, and an indication at as to whether or not sector blanking is possible.
 * <p>
 * This element inherits attributes and sub-elements from element Common.
 * <p>
 * [XSL ERR DSTYPE] Part 3 of the Serial reference (dataset type) MUST be "AN".
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
  "antMode"
})
public class Antenna extends Common {

  /**
   * Generic: Enter "Yes" to indicate that the dataset describes typical
   * parameters of a waveform or standard signal, or a generic antenna model,
   * rather than a specific equipment model.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Generic", required = true)
  private TString generic;
  /**
   * AntType: Enter the type of antenna.
   * <p>
   * Recommend values from Code List CAT
   */
  @XmlElement(name = "AntType", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString antType;
  /**
   * PhArrayNumMainBeams: Enter the number of main beams in the phased array
   * antenna
   */
  @XmlElement(name = "PhArrayNumMainBeams", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN3.class)
  private TInteger phArrayNumMainBeams;
  /**
   * PhArrayNumElements: Enter the number of antenna elements in the phased
   * array antenna
   */
  @XmlElement(name = "PhArrayNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger phArrayNumElements;
  /**
   * Shape: Enter a code used to describe the general shape of the antenna
   * reflector. Recommend values from Code List CRS
   */
  @XmlElement(name = "Shape", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString shape;
  /**
   * Diameter: Enter the physical diameter of the antenna in metres (without
   * unit).
   */
  @XmlElement(name = "Diameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal diameter;
  /**
   * HorzDimension: Enter the linear horizontal dimension of the antenna in
   * metres (without unit).
   */
  @XmlElement(name = "HorzDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal horzDimension;
  /**
   * VertDimension: Enter the linear vertical dimension of the antenna in metres
   * (without unit).
   */
  @XmlElement(name = "VertDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal vertDimension;
  /**
   * ApertureDiameter: Enter the cross-section of an antenna's radiation pattern
   * in the direction of highest gain in metres (without unit).
   */
  @XmlElement(name = "ApertureDiameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal apertureDiameter;
  /**
   * HorzAperture: Enter the horizontal cross-section of the antenna's radiation
   * pattern in the direction of highest gain in metres (without unit).
   */
  @XmlElement(name = "HorzAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal horzAperture;
  /**
   * VertAperture: Enter the vertical cross-section of the antenna's radiation
   * pattern in the direction of highest gain in metres (without unit).
   */
  @XmlElement(name = "VertAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal vertAperture;
  /**
   * HorzSidelobeSuppressed: The Horizontal Sidelobe indicates whether a portion
   * of the radiation from an antenna outside of the main beam and usually of
   * much less intensity has been suppressed or eliminated. The suppression or
   * elimination of unwanted signals or interference takes place by means of
   * shielding, filtering, grounding, component relocation, or sometimes
   * redesign of the equipment in use. Enter Y (if the sidelobe is suppressed)
   * or N (sidelobe not suppressed).
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   * <p>
   * This group of items describes the worst case sidelobe attenuation (these
   * values will normally vary between modes, but typically only the worst case
   * data is available).
   */
  @XmlElement(name = "HorzSidelobeSuppressed", required = false)
  private TString horzSidelobeSuppressed;
  /**
   * HorzSidelobeAz: Enter the direction (in degrees) of the sidelobe in
   * reference to the direction of maximum gain.
   */
  @XmlElement(name = "HorzSidelobeAz", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal horzSidelobeAz;
  /**
   * HorzSidelobeAttenuation: Enter the amount of suppression in dB relative to
   * the main beam gain of the antenna.
   */
  @XmlElement(name = "HorzSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal horzSidelobeAttenuation;
  /**
   * VertSidelobeSuppressed: The Vertical Sidelobe indicates whether a portion
   * of the radiation from an antenna outside of the main beam and usually of
   * much less intensity has been suppressed or eliminated. The suppression or
   * elimination of unwanted signals or interference takes place by means of
   * shielding, filtering, grounding, component relocation, or sometimes
   * redesign of the equipment in use. Enter Y (if the sidelobe is suppressed)
   * or N (sidelobe not suppressed).
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "VertSidelobeSuppressed", required = false)
  private TString vertSidelobeSuppressed;
  /**
   * VertSidelobeElev: The Vertical Sidelobe describes the first sidelobe in the
   * vertical plane. Enter the clockwise angular difference (in degrees) between
   * the centre line of the main beam gain and the sidelobe.
   */
  @XmlElement(name = "VertSidelobeElev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV180.class)
  private TDecimal vertSidelobeElev;
  /**
   * VertSidelobeAttenuation: Enter the attenuation of the sidelobe in dB
   * relative to the main beam gain.
   */
  @XmlElement(name = "VertSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal vertSidelobeAttenuation;

  /**
   * Data element POC contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * Data element Nomenclature identifies either the standard military
   * nomenclature or the commercial model number of an antenna, equipment or
   * system. Each antenna, equipment or system may have several types of
   * nomenclature, e.g. both a military nomenclature and a commercial model
   * number.
   */
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  /**
   * This element contains the physical parameters related to the antenna feed
   * and lead.
   */
  @XmlElement(name = "AntHardware")
  private List<AntHardware> antHardware;
  /**
   * This element contains the technical characteristics of one antenna mode.
   */
  @XmlElement(name = "AntMode")
  private List<AntMode> antMode;

  /**
   * Gets the value of the generic property.
   * <p>
   * @return
   */
  public TString getGeneric() {
    return generic;
  }

  /**
   * Sets the value of the generic property.
   * <p>
   * @param value
   */
  public void setGeneric(TString value) {
    this.generic = value;
  }

  public boolean isSetGeneric() {
    return (this.generic != null);
  }

  /**
   * Gets the value of the antType property.
   * <p>
   * @return
   */
  public TString getAntType() {
    return antType;
  }

  /**
   * Sets the value of the antType property.
   * <p>
   * @param value
   */
  public void setAntType(TString value) {
    this.antType = value;
  }

  public boolean isSetAntType() {
    return (this.antType != null);
  }

  /**
   * Gets the value of the phArrayNumMainBeams property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TInteger getPhArrayNumMainBeams() {
    return phArrayNumMainBeams;
  }

  /**
   * Sets the value of the phArrayNumMainBeams property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setPhArrayNumMainBeams(TInteger value) {
    this.phArrayNumMainBeams = value;
  }

  public boolean isSetPhArrayNumMainBeams() {
    return (this.phArrayNumMainBeams != null);
  }

  /**
   * Gets the value of the phArrayNumElements property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TInteger getPhArrayNumElements() {
    return phArrayNumElements;
  }

  /**
   * Sets the value of the phArrayNumElements property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setPhArrayNumElements(TInteger value) {
    this.phArrayNumElements = value;
  }

  public boolean isSetPhArrayNumElements() {
    return (this.phArrayNumElements != null);
  }

  /**
   * Gets the value of the shape property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getShape() {
    return shape;
  }

  /**
   * Sets the value of the shape property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setShape(TString value) {
    this.shape = value;
  }

  public boolean isSetShape() {
    return (this.shape != null);
  }

  /**
   * Gets the value of the diameter property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getDiameter() {
    return diameter;
  }

  /**
   * Sets the value of the diameter property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setDiameter(TDecimal value) {
    this.diameter = value;
  }

  public boolean isSetDiameter() {
    return (this.diameter != null);
  }

  /**
   * Gets the value of the horzDimension property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzDimension() {
    return horzDimension;
  }

  /**
   * Sets the value of the horzDimension property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzDimension(TDecimal value) {
    this.horzDimension = value;
  }

  public boolean isSetHorzDimension() {
    return (this.horzDimension != null);
  }

  /**
   * Gets the value of the vertDimension property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertDimension() {
    return vertDimension;
  }

  /**
   * Sets the value of the vertDimension property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertDimension(TDecimal value) {
    this.vertDimension = value;
  }

  public boolean isSetVertDimension() {
    return (this.vertDimension != null);
  }

  /**
   * Gets the value of the apertureDiameter property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getApertureDiameter() {
    return apertureDiameter;
  }

  /**
   * Sets the value of the apertureDiameter property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setApertureDiameter(TDecimal value) {
    this.apertureDiameter = value;
  }

  public boolean isSetApertureDiameter() {
    return (this.apertureDiameter != null);
  }

  /**
   * Gets the value of the horzAperture property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzAperture() {
    return horzAperture;
  }

  /**
   * Sets the value of the horzAperture property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzAperture(TDecimal value) {
    this.horzAperture = value;
  }

  public boolean isSetHorzAperture() {
    return (this.horzAperture != null);
  }

  /**
   * Gets the value of the vertAperture property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertAperture() {
    return vertAperture;
  }

  /**
   * Sets the value of the vertAperture property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertAperture(TDecimal value) {
    this.vertAperture = value;
  }

  public boolean isSetVertAperture() {
    return (this.vertAperture != null);
  }

  /**
   * Gets the value of the horzSidelobeSuppressed property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getHorzSidelobeSuppressed() {
    return horzSidelobeSuppressed;
  }

  /**
   * Sets the value of the horzSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzSidelobeSuppressed(TString value) {
    this.horzSidelobeSuppressed = value;
  }

  public boolean isSetHorzSidelobeSuppressed() {
    return (this.horzSidelobeSuppressed != null);
  }

  /**
   * Gets the value of the horzSidelobeAz property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzSidelobeAz() {
    return horzSidelobeAz;
  }

  /**
   * Sets the value of the horzSidelobeAz property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzSidelobeAz(TDecimal value) {
    this.horzSidelobeAz = value;
  }

  public boolean isSetHorzSidelobeAz() {
    return (this.horzSidelobeAz != null);
  }

  /**
   * Gets the value of the horzSidelobeAttenuation property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzSidelobeAttenuation() {
    return horzSidelobeAttenuation;
  }

  /**
   * Sets the value of the horzSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzSidelobeAttenuation(TDecimal value) {
    this.horzSidelobeAttenuation = value;
  }

  public boolean isSetHorzSidelobeAttenuation() {
    return (this.horzSidelobeAttenuation != null);
  }

  /**
   * Gets the value of the vertSidelobeSuppressed property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getVertSidelobeSuppressed() {
    return vertSidelobeSuppressed;
  }

  /**
   * Sets the value of the vertSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertSidelobeSuppressed(TString value) {
    this.vertSidelobeSuppressed = value;
  }

  public boolean isSetVertSidelobeSuppressed() {
    return (this.vertSidelobeSuppressed != null);
  }

  /**
   * Gets the value of the vertSidelobeElev property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertSidelobeElev() {
    return vertSidelobeElev;
  }

  /**
   * Sets the value of the vertSidelobeElev property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertSidelobeElev(TDecimal value) {
    this.vertSidelobeElev = value;
  }

  public boolean isSetVertSidelobeElev() {
    return (this.vertSidelobeElev != null);
  }

  /**
   * Gets the value of the vertSidelobeAttenuation property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertSidelobeAttenuation() {
    return vertSidelobeAttenuation;
  }

  /**
   * Sets the value of the vertSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertSidelobeAttenuation(TDecimal value) {
    this.vertSidelobeAttenuation = value;
  }

  public boolean isSetVertSidelobeAttenuation() {
    return (this.vertSidelobeAttenuation != null);
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
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
   * Gets the value of the nomenclature property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the nomenclature property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNomenclature().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Gets the value of the antHardware property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antHardware property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntHardware().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<AntHardware> getAntHardware() {
    if (antHardware == null) {
      antHardware = new ArrayList<>();
    }
    return this.antHardware;
  }

  public boolean isSetAntHardware() {
    return ((this.antHardware != null) && (!this.antHardware.isEmpty()));
  }

  public void unsetAntHardware() {
    this.antHardware = null;
  }

  /**
   * Gets the value of the antMode property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antMode property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntMode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<AntMode> getAntMode() {
    if (antMode == null) {
      antMode = new ArrayList<>();
    }
    return this.antMode;
  }

  public boolean isSetAntMode() {
    return ((this.antMode != null) && (!this.antMode.isEmpty()));
  }

  public void unsetAntMode() {
    this.antMode = null;
  }

  public Antenna withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  public Antenna withAntType(String value) {
    setAntType(new TString(value));
    return this;
  }

  public Antenna withPhArrayNumMainBeams(Integer value) {
    setPhArrayNumMainBeams(new TInteger(value));
    return this;
  }

  public Antenna withPhArrayNumElements(Integer value) {
    setPhArrayNumElements(new TInteger(value));
    return this;
  }

  public Antenna withShape(String value) {
    setShape(new TString(value));
    return this;
  }

  public Antenna withDiameter(Double value) {
    setDiameter(new TDecimal(value));
    return this;
  }

  public Antenna withHorzDimension(Double value) {
    setHorzDimension(new TDecimal(value));
    return this;
  }

  public Antenna withVertDimension(Double value) {
    setVertDimension(new TDecimal(value));
    return this;
  }

  public Antenna withApertureDiameter(Double value) {
    setApertureDiameter(new TDecimal(value));
    return this;
  }

  public Antenna withHorzAperture(Double value) {
    setHorzAperture(new TDecimal(value));
    return this;
  }

  public Antenna withVertAperture(Double value) {
    setVertAperture(new TDecimal(value));
    return this;
  }

  public Antenna withHorzSidelobeSuppressed(ListCBO value) {
    setHorzSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  public Antenna withHorzSidelobeAz(Double value) {
    setHorzSidelobeAz(new TDecimal(value));
    return this;
  }

  public Antenna withHorzSidelobeAttenuation(Double value) {
    setHorzSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  public Antenna withVertSidelobeSuppressed(ListCBO value) {
    setVertSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  public Antenna withVertSidelobeElev(Double value) {
    setVertSidelobeElev(new TDecimal(value));
    return this;
  }

  public Antenna withVertSidelobeAttenuation(Double value) {
    setVertSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  public Antenna withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Antenna withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  public Antenna withAntHardware(AntHardware... values) {
    if (values != null) {
      getAntHardware().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withAntHardware(Collection<AntHardware> values) {
    if (values != null) {
      getAntHardware().addAll(values);
    }
    return this;
  }

  public Antenna withAntMode(AntMode... values) {
    if (values != null) {
      getAntMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withAntMode(Collection<AntMode> values) {
    if (values != null) {
      getAntMode().addAll(values);
    }
    return this;
  }

}
