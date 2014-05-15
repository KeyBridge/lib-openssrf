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
 * Java class for EndpointLocation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="EndpointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AntennaHeight" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *         &lt;element name="Excluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="LocSatRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="MinPointAngle" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz180" minOccurs="0"/>
 *         &lt;element name="SiteElevation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointLocation", propOrder = {
  "antennaHeight",
  "excluded",
  "locSatRef",
  "minPointAngle",
  "siteElevation"
})
public class EndpointLocation {

  @XmlElementRef(name = "AntennaHeight", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> antennaHeight;
  @XmlElementRef(name = "Excluded", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> excluded;
  @XmlElementRef(name = "LocSatRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> locSatRef;
  @XmlElementRef(name = "MinPointAngle", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz180> minPointAngle;
  @XmlElementRef(name = "SiteElevation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> siteElevation;

  /**
   * Gets the value of the antennaHeight property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getAntennaHeight() {
    return antennaHeight;
  }

  /**
   * Sets the value of the antennaHeight property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAntennaHeight(JAXBElement<TAltitude> value) {
    this.antennaHeight = value;
  }

  /**
   * Gets the value of the excluded property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getExcluded() {
    return excluded;
  }

  /**
   * Sets the value of the excluded property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setExcluded(JAXBElement<TListCBO> value) {
    this.excluded = value;
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
   * Gets the value of the minPointAngle property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public JAXBElement<TAz180> getMinPointAngle() {
    return minPointAngle;
  }

  /**
   * Sets the value of the minPointAngle property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public void setMinPointAngle(JAXBElement<TAz180> value) {
    this.minPointAngle = value;
  }

  /**
   * Gets the value of the siteElevation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getSiteElevation() {
    return siteElevation;
  }

  /**
   * Sets the value of the siteElevation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setSiteElevation(JAXBElement<TAltitude> value) {
    this.siteElevation = value;
  }

}
