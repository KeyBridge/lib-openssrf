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
 * Java class for Curve complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="Curve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="FreqFactor" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3_1"/>
 *         &lt;element name="FreqConst" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqOffset"/>
 *         &lt;element name="Bw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="CurvePoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CurvePoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idx" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
  "type",
  "calculated",
  "freqFactor",
  "freqConst",
  "bw",
  "freqMin",
  "freqMax",
  "curvePoint"
})
public class Curve {

  @XmlElement(name = "Type", required = true)
  protected TS25 type;
  @XmlElementRef(name = "Calculated", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> calculated;
  @XmlElement(name = "FreqFactor", required = true)
  protected TUN3_1 freqFactor;
  @XmlElement(name = "FreqConst", required = true)
  protected TFreqOffset freqConst;
  @XmlElementRef(name = "Bw", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> bw;
  @XmlElementRef(name = "FreqMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMin;
  @XmlElementRef(name = "FreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMax;
  @XmlElement(name = "CurvePoint", required = true)
  protected List<CurvePoint> curvePoint;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is {@link TS25 }
   * <p>
   */
  public TS25 getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is {@link TS25 }
   * <p>
   */
  public void setType(TS25 value) {
    this.type = value;
  }

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setCalculated(JAXBElement<TListCBO> value) {
    this.calculated = value;
  }

  /**
   * Gets the value of the freqFactor property.
   * <p>
   * @return possible object is {@link TUN3_1 }
   * <p>
   */
  public TUN3_1 getFreqFactor() {
    return freqFactor;
  }

  /**
   * Sets the value of the freqFactor property.
   * <p>
   * @param value allowed object is {@link TUN3_1 }
   * <p>
   */
  public void setFreqFactor(TUN3_1 value) {
    this.freqFactor = value;
  }

  /**
   * Gets the value of the freqConst property.
   * <p>
   * @return possible object is {@link TFreqOffset }
   * <p>
   */
  public TFreqOffset getFreqConst() {
    return freqConst;
  }

  /**
   * Sets the value of the freqConst property.
   * <p>
   * @param value allowed object is {@link TFreqOffset }
   * <p>
   */
  public void setFreqConst(TFreqOffset value) {
    this.freqConst = value;
  }

  /**
   * Gets the value of the bw property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getBw() {
    return bw;
  }

  /**
   * Sets the value of the bw property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setBw(JAXBElement<TFreqM> value) {
    this.bw = value;
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMin(JAXBElement<TFreqM> value) {
    this.freqMin = value;
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMax(JAXBElement<TFreqM> value) {
    this.freqMax = value;
  }

  /**
   * Gets the value of the curvePoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the curvePoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurvePoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link CurvePoint }
   * <p>
   * <p>
   */
  public List<CurvePoint> getCurvePoint() {
    if (curvePoint == null) {
      curvePoint = new ArrayList<>();
    }
    return this.curvePoint;
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return possible object is {@link BigInteger }
   * <p>
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value allowed object is {@link BigInteger }
   * <p>
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

}
