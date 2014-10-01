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
 * RxRef contains the reference of a Receiver, and optionnally some of its
 * RxModes and the associated Antennas and AntMode.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Elements are {@link RxAntModeRef}, {@link RxModeRef}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxRef", propOrder = {
  "serial",
  "rxModeRef",
  "rxAntModeRef"
})
public class RxRef {

  /**
   * Serial - Receiver Serial (Required)
   * <p>
   * The identifier of the related Receiver used in this configuration. The same
   * receiver can be referenced in different RxRef elements in order to properly
   * group receiver modes with antenna modes.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * RxModeRef (Optional)
   * <p>
   * RxModeRef references a RxMode of the receiver used in a specific
   * configuration.
   */
  @XmlElement(name = "RxModeRef", nillable = true)
  private List<RxModeRef> rxModeRef;
  /**
   * RxAntModeRef (Optional)
   * <p>
   * RxAntModeRef contains references to the Antenna and its AntMode, used to
   * construct a Receiver Configuration.
   */
  @XmlElement(name = "RxAntModeRef")
  private List<RxAntModeRef> rxAntModeRef;

  /**
   * Get the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes.
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
   * Get the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration.
   * <p>
   * @return a {@link List<RxModeRef>} instance
   */
  public List<RxModeRef> getRxModeRef() {
    if (rxModeRef == null) {
      rxModeRef = new ArrayList<>();
    }
    return this.rxModeRef;
  }

  /**
   * Determine if the RxModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxModeRef() {
    return ((this.rxModeRef != null) && (!this.rxModeRef.isEmpty()));
  }

  /**
   * Clear the RxModeRef field. This sets the field to null.
   */
  public void unsetRxModeRef() {
    this.rxModeRef = null;
  }

  /**
   * Get the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration.
   * <p>
   * @return a {@link List<RxAntModeRef>} instance
   */
  public List<RxAntModeRef> getRxAntModeRef() {
    if (rxAntModeRef == null) {
      rxAntModeRef = new ArrayList<>();
    }
    return this.rxAntModeRef;
  }

  /**
   * Determine if the RxAntModeRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxAntModeRef() {
    return ((this.rxAntModeRef != null) && (!this.rxAntModeRef.isEmpty()));
  }

  /**
   * Clear the RxAntModeRef field. This sets the field to null.
   */
  public void unsetRxAntModeRef() {
    this.rxAntModeRef = null;
  }

  /**
   * Set the identifier of the related Receiver used in this configuration. The
   * same receiver can be referenced in different RxRef elements in order to
   * properly group receiver modes with antenna modes.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxRef object instance
   */
  public RxRef withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration.
   * <p>
   * @param values One or more instances of type {@link RxModeRef...}
   * @return The current RxRef object instance
   */
  public RxRef withRxModeRef(RxModeRef... values) {
    if (values != null) {
      getRxModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxModeRef
   * <p>
   * Complex element RxModeRef references a RxMode of the receiver used in a
   * specific configuration.
   * <p>
   * @param values A collection of {@link RxModeRef} instances
   * @return The current RxRef object instance
   */
  public RxRef withRxModeRef(Collection<RxModeRef> values) {
    if (values != null) {
      getRxModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration.
   * <p>
   * @param values One or more instances of type {@link RxAntModeRef...}
   * @return The current RxRef object instance
   */
  public RxRef withRxAntModeRef(RxAntModeRef... values) {
    if (values != null) {
      getRxAntModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxAntModeRef
   * <p>
   * Complex element RxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Receiver Configuration.
   * <p>
   * @param values A collection of {@link RxAntModeRef} instances
   * @return The current RxRef object instance
   */
  public RxRef withRxAntModeRef(Collection<RxAntModeRef> values) {
    if (values != null) {
      getRxAntModeRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RxRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxRef {"
      + " rxModeRef [" + rxModeRef + "]"
      + " serial [" + serial + "]"
      + " rxAntModeRef [" + rxAntModeRef + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxRef} requires {@link TString Serial}.
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
