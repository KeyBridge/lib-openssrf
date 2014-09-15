/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListCCY.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCCY"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S8"> &lt;enumeration value="AFG"/>
 * &lt;enumeration value="ALB"/> &lt;enumeration value="DZA"/> &lt;enumeration
 * value="AND"/> &lt;enumeration value="AGO"/> &lt;enumeration value="ATG"/>
 * &lt;enumeration value="ARG"/> &lt;enumeration value="ARM"/> &lt;enumeration
 * value="AUS"/> &lt;enumeration value="AUT"/> &lt;enumeration value="AZE"/>
 * &lt;enumeration value="BHS"/> &lt;enumeration value="BHR"/> &lt;enumeration
 * value="BGD"/> &lt;enumeration value="BRB"/> &lt;enumeration value="BLR"/>
 * &lt;enumeration value="BEL"/> &lt;enumeration value="BLZ"/> &lt;enumeration
 * value="BEN"/> &lt;enumeration value="BTN"/> &lt;enumeration value="BOL"/>
 * &lt;enumeration value="BIH"/> &lt;enumeration value="BWA"/> &lt;enumeration
 * value="BRA"/> &lt;enumeration value="BRN"/> &lt;enumeration value="BGR"/>
 * &lt;enumeration value="BFA"/> &lt;enumeration value="BDI"/> &lt;enumeration
 * value="KHM"/> &lt;enumeration value="CMR"/> &lt;enumeration value="CAN"/>
 * &lt;enumeration value="CPV"/> &lt;enumeration value="CCEB"/> &lt;enumeration
 * value="CAF"/> &lt;enumeration value="TCD"/> &lt;enumeration value="CWCS"/>
 * &lt;enumeration value="CHL"/> &lt;enumeration value="CHN"/> &lt;enumeration
 * value="COL"/> &lt;enumeration value="COM"/> &lt;enumeration value="COG"/>
 * &lt;enumeration value="COD"/> &lt;enumeration value="CRI"/> &lt;enumeration
 * value="CIV"/> &lt;enumeration value="HRV"/> &lt;enumeration value="CUB"/>
 * &lt;enumeration value="CYP"/> &lt;enumeration value="CZE"/> &lt;enumeration
 * value="DNK"/> &lt;enumeration value="DJI"/> &lt;enumeration value="DMA"/>
 * &lt;enumeration value="DOM"/> &lt;enumeration value="TLS"/> &lt;enumeration
 * value="ECU"/> &lt;enumeration value="EGY"/> &lt;enumeration value="SLV"/>
 * &lt;enumeration value="GNQ"/> &lt;enumeration value="ERI"/> &lt;enumeration
 * value="EST"/> &lt;enumeration value="ETH"/> &lt;enumeration value="FJI"/>
 * &lt;enumeration value="FIN"/> &lt;enumeration value="FVEY"/> &lt;enumeration
 * value="ACGU"/> &lt;enumeration value="FRA"/> &lt;enumeration value="GAB"/>
 * &lt;enumeration value="GMB"/> &lt;enumeration value="GEO"/> &lt;enumeration
 * value="DEU"/> &lt;enumeration value="GHA"/> &lt;enumeration value="GRC"/>
 * &lt;enumeration value="GRD"/> &lt;enumeration value="GTM"/> &lt;enumeration
 * value="GIN"/> &lt;enumeration value="GNB"/> &lt;enumeration value="GUY"/>
 * &lt;enumeration value="HTI"/> &lt;enumeration value="HND"/> &lt;enumeration
 * value="HUN"/> &lt;enumeration value="ISL"/> &lt;enumeration value="IND"/>
 * &lt;enumeration value="IDN"/> &lt;enumeration value="IRN"/> &lt;enumeration
 * value="IRQ"/> &lt;enumeration value="IRL"/> &lt;enumeration value="ISR"/>
 * &lt;enumeration value="ITA"/> &lt;enumeration value="JAM"/> &lt;enumeration
 * value="JPN"/> &lt;enumeration value="JOR"/> &lt;enumeration value="KAZ"/>
 * &lt;enumeration value="KEN"/> &lt;enumeration value="KIR"/> &lt;enumeration
 * value="PRK"/> &lt;enumeration value="KOR"/> &lt;enumeration value="YU-KM"/>
 * &lt;enumeration value="KWT"/> &lt;enumeration value="KGZ"/> &lt;enumeration
 * value="LAO"/> &lt;enumeration value="LVA"/> &lt;enumeration value="LBN"/>
 * &lt;enumeration value="LSO"/> &lt;enumeration value="LBR"/> &lt;enumeration
 * value="LBY"/> &lt;enumeration value="LIE"/> &lt;enumeration value="LTU"/>
 * &lt;enumeration value="LUX"/> &lt;enumeration value="MDG"/> &lt;enumeration
 * value="MWI"/> &lt;enumeration value="MYS"/> &lt;enumeration value="MDV"/>
 * &lt;enumeration value="MLI"/> &lt;enumeration value="MLT"/> &lt;enumeration
 * value="MHL"/> &lt;enumeration value="MRT"/> &lt;enumeration value="MUS"/>
 * &lt;enumeration value="MEX"/> &lt;enumeration value="FSM"/> &lt;enumeration
 * value="MDA"/> &lt;enumeration value="MCO"/> &lt;enumeration value="MNG"/>
 * &lt;enumeration value="MNE"/> &lt;enumeration value="MAR"/> &lt;enumeration
 * value="MOZ"/> &lt;enumeration value="MMR"/> &lt;enumeration value="NAM"/>
 * &lt;enumeration value="NRU"/> &lt;enumeration value="NPL"/> &lt;enumeration
 * value="NLD"/> &lt;enumeration value="NZL"/> &lt;enumeration value="NIC"/>
 * &lt;enumeration value="NER"/> &lt;enumeration value="NGA"/> &lt;enumeration
 * value="NATO"/> &lt;enumeration value="NOR"/> &lt;enumeration value="OMN"/>
 * &lt;enumeration value="PAK"/> &lt;enumeration value="PLW"/> &lt;enumeration
 * value="PSE"/> &lt;enumeration value="PAN"/> &lt;enumeration value="PNG"/>
 * &lt;enumeration value="PRY"/> &lt;enumeration value="PER"/> &lt;enumeration
 * value="PHL"/> &lt;enumeration value="POL"/> &lt;enumeration value="PRT"/>
 * &lt;enumeration value="QAT"/> &lt;enumeration value="ROU"/> &lt;enumeration
 * value="RUS"/> &lt;enumeration value="RWA"/> &lt;enumeration value="KNA"/>
 * &lt;enumeration value="LCA"/> &lt;enumeration value="VCT"/> &lt;enumeration
 * value="WSM"/> &lt;enumeration value="SMR"/> &lt;enumeration value="STP"/>
 * &lt;enumeration value="SAU"/> &lt;enumeration value="SEN"/> &lt;enumeration
 * value="SRB"/> &lt;enumeration value="SYC"/> &lt;enumeration value="SLE"/>
 * &lt;enumeration value="SGP"/> &lt;enumeration value="SVK"/> &lt;enumeration
 * value="SVN"/> &lt;enumeration value="SLB"/> &lt;enumeration value="SOM"/>
 * &lt;enumeration value="ZAF"/> &lt;enumeration value="ESP"/> &lt;enumeration
 * value="LKA"/> &lt;enumeration value="SDN"/> &lt;enumeration value="SUR"/>
 * &lt;enumeration value="SWZ"/> &lt;enumeration value="SWE"/> &lt;enumeration
 * value="CHE"/> &lt;enumeration value="SYR"/> &lt;enumeration value="TWN"/>
 * &lt;enumeration value="TJK"/> &lt;enumeration value="TZA"/> &lt;enumeration
 * value="THA"/> &lt;enumeration value="FYR"/> &lt;enumeration value="TEYE"/>
 * &lt;enumeration value="TGO"/> &lt;enumeration value="TON"/> &lt;enumeration
 * value="TTO"/> &lt;enumeration value="TUN"/> &lt;enumeration value="TUR"/>
 * &lt;enumeration value="TKM"/> &lt;enumeration value="TUV"/> &lt;enumeration
 * value="UGA"/> &lt;enumeration value="UKR"/> &lt;enumeration value="ARE"/>
 * &lt;enumeration value="GBR"/> &lt;enumeration value="UN"/> &lt;enumeration
 * value="USC"/> &lt;enumeration value="USP"/> &lt;enumeration value="USA"/>
 * &lt;enumeration value="UNKN"/> &lt;enumeration value="URY"/> &lt;enumeration
 * value="UZB"/> &lt;enumeration value="VUT"/> &lt;enumeration value="VAT"/>
 * &lt;enumeration value="VEN"/> &lt;enumeration value="VNM"/> &lt;enumeration
 * value="YEM"/> &lt;enumeration value="YO05"/> &lt;enumeration value="ZMB"/>
 * &lt;enumeration value="ZWE"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCCY")
