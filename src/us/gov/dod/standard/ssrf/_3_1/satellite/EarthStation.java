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
package us.gov.dod.standard.ssrf._3_1.satellite;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.Satellite;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
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
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial locationRef;

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
  public TSerial getLocationRef() {
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
  public void setLocationRef(TSerial value) {
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
  public EarthStation withLocationRef(TSerial value) {
    setLocationRef(value);
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
   */
  public void prepare() {
    this.locationRef = location != null ? location.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this EarthStation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #location} with values from the
   * imported {@link #locationRef} field. This method should typically be called
   * after the EarthStation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (locationRef == null || !locationRef.isSetValue()) {
      return;
    }
    for (Location instance : root.getLocation()) {
      if (locationRef.equals(instance.getSerial())) {
        location = instance;
        return;
      }
    }
  }//</editor-fold>

}
