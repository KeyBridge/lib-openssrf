package us.gov.dod.standard.ssrf._3_1.antenna;

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
AntPatternPoint contains a single point of the antenna radiation pattern, defined by a direction and gain.

Element of {@link AntPattern}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPatternPoint", propOrder = {
    "dir",
    "gain"
})
public class AntPatternPoint {

/**
Dir  - Antenna Radiation Pattern Direction (Required) 

The direction in degrees in reference to the pointing angle of the antenna set to zero.

Format is UN(5,2) [0..360] (deg)
@since 3.1.0
*/
    @XmlElement(name = "Dir", required = true)
      private  Az dir;
/**
Gain  - Antenna Radiation Pattern Gain (Required) 

The amount of gain for the direction relative to the main beam gain.

Format is SN(5,2) (dB)
@since 3.1.0
*/
    @XmlElement(name = "Gain", required = true)
      private  Signed_dB_5_2 gain;

/**
Get the direction in degrees in reference to the pointing angle of the antenna set to zero.

@return the Dir value in a {@link TAz} data type
@since 3.1.0
*/
public Az getDir() {
        return dir;
    }

/**
Set the direction in degrees in reference to the pointing angle of the antenna set to zero.

@param value the Dir value in a {@link TAz} data type
@since 3.1.0
*/
public void setDir(Az value) {
        this.dir = value;
    }

/**
Determine if the Dir is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDir() {
        return (this.dir!= null);
    }

/**
Get the amount of gain for the direction relative to the main beam gain.

@return the Gain value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getGain() {
        return gain;
    }

/**
Set the amount of gain for the direction relative to the main beam gain.

@param value the Gain value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setGain(Signed_dB_5_2 value) {
        this.gain = value;
    }

/**
Determine if the Gain is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGain() {
        return (this.gain!= null);
    }

/**
Set the direction in degrees in reference to the pointing angle of the antenna set to zero.

@param value  An instances of type {@link TAz}
@return The current AntPatternPoint object instance
@since 3.1.0
*/
    public AntPatternPoint withDir(TAz value) {
        return this;
    }

/**
Set the amount of gain for the direction relative to the main beam gain.

@param value  An instances of type {@link TSigned_DB_5_2}
@return The current AntPatternPoint object instance
@since 3.1.0
*/
    public AntPatternPoint withGain(TSigned_DB_5_2 value) {
        return this;
    }

/**
 Get a string representation of this AntPatternPoint instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AntPatternPoint {"
 + (dir !=null? " dir [" + dir +"]" : "") 
 + (gain !=null? " gain [" + gain +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AntPatternPoint} requires {@link Az Dir}, {@link Signed_dB_5_2 Gain}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDir() &&  isSetGain();
}

}
