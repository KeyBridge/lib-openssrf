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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlRootElement(name = "SSRF")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRF")
public class SSRF extends SchemaRoot<SSRF> {

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
   * @param propertyName the SSRF class name (e.g. "ChannelPlan")
   * @param fieldName    the SSRF field name within the named class (e.g.
   *                     "name"). Set to null or an empty string to unset all
   *                     properties with the indicated className.
   */
  public void unsetProperty(String propertyName) {
    if (ssrfProperties != null) {
      ssrfProperties.remove(propertyName);
    }
  }

  /**
   * Internal method to assemble the SSRF instance. This method applies
   * properties and invokes build methods. This method supports the {@link #build()},
   * {@link #isValid()} and {@link #evaluate()} methods.
   * <p>
   * @since 3.1.0
   */
  private void assemble() {
    SSRFUtility.build(this);
    if (ssrfProperties != null) {
      SSRFUtility.setProperties(ssrfProperties, this);
    }
  }

  /**
   * Process this SSRF source instance for export.
   * <p>
   * This method makes a copy of the source instance configuration, copying all
   * required data objects into their proper location and preparing the SSRF
   * destination instance for export.
   * <p>
   * If the object instance is NOT valid then call {@link #evaluate(Object)} to
   * re-inspect the SSRF object instance and retrieve a list of specific
   * validation errors.
   * <p>
   * @throws Exception If this SSRF configuration fails to validate
   * @since 3.1.0
   */
  public void prepare() throws Exception {
    assemble();
    assemble();
    SSRFUtility.validate(this);
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
      assemble();
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
  }
}
