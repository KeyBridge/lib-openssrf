package us.gov.dod.standard.ssrf._3_1.rfsystem;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSystem", propOrder = {
  "relation",
  "serial"
})
public class RelatedSystem {

  /**
   * Relation - Relation Type (Required)    * <p>
   * The relationship between the two systems.
   * <p>
   * Format is L:CFR
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Relation", required = true)
  private TString relation;
  /**
   * Serial - Related System Serial (Required)    * <p>
   * The reference of the System associated with the current System.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;

  /**
   * Get the relationship between the two systems..
   * <p>
   * @return the Relation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRelation() {
    return relation;
  }

  /**
   * Set the relationship between the two systems..
   * <p>
   * @param value the Relation value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the reference of the System associated with the current System..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getRfSystem()} instead.
   */
  @Deprecated
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set the reference of the System associated with the current System..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setRfSystem(RFSystem)} instead.
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
   * Set the relationship between the two systems.
   * <p>
   * @param value An instances of type {@link ListCFR}.
   * @return The current RelatedSystem object instance.
   * @since 3.1.0
   */
  public RelatedSystem withRelation(ListCFR value) {
    setRelation(new TString(value.value()));
    return this;
  }

  /**
   * Set the reference of the System associated with the current System.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current RelatedSystem object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRfSystem(RFSystem)} instead.
   */
  @Deprecated
  public RelatedSystem withSerial(Serial value) {
    setSerial(value);
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
           + (relation != null ? "\n relation [" + relation + "]" : "")
           + (serial != null ? "\n serial [" + serial + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedSystem} requires
   * {@link TString Relation}, {@link Serial Serial}.
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
   * Serial - Related System Serial (Required)    * <p>
   * The reference of the System associated with the current System.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private RFSystem rfSystem;

  /**
   * Get the reference of the System associated with the current System..
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
   * @param value An instances of type {@link RFSystem}.
   * @return The current RelatedSystem object instance.
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
   * @since 3.1.0
   */
  public void prepare() {
    this.serial = rfSystem != null ? rfSystem.getSerial() : this.serial;
  }

  /**
   * Update the SSRF data type references in this RelatedSystem record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #rfSystem} with values from the
   * imported {@link #serial} field. This method should typically be called
   * after the RelatedSystem is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (serial == null || !serial.isSetValue()) {
      return;
    }
    for (RFSystem instance : root.getRFSystem()) {
      if (serial.equals(instance.getSerial())) {
        rfSystem = instance;
        return;
      }
    }
  }//</editor-fold>

}
