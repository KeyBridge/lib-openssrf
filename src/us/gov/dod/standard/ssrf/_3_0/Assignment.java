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

import us.gov.dod.standard.ssrf._3_0.datatype.TUN9;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TMinSec;
import us.gov.dod.standard.ssrf._3_0.datatype.TS14;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfMonth;
import us.gov.dod.standard.ssrf._3_0.datatype.TDT;
import us.gov.dod.standard.ssrf._3_0.datatype.TS6;
import us.gov.dod.standard.ssrf._3_0.datatype.TYears;
import us.gov.dod.standard.ssrf._3_0.datatype.TS22;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_Percent;
import us.gov.dod.standard.ssrf._3_0.datatype.THours;
import us.gov.dod.standard.ssrf._3_0.datatype.TS100;
import us.gov.dod.standard.ssrf._3_0.datatype.TMEMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TS150;
import us.gov.dod.standard.ssrf._3_0.datatype.TS15;
import us.gov.dod.standard.ssrf._3_0.datatype.TS12;
import us.gov.dod.standard.ssrf._3_0.datatype.TS3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS60;
import us.gov.dod.standard.ssrf._3_0.datatype.TS8;
import us.gov.dod.standard.ssrf._3_0.datatype.TS25;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfWeek;
import us.gov.dod.standard.ssrf._3_0.datatype.TMonths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Assignment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Assignment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="UsageType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="DateResponseRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="EffectiveDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReviewDT"/>
 *         &lt;element name="Period" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame" minOccurs="0"/>
 *         &lt;element name="Processing" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="Emergency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="AssignmentAuthority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="Requirement" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="NumSystems" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/>
 *         &lt;element name="AgencyActionNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *         &lt;element name="AgencyComments" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="AgencySerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *         &lt;element name="AssignmentDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="COCOMGroup" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS8" minOccurs="0"/>
 *         &lt;element name="ControlRequestNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/>
 *         &lt;element name="CoordinationComments" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="DataSource" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS60" minOccurs="0"/>
 *         &lt;element name="FCCFileNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS22" minOccurs="0"/>
 *         &lt;element name="FMSCNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS14" minOccurs="0"/>
 *         &lt;element name="FrequencyActionOfficer" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS3" minOccurs="0"/>
 *         &lt;element name="ListSerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *         &lt;element name="NATOPooledFrequencyCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="NATOPooledFrequencyNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4" minOccurs="0"/>
 *         &lt;element name="OriginalAssignmentDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="RoutineAgendaItem" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SupplementaryDetails" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="TypeOfService" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="UsageCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS150" minOccurs="0"/>
 *         &lt;element name="UsageFrequency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="UsagePercentage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_Percent" minOccurs="0"/>
 *         &lt;element name="UserNetCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS6" minOccurs="0"/>
 *         &lt;element name="Project" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SysOfStation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SysOfStation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Configuration" maxOccurs="unbounded"/>
 *         &lt;element name="Station" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Station" maxOccurs="unbounded"/>
 *         &lt;element name="Link" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Link" maxOccurs="unbounded"/>
 *         &lt;element name="StatusLog" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StatusLog" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AsgnAllotOwner" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnAllotOwner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CircuitRemarks" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CircuitRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CoordinationData" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CoordinationData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocketNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}DocketNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HostDocketNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}HostDocketNum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OffTheShelfEquipment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}OffTheShelfEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousAuthorization" type="{urn:us:gov:dod:standard:ssrf:3.0.0}PreviousAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordNote" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RecordNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assignment", propOrder = {
  "title",
  "usageType",
  "dateResponseRequired",
  "effectiveDateTime",
  "expirationDateTime",
  "reviewDate",
  "period",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "processing",
  "emergency",
  "assignmentAuthority",
  "requirement",
  "numSystems",
  "agencyActionNum",
  "agencyComments",
  "agencySerialNum",
  "assignmentDate",
  "cocomGroup",
  "controlRequestNum",
  "coordinationComments",
  "dataSource",
  "fccFileNum",
  "fmscNum",
  "frequencyActionOfficer",
  "listSerialNum",
  "natoPooledFrequencyCode",
  "natoPooledFrequencyNum",
  "originalAssignmentDate",
  "routineAgendaItem",
  "supplementaryDetails",
  "typeOfService",
  "usageCode",
  "usageFrequency",
  "usagePercentage",
  "userNetCode",
  "project",
  "pocInformation",
  "sysOfStation",
  "relatedRef",
  "configuration",
  "station",
  "link",
  "statusLog",
  "asgnAllotOwner",
  "circuitRemarks",
  "coordinationData",
  "docketNum",
  "hostDocketNum",
  "offTheShelfEquipment",
  "previousAuthorization",
  "recordNote"
})
public class Assignment
  extends Common {

  @XmlElementRef(name = "Title", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> title;
  @XmlElementRef(name = "UsageType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> usageType;
  @XmlElementRef(name = "DateResponseRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> dateResponseRequired;
  @XmlElement(name = "EffectiveDateTime", required = true)
  protected TDT effectiveDateTime;
  @XmlElementRef(name = "ExpirationDateTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDT> expirationDateTime;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElementRef(name = "Period", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> period;
  @XmlElementRef(name = "Seconds", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> seconds;
  @XmlElementRef(name = "Minutes", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> minutes;
  @XmlElementRef(name = "Hours", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<THours> hours;
  @XmlElementRef(name = "DaysOfMonth", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfMonth> daysOfMonth;
  @XmlElementRef(name = "Months", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMonths> months;
  @XmlElementRef(name = "DaysOfWeek", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfWeek> daysOfWeek;
  @XmlElementRef(name = "Years", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TYears> years;
  @XmlElementRef(name = "Duration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> duration;
  @XmlElementRef(name = "Processing", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> processing;
  @XmlElementRef(name = "Emergency", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> emergency;
  @XmlElementRef(name = "AssignmentAuthority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> assignmentAuthority;
  @XmlElementRef(name = "Requirement", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> requirement;
  @XmlElementRef(name = "NumSystems", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numSystems;
  @XmlElementRef(name = "AgencyActionNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS12> agencyActionNum;
  @XmlElementRef(name = "AgencyComments", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> agencyComments;
  @XmlElementRef(name = "AgencySerialNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS12> agencySerialNum;
  @XmlElementRef(name = "AssignmentDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> assignmentDate;
  @XmlElementRef(name = "COCOMGroup", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS8> cocomGroup;
  @XmlElementRef(name = "ControlRequestNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> controlRequestNum;
  @XmlElementRef(name = "CoordinationComments", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> coordinationComments;
  @XmlElementRef(name = "DataSource", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS60> dataSource;
  @XmlElementRef(name = "FCCFileNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS22> fccFileNum;
  @XmlElementRef(name = "FMSCNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS14> fmscNum;
  @XmlElementRef(name = "FrequencyActionOfficer", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS3> frequencyActionOfficer;
  @XmlElementRef(name = "ListSerialNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS12> listSerialNum;
  @XmlElementRef(name = "NATOPooledFrequencyCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> natoPooledFrequencyCode;
  @XmlElementRef(name = "NATOPooledFrequencyNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> natoPooledFrequencyNum;
  @XmlElementRef(name = "OriginalAssignmentDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> originalAssignmentDate;
  @XmlElementRef(name = "RoutineAgendaItem", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> routineAgendaItem;
  @XmlElementRef(name = "SupplementaryDetails", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> supplementaryDetails;
  @XmlElementRef(name = "TypeOfService", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> typeOfService;
  @XmlElementRef(name = "UsageCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS150> usageCode;
  @XmlElementRef(name = "UsageFrequency", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> usageFrequency;
  @XmlElementRef(name = "UsagePercentage", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_Percent> usagePercentage;
  @XmlElementRef(name = "UserNetCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS6> userNetCode;
  @XmlElement(name = "Project")
  protected List<Project> project;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "SysOfStation")
  protected List<SysOfStation> sysOfStation;
  @XmlElement(name = "RelatedRef", nillable = true)
  protected List<RelatedRef> relatedRef;
  @XmlElement(name = "Configuration", required = true)
  protected List<Configuration> configuration;
  @XmlElement(name = "Station", required = true)
  protected List<Station> station;
  @XmlElement(name = "Link", required = true)
  protected List<Link> link;
  @XmlElement(name = "StatusLog")
  protected List<StatusLog> statusLog;
  @XmlElement(name = "AsgnAllotOwner")
  protected List<AsgnAllotOwner> asgnAllotOwner;
  @XmlElement(name = "CircuitRemarks")
  protected List<CircuitRemarks> circuitRemarks;
  @XmlElement(name = "CoordinationData")
  protected List<CoordinationData> coordinationData;
  @XmlElement(name = "DocketNum")
  protected List<DocketNum> docketNum;
  @XmlElement(name = "HostDocketNum")
  protected List<HostDocketNum> hostDocketNum;
  @XmlElement(name = "OffTheShelfEquipment")
  protected List<OffTheShelfEquipment> offTheShelfEquipment;
  @XmlElement(name = "PreviousAuthorization")
  protected List<PreviousAuthorization> previousAuthorization;
  @XmlElement(name = "RecordNote")
  protected List<RecordNote> recordNote;

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setTitle(JAXBElement<TS100> value) {
    this.title = value;
  }

  /**
   * Gets the value of the usageType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getUsageType() {
    return usageType;
  }

  /**
   * Sets the value of the usageType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setUsageType(JAXBElement<TS25> value) {
    this.usageType = value;
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
   * Gets the value of the effectiveDateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TDT getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Sets the value of the effectiveDateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setEffectiveDateTime(TDT value) {
    this.effectiveDateTime = value;
  }

  /**
   * Gets the value of the expirationDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public JAXBElement<TDT> getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Sets the value of the expirationDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setExpirationDateTime(JAXBElement<TDT> value) {
    this.expirationDateTime = value;
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the period property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getPeriod() {
    return period;
  }

  /**
   * Sets the value of the period property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setPeriod(JAXBElement<TS50> value) {
    this.period = value;
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setSeconds(JAXBElement<TMinSec> value) {
    this.seconds = value;
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setMinutes(JAXBElement<TMinSec> value) {
    this.minutes = value;
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public JAXBElement<THours> getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public void setHours(JAXBElement<THours> value) {
    this.hours = value;
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfMonth> getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public void setDaysOfMonth(JAXBElement<TDaysOfMonth> value) {
    this.daysOfMonth = value;
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public JAXBElement<TMonths> getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public void setMonths(JAXBElement<TMonths> value) {
    this.months = value;
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public void setDaysOfWeek(JAXBElement<TDaysOfWeek> value) {
    this.daysOfWeek = value;
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public JAXBElement<TYears> getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public void setYears(JAXBElement<TYears> value) {
    this.years = value;
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setDuration(JAXBElement<TUN4> value) {
    this.duration = value;
  }

  /**
   * Gets the value of the processing property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getProcessing() {
    return processing;
  }

  /**
   * Sets the value of the processing property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setProcessing(JAXBElement<TS50> value) {
    this.processing = value;
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
   * Gets the value of the assignmentAuthority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getAssignmentAuthority() {
    return assignmentAuthority;
  }

  /**
   * Sets the value of the assignmentAuthority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setAssignmentAuthority(JAXBElement<TS50> value) {
    this.assignmentAuthority = value;
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
   * Gets the value of the numSystems property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumSystems() {
    return numSystems;
  }

  /**
   * Sets the value of the numSystems property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumSystems(JAXBElement<TUN9> value) {
    this.numSystems = value;
  }

  /**
   * Gets the value of the agencyActionNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public JAXBElement<TS12> getAgencyActionNum() {
    return agencyActionNum;
  }

  /**
   * Sets the value of the agencyActionNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setAgencyActionNum(JAXBElement<TS12> value) {
    this.agencyActionNum = value;
  }

  /**
   * Gets the value of the agencyComments property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getAgencyComments() {
    return agencyComments;
  }

  /**
   * Sets the value of the agencyComments property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setAgencyComments(JAXBElement<TMEMO> value) {
    this.agencyComments = value;
  }

  /**
   * Gets the value of the agencySerialNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public JAXBElement<TS12> getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Sets the value of the agencySerialNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setAgencySerialNum(JAXBElement<TS12> value) {
    this.agencySerialNum = value;
  }

  /**
   * Gets the value of the assignmentDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getAssignmentDate() {
    return assignmentDate;
  }

  /**
   * Sets the value of the assignmentDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setAssignmentDate(JAXBElement<TD> value) {
    this.assignmentDate = value;
  }

  /**
   * Gets the value of the cocomGroup property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS8 }{@code >}
   * <p>
   */
  public JAXBElement<TS8> getCOCOMGroup() {
    return cocomGroup;
  }

  /**
   * Sets the value of the cocomGroup property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS8 }{@code >}
   * <p>
   */
  public void setCOCOMGroup(JAXBElement<TS8> value) {
    this.cocomGroup = value;
  }

  /**
   * Gets the value of the controlRequestNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public JAXBElement<TS15> getControlRequestNum() {
    return controlRequestNum;
  }

  /**
   * Sets the value of the controlRequestNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setControlRequestNum(JAXBElement<TS15> value) {
    this.controlRequestNum = value;
  }

  /**
   * Gets the value of the coordinationComments property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getCoordinationComments() {
    return coordinationComments;
  }

  /**
   * Sets the value of the coordinationComments property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setCoordinationComments(JAXBElement<TMEMO> value) {
    this.coordinationComments = value;
  }

  /**
   * Gets the value of the dataSource property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS60 }{@code >}
   * <p>
   */
  public JAXBElement<TS60> getDataSource() {
    return dataSource;
  }

  /**
   * Sets the value of the dataSource property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS60 }{@code >}
   * <p>
   */
  public void setDataSource(JAXBElement<TS60> value) {
    this.dataSource = value;
  }

  /**
   * Gets the value of the fccFileNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS22 }{@code >}
   * <p>
   */
  public JAXBElement<TS22> getFCCFileNum() {
    return fccFileNum;
  }

  /**
   * Sets the value of the fccFileNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS22 }{@code >}
   * <p>
   */
  public void setFCCFileNum(JAXBElement<TS22> value) {
    this.fccFileNum = value;
  }

  /**
   * Gets the value of the fmscNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS14 }{@code >}
   * <p>
   */
  public JAXBElement<TS14> getFMSCNum() {
    return fmscNum;
  }

  /**
   * Sets the value of the fmscNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS14 }{@code >}
   * <p>
   */
  public void setFMSCNum(JAXBElement<TS14> value) {
    this.fmscNum = value;
  }

  /**
   * Gets the value of the frequencyActionOfficer property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS3 }{@code >}
   * <p>
   */
  public JAXBElement<TS3> getFrequencyActionOfficer() {
    return frequencyActionOfficer;
  }

  /**
   * Sets the value of the frequencyActionOfficer property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS3 }{@code >}
   * <p>
   */
  public void setFrequencyActionOfficer(JAXBElement<TS3> value) {
    this.frequencyActionOfficer = value;
  }

  /**
   * Gets the value of the listSerialNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public JAXBElement<TS12> getListSerialNum() {
    return listSerialNum;
  }

  /**
   * Sets the value of the listSerialNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setListSerialNum(JAXBElement<TS12> value) {
    this.listSerialNum = value;
  }

  /**
   * Gets the value of the natoPooledFrequencyCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getNATOPooledFrequencyCode() {
    return natoPooledFrequencyCode;
  }

  /**
   * Sets the value of the natoPooledFrequencyCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setNATOPooledFrequencyCode(JAXBElement<TS25> value) {
    this.natoPooledFrequencyCode = value;
  }

  /**
   * Gets the value of the natoPooledFrequencyNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getNATOPooledFrequencyNum() {
    return natoPooledFrequencyNum;
  }

  /**
   * Sets the value of the natoPooledFrequencyNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setNATOPooledFrequencyNum(JAXBElement<TUN4> value) {
    this.natoPooledFrequencyNum = value;
  }

  /**
   * Gets the value of the originalAssignmentDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getOriginalAssignmentDate() {
    return originalAssignmentDate;
  }

  /**
   * Sets the value of the originalAssignmentDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setOriginalAssignmentDate(JAXBElement<TD> value) {
    this.originalAssignmentDate = value;
  }

  /**
   * Gets the value of the routineAgendaItem property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getRoutineAgendaItem() {
    return routineAgendaItem;
  }

  /**
   * Sets the value of the routineAgendaItem property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setRoutineAgendaItem(JAXBElement<TS50> value) {
    this.routineAgendaItem = value;
  }

  /**
   * Gets the value of the supplementaryDetails property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getSupplementaryDetails() {
    return supplementaryDetails;
  }

  /**
   * Sets the value of the supplementaryDetails property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setSupplementaryDetails(JAXBElement<TMEMO> value) {
    this.supplementaryDetails = value;
  }

  /**
   * Gets the value of the typeOfService property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getTypeOfService() {
    return typeOfService;
  }

  /**
   * Sets the value of the typeOfService property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setTypeOfService(JAXBElement<TS50> value) {
    this.typeOfService = value;
  }

  /**
   * Gets the value of the usageCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public JAXBElement<TS150> getUsageCode() {
    return usageCode;
  }

  /**
   * Sets the value of the usageCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS150 }{@code >}
   * <p>
   */
  public void setUsageCode(JAXBElement<TS150> value) {
    this.usageCode = value;
  }

  /**
   * Gets the value of the usageFrequency property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getUsageFrequency() {
    return usageFrequency;
  }

  /**
   * Sets the value of the usageFrequency property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setUsageFrequency(JAXBElement<TS50> value) {
    this.usageFrequency = value;
  }

  /**
   * Gets the value of the usagePercentage property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_Percent }{@code >}
   * <p>
   */
  public JAXBElement<TUS_Percent> getUsagePercentage() {
    return usagePercentage;
  }

  /**
   * Sets the value of the usagePercentage property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_Percent }{@code >}
   * <p>
   */
  public void setUsagePercentage(JAXBElement<TUS_Percent> value) {
    this.usagePercentage = value;
  }

  /**
   * Gets the value of the userNetCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS6 }{@code >}
   * <p>
   */
  public JAXBElement<TS6> getUserNetCode() {
    return userNetCode;
  }

  /**
   * Sets the value of the userNetCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS6 }{@code >}
   * <p>
   */
  public void setUserNetCode(JAXBElement<TS6> value) {
    this.userNetCode = value;
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
   * Gets the value of the sysOfStation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the sysOfStation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSysOfStation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link SysOfStation }
   * <p>
   * <p>
   */
  public List<SysOfStation> getSysOfStation() {
    if (sysOfStation == null) {
      sysOfStation = new ArrayList<>();
    }
    return this.sysOfStation;
  }

  /**
   * Gets the value of the relatedRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RelatedRef }
   * <p>
   * <p>
   */
  public List<RelatedRef> getRelatedRef() {
    if (relatedRef == null) {
      relatedRef = new ArrayList<>();
    }
    return this.relatedRef;
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
   * Gets the value of the station property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the station property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Station }
   * <p>
   * <p>
   */
  public List<Station> getStation() {
    if (station == null) {
      station = new ArrayList<>();
    }
    return this.station;
  }

  /**
   * Gets the value of the link property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the link property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLink().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Link }
   * <p>
   * <p>
   */
  public List<Link> getLink() {
    if (link == null) {
      link = new ArrayList<>();
    }
    return this.link;
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
   * Gets the value of the asgnAllotOwner property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the asgnAllotOwner property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAsgnAllotOwner().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link AsgnAllotOwner }
   * <p>
   * <p>
   */
  public List<AsgnAllotOwner> getAsgnAllotOwner() {
    if (asgnAllotOwner == null) {
      asgnAllotOwner = new ArrayList<>();
    }
    return this.asgnAllotOwner;
  }

  /**
   * Gets the value of the circuitRemarks property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the circuitRemarks property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCircuitRemarks().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link CircuitRemarks }
   * <p>
   * <p>
   */
  public List<CircuitRemarks> getCircuitRemarks() {
    if (circuitRemarks == null) {
      circuitRemarks = new ArrayList<>();
    }
    return this.circuitRemarks;
  }

  /**
   * Gets the value of the coordinationData property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the coordinationData property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCoordinationData().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link CoordinationData }
   * <p>
   * <p>
   */
  public List<CoordinationData> getCoordinationData() {
    if (coordinationData == null) {
      coordinationData = new ArrayList<>();
    }
    return this.coordinationData;
  }

  /**
   * Gets the value of the docketNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the docketNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDocketNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DocketNum }
   * <p>
   * <p>
   */
  public List<DocketNum> getDocketNum() {
    if (docketNum == null) {
      docketNum = new ArrayList<>();
    }
    return this.docketNum;
  }

  /**
   * Gets the value of the hostDocketNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the hostDocketNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHostDocketNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link HostDocketNum }
   * <p>
   * <p>
   */
  public List<HostDocketNum> getHostDocketNum() {
    if (hostDocketNum == null) {
      hostDocketNum = new ArrayList<>();
    }
    return this.hostDocketNum;
  }

  /**
   * Gets the value of the offTheShelfEquipment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the offTheShelfEquipment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOffTheShelfEquipment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link OffTheShelfEquipment }
   * <p>
   * <p>
   */
  public List<OffTheShelfEquipment> getOffTheShelfEquipment() {
    if (offTheShelfEquipment == null) {
      offTheShelfEquipment = new ArrayList<>();
    }
    return this.offTheShelfEquipment;
  }

  /**
   * Gets the value of the previousAuthorization property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the previousAuthorization property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPreviousAuthorization().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link PreviousAuthorization }
   * <p>
   * <p>
   */
  public List<PreviousAuthorization> getPreviousAuthorization() {
    if (previousAuthorization == null) {
      previousAuthorization = new ArrayList<>();
    }
    return this.previousAuthorization;
  }

  /**
   * Gets the value of the recordNote property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the recordNote property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRecordNote().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RecordNote }
   * <p>
   * <p>
   */
  public List<RecordNote> getRecordNote() {
    if (recordNote == null) {
      recordNote = new ArrayList<>();
    }
    return this.recordNote;
  }

}
