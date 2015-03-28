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
Antenna is the XML root for all parameters of an Antenna. It also contains various technical parameters of the antenna.

Sub-Elements are {@link AntHardware}, {@link AntMode}, {@link Nomenclature}, {@link POCInformation}, {@link UsingCountries}

Example: <pre>
* &lt;Antenna cls="U"&gt;
*   &lt;Serial cls="U"&gt;TUR::AN:123&lt;/Serial&gt;
*   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
*   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
*   &lt;AntType cls="U"&gt;Billboard&lt;/AntType&gt;
*   &lt;Nomenclature&gt;
*     &lt;Name cls="U"&gt;XYZ&lt;/Name&gt;
*   &lt;/Nomenclature&gt;
*   &lt;AntMode&gt;
*     &lt;All_AntMode_elements/&gt;
*     &lt;/AntMode&gt;
*   &lt;/Antenna&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Antenna", propOrder = {
    "generic",
    "antType",
    "phArrayNumMainBeams",
    "phArrayNumElements",
    "shape",
    "diameter",
    "horzDimension",
    "vertDimension",
    "apertureDiameter",
    "horzAperture",
    "vertAperture",
    "horzSidelobeSuppressed",
    "horzSidelobeAz",
    "horzSidelobeAttenuation",
    "vertSidelobeSuppressed",
    "vertSidelobeElev",
    "vertSidelobeAttenuation",
    "pocInformation",
    "nomenclature",
    "antHardware",
    "antMode",
    "usingCountries"
})
public class Antenna
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
AntType  - Antenna Type (Required) 

The type of antenna.

Format is L:CAT
@since 3.1.0
*/
    @XmlElement(name = "AntType", required = true)
      private  TString antType;
/**
PhArrayNumMainBeams  - Number of Main Beams in the Phased Array (Optional) 

The number of main beams in the phased array antenna.

Format is UN(3)
@since 3.1.0
*/
    @XmlElement(name = "PhArrayNumMainBeams", required = false)
    private UN3 phArrayNumMainBeams;
/**
PhArrayNumElements  - Number of elements in the Phased Array (Optional) 

The number of antenna elements in the phased array antenna.

Format is UN(5)
@since 3.1.0
*/
    @XmlElement(name = "PhArrayNumElements", required = false)
    private UN5 phArrayNumElements;
/**
Shape  - Antenna Shape (Optional) 

A code used to describe the general shape of the antenna reflector.

Format is L:CRS

Attribute group Dimension (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Shape", required = false)
    private TString shape;
/**
ApertureDiameter  - Aperture Diameter (Optional) 

The cross-section of an antenna radiation pattern in the direction of highest gain.

Format is UN(6,2) (m)

Attribute group Aperture (Optional)
@since 3.1.0
*/
    @XmlElement(name = "Diameter", required = false)
    private Dimension diameter;
/**
HorzDimension  - Horizontal Dimension (Optional) 

The linear horizontal dimension of the antenna.

Format is UN(6,2) (m)

Attribute group Dimension (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HorzDimension", required = false)
    private Dimension horzDimension;
/**
VertDimension  - Vertical Dimension (Optional) 

The linear vertical dimension of the antenna.

Format is UN(6,2) (m)

Attribute group Dimension (Optional)
@since 3.1.0
*/
    @XmlElement(name = "VertDimension", required = false)
    private Dimension vertDimension;
/**
ApertureDiameter  - Aperture Diameter (Optional) 

The cross-section of an antenna radiation pattern in the direction of highest gain.

Format is UN(6,2) (m)

Attribute group Aperture (Optional)
@since 3.1.0
*/
    @XmlElement(name = "ApertureDiameter", required = false)
    private Dimension apertureDiameter;
