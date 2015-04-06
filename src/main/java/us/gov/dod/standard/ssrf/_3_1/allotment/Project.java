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
package us.gov.dod.standard.ssrf._3_1.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.FEDeployment;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.jrfl.JRFLEntry;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPJ;

/**
 * Project provides the Project, OPLAN, COMPLAN or Exercise name, or any other
 * project name associated to the dataset.
 * <p>
 * Element of
 * {@link Allotment}, {@link Assignment}, {@link FEDeployment}, {@link JRFLEntry}, {@link SSRequest}
 * <p>
 * Example:
 * <pre>
 * &lt;Project&gt;
 *   &lt;Type cls="U"&gt;Exercise&lt;/Type&gt;
 *   &lt;Name cls="U"&gt;JWID 2002&lt;/Name&gt;
 *   &lt;Description cls="U"&gt;This is a good project.&lt;/Description&gt;
 * &lt;/Project&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
  "type",
  "name",
  "description"
})
public class Project {

  /**
   * Type - Project Type (Optional)    * <p>
   * The type of project.
   * <p>
   * Format is L:CPJ
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Name - Project Name (Required)    * <p>
   * The name of the project.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S30 name;
  /**
   * Description - Description (Optional)    * <p>
   * Any additional amplifying information about the project.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private MEMO description;

  /**
   * Get the type of project..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of project..
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
   * Get the name of the project..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getName() {
    return name;
  }

  /**
   * Set the name of the project..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setName(S30 value) {
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
   * Get any additional amplifying information about the project..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getDescription() {
    return description;
  }

  /**
   * Set any additional amplifying information about the project..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setDescription(MEMO value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Set the type of project.
   * <p>
   * @param value An instances of type {@link ListCPJ}.
   * @return The current Project object instance.
   * @since 3.1.0
   */
  public Project withType(ListCPJ value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the name of the project.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Project object instance.
   * @since 3.1.0
   */
  public Project withName(String value) {
    setName(new S30(value));
    return this;
  }

  /**
   * Set any additional amplifying information about the project.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Project object instance.
   * @since 3.1.0
   */
  public Project withDescription(String value) {
    setDescription(new MEMO(value));
    return this;
  }

  /**
   * Get a string representation of this Project instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Project {"
           + (description != null ? " description [" + description + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Project} requires {@link S30 Name}.
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
