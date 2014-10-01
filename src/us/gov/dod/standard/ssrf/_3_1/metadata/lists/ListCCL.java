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
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.administrative.MissingRef;
import us.gov.dod.standard.ssrf._3_1.allotment.LocationRef;
import us.gov.dod.standard.ssrf._3_1.allotment.LocationRestriction;
import us.gov.dod.standard.ssrf._3_1.assignment.*;
import us.gov.dod.standard.ssrf._3_1.channelplan.ChannelFreq;
import us.gov.dod.standard.ssrf._3_1.common.Downgrade;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.multiple.LoadsetRef;
import us.gov.dod.standard.ssrf._3_1.multiple.RxModeRef;
import us.gov.dod.standard.ssrf._3_1.organisation.RoleRef;
import us.gov.dod.standard.ssrf._3_1.receiver.EmsClass;
import us.gov.dod.standard.ssrf._3_1.receiver.Installation;
import us.gov.dod.standard.ssrf._3_1.role.ContactRef;
import us.gov.dod.standard.ssrf._3_1.satellite.RFSystemRef;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;
import us.gov.dod.standard.ssrf._3_1.ssreply.Comment;
import us.gov.dod.standard.ssrf._3_1.ssrequest.HostNation;
import us.gov.dod.standard.ssrf._3_1.toa.Administration;
import us.gov.dod.standard.ssrf._3_1.toa.ChannelPlanRef;
import us.gov.dod.standard.ssrf._3_1.toa.Country;
import us.gov.dod.standard.ssrf._3_1.toa.StnClass;

/**
 * Enumerated values for fields using the ListCCL type.
 * <p>
 * Used in
 * {@link Administration}, {@link Administrative}, {@link Allotment}, {@link Antenna}, {@link Assignment}, {@link ChannelFreq}, {@link ChannelPlan}, {@link ChannelPlanRef}, {@link CircuitRemarks}, {@link Comment}, {@link Common}, {@link Contact}, {@link ContactRef}, {@link Country}, {@link DCSTrunk}, {@link DatasetRef}, {@link DetailedFunction}, {@link DocketNum}, {@link Downgrade}, {@link EMail}, {@link EmsClass}, {@link ExtReferenceRef}, {@link ExternalReference}, {@link FEDeployment}, {@link ForceElement}, {@link HostDocketNum}, {@link HostNation}, {@link Installation}, {@link IntfReport}, {@link JRFL}, {@link Loadset}, {@link LoadsetRef}, {@link Location}, {@link LocationRef}, {@link LocationRestriction}, {@link Message}, {@link MissingRef}, {@link Note}, {@link OffTheShelfEquipment}, {@link Organisation}, {@link RFSystem}, {@link RFSystemRef}, {@link RadiationPlan}, {@link Receiver}, {@link RelatedRef}, {@link Remarks}, {@link Role}, {@link RoleRef}, {@link RxModeRef}, {@link SSReply}, {@link SSRequest}, {@link Satellite}, {@link ServiceArea}, {@link StnClass}, {@link TOA}, {@link TelephoneFax}, {@link Transmitter}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCCL")
@XmlEnum
public enum ListCCL {

  U,
  R,
  C,
  S,
  T;

  public String value() {
    return name();
  }

  public static ListCCL fromValue(String v) {
    return valueOf(v);
  }

}
