package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedPulseValues (US) contains data describing the distinct Pulse values
 * related to the Modulation Type.
 * <p>
 * Element of {@link ObservedPulseAnalysis}
 * <p>
 * Example: See {@link ObservedPulseAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPulseValues", propOrder = {
  "observedPDValue",
  "observedPRFValue",
  "observedPRIValue",
  "statisticalIndicator"
})
public class ObservedPulseValues {

  /**
   * ObservedPDValue - Observed PD Value (Optional)    * <p>
   * The observed PD data believed to be valid.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPDValue", required = false)
  private microsecs observedPDValue;
  /**
   * US:ObservedPRFValue - Observed PRF Value (Optional)    * <p>
   * The observed PRF data believed to be valid.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPRFValue", required = false)
  private US_PPS observedPRFValue;
  /**
   * US:ObservedPRIValue - Observed PRI Value (Optional)    * <p>
   * The observed PRI data believed to be valid.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPRIValue", required = false)
  private microsecs observedPRIValue;
  /**
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  private US_Percent3 statisticalIndicator;

  /**
   * Get the observed PD data believed to be valid..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getObservedPDValue() {
    return observedPDValue;
  }

  /**
   * Set the observed PD data believed to be valid..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setObservedPDValue(microsecs value) {
    this.observedPDValue = value;
  }

  /**
   * Determine if the ObservedPDValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPDValue() {
    return (this.observedPDValue != null ? this.observedPDValue.isSetValue() : false);
  }

  /**
   * Get the observed PRF data believed to be valid..
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getObservedPRFValue() {
    return observedPRFValue;
  }

  /**
   * Set the observed PRF data believed to be valid..
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setObservedPRFValue(US_PPS value) {
    this.observedPRFValue = value;
  }

  /**
   * Determine if the ObservedPRFValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPRFValue() {
    return (this.observedPRFValue != null ? this.observedPRFValue.isSetValue() : false);
  }

  /**
   * Get the observed PRI data believed to be valid..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getObservedPRIValue() {
    return observedPRIValue;
  }

  /**
   * Set the observed PRI data believed to be valid..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setObservedPRIValue(microsecs value) {
    this.observedPRIValue = value;
  }

  /**
   * Determine if the ObservedPRIValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPRIValue() {
    return (this.observedPRIValue != null ? this.observedPRIValue.isSetValue() : false);
  }

  /**
   * Get In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample..
   * <p>
   * @return a {@link US_Percent3} instance
   * @since 3.1.0
   */
  public US_Percent3 getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample..
   * <p>
   * @param value a {@link US_Percent3} instance
   * @since 3.1.0
   */
  public void setStatisticalIndicator(US_Percent3 value) {
    this.statisticalIndicator = value;
  }

  /**
   * Determine if the StatisticalIndicator is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatisticalIndicator() {
    return (this.statisticalIndicator != null ? this.statisticalIndicator.isSetValue() : false);
  }

  /**
   * Set the observed PD data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseValues object instance.
   * @since 3.1.0
   */
  public ObservedPulseValues withObservedPDValue(Double value) {
    setObservedPDValue(new microsecs(value));
    return this;
  }

  /**
   * Set the observed PRF data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseValues object instance.
   * @since 3.1.0
   */
  public ObservedPulseValues withObservedPRFValue(Double value) {
    setObservedPRFValue(new US_PPS(value));
    return this;
  }

  /**
   * Set the observed PRI data believed to be valid.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseValues object instance.
   * @since 3.1.0
   */
  public ObservedPulseValues withObservedPRIValue(Double value) {
    setObservedPRIValue(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseValues object instance.
   * @since 3.1.0
   */
  public ObservedPulseValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new US_Percent3(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedPulseValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedPulseValues {"
           + (observedPDValue != null ? " observedPDValue [" + observedPDValue + "]" : "")
           + (observedPRFValue != null ? " observedPRFValue [" + observedPRFValue + "]" : "")
           + (observedPRIValue != null ? " observedPRIValue [" + observedPRIValue + "]" : "")
           + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPulseValues} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