/**
HorzAperture  - Horizontal Aperture (Optional) 

The horizontal cross-section of the antenna radiation pattern in the direction of highest gain.

Format is UN(6,2) (m)

Attribute group Aperture (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HorzAperture", required = false)
    private Dimension horzAperture;
/**
VertAperture  - Vertical Aperture (Optional) 

The vertical cross-section of the antenna radiation pattern in the direction of highest gain.

Format is UN(6,2) (m)

Attribute group Aperture (Optional)
@since 3.1.0
*/
    @XmlElement(name = "VertAperture", required = false)
    private Dimension vertAperture;
/**
HorzSidelobeSuppressed  - Horizontal Sidelobe is Suppressed (Optional) 

If the sidelobe has been suppressed. Enter Yes (if the sidelobe is suppressed) or No (sidelobe not suppressed).

Format is L:CBO

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HorzSidelobeSuppressed", required = false)
    private TString horzSidelobeSuppressed;
/**
HorzSidelobeAz  - Horizontal Sidelobe Azimuth (Optional) 

The direction of the sidelobe in reference to the direction of maximum gain.

Format is UN(5,2) [0..360] (deg)

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HorzSidelobeAz", required = false)
    private Az horzSidelobeAz;
/**
HorzSidelobeAttenuation  - Horizontal Sidelobe Attenuation (Optional) 

The amount of suppression relative to the main beam gain of the antenna.

Format is UN(5,2) (dB)

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "HorzSidelobeAttenuation", required = false)
    private Unsigned_dB_5_2 horzSidelobeAttenuation;
/**
VertSidelobeSuppressed  - Vertical Sidelobe is Suppressed (Optional) 

Whether a portion of the radiation from an antenna outside of the main beam has been suppressed or eliminated..

Format is L:CBO

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "VertSidelobeSuppressed", required = false)
    private TString vertSidelobeSuppressed;
/**
VertSidelobeElev  - Vertical Sidelobe Elevation (Optional) 

The first sidelobe in the vertical plane. Enter the clockwise angular difference (in degrees) between the centre line of the main beam gain and the sidelobe.

Format is UN(5,2) [-180..180] (deg)

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "VertSidelobeElev", required = false)
    private Elev180 vertSidelobeElev;
/**
VertSidelobeAttenuation  - Vertical Sidelobe Attenuation (Optional) 

The attenuation of the sidelobe relative to the main beam gain.

Format is UN(5,2) (dB)

Attribute group Sidelobe (Optional)
@since 3.1.0
*/
    @XmlElement(name = "VertSidelobeAttenuation", required = false)
    private Unsigned_dB_5_2 vertSidelobeAttenuation;
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
AntHardware (Optional)

AntHardware contains the physical parameters related to the antenna feed and lead.
@since 3.1.0
*/
    @XmlElement(name = "AntHardware")
      private  Set<AntHardware> antHardware;
/**
AntMode (Optional)

AntMode contains the technical characteristics of one antenna mode.

Divergence from SMADEF: SMADEF requires (1..n) AntModes
@since 3.1.0
*/
    @XmlElement(name = "AntMode")
      private  Set<AntMode> antMode;
/**
US:UsingCountries (Optional)

UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Antenna.
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
Get the type of antenna.

@return the AntType value in a {@link TString} data type
@since 3.1.0
*/
public TString getAntType() {
        return antType;
    }

/**
Set the type of antenna.

@param value the AntType value in a {@link TString} data type
@since 3.1.0
*/
public void setAntType(TString value) {
        this.antType = value;
    }

/**
Determine if the AntType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntType() {
return (this.antType!= null ? this.antType.isSetValue() : false);
    }

/**
Get the number of main beams in the phased array antenna.

@return the PhArrayNumMainBeams value in a {@link TUN3} data type
@since 3.1.0
*/
public UN3 getPhArrayNumMainBeams() {
        return phArrayNumMainBeams;
    }

