package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Pulse contains the pulse characteristics for equipments using a pulsed
 * emission. It includes the parameters of the pulse time cycle and the pulse
 * shape.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Pulse&gt;
 *   &lt;PRRMin cls="U"&gt;300&lt;/PRRMin&gt;
 *   &lt;PDMin cls="U"&gt;12&lt;/PDMin&gt;
 *   &lt;DutyCycleMax cls="U"&gt;50&lt;/DutyCycleMax&gt;
 *   &lt;AvgPowerMin cls="U"&gt;20&lt;/AvgPowerMin&gt;
 * &lt;/Pulse&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pulse", propOrder = {
  "prrMin",
  "prrMax",
  "pdMin",
  "pdMax",
  "dutyCycleMin",
  "dutyCycleMax",
  "avgPowerMin",
  "avgPowerMax",
  "compRatio",
  "compMethod",
  "riseTime",
  "fallTime",
  "justifyShortRiseTime",
  "radarProcessingGainMax",
  "numSubpulses"
})
public class Pulse {

  /**
   * PRRMin - Minimum or Nominal Pulse Repetition Rate (Optional)    * <p>
   * The numeric value for the pulse repetition rate (PRR) of the equipment. For
   * equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * Format is UN(9,3) (pulses/sec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRRMin", required = false)
  private PulseRate prrMin;
  /**
   * PRRMax - Maximum Pulse Repetition Rate (Optional)    * <p>
   * For equipment having a capability for continuously variable PRR over a wide
   * range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * Format is UN(9,3) (pulses/sec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRRMax", required = false)
  private PulseRate prrMax;
  /**
   * PDMin - Minimum or Nominal Pulse Duration (Optional)    * <p>
   * A numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMin", required = false)
  private microsecs pdMin;
  /**
   * PDMax - Maximum Pulse Duration (Optional)    * <p>
   * For equipment having a capability for continuously variable PD over a wide
   * range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMax", required = false)
  private microsecs pdMax;
  /**
   * DutyCycleMin - Minimum/Nominal Duty Cycle Ratio (Optional)    * <p>
   * As a percentage, the minimum or nominal ratio of the pulse duration to the
   * pulse period.
   * <p>
   * Format is UN(4,2) [0..100] (%)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DutyCycleMin", required = false)
  private Percent dutyCycleMin;
  /**
   * DutyCycleMax - Maximum Duty Cycle Ratio (Optional)    * <p>
   * As a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * Format is UN(4,2) [0..100] (%)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DutyCycleMax", required = false)
  private Percent dutyCycleMax;
  /**
   * AvgPowerMin - Minimum/Nominal Average Power (Optional)    * <p>
   * The minimum or nominal average power.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AvgPowerMin", required = false)
  private dBW avgPowerMin;
  /**
   * AvgPowerMax - Maximum Average Power (Optional)    * <p>
   * the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * Attribute group PulseAvgCycle (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AvgPowerMax", required = false)
  private dBW avgPowerMax;
  /**
   * CompRatio - Pulse Compression Ratio (Optional)    * <p>
   * The ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * Format is UN(8,4)
   * <p>
   * Attribute group PulseComp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CompRatio", required = false)
  private UN8_4 compRatio;
  /**
   * CompMethod - Pulse Compression Method (Optional)    * <p>
   * The method employed to reduce the period of the pulse.
   * <p>
   * Format is S40
   * <p>
   * Attribute group PulseComp (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CompMethod", required = false)
  private S40 compMethod;
  /**
   * JustifyShortRiseTime - Justification for Short Rise Time (Optional)    * <p>
   * An operational justification for short pulse rise time. This is required if
   * the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses
   * FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds,
   * or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less
   * than 0.01 microseconds.
   * <p>
   * Format is Memo
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RiseTime", required = false)
  private microsecs riseTime;
  /**
   * FallTime - Fall Time (Optional)    * <p>
   * The pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FallTime", required = false)
  private microsecs fallTime;
  /**
   * JustifyShortRiseTime - Justification for Short Rise Time (Optional)    * <p>
   * An operational justification for short pulse rise time. This is required if
   * the transmitter is a pulsed Group B, C, or radar, and either: (1) it uses
   * FM modulation and the Rise Time or Fall Time is less than 0.1 microseconds,
   * or (2) it uses Non-FM modulation and the Rise Time or Fall Time is less
   * than 0.01 microseconds.
   * <p>
   * Format is Memo
   * <p>
   * Attribute group PulseForm (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JustifyShortRiseTime", required = false)
  private MEMO justifyShortRiseTime;
  /**
   * RadarProcessingGainMax - Maximum Radar Processing Gain (Optional)    * <p>
   * The maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RadarProcessingGainMax", required = false)
  private dB radarProcessingGainMax;
  /**
   * NumSubpulses - Number of Subpulses (Optional)    * <p>
   * The total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * Format is UN(10)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSubpulses", required = false)
  private UN10 numSubpulses;

  /**
   * Get the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR..
   * <p>
   * @return a {@link PulseRate} instance
   * @since 3.1.0
   */
  public PulseRate getPRRMin() {
    return prrMin;
  }

