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
package us.gov.dod.standard.ssrf._3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.forceelement.StockNum;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_1.receiver.Deployment;
import us.gov.dod.standard.ssrf._3_1.rfsystem.RelatedSystem;

/**
 * RFSystem describes the association of one or several Transmitters, Receivers
 * and Antennas as they are assembled to form a system on a platform; it can
 * also include the specific modes which are allowed or technically possible in
 * this assembly.
 * <p>
 * Sub-Elements are
 * {@link Configuration}, {@link Deployment}, {@link Nomenclature}, {@link POCInformation}, {@link RelatedSystem}, {@link StockNum}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;RFSystem cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::TR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Deployment&gt;
 *     &lt;Type cls="U"&gt;Land Mobile&lt;/Type&gt;
 *   &lt;/Deployment&gt;
 *   &lt;Configuration&gt;
 *     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
 *     &lt;TxRef&gt;
 *       &lt;Serial cls="U"&gt;USA::TX:1111&lt;/Serial&gt;
 *       &lt;TxAntModeRef&gt;
 *         &lt;Serial cls="U"&gt;USA::AN:2222&lt;/Serial&gt;
 *       &lt;/TxAntModeRef&gt;
 *     &lt;/TxRef&gt;
 *     &lt;RxRef&gt;
 *       &lt;Serial cls="U"&gt;USA::RX:3333&lt;/Serial&gt;
 *     &lt;/RxRef&gt;
 *   &lt;/Configuration&gt;
 * &lt;/RFSystem&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFSystem", propOrder = {
  "fieldedStatus",
  "emergency",
  "initialCost",
  "pocInformation",
  "nomenclature",
  "deployment",
  "configuration",
  "relatedSystem",
  "stockNum",
  "usingCountries"
})
public class RFSystem extends Common<RFSystem> {

  /**
   * FieldedStatus - Fielded Status (Optional)
   * <p>
   * The current stage of the RFSystem.
   * <p>
   * Format is L:CSG
   */
  @XmlElement(name = "FieldedStatus", required = false)
  private TString fieldedStatus;
  /**
   * Emergency - Emergency Indicator (Optional)
   * <p>
   * "Yes" if the system may be used in a case of emergency.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  /**
   * US:InitialCost - Initial Cost (Optional)
   * <p>
   * The estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * Format is S70
   */
  @XmlElement(name = "InitialCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString initialCost;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   */
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  /**
   * Deployment (Optional)
   * <p>
   * Deployment provides the general type of equipment deployment. For the
   * detailed data, the appropriate force element and platforms elements should
   * be referenced. Data element Deployment identifies the general category of
   * how the equipment is deployed. For example an equipment may be deployed on
   * an airborne platform, a ship or fixed land installation.
   */
  @XmlElement(name = "Deployment")
  private List<Deployment> deployment;
  /**
   * Configuration (Optional)
   * <p>
   * Configuration identifies each operational configuration that is required in
   * a SSRequest, granted by a Host Nation in a SSReply, or authorised in a
   * frequency Assignment or Allotment dataset. It also identifies the
   * functional use of the assigned frequency at a particular transmitting
   * station. Finally, it may indicate if the receiver station is used primarily
   * as a repeater. A direct coupling between the station's receiver and the
   * station's transmitter allows the incoming signal to be retransmitted
   * exactly as received.
   */
  @XmlElement(name = "Configuration")
  private List<Configuration> configuration;
  /**
   * RelatedSystem (Optional)
   * <p>
   * RelatedSystem identifies a System linked to the current System, and the
   * relation (parent, child, sibling).
   */
  @XmlElement(name = "RelatedSystem")
  private List<RelatedSystem> relatedSystem;
  /**
   * US:StockNum (Optional)
   * <p>
   * StockNum (US) provides the equipment stock number and indicates the type of
   * stock number.
   */
  @XmlElement(name = "StockNum")
  private List<StockNum> stockNum;
  /**
   * US:UsingCountries (Optional)
   * <p>
   * UsingCountries (US) describes the countries that manufacture (Producing),
   * supply (Source), and use (Using) the RFSystem.
   */
  @XmlElement(name = "UsingCountries")
  private List<UsingCountries> usingCountries;

  /**
   * Get the current stage of the RFSystem.
   * <p>
   * @return the FieldedStatus value in a {@link TString} data type
   */
  public TString getFieldedStatus() {
    return fieldedStatus;
  }

  /**
   * Set the current stage of the RFSystem.
   * <p>
   * @param value the FieldedStatus value in a {@link TString} data type
   */
  public void setFieldedStatus(TString value) {
    this.fieldedStatus = value;
  }

  /**
   * Determine if the FieldedStatus is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFieldedStatus() {
    return (this.fieldedStatus != null ? this.fieldedStatus.isSetValue() : false);
  }

  /**
   * Get "Yes" if the system may be used in a case of emergency.
   * <p>
   * @return the Emergency value in a {@link TString} data type
   */
  public TString getEmergency() {
    return emergency;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   * <p>
   * @param value the Emergency value in a {@link TString} data type
   */
  public void setEmergency(TString value) {
    this.emergency = value;
  }

  /**
   * Determine if the Emergency is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmergency() {
    return (this.emergency != null ? this.emergency.isSetValue() : false);
  }

  /**
   * Get the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @return the InitialCost value in a {@link TString} data type
   */
  public TString getInitialCost() {
    return initialCost;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @param value the InitialCost value in a {@link TString} data type
   */
  public void setInitialCost(TString value) {
    this.initialCost = value;
  }

  /**
   * Determine if the InitialCost is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInitialCost() {
    return (this.initialCost != null ? this.initialCost.isSetValue() : false);
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link POCInformation} instances
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a non-null but possibly empty list of {@link Nomenclature} instances
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  /**
   * Determine if the Nomenclature is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @return a non-null but possibly empty list of {@link Deployment} instances
   */
  public List<Deployment> getDeployment() {
    if (deployment == null) {
      deployment = new ArrayList<>();
    }
    return this.deployment;
  }

  /**
   * Determine if the Deployment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeployment() {
    return ((this.deployment != null) && (!this.deployment.isEmpty()));
  }

  /**
   * Clear the Deployment field. This sets the field to null.
   */
  public void unsetDeployment() {
    this.deployment = null;
  }

  /**
   * Get the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @return a non-null but possibly empty list of {@link Configuration} instances
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

  /**
   * Determine if the Configuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  /**
   * Clear the Configuration field. This sets the field to null.
   */
  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Get the RelatedSystem
   * <p>
   * Complex element RelatedSystem identifies a System linked to the current
   * System, and the relation (parent, child, sibling).
   * <p>
   * @return a non-null but possibly empty list of {@link RelatedSystem} instances
   */
  public List<RelatedSystem> getRelatedSystem() {
    if (relatedSystem == null) {
      relatedSystem = new ArrayList<>();
    }
    return this.relatedSystem;
  }

  /**
   * Determine if the RelatedSystem is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedSystem() {
    return ((this.relatedSystem != null) && (!this.relatedSystem.isEmpty()));
  }

  /**
   * Clear the RelatedSystem field. This sets the field to null.
   */
  public void unsetRelatedSystem() {
    this.relatedSystem = null;
  }

  /**
   * Get the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @return a non-null but possibly empty list of {@link StockNum} instances
   */
  public List<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new ArrayList<>();
    }
    return this.stockNum;
  }

  /**
   * Determine if the StockNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  /**
   * Clear the StockNum field. This sets the field to null.
   */
  public void unsetStockNum() {
    this.stockNum = null;
  }

  /**
   * Get the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the RFSystem.
   * <p>
   * @return a non-null but possibly empty list of {@link UsingCountries} instances
   */
  public List<UsingCountries> getUsingCountries() {
    if (usingCountries == null) {
      usingCountries = new ArrayList<>();
    }
    return this.usingCountries;
  }

  /**
   * Determine if the UsingCountries is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUsingCountries() {
    return ((this.usingCountries != null) && (!this.usingCountries.isEmpty()));
  }

  /**
   * Clear the UsingCountries field. This sets the field to null.
   */
  public void unsetUsingCountries() {
    this.usingCountries = null;
  }

  /**
   * Set the current stage of the RFSystem.
   * <p>
   * @param value An instances of type {@link ListCSG}
   * @return The current RFSystem object instance
   */
  public RFSystem withFieldedStatus(ListCSG value) {
    setFieldedStatus(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if the system may be used in a case of emergency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current RFSystem object instance
   */
  public RFSystem withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  /**
   * Set the estimated initial cost, in US dollars, of the system/equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RFSystem object instance
   */
  public RFSystem withInitialCost(String value) {
    setInitialCost(new TString(value));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation}
   * @return The current RFSystem object instance
   */
  public RFSystem withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature}
   * @return The current RFSystem object instance
   */
  public RFSystem withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @param values One or more instances of type {@link Deployment}
   * @return The current RFSystem object instance
   */
  public RFSystem withDeployment(Deployment... values) {
    if (values != null) {
      getDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Deployment
   * <p>
   * Complex element Deployment provides the general type of equipment
   * deployment. For the detailed data, the appropriate force element and
   * platforms elements should be referenced. Data element Deployment identifies
   * the general category of how the equipment is deployed. For example an
   * equipment may be deployed on an airborne platform, a ship or fixed land
   * installation.
   * <p>
   * @param values A collection of {@link Deployment} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withDeployment(Collection<Deployment> values) {
    if (values != null) {
      getDeployment().addAll(values);
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values One or more instances of type {@link Configuration}
   * @return The current RFSystem object instance
   */
  public RFSystem withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Configuration
   * <p>
   * Complex element Configuration identifies each operational configuration
   * that is required in a SSRequest, granted by a Host Nation in a SSReply, or
   * authorised in a frequency Assignment or Allotment dataset. It also
   * identifies the functional use of the assigned frequency at a particular
   * transmitting station. Finally, it may indicate if the receiver station is
   * used primarily as a repeater. A direct coupling between the station's
   * receiver and the station's transmitter allows the incoming signal to be
   * retransmitted exactly as received.
   * <p>
   * @param values A collection of {@link Configuration} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedSystem
   * <p>
   * Complex element RelatedSystem identifies a System linked to the current
   * System, and the relation (parent, child, sibling).
   * <p>
   * @param values One or more instances of type {@link RelatedSystem}
   * @return The current RFSystem object instance
   */
  public RFSystem withRelatedSystem(RelatedSystem... values) {
    if (values != null) {
      getRelatedSystem().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RelatedSystem
   * <p>
   * Complex element RelatedSystem identifies a System linked to the current
   * System, and the relation (parent, child, sibling).
   * <p>
   * @param values A collection of {@link RelatedSystem} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withRelatedSystem(Collection<RelatedSystem> values) {
    if (values != null) {
      getRelatedSystem().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values One or more instances of type {@link StockNum}
   * @return The current RFSystem object instance
   */
  public RFSystem withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the RFSystem.
   * <p>
   * @param values One or more instances of type {@link UsingCountries}
   * @return The current RFSystem object instance
   */
  public RFSystem withUsingCountries(UsingCountries... values) {
    if (values != null) {
      getUsingCountries().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:UsingCountries
   * <p>
   * Complex element UsingCountries (US) describes the countries that
   * manufacture (Producing), supply (Source), and use (Using) the RFSystem.
   * <p>
   * @param values A collection of {@link UsingCountries} instances
   * @return The current RFSystem object instance
   */
  public RFSystem withUsingCountries(Collection<UsingCountries> values) {
    if (values != null) {
      getUsingCountries().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RFSystem instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RFSystem {"
      + " nomenclature [" + nomenclature + "]"
      + " fieldedStatus [" + fieldedStatus + "]"
      + " relatedSystem [" + relatedSystem + "]"
      + " pocInformation [" + pocInformation + "]"
      + " stockNum [" + stockNum + "]"
      + " initialCost [" + initialCost + "]"
      + " emergency [" + emergency + "]"
      + " deployment [" + deployment + "]"
      + " usingCountries [" + usingCountries + "]"
      + " configuration [" + configuration + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RFSystem} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet();
  }

}
