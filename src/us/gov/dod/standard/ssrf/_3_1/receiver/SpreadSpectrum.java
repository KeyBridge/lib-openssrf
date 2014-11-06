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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSS;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * SpreadSpectrum contains characteristics of systems using spread spectrum
 * techniques.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;SpreadSpectrum&gt;
 *   &lt;ChipRate  cls="U"&gt;4000&lt;/ChipRate &gt;
 *   &lt;CodeRate  cls="U"&gt;1987&lt;/CodeRate &gt;
 *   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
 *   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
 *   &lt;HopDwell  cls="U"&gt;82.46&lt;/HopDwell &gt;
 *   &lt;HopRate  cls="U"&gt;64&lt;/HopRate &gt;
 *   &lt;InfoDataRate  cls="U"&gt;6400&lt;/InfoDataRate &gt;
 *   &lt;MaxGain cls="U"&gt;87.89&lt;/MaxGain&gt;
 *   &lt;NumFreqsPerHopset  cls="U"&gt;7843&lt;/NumFreqsPerHopset &gt;
 *   &lt;NumHopsets  cls="U"&gt;12&lt;/NumHopsets &gt;
 *   &lt;PulseChirpDurationMin cls="U"&gt;300&lt;/PulseChirpDurationMin&gt;
 *   &lt;PulseChirpDurationMax cls="U"&gt;400&lt;/PulseChirpDurationMax&gt;
 *   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
 *   &lt;PulseChirpRate cls="U"&gt;800&lt;/PulseChirpRate&gt;
 *   &lt;PulseFreqDev cls="U"&gt;25.1&lt;/PulseFreqDev&gt;
 *   &lt;TimeHopNumSlots  cls="U"&gt;346&lt;/TimeHopNumSlots &gt;
 *   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
 *   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
 *   &lt;ChipRate  cls="U"&gt;8954&lt;/ChipRate &gt;
 *   &lt;CodeRate  cls="U"&gt;236&lt;/CodeRate &gt;
 *   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
 *   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
 *   &lt;HopDwell  cls="U"&gt;79.235&lt;/HopDwell &gt;
 *   &lt;HopRate  cls="U"&gt;5000&lt;/HopRate &gt;
 *   &lt;InfoDataRate  cls="U"&gt;800&lt;/InfoDataRate &gt;
 *   &lt;MaxGain  cls="U"&gt;34&lt;/MaxGain &gt;
 *   &lt;NumFreqsPerHopset  cls="U"&gt;35&lt;/NumFreqsPerHopset &gt;
 *   &lt;NumHopsets  cls="U"&gt;23&lt;/NumHopsets &gt;
 *   &lt;PulseChirpDurationMin cls="U"&gt;100&lt;/PulseChirpDurationMin&gt;
 *   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
 *   &lt;PulseChirpRate cls="U"&gt;500&lt;/PulseChirpRate&gt;
 *   &lt;PulseFreqDev cls="U"&gt;347&lt;/PulseFreqDev&gt;
 *   &lt;TimeHopNumSlots  cls="U"&gt;890&lt;/TimeHopNumSlots &gt;
 *   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
 *   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
 * &lt;/SpreadSpectrum&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadSpectrum", propOrder = {
  "type",
  "freqMin",
  "freqMax",
  "maxGain",
  "pulseFreqDev",
  "infoDataRate",
  "chipRate",
  "codeRate",
  "pulseChirpRate",
  "pulseChirpFreqShift",
  "pulseChirpDurationMin",
  "pulseChirpDurationMax",
  "timeHopNumSlots",
  "timeHopPulsesPerDwell",
  "hopRate",
  "hopDwell",
  "numFreqsPerHopset",
  "numHopsets",
  "freqBlocking"
})
public class SpreadSpectrum {

