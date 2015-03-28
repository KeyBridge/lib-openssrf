package us.gov.dod.standard.ssrf._3_1.common;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
Remarks is a free text field that provides a place to add additional. In certain situations, technical data must be included in free text in order to clearly explain a technical or operational consideration; in these instances, the data must also be entered in the data element(s) specifically established for it.

Element of {@link Common}

Example: <pre>
* &lt;Remarks cls="C" idx="1"&gt;This is a JTIDS Class 2H terminal&lt;/Remarks&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remarks", propOrder = {
    "value"
})
public class Remarks {

    @XmlValue
      private  String value;
/**
cls - Classification (Required) 

The classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

Format is L:CCL
@since 3.1.0
*/
    @XmlAttribute(name = "cls", required = true)
      private  ListCCL cls;
/**
idx - Index (Required) 

A unique index for each Remark used by this Dataset. Once an idx is used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted. 

Format is UN(6)
@since 3.1.0
*/
    @XmlAttribute(name = "idx", required = true)
      private  BigInteger idx;

/**
Get a value that is most probably correct.

@return  a {@link String} instance
@since 3.1.0
*/
public String getValue() {
        return value;
    }

/**
Set a value that is most probably correct.

@param value  a {@link String} instance
@since 3.1.0
*/
public void setValue(String value) {
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
Get the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@return  a {@link ListCCL} instance
@since 3.1.0
*/
public ListCCL getCls() {
        return cls;
    }

/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  a {@link ListCCL} instance
@since 3.1.0
*/
public void setCls(ListCCL value) {
        this.cls = value;
    }

/**
Determine if the Cls is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCls() {
        return (this.cls!= null);
    }

/**
Get a unique index for each Remark used by this Dataset. Once an idx is used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted. 

@return  a {@link BigInteger} instance
@since 3.1.0
*/
public BigInteger getIdx() {
        return idx;
    }

/**
Set a unique index for each Remark used by this Dataset. Once an idx is used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted. 

@param value  a {@link BigInteger} instance
@since 3.1.0
*/
public void setIdx(BigInteger value) {
        this.idx = value;
    }

/**
Determine if the Idx is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIdx() {
        return (this.idx!= null);
    }

/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Remarks object instance
@since 3.1.0
*/
    public Remarks withValue(String value) {
        return this;
    }

/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Remarks object instance
@since 3.1.0
*/
    public Remarks withCls(ListCCL value) {
        return this;
    }

/**
Set a unique index for each Remark used by this Dataset. Once an idx is used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted. 

@param value  An instances of type {@link BigInteger}
@return The current Remarks object instance
@since 3.1.0
*/
    public Remarks withIdx(BigInteger value) {
        return this;
    }

/**
 Get a string representation of this Remarks instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Remarks {"
 + (cls !=null? " cls [" + cls +"]" : "") 
 + (idx !=null? " idx [" + idx +"]" : "") 
 + (value !=null? " value [" + value +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Remarks} requires {@link ListCCL cls}, {@link BigInteger idx}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetCls() &&  isSetIdx();
}

}
