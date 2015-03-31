package us.gov.dod.standard.ssrf._3_1.forceelement;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", propOrder = {
  "serial",
  "authorised",
  "available"
})
public class Assets {

  /**
   * Serial - Equipment/FE Reference (Required)    * <p>
   * A reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * Authorised - Authorised Quantity (Optional)    * <p>
   * The authorised quantity of the referenced equipment or system.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Authorised", required = false)
  private UN9 authorised;
  /**
   * Available - Available Quantity (Optional)    * <p>
   * The available quantity of the referenced equipment or system.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Available", required = false)
  private UN9 available;

  /**
   * Get a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getAsset()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set a reference to a Transmitter, Receiver, Antenna, RFSystem used by this
   * ForceElement, or to a ForceElement carried by or belonging to this
   * ForceElement..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setAsset(Common)} instead.
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
   * Get the authorised quantity of the referenced equipment or system..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getAuthorised() {
    return authorised;
  }

  /**
   * Set the authorised quantity of the referenced equipment or system..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setAuthorised(UN9 value) {
    this.authorised = value;
  }

  /**
   * Determine if the Authorised is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAuthorised() {
    return (this.authorised != null ? this.authorised.isSetValue() : false);
  }

  /**
   * Get the available quantity of the referenced equipment or system..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getAvailable() {
    return available;
  }

  /**
   * Set the available quantity of the referenced equipment or system..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setAvailable(UN9 value) {
    this.available = value;
  }

  /**
   * Determine if the Available is configured.
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
   * @param value An instances of type {@link Serial}.
   * @return The current Assets object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withAsset(Common)} instead.
   */
  @Deprecated
  public Assets withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the authorised quantity of the referenced equipment or system.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Assets object instance.
   * @since 3.1.0
   */
  public Assets withAuthorised(Integer value) {
    setAuthorised(new UN9(value));
    return this;
  }

  /**
   * Set the available quantity of the referenced equipment or system.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Assets object instance.
   * @since 3.1.0
   */
  public Assets withAvailable(Integer value) {
    setAvailable(new UN9(value));
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
           + (authorised != null ? "\n authorised [" + authorised + "]" : "")
           + (available != null ? "\n available [" + available + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Assets} requires {@link Serial Serial}.
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
   * Serial - Equipment/FE Reference (Required)    * <p>
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
   * ForceElement..
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
   * @param value An instances of type {@link Common<?>}.
   * @return The current Assets object instance.
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
   * <p>
   * @since 3.1.0
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
   * after the Assets is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
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
