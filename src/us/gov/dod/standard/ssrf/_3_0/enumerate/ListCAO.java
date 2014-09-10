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
package us.gov.dod.standard.ssrf._3_0.enumerate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCAO.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCAO"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S8"> &lt;enumeration value="AFG"/>
 * &lt;enumeration value="FF"/> &lt;enumeration value="US-AL"/> &lt;enumeration
 * value="ALA"/> &lt;enumeration value="US-AK"/> &lt;enumeration value="ALB"/>
 * &lt;enumeration value="DZA"/> &lt;enumeration value="NT-ASC"/>
 * &lt;enumeration value="ASM"/> &lt;enumeration value="AND"/> &lt;enumeration
 * value="AGO"/> &lt;enumeration value="AIA"/> &lt;enumeration value="ANTR"/>
 * &lt;enumeration value="4Z"/> &lt;enumeration value="ATA"/> &lt;enumeration
 * value="ATG"/> &lt;enumeration value="5A"/> &lt;enumeration value="ARG"/>
 * &lt;enumeration value="US-AZ"/> &lt;enumeration value="US-AR"/>
 * &lt;enumeration value="ARM"/> &lt;enumeration value="ABW"/> &lt;enumeration
 * value="SH-AC"/> &lt;enumeration value="AB"/> &lt;enumeration value="9A"/>
 * &lt;enumeration value="AUS"/> &lt;enumeration value="AUSC"/> &lt;enumeration
 * value="AUT"/> &lt;enumeration value="AZE"/> &lt;enumeration value="PT-20"/>
 * &lt;enumeration value="BHS"/> &lt;enumeration value="BHR"/> &lt;enumeration
 * value="UM-8"/> &lt;enumeration value="BGD"/> &lt;enumeration value="BRB"/>
 * &lt;enumeration value="BLR"/> &lt;enumeration value="BEL"/> &lt;enumeration
 * value="BLZ"/> &lt;enumeration value="BEN"/> &lt;enumeration value="BMU"/>
 * &lt;enumeration value="BTN"/> &lt;enumeration value="BWCS"/> &lt;enumeration
 * value="BOL"/> &lt;enumeration value="BES"/> &lt;enumeration value="BIH"/>
 * &lt;enumeration value="BWA"/> &lt;enumeration value="BVT"/> &lt;enumeration
 * value="BRA"/> &lt;enumeration value="IOT"/> &lt;enumeration value="BRN"/>
 * &lt;enumeration value="BGR"/> &lt;enumeration value="BFA"/> &lt;enumeration
 * value="BDI"/> &lt;enumeration value="US-CA"/> &lt;enumeration value="KHM"/>
 * &lt;enumeration value="CMR"/> &lt;enumeration value="CAN"/> &lt;enumeration
 * value="ES-CN"/> &lt;enumeration value="NT-BA1"/> &lt;enumeration
 * value="NT-NA0"/> &lt;enumeration value="NT-BA2"/> &lt;enumeration
 * value="NT-BA3"/> &lt;enumeration value="NT-BA4"/> &lt;enumeration
 * value="NT-NA5"/> &lt;enumeration value="NT-NA6"/> &lt;enumeration
 * value="NT-NA7"/> &lt;enumeration value="NT-NA8"/> &lt;enumeration
 * value="NT-BA9"/> &lt;enumeration value="CPV"/> &lt;enumeration value="CARB"/>
 * &lt;enumeration value="CAI"/> &lt;enumeration value="CYM"/> &lt;enumeration
 * value="NT-NA"/> &lt;enumeration value="NT-BA"/> &lt;enumeration
 * value="CCEB"/> &lt;enumeration value="NT-BL"/> &lt;enumeration
 * value="NT-NL"/> &lt;enumeration value="NT-NM"/> &lt;enumeration
 * value="NT-BM"/> &lt;enumeration value="CAF"/> &lt;enumeration value="CAM"/>
 * &lt;enumeration value="TCD"/> &lt;enumeration value="CWCS"/> &lt;enumeration
 * value="CHL"/> &lt;enumeration value="CHN"/> &lt;enumeration value="CXR"/>
 * &lt;enumeration value="CPMT"/> &lt;enumeration value="CP"/> &lt;enumeration
 * value="CCK"/> &lt;enumeration value="COL"/> &lt;enumeration value="US-CO"/>
 * &lt;enumeration value="CMFC"/> &lt;enumeration value="COM"/> &lt;enumeration
 * value="COG"/> &lt;enumeration value="COD"/> &lt;enumeration value="US-CT"/>
 * &lt;enumeration value="COK"/> &lt;enumeration value="CMFP"/> &lt;enumeration
 * value="CRI"/> &lt;enumeration value="CIV"/> &lt;enumeration value="HRV"/>
 * &lt;enumeration value="FR-TF"/> &lt;enumeration value="CUB"/> &lt;enumeration
 * value="CUW"/> &lt;enumeration value="CYP"/> &lt;enumeration value="CZE"/>
 * &lt;enumeration value="NT-NAD"/> &lt;enumeration value="NT-BAD"/>
 * &lt;enumeration value="US-DE"/> &lt;enumeration value="DNK"/> &lt;enumeration
 * value="DG"/> &lt;enumeration value="US-DC"/> &lt;enumeration value="DJI"/>
 * &lt;enumeration value="DMA"/> &lt;enumeration value="DOM"/> &lt;enumeration
 * value="TLS"/> &lt;enumeration value="EAS"/> &lt;enumeration value="ECU"/>
 * &lt;enumeration value="EGY"/> &lt;enumeration value="SLV"/> &lt;enumeration
 * value="GNQ"/> &lt;enumeration value="ERI"/> &lt;enumeration value="EST"/>
 * &lt;enumeration value="ETH"/> &lt;enumeration value="EE"/> &lt;enumeration
 * value="EUDA"/> &lt;enumeration value="EFOR"/> &lt;enumeration value="FLK"/>
 * &lt;enumeration value="FRO"/> &lt;enumeration value="FJI"/> &lt;enumeration
 * value="FIN"/> &lt;enumeration value="FVEY"/> &lt;enumeration value="US-FL"/>
 * &lt;enumeration value="ACGU"/> &lt;enumeration value="FRA"/> &lt;enumeration
 * value="GUF"/> &lt;enumeration value="PYF"/> &lt;enumeration value="ATF"/>
 * &lt;enumeration value="GAB"/> &lt;enumeration value="GMB"/> &lt;enumeration
 * value="GEO"/> &lt;enumeration value="US-GA"/> &lt;enumeration value="GEOS"/>
 * &lt;enumeration value="DEU"/> &lt;enumeration value="GHA"/> &lt;enumeration
 * value="GIB"/> &lt;enumeration value="GCTF"/> &lt;enumeration value="GMIF"/>
 * &lt;enumeration value="9Z"/> &lt;enumeration value="GRC"/> &lt;enumeration
 * value="GRL"/> &lt;enumeration value="GRD"/> &lt;enumeration value="GLP"/>
 * &lt;enumeration value="GUM"/> &lt;enumeration value="GTM"/> &lt;enumeration
 * value="GGY"/> &lt;enumeration value="GIN"/> &lt;enumeration value="GNB"/>
 * &lt;enumeration value="1M"/> &lt;enumeration value="GUY"/> &lt;enumeration
 * value="HTI"/> &lt;enumeration value="US-HI"/> &lt;enumeration value="HMD"/>
 * &lt;enumeration value="HEME"/> &lt;enumeration value="HEMN"/> &lt;enumeration
 * value="HEMS"/> &lt;enumeration value="HEMW"/> &lt;enumeration value="HND"/>
 * &lt;enumeration value="HKG"/> &lt;enumeration value="UM-84"/> &lt;enumeration
 * value="HUN"/> &lt;enumeration value="ISL"/> &lt;enumeration value="US-ID"/>
 * &lt;enumeration value="US-IL"/> &lt;enumeration value="IND"/> &lt;enumeration
 * value="6A"/> &lt;enumeration value="US-IN"/> &lt;enumeration value="IDN"/>
 * &lt;enumeration value="INTL"/> &lt;enumeration value="ICAO"/> &lt;enumeration
 * value="IESC"/> &lt;enumeration value="ITU"/> &lt;enumeration value="US-IA"/>
 * &lt;enumeration value="IRN"/> &lt;enumeration value="IRQ"/> &lt;enumeration
 * value="IRL"/> &lt;enumeration value="ISAF-AFG"/> &lt;enumeration
 * value="IMN"/> &lt;enumeration value="ISR"/> &lt;enumeration value="ITA"/>
 * &lt;enumeration value="ITU1"/> &lt;enumeration value="ITU2"/> &lt;enumeration
 * value="ITU3"/> &lt;enumeration value="JAM"/> &lt;enumeration value="JPN"/>
 * &lt;enumeration value="UM-86"/> &lt;enumeration value="JEY"/> &lt;enumeration
 * value="NT-B"/> &lt;enumeration value="NT-N"/> &lt;enumeration value="NT-L"/>
 * &lt;enumeration value="UM-67"/> &lt;enumeration value="JOR"/> &lt;enumeration
 * value="US-KS"/> &lt;enumeration value="KAZ"/> &lt;enumeration value="US-KY"/>
 * &lt;enumeration value="KEN"/> &lt;enumeration value="KER"/> &lt;enumeration
 * value="UM-89"/> &lt;enumeration value="KIR"/> &lt;enumeration value="PRK"/>
 * &lt;enumeration value="KOR"/> &lt;enumeration value="YU-KM"/> &lt;enumeration
 * value="KWT"/> &lt;enumeration value="KGZ"/> &lt;enumeration value="9E"/>
 * &lt;enumeration value="9H"/> &lt;enumeration value="9M"/> &lt;enumeration
 * value="9N"/> &lt;enumeration value="9S"/> &lt;enumeration value="LAO"/>
 * &lt;enumeration value="LVA"/> &lt;enumeration value="LBN"/> &lt;enumeration
 * value="LSO"/> &lt;enumeration value="LBR"/> &lt;enumeration value="LBY"/>
 * &lt;enumeration value="LIE"/> &lt;enumeration value="LTU"/> &lt;enumeration
 * value="US-LA"/> &lt;enumeration value="LUX"/> &lt;enumeration value="MAC"/>
 * &lt;enumeration value="MDG"/> &lt;enumeration value="PT-30"/> &lt;enumeration
 * value="US-ME"/> &lt;enumeration value="MWI"/> &lt;enumeration value="MYS"/>
 * &lt;enumeration value="MDV"/> &lt;enumeration value="MLI"/> &lt;enumeration
 * value="MLT"/> &lt;enumeration value="US-MP"/> &lt;enumeration value="MAI"/>
 * &lt;enumeration value="MHL"/> &lt;enumeration value="MTQ"/> &lt;enumeration
 * value="US-MD"/> &lt;enumeration value="US-MA"/> &lt;enumeration value="MRT"/>
 * &lt;enumeration value="MUS"/> &lt;enumeration value="MYT"/> &lt;enumeration
 * value="89"/> &lt;enumeration value="MEX"/> &lt;enumeration value="US-MI"/>
 * &lt;enumeration value="FSM"/> &lt;enumeration value="UM-71"/> &lt;enumeration
 * value="US-MN"/> &lt;enumeration value="US-MS"/> &lt;enumeration
 * value="US-MO"/> &lt;enumeration value="MDA"/> &lt;enumeration value="MCO"/>
 * &lt;enumeration value="MNG"/> &lt;enumeration value="US-MT"/> &lt;enumeration
 * value="MNE"/> &lt;enumeration value="MSR"/> &lt;enumeration value="MAR"/>
 * &lt;enumeration value="MOZ"/> &lt;enumeration value="MLEC"/> &lt;enumeration
 * value="MCFI"/> &lt;enumeration value="MIFH"/> &lt;enumeration value="MULT"/>
 * &lt;enumeration value="MMR"/> &lt;enumeration value="NAM"/> &lt;enumeration
 * value="NT-AEW"/> &lt;enumeration value="NT-ACO"/> &lt;enumeration
 * value="NT-ACT"/> &lt;enumeration value="NT-EUR"/> &lt;enumeration
 * value="NT-HQ"/> &lt;enumeration value="NT-TMI"/> &lt;enumeration
 * value="NRU"/> &lt;enumeration value="UM-76"/> &lt;enumeration value="NC3A"/>
 * &lt;enumeration value="US-NE"/> &lt;enumeration value="NPL"/> &lt;enumeration
 * value="NLD"/> &lt;enumeration value="ANT"/> &lt;enumeration value="US-NV"/>
 * &lt;enumeration value="NCL"/> &lt;enumeration value="US-NH"/> &lt;enumeration
 * value="US-NJ"/> &lt;enumeration value="US-NM"/> &lt;enumeration
 * value="US-NY"/> &lt;enumeration value="NZL"/> &lt;enumeration value="NIC"/>
 * &lt;enumeration value="NER"/> &lt;enumeration value="NGA"/> &lt;enumeration
 * value="NIU"/> &lt;enumeration value="NGEO"/> &lt;enumeration value="NFK"/>
 * &lt;enumeration value="NACT"/> &lt;enumeration value="NN"/> &lt;enumeration
 * value="NATO"/> &lt;enumeration value="US-NC"/> &lt;enumeration
 * value="US-ND"/> &lt;enumeration value="MNP"/> &lt;enumeration value="NOR"/>
 * &lt;enumeration value="UU"/> &lt;enumeration value="US-OH"/> &lt;enumeration
 * value="US-OK"/> &lt;enumeration value="OMN"/> &lt;enumeration value="US-OR"/>
 * &lt;enumeration value="OTH"/> &lt;enumeration value="4O"/> &lt;enumeration
 * value="PAK"/> &lt;enumeration value="PLW"/> &lt;enumeration value="PSE"/>
 * &lt;enumeration value="UM-95"/> &lt;enumeration value="PAN"/> &lt;enumeration
 * value="PNG"/> &lt;enumeration value="PRY"/> &lt;enumeration value="US-PA"/>
 * &lt;enumeration value="PER"/> &lt;enumeration value="PHL"/> &lt;enumeration
 * value="KI-P"/> &lt;enumeration value="PCN"/> &lt;enumeration value="POL"/>
 * &lt;enumeration value="PRT"/> &lt;enumeration value="PRI"/> &lt;enumeration
 * value="QAT"/> &lt;enumeration value="RCVR"/> &lt;enumeration value="REU"/>
 * &lt;enumeration value="US-RI"/> &lt;enumeration value="MU-RO"/>
 * &lt;enumeration value="CFCK"/> &lt;enumeration value="ROU"/> &lt;enumeration
 * value="RUS"/> &lt;enumeration value="RWA"/> &lt;enumeration value="BLM"/>
 * &lt;enumeration value="SHN"/> &lt;enumeration value="KNA"/> &lt;enumeration
 * value="LCA"/> &lt;enumeration value="MAF"/> &lt;enumeration value="AMS"/>
 * &lt;enumeration value="SPM"/> &lt;enumeration value="VCT"/> &lt;enumeration
 * value="WSM"/> &lt;enumeration value="SMR"/> &lt;enumeration value="DO-26"/>
 * &lt;enumeration value="STP"/> &lt;enumeration value="SAU"/> &lt;enumeration
 * value="SEN"/> &lt;enumeration value="SRB"/> &lt;enumeration value="SYC"/>
 * &lt;enumeration value="SLE"/> &lt;enumeration value="SGP"/> &lt;enumeration
 * value="SXM"/> &lt;enumeration value="SVK"/> &lt;enumeration value="SVN"/>
 * &lt;enumeration value="SLB"/> &lt;enumeration value="SOM"/> &lt;enumeration
 * value="ZAF"/> &lt;enumeration value="SR"/> &lt;enumeration value="US-SC"/>
 * &lt;enumeration value="US-SD"/> &lt;enumeration value="SGS"/> &lt;enumeration
 * value="SPCE"/> &lt;enumeration value="ESP"/> &lt;enumeration value="NT-HQS"/>
 * &lt;enumeration value="LKA"/> &lt;enumeration value="KFOR"/> &lt;enumeration
 * value="NT-STF"/> &lt;enumeration value="SDN"/> &lt;enumeration value="SUR"/>
 * &lt;enumeration value="SJM"/> &lt;enumeration value="SWA"/> &lt;enumeration
 * value="SWZ"/> &lt;enumeration value="SWE"/> &lt;enumeration value="CHE"/>
 * &lt;enumeration value="SYR"/> &lt;enumeration value="TWN"/> &lt;enumeration
 * value="TJK"/> &lt;enumeration value="TZA"/> &lt;enumeration value="US-TN"/>
 * &lt;enumeration value="US-TX"/> &lt;enumeration value="THA"/> &lt;enumeration
 * value="FYR"/> &lt;enumeration value="TEYE"/> &lt;enumeration value="TGO"/>
 * &lt;enumeration value="TKL"/> &lt;enumeration value="TON"/> &lt;enumeration
 * value="TTO"/> &lt;enumeration value="SH-TA"/> &lt;enumeration value="TUN"/>
 * &lt;enumeration value="TUR"/> &lt;enumeration value="TKM"/> &lt;enumeration
 * value="TCA"/> &lt;enumeration value="TUV"/> &lt;enumeration value="UGA"/>
 * &lt;enumeration value="UKT1"/> &lt;enumeration value="UKT3"/> &lt;enumeration
 * value="UKR"/> &lt;enumeration value="ARE"/> &lt;enumeration value="GBR"/>
 * &lt;enumeration value="UN"/> &lt;enumeration value="UNCK"/> &lt;enumeration
 * value="USC"/> &lt;enumeration value="USP"/> &lt;enumeration value="UMI"/>
 * &lt;enumeration value="USA"/> &lt;enumeration value="UNKN"/> &lt;enumeration
 * value="URY"/> &lt;enumeration value="USCE"/> &lt;enumeration value="SCML"/>
 * &lt;enumeration value="USMW"/> &lt;enumeration value="USNC"/> &lt;enumeration
 * value="USNE"/> &lt;enumeration value="USNW"/> &lt;enumeration value="USSC"/>
 * &lt;enumeration value="USSE"/> &lt;enumeration value="USSW"/> &lt;enumeration
 * value="USWE"/> &lt;enumeration value="US-UT"/> &lt;enumeration value="UZB"/>
 * &lt;enumeration value="VUT"/> &lt;enumeration value="VAT"/> &lt;enumeration
 * value="VEN"/> &lt;enumeration value="US-VT"/> &lt;enumeration value="VNM"/>
 * &lt;enumeration value="VGB"/> &lt;enumeration value="VIR"/> &lt;enumeration
 * value="US-VA"/> &lt;enumeration value="XVE"/> &lt;enumeration value="UM-79"/>
 * &lt;enumeration value="WLF"/> &lt;enumeration value="US-WA"/> &lt;enumeration
 * value="US-WV"/> &lt;enumeration value="ESH"/> &lt;enumeration value="US-WI"/>
 * &lt;enumeration value="US-WY"/> &lt;enumeration value="YEM"/> &lt;enumeration
 * value="YO05"/> &lt;enumeration value="ZMB"/> &lt;enumeration value="ZWE"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAO")
