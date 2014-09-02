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
package us.gov.dod.standard.ssrf._3_0.enumerated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCET.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCET"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Aircraft"/> &lt;enumeration value="Air Drop"/> &lt;enumeration
 * value="Helicopter"/> &lt;enumeration value="V/STOL"/> &lt;enumeration
 * value="Air Launched Missile"/> &lt;enumeration value="Armored Land Vehicle"/>
 * &lt;enumeration value="Non-Tactical Land Vehicle"/> &lt;enumeration
 * value="Tactical Land Vehicle"/> &lt;enumeration value="Surface Launched
 * Missile"/> &lt;enumeration value="Water Launched Missile"/> &lt;enumeration
 * value="Unmanned Air Vehicles"/> &lt;enumeration value="Lighter/Boat"/>
 * &lt;enumeration value="Amphibious Vessel"/> &lt;enumeration value="Tug
 * Boat"/> &lt;enumeration value="Command Ship"/> &lt;enumeration value="Landing
 * Craft, Air Cushion"/> &lt;enumeration value="Amphibious Command Ship"/>
 * &lt;enumeration value="Amphibious Assault Ship"/> &lt;enumeration
 * value="Amphibious Transport Dock"/> &lt;enumeration value="Amphibious Cargo
 * Ship"/> &lt;enumeration value="Landing Craft Utility"/> &lt;enumeration
 * value="Amphibious Assault Vehicle"/> &lt;enumeration value="Expeditionary
 * Fighting Vehicle"/> &lt;enumeration value="Rigid Raiding Craft"/>
 * &lt;enumeration value="Riverine Assault Craft"/> &lt;enumeration value="High
 * Speed Vessel"/> &lt;enumeration value="Joint High Speed Vessel"/>
 * &lt;enumeration value="Aid to Navigation Boat"/> &lt;enumeration value="High
 * Endurance Cutter"/> &lt;enumeration value="Motor Life Boat"/> &lt;enumeration
 * value="Medium Endurance Cutter"/> &lt;enumeration value="Patrol Boat"/>
 * &lt;enumeration value="Utility Boat"/> &lt;enumeration value="Transportable
 * Port Security Boat"/> &lt;enumeration value="Mine Countermeasure Ship"/>
 * &lt;enumeration value="Coastal Mine Hunter"/> &lt;enumeration
 * value="Cruiser"/> &lt;enumeration value="Aircraft Carrier"/> &lt;enumeration
 * value="Destroyer"/> &lt;enumeration value="Guided Missile Destroyer"/>
 * &lt;enumeration value="Frigates"/> &lt;enumeration value="Coastal Patrol
 * Craft"/> &lt;enumeration value="Littoral combat Ship"/> &lt;enumeration
 * value="Crane Ship"/> &lt;enumeration value="Ammunition Ship"/>
 * &lt;enumeration value="Combat Stores Ship"/> &lt;enumeration value="Research
 * Ship"/> &lt;enumeration value="Surveillance Ship"/> &lt;enumeration
 * value="Survey Ship"/> &lt;enumeration value="Hospital Ship"/> &lt;enumeration
 * value="Container Ship"/> &lt;enumeration value="Dry Cargo/Ammunition Ship"/>
 * &lt;enumeration value="Fast Sealift Ship"/> &lt;enumeration value="Underway
 * Replenishment Oiler"/> &lt;enumeration value="Fast Combat Support Ship"/>
 * &lt;enumeration value="Transport Tanker"/> &lt;enumeration value="Cable
 * Repair Ship"/> &lt;enumeration value="Rescue &amp; Salvage"/> &lt;enumeration
 * value="Ocean-Going Tug"/> &lt;enumeration value="Aviation Support Ship"/>
 * &lt;enumeration value="Research Vessel"/> &lt;enumeration value="Ballistic
 * Missile Submarine"/> &lt;enumeration value="Attack Submarine"/>
 * &lt;enumeration value="Fast Combat Support Ship"/> &lt;enumeration
 * value="Salvage Ship"/> &lt;enumeration value="Submarine Tender"/>
 * &lt;enumeration value="Yard Patrol Craft"/> &lt;enumeration value="Special
 * Operations Craft"/> &lt;enumeration value="Other"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCET")
@XmlEnum
public enum ListCET {

