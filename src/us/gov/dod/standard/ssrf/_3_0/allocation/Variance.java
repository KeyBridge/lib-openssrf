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
package us.gov.dod.standard.ssrf._3_0.allocation;

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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.Administration;

/**
 * Java class for Variance complex type.
 * <p>
 * This element indicates if the local allocation deviates from an upper level
 * allocation (e.g. a national allocation not aligned with the ITU RR).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", propOrder = {
  "type",
  "allocatedService",
  "priority",
  "administration"
})
public class Variance {

  /**
   * Type: Enter the type of variance. Recommend values from Code List CAV:
   * <p>
   * Additional Different
   */
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  /**
   * AllocatedService: Enter a radiocommunication service recognized by an
   * administration that is allocated to this frequency band (e.g., "Fixed
   * Service"). Recommend values from Code List CSN.
   */
  @XmlElement(name = "AllocatedService", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString allocatedService;
  /**
   * Priority: Indicate if this service is a primary or secondary use of this
   * band. ("Permitted" SHOULD only be used if the priority is unknown.)
   * Recommend values from Code List CPS:
   * <p>
   * Primary Secondary Permitted Other
   */
  @XmlElement(name = "Priority", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;
  @XmlElement(name = "Administration", nillable = true)
  private List<Administration> administration;

  /**
   * Gets the value of the type property.
   * <p>
   * @return 
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value 
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
     * 
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
