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
package us.gov.dod.standard.ssrf._3_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.ChannelFreq;

/**
 * <p>
 * Java class for Channel complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="User" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="ChannelFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ChannelFreq" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
  "name",
  "user",
  "channelFreq"
})
public class Channel {

  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  @XmlElement(name = "User", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString user;
  @XmlElement(name = "ChannelFreq", required = true, nillable = true)
  private List<ChannelFreq> channelFreq;

  /**
   * Gets the value of the name property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the user property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getUser() {
    return user;
  }

  /**
   * Sets the value of the user property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setUser(TString value) {
    this.user = value;
  }

  public boolean isSetUser() {
    return (this.user != null);
  }

  /**
   * Gets the value of the channelFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * 
   * <p>
   * <p>
   * @return
   */
  public List<ChannelFreq> getChannelFreq() {
    if (channelFreq == null) {
      channelFreq = new ArrayList<>();
    }
    return this.channelFreq;
  }

  public boolean isSetChannelFreq() {
    return ((this.channelFreq != null) && (!this.channelFreq.isEmpty()));
  }

  public void unsetChannelFreq() {
    this.channelFreq = null;
  }

  public Channel withName(String value) {
    setName(new TString(value));
    return this;
  }

  public Channel withUser(String value) {
    setUser(new TString(value));
    return this;
  }

  public Channel withChannelFreq(ChannelFreq... values) {
    if (values != null) {
      getChannelFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Channel withChannelFreq(Collection<ChannelFreq> values) {
    if (values != null) {
      getChannelFreq().addAll(values);
    }
    return this;
  }

}
