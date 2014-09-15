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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.assignment.StatusLog;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.forceelement.Project;
import us.gov.dod.standard.ssrf._3_0.metadata.HostNation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_0.spectrumsupportability.*;
import us.gov.dod.standard.ssrf._3_0.system.Nomenclature;
import us.gov.dod.standard.ssrf._3_0.system.configuration.Configuration;

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
 * &lt;complexType name="SSRequest"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/> &lt;element
 * name="CurrentStage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCSG"
 * minOccurs="0"/> &lt;element name="Requirement"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="Emergency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}NumUnits"
 * minOccurs="0"/> &lt;element name="ApplicationDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="DateResponseRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="ReplacementInfo"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="ApplicationSPSNumber" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS11"
 * minOccurs="0"/> &lt;element name="CoordinationNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/> &lt;element
 * name="InfoTransferRequirement"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="InitialCost" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS70"
 * minOccurs="0"/> &lt;element name="InitialCostDesc"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="ITUWaiver" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="NTIACoordinationRequired"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 * &lt;element name="NTIASpaceData"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="OperInvIntent" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="OriginatingAgency"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS80" minOccurs="0"/> &lt;element
 * name="RequestType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="RelatedAnalysisAndTestData"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="SysRelationEssential" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;element name="TSPR"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/> &lt;element
 * name="WartimeUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="Project"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Stage"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Stage" maxOccurs="4"
 * minOccurs="0"/> &lt;element name="Nomenclature"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * name="RelatedSupportability"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedSupportability"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="HostNation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}HostNation" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Time"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Time" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="DiagramEndpoint"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}DiagramEndpoint"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="DiagramLine"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}DiagramLine" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Configuration"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="StatusLog"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StatusLog" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Trunking"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Trunking" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
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
public class SSRequest extends Common<SSRequest> {

