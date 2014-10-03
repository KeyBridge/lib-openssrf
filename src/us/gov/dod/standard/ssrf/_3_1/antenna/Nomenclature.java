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
package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * Type - Type (Optional)
   * <p>
   * The type of nomenclature (commercial, military, etc).
   * <p>
   * Format is L:CTO
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Level - Level (Optional)
   * <p>
   * The level of nomenclature (primary, nickname, etc).
   * <p>
   * Format is L:CNU
   */
  @XmlElement(name = "Level", required = false)
  private TString level;
  /**
   * Name - Name (Required)
   * <p>
   * The standard military nomenclature. If the unit does not have a military
   * nomenclature, enter the manufacturer model number, or a short description.
   * <p>
   * Format is S100
   * <p>
   * Divergence from SMADEF: When exchanging data with NATO Antennas must
   * contain at least one Nomenclature
   */
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   */
  @XmlElement(name = "PhysicalUsage", required = false)
  private TString physicalUsage;
  /**
   * Manufacturer (Optional)
   * <p>
   * Manufacturer contains the manufacturer name of the equipment listed in the
   * corresponding data entry in data element Nomenclature. Additionally the
   * country in which the equipment is manufactured may be included.
   */
  @XmlElement(name = "Manufacturer")
  private List<Manufacturer> manufacturer;

  /**
   * Get the type of nomenclature (commercial, military, etc).
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of nomenclature (commercial, military, etc).
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
   * Get the level of nomenclature (primary, nickname, etc).
   * <p>
   * @return the Level value in a {@link TString} data type
   */
  public TString getLevel() {
    return level;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value the Level value in a {@link TString} data type
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
   * description.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the standard military nomenclature. If the unit does not have a
   * military nomenclature, enter the manufacturer model number, or a short
   * description.
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
   * Get In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   * <p>
   * @return the PhysicalUsage value in a {@link TString} data type
   */
  public TString getPhysicalUsage() {
    return physicalUsage;
  }

  /**
   * Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   * <p>
   * @param value the PhysicalUsage value in a {@link TString} data type
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
   * manufactured may be included.
   * <p>
   * @return a non-null but possibly empty list of {@link Manufacturer}
   *         instances
   */
  public List<Manufacturer> getManufacturer() {
    if (manufacturer == null) {
      manufacturer = new ArrayList<>();
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
   * @param value An instances of type {@link ListCTO}
   * @return The current Nomenclature object instance
   */
  public Nomenclature withType(ListCTO value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the level of nomenclature (primary, nickname, etc).
   * <p>
   * @param value An instances of type {@link ListCNU}
   * @return The current Nomenclature object instance
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
   * @param value An instances of type {@link String}
   * @return The current Nomenclature object instance
   */
  public Nomenclature withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set In Data Item PhysicalUsage (US), indicate the type of vehicle or other
   * entity that uses the equipment, or from which the subject signal emanates.
   * <p>
   * @param value An instances of type {@link ListUS5}
   * @return The current Nomenclature object instance
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
   * @param values One or more instances of type {@link Manufacturer}
   * @return The current Nomenclature object instance
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
   * @return The current Nomenclature object instance
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
      + (physicalUsage != null ? " physicalUsage [" + physicalUsage + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Nomenclature} requires {@link TString Name}.
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
