package us.gov.dod.standard.ssrf._3_1.radiationplan;

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
JammingAuthority (US) describes the Jamming Control Authority (JCA) authorisation information for the jamming plan and the controls affecting the level of authorisation.

Element of {@link RadiationPlan}

Example: See {@link RadiationPlan}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JammingAuthority", propOrder = {
    "jcaCallSign",
    "jcaFreq",
    "jcaLevel",
    "jcaState"
})
public class JammingAuthority {

/**
In Data Item JCACallSign  (US),  enter the unique net identifier for the JCA. If an active JCEOI is in effect, it SHOULD take precedence.
@since 3.1.0
*/
    @XmlElement(name = "JCACallSign", required = false)
    private S10 jcaCallSign;
/**
In Data Item JCAFreq  (US),  enter the frequency assigned to the JCA. If an active JCEOI is in effect, it SHOULD take precedence.
@since 3.1.0
*/
    @XmlElement(name = "JCAFreq", required = false)
    private FreqM jcaFreq;
/**
In Data Item JCALevel  (US),  enter the required level of authorisation for the jamming plan.
@since 3.1.0
*/
    @XmlElement(name = "JCALevel", required = true)
      private  UN2 jcaLevel;
/**
US:JCAState - Authorisation State (Required) 

An indication of the authorization condition for radiation of a jamming plan.

Format is L:UWC
@since 3.1.0
*/
    @XmlElement(name = "JCAState", required = true)
      private  TString jcaState;

/**
Get In Data Item JCACallSign  (US),  enter the unique net identifier for the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@return the JCACallSign value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getJCACallSign() {
        return jcaCallSign;
    }

/**
Set In Data Item JCACallSign  (US),  enter the unique net identifier for the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@param value the JCACallSign value in a {@link TS10} data type
@since 3.1.0
*/
public void setJCACallSign(S10 value) {
        this.jcaCallSign = value;
    }

/**
Determine if the JCACallSign is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJCACallSign() {
        return (this.jcaCallSign!= null);
    }

/**
Get In Data Item JCAFreq  (US),  enter the frequency assigned to the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@return the JCAFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getJCAFreq() {
        return jcaFreq;
    }

/**
Set In Data Item JCAFreq  (US),  enter the frequency assigned to the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@param value the JCAFreq value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setJCAFreq(FreqM value) {
        this.jcaFreq = value;
    }

/**
Determine if the JCAFreq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJCAFreq() {
        return (this.jcaFreq!= null);
    }

/**
Get In Data Item JCALevel  (US),  enter the required level of authorisation for the jamming plan.

@return the JCALevel value in a {@link TUN2} data type
@since 3.1.0
*/
public UN2 getJCALevel() {
        return jcaLevel;
    }

/**
Set In Data Item JCALevel  (US),  enter the required level of authorisation for the jamming plan.

@param value the JCALevel value in a {@link TUN2} data type
@since 3.1.0
*/
public void setJCALevel(UN2 value) {
        this.jcaLevel = value;
    }

/**
Determine if the JCALevel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJCALevel() {
        return (this.jcaLevel!= null);
    }

/**
Get an indication of the authorization condition for radiation of a jamming plan.

@return the JCAState value in a {@link TString} data type
@since 3.1.0
*/
public TString getJCAState() {
        return jcaState;
    }

/**
Set an indication of the authorization condition for radiation of a jamming plan.

@param value the JCAState value in a {@link TString} data type
@since 3.1.0
*/
public void setJCAState(TString value) {
        this.jcaState = value;
    }

/**
Determine if the JCAState is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetJCAState() {
return (this.jcaState!= null ? this.jcaState.isSetValue() : false);
    }

/**
Set In Data Item JCACallSign  (US),  enter the unique net identifier for the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@param value  An instances of type {@link String}
@return The current JammingAuthority object instance
@since 3.1.0
*/
    public JammingAuthority withJCACallSign(String value) {
           setJCACallSign(new S10(value));
        return this;
    }

/**
Set In Data Item JCAFreq  (US),  enter the frequency assigned to the JCA. If an active JCEOI is in effect, it SHOULD take precedence.

@param value  An instances of type {@link Double}
@return The current JammingAuthority object instance
@since 3.1.0
*/
    public JammingAuthority withJCAFreq(Double value) {
           setJCAFreq(new FreqM(value));
        return this;
    }

/**
Set In Data Item JCALevel  (US),  enter the required level of authorisation for the jamming plan.

@param value  An instances of type {@link TUN2}
@return The current JammingAuthority object instance
@since 3.1.0
*/
    public JammingAuthority withJCALevel(TUN2 value) {
        return this;
    }

/**
Set an indication of the authorization condition for radiation of a jamming plan.

@param value  An instances of type {@link ListUWC}
@return The current JammingAuthority object instance
@since 3.1.0
*/
    public JammingAuthority withJCAState(ListUWC value) {
        setJCAState(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this JammingAuthority instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "JammingAuthority {"
 + (jcaCallSign !=null? " jcaCallSign [" + jcaCallSign +"]" : "") 
 + (jcaFreq !=null? " jcaFreq [" + jcaFreq +"]" : "") 
 + (jcaLevel !=null? " jcaLevel [" + jcaLevel +"]" : "") 
 + (jcaState !=null? " jcaState [" + jcaState +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link JammingAuthority} requires {@link UN2 JCALevel}, {@link TString JCAState}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetJCALevel() &&  isSetJCAState();
}

}
