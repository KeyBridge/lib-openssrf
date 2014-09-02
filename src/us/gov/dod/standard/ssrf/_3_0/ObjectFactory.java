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

import us.gov.dod.standard.ssrf._3_0.datatype.Tmillisecs;
import us.gov.dod.standard.ssrf._3_0.datatype.Tpriority;
import us.gov.dod.standard.ssrf._3_0.datatype.Tmicrosecs;
import us.gov.dod.standard.ssrf._3_0.datatype.Tminutes;
import us.gov.dod.standard.ssrf._3_0.datatype.Tplatform;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_DBm;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUUC;
import us.gov.dod.standard.ssrf._3_0.datatype.TNetNumber;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCIR;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS30;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN16;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN5_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TScanRate;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCEF;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfMonth;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8_5;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS5;
import us.gov.dod.standard.ssrf._3_0.datatype.TS22;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7_5;
import us.gov.dod.standard.ssrf._3_0.datatype.THours;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TMEMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRT;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN3_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10;
import us.gov.dod.standard.ssrf._3_0.datatype.TElev180;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUFN;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUDA;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSG;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS255;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCLC;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS10;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSN;
import us.gov.dod.standard.ssrf._3_0.datatype.TS5;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRE;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCLO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAS;
import us.gov.dod.standard.ssrf._3_0.datatype.TS14;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN2_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUPU;
import us.gov.dod.standard.ssrf._3_0.datatype.TElev;
import us.gov.dod.standard.ssrf._3_0.datatype.TS4;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUPR;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN7_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN12_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPT;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS20;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN9_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSP;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAU;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPJ;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_Twips;
import us.gov.dod.standard.ssrf._3_0.datatype.TS15;
import us.gov.dod.standard.ssrf._3_0.datatype.TS8;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN4_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCUT;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAT;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCHN;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUAG;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCT;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCLS;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTP;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCI;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBD;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN9_8;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCDF;
import us.gov.dod.standard.ssrf._3_0.datatype.TS6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAC;
import us.gov.dod.standard.ssrf._3_0.datatype.TSerial;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCIN;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAF;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TdBWHz;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN5_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TS25;
import us.gov.dod.standard.ssrf._3_0.datatype.TMonths;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN12;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TReleasability;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPI;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTU;
import us.gov.dod.standard.ssrf._3_0.datatype.TS1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_DBW;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS15;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTS;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAD;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSI;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRS;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqOffset;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAO;
import us.gov.dod.standard.ssrf._3_0.datatype.TScanSpeed;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS3;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFM;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TCurvePointLevel;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCL;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPC;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TIdxList;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN18_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUMD;
import us.gov.dod.standard.ssrf._3_0.datatype.TLon;
import us.gov.dod.standard.ssrf._3_0.datatype.TS3;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TdB;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSR;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTI;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_DB;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import us.gov.dod.standard.ssrf._3_0.datatype.TAltitude;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCMC;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUTY;
import us.gov.dod.standard.ssrf._3_0.datatype.TLat;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS4;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCET;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqH;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS2;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN6_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TNavAidChnl;
import us.gov.dod.standard.ssrf._3_0.datatype.TAz180;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7;
import us.gov.dod.standard.ssrf._3_0.datatype.TDT;
import us.gov.dod.standard.ssrf._3_0.datatype.TYears;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFR;
import us.gov.dod.standard.ssrf._3_0.datatype.TS70;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN5;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN16_15;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSE;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN3_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCJ1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TTBD;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUOW;
import us.gov.dod.standard.ssrf._3_0.datatype.TTSDFValue;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TIFNum;
import us.gov.dod.standard.ssrf._3_0.datatype.TS60;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TAz;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUPF;
import us.gov.dod.standard.ssrf._3_0.datatype.TPercent;
import us.gov.dod.standard.ssrf._3_0.datatype.TS16;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTN;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN16_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFT;
import us.gov.dod.standard.ssrf._3_0.datatype.TS100;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUNS;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN12_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TS150;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_5;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCDD;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCN;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCD;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCEA;
import us.gov.dod.standard.ssrf._3_0.datatype.TDble;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPS;
import us.gov.dod.standard.ssrf._3_0.datatype.TS20;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCDR;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUCH;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN6_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCNU;
import us.gov.dod.standard.ssrf._3_0.datatype.TDigestCode;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_4;
import us.gov.dod.standard.ssrf._3_0.datatype.TSpeed;
import us.gov.dod.standard.ssrf._3_0.datatype.TOA;
import us.gov.dod.standard.ssrf._3_0.datatype.TS11;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRA;
import us.gov.dod.standard.ssrf._3_0.datatype.TMinSec;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFE;
import us.gov.dod.standard.ssrf._3_0.datatype.TS80;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAV;
import us.gov.dod.standard.ssrf._3_0.datatype.TS2;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUST;
import us.gov.dod.standard.ssrf._3_0.datatype.TS9;
import us.gov.dod.standard.ssrf._3_0.datatype.TListURI;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRD;
import us.gov.dod.standard.ssrf._3_0.datatype.TS7;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS12;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS6;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUSC;
import us.gov.dod.standard.ssrf._3_0.datatype.TDistance;
import us.gov.dod.standard.ssrf._3_0.datatype.TS35;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSU;
import us.gov.dod.standard.ssrf._3_0.datatype.TdBm;
import us.gov.dod.standard.ssrf._3_0.datatype.TS24;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN8_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN2;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUCJ;
import us.gov.dod.standard.ssrf._3_0.datatype.TS12;
import us.gov.dod.standard.ssrf._3_0.datatype.TS40;
import us.gov.dod.standard.ssrf._3_0.datatype.TS18;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCEN;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCIC;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN3_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCOT;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_1;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN7_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfWeek;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TMChips;
import us.gov.dod.standard.ssrf._3_0.datatype.TListUUF;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS30;
import us.gov.dod.standard.ssrf._3_0.datatype.TEmsDes;
import us.gov.dod.standard.ssrf._3_0.datatype.TdBW;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAP;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_DBWHz;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_7;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN16_15;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAL;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN12_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS200;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN6_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS_Percent;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN2;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCTO;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCSS;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCFD;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS40;
import us.gov.dod.standard.ssrf._3_0.datatype.TSN9_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TS10;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCDS;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCCY;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN11_8;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the us.gov.dod.standard.ssrf._3_0 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * <p>
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _SSRF_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SSRF");
  private final static QName _VSWRFreq_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Freq");
  private final static QName _PowerPowerType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PowerType");
  private final static QName _PowerCalculated_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Calculated");
  private final static QName _PowerPowerMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PowerMin");
  private final static QName _PowerPowerMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PowerMax");
  private final static QName _AsgnFreqBaseRefFreq_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RefFreq");
  private final static QName _AsgnFreqBaseFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FreqMax");
  private final static QName _AsgnFreqBaseFreqUse_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FreqUse");
  private final static QName _AntModeRotationRateMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RotationRateMax");
  private final static QName _AntModeHorzScanRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzScanRate");
  private final static QName _AntModeDescription_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Description");
  private final static QName _AntModeModeName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModeName");
  private final static QName _AntModeBeamType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BeamType");
  private final static QName _AntModeVertScanRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertScanRate");
  private final static QName _AntModeVertScanAngleMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertScanAngleMax");
  private final static QName _AntModeHorzScanSpeed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzScanSpeed");
  private final static QName _AntModeVertScanSpeed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertScanSpeed");
  private final static QName _AntModeVertScanAngleMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertScanAngleMin");
  private final static QName _AntModeModeUse_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModeUse");
  private final static QName _AntModeHorzBwMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzBwMin");
  private final static QName _AntModeMaxPower_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MaxPower");
  private final static QName _AntModeHorzBwMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzBwMax");
  private final static QName _AntModeSectBlanking_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SectBlanking");
  private final static QName _AntModeHorzScanSector_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzScanSector");
  private final static QName _AntModeVertBwMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertBwMax");
  private final static QName _AntModeVertBwMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertBwMin");
  private final static QName _AntModeRotationDirection_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RotationDirection");
  private final static QName _AntModeMotionType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MotionType");
  private final static QName _AntModeHorzScanType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzScanType");
  private final static QName _AntModeVertScanType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertScanType");
  private final static QName _AntModePortIsolation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PortIsolation");
  private final static QName _AntModePolarisationAngle_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PolarisationAngle");
  private final static QName _TuningExclusive_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Exclusive");
  private final static QName _TuningPriority_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Priority");
  private final static QName _JRFLEntryLocationAntFeedpointHeight_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AntFeedpointHeight");
  private final static QName _SpreadSpectrumPulseChirpFreqShift_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PulseChirpFreqShift");
  private final static QName _SpreadSpectrumType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Type");
  private final static QName _SpreadSpectrumHopDwell_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HopDwell");
  private final static QName _SpreadSpectrumCodeRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CodeRate");
  private final static QName _SpreadSpectrumPulseChirpRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PulseChirpRate");
  private final static QName _SpreadSpectrumPulseChirpDurationMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PulseChirpDurationMin");
  private final static QName _SpreadSpectrumTimeHopNumSlots_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TimeHopNumSlots");
  private final static QName _SpreadSpectrumTimeHopPulsesPerDwell_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TimeHopPulsesPerDwell");
  private final static QName _SpreadSpectrumFreqBlocking_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FreqBlocking");
  private final static QName _SpreadSpectrumChipRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ChipRate");
  private final static QName _SpreadSpectrumInfoDataRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InfoDataRate");
  private final static QName _SpreadSpectrumNumFreqsPerHopset_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumFreqsPerHopset");
  private final static QName _SpreadSpectrumHopRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HopRate");
  private final static QName _SpreadSpectrumNumHopsets_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumHopsets");
  private final static QName _SpreadSpectrumPulseFreqDev_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PulseFreqDev");
  private final static QName _SpreadSpectrumMaxGain_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MaxGain");
  private final static QName _TrunkingAssignmentAgencySerialNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AgencySerialNum");
  private final static QName _TrunkingAssignmentFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FreqMin");
  private final static QName _TrunkingAssignmentRelinquishmentDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RelinquishmentDate");
  private final static QName _JRFLEntryDaysOfMonth_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DaysOfMonth");
  private final static QName _JRFLEntryAsgnAllotRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AsgnAllotRef");
  private final static QName _JRFLEntryHours_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Hours");
  private final static QName _JRFLEntryDaysOfWeek_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DaysOfWeek");
  private final static QName _JRFLEntryYears_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Years");
  private final static QName _JRFLEntryApprovalLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ApprovalLevel");
  private final static QName _JRFLEntryMonths_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Months");
  private final static QName _JRFLEntryDuration_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Duration");
  private final static QName _JRFLEntrySeconds_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Seconds");
  private final static QName _JRFLEntryMinutes_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Minutes");
  private final static QName _JRFLEntryBandwidth_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Bandwidth");
  private final static QName _DiagramLineConfigID_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ConfigID");
  private final static QName _DeploymentStatus_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Status");
  private final static QName _NomenclatureLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Level");
  private final static QName _PairedFreqAssignmentRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AssignmentRef");
  private final static QName _PairedFreqPairedType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PairedType");
  private final static QName _PairedFreqPairedASN_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PairedASN");
  private final static QName _StationLocServiceVolumeLocRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ServiceVolumeLocRef");
  private final static QName _StationLocServiceVolumeHeight_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ServiceVolumeHeight");
  private final static QName _StationLocLocSatRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LocSatRef");
  private final static QName _StationLocLocationExcluded_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LocationExcluded");
  private final static QName _StationLocServiceVolumeRadius_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ServiceVolumeRadius");
  private final static QName _StationLocLocationRadius_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LocationRadius");
  private final static QName _UsageRadioService_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RadioService");
  private final static QName _UsageEqpFnct_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EqpFnct");
  private final static QName _UsageStnClass_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StnClass");
  private final static QName _ReceiverPreselectionType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PreselectionType");
  private final static QName _ReceiverTSPR_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TSPR");
  private final static QName _ReceiverConductedEmissions_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ConductedEmissions");
  private final static QName _ReceiverFCCAcceptanceNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FCCAcceptanceNum");
  private final static QName _ReceiverDuplexSepType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DuplexSepType");
  private final static QName _AntennaHorzSidelobeAttenuation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzSidelobeAttenuation");
  private final static QName _AntennaVertSidelobeSuppressed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertSidelobeSuppressed");
  private final static QName _AntennaVertSidelobeElev_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertSidelobeElev");
  private final static QName _AntennaPhArrayNumElements_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PhArrayNumElements");
  private final static QName _AntennaHorzAperture_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzAperture");
  private final static QName _AntennaPhArrayNumMainBeams_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PhArrayNumMainBeams");
  private final static QName _AntennaHorzDimension_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzDimension");
  private final static QName _AntennaVertAperture_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertAperture");
  private final static QName _AntennaDiameter_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Diameter");
  private final static QName _AntennaShape_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Shape");
  private final static QName _AntennaApertureDiameter_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ApertureDiameter");
  private final static QName _AntennaHorzSidelobeSuppressed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzSidelobeSuppressed");
  private final static QName _AntennaHorzSidelobeAz_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HorzSidelobeAz");
  private final static QName _AntennaVertSidelobeAttenuation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertSidelobeAttenuation");
  private final static QName _AntennaVertDimension_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VertDimension");
  private final static QName _NarrowBandPlanningNBFreq_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NBFreq");
  private final static QName _NarrowBandPlanningChangeDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ChangeDate");
  private final static QName _AddressStreet_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Street");
  private final static QName _AddressPostCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PostCode");
  private final static QName _AddressCityArea_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CityArea");
  private final static QName _AddressStateCounty_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StateCounty");
  private final static QName _RxAntModeRefCouplingLoss_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CouplingLoss");
  private final static QName _RxAntModeRefModeID_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModeID");
  private final static QName _AsgnAllotOwnerDescription_0020_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Description ");
  private final static QName _AssignmentOriginalAssignmentDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OriginalAssignmentDate");
  private final static QName _AssignmentFrequencyActionOfficer_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FrequencyActionOfficer");
  private final static QName _AssignmentDateResponseRequired_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DateResponseRequired");
  private final static QName _AssignmentTypeOfService_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TypeOfService");
  private final static QName _AssignmentControlRequestNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ControlRequestNum");
  private final static QName _AssignmentUsageType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UsageType");
  private final static QName _AssignmentUsageFrequency_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UsageFrequency");
  private final static QName _AssignmentSupplementaryDetails_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SupplementaryDetails");
  private final static QName _AssignmentTitle_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Title");
  private final static QName _AssignmentUserNetCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UserNetCode");
  private final static QName _AssignmentProcessing_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Processing");
  private final static QName _AssignmentRoutineAgendaItem_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RoutineAgendaItem");
  private final static QName _AssignmentAgencyActionNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AgencyActionNum");
  private final static QName _AssignmentAssignmentAuthority_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AssignmentAuthority");
  private final static QName _AssignmentNumSystems_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumSystems");
  private final static QName _AssignmentPeriod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Period");
  private final static QName _AssignmentNATOPooledFrequencyNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NATOPooledFrequencyNum");
  private final static QName _AssignmentAssignmentDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AssignmentDate");
  private final static QName _AssignmentNATOPooledFrequencyCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NATOPooledFrequencyCode");
  private final static QName _AssignmentUsagePercentage_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UsagePercentage");
  private final static QName _AssignmentListSerialNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ListSerialNum");
  private final static QName _AssignmentAgencyComments_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AgencyComments");
  private final static QName _AssignmentCoordinationComments_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CoordinationComments");
  private final static QName _AssignmentDataSource_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DataSource");
  private final static QName _AssignmentExpirationDateTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ExpirationDateTime");
  private final static QName _AssignmentCOCOMGroup_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "COCOMGroup");
  private final static QName _AssignmentFMSCNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FMSCNum");
  private final static QName _AssignmentEmergency_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Emergency");
  private final static QName _AssignmentRequirement_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Requirement");
  private final static QName _AssignmentUsageCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UsageCode");
  private final static QName _AssignmentReviewDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ReviewDate");
  private final static QName _AssignmentFCCFileNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FCCFileNum");
  private final static QName _AtWaypointSpeed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Speed");
  private final static QName _ForceElementCmdLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CmdLevel");
  private final static QName _ForceElementOwningOrganisation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OwningOrganisation");
  private final static QName _ForceElementUIC_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UIC");
  private final static QName _ForceElementRole_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Role");
  private final static QName _ForceElementOwningCountry_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OwningCountry");
  private final static QName _ForceElementMissionCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MissionCode");
  private final static QName _ForceElementPlatform_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Platform");
  private final static QName _EarthStationName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Name");
  private final static QName _EarthStationLocationRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LocationRef");
  private final static QName _EllipseAltitudeMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AltitudeMax");
  private final static QName _EllipseAltitudeMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AltitudeMin");
  private final static QName _EllipseExcluded_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Excluded");
  private final static QName _CommentSourceSource_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Source");
  private final static QName _CommentSourceDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Date");
  private final static QName _CommentSourceAuthor_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Author");
  private final static QName _CommentSourceJobTitle_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "JobTitle");
  private final static QName _EMailMaxCls_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MaxCls");
  private final static QName _EMailPreferred_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Preferred");
  private final static QName _TOAEffectiveDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EffectiveDate");
  private final static QName _TOAExpirationDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ExpirationDate");
  private final static QName _OrganisationAlternateName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AlternateName");
  private final static QName _EmissionNecessaryBw_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NecessaryBw");
  private final static QName _EmissionPower_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Power");
  private final static QName _EmissionEmsClass_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EmsClass");
  private final static QName _TelephoneFaxFax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Fax");
  private final static QName _SatelliteLaunchDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LaunchDate");
  private final static QName _SatelliteNetworkName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NetworkName");
  private final static QName _SatelliteNonGeoPerigee_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NonGeoPerigee");
  private final static QName _SatelliteNonGeoInclination_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NonGeoInclination");
  private final static QName _SatelliteLaunchLocRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LaunchLocRef");
  private final static QName _SatelliteNonGeoApogee_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NonGeoApogee");
  private final static QName _SatelliteCallSign_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CallSign");
  private final static QName _SatelliteLaunchStatus_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LaunchStatus");
  private final static QName _SatelliteAdministration_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Administration");
  private final static QName _SatelliteGeoNominalLon_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GeoNominalLon");
  private final static QName _SatelliteGeoAltitude_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GeoAltitude");
  private final static QName _SatelliteObjectNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ObjectNum");
  private final static QName _SatelliteNonGeoPeriod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NonGeoPeriod");
  private final static QName _SatelliteNonGeoNumSatellites_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NonGeoNumSatellites");
  private final static QName _SatelliteInternationalDesignator_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InternationalDesignator");
  private final static QName _SatelliteOrbitType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OrbitType");
  private final static QName _StageNumEquip_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumEquip");
  private final static QName _StageDateApprovalRequired_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DateApprovalRequired");
  private final static QName _StageStartDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StartDate");
  private final static QName _StageTargetDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TargetDate");
  private final static QName _StageGeoDescription_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GeoDescription");
  private final static QName _StageTerminationDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TerminationDate");
  private final static QName _TxModeRefPowerLimit_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PowerLimit");
  private final static QName _AssetsAvailable_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Available");
  private final static QName _AssetsAuthorised_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Authorised");
  private final static QName _IntfReportSatelliteTransponderID_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteTransponderID");
  private final static QName _IntfReportSourceLocDescr_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceLocDescr");
  private final static QName _IntfReportVictimSystem_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimSystem");
  private final static QName _IntfReportSatelliteAffected_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteAffected");
  private final static QName _IntfReportSourceFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceFreqMax");
  private final static QName _IntfReportSatelliteUplinkFreq_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteUplinkFreq");
  private final static QName _IntfReportAffectedEquipment_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AffectedEquipment");
  private final static QName _IntfReportIntfPeriod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntfPeriod");
  private final static QName _IntfReportPerformanceEffects_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PerformanceEffects");
  private final static QName _IntfReportIntfDescr_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntfDescr");
  private final static QName _IntfReportHelpRequired_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HelpRequired");
  private final static QName _IntfReportSourceEmsBw_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceEmsBw");
  private final static QName _IntfReportSourceLon_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceLon");
  private final static QName _IntfReportVictimAsgnRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimAsgnRef");
  private final static QName _IntfReportSatelliteHemisphere_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteHemisphere");
  private final static QName _IntfReportNetCircuitsAffected_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NetCircuitsAffected");
  private final static QName _IntfReportVictimFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimFreqMax");
  private final static QName _IntfReportSatelliteName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteName");
  private final static QName _IntfReportAffectedCSA_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AffectedCSA");
  private final static QName _IntfReportSourceLat_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceLat");
  private final static QName _IntfReportSourceEmsClass_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceEmsClass");
  private final static QName _IntfReportVictimLat_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimLat");
  private final static QName _IntfReportSourceAz_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceAz");
  private final static QName _IntfReportIntfStopDateTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntfStopDateTime");
  private final static QName _IntfReportSatelliteDownlinkPolarisation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteDownlinkPolarisation");
  private final static QName _IntfReportSatelliteUplinkPolarisation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteUplinkPolarisation");
  private final static QName _IntfReportSourceFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceFreqMin");
  private final static QName _IntfReportVictimLon_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimLon");
  private final static QName _IntfReportCharacteristics_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Characteristics");
  private final static QName _IntfReportVictimCountry_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimCountry");
  private final static QName _IntfReportNetsAffected_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NetsAffected");
  private final static QName _IntfReportEvaluation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Evaluation");
  private final static QName _IntfReportVictimLocDescr_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "VictimLocDescr");
  private final static QName _IntfReportSATCOMPriority_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SATCOMPriority");
  private final static QName _IntfReportSatelliteChannel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteChannel");
  private final static QName _IntfReportGPSAffected_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GPSAffected");
  private final static QName _IntfReportLocalEventID_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LocalEventID");
  private final static QName _IntfReportSourceFieldStrength_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceFieldStrength");
  private final static QName _IntfReportSolution_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Solution");
  private final static QName _IntfReportSatelliteLongitude_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SatelliteLongitude");
  private final static QName _DatasetRetireDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RetireDate");
  private final static QName _DatasetReason_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Reason");
  private final static QName _CommonOwner_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Owner");
  private final static QName _CommonEntryBy_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EntryBy");
  private final static QName _CommonState_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "State");
  private final static QName _CommonLastChangeBy_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LastChangeBy");
  private final static QName _CommonLastChangeDateTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LastChangeDateTime");
  private final static QName _RelatedSupportabilitySSRequestRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SSRequestRef");
  private final static QName _RelatedSupportabilityJ12Number_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "J12Number");
  private final static QName _FreqTAD_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TAD");
  private final static QName _FreqLegacyNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LegacyNum");
  private final static QName _PulseRiseTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RiseTime");
  private final static QName _PulseCompMethod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CompMethod");
  private final static QName _PulseDutyCycleMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DutyCycleMax");
  private final static QName _PulseAvgPowerMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AvgPowerMin");
  private final static QName _PulsePDMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PDMax");
  private final static QName _PulseFallTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FallTime");
  private final static QName _PulseAvgPowerMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AvgPowerMax");
  private final static QName _PulsePDMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PDMin");
  private final static QName _PulseNumSubpulses_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumSubpulses");
  private final static QName _PulseCompRatio_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CompRatio");
  private final static QName _PulseRadarProcessingGainMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RadarProcessingGainMax");
  private final static QName _PulsePRRMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PRRMax");
  private final static QName _PulseDutyCycleMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DutyCycleMin");
  private final static QName _PulseJustifyShortRiseTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "JustifyShortRiseTime");
  private final static QName _PulsePRRMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PRRMin");
  private final static QName _TimeUsageDescription_0020_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UsageDescription ");
  private final static QName _RecordNoteComments_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Comments");
  private final static QName _CoordinationDataHostComments_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "HostComments");
  private final static QName _CurveBw_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Bw");
  private final static QName _CodeListOrigin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Origin");
  private final static QName _AntPatternCutAngle_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CutAngle");
  private final static QName _AntPatternCutType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CutType");
  private final static QName _CaseNumCountry_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Country");
  private final static QName _ConfigurationEIRPMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EIRPMin");
  private final static QName _ConfigurationEIRPMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EIRPMax");
  private final static QName _ConfigurationSpectrumLink_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SpectrumLink");
  private final static QName _ConfigurationOOBJustification_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OOBJustification");
  private final static QName _ConfigurationRepeater_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Repeater");
  private final static QName _ConfigurationNumUsers_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumUsers");
  private final static QName _ChannelUser_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "User");
  private final static QName _AntHardwareConnectorType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ConnectorType");
  private final static QName _AntHardwareLeadType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LeadType");
  private final static QName _AntHardwareFeedType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FeedType");
  private final static QName _AntHardwareFeedOrientation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FeedOrientation");
  private final static QName _SysOfStationSysName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SysName");
  private final static QName _SysOfStationNumStations_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumStations");
  private final static QName _JRFLEffectiveDateTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EffectiveDateTime");
  private final static QName _FEDeploymentNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Num");
  private final static QName _ExternalReferenceIsClassified_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IsClassified");
  private final static QName _ExternalReferenceResourceLocator_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ResourceLocator");
  private final static QName _ExternalReferenceDocumentCls_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DocumentCls");
  private final static QName _ExternalReferenceAlternateIdentifier_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AlternateIdentifier");
  private final static QName _ExternalReferenceOrganisation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Organisation");
  private final static QName _ExternalReferenceIdentifier_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Identifier");
  private final static QName _ExternalReferenceReferencedStage_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ReferencedStage");
  private final static QName _StationConfigPointingElevMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PointingElevMax");
  private final static QName _StationConfigEarthCoverage_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EarthCoverage");
  private final static QName _StationConfigCoordinationNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CoordinationNum");
  private final static QName _StationConfigPointingElevMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PointingElevMin");
  private final static QName _StationConfigPointingAzMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PointingAzMax");
  private final static QName _StationConfigFeedlineLength_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FeedlineLength");
  private final static QName _StationConfigFeedlineLoss_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FeedlineLoss");
  private final static QName _StationConfigPointingAzMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PointingAzMin");
  private final static QName _StatusLogPOCRef_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "POCRef");
  private final static QName _StatusLogComment_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Comment");
  private final static QName _StatusLogAgencyCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AgencyCode");
  private final static QName _SSRequestApplicationSPSNumber_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ApplicationSPSNumber");
  private final static QName _SSRequestNumCositedUnits_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumCositedUnits");
  private final static QName _SSRequestNTIACoordinationRequired_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NTIACoordinationRequired");
  private final static QName _SSRequestInfoTransferRequirement_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InfoTransferRequirement");
  private final static QName _SSRequestWartimeUse_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "WartimeUse");
  private final static QName _SSRequestSysRelationEssential_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SysRelationEssential");
  private final static QName _SSRequestInitialCostDesc_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InitialCostDesc");
  private final static QName _SSRequestNumAreaUnits_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumAreaUnits");
  private final static QName _SSRequestCurrentStage_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CurrentStage");
  private final static QName _SSRequestInitialCost_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InitialCost");
  private final static QName _SSRequestOriginatingAgency_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OriginatingAgency");
  private final static QName _SSRequestNumMobileUnits_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumMobileUnits");
  private final static QName _SSRequestRelatedAnalysisAndTestData_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RelatedAnalysisAndTestData");
  private final static QName _SSRequestReplacementInfo_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ReplacementInfo");
  private final static QName _SSRequestOperInvIntent_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OperInvIntent");
  private final static QName _SSRequestITUWaiver_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ITUWaiver");
  private final static QName _SSRequestApplicationDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ApplicationDate");
  private final static QName _SSRequestNTIASpaceData_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NTIASpaceData");
  private final static QName _SSRequestRequestType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RequestType");
  private final static QName _LinkLinkName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LinkName");
  private final static QName _LinkIntermediateFunction_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntermediateFunction");
  private final static QName _LinkMajorFunction_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MajorFunction");
  private final static QName _AssignedNavAidsChannel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NavAidsChannel");
  private final static QName _AssignedColourWord_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ColourWord");
  private final static QName _AssignedColourNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ColourNum");
  private final static QName _AssignedQuality_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Quality");
  private final static QName _AssignedITURegStatus_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ITURegStatus");
  private final static QName _AssignedITURegComments_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ITURegComments");
  private final static QName _AssignedITURegNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ITURegNum");
  private final static QName _AssignedNetNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NetNum");
  private final static QName _AssignedITURegDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ITURegDate");
  private final static QName _DowngradeDowngradeInfo_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DowngradeInfo");
  private final static QName _TxModulationFMPeakModulationIdx_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FMPeakModulationIdx");
  private final static QName _TxModulationMaxDevRatio_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MaxDevRatio");
  private final static QName _TxModulationFMRMSFreqDev_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FMRMSFreqDev");
  private final static QName _TxModulationFMDeviationCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FMDeviationCode");
  private final static QName _TxModulationAMRMSIdx_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AMRMSIdx");
  private final static QName _TxModulationAMIdx_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AMIdx");
  private final static QName _TxModulationSidebandSuppressed_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SidebandSuppressed");
  private final static QName _TxModulationCarrierSuppression_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CarrierSuppression");
  private final static QName _TxModulationFMPeakFreqDev_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FMPeakFreqDev");
  private final static QName _TxModulationSidebandSuppression_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SidebandSuppression");
  private final static QName _ContactTitleRank_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TitleRank");
  private final static QName _ContactFirstName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FirstName");
  private final static QName _ContactLastName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LastName");
  private final static QName _BlankingElevStop_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ElevStop");
  private final static QName _BlankingAzStop_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AzStop");
  private final static QName _BlankingElevStart_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ElevStart");
  private final static QName _BlankingAzStart_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AzStart");
  private final static QName _TrunkingDispatcher_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Dispatcher");
  private final static QName _TrunkingSeparateSystemJustification_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SeparateSystemJustification");
  private final static QName _TrunkingNSEPUse_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NSEPUse");
  private final static QName _TrunkingExpansionTargetDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ExpansionTargetDate");
  private final static QName _TrunkingPreviousSPSDocketNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PreviousSPSDocketNum");
  private final static QName _TrunkingEstimatedExpansionCost_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "EstimatedExpansionCost");
  private final static QName _TrunkingNumFreqsRequired_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumFreqsRequired");
  private final static QName _TrunkingNumRepeaters_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumRepeaters");
  private final static QName _TrunkingAdditionalChannelsRationale_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AdditionalChannelsRationale");
  private final static QName _TrunkingRequestForExpansion_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RequestForExpansion");
  private final static QName _TrunkingDispatcherExplanation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DispatcherExplanation");
  private final static QName _POCInformationSerial_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Serial");
  private final static QName _SecurityClassDeclsType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DeclsType");
  private final static QName _SecurityClassSourceClsDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SourceClsDate");
  private final static QName _SecurityClassDeclsDate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DeclsDate");
  private final static QName _SecurityClassClsReason_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ClsReason");
  private final static QName _SecurityClassClsAuthority_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ClsAuthority");
  private final static QName _SecurityClassClsOrg_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ClsOrg");
  private final static QName _SecurityClassDeclsEvent_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DeclsEvent");
  private final static QName _RFSystemFieldedStatus_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FieldedStatus");
  private final static QName _TxSignalTuningMinSeparation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MinSeparation");
  private final static QName _TxSignalTuningNumPresetChannels_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumPresetChannels");
  private final static QName _TxSignalTuningTuningStep_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TuningStep");
  private final static QName _TxSignalTuningLowestUsableChannel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LowestUsableChannel");
  private final static QName _TxAntModeRefSpectralPowerDensity_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SpectralPowerDensity");
  private final static QName _RxModeNoiseTemp_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NoiseTemp");
  private final static QName _RxModeProcessingGain_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ProcessingGain");
  private final static QName _RxModeSensitivityCriteriaLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SensitivityCriteriaLevel");
  private final static QName _RxModeIntermodEffect_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntermodEffect");
  private final static QName _RxModeSensitivityCriteriaType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SensitivityCriteriaType");
  private final static QName _RxModeSensitivityCriteriaText_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SensitivityCriteriaText");
  private final static QName _RxModeNoiseFigure_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NoiseFigure");
  private final static QName _RxModeIntermodRejection_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntermodRejection");
  private final static QName _RxModeAdjacentChannelSelectivity_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AdjacentChannelSelectivity");
  private final static QName _RxModeRxType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RxType");
  private final static QName _RxModeTunability_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Tunability");
  private final static QName _RxModeSpuriousRejection_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SpuriousRejection");
  private final static QName _RxModeImageRejection_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ImageRejection");
  private final static QName _RxModePostDetectionFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PostDetectionFreqMax");
  private final static QName _RxModePostDetectionFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PostDetectionFreqMin");
  private final static QName _RxModeTuningMethod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TuningMethod");
  private final static QName _RxModeSensitivityLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SensitivityLevel");
  private final static QName _RxModeIntermodPct_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IntermodPct");
  private final static QName _PointTerrainElevation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TerrainElevation");
  private final static QName _FreqBandBandNotes_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BandNotes");
  private final static QName _FreqBandUseIndicator_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UseIndicator");
  private final static QName _TxModeGpsWBL2Level_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GpsWBL2Level");
  private final static QName _TxModeBurstRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BurstRate");
  private final static QName _TxModeGpsWBL1Level_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GpsWBL1Level");
  private final static QName _TxModeGpsNBL1Level_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GpsNBL1Level");
  private final static QName _TxModeBurstDuration_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BurstDuration");
  private final static QName _TxModeBurstOffTime_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BurstOffTime");
  private final static QName _TxModeSecondHarmonicLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SecondHarmonicLevel");
  private final static QName _TxModeGpsNBL2Level_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "GpsNBL2Level");
  private final static QName _TxModeNumSubCarriers_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumSubCarriers");
  private final static QName _TxModeThirdHarmonicLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ThirdHarmonicLevel");
  private final static QName _TxModeOccBwCalculated_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OccBwCalculated");
  private final static QName _TxModeSpuriousLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SpuriousLevel");
  private final static QName _TxModeModulationType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModulationType");
  private final static QName _TxModeRadarType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "RadarType");
  private final static QName _TxModeBurstNumPulses_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "BurstNumPulses");
  private final static QName _TxModeOtherHarmonicLevel_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OtherHarmonicLevel");
  private final static QName _TxModeNumSideTones_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumSideTones");
  private final static QName _TransmitterFilter_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Filter");
  private final static QName _TransmitterOutputDevice_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OutputDevice");
  private final static QName _TransmitterOutputDeviceType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OutputDeviceType");
  private final static QName _BasebandModFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModFreqMin");
  private final static QName _BasebandSignalType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SignalType");
  private final static QName _BasebandModFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ModFreqMax");
  private final static QName _PreviousAuthorizationDate_0020_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "Date ");
  private final static QName _DiagramEndpointPointToMultiPoint_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PointToMultiPoint");
  private final static QName _DiagramEndpointIconPosLeft_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IconPosLeft");
  private final static QName _DiagramEndpointIconType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IconType");
  private final static QName _DiagramEndpointIconPosTop_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IconPosTop");
  private final static QName _FreqConversionStageNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StageNum");
  private final static QName _FreqConversionIFMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IFMin");
  private final static QName _FreqConversionOscillatorTuning_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "OscillatorTuning");
  private final static QName _FreqConversionLOFreqMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LOFreqMax");
  private final static QName _FreqConversionLOFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LOFreqMin");
  private final static QName _FreqConversionIFMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IFMax");
  private final static QName _ConfigEmissionNecessaryBwMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NecessaryBwMin");
  private final static QName _ConfigEmissionNecessaryBwMax_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NecessaryBwMax");
  private final static QName _AntGainFrontToBackRatio_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FrontToBackRatio");
  private final static QName _ConfigFreqInBand_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "InBand");
  private final static QName _StationCositeSep_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CositeSep");
  private final static QName _StationUserCode_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "UserCode");
  private final static QName _StationAntStructureHeight_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AntStructureHeight");
  private final static QName _StationCositeSepDescription_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CositeSepDescription");
  private final static QName _StationStationControl_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StationControl");
  private final static QName _StationTSDF_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "TSDF");
  private final static QName _StationStationName_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "StationName");
  private final static QName _RxModulationDigitalModType_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DigitalModType");
  private final static QName _RxModulationCodePeriod_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "CodePeriod");
  private final static QName _RxModulationLineCoding_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "LineCoding");
  private final static QName _RxModulationNumStates_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "NumStates");
  private final static QName _RxModulationMaxBitRate_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MaxBitRate");
  private final static QName _EndpointLocationAntennaHeight_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AntennaHeight");
  private final static QName _EndpointLocationMinPointAngle_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "MinPointAngle");
  private final static QName _EndpointLocationSiteElevation_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "SiteElevation");
  private final static QName _AllocationAllocatedByFootnote_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "AllocatedByFootnote");
  private final static QName _SSReplyReplyingAuthority_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ReplyingAuthority");
  private final static QName _SSReplyIRACNumber_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "IRACNumber");
  private final static QName _SSReplyFASNumber_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "FASNumber");
  private final static QName _SSReplyApprovalSPSNum_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ApprovalSPSNum");
  private final static QName _SSReplyERPNumber_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "ERPNumber");
  private final static QName _SSReplyDateReceivedByCountry_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "DateReceivedByCountry");
  private final static QName _AllotFreqPairedFreqMin_QNAME = new QName("urn:us:gov:dod:standard:ssrf:3.0.0", "PairedFreqMin");

  /**
   * Create a new ObjectFactory that can be used to create new instances of
   * schema derived classes for package: us.gov.dod.standard.ssrf._3_0
   * <p>
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link SchemaRoot }
   * <p>
   */
  public SchemaRoot createSchemaRoot() {
    return new SchemaRoot();
  }

  /**
   * Create an instance of {@link TListCRT }
   * <p>
   */
  public TListCRT createTListCRT() {
    return new TListCRT();
  }

  /**
   * Create an instance of {@link TUN8_3 }
   * <p>
   */
  public TUN8_3 createTUN8_3() {
    return new TUN8_3();
  }

  /**
   * Create an instance of {@link TListCRS }
   * <p>
   */
  public TListCRS createTListCRS() {
    return new TListCRS();
  }

  /**
   * Create an instance of {@link TUN8_2 }
   * <p>
   */
  public TUN8_2 createTUN8_2() {
    return new TUN8_2();
  }

  /**
   * Create an instance of {@link TListUOW }
   * <p>
   */
  public TListUOW createTListUOW() {
    return new TListUOW();
  }

  /**
   * Create an instance of {@link TdBWHz }
   * <p>
   */
  public TdBWHz createTdBWHz() {
    return new TdBWHz();
  }

  /**
   * Create an instance of {@link Downgrade }
   * <p>
   */
  public Downgrade createDowngrade() {
    return new Downgrade();
  }

  /**
   * Create an instance of {@link Baseband }
   * <p>
   */
  public Baseband createBaseband() {
    return new Baseband();
  }

  /**
   * Create an instance of {@link TListUPF }
   * <p>
   */
  public TListUPF createTListUPF() {
    return new TListUPF();
  }

  /**
   * Create an instance of {@link TListCRD }
   * <p>
   */
  public TListCRD createTListCRD() {
    return new TListCRD();
  }

  /**
   * Create an instance of {@link TListCRA }
   * <p>
   */
  public TListCRA createTListCRA() {
    return new TListCRA();
  }

  /**
   * Create an instance of {@link TxSignalTuning }
   * <p>
   */
  public TxSignalTuning createTxSignalTuning() {
    return new TxSignalTuning();
  }

  /**
   * Create an instance of {@link CaseNum }
   * <p>
   */
  public CaseNum createCaseNum() {
    return new CaseNum();
  }

  /**
   * Create an instance of {@link TListCRE }
   * <p>
   */
  public TListCRE createTListCRE() {
    return new TListCRE();
  }

  /**
   * Create an instance of {@link TElev }
   * <p>
   */
  public TElev createTElev() {
    return new TElev();
  }

  /**
   * Create an instance of {@link Point }
   * <p>
   */
  public Point createPoint() {
    return new Point();
  }

  /**
   * Create an instance of {@link TMEMO }
   * <p>
   */
  public TMEMO createTMEMO() {
    return new TMEMO();
  }

  /**
   * Create an instance of {@link TUN4 }
   * <p>
   */
  public TUN4 createTUN4() {
    return new TUN4();
  }

  /**
   * Create an instance of {@link TUN3 }
   * <p>
   */
  public TUN3 createTUN3() {
    return new TUN3();
  }

  /**
   * Create an instance of {@link TUN2 }
   * <p>
   */
  public TUN2 createTUN2() {
    return new TUN2();
  }

  /**
   * Create an instance of {@link TListUNS }
   * <p>
   */
  public TListUNS createTListUNS() {
    return new TListUNS();
  }

  /**
   * Create an instance of {@link TUN1 }
   * <p>
   */
  public TUN1 createTUN1() {
    return new TUN1();
  }

  /**
   * Create an instance of {@link TUN6_3 }
   * <p>
   */
  public TUN6_3 createTUN6_3() {
    return new TUN6_3();
  }

  /**
   * Create an instance of {@link TUN6_2 }
   * <p>
   */
  public TUN6_2 createTUN6_2() {
    return new TUN6_2();
  }

  /**
   * Create an instance of {@link TUN9 }
   * <p>
   */
  public TUN9 createTUN9() {
    return new TUN9();
  }

  /**
   * Create an instance of {@link TUN6_4 }
   * <p>
   */
  public TUN6_4 createTUN6_4() {
    return new TUN6_4();
  }

  /**
   * Create an instance of {@link Country }
   * <p>
   */
  public Country createCountry() {
    return new Country();
  }

  /**
   * Create an instance of {@link TUN8 }
   * <p>
   */
  public TUN8 createTUN8() {
    return new TUN8();
  }

  /**
   * Create an instance of {@link TUN7 }
   * <p>
   */
  public TUN7 createTUN7() {
    return new TUN7();
  }

  /**
   * Create an instance of {@link TUN10_2 }
   * <p>
   */
  public TUN10_2 createTUN10_2() {
    return new TUN10_2();
  }

  /**
   * Create an instance of {@link TUN6 }
   * <p>
   */
  public TUN6 createTUN6() {
    return new TUN6();
  }

  /**
   * Create an instance of {@link TUN6_1 }
   * <p>
   */
  public TUN6_1 createTUN6_1() {
    return new TUN6_1();
  }

  /**
   * Create an instance of {@link TUN5 }
   * <p>
   */
  public TUN5 createTUN5() {
    return new TUN5();
  }

  /**
   * Create an instance of {@link RelatedSupportability }
   * <p>
   */
  public RelatedSupportability createRelatedSupportability() {
    return new RelatedSupportability();
  }

  /**
   * Create an instance of {@link TUN4_1 }
   * <p>
   */
  public TUN4_1 createTUN4_1() {
    return new TUN4_1();
  }

  /**
   * Create an instance of {@link Receiver }
   * <p>
   */
  public Receiver createReceiver() {
    return new Receiver();
  }

  /**
   * Create an instance of {@link TUN4_2 }
   * <p>
   */
  public TUN4_2 createTUN4_2() {
    return new TUN4_2();
  }

  /**
   * Create an instance of {@link Pulse }
   * <p>
   */
  public Pulse createPulse() {
    return new Pulse();
  }

  /**
   * Create an instance of {@link SecurityClass }
   * <p>
   */
  public SecurityClass createSecurityClass() {
    return new SecurityClass();
  }

  /**
   * Create an instance of {@link Stage }
   * <p>
   */
  public Stage createStage() {
    return new Stage();
  }

  /**
   * Create an instance of {@link TUN8_4 }
   * <p>
   */
  public TUN8_4 createTUN8_4() {
    return new TUN8_4();
  }

  /**
   * Create an instance of {@link TUN8_5 }
   * <p>
   */
  public TUN8_5 createTUN8_5() {
    return new TUN8_5();
  }

  /**
   * Create an instance of {@link TUN8_6 }
   * <p>
   */
  public TUN8_6 createTUN8_6() {
    return new TUN8_6();
  }

  /**
   * Create an instance of {@link TListCPT }
   * <p>
   */
  public TListCPT createTListCPT() {
    return new TListCPT();
  }

  /**
   * Create an instance of {@link TListCPS }
   * <p>
   */
  public TListCPS createTListCPS() {
    return new TListCPS();
  }

  /**
   * Create an instance of {@link LocationRef }
   * <p>
   */
  public LocationRef createLocationRef() {
    return new LocationRef();
  }

  /**
   * Create an instance of {@link TUS_DBm }
   * <p>
   */
  public TUS_DBm createTUS_DBm() {
    return new TUS_DBm();
  }

  /**
   * Create an instance of {@link TListCPO }
   * <p>
   */
  public TListCPO createTListCPO() {
    return new TListCPO();
  }

  /**
   * Create an instance of {@link ConfigEmission }
   * <p>
   */
  public ConfigEmission createConfigEmission() {
    return new ConfigEmission();
  }

  /**
   * Create an instance of {@link Usage }
   * <p>
   */
  public Usage createUsage() {
    return new Usage();
  }

  /**
   * Create an instance of {@link Station }
   * <p>
   */
  public Station createStation() {
    return new Station();
  }

  /**
   * Create an instance of {@link MissingRef }
   * <p>
   */
  public MissingRef createMissingRef() {
    return new MissingRef();
  }

  /**
   * Create an instance of {@link TListCPC }
   * <p>
   */
  public TListCPC createTListCPC() {
    return new TListCPC();
  }

  /**
   * Create an instance of {@link RFSystemRef }
   * <p>
   */
  public RFSystemRef createRFSystemRef() {
    return new RFSystemRef();
  }

  /**
   * Create an instance of {@link HostNation }
   * <p>
   */
  public HostNation createHostNation() {
    return new HostNation();
  }

  /**
   * Create an instance of {@link TListURI }
   * <p>
   */
  public TListURI createTListURI() {
    return new TListURI();
  }

  /**
   * Create an instance of {@link TS255 }
   * <p>
   */
  public TS255 createTS255() {
    return new TS255();
  }

  /**
   * Create an instance of {@link TListCPI }
   * <p>
   */
  public TListCPI createTListCPI() {
    return new TListCPI();
  }

  /**
   * Create an instance of {@link TElev180 }
   * <p>
   */
  public TElev180 createTElev180() {
    return new TElev180();
  }

  /**
   * Create an instance of {@link TListCPJ }
   * <p>
   */
  public TListCPJ createTListCPJ() {
    return new TListCPJ();
  }

  /**
   * Create an instance of {@link TAz180 }
   * <p>
   */
  public TAz180 createTAz180() {
    return new TAz180();
  }

  /**
   * Create an instance of {@link TListCOT }
   * <p>
   */
  public TListCOT createTListCOT() {
    return new TListCOT();
  }

  /**
   * Create an instance of {@link TListUPU }
   * <p>
   */
  public TListUPU createTListUPU() {
    return new TListUPU();
  }

  /**
   * Create an instance of {@link TAltitude }
   * <p>
   */
  public TAltitude createTAltitude() {
    return new TAltitude();
  }

  /**
   * Create an instance of {@link Organisation }
   * <p>
   */
  public Organisation createOrganisation() {
    return new Organisation();
  }

  /**
   * Create an instance of {@link TListUPR }
   * <p>
   */
  public TListUPR createTListUPR() {
    return new TListUPR();
  }

  /**
   * Create an instance of {@link AntHardware }
   * <p>
   */
  public AntHardware createAntHardware() {
    return new AntHardware();
  }

  /**
   * Create an instance of {@link Installation }
   * <p>
   */
  public Installation createInstallation() {
    return new Installation();
  }

  /**
   * Create an instance of {@link Link }
   * <p>
   */
  public Link createLink() {
    return new Link();
  }

  /**
   * Create an instance of {@link Polygon }
   * <p>
   */
  public Polygon createPolygon() {
    return new Polygon();
  }

  /**
   * Create an instance of {@link Trunking }
   * <p>
   */
  public Trunking createTrunking() {
    return new Trunking();
  }

  /**
   * Create an instance of {@link RxRef }
   * <p>
   */
  public RxRef createRxRef() {
    return new RxRef();
  }

  /**
   * Create an instance of {@link TUN2_1 }
   * <p>
   */
  public TUN2_1 createTUN2_1() {
    return new TUN2_1();
  }

  /**
   * Create an instance of {@link TxAntModeRef }
   * <p>
   */
  public TxAntModeRef createTxAntModeRef() {
    return new TxAntModeRef();
  }

  /**
   * Create an instance of {@link Role }
   * <p>
   */
  public Role createRole() {
    return new Role();
  }

  /**
   * Create an instance of {@link TSerial }
   * <p>
   */
  public TSerial createTSerial() {
    return new TSerial();
  }

  /**
   * Create an instance of {@link Satellite }
   * <p>
   */
  public Satellite createSatellite() {
    return new Satellite();
  }

  /**
   * Create an instance of {@link TSN9_2 }
   * <p>
   */
  public TSN9_2 createTSN9_2() {
    return new TSN9_2();
  }

  /**
   * Create an instance of {@link TUS_Twips }
   * <p>
   */
  public TUS_Twips createTUS_Twips() {
    return new TUS_Twips();
  }

  /**
   * Create an instance of {@link TUN9_1 }
   * <p>
   */
  public TUN9_1 createTUN9_1() {
    return new TUN9_1();
  }

  /**
   * Create an instance of {@link TUN9_3 }
   * <p>
   */
  public TUN9_3 createTUN9_3() {
    return new TUN9_3();
  }

  /**
   * Create an instance of {@link TUS_DB }
   * <p>
   */
  public TUS_DB createTUS_DB() {
    return new TUS_DB();
  }

  /**
   * Create an instance of {@link TUN9_4 }
   * <p>
   */
  public TUN9_4 createTUN9_4() {
    return new TUN9_4();
  }

  /**
   * Create an instance of {@link TUN9_5 }
   * <p>
   */
  public TUN9_5 createTUN9_5() {
    return new TUN9_5();
  }

  /**
   * Create an instance of {@link TUN9_6 }
   * <p>
   */
  public TUN9_6 createTUN9_6() {
    return new TUN9_6();
  }

  /**
   * Create an instance of {@link TUN9_7 }
   * <p>
   */
  public TUN9_7 createTUN9_7() {
    return new TUN9_7();
  }

  /**
   * Create an instance of {@link TListCUT }
   * <p>
   */
  public TListCUT createTListCUT() {
    return new TListCUT();
  }

  /**
   * Create an instance of {@link TUN5_1 }
   * <p>
   */
  public TUN5_1 createTUN5_1() {
    return new TUN5_1();
  }

  /**
   * Create an instance of {@link TUN5_2 }
   * <p>
   */
  public TUN5_2 createTUN5_2() {
    return new TUN5_2();
  }

  /**
   * Create an instance of {@link RoleRef }
   * <p>
   */
  public RoleRef createRoleRef() {
    return new RoleRef();
  }

  /**
   * Create an instance of {@link TUN5_3 }
   * <p>
   */
  public TUN5_3 createTUN5_3() {
    return new TUN5_3();
  }

  /**
   * Create an instance of {@link TUN5_4 }
   * <p>
   */
  public TUN5_4 createTUN5_4() {
    return new TUN5_4();
  }

  /**
   * Create an instance of {@link Assigned }
   * <p>
   */
  public Assigned createAssigned() {
    return new Assigned();
  }

  /**
   * Create an instance of {@link TSN9_8 }
   * <p>
   */
  public TSN9_8 createTSN9_8() {
    return new TSN9_8();
  }

  /**
   * Create an instance of {@link ChannelPlan }
   * <p>
   */
  public ChannelPlan createChannelPlan() {
    return new ChannelPlan();
  }

  /**
   * Create an instance of {@link TPercent }
   * <p>
   */
  public TPercent createTPercent() {
    return new TPercent();
  }

  /**
   * Create an instance of {@link TSN9_6 }
   * <p>
   */
  public TSN9_6 createTSN9_6() {
    return new TSN9_6();
  }

  /**
   * Create an instance of {@link Tplatform }
   * <p>
   */
  public Tplatform createTplatform() {
    return new Tplatform();
  }

  /**
   * Create an instance of {@link TListCTU }
   * <p>
   */
  public TListCTU createTListCTU() {
    return new TListCTU();
  }

  /**
   * Create an instance of {@link TListCTS }
   * <p>
   */
  public TListCTS createTListCTS() {
    return new TListCTS();
  }

  /**
   * Create an instance of {@link TListCTP }
   * <p>
   */
  public TListCTP createTListCTP() {
    return new TListCTP();
  }

  /**
   * Create an instance of {@link TListCTO }
   * <p>
   */
  public TListCTO createTListCTO() {
    return new TListCTO();
  }

  /**
   * Create an instance of {@link TListCTN }
   * <p>
   */
  public TListCTN createTListCTN() {
    return new TListCTN();
  }

  /**
   * Create an instance of {@link TListCTI }
   * <p>
   */
  public TListCTI createTListCTI() {
    return new TListCTI();
  }

  /**
   * Create an instance of {@link TUN10_3 }
   * <p>
   */
  public TUN10_3 createTUN10_3() {
    return new TUN10_3();
  }

  /**
   * Create an instance of {@link TUN10_4 }
   * <p>
   */
  public TUN10_4 createTUN10_4() {
    return new TUN10_4();
  }

  /**
   * Create an instance of {@link TUN10_6 }
   * <p>
   */
  public TUN10_6 createTUN10_6() {
    return new TUN10_6();
  }

  /**
   * Create an instance of {@link DetailedFunction }
   * <p>
   */
  public DetailedFunction createDetailedFunction() {
    return new DetailedFunction();
  }

  /**
   * Create an instance of {@link TSN16_6 }
   * <p>
   */
  public TSN16_6 createTSN16_6() {
    return new TSN16_6();
  }

  /**
   * Create an instance of {@link Notation }
   * <p>
   */
  public Notation createNotation() {
    return new Notation();
  }

  /**
   * Create an instance of {@link TListCSR }
   * <p>
   */
  public TListCSR createTListCSR() {
    return new TListCSR();
  }

  /**
   * Create an instance of {@link TListCSS }
   * <p>
   */
  public TListCSS createTListCSS() {
    return new TListCSS();
  }

  /**
   * Create an instance of {@link TListCSU }
   * <p>
   */
  public TListCSU createTListCSU() {
    return new TListCSU();
  }

  /**
   * Create an instance of {@link TScanRate }
   * <p>
   */
  public TScanRate createTScanRate() {
    return new TScanRate();
  }

  /**
   * Create an instance of {@link TListCSN }
   * <p>
   */
  public TListCSN createTListCSN() {
    return new TListCSN();
  }

  /**
   * Create an instance of {@link TListCSP }
   * <p>
   */
  public TListCSP createTListCSP() {
    return new TListCSP();
  }

  /**
   * Create an instance of {@link Administrative }
   * <p>
   */
  public Administrative createAdministrative() {
    return new Administrative();
  }

  /**
   * Create an instance of {@link JRFLEntryLocation }
   * <p>
   */
  public JRFLEntryLocation createJRFLEntryLocation() {
    return new JRFLEntryLocation();
  }

  /**
   * Create an instance of {@link TListCSG }
   * <p>
   */
  public TListCSG createTListCSG() {
    return new TListCSG();
  }

  /**
   * Create an instance of {@link TUN18_6 }
   * <p>
   */
  public TUN18_6 createTUN18_6() {
    return new TUN18_6();
  }

  /**
   * Create an instance of {@link TListCSI }
   * <p>
   */
  public TListCSI createTListCSI() {
    return new TListCSI();
  }

  /**
   * Create an instance of {@link TCurvePointLevel }
   * <p>
   */
  public TCurvePointLevel createTCurvePointLevel() {
    return new TCurvePointLevel();
  }

  /**
   * Create an instance of {@link TListUMD }
   * <p>
   */
  public TListUMD createTListUMD() {
    return new TListUMD();
  }

  /**
   * Create an instance of {@link RxSignalTuning }
   * <p>
   */
  public RxSignalTuning createRxSignalTuning() {
    return new RxSignalTuning();
  }

  /**
   * Create an instance of {@link TListCSE }
   * <p>
   */
  public TListCSE createTListCSE() {
    return new TListCSE();
  }

  /**
   * Create an instance of {@link HostDocketNum }
   * <p>
   */
  public HostDocketNum createHostDocketNum() {
    return new HostDocketNum();
  }

  /**
   * Create an instance of {@link TxRef }
   * <p>
   */
  public TxRef createTxRef() {
    return new TxRef();
  }

  /**
   * Create an instance of {@link SubCarrierTone }
   * <p>
   */
  public SubCarrierTone createSubCarrierTone() {
    return new SubCarrierTone();
  }

  /**
   * Create an instance of {@link TScanSpeed }
   * <p>
   */
  public TScanSpeed createTScanSpeed() {
    return new TScanSpeed();
  }

  /**
   * Create an instance of {@link TAz }
   * <p>
   */
  public TAz createTAz() {
    return new TAz();
  }

  /**
   * Create an instance of {@link TdBW }
   * <p>
   */
  public TdBW createTdBW() {
    return new TdBW();
  }

  /**
   * Create an instance of {@link TDble }
   * <p>
   */
  public TDble createTDble() {
    return new TDble();
  }

  /**
   * Create an instance of {@link AntEfficiency }
   * <p>
   */
  public AntEfficiency createAntEfficiency() {
    return new AntEfficiency();
  }

  /**
   * Create an instance of {@link PolygonPoint }
   * <p>
   */
  public PolygonPoint createPolygonPoint() {
    return new PolygonPoint();
  }

  /**
   * Create an instance of {@link TdBm }
   * <p>
   */
  public TdBm createTdBm() {
    return new TdBm();
  }

  /**
   * Create an instance of {@link StageLocation }
   * <p>
   */
  public StageLocation createStageLocation() {
    return new StageLocation();
  }

  /**
   * Create an instance of {@link Identifier }
   * <p>
   */
  public Identifier createIdentifier() {
    return new Identifier();
  }

  /**
   * Create an instance of {@link Deployment }
   * <p>
   */
  public Deployment createDeployment() {
    return new Deployment();
  }

  /**
   * Create an instance of {@link Antenna }
   * <p>
   */
  public Antenna createAntenna() {
    return new Antenna();
  }

  /**
   * Create an instance of {@link TListCIC }
   * <p>
   */
  public TListCIC createTListCIC() {
    return new TListCIC();
  }

  /**
   * Create an instance of {@link Allotment }
   * <p>
   */
  public Allotment createAllotment() {
    return new Allotment();
  }

  /**
   * Create an instance of {@link TListCIN }
   * <p>
   */
  public TListCIN createTListCIN() {
    return new TListCIN();
  }

  /**
   * Create an instance of {@link TMChips }
   * <p>
   */
  public TMChips createTMChips() {
    return new TMChips();
  }

  /**
   * Create an instance of {@link TListCIR }
   * <p>
   */
  public TListCIR createTListCIR() {
    return new TListCIR();
  }

  /**
   * Create an instance of {@link TListCJ1 }
   * <p>
   */
  public TListCJ1 createTListCJ1() {
    return new TListCJ1();
  }

  /**
   * Create an instance of {@link Nomenclature }
   * <p>
   */
  public Nomenclature createNomenclature() {
    return new Nomenclature();
  }

  /**
   * Create an instance of {@link AntPattern }
   * <p>
   */
  public AntPattern createAntPattern() {
    return new AntPattern();
  }

  /**
   * Create an instance of {@link TDT }
   * <p>
   */
  public TDT createTDT() {
    return new TDT();
  }

  /**
   * Create an instance of {@link CodeList }
   * <p>
   */
  public CodeList createCodeList() {
    return new CodeList();
  }

  /**
   * Create an instance of {@link Common }
   * <p>
   */
  public Common createCommon() {
    return new Common();
  }

  /**
   * Create an instance of {@link TMinSec }
   * <p>
   */
  public TMinSec createTMinSec() {
    return new TMinSec();
  }

  /**
   * Create an instance of {@link TListCHN }
   * <p>
   */
  public TListCHN createTListCHN() {
    return new TListCHN();
  }

  /**
   * Create an instance of {@link TdB }
   * <p>
   */
  public TdB createTdB() {
    return new TdB();
  }

  /**
   * Create an instance of {@link TTBD }
   * <p>
   */
  public TTBD createTTBD() {
    return new TTBD();
  }

  /**
   * Create an instance of {@link TDaysOfMonth }
   * <p>
   */
  public TDaysOfMonth createTDaysOfMonth() {
    return new TDaysOfMonth();
  }

  /**
   * Create an instance of {@link TYears }
   * <p>
   */
  public TYears createTYears() {
    return new TYears();
  }

  /**
   * Create an instance of {@link ClsDerived }
   * <p>
   */
  public ClsDerived createClsDerived() {
    return new ClsDerived();
  }

  /**
   * Create an instance of {@link Address }
   * <p>
   */
  public Address createAddress() {
    return new Address();
  }

  /**
   * Create an instance of {@link Thops }
   * <p>
   */
  public Thops createThops() {
    return new Thops();
  }

  /**
   * Create an instance of {@link TS150 }
   * <p>
   */
  public TS150 createTS150() {
    return new TS150();
  }

  /**
   * Create an instance of {@link TReleasability }
   * <p>
   */
  public TReleasability createTReleasability() {
    return new TReleasability();
  }

  /**
   * Create an instance of {@link BandUser }
   * <p>
   */
  public BandUser createBandUser() {
    return new BandUser();
  }

  /**
   * Create an instance of {@link TUS20 }
   * <p>
   */
  public TUS20 createTUS20() {
    return new TUS20();
  }

  /**
   * Create an instance of {@link TMonths }
   * <p>
   */
  public TMonths createTMonths() {
    return new TMonths();
  }

  /**
   * Create an instance of {@link TListCNU }
   * <p>
   */
  public TListCNU createTListCNU() {
    return new TListCNU();
  }

  /**
   * Create an instance of {@link TUN7_1 }
   * <p>
   */
  public TUN7_1 createTUN7_1() {
    return new TUN7_1();
  }

  /**
   * Create an instance of {@link TUN7_2 }
   * <p>
   */
  public TUN7_2 createTUN7_2() {
    return new TUN7_2();
  }

  /**
   * Create an instance of {@link TListUST }
   * <p>
   */
  public TListUST createTListUST() {
    return new TListUST();
  }

  /**
   * Create an instance of {@link TUN7_4 }
   * <p>
   */
  public TUN7_4 createTUN7_4() {
    return new TUN7_4();
  }

  /**
   * Create an instance of {@link StnClass }
   * <p>
   */
  public StnClass createStnClass() {
    return new StnClass();
  }

  /**
   * Create an instance of {@link TListUSC }
   * <p>
   */
  public TListUSC createTListUSC() {
    return new TListUSC();
  }

  /**
   * Create an instance of {@link EarthStation }
   * <p>
   */
  public EarthStation createEarthStation() {
    return new EarthStation();
  }

  /**
   * Create an instance of {@link TUS10 }
   * <p>
   */
  public TUS10 createTUS10() {
    return new TUS10();
  }

  /**
   * Create an instance of {@link StationLoc }
   * <p>
   */
  public StationLoc createStationLoc() {
    return new StationLoc();
  }

  /**
   * Create an instance of {@link TUN7_5 }
   * <p>
   */
  public TUN7_5 createTUN7_5() {
    return new TUN7_5();
  }

  /**
   * Create an instance of {@link TUS12 }
   * <p>
   */
  public TUS12 createTUS12() {
    return new TUS12();
  }

  /**
   * Create an instance of {@link Footnote }
   * <p>
   */
  public Footnote createFootnote() {
    return new Footnote();
  }

  /**
   * Create an instance of {@link TListCMC }
   * <p>
   */
  public TListCMC createTListCMC() {
    return new TListCMC();
  }

  /**
   * Create an instance of {@link DiagramLine }
   * <p>
   */
  public DiagramLine createDiagramLine() {
    return new DiagramLine();
  }

  /**
   * Create an instance of {@link TUS15 }
   * <p>
   */
  public TUS15 createTUS15() {
    return new TUS15();
  }

  /**
   * Create an instance of {@link TListCMO }
   * <p>
   */
  public TListCMO createTListCMO() {
    return new TListCMO();
  }

  /**
   * Create an instance of {@link JRFL }
   * <p>
   */
  public JRFL createJRFL() {
    return new JRFL();
  }

  /**
   * Create an instance of {@link TLat }
   * <p>
   */
  public TLat createTLat() {
    return new TLat();
  }

  /**
   * Create an instance of {@link TListCLC }
   * <p>
   */
  public TListCLC createTListCLC() {
    return new TListCLC();
  }

  /**
   * Create an instance of {@link AtWaypoint }
   * <p>
   */
  public AtWaypoint createAtWaypoint() {
    return new AtWaypoint();
  }

  /**
   * Create an instance of {@link TS100 }
   * <p>
   */
  public TS100 createTS100() {
    return new TS100();
  }

  /**
   * Create an instance of {@link DiagramEndpoint }
   * <p>
   */
  public DiagramEndpoint createDiagramEndpoint() {
    return new DiagramEndpoint();
  }

  /**
   * Create an instance of {@link TUS40 }
   * <p>
   */
  public TUS40 createTUS40() {
    return new TUS40();
  }

  /**
   * Create an instance of {@link RxMode }
   * <p>
   */
  public RxMode createRxMode() {
    return new RxMode();
  }

  /**
   * Create an instance of {@link CurvePoint }
   * <p>
   */
  public CurvePoint createCurvePoint() {
    return new CurvePoint();
  }

  /**
   * Create an instance of {@link TListCLS }
   * <p>
   */
  public TListCLS createTListCLS() {
    return new TListCLS();
  }

  /**
   * Create an instance of {@link Administration }
   * <p>
   */
  public Administration createAdministration() {
    return new Administration();
  }

  /**
   * Create an instance of {@link TListCLO }
   * <p>
   */
  public TListCLO createTListCLO() {
    return new TListCLO();
  }

  /**
   * Create an instance of {@link TNavAidChnl }
   * <p>
   */
  public TNavAidChnl createTNavAidChnl() {
    return new TNavAidChnl();
  }

  /**
   * Create an instance of {@link TListUUF }
   * <p>
   */
  public TListUUF createTListUUF() {
    return new TListUUF();
  }

  /**
   * Create an instance of {@link TUN12_6 }
   * <p>
   */
  public TUN12_6 createTUN12_6() {
    return new TUN12_6();
  }

  /**
   * Create an instance of {@link RxModeRef }
   * <p>
   */
  public RxModeRef createRxModeRef() {
    return new RxModeRef();
  }

  /**
   * Create an instance of {@link VSWR }
   * <p>
   */
  public VSWR createVSWR() {
    return new VSWR();
  }

  /**
   * Create an instance of {@link TListUUC }
   * <p>
   */
  public TListUUC createTListUUC() {
    return new TListUUC();
  }

  /**
   * Create an instance of {@link RecordNote }
   * <p>
   */
  public RecordNote createRecordNote() {
    return new RecordNote();
  }

  /**
   * Create an instance of {@link TUN12_3 }
   * <p>
   */
  public TUN12_3 createTUN12_3() {
    return new TUN12_3();
  }

  /**
   * Create an instance of {@link TUN12_4 }
   * <p>
   */
  public TUN12_4 createTUN12_4() {
    return new TUN12_4();
  }

  /**
   * Create an instance of {@link Location }
   * <p>
   */
  public Location createLocation() {
    return new Location();
  }

  /**
   * Create an instance of {@link TUN11_8 }
   * <p>
   */
  public TUN11_8 createTUN11_8() {
    return new TUN11_8();
  }

  /**
   * Create an instance of {@link TS200 }
   * <p>
   */
  public TS200 createTS200() {
    return new TS200();
  }

  /**
   * Create an instance of {@link BandApplication }
   * <p>
   */
  public BandApplication createBandApplication() {
    return new BandApplication();
  }

  /**
   * Create an instance of {@link TUS_Percent }
   * <p>
   */
  public TUS_Percent createTUS_Percent() {
    return new TUS_Percent();
  }

  /**
   * Create an instance of {@link NarrowBandPlanning }
   * <p>
   */
  public NarrowBandPlanning createNarrowBandPlanning() {
    return new NarrowBandPlanning();
  }

  /**
   * Create an instance of {@link TUS30 }
   * <p>
   */
  public TUS30 createTUS30() {
    return new TUS30();
  }

  /**
   * Create an instance of {@link ContactRef }
   * <p>
   */
  public ContactRef createContactRef() {
    return new ContactRef();
  }

  /**
   * Create an instance of {@link TkChirps }
   * <p>
   */
  public TkChirps createTkChirps() {
    return new TkChirps();
  }

  /**
   * Create an instance of {@link ExternalReference }
   * <p>
   */
  public ExternalReference createExternalReference() {
    return new ExternalReference();
  }

  /**
   * Create an instance of {@link TListUTY }
   * <p>
   */
  public TListUTY createTListUTY() {
    return new TListUTY();
  }

  /**
   * Create an instance of {@link AsgnAllotOwner }
   * <p>
   */
  public AsgnAllotOwner createAsgnAllotOwner() {
    return new AsgnAllotOwner();
  }

  /**
   * Create an instance of {@link TIdxList }
   * <p>
   */
  public TIdxList createTIdxList() {
    return new TIdxList();
  }

  /**
   * Create an instance of {@link TListCCD }
   * <p>
   */
  public TListCCD createTListCCD() {
    return new TListCCD();
  }

  /**
   * Create an instance of {@link TListCCI }
   * <p>
   */
  public TListCCI createTListCCI() {
    return new TListCCI();
  }

  /**
   * Create an instance of {@link Project }
   * <p>
   */
  public Project createProject() {
    return new Project();
  }

  /**
   * Create an instance of {@link TListCCL }
   * <p>
   */
  public TListCCL createTListCCL() {
    return new TListCCL();
  }

  /**
   * Create an instance of {@link TListCCN }
   * <p>
   */
  public TListCCN createTListCCN() {
    return new TListCCN();
  }

  /**
   * Create an instance of {@link TListCCO }
   * <p>
   */
  public TListCCO createTListCCO() {
    return new TListCCO();
  }

  /**
   * Create an instance of {@link TSN16_15 }
   * <p>
   */
  public TSN16_15 createTSN16_15() {
    return new TSN16_15();
  }

  /**
   * Create an instance of {@link TListCCT }
   * <p>
   */
  public TListCCT createTListCCT() {
    return new TListCCT();
  }

  /**
   * Create an instance of {@link ExtReferenceRef }
   * <p>
   */
  public ExtReferenceRef createExtReferenceRef() {
    return new ExtReferenceRef();
  }

  /**
   * Create an instance of {@link TListCCY }
   * <p>
   */
  public TListCCY createTListCCY() {
    return new TListCCY();
  }

  /**
   * Create an instance of {@link TListUAG }
   * <p>
   */
  public TListUAG createTListUAG() {
    return new TListUAG();
  }

  /**
   * Create an instance of {@link THours }
   * <p>
   */
  public THours createTHours() {
    return new THours();
  }

  /**
   * Create an instance of {@link TListCDF }
   * <p>
   */
  public TListCDF createTListCDF() {
    return new TListCDF();
  }

  /**
   * Create an instance of {@link TListCDD }
   * <p>
   */
  public TListCDD createTListCDD() {
    return new TListCDD();
  }

  /**
   * Create an instance of {@link Curve }
   * <p>
   */
  public Curve createCurve() {
    return new Curve();
  }

  /**
   * Create an instance of {@link TListCDR }
   * <p>
   */
  public TListCDR createTListCDR() {
    return new TListCDR();
  }

  /**
   * Create an instance of {@link TDaysOfWeek }
   * <p>
   */
  public TDaysOfWeek createTDaysOfWeek() {
    return new TDaysOfWeek();
  }

  /**
   * Create an instance of {@link EMail }
   * <p>
   */
  public EMail createEMail() {
    return new EMail();
  }

  /**
   * Create an instance of {@link TListCDS }
   * <p>
   */
  public TListCDS createTListCDS() {
    return new TListCDS();
  }

  /**
   * Create an instance of {@link TSN3_1 }
   * <p>
   */
  public TSN3_1 createTSN3_1() {
    return new TSN3_1();
  }

  /**
   * Create an instance of {@link ChannelPlanRef }
   * <p>
   */
  public ChannelPlanRef createChannelPlanRef() {
    return new ChannelPlanRef();
  }

  /**
   * Create an instance of {@link TFreqM }
   * <p>
   */
  public TFreqM createTFreqM() {
    return new TFreqM();
  }

  /**
   * Create an instance of {@link TListCEA }
   * <p>
   */
  public TListCEA createTListCEA() {
    return new TListCEA();
  }

  /**
   * Create an instance of {@link Remarks }
   * <p>
   */
  public Remarks createRemarks() {
    return new Remarks();
  }

  /**
   * Create an instance of {@link StatusLog }
   * <p>
   */
  public StatusLog createStatusLog() {
    return new StatusLog();
  }

  /**
   * Create an instance of {@link FreqOld }
   * <p>
   */
  public FreqOld createFreqOld() {
    return new FreqOld();
  }

  /**
   * Create an instance of {@link Code }
   * <p>
   */
  public Code createCode() {
    return new Code();
  }

  /**
   * Create an instance of {@link JRFLEntry }
   * <p>
   */
  public JRFLEntry createJRFLEntry() {
    return new JRFLEntry();
  }

  /**
   * Create an instance of {@link SubCarrierFreq }
   * <p>
   */
  public SubCarrierFreq createSubCarrierFreq() {
    return new SubCarrierFreq();
  }

  /**
   * Create an instance of {@link TxModeRef }
   * <p>
   */
  public TxModeRef createTxModeRef() {
    return new TxModeRef();
  }

  /**
   * Create an instance of {@link TListCEF }
   * <p>
   */
  public TListCEF createTListCEF() {
    return new TListCEF();
  }

  /**
   * Create an instance of {@link TUN16_15 }
   * <p>
   */
  public TUN16_15 createTUN16_15() {
    return new TUN16_15();
  }

  /**
   * Create an instance of {@link Ellipse }
   * <p>
   */
  public Ellipse createEllipse() {
    return new Ellipse();
  }

  /**
   * Create an instance of {@link TListCEN }
   * <p>
   */
  public TListCEN createTListCEN() {
    return new TListCEN();
  }

  /**
   * Create an instance of {@link TListCET }
   * <p>
   */
  public TListCET createTListCET() {
    return new TListCET();
  }

  /**
   * Create an instance of {@link TListCFD }
   * <p>
   */
  public TListCFD createTListCFD() {
    return new TListCFD();
  }

  /**
   * Create an instance of {@link Tmillisecs }
   * <p>
   */
  public Tmillisecs createTmillisecs() {
    return new Tmillisecs();
  }

  /**
   * Create an instance of {@link Note }
   * <p>
   */
  public Note createNote() {
    return new Note();
  }

  /**
   * Create an instance of {@link IntfReport }
   * <p>
   */
  public IntfReport createIntfReport() {
    return new IntfReport();
  }

  /**
   * Create an instance of {@link SpreadSpectrum }
   * <p>
   */
  public SpreadSpectrum createSpreadSpectrum() {
    return new SpreadSpectrum();
  }

  /**
   * Create an instance of {@link RxModulation }
   * <p>
   */
  public RxModulation createRxModulation() {
    return new RxModulation();
  }

  /**
   * Create an instance of {@link CircuitRemarks }
   * <p>
   */
  public CircuitRemarks createCircuitRemarks() {
    return new CircuitRemarks();
  }

  /**
   * Create an instance of {@link Tmicrosecs }
   * <p>
   */
  public Tmicrosecs createTmicrosecs() {
    return new Tmicrosecs();
  }

  /**
   * Create an instance of {@link TListCFE }
   * <p>
   */
  public TListCFE createTListCFE() {
    return new TListCFE();
  }

  /**
   * Create an instance of {@link TFreqH }
   * <p>
   */
  public TFreqH createTFreqH() {
    return new TFreqH();
  }

  /**
   * Create an instance of {@link TListCFT }
   * <p>
   */
  public TListCFT createTListCFT() {
    return new TListCFT();
  }

  /**
   * Create an instance of {@link TListCFR }
   * <p>
   */
  public TListCFR createTListCFR() {
    return new TListCFR();
  }

  /**
   * Create an instance of {@link TListCFO }
   * <p>
   */
  public TListCFO createTListCFO() {
    return new TListCFO();
  }

  /**
   * Create an instance of {@link TListCFM }
   * <p>
   */
  public TListCFM createTListCFM() {
    return new TListCFM();
  }

  /**
   * Create an instance of {@link DCSTrunk }
   * <p>
   */
  public DCSTrunk createDCSTrunk() {
    return new DCSTrunk();
  }

  /**
   * Create an instance of {@link DocketNum }
   * <p>
   */
  public DocketNum createDocketNum() {
    return new DocketNum();
  }

  /**
   * Create an instance of {@link TS11 }
   * <p>
   */
  public TS11 createTS11() {
    return new TS11();
  }

  /**
   * Create an instance of {@link TS10 }
   * <p>
   */
  public TS10 createTS10() {
    return new TS10();
  }

  /**
   * Create an instance of {@link TS12 }
   * <p>
   */
  public TS12 createTS12() {
    return new TS12();
  }

  /**
   * Create an instance of {@link TS14 }
   * <p>
   */
  public TS14 createTS14() {
    return new TS14();
  }

  /**
   * Create an instance of {@link TS15 }
   * <p>
   */
  public TS15 createTS15() {
    return new TS15();
  }

  /**
   * Create an instance of {@link TS16 }
   * <p>
   */
  public TS16 createTS16() {
    return new TS16();
  }

  /**
   * Create an instance of {@link TS18 }
   * <p>
   */
  public TS18 createTS18() {
    return new TS18();
  }

  /**
   * Create an instance of {@link StockNum }
   * <p>
   */
  public StockNum createStockNum() {
    return new StockNum();
  }

  /**
   * Create an instance of {@link Emission }
   * <p>
   */
  public Emission createEmission() {
    return new Emission();
  }

  /**
   * Create an instance of {@link TS20 }
   * <p>
   */
  public TS20 createTS20() {
    return new TS20();
  }

  /**
   * Create an instance of {@link TS22 }
   * <p>
   */
  public TS22 createTS22() {
    return new TS22();
  }

  /**
   * Create an instance of {@link TUS_DBWHz }
   * <p>
   */
  public TUS_DBWHz createTUS_DBWHz() {
    return new TUS_DBWHz();
  }

  /**
   * Create an instance of {@link RFSystem }
   * <p>
   */
  public RFSystem createRFSystem() {
    return new RFSystem();
  }

  /**
   * Create an instance of {@link TD }
   * <p>
   */
  public TD createTD() {
    return new TD();
  }

  /**
   * Create an instance of {@link Variance }
   * <p>
   */
  public Variance createVariance() {
    return new Variance();
  }

  /**
   * Create an instance of {@link Dataset }
   * <p>
   */
  public Dataset createDataset() {
    return new Dataset();
  }

  /**
   * Create an instance of {@link Allocation }
   * <p>
   */
  public Allocation createAllocation() {
    return new Allocation();
  }

  /**
   * Create an instance of {@link TListCAL }
   * <p>
   */
  public TListCAL createTListCAL() {
    return new TListCAL();
  }

  /**
   * Create an instance of {@link TListCAO }
   * <p>
   */
  public TListCAO createTListCAO() {
    return new TListCAO();
  }

  /**
   * Create an instance of {@link FEDeployment }
   * <p>
   */
  public FEDeployment createFEDeployment() {
    return new FEDeployment();
  }

  /**
   * Create an instance of {@link TUS50 }
   * <p>
   */
  public TUS50 createTUS50() {
    return new TUS50();
  }

  /**
   * Create an instance of {@link TSpeed }
   * <p>
   */
  public TSpeed createTSpeed() {
    return new TSpeed();
  }

  /**
   * Create an instance of {@link TListCAD }
   * <p>
   */
  public TListCAD createTListCAD() {
    return new TListCAD();
  }

  /**
   * Create an instance of {@link TListCAF }
   * <p>
   */
  public TListCAF createTListCAF() {
    return new TListCAF();
  }

  /**
   * Create an instance of {@link TListCAC }
   * <p>
   */
  public TListCAC createTListCAC() {
    return new TListCAC();
  }

  /**
   * Create an instance of {@link TListCAV }
   * <p>
   */
  public TListCAV createTListCAV() {
    return new TListCAV();
  }

  /**
   * Create an instance of {@link TListCAT }
   * <p>
   */
  public TListCAT createTListCAT() {
    return new TListCAT();
  }

  /**
   * Create an instance of {@link Configuration }
   * <p>
   */
  public Configuration createConfiguration() {
    return new Configuration();
  }

  /**
   * Create an instance of {@link TListCAU }
   * <p>
   */
  public TListCAU createTListCAU() {
    return new TListCAU();
  }

  /**
   * Create an instance of {@link TListCAS }
   * <p>
   */
  public TListCAS createTListCAS() {
    return new TListCAS();
  }

  /**
   * Create an instance of {@link TListCAP }
   * <p>
   */
  public TListCAP createTListCAP() {
    return new TListCAP();
  }

  /**
   * Create an instance of {@link TxModulation }
   * <p>
   */
  public TxModulation createTxModulation() {
    return new TxModulation();
  }

  /**
   * Create an instance of {@link TListCBO }
   * <p>
   */
  public TListCBO createTListCBO() {
    return new TListCBO();
  }

  /**
   * Create an instance of {@link RelatedOrganisation }
   * <p>
   */
  public RelatedOrganisation createRelatedOrganisation() {
    return new RelatedOrganisation();
  }

  /**
   * Create an instance of {@link TDistance }
   * <p>
   */
  public TDistance createTDistance() {
    return new TDistance();
  }

  /**
   * Create an instance of {@link AntFreqs }
   * <p>
   */
  public AntFreqs createAntFreqs() {
    return new AntFreqs();
  }

  /**
   * Create an instance of {@link SSRequest }
   * <p>
   */
  public SSRequest createSSRequest() {
    return new SSRequest();
  }

  /**
   * Create an instance of {@link TListCBD }
   * <p>
   */
  public TListCBD createTListCBD() {
    return new TListCBD();
  }

  /**
   * Create an instance of {@link PairedFreq }
   * <p>
   */
  public PairedFreq createPairedFreq() {
    return new PairedFreq();
  }

  /**
   * Create an instance of {@link TS50 }
   * <p>
   */
  public TS50 createTS50() {
    return new TS50();
  }

  /**
   * Create an instance of {@link Channel }
   * <p>
   */
  public Channel createChannel() {
    return new Channel();
  }

  /**
   * Create an instance of {@link TFreqOffset }
   * <p>
   */
  public TFreqOffset createTFreqOffset() {
    return new TFreqOffset();
  }

  /**
   * Create an instance of {@link AllotFreq }
   * <p>
   */
  public AllotFreq createAllotFreq() {
    return new AllotFreq();
  }

  /**
   * Create an instance of {@link TLon }
   * <p>
   */
  public TLon createTLon() {
    return new TLon();
  }

  /**
   * Create an instance of {@link AntPatternPoint }
   * <p>
   */
  public AntPatternPoint createAntPatternPoint() {
    return new AntPatternPoint();
  }

  /**
   * Create an instance of {@link CoordinationData }
   * <p>
   */
  public CoordinationData createCoordinationData() {
    return new CoordinationData();
  }

  /**
   * Create an instance of {@link OffTheShelfEquipment }
   * <p>
   */
  public OffTheShelfEquipment createOffTheShelfEquipment() {
    return new OffTheShelfEquipment();
  }

  /**
   * Create an instance of {@link Freq }
   * <p>
   */
  public Freq createFreq() {
    return new Freq();
  }

  /**
   * Create an instance of {@link TrunkingAssignment }
   * <p>
   */
  public TrunkingAssignment createTrunkingAssignment() {
    return new TrunkingAssignment();
  }

  /**
   * Create an instance of {@link Tpriority }
   * <p>
   */
  public Tpriority createTpriority() {
    return new Tpriority();
  }

  /**
   * Create an instance of {@link TS60 }
   * <p>
   */
  public TS60 createTS60() {
    return new TS60();
  }

  /**
   * Create an instance of {@link Comment }
   * <p>
   */
  public Comment createComment() {
    return new Comment();
  }

  /**
   * Create an instance of {@link AntMode }
   * <p>
   */
  public AntMode createAntMode() {
    return new AntMode();
  }

  /**
   * Create an instance of {@link TTSDFValue }
   * <p>
   */
  public TTSDFValue createTTSDFValue() {
    return new TTSDFValue();
  }

  /**
   * Create an instance of {@link ForceElement }
   * <p>
   */
  public ForceElement createForceElement() {
    return new ForceElement();
  }

  /**
   * Create an instance of {@link TSN5_1 }
   * <p>
   */
  public TSN5_1 createTSN5_1() {
    return new TSN5_1();
  }

  /**
   * Create an instance of {@link TS30 }
   * <p>
   */
  public TS30 createTS30() {
    return new TS30();
  }

  /**
   * Create an instance of {@link TSN5_2 }
   * <p>
   */
  public TSN5_2 createTSN5_2() {
    return new TSN5_2();
  }

  /**
   * Create an instance of {@link Assets }
   * <p>
   */
  public Assets createAssets() {
    return new Assets();
  }

  /**
   * Create an instance of {@link CommentSource }
   * <p>
   */
  public CommentSource createCommentSource() {
    return new CommentSource();
  }

  /**
   * Create an instance of {@link EndpointLocation }
   * <p>
   */
  public EndpointLocation createEndpointLocation() {
    return new EndpointLocation();
  }

  /**
   * Create an instance of {@link TS6 }
   * <p>
   */
  public TS6 createTS6() {
    return new TS6();
  }

  /**
   * Create an instance of {@link TS5 }
   * <p>
   */
  public TS5 createTS5() {
    return new TS5();
  }

  /**
   * Create an instance of {@link TS4 }
   * <p>
   */
  public TS4 createTS4() {
    return new TS4();
  }

  /**
   * Create an instance of {@link Time }
   * <p>
   */
  public Time createTime() {
    return new Time();
  }

  /**
   * Create an instance of {@link TS3 }
   * <p>
   */
  public TS3 createTS3() {
    return new TS3();
  }

  /**
   * Create an instance of {@link TS2 }
   * <p>
   */
  public TS2 createTS2() {
    return new TS2();
  }

  /**
   * Create an instance of {@link TS1 }
   * <p>
   */
  public TS1 createTS1() {
    return new TS1();
  }

  /**
   * Create an instance of {@link RxAntModeRef }
   * <p>
   */
  public RxAntModeRef createRxAntModeRef() {
    return new RxAntModeRef();
  }

  /**
   * Create an instance of {@link ConfigFreq }
   * <p>
   */
  public ConfigFreq createConfigFreq() {
    return new ConfigFreq();
  }

  /**
   * Create an instance of {@link TS24 }
   * <p>
   */
  public TS24 createTS24() {
    return new TS24();
  }

  /**
   * Create an instance of {@link TS9 }
   * <p>
   */
  public TS9 createTS9() {
    return new TS9();
  }

  /**
   * Create an instance of {@link TListUFN }
   * <p>
   */
  public TListUFN createTListUFN() {
    return new TListUFN();
  }

  /**
   * Create an instance of {@link TUS1 }
   * <p>
   */
  public TUS1 createTUS1() {
    return new TUS1();
  }

  /**
   * Create an instance of {@link TS8 }
   * <p>
   */
  public TS8 createTS8() {
    return new TS8();
  }

  /**
   * Create an instance of {@link TS7 }
   * <p>
   */
  public TS7 createTS7() {
    return new TS7();
  }

  /**
   * Create an instance of {@link TS25 }
   * <p>
   */
  public TS25 createTS25() {
    return new TS25();
  }

  /**
   * Create an instance of {@link ChannelFreq }
   * <p>
   */
  public ChannelFreq createChannelFreq() {
    return new ChannelFreq();
  }

  /**
   * Create an instance of {@link TS40 }
   * <p>
   */
  public TS40 createTS40() {
    return new TS40();
  }

  /**
   * Create an instance of {@link SSReply }
   * <p>
   */
  public SSReply createSSReply() {
    return new SSReply();
  }

  /**
   * Create an instance of {@link TIFNum }
   * <p>
   */
  public TIFNum createTIFNum() {
    return new TIFNum();
  }

  /**
   * Create an instance of {@link TS35 }
   * <p>
   */
  public TS35 createTS35() {
    return new TS35();
  }

  /**
   * Create an instance of {@link FreqConversion }
   * <p>
   */
  public FreqConversion createFreqConversion() {
    return new FreqConversion();
  }

  /**
   * Create an instance of {@link Tminutes }
   * <p>
   */
  public Tminutes createTminutes() {
    return new Tminutes();
  }

  /**
   * Create an instance of {@link TUN3_2 }
   * <p>
   */
  public TUN3_2 createTUN3_2() {
    return new TUN3_2();
  }

  /**
   * Create an instance of {@link Tuning }
   * <p>
   */
  public Tuning createTuning() {
    return new Tuning();
  }

  /**
   * Create an instance of {@link TUN3_1 }
   * <p>
   */
  public TUN3_1 createTUN3_1() {
    return new TUN3_1();
  }

  /**
   * Create an instance of {@link TDigestCode }
   * <p>
   */
  public TDigestCode createTDigestCode() {
    return new TDigestCode();
  }

  /**
   * Create an instance of {@link TListUDA }
   * <p>
   */
  public TListUDA createTListUDA() {
    return new TListUDA();
  }

  /**
   * Create an instance of {@link TSN7_4 }
   * <p>
   */
  public TSN7_4 createTSN7_4() {
    return new TSN7_4();
  }

  /**
   * Create an instance of {@link TSN7_2 }
   * <p>
   */
  public TSN7_2 createTSN7_2() {
    return new TSN7_2();
  }

  /**
   * Create an instance of {@link Power }
   * <p>
   */
  public Power createPower() {
    return new Power();
  }

  /**
   * Create an instance of {@link Transmitter }
   * <p>
   */
  public Transmitter createTransmitter() {
    return new Transmitter();
  }

  /**
   * Create an instance of {@link TUS6 }
   * <p>
   */
  public TUS6 createTUS6() {
    return new TUS6();
  }

  /**
   * Create an instance of {@link AsgnFreqBase }
   * <p>
   */
  public AsgnFreqBase createAsgnFreqBase() {
    return new AsgnFreqBase();
  }

  /**
   * Create an instance of {@link TUS5 }
   * <p>
   */
  public TUS5 createTUS5() {
    return new TUS5();
  }

  /**
   * Create an instance of {@link TUS4 }
   * <p>
   */
  public TUS4 createTUS4() {
    return new TUS4();
  }

  /**
   * Create an instance of {@link TUS3 }
   * <p>
   */
  public TUS3 createTUS3() {
    return new TUS3();
  }

  /**
   * Create an instance of {@link TUS2 }
   * <p>
   */
  public TUS2 createTUS2() {
    return new TUS2();
  }

  /**
   * Create an instance of {@link RelatedSystem }
   * <p>
   */
  public RelatedSystem createRelatedSystem() {
    return new RelatedSystem();
  }

  /**
   * Create an instance of {@link PreviousAuthorization }
   * <p>
   */
  public PreviousAuthorization createPreviousAuthorization() {
    return new PreviousAuthorization();
  }

  /**
   * Create an instance of {@link TEmsDes }
   * <p>
   */
  public TEmsDes createTEmsDes() {
    return new TEmsDes();
  }

  /**
   * Create an instance of {@link StationConfig }
   * <p>
   */
  public StationConfig createStationConfig() {
    return new StationConfig();
  }

  /**
   * Create an instance of {@link TSN6_3 }
   * <p>
   */
  public TSN6_3 createTSN6_3() {
    return new TSN6_3();
  }

  /**
   * Create an instance of {@link TSN6_2 }
   * <p>
   */
  public TSN6_2 createTSN6_2() {
    return new TSN6_2();
  }

  /**
   * Create an instance of {@link Assignment }
   * <p>
   */
  public Assignment createAssignment() {
    return new Assignment();
  }

  /**
   * Create an instance of {@link TS70 }
   * <p>
   */
  public TS70 createTS70() {
    return new TS70();
  }

  /**
   * Create an instance of {@link Blanking }
   * <p>
   */
  public Blanking createBlanking() {
    return new Blanking();
  }

  /**
   * Create an instance of {@link POCInformation }
   * <p>
   */
  public POCInformation createPOCInformation() {
    return new POCInformation();
  }

  /**
   * Create an instance of {@link TxMode }
   * <p>
   */
  public TxMode createTxMode() {
    return new TxMode();
  }

  /**
   * Create an instance of {@link Manufacturer }
   * <p>
   */
  public Manufacturer createManufacturer() {
    return new Manufacturer();
  }

  /**
   * Create an instance of {@link TSN2 }
   * <p>
   */
  public TSN2 createTSN2() {
    return new TSN2();
  }

  /**
   * Create an instance of {@link TSN4_1 }
   * <p>
   */
  public TSN4_1 createTSN4_1() {
    return new TSN4_1();
  }

  /**
   * Create an instance of {@link TSN5 }
   * <p>
   */
  public TSN5 createTSN5() {
    return new TSN5();
  }

  /**
   * Create an instance of {@link TSN6 }
   * <p>
   */
  public TSN6 createTSN6() {
    return new TSN6();
  }

  /**
   * Create an instance of {@link TUS_DBW }
   * <p>
   */
  public TUS_DBW createTUS_DBW() {
    return new TUS_DBW();
  }

  /**
   * Create an instance of {@link AntGain }
   * <p>
   */
  public AntGain createAntGain() {
    return new AntGain();
  }

  /**
   * Create an instance of {@link RelatedRef }
   * <p>
   */
  public RelatedRef createRelatedRef() {
    return new RelatedRef();
  }

  /**
   * Create an instance of {@link TS80 }
   * <p>
   */
  public TS80 createTS80() {
    return new TS80();
  }

  /**
   * Create an instance of {@link TUN12 }
   * <p>
   */
  public TUN12 createTUN12() {
    return new TUN12();
  }

  /**
   * Create an instance of {@link SysOfStation }
   * <p>
   */
  public SysOfStation createSysOfStation() {
    return new SysOfStation();
  }

  /**
   * Create an instance of {@link TUN10 }
   * <p>
   */
  public TUN10 createTUN10() {
    return new TUN10();
  }

  /**
   * Create an instance of {@link Contact }
   * <p>
   */
  public Contact createContact() {
    return new Contact();
  }

  /**
   * Create an instance of {@link TelephoneFax }
   * <p>
   */
  public TelephoneFax createTelephoneFax() {
    return new TelephoneFax();
  }

  /**
   * Create an instance of {@link TOA }
   * <p>
   */
  public TOA createTOA() {
    return new TOA();
  }

  /**
   * Create an instance of {@link TNetNumber }
   * <p>
   */
  public TNetNumber createTNetNumber() {
    return new TNetNumber();
  }

  /**
   * Create an instance of {@link FreqBand }
   * <p>
   */
  public FreqBand createFreqBand() {
    return new FreqBand();
  }

  /**
   * Create an instance of {@link TListUCJ }
   * <p>
   */
  public TListUCJ createTListUCJ() {
    return new TListUCJ();
  }

  /**
   * Create an instance of {@link TListUCH }
   * <p>
   */
  public TListUCH createTListUCH() {
    return new TListUCH();
  }

  /**
   * Create an instance of {@link TUN16 }
   * <p>
   */
  public TUN16 createTUN16() {
    return new TUN16();
  }

  /**
   * Create an instance of {@link LocationRestriction }
   * <p>
   */
  public LocationRestriction createLocationRestriction() {
    return new LocationRestriction();
  }

  /**
   * Create an instance of {@link ServiceArea }
   * <p>
   */
  public ServiceArea createServiceArea() {
    return new ServiceArea();
  }

  /**
   * Create an instance of {@link EmsClass }
   * <p>
   */
  public EmsClass createEmsClass() {
    return new EmsClass();
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link SchemaRoot }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SSRF")
  public JAXBElement<SchemaRoot> createSSRF(SchemaRoot value) {
    return new JAXBElement<>(_SSRF_QNAME, SchemaRoot.class, null, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Freq", scope = VSWR.class)
  public JAXBElement<TFreqM> createVSWRFreq(TFreqM value) {
    return new JAXBElement<>(_VSWRFreq_QNAME, TFreqM.class, VSWR.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerType", scope = Power.class)
  public JAXBElement<TS10> createPowerPowerType(TS10 value) {
    return new JAXBElement<>(_PowerPowerType_QNAME, TS10.class, Power.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Calculated", scope = Power.class)
  public JAXBElement<TListCBO> createPowerCalculated(TListCBO value) {
    return new JAXBElement<>(_PowerCalculated_QNAME, TListCBO.class, Power.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerMin", scope = Power.class)
  public JAXBElement<TdBW> createPowerPowerMin(TdBW value) {
    return new JAXBElement<>(_PowerPowerMin_QNAME, TdBW.class, Power.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerMax", scope = Power.class)
  public JAXBElement<TdBW> createPowerPowerMax(TdBW value) {
    return new JAXBElement<>(_PowerPowerMax_QNAME, TdBW.class, Power.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RefFreq", scope = AsgnFreqBase.class)
  public JAXBElement<TFreqM> createAsgnFreqBaseRefFreq(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseRefFreq_QNAME, TFreqM.class, AsgnFreqBase.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = AsgnFreqBase.class)
  public JAXBElement<TFreqM> createAsgnFreqBaseFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, AsgnFreqBase.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAU }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqUse", scope = AsgnFreqBase.class)
  public JAXBElement<TListCAU> createAsgnFreqBaseFreqUse(TListCAU value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqUse_QNAME, TListCAU.class, AsgnFreqBase.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN7_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RotationRateMax", scope = AntMode.class)
  public JAXBElement<TUN7_2> createAntModeRotationRateMax(TUN7_2 value) {
    return new JAXBElement<>(_AntModeRotationRateMax_QNAME, TUN7_2.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TScanRate }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzScanRate", scope = AntMode.class)
  public JAXBElement<TScanRate> createAntModeHorzScanRate(TScanRate value) {
    return new JAXBElement<>(_AntModeHorzScanRate_QNAME, TScanRate.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = AntMode.class)
  public JAXBElement<TS100> createAntModeDescription(TS100 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS100.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModeName", scope = AntMode.class)
  public JAXBElement<TS40> createAntModeModeName(TS40 value) {
    return new JAXBElement<>(_AntModeModeName_QNAME, TS40.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BeamType", scope = AntMode.class)
  public JAXBElement<TS25> createAntModeBeamType(TS25 value) {
    return new JAXBElement<>(_AntModeBeamType_QNAME, TS25.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TScanRate }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertScanRate", scope = AntMode.class)
  public JAXBElement<TScanRate> createAntModeVertScanRate(TScanRate value) {
    return new JAXBElement<>(_AntModeVertScanRate_QNAME, TScanRate.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertScanAngleMax", scope = AntMode.class)
  public JAXBElement<TElev> createAntModeVertScanAngleMax(TElev value) {
    return new JAXBElement<>(_AntModeVertScanAngleMax_QNAME, TElev.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzScanSpeed", scope = AntMode.class)
  public JAXBElement<TScanSpeed> createAntModeHorzScanSpeed(TScanSpeed value) {
    return new JAXBElement<>(_AntModeHorzScanSpeed_QNAME, TScanSpeed.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertScanSpeed", scope = AntMode.class)
  public JAXBElement<TScanSpeed> createAntModeVertScanSpeed(TScanSpeed value) {
    return new JAXBElement<>(_AntModeVertScanSpeed_QNAME, TScanSpeed.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertScanAngleMin", scope = AntMode.class)
  public JAXBElement<TElev> createAntModeVertScanAngleMin(TElev value) {
    return new JAXBElement<>(_AntModeVertScanAngleMin_QNAME, TElev.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAU }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModeUse", scope = AntMode.class)
  public JAXBElement<TListCAU> createAntModeModeUse(TListCAU value) {
    return new JAXBElement<>(_AntModeModeUse_QNAME, TListCAU.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzBwMin", scope = AntMode.class)
  public JAXBElement<TAz> createAntModeHorzBwMin(TAz value) {
    return new JAXBElement<>(_AntModeHorzBwMin_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxPower", scope = AntMode.class)
  public JAXBElement<TdBW> createAntModeMaxPower(TdBW value) {
    return new JAXBElement<>(_AntModeMaxPower_QNAME, TdBW.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzBwMax", scope = AntMode.class)
  public JAXBElement<TAz> createAntModeHorzBwMax(TAz value) {
    return new JAXBElement<>(_AntModeHorzBwMax_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SectBlanking", scope = AntMode.class)
  public JAXBElement<TListCBO> createAntModeSectBlanking(TListCBO value) {
    return new JAXBElement<>(_AntModeSectBlanking_QNAME, TListCBO.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzScanSector", scope = AntMode.class)
  public JAXBElement<TAz> createAntModeHorzScanSector(TAz value) {
    return new JAXBElement<>(_AntModeHorzScanSector_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertBwMax", scope = AntMode.class)
  public JAXBElement<TAz> createAntModeVertBwMax(TAz value) {
    return new JAXBElement<>(_AntModeVertBwMax_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertBwMin", scope = AntMode.class)
  public JAXBElement<TAz> createAntModeVertBwMin(TAz value) {
    return new JAXBElement<>(_AntModeVertBwMin_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCRD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RotationDirection", scope = AntMode.class)
  public JAXBElement<TListCRD> createAntModeRotationDirection(TListCRD value) {
    return new JAXBElement<>(_AntModeRotationDirection_QNAME, TListCRD.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MotionType", scope = AntMode.class)
  public JAXBElement<TS25> createAntModeMotionType(TS25 value) {
    return new JAXBElement<>(_AntModeMotionType_QNAME, TS25.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzScanType", scope = AntMode.class)
  public JAXBElement<TS50> createAntModeHorzScanType(TS50 value) {
    return new JAXBElement<>(_AntModeHorzScanType_QNAME, TS50.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertScanType", scope = AntMode.class)
  public JAXBElement<TS50> createAntModeVertScanType(TS50 value) {
    return new JAXBElement<>(_AntModeVertScanType_QNAME, TS50.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PortIsolation", scope = AntMode.class)
  public JAXBElement<TdB> createAntModePortIsolation(TdB value) {
    return new JAXBElement<>(_AntModePortIsolation_QNAME, TdB.class, AntMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PolarisationAngle", scope = AntMode.class)
  public JAXBElement<TAz> createAntModePolarisationAngle(TAz value) {
    return new JAXBElement<>(_AntModePolarisationAngle_QNAME, TAz.class, AntMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Exclusive", scope = Tuning.class)
  public JAXBElement<TListCBO> createTuningExclusive(TListCBO value) {
    return new JAXBElement<>(_TuningExclusive_QNAME, TListCBO.class, Tuning.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN1 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Priority", scope = Tuning.class)
  public JAXBElement<TUN1> createTuningPriority(TUN1 value) {
    return new JAXBElement<>(_TuningPriority_QNAME, TUN1.class, Tuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AntFeedpointHeight", scope = JRFLEntryLocation.class)
  public JAXBElement<TAltitude> createJRFLEntryLocationAntFeedpointHeight(TAltitude value) {
    return new JAXBElement<>(_JRFLEntryLocationAntFeedpointHeight_QNAME, TAltitude.class, JRFLEntryLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PulseChirpFreqShift", scope = SpreadSpectrum.class)
  public JAXBElement<TFreqM> createSpreadSpectrumPulseChirpFreqShift(TFreqM value) {
    return new JAXBElement<>(_SpreadSpectrumPulseChirpFreqShift_QNAME, TFreqM.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = SpreadSpectrum.class)
  public JAXBElement<TFreqM> createSpreadSpectrumFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = SpreadSpectrum.class)
  public JAXBElement<TS50> createSpreadSpectrumType(TS50 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS50.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HopDwell", scope = SpreadSpectrum.class)
  public JAXBElement<Tmicrosecs> createSpreadSpectrumHopDwell(Tmicrosecs value) {
    return new JAXBElement<>(_SpreadSpectrumHopDwell_QNAME, Tmicrosecs.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CodeRate", scope = SpreadSpectrum.class)
  public JAXBElement<TUN10_3> createSpreadSpectrumCodeRate(TUN10_3 value) {
    return new JAXBElement<>(_SpreadSpectrumCodeRate_QNAME, TUN10_3.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN9_6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PulseChirpRate", scope = SpreadSpectrum.class)
  public JAXBElement<TUN9_6> createSpreadSpectrumPulseChirpRate(TUN9_6 value) {
    return new JAXBElement<>(_SpreadSpectrumPulseChirpRate_QNAME, TUN9_6.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PulseChirpDurationMin", scope = SpreadSpectrum.class)
  public JAXBElement<Tmicrosecs> createSpreadSpectrumPulseChirpDurationMin(Tmicrosecs value) {
    return new JAXBElement<>(_SpreadSpectrumPulseChirpDurationMin_QNAME, Tmicrosecs.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TimeHopNumSlots", scope = SpreadSpectrum.class)
  public JAXBElement<TUN5> createSpreadSpectrumTimeHopNumSlots(TUN5 value) {
    return new JAXBElement<>(_SpreadSpectrumTimeHopNumSlots_QNAME, TUN5.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TimeHopPulsesPerDwell", scope = SpreadSpectrum.class)
  public JAXBElement<TUN12> createSpreadSpectrumTimeHopPulsesPerDwell(TUN12 value) {
    return new JAXBElement<>(_SpreadSpectrumTimeHopPulsesPerDwell_QNAME, TUN12.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqBlocking", scope = SpreadSpectrum.class)
  public JAXBElement<TListCBO> createSpreadSpectrumFreqBlocking(TListCBO value) {
    return new JAXBElement<>(_SpreadSpectrumFreqBlocking_QNAME, TListCBO.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMChips }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ChipRate", scope = SpreadSpectrum.class)
  public JAXBElement<TMChips> createSpreadSpectrumChipRate(TMChips value) {
    return new JAXBElement<>(_SpreadSpectrumChipRate_QNAME, TMChips.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InfoDataRate", scope = SpreadSpectrum.class)
  public JAXBElement<TUN10_3> createSpreadSpectrumInfoDataRate(TUN10_3 value) {
    return new JAXBElement<>(_SpreadSpectrumInfoDataRate_QNAME, TUN10_3.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumFreqsPerHopset", scope = SpreadSpectrum.class)
  public JAXBElement<TUN4> createSpreadSpectrumNumFreqsPerHopset(TUN4 value) {
    return new JAXBElement<>(_SpreadSpectrumNumFreqsPerHopset_QNAME, TUN4.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Thops }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HopRate", scope = SpreadSpectrum.class)
  public JAXBElement<Thops> createSpreadSpectrumHopRate(Thops value) {
    return new JAXBElement<>(_SpreadSpectrumHopRate_QNAME, Thops.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumHopsets", scope = SpreadSpectrum.class)
  public JAXBElement<TUN4> createSpreadSpectrumNumHopsets(TUN4 value) {
    return new JAXBElement<>(_SpreadSpectrumNumHopsets_QNAME, TUN4.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PulseFreqDev", scope = SpreadSpectrum.class)
  public JAXBElement<TFreqM> createSpreadSpectrumPulseFreqDev(TFreqM value) {
    return new JAXBElement<>(_SpreadSpectrumPulseFreqDev_QNAME, TFreqM.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxGain", scope = SpreadSpectrum.class)
  public JAXBElement<TdB> createSpreadSpectrumMaxGain(TdB value) {
    return new JAXBElement<>(_SpreadSpectrumMaxGain_QNAME, TdB.class, SpreadSpectrum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = TrunkingAssignment.class)
  public JAXBElement<TFreqM> createTrunkingAssignmentFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, TrunkingAssignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencySerialNum", scope = TrunkingAssignment.class)
  public JAXBElement<TS12> createTrunkingAssignmentAgencySerialNum(TS12 value) {
    return new JAXBElement<>(_TrunkingAssignmentAgencySerialNum_QNAME, TS12.class, TrunkingAssignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMin", scope = TrunkingAssignment.class)
  public JAXBElement<TFreqM> createTrunkingAssignmentFreqMin(TFreqM value) {
    return new JAXBElement<>(_TrunkingAssignmentFreqMin_QNAME, TFreqM.class, TrunkingAssignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RelinquishmentDate", scope = TrunkingAssignment.class)
  public JAXBElement<TD> createTrunkingAssignmentRelinquishmentDate(TD value) {
    return new JAXBElement<>(_TrunkingAssignmentRelinquishmentDate_QNAME, TD.class, TrunkingAssignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = JRFLEntry.class)
  public JAXBElement<TFreqM> createJRFLEntryFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfMonth", scope = JRFLEntry.class)
  public JAXBElement<TDaysOfMonth> createJRFLEntryDaysOfMonth(TDaysOfMonth value) {
    return new JAXBElement<>(_JRFLEntryDaysOfMonth_QNAME, TDaysOfMonth.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AsgnAllotRef", scope = JRFLEntry.class)
  public JAXBElement<TSerial> createJRFLEntryAsgnAllotRef(TSerial value) {
    return new JAXBElement<>(_JRFLEntryAsgnAllotRef_QNAME, TSerial.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link THours }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Hours", scope = JRFLEntry.class)
  public JAXBElement<THours> createJRFLEntryHours(THours value) {
    return new JAXBElement<>(_JRFLEntryHours_QNAME, THours.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAU }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqUse", scope = JRFLEntry.class)
  public JAXBElement<TListCAU> createJRFLEntryFreqUse(TListCAU value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqUse_QNAME, TListCAU.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfWeek", scope = JRFLEntry.class)
  public JAXBElement<TDaysOfWeek> createJRFLEntryDaysOfWeek(TDaysOfWeek value) {
    return new JAXBElement<>(_JRFLEntryDaysOfWeek_QNAME, TDaysOfWeek.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TYears }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Years", scope = JRFLEntry.class)
  public JAXBElement<TYears> createJRFLEntryYears(TYears value) {
    return new JAXBElement<>(_JRFLEntryYears_QNAME, TYears.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUS2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Priority", scope = JRFLEntry.class)
  public JAXBElement<TUS2> createJRFLEntryPriority(TUS2 value) {
    return new JAXBElement<>(_TuningPriority_QNAME, TUS2.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ApprovalLevel", scope = JRFLEntry.class)
  public JAXBElement<TS10> createJRFLEntryApprovalLevel(TS10 value) {
    return new JAXBElement<>(_JRFLEntryApprovalLevel_QNAME, TS10.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMonths }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Months", scope = JRFLEntry.class)
  public JAXBElement<TMonths> createJRFLEntryMonths(TMonths value) {
    return new JAXBElement<>(_JRFLEntryMonths_QNAME, TMonths.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Duration", scope = JRFLEntry.class)
  public JAXBElement<TUN4> createJRFLEntryDuration(TUN4 value) {
    return new JAXBElement<>(_JRFLEntryDuration_QNAME, TUN4.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Seconds", scope = JRFLEntry.class)
  public JAXBElement<TMinSec> createJRFLEntrySeconds(TMinSec value) {
    return new JAXBElement<>(_JRFLEntrySeconds_QNAME, TMinSec.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Minutes", scope = JRFLEntry.class)
  public JAXBElement<TMinSec> createJRFLEntryMinutes(TMinSec value) {
    return new JAXBElement<>(_JRFLEntryMinutes_QNAME, TMinSec.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Bandwidth", scope = JRFLEntry.class)
  public JAXBElement<TFreqM> createJRFLEntryBandwidth(TFreqM value) {
    return new JAXBElement<>(_JRFLEntryBandwidth_QNAME, TFreqM.class, JRFLEntry.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ConfigID", scope = DiagramLine.class)
  public JAXBElement<TS100> createDiagramLineConfigID(TS100 value) {
    return new JAXBElement<>(_DiagramLineConfigID_QNAME, TS100.class, DiagramLine.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Status", scope = Deployment.class)
  public JAXBElement<TS10> createDeploymentStatus(TS10 value) {
    return new JAXBElement<>(_DeploymentStatus_QNAME, TS10.class, Deployment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = Nomenclature.class)
  public JAXBElement<TS25> createNomenclatureType(TS25 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS25.class, Nomenclature.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Level", scope = Nomenclature.class)
  public JAXBElement<TS25> createNomenclatureLevel(TS25 value) {
    return new JAXBElement<>(_NomenclatureLevel_QNAME, TS25.class, Nomenclature.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AssignmentRef", scope = PairedFreq.class)
  public JAXBElement<TSerial> createPairedFreqAssignmentRef(TSerial value) {
    return new JAXBElement<>(_PairedFreqAssignmentRef_QNAME, TSerial.class, PairedFreq.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PairedType", scope = PairedFreq.class)
  public JAXBElement<TS20> createPairedFreqPairedType(TS20 value) {
    return new JAXBElement<>(_PairedFreqPairedType_QNAME, TS20.class, PairedFreq.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PairedASN", scope = PairedFreq.class)
  public JAXBElement<TUS12> createPairedFreqPairedASN(TUS12 value) {
    return new JAXBElement<>(_PairedFreqPairedASN_QNAME, TUS12.class, PairedFreq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ServiceVolumeLocRef", scope = StationLoc.class)
  public JAXBElement<TSerial> createStationLocServiceVolumeLocRef(TSerial value) {
    return new JAXBElement<>(_StationLocServiceVolumeLocRef_QNAME, TSerial.class, StationLoc.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ServiceVolumeHeight", scope = StationLoc.class)
  public JAXBElement<TAltitude> createStationLocServiceVolumeHeight(TAltitude value) {
    return new JAXBElement<>(_StationLocServiceVolumeHeight_QNAME, TAltitude.class, StationLoc.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocSatRef", scope = StationLoc.class)
  public JAXBElement<TSerial> createStationLocLocSatRef(TSerial value) {
    return new JAXBElement<>(_StationLocLocSatRef_QNAME, TSerial.class, StationLoc.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocationExcluded", scope = StationLoc.class)
  public JAXBElement<TListCBO> createStationLocLocationExcluded(TListCBO value) {
    return new JAXBElement<>(_StationLocLocationExcluded_QNAME, TListCBO.class, StationLoc.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDistance }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ServiceVolumeRadius", scope = StationLoc.class)
  public JAXBElement<TDistance> createStationLocServiceVolumeRadius(TDistance value) {
    return new JAXBElement<>(_StationLocServiceVolumeRadius_QNAME, TDistance.class, StationLoc.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDistance }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocationRadius", scope = StationLoc.class)
  public JAXBElement<TDistance> createStationLocLocationRadius(TDistance value) {
    return new JAXBElement<>(_StationLocLocationRadius_QNAME, TDistance.class, StationLoc.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = Code.class)
  public JAXBElement<TS255> createCodeDescription(TS255 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS255.class, Code.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RadioService", scope = Usage.class)
  public JAXBElement<TS100> createUsageRadioService(TS100 value) {
    return new JAXBElement<>(_UsageRadioService_QNAME, TS100.class, Usage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EqpFnct", scope = Usage.class)
  public JAXBElement<TS50> createUsageEqpFnct(TS50 value) {
    return new JAXBElement<>(_UsageEqpFnct_QNAME, TS50.class, Usage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StnClass", scope = Usage.class)
  public JAXBElement<TS5> createUsageStnClass(TS5 value) {
    return new JAXBElement<>(_UsageStnClass_QNAME, TS5.class, Usage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS60 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PreselectionType", scope = Receiver.class)
  public JAXBElement<TS60> createReceiverPreselectionType(TS60 value) {
    return new JAXBElement<>(_ReceiverPreselectionType_QNAME, TS60.class, Receiver.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TSPR", scope = Receiver.class)
  public JAXBElement<TS10> createReceiverTSPR(TS10 value) {
    return new JAXBElement<>(_ReceiverTSPR_QNAME, TS10.class, Receiver.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_DBm }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ConductedEmissions", scope = Receiver.class)
  public JAXBElement<TUS_DBm> createReceiverConductedEmissions(TUS_DBm value) {
    return new JAXBElement<>(_ReceiverConductedEmissions_QNAME, TUS_DBm.class, Receiver.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FCCAcceptanceNum", scope = Receiver.class)
  public JAXBElement<TS50> createReceiverFCCAcceptanceNum(TS50 value) {
    return new JAXBElement<>(_ReceiverFCCAcceptanceNum_QNAME, TS50.class, Receiver.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DuplexSepType", scope = Receiver.class)
  public JAXBElement<TS10> createReceiverDuplexSepType(TS10 value) {
    return new JAXBElement<>(_ReceiverDuplexSepType_QNAME, TS10.class, Receiver.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzSidelobeAttenuation", scope = Antenna.class)
  public JAXBElement<TUN5_2> createAntennaHorzSidelobeAttenuation(TUN5_2 value) {
    return new JAXBElement<>(_AntennaHorzSidelobeAttenuation_QNAME, TUN5_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertSidelobeSuppressed", scope = Antenna.class)
  public JAXBElement<TListCBO> createAntennaVertSidelobeSuppressed(TListCBO value) {
    return new JAXBElement<>(_AntennaVertSidelobeSuppressed_QNAME, TListCBO.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TElev180 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertSidelobeElev", scope = Antenna.class)
  public JAXBElement<TElev180> createAntennaVertSidelobeElev(TElev180 value) {
    return new JAXBElement<>(_AntennaVertSidelobeElev_QNAME, TElev180.class, Antenna.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PhArrayNumElements", scope = Antenna.class)
  public JAXBElement<TUN5> createAntennaPhArrayNumElements(TUN5 value) {
    return new JAXBElement<>(_AntennaPhArrayNumElements_QNAME, TUN5.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzAperture", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaHorzAperture(TUN6_2 value) {
    return new JAXBElement<>(_AntennaHorzAperture_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PhArrayNumMainBeams", scope = Antenna.class)
  public JAXBElement<TUN3> createAntennaPhArrayNumMainBeams(TUN3 value) {
    return new JAXBElement<>(_AntennaPhArrayNumMainBeams_QNAME, TUN3.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzDimension", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaHorzDimension(TUN6_2 value) {
    return new JAXBElement<>(_AntennaHorzDimension_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertAperture", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaVertAperture(TUN6_2 value) {
    return new JAXBElement<>(_AntennaVertAperture_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Diameter", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaDiameter(TUN6_2 value) {
    return new JAXBElement<>(_AntennaDiameter_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Shape", scope = Antenna.class)
  public JAXBElement<TS25> createAntennaShape(TS25 value) {
    return new JAXBElement<>(_AntennaShape_QNAME, TS25.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ApertureDiameter", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaApertureDiameter(TUN6_2 value) {
    return new JAXBElement<>(_AntennaApertureDiameter_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzSidelobeSuppressed", scope = Antenna.class)
  public JAXBElement<TListCBO> createAntennaHorzSidelobeSuppressed(TListCBO value) {
    return new JAXBElement<>(_AntennaHorzSidelobeSuppressed_QNAME, TListCBO.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAz180 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HorzSidelobeAz", scope = Antenna.class)
  public JAXBElement<TAz180> createAntennaHorzSidelobeAz(TAz180 value) {
    return new JAXBElement<>(_AntennaHorzSidelobeAz_QNAME, TAz180.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertSidelobeAttenuation", scope = Antenna.class)
  public JAXBElement<TUN5_2> createAntennaVertSidelobeAttenuation(TUN5_2 value) {
    return new JAXBElement<>(_AntennaVertSidelobeAttenuation_QNAME, TUN5_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VertDimension", scope = Antenna.class)
  public JAXBElement<TUN6_2> createAntennaVertDimension(TUN6_2 value) {
    return new JAXBElement<>(_AntennaVertDimension_QNAME, TUN6_2.class, Antenna.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NBFreq", scope = NarrowBandPlanning.class)
  public JAXBElement<TFreqM> createNarrowBandPlanningNBFreq(TFreqM value) {
    return new JAXBElement<>(_NarrowBandPlanningNBFreq_QNAME, TFreqM.class, NarrowBandPlanning.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ChangeDate", scope = NarrowBandPlanning.class)
  public JAXBElement<TD> createNarrowBandPlanningChangeDate(TD value) {
    return new JAXBElement<>(_NarrowBandPlanningChangeDate_QNAME, TD.class, NarrowBandPlanning.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Street", scope = Address.class)
  public JAXBElement<TS255> createAddressStreet(TS255 value) {
    return new JAXBElement<>(_AddressStreet_QNAME, TS255.class, Address.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = Address.class)
  public JAXBElement<TS100> createAddressDescription(TS100 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS100.class, Address.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PostCode", scope = Address.class)
  public JAXBElement<TS15> createAddressPostCode(TS15 value) {
    return new JAXBElement<>(_AddressPostCode_QNAME, TS15.class, Address.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CityArea", scope = Address.class)
  public JAXBElement<TS50> createAddressCityArea(TS50 value) {
    return new JAXBElement<>(_AddressCityArea_QNAME, TS50.class, Address.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StateCounty", scope = Address.class)
  public JAXBElement<TS50> createAddressStateCounty(TS50 value) {
    return new JAXBElement<>(_AddressStateCounty_QNAME, TS50.class, Address.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CouplingLoss", scope = RxAntModeRef.class)
  public JAXBElement<TdB> createRxAntModeRefCouplingLoss(TdB value) {
    return new JAXBElement<>(_RxAntModeRefCouplingLoss_QNAME, TdB.class, RxAntModeRef.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModeID", scope = RxAntModeRef.class)
  public JAXBElement<TS20> createRxAntModeRefModeID(TS20 value) {
    return new JAXBElement<>(_RxAntModeRefModeID_QNAME, TS20.class, RxAntModeRef.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS18 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description ", scope = AsgnAllotOwner.class)
  public JAXBElement<TS18> createAsgnAllotOwnerDescription_0020(TS18 value) {
    return new JAXBElement<>(_AsgnAllotOwnerDescription_0020_QNAME, TS18.class, AsgnAllotOwner.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OriginalAssignmentDate", scope = Assignment.class)
  public JAXBElement<TD> createAssignmentOriginalAssignmentDate(TD value) {
    return new JAXBElement<>(_AssignmentOriginalAssignmentDate_QNAME, TD.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FrequencyActionOfficer", scope = Assignment.class)
  public JAXBElement<TS3> createAssignmentFrequencyActionOfficer(TS3 value) {
    return new JAXBElement<>(_AssignmentFrequencyActionOfficer_QNAME, TS3.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DateResponseRequired", scope = Assignment.class)
  public JAXBElement<TD> createAssignmentDateResponseRequired(TD value) {
    return new JAXBElement<>(_AssignmentDateResponseRequired_QNAME, TD.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TypeOfService", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentTypeOfService(TS50 value) {
    return new JAXBElement<>(_AssignmentTypeOfService_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link THours }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Hours", scope = Assignment.class)
  public JAXBElement<THours> createAssignmentHours(THours value) {
    return new JAXBElement<>(_JRFLEntryHours_QNAME, THours.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TYears }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Years", scope = Assignment.class)
  public JAXBElement<TYears> createAssignmentYears(TYears value) {
    return new JAXBElement<>(_JRFLEntryYears_QNAME, TYears.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ControlRequestNum", scope = Assignment.class)
  public JAXBElement<TS15> createAssignmentControlRequestNum(TS15 value) {
    return new JAXBElement<>(_AssignmentControlRequestNum_QNAME, TS15.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsageType", scope = Assignment.class)
  public JAXBElement<TS25> createAssignmentUsageType(TS25 value) {
    return new JAXBElement<>(_AssignmentUsageType_QNAME, TS25.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsageFrequency", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentUsageFrequency(TS50 value) {
    return new JAXBElement<>(_AssignmentUsageFrequency_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SupplementaryDetails", scope = Assignment.class)
  public JAXBElement<TMEMO> createAssignmentSupplementaryDetails(TMEMO value) {
    return new JAXBElement<>(_AssignmentSupplementaryDetails_QNAME, TMEMO.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Title", scope = Assignment.class)
  public JAXBElement<TS100> createAssignmentTitle(TS100 value) {
    return new JAXBElement<>(_AssignmentTitle_QNAME, TS100.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UserNetCode", scope = Assignment.class)
  public JAXBElement<TS6> createAssignmentUserNetCode(TS6 value) {
    return new JAXBElement<>(_AssignmentUserNetCode_QNAME, TS6.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Processing", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentProcessing(TS50 value) {
    return new JAXBElement<>(_AssignmentProcessing_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RoutineAgendaItem", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentRoutineAgendaItem(TS50 value) {
    return new JAXBElement<>(_AssignmentRoutineAgendaItem_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencyActionNum", scope = Assignment.class)
  public JAXBElement<TS12> createAssignmentAgencyActionNum(TS12 value) {
    return new JAXBElement<>(_AssignmentAgencyActionNum_QNAME, TS12.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AssignmentAuthority", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentAssignmentAuthority(TS50 value) {
    return new JAXBElement<>(_AssignmentAssignmentAuthority_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumSystems", scope = Assignment.class)
  public JAXBElement<TUN9> createAssignmentNumSystems(TUN9 value) {
    return new JAXBElement<>(_AssignmentNumSystems_QNAME, TUN9.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Minutes", scope = Assignment.class)
  public JAXBElement<TMinSec> createAssignmentMinutes(TMinSec value) {
    return new JAXBElement<>(_JRFLEntryMinutes_QNAME, TMinSec.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Period", scope = Assignment.class)
  public JAXBElement<TS50> createAssignmentPeriod(TS50 value) {
    return new JAXBElement<>(_AssignmentPeriod_QNAME, TS50.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NATOPooledFrequencyNum", scope = Assignment.class)
  public JAXBElement<TUN4> createAssignmentNATOPooledFrequencyNum(TUN4 value) {
    return new JAXBElement<>(_AssignmentNATOPooledFrequencyNum_QNAME, TUN4.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AssignmentDate", scope = Assignment.class)
  public JAXBElement<TD> createAssignmentAssignmentDate(TD value) {
    return new JAXBElement<>(_AssignmentAssignmentDate_QNAME, TD.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfMonth", scope = Assignment.class)
  public JAXBElement<TDaysOfMonth> createAssignmentDaysOfMonth(TDaysOfMonth value) {
    return new JAXBElement<>(_JRFLEntryDaysOfMonth_QNAME, TDaysOfMonth.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NATOPooledFrequencyCode", scope = Assignment.class)
  public JAXBElement<TS25> createAssignmentNATOPooledFrequencyCode(TS25 value) {
    return new JAXBElement<>(_AssignmentNATOPooledFrequencyCode_QNAME, TS25.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_Percent }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsagePercentage", scope = Assignment.class)
  public JAXBElement<TUS_Percent> createAssignmentUsagePercentage(TUS_Percent value) {
    return new JAXBElement<>(_AssignmentUsagePercentage_QNAME, TUS_Percent.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ListSerialNum", scope = Assignment.class)
  public JAXBElement<TS12> createAssignmentListSerialNum(TS12 value) {
    return new JAXBElement<>(_AssignmentListSerialNum_QNAME, TS12.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfWeek", scope = Assignment.class)
  public JAXBElement<TDaysOfWeek> createAssignmentDaysOfWeek(TDaysOfWeek value) {
    return new JAXBElement<>(_JRFLEntryDaysOfWeek_QNAME, TDaysOfWeek.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencyComments", scope = Assignment.class)
  public JAXBElement<TMEMO> createAssignmentAgencyComments(TMEMO value) {
    return new JAXBElement<>(_AssignmentAgencyComments_QNAME, TMEMO.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CoordinationComments", scope = Assignment.class)
  public JAXBElement<TMEMO> createAssignmentCoordinationComments(TMEMO value) {
    return new JAXBElement<>(_AssignmentCoordinationComments_QNAME, TMEMO.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS60 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DataSource", scope = Assignment.class)
  public JAXBElement<TS60> createAssignmentDataSource(TS60 value) {
    return new JAXBElement<>(_AssignmentDataSource_QNAME, TS60.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TDT }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDateTime", scope = Assignment.class)
  public JAXBElement<TDT> createAssignmentExpirationDateTime(TDT value) {
    return new JAXBElement<>(_AssignmentExpirationDateTime_QNAME, TDT.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS8 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "COCOMGroup", scope = Assignment.class)
  public JAXBElement<TS8> createAssignmentCOCOMGroup(TS8 value) {
    return new JAXBElement<>(_AssignmentCOCOMGroup_QNAME, TS8.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS14 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FMSCNum", scope = Assignment.class)
  public JAXBElement<TS14> createAssignmentFMSCNum(TS14 value) {
    return new JAXBElement<>(_AssignmentFMSCNum_QNAME, TS14.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Emergency", scope = Assignment.class)
  public JAXBElement<TListCBO> createAssignmentEmergency(TListCBO value) {
    return new JAXBElement<>(_AssignmentEmergency_QNAME, TListCBO.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencySerialNum", scope = Assignment.class)
  public JAXBElement<TS12> createAssignmentAgencySerialNum(TS12 value) {
    return new JAXBElement<>(_TrunkingAssignmentAgencySerialNum_QNAME, TS12.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Requirement", scope = Assignment.class)
  public JAXBElement<TMEMO> createAssignmentRequirement(TMEMO value) {
    return new JAXBElement<>(_AssignmentRequirement_QNAME, TMEMO.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS150 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsageCode", scope = Assignment.class)
  public JAXBElement<TS150> createAssignmentUsageCode(TS150 value) {
    return new JAXBElement<>(_AssignmentUsageCode_QNAME, TS150.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMonths }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Months", scope = Assignment.class)
  public JAXBElement<TMonths> createAssignmentMonths(TMonths value) {
    return new JAXBElement<>(_JRFLEntryMonths_QNAME, TMonths.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Duration", scope = Assignment.class)
  public JAXBElement<TUN4> createAssignmentDuration(TUN4 value) {
    return new JAXBElement<>(_JRFLEntryDuration_QNAME, TUN4.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Seconds", scope = Assignment.class)
  public JAXBElement<TMinSec> createAssignmentSeconds(TMinSec value) {
    return new JAXBElement<>(_JRFLEntrySeconds_QNAME, TMinSec.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Assignment.class)
  public JAXBElement<TD> createAssignmentReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Assignment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS22 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FCCFileNum", scope = Assignment.class)
  public JAXBElement<TS22> createAssignmentFCCFileNum(TS22 value) {
    return new JAXBElement<>(_AssignmentFCCFileNum_QNAME, TS22.class, Assignment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSpeed }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Speed", scope = AtWaypoint.class)
  public JAXBElement<TSpeed> createAtWaypointSpeed(TSpeed value) {
    return new JAXBElement<>(_AtWaypointSpeed_QNAME, TSpeed.class, AtWaypoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CmdLevel", scope = ForceElement.class)
  public JAXBElement<TS50> createForceElementCmdLevel(TS50 value) {
    return new JAXBElement<>(_ForceElementCmdLevel_QNAME, TS50.class, ForceElement.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OwningOrganisation", scope = ForceElement.class)
  public JAXBElement<TSerial> createForceElementOwningOrganisation(TSerial value) {
    return new JAXBElement<>(_ForceElementOwningOrganisation_QNAME, TSerial.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UIC", scope = ForceElement.class)
  public JAXBElement<TS20> createForceElementUIC(TS20 value) {
    return new JAXBElement<>(_ForceElementUIC_QNAME, TS20.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Role", scope = ForceElement.class)
  public JAXBElement<TS50> createForceElementRole(TS50 value) {
    return new JAXBElement<>(_ForceElementRole_QNAME, TS50.class, ForceElement.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OwningCountry", scope = ForceElement.class)
  public JAXBElement<TListCAO> createForceElementOwningCountry(TListCAO value) {
    return new JAXBElement<>(_ForceElementOwningCountry_QNAME, TListCAO.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = ForceElement.class)
  public JAXBElement<TD> createForceElementReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MissionCode", scope = ForceElement.class)
  public JAXBElement<TS50> createForceElementMissionCode(TS50 value) {
    return new JAXBElement<>(_ForceElementMissionCode_QNAME, TS50.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Platform", scope = ForceElement.class)
  public JAXBElement<TS50> createForceElementPlatform(TS50 value) {
    return new JAXBElement<>(_ForceElementPlatform_QNAME, TS50.class, ForceElement.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Name", scope = EarthStation.class)
  public JAXBElement<TS50> createEarthStationName(TS50 value) {
    return new JAXBElement<>(_EarthStationName_QNAME, TS50.class, EarthStation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocationRef", scope = EarthStation.class)
  public JAXBElement<TSerial> createEarthStationLocationRef(TSerial value) {
    return new JAXBElement<>(_EarthStationLocationRef_QNAME, TSerial.class, EarthStation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = EarthStation.class)
  public JAXBElement<TS10> createEarthStationType(TS10 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS10.class, EarthStation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMax", scope = Ellipse.class)
  public JAXBElement<TAltitude> createEllipseAltitudeMax(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMax_QNAME, TAltitude.class, Ellipse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMin", scope = Ellipse.class)
  public JAXBElement<TAltitude> createEllipseAltitudeMin(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMin_QNAME, TAltitude.class, Ellipse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Excluded", scope = Ellipse.class)
  public JAXBElement<TListCBO> createEllipseExcluded(TListCBO value) {
    return new JAXBElement<>(_EllipseExcluded_QNAME, TListCBO.class, Ellipse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Source", scope = CommentSource.class)
  public JAXBElement<TS100> createCommentSourceSource(TS100 value) {
    return new JAXBElement<>(_CommentSourceSource_QNAME, TS100.class, CommentSource.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Date", scope = CommentSource.class)
  public JAXBElement<TD> createCommentSourceDate(TD value) {
    return new JAXBElement<>(_CommentSourceDate_QNAME, TD.class, CommentSource.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Author", scope = CommentSource.class)
  public JAXBElement<TS100> createCommentSourceAuthor(TS100 value) {
    return new JAXBElement<>(_CommentSourceAuthor_QNAME, TS100.class, CommentSource.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "JobTitle", scope = CommentSource.class)
  public JAXBElement<TS100> createCommentSourceJobTitle(TS100 value) {
    return new JAXBElement<>(_CommentSourceJobTitle_QNAME, TS100.class, CommentSource.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = EMail.class)
  public JAXBElement<TS20> createEMailType(TS20 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS20.class, EMail.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCCL }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxCls", scope = EMail.class)
  public JAXBElement<TListCCL> createEMailMaxCls(TListCCL value) {
    return new JAXBElement<>(_EMailMaxCls_QNAME, TListCCL.class, EMail.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Preferred", scope = EMail.class)
  public JAXBElement<TListCBO> createEMailPreferred(TListCBO value) {
    return new JAXBElement<>(_EMailPreferred_QNAME, TListCBO.class, EMail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = TOA.class)
  public JAXBElement<TD> createTOAEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, TOA.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Title", scope = TOA.class)
  public JAXBElement<TS100> createTOATitle(TS100 value) {
    return new JAXBElement<>(_AssignmentTitle_QNAME, TS100.class, TOA.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = TOA.class)
  public JAXBElement<TD> createTOAExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, TOA.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Street", scope = Location.class)
  public JAXBElement<TS255> createLocationStreet(TS255 value) {
    return new JAXBElement<>(_AddressStreet_QNAME, TS255.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PostCode", scope = Location.class)
  public JAXBElement<TS15> createLocationPostCode(TS15 value) {
    return new JAXBElement<>(_AddressPostCode_QNAME, TS15.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Location.class)
  public JAXBElement<TD> createLocationEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Location.class)
  public JAXBElement<TD> createLocationReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CityArea", scope = Location.class)
  public JAXBElement<TS50> createLocationCityArea(TS50 value) {
    return new JAXBElement<>(_AddressCityArea_QNAME, TS50.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StateCounty", scope = Location.class)
  public JAXBElement<TS50> createLocationStateCounty(TS50 value) {
    return new JAXBElement<>(_AddressStateCounty_QNAME, TS50.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Location.class)
  public JAXBElement<TD> createLocationExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Location.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Name", scope = Organisation.class)
  public JAXBElement<TS100> createOrganisationName(TS100 value) {
    return new JAXBElement<>(_EarthStationName_QNAME, TS100.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = Organisation.class)
  public JAXBElement<TS25> createOrganisationType(TS25 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS25.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AlternateName", scope = Organisation.class)
  public JAXBElement<TS100> createOrganisationAlternateName(TS100 value) {
    return new JAXBElement<>(_OrganisationAlternateName_QNAME, TS100.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UIC", scope = Organisation.class)
  public JAXBElement<TS20> createOrganisationUIC(TS20 value) {
    return new JAXBElement<>(_ForceElementUIC_QNAME, TS20.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Organisation.class)
  public JAXBElement<TD> createOrganisationEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Organisation.class)
  public JAXBElement<TD> createOrganisationReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Organisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Organisation.class)
  public JAXBElement<TD> createOrganisationExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Organisation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NecessaryBw", scope = Emission.class)
  public JAXBElement<TFreqM> createEmissionNecessaryBw(TFreqM value) {
    return new JAXBElement<>(_EmissionNecessaryBw_QNAME, TFreqM.class, Emission.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Power", scope = Emission.class)
  public JAXBElement<TdBW> createEmissionPower(TdBW value) {
    return new JAXBElement<>(_EmissionPower_QNAME, TdBW.class, Emission.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EmsClass", scope = Emission.class)
  public JAXBElement<TEmsDes> createEmissionEmsClass(TEmsDes value) {
    return new JAXBElement<>(_EmissionEmsClass_QNAME, TEmsDes.class, Emission.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = TelephoneFax.class)
  public JAXBElement<TS20> createTelephoneFaxType(TS20 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS20.class, TelephoneFax.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Fax", scope = TelephoneFax.class)
  public JAXBElement<TListCBO> createTelephoneFaxFax(TListCBO value) {
    return new JAXBElement<>(_TelephoneFaxFax_QNAME, TListCBO.class, TelephoneFax.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCCL }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxCls", scope = TelephoneFax.class)
  public JAXBElement<TListCCL> createTelephoneFaxMaxCls(TListCCL value) {
    return new JAXBElement<>(_EMailMaxCls_QNAME, TListCCL.class, TelephoneFax.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Preferred", scope = TelephoneFax.class)
  public JAXBElement<TListCBO> createTelephoneFaxPreferred(TListCBO value) {
    return new JAXBElement<>(_EMailPreferred_QNAME, TListCBO.class, TelephoneFax.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LaunchDate", scope = Satellite.class)
  public JAXBElement<TD> createSatelliteLaunchDate(TD value) {
    return new JAXBElement<>(_SatelliteLaunchDate_QNAME, TD.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NetworkName", scope = Satellite.class)
  public JAXBElement<TS50> createSatelliteNetworkName(TS50 value) {
    return new JAXBElement<>(_SatelliteNetworkName_QNAME, TS50.class, Satellite.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDistance }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NonGeoPerigee", scope = Satellite.class)
  public JAXBElement<TDistance> createSatelliteNonGeoPerigee(TDistance value) {
    return new JAXBElement<>(_SatelliteNonGeoPerigee_QNAME, TDistance.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NonGeoInclination", scope = Satellite.class)
  public JAXBElement<TElev> createSatelliteNonGeoInclination(TElev value) {
    return new JAXBElement<>(_SatelliteNonGeoInclination_QNAME, TElev.class, Satellite.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LaunchLocRef", scope = Satellite.class)
  public JAXBElement<TSerial> createSatelliteLaunchLocRef(TSerial value) {
    return new JAXBElement<>(_SatelliteLaunchLocRef_QNAME, TSerial.class, Satellite.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDistance }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NonGeoApogee", scope = Satellite.class)
  public JAXBElement<TDistance> createSatelliteNonGeoApogee(TDistance value) {
    return new JAXBElement<>(_SatelliteNonGeoApogee_QNAME, TDistance.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CallSign", scope = Satellite.class)
  public JAXBElement<TS20> createSatelliteCallSign(TS20 value) {
    return new JAXBElement<>(_SatelliteCallSign_QNAME, TS20.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LaunchStatus", scope = Satellite.class)
  public JAXBElement<TS25> createSatelliteLaunchStatus(TS25 value) {
    return new JAXBElement<>(_SatelliteLaunchStatus_QNAME, TS25.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Administration", scope = Satellite.class)
  public JAXBElement<TS100> createSatelliteAdministration(TS100 value) {
    return new JAXBElement<>(_SatelliteAdministration_QNAME, TS100.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLon }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GeoNominalLon", scope = Satellite.class)
  public JAXBElement<TLon> createSatelliteGeoNominalLon(TLon value) {
    return new JAXBElement<>(_SatelliteGeoNominalLon_QNAME, TLon.class, Satellite.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDistance }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GeoAltitude", scope = Satellite.class)
  public JAXBElement<TDistance> createSatelliteGeoAltitude(TDistance value) {
    return new JAXBElement<>(_SatelliteGeoAltitude_QNAME, TDistance.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ObjectNum", scope = Satellite.class)
  public JAXBElement<TS20> createSatelliteObjectNum(TS20 value) {
    return new JAXBElement<>(_SatelliteObjectNum_QNAME, TS20.class, Satellite.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tminutes }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NonGeoPeriod", scope = Satellite.class)
  public JAXBElement<Tminutes> createSatelliteNonGeoPeriod(Tminutes value) {
    return new JAXBElement<>(_SatelliteNonGeoPeriod_QNAME, Tminutes.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NonGeoNumSatellites", scope = Satellite.class)
  public JAXBElement<TUN4> createSatelliteNonGeoNumSatellites(TUN4 value) {
    return new JAXBElement<>(_SatelliteNonGeoNumSatellites_QNAME, TUN4.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Satellite.class)
  public JAXBElement<TD> createSatelliteReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InternationalDesignator", scope = Satellite.class)
  public JAXBElement<TS20> createSatelliteInternationalDesignator(TS20 value) {
    return new JAXBElement<>(_SatelliteInternationalDesignator_QNAME, TS20.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OrbitType", scope = Satellite.class)
  public JAXBElement<TS25> createSatelliteOrbitType(TS25 value) {
    return new JAXBElement<>(_SatelliteOrbitType_QNAME, TS25.class, Satellite.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumEquip", scope = Stage.class)
  public JAXBElement<TUN9> createStageNumEquip(TUN9 value) {
    return new JAXBElement<>(_StageNumEquip_QNAME, TUN9.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DateApprovalRequired", scope = Stage.class)
  public JAXBElement<TD> createStageDateApprovalRequired(TD value) {
    return new JAXBElement<>(_StageDateApprovalRequired_QNAME, TD.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StartDate", scope = Stage.class)
  public JAXBElement<TD> createStageStartDate(TD value) {
    return new JAXBElement<>(_StageStartDate_QNAME, TD.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TargetDate", scope = Stage.class)
  public JAXBElement<TD> createStageTargetDate(TD value) {
    return new JAXBElement<>(_StageTargetDate_QNAME, TD.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GeoDescription", scope = Stage.class)
  public JAXBElement<TMEMO> createStageGeoDescription(TMEMO value) {
    return new JAXBElement<>(_StageGeoDescription_QNAME, TMEMO.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TerminationDate", scope = Stage.class)
  public JAXBElement<TD> createStageTerminationDate(TD value) {
    return new JAXBElement<>(_StageTerminationDate_QNAME, TD.class, Stage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerLimit", scope = TxModeRef.class)
  public JAXBElement<TdBW> createTxModeRefPowerLimit(TdBW value) {
    return new JAXBElement<>(_TxModeRefPowerLimit_QNAME, TdBW.class, TxModeRef.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Available", scope = Assets.class)
  public JAXBElement<TUN9> createAssetsAvailable(TUN9 value) {
    return new JAXBElement<>(_AssetsAvailable_QNAME, TUN9.class, Assets.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Authorised", scope = Assets.class)
  public JAXBElement<TUN9> createAssetsAuthorised(TUN9 value) {
    return new JAXBElement<>(_AssetsAuthorised_QNAME, TUN9.class, Assets.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteTransponderID", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteTransponderID(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteTransponderID_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceLocDescr", scope = IntfReport.class)
  public JAXBElement<TS255> createIntfReportSourceLocDescr(TS255 value) {
    return new JAXBElement<>(_IntfReportSourceLocDescr_QNAME, TS255.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimSystem", scope = IntfReport.class)
  public JAXBElement<TS100> createIntfReportVictimSystem(TS100 value) {
    return new JAXBElement<>(_IntfReportVictimSystem_QNAME, TS100.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteAffected", scope = IntfReport.class)
  public JAXBElement<TListCBO> createIntfReportSatelliteAffected(TListCBO value) {
    return new JAXBElement<>(_IntfReportSatelliteAffected_QNAME, TListCBO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceFreqMax", scope = IntfReport.class)
  public JAXBElement<TFreqM> createIntfReportSourceFreqMax(TFreqM value) {
    return new JAXBElement<>(_IntfReportSourceFreqMax_QNAME, TFreqM.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteUplinkFreq", scope = IntfReport.class)
  public JAXBElement<TFreqM> createIntfReportSatelliteUplinkFreq(TFreqM value) {
    return new JAXBElement<>(_IntfReportSatelliteUplinkFreq_QNAME, TFreqM.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AffectedEquipment", scope = IntfReport.class)
  public JAXBElement<TS100> createIntfReportAffectedEquipment(TS100 value) {
    return new JAXBElement<>(_IntfReportAffectedEquipment_QNAME, TS100.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntfPeriod", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportIntfPeriod(TS50 value) {
    return new JAXBElement<>(_IntfReportIntfPeriod_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PerformanceEffects", scope = IntfReport.class)
  public JAXBElement<TMEMO> createIntfReportPerformanceEffects(TMEMO value) {
    return new JAXBElement<>(_IntfReportPerformanceEffects_QNAME, TMEMO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntfDescr", scope = IntfReport.class)
  public JAXBElement<TMEMO> createIntfReportIntfDescr(TMEMO value) {
    return new JAXBElement<>(_IntfReportIntfDescr_QNAME, TMEMO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HelpRequired", scope = IntfReport.class)
  public JAXBElement<TListCBO> createIntfReportHelpRequired(TListCBO value) {
    return new JAXBElement<>(_IntfReportHelpRequired_QNAME, TListCBO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceEmsBw", scope = IntfReport.class)
  public JAXBElement<TFreqM> createIntfReportSourceEmsBw(TFreqM value) {
    return new JAXBElement<>(_IntfReportSourceEmsBw_QNAME, TFreqM.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLon }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceLon", scope = IntfReport.class)
  public JAXBElement<TLon> createIntfReportSourceLon(TLon value) {
    return new JAXBElement<>(_IntfReportSourceLon_QNAME, TLon.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimAsgnRef", scope = IntfReport.class)
  public JAXBElement<TSerial> createIntfReportVictimAsgnRef(TSerial value) {
    return new JAXBElement<>(_IntfReportVictimAsgnRef_QNAME, TSerial.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteHemisphere", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteHemisphere(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteHemisphere_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NetCircuitsAffected", scope = IntfReport.class)
  public JAXBElement<TMEMO> createIntfReportNetCircuitsAffected(TMEMO value) {
    return new JAXBElement<>(_IntfReportNetCircuitsAffected_QNAME, TMEMO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimFreqMax", scope = IntfReport.class)
  public JAXBElement<TFreqM> createIntfReportVictimFreqMax(TFreqM value) {
    return new JAXBElement<>(_IntfReportVictimFreqMax_QNAME, TFreqM.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteName", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteName(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteName_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AffectedCSA", scope = IntfReport.class)
  public JAXBElement<TS20> createIntfReportAffectedCSA(TS20 value) {
    return new JAXBElement<>(_IntfReportAffectedCSA_QNAME, TS20.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLat }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceLat", scope = IntfReport.class)
  public JAXBElement<TLat> createIntfReportSourceLat(TLat value) {
    return new JAXBElement<>(_IntfReportSourceLat_QNAME, TLat.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceEmsClass", scope = IntfReport.class)
  public JAXBElement<TEmsDes> createIntfReportSourceEmsClass(TEmsDes value) {
    return new JAXBElement<>(_IntfReportSourceEmsClass_QNAME, TEmsDes.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLat }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimLat", scope = IntfReport.class)
  public JAXBElement<TLat> createIntfReportVictimLat(TLat value) {
    return new JAXBElement<>(_IntfReportVictimLat_QNAME, TLat.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceAz", scope = IntfReport.class)
  public JAXBElement<TAz> createIntfReportSourceAz(TAz value) {
    return new JAXBElement<>(_IntfReportSourceAz_QNAME, TAz.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TDT }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntfStopDateTime", scope = IntfReport.class)
  public JAXBElement<TDT> createIntfReportIntfStopDateTime(TDT value) {
    return new JAXBElement<>(_IntfReportIntfStopDateTime_QNAME, TDT.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteDownlinkPolarisation", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteDownlinkPolarisation(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteDownlinkPolarisation_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteUplinkPolarisation", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteUplinkPolarisation(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteUplinkPolarisation_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceFreqMin", scope = IntfReport.class)
  public JAXBElement<TFreqM> createIntfReportSourceFreqMin(TFreqM value) {
    return new JAXBElement<>(_IntfReportSourceFreqMin_QNAME, TFreqM.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLon }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimLon", scope = IntfReport.class)
  public JAXBElement<TLon> createIntfReportVictimLon(TLon value) {
    return new JAXBElement<>(_IntfReportVictimLon_QNAME, TLon.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Characteristics", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportCharacteristics(TS50 value) {
    return new JAXBElement<>(_IntfReportCharacteristics_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimCountry", scope = IntfReport.class)
  public JAXBElement<TListCAO> createIntfReportVictimCountry(TListCAO value) {
    return new JAXBElement<>(_IntfReportVictimCountry_QNAME, TListCAO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NetsAffected", scope = IntfReport.class)
  public JAXBElement<TMEMO> createIntfReportNetsAffected(TMEMO value) {
    return new JAXBElement<>(_IntfReportNetsAffected_QNAME, TMEMO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Evaluation", scope = IntfReport.class)
  public JAXBElement<TS25> createIntfReportEvaluation(TS25 value) {
    return new JAXBElement<>(_IntfReportEvaluation_QNAME, TS25.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "VictimLocDescr", scope = IntfReport.class)
  public JAXBElement<TS255> createIntfReportVictimLocDescr(TS255 value) {
    return new JAXBElement<>(_IntfReportVictimLocDescr_QNAME, TS255.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SATCOMPriority", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSATCOMPriority(TS50 value) {
    return new JAXBElement<>(_IntfReportSATCOMPriority_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteChannel", scope = IntfReport.class)
  public JAXBElement<TS50> createIntfReportSatelliteChannel(TS50 value) {
    return new JAXBElement<>(_IntfReportSatelliteChannel_QNAME, TS50.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GPSAffected", scope = IntfReport.class)
  public JAXBElement<TListCBO> createIntfReportGPSAffected(TListCBO value) {
    return new JAXBElement<>(_IntfReportGPSAffected_QNAME, TListCBO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocalEventID", scope = IntfReport.class)
  public JAXBElement<TS20> createIntfReportLocalEventID(TS20 value) {
    return new JAXBElement<>(_IntfReportLocalEventID_QNAME, TS20.class, IntfReport.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN6_1 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceFieldStrength", scope = IntfReport.class)
  public JAXBElement<TUN6_1> createIntfReportSourceFieldStrength(TUN6_1 value) {
    return new JAXBElement<>(_IntfReportSourceFieldStrength_QNAME, TUN6_1.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Solution", scope = IntfReport.class)
  public JAXBElement<TMEMO> createIntfReportSolution(TMEMO value) {
    return new JAXBElement<>(_IntfReportSolution_QNAME, TMEMO.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TLon }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SatelliteLongitude", scope = IntfReport.class)
  public JAXBElement<TLon> createIntfReportSatelliteLongitude(TLon value) {
    return new JAXBElement<>(_IntfReportSatelliteLongitude_QNAME, TLon.class, IntfReport.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RetireDate", scope = Dataset.class)
  public JAXBElement<TD> createDatasetRetireDate(TD value) {
    return new JAXBElement<>(_DatasetRetireDate_QNAME, TD.class, Dataset.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Reason", scope = Dataset.class)
  public JAXBElement<TMEMO> createDatasetReason(TMEMO value) {
    return new JAXBElement<>(_DatasetReason_QNAME, TMEMO.class, Dataset.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Owner", scope = Common.class)
  public JAXBElement<TSerial> createCommonOwner(TSerial value) {
    return new JAXBElement<>(_CommonOwner_QNAME, TSerial.class, Common.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EntryBy", scope = Common.class)
  public JAXBElement<TSerial> createCommonEntryBy(TSerial value) {
    return new JAXBElement<>(_CommonEntryBy_QNAME, TSerial.class, Common.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "State", scope = Common.class)
  public JAXBElement<TS10> createCommonState(TS10 value) {
    return new JAXBElement<>(_CommonState_QNAME, TS10.class, Common.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LastChangeBy", scope = Common.class)
  public JAXBElement<TSerial> createCommonLastChangeBy(TSerial value) {
    return new JAXBElement<>(_CommonLastChangeBy_QNAME, TSerial.class, Common.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TDT }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LastChangeDateTime", scope = Common.class)
  public JAXBElement<TDT> createCommonLastChangeDateTime(TDT value) {
    return new JAXBElement<>(_CommonLastChangeDateTime_QNAME, TDT.class, Common.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SSRequestRef", scope = RelatedSupportability.class)
  public JAXBElement<TSerial> createRelatedSupportabilitySSRequestRef(TSerial value) {
    return new JAXBElement<>(_RelatedSupportabilitySSRequestRef_QNAME, TSerial.class, RelatedSupportability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "J12Number", scope = RelatedSupportability.class)
  public JAXBElement<TS15> createRelatedSupportabilityJ12Number(TS15 value) {
    return new JAXBElement<>(_RelatedSupportabilityJ12Number_QNAME, TS15.class, RelatedSupportability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUS5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TAD", scope = Freq.class)
  public JAXBElement<TUS5> createFreqTAD(TUS5 value) {
    return new JAXBElement<>(_FreqTAD_QNAME, TUS5.class, Freq.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LegacyNum", scope = Freq.class)
  public JAXBElement<TS20> createFreqLegacyNum(TS20 value) {
    return new JAXBElement<>(_FreqLegacyNum_QNAME, TS20.class, Freq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Excluded", scope = StageLocation.class)
  public JAXBElement<TListCBO> createStageLocationExcluded(TListCBO value) {
    return new JAXBElement<>(_EllipseExcluded_QNAME, TListCBO.class, StageLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RiseTime", scope = Pulse.class)
  public JAXBElement<Tmicrosecs> createPulseRiseTime(Tmicrosecs value) {
    return new JAXBElement<>(_PulseRiseTime_QNAME, Tmicrosecs.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CompMethod", scope = Pulse.class)
  public JAXBElement<TS40> createPulseCompMethod(TS40 value) {
    return new JAXBElement<>(_PulseCompMethod_QNAME, TS40.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TPercent }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DutyCycleMax", scope = Pulse.class)
  public JAXBElement<TPercent> createPulseDutyCycleMax(TPercent value) {
    return new JAXBElement<>(_PulseDutyCycleMax_QNAME, TPercent.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AvgPowerMin", scope = Pulse.class)
  public JAXBElement<TdBW> createPulseAvgPowerMin(TdBW value) {
    return new JAXBElement<>(_PulseAvgPowerMin_QNAME, TdBW.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PDMax", scope = Pulse.class)
  public JAXBElement<Tmicrosecs> createPulsePDMax(Tmicrosecs value) {
    return new JAXBElement<>(_PulsePDMax_QNAME, Tmicrosecs.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FallTime", scope = Pulse.class)
  public JAXBElement<Tmicrosecs> createPulseFallTime(Tmicrosecs value) {
    return new JAXBElement<>(_PulseFallTime_QNAME, Tmicrosecs.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AvgPowerMax", scope = Pulse.class)
  public JAXBElement<TdBW> createPulseAvgPowerMax(TdBW value) {
    return new JAXBElement<>(_PulseAvgPowerMax_QNAME, TdBW.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PDMin", scope = Pulse.class)
  public JAXBElement<Tmicrosecs> createPulsePDMin(Tmicrosecs value) {
    return new JAXBElement<>(_PulsePDMin_QNAME, Tmicrosecs.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumSubpulses", scope = Pulse.class)
  public JAXBElement<TUN10> createPulseNumSubpulses(TUN10 value) {
    return new JAXBElement<>(_PulseNumSubpulses_QNAME, TUN10.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN8_4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CompRatio", scope = Pulse.class)
  public JAXBElement<TUN8_4> createPulseCompRatio(TUN8_4 value) {
    return new JAXBElement<>(_PulseCompRatio_QNAME, TUN8_4.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RadarProcessingGainMax", scope = Pulse.class)
  public JAXBElement<TdB> createPulseRadarProcessingGainMax(TdB value) {
    return new JAXBElement<>(_PulseRadarProcessingGainMax_QNAME, TdB.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PRRMax", scope = Pulse.class)
  public JAXBElement<TUN9_3> createPulsePRRMax(TUN9_3 value) {
    return new JAXBElement<>(_PulsePRRMax_QNAME, TUN9_3.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TPercent }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DutyCycleMin", scope = Pulse.class)
  public JAXBElement<TPercent> createPulseDutyCycleMin(TPercent value) {
    return new JAXBElement<>(_PulseDutyCycleMin_QNAME, TPercent.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "JustifyShortRiseTime", scope = Pulse.class)
  public JAXBElement<TMEMO> createPulseJustifyShortRiseTime(TMEMO value) {
    return new JAXBElement<>(_PulseJustifyShortRiseTime_QNAME, TMEMO.class, Pulse.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PRRMin", scope = Pulse.class)
  public JAXBElement<TUN9_3> createPulsePRRMin(TUN9_3 value) {
    return new JAXBElement<>(_PulsePRRMin_QNAME, TUN9_3.class, Pulse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Period", scope = Time.class)
  public JAXBElement<TS50> createTimePeriod(TS50 value) {
    return new JAXBElement<>(_AssignmentPeriod_QNAME, TS50.class, Time.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsageDescription ", scope = Time.class)
  public JAXBElement<TMEMO> createTimeUsageDescription_0020(TMEMO value) {
    return new JAXBElement<>(_TimeUsageDescription_0020_QNAME, TMEMO.class, Time.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Comments", scope = RecordNote.class)
  public JAXBElement<TMEMO> createRecordNoteComments(TMEMO value) {
    return new JAXBElement<>(_RecordNoteComments_QNAME, TMEMO.class, RecordNote.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DateResponseRequired", scope = Allotment.class)
  public JAXBElement<TD> createAllotmentDateResponseRequired(TD value) {
    return new JAXBElement<>(_AssignmentDateResponseRequired_QNAME, TD.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Requirement", scope = Allotment.class)
  public JAXBElement<TMEMO> createAllotmentRequirement(TMEMO value) {
    return new JAXBElement<>(_AssignmentRequirement_QNAME, TMEMO.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Allotment.class)
  public JAXBElement<TD> createAllotmentReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UsageType", scope = Allotment.class)
  public JAXBElement<TS25> createAllotmentUsageType(TS25 value) {
    return new JAXBElement<>(_AssignmentUsageType_QNAME, TS25.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Title", scope = Allotment.class)
  public JAXBElement<TS100> createAllotmentTitle(TS100 value) {
    return new JAXBElement<>(_AssignmentTitle_QNAME, TS100.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Allotment.class)
  public JAXBElement<TD> createAllotmentExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Allotment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "HostComments", scope = CoordinationData.class)
  public JAXBElement<TMEMO> createCoordinationDataHostComments(TMEMO value) {
    return new JAXBElement<>(_CoordinationDataHostComments_QNAME, TMEMO.class, CoordinationData.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = Curve.class)
  public JAXBElement<TFreqM> createCurveFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, Curve.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Bw", scope = Curve.class)
  public JAXBElement<TFreqM> createCurveBw(TFreqM value) {
    return new JAXBElement<>(_CurveBw_QNAME, TFreqM.class, Curve.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMin", scope = Curve.class)
  public JAXBElement<TFreqM> createCurveFreqMin(TFreqM value) {
    return new JAXBElement<>(_TrunkingAssignmentFreqMin_QNAME, TFreqM.class, Curve.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Calculated", scope = Curve.class)
  public JAXBElement<TListCBO> createCurveCalculated(TListCBO value) {
    return new JAXBElement<>(_PowerCalculated_QNAME, TListCBO.class, Curve.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = CodeList.class)
  public JAXBElement<TMEMO> createCodeListDescription(TMEMO value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TMEMO.class, CodeList.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Origin", scope = CodeList.class)
  public JAXBElement<TListCAO> createCodeListOrigin(TListCAO value) {
    return new JAXBElement<>(_CodeListOrigin_QNAME, TListCAO.class, CodeList.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAz180 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CutAngle", scope = AntPattern.class)
  public JAXBElement<TAz180> createAntPatternCutAngle(TAz180 value) {
    return new JAXBElement<>(_AntPatternCutAngle_QNAME, TAz180.class, AntPattern.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = AntPattern.class)
  public JAXBElement<TS10> createAntPatternType(TS10 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS10.class, AntPattern.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CutType", scope = AntPattern.class)
  public JAXBElement<TS10> createAntPatternCutType(TS10 value) {
    return new JAXBElement<>(_AntPatternCutType_QNAME, TS10.class, AntPattern.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Calculated", scope = AntPattern.class)
  public JAXBElement<TListCBO> createAntPatternCalculated(TListCBO value) {
    return new JAXBElement<>(_PowerCalculated_QNAME, TListCBO.class, AntPattern.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = CaseNum.class)
  public JAXBElement<TS20> createCaseNumType(TS20 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS20.class, CaseNum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Country", scope = CaseNum.class)
  public JAXBElement<TListCAO> createCaseNumCountry(TListCAO value) {
    return new JAXBElement<>(_CaseNumCountry_QNAME, TListCAO.class, CaseNum.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EIRPMin", scope = Configuration.class)
  public JAXBElement<TdBW> createConfigurationEIRPMin(TdBW value) {
    return new JAXBElement<>(_ConfigurationEIRPMin_QNAME, TdBW.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = Configuration.class)
  public JAXBElement<TS100> createConfigurationDescription(TS100 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS100.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EIRPMax", scope = Configuration.class)
  public JAXBElement<TdBW> createConfigurationEIRPMax(TdBW value) {
    return new JAXBElement<>(_ConfigurationEIRPMax_QNAME, TdBW.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerType", scope = Configuration.class)
  public JAXBElement<TS10> createConfigurationPowerType(TS10 value) {
    return new JAXBElement<>(_PowerPowerType_QNAME, TS10.class, Configuration.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SpectrumLink", scope = Configuration.class)
  public JAXBElement<TListCBO> createConfigurationSpectrumLink(TListCBO value) {
    return new JAXBElement<>(_ConfigurationSpectrumLink_QNAME, TListCBO.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PowerLimit", scope = Configuration.class)
  public JAXBElement<TdBW> createConfigurationPowerLimit(TdBW value) {
    return new JAXBElement<>(_TxModeRefPowerLimit_QNAME, TdBW.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OOBJustification", scope = Configuration.class)
  public JAXBElement<TMEMO> createConfigurationOOBJustification(TMEMO value) {
    return new JAXBElement<>(_ConfigurationOOBJustification_QNAME, TMEMO.class, Configuration.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Repeater", scope = Configuration.class)
  public JAXBElement<TListCBO> createConfigurationRepeater(TListCBO value) {
    return new JAXBElement<>(_ConfigurationRepeater_QNAME, TListCBO.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumUsers", scope = Configuration.class)
  public JAXBElement<TUN9> createConfigurationNumUsers(TUN9 value) {
    return new JAXBElement<>(_ConfigurationNumUsers_QNAME, TUN9.class, Configuration.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Level", scope = Identifier.class)
  public JAXBElement<TS25> createIdentifierLevel(TS25 value) {
    return new JAXBElement<>(_NomenclatureLevel_QNAME, TS25.class, Identifier.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = RelatedOrganisation.class)
  public JAXBElement<TS25> createRelatedOrganisationType(TS25 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS25.class, RelatedOrganisation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "User", scope = Channel.class)
  public JAXBElement<TS50> createChannelUser(TS50 value) {
    return new JAXBElement<>(_ChannelUser_QNAME, TS50.class, Channel.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Name", scope = Channel.class)
  public JAXBElement<TS50> createChannelName(TS50 value) {
    return new JAXBElement<>(_EarthStationName_QNAME, TS50.class, Channel.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ConnectorType", scope = AntHardware.class)
  public JAXBElement<TS25> createAntHardwareConnectorType(TS25 value) {
    return new JAXBElement<>(_AntHardwareConnectorType_QNAME, TS25.class, AntHardware.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LeadType", scope = AntHardware.class)
  public JAXBElement<TS25> createAntHardwareLeadType(TS25 value) {
    return new JAXBElement<>(_AntHardwareLeadType_QNAME, TS25.class, AntHardware.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FeedType", scope = AntHardware.class)
  public JAXBElement<TS50> createAntHardwareFeedType(TS50 value) {
    return new JAXBElement<>(_AntHardwareFeedType_QNAME, TS50.class, AntHardware.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FeedOrientation", scope = AntHardware.class)
  public JAXBElement<TS10> createAntHardwareFeedOrientation(TS10 value) {
    return new JAXBElement<>(_AntHardwareFeedOrientation_QNAME, TS10.class, AntHardware.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS30 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SysName", scope = SysOfStation.class)
  public JAXBElement<TS30> createSysOfStationSysName(TS30 value) {
    return new JAXBElement<>(_SysOfStationSysName_QNAME, TS30.class, SysOfStation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumStations", scope = SysOfStation.class)
  public JAXBElement<TUN9> createSysOfStationNumStations(TUN9 value) {
    return new JAXBElement<>(_SysOfStationNumStations_QNAME, TUN9.class, SysOfStation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Source", scope = Note.class)
  public JAXBElement<TS100> createNoteSource(TS100 value) {
    return new JAXBElement<>(_CommentSourceSource_QNAME, TS100.class, Note.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Name", scope = Note.class)
  public JAXBElement<TMEMO> createNoteName(TMEMO value) {
    return new JAXBElement<>(_EarthStationName_QNAME, TMEMO.class, Note.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = Note.class)
  public JAXBElement<TMEMO> createNoteDescription(TMEMO value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TMEMO.class, Note.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Administration", scope = Note.class)
  public JAXBElement<TListCAO> createNoteAdministration(TListCAO value) {
    return new JAXBElement<>(_SatelliteAdministration_QNAME, TListCAO.class, Note.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Note.class)
  public JAXBElement<TD> createNoteEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Note.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Note.class)
  public JAXBElement<TD> createNoteExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Note.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TDT }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDateTime", scope = JRFL.class)
  public JAXBElement<TDT> createJRFLExpirationDateTime(TDT value) {
    return new JAXBElement<>(_AssignmentExpirationDateTime_QNAME, TDT.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfMonth", scope = JRFL.class)
  public JAXBElement<TDaysOfMonth> createJRFLDaysOfMonth(TDaysOfMonth value) {
    return new JAXBElement<>(_JRFLEntryDaysOfMonth_QNAME, TDaysOfMonth.class, JRFL.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Duration", scope = JRFL.class)
  public JAXBElement<TUN4> createJRFLDuration(TUN4 value) {
    return new JAXBElement<>(_JRFLEntryDuration_QNAME, TUN4.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMonths }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Months", scope = JRFL.class)
  public JAXBElement<TMonths> createJRFLMonths(TMonths value) {
    return new JAXBElement<>(_JRFLEntryMonths_QNAME, TMonths.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link THours }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Hours", scope = JRFL.class)
  public JAXBElement<THours> createJRFLHours(THours value) {
    return new JAXBElement<>(_JRFLEntryHours_QNAME, THours.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Seconds", scope = JRFL.class)
  public JAXBElement<TMinSec> createJRFLSeconds(TMinSec value) {
    return new JAXBElement<>(_JRFLEntrySeconds_QNAME, TMinSec.class, JRFL.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TDT }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDateTime", scope = JRFL.class)
  public JAXBElement<TDT> createJRFLEffectiveDateTime(TDT value) {
    return new JAXBElement<>(_JRFLEffectiveDateTime_QNAME, TDT.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TYears }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Years", scope = JRFL.class)
  public JAXBElement<TYears> createJRFLYears(TYears value) {
    return new JAXBElement<>(_JRFLEntryYears_QNAME, TYears.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfWeek", scope = JRFL.class)
  public JAXBElement<TDaysOfWeek> createJRFLDaysOfWeek(TDaysOfWeek value) {
    return new JAXBElement<>(_JRFLEntryDaysOfWeek_QNAME, TDaysOfWeek.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Minutes", scope = JRFL.class)
  public JAXBElement<TMinSec> createJRFLMinutes(TMinSec value) {
    return new JAXBElement<>(_JRFLEntryMinutes_QNAME, TMinSec.class, JRFL.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = JRFL.class)
  public JAXBElement<TD> createJRFLReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, JRFL.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocationRef", scope = FEDeployment.class)
  public JAXBElement<TSerial> createFEDeploymentLocationRef(TSerial value) {
    return new JAXBElement<>(_EarthStationLocationRef_QNAME, TSerial.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Num", scope = FEDeployment.class)
  public JAXBElement<TUN6> createFEDeploymentNum(TUN6 value) {
    return new JAXBElement<>(_FEDeploymentNum_QNAME, TUN6.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfMonth", scope = FEDeployment.class)
  public JAXBElement<TDaysOfMonth> createFEDeploymentDaysOfMonth(TDaysOfMonth value) {
    return new JAXBElement<>(_JRFLEntryDaysOfMonth_QNAME, TDaysOfMonth.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN4 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Duration", scope = FEDeployment.class)
  public JAXBElement<TUN4> createFEDeploymentDuration(TUN4 value) {
    return new JAXBElement<>(_JRFLEntryDuration_QNAME, TUN4.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMonths }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Months", scope = FEDeployment.class)
  public JAXBElement<TMonths> createFEDeploymentMonths(TMonths value) {
    return new JAXBElement<>(_JRFLEntryMonths_QNAME, TMonths.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link THours }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Hours", scope = FEDeployment.class)
  public JAXBElement<THours> createFEDeploymentHours(THours value) {
    return new JAXBElement<>(_JRFLEntryHours_QNAME, THours.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Seconds", scope = FEDeployment.class)
  public JAXBElement<TMinSec> createFEDeploymentSeconds(TMinSec value) {
    return new JAXBElement<>(_JRFLEntrySeconds_QNAME, TMinSec.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TYears }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Years", scope = FEDeployment.class)
  public JAXBElement<TYears> createFEDeploymentYears(TYears value) {
    return new JAXBElement<>(_JRFLEntryYears_QNAME, TYears.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DaysOfWeek", scope = FEDeployment.class)
  public JAXBElement<TDaysOfWeek> createFEDeploymentDaysOfWeek(TDaysOfWeek value) {
    return new JAXBElement<>(_JRFLEntryDaysOfWeek_QNAME, TDaysOfWeek.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TMinSec }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Minutes", scope = FEDeployment.class)
  public JAXBElement<TMinSec> createFEDeploymentMinutes(TMinSec value) {
    return new JAXBElement<>(_JRFLEntryMinutes_QNAME, TMinSec.class, FEDeployment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Role.class)
  public JAXBElement<TD> createRoleEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Role.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCCY }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Country", scope = Role.class)
  public JAXBElement<TListCCY> createRoleCountry(TListCCY value) {
    return new JAXBElement<>(_CaseNumCountry_QNAME, TListCCY.class, Role.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Role.class)
  public JAXBElement<TD> createRoleReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Role.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Role.class)
  public JAXBElement<TD> createRoleExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Role.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IsClassified", scope = ExternalReference.class)
  public JAXBElement<TListCBO> createExternalReferenceIsClassified(TListCBO value) {
    return new JAXBElement<>(_ExternalReferenceIsClassified_QNAME, TListCBO.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ResourceLocator", scope = ExternalReference.class)
  public JAXBElement<TS255> createExternalReferenceResourceLocator(TS255 value) {
    return new JAXBElement<>(_ExternalReferenceResourceLocator_QNAME, TS255.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCCL }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DocumentCls", scope = ExternalReference.class)
  public JAXBElement<TListCCL> createExternalReferenceDocumentCls(TListCCL value) {
    return new JAXBElement<>(_ExternalReferenceDocumentCls_QNAME, TListCCL.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Date", scope = ExternalReference.class)
  public JAXBElement<TD> createExternalReferenceDate(TD value) {
    return new JAXBElement<>(_CommentSourceDate_QNAME, TD.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AlternateIdentifier", scope = ExternalReference.class)
  public JAXBElement<TS50> createExternalReferenceAlternateIdentifier(TS50 value) {
    return new JAXBElement<>(_ExternalReferenceAlternateIdentifier_QNAME, TS50.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = ExternalReference.class)
  public JAXBElement<TS50> createExternalReferenceType(TS50 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS50.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Author", scope = ExternalReference.class)
  public JAXBElement<TS255> createExternalReferenceAuthor(TS255 value) {
    return new JAXBElement<>(_CommentSourceAuthor_QNAME, TS255.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Organisation", scope = ExternalReference.class)
  public JAXBElement<TS50> createExternalReferenceOrganisation(TS50 value) {
    return new JAXBElement<>(_ExternalReferenceOrganisation_QNAME, TS50.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Identifier", scope = ExternalReference.class)
  public JAXBElement<TS50> createExternalReferenceIdentifier(TS50 value) {
    return new JAXBElement<>(_ExternalReferenceIdentifier_QNAME, TS50.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCSG }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReferencedStage", scope = ExternalReference.class)
  public JAXBElement<TListCSG> createExternalReferenceReferencedStage(TListCSG value) {
    return new JAXBElement<>(_ExternalReferenceReferencedStage_QNAME, TListCSG.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Title", scope = ExternalReference.class)
  public JAXBElement<TS255> createExternalReferenceTitle(TS255 value) {
    return new JAXBElement<>(_AssignmentTitle_QNAME, TS255.class, ExternalReference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PointingElevMax", scope = StationConfig.class)
  public JAXBElement<TElev> createStationConfigPointingElevMax(TElev value) {
    return new JAXBElement<>(_StationConfigPointingElevMax_QNAME, TElev.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EarthCoverage", scope = StationConfig.class)
  public JAXBElement<TS50> createStationConfigEarthCoverage(TS50 value) {
    return new JAXBElement<>(_StationConfigEarthCoverage_QNAME, TS50.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EIRPMin", scope = StationConfig.class)
  public JAXBElement<TdBW> createStationConfigEIRPMin(TdBW value) {
    return new JAXBElement<>(_ConfigurationEIRPMin_QNAME, TdBW.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EIRPMax", scope = StationConfig.class)
  public JAXBElement<TdBW> createStationConfigEIRPMax(TdBW value) {
    return new JAXBElement<>(_ConfigurationEIRPMax_QNAME, TdBW.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CoordinationNum", scope = StationConfig.class)
  public JAXBElement<TS15> createStationConfigCoordinationNum(TS15 value) {
    return new JAXBElement<>(_StationConfigCoordinationNum_QNAME, TS15.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PointingElevMin", scope = StationConfig.class)
  public JAXBElement<TElev> createStationConfigPointingElevMin(TElev value) {
    return new JAXBElement<>(_StationConfigPointingElevMin_QNAME, TElev.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PointingAzMax", scope = StationConfig.class)
  public JAXBElement<TAz> createStationConfigPointingAzMax(TAz value) {
    return new JAXBElement<>(_StationConfigPointingAzMax_QNAME, TAz.class, StationConfig.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FeedlineLength", scope = StationConfig.class)
  public JAXBElement<TAltitude> createStationConfigFeedlineLength(TAltitude value) {
    return new JAXBElement<>(_StationConfigFeedlineLength_QNAME, TAltitude.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FeedlineLoss", scope = StationConfig.class)
  public JAXBElement<TdB> createStationConfigFeedlineLoss(TdB value) {
    return new JAXBElement<>(_StationConfigFeedlineLoss_QNAME, TdB.class, StationConfig.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PointingAzMin", scope = StationConfig.class)
  public JAXBElement<TAz> createStationConfigPointingAzMin(TAz value) {
    return new JAXBElement<>(_StationConfigPointingAzMin_QNAME, TAz.class, StationConfig.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AntFeedpointHeight", scope = StationConfig.class)
  public JAXBElement<TAltitude> createStationConfigAntFeedpointHeight(TAltitude value) {
    return new JAXBElement<>(_JRFLEntryLocationAntFeedpointHeight_QNAME, TAltitude.class, StationConfig.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "POCRef", scope = StatusLog.class)
  public JAXBElement<TSerial> createStatusLogPOCRef(TSerial value) {
    return new JAXBElement<>(_StatusLogPOCRef_QNAME, TSerial.class, StatusLog.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS255 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Comment", scope = StatusLog.class)
  public JAXBElement<TS255> createStatusLogComment(TS255 value) {
    return new JAXBElement<>(_StatusLogComment_QNAME, TS255.class, StatusLog.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS80 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencyCode", scope = StatusLog.class)
  public JAXBElement<TS80> createStatusLogAgencyCode(TS80 value) {
    return new JAXBElement<>(_StatusLogAgencyCode_QNAME, TS80.class, StatusLog.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS11 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ApplicationSPSNumber", scope = SSRequest.class)
  public JAXBElement<TS11> createSSRequestApplicationSPSNumber(TS11 value) {
    return new JAXBElement<>(_SSRequestApplicationSPSNumber_QNAME, TS11.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumCositedUnits", scope = SSRequest.class)
  public JAXBElement<TUN9> createSSRequestNumCositedUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumCositedUnits_QNAME, TUN9.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DateResponseRequired", scope = SSRequest.class)
  public JAXBElement<TD> createSSRequestDateResponseRequired(TD value) {
    return new JAXBElement<>(_AssignmentDateResponseRequired_QNAME, TD.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CoordinationNum", scope = SSRequest.class)
  public JAXBElement<TS15> createSSRequestCoordinationNum(TS15 value) {
    return new JAXBElement<>(_StationConfigCoordinationNum_QNAME, TS15.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NTIACoordinationRequired", scope = SSRequest.class)
  public JAXBElement<TListCBO> createSSRequestNTIACoordinationRequired(TListCBO value) {
    return new JAXBElement<>(_SSRequestNTIACoordinationRequired_QNAME, TListCBO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InfoTransferRequirement", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestInfoTransferRequirement(TMEMO value) {
    return new JAXBElement<>(_SSRequestInfoTransferRequirement_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "WartimeUse", scope = SSRequest.class)
  public JAXBElement<TListCBO> createSSRequestWartimeUse(TListCBO value) {
    return new JAXBElement<>(_SSRequestWartimeUse_QNAME, TListCBO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SysRelationEssential", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestSysRelationEssential(TMEMO value) {
    return new JAXBElement<>(_SSRequestSysRelationEssential_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InitialCostDesc", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestInitialCostDesc(TMEMO value) {
    return new JAXBElement<>(_SSRequestInitialCostDesc_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumAreaUnits", scope = SSRequest.class)
  public JAXBElement<TUN9> createSSRequestNumAreaUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumAreaUnits_QNAME, TUN9.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCSG }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CurrentStage", scope = SSRequest.class)
  public JAXBElement<TListCSG> createSSRequestCurrentStage(TListCSG value) {
    return new JAXBElement<>(_SSRequestCurrentStage_QNAME, TListCSG.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS70 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InitialCost", scope = SSRequest.class)
  public JAXBElement<TS70> createSSRequestInitialCost(TS70 value) {
    return new JAXBElement<>(_SSRequestInitialCost_QNAME, TS70.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Emergency", scope = SSRequest.class)
  public JAXBElement<TListCBO> createSSRequestEmergency(TListCBO value) {
    return new JAXBElement<>(_AssignmentEmergency_QNAME, TListCBO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS80 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OriginatingAgency", scope = SSRequest.class)
  public JAXBElement<TS80> createSSRequestOriginatingAgency(TS80 value) {
    return new JAXBElement<>(_SSRequestOriginatingAgency_QNAME, TS80.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumMobileUnits", scope = SSRequest.class)
  public JAXBElement<TUN9> createSSRequestNumMobileUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumMobileUnits_QNAME, TUN9.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Requirement", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestRequirement(TMEMO value) {
    return new JAXBElement<>(_AssignmentRequirement_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RelatedAnalysisAndTestData", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestRelatedAnalysisAndTestData(TMEMO value) {
    return new JAXBElement<>(_SSRequestRelatedAnalysisAndTestData_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReplacementInfo", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestReplacementInfo(TMEMO value) {
    return new JAXBElement<>(_SSRequestReplacementInfo_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TSPR", scope = SSRequest.class)
  public JAXBElement<TS10> createSSRequestTSPR(TS10 value) {
    return new JAXBElement<>(_ReceiverTSPR_QNAME, TS10.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OperInvIntent", scope = SSRequest.class)
  public JAXBElement<TListCBO> createSSRequestOperInvIntent(TListCBO value) {
    return new JAXBElement<>(_SSRequestOperInvIntent_QNAME, TListCBO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ITUWaiver", scope = SSRequest.class)
  public JAXBElement<TListCBO> createSSRequestITUWaiver(TListCBO value) {
    return new JAXBElement<>(_SSRequestITUWaiver_QNAME, TListCBO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ApplicationDate", scope = SSRequest.class)
  public JAXBElement<TD> createSSRequestApplicationDate(TD value) {
    return new JAXBElement<>(_SSRequestApplicationDate_QNAME, TD.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NTIASpaceData", scope = SSRequest.class)
  public JAXBElement<TMEMO> createSSRequestNTIASpaceData(TMEMO value) {
    return new JAXBElement<>(_SSRequestNTIASpaceData_QNAME, TMEMO.class, SSRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RequestType", scope = SSRequest.class)
  public JAXBElement<TS50> createSSRequestRequestType(TS50 value) {
    return new JAXBElement<>(_SSRequestRequestType_QNAME, TS50.class, SSRequest.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = AntFreqs.class)
  public JAXBElement<TFreqM> createAntFreqsFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, AntFreqs.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAU }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqUse", scope = AntFreqs.class)
  public JAXBElement<TListCAU> createAntFreqsFreqUse(TListCAU value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqUse_QNAME, TListCAU.class, AntFreqs.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Bandwidth", scope = AntFreqs.class)
  public JAXBElement<TFreqM> createAntFreqsBandwidth(TFreqM value) {
    return new JAXBElement<>(_JRFLEntryBandwidth_QNAME, TFreqM.class, AntFreqs.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCAO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Country", scope = Manufacturer.class)
  public JAXBElement<TListCAO> createManufacturerCountry(TListCAO value) {
    return new JAXBElement<>(_CaseNumCountry_QNAME, TListCAO.class, Manufacturer.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS24 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LinkName", scope = Link.class)
  public JAXBElement<TS24> createLinkLinkName(TS24 value) {
    return new JAXBElement<>(_LinkLinkName_QNAME, TS24.class, Link.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS150 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermediateFunction", scope = Link.class)
  public JAXBElement<TS150> createLinkIntermediateFunction(TS150 value) {
    return new JAXBElement<>(_LinkIntermediateFunction_QNAME, TS150.class, Link.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS150 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MajorFunction", scope = Link.class)
  public JAXBElement<TS150> createLinkMajorFunction(TS150 value) {
    return new JAXBElement<>(_LinkMajorFunction_QNAME, TS150.class, Link.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TNavAidChnl }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NavAidsChannel", scope = Assigned.class)
  public JAXBElement<TNavAidChnl> createAssignedNavAidsChannel(TNavAidChnl value) {
    return new JAXBElement<>(_AssignedNavAidsChannel_QNAME, TNavAidChnl.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ColourWord", scope = Assigned.class)
  public JAXBElement<TS20> createAssignedColourWord(TS20 value) {
    return new JAXBElement<>(_AssignedColourWord_QNAME, TS20.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ColourNum", scope = Assigned.class)
  public JAXBElement<TUN2> createAssignedColourNum(TUN2 value) {
    return new JAXBElement<>(_AssignedColourNum_QNAME, TUN2.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN1 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Quality", scope = Assigned.class)
  public JAXBElement<TUN1> createAssignedQuality(TUN1 value) {
    return new JAXBElement<>(_AssignedQuality_QNAME, TUN1.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ITURegStatus", scope = Assigned.class)
  public JAXBElement<TS50> createAssignedITURegStatus(TS50 value) {
    return new JAXBElement<>(_AssignedITURegStatus_QNAME, TS50.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ITURegComments", scope = Assigned.class)
  public JAXBElement<TMEMO> createAssignedITURegComments(TMEMO value) {
    return new JAXBElement<>(_AssignedITURegComments_QNAME, TMEMO.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ITURegNum", scope = Assigned.class)
  public JAXBElement<TUS10> createAssignedITURegNum(TUS10 value) {
    return new JAXBElement<>(_AssignedITURegNum_QNAME, TUS10.class, Assigned.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TNetNumber }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NetNum", scope = Assigned.class)
  public JAXBElement<TNetNumber> createAssignedNetNum(TNetNumber value) {
    return new JAXBElement<>(_AssignedNetNum_QNAME, TNetNumber.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ITURegDate", scope = Assigned.class)
  public JAXBElement<TD> createAssignedITURegDate(TD value) {
    return new JAXBElement<>(_AssignedITURegDate_QNAME, TD.class, Assigned.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS200 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DowngradeInfo", scope = Downgrade.class)
  public JAXBElement<TS200> createDowngradeDowngradeInfo(TS200 value) {
    return new JAXBElement<>(_DowngradeDowngradeInfo_QNAME, TS200.class, Downgrade.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FMPeakModulationIdx", scope = TxModulation.class)
  public JAXBElement<TUN5_3> createTxModulationFMPeakModulationIdx(TUN5_3 value) {
    return new JAXBElement<>(_TxModulationFMPeakModulationIdx_QNAME, TUN5_3.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxDevRatio", scope = TxModulation.class)
  public JAXBElement<TUN5_3> createTxModulationMaxDevRatio(TUN5_3 value) {
    return new JAXBElement<>(_TxModulationMaxDevRatio_QNAME, TUN5_3.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FMRMSFreqDev", scope = TxModulation.class)
  public JAXBElement<TFreqM> createTxModulationFMRMSFreqDev(TFreqM value) {
    return new JAXBElement<>(_TxModulationFMRMSFreqDev_QNAME, TFreqM.class, TxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FMDeviationCode", scope = TxModulation.class)
  public JAXBElement<TS25> createTxModulationFMDeviationCode(TS25 value) {
    return new JAXBElement<>(_TxModulationFMDeviationCode_QNAME, TS25.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AMRMSIdx", scope = TxModulation.class)
  public JAXBElement<TUN5_3> createTxModulationAMRMSIdx(TUN5_3 value) {
    return new JAXBElement<>(_TxModulationAMRMSIdx_QNAME, TUN5_3.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AMIdx", scope = TxModulation.class)
  public JAXBElement<TUN5_3> createTxModulationAMIdx(TUN5_3 value) {
    return new JAXBElement<>(_TxModulationAMIdx_QNAME, TUN5_3.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCSI }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SidebandSuppressed", scope = TxModulation.class)
  public JAXBElement<TListCSI> createTxModulationSidebandSuppressed(TListCSI value) {
    return new JAXBElement<>(_TxModulationSidebandSuppressed_QNAME, TListCSI.class, TxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CarrierSuppression", scope = TxModulation.class)
  public JAXBElement<TdB> createTxModulationCarrierSuppression(TdB value) {
    return new JAXBElement<>(_TxModulationCarrierSuppression_QNAME, TdB.class, TxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FMPeakFreqDev", scope = TxModulation.class)
  public JAXBElement<TFreqM> createTxModulationFMPeakFreqDev(TFreqM value) {
    return new JAXBElement<>(_TxModulationFMPeakFreqDev_QNAME, TFreqM.class, TxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SidebandSuppression", scope = TxModulation.class)
  public JAXBElement<TdB> createTxModulationSidebandSuppression(TdB value) {
    return new JAXBElement<>(_TxModulationSidebandSuppression_QNAME, TdB.class, TxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TitleRank", scope = Contact.class)
  public JAXBElement<TS10> createContactTitleRank(TS10 value) {
    return new JAXBElement<>(_ContactTitleRank_QNAME, TS10.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Contact.class)
  public JAXBElement<TD> createContactEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS30 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FirstName", scope = Contact.class)
  public JAXBElement<TS30> createContactFirstName(TS30 value) {
    return new JAXBElement<>(_ContactFirstName_QNAME, TS30.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS30 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LastName", scope = Contact.class)
  public JAXBElement<TS30> createContactLastName(TS30 value) {
    return new JAXBElement<>(_ContactLastName_QNAME, TS30.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = Contact.class)
  public JAXBElement<TD> createContactReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Contact.class)
  public JAXBElement<TD> createContactExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Contact.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ElevStop", scope = Blanking.class)
  public JAXBElement<TElev> createBlankingElevStop(TElev value) {
    return new JAXBElement<>(_BlankingElevStop_QNAME, TElev.class, Blanking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AzStop", scope = Blanking.class)
  public JAXBElement<TAz> createBlankingAzStop(TAz value) {
    return new JAXBElement<>(_BlankingAzStop_QNAME, TAz.class, Blanking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TElev }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ElevStart", scope = Blanking.class)
  public JAXBElement<TElev> createBlankingElevStart(TElev value) {
    return new JAXBElement<>(_BlankingElevStart_QNAME, TElev.class, Blanking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TAz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AzStart", scope = Blanking.class)
  public JAXBElement<TAz> createBlankingAzStart(TAz value) {
    return new JAXBElement<>(_BlankingAzStart_QNAME, TAz.class, Blanking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS1 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Dispatcher", scope = Trunking.class)
  public JAXBElement<TS1> createTrunkingDispatcher(TS1 value) {
    return new JAXBElement<>(_TrunkingDispatcher_QNAME, TS1.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SeparateSystemJustification", scope = Trunking.class)
  public JAXBElement<TMEMO> createTrunkingSeparateSystemJustification(TMEMO value) {
    return new JAXBElement<>(_TrunkingSeparateSystemJustification_QNAME, TMEMO.class, Trunking.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = Trunking.class)
  public JAXBElement<TFreqM> createTrunkingFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NSEPUse", scope = Trunking.class)
  public JAXBElement<TMEMO> createTrunkingNSEPUse(TMEMO value) {
    return new JAXBElement<>(_TrunkingNSEPUse_QNAME, TMEMO.class, Trunking.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMin", scope = Trunking.class)
  public JAXBElement<TFreqM> createTrunkingFreqMin(TFreqM value) {
    return new JAXBElement<>(_TrunkingAssignmentFreqMin_QNAME, TFreqM.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpansionTargetDate", scope = Trunking.class)
  public JAXBElement<TD> createTrunkingExpansionTargetDate(TD value) {
    return new JAXBElement<>(_TrunkingExpansionTargetDate_QNAME, TD.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PreviousSPSDocketNum", scope = Trunking.class)
  public JAXBElement<TS12> createTrunkingPreviousSPSDocketNum(TS12 value) {
    return new JAXBElement<>(_TrunkingPreviousSPSDocketNum_QNAME, TS12.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS70 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EstimatedExpansionCost", scope = Trunking.class)
  public JAXBElement<TS70> createTrunkingEstimatedExpansionCost(TS70 value) {
    return new JAXBElement<>(_TrunkingEstimatedExpansionCost_QNAME, TS70.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumFreqsRequired", scope = Trunking.class)
  public JAXBElement<TUN10> createTrunkingNumFreqsRequired(TUN10 value) {
    return new JAXBElement<>(_TrunkingNumFreqsRequired_QNAME, TUN10.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN7 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumRepeaters", scope = Trunking.class)
  public JAXBElement<TUN7> createTrunkingNumRepeaters(TUN7 value) {
    return new JAXBElement<>(_TrunkingNumRepeaters_QNAME, TUN7.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AdditionalChannelsRationale", scope = Trunking.class)
  public JAXBElement<TMEMO> createTrunkingAdditionalChannelsRationale(TMEMO value) {
    return new JAXBElement<>(_TrunkingAdditionalChannelsRationale_QNAME, TMEMO.class, Trunking.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RequestForExpansion", scope = Trunking.class)
  public JAXBElement<TListCBO> createTrunkingRequestForExpansion(TListCBO value) {
    return new JAXBElement<>(_TrunkingRequestForExpansion_QNAME, TListCBO.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DispatcherExplanation", scope = Trunking.class)
  public JAXBElement<TMEMO> createTrunkingDispatcherExplanation(TMEMO value) {
    return new JAXBElement<>(_TrunkingDispatcherExplanation_QNAME, TMEMO.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumUsers", scope = Trunking.class)
  public JAXBElement<TUN10> createTrunkingNumUsers(TUN10 value) {
    return new JAXBElement<>(_ConfigurationNumUsers_QNAME, TUN10.class, Trunking.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = POCInformation.class)
  public JAXBElement<TMEMO> createPOCInformationDescription(TMEMO value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TMEMO.class, POCInformation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Serial", scope = POCInformation.class)
  public JAXBElement<TSerial> createPOCInformationSerial(TSerial value) {
    return new JAXBElement<>(_POCInformationSerial_QNAME, TSerial.class, POCInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DeclsType", scope = SecurityClass.class)
  public JAXBElement<TS10> createSecurityClassDeclsType(TS10 value) {
    return new JAXBElement<>(_SecurityClassDeclsType_QNAME, TS10.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SourceClsDate", scope = SecurityClass.class)
  public JAXBElement<TD> createSecurityClassSourceClsDate(TD value) {
    return new JAXBElement<>(_SecurityClassSourceClsDate_QNAME, TD.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DeclsDate", scope = SecurityClass.class)
  public JAXBElement<TD> createSecurityClassDeclsDate(TD value) {
    return new JAXBElement<>(_SecurityClassDeclsDate_QNAME, TD.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ClsReason", scope = SecurityClass.class)
  public JAXBElement<TS15> createSecurityClassClsReason(TS15 value) {
    return new JAXBElement<>(_SecurityClassClsReason_QNAME, TS15.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS30 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ClsAuthority", scope = SecurityClass.class)
  public JAXBElement<TS30> createSecurityClassClsAuthority(TS30 value) {
    return new JAXBElement<>(_SecurityClassClsAuthority_QNAME, TS30.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS30 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ClsOrg", scope = SecurityClass.class)
  public JAXBElement<TS30> createSecurityClassClsOrg(TS30 value) {
    return new JAXBElement<>(_SecurityClassClsOrg_QNAME, TS30.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS200 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DeclsEvent", scope = SecurityClass.class)
  public JAXBElement<TS200> createSecurityClassDeclsEvent(TS200 value) {
    return new JAXBElement<>(_SecurityClassDeclsEvent_QNAME, TS200.class, SecurityClass.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCSG }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FieldedStatus", scope = RFSystem.class)
  public JAXBElement<TListCSG> createRFSystemFieldedStatus(TListCSG value) {
    return new JAXBElement<>(_RFSystemFieldedStatus_QNAME, TListCSG.class, RFSystem.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS70 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InitialCost", scope = RFSystem.class)
  public JAXBElement<TS70> createRFSystemInitialCost(TS70 value) {
    return new JAXBElement<>(_SSRequestInitialCost_QNAME, TS70.class, RFSystem.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Emergency", scope = RFSystem.class)
  public JAXBElement<TListCBO> createRFSystemEmergency(TListCBO value) {
    return new JAXBElement<>(_AssignmentEmergency_QNAME, TListCBO.class, RFSystem.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMax", scope = Polygon.class)
  public JAXBElement<TAltitude> createPolygonAltitudeMax(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMax_QNAME, TAltitude.class, Polygon.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMin", scope = Polygon.class)
  public JAXBElement<TAltitude> createPolygonAltitudeMin(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMin_QNAME, TAltitude.class, Polygon.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Excluded", scope = Polygon.class)
  public JAXBElement<TListCBO> createPolygonExcluded(TListCBO value) {
    return new JAXBElement<>(_EllipseExcluded_QNAME, TListCBO.class, Polygon.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MinSeparation", scope = TxSignalTuning.class)
  public JAXBElement<TFreqM> createTxSignalTuningMinSeparation(TFreqM value) {
    return new JAXBElement<>(_TxSignalTuningMinSeparation_QNAME, TFreqM.class, TxSignalTuning.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN8 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumPresetChannels", scope = TxSignalTuning.class)
  public JAXBElement<TUN8> createTxSignalTuningNumPresetChannels(TUN8 value) {
    return new JAXBElement<>(_TxSignalTuningNumPresetChannels_QNAME, TUN8.class, TxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TuningStep", scope = TxSignalTuning.class)
  public JAXBElement<TFreqM> createTxSignalTuningTuningStep(TFreqM value) {
    return new JAXBElement<>(_TxSignalTuningTuningStep_QNAME, TFreqM.class, TxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = TxSignalTuning.class)
  public JAXBElement<TFreqM> createTxSignalTuningFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, TxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LowestUsableChannel", scope = TxSignalTuning.class)
  public JAXBElement<TFreqM> createTxSignalTuningLowestUsableChannel(TFreqM value) {
    return new JAXBElement<>(_TxSignalTuningLowestUsableChannel_QNAME, TFreqM.class, TxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TdBWHz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SpectralPowerDensity", scope = TxAntModeRef.class)
  public JAXBElement<TdBWHz> createTxAntModeRefSpectralPowerDensity(TdBWHz value) {
    return new JAXBElement<>(_TxAntModeRefSpectralPowerDensity_QNAME, TdBWHz.class, TxAntModeRef.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN7_1 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NoiseTemp", scope = RxMode.class)
  public JAXBElement<TUN7_1> createRxModeNoiseTemp(TUN7_1 value) {
    return new JAXBElement<>(_RxModeNoiseTemp_QNAME, TUN7_1.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ProcessingGain", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeProcessingGain(TdB value) {
    return new JAXBElement<>(_RxModeProcessingGain_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NecessaryBw", scope = RxMode.class)
  public JAXBElement<TFreqM> createRxModeNecessaryBw(TFreqM value) {
    return new JAXBElement<>(_EmissionNecessaryBw_QNAME, TFreqM.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSN16_15 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SensitivityCriteriaLevel", scope = RxMode.class)
  public JAXBElement<TSN16_15> createRxModeSensitivityCriteriaLevel(TSN16_15 value) {
    return new JAXBElement<>(_RxModeSensitivityCriteriaLevel_QNAME, TSN16_15.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = RxMode.class)
  public JAXBElement<TS100> createRxModeDescription(TS100 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS100.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermodEffect", scope = RxMode.class)
  public JAXBElement<TMEMO> createRxModeIntermodEffect(TMEMO value) {
    return new JAXBElement<>(_RxModeIntermodEffect_QNAME, TMEMO.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModeName", scope = RxMode.class)
  public JAXBElement<TS40> createRxModeModeName(TS40 value) {
    return new JAXBElement<>(_AntModeModeName_QNAME, TS40.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SensitivityCriteriaType", scope = RxMode.class)
  public JAXBElement<TS50> createRxModeSensitivityCriteriaType(TS50 value) {
    return new JAXBElement<>(_RxModeSensitivityCriteriaType_QNAME, TS50.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SensitivityCriteriaText", scope = RxMode.class)
  public JAXBElement<TS50> createRxModeSensitivityCriteriaText(TS50 value) {
    return new JAXBElement<>(_RxModeSensitivityCriteriaText_QNAME, TS50.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NoiseFigure", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeNoiseFigure(TdB value) {
    return new JAXBElement<>(_RxModeNoiseFigure_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermodRejection", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeIntermodRejection(TdB value) {
    return new JAXBElement<>(_RxModeIntermodRejection_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AdjacentChannelSelectivity", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeAdjacentChannelSelectivity(TdB value) {
    return new JAXBElement<>(_RxModeAdjacentChannelSelectivity_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RxType", scope = RxMode.class)
  public JAXBElement<TS50> createRxModeRxType(TS50 value) {
    return new JAXBElement<>(_RxModeRxType_QNAME, TS50.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Tunability", scope = RxMode.class)
  public JAXBElement<TS25> createRxModeTunability(TS25 value) {
    return new JAXBElement<>(_RxModeTunability_QNAME, TS25.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SpuriousRejection", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeSpuriousRejection(TdB value) {
    return new JAXBElement<>(_RxModeSpuriousRejection_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ImageRejection", scope = RxMode.class)
  public JAXBElement<TdB> createRxModeImageRejection(TdB value) {
    return new JAXBElement<>(_RxModeImageRejection_QNAME, TdB.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PostDetectionFreqMax", scope = RxMode.class)
  public JAXBElement<TFreqM> createRxModePostDetectionFreqMax(TFreqM value) {
    return new JAXBElement<>(_RxModePostDetectionFreqMax_QNAME, TFreqM.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PostDetectionFreqMin", scope = RxMode.class)
  public JAXBElement<TFreqM> createRxModePostDetectionFreqMin(TFreqM value) {
    return new JAXBElement<>(_RxModePostDetectionFreqMin_QNAME, TFreqM.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TuningMethod", scope = RxMode.class)
  public JAXBElement<TS50> createRxModeTuningMethod(TS50 value) {
    return new JAXBElement<>(_RxModeTuningMethod_QNAME, TS50.class, RxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdBm }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SensitivityLevel", scope = RxMode.class)
  public JAXBElement<TdBm> createRxModeSensitivityLevel(TdBm value) {
    return new JAXBElement<>(_RxModeSensitivityLevel_QNAME, TdBm.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TPercent }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermodPct", scope = RxMode.class)
  public JAXBElement<TPercent> createRxModeIntermodPct(TPercent value) {
    return new JAXBElement<>(_RxModeIntermodPct_QNAME, TPercent.class, RxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMax", scope = Point.class)
  public JAXBElement<TAltitude> createPointAltitudeMax(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMax_QNAME, TAltitude.class, Point.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TerrainElevation", scope = Point.class)
  public JAXBElement<TAltitude> createPointTerrainElevation(TAltitude value) {
    return new JAXBElement<>(_PointTerrainElevation_QNAME, TAltitude.class, Point.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AltitudeMin", scope = Point.class)
  public JAXBElement<TAltitude> createPointAltitudeMin(TAltitude value) {
    return new JAXBElement<>(_EllipseAltitudeMin_QNAME, TAltitude.class, Point.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Excluded", scope = Point.class)
  public JAXBElement<TListCBO> createPointExcluded(TListCBO value) {
    return new JAXBElement<>(_EllipseExcluded_QNAME, TListCBO.class, Point.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BandNotes", scope = FreqBand.class)
  public JAXBElement<TMEMO> createFreqBandBandNotes(TMEMO value) {
    return new JAXBElement<>(_FreqBandBandNotes_QNAME, TMEMO.class, FreqBand.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UseIndicator", scope = FreqBand.class)
  public JAXBElement<TS40> createFreqBandUseIndicator(TS40 value) {
    return new JAXBElement<>(_FreqBandUseIndicator_QNAME, TS40.class, FreqBand.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NecessaryBw", scope = TxMode.class)
  public JAXBElement<TFreqM> createTxModeNecessaryBw(TFreqM value) {
    return new JAXBElement<>(_EmissionNecessaryBw_QNAME, TFreqM.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = TxMode.class)
  public JAXBElement<TS100> createTxModeDescription(TS100 value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TS100.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermodEffect", scope = TxMode.class)
  public JAXBElement<TMEMO> createTxModeIntermodEffect(TMEMO value) {
    return new JAXBElement<>(_RxModeIntermodEffect_QNAME, TMEMO.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModeName", scope = TxMode.class)
  public JAXBElement<TS40> createTxModeModeName(TS40 value) {
    return new JAXBElement<>(_AntModeModeName_QNAME, TS40.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GpsWBL2Level", scope = TxMode.class)
  public JAXBElement<TUS_DBWHz> createTxModeGpsWBL2Level(TUS_DBWHz value) {
    return new JAXBElement<>(_TxModeGpsWBL2Level_QNAME, TUS_DBWHz.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN12_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BurstRate", scope = TxMode.class)
  public JAXBElement<TUN12_3> createTxModeBurstRate(TUN12_3 value) {
    return new JAXBElement<>(_TxModeBurstRate_QNAME, TUN12_3.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GpsWBL1Level", scope = TxMode.class)
  public JAXBElement<TUS_DBWHz> createTxModeGpsWBL1Level(TUS_DBWHz value) {
    return new JAXBElement<>(_TxModeGpsWBL1Level_QNAME, TUS_DBWHz.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GpsNBL1Level", scope = TxMode.class)
  public JAXBElement<TUS_DBW> createTxModeGpsNBL1Level(TUS_DBW value) {
    return new JAXBElement<>(_TxModeGpsNBL1Level_QNAME, TUS_DBW.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BurstDuration", scope = TxMode.class)
  public JAXBElement<Tmicrosecs> createTxModeBurstDuration(Tmicrosecs value) {
    return new JAXBElement<>(_TxModeBurstDuration_QNAME, Tmicrosecs.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BurstOffTime", scope = TxMode.class)
  public JAXBElement<Tmicrosecs> createTxModeBurstOffTime(Tmicrosecs value) {
    return new JAXBElement<>(_TxModeBurstOffTime_QNAME, Tmicrosecs.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SecondHarmonicLevel", scope = TxMode.class)
  public JAXBElement<TdB> createTxModeSecondHarmonicLevel(TdB value) {
    return new JAXBElement<>(_TxModeSecondHarmonicLevel_QNAME, TdB.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "GpsNBL2Level", scope = TxMode.class)
  public JAXBElement<TUS_DBW> createTxModeGpsNBL2Level(TUS_DBW value) {
    return new JAXBElement<>(_TxModeGpsNBL2Level_QNAME, TUS_DBW.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumSubCarriers", scope = TxMode.class)
  public JAXBElement<TUN5> createTxModeNumSubCarriers(TUN5 value) {
    return new JAXBElement<>(_TxModeNumSubCarriers_QNAME, TUN5.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ThirdHarmonicLevel", scope = TxMode.class)
  public JAXBElement<TdB> createTxModeThirdHarmonicLevel(TdB value) {
    return new JAXBElement<>(_TxModeThirdHarmonicLevel_QNAME, TdB.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OccBwCalculated", scope = TxMode.class)
  public JAXBElement<TListCBO> createTxModeOccBwCalculated(TListCBO value) {
    return new JAXBElement<>(_TxModeOccBwCalculated_QNAME, TListCBO.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SpuriousLevel", scope = TxMode.class)
  public JAXBElement<TdB> createTxModeSpuriousLevel(TdB value) {
    return new JAXBElement<>(_TxModeSpuriousLevel_QNAME, TdB.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Tunability", scope = TxMode.class)
  public JAXBElement<TS25> createTxModeTunability(TS25 value) {
    return new JAXBElement<>(_RxModeTunability_QNAME, TS25.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModulationType", scope = TxMode.class)
  public JAXBElement<TS10> createTxModeModulationType(TS10 value) {
    return new JAXBElement<>(_TxModeModulationType_QNAME, TS10.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "RadarType", scope = TxMode.class)
  public JAXBElement<TS25> createTxModeRadarType(TS25 value) {
    return new JAXBElement<>(_TxModeRadarType_QNAME, TS25.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN8 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "BurstNumPulses", scope = TxMode.class)
  public JAXBElement<TUN8> createTxModeBurstNumPulses(TUN8 value) {
    return new JAXBElement<>(_TxModeBurstNumPulses_QNAME, TUN8.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TuningMethod", scope = TxMode.class)
  public JAXBElement<TS50> createTxModeTuningMethod(TS50 value) {
    return new JAXBElement<>(_RxModeTuningMethod_QNAME, TS50.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TdB }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OtherHarmonicLevel", scope = TxMode.class)
  public JAXBElement<TdB> createTxModeOtherHarmonicLevel(TdB value) {
    return new JAXBElement<>(_TxModeOtherHarmonicLevel_QNAME, TdB.class, TxMode.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TPercent }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IntermodPct", scope = TxMode.class)
  public JAXBElement<TPercent> createTxModeIntermodPct(TPercent value) {
    return new JAXBElement<>(_RxModeIntermodPct_QNAME, TPercent.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumSideTones", scope = TxMode.class)
  public JAXBElement<TUN5> createTxModeNumSideTones(TUN5 value) {
    return new JAXBElement<>(_TxModeNumSideTones_QNAME, TUN5.class, TxMode.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN8 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumPresetChannels", scope = RxSignalTuning.class)
  public JAXBElement<TUN8> createRxSignalTuningNumPresetChannels(TUN8 value) {
    return new JAXBElement<>(_TxSignalTuningNumPresetChannels_QNAME, TUN8.class, RxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TuningStep", scope = RxSignalTuning.class)
  public JAXBElement<TFreqM> createRxSignalTuningTuningStep(TFreqM value) {
    return new JAXBElement<>(_TxSignalTuningTuningStep_QNAME, TFreqM.class, RxSignalTuning.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = RxSignalTuning.class)
  public JAXBElement<TFreqM> createRxSignalTuningFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, RxSignalTuning.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Filter", scope = Transmitter.class)
  public JAXBElement<TMEMO> createTransmitterFilter(TMEMO value) {
    return new JAXBElement<>(_TransmitterFilter_QNAME, TMEMO.class, Transmitter.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TSPR", scope = Transmitter.class)
  public JAXBElement<TS10> createTransmitterTSPR(TS10 value) {
    return new JAXBElement<>(_ReceiverTSPR_QNAME, TS10.class, Transmitter.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS40 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OutputDevice", scope = Transmitter.class)
  public JAXBElement<TS40> createTransmitterOutputDevice(TS40 value) {
    return new JAXBElement<>(_TransmitterOutputDevice_QNAME, TS40.class, Transmitter.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OutputDeviceType", scope = Transmitter.class)
  public JAXBElement<TS50> createTransmitterOutputDeviceType(TS50 value) {
    return new JAXBElement<>(_TransmitterOutputDeviceType_QNAME, TS50.class, Transmitter.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FCCAcceptanceNum", scope = Transmitter.class)
  public JAXBElement<TS50> createTransmitterFCCAcceptanceNum(TS50 value) {
    return new JAXBElement<>(_ReceiverFCCAcceptanceNum_QNAME, TS50.class, Transmitter.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DuplexSepType", scope = Transmitter.class)
  public JAXBElement<TS10> createTransmitterDuplexSepType(TS10 value) {
    return new JAXBElement<>(_ReceiverDuplexSepType_QNAME, TS10.class, Transmitter.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModFreqMin", scope = Baseband.class)
  public JAXBElement<TFreqM> createBasebandModFreqMin(TFreqM value) {
    return new JAXBElement<>(_BasebandModFreqMin_QNAME, TFreqM.class, Baseband.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SignalType", scope = Baseband.class)
  public JAXBElement<TS50> createBasebandSignalType(TS50 value) {
    return new JAXBElement<>(_BasebandSignalType_QNAME, TS50.class, Baseband.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ModFreqMax", scope = Baseband.class)
  public JAXBElement<TFreqM> createBasebandModFreqMax(TFreqM value) {
    return new JAXBElement<>(_BasebandModFreqMax_QNAME, TFreqM.class, Baseband.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Date ", scope = PreviousAuthorization.class)
  public JAXBElement<TD> createPreviousAuthorizationDate_0020(TD value) {
    return new JAXBElement<>(_PreviousAuthorizationDate_0020_QNAME, TD.class, PreviousAuthorization.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS12 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AgencySerialNum", scope = PreviousAuthorization.class)
  public JAXBElement<TS12> createPreviousAuthorizationAgencySerialNum(TS12 value) {
    return new JAXBElement<>(_TrunkingAssignmentAgencySerialNum_QNAME, TS12.class, PreviousAuthorization.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PointToMultiPoint", scope = DiagramEndpoint.class)
  public JAXBElement<TListCBO> createDiagramEndpointPointToMultiPoint(TListCBO value) {
    return new JAXBElement<>(_DiagramEndpointPointToMultiPoint_QNAME, TListCBO.class, DiagramEndpoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IconPosLeft", scope = DiagramEndpoint.class)
  public JAXBElement<TUN6> createDiagramEndpointIconPosLeft(TUN6 value) {
    return new JAXBElement<>(_DiagramEndpointIconPosLeft_QNAME, TUN6.class, DiagramEndpoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IconType", scope = DiagramEndpoint.class)
  public JAXBElement<TS25> createDiagramEndpointIconType(TS25 value) {
    return new JAXBElement<>(_DiagramEndpointIconType_QNAME, TS25.class, DiagramEndpoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IconPosTop", scope = DiagramEndpoint.class)
  public JAXBElement<TUN6> createDiagramEndpointIconPosTop(TUN6 value) {
    return new JAXBElement<>(_DiagramEndpointIconPosTop_QNAME, TUN6.class, DiagramEndpoint.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TIFNum }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StageNum", scope = FreqConversion.class)
  public JAXBElement<TIFNum> createFreqConversionStageNum(TIFNum value) {
    return new JAXBElement<>(_FreqConversionStageNum_QNAME, TIFNum.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IFMin", scope = FreqConversion.class)
  public JAXBElement<TFreqM> createFreqConversionIFMin(TFreqM value) {
    return new JAXBElement<>(_FreqConversionIFMin_QNAME, TFreqM.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCLO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "OscillatorTuning", scope = FreqConversion.class)
  public JAXBElement<TListCLO> createFreqConversionOscillatorTuning(TListCLO value) {
    return new JAXBElement<>(_FreqConversionOscillatorTuning_QNAME, TListCLO.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LOFreqMax", scope = FreqConversion.class)
  public JAXBElement<TFreqM> createFreqConversionLOFreqMax(TFreqM value) {
    return new JAXBElement<>(_FreqConversionLOFreqMax_QNAME, TFreqM.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LOFreqMin", scope = FreqConversion.class)
  public JAXBElement<TFreqM> createFreqConversionLOFreqMin(TFreqM value) {
    return new JAXBElement<>(_FreqConversionLOFreqMin_QNAME, TFreqM.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IFMax", scope = FreqConversion.class)
  public JAXBElement<TFreqM> createFreqConversionIFMax(TFreqM value) {
    return new JAXBElement<>(_FreqConversionIFMax_QNAME, TFreqM.class, FreqConversion.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Description", scope = Project.class)
  public JAXBElement<TMEMO> createProjectDescription(TMEMO value) {
    return new JAXBElement<>(_AntModeDescription_QNAME, TMEMO.class, Project.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = Project.class)
  public JAXBElement<TS10> createProjectType(TS10 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS10.class, Project.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NecessaryBwMin", scope = ConfigEmission.class)
  public JAXBElement<TFreqM> createConfigEmissionNecessaryBwMin(TFreqM value) {
    return new JAXBElement<>(_ConfigEmissionNecessaryBwMin_QNAME, TFreqM.class, ConfigEmission.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NecessaryBwMax", scope = ConfigEmission.class)
  public JAXBElement<TFreqM> createConfigEmissionNecessaryBwMax(TFreqM value) {
    return new JAXBElement<>(_ConfigEmissionNecessaryBwMax_QNAME, TFreqM.class, ConfigEmission.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EmsClass", scope = ConfigEmission.class)
  public JAXBElement<TEmsDes> createConfigEmissionEmsClass(TEmsDes value) {
    return new JAXBElement<>(_EmissionEmsClass_QNAME, TEmsDes.class, ConfigEmission.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS25 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Type", scope = StockNum.class)
  public JAXBElement<TS25> createStockNumType(TS25 value) {
    return new JAXBElement<>(_SpreadSpectrumType_QNAME, TS25.class, StockNum.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FrontToBackRatio", scope = AntGain.class)
  public JAXBElement<TUN5_2> createAntGainFrontToBackRatio(TUN5_2 value) {
    return new JAXBElement<>(_AntGainFrontToBackRatio_QNAME, TUN5_2.class, AntGain.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Freq", scope = AntGain.class)
  public JAXBElement<TFreqM> createAntGainFreq(TFreqM value) {
    return new JAXBElement<>(_VSWRFreq_QNAME, TFreqM.class, AntGain.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Calculated", scope = AntGain.class)
  public JAXBElement<TListCBO> createAntGainCalculated(TListCBO value) {
    return new JAXBElement<>(_PowerCalculated_QNAME, TListCBO.class, AntGain.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = ConfigFreq.class)
  public JAXBElement<TFreqM> createConfigFreqFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, ConfigFreq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "InBand", scope = ConfigFreq.class)
  public JAXBElement<TListCBO> createConfigFreqInBand(TListCBO value) {
    return new JAXBElement<>(_ConfigFreqInBand_QNAME, TListCBO.class, ConfigFreq.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS10 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Priority", scope = ConfigFreq.class)
  public JAXBElement<TS10> createConfigFreqPriority(TS10 value) {
    return new JAXBElement<>(_TuningPriority_QNAME, TS10.class, ConfigFreq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = AntEfficiency.class)
  public JAXBElement<TFreqM> createAntEfficiencyFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, AntEfficiency.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CositeSep", scope = Station.class)
  public JAXBElement<TFreqM> createStationCositeSep(TFreqM value) {
    return new JAXBElement<>(_StationCositeSep_QNAME, TFreqM.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS20 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CallSign", scope = Station.class)
  public JAXBElement<TS20> createStationCallSign(TS20 value) {
    return new JAXBElement<>(_SatelliteCallSign_QNAME, TS20.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS6 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "UserCode", scope = Station.class)
  public JAXBElement<TS6> createStationUserCode(TS6 value) {
    return new JAXBElement<>(_StationUserCode_QNAME, TS6.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumMobileUnits", scope = Station.class)
  public JAXBElement<TUN9> createStationNumMobileUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumMobileUnits_QNAME, TUN9.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumCositedUnits", scope = Station.class)
  public JAXBElement<TUN9> createStationNumCositedUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumCositedUnits_QNAME, TUN9.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AntStructureHeight", scope = Station.class)
  public JAXBElement<TUN3> createStationAntStructureHeight(TUN3 value) {
    return new JAXBElement<>(_StationAntStructureHeight_QNAME, TUN3.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TMEMO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CositeSepDescription", scope = Station.class)
  public JAXBElement<TMEMO> createStationCositeSepDescription(TMEMO value) {
    return new JAXBElement<>(_StationCositeSepDescription_QNAME, TMEMO.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS18 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StationControl", scope = Station.class)
  public JAXBElement<TS18> createStationStationControl(TS18 value) {
    return new JAXBElement<>(_StationStationControl_QNAME, TS18.class, Station.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TTSDFValue }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TSDF", scope = Station.class)
  public JAXBElement<TTSDFValue> createStationTSDF(TTSDFValue value) {
    return new JAXBElement<>(_StationTSDF_QNAME, TTSDFValue.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN9 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumAreaUnits", scope = Station.class)
  public JAXBElement<TUN9> createStationNumAreaUnits(TUN9 value) {
    return new JAXBElement<>(_SSRequestNumAreaUnits_QNAME, TUN9.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "StationName", scope = Station.class)
  public JAXBElement<TS100> createStationStationName(TS100 value) {
    return new JAXBElement<>(_StationStationName_QNAME, TS100.class, Station.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DigitalModType", scope = RxModulation.class)
  public JAXBElement<TS50> createRxModulationDigitalModType(TS50 value) {
    return new JAXBElement<>(_RxModulationDigitalModType_QNAME, TS50.class, RxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CodePeriod", scope = RxModulation.class)
  public JAXBElement<Tmicrosecs> createRxModulationCodePeriod(Tmicrosecs value) {
    return new JAXBElement<>(_RxModulationCodePeriod_QNAME, Tmicrosecs.class, RxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "CodeRate", scope = RxModulation.class)
  public JAXBElement<TUN10_3> createRxModulationCodeRate(TUN10_3 value) {
    return new JAXBElement<>(_SpreadSpectrumCodeRate_QNAME, TUN10_3.class, RxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LineCoding", scope = RxModulation.class)
  public JAXBElement<TS50> createRxModulationLineCoding(TS50 value) {
    return new JAXBElement<>(_RxModulationLineCoding_QNAME, TS50.class, RxModulation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TUN5 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "NumStates", scope = RxModulation.class)
  public JAXBElement<TUN5> createRxModulationNumStates(TUN5 value) {
    return new JAXBElement<>(_RxModulationNumStates_QNAME, TUN5.class, RxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MaxBitRate", scope = RxModulation.class)
  public JAXBElement<TUN10_3> createRxModulationMaxBitRate(TUN10_3 value) {
    return new JAXBElement<>(_RxModulationMaxBitRate_QNAME, TUN10_3.class, RxModulation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AntennaHeight", scope = EndpointLocation.class)
  public JAXBElement<TAltitude> createEndpointLocationAntennaHeight(TAltitude value) {
    return new JAXBElement<>(_EndpointLocationAntennaHeight_QNAME, TAltitude.class, EndpointLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "LocSatRef", scope = EndpointLocation.class)
  public JAXBElement<TSerial> createEndpointLocationLocSatRef(TSerial value) {
    return new JAXBElement<>(_StationLocLocSatRef_QNAME, TSerial.class, EndpointLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAz180 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "MinPointAngle", scope = EndpointLocation.class)
  public JAXBElement<TAz180> createEndpointLocationMinPointAngle(TAz180 value) {
    return new JAXBElement<>(_EndpointLocationMinPointAngle_QNAME, TAz180.class, EndpointLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "Excluded", scope = EndpointLocation.class)
  public JAXBElement<TListCBO> createEndpointLocationExcluded(TListCBO value) {
    return new JAXBElement<>(_EllipseExcluded_QNAME, TListCBO.class, EndpointLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TAltitude }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SiteElevation", scope = EndpointLocation.class)
  public JAXBElement<TAltitude> createEndpointLocationSiteElevation(TAltitude value) {
    return new JAXBElement<>(_EndpointLocationSiteElevation_QNAME, TAltitude.class, EndpointLocation.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TListCBO }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "AllocatedByFootnote", scope = Allocation.class)
  public JAXBElement<TListCBO> createAllocationAllocatedByFootnote(TListCBO value) {
    return new JAXBElement<>(_AllocationAllocatedByFootnote_QNAME, TListCBO.class, Allocation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "EffectiveDate", scope = Allocation.class)
  public JAXBElement<TD> createAllocationEffectiveDate(TD value) {
    return new JAXBElement<>(_TOAEffectiveDate_QNAME, TD.class, Allocation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = Allocation.class)
  public JAXBElement<TD> createAllocationExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, Allocation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS100 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReplyingAuthority", scope = SSReply.class)
  public JAXBElement<TS100> createSSReplyReplyingAuthority(TS100 value) {
    return new JAXBElement<>(_SSReplyReplyingAuthority_QNAME, TS100.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "IRACNumber", scope = SSReply.class)
  public JAXBElement<TS50> createSSReplyIRACNumber(TS50 value) {
    return new JAXBElement<>(_SSReplyIRACNumber_QNAME, TS50.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FASNumber", scope = SSReply.class)
  public JAXBElement<TS50> createSSReplyFASNumber(TS50 value) {
    return new JAXBElement<>(_SSReplyFASNumber_QNAME, TS50.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS11 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ApprovalSPSNum", scope = SSReply.class)
  public JAXBElement<TS11> createSSReplyApprovalSPSNum(TS11 value) {
    return new JAXBElement<>(_SSReplyApprovalSPSNum_QNAME, TS11.class, SSReply.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TSerial }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "SSRequestRef", scope = SSReply.class)
  public JAXBElement<TSerial> createSSReplySSRequestRef(TSerial value) {
    return new JAXBElement<>(_RelatedSupportabilitySSRequestRef_QNAME, TSerial.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TS50 }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ERPNumber", scope = SSReply.class)
  public JAXBElement<TS50> createSSReplyERPNumber(TS50 value) {
    return new JAXBElement<>(_SSReplyERPNumber_QNAME, TS50.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ReviewDate", scope = SSReply.class)
  public JAXBElement<TD> createSSReplyReviewDate(TD value) {
    return new JAXBElement<>(_AssignmentReviewDate_QNAME, TD.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "DateReceivedByCountry", scope = SSReply.class)
  public JAXBElement<TD> createSSReplyDateReceivedByCountry(TD value) {
    return new JAXBElement<>(_SSReplyDateReceivedByCountry_QNAME, TD.class, SSReply.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TD }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "ExpirationDate", scope = SSReply.class)
  public JAXBElement<TD> createSSReplyExpirationDate(TD value) {
    return new JAXBElement<>(_TOAExpirationDate_QNAME, TD.class, SSReply.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "TuningStep", scope = AllotFreq.class)
  public JAXBElement<TFreqM> createAllotFreqTuningStep(TFreqM value) {
    return new JAXBElement<>(_TxSignalTuningTuningStep_QNAME, TFreqM.class, AllotFreq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "FreqMax", scope = AllotFreq.class)
  public JAXBElement<TFreqM> createAllotFreqFreqMax(TFreqM value) {
    return new JAXBElement<>(_AsgnFreqBaseFreqMax_QNAME, TFreqM.class, AllotFreq.class, value);
  }

  /**
   * Create an instance of
   * {@link JAXBElement }{@code <}{@link TFreqM }{@code >}}
   * <p>
   */
  @XmlElementDecl(namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", name = "PairedFreqMin", scope = AllotFreq.class)
  public JAXBElement<TFreqM> createAllotFreqPairedFreqMin(TFreqM value) {
    return new JAXBElement<>(_AllotFreqPairedFreqMin_QNAME, TFreqM.class, AllotFreq.class, value);
  }

}
