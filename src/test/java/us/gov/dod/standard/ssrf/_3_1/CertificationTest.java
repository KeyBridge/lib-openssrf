/*
 * Copyright 2015 OpenSSRF.org.
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
package us.gov.dod.standard.ssrf._3_1;

import junit.framework.TestCase;
import us.gov.dod.standard.ssrf.EDatasetType;
import us.gov.dod.standard.ssrf.SSRFTestUtility;

/**
 *
 * @author jesse
 */
public class CertificationTest extends TestCase {

  public CertificationTest() {
  }

  public CertificationTest(String name) {
    super(name);
  }

  /**
   * Build the test methods. Copy them from the console into this class.
   */
  public void _testBuilder() {
    for (EDatasetType ssrfType : EDatasetType.values()) {

      System.out.println("\n  //<editor-fold defaultstate=\"collapsed\" desc=\"Certification Test for " + ssrfType.getClassSimpleName() + "\">");

      /**
       * testMaximumPositiveFill
       */
      System.out.println("/**\nTest a MAX-fill record with a GOOD configuration.\n@throws Exception if the SSRF document fails to validate.\n*/");
      System.out.println("public void testMaximumPositiveFill_" + ssrfType.name() + "() throws Exception {    SSRFTestUtility.testMaximumPositiveFill(EDatasetType." + ssrfType.name() + ");  }");
      /**
       * testMinimumPositiveFill
       */
      System.out.println("/**\nTest a MIN-fill record with a GOOD configuration.\n@throws Exception if the SSRF document fails to validate.\n*/");
      System.out.println("public void testMinimumPositiveFill_" + ssrfType.name() + "() throws Exception {    SSRFTestUtility.testMinimumPositiveFill(EDatasetType." + ssrfType.name() + ");  }");

      /**
       * testMaximumNegativeFill
       */
      System.out.println("/**\nTest a MAX-fill record with randomly seeded BAD configuration(s).\n@throws Exception if the SSRF document fails to validate.\n*/");
      System.out.println("public void testMaximumNegativeFill_" + ssrfType.name() + "() throws Exception {    SSRFTestUtility.testMaximumNegativeFill(EDatasetType." + ssrfType.name() + ");  }");

      /**
       * testMinimumNegativeFill
       */
      System.out.println("/**\nTest a MIN-fill record with randomly seeded BAD configuration(s).\n@throws Exception if the SSRF document fails to validate.\n*/");
      System.out.println("public void testMinimumNegativeFill_" + ssrfType.name() + "() throws Exception {    SSRFTestUtility.testMinimumNegativeFill(EDatasetType." + ssrfType.name() + ");  }//</editor-fold>");
    }
  }

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Administrative">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_AD() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.AD);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_AD() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.AD);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_AD() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.AD);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_AD() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.AD);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Allotment">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_AL() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.AL);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_AL() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.AL);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_AL() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.AL);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_AL() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.AL);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Antenna">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_AN() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.AN);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_AN() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.AN);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_AN() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.AN);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_AN() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.AN);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Assignment">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_AS() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.AS);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_AS() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.AS);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_AS() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.AS);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_AS() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.AS);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Contact">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_CN() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.CN);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_CN() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.CN);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_CN() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.CN);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_CN() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.CN);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for ChannelPlan">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_CP() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.CP);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_CP() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.CP);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_CP() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.CP);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_CP() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.CP);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for ExternalReference">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_EX() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.EX);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_EX() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.EX);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_EX() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.EX);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_EX() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.EX);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for FEDeployment">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_FD() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.FD);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_FD() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.FD);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_FD() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.FD);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_FD() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.FD);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for ForceElement">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_FE() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.FE);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_FE() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.FE);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_FE() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.FE);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_FE() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.FE);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for SSReply">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_HD() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.HD);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_HD() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.HD);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_HD() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.HD);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_HD() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.HD);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for IntfReport">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_IF() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.IF);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_IF() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.IF);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_IF() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.IF);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_IF() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.IF);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Role">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_JA() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.JA);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_JA() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.JA);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_JA() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.JA);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_JA() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.JA);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for JRFL">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_JR() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.JR);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_JR() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.JR);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_JR() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.JR);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_JR() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.JR);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Location">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_LO() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.LO);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_LO() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.LO);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_LO() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.LO);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_LO() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.LO);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Loadset">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_LS() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.LS);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_LS() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.LS);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_LS() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.LS);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_LS() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.LS);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Message">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_MS() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.MS);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_MS() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.MS);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_MS() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.MS);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_MS() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.MS);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Note">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_NT() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.NT);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_NT() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.NT);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_NT() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.NT);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_NT() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.NT);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Organisation">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_OR() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.OR);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_OR() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.OR);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_OR() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.OR);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_OR() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.OR);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for RadiationPlan">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_RP() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.RP);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_RP() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.RP);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_RP() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.RP);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_RP() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.RP);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Receiver">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_RX() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.RX);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_RX() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.RX);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_RX() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.RX);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_RX() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.RX);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Satellite">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_SA() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.SA);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_SA() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.SA);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_SA() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.SA);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_SA() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.SA);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for SSRequest">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_SR() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.SR);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_SR() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.SR);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_SR() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.SR);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_SR() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.SR);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for TOA">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_TA() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.TA);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_TA() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.TA);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_TA() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.TA);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_TA() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.TA);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for RFSystem">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_TR() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.TR);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_TR() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.TR);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_TR() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.TR);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_TR() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.TR);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Transmitter">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_TX() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.TX);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_TX() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.TX);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_TX() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.TX);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_TX() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.TX);
  }//</editor-fold>
}
