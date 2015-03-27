/* 
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.ForceElement;

/**
 * Enumerated values for fields using the ListCET type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCET")
@XmlEnum
public enum ListCET {

  @XmlEnumValue("Aircraft")
  AIRCRAFT("Aircraft"),
  @XmlEnumValue("Air Drop")
  AIR_DROP("Air Drop"),
  @XmlEnumValue("Helicopter")
  HELICOPTER("Helicopter"),
  @XmlEnumValue("V/STOL")
  V_STOL("V/STOL"),
  @XmlEnumValue("Air Launched Missile")
  AIR_LAUNCHED_MISSILE("Air Launched Missile"),
  @XmlEnumValue("Armored Land Vehicle")
  ARMORED_LAND_VEHICLE("Armored Land Vehicle"),
  @XmlEnumValue("Non-Tactical Land Vehicle")
  NON_TACTICAL_LAND_VEHICLE("Non-Tactical Land Vehicle"),
  @XmlEnumValue("Tactical Land Vehicle")
  TACTICAL_LAND_VEHICLE("Tactical Land Vehicle"),
  @XmlEnumValue("Surface Launched Missile")
  SURFACE_LAUNCHED_MISSILE("Surface Launched Missile"),
  @XmlEnumValue("Water Launched Missile")
  WATER_LAUNCHED_MISSILE("Water Launched Missile"),
  @XmlEnumValue("Unmanned Air Vehicles")
  UNMANNED_AIR_VEHICLES("Unmanned Air Vehicles"),
  @XmlEnumValue("Lighter/Boat")
  LIGHTER_BOAT("Lighter/Boat"),
  @XmlEnumValue("Amphibious Vessel")
  AMPHIBIOUS_VESSEL("Amphibious Vessel"),
  @XmlEnumValue("Tug Boat")
  TUG_BOAT("Tug Boat"),
  @XmlEnumValue("Command Ship")
  COMMAND_SHIP("Command Ship"),
  @XmlEnumValue("Landing Craft, Air Cushion")
  LANDING_CRAFT_AIR_CUSHION("Landing Craft, Air Cushion"),
  @XmlEnumValue("Amphibious Command Ship")
  AMPHIBIOUS_COMMAND_SHIP("Amphibious Command Ship"),
  @XmlEnumValue("Amphibious Assault Ship")
  AMPHIBIOUS_ASSAULT_SHIP("Amphibious Assault Ship"),
  @XmlEnumValue("Amphibious Transport Dock")
  AMPHIBIOUS_TRANSPORT_DOCK("Amphibious Transport Dock"),
  @XmlEnumValue("Amphibious Cargo Ship")
  AMPHIBIOUS_CARGO_SHIP("Amphibious Cargo Ship"),
  @XmlEnumValue("Landing Craft Utility")
  LANDING_CRAFT_UTILITY("Landing Craft Utility"),
  @XmlEnumValue("Amphibious Assault Vehicle")
  AMPHIBIOUS_ASSAULT_VEHICLE("Amphibious Assault Vehicle"),
  @XmlEnumValue("Expeditionary Fighting Vehicle")
  EXPEDITIONARY_FIGHTING_VEHICLE("Expeditionary Fighting Vehicle"),
  @XmlEnumValue("Rigid Raiding Craft")
  RIGID_RAIDING_CRAFT("Rigid Raiding Craft"),
  @XmlEnumValue("Riverine Assault Craft")
  RIVERINE_ASSAULT_CRAFT("Riverine Assault Craft"),
  @XmlEnumValue("High Speed Vessel")
  HIGH_SPEED_VESSEL("High Speed Vessel"),
  @XmlEnumValue("Joint High Speed Vessel")
  JOINT_HIGH_SPEED_VESSEL("Joint High Speed Vessel"),
  @XmlEnumValue("Aid to Navigation Boat")
  AID_TO_NAVIGATION_BOAT("Aid to Navigation Boat"),
  @XmlEnumValue("High Endurance Cutter")
  HIGH_ENDURANCE_CUTTER("High Endurance Cutter"),
  @XmlEnumValue("Motor Life Boat")
  MOTOR_LIFE_BOAT("Motor Life Boat"),
  @XmlEnumValue("Medium Endurance Cutter")
  MEDIUM_ENDURANCE_CUTTER("Medium Endurance Cutter"),
  @XmlEnumValue("Patrol Boat")
  PATROL_BOAT("Patrol Boat"),
  @XmlEnumValue("Utility Boat")
  UTILITY_BOAT("Utility Boat"),
  @XmlEnumValue("Transportable Port Security Boat")
  TRANSPORTABLE_PORT_SECURITY_BOAT("Transportable Port Security Boat"),
  @XmlEnumValue("Mine Countermeasure Ship")
  MINE_COUNTERMEASURE_SHIP("Mine Countermeasure Ship"),
  @XmlEnumValue("Coastal Mine Hunter")
  COASTAL_MINE_HUNTER("Coastal Mine Hunter"),
  @XmlEnumValue("Cruiser")
  CRUISER("Cruiser"),
  @XmlEnumValue("Aircraft Carrier")
  AIRCRAFT_CARRIER("Aircraft Carrier"),
  @XmlEnumValue("Destroyer")
  DESTROYER("Destroyer"),
  @XmlEnumValue("Guided Missile Destroyer")
  GUIDED_MISSILE_DESTROYER("Guided Missile Destroyer"),
  @XmlEnumValue("Frigates")
  FRIGATES("Frigates"),
  @XmlEnumValue("Coastal Patrol Craft")
  COASTAL_PATROL_CRAFT("Coastal Patrol Craft"),
  @XmlEnumValue("Littoral combat Ship")
  LITTORAL_COMBAT_SHIP("Littoral combat Ship"),
  @XmlEnumValue("Crane Ship")
  CRANE_SHIP("Crane Ship"),
  @XmlEnumValue("Ammunition Ship")
  AMMUNITION_SHIP("Ammunition Ship"),
  @XmlEnumValue("Combat Stores Ship")
  COMBAT_STORES_SHIP("Combat Stores Ship"),
  @XmlEnumValue("Research Ship")
  RESEARCH_SHIP("Research Ship"),
  @XmlEnumValue("Surveillance Ship")
  SURVEILLANCE_SHIP("Surveillance Ship"),
  @XmlEnumValue("Survey Ship")
  SURVEY_SHIP("Survey Ship"),
  @XmlEnumValue("Hospital Ship")
  HOSPITAL_SHIP("Hospital Ship"),
  @XmlEnumValue("Container Ship")
  CONTAINER_SHIP("Container Ship"),
  @XmlEnumValue("Dry Cargo/Ammunition Ship")
  DRY_CARGO_AMMUNITION_SHIP("Dry Cargo/Ammunition Ship"),
  @XmlEnumValue("Fast Sealift Ship")
  FAST_SEALIFT_SHIP("Fast Sealift Ship"),
  @XmlEnumValue("Underway Replenishment Oiler")
  UNDERWAY_REPLENISHMENT_OILER("Underway Replenishment Oiler"),
  @XmlEnumValue("Fast Combat Support Ship")
  FAST_COMBAT_SUPPORT_SHIP("Fast Combat Support Ship"),
  @XmlEnumValue("Transport Tanker")
  TRANSPORT_TANKER("Transport Tanker"),
  @XmlEnumValue("Cable Repair Ship")
  CABLE_REPAIR_SHIP("Cable Repair Ship"),
  @XmlEnumValue("Rescue & Salvage")
  RESCUE_SALVAGE("Rescue & Salvage"),
  @XmlEnumValue("Ocean-Going Tug")
  OCEAN_GOING_TUG("Ocean-Going Tug"),
  @XmlEnumValue("Aviation Support Ship")
  AVIATION_SUPPORT_SHIP("Aviation Support Ship"),
  @XmlEnumValue("Research Vessel")
  RESEARCH_VESSEL("Research Vessel"),
  @XmlEnumValue("Ballistic Missile Submarine")
  BALLISTIC_MISSILE_SUBMARINE("Ballistic Missile Submarine"),
  @XmlEnumValue("Attack Submarine")
  ATTACK_SUBMARINE("Attack Submarine"),
  @XmlEnumValue("Salvage Ship")
  SALVAGE_SHIP("Salvage Ship"),
  @XmlEnumValue("Submarine Tender")
  SUBMARINE_TENDER("Submarine Tender"),
  @XmlEnumValue("Yard Patrol Craft")
  YARD_PATROL_CRAFT("Yard Patrol Craft"),
  @XmlEnumValue("Special Operations Craft")
  SPECIAL_OPERATIONS_CRAFT("Special Operations Craft"),
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
