package us.gov.dod.standard.ssrf._3_1.multiple;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCEF;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSN;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSC;

/**
 * Usage identifies how an operational configuration can be used or will be
 * used.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Example:
 * <pre>
 * &lt;Usage&gt;
 *   &lt;EqpFnct  cls="U"&gt;EW-Jamming-Sweep&lt;/EqpFnct &gt;
 *   &lt;RadioService  cls="U"&gt;Special Service&lt;/RadioService &gt;
 *   &lt;StnClass  cls="U"&gt;MAP&lt;/StnClass &gt;
 * &lt;/Usage&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage", propOrder = {
  "eqpFnct",
  "stnClass",
  "radioService"
})
public class Usage {

  /**
   * EqpFnct - Equipment Function (Optional)    * <p>
   * The equipment function.
   * <p>
   * Format is L:CEF
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EqpFnct", required = false)
  private TString eqpFnct;
  /**
   * StnClass - Class of Station (Optional)    * <p>
   * The station class, as defined by the appropriate Administration.
   * <p>
   * Format is L:USC
   * <p>
   * Divergence from SMADEF: Suppress non-ITU USC codes (see suffix on code
   * definition) for StnClass when exchanging with NATO.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StnClass", required = false)
  private TString stnClass;
  /**
   * RadioService - Radiocommunication Service (Optional)    * <p>
   * The Radiocommunication Service associated with the frequency usage in this
   * configuration. Allowable values are defined by the appropriate
   * Administration.
   * <p>
   * Format is L:CSN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RadioService", required = false)
  private TString radioService;

  /**
   * Get the equipment function..
   * <p>
   * @return the EqpFnct value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getEqpFnct() {
    return eqpFnct;
  }

  /**
   * Set the equipment function..
   * <p>
   * @param value the EqpFnct value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setEqpFnct(TString value) {
    this.eqpFnct = value;
  }

  /**
   * Determine if the EqpFnct is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEqpFnct() {
    return (this.eqpFnct != null ? this.eqpFnct.isSetValue() : false);
  }

  /**
   * Get the station class, as defined by the appropriate Administration..
   * <p>
   * @return the StnClass value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getStnClass() {
    return stnClass;
  }

  /**
   * Set the station class, as defined by the appropriate Administration..
   * <p>
   * @param value the StnClass value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setStnClass(TString value) {
    this.stnClass = value;
  }

  /**
   * Determine if the StnClass is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStnClass() {
    return (this.stnClass != null ? this.stnClass.isSetValue() : false);
  }

  /**
   * Get the Radiocommunication Service associated with the frequency usage in
   * this configuration. Allowable values are defined by the appropriate
   * Administration..
   * <p>
   * @return the RadioService value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRadioService() {
    return radioService;
  }

  /**
   * Set the Radiocommunication Service associated with the frequency usage in
   * this configuration. Allowable values are defined by the appropriate
   * Administration..
   * <p>
   * @param value the RadioService value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRadioService(TString value) {
    this.radioService = value;
  }

  /**
   * Determine if the RadioService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadioService() {
    return (this.radioService != null ? this.radioService.isSetValue() : false);
  }

  /**
   * Set the equipment function.
   * <p>
   * @param value An instances of type {@link ListCEF}.
   * @return The current Usage object instance.
   * @since 3.1.0
   */
  public Usage withEqpFnct(ListCEF value) {
    setEqpFnct(new TString(value.value()));
    return this;
  }

  /**
   * Set the station class, as defined by the appropriate Administration.
   * <p>
   * @param value An instances of type {@link ListUSC}.
   * @return The current Usage object instance.
   * @since 3.1.0
   */
  public Usage withStnClass(ListUSC value) {
    setStnClass(new TString(value.value()));
    return this;
  }

  /**
   * Set the Radiocommunication Service associated with the frequency usage in
   * this configuration. Allowable values are defined by the appropriate
   * Administration.
   * <p>
   * @param value An instances of type {@link ListCSN}.
   * @return The current Usage object instance.
   * @since 3.1.0
   */
  public Usage withRadioService(ListCSN value) {
    setRadioService(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Usage instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Usage {"
           + (eqpFnct != null ? "\n eqpFnct [" + eqpFnct + "]" : "")
           + (radioService != null ? "\n radioService [" + radioService + "]" : "")
           + (stnClass != null ? "\n stnClass [" + stnClass + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Usage} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
