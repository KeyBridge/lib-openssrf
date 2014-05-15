/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Tuning complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Tuning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TuningStep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="NumFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN1" minOccurs="0"/>
 *         &lt;element name="Exclusive" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqSep" minOccurs="0"/>
 *         &lt;element name="RequestedFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnFreqBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tuning", propOrder = {
  "tuningStep",
  "numFreq",
  "priority",
  "exclusive",
  "freqSep",
  "freqSepType",
  "requestedFreq"
})
public class Tuning {

  @XmlElement(name = "TuningStep", required = true)
  protected TFreqM tuningStep;
  @XmlElement(name = "NumFreq", required = true)
  protected TUN4 numFreq;
  @XmlElementRef(name = "Priority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN1> priority;
  @XmlElementRef(name = "Exclusive", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> exclusive;
  @XmlElement(name = "FreqSep")
  protected TFreqM freqSep;
  @XmlElement(name = "FreqSepType")
  protected TS10 freqSepType;
  @XmlElement(name = "RequestedFreq")
  protected List<AsgnFreqBase> requestedFreq;

  /**
   * Gets the value of the tuningStep property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setTuningStep(TFreqM value) {
    this.tuningStep = value;
  }

  /**
   * Gets the value of the numFreq property.
   * <p>
   * @return possible object is {@link TUN4 }
   * <p>
   */
  public TUN4 getNumFreq() {
    return numFreq;
  }

  /**
   * Sets the value of the numFreq property.
   * <p>
   * @param value allowed object is {@link TUN4 }
   * <p>
   */
  public void setNumFreq(TUN4 value) {
    this.numFreq = value;
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public JAXBElement<TUN1> getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public void setPriority(JAXBElement<TUN1> value) {
    this.priority = value;
  }

  /**
   * Gets the value of the exclusive property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getExclusive() {
    return exclusive;
  }

  /**
   * Sets the value of the exclusive property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setExclusive(JAXBElement<TListCBO> value) {
    this.exclusive = value;
  }

  /**
   * Gets the value of the freqSep property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreqSep() {
    return freqSep;
  }

  /**
   * Sets the value of the freqSep property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqSep(TFreqM value) {
    this.freqSep = value;
  }

  /**
   * Gets the value of the freqSepType property.
   * <p>
   * @return possible object is {@link TS10 }
   * <p>
   */
  public TS10 getFreqSepType() {
    return freqSepType;
  }

  /**
   * Sets the value of the freqSepType property.
   * <p>
   * @param value allowed object is {@link TS10 }
   * <p>
   */
  public void setFreqSepType(TS10 value) {
    this.freqSepType = value;
  }

  /**
   * Gets the value of the requestedFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the requestedFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRequestedFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link AsgnFreqBase }
   * <p>
   * <p>
   */
  public List<AsgnFreqBase> getRequestedFreq() {
    if (requestedFreq == null) {
      requestedFreq = new ArrayList<>();
    }
    return this.requestedFreq;
  }

}
