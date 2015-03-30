package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCNU;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS5;

/**
 * Nomenclature identifies either the standard military, government,
 * nomenclature or the commercial model number of an equipment. Each device or
 * group of devices may have several types of nomenclatures, e.g. both a
 * military nomenclature and a commercial model number.
 * <p>
 * Element of
 * {@link Antenna}, {@link ForceElement}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link Satellite}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link Manufacturer}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomenclature", propOrder = {
  "type",
  "level",
  "name",
  "physicalUsage",
  "manufacturer"
})
public class Nomenclature {

  /**
   * Type - Type (Optional)    * <p>
   * The type of nomenclature (commercial, military, etc).
   * <p>
   * Format is L:CTO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Level - Level (Optional)    * <p>
   * The level of nomenclature (primary, nickname, etc).
   * <p>
   * Format is L:CNU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Level", required = false)
  private TString level;
  /**
   * Name - Name (Required)    * <p>
   * The standard military nomenclature. If the unit does not have a military
   * nomenclature, enter the manufacturer model number, or a short description.
   * <p>
   * Format is S100
   * <p>
   * Divergence from SMADEF: When exchanging data with NATO Antennas must
   * contain at least one Nomenclature
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S100 name;
  /**
   * In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PhysicalUsage", required = false)
  private TString physicalUsage;
  /**
   * Manufacturer (Optional)
   * <p>
   * Manufacturer contains the manufacturer name of the equipment listed in the
   * corresponding data entry in data element Nomenclature. Additionally the
   * country in which the equipment is manufactured may be included.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Manufacturer")
  private Set<Manufacturer> manufacturer;

  /**
   * Get the type of nomenclature (commercial, military, etc)..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc)..
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
   * Get the level of nomenclature (primary, nickname, etc)..
   * <p>
   * @return the Level value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLevel() {
    return level;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc)..
   * <p>
   * @param value the Level value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setLevel(TString value) {
    this.level = value;
  }

  /**
   * Determine if the Level is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLevel() {
    return (this.level != null ? this.level.isSetValue() : false);
  }

  /**
   * Get the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
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
   * Get In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates..
   * <p>
   * @return the PhysicalUsage value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPhysicalUsage() {
    return physicalUsage;
  }

  /**
   * Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates..
   * <p>
   * @param value the PhysicalUsage value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPhysicalUsage(TString value) {
    this.physicalUsage = value;
  }

  /**
   * Determine if the PhysicalUsage is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPhysicalUsage() {
    return (this.physicalUsage != null ? this.physicalUsage.isSetValue() : false);
  }

  /**
   * Get the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included..
   * <p>
   * @return a {@link Manufacturer} instance
   * @since 3.1.0
   */
  public Set<Manufacturer> getManufacturer() {
    if (manufacturer == null) {
      manufacturer = new HashSet<>();
    }
    return this.manufacturer;
  }

  /**
   * Determine if the Manufacturer is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetManufacturer() {
    return ((this.manufacturer != null) && (!this.manufacturer.isEmpty()));
  }

  /**
   * Clear the Manufacturer field. This sets the field to null.
   */
  public void unsetManufacturer() {
    this.manufacturer = null;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
   * <p>
   * @param value An instances of type {@link ListCTO}.
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withType(ListCTO value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value An instances of type {@link ListCNU}.
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withLevel(ListCNU value) {
    setLevel(new TString(value.value()));
    return this;
  }

  /**
   * Set the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   * <p>
   * @param value An instances of type {@link ListUS5}.
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withPhysicalUsage(ListUS5 value) {
    setPhysicalUsage(new TString(value.value()));
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values One or more instances of type {@link Manufacturer...}.
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Manufacturer... values) {
    if (values != null) {
      getManufacturer().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Manufacturer
   * <p>
   * Complex element Manufacturer contains the manufacturer name of the
   * equipment listed in the corresponding data entry in data element
   * Nomenclature. Additionally the country in which the equipment is
   * manufactured may be included.
   * <p>
   * @param values A collection of {@link Manufacturer} instances
   * @return The current Nomenclature object instance.
   * @since 3.1.0
   */
  public Nomenclature withManufacturer(Collection<Manufacturer> values) {
    if (values != null) {
      getManufacturer().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Nomenclature instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Nomenclature {"
           + (level != null ? " level [" + level + "]" : "")
           + (manufacturer != null ? " manufacturer [" + manufacturer + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (physicalUsage != null ? " physicalUsage [" + physicalUsage + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Nomenclature} requires {@link S100 Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName();
  }

}
