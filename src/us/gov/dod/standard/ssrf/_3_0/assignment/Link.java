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
package us.gov.dod.standard.ssrf._3_0.assignment;

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
import us.gov.dod.standard.ssrf._3_0.metadata.DCSTrunk;
import us.gov.dod.standard.ssrf._3_0.metadata.DetailedFunction;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Link complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Link"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="LinkID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/> &lt;element
 * name="IntermediateFunction" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150"
 * minOccurs="0"/> &lt;element name="MajorFunction"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150" minOccurs="0"/> &lt;element
 * name="LinkName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS24"
 * minOccurs="0"/> &lt;element name="Tuning"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Tuning" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="StationConfig"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StationConfig"
 * maxOccurs="unbounded"/> &lt;element name="Assigned"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Assigned" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="DCSTrunk"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}DCSTrunk" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="DetailedFunction"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}DetailedFunction"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", propOrder = {
  "linkID",
  "intermediateFunction",
  "majorFunction",
  "linkName",
  "tuning",
  "stationConfig",
  "assigned",
  "dcsTrunk",
  "detailedFunction"
})
public class Link {

  @XmlElement(name = "LinkID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString linkID;
  @XmlElement(name = "IntermediateFunction", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString intermediateFunction;
  @XmlElement(name = "MajorFunction", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS150.class)
  private TString majorFunction;
  @XmlElement(name = "LinkName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS24.class)
  private TString linkName;
  @XmlElement(name = "Tuning")
  private List<Tuning> tuning;
  @XmlElement(name = "StationConfig", required = true)
  private List<StationConfig> stationConfig;
  @XmlElement(name = "Assigned")
  private List<Assigned> assigned;
  @XmlElement(name = "DCSTrunk", nillable = true)
  private List<DCSTrunk> dcsTrunk;
  @XmlElement(name = "DetailedFunction", nillable = true)
  private List<DetailedFunction> detailedFunction;

  /**
   * Gets the value of the linkID property.
   * <p>
   * @return
   */
  public TString getLinkID() {
    return linkID;
  }

  /**
   * Sets the value of the linkID property.
   * <p>
   * @param value
   */
  public void setLinkID(TString value) {
    this.linkID = value;
  }

  public boolean isSetLinkID() {
    return (this.linkID != null);
  }

  /**
   * Gets the value of the intermediateFunction property.
   * <p>
   * @return 
   */
  public TString getIntermediateFunction() {
    return intermediateFunction;
  }

  /**
   * Sets the value of the intermediateFunction property.
   * <p>
   * @param value 
   */
  public void setIntermediateFunction(TString value) {
    this.intermediateFunction = value;
  }

  public boolean isSetIntermediateFunction() {
    return (this.intermediateFunction != null);
  }

  /**
   * Gets the value of the majorFunction property.
   * <p>
   * @return 
   */
  public TString getMajorFunction() {
    return majorFunction;
  }

  /**
   * Sets the value of the majorFunction property.
   * <p>
   * @param value 
   */
  public void setMajorFunction(TString value) {
    this.majorFunction = value;
  }

  public boolean isSetMajorFunction() {
    return (this.majorFunction != null);
  }

  /**
   * Gets the value of the linkName property.
   * <p>
   * @return 
   */
  public TString getLinkName() {
    return linkName;
  }

  /**
   * Sets the value of the linkName property.
   * <p>
   * @param value 
   */
  public void setLinkName(TString value) {
    this.linkName = value;
  }

  public boolean isSetLinkName() {
    return (this.linkName != null);
  }

  /**
   * Gets the value of the tuning property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the tuning property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTuning().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Tuning> getTuning() {
    if (tuning == null) {
      tuning = new ArrayList<>();
    }
    return this.tuning;
  }

  public boolean isSetTuning() {
    return ((this.tuning != null) && (!this.tuning.isEmpty()));
  }

  public void unsetTuning() {
    this.tuning = null;
  }

  /**
   * Gets the value of the stationConfig property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stationConfig property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStationConfig().add(newItem);
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
  public List<StationConfig> getStationConfig() {
    if (stationConfig == null) {
      stationConfig = new ArrayList<>();
    }
    return this.stationConfig;
  }

  public boolean isSetStationConfig() {
    return ((this.stationConfig != null) && (!this.stationConfig.isEmpty()));
  }

  public void unsetStationConfig() {
    this.stationConfig = null;
  }

  /**
   * Gets the value of the assigned property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the assigned property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAssigned().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Assigned> getAssigned() {
    if (assigned == null) {
      assigned = new ArrayList<>();
    }
    return this.assigned;
  }

  public boolean isSetAssigned() {
    return ((this.assigned != null) && (!this.assigned.isEmpty()));
  }

  public void unsetAssigned() {
    this.assigned = null;
  }

  /**
   * Gets the value of the dcsTrunk property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the dcsTrunk property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDCSTrunk().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<DCSTrunk> getDCSTrunk() {
    if (dcsTrunk == null) {
      dcsTrunk = new ArrayList<>();
    }
    return this.dcsTrunk;
  }

  public boolean isSetDCSTrunk() {
    return ((this.dcsTrunk != null) && (!this.dcsTrunk.isEmpty()));
  }

  public void unsetDCSTrunk() {
    this.dcsTrunk = null;
  }

  /**
   * Gets the value of the detailedFunction property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the detailedFunction property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDetailedFunction().add(newItem);
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
  public List<DetailedFunction> getDetailedFunction() {
    if (detailedFunction == null) {
      detailedFunction = new ArrayList<>();
    }
    return this.detailedFunction;
  }

  public boolean isSetDetailedFunction() {
    return ((this.detailedFunction != null) && (!this.detailedFunction.isEmpty()));
  }

  public void unsetDetailedFunction() {
    this.detailedFunction = null;
  }

  public Link withLinkID(String value) {
    setLinkID(new TString(value));
    return this;
  }

  public Link withIntermediateFunction(String value) {
    setIntermediateFunction(new TString(value));
    return this;
  }

  public Link withMajorFunction(String value) {
    setMajorFunction(new TString(value));
    return this;
  }

  public Link withLinkName(String value) {
    setLinkName(new TString(value));
    return this;
  }

  public Link withTuning(Tuning... values) {
    if (values != null) {
      getTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withTuning(Collection<Tuning> values) {
    if (values != null) {
      getTuning().addAll(values);
    }
    return this;
  }

  public Link withStationConfig(StationConfig... values) {
    if (values != null) {
      getStationConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withStationConfig(Collection<StationConfig> values) {
    if (values != null) {
      getStationConfig().addAll(values);
    }
    return this;
  }

  public Link withAssigned(Assigned... values) {
    if (values != null) {
      getAssigned().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withAssigned(Collection<Assigned> values) {
    if (values != null) {
      getAssigned().addAll(values);
    }
    return this;
  }

  public Link withDCSTrunk(DCSTrunk... values) {
    if (values != null) {
      getDCSTrunk().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withDCSTrunk(Collection<DCSTrunk> values) {
    if (values != null) {
      getDCSTrunk().addAll(values);
    }
    return this;
  }

  public Link withDetailedFunction(DetailedFunction... values) {
    if (values != null) {
      getDetailedFunction().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Link withDetailedFunction(Collection<DetailedFunction> values) {
    if (values != null) {
      getDetailedFunction().addAll(values);
    }
    return this;
  }

}
