/*
 * Copyright 2015 Key Bridge LLC.
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

import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Serial;

/**
 * Enumerated list of serial number data types.
 * <p>
 * This class contains the codes that MUST be used as the third part of the
 * Serial of each dataset corresponding to each class type.
 * <p>
 * Used by {@link Serial}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
public enum EDatasetType {

  /**
   * Administrative
   */
  AD(Administrative.class),
  /**
   * Allotment
   */
  AL(Allotment.class),
  /**
   * Antenna
   */
  AN(Antenna.class),
  /**
   * Assignment
   */
  AS(Assignment.class),
  /**
   * Contact
   */
  CN(Contact.class),
  /**
   * ChannelPlan
   */
  CP(ChannelPlan.class),
  /**
   * ExternalReference
   */
  EX(ExternalReference.class),
  /**
   * Force Element Deployment
   */
  FD(FEDeployment.class),
  /**
   * ForceElement
   */
  FE(ForceElement.class),
  /**
   * Spectrum Supportability Reply (Host Nation Declaration)
   */
  HD(SSReply.class),
  /**
   * IntfReport
   */
  IF(IntfReport.class),
  /**
   * Role
   */
  JA(Role.class),
  /**
   * JRFL
   */
  JR(JRFL.class),
  /**
   * Location
   */
  LO(Location.class),
  /**
   * Loadset
   */
  LS(Loadset.class),
  /**
   * Message
   */
  MS(Message.class),
  /**
   * Note
   */
  NT(Note.class),
  /**
   * Organisation
   */
  OR(Organisation.class),
  /**
   * RadiationPlan
   */
  RP(RadiationPlan.class),
  /**
   * Receiver
   */
  RX(Receiver.class),
  /**
   * Satellite
   */
  SA(Satellite.class),
  /**
   * Spectrum Supportability Request
   */
  SR(SSRequest.class),
  /**
   * Table of Allocations
   */
  TA(TOA.class),
  /**
   * RFSystem
   */
  TR(RFSystem.class),
  /**
   * Transmitter
   */
  TX(Transmitter.class);

  /**
   * The class type.
   */
  private final Class<? extends Common<?>> clazz;

  private EDatasetType(Class<? extends Common<?>> clazz) {
    this.clazz = clazz;
  }

  /**
   * Get the class type for this serial type.
   * <p>
   * @return the class type.
   */
  public Class<? extends Common<?>> getClazz() {
    return clazz;
  }

  /**
   * Get a serial number data type from an object instance. This method is used
   * within the {@link Common} constructor to automatically build a serial
   * number.
   * <p>
   * @param instance the object instance
   * @return the serial number data type code
   */
  public static EDatasetType fromInstance(Object instance) {
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
  public static EDatasetType fromInstance(Class<?> clazz) {
    for (EDatasetType eSerialType : EDatasetType.values()) {
      if (eSerialType.getClazz().equals(clazz)) {
        return eSerialType;
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
    return clazz.getSimpleName();
  }

}
