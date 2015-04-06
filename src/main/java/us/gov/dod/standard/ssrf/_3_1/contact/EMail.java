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
package us.gov.dod.standard.ssrf._3_1.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.Role;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Email contains the email address of the Contact or Role.
 * <p>
 * Element of {@link Contact}, {@link Organisation}, {@link Role}
 * <p>
 * Example:
 * <pre>
 * &lt;EMail&gt;
 *   &lt;Preferred cls="U"&gt;Yes&lt;/Preferred&gt;
 *   &lt;Type cls="U"&gt;Internet&lt;/Type&gt;
 *   &lt;MaxCls cls="U"&gt;U&lt;/MaxCls&gt;
 *   &lt;Address&gt;john.doe@abc.com&lt;/Address&gt;
 * &lt;/EMail&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMail", propOrder = {
  "preferred",
  "type",
  "maxCls",
  "address"
})
public class EMail {

  /**
   * Preferred - Preferred Address (Optional)    * <p>
   * A code "Yes" for the preferred address(es) and a code "No" for the others.
   * Automated tools SHOULD send all mails to this Contact to all its preferred
   * addresses.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Preferred", required = false)
  private TString preferred;
  /**
   * Type - System or Network (Optional)    * <p>
   * The type of network hosting the e-mail address.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private S20 type;
  /**
   * MaxCls - System Maximum Classification (Optional)    * <p>
   * The highest classification that can be used for the email address.
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxCls", required = false)
  private TString maxCls;
  /**
   * Address - Email Address (Required)    * <p>
   * The e-mail address.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Address", required = true)
  private S255 address;

  /**
   * Get a code "Yes" for the preferred address(es) and a code "No" for the
   * others. Automated tools SHOULD send all mails to this Contact to all its
   * preferred addresses..
   * <p>
   * @return the Preferred value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPreferred() {
    return preferred;
  }

  /**
   * Set a code "Yes" for the preferred address(es) and a code "No" for the
   * others. Automated tools SHOULD send all mails to this Contact to all its
   * preferred addresses..
   * <p>
   * @param value the Preferred value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the type of network hosting the e-mail address..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getType() {
    return type;
  }

  /**
   * Set the type of network hosting the e-mail address..
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
   * Get the highest classification that can be used for the email address..
   * <p>
   * @return the MaxCls value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMaxCls() {
    return maxCls;
  }

  /**
   * Set the highest classification that can be used for the email address..
   * <p>
   * @param value the MaxCls value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the e-mail address..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getAddress() {
    return address;
  }

  /**
   * Set the e-mail address..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setAddress(S255 value) {
    this.address = value;
  }

  /**
   * Determine if the Address is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAddress() {
    return (this.address != null ? this.address.isSetValue() : false);
  }

  /**
   * Set a code "Yes" for the preferred address(es) and a code "No" for the
   * others. Automated tools SHOULD send all mails to this Contact to all its
   * preferred addresses.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current EMail object instance.
   * @since 3.1.0
   */
  public EMail withPreferred(ListCBO value) {
    setPreferred(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of network hosting the e-mail address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EMail object instance.
   * @since 3.1.0
   */
  public EMail withType(String value) {
    setType(new S20(value));
    return this;
  }

  /**
   * Set the highest classification that can be used for the email address.
   * <p>
   * @param value An instances of type {@link ListCCL}.
   * @return The current EMail object instance.
   * @since 3.1.0
   */
  public EMail withMaxCls(ListCCL value) {
    setMaxCls(new TString(value.value()));
    return this;
  }

  /**
   * Set the e-mail address.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EMail object instance.
   * @since 3.1.0
   */
  public EMail withAddress(String value) {
    setAddress(new S255(value));
    return this;
  }

  /**
   * Get a string representation of this EMail instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  EMail {"
           + (address != null ? " address [" + address + "]" : "")
           + (maxCls != null ? " maxCls [" + maxCls + "]" : "")
           + (preferred != null ? " preferred [" + preferred + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EMail} requires {@link S255 Address}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAddress();
  }

}
