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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TString;

/**
 * <p>
 * Java class for TxRef complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TxRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="TxModeRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TxModeRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxAntModeRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TxAntModeRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxRef", propOrder = {
  "serial",
  "txModeRef",
  "txAntModeRef"
})
public class TxRef {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "TxModeRef")
  private List<TxModeRef> txModeRef;
  @XmlElement(name = "TxAntModeRef")
  private List<TxAntModeRef> txAntModeRef;

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
   * Gets the value of the txModeRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txModeRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxModeRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<TxModeRef> getTxModeRef() {
    if (txModeRef == null) {
      txModeRef = new ArrayList<>();
    }
    return this.txModeRef;
  }

  public boolean isSetTxModeRef() {
    return ((this.txModeRef != null) && (!this.txModeRef.isEmpty()));
  }

  public void unsetTxModeRef() {
    this.txModeRef = null;
  }

  /**
   * Gets the value of the txAntModeRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txAntModeRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxAntModeRef().add(newItem);
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
  public List<TxAntModeRef> getTxAntModeRef() {
    if (txAntModeRef == null) {
      txAntModeRef = new ArrayList<>();
    }
    return this.txAntModeRef;
  }

  public boolean isSetTxAntModeRef() {
    return ((this.txAntModeRef != null) && (!this.txAntModeRef.isEmpty()));
  }

  public void unsetTxAntModeRef() {
    this.txAntModeRef = null;
  }

  public TxRef withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public TxRef withTxModeRef(TxModeRef... values) {
    if (values != null) {
      getTxModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxRef withTxModeRef(Collection<TxModeRef> values) {
    if (values != null) {
      getTxModeRef().addAll(values);
    }
    return this;
  }

  public TxRef withTxAntModeRef(TxAntModeRef... values) {
    if (values != null) {
      getTxAntModeRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxRef withTxAntModeRef(Collection<TxAntModeRef> values) {
    if (values != null) {
      getTxAntModeRef().addAll(values);
    }
    return this;
  }

}