  /**
   * Type - Spread Spectrum Type (Optional)
   * <p>
   * The type of spread spectrum system being used.
   * <p>
   * Format is L:CSS
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   */
  @XmlElement(name = "FreqMin")
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
   * Attribute group FreqRangeGrp (Optional)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * MaxGain - Spread Spectrum Processing Gain (Optional)
   * <p>
   * The processing gain.
   * <p>
   * Format is SN(6,3) (dB)
   */
  @XmlElement(name = "MaxGain", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal maxGain;
  /**
   * PulseFreqDev, Enter, for FM pulse radars, the total frequency shift during
   * the pulse width.
   */
  @XmlElement(name = "PulseFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pulseFreqDev;
  /**
   * InfoDataRate - Information Data Rate (Optional)
   * <p>
   * The information data rate.
   * <p>
   * Format is UN(10,3) (bits/sec)
   */
  @XmlElement(name = "InfoDataRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterINFODATARATE.class)
  private TDecimal infoDataRate;
  /**
   * ChipRate - Direct Sequence Chip Rate (Optional)
   * <p>
   * The maximum generator rate used to encode/decode a Direct Sequence spread
   * spectrum signal.
   * <p>
   * Format is UN(16,9) (Mchips/sec)
   */
  @XmlElement(name = "ChipRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMCHIPS.class)
  private TDecimal chipRate;
  /**
   * CodeRate - Code Rate (Optional)
   * <p>
   * The post encryption number of symbols per bit for a digital data stream.
   * This does not refer to modulation symbols in a format such as quadrature
   * amplitude modulation (QAM).
   * <p>
   * Format is UN(10,3) (symbols/bit)
   */
  @XmlElement(name = "CodeRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterCODERATE.class)
  private TDecimal codeRate;
  /**
   * PulseChirpRate - Chirp Rate (Optional)
   * <p>
   * For linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * Format is UN(9,6) (Hz/sec)
   */
  @XmlElement(name = "PulseChirpRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterRFCHGRATE.class)
  private TDecimal pulseChirpRate;
  /**
   * PulseChirpFreqShift - Chirp Frequency Shift (Optional)
   * <p>
   * The difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "PulseChirpFreqShift", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pulseChirpFreqShift;
  /**
   * PulseChirpDurationMin - Minimum Chirp Duration (Optional)
   * <p>
   * The duration (pulsewidth) of the chirp signal.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PulseChirpDurationMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pulseChirpDurationMin;
  /**
   * PulseChirpDurationMax - Maximum Chirp Duration (Optional)
   * <p>
   * The maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PulseChirpDurationMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pulseChirpDurationMax;
  /**
   * TimeHopNumSlots - Number of Time Hop Slots (Optional)
   * <p>
   * The number of time slots.
   * <p>
   * Format is UN(5)
   * <p>
   * Attribute group TimeHop (Optional)
   */
  @XmlElement(name = "TimeHopNumSlots", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger timeHopNumSlots;
  /**
   * TimeHopPulsesPerDwell - Number of Pulses Per Dwell (Optional)
   * <p>
   * The number of pulses transmitted during each dwell.
   * <p>
   * Format is UN(12)
   * <p>
   * Attribute group TimeHop (Optional)
   */
  @XmlElement(name = "TimeHopPulsesPerDwell", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN12.class)
  private TInteger timeHopPulsesPerDwell;
  /**
   * HopRate - Hopping Rate (Optional)
   * <p>
   * The rate at which the frequency hopping system hops from one frequency to
   * another frequency.
   * <p>
   * Format is UN(9,3) (hops/sec)
   * <p>
   * Attribute group Hopset (Optional)
   */
  @XmlElement(name = "HopRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterHOPS.class)
  private TDecimal hopRate;
  /**
   * HopDwell - Hop Dwell Time (Optional)
   * <p>
   * The length of time the frequency hopping system dwells on a frequency.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Hopset (Optional)
   */
  @XmlElement(name = "HopDwell", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal hopDwell;
  /**
   * NumFreqsPerHopset - Number of Frequencies in the Hopset (Optional)
   * <p>
   * The number of frequencies contained in a hop set.
   * <p>
   * Format is UN(4)
   * <p>
   * Attribute group Hopset (Optional)
   */
  @XmlElement(name = "NumFreqsPerHopset", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numFreqsPerHopset;
  /**
   * NumHopsets - Number of Hopsets (Optional)
   * <p>
   * The number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * Format is UN(4)
   * <p>
   * Attribute group Hopset (Optional)
   */
  @XmlElement(name = "NumHopsets", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numHopsets;
  /**
   * FreqBlocking - Hopset Frequency Blocking Indicator (Optional)
   * <p>
   * If the frequency hopping system is capable of blocking certain frequencies.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group Hopset (Optional)
   */
  @XmlElement(name = "FreqBlocking", required = false)
  private TString freqBlocking;

  /**
   * Get the type of spread spectrum system being used.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of spread spectrum system being used.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

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
   * Get the processing gain.
   * <p>
   * @return the MaxGain value in a {@link TDecimal} data type
   */
  public TDecimal getMaxGain() {
    return maxGain;
  }

  /**
   * Set the processing gain.
   * <p>
   * @param value the MaxGain value in a {@link TDecimal} data type
   */
  public void setMaxGain(TDecimal value) {
    this.maxGain = value;
  }

  /**
   * Determine if the MaxGain is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxGain() {
    return (this.maxGain != null ? this.maxGain.isSetValue() : false);
  }

  /**
   * Get PulseFreqDev, Enter, for FM pulse radars, the total frequency shift
   * during the pulse width.
   * <p>
   * @return the PulseFreqDev value in a {@link TDecimal} data type
   */
  public TDecimal getPulseFreqDev() {
    return pulseFreqDev;
  }

  /**
   * Set PulseFreqDev, Enter, for FM pulse radars, the total frequency shift
   * during the pulse width.
   * <p>
   * @param value the PulseFreqDev value in a {@link TDecimal} data type
   */
  public void setPulseFreqDev(TDecimal value) {
    this.pulseFreqDev = value;
  }

  /**
   * Determine if the PulseFreqDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseFreqDev() {
    return (this.pulseFreqDev != null ? this.pulseFreqDev.isSetValue() : false);
  }

  /**
   * Get the information data rate.
   * <p>
   * @return the InfoDataRate value in a {@link TDecimal} data type
   */
  public TDecimal getInfoDataRate() {
    return infoDataRate;
  }

  /**
   * Set the information data rate.
   * <p>
   * @param value the InfoDataRate value in a {@link TDecimal} data type
   */
  public void setInfoDataRate(TDecimal value) {
    this.infoDataRate = value;
  }

  /**
   * Determine if the InfoDataRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInfoDataRate() {
    return (this.infoDataRate != null ? this.infoDataRate.isSetValue() : false);
  }

  /**
   * Get the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal.
   * <p>
   * @return the ChipRate value in a {@link TDecimal} data type
   */
  public TDecimal getChipRate() {
    return chipRate;
  }

  /**
   * Set the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal.
   * <p>
   * @param value the ChipRate value in a {@link TDecimal} data type
   */
  public void setChipRate(TDecimal value) {
    this.chipRate = value;
  }

  /**
   * Determine if the ChipRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChipRate() {
    return (this.chipRate != null ? this.chipRate.isSetValue() : false);
  }

  /**
   * Get the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @return the CodeRate value in a {@link TDecimal} data type
   */
  public TDecimal getCodeRate() {
    return codeRate;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @param value the CodeRate value in a {@link TDecimal} data type
   */
  public void setCodeRate(TDecimal value) {
    this.codeRate = value;
  }

  /**
   * Determine if the CodeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeRate() {
    return (this.codeRate != null ? this.codeRate.isSetValue() : false);
  }

  /**
   * Get for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * @return the PulseChirpRate value in a {@link TDecimal} data type
   */
  public TDecimal getPulseChirpRate() {
    return pulseChirpRate;
  }

  /**
   * Set for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * @param value the PulseChirpRate value in a {@link TDecimal} data type
   */
  public void setPulseChirpRate(TDecimal value) {
    this.pulseChirpRate = value;
  }

  /**
   * Determine if the PulseChirpRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpRate() {
    return (this.pulseChirpRate != null ? this.pulseChirpRate.isSetValue() : false);
  }

  /**
   * Get the difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * @return the PulseChirpFreqShift value in a {@link TDecimal} data type
   */
  public TDecimal getPulseChirpFreqShift() {
    return pulseChirpFreqShift;
  }

  /**
   * Set the difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * @param value the PulseChirpFreqShift value in a {@link TDecimal} data type
   */
  public void setPulseChirpFreqShift(TDecimal value) {
    this.pulseChirpFreqShift = value;
  }

  /**
   * Determine if the PulseChirpFreqShift is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpFreqShift() {
    return (this.pulseChirpFreqShift != null ? this.pulseChirpFreqShift.isSetValue() : false);
  }

  /**
   * Get the duration (pulsewidth) of the chirp signal.
   * <p>
   * @return the PulseChirpDurationMin value in a {@link TDecimal} data type
   */
  public TDecimal getPulseChirpDurationMin() {
    return pulseChirpDurationMin;
  }

  /**
   * Set the duration (pulsewidth) of the chirp signal.
   * <p>
   * @param value the PulseChirpDurationMin value in a {@link TDecimal} data
   *              type
   */
  public void setPulseChirpDurationMin(TDecimal value) {
    this.pulseChirpDurationMin = value;
  }

  /**
   * Determine if the PulseChirpDurationMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpDurationMin() {
    return (this.pulseChirpDurationMin != null ? this.pulseChirpDurationMin.isSetValue() : false);
  }

  /**
   * Get the maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * @return the PulseChirpDurationMax value in a {@link TDecimal} data type
   */
  public TDecimal getPulseChirpDurationMax() {
    return pulseChirpDurationMax;
  }

  /**
   * Set the maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * @param value the PulseChirpDurationMax value in a {@link TDecimal} data
   *              type
   */
  public void setPulseChirpDurationMax(TDecimal value) {
    this.pulseChirpDurationMax = value;
  }

  /**
   * Determine if the PulseChirpDurationMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpDurationMax() {
    return (this.pulseChirpDurationMax != null ? this.pulseChirpDurationMax.isSetValue() : false);
  }

  /**
   * Get the number of time slots.
   * <p>
   * @return the TimeHopNumSlots value in a {@link TInteger} data type
   */
  public TInteger getTimeHopNumSlots() {
    return timeHopNumSlots;
  }

  /**
   * Set the number of time slots.
   * <p>
   * @param value the TimeHopNumSlots value in a {@link TInteger} data type
   */
  public void setTimeHopNumSlots(TInteger value) {
    this.timeHopNumSlots = value;
  }

  /**
   * Determine if the TimeHopNumSlots is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTimeHopNumSlots() {
    return (this.timeHopNumSlots != null ? this.timeHopNumSlots.isSetValue() : false);
  }

  /**
   * Get the number of pulses transmitted during each dwell.
   * <p>
   * @return the TimeHopPulsesPerDwell value in a {@link TInteger} data type
   */
  public TInteger getTimeHopPulsesPerDwell() {
    return timeHopPulsesPerDwell;
  }

  /**
   * Set the number of pulses transmitted during each dwell.
   * <p>
   * @param value the TimeHopPulsesPerDwell value in a {@link TInteger} data
   *              type
   */
  public void setTimeHopPulsesPerDwell(TInteger value) {
    this.timeHopPulsesPerDwell = value;
  }

  /**
   * Determine if the TimeHopPulsesPerDwell is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTimeHopPulsesPerDwell() {
    return (this.timeHopPulsesPerDwell != null ? this.timeHopPulsesPerDwell.isSetValue() : false);
  }

  /**
   * Get the rate at which the frequency hopping system hops from one frequency
   * to another frequency.
   * <p>
   * @return the HopRate value in a {@link TDecimal} data type
   */
  public TDecimal getHopRate() {
    return hopRate;
  }

  /**
   * Set the rate at which the frequency hopping system hops from one frequency
   * to another frequency.
   * <p>
   * @param value the HopRate value in a {@link TDecimal} data type
   */
  public void setHopRate(TDecimal value) {
    this.hopRate = value;
  }

  /**
   * Determine if the HopRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHopRate() {
    return (this.hopRate != null ? this.hopRate.isSetValue() : false);
  }

  /**
   * Get the length of time the frequency hopping system dwells on a frequency.
   * <p>
   * @return the HopDwell value in a {@link TDecimal} data type
   */
  public TDecimal getHopDwell() {
    return hopDwell;
  }

  /**
   * Set the length of time the frequency hopping system dwells on a frequency.
   * <p>
   * @param value the HopDwell value in a {@link TDecimal} data type
   */
  public void setHopDwell(TDecimal value) {
    this.hopDwell = value;
  }

  /**
   * Determine if the HopDwell is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHopDwell() {
    return (this.hopDwell != null ? this.hopDwell.isSetValue() : false);
  }

  /**
   * Get the number of frequencies contained in a hop set.
   * <p>
   * @return the NumFreqsPerHopset value in a {@link TInteger} data type
   */
  public TInteger getNumFreqsPerHopset() {
    return numFreqsPerHopset;
  }

  /**
   * Set the number of frequencies contained in a hop set.
   * <p>
   * @param value the NumFreqsPerHopset value in a {@link TInteger} data type
   */
  public void setNumFreqsPerHopset(TInteger value) {
    this.numFreqsPerHopset = value;
  }

  /**
   * Determine if the NumFreqsPerHopset is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreqsPerHopset() {
    return (this.numFreqsPerHopset != null ? this.numFreqsPerHopset.isSetValue() : false);
  }

  /**
   * Get the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * @return the NumHopsets value in a {@link TInteger} data type
   */
  public TInteger getNumHopsets() {
    return numHopsets;
  }

  /**
   * Set the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * @param value the NumHopsets value in a {@link TInteger} data type
   */
  public void setNumHopsets(TInteger value) {
    this.numHopsets = value;
  }

  /**
   * Determine if the NumHopsets is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumHopsets() {
    return (this.numHopsets != null ? this.numHopsets.isSetValue() : false);
  }

  /**
   * Get if the frequency hopping system is capable of blocking certain
   * frequencies.
   * <p>
   * @return the FreqBlocking value in a {@link TString} data type
   */
  public TString getFreqBlocking() {
    return freqBlocking;
  }

  /**
   * Set if the frequency hopping system is capable of blocking certain
   * frequencies.
   * <p>
   * @param value the FreqBlocking value in a {@link TString} data type
   */
  public void setFreqBlocking(TString value) {
    this.freqBlocking = value;
  }

  /**
   * Determine if the FreqBlocking is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqBlocking() {
    return (this.freqBlocking != null ? this.freqBlocking.isSetValue() : false);
  }

  /**
   * Set the type of spread spectrum system being used.
   * <p>
   * @param value An instances of type {@link ListCSS}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withType(ListCSS value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the processing gain.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withMaxGain(Double value) {
    setMaxGain(new TDecimal(value));
    return this;
  }

  /**
   * Set PulseFreqDev, Enter, for FM pulse radars, the total frequency shift
   * during the pulse width.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withPulseFreqDev(Double value) {
    setPulseFreqDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the information data rate.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withInfoDataRate(Double value) {
    setInfoDataRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withChipRate(Double value) {
    setChipRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withCodeRate(Double value) {
    setCodeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withPulseChirpRate(Double value) {
    setPulseChirpRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withPulseChirpFreqShift(Double value) {
    setPulseChirpFreqShift(new TDecimal(value));
    return this;
  }

  /**
   * Set the duration (pulsewidth) of the chirp signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withPulseChirpDurationMin(Double value) {
    setPulseChirpDurationMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withPulseChirpDurationMax(Double value) {
    setPulseChirpDurationMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of time slots.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withTimeHopNumSlots(Integer value) {
    setTimeHopNumSlots(new TInteger(value));
    return this;
  }

  /**
   * Set the number of pulses transmitted during each dwell.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withTimeHopPulsesPerDwell(Integer value) {
    setTimeHopPulsesPerDwell(new TInteger(value));
    return this;
  }

  /**
   * Set the rate at which the frequency hopping system hops from one frequency
   * to another frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withHopRate(Double value) {
    setHopRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the length of time the frequency hopping system dwells on a frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withHopDwell(Double value) {
    setHopDwell(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of frequencies contained in a hop set.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withNumFreqsPerHopset(Integer value) {
    setNumFreqsPerHopset(new TInteger(value));
    return this;
  }

  /**
   * Set the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withNumHopsets(Integer value) {
    setNumHopsets(new TInteger(value));
    return this;
  }

  /**
   * Set if the frequency hopping system is capable of blocking certain
   * frequencies.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current SpreadSpectrum object instance
   */
  public SpreadSpectrum withFreqBlocking(ListCBO value) {
    setFreqBlocking(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this SpreadSpectrum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SpreadSpectrum {"
      + (pulseChirpDurationMin != null ? " pulseChirpDurationMin [" + pulseChirpDurationMin + "]" : "")
      + (timeHopNumSlots != null ? " timeHopNumSlots [" + timeHopNumSlots + "]" : "")
      + (chipRate != null ? " chipRate [" + chipRate + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqBlocking != null ? " freqBlocking [" + freqBlocking + "]" : "")
      + (maxGain != null ? " maxGain [" + maxGain + "]" : "")
      + (pulseChirpDurationMax != null ? " pulseChirpDurationMax [" + pulseChirpDurationMax + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (pulseChirpFreqShift != null ? " pulseChirpFreqShift [" + pulseChirpFreqShift + "]" : "")
      + (numHopsets != null ? " numHopsets [" + numHopsets + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (infoDataRate != null ? " infoDataRate [" + infoDataRate + "]" : "")
      + (hopRate != null ? " hopRate [" + hopRate + "]" : "")
      + (hopDwell != null ? " hopDwell [" + hopDwell + "]" : "")
      + (timeHopPulsesPerDwell != null ? " timeHopPulsesPerDwell [" + timeHopPulsesPerDwell + "]" : "")
      + (codeRate != null ? " codeRate [" + codeRate + "]" : "")
      + (numFreqsPerHopset != null ? " numFreqsPerHopset [" + numFreqsPerHopset + "]" : "")
      + (pulseFreqDev != null ? " pulseFreqDev [" + pulseFreqDev + "]" : "")
      + (pulseChirpRate != null ? " pulseChirpRate [" + pulseChirpRate + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SpreadSpectrum} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
