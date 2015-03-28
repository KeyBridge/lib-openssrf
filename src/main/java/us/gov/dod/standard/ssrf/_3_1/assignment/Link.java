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
Link identifies each link in a system of assignments. This is the top element of each Link. The exact definition of a link is very flexible and depends on the degree of accuracy needed for the assignment. A link can be very generic (one or several base stations serving an area or a volume with non-defined mobiles) to very accurate (such as one link for each radio-relay hop).

Element of {@link Assignment}

Sub-Elements are {@link Assigned}, {@link DCSTrunk}, {@link DetailedFunctionID}, {@link StationConfig}, {@link Tuning}

Example: <pre>
* &lt;Link&gt;
*   &lt;LinkID cls="U"&gt;LINK1&lt;/LinkID&gt;
*   &lt;StationConfig&gt;
*     &lt;Type cls="U"&gt;Transmit-Receive&lt;/Type&gt;
*     &lt;ConfigID cls="U"&gt;CONFIG1&lt;/ConfigID&gt;
*     &lt;StationID cls="U"&gt;STATION1&lt;/StationID&gt;
*   &lt;/StationConfig&gt;
*   &lt;Assigned&gt;
*     &lt;Freq&gt;
*       &lt;FreqMin cls="U"&gt;256.275&lt;/FreqMin&gt;
*     &lt;/Freq&gt;
*   &lt;/Assigned&gt;
* &lt;/Link&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Link", propOrder = {
    "linkID",
    "function",
    "intermediateFunction",
    "majorFunction",
    "linkName",
    "tuning",
    "stationConfig",
    "assigned",
    "dcsTrunk",
    "detailedFunction"
})
public class Link {

/**
LinkID - Link Identifier (Required) 

A unique identifier for the link. This identifier should be a meaningful identification of the link, but may also be automatically generated. The identifier SHOULD NOT be modified during the lifetime of the dataset.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "LinkID", required = true)
      private  S100 linkID;
/**
Data item Function is not used by US except when exchanging with NATO.

NATO Definition: Enter the primary, intermediate and optionally detailed function identifiers of the frequency assignment. The primary identifier indicates the type of operations (ground, air, maritime, C3); the intermediate identifier indicates the function; the detailed identifier is not normally used, but may be used to indicate for example some specific system.

US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired, add a Remark with US:MajorFunction, US:IntermedFunction, and US:DetailedFunction(s) separated by dashes. When receiving data from SMADEF, the contents SHOULD be parsed into US:MajorFunction, US:IntermedFunction, and US:DetailedFunction, in order of appearance.
@since 3.1.0
*/
    @XmlElement(name = "Function", required = false)
    private TString function;

    @XmlElement(name = "IntermediateFunction", required = false)
    private TString intermediateFunction;
/**
US:MajorFunction - Major Function (Optional) 

The major (or primary) function of the frequency assignment.

Format is L:UFN
@since 3.1.0
*/
    @XmlElement(name = "MajorFunction", required = false)
    private TString majorFunction;
/**
US:LinkName  - Link Name (Optional) 

A human readable name of the link.

Format is S25
@since 3.1.0
*/
    @XmlElement(name = "LinkName", required = false)
    private S25 linkName;
/**
Tuning (Optional)

Tuning indicates the specific frequency or range of frequencies, tuning increment, and number of frequencies, required for an assignment.
@since 3.1.0
*/
    @XmlElement(name = "Tuning")
      private  Set<Tuning> tuning;
/**
StationConfig (Required)

StationConfig describes one couple (station, configuration) used for transmitting and/or receiving in the current Link. It may also contain additional antenna pointing/blanking parameters.
@since 3.1.0
*/
    @XmlElement(name = "StationConfig", required = true)
      private  Set<StationConfig> stationConfig;
/**
Assigned (Optional)

Assigned contains the assigned frequency(ies), channel or net number; it can also contain the old frequency.
@since 3.1.0
*/
    @XmlElement(name = "Assigned")
      private  Set<Assigned> assigned;
/**
US:DCSTrunk (Optional)

DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier for a specific "trunked" system. The identifier is assigned by the Defense Information Systems Agency (DISA).
@since 3.1.0
*/
    @XmlElement(name = "DCSTrunk", nillable = true)
      private  Set<DCSTrunk> dcsTrunk;

