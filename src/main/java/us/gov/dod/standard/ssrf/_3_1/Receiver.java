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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DuplexSep")
  private FreqM duplexSep;
  /**
   * DuplexSepType - Duplex Separation Type (Optional)
   * <p>
   * If the frequency separation must be exactly, or at the minimum, the amount
   * specified.
   * <p>
   * Format is L:CDS
   * <p>
   * Attribute group Duplex (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DuplexSepType", required = false)
  private TString duplexSepType;
  /**
   * PreSelectionType - Preselection Type (Optional)
   * <p>
   * The type of preselection used in the receiver frontend.
   * <p>
   * Format is S60
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PreselectionType", required = false)
  private S60 preselectionType;
  /**
   * US:ConductedEmissions - Conducted Emissions (Optional)
   * <p>
   * The power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * Format is SN(6,3) [-165..-30] (dBm)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConductedEmissions", required = false)
  private US_DBm conductedEmissions;
  /**
   * US:FCCAcceptanceNum - FCC Acceptance Number (Optional)
   * <p>
   * The Federal Communication Commission (FCC) ID of FCC authorised equipment.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FCCAcceptanceNum", required = false)
  private S50 fccAcceptanceNum;
  /**
   * US:TSPR - TSPR (Optional)
   * <p>
   * The telecommunications service priority applicable to a spectrum-dependent
   * radiocommunications system intended to be used in direct support of a
   * national emergency declared under Section 706 of the Communications Act of
   * 1934, as amended.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TSPR", required = false)
  private S10 tspr;
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
   * Deployment (Optional)
   * <p>
   * Deployment provides the general type of equipment deployment. For the
   * detailed data, the appropriate force element and platforms elements should
   * be referenced. Data element Deployment identifies the general category of
   * how the equipment is deployed. For example an equipment may be deployed on
   * an airborne platform, a ship or fixed land installation.
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Curve")
  private Set<Curve> curve;
  /**
   * RxMode (Optional)
   * <p>
   * RxMode and sub-elements define all the technical parameters for a mode of
   * operation of the Receiver.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxMode")
  private Set<RxMode> rxMode;
  /**
   * US:UsingCountries (Optional)
   * <p>
   * UsingCountries (US) describes the countries that manufacture (Producing),
   * supply (Source), and use (Using) the Receiver.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UsingCountries")
  private Set<UsingCountries> usingCountries;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Receiver() {
    super();
  }

  /**
   * Get "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model..
   * <p>
   * @return the Generic value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getGeneric() {
    return generic;
  }

  /**
   * Set "Yes" to indicate that the dataset describes typical parameters of a
   * waveform or standard signal, or a generic antenna model, rather than a
   * specific equipment model..
   * <p>
   * @param value the Generic value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the minimum or exact duplex frequency separation.
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getDuplexSep() {
    return duplexSep;
  }

  /**
   * Set the minimum or exact duplex frequency separation.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setDuplexSep(FreqM value) {
    this.duplexSep = value;
  }

  /**
   * Determine if the DuplexSep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuplexSep() {
    return (this.duplexSep != null ? this.duplexSep.isSetValue() : false);
  }

  /**
   * Get if the frequency separation must be exactly, or at the minimum, the
   * amount specified..
   * <p>
   * @return the DuplexSepType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDuplexSepType() {
    return duplexSepType;
  }

  /**
   * Set if the frequency separation must be exactly, or at the minimum, the
   * amount specified..
   * <p>
   * @param value the DuplexSepType value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the type of preselection used in the receiver frontend..
   * <p>
   * @return a {@link S60} instance
   * @since 3.1.0
   */
  public S60 getPreselectionType() {
    return preselectionType;
  }

  /**
   * Set the type of preselection used in the receiver frontend..
   * <p>
   * @param value a {@link S60} instance
   * @since 3.1.0
   */
  public void setPreselectionType(S60 value) {
    this.preselectionType = value;
  }

  /**
   * Determine if the PreselectionType is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPreselectionType() {
    return (this.preselectionType != null ? this.preselectionType.isSetValue() : false);
  }

  /**
   * Get the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver..
   * <p>
   * @return a {@link US_DBm} instance
   * @since 3.1.0
   */
  public US_DBm getConductedEmissions() {
    return conductedEmissions;
  }

  /**
   * Set the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver..
   * <p>
   * @param value a {@link US_DBm} instance
   * @since 3.1.0
   */
  public void setConductedEmissions(US_DBm value) {
    this.conductedEmissions = value;
  }

  /**
   * Determine if the ConductedEmissions is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConductedEmissions() {
    return (this.conductedEmissions != null ? this.conductedEmissions.isSetValue() : false);
  }

  /**
   * Get the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getFCCAcceptanceNum() {
    return fccAcceptanceNum;
  }

  /**
   * Set the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setFCCAcceptanceNum(S50 value) {
    this.fccAcceptanceNum = value;
  }

  /**
   * Determine if the FCCAcceptanceNum is configured.
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
   * Communications Act of 1934, as amended..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getTSPR() {
    return tspr;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setTSPR(S10 value) {
    this.tspr = value;
  }

  /**
   * Determine if the TSPR is configured.
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
   * Get the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation..
   * <p>
   * @return a {@link Deployment} instance
   * @since 3.1.0
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
   * curve, and the measurement bandwidth..
   * <p>
   * @return a {@link Curve} instance
   * @since 3.1.0
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
   * for a mode of operation of the Receiver..
   * <p>
   * @return a {@link RxMode} instance
   * @since 3.1.0
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
   * manufacture (Producing), supply (Source), and use (Using) the Receiver..
   * <p>
   * @return a {@link UsingCountries} instance
   * @since 3.1.0
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
   * @param value An instances of type {@link ListCBO}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  /**
   * Set the minimum or exact duplex frequency separation
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withDuplexSep(Double value) {
    setDuplexSep(new FreqM(value));
    return this;
  }

  /**
   * Set if the frequency separation must be exactly, or at the minimum, the
   * amount specified.
   * <p>
   * @param value An instances of type {@link ListCDS}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withDuplexSepType(ListCDS value) {
    setDuplexSepType(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of preselection used in the receiver frontend.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withPreselectionType(String value) {
    setPreselectionType(new S60(value));
    return this;
  }

  /**
   * Set the power level of undesired signals generated in the receiver and
   * conducted by way of the connection to the receiver.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withConductedEmissions(Double value) {
    setConductedEmissions(new US_DBm(value));
    return this;
  }

  /**
   * Set the Federal Communication Commission (FCC) ID of FCC authorised
   * equipment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withFCCAcceptanceNum(String value) {
    setFCCAcceptanceNum(new S50(value));
    return this;
  }

  /**
   * Set the telecommunications service priority applicable to a
   * spectrum-dependent radiocommunications system intended to be used in direct
   * support of a national emergency declared under Section 706 of the
   * Communications Act of 1934, as amended.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withTSPR(String value) {
    setTSPR(new S10(value));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withPOCInformation(POCInformation... values) {
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withPOCInformation(Collection<POCInformation> values) {
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
   * @param values One or more instances of type {@link Nomenclature...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withNomenclature(Nomenclature... values) {
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withNomenclature(Collection<Nomenclature> values) {
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
   * @param values One or more instances of type {@link Deployment...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withDeployment(Deployment... values) {
    if (values != null) {
      getDeployment().addAll(Arrays.asList(values));
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withDeployment(Collection<Deployment> values) {
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
   * @param values One or more instances of type {@link Curve...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withCurve(Collection<Curve> values) {
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
   * @param values One or more instances of type {@link RxMode...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withRxMode(RxMode... values) {
    if (values != null) {
      getRxMode().addAll(Arrays.asList(values));
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withRxMode(Collection<RxMode> values) {
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
   * @param values One or more instances of type {@link UsingCountries...}.
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withUsingCountries(UsingCountries... values) {
    if (values != null) {
      getUsingCountries().addAll(Arrays.asList(values));
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
   * @return The current Receiver object instance.
   * @since 3.1.0
   */
  public Receiver withUsingCountries(Collection<UsingCountries> values) {
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
           + (conductedEmissions != null ? " conductedEmissions [" + conductedEmissions + "]" : "")
           + (curve != null ? " curve [" + curve + "]" : "")
           + (deployment != null ? " deployment [" + deployment + "]" : "")
           + (duplexSep != null ? " duplexSep [" + duplexSep + "]" : "")
           + (duplexSepType != null ? " duplexSepType [" + duplexSepType + "]" : "")
           + (fccAcceptanceNum != null ? " fccAcceptanceNum [" + fccAcceptanceNum + "]" : "")
           + (generic != null ? " generic [" + generic + "]" : "")
           + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (preselectionType != null ? " preselectionType [" + preselectionType + "]" : "")
           + (rxMode != null ? " rxMode [" + rxMode + "]" : "")
           + (tspr != null ? " tspr [" + tspr + "]" : "")
           + (usingCountries != null ? " usingCountries [" + usingCountries + "]" : "")
           + "}\n  Receiver." + super.toString() + "\n";
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
