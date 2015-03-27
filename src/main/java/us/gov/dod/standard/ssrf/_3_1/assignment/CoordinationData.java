/* 
 * Copyright 2014 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUCJ;

/**
 * CoordinationData (US) contains Host Nation coordination information.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinationData", propOrder = {
  "coordIndicator",
  "hostComments"
})
public class CoordinationData {

  /**
   * US:CoordIndicator - Coordination Indicator (Required)
   * <p>
   * The coordinating entity.
   * <p>
   * Format is L:UCJ
   */
  @XmlElement(name = "CoordIndicator", required = true)
  private TString coordIndicator;
  /**
   * US:HostComments - Host Comments (Optional)
   * <p>
   * The Comments from the coordinating entity.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "HostComments", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString hostComments;

  /**
   * Get the coordinating entity.
   * <p>
   * @return the CoordIndicator value in a {@link TString} data type
   */
  public TString getCoordIndicator() {
    return coordIndicator;
  }

  /**
   * Set the coordinating entity.
   * <p>
   * @param value the CoordIndicator value in a {@link TString} data type
   */
  public void setCoordIndicator(TString value) {
    this.coordIndicator = value;
  }

  /**
   * Determine if the CoordIndicator is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCoordIndicator() {
    return (this.coordIndicator != null ? this.coordIndicator.isSetValue() : false);
  }

  /**
   * Get the Comments from the coordinating entity.
   * <p>
   * @return the HostComments value in a {@link TString} data type
   */
  public TString getHostComments() {
    return hostComments;
  }

  /**
   * Set the Comments from the coordinating entity.
   * <p>
   * @param value the HostComments value in a {@link TString} data type
   */
  public void setHostComments(TString value) {
    this.hostComments = value;
  }

  /**
   * Determine if the HostComments is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHostComments() {
    return (this.hostComments != null ? this.hostComments.isSetValue() : false);
  }

  /**
   * Set the coordinating entity.
   * <p>
   * @param value An instances of type {@link ListUCJ}
   * @return The current CoordinationData object instance
   */
  public CoordinationData withCoordIndicator(ListUCJ value) {
    setCoordIndicator(new TString(value.value()));
    return this;
  }

  /**
   * Set the Comments from the coordinating entity.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current CoordinationData object instance
   */
  public CoordinationData withHostComments(String value) {
    setHostComments(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this CoordinationData instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CoordinationData {"
      + (hostComments != null ? " hostComments [" + hostComments + "]" : "")
      + (coordIndicator != null ? " coordIndicator [" + coordIndicator + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CoordinationData} requires {@link TString CoordIndicator}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCoordIndicator();
  }

}
