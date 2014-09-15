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
package us.gov.dod.standard.ssrf._3_0.spectrumsupportability;

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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Java class for DiagramEndpoint complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="DiagramEndpoint"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/> &lt;element
 * name="IconType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"
 * minOccurs="0"/> &lt;element name="IconPosLeft"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6" minOccurs="0"/> &lt;element
 * name="IconPosTop" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6"
 * minOccurs="0"/> &lt;element name="PointToMultiPoint"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 * &lt;element name="EndpointLocation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}EndpointLocation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramEndpoint", propOrder = {
  "name",
  "iconType",
  "iconPosLeft",
  "iconPosTop",
  "pointToMultiPoint",
  "endpointLocation"
})
public class DiagramEndpoint {

  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  @XmlElement(name = "IconType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString iconType;
  @XmlElement(name = "IconPosLeft", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger iconPosLeft;
  @XmlElement(name = "IconPosTop", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger iconPosTop;
  @XmlElement(name = "PointToMultiPoint", required = false)
  private TString pointToMultiPoint;
  @XmlElement(name = "EndpointLocation")
  private List<EndpointLocation> endpointLocation;

  /**
   * Gets the value of the name property.
   * <p>
   * @return
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the iconType property.
   * <p>
   * @return 
   */
  public TString getIconType() {
    return iconType;
  }

  /**
   * Sets the value of the iconType property.
   * <p>
   * @param value 
   */
  public void setIconType(TString value) {
    this.iconType = value;
  }

  public boolean isSetIconType() {
    return (this.iconType != null);
  }

  /**
   * Gets the value of the iconPosLeft property.
   * <p>
   * @return 
   */
  public TInteger getIconPosLeft() {
    return iconPosLeft;
  }

  /**
   * Sets the value of the iconPosLeft property.
   * <p>
   * @param value 
   */
  public void setIconPosLeft(TInteger value) {
    this.iconPosLeft = value;
  }

  public boolean isSetIconPosLeft() {
    return (this.iconPosLeft != null);
  }

  /**
   * Gets the value of the iconPosTop property.
   * <p>
   * @return 
   */
  public TInteger getIconPosTop() {
    return iconPosTop;
  }

  /**
   * Sets the value of the iconPosTop property.
   * <p>
   * @param value 
   */
  public void setIconPosTop(TInteger value) {
    this.iconPosTop = value;
  }

  public boolean isSetIconPosTop() {
    return (this.iconPosTop != null);
  }

  /**
   * Gets the value of the pointToMultiPoint property.
   * <p>
   * @return 
   */
  public TString getPointToMultiPoint() {
    return pointToMultiPoint;
  }

  /**
   * Sets the value of the pointToMultiPoint property.
   * <p>
   * @param value 
   */
  public void setPointToMultiPoint(TString value) {
    this.pointToMultiPoint = value;
  }

  public boolean isSetPointToMultiPoint() {
    return (this.pointToMultiPoint != null);
  }

  /**
   * Gets the value of the endpointLocation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the endpointLocation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEndpointLocation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<EndpointLocation> getEndpointLocation() {
    if (endpointLocation == null) {
      endpointLocation = new ArrayList<>();
    }
    return this.endpointLocation;
  }

  public boolean isSetEndpointLocation() {
    return ((this.endpointLocation != null) && (!this.endpointLocation.isEmpty()));
  }

  public void unsetEndpointLocation() {
    this.endpointLocation = null;
  }

  public DiagramEndpoint withName(String value) {
    setName(new TString(value));
    return this;
  }

  public DiagramEndpoint withIconType(String value) {
    setIconType(new TString(value));
    return this;
  }

  public DiagramEndpoint withIconPosLeft(Integer value) {
    setIconPosLeft(new TInteger(value));
    return this;
  }

  public DiagramEndpoint withIconPosTop(Integer value) {
    setIconPosTop(new TInteger(value));
    return this;
  }

  public DiagramEndpoint withPointToMultiPoint(ListCBO value) {
    setPointToMultiPoint(new TString(value.value()));
    return this;
  }

  public DiagramEndpoint withEndpointLocation(EndpointLocation... values) {
    if (values != null) {
      getEndpointLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public DiagramEndpoint withEndpointLocation(Collection<EndpointLocation> values) {
    if (values != null) {
      getEndpointLocation().addAll(values);
    }
    return this;
  }

}
