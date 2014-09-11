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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;

/**
 * <p>
 * Java class for Receiver complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Receiver"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Generic" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/>
 * &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Duplex" minOccurs="0"/>
 * &lt;element name="PreselectionType"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS60" minOccurs="0"/> &lt;element
 * name="ConductedEmissions" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBm"
 * minOccurs="0"/> &lt;element name="FCCAcceptanceNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="TSPR" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 * &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Nomenclature"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Deployment"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Deployment" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Curve"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Curve" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="RxMode"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxMode" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receiver", propOrder = {
  "generic",
  "duplexSep",
  "duplexSepType",
  "preselectionType",
  "conductedEmissions",
  "fccAcceptanceNum",
  "tspr",
  "pocInformation",
  "nomenclature",
  "deployment",
  "curve",
  "rxMode"
})
public class Receiver extends Common {

  @XmlElement(name = "Generic", required = true)
  private TString generic;
  @XmlElement(name = "DuplexSep")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal duplexSep;
  @XmlElement(name = "DuplexSepType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString duplexSepType;
  @XmlElement(name = "PreselectionType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS60.class)
  private TString preselectionType;
  @XmlElement(name = "ConductedEmissions", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBM.class)
  private TDecimal conductedEmissions;
  @XmlElement(name = "FCCAcceptanceNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString fccAcceptanceNum;
  @XmlElement(name = "TSPR", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString tspr;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  @XmlElement(name = "Deployment")
  private List<Deployment> deployment;
  @XmlElement(name = "Curve")
  private List<Curve> curve;
  @XmlElement(name = "RxMode")
  private List<RxMode> rxMode;

  /**
   * Gets the value of the generic property.
   * <p>
   * @return 
   */
  public TString getGeneric() {
    return generic;
  }

  /**
   * Sets the value of the generic property.
   * <p>
   * @param value 
   */
  public void setGeneric(TString value) {
    this.generic = value;
  }

  public boolean isSetGeneric() {
    return (this.generic != null);
  }

  /**
   * Gets the value of the duplexSep property.
   * <p>
   * @return 
   */
  public TDecimal getDuplexSep() {
    return duplexSep;
  }

  /**
   * Sets the value of the duplexSep property.
   * <p>
   * @param value 
   */
  public void setDuplexSep(TDecimal value) {
    this.duplexSep = value;
  }

  public boolean isSetDuplexSep() {
    return (this.duplexSep != null);
  }

  /**
   * Gets the value of the duplexSepType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDuplexSepType() {
    return duplexSepType;
  }

  /**
   * Sets the value of the duplexSepType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDuplexSepType(TString value) {
    this.duplexSepType = value;
  }

  public boolean isSetDuplexSepType() {
    return (this.duplexSepType != null);
  }

  /**
   * Gets the value of the preselectionType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPreselectionType() {
    return preselectionType;
  }

  /**
   * Sets the value of the preselectionType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPreselectionType(TString value) {
    this.preselectionType = value;
  }

  public boolean isSetPreselectionType() {
    return (this.preselectionType != null);
  }

  /**
   * Gets the value of the conductedEmissions property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getConductedEmissions() {
    return conductedEmissions;
  }

  /**
   * Sets the value of the conductedEmissions property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setConductedEmissions(TDecimal value) {
    this.conductedEmissions = value;
  }

  public boolean isSetConductedEmissions() {
    return (this.conductedEmissions != null);
  }

  /**
   * Gets the value of the fccAcceptanceNum property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getFCCAcceptanceNum() {
    return fccAcceptanceNum;
  }

  /**
   * Sets the value of the fccAcceptanceNum property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFCCAcceptanceNum(TString value) {
    this.fccAcceptanceNum = value;
  }

  public boolean isSetFCCAcceptanceNum() {
    return (this.fccAcceptanceNum != null);
  }

  /**
   * Gets the value of the tspr property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getTSPR() {
    return tspr;
  }

  /**
   * Sets the value of the tspr property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTSPR(TString value) {
    this.tspr = value;
  }

  public boolean isSetTSPR() {
    return (this.tspr != null);
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
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
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the nomenclature property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the nomenclature property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNomenclature().add(newItem);
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
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Gets the value of the deployment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the deployment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDeployment().add(newItem);
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
  public List<Deployment> getDeployment() {
    if (deployment == null) {
      deployment = new ArrayList<>();
    }
    return this.deployment;
  }

  public boolean isSetDeployment() {
    return ((this.deployment != null) && (!this.deployment.isEmpty()));
  }

  public void unsetDeployment() {
    this.deployment = null;
  }

  /**
   * Gets the value of the curve property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the curve property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurve().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<Curve> getCurve() {
    if (curve == null) {
      curve = new ArrayList<>();
    }
    return this.curve;
  }

  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  public void unsetCurve() {
    this.curve = null;
  }

  /**
   * Gets the value of the rxMode property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxMode property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxMode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<RxMode> getRxMode() {
    if (rxMode == null) {
      rxMode = new ArrayList<>();
    }
    return this.rxMode;
  }

  public boolean isSetRxMode() {
    return ((this.rxMode != null) && (!this.rxMode.isEmpty()));
  }

  public void unsetRxMode() {
    this.rxMode = null;
  }

  public Receiver withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  public Receiver withDuplexSep(Double value) {
    setDuplexSep(new TDecimal(value));
    return this;
  }

  public Receiver withDuplexSepType(String value) {
    setDuplexSepType(new TString(value));
    return this;
  }

  public Receiver withPreselectionType(String value) {
    setPreselectionType(new TString(value));
    return this;
  }

  public Receiver withConductedEmissions(Double value) {
    setConductedEmissions(new TDecimal(value));
    return this;
  }

  public Receiver withFCCAcceptanceNum(String value) {
    setFCCAcceptanceNum(new TString(value));
    return this;
  }

  public Receiver withTSPR(String value) {
    setTSPR(new TString(value));
    return this;
  }

  public Receiver withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Receiver withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Receiver withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Receiver withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  public Receiver withDeployment(Deployment... values) {
    if (values != null) {
      getDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Receiver withDeployment(Collection<Deployment> values) {
    if (values != null) {
      getDeployment().addAll(values);
    }
    return this;
  }

  public Receiver withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Receiver withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  public Receiver withRxMode(RxMode... values) {
    if (values != null) {
      getRxMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Receiver withRxMode(Collection<RxMode> values) {
    if (values != null) {
      getRxMode().addAll(values);
    }
    return this;
  }

}
