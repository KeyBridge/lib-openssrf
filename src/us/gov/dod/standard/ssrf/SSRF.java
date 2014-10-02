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

import java.util.Collection;
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

  /**
   * Validate a SSRF Object instance.
   * <p>
   * This method recursively validates the SSRF instance and all of its
   * components.
   * <p>
   * The validation procedure ensures that all required fields are set and that
   * all configured fields contain valid data according to the SSRF data
   * formatting rules.
   * <p>
   * If the object instance is NOT valid call
   * {@link #getErrorMessages(java.lang.Object)} to retrieve a list of
   * validation errors.
   * <p>
   * @return TRUE the SSRF instance is valid; otherwise FALSE.
   */
  public boolean isValid() {
    return SSRFUtility.isValid(this);
  }

  /**
   * Validate a SSRF Object instance.
   * <p>
   * This method recursively validates the SSRF instance and all of its
   * components.
   * <p>
   * The validation procedure ensures that all required fields are set and that
   * all configured fields contain valid data according to the SSRF data
   * formatting rules.
   * <p>
   * @return a non-null Collection of error messages. The collection is EMPTY if
   *         the object instance validates OK.
   */
  public Collection<String> getErrorMessages() {
    return SSRFUtility.getErrorMessages(this);
  }

}
