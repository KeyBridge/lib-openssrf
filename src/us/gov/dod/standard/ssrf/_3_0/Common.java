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

import us.gov.dod.standard.ssrf._3_0.datatype.TDT;
import us.gov.dod.standard.ssrf._3_0.datatype.TSerial;
import us.gov.dod.standard.ssrf._3_0.datatype.TS10;
import us.gov.dod.standard.ssrf._3_0.datatype.TOA;
import us.gov.dod.standard.ssrf._3_0.enumerated.ListCCY;
import us.gov.dod.standard.ssrf._3_0.enumerated.ListCCL;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Common complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Initial"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}LastChange" minOccurs="0"/>
 *         &lt;element name="State" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="SecurityClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SecurityClass" minOccurs="0"/>
 *         &lt;element name="CaseNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CaseNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtReferenceRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ExtReferenceRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Remarks" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cls" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ListCCL" />
 *       &lt;attribute name="releasability" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Releasability" />
 *       &lt;attribute name="remarks" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *       &lt;attribute name="extReferences" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *       &lt;attribute name="legacyReleasability" type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" />
 *       &lt;attribute name="quality" type="{urn:us:gov:dod:standard:ssrf:3.0.0}S255" />
 *       &lt;attribute name="recommendedValue" type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
  "serial",
  "entryDateTime",
  "entryBy",
  "owner",
  "lastChangeDateTime",
  "lastChangeBy",
  "state",
  "securityClass",
  "caseNum",
  "extReferenceRef",
  "remarks"
})
@XmlSeeAlso({
  Receiver.class,
  Organisation.class,
  Role.class,
  Satellite.class,
  ChannelPlan.class,
  Administrative.class,
  Antenna.class,
  Allotment.class,
  JRFL.class,
  Location.class,
  ExternalReference.class,
  Note.class,
  IntfReport.class,
  RFSystem.class,
  FEDeployment.class,
  SSRequest.class,
  ForceElement.class,
  SSReply.class,
  Transmitter.class,
  Assignment.class,
  Contact.class,
  TOA.class
})
public class Common {

  @XmlElement(name = "Serial", required = true)
  protected TSerial serial;
  @XmlElement(name = "EntryDateTime", required = true)
  protected TDT entryDateTime;
  @XmlElementRef(name = "EntryBy", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> entryBy;
  @XmlElementRef(name = "Owner", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> owner;
  @XmlElementRef(name = "LastChangeDateTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDT> lastChangeDateTime;
  @XmlElementRef(name = "LastChangeBy", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> lastChangeBy;
  @XmlElementRef(name = "State", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> state;
  @XmlElement(name = "SecurityClass")
  protected SecurityClass securityClass;
  @XmlElement(name = "CaseNum")
  protected List<CaseNum> caseNum;
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  protected List<ExtReferenceRef> extReferenceRef;
  @XmlElement(name = "Remarks", nillable = true)
  protected List<Remarks> remarks;
  @XmlAttribute(name = "cls", required = true)
  protected ListCCL cls;
  @XmlAttribute(name = "releasability")
  protected List<ListCCY> releasability;
  @XmlAttribute(name = "remarks")
  protected List<BigInteger> attributeRemarks;
  @XmlAttribute(name = "extReferences")
  protected List<BigInteger> extReferences;
  @XmlAttribute(name = "legacyReleasability")
  protected String legacyReleasability;
  @XmlAttribute(name = "quality")
  protected String quality;
  @XmlAttribute(name = "recommendedValue")
  protected String recommendedValue;

  /**
   * Gets the value of the serial property.
   * <p>
   * @return possible object is {@link TSerial }
   * <p>
   */
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value allowed object is {@link TSerial }
   * <p>
   */
  public void setSerial(TSerial value) {
    this.serial = value;
  }

  /**
   * Gets the value of the entryDateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TDT getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Sets the value of the entryDateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setEntryDateTime(TDT value) {
    this.entryDateTime = value;
  }

  /**
   * Gets the value of the entryBy property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getEntryBy() {
    return entryBy;
  }

  /**
   * Sets the value of the entryBy property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setEntryBy(JAXBElement<TSerial> value) {
    this.entryBy = value;
  }

  /**
   * Gets the value of the owner property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getOwner() {
    return owner;
  }

  /**
   * Sets the value of the owner property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setOwner(JAXBElement<TSerial> value) {
    this.owner = value;
  }

  /**
   * Gets the value of the lastChangeDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public JAXBElement<TDT> getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Sets the value of the lastChangeDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setLastChangeDateTime(JAXBElement<TDT> value) {
    this.lastChangeDateTime = value;
  }

  /**
   * Gets the value of the lastChangeBy property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Sets the value of the lastChangeBy property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLastChangeBy(JAXBElement<TSerial> value) {
    this.lastChangeBy = value;
  }

  /**
   * Gets the value of the state property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getState() {
    return state;
  }

  /**
   * Sets the value of the state property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setState(JAXBElement<TS10> value) {
    this.state = value;
  }

  /**
   * Gets the value of the securityClass property.
   * <p>
   * @return possible object is {@link SecurityClass }
   * <p>
   */
  public SecurityClass getSecurityClass() {
    return securityClass;
  }

  /**
   * Sets the value of the securityClass property.
   * <p>
   * @param value allowed object is {@link SecurityClass }
   * <p>
   */
  public void setSecurityClass(SecurityClass value) {
    this.securityClass = value;
  }

  /**
   * Gets the value of the caseNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the caseNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCaseNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link CaseNum }
   * <p>
   * <p>
   */
  public List<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new ArrayList<>();
    }
    return this.caseNum;
  }

  /**
   * Gets the value of the extReferenceRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the extReferenceRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtReferenceRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ExtReferenceRef }
   * <p>
   * <p>
   */
  public List<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new ArrayList<>();
    }
    return this.extReferenceRef;
  }

  /**
   * Gets the value of the remarks property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the remarks property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRemarks().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Remarks }
   * <p>
   * <p>
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  /**
   * Gets the value of the cls property.
   * <p>
   * @return possible object is {@link ListCCL }
   * <p>
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Sets the value of the cls property.
   * <p>
   * @param value allowed object is {@link ListCCL }
   * <p>
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Gets the value of the releasability property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the releasability property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getReleasability().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ListCCY }
   * <p>
   * <p>
   */
  public List<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new ArrayList<>();
    }
    return this.releasability;
  }

  /**
   * Gets the value of the attributeRemarks property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the attributeRemarks property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAttributeRemarks().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   */
  public List<BigInteger> getAttributeRemarks() {
    if (attributeRemarks == null) {
      attributeRemarks = new ArrayList<>();
    }
    return this.attributeRemarks;
  }

  /**
   * Gets the value of the extReferences property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the extReferences property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtReferences().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  /**
   * Gets the value of the legacyReleasability property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Sets the value of the legacyReleasability property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Gets the value of the quality property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Sets the value of the quality property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Gets the value of the recommendedValue property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Sets the value of the recommendedValue property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

}
