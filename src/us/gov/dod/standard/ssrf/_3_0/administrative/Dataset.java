/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.administrative;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.MissingRef;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for Dataset complex type.
 * <p>
 * Data element Dataset is used within an Administrative transaction to specify
 * the identifier of the datasets on which the action must apply.
 * <p>
 * Sub-Element Of: {@link Administrative}
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dataset", propOrder = {
  "serial",
  "retireDate",
  "reason",
  "missingRef"
})
public class Dataset {

  /**
   * Serial: Enter the serial of the referenced dataset.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * RetireDate: Enter the date this dataset goes out of force.
   */
  @XmlElement(name = "RetireDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar retireDate;
  /**
   * Reason: Enter the reason linked to the Action performed on this dataset.
   * (MEMO)
   */
  @XmlElement(name = "Reason", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString reason;
  /**
   * This element allows the recipient of a message to signal the sender that a
   * dataset referenced in the message was not known by the recipient.
   */
  @XmlElement(name = "MissingRef", nillable = true)
  private List<MissingRef> missingRef;

  /**
   * Gets the value of the serial property.
   * <p>
   * @return
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the retireDate property.
   * <p>
   * @return
   */
  public TCalendar getRetireDate() {
    return retireDate;
  }

  /**
   * Sets the value of the retireDate property.
   * <p>
   * @param value
   */
  public void setRetireDate(TCalendar value) {
    this.retireDate = value;
  }

  public boolean isSetRetireDate() {
    return (this.retireDate != null);
  }

  /**
   * Gets the value of the reason property.
   * <p>
   * @return
   */
  public TString getReason() {
    return reason;
  }

  /**
   * Sets the value of the reason property.
   * <p>
   * @param value
   */
  public void setReason(TString value) {
    this.reason = value;
  }

  public boolean isSetReason() {
    return (this.reason != null);
  }

  /**
   * Gets the value of the missingRef property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the missingRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMissingRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<MissingRef> getMissingRef() {
    if (missingRef == null) {
      missingRef = new ArrayList<>();
    }
    return this.missingRef;
  }

  public boolean isSetMissingRef() {
    return ((this.missingRef != null) && (!this.missingRef.isEmpty()));
  }

  public void unsetMissingRef() {
    this.missingRef = null;
  }

  public Dataset withSerial(TString value) {
    setSerial(value);
    return this;
  }

  public Dataset withRetireDate(Calendar value) {
    setRetireDate(new TCalendar(value));
    return this;
  }

  public Dataset withReason(String value) {
    setReason(new TString(value));
    return this;
  }

  public Dataset withMissingRef(MissingRef... values) {
    if (values != null) {
      getMissingRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Dataset withMissingRef(Collection<MissingRef> values) {
    if (values != null) {
      getMissingRef().addAll(values);
    }
    return this;
  }

}
