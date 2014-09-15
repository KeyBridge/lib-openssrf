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
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Java class for IntfReport complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="IntfReport"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="HelpRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="IntfPeriod"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="IntfStartDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 * &lt;element name="IntfStopDateTime"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT" minOccurs="0"/> &lt;element
 * name="IntfDescr" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;element name="AffectedEquipment"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="SourceFieldStrength" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6_1"
 * minOccurs="0"/> &lt;element name="SourceLon"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/> &lt;element
 * name="SourceLat" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLat"
 * minOccurs="0"/> &lt;element name="SourceAz"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/> &lt;element
 * name="SourceLocDescr" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"
 * minOccurs="0"/> &lt;element name="SourceFreqMin"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="SourceFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"
 * minOccurs="0"/> &lt;element name="SourceEmsClass"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TEmsDes" minOccurs="0"/>
 * &lt;element name="SourceEmsBw"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="VictimAsgnRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"
 * minOccurs="0"/> &lt;element name="VictimSystem"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="VictimCountry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO"
 * minOccurs="0"/> &lt;element name="VictimLon"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/> &lt;element
 * name="VictimLat" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLat"
 * minOccurs="0"/> &lt;element name="VictimLocDescr"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/> &lt;element
 * name="VictimFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 * &lt;element name="VictimFreqMax"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="SatelliteName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="SatelliteChannel"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="SatelliteUplinkFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"
 * minOccurs="0"/> &lt;element name="PerformanceEffects"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="Evaluation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"
 * minOccurs="0"/> &lt;element name="Solution"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="AffectedCSA" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"
 * minOccurs="0"/> &lt;element name="Characteristics"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="GPSAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"
 * minOccurs="0"/> &lt;element name="LocalEventID"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/> &lt;element
 * name="NetCircuitsAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO"
 * minOccurs="0"/> &lt;element name="NetsAffected"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="SATCOMPriority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="SatelliteAffected"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 * &lt;element name="SatelliteDownlinkPolarisation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="SatelliteHemisphere" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="SatelliteLongitude"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/> &lt;element
 * name="SatelliteTransponderID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="SatelliteUplinkPolarisation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntfReport", propOrder = {
  "helpRequired",
  "intfPeriod",
  "intfStartDateTime",
  "intfStopDateTime",
  "intfDescr",
  "affectedEquipment",
  "sourceFieldStrength",
  "sourceLon",
  "sourceLat",
  "sourceAz",
  "sourceLocDescr",
  "sourceFreqMin",
  "sourceFreqMax",
  "sourceEmsClass",
  "sourceEmsBw",
  "victimAsgnRef",
  "victimSystem",
  "victimCountry",
  "victimLon",
  "victimLat",
  "victimLocDescr",
  "victimFreqMin",
  "victimFreqMax",
  "satelliteName",
  "satelliteChannel",
  "satelliteUplinkFreq",
  "performanceEffects",
  "evaluation",
  "solution",
  "affectedCSA",
  "characteristics",
  "gpsAffected",
  "localEventID",
  "netCircuitsAffected",
  "netsAffected",
  "satcomPriority",
  "satelliteAffected",
  "satelliteDownlinkPolarisation",
  "satelliteHemisphere",
  "satelliteLongitude",
  "satelliteTransponderID",
  "satelliteUplinkPolarisation",
  "pocInformation"
})
public class IntfReport extends Common<IntfReport> {

