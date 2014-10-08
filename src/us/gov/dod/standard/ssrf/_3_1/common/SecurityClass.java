/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.common;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * SecurityClass (US) contains the security classification from one or more data
 * information sources.
 * <p>
 * Element of {@link Common}
 * <p>
 * Sub-Elements are {@link ClsDerived}, {@link Downgrade}
 * <p>
 * Example:
 * <pre>
 * &lt;Security Class&gt;
 *   &lt;ClsAuthority  cls="U"&gt;DOD Spectrum Data Admin&lt;/ClsAuthority &gt;
 *   &lt;ClsOrg  cls="U"&gt;DSO&lt;/ClsOrg &gt;
 *   &lt;ClsReason  cls="U"&gt;A G&lt;/ClsReason &gt;
 *   &lt;DeclsDate  cls="U"&gt;2014-12-31&lt;/DeclsDate &gt;
 *   &lt;DeclsEvent  cls="U"&gt;DECLASSIFY AFTER MISSILE LAUNCH&lt;/DeclsEvent &gt;
 *   &lt;DeclsType  cls="U"&gt;DE25X2&lt;/DeclsType &gt;
 *   &lt;SourceClsDate  cls="U"&gt;2011-10-19&lt;/SourceClsDate &gt;
 * &lt;/Security Class&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClass", propOrder = {
  "clsAuthority",
  "sourceClsDate",
  "clsOrg",
  "clsReason",
  "declsType",
  "declsDate",
  "declsEvent",
  "downgrade",
  "clsDerived"
})
public class SecurityClass {

  /**
   * US:ClsAuthority - Original Classification Authority (Optional)
   * <p>
   * The identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "ClsAuthority", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString clsAuthority;
  /**
   * US:SourceClsDate - Source Classification Date (Optional)
   * <p>
   * The date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "SourceClsDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar sourceClsDate;
  /**
   * US:ClsOrg - Original Classification Authority Organizatio (Optional)
   * <p>
   * The organization of the original classification authority.
   * <p>
   * Format is S30
   */
  @XmlElement(name = "ClsOrg", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS30.class)
  private TString clsOrg;
  /**
   * US:ClsReason - Reason for Classification (Optional)
   * <p>
   * The reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * Format is S15
   */
  @XmlElement(name = "ClsReason", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS15.class)
  private TString clsReason;
  /**
   * US:DeclsType - Declassification Instructions (Optional)
   * <p>
   * The declassification instructions of the dataset. Refer to the appropriate
   * classification authority(s) for more information about this field.
   * <p>
   * Format is S10
   */
  @XmlElement(name = "DeclsType", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS10.class)
  private TString declsType;
  /**
   * US:DeclsDate - Declassification Date (Optional)
   * <p>
   * The declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "DeclsDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar declsDate;
  /**
   * US:DeclsEvent - Declassification Event (Optional)
   * <p>
   * The declassification event, when necessary based on the declassification
   * instructions.
   * <p>
   * Format is S200
   */
  @XmlElement(name = "DeclsEvent", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS200.class)
  private TString declsEvent;
  /**
   * US:Downgrade (Optional)
   * <p>
   * Downgrade (US) contains the downgrade security classification from one or
   * more data information sources.
   */
  @XmlElement(name = "Downgrade")
  private Set<Downgrade> downgrade;
  /**
   * US:ClsDerived (Optional)
   * <p>
   * ClsDerived (US) contains the derived security classification from one or
   * more data information sources.
   */
  @XmlElement(name = "ClsDerived")
  private Set<ClsDerived> clsDerived;

