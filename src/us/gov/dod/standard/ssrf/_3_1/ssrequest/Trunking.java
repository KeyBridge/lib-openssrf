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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Trunking (US) defines Radiotelephony using standard land mobile principles
 * where multiple baseband signals are bounded within one physical channel.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Sub-Element is {@link TrunkingAssignment}
 * <p>
 * Example:
 * <pre>
 * &lt;Trunking&gt;
 *   &lt;AdditionalChannelsRationale  cls="U"&gt;Redundant network because of importance of target&lt;/AdditionalChannelsRationale &gt;
 *   &lt;Dispatcher  cls="U"&gt;Yes&lt;/Dispatcher &gt;
 *   &lt;DispatcherExplanation  cls="U"&gt;Period of use expired&lt;/DispatcherExplanation &gt;
 *   &lt;EstimatedExpansionCost  cls="U"&gt;458903&lt;/EstimatedExpansionCost &gt;
 *   &lt;ExpansionTargetDate  cls="U"&gt;2014-06-23&lt;/ExpansionTargetDate &gt;
 *   &lt;FreqMax  cls="U"&gt;3380&lt;/FreqMax &gt;
 *   &lt;NSEPUse  cls="U"&gt;Period of use expired&lt;/NSEPUse &gt;
 *   &lt;NumFreqsRequired  cls="U"&gt;4&lt;/NumFreqsRequired &gt;
 *   &lt;NumRepeaters  cls="U"&gt;15&lt;/NumRepeaters &gt;
 *   &lt;NumUsers  cls="U"&gt;490&lt;/NumUsers &gt;
 *   &lt;PreviousSPSDocketNum  cls="U"&gt;47890&lt;/PreviousSPSDocketNum &gt;
 *   &lt;RequestForExpansion  cls="U"&gt;Yes&lt;/RequestForExpansion &gt;
 *   &lt;SeparateSystemJustification  cls="U"&gt;Redundant network because of importance of target&lt;/SeparateSystemJustification &gt;
 *   &lt;USFreqMin  cls="U"&gt;3250&lt;/USFreqMin &gt;
 * &lt;/Trunking&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trunking", propOrder = {
  "additionalChannelsRationale",
  "dispatcher",
  "dispatcherExplanation",
  "estimatedExpansionCost",
  "expansionTargetDate",
  "freqMax",
  "nsepUse",
  "numFreqsRequired",
  "numRepeaters",
  "numUsers",
  "previousSPSDocketNum",
  "requestForExpansion",
  "separateSystemJustification",
  "freqMin",
  "trunkingAssignment"
})
public class Trunking {

