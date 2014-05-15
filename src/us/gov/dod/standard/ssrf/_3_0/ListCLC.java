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
 * Java class for ListCLC.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCLC"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Academy"/> &lt;enumeration value="Accounts Control Section"/>
 * &lt;enumeration value="Activity"/> &lt;enumeration value="Admission"/>
 * &lt;enumeration value="Agency"/> &lt;enumeration value="Air Facility"/>
 * &lt;enumeration value="Air Patrol"/> &lt;enumeration value="Air Station"/>
 * &lt;enumeration value="Annex"/> &lt;enumeration value="Area"/>
 * &lt;enumeration value="Area Regional Office"/> &lt;enumeration value="Army
 * Group"/> &lt;enumeration value="Arsenal"/> &lt;enumeration
 * value="Augmentation"/> &lt;enumeration value="Band"/> &lt;enumeration
 * value="Barge"/> &lt;enumeration value="Barracks"/> &lt;enumeration
 * value="Base"/> &lt;enumeration value="Basin"/> &lt;enumeration
 * value="Battalion"/> &lt;enumeration value="Battalion Landing Team"/>
 * &lt;enumeration value="Battery"/> &lt;enumeration value="Board"/>
 * &lt;enumeration value="Boat"/> &lt;enumeration value="Branch"/>
 * &lt;enumeration value="Brigade"/> &lt;enumeration value="Business Unit"/>
 * &lt;enumeration value="Camp"/> &lt;enumeration value="Centre"/>
 * &lt;enumeration value="Clinic"/> &lt;enumeration value="College"/>
 * &lt;enumeration value="Command"/> &lt;enumeration value="Commission"/>
 * &lt;enumeration value="Communications-Electronics Complex"/> &lt;enumeration
 * value="Communications-Electronics Package"/> &lt;enumeration
 * value="Company"/> &lt;enumeration value="Consolidated Distribution Centre"/>
 * &lt;enumeration value="Corps"/> &lt;enumeration value="Corps Artillery"/>
 * &lt;enumeration value="Crew"/> &lt;enumeration value="Defense Attache
 * Office"/> &lt;enumeration value="Depot"/> &lt;enumeration
 * value="Detachment"/> &lt;enumeration value="Detachment For MEB"/>
 * &lt;enumeration value="Detachment For MEF"/> &lt;enumeration
 * value="Detachment For MEU"/> &lt;enumeration value="Detachment Residual"/>
 * &lt;enumeration value="Detail"/> &lt;enumeration
 * value="Director/Directorate"/> &lt;enumeration value="Dispensary"/>
 * &lt;enumeration value="District"/> &lt;enumeration value="Division"/>
 * &lt;enumeration value="Division Artillery"/> &lt;enumeration
 * value="Element"/> &lt;enumeration value="Facility"/> &lt;enumeration
 * value="Field Artillery"/> &lt;enumeration value="Field Operating Activity"/>
 * &lt;enumeration value="Flight"/> &lt;enumeration value="Flotilla"/>
 * &lt;enumeration value="Force"/> &lt;enumeration value="Force Troops"/>
 * &lt;enumeration value="Garrison"/> &lt;enumeration value="Group"/>
 * &lt;enumeration value="Home"/> &lt;enumeration value="Hospital"/>
 * &lt;enumeration value="HQ"/> &lt;enumeration value="HQ And HQ Battery"/>
 * &lt;enumeration value="HQ And HQ Company"/> &lt;enumeration value="HQ And HQ
 * Detachment"/> &lt;enumeration value="HQ And HQ Troop"/> &lt;enumeration
 * value="HQ And Maintenance Company"/> &lt;enumeration value="HQ And Service
 * Battery"/> &lt;enumeration value="HQ And Service Company"/> &lt;enumeration
 * value="HQ And Service Company"/> &lt;enumeration value="HQ And Support
 * Company"/> &lt;enumeration value="HQ Company"/> &lt;enumeration value="HQ
 * Company And Band"/> &lt;enumeration value="HQ Detachment"/> &lt;enumeration
 * value="II MEB And MEU DET Residual"/> &lt;enumeration value="II MEB
 * Detachment Residual"/> &lt;enumeration value="Inspector"/> &lt;enumeration
 * value="Installation"/> &lt;enumeration value="Institute"/> &lt;enumeration
 * value="Laboratory"/> &lt;enumeration value="Library"/> &lt;enumeration
 * value="Magazine"/> &lt;enumeration value="Maintenance Float"/>
 * &lt;enumeration value="Manager"/> &lt;enumeration value="Marine Air Group"/>
 * &lt;enumeration value="Marine Air Wing"/> &lt;enumeration value="Marine
 * Expeditionary Brigade"/> &lt;enumeration value="Marine Expeditionary Force"/>
 * &lt;enumeration value="Marine Expeditionary Unit"/> &lt;enumeration
 * value="Marine Forces"/> &lt;enumeration value="MEB DET Residual"/>
 * &lt;enumeration value="Merchant Ship"/> &lt;enumeration value="MEU DET
 * Residual"/> &lt;enumeration value="Military Assistance Advisory Group"/>
 * &lt;enumeration value="Mission"/> &lt;enumeration value="MSC One-Time
 * Charter"/> &lt;enumeration value="MSC Ship"/> &lt;enumeration
 * value="Museum"/> &lt;enumeration value="Navy Support Craft"/> &lt;enumeration
 * value="No Significant Level"/> &lt;enumeration value="Numbered Air Force"/>
 * &lt;enumeration value="Numbered Army"/> &lt;enumeration value="Numbered
 * Fleet"/> &lt;enumeration value="Observatory"/> &lt;enumeration
 * value="Office"/> &lt;enumeration value="Office Of Defense Cooperation"/>
 * &lt;enumeration value="Office Of Military Cooperation"/> &lt;enumeration
 * value="Officer"/> &lt;enumeration value="Officer-In-Charge"/> &lt;enumeration
 * value="Operating Location"/> &lt;enumeration value="Package"/>
 * &lt;enumeration value="Packet"/> &lt;enumeration value="Party"/>
 * &lt;enumeration value="Plant"/> &lt;enumeration value="Platoon"/>
 * &lt;enumeration value="Port"/> &lt;enumeration value="Port Captain"/>
 * &lt;enumeration value="Post Office"/> &lt;enumeration value="Proving
 * Ground"/> &lt;enumeration value="Range"/> &lt;enumeration value="Regiment"/>
 * &lt;enumeration value="Regimental Combat Team"/> &lt;enumeration
 * value="Regimental Landing Team"/> &lt;enumeration value="Region"/>
 * &lt;enumeration value="Region(al)"/> &lt;enumeration value="Representative"/>
 * &lt;enumeration value="Reserves"/> &lt;enumeration value="School"/>
 * &lt;enumeration value="Section"/> &lt;enumeration value="Sector"/>
 * &lt;enumeration value="Service"/> &lt;enumeration value="Service Company"/>
 * &lt;enumeration value="Ship, Foreign/Merchant"/> &lt;enumeration
 * value="Shipyard"/> &lt;enumeration value="Shop"/> &lt;enumeration value="Shop
 * Stores"/> &lt;enumeration value="Special Troops"/> &lt;enumeration
 * value="Squad"/> &lt;enumeration value="Squadron"/> &lt;enumeration
 * value="Staff"/> &lt;enumeration value="Station"/> &lt;enumeration
 * value="Store"/> &lt;enumeration value="Substation"/> &lt;enumeration
 * value="Subunit"/> &lt;enumeration value="Supervisor"/> &lt;enumeration
 * value="Support Command"/> &lt;enumeration value="System"/> &lt;enumeration
 * value="Task Element"/> &lt;enumeration value="Task Force"/> &lt;enumeration
 * value="Task Group"/> &lt;enumeration value="Task Unit"/> &lt;enumeration
 * value="Team"/> &lt;enumeration value="Terminal"/> &lt;enumeration
 * value="Train"/> &lt;enumeration value="Troop"/> &lt;enumeration
 * value="Unit"/> &lt;enumeration value="US Ship"/> &lt;enumeration value="USCG
 * Cutter"/> &lt;enumeration value="Wing"/> &lt;enumeration value="Works"/>
 * &lt;enumeration value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCLC")
