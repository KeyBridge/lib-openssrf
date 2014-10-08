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
package us.gov.dod.standard.ssrf._3_1.forceelement;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Assets indicates the authorised and available quantity of the equipment, RF
 * systems, or other Force Elements used or owned by the Force Element.
 * <p>
 * Element of {@link ForceElement}
 * <p>
 * Example:
 * <pre>
 * &lt;Assets&gt;
 *   &lt;Serial cls="U"&gt;USA:AF:FE:123&lt;/Serial&gt;
 *   &lt;Authorised cls="U"&gt;10&lt;/Authorised&gt;
 *   &lt;Available cls="U"&gt;5&lt;/Available&gt;
 * &lt;/Assets&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", propOrder = {
  "serial",
  "authorised",
  "available"
})
public class Assets {

  /**
   * Serial - Equipment/FE Reference (Required)
   * <p>
   * A reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * Authorised - Authorised Quantity (Optional)
   * <p>
   * The authorised quantity of the referenced equipment or system.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "Authorised", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger authorised;
  /**
   * Available - Available Quantity (Optional)
   * <p>
   * The available quantity of the referenced equipment or system.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "Available", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger available;

  /**
   * Get a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAsset()} instead.
   */
  @Deprecated
  public TString getSerial() {
    return serial;
  }

  /**
   * Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAsset(Common)} instead.
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
   * Get the authorised quantity of the referenced equipment or system.
   * <p>
   * @return the Authorised value in a {@link TInteger} data type
   */
  public TInteger getAuthorised() {
    return authorised;
  }

  /**
   * Set the authorised quantity of the referenced equipment or system.
   * <p>
   * @param value the Authorised value in a {@link TInteger} data type
   */
  public void setAuthorised(TInteger value) {
    this.authorised = value;
  }

  /**
   * Determine if the Authorised is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAuthorised() {
    return (this.authorised != null ? this.authorised.isSetValue() : false);
  }

  /**
   * Get the available quantity of the referenced equipment or system.
   * <p>
   * @return the Available value in a {@link TInteger} data type
   */
  public TInteger getAvailable() {
    return available;
  }

  /**
   * Set the available quantity of the referenced equipment or system.
   * <p>
   * @param value the Available value in a {@link TInteger} data type
   */
  public void setAvailable(TInteger value) {
    this.available = value;
  }

  /**
   * Determine if the Available is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvailable() {
    return (this.available != null ? this.available.isSetValue() : false);
  }

  /**
   * Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Assets object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAsset(Common)} instead.
   */
  @Deprecated
  public Assets withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set the authorised quantity of the referenced equipment or system.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assets object instance
   */
  public Assets withAuthorised(Integer value) {
    setAuthorised(new TInteger(value));
    return this;
  }

  /**
   * Set the available quantity of the referenced equipment or system.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Assets object instance
   */
  public Assets withAvailable(Integer value) {
    setAvailable(new TInteger(value));
    return this;
  }

  /**
   * Get a string representation of this Assets instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Assets {"
      + (available != null ? " available [" + available + "]" : "")
      + (authorised != null ? " authorised [" + authorised + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Assets} requires {@link TString Serial}.
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
   * Serial - Equipment/FE Reference (Required)
   * <p>
   * A reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> asset;

  /**
   * Get a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getAsset() {
    return asset;
  }

  /**
   * Determine if the asset field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAsset() {
    return this.asset != null;
  }

  /**
   * Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * @param value An instances of type {@link Common<?>}
   * @return The current Assets object instance
   * @since 3.1.0
   */
  public Assets withAsset(Common<?> value) {
    this.asset = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this Assets record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #asset} field. This method should typically be called
   * after the Assets is configured and (optionally) before exporting an SSRF
   * message.
   */
  public void prepare() {
    this.serial = asset != null ? asset.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this Assets record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #asset} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the Assets is imported from XML.
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
        asset = instance;
        return;
      }
    }
    for (Receiver instance : root.getReceiver()) {
      if (serial.equals(instance.getSerial())) {
        asset = instance;
        return;
      }
    }
    for (Antenna instance : root.getAntenna()) {
      if (serial.equals(instance.getSerial())) {
        asset = instance;
        return;
      }
    }
    for (RFSystem instance : root.getRFSystem()) {
      if (serial.equals(instance.getSerial())) {
        asset = instance;
        return;
      }
    }
  }//</editor-fold>

}
