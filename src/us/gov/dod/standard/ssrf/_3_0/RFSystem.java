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
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_0.system.Deployment;
import us.gov.dod.standard.ssrf._3_0.system.Nomenclature;
import us.gov.dod.standard.ssrf._3_0.system.RelatedSystem;
import us.gov.dod.standard.ssrf._3_0.system.StockNum;
import us.gov.dod.standard.ssrf._3_0.system.configuration.Configuration;

/**
 * <p>
 * Java class for RFSystem complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RFSystem"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="FieldedStatus" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCSG"
 * minOccurs="0"/> &lt;element name="Emergency"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 * &lt;element name="InitialCost"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS70" minOccurs="0"/> &lt;element
 * name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Nomenclature"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Deployment"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Deployment" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Configuration"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="RelatedSystem"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedSystem"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="StockNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StockNum" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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
  "stockNum"
})
public class RFSystem extends Common<RFSystem> {

  @XmlElement(name = "FieldedStatus", required = false)
  private TString fieldedStatus;
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  @XmlElement(name = "InitialCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString initialCost;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  @XmlElement(name = "Deployment")
  private List<Deployment> deployment;
  @XmlElement(name = "Configuration")
  private List<Configuration> configuration;
  @XmlElement(name = "RelatedSystem")
  private List<RelatedSystem> relatedSystem;
  @XmlElement(name = "StockNum")
  private List<StockNum> stockNum;

  /**
   * Gets the value of the fieldedStatus property.
   * <p>
   * @return 
   */
  public TString getFieldedStatus() {
    return fieldedStatus;
  }

  /**
   * Sets the value of the fieldedStatus property.
   * <p>
   * @param value 
   */
  public void setFieldedStatus(TString value) {
    this.fieldedStatus = value;
  }

  public boolean isSetFieldedStatus() {
    return (this.fieldedStatus != null);
  }

  /**
   * Gets the value of the emergency property.
   * <p>
   * @return 
   */
  public TString getEmergency() {
    return emergency;
  }

  /**
   * Sets the value of the emergency property.
   * <p>
   * @param value 
   */
  public void setEmergency(TString value) {
    this.emergency = value;
  }

  public boolean isSetEmergency() {
    return (this.emergency != null);
  }

  /**
   * Gets the value of the initialCost property.
   * <p>
   * @return 
   */
  public TString getInitialCost() {
    return initialCost;
  }

  /**
   * Sets the value of the initialCost property.
   * <p>
   * @param value 
   */
  public void setInitialCost(TString value) {
    this.initialCost = value;
  }

  public boolean isSetInitialCost() {
    return (this.initialCost != null);
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the nomenclature property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the nomenclature property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNomenclature().add(newItem);
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
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Gets the value of the deployment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the deployment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDeployment().add(newItem);
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
  public List<Deployment> getDeployment() {
    if (deployment == null) {
      deployment = new ArrayList<>();
    }
    return this.deployment;
  }

  public boolean isSetDeployment() {
    return ((this.deployment != null) && (!this.deployment.isEmpty()));
  }

  public void unsetDeployment() {
    this.deployment = null;
  }

  /**
   * Gets the value of the configuration property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configuration property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfiguration().add(newItem);
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
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

  public boolean isSetConfiguration() {
    return ((this.configuration != null) && (!this.configuration.isEmpty()));
  }

  public void unsetConfiguration() {
    this.configuration = null;
  }

  /**
   * Gets the value of the relatedSystem property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedSystem property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedSystem().add(newItem);
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
  public List<RelatedSystem> getRelatedSystem() {
    if (relatedSystem == null) {
      relatedSystem = new ArrayList<>();
    }
    return this.relatedSystem;
  }

  public boolean isSetRelatedSystem() {
    return ((this.relatedSystem != null) && (!this.relatedSystem.isEmpty()));
  }

  public void unsetRelatedSystem() {
    this.relatedSystem = null;
  }

  /**
   * Gets the value of the stockNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stockNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStockNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new ArrayList<>();
    }
    return this.stockNum;
  }

  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  public void unsetStockNum() {
    this.stockNum = null;
  }

  public RFSystem withFieldedStatus(ListCSG value) {
    setFieldedStatus(new TString(value.value()));
    return this;
  }

  public RFSystem withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  public RFSystem withInitialCost(String value) {
    setInitialCost(new TString(value));
    return this;
  }

  public RFSystem withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public RFSystem withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  public RFSystem withDeployment(Deployment... values) {
    if (values != null) {
      getDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withDeployment(Collection<Deployment> values) {
    if (values != null) {
      getDeployment().addAll(values);
    }
    return this;
  }

  public RFSystem withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  public RFSystem withRelatedSystem(RelatedSystem... values) {
    if (values != null) {
      getRelatedSystem().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withRelatedSystem(Collection<RelatedSystem> values) {
    if (values != null) {
      getRelatedSystem().addAll(values);
    }
    return this;
  }

  public RFSystem withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RFSystem withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

}
