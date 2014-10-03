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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * TxModeRef (Optional)
   * <p>
   * TxModeRef contains references to the Transmitter and its modes, used to
   * construct a Configuration.
   * <p>
   * Notes: TxModeRef specifies a transmitter mode that i
   */
  @XmlElement(name = "TxModeRef")
  private List<TxModeRef> txModeRef;
  /**
   * TxAntModeRef (Optional)
   * <p>
   * TxAntModeRef contains references to the Antenna and its AntMode, used to
   * construct a Transmitter Configuration.
   * <p>
   * Notes: AntModeRef specifies an antenna mode that is
   */
  @XmlElement(name = "TxAntModeRef")
  private List<TxAntModeRef> txAntModeRef;

  /**
   * Get the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the serial of a Transmitter in this configuration. The same transmitter
   * can be referenced in different TxRef elements in order to properly group
   * transmitter modes with antenna modes.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   */
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
   * Get the TxModeRef
   * <p>
   * Complex element TxModeRef contains references to the Transmitter and its
   * modes, used to construct a Configuration.
   * <p>
   * @return a non-null but possibly empty list of {@link TxModeRef} instances
   */
  public List<TxModeRef> getTxModeRef() {
    if (txModeRef == null) {
      txModeRef = new ArrayList<>();
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
   * @return a non-null but possibly empty list of {@link TxAntModeRef} instances
   */
  public List<TxAntModeRef> getTxAntModeRef() {
    if (txAntModeRef == null) {
      txAntModeRef = new ArrayList<>();
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
   */
  public TxRef withSerial(String value) {
    setSerial(new TString(value));
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
      getTxModeRef().addAll(Arrays.asList(values));
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
  public TxRef withTxModeRef(Collection<TxModeRef> values) {
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
      getTxAntModeRef().addAll(Arrays.asList(values));
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
  public TxRef withTxAntModeRef(Collection<TxAntModeRef> values) {
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
      + " txAntModeRef [" + txAntModeRef + "]"
      + " txModeRef [" + txModeRef + "]"
      + " serial [" + serial + "]"
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

}
