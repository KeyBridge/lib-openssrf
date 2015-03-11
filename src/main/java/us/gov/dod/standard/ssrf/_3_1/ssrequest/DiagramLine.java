/* 
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * DiagramLine defines a line between two endpoints on the diagram.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramLine", propOrder = {
  "txEndpointID",
  "rxEndpointID",
  "configID"
})
public class DiagramLine {

  /**
   * TxEndpointID - Tx Endpoint ID (Required)
   * <p>
   * The Endpoint ID at the originating (transmitting) endpoint of a line on the
   * diagram. There must be a corresponding DiagramEndpoint element with this
   * name. Note there may be more than one line with the same originating and
   * terminating endpoints if those lines reference different Configurations.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "TxEndpointID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString txEndpointID;
  /**
   * RxEndpointID - Rx Endpoint ID (Required)
   * <p>
   * The Endpoint ID at the terminating (receiving) endpoint of a line on the
   * diagram. There must be a corresponding DiagramEndpoint element with this
   * name. Note there may be more than one line with the same originating and
   * terminating endpoints if those lines reference different Configurations.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "RxEndpointID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString rxEndpointID;
  /**
   * ConfigID - Configuration ID (Optional)
   * <p>
   * A reference to a Configuration associated with this line on the diagram.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "ConfigID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;

  /**
   * Get the Endpoint ID at the originating (transmitting) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @return the TxEndpointID value in a {@link TString} data type
   */
  public TString getTxEndpointID() {
    return txEndpointID;
  }

  /**
   * Set the Endpoint ID at the originating (transmitting) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @param value the TxEndpointID value in a {@link TString} data type
   */
  public void setTxEndpointID(TString value) {
    this.txEndpointID = value;
  }

  /**
   * Determine if the TxEndpointID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxEndpointID() {
    return (this.txEndpointID != null ? this.txEndpointID.isSetValue() : false);
  }

  /**
   * Get the Endpoint ID at the terminating (receiving) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @return the RxEndpointID value in a {@link TString} data type
   */
  public TString getRxEndpointID() {
    return rxEndpointID;
  }

  /**
   * Set the Endpoint ID at the terminating (receiving) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @param value the RxEndpointID value in a {@link TString} data type
   */
  public void setRxEndpointID(TString value) {
    this.rxEndpointID = value;
  }

  /**
   * Determine if the RxEndpointID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxEndpointID() {
    return (this.rxEndpointID != null ? this.rxEndpointID.isSetValue() : false);
  }

  /**
   * Get a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @return the ConfigID value in a {@link TString} data type
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Set a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @param value the ConfigID value in a {@link TString} data type
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  /**
   * Determine if the ConfigID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfigID() {
    return (this.configID != null ? this.configID.isSetValue() : false);
  }

  /**
   * Set the Endpoint ID at the originating (transmitting) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   */
  public DiagramLine withTxEndpointID(String value) {
    setTxEndpointID(new TString(value));
    return this;
  }

  /**
   * Set the Endpoint ID at the terminating (receiving) endpoint of a line on
   * the diagram. There must be a corresponding DiagramEndpoint element with
   * this name. Note there may be more than one line with the same originating
   * and terminating endpoints if those lines reference different
   * Configurations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   */
  public DiagramLine withRxEndpointID(String value) {
    setRxEndpointID(new TString(value));
    return this;
  }

  /**
   * Set a reference to a Configuration associated with this line on the
   * diagram.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DiagramLine object instance
   */
  public DiagramLine withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this DiagramLine instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DiagramLine {"
      + (rxEndpointID != null ? " rxEndpointID [" + rxEndpointID + "]" : "")
      + (txEndpointID != null ? " txEndpointID [" + txEndpointID + "]" : "")
      + (configID != null ? " configID [" + configID + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DiagramLine} requires
   * {@link TString RxEndpointID}, {@link TString TxEndpointID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRxEndpointID() && isSetTxEndpointID();
  }

}
