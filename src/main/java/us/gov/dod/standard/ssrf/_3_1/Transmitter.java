package us.gov.dod.standard.ssrf._3_1;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.math.BigInteger;
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
Transmitter is the root element (dataset) containing the transmitter characteristics.

Sub-Elements are {@link Curve}, {@link Deployment}, {@link Nomenclature}, {@link POCInformation}, {@link TxMode}, {@link UsingCountries}

Example: <pre>
* &lt;Transmitter cls="U"&gt;
*   &lt;Serial cls="U"&gt;NLD::TX:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
*   &lt;Nomenclature&gt;
*     &lt;Name cls="U"&gt;AN/PRC-113&lt;/Name&gt;
*   &lt;/Nomenclature&gt;
*   &lt;TxMode&gt;
*     &lt;ModeID cls="U"&gt;HIGH POWER VOICE&lt;/ModeID&gt;
*     &lt;OccBw cls="U"&gt;0.025&lt;/OccBw&gt;
*     &lt;EmsClass cls="U"&gt;F3E&lt;/EmsClass&gt;
*     &lt;Power&gt;
*       &lt;PowerMax cls="U"&gt;10&lt;/PowerMax&gt;
*     &lt;/Power&gt;
*   &lt;/TxMode&gt;
* &lt;/Transmitter&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transmitter", propOrder = {
    "generic",
    "duplexSep",
    "duplexSepType",
    "outputDeviceType",
    "outputDevice",
    "filter",
    "fccAcceptanceNum",
    "tspr",
    "pocInformation",
    "nomenclature",
    "deployment",
    "curve",
    "txMode",
    "usingCountries"
})
public class Transmitter
    extends Common
{

/**
Generic  - Generic indicator (Required) 

"Yes" to indicate that the dataset describes typical parameters of a waveform or standard signal, or a generic antenna model, rather than a specific equipment model.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "Generic", required = true)
      private  TString generic;
/**
DuplexSep  - Duplex Separation (Optional) 

The minimum or exact duplex frequency separation

Format is UN(16,9) [0..1E9] (MHz)

Attribute group Duplex (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DuplexSep")
      private  FreqM duplexSep;
/**
DuplexSepType  - Duplex Separation Type (Optional) 

If the frequency separation must be exactly, or at the minimum, the amount specified.

Format is L:CDS

Attribute group Duplex (Optional)
@since 3.1.0
*/
    @XmlElement(name = "DuplexSepType", required = false)
    private TString duplexSepType;
/**
OutputDeviceType  - Output Device Type (Optional) 

The type of the device. Select an entry from the list.

Format is L:COT

Attribute group Output (Optional)
@since 3.1.0
*/
    @XmlElement(name = "OutputDeviceType", required = false)
    private TString outputDeviceType;
/**
OutputDevice  - Output Device Name (Optional) 

The name of the output device. The specific device designation should be provided, for example, VARIAN VTS5751A1.

Format is S40

Attribute group Output (Optional)
@since 3.1.0
*/
    @XmlElement(name = "OutputDevice", required = false)
    private S40 outputDevice;
/**
Filter - Filter Type Description (Optional) 

A brief description of the type of the output filter.

Format is Memo
@since 3.1.0
*/
    @XmlElement(name = "Filter", required = false)
    private MEMO filter;
/**
US:FCCAcceptanceNum  - FCC Acceptance Number (Optional) 

The Federal Communication Commission (FCC) ID of FCC authorised equipment.

Format is S50
@since 3.1.0
*/
    @XmlElement(name = "FCCAcceptanceNum", required = false)
    private S50 fccAcceptanceNum;
/**
US:TSPR  - TSPR (Optional) 

The telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

Format is S10
@since 3.1.0
*/
    @XmlElement(name = "TSPR", required = false)
    private S10 tspr;
/**
POCInformation (Optional)

POCInformation contains a reference to a Contact, Organisation or Role dataset.
@since 3.1.0
*/
    @XmlElement(name = "POCInformation")
      private  Set<POCInformation> pocInformation;
/**
Nomenclature (Optional)

Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
@since 3.1.0
*/
    @XmlElement(name = "Nomenclature")
      private  Set<Nomenclature> nomenclature;
/**
Deployment (Optional)

Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.
@since 3.1.0
*/
    @XmlElement(name = "Deployment")
      private  Set<Deployment> deployment;
/**
Curve (Optional)

Curve defines the type of curve. It contains an indication as to whether the values were measured or calculated, the numeric factor to be applied to the carrier frequency to find the abscissa of the curve, a frequency to be added to the carrier frequency to obtain the origin of the curve, and the measurement bandwidth.
@since 3.1.0
*/
    @XmlElement(name = "Curve")
      private  Set<Curve> curve;
/**
TxMode (Optional)

TxMode and its sub-elements define all the technical parameters for a mode of operation of the Transmitter.
@since 3.1.0
*/
    @XmlElement(name = "TxMode")
      private  Set<TxMode> txMode;
/**
US:UsingCountries (Optional)

UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Transmitter.
@since 3.1.0
*/
    @XmlElement(name = "UsingCountries")
      private  Set<UsingCountries> usingCountries;

/**
Get "Yes" to indicate that the dataset describes typical parameters of a waveform or standard signal, or a generic antenna model, rather than a specific equipment model.

@return the Generic value in a {@link TString} data type
@since 3.1.0
*/
public TString getGeneric() {
        return generic;
    }

/**
Set "Yes" to indicate that the dataset describes typical parameters of a waveform or standard signal, or a generic antenna model, rather than a specific equipment model.

@param value the Generic value in a {@link TString} data type
@since 3.1.0
*/
public void setGeneric(TString value) {
        this.generic = value;
    }

/**
Determine if the Generic is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetGeneric() {
return (this.generic!= null ? this.generic.isSetValue() : false);
    }

/**
Get the minimum or exact duplex frequency separation

@return the DuplexSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getDuplexSep() {
        return duplexSep;
    }

/**
Set the minimum or exact duplex frequency separation

@param value the DuplexSep value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setDuplexSep(FreqM value) {
        this.duplexSep = value;
    }

/**
Determine if the DuplexSep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDuplexSep() {
        return (this.duplexSep!= null);
    }

/**
Get if the frequency separation must be exactly, or at the minimum, the amount specified.

@return the DuplexSepType value in a {@link TString} data type
@since 3.1.0
*/
public TString getDuplexSepType() {
        return duplexSepType;
    }

/**
Set if the frequency separation must be exactly, or at the minimum, the amount specified.

@param value the DuplexSepType value in a {@link TString} data type
@since 3.1.0
*/
public void setDuplexSepType(TString value) {
        this.duplexSepType = value;
    }

/**
Determine if the DuplexSepType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDuplexSepType() {
return (this.duplexSepType!= null ? this.duplexSepType.isSetValue() : false);
    }

/**
Get the type of the device. Select an entry from the list.

@return the OutputDeviceType value in a {@link TString} data type
@since 3.1.0
*/
public TString getOutputDeviceType() {
        return outputDeviceType;
    }

/**
Set the type of the device. Select an entry from the list.

@param value the OutputDeviceType value in a {@link TString} data type
@since 3.1.0
*/
public void setOutputDeviceType(TString value) {
        this.outputDeviceType = value;
    }

/**
Determine if the OutputDeviceType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOutputDeviceType() {
return (this.outputDeviceType!= null ? this.outputDeviceType.isSetValue() : false);
    }

/**
Get the name of the output device. The specific device designation should be provided, for example, VARIAN VTS5751A1.

@return the OutputDevice value in a {@link TS40} data type
@since 3.1.0
*/
public S40 getOutputDevice() {
        return outputDevice;
    }

/**
Set the name of the output device. The specific device designation should be provided, for example, VARIAN VTS5751A1.

@param value the OutputDevice value in a {@link TS40} data type
@since 3.1.0
*/
public void setOutputDevice(S40 value) {
        this.outputDevice = value;
    }

/**
Determine if the OutputDevice is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetOutputDevice() {
        return (this.outputDevice!= null);
    }

/**
Get a brief description of the type of the output filter.

@return the Filter value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getFilter() {
        return filter;
    }

/**
Set a brief description of the type of the output filter.

@param value the Filter value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setFilter(MEMO value) {
        this.filter = value;
    }

/**
Determine if the Filter is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFilter() {
        return (this.filter!= null);
    }

/**
Get the Federal Communication Commission (FCC) ID of FCC authorised equipment.

@return the FCCAcceptanceNum value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getFCCAcceptanceNum() {
        return fccAcceptanceNum;
    }

/**
Set the Federal Communication Commission (FCC) ID of FCC authorised equipment.

@param value the FCCAcceptanceNum value in a {@link TS50} data type
@since 3.1.0
*/
public void setFCCAcceptanceNum(S50 value) {
        this.fccAcceptanceNum = value;
    }

/**
Determine if the FCCAcceptanceNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFCCAcceptanceNum() {
        return (this.fccAcceptanceNum!= null);
    }

/**
Get the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@return the TSPR value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getTSPR() {
        return tspr;
    }

/**
Set the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@param value the TSPR value in a {@link TS10} data type
@since 3.1.0
*/
public void setTSPR(S10 value) {
        this.tspr = value;
    }

/**
Determine if the TSPR is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTSPR() {
        return (this.tspr!= null);
    }

/**
Get the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@return  a {@link POCInformation} instance
@since 3.1.0
*/
    public Set<POCInformation> getPOCInformation() {
        if (pocInformation == null) {
            pocInformation = new HashSet<POCInformation>();
        }
        return this.pocInformation;
    }

/**
Determine if the POCInformation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPOCInformation() {
        return ((this.pocInformation!= null)&&(!this.pocInformation.isEmpty()));
    }

/**
  Clear the POCInformation field. This sets the field to null.
 */
    public void unsetPOCInformation() {
        this.pocInformation = null;
    }

/**
Get the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@return  a {@link Nomenclature} instance
@since 3.1.0
*/
    public Set<Nomenclature> getNomenclature() {
        if (nomenclature == null) {
            nomenclature = new HashSet<Nomenclature>();
        }
        return this.nomenclature;
    }

/**
Determine if the Nomenclature is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNomenclature() {
        return ((this.nomenclature!= null)&&(!this.nomenclature.isEmpty()));
    }

/**
  Clear the Nomenclature field. This sets the field to null.
 */
    public void unsetNomenclature() {
        this.nomenclature = null;
    }

/**
Get the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@return  a {@link Deployment} instance
@since 3.1.0
*/
    public Set<Deployment> getDeployment() {
        if (deployment == null) {
            deployment = new HashSet<Deployment>();
        }
        return this.deployment;
    }

/**
Determine if the Deployment is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDeployment() {
        return ((this.deployment!= null)&&(!this.deployment.isEmpty()));
    }

/**
  Clear the Deployment field. This sets the field to null.
 */
    public void unsetDeployment() {
        this.deployment = null;
    }

/**
Get the Curve

Complex element Curve defines the type of curve. It contains an indication as to whether the values were measured or calculated, the numeric factor to be applied to the carrier frequency to find the abscissa of the curve, a frequency to be added to the carrier frequency to obtain the origin of the curve, and the measurement bandwidth.

@return  a {@link Curve} instance
@since 3.1.0
*/
    public Set<Curve> getCurve() {
        if (curve == null) {
            curve = new HashSet<Curve>();
        }
        return this.curve;
    }

/**
Determine if the Curve is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetCurve() {
        return ((this.curve!= null)&&(!this.curve.isEmpty()));
    }

/**
  Clear the Curve field. This sets the field to null.
 */
    public void unsetCurve() {
        this.curve = null;
    }

/**
Get the TxMode

Complex element TxMode and its sub-elements define all the technical parameters for a mode of operation of the Transmitter.

@return  a {@link TxMode} instance
@since 3.1.0
*/
    public Set<TxMode> getTxMode() {
        if (txMode == null) {
            txMode = new HashSet<TxMode>();
        }
        return this.txMode;
    }

/**
Determine if the TxMode is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTxMode() {
        return ((this.txMode!= null)&&(!this.txMode.isEmpty()));
    }

/**
  Clear the TxMode field. This sets the field to null.
 */
    public void unsetTxMode() {
        this.txMode = null;
    }

/**
Get the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Transmitter.

@return  a {@link UsingCountries} instance
@since 3.1.0
*/
    public Set<UsingCountries> getUsingCountries() {
        if (usingCountries == null) {
            usingCountries = new HashSet<UsingCountries>();
        }
        return this.usingCountries;
    }

/**
Determine if the UsingCountries is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetUsingCountries() {
        return ((this.usingCountries!= null)&&(!this.usingCountries.isEmpty()));
    }

/**
  Clear the UsingCountries field. This sets the field to null.
 */
    public void unsetUsingCountries() {
        this.usingCountries = null;
    }

/**
Set "Yes" to indicate that the dataset describes typical parameters of a waveform or standard signal, or a generic antenna model, rather than a specific equipment model.

@param value  An instances of type {@link ListCBO}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withGeneric(ListCBO value) {
        setGeneric(new TString(value.value()));
        return this;
    }

/**
Set the minimum or exact duplex frequency separation

@param value  An instances of type {@link TFreqM}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withDuplexSep(TFreqM value) {
        return this;
    }

/**
Set if the frequency separation must be exactly, or at the minimum, the amount specified.

@param value  An instances of type {@link ListCDS}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withDuplexSepType(ListCDS value) {
           setDuplexSepType(new TString(value.value()));
        return this;
    }

/**
Set the type of the device. Select an entry from the list.

@param value  An instances of type {@link ListCOT}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withOutputDeviceType(ListCOT value) {
           setOutputDeviceType(new TString(value.value()));
        return this;
    }

/**
Set the name of the output device. The specific device designation should be provided, for example, VARIAN VTS5751A1.

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withOutputDevice(String value) {
           setOutputDevice(new S40(value));
        return this;
    }

/**
Set a brief description of the type of the output filter.

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withFilter(String value) {
           setFilter(new MEMO(value));
        return this;
    }

/**
Set the Federal Communication Commission (FCC) ID of FCC authorised equipment.

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withFCCAcceptanceNum(String value) {
           setFCCAcceptanceNum(new S50(value));
        return this;
    }

/**
Set the telecommunications service priority applicable to a spectrum-dependent radiocommunications system intended to be used in direct support of a national emergency declared under Section 706 of the Communications Act of 1934, as amended.

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withTSPR(String value) {
           setTSPR(new S10(value));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withPOCInformation(POCInformation... values) {
        if (values!= null) {
            for (POCInformation value: values) {
                getPOCInformation().add(value);
            }
        }
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  A collection of {@link POCInformation} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withNomenclature(Nomenclature... values) {
        if (values!= null) {
            for (Nomenclature value: values) {
                getNomenclature().add(value);
            }
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  A collection of {@link Nomenclature} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

/**
Set the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@param values  One or more instances of type {@link Deployment...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withDeployment(Deployment... values) {
        if (values!= null) {
            for (Deployment value: values) {
                getDeployment().add(value);
            }
        }
        return this;
    }

/**
Set the Deployment

Complex element Deployment provides the general type of equipment deployment. For the detailed data, the appropriate force element and platforms elements should be referenced. Data element Deployment identifies the general category of how the equipment is deployed. For example an equipment may be deployed on an airborne platform, a ship or fixed land installation.

@param values  A collection of {@link Deployment} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withDeployment(Collection<Deployment> values) {
        if (values!= null) {
            getDeployment().addAll(values);
        }
        return this;
    }

/**
Set the Curve

Complex element Curve defines the type of curve. It contains an indication as to whether the values were measured or calculated, the numeric factor to be applied to the carrier frequency to find the abscissa of the curve, a frequency to be added to the carrier frequency to obtain the origin of the curve, and the measurement bandwidth.

@param values  One or more instances of type {@link Curve...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withCurve(Curve... values) {
        if (values!= null) {
            for (Curve value: values) {
                getCurve().add(value);
            }
        }
        return this;
    }

/**
Set the Curve

Complex element Curve defines the type of curve. It contains an indication as to whether the values were measured or calculated, the numeric factor to be applied to the carrier frequency to find the abscissa of the curve, a frequency to be added to the carrier frequency to obtain the origin of the curve, and the measurement bandwidth.

@param values  A collection of {@link Curve} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withCurve(Collection<Curve> values) {
        if (values!= null) {
            getCurve().addAll(values);
        }
        return this;
    }

/**
Set the TxMode

Complex element TxMode and its sub-elements define all the technical parameters for a mode of operation of the Transmitter.

@param values  One or more instances of type {@link TxMode...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withTxMode(TxMode... values) {
        if (values!= null) {
            for (TxMode value: values) {
                getTxMode().add(value);
            }
        }
        return this;
    }

/**
Set the TxMode

Complex element TxMode and its sub-elements define all the technical parameters for a mode of operation of the Transmitter.

@param values  A collection of {@link TxMode} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withTxMode(Collection<TxMode> values) {
        if (values!= null) {
            getTxMode().addAll(values);
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Transmitter.

@param values  One or more instances of type {@link UsingCountries...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withUsingCountries(UsingCountries... values) {
        if (values!= null) {
            for (UsingCountries value: values) {
                getUsingCountries().add(value);
            }
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Transmitter.

@param values  A collection of {@link UsingCountries} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withUsingCountries(Collection<UsingCountries> values) {
        if (values!= null) {
            getUsingCountries().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withCaseNum(CaseNum... values) {
        if (values!= null) {
            for (CaseNum value: values) {
                getCaseNum().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link CaseNum} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withExtReferenceRef(ExtReferenceRef... values) {
        if (values!= null) {
            for (ExtReferenceRef value: values) {
                getExtReferenceRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link ExtReferenceRef} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRemarks(Remarks... values) {
        if (values!= null) {
            for (Remarks value: values) {
                getRemarks().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  A collection of {@link Remarks} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withReleasability(ListCCY... values) {
        if (values!= null) {
            for (ListCCY value: values) {
                getReleasability().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  A collection of {@link Releasability} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRemarkRef(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getRemarkRef().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set 

@param values  A collection of {@link RemarkRef} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withExtReferences(BigInteger... values) {
        if (values!= null) {
            for (BigInteger value: values) {
                getExtReferences().add(value);
            }
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  A collection of {@link ExtReferences} instances
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Transmitter object instance
@since 3.1.0
*/
    public Transmitter withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Transmitter instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Transmitter {"
 + (curve !=null? " curve [" + curve +"]" : "") 
 + (deployment !=null? " deployment [" + deployment +"]" : "") 
 + (duplexSep !=null? " duplexSep [" + duplexSep +"]" : "") 
 + (duplexSepType !=null? " duplexSepType [" + duplexSepType +"]" : "") 
 + (fccAcceptanceNum !=null? " fccAcceptanceNum [" + fccAcceptanceNum +"]" : "") 
 + (filter !=null? " filter [" + filter +"]" : "") 
 + (generic !=null? " generic [" + generic +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (outputDevice !=null? " outputDevice [" + outputDevice +"]" : "") 
 + (outputDeviceType !=null? " outputDeviceType [" + outputDeviceType +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (tspr !=null? " tspr [" + tspr +"]" : "") 
 + (txMode !=null? " txMode [" + txMode +"]" : "") 
 + (usingCountries !=null? " usingCountries [" + usingCountries +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Transmitter} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link TString Generic}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetGeneric();
}

}
