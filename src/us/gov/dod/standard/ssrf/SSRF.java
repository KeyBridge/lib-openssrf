/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.*;

/**
 * This is the ROOT element for any SSRF message. It contains all SSRF
 * attributes and content.
 * <p>
 * A SSRF message may contain any number of datasets.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlRootElement(name = "SSRF")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRF")
public class SSRF extends SchemaRoot<SSRF> {

  //<editor-fold defaultstate="collapsed" desc="Property Configuration">
  /**
   * SSRF Properties associated with this SSRF instance.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private SSRFProperties ssrfProperties;

  /**
   * Set the SSRF Properties for this SSRF instance.
   * <p>
   * This method creates a local copy of the input SSRFProperties values. To
   * edit this SSRF instance properties use
   * {@link #setProperty(String, String, String)}
   * <p>
   * Use {@link #setProperty(String, String, String)} to set and update
   * additional properties.
   * <p>
   * @param ssrfProperties a SSRFProperties instance
   * @since 3.1.0
   */
  public void setProperties(SSRFProperties ssrfProperties) {
    this.ssrfProperties = new SSRFProperties();
    this.ssrfProperties.putAll(ssrfProperties);
  }

  /**
   * Set a SSRF property. To unset a property simply set the field value to null
   * or to an empty string "";
   * <p>
   * @param propertyName  A dot-delimited SSRF class and field name (e.g.
   *                      "ChannelPlan.name")
   * @param propertyValue the value to set the SSRF field (e.g. "My Channel
   *                      Plan")
   * @since 3.1.0
   */
  public void setProperty(String propertyName, String propertyValue) {
    if (ssrfProperties == null) {
      ssrfProperties = new SSRFProperties();
    }
    ssrfProperties.setProperty(propertyName, propertyValue);
  }

  /**
   * Unset (clear) a SSRF property.
   * <p>
   * @param propertyName a SSRF property name (e.g. "ChannelPlan.name")
   */
  public void unsetProperty(String propertyName) {
    if (ssrfProperties != null) {
      ssrfProperties.remove(propertyName);
    }
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Export to XML">
  /**
   * Assemble the SSRF instance. This method applies properties and invokes
   * prepare() methods. This method supports the {@link #build()},
   * {@link #isValid()} and {@link #evaluate()} methods.
   * <p>
   * This method does not perform any validation. Call {@link #prepare()} to
   * validate.
   * <p>
   * @since 3.1.0
   */
  private void assemble() {
    if (ssrfProperties != null) {
      SSRFUtility.setProperties(ssrfProperties, this);
    }
    SSRFUtility.prepare(this);
  }

  /**
   * Export this SSRF source instance as an XML document.
   * <p>
   * This method prepares the SSRF object hierarchy, copying all required data
   * objects into their proper location, preparing the SSRF destination instance
   * for export, then marshals the data type into an XML document.
   * <p>
   * If the object instance is NOT valid then call {@link #evaluate(Object)} to
   * re-inspect the SSRF object instance and retrieve a list of specific
   * validation errors.
   * <p>
   * @return This SSRF instance as an XML document
   * @throws Exception If this SSRF configuration fails to validate
   * @since 3.1.0
   */
  public String toXML() throws Exception {
    assemble();
    SSRFUtility.validate(this);
    return SSRFUtility.marshal(this);
  }

  /**
   * Validate a SSRF Object instance.
   * <p>
   * This method recursively validates the provided object instance and all of
   * its components. The validation procedure ensures that all required fields
   * are set and that all configured fields contain valid data according to the
   * SSRF data formatting rules.
   * <p>
   * It is expected that this method will only be called on the top-level SSRF
   * class. However it will just as easily validate any SSRF data type.
   * <p>
   * If the object instance is NOT valid then call {@link #evaluate(Object)} to
   * re-inspect the SSRF object instance and retrieve a list of specific
   * validation errors.
   * <p>
   * @return TRUE the object instance validates OK; otherwise FALSE.
   * @since 3.1.0
   */
  public boolean isValid() {
    try {
      /**
       * Call assemble() twice to add parameters and then to add metadata (if
       * configured) to those parameters.
       */
      assemble();
      SSRFUtility.validate(this);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  /**
   * Evaluate a SSRF Object instance; record and report any configuration
   * errors.
   * <p>
   * This method recursively validates the provided object instance and all of
   * its components. The validation procedure ensures that all required fields
   * are set and that all configured fields contain valid data according to the
   * SSRF data formatting rules.
   * <p>
   * If the SSRF object instance does not validate OK then each specific
   * validation error condition is recorded and returned.
   * <p>
   * It is expected that this method will only be called on the top-level SSRF
   * class. However it will just as easily validate any SSRF data type.
   * <p>
   * @return a non-null Collection of error messages. The collection is EMPTY if
   *         the object instance validates OK.
   * @since 3.1.0
   */
  public Set<String> evaluate() {
    assemble();
    return SSRFUtility.evaluate(this);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Import from XML">
  /**
   * Standard method to get a fully qualified class instance.
   * <p>
   * This is a shortcut to {@link #fromXml(String)}
   * <p>
   * @param xml A SSRF XML document
   * @return A SSRF software object instance
   * @throws Exception If this SSRF XML document fails to unmarshal; typically
   *                   because the document is invalid or incomplete
   */
  public static SSRF getInstance(String xml) throws Exception {
    return fromXml(xml);
  }

  /**
   * Parse an import an XMl document into a SSRF object hierarchy.
   * <p>
   * This method reads and attempts to unmarshal a XML document into a SSRF
   * software object tree. If successful the SSRF software instance is prepared
   * for use, copying all required data objects into their proper location.
   * <p>
   * After reading the XML this method examines the class tree and copies all
   * required data objects into their proper location and preparing the SSRF
   * software class hierarchy for work.
   * <p>
   * @param xml A SSRF XML document
   * @return A SSRF software object instance
   * @throws Exception If this SSRF XML document fails to unmarshal; typically
   *                   because the document is invalid or incomplete
   */
  public static SSRF fromXml(String xml) throws Exception {
    SSRF ssrf = SSRFUtility.unmarshal(xml, SSRF.class);
    SSRFUtility.postLoad(ssrf);
    return ssrf;
  }//</editor-fold>

}
