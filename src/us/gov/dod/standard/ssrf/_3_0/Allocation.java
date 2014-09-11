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

import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for Allocation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Allocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllocatedService" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="AllocatedByFootnote" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Variance" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Variance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StnClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StnClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChannelPlanRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ChannelPlanRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="footnotes" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *       &lt;attribute name="bandApps" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *       &lt;attribute name="bandUsers" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation", propOrder = {
  "allocatedService",
  "priority",
  "effectiveDate",
  "expirationDate",
  "allocatedByFootnote",
  "variance",
  "stnClass",
  "channelPlanRef"
})
public class Allocation {

  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "AllocatedByFootnote", required = false)
  private TString allocatedByFootnote;
  @XmlElement(name = "Variance")
  private List<Variance> variance;
  @XmlElement(name = "StnClass", nillable = true)
  private List<StnClass> stnClass;
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  private List<ChannelPlanRef> channelPlanRef;
  @XmlAttribute(name = "footnotes")
  private List<BigInteger> footnotes;
  @XmlAttribute(name = "bandApps")
  private List<BigInteger> bandApps;
  @XmlAttribute(name = "bandUsers")
  private List<BigInteger> bandUsers;

  /**
   * Gets the value of the allocatedService property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Sets the value of the allocatedService property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setAllocatedService(TString value) {
    this.allocatedService = value;
  }

  public boolean isSetAllocatedService() {
    return (this.allocatedService != null);
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is {@link TS10 }
   * <p>
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is {@link TS10 }
   * <p>
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
  }

  /**
   * Gets the value of the allocatedByFootnote property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getAllocatedByFootnote() {
    return allocatedByFootnote;
  }

  /**
   * Sets the value of the allocatedByFootnote property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setAllocatedByFootnote(TString value) {
    this.allocatedByFootnote = value;
  }

  public boolean isSetAllocatedByFootnote() {
    return (this.allocatedByFootnote != null);
  }

  /**
   * Gets the value of the variance property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the variance property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVariance().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Variance }
   * <p>
   * <p>
   * @return
   */
  public List<Variance> getVariance() {
    if (variance == null) {
      variance = new ArrayList<>();
    }
    return this.variance;
  }

  public boolean isSetVariance() {
    return ((this.variance != null) && (!this.variance.isEmpty()));
  }

  public void unsetVariance() {
    this.variance = null;
  }

  /**
   * Gets the value of the stnClass property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stnClass property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStnClass().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link StnClass }
   * <p>
   * <p>
   * @return
   */
  public List<StnClass> getStnClass() {
    if (stnClass == null) {
      stnClass = new ArrayList<>();
    }
    return this.stnClass;
  }

  public boolean isSetStnClass() {
    return ((this.stnClass != null) && (!this.stnClass.isEmpty()));
  }

  public void unsetStnClass() {
    this.stnClass = null;
  }

  /**
   * Gets the value of the channelPlanRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelPlanRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelPlanRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ChannelPlanRef }
   * <p>
   * <p>
   * @return
   */
  public List<ChannelPlanRef> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new ArrayList<>();
    }
    return this.channelPlanRef;
  }

  public boolean isSetChannelPlanRef() {
    return ((this.channelPlanRef != null) && (!this.channelPlanRef.isEmpty()));
  }

  public void unsetChannelPlanRef() {
    this.channelPlanRef = null;
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
   * @return
   */
  public List<BigInteger> getFootnotes() {
    if (footnotes == null) {
      footnotes = new ArrayList<>();
    }
    return this.footnotes;
  }

  public boolean isSetFootnotes() {
    return ((this.footnotes != null) && (!this.footnotes.isEmpty()));
  }

  public void unsetFootnotes() {
    this.footnotes = null;
  }

  /**
   * Gets the value of the bandApps property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandApps property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandApps().add(newItem);
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
  public List<BigInteger> getBandApps() {
    if (bandApps == null) {
      bandApps = new ArrayList<>();
    }
    return this.bandApps;
  }

  public boolean isSetBandApps() {
    return ((this.bandApps != null) && (!this.bandApps.isEmpty()));
  }

  public void unsetBandApps() {
    this.bandApps = null;
  }

  /**
   * Gets the value of the bandUsers property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandUsers property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandUsers().add(newItem);
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
  public List<BigInteger> getBandUsers() {
    if (bandUsers == null) {
      bandUsers = new ArrayList<>();
    }
    return this.bandUsers;
  }

  public boolean isSetBandUsers() {
    return ((this.bandUsers != null) && (!this.bandUsers.isEmpty()));
  }

  public void unsetBandUsers() {
    this.bandUsers = null;
  }

  public Allocation withAllocatedService(String value) {
    setAllocatedService(new TString(value));
    return this;
  }

  public Allocation withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  public Allocation withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public Allocation withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public Allocation withAllocatedByFootnote(ListCBO value) {
    setAllocatedByFootnote(new TString(value.value()));
    return this;
  }

  public Allocation withVariance(Variance... values) {
    if (values != null) {
      getVariance().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withVariance(Collection<Variance> values) {
    if (values != null) {
      getVariance().addAll(values);
    }
    return this;
  }

  public Allocation withStnClass(StnClass... values) {
    if (values != null) {
      getStnClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withStnClass(Collection<StnClass> values) {
    if (values != null) {
      getStnClass().addAll(values);
    }
    return this;
  }

  public Allocation withChannelPlanRef(ChannelPlanRef... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withChannelPlanRef(Collection<ChannelPlanRef> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  public Allocation withFootnotes(BigInteger... values) {
    if (values != null) {
      getFootnotes().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withFootnotes(Collection<BigInteger> values) {
    if (values != null) {
      getFootnotes().addAll(values);
    }
    return this;
  }

  public Allocation withBandApps(BigInteger... values) {
    if (values != null) {
      getBandApps().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withBandApps(Collection<BigInteger> values) {
    if (values != null) {
      getBandApps().addAll(values);
    }
    return this;
  }

  public Allocation withBandUsers(BigInteger... values) {
    if (values != null) {
      getBandUsers().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allocation withBandUsers(Collection<BigInteger> values) {
    if (values != null) {
      getBandUsers().addAll(values);
    }
    return this;
  }

}
