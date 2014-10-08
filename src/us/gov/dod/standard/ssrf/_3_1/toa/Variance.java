/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.toa;

import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAV;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPS;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSN;

/**
 * Variance indicates if the local allocation deviates from an upper level
 * allocation (e.g. a national allocation not aligned with the ITU RR).
 * <p>
 * Element of {@link Allocation}
 * <p>
 * Sub-Element is {@link Administration}
 * <p>
 * Example:
 * <pre>
 * &lt;Variance&gt;
 *   &lt;Type cls="U"&gt;Additional&lt;/Type&gt;
 *   &lt;AllocatedService cls="U"&gt;Aeronautical Mobile (Off Route) Service&lt;/
 *   AllocatedService&gt;
 *   &lt;Priority cls="U"&gt;Permitted&lt;/Priority&gt;
 * &lt;/Variance&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   * Type - Type (Required)
   * <p>
   * The type of variance.
   * <p>
   * Format is L:CAV
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * AllocatedService - Allocated Service (Required)
   * <p>
   * A radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * Format is L:CSN
   */
  @XmlElement(name = "AllocatedService", required = true)
  private TString allocatedService;
  /**
   * Priority - Priority (Required)
   * <p>
   * If this service is a primary or secondary use of this band. ("Permitted"
   * SHOULD only be used if the priority is unknown.)
   * <p>
   * Format is L:CPS
   */
  @XmlElement(name = "Priority", required = true)
  private TString priority;
  /**
   * Administration (Optional)
   * <p>
   * Administration contains the country for which this variance applies.
   */
  @XmlElement(name = "Administration", nillable = true)
  private Set<TString> administration;

  /**
   * Get the type of variance.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of variance.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @return the AllocatedService value in a {@link TString} data type
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value the AllocatedService value in a {@link TString} data type
   */
  public void setAllocatedService(TString value) {
    this.allocatedService = value;
  }

  /**
   * Determine if the AllocatedService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedService() {
    return (this.allocatedService != null ? this.allocatedService.isSetValue() : false);
  }

  /**
   * Get if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @return the Priority value in a {@link TString} data type
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value the Priority value in a {@link TString} data type
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @return a non-null but possibly empty list of {@link Administration}
   *         instances
   */
  public Set<TString> getAdministration() {
    if (administration == null) {
      administration = new HashSet<>();
    }
    return this.administration;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return ((this.administration != null) && (!this.administration.isEmpty()));
  }

  /**
   * Clear the Administration field. This sets the field to null.
   */
  public void unsetAdministration() {
    this.administration = null;
  }

  /**
   * Set the type of variance.
   * <p>
   * @param value An instances of type {@link ListCAV}
   * @return The current Variance object instance
   */
  public Variance withType(ListCAV value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value An instances of type {@link ListCSN}
   * @return The current Variance object instance
   */
  public Variance withAllocatedService(ListCSN value) {
    setAllocatedService(new TString(value.value()));
    return this;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value An instances of type {@link ListCPS}
   * @return The current Variance object instance
   */
  public Variance withPriority(ListCPS value) {
    setPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @param values One or more instances of type {@link Administration}
   * @return The current Variance object instance
   */
  public Variance withAdministration(ListCAO... values) {
    if (values != null) {
      for (ListCAO listCAO : values) {
        getAdministration().add(new TString(listCAO.name()));
      }
    }
    return this;
  }

  /**
   * Set the Administration
   * <p>
   * Complex element Administration contains the country for which this variance
   * applies.
   * <p>
   * @param values A collection of {@link Administration} instances
   * @return The current Variance object instance
   */
  public Variance withAdministration(Set<ListCAO> values) {
    if (values != null) {
      for (ListCAO listCAO : values) {
        getAdministration().add(new TString(listCAO.name()));
      }
    }
    return this;
  }

  /**
   * Get a string representation of this Variance instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Variance {"
      + (priority != null ? " priority [" + priority + "]" : "")
      + (allocatedService != null ? " allocatedService [" + allocatedService + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (administration != null ? " administration [" + administration + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Variance} requires
   * {@link TString AllocatedService}, {@link TString Priority}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAllocatedService() && isSetPriority() && isSetType();
  }

}
