package us.gov.dod.standard.ssrf._3_1.multiple;

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
TxAntModeRef contains references to the Antenna and its AntMode, used to construct a Transmitter Configuration.

Element of {@link TxRef}

Example: <pre>
* &lt;TxAntModeRef&gt;
*   &lt;Serial cls="U"&gt;USA:NTIA:AN:123&lt;/Serial&gt;
*   &lt;ModeID cls="U"&gt;TRACKING&lt;/ModeID&gt;
*   &lt;SpectralPowerDensity cls="U"&gt;15&lt;/SpectralPowerDensity&gt;
* &lt;/TxAntModeRef&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxAntModeRef", propOrder = {
    "spectralPowerDensity"
})
public class TxAntModeRef
    extends RxAntModeRef
{

/**
SpectralPowerDensity  - Spectral Power Density (Optional) 

The maximum spectral power density supplied to the input of the antenna.

Format is SN(6,3) (dBW/Hz)
@since 3.1.0
*/
    @XmlElement(name = "SpectralPowerDensity", required = false)
    private dBWHz spectralPowerDensity;

/**
Get the maximum spectral power density supplied to the input of the antenna.

@return the SpectralPowerDensity value in a {@link TdBWHz} data type
@since 3.1.0
*/
public dBWHz getSpectralPowerDensity() {
        return spectralPowerDensity;
    }

/**
Set the maximum spectral power density supplied to the input of the antenna.

@param value the SpectralPowerDensity value in a {@link TdBWHz} data type
@since 3.1.0
*/
public void setSpectralPowerDensity(dBWHz value) {
        this.spectralPowerDensity = value;
    }

/**
Determine if the SpectralPowerDensity is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSpectralPowerDensity() {
        return (this.spectralPowerDensity!= null);
    }

/**
Set the maximum spectral power density supplied to the input of the antenna.

@param value  An instances of type {@link Double}
@return The current TxAntModeRef object instance
@since 3.1.0
*/
    public TxAntModeRef withSpectralPowerDensity(Double value) {
           setSpectralPowerDensity(new dBWHz(value));
        return this;
    }

    @Override
/**
Set the reference to an Antenna in this configuration. This antenna is associated with the receiver specified in the Serial field of the parent RxRef element.

@param value  An instances of type {@link Serial}
@return The current TxAntModeRef object instance
@since 3.1.0
*/
    public TxAntModeRef withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set the unique name of an AntMode of the Antenna specified in the corresponding Serial field. This antenna mode is grouped with the transmitter modes specified in TxModeRef.

@param value  An instances of type {@link String}
@return The current TxAntModeRef object instance
@since 3.1.0
*/
    public TxAntModeRef withModeID(String value) {
           setModeID(new S20(value));
        return this;
    }

    @Override
/**
Set the loss that occurs when energy is transferred between the transmitter/receiver and the antenna.

@param value  An instances of type {@link Double}
@return The current TxAntModeRef object instance
@since 3.1.0
*/
    public TxAntModeRef withCouplingLoss(Double value) {
           setCouplingLoss(new dB(value));
        return this;
    }

/**
 Get a string representation of this TxAntModeRef instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "TxAntModeRef {"
 + (spectralPowerDensity !=null? " spectralPowerDensity [" + spectralPowerDensity +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link TxAntModeRef} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
