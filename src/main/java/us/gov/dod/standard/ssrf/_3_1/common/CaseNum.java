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
package us.gov.dod.standard.ssrf._3_1.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

/**
 * CaseNum provides the capability to store multiple identifiers for a Dataset.
 * <p>
 * Element of {@link Common}, {@link Configuration}
 * <p>
 * Example:
 * <pre>
 * &lt;CaseNum&gt;
 *   &lt;Country cls="U"&gt;NLD&lt;/Country&gt;
 *   &lt;Identifier cls="U"&gt;JWID 2002&lt;/Identifier&gt;
 * &lt;/CaseNum&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNum", propOrder = {
  "country",
  "type",
  "identifier"
})
public class CaseNum {

  /**
   * Country - Country/Body issuing the case number (Optional)    * <p>
   * The nation or body who provided or assigned the case number.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Type - Case Number Type (Optional)    * <p>
   * A text identifying the type of case number (national file, exercise name,
   * etc).
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private S20 type;
  /**
   * Identifier - Case Number (Required)    * <p>
   * The case number.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Identifier", required = true)
  private S20 identifier;

  /**
   * Get the nation or body who provided or assigned the case number..
   * <p>
   * @return the Country value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the nation or body who provided or assigned the case number..
   * <p>
   * @param value the Country value in a {@link TString} data type
   * @since 3.1.0
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
   * Get a text identifying the type of case number (national file, exercise
   * name, etc)..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getType() {
    return type;
  }

  /**
   * Set a text identifying the type of case number (national file, exercise
   * name, etc)..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setType(S20 value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get the case number..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getIdentifier() {
    return identifier;
  }

  /**
   * Set the case number..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setIdentifier(S20 value) {
    this.identifier = value;
  }

  /**
   * Determine if the Identifier is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdentifier() {
    return (this.identifier != null ? this.identifier.isSetValue() : false);
  }

  /**
   * Set the nation or body who provided or assigned the case number.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current CaseNum object instance.
   * @since 3.1.0
   */
  public CaseNum withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set a text identifying the type of case number (national file, exercise
   * name, etc).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CaseNum object instance.
   * @since 3.1.0
   */
  public CaseNum withType(String value) {
    setType(new S20(value));
    return this;
  }

  /**
   * Set the case number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current CaseNum object instance.
   * @since 3.1.0
   */
  public CaseNum withIdentifier(String value) {
    setIdentifier(new S20(value));
    return this;
  }

  /**
   * Get a string representation of this CaseNum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CaseNum {"
           + (country != null ? "\n country [" + country + "]" : "")
           + (identifier != null ? "\n identifier [" + identifier + "]" : "")
           + (type != null ? "\n type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CaseNum} requires {@link S20 Identifier}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIdentifier();
  }

}
