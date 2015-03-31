package us.gov.dod.standard.ssrf._3_1.allotment;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = true)
  private FreqM freqMin;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * PairedFreqMin - Paired Nominal or Minimum Frequency (Optional)
   * <p>
   * The nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PairedFreqMin", required = false)
  private FreqM pairedFreqMin;
  /**
   * TuningStep - Tuning Step (Optional)
   * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningStep", required = false)
  private FreqM tuningStep;
  /**
   * AllotChannel - Frequency Identifier (Optional)
   * <p>
   * A TACAN channel or net number
   * <p>
   * Format is S6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllotChannel", required = false)
  private S6 allotChannel;
  /**
   * LocationRestriction (Optional)
   * <p>
   * LocationRestriction indicates a Location where the Allotment usage is
   * forbidden.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRestriction", nillable = true)
  private Set<Serial> locationRestrictionRef;

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
   * Get the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPairedFreqMin() {
    return pairedFreqMin;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPairedFreqMin(FreqM value) {
    this.pairedFreqMin = value;
  }

  /**
   * Determine if the PairedFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPairedFreqMin() {
    return (this.pairedFreqMin != null ? this.pairedFreqMin.isSetValue() : false);
  }

  /**
   * Get the tuning increment..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setTuningStep(FreqM value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get a TACAN channel or net number.
   * <p>
   * @return a {@link S6} instance
   * @since 3.1.0
   */
  public S6 getAllotChannel() {
    return allotChannel;
  }

  /**
   * Set a TACAN channel or net number.
   * <p>
   * @param value a {@link S6} instance
   * @since 3.1.0
   */
  public void setAllotChannel(S6 value) {
    this.allotChannel = value;
  }

  /**
   * Determine if the AllotChannel is configured.
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
   * Allotment usage is forbidden..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Set<Serial> getLocationRestrictionRef() {
    if (locationRestrictionRef == null) {
      locationRestrictionRef = new HashSet<>();
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
  public void unsetLocationRestrictionRef() {
    this.locationRestrictionRef = null;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the nominal frequency or minimum value of the frequency range, for the
   * paired frequency or frequency range when the allotment is for a duplex
   * system.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withPairedFreqMin(Double value) {
    setPairedFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withTuningStep(Double value) {
    setTuningStep(new FreqM(value));
    return this;
  }

  /**
   * Set a TACAN channel or net number
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withAllotChannel(String value) {
    setAllotChannel(new S6(value));
    return this;
  }

  /**
   * Set the LocationRestriction
   * <p>
   * Complex element LocationRestriction indicates a Location where the
   * Allotment usage is forbidden.
   * <p>
   * @param values One or more instances of type {@link LocationRestriction...}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withLocationRestrictionRef(Serial... values) {
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
   * @param values A collection of {@link Serial} instances
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withLocationRestrictionRef(Collection<Serial> values) {
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
           + (allotChannel != null ? "\n allotChannel [" + allotChannel + "]" : "")
           + (freqMax != null ? "\n freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? "\n freqMin [" + freqMin + "]" : "")
           + (locationRestrictionRef != null ? "\n locationRestriction [" + locationRestrictionRef + "]" : "")
           + (pairedFreqMin != null ? "\n pairedFreqMin [" + pairedFreqMin + "]" : "")
           + (tuningStep != null ? "\n tuningStep [" + tuningStep + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AllotFreq} requires {@link FreqM FreqMin}.
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
  @XmlTransient
  private Set<Location> locationRestriction;

  /**
   * Get .
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Set<Location> getLocationRestriction() {
    if (locationRestriction == null) {
      locationRestriction = new HashSet<>();
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
   * Set
   * <p>
   * @param values An instances of type {@link Location}.
   * @return The current AllotFreq object instance.
   * @since 3.1.0
   */
  public AllotFreq withLocationRestriction(Location... values) {
    return withLocationRestriction(Arrays.asList(values));
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Location}.
   * @return The current AllotFreq object instance.
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
   * @since 3.1.0
   */
  public void prepare() {
    this.locationRestrictionRef = new HashSet<>();
    for (Location instance : getLocationRestriction()) {
      this.locationRestrictionRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this AllotFreq record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #locationRestriction} with values
   * from the imported {@link #locationRestrictionRef} field. This method should
   * typically be called after the AllotFreq is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locationRestrictionRef == null || locationRestrictionRef.isEmpty()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRestrictionRef.contains(instance.getSerial())) {
        getLocationRestriction().add(instance);
      }
    }
  }//</editor-fold>

}
