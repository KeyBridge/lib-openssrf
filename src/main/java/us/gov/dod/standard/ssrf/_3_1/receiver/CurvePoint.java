package us.gov.dod.standard.ssrf._3_1.receiver;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
CurvePoint contains the relative frequency to add to the curve origin to obtain the absolute frequency point on the curve, and the value in dB (relative to the carrier for a Tx characteristic, or relative to sensitivity for a Rx characteristic).

Element of {@link Curve}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePoint", propOrder = {
    "offset",
    "level"
})
public class CurvePoint {

/**
Offset  - Point Frequency Offset (Required) 

A frequency difference (refer to data element Curve for use instructions). If the curve being defined is symmetric, then enter only positive offsets. If the curve is not symmetric (such as a SSB or vestigial sideband modulation spectrum) then enter the full curve including negative offsets. When defining the transmitter RF spectrum and the receiver RF and IF selectivity curves, enter as a minimum the points corresponding to the -3, -20, -40 and -60 dB values.

Format is SN(16,9) (MHz)
@since 3.1.0
*/
    @XmlElement(name = "Offset", required = true)
      private  FreqOffset offset;
/**
Level  - Level (Required) 

A dB value (refer to data element Curve for use instructions).

Format is SN(4,1) [-150..150] (dB)
@since 3.1.0
*/
    @XmlElement(name = "Level", required = true)
      private  CurvePointLevel level;

/**
Get a frequency difference (refer to data element Curve for use instructions). If the curve being defined is symmetric, then enter only positive offsets. If the curve is not symmetric (such as a SSB or vestigial sideband modulation spectrum) then enter the full curve including negative offsets. When defining the transmitter RF spectrum and the receiver RF and IF selectivity curves, enter as a minimum the points corresponding to the -3, -20, -40 and -60 dB values.

@return the Offset value in a {@link TFreqOffset} data type
@since 3.1.0
*/
public FreqOffset getOffset() {
        return offset;
    }

/**
Set a frequency difference (refer to data element Curve for use instructions). If the curve being defined is symmetric, then enter only positive offsets. If the curve is not symmetric (such as a SSB or vestigial sideband modulation spectrum) then enter the full curve including negative offsets. When defining the transmitter RF spectrum and the receiver RF and IF selectivity curves, enter as a minimum the points corresponding to the -3, -20, -40 and -60 dB values.

@param value the Offset value in a {@link TFreqOffset} data type
@since 3.1.0
*/
public void setOffset(FreqOffset value) {
        this.offset = value;
    }

/**
Determine if the Offset is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOffset() {
        return (this.offset!= null);
    }

/**
Get a dB value (refer to data element Curve for use instructions).

@return the Level value in a {@link CurvePointLevel} data type
@since 3.1.0
*/
public CurvePointLevel getLevel() {
        return level;
    }

/**
Set a dB value (refer to data element Curve for use instructions).

@param value the Level value in a {@link CurvePointLevel} data type
@since 3.1.0
*/
public void setLevel(CurvePointLevel value) {
        this.level = value;
    }

/**
Determine if the Level is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLevel() {
        return (this.level!= null);
    }

/**
Set a frequency difference (refer to data element Curve for use instructions). If the curve being defined is symmetric, then enter only positive offsets. If the curve is not symmetric (such as a SSB or vestigial sideband modulation spectrum) then enter the full curve including negative offsets. When defining the transmitter RF spectrum and the receiver RF and IF selectivity curves, enter as a minimum the points corresponding to the -3, -20, -40 and -60 dB values.

@param value  An instances of type {@link TFreqOffset}
@return The current CurvePoint object instance
@since 3.1.0
*/
    public CurvePoint withOffset(FreqOffset value) {
        return this;
    }

/**
Set a dB value (refer to data element Curve for use instructions).

@param value  An instances of type {@link CurvePointLevel}
@return The current CurvePoint object instance
@since 3.1.0
*/
    public CurvePoint withLevel(CurvePointLevel value) {
        return this;
    }

/**
 Get a string representation of this CurvePoint instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "CurvePoint {"
 + (level !=null? " level [" + level +"]" : "") 
 + (offset !=null? " offset [" + offset +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link CurvePoint} requires {@link CurvePointLevel Level}, {@link FreqOffset Offset}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLevel() &&  isSetOffset();
}

}
