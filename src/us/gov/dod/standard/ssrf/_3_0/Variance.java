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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for Variance complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Variance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"/>
 *         &lt;element name="AllocatedService" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"/>
 *         &lt;element name="Administration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Administration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", propOrder = {
  "type",
  "allocatedService",
  "priority",
  "administration"
})
public class Variance {

  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
  @XmlElement(name = "Administration", nillable = true)
  private List<Administration> administration;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is {@link TS10 }
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is {@link TS10 }
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

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
   * Gets the value of the administration property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the administration property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAdministration().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Administration }
   * <p>
   * <p>
   * @return
   */
  public List<Administration> getAdministration() {
    if (administration == null) {
      administration = new ArrayList<>();
    }
    return this.administration;
  }

  public boolean isSetAdministration() {
    return ((this.administration != null) && (!this.administration.isEmpty()));
  }

  public void unsetAdministration() {
    this.administration = null;
  }

  public Variance withType(String value) {
    setType(new TString(value));
    return this;
  }

  public Variance withAllocatedService(String value) {
    setAllocatedService(new TString(value));
    return this;
  }

  public Variance withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  public Variance withAdministration(Administration... values) {
    if (values != null) {
      getAdministration().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Variance withAdministration(Collection<Administration> values) {
    if (values != null) {
      getAdministration().addAll(values);
    }
    return this;
  }

}
