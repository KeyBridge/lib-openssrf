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
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.system.TxAntModeRef;
import us.gov.dod.standard.ssrf._3_0.system.TxModeRef;

/**
 * Java class for TxRef complex type.
 * <p>
 * This element contains the reference of a Transmitter, and optionnally some of
 * its TxModes and the associated Antennas and AntMode.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxRef", propOrder = {
  "serial",
  "txModeRef",
  "txAntModeRef"
})
public class TxRef {

  /**
   * Serial: A reference to a Transmitter in this configuration. The same
   * transmitter can be referenced in different TxRef elements in order to
   * properly group transmitter modes with antenna modes.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "TX".
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * Data element TxModeRef contains references to the Transmitter and its
   * modes, used to construct a Configuration.
   */
  @XmlElement(name = "TxModeRef")
  private List<TxModeRef> txModeRef;
  /**
   * Data element TxAntModeRef contains references to the Antenna and its
   * AntMode, used to construct a Transmitter Configuration.
   */
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txModeRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxModeRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txAntModeRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxAntModeRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
