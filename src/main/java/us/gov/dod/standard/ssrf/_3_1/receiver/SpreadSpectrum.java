package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * Type - Spread Spectrum Type (Optional)    * <p>
   * The type of spread spectrum system being used.
   * <p>
   * Format is L:CSS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * FreqMin - Nominal or Minimum Frequency (Required)    * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin")
  private FreqM freqMin;
  /**
   * FreqMax - Maximum Frequency (Optional)    * <p>
   * The maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * MaxGain - Spread Spectrum Processing Gain (Optional)    * <p>
   * The processing gain.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxGain", required = false)
  private dB maxGain;
  /**
   * In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency
   * shift during the pulse width.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseFreqDev", required = false)
  private FreqM pulseFreqDev;
  /**
   * InfoDataRate - Information Data Rate (Optional)    * <p>
   * The information data rate.
   * <p>
   * Format is UN(10,3) (bits/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InfoDataRate", required = false)
  private InfoDataRate infoDataRate;
  /**
   * ChipRate - Direct Sequence Chip Rate (Optional)    * <p>
   * The maximum generator rate used to encode/decode a Direct Sequence spread
   * spectrum signal.
   * <p>
   * Format is UN(16,9) (Mchips/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChipRate", required = false)
  private MChips chipRate;
  /**
   * CodeRate - Code Rate (Optional)    * <p>
   * The post encryption number of symbols per bit for a digital data stream.
   * This does not refer to modulation symbols in a format such as quadrature
   * amplitude modulation (QAM).
   * <p>
   * Format is UN(10,3) (symbols/bit)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodeRate", required = false)
  private CodeRate codeRate;
  /**
   * PulseChirpRate - Chirp Rate (Optional)    * <p>
   * For linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * Format is UN(9,6) (Hz/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseChirpRate", required = false)
  private RFChgRate pulseChirpRate;
  /**
   * PulseChirpFreqShift - Chirp Frequency Shift (Optional)    * <p>
   * The difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseChirpFreqShift", required = false)
  private FreqM pulseChirpFreqShift;
  /**
   * PulseChirpDurationMin - Minimum Chirp Duration (Optional)    * <p>
   * The duration (pulsewidth) of the chirp signal.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseChirpDurationMin", required = false)
  private microsecs pulseChirpDurationMin;
  /**
   * PulseChirpDurationMax - Maximum Chirp Duration (Optional)    * <p>
   * The maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PulseChirpDurationMax", required = false)
  private microsecs pulseChirpDurationMax;
  /**
   * TimeHopNumSlots - Number of Time Hop Slots (Optional)    * <p>
   * The number of time slots.
   * <p>
   * Format is UN(5)
   * <p>
   * Attribute group TimeHop (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TimeHopNumSlots", required = false)
  private UN5 timeHopNumSlots;
  /**
   * TimeHopPulsesPerDwell - Number of Pulses Per Dwell (Optional)    * <p>
   * The number of pulses transmitted during each dwell.
   * <p>
   * Format is UN(12)
   * <p>
   * Attribute group TimeHop (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TimeHopPulsesPerDwell", required = false)
  private UN12 timeHopPulsesPerDwell;
  /**
   * HopRate - Hopping Rate (Optional)    * <p>
   * The rate at which the frequency hopping system hops from one frequency to
   * another frequency.
   * <p>
   * Format is UN(9,3) (hops/sec)
   * <p>
   * Attribute group Hopset (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HopRate", required = false)
  private hops hopRate;
  /**
   * HopDwell - Hop Dwell Time (Optional)    * <p>
   * The length of time the frequency hopping system dwells on a frequency.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Hopset (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HopDwell", required = false)
  private microsecs hopDwell;
  /**
   * NumFreqsPerHopset - Number of Frequencies in the Hopset (Optional)    * <p>
   * The number of frequencies contained in a hop set.
   * <p>
   * Format is UN(4)
   * <p>
   * Attribute group Hopset (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumFreqsPerHopset", required = false)
  private UN4 numFreqsPerHopset;
  /**
   * NumHopsets - Number of Hopsets (Optional)    * <p>
   * The number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * Format is UN(4)
   * <p>
   * Attribute group Hopset (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumHopsets", required = false)
  private UN4 numHopsets;
  /**
   * FreqBlocking - Hopset Frequency Blocking Indicator (Optional)    * <p>
   * If the frequency hopping system is capable of blocking certain frequencies.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group Hopset (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqBlocking", required = false)
  private TString freqBlocking;

  /**
   * Get the type of spread spectrum system being used..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of spread spectrum system being used..
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the processing gain..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getMaxGain() {
    return maxGain;
  }

  /**
   * Set the processing gain..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setMaxGain(dB value) {
    this.maxGain = value;
  }

  /**
   * Determine if the MaxGain is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxGain() {
    return (this.maxGain != null ? this.maxGain.isSetValue() : false);
  }

  /**
   * Get In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPulseFreqDev() {
    return pulseFreqDev;
  }

  /**
   * Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPulseFreqDev(FreqM value) {
    this.pulseFreqDev = value;
  }

  /**
   * Determine if the PulseFreqDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseFreqDev() {
    return (this.pulseFreqDev != null ? this.pulseFreqDev.isSetValue() : false);
  }

  /**
   * Get the information data rate..
   * <p>
   * @return a {@link InfoDataRate} instance
   * @since 3.1.0
   */
  public InfoDataRate getInfoDataRate() {
    return infoDataRate;
  }

  /**
   * Set the information data rate..
   * <p>
   * @param value a {@link InfoDataRate} instance
   * @since 3.1.0
   */
  public void setInfoDataRate(InfoDataRate value) {
    this.infoDataRate = value;
  }

  /**
   * Determine if the InfoDataRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInfoDataRate() {
    return (this.infoDataRate != null ? this.infoDataRate.isSetValue() : false);
  }

  /**
   * Get the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal..
   * <p>
   * @return a {@link MChips} instance
   * @since 3.1.0
   */
  public MChips getChipRate() {
    return chipRate;
  }

  /**
   * Set the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal..
   * <p>
   * @param value a {@link MChips} instance
   * @since 3.1.0
   */
  public void setChipRate(MChips value) {
    this.chipRate = value;
  }

  /**
   * Determine if the ChipRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChipRate() {
    return (this.chipRate != null ? this.chipRate.isSetValue() : false);
  }

  /**
   * Get the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM)..
   * <p>
   * @return a {@link CodeRate} instance
   * @since 3.1.0
   */
  public CodeRate getCodeRate() {
    return codeRate;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM)..
   * <p>
   * @param value a {@link CodeRate} instance
   * @since 3.1.0
   */
  public void setCodeRate(CodeRate value) {
    this.codeRate = value;
  }

  /**
   * Determine if the CodeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeRate() {
    return (this.codeRate != null ? this.codeRate.isSetValue() : false);
  }

  /**
   * Get for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse..
   * <p>
   * @return a {@link RFChgRate} instance
   * @since 3.1.0
   */
  public RFChgRate getPulseChirpRate() {
    return pulseChirpRate;
  }

  /**
   * Set for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse..
   * <p>
   * @param value a {@link RFChgRate} instance
   * @since 3.1.0
   */
  public void setPulseChirpRate(RFChgRate value) {
    this.pulseChirpRate = value;
  }

  /**
   * Determine if the PulseChirpRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpRate() {
    return (this.pulseChirpRate != null ? this.pulseChirpRate.isSetValue() : false);
  }

  /**
   * Get the difference between the starting and stopping frequency of a chirped
   * pulse signal..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPulseChirpFreqShift() {
    return pulseChirpFreqShift;
  }

  /**
   * Set the difference between the starting and stopping frequency of a chirped
   * pulse signal..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPulseChirpFreqShift(FreqM value) {
    this.pulseChirpFreqShift = value;
  }

  /**
   * Determine if the PulseChirpFreqShift is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpFreqShift() {
    return (this.pulseChirpFreqShift != null ? this.pulseChirpFreqShift.isSetValue() : false);
  }

  /**
   * Get the duration (pulsewidth) of the chirp signal..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPulseChirpDurationMin() {
    return pulseChirpDurationMin;
  }

  /**
   * Set the duration (pulsewidth) of the chirp signal..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPulseChirpDurationMin(microsecs value) {
    this.pulseChirpDurationMin = value;
  }

  /**
   * Determine if the PulseChirpDurationMin is configured.
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
   * PulseChirpDurationMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPulseChirpDurationMax() {
    return pulseChirpDurationMax;
  }

  /**
   * Set the maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPulseChirpDurationMax(microsecs value) {
    this.pulseChirpDurationMax = value;
  }

  /**
   * Determine if the PulseChirpDurationMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulseChirpDurationMax() {
    return (this.pulseChirpDurationMax != null ? this.pulseChirpDurationMax.isSetValue() : false);
  }

  /**
   * Get the number of time slots..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getTimeHopNumSlots() {
    return timeHopNumSlots;
  }

  /**
   * Set the number of time slots..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setTimeHopNumSlots(UN5 value) {
    this.timeHopNumSlots = value;
  }

  /**
   * Determine if the TimeHopNumSlots is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTimeHopNumSlots() {
    return (this.timeHopNumSlots != null ? this.timeHopNumSlots.isSetValue() : false);
  }

  /**
   * Get the number of pulses transmitted during each dwell..
   * <p>
   * @return a {@link UN12} instance
   * @since 3.1.0
   */
  public UN12 getTimeHopPulsesPerDwell() {
    return timeHopPulsesPerDwell;
  }

  /**
   * Set the number of pulses transmitted during each dwell..
   * <p>
   * @param value a {@link UN12} instance
   * @since 3.1.0
   */
  public void setTimeHopPulsesPerDwell(UN12 value) {
    this.timeHopPulsesPerDwell = value;
  }

  /**
   * Determine if the TimeHopPulsesPerDwell is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTimeHopPulsesPerDwell() {
    return (this.timeHopPulsesPerDwell != null ? this.timeHopPulsesPerDwell.isSetValue() : false);
  }

  /**
   * Get the rate at which the frequency hopping system hops from one frequency
   * to another frequency..
   * <p>
   * @return a {@link hops} instance
   * @since 3.1.0
   */
  public hops getHopRate() {
    return hopRate;
  }

  /**
   * Set the rate at which the frequency hopping system hops from one frequency
   * to another frequency..
   * <p>
   * @param value a {@link hops} instance
   * @since 3.1.0
   */
  public void setHopRate(hops value) {
    this.hopRate = value;
  }

  /**
   * Determine if the HopRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHopRate() {
    return (this.hopRate != null ? this.hopRate.isSetValue() : false);
  }

  /**
   * Get the length of time the frequency hopping system dwells on a frequency..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getHopDwell() {
    return hopDwell;
  }

  /**
   * Set the length of time the frequency hopping system dwells on a frequency..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setHopDwell(microsecs value) {
    this.hopDwell = value;
  }

  /**
   * Determine if the HopDwell is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHopDwell() {
    return (this.hopDwell != null ? this.hopDwell.isSetValue() : false);
  }

  /**
   * Get the number of frequencies contained in a hop set..
   * <p>
   * @return a {@link UN4} instance
   * @since 3.1.0
   */
  public UN4 getNumFreqsPerHopset() {
    return numFreqsPerHopset;
  }

  /**
   * Set the number of frequencies contained in a hop set..
   * <p>
   * @param value a {@link UN4} instance
   * @since 3.1.0
   */
  public void setNumFreqsPerHopset(UN4 value) {
    this.numFreqsPerHopset = value;
  }

  /**
   * Determine if the NumFreqsPerHopset is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreqsPerHopset() {
    return (this.numFreqsPerHopset != null ? this.numFreqsPerHopset.isSetValue() : false);
  }

  /**
   * Get the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping..
   * <p>
   * @return a {@link UN4} instance
   * @since 3.1.0
   */
  public UN4 getNumHopsets() {
    return numHopsets;
  }

  /**
   * Set the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping..
   * <p>
   * @param value a {@link UN4} instance
   * @since 3.1.0
   */
  public void setNumHopsets(UN4 value) {
    this.numHopsets = value;
  }

  /**
   * Determine if the NumHopsets is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumHopsets() {
    return (this.numHopsets != null ? this.numHopsets.isSetValue() : false);
  }

  /**
   * Get if the frequency hopping system is capable of blocking certain
   * frequencies..
   * <p>
   * @return the FreqBlocking value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqBlocking() {
    return freqBlocking;
  }

  /**
   * Set if the frequency hopping system is capable of blocking certain
   * frequencies..
   * <p>
   * @param value the FreqBlocking value in a {@link TString} data type
   * @since 3.1.0
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
   * @param value An instances of type {@link ListCSS}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withType(ListCSS value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the processing gain.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withMaxGain(Double value) {
    setMaxGain(new dB(value));
    return this;
  }

  /**
   * Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseFreqDev(Double value) {
    setPulseFreqDev(new FreqM(value));
    return this;
  }

  /**
   * Set the information data rate.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withInfoDataRate(Double value) {
    setInfoDataRate(new InfoDataRate(value));
    return this;
  }

  /**
   * Set the maximum generator rate used to encode/decode a Direct Sequence
   * spread spectrum signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withChipRate(Double value) {
    setChipRate(new MChips(value));
    return this;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withCodeRate(Double value) {
    setCodeRate(new CodeRate(value));
    return this;
  }

  /**
   * Set for linear frequency modulation, the constant rate at which the radio
   * frequency of a pulse is increased throughout the width of the pulse.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseChirpRate(Double value) {
    setPulseChirpRate(new RFChgRate(value));
    return this;
  }

  /**
   * Set the difference between the starting and stopping frequency of a chirped
   * pulse signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseChirpFreqShift(Double value) {
    setPulseChirpFreqShift(new FreqM(value));
    return this;
  }

  /**
   * Set the duration (pulsewidth) of the chirp signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseChirpDurationMin(Double value) {
    setPulseChirpDurationMin(new microsecs(value));
    return this;
  }

  /**
   * Set the maximum duration (pulsewidth) of the chirp signal.
   * <p>
   * [XSL ERR MINMAX] If PulseChirpDurationMax is used, it MUST be greater than
   * PulseChirpDurationMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseChirpDurationMax(Double value) {
    setPulseChirpDurationMax(new microsecs(value));
    return this;
  }

  /**
   * Set the number of time slots.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withTimeHopNumSlots(Integer value) {
    setTimeHopNumSlots(new UN5(value));
    return this;
  }

  /**
   * Set the number of pulses transmitted during each dwell.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withTimeHopPulsesPerDwell(Integer value) {
    setTimeHopPulsesPerDwell(new UN12(value));
    return this;
  }

  /**
   * Set the rate at which the frequency hopping system hops from one frequency
   * to another frequency.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withHopRate(Double value) {
    setHopRate(new hops(value));
    return this;
  }

  /**
   * Set the length of time the frequency hopping system dwells on a frequency.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withHopDwell(Double value) {
    setHopDwell(new microsecs(value));
    return this;
  }

  /**
   * Set the number of frequencies contained in a hop set.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withNumFreqsPerHopset(Integer value) {
    setNumFreqsPerHopset(new UN4(value));
    return this;
  }

  /**
   * Set the number of frequency hopsets employed when a system uses frequency
   * hopping spread spectrum modulation techniques, including hybrid direct
   * sequence and frequency hopping.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
   */
  public SpreadSpectrum withNumHopsets(Integer value) {
    setNumHopsets(new UN4(value));
    return this;
  }

  /**
   * Set if the frequency hopping system is capable of blocking certain
   * frequencies.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current SpreadSpectrum object instance.
   * @since 3.1.0
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
           + (chipRate != null ? " chipRate [" + chipRate + "]" : "")
           + (codeRate != null ? " codeRate [" + codeRate + "]" : "")
           + (freqBlocking != null ? " freqBlocking [" + freqBlocking + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (hopDwell != null ? " hopDwell [" + hopDwell + "]" : "")
           + (hopRate != null ? " hopRate [" + hopRate + "]" : "")
           + (infoDataRate != null ? " infoDataRate [" + infoDataRate + "]" : "")
           + (maxGain != null ? " maxGain [" + maxGain + "]" : "")
           + (numFreqsPerHopset != null ? " numFreqsPerHopset [" + numFreqsPerHopset + "]" : "")
           + (numHopsets != null ? " numHopsets [" + numHopsets + "]" : "")
           + (pulseChirpDurationMax != null ? " pulseChirpDurationMax [" + pulseChirpDurationMax + "]" : "")
           + (pulseChirpDurationMin != null ? " pulseChirpDurationMin [" + pulseChirpDurationMin + "]" : "")
           + (pulseChirpFreqShift != null ? " pulseChirpFreqShift [" + pulseChirpFreqShift + "]" : "")
           + (pulseChirpRate != null ? " pulseChirpRate [" + pulseChirpRate + "]" : "")
           + (pulseFreqDev != null ? " pulseFreqDev [" + pulseFreqDev + "]" : "")
           + (timeHopNumSlots != null ? " timeHopNumSlots [" + timeHopNumSlots + "]" : "")
           + (timeHopPulsesPerDwell != null ? " timeHopPulsesPerDwell [" + timeHopPulsesPerDwell + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SpreadSpectrum} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
