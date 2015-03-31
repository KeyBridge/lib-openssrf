package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedMOPBits (US) describes the data format for the Amplitude (AM), Phase
 * (PM), Frequency (FM) and/or Continuous Wave (CW) features of a signal
 * impressed on a Pulse.
 * <p>
 * Element of {@link ObservedMOPSequence}
 * <p>
 * Sub-Element is {@link ObservedMOPValues}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPBits", propOrder = {
  "mopDutyCycle",
  "mopNumElements",
  "mopStepAM",
  "mopStepCW",
  "mopStepFM",
  "mopStepPM",
  "mopRepetionInterval",
  "bitRate",
  "bitDuration",
  "observedMOPValues"
})
public class ObservedMOPBits {

  /**
   * In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or
   * nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPDutyCycle", required = false)
  private Percent mopDutyCycle;
  /**
   * In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPNumElements", required = false)
  private UN6 mopNumElements;
  /**
   * In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPStepAM", required = false)
  private Unsigned_DB_5_2 mopStepAM;
  /**
   * In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPStepCW", required = false)
  private US_MOPFm mopStepCW;
  /**
   * In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPStepFM", required = false)
  private US_MOPFm mopStepFM;
  /**
   * In Data Item US:MOPStepPM (US), enter the difference between adjacent phase
   * discrete values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPStepPM", required = false)
  private US_PhaseAngle mopStepPM;
  /**
   * US:MOPRepetionInterval - MOP Repetion Interval (Optional)    * <p>
   * The overall interval which may include multiple Sweep Repetition Intervals
   * (SRI). Fly-back times, and dead times.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPRepetionInterval", required = false)
  private microsecs mopRepetionInterval;
  /**
   * US:BitRate - Bit Rate (Optional)    * <p>
   * The rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse
   * of the minimum bit duration (e.g., a signal that has a .977 usec minimum
   * bit has a bit rate of 1024 kbit/sec).
   * <p>
   * Format is UN(10,3) (kbit/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BitRate", required = false)
  private BitRate bitRate;
  /**
   * US:BitDuration - Bit Duration (Optional)    * <p>
   * The shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BitDuration", required = false)
  private microsecs bitDuration;

  @XmlElement(name = "ObservedMOPValues")
  private Set<ObservedMOPValues> observedMOPValues;

  /**
   * Get In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period..
   * <p>
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getMOPDutyCycle() {
    return mopDutyCycle;
  }

  /**
   * Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period..
   * <p>
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setMOPDutyCycle(Percent value) {
    this.mopDutyCycle = value;
  }

  /**
   * Determine if the MOPDutyCycle is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPDutyCycle() {
    return (this.mopDutyCycle != null ? this.mopDutyCycle.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time).
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time).
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setMOPNumElements(UN6 value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public Unsigned_DB_5_2 getMOPStepAM() {
    return mopStepAM;
  }

  /**
   * Set In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMOPStepAM(Unsigned_DB_5_2 value) {
    this.mopStepAM = value;
  }

  /**
   * Determine if the MOPStepAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepAM() {
    return (this.mopStepAM != null ? this.mopStepAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPStepCW() {
    return mopStepCW;
  }

  /**
   * Set In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPStepCW(US_MOPFm value) {
    this.mopStepCW = value;
  }

  /**
   * Determine if the MOPStepCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepCW() {
    return (this.mopStepCW != null ? this.mopStepCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPStepFM() {
    return mopStepFM;
  }

  /**
   * Set In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPStepFM(US_MOPFm value) {
    this.mopStepFM = value;
  }

  /**
   * Determine if the MOPStepFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepFM() {
    return (this.mopStepFM != null ? this.mopStepFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public US_PhaseAngle getMOPStepPM() {
    return mopStepPM;
  }

  /**
   * Set In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public void setMOPStepPM(US_PhaseAngle value) {
    this.mopStepPM = value;
  }

  /**
   * Determine if the MOPStepPM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepPM() {
    return (this.mopStepPM != null ? this.mopStepPM.isSetValue() : false);
  }

  /**
   * Get the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getMOPRepetionInterval() {
    return mopRepetionInterval;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setMOPRepetionInterval(microsecs value) {
    this.mopRepetionInterval = value;
  }

  /**
   * Determine if the MOPRepetionInterval is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPRepetionInterval() {
    return (this.mopRepetionInterval != null ? this.mopRepetionInterval.isSetValue() : false);
  }

  /**
   * Get the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec)..
   * <p>
   * @return a {@link BitRate} instance
   * @since 3.1.0
   */
  public BitRate getBitRate() {
    return bitRate;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec)..
   * <p>
   * @param value a {@link BitRate} instance
   * @since 3.1.0
   */
  public void setBitRate(BitRate value) {
    this.bitRate = value;
  }

