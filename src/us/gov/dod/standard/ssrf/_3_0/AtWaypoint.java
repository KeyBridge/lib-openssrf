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

import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for AtWaypoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
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
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger waypointIdx;
  @XmlElement(name = "DateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar dateTime;
  @XmlElement(name = "Speed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSPEED.class)
  private TDecimal speed;

  /**
   * Gets the value of the waypointIdx property.
   * <p>
   * @return possible object is {@link TUN6 }
   * <p>
   */
  public TInteger getWaypointIdx() {
    return waypointIdx;
  }

  /**
   * Sets the value of the waypointIdx property.
   * <p>
   * @param value allowed object is {@link TUN6 }
   * <p>
   */
  public void setWaypointIdx(TInteger value) {
    this.waypointIdx = value;
  }

  public boolean isSetWaypointIdx() {
    return (this.waypointIdx != null);
  }

  /**
   * Gets the value of the dateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TCalendar getDateTime() {
    return dateTime;
  }

  /**
   * Sets the value of the dateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setDateTime(TCalendar value) {
    this.dateTime = value;
  }

  public boolean isSetDateTime() {
    return (this.dateTime != null);
  }

  /**
   * Gets the value of the speed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSpeed }{@code >}
   * <p>
   */
  public TDecimal getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the speed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSpeed }{@code >}
   * <p>
   */
  public void setSpeed(TDecimal value) {
    this.speed = value;
  }

  public boolean isSetSpeed() {
    return (this.speed != null);
  }

  public AtWaypoint withWaypointIdx(Integer value) {
    setWaypointIdx(new TInteger(value));
    return this;
  }

  public AtWaypoint withDateTime(Calendar value) {
    setDateTime(new TCalendar(value));
    return this;
  }

  public AtWaypoint withSpeed(Double value) {
    setSpeed(new TDecimal(value));
    return this;
  }

}
