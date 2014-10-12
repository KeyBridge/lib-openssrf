/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.Antenna;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   * Serial - Antenna Identifier (Required)
   * <p>
   * The reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * ModeID - Antenna Mode Identifier (Optional)
   * <p>
   * The unique name of an AntMode of the Antenna specified in the corresponding
   * Serial field. This antenna mode is grouped with the receiver modes
   * specified in RxModeRef.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "ModeID", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * CouplingLoss - Coupling Loss (Optional)
   * <p>
   * The loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * Format is SN(6,3) (dB)
   */
  @XmlElement(name = "CouplingLoss", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal couplingLoss;

  /**
   * Get the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAntenna()} instead.
   */
  @Deprecated
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the reference to an Antenna in this configuration. This antenna is
   * associated with the receiver specified in the Serial field of the parent
   * RxRef element.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAntenna(Antenna)} instead.
   */
  @Deprecated
  public void setSerial(TString value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef.
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
   * Get the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @return the CouplingLoss value in a {@link TDecimal} data type
   */
  public TDecimal getCouplingLoss() {
    return couplingLoss;
  }

  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @param value the CouplingLoss value in a {@link TDecimal} data type
   */
  public void setCouplingLoss(TDecimal value) {
    this.couplingLoss = value;
  }

  /**
   * Determine if the CouplingLoss is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * @param value An instances of type {@link String}
   * @return The current RxAntModeRef object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAntenna(Antenna)} instead.
   */
  @Deprecated
  public RxAntModeRef withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set the unique name of an AntMode of the Antenna specified in the
   * corresponding Serial field. This antenna mode is grouped with the receiver
   * modes specified in RxModeRef.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxAntModeRef object instance
   */
  public RxAntModeRef withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set the loss that occurs when energy is transferred between the
   * transmitter/receiver and the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxAntModeRef object instance
   */
  public RxAntModeRef withCouplingLoss(Double value) {
    setCouplingLoss(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this RxAntModeRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxAntModeRef {"
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (couplingLoss != null ? " couplingLoss [" + couplingLoss + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxAntModeRef} requires {@link TString Serial}.
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
   * Serial - Antenna Identifier (Required)
   * <p>
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
   * RxRef element.
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
   * @param value An instances of type {@link Antenna}
   * @return The current RxAntModeRef object instance
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
   */
  public void prepare() {
    this.serial = antenna != null ? antenna.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RxAntModeRef record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #antenna} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the RxAntModeRef is imported from XML.
   * <p>
   * @param root the SSRF root instance
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
