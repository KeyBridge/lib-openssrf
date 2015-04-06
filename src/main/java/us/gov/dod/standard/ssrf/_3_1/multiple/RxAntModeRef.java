/* 
 * Copyright 2015 Key Bridge LLC.
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

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * RxAntModeRef contains references to the Antenna and its AntMode, used to
 * construct a Receiver Configuration.
 * <p>
 * Element of {@link RxRef}
 * <p>
 * Example:
 * <pre>
 * &lt;RxAntModeRef&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
 *   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
 * &lt;/RxAntModeRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxAntModeRef", propOrder = {
  "serial",
  "modeID",
  "couplingLoss"
})
@XmlSeeAlso({
  TxAntModeRef.class
})
public class RxAntModeRef {

  /**
   * Serial - Antenna Identifier (Required)    * <p>
   * The reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * ModeID - Antenna Mode Identifier (Optional)    * <p>
   * The unique name of an AntMode of the Antenna specified in the corresponding
   * Serial field. This antenna mode is grouped with the receiver modes
   * specified in RxModeRef.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = false)
  private S20 modeID;
  /**
   * CouplingLoss - Coupling Loss (Optional)    * <p>
   * The loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CouplingLoss", required = false)
  private dB couplingLoss;

  /**
   * Get the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAntenna()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAntenna(Antenna)} instead.
   */
  @Deprecated
  public void setSerial(Serial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getModeID() {
    return modeID;
  }

  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef..
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
   * Get the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getCouplingLoss() {
    return couplingLoss;
  }

  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setCouplingLoss(dB value) {
    this.couplingLoss = value;
  }

  /**
   * Determine if the CouplingLoss is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCouplingLoss() {
    return (this.couplingLoss != null ? this.couplingLoss.isSetValue() : false);
  }

  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current RxAntModeRef object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAntenna(Antenna)} instead.
   */
  @Deprecated
  public RxAntModeRef withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RxAntModeRef object instance.
   * @since 3.1.0
   */
  public RxAntModeRef withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxAntModeRef object instance.
   * @since 3.1.0
   */
  public RxAntModeRef withCouplingLoss(Double value) {
    setCouplingLoss(new dB(value));
    return this;
  }

  /**
   * Get a string representation of this RxAntModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  RxAntModeRef {"
           + (couplingLoss != null ? " couplingLoss [" + couplingLoss + "]" : "")
           + (modeID != null ? " modeID [" + modeID + "]" : "")
           + (serial != null ? " serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxAntModeRef} requires {@link Serial Serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * Serial - Antenna Identifier (Required)    * <p>
   * The reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Antenna antenna;

  /**
   * Get the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element..
   * <p>
   * @return a {@link Antenna} instance
   * @since 3.1.0
   */
  public Antenna getAntenna() {
    return antenna;
  }

  /**
   * Determine if the antenna field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntenna() {
    return this.antenna != null;
  }

  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @param value An instances of type {@link Antenna}.
   * @return The current RxAntModeRef object instance.
   * @since 3.1.0
   */
  public RxAntModeRef withAntenna(Antenna value) {
    this.antenna = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RxAntModeRef record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #antenna} field. This method should typically be called
   * after the RxAntModeRef is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.serial = antenna != null ? antenna.getSerial() : this.serial;
  }

  /**
   * Update the SSRF data type references in this RxAntModeRef record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #antenna} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the RxAntModeRef is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Antenna instance : root.getAntenna()) {
      if (serial.equals(instance.getSerial())) {
        antenna = instance;
        return;
      }
    }
  }//</editor-fold>

}
