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
package us.gov.dod.standard.ssrf._3_1.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.Role;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * TelephoneFax reflects the telephone and/or telefax number(s) of the Contact,
 * Organisation or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;TelephoneFax&gt;
 *   &lt;Type cls="U"&gt;TEL-Civil&lt;/Type&gt;
 *   &lt;Number cls="U"&gt;(202)281-3824x1234&lt;/Number&gt;
 * &lt;/TelephoneFax&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneFax", propOrder = {
  "preferred",
  "type",
  "fax",
  "maxCls",
  "number"
})
public class TelephoneFax {

  /**
   * Preferred - Preferred Number (Optional)
   * <p>
   * A code "Yes" for the preferred number(s) and a code "No" for the others.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Preferred", required = false)
  private TString preferred;
  /**
   * Type - System or Network (Optional)
   * <p>
   * The name of the network on which this number can be dialed (e.g., DSN,
   * IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "Type", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  /**
   * Fax - Telefax Indicator (Optional)
   * <p>
   * "Yes" if the number is for a telefax. If this item is empty, it SHOULD be
   * considered as "No".
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Fax", required = false)
  private TString fax;
  /**
   * MaxCls - System Maximum Classification (Optional)
   * <p>
   * The highest classification that can be used on the network. Note for the
   * USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * Format is L:CCL
   */
  @XmlElement(name = "MaxCls", required = false)
  private TString maxCls;
  /**
   * Number - Tel or Fax Number (Required)
   * <p>
   * The area code, telephone/telefax number (including the extension if
   * necessary) of individual or contact organisation.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Number", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString number;

  /**
   * Get a code "Yes" for the preferred number(s) and a code "No" for the
   * others.
   * <p>
   * @return the Preferred value in a {@link TString} data type
   */
  public TString getPreferred() {
    return preferred;
  }

  /**
   * Set a code "Yes" for the preferred number(s) and a code "No" for the
   * others.
   * <p>
   * @param value the Preferred value in a {@link TString} data type
   */
  public void setPreferred(TString value) {
    this.preferred = value;
  }

  /**
   * Determine if the Preferred is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPreferred() {
    return (this.preferred != null ? this.preferred.isSetValue() : false);
  }

  /**
   * Get the name of the network on which this number can be dialed (e.g., DSN,
   * IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the name of the network on which this number can be dialed (e.g., DSN,
   * IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.
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
   * Get "Yes" if the number is for a telefax. If this item is empty, it SHOULD
   * be considered as "No".
   * <p>
   * @return the Fax value in a {@link TString} data type
   */
  public TString getFax() {
    return fax;
  }

  /**
   * Set "Yes" if the number is for a telefax. If this item is empty, it SHOULD
   * be considered as "No".
   * <p>
   * @param value the Fax value in a {@link TString} data type
   */
  public void setFax(TString value) {
    this.fax = value;
  }

  /**
   * Determine if the Fax is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFax() {
    return (this.fax != null ? this.fax.isSetValue() : false);
  }

  /**
   * Get the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * @return the MaxCls value in a {@link TString} data type
   */
  public TString getMaxCls() {
    return maxCls;
  }

  /**
   * Set the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * @param value the MaxCls value in a {@link TString} data type
   */
  public void setMaxCls(TString value) {
    this.maxCls = value;
  }

  /**
   * Determine if the MaxCls is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxCls() {
    return (this.maxCls != null ? this.maxCls.isSetValue() : false);
  }

  /**
   * Get the area code, telephone/telefax number (including the extension if
   * necessary) of individual or contact organisation.
   * <p>
   * @return the Number value in a {@link TString} data type
   */
  public TString getNumber() {
    return number;
  }

  /**
   * Set the area code, telephone/telefax number (including the extension if
   * necessary) of individual or contact organisation.
   * <p>
   * @param value the Number value in a {@link TString} data type
   */
  public void setNumber(TString value) {
    this.number = value;
  }

  /**
   * Determine if the Number is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumber() {
    return (this.number != null ? this.number.isSetValue() : false);
  }

  /**
   * Set a code "Yes" for the preferred number(s) and a code "No" for the
   * others.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TelephoneFax object instance
   */
  public TelephoneFax withPreferred(ListCBO value) {
    setPreferred(new TString(value.value()));
    return this;
  }

  /**
   * Set the name of the network on which this number can be dialed (e.g., DSN,
   * IVSN, CORMORANT). Use "PUBLIC" for normal public telephone or GSM.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   */
  public TelephoneFax withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set "Yes" if the number is for a telefax. If this item is empty, it SHOULD
   * be considered as "No".
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TelephoneFax object instance
   */
  public TelephoneFax withFax(ListCBO value) {
    setFax(new TString(value.value()));
    return this;
  }

  /**
   * Set the highest classification that can be used on the network. Note for
   * the USA: The letter "R" MUST NOT be used in USA created datasets.
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current TelephoneFax object instance
   */
  public TelephoneFax withMaxCls(ListCCL value) {
    setMaxCls(new TString(value.value()));
    return this;
  }

  /**
   * Set the area code, telephone/telefax number (including the extension if
   * necessary) of individual or contact organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TelephoneFax object instance
   */
  public TelephoneFax withNumber(String value) {
    setNumber(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this TelephoneFax instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TelephoneFax {"
      + (maxCls != null ? " maxCls [" + maxCls + "]" : "")
      + (fax != null ? " fax [" + fax + "]" : "")
      + (number != null ? " number [" + number + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (preferred != null ? " preferred [" + preferred + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TelephoneFax} requires {@link TString Number}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumber();
  }

}