    @XmlElement(name = "DetailedFunction", nillable = true)
      private  Set<DetailedFunction> detailedFunction;

/**
Get a unique identifier for the link. This identifier should be a meaningful identification of the link, but may also be automatically generated. The identifier SHOULD NOT be modified during the lifetime of the dataset.

@return the LinkID value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getLinkID() {
        return linkID;
    }

/**
Set a unique identifier for the link. This identifier should be a meaningful identification of the link, but may also be automatically generated. The identifier SHOULD NOT be modified during the lifetime of the dataset.

@param value the LinkID value in a {@link TS100} data type
@since 3.1.0
*/
public void setLinkID(S100 value) {
        this.linkID = value;
    }

/**
Determine if the LinkID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLinkID() {
        return (this.linkID!= null);
    }

/**
Get Data item Function is not used by US except when exchanging with NATO.

NATO Definition: Enter the primary, intermediate and optionally detailed function identifiers of the frequency assignment. The primary identifier indicates the type of operations (ground, air, maritime, C3); the intermediate identifier indicates the function; the detailed identifier is not normally used, but may be used to indicate for example some specific system.

US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired, add a Remark with US:MajorFunction, US:IntermedFunction, and US:DetailedFunction(s) separated by dashes. When receiving data from SMADEF, the contents SHOULD be parsed into US:MajorFunction, US:IntermedFunction, and US:DetailedFunction, in order of appearance.

@return the Function value in a {@link TString} data type
@since 3.1.0
*/
public TString getFunction() {
        return function;
    }

/**
Set Data item Function is not used by US except when exchanging with NATO.

NATO Definition: Enter the primary, intermediate and optionally detailed function identifiers of the frequency assignment. The primary identifier indicates the type of operations (ground, air, maritime, C3); the intermediate identifier indicates the function; the detailed identifier is not normally used, but may be used to indicate for example some specific system.

US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired, add a Remark with US:MajorFunction, US:IntermedFunction, and US:DetailedFunction(s) separated by dashes. When receiving data from SMADEF, the contents SHOULD be parsed into US:MajorFunction, US:IntermedFunction, and US:DetailedFunction, in order of appearance.

@param value the Function value in a {@link TString} data type
@since 3.1.0
*/
public void setFunction(TString value) {
        this.function = value;
    }

/**
Determine if the Function is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFunction() {
return (this.function!= null ? this.function.isSetValue() : false);
    }

/**
Get 

@return the IntermediateFunction value in a {@link TString} data type
@since 3.1.0
*/
public TString getIntermediateFunction() {
        return intermediateFunction;
    }

/**
Set 

@param value the IntermediateFunction value in a {@link TString} data type
@since 3.1.0
*/
public void setIntermediateFunction(TString value) {
        this.intermediateFunction = value;
    }

/**
Determine if the IntermediateFunction is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetIntermediateFunction() {
return (this.intermediateFunction!= null ? this.intermediateFunction.isSetValue() : false);
    }

/**
Get the major (or primary) function of the frequency assignment.

@return the MajorFunction value in a {@link TString} data type
@since 3.1.0
*/
public TString getMajorFunction() {
        return majorFunction;
    }

/**
Set the major (or primary) function of the frequency assignment.

@param value the MajorFunction value in a {@link TString} data type
@since 3.1.0
*/
public void setMajorFunction(TString value) {
        this.majorFunction = value;
    }

/**
Determine if the MajorFunction is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMajorFunction() {
return (this.majorFunction!= null ? this.majorFunction.isSetValue() : false);
    }

/**
Get a human readable name of the link.

@return the LinkName value in a {@link TS25} data type
@since 3.1.0
*/
public S25 getLinkName() {
        return linkName;
    }

/**
Set a human readable name of the link.

@param value the LinkName value in a {@link TS25} data type
@since 3.1.0
*/
public void setLinkName(S25 value) {
        this.linkName = value;
    }

/**
Determine if the LinkName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetLinkName() {
        return (this.linkName!= null);
    }

/**
Get the Tuning

Complex element Tuning indicates the specific frequency or range of frequencies, tuning increment, and number of frequencies, required for an assignment.

@return  a {@link Tuning} instance
@since 3.1.0
*/
    public Set<Tuning> getTuning() {
        if (tuning == null) {
            tuning = new HashSet<Tuning>();
        }
        return this.tuning;
    }

/**
Determine if the Tuning is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTuning() {
        return ((this.tuning!= null)&&(!this.tuning.isEmpty()));
    }

/**
  Clear the Tuning field. This sets the field to null.
 */
    public void unsetTuning() {
        this.tuning = null;
    }

/**
Get the StationConfig

Complex element StationConfig describes one couple (station, configuration) used for transmitting and/or receiving in the current Link. It may also contain additional antenna pointing/blanking parameters.

@return  a {@link StationConfig} instance
@since 3.1.0
*/
    public Set<StationConfig> getStationConfig() {
        if (stationConfig == null) {
            stationConfig = new HashSet<StationConfig>();
        }
        return this.stationConfig;
    }

/**
Determine if the StationConfig is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetStationConfig() {
        return ((this.stationConfig!= null)&&(!this.stationConfig.isEmpty()));
    }

/**
  Clear the StationConfig field. This sets the field to null.
 */
    public void unsetStationConfig() {
        this.stationConfig = null;
    }

/**
Get the Assigned

Complex element Assigned contains the assigned frequency(ies), channel or net number; it can also contain the old frequency.

@return  a {@link Assigned} instance
@since 3.1.0
*/
    public Set<Assigned> getAssigned() {
        if (assigned == null) {
            assigned = new HashSet<Assigned>();
        }
        return this.assigned;
    }

/**
Determine if the Assigned is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAssigned() {
        return ((this.assigned!= null)&&(!this.assigned.isEmpty()));
    }

/**
  Clear the Assigned field. This sets the field to null.
 */
    public void unsetAssigned() {
        this.assigned = null;
    }

/**
Get the US:DCSTrunk

Complex element DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier for a specific "trunked" system. The identifier is assigned by the Defense Information Systems Agency (DISA).

@return  a {@link DCSTrunk} instance
@since 3.1.0
*/
    public Set<DCSTrunk> getDCSTrunk() {
        if (dcsTrunk == null) {
            dcsTrunk = new HashSet<DCSTrunk>();
        }
        return this.dcsTrunk;
    }

/**
Determine if the DCSTrunk is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDCSTrunk() {
        return ((this.dcsTrunk!= null)&&(!this.dcsTrunk.isEmpty()));
    }

/**
  Clear the DCSTrunk field. This sets the field to null.
 */
    public void unsetDCSTrunk() {
        this.dcsTrunk = null;
    }

/**
Get 

@return  a {@link DetailedFunction} instance
@since 3.1.0
*/
    public Set<DetailedFunction> getDetailedFunction() {
        if (detailedFunction == null) {
            detailedFunction = new HashSet<DetailedFunction>();
        }
        return this.detailedFunction;
    }

/**
Determine if the DetailedFunction is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetDetailedFunction() {
        return ((this.detailedFunction!= null)&&(!this.detailedFunction.isEmpty()));
    }

/**
  Clear the DetailedFunction field. This sets the field to null.
 */
    public void unsetDetailedFunction() {
        this.detailedFunction = null;
    }

/**
Set a unique identifier for the link. This identifier should be a meaningful identification of the link, but may also be automatically generated. The identifier SHOULD NOT be modified during the lifetime of the dataset.

@param value  An instances of type {@link TS100}
@return The current Link object instance
@since 3.1.0
*/
    public Link withLinkID(TS100 value) {
        return this;
    }

/**
Set Data item Function is not used by US except when exchanging with NATO.

NATO Definition: Enter the primary, intermediate and optionally detailed function identifiers of the frequency assignment. The primary identifier indicates the type of operations (ground, air, maritime, C3); the intermediate identifier indicates the function; the detailed identifier is not normally used, but may be used to indicate for example some specific system.

US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired, add a Remark with US:MajorFunction, US:IntermedFunction, and US:DetailedFunction(s) separated by dashes. When receiving data from SMADEF, the contents SHOULD be parsed into US:MajorFunction, US:IntermedFunction, and US:DetailedFunction, in order of appearance.

@param value  An instances of type {@link ListCFN}
@return The current Link object instance
@since 3.1.0
*/
    public Link withFunction(ListCFN value) {
           setFunction(new TString(value.value()));
        return this;
    }

/**
Set 

@param value  An instances of type {@link ListUFN}
@return The current Link object instance
@since 3.1.0
*/
    public Link withIntermediateFunction(ListUFN value) {
           setIntermediateFunction(new TString(value.value()));
        return this;
    }

/**
Set the major (or primary) function of the frequency assignment.

@param value  An instances of type {@link ListUFN}
@return The current Link object instance
@since 3.1.0
*/
    public Link withMajorFunction(ListUFN value) {
           setMajorFunction(new TString(value.value()));
        return this;
    }

/**
Set a human readable name of the link.

@param value  An instances of type {@link String}
@return The current Link object instance
@since 3.1.0
*/
    public Link withLinkName(String value) {
           setLinkName(new S25(value));
        return this;
    }

/**
Set the Tuning

Complex element Tuning indicates the specific frequency or range of frequencies, tuning increment, and number of frequencies, required for an assignment.

@param values  One or more instances of type {@link Tuning...}
@return The current Link object instance
@since 3.1.0
*/
    public Link withTuning(Tuning... values) {
        if (values!= null) {
            for (Tuning value: values) {
                getTuning().add(value);
            }
        }
        return this;
    }

/**
Set the Tuning

Complex element Tuning indicates the specific frequency or range of frequencies, tuning increment, and number of frequencies, required for an assignment.

@param values  A collection of {@link Tuning} instances
@return The current Link object instance
@since 3.1.0
*/
    public Link withTuning(Collection<Tuning> values) {
        if (values!= null) {
            getTuning().addAll(values);
        }
        return this;
    }

/**
Set the StationConfig

Complex element StationConfig describes one couple (station, configuration) used for transmitting and/or receiving in the current Link. It may also contain additional antenna pointing/blanking parameters.

@param values  One or more instances of type {@link StationConfig...}
@return The current Link object instance
@since 3.1.0
*/
    public Link withStationConfig(StationConfig... values) {
        if (values!= null) {
            for (StationConfig value: values) {
                getStationConfig().add(value);
            }
        }
        return this;
    }

/**
Set the StationConfig

Complex element StationConfig describes one couple (station, configuration) used for transmitting and/or receiving in the current Link. It may also contain additional antenna pointing/blanking parameters.

@param values  A collection of {@link StationConfig} instances
@return The current Link object instance
@since 3.1.0
*/
    public Link withStationConfig(Collection<StationConfig> values) {
        if (values!= null) {
            getStationConfig().addAll(values);
        }
        return this;
    }

/**
Set the Assigned

Complex element Assigned contains the assigned frequency(ies), channel or net number; it can also contain the old frequency.

@param values  One or more instances of type {@link Assigned...}
@return The current Link object instance
@since 3.1.0
*/
    public Link withAssigned(Assigned... values) {
        if (values!= null) {
            for (Assigned value: values) {
                getAssigned().add(value);
            }
        }
        return this;
    }

/**
Set the Assigned

Complex element Assigned contains the assigned frequency(ies), channel or net number; it can also contain the old frequency.

@param values  A collection of {@link Assigned} instances
@return The current Link object instance
@since 3.1.0
*/
    public Link withAssigned(Collection<Assigned> values) {
        if (values!= null) {
            getAssigned().addAll(values);
        }
        return this;
    }

/**
Set the US:DCSTrunk

Complex element DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier for a specific "trunked" system. The identifier is assigned by the Defense Information Systems Agency (DISA).

@param values  One or more instances of type {@link DCSTrunk...}
@return The current Link object instance
@since 3.1.0
*/
    public Link withDCSTrunk(DCSTrunk... values) {
        if (values!= null) {
            for (DCSTrunk value: values) {
                getDCSTrunk().add(value);
            }
        }
        return this;
    }

/**
Set the US:DCSTrunk

Complex element DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier for a specific "trunked" system. The identifier is assigned by the Defense Information Systems Agency (DISA).

@param values  A collection of {@link DCSTrunk} instances
@return The current Link object instance
@since 3.1.0
*/
    public Link withDCSTrunk(Collection<DCSTrunk> values) {
        if (values!= null) {
            getDCSTrunk().addAll(values);
        }
        return this;
    }

/**
Set 

@param values  One or more instances of type {@link DetailedFunction...}
@return The current Link object instance
@since 3.1.0
*/
    public Link withDetailedFunction(DetailedFunction... values) {
        if (values!= null) {
            for (DetailedFunction value: values) {
                getDetailedFunction().add(value);
            }
        }
        return this;
    }

/**
Set 

@param values  A collection of {@link DetailedFunction} instances
@return The current Link object instance
@since 3.1.0
*/
    public Link withDetailedFunction(Collection<DetailedFunction> values) {
        if (values!= null) {
            getDetailedFunction().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this Link instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "Link {"
 + (assigned !=null? " assigned [" + assigned +"]" : "") 
 + (dcsTrunk !=null? " dcsTrunk [" + dcsTrunk +"]" : "") 
 + (detailedFunction !=null? " detailedFunction [" + detailedFunction +"]" : "") 
 + (function !=null? " function [" + function +"]" : "") 
 + (intermediateFunction !=null? " intermediateFunction [" + intermediateFunction +"]" : "") 
 + (linkID !=null? " linkID [" + linkID +"]" : "") 
 + (linkName !=null? " linkName [" + linkName +"]" : "") 
 + (majorFunction !=null? " majorFunction [" + majorFunction +"]" : "") 
 + (stationConfig !=null? " stationConfig [" + stationConfig +"]" : "") 
 + (tuning !=null? " tuning [" + tuning +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link Link} requires {@link S100 LinkID}, {@link Set<StationConfig> StationConfig}.

Note that this method only checks for the presence of required information; this method does not validate the information format.
@return TRUE if required fields are set, otherwise FALSE
*/
public boolean isSet(){
return  isSetLinkID() &&  isSetStationConfig();
}

}
