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
package us.gov.dod.standard.ssrf._3_1.loadset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Loadset;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "ActivationPower", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBM.class)
  private TDecimal activationPower;
  /**
   * US:ActivationTime - Activation Time (Optional)
   * <p>
   * The minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ActivationTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal activationTime;
  /**
   * US:CarrierWaveform - Carrier Waveform (Required)
   * <p>
   * The waveform that will be used for the carrier of the jamming signal.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "CarrierWaveform", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString carrierWaveform;
  /**
   * US:CenterFreq - Center Frequency (Optional)
   * <p>
   * The middle frequency in the band.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "CenterFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal centerFreq;
  /**
   * US:ChannelSpacing - Channel Spacing (Optional)
   * <p>
   * The frequency increment between discrete channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "ChannelSpacing", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal channelSpacing;
  /**
   * US:Direction - Sweep Direction (Optional)
   * <p>
   * The sweep direction from the center frequency.
   * <p>
   * Format is L:ULD
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
   */
  @XmlElement(name = "Dwell", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal dwell;
  /**
   * In Data Item ExBlankingOn (US), indicate if external blanking is enabled.
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
   */
  @XmlElement(name = "FFTType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString fftType;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Required)
   * <p>
   * The target discrete frequency, or frequency range minimum value.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * US:ObserveTime - Observe Time (Optional)
   * <p>
   * The time interval for the recording of received signals, in (0-999) hours,
   * (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   */
  @XmlElement(name = "ObserveTime", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS_DURATION.class)
  private TString observeTime;
  /**
   * US:OffsetFreq - Offset Frequency (Optional)
   * <p>
   * The frequency offset relative to the center frequency of the channel.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "OffsetFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal offsetFreq;
  /**
   * US:RxDuration - Receive Duration (Optional)
   * <p>
   * The amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   */
  @XmlElement(name = "RxDuration", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS_DURATION.class)
  private TString rxDuration;
  /**
   * US:Signal - Signal (Required)
   * <p>
   * The waveform information modulated, or impressed, on the carrier.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Signal", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString signal;
  /**
   * US:Techniques - Techniques (Optional)
   * <p>
   * How many ramp techniques occur during the programmed frequency range dwell
   * time.
   * <p>
   * Format is UN(5)
   */
  @XmlElement(name = "Techniques", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger techniques;
  /**
   * US:Threat - Threat (Optional)
   * <p>
   * A short description of the threat name or threat type.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Threat", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString threat;
  /**
   * US:TxDuration - Transmit Duration (Optional)
   * <p>
   * The amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000).
   * <p>
   * Format is pattern (S16)
   */
  @XmlElement(name = "TxDuration", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS_DURATION.class)
  private TString txDuration;
  /**
   * US:TimingDeconflictionProtocol (Optional)
   * <p>
   * TimingDeconflictionProtocol (US) defines algorithm(s) used for
   * synchronising Electronic Warfare jamming information.
   */
  @XmlElement(name = "TimingDeconflictionProtocol")
  private List<TimingDeconflictionProtocol> timingDeconflictionProtocol;

  /**
   * Get the signal level required to activate the loadset, for systems capable
   * of selecting multiple power thresholds by sub-band or other region of
   * interest.
   * <p>
   * @return the ActivationPower value in a {@link TDecimal} data type
   */
  public TDecimal getActivationPower() {
    return activationPower;
  }

  /**
   * Set the signal level required to activate the loadset, for systems capable
   * of selecting multiple power thresholds by sub-band or other region of
   * interest.
   * <p>
   * @param value the ActivationPower value in a {@link TDecimal} data type
   */
  public void setActivationPower(TDecimal value) {
    this.activationPower = value;
  }

  /**
   * Determine if the ActivationPower is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActivationPower() {
    return (this.activationPower != null ? this.activationPower.isSetValue() : false);
  }

  /**
   * Get the minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * @return the ActivationTime value in a {@link TDecimal} data type
   */
  public TDecimal getActivationTime() {
    return activationTime;
  }

  /**
   * Set the minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * @param value the ActivationTime value in a {@link TDecimal} data type
   */
  public void setActivationTime(TDecimal value) {
    this.activationTime = value;
  }

  /**
   * Determine if the ActivationTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetActivationTime() {
    return (this.activationTime != null ? this.activationTime.isSetValue() : false);
  }

  /**
   * Get the waveform that will be used for the carrier of the jamming signal.
   * <p>
   * @return the CarrierWaveform value in a {@link TString} data type
   */
  public TString getCarrierWaveform() {
    return carrierWaveform;
  }

  /**
   * Set the waveform that will be used for the carrier of the jamming signal.
   * <p>
   * @param value the CarrierWaveform value in a {@link TString} data type
   */
  public void setCarrierWaveform(TString value) {
    this.carrierWaveform = value;
  }

  /**
   * Determine if the CarrierWaveform is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCarrierWaveform() {
    return (this.carrierWaveform != null ? this.carrierWaveform.isSetValue() : false);
  }

  /**
   * Get the middle frequency in the band.
   * <p>
   * @return the CenterFreq value in a {@link TDecimal} data type
   */
  public TDecimal getCenterFreq() {
    return centerFreq;
  }

  /**
   * Set the middle frequency in the band.
   * <p>
   * @param value the CenterFreq value in a {@link TDecimal} data type
   */
  public void setCenterFreq(TDecimal value) {
    this.centerFreq = value;
  }

  /**
   * Determine if the CenterFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCenterFreq() {
    return (this.centerFreq != null ? this.centerFreq.isSetValue() : false);
  }

  /**
   * Get the frequency increment between discrete channels.
   * <p>
   * @return the ChannelSpacing value in a {@link TDecimal} data type
   */
  public TDecimal getChannelSpacing() {
    return channelSpacing;
  }

  /**
   * Set the frequency increment between discrete channels.
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
   * Get the sweep direction from the center frequency.
   * <p>
   * @return the Direction value in a {@link TString} data type
   */
  public TString getDirection() {
    return direction;
  }

  /**
   * Set the sweep direction from the center frequency.
   * <p>
   * @param value the Direction value in a {@link TString} data type
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
   * frequency before moving to next technique.
   * <p>
   * @return the Dwell value in a {@link TDecimal} data type
   */
  public TDecimal getDwell() {
    return dwell;
  }

  /**
   * Set the frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique.
   * <p>
   * @param value the Dwell value in a {@link TDecimal} data type
   */
  public void setDwell(TDecimal value) {
    this.dwell = value;
  }

  /**
   * Determine if the Dwell is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDwell() {
    return (this.dwell != null ? this.dwell.isSetValue() : false);
  }

  /**
   * Get In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled.
   * <p>
   * @return the ExBlankingOn value in a {@link TString} data type
   */
  public TString getExBlankingOn() {
    return exBlankingOn;
  }

  /**
   * Set In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled.
   * <p>
   * @param value the ExBlankingOn value in a {@link TString} data type
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
   * Discrete).
   * <p>
   * @return the FFTType value in a {@link TString} data type
   */
  public TString getFFTType() {
    return fftType;
  }

  /**
   * Set the form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete).
   * <p>
   * @param value the FFTType value in a {@link TString} data type
   */
  public void setFFTType(TString value) {
    this.fftType = value;
  }

  /**
   * Determine if the FFTType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFFTType() {
    return (this.fftType != null ? this.fftType.isSetValue() : false);
  }

  /**
   * Get the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
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
   * Get the target discrete frequency, or frequency range minimum value.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the target discrete frequency, or frequency range minimum value.
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
   * Get the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * @return the ObserveTime value in a {@link TString} data type
   */
  public TString getObserveTime() {
    return observeTime;
  }

  /**
   * Set the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * @param value the ObserveTime value in a {@link TString} data type
   */
  public void setObserveTime(TString value) {
    this.observeTime = value;
  }

  /**
   * Determine if the ObserveTime is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObserveTime() {
    return (this.observeTime != null ? this.observeTime.isSetValue() : false);
  }

  /**
   * Get the frequency offset relative to the center frequency of the channel.
   * <p>
   * @return the OffsetFreq value in a {@link TDecimal} data type
   */
  public TDecimal getOffsetFreq() {
    return offsetFreq;
  }

  /**
   * Set the frequency offset relative to the center frequency of the channel.
   * <p>
   * @param value the OffsetFreq value in a {@link TDecimal} data type
   */
  public void setOffsetFreq(TDecimal value) {
    this.offsetFreq = value;
  }

  /**
   * Determine if the OffsetFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * @return the RxDuration value in a {@link TString} data type
   */
  public TString getRxDuration() {
    return rxDuration;
  }

  /**
   * Set the amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * @param value the RxDuration value in a {@link TString} data type
   */
  public void setRxDuration(TString value) {
    this.rxDuration = value;
  }

  /**
   * Determine if the RxDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxDuration() {
    return (this.rxDuration != null ? this.rxDuration.isSetValue() : false);
  }

  /**
   * Get the waveform information modulated, or impressed, on the carrier.
   * <p>
   * @return the Signal value in a {@link TString} data type
   */
  public TString getSignal() {
    return signal;
  }

  /**
   * Set the waveform information modulated, or impressed, on the carrier.
   * <p>
   * @param value the Signal value in a {@link TString} data type
   */
  public void setSignal(TString value) {
    this.signal = value;
  }

  /**
   * Determine if the Signal is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignal() {
    return (this.signal != null ? this.signal.isSetValue() : false);
  }

  /**
   * Get how many ramp techniques occur during the programmed frequency range
   * dwell time.
   * <p>
   * @return the Techniques value in a {@link TInteger} data type
   */
  public TInteger getTechniques() {
    return techniques;
  }

  /**
   * Set how many ramp techniques occur during the programmed frequency range
   * dwell time.
   * <p>
   * @param value the Techniques value in a {@link TInteger} data type
   */
  public void setTechniques(TInteger value) {
    this.techniques = value;
  }

  /**
   * Determine if the Techniques is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTechniques() {
    return (this.techniques != null ? this.techniques.isSetValue() : false);
  }

  /**
   * Get a short description of the threat name or threat type.
   * <p>
   * @return the Threat value in a {@link TString} data type
   */
  public TString getThreat() {
    return threat;
  }

  /**
   * Set a short description of the threat name or threat type.
   * <p>
   * @param value the Threat value in a {@link TString} data type
   */
  public void setThreat(TString value) {
    this.threat = value;
  }

  /**
   * Determine if the Threat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * nanoseconds (000.00.000001000).
   * <p>
   * @return the TxDuration value in a {@link TString} data type
   */
  public TString getTxDuration() {
    return txDuration;
  }

  /**
   * Set the amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000).
   * <p>
   * @param value the TxDuration value in a {@link TString} data type
   */
  public void setTxDuration(TString value) {
    this.txDuration = value;
  }

  /**
   * Determine if the TxDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * for synchronising Electronic Warfare jamming information.
   * <p>
   * @return a {@link List<TimingDeconflictionProtocol>} instance
   */
  public List<TimingDeconflictionProtocol> getTimingDeconflictionProtocol() {
    if (timingDeconflictionProtocol == null) {
      timingDeconflictionProtocol = new ArrayList<>();
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
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withActivationPower(Double value) {
    setActivationPower(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum time required to trigger the jammer after start of signal
   * reception.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withActivationTime(Double value) {
    setActivationTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the waveform that will be used for the carrier of the jamming signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withCarrierWaveform(String value) {
    setCarrierWaveform(new TString(value));
    return this;
  }

  /**
   * Set the middle frequency in the band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withCenterFreq(Double value) {
    setCenterFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the frequency increment between discrete channels.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withChannelSpacing(Double value) {
    setChannelSpacing(new TDecimal(value));
    return this;
  }

  /**
   * Set the sweep direction from the center frequency.
   * <p>
   * @param value An instances of type {@link ListULD}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withDirection(ListULD value) {
    setDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the frequency range dwell time; how long a sweep pauses on a particular
   * frequency before moving to next technique.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withDwell(Double value) {
    setDwell(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item ExBlankingOn (US), indicate if external blanking is
   * enabled.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withExBlankingOn(ListCBO value) {
    setExBlankingOn(new TString(value.value()));
    return this;
  }

  /**
   * Set the form of the Fast Fourier Transform used (e.g., Integral, Serial,
   * Discrete).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withFFTType(String value) {
    setFFTType(new TString(value));
    return this;
  }

  /**
   * Set the target frequency range maximum value.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the target discrete frequency, or frequency range minimum value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the time interval for the recording of received signals, in (0-999)
   * hours, (0-59) minutes, and (0-999,999,999) nanoseconds (hhh.mm.sssssssss).
   * Example: one microsecond is entered as 1,000 nanoseconds
   * (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withObserveTime(String value) {
    setObserveTime(new TString(value));
    return this;
  }

  /**
   * Set the frequency offset relative to the center frequency of the channel.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withOffsetFreq(Double value) {
    setOffsetFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of time that the equipment will monitor the spectrum before
   * initiating an action, in (0-999) hours, (0-59) minutes, and (0-999,999,999)
   * nanoseconds (hhh.mm.sssssssss). Example: one microsecond is entered as
   * 1,000 nanoseconds (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withRxDuration(String value) {
    setRxDuration(new TString(value));
    return this;
  }

  /**
   * Set the waveform information modulated, or impressed, on the carrier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withSignal(String value) {
    setSignal(new TString(value));
    return this;
  }

  /**
   * Set how many ramp techniques occur during the programmed frequency range
   * dwell time.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withTechniques(Integer value) {
    setTechniques(new TInteger(value));
    return this;
  }

  /**
   * Set a short description of the threat name or threat type.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withThreat(String value) {
    setThreat(new TString(value));
    return this;
  }

  /**
   * Set the amount of time that the equipment will emit a jamming signal, in in
   * (0-999) hours, (0-59) minutes, and (0-999,999,999) nanoseconds
   * (hhh.mm.sssssssss). Example: one microsecond is entered as 1,000
   * nanoseconds (000.00.000001000).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JammingChannelProfile object instance
   */
  public JammingChannelProfile withTxDuration(String value) {
    setTxDuration(new TString(value));
    return this;
  }

  /**
   * Set the US:TimingDeconflictionProtocol
   * <p>
   * Complex element TimingDeconflictionProtocol (US) defines algorithm(s) used
   * for synchronising Electronic Warfare jamming information.
   * <p>
   * @param values One or more instances of type
   *               {@link TimingDeconflictionProtocol...}
   * @return The current JammingChannelProfile object instance
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
   * @return The current JammingChannelProfile object instance
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
      + " timingDeconflictionProtocol [" + timingDeconflictionProtocol + "]"
      + " offsetFreq [" + offsetFreq + "]"
      + " dwell [" + dwell + "]"
      + " txDuration [" + txDuration + "]"
      + " centerFreq [" + centerFreq + "]"
      + " threat [" + threat + "]"
      + " direction [" + direction + "]"
      + " freqMin [" + freqMin + "]"
      + " freqMax [" + freqMax + "]"
      + " techniques [" + techniques + "]"
      + " signal [" + signal + "]"
      + " rxDuration [" + rxDuration + "]"
      + " channelSpacing [" + channelSpacing + "]"
      + " activationTime [" + activationTime + "]"
      + " fftType [" + fftType + "]"
      + " exBlankingOn [" + exBlankingOn + "]"
      + " activationPower [" + activationPower + "]"
      + " carrierWaveform [" + carrierWaveform + "]"
      + " observeTime [" + observeTime + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JammingChannelProfile} requires
   * {@link TString CarrierWaveform}, {@link TDecimal FreqMin}, {@link TString Signal}.
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
