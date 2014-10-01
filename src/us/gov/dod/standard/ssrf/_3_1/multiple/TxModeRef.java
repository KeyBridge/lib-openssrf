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
package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "PowerLimit", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
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
      + " modeID [" + modeID + "]"
      + " powerLimit [" + powerLimit + "]"
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
