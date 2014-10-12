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
package us.gov.dod.standard.ssrf._3_1.administrative;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Code contains the information necessary to create or modify a code entry in
 * the given code list.
 * <p>
 * Element of {@link CodeList}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", propOrder = {
  "value",
  "description"
})
public class Code {

  /**
   * Value - Code Value (Required)
   * <p>
   * The unique code entry within the code list.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Value", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString value;
  /**
   * Description, the long text name of the code entry or a brief description of
   * the entry to be created or modified.
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS255.class)
  private TString description;

  /**
   * Get the unique code entry within the code list.
   * <p>
   * @return the Value value in a {@link TString} data type
   */
  public TString getValue() {
    return value;
  }

  /**
   * Set the unique code entry within the code list.
   * <p>
   * @param value the Value value in a {@link TString} data type
   */
  public void setValue(TString value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null ? this.value.isSetValue() : false);
  }

  /**
   * Get Description, the long text name of the code entry or a brief
   * description of the entry to be created or modified.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set Description, the long text name of the code entry or a brief
   * description of the entry to be created or modified.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Set the unique code entry within the code list.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Code object instance
   */
  public Code withValue(String value) {
    setValue(new TString(value));
    return this;
  }

  /**
   * Set Description, the long text name of the code entry or a brief
   * description of the entry to be created or modified.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Code object instance
   */
  public Code withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this Code instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Code {"
      + (description != null ? " description [" + description + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Code} requires {@link TString Value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetValue();
  }

}
