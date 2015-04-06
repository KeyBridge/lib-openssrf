/* 
 * Copyright 2015 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf._3_1.Antenna;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS2;
import us.gov.dod.standard.ssrf._3_1.multiple.Notation;

/**
 * UsingCountries (US) describes the countries that manufacture (Producing),
 * supply (Source), and use (Using) the Antenna.
 * <p>
 * Element of
 * {@link Antenna}, {@link Notation}, {@link RFSystem}, {@link Receiver}, {@link Transmitter}
 * <p>
 * Example:
 * <pre>
 * &lt;UsingCountries&gt;
 *   &lt;CountryName cls="U"&gt;UZB&lt;/CountryName&gt;
 *   &lt;Role cls="U"&gt;Source&lt;/Role&gt;
 * &lt;/UsingCountries&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsingCountries", propOrder = {
  "countryName",
  "role"
})
public class UsingCountries {

  /**
   * US:CountryName - Country Name (Required)    * <p>
   * The designator for a specific country associated with the emitter that
   * transmits the subject Notation/Signal. Emitters commonly have more than one
   * user country associated with them.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CountryName", required = true)
  private TString countryName;
  /**
   * US:Role - Country Role (Optional)    * <p>
   * The role of the country associated with the emitter that transmits the
   * subject Notation/Signal.
   * <p>
   * Format is L:US2
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Role", required = false)
  private TString role;

  /**
   * Get the designator for a specific country associated with the emitter that
   * transmits the subject Notation/Signal. Emitters commonly have more than one
   * user country associated with them..
   * <p>
   * @return the CountryName value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCountryName() {
    return countryName;
  }

  /**
   * Set the designator for a specific country associated with the emitter that
   * transmits the subject Notation/Signal. Emitters commonly have more than one
   * user country associated with them..
   * <p>
   * @param value the CountryName value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCountryName(TString value) {
    this.countryName = value;
  }

  /**
   * Determine if the CountryName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountryName() {
    return (this.countryName != null ? this.countryName.isSetValue() : false);
  }

  /**
   * Get the role of the country associated with the emitter that transmits the
   * subject Notation/Signal..
   * <p>
   * @return the Role value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRole() {
    return role;
  }

  /**
   * Set the role of the country associated with the emitter that transmits the
   * subject Notation/Signal..
   * <p>
   * @param value the Role value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRole(TString value) {
    this.role = value;
  }

  /**
   * Determine if the Role is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRole() {
    return (this.role != null ? this.role.isSetValue() : false);
  }

  /**
   * Set the designator for a specific country associated with the emitter that
   * transmits the subject Notation/Signal. Emitters commonly have more than one
   * user country associated with them.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current UsingCountries object instance.
   * @since 3.1.0
   */
  public UsingCountries withCountryName(ListCAO value) {
    setCountryName(new TString(value.value()));
    return this;
  }

  /**
   * Set the role of the country associated with the emitter that transmits the
   * subject Notation/Signal.
   * <p>
   * @param value An instances of type {@link ListUS2}.
   * @return The current UsingCountries object instance.
   * @since 3.1.0
   */
  public UsingCountries withRole(ListUS2 value) {
    setRole(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this UsingCountries instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "UsingCountries {"
           + (countryName != null ? " countryName [" + countryName + "]" : "")
           + (role != null ? " role [" + role + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link UsingCountries} requires {@link TString CountryName}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCountryName();
  }

}
