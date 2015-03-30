package us.gov.dod.standard.ssrf._3_1.fedeployment;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.FEDeployment;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtWaypoint", propOrder = {
  "waypointIdx",
  "dateTime",
  "speed"
})
public class AtWaypoint {

  /**
   * WayPointIdx - Waypoint Index (Required)    * <p>
   * The sequential index of a Point within the referenced Location. Some points
   * of the Location may be omitted, and are not necessarily visited in the
   * order they are defined in the Location. For example a Location might have
   * 10 Points; however, a Force Element may use a route passing successively by
   * points 3, 1, 10, and 7.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "WaypointIdx", required = true)
  private UN6 waypointIdx;
  /**
   * DateTime - Date/Time (Required)    * <p>
   * The date and time that the force element is at the selected waypoint.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateTime", required = true)
  private DT dateTime;
  /**
   * Speed - Speed at Waypoint (Optional)    * <p>
   * The speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * Format is UN(7,2) (km/h)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Speed", required = false)
  private Speed speed;

  /**
   * Get the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getWaypointIdx() {
    return waypointIdx;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setWaypointIdx(UN6 value) {
    this.waypointIdx = value;
  }

  /**
   * Determine if the WaypointIdx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetWaypointIdx() {
    return (this.waypointIdx != null ? this.waypointIdx.isSetValue() : false);
  }

  /**
   * Get the date and time that the force element is at the selected waypoint..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getDateTime() {
    return dateTime;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setDateTime(DT value) {
    this.dateTime = value;
  }

  /**
   * Determine if the DateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateTime() {
    return (this.dateTime != null ? this.dateTime.isSetValue() : false);
  }

  /**
   * Get the speed of the force element along a straight route or to the next
   * waypoint..
   * <p>
   * @return a {@link Speed} instance
   * @since 3.1.0
   */
  public Speed getSpeed() {
    return speed;
  }

  /**
   * Set the speed of the force element along a straight route or to the next
   * waypoint..
   * <p>
   * @param value a {@link Speed} instance
   * @since 3.1.0
   */
  public void setSpeed(Speed value) {
    this.speed = value;
  }

  /**
   * Determine if the Speed is configured.
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
   * @param value An instances of type {@link Integer}.
   * @return The current AtWaypoint object instance.
   * @since 3.1.0
   */
  public AtWaypoint withWaypointIdx(Integer value) {
    setWaypointIdx(new UN6(value));
    return this;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current AtWaypoint object instance.
   * @since 3.1.0
   */
  public AtWaypoint withDateTime(Calendar value) {
    setDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date and time that the force element is at the selected waypoint.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current AtWaypoint object instance.
   * @since 3.1.0
   */
  public AtWaypoint withDateTime(Date value) {
    setDateTime(new DT(value));
    return this;
  }

  /**
   * Set the speed of the force element along a straight route or to the next
   * waypoint.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AtWaypoint object instance.
   * @since 3.1.0
   */
  public AtWaypoint withSpeed(Double value) {
    setSpeed(new Speed(value));
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
           + (dateTime != null ? " dateTime [" + dateTime + "]" : "")
           + (speed != null ? " speed [" + speed + "]" : "")
           + (waypointIdx != null ? " waypointIdx [" + waypointIdx + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AtWaypoint} requires {@link DT DateTime}, {@link UN6 WaypointIdx}.
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
