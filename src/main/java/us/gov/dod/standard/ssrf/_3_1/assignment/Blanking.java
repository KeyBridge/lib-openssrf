package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Blanking contains the start and stop angles of a horizontal and/or vertical
 * sector that is blanked.
 * <p>
 * Element of {@link StationConfig}
 * <p>
 * Example:
 * <pre>
 * &lt;Blanking&gt;
 *   &lt;AzStart cls="U"&gt;25&lt;/AzStart&gt;
 *   &lt;AzStop cls="U"&gt;35&lt;/AzStop&gt;
 * &lt;/Blanking&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Blanking", propOrder = {
  "azStart",
  "azStop",
  "elevStart",
  "elevStop"
})
public class Blanking {

  /**
   * AzStart - Start Azimuth (Optional)    * <p>
   * The start azimuth angle for the blanked sector. Use "0" or "360" for true
   * north.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AzStart", required = false)
  private Az azStart;
  /**
   * AzStop - Stop Azimuth (Optional)    * <p>
   * The stop azimuth angle for the blanked sector. Use "0" or "360" for true
   * north.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AzStop", required = false)
  private Az azStop;
  /**
   * ElevStart - Start Elevation (Optional)    * <p>
   * The start elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ElevStart", required = false)
  private Elev elevStart;
  /**
   * ElevStop - Stop Elevation (Optional)    * <p>
   * The stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ElevStop", required = false)
  private Elev elevStop;

  /**
   * Get the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north..
   * <p>
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getAzStart() {
    return azStart;
  }

  /**
   * Set the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north..
   * <p>
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setAzStart(Az value) {
    this.azStart = value;
  }

  /**
   * Determine if the AzStart is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzStart() {
    return (this.azStart != null ? this.azStart.isSetValue() : false);
  }

  /**
   * Get the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north..
   * <p>
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getAzStop() {
    return azStop;
  }

  /**
   * Set the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north..
   * <p>
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setAzStop(Az value) {
    this.azStop = value;
  }

  /**
   * Determine if the AzStop is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzStop() {
    return (this.azStop != null ? this.azStop.isSetValue() : false);
  }

  /**
   * Get the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead..
   * <p>
   * @return a {@link Elev} instance
   * @since 3.1.0
   */
  public Elev getElevStart() {
    return elevStart;
  }

  /**
   * Set the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead..
   * <p>
   * @param value a {@link Elev} instance
   * @since 3.1.0
   */
  public void setElevStart(Elev value) {
    this.elevStart = value;
  }

  /**
   * Determine if the ElevStart is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevStart() {
    return (this.elevStart != null ? this.elevStart.isSetValue() : false);
  }

  /**
   * Get the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead..
   * <p>
   * @return a {@link Elev} instance
   * @since 3.1.0
   */
  public Elev getElevStop() {
    return elevStop;
  }

  /**
   * Set the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead..
   * <p>
   * @param value a {@link Elev} instance
   * @since 3.1.0
   */
  public void setElevStop(Elev value) {
    this.elevStop = value;
  }

  /**
   * Determine if the ElevStop is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevStop() {
    return (this.elevStop != null ? this.elevStop.isSetValue() : false);
  }

  /**
   * Set the start azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Blanking object instance.
   * @since 3.1.0
   */
  public Blanking withAzStart(Double value) {
    setAzStart(new Az(value));
    return this;
  }

  /**
   * Set the stop azimuth angle for the blanked sector. Use "0" or "360" for
   * true north.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Blanking object instance.
   * @since 3.1.0
   */
  public Blanking withAzStop(Double value) {
    setAzStop(new Az(value));
    return this;
  }

  /**
   * Set the start elevation angle for the blanked sector. Use "-90" for
   * straight down and "90" for directly overhead.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Blanking object instance.
   * @since 3.1.0
   */
  public Blanking withElevStart(Double value) {
    setElevStart(new Elev(value));
    return this;
  }

  /**
   * Set the stop elevation angle for the blanked sector. Use "-90" for straight
   * down and "90" for directly overhead.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Blanking object instance.
   * @since 3.1.0
   */
  public Blanking withElevStop(Double value) {
    setElevStop(new Elev(value));
    return this;
  }

  /**
   * Get a string representation of this Blanking instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Blanking {"
           + (azStart != null ? "\n azStart [" + azStart + "]" : "")
           + (azStop != null ? "\n azStop [" + azStop + "]" : "")
           + (elevStart != null ? "\n elevStart [" + elevStart + "]" : "")
           + (elevStop != null ? "\n elevStop [" + elevStop + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Blanking} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
