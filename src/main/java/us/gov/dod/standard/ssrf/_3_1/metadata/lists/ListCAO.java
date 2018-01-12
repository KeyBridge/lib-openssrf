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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_1.antenna.Manufacturer;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.common.CaseNum;
import us.gov.dod.standard.ssrf._3_1.contact.Address;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;
import us.gov.dod.standard.ssrf._3_1.ssrequest.HostNation;
import us.gov.dod.standard.ssrf._3_1.toa.Administration;
import us.gov.dod.standard.ssrf._3_1.toa.Country;

/**
 * Enumerated values for fields using the ListCAO type.
 * <p>
 * Used in
 * {@link Address}, {@link Administration}, {@link CaseNum}, {@link CodeList}, {@link Country}, {@link ForceElement}, {@link HostNation}, {@link IntfReport}, {@link Location}, {@link Manufacturer}, {@link Note}, {@link SSReply}, {@link ServiceArea}, {@link UsingCountries}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCAO")
@XmlEnum
public enum ListCAO {

  /**
   * Afghanistan
   */
  @XmlEnumValue("AFG")
  AFG("AFG", "Afghanistan"),
  /**
   * Africa
   */
  @XmlEnumValue("FF")
  FF("FF", "Africa"),
  /**
   * Alabama
   */
  @XmlEnumValue("US-AL")
  US_AL("US-AL", "Alabama"),
  /**
   * Åland Islands
   */
  @XmlEnumValue("ALA")
  ALA("ALA", "Åland Islands"),
  /**
   * Alaska
   */
  @XmlEnumValue("US-AK")
  US_AK("US-AK", "Alaska"),
  /**
   * Albania
   */
  @XmlEnumValue("ALB")
  ALB("ALB", "Albania"),
  /**
   * Algeria
   */
  @XmlEnumValue("DZA")
  DZA("DZA", "Algeria"),
  /**
   * Allied Submarine Command
   */
  @XmlEnumValue("NT-ASC")
  NT_ASC("NT-ASC", "Allied Submarine Command"),
  /**
   * American Samoa
   */
  @XmlEnumValue("ASM")
  ASM("ASM", "American Samoa"),
  /**
   * Andorra
   */
  @XmlEnumValue("AND")
  AND("AND", "Andorra"),
  /**
   * Angola
   */
  @XmlEnumValue("AGO")
  AGO("AGO", "Angola"),
  /**
   * Anguilla
   */
  @XmlEnumValue("AIA")
  AIA("AIA", "Anguilla"),
  /**
   * Antarctic
   */
  @XmlEnumValue("ANTR")
  ANTR("ANTR", "Antarctic"),
  /**
   * Antarctic Ocean
   */
  @XmlEnumValue("4Z")
  FOUR_Z("4Z", "Antarctic Ocean"),
  /**
   * Antarctica Continent
   */
  @XmlEnumValue("ATA")
  ATA("ATA", "Antarctica Continent"),
  /**
   * Antigua and Barbuda
   */
  @XmlEnumValue("ATG")
  ATG("ATG", "Antigua and Barbuda"),
  /**
   * Arctic Ocean
   */
  @XmlEnumValue("5A")
  FIVE_A("5A", "Arctic Ocean"),
  /**
   * Argentine Republic
   */
  @XmlEnumValue("ARG")
  ARG("ARG", "Argentine Republic"),
  /**
   * Arizona
   */
  @XmlEnumValue("US-AZ")
  US_AZ("US-AZ", "Arizona"),
  /**
   * Arkansas
   */
  @XmlEnumValue("US-AR")
  US_AR("US-AR", "Arkansas"),
  /**
   * Armenia
   */
  @XmlEnumValue("ARM")
  ARM("ARM", "Armenia"),
  /**
   * Aruba
   */
  @XmlEnumValue("ABW")
  ABW("ABW", "Aruba"),
  /**
   * Ascension
   */
  @XmlEnumValue("SH-AC")
  SH_AC("SH-AC", "Ascension"),
  /**
   * Asia Continent
   */
  @XmlEnumValue("AB")
  AB("AB", "Asia Continent"),
  /**
   * Atlantic Ocean
   */
  @XmlEnumValue("9A")
  NINE_A("9A", "Atlantic Ocean"),
  /**
   * Australia
   */
  @XmlEnumValue("AUS")
  AUS("AUS", "Australia"),
  /**
   * Australia Continent
   */
  @XmlEnumValue("AUSC")
  AUSC("AUSC", "Australia Continent"),
  /**
   * Austria
   */
  @XmlEnumValue("AUT")
  AUT("AUT", "Austria"),
  /**
   * Azerbaijan
   */
  @XmlEnumValue("AZE")
  AZE("AZE", "Azerbaijan"),
  /**
   * Azores
   */
  @XmlEnumValue("PT-20")
  PT_20("PT-20", "Azores"),
  /**
   * Bahamas
   */
  @XmlEnumValue("BHS")
  BHS("BHS", "Bahamas"),
  /**
   * Bahrain
   */
  @XmlEnumValue("BHR")
  BHR("BHR", "Bahrain"),
  /**
   * Baker Island
   */
  @XmlEnumValue("UM-8")
  UM_8("UM-8", "Baker Island"),
  /**
   * Bangladesh
   */
  @XmlEnumValue("BGD")
  BGD("BGD", "Bangladesh"),
  /**
   * Barbados
   */
  @XmlEnumValue("BRB")
  BRB("BRB", "Barbados"),
  /**
   * Belarus
   */
  @XmlEnumValue("BLR")
  BLR("BLR", "Belarus"),
  /**
   * Belgium
   */
  @XmlEnumValue("BEL")
  BEL("BEL", "Belgium"),
  /**
   * Belize
   */
  @XmlEnumValue("BLZ")
  BLZ("BLZ", "Belize"),
  /**
   * Benin
   */
  @XmlEnumValue("BEN")
  BEN("BEN", "Benin"),
  /**
   * Bermuda
   */
  @XmlEnumValue("BMU")
  BMU("BMU", "Bermuda"),
  /**
   * Bhutan
   */
  @XmlEnumValue("BTN")
  BTN("BTN", "Bhutan"),
  /**
   * Biological Weapons Convention States
   */
  @XmlEnumValue("BWCS")
  BWCS("BWCS", "Biological Weapons Convention States"),
  /**
   * Bolivia
   */
  @XmlEnumValue("BOL")
  BOL("BOL", "Bolivia"),
  /**
   * Bonaire, Saint Eustatius and Saba
   */
  @XmlEnumValue("BES")
  BES("BES", "Bonaire, Saint Eustatius and Saba"),
  /**
   * Bosnia and Herzegovina
   */
  @XmlEnumValue("BIH")
  BIH("BIH", "Bosnia and Herzegovina"),
  /**
   * Botswana
   */
  @XmlEnumValue("BWA")
  BWA("BWA", "Botswana"),
  /**
   * Bouvet Island
   */
  @XmlEnumValue("BVT")
  BVT("BVT", "Bouvet Island"),
  /**
   * Brazil
   */
  @XmlEnumValue("BRA")
  BRA("BRA", "Brazil"),
  /**
   * British Indian Ocean Territory
   */
  @XmlEnumValue("IOT")
  IOT("IOT", "British Indian Ocean Territory"),
  /**
   * Brunei Darussalam
   */
  @XmlEnumValue("BRN")
  BRN("BRN", "Brunei Darussalam"),
  /**
   * Bulgaria
   */
  @XmlEnumValue("BGR")
  BGR("BGR", "Bulgaria"),
  /**
   * Burkina Faso
   */
  @XmlEnumValue("BFA")
  BFA("BFA", "Burkina Faso"),
  /**
   * Burundi
   */
  @XmlEnumValue("BDI")
  BDI("BDI", "Burundi"),
  /**
   * California
   */
  @XmlEnumValue("US-CA")
  US_CA("US-CA", "California"),
  /**
   * Cambodia
   */
  @XmlEnumValue("KHM")
  KHM("KHM", "Cambodia"),
  /**
   * Cameroon
   */
  @XmlEnumValue("CMR")
  CMR("CMR", "Cameroon"),
  /**
   * Canada
   */
  @XmlEnumValue("CAN")
  CAN("CAN", "Canada"),
  /**
   * Canary Islands
   */
  @XmlEnumValue("ES-CN")
  ES_CN("ES-CN", "Canary Islands"),
  /**
   * Cape Verde
   */
  @XmlEnumValue("CPV")
  CPV("CPV", "Cape Verde"),
  /**
   * Caribbean
   */
  @XmlEnumValue("CARB")
  CARB("CARB", "Caribbean"),
  /**
   * Caroline Islands
   */
  @XmlEnumValue("CAI")
  CAI("CAI", "Caroline Islands"),
  /**
   * Cayman Islands
   */
  @XmlEnumValue("CYM")
  CYM("CYM", "Cayman Islands"),
  /**
   * CCEB Nations (AUS, CAN, GBR, NZL, USA)
   */
  @XmlEnumValue("CCEB")
  CCEB("CCEB", "CCEB Nations (AUS, CAN, GBR, NZL, USA)"),
  /**
   * Central African Republic
   */
  @XmlEnumValue("CAF")
  CAF("CAF", "Central African Republic"),
  /**
   * Central America
   */
  @XmlEnumValue("CAM")
  CAM("CAM", "Central America"),
  /**
   * Chad
   */
  @XmlEnumValue("TCD")
  TCD("TCD", "Chad"),
  /**
   * Chemical Weapons Convention States
   */
  @XmlEnumValue("CWCS")
  CWCS("CWCS", "Chemical Weapons Convention States"),
  /**
   * Chile
   */
  @XmlEnumValue("CHL")
  CHL("CHL", "Chile"),
  /**
   * China
   */
  @XmlEnumValue("CHN")
  CHN("CHN", "China"),
  /**
   * Christmas Island
   */
  @XmlEnumValue("CXR")
  CXR("CXR", "Christmas Island"),
  /**
   * Civilian Protection Monitoring Team for Sudan
   */
  @XmlEnumValue("CPMT")
  CPMT("CPMT", "Civilian Protection Monitoring Team for Sudan"),
  /**
   * Clipperton Island
   */
  @XmlEnumValue("CP")
  CP("CP", "Clipperton Island"),
  /**
   * Cocos (Keeling) Islands
   */
  @XmlEnumValue("CCK")
  CCK("CCK", "Cocos (Keeling) Islands"),
  /**
   * Colombia
   */
  @XmlEnumValue("COL")
  COL("COL", "Colombia"),
  /**
   * Colorado
   */
  @XmlEnumValue("US-CO")
  US_CO("US-CO", "Colorado"),
  /**
   * Combined Maritime Forces
   */
  @XmlEnumValue("CMFC")
  CMFC("CMFC", "Combined Maritime Forces"),
  /**
   * Comoros
   */
  @XmlEnumValue("COM")
  COM("COM", "Comoros"),
  /**
   * Congo
   */
  @XmlEnumValue("COG")
  COG("COG", "Congo"),
  /**
   * Congo (Democratic Republic of the)
   */
  @XmlEnumValue("COD")
  COD("COD", "Congo (Democratic Republic of the)"),
  /**
   * Connecticut
   */
  @XmlEnumValue("US-CT")
  US_CT("US-CT", "Connecticut"),
  /**
   * Cook Islands
   */
  @XmlEnumValue("COK")
  COK("COK", "Cook Islands"),
  /**
   * Cooperative Maritime Forces Pacific
   */
  @XmlEnumValue("CMFP")
  CMFP("CMFP", "Cooperative Maritime Forces Pacific"),
  /**
   * Costa Rica
   */
  @XmlEnumValue("CRI")
  CRI("CRI", "Costa Rica"),
  /**
   * Croatia
   */
  @XmlEnumValue("HRV")
  HRV("HRV", "Croatia"),
  /**
   * Crozet Archipelago
   */
  @XmlEnumValue("FR-TF")
  FR_TF("FR-TF", "Crozet Archipelago"),
  /**
   * Cuba
   */
  @XmlEnumValue("CUB")
  CUB("CUB", "Cuba"),
  /**
   * Curaçao
   */
  @XmlEnumValue("CUW")
  CUW("CUW", "Curaçao"),
  /**
   * Cyprus (See footnote 1)
   */
  @XmlEnumValue("CYP")
  CYP("CYP", "Cyprus (See footnote 1)"),
  /**
   * Czech Republic
   */
  @XmlEnumValue("CZE")
  CZE("CZE", "Czech Republic"),
  /**
   * Delaware
   */
  @XmlEnumValue("US-DE")
  US_DE("US-DE", "Delaware"),
  /**
   * Denmark
   */
  @XmlEnumValue("DNK")
  DNK("DNK", "Denmark"),
  /**
   * Diego Garcia
   */
  @XmlEnumValue("DG")
  DG("DG", "Diego Garcia"),
  /**
   * District of Columbia
   */
  @XmlEnumValue("US-DC")
  US_DC("US-DC", "District of Columbia"),
  /**
   * Djibouti
   */
  @XmlEnumValue("DJI")
  DJI("DJI", "Djibouti"),
  /**
   * Dominica
   */
  @XmlEnumValue("DMA")
  DMA("DMA", "Dominica"),
  /**
   * Dominican Republic
   */
  @XmlEnumValue("DOM")
  DOM("DOM", "Dominican Republic"),
  /**
   * East Timor
   */
  @XmlEnumValue("TLS")
  TLS("TLS", "East Timor"),
  /**
   * Easter Island
   */
  @XmlEnumValue("EAS")
  EAS("EAS", "Easter Island"),
  /**
   * Ecuador
   */
  @XmlEnumValue("ECU")
  ECU("ECU", "Ecuador"),
  /**
   * Egypt
   */
  @XmlEnumValue("EGY")
  EGY("EGY", "Egypt"),
  /**
   * El Salvador
   */
  @XmlEnumValue("SLV")
  SLV("SLV", "El Salvador"),
  /**
   * Equatorial Guinea
   */
  @XmlEnumValue("GNQ")
  GNQ("GNQ", "Equatorial Guinea"),
  /**
   * Eritrea
   */
  @XmlEnumValue("ERI")
  ERI("ERI", "Eritrea"),
  /**
   * Estonia
   */
  @XmlEnumValue("EST")
  EST("EST", "Estonia"),
  /**
   * Ethiopia
   */
  @XmlEnumValue("ETH")
  ETH("ETH", "Ethiopia"),
  /**
   * Europe Continent
   */
  @XmlEnumValue("EE")
  EE("EE", "Europe Continent"),
  /**
   * European Union DARFUR
   */
  @XmlEnumValue("EUDA")
  EUDA("EUDA", "European Union DARFUR"),
  /**
   * European Union Stabilization Forces in Bosnia
   */
  @XmlEnumValue("EFOR")
  EFOR("EFOR", "European Union Stabilization Forces in Bosnia"),
  /**
   * Falkland Islands (Malvinas)
   */
  @XmlEnumValue("FLK")
  FLK("FLK", "Falkland Islands (Malvinas)"),
  /**
   * Faroe Islands
   */
  @XmlEnumValue("FRO")
  FRO("FRO", "Faroe Islands"),
  /**
   * Fiji
   */
  @XmlEnumValue("FJI")
  FJI("FJI", "Fiji"),
  /**
   * Finland
   */
  @XmlEnumValue("FIN")
  FIN("FIN", "Finland"),
  /**
   * FIVE EYES (USA, CAN, GBR, AUS, NZL)
   */
  @XmlEnumValue("FVEY")
  FVEY("FVEY", "FIVE EYES (USA, CAN, GBR, AUS, NZL)"),
  /**
   * Florida
   */
  @XmlEnumValue("US-FL")
  US_FL("US-FL", "Florida"),
  /**
   * FOUR EYES (USA, CAN, GBR, AUS)
   */
  @XmlEnumValue("ACGU")
  ACGU("ACGU", "FOUR EYES (USA, CAN, GBR, AUS)"),
  /**
   * France
   */
  @XmlEnumValue("FRA")
  FRA("FRA", "France"),
  /**
   * French Guiana
   */
  @XmlEnumValue("GUF")
  GUF("GUF", "French Guiana"),
  /**
   * French Polynesia
   */
  @XmlEnumValue("PYF")
  PYF("PYF", "French Polynesia"),
  /**
   * French Southern Territories
   */
  @XmlEnumValue("ATF")
  ATF("ATF", "French Southern Territories"),
  /**
   * Gabon
   */
  @XmlEnumValue("GAB")
  GAB("GAB", "Gabon"),
  /**
   * Gambia
   */
  @XmlEnumValue("GMB")
  GMB("GMB", "Gambia"),
  /**
   * Georgia
   */
  @XmlEnumValue("GEO")
  GEO("GEO", "Georgia"),
  /**
   * Georgia
   */
  @XmlEnumValue("US-GA")
  US_GA("US-GA", "Georgia"),
  /**
   * Geostationary Satellite
   */
  @XmlEnumValue("GEOS")
  GEOS("GEOS", "Geostationary Satellite"),
  /**
   * Germany
   */
  @XmlEnumValue("DEU")
  DEU("DEU", "Germany"),
  /**
   * Ghana
   */
  @XmlEnumValue("GHA")
  GHA("GHA", "Ghana"),
  /**
   * Gibraltar
   */
  @XmlEnumValue("GIB")
  GIB("GIB", "Gibraltar"),
  /**
   * Global Counter-Terrorism Forces
   */
  @XmlEnumValue("GCTF")
  GCTF("GCTF", "Global Counter-Terrorism Forces"),
  /**
   * Global Maritime Interception Forces
   */
  @XmlEnumValue("GMIF")
  GMIF("GMIF", "Global Maritime Interception Forces"),
  /**
   * Great Lakes
   */
  @XmlEnumValue("9Z")
  NINE_Z("9Z", "Great Lakes"),
  /**
   * Greece
   */
  @XmlEnumValue("GRC")
  GRC("GRC", "Greece"),
  /**
   * Greenland
   */
  @XmlEnumValue("GRL")
  GRL("GRL", "Greenland"),
  /**
   * Grenada
   */
  @XmlEnumValue("GRD")
  GRD("GRD", "Grenada"),
  /**
   * Guadeloupe
   */
  @XmlEnumValue("GLP")
  GLP("GLP", "Guadeloupe"),
  /**
   * Guam
   */
  @XmlEnumValue("GUM")
  GUM("GUM", "Guam"),
  /**
   * Guatemala
   */
  @XmlEnumValue("GTM")
  GTM("GTM", "Guatemala"),
  /**
   * Guernsey
   */
  @XmlEnumValue("GGY")
  GGY("GGY", "Guernsey"),
  /**
   * Guinea
   */
  @XmlEnumValue("GIN")
  GIN("GIN", "Guinea"),
  /**
   * Guinea-Bissau
   */
  @XmlEnumValue("GNB")
  GNB("GNB", "Guinea-Bissau"),
  /**
   * Gulf of Mexico
   */
  @XmlEnumValue("1M")
  ONE_M("1M", "Gulf of Mexico"),
  /**
   * Guyana
   */
  @XmlEnumValue("GUY")
  GUY("GUY", "Guyana"),
  /**
   * Haiti
   */
  @XmlEnumValue("HTI")
  HTI("HTI", "Haiti"),
  /**
   * Hawaii
   */
  @XmlEnumValue("US-HI")
  US_HI("US-HI", "Hawaii"),
  /**
   * Heard and McDonald Islands
   */
  @XmlEnumValue("HMD")
  HMD("HMD", "Heard and McDonald Islands"),
  /**
   * Hemisphere East
   */
  @XmlEnumValue("HEME")
  HEME("HEME", "Hemisphere East"),
  /**
   * Hemisphere North
   */
  @XmlEnumValue("HEMN")
  HEMN("HEMN", "Hemisphere North"),
  /**
   * Hemisphere South
   */
  @XmlEnumValue("HEMS")
  HEMS("HEMS", "Hemisphere South"),
  /**
   * Hemisphere West
   */
  @XmlEnumValue("HEMW")
  HEMW("HEMW", "Hemisphere West"),
  /**
   * Honduras
   */
  @XmlEnumValue("HND")
  HND("HND", "Honduras"),
  /**
   * Hong Kong
   */
  @XmlEnumValue("HKG")
  HKG("HKG", "Hong Kong"),
  /**
   * Howland Island
   */
  @XmlEnumValue("UM-84")
  UM_84("UM-84", "Howland Island"),
  /**
   * Hungary
   */
  @XmlEnumValue("HUN")
  HUN("HUN", "Hungary"),
  /**
   * Iceland
   */
  @XmlEnumValue("ISL")
  ISL("ISL", "Iceland"),
  /**
   * Idaho
   */
  @XmlEnumValue("US-ID")
  US_ID("US-ID", "Idaho"),
  /**
   * Illinois
   */
  @XmlEnumValue("US-IL")
  US_IL("US-IL", "Illinois"),
  /**
   * India
   */
  @XmlEnumValue("IND")
  IND("IND", "India"),
  /**
   * Indian Ocean
   */
  @XmlEnumValue("6A")
  SIX_A("6A", "Indian Ocean"),
  /**
   * Indiana
   */
  @XmlEnumValue("US-IN")
  US_IN("US-IN", "Indiana"),
  /**
   * Indonesia
   */
  @XmlEnumValue("IDN")
  IDN("IDN", "Indonesia"),
  /**
   * International
   */
  @XmlEnumValue("INTL")
  INTL("INTL", "International"),
  /**
   * International Civil Aviation Organization
   */
  @XmlEnumValue("ICAO")
  ICAO("ICAO", "International Civil Aviation Organization"),
  /**
   * International Events Security Coalition
   */
  @XmlEnumValue("IESC")
  IESC("IESC", "International Events Security Coalition"),
  /**
   * International Telecommunications Union
   */
  @XmlEnumValue("ITU")
  ITU("ITU", "International Telecommunications Union"),
  /**
   * Iowa
   */
  @XmlEnumValue("US-IA")
  US_IA("US-IA", "Iowa"),
  /**
   * Iran
   */
  @XmlEnumValue("IRN")
  IRN("IRN", "Iran"),
  /**
   * Iraq
   */
  @XmlEnumValue("IRQ")
  IRQ("IRQ", "Iraq"),
  /**
   * Ireland
   */
  @XmlEnumValue("IRL")
  IRL("IRL", "Ireland"),
  /**
   * ISAF for Afghanistan
   */
  @XmlEnumValue("ISAF-AFG")
  ISAF_AFG("ISAF-AFG", "ISAF for Afghanistan"),
  /**
   * Isle of Man
   */
  @XmlEnumValue("IMN")
  IMN("IMN", "Isle of Man"),
  /**
   * Israel
   */
  @XmlEnumValue("ISR")
  ISR("ISR", "Israel"),
  /**
   * Italy
   */
  @XmlEnumValue("ITA")
  ITA("ITA", "Italy"),
  /**
   * ITU Region 1
   */
  @XmlEnumValue("ITU1")
  ITU1("ITU1", "ITU Region 1"),
  /**
   * ITU Region 2
   */
  @XmlEnumValue("ITU2")
  ITU2("ITU2", "ITU Region 2"),
  /**
   * ITU Region 3
   */
  @XmlEnumValue("ITU3")
  ITU3("ITU3", "ITU Region 3"),
  /**
   * Ivory Coast
   */
  @XmlEnumValue("CIV")
  CIV("CIV", "Ivory Coast"),
  /**
   * Jamaica
   */
  @XmlEnumValue("JAM")
  JAM("JAM", "Jamaica"),
  /**
   * Japan
   */
  @XmlEnumValue("JPN")
  JPN("JPN", "Japan"),
  /**
   * Jarvis Island
   */
  @XmlEnumValue("UM-86")
  UM_86("UM-86", "Jarvis Island"),
  /**
   * Jersey
   */
  @XmlEnumValue("JEY")
  JEY("JEY", "Jersey"),
  /**
   * Johnston Atoll
   */
  @XmlEnumValue("UM-67")
  UM_67("UM-67", "Johnston Atoll"),
  /**
   * Jordan
   */
  @XmlEnumValue("JOR")
  JOR("JOR", "Jordan"),
  /**
   * Kansas
   */
  @XmlEnumValue("US-KS")
  US_KS("US-KS", "Kansas"),
  /**
   * Kazakhstan
   */
  @XmlEnumValue("KAZ")
  KAZ("KAZ", "Kazakhstan"),
  /**
   * Kentucky
   */
  @XmlEnumValue("US-KY")
  US_KY("US-KY", "Kentucky"),
  /**
   * Kenya
   */
  @XmlEnumValue("KEN")
  KEN("KEN", "Kenya"),
  /**
   * Kerguelen Islands
   */
  @XmlEnumValue("KER")
  KER("KER", "Kerguelen Islands"),
  /**
   * Kingman Reef
   */
  @XmlEnumValue("UM-89")
  UM_89("UM-89", "Kingman Reef"),
  /**
   * Kiribati
   */
  @XmlEnumValue("KIR")
  KIR("KIR", "Kiribati"),
  /**
   * Korea, North
   */
  @XmlEnumValue("PRK")
  PRK("PRK", "Korea, North"),
  /**
   * Korea, South
   */
  @XmlEnumValue("KOR")
  KOR("KOR", "Korea, South"),
  /**
   * Kosovo
   */
  @XmlEnumValue("YU-KM")
  YU_KM("YU-KM", "Kosovo"),
  /**
   * Kuwait
   */
  @XmlEnumValue("KWT")
  KWT("KWT", "Kuwait"),
  /**
   * Kyrgyzstan
   */
  @XmlEnumValue("KGZ")
  KGZ("KGZ", "Kyrgyzstan"),
  /**
   * Lake Erie
   */
  @XmlEnumValue("9E")
  NINE_E("9E", "Lake Erie"),
  /**
   * Lake Huron
   */
  @XmlEnumValue("9H")
  NINE_H("9H", "Lake Huron"),
  /**
   * Lake Michigan
   */
  @XmlEnumValue("9M")
  NINE_M("9M", "Lake Michigan"),
  /**
   * Lake Ontario
   */
  @XmlEnumValue("9N")
  NINE_N("9N", "Lake Ontario"),
  /**
   * Lake Superior
   */
  @XmlEnumValue("9S")
  NINE_S("9S", "Lake Superior"),
  /**
   * Laos
   */
  @XmlEnumValue("LAO")
  LAO("LAO", "Laos"),
  /**
   * Latvia
   */
  @XmlEnumValue("LVA")
  LVA("LVA", "Latvia"),
  /**
   * Lebanon
   */
  @XmlEnumValue("LBN")
  LBN("LBN", "Lebanon"),
  /**
   * Lesotho
   */
  @XmlEnumValue("LSO")
  LSO("LSO", "Lesotho"),
  /**
   * Liberia
   */
  @XmlEnumValue("LBR")
  LBR("LBR", "Liberia"),
  /**
   * Libya
   */
  @XmlEnumValue("LBY")
  LBY("LBY", "Libya"),
  /**
   * Liechtenstein
   */
  @XmlEnumValue("LIE")
  LIE("LIE", "Liechtenstein"),
  /**
   * Lithuania
   */
  @XmlEnumValue("LTU")
  LTU("LTU", "Lithuania"),
  /**
   * Louisiana
   */
  @XmlEnumValue("US-LA")
  US_LA("US-LA", "Louisiana"),
  /**
   * Luxembourg
   */
  @XmlEnumValue("LUX")
  LUX("LUX", "Luxembourg"),
  /**
   * Macao
   */
  @XmlEnumValue("MAC")
  MAC("MAC", "Macao"),
  /**
   * Madagascar
   */
  @XmlEnumValue("MDG")
  MDG("MDG", "Madagascar"),
  /**
   * Madeira
   */
  @XmlEnumValue("PT-30")
  PT_30("PT-30", "Madeira"),
  /**
   * Maine
   */
  @XmlEnumValue("US-ME")
  US_ME("US-ME", "Maine"),
  /**
   * Malawi
   */
  @XmlEnumValue("MWI")
  MWI("MWI", "Malawi"),
  /**
   * Malaysia
   */
  @XmlEnumValue("MYS")
  MYS("MYS", "Malaysia"),
  /**
   * Maldives
   */
  @XmlEnumValue("MDV")
  MDV("MDV", "Maldives"),
  /**
   * Mali
   */
  @XmlEnumValue("MLI")
  MLI("MLI", "Mali"),
  /**
   * Malta
   */
  @XmlEnumValue("MLT")
  MLT("MLT", "Malta"),
  /**
   * Mariana Islands (excluding Guam)
   */
  @XmlEnumValue("US-MP")
  US_MP("US-MP", "Mariana Islands (excluding Guam)"),
  /**
   * Marion Island
   */
  @XmlEnumValue("MAI")
  MAI("MAI", "Marion Island"),
  /**
   * Marshall Islands
   */
  @XmlEnumValue("MHL")
  MHL("MHL", "Marshall Islands"),
  /**
   * Martinique
   */
  @XmlEnumValue("MTQ")
  MTQ("MTQ", "Martinique"),
  /**
   * Maryland
   */
  @XmlEnumValue("US-MD")
  US_MD("US-MD", "Maryland"),
  /**
   * Massachusetts
   */
  @XmlEnumValue("US-MA")
  US_MA("US-MA", "Massachusetts"),
  /**
   * Mauritania
   */
  @XmlEnumValue("MRT")
  MRT("MRT", "Mauritania"),
  /**
   * Mauritius
   */
  @XmlEnumValue("MUS")
  MUS("MUS", "Mauritius"),
  /**
   * Mayotte
   */
  @XmlEnumValue("MYT")
  MYT("MYT", "Mayotte"),
  /**
   * Mediterranean Sea
   */
  @XmlEnumValue("89")
  EIGHT_9("89", "Mediterranean Sea"),
  /**
   * Mexico
   */
  @XmlEnumValue("MEX")
  MEX("MEX", "Mexico"),
  /**
   * Michigan
   */
  @XmlEnumValue("US-MI")
  US_MI("US-MI", "Michigan"),
  /**
   * Micronesia
   */
  @XmlEnumValue("FSM")
  FSM("FSM", "Micronesia"),
  /**
   * Midway Islands
   */
  @XmlEnumValue("UM-71")
  UM_71("UM-71", "Midway Islands"),
  /**
   * Minnesota
   */
  @XmlEnumValue("US-MN")
  US_MN("US-MN", "Minnesota"),
  /**
   * Mississippi
   */
  @XmlEnumValue("US-MS")
  US_MS("US-MS", "Mississippi"),
  /**
   * Missouri
   */
  @XmlEnumValue("US-MO")
  US_MO("US-MO", "Missouri"),
  /**
   * Moldova
   */
  @XmlEnumValue("MDA")
  MDA("MDA", "Moldova"),
  /**
   * Monaco
   */
  @XmlEnumValue("MCO")
  MCO("MCO", "Monaco"),
  /**
   * Mongolia
   */
  @XmlEnumValue("MNG")
  MNG("MNG", "Mongolia"),
  /**
   * Montana
   */
  @XmlEnumValue("US-MT")
  US_MT("US-MT", "Montana"),
  /**
   * Montenegro
   */
  @XmlEnumValue("MNE")
  MNE("MNE", "Montenegro"),
  /**
   * Montserrat
   */
  @XmlEnumValue("MSR")
  MSR("MSR", "Montserrat"),
  /**
   * Morocco
   */
  @XmlEnumValue("MAR")
  MAR("MAR", "Morocco"),
  /**
   * Mozambique
   */
  @XmlEnumValue("MOZ")
  MOZ("MOZ", "Mozambique"),
  /**
   * Multi-Lateral Enduring Contingency
   */
  @XmlEnumValue("MLEC")
  MLEC("MLEC", "Multi-Lateral Enduring Contingency"),
  /**
   * Multinational Coalition Forces - Iraq
   */
  @XmlEnumValue("MCFI")
  MCFI("MCFI", "Multinational Coalition Forces - Iraq"),
  /**
   * Multinational Interim Force Haiti
   */
  @XmlEnumValue("MIFH")
  MIFH("MIFH", "Multinational Interim Force Haiti"),
  /**
   * Multiple Areas
   */
  @XmlEnumValue("MULT")
  MULT("MULT", "Multiple Areas"),
  /**
   * Myanmar
   */
  @XmlEnumValue("MMR")
  MMR("MMR", "Myanmar"),
  /**
   * Namibia
   */
  @XmlEnumValue("NAM")
  NAM("NAM", "Namibia"),
  /**
   * NATO AEW&amp;C Force Command
   */
  @XmlEnumValue("NT-AEW")
  NT_AEW("NT-AEW", "NATO AEW&C Force Command"),
  /**
   * NATO Air Ground Surveillance (Italy)
   */
  @XmlEnumValue("NT-AGS")
  NT_AGS("NT-AGS", "NATO Air Ground Surveillance (Italy)"),
  /**
   * NATO AIRCOM Ramstein
   */
  @XmlEnumValue("NT-AC")
  NT_AC("NT-AC", "NATO AIRCOM Ramstein"),
  /**
   * NATO Allied Command Operations (ACO)
   */
  @XmlEnumValue("NT-ACO")
  NT_ACO("NT-ACO", "NATO Allied Command Operations (ACO)"),
  /**
   * NATO Allied Command Transformation (ACT)
   */
  @XmlEnumValue("NT-ACT")
  NT_ACT("NT-ACT", "NATO Allied Command Transformation (ACT)"),
  /**
   * NATO Allied Submarine Command
   */
  @XmlEnumValue("NT-SC")
  NT_SC("NT-SC", "NATO Allied Submarine Command"),
  /**
   * NATO CAOC Germany
   */
  @XmlEnumValue("NT-A-DEU")
  NT_A_DEU("NT-A-DEU", "NATO CAOC Germany"),
  /**
   * NATO CAOC Spain
   */
  @XmlEnumValue("NT-A-ESP")
  NT_A_ESP("NT-A-ESP", "NATO CAOC Spain"),
  /**
   * NATO CIS Group (Belgium)
   */
  @XmlEnumValue("NT-CISG")
  NT_CISG("NT-CISG", "NATO CIS Group (Belgium)"),
  /**
   * NATO Communications &amp; Information Agency
   */
  @XmlEnumValue("NT-CIA")
  NT_CIA("NT-CIA", "NATO Communications & Information Agency"),
  /**
   * NATO DACC Italy
   */
  @XmlEnumValue("NT-A-ITA")
  NT_A_ITA("NT-A-ITA", "NATO DACC Italy"),
  /**
   * NATO D-AOC Germany
   */
  @XmlEnumValue("NT-D-DEU")
  NT_D_DEU("NT-D-DEU", "NATO D-AOC Germany"),
  /**
   * NATO D-AOC Spain
   */
  @XmlEnumValue("NT-D-ESP")
  NT_D_ESP("NT-D-ESP", "NATO D-AOC Spain"),
  /**
   * NATO European Nations (NATO, excluding USA, CAN, ISL)
   */
  @XmlEnumValue("NT-EUR")
  NT_EUR("NT-EUR", "NATO European Nations (NATO, excluding USA, CAN, ISL)"),
  /**
   * NATO Headquarters
   */
  @XmlEnumValue("NT-HQ")
  NT_HQ("NT-HQ", "NATO Headquarters"),
  /**
   * NATO HQ Spectrum Management
   */
  @XmlEnumValue("NT-HQ-SM")
  NT_HQ_SM("NT-HQ-SM", "NATO HQ Spectrum Management"),
  /**
   * NATO Joint Force HQ Italy
   */
  @XmlEnumValue("NT-J-ITA")
  NT_J_ITA("NT-J-ITA", "NATO Joint Force HQ Italy"),
  /**
   * NATO Joint Force HQ Netherlands
   */
  @XmlEnumValue("NT-J-NLD")
  NT_J_NLD("NT-J-NLD", "NATO Joint Force HQ Netherlands"),
  /**
   * NATO LANDCOM Izmir
   */
  @XmlEnumValue("NT-LC")
  NT_LC("NT-LC", "NATO LANDCOM Izmir"),
  /**
   * NATO MARCOM Northwood
   */
  @XmlEnumValue("NT-MC")
  NT_MC("NT-MC", "NATO MARCOM Northwood"),
  /**
   * NATO Nations (28 Nations: ALB, BEL, BGR, CAN, CZE, DEU, DNK, ESP, EST, FRA,
   * GBR, GRC, HUN, HRV, ITA, ISL, LUX, LTU, LVA, NLD, NOR, POL, PRT, ROU, SVK,
   * SVN, TUR, USA)
   */
  @XmlEnumValue("NATO")
  NATO("NATO", "NATO Nations (28 Nations: ALB, BEL, BGR, CAN, CZE, DEU, DNK, ESP, EST, FRA, GBR, GRC, HUN, HRV, ITA, ISL, LUX, LTU, LVA, NLD, NOR, POL, PRT, ROU, SVK, SVN, TUR, USA)"),
  /**
   * NATO Signals Battalion Germany
   */
  @XmlEnumValue("NT-S-DEU")
  NT_S_DEU("NT-S-DEU", "NATO Signals Battalion Germany"),
  /**
   * NATO Signals Battalion Italy
   */
  @XmlEnumValue("NT-S-ITA")
  NT_S_ITA("NT-S-ITA", "NATO Signals Battalion Italy"),
  /**
   * NATO Signals Battalion Poland
   */
  @XmlEnumValue("NT-S-POL")
  NT_S_POL("NT-S-POL", "NATO Signals Battalion Poland"),
  /**
   * NATO Strike Force (STRIKFORNATO)
   */
  @XmlEnumValue("NT-STF")
  NT_STF("NT-STF", "NATO Strike Force (STRIKFORNATO)"),
  /**
   * Nauru
   */
  @XmlEnumValue("NRU")
  NRU("NRU", "Nauru"),
  /**
   * Navassa Island
   */
  @XmlEnumValue("UM-76")
  UM_76("UM-76", "Navassa Island"),
  /**
   * Nebraska
   */
  @XmlEnumValue("US-NE")
  US_NE("US-NE", "Nebraska"),
  /**
   * Nepal
   */
  @XmlEnumValue("NPL")
  NPL("NPL", "Nepal"),
  /**
   * Netherlands
   */
  @XmlEnumValue("NLD")
  NLD("NLD", "Netherlands"),
  /**
   * Netherlands Antilles
   */
  @XmlEnumValue("ANT")
  ANT("ANT", "Netherlands Antilles"),
  /**
   * Nevada
   */
  @XmlEnumValue("US-NV")
  US_NV("US-NV", "Nevada"),
  /**
   * New Caledonia
   */
  @XmlEnumValue("NCL")
  NCL("NCL", "New Caledonia"),
  /**
   * New Hampshire
   */
  @XmlEnumValue("US-NH")
  US_NH("US-NH", "New Hampshire"),
  /**
   * New Jersey
   */
  @XmlEnumValue("US-NJ")
  US_NJ("US-NJ", "New Jersey"),
  /**
   * New Mexico
   */
  @XmlEnumValue("US-NM")
  US_NM("US-NM", "New Mexico"),
  /**
   * New York
   */
  @XmlEnumValue("US-NY")
  US_NY("US-NY", "New York"),
  /**
   * New Zealand
   */
  @XmlEnumValue("NZL")
  NZL("NZL", "New Zealand"),
  /**
   * Nicaragua
   */
  @XmlEnumValue("NIC")
  NIC("NIC", "Nicaragua"),
  /**
   * Niger
   */
  @XmlEnumValue("NER")
  NER("NER", "Niger"),
  /**
   * Nigeria
   */
  @XmlEnumValue("NGA")
  NGA("NGA", "Nigeria"),
  /**
   * Niue
   */
  @XmlEnumValue("NIU")
  NIU("NIU", "Niue"),
  /**
   * Non-Geostationary Satellite
   */
  @XmlEnumValue("NGEO")
  NGEO("NGEO", "Non-Geostationary Satellite"),
  /**
   * Norfolk Island
   */
  @XmlEnumValue("NFK")
  NFK("NFK", "Norfolk Island"),
  /**
   * North African Counter-Terrorism Forces
   */
  @XmlEnumValue("NACT")
  NACT("NACT", "North African Counter-Terrorism Forces"),
  /**
   * North America Continent
   */
  @XmlEnumValue("NN")
  NN("NN", "North America Continent"),
  /**
   * North Carolina
   */
  @XmlEnumValue("US-NC")
  US_NC("US-NC", "North Carolina"),
  /**
   * North Dakota
   */
  @XmlEnumValue("US-ND")
  US_ND("US-ND", "North Dakota"),
  /**
   * Northern Mariana Islands
   */
  @XmlEnumValue("MNP")
  MNP("MNP", "Northern Mariana Islands"),
  /**
   * Norway
   */
  @XmlEnumValue("NOR")
  NOR("NOR", "Norway"),
  /**
   * Oceania
   */
  @XmlEnumValue("UU")
  UU("UU", "Oceania"),
  /**
   * Ohio
   */
  @XmlEnumValue("US-OH")
  US_OH("US-OH", "Ohio"),
  /**
   * Oklahoma
   */
  @XmlEnumValue("US-OK")
  US_OK("US-OK", "Oklahoma"),
  /**
   * Oman
   */
  @XmlEnumValue("OMN")
  OMN("OMN", "Oman"),
  /**
   * Oregon
   */
  @XmlEnumValue("US-OR")
  US_OR("US-OR", "Oregon"),
  /**
   * Other - See Remarks
   */
  @XmlEnumValue("OTH")
  OTH("OTH", "Other - See Remarks"),
  /**
   * Pacific Ocean
   */
  @XmlEnumValue("4O")
  FOUR_O("4O", "Pacific Ocean"),
  /**
   * Pakistan
   */
  @XmlEnumValue("PAK")
  PAK("PAK", "Pakistan"),
  /**
   * Palau
   */
  @XmlEnumValue("PLW")
  PLW("PLW", "Palau"),
  /**
   * Palestine
   */
  @XmlEnumValue("PSE")
  PSE("PSE", "Palestine"),
  /**
   * Palmyra Atoll
   */
  @XmlEnumValue("UM-95")
  UM_95("UM-95", "Palmyra Atoll"),
  /**
   * Panama
   */
  @XmlEnumValue("PAN")
  PAN("PAN", "Panama"),
  /**
   * Papua New Guinea
   */
  @XmlEnumValue("PNG")
  PNG("PNG", "Papua New Guinea"),
  /**
   * Paraguay
   */
  @XmlEnumValue("PRY")
  PRY("PRY", "Paraguay"),
  /**
   * Pennsylvania
   */
  @XmlEnumValue("US-PA")
  US_PA("US-PA", "Pennsylvania"),
  /**
   * Peru
   */
  @XmlEnumValue("PER")
  PER("PER", "Peru"),
  /**
   * Philippines
   */
  @XmlEnumValue("PHL")
  PHL("PHL", "Philippines"),
  /**
   * Phoenix Islands
   */
  @XmlEnumValue("KI-P")
  KI_P("KI-P", "Phoenix Islands"),
  /**
   * Pitcairn Island
   */
  @XmlEnumValue("PCN")
  PCN("PCN", "Pitcairn Island"),
  /**
   * Poland
   */
  @XmlEnumValue("POL")
  POL("POL", "Poland"),
  /**
   * Portugal
   */
  @XmlEnumValue("PRT")
  PRT("PRT", "Portugal"),
  /**
   * Puerto Rico
   */
  @XmlEnumValue("PRI")
  PRI("PRI", "Puerto Rico"),
  /**
   * Qatar
   */
  @XmlEnumValue("QAT")
  QAT("QAT", "Qatar"),
  /**
   * Radio Astronomy
   */
  @XmlEnumValue("RCVR")
  RCVR("RCVR", "Radio Astronomy"),
  /**
   * Réunion
   */
  @XmlEnumValue("REU")
  REU("REU", "Réunion"),
  /**
   * Rhode Island
   */
  @XmlEnumValue("US-RI")
  US_RI("US-RI", "Rhode Island"),
  /**
   * Rodrigues
   */
  @XmlEnumValue("MU-RO")
  MU_RO("MU-RO", "Rodrigues"),
  /**
   * ROK/US Combined Forces Command, Korea
   */
  @XmlEnumValue("CFCK")
  CFCK("CFCK", "ROK/US Combined Forces Command, Korea"),
  /**
   * Romania
   */
  @XmlEnumValue("ROU")
  ROU("ROU", "Romania"),
  /**
   * Russian Federation
   */
  @XmlEnumValue("RUS")
  RUS("RUS", "Russian Federation"),
  /**
   * Rwanda
   */
  @XmlEnumValue("RWA")
  RWA("RWA", "Rwanda"),
  /**
   * Saint Barthélemy
   */
  @XmlEnumValue("BLM")
  BLM("BLM", "Saint Barthélemy"),
  /**
   * Saint Helena
   */
  @XmlEnumValue("SHN")
  SHN("SHN", "Saint Helena"),
  /**
   * Saint Kitts and Nevis
   */
  @XmlEnumValue("KNA")
  KNA("KNA", "Saint Kitts and Nevis"),
  /**
   * Saint Lucia
   */
  @XmlEnumValue("LCA")
  LCA("LCA", "Saint Lucia"),
  /**
   * Saint Martin (French part)
   */
  @XmlEnumValue("MAF")
  MAF("MAF", "Saint Martin (French part)"),
  /**
   * Saint Paul and Amsterdam Islands
   */
  @XmlEnumValue("AMS")
  AMS("AMS", "Saint Paul and Amsterdam Islands"),
  /**
   * Saint Pierre and Miquelon
   */
  @XmlEnumValue("SPM")
  SPM("SPM", "Saint Pierre and Miquelon"),
  /**
   * Saint Vincent and the Grenadines
   */
  @XmlEnumValue("VCT")
  VCT("VCT", "Saint Vincent and the Grenadines"),
  /**
   * Samoa
   */
  @XmlEnumValue("WSM")
  WSM("WSM", "Samoa"),
  /**
   * San Marino
   */
  @XmlEnumValue("SMR")
  SMR("SMR", "San Marino"),
  /**
   * Santiago-Rodriguez
   */
  @XmlEnumValue("DO-26")
  DO_26("DO-26", "Santiago-Rodriguez"),
  /**
   * Sao Tome and Principe
   */
  @XmlEnumValue("STP")
  STP("STP", "Sao Tome and Principe"),
  /**
   * Saudi Arabia
   */
  @XmlEnumValue("SAU")
  SAU("SAU", "Saudi Arabia"),
  /**
   * Senegal
   */
  @XmlEnumValue("SEN")
  SEN("SEN", "Senegal"),
  /**
   * Serbia
   */
  @XmlEnumValue("SRB")
  SRB("SRB", "Serbia"),
  /**
   * Seychelles
   */
  @XmlEnumValue("SYC")
  SYC("SYC", "Seychelles"),
  /**
   * Sierra Leone
   */
  @XmlEnumValue("SLE")
  SLE("SLE", "Sierra Leone"),
  /**
   * Singapore
   */
  @XmlEnumValue("SGP")
  SGP("SGP", "Singapore"),
  /**
   * Sint Maarten (Dutch part)
   */
  @XmlEnumValue("SXM")
  SXM("SXM", "Sint Maarten (Dutch part)"),
  /**
   * Slovakia
   */
  @XmlEnumValue("SVK")
  SVK("SVK", "Slovakia"),
  /**
   * Slovenia
   */
  @XmlEnumValue("SVN")
  SVN("SVN", "Slovenia"),
  /**
   * Solomon Islands
   */
  @XmlEnumValue("SLB")
  SLB("SLB", "Solomon Islands"),
  /**
   * Somalia
   */
  @XmlEnumValue("SOM")
  SOM("SOM", "Somalia"),
  /**
   * South Africa
   */
  @XmlEnumValue("ZAF")
  ZAF("ZAF", "South Africa"),
  /**
   * South America Continent
   */
  @XmlEnumValue("SR")
  SR("SR", "South America Continent"),
  /**
   * South Carolina
   */
  @XmlEnumValue("US-SC")
  US_SC("US-SC", "South Carolina"),
  /**
   * South Dakota
   */
  @XmlEnumValue("US-SD")
  US_SD("US-SD", "South Dakota"),
  /**
   * South Georgia and the South Sandwich Islands
   */
  @XmlEnumValue("SGS")
  SGS("SGS", "South Georgia and the South Sandwich Islands"),
  /**
   * Space
   */
  @XmlEnumValue("SPCE")
  SPCE("SPCE", "Space"),
  /**
   * Spain
   */
  @XmlEnumValue("ESP")
  ESP("ESP", "Spain"),
  /**
   * Sri Lanka
   */
  @XmlEnumValue("LKA")
  LKA("LKA", "Sri Lanka"),
  /**
   * Stabilization Forces in Kosovo
   */
  @XmlEnumValue("KFOR")
  KFOR("KFOR", "Stabilization Forces in Kosovo"),
  /**
   * Sudan
   */
  @XmlEnumValue("SDN")
  SDN("SDN", "Sudan"),
  /**
   * Suriname
   */
  @XmlEnumValue("SUR")
  SUR("SUR", "Suriname"),
  /**
   * Svalbard and Jan Mayen Islands
   */
  @XmlEnumValue("SJM")
  SJM("SJM", "Svalbard and Jan Mayen Islands"),
  /**
   * Swan Islands
   */
  @XmlEnumValue("SWA")
  SWA("SWA", "Swan Islands"),
  /**
   * Swaziland
   */
  @XmlEnumValue("SWZ")
  SWZ("SWZ", "Swaziland"),
  /**
   * Sweden
   */
  @XmlEnumValue("SWE")
  SWE("SWE", "Sweden"),
  /**
   * Switzerland
   */
  @XmlEnumValue("CHE")
  CHE("CHE", "Switzerland"),
  /**
   * Syria
   */
  @XmlEnumValue("SYR")
  SYR("SYR", "Syria"),
  /**
   * Taiwan
   */
  @XmlEnumValue("TWN")
  TWN("TWN", "Taiwan"),
  /**
   * Tajikistan
   */
  @XmlEnumValue("TJK")
  TJK("TJK", "Tajikistan"),
  /**
   * Tanzania
   */
  @XmlEnumValue("TZA")
  TZA("TZA", "Tanzania"),
  /**
   * Tennessee
   */
  @XmlEnumValue("US-TN")
  US_TN("US-TN", "Tennessee"),
  /**
   * Texas
   */
  @XmlEnumValue("US-TX")
  US_TX("US-TX", "Texas"),
  /**
   * Thailand
   */
  @XmlEnumValue("THA")
  THA("THA", "Thailand"),
  /**
   * The former Yugoslav Republic of Macedonia (See footnote 2)
   */
  @XmlEnumValue("FYR")
  FYR("FYR", "The former Yugoslav Republic of Macedonia (See footnote 2)"),
  /**
   * THREE EYES (USA, CAN, GBR)
   */
  @XmlEnumValue("TEYE")
  TEYE("TEYE", "THREE EYES (USA, CAN, GBR)"),
  /**
   * Togo
   */
  @XmlEnumValue("TGO")
  TGO("TGO", "Togo"),
  /**
   * Tokelau
   */
  @XmlEnumValue("TKL")
  TKL("TKL", "Tokelau"),
  /**
   * Tonga
   */
  @XmlEnumValue("TON")
  TON("TON", "Tonga"),
  /**
   * Trinidad and Tobago
   */
  @XmlEnumValue("TTO")
  TTO("TTO", "Trinidad and Tobago"),
  /**
   * Tristan da Cunha
   */
  @XmlEnumValue("SH-TA")
  SH_TA("SH-TA", "Tristan da Cunha"),
  /**
   * Tunisia
   */
  @XmlEnumValue("TUN")
  TUN("TUN", "Tunisia"),
  /**
   * Turkey
   */
  @XmlEnumValue("TUR")
  TUR("TUR", "Turkey"),
  /**
   * Turkmenistan
   */
  @XmlEnumValue("TKM")
  TKM("TKM", "Turkmenistan"),
  /**
   * Turks and Caicos Islands
   */
  @XmlEnumValue("TCA")
  TCA("TCA", "Turks and Caicos Islands"),
  /**
   * Tuvalu
   */
  @XmlEnumValue("TUV")
  TUV("TUV", "Tuvalu"),
  /**
   * Uganda
   */
  @XmlEnumValue("UGA")
  UGA("UGA", "Uganda"),
  /**
   * UK Territories in Region 1
   */
  @XmlEnumValue("UKT1")
  UKT1("UKT1", "UK Territories in Region 1"),
  /**
   * UK Territories in Region 3
   */
  @XmlEnumValue("UKT3")
  UKT3("UKT3", "UK Territories in Region 3"),
  /**
   * Ukraine
   */
  @XmlEnumValue("UKR")
  UKR("UKR", "Ukraine"),
  /**
   * United Arab Emirates
   */
  @XmlEnumValue("ARE")
  ARE("ARE", "United Arab Emirates"),
  /**
   * United Kingdom
   */
  @XmlEnumValue("GBR")
  GBR("GBR", "United Kingdom"),
  /**
   * United Nations
   */
  @XmlEnumValue("UN")
  UN("UN", "United Nations"),
  /**
   * United Nations Command, Korea
   */
  @XmlEnumValue("UNCK")
  UNCK("UNCK", "United Nations Command, Korea"),
  /**
   * United States (CONUS)
   */
  @XmlEnumValue("USC")
  USC("USC", "United States (CONUS)"),
  /**
   * United States and Possessions
   */
  @XmlEnumValue("USP")
  USP("USP", "United States and Possessions"),
  /**
   * United States Minor Outlying Islands
   */
  @XmlEnumValue("UMI")
  UMI("UMI", "United States Minor Outlying Islands"),
  /**
   * United States of America
   */
  @XmlEnumValue("USA")
  USA("USA", "United States of America"),
  /**
   * Unknown
   */
  @XmlEnumValue("UNKN")
  UNKN("UNKN", "Unknown"),
  /**
   * Uruguay
   */
  @XmlEnumValue("URY")
  URY("URY", "Uruguay"),
  /**
   * US - Central
   */
  @XmlEnumValue("USCE")
  USCE("USCE", "US - Central"),
  /**
   * US - Mid Atlantic
   */
  @XmlEnumValue("SCML")
  SCML("SCML", "US - Mid Atlantic"),
  /**
   * US - Midwest
   */
  @XmlEnumValue("USMW")
  USMW("USMW", "US - Midwest"),
  /**
   * US - North Central
   */
  @XmlEnumValue("USNC")
  USNC("USNC", "US - North Central"),
  /**
   * US - North East
   */
  @XmlEnumValue("USNE")
  USNE("USNE", "US - North East"),
  /**
   * US - North West
   */
  @XmlEnumValue("USNW")
  USNW("USNW", "US - North West"),
  /**
   * US - South Central
   */
  @XmlEnumValue("USSC")
  USSC("USSC", "US - South Central"),
  /**
   * US - South East
   */
  @XmlEnumValue("USSE")
  USSE("USSE", "US - South East"),
  /**
   * US - South West
   */
  @XmlEnumValue("USSW")
  USSW("USSW", "US - South West"),
  /**
   * US - West
   */
  @XmlEnumValue("USWE")
  USWE("USWE", "US - West"),
  /**
   * Utah
   */
  @XmlEnumValue("US-UT")
  US_UT("US-UT", "Utah"),
  /**
   * Uzbekistan
   */
  @XmlEnumValue("UZB")
  UZB("UZB", "Uzbekistan"),
  /**
   * Vanuatu
   */
  @XmlEnumValue("VUT")
  VUT("VUT", "Vanuatu"),
  /**
   * Vatican City State
   */
  @XmlEnumValue("VAT")
  VAT("VAT", "Vatican City State"),
  /**
   * Venezuela
   */
  @XmlEnumValue("VEN")
  VEN("VEN", "Venezuela"),
  /**
   * Vermont
   */
  @XmlEnumValue("US-VT")
  US_VT("US-VT", "Vermont"),
  /**
   * Vietnam
   */
  @XmlEnumValue("VNM")
  VNM("VNM", "Vietnam"),
  /**
   * Virgin Islands (British)
   */
  @XmlEnumValue("VGB")
  VGB("VGB", "Virgin Islands (British)"),
  /**
   * Virgin Islands (U.S.)
   */
  @XmlEnumValue("VIR")
  VIR("VIR", "Virgin Islands (U.S.)"),
  /**
   * Virginia
   */
  @XmlEnumValue("US-VA")
  US_VA("US-VA", "Virginia"),
  /**
   * Visible Earth
   */
  @XmlEnumValue("XVE")
  XVE("XVE", "Visible Earth"),
  /**
   * Wake Island
   */
  @XmlEnumValue("UM-79")
  UM_79("UM-79", "Wake Island"),
  /**
   * Wallis and Futuna Islands
   */
  @XmlEnumValue("WLF")
  WLF("WLF", "Wallis and Futuna Islands"),
  /**
   * Washington
   */
  @XmlEnumValue("US-WA")
  US_WA("US-WA", "Washington"),
  /**
   * West Virginia
   */
  @XmlEnumValue("US-WV")
  US_WV("US-WV", "West Virginia"),
  /**
   * Western Sahara
   */
  @XmlEnumValue("ESH")
  ESH("ESH", "Western Sahara"),
  /**
   * Wisconsin
   */
  @XmlEnumValue("US-WI")
  US_WI("US-WI", "Wisconsin"),
  /**
   * Wyoming
   */
  @XmlEnumValue("US-WY")
  US_WY("US-WY", "Wyoming"),
  /**
   * Yemen
   */
  @XmlEnumValue("YEM")
  YEM("YEM", "Yemen"),
  /**
   * Yugoslavia (YUG) - Deprecated
   */
  @XmlEnumValue("YO05")
  YO05("YO05", "Yugoslavia (YUG) - Deprecated"),
  /**
   * Zambia
   */
  @XmlEnumValue("ZMB")
  ZMB("ZMB", "Zambia"),
  /**
   * Zimbabwe
   */
  @XmlEnumValue("ZWE")
  ZWE("ZWE", "Zimbabwe"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other", "If selected, a clarifying remark SHOULD be entered");

  private final String value;
  private final String properName;

  private ListCAO(String value, String properName) {
    this.value = value;
    this.properName = properName;
  }

  public String value() {
    return value;
  }

  public String getValue() {
    return value;
  }

  public String getProperName() {
    return properName;
  }

  public static ListCAO fromValue(String v) {
    for (ListCAO c : ListCAO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
