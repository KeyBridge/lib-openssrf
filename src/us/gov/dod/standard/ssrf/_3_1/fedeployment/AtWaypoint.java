/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.fedeployment;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.FEDeployment;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * AtWayPoint defines a point in time at which a Force Element is at a given
 * waypoint along a route.
 * <p>
 * Element of {@link FEDeployment}
 * <p>
 * Example:
 * <pre>
 * &lt;AtWaypoint&gt;
 *   &lt;WaypointIdx cls="U"&gt;1&lt;/WaypointIdx&gt;
 *   &lt;DateTime cls="U"&gt;2012-01-01T15:00:00Z&lt;/DateTime&gt;
 * &lt;/AtWaypoint&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtWaypoint", propOrder = {
  "waypointIdx",
  "dateTime",
  "speed"
})
public class AtWaypoint {

  /**
   * WayPointIdx - Waypoint Index (Required)
   * <p>
   * The sequential index of a Point within the referenced Location. Some points
   * of the Location may be omitted, and are not necessarily visited in the
   * order they are defined in the Location. For example a Location might have
   * 10 Points; however, a Force Element may use a route passing successively by
   * points 3, 1, 10, and 7.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "WaypointIdx", required = true)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger waypointIdx;
  /**
   * DateTime - Date/Time (Required)
   * <p>
   * The date and time that the force element is at the selected waypoint.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "DateTime", required = true)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar dateTime;
  /**
   * Speed - Speed at Waypoint (Optional)
   * <p>
   * The speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * Format is UN(7,2) (km/h)
   */
  @XmlElement(name = "Speed", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterSPEED.class)
  private TDecimal speed;

  /**
   * Get the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @return the WaypointIdx value in a {@link TInteger} data type
   */
  public TInteger getWaypointIdx() {
    return waypointIdx;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value the WaypointIdx value in a {@link TInteger} data type
   */
  public void setWaypointIdx(TInteger value) {
    this.waypointIdx = value;
  }

  /**
   * Determine if the WaypointIdx is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetWaypointIdx() {
    return (this.waypointIdx != null ? this.waypointIdx.isSetValue() : false);
  }

  /**
   * Get the date and time that the force element is at the selected waypoint.
   * <p>
   * @return the DateTime value in a {@link TCalendar} data type
   */
  public TCalendar getDateTime() {
    return dateTime;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint.
   * <p>
   * @param value the DateTime value in a {@link TCalendar} data type
   */
  public void setDateTime(TCalendar value) {
    this.dateTime = value;
  }

  /**
   * Determine if the DateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateTime() {
    return (this.dateTime != null ? this.dateTime.isSetValue() : false);
  }

  /**
   * Get the speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * @return the Speed value in a {@link TDecimal} data type
   */
  public TDecimal getSpeed() {
    return speed;
  }

  /**
   * Set the speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * @param value the Speed value in a {@link TDecimal} data type
   */
  public void setSpeed(TDecimal value) {
    this.speed = value;
  }

  /**
   * Determine if the Speed is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpeed() {
    return (this.speed != null ? this.speed.isSetValue() : false);
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current AtWaypoint object instance
   */
  public AtWaypoint withWaypointIdx(Integer value) {
    setWaypointIdx(new TInteger(value));
    return this;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current AtWaypoint object instance
   */
  public AtWaypoint withDateTime(Calendar value) {
    setDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current AtWaypoint object instance
   */
  public AtWaypoint withDateTime(Date value) {
    setDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AtWaypoint object instance
   */
  public AtWaypoint withSpeed(Double value) {
    setSpeed(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this AtWaypoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AtWaypoint {"
      + (speed != null ? " speed [" + speed + "]" : "")
      + (dateTime != null ? " dateTime [" + dateTime + "]" : "")
      + (waypointIdx != null ? " waypointIdx [" + waypointIdx + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AtWaypoint} requires
   * {@link TCalendar DateTime}, {@link TInteger WaypointIdx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDateTime() && isSetWaypointIdx();
  }

}
