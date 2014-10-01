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
package us.gov.dod.standard.ssrf._3_1.multiple;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)
   * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * InBand - In Band Indicator (Optional)
   * <p>
   * "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "InBand", required = false)
  private TString inBand;
  /**
   * Priority - Priority (Optional)
   * <p>
   * If this spectrum use is Primary, Secondary or Permitted, as defined by the
   * system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * Format is L:CPS
   */
  @XmlElement(name = "Priority", required = false)
  private TString priority;
  /**
   * In Data Item ChannelSpacing (US)- enter the amount of bandwidth allotted to
   * each channel, measured as the spacing between center frequencies (or
   * wavelengths) of adjacent channels.
   */
  @XmlElement(name = "ChannelSpacing", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal channelSpacing;
  /**
   * US:Duration - Frequency Dwell (Optional)
   * <p>
   * The amount of time the frequency is being monitored or jammed.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal duration;

  @XmlElement(name = "ConfigFreqUse", required = false)
  private TString configFreqUse;
  /**
   * In Data Item Period (US),- enter how often the frequency is being monitored
   * or jammed.
   */
  @XmlElement(name = "Period", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal period;
  /**
   * US:PulseWidth - Pulse Width (Optional)
   * <p>
   * The collected EW channel dwell for the Chirped Signal.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PulseWidth", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pulseWidth;

  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get the nominal frequency or minimum value of the frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
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
   * Get the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
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
   * Get "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @return the InBand value in a {@link TString} data type
   */
  public TString getInBand() {
    return inBand;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @param value the InBand value in a {@link TString} data type
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
   * Table/guidance.
   * <p>
   * @return the Priority value in a {@link TString} data type
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this spectrum use is Primary, Secondary or Permitted, as defined by
   * the system use and the appropriate Administration Frequency Allocation
   * Table/guidance.
   * <p>
   * @param value the Priority value in a {@link TString} data type
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
   * frequencies (or wavelengths) of adjacent channels.
   * <p>
   * @return the ChannelSpacing value in a {@link TDecimal} data type
   */
  public TDecimal getChannelSpacing() {
    return channelSpacing;
  }

  /**
   * Set In Data Item ChannelSpacing (US)- enter the amount of bandwidth
   * allotted to each channel, measured as the spacing between center
   * frequencies (or wavelengths) of adjacent channels.
   * <p>
   * @param value the ChannelSpacing value in a {@link TDecimal} data type
   */
  public void setChannelSpacing(TDecimal value) {
    this.channelSpacing = value;
  }

  /**
   * Determine if the ChannelSpacing is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelSpacing() {
    return (this.channelSpacing != null ? this.channelSpacing.isSetValue() : false);
  }

  /**
   * Get the amount of time the frequency is being monitored or jammed.
   * <p>
   * @return the Duration value in a {@link TDecimal} data type
   */
  public TDecimal getDuration() {
    return duration;
  }

  /**
   * Set the amount of time the frequency is being monitored or jammed.
   * <p>
   * @param value the Duration value in a {@link TDecimal} data type
   */
  public void setDuration(TDecimal value) {
    this.duration = value;
  }

  /**
   * Determine if the Duration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDuration() {
    return (this.duration != null ? this.duration.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the ConfigFreqUse value in a {@link TString} data type
   */
  public TString getConfigFreqUse() {
    return configFreqUse;
  }

  /**
   * Set
   * <p>
   * @param value the ConfigFreqUse value in a {@link TString} data type
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
   * monitored or jammed.
   * <p>
   * @return the Period value in a {@link TDecimal} data type
   */
  public TDecimal getPeriod() {
    return period;
  }

  /**
   * Set In Data Item Period (US),- enter how often the frequency is being
   * monitored or jammed.
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
   * Get the collected EW channel dwell for the Chirped Signal.
   * <p>
   * @return the PulseWidth value in a {@link TDecimal} data type
   */
  public TDecimal getPulseWidth() {
    return pulseWidth;
  }

  /**
   * Set the collected EW channel dwell for the Chirped Signal.
   * <p>
   * @param value the PulseWidth value in a {@link TDecimal} data type
   */
  public void setPulseWidth(TDecimal value) {
    this.pulseWidth = value;
  }

  /**
   * Determine if the PulseWidth is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseWidth() {
    return (this.pulseWidth != null ? this.pulseWidth.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
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
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set "Yes" if this frequency range is in compliance with the applicable
   * Frequency Allocation Table. Enter “No” if any portion of the frequency
   * range is not in compliance.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ConfigFreq object instance
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
   * @param value An instances of type {@link ListCPS}
   * @return The current ConfigFreq object instance
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
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withChannelSpacing(Double value) {
    setChannelSpacing(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of time the frequency is being monitored or jammed.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withDuration(Double value) {
    setDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListUFU}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withConfigFreqUse(ListUFU value) {
    setConfigFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item Period (US),- enter how often the frequency is being
   * monitored or jammed.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withPeriod(Double value) {
    setPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the collected EW channel dwell for the Chirped Signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withPulseWidth(Double value) {
    setPulseWidth(new TDecimal(value));
    return this;
  }

  /**
   * Set the index.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current ConfigFreq object instance
   */
  public ConfigFreq withIdx(BigInteger value) {
    setIdx(value);
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
      + " configFreqUse [" + configFreqUse + "]"
      + " inBand [" + inBand + "]"
      + " duration [" + duration + "]"
      + " idx [" + idx + "]"
      + " channelSpacing [" + channelSpacing + "]"
      + " priority [" + priority + "]"
      + " freqMin [" + freqMin + "]"
      + " freqMax [" + freqMax + "]"
      + " pulseWidth [" + pulseWidth + "]"
      + " period [" + period + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ConfigFreq} requires
   * {@link TDecimal FreqMin}, {@link BigInteger idx}.
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
