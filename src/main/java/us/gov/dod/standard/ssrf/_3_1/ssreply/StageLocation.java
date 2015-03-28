package us.gov.dod.standard.ssrf._3_1.ssreply;

import us.gov.dod.standard.ssrf._3_1.*;
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
StageLocation defines locations where the equipment or system is allowed or forbidden from use.

Element of {@link SSReply}, {@link Stage}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StageLocation", propOrder = {
    "locSatRef",
    "excluded"
})
public class StageLocation {

/**
LocSatRef - Location or Satellite Reference (Required) 

The serial of a Location or satellite.

Format is pattern (S29)
@since 3.1.0
*/
    @XmlElement(name = "LocSatRef", required = true)
      private  Serial locSatRef;
/**
Excluded  - Shape is Excluded (Optional) 

"Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Excluded", required = false)
    private TString excluded;

/**
Get the serial of a Location or satellite.

@return the LocSatRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #getLocSat()} instead.
*/
@Deprecated
public Serial getLocSatRef() {
        return locSatRef;
    }

/**
Set the serial of a Location or satellite.

@param value the LocSatRef value in a {@link Serial} data type
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #setLocSat(Common)} instead.
*/
@Deprecated
public void setLocSatRef(Serial value) {
        this.locSatRef = value;
    }

/**
Determine if the LocSatRef is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLocSatRef() {
        return (this.locSatRef!= null);
    }

/**
Get "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

@return the Excluded value in a {@link TString} data type
@since 3.1.0
*/
public TString getExcluded() {
        return excluded;
    }

/**
Set "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

@param value the Excluded value in a {@link TString} data type
@since 3.1.0
*/
public void setExcluded(TString value) {
        this.excluded = value;
    }

/**
Determine if the Excluded is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetExcluded() {
return (this.excluded!= null ? this.excluded.isSetValue() : false);
    }

/**
Set the serial of a Location or satellite.

@param value  An instances of type {@link Serial}
@return The current StageLocation object instance
@since 3.1.0
@deprecated SSRF references are managed automatically. Use {@link #withLocSat(Common)} instead.
*/
@Deprecated
    public StageLocation withLocSatRef(TSerial value) {
        return this;
    }

/**
Set "Yes" to indicate that the shape is to be excluded from the set. If omitted, a "No" SHOULD be assumed by processing applications, meaning that the shape is included by default.

@param value  An instances of type {@link ListCBO}
@return The current StageLocation object instance
@since 3.1.0
*/
    public StageLocation withExcluded(ListCBO value) {
           setExcluded(new TString(value.value()));
        return this;
    }

/**
 Get a string representation of this StageLocation instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "StageLocation {"
 + (excluded !=null? " excluded [" + excluded +"]" : "") 
 + (locSatRef !=null? " locSatRef [" + locSatRef +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link StageLocation} requires {@link Serial LocSatRef}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLocSatRef();
}

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
/**
LocSatRef - Location or Satellite Reference (Required) 

The serial of a Location or satellite.

Format is pattern (S29)
@since 3.1.0
*/
@XmlTransient
private Common<?> locSat;

/**
Get the serial of a Location or satellite.

@return  a {@link Common} instance
@since 3.1.0
*/
public Common<?> getLocSat(){
return locSat;
}
/**
 Determine if the locSat field is configured.
  @return TRUE if the field is set, FALSE if the field is null
 */
public boolean isSetLocSat() {
    return this.locSat != null ;
}

/**
Set the serial of a Location or satellite.

@param value  An instances of type {@link Common<?>}
@return The current StageLocation object instance
@since 3.1.0
*/
public StageLocation withLocSat(Common<?> value) {
this.locSat = value;
return this;
}

  /**
   * Update the SSRF data type references in this StageLocation record.
   * <p>
 */
public void prepare() {
this.locSatRef = locSat !=null? locSat.getSerial() : null;
}

/**
   * Update the SSRF data type references in this StageLocation record after loading from XML.

   * This method builds the transient {@link #locSat} with values
   * from the imported {@link #locSatRef} field. This method should
   * typically be called after the StageLocation is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
if (locSatRef==null || !locSatRef.isSetValue() ) {return;}
for(Location instance : root.getLocation()) {
if(locSatRef.equals(instance.getSerial())){
locSat = instance;
return;}
}for( Satellite instance : root.getSatellite()) {
if(locSatRef.equals(instance.getSerial())){
locSat = instance;
return;}
}}//</editor-fold>

}
