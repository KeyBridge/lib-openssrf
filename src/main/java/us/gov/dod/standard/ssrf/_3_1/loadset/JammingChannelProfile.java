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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Loadset;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListULD;

/**
 * JammingChannelProfile (US) describes the specific Loadset parameters for
 * jamming a discrete frequency or frequency range.
 * <p>
 * Element of {@link Loadset}
 * <p>
 * Sub-Element is {@link TimingDeconflictionProtocol}
 * <p>
 * Example: See {@link Loadset}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingChannelProfile", propOrder = {
  "activationPower",
  "activationTime",
  "carrierWaveform",
  "centerFreq",
  "channelSpacing",
  "direction",
  "dwell",
  "exBlankingOn",
  "fftType",
  "freqMax",
  "freqMin",
  "observeTime",
  "offsetFreq",
  "rxDuration",
  "signal",
  "techniques",
  "threat",
  "txDuration",
  "timingDeconflictionProtocol"
})
public class JammingChannelProfile {

  /**
   * US:ActivationPower - Activation Threshold (Optional)
   * <p>
   * The signal level required to activate the loadset, for systems capable of
   * selecting multiple power thresholds by sub-band or other region of
   * interest.
   * <p>
   * Format is SN(6,3) (dBm)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ActivationPower", required = false)
  private dBm activationPower;
  /**
   * US:ActivationTime - Activation Time (Optional)
   * <p>
   * The minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ActivationTime", required = false)
  private microsecs activationTime;
  /**
   * US:CarrierWaveform - Carrier Waveform (Required)
   * <p>
   * The waveform that will be used for the carrier of the jamming signal.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CarrierWaveform", required = true)
  private S100 carrierWaveform;
  /**
   * US:CenterFreq - Center Frequency (Optional)
   * <p>
   * The middle frequency in the band.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CenterFreq", required = false)
  private FreqM centerFreq;
  /**
   * US:ChannelSpacing - Channel Spacing (Optional)
   * <p>
   * The frequency increment between discrete channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelSpacing", required = false)
  private FreqM channelSpacing;
  /**
   * US:Direction - Sweep Direction (Optional)
   * <p>
   * The sweep direction from the center frequency.
   * <p>
   * Format is L:ULD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Direction", required = false)
  private TString direction;
  /**
   * US:Dwell - Dwell (Optional)
   * <p>
   * The frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dwell", required = false)
  private microsecs dwell;
  /**
   * In Data Item ExBlankingOn (US), indicate if external blanking is enabled.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExBlankingOn", required = false)
  private TString exBlankingOn;
  /**
   * US:FFTType - FFT Type (Optional)
   * <p>
   * The form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete).
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FFTType", required = false)
  private S20 fftType;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The target discrete frequency, or frequency range minimum value.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
  /**
   * US:ObserveTime - Observe Time (Optional)
   * <p>
   * The time interval for the recording of received signals, in (0-999) hours,
   * (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObserveTime", required = false)
  private US_Duration observeTime;
  /**
   * US:OffsetFreq - Offset Frequency (Optional)
   * <p>
   * The frequency offset relative to the center frequency of the channel.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OffsetFreq", required = false)
  private FreqM offsetFreq;
  /**
   * US:RxDuration - Receive Duration (Optional)
   * <p>
   * The amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxDuration", required = false)
  private US_Duration rxDuration;
  /**
   * US:Signal - Signal (Required)
   * <p>
   * The waveform information modulated, or impressed, on the carrier.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Signal", required = true)
  private S100 signal;
  /**
   * US:Techniques - Techniques (Optional)
   * <p>
   * How many ramp techniques occur during the programmed frequency range dwell
   * time.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Techniques", required = false)
  private UN5 techniques;
  /**
   * US:Threat - Threat (Optional)
   * <p>
   * A short description of the threat name or threat type.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Threat", required = false)
  private S100 threat;
  /**
   * US:TxDuration - Transmit Duration (Optional)
   * <p>
   * The amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxDuration", required = false)
  private US_Duration txDuration;
  /**
   * US:TimingDeconflictionProtocol (Optional)
   * <p>
   * TimingDeconflictionProtocol (US) defines algorithm(s) used for
   * synchronising Electronic Warfare jamming information.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TimingDeconflictionProtocol")
  private Set<TimingDeconflictionProtocol> timingDeconflictionProtocol;

  /**
   * Get the signal level required to activate the loadset, for systems capable
   * of selecting multiple power thresholds by sub-band or other region of
   * interest..
   * <p>
   * @return a {@link dBm} instance
   * @since 3.1.0
   */
  public dBm getActivationPower() {
    return activationPower;
  }

  /**
   * Set the signal level required to activate the loadset, for systems capable
   * of selecting multiple power thresholds by sub-band or other region of
   * interest..
   * <p>
   * @param value a {@link dBm} instance
   * @since 3.1.0
   */
  public void setActivationPower(dBm value) {
    this.activationPower = value;
  }

  /**
   * Determine if the ActivationPower is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActivationPower() {
    return (this.activationPower != null ? this.activationPower.isSetValue() : false);
  }

  /**
   * Get the minimum time required to trigger the jammer after start of signal
   * reception..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getActivationTime() {
    return activationTime;
  }

  /**
   * Set the minimum time required to trigger the jammer after start of signal
   * reception..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setActivationTime(microsecs value) {
    this.activationTime = value;
  }

  /**
   * Determine if the ActivationTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActivationTime() {
    return (this.activationTime != null ? this.activationTime.isSetValue() : false);
  }

  /**
   * Get the waveform that will be used for the carrier of the jamming signal..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getCarrierWaveform() {
    return carrierWaveform;
  }

  /**
   * Set the waveform that will be used for the carrier of the jamming signal..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setCarrierWaveform(S100 value) {
    this.carrierWaveform = value;
  }

  /**
   * Determine if the CarrierWaveform is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCarrierWaveform() {
    return (this.carrierWaveform != null ? this.carrierWaveform.isSetValue() : false);
  }

  /**
   * Get the middle frequency in the band..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getCenterFreq() {
    return centerFreq;
  }

  /**
   * Set the middle frequency in the band..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setCenterFreq(FreqM value) {
    this.centerFreq = value;
  }

  /**
   * Determine if the CenterFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCenterFreq() {
    return (this.centerFreq != null ? this.centerFreq.isSetValue() : false);
  }

  /**
   * Get the frequency increment between discrete channels..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getChannelSpacing() {
    return channelSpacing;
  }

  /**
   * Set the frequency increment between discrete channels..
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
   * Get the sweep direction from the center frequency..
   * <p>
   * @return the Direction value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDirection() {
    return direction;
  }

  /**
   * Set the sweep direction from the center frequency..
   * <p>
   * @param value the Direction value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setDirection(TString value) {
    this.direction = value;
  }

  /**
   * Determine if the Direction is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDirection() {
    return (this.direction != null ? this.direction.isSetValue() : false);
  }

  /**
   * Get the frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getDwell() {
    return dwell;
  }

  /**
   * Set the frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setDwell(microsecs value) {
    this.dwell = value;
  }

  /**
   * Determine if the Dwell is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDwell() {
    return (this.dwell != null ? this.dwell.isSetValue() : false);
  }

  /**
   * Get In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled..
   * <p>
   * @return the ExBlankingOn value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExBlankingOn() {
    return exBlankingOn;
  }

  /**
   * Set In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled..
   * <p>
   * @param value the ExBlankingOn value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExBlankingOn(TString value) {
    this.exBlankingOn = value;
  }

  /**
   * Determine if the ExBlankingOn is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExBlankingOn() {
    return (this.exBlankingOn != null ? this.exBlankingOn.isSetValue() : false);
  }

  /**
   * Get the form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete)..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getFFTType() {
    return fftType;
  }

  /**
   * Set the form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete)..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setFFTType(S20 value) {
    this.fftType = value;
  }

  /**
   * Determine if the FFTType is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFFTType() {
    return (this.fftType != null ? this.fftType.isSetValue() : false);
  }

  /**
   * Get the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
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
   * Get the target discrete frequency, or frequency range minimum value..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the target discrete frequency, or frequency range minimum value..
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
   * Get the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000)..
   * <p>
   * @return a {@link US_Duration} instance
   * @since 3.1.0
   */
  public US_Duration getObserveTime() {
    return observeTime;
  }

  /**
   * Set the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000)..
   * <p>
   * @param value a {@link US_Duration} instance
   * @since 3.1.0
   */
  public void setObserveTime(US_Duration value) {
    this.observeTime = value;
  }

  /**
   * Determine if the ObserveTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObserveTime() {
    return (this.observeTime != null ? this.observeTime.isSetValue() : false);
  }

  /**
   * Get the frequency offset relative to the center frequency of the channel..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getOffsetFreq() {
    return offsetFreq;
  }

  /**
   * Set the frequency offset relative to the center frequency of the channel..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setOffsetFreq(FreqM value) {
    this.offsetFreq = value;
  }

  /**
   * Determine if the OffsetFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOffsetFreq() {
    return (this.offsetFreq != null ? this.offsetFreq.isSetValue() : false);
  }

  /**
   * Get the amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000)..
   * <p>
   * @return a {@link US_Duration} instance
   * @since 3.1.0
   */
  public US_Duration getRxDuration() {
    return rxDuration;
  }

  /**
   * Set the amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000)..
   * <p>
   * @param value a {@link US_Duration} instance
   * @since 3.1.0
   */
  public void setRxDuration(US_Duration value) {
    this.rxDuration = value;
  }

  /**
   * Determine if the RxDuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxDuration() {
    return (this.rxDuration != null ? this.rxDuration.isSetValue() : false);
  }

  /**
   * Get the waveform information modulated, or impressed, on the carrier..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getSignal() {
    return signal;
  }

  /**
   * Set the waveform information modulated, or impressed, on the carrier..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setSignal(S100 value) {
    this.signal = value;
  }

  /**
   * Determine if the Signal is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignal() {
    return (this.signal != null ? this.signal.isSetValue() : false);
  }

  /**
   * Get how many ramp techniques occur during the programmed frequency range
   * dwell time..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getTechniques() {
    return techniques;
  }

  /**
   * Set how many ramp techniques occur during the programmed frequency range
   * dwell time..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setTechniques(UN5 value) {
    this.techniques = value;
  }

  /**
   * Determine if the Techniques is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTechniques() {
    return (this.techniques != null ? this.techniques.isSetValue() : false);
  }

  /**
   * Get a short description of the threat name or threat type..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getThreat() {
    return threat;
  }

  /**
   * Set a short description of the threat name or threat type..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setThreat(S100 value) {
    this.threat = value;
  }

  /**
   * Determine if the Threat is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetThreat() {
    return (this.threat != null ? this.threat.isSetValue() : false);
  }

  /**
   * Get the amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000)..
   * <p>
   * @return a {@link US_Duration} instance
   * @since 3.1.0
   */
  public US_Duration getTxDuration() {
    return txDuration;
  }

  /**
   * Set the amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000)..
   * <p>
   * @param value a {@link US_Duration} instance
   * @since 3.1.0
   */
  public void setTxDuration(US_Duration value) {
    this.txDuration = value;
  }

  /**
   * Determine if the TxDuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxDuration() {
    return (this.txDuration != null ? this.txDuration.isSetValue() : false);
  }

  /**
   * Get the US:TimingDeconflictionProtocol
   * <p>
   * Complex element TimingDeconflictionProtocol (US) defines algorithm(s) used
   * for synchronising Electronic Warfare jamming information..
   * <p>
   * @return a {@link TimingDeconflictionProtocol} instance
   * @since 3.1.0
   */
  public Set<TimingDeconflictionProtocol> getTimingDeconflictionProtocol() {
    if (timingDeconflictionProtocol == null) {
      timingDeconflictionProtocol = new HashSet<>();
    }
    return this.timingDeconflictionProtocol;
  }

  /**
   * Determine if the TimingDeconflictionProtocol is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTimingDeconflictionProtocol() {
    return ((this.timingDeconflictionProtocol != null) && (!this.timingDeconflictionProtocol.isEmpty()));
  }

  /**
   * Clear the TimingDeconflictionProtocol field. This sets the field to null.
   */
  public void unsetTimingDeconflictionProtocol() {
    this.timingDeconflictionProtocol = null;
  }

  /**
   * Set the signal level required to activate the loadset, for systems capable
   * of selecting multiple power thresholds by sub-band or other region of
   * interest.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withActivationPower(Double value) {
    setActivationPower(new dBm(value));
    return this;
  }

  /**
   * Set the minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withActivationTime(Double value) {
    setActivationTime(new microsecs(value));
    return this;
  }

  /**
   * Set the waveform that will be used for the carrier of the jamming signal.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withCarrierWaveform(String value) {
    setCarrierWaveform(new S100(value));
    return this;
  }

  /**
   * Set the middle frequency in the band.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withCenterFreq(Double value) {
    setCenterFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the frequency increment between discrete channels.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withChannelSpacing(Double value) {
    setChannelSpacing(new FreqM(value));
    return this;
  }

  /**
   * Set the sweep direction from the center frequency.
   * <p>
   * @param value An instances of type {@link ListULD}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withDirection(ListULD value) {
    setDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withDwell(Double value) {
    setDwell(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withExBlankingOn(ListCBO value) {
    setExBlankingOn(new TString(value.value()));
    return this;
  }

  /**
   * Set the form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withFFTType(String value) {
    setFFTType(new S20(value));
    return this;
  }

  /**
   * Set the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the target discrete frequency, or frequency range minimum value.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withObserveTime(String value) {
    setObserveTime(new US_Duration(value));
    return this;
  }

  /**
   * Set the frequency offset relative to the center frequency of the channel.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withOffsetFreq(Double value) {
    setOffsetFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withRxDuration(String value) {
    setRxDuration(new US_Duration(value));
    return this;
  }

  /**
   * Set the waveform information modulated, or impressed, on the carrier.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withSignal(String value) {
    setSignal(new S100(value));
    return this;
  }

  /**
   * Set how many ramp techniques occur during the programmed frequency range
   * dwell time.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withTechniques(Integer value) {
    setTechniques(new UN5(value));
    return this;
  }

  /**
   * Set a short description of the threat name or threat type.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withThreat(String value) {
    setThreat(new S100(value));
    return this;
  }

  /**
   * Set the amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withTxDuration(String value) {
    setTxDuration(new US_Duration(value));
    return this;
  }

  /**
   * Set the US:TimingDeconflictionProtocol
   * <p>
   * Complex element TimingDeconflictionProtocol (US) defines algorithm(s) used
   * for synchronising Electronic Warfare jamming information.
   * <p>
   * @param values One or more instances of type
   *               {@link TimingDeconflictionProtocol...}.
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withTimingDeconflictionProtocol(TimingDeconflictionProtocol... values) {
    if (values != null) {
      getTimingDeconflictionProtocol().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:TimingDeconflictionProtocol
   * <p>
   * Complex element TimingDeconflictionProtocol (US) defines algorithm(s) used
   * for synchronising Electronic Warfare jamming information.
   * <p>
   * @param values A collection of {@link TimingDeconflictionProtocol} instances
   * @return The current JammingChannelProfile object instance.
   * @since 3.1.0
   */
  public JammingChannelProfile withTimingDeconflictionProtocol(Collection<TimingDeconflictionProtocol> values) {
    if (values != null) {
      getTimingDeconflictionProtocol().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JammingChannelProfile instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JammingChannelProfile {"
           + (activationPower != null ? " activationPower [" + activationPower + "]" : "")
           + (activationTime != null ? " activationTime [" + activationTime + "]" : "")
           + (carrierWaveform != null ? " carrierWaveform [" + carrierWaveform + "]" : "")
           + (centerFreq != null ? " centerFreq [" + centerFreq + "]" : "")
           + (channelSpacing != null ? " channelSpacing [" + channelSpacing + "]" : "")
           + (direction != null ? " direction [" + direction + "]" : "")
           + (dwell != null ? " dwell [" + dwell + "]" : "")
           + (exBlankingOn != null ? " exBlankingOn [" + exBlankingOn + "]" : "")
           + (fftType != null ? " fftType [" + fftType + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (observeTime != null ? " observeTime [" + observeTime + "]" : "")
           + (offsetFreq != null ? " offsetFreq [" + offsetFreq + "]" : "")
           + (rxDuration != null ? " rxDuration [" + rxDuration + "]" : "")
           + (signal != null ? " signal [" + signal + "]" : "")
           + (techniques != null ? " techniques [" + techniques + "]" : "")
           + (threat != null ? " threat [" + threat + "]" : "")
           + (timingDeconflictionProtocol != null ? " timingDeconflictionProtocol [" + timingDeconflictionProtocol + "]" : "")
           + (txDuration != null ? " txDuration [" + txDuration + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingChannelProfile} requires
   * {@link S100 CarrierWaveform}, {@link FreqM FreqMin}, {@link S100 Signal}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCarrierWaveform() && isSetFreqMin() && isSetSignal();
  }

}
