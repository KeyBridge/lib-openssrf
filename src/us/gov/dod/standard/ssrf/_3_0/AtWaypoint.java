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
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for AtWaypoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="AtWaypoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WaypointIdx" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6"/>
 *         &lt;element name="DateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 *         &lt;element name="Speed" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSpeed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtWaypoint", propOrder = {
  "waypointIdx",
  "dateTime",
  "speed"
})
public class AtWaypoint {

  @XmlElement(name = "WaypointIdx", required = true)
  protected TUN6 waypointIdx;
  @XmlElement(name = "DateTime", required = true)
  protected TDT dateTime;
  @XmlElementRef(name = "Speed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSpeed> speed;

  /**
   * Gets the value of the waypointIdx property.
   * <p>
   * @return possible object is {@link TUN6 }
   * <p>
   */
  public TUN6 getWaypointIdx() {
    return waypointIdx;
  }

  /**
   * Sets the value of the waypointIdx property.
   * <p>
   * @param value allowed object is {@link TUN6 }
   * <p>
   */
  public void setWaypointIdx(TUN6 value) {
    this.waypointIdx = value;
  }

  /**
   * Gets the value of the dateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TDT getDateTime() {
    return dateTime;
  }

  /**
   * Sets the value of the dateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setDateTime(TDT value) {
    this.dateTime = value;
  }

  /**
   * Gets the value of the speed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSpeed }{@code >}
   * <p>
   */
  public JAXBElement<TSpeed> getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the speed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSpeed }{@code >}
   * <p>
   */
  public void setSpeed(JAXBElement<TSpeed> value) {
    this.speed = value;
  }

}
