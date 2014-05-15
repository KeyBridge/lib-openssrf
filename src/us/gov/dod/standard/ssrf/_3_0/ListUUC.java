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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListUUC.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListUUC"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S150"> &lt;enumeration
 * value="Wartime circuits required to be operated or to be ready for operation
 * in Peacetime"/> &lt;enumeration value="Wartime circuits that have a limited
 * capability in peacetime for exchanging traffic between the planned
 * terminals"/> &lt;enumeration value="Required for wartime only"/>
 * &lt;enumeration value="Required for occasional and temporary usage for
 * training exercises or maneuver purposes"/> &lt;enumeration value="Required
 * for the deployment phase of contingency operations"/> &lt;enumeration
 * value="Required for the employment phase of contingency operations"/>
 * &lt;enumeration value="Required for peacetime only"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUUC")
@XmlEnum
public enum ListUUC {

  @XmlEnumValue("Wartime circuits required to be operated or to be ready for operation in Peacetime")
  WARTIME___CIRCUITS___REQUIRED___TO___BE___OPERATED___OR___TO___BE___READY___FOR___OPERATION___IN___PEACETIME("Wartime circuits required to be operated or to be ready for operation in Peacetime"),
  @XmlEnumValue("Wartime circuits that have a limited capability in peacetime for exchanging traffic between the planned terminals")
  WARTIME___CIRCUITS___THAT___HAVE___A___LIMITED___CAPABILITY___IN___PEACETIME___FOR___EXCHANGING___TRAFFIC___BETWEEN___THE___PLANNED___TERMINALS("Wartime circuits that have a limited capability in peacetime for exchanging traffic between the planned terminals"),
  @XmlEnumValue("Required for wartime only")
  REQUIRED___FOR___WARTIME___ONLY("Required for wartime only"),
  @XmlEnumValue("Required for occasional and temporary usage for training exercises or maneuver purposes")
  REQUIRED___FOR___OCCASIONAL___AND___TEMPORARY___USAGE___FOR___TRAINING___EXERCISES___OR___MANEUVER___PURPOSES("Required for occasional and temporary usage for training exercises or maneuver purposes"),
  @XmlEnumValue("Required for the deployment phase of contingency operations")
  REQUIRED___FOR___THE___DEPLOYMENT___PHASE___OF___CONTINGENCY___OPERATIONS("Required for the deployment phase of contingency operations"),
  @XmlEnumValue("Required for the employment phase of contingency operations")
  REQUIRED___FOR___THE___EMPLOYMENT___PHASE___OF___CONTINGENCY___OPERATIONS("Required for the employment phase of contingency operations"),
  @XmlEnumValue("Required for peacetime only")
  REQUIRED___FOR___PEACETIME___ONLY("Required for peacetime only");
  private final String value;

  ListUUC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUUC fromValue(String v) {
    for (ListUUC c : ListUUC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
