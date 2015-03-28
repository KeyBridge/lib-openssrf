package us.gov.dod.standard.ssrf._3_1.multiple;

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
ObservedERPValues (US) contains specific data artifacts that describe the Effective Radiated Power (ERP) associated with an emitter or Notation.

Element of {@link ObservedERPAnalysis}

Example: See {@link ObservedERPAnalysis}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedERPValues", propOrder = {
    "erpDwell",
    "erpValue",
    "statisticalIndicator"
})
public class ObservedERPValues {

/**
US:ERPDwell - ERP Dwell (Optional) 

The time duration for a complete dwell/group of pulses which all have the same discrete ERP value, or for a continuous wave at a constant ERP value.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "ERPDwell", required = false)
    private microsecs erpDwell;
/**
US:ERPValue - Observed ERP Value (Required) 

The ERP values that represent 95% of the signal observed ERP values for each discrete ERP value which were obtained from a statistical study of a data set.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPValue", required = true)
      private  dBW erpValue;
/**
In Data Item StatisticalIndicator (US), indicate how this specific data observation  was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.
@since 3.1.0
*/
    @XmlElement(name = "StatisticalIndicator", required = false)
    private US_Percent3 statisticalIndicator;

/**
Get the time duration for a complete dwell/group of pulses which all have the same discrete ERP value, or for a continuous wave at a constant ERP value.

@return the ERPDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getERPDwell() {
        return erpDwell;
    }

/**
Set the time duration for a complete dwell/group of pulses which all have the same discrete ERP value, or for a continuous wave at a constant ERP value.

@param value the ERPDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setERPDwell(microsecs value) {
        this.erpDwell = value;
    }

/**
Determine if the ERPDwell is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPDwell() {
        return (this.erpDwell!= null);
    }

/**
Get the ERP values that represent 95% of the signal observed ERP values for each discrete ERP value which were obtained from a statistical study of a data set.

@return the ERPValue value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPValue() {
        return erpValue;
    }

/**
Set the ERP values that represent 95% of the signal observed ERP values for each discrete ERP value which were obtained from a statistical study of a data set.

@param value the ERPValue value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPValue(dBW value) {
        this.erpValue = value;
    }

/**
Determine if the ERPValue is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPValue() {
        return (this.erpValue!= null);
    }

/**
Get In Data Item StatisticalIndicator (US), indicate how this specific data observation  was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@return the StatisticalIndicator value in a {@link TUS_Percent3} data type
@since 3.1.0
*/
public US_Percent3 getStatisticalIndicator() {
        return statisticalIndicator;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation  was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@param value the StatisticalIndicator value in a {@link TUS_Percent3} data type
@since 3.1.0
*/
public void setStatisticalIndicator(US_Percent3 value) {
        this.statisticalIndicator = value;
    }

/**
Determine if the StatisticalIndicator is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStatisticalIndicator() {
        return (this.statisticalIndicator!= null);
    }

/**
Set the time duration for a complete dwell/group of pulses which all have the same discrete ERP value, or for a continuous wave at a constant ERP value.

@param value  An instances of type {@link Double}
@return The current ObservedERPValues object instance
@since 3.1.0
*/
    public ObservedERPValues withERPDwell(Double value) {
           setERPDwell(new microsecs(value));
        return this;
    }

/**
Set the ERP values that represent 95% of the signal observed ERP values for each discrete ERP value which were obtained from a statistical study of a data set.

@param value  An instances of type {@link TdBW}
@return The current ObservedERPValues object instance
@since 3.1.0
*/
    public ObservedERPValues withERPValue(TdBW value) {
        return this;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation  was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@param value  An instances of type {@link Double}
@return The current ObservedERPValues object instance
@since 3.1.0
*/
    public ObservedERPValues withStatisticalIndicator(Double value) {
           setStatisticalIndicator(new US_Percent3(value));
        return this;
    }

/**
 Get a string representation of this ObservedERPValues instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedERPValues {"
 + (erpDwell !=null? " erpDwell [" + erpDwell +"]" : "") 
 + (erpValue !=null? " erpValue [" + erpValue +"]" : "") 
 + (statisticalIndicator !=null? " statisticalIndicator [" + statisticalIndicator +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedERPValues} requires {@link dBW ERPValue}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetERPValue();
}

}
