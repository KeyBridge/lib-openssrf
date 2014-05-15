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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for FreqBand complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="FreqBand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="FreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="UseIndicator" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS40" minOccurs="0"/>
 *         &lt;element name="BandNotes" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Allocation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Allocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="footnotes" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqBand", propOrder = {
  "freqMin",
  "freqMax",
  "useIndicator",
  "bandNotes",
  "allocation"
})
public class FreqBand {

  @XmlElement(name = "FreqMin", required = true)
  protected TFreqM freqMin;
  @XmlElement(name = "FreqMax", required = true)
  protected TFreqM freqMax;
  @XmlElementRef(name = "UseIndicator", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS40> useIndicator;
  @XmlElementRef(name = "BandNotes", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> bandNotes;
  @XmlElement(name = "Allocation")
  protected List<Allocation> allocation;
  @XmlAttribute(name = "footnotes")
  protected List<BigInteger> footnotes;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqMin(TFreqM value) {
    this.freqMin = value;
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqMax(TFreqM value) {
    this.freqMax = value;
  }

  /**
   * Gets the value of the useIndicator property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public JAXBElement<TS40> getUseIndicator() {
    return useIndicator;
  }

  /**
   * Sets the value of the useIndicator property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public void setUseIndicator(JAXBElement<TS40> value) {
    this.useIndicator = value;
  }

  /**
   * Gets the value of the bandNotes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getBandNotes() {
    return bandNotes;
  }

  /**
   * Sets the value of the bandNotes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setBandNotes(JAXBElement<TMEMO> value) {
    this.bandNotes = value;
  }

  /**
   * Gets the value of the allocation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allocation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAllocation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Allocation }
   * <p>
   * <p>
   */
  public List<Allocation> getAllocation() {
    if (allocation == null) {
      allocation = new ArrayList<>();
    }
    return this.allocation;
  }

  /**
   * Gets the value of the footnotes property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the footnotes property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFootnotes().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   */
  public List<BigInteger> getFootnotes() {
    if (footnotes == null) {
      footnotes = new ArrayList<>();
    }
    return this.footnotes;
  }

}
