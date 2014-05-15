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
 * Java class for Receiver complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Receiver">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Generic" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Duplex" minOccurs="0"/>
 *         &lt;element name="PreselectionType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS60" minOccurs="0"/>
 *         &lt;element name="ConductedEmissions" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBm" minOccurs="0"/>
 *         &lt;element name="FCCAcceptanceNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="TSPR" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Deployment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Deployment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Curve" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Curve" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RxMode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxMode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
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
public class Receiver
  extends Common {

  @XmlElement(name = "Generic", required = true)
  protected TListCBO generic;
  @XmlElement(name = "DuplexSep")
  protected TFreqM duplexSep;
  @XmlElementRef(name = "DuplexSepType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> duplexSepType;
  @XmlElementRef(name = "PreselectionType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS60> preselectionType;
  @XmlElementRef(name = "ConductedEmissions", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_DBm> conductedEmissions;
  @XmlElementRef(name = "FCCAcceptanceNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> fccAcceptanceNum;
  @XmlElementRef(name = "TSPR", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> tspr;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "Nomenclature")
  protected List<Nomenclature> nomenclature;
  @XmlElement(name = "Deployment")
  protected List<Deployment> deployment;
  @XmlElement(name = "Curve")
  protected List<Curve> curve;
  @XmlElement(name = "RxMode")
  protected List<RxMode> rxMode;

  /**
   * Gets the value of the generic property.
   * <p>
   * @return possible object is {@link TListCBO }
   * <p>
   */
  public TListCBO getGeneric() {
    return generic;
  }

  /**
   * Sets the value of the generic property.
   * <p>
   * @param value allowed object is {@link TListCBO }
   * <p>
   */
  public void setGeneric(TListCBO value) {
    this.generic = value;
  }

  /**
   * Gets the value of the duplexSep property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getDuplexSep() {
    return duplexSep;
  }

  /**
   * Sets the value of the duplexSep property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setDuplexSep(TFreqM value) {
    this.duplexSep = value;
  }

  /**
   * Gets the value of the duplexSepType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getDuplexSepType() {
    return duplexSepType;
  }

  /**
   * Sets the value of the duplexSepType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setDuplexSepType(JAXBElement<TS10> value) {
    this.duplexSepType = value;
  }

  /**
   * Gets the value of the preselectionType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS60 }{@code >}
   * <p>
   */
  public JAXBElement<TS60> getPreselectionType() {
    return preselectionType;
  }

  /**
   * Sets the value of the preselectionType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS60 }{@code >}
   * <p>
   */
  public void setPreselectionType(JAXBElement<TS60> value) {
    this.preselectionType = value;
  }

  /**
   * Gets the value of the conductedEmissions property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBm }{@code >}
   * <p>
   */
  public JAXBElement<TUS_DBm> getConductedEmissions() {
    return conductedEmissions;
  }

  /**
   * Sets the value of the conductedEmissions property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBm }{@code >}
   * <p>
   */
  public void setConductedEmissions(JAXBElement<TUS_DBm> value) {
    this.conductedEmissions = value;
  }

  /**
   * Gets the value of the fccAcceptanceNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getFCCAcceptanceNum() {
    return fccAcceptanceNum;
  }

  /**
   * Sets the value of the fccAcceptanceNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setFCCAcceptanceNum(JAXBElement<TS50> value) {
    this.fccAcceptanceNum = value;
  }

  /**
   * Gets the value of the tspr property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getTSPR() {
    return tspr;
  }

  /**
   * Sets the value of the tspr property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setTSPR(JAXBElement<TS10> value) {
    this.tspr = value;
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
     * {@link POCInformation }
   * <p>
   * <p>
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
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
     * {@link Nomenclature }
   * <p>
   * <p>
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
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
     * {@link Deployment }
   * <p>
   * <p>
   */
  public List<Deployment> getDeployment() {
    if (deployment == null) {
      deployment = new ArrayList<>();
    }
    return this.deployment;
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
   * Objects of the following type(s) are allowed in the list {@link Curve }
   * <p>
   * <p>
   */
  public List<Curve> getCurve() {
    if (curve == null) {
      curve = new ArrayList<>();
    }
    return this.curve;
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
   * Objects of the following type(s) are allowed in the list {@link RxMode }
   * <p>
   * <p>
   */
  public List<RxMode> getRxMode() {
    if (rxMode == null) {
      rxMode = new ArrayList<>();
    }
    return this.rxMode;
  }

}
