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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio
   * of the pulse duration to the pulse period.
   */
  @XmlElement(name = "MOPDutyCycle", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal mopDutyCycle;
  /**
   * US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   */
  @XmlElement(name = "MOPNumElements", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger mopNumElements;
  /**
   * US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepAM", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal mopStepAM;
  /**
   * US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepCW", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepCW;
  /**
   * US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepFM", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepFM;
  /**
   * US:MOPStepPM (US) - The difference between adjacent phase discrete values,
   * within a pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepPM", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopStepPM;
  /**
   * US:MOPRepetionInterval - MOP Repetion Interval (Optional)
   * <p>
   * The overall interval which may include multiple Sweep Repetition Intervals
   * (SRI). Fly-back times, and dead times.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "MOPRepetionInterval", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopRepetionInterval;
  /**
   * US:BitRate - Bit Rate (Optional)
   * <p>
   * The rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse
   * of the minimum bit duration (e.g., a signal that has a .977 usec minimum
   * bit has a bit rate of 1024 kbit/sec).
   * <p>
   * Format is UN(10,3) (kbit/sec)
   */
  @XmlElement(name = "BitRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterBITRATE.class)
  private TDecimal bitRate;
  /**
   * US:BitDuration - Bit Duration (Optional)
   * <p>
   * The shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "BitDuration", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal bitDuration;

  @XmlElement(name = "ObservedMOPValues")
  private Set<ObservedMOPValues> observedMOPValues;

  /**
   * Get US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @return the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public TDecimal getMOPDutyCycle() {
    return mopDutyCycle;
  }

  /**
   * Set US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @param value the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public void setMOPDutyCycle(TDecimal value) {
    this.mopDutyCycle = value;
  }

  /**
   * Determine if the MOPDutyCycle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPDutyCycle() {
    return (this.mopDutyCycle != null ? this.mopDutyCycle.isSetValue() : false);
  }

  /**
   * Get US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @return the MOPNumElements value in a {@link TInteger} data type
   */
  public TInteger getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @param value the MOPNumElements value in a {@link TInteger} data type
   */
  public void setMOPNumElements(TInteger value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepAM() {
    return mopStepAM;
  }

  /**
   * Set US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepAM value in a {@link TDecimal} data type
   */
  public void setMOPStepAM(TDecimal value) {
    this.mopStepAM = value;
  }

  /**
   * Determine if the MOPStepAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepAM() {
    return (this.mopStepAM != null ? this.mopStepAM.isSetValue() : false);
  }

  /**
   * Get US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepCW() {
    return mopStepCW;
  }

  /**
   * Set US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepCW value in a {@link TDecimal} data type
   */
  public void setMOPStepCW(TDecimal value) {
    this.mopStepCW = value;
  }

  /**
   * Determine if the MOPStepCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepCW() {
    return (this.mopStepCW != null ? this.mopStepCW.isSetValue() : false);
  }

  /**
   * Get US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepFM() {
    return mopStepFM;
  }

  /**
   * Set US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepFM value in a {@link TDecimal} data type
   */
  public void setMOPStepFM(TDecimal value) {
    this.mopStepFM = value;
  }

  /**
   * Determine if the MOPStepFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepFM() {
    return (this.mopStepFM != null ? this.mopStepFM.isSetValue() : false);
  }

  /**
   * Get US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepPM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepPM() {
    return mopStepPM;
  }

  /**
   * Set US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepPM value in a {@link TDecimal} data type
   */
  public void setMOPStepPM(TDecimal value) {
    this.mopStepPM = value;
  }

  /**
   * Determine if the MOPStepPM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepPM() {
    return (this.mopStepPM != null ? this.mopStepPM.isSetValue() : false);
  }

  /**
   * Get the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @return the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public TDecimal getMOPRepetionInterval() {
    return mopRepetionInterval;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public void setMOPRepetionInterval(TDecimal value) {
    this.mopRepetionInterval = value;
  }

  /**
   * Determine if the MOPRepetionInterval is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPRepetionInterval() {
    return (this.mopRepetionInterval != null ? this.mopRepetionInterval.isSetValue() : false);
  }

  /**
   * Get the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @return the BitRate value in a {@link TDecimal} data type
   */
  public TDecimal getBitRate() {
    return bitRate;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @param value the BitRate value in a {@link TDecimal} data type
   */
  public void setBitRate(TDecimal value) {
    this.bitRate = value;
  }

  /**
   * Determine if the BitRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitRate() {
    return (this.bitRate != null ? this.bitRate.isSetValue() : false);
  }

  /**
   * Get the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @return the BitDuration value in a {@link TDecimal} data type
   */
  public TDecimal getBitDuration() {
    return bitDuration;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @param value the BitDuration value in a {@link TDecimal} data type
   */
  public void setBitDuration(TDecimal value) {
    this.bitDuration = value;
  }

  /**
   * Determine if the BitDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitDuration() {
    return (this.bitDuration != null ? this.bitDuration.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedMOPValues}
   *         instances
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
   * Set US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPNumElements(Integer value) {
    setMOPNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepAM(Double value) {
    setMOPStepAM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepCW(Double value) {
    setMOPStepCW(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepFM(Double value) {
    setMOPStepFM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepPM(Double value) {
    setMOPStepPM(new TDecimal(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withBitRate(Double value) {
    setBitRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withBitDuration(Double value) {
    setBitDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ObservedMOPValues}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withObservedMOPValues(ObservedMOPValues... values) {
    if (values != null) {
      getObservedMOPValues().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ObservedMOPValues} instances
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withObservedMOPValues(Set<ObservedMOPValues> values) {
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
      + (mopNumElements != null ? " mopNumElements [" + mopNumElements + "]" : "")
      + (mopRepetionInterval != null ? " mopRepetionInterval [" + mopRepetionInterval + "]" : "")
      + (mopStepAM != null ? " mopStepAM [" + mopStepAM + "]" : "")
      + (observedMOPValues != null ? " observedMOPValues [" + observedMOPValues + "]" : "")
      + (mopStepCW != null ? " mopStepCW [" + mopStepCW + "]" : "")
      + (bitDuration != null ? " bitDuration [" + bitDuration + "]" : "")
      + (mopDutyCycle != null ? " mopDutyCycle [" + mopDutyCycle + "]" : "")
      + (bitRate != null ? " bitRate [" + bitRate + "]" : "")
      + (mopStepPM != null ? " mopStepPM [" + mopStepPM + "]" : "")
      + (mopStepFM != null ? " mopStepFM [" + mopStepFM + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPBits} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
