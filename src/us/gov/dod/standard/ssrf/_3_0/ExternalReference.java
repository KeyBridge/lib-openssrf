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

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_0.lists.ListCSG;

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
public class ExternalReference extends Common {

  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString type;
  @XmlElement(name = "Date", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  @XmlElement(name = "Identifier", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString identifier;
  @XmlElement(name = "AlternateIdentifier", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString alternateIdentifier;
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString title;
  @XmlElement(name = "Author", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString author;
  @XmlElement(name = "Organisation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString organisation;
  @XmlElement(name = "DocumentCls", required = false)
  private TString documentCls;
  @XmlElement(name = "ResourceLocator", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString resourceLocator;
  @XmlElement(name = "IsAttached", required = true)
  private TString isAttached;
  @XmlElement(name = "IsClassified", required = false)
  private TString isClassified;
  @XmlElement(name = "ReferencedStage", required = false)
  private TString referencedStage;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the date property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  public boolean isSetDate() {
    return (this.date != null);
  }

  /**
   * Gets the value of the identifier property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  public boolean isSetIdentifier() {
    return (this.identifier != null);
  }

  /**
   * Gets the value of the alternateIdentifier property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getAlternateIdentifier() {
    return alternateIdentifier;
  }

  /**
   * Sets the value of the alternateIdentifier property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAlternateIdentifier(TString value) {
    this.alternateIdentifier = value;
  }

  public boolean isSetAlternateIdentifier() {
    return (this.alternateIdentifier != null);
  }

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the author property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getAuthor() {
    return author;
  }

  /**
   * Sets the value of the author property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAuthor(TString value) {
    this.author = value;
  }

  public boolean isSetAuthor() {
    return (this.author != null);
  }

  /**
   * Gets the value of the organisation property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getOrganisation() {
    return organisation;
  }

  /**
   * Sets the value of the organisation property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setOrganisation(TString value) {
    this.organisation = value;
  }

  public boolean isSetOrganisation() {
    return (this.organisation != null);
  }

  /**
   * Gets the value of the documentCls property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDocumentCls() {
    return documentCls;
  }

  /**
   * Sets the value of the documentCls property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDocumentCls(TString value) {
    this.documentCls = value;
  }

  public boolean isSetDocumentCls() {
    return (this.documentCls != null);
  }

  /**
   * Gets the value of the resourceLocator property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getResourceLocator() {
    return resourceLocator;
  }

  /**
   * Sets the value of the resourceLocator property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setResourceLocator(TString value) {
    this.resourceLocator = value;
  }

  public boolean isSetResourceLocator() {
    return (this.resourceLocator != null);
  }

  /**
   * Gets the value of the isAttached property.
   * <p>
   * @return 
   */
  public TString getIsAttached() {
    return isAttached;
  }

  /**
   * Sets the value of the isAttached property.
   * <p>
   * @param value 
   */
  public void setIsAttached(TString value) {
    this.isAttached = value;
  }

  public boolean isSetIsAttached() {
    return (this.isAttached != null);
  }

  /**
   * Gets the value of the isClassified property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getIsClassified() {
    return isClassified;
  }

  /**
   * Sets the value of the isClassified property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIsClassified(TString value) {
    this.isClassified = value;
  }

  public boolean isSetIsClassified() {
    return (this.isClassified != null);
  }

  /**
   * Gets the value of the referencedStage property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getReferencedStage() {
    return referencedStage;
  }

  /**
   * Sets the value of the referencedStage property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setReferencedStage(TString value) {
    this.referencedStage = value;
  }

  public boolean isSetReferencedStage() {
    return (this.referencedStage != null);
  }

  public ExternalReference withType(String value) {
    setType(new TString(value));
    return this;
  }

  public ExternalReference withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  public ExternalReference withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

  public ExternalReference withAlternateIdentifier(String value) {
    setAlternateIdentifier(new TString(value));
    return this;
  }

  public ExternalReference withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public ExternalReference withAuthor(String value) {
    setAuthor(new TString(value));
    return this;
  }

  public ExternalReference withOrganisation(String value) {
    setOrganisation(new TString(value));
    return this;
  }

  public ExternalReference withDocumentCls(ListCCL value) {
    setDocumentCls(new TString(value.value()));
    return this;
  }

  public ExternalReference withResourceLocator(String value) {
    setResourceLocator(new TString(value));
    return this;
  }

  public ExternalReference withIsAttached(ListCBO value) {
    setIsAttached(new TString(value.value()));
    return this;
  }

  public ExternalReference withIsClassified(ListCBO value) {
    setIsClassified(new TString(value.value()));
    return this;
  }

  public ExternalReference withReferencedStage(ListCSG value) {
    setReferencedStage(new TString(value.value()));
    return this;
  }

}
