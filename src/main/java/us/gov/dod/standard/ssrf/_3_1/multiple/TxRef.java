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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * TxRef contains the reference of a Transmitter, and optionnally some of its
 * TxModes and the associated Antennas and AntMode.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Elements are {@link TxAntModeRef}, {@link TxModeRef}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxRef", propOrder = {
  "serial",
  "txModeRef",
  "txAntModeRef"
})
public class TxRef {

  /**
   * Serial - Transmitter Serial (Required)
   * <p>
   * The serial of a Transmitter in this configuration. The same transmitter can
   * be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial serial;
  /**
   * TxModeRef (Optional)
   * <p>
   * TxModeRef contains references to the Transmitter and its modes, used to
   * construct a Configuration.
   * <p>
   * Notes: TxModeRef specifies a transmitter mode that i
   */
  @XmlElement(name = "TxModeRef")
  private Set<TxModeRef> txModeRef;
  /**
   * TxAntModeRef (Optional)
   * <p>
   * TxAntModeRef contains references to the Antenna and its AntMode, used to
   * construct a Transmitter Configuration.
   * <p>
   * Notes: AntModeRef specifies an antenna mode that is
   */
  @XmlElement(name = "TxAntModeRef")
  private Set<TxAntModeRef> txAntModeRef;

  /**
   * Get the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getTransmitter()} instead.
   */
  @Deprecated
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Set the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setTransmitter(Transmitter)} instead.
   */
  @Deprecated
  public void setSerial(TSerial value) {
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
   * Get the TxModeRef
   * <p>
   * Complex element TxModeRef contains references to the Transmitter and its
   * modes, used to construct a Configuration.
   * <p>
   * @return a non-null but possibly empty list of {@link TxModeRef} instances
   */
  public Set<TxModeRef> getTxModeRef() {
    if (txModeRef == null) {
      txModeRef = new HashSet<>();
    }
    return this.txModeRef;
  }

  /**
   * Determine if the TxModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxModeRef() {
    return ((this.txModeRef != null) && (!this.txModeRef.isEmpty()));
  }

  /**
   * Clear the TxModeRef field. This sets the field to null.
   */
  public void unsetTxModeRef() {
    this.txModeRef = null;
  }

  /**
   * Get the TxAntModeRef
   * <p>
   * Complex element TxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Transmitter Configuration.
   * <p>
   * @return a non-null but possibly empty list of {@link TxAntModeRef}
   *         instances
   */
  public Set<TxAntModeRef> getTxAntModeRef() {
    if (txAntModeRef == null) {
      txAntModeRef = new HashSet<>();
    }
    return this.txAntModeRef;
  }

  /**
   * Determine if the TxAntModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxAntModeRef() {
    return ((this.txAntModeRef != null) && (!this.txAntModeRef.isEmpty()));
  }

  /**
   * Clear the TxAntModeRef field. This sets the field to null.
   */
  public void unsetTxAntModeRef() {
    this.txAntModeRef = null;
  }

  /**
   * Set the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxRef object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withTransmitter(Transmitter)} instead.
   */
  @Deprecated
  public TxRef withSerial(TSerial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the TxModeRef
   * <p>
   * Complex element TxModeRef contains references to the Transmitter and its
   * modes, used to construct a Configuration.
   * <p>
   * @param values One or more instances of type {@link TxModeRef}
   * @return The current TxRef object instance
   */
  public TxRef withTxModeRef(TxModeRef... values) {
    if (values != null) {
      getTxModeRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the TxModeRef
   * <p>
   * Complex element TxModeRef contains references to the Transmitter and its
   * modes, used to construct a Configuration.
   * <p>
   * @param values A collection of {@link TxModeRef} instances
   * @return The current TxRef object instance
   */
  public TxRef withTxModeRef(Set<TxModeRef> values) {
    if (values != null) {
      getTxModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxAntModeRef
   * <p>
   * Complex element TxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Transmitter Configuration.
   * <p>
   * @param values One or more instances of type {@link TxAntModeRef}
   * @return The current TxRef object instance
   */
  public TxRef withTxAntModeRef(TxAntModeRef... values) {
    if (values != null) {
      getTxAntModeRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the TxAntModeRef
   * <p>
   * Complex element TxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Transmitter Configuration.
   * <p>
   * @param values A collection of {@link TxAntModeRef} instances
   * @return The current TxRef object instance
   */
  public TxRef withTxAntModeRef(Set<TxAntModeRef> values) {
    if (values != null) {
      getTxAntModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TxRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TxRef {"
      + (txAntModeRef != null ? " txAntModeRef [" + txAntModeRef + "]" : "")
      + (txModeRef != null ? " txModeRef [" + txModeRef + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxRef} requires {@link TString Serial}.
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
   * Serial - Transmitter Serial (Required)
   * <p>
   * The serial of a Transmitter in this configuration. The same transmitter can
   * be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Transmitter transmitter;

  /**
   * Get the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @return the serial value in a {@link Transmitter} data type
   * @since 3.1.0
   */
  public Transmitter getTransmitter() {
    return transmitter;
  }

  /**
   * Determine if the transmitter field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTransmitter() {
    return this.transmitter != null;
  }

  /**
   * Set the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @param value An instances of type {@link Transmitter}
   * @return The current TxRef object instance
   * @since 3.1.0
   */
  public TxRef withTransmitter(Transmitter value) {
    this.transmitter = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this TxRef record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #transmitter} field. This method should typically be
   * called after the TxRef is configured and (optionally) before exporting an
   * SSRF message.
   */
  public void prepare() {
    this.serial = transmitter != null ? transmitter.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this TxRef record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #transmitter} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the TxRef is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Transmitter instance : root.getTransmitter()) {
      if (serial.equals(instance.getSerial())) {
        transmitter = instance;
        return;
      }
    }
  }//</editor-fold>

}
