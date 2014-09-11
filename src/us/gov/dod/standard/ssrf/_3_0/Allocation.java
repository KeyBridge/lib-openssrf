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
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.ChannelPlanRef;
import us.gov.dod.standard.ssrf._3_0.metadata.StnClass;

/**
 * This element contains the allocation of a specific frequency band to a
 * specific radiocommunication service.
 * <p>
 * Java class for Allocation complex type.
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

  /**
   * AllocatedService: Enter a radiocommunication service recognized by an
   * administration that is allocated to this frequency band (e.g., "Fixed
   * Service").
   * <p>
   * Recommend values from Code List CSN.
   */
  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  /**
   * Priority: Indicate if this service is a primary or secondary use of this
   * band. ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * Recommend values from Code List CPS
   */
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
  /**
   * EffectiveDate: This data element indicates the date/time by which the
   * dataset is to be operational or effective, formatted as yyyy-mm-dd
   * (year-month-day).
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate: Enter the date at which the dataset will expire, formatted
   * as yyyy-mm-dd (year-month-day). The Expiration date should be less than
   * five years from current date.
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * AllocatedByFootnote: Enter "Yes" if this service is allocated to this
   * frequency band by footnote (i.e., the only indication this service is
   * allowed in this band is a footnote). Additional restrictions might exist in
   * the footnote(s).
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "AllocatedByFootnote", required = false)
  private TString allocatedByFootnote;
  /**
   * This element indicates if the local allocation deviates from an upper level
   * allocation (e.g. a national allocation not aligned with the ITU RR).
   */
  @XmlElement(name = "Variance")
  private List<Variance> variance;
  /**
   * This element contains the station class associated with the frequency
   * usage.
   * <p>
   * Allowable Station Class values are defined by the appropriate
   * Administration. This data item MUST use one of the codes from Code List USC
   */
  @XmlElement(name = "StnClass", nillable = true)
  private List<StnClass> stnClass;
  /**
   * This element refers to a ChannelPlan, which inherits attributes and
   * sub-elements from element Common and describes a channel plan.
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  private List<ChannelPlanRef> channelPlanRef;

  /**
   * footnotes (Attribute): Enter the list of footnote indices referring to a
   * Footnote index applicable to the current frequency band.
   */
  @XmlAttribute(name = "footnotes")
  private List<BigInteger> footnotes;
  /**
   * bandApps (Attribute): Enter the list of Band Application indices referring
   * to a BandApplication index applicable to the current frequency band.
   */
  @XmlAttribute(name = "bandApps")
  private List<BigInteger> bandApps;
  /**
   * bandUsers (Attribute): Enter the list of Band User indices referring to a
   * BandUser index applicable to the current frequency band.
   */
  @XmlAttribute(name = "bandUsers")
  private List<BigInteger> bandUsers;

  /**
   * Gets the value of the allocatedService property.
   * <p>
   * @return
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Sets the value of the allocatedService property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value
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
   * @return
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
  }

  /**
   * Gets the value of the allocatedByFootnote property.
   * <p>
   * @return
   */
  public TString getAllocatedByFootnote() {
    return allocatedByFootnote;
  }

  /**
   * Sets the value of the allocatedByFootnote property.
   * <p>
   * @param value   */
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
   * Objects of the following type(s) are allowed in the list
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
   * Objects of the following type(s) are allowed in the list
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
   * <p>
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
   * <p>
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
   * <p>
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
   * <p>
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
