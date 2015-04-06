/* 
 * Copyright 2015 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.receiver;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCIN;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSU;

/**
 * Deployment provides the general type of equipment deployment. For the
 * detailed data, the appropriate force element and platforms elements should be
 * referenced. Data element Deployment identifies the general category of how
 * the equipment is deployed. For example an equipment may be deployed on an
 * airborne platform, a ship or fixed land installation.
 * <p>
 * Element of {@link RFSystem}, {@link Receiver}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link Installation}
 * <p>
 * Example:
 * <pre>
 * &lt;Deployment&gt;
 *   &lt;Type cls="U"&gt;Air&lt;/Type&gt;
 * &lt;/Deployment&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deployment", propOrder = {
  "type",
  "status",
  "installation"
})
public class Deployment {

  /**
   * Type - Deployment Type (Required)    * <p>
   * The type of deployment.
   * <p>
   * Format is L:CFD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Status - Status (Optional)    * <p>
   * The status of the Deployment.
   * <p>
   * Format is L:CSU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Status", required = false)
  private TString status;
  /**
   * Installation (Optional)
   * <p>
   * Installation identifies the specific platforms on which an equipment is
   * installed, whether it is mounted at a fixed site atop a mountain, in a
   * shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Installation", nillable = true)
  private Set<Installation> installation;

  /**
   * Get the type of deployment..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of deployment..
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the status of the Deployment..
   * <p>
   * @return the Status value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getStatus() {
    return status;
  }

  /**
   * Set the status of the Deployment..
   * <p>
   * @param value the Status value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setStatus(TString value) {
    this.status = value;
  }

  /**
   * Determine if the Status is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStatus() {
    return (this.status != null ? this.status.isSetValue() : false);
  }

  /**
   * Get the Installation
   * <p>
   * Complex element Installation identifies the specific platforms on which an
   * equipment is installed, whether it is mounted at a fixed site atop a
   * mountain, in a shelter, in a vehicle, aboard a helicopter, etc..
   * <p>
   * @return a {@link Installation} instance
   * @since 3.1.0
   */
  public Set<Installation> getInstallation() {
    if (installation == null) {
      installation = new HashSet<>();
    }
    return this.installation;
  }

  /**
   * Determine if the Installation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstallation() {
    return ((this.installation != null) && (!this.installation.isEmpty()));
  }

  /**
   * Clear the Installation field. This sets the field to null.
   */
  public void unsetInstallation() {
    this.installation = null;
  }

  /**
   * Set the type of deployment.
   * <p>
   * @param value An instances of type {@link ListCIN}.
   * @return The current Deployment object instance.
   * @since 3.1.0
   */
  public Deployment withType(ListCIN value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the status of the Deployment.
   * <p>
   * @param value An instances of type {@link ListCSU}.
   * @return The current Deployment object instance.
   * @since 3.1.0
   */
  public Deployment withStatus(ListCSU value) {
    setStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set the Installation
   * <p>
   * Complex element Installation identifies the specific platforms on which an
   * equipment is installed, whether it is mounted at a fixed site atop a
   * mountain, in a shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @param values One or more instances of type {@link Installation...}.
   * @return The current Deployment object instance.
   * @since 3.1.0
   */
  public Deployment withInstallation(Installation... values) {
    if (values != null) {
      getInstallation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Installation
   * <p>
   * Complex element Installation identifies the specific platforms on which an
   * equipment is installed, whether it is mounted at a fixed site atop a
   * mountain, in a shelter, in a vehicle, aboard a helicopter, etc.
   * <p>
   * @param values A collection of {@link Installation} instances
   * @return The current Deployment object instance.
   * @since 3.1.0
   */
  public Deployment withInstallation(Collection<Installation> values) {
    if (values != null) {
      getInstallation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Deployment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Deployment {"
           + (installation != null ? " installation [" + installation + "]" : "")
           + (status != null ? " status [" + status + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Deployment} requires {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

}
