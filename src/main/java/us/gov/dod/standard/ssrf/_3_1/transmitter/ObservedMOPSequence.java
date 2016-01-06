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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedMOPSequence (US) contains descriptive information about the
 * sequencing used for the Modulation impressed On the Pulse (MOP).
 * <p>
 * Element of {@link ObservedMOPSweep}
 * <p>
 * Sub-Element is {@link ObservedMOPBits}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPSequence", propOrder = {
  "mopDutyCycle",
  "mopNumElements",
  "mopStepAM",
  "mopStepCW",
  "mopStepFM",
  "mopStepPM",
  "sequenceBitLength",
  "mopSequenceDesc",
  "mopRepetionInterval",
  "observedMOPBits"
})
public class ObservedMOPSequence {

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
   * In Data Item US: SequenceBitLength (US), enter the length of one sequence
   * of a pattern of bits that been observed repeating.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SequenceBitLength", required = false)
  private UN6 sequenceBitLength;
  /**
   * In Data Item US:MOPSequenceDesc (US), enter a text description of the MOP
   * sequence.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPSequenceDesc", required = false)
  private S500 mopSequenceDesc;
  /**
   * US:MOPRepetionInterval - MOP Repetion Interval (Optional)
   * <p>
   * The overall interval which may include multiple Sweep Repetition Intervals
   * (SRI). Fly-back times, and dead times.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPRepetionInterval", required = false)
  private microsecs mopRepetionInterval;

  @XmlElement(name = "ObservedMOPBits")
  private Set<ObservedMOPBits> observedMOPBits;

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
   * Get In Data Item US: SequenceBitLength (US), enter the length of one
   * sequence of a pattern of bits that been observed repeating..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getSequenceBitLength() {
    return sequenceBitLength;
  }

  /**
   * Set In Data Item US: SequenceBitLength (US), enter the length of one
   * sequence of a pattern of bits that been observed repeating..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setSequenceBitLength(UN6 value) {
    this.sequenceBitLength = value;
  }

  /**
   * Determine if the SequenceBitLength is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSequenceBitLength() {
    return (this.sequenceBitLength != null ? this.sequenceBitLength.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPSequenceDesc (US), enter a text description of the
   * MOP sequence..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getMOPSequenceDesc() {
    return mopSequenceDesc;
  }

  /**
   * Set In Data Item US:MOPSequenceDesc (US), enter a text description of the
   * MOP sequence..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setMOPSequenceDesc(S500 value) {
    this.mopSequenceDesc = value;
  }

  /**
   * Determine if the MOPSequenceDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPSequenceDesc() {
    return (this.mopSequenceDesc != null ? this.mopSequenceDesc.isSetValue() : false);
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
   * Get .
   * <p>
   * @return a {@link ObservedMOPBits} instance
   * @since 3.1.0
   */
  public Set<ObservedMOPBits> getObservedMOPBits() {
    if (observedMOPBits == null) {
      observedMOPBits = new HashSet<>();
    }
    return this.observedMOPBits;
  }

  /**
   * Determine if the ObservedMOPBits is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPBits() {
    return ((this.observedMOPBits != null) && (!this.observedMOPBits.isEmpty()));
  }

  /**
   * Clear the ObservedMOPBits field. This sets the field to null.
   */
  public void unsetObservedMOPBits() {
    this.observedMOPBits = null;
  }

  /**
   * Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new Percent(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPNumElements(Integer value) {
    setMOPNumElements(new UN6(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPStepAM(Double value) {
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
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPStepCW(Double value) {
    setMOPStepCW(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPStepFM(Double value) {
    setMOPStepFM(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPStepPM(Double value) {
    setMOPStepPM(new US_PhaseAngle(value));
    return this;
  }

  /**
   * Set In Data Item US: SequenceBitLength (US), enter the length of one
   * sequence of a pattern of bits that been observed repeating.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withSequenceBitLength(Integer value) {
    setSequenceBitLength(new UN6(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPSequenceDesc (US), enter a text description of the
   * MOP sequence.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPSequenceDesc(String value) {
    setMOPSequenceDesc(new S500(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new microsecs(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ObservedMOPBits...}.
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withObservedMOPBits(ObservedMOPBits... values) {
    if (values != null) {
      getObservedMOPBits().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ObservedMOPBits} instances
   * @return The current ObservedMOPSequence object instance.
   * @since 3.1.0
   */
  public ObservedMOPSequence withObservedMOPBits(Collection<ObservedMOPBits> values) {
    if (values != null) {
      getObservedMOPBits().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPSequence instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedMOPSequence {"
           + (mopDutyCycle != null ? " mopDutyCycle [" + mopDutyCycle + "]" : "")
           + (mopNumElements != null ? " mopNumElements [" + mopNumElements + "]" : "")
           + (mopRepetionInterval != null ? " mopRepetionInterval [" + mopRepetionInterval + "]" : "")
           + (mopSequenceDesc != null ? " mopSequenceDesc [" + mopSequenceDesc + "]" : "")
           + (mopStepAM != null ? " mopStepAM [" + mopStepAM + "]" : "")
           + (mopStepCW != null ? " mopStepCW [" + mopStepCW + "]" : "")
           + (mopStepFM != null ? " mopStepFM [" + mopStepFM + "]" : "")
           + (mopStepPM != null ? " mopStepPM [" + mopStepPM + "]" : "")
           + (observedMOPBits != null ? " observedMOPBits [" + observedMOPBits + "]" : "")
           + (sequenceBitLength != null ? " sequenceBitLength [" + sequenceBitLength + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPSequence} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
