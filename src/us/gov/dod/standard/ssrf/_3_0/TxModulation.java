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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TxModulation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TxModulation">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}RxModulation">
 *       &lt;sequence>
 *         &lt;element name="MaxDevRatio" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5_3" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}AM" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FM" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Suppression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModulation", propOrder = {
  "maxDevRatio",
  "amIdx",
  "amrmsIdx",
  "fmPeakFreqDev",
  "fmrmsFreqDev",
  "fmDeviationCode",
  "fmPeakModulationIdx",
  "carrierSuppression",
  "sidebandSuppression",
  "sidebandSuppressed"
})
public class TxModulation
  extends RxModulation {

  @XmlElementRef(name = "MaxDevRatio", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_3> maxDevRatio;
  @XmlElementRef(name = "AMIdx", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_3> amIdx;
  @XmlElementRef(name = "AMRMSIdx", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_3> amrmsIdx;
  @XmlElementRef(name = "FMPeakFreqDev", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> fmPeakFreqDev;
  @XmlElementRef(name = "FMRMSFreqDev", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> fmrmsFreqDev;
  @XmlElementRef(name = "FMDeviationCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> fmDeviationCode;
  @XmlElementRef(name = "FMPeakModulationIdx", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_3> fmPeakModulationIdx;
  @XmlElementRef(name = "CarrierSuppression", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> carrierSuppression;
  @XmlElementRef(name = "SidebandSuppression", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> sidebandSuppression;
  @XmlElementRef(name = "SidebandSuppressed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCSI> sidebandSuppressed;

  /**
   * Gets the value of the maxDevRatio property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_3> getMaxDevRatio() {
    return maxDevRatio;
  }

  /**
   * Sets the value of the maxDevRatio property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public void setMaxDevRatio(JAXBElement<TUN5_3> value) {
    this.maxDevRatio = value;
  }

  /**
   * Gets the value of the amIdx property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_3> getAMIdx() {
    return amIdx;
  }

  /**
   * Sets the value of the amIdx property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public void setAMIdx(JAXBElement<TUN5_3> value) {
    this.amIdx = value;
  }

  /**
   * Gets the value of the amrmsIdx property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_3> getAMRMSIdx() {
    return amrmsIdx;
  }

  /**
   * Sets the value of the amrmsIdx property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public void setAMRMSIdx(JAXBElement<TUN5_3> value) {
    this.amrmsIdx = value;
  }

  /**
   * Gets the value of the fmPeakFreqDev property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFMPeakFreqDev() {
    return fmPeakFreqDev;
  }

  /**
   * Sets the value of the fmPeakFreqDev property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFMPeakFreqDev(JAXBElement<TFreqM> value) {
    this.fmPeakFreqDev = value;
  }

  /**
   * Gets the value of the fmrmsFreqDev property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFMRMSFreqDev() {
    return fmrmsFreqDev;
  }

  /**
   * Sets the value of the fmrmsFreqDev property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFMRMSFreqDev(JAXBElement<TFreqM> value) {
    this.fmrmsFreqDev = value;
  }

  /**
   * Gets the value of the fmDeviationCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getFMDeviationCode() {
    return fmDeviationCode;
  }

  /**
   * Sets the value of the fmDeviationCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setFMDeviationCode(JAXBElement<TS25> value) {
    this.fmDeviationCode = value;
  }

  /**
   * Gets the value of the fmPeakModulationIdx property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_3> getFMPeakModulationIdx() {
    return fmPeakModulationIdx;
  }

  /**
   * Sets the value of the fmPeakModulationIdx property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}
   * <p>
   */
  public void setFMPeakModulationIdx(JAXBElement<TUN5_3> value) {
    this.fmPeakModulationIdx = value;
  }

  /**
   * Gets the value of the carrierSuppression property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getCarrierSuppression() {
    return carrierSuppression;
  }

  /**
   * Sets the value of the carrierSuppression property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setCarrierSuppression(JAXBElement<TdB> value) {
    this.carrierSuppression = value;
  }

  /**
   * Gets the value of the sidebandSuppression property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getSidebandSuppression() {
    return sidebandSuppression;
  }

  /**
   * Sets the value of the sidebandSuppression property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSidebandSuppression(JAXBElement<TdB> value) {
    this.sidebandSuppression = value;
  }

  /**
   * Gets the value of the sidebandSuppressed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCSI }{@code >}
   * <p>
   */
  public JAXBElement<TListCSI> getSidebandSuppressed() {
    return sidebandSuppressed;
  }

  /**
   * Sets the value of the sidebandSuppressed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCSI }{@code >}
   * <p>
   */
  public void setSidebandSuppressed(JAXBElement<TListCSI> value) {
    this.sidebandSuppressed = value;
  }

}
