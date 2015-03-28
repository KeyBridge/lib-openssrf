package us.gov.dod.standard.ssrf._3_1.channelplan;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
Channel provides the frequency, and optionally the name or number, of a channel within a channel plan.

Element of {@link ChannelPlan}

Sub-Element is {@link ChannelFreq}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
    "name",
    "user",
    "channelFreq"
})
public class Channel {

/**
Name - Channel Name (Optional) 

The name of this channel (e.g., "Video carrier, Sound carrier, Nicam Sound carrier").

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Name", required = false)
    private S50 name;
/**
User  - Channel User (Optional) 

A specific user of this channel in the channel plan.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "User", required = false)
    private S50 user;
/**
ChannelFreq - Element Content (Required) 

One frequency in the channel plan.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "ChannelFreq", required = true, nillable = true)
      private  Set<ChannelFreq> channelFreq;

/**
Get the name of this channel (e.g., "Video carrier, Sound carrier, Nicam Sound carrier").

@return the Name value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getName() {
        return name;
    }

/**
Set the name of this channel (e.g., "Video carrier, Sound carrier, Nicam Sound carrier").

@param value the Name value in a {@link TS50} data type
@since 3.1.0
*/
public void setName(S50 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name!= null);
    }

/**
Get a specific user of this channel in the channel plan.

@return the User value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getUser() {
        return user;
    }

/**
Set a specific user of this channel in the channel plan.

@param value the User value in a {@link TS50} data type
@since 3.1.0
*/
public void setUser(S50 value) {
        this.user = value;
    }

/**
Determine if the User is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUser() {
        return (this.user!= null);
    }

/**
Get one frequency in the channel plan.

@return  a {@link ChannelFreq} instance
@since 3.1.0
*/
    public Set<ChannelFreq> getChannelFreq() {
        if (channelFreq == null) {
            channelFreq = new HashSet<ChannelFreq>();
        }
        return this.channelFreq;
    }

/**
Determine if the ChannelFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetChannelFreq() {
        return ((this.channelFreq!= null)&&(!this.channelFreq.isEmpty()));
    }

/**
  Clear the ChannelFreq field. This sets the field to null.
 */
    public void unsetChannelFreq() {
        this.channelFreq = null;
    }

/**
Set the name of this channel (e.g., "Video carrier, Sound carrier, Nicam Sound carrier").

@param value  An instances of type {@link String}
@return The current Channel object instance
@since 3.1.0
*/
    public Channel withName(String value) {
           setName(new S50(value));
        return this;
    }

/**
Set a specific user of this channel in the channel plan.

@param value  An instances of type {@link String}
@return The current Channel object instance
@since 3.1.0
*/
    public Channel withUser(String value) {
           setUser(new S50(value));
        return this;
    }

/**
Set one frequency in the channel plan.

@param values  One or more instances of type {@link ChannelFreq...}
@return The current Channel object instance
@since 3.1.0
*/
    public Channel withChannelFreq(ChannelFreq... values) {
        if (values!= null) {
            for (ChannelFreq value: values) {
                getChannelFreq().add(value);
            }
        }
        return this;
    }

/**
Set one frequency in the channel plan.

@param values  A collection of {@link ChannelFreq} instances
@return The current Channel object instance
@since 3.1.0
*/
    public Channel withChannelFreq(Collection<ChannelFreq> values) {
        if (values!= null) {
            getChannelFreq().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Channel instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Channel {"
 + (channelFreq !=null? " channelFreq [" + channelFreq +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (user !=null? " user [" + user +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Channel} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
