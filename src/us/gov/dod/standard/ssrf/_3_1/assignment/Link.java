/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.DetailedFunction;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFN;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUFN;

/**
 * Link identifies each link in a system of assignments. This is the top element
 * of each Link. The exact definition of a link is very flexible and depends on
 * the degree of accuracy needed for the assignment. A link can be very generic
 * (one or several base stations serving an area or a volume with non-defined
 * mobiles) to very accurate (such as one link for each radio-relay hop).
 * <p>
 * Element of {@link Assignment}
 * <p>
 * Sub-Elements are
 * {@link Assigned}, {@link DCSTrunk}, {@link DetailedFunction}, {@link StationConfig}, {@link Tuning}
 * <p>
 * Example:
 * <pre>
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
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * LinkID - Link Identifier (Required)
   * <p>
   * A unique identifier for the link. This identifier should be a meaningful
   * identification of the link, but may also be automatically generated. The
   * identifier SHOULD NOT be modified during the lifetime of the dataset.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "LinkID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString linkID;
  /**
   * Data item Function is not used by US except when exchanging with NATO.
   * <p>
   * NATO Definition: Enter the primary, intermediate and optionally detailed
   * function identifiers of the frequency assignment. The primary identifier
   * indicates the type of operations (ground, air, maritime, C3); the
   * intermediate identifier indicates the function; the detailed identifier is
   * not normally used, but may be used to indicate for example some specific
   * system.
   * <p>
   * US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired,
   * add a Remark with US:MajorFunction, US:IntermedFunction, and
   * US:DetailedFunction(s) separated by dashes. When receiving data from
   * SMADEF, the contents SHOULD be parsed into US:MajorFunction,
   * US:IntermedFunction, and US:DetailedFunction, in order of appearance.
   */
  @XmlElement(name = "Function", required = false)
  private TString function;
  /**
   * US:IntermediateFunction - Intermediate Function (Optional)
   * <p>
   * The intermediate (or secondary) function of the frequency assignment.
   * <p>
   * Format is L:UFN
   */
  @XmlElement(name = "IntermediateFunction", required = false)
  private TString intermediateFunction;
  /**
   * US:MajorFunction - Major Function (Optional)
   * <p>
   * The major (or primary) function of the frequency assignment.
   * <p>
   * Format is L:UFN
   */
  @XmlElement(name = "MajorFunction", required = false)
  private TString majorFunction;
  /**
   * US:LinkName - Link Name (Optional)
   * <p>
   * A human readable name of the link.
   * <p>
   * Format is S25
   */
  @XmlElement(name = "LinkName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString linkName;
  /**
   * Tuning (Optional)
   * <p>
   * Tuning indicates the specific frequency or range of frequencies, tuning
   * increment, and number of frequencies, required for an assignment.
   */
  @XmlElement(name = "Tuning")
  private List<Tuning> tuning;
  /**
   * StationConfig (Required)
   * <p>
   * StationConfig describes one couple (station, configuration) used for
   * transmitting and/or receiving in the current Link. It may also contain
   * additional antenna pointing/blanking parameters.
   */
  @XmlElement(name = "StationConfig", required = true)
  private List<StationConfig> stationConfig;
  /**
   * Assigned (Optional)
   * <p>
   * Assigned contains the assigned frequency(ies), channel or net number; it
   * can also contain the old frequency.
   */
  @XmlElement(name = "Assigned")
  private List<Assigned> assigned;
  /**
   * US:DCSTrunk (Optional)
   * <p>
   * DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier
   * for a specific "trunked" system. The identifier is assigned by the Defense
   * Information Systems Agency (DISA).
   */
  @XmlElement(name = "DCSTrunk", nillable = true)
  private List<DCSTrunk> dcsTrunk;
  /**
   * US:DetailedFunctionID (Optional)
   * <p>
   * DetailedFunctionID (US) is the function identifier for an equipment in the
   * link of a frequency assignment or group of frequency assignments.
   */
  @XmlElement(name = "DetailedFunction", nillable = true)
  private List<DetailedFunction> detailedFunction;

  /**
   * Get a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @return the LinkID value in a {@link TString} data type
   */
  public TString getLinkID() {
    return linkID;
  }

  /**
   * Set a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @param value the LinkID value in a {@link TString} data type
   */
  public void setLinkID(TString value) {
    this.linkID = value;
  }

  /**
   * Determine if the LinkID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLinkID() {
    return (this.linkID != null ? this.linkID.isSetValue() : false);
  }

  /**
   * Get Data item Function is not used by US except when exchanging with NATO.
   * <p>
   * NATO Definition: Enter the primary, intermediate and optionally detailed
   * function identifiers of the frequency assignment. The primary identifier
   * indicates the type of operations (ground, air, maritime, C3); the
   * intermediate identifier indicates the function; the detailed identifier is
   * not normally used, but may be used to indicate for example some specific
   * system.
   * <p>
   * US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired,
   * add a Remark with US:MajorFunction, US:IntermedFunction, and
   * US:DetailedFunction(s) separated by dashes. When receiving data from
   * SMADEF, the contents SHOULD be parsed into US:MajorFunction,
   * US:IntermedFunction, and US:DetailedFunction, in order of appearance.
   * <p>
   * @return the Function value in a {@link TString} data type
   */
  public TString getFunction() {
    return function;
  }

  /**
   * Set Data item Function is not used by US except when exchanging with NATO.
   * <p>
   * NATO Definition: Enter the primary, intermediate and optionally detailed
   * function identifiers of the frequency assignment. The primary identifier
   * indicates the type of operations (ground, air, maritime, C3); the
   * intermediate identifier indicates the function; the detailed identifier is
   * not normally used, but may be used to indicate for example some specific
   * system.
   * <p>
   * US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired,
   * add a Remark with US:MajorFunction, US:IntermedFunction, and
   * US:DetailedFunction(s) separated by dashes. When receiving data from
   * SMADEF, the contents SHOULD be parsed into US:MajorFunction,
   * US:IntermedFunction, and US:DetailedFunction, in order of appearance.
   * <p>
   * @param value the Function value in a {@link TString} data type
   */
  public void setFunction(TString value) {
    this.function = value;
  }

  /**
   * Determine if the Function is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFunction() {
    return (this.function != null ? this.function.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the IntermediateFunction value in a {@link TString} data type
   */
  public TString getIntermediateFunction() {
    return intermediateFunction;
  }

  /**
   * Set
   * <p>
   * @param value the IntermediateFunction value in a {@link TString} data type
   */
  public void setIntermediateFunction(TString value) {
    this.intermediateFunction = value;
  }

  /**
   * Determine if the IntermediateFunction is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermediateFunction() {
    return (this.intermediateFunction != null ? this.intermediateFunction.isSetValue() : false);
  }

  /**
   * Get the major (or primary) function of the frequency assignment.
   * <p>
   * @return the MajorFunction value in a {@link TString} data type
   */
  public TString getMajorFunction() {
    return majorFunction;
  }

  /**
   * Set the major (or primary) function of the frequency assignment.
   * <p>
   * @param value the MajorFunction value in a {@link TString} data type
   */
  public void setMajorFunction(TString value) {
    this.majorFunction = value;
  }

  /**
   * Determine if the MajorFunction is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMajorFunction() {
    return (this.majorFunction != null ? this.majorFunction.isSetValue() : false);
  }

  /**
   * Get a human readable name of the link.
   * <p>
   * @return the LinkName value in a {@link TString} data type
   */
  public TString getLinkName() {
    return linkName;
  }

  /**
   * Set a human readable name of the link.
   * <p>
   * @param value the LinkName value in a {@link TString} data type
   */
  public void setLinkName(TString value) {
    this.linkName = value;
  }

  /**
   * Determine if the LinkName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLinkName() {
    return (this.linkName != null ? this.linkName.isSetValue() : false);
  }

  /**
   * Get the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @return a non-null but possibly empty list of {@link Tuning} instances
   */
  public List<Tuning> getTuning() {
    if (tuning == null) {
      tuning = new ArrayList<>();
    }
    return this.tuning;
  }

  /**
   * Determine if the Tuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuning() {
    return ((this.tuning != null) && (!this.tuning.isEmpty()));
  }

  /**
   * Clear the Tuning field. This sets the field to null.
   */
  public void unsetTuning() {
    this.tuning = null;
  }

  /**
   * Get the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @return a non-null but possibly empty list of {@link StationConfig} instances
   */
  public List<StationConfig> getStationConfig() {
    if (stationConfig == null) {
      stationConfig = new ArrayList<>();
    }
    return this.stationConfig;
  }

  /**
   * Determine if the StationConfig is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStationConfig() {
    return ((this.stationConfig != null) && (!this.stationConfig.isEmpty()));
  }

  /**
   * Clear the StationConfig field. This sets the field to null.
   */
  public void unsetStationConfig() {
    this.stationConfig = null;
  }

  /**
   * Get the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @return a non-null but possibly empty list of {@link Assigned} instances
   */
  public List<Assigned> getAssigned() {
    if (assigned == null) {
      assigned = new ArrayList<>();
    }
    return this.assigned;
  }

  /**
   * Determine if the Assigned is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssigned() {
    return ((this.assigned != null) && (!this.assigned.isEmpty()));
  }

  /**
   * Clear the Assigned field. This sets the field to null.
   */
  public void unsetAssigned() {
    this.assigned = null;
  }

  /**
   * Get the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @return a non-null but possibly empty list of {@link DCSTrunk} instances
   */
  public List<DCSTrunk> getDCSTrunk() {
    if (dcsTrunk == null) {
      dcsTrunk = new ArrayList<>();
    }
    return this.dcsTrunk;
  }

  /**
   * Determine if the DCSTrunk is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDCSTrunk() {
    return ((this.dcsTrunk != null) && (!this.dcsTrunk.isEmpty()));
  }

  /**
   * Clear the DCSTrunk field. This sets the field to null.
   */
  public void unsetDCSTrunk() {
    this.dcsTrunk = null;
  }

  /**
   * Get the US:DetailedFunctionID
   * <p>
   * Complex element DetailedFunctionID (US) is the function identifier for an
   * equipment in the link of a frequency assignment or group of frequency
   * assignments.
   * <p>
   * @return a non-null but possibly empty list of {@link DetailedFunction} instances
   */
  public List<DetailedFunction> getDetailedFunction() {
    if (detailedFunction == null) {
      detailedFunction = new ArrayList<>();
    }
    return this.detailedFunction;
  }

  /**
   * Determine if the DetailedFunction is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDetailedFunction() {
    return ((this.detailedFunction != null) && (!this.detailedFunction.isEmpty()));
  }

  /**
   * Clear the DetailedFunction field. This sets the field to null.
   */
  public void unsetDetailedFunction() {
    this.detailedFunction = null;
  }

  /**
   * Set a unique identifier for the link. This identifier should be a
   * meaningful identification of the link, but may also be automatically
   * generated. The identifier SHOULD NOT be modified during the lifetime of the
   * dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   */
  public Link withLinkID(String value) {
    setLinkID(new TString(value));
    return this;
  }

  /**
   * Set Data item Function is not used by US except when exchanging with NATO.
   * <p>
   * NATO Definition: Enter the primary, intermediate and optionally detailed
   * function identifiers of the frequency assignment. The primary identifier
   * indicates the type of operations (ground, air, maritime, C3); the
   * intermediate identifier indicates the function; the detailed identifier is
   * not normally used, but may be used to indicate for example some specific
   * system.
   * <p>
   * US-Only: When sending data to SMADEF, enter UNKNOWN in Function If desired,
   * add a Remark with US:MajorFunction, US:IntermedFunction, and
   * US:DetailedFunction(s) separated by dashes. When receiving data from
   * SMADEF, the contents SHOULD be parsed into US:MajorFunction,
   * US:IntermedFunction, and US:DetailedFunction, in order of appearance.
   * <p>
   * @param value An instances of type {@link ListCFN}
   * @return The current Link object instance
   */
  public Link withFunction(ListCFN value) {
    setFunction(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListUFN}
   * @return The current Link object instance
   */
  public Link withIntermediateFunction(ListUFN value) {
    setIntermediateFunction(new TString(value.value()));
    return this;
  }

  /**
   * Set the major (or primary) function of the frequency assignment.
   * <p>
   * @param value An instances of type {@link ListUFN}
   * @return The current Link object instance
   */
  public Link withMajorFunction(ListUFN value) {
    setMajorFunction(new TString(value.value()));
    return this;
  }

  /**
   * Set a human readable name of the link.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Link object instance
   */
  public Link withLinkName(String value) {
    setLinkName(new TString(value));
    return this;
  }

  /**
   * Set the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @param values One or more instances of type {@link Tuning}
   * @return The current Link object instance
   */
  public Link withTuning(Tuning... values) {
    if (values != null) {
      getTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Tuning
   * <p>
   * Complex element Tuning indicates the specific frequency or range of
   * frequencies, tuning increment, and number of frequencies, required for an
   * assignment.
   * <p>
   * @param values A collection of {@link Tuning} instances
   * @return The current Link object instance
   */
  public Link withTuning(Collection<Tuning> values) {
    if (values != null) {
      getTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @param values One or more instances of type {@link StationConfig}
   * @return The current Link object instance
   */
  public Link withStationConfig(StationConfig... values) {
    if (values != null) {
      getStationConfig().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StationConfig
   * <p>
   * Complex element StationConfig describes one couple (station, configuration)
   * used for transmitting and/or receiving in the current Link. It may also
   * contain additional antenna pointing/blanking parameters.
   * <p>
   * @param values A collection of {@link StationConfig} instances
   * @return The current Link object instance
   */
  public Link withStationConfig(Collection<StationConfig> values) {
    if (values != null) {
      getStationConfig().addAll(values);
    }
    return this;
  }

  /**
   * Set the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @param values One or more instances of type {@link Assigned}
   * @return The current Link object instance
   */
  public Link withAssigned(Assigned... values) {
    if (values != null) {
      getAssigned().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Assigned
   * <p>
   * Complex element Assigned contains the assigned frequency(ies), channel or
   * net number; it can also contain the old frequency.
   * <p>
   * @param values A collection of {@link Assigned} instances
   * @return The current Link object instance
   */
  public Link withAssigned(Collection<Assigned> values) {
    if (values != null) {
      getAssigned().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @param values One or more instances of type {@link DCSTrunk}
   * @return The current Link object instance
   */
  public Link withDCSTrunk(DCSTrunk... values) {
    if (values != null) {
      getDCSTrunk().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:DCSTrunk
   * <p>
   * Complex element DCSTrunk (US) is the Defense Communications System (DCS)
   * trunk identifier for a specific "trunked" system. The identifier is
   * assigned by the Defense Information Systems Agency (DISA).
   * <p>
   * @param values A collection of {@link DCSTrunk} instances
   * @return The current Link object instance
   */
  public Link withDCSTrunk(Collection<DCSTrunk> values) {
    if (values != null) {
      getDCSTrunk().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:DetailedFunctionID
   * <p>
   * Complex element DetailedFunctionID (US) is the function identifier for an
   * equipment in the link of a frequency assignment or group of frequency
   * assignments.
   * <p>
   * @param values One or more instances of type {@link DetailedFunction}
   * @return The current Link object instance
   */
  public Link withDetailedFunction(DetailedFunction... values) {
    if (values != null) {
      getDetailedFunction().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:DetailedFunctionID
   * <p>
   * Complex element DetailedFunctionID (US) is the function identifier for an
   * equipment in the link of a frequency assignment or group of frequency
   * assignments.
   * <p>
   * @param values A collection of {@link DetailedFunction} instances
   * @return The current Link object instance
   */
  public Link withDetailedFunction(Collection<DetailedFunction> values) {
    if (values != null) {
      getDetailedFunction().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Link instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Link {"
      + " linkID [" + linkID + "]"
      + " dcsTrunk [" + dcsTrunk + "]"
      + " stationConfig [" + stationConfig + "]"
      + " detailedFunction [" + detailedFunction + "]"
      + " assigned [" + assigned + "]"
      + " tuning [" + tuning + "]"
      + " linkName [" + linkName + "]"
      + " majorFunction [" + majorFunction + "]"
      + " intermediateFunction [" + intermediateFunction + "]"
      + " function [" + function + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Link} requires
   * {@link TString LinkID}, {@link StationConfig StationConfig}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLinkID() && isSetStationConfig();
  }

}
