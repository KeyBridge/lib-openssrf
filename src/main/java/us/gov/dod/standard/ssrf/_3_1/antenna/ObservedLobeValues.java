package us.gov.dod.standard.ssrf._3_1.antenna;

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
ObservedLobeValues (US) contains azimuth and elevation angles, as well as power density levels associated with observed Antenna sidelobes or backlobes. Used to its full potential, a precise 3D picture of an Antenna sidelobe can be represented.

Element of {@link ObservedLobeAnalysis}

Example: See {@link ObservedLobeAnalysis}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedLobeValues", propOrder = {
    "horzBwMax",
    "horzBwMin",
    "lobeValueAngleAccuracy",
    "lobeValueAngleHorz",
    "lobeValueAngleVert",
    "lobeValueID",
    "lobeValueLevel",
    "lobeValueLevelAccuracy",
    "lobeValueName",
    "vertBwMax",
    "vertBwMin"
})
public class ObservedLobeValues {

/**
US:HorzBwMax - Maximum Horizontal Beamwidth (Optional) 

The maximum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

[XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than US:HorBwMin.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "HorzBwMax", required = false)
    private US_Degrees horzBwMax;
/**
US:HorzBwMin - Minimum Horizontal Beamwidth (Optional) 

The minimum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "HorzBwMin", required = false)
    private US_Degrees horzBwMin;
/**
US:LobeValueAngleAccuracy - Lobe Measurement Angle Accuracy (Optional) 

The measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as a (+/-) value.

Format is SN(5,2) 
[0-90] (deg)
@since 3.1.0
*/
    @XmlElement(name = "LobeValueAngleAccuracy", required = false)
    private US_Degrees90 lobeValueAngleAccuracy;
/**
US:LobeValueAngleHorz - Lobe Measurement Horizontal Angle (Optional) 

The azimuth angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

Format is SN(5,2) 
[0-180] (deg)
@since 3.1.0
*/
    @XmlElement(name = "LobeValueAngleHorz", required = false)
    private Az180 lobeValueAngleHorz;
/**
US:LobeValueAngleVert - Lobe Measurement Vertical Angle (Optional) 

The vertical angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

Format is SN(5,2) 
[0-180] (deg)
@since 3.1.0
*/
    @XmlElement(name = "LobeValueAngleVert", required = false)
    private Az180 lobeValueAngleVert;
/**
US:LobeValueID - Lobe Measurement Identifier (Required) 

A unique (within the AntLobe) identifier for the Antenna lobe measurement.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "LobeValueID", required = true)
      private  S10 lobeValueID;
/**
US:LobeValueLevel - Lobe Measurement Power Level (Optional) 

The ratio of the mainbeam power level to the sidelobe power level, expressed as a positive value in dB.

Format is UN(5,2)
[0-150] (dB)
@since 3.1.0
*/
    @XmlElement(name = "LobeValueLevel", required = false)
    private US_dB150 lobeValueLevel;
/**
US:LobeValueLevelAccuracy - Lobe Measurement  Level Accuracy (Optional) 

The measurement accuracy of the LobeValueLevel value in dB. Expressed as a (+/-) value.

Format is SN(4,2) 
[0-75] (dB)
@since 3.1.0
*/
    @XmlElement(name = "LobeValueLevelAccuracy", required = false)
    private US_dB90 lobeValueLevelAccuracy;
/**
US:LobeValueName - Lobe Measurement Name (Optional) 

A name for the Antenna lobe measurement.

Format is S25
@since 3.1.0
*/
    @XmlElement(name = "LobeValueName", required = false)
    private S25 lobeValueName;
/**
US:VertBwMax - Maximum Vertical Beamwidth (Optional) 

The maximum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

[XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than US:VertBwMin.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "VertBwMax", required = false)
    private US_Degrees vertBwMax;
/**
US:VertBwMin - Minimum Vertical Beamwidth (Optional) 

The minimum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "VertBwMin", required = false)
    private US_Degrees vertBwMin;

/**
Get the maximum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

[XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than US:HorBwMin.

@return the HorzBwMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getHorzBwMax() {
        return horzBwMax;
    }

/**
Set the maximum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

[XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than US:HorBwMin.

@param value the HorzBwMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setHorzBwMax(US_Degrees value) {
        this.horzBwMax = value;
    }

/**
Determine if the HorzBwMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzBwMax() {
        return (this.horzBwMax!= null);
    }

/**
Get the minimum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

@return the HorzBwMin value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getHorzBwMin() {
        return horzBwMin;
    }

/**
Set the minimum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

@param value the HorzBwMin value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setHorzBwMin(US_Degrees value) {
        this.horzBwMin = value;
    }

/**
Determine if the HorzBwMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzBwMin() {
        return (this.horzBwMin!= null);
    }

/**
Get the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as a (+/-) value.

@return the LobeValueAngleAccuracy value in a {@link TUS_Degrees90} data type
@since 3.1.0
*/
public US_Degrees90 getLobeValueAngleAccuracy() {
        return lobeValueAngleAccuracy;
    }

/**
Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as a (+/-) value.

@param value the LobeValueAngleAccuracy value in a {@link TUS_Degrees90} data type
@since 3.1.0
*/
public void setLobeValueAngleAccuracy(US_Degrees90 value) {
        this.lobeValueAngleAccuracy = value;
    }

/**
Determine if the LobeValueAngleAccuracy is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueAngleAccuracy() {
        return (this.lobeValueAngleAccuracy!= null);
    }

/**
Get the azimuth angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@return the LobeValueAngleHorz value in a {@link TAz180} data type
@since 3.1.0
*/
public Az180 getLobeValueAngleHorz() {
        return lobeValueAngleHorz;
    }

/**
Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@param value the LobeValueAngleHorz value in a {@link TAz180} data type
@since 3.1.0
*/
public void setLobeValueAngleHorz(Az180 value) {
        this.lobeValueAngleHorz = value;
    }

/**
Determine if the LobeValueAngleHorz is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueAngleHorz() {
        return (this.lobeValueAngleHorz!= null);
    }

/**
Get the vertical angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@return the LobeValueAngleVert value in a {@link TAz180} data type
@since 3.1.0
*/
public Az180 getLobeValueAngleVert() {
        return lobeValueAngleVert;
    }

/**
Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@param value the LobeValueAngleVert value in a {@link TAz180} data type
@since 3.1.0
*/
public void setLobeValueAngleVert(Az180 value) {
        this.lobeValueAngleVert = value;
    }

/**
Determine if the LobeValueAngleVert is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueAngleVert() {
        return (this.lobeValueAngleVert!= null);
    }

/**
Get a unique (within the AntLobe) identifier for the Antenna lobe measurement.

@return the LobeValueID value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getLobeValueID() {
        return lobeValueID;
    }

/**
Set a unique (within the AntLobe) identifier for the Antenna lobe measurement.

@param value the LobeValueID value in a {@link TS10} data type
@since 3.1.0
*/
public void setLobeValueID(S10 value) {
        this.lobeValueID = value;
    }

/**
Determine if the LobeValueID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueID() {
        return (this.lobeValueID!= null);
    }

/**
Get the ratio of the mainbeam power level to the sidelobe power level, expressed as a positive value in dB.

@return the LobeValueLevel value in a {@link TUS_DB150} data type
@since 3.1.0
*/
public US_dB150 getLobeValueLevel() {
        return lobeValueLevel;
    }

/**
Set the ratio of the mainbeam power level to the sidelobe power level, expressed as a positive value in dB.

@param value the LobeValueLevel value in a {@link TUS_DB150} data type
@since 3.1.0
*/
public void setLobeValueLevel(US_dB150 value) {
        this.lobeValueLevel = value;
    }

/**
Determine if the LobeValueLevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueLevel() {
        return (this.lobeValueLevel!= null);
    }

/**
Get the measurement accuracy of the LobeValueLevel value in dB. Expressed as a (+/-) value.

@return the LobeValueLevelAccuracy value in a {@link TUS_DB90} data type
@since 3.1.0
*/
public US_dB90 getLobeValueLevelAccuracy() {
        return lobeValueLevelAccuracy;
    }

/**
Set the measurement accuracy of the LobeValueLevel value in dB. Expressed as a (+/-) value.

@param value the LobeValueLevelAccuracy value in a {@link TUS_DB90} data type
@since 3.1.0
*/
public void setLobeValueLevelAccuracy(US_dB90 value) {
        this.lobeValueLevelAccuracy = value;
    }

/**
Determine if the LobeValueLevelAccuracy is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueLevelAccuracy() {
        return (this.lobeValueLevelAccuracy!= null);
    }

/**
Get a name for the Antenna lobe measurement.

@return the LobeValueName value in a {@link TS25} data type
@since 3.1.0
*/
public S25 getLobeValueName() {
        return lobeValueName;
    }

/**
Set a name for the Antenna lobe measurement.

@param value the LobeValueName value in a {@link TS25} data type
@since 3.1.0
*/
public void setLobeValueName(S25 value) {
        this.lobeValueName = value;
    }

/**
Determine if the LobeValueName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLobeValueName() {
        return (this.lobeValueName!= null);
    }

/**
Get the maximum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

[XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than US:VertBwMin.

@return the VertBwMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getVertBwMax() {
        return vertBwMax;
    }

/**
Set the maximum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

[XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than US:VertBwMin.

@param value the VertBwMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setVertBwMax(US_Degrees value) {
        this.vertBwMax = value;
    }

/**
Determine if the VertBwMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertBwMax() {
        return (this.vertBwMax!= null);
    }

/**
Get the minimum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

@return the VertBwMin value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getVertBwMin() {
        return vertBwMin;
    }

/**
Set the minimum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

@param value the VertBwMin value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setVertBwMin(US_Degrees value) {
        this.vertBwMin = value;
    }

/**
Determine if the VertBwMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertBwMin() {
        return (this.vertBwMin!= null);
    }

/**
Set the maximum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

[XSL ERR MINMAX] If US:HorBwMax is used, it MUST be greater than US:HorBwMin.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withHorzBwMax(Double value) {
           setHorzBwMax(new US_Degrees(value));
        return this;
    }

/**
Set the minimum angle of the horizontal component of the antenna mainbeam measured at the half-power (-3 dB) point of its maximum horizontal width.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withHorzBwMin(Double value) {
           setHorzBwMin(new US_Degrees(value));
        return this;
    }

/**
Set the measurement accuracy of the LobeValueAngle(s) in degrees. Expressed as a (+/-) value.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueAngleAccuracy(Double value) {
           setLobeValueAngleAccuracy(new US_Degrees90(value));
        return this;
    }

/**
Set the azimuth angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueAngleHorz(Double value) {
           setLobeValueAngleHorz(new Az180(value));
        return this;
    }

/**
Set the vertical angle between the sidelobe LobeValueLevel and the mainbeam maximum power level.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueAngleVert(Double value) {
           setLobeValueAngleVert(new Az180(value));
        return this;
    }

/**
Set a unique (within the AntLobe) identifier for the Antenna lobe measurement.

@param value  An instances of type {@link TS10}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueID(TS10 value) {
        return this;
    }

/**
Set the ratio of the mainbeam power level to the sidelobe power level, expressed as a positive value in dB.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueLevel(Double value) {
           setLobeValueLevel(new US_dB150(value));
        return this;
    }

/**
Set the measurement accuracy of the LobeValueLevel value in dB. Expressed as a (+/-) value.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueLevelAccuracy(Double value) {
           setLobeValueLevelAccuracy(new US_dB90(value));
        return this;
    }

/**
Set a name for the Antenna lobe measurement.

@param value  An instances of type {@link String}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withLobeValueName(String value) {
           setLobeValueName(new S25(value));
        return this;
    }

/**
Set the maximum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

[XSL ERR MINMAX] If US:VertBwMax is used, it MUST be greater than US:VertBwMin.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withVertBwMax(Double value) {
           setVertBwMax(new US_Degrees(value));
        return this;
    }

/**
Set the minimum angle of the vertical component of the antenna mainbeam measured at the half-power (-3 dB) points of its maximum vertical width.

@param value  An instances of type {@link Double}
@return The current ObservedLobeValues object instance
@since 3.1.0
*/
    public ObservedLobeValues withVertBwMin(Double value) {
           setVertBwMin(new US_Degrees(value));
        return this;
    }

/**
 Get a string representation of this ObservedLobeValues instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedLobeValues {"
 + (horzBwMax !=null? " horzBwMax [" + horzBwMax +"]" : "") 
 + (horzBwMin !=null? " horzBwMin [" + horzBwMin +"]" : "") 
 + (lobeValueAngleAccuracy !=null? " lobeValueAngleAccuracy [" + lobeValueAngleAccuracy +"]" : "") 
 + (lobeValueAngleHorz !=null? " lobeValueAngleHorz [" + lobeValueAngleHorz +"]" : "") 
 + (lobeValueAngleVert !=null? " lobeValueAngleVert [" + lobeValueAngleVert +"]" : "") 
 + (lobeValueID !=null? " lobeValueID [" + lobeValueID +"]" : "") 
 + (lobeValueLevel !=null? " lobeValueLevel [" + lobeValueLevel +"]" : "") 
 + (lobeValueLevelAccuracy !=null? " lobeValueLevelAccuracy [" + lobeValueLevelAccuracy +"]" : "") 
 + (lobeValueName !=null? " lobeValueName [" + lobeValueName +"]" : "") 
 + (vertBwMax !=null? " vertBwMax [" + vertBwMax +"]" : "") 
 + (vertBwMin !=null? " vertBwMin [" + vertBwMin +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedLobeValues} requires {@link S10 LobeValueID}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLobeValueID();
}

}
