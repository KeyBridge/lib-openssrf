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
package us.gov.dod.standard.ssrf._3_1.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNum", propOrder = {
  "country",
  "type",
  "identifier"
})
public class CaseNum {

  /**
   * Country - Country/Body issuing the case number (Optional)
   * <p>
   * The nation or body who provided or assigned the case number.
   * <p>
   * Format is L:CAO
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Type - Case Number Type (Optional)
   * <p>
   * A text identifying the type of case number (national file, exercise name,
   * etc).
   * <p>
   * Format is S20
   */
  @XmlElement(name = "Type", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  /**
   * Identifier - Case Number (Required)
   * <p>
   * The case number.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "Identifier", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString identifier;

  /**
   * Get the nation or body who provided or assigned the case number.
   * <p>
   * @return the Country value in a {@link TString} data type
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the nation or body who provided or assigned the case number.
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
   * Get a text identifying the type of case number (national file, exercise
   * name, etc).
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set a text identifying the type of case number (national file, exercise
   * name, etc).
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
   * Get the case number.
   * <p>
   * @return the Identifier value in a {@link TString} data type
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Set the case number.
   * <p>
   * @param value the Identifier value in a {@link TString} data type
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  /**
   * Determine if the Identifier is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdentifier() {
    return (this.identifier != null ? this.identifier.isSetValue() : false);
  }

  /**
   * Set the nation or body who provided or assigned the case number.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current CaseNum object instance
   */
  public CaseNum withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set a text identifying the type of case number (national file, exercise
   * name, etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CaseNum object instance
   */
  public CaseNum withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set the case number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CaseNum object instance
   */
  public CaseNum withIdentifier(String value) {
    setIdentifier(new TString(value));
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
      + (type != null ? " type [" + type + "]" : "")
      + (identifier != null ? " identifier [" + identifier + "]" : "")
      + (country != null ? " country [" + country + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CaseNum} requires {@link TString Identifier}.
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