  /**
   * Set the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR..
   * <p>
   * @param value a {@link PulseRate} instance
   * @since 3.1.0
   */
  public void setPRRMin(PulseRate value) {
    this.prrMin = value;
  }

  /**
   * Determine if the PRRMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRRMin() {
    return (this.prrMin != null ? this.prrMin.isSetValue() : false);
  }

  /**
   * Get for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin..
   * <p>
   * @return a {@link PulseRate} instance
   * @since 3.1.0
   */
  public PulseRate getPRRMax() {
    return prrMax;
  }

  /**
   * Set for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin..
   * <p>
   * @param value a {@link PulseRate} instance
   * @since 3.1.0
   */
  public void setPRRMax(PulseRate value) {
    this.prrMax = value;
  }

  /**
   * Determine if the PRRMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRRMax() {
    return (this.prrMax != null ? this.prrMax.isSetValue() : false);
  }

  /**
   * Get a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMin() {
    return pdMin;
  }

  /**
   * Set a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMin(microsecs value) {
    this.pdMin = value;
  }

  /**
   * Determine if the PDMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMin() {
    return (this.pdMin != null ? this.pdMin.isSetValue() : false);
  }

  /**
   * Get for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMax() {
    return pdMax;
  }

  /**
   * Set for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMax(microsecs value) {
    this.pdMax = value;
  }

  /**
   * Determine if the PDMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMax() {
    return (this.pdMax != null ? this.pdMax.isSetValue() : false);
  }

  /**
   * Get as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period..
   * <p>
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getDutyCycleMin() {
    return dutyCycleMin;
  }

  /**
   * Set as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period..
   * <p>
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setDutyCycleMin(Percent value) {
    this.dutyCycleMin = value;
  }

  /**
   * Determine if the DutyCycleMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDutyCycleMin() {
    return (this.dutyCycleMin != null ? this.dutyCycleMin.isSetValue() : false);
  }

  /**
   * Get as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin..
   * <p>
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getDutyCycleMax() {
    return dutyCycleMax;
  }

  /**
   * Set as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin..
   * <p>
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setDutyCycleMax(Percent value) {
    this.dutyCycleMax = value;
  }

  /**
   * Determine if the DutyCycleMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDutyCycleMax() {
    return (this.dutyCycleMax != null ? this.dutyCycleMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal average power..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getAvgPowerMin() {
    return avgPowerMin;
  }

  /**
   * Set the minimum or nominal average power..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setAvgPowerMin(dBW value) {
    this.avgPowerMin = value;
  }

  /**
   * Determine if the AvgPowerMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvgPowerMin() {
    return (this.avgPowerMin != null ? this.avgPowerMin.isSetValue() : false);
  }

  /**
   * Get the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getAvgPowerMax() {
    return avgPowerMax;
  }

  /**
   * Set the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setAvgPowerMax(dBW value) {
    this.avgPowerMax = value;
  }

  /**
   * Determine if the AvgPowerMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvgPowerMax() {
    return (this.avgPowerMax != null ? this.avgPowerMax.isSetValue() : false);
  }

  /**
   * Get the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points..
   * <p>
   * @return a {@link UN8_4} instance
   * @since 3.1.0
   */
  public UN8_4 getCompRatio() {
    return compRatio;
  }

