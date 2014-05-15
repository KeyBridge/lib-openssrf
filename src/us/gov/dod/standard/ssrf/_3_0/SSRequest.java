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
 * Java class for SSRequest complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SSRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="CurrentStage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCSG" minOccurs="0"/>
 *         &lt;element name="Requirement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Emergency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}NumUnits" minOccurs="0"/>
 *         &lt;element name="ApplicationDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="DateResponseRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="ReplacementInfo" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="ApplicationSPSNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS11" minOccurs="0"/>
 *         &lt;element name="CoordinationNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/>
 *         &lt;element name="InfoTransferRequirement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="InitialCost" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS70" minOccurs="0"/>
 *         &lt;element name="InitialCostDesc" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="ITUWaiver" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="NTIACoordinationRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="NTIASpaceData" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="OperInvIntent" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="OriginatingAgency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS80" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="RelatedAnalysisAndTestData" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="SysRelationEssential" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="TSPR" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="WartimeUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Project" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Stage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Stage" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedSupportability" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedSupportability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HostNation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}HostNation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Time" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Time" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiagramEndpoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}DiagramEndpoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DiagramLine" type="{urn:us:gov:dod:standard:ssrf:3.0.0}DiagramLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StatusLog" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StatusLog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Trunking" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Trunking" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRequest", propOrder = {
  "title",
  "currentStage",
  "requirement",
  "emergency",
  "numMobileUnits",
  "numAreaUnits",
  "numCositedUnits",
  "applicationDate",
  "dateResponseRequired",
  "replacementInfo",
  "applicationSPSNumber",
  "coordinationNum",
  "infoTransferRequirement",
  "initialCost",
  "initialCostDesc",
  "ituWaiver",
  "ntiaCoordinationRequired",
  "ntiaSpaceData",
  "operInvIntent",
  "originatingAgency",
  "requestType",
  "relatedAnalysisAndTestData",
  "sysRelationEssential",
  "tspr",
  "wartimeUse",
  "project",
  "stage",
  "nomenclature",
  "pocInformation",
  "relatedSupportability",
  "hostNation",
  "time",
  "diagramEndpoint",
  "diagramLine",
  "configuration",
  "statusLog",
  "trunking"
})
public class SSRequest
  extends Common {

  @XmlElement(name = "Title", required = true)
  protected TS100 title;
  @XmlElementRef(name = "CurrentStage", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCSG> currentStage;
  @XmlElementRef(name = "Requirement", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> requirement;
  @XmlElementRef(name = "Emergency", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> emergency;
  @XmlElementRef(name = "NumMobileUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numMobileUnits;
  @XmlElementRef(name = "NumAreaUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numAreaUnits;
  @XmlElementRef(name = "NumCositedUnits", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numCositedUnits;
  @XmlElementRef(name = "ApplicationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> applicationDate;
  @XmlElementRef(name = "DateResponseRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> dateResponseRequired;
  @XmlElementRef(name = "ReplacementInfo", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> replacementInfo;
  @XmlElementRef(name = "ApplicationSPSNumber", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS11> applicationSPSNumber;
  @XmlElementRef(name = "CoordinationNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> coordinationNum;
  @XmlElementRef(name = "InfoTransferRequirement", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> infoTransferRequirement;
  @XmlElementRef(name = "InitialCost", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS70> initialCost;
  @XmlElementRef(name = "InitialCostDesc", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> initialCostDesc;
  @XmlElementRef(name = "ITUWaiver", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> ituWaiver;
  @XmlElementRef(name = "NTIACoordinationRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> ntiaCoordinationRequired;
  @XmlElementRef(name = "NTIASpaceData", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> ntiaSpaceData;
  @XmlElementRef(name = "OperInvIntent", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> operInvIntent;
  @XmlElementRef(name = "OriginatingAgency", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS80> originatingAgency;
  @XmlElementRef(name = "RequestType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> requestType;
  @XmlElementRef(name = "RelatedAnalysisAndTestData", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> relatedAnalysisAndTestData;
  @XmlElementRef(name = "SysRelationEssential", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> sysRelationEssential;
  @XmlElementRef(name = "TSPR", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> tspr;
  @XmlElementRef(name = "WartimeUse", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> wartimeUse;
  @XmlElement(name = "Project")
  protected List<Project> project;
  @XmlElement(name = "Stage")
  protected List<Stage> stage;
  @XmlElement(name = "Nomenclature")
  protected List<Nomenclature> nomenclature;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "RelatedSupportability")
  protected List<RelatedSupportability> relatedSupportability;
  @XmlElement(name = "HostNation", nillable = true)
  protected List<HostNation> hostNation;
  @XmlElement(name = "Time")
  protected List<Time> time;
  @XmlElement(name = "DiagramEndpoint")
  protected List<DiagramEndpoint> diagramEndpoint;
  @XmlElement(name = "DiagramLine")
  protected List<DiagramLine> diagramLine;
  @XmlElement(name = "Configuration")
  protected List<Configuration> configuration;
  @XmlElement(name = "StatusLog")
  protected List<StatusLog> statusLog;
  @XmlElement(name = "Trunking")
  protected Trunking trunking;

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setTitle(TS100 value) {
    this.title = value;
  }

  /**
   * Gets the value of the currentStage property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCSG }{@code >}
   * <p>
   */
  public JAXBElement<TListCSG> getCurrentStage() {
    return currentStage;
  }

  /**
   * Sets the value of the currentStage property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCSG }{@code >}
   * <p>
   */
  public void setCurrentStage(JAXBElement<TListCSG> value) {
    this.currentStage = value;
  }

  /**
   * Gets the value of the requirement property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getRequirement() {
    return requirement;
  }

  /**
   * Sets the value of the requirement property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setRequirement(JAXBElement<TMEMO> value) {
    this.requirement = value;
  }

  /**
   * Gets the value of the emergency property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getEmergency() {
    return emergency;
  }

  /**
   * Sets the value of the emergency property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setEmergency(JAXBElement<TListCBO> value) {
    this.emergency = value;
  }

  /**
   * Gets the value of the numMobileUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Sets the value of the numMobileUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumMobileUnits(JAXBElement<TUN9> value) {
    this.numMobileUnits = value;
  }

  /**
   * Gets the value of the numAreaUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Sets the value of the numAreaUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumAreaUnits(JAXBElement<TUN9> value) {
    this.numAreaUnits = value;
  }

  /**
   * Gets the value of the numCositedUnits property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Sets the value of the numCositedUnits property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumCositedUnits(JAXBElement<TUN9> value) {
    this.numCositedUnits = value;
  }

  /**
   * Gets the value of the applicationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getApplicationDate() {
    return applicationDate;
  }

  /**
   * Sets the value of the applicationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setApplicationDate(JAXBElement<TD> value) {
    this.applicationDate = value;
  }

  /**
   * Gets the value of the dateResponseRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Sets the value of the dateResponseRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDateResponseRequired(JAXBElement<TD> value) {
    this.dateResponseRequired = value;
  }

  /**
   * Gets the value of the replacementInfo property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getReplacementInfo() {
    return replacementInfo;
  }

  /**
   * Sets the value of the replacementInfo property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setReplacementInfo(JAXBElement<TMEMO> value) {
    this.replacementInfo = value;
  }

  /**
   * Gets the value of the applicationSPSNumber property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public JAXBElement<TS11> getApplicationSPSNumber() {
    return applicationSPSNumber;
  }

  /**
   * Sets the value of the applicationSPSNumber property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS11 }{@code >}
   * <p>
   */
  public void setApplicationSPSNumber(JAXBElement<TS11> value) {
    this.applicationSPSNumber = value;
  }

  /**
   * Gets the value of the coordinationNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public JAXBElement<TS15> getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Sets the value of the coordinationNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setCoordinationNum(JAXBElement<TS15> value) {
    this.coordinationNum = value;
  }

  /**
   * Gets the value of the infoTransferRequirement property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getInfoTransferRequirement() {
    return infoTransferRequirement;
  }

  /**
   * Sets the value of the infoTransferRequirement property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setInfoTransferRequirement(JAXBElement<TMEMO> value) {
    this.infoTransferRequirement = value;
  }

  /**
   * Gets the value of the initialCost property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public JAXBElement<TS70> getInitialCost() {
    return initialCost;
  }

  /**
   * Sets the value of the initialCost property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public void setInitialCost(JAXBElement<TS70> value) {
    this.initialCost = value;
  }

  /**
   * Gets the value of the initialCostDesc property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getInitialCostDesc() {
    return initialCostDesc;
  }

  /**
   * Sets the value of the initialCostDesc property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setInitialCostDesc(JAXBElement<TMEMO> value) {
    this.initialCostDesc = value;
  }

  /**
   * Gets the value of the ituWaiver property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getITUWaiver() {
    return ituWaiver;
  }

  /**
   * Sets the value of the ituWaiver property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setITUWaiver(JAXBElement<TListCBO> value) {
    this.ituWaiver = value;
  }

  /**
   * Gets the value of the ntiaCoordinationRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getNTIACoordinationRequired() {
    return ntiaCoordinationRequired;
  }

  /**
   * Sets the value of the ntiaCoordinationRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setNTIACoordinationRequired(JAXBElement<TListCBO> value) {
    this.ntiaCoordinationRequired = value;
  }

  /**
   * Gets the value of the ntiaSpaceData property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getNTIASpaceData() {
    return ntiaSpaceData;
  }

  /**
   * Sets the value of the ntiaSpaceData property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setNTIASpaceData(JAXBElement<TMEMO> value) {
    this.ntiaSpaceData = value;
  }

  /**
   * Gets the value of the operInvIntent property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getOperInvIntent() {
    return operInvIntent;
  }

  /**
   * Sets the value of the operInvIntent property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setOperInvIntent(JAXBElement<TListCBO> value) {
    this.operInvIntent = value;
  }

  /**
   * Gets the value of the originatingAgency property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS80 }{@code >}
   * <p>
   */
  public JAXBElement<TS80> getOriginatingAgency() {
    return originatingAgency;
  }

  /**
   * Sets the value of the originatingAgency property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS80 }{@code >}
   * <p>
   */
  public void setOriginatingAgency(JAXBElement<TS80> value) {
    this.originatingAgency = value;
  }

  /**
   * Gets the value of the requestType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getRequestType() {
    return requestType;
  }

  /**
   * Sets the value of the requestType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setRequestType(JAXBElement<TS50> value) {
    this.requestType = value;
  }

  /**
   * Gets the value of the relatedAnalysisAndTestData property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getRelatedAnalysisAndTestData() {
    return relatedAnalysisAndTestData;
  }

  /**
   * Sets the value of the relatedAnalysisAndTestData property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setRelatedAnalysisAndTestData(JAXBElement<TMEMO> value) {
    this.relatedAnalysisAndTestData = value;
  }

  /**
   * Gets the value of the sysRelationEssential property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getSysRelationEssential() {
    return sysRelationEssential;
  }

  /**
   * Sets the value of the sysRelationEssential property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setSysRelationEssential(JAXBElement<TMEMO> value) {
    this.sysRelationEssential = value;
  }

  /**
   * Gets the value of the tspr property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getTSPR() {
    return tspr;
  }

  /**
   * Sets the value of the tspr property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setTSPR(JAXBElement<TS10> value) {
    this.tspr = value;
  }

  /**
   * Gets the value of the wartimeUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getWartimeUse() {
    return wartimeUse;
  }

  /**
   * Sets the value of the wartimeUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setWartimeUse(JAXBElement<TListCBO> value) {
    this.wartimeUse = value;
  }

  /**
   * Gets the value of the project property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Project }
   * <p>
   * <p>
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  /**
   * Gets the value of the stage property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stage property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStage().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Stage }
   * <p>
   * <p>
   */
  public List<Stage> getStage() {
    if (stage == null) {
      stage = new ArrayList<>();
    }
    return this.stage;
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
     * {@link Nomenclature }
   * <p>
   * <p>
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
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
     * {@link POCInformation }
   * <p>
   * <p>
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Gets the value of the relatedSupportability property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedSupportability property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedSupportability().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RelatedSupportability }
   * <p>
   * <p>
   */
  public List<RelatedSupportability> getRelatedSupportability() {
    if (relatedSupportability == null) {
      relatedSupportability = new ArrayList<>();
    }
    return this.relatedSupportability;
  }

  /**
   * Gets the value of the hostNation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the hostNation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHostNation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link HostNation }
   * <p>
   * <p>
   */
  public List<HostNation> getHostNation() {
    if (hostNation == null) {
      hostNation = new ArrayList<>();
    }
    return this.hostNation;
  }

  /**
   * Gets the value of the time property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the time property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTime().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Time }
   * <p>
   * <p>
   */
  public List<Time> getTime() {
    if (time == null) {
      time = new ArrayList<>();
    }
    return this.time;
  }

  /**
   * Gets the value of the diagramEndpoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the diagramEndpoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDiagramEndpoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link DiagramEndpoint }
   * <p>
   * <p>
   */
  public List<DiagramEndpoint> getDiagramEndpoint() {
    if (diagramEndpoint == null) {
      diagramEndpoint = new ArrayList<>();
    }
    return this.diagramEndpoint;
  }

  /**
   * Gets the value of the diagramLine property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the diagramLine property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDiagramLine().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link DiagramLine }
   * <p>
   * <p>
   */
  public List<DiagramLine> getDiagramLine() {
    if (diagramLine == null) {
      diagramLine = new ArrayList<>();
    }
    return this.diagramLine;
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
     * {@link Configuration }
   * <p>
   * <p>
   */
  public List<Configuration> getConfiguration() {
    if (configuration == null) {
      configuration = new ArrayList<>();
    }
    return this.configuration;
  }

  /**
   * Gets the value of the statusLog property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the statusLog property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStatusLog().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link StatusLog }
   * <p>
   * <p>
   */
  public List<StatusLog> getStatusLog() {
    if (statusLog == null) {
      statusLog = new ArrayList<>();
    }
    return this.statusLog;
  }

  /**
   * Gets the value of the trunking property.
   * <p>
   * @return possible object is {@link Trunking }
   * <p>
   */
  public Trunking getTrunking() {
    return trunking;
  }

  /**
   * Sets the value of the trunking property.
   * <p>
   * @param value allowed object is {@link Trunking }
   * <p>
   */
  public void setTrunking(Trunking value) {
    this.trunking = value;
  }

}
