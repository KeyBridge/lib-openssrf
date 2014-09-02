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

import us.gov.dod.standard.ssrf._3_0.datatype.TLat;
import us.gov.dod.standard.ssrf._3_0.datatype.TLon;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for PolygonPoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PolygonPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Coord"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonPoint", propOrder = {
  "lon",
  "lat"
})
public class PolygonPoint {

  @XmlElement(name = "Lon", required = true)
  protected TLon lon;
  @XmlElement(name = "Lat", required = true)
  protected TLat lat;
  @XmlAttribute(name = "sequence", required = true)
  protected BigInteger sequence;

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
   * Gets the value of the sequence property.
   * <p>
   * @return possible object is {@link BigInteger }
   * <p>
   */
  public BigInteger getSequence() {
    return sequence;
  }

  /**
   * Sets the value of the sequence property.
   * <p>
   * @param value allowed object is {@link BigInteger }
   * <p>
   */
  public void setSequence(BigInteger value) {
    this.sequence = value;
  }

}
