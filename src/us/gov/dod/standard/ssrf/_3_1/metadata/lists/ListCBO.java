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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.antenna.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.assignment.Station;
import us.gov.dod.standard.ssrf._3_1.assignment.StationLoc;
import us.gov.dod.standard.ssrf._3_1.assignment.Tuning;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.loadset.JammingChannelProfile;
import us.gov.dod.standard.ssrf._3_1.loadset.TimingDeconflictionProtocol;
import us.gov.dod.standard.ssrf._3_1.location.Ellipse;
import us.gov.dod.standard.ssrf._3_1.location.Point;
import us.gov.dod.standard.ssrf._3_1.location.Polygon;
import us.gov.dod.standard.ssrf._3_1.multiple.ConfigFreq;
import us.gov.dod.standard.ssrf._3_1.multiple.ObservedERPAnalysis;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPerformance;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPlan;
import us.gov.dod.standard.ssrf._3_1.receiver.Curve;
import us.gov.dod.standard.ssrf._3_1.receiver.SpreadSpectrum;
import us.gov.dod.standard.ssrf._3_1.ssreply.StageLocation;
import us.gov.dod.standard.ssrf._3_1.ssrequest.DiagramEndpoint;
import us.gov.dod.standard.ssrf._3_1.ssrequest.EndpointLocation;
import us.gov.dod.standard.ssrf._3_1.ssrequest.Trunking;
import us.gov.dod.standard.ssrf._3_1.ssrequest.TrunkingAssignment;
import us.gov.dod.standard.ssrf._3_1.toa.Allocation;
import us.gov.dod.standard.ssrf._3_1.transmitter.*;

/**
 * Enumerated values for fields using the ListCBO type.
 * <p>
 * Used in
 * {@link Administrative}, {@link Allocation}, {@link Allotment}, {@link AntGain}, {@link AntMode}, {@link AntPattern}, {@link Antenna}, {@link Assignment}, {@link ChannelPlan}, {@link Common}, {@link ConfigFreq}, {@link Configuration}, {@link Contact}, {@link Curve}, {@link DiagramEndpoint}, {@link EMail}, {@link Ellipse}, {@link EndpointLocation}, {@link ExternalReference}, {@link FEDeployment}, {@link ForceElement}, {@link IntfReport}, {@link JRFL}, {@link JammingChannelProfile}, {@link JammingPerformance}, {@link JammingPlan}, {@link Loadset}, {@link Location}, {@link Message}, {@link Note}, {@link ObservedERPAnalysis}, {@link ObservedLobeAnalysis}, {@link ObservedMOPAnalysis}, {@link ObservedPolarisationAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link ObservedScanAnalysis}, {@link Organisation}, {@link Point}, {@link Polygon}, {@link Power}, {@link RFSystem}, {@link RadiationPlan}, {@link Receiver}, {@link Role}, {@link SSReply}, {@link SSRequest}, {@link Satellite}, {@link SpreadSpectrum}, {@link StageLocation}, {@link Station}, {@link StationLoc}, {@link TOA}, {@link TelephoneFax}, {@link TimingDeconflictionProtocol}, {@link Transmitter}, {@link Trunking}, {@link TrunkingAssignment}, {@link Tuning}, {@link TxMode}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCBO")
@XmlEnum
public enum ListCBO {

  @XmlEnumValue("Yes")
  YES("Yes"),
  @XmlEnumValue("No")
  NO("No");
  private final String value;

  ListCBO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCBO fromValue(String v) {
    for (ListCBO c : ListCBO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
