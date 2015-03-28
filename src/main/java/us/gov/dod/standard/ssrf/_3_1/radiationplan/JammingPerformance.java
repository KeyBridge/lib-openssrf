package us.gov.dod.standard.ssrf._3_1.radiationplan;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
JammingPerformance (US) describes Electronic Attack effectiveness and how severely a target's use of the spectrum is expected to be impacted and/or how well it actually was impacted, for a specific jamming mission.

Element of {@link JammingTarget}

Example: See {@link RadiationPlan}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingPerformance", propOrder = {
    "actualEffect",
    "actualPerformance",
    "continuousUpdate",
    "desiredEffect",
    "desiredPerformance"
})
public class JammingPerformance {

/**
US:ActualEffect - Actual Effect (Optional) 

The actual impact a jamming mission had on a specific target area.

Format is L:UWA
@since 3.1.0
*/
    @XmlElement(name = "ActualEffect", required = false)
    private TString actualEffect;
/**
In Data Item US:ActualPerformance (US), enter the assessed effectiveness of the service request.
@since 3.1.0
*/
    @XmlElement(name = "ActualPerformance", required = false)
    private TString actualPerformance;
/**
US:ContinuousUpdate - Update Continuously (Optional) 

If effectiveness data should be provided continually or just once.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "ContinuousUpdate", required = false)
    private TString continuousUpdate;
/**
US:DesiredEffect - Desired Effect (Optional) 

The expected impact a jamming mission will have on a specific target area.

Format is L:UWA
@since 3.1.0
*/
    @XmlElement(name = "DesiredEffect", required = false)
    private TString desiredEffect;
/**
US:DesiredPerformance - Desired Performance (Optional) 

The desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

Format is L:UWB
@since 3.1.0
*/
    @XmlElement(name = "DesiredPerformance", required = false)
    private TString desiredPerformance;

/**
Get the actual impact a jamming mission had on a specific target area.

@return the ActualEffect value in a {@link TString} data type
@since 3.1.0
*/
public TString getActualEffect() {
        return actualEffect;
    }

/**
Set the actual impact a jamming mission had on a specific target area.

@param value the ActualEffect value in a {@link TString} data type
@since 3.1.0
*/
public void setActualEffect(TString value) {
        this.actualEffect = value;
    }

/**
Determine if the ActualEffect is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetActualEffect() {
return (this.actualEffect!= null ? this.actualEffect.isSetValue() : false);
    }

/**
Get In Data Item US:ActualPerformance (US), enter the assessed effectiveness of the service request.

@return the ActualPerformance value in a {@link TString} data type
@since 3.1.0
*/
public TString getActualPerformance() {
        return actualPerformance;
    }

/**
Set In Data Item US:ActualPerformance (US), enter the assessed effectiveness of the service request.

@param value the ActualPerformance value in a {@link TString} data type
@since 3.1.0
*/
public void setActualPerformance(TString value) {
        this.actualPerformance = value;
    }

/**
Determine if the ActualPerformance is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetActualPerformance() {
return (this.actualPerformance!= null ? this.actualPerformance.isSetValue() : false);
    }

/**
Get if effectiveness data should be provided continually or just once.

@return the ContinuousUpdate value in a {@link TString} data type
@since 3.1.0
*/
public TString getContinuousUpdate() {
        return continuousUpdate;
    }

/**
Set if effectiveness data should be provided continually or just once.

@param value the ContinuousUpdate value in a {@link TString} data type
@since 3.1.0
*/
public void setContinuousUpdate(TString value) {
        this.continuousUpdate = value;
    }

/**
Determine if the ContinuousUpdate is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetContinuousUpdate() {
return (this.continuousUpdate!= null ? this.continuousUpdate.isSetValue() : false);
    }

/**
Get the expected impact a jamming mission will have on a specific target area.

@return the DesiredEffect value in a {@link TString} data type
@since 3.1.0
*/
public TString getDesiredEffect() {
        return desiredEffect;
    }

/**
Set the expected impact a jamming mission will have on a specific target area.

@param value the DesiredEffect value in a {@link TString} data type
@since 3.1.0
*/
public void setDesiredEffect(TString value) {
        this.desiredEffect = value;
    }

/**
Determine if the DesiredEffect is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDesiredEffect() {
return (this.desiredEffect!= null ? this.desiredEffect.isSetValue() : false);
    }

/**
Get the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@return the DesiredPerformance value in a {@link TString} data type
@since 3.1.0
*/
public TString getDesiredPerformance() {
        return desiredPerformance;
    }

/**
Set the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@param value the DesiredPerformance value in a {@link TString} data type
@since 3.1.0
*/
public void setDesiredPerformance(TString value) {
        this.desiredPerformance = value;
    }

/**
Determine if the DesiredPerformance is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDesiredPerformance() {
return (this.desiredPerformance!= null ? this.desiredPerformance.isSetValue() : false);
    }

/**
Set the actual impact a jamming mission had on a specific target area.

@param value  An instances of type {@link ListUWA}
@return The current JammingPerformance object instance
@since 3.1.0
*/
    public JammingPerformance withActualEffect(ListUWA value) {
           setActualEffect(new TString(value.value()));
        return this;
    }

/**
Set In Data Item US:ActualPerformance (US), enter the assessed effectiveness of the service request.

@param value  An instances of type {@link ListUWB}
@return The current JammingPerformance object instance
@since 3.1.0
*/
    public JammingPerformance withActualPerformance(ListUWB value) {
           setActualPerformance(new TString(value.value()));
        return this;
    }

/**
Set if effectiveness data should be provided continually or just once.

@param value  An instances of type {@link ListCBO}
@return The current JammingPerformance object instance
@since 3.1.0
*/
    public JammingPerformance withContinuousUpdate(ListCBO value) {
           setContinuousUpdate(new TString(value.value()));
        return this;
    }

/**
Set the expected impact a jamming mission will have on a specific target area.

@param value  An instances of type {@link ListUWA}
@return The current JammingPerformance object instance
@since 3.1.0
*/
    public JammingPerformance withDesiredEffect(ListUWA value) {
           setDesiredEffect(new TString(value.value()));
        return this;
    }

/**
Set the desired effectiveness of the service request. Example: the minimum percentage of known enemy command and control nodes that must be rendered inoperable for successful mission accomplishment.

@param value  An instances of type {@link ListUWB}
@return The current JammingPerformance object instance
@since 3.1.0
*/
    public JammingPerformance withDesiredPerformance(ListUWB value) {
           setDesiredPerformance(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this JammingPerformance instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JammingPerformance {"
 + (actualEffect !=null? " actualEffect [" + actualEffect +"]" : "") 
 + (actualPerformance !=null? " actualPerformance [" + actualPerformance +"]" : "") 
 + (continuousUpdate !=null? " continuousUpdate [" + continuousUpdate +"]" : "") 
 + (desiredEffect !=null? " desiredEffect [" + desiredEffect +"]" : "") 
 + (desiredPerformance !=null? " desiredPerformance [" + desiredPerformance +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JammingPerformance} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
