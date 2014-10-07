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

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;

/**
 * This is the ROOT element for any SSRF message. It contains all SSRF
 * attributes and content.
 * <p>
 * A SSRF message may contain any number of datasets.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/29/2014
 */
@XmlRootElement(name = "SSRF")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRF")
public class SSRF extends SchemaRoot<SSRF> {

  public void loadProperties(File propertiesFile) throws IOException {
//    Preferences prefs = Preferences.systemNodeForPackage(SSRF.class);
    Preferences prefs = Preferences.userRoot();
    Properties properties = new Properties();
    properties.load(new FileReader(propertiesFile));
    for (Map.Entry<Object, Object> entry : properties.entrySet()) {
      prefs.put((String) entry.getKey(), (String) entry.getValue());
    }
  }

  public void foo() {
    Preferences prefs = Preferences.userRoot();
    System.out.println("SSRF PREFS ");
    try {
      for (String string : prefs.keys()) {
        System.out.println("pref [" + string + "] , [" + prefs.get(string, "") + "]");
      }
    } catch (BackingStoreException ex) {
      Logger.getLogger(SSRF.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Process this SSRF source instance for export.
   * <p>
   * This method makes a copy of the source instance configuration, copying all
   * required data objects into their proper location and preparing the SSRF
   * destination instance for export.
   * <p>
   * @return a copy of the current SSRF instance, prepared for export
   */
  public SSRF build() {
    return SSRFUtility.build(this);
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
   * If the object instance is NOT valid then call
   * {@link #evaluate(java.lang.Object)} to re-inspect the SSRF object instance
   * and retrieve a list of specific validation errors.
   * <p>
   * @return TRUE the object instance validates OK; otherwise FALSE.
   */
  public boolean validate() {
    try {
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
   */
  public Collection<String> evaluate() {
    return SSRFUtility.evaluate(this);
  }

}
