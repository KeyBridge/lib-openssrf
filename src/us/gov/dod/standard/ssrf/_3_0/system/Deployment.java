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
package us.gov.dod.standard.ssrf._3_0.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.Installation;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Deployment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Deployment"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/> &lt;element
 * name="Status" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 * &lt;element name="Installation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Installation" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deployment", propOrder = {
  "type",
  "status",
  "installation"
})
public class Deployment {

  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString type;
  @XmlElement(name = "Status", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString status;
  @XmlElement(name = "Installation", nillable = true)
  private List<Installation> installation;

  /**
   * Gets the value of the type property.
   * <p>
   * @return
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the status property.
   * <p>
   * @return 
   */
  public TString getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   * <p>
   * @param value 
   */
  public void setStatus(TString value) {
    this.status = value;
  }

  public boolean isSetStatus() {
    return (this.status != null);
  }

  /**
   * Gets the value of the installation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the installation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getInstallation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<Installation> getInstallation() {
    if (installation == null) {
      installation = new ArrayList<>();
    }
    return this.installation;
  }

  public boolean isSetInstallation() {
    return ((this.installation != null) && (!this.installation.isEmpty()));
  }

  public void unsetInstallation() {
    this.installation = null;
  }

  public Deployment withType(String value) {
    setType(new TString(value));
    return this;
  }

  public Deployment withStatus(String value) {
    setStatus(new TString(value));
    return this;
  }

  public Deployment withInstallation(Installation... values) {
    if (values != null) {
      getInstallation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Deployment withInstallation(Collection<Installation> values) {
    if (values != null) {
      getInstallation().addAll(values);
    }
    return this;
  }

}