/**
Set the number of main beams in the phased array antenna.

@param value the PhArrayNumMainBeams value in a {@link TUN3} data type
@since 3.1.0
*/
public void setPhArrayNumMainBeams(UN3 value) {
        this.phArrayNumMainBeams = value;
    }

/**
Determine if the PhArrayNumMainBeams is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPhArrayNumMainBeams() {
        return (this.phArrayNumMainBeams!= null);
    }

/**
Get the number of antenna elements in the phased array antenna.

@return the PhArrayNumElements value in a {@link TUN5} data type
@since 3.1.0
*/
public UN5 getPhArrayNumElements() {
        return phArrayNumElements;
    }

/**
Set the number of antenna elements in the phased array antenna.

@param value the PhArrayNumElements value in a {@link TUN5} data type
@since 3.1.0
*/
public void setPhArrayNumElements(UN5 value) {
        this.phArrayNumElements = value;
    }

/**
Determine if the PhArrayNumElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPhArrayNumElements() {
        return (this.phArrayNumElements!= null);
    }

/**
Get a code used to describe the general shape of the antenna reflector.

@return the Shape value in a {@link TString} data type
@since 3.1.0
*/
public TString getShape() {
        return shape;
    }

/**
Set a code used to describe the general shape of the antenna reflector.

@param value the Shape value in a {@link TString} data type
@since 3.1.0
*/
public void setShape(TString value) {
        this.shape = value;
    }

/**
Determine if the Shape is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetShape() {
return (this.shape!= null ? this.shape.isSetValue() : false);
    }

/**
Get the cross-section of an antenna radiation pattern in the direction of highest gain.

@return the Diameter value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getDiameter() {
        return diameter;
    }

/**
Set the cross-section of an antenna radiation pattern in the direction of highest gain.

@param value the Diameter value in a {@link TDimension} data type
@since 3.1.0
*/
public void setDiameter(Dimension value) {
        this.diameter = value;
    }

/**
Determine if the Diameter is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDiameter() {
        return (this.diameter!= null);
    }

/**
Get the linear horizontal dimension of the antenna.

@return the HorzDimension value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getHorzDimension() {
        return horzDimension;
    }

/**
Set the linear horizontal dimension of the antenna.

@param value the HorzDimension value in a {@link TDimension} data type
@since 3.1.0
*/
public void setHorzDimension(Dimension value) {
        this.horzDimension = value;
    }

/**
Determine if the HorzDimension is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzDimension() {
        return (this.horzDimension!= null);
    }

/**
Get the linear vertical dimension of the antenna.

@return the VertDimension value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getVertDimension() {
        return vertDimension;
    }

/**
Set the linear vertical dimension of the antenna.

@param value the VertDimension value in a {@link TDimension} data type
@since 3.1.0
*/
public void setVertDimension(Dimension value) {
        this.vertDimension = value;
    }

/**
Determine if the VertDimension is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertDimension() {
        return (this.vertDimension!= null);
    }

/**
Get the cross-section of an antenna radiation pattern in the direction of highest gain.

@return the ApertureDiameter value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getApertureDiameter() {
        return apertureDiameter;
    }

/**
Set the cross-section of an antenna radiation pattern in the direction of highest gain.

@param value the ApertureDiameter value in a {@link TDimension} data type
@since 3.1.0
*/
public void setApertureDiameter(Dimension value) {
        this.apertureDiameter = value;
    }

/**
Determine if the ApertureDiameter is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetApertureDiameter() {
        return (this.apertureDiameter!= null);
    }

/**
Get the horizontal cross-section of the antenna radiation pattern in the direction of highest gain.

@return the HorzAperture value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getHorzAperture() {
        return horzAperture;
    }

/**
Set the horizontal cross-section of the antenna radiation pattern in the direction of highest gain.

@param value the HorzAperture value in a {@link TDimension} data type
@since 3.1.0
*/
public void setHorzAperture(Dimension value) {
        this.horzAperture = value;
    }

