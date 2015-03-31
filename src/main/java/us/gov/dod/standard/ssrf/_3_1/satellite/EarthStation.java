package us.gov.dod.standard.ssrf._3_1.satellite;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarthStation", propOrder = {
  "name",
  "type",
  "locationRef"
})
public class EarthStation {

  /**
   * Name - Station Name (Optional)    * <p>
   * The name of an associated earth station.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S50 name;
  /**
   * Type - Station Type (Optional)    * <p>
   * If this is a specific or typical earth station.
   * <p>
   * Format is L:CEA
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * LocationRef - Location Serial (Optional)    * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocationRef", required = false)
  private Serial locationRef;

  /**
   * Get the name of an associated earth station..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getName() {
    return name;
  }

  /**
   * Set the name of an associated earth station..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setName(S50 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get if this is a specific or typical earth station..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set if this is a specific or typical earth station..
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the serial of the referenced Location..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLocation()} instead.
   */
  @Deprecated
  public Serial getLocationRef() {
    return locationRef;
  }

  /**
   * Set the serial of the referenced Location..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLocation(Location)} instead.
   */
  @Deprecated
  public void setLocationRef(Serial value) {
    this.locationRef = value;
  }

  /**
   * Determine if the LocationRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocationRef() {
    return (this.locationRef != null ? this.locationRef.isSetValue() : false);
  }

  /**
   * Set the name of an associated earth station.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EarthStation object instance.
   * @since 3.1.0
   */
  public EarthStation withName(String value) {
    setName(new S50(value));
    return this;
  }

  /**
   * Set if this is a specific or typical earth station.
   * <p>
   * @param value An instances of type {@link ListCEA}.
   * @return The current EarthStation object instance.
   * @since 3.1.0
   */
  public EarthStation withType(ListCEA value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of the referenced Location.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current EarthStation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLocation(Location)} instead.
   */
  @Deprecated
  public EarthStation withLocationRef(Serial value) {
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
           + (locationRef != null ? "\n locationRef [" + locationRef + "]" : "")
           + (name != null ? "\n name [" + name + "]" : "")
           + (type != null ? "\n type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EarthStation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * LocationRef - Location Serial (Optional)    * <p>
   * The serial of the referenced Location.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Location location;

  /**
   * Get the serial of the referenced Location..
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
   * @param value An instances of type {@link Location}.
   * @return The current EarthStation object instance.
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
   * @since 3.1.0
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
   * after the EarthStation is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
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
