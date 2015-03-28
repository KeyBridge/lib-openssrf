package us.gov.dod.standard.ssrf._3_1.administrative;

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
Code contains the information necessary to create or modify a code entry in the given code list.

Element of {@link CodeList}
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", propOrder = {
    "value",
    "description"
})
public class Code {

/**
Value - Code Value (Required) 

The unique code entry within the code list.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "Value", required = true)
      private  S50 value;
/**
In Data Item Description, the long text name of the code entry or a brief description of the entry to be created or modified.
@since 3.1.0
*/
    @XmlElement(name = "Description", required = false)
    private S255 description;

/**
Get the unique code entry within the code list.

@return the Value value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getValue() {
        return value;
    }

/**
Set the unique code entry within the code list.

@param value the Value value in a {@link TS50} data type
@since 3.1.0
*/
public void setValue(S50 value) {
        this.value = value;
    }

/**
Determine if the Value is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetValue() {
        return (this.value!= null);
    }

/**
Get In Data Item Description, the long text name of the code entry or a brief description of the entry to be created or modified.

@return the Description value in a {@link TS255} data type
@since 3.1.0
*/
public S255 getDescription() {
        return description;
    }

/**
Set In Data Item Description, the long text name of the code entry or a brief description of the entry to be created or modified.

@param value the Description value in a {@link TS255} data type
@since 3.1.0
*/
public void setDescription(S255 value) {
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
Set the unique code entry within the code list.

@param value  An instances of type {@link TS50}
@return The current Code object instance
@since 3.1.0
*/
    public Code withValue(TS50 value) {
        return this;
    }

/**
Set In Data Item Description, the long text name of the code entry or a brief description of the entry to be created or modified.

@param value  An instances of type {@link String}
@return The current Code object instance
@since 3.1.0
*/
    public Code withDescription(String value) {
           setDescription(new S255(value));
        return this;
    }

/**
 Get a string representation of this Code instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Code {"
 + (description !=null? " description [" + description +"]" : "") 
 + (value !=null? " value [" + value +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Code} requires {@link S50 Value}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetValue();
}

}
