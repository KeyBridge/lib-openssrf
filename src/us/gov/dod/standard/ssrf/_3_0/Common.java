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

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

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
 * &lt;complexType name="Common"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Initial"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}LastChange" minOccurs="0"/>
 * &lt;element name="State" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"
 * minOccurs="0"/> &lt;element name="SecurityClass"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}SecurityClass" minOccurs="0"/>
 * &lt;element name="CaseNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CaseNum"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="ExtReferenceRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ExtReferenceRef"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Remarks"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Remarks" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;attribute name="cls" use="required"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ListCCL" /> &lt;attribute
 * name="releasability" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Releasability"
 * /> &lt;attribute name="remarks"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" /> &lt;attribute
 * name="extReferences" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 * &lt;attribute name="legacyReleasability"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" /> &lt;attribute
 * name="quality" type="{urn:us:gov:dod:standard:ssrf:3.0.0}S255" />
 * &lt;attribute name="recommendedValue"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" /> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
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
public abstract class Common {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "EntryDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar entryDateTime;
  @XmlElement(name = "EntryBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString entryBy;
  @XmlElement(name = "Owner", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString owner;
  @XmlElement(name = "LastChangeDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar lastChangeDateTime;
  @XmlElement(name = "LastChangeBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString lastChangeBy;
  @XmlElement(name = "State", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString state;
  @XmlElement(name = "SecurityClass")
  protected SecurityClass securityClass;
  @XmlElement(name = "CaseNum")
  private List<CaseNum> caseNum;
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  private List<ExtReferenceRef> extReferenceRef;
  @XmlElement(name = "Remarks", nillable = true)
  private List<Remarks> remarks;
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  @XmlAttribute(name = "releasability")
  private List<ListCCY> releasability;
  @XmlAttribute(name = "remarks")
  private List<BigInteger> attributeRemarks;
  @XmlAttribute(name = "extReferences")
  private List<BigInteger> extReferences;
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
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value allowed object is {@link TSerial }
   * <p>
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the entryDateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TCalendar getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Sets the value of the entryDateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setEntryDateTime(TCalendar value) {
    this.entryDateTime = value;
  }

  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null);
  }

  /**
   * Gets the value of the entryBy property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getEntryBy() {
    return entryBy;
  }

  /**
   * Sets the value of the entryBy property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setEntryBy(TString value) {
    this.entryBy = value;
  }

  public boolean isSetEntryBy() {
    return (this.entryBy != null);
  }

  /**
   * Gets the value of the owner property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getOwner() {
    return owner;
  }

  /**
   * Sets the value of the owner property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setOwner(TString value) {
    this.owner = value;
  }

  public boolean isSetOwner() {
    return (this.owner != null);
  }

  /**
   * Gets the value of the lastChangeDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public TCalendar getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Sets the value of the lastChangeDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setLastChangeDateTime(TCalendar value) {
    this.lastChangeDateTime = value;
  }

  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null);
  }

  /**
   * Gets the value of the lastChangeBy property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Sets the value of the lastChangeBy property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLastChangeBy(TString value) {
    this.lastChangeBy = value;
  }

  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null);
  }

  /**
   * Gets the value of the state property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public TString getState() {
    return state;
  }

  /**
   * Sets the value of the state property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setState(TString value) {
    this.state = value;
  }

  public boolean isSetState() {
    return (this.state != null);
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

  public boolean isSetSecurityClass() {
    return (this.securityClass != null);
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
   * @return
   */
  public List<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new ArrayList<>();
    }
    return this.caseNum;
  }

  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  public void unsetCaseNum() {
    this.caseNum = null;
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
   * @return
   */
  public List<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new ArrayList<>();
    }
    return this.extReferenceRef;
  }

  public boolean isSetExtReferenceRef() {
    return ((this.extReferenceRef != null) && (!this.extReferenceRef.isEmpty()));
  }

  public void unsetExtReferenceRef() {
    this.extReferenceRef = null;
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
   * @return
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  public void unsetRemarks() {
    this.remarks = null;
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

  public boolean isSetCls() {
    return (this.cls != null);
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
   * @return
   */
  public List<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new ArrayList<>();
    }
    return this.releasability;
  }

  public boolean isSetReleasability() {
    return ((this.releasability != null) && (!this.releasability.isEmpty()));
  }

  public void unsetReleasability() {
    this.releasability = null;
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
   * @return
   */
  public List<BigInteger> getAttributeRemarks() {
    if (attributeRemarks == null) {
      attributeRemarks = new ArrayList<>();
    }
    return this.attributeRemarks;
  }

  public boolean isSetAttributeRemarks() {
    return ((this.attributeRemarks != null) && (!this.attributeRemarks.isEmpty()));
  }

  public void unsetAttributeRemarks() {
    this.attributeRemarks = null;
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
   * @return
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  public void unsetExtReferences() {
    this.extReferences = null;
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

  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
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

  public boolean isSetQuality() {
    return (this.quality != null);
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

  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
  }

  public Common withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public Common withEntryDateTime(Calendar value) {
    setEntryDateTime(new TCalendar(value));
    return this;
  }

  public Common withEntryBy(String value) {
    setEntryBy(new TString(value));
    return this;
  }

  public Common withOwner(String value) {
    setOwner(new TString(value));
    return this;
  }

  public Common withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new TCalendar(value));
    return this;
  }

  public Common withLastChangeBy(String value) {
    setLastChangeBy(new TString(value));
    return this;
  }

  public Common withState(String value) {
    setState(new TString(value));
    return this;
  }

  public Common withSecurityClass(SecurityClass value) {
    setSecurityClass(value);
    return this;
  }

  public Common withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withCaseNum(Collection<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return this;
  }

  public Common withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      getExtReferenceRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withExtReferenceRef(Collection<ExtReferenceRef> values) {
    if (values != null) {
      getExtReferenceRef().addAll(values);
    }
    return this;
  }

  public Common withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  public Common withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  public Common withReleasability(ListCCY... values) {
    if (values != null) {
      getReleasability().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withReleasability(Collection<ListCCY> values) {
    if (values != null) {
      getReleasability().addAll(values);
    }
    return this;
  }

  public Common withAttributeRemarks(BigInteger... values) {
    if (values != null) {
      getAttributeRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withAttributeRemarks(Collection<BigInteger> values) {
    if (values != null) {
      getAttributeRemarks().addAll(values);
    }
    return this;
  }

  public Common withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Common withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return this;
  }

  public Common withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return this;
  }

  public Common withQuality(String value) {
    setQuality(value);
    return this;
  }

  public Common withRecommendedValue(String value) {
    setRecommendedValue(value);
    return this;
  }

}
