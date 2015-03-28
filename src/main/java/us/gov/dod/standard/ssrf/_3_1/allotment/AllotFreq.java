package us.gov.dod.standard.ssrf._3_1.allotment;

import us.gov.dod.standard.ssrf._3_1.*;
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
AllotFreq defines a frequency or range of frequencies belonging to the Allotment.

Element of {@link Allotment}

Sub-Element is 

Example: See {@link Allotment}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllotFreq", propOrder = {
    "freqMin",
    "freqMax",
    "pairedFreqMin",
    "tuningStep",
    "allotChannel",
    "locationRestriction"
})
public class AllotFreq {

/**
FreqMin - Nominal or Minimum Frequency (Required) 

The nominal frequency or minimum value of the frequency range.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMin", required = true)
      private  FreqM freqMin;
/**
FreqMax - Maximum Frequency (Optional) 

The maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

Format is UN(16,9) [0..1E9] (MHz)

Attribute group FreqRangeGrp (Required)
@since 3.1.0
*/
    @XmlElement(name = "FreqMax", required = false)
    private FreqM freqMax;
/**
PairedFreqMin - Paired Nominal or Minimum Frequency (Optional) 

The nominal frequency or minimum value of the frequency range, for the paired frequency or frequency range when the allotment is for a duplex system.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "PairedFreqMin", required = false)
    private FreqM pairedFreqMin;
/**
TuningStep - Tuning Step (Optional) 

The tuning increment.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "TuningStep", required = false)
    private FreqM tuningStep;
/**
AllotChannel - Frequency Identifier (Optional) 

A TACAN channel or net number

Format is S6
@since 3.1.0
*/
    @XmlElement(name = "AllotChannel", required = false)
    private S6 allotChannel;
/**
LocationRestriction (Optional)

LocationRestriction indicates a Location where the Allotment usage is forbidden.
@since 3.1.0
*/
    @XmlElement(name = "LocationRestriction", nillable = true)
      private  Set<Serial> locationRestriction;

/**
Get the nominal frequency or minimum value of the frequency range.

@return the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMin() {
        return freqMin;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value the FreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMin(FreqM value) {
        this.freqMin = value;
    }

/**
Determine if the FreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMin() {
        return (this.freqMin!= null);
    }

/**
Get the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@return the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getFreqMax() {
        return freqMax;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value the FreqMax value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setFreqMax(FreqM value) {
        this.freqMax = value;
    }

/**
Determine if the FreqMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqMax() {
        return (this.freqMax!= null);
    }

/**
Get the nominal frequency or minimum value of the frequency range, for the paired frequency or frequency range when the allotment is for a duplex system.

@return the PairedFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPairedFreqMin() {
        return pairedFreqMin;
    }

/**
Set the nominal frequency or minimum value of the frequency range, for the paired frequency or frequency range when the allotment is for a duplex system.

@param value the PairedFreqMin value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPairedFreqMin(FreqM value) {
        this.pairedFreqMin = value;
    }

/**
Determine if the PairedFreqMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPairedFreqMin() {
        return (this.pairedFreqMin!= null);
    }

/**
Get the tuning increment.

@return the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getTuningStep() {
        return tuningStep;
    }

/**
Set the tuning increment.

@param value the TuningStep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setTuningStep(FreqM value) {
        this.tuningStep = value;
    }

/**
Determine if the TuningStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTuningStep() {
        return (this.tuningStep!= null);
    }

/**
Get a TACAN channel or net number

@return the AllotChannel value in a {@link TS6} data type
@since 3.1.0
*/
public S6 getAllotChannel() {
        return allotChannel;
    }

/**
Set a TACAN channel or net number

@param value the AllotChannel value in a {@link TS6} data type
@since 3.1.0
*/
public void setAllotChannel(S6 value) {
        this.allotChannel = value;
    }

/**
Determine if the AllotChannel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAllotChannel() {
        return (this.allotChannel!= null);
    }

/**
Get the LocationRestriction

Complex element LocationRestriction indicates a Location where the Allotment usage is forbidden.

@return  a {@link Serial} instance
@since 3.1.0
*/
    public Set<Serial> getLocationRestriction() {
        if (locationRestriction == null) {
            locationRestriction = new HashSet<Serial>();
        }
        return this.locationRestriction;
    }

/**
Determine if the LocationRestriction is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocationRestriction() {
        return ((this.locationRestriction!= null)&&(!this.locationRestriction.isEmpty()));
    }

/**
  Clear the LocationRestriction field. This sets the field to null.
 */
    public void unsetLocationRestriction() {
        this.locationRestriction = null;
    }

/**
Set the nominal frequency or minimum value of the frequency range.

@param value  An instances of type {@link TFreqM}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withFreqMin(TFreqM value) {
        return this;
    }

/**
Set the maximum value of the frequencies in the range.

[XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.

@param value  An instances of type {@link Double}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withFreqMax(Double value) {
           setFreqMax(new FreqM(value));
        return this;
    }

/**
Set the nominal frequency or minimum value of the frequency range, for the paired frequency or frequency range when the allotment is for a duplex system.

@param value  An instances of type {@link Double}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withPairedFreqMin(Double value) {
           setPairedFreqMin(new FreqM(value));
        return this;
    }

/**
Set the tuning increment.

@param value  An instances of type {@link Double}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withTuningStep(Double value) {
           setTuningStep(new FreqM(value));
        return this;
    }

/**
Set a TACAN channel or net number

@param value  An instances of type {@link String}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withAllotChannel(String value) {
           setAllotChannel(new S6(value));
        return this;
    }

/**
Set the LocationRestriction

Complex element LocationRestriction indicates a Location where the Allotment usage is forbidden.

@param values  One or more instances of type {@link LocationRestriction...}
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withLocationRestriction(Serial... values) {
        if (values!= null) {
            for (LocationRestriction value: values) {
                getLocationRestriction().add(value);
            }
        }
        return this;
    }

/**
Set the LocationRestriction

Complex element LocationRestriction indicates a Location where the Allotment usage is forbidden.

@param values  A collection of {@link Serial} instances
@return The current AllotFreq object instance
@since 3.1.0
*/
    public AllotFreq withLocationRestriction(Collection<Serial> values) {
        if (values!= null) {
            getLocationRestriction().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this AllotFreq instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AllotFreq {"
 + (allotChannel !=null? " allotChannel [" + allotChannel +"]" : "") 
 + (freqMax !=null? " freqMax [" + freqMax +"]" : "") 
 + (freqMin !=null? " freqMin [" + freqMin +"]" : "") 
 + (locationRestriction !=null? " locationRestriction [" + locationRestriction +"]" : "") 
 + (pairedFreqMin !=null? " pairedFreqMin [" + pairedFreqMin +"]" : "") 
 + (tuningStep !=null? " tuningStep [" + tuningStep +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AllotFreq} requires {@link FreqM FreqMin}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetFreqMin();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">

@XmlTransient
private Set<Location> locationRestriction;

/**
Get 

@return  a {@link Location} instance
@since 3.1.0
*/
public Set<Location> getLocationRestriction(){
if(locationRestriction == null){
locationRestriction = new HashSet<>();
}
 return locationRestriction;
}
/**
 Determine if the locationRestriction field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocationRestriction() {
return this.locationRestriction !=null  && !this.locationRestriction.isEmpty();
}

/**
Set 

@param values  An instances of type {@link Location}
@return The current AllotFreq object instance
@since 3.1.0
*/
public AllotFreq withLocationRestriction(Location... values) {
return  withLocationRestriction(Arrays.asList(values));
}

/**
Set 

@param values  An instances of type {@link Location}
@return The current AllotFreq object instance
@since 3.1.0
*/
public AllotFreq withLocationRestriction(Collection<Location> values) {
getLocationRestriction().addAll(values);
return this;
}
  /**
   * Update the SSRF data type references in this AllotFreq record.
   * <p>
 @since 3.1.0 */
public void prepare() {
this.locationRestrictionRef= new ArrayList<>();
for (Location instance :  getLocationRestriction()) {
this.locationRestrictionRef.add(instance.getSerial());
}

/**
   * Update the SSRF data type references in this AllotFreq record after loading from XML.

   * This method builds the transient {@link #locationRestriction} with values
   * from the imported {@link #locationRestrictionRef} field. This method should
   * typically be called after the AllotFreq is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locationRestrictionRef==null || locationRestrictionRef.isEmpty() ) {return;}
for(Location instance : root.getLocation()) {
if(locationRestrictionRef.contains(instance.getSerial())){
locationRestriction.add(instance);
}
}}//</editor-fold>

}
