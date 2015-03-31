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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDF;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFM;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCMO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSI;
import us.gov.dod.standard.ssrf._3_1.receiver.RxModulation;

/**
 * TxModulation contains the detailed characteristics of the modulation on the
 * transmitter side.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;TxModulation&gt;
 *   &lt;DigitalModType&gt;ASK/OOK&lt;/DigitalModType&gt;
 *   &lt;MaxBitRate&gt;27000000&lt;/MaxBitRate&gt;
 *   &lt;MaxDevRatio&gt;3&lt;/MaxDevRatio&gt;
 * &lt;/TxModulation&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModulation", propOrder = {
  "maxDevRatio",
  "amIdx",
  "amrmsIdx",
  "fmPeakFreqDev",
  "fmrmsFreqDev",
  "fmDeviationCode",
  "fmPeakModulationIdx",
  "carrierSuppression",
  "sidebandSuppression",
  "sidebandSuppressed",
  "keysAngle",
  "keysDesc",
  "muxLevel",
  "muxScheme",
  "symbolSize"
})
public class TxModulation extends RxModulation {

  /**
   * MaxDevRatio - Maximum Deviation Ratio (Optional)
   * <p>
   * The deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * Format is UN(5,3)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxDevRatio", required = false)
  private UN5_3 maxDevRatio;
  /**
   * AMIdx - Amplitude Modulation Index (Optional)
   * <p>
   * The amplitude modulation index, which is a unitless value for an amplitude
   * modulation signal derived by dividing the peak modulating voltage by the
   * peak carrier voltage. The modulation index should always be %gt; 0 and %lt;
   * 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If %gt; 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group AM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AMIdx", required = false)
  private UN5_3 amIdx;
  /**
   * AMRMSIdx - RMS Amplitude Modulation Index (Optional)
   * <p>
   * The RMS modulation index when analog or phase modulation is used and the
   * baseband consists of FDM channels or multiple subcarrier signals. The RMS
   * Amplitude Modulation Index is a unitless value for an amplitude modulation
   * signal derived by dividing the RMS peak modulating voltage by the RMS peak
   * carrier voltage.
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group AM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AMRMSIdx", required = false)
  private UN5_3 amrmsIdx;
  /**
   * FMPeakFreqDev - Peak Frequency Deviation (Optional)
   * <p>
   * The peak frequency deviation when analog modulation is employed.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMPeakFreqDev", required = false)
  private FreqM fmPeakFreqDev;
  /**
   * FMRmsFreqDev - RMS Frequency Deviation (Optional)
   * <p>
   * The Root Means Square (RMS) frequency deviation when frequency modulation
   * (FM) is employed and the base band consists of frequency-division
   * multiplexed (FDM) channels or multiple subcarrier signals.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMRMSFreqDev", required = false)
  private FreqM fmrmsFreqDev;
  /**
   * FMDeviationCode - Peak Frequency Deviation (Optional)
   * <p>
   * The code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * Format is L:CFM
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMDeviationCode", required = false)
  private TString fmDeviationCode;
  /**
   * FMPeakModulationIdx - FM Peak Modulation Index (Optional)
   * <p>
   * The peak modulation index (deviation ratio) when using analog frequency or
   * phase modulation.
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FMPeakModulationIdx", required = false)
  private UN5_3 fmPeakModulationIdx;
  /**
   * CarrierSuppression - Level of Carrier Suppression (Optional)
   * <p>
   * The amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CarrierSuppression", required = false)
  private dB carrierSuppression;
  /**
   * SidebandSuppression - Level of Sideband Suppression (Optional)
   * <p>
   * The amount that one or both of the sidebands of a signal are reduced prior
   * to transmission. “One or both" is determined by evaluation of the emission
   * designator.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SidebandSuppression", required = false)
  private dB sidebandSuppression;
  /**
   * SidebandSuppressed - Sideband Suppressed (Optional)
   * <p>
   * The sideband that is suppressed in a single sideband signal.
   * <p>
   * Format is L:CSI
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SidebandSuppressed", required = false)
  private TString sidebandSuppressed;
  /**
   * US:KeysAngle - Keying Angle (Optional)
   * <p>
   * The keying angle for the digital/analog/hybrid data stream.
   * <p>
   * Format is UN(5,2) [0-180] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "KeysAngle", required = false)
  private Az180 keysAngle;
  /**
   * US:KeysDesc - Keying Format (Optional)
   * <p>
   * A text description of the keying format for the digital/analog/hybrid data
   * stream.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "KeysDesc", required = false)
  private S500 keysDesc;
  /**
   * In Data Item US:MUXLevel (US), enter the signal power in dB referenced to
   * the baseband carrier for the companding of the multiplexed signal.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MUXLevel", required = false)
  private Signed_DB_5_2 muxLevel;
  /**
   * In Data Item US:MUXScheme (US), enter a freetext description of the
   * multiplexing algorithm.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MUXScheme", required = false)
  private S100 muxScheme;
  /**
   * US:SymbolSize - Symbol Size (Optional)
   * <p>
   * The number of bits in the symbols being generated. For example, if this is
   * a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * Format is UN(3) (bits)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SymbolSize", required = false)
  private US_Bits symbolSize;

  /**
   * Get the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems..
   * <p>
   * @return a {@link UN5_3} instance
   * @since 3.1.0
   */
  public UN5_3 getMaxDevRatio() {
    return maxDevRatio;
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems..
   * <p>
   * @param value a {@link UN5_3} instance
   * @since 3.1.0
   */
  public void setMaxDevRatio(UN5_3 value) {
    this.maxDevRatio = value;
  }

  /**
   * Determine if the MaxDevRatio is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxDevRatio() {
    return (this.maxDevRatio != null ? this.maxDevRatio.isSetValue() : false);
  }

  /**
   * Get the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If
   * > 1, the envelope is over modulated and distorted. A typical value is 0.6.
   * <p>
   * @return a {@link UN5_3} instance
   * @since 3.1.0
   */
  public UN5_3 getAMIdx() {
    return amIdx;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If
   * > 1, the envelope is over modulated and distorted. A typical value is 0.6.
   * <p>
   * @param value a {@link UN5_3} instance
   * @since 3.1.0
   */
  public void setAMIdx(UN5_3 value) {
    this.amIdx = value;
  }

  /**
   * Determine if the AMIdx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAMIdx() {
    return (this.amIdx != null ? this.amIdx.isSetValue() : false);
  }

  /**
   * Get the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage..
   * <p>
   * @return a {@link UN5_3} instance
   * @since 3.1.0
   */
  public UN5_3 getAMRMSIdx() {
    return amrmsIdx;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage..
   * <p>
   * @param value a {@link UN5_3} instance
   * @since 3.1.0
   */
  public void setAMRMSIdx(UN5_3 value) {
    this.amrmsIdx = value;
  }

  /**
   * Determine if the AMRMSIdx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAMRMSIdx() {
    return (this.amrmsIdx != null ? this.amrmsIdx.isSetValue() : false);
  }

  /**
   * Get the peak frequency deviation when analog modulation is employed..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFMPeakFreqDev() {
    return fmPeakFreqDev;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFMPeakFreqDev(FreqM value) {
    this.fmPeakFreqDev = value;
  }

  /**
   * Determine if the FMPeakFreqDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMPeakFreqDev() {
    return (this.fmPeakFreqDev != null ? this.fmPeakFreqDev.isSetValue() : false);
  }

  /**
   * Get the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFMRMSFreqDev() {
    return fmrmsFreqDev;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFMRMSFreqDev(FreqM value) {
    this.fmrmsFreqDev = value;
  }

  /**
   * Determine if the FMRMSFreqDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMRMSFreqDev() {
    return (this.fmrmsFreqDev != null ? this.fmrmsFreqDev.isSetValue() : false);
  }

  /**
   * Get the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel)..
   * <p>
   * @return the FMDeviationCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFMDeviationCode() {
    return fmDeviationCode;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel)..
   * <p>
   * @param value the FMDeviationCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFMDeviationCode(TString value) {
    this.fmDeviationCode = value;
  }

  /**
   * Determine if the FMDeviationCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMDeviationCode() {
    return (this.fmDeviationCode != null ? this.fmDeviationCode.isSetValue() : false);
  }

  /**
   * Get the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation..
   * <p>
   * @return a {@link UN5_3} instance
   * @since 3.1.0
   */
  public UN5_3 getFMPeakModulationIdx() {
    return fmPeakModulationIdx;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation..
   * <p>
   * @param value a {@link UN5_3} instance
   * @since 3.1.0
   */
  public void setFMPeakModulationIdx(UN5_3 value) {
    this.fmPeakModulationIdx = value;
  }

  /**
   * Determine if the FMPeakModulationIdx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMPeakModulationIdx() {
    return (this.fmPeakModulationIdx != null ? this.fmPeakModulationIdx.isSetValue() : false);
  }

  /**
   * Get the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getCarrierSuppression() {
    return carrierSuppression;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setCarrierSuppression(dB value) {
    this.carrierSuppression = value;
  }

  /**
   * Determine if the CarrierSuppression is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCarrierSuppression() {
    return (this.carrierSuppression != null ? this.carrierSuppression.isSetValue() : false);
  }

  /**
   * Get the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getSidebandSuppression() {
    return sidebandSuppression;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setSidebandSuppression(dB value) {
    this.sidebandSuppression = value;
  }

  /**
   * Determine if the SidebandSuppression is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSidebandSuppression() {
    return (this.sidebandSuppression != null ? this.sidebandSuppression.isSetValue() : false);
  }

  /**
   * Get the sideband that is suppressed in a single sideband signal..
   * <p>
   * @return the SidebandSuppressed value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSidebandSuppressed() {
    return sidebandSuppressed;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal..
   * <p>
   * @param value the SidebandSuppressed value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSidebandSuppressed(TString value) {
    this.sidebandSuppressed = value;
  }

  /**
   * Determine if the SidebandSuppressed is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSidebandSuppressed() {
    return (this.sidebandSuppressed != null ? this.sidebandSuppressed.isSetValue() : false);
  }

  /**
   * Get the keying angle for the digital/analog/hybrid data stream..
   * <p>
   * @return a {@link Az180} instance
   * @since 3.1.0
   */
  public Az180 getKeysAngle() {
    return keysAngle;
  }

  /**
   * Set the keying angle for the digital/analog/hybrid data stream..
   * <p>
   * @param value a {@link Az180} instance
   * @since 3.1.0
   */
  public void setKeysAngle(Az180 value) {
    this.keysAngle = value;
  }

  /**
   * Determine if the KeysAngle is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetKeysAngle() {
    return (this.keysAngle != null ? this.keysAngle.isSetValue() : false);
  }

  /**
   * Get a text description of the keying format for the digital/analog/hybrid
   * data stream..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getKeysDesc() {
    return keysDesc;
  }

  /**
   * Set a text description of the keying format for the digital/analog/hybrid
   * data stream..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setKeysDesc(S500 value) {
    this.keysDesc = value;
  }

  /**
   * Determine if the KeysDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetKeysDesc() {
    return (this.keysDesc != null ? this.keysDesc.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MUXLevel (US), enter the signal power in dB referenced
   * to the baseband carrier for the companding of the multiplexed signal..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getMUXLevel() {
    return muxLevel;
  }

  /**
   * Set In Data Item US:MUXLevel (US), enter the signal power in dB referenced
   * to the baseband carrier for the companding of the multiplexed signal..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMUXLevel(Signed_DB_5_2 value) {
    this.muxLevel = value;
  }

  /**
   * Determine if the MUXLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMUXLevel() {
    return (this.muxLevel != null ? this.muxLevel.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MUXScheme (US), enter a freetext description of the
   * multiplexing algorithm..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getMUXScheme() {
    return muxScheme;
  }

  /**
   * Set In Data Item US:MUXScheme (US), enter a freetext description of the
   * multiplexing algorithm..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setMUXScheme(S100 value) {
    this.muxScheme = value;
  }

  /**
   * Determine if the MUXScheme is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMUXScheme() {
    return (this.muxScheme != null ? this.muxScheme.isSetValue() : false);
  }

  /**
   * Get the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words..
   * <p>
   * @return a {@link US_Bits} instance
   * @since 3.1.0
   */
  public US_Bits getSymbolSize() {
    return symbolSize;
  }

  /**
   * Set the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words..
   * <p>
   * @param value a {@link US_Bits} instance
   * @since 3.1.0
   */
  public void setSymbolSize(US_Bits value) {
    this.symbolSize = value;
  }

  /**
   * Determine if the SymbolSize is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSymbolSize() {
    return (this.symbolSize != null ? this.symbolSize.isSetValue() : false);
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withMaxDevRatio(Double value) {
    setMaxDevRatio(new UN5_3(value));
    return this;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and < 1. If = 0, the resultant modulated waveform is a constant keyed carrier without a modulating signal. If
   * > 1, the envelope is over modulated and distorted. A typical value is 0.6
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withAMIdx(Double value) {
    setAMIdx(new UN5_3(value));
    return this;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withAMRMSIdx(Double value) {
    setAMRMSIdx(new UN5_3(value));
    return this;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withFMPeakFreqDev(Double value) {
    setFMPeakFreqDev(new FreqM(value));
    return this;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withFMRMSFreqDev(Double value) {
    setFMRMSFreqDev(new FreqM(value));
    return this;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value An instances of type {@link ListCFM}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withFMDeviationCode(ListCFM value) {
    setFMDeviationCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withFMPeakModulationIdx(Double value) {
    setFMPeakModulationIdx(new UN5_3(value));
    return this;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withCarrierSuppression(Double value) {
    setCarrierSuppression(new dB(value));
    return this;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withSidebandSuppression(Double value) {
    setSidebandSuppression(new dB(value));
    return this;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal.
   * <p>
   * @param value An instances of type {@link ListCSI}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withSidebandSuppressed(ListCSI value) {
    setSidebandSuppressed(new TString(value.value()));
    return this;
  }

  /**
   * Set the keying angle for the digital/analog/hybrid data stream.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withKeysAngle(Double value) {
    setKeysAngle(new Az180(value));
    return this;
  }

  /**
   * Set a text description of the keying format for the digital/analog/hybrid
   * data stream.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withKeysDesc(String value) {
    setKeysDesc(new S500(value));
    return this;
  }

  /**
   * Set In Data Item US:MUXLevel (US), enter the signal power in dB referenced
   * to the baseband carrier for the companding of the multiplexed signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withMUXLevel(Double value) {
    setMUXLevel(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MUXScheme (US), enter a freetext description of the
   * multiplexing algorithm.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withMUXScheme(String value) {
    setMUXScheme(new S100(value));
    return this;
  }

  /**
   * Set the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  public TxModulation withSymbolSize(Double value) {
    setSymbolSize(new US_Bits(value));
    return this;
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value An instances of type {@link ListCMO}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withDigitalModType(ListCMO value) {
    setDigitalModType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withMaxBitRate(Double value) {
    setMaxBitRate(new BitRate(value));
    return this;
  }

  /**
   * Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withNumStates(Integer value) {
    setNumStates(new UN5(value));
    return this;
  }

  /**
   * Set the format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * @param value An instances of type {@link ListCDF}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withLineCoding(ListCDF value) {
    setLineCoding(new TString(value.value()));
    return this;
  }

  /**
   * Set the pseudorandom code rate.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withCodeRate(Double value) {
    setCodeRate(new BitRate(value));
    return this;
  }

  /**
   * Set the length of time of the pseudorandom code repetition period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModulation object instance.
   * @since 3.1.0
   */
  @Override
  public TxModulation withCodePeriod(Double value) {
    setCodePeriod(new microsecs(value));
    return this;
  }

  /**
   * Get a string representation of this TxModulation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxModulation {"
           + (amIdx != null ? "\n amIdx [" + amIdx + "]" : "")
           + (amrmsIdx != null ? "\n amrmsIdx [" + amrmsIdx + "]" : "")
           + (carrierSuppression != null ? "\n carrierSuppression [" + carrierSuppression + "]" : "")
           + (fmDeviationCode != null ? "\n fmDeviationCode [" + fmDeviationCode + "]" : "")
           + (fmPeakFreqDev != null ? "\n fmPeakFreqDev [" + fmPeakFreqDev + "]" : "")
           + (fmPeakModulationIdx != null ? "\n fmPeakModulationIdx [" + fmPeakModulationIdx + "]" : "")
           + (fmrmsFreqDev != null ? "\n fmrmsFreqDev [" + fmrmsFreqDev + "]" : "")
           + (keysAngle != null ? "\n keysAngle [" + keysAngle + "]" : "")
           + (keysDesc != null ? "\n keysDesc [" + keysDesc + "]" : "")
           + (maxDevRatio != null ? "\n maxDevRatio [" + maxDevRatio + "]" : "")
           + (muxLevel != null ? "\n muxLevel [" + muxLevel + "]" : "")
           + (muxScheme != null ? "\n muxScheme [" + muxScheme + "]" : "")
           + (sidebandSuppressed != null ? "\n sidebandSuppressed [" + sidebandSuppressed + "]" : "")
           + (sidebandSuppression != null ? "\n sidebandSuppression [" + sidebandSuppression + "]" : "")
           + (symbolSize != null ? "\n symbolSize [" + symbolSize + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxModulation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