@XmlEnum
public enum ListCLC {

  @XmlEnumValue("Academy")
  ACADEMY("Academy"),
  @XmlEnumValue("Accounts Control Section")
  ACCOUNTS___CONTROL___SECTION("Accounts Control Section"),
  @XmlEnumValue("Activity")
  ACTIVITY("Activity"),
  @XmlEnumValue("Admission")
  ADMISSION("Admission"),
  @XmlEnumValue("Agency")
  AGENCY("Agency"),
  @XmlEnumValue("Air Facility")
  AIR___FACILITY("Air Facility"),
  @XmlEnumValue("Air Patrol")
  AIR___PATROL("Air Patrol"),
  @XmlEnumValue("Air Station")
  AIR___STATION("Air Station"),
  @XmlEnumValue("Annex")
  ANNEX("Annex"),
  @XmlEnumValue("Area")
  AREA("Area"),
  @XmlEnumValue("Area Regional Office")
  AREA___REGIONAL___OFFICE("Area Regional Office"),
  @XmlEnumValue("Army Group")
  ARMY___GROUP("Army Group"),
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
  BATTALION___LANDING___TEAM("Battalion Landing Team"),
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
  BUSINESS___UNIT("Business Unit"),
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
  COMMUNICATIONS___ELECTRONICS___COMPLEX("Communications-Electronics Complex"),
  @XmlEnumValue("Communications-Electronics Package")
  COMMUNICATIONS___ELECTRONICS___PACKAGE("Communications-Electronics Package"),
  @XmlEnumValue("Company")
  COMPANY("Company"),
  @XmlEnumValue("Consolidated Distribution Centre")
  CONSOLIDATED___DISTRIBUTION___CENTRE("Consolidated Distribution Centre"),
  @XmlEnumValue("Corps")
  CORPS("Corps"),
  @XmlEnumValue("Corps Artillery")
  CORPS___ARTILLERY("Corps Artillery"),
  @XmlEnumValue("Crew")
  CREW("Crew"),
  @XmlEnumValue("Defense Attache Office")
  DEFENSE___ATTACHE___OFFICE("Defense Attache Office"),
  @XmlEnumValue("Depot")
  DEPOT("Depot"),
  @XmlEnumValue("Detachment")
  DETACHMENT("Detachment"),
  @XmlEnumValue("Detachment For MEB")
  DETACHMENT___FOR___MEB("Detachment For MEB"),
  @XmlEnumValue("Detachment For MEF")
  DETACHMENT___FOR___MEF("Detachment For MEF"),
  @XmlEnumValue("Detachment For MEU")
  DETACHMENT___FOR___MEU("Detachment For MEU"),
  @XmlEnumValue("Detachment Residual")
  DETACHMENT___RESIDUAL("Detachment Residual"),
  @XmlEnumValue("Detail")
  DETAIL("Detail"),
  @XmlEnumValue("Director/Directorate")
  DIRECTOR___DIRECTORATE("Director/Directorate"),
  @XmlEnumValue("Dispensary")
  DISPENSARY("Dispensary"),
  @XmlEnumValue("District")
  DISTRICT("District"),
  @XmlEnumValue("Division")
  DIVISION("Division"),
  @XmlEnumValue("Division Artillery")
  DIVISION___ARTILLERY("Division Artillery"),
  @XmlEnumValue("Element")
  ELEMENT("Element"),
  @XmlEnumValue("Facility")
  FACILITY("Facility"),
  @XmlEnumValue("Field Artillery")
  FIELD___ARTILLERY("Field Artillery"),
  @XmlEnumValue("Field Operating Activity")
  FIELD___OPERATING___ACTIVITY("Field Operating Activity"),
  @XmlEnumValue("Flight")
  FLIGHT("Flight"),
  @XmlEnumValue("Flotilla")
  FLOTILLA("Flotilla"),
  @XmlEnumValue("Force")
  FORCE("Force"),
  @XmlEnumValue("Force Troops")
  FORCE___TROOPS("Force Troops"),
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
  HQ___AND___HQ___BATTERY("HQ And HQ Battery"),
  @XmlEnumValue("HQ And HQ Company")
  HQ___AND___HQ___COMPANY("HQ And HQ Company"),
  @XmlEnumValue("HQ And HQ Detachment")
  HQ___AND___HQ___DETACHMENT("HQ And HQ Detachment"),
  @XmlEnumValue("HQ And HQ Troop")
  HQ___AND___HQ___TROOP("HQ And HQ Troop"),
  @XmlEnumValue("HQ And Maintenance Company")
  HQ___AND___MAINTENANCE___COMPANY("HQ And Maintenance Company"),
  @XmlEnumValue("HQ And Service Battery")
  HQ___AND___SERVICE___BATTERY("HQ And Service Battery"),
  @XmlEnumValue("HQ And Service Company")
  HQ___AND___SERVICE___COMPANY("HQ And Service Company"),
  @XmlEnumValue("HQ And Support Company")
  HQ___AND___SUPPORT___COMPANY("HQ And Support Company"),
  @XmlEnumValue("HQ Company")
  HQ___COMPANY("HQ Company"),
  @XmlEnumValue("HQ Company And Band")
  HQ___COMPANY___AND___BAND("HQ Company And Band"),
  @XmlEnumValue("HQ Detachment")
  HQ___DETACHMENT("HQ Detachment"),
  @XmlEnumValue("II MEB And MEU DET Residual")
  II___MEB___AND___MEU___DET___RESIDUAL("II MEB And MEU DET Residual"),
  @XmlEnumValue("II MEB Detachment Residual")
  II___MEB___DETACHMENT___RESIDUAL("II MEB Detachment Residual"),
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
  MAINTENANCE___FLOAT("Maintenance Float"),
  @XmlEnumValue("Manager")
  MANAGER("Manager"),
  @XmlEnumValue("Marine Air Group")
  MARINE___AIR___GROUP("Marine Air Group"),
  @XmlEnumValue("Marine Air Wing")
  MARINE___AIR___WING("Marine Air Wing"),
  @XmlEnumValue("Marine Expeditionary Brigade")
  MARINE___EXPEDITIONARY___BRIGADE("Marine Expeditionary Brigade"),
  @XmlEnumValue("Marine Expeditionary Force")
  MARINE___EXPEDITIONARY___FORCE("Marine Expeditionary Force"),
  @XmlEnumValue("Marine Expeditionary Unit")
  MARINE___EXPEDITIONARY___UNIT("Marine Expeditionary Unit"),
  @XmlEnumValue("Marine Forces")
  MARINE___FORCES("Marine Forces"),
  @XmlEnumValue("MEB DET Residual")
  MEB___DET___RESIDUAL("MEB DET Residual"),
  @XmlEnumValue("Merchant Ship")
  MERCHANT___SHIP("Merchant Ship"),
  @XmlEnumValue("MEU DET Residual")
  MEU___DET___RESIDUAL("MEU DET Residual"),
  @XmlEnumValue("Military Assistance Advisory Group")
  MILITARY___ASSISTANCE___ADVISORY___GROUP("Military Assistance Advisory Group"),
  @XmlEnumValue("Mission")
  MISSION("Mission"),
  @XmlEnumValue("MSC One-Time Charter")
  MSC___ONE___TIME___CHARTER("MSC One-Time Charter"),
  @XmlEnumValue("MSC Ship")
  MSC___SHIP("MSC Ship"),
  @XmlEnumValue("Museum")
  MUSEUM("Museum"),
  @XmlEnumValue("Navy Support Craft")
  NAVY___SUPPORT___CRAFT("Navy Support Craft"),
  @XmlEnumValue("No Significant Level")
  NO___SIGNIFICANT___LEVEL("No Significant Level"),
  @XmlEnumValue("Numbered Air Force")
  NUMBERED___AIR___FORCE("Numbered Air Force"),
  @XmlEnumValue("Numbered Army")
  NUMBERED___ARMY("Numbered Army"),
  @XmlEnumValue("Numbered Fleet")
  NUMBERED___FLEET("Numbered Fleet"),
  @XmlEnumValue("Observatory")
  OBSERVATORY("Observatory"),
  @XmlEnumValue("Office")
  OFFICE("Office"),
  @XmlEnumValue("Office Of Defense Cooperation")
  OFFICE___OF___DEFENSE___COOPERATION("Office Of Defense Cooperation"),
  @XmlEnumValue("Office Of Military Cooperation")
  OFFICE___OF___MILITARY___COOPERATION("Office Of Military Cooperation"),
  @XmlEnumValue("Officer")
  OFFICER("Officer"),
  @XmlEnumValue("Officer-In-Charge")
  OFFICER___IN___CHARGE("Officer-In-Charge"),
  @XmlEnumValue("Operating Location")
  OPERATING___LOCATION("Operating Location"),
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
  PORT___CAPTAIN("Port Captain"),
  @XmlEnumValue("Post Office")
  POST___OFFICE("Post Office"),
  @XmlEnumValue("Proving Ground")
  PROVING___GROUND("Proving Ground"),
  @XmlEnumValue("Range")
  RANGE("Range"),
  @XmlEnumValue("Regiment")
  REGIMENT("Regiment"),
  @XmlEnumValue("Regimental Combat Team")
  REGIMENTAL___COMBAT___TEAM("Regimental Combat Team"),
  @XmlEnumValue("Regimental Landing Team")
  REGIMENTAL___LANDING___TEAM("Regimental Landing Team"),
  @XmlEnumValue("Region")
  REGION("Region"),
  @XmlEnumValue("Region(al)")
  REGION___AL__("Region(al)"),
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
  SERVICE___COMPANY("Service Company"),
  @XmlEnumValue("Ship, Foreign/Merchant")
  SHIP____FOREIGN___MERCHANT("Ship, Foreign/Merchant"),
  @XmlEnumValue("Shipyard")
  SHIPYARD("Shipyard"),
  @XmlEnumValue("Shop")
  SHOP("Shop"),
  @XmlEnumValue("Shop Stores")
  SHOP___STORES("Shop Stores"),
  @XmlEnumValue("Special Troops")
  SPECIAL___TROOPS("Special Troops"),
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
  SUPPORT___COMMAND("Support Command"),
  @XmlEnumValue("System")
  SYSTEM("System"),
  @XmlEnumValue("Task Element")
  TASK___ELEMENT("Task Element"),
  @XmlEnumValue("Task Force")
  TASK___FORCE("Task Force"),
  @XmlEnumValue("Task Group")
  TASK___GROUP("Task Group"),
  @XmlEnumValue("Task Unit")
  TASK___UNIT("Task Unit"),
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
  US___SHIP("US Ship"),
  @XmlEnumValue("USCG Cutter")
  USCG___CUTTER("USCG Cutter"),
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