  /**
   * Determine if the BitRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitRate() {
    return (this.bitRate != null ? this.bitRate.isSetValue() : false);
  }

  /**
   * Get the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getBitDuration() {
    return bitDuration;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setBitDuration(microsecs value) {
    this.bitDuration = value;
  }

  /**
   * Determine if the BitDuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitDuration() {
    return (this.bitDuration != null ? this.bitDuration.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link ObservedMOPValues} instance
   * @since 3.1.0
   */
  public Set<ObservedMOPValues> getObservedMOPValues() {
    if (observedMOPValues == null) {
      observedMOPValues = new HashSet<>();
    }
    return this.observedMOPValues;
  }

  /**
   * Determine if the ObservedMOPValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPValues() {
    return ((this.observedMOPValues != null) && (!this.observedMOPValues.isEmpty()));
  }

  /**
   * Clear the ObservedMOPValues field. This sets the field to null.
   */
  public void unsetObservedMOPValues() {
    this.observedMOPValues = null;
  }

  /**
   * Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new Percent(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPNumElements(Integer value) {
    setMOPNumElements(new UN6(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPStepAM(Double value) {
    setMOPStepAM(new Unsigned_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPStepCW(Double value) {
    setMOPStepCW(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPStepFM(Double value) {
    setMOPStepFM(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPStepPM(Double value) {
    setMOPStepPM(new US_PhaseAngle(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new microsecs(value));
    return this;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withBitRate(Double value) {
    setBitRate(new BitRate(value));
    return this;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withBitDuration(Double value) {
    setBitDuration(new microsecs(value));
    return this;
  }

  /**
   * Set    * <p>
   * @param values One or more instances of type {@link ObservedMOPValues...}.
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withObservedMOPValues(ObservedMOPValues... values) {
    if (values != null) {
      getObservedMOPValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set    * <p>
   * @param values A collection of {@link ObservedMOPValues} instances
   * @return The current ObservedMOPBits object instance.
   * @since 3.1.0
   */
  public ObservedMOPBits withObservedMOPValues(Collection<ObservedMOPValues> values) {
    if (values != null) {
      getObservedMOPValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPBits instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedMOPBits {"
           + (bitDuration != null ? "\n bitDuration [" + bitDuration + "]" : "")
           + (bitRate != null ? "\n bitRate [" + bitRate + "]" : "")
           + (mopDutyCycle != null ? "\n mopDutyCycle [" + mopDutyCycle + "]" : "")
           + (mopNumElements != null ? "\n mopNumElements [" + mopNumElements + "]" : "")
           + (mopRepetionInterval != null ? "\n mopRepetionInterval [" + mopRepetionInterval + "]" : "")
           + (mopStepAM != null ? "\n mopStepAM [" + mopStepAM + "]" : "")
           + (mopStepCW != null ? "\n mopStepCW [" + mopStepCW + "]" : "")
           + (mopStepFM != null ? "\n mopStepFM [" + mopStepFM + "]" : "")
           + (mopStepPM != null ? "\n mopStepPM [" + mopStepPM + "]" : "")
           + (observedMOPValues != null ? "\n observedMOPValues [" + observedMOPValues + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPBits} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