@XmlEnum
public enum ListCAO {

  /**
   * Afghanistan
   * <p>
   */
  @XmlEnumValue("AFG")
  VALUE_1("AFG"),
  /**
   * Africa
   * <p>
   */
  @XmlEnumValue("FF")
  VALUE_2("FF"),
  /**
   * Alabama
   * <p>
   */
  @XmlEnumValue("US-AL")
  VALUE_3("US-AL"),
  /**
   * Åland Islands
   * <p>
   */
  @XmlEnumValue("ALA")
  VALUE_4("ALA"),
  /**
   * Alaska
   * <p>
   */
  @XmlEnumValue("US-AK")
  VALUE_5("US-AK"),
  /**
   * Albania
   * <p>
   */
  @XmlEnumValue("ALB")
  VALUE_6("ALB"),
  /**
   * Algeria
   * <p>
   */
  @XmlEnumValue("DZA")
  VALUE_7("DZA"),
  /**
   * Allied Submarine Command
   * <p>
   */
  @XmlEnumValue("NT-ASC")
  VALUE_8("NT-ASC"),
  /**
   * American Samoa
   * <p>
   */
  @XmlEnumValue("ASM")
  VALUE_9("ASM"),
  /**
   * Andorra
   * <p>
   */
  @XmlEnumValue("AND")
  VALUE_10("AND"),
  /**
   * Angola
   * <p>
   */
  @XmlEnumValue("AGO")
  VALUE_11("AGO"),
  /**
   * Anguilla
   * <p>
   */
  @XmlEnumValue("AIA")
  VALUE_12("AIA"),
  /**
   * Antarctic
   * <p>
   */
  @XmlEnumValue("ANTR")
  VALUE_13("ANTR"),
  /**
   * Antarctic Ocean
   * <p>
   */
  @XmlEnumValue("4Z")
  VALUE_14("4Z"),
  /**
   * Antarctica Continent
   * <p>
   */
  @XmlEnumValue("ATA")
  VALUE_15("ATA"),
  /**
   * Antigua and Barbuda
   * <p>
   */
  @XmlEnumValue("ATG")
  VALUE_16("ATG"),
  /**
   * Arctic Ocean
   * <p>
   */
  @XmlEnumValue("5A")
  VALUE_17("5A"),
  /**
   * Argentine Republic
   * <p>
   */
  @XmlEnumValue("ARG")
  VALUE_18("ARG"),
  /**
   * Arizona
   * <p>
   */
  @XmlEnumValue("US-AZ")
  VALUE_19("US-AZ"),
  /**
   * Arkansas
   * <p>
   */
  @XmlEnumValue("US-AR")
  VALUE_20("US-AR"),
  /**
   * Armenia
   * <p>
   */
  @XmlEnumValue("ARM")
  VALUE_21("ARM"),
  /**
   * Aruba
   * <p>
   */
  @XmlEnumValue("ABW")
  VALUE_22("ABW"),
  /**
   * Ascension
   * <p>
   */
  @XmlEnumValue("SH-AC")
  VALUE_23("SH-AC"),
  /**
   * Asia Continent
   * <p>
   */
  @XmlEnumValue("AB")
  VALUE_24("AB"),
  /**
   * Atlantic Ocean
   * <p>
   */
  @XmlEnumValue("9A")
  VALUE_25("9A"),
  /**
   * Australia
   * <p>
   */
  @XmlEnumValue("AUS")
  VALUE_26("AUS"),
  /**
   * Australia Continent
   * <p>
   */
  @XmlEnumValue("AUSC")
  VALUE_27("AUSC"),
  /**
   * Austria
   * <p>
   */
  @XmlEnumValue("AUT")
  VALUE_28("AUT"),
  /**
   * Azerbaijan
   * <p>
   */
  @XmlEnumValue("AZE")
  VALUE_29("AZE"),
  /**
   * Azores
   * <p>
   */
  @XmlEnumValue("PT-20")
  VALUE_30("PT-20"),
  /**
   * Bahamas
   * <p>
   */
  @XmlEnumValue("BHS")
  VALUE_31("BHS"),
  /**
   * Bahrain
   * <p>
   */
  @XmlEnumValue("BHR")
  VALUE_32("BHR"),
  /**
   * Baker Island
   * <p>
   */
  @XmlEnumValue("UM-8")
  VALUE_33("UM-8"),
  /**
   * Bangladesh
   * <p>
   */
  @XmlEnumValue("BGD")
  VALUE_34("BGD"),
  /**
   * Barbados
   * <p>
   */
  @XmlEnumValue("BRB")
  VALUE_35("BRB"),
  /**
   * Belarus
   * <p>
   */
  @XmlEnumValue("BLR")
  VALUE_36("BLR"),
  /**
   * Belgium
   * <p>
   */
  @XmlEnumValue("BEL")
  VALUE_37("BEL"),
  /**
   * Belize
   * <p>
   */
  @XmlEnumValue("BLZ")
  VALUE_38("BLZ"),
  /**
   * Benin
   * <p>
   */
  @XmlEnumValue("BEN")
  VALUE_39("BEN"),
  /**
   * Bermuda
   * <p>
   */
  @XmlEnumValue("BMU")
  VALUE_40("BMU"),
  /**
   * Bhutan
   * <p>
   */
  @XmlEnumValue("BTN")
  VALUE_41("BTN"),
  /**
   * Biological Weapons Convention States
   * <p>
   */
  @XmlEnumValue("BWCS")
  VALUE_42("BWCS"),
  /**
   * Bolivia
   * <p>
   */
  @XmlEnumValue("BOL")
  VALUE_43("BOL"),
  /**
   * Bonaire, Saint Eustatius and Saba
   * <p>
   */
  @XmlEnumValue("BES")
  VALUE_44("BES"),
  /**
   * Bosnia and Herzegovina
   * <p>
   */
  @XmlEnumValue("BIH")
  VALUE_45("BIH"),
  /**
   * Botswana
   * <p>
   */
  @XmlEnumValue("BWA")
  VALUE_46("BWA"),
  /**
   * Bouvet Island
   * <p>
   */
  @XmlEnumValue("BVT")
  VALUE_47("BVT"),
  /**
   * Brazil
   * <p>
   */
  @XmlEnumValue("BRA")
  VALUE_48("BRA"),
  /**
   * British Indian Ocean Territory
   * <p>
   */
  @XmlEnumValue("IOT")
  VALUE_49("IOT"),
  /**
   * Brunei Darussalam
   * <p>
   */
  @XmlEnumValue("BRN")
  VALUE_50("BRN"),
  /**
   * Bulgaria
   * <p>
   */
  @XmlEnumValue("BGR")
  VALUE_51("BGR"),
  /**
   * Burkina Faso
   * <p>
   */
  @XmlEnumValue("BFA")
  VALUE_52("BFA"),
  /**
   * Burundi
   * <p>
   */
  @XmlEnumValue("BDI")
  VALUE_53("BDI"),
  /**
   * California
   * <p>
   */
  @XmlEnumValue("US-CA")
  VALUE_54("US-CA"),
  /**
   * Cambodia
   * <p>
   */
  @XmlEnumValue("KHM")
  VALUE_55("KHM"),
  /**
   * Cameroon
   * <p>
   */
  @XmlEnumValue("CMR")
  VALUE_56("CMR"),
  /**
   * Canada
   * <p>
   */
  @XmlEnumValue("CAN")
  VALUE_57("CAN"),
  /**
   * Canary Islands
   * <p>
   */
  @XmlEnumValue("ES-CN")
  VALUE_58("ES-CN"),
  /**
   * CAOC 1 Finderup Denmark
   * <p>
   */
  @XmlEnumValue("NT-BA1")
  VALUE_59("NT-BA1"),
  /**
   * CAOC 10 Monsanto Portugal
   * <p>
   */
  @XmlEnumValue("NT-NA0")
  VALUE_60("NT-NA0"),
  /**
   * CAOC 2 Uedem Germany
   * <p>
   */
  @XmlEnumValue("NT-BA2")
  VALUE_61("NT-BA2"),
  /**
   * CAOC 3 Reitan Norway
   * <p>
   */
  @XmlEnumValue("NT-BA3")
  VALUE_62("NT-BA3"),
  /**
   * CAOC 4 Meßstetten Germany
   * <p>
   */
  @XmlEnumValue("NT-BA4")
  VALUE_63("NT-BA4"),
  /**
   * CAOC 5 Poggio Renatico Italy
   * <p>
   */
  @XmlEnumValue("NT-NA5")
  VALUE_64("NT-NA5"),
  /**
   * CAOC 6 Eskisehir Turkey
   * <p>
   */
  @XmlEnumValue("NT-NA6")
  VALUE_65("NT-NA6"),
  /**
   * CAOC 7 Larissa Greece
   * <p>
   */
  @XmlEnumValue("NT-NA7")
  VALUE_66("NT-NA7"),
  /**
   * CAOC 8 Torrejon Spain
   * <p>
   */
  @XmlEnumValue("NT-NA8")
  VALUE_67("NT-NA8"),
  /**
   * CAOC 9 High Wycombe United Kingdom
   * <p>
   */
  @XmlEnumValue("NT-BA9")
  VALUE_68("NT-BA9"),
  /**
   * Cape Verde
   * <p>
   */
  @XmlEnumValue("CPV")
  VALUE_69("CPV"),
  /**
   * Caribbean
   * <p>
   */
  @XmlEnumValue("CARB")
  VALUE_70("CARB"),
  /**
   * Caroline Islands
   * <p>
   */
  @XmlEnumValue("CAI")
  VALUE_71("CAI"),
  /**
   * Cayman Islands
   * <p>
   */
  @XmlEnumValue("CYM")
  VALUE_72("CYM"),
  /**
   * CC-Air Izmir
   * <p>
   */
  @XmlEnumValue("NT-NA")
  VALUE_73("NT-NA"),
  /**
   * CC-Air Ramstein
   * <p>
   */
  @XmlEnumValue("NT-BA")
  VALUE_74("NT-BA"),
  /**
   * CCEB Nations (AUS, CAN, GBR, NZL, USA)
   * <p>
   */
  @XmlEnumValue("CCEB")
  VALUE_75("CCEB"),
  /**
   * CC-Land Heidelberg
   * <p>
   */
  @XmlEnumValue("NT-BL")
  VALUE_76("NT-BL"),
  /**
   * CC-Land Madrid
   * <p>
   */
  @XmlEnumValue("NT-NL")
  VALUE_77("NT-NL"),
  /**
   * CC-Maritime Naples
   * <p>
   */
  @XmlEnumValue("NT-NM")
  VALUE_78("NT-NM"),
  /**
   * CC-Maritime Northwood
   * <p>
   */
  @XmlEnumValue("NT-BM")
  VALUE_79("NT-BM"),
  /**
   * Central African Republic
   * <p>
   */
  @XmlEnumValue("CAF")
  VALUE_80("CAF"),
  /**
   * Central America
   * <p>
   */
  @XmlEnumValue("CAM")
  VALUE_81("CAM"),
  /**
   * Chad
   * <p>
   */
  @XmlEnumValue("TCD")
  VALUE_82("TCD"),
  /**
   * Chemical Weapons Convention States
   * <p>
   */
  @XmlEnumValue("CWCS")
  VALUE_83("CWCS"),
  /**
   * Chile
   * <p>
   */
  @XmlEnumValue("CHL")
  VALUE_84("CHL"),
  /**
   * China
   * <p>
   */
  @XmlEnumValue("CHN")
  VALUE_85("CHN"),
  /**
   * Christmas Island
   * <p>
   */
  @XmlEnumValue("CXR")
  VALUE_86("CXR"),
  /**
   * Civilian Protection Monitoring Team for Sudan
   * <p>
   */
  @XmlEnumValue("CPMT")
  VALUE_87("CPMT"),
  /**
   * Clipperton Island
   * <p>
   */
  @XmlEnumValue("CP")
  VALUE_88("CP"),
  /**
   * Cocos (Keeling) Islands
   * <p>
   */
  @XmlEnumValue("CCK")
  VALUE_89("CCK"),
  /**
   * Colombia
   * <p>
   */
  @XmlEnumValue("COL")
  VALUE_90("COL"),
  /**
   * Colorado
   * <p>
   */
  @XmlEnumValue("US-CO")
  VALUE_91("US-CO"),
  /**
   * Combined Maritime Forces
   * <p>
   */
  @XmlEnumValue("CMFC")
  VALUE_92("CMFC"),
  /**
   * Comoros
   * <p>
   */
  @XmlEnumValue("COM")
  VALUE_93("COM"),
  /**
   * Congo
   * <p>
   */
  @XmlEnumValue("COG")
  VALUE_94("COG"),
  /**
   * Congo (Democratic Republic of the)
   * <p>
   */
  @XmlEnumValue("COD")
  VALUE_95("COD"),
  /**
   * Connecticut
   * <p>
   */
  @XmlEnumValue("US-CT")
  VALUE_96("US-CT"),
  /**
   * Cook Islands
   * <p>
   */
  @XmlEnumValue("COK")
  VALUE_97("COK"),
  /**
   * Cooperative Maritime Forces Pacific
   * <p>
   */
  @XmlEnumValue("CMFP")
  VALUE_98("CMFP"),
  /**
   * Costa Rica
   * <p>
   */
  @XmlEnumValue("CRI")
  VALUE_99("CRI"),
  /**
   * Ivory Coast
   * <p>
   */
  @XmlEnumValue("CIV")
  VALUE_100("CIV"),
  /**
   * Croatia
   * <p>
   */
  @XmlEnumValue("HRV")
  VALUE_101("HRV"),
  /**
   * Crozet Archipelago
   * <p>
   */
  @XmlEnumValue("FR-TF")
  VALUE_102("FR-TF"),
  /**
   * Cuba
   * <p>
   */
  @XmlEnumValue("CUB")
  VALUE_103("CUB"),
  /**
   * Curaçao
   * <p>
   */
  @XmlEnumValue("CUW")
  VALUE_104("CUW"),
  /**
   * Cyprus (See footnote 1)
   * <p>
   */
  @XmlEnumValue("CYP")
  VALUE_105("CYP"),
  /**
   * Czech Republic
   * <p>
   */
  @XmlEnumValue("CZE")
  VALUE_106("CZE"),
  /**
   * D-CAOC P. Renatico
   * <p>
   */
  @XmlEnumValue("NT-NAD")
  VALUE_107("NT-NAD"),
  /**
   * D-CAOC Uedem Germany
   * <p>
   */
  @XmlEnumValue("NT-BAD")
  VALUE_108("NT-BAD"),
  /**
   * Delaware
   * <p>
   */
  @XmlEnumValue("US-DE")
  VALUE_109("US-DE"),
  /**
   * Denmark
   * <p>
   */
  @XmlEnumValue("DNK")
  VALUE_110("DNK"),
  /**
   * Diego Garcia
   * <p>
   */
  @XmlEnumValue("DG")
  VALUE_111("DG"),
  /**
   * District of Columbia
   * <p>
   */
  @XmlEnumValue("US-DC")
  VALUE_112("US-DC"),
  /**
   * Djibouti
   * <p>
   */
  @XmlEnumValue("DJI")
  VALUE_113("DJI"),
  /**
   * Dominica
   * <p>
   */
  @XmlEnumValue("DMA")
  VALUE_114("DMA"),
  /**
   * Dominican Republic
   * <p>
   */
  @XmlEnumValue("DOM")
  VALUE_115("DOM"),
  /**
   * East Timor
   * <p>
   */
  @XmlEnumValue("TLS")
  VALUE_116("TLS"),
  /**
   * Easter Island
   * <p>
   */
  @XmlEnumValue("EAS")
  VALUE_117("EAS"),
  /**
   * Ecuador
   * <p>
   */
  @XmlEnumValue("ECU")
  VALUE_118("ECU"),
  /**
   * Egypt
   * <p>
   */
  @XmlEnumValue("EGY")
  VALUE_119("EGY"),
  /**
   * El Salvador
   * <p>
   */
  @XmlEnumValue("SLV")
  VALUE_120("SLV"),
  /**
   * Equatorial Guinea
   * <p>
   */
  @XmlEnumValue("GNQ")
  VALUE_121("GNQ"),
  /**
   * Eritrea
   * <p>
   */
  @XmlEnumValue("ERI")
  VALUE_122("ERI"),
  /**
   * Estonia
   * <p>
   */
  @XmlEnumValue("EST")
  VALUE_123("EST"),
  /**
   * Ethiopia
   * <p>
   */
  @XmlEnumValue("ETH")
  VALUE_124("ETH"),
  /**
   * Europe Continent
   * <p>
   */
  @XmlEnumValue("EE")
  VALUE_125("EE"),
  /**
   * European Union DARFUR
   * <p>
   */
  @XmlEnumValue("EUDA")
  VALUE_126("EUDA"),
  /**
   * European Union Stabilization Forces in Bosnia
   * <p>
   */
  @XmlEnumValue("EFOR")
  VALUE_127("EFOR"),
  /**
   * Falkland Islands (Malvinas)
   * <p>
   */
  @XmlEnumValue("FLK")
  VALUE_128("FLK"),
  /**
   * Faroe Islands
   * <p>
   */
  @XmlEnumValue("FRO")
  VALUE_129("FRO"),
  /**
   * Fiji
   * <p>
   */
  @XmlEnumValue("FJI")
  VALUE_130("FJI"),
  /**
   * Finland
   * <p>
   */
  @XmlEnumValue("FIN")
  VALUE_131("FIN"),
  /**
   * FIVE EYES (USA, CAN, GBR, AUS, NZL)
   * <p>
   */
  @XmlEnumValue("FVEY")
  VALUE_132("FVEY"),
  /**
   * Florida
   * <p>
   */
  @XmlEnumValue("US-FL")
  VALUE_133("US-FL"),
  /**
   * FOUR EYES (USA, CAN, GBR, AUS)
   * <p>
   */
  @XmlEnumValue("ACGU")
  VALUE_134("ACGU"),
  /**
   * France
   * <p>
   */
  @XmlEnumValue("FRA")
  VALUE_135("FRA"),
  /**
   * French Guiana
   * <p>
   */
  @XmlEnumValue("GUF")
  VALUE_136("GUF"),
  /**
   * French Polynesia
   * <p>
   */
  @XmlEnumValue("PYF")
  VALUE_137("PYF"),
  /**
   * French Southern Territories
   * <p>
   */
  @XmlEnumValue("ATF")
  VALUE_138("ATF"),
  /**
   * Gabon
   * <p>
   */
  @XmlEnumValue("GAB")
  VALUE_139("GAB"),
  /**
   * Gambia
   * <p>
   */
  @XmlEnumValue("GMB")
  VALUE_140("GMB"),
  /**
   * Georgia
   * <p>
   */
  @XmlEnumValue("GEO")
  VALUE_141("GEO"),
  /**
   * Georgia
   * <p>
   */
  @XmlEnumValue("US-GA")
  VALUE_142("US-GA"),
  /**
   * Geostationary Satellite
   * <p>
   */
  @XmlEnumValue("GEOS")
  VALUE_143("GEOS"),
  /**
   * Germany
   * <p>
   */
  @XmlEnumValue("DEU")
  VALUE_144("DEU"),
  /**
   * Ghana
   * <p>
   */
  @XmlEnumValue("GHA")
  VALUE_145("GHA"),
  /**
   * Gibraltar
   * <p>
   */
  @XmlEnumValue("GIB")
  VALUE_146("GIB"),
  /**
   * Global Counter-Terrorism Forces
   * <p>
   */
  @XmlEnumValue("GCTF")
  VALUE_147("GCTF"),
  /**
   * Global Maritime Interception Forces
   * <p>
   */
  @XmlEnumValue("GMIF")
  VALUE_148("GMIF"),
  /**
   * Great Lakes
   * <p>
   */
  @XmlEnumValue("9Z")
  VALUE_149("9Z"),
  /**
   * Greece
   * <p>
   */
  @XmlEnumValue("GRC")
  VALUE_150("GRC"),
  /**
   * Greenland
   * <p>
   */
  @XmlEnumValue("GRL")
  VALUE_151("GRL"),
  /**
   * Grenada
   * <p>
   */
  @XmlEnumValue("GRD")
  VALUE_152("GRD"),
  /**
   * Guadeloupe
   * <p>
   */
  @XmlEnumValue("GLP")
  VALUE_153("GLP"),
  /**
   * Guam
   * <p>
   */
  @XmlEnumValue("GUM")
  VALUE_154("GUM"),
  /**
   * Guatemala
   * <p>
   */
  @XmlEnumValue("GTM")
  VALUE_155("GTM"),
  /**
   * Guernsey
   * <p>
   */
  @XmlEnumValue("GGY")
  VALUE_156("GGY"),
  /**
   * Guinea
   * <p>
   */
  @XmlEnumValue("GIN")
  VALUE_157("GIN"),
  /**
   * Guinea-Bissau
   * <p>
   */
  @XmlEnumValue("GNB")
  VALUE_158("GNB"),
  /**
   * Gulf of Mexico
   * <p>
   */
  @XmlEnumValue("1M")
  VALUE_159("1M"),
  /**
   * Guyana
   * <p>
   */
  @XmlEnumValue("GUY")
  VALUE_160("GUY"),
  /**
   * Haiti
   * <p>
   */
  @XmlEnumValue("HTI")
  VALUE_161("HTI"),
  /**
   * Hawaii
   * <p>
   */
  @XmlEnumValue("US-HI")
  VALUE_162("US-HI"),
  /**
   * Heard and McDonald Islands
   * <p>
   */
  @XmlEnumValue("HMD")
  VALUE_163("HMD"),
  /**
   * Hemisphere East
   * <p>
   */
  @XmlEnumValue("HEME")
  VALUE_164("HEME"),
  /**
   * Hemisphere North
   * <p>
   */
  @XmlEnumValue("HEMN")
  VALUE_165("HEMN"),
  /**
   * Hemisphere South
   * <p>
   */
  @XmlEnumValue("HEMS")
  VALUE_166("HEMS"),
  /**
   * Hemisphere West
   * <p>
   */
  @XmlEnumValue("HEMW")
  VALUE_167("HEMW"),
  /**
   * Honduras
   * <p>
   */
  @XmlEnumValue("HND")
  VALUE_168("HND"),
  /**
   * Hong Kong
   * <p>
   */
  @XmlEnumValue("HKG")
  VALUE_169("HKG"),
  /**
   * Howland Island
   * <p>
   */
  @XmlEnumValue("UM-84")
  VALUE_170("UM-84"),
  /**
   * Hungary
   * <p>
   */
  @XmlEnumValue("HUN")
  VALUE_171("HUN"),
  /**
   * Iceland
   * <p>
   */
  @XmlEnumValue("ISL")
  VALUE_172("ISL"),
  /**
   * Idaho
   * <p>
   */
  @XmlEnumValue("US-ID")
  VALUE_173("US-ID"),
  /**
   * Illinois
   * <p>
   */
  @XmlEnumValue("US-IL")
  VALUE_174("US-IL"),
  /**
   * India
   * <p>
   */
  @XmlEnumValue("IND")
  VALUE_175("IND"),
  /**
   * Indian Ocean
   * <p>
   */
  @XmlEnumValue("6A")
  VALUE_176("6A"),
  /**
   * Indiana
   * <p>
   */
  @XmlEnumValue("US-IN")
  VALUE_177("US-IN"),
  /**
   * Indonesia
   * <p>
   */
  @XmlEnumValue("IDN")
  VALUE_178("IDN"),
  /**
   * International
   * <p>
   */
  @XmlEnumValue("INTL")
  VALUE_179("INTL"),
  /**
   * International Civil Aviation Organization
   * <p>
   */
  @XmlEnumValue("ICAO")
  VALUE_180("ICAO"),
  /**
   * International Events Security Coalition
   * <p>
   */
  @XmlEnumValue("IESC")
  VALUE_181("IESC"),
  /**
   * International Telecommunications Union
   * <p>
   */
  @XmlEnumValue("ITU")
  VALUE_182("ITU"),
  /**
   * Iowa
   * <p>
   */
  @XmlEnumValue("US-IA")
  VALUE_183("US-IA"),
  /**
   * Iran
   * <p>
   */
  @XmlEnumValue("IRN")
  VALUE_184("IRN"),
  /**
   * Iraq
   * <p>
   */
  @XmlEnumValue("IRQ")
  VALUE_185("IRQ"),
  /**
   * Ireland
   * <p>
   */
  @XmlEnumValue("IRL")
  VALUE_186("IRL"),
  /**
   * ISAF for Afghanistan
   * <p>
   */
  @XmlEnumValue("ISAF-AFG")
  VALUE_187("ISAF-AFG"),
  /**
   * Isle of Man
   * <p>
   */
  @XmlEnumValue("IMN")
  VALUE_188("IMN"),
  /**
   * Israel
   * <p>
   */
  @XmlEnumValue("ISR")
  VALUE_189("ISR"),
  /**
   * Italy
   * <p>
   */
  @XmlEnumValue("ITA")
  VALUE_190("ITA"),
  /**
   * ITU Region 1
   * <p>
   */
  @XmlEnumValue("ITU1")
  VALUE_191("ITU1"),
  /**
   * ITU Region 2
   * <p>
   */
  @XmlEnumValue("ITU2")
  VALUE_192("ITU2"),
  /**
   * ITU Region 3
   * <p>
   */
  @XmlEnumValue("ITU3")
  VALUE_193("ITU3"),
  /**
   * Jamaica
   * <p>
   */
  @XmlEnumValue("JAM")
  VALUE_194("JAM"),
  /**
   * Japan
   * <p>
   */
  @XmlEnumValue("JPN")
  VALUE_195("JPN"),
  /**
   * Jarvis Island
   * <p>
   */
  @XmlEnumValue("UM-86")
  VALUE_196("UM-86"),
  /**
   * Jersey
   * <p>
   */
  @XmlEnumValue("JEY")
  VALUE_197("JEY"),
  /**
   * JFC HQ Brunssum
   * <p>
   */
  @XmlEnumValue("NT-B")
  VALUE_198("NT-B"),
  /**
   * JFC Naples
   * <p>
   */
  @XmlEnumValue("NT-N")
  VALUE_199("NT-N"),
  /**
   * JHQ Lisbon
   * <p>
   */
  @XmlEnumValue("NT-L")
  VALUE_200("NT-L"),
  /**
   * Johnston Atoll
   * <p>
   */
  @XmlEnumValue("UM-67")
  VALUE_201("UM-67"),
  /**
   * Jordan
   * <p>
   */
  @XmlEnumValue("JOR")
  VALUE_202("JOR"),
  /**
   * Kansas
   * <p>
   */
  @XmlEnumValue("US-KS")
  VALUE_203("US-KS"),
  /**
   * Kazakhstan
   * <p>
   */
  @XmlEnumValue("KAZ")
  VALUE_204("KAZ"),
  /**
   * Kentucky
   * <p>
   */
  @XmlEnumValue("US-KY")
  VALUE_205("US-KY"),
  /**
   * Kenya
   * <p>
   */
  @XmlEnumValue("KEN")
  VALUE_206("KEN"),
  /**
   * Kerguelen Islands
   * <p>
   */
  @XmlEnumValue("KER")
  VALUE_207("KER"),
  /**
   * Kingman Reef
   * <p>
   */
  @XmlEnumValue("UM-89")
  VALUE_208("UM-89"),
  /**
   * Kiribati
   * <p>
   */
  @XmlEnumValue("KIR")
  VALUE_209("KIR"),
  /**
   * Korea, North
   * <p>
   */
  @XmlEnumValue("PRK")
  VALUE_210("PRK"),
  /**
   * Korea, South
   * <p>
   */
  @XmlEnumValue("KOR")
  VALUE_211("KOR"),
  /**
   * Kosovo
   * <p>
   */
  @XmlEnumValue("YU-KM")
  VALUE_212("YU-KM"),
  /**
   * Kuwait
   * <p>
   */
  @XmlEnumValue("KWT")
  VALUE_213("KWT"),
  /**
   * Kyrgyzstan
   * <p>
   */
  @XmlEnumValue("KGZ")
  VALUE_214("KGZ"),
  /**
   * Lake Erie
   * <p>
   */
  @XmlEnumValue("9E")
  VALUE_215("9E"),
  /**
   * Lake Huron
   * <p>
   */
  @XmlEnumValue("9H")
  VALUE_216("9H"),
  /**
   * Lake Michigan
   * <p>
   */
  @XmlEnumValue("9M")
  VALUE_217("9M"),
  /**
   * Lake Ontario
   * <p>
   */
  @XmlEnumValue("9N")
  VALUE_218("9N"),
  /**
   * Lake Superior
   * <p>
   */
  @XmlEnumValue("9S")
  VALUE_219("9S"),
  /**
   * Laos
   * <p>
   */
  @XmlEnumValue("LAO")
  VALUE_220("LAO"),
  /**
   * Latvia
   * <p>
   */
  @XmlEnumValue("LVA")
  VALUE_221("LVA"),
  /**
   * Lebanon
   * <p>
   */
  @XmlEnumValue("LBN")
  VALUE_222("LBN"),
  /**
   * Lesotho
   * <p>
   */
  @XmlEnumValue("LSO")
  VALUE_223("LSO"),
  /**
   * Liberia
   * <p>
   */
  @XmlEnumValue("LBR")
  VALUE_224("LBR"),
  /**
   * Libya
   * <p>
   */
  @XmlEnumValue("LBY")
  VALUE_225("LBY"),
  /**
   * Liechtenstein
   * <p>
   */
  @XmlEnumValue("LIE")
  VALUE_226("LIE"),
  /**
   * Lithuania
   * <p>
   */
  @XmlEnumValue("LTU")
  VALUE_227("LTU"),
  /**
   * Louisiana
   * <p>
   */
  @XmlEnumValue("US-LA")
  VALUE_228("US-LA"),
  /**
   * Luxembourg
   * <p>
   */
  @XmlEnumValue("LUX")
  VALUE_229("LUX"),
  /**
   * Macao
   * <p>
   */
  @XmlEnumValue("MAC")
  VALUE_230("MAC"),
  /**
   * Madagascar
   * <p>
   */
  @XmlEnumValue("MDG")
  VALUE_231("MDG"),
  /**
   * Madeira
   * <p>
   */
  @XmlEnumValue("PT-30")
  VALUE_232("PT-30"),
  /**
   * Maine
   * <p>
   */
  @XmlEnumValue("US-ME")
  VALUE_233("US-ME"),
  /**
   * Malawi
   * <p>
   */
  @XmlEnumValue("MWI")
  VALUE_234("MWI"),
  /**
   * Malaysia
   * <p>
   */
  @XmlEnumValue("MYS")
  VALUE_235("MYS"),
  /**
   * Maldives
   * <p>
   */
  @XmlEnumValue("MDV")
  VALUE_236("MDV"),
  /**
   * Mali
   * <p>
   */
  @XmlEnumValue("MLI")
  VALUE_237("MLI"),
  /**
   * Malta
   * <p>
   */
  @XmlEnumValue("MLT")
  VALUE_238("MLT"),
  /**
   * Mariana Islands (excluding Guam)
   * <p>
   */
  @XmlEnumValue("US-MP")
  VALUE_239("US-MP"),
  /**
   * Marion Island
   * <p>
   */
  @XmlEnumValue("MAI")
  VALUE_240("MAI"),
  /**
   * Marshall Islands
   * <p>
   */
  @XmlEnumValue("MHL")
  VALUE_241("MHL"),
  /**
   * Martinique
   * <p>
   */
  @XmlEnumValue("MTQ")
  VALUE_242("MTQ"),
  /**
   * Maryland
   * <p>
   */
  @XmlEnumValue("US-MD")
  VALUE_243("US-MD"),
  /**
   * Massachusetts
   * <p>
   */
  @XmlEnumValue("US-MA")
  VALUE_244("US-MA"),
  /**
   * Mauritania
   * <p>
   */
  @XmlEnumValue("MRT")
  VALUE_245("MRT"),
  /**
   * Mauritius
   * <p>
   */
  @XmlEnumValue("MUS")
  VALUE_246("MUS"),
  /**
   * Mayotte
   * <p>
   */
  @XmlEnumValue("MYT")
  VALUE_247("MYT"),
  /**
   * Mediterranean Sea
   * <p>
   */
  @XmlEnumValue("89")
  VALUE_248("89"),
  /**
   * Mexico
   * <p>
   */
  @XmlEnumValue("MEX")
  VALUE_249("MEX"),
  /**
   * Michigan
   * <p>
   */
  @XmlEnumValue("US-MI")
  VALUE_250("US-MI"),
  /**
   * Micronesia
   * <p>
   */
  @XmlEnumValue("FSM")
  VALUE_251("FSM"),
  /**
   * Midway Islands
   * <p>
   */
  @XmlEnumValue("UM-71")
  VALUE_252("UM-71"),
  /**
   * Minnesota
   * <p>
   */
  @XmlEnumValue("US-MN")
  VALUE_253("US-MN"),
  /**
   * Mississippi
   * <p>
   */
  @XmlEnumValue("US-MS")
  VALUE_254("US-MS"),
  /**
   * Missouri
   * <p>
   */
  @XmlEnumValue("US-MO")
  VALUE_255("US-MO"),
  /**
   * Moldova
   * <p>
   */
  @XmlEnumValue("MDA")
  VALUE_256("MDA"),
  /**
   * Monaco
   * <p>
   */
  @XmlEnumValue("MCO")
  VALUE_257("MCO"),
  /**
   * Mongolia
   * <p>
   */
  @XmlEnumValue("MNG")
  VALUE_258("MNG"),
  /**
   * Montana
   * <p>
   */
  @XmlEnumValue("US-MT")
  VALUE_259("US-MT"),
  /**
   * Montenegro
   * <p>
   */
  @XmlEnumValue("MNE")
  VALUE_260("MNE"),
  /**
   * Montserrat
   * <p>
   */
  @XmlEnumValue("MSR")
  VALUE_261("MSR"),
  /**
   * Morocco
   * <p>
   */
  @XmlEnumValue("MAR")
  VALUE_262("MAR"),
  /**
   * Mozambique
   * <p>
   */
  @XmlEnumValue("MOZ")
  VALUE_263("MOZ"),
  /**
   * Multi-Lateral Enduring Contingency
   * <p>
   */
  @XmlEnumValue("MLEC")
  VALUE_264("MLEC"),
  /**
   * Multinational Coalition Forces - Iraq
   * <p>
   */
  @XmlEnumValue("MCFI")
  VALUE_265("MCFI"),
  /**
   * Multinational Interim Force Haiti
   * <p>
   */
  @XmlEnumValue("MIFH")
  VALUE_266("MIFH"),
  /**
   * Multiple Areas
   * <p>
   */
  @XmlEnumValue("MULT")
  VALUE_267("MULT"),
  /**
   * Myanmar
   * <p>
   */
  @XmlEnumValue("MMR")
  VALUE_268("MMR"),
  /**
   * Namibia
   * <p>
   */
  @XmlEnumValue("NAM")
  VALUE_269("NAM"),
  /**
   * NATO Airborne Early Warning
   * <p>
   */
  @XmlEnumValue("NT-AEW")
  VALUE_270("NT-AEW"),
  /**
   * NATO Allied Command Operations (ACO)
   * <p>
   */
  @XmlEnumValue("NT-ACO")
  VALUE_271("NT-ACO"),
  /**
   * NATO Allied Command Transformation (ACT)
   * <p>
   */
  @XmlEnumValue("NT-ACT")
  VALUE_272("NT-ACT"),
  /**
   * NATO European Nations (NATO, excluding USA, CAN, ISL)
   * <p>
   */
  @XmlEnumValue("NT-EUR")
  VALUE_273("NT-EUR"),
  /**
   * NATO Headquarters
   * <p>
   */
  @XmlEnumValue("NT-HQ")
  VALUE_274("NT-HQ"),
  /**
   * NATO Training Mission Iraq
   * <p>
   */
  @XmlEnumValue("NT-TMI")
  VALUE_275("NT-TMI"),
  /**
   * Nauru
   * <p>
   */
  @XmlEnumValue("NRU")
  VALUE_276("NRU"),
  /**
   * Navassa Island
   * <p>
   */
  @XmlEnumValue("UM-76")
  VALUE_277("UM-76"),
  /**
   * NC3A
   * <p>
   */
  @XmlEnumValue("NC3A")
  VALUE_278("NC3A"),
  /**
   * Nebraska
   * <p>
   */
  @XmlEnumValue("US-NE")
  VALUE_279("US-NE"),
  /**
   * Nepal
   * <p>
   */
  @XmlEnumValue("NPL")
  VALUE_280("NPL"),
  /**
   * Netherlands
   * <p>
   */
  @XmlEnumValue("NLD")
  VALUE_281("NLD"),
  /**
   * Netherlands Antilles
   * <p>
   */
  @XmlEnumValue("ANT")
  VALUE_282("ANT"),
  /**
   * Nevada
   * <p>
   */
  @XmlEnumValue("US-NV")
  VALUE_283("US-NV"),
  /**
   * New Caledonia
   * <p>
   */
  @XmlEnumValue("NCL")
  VALUE_284("NCL"),
  /**
   * New Hampshire
   * <p>
   */
  @XmlEnumValue("US-NH")
  VALUE_285("US-NH"),
  /**
   * New Jersey
   * <p>
   */
  @XmlEnumValue("US-NJ")
  VALUE_286("US-NJ"),
  /**
   * New Mexico
   * <p>
   */
  @XmlEnumValue("US-NM")
  VALUE_287("US-NM"),
  /**
   * New York
   * <p>
   */
  @XmlEnumValue("US-NY")
  VALUE_288("US-NY"),
  /**
   * New Zealand
   * <p>
   */
  @XmlEnumValue("NZL")
  VALUE_289("NZL"),
  /**
   * Nicaragua
   * <p>
   */
  @XmlEnumValue("NIC")
  VALUE_290("NIC"),
  /**
   * Niger
   * <p>
   */
  @XmlEnumValue("NER")
  VALUE_291("NER"),
  /**
   * Nigeria
   * <p>
   */
  @XmlEnumValue("NGA")
  VALUE_292("NGA"),
  /**
   * Niue
   * <p>
   */
  @XmlEnumValue("NIU")
  VALUE_293("NIU"),
  /**
   * Non-Geostationary Satellite
   * <p>
   */
  @XmlEnumValue("NGEO")
  VALUE_294("NGEO"),
  /**
   * Norfolk Island
   * <p>
   */
  @XmlEnumValue("NFK")
  VALUE_295("NFK"),
  /**
   * North African Counter-Terrorism Forces
   * <p>
   */
  @XmlEnumValue("NACT")
  VALUE_296("NACT"),
  /**
   * North America Continent
   * <p>
   */
  @XmlEnumValue("NN")
  VALUE_297("NN"),
  /**
   * NATO Nations (28 Nations: ALB, BEL, BUL, CAN, CZE, D, DNK, E, EST, F, G,
   * GRC, HNG, HOL, HRV, I, ISL, LUX, LIT, LVA, NOR, POL, POR, ROU, SVK, SVN,
   * TUR, USA)
   * <p>
   */
  @XmlEnumValue("NATO")
  VALUE_298("NATO"),
  /**
   * North Carolina
   * <p>
   */
  @XmlEnumValue("US-NC")
  VALUE_299("US-NC"),
  /**
   * North Dakota
   * <p>
   */
  @XmlEnumValue("US-ND")
  VALUE_300("US-ND"),
  /**
   * Northern Mariana Islands
   * <p>
   */
  @XmlEnumValue("MNP")
  VALUE_301("MNP"),
  /**
   * Norway
   * <p>
   */
  @XmlEnumValue("NOR")
  VALUE_302("NOR"),
  /**
   * Oceania
   * <p>
   */
  @XmlEnumValue("UU")
  VALUE_303("UU"),
  /**
   * Ohio
   * <p>
   */
  @XmlEnumValue("US-OH")
  VALUE_304("US-OH"),
  /**
   * Oklahoma
   * <p>
   */
  @XmlEnumValue("US-OK")
  VALUE_305("US-OK"),
  /**
   * Oman
   * <p>
   */
  @XmlEnumValue("OMN")
  VALUE_306("OMN"),
  /**
   * Oregon
   * <p>
   */
  @XmlEnumValue("US-OR")
  VALUE_307("US-OR"),
  /**
   * Other - See Remarks
   * <p>
   */
  @XmlEnumValue("OTH")
  VALUE_308("OTH"),
  /**
   * Pacific Ocean
   * <p>
   */
  @XmlEnumValue("4O")
  VALUE_309("4O"),
  /**
   * Pakistan
   * <p>
   */
  @XmlEnumValue("PAK")
  VALUE_310("PAK"),
  /**
   * Palau
   * <p>
   */
  @XmlEnumValue("PLW")
  VALUE_311("PLW"),
  /**
   * Palestine
   * <p>
   */
  @XmlEnumValue("PSE")
  VALUE_312("PSE"),
  /**
   * Palmyra Atoll
   * <p>
   */
  @XmlEnumValue("UM-95")
  VALUE_313("UM-95"),
  /**
   * Panama
   * <p>
   */
  @XmlEnumValue("PAN")
  VALUE_314("PAN"),
  /**
   * Papua New Guinea
   * <p>
   */
  @XmlEnumValue("PNG")
  VALUE_315("PNG"),
  /**
   * Paraguay
   * <p>
   */
  @XmlEnumValue("PRY")
  VALUE_316("PRY"),
  /**
   * Pennsylvania
   * <p>
   */
  @XmlEnumValue("US-PA")
  VALUE_317("US-PA"),
  /**
   * Peru
   * <p>
   */
  @XmlEnumValue("PER")
  VALUE_318("PER"),
  /**
   * Philippines
   * <p>
   */
  @XmlEnumValue("PHL")
  VALUE_319("PHL"),
  /**
   * Phoenix Islands
   * <p>
   */
  @XmlEnumValue("KI-P")
  VALUE_320("KI-P"),
  /**
   * Pitcairn Island
   * <p>
   */
  @XmlEnumValue("PCN")
  VALUE_321("PCN"),
  /**
   * Poland
   * <p>
   */
  @XmlEnumValue("POL")
  VALUE_322("POL"),
  /**
   * Portugal
   * <p>
   */
  @XmlEnumValue("PRT")
  VALUE_323("PRT"),
  /**
   * Puerto Rico
   * <p>
   */
  @XmlEnumValue("PRI")
  VALUE_324("PRI"),
  /**
   * Qatar
   * <p>
   */
  @XmlEnumValue("QAT")
  VALUE_325("QAT"),
  /**
   * Radio Astronomy
   * <p>
   */
  @XmlEnumValue("RCVR")
  VALUE_326("RCVR"),
  /**
   * Réunion
   * <p>
   */
  @XmlEnumValue("REU")
  VALUE_327("REU"),
  /**
   * Rhode Island
   * <p>
   */
  @XmlEnumValue("US-RI")
  VALUE_328("US-RI"),
  /**
   * Rodrigues
   * <p>
   */
  @XmlEnumValue("MU-RO")
  VALUE_329("MU-RO"),
  /**
   * ROK/US Combined Forces Command, Korea
   * <p>
   */
  @XmlEnumValue("CFCK")
  VALUE_330("CFCK"),
  /**
   * Romania
   * <p>
   */
  @XmlEnumValue("ROU")
  VALUE_331("ROU"),
  /**
   * Russian Federation
   * <p>
   */
  @XmlEnumValue("RUS")
  VALUE_332("RUS"),
  /**
   * Rwanda
   * <p>
   */
  @XmlEnumValue("RWA")
  VALUE_333("RWA"),
  /**
   * Saint Barthélemy
   * <p>
   */
  @XmlEnumValue("BLM")
  VALUE_334("BLM"),
  /**
   * Saint Helena
   * <p>
   */
  @XmlEnumValue("SHN")
  VALUE_335("SHN"),
  /**
   * Saint Kitts and Nevis
   * <p>
   */
  @XmlEnumValue("KNA")
  VALUE_336("KNA"),
  /**
   * Saint Lucia
   * <p>
   */
  @XmlEnumValue("LCA")
  VALUE_337("LCA"),
  /**
   * Saint Martin (French part)
   * <p>
   */
  @XmlEnumValue("MAF")
  VALUE_338("MAF"),
  /**
   * Saint Paul and Amsterdam Islands
   * <p>
   */
  @XmlEnumValue("AMS")
  VALUE_339("AMS"),
  /**
   * Saint Pierre and Miquelon
   * <p>
   */
  @XmlEnumValue("SPM")
  VALUE_340("SPM"),
  /**
   * Saint Vincent and the Grenadines
   * <p>
   */
  @XmlEnumValue("VCT")
  VALUE_341("VCT"),
  /**
   * Samoa
   * <p>
   */
  @XmlEnumValue("WSM")
  VALUE_342("WSM"),
  /**
   * San Marino
   * <p>
   */
  @XmlEnumValue("SMR")
  VALUE_343("SMR"),
  /**
   * Santiago-Rodriguez
   * <p>
   */
  @XmlEnumValue("DO-26")
  VALUE_344("DO-26"),
  /**
   * Sao Tome and Principe
   * <p>
   */
  @XmlEnumValue("STP")
  VALUE_345("STP"),
  /**
   * Saudi Arabia
   * <p>
   */
  @XmlEnumValue("SAU")
  VALUE_346("SAU"),
  /**
   * Senegal
   * <p>
   */
  @XmlEnumValue("SEN")
  VALUE_347("SEN"),
  /**
   * Serbia
   * <p>
   */
  @XmlEnumValue("SRB")
  VALUE_348("SRB"),
  /**
   * Seychelles
   * <p>
   */
  @XmlEnumValue("SYC")
  VALUE_349("SYC"),
  /**
   * Sierra Leone
   * <p>
   */
  @XmlEnumValue("SLE")
  VALUE_350("SLE"),
  /**
   * Singapore
   * <p>
   */
  @XmlEnumValue("SGP")
  VALUE_351("SGP"),
  /**
   * Sint Maarten (Dutch part)
   * <p>
   */
  @XmlEnumValue("SXM")
  VALUE_352("SXM"),
  /**
   * Slovakia
   * <p>
   */
  @XmlEnumValue("SVK")
  VALUE_353("SVK"),
  /**
   * Slovenia
   * <p>
   */
  @XmlEnumValue("SVN")
  VALUE_354("SVN"),
  /**
   * Solomon Islands
   * <p>
   */
  @XmlEnumValue("SLB")
  VALUE_355("SLB"),
  /**
   * Somalia
   * <p>
   */
  @XmlEnumValue("SOM")
  VALUE_356("SOM"),
  /**
   * South Africa
   * <p>
   */
  @XmlEnumValue("ZAF")
  VALUE_357("ZAF"),
  /**
   * South America Continent
   * <p>
   */
  @XmlEnumValue("SR")
  VALUE_358("SR"),
  /**
   * South Carolina
   * <p>
   */
  @XmlEnumValue("US-SC")
  VALUE_359("US-SC"),
  /**
   * South Dakota
   * <p>
   */
  @XmlEnumValue("US-SD")
  VALUE_360("US-SD"),
  /**
   * South Georgia and the South Sandwich Islands
   * <p>
   */
  @XmlEnumValue("SGS")
  VALUE_361("SGS"),
  /**
   * Space
   * <p>
   */
  @XmlEnumValue("SPCE")
  VALUE_362("SPCE"),
  /**
   * Spain
   * <p>
   */
  @XmlEnumValue("ESP")
  VALUE_363("ESP"),
  /**
   * Spectrum Management Branch in NATO HQ
   * <p>
   */
  @XmlEnumValue("NT-HQS")
  VALUE_364("NT-HQS"),
  /**
   * Sri Lanka
   * <p>
   */
  @XmlEnumValue("LKA")
  VALUE_365("LKA"),
  /**
   * Stabilization Forces in Kosovo
   * <p>
   */
  @XmlEnumValue("KFOR")
  VALUE_366("KFOR"),
  /**
   * STRIKEFORCENATO
   * <p>
   */
  @XmlEnumValue("NT-STF")
  VALUE_367("NT-STF"),
  /**
   * Sudan
   * <p>
   */
  @XmlEnumValue("SDN")
  VALUE_368("SDN"),
  /**
   * Suriname
   * <p>
   */
  @XmlEnumValue("SUR")
  VALUE_369("SUR"),
  /**
   * Svalbard and Jan Mayen Islands
   * <p>
   */
  @XmlEnumValue("SJM")
  VALUE_370("SJM"),
  /**
   * Swan Islands
   * <p>
   */
  @XmlEnumValue("SWA")
  VALUE_371("SWA"),
  /**
   * Swaziland
   * <p>
   */
  @XmlEnumValue("SWZ")
  VALUE_372("SWZ"),
  /**
   * Sweden
   * <p>
   */
  @XmlEnumValue("SWE")
  VALUE_373("SWE"),
  /**
   * Switzerland
   * <p>
   */
  @XmlEnumValue("CHE")
  VALUE_374("CHE"),
  /**
   * Syria
   * <p>
   */
  @XmlEnumValue("SYR")
  VALUE_375("SYR"),
  /**
   * Taiwan
   * <p>
   */
  @XmlEnumValue("TWN")
  VALUE_376("TWN"),
  /**
   * Tajikistan
   * <p>
   */
  @XmlEnumValue("TJK")
  VALUE_377("TJK"),
  /**
   * Tanzania
   * <p>
   */
  @XmlEnumValue("TZA")
  VALUE_378("TZA"),
  /**
   * Tennessee
   * <p>
   */
  @XmlEnumValue("US-TN")
  VALUE_379("US-TN"),
  /**
   * Texas
   * <p>
   */
  @XmlEnumValue("US-TX")
  VALUE_380("US-TX"),
  /**
   * Thailand
   * <p>
   */
  @XmlEnumValue("THA")
  VALUE_381("THA"),
  /**
   * The former Yugoslav Republic of Macedonia (See footnote 2)
   * <p>
   */
  @XmlEnumValue("FYR")
  VALUE_382("FYR"),
  /**
   * THREE EYES (USA, CAN, GBR)
   * <p>
   */
  @XmlEnumValue("TEYE")
  VALUE_383("TEYE"),
  /**
   * Togo
   * <p>
   */
  @XmlEnumValue("TGO")
  VALUE_384("TGO"),
  /**
   * Tokelau
   * <p>
   */
  @XmlEnumValue("TKL")
  VALUE_385("TKL"),
  /**
   * Tonga
   * <p>
   */
  @XmlEnumValue("TON")
  VALUE_386("TON"),
  /**
   * Trinidad and Tobago
   * <p>
   */
  @XmlEnumValue("TTO")
  VALUE_387("TTO"),
  /**
   * Tristan da Cunha
   * <p>
   */
  @XmlEnumValue("SH-TA")
  VALUE_388("SH-TA"),
  /**
   * Tunisia
   * <p>
   */
  @XmlEnumValue("TUN")
  VALUE_389("TUN"),
  /**
   * Turkey
   * <p>
   */
  @XmlEnumValue("TUR")
  VALUE_390("TUR"),
  /**
   * Turkmenistan
   * <p>
   */
  @XmlEnumValue("TKM")
  VALUE_391("TKM"),
  /**
   * Turks and Caicos Islands
   * <p>
   */
  @XmlEnumValue("TCA")
  VALUE_392("TCA"),
  /**
   * Tuvalu
   * <p>
   */
  @XmlEnumValue("TUV")
  VALUE_393("TUV"),
  /**
   * Uganda
   * <p>
   */
  @XmlEnumValue("UGA")
  VALUE_394("UGA"),
  /**
   * UK Territories in Region 1
   * <p>
   */
  @XmlEnumValue("UKT1")
  VALUE_395("UKT1"),
  /**
   * UK Territories in Region 3
   * <p>
   */
  @XmlEnumValue("UKT3")
  VALUE_396("UKT3"),
  /**
   * Ukraine
   * <p>
   */
  @XmlEnumValue("UKR")
  VALUE_397("UKR"),
  /**
   * United Arab Emirates
   * <p>
   */
  @XmlEnumValue("ARE")
  VALUE_398("ARE"),
  /**
   * United Kingdom
   * <p>
   */
  @XmlEnumValue("GBR")
  VALUE_399("GBR"),
  /**
   * United Nations
   * <p>
   */
  @XmlEnumValue("UN")
  VALUE_400("UN"),
  /**
   * United Nations Command, Korea
   * <p>
   */
  @XmlEnumValue("UNCK")
  VALUE_401("UNCK"),
  /**
   * United States (CONUS)
   * <p>
   */
  @XmlEnumValue("USC")
  VALUE_402("USC"),
  /**
   * United States and Possessions
   * <p>
   */
  @XmlEnumValue("USP")
  VALUE_403("USP"),
  /**
   * United States Minor Outlying Islands
   * <p>
   */
  @XmlEnumValue("UMI")
  VALUE_404("UMI"),
  /**
   * United States of America
   * <p>
   */
  @XmlEnumValue("USA")
  VALUE_405("USA"),
  /**
   * Unknown
   * <p>
   */
  @XmlEnumValue("UNKN")
  VALUE_406("UNKN"),
  /**
   * Uruguay
   * <p>
   */
  @XmlEnumValue("URY")
  VALUE_407("URY"),
  /**
   * US - Central
   * <p>
   */
  @XmlEnumValue("USCE")
  VALUE_408("USCE"),
  /**
   * US - Mid Atlantic
   * <p>
   */
  @XmlEnumValue("SCML")
  VALUE_409("SCML"),
  /**
   * US - Midwest
   * <p>
   */
  @XmlEnumValue("USMW")
  VALUE_410("USMW"),
  /**
   * US - North Central
   * <p>
   */
  @XmlEnumValue("USNC")
  VALUE_411("USNC"),
  /**
   * US - North East
   * <p>
   */
  @XmlEnumValue("USNE")
  VALUE_412("USNE"),
  /**
   * US - North West
   * <p>
   */
  @XmlEnumValue("USNW")
  VALUE_413("USNW"),
  /**
   * US - South Central
   * <p>
   */
  @XmlEnumValue("USSC")
  VALUE_414("USSC"),
  /**
   * US - South East
   * <p>
   */
  @XmlEnumValue("USSE")
  VALUE_415("USSE"),
  /**
   * US - South West
   * <p>
   */
  @XmlEnumValue("USSW")
  VALUE_416("USSW"),
  /**
   * US - West
   * <p>
   */
  @XmlEnumValue("USWE")
  VALUE_417("USWE"),
  /**
   * Utah
   * <p>
   */
  @XmlEnumValue("US-UT")
  VALUE_418("US-UT"),
  /**
   * Uzbekistan
   * <p>
   */
  @XmlEnumValue("UZB")
  VALUE_419("UZB"),
  /**
   * Vanuatu
   * <p>
   */
  @XmlEnumValue("VUT")
  VALUE_420("VUT"),
  /**
   * Vatican City State
   * <p>
   */
  @XmlEnumValue("VAT")
  VALUE_421("VAT"),
  /**
   * Venezuela
   * <p>
   */
  @XmlEnumValue("VEN")
  VALUE_422("VEN"),
  /**
   * Vermont
   * <p>
   */
  @XmlEnumValue("US-VT")
  VALUE_423("US-VT"),
  /**
   * Vietnam
   * <p>
   */
  @XmlEnumValue("VNM")
  VALUE_424("VNM"),
  /**
   * Virgin Islands (British)
   * <p>
   */
  @XmlEnumValue("VGB")
  VALUE_425("VGB"),
  /**
   * Virgin Islands (U.S.)
   * <p>
   */
  @XmlEnumValue("VIR")
  VALUE_426("VIR"),
  /**
   * Virginia
   * <p>
   */
  @XmlEnumValue("US-VA")
  VALUE_427("US-VA"),
  /**
   * Visible Earth
   * <p>
   */
  @XmlEnumValue("XVE")
  VALUE_428("XVE"),
  /**
   * Wake Island
   * <p>
   */
  @XmlEnumValue("UM-79")
  VALUE_429("UM-79"),
  /**
   * Wallis and Futuna Islands
   * <p>
   */
  @XmlEnumValue("WLF")
  VALUE_430("WLF"),
  /**
   * Washington
   * <p>
   */
  @XmlEnumValue("US-WA")
  VALUE_431("US-WA"),
  /**
   * West Virginia
   * <p>
   */
  @XmlEnumValue("US-WV")
  VALUE_432("US-WV"),
  /**
   * Western Sahara
   * <p>
   */
  @XmlEnumValue("ESH")
  VALUE_433("ESH"),
  /**
   * Wisconsin
   * <p>
   */
  @XmlEnumValue("US-WI")
  VALUE_434("US-WI"),
  /**
   * Wyoming
   * <p>
   */
  @XmlEnumValue("US-WY")
  VALUE_435("US-WY"),
  /**
   * Yemen
   * <p>
   */
  @XmlEnumValue("YEM")
  VALUE_436("YEM"),
  /**
   * Yugoslavia (YUG) - Deprecated
   * <p>
   */
  @XmlEnumValue("YO05")
  VALUE_437("YO05"),
  /**
   * Zambia
   * <p>
   */
  @XmlEnumValue("ZMB")
  VALUE_438("ZMB"),
  /**
   * Zimbabwe
   * <p>
   */
  @XmlEnumValue("ZWE")
  VALUE_439("ZWE");
  private final String value;

  ListCAO(String v) {
    value = v;
  }

  public String value() {
    return value;
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
