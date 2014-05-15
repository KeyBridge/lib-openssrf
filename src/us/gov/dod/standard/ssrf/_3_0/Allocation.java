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
  protected TS100 allocatedService;
  @XmlElement(name = "Priority", required = true)
  protected TS10 priority;
  @XmlElementRef(name = "EffectiveDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "AllocatedByFootnote", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> allocatedByFootnote;
  @XmlElement(name = "Variance")
  protected List<Variance> variance;
  @XmlElement(name = "StnClass", nillable = true)
  protected List<StnClass> stnClass;
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  protected List<ChannelPlanRef> channelPlanRef;
  @XmlAttribute(name = "footnotes")
  protected List<BigInteger> footnotes;
  @XmlAttribute(name = "bandApps")
  protected List<BigInteger> bandApps;
  @XmlAttribute(name = "bandUsers")
  protected List<BigInteger> bandUsers;

  /**
   * Gets the value of the allocatedService property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getAllocatedService() {
    return allocatedService;
  }

  /**
   * Sets the value of the allocatedService property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setAllocatedService(TS100 value) {
    this.allocatedService = value;
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is {@link TS10 }
   * <p>
   */
  public TS10 getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is {@link TS10 }
   * <p>
   */
  public void setPriority(TS10 value) {
    this.priority = value;
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setEffectiveDate(JAXBElement<TD> value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(JAXBElement<TD> value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the allocatedByFootnote property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getAllocatedByFootnote() {
    return allocatedByFootnote;
  }

  /**
   * Sets the value of the allocatedByFootnote property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setAllocatedByFootnote(JAXBElement<TListCBO> value) {
    this.allocatedByFootnote = value;
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
   */
  public List<Variance> getVariance() {
    if (variance == null) {
      variance = new ArrayList<>();
    }
    return this.variance;
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
   */
  public List<StnClass> getStnClass() {
    if (stnClass == null) {
      stnClass = new ArrayList<>();
    }
    return this.stnClass;
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
   */
  public List<ChannelPlanRef> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new ArrayList<>();
    }
    return this.channelPlanRef;
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
   */
  public List<BigInteger> getBandApps() {
    if (bandApps == null) {
      bandApps = new ArrayList<>();
    }
    return this.bandApps;
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
   */
  public List<BigInteger> getBandUsers() {
    if (bandUsers == null) {
      bandUsers = new ArrayList<>();
    }
    return this.bandUsers;
  }

}
