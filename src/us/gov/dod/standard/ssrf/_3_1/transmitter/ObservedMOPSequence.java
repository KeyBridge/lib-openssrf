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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * US: SequenceBitLength (US) - The length of one sequence of a pattern of
   * bits that been observed repeating.
   */
  @XmlElement(name = "SequenceBitLength", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger sequenceBitLength;
  /**
   * US:MOPSequenceDesc (US), enter a text description of the MOP sequence.
   */
  @XmlElement(name = "MOPSequenceDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString mopSequenceDesc;
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

  @XmlElement(name = "ObservedMOPBits")
  private List<ObservedMOPBits> observedMOPBits;

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
   * Get US: SequenceBitLength (US) - The length of one sequence of a pattern of
   * bits that been observed repeating.
   * <p>
   * @return the SequenceBitLength value in a {@link TInteger} data type
   */
  public TInteger getSequenceBitLength() {
    return sequenceBitLength;
  }

  /**
   * Set US: SequenceBitLength (US) - The length of one sequence of a pattern of
   * bits that been observed repeating.
   * <p>
   * @param value the SequenceBitLength value in a {@link TInteger} data type
   */
  public void setSequenceBitLength(TInteger value) {
    this.sequenceBitLength = value;
  }

  /**
   * Determine if the SequenceBitLength is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSequenceBitLength() {
    return (this.sequenceBitLength != null ? this.sequenceBitLength.isSetValue() : false);
  }

  /**
   * Get US:MOPSequenceDesc (US), enter a text description of the MOP sequence.
   * <p>
   * @return the MOPSequenceDesc value in a {@link TString} data type
   */
  public TString getMOPSequenceDesc() {
    return mopSequenceDesc;
  }

  /**
   * Set US:MOPSequenceDesc (US), enter a text description of the MOP sequence.
   * <p>
   * @param value the MOPSequenceDesc value in a {@link TString} data type
   */
  public void setMOPSequenceDesc(TString value) {
    this.mopSequenceDesc = value;
  }

  /**
   * Determine if the MOPSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPSequenceDesc() {
    return (this.mopSequenceDesc != null ? this.mopSequenceDesc.isSetValue() : false);
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
   * Get
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedMOPBits}
   *         instances
   */
  public List<ObservedMOPBits> getObservedMOPBits() {
    if (observedMOPBits == null) {
      observedMOPBits = new ArrayList<>();
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
   * Set US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPNumElements(Integer value) {
    setMOPNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPStepAM(Double value) {
    setMOPStepAM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPStepCW(Double value) {
    setMOPStepCW(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPStepFM(Double value) {
    setMOPStepFM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPStepPM(Double value) {
    setMOPStepPM(new TDecimal(value));
    return this;
  }

  /**
   * Set US: SequenceBitLength (US) - The length of one sequence of a pattern of
   * bits that been observed repeating.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withSequenceBitLength(Integer value) {
    setSequenceBitLength(new TInteger(value));
    return this;
  }

  /**
   * Set US:MOPSequenceDesc (US), enter a text description of the MOP sequence.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPSequenceDesc(String value) {
    setMOPSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSequence object instance
   */
  public ObservedMOPSequence withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ObservedMOPBits}
   * @return The current ObservedMOPSequence object instance
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
   * @return The current ObservedMOPSequence object instance
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
    return "ObservedMOPSequence {"
      + (sequenceBitLength != null ? " sequenceBitLength [" + sequenceBitLength + "]" : "")
      + (mopNumElements != null ? " mopNumElements [" + mopNumElements + "]" : "")
      + (mopRepetionInterval != null ? " mopRepetionInterval [" + mopRepetionInterval + "]" : "")
      + (mopStepAM != null ? " mopStepAM [" + mopStepAM + "]" : "")
      + (mopSequenceDesc != null ? " mopSequenceDesc [" + mopSequenceDesc + "]" : "")
      + (mopStepCW != null ? " mopStepCW [" + mopStepCW + "]" : "")
      + (mopDutyCycle != null ? " mopDutyCycle [" + mopDutyCycle + "]" : "")
      + (mopStepPM != null ? " mopStepPM [" + mopStepPM + "]" : "")
      + (observedMOPBits != null ? " observedMOPBits [" + observedMOPBits + "]" : "")
      + (mopStepFM != null ? " mopStepFM [" + mopStepFM + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPSequence} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
