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

/**
 * Enumerated list of serial number data types.
 * <p>
 * This class contains the codes that MUST be used as the third part of the
 * Serial of each dataset corresponding to each class type.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/29/2014
 */
public enum ESerialType {

  AD("Administrative"),
  AL("Allotment"),
  AN("Antenna"),
  AS("Assignment"),
  CP("ChannelPlan"),
  CN("Contact"),
  EX("ExternalReference"),
  FD("FEDeployment"),
  FE("ForceElement"),
  IF("IntfReport"),
  JR("JRFL"),
  LO("Location"),
  NT("Note"),
  OR("Organisation"),
  RX("Receiver"),
  TR("RFSystem"),
  JA("Role"),
  SA("Satellite"),
  HD("SSReply"),
  SR("SSRequest"),
  TA("TOA"),
  TX("Transmitter");
  /**
   * The class type simple name.
   */
  private final String classSimpleName;

  private ESerialType(String classType) {
    this.classSimpleName = classType;
  }

  /**
   * Get a serial number data type from an object instance. This method is used
   * within the {@link Common} constructor to automatically build a serial
   * number.
   * <p>
   * @param instance the object instance
   * @return the serial number data type code
   */
  public static String fromInstance(Object instance) {
    return fromInstance(instance.getClass());
  }

  /**
   * Get a serial number data type from an object instance. This method is used
   * within the {@link Common} constructor to automatically build a serial
   * number.
   * <p>
   * @param clazz the object instance class type
   * @return the serial number data type code
   */
  public static String fromInstance(Class clazz) {

    for (ESerialType type : ESerialType.values()) {
      if (clazz.getSimpleName().equals(type.getClassSimpleName())) {
        return type.name();
      }
    }
    return null;
  }

  /**
   * Get the class type simple name
   * <p>
   * @return the class type simple name. e.g. an Allotment instance will return
   *         "Allotment"
   */
  public String getClassSimpleName() {
    return classSimpleName;
  }

}
