/* 
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.loadset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Loadset;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUTM;

/**
 * TimingDeconflictionProtocol (US) defines algorithm(s) used for synchronising
 * Electronic Warfare jamming information.
 * <p>
 * Element of {@link JammingChannelProfile}
 * <p>
 * Example: See {@link Loadset}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingDeconflictionProtocol", propOrder = {
  "description",
  "name",
  "period",
  "ranking",
  "required",
  "syncMethod",
  "triggerOff",
  "triggerOn"
})
public class TimingDeconflictionProtocol {

  /**
   * US:Description - Protocol Description (Optional)
   * <p>
   * A description of the timing deconfliction protocol.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString description;
  /**
   * US:Name - Protocol Name (Optional)
   * <p>
   * The identifying term for the timing deconfliction protocol
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  /**
   * US:Period - Period (Optional)
   * <p>
   * The enter the elapsed time between On and Off Triggers (i.e., Operations).
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "Period", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal period;
  /**
   * US:Ranking - Ranking Level (Optional)
   * <p>
   * The ranking level of the timing deconfliction protocol.
   * <p>
   * Format is L:UTM
   */
  @XmlElement(name = "Ranking", required = false)
  private TString ranking;
  /**
   * US:Required - Deconfliction Required (Required)
   * <p>
   * If a common timing deconfliction protocol is required for processing the
   * subject signal. Enter "˜No" if only entering Jamming Frequencies without
   * timing deconfliction.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Required", required = true)
  private TString required;
  /**
   * US:SyncMethod - Synchronisation Method (Optional)
   * <p>
   * A description of the timing synchronisation method used by the timing
   * deconfliction protocol.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "SyncMethod", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString syncMethod;
  /**
   * US:TriggerOff - Off Trigger (Optional)
   * <p>
   * The time that the jammer is off (listening).
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "TriggerOff", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal triggerOff;
  /**
   * US:TriggerOn - On Trigger (Optional)
   * <p>
   * The time that the jammer is on (jamming).
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "TriggerOn", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal triggerOn;

  /**
   * Get a description of the timing deconfliction protocol.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the timing deconfliction protocol.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the identifying term for the timing deconfliction protocol
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the identifying term for the timing deconfliction protocol
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations).
   * <p>
   * @return the Period value in a {@link TDecimal} data type
   */
  public TDecimal getPeriod() {
    return period;
  }

  /**
   * Set the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations).
   * <p>
   * @param value the Period value in a {@link TDecimal} data type
   */
  public void setPeriod(TDecimal value) {
    this.period = value;
  }

  /**
   * Determine if the Period is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPeriod() {
    return (this.period != null ? this.period.isSetValue() : false);
  }

  /**
   * Get the ranking level of the timing deconfliction protocol.
   * <p>
   * @return the Ranking value in a {@link TString} data type
   */
  public TString getRanking() {
    return ranking;
  }

  /**
   * Set the ranking level of the timing deconfliction protocol.
   * <p>
   * @param value the Ranking value in a {@link TString} data type
   */
  public void setRanking(TString value) {
    this.ranking = value;
  }

  /**
   * Determine if the Ranking is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRanking() {
    return (this.ranking != null ? this.ranking.isSetValue() : false);
  }

  /**
   * Get if a common timing deconfliction protocol is required for processing
   * the subject signal. Enter "˜No" if only entering Jamming Frequencies
   * without timing deconfliction.
   * <p>
   * @return the Required value in a {@link TString} data type
   */
  public TString getRequired() {
    return required;
  }

  /**
   * Set if a common timing deconfliction protocol is required for processing
   * the subject signal. Enter "˜No" if only entering Jamming Frequencies
   * without timing deconfliction.
   * <p>
   * @param value the Required value in a {@link TString} data type
   */
  public void setRequired(TString value) {
    this.required = value;
  }

  /**
   * Determine if the Required is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequired() {
    return (this.required != null ? this.required.isSetValue() : false);
  }

  /**
   * Get a description of the timing synchronisation method used by the timing
   * deconfliction protocol.
   * <p>
   * @return the SyncMethod value in a {@link TString} data type
   */
  public TString getSyncMethod() {
    return syncMethod;
  }

  /**
   * Set a description of the timing synchronisation method used by the timing
   * deconfliction protocol.
   * <p>
   * @param value the SyncMethod value in a {@link TString} data type
   */
  public void setSyncMethod(TString value) {
    this.syncMethod = value;
  }

  /**
   * Determine if the SyncMethod is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSyncMethod() {
    return (this.syncMethod != null ? this.syncMethod.isSetValue() : false);
  }

  /**
   * Get the time that the jammer is off (listening).
   * <p>
   * @return the TriggerOff value in a {@link TDecimal} data type
   */
  public TDecimal getTriggerOff() {
    return triggerOff;
  }

  /**
   * Set the time that the jammer is off (listening).
   * <p>
   * @param value the TriggerOff value in a {@link TDecimal} data type
   */
  public void setTriggerOff(TDecimal value) {
    this.triggerOff = value;
  }

  /**
   * Determine if the TriggerOff is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTriggerOff() {
    return (this.triggerOff != null ? this.triggerOff.isSetValue() : false);
  }

  /**
   * Get the time that the jammer is on (jamming).
   * <p>
   * @return the TriggerOn value in a {@link TDecimal} data type
   */
  public TDecimal getTriggerOn() {
    return triggerOn;
  }

  /**
   * Set the time that the jammer is on (jamming).
   * <p>
   * @param value the TriggerOn value in a {@link TDecimal} data type
   */
  public void setTriggerOn(TDecimal value) {
    this.triggerOn = value;
  }

  /**
   * Determine if the TriggerOn is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTriggerOn() {
    return (this.triggerOn != null ? this.triggerOn.isSetValue() : false);
  }

  /**
   * Set a description of the timing deconfliction protocol.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the identifying term for the timing deconfliction protocol
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withPeriod(Double value) {
    setPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the ranking level of the timing deconfliction protocol.
   * <p>
   * @param value An instances of type {@link ListUTM}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withRanking(ListUTM value) {
    setRanking(new TString(value.value()));
    return this;
  }

  /**
   * Set if a common timing deconfliction protocol is required for processing
   * the subject signal. Enter "˜No" if only entering Jamming Frequencies
   * without timing deconfliction.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withRequired(ListCBO value) {
    setRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the timing synchronisation method used by the timing
   * deconfliction protocol.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withSyncMethod(String value) {
    setSyncMethod(new TString(value));
    return this;
  }

  /**
   * Set the time that the jammer is off (listening).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withTriggerOff(Double value) {
    setTriggerOff(new TDecimal(value));
    return this;
  }

  /**
   * Set the time that the jammer is on (jamming).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TimingDeconflictionProtocol object instance
   */
  public TimingDeconflictionProtocol withTriggerOn(Double value) {
    setTriggerOn(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this TimingDeconflictionProtocol instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TimingDeconflictionProtocol {"
      + (triggerOff != null ? " triggerOff [" + triggerOff + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (triggerOn != null ? " triggerOn [" + triggerOn + "]" : "")
      + (required != null ? " required [" + required + "]" : "")
      + (period != null ? " period [" + period + "]" : "")
      + (ranking != null ? " ranking [" + ranking + "]" : "")
      + (syncMethod != null ? " syncMethod [" + syncMethod + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TimingDeconflictionProtocol} requires {@link TString Required}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRequired();
  }

}
