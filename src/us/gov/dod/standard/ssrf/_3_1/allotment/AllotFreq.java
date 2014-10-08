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
package us.gov.dod.standard.ssrf._3_1.allotment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * AllotFreq defines a frequency or range of frequencies belonging to the
 * Allotment.
 * <p>
 * Element of {@link Allotment}
 * <p>
 * Sub-Element is
 * <p>
 * Example: See {@link Allotment}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllotFreq", propOrder = {
  "freqMin",
  "freqMax",
  "pairedFreqMin",
  "tuningStep",
  "allotChannel",
  "locationRestrictionRef"
})
public class AllotFreq {

  /**
   * FreqMin - Nominal or Minimum Frequency (Required)
   * <p>
   * The nominal frequency or minimum value of the frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
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
   * Attribute group FreqRangeGrp (Required)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "PairedFreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pairedFreqMin;
  /**
   * TuningStep - Tuning Step (Optional)
   * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "TuningStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * AllotChannel - Frequency Identifier (Optional)
   * <p>
   * A TACAN channel or net number
   * <p>
   * Format is S6
   */
  @XmlElement(name = "AllotChannel", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS6.class)
  private TString allotChannel;
  /**
   * LocationRestriction (Optional)
   * <p>
   * LocationRestriction indicates a Location where the Allotment usage is
   * forbidden.
   */
  @XmlElement(name = "LocationRestriction", nillable = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TString> locationRestrictionRef;

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
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @return the PairedFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getPairedFreqMin() {
    return pairedFreqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value the PairedFreqMin value in a {@link TDecimal} data type
   */
  public void setPairedFreqMin(TDecimal value) {
    this.pairedFreqMin = value;
  }

  /**
   * Determine if the PairedFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedFreqMin() {
    return (this.pairedFreqMin != null ? this.pairedFreqMin.isSetValue() : false);
  }

  /**
   * Get the tuning increment.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment.
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
   * Get a TACAN channel or net number
   * <p>
   * @return the AllotChannel value in a {@link TString} data type
   */
  public TString getAllotChannel() {
    return allotChannel;
  }

  /**
   * Set a TACAN channel or net number
   * <p>
   * @param value the AllotChannel value in a {@link TString} data type
   */
  public void setAllotChannel(TString value) {
    this.allotChannel = value;
  }

  /**
   * Determine if the AllotChannel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllotChannel() {
    return (this.allotChannel != null ? this.allotChannel.isSetValue() : false);
  }

  /**
   * Get the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocationRestriction()} instead.
   */
  @Deprecated
  public List<TString> getLocationRestrictionRef() {
    if (locationRestrictionRef == null) {
      locationRestrictionRef = new ArrayList<>();
    }
    return this.locationRestrictionRef;
  }

  /**
   * Determine if the LocationRestriction is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRestrictionRef() {
    return ((this.locationRestrictionRef != null) && (!this.locationRestrictionRef.isEmpty()));
  }

  /**
   * Clear the LocationRestriction field. This sets the field to null.
   */
  public void unsetLocationRestriction() {
    this.locationRestrictionRef = null;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withPairedFreqMin(Double value) {
    setPairedFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set a TACAN channel or net number
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withAllotChannel(String value) {
    setAllotChannel(new TString(value));
    return this;
  }

  /**
   * Set the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current AllotFreq object instance
   */
  public AllotFreq withLocationRestrictionRef(TString... values) {
    if (values != null) {
      getLocationRestrictionRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current AllotFreq object instance
   */
  public AllotFreq withLocationRestrictionRef(Collection<TString> values) {
    if (values != null) {
      getLocationRestrictionRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AllotFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AllotFreq {"
      + (pairedFreqMin != null ? " pairedFreqMin [" + pairedFreqMin + "]" : "")
      + (locationRestrictionRef != null ? " locationRestriction [" + locationRestrictionRef + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
      + (allotChannel != null ? " allotChannel [" + allotChannel + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AllotFreq} requires {@link TDecimal FreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetFreqMin();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocationRestriction (Optional)
   * <p>
   * LocationRestriction indicates a Location where the Allotment usage is
   * forbidden.
   */
  @XmlTransient
  private List<Location> locationRestriction;

  /**
   * Get a Location where the Allotment usage is forbidden.
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public List<Location> getLocationRestriction() {
    if (locationRestriction == null) {
      locationRestriction = new ArrayList<>();
    }
    return locationRestriction;
  }

  /**
   * Determine if the locationRestriction field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRestriction() {
    return this.locationRestriction != null && !this.locationRestriction.isEmpty();
  }

  /**
   * Set a Location where the Allotment usage is forbidden.
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestriction(Location... values) {
    return withLocationRestriction(Arrays.asList(values));
  }

  /**
   * Set a Location where the Allotment usage is forbidden.
   * <p>
   * @param values An instances of type {@link Location}
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq withLocationRestriction(Collection<Location> values) {
    getLocationRestriction().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this AllotFreq record.
   * <p>
   * This method builds the exported {@link #locationRestrictionRef} field with
   * values from the transient {@link #locationRestriction} field. This method
   * should typically be called after the AllotFreq is configured and
   * (optionally) before exporting an SSRF message.
   * <p>
   * @return The current AllotFreq object instance
   * @since 3.1.0
   */
  public AllotFreq build() {
    this.locationRestrictionRef = new ArrayList<>();
    for (Location instance : getLocationRestriction()) {
      this.locationRestrictionRef.add(instance.getSerial());
    }
    return this;
  }//</editor-fold>

}
