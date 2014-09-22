/*
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf;

import java.util.Arrays;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_0.*;

/**
 * This is the ROOT element for any SMADEF-XML message. It contains all
 * SMADEF-XML attributes and content.
 * <p>
 * A SMADEF-XML message may contain any number of datasets.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMADEF")
public class SMADEF extends SchemaRoot {

  public SMADEF withContact(Contact... values) {
    if (values != null) {
      getContact().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withContact(Collection<Contact> values) {
    if (values != null) {
      getContact().addAll(values);
    }
    return this;
  }

  public SMADEF withRole(Role... values) {
    if (values != null) {
      getRole().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withRole(Collection<Role> values) {
    if (values != null) {
      getRole().addAll(values);
    }
    return this;
  }

  public SMADEF withOrganisation(Organisation... values) {
    if (values != null) {
      getOrganisation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withOrganisation(Collection<Organisation> values) {
    if (values != null) {
      getOrganisation().addAll(values);
    }
    return this;
  }

  public SMADEF withExternalReference(ExternalReference... values) {
    if (values != null) {
      getExternalReference().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withExternalReference(Collection<ExternalReference> values) {
    if (values != null) {
      getExternalReference().addAll(values);
    }
    return this;
  }

  public SMADEF withAdministrative(Administrative... values) {
    if (values != null) {
      getAdministrative().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withAdministrative(Collection<Administrative> values) {
    if (values != null) {
      getAdministrative().addAll(values);
    }
    return this;
  }

  public SMADEF withLocation(Location... values) {
    if (values != null) {
      getLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withLocation(Collection<Location> values) {
    if (values != null) {
      getLocation().addAll(values);
    }
    return this;
  }

  public SMADEF withChannelPlan(ChannelPlan... values) {
    if (values != null) {
      getChannelPlan().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withChannelPlan(Collection<ChannelPlan> values) {
    if (values != null) {
      getChannelPlan().addAll(values);
    }
    return this;
  }

  public SMADEF withTOA(TOA... values) {
    if (values != null) {
      getTOA().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withTOA(Collection<TOA> values) {
    if (values != null) {
      getTOA().addAll(values);
    }
    return this;
  }

  public SMADEF withTransmitter(Transmitter... values) {
    if (values != null) {
      getTransmitter().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withTransmitter(Collection<Transmitter> values) {
    if (values != null) {
      getTransmitter().addAll(values);
    }
    return this;
  }

  public SMADEF withReceiver(Receiver... values) {
    if (values != null) {
      getReceiver().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withReceiver(Collection<Receiver> values) {
    if (values != null) {
      getReceiver().addAll(values);
    }
    return this;
  }

  public SMADEF withAntenna(Antenna... values) {
    if (values != null) {
      getAntenna().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withAntenna(Collection<Antenna> values) {
    if (values != null) {
      getAntenna().addAll(values);
    }
    return this;
  }

  public SMADEF withRFSystem(RFSystem... values) {
    if (values != null) {
      getRFSystem().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withRFSystem(Collection<RFSystem> values) {
    if (values != null) {
      getRFSystem().addAll(values);
    }
    return this;
  }

  public SMADEF withSSRequest(SSRequest... values) {
    if (values != null) {
      getSSRequest().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withSSRequest(Collection<SSRequest> values) {
    if (values != null) {
      getSSRequest().addAll(values);
    }
    return this;
  }

  public SMADEF withSSReply(SSReply... values) {
    if (values != null) {
      getSSReply().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withSSReply(Collection<SSReply> values) {
    if (values != null) {
      getSSReply().addAll(values);
    }
    return this;
  }

  public SMADEF withAllotment(Allotment... values) {
    if (values != null) {
      getAllotment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withAllotment(Collection<Allotment> values) {
    if (values != null) {
      getAllotment().addAll(values);
    }
    return this;
  }

  public SMADEF withAssignment(Assignment... values) {
    if (values != null) {
      getAssignment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withAssignment(Collection<Assignment> values) {
    if (values != null) {
      getAssignment().addAll(values);
    }
    return this;
  }

  public SMADEF withSatellite(Satellite... values) {
    if (values != null) {
      getSatellite().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withSatellite(Collection<Satellite> values) {
    if (values != null) {
      getSatellite().addAll(values);
    }
    return this;
  }

  public SMADEF withIntfReport(IntfReport... values) {
    if (values != null) {
      getIntfReport().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withIntfReport(Collection<IntfReport> values) {
    if (values != null) {
      getIntfReport().addAll(values);
    }
    return this;
  }

  public SMADEF withJRFL(JRFL... values) {
    if (values != null) {
      getJRFL().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withJRFL(Collection<JRFL> values) {
    if (values != null) {
      getJRFL().addAll(values);
    }
    return this;
  }

  public SMADEF withForceElement(ForceElement... values) {
    if (values != null) {
      getForceElement().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withForceElement(Collection<ForceElement> values) {
    if (values != null) {
      getForceElement().addAll(values);
    }
    return this;
  }

  public SMADEF withFEDeployment(FEDeployment... values) {
    if (values != null) {
      getFEDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withFEDeployment(Collection<FEDeployment> values) {
    if (values != null) {
      getFEDeployment().addAll(values);
    }
    return this;
  }

  public SMADEF withNote(Note... values) {
    if (values != null) {
      getNote().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SMADEF withNote(Collection<Note> values) {
    if (values != null) {
      getNote().addAll(values);
    }
    return this;
  }

  public void addContact(Contact value) {
    withContact(value);
  }

  public void addRole(Role value) {
    withRole(value);
  }

  public void addOrganisation(Organisation value) {
    withOrganisation(value);
  }

  public void addExternalreference(ExternalReference value) {
    withExternalReference(value);
  }

  public void addAdministrative(Administrative value) {
    withAdministrative(value);
  }

  public void addLocation(Location value) {
    withLocation(value);
  }

  public void addChannelplan(ChannelPlan value) {
    withChannelPlan(value);
  }

  public void addToa(TOA value) {
    withTOA(value);
  }

  public void addTransmitter(Transmitter value) {
    withTransmitter(value);
  }

  public void addReceiver(Receiver value) {
    withReceiver(value);
  }

  public void addAntenna(Antenna value) {
    withAntenna(value);
  }

  public void addRfsystem(RFSystem value) {
    withRFSystem(value);
  }

  public void addSsrequest(SSRequest value) {
    withSSRequest(value);
  }

  public void addSsreply(SSReply value) {
    withSSReply(value);
  }

  public void addAllotment(Allotment value) {
    withAllotment(value);
  }

  public void addAssignment(Assignment value) {
    withAssignment(value);
  }

  public void addSatellite(Satellite value) {
    withSatellite(value);
  }

  public void addIntfreport(IntfReport value) {
    withIntfReport(value);
  }

  public void addJrfl(JRFL value) {
    withJRFL(value);
  }

  public void addForceelement(ForceElement value) {
    withForceElement(value);
  }

  public void addFedeployment(FEDeployment value) {
    withFEDeployment(value);
  }

  public void addNote(Note value) {
    withNote(value);
  }
}