/**
Determine if the HorzAperture is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzAperture() {
        return (this.horzAperture!= null);
    }

/**
Get the vertical cross-section of the antenna radiation pattern in the direction of highest gain.

@return the VertAperture value in a {@link TDimension} data type
@since 3.1.0
*/
public Dimension getVertAperture() {
        return vertAperture;
    }

/**
Set the vertical cross-section of the antenna radiation pattern in the direction of highest gain.

@param value the VertAperture value in a {@link TDimension} data type
@since 3.1.0
*/
public void setVertAperture(Dimension value) {
        this.vertAperture = value;
    }

/**
Determine if the VertAperture is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertAperture() {
        return (this.vertAperture!= null);
    }

/**
Get if the sidelobe has been suppressed. Enter Yes (if the sidelobe is suppressed) or No (sidelobe not suppressed).

@return the HorzSidelobeSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public TString getHorzSidelobeSuppressed() {
        return horzSidelobeSuppressed;
    }

/**
Set if the sidelobe has been suppressed. Enter Yes (if the sidelobe is suppressed) or No (sidelobe not suppressed).

@param value the HorzSidelobeSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public void setHorzSidelobeSuppressed(TString value) {
        this.horzSidelobeSuppressed = value;
    }

/**
Determine if the HorzSidelobeSuppressed is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzSidelobeSuppressed() {
return (this.horzSidelobeSuppressed!= null ? this.horzSidelobeSuppressed.isSetValue() : false);
    }

/**
Get the direction of the sidelobe in reference to the direction of maximum gain.

@return the HorzSidelobeAz value in a {@link TAz} data type
@since 3.1.0
*/
public Az getHorzSidelobeAz() {
        return horzSidelobeAz;
    }

/**
Set the direction of the sidelobe in reference to the direction of maximum gain.

@param value the HorzSidelobeAz value in a {@link TAz} data type
@since 3.1.0
*/
public void setHorzSidelobeAz(Az value) {
        this.horzSidelobeAz = value;
    }

/**
Determine if the HorzSidelobeAz is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzSidelobeAz() {
        return (this.horzSidelobeAz!= null);
    }

/**
Get the amount of suppression relative to the main beam gain of the antenna.

@return the HorzSidelobeAttenuation value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public Unsigned_dB_5_2 getHorzSidelobeAttenuation() {
        return horzSidelobeAttenuation;
    }

/**
Set the amount of suppression relative to the main beam gain of the antenna.

@param value the HorzSidelobeAttenuation value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public void setHorzSidelobeAttenuation(Unsigned_dB_5_2 value) {
        this.horzSidelobeAttenuation = value;
    }

/**
Determine if the HorzSidelobeAttenuation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetHorzSidelobeAttenuation() {
        return (this.horzSidelobeAttenuation!= null);
    }

/**
Get whether a portion of the radiation from an antenna outside of the main beam has been suppressed or eliminated..

@return the VertSidelobeSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public TString getVertSidelobeSuppressed() {
        return vertSidelobeSuppressed;
    }

/**
Set whether a portion of the radiation from an antenna outside of the main beam has been suppressed or eliminated..

@param value the VertSidelobeSuppressed value in a {@link TString} data type
@since 3.1.0
*/
public void setVertSidelobeSuppressed(TString value) {
        this.vertSidelobeSuppressed = value;
    }

/**
Determine if the VertSidelobeSuppressed is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertSidelobeSuppressed() {
return (this.vertSidelobeSuppressed!= null ? this.vertSidelobeSuppressed.isSetValue() : false);
    }

/**
Get the first sidelobe in the vertical plane. Enter the clockwise angular difference (in degrees) between the centre line of the main beam gain and the sidelobe.

@return the VertSidelobeElev value in a {@link TElev180} data type
@since 3.1.0
*/
public Elev180 getVertSidelobeElev() {
        return vertSidelobeElev;
    }

