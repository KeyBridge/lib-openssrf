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

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.common.CaseNum;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPT;
import us.gov.dod.standard.ssrf._3_1.multiple.*;

/**
 * Configuration identifies each operational configuration that is required in a
 * SSRequest, granted by a Host Nation in a SSReply, or authorised in a
 * frequency Assignment or Allotment dataset.
 * <p>
 * Element of
 * {@link Assignment}, {@link Multiple}, {@link RFSystem}, {@link SSReply}, {@link SSRequest}
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ConfigEmission}, {@link ConfigFreq}, {@link Notation}, {@link ObservedERPAnalysis}, {@link RxRef}, {@link TxRef}, {@link Usage}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
  "configID",
  "description",
  "repeater",
  "numUsers",
  "eirpMin",
  "eirpMax",
  "oobJustification",
  "powerLimit",
  "powerType",
  "spectrumLink",
  "configApprovedBy",
  "configApprovedDateTime",
  "observedFirstDateTime",
  "observedLastDateTime",
  "lastObservedBy",
  "lastReviewedBy",
  "lastReviewedDateTime",
  "notation",
  "usage",
  "configFreq",
  "txRef",
  "rxRef",
  "caseNum",
  "configEmission",
  "loadsetRef",
  "observedERPAnalysis"
})
public class Configuration {

  /**
   * ConfigID - Configuration Identifier (Required)
   * <p>
   * A short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigID", required = true)
  private S100 configID;
  /**
   * Description - Configuration Description (Optional)
   * <p>
   * A description of the operational configuration. This description should be
   * a meaningful explanation of the configurations main characteristics.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S100 description;
  /**
   * Repeater - Repeater Indicator (Optional)
   * <p>
   * "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Repeater", required = false)
  private TString repeater;
  /**
   * NumUsers - Number of Users (Optional)
   * <p>
   * The number of users supported by the configuration. This data may be used
   * to analyse spectrum usage.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumUsers", required = false)
  private UN9 numUsers;
  /**
   * EIRPMin - Minimum or Nominal EIRP (Optional)
   * <p>
   * The minimum or nominal effective isotropic radiated power (EIRP) radiated
   * from the transmitter antenna. It is the sum of the power supplied to the
   * antenna and the gain of the antenna, less the line loss.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EIRPMin", required = false)
  private dBW eirpMin;
  /**
   * EIRPMax - Maximum EIRP (Optional)
   * <p>
   * The maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group EIRP (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EIRPMax", required = false)
  private dBW eirpMax;
  /**
   * OOBJustification - Out-Of-Band Justification (Optional)
   * <p>
   * The justification for out-of-band frequency use.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OOBJustification", required = false)
  private MEMO oobJustification;
  /**
   * US:PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of the transmissions in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerLimit", required = false)
  private dBW powerLimit;
  /**
   * US:PowerType - Power Type (Optional)
   * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerType", required = false)
  private TString powerType;
  /**
   * US:SpectrumLink - Spectrum Link (Optional)
   * <p>
   * Whether the transmitter(s) communicate or interact with the receiver(s) in
   * this Configuration, i.e. enters a link versus a box.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpectrumLink", required = false)
  private TString spectrumLink;

  @XmlElement(name = "ConfigApprovedBy", required = false)
  private S50 configApprovedBy;

  @XmlElement(name = "ConfigApprovedDateTime", required = false)
  private DT configApprovedDateTime;
  /**
   * US:ObservedFirstDateTime - Initial Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was first collected.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedFirstDateTime", required = false)
  private DT observedFirstDateTime;
  /**
   * US:ObservedLastDateTime - Last Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was last collected.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedLastDateTime", required = false)
  private DT observedLastDateTime;
  /**
   * US:LastObservedBy - Last Observed By (Optional)
   * <p>
   * The identifier of the person or entity who last observed this signal
   * configuration.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastObservedBy", required = false)
  private S50 lastObservedBy;
  /**
   * US:LastReviewedBy - Last Reviewed By (Optional)
   * <p>
   * The identifier of the person who last reviewed this configuration.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastReviewedBy", required = false)
  private S50 lastReviewedBy;
  /**
   * US:LastReviewedDateTime - Last ReviewedTimestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the configuration
   * was thoroughly reviewed.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastReviewedDateTime", required = false)
  private DT lastReviewedDateTime;
  /**
   * Notation (Optional)
   * <p>
   * Notation contains the electronic identification for a pulsed or non-pulsed
   * electromagnetic emission. It includes but is not limited to Communications
   * Emitter Notation (CENOT) and Electronic Intelligence Notation (ELNOT).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Notation")
  private Set<Notation> notation;
  /**
   * Usage (Optional)
   * <p>
   * Usage identifies how an operational configuration can be used or will be
   * used.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Usage")
  private Set<Usage> usage;
  /**
   * ConfigFreq (Optional)
   * <p>
   * ConfigFreq indicates the set of frequencies that a configuration uses,
   * which may be a subset of the frequencies that the linked components
   * (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * Notes: When referenced by SSRequest, the Frequency i
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigFreq")
  private Set<ConfigFreq> configFreq;
  /**
   * TxRef (Optional)
   * <p>
   * TxRef contains the reference of a Transmitter, and optionnally some of its
   * TxModes and the associated Antennas and AntMode.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxRef")
  private Set<TxRef> txRef;
  /**
   * RxRef (Optional)
   * <p>
   * RxRef contains the reference of a Receiver, and optionnally some of its
   * RxModes and the associated Antennas and AntMode.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxRef")
  private Set<RxRef> rxRef;
  /**
   * CaseNum (Optional)
   * <p>
   * CaseNum contains legacy and other identifiers associated with the Dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CaseNum")
  private Set<CaseNum> caseNum;
  /**
   * US:ConfigEmission (Optional)
   * <p>
   * ConfigEmission (US) specifies the emission bandwidths and classification
   * symbols that a Configuration uses, which may be a subset of the linked
   * components' capabilities.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ConfigEmission")
  private Set<ConfigEmission> configEmission;
  /**
   * LoadsetRef (Optional)
   * <p>
   * LoadsetRef describes the jamming loadset to be used against a specific
   * target or targets.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LoadsetRef", nillable = true)
  private Set<Serial> loadsetRef;
  /**
   * US:ObservedERPAnalysis (Optional)
   * <p>
   * ObservedERPAnalysis (US) contains data describing Effective Radiated Power
   * (ERP) associated with an emitter or Notation.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedERPAnalysis")
  private Set<ObservedERPAnalysis> observedERPAnalysis;

  /**
   * Get a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getConfigID() {
    return configID;
  }

  /**
   * Set a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setConfigID(S100 value) {
    this.configID = value;
  }

  /**
   * Determine if the ConfigID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigID() {
    return (this.configID != null ? this.configID.isSetValue() : false);
  }

  /**
   * Get a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setDescription(S100 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater..
   * <p>
   * @return the Repeater value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRepeater() {
    return repeater;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater..
   * <p>
   * @param value the Repeater value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRepeater(TString value) {
    this.repeater = value;
  }

  /**
   * Determine if the Repeater is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRepeater() {
    return (this.repeater != null ? this.repeater.isSetValue() : false);
  }

  /**
   * Get the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumUsers() {
    return numUsers;
  }

  /**
   * Set the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumUsers(UN9 value) {
    this.numUsers = value;
  }

  /**
   * Determine if the NumUsers is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumUsers() {
    return (this.numUsers != null ? this.numUsers.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getEIRPMin() {
    return eirpMin;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setEIRPMin(dBW value) {
    this.eirpMin = value;
  }

  /**
   * Determine if the EIRPMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMin() {
    return (this.eirpMin != null ? this.eirpMin.isSetValue() : false);
  }

  /**
   * Get the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getEIRPMax() {
    return eirpMax;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setEIRPMax(dBW value) {
    this.eirpMax = value;
  }

  /**
   * Determine if the EIRPMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEIRPMax() {
    return (this.eirpMax != null ? this.eirpMax.isSetValue() : false);
  }

  /**
   * Get the justification for out-of-band frequency use..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getOOBJustification() {
    return oobJustification;
  }

  /**
   * Set the justification for out-of-band frequency use..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setOOBJustification(MEMO value) {
    this.oobJustification = value;
  }

  /**
   * Determine if the OOBJustification is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOOBJustification() {
    return (this.oobJustification != null ? this.oobJustification.isSetValue() : false);
  }

  /**
   * Get the power limit of the transmissions in this configuration..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPowerLimit() {
    return powerLimit;
  }

  /**
   * Set the power limit of the transmissions in this configuration..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPowerLimit(dBW value) {
    this.powerLimit = value;
  }

  /**
   * Determine if the PowerLimit is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerLimit() {
    return (this.powerLimit != null ? this.powerLimit.isSetValue() : false);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment..
   * <p>
   * @return the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment..
   * <p>
   * @param value the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  /**
   * Determine if the PowerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerType() {
    return (this.powerType != null ? this.powerType.isSetValue() : false);
  }

  /**
   * Get whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box..
   * <p>
   * @return the SpectrumLink value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSpectrumLink() {
    return spectrumLink;
  }

  /**
   * Set whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box..
   * <p>
   * @param value the SpectrumLink value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSpectrumLink(TString value) {
    this.spectrumLink = value;
  }

  /**
   * Determine if the SpectrumLink is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpectrumLink() {
    return (this.spectrumLink != null ? this.spectrumLink.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getConfigApprovedBy() {
    return configApprovedBy;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setConfigApprovedBy(S50 value) {
    this.configApprovedBy = value;
  }

  /**
   * Determine if the ConfigApprovedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigApprovedBy() {
    return (this.configApprovedBy != null ? this.configApprovedBy.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getConfigApprovedDateTime() {
    return configApprovedDateTime;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setConfigApprovedDateTime(DT value) {
    this.configApprovedDateTime = value;
  }

  /**
   * Determine if the ConfigApprovedDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigApprovedDateTime() {
    return (this.configApprovedDateTime != null ? this.configApprovedDateTime.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getObservedFirstDateTime() {
    return observedFirstDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setObservedFirstDateTime(DT value) {
    this.observedFirstDateTime = value;
  }

  /**
   * Determine if the ObservedFirstDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedFirstDateTime() {
    return (this.observedFirstDateTime != null ? this.observedFirstDateTime.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getObservedLastDateTime() {
    return observedLastDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setObservedLastDateTime(DT value) {
    this.observedLastDateTime = value;
  }

  /**
   * Determine if the ObservedLastDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLastDateTime() {
    return (this.observedLastDateTime != null ? this.observedLastDateTime.isSetValue() : false);
  }

  /**
   * Get the identifier of the person or entity who last observed this signal
   * configuration..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getLastObservedBy() {
    return lastObservedBy;
  }

  /**
   * Set the identifier of the person or entity who last observed this signal
   * configuration..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setLastObservedBy(S50 value) {
    this.lastObservedBy = value;
  }

  /**
   * Determine if the LastObservedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastObservedBy() {
    return (this.lastObservedBy != null ? this.lastObservedBy.isSetValue() : false);
  }

  /**
   * Get the identifier of the person who last reviewed this configuration..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getLastReviewedBy() {
    return lastReviewedBy;
  }

  /**
   * Set the identifier of the person who last reviewed this configuration..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setLastReviewedBy(S50 value) {
    this.lastReviewedBy = value;
  }

  /**
   * Determine if the LastReviewedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewedBy() {
    return (this.lastReviewedBy != null ? this.lastReviewedBy.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the
   * configuration was thoroughly reviewed..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getLastReviewedDateTime() {
    return lastReviewedDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the
   * configuration was thoroughly reviewed..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setLastReviewedDateTime(DT value) {
    this.lastReviewedDateTime = value;
  }

  /**
   * Determine if the LastReviewedDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewedDateTime() {
    return (this.lastReviewedDateTime != null ? this.lastReviewedDateTime.isSetValue() : false);
  }

  /**
   * Get the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT)..
   * <p>
   * @return a {@link Notation} instance
   * @since 3.1.0
   */
  public Set<Notation> getNotation() {
    if (notation == null) {
      notation = new HashSet<>();
    }
    return this.notation;
  }

  /**
   * Determine if the Notation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNotation() {
    return ((this.notation != null) && (!this.notation.isEmpty()));
  }

  /**
   * Clear the Notation field. This sets the field to null.
   */
  public void unsetNotation() {
    this.notation = null;
  }

  /**
   * Get the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used..
   * <p>
   * @return a {@link Usage} instance
   * @since 3.1.0
   */
  public Set<Usage> getUsage() {
    if (usage == null) {
      usage = new HashSet<>();
    }
    return this.usage;
  }

  /**
   * Determine if the Usage is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsage() {
    return ((this.usage != null) && (!this.usage.isEmpty()));
  }

  /**
   * Clear the Usage field. This sets the field to null.
   */
  public void unsetUsage() {
    this.usage = null;
  }

  /**
   * Get the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of..
   * <p>
   * @return a {@link ConfigFreq} instance
   * @since 3.1.0
   */
  public Set<ConfigFreq> getConfigFreq() {
    if (configFreq == null) {
      configFreq = new HashSet<>();
    }
    return this.configFreq;
  }

  /**
   * Determine if the ConfigFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigFreq() {
    return ((this.configFreq != null) && (!this.configFreq.isEmpty()));
  }

  /**
   * Clear the ConfigFreq field. This sets the field to null.
   */
  public void unsetConfigFreq() {
    this.configFreq = null;
  }

  /**
   * Get the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode..
   * <p>
   * @return a {@link TxRef} instance
   * @since 3.1.0
   */
  public Set<TxRef> getTxRef() {
    if (txRef == null) {
      txRef = new HashSet<>();
    }
    return this.txRef;
  }

  /**
   * Determine if the TxRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxRef() {
    return ((this.txRef != null) && (!this.txRef.isEmpty()));
  }

  /**
   * Clear the TxRef field. This sets the field to null.
   */
  public void unsetTxRef() {
    this.txRef = null;
  }

  /**
   * Get the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode..
   * <p>
   * @return a {@link RxRef} instance
   * @since 3.1.0
   */
  public Set<RxRef> getRxRef() {
    if (rxRef == null) {
      rxRef = new HashSet<>();
    }
    return this.rxRef;
  }

  /**
   * Determine if the RxRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxRef() {
    return ((this.rxRef != null) && (!this.rxRef.isEmpty()));
  }

  /**
   * Clear the RxRef field. This sets the field to null.
   */
  public void unsetRxRef() {
    this.rxRef = null;
  }

  /**
   * Get the CaseNum
   * <p>
   * Complex element CaseNum contains legacy and other identifiers associated
   * with the Dataset..
   * <p>
   * @return a {@link CaseNum} instance
   * @since 3.1.0
   */
  public Set<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new HashSet<>();
    }
    return this.caseNum;
  }

  /**
   * Determine if the CaseNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  /**
   * Clear the CaseNum field. This sets the field to null.
   */
  public void unsetCaseNum() {
    this.caseNum = null;
  }

  /**
   * Get the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities..
   * <p>
   * @return a {@link ConfigEmission} instance
   * @since 3.1.0
   */
  public Set<ConfigEmission> getConfigEmission() {
    if (configEmission == null) {
      configEmission = new HashSet<>();
    }
    return this.configEmission;
  }

  /**
   * Determine if the ConfigEmission is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigEmission() {
    return ((this.configEmission != null) && (!this.configEmission.isEmpty()));
  }

  /**
   * Clear the ConfigEmission field. This sets the field to null.
   */
  public void unsetConfigEmission() {
    this.configEmission = null;
  }

  /**
   * Get the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLoadset()} instead.
   */
  @Deprecated
  public Set<Serial> getLoadsetRef() {
    if (loadsetRef == null) {
      loadsetRef = new HashSet<>();
    }
    return this.loadsetRef;
  }

  /**
   * Determine if the LoadsetRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadsetRef() {
    return ((this.loadsetRef != null) && (!this.loadsetRef.isEmpty()));
  }

  /**
   * Clear the LoadsetRef field. This sets the field to null.
   */
  public void unsetLoadsetRef() {
    this.loadsetRef = null;
  }

  /**
   * Get the US:ObservedERPAnalysis
   * <p>
   * Complex element ObservedERPAnalysis (US) contains data describing Effective
   * Radiated Power (ERP) associated with an emitter or Notation..
   * <p>
   * @return a {@link ObservedERPAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedERPAnalysis> getObservedERPAnalysis() {
    if (observedERPAnalysis == null) {
      observedERPAnalysis = new HashSet<>();
    }
    return this.observedERPAnalysis;
  }

  /**
   * Determine if the ObservedERPAnalysis is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedERPAnalysis() {
    return ((this.observedERPAnalysis != null) && (!this.observedERPAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedERPAnalysis field. This sets the field to null.
   */
  public void unsetObservedERPAnalysis() {
    this.observedERPAnalysis = null;
  }

  /**
   * Set a short name for the configuration; this name should be a meaningful
   * identification of the configuration, but it can also be automatically
   * generated in some systems. The identifier MUST be unique within the dataset
   * and SHOULD NOT be modified during the entire lifetime of the dataset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigID(String value) {
    setConfigID(new S100(value));
    return this;
  }

  /**
   * Set a description of the operational configuration. This description should
   * be a meaningful explanation of the configurations main characteristics.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set "Yes" for each receiver location when a station in the fixed or mobile
   * service is used primarily as a repeater.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withRepeater(ListCBO value) {
    setRepeater(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of users supported by the configuration. This data may be
   * used to analyse spectrum usage.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withNumUsers(Integer value) {
    setNumUsers(new UN9(value));
    return this;
  }

  /**
   * Set the minimum or nominal effective isotropic radiated power (EIRP)
   * radiated from the transmitter antenna. It is the sum of the power supplied
   * to the antenna and the gain of the antenna, less the line loss.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withEIRPMin(Double value) {
    setEIRPMin(new dBW(value));
    return this;
  }

  /**
   * Set the maximum effective isotropic radiated power (EIRP) radiated from the
   * transmitter antenna. It is the sum of the power supplied to the antenna and
   * the gain of the antenna, less the line loss.
   * <p>
   * [XSL ERR MINMAX] If EIRPMax is used, it MUST be greater than EIRPMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withEIRPMax(Double value) {
    setEIRPMax(new dBW(value));
    return this;
  }

  /**
   * Set the justification for out-of-band frequency use.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withOOBJustification(String value) {
    setOOBJustification(new MEMO(value));
    return this;
  }

  /**
   * Set the power limit of the transmissions in this configuration.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withPowerLimit(Double value) {
    setPowerLimit(new dBW(value));
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link ListCPT}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withPowerType(ListCPT value) {
    setPowerType(new TString(value.value()));
    return this;
  }

  /**
   * Set whether the transmitter(s) communicate or interact with the receiver(s)
   * in this Configuration, i.e. enters a link versus a box.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withSpectrumLink(ListCBO value) {
    setSpectrumLink(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigApprovedBy(String value) {
    setConfigApprovedBy(new S50(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigApprovedDateTime(Calendar value) {
    setConfigApprovedDateTime(new DT(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigApprovedDateTime(Date value) {
    setConfigApprovedDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedFirstDateTime(Calendar value) {
    setObservedFirstDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedFirstDateTime(Date value) {
    setObservedFirstDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedLastDateTime(Calendar value) {
    setObservedLastDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedLastDateTime(Date value) {
    setObservedLastDateTime(new DT(value));
    return this;
  }

  /**
   * Set the identifier of the person or entity who last observed this signal
   * configuration.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLastObservedBy(String value) {
    setLastObservedBy(new S50(value));
    return this;
  }

  /**
   * Set the identifier of the person who last reviewed this configuration.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLastReviewedBy(String value) {
    setLastReviewedBy(new S50(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the
   * configuration was thoroughly reviewed.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLastReviewedDateTime(Calendar value) {
    setLastReviewedDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the
   * configuration was thoroughly reviewed.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLastReviewedDateTime(Date value) {
    setLastReviewedDateTime(new DT(value));
    return this;
  }

  /**
   * Set the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT).
   * <p>
   * @param values One or more instances of type {@link Notation...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withNotation(Notation... values) {
    if (values != null) {
      getNotation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Notation
   * <p>
   * Complex element Notation contains the electronic identification for a
   * pulsed or non-pulsed electromagnetic emission. It includes but is not
   * limited to Communications Emitter Notation (CENOT) and Electronic
   * Intelligence Notation (ELNOT).
   * <p>
   * @param values A collection of {@link Notation} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withNotation(Collection<Notation> values) {
    if (values != null) {
      getNotation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used.
   * <p>
   * @param values One or more instances of type {@link Usage...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withUsage(Usage... values) {
    if (values != null) {
      getUsage().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Usage
   * <p>
   * Complex element Usage identifies how an operational configuration can be
   * used or will be used.
   * <p>
   * @param values A collection of {@link Usage} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withUsage(Collection<Usage> values) {
    if (values != null) {
      getUsage().addAll(values);
    }
    return this;
  }

  /**
   * Set the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * @param values One or more instances of type {@link ConfigFreq...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigFreq(ConfigFreq... values) {
    if (values != null) {
      getConfigFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ConfigFreq
   * <p>
   * Complex element ConfigFreq indicates the set of frequencies that a
   * configuration uses, which may be a subset of the frequencies that the
   * linked components (Transmitter, Receiver, Antenna) are capable of.
   * <p>
   * @param values A collection of {@link ConfigFreq} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigFreq(Collection<ConfigFreq> values) {
    if (values != null) {
      getConfigFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode.
   * <p>
   * @param values One or more instances of type {@link TxRef...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withTxRef(TxRef... values) {
    if (values != null) {
      getTxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxRef
   * <p>
   * Complex element TxRef contains the reference of a Transmitter, and
   * optionnally some of its TxModes and the associated Antennas and AntMode.
   * <p>
   * @param values A collection of {@link TxRef} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withTxRef(Collection<TxRef> values) {
    if (values != null) {
      getTxRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode.
   * <p>
   * @param values One or more instances of type {@link RxRef...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withRxRef(RxRef... values) {
    if (values != null) {
      getRxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxRef
   * <p>
   * Complex element RxRef contains the reference of a Receiver, and optionnally
   * some of its RxModes and the associated Antennas and AntMode.
   * <p>
   * @param values A collection of {@link RxRef} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withRxRef(Collection<RxRef> values) {
    if (values != null) {
      getRxRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum contains legacy and other identifiers associated
   * with the Dataset.
   * <p>
   * @param values One or more instances of type {@link CaseNum...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum contains legacy and other identifiers associated
   * with the Dataset.
   * <p>
   * @param values A collection of {@link CaseNum} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withCaseNum(Collection<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   * <p>
   * @param values One or more instances of type {@link ConfigEmission...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigEmission(ConfigEmission... values) {
    if (values != null) {
      getConfigEmission().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ConfigEmission
   * <p>
   * Complex element ConfigEmission (US) specifies the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   * <p>
   * @param values A collection of {@link ConfigEmission} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withConfigEmission(Collection<ConfigEmission> values) {
    if (values != null) {
      getConfigEmission().addAll(values);
    }
    return this;
  }

  /**
   * Set the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets.
   * <p>
   * @param values One or more instances of type {@link LoadsetRef...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLoadset(Loadset...)} instead.
   */
  @Deprecated
  public Configuration withLoadsetRef(Serial... values) {
    if (values != null) {
      getLoadsetRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLoadset(Loadset...)} instead.
   */
  @Deprecated
  public Configuration withLoadsetRef(Collection<Serial> values) {
    if (values != null) {
      getLoadsetRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedERPAnalysis
   * <p>
   * Complex element ObservedERPAnalysis (US) contains data describing Effective
   * Radiated Power (ERP) associated with an emitter or Notation.
   * <p>
   * @param values One or more instances of type {@link ObservedERPAnalysis...}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedERPAnalysis(ObservedERPAnalysis... values) {
    if (values != null) {
      getObservedERPAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedERPAnalysis
   * <p>
   * Complex element ObservedERPAnalysis (US) contains data describing Effective
   * Radiated Power (ERP) associated with an emitter or Notation.
   * <p>
   * @param values A collection of {@link ObservedERPAnalysis} instances
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withObservedERPAnalysis(Collection<ObservedERPAnalysis> values) {
    if (values != null) {
      getObservedERPAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Configuration instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Configuration {"
           + (caseNum != null ? " caseNum [" + caseNum + "]" : "")
           + (configApprovedBy != null ? " configApprovedBy [" + configApprovedBy + "]" : "")
           + (configApprovedDateTime != null ? " configApprovedDateTime [" + configApprovedDateTime + "]" : "")
           + (configEmission != null ? " configEmission [" + configEmission + "]" : "")
           + (configFreq != null ? " configFreq [" + configFreq + "]" : "")
           + (configID != null ? " configID [" + configID + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (eirpMax != null ? " eirpMax [" + eirpMax + "]" : "")
           + (eirpMin != null ? " eirpMin [" + eirpMin + "]" : "")
           + (lastObservedBy != null ? " lastObservedBy [" + lastObservedBy + "]" : "")
           + (lastReviewedBy != null ? " lastReviewedBy [" + lastReviewedBy + "]" : "")
           + (lastReviewedDateTime != null ? " lastReviewedDateTime [" + lastReviewedDateTime + "]" : "")
           + (loadsetRef != null ? " loadsetRef [" + loadsetRef + "]" : "")
           + (notation != null ? " notation [" + notation + "]" : "")
           + (numUsers != null ? " numUsers [" + numUsers + "]" : "")
           + (observedERPAnalysis != null ? " observedERPAnalysis [" + observedERPAnalysis + "]" : "")
           + (observedFirstDateTime != null ? " observedFirstDateTime [" + observedFirstDateTime + "]" : "")
           + (observedLastDateTime != null ? " observedLastDateTime [" + observedLastDateTime + "]" : "")
           + (oobJustification != null ? " oobJustification [" + oobJustification + "]" : "")
           + (powerLimit != null ? " powerLimit [" + powerLimit + "]" : "")
           + (powerType != null ? " powerType [" + powerType + "]" : "")
           + (repeater != null ? " repeater [" + repeater + "]" : "")
           + (rxRef != null ? " rxRef [" + rxRef + "]" : "")
           + (spectrumLink != null ? " spectrumLink [" + spectrumLink + "]" : "")
           + (txRef != null ? " txRef [" + txRef + "]" : "")
           + (usage != null ? " usage [" + usage + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Configuration} requires {@link S100 ConfigID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetConfigID();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LoadsetRef (Optional)
   * <p>
   * LoadsetRef describes the jamming loadset to be used against a specific
   * target or targets.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Loadset> loadset;

  /**
   * Get the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets..
   * <p>
   * @return a {@link Loadset} instance
   * @since 3.1.0
   */
  public Set<Loadset> getLoadset() {
    if (loadset == null) {
      loadset = new HashSet<>();
    }
    return loadset;
  }

  /**
   * Determine if the loadset field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLoadset() {
    return this.loadset != null && !this.loadset.isEmpty();
  }

  /**
   * Set the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets.
   * <p>
   * @param values An instances of type {@link Loadset}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLoadset(Loadset... values) {
    return withLoadset(Arrays.asList(values));
  }

  /**
   * Set the LoadsetRef
   * <p>
   * Complex element LoadsetRef describes the jamming loadset to be used against
   * a specific target or targets.
   * <p>
   * @param values An instances of type {@link Loadset}.
   * @return The current Configuration object instance.
   * @since 3.1.0
   */
  public Configuration withLoadset(Collection<Loadset> values) {
    getLoadset().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Configuration record.
   * <p>
   * This method builds the exported {@link #loadsetRef} field with values from
   * the transient {@link #loadset} field. This method should typically be
   * called after the Configuration is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.loadsetRef = new HashSet<>();
    for (Loadset instance : getLoadset()) {
      this.loadsetRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Configuration record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #loadset} with values from the
   * imported {@link #loadsetRef} field. This method should typically be called
   * after the Configuration is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (loadsetRef == null || loadsetRef.isEmpty()) {
      return;
    }
    for (Loadset instance : root.getLoadset()) {
      if (loadsetRef.contains(instance.getSerial())) {
        loadset.add(instance);
      }
    }
  }//</editor-fold>

}
