package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxAntModeRef contains references to the Antenna and its AntMode, used to
 * construct a Transmitter Configuration.
 * <p>
 * Element of {@link TxRef}
 * <p>
 * Example:
 * <pre>
 * &lt;TxAntModeRef&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
 *   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
 *   &lt;SpectralPowerDensity cls="U"&gt;15&lt;/SpectralPowerDensity&gt;
 * &lt;/TxAntModeRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
  "spectralPowerDensity"
})
public class TxAntModeRef
        extends RxAntModeRef {

  /**
   * SpectralPowerDensity - Spectral Power Density (Optional)    * <p>
   * The maximum spectral power density supplied to the input of the antenna.
   * <p>
   * Format is SN(6,3) (dBW/Hz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpectralPowerDensity", required = false)
  private dBWHz spectralPowerDensity;

  /**
   * Get the maximum spectral power density supplied to the input of the
   * antenna..
   * <p>
   * @return a {@link dBWHz} instance
   * @since 3.1.0
   */
  public dBWHz getSpectralPowerDensity() {
    return spectralPowerDensity;
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna..
   * <p>
   * @param value a {@link dBWHz} instance
   * @since 3.1.0
   */
  public void setSpectralPowerDensity(dBWHz value) {
    this.spectralPowerDensity = value;
  }

  /**
   * Determine if the SpectralPowerDensity is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpectralPowerDensity() {
    return (this.spectralPowerDensity != null ? this.spectralPowerDensity.isSetValue() : false);
  }

  /**
   * Set the maximum spectral power density supplied to the input of the
   * antenna.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxAntModeRef object instance.
   * @since 3.1.0
   */
  public TxAntModeRef withSpectralPowerDensity(Double value) {
    setSpectralPowerDensity(new dBWHz(value));
    return this;
  }

  @Override
  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current TxAntModeRef object instance.
   * @since 3.1.0
   */
  public TxAntModeRef withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  @Override
  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the
   * transmitter modes specified in TxModeRef.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxAntModeRef object instance.
   * @since 3.1.0
   */
  public TxAntModeRef withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  @Override
  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxAntModeRef object instance.
   * @since 3.1.0
   */
  public TxAntModeRef withCouplingLoss(Double value) {
    setCouplingLoss(new dB(value));
    return this;
  }

  /**
   * Get a string representation of this TxAntModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxAntModeRef {"
           + (spectralPowerDensity != null ? "\n spectralPowerDensity [" + spectralPowerDensity + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxAntModeRef} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