  @XmlElement(name = "HelpRequired", required = false)
  private TString helpRequired;
  @XmlElement(name = "IntfPeriod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString intfPeriod;
  @XmlElement(name = "IntfStartDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar intfStartDateTime;
  @XmlElement(name = "IntfStopDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar intfStopDateTime;
  @XmlElement(name = "IntfDescr", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intfDescr;
  @XmlElement(name = "AffectedEquipment", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString affectedEquipment;
  @XmlElement(name = "SourceFieldStrength", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_1.class)
  private TDecimal sourceFieldStrength;
  @XmlElement(name = "SourceLon", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString sourceLon;
  @XmlElement(name = "SourceLat", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString sourceLat;
  @XmlElement(name = "SourceAz", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal sourceAz;
  @XmlElement(name = "SourceLocDescr", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString sourceLocDescr;
  @XmlElement(name = "SourceFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceFreqMin;
  @XmlElement(name = "SourceFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceFreqMax;
  @XmlElement(name = "SourceEmsClass", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterEMSDES.class)
  private TString sourceEmsClass;
  @XmlElement(name = "SourceEmsBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceEmsBw;
  @XmlElement(name = "VictimAsgnRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString victimAsgnRef;
  @XmlElement(name = "VictimSystem", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString victimSystem;
  @XmlElement(name = "VictimCountry", required = false)
  private TString victimCountry;
  @XmlElement(name = "VictimLon", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString victimLon;
  @XmlElement(name = "VictimLat", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString victimLat;
  @XmlElement(name = "VictimLocDescr", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString victimLocDescr;
  @XmlElement(name = "VictimFreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal victimFreqMin;
  @XmlElement(name = "VictimFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal victimFreqMax;
  @XmlElement(name = "SatelliteName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteName;
  @XmlElement(name = "SatelliteChannel", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteChannel;
  @XmlElement(name = "SatelliteUplinkFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal satelliteUplinkFreq;
  @XmlElement(name = "PerformanceEffects", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString performanceEffects;
  @XmlElement(name = "Evaluation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString evaluation;
  @XmlElement(name = "Solution", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString solution;
  @XmlElement(name = "AffectedCSA", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString affectedCSA;
  @XmlElement(name = "Characteristics", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString characteristics;
  @XmlElement(name = "GPSAffected", required = false)
  private TString gpsAffected;
  @XmlElement(name = "LocalEventID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString localEventID;
  @XmlElement(name = "NetCircuitsAffected", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString netCircuitsAffected;
  @XmlElement(name = "NetsAffected", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString netsAffected;
  @XmlElement(name = "SATCOMPriority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satcomPriority;
  @XmlElement(name = "SatelliteAffected", required = false)
  private TString satelliteAffected;
  @XmlElement(name = "SatelliteDownlinkPolarisation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteDownlinkPolarisation;
  @XmlElement(name = "SatelliteHemisphere", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteHemisphere;
  @XmlElement(name = "SatelliteLongitude", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString satelliteLongitude;
  @XmlElement(name = "SatelliteTransponderID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteTransponderID;
  @XmlElement(name = "SatelliteUplinkPolarisation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteUplinkPolarisation;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;

  /**
   * Gets the value of the helpRequired property.
   * <p>
   * @return 
   */
  public TString getHelpRequired() {
    return helpRequired;
  }

  /**
   * Sets the value of the helpRequired property.
   * <p>
   * @param value 
   */
  public void setHelpRequired(TString value) {
    this.helpRequired = value;
  }

  public boolean isSetHelpRequired() {
    return (this.helpRequired != null);
  }

  /**
   * Gets the value of the intfPeriod property.
   * <p>
   * @return 
   */
  public TString getIntfPeriod() {
    return intfPeriod;
  }

  /**
   * Sets the value of the intfPeriod property.
   * <p>
   * @param value 
   */
  public void setIntfPeriod(TString value) {
    this.intfPeriod = value;
  }

  public boolean isSetIntfPeriod() {
    return (this.intfPeriod != null);
  }

  /**
   * Gets the value of the intfStartDateTime property.
   * <p>
   * @return
   */
  public TCalendar getIntfStartDateTime() {
    return intfStartDateTime;
  }

  /**
   * Sets the value of the intfStartDateTime property.
   * <p>
   * @param value
   */
  public void setIntfStartDateTime(TCalendar value) {
    this.intfStartDateTime = value;
  }

  public boolean isSetIntfStartDateTime() {
    return (this.intfStartDateTime != null);
  }

  /**
   * Gets the value of the intfStopDateTime property.
   * <p>
   * @return 
   */
  public TCalendar getIntfStopDateTime() {
    return intfStopDateTime;
  }

  /**
   * Sets the value of the intfStopDateTime property.
   * <p>
   * @param value 
   */
  public void setIntfStopDateTime(TCalendar value) {
    this.intfStopDateTime = value;
  }

  public boolean isSetIntfStopDateTime() {
    return (this.intfStopDateTime != null);
  }

  /**
   * Gets the value of the intfDescr property.
   * <p>
   * @return 
   */
  public TString getIntfDescr() {
    return intfDescr;
  }

  /**
   * Sets the value of the intfDescr property.
   * <p>
   * @param value 
   */
  public void setIntfDescr(TString value) {
    this.intfDescr = value;
  }

  public boolean isSetIntfDescr() {
    return (this.intfDescr != null);
  }

  /**
   * Gets the value of the affectedEquipment property.
   * <p>
   * @return 
   */
  public TString getAffectedEquipment() {
    return affectedEquipment;
  }

  /**
   * Sets the value of the affectedEquipment property.
   * <p>
   * @param value 
   */
  public void setAffectedEquipment(TString value) {
    this.affectedEquipment = value;
  }

  public boolean isSetAffectedEquipment() {
    return (this.affectedEquipment != null);
  }

  /**
   * Gets the value of the sourceFieldStrength property.
   * <p>
   * @return 
   */
  public TDecimal getSourceFieldStrength() {
    return sourceFieldStrength;
  }

  /**
   * Sets the value of the sourceFieldStrength property.
   * <p>
   * @param value 
   */
  public void setSourceFieldStrength(TDecimal value) {
    this.sourceFieldStrength = value;
  }

  public boolean isSetSourceFieldStrength() {
    return (this.sourceFieldStrength != null);
  }

  /**
   * Gets the value of the sourceLon property.
   * <p>
   * @return 
   */
  public TString getSourceLon() {
    return sourceLon;
  }

  /**
   * Sets the value of the sourceLon property.
   * <p>
   * @param value 
   */
  public void setSourceLon(TString value) {
    this.sourceLon = value;
  }

  public boolean isSetSourceLon() {
    return (this.sourceLon != null);
  }

  /**
   * Gets the value of the sourceLat property.
   * <p>
   * @return 
   */
  public TString getSourceLat() {
    return sourceLat;
  }

  /**
   * Sets the value of the sourceLat property.
   * <p>
   * @param value 
   */
  public void setSourceLat(TString value) {
    this.sourceLat = value;
  }

  public boolean isSetSourceLat() {
    return (this.sourceLat != null);
  }

  /**
   * Gets the value of the sourceAz property.
   * <p>
   * @return 
   */
  public TDecimal getSourceAz() {
    return sourceAz;
  }

  /**
   * Sets the value of the sourceAz property.
   * <p>
   * @param value 
   */
  public void setSourceAz(TDecimal value) {
    this.sourceAz = value;
  }

  public boolean isSetSourceAz() {
    return (this.sourceAz != null);
  }

  /**
   * Gets the value of the sourceLocDescr property.
   * <p>
   * @return 
   */
  public TString getSourceLocDescr() {
    return sourceLocDescr;
  }

  /**
   * Sets the value of the sourceLocDescr property.
   * <p>
   * @param value 
   */
  public void setSourceLocDescr(TString value) {
    this.sourceLocDescr = value;
  }

  public boolean isSetSourceLocDescr() {
    return (this.sourceLocDescr != null);
  }

  /**
   * Gets the value of the sourceFreqMin property.
   * <p>
   * @return 
   */
  public TDecimal getSourceFreqMin() {
    return sourceFreqMin;
  }

  /**
   * Sets the value of the sourceFreqMin property.
   * <p>
   * @param value 
   */
  public void setSourceFreqMin(TDecimal value) {
    this.sourceFreqMin = value;
  }

  public boolean isSetSourceFreqMin() {
    return (this.sourceFreqMin != null);
  }

  /**
   * Gets the value of the sourceFreqMax property.
   * <p>
   * @return 
   */
  public TDecimal getSourceFreqMax() {
    return sourceFreqMax;
  }

  /**
   * Sets the value of the sourceFreqMax property.
   * <p>
   * @param value 
   */
  public void setSourceFreqMax(TDecimal value) {
    this.sourceFreqMax = value;
  }

  public boolean isSetSourceFreqMax() {
    return (this.sourceFreqMax != null);
  }

  /**
   * Gets the value of the sourceEmsClass property.
   * <p>
   * @return 
   */
  public TString getSourceEmsClass() {
    return sourceEmsClass;
  }

  /**
   * Sets the value of the sourceEmsClass property.
   * <p>
   * @param value 
   */
  public void setSourceEmsClass(TString value) {
    this.sourceEmsClass = value;
  }

  public boolean isSetSourceEmsClass() {
    return (this.sourceEmsClass != null);
  }

  /**
   * Gets the value of the sourceEmsBw property.
   * <p>
   * @return 
   */
  public TDecimal getSourceEmsBw() {
    return sourceEmsBw;
  }

  /**
   * Sets the value of the sourceEmsBw property.
   * <p>
   * @param value 
   */
  public void setSourceEmsBw(TDecimal value) {
    this.sourceEmsBw = value;
  }

  public boolean isSetSourceEmsBw() {
    return (this.sourceEmsBw != null);
  }

  /**
   * Gets the value of the victimAsgnRef property.
   * <p>
   * @return 
   */
  public TString getVictimAsgnRef() {
    return victimAsgnRef;
  }

  /**
   * Sets the value of the victimAsgnRef property.
   * <p>
   * @param value 
   */
  public void setVictimAsgnRef(TString value) {
    this.victimAsgnRef = value;
  }

  public boolean isSetVictimAsgnRef() {
    return (this.victimAsgnRef != null);
  }

  /**
   * Gets the value of the victimSystem property.
   * <p>
   * @return 
   */
  public TString getVictimSystem() {
    return victimSystem;
  }

  /**
   * Sets the value of the victimSystem property.
   * <p>
   * @param value 
   */
  public void setVictimSystem(TString value) {
    this.victimSystem = value;
  }

  public boolean isSetVictimSystem() {
    return (this.victimSystem != null);
  }

  /**
   * Gets the value of the victimCountry property.
   * <p>
   * @return 
   */
  public TString getVictimCountry() {
    return victimCountry;
  }

  /**
   * Sets the value of the victimCountry property.
   * <p>
   * @param value 
   */
  public void setVictimCountry(TString value) {
    this.victimCountry = value;
  }

  public boolean isSetVictimCountry() {
    return (this.victimCountry != null);
  }

  /**
   * Gets the value of the victimLon property.
   * <p>
   * @return 
   */
  public TString getVictimLon() {
    return victimLon;
  }

  /**
   * Sets the value of the victimLon property.
   * <p>
   * @param value 
   */
  public void setVictimLon(TString value) {
    this.victimLon = value;
  }

  public boolean isSetVictimLon() {
    return (this.victimLon != null);
  }

  /**
   * Gets the value of the victimLat property.
   * <p>
   * @return 
   */
  public TString getVictimLat() {
    return victimLat;
  }

  /**
   * Sets the value of the victimLat property.
   * <p>
   * @param value 
   */
  public void setVictimLat(TString value) {
    this.victimLat = value;
  }

  public boolean isSetVictimLat() {
    return (this.victimLat != null);
  }

  /**
   * Gets the value of the victimLocDescr property.
   * <p>
   * @return 
   */
  public TString getVictimLocDescr() {
    return victimLocDescr;
  }

  /**
   * Sets the value of the victimLocDescr property.
   * <p>
   * @param value 
   */
  public void setVictimLocDescr(TString value) {
    this.victimLocDescr = value;
  }

  public boolean isSetVictimLocDescr() {
    return (this.victimLocDescr != null);
  }

  /**
   * Gets the value of the victimFreqMin property.
   * <p>
   * @return
   */
  public TDecimal getVictimFreqMin() {
    return victimFreqMin;
  }

  /**
   * Sets the value of the victimFreqMin property.
   * <p>
   * @param value
   */
  public void setVictimFreqMin(TDecimal value) {
    this.victimFreqMin = value;
  }

  public boolean isSetVictimFreqMin() {
    return (this.victimFreqMin != null);
  }

  /**
   * Gets the value of the victimFreqMax property.
   * <p>
   * @return 
   */
  public TDecimal getVictimFreqMax() {
    return victimFreqMax;
  }

  /**
   * Sets the value of the victimFreqMax property.
   * <p>
   * @param value 
   */
  public void setVictimFreqMax(TDecimal value) {
    this.victimFreqMax = value;
  }

  public boolean isSetVictimFreqMax() {
    return (this.victimFreqMax != null);
  }

  /**
   * Gets the value of the satelliteName property.
   * <p>
   * @return 
   */
  public TString getSatelliteName() {
    return satelliteName;
  }

  /**
   * Sets the value of the satelliteName property.
   * <p>
   * @param value 
   */
  public void setSatelliteName(TString value) {
    this.satelliteName = value;
  }

  public boolean isSetSatelliteName() {
    return (this.satelliteName != null);
  }

  /**
   * Gets the value of the satelliteChannel property.
   * <p>
   * @return 
   */
  public TString getSatelliteChannel() {
    return satelliteChannel;
  }

  /**
   * Sets the value of the satelliteChannel property.
   * <p>
   * @param value 
   */
  public void setSatelliteChannel(TString value) {
    this.satelliteChannel = value;
  }

  public boolean isSetSatelliteChannel() {
    return (this.satelliteChannel != null);
  }

  /**
   * Gets the value of the satelliteUplinkFreq property.
   * <p>
   * @return 
   */
  public TDecimal getSatelliteUplinkFreq() {
    return satelliteUplinkFreq;
  }

  /**
   * Sets the value of the satelliteUplinkFreq property.
   * <p>
   * @param value 
   */
  public void setSatelliteUplinkFreq(TDecimal value) {
    this.satelliteUplinkFreq = value;
  }

  public boolean isSetSatelliteUplinkFreq() {
    return (this.satelliteUplinkFreq != null);
  }

  /**
   * Gets the value of the performanceEffects property.
   * <p>
   * @return 
   */
  public TString getPerformanceEffects() {
    return performanceEffects;
  }

  /**
   * Sets the value of the performanceEffects property.
   * <p>
   * @param value 
   */
  public void setPerformanceEffects(TString value) {
    this.performanceEffects = value;
  }

  public boolean isSetPerformanceEffects() {
    return (this.performanceEffects != null);
  }

  /**
   * Gets the value of the evaluation property.
   * <p>
   * @return 
   */
  public TString getEvaluation() {
    return evaluation;
  }

  /**
   * Sets the value of the evaluation property.
   * <p>
   * @param value 
   */
  public void setEvaluation(TString value) {
    this.evaluation = value;
  }

  public boolean isSetEvaluation() {
    return (this.evaluation != null);
  }

  /**
   * Gets the value of the solution property.
   * <p>
   * @return 
   */
  public TString getSolution() {
    return solution;
  }

  /**
   * Sets the value of the solution property.
   * <p>
   * @param value 
   */
  public void setSolution(TString value) {
    this.solution = value;
  }

  public boolean isSetSolution() {
    return (this.solution != null);
  }

  /**
   * Gets the value of the affectedCSA property.
   * <p>
   * @return 
   */
  public TString getAffectedCSA() {
    return affectedCSA;
  }

  /**
   * Sets the value of the affectedCSA property.
   * <p>
   * @param value 
   */
  public void setAffectedCSA(TString value) {
    this.affectedCSA = value;
  }

  public boolean isSetAffectedCSA() {
    return (this.affectedCSA != null);
  }

  /**
   * Gets the value of the characteristics property.
   * <p>
   * @return 
   */
  public TString getCharacteristics() {
    return characteristics;
  }

  /**
   * Sets the value of the characteristics property.
   * <p>
   * @param value 
   */
  public void setCharacteristics(TString value) {
    this.characteristics = value;
  }

  public boolean isSetCharacteristics() {
    return (this.characteristics != null);
  }

  /**
   * Gets the value of the gpsAffected property.
   * <p>
   * @return 
   */
  public TString getGPSAffected() {
    return gpsAffected;
  }

  /**
   * Sets the value of the gpsAffected property.
   * <p>
   * @param value 
   */
  public void setGPSAffected(TString value) {
    this.gpsAffected = value;
  }

  public boolean isSetGPSAffected() {
    return (this.gpsAffected != null);
  }

  /**
   * Gets the value of the localEventID property.
   * <p>
   * @return 
   */
  public TString getLocalEventID() {
    return localEventID;
  }

  /**
   * Sets the value of the localEventID property.
   * <p>
   * @param value 
   */
  public void setLocalEventID(TString value) {
    this.localEventID = value;
  }

  public boolean isSetLocalEventID() {
    return (this.localEventID != null);
  }

  /**
   * Gets the value of the netCircuitsAffected property.
   * <p>
   * @return 
   */
  public TString getNetCircuitsAffected() {
    return netCircuitsAffected;
  }

  /**
   * Sets the value of the netCircuitsAffected property.
   * <p>
   * @param value 
   */
  public void setNetCircuitsAffected(TString value) {
    this.netCircuitsAffected = value;
  }

  public boolean isSetNetCircuitsAffected() {
    return (this.netCircuitsAffected != null);
  }

  /**
   * Gets the value of the netsAffected property.
   * <p>
   * @return 
   */
  public TString getNetsAffected() {
    return netsAffected;
  }

  /**
   * Sets the value of the netsAffected property.
   * <p>
   * @param value 
   */
  public void setNetsAffected(TString value) {
    this.netsAffected = value;
  }

  public boolean isSetNetsAffected() {
    return (this.netsAffected != null);
  }

  /**
   * Gets the value of the satcomPriority property.
   * <p>
   * @return 
   */
  public TString getSATCOMPriority() {
    return satcomPriority;
  }

  /**
   * Sets the value of the satcomPriority property.
   * <p>
   * @param value 
   */
  public void setSATCOMPriority(TString value) {
    this.satcomPriority = value;
  }

  public boolean isSetSATCOMPriority() {
    return (this.satcomPriority != null);
  }

  /**
   * Gets the value of the satelliteAffected property.
   * <p>
   * @return 
   */
  public TString getSatelliteAffected() {
    return satelliteAffected;
  }

  /**
   * Sets the value of the satelliteAffected property.
   * <p>
   * @param value 
   */
  public void setSatelliteAffected(TString value) {
    this.satelliteAffected = value;
  }

  public boolean isSetSatelliteAffected() {
    return (this.satelliteAffected != null);
  }

  /**
   * Gets the value of the satelliteDownlinkPolarisation property.
   * <p>
   * @return 
   */
  public TString getSatelliteDownlinkPolarisation() {
    return satelliteDownlinkPolarisation;
  }

  /**
   * Sets the value of the satelliteDownlinkPolarisation property.
   * <p>
   * @param value 
   */
  public void setSatelliteDownlinkPolarisation(TString value) {
    this.satelliteDownlinkPolarisation = value;
  }

  public boolean isSetSatelliteDownlinkPolarisation() {
    return (this.satelliteDownlinkPolarisation != null);
  }

  /**
   * Gets the value of the satelliteHemisphere property.
   * <p>
   * @return 
   */
  public TString getSatelliteHemisphere() {
    return satelliteHemisphere;
  }

  /**
   * Sets the value of the satelliteHemisphere property.
   * <p>
   * @param value 
   */
  public void setSatelliteHemisphere(TString value) {
    this.satelliteHemisphere = value;
  }

  public boolean isSetSatelliteHemisphere() {
    return (this.satelliteHemisphere != null);
  }

  /**
   * Gets the value of the satelliteLongitude property.
   * <p>
   * @return 
   */
  public TString getSatelliteLongitude() {
    return satelliteLongitude;
  }

  /**
   * Sets the value of the satelliteLongitude property.
   * <p>
   * @param value 
   */
  public void setSatelliteLongitude(TString value) {
    this.satelliteLongitude = value;
  }

  public boolean isSetSatelliteLongitude() {
    return (this.satelliteLongitude != null);
  }

  /**
   * Gets the value of the satelliteTransponderID property.
   * <p>
   * @return 
   */
  public TString getSatelliteTransponderID() {
    return satelliteTransponderID;
  }

  /**
   * Sets the value of the satelliteTransponderID property.
   * <p>
   * @param value 
   */
  public void setSatelliteTransponderID(TString value) {
    this.satelliteTransponderID = value;
  }

  public boolean isSetSatelliteTransponderID() {
    return (this.satelliteTransponderID != null);
  }

  /**
   * Gets the value of the satelliteUplinkPolarisation property.
   * <p>
   * @return 
   */
  public TString getSatelliteUplinkPolarisation() {
    return satelliteUplinkPolarisation;
  }

  /**
   * Sets the value of the satelliteUplinkPolarisation property.
   * <p>
   * @param value 
   */
  public void setSatelliteUplinkPolarisation(TString value) {
    this.satelliteUplinkPolarisation = value;
  }

  public boolean isSetSatelliteUplinkPolarisation() {
    return (this.satelliteUplinkPolarisation != null);
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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

  public IntfReport withHelpRequired(ListCBO value) {
    setHelpRequired(new TString(value.value()));
    return this;
  }

  public IntfReport withIntfPeriod(String value) {
    setIntfPeriod(new TString(value));
    return this;
  }

  public IntfReport withIntfStartDateTime(Calendar value) {
    setIntfStartDateTime(new TCalendar(value));
    return this;
  }

  public IntfReport withIntfStopDateTime(Calendar value) {
    setIntfStopDateTime(new TCalendar(value));
    return this;
  }

  public IntfReport withIntfDescr(String value) {
    setIntfDescr(new TString(value));
    return this;
  }

  public IntfReport withAffectedEquipment(String value) {
    setAffectedEquipment(new TString(value));
    return this;
  }

  public IntfReport withSourceFieldStrength(Double value) {
    setSourceFieldStrength(new TDecimal(value));
    return this;
  }

  public IntfReport withSourceLon(String value) {
    setSourceLon(new TString(value));
    return this;
  }

  public IntfReport withSourceLat(String value) {
    setSourceLat(new TString(value));
    return this;
  }

  public IntfReport withSourceAz(Double value) {
    setSourceAz(new TDecimal(value));
    return this;
  }

  public IntfReport withSourceLocDescr(String value) {
    setSourceLocDescr(new TString(value));
    return this;
  }

  public IntfReport withSourceFreqMin(Double value) {
    setSourceFreqMin(new TDecimal(value));
    return this;
  }

  public IntfReport withSourceFreqMax(Double value) {
    setSourceFreqMax(new TDecimal(value));
    return this;
  }

  public IntfReport withSourceEmsClass(String value) {
    setSourceEmsClass(new TString(value));
    return this;
  }

  public IntfReport withSourceEmsBw(Double value) {
    setSourceEmsBw(new TDecimal(value));
    return this;
  }

  public IntfReport withVictimAsgnRef(String value) {
    setVictimAsgnRef(new TString(value));
    return this;
  }

  public IntfReport withVictimSystem(String value) {
    setVictimSystem(new TString(value));
    return this;
  }

  public IntfReport withVictimCountry(ListCAO value) {
    setVictimCountry(new TString(value.value()));
    return this;
  }

  public IntfReport withVictimLon(String value) {
    setVictimLon(new TString(value));
    return this;
  }

  public IntfReport withVictimLat(String value) {
    setVictimLat(new TString(value));
    return this;
  }

  public IntfReport withVictimLocDescr(String value) {
    setVictimLocDescr(new TString(value));
    return this;
  }

  public IntfReport withVictimFreqMin(Double value) {
    setVictimFreqMin(new TDecimal(value));
    return this;
  }

  public IntfReport withVictimFreqMax(Double value) {
    setVictimFreqMax(new TDecimal(value));
    return this;
  }

  public IntfReport withSatelliteName(String value) {
    setSatelliteName(new TString(value));
    return this;
  }

  public IntfReport withSatelliteChannel(String value) {
    setSatelliteChannel(new TString(value));
    return this;
  }

  public IntfReport withSatelliteUplinkFreq(Double value) {
    setSatelliteUplinkFreq(new TDecimal(value));
    return this;
  }

  public IntfReport withPerformanceEffects(String value) {
    setPerformanceEffects(new TString(value));
    return this;
  }

  public IntfReport withEvaluation(String value) {
    setEvaluation(new TString(value));
    return this;
  }

  public IntfReport withSolution(String value) {
    setSolution(new TString(value));
    return this;
  }

  public IntfReport withAffectedCSA(String value) {
    setAffectedCSA(new TString(value));
    return this;
  }

  public IntfReport withCharacteristics(String value) {
    setCharacteristics(new TString(value));
    return this;
  }

  public IntfReport withGPSAffected(ListCBO value) {
    setGPSAffected(new TString(value.value()));
    return this;
  }

  public IntfReport withLocalEventID(String value) {
    setLocalEventID(new TString(value));
    return this;
  }

  public IntfReport withNetCircuitsAffected(String value) {
    setNetCircuitsAffected(new TString(value));
    return this;
  }

  public IntfReport withNetsAffected(String value) {
    setNetsAffected(new TString(value));
    return this;
  }

  public IntfReport withSATCOMPriority(String value) {
    setSATCOMPriority(new TString(value));
    return this;
  }

  public IntfReport withSatelliteAffected(ListCBO value) {
    setSatelliteAffected(new TString(value.value()));
    return this;
  }

  public IntfReport withSatelliteDownlinkPolarisation(String value) {
    setSatelliteDownlinkPolarisation(new TString(value));
    return this;
  }

  public IntfReport withSatelliteHemisphere(String value) {
    setSatelliteHemisphere(new TString(value));
    return this;
  }

  public IntfReport withSatelliteLongitude(String value) {
    setSatelliteLongitude(new TString(value));
    return this;
  }

  public IntfReport withSatelliteTransponderID(String value) {
    setSatelliteTransponderID(new TString(value));
    return this;
  }

  public IntfReport withSatelliteUplinkPolarisation(String value) {
    setSatelliteUplinkPolarisation(new TString(value));
    return this;
  }

  public IntfReport withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public IntfReport withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

}
