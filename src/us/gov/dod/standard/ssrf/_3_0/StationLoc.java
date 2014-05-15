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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StationLoc complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="StationLoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationExcluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="LocSatRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="LocationRadius" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 *         &lt;element name="ServiceVolumeLocRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="ServiceVolumeRadius" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance" minOccurs="0"/>
 *         &lt;element name="ServiceVolumeHeight" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationLoc", propOrder = {
  "locationExcluded",
  "locSatRef",
  "locationRadius",
  "serviceVolumeLocRef",
  "serviceVolumeRadius",
  "serviceVolumeHeight"
})
public class StationLoc {

  @XmlElementRef(name = "LocationExcluded", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> locationExcluded;
  @XmlElementRef(name = "LocSatRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> locSatRef;
  @XmlElementRef(name = "LocationRadius", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDistance> locationRadius;
  @XmlElementRef(name = "ServiceVolumeLocRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> serviceVolumeLocRef;
  @XmlElementRef(name = "ServiceVolumeRadius", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDistance> serviceVolumeRadius;
  @XmlElementRef(name = "ServiceVolumeHeight", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> serviceVolumeHeight;

  /**
   * Gets the value of the locationExcluded property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getLocationExcluded() {
    return locationExcluded;
  }

  /**
   * Sets the value of the locationExcluded property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setLocationExcluded(JAXBElement<TListCBO> value) {
    this.locationExcluded = value;
  }

  /**
   * Gets the value of the locSatRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getLocSatRef() {
    return locSatRef;
  }

  /**
   * Sets the value of the locSatRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setLocSatRef(JAXBElement<TSerial> value) {
    this.locSatRef = value;
  }

  /**
   * Gets the value of the locationRadius property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public JAXBElement<TDistance> getLocationRadius() {
    return locationRadius;
  }

  /**
   * Sets the value of the locationRadius property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setLocationRadius(JAXBElement<TDistance> value) {
    this.locationRadius = value;
  }

  /**
   * Gets the value of the serviceVolumeLocRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getServiceVolumeLocRef() {
    return serviceVolumeLocRef;
  }

  /**
   * Sets the value of the serviceVolumeLocRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setServiceVolumeLocRef(JAXBElement<TSerial> value) {
    this.serviceVolumeLocRef = value;
  }

  /**
   * Gets the value of the serviceVolumeRadius property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public JAXBElement<TDistance> getServiceVolumeRadius() {
    return serviceVolumeRadius;
  }

  /**
   * Sets the value of the serviceVolumeRadius property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDistance }{@code >}
   * <p>
   */
  public void setServiceVolumeRadius(JAXBElement<TDistance> value) {
    this.serviceVolumeRadius = value;
  }

  /**
   * Gets the value of the serviceVolumeHeight property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getServiceVolumeHeight() {
    return serviceVolumeHeight;
  }

  /**
   * Sets the value of the serviceVolumeHeight property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setServiceVolumeHeight(JAXBElement<TAltitude> value) {
    this.serviceVolumeHeight = value;
  }

}