@XmlEnum
public enum ListCCY {

  /**
   * Afghanistan
   * <p>
   */
  AFG("AFG"),
  /**
   * Albania
   * <p>
   */
  ALB("ALB"),
  /**
   * Algeria
   * <p>
   */
  DZA("DZA"),
  /**
   * Andorra
   * <p>
   */
  AND("AND"),
  /**
   * Angola
   * <p>
   */
  AGO("AGO"),
  /**
   * Antigua and Barbuda
   * <p>
   */
  ATG("ATG"),
  /**
   * Argentine Republic
   * <p>
   */
  ARG("ARG"),
  /**
   * Armenia
   * <p>
   */
  ARM("ARM"),
  /**
   * Australia
   * <p>
   */
  AUS("AUS"),
  /**
   * Austria
   * <p>
   */
  AUT("AUT"),
  /**
   * Azerbaijan
   * <p>
   */
  AZE("AZE"),
  /**
   * Bahamas
   * <p>
   */
  BHS("BHS"),
  /**
   * Bahrain
   * <p>
   */
  BHR("BHR"),
  /**
   * Bangladesh
   * <p>
   */
  BGD("BGD"),
  /**
   * Barbados
   * <p>
   */
  BRB("BRB"),
  /**
   * Belarus
   * <p>
   */
  BLR("BLR"),
  /**
   * Belgium
   * <p>
   */
  BEL("BEL"),
  /**
   * Belize
   * <p>
   */
  BLZ("BLZ"),
  /**
   * Benin
   * <p>
   */
  BEN("BEN"),
  /**
   * Bhutan
   * <p>
   */
  BTN("BTN"),
  /**
   * Bolivia
   * <p>
   */
  BOL("BOL"),
  /**
   * Bosnia and Herzegovina
   * <p>
   */
  BIH("BIH"),
  /**
   * Botswana
   * <p>
   */
  BWA("BWA"),
  /**
   * Brazil
   * <p>
   */
  BRA("BRA"),
  /**
   * Brunei Darussalam
   * <p>
   */
  BRN("BRN"),
  /**
   * Bulgaria
   * <p>
   */
  BGR("BGR"),
  /**
   * Burkina Faso
   * <p>
   */
  BFA("BFA"),
  /**
   * Burundi
   * <p>
   */
  BDI("BDI"),
  /**
   * Cambodia
   * <p>
   */
  KHM("KHM"),
  /**
   * Cameroon
   * <p>
   */
  CMR("CMR"),
  /**
   * Canada
   * <p>
   */
  CAN("CAN"),
  /**
   * Cape Verde
   * <p>
   */
  CPV("CPV"),
  /**
   * CCEB Nations (AUS, CAN, GBR, NZL, USA)
   * <p>
   */
  CCEB("CCEB"),
  /**
   * Central African Republic
   * <p>
   */
  CAF("CAF"),
  /**
   * Chad
   * <p>
   */
  TCD("TCD"),
  /**
   * Chemical Weapons Convention States
   * <p>
   */
  CWCS("CWCS"),
  /**
   * Chile
   * <p>
   */
  CHL("CHL"),
  /**
   * China
   * <p>
   */
  CHN("CHN"),
  /**
   * Colombia
   * <p>
   */
  COL("COL"),
  /**
   * Comoros
   * <p>
   */
  COM("COM"),
  /**
   * Congo
   * <p>
   */
  COG("COG"),
  /**
   * Congo (Democratic Republic of the)
   * <p>
   */
  COD("COD"),
  /**
   * Costa Rica
   * <p>
   */
  CRI("CRI"),
  /**
   * Ivory Coast
   * <p>
   */
  CIV("CIV"),
  /**
   * Croatia
   * <p>
   */
  HRV("HRV"),
  /**
   * Cuba
   * <p>
   */
  CUB("CUB"),
  /**
   * Cyprus (See footnote 1)
   * <p>
   */
  CYP("CYP"),
  /**
   * Czech Republic
   * <p>
   */
  CZE("CZE"),
  /**
   * Denmark
   * <p>
   */
  DNK("DNK"),
  /**
   * Djibouti
   * <p>
   */
  DJI("DJI"),
  /**
   * Dominica
   * <p>
   */
  DMA("DMA"),
  /**
   * Dominican Republic
   * <p>
   */
  DOM("DOM"),
  /**
   * East Timor
   * <p>
   */
  TLS("TLS"),
  /**
   * Ecuador
   * <p>
   */
  ECU("ECU"),
  /**
   * Egypt
   * <p>
   */
  EGY("EGY"),
  /**
   * El Salvador
   * <p>
   */
  SLV("SLV"),
  /**
   * Equatorial Guinea
   * <p>
   */
  GNQ("GNQ"),
  /**
   * Eritrea
   * <p>
   */
  ERI("ERI"),
  /**
   * Estonia
   * <p>
   */
  EST("EST"),
  /**
   * Ethiopia
   * <p>
   */
  ETH("ETH"),
  /**
   * Fiji
   * <p>
   */
  FJI("FJI"),
  /**
   * Finland
   * <p>
   */
  FIN("FIN"),
  /**
   * FIVE EYES (USA, CAN, GBR, AUS, NZL)
   * <p>
   */
  FVEY("FVEY"),
  /**
   * FOUR EYES (USA, CAN, GBR, AUS)
   * <p>
   */
  ACGU("ACGU"),
  /**
   * France
   * <p>
   */
  FRA("FRA"),
  /**
   * Gabon
   * <p>
   */
  GAB("GAB"),
  /**
   * Gambia
   * <p>
   */
  GMB("GMB"),
  /**
   * Georgia
   * <p>
   */
  GEO("GEO"),
  /**
   * Germany
   * <p>
   */
  DEU("DEU"),
  /**
   * Ghana
   * <p>
   */
  GHA("GHA"),
  /**
   * Greece
   * <p>
   */
  GRC("GRC"),
  /**
   * Grenada
   * <p>
   */
  GRD("GRD"),
  /**
   * Guatemala
   * <p>
   */
  GTM("GTM"),
  /**
   * Guinea
   * <p>
   */
  GIN("GIN"),
  /**
   * Guinea-Bissau
   * <p>
   */
  GNB("GNB"),
  /**
   * Guyana
   * <p>
   */
  GUY("GUY"),
  /**
   * Haiti
   * <p>
   */
  HTI("HTI"),
  /**
   * Honduras
   * <p>
   */
  HND("HND"),
  /**
   * Hungary
   * <p>
   */
  HUN("HUN"),
  /**
   * Iceland
   * <p>
   */
  ISL("ISL"),
  /**
   * India
   * <p>
   */
  IND("IND"),
  /**
   * Indonesia
   * <p>
   */
  IDN("IDN"),
  /**
   * Iran
   * <p>
   */
  IRN("IRN"),
  /**
   * Iraq
   * <p>
   */
  IRQ("IRQ"),
  /**
   * Ireland
   * <p>
   */
  IRL("IRL"),
  /**
   * Israel
   * <p>
   */
  ISR("ISR"),
  /**
   * Italy
   * <p>
   */
  ITA("ITA"),
  /**
   * Jamaica
   * <p>
   */
  JAM("JAM"),
  /**
   * Japan
   * <p>
   */
  JPN("JPN"),
  /**
   * Jordan
   * <p>
   */
  JOR("JOR"),
  /**
   * Kazakhstan
   * <p>
   */
  KAZ("KAZ"),
  /**
   * Kenya
   * <p>
   */
  KEN("KEN"),
  /**
   * Kiribati
   * <p>
   */
  KIR("KIR"),
  /**
   * Korea, North
   * <p>
   */
  PRK("PRK"),
  /**
   * Korea, South
   * <p>
   */
  KOR("KOR"),
  /**
   * Kosovo
   * <p>
   */
  @XmlEnumValue("YU-KM")
  YU___KM("YU-KM"),
  /**
   * Kuwait
   * <p>
   */
  KWT("KWT"),
  /**
   * Kyrgyzstan
   * <p>
   */
  KGZ("KGZ"),
  /**
   * Laos
   * <p>
   */
  LAO("LAO"),
  /**
   * Latvia
   * <p>
   */
  LVA("LVA"),
  /**
   * Lebanon
   * <p>
   */
  LBN("LBN"),
  /**
   * Lesotho
   * <p>
   */
  LSO("LSO"),
  /**
   * Liberia
   * <p>
   */
  LBR("LBR"),
  /**
   * Libya
   * <p>
   */
  LBY("LBY"),
  /**
   * Liechtenstein
   * <p>
   */
  LIE("LIE"),
  /**
   * Lithuania
   * <p>
   */
  LTU("LTU"),
  /**
   * Luxembourg
   * <p>
   */
  LUX("LUX"),
  /**
   * Madagascar
   * <p>
   */
  MDG("MDG"),
  /**
   * Malawi
   * <p>
   */
  MWI("MWI"),
  /**
   * Malaysia
   * <p>
   */
  MYS("MYS"),
  /**
   * Maldives
   * <p>
   */
  MDV("MDV"),
  /**
   * Mali
   * <p>
   */
  MLI("MLI"),
  /**
   * Malta
   * <p>
   */
  MLT("MLT"),
  /**
   * Marshall Islands
   * <p>
   */
  MHL("MHL"),
  /**
   * Mauritania
   * <p>
   */
  MRT("MRT"),
  /**
   * Mauritius
   * <p>
   */
  MUS("MUS"),
  /**
   * Mexico
   * <p>
   */
  MEX("MEX"),
  /**
   * Micronesia
   * <p>
   */
  FSM("FSM"),
  /**
   * Moldova
   * <p>
   */
  MDA("MDA"),
  /**
   * Monaco
   * <p>
   */
  MCO("MCO"),
  /**
   * Mongolia
   * <p>
   */
  MNG("MNG"),
  /**
   * Montenegro
   * <p>
   */
  MNE("MNE"),
  /**
   * Morocco
   * <p>
   */
  MAR("MAR"),
  /**
   * Mozambique
   * <p>
   */
  MOZ("MOZ"),
  /**
   * Myanmar
   * <p>
   */
  MMR("MMR"),
  /**
   * Namibia
   * <p>
   */
  NAM("NAM"),
  /**
   * Nauru
   * <p>
   */
  NRU("NRU"),
  /**
   * Nepal
   * <p>
   */
  NPL("NPL"),
  /**
   * Netherlands
   * <p>
   */
  NLD("NLD"),
  /**
   * New Zealand
   * <p>
   */
  NZL("NZL"),
  /**
   * Nicaragua
   * <p>
   */
  NIC("NIC"),
  /**
   * Niger
   * <p>
   */
  NER("NER"),
  /**
   * Nigeria
   * <p>
   */
  NGA("NGA"),
  /**
   * NATO Nations (28 Nations: ALB, BEL, BUL, CAN, CZE, D, DNK, E, EST, F, G,
   * GRC, HNG, HOL, HRV, I, ISL, LUX, LIT, LVA, NOR, POL, POR, ROU, SVK, SVN,
   * TUR, USA)
   * <p>
   */
  NATO("NATO"),
  /**
   * Norway
   * <p>
   */
  NOR("NOR"),
  /**
   * Oman
   * <p>
   */
  OMN("OMN"),
  /**
   * Pakistan
   * <p>
   */
  PAK("PAK"),
  /**
   * Palau
   * <p>
   */
  PLW("PLW"),
  /**
   * Palestine
   * <p>
   */
  PSE("PSE"),
  /**
   * Panama
   * <p>
   */
  PAN("PAN"),
  /**
   * Papua New Guinea
   * <p>
   */
  PNG("PNG"),
  /**
   * Paraguay
   * <p>
   */
  PRY("PRY"),
  /**
   * Peru
   * <p>
   */
  PER("PER"),
  /**
   * Philippines
   * <p>
   */
  PHL("PHL"),
  /**
   * Poland
   * <p>
   */
  POL("POL"),
  /**
   * Portugal
   * <p>
   */
  PRT("PRT"),
  /**
   * Qatar
   * <p>
   */
  QAT("QAT"),
  /**
   * Romania
   * <p>
   */
  ROU("ROU"),
  /**
   * Russian Federation
   * <p>
   */
  RUS("RUS"),
  /**
   * Rwanda
   * <p>
   */
  RWA("RWA"),
  /**
   * Saint Kitts and Nevis
   * <p>
   */
  KNA("KNA"),
  /**
   * Saint Lucia
   * <p>
   */
  LCA("LCA"),
  /**
   * Saint Vincent and the Grenadines
   * <p>
   */
  VCT("VCT"),
  /**
   * Samoa
   * <p>
   */
  WSM("WSM"),
  /**
   * San Marino
   * <p>
   */
  SMR("SMR"),
  /**
   * Sao Tome and Principe
   * <p>
   */
  STP("STP"),
  /**
   * Saudi Arabia
   * <p>
   */
  SAU("SAU"),
  /**
   * Senegal
   * <p>
   */
  SEN("SEN"),
  /**
   * Serbia
   * <p>
   */
  SRB("SRB"),
  /**
   * Seychelles
   * <p>
   */
  SYC("SYC"),
  /**
   * Sierra Leone
   * <p>
   */
  SLE("SLE"),
  /**
   * Singapore
   * <p>
   */
  SGP("SGP"),
  /**
   * Slovakia
   * <p>
   */
  SVK("SVK"),
  /**
   * Slovenia
   * <p>
   */
  SVN("SVN"),
  /**
   * Solomon Islands
   * <p>
   */
  SLB("SLB"),
  /**
   * Somalia
   * <p>
   */
  SOM("SOM"),
  /**
   * South Africa
   * <p>
   */
  ZAF("ZAF"),
  /**
   * Spain
   * <p>
   */
  ESP("ESP"),
  /**
   * Sri Lanka
   * <p>
   */
  LKA("LKA"),
  /**
   * Sudan
   * <p>
   */
  SDN("SDN"),
  /**
   * Suriname
   * <p>
   */
  SUR("SUR"),
  /**
   * Swaziland
   * <p>
   */
  SWZ("SWZ"),
  /**
   * Sweden
   * <p>
   */
  SWE("SWE"),
  /**
   * Switzerland
   * <p>
   */
  CHE("CHE"),
  /**
   * Syria
   * <p>
   */
  SYR("SYR"),
  /**
   * Taiwan
   * <p>
   */
  TWN("TWN"),
  /**
   * Tajikistan
   * <p>
   */
  TJK("TJK"),
  /**
   * Tanzania
   * <p>
   */
  TZA("TZA"),
  /**
   * Thailand
   * <p>
   */
  THA("THA"),
  /**
   * The former Yugoslav Republic of Macedonia (See footnote 2)
   * <p>
   */
  FYR("FYR"),
  /**
   * THREE EYES (USA, CAN, GBR)
   * <p>
   */
  TEYE("TEYE"),
  /**
   * Togo
   * <p>
   */
  TGO("TGO"),
  /**
   * Tonga
   * <p>
   */
  TON("TON"),
  /**
   * Trinidad and Tobago
   * <p>
   */
  TTO("TTO"),
  /**
   * Tunisia
   * <p>
   */
  TUN("TUN"),
  /**
   * Turkey
   * <p>
   */
  TUR("TUR"),
  /**
   * Turkmenistan
   * <p>
   */
  TKM("TKM"),
  /**
   * Tuvalu
   * <p>
   */
  TUV("TUV"),
  /**
   * Uganda
   * <p>
   */
  UGA("UGA"),
  /**
   * Ukraine
   * <p>
   */
  UKR("UKR"),
  /**
   * United Arab Emirates
   * <p>
   */
  ARE("ARE"),
  /**
   * United Kingdom
   * <p>
   */
  GBR("GBR"),
  /**
   * United Nations
   * <p>
   */
  UN("UN"),
  /**
   * United States (CONUS)
   * <p>
   */
  USC("USC"),
  /**
   * United States and Possessions
   * <p>
   */
  USP("USP"),
  /**
   * United States of America
   * <p>
   */
  USA("USA"),
  /**
   * Unknown
   * <p>
   */
  UNKN("UNKN"),
  /**
   * Uruguay
   * <p>
   */
  URY("URY"),
  /**
   * Uzbekistan
   * <p>
   */
  UZB("UZB"),
  /**
   * Vanuatu
   * <p>
   */
  VUT("VUT"),
  /**
   * Vatican City State
   * <p>
   */
  VAT("VAT"),
  /**
   * Venezuela
   * <p>
   */
  VEN("VEN"),
  /**
   * Vietnam
   * <p>
   */
  VNM("VNM"),
  /**
   * Yemen
   * <p>
   */
  YEM("YEM"),
  /**
   * Yugoslavia (YUG) - Deprecated
   * <p>
   */
  @XmlEnumValue("YO05")
  YO_05("YO05"),
  /**
   * Zambia
   * <p>
   */
  ZMB("ZMB"),
  /**
   * Zimbabwe
   * <p>
   */
  ZWE("ZWE");
  private final String value;

  ListCCY(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCY fromValue(String v) {
    for (ListCCY c : ListCCY.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
