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

import java.util.Set;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDS;
import us.gov.dod.standard.ssrf._3_1.receiver.Curve;
import us.gov.dod.standard.ssrf._3_1.receiver.Deployment;
import us.gov.dod.standard.ssrf._3_1.receiver.RxMode;

/**
 * Receiver is the root element (dataset) containing the receiver
 * characteristics.
 * <p>
 * Sub-Elements are
 * {@link Curve}, {@link Deployment}, {@link Nomenclature}, {@link POCInformation}, {@link RxMode}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Receiver cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::RX:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
 *   &lt;Nomenclature&gt;
 *     &lt;Name cls="U"&gt;AN/PRC-113&lt;/Name&gt;
 *   &lt;/Nomenclature&gt;
 *   &lt;RxMode&gt;
 *     &lt;ModeID cls="U"&gt;HIGH POWER VOICE&lt;/ModeID&gt;
 *   &lt;/RxMode&gt;
 * &lt;/Receiver&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receiver", propOrder = {
  "generic",
  "duplexSep",
  "duplexSepType",
  "preselectionType",
  "conductedEmissions",
  "fccAcceptanceNum",
  "tspr",
  "pocInformation",
  "nomenclature",
  "deployment",
  "curve",
  "rxMode",
  "usingCountries"
})
public class Receiver extends Common<Receiver> {

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
   * DuplexSep - Duplex Separation (Optional)
   * <p>
   * The minimum or exact duplex frequency separation
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group Duplex (Optional)
   */
  @XmlElement(name = "DuplexSep")
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal duplexSep;
  /**
   * DuplexSepType - Duplex Separation Type (Optional)
   * <p>
   * If the frequency separation must be exactly, or at the minimum, the amount
   * specified.
   * <p>
   * Format is L:CDS
   * <p>
   * Attribute group Duplex (Optional)
   */
  @XmlElement(name = "DuplexSepType", required = false)
  private TString duplexSepType;
  /**
   * PreSelectionType - Preselection Type (Optional)
   * <p>
   * The type of preselection used in the receiver frontend.
   * <p>
   * Format is S60
   */
  @XmlElement(name = "PreselectionType", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS60.class)
  private TString preselectionType;
  /**
   * US:ConductedEmissions - Conducted Emissions (Optional)
   * <p>
   * The power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * Format is SN(6,3) [-165..-30] (dBm)
   */
  @XmlElement(name = "ConductedEmissions", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBM.class)
  private TDecimal conductedEmissions;
  /**
   * US:FCCAcceptanceNum - FCC Acceptance Number (Optional)
   * <p>
   * The Federal Communication Commission (FCC) ID of FCC authorised equipment.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "FCCAcceptanceNum", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString fccAcceptanceNum;
  /**
   * US:TSPR - TSPR (Optional)
   * <p>
   * The telecommunications service priority applicable to a spectrum-dependent
   * radiocommunications system intended to be used in direct support of a
   * national emergency declared under Section 706 of the Communications Act of
   * 1934, as amended.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "TSPR", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString tspr;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
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
  private Set<Nomenclature> nomenclature;
  /**
   * Deployment (Optional)
   * <p>
   * Deployment provides the general type of equipment deployment. For the
   * detailed data, the appropriate force element and platforms elements should
   * be referenced. Data element Deployment identifies the general category of
   * how the equipment is deployed. For example an equipment may be deployed on
   * an airborne platform, a ship or fixed land installation.
   */
  @XmlElement(name = "Deployment")
  private Set<Deployment> deployment;
  /**
   * Curve (Optional)
   * <p>
   * Curve defines the type of curve. It contains an indication as to whether
   * the values were measured or calculated, the numeric factor to be applied to
   * the carrier frequency to find the abscissa of the curve, a frequency to be
   * added to the carrier frequency to obtain the origin of the curve, and the
   * measurement bandwidth.
   */
  @XmlElement(name = "Curve")
  private Set<Curve> curve;
  /**
   * RxMode (Optional)
   * <p>
   * RxMode and sub-elements define all the technical parameters for a mode of
   * operation of the Receiver.
   */
  @XmlElement(name = "RxMode")
  private Set<RxMode> rxMode;
  /**
   * US:UsingCountries (Optional)
   * <p>
   * UsingCountries (US) describes the countries that manufacture (Producing),
   * supply (Source), and use (Using) the Receiver.
   */
  @XmlElement(name = "UsingCountries")
  private Set<UsingCountries> usingCountries;

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
   * Get the minimum or exact duplex frequency separation
   * <p>
   * @return the DuplexSep value in a {@link TDecimal} data type
   */
  public TDecimal getDuplexSep() {
    return duplexSep;
  }

  /**
   * Set the minimum or exact duplex frequency separation
   * <p>
   * @param value the DuplexSep value in a {@link TDecimal} data type
   */
  public void setDuplexSep(TDecimal value) {
    this.duplexSep = value;
  }

  /**
   * Determine if the DuplexSep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuplexSep() {
    return (this.duplexSep != null ? this.duplexSep.isSetValue() : false);
  }

  /**
   * Get if the frequency separation must be exactly, or at the minimum, the
   * amount specified.
   * <p>
   * @return the DuplexSepType value in a {@link TString} data type
   */
  public TString getDuplexSepType() {
    return duplexSepType;
  }

  /**
   * Set if the frequency separation must be exactly, or at the minimum, the
   * amount specified.
   * <p>
   * @param value the DuplexSepType value in a {@link TString} data type
   */
  public void setDuplexSepType(TString value) {
    this.duplexSepType = value;
  }

  /**
   * Determine if the DuplexSepType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuplexSepType() {
    return (this.duplexSepType != null ? this.duplexSepType.isSetValue() : false);
  }

  /**
   * Get the type of preselection used in the receiver frontend.
   * <p>
   * @return the PreselectionType value in a {@link TString} data type
   */
  public TString getPreselectionType() {
    return preselectionType;
  }

  /**
   * Set the type of preselection used in the receiver frontend.
   * <p>
   * @param value the PreselectionType value in a {@link TString} data type
   */
  public void setPreselectionType(TString value) {
    this.preselectionType = value;
  }

  /**
   * Determine if the PreselectionType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPreselectionType() {
    return (this.preselectionType != null ? this.preselectionType.isSetValue() : false);
  }

  /**
   * Get the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * @return the ConductedEmissions value in a {@link TDecimal} data type
   */
  public TDecimal getConductedEmissions() {
    return conductedEmissions;
  }

  /**
   * Set the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * @param value the ConductedEmissions value in a {@link TDecimal} data type
   */
  public void setConductedEmissions(TDecimal value) {
    this.conductedEmissions = value;
  }

  /**
   * Determine if the ConductedEmissions is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConductedEmissions() {
    return (this.conductedEmissions != null ? this.conductedEmissions.isSetValue() : false);
  }

  /**
   * Get the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment.
   * <p>
   * @return the FCCAcceptanceNum value in a {@link TString} data type
   */
  public TString getFCCAcceptanceNum() {
    return fccAcceptanceNum;
  }

  /**
   * Set the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment.
   * <p>
   * @param value the FCCAcceptanceNum value in a {@link TString} data type
   */
  public void setFCCAcceptanceNum(TString value) {
    this.fccAcceptanceNum = value;
  }

  /**
   * Determine if the FCCAcceptanceNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFCCAcceptanceNum() {
    return (this.fccAcceptanceNum != null ? this.fccAcceptanceNum.isSetValue() : false);
  }

  /**
   * Get the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @return the TSPR value in a {@link TString} data type
   */
  public TString getTSPR() {
    return tspr;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @param value the TSPR value in a {@link TString} data type
   */
  public void setTSPR(TString value) {
    this.tspr = value;
  }

  /**
   * Determine if the TSPR is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTSPR() {
    return (this.tspr != null ? this.tspr.isSetValue() : false);
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
   * Get the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @return a non-null but possibly empty list of {@link Deployment} instances
   */
  public Set<Deployment> getDeployment() {
    if (deployment == null) {
      deployment = new HashSet<>();
    }
    return this.deployment;
  }

  /**
   * Determine if the Deployment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeployment() {
    return ((this.deployment != null) && (!this.deployment.isEmpty()));
  }

  /**
   * Clear the Deployment field. This sets the field to null.
   */
  public void unsetDeployment() {
    this.deployment = null;
  }

  /**
   * Get the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @return a non-null but possibly empty list of {@link Curve} instances
   */
  public Set<Curve> getCurve() {
    if (curve == null) {
      curve = new HashSet<>();
    }
    return this.curve;
  }

  /**
   * Determine if the Curve is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  /**
   * Clear the Curve field. This sets the field to null.
   */
  public void unsetCurve() {
    this.curve = null;
  }

  /**
   * Get the RxMode
   * <p>
   * Complex element RxMode and sub-elements define all the technical parameters
   * for a mode of operation of the Receiver.
   * <p>
   * @return a non-null but possibly empty list of {@link RxMode} instances
   */
  public Set<RxMode> getRxMode() {
    if (rxMode == null) {
      rxMode = new HashSet<>();
    }
    return this.rxMode;
  }

  /**
   * Determine if the RxMode is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxMode() {
    return ((this.rxMode != null) && (!this.rxMode.isEmpty()));
  }

  /**
   * Clear the RxMode field. This sets the field to null.
   */
  public void unsetRxMode() {
    this.rxMode = null;
  }

  /**
   * Get the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Receiver.
   * <p>
   * @return a non-null but possibly empty list of {@link UsingCountries}
   *         instances
   */
  public Set<UsingCountries> getUsingCountries() {
    if (usingCountries == null) {
      usingCountries = new HashSet<>();
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
   * @return The current Receiver object instance
   */
  public Receiver withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  /**
   * Set the minimum or exact duplex frequency separation
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Receiver object instance
   */
  public Receiver withDuplexSep(Double value) {
    setDuplexSep(new TDecimal(value));
    return this;
  }

  /**
   * Set if the frequency separation must be exactly, or at the minimum, the
   * amount specified.
   * <p>
   * @param value An instances of type {@link ListCDS}
   * @return The current Receiver object instance
   */
  public Receiver withDuplexSepType(ListCDS value) {
    setDuplexSepType(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of preselection used in the receiver frontend.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Receiver object instance
   */
  public Receiver withPreselectionType(String value) {
    setPreselectionType(new TString(value));
    return this;
  }

  /**
   * Set the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Receiver object instance
   */
  public Receiver withConductedEmissions(Double value) {
    setConductedEmissions(new TDecimal(value));
    return this;
  }

  /**
   * Set the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Receiver object instance
   */
  public Receiver withFCCAcceptanceNum(String value) {
    setFCCAcceptanceNum(new TString(value));
    return this;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Receiver object instance
   */
  public Receiver withTSPR(String value) {
    setTSPR(new TString(value));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation}
   * @return The current Receiver object instance
   */
  public Receiver withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Receiver object instance
   */
  public Receiver withPOCInformation(Set<POCInformation> values) {
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
   * @return The current Receiver object instance
   */
  public Receiver withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Receiver object instance
   */
  public Receiver withNomenclature(Set<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @param values One or more instances of type {@link Deployment}
   * @return The current Receiver object instance
   */
  public Receiver withDeployment(Deployment... values) {
    if (values != null) {
      getDeployment().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @param values A collection of {@link Deployment} instances
   * @return The current Receiver object instance
   */
  public Receiver withDeployment(Set<Deployment> values) {
    if (values != null) {
      getDeployment().addAll(values);
    }
    return this;
  }

  /**
   * Set the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @param values One or more instances of type {@link Curve}
   * @return The current Receiver object instance
   */
  public Receiver withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Curve
   * <p>
   * Complex element Curve defines the type of curve. It contains an indication
   * as to whether the values were measured or calculated, the numeric factor to
   * be applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth.
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current Receiver object instance
   */
  public Receiver withCurve(Set<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxMode
   * <p>
   * Complex element RxMode and sub-elements define all the technical parameters
   * for a mode of operation of the Receiver.
   * <p>
   * @param values One or more instances of type {@link RxMode}
   * @return The current Receiver object instance
   */
  public Receiver withRxMode(RxMode... values) {
    if (values != null) {
      getRxMode().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the RxMode
   * <p>
   * Complex element RxMode and sub-elements define all the technical parameters
   * for a mode of operation of the Receiver.
   * <p>
   * @param values A collection of {@link RxMode} instances
   * @return The current Receiver object instance
   */
  public Receiver withRxMode(Set<RxMode> values) {
    if (values != null) {
      getRxMode().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Receiver.
   * <p>
   * @param values One or more instances of type {@link UsingCountries}
   * @return The current Receiver object instance
   */
  public Receiver withUsingCountries(UsingCountries... values) {
    if (values != null) {
      getUsingCountries().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the Receiver.
   * <p>
   * @param values A collection of {@link UsingCountries} instances
   * @return The current Receiver object instance
   */
  public Receiver withUsingCountries(Set<UsingCountries> values) {
    if (values != null) {
      getUsingCountries().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Receiver instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Receiver {"
      + (curve != null ? " curve [" + curve + "]" : "")
      + (fccAcceptanceNum != null ? " fccAcceptanceNum [" + fccAcceptanceNum + "]" : "")
      + (generic != null ? " generic [" + generic + "]" : "")
      + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
      + (duplexSepType != null ? " duplexSepType [" + duplexSepType + "]" : "")
      + (duplexSep != null ? " duplexSep [" + duplexSep + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (preselectionType != null ? " preselectionType [" + preselectionType + "]" : "")
      + (tspr != null ? " tspr [" + tspr + "]" : "")
      + (deployment != null ? " deployment [" + deployment + "]" : "")
      + (conductedEmissions != null ? " conductedEmissions [" + conductedEmissions + "]" : "")
      + (usingCountries != null ? " usingCountries [" + usingCountries + "]" : "")
      + (rxMode != null ? " rxMode [" + rxMode + "]" : "")
      + "\n  Receiver." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Receiver} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Generic}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetGeneric();
  }

}
