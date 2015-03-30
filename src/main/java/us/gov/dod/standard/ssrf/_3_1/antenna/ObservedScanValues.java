package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedScanValues (US) contains data describing the discrete scan rate
 * values and supporting statistical information.
 * <p>
 * Element of {@link ObservedScanAnalysis}
 * <p>
 * Example: See {@link ObservedScanAnalysis}.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedScanValues", propOrder = {
  "scanValue",
  "statisticalIndicator"
})
public class ObservedScanValues {

  /**
   * US:ScanValue - Observed Scan Values (Optional)    * <p>
   * The observed scan rate values    * <p>
   * Format is UN(6,2) (deg/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ScanValue", required = false)
  private US_ScanSpeed scanValue;
  /**
   * In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StatisticalIndicator", required = false)
  private Percent statisticalIndicator;

  /**
   * Get the observed scan rate values .
   * <p>
   * @return a {@link US_ScanSpeed} instance
   * @since 3.1.0
   */
  public US_ScanSpeed getScanValue() {
    return scanValue;
  }

  /**
   * Set the observed scan rate values .
   * <p>
   * @param value a {@link US_ScanSpeed} instance
   * @since 3.1.0
   */
  public void setScanValue(US_ScanSpeed value) {
    this.scanValue = value;
  }

  /**
   * Determine if the ScanValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanValue() {
    return (this.scanValue != null ? this.scanValue.isSetValue() : false);
  }

  /**
   * Get In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size..
   * <p>
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getStatisticalIndicator() {
    return statisticalIndicator;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size..
   * <p>
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setStatisticalIndicator(Percent value) {
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
   * Set the observed scan rate values    * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedScanValues object instance.
   * @since 3.1.0
   */
  public ObservedScanValues withScanValue(Double value) {
    setScanValue(new US_ScanSpeed(value));
    return this;
  }

  /**
   * Set In Data Item StatisticalIndicator (US), indicate how this specific data
   * observation was used (e.g., 95% of the observed values). If this element is
   * empty, then the value is assumed to be part of the 100% sample size.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedScanValues object instance.
   * @since 3.1.0
   */
  public ObservedScanValues withStatisticalIndicator(Double value) {
    setStatisticalIndicator(new Percent(value));
    return this;
  }

  /**
   * Get a string representation of this ObservedScanValues instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedScanValues {"
           + (scanValue != null ? " scanValue [" + scanValue + "]" : "")
           + (statisticalIndicator != null ? " statisticalIndicator [" + statisticalIndicator + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedScanValues} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
