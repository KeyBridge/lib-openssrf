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
package us.gov.dod.standard.ssrf._3_1.multiple;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPS;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUFU;

/**
 * ConfigFreq indicates the set of frequencies that a configuration uses, which
 * may be a subset of the frequencies that the linked components (Transmitter,
 * Receiver, Antenna) are capable of.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Example:
 * <pre>
 * &lt;ConfigFreq&gt;
 *   &lt;FreqMax  cls="U"&gt;3126&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;3000&lt;/FreqMin &gt;
 *   &lt;idx cls="U"&gt;23&lt;/idx&gt;
 *   &lt;InBand  cls="U"&gt;Yes&lt;/InBand &gt;
 *   &lt;Priority  cls="U"&gt;Primary&lt;/Priority &gt;
 *   &lt;ChannelSpacing cls="U"&gt;25&lt;/ChannelSpacing&gt;
 *   &lt;Duration cls="U"&gt;.001&lt;/Duration&gt;
 *   &lt;FreqUse cls="U"&gt;TRANSMIT&lt;/FreqUse&gt;
 *   &lt;Period cls="U"&gt;23.6&lt;/Period&gt;
 *   &lt;PulseWidth cls="U"&gt;347&lt;/PulseWidth&gt;
 * &lt;/ConfigFreq&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFreq", propOrder = {
  "freqMin",
  "freqMax",
  "inBand",
  "priority",
  "channelSpacing",
  "duration",
  "configFreqUse",
  "period",
  "pulseWidth"
})
public class ConfigFreq {

  /**
   * FreqMin - Nominal or Minimum Frequency (Required)    * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)    * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * InBand - In Band Indicator (Optional)    * <p>
   * "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InBand", required = false)
  private TString inBand;
  /**
   * Priority - Priority (Optional)    * <p>
   * If this spectrum use is Primary, Secondary or Permitted, as defined by the
   * system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * Format is L:CPS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = false)
  private TString priority;
  /**
   * In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to
   * each channel, measured as the spacing between center frequencies (or
   * wavelengths) of adjacent channels.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelSpacing", required = false)
  private FreqM channelSpacing;
  /**
   * US:Duration - Frequency Dwell (Optional)    * <p>
   * The amount of time the frequency is being monitored or jammed.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Duration", required = false)
  private microsecs duration;

  @XmlElement(name = "ConfigFreqUse", required = false)
  private TString configFreqUse;
  /**
   * In Data Item Period (US),- enter how often the frequency is being monitored
   * or jammed.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Period", required = false)
  private microsecs period;
  /**
   * US:PulseWidth - Pulse Width (Optional)    * <p>
   * The collected EW channel dwell for the Chirped Signal.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseWidth", required = false)
  private microsecs pulseWidth;

  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get the nominal frequency or minimum value of the frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range..
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
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin..
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
   * Get "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance..
   * <p>
   * @return the InBand value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getInBand() {
    return inBand;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance..
   * <p>
   * @param value the InBand value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setInBand(TString value) {
    this.inBand = value;
  }

  /**
   * Determine if the InBand is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInBand() {
    return (this.inBand != null ? this.inBand.isSetValue() : false);
  }

  /**
   * Get if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance..
   * <p>
   * @return the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance..
   * <p>
   * @param value the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get In Data Item ChannelSpacing (US)- enter the amount of bandwidth
   * allotted to each channel, measured as the spacing between center
   * frequencies (or wavelengths) of adjacent channels..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getChannelSpacing() {
    return channelSpacing;
  }

  /**
   * Set In Data Item ChannelSpacing (US)- enter the amount of bandwidth
   * allotted to each channel, measured as the spacing between center
   * frequencies (or wavelengths) of adjacent channels..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setChannelSpacing(FreqM value) {
    this.channelSpacing = value;
  }

  /**
   * Determine if the ChannelSpacing is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelSpacing() {
    return (this.channelSpacing != null ? this.channelSpacing.isSetValue() : false);
  }

  /**
   * Get the amount of time the frequency is being monitored or jammed..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getDuration() {
    return duration;
  }

  /**
   * Set the amount of time the frequency is being monitored or jammed..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setDuration(microsecs value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return the ConfigFreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getConfigFreqUse() {
    return configFreqUse;
  }

  /**
   * Set .
   * <p>
   * @param value the ConfigFreqUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setConfigFreqUse(TString value) {
    this.configFreqUse = value;
  }

  /**
   * Determine if the ConfigFreqUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigFreqUse() {
    return (this.configFreqUse != null ? this.configFreqUse.isSetValue() : false);
  }

  /**
   * Get In Data Item Period (US),- enter how often the frequency is being
   * monitored or jammed..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPeriod() {
    return period;
  }

  /**
   * Set In Data Item Period (US),- enter how often the frequency is being
   * monitored or jammed..
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
   * Get the collected EW channel dwell for the Chirped Signal..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPulseWidth() {
    return pulseWidth;
  }

  /**
   * Set the collected EW channel dwell for the Chirped Signal..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPulseWidth(microsecs value) {
    this.pulseWidth = value;
  }

  /**
   * Determine if the PulseWidth is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseWidth() {
    return (this.pulseWidth != null ? this.pulseWidth.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withInBand(ListCBO value) {
    setInBand(new TString(value.value()));
    return this;
  }

  /**
   * Set if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * @param value An instances of type {@link ListCPS}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withPriority(ListCPS value) {
    setPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item ChannelSpacing (US)- enter the amount of bandwidth
   * allotted to each channel, measured as the spacing between center
   * frequencies (or wavelengths) of adjacent channels.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withChannelSpacing(Double value) {
    setChannelSpacing(new FreqM(value));
    return this;
  }

  /**
   * Set the amount of time the frequency is being monitored or jammed.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withDuration(Double value) {
    setDuration(new microsecs(value));
    return this;
  }

  /**
   * Set    * <p>
   * @param value An instances of type {@link ListUFU}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withConfigFreqUse(ListUFU value) {
    setConfigFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item Period (US),- enter how often the frequency is being
   * monitored or jammed.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withPeriod(Double value) {
    setPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the collected EW channel dwell for the Chirped Signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withPulseWidth(Double value) {
    setPulseWidth(new microsecs(value));
    return this;
  }

  /**
   * Set    * <p>
   * @param value An instances of type {@link BigInteger}.
   * @return The current ConfigFreq object instance.
   * @since 3.1.0
   */
  public ConfigFreq withIdx(BigInteger value) {
    return this;
  }

  /**
   * Get a string representation of this ConfigFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ConfigFreq {"
           + (channelSpacing != null ? "\n channelSpacing [" + channelSpacing + "]" : "")
           + (configFreqUse != null ? "\n configFreqUse [" + configFreqUse + "]" : "")
           + (duration != null ? "\n duration [" + duration + "]" : "")
           + (freqMax != null ? "\n freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? "\n freqMin [" + freqMin + "]" : "")
           + (idx != null ? "\n idx [" + idx + "]" : "")
           + (inBand != null ? "\n inBand [" + inBand + "]" : "")
           + (period != null ? "\n period [" + period + "]" : "")
           + (priority != null ? "\n priority [" + priority + "]" : "")
           + (pulseWidth != null ? "\n pulseWidth [" + pulseWidth + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ConfigFreq} requires {@link FreqM FreqMin}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin() && isSetIdx();
  }

}
