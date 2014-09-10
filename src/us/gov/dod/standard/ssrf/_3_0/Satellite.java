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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for Satellite complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Satellite"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="ReviewDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="CallSign"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/> &lt;element
 * name="OrbitType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"
 * minOccurs="0"/> &lt;element name="LaunchStatus"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/> &lt;element
 * name="LaunchLocRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"
 * minOccurs="0"/> &lt;element name="LaunchDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="GeoNominalLon" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon"
 * minOccurs="0"/> &lt;element name="GeoAltitude"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 * &lt;element name="NonGeoPeriod"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Tminutes" minOccurs="0"/>
 * &lt;element name="NonGeoNumSatellites"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4" minOccurs="0"/> &lt;element
 * name="NonGeoApogee" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance"
 * minOccurs="0"/> &lt;element name="NonGeoPerigee"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 * &lt;element name="NonGeoInclination"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/> &lt;element
 * name="InternationalDesignator"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/> &lt;element
 * name="ObjectNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"
 * minOccurs="0"/> &lt;element name="Administration"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="NetworkName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="RFSystemRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RFSystemRef" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="EarthStation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}EarthStation" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Identifier"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Identifier" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="ServiceArea"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ServiceArea" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Satellite", propOrder = {
  "reviewDate",
  "callSign",
  "orbitType",
  "launchStatus",
  "launchLocRef",
  "launchDate",
  "geoNominalLon",
  "geoAltitude",
  "nonGeoPeriod",
  "nonGeoNumSatellites",
  "nonGeoApogee",
  "nonGeoPerigee",
  "nonGeoInclination",
  "internationalDesignator",
  "objectNum",
  "administration",
  "networkName",
  "rfSystemRef",
  "earthStation",
  "identifier",
  "serviceArea"
})
public class Satellite extends Common {

  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "CallSign", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString callSign;
  @XmlElement(name = "OrbitType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString orbitType;
  @XmlElement(name = "LaunchStatus", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString launchStatus;
  @XmlElement(name = "LaunchLocRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString launchLocRef;
  @XmlElement(name = "LaunchDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar launchDate;
  @XmlElement(name = "GeoNominalLon", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString geoNominalLon;
  @XmlElement(name = "GeoAltitude", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal geoAltitude;
  @XmlElement(name = "NonGeoPeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMINUTES.class)
  private TDecimal nonGeoPeriod;
  @XmlElement(name = "NonGeoNumSatellites", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger nonGeoNumSatellites;
  @XmlElement(name = "NonGeoApogee", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal nonGeoApogee;
  @XmlElement(name = "NonGeoPerigee", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal nonGeoPerigee;
  @XmlElement(name = "NonGeoInclination", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal nonGeoInclination;
  @XmlElement(name = "InternationalDesignator", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString internationalDesignator;
  @XmlElement(name = "ObjectNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString objectNum;
  @XmlElement(name = "Administration", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString administration;
  @XmlElement(name = "NetworkName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString networkName;
  @XmlElement(name = "RFSystemRef", nillable = true)
  private List<RFSystemRef> rfSystemRef;
  @XmlElement(name = "EarthStation")
  private List<EarthStation> earthStation;
  @XmlElement(name = "Identifier")
  private List<Identifier> identifier;
  @XmlElement(name = "ServiceArea", nillable = true)
  private List<ServiceArea> serviceArea;

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the callSign property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public TString getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the callSign property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setCallSign(TString value) {
    this.callSign = value;
  }

  public boolean isSetCallSign() {
    return (this.callSign != null);
  }

  /**
   * Gets the value of the orbitType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getOrbitType() {
    return orbitType;
  }

  /**
   * Sets the value of the orbitType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setOrbitType(TString value) {
    this.orbitType = value;
  }

  public boolean isSetOrbitType() {
    return (this.orbitType != null);
  }

  /**
   * Gets the value of the launchStatus property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getLaunchStatus() {
    return launchStatus;
  }

  /**
   * Sets the value of the launchStatus property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setLaunchStatus(TString value) {
    this.launchStatus = value;
  }

  public boolean isSetLaunchStatus() {
    return (this.launchStatus != null);
  }

  /**
   * Gets the value of the launchLocRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public TString getLaunchLocRef() {
    return launchLocRef;
  }

  /**
   * Sets the value of the launchLocRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLaunchLocRef(TString value) {
    this.launchLocRef = value;
  }

  public boolean isSetLaunchLocRef() {
    return (this.launchLocRef != null);
  }

  /**
   * Gets the value of the launchDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getLaunchDate() {
    return launchDate;
  }

  /**
   * Sets the value of the launchDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setLaunchDate(TCalendar value) {
    this.launchDate = value;
  }

  public boolean isSetLaunchDate() {
    return (this.launchDate != null);
  }

  /**
   * Gets the value of the geoNominalLon property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public TString getGeoNominalLon() {
    return geoNominalLon;
  }

  /**
   * Sets the value of the geoNominalLon property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public void setGeoNominalLon(TString value) {
    this.geoNominalLon = value;
  }

  public boolean isSetGeoNominalLon() {
    return (this.geoNominalLon != null);
  }

  /**
   * Gets the value of the geoAltitude property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public TDecimal getGeoAltitude() {
    return geoAltitude;
  }

  /**
   * Sets the value of the geoAltitude property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setGeoAltitude(TDecimal value) {
    this.geoAltitude = value;
  }

  public boolean isSetGeoAltitude() {
    return (this.geoAltitude != null);
  }

  /**
   * Gets the value of the nonGeoPeriod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tminutes }{@code >}
   * <p>
   */
  public TDecimal getNonGeoPeriod() {
    return nonGeoPeriod;
  }

  /**
   * Sets the value of the nonGeoPeriod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tminutes }{@code >}
   * <p>
   */
  public void setNonGeoPeriod(TDecimal value) {
    this.nonGeoPeriod = value;
  }

  public boolean isSetNonGeoPeriod() {
    return (this.nonGeoPeriod != null);
  }

  /**
   * Gets the value of the nonGeoNumSatellites property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public TInteger getNonGeoNumSatellites() {
    return nonGeoNumSatellites;
  }

  /**
   * Sets the value of the nonGeoNumSatellites property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setNonGeoNumSatellites(TInteger value) {
    this.nonGeoNumSatellites = value;
  }

  public boolean isSetNonGeoNumSatellites() {
    return (this.nonGeoNumSatellites != null);
  }

  /**
   * Gets the value of the nonGeoApogee property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public TDecimal getNonGeoApogee() {
    return nonGeoApogee;
  }

  /**
   * Sets the value of the nonGeoApogee property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setNonGeoApogee(TDecimal value) {
    this.nonGeoApogee = value;
  }

  public boolean isSetNonGeoApogee() {
    return (this.nonGeoApogee != null);
  }

  /**
   * Gets the value of the nonGeoPerigee property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public TDecimal getNonGeoPerigee() {
    return nonGeoPerigee;
  }

  /**
   * Sets the value of the nonGeoPerigee property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setNonGeoPerigee(TDecimal value) {
    this.nonGeoPerigee = value;
  }

  public boolean isSetNonGeoPerigee() {
    return (this.nonGeoPerigee != null);
  }

  /**
   * Gets the value of the nonGeoInclination property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public TDecimal getNonGeoInclination() {
    return nonGeoInclination;
  }

  /**
   * Sets the value of the nonGeoInclination property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setNonGeoInclination(TDecimal value) {
    this.nonGeoInclination = value;
  }

  public boolean isSetNonGeoInclination() {
    return (this.nonGeoInclination != null);
  }

  /**
   * Gets the value of the internationalDesignator property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public TString getInternationalDesignator() {
    return internationalDesignator;
  }

  /**
   * Sets the value of the internationalDesignator property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setInternationalDesignator(TString value) {
    this.internationalDesignator = value;
  }

  public boolean isSetInternationalDesignator() {
    return (this.internationalDesignator != null);
  }

  /**
   * Gets the value of the objectNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public TString getObjectNum() {
    return objectNum;
  }

  /**
   * Sets the value of the objectNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setObjectNum(TString value) {
    this.objectNum = value;
  }

  public boolean isSetObjectNum() {
    return (this.objectNum != null);
  }

  /**
   * Gets the value of the administration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Sets the value of the administration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  public boolean isSetAdministration() {
    return (this.administration != null);
  }

  /**
   * Gets the value of the networkName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getNetworkName() {
    return networkName;
  }

  /**
   * Sets the value of the networkName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setNetworkName(TString value) {
    this.networkName = value;
  }

  public boolean isSetNetworkName() {
    return (this.networkName != null);
  }

  /**
   * Gets the value of the rfSystemRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rfSystemRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRFSystemRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RFSystemRef }
   * <p>
   * <p>
   * @return
   */
  public List<RFSystemRef> getRFSystemRef() {
    if (rfSystemRef == null) {
      rfSystemRef = new ArrayList<>();
    }
    return this.rfSystemRef;
  }

  public boolean isSetRFSystemRef() {
    return ((this.rfSystemRef != null) && (!this.rfSystemRef.isEmpty()));
  }

  public void unsetRFSystemRef() {
    this.rfSystemRef = null;
  }

  /**
   * Gets the value of the earthStation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the earthStation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEarthStation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link EarthStation }
   * <p>
   * <p>
   * @return
   */
  public List<EarthStation> getEarthStation() {
    if (earthStation == null) {
      earthStation = new ArrayList<>();
    }
    return this.earthStation;
  }

  public boolean isSetEarthStation() {
    return ((this.earthStation != null) && (!this.earthStation.isEmpty()));
  }

  public void unsetEarthStation() {
    this.earthStation = null;
  }

  /**
   * Gets the value of the identifier property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the identifier property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIdentifier().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
   * <p>
   * <p>
   * @return
   */
  public List<Identifier> getIdentifier() {
    if (identifier == null) {
      identifier = new ArrayList<>();
    }
    return this.identifier;
  }

  public boolean isSetIdentifier() {
    return ((this.identifier != null) && (!this.identifier.isEmpty()));
  }

  public void unsetIdentifier() {
    this.identifier = null;
  }

  /**
   * Gets the value of the serviceArea property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the serviceArea property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getServiceArea().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ServiceArea }
   * <p>
   * <p>
   * @return
   */
  public List<ServiceArea> getServiceArea() {
    if (serviceArea == null) {
      serviceArea = new ArrayList<>();
    }
    return this.serviceArea;
  }

  public boolean isSetServiceArea() {
    return ((this.serviceArea != null) && (!this.serviceArea.isEmpty()));
  }

  public void unsetServiceArea() {
    this.serviceArea = null;
  }

  public Satellite withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Satellite withCallSign(String value) {
    setCallSign(new TString(value));
    return this;
  }

  public Satellite withOrbitType(String value) {
    setOrbitType(new TString(value));
    return this;
  }

  public Satellite withLaunchStatus(String value) {
    setLaunchStatus(new TString(value));
    return this;
  }

  public Satellite withLaunchLocRef(String value) {
    setLaunchLocRef(new TString(value));
    return this;
  }

  public Satellite withLaunchDate(Calendar value) {
    setLaunchDate(new TCalendar(value));
    return this;
  }

  public Satellite withGeoNominalLon(String value) {
    setGeoNominalLon(new TString(value));
    return this;
  }

  public Satellite withGeoAltitude(Double value) {
    setGeoAltitude(new TDecimal(value));
    return this;
  }

  public Satellite withNonGeoPeriod(Double value) {
    setNonGeoPeriod(new TDecimal(value));
    return this;
  }

  public Satellite withNonGeoNumSatellites(Integer value) {
    setNonGeoNumSatellites(new TInteger(value));
    return this;
  }

  public Satellite withNonGeoApogee(Double value) {
    setNonGeoApogee(new TDecimal(value));
    return this;
  }

  public Satellite withNonGeoPerigee(Double value) {
    setNonGeoPerigee(new TDecimal(value));
    return this;
  }

  public Satellite withNonGeoInclination(Double value) {
    setNonGeoInclination(new TDecimal(value));
    return this;
  }

  public Satellite withInternationalDesignator(String value) {
    setInternationalDesignator(new TString(value));
    return this;
  }

  public Satellite withObjectNum(String value) {
    setObjectNum(new TString(value));
    return this;
  }

  public Satellite withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  public Satellite withNetworkName(String value) {
    setNetworkName(new TString(value));
    return this;
  }

  public Satellite withRFSystemRef(RFSystemRef... values) {
    if (values != null) {
      getRFSystemRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Satellite withRFSystemRef(Collection<RFSystemRef> values) {
    if (values != null) {
      getRFSystemRef().addAll(values);
    }
    return this;
  }

  public Satellite withEarthStation(EarthStation... values) {
    if (values != null) {
      getEarthStation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Satellite withEarthStation(Collection<EarthStation> values) {
    if (values != null) {
      getEarthStation().addAll(values);
    }
    return this;
  }

  public Satellite withIdentifier(Identifier... values) {
    if (values != null) {
      getIdentifier().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Satellite withIdentifier(Collection<Identifier> values) {
    if (values != null) {
      getIdentifier().addAll(values);
    }
    return this;
  }

  public Satellite withServiceArea(ServiceArea... values) {
    if (values != null) {
      getServiceArea().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Satellite withServiceArea(Collection<ServiceArea> values) {
    if (values != null) {
      getServiceArea().addAll(values);
    }
    return this;
  }

}
