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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedSupportability", propOrder = {
  "type",
  "ssRequestRef",
  "j12Number"
})
public class RelatedSupportability {

  /**
   * Type - Type (Required)
   * <p>
   * The type of dependency between the current dataset and the referred
   * application.
   * <p>
   * Format is L:CDD
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   */
  @XmlElement(name = "SSRequestRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString ssRequestRef;
  /**
   * US:J12Number - J/F 12 Number (Optional)
   * <p>
   * The US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * Format is S15
   */
  @XmlElement(name = "J12Number", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS15.class)
  private TString j12Number;

  /**
   * Get the type of dependency between the current dataset and the referred
   * application.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of dependency between the current dataset and the referred
   * application.
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
   * Get a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @return the SSRequestRef value in a {@link TString} data type
   */
  public TString getSSRequestRef() {
    return ssRequestRef;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value the SSRequestRef value in a {@link TString} data type
   */
  public void setSSRequestRef(TString value) {
    this.ssRequestRef = value;
  }

  /**
   * Determine if the SSRequestRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSSRequestRef() {
    return (this.ssRequestRef != null ? this.ssRequestRef.isSetValue() : false);
  }

  /**
   * Get the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @return the J12Number value in a {@link TString} data type
   */
  public TString getJ12Number() {
    return j12Number;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @param value the J12Number value in a {@link TString} data type
   */
  public void setJ12Number(TString value) {
    this.j12Number = value;
  }

  /**
   * Determine if the J12Number is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * @param value An instances of type {@link ListCDD}
   * @return The current RelatedSupportability object instance
   */
  public RelatedSupportability withType(ListCDD value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set a Serial reference to a superseded or related SSRequest application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSupportability object instance
   */
  public RelatedSupportability withSSRequestRef(String value) {
    setSSRequestRef(new TString(value));
    return this;
  }

  /**
   * Set the US Military Communications-Electronics Board (MCEB) identifier of a
   * superseded or related application.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedSupportability object instance
   */
  public RelatedSupportability withJ12Number(String value) {
    setJ12Number(new TString(value));
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
   * SSRequestRef - SSRequest Serial (Optional)
   * <p>
   * A Serial reference to a superseded or related SSRequest application.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRequest ssRequest;

  /**
   * Get a Serial reference to a superseded or related SSRequest application.
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
   * @param value An instances of type {@link SSRequest}
   * @return The current RelatedSupportability object instance
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
   * @return The current RelatedSupportability object instance
   */
  public RelatedSupportability build() {
    this.ssRequestRef = ssRequest != null ? ssRequest.getSerial() : null;
    return this;
  }//</editor-fold>

}
