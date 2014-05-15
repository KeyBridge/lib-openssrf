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
 * Java class for Allotment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Allotment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="UsageType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="DateResponseRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview"/>
 *         &lt;element name="Requirement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Project" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LocationRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}LocationRef" maxOccurs="unbounded"/>
 *         &lt;element name="Emission" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Emission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllotFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AllotFreq" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allotment", propOrder = {
  "title",
  "usageType",
  "dateResponseRequired",
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "requirement",
  "project",
  "pocInformation",
  "locationRef",
  "emission",
  "allotFreq"
})
public class Allotment
  extends Common {

  @XmlElementRef(name = "Title", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> title;
  @XmlElementRef(name = "UsageType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> usageType;
  @XmlElementRef(name = "DateResponseRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> dateResponseRequired;
  @XmlElement(name = "EffectiveDate", required = true)
  protected TD effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElementRef(name = "Requirement", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> requirement;
  @XmlElement(name = "Project")
  protected List<Project> project;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "LocationRef", required = true, nillable = true)
  protected List<LocationRef> locationRef;
  @XmlElement(name = "Emission")
  protected List<Emission> emission;
  @XmlElement(name = "AllotFreq", required = true)
  protected List<AllotFreq> allotFreq;

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setTitle(JAXBElement<TS100> value) {
    this.title = value;
  }

  /**
   * Gets the value of the usageType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getUsageType() {
    return usageType;
  }

  /**
   * Sets the value of the usageType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setUsageType(JAXBElement<TS25> value) {
    this.usageType = value;
  }

  /**
   * Gets the value of the dateResponseRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Sets the value of the dateResponseRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDateResponseRequired(JAXBElement<TD> value) {
    this.dateResponseRequired = value;
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TD getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setEffectiveDate(TD value) {
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
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the requirement property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getRequirement() {
    return requirement;
  }

  /**
   * Sets the value of the requirement property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setRequirement(JAXBElement<TMEMO> value) {
    this.requirement = value;
  }

  /**
   * Gets the value of the project property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Project }
   * <p>
   * <p>
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
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
   * Gets the value of the locationRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the locationRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocationRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link LocationRef }
   * <p>
   * <p>
   */
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  /**
   * Gets the value of the emission property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the emission property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEmission().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Emission }
   * <p>
   * <p>
   */
  public List<Emission> getEmission() {
    if (emission == null) {
      emission = new ArrayList<>();
    }
    return this.emission;
  }

  /**
   * Gets the value of the allotFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allotFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAllotFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AllotFreq }
   * <p>
   * <p>
   */
  public List<AllotFreq> getAllotFreq() {
    if (allotFreq == null) {
      allotFreq = new ArrayList<>();
    }
    return this.allotFreq;
  }

}
