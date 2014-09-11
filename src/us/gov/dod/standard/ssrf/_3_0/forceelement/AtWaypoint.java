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
package us.gov.dod.standard.ssrf._3_0.forceelement;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;

/**
 * Java class for AtWaypoint complex type.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtWaypoint", propOrder = {
  "waypointIdx",
  "dateTime",
  "speed"
})
public class AtWaypoint {
  /**
   *
   */
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
   * @return
   */
  public TInteger getWaypointIdx() {
    return waypointIdx;
  }

  /**
   * Sets the value of the waypointIdx property.
   * <p>
   * @param value
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
   * @return
   */
  public TCalendar getDateTime() {
    return dateTime;
  }

  /**
   * Sets the value of the dateTime property.
   * <p>
   * @param value
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
   * <p>
   * <p>
   */
  public TDecimal getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the speed property.
   * <p>
   * @param value allowed object is
   * <p>
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
