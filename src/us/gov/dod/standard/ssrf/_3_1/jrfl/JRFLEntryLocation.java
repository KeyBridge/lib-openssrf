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
package us.gov.dod.standard.ssrf._3_1.jrfl;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * JRFLEntryLocation defines the location where the use of a specific frequency
 * or frequency range(s) is restricted in use.
 * <p>
 * Element of {@link JRFLEntry}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntryLocation", propOrder = {
  "serial",
  "antFeedpointHeight"
})
public class JRFLEntryLocation {

  /**
   * Serial - Location Reference (Required)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * AntFeedpointHeight - Antenna Feedpoint Height (Optional)
   * <p>
   * The antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "AntFeedpointHeight", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterHEIGHT_UN4.class)
  private TInteger antFeedpointHeight;

  /**
   * Get the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
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
   * Get the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @return the AntFeedpointHeight value in a {@link TInteger} data type
   */
  public TInteger getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param value the AntFeedpointHeight value in a {@link TInteger} data type
   */
  public void setAntFeedpointHeight(TInteger value) {
    this.antFeedpointHeight = value;
  }

  /**
   * Determine if the AntFeedpointHeight is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
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
   * @param value An instances of type {@link String}
   * @return The current JRFLEntryLocation object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public JRFLEntryLocation withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current JRFLEntryLocation object instance
   */
  public JRFLEntryLocation withAntFeedpointHeight(Integer value) {
    setAntFeedpointHeight(new TInteger(value));
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
      + (antFeedpointHeight != null ? " antFeedpointHeight [" + antFeedpointHeight + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFLEntryLocation} requires {@link TString Serial}.
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
   * Serial - Location Reference (Required)
   * <p>
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
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
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
   * @param value An instances of type {@link Location}
   * @return The current JRFLEntryLocation object instance
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
   * @return The current JRFLEntryLocation object instance
   */
  public JRFLEntryLocation build() {
    this.serial = location != null ? location.getSerial() : null;
    return this;
  }//</editor-fold>

}
