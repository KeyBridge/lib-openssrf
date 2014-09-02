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

import us.gov.dod.standard.ssrf._3_0.datatype.TListCCL;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TS255;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSG;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for ExternalReference complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ExternalReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="Date" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="AlternateIdentifier" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="Author" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="DocumentCls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL" minOccurs="0"/>
 *         &lt;element name="ResourceLocator" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="IsAttached" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/>
 *         &lt;element name="IsClassified" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="ReferencedStage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCSG" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReference", propOrder = {
  "type",
  "date",
  "identifier",
  "alternateIdentifier",
  "title",
  "author",
  "organisation",
  "documentCls",
  "resourceLocator",
  "isAttached",
  "isClassified",
  "referencedStage"
})
public class ExternalReference
  extends Common {

  @XmlElementRef(name = "Type", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> type;
  @XmlElementRef(name = "Date", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> date;
  @XmlElementRef(name = "Identifier", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> identifier;
  @XmlElementRef(name = "AlternateIdentifier", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> alternateIdentifier;
  @XmlElementRef(name = "Title", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> title;
  @XmlElementRef(name = "Author", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> author;
  @XmlElementRef(name = "Organisation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> organisation;
  @XmlElementRef(name = "DocumentCls", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCCL> documentCls;
  @XmlElementRef(name = "ResourceLocator", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> resourceLocator;
  @XmlElement(name = "IsAttached", required = true)
  protected TListCBO isAttached;
  @XmlElementRef(name = "IsClassified", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> isClassified;
  @XmlElementRef(name = "ReferencedStage", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCSG> referencedStage;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setType(JAXBElement<TS50> value) {
    this.type = value;
  }

  /**
   * Gets the value of the date property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDate(JAXBElement<TD> value) {
    this.date = value;
  }

  /**
   * Gets the value of the identifier property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setIdentifier(JAXBElement<TS50> value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the alternateIdentifier property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getAlternateIdentifier() {
    return alternateIdentifier;
  }

  /**
   * Sets the value of the alternateIdentifier property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setAlternateIdentifier(JAXBElement<TS50> value) {
    this.alternateIdentifier = value;
  }

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setTitle(JAXBElement<TS255> value) {
    this.title = value;
  }

  /**
   * Gets the value of the author property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getAuthor() {
    return author;
  }

  /**
   * Sets the value of the author property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setAuthor(JAXBElement<TS255> value) {
    this.author = value;
  }

  /**
   * Gets the value of the organisation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getOrganisation() {
    return organisation;
  }

  /**
   * Sets the value of the organisation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setOrganisation(JAXBElement<TS50> value) {
    this.organisation = value;
  }

  /**
   * Gets the value of the documentCls property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCCL }{@code >}
   * <p>
   */
  public JAXBElement<TListCCL> getDocumentCls() {
    return documentCls;
  }

  /**
   * Sets the value of the documentCls property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCCL }{@code >}
   * <p>
   */
  public void setDocumentCls(JAXBElement<TListCCL> value) {
    this.documentCls = value;
  }

  /**
   * Gets the value of the resourceLocator property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getResourceLocator() {
    return resourceLocator;
  }

  /**
   * Sets the value of the resourceLocator property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setResourceLocator(JAXBElement<TS255> value) {
    this.resourceLocator = value;
  }

  /**
   * Gets the value of the isAttached property.
   * <p>
   * @return possible object is {@link TListCBO }
   * <p>
   */
  public TListCBO getIsAttached() {
    return isAttached;
  }

  /**
   * Sets the value of the isAttached property.
   * <p>
   * @param value allowed object is {@link TListCBO }
   * <p>
   */
  public void setIsAttached(TListCBO value) {
    this.isAttached = value;
  }

  /**
   * Gets the value of the isClassified property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getIsClassified() {
    return isClassified;
  }

  /**
   * Sets the value of the isClassified property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setIsClassified(JAXBElement<TListCBO> value) {
    this.isClassified = value;
  }

  /**
   * Gets the value of the referencedStage property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCSG }{@code >}
   * <p>
   */
  public JAXBElement<TListCSG> getReferencedStage() {
    return referencedStage;
  }

  /**
   * Sets the value of the referencedStage property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCSG }{@code >}
   * <p>
   */
  public void setReferencedStage(JAXBElement<TListCSG> value) {
    this.referencedStage = value;
  }

}