  /**
   * US:AdditionalChannelsRationale - Additional Channels Reason (Optional)
   * <p>
   * A rationale for the additional channels (e.g., channel loading, queuing
   * times, or new users).
   * <p>
   * Format is Memo
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "AdditionalChannelsRationale", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString additionalChannelsRationale;
  /**
   * US:Dispatcher - Dispatcher Access (Optional)
   * <p>
   * If a Dispatcher accesses base stations or repeaters in the trunked land
   * mobile system.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Dispatcher", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS1.class)
  private TString dispatcher;
  /**
   * US:DispatcherExplanation - Dispatcher Explanation (Optional)
   * <p>
   * How the dispatcher accesses the base station or repeater.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "DispatcherExplanation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString dispatcherExplanation;
  /**
   * US:EstimatedExpansionCost - Estimated Expansion Cost (Optional)
   * <p>
   * The estimated cost of the expansion.
   * <p>
   * Format is S70
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "EstimatedExpansionCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString estimatedExpansionCost;
  /**
   * US:ExpansionTargetDate - Expansion Target Date (Optional)
   * <p>
   * The date this expansion will be activated (i.e., the date the system will
   * require the additional radio frequencies).
   * <p>
   * Format is Date
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "ExpansionTargetDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expansionTargetDate;
  /**
   * US:FreqMax - Frequency Maximum (Optional)
   * <p>
   * The upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:NSEPUse - NSEP Use (Optional)
   * <p>
   * The U.S. National Security and Emergency Preparedness (NSEP) function. A
   * statement as to whether the proposed system, if it becomes operational,
   * will support a NSEP function and require review under the
   * Telecommunications Service Priority for Radiocommunications (TSP-R) System.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "NSEPUse", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString nsepUse;
  /**
   * US:NumFreqsRequired - Number of Frequencies Required (Optional)
   * <p>
   * The total number of frequencies required.
   * <p>
   * Format is UN(10)
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "NumFreqsRequired", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numFreqsRequired;
  /**
   * US:NumRepeaters - Number of Repeaters (Optional)
   * <p>
   * The total number of repeaters in the trunked land mobile system.
   * <p>
   * Format is UN(7)
   */
  @XmlElement(name = "NumRepeaters", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN7.class)
  private TInteger numRepeaters;
  /**
   * US:NumUsers - Number of Users (Optional)
   * <p>
   * The total number of users of the trunked land mobile system.
   * <p>
   * Format is UN(10)
   */
  @XmlElement(name = "NumUsers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numUsers;
  /**
   * US:PreviousSPSDocketNum - Previous SPS Docket Number (Optional)
   * <p>
   * The IRAC Spectrum Planning Subcommittee (SPS) docket number of the NTIA
   * Certification of Spectrum Support for the existing trunked system.
   * <p>
   * Format is S12
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "PreviousSPSDocketNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString previousSPSDocketNum;
  /**
   * US:RequestForExpansion - Request For Expansion (Optional)
   * <p>
   * If this application is a request for expansion.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "RequestForExpansion", required = false)
  private TString requestForExpansion;
  /**
   * US:SeparateSystemJustification - Separate System Justification (Optional)
   * <p>
   * The For trunked land mobile systems that are within 30 km of an existing or
   * planned trunked land mobile system authorised by NTIA, provides the
   * information required under subparagraph 8.2.48a of the NTIA Manual
   * ("Procedures and Principles for the Assignment and Coordination of
   * Frequencies, Land Mobile Radio Communications").
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "SeparateSystemJustification", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString separateSystemJustification;
  /**
   * US:FreqMin - Frequency Minimum (Optional)
   * <p>
   * The lower frequency of band or discrete frequency.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * US:TrunkingAssignment (Optional)
   * <p>
   * TrunkingAssignment (US) refers to the Agency Serial Number of the existing
   * assignment to be relinquished or used in the trunked land mobile system.
   */
  @XmlElement(name = "TrunkingAssignment")
  private List<TrunkingAssignment> trunkingAssignment;

  /**
   * Get a rationale for the additional channels (e.g., channel loading, queuing
   * times, or new users).
   * <p>
   * @return the AdditionalChannelsRationale value in a {@link TString} data
   *         type
   */
  public TString getAdditionalChannelsRationale() {
    return additionalChannelsRationale;
  }

  /**
   * Set a rationale for the additional channels (e.g., channel loading, queuing
   * times, or new users).
   * <p>
   * @param value the AdditionalChannelsRationale value in a {@link TString}
   *              data type
   */
  public void setAdditionalChannelsRationale(TString value) {
    this.additionalChannelsRationale = value;
  }

  /**
   * Determine if the AdditionalChannelsRationale is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdditionalChannelsRationale() {
    return (this.additionalChannelsRationale != null ? this.additionalChannelsRationale.isSetValue() : false);
  }

  /**
   * Get if a Dispatcher accesses base stations or repeaters in the trunked land
   * mobile system.
   * <p>
   * @return the Dispatcher value in a {@link TString} data type
   */
  public TString getDispatcher() {
    return dispatcher;
  }

  /**
   * Set if a Dispatcher accesses base stations or repeaters in the trunked land
   * mobile system.
   * <p>
   * @param value the Dispatcher value in a {@link TString} data type
   */
  public void setDispatcher(TString value) {
    this.dispatcher = value;
  }

  /**
   * Determine if the Dispatcher is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDispatcher() {
    return (this.dispatcher != null ? this.dispatcher.isSetValue() : false);
  }

  /**
   * Get how the dispatcher accesses the base station or repeater.
   * <p>
   * @return the DispatcherExplanation value in a {@link TString} data type
   */
  public TString getDispatcherExplanation() {
    return dispatcherExplanation;
  }

  /**
   * Set how the dispatcher accesses the base station or repeater.
   * <p>
   * @param value the DispatcherExplanation value in a {@link TString} data type
   */
  public void setDispatcherExplanation(TString value) {
    this.dispatcherExplanation = value;
  }

  /**
   * Determine if the DispatcherExplanation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDispatcherExplanation() {
    return (this.dispatcherExplanation != null ? this.dispatcherExplanation.isSetValue() : false);
  }

  /**
   * Get the estimated cost of the expansion.
   * <p>
   * @return the EstimatedExpansionCost value in a {@link TString} data type
   */
  public TString getEstimatedExpansionCost() {
    return estimatedExpansionCost;
  }

  /**
   * Set the estimated cost of the expansion.
   * <p>
   * @param value the EstimatedExpansionCost value in a {@link TString} data
   *              type
   */
  public void setEstimatedExpansionCost(TString value) {
    this.estimatedExpansionCost = value;
  }

  /**
   * Determine if the EstimatedExpansionCost is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEstimatedExpansionCost() {
    return (this.estimatedExpansionCost != null ? this.estimatedExpansionCost.isSetValue() : false);
  }

  /**
   * Get the date this expansion will be activated (i.e., the date the system
   * will require the additional radio frequencies).
   * <p>
   * @return the ExpansionTargetDate value in a {@link TCalendar} data type
   */
  public TCalendar getExpansionTargetDate() {
    return expansionTargetDate;
  }

  /**
   * Set the date this expansion will be activated (i.e., the date the system
   * will require the additional radio frequencies).
   * <p>
   * @param value the ExpansionTargetDate value in a {@link TCalendar} data type
   */
  public void setExpansionTargetDate(TCalendar value) {
    this.expansionTargetDate = value;
  }

  /**
   * Determine if the ExpansionTargetDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpansionTargetDate() {
    return (this.expansionTargetDate != null ? this.expansionTargetDate.isSetValue() : false);
  }

  /**
   * Get the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the U.S. National Security and Emergency Preparedness (NSEP) function.
   * A statement as to whether the proposed system, if it becomes operational,
   * will support a NSEP function and require review under the
   * Telecommunications Service Priority for Radiocommunications (TSP-R) System.
   * <p>
   * @return the NSEPUse value in a {@link TString} data type
   */
  public TString getNSEPUse() {
    return nsepUse;
  }

  /**
   * Set the U.S. National Security and Emergency Preparedness (NSEP) function.
   * A statement as to whether the proposed system, if it becomes operational,
   * will support a NSEP function and require review under the
   * Telecommunications Service Priority for Radiocommunications (TSP-R) System.
   * <p>
   * @param value the NSEPUse value in a {@link TString} data type
   */
  public void setNSEPUse(TString value) {
    this.nsepUse = value;
  }

  /**
   * Determine if the NSEPUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNSEPUse() {
    return (this.nsepUse != null ? this.nsepUse.isSetValue() : false);
  }

  /**
   * Get the total number of frequencies required.
   * <p>
   * @return the NumFreqsRequired value in a {@link TInteger} data type
   */
  public TInteger getNumFreqsRequired() {
    return numFreqsRequired;
  }

  /**
   * Set the total number of frequencies required.
   * <p>
   * @param value the NumFreqsRequired value in a {@link TInteger} data type
   */
  public void setNumFreqsRequired(TInteger value) {
    this.numFreqsRequired = value;
  }

  /**
   * Determine if the NumFreqsRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumFreqsRequired() {
    return (this.numFreqsRequired != null ? this.numFreqsRequired.isSetValue() : false);
  }

  /**
   * Get the total number of repeaters in the trunked land mobile system.
   * <p>
   * @return the NumRepeaters value in a {@link TInteger} data type
   */
  public TInteger getNumRepeaters() {
    return numRepeaters;
  }

  /**
   * Set the total number of repeaters in the trunked land mobile system.
   * <p>
   * @param value the NumRepeaters value in a {@link TInteger} data type
   */
  public void setNumRepeaters(TInteger value) {
    this.numRepeaters = value;
  }

  /**
   * Determine if the NumRepeaters is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRepeaters() {
    return (this.numRepeaters != null ? this.numRepeaters.isSetValue() : false);
  }

  /**
   * Get the total number of users of the trunked land mobile system.
   * <p>
   * @return the NumUsers value in a {@link TInteger} data type
   */
  public TInteger getNumUsers() {
    return numUsers;
  }

  /**
   * Set the total number of users of the trunked land mobile system.
   * <p>
   * @param value the NumUsers value in a {@link TInteger} data type
   */
  public void setNumUsers(TInteger value) {
    this.numUsers = value;
  }

  /**
   * Determine if the NumUsers is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumUsers() {
    return (this.numUsers != null ? this.numUsers.isSetValue() : false);
  }

  /**
   * Get the IRAC Spectrum Planning Subcommittee (SPS) docket number of the NTIA
   * Certification of Spectrum Support for the existing trunked system.
   * <p>
   * @return the PreviousSPSDocketNum value in a {@link TString} data type
   */
  public TString getPreviousSPSDocketNum() {
    return previousSPSDocketNum;
  }

  /**
   * Set the IRAC Spectrum Planning Subcommittee (SPS) docket number of the NTIA
   * Certification of Spectrum Support for the existing trunked system.
   * <p>
   * @param value the PreviousSPSDocketNum value in a {@link TString} data type
   */
  public void setPreviousSPSDocketNum(TString value) {
    this.previousSPSDocketNum = value;
  }

  /**
   * Determine if the PreviousSPSDocketNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPreviousSPSDocketNum() {
    return (this.previousSPSDocketNum != null ? this.previousSPSDocketNum.isSetValue() : false);
  }

  /**
   * Get if this application is a request for expansion.
   * <p>
   * @return the RequestForExpansion value in a {@link TString} data type
   */
  public TString getRequestForExpansion() {
    return requestForExpansion;
  }

  /**
   * Set if this application is a request for expansion.
   * <p>
   * @param value the RequestForExpansion value in a {@link TString} data type
   */
  public void setRequestForExpansion(TString value) {
    this.requestForExpansion = value;
  }

  /**
   * Determine if the RequestForExpansion is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRequestForExpansion() {
    return (this.requestForExpansion != null ? this.requestForExpansion.isSetValue() : false);
  }

  /**
   * Get the For trunked land mobile systems that are within 30 km of an
   * existing or planned trunked land mobile system authorised by NTIA, provides
   * the information required under subparagraph 8.2.48a of the NTIA Manual
   * ("Procedures and Principles for the Assignment and Coordination of
   * Frequencies, Land Mobile Radio Communications").
   * <p>
   * @return the SeparateSystemJustification value in a {@link TString} data
   *         type
   */
  public TString getSeparateSystemJustification() {
    return separateSystemJustification;
  }

  /**
   * Set the For trunked land mobile systems that are within 30 km of an
   * existing or planned trunked land mobile system authorised by NTIA, provides
   * the information required under subparagraph 8.2.48a of the NTIA Manual
   * ("Procedures and Principles for the Assignment and Coordination of
   * Frequencies, Land Mobile Radio Communications").
   * <p>
   * @param value the SeparateSystemJustification value in a {@link TString}
   *              data type
   */
  public void setSeparateSystemJustification(TString value) {
    this.separateSystemJustification = value;
  }

  /**
   * Determine if the SeparateSystemJustification is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSeparateSystemJustification() {
    return (this.separateSystemJustification != null ? this.separateSystemJustification.isSetValue() : false);
  }

  /**
   * Get the lower frequency of band or discrete frequency.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lower frequency of band or discrete frequency.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the US:TrunkingAssignment
   * <p>
   * Complex element TrunkingAssignment (US) refers to the Agency Serial Number
   * of the existing assignment to be relinquished or used in the trunked land
   * mobile system.
   * <p>
   * @return a non-null but possibly empty list of {@link TrunkingAssignment} instances
   */
  public List<TrunkingAssignment> getTrunkingAssignment() {
    if (trunkingAssignment == null) {
      trunkingAssignment = new ArrayList<>();
    }
    return this.trunkingAssignment;
  }

  /**
   * Determine if the TrunkingAssignment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTrunkingAssignment() {
    return ((this.trunkingAssignment != null) && (!this.trunkingAssignment.isEmpty()));
  }

  /**
   * Clear the TrunkingAssignment field. This sets the field to null.
   */
  public void unsetTrunkingAssignment() {
    this.trunkingAssignment = null;
  }

  /**
   * Set a rationale for the additional channels (e.g., channel loading, queuing
   * times, or new users).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withAdditionalChannelsRationale(String value) {
    setAdditionalChannelsRationale(new TString(value));
    return this;
  }

  /**
   * Set if a Dispatcher accesses base stations or repeaters in the trunked land
   * mobile system.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withDispatcher(String value) {
    setDispatcher(new TString(value));
    return this;
  }

  /**
   * Set how the dispatcher accesses the base station or repeater.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withDispatcherExplanation(String value) {
    setDispatcherExplanation(new TString(value));
    return this;
  }

  /**
   * Set the estimated cost of the expansion.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withEstimatedExpansionCost(String value) {
    setEstimatedExpansionCost(new TString(value));
    return this;
  }

  /**
   * Set the date this expansion will be activated (i.e., the date the system
   * will require the additional radio frequencies).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Trunking object instance
   */
  public Trunking withExpansionTargetDate(Calendar value) {
    setExpansionTargetDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the upper frequency of band.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Trunking object instance
   */
  public Trunking withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the U.S. National Security and Emergency Preparedness (NSEP) function.
   * A statement as to whether the proposed system, if it becomes operational,
   * will support a NSEP function and require review under the
   * Telecommunications Service Priority for Radiocommunications (TSP-R) System.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withNSEPUse(String value) {
    setNSEPUse(new TString(value));
    return this;
  }

  /**
   * Set the total number of frequencies required.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Trunking object instance
   */
  public Trunking withNumFreqsRequired(Integer value) {
    setNumFreqsRequired(new TInteger(value));
    return this;
  }

  /**
   * Set the total number of repeaters in the trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Trunking object instance
   */
  public Trunking withNumRepeaters(Integer value) {
    setNumRepeaters(new TInteger(value));
    return this;
  }

  /**
   * Set the total number of users of the trunked land mobile system.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Trunking object instance
   */
  public Trunking withNumUsers(Integer value) {
    setNumUsers(new TInteger(value));
    return this;
  }

  /**
   * Set the IRAC Spectrum Planning Subcommittee (SPS) docket number of the NTIA
   * Certification of Spectrum Support for the existing trunked system.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withPreviousSPSDocketNum(String value) {
    setPreviousSPSDocketNum(new TString(value));
    return this;
  }

  /**
   * Set if this application is a request for expansion.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Trunking object instance
   */
  public Trunking withRequestForExpansion(ListCBO value) {
    setRequestForExpansion(new TString(value.value()));
    return this;
  }

  /**
   * Set the For trunked land mobile systems that are within 30 km of an
   * existing or planned trunked land mobile system authorised by NTIA, provides
   * the information required under subparagraph 8.2.48a of the NTIA Manual
   * ("Procedures and Principles for the Assignment and Coordination of
   * Frequencies, Land Mobile Radio Communications").
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Trunking object instance
   */
  public Trunking withSeparateSystemJustification(String value) {
    setSeparateSystemJustification(new TString(value));
    return this;
  }

  /**
   * Set the lower frequency of band or discrete frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Trunking object instance
   */
  public Trunking withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:TrunkingAssignment
   * <p>
   * Complex element TrunkingAssignment (US) refers to the Agency Serial Number
   * of the existing assignment to be relinquished or used in the trunked land
   * mobile system.
   * <p>
   * @param values One or more instances of type {@link TrunkingAssignment}
   * @return The current Trunking object instance
   */
  public Trunking withTrunkingAssignment(TrunkingAssignment... values) {
    if (values != null) {
      getTrunkingAssignment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:TrunkingAssignment
   * <p>
   * Complex element TrunkingAssignment (US) refers to the Agency Serial Number
   * of the existing assignment to be relinquished or used in the trunked land
   * mobile system.
   * <p>
   * @param values A collection of {@link TrunkingAssignment} instances
   * @return The current Trunking object instance
   */
  public Trunking withTrunkingAssignment(Collection<TrunkingAssignment> values) {
    if (values != null) {
      getTrunkingAssignment().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Trunking instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Trunking {"
      + " numRepeaters [" + numRepeaters + "]"
      + " freqMin [" + freqMin + "]"
      + " freqMax [" + freqMax + "]"
      + " expansionTargetDate [" + expansionTargetDate + "]"
      + " dispatcher [" + dispatcher + "]"
      + " estimatedExpansionCost [" + estimatedExpansionCost + "]"
      + " numFreqsRequired [" + numFreqsRequired + "]"
      + " requestForExpansion [" + requestForExpansion + "]"
      + " trunkingAssignment [" + trunkingAssignment + "]"
      + " dispatcherExplanation [" + dispatcherExplanation + "]"
      + " numUsers [" + numUsers + "]"
      + " separateSystemJustification [" + separateSystemJustification + "]"
      + " previousSPSDocketNum [" + previousSPSDocketNum + "]"
      + " nsepUse [" + nsepUse + "]"
      + " additionalChannelsRationale [" + additionalChannelsRationale + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Trunking} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
