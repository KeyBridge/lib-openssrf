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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.ForceElement;

/**
 * Enumerated values for fields using the ListCLC type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCLC")
@XmlEnum
public enum ListCLC {

  @XmlEnumValue("Academy")
  ACADEMY("Academy"),
  @XmlEnumValue("Accounts Control Section")
  ACCOUNTS_CONTROL_SECTION("Accounts Control Section"),
  @XmlEnumValue("Activity")
  ACTIVITY("Activity"),
  @XmlEnumValue("Admission")
  ADMISSION("Admission"),
  @XmlEnumValue("Agency")
  AGENCY("Agency"),
  @XmlEnumValue("Air Facility")
  AIR_FACILITY("Air Facility"),
  @XmlEnumValue("Air Patrol")
  AIR_PATROL("Air Patrol"),
  @XmlEnumValue("Air Station")
  AIR_STATION("Air Station"),
  @XmlEnumValue("Annex")
  ANNEX("Annex"),
  @XmlEnumValue("Area")
  AREA("Area"),
  @XmlEnumValue("Area Regional Office")
  AREA_REGIONAL_OFFICE("Area Regional Office"),
  @XmlEnumValue("Army Group")
  ARMY_GROUP("Army Group"),
  @XmlEnumValue("Arsenal")
  ARSENAL("Arsenal"),
  @XmlEnumValue("Augmentation")
  AUGMENTATION("Augmentation"),
  @XmlEnumValue("Band")
  BAND("Band"),
  @XmlEnumValue("Barge")
  BARGE("Barge"),
  @XmlEnumValue("Barracks")
  BARRACKS("Barracks"),
  @XmlEnumValue("Base")
  BASE("Base"),
  @XmlEnumValue("Basin")
  BASIN("Basin"),
  @XmlEnumValue("Battalion")
  BATTALION("Battalion"),
  @XmlEnumValue("Battalion Landing Team")
  BATTALION_LANDING_TEAM("Battalion Landing Team"),
  @XmlEnumValue("Battery")
  BATTERY("Battery"),
  @XmlEnumValue("Board")
  BOARD("Board"),
  @XmlEnumValue("Boat")
  BOAT("Boat"),
  @XmlEnumValue("Branch")
  BRANCH("Branch"),
  @XmlEnumValue("Brigade")
  BRIGADE("Brigade"),
  @XmlEnumValue("Business Unit")
  BUSINESS_UNIT("Business Unit"),
  @XmlEnumValue("Camp")
  CAMP("Camp"),
  @XmlEnumValue("Centre")
  CENTRE("Centre"),
  @XmlEnumValue("Clinic")
  CLINIC("Clinic"),
  @XmlEnumValue("College")
  COLLEGE("College"),
  @XmlEnumValue("Command")
  COMMAND("Command"),
  @XmlEnumValue("Commission")
  COMMISSION("Commission"),
  @XmlEnumValue("Communications-Electronics Complex")
  COMMUNICATIONS_ELECTRONICS_COMPLEX("Communications-Electronics Complex"),
  @XmlEnumValue("Communications-Electronics Package")
  COMMUNICATIONS_ELECTRONICS_PACKAGE("Communications-Electronics Package"),
  @XmlEnumValue("Company")
  COMPANY("Company"),
  @XmlEnumValue("Consolidated Distribution Centre")
  CONSOLIDATED_DISTRIBUTION_CENTRE("Consolidated Distribution Centre"),
  @XmlEnumValue("Corps")
  CORPS("Corps"),
  @XmlEnumValue("Corps Artillery")
  CORPS_ARTILLERY("Corps Artillery"),
  @XmlEnumValue("Crew")
  CREW("Crew"),
  @XmlEnumValue("Defense Attache Office")
  DEFENSE_ATTACHE_OFFICE("Defense Attache Office"),
  @XmlEnumValue("Depot")
  DEPOT("Depot"),
  @XmlEnumValue("Detachment")
  DETACHMENT("Detachment"),
  @XmlEnumValue("Detachment For MEB")
  DETACHMENT_FOR_MEB("Detachment For MEB"),
  @XmlEnumValue("Detachment For MEF")
  DETACHMENT_FOR_MEF("Detachment For MEF"),
  @XmlEnumValue("Detachment For MEU")
  DETACHMENT_FOR_MEU("Detachment For MEU"),
  @XmlEnumValue("Detachment Residual")
  DETACHMENT_RESIDUAL("Detachment Residual"),
  @XmlEnumValue("Detail")
  DETAIL("Detail"),
  @XmlEnumValue("Director/Directorate")
  DIRECTOR_DIRECTORATE("Director/Directorate"),
  @XmlEnumValue("Dispensary")
  DISPENSARY("Dispensary"),
  @XmlEnumValue("District")
  DISTRICT("District"),
  @XmlEnumValue("Division")
  DIVISION("Division"),
  @XmlEnumValue("Division Artillery")
  DIVISION_ARTILLERY("Division Artillery"),
  @XmlEnumValue("Element")
  ELEMENT("Element"),
  @XmlEnumValue("Facility")
  FACILITY("Facility"),
  @XmlEnumValue("Field Artillery")
  FIELD_ARTILLERY("Field Artillery"),
  @XmlEnumValue("Field Operating Activity")
  FIELD_OPERATING_ACTIVITY("Field Operating Activity"),
  @XmlEnumValue("Flight")
  FLIGHT("Flight"),
  @XmlEnumValue("Flotilla")
  FLOTILLA("Flotilla"),
  @XmlEnumValue("Force")
  FORCE("Force"),
  @XmlEnumValue("Force Troops")
  FORCE_TROOPS("Force Troops"),
  @XmlEnumValue("Garrison")
  GARRISON("Garrison"),
  @XmlEnumValue("Group")
  GROUP("Group"),
  @XmlEnumValue("Home")
  HOME("Home"),
  @XmlEnumValue("Hospital")
  HOSPITAL("Hospital"),
  HQ("HQ"),
  @XmlEnumValue("HQ And HQ Battery")
  HQ_AND_HQ_BATTERY("HQ And HQ Battery"),
  @XmlEnumValue("HQ And HQ Company")
  HQ_AND_HQ_COMPANY("HQ And HQ Company"),
  @XmlEnumValue("HQ And HQ Detachment")
  HQ_AND_HQ_DETACHMENT("HQ And HQ Detachment"),
  @XmlEnumValue("HQ And HQ Troop")
  HQ_AND_HQ_TROOP("HQ And HQ Troop"),
  @XmlEnumValue("HQ And Maintenance Company")
  HQ_AND_MAINTENANCE_COMPANY("HQ And Maintenance Company"),
  @XmlEnumValue("HQ And Service Battery")
  HQ_AND_SERVICE_BATTERY("HQ And Service Battery"),
  @XmlEnumValue("HQ And Service Company")
  HQ_AND_SERVICE_COMPANY("HQ And Service Company"),
  @XmlEnumValue("HQ And Support Company")
  HQ_AND_SUPPORT_COMPANY("HQ And Support Company"),
  @XmlEnumValue("HQ Company")
  HQ_COMPANY("HQ Company"),
  @XmlEnumValue("HQ Company And Band")
  HQ_COMPANY_AND_BAND("HQ Company And Band"),
  @XmlEnumValue("HQ Detachment")
  HQ_DETACHMENT("HQ Detachment"),
  @XmlEnumValue("II MEB And MEU DET Residual")
  II_MEB_AND_MEU_DET_RESIDUAL("II MEB And MEU DET Residual"),
  @XmlEnumValue("II MEB Detachment Residual")
  II_MEB_DETACHMENT_RESIDUAL("II MEB Detachment Residual"),
  @XmlEnumValue("Inspector")
  INSPECTOR("Inspector"),
  @XmlEnumValue("Installation")
  INSTALLATION("Installation"),
  @XmlEnumValue("Institute")
  INSTITUTE("Institute"),
  @XmlEnumValue("Laboratory")
  LABORATORY("Laboratory"),
  @XmlEnumValue("Library")
  LIBRARY("Library"),
  @XmlEnumValue("Magazine")
  MAGAZINE("Magazine"),
  @XmlEnumValue("Maintenance Float")
  MAINTENANCE_FLOAT("Maintenance Float"),
  @XmlEnumValue("Manager")
  MANAGER("Manager"),
  @XmlEnumValue("Marine Air Group")
  MARINE_AIR_GROUP("Marine Air Group"),
  @XmlEnumValue("Marine Air Wing")
  MARINE_AIR_WING("Marine Air Wing"),
  @XmlEnumValue("Marine Expeditionary Brigade")
  MARINE_EXPEDITIONARY_BRIGADE("Marine Expeditionary Brigade"),
  @XmlEnumValue("Marine Expeditionary Force")
  MARINE_EXPEDITIONARY_FORCE("Marine Expeditionary Force"),
  @XmlEnumValue("Marine Expeditionary Unit")
  MARINE_EXPEDITIONARY_UNIT("Marine Expeditionary Unit"),
  @XmlEnumValue("Marine Forces")
  MARINE_FORCES("Marine Forces"),
  @XmlEnumValue("MEB DET Residual")
  MEB_DET_RESIDUAL("MEB DET Residual"),
  @XmlEnumValue("Merchant Ship")
  MERCHANT_SHIP("Merchant Ship"),
  @XmlEnumValue("MEU DET Residual")
  MEU_DET_RESIDUAL("MEU DET Residual"),
  @XmlEnumValue("Military Assistance Advisory Group")
  MILITARY_ASSISTANCE_ADVISORY_GROUP("Military Assistance Advisory Group"),
  @XmlEnumValue("Mission")
  MISSION("Mission"),
  @XmlEnumValue("MSC One-Time Charter")
  MSC_ONE_TIME_CHARTER("MSC One-Time Charter"),
  @XmlEnumValue("MSC Ship")
  MSC_SHIP("MSC Ship"),
  @XmlEnumValue("Museum")
  MUSEUM("Museum"),
  @XmlEnumValue("Navy Support Craft")
  NAVY_SUPPORT_CRAFT("Navy Support Craft"),
  @XmlEnumValue("No Significant Level")
  NO_SIGNIFICANT_LEVEL("No Significant Level"),
  @XmlEnumValue("Numbered Air Force")
  NUMBERED_AIR_FORCE("Numbered Air Force"),
  @XmlEnumValue("Numbered Army")
  NUMBERED_ARMY("Numbered Army"),
  @XmlEnumValue("Numbered Fleet")
  NUMBERED_FLEET("Numbered Fleet"),
  @XmlEnumValue("Observatory")
  OBSERVATORY("Observatory"),
  @XmlEnumValue("Office")
  OFFICE("Office"),
  @XmlEnumValue("Office Of Defense Cooperation")
  OFFICE_OF_DEFENSE_COOPERATION("Office Of Defense Cooperation"),
  @XmlEnumValue("Office Of Military Cooperation")
  OFFICE_OF_MILITARY_COOPERATION("Office Of Military Cooperation"),
  @XmlEnumValue("Officer")
  OFFICER("Officer"),
  @XmlEnumValue("Officer-In-Charge")
  OFFICER_IN_CHARGE("Officer-In-Charge"),
  @XmlEnumValue("Operating Location")
  OPERATING_LOCATION("Operating Location"),
  @XmlEnumValue("Package")
  PACKAGE("Package"),
  @XmlEnumValue("Packet")
  PACKET("Packet"),
  @XmlEnumValue("Party")
  PARTY("Party"),
  @XmlEnumValue("Plant")
  PLANT("Plant"),
  @XmlEnumValue("Platoon")
  PLATOON("Platoon"),
  @XmlEnumValue("Port")
  PORT("Port"),
  @XmlEnumValue("Port Captain")
  PORT_CAPTAIN("Port Captain"),
  @XmlEnumValue("Post Office")
  POST_OFFICE("Post Office"),
  @XmlEnumValue("Proving Ground")
  PROVING_GROUND("Proving Ground"),
  @XmlEnumValue("Range")
  RANGE("Range"),
  @XmlEnumValue("Regiment")
  REGIMENT("Regiment"),
  @XmlEnumValue("Regimental Combat Team")
  REGIMENTAL_COMBAT_TEAM("Regimental Combat Team"),
  @XmlEnumValue("Regimental Landing Team")
  REGIMENTAL_LANDING_TEAM("Regimental Landing Team"),
  @XmlEnumValue("Region")
  REGION("Region"),
  @XmlEnumValue("Region(al)")
  REGION_AL__("Region(al)"),
  @XmlEnumValue("Representative")
  REPRESENTATIVE("Representative"),
  @XmlEnumValue("Reserves")
  RESERVES("Reserves"),
  @XmlEnumValue("School")
  SCHOOL("School"),
  @XmlEnumValue("Section")
  SECTION("Section"),
  @XmlEnumValue("Sector")
  SECTOR("Sector"),
  @XmlEnumValue("Service")
  SERVICE("Service"),
  @XmlEnumValue("Service Company")
  SERVICE_COMPANY("Service Company"),
  @XmlEnumValue("Ship, Foreign/Merchant")
  SHIP__FOREIGN_MERCHANT("Ship, Foreign/Merchant"),
  @XmlEnumValue("Shipyard")
  SHIPYARD("Shipyard"),
  @XmlEnumValue("Shop")
  SHOP("Shop"),
  @XmlEnumValue("Shop Stores")
  SHOP_STORES("Shop Stores"),
  @XmlEnumValue("Special Troops")
  SPECIAL_TROOPS("Special Troops"),
  @XmlEnumValue("Squad")
  SQUAD("Squad"),
  @XmlEnumValue("Squadron")
  SQUADRON("Squadron"),
  @XmlEnumValue("Staff")
  STAFF("Staff"),
  @XmlEnumValue("Station")
  STATION("Station"),
  @XmlEnumValue("Store")
  STORE("Store"),
  @XmlEnumValue("Substation")
  SUBSTATION("Substation"),
  @XmlEnumValue("Subunit")
  SUBUNIT("Subunit"),
  @XmlEnumValue("Supervisor")
  SUPERVISOR("Supervisor"),
  @XmlEnumValue("Support Command")
  SUPPORT_COMMAND("Support Command"),
  @XmlEnumValue("System")
  SYSTEM("System"),
  @XmlEnumValue("Task Element")
  TASK_ELEMENT("Task Element"),
  @XmlEnumValue("Task Force")
  TASK_FORCE("Task Force"),
  @XmlEnumValue("Task Group")
  TASK_GROUP("Task Group"),
  @XmlEnumValue("Task Unit")
  TASK_UNIT("Task Unit"),
  @XmlEnumValue("Team")
  TEAM("Team"),
  @XmlEnumValue("Terminal")
  TERMINAL("Terminal"),
  @XmlEnumValue("Train")
  TRAIN("Train"),
  @XmlEnumValue("Troop")
  TROOP("Troop"),
  @XmlEnumValue("Unit")
  UNIT("Unit"),
  @XmlEnumValue("US Ship")
  US_SHIP("US Ship"),
  @XmlEnumValue("USCG Cutter")
  USCG_CUTTER("USCG Cutter"),
  @XmlEnumValue("Wing")
  WING("Wing"),
  @XmlEnumValue("Works")
  WORKS("Works"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCLC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCLC fromValue(String v) {
    for (ListCLC c : ListCLC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
