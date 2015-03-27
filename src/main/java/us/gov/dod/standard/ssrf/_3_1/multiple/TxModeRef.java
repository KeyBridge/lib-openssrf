/* 
 * Copyright 2014 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModeRef", propOrder = {
  "modeID",
  "powerLimit"
})
public class TxModeRef {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * The unique identifier of a TxMode of the transmitter in this configuration.
   * This mode is from the transmitter specified in the Serial field of the
   * parent TxRef element.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "PowerLimit", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerLimit;

  /**
   * Get the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @param value the ModeID value in a {@link TString} data type
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get the power limit of this transmitter mode when in this configuration.
   * <p>
   * @return the PowerLimit value in a {@link TDecimal} data type
   */
  public TDecimal getPowerLimit() {
    return powerLimit;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param value the PowerLimit value in a {@link TDecimal} data type
   */
  public void setPowerLimit(TDecimal value) {
    this.powerLimit = value;
  }

  /**
   * Determine if the PowerLimit is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * @param value An instances of type {@link String}
   * @return The current TxModeRef object instance
   */
  public TxModeRef withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxModeRef object instance
   */
  public TxModeRef withPowerLimit(Double value) {
    setPowerLimit(new TDecimal(value));
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
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (powerLimit != null ? " powerLimit [" + powerLimit + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxModeRef} requires {@link TString ModeID}.
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
