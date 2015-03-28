package us.gov.dod.standard.ssrf._3_1.ssrequest;

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
DiagramEndpoint defines an instance of an icon on the diagram.

Element of {@link SSRequest}

Sub-Element is {@link EndpointLocation}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramEndpoint", propOrder = {
    "iconType",
    "endpointID",
    "description",
    "name",
    "iconPosLeft",
    "iconPosTop",
    "pointToMultiPoint",
    "endpointLocation"
})
public class DiagramEndpoint {

/**
IconType  - Icon Type (Required) 

The type of icon for the diagram endpoint.

Format is L:CIC
@since 3.1.0
*/
    @XmlElement(name = "IconType", required = false)
    private TString iconType;
/**
EndpointID - Endpoint ID (Required) 

An identifier for each icon on the diagram. Within a diagram, all EndPointIDs must be unique.

Format is S20
@since 3.1.0
*/
    @XmlElement(name = "EndpointID", required = true)
      private  S20 endpointID;
/**
Description - Endpoint Description (Optional) 

A human-readable description of a diagram endpoint.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private S100 description;
    @XmlElement(name = "Name ", required = false)
    private S15 name;
    @XmlElement(name = "IconPosLeft ", required = false)
    private US_Twips iconPosLeft;
    @XmlElement(name = "IconPosTop ", required = false)
    private US_Twips iconPosTop;
/**
PointToMultiPoint  - Point to Multipoint Indicator (Optional) 

"Yes" if the diagram endpoint participates in point-to-multipoint links. enter "No" if it participates in point-to-point links. Note for the USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "PointToMultiPoint", required = false)
    private TString pointToMultiPoint;
/**
EndpointLocation (Optional)

EndpointLocation defines locations where the diagram endpoint is allowed or forbidden from use.
@since 3.1.0
*/
    @XmlElement(name = "EndpointLocation")
      private  Set<EndpointLocation> endpointLocation;

/**
Get the type of icon for the diagram endpoint.

@return the IconType value in a {@link TString} data type
@since 3.1.0
*/
public TString getIconType() {
        return iconType;
    }

/**
Set the type of icon for the diagram endpoint.

@param value the IconType value in a {@link TString} data type
@since 3.1.0
*/
public void setIconType(TString value) {
        this.iconType = value;
    }

/**
Determine if the IconType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIconType() {
return (this.iconType!= null ? this.iconType.isSetValue() : false);
    }

/**
Get an identifier for each icon on the diagram. Within a diagram, all EndPointIDs must be unique.

@return the EndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getEndpointID() {
        return endpointID;
    }

/**
Set an identifier for each icon on the diagram. Within a diagram, all EndPointIDs must be unique.

@param value the EndpointID value in a {@link TS20} data type
@since 3.1.0
*/
public void setEndpointID(S20 value) {
        this.endpointID = value;
    }

/**
Determine if the EndpointID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEndpointID() {
        return (this.endpointID!= null);
    }

/**
Get a human-readable description of a diagram endpoint.

@return the Description value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getDescription() {
        return description;
    }

/**
Set a human-readable description of a diagram endpoint.

@param value the Description value in a {@link TS100} data type
@since 3.1.0
*/
public void setDescription(S100 value) {
        this.description = value;
    }

/**
Determine if the Description is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDescription() {
        return (this.description!= null);
    }

/**
Get a human-readable name of a diagram endpoint, or Station.

@return the Name value in a {@link TS15} data type
@since 3.1.0
*/
public S15 getName() {
        return name;
    }

/**
Set a human-readable name of a diagram endpoint, or Station.

@param value the Name value in a {@link TS15} data type
@since 3.1.0
*/
public void setName(S15 value) {
        this.name = value;
    }

/**
Determine if the Name is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetName() {
        return (this.name != null);
    }

/**
Get the X coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@return the IconPosLeft value in a {@link TUS_Twips} data type
@since 3.1.0
*/
public US_Twips getIconPosLeft() {
        return iconPosLeft;
    }

/**
Set the X coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@param value the IconPosLeft value in a {@link TUS_Twips} data type
@since 3.1.0
*/
public void setIconPosLeft(US_Twips value) {
        this.iconPosLeft = value;
    }

/**
Determine if the IconPosLeft is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIconPosLeft() {
        return (this.iconPosLeft != null);
    }

/**
Get the Y coordinate of the icon in twips." to read, "In Data Item IconPosTop, enter the Y coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@return the IconPosTop value in a {@link TUS_Twips} data type
@since 3.1.0
*/
public US_Twips getIconPosTop() {
        return iconPosTop;
    }

/**
Set the Y coordinate of the icon in twips." to read, "In Data Item IconPosTop, enter the Y coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@param value the IconPosTop value in a {@link TUS_Twips} data type
@since 3.1.0
*/
public void setIconPosTop(US_Twips value) {
        this.iconPosTop = value;
    }

/**
Determine if the IconPosTop is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIconPosTop() {
        return (this.iconPosTop != null);
    }

/**
Get "Yes" if the diagram endpoint participates in point-to-multipoint links. enter "No" if it participates in point-to-point links. Note for the USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz.

@return the PointToMultiPoint value in a {@link TString} data type
@since 3.1.0
*/
public TString getPointToMultiPoint() {
        return pointToMultiPoint;
    }

/**
Set "Yes" if the diagram endpoint participates in point-to-multipoint links. enter "No" if it participates in point-to-point links. Note for the USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz.

@param value the PointToMultiPoint value in a {@link TString} data type
@since 3.1.0
*/
public void setPointToMultiPoint(TString value) {
        this.pointToMultiPoint = value;
    }

/**
Determine if the PointToMultiPoint is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPointToMultiPoint() {
return (this.pointToMultiPoint!= null ? this.pointToMultiPoint.isSetValue() : false);
    }

/**
Get the EndpointLocation

Complex element EndpointLocation defines locations where the diagram endpoint is allowed or forbidden from use.

@return  a {@link EndpointLocation} instance
@since 3.1.0
*/
    public Set<EndpointLocation> getEndpointLocation() {
        if (endpointLocation == null) {
            endpointLocation = new HashSet<EndpointLocation>();
        }
        return this.endpointLocation;
    }

/**
Determine if the EndpointLocation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetEndpointLocation() {
        return ((this.endpointLocation!= null)&&(!this.endpointLocation.isEmpty()));
    }

/**
  Clear the EndpointLocation field. This sets the field to null.
 */
    public void unsetEndpointLocation() {
        this.endpointLocation = null;
    }

/**
Set the type of icon for the diagram endpoint.

@param value  An instances of type {@link ListCIC}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withIconType(ListCIC value) {
           setIconType(new TString(value.value()));
        return this;
    }

/**
Set an identifier for each icon on the diagram. Within a diagram, all EndPointIDs must be unique.

@param value  An instances of type {@link TS20}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withEndpointID(TS20 value) {
        return this;
    }

/**
Set a human-readable description of a diagram endpoint.

@param value  An instances of type {@link String}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withDescription(String value) {
           setDescription(new S100(value));
        return this;
    }

/**
Set a human-readable name of a diagram endpoint, or Station.

@param value  An instances of type {@link String}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withName(String value) {
           setName(new S15(value));
        return this;
    }

/**
Set the X coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@param value  An instances of type {@link Integer}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withIconPosLeft(Integer value) {
           setIconPosLeft(new US_Twips(value));
        return this;
    }

/**
Set the Y coordinate of the icon in twips." to read, "In Data Item IconPosTop, enter the Y coordinate of the icon in twips. Twips are screen-independent units to ensure that the proportion of screen elements is the same on all display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.

@param value  An instances of type {@link Integer}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withIconPosTop(Integer value) {
           setIconPosTop(new US_Twips(value));
        return this;
    }

/**
Set "Yes" if the diagram endpoint participates in point-to-multipoint links. enter "No" if it participates in point-to-point links. Note for the USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz.

@param value  An instances of type {@link ListCBO}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withPointToMultiPoint(ListCBO value) {
           setPointToMultiPoint(new TString(value.value()));
        return this;
    }

/**
Set the EndpointLocation

Complex element EndpointLocation defines locations where the diagram endpoint is allowed or forbidden from use.

@param values  One or more instances of type {@link EndpointLocation...}
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withEndpointLocation(EndpointLocation... values) {
        if (values!= null) {
            for (EndpointLocation value: values) {
                getEndpointLocation().add(value);
            }
        }
        return this;
    }

/**
Set the EndpointLocation

Complex element EndpointLocation defines locations where the diagram endpoint is allowed or forbidden from use.

@param values  A collection of {@link EndpointLocation} instances
@return The current DiagramEndpoint object instance
@since 3.1.0
*/
    public DiagramEndpoint withEndpointLocation(Collection<EndpointLocation> values) {
        if (values!= null) {
            getEndpointLocation().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this DiagramEndpoint instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "DiagramEndpoint {"
 + (description !=null? " description [" + description +"]" : "") 
 + (endpointID !=null? " endpointID [" + endpointID +"]" : "") 
 + (endpointLocation !=null? " endpointLocation [" + endpointLocation +"]" : "") 
 + (iconPosLeft !=null? " iconPosLeft [" + iconPosLeft +"]" : "") 
 + (iconPosTop !=null? " iconPosTop [" + iconPosTop +"]" : "") 
 + (iconType !=null? " iconType [" + iconType +"]" : "") 
 + (name !=null? " name [" + name +"]" : "") 
 + (pointToMultiPoint !=null? " pointToMultiPoint [" + pointToMultiPoint +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link DiagramEndpoint} requires {@link S20 EndpointID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetEndpointID();
}

}
