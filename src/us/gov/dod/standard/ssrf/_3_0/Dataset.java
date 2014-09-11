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
package us.gov.dod.standard.ssrf._3_0;

import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.MissingRef;

/**
 * <p>
 * Java class for Dataset complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Dataset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="RetireDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="Reason" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="MissingRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}MissingRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dataset", propOrder = {
  "serial",
  "retireDate",
  "reason",
  "missingRef"
})
public class Dataset {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "RetireDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar retireDate;
  @XmlElement(name = "Reason", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString reason;
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
   * @return possible object is
   *         
   * <p>
   */
  public TCalendar getRetireDate() {
    return retireDate;
  }

  /**
   * Sets the value of the retireDate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
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
   * @return possible object is
   *         
   * <p>
   */
  public TString getReason() {
    return reason;
  }

  /**
   * Sets the value of the reason property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the missingRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMissingRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * 
   * <p>
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

  public Dataset withSerial(String value) {
    setSerial(new TString(value));
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
