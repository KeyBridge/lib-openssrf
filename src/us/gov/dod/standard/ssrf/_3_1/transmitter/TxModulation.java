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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFM;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
public class TxModulation
  extends RxModulation {

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
   */
  @XmlElement(name = "MaxDevRatio", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal maxDevRatio;
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
   */
  @XmlElement(name = "AMIdx", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amIdx;
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
   */
  @XmlElement(name = "AMRMSIdx", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amrmsIdx;
  /**
   * FMPeakFreqDev - Peak Frequency Deviation (Optional)
   * <p>
   * The peak frequency deviation when analog modulation is employed.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FM (Optional)
   */
  @XmlElement(name = "FMPeakFreqDev", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmPeakFreqDev;
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
   */
  @XmlElement(name = "FMRMSFreqDev", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmrmsFreqDev;
  /**
   * FMDeviationCode - Peak Frequency Deviation (Optional)
   * <p>
   * The code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * Format is L:CFM
   * <p>
   * Attribute group FM (Optional)
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
   */
  @XmlElement(name = "FMPeakModulationIdx", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal fmPeakModulationIdx;
  /**
   * CarrierSuppression - Level of Carrier Suppression (Optional)
   * <p>
   * The amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   */
  @XmlElement(name = "CarrierSuppression", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal carrierSuppression;
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
   */
  @XmlElement(name = "SidebandSuppression", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal sidebandSuppression;
  /**
   * SidebandSuppressed - Sideband Suppressed (Optional)
   * <p>
   * The sideband that is suppressed in a single sideband signal.
   * <p>
   * Format is L:CSI
   * <p>
   * Attribute group Suppression (Optional)
   */
  @XmlElement(name = "SidebandSuppressed", required = false)
  private TString sidebandSuppressed;
  /**
   * US:KeysAngle - Keying Angle (Optional)
   * <p>
   * The keying angle for the digital/analog/hybrid data stream.
   * <p>
   * Format is UN(5,2) [0-180] (deg)
   */
  @XmlElement(name = "KeysAngle", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal keysAngle;
  /**
   * US:KeysDesc - Keying Format (Optional)
   * <p>
   * A text description of the keying format for the digital/analog/hybrid data
   * stream.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "KeysDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString keysDesc;
  /**
   * US:MUXLevel (US) - The signal power in dB referenced to the baseband
   * carrier for the companding of the multiplexed signal.
   */
  @XmlElement(name = "MUXLevel", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal muxLevel;
  /**
   * US:MUXScheme (US), enter a freetext description of the multiplexing
   * algorithm.
   */
  @XmlElement(name = "MUXScheme", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString muxScheme;
  /**
   * US:SymbolSize - Symbol Size (Optional)
   * <p>
   * The number of bits in the symbols being generated. For example, if this is
   * a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * Format is UN(3) (bits)
   */
  @XmlElement(name = "SymbolSize", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_BITS.class)
  private TDecimal symbolSize;

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
   * modulated systems.
   * <p>
   * @return the MaxDevRatio value in a {@link TDecimal} data type
   */
  public TDecimal getMaxDevRatio() {
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
   * modulated systems.
   * <p>
   * @param value the MaxDevRatio value in a {@link TDecimal} data type
   */
  public void setMaxDevRatio(TDecimal value) {
    this.maxDevRatio = value;
  }

  /**
   * Determine if the MaxDevRatio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxDevRatio() {
    return (this.maxDevRatio != null ? this.maxDevRatio.isSetValue() : false);
  }

  /**
   * Get the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @return the AMIdx value in a {@link TDecimal} data type
   */
  public TDecimal getAMIdx() {
    return amIdx;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value the AMIdx value in a {@link TDecimal} data type
   */
  public void setAMIdx(TDecimal value) {
    this.amIdx = value;
  }

  /**
   * Determine if the AMIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * the RMS peak carrier voltage.
   * <p>
   * @return the AMRMSIdx value in a {@link TDecimal} data type
   */
  public TDecimal getAMRMSIdx() {
    return amrmsIdx;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @param value the AMRMSIdx value in a {@link TDecimal} data type
   */
  public void setAMRMSIdx(TDecimal value) {
    this.amrmsIdx = value;
  }

  /**
   * Determine if the AMRMSIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAMRMSIdx() {
    return (this.amrmsIdx != null ? this.amrmsIdx.isSetValue() : false);
  }

  /**
   * Get the peak frequency deviation when analog modulation is employed.
   * <p>
   * @return the FMPeakFreqDev value in a {@link TDecimal} data type
   */
  public TDecimal getFMPeakFreqDev() {
    return fmPeakFreqDev;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed.
   * <p>
   * @param value the FMPeakFreqDev value in a {@link TDecimal} data type
   */
  public void setFMPeakFreqDev(TDecimal value) {
    this.fmPeakFreqDev = value;
  }

  /**
   * Determine if the FMPeakFreqDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * signals.
   * <p>
   * @return the FMRMSFreqDev value in a {@link TDecimal} data type
   */
  public TDecimal getFMRMSFreqDev() {
    return fmrmsFreqDev;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @param value the FMRMSFreqDev value in a {@link TDecimal} data type
   */
  public void setFMRMSFreqDev(TDecimal value) {
    this.fmrmsFreqDev = value;
  }

  /**
   * Determine if the FMRMSFreqDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMRMSFreqDev() {
    return (this.fmrmsFreqDev != null ? this.fmrmsFreqDev.isSetValue() : false);
  }

  /**
   * Get the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @return the FMDeviationCode value in a {@link TString} data type
   */
  public TString getFMDeviationCode() {
    return fmDeviationCode;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value the FMDeviationCode value in a {@link TString} data type
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
   * or phase modulation.
   * <p>
   * @return the FMPeakModulationIdx value in a {@link TDecimal} data type
   */
  public TDecimal getFMPeakModulationIdx() {
    return fmPeakModulationIdx;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @param value the FMPeakModulationIdx value in a {@link TDecimal} data type
   */
  public void setFMPeakModulationIdx(TDecimal value) {
    this.fmPeakModulationIdx = value;
  }

  /**
   * Determine if the FMPeakModulationIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFMPeakModulationIdx() {
    return (this.fmPeakModulationIdx != null ? this.fmPeakModulationIdx.isSetValue() : false);
  }

  /**
   * Get the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @return the CarrierSuppression value in a {@link TDecimal} data type
   */
  public TDecimal getCarrierSuppression() {
    return carrierSuppression;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value the CarrierSuppression value in a {@link TDecimal} data type
   */
  public void setCarrierSuppression(TDecimal value) {
    this.carrierSuppression = value;
  }

  /**
   * Determine if the CarrierSuppression is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCarrierSuppression() {
    return (this.carrierSuppression != null ? this.carrierSuppression.isSetValue() : false);
  }

  /**
   * Get the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @return the SidebandSuppression value in a {@link TDecimal} data type
   */
  public TDecimal getSidebandSuppression() {
    return sidebandSuppression;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @param value the SidebandSuppression value in a {@link TDecimal} data type
   */
  public void setSidebandSuppression(TDecimal value) {
    this.sidebandSuppression = value;
  }

  /**
   * Determine if the SidebandSuppression is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSidebandSuppression() {
    return (this.sidebandSuppression != null ? this.sidebandSuppression.isSetValue() : false);
  }

  /**
   * Get the sideband that is suppressed in a single sideband signal.
   * <p>
   * @return the SidebandSuppressed value in a {@link TString} data type
   */
  public TString getSidebandSuppressed() {
    return sidebandSuppressed;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal.
   * <p>
   * @param value the SidebandSuppressed value in a {@link TString} data type
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
   * Get the keying angle for the digital/analog/hybrid data stream.
   * <p>
   * @return the KeysAngle value in a {@link TDecimal} data type
   */
  public TDecimal getKeysAngle() {
    return keysAngle;
  }

  /**
   * Set the keying angle for the digital/analog/hybrid data stream.
   * <p>
   * @param value the KeysAngle value in a {@link TDecimal} data type
   */
  public void setKeysAngle(TDecimal value) {
    this.keysAngle = value;
  }

  /**
   * Determine if the KeysAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetKeysAngle() {
    return (this.keysAngle != null ? this.keysAngle.isSetValue() : false);
  }

  /**
   * Get a text description of the keying format for the digital/analog/hybrid
   * data stream.
   * <p>
   * @return the KeysDesc value in a {@link TString} data type
   */
  public TString getKeysDesc() {
    return keysDesc;
  }

  /**
   * Set a text description of the keying format for the digital/analog/hybrid
   * data stream.
   * <p>
   * @param value the KeysDesc value in a {@link TString} data type
   */
  public void setKeysDesc(TString value) {
    this.keysDesc = value;
  }

  /**
   * Determine if the KeysDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetKeysDesc() {
    return (this.keysDesc != null ? this.keysDesc.isSetValue() : false);
  }

  /**
   * Get US:MUXLevel (US) - The signal power in dB referenced to the baseband
   * carrier for the companding of the multiplexed signal.
   * <p>
   * @return the MUXLevel value in a {@link TDecimal} data type
   */
  public TDecimal getMUXLevel() {
    return muxLevel;
  }

  /**
   * Set US:MUXLevel (US) - The signal power in dB referenced to the baseband
   * carrier for the companding of the multiplexed signal.
   * <p>
   * @param value the MUXLevel value in a {@link TDecimal} data type
   */
  public void setMUXLevel(TDecimal value) {
    this.muxLevel = value;
  }

  /**
   * Determine if the MUXLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMUXLevel() {
    return (this.muxLevel != null ? this.muxLevel.isSetValue() : false);
  }

  /**
   * Get US:MUXScheme (US), enter a freetext description of the multiplexing
   * algorithm.
   * <p>
   * @return the MUXScheme value in a {@link TString} data type
   */
  public TString getMUXScheme() {
    return muxScheme;
  }

  /**
   * Set US:MUXScheme (US), enter a freetext description of the multiplexing
   * algorithm.
   * <p>
   * @param value the MUXScheme value in a {@link TString} data type
   */
  public void setMUXScheme(TString value) {
    this.muxScheme = value;
  }

  /**
   * Determine if the MUXScheme is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMUXScheme() {
    return (this.muxScheme != null ? this.muxScheme.isSetValue() : false);
  }

  /**
   * Get the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * @return the SymbolSize value in a {@link TDecimal} data type
   */
  public TDecimal getSymbolSize() {
    return symbolSize;
  }

  /**
   * Set the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * @param value the SymbolSize value in a {@link TDecimal} data type
   */
  public void setSymbolSize(TDecimal value) {
    this.symbolSize = value;
  }

  /**
   * Determine if the SymbolSize is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withMaxDevRatio(Double value) {
    setMaxDevRatio(new TDecimal(value));
    return this;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withAMIdx(Double value) {
    setAMIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the RMS modulation index when analog or phase modulation is used and
   * the baseband consists of FDM channels or multiple subcarrier signals. The
   * RMS Amplitude Modulation Index is a unitless value for an amplitude
   * modulation signal derived by dividing the RMS peak modulating voltage by
   * the RMS peak carrier voltage.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withAMRMSIdx(Double value) {
    setAMRMSIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the peak frequency deviation when analog modulation is employed.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withFMPeakFreqDev(Double value) {
    setFMPeakFreqDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the Root Means Square (RMS) frequency deviation when frequency
   * modulation (FM) is employed and the base band consists of
   * frequency-division multiplexed (FDM) channels or multiple subcarrier
   * signals.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withFMRMSFreqDev(Double value) {
    setFMRMSFreqDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value An instances of type {@link ListCFM}
   * @return The current TxModulation object instance
   */
  public TxModulation withFMDeviationCode(ListCFM value) {
    setFMDeviationCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the peak modulation index (deviation ratio) when using analog frequency
   * or phase modulation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withFMPeakModulationIdx(Double value) {
    setFMPeakModulationIdx(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withCarrierSuppression(Double value) {
    setCarrierSuppression(new TDecimal(value));
    return this;
  }

  /**
   * Set the amount that one or both of the sidebands of a signal are reduced
   * prior to transmission. “One or both" is determined by evaluation of the
   * emission designator.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withSidebandSuppression(Double value) {
    setSidebandSuppression(new TDecimal(value));
    return this;
  }

  /**
   * Set the sideband that is suppressed in a single sideband signal.
   * <p>
   * @param value An instances of type {@link ListCSI}
   * @return The current TxModulation object instance
   */
  public TxModulation withSidebandSuppressed(ListCSI value) {
    setSidebandSuppressed(new TString(value.value()));
    return this;
  }

  /**
   * Set the keying angle for the digital/analog/hybrid data stream.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withKeysAngle(Double value) {
    setKeysAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set a text description of the keying format for the digital/analog/hybrid
   * data stream.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxModulation object instance
   */
  public TxModulation withKeysDesc(String value) {
    setKeysDesc(new TString(value));
    return this;
  }

  /**
   * Set US:MUXLevel (US) - The signal power in dB referenced to the baseband
   * carrier for the companding of the multiplexed signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withMUXLevel(Double value) {
    setMUXLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MUXScheme (US), enter a freetext description of the multiplexing
   * algorithm.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxModulation object instance
   */
  public TxModulation withMUXScheme(String value) {
    setMUXScheme(new TString(value));
    return this;
  }

  /**
   * Set the number of bits in the symbols being generated. For example, if this
   * is a binary stream made up of bytes then the symbolSize would be 8. For
   * Link-16 the symbolSize would be 70 since that link uses 70-bit words.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModulation object instance
   */
  public TxModulation withSymbolSize(Double value) {
    setSymbolSize(new TDecimal(value));
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
      + (muxScheme != null ? " muxScheme [" + muxScheme + "]" : "")
      + (keysAngle != null ? " keysAngle [" + keysAngle + "]" : "")
      + (sidebandSuppressed != null ? " sidebandSuppressed [" + sidebandSuppressed + "]" : "")
      + (muxLevel != null ? " muxLevel [" + muxLevel + "]" : "")
      + (amIdx != null ? " amIdx [" + amIdx + "]" : "")
      + (keysDesc != null ? " keysDesc [" + keysDesc + "]" : "")
      + (maxDevRatio != null ? " maxDevRatio [" + maxDevRatio + "]" : "")
      + (symbolSize != null ? " symbolSize [" + symbolSize + "]" : "")
      + (fmPeakModulationIdx != null ? " fmPeakModulationIdx [" + fmPeakModulationIdx + "]" : "")
      + (fmrmsFreqDev != null ? " fmrmsFreqDev [" + fmrmsFreqDev + "]" : "")
      + (carrierSuppression != null ? " carrierSuppression [" + carrierSuppression + "]" : "")
      + (fmDeviationCode != null ? " fmDeviationCode [" + fmDeviationCode + "]" : "")
      + (fmPeakFreqDev != null ? " fmPeakFreqDev [" + fmPeakFreqDev + "]" : "")
      + (amrmsIdx != null ? " amrmsIdx [" + amrmsIdx + "]" : "")
      + (sidebandSuppression != null ? " sidebandSuppression [" + sidebandSuppression + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxModulation} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
