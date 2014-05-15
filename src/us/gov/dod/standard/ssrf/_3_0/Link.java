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
 * Java class for Link complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Link">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="IntermediateFunction" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150" minOccurs="0"/>
 *         &lt;element name="MajorFunction" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150" minOccurs="0"/>
 *         &lt;element name="LinkName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS24" minOccurs="0"/>
 *         &lt;element name="Tuning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Tuning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StationConfig" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StationConfig" maxOccurs="unbounded"/>
 *         &lt;element name="Assigned" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Assigned" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DCSTrunk" type="{urn:us:gov:dod:standard:ssrf:3.0.0}DCSTrunk" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailedFunction" type="{urn:us:gov:dod:standard:ssrf:3.0.0}DetailedFunction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
  protected TS100 linkID;
  @XmlElementRef(name = "IntermediateFunction", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS150> intermediateFunction;
  @XmlElementRef(name = "MajorFunction", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS150> majorFunction;
  @XmlElementRef(name = "LinkName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS24> linkName;
  @XmlElement(name = "Tuning")
  protected List<Tuning> tuning;
  @XmlElement(name = "StationConfig", required = true)
  protected List<StationConfig> stationConfig;
  @XmlElement(name = "Assigned")
  protected List<Assigned> assigned;
  @XmlElement(name = "DCSTrunk", nillable = true)
  protected List<DCSTrunk> dcsTrunk;
  @XmlElement(name = "DetailedFunction", nillable = true)
  protected List<DetailedFunction> detailedFunction;

  /**
   * Gets the value of the linkID property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getLinkID() {
    return linkID;
  }

  /**
   * Sets the value of the linkID property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setLinkID(TS100 value) {
    this.linkID = value;
  }

  /**
   * Gets the value of the intermediateFunction property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public JAXBElement<TS150> getIntermediateFunction() {
    return intermediateFunction;
  }

  /**
   * Sets the value of the intermediateFunction property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public void setIntermediateFunction(JAXBElement<TS150> value) {
    this.intermediateFunction = value;
  }

  /**
   * Gets the value of the majorFunction property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public JAXBElement<TS150> getMajorFunction() {
    return majorFunction;
  }

  /**
   * Sets the value of the majorFunction property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public void setMajorFunction(JAXBElement<TS150> value) {
    this.majorFunction = value;
  }

  /**
   * Gets the value of the linkName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS24 }{@code >}
   * <p>
   */
  public JAXBElement<TS24> getLinkName() {
    return linkName;
  }

  /**
   * Sets the value of the linkName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS24 }{@code >}
   * <p>
   */
  public void setLinkName(JAXBElement<TS24> value) {
    this.linkName = value;
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
   * Objects of the following type(s) are allowed in the list {@link Tuning }
   * <p>
   * <p>
   */
  public List<Tuning> getTuning() {
    if (tuning == null) {
      tuning = new ArrayList<>();
    }
    return this.tuning;
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
     * {@link StationConfig }
   * <p>
   * <p>
   */
  public List<StationConfig> getStationConfig() {
    if (stationConfig == null) {
      stationConfig = new ArrayList<>();
    }
    return this.stationConfig;
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
   * Objects of the following type(s) are allowed in the list {@link Assigned }
   * <p>
   * <p>
   */
  public List<Assigned> getAssigned() {
    if (assigned == null) {
      assigned = new ArrayList<>();
    }
    return this.assigned;
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
   * Objects of the following type(s) are allowed in the list {@link DCSTrunk }
   * <p>
   * <p>
   */
  public List<DCSTrunk> getDCSTrunk() {
    if (dcsTrunk == null) {
      dcsTrunk = new ArrayList<>();
    }
    return this.dcsTrunk;
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
     * {@link DetailedFunction }
   * <p>
   * <p>
   */
  public List<DetailedFunction> getDetailedFunction() {
    if (detailedFunction == null) {
      detailedFunction = new ArrayList<>();
    }
    return this.detailedFunction;
  }

}
