/* 
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

/**
 * Manufacturer contains the manufacturer name of the equipment listed in the
 * corresponding data entry in data element Nomenclature. Additionally the
 * country in which the equipment is manufactured may be included.
 * <p>
 * Element of {@link Nomenclature}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manufacturer", propOrder = {
  "country",
  "name"
})
public class Manufacturer {

  /**
   * Country - Country/Area (Optional)
   * <p>
   * The country or area in which the Manufacturer has its Headquarters.
   * <p>
   * Format is L:CAO
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Name - Manufacturer Name (Required)
   * <p>
   * The name of the company that manufactured the equipment.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString name;

  /**
   * Get the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @return the Country value in a {@link TString} data type
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @param value the Country value in a {@link TString} data type
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return (this.country != null ? this.country.isSetValue() : false);
  }

  /**
   * Get the name of the company that manufactured the equipment.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of the company that manufactured the equipment.
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
   * Set the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current Manufacturer object instance
   */
  public Manufacturer withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the name of the company that manufactured the equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Manufacturer object instance
   */
  public Manufacturer withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Manufacturer instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Manufacturer {"
      + (name != null ? " name [" + name + "]" : "")
      + (country != null ? " country [" + country + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Manufacturer} requires {@link TString Name}.
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
