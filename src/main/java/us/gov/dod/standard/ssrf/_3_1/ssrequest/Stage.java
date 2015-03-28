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
Stage contains information about the life-cycle management of the system.

Element of {@link SSRequest}

Sub-Element is {@link StageLocation}

Example: <pre>
* &lt;Stage&gt;
*   &lt;Type cls="U"&gt;Experimental&lt;/Type&gt;
*   &lt;StartDate cls="U"&gt;2004-01-01&lt;/StartDate&gt;
*   &lt;TargetDate cls="U"&gt;2005-01-01&lt;/TargetDate&gt;
*   &lt;DateApprovalRequired cls="U"&gt;2003-01-01&lt;/DateApprovalRequired&gt;
*   &lt;TerminationDate cls="U"&gt;2009-01-01&lt;/TerminationDate&gt;
*   &lt;NumEquip cls="U"&gt;2000&lt;/NumEquip&gt;
* &lt;/Stage&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stage", propOrder = {
    "type",
    "startDate",
    "targetDate",
    "dateApprovalRequired",
    "terminationDate",
    "numEquip",
    "geoDescription",
    "stageLocation"
})
public class Stage {

/**
Type  - Stage (Required) 

The stage.

Format is L:CSG
@since 3.1.0
*/
    @XmlElement(name = "Type", required = true)
      private  TString type;
/**
StartDate  - Start Date (Optional) 

The date upon which work will commence on this stage.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "StartDate", required = false)
    private D startDate;
/**
TargetDate  - Target Date (Optional) 

The date by which a usable version of the system is expected to be available for testing or deployment.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "TargetDate", required = false)
    private D targetDate;
/**
DateApprovalRequired  - Desired Approval Date (Optional) 

The date by which the approval of the application is desired

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "DateApprovalRequired", required = false)
    private D dateApprovalRequired;
/**
TerminationDate  - Termination Date (Optional) 

The date this stage is expected to terminate. For a stage 2 application the date entered is the date when the system is expected to enter stage 3. The date may be an estimate.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "TerminationDate", required = false)
    private D terminationDate;
/**
NumEquip  - Number of Equipment (Optional) 

The total number of units to be built, procured or used during this stage.

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "NumEquip", required = false)
    private UN9 numEquip;
/**
US:GeoDescription  - Geographic Description (Optional) 

A textual description of the geographic locations where this equipment will be used during this stage.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "GeoDescription", required = false)
    private MEMO geoDescription;
/**
StageLocation (Optional)

StageLocation defines locations where the equipment or system is allowed or forbidden from use.
@since 3.1.0
*/
    @XmlElement(name = "StageLocation")
      private  Set<StageLocation> stageLocation;

/**
Get the stage.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the stage.

@param value the Type value in a {@link TString} data type
@since 3.1.0
*/
public void setType(TString value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
return (this.type!= null ? this.type.isSetValue() : false);
    }

/**
Get the date upon which work will commence on this stage.

@return the StartDate value in a {@link TD} data type
@since 3.1.0
*/
public D getStartDate() {
        return startDate;
    }

/**
Set the date upon which work will commence on this stage.

@param value the StartDate value in a {@link TD} data type
@since 3.1.0
*/
public void setStartDate(D value) {
        this.startDate = value;
    }

/**
Determine if the StartDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

/**
Get the date by which a usable version of the system is expected to be available for testing or deployment.

@return the TargetDate value in a {@link TD} data type
@since 3.1.0
*/
public D getTargetDate() {
        return targetDate;
    }

/**
Set the date by which a usable version of the system is expected to be available for testing or deployment.

@param value the TargetDate value in a {@link TD} data type
@since 3.1.0
*/
public void setTargetDate(D value) {
        this.targetDate = value;
    }

/**
Determine if the TargetDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTargetDate() {
        return (this.targetDate!= null);
    }

/**
Get the date by which the approval of the application is desired

@return the DateApprovalRequired value in a {@link TD} data type
@since 3.1.0
*/
public D getDateApprovalRequired() {
        return dateApprovalRequired;
    }

/**
Set the date by which the approval of the application is desired

@param value the DateApprovalRequired value in a {@link TD} data type
@since 3.1.0
*/
public void setDateApprovalRequired(D value) {
        this.dateApprovalRequired = value;
    }

/**
Determine if the DateApprovalRequired is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDateApprovalRequired() {
        return (this.dateApprovalRequired!= null);
    }

/**
Get the date this stage is expected to terminate. For a stage 2 application the date entered is the date when the system is expected to enter stage 3. The date may be an estimate.

@return the TerminationDate value in a {@link TD} data type
@since 3.1.0
*/
public D getTerminationDate() {
        return terminationDate;
    }

/**
Set the date this stage is expected to terminate. For a stage 2 application the date entered is the date when the system is expected to enter stage 3. The date may be an estimate.

@param value the TerminationDate value in a {@link TD} data type
@since 3.1.0
*/
public void setTerminationDate(D value) {
        this.terminationDate = value;
    }

/**
Determine if the TerminationDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTerminationDate() {
        return (this.terminationDate!= null);
    }

/**
Get the total number of units to be built, procured or used during this stage.

@return the NumEquip value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getNumEquip() {
        return numEquip;
    }

/**
Set the total number of units to be built, procured or used during this stage.

@param value the NumEquip value in a {@link TUN9} data type
@since 3.1.0
*/
public void setNumEquip(UN9 value) {
        this.numEquip = value;
    }

/**
Determine if the NumEquip is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumEquip() {
        return (this.numEquip!= null);
    }

/**
Get a textual description of the geographic locations where this equipment will be used during this stage.

@return the GeoDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getGeoDescription() {
        return geoDescription;
    }

/**
Set a textual description of the geographic locations where this equipment will be used during this stage.

@param value the GeoDescription value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setGeoDescription(MEMO value) {
        this.geoDescription = value;
    }

/**
Determine if the GeoDescription is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGeoDescription() {
        return (this.geoDescription!= null);
    }

/**
Get the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@return  a {@link StageLocation} instance
@since 3.1.0
*/
    public Set<StageLocation> getStageLocation() {
        if (stageLocation == null) {
            stageLocation = new HashSet<StageLocation>();
        }
        return this.stageLocation;
    }

/**
Determine if the StageLocation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStageLocation() {
        return ((this.stageLocation!= null)&&(!this.stageLocation.isEmpty()));
    }

/**
  Clear the StageLocation field. This sets the field to null.
 */
    public void unsetStageLocation() {
        this.stageLocation = null;
    }

/**
Set the stage.

@param value  An instances of type {@link ListCSG}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withType(ListCSG value) {
        setType(new TString(value.value()));
        return this;
    }

/**
Set the date upon which work will commence on this stage.

@param value  An instances of type {@link Calendar}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withStartDate(Calendar value) {
           setStartDate(new D(value));
        return this;
    }
/**
Set the date upon which work will commence on this stage.

@param value  An instances of type {@link Date}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withStartDate(Date value) {
           setStartDate(new D(value));
        return this;
    }

/**
Set the date by which a usable version of the system is expected to be available for testing or deployment.

@param value  An instances of type {@link Calendar}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withTargetDate(Calendar value) {
           setTargetDate(new D(value));
        return this;
    }
/**
Set the date by which a usable version of the system is expected to be available for testing or deployment.

@param value  An instances of type {@link Date}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withTargetDate(Date value) {
           setTargetDate(new D(value));
        return this;
    }

/**
Set the date by which the approval of the application is desired

@param value  An instances of type {@link Calendar}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withDateApprovalRequired(Calendar value) {
           setDateApprovalRequired(new D(value));
        return this;
    }
/**
Set the date by which the approval of the application is desired

@param value  An instances of type {@link Date}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withDateApprovalRequired(Date value) {
           setDateApprovalRequired(new D(value));
        return this;
    }

/**
Set the date this stage is expected to terminate. For a stage 2 application the date entered is the date when the system is expected to enter stage 3. The date may be an estimate.

@param value  An instances of type {@link Calendar}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withTerminationDate(Calendar value) {
           setTerminationDate(new D(value));
        return this;
    }
/**
Set the date this stage is expected to terminate. For a stage 2 application the date entered is the date when the system is expected to enter stage 3. The date may be an estimate.

@param value  An instances of type {@link Date}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withTerminationDate(Date value) {
           setTerminationDate(new D(value));
        return this;
    }

/**
Set the total number of units to be built, procured or used during this stage.

@param value  An instances of type {@link Integer}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withNumEquip(Integer value) {
           setNumEquip(new UN9(value));
        return this;
    }

/**
Set a textual description of the geographic locations where this equipment will be used during this stage.

@param value  An instances of type {@link String}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withGeoDescription(String value) {
           setGeoDescription(new MEMO(value));
        return this;
    }

/**
Set the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@param values  One or more instances of type {@link StageLocation...}
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withStageLocation(StageLocation... values) {
        if (values!= null) {
            for (StageLocation value: values) {
                getStageLocation().add(value);
            }
        }
        return this;
    }

/**
Set the StageLocation

Complex element StageLocation defines locations where the equipment or system is allowed or forbidden from use.

@param values  A collection of {@link StageLocation} instances
@return The current Stage object instance
@since 3.1.0
*/
    public Stage withStageLocation(Collection<StageLocation> values) {
        if (values!= null) {
            getStageLocation().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Stage instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Stage {"
 + (dateApprovalRequired !=null? " dateApprovalRequired [" + dateApprovalRequired +"]" : "") 
 + (geoDescription !=null? " geoDescription [" + geoDescription +"]" : "") 
 + (numEquip !=null? " numEquip [" + numEquip +"]" : "") 
 + (stageLocation !=null? " stageLocation [" + stageLocation +"]" : "") 
 + (startDate !=null? " startDate [" + startDate +"]" : "") 
 + (targetDate !=null? " targetDate [" + targetDate +"]" : "") 
 + (terminationDate !=null? " terminationDate [" + terminationDate +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Stage} requires {@link TString Type}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetType();
}

}
