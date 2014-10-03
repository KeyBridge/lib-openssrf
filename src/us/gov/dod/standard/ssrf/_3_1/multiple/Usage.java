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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage", propOrder = {
  "eqpFnct",
  "stnClass",
  "radioService"
})
public class Usage {

  /**
   * EqpFnct - Equipment Function (Optional)
   * <p>
   * The equipment function.
   * <p>
   * Format is L:CEF
   */
  @XmlElement(name = "EqpFnct", required = false)
  private TString eqpFnct;
  /**
   * StnClass - Class of Station (Optional)
   * <p>
   * The station class, as defined by the appropriate Administration.
   * <p>
   * Format is L:USC
   * <p>
   * Divergence from SMADEF: Suppress non-ITU USC codes (see suffix on code
   * definition) for StnClass when exchanging with NATO.
   */
  @XmlElement(name = "StnClass", required = false)
  private TString stnClass;
  /**
   * RadioService - Radiocommunication Service (Optional)
   * <p>
   * The Radiocommunication Service associated with the frequency usage in this
   * configuration. Allowable values are defined by the appropriate
   * Administration.
   * <p>
   * Format is L:CSN
   */
  @XmlElement(name = "RadioService", required = false)
  private TString radioService;

  /**
   * Get the equipment function.
   * <p>
   * @return the EqpFnct value in a {@link TString} data type
   */
  public TString getEqpFnct() {
    return eqpFnct;
  }

  /**
   * Set the equipment function.
   * <p>
   * @param value the EqpFnct value in a {@link TString} data type
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
   * Get the station class, as defined by the appropriate Administration.
   * <p>
   * @return the StnClass value in a {@link TString} data type
   */
  public TString getStnClass() {
    return stnClass;
  }

  /**
   * Set the station class, as defined by the appropriate Administration.
   * <p>
   * @param value the StnClass value in a {@link TString} data type
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
   * Administration.
   * <p>
   * @return the RadioService value in a {@link TString} data type
   */
  public TString getRadioService() {
    return radioService;
  }

  /**
   * Set the Radiocommunication Service associated with the frequency usage in
   * this configuration. Allowable values are defined by the appropriate
   * Administration.
   * <p>
   * @param value the RadioService value in a {@link TString} data type
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
   * @param value An instances of type {@link ListCEF}
   * @return The current Usage object instance
   */
  public Usage withEqpFnct(ListCEF value) {
    setEqpFnct(new TString(value.value()));
    return this;
  }

  /**
   * Set the station class, as defined by the appropriate Administration.
   * <p>
   * @param value An instances of type {@link ListUSC}
   * @return The current Usage object instance
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
   * @param value An instances of type {@link ListCSN}
   * @return The current Usage object instance
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
      + (stnClass != null ? " stnClass [" + stnClass + "]" : "")
      + (radioService != null ? " radioService [" + radioService + "]" : "")
      + (eqpFnct != null ? " eqpFnct [" + eqpFnct + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Usage} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
