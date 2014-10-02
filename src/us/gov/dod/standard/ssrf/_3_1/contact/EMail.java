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
package us.gov.dod.standard.ssrf._3_1.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.Role;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * Preferred - Preferred Address (Optional)
   * <p>
   * A code "Yes" for the preferred address(es) and a code "No" for the others.
   * Automated tools SHOULD send all mails to this Contact to all its preferred
   * addresses.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Preferred", required = false)
  private TString preferred;
  /**
   * Type - System or Network (Optional)
   * <p>
   * The type of network hosting the e-mail address.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  /**
   * MaxCls - System Maximum Classification (Optional)
   * <p>
   * The highest classification that can be used for the email address.
   * <p>
   * Format is L:CCL
   */
  @XmlElement(name = "MaxCls", required = false)
  private TString maxCls;
  /**
   * Address - Email Address (Required)
   * <p>
   * The e-mail address.
   * <p>
   * Format is S255
   */
  @XmlElement(name = "Address", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString address;

  /**
   * Get a code "Yes" for the preferred address(es) and a code "No" for the
   * others. Automated tools SHOULD send all mails to this Contact to all its
   * preferred addresses.
   * <p>
   * @return the Preferred value in a {@link TString} data type
   */
  public TString getPreferred() {
    return preferred;
  }

  /**
   * Set a code "Yes" for the preferred address(es) and a code "No" for the
   * others. Automated tools SHOULD send all mails to this Contact to all its
   * preferred addresses.
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
   * Get the type of network hosting the e-mail address.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of network hosting the e-mail address.
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
   * Get the highest classification that can be used for the email address.
   * <p>
   * @return the MaxCls value in a {@link TString} data type
   */
  public TString getMaxCls() {
    return maxCls;
  }

  /**
   * Set the highest classification that can be used for the email address.
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
   * Get the e-mail address.
   * <p>
   * @return the Address value in a {@link TString} data type
   */
  public TString getAddress() {
    return address;
  }

  /**
   * Set the e-mail address.
   * <p>
   * @param value the Address value in a {@link TString} data type
   */
  public void setAddress(TString value) {
    this.address = value;
  }

  /**
   * Determine if the Address is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * @param value An instances of type {@link ListCBO}
   * @return The current EMail object instance
   */
  public EMail withPreferred(ListCBO value) {
    setPreferred(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of network hosting the e-mail address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EMail object instance
   */
  public EMail withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Set the highest classification that can be used for the email address.
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current EMail object instance
   */
  public EMail withMaxCls(ListCCL value) {
    setMaxCls(new TString(value.value()));
    return this;
  }

  /**
   * Set the e-mail address.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EMail object instance
   */
  public EMail withAddress(String value) {
    setAddress(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this EMail instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EMail {"
      + " maxCls [" + maxCls + "]"
      + " address [" + address + "]"
      + " type [" + type + "]"
      + " preferred [" + preferred + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EMail Email} requires {@link TString Address}.
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
