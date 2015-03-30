package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedPolarisationValues (US) contains data describing the parametric
 * information for the polarization tilt angle specific values.
 * <p>
 * Element of {@link ObservedPolarisationAnalysis}
 * <p>
 * Example: See {@link ObservedPolarisationAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPolarisationValues", propOrder = {
  "statisticalIndicator",
  "tiltAngleValue"
})
public class ObservedPolarisationValues {

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
   * US:TiltAngleValue - Tilt Angle Value (Optional)    * <p>
   * The observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleValue", required = false)
  private US_Deg_Signed tiltAngleValue;

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
   * Get the observed Tilt Angle which provided the base data set used for
   * statistical study..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleValue() {
    return tiltAngleValue;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleValue(US_Deg_Signed value) {
    this.tiltAngleValue = value;
  }

  /**
   * Determine if the TiltAngleValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleValue() {
    return (this.tiltAngleValue != null ? this.tiltAngleValue.isSetValue() : false);
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was collected (e.g., 95% of the observed values). If this
   * element is empty, then the value is assumed to be part of the 100% sample.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationValues object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new US_Percent3(value));
    return this;
  }

  /**
   * Set the observed Tilt Angle which provided the base data set used for
   * statistical study.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationValues object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationValues withTiltAngleValue(Double value) {
    setTiltAngleValue(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedPolarisationValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedPolarisationValues {"
           + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
           + (tiltAngleValue != null ? " tiltAngleValue [" + tiltAngleValue + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPolarisationValues} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
