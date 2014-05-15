/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
 * &lt;complexType name="Antenna">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Generic" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/>
 *         &lt;element name="AntType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="PhArrayNumMainBeams" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN3" minOccurs="0"/>
 *         &lt;element name="PhArrayNumElements" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Dimension" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Aperture" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Sidelobe" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Nomenclature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntHardware" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntHardware" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntMode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntMode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
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
public class Antenna
  extends Common {

  @XmlElement(name = "Generic", required = true)
  protected TListCBO generic;
  @XmlElement(name = "AntType", required = true)
  protected TS50 antType;
  @XmlElementRef(name = "PhArrayNumMainBeams", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN3> phArrayNumMainBeams;
  @XmlElementRef(name = "PhArrayNumElements", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5> phArrayNumElements;
  @XmlElementRef(name = "Shape", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> shape;
  @XmlElementRef(name = "Diameter", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> diameter;
  @XmlElementRef(name = "HorzDimension", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> horzDimension;
  @XmlElementRef(name = "VertDimension", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> vertDimension;
  @XmlElementRef(name = "ApertureDiameter", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> apertureDiameter;
  @XmlElementRef(name = "HorzAperture", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> horzAperture;
  @XmlElementRef(name = "VertAperture", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6_2> vertAperture;
  @XmlElementRef(name = "HorzSidelobeSuppressed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> horzSidelobeSuppressed;
  @XmlElementRef(name = "HorzSidelobeAz", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz180> horzSidelobeAz;
  @XmlElementRef(name = "HorzSidelobeAttenuation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_2> horzSidelobeAttenuation;
  @XmlElementRef(name = "VertSidelobeSuppressed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> vertSidelobeSuppressed;
  @XmlElementRef(name = "VertSidelobeElev", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev180> vertSidelobeElev;
  @XmlElementRef(name = "VertSidelobeAttenuation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5_2> vertSidelobeAttenuation;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "Nomenclature")
  protected List<Nomenclature> nomenclature;
  @XmlElement(name = "AntHardware")
  protected List<AntHardware> antHardware;
  @XmlElement(name = "AntMode")
  protected List<AntMode> antMode;

  /**
   * Gets the value of the generic property.
   * <p>
   * @return possible object is {@link TListCBO }
   * <p>
   */
  public TListCBO getGeneric() {
    return generic;
  }

  /**
   * Sets the value of the generic property.
   * <p>
   * @param value allowed object is {@link TListCBO }
   * <p>
   */
  public void setGeneric(TListCBO value) {
    this.generic = value;
  }

  /**
   * Gets the value of the antType property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getAntType() {
    return antType;
  }

  /**
   * Sets the value of the antType property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setAntType(TS50 value) {
    this.antType = value;
  }

  /**
   * Gets the value of the phArrayNumMainBeams property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN3> getPhArrayNumMainBeams() {
    return phArrayNumMainBeams;
  }

  /**
   * Sets the value of the phArrayNumMainBeams property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN3 }{@code >}
   * <p>
   */
  public void setPhArrayNumMainBeams(JAXBElement<TUN3> value) {
    this.phArrayNumMainBeams = value;
  }

  /**
   * Gets the value of the phArrayNumElements property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5> getPhArrayNumElements() {
    return phArrayNumElements;
  }

  /**
   * Sets the value of the phArrayNumElements property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setPhArrayNumElements(JAXBElement<TUN5> value) {
    this.phArrayNumElements = value;
  }

  /**
   * Gets the value of the shape property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getShape() {
    return shape;
  }

  /**
   * Sets the value of the shape property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setShape(JAXBElement<TS25> value) {
    this.shape = value;
  }

  /**
   * Gets the value of the diameter property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getDiameter() {
    return diameter;
  }

  /**
   * Sets the value of the diameter property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setDiameter(JAXBElement<TUN6_2> value) {
    this.diameter = value;
  }

  /**
   * Gets the value of the horzDimension property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getHorzDimension() {
    return horzDimension;
  }

  /**
   * Sets the value of the horzDimension property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setHorzDimension(JAXBElement<TUN6_2> value) {
    this.horzDimension = value;
  }

  /**
   * Gets the value of the vertDimension property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getVertDimension() {
    return vertDimension;
  }

  /**
   * Sets the value of the vertDimension property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setVertDimension(JAXBElement<TUN6_2> value) {
    this.vertDimension = value;
  }

  /**
   * Gets the value of the apertureDiameter property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getApertureDiameter() {
    return apertureDiameter;
  }

  /**
   * Sets the value of the apertureDiameter property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setApertureDiameter(JAXBElement<TUN6_2> value) {
    this.apertureDiameter = value;
  }

  /**
   * Gets the value of the horzAperture property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getHorzAperture() {
    return horzAperture;
  }

  /**
   * Sets the value of the horzAperture property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setHorzAperture(JAXBElement<TUN6_2> value) {
    this.horzAperture = value;
  }

  /**
   * Gets the value of the vertAperture property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6_2> getVertAperture() {
    return vertAperture;
  }

  /**
   * Sets the value of the vertAperture property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}
   * <p>
   */
  public void setVertAperture(JAXBElement<TUN6_2> value) {
    this.vertAperture = value;
  }

  /**
   * Gets the value of the horzSidelobeSuppressed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getHorzSidelobeSuppressed() {
    return horzSidelobeSuppressed;
  }

  /**
   * Sets the value of the horzSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setHorzSidelobeSuppressed(JAXBElement<TListCBO> value) {
    this.horzSidelobeSuppressed = value;
  }

  /**
   * Gets the value of the horzSidelobeAz property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public JAXBElement<TAz180> getHorzSidelobeAz() {
    return horzSidelobeAz;
  }

  /**
   * Sets the value of the horzSidelobeAz property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public void setHorzSidelobeAz(JAXBElement<TAz180> value) {
    this.horzSidelobeAz = value;
  }

  /**
   * Gets the value of the horzSidelobeAttenuation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_2> getHorzSidelobeAttenuation() {
    return horzSidelobeAttenuation;
  }

  /**
   * Sets the value of the horzSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setHorzSidelobeAttenuation(JAXBElement<TUN5_2> value) {
    this.horzSidelobeAttenuation = value;
  }

  /**
   * Gets the value of the vertSidelobeSuppressed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getVertSidelobeSuppressed() {
    return vertSidelobeSuppressed;
  }

  /**
   * Sets the value of the vertSidelobeSuppressed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setVertSidelobeSuppressed(JAXBElement<TListCBO> value) {
    this.vertSidelobeSuppressed = value;
  }

  /**
   * Gets the value of the vertSidelobeElev property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev180 }{@code >}
   * <p>
   */
  public JAXBElement<TElev180> getVertSidelobeElev() {
    return vertSidelobeElev;
  }

  /**
   * Sets the value of the vertSidelobeElev property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev180 }{@code >}
   * <p>
   */
  public void setVertSidelobeElev(JAXBElement<TElev180> value) {
    this.vertSidelobeElev = value;
  }

  /**
   * Gets the value of the vertSidelobeAttenuation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5_2> getVertSidelobeAttenuation() {
    return vertSidelobeAttenuation;
  }

  /**
   * Sets the value of the vertSidelobeAttenuation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setVertSidelobeAttenuation(JAXBElement<TUN5_2> value) {
    this.vertSidelobeAttenuation = value;
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
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
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
   */
  public List<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new ArrayList<>();
    }
    return this.nomenclature;
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
   */
  public List<AntHardware> getAntHardware() {
    if (antHardware == null) {
      antHardware = new ArrayList<>();
    }
    return this.antHardware;
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
   */
  public List<AntMode> getAntMode() {
    if (antMode == null) {
      antMode = new ArrayList<>();
    }
    return this.antMode;
  }

}
