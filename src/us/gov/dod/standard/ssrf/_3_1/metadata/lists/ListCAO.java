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
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.administrative.CodeList;
import us.gov.dod.standard.ssrf._3_1.antenna.Manufacturer;
import us.gov.dod.standard.ssrf._3_1.antenna.UsingCountries;
import us.gov.dod.standard.ssrf._3_1.common.CaseNum;
import us.gov.dod.standard.ssrf._3_1.contact.Address;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;
import us.gov.dod.standard.ssrf._3_1.ssrequest.HostNation;
import us.gov.dod.standard.ssrf._3_1.toa.Country;

/**
 * Enumerated values for fields using the ListCAO type.
 * <p>
 * Used in
 * {@link Address}, {@link CaseNum}, {@link CodeList}, {@link Country}, {@link ForceElement}, {@link HostNation}, {@link IntfReport}, {@link Location}, {@link Manufacturer}, {@link Note}, {@link SSReply}, {@link ServiceArea}, {@link UsingCountries}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAO")
@XmlEnum
public enum ListCAO {

  /**
   * Afghanistan
   */
  @XmlEnumValue("AFG")
  AFG("Afghanistan"),
  /**
   * Africa
   */
  @XmlEnumValue("FF")
  FF("Africa"),
  /**
   * Alabama
   */
  @XmlEnumValue("US-AL")
  US_AL("Alabama"),
  /**
   * Åland Islands
   */
  @XmlEnumValue("ALA")
  ALA("Åland Islands"),
  /**
   * Alaska
   */
  @XmlEnumValue("US-AK")
  US_AK("Alaska"),
  /**
   * Albania
   */
  @XmlEnumValue("ALB")
  ALB("Albania"),
  /**
   * Algeria
   */
  @XmlEnumValue("DZA")
  DZA("Algeria"),
  /**
   * Allied Submarine Command
   */
  @XmlEnumValue("NT-ASC")
  NT_ASC("Allied Submarine Command"),
  /**
   * American Samoa
   */
  @XmlEnumValue("ASM")
  ASM("American Samoa"),
  /**
   * Andorra
   */
  @XmlEnumValue("AND")
  AND("Andorra"),
  /**
   * Angola
   */
  @XmlEnumValue("AGO")
  AGO("Angola"),
  /**
   * Anguilla
   */
  @XmlEnumValue("AIA")
  AIA("Anguilla"),
  /**
   * Antarctic
   */
  @XmlEnumValue("ANTR")
  ANTR("Antarctic"),
  /**
   * Antarctic Ocean
   */
  @XmlEnumValue("4Z")
  FOUR_Z("Antarctic Ocean"),
  /**
   * Antarctica Continent
   */
  @XmlEnumValue("ATA")
  ATA("Antarctica Continent"),
  /**
   * Antigua and Barbuda
   */
  @XmlEnumValue("ATG")
  ATG("Antigua and Barbuda"),
  /**
   * Arctic Ocean
   */
  @XmlEnumValue("5A")
  FIVE_A("Arctic Ocean"),
  /**
   * Argentine Republic
   */
  @XmlEnumValue("ARG")
  ARG("Argentine Republic"),
  /**
   * Arizona
   */
  @XmlEnumValue("US-AZ")
  US_AZ("Arizona"),
  /**
   * Arkansas
   */
  @XmlEnumValue("US-AR")
  US_AR("Arkansas"),
  /**
   * Armenia
   */
  @XmlEnumValue("ARM")
  ARM("Armenia"),
  /**
   * Aruba
   */
  @XmlEnumValue("ABW")
  ABW("Aruba"),
  /**
   * Ascension
   */
  @XmlEnumValue("SH-AC")
  SH_AC("Ascension"),
  /**
   * Asia Continent
   */
  @XmlEnumValue("AB")
  AB("Asia Continent"),
  /**
   * Atlantic Ocean
   */
  @XmlEnumValue("9A")
  NINE_A("Atlantic Ocean"),
  /**
   * Australia
   */
  @XmlEnumValue("AUS")
  AUS("Australia"),
  /**
   * Australia Continent
   */
  @XmlEnumValue("AUSC")
  AUSC("Australia Continent"),
  /**
   * Austria
   */
  @XmlEnumValue("AUT")
  AUT("Austria"),
  /**
   * Azerbaijan
   */
  @XmlEnumValue("AZE")
  AZE("Azerbaijan"),
  /**
   * Azores
   */
  @XmlEnumValue("PT-20")
  PT_20("Azores"),
  /**
   * Bahamas
   */
  @XmlEnumValue("BHS")
  BHS("Bahamas"),
  /**
   * Bahrain
   */
  @XmlEnumValue("BHR")
  BHR("Bahrain"),
  /**
   * Baker Island
   */
  @XmlEnumValue("UM-8")
  UM_8("Baker Island"),
  /**
   * Bangladesh
   */
  @XmlEnumValue("BGD")
  BGD("Bangladesh"),
  /**
   * Barbados
   */
  @XmlEnumValue("BRB")
  BRB("Barbados"),
  /**
   * Belarus
   */
  @XmlEnumValue("BLR")
  BLR("Belarus"),
  /**
   * Belgium
   */
  @XmlEnumValue("BEL")
  BEL("Belgium"),
  /**
   * Belize
   */
  @XmlEnumValue("BLZ")
  BLZ("Belize"),
  /**
   * Benin
   */
  @XmlEnumValue("BEN")
  BEN("Benin"),
  /**
   * Bermuda
   */
  @XmlEnumValue("BMU")
  BMU("Bermuda"),
  /**
   * Bhutan
   */
  @XmlEnumValue("BTN")
  BTN("Bhutan"),
  /**
   * Biological Weapons Convention States
   */
  @XmlEnumValue("BWCS")
  BWCS("Biological Weapons Convention States"),
  /**
   * Bolivia
   */
  @XmlEnumValue("BOL")
  BOL("Bolivia"),
  /**
   * Bonaire, Saint Eustatius and Saba
   */
  @XmlEnumValue("BES")
  BES("Bonaire, Saint Eustatius and Saba"),
  /**
   * Bosnia and Herzegovina
   */
  @XmlEnumValue("BIH")
  BIH("Bosnia and Herzegovina"),
  /**
   * Botswana
   */
  @XmlEnumValue("BWA")
  BWA("Botswana"),
  /**
   * Bouvet Island
   */
  @XmlEnumValue("BVT")
  BVT("Bouvet Island"),
  /**
   * Brazil
   */
  @XmlEnumValue("BRA")
  BRA("Brazil"),
  /**
   * British Indian Ocean Territory
   */
  @XmlEnumValue("IOT")
  IOT("British Indian Ocean Territory"),
  /**
   * Brunei Darussalam
   */
  @XmlEnumValue("BRN")
  BRN("Brunei Darussalam"),
  /**
   * Bulgaria
   */
  @XmlEnumValue("BGR")
  BGR("Bulgaria"),
  /**
   * Burkina Faso
   */
  @XmlEnumValue("BFA")
  BFA("Burkina Faso"),
  /**
   * Burundi
   */
  @XmlEnumValue("BDI")
  BDI("Burundi"),
  /**
   * California
   */
  @XmlEnumValue("US-CA")
  US_CA("California"),
  /**
   * Cambodia
   */
  @XmlEnumValue("KHM")
  KHM("Cambodia"),
  /**
   * Cameroon
   */
  @XmlEnumValue("CMR")
  CMR("Cameroon"),
  /**
   * Canada
   */
  @XmlEnumValue("CAN")
  CAN("Canada"),
  /**
   * Canary Islands
   */
  @XmlEnumValue("ES-CN")
  ES_CN("Canary Islands"),
  /**
   * Cape Verde
   */
  @XmlEnumValue("CPV")
  CPV("Cape Verde"),
  /**
   * Caribbean
   */
  @XmlEnumValue("CARB")
  CARB("Caribbean"),
  /**
   * Caroline Islands
   */
  @XmlEnumValue("CAI")
  CAI("Caroline Islands"),
  /**
   * Cayman Islands
   */
  @XmlEnumValue("CYM")
  CYM("Cayman Islands"),
  /**
   * CCEB Nations (AUS, CAN, GBR, NZL, USA)
   */
  @XmlEnumValue("CCEB")
  CCEB("CCEB Nations (AUS, CAN, GBR, NZL, USA)"),
  /**
   * Central African Republic
   */
  @XmlEnumValue("CAF")
  CAF("Central African Republic"),
  /**
   * Central America
   */
  @XmlEnumValue("CAM")
  CAM("Central America"),
  /**
   * Chad
   */
  @XmlEnumValue("TCD")
  TCD("Chad"),
  /**
   * Chemical Weapons Convention States
   */
  @XmlEnumValue("CWCS")
  CWCS("Chemical Weapons Convention States"),
  /**
   * Chile
   */
  @XmlEnumValue("CHL")
  CHL("Chile"),
  /**
   * China
   */
  @XmlEnumValue("CHN")
  CHN("China"),
  /**
   * Christmas Island
   */
  @XmlEnumValue("CXR")
  CXR("Christmas Island"),
  /**
   * Civilian Protection Monitoring Team for Sudan
   */
  @XmlEnumValue("CPMT")
  CPMT("Civilian Protection Monitoring Team for Sudan"),
  /**
   * Clipperton Island
   */
  @XmlEnumValue("CP")
  CP("Clipperton Island"),
  /**
   * Cocos (Keeling) Islands
   */
  @XmlEnumValue("CCK")
  CCK("Cocos (Keeling) Islands"),
  /**
   * Colombia
   */
  @XmlEnumValue("COL")
  COL("Colombia"),
  /**
   * Colorado
   */
  @XmlEnumValue("US-CO")
  US_CO("Colorado"),
  /**
   * Combined Maritime Forces
   */
  @XmlEnumValue("CMFC")
  CMFC("Combined Maritime Forces"),
  /**
   * Comoros
   */
  @XmlEnumValue("COM")
  COM("Comoros"),
  /**
   * Congo
   */
  @XmlEnumValue("COG")
  COG("Congo"),
  /**
   * Congo (Democratic Republic of the)
   */
  @XmlEnumValue("COD")
  COD("Congo (Democratic Republic of the)"),
  /**
   * Connecticut
   */
  @XmlEnumValue("US-CT")
  US_CT("Connecticut"),
  /**
   * Cook Islands
   */
  @XmlEnumValue("COK")
  COK("Cook Islands"),
  /**
   * Cooperative Maritime Forces Pacific
   */
  @XmlEnumValue("CMFP")
  CMFP("Cooperative Maritime Forces Pacific"),
  /**
   * Costa Rica
   */
  @XmlEnumValue("CRI")
  CRI("Costa Rica"),
  /**
   * Croatia
   */
  @XmlEnumValue("HRV")
  HRV("Croatia"),
  /**
   * Crozet Archipelago
   */
  @XmlEnumValue("FR-TF")
  FR_TF("Crozet Archipelago"),
  /**
   * Cuba
   */
  @XmlEnumValue("CUB")
  CUB("Cuba"),
  /**
   * Curaçao
   */
  @XmlEnumValue("CUW")
  CUW("Curaçao"),
  /**
   * Cyprus
   */
  @XmlEnumValue("CYP")
  CYP("Cyprus"),
  /**
   * Czech Republic
   */
  @XmlEnumValue("CZE")
  CZE("Czech Republic"),
  /**
   * Delaware
   */
  @XmlEnumValue("US-DE")
  US_DE("Delaware"),
  /**
   * Denmark
   */
  @XmlEnumValue("DNK")
  DNK("Denmark"),
  /**
   * Diego Garcia
   */
  @XmlEnumValue("DG")
  DG("Diego Garcia"),
  /**
   * District of Columbia
   */
  @XmlEnumValue("US-DC")
  US_DC("District of Columbia"),
  /**
   * Djibouti
   */
  @XmlEnumValue("DJI")
  DJI("Djibouti"),
  /**
   * Dominica
   */
  @XmlEnumValue("DMA")
  DMA("Dominica"),
  /**
   * Dominican Republic
   */
  @XmlEnumValue("DOM")
  DOM("Dominican Republic"),
  /**
   * East Timor
   */
  @XmlEnumValue("TLS")
  TLS("East Timor"),
  /**
   * Easter Island
   */
  @XmlEnumValue("EAS")
  EAS("Easter Island"),
  /**
   * Ecuador
   */
  @XmlEnumValue("ECU")
  ECU("Ecuador"),
  /**
   * Egypt
   */
  @XmlEnumValue("EGY")
  EGY("Egypt"),
  /**
   * El Salvador
   */
  @XmlEnumValue("SLV")
  SLV("El Salvador"),
  /**
   * Equatorial Guinea
   */
  @XmlEnumValue("GNQ")
  GNQ("Equatorial Guinea"),
  /**
   * Eritrea
   */
  @XmlEnumValue("ERI")
  ERI("Eritrea"),
  /**
   * Estonia
   */
  @XmlEnumValue("EST")
  EST("Estonia"),
  /**
   * Ethiopia
   */
  @XmlEnumValue("ETH")
  ETH("Ethiopia"),
  /**
   * Europe Continent
   */
  @XmlEnumValue("EE")
  EE("Europe Continent"),
  /**
   * European Union DARFUR
   */
  @XmlEnumValue("EUDA")
  EUDA("European Union DARFUR"),
  /**
   * European Union Stabilization Forces in Bosnia
   */
  @XmlEnumValue("EFOR")
  EFOR("European Union Stabilization Forces in Bosnia"),
  /**
   * Falkland Islands (Malvinas)
   */
  @XmlEnumValue("FLK")
  FLK("Falkland Islands (Malvinas)"),
  /**
   * Faroe Islands
   */
  @XmlEnumValue("FRO")
  FRO("Faroe Islands"),
  /**
   * Fiji
   */
  @XmlEnumValue("FJI")
  FJI("Fiji"),
  /**
   * Finland
   */
  @XmlEnumValue("FIN")
  FIN("Finland"),
  /**
   * FIVE EYES (USA, CAN, GBR, AUS, NZL)
   */
  @XmlEnumValue("FVEY")
  FVEY("FIVE EYES (USA, CAN, GBR, AUS, NZL)"),
  /**
   * Florida
   */
  @XmlEnumValue("US-FL")
  US_FL("Florida"),
  /**
   * FOUR EYES (USA, CAN, GBR, AUS)
   */
  @XmlEnumValue("ACGU")
  ACGU("FOUR EYES (USA, CAN, GBR, AUS)"),
  /**
   * France
   */
  @XmlEnumValue("FRA")
  FRA("France"),
  /**
   * French Guiana
   */
  @XmlEnumValue("GUF")
  GUF("French Guiana"),
  /**
   * French Polynesia
   */
  @XmlEnumValue("PYF")
  PYF("French Polynesia"),
  /**
   * French Southern Territories
   */
  @XmlEnumValue("ATF")
  ATF("French Southern Territories"),
  /**
   * Gabon
   */
  @XmlEnumValue("GAB")
  GAB("Gabon"),
  /**
   * Gambia
   */
  @XmlEnumValue("GMB")
  GMB("Gambia"),
  /**
   * Georgia
   */
  @XmlEnumValue("GEO")
  GEO("Georgia"),
  /**
   * Georgia
   */
  @XmlEnumValue("US-GA")
  US_GA("Georgia"),
  /**
   * Geostationary Satellite
   */
  @XmlEnumValue("GEOS")
  GEOS("Geostationary Satellite"),
  /**
   * Germany
   */
  @XmlEnumValue("DEU")
  DEU("Germany"),
  /**
   * Ghana
   */
  @XmlEnumValue("GHA")
  GHA("Ghana"),
  /**
   * Gibraltar
   */
  @XmlEnumValue("GIB")
  GIB("Gibraltar"),
  /**
   * Global Counter-Terrorism Forces
   */
  @XmlEnumValue("GCTF")
  GCTF("Global Counter-Terrorism Forces"),
  /**
   * Global Maritime Interception Forces
   */
  @XmlEnumValue("GMIF")
  GMIF("Global Maritime Interception Forces"),
  /**
   * Great Lakes
   */
  @XmlEnumValue("9Z")
  NINE_Z("Great Lakes"),
  /**
   * Greece
   */
  @XmlEnumValue("GRC")
  GRC("Greece"),
  /**
   * Greenland
   */
  @XmlEnumValue("GRL")
  GRL("Greenland"),
  /**
   * Grenada
   */
  @XmlEnumValue("GRD")
  GRD("Grenada"),
  /**
   * Guadeloupe
   */
  @XmlEnumValue("GLP")
  GLP("Guadeloupe"),
  /**
   * Guam
   */
  @XmlEnumValue("GUM")
  GUM("Guam"),
  /**
   * Guatemala
   */
  @XmlEnumValue("GTM")
  GTM("Guatemala"),
  /**
   * Guernsey
   */
  @XmlEnumValue("GGY")
  GGY("Guernsey"),
  /**
   * Guinea
   */
  @XmlEnumValue("GIN")
  GIN("Guinea"),
  /**
   * Guinea-Bissau
   */
  @XmlEnumValue("GNB")
  GNB("Guinea-Bissau"),
  /**
   * Gulf of Mexico
   */
  @XmlEnumValue("1M")
  ONE_M("Gulf of Mexico"),
  /**
   * Guyana
   */
  @XmlEnumValue("GUY")
  GUY("Guyana"),
  /**
   * Haiti
   */
  @XmlEnumValue("HTI")
  HTI("Haiti"),
  /**
   * Hawaii
   */
  @XmlEnumValue("US-HI")
  US_HI("Hawaii"),
  /**
   * Heard and McDonald Islands
   */
  @XmlEnumValue("HMD")
  HMD("Heard and McDonald Islands"),
  /**
   * Hemisphere East
   */
  @XmlEnumValue("HEME")
  HEME("Hemisphere East"),
  /**
   * Hemisphere North
   */
  @XmlEnumValue("HEMN")
  HEMN("Hemisphere North"),
  /**
   * Hemisphere South
   */
  @XmlEnumValue("HEMS")
  HEMS("Hemisphere South"),
  /**
   * Hemisphere West
   */
  @XmlEnumValue("HEMW")
  HEMW("Hemisphere West"),
  /**
   * Honduras
   */
  @XmlEnumValue("HND")
  HND("Honduras"),
  /**
   * Hong Kong
   */
  @XmlEnumValue("HKG")
  HKG("Hong Kong"),
  /**
   * Howland Island
   */
  @XmlEnumValue("UM-84")
  UM_84("Howland Island"),
  /**
   * Hungary
   */
  @XmlEnumValue("HUN")
  HUN("Hungary"),
  /**
   * Iceland
   */
  @XmlEnumValue("ISL")
  ISL("Iceland"),
  /**
   * Idaho
   */
  @XmlEnumValue("US-ID")
  US_ID("Idaho"),
  /**
   * Illinois
   */
  @XmlEnumValue("US-IL")
  US_IL("Illinois"),
  /**
   * India
   */
  @XmlEnumValue("IND")
  IND("India"),
  /**
   * Indian Ocean
   */
  @XmlEnumValue("6A")
  SIX_A("Indian Ocean"),
  /**
   * Indiana
   */
  @XmlEnumValue("US-IN")
  US_IN("Indiana"),
  /**
   * Indonesia
   */
  @XmlEnumValue("IDN")
  IDN("Indonesia"),
  /**
   * International
   */
  @XmlEnumValue("INTL")
  INTL("International"),
  /**
   * International Civil Aviation Organization
   */
  @XmlEnumValue("ICAO")
  ICAO("International Civil Aviation Organization"),
  /**
   * International Events Security Coalition
   */
  @XmlEnumValue("IESC")
  IESC("International Events Security Coalition"),
  /**
   * International Telecommunications Union
   */
  @XmlEnumValue("ITU")
  ITU("International Telecommunications Union"),
  /**
   * Iowa
   */
  @XmlEnumValue("US-IA")
  US_IA("Iowa"),
  /**
   * Iran
   */
  @XmlEnumValue("IRN")
  IRN("Iran"),
  /**
   * Iraq
   */
  @XmlEnumValue("IRQ")
  IRQ("Iraq"),
  /**
   * Ireland
   */
  @XmlEnumValue("IRL")
  IRL("Ireland"),
  /**
   * ISAF for Afghanistan
   */
  @XmlEnumValue("ISAF-AFG")
  ISAF_AFG("ISAF for Afghanistan"),
  /**
   * Isle of Man
   */
  @XmlEnumValue("IMN")
  IMN("Isle of Man"),
  /**
   * Israel
   */
  @XmlEnumValue("ISR")
  ISR("Israel"),
  /**
   * Italy
   */
  @XmlEnumValue("ITA")
  ITA("Italy"),
  /**
   * ITU Region 1
   */
  @XmlEnumValue("ITU1")
  ITU1("ITU Region 1"),
  /**
   * ITU Region 2
   */
  @XmlEnumValue("ITU2")
  ITU2("ITU Region 2"),
  /**
   * ITU Region 3
   */
  @XmlEnumValue("ITU3")
  ITU3("ITU Region 3"),
  /**
   * Ivory Coast
   */
  @XmlEnumValue("CIV")
  CIV("Ivory Coast"),
  /**
   * Jamaica
   */
  @XmlEnumValue("JAM")
  JAM("Jamaica"),
  /**
   * Japan
   */
  @XmlEnumValue("JPN")
  JPN("Japan"),
  /**
   * Jarvis Island
   */
  @XmlEnumValue("UM-86")
  UM_86("Jarvis Island"),
  /**
   * Jersey
   */
  @XmlEnumValue("JEY")
  JEY("Jersey"),
  /**
   * Johnston Atoll
   */
  @XmlEnumValue("UM-67")
  UM_67("Johnston Atoll"),
  /**
   * Jordan
   */
  @XmlEnumValue("JOR")
  JOR("Jordan"),
  /**
   * Kansas
   */
  @XmlEnumValue("US-KS")
  US_KS("Kansas"),
  /**
   * Kazakhstan
   */
  @XmlEnumValue("KAZ")
  KAZ("Kazakhstan"),
  /**
   * Kentucky
   */
  @XmlEnumValue("US-KY")
  US_KY("Kentucky"),
  /**
   * Kenya
   */
  @XmlEnumValue("KEN")
  KEN("Kenya"),
  /**
   * Kerguelen Islands
   */
  @XmlEnumValue("KER")
  KER("Kerguelen Islands"),
  /**
   * Kingman Reef
   */
  @XmlEnumValue("UM-89")
  UM_89("Kingman Reef"),
  /**
   * Kiribati
   */
  @XmlEnumValue("KIR")
  KIR("Kiribati"),
  /**
   * Korea, North
   */
  @XmlEnumValue("PRK")
  PRK("Korea, North"),
  /**
   * Korea, South
   */
  @XmlEnumValue("KOR")
  KOR("Korea, South"),
  /**
   * Kosovo
   */
  @XmlEnumValue("YU-KM")
  YU_KM("Kosovo"),
  /**
   * Kuwait
   */
  @XmlEnumValue("KWT")
  KWT("Kuwait"),
  /**
   * Kyrgyzstan
   */
  @XmlEnumValue("KGZ")
  KGZ("Kyrgyzstan"),
  /**
   * Lake Erie
   */
  @XmlEnumValue("9E")
  NINE_E("Lake Erie"),
  /**
   * Lake Huron
   */
  @XmlEnumValue("9H")
  NINE_H("Lake Huron"),
  /**
   * Lake Michigan
   */
  @XmlEnumValue("9M")
  NINE_M("Lake Michigan"),
  /**
   * Lake Ontario
   */
  @XmlEnumValue("9N")
  NINE_N("Lake Ontario"),
  /**
   * Lake Superior
   */
  @XmlEnumValue("9S")
  NINE_S("Lake Superior"),
  /**
   * Laos
   */
  @XmlEnumValue("LAO")
  LAO("Laos"),
  /**
   * Latvia
   */
  @XmlEnumValue("LVA")
  LVA("Latvia"),
  /**
   * Lebanon
   */
  @XmlEnumValue("LBN")
  LBN("Lebanon"),
  /**
   * Lesotho
   */
  @XmlEnumValue("LSO")
  LSO("Lesotho"),
  /**
   * Liberia
   */
  @XmlEnumValue("LBR")
  LBR("Liberia"),
  /**
   * Libya
   */
  @XmlEnumValue("LBY")
  LBY("Libya"),
  /**
   * Liechtenstein
   */
  @XmlEnumValue("LIE")
  LIE("Liechtenstein"),
  /**
   * Lithuania
   */
  @XmlEnumValue("LTU")
  LTU("Lithuania"),
  /**
   * Louisiana
   */
  @XmlEnumValue("US-LA")
  US_LA("Louisiana"),
  /**
   * Luxembourg
   */
  @XmlEnumValue("LUX")
  LUX("Luxembourg"),
  /**
   * Macao
   */
  @XmlEnumValue("MAC")
  MAC("Macao"),
  /**
   * Madagascar
   */
  @XmlEnumValue("MDG")
  MDG("Madagascar"),
  /**
   * Madeira
   */
  @XmlEnumValue("PT-30")
  PT_30("Madeira"),
  /**
   * Maine
   */
  @XmlEnumValue("US-ME")
  US_ME("Maine"),
  /**
   * Malawi
   */
  @XmlEnumValue("MWI")
  MWI("Malawi"),
  /**
   * Malaysia
   */
  @XmlEnumValue("MYS")
  MYS("Malaysia"),
  /**
   * Maldives
   */
  @XmlEnumValue("MDV")
  MDV("Maldives"),
  /**
   * Mali
   */
  @XmlEnumValue("MLI")
  MLI("Mali"),
  /**
   * Malta
   */
  @XmlEnumValue("MLT")
  MLT("Malta"),
  /**
   * Mariana Islands (excluding Guam)
   */
  @XmlEnumValue("US-MP")
  US_MP("Mariana Islands (excluding Guam)"),
  /**
   * Marion Island
   */
  @XmlEnumValue("MAI")
  MAI("Marion Island"),
  /**
   * Marshall Islands
   */
  @XmlEnumValue("MHL")
  MHL("Marshall Islands"),
  /**
   * Martinique
   */
  @XmlEnumValue("MTQ")
  MTQ("Martinique"),
  /**
   * Maryland
   */
  @XmlEnumValue("US-MD")
  US_MD("Maryland"),
  /**
   * Massachusetts
   */
  @XmlEnumValue("US-MA")
  US_MA("Massachusetts"),
  /**
   * Mauritania
   */
  @XmlEnumValue("MRT")
  MRT("Mauritania"),
  /**
   * Mauritius
   */
  @XmlEnumValue("MUS")
  MUS("Mauritius"),
  /**
   * Mayotte
   */
  @XmlEnumValue("MYT")
  MYT("Mayotte"),
  /**
   * Mediterranean Sea
   */
  @XmlEnumValue("89")
  EIGHT_9("Mediterranean Sea"),
  /**
   * Mexico
   */
  @XmlEnumValue("MEX")
  MEX("Mexico"),
  /**
   * Michigan
   */
  @XmlEnumValue("US-MI")
  US_MI("Michigan"),
  /**
   * Micronesia
   */
  @XmlEnumValue("FSM")
  FSM("Micronesia"),
  /**
   * Midway Islands
   */
  @XmlEnumValue("UM-71")
  UM_71("Midway Islands"),
  /**
   * Minnesota
   */
  @XmlEnumValue("US-MN")
  US_MN("Minnesota"),
  /**
   * Mississippi
   */
  @XmlEnumValue("US-MS")
  US_MS("Mississippi"),
  /**
   * Missouri
   */
  @XmlEnumValue("US-MO")
  US_MO("Missouri"),
  /**
   * Moldova
   */
  @XmlEnumValue("MDA")
  MDA("Moldova"),
  /**
   * Monaco
   */
  @XmlEnumValue("MCO")
  MCO("Monaco"),
  /**
   * Mongolia
   */
  @XmlEnumValue("MNG")
  MNG("Mongolia"),
  /**
   * Montana
   */
  @XmlEnumValue("US-MT")
  US_MT("Montana"),
  /**
   * Montenegro
   */
  @XmlEnumValue("MNE")
  MNE("Montenegro"),
  /**
   * Montserrat
   */
  @XmlEnumValue("MSR")
  MSR("Montserrat"),
  /**
   * Morocco
   */
  @XmlEnumValue("MAR")
  MAR("Morocco"),
  /**
   * Mozambique
   */
  @XmlEnumValue("MOZ")
  MOZ("Mozambique"),
  /**
   * Multi-Lateral Enduring Contingency
   */
  @XmlEnumValue("MLEC")
  MLEC("Multi-Lateral Enduring Contingency"),
  /**
   * Multinational Coalition Forces - Iraq
   */
  @XmlEnumValue("MCFI")
  MCFI("Multinational Coalition Forces - Iraq"),
  /**
   * Multinational Interim Force Haiti
   */
  @XmlEnumValue("MIFH")
  MIFH("Multinational Interim Force Haiti"),
  /**
   * Multiple Areas
   */
  @XmlEnumValue("MULT")
  MULT("Multiple Areas"),
  /**
   * Myanmar
   */
  @XmlEnumValue("MMR")
  MMR("Myanmar"),
  /**
   * Namibia
   */
  @XmlEnumValue("NAM")
  NAM("Namibia"),
  /**
   * NATO AEW&C Force Command
   */
  @XmlEnumValue("NT-AEW")
  NT_AEW("NATO AEW&C Force Command"),
  /**
   * NATO Air Ground Surveillance (Italy)
   */
  @XmlEnumValue("NT-AGS")
  NT_AGS("NATO Air Ground Surveillance (Italy)"),
  /**
   * NATO AIRCOM Ramstein
   */
  @XmlEnumValue("NT-AC")
  NT_AC("NATO AIRCOM Ramstein"),
  /**
   * NATO Allied Command Operations (ACO)
   */
  @XmlEnumValue("NT-ACO")
  NT_ACO("NATO Allied Command Operations (ACO)"),
  /**
   * NATO Allied Command Transformation (ACT)
   */
  @XmlEnumValue("NT-ACT")
  NT_ACT("NATO Allied Command Transformation (ACT)"),
  /**
   * NATO Allied Submarine Command
   */
  @XmlEnumValue("NT-SC")
  NT_SC("NATO Allied Submarine Command"),
  /**
   * NATO CAOC Germany
   */
  @XmlEnumValue("NT-A-DEU")
  NT_A_DEU("NATO CAOC Germany"),
  /**
   * NATO CAOC Spain
   */
  @XmlEnumValue("NT-A-ESP")
  NT_A_ESP("NATO CAOC Spain"),
  /**
   * NATO CIS Group (Belgium)
   */
  @XmlEnumValue("NT-CISG")
  NT_CISG("NATO CIS Group (Belgium)"),
  /**
   * NATO Communications & Information Agency
   */
  @XmlEnumValue("NT-CIA")
  NT_CIA("NATO Communications & Information Agency"),
  /**
   * NATO DACC Italy
   */
  @XmlEnumValue("NT-A-ITA")
  NT_A_ITA("NATO DACC Italy"),
  /**
   * NATO D-AOC Germany
   */
  @XmlEnumValue("NT-D-DEU")
  NT_D_DEU("NATO D-AOC Germany"),
  /**
   * NATO D-AOC Spain
   */
  @XmlEnumValue("NT-D-ESP")
  NT_D_ESP("NATO D-AOC Spain"),
  /**
   * NATO European Nations (NATO, excluding USA, CAN, ISL)
   */
  @XmlEnumValue("NT-EUR")
  NT_EUR("NATO European Nations (NATO, excluding USA, CAN, ISL)"),
  /**
   * NATO Headquarters
   */
  @XmlEnumValue("NT-HQ")
  NT_HQ("NATO Headquarters"),
  /**
   * NATO HQ Spectrum Management
   */
  @XmlEnumValue("NT-HQ-SM")
  NT_HQ_SM("NATO HQ Spectrum Management"),
  /**
   * NATO Joint Force HQ Italy
   */
  @XmlEnumValue("NT-J-ITA")
  NT_J_ITA("NATO Joint Force HQ Italy"),
  /**
   * NATO Joint Force HQ Netherlands
   */
  @XmlEnumValue("NT-J-NLD")
  NT_J_NLD("NATO Joint Force HQ Netherlands"),
  /**
   * NATO LANDCOM Izmir
   */
  @XmlEnumValue("NT-LC")
  NT_LC("NATO LANDCOM Izmir"),
  /**
   * NATO MARCOM Northwood
   */
  @XmlEnumValue("NT-MC")
  NT_MC("NATO MARCOM Northwood"),
  /**
   * NATO Nations (28 Nations: ALB, BEL, BGR, CAN, CZE, DEU, DNK, ESP, EST, FRA,
   * GBR, GRC, HUN, HRV, ITA, ISL, LUX, LTU, LVA, NLD, NOR, POL, PRT, ROU, SVK,
   * SVN, TUR, USA)
   */
  @XmlEnumValue("NATO")
  NATO("NATO Nations (28 Nations: ALB, BEL, BGR, CAN, CZE, DEU, DNK, ESP, EST, FRA, GBR, GRC, HUN, HRV, ITA, ISL, LUX, LTU, LVA, NLD, NOR, POL, PRT, ROU, SVK, SVN, TUR, USA)"),
  /**
   * NATO Signals Battalion Germany
   */
  @XmlEnumValue("NT-S-DEU")
  NT_S_DEU("NATO Signals Battalion Germany"),
  /**
   * NATO Signals Battalion Italy
   */
  @XmlEnumValue("NT-S-ITA")
  NT_S_ITA("NATO Signals Battalion Italy"),
  /**
   * NATO Signals Battalion Poland
   */
  @XmlEnumValue("NT-S-POL")
  NT_S_POL("NATO Signals Battalion Poland"),
  /**
   * NATO Strike Force (STRIKFORNATO)
   */
  @XmlEnumValue("NT-STF")
  NT_STF("NATO Strike Force (STRIKFORNATO)"),
  /**
   * Nauru
   */
  @XmlEnumValue("NRU")
  NRU("Nauru"),
  /**
   * Navassa Island
   */
  @XmlEnumValue("UM-76")
  UM_76("Navassa Island"),
  /**
   * Nebraska
   */
  @XmlEnumValue("US-NE")
  US_NE("Nebraska"),
  /**
   * Nepal
   */
  @XmlEnumValue("NPL")
  NPL("Nepal"),
  /**
   * Netherlands
   */
  @XmlEnumValue("NLD")
  NLD("Netherlands"),
  /**
   * Netherlands Antilles
   */
  @XmlEnumValue("ANT")
  ANT("Netherlands Antilles"),
  /**
   * Nevada
   */
  @XmlEnumValue("US-NV")
  US_NV("Nevada"),
  /**
   * New Caledonia
   */
  @XmlEnumValue("NCL")
  NCL("New Caledonia"),
  /**
   * New Hampshire
   */
  @XmlEnumValue("US-NH")
  US_NH("New Hampshire"),
  /**
   * New Jersey
   */
  @XmlEnumValue("US-NJ")
  US_NJ("New Jersey"),
  /**
   * New Mexico
   */
  @XmlEnumValue("US-NM")
  US_NM("New Mexico"),
  /**
   * New York
   */
  @XmlEnumValue("US-NY")
  US_NY("New York"),
  /**
   * New Zealand
   */
  @XmlEnumValue("NZL")
  NZL("New Zealand"),
  /**
   * Nicaragua
   */
  @XmlEnumValue("NIC")
  NIC("Nicaragua"),
  /**
   * Niger
   */
  @XmlEnumValue("NER")
  NER("Niger"),
  /**
   * Nigeria
   */
  @XmlEnumValue("NGA")
  NGA("Nigeria"),
  /**
   * Niue
   */
  @XmlEnumValue("NIU")
  NIU("Niue"),
  /**
   * Non-Geostationary Satellite
   */
  @XmlEnumValue("NGEO")
  NGEO("Non-Geostationary Satellite"),
  /**
   * Norfolk Island
   */
  @XmlEnumValue("NFK")
  NFK("Norfolk Island"),
  /**
   * North African Counter-Terrorism Forces
   */
  @XmlEnumValue("NACT")
  NACT("North African Counter-Terrorism Forces"),
  /**
   * North America Continent
   */
  @XmlEnumValue("NN")
  NN("North America Continent"),
  /**
   * North Carolina
   */
  @XmlEnumValue("US-NC")
  US_NC("North Carolina"),
  /**
   * North Dakota
   */
  @XmlEnumValue("US-ND")
  US_ND("North Dakota"),
  /**
   * Northern Mariana Islands
   */
  @XmlEnumValue("MNP")
  MNP("Northern Mariana Islands"),
  /**
   * Norway
   */
  @XmlEnumValue("NOR")
  NOR("Norway"),
  /**
   * Oceania
   */
  @XmlEnumValue("UU")
  UU("Oceania"),
  /**
   * Ohio
   */
  @XmlEnumValue("US-OH")
  US_OH("Ohio"),
  /**
   * Oklahoma
   */
  @XmlEnumValue("US-OK")
  US_OK("Oklahoma"),
  /**
   * Oman
   */
  @XmlEnumValue("OMN")
  OMN("Oman"),
  /**
   * Oregon
   */
  @XmlEnumValue("US-OR")
  US_OR("Oregon"),
  /**
   * Other - See Remarks
   */
  @XmlEnumValue("OTH")
  OTH("Other - See Remarks"),
  /**
   * Pacific Ocean
   */
  @XmlEnumValue("4O")
  FOUR_O("Pacific Ocean"),
  /**
   * Pakistan
   */
  @XmlEnumValue("PAK")
  PAK("Pakistan"),
  /**
   * Palau
   */
  @XmlEnumValue("PLW")
  PLW("Palau"),
  /**
   * Palestine
   */
  @XmlEnumValue("PSE")
  PSE("Palestine"),
  /**
   * Palmyra Atoll
   */
  @XmlEnumValue("UM-95")
  UM_95("Palmyra Atoll"),
  /**
   * Panama
   */
  @XmlEnumValue("PAN")
  PAN("Panama"),
  /**
   * Papua New Guinea
   */
  @XmlEnumValue("PNG")
  PNG("Papua New Guinea"),
  /**
   * Paraguay
   */
  @XmlEnumValue("PRY")
  PRY("Paraguay"),
  /**
   * Pennsylvania
   */
  @XmlEnumValue("US-PA")
  US_PA("Pennsylvania"),
  /**
   * Peru
   */
  @XmlEnumValue("PER")
  PER("Peru"),
  /**
   * Philippines
   */
  @XmlEnumValue("PHL")
  PHL("Philippines"),
  /**
   * Phoenix Islands
   */
  @XmlEnumValue("KI-P")
  KI_P("Phoenix Islands"),
  /**
   * Pitcairn Island
   */
  @XmlEnumValue("PCN")
  PCN("Pitcairn Island"),
  /**
   * Poland
   */
  @XmlEnumValue("POL")
  POL("Poland"),
  /**
   * Portugal
   */
  @XmlEnumValue("PRT")
  PRT("Portugal"),
  /**
   * Puerto Rico
   */
  @XmlEnumValue("PRI")
  PRI("Puerto Rico"),
  /**
   * Qatar
   */
  @XmlEnumValue("QAT")
  QAT("Qatar"),
  /**
   * Radio Astronomy
   */
  @XmlEnumValue("RCVR")
  RCVR("Radio Astronomy"),
  /**
   * Réunion
   */
  @XmlEnumValue("REU")
  REU("Réunion"),
  /**
   * Rhode Island
   */
  @XmlEnumValue("US-RI")
  US_RI("Rhode Island"),
  /**
   * Rodrigues
   */
  @XmlEnumValue("MU-RO")
  MU_RO("Rodrigues"),
  /**
   * ROK/US Combined Forces Command, Korea
   */
  @XmlEnumValue("CFCK")
  CFCK("ROK/US Combined Forces Command, Korea"),
  /**
   * Romania
   */
  @XmlEnumValue("ROU")
  ROU("Romania"),
  /**
   * Russian Federation
   */
  @XmlEnumValue("RUS")
  RUS("Russian Federation"),
  /**
   * Rwanda
   */
  @XmlEnumValue("RWA")
  RWA("Rwanda"),
  /**
   * Saint Barthélemy
   */
  @XmlEnumValue("BLM")
  BLM("Saint Barthélemy"),
  /**
   * Saint Helena
   */
  @XmlEnumValue("SHN")
  SHN("Saint Helena"),
  /**
   * Saint Kitts and Nevis
   */
  @XmlEnumValue("KNA")
  KNA("Saint Kitts and Nevis"),
  /**
   * Saint Lucia
   */
  @XmlEnumValue("LCA")
  LCA("Saint Lucia"),
  /**
   * Saint Martin (French part)
   */
  @XmlEnumValue("MAF")
  MAF("Saint Martin (French part)"),
  /**
   * Saint Paul and Amsterdam Islands
   */
  @XmlEnumValue("AMS")
  AMS("Saint Paul and Amsterdam Islands"),
  /**
   * Saint Pierre and Miquelon
   */
  @XmlEnumValue("SPM")
  SPM("Saint Pierre and Miquelon"),
  /**
   * Saint Vincent and the Grenadines
   */
  @XmlEnumValue("VCT")
  VCT("Saint Vincent and the Grenadines"),
  /**
   * Samoa
   */
  @XmlEnumValue("WSM")
  WSM("Samoa"),
  /**
   * San Marino
   */
  @XmlEnumValue("SMR")
  SMR("San Marino"),
  /**
   * Santiago-Rodriguez
   */
  @XmlEnumValue("DO-26")
  DO_26("Santiago-Rodriguez"),
  /**
   * Sao Tome and Principe
   */
  @XmlEnumValue("STP")
  STP("Sao Tome and Principe"),
  /**
   * Saudi Arabia
   */
  @XmlEnumValue("SAU")
  SAU("Saudi Arabia"),
  /**
   * Senegal
   */
  @XmlEnumValue("SEN")
  SEN("Senegal"),
  /**
   * Serbia
   */
  @XmlEnumValue("SRB")
  SRB("Serbia"),
  /**
   * Seychelles
   */
  @XmlEnumValue("SYC")
  SYC("Seychelles"),
  /**
   * Sierra Leone
   */
  @XmlEnumValue("SLE")
  SLE("Sierra Leone"),
  /**
   * Singapore
   */
  @XmlEnumValue("SGP")
  SGP("Singapore"),
  /**
   * Sint Maarten (Dutch part)
   */
  @XmlEnumValue("SXM")
  SXM("Sint Maarten (Dutch part)"),
  /**
   * Slovakia
   */
  @XmlEnumValue("SVK")
  SVK("Slovakia"),
  /**
   * Slovenia
   */
  @XmlEnumValue("SVN")
  SVN("Slovenia"),
  /**
   * Solomon Islands
   */
  @XmlEnumValue("SLB")
  SLB("Solomon Islands"),
  /**
   * Somalia
   */
  @XmlEnumValue("SOM")
  SOM("Somalia"),
  /**
   * South Africa
   */
  @XmlEnumValue("ZAF")
  ZAF("South Africa"),
  /**
   * South America Continent
   */
  @XmlEnumValue("SR")
  SR("South America Continent"),
  /**
   * South Carolina
   */
  @XmlEnumValue("US-SC")
  US_SC("South Carolina"),
  /**
   * South Dakota
   */
  @XmlEnumValue("US-SD")
  US_SD("South Dakota"),
  /**
   * South Georgia and the South Sandwich Islands
   */
  @XmlEnumValue("SGS")
  SGS("South Georgia and the South Sandwich Islands"),
  /**
   * Space
   */
  @XmlEnumValue("SPCE")
  SPCE("Space"),
  /**
   * Spain
   */
  @XmlEnumValue("ESP")
  ESP("Spain"),
  /**
   * Sri Lanka
   */
  @XmlEnumValue("LKA")
  LKA("Sri Lanka"),
  /**
   * Stabilization Forces in Kosovo
   */
  @XmlEnumValue("KFOR")
  KFOR("Stabilization Forces in Kosovo"),
  /**
   * Sudan
   */
  @XmlEnumValue("SDN")
  SDN("Sudan"),
  /**
   * Suriname
   */
  @XmlEnumValue("SUR")
  SUR("Suriname"),
  /**
   * Svalbard and Jan Mayen Islands
   */
  @XmlEnumValue("SJM")
  SJM("Svalbard and Jan Mayen Islands"),
  /**
   * Swan Islands
   */
  @XmlEnumValue("SWA")
  SWA("Swan Islands"),
  /**
   * Swaziland
   */
  @XmlEnumValue("SWZ")
  SWZ("Swaziland"),
  /**
   * Sweden
   */
  @XmlEnumValue("SWE")
  SWE("Sweden"),
  /**
   * Switzerland
   */
  @XmlEnumValue("CHE")
  CHE("Switzerland"),
  /**
   * Syria
   */
  @XmlEnumValue("SYR")
  SYR("Syria"),
  /**
   * Taiwan
   */
  @XmlEnumValue("TWN")
  TWN("Taiwan"),
  /**
   * Tajikistan
   */
  @XmlEnumValue("TJK")
  TJK("Tajikistan"),
  /**
   * Tanzania
   */
  @XmlEnumValue("TZA")
  TZA("Tanzania"),
  /**
   * Tennessee
   */
  @XmlEnumValue("US-TN")
  US_TN("Tennessee"),
  /**
   * Texas
   */
  @XmlEnumValue("US-TX")
  US_TX("Texas"),
  /**
   * Thailand
   */
  @XmlEnumValue("THA")
  THA("Thailand"),
  /**
   * The former Yugoslav Republic of Macedonia
   */
  @XmlEnumValue("FYR")
  FYR("The former Yugoslav Republic of Macedonia"),
  /**
   * THREE EYES (USA, CAN, GBR)
   */
  @XmlEnumValue("TEYE")
  TEYE("THREE EYES (USA, CAN, GBR)"),
  /**
   * Togo
   */
  @XmlEnumValue("TGO")
  TGO("Togo"),
  /**
   * Tokelau
   */
  @XmlEnumValue("TKL")
  TKL("Tokelau"),
  /**
   * Tonga
   */
  @XmlEnumValue("TON")
  TON("Tonga"),
  /**
   * Trinidad and Tobago
   */
  @XmlEnumValue("TTO")
  TTO("Trinidad and Tobago"),
  /**
   * Tristan da Cunha
   */
  @XmlEnumValue("SH-TA")
  SH_TA("Tristan da Cunha"),
  /**
   * Tunisia
   */
  @XmlEnumValue("TUN")
  TUN("Tunisia"),
  /**
   * Turkey
   */
  @XmlEnumValue("TUR")
  TUR("Turkey"),
  /**
   * Turkmenistan
   */
  @XmlEnumValue("TKM")
  TKM("Turkmenistan"),
  /**
   * Turks and Caicos Islands
   */
  @XmlEnumValue("TCA")
  TCA("Turks and Caicos Islands"),
  /**
   * Tuvalu
   */
  @XmlEnumValue("TUV")
  TUV("Tuvalu"),
  /**
   * Uganda
   */
  @XmlEnumValue("UGA")
  UGA("Uganda"),
  /**
   * UK Territories in Region 1
   */
  @XmlEnumValue("UKT1")
  UKT1("UK Territories in Region 1"),
  /**
   * UK Territories in Region 3
   */
  @XmlEnumValue("UKT3")
  UKT3("UK Territories in Region 3"),
  /**
   * Ukraine
   */
  @XmlEnumValue("UKR")
  UKR("Ukraine"),
  /**
   * United Arab Emirates
   */
  @XmlEnumValue("ARE")
  ARE("United Arab Emirates"),
  /**
   * United Kingdom
   */
  @XmlEnumValue("GBR")
  GBR("United Kingdom"),
  /**
   * United Nations
   */
  @XmlEnumValue("UN")
  UN("United Nations"),
  /**
   * United Nations Command, Korea
   */
  @XmlEnumValue("UNCK")
  UNCK("United Nations Command, Korea"),
  /**
   * United States (CONUS)
   */
  @XmlEnumValue("USC")
  USC("United States (CONUS)"),
  /**
   * United States and Possessions
   */
  @XmlEnumValue("USP")
  USP("United States and Possessions"),
  /**
   * United States Minor Outlying Islands
   */
  @XmlEnumValue("UMI")
  UMI("United States Minor Outlying Islands"),
  /**
   * United States of America
   */
  @XmlEnumValue("USA")
  USA("United States of America"),
  /**
   * Unknown
   */
  @XmlEnumValue("UNKN")
  UNKN("Unknown"),
  /**
   * Uruguay
   */
  @XmlEnumValue("URY")
  URY("Uruguay"),
  /**
   * US - Central
   */
  @XmlEnumValue("USCE")
  USCE("US - Central"),
  /**
   * US - Mid Atlantic
   */
  @XmlEnumValue("SCML")
  SCML("US - Mid Atlantic"),
  /**
   * US - Midwest
   */
  @XmlEnumValue("USMW")
  USMW("US - Midwest"),
  /**
   * US - North Central
   */
  @XmlEnumValue("USNC")
  USNC("US - North Central"),
  /**
   * US - North East
   */
  @XmlEnumValue("USNE")
  USNE("US - North East"),
  /**
   * US - North West
   */
  @XmlEnumValue("USNW")
  USNW("US - North West"),
  /**
   * US - South Central
   */
  @XmlEnumValue("USSC")
  USSC("US - South Central"),
  /**
   * US - South East
   */
  @XmlEnumValue("USSE")
  USSE("US - South East"),
  /**
   * US - South West
   */
  @XmlEnumValue("USSW")
  USSW("US - South West"),
  /**
   * US - West
   */
  @XmlEnumValue("USWE")
  USWE("US - West"),
  /**
   * Utah
   */
  @XmlEnumValue("US-UT")
  US_UT("Utah"),
  /**
   * Uzbekistan
   */
  @XmlEnumValue("UZB")
  UZB("Uzbekistan"),
  /**
   * Vanuatu
   */
  @XmlEnumValue("VUT")
  VUT("Vanuatu"),
  /**
   * Vatican City State
   */
  @XmlEnumValue("VAT")
  VAT("Vatican City State"),
  /**
   * Venezuela
   */
  @XmlEnumValue("VEN")
  VEN("Venezuela"),
  /**
   * Vermont
   */
  @XmlEnumValue("US-VT")
  US_VT("Vermont"),
  /**
   * Vietnam
   */
  @XmlEnumValue("VNM")
  VNM("Vietnam"),
  /**
   * Virgin Islands (British)
   */
  @XmlEnumValue("VGB")
  VGB("Virgin Islands (British)"),
  /**
   * Virgin Islands (U.S.)
   */
  @XmlEnumValue("VIR")
  VIR("Virgin Islands (U.S.)"),
  /**
   * Virginia
   */
  @XmlEnumValue("US-VA")
  US_VA("Virginia"),
  /**
   * Visible Earth
   */
  @XmlEnumValue("XVE")
  XVE("Visible Earth"),
  /**
   * Wake Island
   */
  @XmlEnumValue("UM-79")
  UM_79("Wake Island"),
  /**
   * Wallis and Futuna Islands
   */
  @XmlEnumValue("WLF")
  WLF("Wallis and Futuna Islands"),
  /**
   * Washington
   */
  @XmlEnumValue("US-WA")
  US_WA("Washington"),
  /**
   * West Virginia
   */
  @XmlEnumValue("US-WV")
  US_WV("West Virginia"),
  /**
   * Western Sahara
   */
  @XmlEnumValue("ESH")
  ESH("Western Sahara"),
  /**
   * Wisconsin
   */
  @XmlEnumValue("US-WI")
  US_WI("Wisconsin"),
  /**
   * Wyoming
   */
  @XmlEnumValue("US-WY")
  US_WY("Wyoming"),
  /**
   * Yemen
   */
  @XmlEnumValue("YEM")
  YEM("Yemen"),
  /**
   * Yugoslavia (YUG) - Deprecated
   */
  @XmlEnumValue("YO05")
  YO05("Yugoslavia (YUG) - Deprecated"),
  /**
   * Zambia
   */
  @XmlEnumValue("ZMB")
  ZMB("Zambia"),
  /**
   * Zimbabwe
   */
  @XmlEnumValue("ZWE")
  ZWE("Zimbabwe"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("If selected, a clarifying remark SHOULD be entered");

  private final String value;

  ListCAO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAO fromValue(String v) {
    for (ListCAO c : ListCAO.values()) {
      if (c.value.equalsIgnoreCase(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
