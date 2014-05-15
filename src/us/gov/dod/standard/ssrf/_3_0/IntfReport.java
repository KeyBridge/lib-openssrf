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
 * Java class for IntfReport complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="IntfReport">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="HelpRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="IntfPeriod" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="IntfStartDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 *         &lt;element name="IntfStopDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT" minOccurs="0"/>
 *         &lt;element name="IntfDescr" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="AffectedEquipment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="SourceFieldStrength" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6_1" minOccurs="0"/>
 *         &lt;element name="SourceLon" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/>
 *         &lt;element name="SourceLat" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLat" minOccurs="0"/>
 *         &lt;element name="SourceAz" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/>
 *         &lt;element name="SourceLocDescr" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="SourceFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="SourceFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="SourceEmsClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TEmsDes" minOccurs="0"/>
 *         &lt;element name="SourceEmsBw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="VictimAsgnRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="VictimSystem" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="VictimCountry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO" minOccurs="0"/>
 *         &lt;element name="VictimLon" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/>
 *         &lt;element name="VictimLat" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLat" minOccurs="0"/>
 *         &lt;element name="VictimLocDescr" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="VictimFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="VictimFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="SatelliteName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteChannel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteUplinkFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="PerformanceEffects" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Evaluation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="Solution" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="AffectedCSA" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="Characteristics" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="GPSAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="LocalEventID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="NetCircuitsAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="NetsAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="SATCOMPriority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteAffected" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="SatelliteDownlinkPolarisation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteHemisphere" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteLongitude" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/>
 *         &lt;element name="SatelliteTransponderID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="SatelliteUplinkPolarisation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
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
public class IntfReport
  extends Common {

  @XmlElementRef(name = "HelpRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> helpRequired;
  @XmlElementRef(name = "IntfPeriod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> intfPeriod;
  @XmlElement(name = "IntfStartDateTime", required = true)
  protected TDT intfStartDateTime;
  @XmlElementRef(name = "IntfStopDateTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDT> intfStopDateTime;
  @XmlElementRef(name = "IntfDescr", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> intfDescr;
  @XmlElementRef(name = "AffectedEquipment", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> affectedEquipment;
  @XmlElementRef(name = "SourceFieldStrength", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_1> sourceFieldStrength;
  @XmlElementRef(name = "SourceLon", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLon> sourceLon;
  @XmlElementRef(name = "SourceLat", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLat> sourceLat;
  @XmlElementRef(name = "SourceAz", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> sourceAz;
  @XmlElementRef(name = "SourceLocDescr", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> sourceLocDescr;
  @XmlElementRef(name = "SourceFreqMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> sourceFreqMin;
  @XmlElementRef(name = "SourceFreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> sourceFreqMax;
  @XmlElementRef(name = "SourceEmsClass", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TEmsDes> sourceEmsClass;
  @XmlElementRef(name = "SourceEmsBw", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> sourceEmsBw;
  @XmlElementRef(name = "VictimAsgnRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> victimAsgnRef;
  @XmlElementRef(name = "VictimSystem", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> victimSystem;
  @XmlElementRef(name = "VictimCountry", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCAO> victimCountry;
  @XmlElementRef(name = "VictimLon", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLon> victimLon;
  @XmlElementRef(name = "VictimLat", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLat> victimLat;
  @XmlElementRef(name = "VictimLocDescr", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> victimLocDescr;
  @XmlElement(name = "VictimFreqMin", required = true)
  protected TFreqM victimFreqMin;
  @XmlElementRef(name = "VictimFreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> victimFreqMax;
  @XmlElementRef(name = "SatelliteName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteName;
  @XmlElementRef(name = "SatelliteChannel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteChannel;
  @XmlElementRef(name = "SatelliteUplinkFreq", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> satelliteUplinkFreq;
  @XmlElementRef(name = "PerformanceEffects", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> performanceEffects;
  @XmlElementRef(name = "Evaluation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> evaluation;
  @XmlElementRef(name = "Solution", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> solution;
  @XmlElementRef(name = "AffectedCSA", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> affectedCSA;
  @XmlElementRef(name = "Characteristics", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> characteristics;
  @XmlElementRef(name = "GPSAffected", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> gpsAffected;
  @XmlElementRef(name = "LocalEventID", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> localEventID;
  @XmlElementRef(name = "NetCircuitsAffected", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> netCircuitsAffected;
  @XmlElementRef(name = "NetsAffected", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> netsAffected;
  @XmlElementRef(name = "SATCOMPriority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satcomPriority;
  @XmlElementRef(name = "SatelliteAffected", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> satelliteAffected;
  @XmlElementRef(name = "SatelliteDownlinkPolarisation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteDownlinkPolarisation;
  @XmlElementRef(name = "SatelliteHemisphere", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteHemisphere;
  @XmlElementRef(name = "SatelliteLongitude", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLon> satelliteLongitude;
  @XmlElementRef(name = "SatelliteTransponderID", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteTransponderID;
  @XmlElementRef(name = "SatelliteUplinkPolarisation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> satelliteUplinkPolarisation;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;

  /**
   * Gets the value of the helpRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getHelpRequired() {
    return helpRequired;
  }

  /**
   * Sets the value of the helpRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setHelpRequired(JAXBElement<TListCBO> value) {
    this.helpRequired = value;
  }

  /**
   * Gets the value of the intfPeriod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getIntfPeriod() {
    return intfPeriod;
  }

  /**
   * Sets the value of the intfPeriod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setIntfPeriod(JAXBElement<TS50> value) {
    this.intfPeriod = value;
  }

  /**
   * Gets the value of the intfStartDateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TDT getIntfStartDateTime() {
    return intfStartDateTime;
  }

  /**
   * Sets the value of the intfStartDateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setIntfStartDateTime(TDT value) {
    this.intfStartDateTime = value;
  }

  /**
   * Gets the value of the intfStopDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public JAXBElement<TDT> getIntfStopDateTime() {
    return intfStopDateTime;
  }

  /**
   * Sets the value of the intfStopDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setIntfStopDateTime(JAXBElement<TDT> value) {
    this.intfStopDateTime = value;
  }

  /**
   * Gets the value of the intfDescr property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getIntfDescr() {
    return intfDescr;
  }

  /**
   * Sets the value of the intfDescr property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setIntfDescr(JAXBElement<TMEMO> value) {
    this.intfDescr = value;
  }

  /**
   * Gets the value of the affectedEquipment property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getAffectedEquipment() {
    return affectedEquipment;
  }

  /**
   * Sets the value of the affectedEquipment property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setAffectedEquipment(JAXBElement<TS100> value) {
    this.affectedEquipment = value;
  }

  /**
   * Gets the value of the sourceFieldStrength property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_1 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_1> getSourceFieldStrength() {
    return sourceFieldStrength;
  }

  /**
   * Sets the value of the sourceFieldStrength property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_1 }{@code >}
   * <p>
   */
  public void setSourceFieldStrength(JAXBElement<TUN6_1> value) {
    this.sourceFieldStrength = value;
  }

  /**
   * Gets the value of the sourceLon property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public JAXBElement<TLon> getSourceLon() {
    return sourceLon;
  }

  /**
   * Sets the value of the sourceLon property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public void setSourceLon(JAXBElement<TLon> value) {
    this.sourceLon = value;
  }

  /**
   * Gets the value of the sourceLat property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLat }{@code >}
   * <p>
   */
  public JAXBElement<TLat> getSourceLat() {
    return sourceLat;
  }

  /**
   * Sets the value of the sourceLat property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLat }{@code >}
   * <p>
   */
  public void setSourceLat(JAXBElement<TLat> value) {
    this.sourceLat = value;
  }

  /**
   * Gets the value of the sourceAz property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getSourceAz() {
    return sourceAz;
  }

  /**
   * Sets the value of the sourceAz property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setSourceAz(JAXBElement<TAz> value) {
    this.sourceAz = value;
  }

  /**
   * Gets the value of the sourceLocDescr property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getSourceLocDescr() {
    return sourceLocDescr;
  }

  /**
   * Sets the value of the sourceLocDescr property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setSourceLocDescr(JAXBElement<TS255> value) {
    this.sourceLocDescr = value;
  }

  /**
   * Gets the value of the sourceFreqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getSourceFreqMin() {
    return sourceFreqMin;
  }

  /**
   * Sets the value of the sourceFreqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setSourceFreqMin(JAXBElement<TFreqM> value) {
    this.sourceFreqMin = value;
  }

  /**
   * Gets the value of the sourceFreqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getSourceFreqMax() {
    return sourceFreqMax;
  }

  /**
   * Sets the value of the sourceFreqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setSourceFreqMax(JAXBElement<TFreqM> value) {
    this.sourceFreqMax = value;
  }

  /**
   * Gets the value of the sourceEmsClass property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}
   * <p>
   */
  public JAXBElement<TEmsDes> getSourceEmsClass() {
    return sourceEmsClass;
  }

  /**
   * Sets the value of the sourceEmsClass property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}
   * <p>
   */
  public void setSourceEmsClass(JAXBElement<TEmsDes> value) {
    this.sourceEmsClass = value;
  }

  /**
   * Gets the value of the sourceEmsBw property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getSourceEmsBw() {
    return sourceEmsBw;
  }

  /**
   * Sets the value of the sourceEmsBw property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setSourceEmsBw(JAXBElement<TFreqM> value) {
    this.sourceEmsBw = value;
  }

  /**
   * Gets the value of the victimAsgnRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getVictimAsgnRef() {
    return victimAsgnRef;
  }

  /**
   * Sets the value of the victimAsgnRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setVictimAsgnRef(JAXBElement<TSerial> value) {
    this.victimAsgnRef = value;
  }

  /**
   * Gets the value of the victimSystem property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getVictimSystem() {
    return victimSystem;
  }

  /**
   * Sets the value of the victimSystem property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setVictimSystem(JAXBElement<TS100> value) {
    this.victimSystem = value;
  }

  /**
   * Gets the value of the victimCountry property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public JAXBElement<TListCAO> getVictimCountry() {
    return victimCountry;
  }

  /**
   * Sets the value of the victimCountry property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public void setVictimCountry(JAXBElement<TListCAO> value) {
    this.victimCountry = value;
  }

  /**
   * Gets the value of the victimLon property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public JAXBElement<TLon> getVictimLon() {
    return victimLon;
  }

  /**
   * Sets the value of the victimLon property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public void setVictimLon(JAXBElement<TLon> value) {
    this.victimLon = value;
  }

  /**
   * Gets the value of the victimLat property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLat }{@code >}
   * <p>
   */
  public JAXBElement<TLat> getVictimLat() {
    return victimLat;
  }

  /**
   * Sets the value of the victimLat property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLat }{@code >}
   * <p>
   */
  public void setVictimLat(JAXBElement<TLat> value) {
    this.victimLat = value;
  }

  /**
   * Gets the value of the victimLocDescr property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getVictimLocDescr() {
    return victimLocDescr;
  }

  /**
   * Sets the value of the victimLocDescr property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setVictimLocDescr(JAXBElement<TS255> value) {
    this.victimLocDescr = value;
  }

  /**
   * Gets the value of the victimFreqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getVictimFreqMin() {
    return victimFreqMin;
  }

  /**
   * Sets the value of the victimFreqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setVictimFreqMin(TFreqM value) {
    this.victimFreqMin = value;
  }

  /**
   * Gets the value of the victimFreqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getVictimFreqMax() {
    return victimFreqMax;
  }

  /**
   * Sets the value of the victimFreqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setVictimFreqMax(JAXBElement<TFreqM> value) {
    this.victimFreqMax = value;
  }

  /**
   * Gets the value of the satelliteName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteName() {
    return satelliteName;
  }

  /**
   * Sets the value of the satelliteName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteName(JAXBElement<TS50> value) {
    this.satelliteName = value;
  }

  /**
   * Gets the value of the satelliteChannel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteChannel() {
    return satelliteChannel;
  }

  /**
   * Sets the value of the satelliteChannel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteChannel(JAXBElement<TS50> value) {
    this.satelliteChannel = value;
  }

  /**
   * Gets the value of the satelliteUplinkFreq property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getSatelliteUplinkFreq() {
    return satelliteUplinkFreq;
  }

  /**
   * Sets the value of the satelliteUplinkFreq property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setSatelliteUplinkFreq(JAXBElement<TFreqM> value) {
    this.satelliteUplinkFreq = value;
  }

  /**
   * Gets the value of the performanceEffects property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getPerformanceEffects() {
    return performanceEffects;
  }

  /**
   * Sets the value of the performanceEffects property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setPerformanceEffects(JAXBElement<TMEMO> value) {
    this.performanceEffects = value;
  }

  /**
   * Gets the value of the evaluation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getEvaluation() {
    return evaluation;
  }

  /**
   * Sets the value of the evaluation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setEvaluation(JAXBElement<TS25> value) {
    this.evaluation = value;
  }

  /**
   * Gets the value of the solution property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getSolution() {
    return solution;
  }

  /**
   * Sets the value of the solution property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setSolution(JAXBElement<TMEMO> value) {
    this.solution = value;
  }

  /**
   * Gets the value of the affectedCSA property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getAffectedCSA() {
    return affectedCSA;
  }

  /**
   * Sets the value of the affectedCSA property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setAffectedCSA(JAXBElement<TS20> value) {
    this.affectedCSA = value;
  }

  /**
   * Gets the value of the characteristics property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getCharacteristics() {
    return characteristics;
  }

  /**
   * Sets the value of the characteristics property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setCharacteristics(JAXBElement<TS50> value) {
    this.characteristics = value;
  }

  /**
   * Gets the value of the gpsAffected property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getGPSAffected() {
    return gpsAffected;
  }

  /**
   * Sets the value of the gpsAffected property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setGPSAffected(JAXBElement<TListCBO> value) {
    this.gpsAffected = value;
  }

  /**
   * Gets the value of the localEventID property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getLocalEventID() {
    return localEventID;
  }

  /**
   * Sets the value of the localEventID property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setLocalEventID(JAXBElement<TS20> value) {
    this.localEventID = value;
  }

  /**
   * Gets the value of the netCircuitsAffected property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getNetCircuitsAffected() {
    return netCircuitsAffected;
  }

  /**
   * Sets the value of the netCircuitsAffected property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setNetCircuitsAffected(JAXBElement<TMEMO> value) {
    this.netCircuitsAffected = value;
  }

  /**
   * Gets the value of the netsAffected property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getNetsAffected() {
    return netsAffected;
  }

  /**
   * Sets the value of the netsAffected property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setNetsAffected(JAXBElement<TMEMO> value) {
    this.netsAffected = value;
  }

  /**
   * Gets the value of the satcomPriority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSATCOMPriority() {
    return satcomPriority;
  }

  /**
   * Sets the value of the satcomPriority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSATCOMPriority(JAXBElement<TS50> value) {
    this.satcomPriority = value;
  }

  /**
   * Gets the value of the satelliteAffected property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getSatelliteAffected() {
    return satelliteAffected;
  }

  /**
   * Sets the value of the satelliteAffected property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setSatelliteAffected(JAXBElement<TListCBO> value) {
    this.satelliteAffected = value;
  }

  /**
   * Gets the value of the satelliteDownlinkPolarisation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteDownlinkPolarisation() {
    return satelliteDownlinkPolarisation;
  }

  /**
   * Sets the value of the satelliteDownlinkPolarisation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteDownlinkPolarisation(JAXBElement<TS50> value) {
    this.satelliteDownlinkPolarisation = value;
  }

  /**
   * Gets the value of the satelliteHemisphere property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteHemisphere() {
    return satelliteHemisphere;
  }

  /**
   * Sets the value of the satelliteHemisphere property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteHemisphere(JAXBElement<TS50> value) {
    this.satelliteHemisphere = value;
  }

  /**
   * Gets the value of the satelliteLongitude property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public JAXBElement<TLon> getSatelliteLongitude() {
    return satelliteLongitude;
  }

  /**
   * Sets the value of the satelliteLongitude property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public void setSatelliteLongitude(JAXBElement<TLon> value) {
    this.satelliteLongitude = value;
  }

  /**
   * Gets the value of the satelliteTransponderID property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteTransponderID() {
    return satelliteTransponderID;
  }

  /**
   * Sets the value of the satelliteTransponderID property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteTransponderID(JAXBElement<TS50> value) {
    this.satelliteTransponderID = value;
  }

  /**
   * Gets the value of the satelliteUplinkPolarisation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSatelliteUplinkPolarisation() {
    return satelliteUplinkPolarisation;
  }

  /**
   * Sets the value of the satelliteUplinkPolarisation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSatelliteUplinkPolarisation(JAXBElement<TS50> value) {
    this.satelliteUplinkPolarisation = value;
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

}
