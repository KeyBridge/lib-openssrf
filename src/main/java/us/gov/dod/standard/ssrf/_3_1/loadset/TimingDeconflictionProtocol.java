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
package us.gov.dod.standard.ssrf._3_1.loadset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Loadset;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.MEMO;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.S50;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.microsecs;
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
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private MEMO description;
  /**
   * US:Name - Protocol Name (Optional)
   * <p>
   * The identifying term for the timing deconfliction protocol
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S50 name;
  /**
   * US:Period - Period (Optional)
   * <p>
   * The enter the elapsed time between On and Off Triggers (i.e., Operations).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Period", required = false)
  private microsecs period;
  /**
   * US:Ranking - Ranking Level (Optional)
   * <p>
   * The ranking level of the timing deconfliction protocol.
   * <p>
   * Format is L:UTM
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SyncMethod", required = false)
  private MEMO syncMethod;
  /**
   * US:TriggerOff - Off Trigger (Optional)
   * <p>
   * The time that the jammer is off (listening).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TriggerOff", required = false)
  private microsecs triggerOff;
  /**
   * US:TriggerOn - On Trigger (Optional)
   * <p>
   * The time that the jammer is on (jamming).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TriggerOn", required = false)
  private microsecs triggerOn;

  /**
   * Get a description of the timing deconfliction protocol..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getDescription() {
    return description;
  }

  /**
   * Set a description of the timing deconfliction protocol..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setDescription(MEMO value) {
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
   * Get the identifying term for the timing deconfliction protocol.
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getName() {
    return name;
  }

  /**
   * Set the identifying term for the timing deconfliction protocol.
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setName(S50 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPeriod() {
    return period;
  }

  /**
   * Set the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPeriod(microsecs value) {
    this.period = value;
  }

  /**
   * Determine if the Period is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPeriod() {
    return (this.period != null ? this.period.isSetValue() : false);
  }

  /**
   * Get the ranking level of the timing deconfliction protocol..
   * <p>
   * @return the Ranking value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRanking() {
    return ranking;
  }

  /**
   * Set the ranking level of the timing deconfliction protocol..
   * <p>
   * @param value the Ranking value in a {@link TString} data type
   * @since 3.1.0
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
   * without timing deconfliction..
   * <p>
   * @return the Required value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRequired() {
    return required;
  }

  /**
   * Set if a common timing deconfliction protocol is required for processing
   * the subject signal. Enter "˜No" if only entering Jamming Frequencies
   * without timing deconfliction..
   * <p>
   * @param value the Required value in a {@link TString} data type
   * @since 3.1.0
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
   * deconfliction protocol..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getSyncMethod() {
    return syncMethod;
  }

  /**
   * Set a description of the timing synchronisation method used by the timing
   * deconfliction protocol..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setSyncMethod(MEMO value) {
    this.syncMethod = value;
  }

  /**
   * Determine if the SyncMethod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSyncMethod() {
    return (this.syncMethod != null ? this.syncMethod.isSetValue() : false);
  }

  /**
   * Get the time that the jammer is off (listening)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getTriggerOff() {
    return triggerOff;
  }

  /**
   * Set the time that the jammer is off (listening)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setTriggerOff(microsecs value) {
    this.triggerOff = value;
  }

  /**
   * Determine if the TriggerOff is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTriggerOff() {
    return (this.triggerOff != null ? this.triggerOff.isSetValue() : false);
  }

  /**
   * Get the time that the jammer is on (jamming)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getTriggerOn() {
    return triggerOn;
  }

  /**
   * Set the time that the jammer is on (jamming)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setTriggerOn(microsecs value) {
    this.triggerOn = value;
  }

  /**
   * Determine if the TriggerOn is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTriggerOn() {
    return (this.triggerOn != null ? this.triggerOn.isSetValue() : false);
  }

  /**
   * Set a description of the timing deconfliction protocol.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withDescription(String value) {
    setDescription(new MEMO(value));
    return this;
  }

  /**
   * Set the identifying term for the timing deconfliction protocol
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withName(String value) {
    setName(new S50(value));
    return this;
  }

  /**
   * Set the enter the elapsed time between On and Off Triggers (i.e.,
   * Operations).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withPeriod(Double value) {
    setPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the ranking level of the timing deconfliction protocol.
   * <p>
   * @param value An instances of type {@link ListUTM}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link ListCBO}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withRequired(ListCBO value) {
    setRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set a description of the timing synchronisation method used by the timing
   * deconfliction protocol.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withSyncMethod(String value) {
    setSyncMethod(new MEMO(value));
    return this;
  }

  /**
   * Set the time that the jammer is off (listening).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withTriggerOff(Double value) {
    setTriggerOff(new microsecs(value));
    return this;
  }

  /**
   * Set the time that the jammer is on (jamming).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TimingDeconflictionProtocol object instance.
   * @since 3.1.0
   */
  public TimingDeconflictionProtocol withTriggerOn(Double value) {
    setTriggerOn(new microsecs(value));
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
    return "\n  TimingDeconflictionProtocol {"
           + (description != null ? " description [" + description + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (period != null ? " period [" + period + "]" : "")
           + (ranking != null ? " ranking [" + ranking + "]" : "")
           + (required != null ? " required [" + required + "]" : "")
           + (syncMethod != null ? " syncMethod [" + syncMethod + "]" : "")
           + (triggerOff != null ? " triggerOff [" + triggerOff + "]" : "")
           + (triggerOn != null ? " triggerOn [" + triggerOn + "]" : "")
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
