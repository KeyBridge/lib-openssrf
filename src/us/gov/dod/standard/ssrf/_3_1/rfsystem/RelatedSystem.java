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
package us.gov.dod.standard.ssrf._3_1.rfsystem;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFR;

/**
 * RelatedSystem identifies a System linked to the current System, and the
 * relation (parent, child, sibling).
 * <p>
 * Element of {@link RFSystem}
 * <p>
 * Example:
 * <pre>
 * &lt;RelatedSystem&gt;
 *   &lt;Relation cls="U"&gt;HasChild&lt;/Relation&gt;
 *   &lt;Serial cls="U"&gt;USA:AR:TR:05008827&lt;/Serial&gt;
 * &lt;/RelatedSystem&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSystem", propOrder = {
  "relation",
  "serial"
})
public class RelatedSystem {

  /**
   * Relation - Relation Type (Required)
   * <p>
   * The relationship between the two systems.
   * <p>
   * Format is L:CFR
   */
  @XmlElement(name = "Relation", required = true)
  private TString relation;
  /**
   * Serial - Related System Serial (Required)
   * <p>
   * The reference of the System associated with the current System.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;

  /**
   * Get the relationship between the two systems.
   * <p>
   * @return the Relation value in a {@link TString} data type
   */
  public TString getRelation() {
    return relation;
  }

  /**
   * Set the relationship between the two systems.
   * <p>
   * @param value the Relation value in a {@link TString} data type
   */
  public void setRelation(TString value) {
    this.relation = value;
  }

  /**
   * Determine if the Relation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelation() {
    return (this.relation != null ? this.relation.isSetValue() : false);
  }

  /**
   * Get the reference of the System associated with the current System.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getRfSystem()} instead.
   */
  @Deprecated
  public TString getSerial() {
    return serial;
  }

  /**
   * Set the reference of the System associated with the current System.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setRfSystem(RFSystem)} instead.
   */
  @Deprecated
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
   * Set the relationship between the two systems.
   * <p>
   * @param value An instances of type {@link ListCFR}
   * @return The current RelatedSystem object instance
   */
  public RelatedSystem withRelation(ListCFR value) {
    setRelation(new TString(value.value()));
    return this;
  }

  /**
   * Set the reference of the System associated with the current System.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSystem object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRfSystem(RFSystem)} instead.
   */
  @Deprecated
  public RelatedSystem withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this RelatedSystem instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RelatedSystem {"
      + (relation != null ? " relation [" + relation + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedSystem} requires
   * {@link TString Relation}, {@link TString Serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRelation() && isSetSerial();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * Serial - Related System Serial (Required)
   * <p>
   * The reference of the System associated with the current System.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private RFSystem rfSystem;

  /**
   * Get the reference of the System associated with the current System.
   * <p>
   * @return a {@link RFSystem} instance
   * @since 3.1.0
   */
  public RFSystem getRfSystem() {
    return rfSystem;
  }

  /**
   * Determine if the rfSystem field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRfSystem() {
    return this.rfSystem != null;
  }

  /**
   * Set the reference of the System associated with the current System.
   * <p>
   * @param value An instances of type {@link RFSystem}
   * @return The current RelatedSystem object instance
   * @since 3.1.0
   */
  public RelatedSystem withRfSystem(RFSystem value) {
    this.rfSystem = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RelatedSystem record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #rfSystem} field. This method should typically be called
   * after the RelatedSystem is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @return The current RelatedSystem object instance
   */
  public RelatedSystem build() {
    this.serial = rfSystem != null ? rfSystem.getSerial() : null;
    return this;
  }//</editor-fold>

}
