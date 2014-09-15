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
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSI;

/**
 * Java class for TxModulation complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="TxModulation"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}RxModulation"> &lt;sequence>
 * &lt;element name="MaxDevRatio"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5_3" minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}AM" minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FM" minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Suppression" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
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
public class TxModulation extends RxModulation {

  @XmlElement(name = "MaxDevRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal maxDevRatio;
  @XmlElement(name = "AMIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amIdx;
  @XmlElement(name = "AMRMSIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal amrmsIdx;
  @XmlElement(name = "FMPeakFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmPeakFreqDev;
  @XmlElement(name = "FMRMSFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal fmrmsFreqDev;
  @XmlElement(name = "FMDeviationCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString fmDeviationCode;
  @XmlElement(name = "FMPeakModulationIdx", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_3.class)
  private TDecimal fmPeakModulationIdx;
  @XmlElement(name = "CarrierSuppression", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal carrierSuppression;
  @XmlElement(name = "SidebandSuppression", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal sidebandSuppression;
  @XmlElement(name = "SidebandSuppressed", required = false)
  private TString sidebandSuppressed;

  /**
   * Gets the value of the maxDevRatio property.
   * <p>
   * @return 
   */
  public TDecimal getMaxDevRatio() {
    return maxDevRatio;
  }

  /**
   * Sets the value of the maxDevRatio property.
   * <p>
   * @param value 
   */
  public void setMaxDevRatio(TDecimal value) {
    this.maxDevRatio = value;
  }

  public boolean isSetMaxDevRatio() {
    return (this.maxDevRatio != null);
  }

  /**
   * Gets the value of the amIdx property.
   * <p>
   * @return 
   */
  public TDecimal getAMIdx() {
    return amIdx;
  }

  /**
   * Sets the value of the amIdx property.
   * <p>
   * @param value 
   */
  public void setAMIdx(TDecimal value) {
    this.amIdx = value;
  }

  public boolean isSetAMIdx() {
    return (this.amIdx != null);
  }

  /**
   * Gets the value of the amrmsIdx property.
   * <p>
   * @return 
   */
  public TDecimal getAMRMSIdx() {
    return amrmsIdx;
  }

  /**
   * Sets the value of the amrmsIdx property.
   * <p>
   * @param value 
   */
  public void setAMRMSIdx(TDecimal value) {
    this.amrmsIdx = value;
  }

  public boolean isSetAMRMSIdx() {
    return (this.amrmsIdx != null);
  }

  /**
   * Gets the value of the fmPeakFreqDev property.
   * <p>
   * @return 
   */
  public TDecimal getFMPeakFreqDev() {
    return fmPeakFreqDev;
  }

  /**
   * Sets the value of the fmPeakFreqDev property.
   * <p>
   * @param value 
   */
  public void setFMPeakFreqDev(TDecimal value) {
    this.fmPeakFreqDev = value;
  }

  public boolean isSetFMPeakFreqDev() {
    return (this.fmPeakFreqDev != null);
  }

  /**
   * Gets the value of the fmrmsFreqDev property.
   * <p>
   * @return 
   */
  public TDecimal getFMRMSFreqDev() {
    return fmrmsFreqDev;
  }

  /**
   * Sets the value of the fmrmsFreqDev property.
   * <p>
   * @param value 
   */
  public void setFMRMSFreqDev(TDecimal value) {
    this.fmrmsFreqDev = value;
  }

  public boolean isSetFMRMSFreqDev() {
    return (this.fmrmsFreqDev != null);
  }

  /**
   * Gets the value of the fmDeviationCode property.
   * <p>
   * @return 
   */
  public TString getFMDeviationCode() {
    return fmDeviationCode;
  }

  /**
   * Sets the value of the fmDeviationCode property.
   * <p>
   * @param value 
   */
  public void setFMDeviationCode(TString value) {
    this.fmDeviationCode = value;
  }

  public boolean isSetFMDeviationCode() {
    return (this.fmDeviationCode != null);
  }

  /**
   * Gets the value of the fmPeakModulationIdx property.
   * <p>
   * @return 
   */
  public TDecimal getFMPeakModulationIdx() {
    return fmPeakModulationIdx;
  }

  /**
   * Sets the value of the fmPeakModulationIdx property.
   * <p>
   * @param value 
   */
  public void setFMPeakModulationIdx(TDecimal value) {
    this.fmPeakModulationIdx = value;
  }

  public boolean isSetFMPeakModulationIdx() {
    return (this.fmPeakModulationIdx != null);
  }

  /**
   * Gets the value of the carrierSuppression property.
   * <p>
   * @return 
   */
  public TDecimal getCarrierSuppression() {
    return carrierSuppression;
  }

  /**
   * Sets the value of the carrierSuppression property.
   * <p>
   * @param value 
   */
  public void setCarrierSuppression(TDecimal value) {
    this.carrierSuppression = value;
  }

  public boolean isSetCarrierSuppression() {
    return (this.carrierSuppression != null);
  }

  /**
   * Gets the value of the sidebandSuppression property.
   * <p>
   * @return 
   */
  public TDecimal getSidebandSuppression() {
    return sidebandSuppression;
  }

  /**
   * Sets the value of the sidebandSuppression property.
   * <p>
   * @param value 
   */
  public void setSidebandSuppression(TDecimal value) {
    this.sidebandSuppression = value;
  }

  public boolean isSetSidebandSuppression() {
    return (this.sidebandSuppression != null);
  }

  /**
   * Gets the value of the sidebandSuppressed property.
   * <p>
   * @return 
   */
  public TString getSidebandSuppressed() {
    return sidebandSuppressed;
  }

  /**
   * Sets the value of the sidebandSuppressed property.
   * <p>
   * @param value 
   */
  public void setSidebandSuppressed(TString value) {
    this.sidebandSuppressed = value;
  }

  public boolean isSetSidebandSuppressed() {
    return (this.sidebandSuppressed != null);
  }

  public TxModulation withMaxDevRatio(Double value) {
    setMaxDevRatio(new TDecimal(value));
    return this;
  }

  public TxModulation withAMIdx(Double value) {
    setAMIdx(new TDecimal(value));
    return this;
  }

  public TxModulation withAMRMSIdx(Double value) {
    setAMRMSIdx(new TDecimal(value));
    return this;
  }

  public TxModulation withFMPeakFreqDev(Double value) {
    setFMPeakFreqDev(new TDecimal(value));
    return this;
  }

  public TxModulation withFMRMSFreqDev(Double value) {
    setFMRMSFreqDev(new TDecimal(value));
    return this;
  }

  public TxModulation withFMDeviationCode(String value) {
    setFMDeviationCode(new TString(value));
    return this;
  }

  public TxModulation withFMPeakModulationIdx(Double value) {
    setFMPeakModulationIdx(new TDecimal(value));
    return this;
  }

  public TxModulation withCarrierSuppression(Double value) {
    setCarrierSuppression(new TDecimal(value));
    return this;
  }

  public TxModulation withSidebandSuppression(Double value) {
    setSidebandSuppression(new TDecimal(value));
    return this;
  }

  public TxModulation withSidebandSuppressed(ListCSI value) {
    setSidebandSuppressed(new TString(value.value()));
    return this;
  }

}
