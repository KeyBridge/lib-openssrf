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

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for Point complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Point">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Excluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Coord"/>
 *         &lt;element name="TerrainElevation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Altitude" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idx" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
  "excluded",
  "lon",
  "lat",
  "terrainElevation",
  "altitudeMin",
  "altitudeMax"
})
public class Point {

  @XmlElementRef(name = "Excluded", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> excluded;
  @XmlElement(name = "Lon", required = true)
  protected TLon lon;
  @XmlElement(name = "Lat", required = true)
  protected TLat lat;
  @XmlElementRef(name = "TerrainElevation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> terrainElevation;
  @XmlElementRef(name = "AltitudeMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> altitudeMin;
  @XmlElementRef(name = "AltitudeMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> altitudeMax;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

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
   * Gets the value of the lon property.
   * <p>
   * @return possible object is {@link TLon }
   * <p>
   */
  public TLon getLon() {
    return lon;
  }

  /**
   * Sets the value of the lon property.
   * <p>
   * @param value allowed object is {@link TLon }
   * <p>
   */
  public void setLon(TLon value) {
    this.lon = value;
  }

  /**
   * Gets the value of the lat property.
   * <p>
   * @return possible object is {@link TLat }
   * <p>
   */
  public TLat getLat() {
    return lat;
  }

  /**
   * Sets the value of the lat property.
   * <p>
   * @param value allowed object is {@link TLat }
   * <p>
   */
  public void setLat(TLat value) {
    this.lat = value;
  }

  /**
   * Gets the value of the terrainElevation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getTerrainElevation() {
    return terrainElevation;
  }

  /**
   * Sets the value of the terrainElevation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setTerrainElevation(JAXBElement<TAltitude> value) {
    this.terrainElevation = value;
  }

  /**
   * Gets the value of the altitudeMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Sets the value of the altitudeMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAltitudeMin(JAXBElement<TAltitude> value) {
    this.altitudeMin = value;
  }

  /**
   * Gets the value of the altitudeMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Sets the value of the altitudeMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAltitudeMax(JAXBElement<TAltitude> value) {
    this.altitudeMax = value;
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return possible object is {@link BigInteger }
   * <p>
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value allowed object is {@link BigInteger }
   * <p>
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

}
