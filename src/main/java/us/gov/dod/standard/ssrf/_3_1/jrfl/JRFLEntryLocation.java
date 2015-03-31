package us.gov.dod.standard.ssrf._3_1.jrfl;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * JRFLEntryLocation defines the location where the use of a specific frequency
 * or frequency range(s) is restricted in use.
 * <p>
 * Element of {@link JRFLEntry}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntryLocation", propOrder = {
  "serial",
  "antFeedpointHeight"
})
public class JRFLEntryLocation {

  /**
   * Serial - Location Reference (Required)    * <p>
   * The serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * AntFeedpointHeight - Antenna Feedpoint Height (Optional)    * <p>
   * The antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntFeedpointHeight", required = false)
  private Height_UN4 antFeedpointHeight;

  /**
   * Get the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
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
   * Get the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground..
   * <p>
   * @return a {@link Height_UN4} instance
   * @since 3.1.0
   */
  public Height_UN4 getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground..
   * <p>
   * @param value a {@link Height_UN4} instance
   * @since 3.1.0
   */
  public void setAntFeedpointHeight(Height_UN4 value) {
    this.antFeedpointHeight = value;
  }

  /**
   * Determine if the AntFeedpointHeight is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntFeedpointHeight() {
    return (this.antFeedpointHeight != null ? this.antFeedpointHeight.isSetValue() : false);
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current JRFLEntryLocation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public JRFLEntryLocation withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current JRFLEntryLocation object instance.
   * @since 3.1.0
   */
  public JRFLEntryLocation withAntFeedpointHeight(Integer value) {
    setAntFeedpointHeight(new Height_UN4(value));
    return this;
  }

  /**
   * Get a string representation of this JRFLEntryLocation instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JRFLEntryLocation {"
           + (antFeedpointHeight != null ? "\n antFeedpointHeight [" + antFeedpointHeight + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFLEntryLocation} requires {@link Serial Serial}.
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
   * Serial - Location Reference (Required)    * <p>
   * The serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location location;

  /**
   * Get the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Location} instance
   * @since 3.1.0
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Determine if the location field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocation() {
    return this.location != null;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Location}.
   * @return The current JRFLEntryLocation object instance.
   * @since 3.1.0
   */
  public JRFLEntryLocation withLocation(Location value) {
    this.location = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this JRFLEntryLocation record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #location} field. This method should typically be called
   * after the JRFLEntryLocation is configured and (optionally) before exporting
   * an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.serial = location != null ? location.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this JRFLEntryLocation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #location} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the JRFLEntryLocation is imported from XML. * @param root the SSRF
   * root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (serial.equals(instance.getSerial())) {
        location = instance;
        return;
      }
    }
  }//</editor-fold>

}
