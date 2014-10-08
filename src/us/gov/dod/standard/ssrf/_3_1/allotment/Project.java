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
package us.gov.dod.standard.ssrf._3_1.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
  "type",
  "name",
  "description"
})
public class Project {

  /**
   * Type - Project Type (Optional)
   * <p>
   * The type of project.
   * <p>
   * Format is L:CPJ
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Name - Project Name (Required)
   * <p>
   * The name of the project.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "Name", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString name;
  /**
   * Description - Description (Optional)
   * <p>
   * Any additional amplifying information about the project.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString description;

  /**
   * Get the type of project.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of project.
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
   * Get the name of the project.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name of the project.
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
   * Get any additional amplifying information about the project.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set any additional amplifying information about the project.
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
   * Set the type of project.
   * <p>
   * @param value An instances of type {@link ListCPJ}
   * @return The current Project object instance
   */
  public Project withType(ListCPJ value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the name of the project.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Project object instance
   */
  public Project withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set any additional amplifying information about the project.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Project object instance
   */
  public Project withDescription(String value) {
    setDescription(new TString(value));
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
   * {@link Project} requires {@link TString Name}.
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