  /**
   * Set the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points..
   * <p>
   * @param value a {@link UN8_4} instance
   * @since 3.1.0
   */
  public void setCompRatio(UN8_4 value) {
    this.compRatio = value;
  }

  /**
   * Determine if the CompRatio is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCompRatio() {
    return (this.compRatio != null ? this.compRatio.isSetValue() : false);
  }

  /**
   * Get the method employed to reduce the period of the pulse..
   * <p>
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getCompMethod() {
    return compMethod;
  }

  /**
   * Set the method employed to reduce the period of the pulse..
   * <p>
   * @param value a {@link S40} instance
   * @since 3.1.0
   */
  public void setCompMethod(S40 value) {
    this.compMethod = value;
  }

  /**
   * Determine if the CompMethod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCompMethod() {
    return (this.compMethod != null ? this.compMethod.isSetValue() : false);
  }

  /**
   * Get an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getRiseTime() {
    return riseTime;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setRiseTime(microsecs value) {
    this.riseTime = value;
  }

  /**
   * Determine if the RiseTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRiseTime() {
    return (this.riseTime != null ? this.riseTime.isSetValue() : false);
  }

  /**
   * Get the pulse fall time from 90 to 10 percent of the pulse..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getFallTime() {
    return fallTime;
  }

  /**
   * Set the pulse fall time from 90 to 10 percent of the pulse..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setFallTime(microsecs value) {
    this.fallTime = value;
  }

  /**
   * Determine if the FallTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFallTime() {
    return (this.fallTime != null ? this.fallTime.isSetValue() : false);
  }

  /**
   * Get an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getJustifyShortRiseTime() {
    return justifyShortRiseTime;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setJustifyShortRiseTime(MEMO value) {
    this.justifyShortRiseTime = value;
  }

  /**
   * Determine if the JustifyShortRiseTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJustifyShortRiseTime() {
    return (this.justifyShortRiseTime != null ? this.justifyShortRiseTime.isSetValue() : false);
  }

  /**
   * Get the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse"..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getRadarProcessingGainMax() {
    return radarProcessingGainMax;
  }

  /**
   * Set the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse"..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setRadarProcessingGainMax(dB value) {
    this.radarProcessingGainMax = value;
  }

  /**
   * Determine if the RadarProcessingGainMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadarProcessingGainMax() {
    return (this.radarProcessingGainMax != null ? this.radarProcessingGainMax.isSetValue() : false);
  }

  /**
   * Get the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse"..
   * <p>
   * @return a {@link UN10} instance
   * @since 3.1.0
   */
  public UN10 getNumSubpulses() {
    return numSubpulses;
  }

  /**
   * Set the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse"..
   * <p>
   * @param value a {@link UN10} instance
   * @since 3.1.0
   */
  public void setNumSubpulses(UN10 value) {
    this.numSubpulses = value;
  }