  @XmlElement(name = "Title", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  @XmlElement(name = "CurrentStage", required = false)
  private TString currentStage;
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;
  @XmlElement(name = "Emergency", required = false)
  private TString emergency;
  @XmlElement(name = "NumMobileUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numMobileUnits;
  @XmlElement(name = "NumAreaUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numAreaUnits;
  @XmlElement(name = "NumCositedUnits", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numCositedUnits;
  @XmlElement(name = "ApplicationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar applicationDate;
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  @XmlElement(name = "ReplacementInfo", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString replacementInfo;
  @XmlElement(name = "ApplicationSPSNumber", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS11.class)
  private TString applicationSPSNumber;
  @XmlElement(name = "CoordinationNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString coordinationNum;
  @XmlElement(name = "InfoTransferRequirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString infoTransferRequirement;
  @XmlElement(name = "InitialCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString initialCost;
  @XmlElement(name = "InitialCostDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString initialCostDesc;
  @XmlElement(name = "ITUWaiver", required = false)
  private TString ituWaiver;
  @XmlElement(name = "NTIACoordinationRequired", required = false)
  private TString ntiaCoordinationRequired;
  @XmlElement(name = "NTIASpaceData", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString ntiaSpaceData;
  @XmlElement(name = "OperInvIntent", required = false)
  private TString operInvIntent;
  @XmlElement(name = "OriginatingAgency", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS80.class)
  private TString originatingAgency;
  @XmlElement(name = "RequestType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString requestType;
  @XmlElement(name = "RelatedAnalysisAndTestData", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString relatedAnalysisAndTestData;
  @XmlElement(name = "SysRelationEssential", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString sysRelationEssential;
  @XmlElement(name = "TSPR", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString tspr;
  @XmlElement(name = "WartimeUse", required = false)
  private TString wartimeUse;
  @XmlElement(name = "Project")
  private List<Project> project;
  @XmlElement(name = "Stage")
  private List<Stage> stage;
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "RelatedSupportability")
  private List<RelatedSupportability> relatedSupportability;
  @XmlElement(name = "HostNation", nillable = true)
  private List<HostNation> hostNation;
  @XmlElement(name = "Time")
  private List<Time> time;
  @XmlElement(name = "DiagramEndpoint")
  private List<DiagramEndpoint> diagramEndpoint;
  @XmlElement(name = "DiagramLine")
  private List<DiagramLine> diagramLine;
  @XmlElement(name = "Configuration")
  private List<Configuration> configuration;
  @XmlElement(name = "StatusLog")
  private List<StatusLog> statusLog;
  @XmlElement(name = "Trunking")
  protected Trunking trunking;

  /**
   * Gets the value of the title property.
   * <p>
   * @return
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the currentStage property.
   * <p>
   * @return 
   */
  public TString getCurrentStage() {
    return currentStage;
  }

  /**
   * Sets the value of the currentStage property.
   * <p>
   * @param value 
   */
  public void setCurrentStage(TString value) {
    this.currentStage = value;
  }

  public boolean isSetCurrentStage() {
    return (this.currentStage != null);
  }

  /**
   * Gets the value of the requirement property.
   * <p>
   * @return 
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Sets the value of the requirement property.
   * <p>
   * @param value 
   */
  public void setRequirement(TString value) {
    this.requirement = value;
  }

  public boolean isSetRequirement() {
    return (this.requirement != null);
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
   * Gets the value of the numMobileUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumMobileUnits() {
    return numMobileUnits;
  }

  /**
   * Sets the value of the numMobileUnits property.
   * <p>
   * @param value 
   */
  public void setNumMobileUnits(TInteger value) {
    this.numMobileUnits = value;
  }

  public boolean isSetNumMobileUnits() {
    return (this.numMobileUnits != null);
  }

  /**
   * Gets the value of the numAreaUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumAreaUnits() {
    return numAreaUnits;
  }

  /**
   * Sets the value of the numAreaUnits property.
   * <p>
   * @param value 
   */
  public void setNumAreaUnits(TInteger value) {
    this.numAreaUnits = value;
  }

  public boolean isSetNumAreaUnits() {
    return (this.numAreaUnits != null);
  }

  /**
   * Gets the value of the numCositedUnits property.
   * <p>
   * @return 
   */
  public TInteger getNumCositedUnits() {
    return numCositedUnits;
  }

  /**
   * Sets the value of the numCositedUnits property.
   * <p>
   * @param value 
   */
  public void setNumCositedUnits(TInteger value) {
    this.numCositedUnits = value;
  }

  public boolean isSetNumCositedUnits() {
    return (this.numCositedUnits != null);
  }

  /**
   * Gets the value of the applicationDate property.
   * <p>
   * @return 
   */
  public TCalendar getApplicationDate() {
    return applicationDate;
  }

  /**
   * Sets the value of the applicationDate property.
   * <p>
   * @param value 
   */
  public void setApplicationDate(TCalendar value) {
    this.applicationDate = value;
  }

  public boolean isSetApplicationDate() {
    return (this.applicationDate != null);
  }

  /**
   * Gets the value of the dateResponseRequired property.
   * <p>
   * @return 
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Sets the value of the dateResponseRequired property.
   * <p>
   * @param value 
   */
  public void setDateResponseRequired(TCalendar value) {
    this.dateResponseRequired = value;
  }

  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null);
  }

  /**
   * Gets the value of the replacementInfo property.
   * <p>
   * @return 
   */
  public TString getReplacementInfo() {
    return replacementInfo;
  }

  /**
   * Sets the value of the replacementInfo property.
   * <p>
   * @param value 
   */
  public void setReplacementInfo(TString value) {
    this.replacementInfo = value;
  }

  public boolean isSetReplacementInfo() {
    return (this.replacementInfo != null);
  }

  /**
   * Gets the value of the applicationSPSNumber property.
   * <p>
   * @return 
   */
  public TString getApplicationSPSNumber() {
    return applicationSPSNumber;
  }

  /**
   * Sets the value of the applicationSPSNumber property.
   * <p>
   * @param value 
   */
  public void setApplicationSPSNumber(TString value) {
    this.applicationSPSNumber = value;
  }

  public boolean isSetApplicationSPSNumber() {
    return (this.applicationSPSNumber != null);
  }

  /**
   * Gets the value of the coordinationNum property.
   * <p>
   * @return 
   */
  public TString getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Sets the value of the coordinationNum property.
   * <p>
   * @param value 
   */
  public void setCoordinationNum(TString value) {
    this.coordinationNum = value;
  }

  public boolean isSetCoordinationNum() {
    return (this.coordinationNum != null);
  }

  /**
   * Gets the value of the infoTransferRequirement property.
   * <p>
   * @return 
   */
  public TString getInfoTransferRequirement() {
    return infoTransferRequirement;
  }

  /**
   * Sets the value of the infoTransferRequirement property.
   * <p>
   * @param value 
   */
  public void setInfoTransferRequirement(TString value) {
    this.infoTransferRequirement = value;
  }

  public boolean isSetInfoTransferRequirement() {
    return (this.infoTransferRequirement != null);
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
   * Gets the value of the initialCostDesc property.
   * <p>
   * @return 
   */
  public TString getInitialCostDesc() {
    return initialCostDesc;
  }

  /**
   * Sets the value of the initialCostDesc property.
   * <p>
   * @param value 
   */
  public void setInitialCostDesc(TString value) {
    this.initialCostDesc = value;
  }

  public boolean isSetInitialCostDesc() {
    return (this.initialCostDesc != null);
  }

  /**
   * Gets the value of the ituWaiver property.
   * <p>
   * @return 
   */
  public TString getITUWaiver() {
    return ituWaiver;
  }

  /**
   * Sets the value of the ituWaiver property.
   * <p>
   * @param value 
   */
  public void setITUWaiver(TString value) {
    this.ituWaiver = value;
  }

  public boolean isSetITUWaiver() {
    return (this.ituWaiver != null);
  }

  /**
   * Gets the value of the ntiaCoordinationRequired property.
   * <p>
   * @return 
   */
  public TString getNTIACoordinationRequired() {
    return ntiaCoordinationRequired;
  }

  /**
   * Sets the value of the ntiaCoordinationRequired property.
   * <p>
   * @param value 
   */
  public void setNTIACoordinationRequired(TString value) {
    this.ntiaCoordinationRequired = value;
  }

  public boolean isSetNTIACoordinationRequired() {
    return (this.ntiaCoordinationRequired != null);
  }

  /**
   * Gets the value of the ntiaSpaceData property.
   * <p>
   * @return 
   */
  public TString getNTIASpaceData() {
    return ntiaSpaceData;
  }

  /**
   * Sets the value of the ntiaSpaceData property.
   * <p>
   * @param value 
   */
  public void setNTIASpaceData(TString value) {
    this.ntiaSpaceData = value;
  }

  public boolean isSetNTIASpaceData() {
    return (this.ntiaSpaceData != null);
  }

  /**
   * Gets the value of the operInvIntent property.
   * <p>
   * @return 
   */
  public TString getOperInvIntent() {
    return operInvIntent;
  }

  /**
   * Sets the value of the operInvIntent property.
   * <p>
   * @param value 
   */
  public void setOperInvIntent(TString value) {
    this.operInvIntent = value;
  }

  public boolean isSetOperInvIntent() {
    return (this.operInvIntent != null);
  }

  /**
   * Gets the value of the originatingAgency property.
   * <p>
   * @return 
   */
  public TString getOriginatingAgency() {
    return originatingAgency;
  }

  /**
   * Sets the value of the originatingAgency property.
   * <p>
   * @param value 
   */
  public void setOriginatingAgency(TString value) {
    this.originatingAgency = value;
  }

  public boolean isSetOriginatingAgency() {
    return (this.originatingAgency != null);
  }

  /**
   * Gets the value of the requestType property.
   * <p>
   * @return 
   */
  public TString getRequestType() {
    return requestType;
  }

  /**
   * Sets the value of the requestType property.
   * <p>
   * @param value 
   */
  public void setRequestType(TString value) {
    this.requestType = value;
  }

  public boolean isSetRequestType() {
    return (this.requestType != null);
  }

  /**
   * Gets the value of the relatedAnalysisAndTestData property.
   * <p>
   * @return 
   */
  public TString getRelatedAnalysisAndTestData() {
    return relatedAnalysisAndTestData;
  }

  /**
   * Sets the value of the relatedAnalysisAndTestData property.
   * <p>
   * @param value 
   */
  public void setRelatedAnalysisAndTestData(TString value) {
    this.relatedAnalysisAndTestData = value;
  }

  public boolean isSetRelatedAnalysisAndTestData() {
    return (this.relatedAnalysisAndTestData != null);
  }

  /**
   * Gets the value of the sysRelationEssential property.
   * <p>
   * @return 
   */
  public TString getSysRelationEssential() {
    return sysRelationEssential;
  }

  /**
   * Sets the value of the sysRelationEssential property.
   * <p>
   * @param value 
   */
  public void setSysRelationEssential(TString value) {
    this.sysRelationEssential = value;
  }

  public boolean isSetSysRelationEssential() {
    return (this.sysRelationEssential != null);
  }

  /**
   * Gets the value of the tspr property.
   * <p>
   * @return 
   */
  public TString getTSPR() {
    return tspr;
  }

  /**
   * Sets the value of the tspr property.
   * <p>
   * @param value 
   */
  public void setTSPR(TString value) {
    this.tspr = value;
  }

  public boolean isSetTSPR() {
    return (this.tspr != null);
  }

  /**
   * Gets the value of the wartimeUse property.
   * <p>
   * @return 
   */
  public TString getWartimeUse() {
    return wartimeUse;
  }

  /**
   * Sets the value of the wartimeUse property.
   * <p>
   * @param value 
   */
  public void setWartimeUse(TString value) {
    this.wartimeUse = value;
  }

  public boolean isSetWartimeUse() {
    return (this.wartimeUse != null);
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  public void unsetProject() {
    this.project = null;
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Stage> getStage() {
    if (stage == null) {
      stage = new ArrayList<>();
    }
    return this.stage;
  }

  public boolean isSetStage() {
    return ((this.stage != null) && (!this.stage.isEmpty()));
  }

  public void unsetStage() {
    this.stage = null;
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<RelatedSupportability> getRelatedSupportability() {
    if (relatedSupportability == null) {
      relatedSupportability = new ArrayList<>();
    }
    return this.relatedSupportability;
  }

  public boolean isSetRelatedSupportability() {
    return ((this.relatedSupportability != null) && (!this.relatedSupportability.isEmpty()));
  }

  public void unsetRelatedSupportability() {
    this.relatedSupportability = null;
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<HostNation> getHostNation() {
    if (hostNation == null) {
      hostNation = new ArrayList<>();
    }
    return this.hostNation;
  }

  public boolean isSetHostNation() {
    return ((this.hostNation != null) && (!this.hostNation.isEmpty()));
  }

  public void unsetHostNation() {
    this.hostNation = null;
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Time> getTime() {
    if (time == null) {
      time = new ArrayList<>();
    }
    return this.time;
  }

  public boolean isSetTime() {
    return ((this.time != null) && (!this.time.isEmpty()));
  }

  public void unsetTime() {
    this.time = null;
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<DiagramEndpoint> getDiagramEndpoint() {
    if (diagramEndpoint == null) {
      diagramEndpoint = new ArrayList<>();
    }
    return this.diagramEndpoint;
  }

  public boolean isSetDiagramEndpoint() {
    return ((this.diagramEndpoint != null) && (!this.diagramEndpoint.isEmpty()));
  }

  public void unsetDiagramEndpoint() {
    this.diagramEndpoint = null;
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<DiagramLine> getDiagramLine() {
    if (diagramLine == null) {
      diagramLine = new ArrayList<>();
    }
    return this.diagramLine;
  }

  public boolean isSetDiagramLine() {
    return ((this.diagramLine != null) && (!this.diagramLine.isEmpty()));
  }

  public void unsetDiagramLine() {
    this.diagramLine = null;
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<StatusLog> getStatusLog() {
    if (statusLog == null) {
      statusLog = new ArrayList<>();
    }
    return this.statusLog;
  }

  public boolean isSetStatusLog() {
    return ((this.statusLog != null) && (!this.statusLog.isEmpty()));
  }

  public void unsetStatusLog() {
    this.statusLog = null;
  }

  /**
   * Gets the value of the trunking property.
   * <p>
   * @return
   */
  public Trunking getTrunking() {
    return trunking;
  }

  /**
   * Sets the value of the trunking property.
   * <p>
   * @param value
   */
  public void setTrunking(Trunking value) {
    this.trunking = value;
  }

  public boolean isSetTrunking() {
    return (this.trunking != null);
  }

  public SSRequest withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public SSRequest withCurrentStage(ListCSG value) {
    setCurrentStage(new TString(value.value()));
    return this;
  }

  public SSRequest withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  public SSRequest withEmergency(ListCBO value) {
    setEmergency(new TString(value.value()));
    return this;
  }

  public SSRequest withNumMobileUnits(Integer value) {
    setNumMobileUnits(new TInteger(value));
    return this;
  }

  public SSRequest withNumAreaUnits(Integer value) {
    setNumAreaUnits(new TInteger(value));
    return this;
  }

  public SSRequest withNumCositedUnits(Integer value) {
    setNumCositedUnits(new TInteger(value));
    return this;
  }

  public SSRequest withApplicationDate(Calendar value) {
    setApplicationDate(new TCalendar(value));
    return this;
  }

  public SSRequest withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  public SSRequest withReplacementInfo(String value) {
    setReplacementInfo(new TString(value));
    return this;
  }

  public SSRequest withApplicationSPSNumber(String value) {
    setApplicationSPSNumber(new TString(value));
    return this;
  }

  public SSRequest withCoordinationNum(String value) {
    setCoordinationNum(new TString(value));
    return this;
  }

  public SSRequest withInfoTransferRequirement(String value) {
    setInfoTransferRequirement(new TString(value));
    return this;
  }

  public SSRequest withInitialCost(String value) {
    setInitialCost(new TString(value));
    return this;
  }

  public SSRequest withInitialCostDesc(String value) {
    setInitialCostDesc(new TString(value));
    return this;
  }

  public SSRequest withITUWaiver(ListCBO value) {
    setITUWaiver(new TString(value.value()));
    return this;
  }

  public SSRequest withNTIACoordinationRequired(ListCBO value) {
    setNTIACoordinationRequired(new TString(value.value()));
    return this;
  }

  public SSRequest withNTIASpaceData(String value) {
    setNTIASpaceData(new TString(value));
    return this;
  }

  public SSRequest withOperInvIntent(ListCBO value) {
    setOperInvIntent(new TString(value.value()));
    return this;
  }

  public SSRequest withOriginatingAgency(String value) {
    setOriginatingAgency(new TString(value));
    return this;
  }

  public SSRequest withRequestType(String value) {
    setRequestType(new TString(value));
    return this;
  }

  public SSRequest withRelatedAnalysisAndTestData(String value) {
    setRelatedAnalysisAndTestData(new TString(value));
    return this;
  }

  public SSRequest withSysRelationEssential(String value) {
    setSysRelationEssential(new TString(value));
    return this;
  }

  public SSRequest withTSPR(String value) {
    setTSPR(new TString(value));
    return this;
  }

  public SSRequest withWartimeUse(ListCBO value) {
    setWartimeUse(new TString(value.value()));
    return this;
  }

  public SSRequest withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  public SSRequest withStage(Stage... values) {
    if (values != null) {
      getStage().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withStage(Collection<Stage> values) {
    if (values != null) {
      getStage().addAll(values);
    }
    return this;
  }

  public SSRequest withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  public SSRequest withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public SSRequest withRelatedSupportability(RelatedSupportability... values) {
    if (values != null) {
      getRelatedSupportability().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withRelatedSupportability(Collection<RelatedSupportability> values) {
    if (values != null) {
      getRelatedSupportability().addAll(values);
    }
    return this;
  }

  public SSRequest withHostNation(HostNation... values) {
    if (values != null) {
      getHostNation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withHostNation(Collection<HostNation> values) {
    if (values != null) {
      getHostNation().addAll(values);
    }
    return this;
  }

  public SSRequest withTime(Time... values) {
    if (values != null) {
      getTime().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withTime(Collection<Time> values) {
    if (values != null) {
      getTime().addAll(values);
    }
    return this;
  }

  public SSRequest withDiagramEndpoint(DiagramEndpoint... values) {
    if (values != null) {
      getDiagramEndpoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withDiagramEndpoint(Collection<DiagramEndpoint> values) {
    if (values != null) {
      getDiagramEndpoint().addAll(values);
    }
    return this;
  }

  public SSRequest withDiagramLine(DiagramLine... values) {
    if (values != null) {
      getDiagramLine().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withDiagramLine(Collection<DiagramLine> values) {
    if (values != null) {
      getDiagramLine().addAll(values);
    }
    return this;
  }

  public SSRequest withConfiguration(Configuration... values) {
    if (values != null) {
      getConfiguration().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withConfiguration(Collection<Configuration> values) {
    if (values != null) {
      getConfiguration().addAll(values);
    }
    return this;
  }

  public SSRequest withStatusLog(StatusLog... values) {
    if (values != null) {
      getStatusLog().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRequest withStatusLog(Collection<StatusLog> values) {
    if (values != null) {
      getStatusLog().addAll(values);
    }
    return this;
  }

  public SSRequest withTrunking(Trunking value) {
    setTrunking(value);
    return this;
  }

}
