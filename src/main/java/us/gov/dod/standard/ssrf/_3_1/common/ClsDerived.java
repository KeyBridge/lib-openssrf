package us.gov.dod.standard.ssrf._3_1.common;

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
ClsDerived (US) contains the derived security classification from one or more data information sources.

Element of {@link SecurityClass}

Example: <pre>
* &lt;ClsDerived&gt;
*   &lt;Date&gt;1993-08-15&lt;/Date&gt;
*   &lt;Title&gt;B-1B SCG&lt;/Title&gt;
*   &lt;Org&gt;OC-ALC/LAB&lt;/Org&gt;
* &lt;/ClsDerived&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsDerived", propOrder = {
    "date",
    "title",
    "org"
})
public class ClsDerived {

/**
US:Date  - Derivative Classification Date (Required) 

The date of the source document.

Format is Date
@since 3.1.0
*/
    @XmlElement(name = "Date", required = true)
      private  D date;
/**
US:Title  - Derivative Classification Document Title (Required) 

The title of the source document.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "Title", required = true)
      private  S30 title;
/**
US:Org  - Derivative Classification Publishing Organisa (Required) 

The publishing organization of the source document.

Format is S30
@since 3.1.0
*/
    @XmlElement(name = "Org", required = true)
      private  S30 org;

/**
Get the date of the source document.

@return the Date value in a {@link TD} data type
@since 3.1.0
*/
public D getDate() {
        return date;
    }

/**
Set the date of the source document.

@param value the Date value in a {@link TD} data type
@since 3.1.0
*/
public void setDate(D value) {
        this.date = value;
    }

/**
Determine if the Date is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDate() {
        return (this.date!= null);
    }

/**
Get the title of the source document.

@return the Title value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getTitle() {
        return title;
    }

/**
Set the title of the source document.

@param value the Title value in a {@link TS30} data type
@since 3.1.0
*/
public void setTitle(S30 value) {
        this.title = value;
    }

/**
Determine if the Title is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTitle() {
        return (this.title!= null);
    }

/**
Get the publishing organization of the source document.

@return the Org value in a {@link TS30} data type
@since 3.1.0
*/
public S30 getOrg() {
        return org;
    }

/**
Set the publishing organization of the source document.

@param value the Org value in a {@link TS30} data type
@since 3.1.0
*/
public void setOrg(S30 value) {
        this.org = value;
    }

/**
Determine if the Org is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOrg() {
        return (this.org!= null);
    }

/**
Set the date of the source document.

@param value  An instances of type {@link TD}
@return The current ClsDerived object instance
@since 3.1.0
*/
    public ClsDerived withDate(TD value) {
        return this;
    }

/**
Set the title of the source document.

@param value  An instances of type {@link TS30}
@return The current ClsDerived object instance
@since 3.1.0
*/
    public ClsDerived withTitle(TS30 value) {
        return this;
    }

/**
Set the publishing organization of the source document.

@param value  An instances of type {@link TS30}
@return The current ClsDerived object instance
@since 3.1.0
*/
    public ClsDerived withOrg(TS30 value) {
        return this;
    }

/**
 Get a string representation of this ClsDerived instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ClsDerived {"
 + (date !=null? " date [" + date +"]" : "") 
 + (org !=null? " org [" + org +"]" : "") 
 + (title !=null? " title [" + title +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ClsDerived} requires {@link D Date}, {@link S30 Org}, {@link S30 Title}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetDate() &&  isSetOrg() &&  isSetTitle();
}

}
