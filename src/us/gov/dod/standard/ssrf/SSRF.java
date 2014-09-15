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
 * This is the ROOT element for any SSRF message. It contains all SSRF
 * attributes and content.
 * <p>
 * A SSRF message may contain any number of datasets.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRF")
public class SSRF extends SchemaRoot {

  public SSRF withContact(Contact... values) {
    if (values != null) {
      getContact().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withContact(Collection<Contact> values) {
    if (values != null) {
      getContact().addAll(values);
    }
    return this;
  }

  public SSRF withRole(Role... values) {
    if (values != null) {
      getRole().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withRole(Collection<Role> values) {
    if (values != null) {
      getRole().addAll(values);
    }
    return this;
  }

  public SSRF withOrganisation(Organisation... values) {
    if (values != null) {
      getOrganisation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withOrganisation(Collection<Organisation> values) {
    if (values != null) {
      getOrganisation().addAll(values);
    }
    return this;
  }

  public SSRF withExternalReference(ExternalReference... values) {
    if (values != null) {
      getExternalReference().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withExternalReference(Collection<ExternalReference> values) {
    if (values != null) {
      getExternalReference().addAll(values);
    }
    return this;
  }

  public SSRF withAdministrative(Administrative... values) {
    if (values != null) {
      getAdministrative().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withAdministrative(Collection<Administrative> values) {
    if (values != null) {
      getAdministrative().addAll(values);
    }
    return this;
  }

  public SSRF withLocation(Location... values) {
    if (values != null) {
      getLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withLocation(Collection<Location> values) {
    if (values != null) {
      getLocation().addAll(values);
    }
    return this;
  }

  public SSRF withChannelPlan(ChannelPlan... values) {
    if (values != null) {
      getChannelPlan().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withChannelPlan(Collection<ChannelPlan> values) {
    if (values != null) {
      getChannelPlan().addAll(values);
    }
    return this;
  }

  public SSRF withTOA(TOA... values) {
    if (values != null) {
      getTOA().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withTOA(Collection<TOA> values) {
    if (values != null) {
      getTOA().addAll(values);
    }
    return this;
  }

  public SSRF withTransmitter(Transmitter... values) {
    if (values != null) {
      getTransmitter().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withTransmitter(Collection<Transmitter> values) {
    if (values != null) {
      getTransmitter().addAll(values);
    }
    return this;
  }

  public SSRF withReceiver(Receiver... values) {
    if (values != null) {
      getReceiver().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withReceiver(Collection<Receiver> values) {
    if (values != null) {
      getReceiver().addAll(values);
    }
    return this;
  }

  public SSRF withAntenna(Antenna... values) {
    if (values != null) {
      getAntenna().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withAntenna(Collection<Antenna> values) {
    if (values != null) {
      getAntenna().addAll(values);
    }
    return this;
  }

  public SSRF withRFSystem(RFSystem... values) {
    if (values != null) {
      getRFSystem().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withRFSystem(Collection<RFSystem> values) {
    if (values != null) {
      getRFSystem().addAll(values);
    }
    return this;
  }

  public SSRF withSSRequest(SSRequest... values) {
    if (values != null) {
      getSSRequest().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withSSRequest(Collection<SSRequest> values) {
    if (values != null) {
      getSSRequest().addAll(values);
    }
    return this;
  }

  public SSRF withSSReply(SSReply... values) {
    if (values != null) {
      getSSReply().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withSSReply(Collection<SSReply> values) {
    if (values != null) {
      getSSReply().addAll(values);
    }
    return this;
  }

  public SSRF withAllotment(Allotment... values) {
    if (values != null) {
      getAllotment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withAllotment(Collection<Allotment> values) {
    if (values != null) {
      getAllotment().addAll(values);
    }
    return this;
  }

  public SSRF withAssignment(Assignment values) {
    if (values != null) {
      getAssignment().addAll(Arrays.asList(values));
    }
    return this;
  }

//  public SSRF withAssignment(Assignment... values) {
//    if (values != null) {
//      getAssignment().addAll(Arrays.asList(values));
//    }
//    return this;
//  }
  public SSRF withAssignment(Collection<Assignment> values) {
    if (values != null) {
      getAssignment().addAll(values);
    }
    return this;
  }

  public SSRF withSatellite(Satellite... values) {
    if (values != null) {
      getSatellite().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withSatellite(Collection<Satellite> values) {
    if (values != null) {
      getSatellite().addAll(values);
    }
    return this;
  }

  public SSRF withIntfReport(IntfReport... values) {
    if (values != null) {
      getIntfReport().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withIntfReport(Collection<IntfReport> values) {
    if (values != null) {
      getIntfReport().addAll(values);
    }
    return this;
  }

  public SSRF withJRFL(JRFL... values) {
    if (values != null) {
      getJRFL().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withJRFL(Collection<JRFL> values) {
    if (values != null) {
      getJRFL().addAll(values);
    }
    return this;
  }

  public SSRF withForceElement(ForceElement... values) {
    if (values != null) {
      getForceElement().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withForceElement(Collection<ForceElement> values) {
    if (values != null) {
      getForceElement().addAll(values);
    }
    return this;
  }

  public SSRF withFEDeployment(FEDeployment... values) {
    if (values != null) {
      getFEDeployment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withFEDeployment(Collection<FEDeployment> values) {
    if (values != null) {
      getFEDeployment().addAll(values);
    }
    return this;
  }

  public SSRF withNote(Note... values) {
    if (values != null) {
      getNote().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SSRF withNote(Collection<Note> values) {
    if (values != null) {
      getNote().addAll(values);
    }
    return this;
  }
}
