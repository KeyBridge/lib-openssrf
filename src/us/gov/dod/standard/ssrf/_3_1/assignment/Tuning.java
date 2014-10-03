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
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDS;

/**
 * Tuning indicates the specific frequency or range of frequencies, tuning
 * increment, and number of frequencies, required for an assignment.
 * <p>
 * Element of {@link Link}
 * <p>
 * Sub-Element is {@link AsgnFreqBase RequestedFreq}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tuning", propOrder = {
  "tuningStep",
  "numFreq",
  "priority",
  "exclusive",
  "freqSep",
  "freqSepType",
  "requestedFreq"
})
public class Tuning {

  /**
   * TuningStep - Tuning Step (Required)
   * <p>
   * The tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "TuningStep", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * NumFreq - Number of Frequencies (Required)
   * <p>
   * The number of frequencies required.
   * <p>
   * Format is UN(4)
   */
  @XmlElement(name = "NumFreq", required = true)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numFreq;
  /**
   * Priority - Priority (Optional)
   * <p>
   * A number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * Format is UN(1)
   */
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN1.class)
  private TInteger priority;
  /**
   * Exclusive - Exclusive Assignment (Optional)
   * <p>
   * Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Exclusive", required = false)
  private TString exclusive;
  /**
   * FreqSep - Frequency Separation (Optional)
   * <p>
   * The required minimum or exact frequency separation.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqSep (Optional)
   */
  @XmlElement(name = "FreqSep")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqSep;
  /**
   * FreqSepType - Frequency Separation Type (Optional)
   * <p>
   * If the stated frequency separation is an exact or minimum value.
   * <p>
   * Format is L:CDS
   * <p>
   * Attribute group FreqSep (Optional)
   */
  @XmlElement(name = "FreqSepType")
  private TString freqSepType;
  /**
   * RequestedFreq (Optional)
   * <p>
   * RequestedFreq indicates a single frequency or a range of frequencies.
   */
  @XmlElement(name = "RequestedFreq")
  private List<AsgnFreqBase> requestedFreq;

  /**
   * Get the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value the TuningStep value in a {@link TDecimal} data type
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get the number of frequencies required.
   * <p>
   * @return the NumFreq value in a {@link TInteger} data type
   */
  public TInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value the NumFreq value in a {@link TInteger} data type
   */
  public void setNumFreq(TInteger value) {
    this.numFreq = value;
  }

  /**
   * Determine if the NumFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreq() {
    return (this.numFreq != null ? this.numFreq.isSetValue() : false);
  }

  /**
   * Get a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @return the Priority value in a {@link TInteger} data type
   */
  public TInteger getPriority() {
    return priority;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value the Priority value in a {@link TInteger} data type
   */
  public void setPriority(TInteger value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @return the Exclusive value in a {@link TString} data type
   */
  public TString getExclusive() {
    return exclusive;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value the Exclusive value in a {@link TString} data type
   */
  public void setExclusive(TString value) {
    this.exclusive = value;
  }

  /**
   * Determine if the Exclusive is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExclusive() {
    return (this.exclusive != null ? this.exclusive.isSetValue() : false);
  }

  /**
   * Get the required minimum or exact frequency separation.
   * <p>
   * @return the FreqSep value in a {@link TDecimal} data type
   */
  public TDecimal getFreqSep() {
    return freqSep;
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value the FreqSep value in a {@link TDecimal} data type
   */
  public void setFreqSep(TDecimal value) {
    this.freqSep = value;
  }

  /**
   * Determine if the FreqSep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqSep() {
    return (this.freqSep != null ? this.freqSep.isSetValue() : false);
  }

  /**
   * Get if the stated frequency separation is an exact or minimum value.
   * <p>
   * @return the FreqSepType value in a {@link TString} data type
   */
  public TString getFreqSepType() {
    return freqSepType;
  }

  /**
   * Set if the stated frequency separation is an exact or minimum value.
   * <p>
   * @param value the FreqSepType value in a {@link TString} data type
   */
  public void setFreqSepType(TString value) {
    this.freqSepType = value;
  }

  /**
   * Determine if the FreqSepType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqSepType() {
    return (this.freqSepType != null ? this.freqSepType.isSetValue() : false);
  }

  /**
   * Get the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @return a non-null but possibly empty list of {@link AsgnFreqBase} instances
   */
  public List<AsgnFreqBase> getRequestedFreq() {
    if (requestedFreq == null) {
      requestedFreq = new ArrayList<>();
    }
    return this.requestedFreq;
  }

  /**
   * Determine if the RequestedFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequestedFreq() {
    return ((this.requestedFreq != null) && (!this.requestedFreq.isEmpty()));
  }

  /**
   * Clear the RequestedFreq field. This sets the field to null.
   */
  public void unsetRequestedFreq() {
    this.requestedFreq = null;
  }

  /**
   * Set the tuning increment expressed of the requested frequency range. This
   * should be compatible with the tuning capability of the transmitters and/or
   * receivers in the link.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Tuning object instance
   */
  public Tuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of frequencies required.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Tuning object instance
   */
  public Tuning withNumFreq(Integer value) {
    setNumFreq(new TInteger(value));
    return this;
  }

  /**
   * Set a number from 0 to 9 that is used to influence the positioning of the
   * Assignment in the ordering of the assignment process, where 9 represents
   * the highest priority and 0 is the lowest priority.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Tuning object instance
   */
  public Tuning withPriority(Integer value) {
    setPriority(new TInteger(value));
    return this;
  }

  /**
   * Set Yes if the assigned frequency should not be reused within the area of
   * exercise/operation.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Tuning object instance
   */
  public Tuning withExclusive(ListCBO value) {
    setExclusive(new TString(value.value()));
    return this;
  }

  /**
   * Set the required minimum or exact frequency separation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Tuning object instance
   */
  public Tuning withFreqSep(Double value) {
    setFreqSep(new TDecimal(value));
    return this;
  }

  /**
   * Set if the stated frequency separation is an exact or minimum value.
   * <p>
   * @param value An instances of type {@link ListCDS}
   * @return The current Tuning object instance
   */
  public Tuning withFreqSepType(ListCDS value) {
    setFreqSepType(new TString(value.value()));
    return this;
  }

  /**
   * Set the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @param values One or more instances of type {@link AsgnFreqBase}
   * @return The current Tuning object instance
   */
  public Tuning withRequestedFreq(AsgnFreqBase... values) {
    if (values != null) {
      getRequestedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RequestedFreq
   * <p>
   * Complex element RequestedFreq indicates a single frequency or a range of
   * frequencies.
   * <p>
   * @param values A collection of {@link AsgnFreqBase} instances
   * @return The current Tuning object instance
   */
  public Tuning withRequestedFreq(Collection<AsgnFreqBase> values) {
    if (values != null) {
      getRequestedFreq().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Tuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Tuning {"
      + " freqSep [" + freqSep + "]"
      + " freqSepType [" + freqSepType + "]"
      + " exclusive [" + exclusive + "]"
      + " priority [" + priority + "]"
      + " requestedFreq [" + requestedFreq + "]"
      + " tuningStep [" + tuningStep + "]"
      + " numFreq [" + numFreq + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Tuning} requires
   * {@link TInteger NumFreq}, {@link TDecimal TuningStep}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumFreq() && isSetTuningStep();
  }

}
