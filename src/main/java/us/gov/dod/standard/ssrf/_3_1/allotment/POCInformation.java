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

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Station;
import us.gov.dod.standard.ssrf._3_1.jrfl.JRFLEntry;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCI;

/**
 * POCInformation contains a reference to a Contact, Organisation or Role
 * dataset.
 * <p>
 * Element of
 * {@link Allotment}, {@link Antenna}, {@link Assignment}, {@link ForceElement}, {@link IntfReport}, {@link JRFLEntry}, {@link Location}, {@link RFSystem}, {@link Receiver}, {@link SSRequest}, {@link Station}, {@link Transmitter}
 * <p>
 * Example:
 * <pre>
 * &lt;POCInformation&gt;
 *   &lt;Serial cls="U"&gt;USA:123:CN:98765&lt;/Serial&gt;
 *   &lt;Type cls="U"&gt;Project Engineer&lt;/Type&gt;
 *   &lt;Description cls="U"&gt;Bldg 120, Room 410&lt;/Description&gt;
 * &lt;/POCInformation&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCInformation", propOrder = {
  "type",
  "serial",
  "description"
})
public class POCInformation {

  /**
   * Type - POC Type (Required)    * <p>
   * The function of the referenced Contact or Organisation within the current
   * dataset.
   * <p>
   * Format is L:CCI
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Serial - Serial of Referenced dataset (Optional)    * <p>
   * The dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = false)
  private Serial serial;
  /**
   * Description - POC Description (Optional)    * <p>
   * Free text Contact information for legacy applications. When building new
   * records, enter the contact information in the structured Contact, Role, or
   * Organisation dataset.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private MEMO description;

  /**
   * Get the function of the referenced Contact or Organisation within the
   * current dataset..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the function of the referenced Contact or Organisation within the
   * current dataset..
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
   * Get the dataset identifier of the Contact, Organisation, or Role..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getPoc()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the dataset identifier of the Contact, Organisation, or Role..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setPoc(Common)} instead.
   */
  @Deprecated
  public void setSerial(Serial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getDescription() {
    return description;
  }

  /**
   * Set free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset..
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
   * Set the function of the referenced Contact or Organisation within the
   * current dataset.
   * <p>
   * @param value An instances of type {@link ListCCI}.
   * @return The current POCInformation object instance.
   * @since 3.1.0
   */
  public POCInformation withType(ListCCI value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current POCInformation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withPoc(Common)} instead.
   */
  @Deprecated
  public POCInformation withSerial(Serial value) {
    setSerial(value);
    return this;
  }

  /**
   * Set free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current POCInformation object instance.
   * @since 3.1.0
   */
  public POCInformation withDescription(String value) {
    setDescription(new MEMO(value));
    return this;
  }

  /**
   * Get a string representation of this POCInformation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "POCInformation {"
           + (description != null ? "\n description [" + description + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + (type != null ? "\n type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link POCInformation} requires {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * Serial - Serial of Referenced dataset (Optional)    * <p>
   * The dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Common<?> poc;

  /**
   * Get the dataset identifier of the Contact, Organisation, or Role..
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Common<?> getPoc() {
    return poc;
  }

  /**
   * Determine if the poc field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPoc() {
    return this.poc != null;
  }

  /**
   * Set the dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * @param value An instances of type {@link Common<?>}.
   * @return The current POCInformation object instance.
   * @since 3.1.0
   */
  public POCInformation withPoc(Common<?> value) {
    this.poc = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this POCInformation record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #poc} field. This method should typically be called after
   * the POCInformation is configured and (optionally) before exporting an SSRF
   * message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.serial = poc != null ? poc.getSerial() : this.serial;
  }

  /**
   * Update the SSRF data type references in this POCInformation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #poc} with values from the imported
   * {@link #serial} field. This method should typically be called after the
   * POCInformation is imported from XML. * @param root the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Contact instance : root.getContact()) {
      if (serial.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
    for (Organisation instance : root.getOrganisation()) {
      if (serial.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
    for (Role instance : root.getRole()) {
      if (serial.equals(instance.getSerial())) {
        poc = instance;
        return;
      }
    }
  }//</editor-fold>

}
