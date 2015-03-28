package us.gov.dod.standard.ssrf._3_1.forceelement;

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
StockNum (US) provides the equipment stock number and indicates the type of stock number.

Element of {@link ForceElement}, {@link RFSystem}

Example: <pre>
* &lt;StockNum&gt;
*   &lt;Number&gt;0967-01-234-6799&lt;/Number&gt;
*   &lt;Type&gt;N&lt;/Type&gt;
* &lt;/StockNum&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockNum", propOrder = {
    "stockNum",
    "type"
})
public class StockNum {

/**
US:StockNum  - Stock Number (Required) 

The stock number of the system/equipment.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "StockNum", required = true)
      private  S50 stockNum;
/**
US:Type  - Stock Number Type (Optional) 

The type of stock number.

Format is L:UNS
@since 3.1.0
*/
    @XmlElement(name = "Type", required = false)
    private S25 type;

/**
Get the stock number of the system/equipment.

@return the StockNum value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getStockNum() {
        return stockNum;
    }

/**
Set the stock number of the system/equipment.

@param value the StockNum value in a {@link TS50} data type
@since 3.1.0
*/
public void setStockNum(S50 value) {
        this.stockNum = value;
    }

/**
Determine if the StockNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStockNum() {
        return (this.stockNum!= null);
    }

/**
Get the type of stock number.

@return the Type value in a {@link TS25} data type
@since 3.1.0
*/
public S25 getType() {
        return type;
    }

/**
Set the type of stock number.

@param value the Type value in a {@link TS25} data type
@since 3.1.0
*/
public void setType(S25 value) {
        this.type = value;
    }

/**
Determine if the Type is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetType() {
        return (this.type!= null);
    }

/**
Set the stock number of the system/equipment.

@param value  An instances of type {@link TS50}
@return The current StockNum object instance
@since 3.1.0
*/
    public StockNum withStockNum(TS50 value) {
        return this;
    }

/**
Set the type of stock number.

@param value  An instances of type {@link String}
@return The current StockNum object instance
@since 3.1.0
*/
    public StockNum withType(String value) {
           setType(new S25(value));
        return this;
    }

/**
 Get a string representation of this StockNum instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "StockNum {"
 + (stockNum !=null? " stockNum [" + stockNum +"]" : "") 
 + (type !=null? " type [" + type +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link StockNum} requires {@link S50 StockNum}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetStockNum();
}

}
