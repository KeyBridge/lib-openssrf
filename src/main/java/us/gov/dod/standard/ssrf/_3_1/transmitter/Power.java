package us.gov.dod.standard.ssrf._3_1.transmitter;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPT;

/**
 * Power identifies the transmitter RF power at the transmitter antenna port.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Power&gt;
 *   &lt;PowerMin cls="U"&gt;-3&lt;/PowerMin&gt;
 *   &lt;PowerMax cls="U"&gt;31.8&lt;/PowerMax&gt;
 *   &lt;PowerType cls="U"&gt;PEP&lt;/PowerType&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 * &lt;/Power&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Power", propOrder = {
  "powerMin",
  "powerMax",
  "powerType",
  "calculated"
})
public class Power {

  /**
   * PowerMin - Minimum or Nominal Power (Optional)    * <p>
   * The nominal transmitter power, or the minimum power in case of a range of
   * values.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerMin", required = false)
  private dBW powerMin;
  /**
   * PowerMax - Maximum Power (Optional)    * <p>
   * The maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerMax", required = false)
  private dBW powerMax;
  /**
   * PowerType - Power Type (Optional)    * <p>
   * The power type code for carrier, mean, or peak envelope power emitted. The
   * power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * Format is L:CPT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerType", required = false)
  private TString powerType;
  /**
   * Calculated - Calculated Data Indicator (Optional)    * <p>
   * "Yes" if the power value(s) have been calculated, or "No" if they have been
   * measured.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;

  /**
   * Get the nominal transmitter power, or the minimum power in case of a range
   * of values..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPowerMin() {
    return powerMin;
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPowerMin(dBW value) {
    this.powerMin = value;
  }

  /**
   * Determine if the PowerMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMin() {
    return (this.powerMin != null ? this.powerMin.isSetValue() : false);
  }

  /**
   * Get the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPowerMax() {
    return powerMax;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPowerMax(dBW value) {
    this.powerMax = value;
  }

  /**
   * Determine if the PowerMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerMax() {
    return (this.powerMax != null ? this.powerMax.isSetValue() : false);
  }

  /**
   * Get the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment..
   * <p>
   * @return the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment..
   * <p>
   * @param value the PowerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  /**
   * Determine if the PowerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerType() {
    return (this.powerType != null ? this.powerType.isSetValue() : false);
  }

  /**
   * Get "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured..
   * <p>
   * @return the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured..
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Set the nominal transmitter power, or the minimum power in case of a range
   * of values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Power object instance.
   * @since 3.1.0
   */
  public Power withPowerMin(Double value) {
    setPowerMin(new dBW(value));
    return this;
  }

  /**
   * Set the maximum transmitter power.
   * <p>
   * [XSL ERR MINMAX] If PowerMax is used, it MUST be greater than PowerMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Power object instance.
   * @since 3.1.0
   */
  public Power withPowerMax(Double value) {
    setPowerMax(new dBW(value));
    return this;
  }

  /**
   * Set the power type code for carrier, mean, or peak envelope power emitted.
   * The power type code will depend on the type of emission of the transmitter
   * equipment.
   * <p>
   * @param value An instances of type {@link ListCPT}.
   * @return The current Power object instance.
   * @since 3.1.0
   */
  public Power withPowerType(ListCPT value) {
    setPowerType(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if the power value(s) have been calculated, or "No" if they have
   * been measured.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Power object instance.
   * @since 3.1.0
   */
  public Power withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Power instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Power {"
           + (calculated != null ? " calculated [" + calculated + "]" : "")
           + (powerMax != null ? " powerMax [" + powerMax + "]" : "")
           + (powerMin != null ? " powerMin [" + powerMin + "]" : "")
           + (powerType != null ? " powerType [" + powerType + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Power} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