/**
Set the first sidelobe in the vertical plane. Enter the clockwise angular difference (in degrees) between the centre line of the main beam gain and the sidelobe.

@param value the VertSidelobeElev value in a {@link TElev180} data type
@since 3.1.0
*/
public void setVertSidelobeElev(Elev180 value) {
        this.vertSidelobeElev = value;
    }

/**
Determine if the VertSidelobeElev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertSidelobeElev() {
        return (this.vertSidelobeElev!= null);
    }

/**
Get the attenuation of the sidelobe relative to the main beam gain.

@return the VertSidelobeAttenuation value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public Unsigned_dB_5_2 getVertSidelobeAttenuation() {
        return vertSidelobeAttenuation;
    }

/**
Set the attenuation of the sidelobe relative to the main beam gain.

@param value the VertSidelobeAttenuation value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public void setVertSidelobeAttenuation(Unsigned_dB_5_2 value) {
        this.vertSidelobeAttenuation = value;
    }

/**
Determine if the VertSidelobeAttenuation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetVertSidelobeAttenuation() {
        return (this.vertSidelobeAttenuation!= null);
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
Get the AntHardware

Complex element AntHardware contains the physical parameters related to the antenna feed and lead.

@return  a {@link AntHardware} instance
@since 3.1.0
*/
    public Set<AntHardware> getAntHardware() {
        if (antHardware == null) {
            antHardware = new HashSet<AntHardware>();
        }
        return this.antHardware;
    }

/**
Determine if the AntHardware is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntHardware() {
        return ((this.antHardware!= null)&&(!this.antHardware.isEmpty()));
    }

/**
  Clear the AntHardware field. This sets the field to null.
 */
    public void unsetAntHardware() {
        this.antHardware = null;
    }

/**
Get the AntMode

Complex element AntMode contains the technical characteristics of one antenna mode.

@return  a {@link AntMode} instance
@since 3.1.0
*/
    public Set<AntMode> getAntMode() {
        if (antMode == null) {
            antMode = new HashSet<AntMode>();
        }
        return this.antMode;
    }

/**
Determine if the AntMode is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAntMode() {
        return ((this.antMode!= null)&&(!this.antMode.isEmpty()));
    }

/**
  Clear the AntMode field. This sets the field to null.
 */
    public void unsetAntMode() {
        this.antMode = null;
    }

