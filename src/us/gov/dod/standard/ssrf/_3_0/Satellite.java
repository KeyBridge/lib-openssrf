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
 * Java class for Satellite complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Satellite">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="ReviewDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="CallSign" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="OrbitType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="LaunchStatus" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="LaunchLocRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="LaunchDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="GeoNominalLon" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TLon" minOccurs="0"/>
 *         &lt;element name="GeoAltitude" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 *         &lt;element name="NonGeoPeriod" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Tminutes" minOccurs="0"/>
 *         &lt;element name="NonGeoNumSatellites" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4" minOccurs="0"/>
 *         &lt;element name="NonGeoApogee" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 *         &lt;element name="NonGeoPerigee" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 *         &lt;element name="NonGeoInclination" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/>
 *         &lt;element name="InternationalDesignator" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="ObjectNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="Administration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="NetworkName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="RFSystemRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RFSystemRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EarthStation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}EarthStation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceArea" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ServiceArea" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
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
public class Satellite
  extends Common {

  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElementRef(name = "CallSign", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> callSign;
  @XmlElementRef(name = "OrbitType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> orbitType;
  @XmlElementRef(name = "LaunchStatus", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> launchStatus;
  @XmlElementRef(name = "LaunchLocRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> launchLocRef;
  @XmlElementRef(name = "LaunchDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> launchDate;
  @XmlElementRef(name = "GeoNominalLon", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TLon> geoNominalLon;
  @XmlElementRef(name = "GeoAltitude", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDistance> geoAltitude;
  @XmlElementRef(name = "NonGeoPeriod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tminutes> nonGeoPeriod;
  @XmlElementRef(name = "NonGeoNumSatellites", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> nonGeoNumSatellites;
  @XmlElementRef(name = "NonGeoApogee", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDistance> nonGeoApogee;
  @XmlElementRef(name = "NonGeoPerigee", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDistance> nonGeoPerigee;
  @XmlElementRef(name = "NonGeoInclination", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> nonGeoInclination;
  @XmlElementRef(name = "InternationalDesignator", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> internationalDesignator;
  @XmlElementRef(name = "ObjectNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> objectNum;
  @XmlElementRef(name = "Administration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> administration;
  @XmlElementRef(name = "NetworkName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> networkName;
  @XmlElement(name = "RFSystemRef", nillable = true)
  protected List<RFSystemRef> rfSystemRef;
  @XmlElement(name = "EarthStation")
  protected List<EarthStation> earthStation;
  @XmlElement(name = "Identifier")
  protected List<Identifier> identifier;
  @XmlElement(name = "ServiceArea", nillable = true)
  protected List<ServiceArea> serviceArea;

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
   * Gets the value of the callSign property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getCallSign() {
    return callSign;
  }

  /**
   * Sets the value of the callSign property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setCallSign(JAXBElement<TS20> value) {
    this.callSign = value;
  }

  /**
   * Gets the value of the orbitType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getOrbitType() {
    return orbitType;
  }

  /**
   * Sets the value of the orbitType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setOrbitType(JAXBElement<TS25> value) {
    this.orbitType = value;
  }

  /**
   * Gets the value of the launchStatus property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getLaunchStatus() {
    return launchStatus;
  }

  /**
   * Sets the value of the launchStatus property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setLaunchStatus(JAXBElement<TS25> value) {
    this.launchStatus = value;
  }

  /**
   * Gets the value of the launchLocRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getLaunchLocRef() {
    return launchLocRef;
  }

  /**
   * Sets the value of the launchLocRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLaunchLocRef(JAXBElement<TSerial> value) {
    this.launchLocRef = value;
  }

  /**
   * Gets the value of the launchDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getLaunchDate() {
    return launchDate;
  }

  /**
   * Sets the value of the launchDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setLaunchDate(JAXBElement<TD> value) {
    this.launchDate = value;
  }

  /**
   * Gets the value of the geoNominalLon property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public JAXBElement<TLon> getGeoNominalLon() {
    return geoNominalLon;
  }

  /**
   * Sets the value of the geoNominalLon property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TLon }{@code >}
   * <p>
   */
  public void setGeoNominalLon(JAXBElement<TLon> value) {
    this.geoNominalLon = value;
  }

  /**
   * Gets the value of the geoAltitude property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public JAXBElement<TDistance> getGeoAltitude() {
    return geoAltitude;
  }

  /**
   * Sets the value of the geoAltitude property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setGeoAltitude(JAXBElement<TDistance> value) {
    this.geoAltitude = value;
  }

  /**
   * Gets the value of the nonGeoPeriod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tminutes }{@code >}
   * <p>
   */
  public JAXBElement<Tminutes> getNonGeoPeriod() {
    return nonGeoPeriod;
  }

  /**
   * Sets the value of the nonGeoPeriod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tminutes }{@code >}
   * <p>
   */
  public void setNonGeoPeriod(JAXBElement<Tminutes> value) {
    this.nonGeoPeriod = value;
  }

  /**
   * Gets the value of the nonGeoNumSatellites property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getNonGeoNumSatellites() {
    return nonGeoNumSatellites;
  }

  /**
   * Sets the value of the nonGeoNumSatellites property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setNonGeoNumSatellites(JAXBElement<TUN4> value) {
    this.nonGeoNumSatellites = value;
  }

  /**
   * Gets the value of the nonGeoApogee property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public JAXBElement<TDistance> getNonGeoApogee() {
    return nonGeoApogee;
  }

  /**
   * Sets the value of the nonGeoApogee property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setNonGeoApogee(JAXBElement<TDistance> value) {
    this.nonGeoApogee = value;
  }

  /**
   * Gets the value of the nonGeoPerigee property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public JAXBElement<TDistance> getNonGeoPerigee() {
    return nonGeoPerigee;
  }

  /**
   * Sets the value of the nonGeoPerigee property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setNonGeoPerigee(JAXBElement<TDistance> value) {
    this.nonGeoPerigee = value;
  }

  /**
   * Gets the value of the nonGeoInclination property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getNonGeoInclination() {
    return nonGeoInclination;
  }

  /**
   * Sets the value of the nonGeoInclination property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setNonGeoInclination(JAXBElement<TElev> value) {
    this.nonGeoInclination = value;
  }

  /**
   * Gets the value of the internationalDesignator property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getInternationalDesignator() {
    return internationalDesignator;
  }

  /**
   * Sets the value of the internationalDesignator property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setInternationalDesignator(JAXBElement<TS20> value) {
    this.internationalDesignator = value;
  }

  /**
   * Gets the value of the objectNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getObjectNum() {
    return objectNum;
  }

  /**
   * Sets the value of the objectNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setObjectNum(JAXBElement<TS20> value) {
    this.objectNum = value;
  }

  /**
   * Gets the value of the administration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getAdministration() {
    return administration;
  }

  /**
   * Sets the value of the administration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setAdministration(JAXBElement<TS100> value) {
    this.administration = value;
  }

  /**
   * Gets the value of the networkName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getNetworkName() {
    return networkName;
  }

  /**
   * Sets the value of the networkName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setNetworkName(JAXBElement<TS50> value) {
    this.networkName = value;
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
   */
  public List<RFSystemRef> getRFSystemRef() {
    if (rfSystemRef == null) {
      rfSystemRef = new ArrayList<>();
    }
    return this.rfSystemRef;
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
   */
  public List<EarthStation> getEarthStation() {
    if (earthStation == null) {
      earthStation = new ArrayList<>();
    }
    return this.earthStation;
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
   */
  public List<Identifier> getIdentifier() {
    if (identifier == null) {
      identifier = new ArrayList<>();
    }
    return this.identifier;
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
   */
  public List<ServiceArea> getServiceArea() {
    if (serviceArea == null) {
      serviceArea = new ArrayList<>();
    }
    return this.serviceArea;
  }

}
