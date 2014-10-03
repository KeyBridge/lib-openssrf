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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUOW;

/**
 * AsgnAllotOwner (US) contains the serial of the owning, or originating,
 * organisation.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnAllotOwner", propOrder = {
  "description",
  "ownerType",
  "ownerOrgRef"
})
public class AsgnAllotOwner {

  @XmlElement(name = "Description ", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS18.class)
  private TString description;
  @XmlElement(name = "OwnerType ", required = true)
  private TString ownerType;
  /**
   * US:OwnerOrgRef - Owner Organisation Serial (Optional)
   * <p>
   * The serial of the owning, or originating, organisation. This definitively
   * identifies the owning agency when there is a possibility that multiple
   * entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "OwnerOrgRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString ownerOrgRef;

  /**
   * Get the name of an individual or organization related to the frequency
   * assignment.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set the name of an individual or organization related to the frequency
   * assignment.
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
   * Get the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @return the OwnerType value in a {@link TString} data type
   */
  public TString getOwnerType() {
    return ownerType;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @param value the OwnerType value in a {@link TString} data type
   */
  public void setOwnerType(TString value) {
    this.ownerType = value;
  }

  /**
   * Determine if the OwnerType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerType() {
    return (this.ownerType != null ? this.ownerType.isSetValue() : false);
  }

  /**
   * Get the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * @return the OwnerOrgRef value in a {@link TString} data type
   */
  public TString getOwnerOrgRef() {
    return ownerOrgRef;
  }

  /**
   * Set the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * @param value the OwnerOrgRef value in a {@link TString} data type
   */
  public void setOwnerOrgRef(TString value) {
    this.ownerOrgRef = value;
  }

  /**
   * Determine if the OwnerOrgRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerOrgRef() {
    return (this.ownerOrgRef != null ? this.ownerOrgRef.isSetValue() : false);
  }

  /**
   * Set the name of an individual or organization related to the frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AsgnAllotOwner object instance
   */
  public AsgnAllotOwner withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link ListUOW}
   * @return The current AsgnAllotOwner object instance
   */
  public AsgnAllotOwner withOwnerType(ListUOW value) {
    setOwnerType(new TString(value.value()));
    return this;
  }

  /**
   * Set the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AsgnAllotOwner object instance
   */
  public AsgnAllotOwner withOwnerOrgRef(String value) {
    setOwnerOrgRef(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this AsgnAllotOwner instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AsgnAllotOwner {"
      + (ownerOrgRef != null ? " ownerOrgRef [" + ownerOrgRef + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (ownerType != null ? " ownerType [" + ownerType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnAllotOwner} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
