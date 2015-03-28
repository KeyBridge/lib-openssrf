package us.gov.dod.standard.ssrf._3_1.assignment;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
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
Assigned contains the assigned frequency(ies), channel or net number; it can also contain the old frequency.

Element of {@link Link}

Sub-Elements are {@link Freq}, {@link FreqOld}

Example: <pre>
* &lt;Assigned&gt;
*   &lt;Freq&gt;
*     &lt;FreqMin cls="U"&gt;265.575&lt;/FreqMin&gt;
*     &lt;TAD cls="U"&gt;HE125&lt;/TAD&gt;
*   &lt;/Freq&gt;
* &lt;/Assigned&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assigned", propOrder = {
    "quality",
    "colourWord",
    "colourNum",
    "ituRegStatus",
    "ituRegDate",
    "ituRegNum",
    "navAidsChannel",
    "netNum",
    "ituRegComments",
    "freq",
    "freqOld"
})
public class Assigned {

/**
Quality  - Quality  (Optional) 

An application-specific measure of the quality for the assigned frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS application, this measure ranges from 0 (best quality) to 3 (high risk of interference), and a value 4 means the assigned has been forced whilst it lays outside of the UHF AMS resource.

Format is UN(1)
@since 3.1.0
*/
    @XmlElement(name = "Quality", required = false)
    private UN1 quality;
/**
ColourWord  - Colour Word (Optional) 

The Colour Word associated to the assigned frequency. A tactical colour word is a series of alpha characters that can be used to identify frequencies and nets. These words are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

Format is S16

Attribute group Colour (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ColourWord", required = false)
    private S20 colourWord;
/**
ColourNum  - Colour Number (Optional) 

A Colour Number associated to the assigned frequency. These numbers are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

Format is UN(2)

Attribute group Colour (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ColourNum", required = false)
    private UN2 colourNum;
/**
ITURegStatus  - ITU Registration Status (Optional) 

The status of the Assignment ITU-R registration.

Format is L:CIR

Attribute group ITURegistration (Optional)

Divergence from SMADEF:  
@since 3.1.0
*/
    @XmlElement(name = "ITURegStatus", required = false)
    private TString ituRegStatus;
/**
ITURegDate  - ITU Registration Date (Optional) 

The date the frequency assignment was registered with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

Format is Date

Attribute group ITURegistration (Optional)

Divergence from SMADEF:  
@since 3.1.0
*/
    @XmlElement(name = "ITURegDate", required = false)
    private D ituRegDate;
/**
ITURegNum  - ITU Registration Number (Optional) 

The registration number assigned by the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

Format is S10

Attribute group ITURegistration (Optional)

Divergence from SMADEF:  
@since 3.1.0
*/
    @XmlElement(name = "ITURegNum", required = false)
    private US10 ituRegNum;
/**
In Data Item NavAidsChannel, for TACAN and DME assignments, enter the channel number of the allocated pair of radio frequencies assigned for use by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC, DME, MLS/DME, etc ... as follows:
001 through 126 "X"
001 through 126 "Y"
018 through 056 "W"
017 through 119 "Z"
Leading zeros are required.
@since 3.1.0
*/
    @XmlElement(name = "NavAidsChannel", required = false)
    private NavAidChnl navAidsChannel;
/**
NetNum  - Net Number (Optional) 

The net number in the format PXXXnn where 'P' is either A for HAVE QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is one of the following four modes: 00 - sub-band hopping mode (only for SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 - SATURN mode, and 75 - SATURN mode

Format is S6
@since 3.1.0
*/
    @XmlElement(name = "NetNum", required = false)
    private NetNumber netNum;
/**
US:ITURegComments  - ITU Regulatory Comments (Optional) 

Amplifying comments related to registering an assignment with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

Format is Memo

Attribute group ITURegistration (Optional)

Divergence from SMADEF:  
@since 3.1.0
*/
    @XmlElement(name = "ITURegComments", required = false)
    private MEMO ituRegComments;
/**
Freq (Optional)

Freq indicates a single assigned frequency or an assigned range of frequencies.
@since 3.1.0
*/
    @XmlElement(name = "Freq")
      private  Set<Freq> freq;
/**
FreqOld (Optional)

FreqOld indicates a previously assigned single frequency or range of frequencies.
@since 3.1.0
*/
    @XmlElement(name = "FreqOld", nillable = true)
      private  Set<FreqOld> freqOld;

/**
Get an application-specific measure of the quality for the assigned frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS application, this measure ranges from 0 (best quality) to 3 (high risk of interference), and a value 4 means the assigned has been forced whilst it lays outside of the UHF AMS resource.

@return the Quality value in a {@link TUN1} data type
@since 3.1.0
*/
public UN1 getQuality() {
        return quality;
    }

/**
Set an application-specific measure of the quality for the assigned frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS application, this measure ranges from 0 (best quality) to 3 (high risk of interference), and a value 4 means the assigned has been forced whilst it lays outside of the UHF AMS resource.

@param value the Quality value in a {@link TUN1} data type
@since 3.1.0
*/
public void setQuality(UN1 value) {
        this.quality = value;
    }

/**
Determine if the Quality is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetQuality() {
        return (this.quality!= null);
    }

/**
Get the Colour Word associated to the assigned frequency. A tactical colour word is a series of alpha characters that can be used to identify frequencies and nets. These words are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@return the ColourWord value in a {@link TS20} data type
@since 3.1.0
*/
public S20 getColourWord() {
        return colourWord;
    }

/**
Set the Colour Word associated to the assigned frequency. A tactical colour word is a series of alpha characters that can be used to identify frequencies and nets. These words are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@param value the ColourWord value in a {@link TS20} data type
@since 3.1.0
*/
public void setColourWord(S20 value) {
        this.colourWord = value;
    }

/**
Determine if the ColourWord is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetColourWord() {
        return (this.colourWord!= null);
    }

/**
Get a Colour Number associated to the assigned frequency. These numbers are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@return the ColourNum value in a {@link TUN2} data type
@since 3.1.0
*/
public UN2 getColourNum() {
        return colourNum;
    }

/**
Set a Colour Number associated to the assigned frequency. These numbers are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@param value the ColourNum value in a {@link TUN2} data type
@since 3.1.0
*/
public void setColourNum(UN2 value) {
        this.colourNum = value;
    }

/**
Determine if the ColourNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetColourNum() {
        return (this.colourNum!= null);
    }

/**
Get the status of the Assignment ITU-R registration.

@return the ITURegStatus value in a {@link TString} data type
@since 3.1.0
*/
public TString getITURegStatus() {
        return ituRegStatus;
    }

/**
Set the status of the Assignment ITU-R registration.

@param value the ITURegStatus value in a {@link TString} data type
@since 3.1.0
*/
public void setITURegStatus(TString value) {
        this.ituRegStatus = value;
    }

/**
Determine if the ITURegStatus is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetITURegStatus() {
return (this.ituRegStatus!= null ? this.ituRegStatus.isSetValue() : false);
    }

/**
Get the date the frequency assignment was registered with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@return the ITURegDate value in a {@link TD} data type
@since 3.1.0
*/
public D getITURegDate() {
        return ituRegDate;
    }

/**
Set the date the frequency assignment was registered with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value the ITURegDate value in a {@link TD} data type
@since 3.1.0
*/
public void setITURegDate(D value) {
        this.ituRegDate = value;
    }

/**
Determine if the ITURegDate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetITURegDate() {
        return (this.ituRegDate!= null);
    }

/**
Get the registration number assigned by the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@return the ITURegNum value in a {@link TUS10} data type
@since 3.1.0
*/
public US10 getITURegNum() {
        return ituRegNum;
    }

/**
Set the registration number assigned by the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value the ITURegNum value in a {@link TUS10} data type
@since 3.1.0
*/
public void setITURegNum(US10 value) {
        this.ituRegNum = value;
    }

/**
Determine if the ITURegNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetITURegNum() {
        return (this.ituRegNum!= null);
    }

/**
Get In Data Item NavAidsChannel, for TACAN and DME assignments, enter the channel number of the allocated pair of radio frequencies assigned for use by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC, DME, MLS/DME, etc ... as follows:
001 through 126 "X"
001 through 126 "Y"
018 through 056 "W"
017 through 119 "Z"
Leading zeros are required.

@return the NavAidsChannel value in a {@link TNavAidChnl} data type
@since 3.1.0
*/
public NavAidChnl getNavAidsChannel() {
        return navAidsChannel;
    }

/**
Set In Data Item NavAidsChannel, for TACAN and DME assignments, enter the channel number of the allocated pair of radio frequencies assigned for use by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC, DME, MLS/DME, etc ... as follows:
001 through 126 "X"
001 through 126 "Y"
018 through 056 "W"
017 through 119 "Z"
Leading zeros are required.

@param value the NavAidsChannel value in a {@link TNavAidChnl} data type
@since 3.1.0
*/
public void setNavAidsChannel(NavAidChnl value) {
        this.navAidsChannel = value;
    }

/**
Determine if the NavAidsChannel is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNavAidsChannel() {
        return (this.navAidsChannel!= null);
    }

/**
Get the net number in the format PXXXnn where 'P' is either A for HAVE QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is one of the following four modes: 00 - sub-band hopping mode (only for SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 - SATURN mode, and 75 - SATURN mode

@return the NetNum value in a {@link TNetNumber} data type
@since 3.1.0
*/
public NetNumber getNetNum() {
        return netNum;
    }

/**
Set the net number in the format PXXXnn where 'P' is either A for HAVE QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is one of the following four modes: 00 - sub-band hopping mode (only for SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 - SATURN mode, and 75 - SATURN mode

@param value the NetNum value in a {@link TNetNumber} data type
@since 3.1.0
*/
public void setNetNum(NetNumber value) {
        this.netNum = value;
    }

/**
Determine if the NetNum is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNetNum() {
        return (this.netNum!= null);
    }

/**
Get amplifying comments related to registering an assignment with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@return the ITURegComments value in a {@link TMEMO} data type
@since 3.1.0
*/
public MEMO getITURegComments() {
        return ituRegComments;
    }

/**
Set amplifying comments related to registering an assignment with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value the ITURegComments value in a {@link TMEMO} data type
@since 3.1.0
*/
public void setITURegComments(MEMO value) {
        this.ituRegComments = value;
    }

/**
Determine if the ITURegComments is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetITURegComments() {
        return (this.ituRegComments!= null);
    }

/**
Get the Freq

Complex element Freq indicates a single assigned frequency or an assigned range of frequencies.

@return  a {@link Freq} instance
@since 3.1.0
*/
    public Set<Freq> getFreq() {
        if (freq == null) {
            freq = new HashSet<Freq>();
        }
        return this.freq;
    }

/**
Determine if the Freq is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreq() {
        return ((this.freq!= null)&&(!this.freq.isEmpty()));
    }

/**
  Clear the Freq field. This sets the field to null.
 */
    public void unsetFreq() {
        this.freq = null;
    }

/**
Get the FreqOld

Complex element FreqOld indicates a previously assigned single frequency or range of frequencies.

@return  a {@link FreqOld} instance
@since 3.1.0
*/
    public Set<FreqOld> getFreqOld() {
        if (freqOld == null) {
            freqOld = new HashSet<FreqOld>();
        }
        return this.freqOld;
    }

/**
Determine if the FreqOld is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFreqOld() {
        return ((this.freqOld!= null)&&(!this.freqOld.isEmpty()));
    }

/**
  Clear the FreqOld field. This sets the field to null.
 */
    public void unsetFreqOld() {
        this.freqOld = null;
    }

/**
Set an application-specific measure of the quality for the assigned frequency. FOR UHF AMS assignments performed at NATO HQ via the NUFAS application, this measure ranges from 0 (best quality) to 3 (high risk of interference), and a value 4 means the assigned has been forced whilst it lays outside of the UHF AMS resource.

@param value  An instances of type {@link Integer}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withQuality(Integer value) {
           setQuality(new UN1(value));
        return this;
    }

/**
Set the Colour Word associated to the assigned frequency. A tactical colour word is a series of alpha characters that can be used to identify frequencies and nets. These words are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@param value  An instances of type {@link String}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withColourWord(String value) {
           setColourWord(new S20(value));
        return this;
    }

/**
Set a Colour Number associated to the assigned frequency. These numbers are usually listed in the Air Tasking Order (ATO) to prevent inadvertent disclosure of classified information.

@param value  An instances of type {@link Integer}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withColourNum(Integer value) {
           setColourNum(new UN2(value));
        return this;
    }

/**
Set the status of the Assignment ITU-R registration.

@param value  An instances of type {@link ListCIR}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withITURegStatus(ListCIR value) {
           setITURegStatus(new TString(value.value()));
        return this;
    }

/**
Set the date the frequency assignment was registered with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value  An instances of type {@link Calendar}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withITURegDate(Calendar value) {
           setITURegDate(new D(value));
        return this;
    }
/**
Set the date the frequency assignment was registered with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value  An instances of type {@link Date}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withITURegDate(Date value) {
           setITURegDate(new D(value));
        return this;
    }

/**
Set the registration number assigned by the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value  An instances of type {@link String}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withITURegNum(String value) {
           setITURegNum(new US10(value));
        return this;
    }

/**
Set In Data Item NavAidsChannel, for TACAN and DME assignments, enter the channel number of the allocated pair of radio frequencies assigned for use by Air / Ground / Air radionavigation facilities such as: TACAN, VORTAC, DME, MLS/DME, etc ... as follows:
001 through 126 "X"
001 through 126 "Y"
018 through 056 "W"
017 through 119 "Z"
Leading zeros are required.

@param value  An instances of type {@link String}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withNavAidsChannel(String value) {
           setNavAidsChannel(new NavAidChnl(value));
        return this;
    }

/**
Set the net number in the format PXXXnn where 'P' is either A for HAVE QUICK II or B for SATURN, XXX is in the range 000 through 999, and nn is one of the following four modes: 00 - sub-band hopping mode (only for SATURN), 25 - full-band hopping mode (HAVE QUICK II and SATURN), 50 - SATURN mode, and 75 - SATURN mode

@param value  An instances of type {@link String}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withNetNum(String value) {
           setNetNum(new NetNumber(value));
        return this;
    }

/**
Set amplifying comments related to registering an assignment with the International Telecommunication Union (ITU) Radiocommunication Bureau (BR).

@param value  An instances of type {@link String}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withITURegComments(String value) {
           setITURegComments(new MEMO(value));
        return this;
    }

/**
Set the Freq

Complex element Freq indicates a single assigned frequency or an assigned range of frequencies.

@param values  One or more instances of type {@link Freq...}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withFreq(Freq... values) {
        if (values!= null) {
            for (Freq value: values) {
                getFreq().add(value);
            }
        }
        return this;
    }

/**
Set the Freq

Complex element Freq indicates a single assigned frequency or an assigned range of frequencies.

@param values  A collection of {@link Freq} instances
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withFreq(Collection<Freq> values) {
        if (values!= null) {
            getFreq().addAll(values);
        }
        return this;
    }

/**
Set the FreqOld

Complex element FreqOld indicates a previously assigned single frequency or range of frequencies.

@param values  One or more instances of type {@link FreqOld...}
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withFreqOld(FreqOld... values) {
        if (values!= null) {
            for (FreqOld value: values) {
                getFreqOld().add(value);
            }
        }
        return this;
    }

/**
Set the FreqOld

Complex element FreqOld indicates a previously assigned single frequency or range of frequencies.

@param values  A collection of {@link FreqOld} instances
@return The current Assigned object instance
@since 3.1.0
*/
    public Assigned withFreqOld(Collection<FreqOld> values) {
        if (values!= null) {
            getFreqOld().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Assigned instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Assigned {"
 + (colourNum !=null? " colourNum [" + colourNum +"]" : "") 
 + (colourWord !=null? " colourWord [" + colourWord +"]" : "") 
 + (freq !=null? " freq [" + freq +"]" : "") 
 + (freqOld !=null? " freqOld [" + freqOld +"]" : "") 
 + (ituRegComments !=null? " ituRegComments [" + ituRegComments +"]" : "") 
 + (ituRegDate !=null? " ituRegDate [" + ituRegDate +"]" : "") 
 + (ituRegNum !=null? " ituRegNum [" + ituRegNum +"]" : "") 
 + (ituRegStatus !=null? " ituRegStatus [" + ituRegStatus +"]" : "") 
 + (navAidsChannel !=null? " navAidsChannel [" + navAidsChannel +"]" : "") 
 + (netNum !=null? " netNum [" + netNum +"]" : "") 
 + (quality !=null? " quality [" + quality +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Assigned} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
