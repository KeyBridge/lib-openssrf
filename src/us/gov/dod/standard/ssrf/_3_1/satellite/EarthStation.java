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
package us.gov.dod.standard.ssrf._3_1.satellite;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.Satellite;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEA;

/**
 * EarthStation contains the name and type of an earth station used in a
 * satellite network.
 * <p>
 * Element of {@link Satellite}
 * <p>
 * Example:
 * <pre>
 * &lt;EarthStation&gt;
 *   &lt;Name cls="U"&gt;Kessler&lt;/Name&gt;
 *   &lt;Type cls="U"&gt;Specific&lt;/Type&gt;
 * &lt;/EarthStation&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarthStation", propOrder = {
  "name",
  "type",
  "locationRef"
})
public class EarthStation {

  /**
   * Name - Station Name (Optional)
   * <p>
   * The name of an associated earth station.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  /**
   * Type - Station Type (Optional)
   * <p>
   * If this is a specific or typical earth station.
   * <p>
   * Format is L:CEA
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * LocationRef - Location Serial (Optional)
   * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "LocationRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locationRef;

  /**
   * Get the name of an associated earth station.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of an associated earth station.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get if this is a specific or typical earth station.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set if this is a specific or typical earth station.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the serial of the referenced Location.
   * <p>
   * @return the LocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public TString getLocationRef() {
    return locationRef;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value the LocationRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
   */
  @Deprecated
  public void setLocationRef(TString value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Set the name of an associated earth station.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EarthStation object instance
   */
  public EarthStation withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set if this is a specific or typical earth station.
   * <p>
   * @param value An instances of type {@link ListCEA}
   * @return The current EarthStation object instance
   */
  public EarthStation withType(ListCEA value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EarthStation object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public EarthStation withLocationRef(String value) {
    setLocationRef(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this EarthStation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EarthStation {"
      + (locationRef != null ? " locationRef [" + locationRef + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EarthStation} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocationRef - Location Serial (Optional)
   * <p>
   * The serial of the referenced Location.
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
   * @param value An instances of type {@link Location}
   * @return The current EarthStation object instance
   * @since 3.1.0
   */
  public EarthStation withLocation(Location value) {
    this.location = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this EarthStation record.
   * <p>
   * This method builds the exported {@link #locationRef} field with values from
   * the transient {@link #location} field. This method should typically be
   * called after the EarthStation is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @return The current EarthStation object instance
   */
  public EarthStation build() {
    this.locationRef = location != null ? location.getSerial() : null;
    return this;
  }//</editor-fold>

}