/**
Get the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Antenna.

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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withGeneric(ListCBO value) {
        setGeneric(new TString(value.value()));
        return this;
    }

/**
Set the type of antenna.

@param value  An instances of type {@link ListCAT}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withAntType(ListCAT value) {
        setAntType(new TString(value.value()));
        return this;
    }

/**
Set the number of main beams in the phased array antenna.

@param value  An instances of type {@link Integer}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withPhArrayNumMainBeams(Integer value) {
           setPhArrayNumMainBeams(new UN3(value));
        return this;
    }

/**
Set the number of antenna elements in the phased array antenna.

@param value  An instances of type {@link Integer}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withPhArrayNumElements(Integer value) {
           setPhArrayNumElements(new UN5(value));
        return this;
    }

/**
Set a code used to describe the general shape of the antenna reflector.

@param value  An instances of type {@link ListCRS}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withShape(ListCRS value) {
           setShape(new TString(value.value()));
        return this;
    }

/**
Set the cross-section of an antenna radiation pattern in the direction of highest gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withDiameter(Double value) {
           setDiameter(new Dimension(value));
        return this;
    }

/**
Set the linear horizontal dimension of the antenna.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withHorzDimension(Double value) {
           setHorzDimension(new Dimension(value));
        return this;
    }

/**
Set the linear vertical dimension of the antenna.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withVertDimension(Double value) {
           setVertDimension(new Dimension(value));
        return this;
    }

/**
Set the cross-section of an antenna radiation pattern in the direction of highest gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withApertureDiameter(Double value) {
           setApertureDiameter(new Dimension(value));
        return this;
    }

/**
Set the horizontal cross-section of the antenna radiation pattern in the direction of highest gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withHorzAperture(Double value) {
           setHorzAperture(new Dimension(value));
        return this;
    }

/**
Set the vertical cross-section of the antenna radiation pattern in the direction of highest gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withVertAperture(Double value) {
           setVertAperture(new Dimension(value));
        return this;
    }

/**
Set if the sidelobe has been suppressed. Enter Yes (if the sidelobe is suppressed) or No (sidelobe not suppressed).

@param value  An instances of type {@link ListCBO}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withHorzSidelobeSuppressed(ListCBO value) {
           setHorzSidelobeSuppressed(new TString(value.value()));
        return this;
    }

/**
Set the direction of the sidelobe in reference to the direction of maximum gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withHorzSidelobeAz(Double value) {
           setHorzSidelobeAz(new Az(value));
        return this;
    }

/**
Set the amount of suppression relative to the main beam gain of the antenna.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withHorzSidelobeAttenuation(Double value) {
           setHorzSidelobeAttenuation(new Unsigned_dB_5_2(value));
        return this;
    }

/**
Set whether a portion of the radiation from an antenna outside of the main beam has been suppressed or eliminated..

@param value  An instances of type {@link ListCBO}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withVertSidelobeSuppressed(ListCBO value) {
           setVertSidelobeSuppressed(new TString(value.value()));
        return this;
    }

/**
Set the first sidelobe in the vertical plane. Enter the clockwise angular difference (in degrees) between the centre line of the main beam gain and the sidelobe.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withVertSidelobeElev(Double value) {
           setVertSidelobeElev(new Elev180(value));
        return this;
    }

/**
Set the attenuation of the sidelobe relative to the main beam gain.

@param value  An instances of type {@link Double}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withVertSidelobeAttenuation(Double value) {
           setVertSidelobeAttenuation(new Unsigned_dB_5_2(value));
        return this;
    }

/**
Set the POCInformation

Complex element POCInformation contains a reference to a Contact, Organisation or Role dataset.

@param values  One or more instances of type {@link POCInformation...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withPOCInformation(POCInformation... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withPOCInformation(Collection<POCInformation> values) {
        if (values!= null) {
            getPOCInformation().addAll(values);
        }
        return this;
    }

/**
Set the Nomenclature

Complex element Nomenclature identifies either the standard military, government, nomenclature or the commercial model number of an equipment. Each device or group of devices may have several types of nomenclatures, e.g. both a military nomenclature and a commercial model number.

@param values  One or more instances of type {@link Nomenclature...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withNomenclature(Nomenclature... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withNomenclature(Collection<Nomenclature> values) {
        if (values!= null) {
            getNomenclature().addAll(values);
        }
        return this;
    }

/**
Set the AntHardware

Complex element AntHardware contains the physical parameters related to the antenna feed and lead.

@param values  One or more instances of type {@link AntHardware...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withAntHardware(AntHardware... values) {
        if (values!= null) {
            for (AntHardware value: values) {
                getAntHardware().add(value);
            }
        }
        return this;
    }

/**
Set the AntHardware

Complex element AntHardware contains the physical parameters related to the antenna feed and lead.

@param values  A collection of {@link AntHardware} instances
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withAntHardware(Collection<AntHardware> values) {
        if (values!= null) {
            getAntHardware().addAll(values);
        }
        return this;
    }

/**
Set the AntMode

Complex element AntMode contains the technical characteristics of one antenna mode.

@param values  One or more instances of type {@link AntMode...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withAntMode(AntMode... values) {
        if (values!= null) {
            for (AntMode value: values) {
                getAntMode().add(value);
            }
        }
        return this;
    }

/**
Set the AntMode

Complex element AntMode contains the technical characteristics of one antenna mode.

@param values  A collection of {@link AntMode} instances
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withAntMode(Collection<AntMode> values) {
        if (values!= null) {
            getAntMode().addAll(values);
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Antenna.

@param values  One or more instances of type {@link UsingCountries...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withUsingCountries(UsingCountries... values) {
        if (values!= null) {
            for (UsingCountries value: values) {
                getUsingCountries().add(value);
            }
        }
        return this;
    }

/**
Set the US:UsingCountries

Complex element UsingCountries (US) describes the countries that manufacture (Producing), supply (Source), and use (Using) the Antenna.

@param values  A collection of {@link UsingCountries} instances
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withUsingCountries(Collection<UsingCountries> values) {
        if (values!= null) {
            getUsingCountries().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastObservedBy(String value) {
           setLastObservedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withObservedFirstDateTime(Calendar value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withObservedFirstDateTime(Date value) {
           setObservedFirstDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withObservedLastDateTime(Calendar value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withObservedLastDateTime(Date value) {
           setObservedLastDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withApprovedBy(String value) {
           setApprovedBy(new S50(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withApprovedDateTime(Calendar value) {
           setApprovedDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withApprovedDateTime(Date value) {
           setApprovedDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCBO}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRedacted(ListCBO value) {
           setRedacted(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withSerial(Serial value) {
        setSerial(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link TDT}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withEntryDateTime(TDT value) {
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withEntryBy(Serial value) {
           setEntryBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withOwner(Serial value) {
           setOwner(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastChangeDateTime(Calendar value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastChangeDateTime(Date value) {
           setLastChangeDateTime(new DT(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastChangeBy(Serial value) {
           setLastChangeBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Calendar}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastReviewDate(Calendar value) {
           setLastReviewDate(new D(value));
        return this;
    }
/**
Set 

@param value  An instances of type {@link Date}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastReviewDate(Date value) {
           setLastReviewDate(new D(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLastReviewBy(Serial value) {
           setLastReviewBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link Serial}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withModAllowedBy(Serial value) {
           setModAllowedBy(value);
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link ListCSU}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withState(ListCSU value) {
           setState(new TString(value.value()));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withDescription(String value) {
           setDescription(new S500(value));
        return this;
    }

    @Override
/**
Set 

@param value  An instances of type {@link SecurityClass}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withSecurityClass(SecurityClass value) {
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link CaseNum...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withCaseNum(CaseNum... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withCaseNum(Collection<CaseNum> values) {
        if (values!= null) {
            getCaseNum().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link ExtReferenceRef...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withExtReferenceRef(ExtReferenceRef... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withExtReferenceRef(Collection<ExtReferenceRef> values) {
        if (values!= null) {
            getExtReferenceRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Common/Remarks idx values applicable to the current data item.

@param values  One or more instances of type {@link Remarks...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRemarks(Remarks... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRemarks(Collection<Remarks> values) {
        if (values!= null) {
            getRemarks().addAll(values);
        }
        return this;
    }

    @Override
/**
Set the classification of the current data item. This attribute is REQUIRED on each data item, even if the classification is "U".

@param value  An instances of type {@link ListCCL}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withCls(ListCCL value) {
        return this;
    }

    @Override
/**
Set a list of country codes for which the current data item is releasable. For NATO, if this element is omitted, there is no releasability restriction for the data item. For the US, if this data item AND attribute US:legacy Releasability are both blank, there is no releasability restriction for the data item.

@param values  One or more instances of type {@link ListCCY...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withReleasability(ListCCY... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withReleasability(Collection<ListCCY> values) {
        if (values!= null) {
            getReleasability().addAll(values);
        }
        return this;
    }

    @Override
/**
Set 

@param values  One or more instances of type {@link BigInteger...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRemarkRef(BigInteger... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRemarkRef(Collection<BigInteger> values) {
        if (values!= null) {
            getRemarkRef().addAll(values);
        }
        return this;
    }

    @Override
/**
Set a list of Conmmon/ExtReferenceRef idx values applicable to the current data item.

@param values  One or more instances of type {@link BigInteger...}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withExtReferences(BigInteger... values) {
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
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withExtReferences(Collection<BigInteger> values) {
        if (values!= null) {
            getExtReferences().addAll(values);
        }
        return this;
    }

    @Override
/**
Set one or more special handling instructions in sentence format, not code format. For example, "Approved for public release; distribution is unlimited". Multiple special handling instructions are separated by "|” (i.e., ASCII character #124).

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withLegacyReleasability(String value) {
        return this;
    }

    @Override
/**
Set one or more data quality indicator(s), separated by "|” (i.e., ASCII character #124), for the contents of the associated Data Item For example, "Outlier" | "Non-CodeList".

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withQuality(String value) {
        return this;
    }

    @Override
/**
Set a value that is most probably correct.

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withRecommendedValue(String value) {
        return this;
    }

    @Override
/**
Set a unique identifier for each Data Item in the Dataset. Within each Dataset, the idref value must be unique for every occurrence. If a received Dataset uses idrefs and it is expected that the Dataset will be exchanged, the idrefs should be considered required. If the receiving system is the permanent end of the line for the Dataset, the idrefs may be considered optional. 

@param value  An instances of type {@link String}
@return The current Antenna object instance
@since 3.1.0
*/
    public Antenna withIdref(String value) {
        return this;
    }

