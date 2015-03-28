package us.gov.dod.standard.ssrf._3_1.fedeployment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
AtWayPoint defines a point in time at which a Force Element is at a given waypoint along a route.

Element of {@link FEDeployment}

Example: <pre>
* &lt;AtWaypoint&gt;
*   &lt;WaypointIdx cls="U"&gt;1&lt;/WaypointIdx&gt;
*   &lt;DateTime cls="U"&gt;2012-01-01T15:00:00Z&lt;/DateTime&gt;
* &lt;/AtWaypoint&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtWaypoint", propOrder = {
    "waypointIdx",
    "dateTime",
    "speed"
})
public class AtWaypoint {

/**
WayPointIdx  - Waypoint Index (Required) 

The sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "WaypointIdx", required = true)
      private  UN6 waypointIdx;
/**
DateTime  - Date/Time (Required) 

The date and time that the force element is at the selected waypoint.

Format is DateTime
@since 3.1.0
*/
    @XmlElement(name = "DateTime", required = true)
      private  DT dateTime;
/**
Speed  - Speed at Waypoint (Optional) 

The speed of the force element along a straight route or to the next waypoint.

Format is UN(7,2) (km/h)
@since 3.1.0
*/
    @XmlElement(name = "Speed", required = false)
    private Speed speed;

/**
Get the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

@return the WaypointIdx value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getWaypointIdx() {
        return waypointIdx;
    }

/**
Set the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

@param value the WaypointIdx value in a {@link TUN6} data type
@since 3.1.0
*/
public void setWaypointIdx(UN6 value) {
        this.waypointIdx = value;
    }

/**
Determine if the WaypointIdx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetWaypointIdx() {
        return (this.waypointIdx!= null);
    }

/**
Get the date and time that the force element is at the selected waypoint.

@return the DateTime value in a {@link TDT} data type
@since 3.1.0
*/
public DT getDateTime() {
        return dateTime;
    }

/**
Set the date and time that the force element is at the selected waypoint.

@param value the DateTime value in a {@link TDT} data type
@since 3.1.0
*/
public void setDateTime(DT value) {
        this.dateTime = value;
    }

/**
Determine if the DateTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateTime() {
        return (this.dateTime!= null);
    }

/**
Get the speed of the force element along a straight route or to the next waypoint.

@return the Speed value in a {@link TSpeed} data type
@since 3.1.0
*/
public Speed getSpeed() {
        return speed;
    }

/**
Set the speed of the force element along a straight route or to the next waypoint.

@param value the Speed value in a {@link TSpeed} data type
@since 3.1.0
*/
public void setSpeed(Speed value) {
        this.speed = value;
    }

/**
Determine if the Speed is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

/**
Set the sequential index of a Point within the referenced Location. Some points of the Location may be omitted, and are not necessarily visited in the order they are defined in the Location. For example a Location might have 10 Points; however, a Force Element may use a route passing successively by points 3, 1, 10, and 7.

@param value  An instances of type {@link TUN6}
@return The current AtWaypoint object instance
@since 3.1.0
*/
    public AtWaypoint withWaypointIdx(TUN6 value) {
        return this;
    }

/**
Set the date and time that the force element is at the selected waypoint.

@param value  An instances of type {@link TDT}
@return The current AtWaypoint object instance
@since 3.1.0
*/
    public AtWaypoint withDateTime(TDT value) {
        return this;
    }

/**
Set the speed of the force element along a straight route or to the next waypoint.

@param value  An instances of type {@link Double}
@return The current AtWaypoint object instance
@since 3.1.0
*/
    public AtWaypoint withSpeed(Double value) {
           setSpeed(new Speed(value));
        return this;
    }

/**
 Get a string representation of this AtWaypoint instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AtWaypoint {"
 + (dateTime !=null? " dateTime [" + dateTime +"]" : "") 
 + (speed !=null? " speed [" + speed +"]" : "") 
 + (waypointIdx !=null? " waypointIdx [" + waypointIdx +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AtWaypoint} requires {@link DT DateTime}, {@link UN6 WaypointIdx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDateTime() &&  isSetWaypointIdx();
}

}
