package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDD;

/**
 * RelatedSupportability refers to a SSRequest with which the current dataset
 * has a dependency.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Example:
 * <pre>
 * &lt;RelatedSupportability&gt;
 *   &lt;Type cls="U"&gt;Related&lt;/Type&gt;
 *   &lt;SSRequestRef cls="U"&gt;USA:NTIA:SR:123&lt;/SSRequestRef&gt;
 * &lt;/RelatedSupportability&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSupportability", propOrder = {
  "type",
  "ssRequestRef",
  "j12Number"
})
public class RelatedSupportability {

  /**
   * Type - Type (Required)    * <p>
   * The type of dependency between the current dataset and the referred
   * application.
   * <p>
   * Format is L:CDD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * SSRequestRef - SSRequest Serial (Optional)    * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SSRequestRef", required = false)
  private Serial ssRequestRef;
  /**
   * US:J12Number - J/F 12 Number (Optional)    * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * Format is S15
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "J12Number", required = false)
  private S15 j12Number;

  /**
   * Get the type of dependency between the current dataset and the referred
   * application..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of dependency between the current dataset and the referred
   * application..
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
   * Get a Serial reference to a superseded or related SSRequest application..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setSSRequestRef(Serial value) {
    this.ssRequestRef = value;
  }

  /**
   * Determine if the SSRequestRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null ? this.ssRequestRef.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application..
   * <p>
   * @return a {@link S15} instance
   * @since 3.1.0
   */
  public S15 getJ12Number() {
    return j12Number;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application..
   * <p>
   * @param value a {@link S15} instance
   * @since 3.1.0
   */
  public void setJ12Number(S15 value) {
    this.j12Number = value;
  }

  /**
   * Determine if the J12Number is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJ12Number() {
    return (this.j12Number != null ? this.j12Number.isSetValue() : false);
  }

  /**
   * Set the type of dependency between the current dataset and the referred
   * application.
   * <p>
   * @param value An instances of type {@link ListCDD}.
   * @return The current RelatedSupportability object instance.
   * @since 3.1.0
   */
  public RelatedSupportability withType(ListCDD value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current RelatedSupportability object instance.
   * @since 3.1.0
   */
  public RelatedSupportability withSSRequestRef(Serial value) {
    setSSRequestRef(value);
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RelatedSupportability object instance.
   * @since 3.1.0
   */
  public RelatedSupportability withJ12Number(String value) {
    setJ12Number(new S15(value));
    return this;
  }

  /**
   * Get a string representation of this RelatedSupportability instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RelatedSupportability {"
           + (j12Number != null ? " j12Number [" + j12Number + "]" : "")
           + (ssRequestRef != null ? " ssRequestRef [" + ssRequestRef + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedSupportability} requires {@link TString Type}.
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
   * SSRequestRef - SSRequest Serial (Optional)    * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRequest ssRequest;

  /**
   * Get a Serial reference to a superseded or related SSRequest application..
   * <p>
   * @return a {@link SSRequest} instance
   * @since 3.1.0
   */
  public SSRequest getSsRequest() {
    return ssRequest;
  }

  /**
   * Determine if the ssRequest field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSsRequest() {
    return this.ssRequest != null;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value An instances of type {@link SSRequest}.
   * @return The current RelatedSupportability object instance.
   * @since 3.1.0
   */
  public RelatedSupportability withSsRequest(SSRequest value) {
    this.ssRequest = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this RelatedSupportability record.
   * <p>
   * This method builds the exported {@link #ssRequestRef} field with values
   * from the transient {@link #ssRequest} field. This method should typically
   * be called after the RelatedSupportability is configured and (optionally)
   * before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.ssRequestRef = ssRequest != null ? ssRequest.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this RelatedSupportability record
   * after loading from XML.
   * <p>
   * This method builds the transient {@link #ssRequest} with values from the
   * imported {@link #ssRequestRef} field. This method should typically be
   * called after the RelatedSupportability is imported from XML. * @param root
   * the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (ssRequestRef == null || !ssRequestRef.isSetValue()) {
      return;
    }
    for (SSRequest instance : root.getSSRequest()) {
      if (ssRequestRef.equals(instance.getSerial())) {
        ssRequest = instance;
        return;
      }
    }
  }//</editor-fold>

}
