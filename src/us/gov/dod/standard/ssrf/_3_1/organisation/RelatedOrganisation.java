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
package us.gov.dod.standard.ssrf._3_1.organisation;

import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.Organisation;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFR;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFT;

/**
 * RelatedOrganisation identifies an Organisation linked to the current
 * Organisation, the type of relation (reporting, budget, etc) and the relation
 * (parent, child, sibling).
 * <p>
 * Element of {@link Organisation}
 * <p>
 * Example:
 * <pre>
 * &lt;RelatedOrganisation&gt;
 *   &lt;Type cls="U"&gt;Reporting&lt;/Type&gt;
 *   &lt;Relation cls="U"&gt;Child&lt;/Relation&gt;
 *   &lt;Serial cls="U"&gt;USA:AR:OR:05008827&lt;/Serial&gt;
 * &lt;/RelatedOrganisation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedOrganisation", propOrder = {
  "type",
  "relation",
  "serial"
})
public class RelatedOrganisation {

  /**
   * Type - Type (Optional)
   * <p>
   * The type of relationship.
   * <p>
   * Format is L:CFT
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Relation - Relationship (Required)
   * <p>
   * The relationship between the two organisations.
   * <p>
   * Format is L:CFR
   */
  @XmlElement(name = "Relation", required = true)
  private TString relation;
  /**
   * Serial - Organisation Serial (Required)
   * <p>
   * The unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TSerial serial;

  /**
   * Get the type of relationship.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of relationship.
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
   * Get the relationship between the two organisations.
   * <p>
   * @return the Relation value in a {@link TString} data type
   */
  public TString getRelation() {
    return relation;
  }

  /**
   * Set the relationship between the two organisations.
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
   * Get the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @return the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getOrganisation()} instead.
   */
  @Deprecated
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setOrganisation(Organisation)} instead.
   */
  @Deprecated
  public void setSerial(TSerial value) {
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
   * Set the type of relationship.
   * <p>
   * @param value An instances of type {@link ListCFT}
   * @return The current RelatedOrganisation object instance
   */
  public RelatedOrganisation withType(ListCFT value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the relationship between the two organisations.
   * <p>
   * @param value An instances of type {@link ListCFR}
   * @return The current RelatedOrganisation object instance
   */
  public RelatedOrganisation withRelation(ListCFR value) {
    setRelation(new TString(value.value()));
    return this;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedOrganisation object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withOrganisation(Organisation)} instead.
   */
  @Deprecated
  public RelatedOrganisation withSerial(TSerial value) {
    setSerial(value);
    return this;
  }

  /**
   * Get a string representation of this RelatedOrganisation instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RelatedOrganisation {"
      + (relation != null ? " relation [" + relation + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (serial != null ? " serial [" + serial + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedOrganisation} requires
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
   * Serial - Organisation Serial (Required)
   * <p>
   * The unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Organisation organisation;

  /**
   * Get the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @return a {@link Organisation} instance
   * @since 3.1.0
   */
  public Organisation getOrganisation() {
    return organisation;
  }

  /**
   * Determine if the organisation field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOrganisation() {
    return this.organisation != null;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @param value An instances of type {@link Organisation}
   * @return The current RelatedOrganisation object instance
   * @since 3.1.0
   */
  public RelatedOrganisation withOrganisation(Organisation value) {
    this.organisation = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RelatedOrganisation record.
   * <p>
   * This method builds the exported {@link #serial} field with values from the
   * transient {@link #organisation} field. This method should typically be
   * called after the RelatedOrganisation is configured and (optionally) before
   * exporting an SSRF message.
   */
  public void prepare() {
    this.serial = organisation != null ? organisation.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RelatedOrganisation record
   * after loading from XML.
   * <p>
   * This method builds the transient {@link #organisation} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the RelatedOrganisation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (Organisation instance : root.getOrganisation()) {
      if (serial.equals(instance.getSerial())) {
        organisation = instance;
        return;
      }
    }
  }//</editor-fold>

}
