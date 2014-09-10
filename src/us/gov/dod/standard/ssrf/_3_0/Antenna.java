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
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for Antenna complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Antenna"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Generic" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/>
 * &lt;element name="AntType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 * &lt;element name="PhArrayNumMainBeams"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3" minOccurs="0"/> &lt;element
 * name="PhArrayNumElements" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Dimension"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Aperture"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Sidelobe"
 * minOccurs="0"/> &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Nomenclature"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="AntHardware"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntHardware" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="AntMode"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntMode" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Antenna", propOrder = {
  "generic",
  "antType",
  "phArrayNumMainBeams",
  "phArrayNumElements",
  "shape",
  "diameter",
  "horzDimension",
  "vertDimension",
  "apertureDiameter",
  "horzAperture",
  "vertAperture",
  "horzSidelobeSuppressed",
  "horzSidelobeAz",
  "horzSidelobeAttenuation",
  "vertSidelobeSuppressed",
  "vertSidelobeElev",
  "vertSidelobeAttenuation",
  "pocInformation",
  "nomenclature",
  "antHardware",
  "antMode"
})
public class Antenna extends Common {

  @XmlElement(name = "Generic", required = true)
  private TString generic;
  @XmlElement(name = "AntType", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString antType;
  @XmlElement(name = "PhArrayNumMainBeams", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN3.class)
  private TInteger phArrayNumMainBeams;
  @XmlElement(name = "PhArrayNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger phArrayNumElements;
  @XmlElement(name = "Shape", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString shape;
  @XmlElement(name = "Diameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal diameter;
  @XmlElement(name = "HorzDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal horzDimension;
  @XmlElement(name = "VertDimension", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal vertDimension;
  @XmlElement(name = "ApertureDiameter", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal apertureDiameter;
  @XmlElement(name = "HorzAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal horzAperture;
  @XmlElement(name = "VertAperture", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN6_2.class)
  private TDecimal vertAperture;
  @XmlElement(name = "HorzSidelobeSuppressed", required = false)
  private TString horzSidelobeSuppressed;
  @XmlElement(name = "HorzSidelobeAz", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal horzSidelobeAz;
  @XmlElement(name = "HorzSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal horzSidelobeAttenuation;
  @XmlElement(name = "VertSidelobeSuppressed", required = false)
  private TString vertSidelobeSuppressed;
  @XmlElement(name = "VertSidelobeElev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV180.class)
  private TDecimal vertSidelobeElev;
  @XmlElement(name = "VertSidelobeAttenuation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal vertSidelobeAttenuation;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "Nomenclature")
  private List<Nomenclature> nomenclature;
  @XmlElement(name = "AntHardware")
  private List<AntHardware> antHardware;
  @XmlElement(name = "AntMode")
  private List<AntMode> antMode;

  /**
   * Gets the value of the generic property.
   * <p>
   * @return possible object is {@link TListCBO }
   * <p>
   */
  public TString getGeneric() {
    return generic;
  }

  /**
   * Sets the value of the generic property.
   * <p>
   * @param value allowed object is {@link TListCBO }
   * <p>
   */
  public void setGeneric(TString value) {
    this.generic = value;
  }

  public boolean isSetGeneric() {
    return (this.generic != null);
  }

  /**
   * Gets the value of the antType property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getAntType() {
    return antType;
  }

  /**
   * Sets the value of the antType property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setAntType(TString value) {
    this.antType = value;
  }

  public boolean isSetAntType() {
    return (this.antType != null);
  }

  /**
   * Gets the value of the phArrayNumMainBeams property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public TInteger getPhArrayNumMainBeams() {
    return phArrayNumMainBeams;
  }

  /**
   * Sets the value of the phArrayNumMainBeams property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public void setPhArrayNumMainBeams(TInteger value) {
    this.phArrayNumMainBeams = value;
  }

  public boolean isSetPhArrayNumMainBeams() {
    return (this.phArrayNumMainBeams != null);
  }

  /**
   * Gets the value of the phArrayNumElements property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public TInteger getPhArrayNumElements() {
    return phArrayNumElements;
  }

  /**
   * Sets the value of the phArrayNumElements property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setPhArrayNumElements(TInteger value) {
    this.phArrayNumElements = value;
  }

  public boolean isSetPhArrayNumElements() {
    return (this.phArrayNumElements != null);
  }

  /**
   * Gets the value of the shape property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getShape() {
    return shape;
  }

  /**
   * Sets the value of the shape property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setShape(TString value) {
    this.shape = value;
  }

  public boolean isSetShape() {
    return (this.shape != null);
  }

  /**
   * Gets the value of the diameter property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getDiameter() {
    return diameter;
  }

  /**
   * Sets the value of the diameter property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setDiameter(TDecimal value) {
    this.diameter = value;
  }

  public boolean isSetDiameter() {
    return (this.diameter != null);
  }

  /**
   * Gets the value of the horzDimension property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getHorzDimension() {
    return horzDimension;
  }

  /**
   * Sets the value of the horzDimension property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setHorzDimension(TDecimal value) {
    this.horzDimension = value;
  }

  public boolean isSetHorzDimension() {
    return (this.horzDimension != null);
  }

  /**
   * Gets the value of the vertDimension property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getVertDimension() {
    return vertDimension;
  }

  /**
   * Sets the value of the vertDimension property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setVertDimension(TDecimal value) {
    this.vertDimension = value;
  }

  public boolean isSetVertDimension() {
    return (this.vertDimension != null);
  }

  /**
   * Gets the value of the apertureDiameter property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getApertureDiameter() {
    return apertureDiameter;
  }

  /**
   * Sets the value of the apertureDiameter property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setApertureDiameter(TDecimal value) {
    this.apertureDiameter = value;
  }

  public boolean isSetApertureDiameter() {
    return (this.apertureDiameter != null);
  }

  /**
   * Gets the value of the horzAperture property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getHorzAperture() {
    return horzAperture;
  }

  /**
   * Sets the value of the horzAperture property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setHorzAperture(TDecimal value) {
    this.horzAperture = value;
  }

  public boolean isSetHorzAperture() {
    return (this.horzAperture != null);
  }

  /**
   * Gets the value of the vertAperture property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public TDecimal getVertAperture() {
    return vertAperture;
  }

  /**
   * Sets the value of the vertAperture property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setVertAperture(TDecimal value) {
    this.vertAperture = value;
  }

  public boolean isSetVertAperture() {
    return (this.vertAperture != null);
  }

  /**
   * Gets the value of the horzSidelobeSuppressed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getHorzSidelobeSuppressed() {
    return horzSidelobeSuppressed;
  }

  /**
   * Sets the value of the horzSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setHorzSidelobeSuppressed(TString value) {
    this.horzSidelobeSuppressed = value;
  }

  public boolean isSetHorzSidelobeSuppressed() {
    return (this.horzSidelobeSuppressed != null);
  }

  /**
   * Gets the value of the horzSidelobeAz property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public TDecimal getHorzSidelobeAz() {
    return horzSidelobeAz;
  }

  /**
   * Sets the value of the horzSidelobeAz property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public void setHorzSidelobeAz(TDecimal value) {
    this.horzSidelobeAz = value;
  }

  public boolean isSetHorzSidelobeAz() {
    return (this.horzSidelobeAz != null);
  }

  /**
   * Gets the value of the horzSidelobeAttenuation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public TDecimal getHorzSidelobeAttenuation() {
    return horzSidelobeAttenuation;
  }

  /**
   * Sets the value of the horzSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setHorzSidelobeAttenuation(TDecimal value) {
    this.horzSidelobeAttenuation = value;
  }

  public boolean isSetHorzSidelobeAttenuation() {
    return (this.horzSidelobeAttenuation != null);
  }

  /**
   * Gets the value of the vertSidelobeSuppressed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getVertSidelobeSuppressed() {
    return vertSidelobeSuppressed;
  }

  /**
   * Sets the value of the vertSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setVertSidelobeSuppressed(TString value) {
    this.vertSidelobeSuppressed = value;
  }

  public boolean isSetVertSidelobeSuppressed() {
    return (this.vertSidelobeSuppressed != null);
  }

  /**
   * Gets the value of the vertSidelobeElev property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev180 }{@code >}
   * <p>
   */
  public TDecimal getVertSidelobeElev() {
    return vertSidelobeElev;
  }

  /**
   * Sets the value of the vertSidelobeElev property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev180 }{@code >}
   * <p>
   */
  public void setVertSidelobeElev(TDecimal value) {
    this.vertSidelobeElev = value;
  }

  public boolean isSetVertSidelobeElev() {
    return (this.vertSidelobeElev != null);
  }

  /**
   * Gets the value of the vertSidelobeAttenuation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public TDecimal getVertSidelobeAttenuation() {
    return vertSidelobeAttenuation;
  }

  /**
   * Sets the value of the vertSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setVertSidelobeAttenuation(TDecimal value) {
    this.vertSidelobeAttenuation = value;
  }

  public boolean isSetVertSidelobeAttenuation() {
    return (this.vertSidelobeAttenuation != null);
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link POCInformation }
   * <p>
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the nomenclature property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the nomenclature property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNomenclature().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link Nomenclature }
   * <p>
   * <p>
   * @return
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Gets the value of the antHardware property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antHardware property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntHardware().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link AntHardware }
   * <p>
   * <p>
   * @return
   */
  public List<AntHardware> getAntHardware() {
    if (antHardware == null) {
      antHardware = new ArrayList<>();
    }
    return this.antHardware;
  }

  public boolean isSetAntHardware() {
    return ((this.antHardware != null) && (!this.antHardware.isEmpty()));
  }

  public void unsetAntHardware() {
    this.antHardware = null;
  }

  /**
   * Gets the value of the antMode property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antMode property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntMode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AntMode }
   * <p>
   * <p>
   * @return
   */
  public List<AntMode> getAntMode() {
    if (antMode == null) {
      antMode = new ArrayList<>();
    }
    return this.antMode;
  }

  public boolean isSetAntMode() {
    return ((this.antMode != null) && (!this.antMode.isEmpty()));
  }

  public void unsetAntMode() {
    this.antMode = null;
  }

  public Antenna withGeneric(ListCBO value) {
    setGeneric(new TString(value.value()));
    return this;
  }

  public Antenna withAntType(String value) {
    setAntType(new TString(value));
    return this;
  }

  public Antenna withPhArrayNumMainBeams(Integer value) {
    setPhArrayNumMainBeams(new TInteger(value));
    return this;
  }

  public Antenna withPhArrayNumElements(Integer value) {
    setPhArrayNumElements(new TInteger(value));
    return this;
  }

  public Antenna withShape(String value) {
    setShape(new TString(value));
    return this;
  }

  public Antenna withDiameter(Double value) {
    setDiameter(new TDecimal(value));
    return this;
  }

  public Antenna withHorzDimension(Double value) {
    setHorzDimension(new TDecimal(value));
    return this;
  }

  public Antenna withVertDimension(Double value) {
    setVertDimension(new TDecimal(value));
    return this;
  }

  public Antenna withApertureDiameter(Double value) {
    setApertureDiameter(new TDecimal(value));
    return this;
  }

  public Antenna withHorzAperture(Double value) {
    setHorzAperture(new TDecimal(value));
    return this;
  }

  public Antenna withVertAperture(Double value) {
    setVertAperture(new TDecimal(value));
    return this;
  }

  public Antenna withHorzSidelobeSuppressed(ListCBO value) {
    setHorzSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  public Antenna withHorzSidelobeAz(Double value) {
    setHorzSidelobeAz(new TDecimal(value));
    return this;
  }

  public Antenna withHorzSidelobeAttenuation(Double value) {
    setHorzSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  public Antenna withVertSidelobeSuppressed(ListCBO value) {
    setVertSidelobeSuppressed(new TString(value.value()));
    return this;
  }

  public Antenna withVertSidelobeElev(Double value) {
    setVertSidelobeElev(new TDecimal(value));
    return this;
  }

  public Antenna withVertSidelobeAttenuation(Double value) {
    setVertSidelobeAttenuation(new TDecimal(value));
    return this;
  }

  public Antenna withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Antenna withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  public Antenna withAntHardware(AntHardware... values) {
    if (values != null) {
      getAntHardware().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withAntHardware(Collection<AntHardware> values) {
    if (values != null) {
      getAntHardware().addAll(values);
    }
    return this;
  }

  public Antenna withAntMode(AntMode... values) {
    if (values != null) {
      getAntMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Antenna withAntMode(Collection<AntMode> values) {
    if (values != null) {
      getAntMode().addAll(values);
    }
    return this;
  }

}
