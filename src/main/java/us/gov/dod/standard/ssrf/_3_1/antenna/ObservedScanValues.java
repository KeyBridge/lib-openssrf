package us.gov.dod.standard.ssrf._3_1.antenna;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
ObservedScanValues (US) contains data describing the discrete scan rate values and supporting statistical information.

Element of {@link ObservedScanAnalysis}

Example: See {@link ObservedScanAnalysis}.
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedScanValues", propOrder = {
    "scanValue",
    "statisticalIndicator"
})
public class ObservedScanValues {

/**
US:ScanValue - Observed Scan Values (Optional) 

The observed scan rate values 

Format is UN(6,2) (deg/sec)
@since 3.1.0
*/
    @XmlElement(name = "ScanValue", required = false)
    private US_ScanSpeed scanValue;
/**
In Data Item StatisticalIndicator (US), indicate how this specific data observation was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.
@since 3.1.0
*/
    @XmlElement(name = "StatisticalIndicator", required = false)
    private Percent statisticalIndicator;

/**
Get the observed scan rate values 

@return the ScanValue value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public US_ScanSpeed getScanValue() {
        return scanValue;
    }

/**
Set the observed scan rate values 

@param value the ScanValue value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public void setScanValue(US_ScanSpeed value) {
        this.scanValue = value;
    }

/**
Determine if the ScanValue is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanValue() {
        return (this.scanValue!= null);
    }

/**
Get In Data Item StatisticalIndicator (US), indicate how this specific data observation was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@return the StatisticalIndicator value in a {@link TPercent} data type
@since 3.1.0
*/
public Percent getStatisticalIndicator() {
        return statisticalIndicator;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@param value the StatisticalIndicator value in a {@link TPercent} data type
@since 3.1.0
*/
public void setStatisticalIndicator(Percent value) {
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
Set the observed scan rate values 

@param value  An instances of type {@link Double}
@return The current ObservedScanValues object instance
@since 3.1.0
*/
    public ObservedScanValues withScanValue(Double value) {
           setScanValue(new US_ScanSpeed(value));
        return this;
    }

/**
Set In Data Item StatisticalIndicator (US), indicate how this specific data observation was used (e.g., 95% of the observed values). If this element is empty, then the value is assumed to be part of the 100% sample size.

@param value  An instances of type {@link Double}
@return The current ObservedScanValues object instance
@since 3.1.0
*/
    public ObservedScanValues withStatisticalIndicator(Double value) {
           setStatisticalIndicator(new Percent(value));
        return this;
    }

/**
 Get a string representation of this ObservedScanValues instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedScanValues {"
 + (scanValue !=null? " scanValue [" + scanValue +"]" : "") 
 + (statisticalIndicator !=null? " statisticalIndicator [" + statisticalIndicator +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedScanValues} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
