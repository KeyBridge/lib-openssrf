package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUOW;

/**
 * AsgnAllotOwner (US) contains the serial of the owning, or originating,
 * organisation.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnAllotOwner", propOrder = {
  "description",
  "ownerType",
  "ownerOrgRef"
})
public class AsgnAllotOwner {

  @XmlElement(name = "Description ", required = false)
  private S18 description;
  @XmlElement(name = "OwnerType ", required = true)
  private TString ownerType;
  /**
   * US:OwnerOrgRef - Owner Organisation Serial (Optional)    * <p>
   * The serial of the owning, or originating, organisation. This definitively
   * identifies the owning agency when there is a possibility that multiple
   * entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OwnerOrgRef", required = false)
  private Serial ownerOrgRef;

  /**
   * Get the name of an individual or organization related to the frequency
   * assignment..
   * <p>
   * @return a {@link S18} instance
   * @since 3.1.0
   */
  public S18 getDescription() {
    return description;
  }

  /**
   * Set the name of an individual or organization related to the frequency
   * assignment..
   * <p>
   * @param value a {@link S18} instance
   * @since 3.1.0
   */
  public void setDescription(S18 value) {
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
   * Get the relationship of an individual or organization to the frequency
   * assignment..
   * <p>
   * @return the OwnerType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOwnerType() {
    return ownerType;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment..
   * <p>
   * @param value the OwnerType value in a {@link TString} data type
   * @since 3.1.0
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
   * unambiguously linked to an internal directory of organizations..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getOwnerOrg()} instead.
   */
  @Deprecated
  public Serial getOwnerOrgRef() {
    return ownerOrgRef;
  }

  /**
   * Set the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setOwnerOrg(Organisation)} instead.
   */
  @Deprecated
  public void setOwnerOrgRef(Serial value) {
    this.ownerOrgRef = value;
  }

  /**
   * Determine if the OwnerOrgRef is configured.
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
   * @param value An instances of type {@link String}.
   * @return The current AsgnAllotOwner object instance.
   * @since 3.1.0
   */
  public AsgnAllotOwner withDescription(String value) {
    setDescription(new S18(value));
    return this;
  }

  /**
   * Set the relationship of an individual or organization to the frequency
   * assignment.
   * <p>
   * @param value An instances of type {@link ListUOW}.
   * @return The current AsgnAllotOwner object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Serial}.
   * @return The current AsgnAllotOwner object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withOwnerOrg(Organisation)} instead.
   */
  @Deprecated
  public AsgnAllotOwner withOwnerOrgRef(Serial value) {
    setOwnerOrgRef(value);
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
           + (description != null ? " description [" + description + "]" : "")
           + (ownerOrgRef != null ? " ownerOrgRef [" + ownerOrgRef + "]" : "")
           + (ownerType != null ? " ownerType [" + ownerType + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AsgnAllotOwner} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:OwnerOrgRef - Owner Organisation Serial (Optional)    * <p>
   * The serial of the owning, or originating, organisation. This definitively
   * identifies the owning agency when there is a possibility that multiple
   * entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Organisation ownerOrg;

  /**
   * Get the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations..
   * <p>
   * @return a {@link Organisation} instance
   * @since 3.1.0
   */
  public Organisation getOwnerOrg() {
    return ownerOrg;
  }

  /**
   * Determine if the ownerOrg field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerOrg() {
    return this.ownerOrg != null;
  }

  /**
   * Set the serial of the owning, or originating, organisation. This
   * definitively identifies the owning agency when there is a possibility that
   * multiple entities are listed in a text string name. This identifier can be
   * unambiguously linked to an internal directory of organizations.
   * <p>
   * @param value An instances of type {@link Organisation}.
   * @return The current AsgnAllotOwner object instance.
   * @since 3.1.0
   */
  public AsgnAllotOwner withOwnerOrg(Organisation value) {
    this.ownerOrg = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this AsgnAllotOwner record.
   * <p>
   * This method builds the exported {@link #ownerOrgRef} field with values from
   * the transient {@link #ownerOrg} field. This method should typically be
   * called after the AsgnAllotOwner is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.ownerOrgRef = ownerOrg != null ? ownerOrg.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this AsgnAllotOwner record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #ownerOrg} with values from the
   * imported {@link #ownerOrgRef} field. This method should typically be called
   * after the AsgnAllotOwner is imported from XML. * @param root the SSRF root
   * instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (ownerOrgRef == null || !ownerOrgRef.isSetValue()) {
      return;
    }
    for (Organisation instance : root.getOrganisation()) {
      if (ownerOrgRef.equals(instance.getSerial())) {
        ownerOrg = instance;
        return;
      }
    }
  }//</editor-fold>

}