  /**
   * Determine if the NumSubpulses is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSubpulses() {
    return (this.numSubpulses != null ? this.numSubpulses.isSetValue() : false);
  }

  /**
   * Set the numeric value for the pulse repetition rate (PRR) of the equipment.
   * For equipment having a capability for continuously variable PRR over a wide
   * range(s), insert the minimum value in this attribute and the maximum value
   * in maxPRR.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withPRRMin(Double value) {
    setPRRMin(new PulseRate(value));
    return this;
  }

  /**
   * Set for equipment having a capability for continuously variable PRR over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PRRMax is used, it MUST be greater than PRRMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withPRRMax(Double value) {
    setPRRMax(new PulseRate(value));
    return this;
  }

  /**
   * Set a numeric value indicating the characteristic pulse duration of the
   * equipment at the half-power (-3 dB) points. For equipment having a
   * capability for continuously variable PDs over a wide range, insert the
   * minimum value in this attribute and the maximum value in maxPD.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withPDMin(Double value) {
    setPDMin(new microsecs(value));
    return this;
  }

  /**
   * Set for equipment having a capability for continuously variable PD over a
   * wide range.
   * <p>
   * [XSL ERR MINMAX] If PDMax is used, it MUST be greater than PDMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withPDMax(Double value) {
    setPDMax(new microsecs(value));
    return this;
  }

  /**
   * Set as a percentage, the minimum or nominal ratio of the pulse duration to
   * the pulse period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withDutyCycleMin(Double value) {
    setDutyCycleMin(new Percent(value));
    return this;
  }

  /**
   * Set as a percentage, the maximum ratio of the pulse duration to the pulse
   * period.
   * <p>
   * [XSL ERR MINMAX] If DutyCycleMax is used, it MUST be greater than
   * DutyCycleMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withDutyCycleMax(Double value) {
    setDutyCycleMax(new Percent(value));
    return this;
  }

  /**
   * Set the minimum or nominal average power.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withAvgPowerMin(Double value) {
    setAvgPowerMin(new dBW(value));
    return this;
  }

  /**
   * Set the maximum average power.
   * <p>
   * [XSL ERR MINMAX] If AvgPowerMax is used, it MUST be greater than
   * AvgPowerMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withAvgPowerMax(Double value) {
    setAvgPowerMax(new dBW(value));
    return this;
  }

  /**
   * Set the ratio of the uncompressed pulse width to the compressed pulse width
   * measured at the 50% amplitude (-3 dB) points.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withCompRatio(Double value) {
    setCompRatio(new UN8_4(value));
    return this;
  }

  /**
   * Set the method employed to reduce the period of the pulse.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withCompMethod(String value) {
    setCompMethod(new S40(value));
    return this;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withRiseTime(Double value) {
    setRiseTime(new microsecs(value));
    return this;
  }

  /**
   * Set the pulse fall time from 90 to 10 percent of the pulse.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withFallTime(Double value) {
    setFallTime(new microsecs(value));
    return this;
  }

  /**
   * Set an operational justification for short pulse rise time. This is
   * required if the transmitter is a pulsed Group B, C, or radar, and either:
   * (1) it uses FM modulation and the Rise Time or Fall Time is less than 0.1
   * microseconds, or (2) it uses Non-FM modulation and the Rise Time or Fall
   * Time is less than 0.01 microseconds.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withJustifyShortRiseTime(String value) {
    setJustifyShortRiseTime(new MEMO(value));
    return this;
  }

  /**
   * Set the maximum ratio of the post-processing signal-to-noise ratio to the
   * received signal-to-noise ratio. This only applies when the Radar Type is
   * "FM Pulse".
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withRadarProcessingGainMax(Double value) {
    setRadarProcessingGainMax(new dB(value));
    return this;
  }

  /**
   * Set the total number of subpulses (chips) contained in a radar coded pulse.
   * This only applies when the Radar Type is "FM Pulse" or "Coded Pulse".
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Pulse object instance.
   * @since 3.1.0
   */
  public Pulse withNumSubpulses(Integer value) {
    setNumSubpulses(new UN10(value));
    return this;
  }

  /**
   * Get a string representation of this Pulse instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Pulse {"
           + (avgPowerMax != null ? "\n avgPowerMax [" + avgPowerMax + "]" : "")
           + (avgPowerMin != null ? "\n avgPowerMin [" + avgPowerMin + "]" : "")
           + (compMethod != null ? "\n compMethod [" + compMethod + "]" : "")
           + (compRatio != null ? "\n compRatio [" + compRatio + "]" : "")
           + (dutyCycleMax != null ? "\n dutyCycleMax [" + dutyCycleMax + "]" : "")
           + (dutyCycleMin != null ? "\n dutyCycleMin [" + dutyCycleMin + "]" : "")
           + (fallTime != null ? "\n fallTime [" + fallTime + "]" : "")
           + (justifyShortRiseTime != null ? "\n justifyShortRiseTime [" + justifyShortRiseTime + "]" : "")
           + (numSubpulses != null ? "\n numSubpulses [" + numSubpulses + "]" : "")
           + (pdMax != null ? "\n pdMax [" + pdMax + "]" : "")
           + (pdMin != null ? "\n pdMin [" + pdMin + "]" : "")
           + (prrMax != null ? "\n prrMax [" + prrMax + "]" : "")
           + (prrMin != null ? "\n prrMin [" + prrMin + "]" : "")
           + (radarProcessingGainMax != null ? "\n radarProcessingGainMax [" + radarProcessingGainMax + "]" : "")
           + (riseTime != null ? "\n riseTime [" + riseTime + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Pulse} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
