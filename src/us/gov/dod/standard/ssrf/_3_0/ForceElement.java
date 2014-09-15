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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.forceelement.Assets;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;
import us.gov.dod.standard.ssrf._3_0.system.Identifier;
import us.gov.dod.standard.ssrf._3_0.system.StockNum;

/**
 * <p>
 * Java class for ForceElement complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ForceElement"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="ReviewDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="Type"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/> &lt;element name="UIC"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/> &lt;element
 * name="OwningCountry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO"
 * minOccurs="0"/> &lt;element name="OwningOrganisation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 * &lt;element name="Role" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="Platform"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="MissionCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="CmdLevel"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/> &lt;element
 * name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="Identifier"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Identifier" maxOccurs="unbounded"/>
 * &lt;element name="Assets" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Assets"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="StockNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}StockNum" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceElement", propOrder = {
  "reviewDate",
  "type",
  "uic",
  "owningCountry",
  "owningOrganisation",
  "role",
  "platform",
  "missionCode",
  "cmdLevel",
  "pocInformation",
  "identifier",
  "assets",
  "stockNum"
})
public class ForceElement extends Common<ForceElement> {

  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Type", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  @XmlElement(name = "UIC", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString uic;
  @XmlElement(name = "OwningCountry", required = false)
  private TString owningCountry;
  @XmlElement(name = "OwningOrganisation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString owningOrganisation;
  @XmlElement(name = "Role", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString role;
  @XmlElement(name = "Platform", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString platform;
  @XmlElement(name = "MissionCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString missionCode;
  @XmlElement(name = "CmdLevel", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString cmdLevel;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "Identifier", required = true)
  private List<Identifier> identifier;
  @XmlElement(name = "Assets")
  private List<Assets> assets;
  @XmlElement(name = "StockNum")
  private List<StockNum> stockNum;

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return 
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value 
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

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
   * Gets the value of the uic property.
   * <p>
   * @return 
   */
  public TString getUIC() {
    return uic;
  }

  /**
   * Sets the value of the uic property.
   * <p>
   * @param value 
   */
  public void setUIC(TString value) {
    this.uic = value;
  }

  public boolean isSetUIC() {
    return (this.uic != null);
  }

  /**
   * Gets the value of the owningCountry property.
   * <p>
   * @return 
   */
  public TString getOwningCountry() {
    return owningCountry;
  }

  /**
   * Sets the value of the owningCountry property.
   * <p>
   * @param value 
   */
  public void setOwningCountry(TString value) {
    this.owningCountry = value;
  }

  public boolean isSetOwningCountry() {
    return (this.owningCountry != null);
  }

  /**
   * Gets the value of the owningOrganisation property.
   * <p>
   * @return 
   */
  public TString getOwningOrganisation() {
    return owningOrganisation;
  }

  /**
   * Sets the value of the owningOrganisation property.
   * <p>
   * @param value 
   */
  public void setOwningOrganisation(TString value) {
    this.owningOrganisation = value;
  }

  public boolean isSetOwningOrganisation() {
    return (this.owningOrganisation != null);
  }

  /**
   * Gets the value of the role property.
   * <p>
   * @return 
   */
  public TString getRole() {
    return role;
  }

  /**
   * Sets the value of the role property.
   * <p>
   * @param value 
   */
  public void setRole(TString value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Gets the value of the platform property.
   * <p>
   * @return 
   */
  public TString getPlatform() {
    return platform;
  }

  /**
   * Sets the value of the platform property.
   * <p>
   * @param value 
   */
  public void setPlatform(TString value) {
    this.platform = value;
  }

  public boolean isSetPlatform() {
    return (this.platform != null);
  }

  /**
   * Gets the value of the missionCode property.
   * <p>
   * @return 
   */
  public TString getMissionCode() {
    return missionCode;
  }

  /**
   * Sets the value of the missionCode property.
   * <p>
   * @param value 
   */
  public void setMissionCode(TString value) {
    this.missionCode = value;
  }

  public boolean isSetMissionCode() {
    return (this.missionCode != null);
  }

  /**
   * Gets the value of the cmdLevel property.
   * <p>
   * @return 
   */
  public TString getCmdLevel() {
    return cmdLevel;
  }

  /**
   * Sets the value of the cmdLevel property.
   * <p>
   * @param value 
   */
  public void setCmdLevel(TString value) {
    this.cmdLevel = value;
  }

  public boolean isSetCmdLevel() {
    return (this.cmdLevel != null);
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
   * <p>
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
   * Gets the value of the identifier property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the identifier property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIdentifier().add(newItem);
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
  public List<Identifier> getIdentifier() {
    if (identifier == null) {
      identifier = new ArrayList<>();
    }
    return this.identifier;
  }

  public boolean isSetIdentifier() {
    return ((this.identifier != null) && (!this.identifier.isEmpty()));
  }

  public void unsetIdentifier() {
    this.identifier = null;
  }

  /**
   * Gets the value of the assets property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the assets property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAssets().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Assets> getAssets() {
    if (assets == null) {
      assets = new ArrayList<>();
    }
    return this.assets;
  }

  public boolean isSetAssets() {
    return ((this.assets != null) && (!this.assets.isEmpty()));
  }

  public void unsetAssets() {
    this.assets = null;
  }

  /**
   * Gets the value of the stockNum property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stockNum property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStockNum().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new ArrayList<>();
    }
    return this.stockNum;
  }

  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  public void unsetStockNum() {
    this.stockNum = null;
  }

  public ForceElement withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public ForceElement withType(String value) {
    setType(new TString(value));
    return this;
  }

  public ForceElement withUIC(String value) {
    setUIC(new TString(value));
    return this;
  }

  public ForceElement withOwningCountry(ListCAO value) {
    setOwningCountry(new TString(value.value()));
    return this;
  }

  public ForceElement withOwningOrganisation(String value) {
    setOwningOrganisation(new TString(value));
    return this;
  }

  public ForceElement withRole(String value) {
    setRole(new TString(value));
    return this;
  }

  public ForceElement withPlatform(String value) {
    setPlatform(new TString(value));
    return this;
  }

  public ForceElement withMissionCode(String value) {
    setMissionCode(new TString(value));
    return this;
  }

  public ForceElement withCmdLevel(String value) {
    setCmdLevel(new TString(value));
    return this;
  }

  public ForceElement withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public ForceElement withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public ForceElement withIdentifier(Identifier... values) {
    if (values != null) {
      getIdentifier().addAll(Arrays.asList(values));
    }
    return this;
  }

  public ForceElement withIdentifier(Collection<Identifier> values) {
    if (values != null) {
      getIdentifier().addAll(values);
    }
    return this;
  }

  public ForceElement withAssets(Assets... values) {
    if (values != null) {
      getAssets().addAll(Arrays.asList(values));
    }
    return this;
  }

  public ForceElement withAssets(Collection<Assets> values) {
    if (values != null) {
      getAssets().addAll(values);
    }
    return this;
  }

  public ForceElement withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  public ForceElement withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

}