  /**
   * Get the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @return the ClsAuthority value in a {@link TString} data type
   */
  public TString getClsAuthority() {
    return clsAuthority;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @param value the ClsAuthority value in a {@link TString} data type
   */
  public void setClsAuthority(TString value) {
    this.clsAuthority = value;
  }

  /**
   * Determine if the ClsAuthority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsAuthority() {
    return (this.clsAuthority != null ? this.clsAuthority.isSetValue() : false);
  }

  /**
   * Get the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @return the SourceClsDate value in a {@link TCalendar} data type
   */
  public TCalendar getSourceClsDate() {
    return sourceClsDate;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value the SourceClsDate value in a {@link TCalendar} data type
   */
  public void setSourceClsDate(TCalendar value) {
    this.sourceClsDate = value;
  }

  /**
   * Determine if the SourceClsDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceClsDate() {
    return (this.sourceClsDate != null ? this.sourceClsDate.isSetValue() : false);
  }

  /**
   * Get the organization of the original classification authority.
   * <p>
   * @return the ClsOrg value in a {@link TString} data type
   */
  public TString getClsOrg() {
    return clsOrg;
  }

  /**
   * Set the organization of the original classification authority.
   * <p>
   * @param value the ClsOrg value in a {@link TString} data type
   */
  public void setClsOrg(TString value) {
    this.clsOrg = value;
  }

  /**
   * Determine if the ClsOrg is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsOrg() {
    return (this.clsOrg != null ? this.clsOrg.isSetValue() : false);
  }

  /**
   * Get the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @return the ClsReason value in a {@link TString} data type
   */
  public TString getClsReason() {
    return clsReason;
  }

  /**
   * Set the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @param value the ClsReason value in a {@link TString} data type
   */
  public void setClsReason(TString value) {
    this.clsReason = value;
  }

  /**
   * Determine if the ClsReason is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsReason() {
    return (this.clsReason != null ? this.clsReason.isSetValue() : false);
  }

  /**
   * Get the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @return the DeclsType value in a {@link TString} data type
   */
  public TString getDeclsType() {
    return declsType;
  }

  /**
   * Set the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @param value the DeclsType value in a {@link TString} data type
   */
  public void setDeclsType(TString value) {
    this.declsType = value;
  }

  /**
   * Determine if the DeclsType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsType() {
    return (this.declsType != null ? this.declsType.isSetValue() : false);
  }

  /**
   * Get the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @return the DeclsDate value in a {@link TCalendar} data type
   */
  public TCalendar getDeclsDate() {
    return declsDate;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value the DeclsDate value in a {@link TCalendar} data type
   */
  public void setDeclsDate(TCalendar value) {
    this.declsDate = value;
  }

  /**
   * Determine if the DeclsDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsDate() {
    return (this.declsDate != null ? this.declsDate.isSetValue() : false);
  }

  /**
   * Get the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @return the DeclsEvent value in a {@link TString} data type
   */
  public TString getDeclsEvent() {
    return declsEvent;
  }

  /**
   * Set the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @param value the DeclsEvent value in a {@link TString} data type
   */
  public void setDeclsEvent(TString value) {
    this.declsEvent = value;
  }

  /**
   * Determine if the DeclsEvent is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDeclsEvent() {
    return (this.declsEvent != null ? this.declsEvent.isSetValue() : false);
  }

  /**
   * Get the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @return a non-null but possibly empty list of {@link Downgrade} instances
   */
  public Set<Downgrade> getDowngrade() {
    if (downgrade == null) {
      downgrade = new HashSet<>();
    }
    return this.downgrade;
  }

  /**
   * Determine if the Downgrade is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDowngrade() {
    return ((this.downgrade != null) && (!this.downgrade.isEmpty()));
  }

  /**
   * Clear the Downgrade field. This sets the field to null.
   */
  public void unsetDowngrade() {
    this.downgrade = null;
  }

  /**
   * Get the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @return a non-null but possibly empty list of {@link ClsDerived} instances
   */
  public Set<ClsDerived> getClsDerived() {
    if (clsDerived == null) {
      clsDerived = new HashSet<>();
    }
    return this.clsDerived;
  }

  /**
   * Determine if the ClsDerived is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetClsDerived() {
    return ((this.clsDerived != null) && (!this.clsDerived.isEmpty()));
  }

  /**
   * Clear the ClsDerived field. This sets the field to null.
   */
  public void unsetClsDerived() {
    this.clsDerived = null;
  }

  /**
   * Set the identity, by name and position, or by personal identifier, of the
   * original classification authority.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withClsAuthority(String value) {
    setClsAuthority(new TString(value));
    return this;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withSourceClsDate(Calendar value) {
    setSourceClsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date this classified dataset was prepared, i.e., the Original
   * Classification Date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withSourceClsDate(Date value) {
    setSourceClsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the organization of the original classification authority.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withClsOrg(String value) {
    setClsOrg(new TString(value));
    return this;
  }

  /**
   * Set the reason(s) for the classification. This field contains one or more
   * letters, separated by spaces, from the following list. (a) military plans,
   * weapons systems, or operations; (b) foreign government information; (c)
   * intelligence activities (including covert action), intelligence sources or
   * methods, or cryptology; (d) foreign relations or foreign activities of the
   * United States, including confidential sources; (e) scientific,
   * technological, or economic matters relating to the national security; (f)
   * United States Government programs for safeguarding nuclear materials or
   * facilities; (g) vulnerabilities or capabilities of systems, installations,
   * infrastructures, projects, plans, or protection services relating to the
   * national security; or (h) the development, production, or use of weapons of
   * mass destruction.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withClsReason(String value) {
    setClsReason(new TString(value));
    return this;
  }

  /**
   * Set the declassification instructions of the dataset. Refer to the
   * appropriate classification authority(s) for more information about this
   * field.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDeclsType(String value) {
    setDeclsType(new TString(value));
    return this;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDeclsDate(Calendar value) {
    setDeclsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the declassification date for DEDATE and DE25Xn-based declassification
   * instructions.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDeclsDate(Date value) {
    setDeclsDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the declassification event, when necessary based on the
   * declassification instructions.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDeclsEvent(String value) {
    setDeclsEvent(new TString(value));
    return this;
  }

  /**
   * Set the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @param values One or more instances of type {@link Downgrade}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDowngrade(Downgrade... values) {
    if (values != null) {
      getDowngrade().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:Downgrade
   * <p>
   * Complex element Downgrade (US) contains the downgrade security
   * classification from one or more data information sources.
   * <p>
   * @param values A collection of {@link Downgrade} instances
   * @return The current SecurityClass object instance
   */
  public SecurityClass withDowngrade(Set<Downgrade> values) {
    if (values != null) {
      getDowngrade().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @param values One or more instances of type {@link ClsDerived}
   * @return The current SecurityClass object instance
   */
  public SecurityClass withClsDerived(ClsDerived... values) {
    if (values != null) {
      getClsDerived().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:ClsDerived
   * <p>
   * Complex element ClsDerived (US) contains the derived security
   * classification from one or more data information sources.
   * <p>
   * @param values A collection of {@link ClsDerived} instances
   * @return The current SecurityClass object instance
   */
  public SecurityClass withClsDerived(Set<ClsDerived> values) {
    if (values != null) {
      getClsDerived().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this SecurityClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SecurityClass {"
      + (clsAuthority != null ? " clsAuthority [" + clsAuthority + "]" : "")
      + (clsReason != null ? " clsReason [" + clsReason + "]" : "")
      + (sourceClsDate != null ? " sourceClsDate [" + sourceClsDate + "]" : "")
      + (clsOrg != null ? " clsOrg [" + clsOrg + "]" : "")
      + (clsDerived != null ? " clsDerived [" + clsDerived + "]" : "")
      + (declsEvent != null ? " declsEvent [" + declsEvent + "]" : "")
      + (declsDate != null ? " declsDate [" + declsDate + "]" : "")
      + (downgrade != null ? " downgrade [" + downgrade + "]" : "")
      + (declsType != null ? " declsType [" + declsType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SecurityClass} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
