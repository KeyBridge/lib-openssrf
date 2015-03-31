package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxModeRef contains references to the Transmitter and its modes, used to
 * construct a Configuration.
 * <p>
 * Element of {@link TxRef}
 * <p>
 * Example:
 * <pre>
 * &lt;TxModeRef&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:TX:123&lt;/Serial&gt;
 *   &lt;ModeID cls="U"&gt;CLEAR VOICE H. POWER&lt;/ModeID&gt;
 * &lt;/TxModeRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModeRef", propOrder = {
  "modeID",
  "powerLimit"
})
public class TxModeRef {

  /**
   * ModeID - Mode Identifier (Required)    * <p>
   * The unique identifier of a TxMode of the transmitter in this configuration.
   * This mode is from the transmitter specified in the Serial field of the
   * parent TxRef element.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = true)
  private S20 modeID;
  /**
   * PowerLimit - Power Limit (Optional)    * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PowerLimit", required = false)
  private dBW powerLimit;

  /**
   * Get the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getModeID() {
    return modeID;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setModeID(S20 value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get the power limit of this transmitter mode when in this configuration..
   * <p>
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPowerLimit() {
    return powerLimit;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration..
   * <p>
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPowerLimit(dBW value) {
    this.powerLimit = value;
  }

  /**
   * Determine if the PowerLimit is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPowerLimit() {
    return (this.powerLimit != null ? this.powerLimit.isSetValue() : false);
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxModeRef object instance.
   * @since 3.1.0
   */
  public TxModeRef withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxModeRef object instance.
   * @since 3.1.0
   */
  public TxModeRef withPowerLimit(Double value) {
    setPowerLimit(new dBW(value));
    return this;
  }

  /**
   * Get a string representation of this TxModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxModeRef {"
           + (modeID != null ? "\n modeID [" + modeID + "]" : "")
           + (powerLimit != null ? "\n powerLimit [" + powerLimit + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxModeRef} requires {@link S20 ModeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetModeID();
  }

}