/**
 Get a string representation of this Antenna instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Antenna {"
 + (antHardware !=null? " antHardware [" + antHardware +"]" : "") 
 + (antMode !=null? " antMode [" + antMode +"]" : "") 
 + (antType !=null? " antType [" + antType +"]" : "") 
 + (apertureDiameter !=null? " apertureDiameter [" + apertureDiameter +"]" : "") 
 + (diameter !=null? " diameter [" + diameter +"]" : "") 
 + (generic !=null? " generic [" + generic +"]" : "") 
 + (horzAperture !=null? " horzAperture [" + horzAperture +"]" : "") 
 + (horzDimension !=null? " horzDimension [" + horzDimension +"]" : "") 
 + (horzSidelobeAttenuation !=null? " horzSidelobeAttenuation [" + horzSidelobeAttenuation +"]" : "") 
 + (horzSidelobeAz !=null? " horzSidelobeAz [" + horzSidelobeAz +"]" : "") 
 + (horzSidelobeSuppressed !=null? " horzSidelobeSuppressed [" + horzSidelobeSuppressed +"]" : "") 
 + (nomenclature !=null? " nomenclature [" + nomenclature +"]" : "") 
 + (phArrayNumElements !=null? " phArrayNumElements [" + phArrayNumElements +"]" : "") 
 + (phArrayNumMainBeams !=null? " phArrayNumMainBeams [" + phArrayNumMainBeams +"]" : "") 
 + (pocInformation !=null? " pocInformation [" + pocInformation +"]" : "") 
 + (shape !=null? " shape [" + shape +"]" : "") 
 + (usingCountries !=null? " usingCountries [" + usingCountries +"]" : "") 
 + (vertAperture !=null? " vertAperture [" + vertAperture +"]" : "") 
 + (vertDimension !=null? " vertDimension [" + vertDimension +"]" : "") 
 + (vertSidelobeAttenuation !=null? " vertSidelobeAttenuation [" + vertSidelobeAttenuation +"]" : "") 
 + (vertSidelobeElev !=null? " vertSidelobeElev [" + vertSidelobeElev +"]" : "") 
 + (vertSidelobeSuppressed !=null? " vertSidelobeSuppressed [" + vertSidelobeSuppressed +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Antenna} requires {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime} and {@link TString AntType}, {@link TString Generic}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
@Override
public boolean isSet(){
return super.isSet() &&  isSetAntType() &&  isSetGeneric();
}

}