  @XmlEnumValue("Aircraft")
  AIRCRAFT("Aircraft"),
  @XmlEnumValue("Air Drop")
  AIR___DROP("Air Drop"),
  @XmlEnumValue("Helicopter")
  HELICOPTER("Helicopter"),
  @XmlEnumValue("V/STOL")
  V___STOL("V/STOL"),
  @XmlEnumValue("Air Launched Missile")
  AIR___LAUNCHED___MISSILE("Air Launched Missile"),
  @XmlEnumValue("Armored Land Vehicle")
  ARMORED___LAND___VEHICLE("Armored Land Vehicle"),
  @XmlEnumValue("Non-Tactical Land Vehicle")
  NON___TACTICAL___LAND___VEHICLE("Non-Tactical Land Vehicle"),
  @XmlEnumValue("Tactical Land Vehicle")
  TACTICAL___LAND___VEHICLE("Tactical Land Vehicle"),
  @XmlEnumValue("Surface Launched Missile")
  SURFACE___LAUNCHED___MISSILE("Surface Launched Missile"),
  @XmlEnumValue("Water Launched Missile")
  WATER___LAUNCHED___MISSILE("Water Launched Missile"),
  @XmlEnumValue("Unmanned Air Vehicles")
  UNMANNED___AIR___VEHICLES("Unmanned Air Vehicles"),
  @XmlEnumValue("Lighter/Boat")
  LIGHTER___BOAT("Lighter/Boat"),
  @XmlEnumValue("Amphibious Vessel")
  AMPHIBIOUS___VESSEL("Amphibious Vessel"),
  @XmlEnumValue("Tug Boat")
  TUG___BOAT("Tug Boat"),
  @XmlEnumValue("Command Ship")
  COMMAND___SHIP("Command Ship"),
  @XmlEnumValue("Landing Craft, Air Cushion")
  LANDING___CRAFT____AIR___CUSHION("Landing Craft, Air Cushion"),
  @XmlEnumValue("Amphibious Command Ship")
  AMPHIBIOUS___COMMAND___SHIP("Amphibious Command Ship"),
  @XmlEnumValue("Amphibious Assault Ship")
  AMPHIBIOUS___ASSAULT___SHIP("Amphibious Assault Ship"),
  @XmlEnumValue("Amphibious Transport Dock")
  AMPHIBIOUS___TRANSPORT___DOCK("Amphibious Transport Dock"),
  @XmlEnumValue("Amphibious Cargo Ship")
  AMPHIBIOUS___CARGO___SHIP("Amphibious Cargo Ship"),
  @XmlEnumValue("Landing Craft Utility")
  LANDING___CRAFT___UTILITY("Landing Craft Utility"),
  @XmlEnumValue("Amphibious Assault Vehicle")
  AMPHIBIOUS___ASSAULT___VEHICLE("Amphibious Assault Vehicle"),
  @XmlEnumValue("Expeditionary Fighting Vehicle")
  EXPEDITIONARY___FIGHTING___VEHICLE("Expeditionary Fighting Vehicle"),
  @XmlEnumValue("Rigid Raiding Craft")
  RIGID___RAIDING___CRAFT("Rigid Raiding Craft"),
  @XmlEnumValue("Riverine Assault Craft")
  RIVERINE___ASSAULT___CRAFT("Riverine Assault Craft"),
  @XmlEnumValue("High Speed Vessel")
  HIGH___SPEED___VESSEL("High Speed Vessel"),
  @XmlEnumValue("Joint High Speed Vessel")
  JOINT___HIGH___SPEED___VESSEL("Joint High Speed Vessel"),
  @XmlEnumValue("Aid to Navigation Boat")
  AID___TO___NAVIGATION___BOAT("Aid to Navigation Boat"),
  @XmlEnumValue("High Endurance Cutter")
  HIGH___ENDURANCE___CUTTER("High Endurance Cutter"),
  @XmlEnumValue("Motor Life Boat")
  MOTOR___LIFE___BOAT("Motor Life Boat"),
  @XmlEnumValue("Medium Endurance Cutter")
  MEDIUM___ENDURANCE___CUTTER("Medium Endurance Cutter"),
  @XmlEnumValue("Patrol Boat")
  PATROL___BOAT("Patrol Boat"),
  @XmlEnumValue("Utility Boat")
  UTILITY___BOAT("Utility Boat"),
  @XmlEnumValue("Transportable Port Security Boat")
  TRANSPORTABLE___PORT___SECURITY___BOAT("Transportable Port Security Boat"),
  @XmlEnumValue("Mine Countermeasure Ship")
  MINE___COUNTERMEASURE___SHIP("Mine Countermeasure Ship"),
  @XmlEnumValue("Coastal Mine Hunter")
  COASTAL___MINE___HUNTER("Coastal Mine Hunter"),
  @XmlEnumValue("Cruiser")
  CRUISER("Cruiser"),
  @XmlEnumValue("Aircraft Carrier")
  AIRCRAFT___CARRIER("Aircraft Carrier"),
  @XmlEnumValue("Destroyer")
  DESTROYER("Destroyer"),
  @XmlEnumValue("Guided Missile Destroyer")
  GUIDED___MISSILE___DESTROYER("Guided Missile Destroyer"),
  @XmlEnumValue("Frigates")
  FRIGATES("Frigates"),
  @XmlEnumValue("Coastal Patrol Craft")
  COASTAL___PATROL___CRAFT("Coastal Patrol Craft"),
  @XmlEnumValue("Littoral combat Ship")
  LITTORAL___COMBAT___SHIP("Littoral combat Ship"),
  @XmlEnumValue("Crane Ship")
  CRANE___SHIP("Crane Ship"),
  @XmlEnumValue("Ammunition Ship")
  AMMUNITION___SHIP("Ammunition Ship"),
  @XmlEnumValue("Combat Stores Ship")
  COMBAT___STORES___SHIP("Combat Stores Ship"),
  @XmlEnumValue("Research Ship")
  RESEARCH___SHIP("Research Ship"),
  @XmlEnumValue("Surveillance Ship")
  SURVEILLANCE___SHIP("Surveillance Ship"),
  @XmlEnumValue("Survey Ship")
  SURVEY___SHIP("Survey Ship"),
  @XmlEnumValue("Hospital Ship")
  HOSPITAL___SHIP("Hospital Ship"),
  @XmlEnumValue("Container Ship")
  CONTAINER___SHIP("Container Ship"),
  @XmlEnumValue("Dry Cargo/Ammunition Ship")
  DRY___CARGO___AMMUNITION___SHIP("Dry Cargo/Ammunition Ship"),
  @XmlEnumValue("Fast Sealift Ship")
  FAST___SEALIFT___SHIP("Fast Sealift Ship"),
  @XmlEnumValue("Underway Replenishment Oiler")
  UNDERWAY___REPLENISHMENT___OILER("Underway Replenishment Oiler"),
  @XmlEnumValue("Fast Combat Support Ship")
  FAST___COMBAT___SUPPORT___SHIP("Fast Combat Support Ship"),
  @XmlEnumValue("Transport Tanker")
  TRANSPORT___TANKER("Transport Tanker"),
  @XmlEnumValue("Cable Repair Ship")
  CABLE___REPAIR___SHIP("Cable Repair Ship"),
  @XmlEnumValue("Rescue & Salvage")
  RESCUE_____SALVAGE("Rescue & Salvage"),
  @XmlEnumValue("Ocean-Going Tug")
  OCEAN___GOING___TUG("Ocean-Going Tug"),
  @XmlEnumValue("Aviation Support Ship")
  AVIATION___SUPPORT___SHIP("Aviation Support Ship"),
  @XmlEnumValue("Research Vessel")
  RESEARCH___VESSEL("Research Vessel"),
  @XmlEnumValue("Ballistic Missile Submarine")
  BALLISTIC___MISSILE___SUBMARINE("Ballistic Missile Submarine"),
  @XmlEnumValue("Attack Submarine")
  ATTACK___SUBMARINE("Attack Submarine"),
  @XmlEnumValue("Salvage Ship")
  SALVAGE___SHIP("Salvage Ship"),
  @XmlEnumValue("Submarine Tender")
  SUBMARINE___TENDER("Submarine Tender"),
  @XmlEnumValue("Yard Patrol Craft")
  YARD___PATROL___CRAFT("Yard Patrol Craft"),
  @XmlEnumValue("Special Operations Craft")
  SPECIAL___OPERATIONS___CRAFT("Special Operations Craft"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCET(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCET fromValue(String v) {
    for (ListCET c : ListCET.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
