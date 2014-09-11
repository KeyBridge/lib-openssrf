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
package us.gov.dod.standard.ssrf._3_0.system.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.system.RxAntModeRef;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.RxModeRef;

/**
 * <p>
 * Java class for RxRef complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RxRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="RxModeRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxModeRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RxAntModeRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxAntModeRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxRef", propOrder = {
  "serial",
  "rxModeRef",
  "rxAntModeRef"
})
public class RxRef {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "RxModeRef", nillable = true)
  private List<RxModeRef> rxModeRef;
  @XmlElement(name = "RxAntModeRef")
  private List<RxAntModeRef> rxAntModeRef;

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
   * Gets the value of the rxModeRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxModeRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxModeRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<RxModeRef> getRxModeRef() {
    if (rxModeRef == null) {
      rxModeRef = new ArrayList<>();
    }
    return this.rxModeRef;
  }

  public boolean isSetRxModeRef() {
    return ((this.rxModeRef != null) && (!this.rxModeRef.isEmpty()));
  }

  public void unsetRxModeRef() {
    this.rxModeRef = null;
  }

  /**
   * Gets the value of the rxAntModeRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxAntModeRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxAntModeRef().add(newItem);
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
  public List<RxAntModeRef> getRxAntModeRef() {
    if (rxAntModeRef == null) {
      rxAntModeRef = new ArrayList<>();
    }
    return this.rxAntModeRef;
  }

  public boolean isSetRxAntModeRef() {
    return ((this.rxAntModeRef != null) && (!this.rxAntModeRef.isEmpty()));
  }

  public void unsetRxAntModeRef() {
    this.rxAntModeRef = null;
  }

  public RxRef withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public RxRef withRxModeRef(RxModeRef... values) {
    if (values != null) {
      getRxModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxRef withRxModeRef(Collection<RxModeRef> values) {
    if (values != null) {
      getRxModeRef().addAll(values);
    }
    return this;
  }

  public RxRef withRxAntModeRef(RxAntModeRef... values) {
    if (values != null) {
      getRxAntModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxRef withRxAntModeRef(Collection<RxAntModeRef> values) {
    if (values != null) {
      getRxAntModeRef().addAll(values);
    }
    return this;
  }

}
