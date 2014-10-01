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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCInformation", propOrder = {
  "type",
  "serial",
  "description"
})
public class POCInformation {

  /**
   * Type - POC Type (Required)
   * <p>
   * The function of the referenced Contact or Organisation within the current
   * dataset.
   * <p>
   * Format is L:CCI
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Serial - Serial of Referenced dataset (Optional)
   * <p>
   * The dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * Description - POC Description (Optional)
   * <p>
   * Free text Contact information for legacy applications. When building new
   * records, enter the contact information in the structured Contact, Role, or
   * Organisation dataset.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString description;

  /**
   * Get the function of the referenced Contact or Organisation within the
   * current dataset.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the function of the referenced Contact or Organisation within the
   * current dataset.
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
   * Get the dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset.
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
   * Set the function of the referenced Contact or Organisation within the
   * current dataset.
   * <p>
   * @param value An instances of type {@link ListCCI}
   * @return The current POCInformation object instance
   */
  public POCInformation withType(ListCCI value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the dataset identifier of the Contact, Organisation, or Role.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current POCInformation object instance
   */
  public POCInformation withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Set free text Contact information for legacy applications. When building
   * new records, enter the contact information in the structured Contact, Role,
   * or Organisation dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current POCInformation object instance
   */
  public POCInformation withDescription(String value) {
    setDescription(new TString(value));
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
      + " description [" + description + "]"
      + " type [" + type + "]"
      + " serial [" + serial + "]"
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

}
