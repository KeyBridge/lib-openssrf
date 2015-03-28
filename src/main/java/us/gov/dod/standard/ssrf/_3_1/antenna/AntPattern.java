package us.gov.dod.standard.ssrf._3_1.antenna;

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
AntPattern contains an antenna pattern diagram on a specific plane. General pattern cuts can be defined by a spherical coordinate system with the electrical boresite of the antenna oriented in the direction of the Z-axis. At different values of phi, pattern cuts can be taken with theta as the dependent variable. These will be great circle cuts through the main-beam peak.

Element of {@link AntMode}

Sub-Element is {@link AntPatternPoint}

Example: <pre>
* &lt;AntPattern&gt;
*   &lt;Type cls="U"&gt;Azimuth&lt;/Type&gt;
*   &lt;Calculated cls="U"&gt;Yes&lt;/Calculated&gt;
*   &lt;AntPatternPoint&gt;
*     &lt;Dir cls="U"&gt;180&lt;/Dir&gt;
*     &lt;Gain cls="U"&gt;40.1&lt;/Gain&gt;
*   &lt;/AntPatternPoint&gt;
*   &lt;AntPatternPoint/&gt;
*   &lt;/AntPattern&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPattern", propOrder = {
    "type",
    "calculated",
    "cutType",
    "cutAngle",
    "antPatternPoint"
})
public class AntPattern {

/**
CutType  - Pattern Cut Type (Optional) 

The type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

Format is L:CTP
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private TString type;
/**
Calculated  - Calculated Data Indicator (Optional) 

Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Calculated", required = false)
    private TString calculated;
/**
CutType  - Pattern Cut Type (Optional) 

The type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

Format is L:CTP
@since 3.1.0
*/
    @XmlElement(name = "CutType", required = false)
    private TString cutType;
/**
CutAngle  - Pattern Cut Angle (Optional) 

The angle of the pattern cut. It is the value of Phi for a Theta cut and the value of Theta for a Phi cut.

Format is UN(5,2) [0..180] (deg)
@since 3.1.0
*/
    @XmlElement(name = "CutAngle", required = false)
    private Az180 cutAngle;
/**
AntPatternPoint (Required)

AntPatternPoint contains a single point of the antenna radiation pattern, defined by a direction and gain.
@since 3.1.0
*/
    @XmlElement(name = "AntPatternPoint", required = true)
      private  Set<AntPatternPoint> antPatternPoint;

/**
Get the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

@return the Type value in a {@link TString} data type
@since 3.1.0
*/
public TString getType() {
        return type;
    }

/**
Set the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

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
Get Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@return the Calculated value in a {@link TString} data type
@since 3.1.0
*/
public TString getCalculated() {
        return calculated;
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@param value the Calculated value in a {@link TString} data type
@since 3.1.0
*/
public void setCalculated(TString value) {
        this.calculated = value;
    }

/**
Determine if the Calculated is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCalculated() {
return (this.calculated!= null ? this.calculated.isSetValue() : false);
    }

/**
Get the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

@return the CutType value in a {@link TString} data type
@since 3.1.0
*/
public TString getCutType() {
        return cutType;
    }

/**
Set the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

@param value the CutType value in a {@link TString} data type
@since 3.1.0
*/
public void setCutType(TString value) {
        this.cutType = value;
    }

/**
Determine if the CutType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCutType() {
return (this.cutType!= null ? this.cutType.isSetValue() : false);
    }

/**
Get the angle of the pattern cut. It is the value of Phi for a Theta cut and the value of Theta for a Phi cut.

@return the CutAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public Az180 getCutAngle() {
        return cutAngle;
    }

/**
Set the angle of the pattern cut. It is the value of Phi for a Theta cut and the value of Theta for a Phi cut.

@param value the CutAngle value in a {@link TAz180} data type
@since 3.1.0
*/
public void setCutAngle(Az180 value) {
        this.cutAngle = value;
    }

/**
Determine if the CutAngle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCutAngle() {
        return (this.cutAngle!= null);
    }

/**
Get the AntPatternPoint

Complex element AntPatternPoint contains a single point of the antenna radiation pattern, defined by a direction and gain.

@return  a {@link AntPatternPoint} instance
@since 3.1.0
*/
    public Set<AntPatternPoint> getAntPatternPoint() {
        if (antPatternPoint == null) {
            antPatternPoint = new HashSet<AntPatternPoint>();
        }
        return this.antPatternPoint;
    }

/**
Determine if the AntPatternPoint is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntPatternPoint() {
        return ((this.antPatternPoint!= null)&&(!this.antPatternPoint.isEmpty()));
    }

/**
  Clear the AntPatternPoint field. This sets the field to null.
 */
    public void unsetAntPatternPoint() {
        this.antPatternPoint = null;
    }

/**
Set the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

@param value  An instances of type {@link ListCAP}
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withType(ListCAP value) {
           setType(new TString(value.value()));
        return this;
    }

/**
Set Yes to indicate that the data was calculated, or "No" if the data is issued from measurement. Leave blank if the origin of the data is not known.

@param value  An instances of type {@link ListCBO}
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withCalculated(ListCBO value) {
           setCalculated(new TString(value.value()));
        return this;
    }

/**
Set the type of the pattern cut. A Theta cut holds Phi constant while varying Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the angle off the boresight and Phi is the rotation angle about the boresight.

@param value  An instances of type {@link ListCTP}
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withCutType(ListCTP value) {
           setCutType(new TString(value.value()));
        return this;
    }

/**
Set the angle of the pattern cut. It is the value of Phi for a Theta cut and the value of Theta for a Phi cut.

@param value  An instances of type {@link Double}
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withCutAngle(Double value) {
           setCutAngle(new Az180(value));
        return this;
    }

/**
Set the AntPatternPoint

Complex element AntPatternPoint contains a single point of the antenna radiation pattern, defined by a direction and gain.

@param values  One or more instances of type {@link AntPatternPoint...}
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withAntPatternPoint(AntPatternPoint... values) {
        if (values!= null) {
            for (AntPatternPoint value: values) {
                getAntPatternPoint().add(value);
            }
        }
        return this;
    }

/**
Set the AntPatternPoint

Complex element AntPatternPoint contains a single point of the antenna radiation pattern, defined by a direction and gain.

@param values  A collection of {@link AntPatternPoint} instances
@return The current AntPattern object instance
@since 3.1.0
*/
    public AntPattern withAntPatternPoint(Collection<AntPatternPoint> values) {
        if (values!= null) {
            getAntPatternPoint().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this AntPattern instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "AntPattern {"
 + (antPatternPoint !=null? " antPatternPoint [" + antPatternPoint +"]" : "") 
 + (calculated !=null? " calculated [" + calculated +"]" : "") 
 + (cutAngle !=null? " cutAngle [" + cutAngle +"]" : "") 
 + (cutType !=null? " cutType [" + cutType +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link AntPattern} requires {@link Set<AntPatternPoint> AntPatternPoint}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetAntPatternPoint();
}

}
