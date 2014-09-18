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
 * Java class for ListCAT.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCAT"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Adcock
 * Array"/> &lt;enumeration value="Annular Slot"/> &lt;enumeration
 * value="Aperture"/> &lt;enumeration value="Axial Mode Helix"/> &lt;enumeration
 * value="Backfill Radiator"/> &lt;enumeration value="Backfire"/>
 * &lt;enumeration value="Backfire Array"/> &lt;enumeration value="Balanced T"/>
 * &lt;enumeration value="Batwing"/> &lt;enumeration value="Batwing Array"/>
 * &lt;enumeration value="Biconical"/> &lt;enumeration value="Biconical
 * Dipole"/> &lt;enumeration value="Biconical Horn"/> &lt;enumeration
 * value="Billboard"/> &lt;enumeration value="Blade"/> &lt;enumeration
 * value="Bow Tie"/> &lt;enumeration value="Bow Tie Array"/> &lt;enumeration
 * value="Broadside Array"/> &lt;enumeration value="Cassegrain"/>
 * &lt;enumeration value="Cavity Backed Dipole"/> &lt;enumeration value="Cavity
 * Backed Monopole"/> &lt;enumeration value="Cavity Backed Slot"/>
 * &lt;enumeration value="Cavity Backed Spiral"/> &lt;enumeration value="Clover
 * Leaf"/> &lt;enumeration value="Coaxial Dipole"/> &lt;enumeration
 * value="Collinear Array"/> &lt;enumeration value="Conformal Array"/>
 * &lt;enumeration value="Conical Horn"/> &lt;enumeration value="Conical
 * Monopole"/> &lt;enumeration value="Conical Spiral"/> &lt;enumeration
 * value="Coplanar Array"/> &lt;enumeration value="Corner Reflector"/>
 * &lt;enumeration value="Corrugated Horn"/> &lt;enumeration value="Corrugated
 * Rod"/> &lt;enumeration value="Crossed Dipoles"/> &lt;enumeration
 * value="Crossed Log Periodic Array"/> &lt;enumeration value="Crossed Loops"/>
 * &lt;enumeration value="CSC2 Reflector"/> &lt;enumeration value="Cubical
 * Quad"/> &lt;enumeration value="Cubical Quad Array"/> &lt;enumeration
 * value="Cup-Dipole"/> &lt;enumeration value="Cup-Dipole-Array"/>
 * &lt;enumeration value="Cylindrical Array"/> &lt;enumeration
 * value="Cylindrical Slot"/> &lt;enumeration value="Dichroic"/> &lt;enumeration
 * value="Dielectric Horn"/> &lt;enumeration value="Dielectric Lens"/>
 * &lt;enumeration value="Dielectric Rod"/> &lt;enumeration value="Dipole"/>
 * &lt;enumeration value="Dipole Array"/> &lt;enumeration value="Dipole
 * Stacked"/> &lt;enumeration value="Dipole W/Reflector"/> &lt;enumeration
 * value="Discage"/> &lt;enumeration value="Discone"/> &lt;enumeration
 * value="Doublet"/> &lt;enumeration value="Endfire Array"/> &lt;enumeration
 * value="Equi-Angular Spiral"/> &lt;enumeration value="E-Sectoral Horn"/>
 * &lt;enumeration value="Fan Monopole"/> &lt;enumeration value="Feed"/>
 * &lt;enumeration value="Ferrite Loop"/> &lt;enumeration value="Ferrite Loop
 * Stick"/> &lt;enumeration value="Fin Cap"/> &lt;enumeration value="Flat
 * Plate"/> &lt;enumeration value="Flat Screen Reflector"/> &lt;enumeration
 * value="Flat Top"/> &lt;enumeration value="Flexible Tape"/> &lt;enumeration
 * value="Folded Dipole"/> &lt;enumeration value="Folded Dipole/W Ground
 * Plane"/> &lt;enumeration value="Folded Helix"/> &lt;enumeration value="Folded
 * Monopole"/> &lt;enumeration value="Folded Trapezoidal Log-Periodic Array"/>
 * &lt;enumeration value="Franklin"/> &lt;enumeration value="Gregorian"/>
 * &lt;enumeration value="Ground Plane"/> &lt;enumeration value="Ground-Plane
 * Whip"/> &lt;enumeration value="Half Loop"/> &lt;enumeration value="Half
 * Rhombic"/> &lt;enumeration value="Halfwave Dipole"/> &lt;enumeration
 * value="Halfwave Whip"/> &lt;enumeration value="Halo"/> &lt;enumeration
 * value="Helical"/> &lt;enumeration value="Helical Whip"/> &lt;enumeration
 * value="Helix Array"/> &lt;enumeration value="Hog Horn"/> &lt;enumeration
 * value="Horizontal Dipole"/> &lt;enumeration value="Horizontal Vee"/>
 * &lt;enumeration value="Horn"/> &lt;enumeration value="H-Sectoral Horn"/>
 * &lt;enumeration value="Inverted L"/> &lt;enumeration value="Inverted Cone"/>
 * &lt;enumeration value="Inverted Discone"/> &lt;enumeration value="Inverted
 * Vee"/> &lt;enumeration value="Leaky Coax"/> &lt;enumeration value="Lens"/>
 * &lt;enumeration value="Linear"/> &lt;enumeration value="Log Conical Spiral"/>
 * &lt;enumeration value="Log Periodic"/> &lt;enumeration value="Log Periodic
 * Array"/> &lt;enumeration value="Long Wire"/> &lt;enumeration value="Loop"/>
 * &lt;enumeration value="Loop Array"/> &lt;enumeration value="Luneburg Lens"/>
 * &lt;enumeration value="Mattress"/> &lt;enumeration value="Metal Plate Lens"/>
 * &lt;enumeration value="Microstrip"/> &lt;enumeration value="Micro-Strip
 * Array"/> &lt;enumeration value="Monopole"/> &lt;enumeration value="Monopole
 * Array"/> &lt;enumeration value="Monopole With Reflector"/> &lt;enumeration
 * value="Multi-Curtain Rhombic"/> &lt;enumeration value="Multi-Horn Array"/>
 * &lt;enumeration value="Multiple Slot"/> &lt;enumeration value="Nested
 * Rhombics"/> &lt;enumeration value="Normal Mode Helix"/> &lt;enumeration
 * value="Open Wire"/> &lt;enumeration value="Open-Ended Waveguide"/>
 * &lt;enumeration value="Orange Peel Reflector"/> &lt;enumeration value="Organ
 * Pipe"/> &lt;enumeration value="Parabolic Cylinder"/> &lt;enumeration
 * value="Parabolic High"/> &lt;enumeration value="Parabolic Mesh"/>
 * &lt;enumeration value="Parabolic Reflector"/> &lt;enumeration
 * value="Parabolic Segment"/> &lt;enumeration value="Parabolic Segment Mesh"/>
 * &lt;enumeration value="Passive Reflector"/> &lt;enumeration value="Patch"/>
 * &lt;enumeration value="Periscope"/> &lt;enumeration value="Phased Array"/>
 * &lt;enumeration value="Phased Array Dipole"/> &lt;enumeration value="Phased
 * Array Horn"/> &lt;enumeration value="Phased Array Ridged Waveguide"/>
 * &lt;enumeration value="Phased Array Waveguide"/> &lt;enumeration
 * value="Phased Array Yagi"/> &lt;enumeration value="Phased-Array Slotted
 * Waveguide"/> &lt;enumeration value="Pill Box"/> &lt;enumeration value="Pine
 * Cone"/> &lt;enumeration value="Planar Array"/> &lt;enumeration value="Planar
 * Slot"/> &lt;enumeration value="Ported Coaxial Cable"/> &lt;enumeration
 * value="Probe"/> &lt;enumeration value="Pyramidal Horn"/> &lt;enumeration
 * value="Quad Log Periodic"/> &lt;enumeration value="Quadrafilar Helix"/>
 * &lt;enumeration value="Radial Line"/> &lt;enumeration value="Rhombic"/>
 * &lt;enumeration value="Ridged Waveguide"/> &lt;enumeration value="Rod"/>
 * &lt;enumeration value="Scimitar"/> &lt;enumeration value="Single Curtain
 * Rhombic"/> &lt;enumeration value="Single Slot"/> &lt;enumeration
 * value="Single-Turn Loop"/> &lt;enumeration value="Skeleton Slot"/>
 * &lt;enumeration value="Skeleton Slot W/Reflector"/> &lt;enumeration
 * value="Sleeve Dipole"/> &lt;enumeration value="Slot"/> &lt;enumeration
 * value="Slot Array"/> &lt;enumeration value="Slotted Waveguide"/>
 * &lt;enumeration value="Slotted Waveguide Planar Array"/> &lt;enumeration
 * value="Spiral"/> &lt;enumeration value="Stacked Yagi"/> &lt;enumeration
 * value="Standing-Wave Waveguide Planar Array"/> &lt;enumeration
 * value="Stripline"/> &lt;enumeration value="Stripline Dipole"/>
 * &lt;enumeration value="Stub"/> &lt;enumeration value="Swastika"/>
 * &lt;enumeration value="Symmetrical Tee"/> &lt;enumeration value="Synthetic
 * Aperture"/> &lt;enumeration value="Top Hat"/> &lt;enumeration value="Tower"/>
 * &lt;enumeration value="Trailing Wire"/> &lt;enumeration value="Traveling
 * Wave"/> &lt;enumeration value="Traveling-Wave Waveguide Planar Array"/>
 * &lt;enumeration value="Trilinear Array"/> &lt;enumeration value="Turnstile"/>
 * &lt;enumeration value="Vee"/> &lt;enumeration value="Vertical Array"/>
 * &lt;enumeration value="Vertical Dipole"/> &lt;enumeration value="Vertical
 * Half Rhombic"/> &lt;enumeration value="Vertical Radiator"/> &lt;enumeration
 * value="Vertical Top Hat"/> &lt;enumeration value="Whip"/> &lt;enumeration
 * value="Whip Half Wave"/> &lt;enumeration value="Whip Quarter Wave"/>
 * &lt;enumeration value="Wullenweber Array"/> &lt;enumeration value="Yagi
 * Array"/> &lt;enumeration value="Yagi-Unidirectional Array"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAT")
@XmlEnum
public enum ListCAT {

  @XmlEnumValue("Adcock Array")
  ADCOCK_ARRAY("Adcock Array"),
  @XmlEnumValue("Annular Slot")
  ANNULAR_SLOT("Annular Slot"),
  @XmlEnumValue("Aperture")
  APERTURE("Aperture"),
  @XmlEnumValue("Axial Mode Helix")
  AXIAL_MODE_HELIX("Axial Mode Helix"),
  @XmlEnumValue("Backfill Radiator")
  BACKFILL_RADIATOR("Backfill Radiator"),
  @XmlEnumValue("Backfire")
  BACKFIRE("Backfire"),
  @XmlEnumValue("Backfire Array")
  BACKFIRE_ARRAY("Backfire Array"),
  @XmlEnumValue("Balanced T")
  BALANCED_T("Balanced T"),
  @XmlEnumValue("Batwing")
  BATWING("Batwing"),
  @XmlEnumValue("Batwing Array")
  BATWING_ARRAY("Batwing Array"),
  @XmlEnumValue("Biconical")
  BICONICAL("Biconical"),
  @XmlEnumValue("Biconical Dipole")
  BICONICAL_DIPOLE("Biconical Dipole"),
  @XmlEnumValue("Biconical Horn")
  BICONICAL_HORN("Biconical Horn"),
  @XmlEnumValue("Billboard")
  BILLBOARD("Billboard"),
  @XmlEnumValue("Blade")
  BLADE("Blade"),
  @XmlEnumValue("Bow Tie")
  BOW_TIE("Bow Tie"),
  @XmlEnumValue("Bow Tie Array")
  BOW_TIE_ARRAY("Bow Tie Array"),
  @XmlEnumValue("Broadside Array")
  BROADSIDE_ARRAY("Broadside Array"),
  @XmlEnumValue("Cassegrain")
  CASSEGRAIN("Cassegrain"),
  @XmlEnumValue("Cavity Backed Dipole")
  CAVITY_BACKED_DIPOLE("Cavity Backed Dipole"),
  @XmlEnumValue("Cavity Backed Monopole")
  CAVITY_BACKED_MONOPOLE("Cavity Backed Monopole"),
  @XmlEnumValue("Cavity Backed Slot")
  CAVITY_BACKED_SLOT("Cavity Backed Slot"),
  @XmlEnumValue("Cavity Backed Spiral")
  CAVITY_BACKED_SPIRAL("Cavity Backed Spiral"),
  @XmlEnumValue("Clover Leaf")
  CLOVER_LEAF("Clover Leaf"),
  @XmlEnumValue("Coaxial Dipole")
  COAXIAL_DIPOLE("Coaxial Dipole"),
  @XmlEnumValue("Collinear Array")
  COLLINEAR_ARRAY("Collinear Array"),
  @XmlEnumValue("Conformal Array")
  CONFORMAL_ARRAY("Conformal Array"),
  @XmlEnumValue("Conical Horn")
  CONICAL_HORN("Conical Horn"),
  @XmlEnumValue("Conical Monopole")
  CONICAL_MONOPOLE("Conical Monopole"),
  @XmlEnumValue("Conical Spiral")
  CONICAL_SPIRAL("Conical Spiral"),
  @XmlEnumValue("Coplanar Array")
  COPLANAR_ARRAY("Coplanar Array"),
  @XmlEnumValue("Corner Reflector")
  CORNER_REFLECTOR("Corner Reflector"),
  @XmlEnumValue("Corrugated Horn")
  CORRUGATED_HORN("Corrugated Horn"),
  @XmlEnumValue("Corrugated Rod")
  CORRUGATED_ROD("Corrugated Rod"),
  @XmlEnumValue("Crossed Dipoles")
  CROSSED_DIPOLES("Crossed Dipoles"),
  @XmlEnumValue("Crossed Log Periodic Array")
  CROSSED_LOG_PERIODIC_ARRAY("Crossed Log Periodic Array"),
  @XmlEnumValue("Crossed Loops")
  CROSSED_LOOPS("Crossed Loops"),
  @XmlEnumValue("CSC2 Reflector")
  CSC_2_REFLECTOR("CSC2 Reflector"),
  @XmlEnumValue("Cubical Quad")
  CUBICAL_QUAD("Cubical Quad"),
  @XmlEnumValue("Cubical Quad Array")
  CUBICAL_QUAD_ARRAY("Cubical Quad Array"),
  @XmlEnumValue("Cup-Dipole")
  CUP_DIPOLE("Cup-Dipole"),
  @XmlEnumValue("Cup-Dipole-Array")
  CUP_DIPOLE_ARRAY("Cup-Dipole-Array"),
  @XmlEnumValue("Cylindrical Array")
  CYLINDRICAL_ARRAY("Cylindrical Array"),
  @XmlEnumValue("Cylindrical Slot")
  CYLINDRICAL_SLOT("Cylindrical Slot"),
  @XmlEnumValue("Dichroic")
  DICHROIC("Dichroic"),
  @XmlEnumValue("Dielectric Horn")
  DIELECTRIC_HORN("Dielectric Horn"),
  @XmlEnumValue("Dielectric Lens")
  DIELECTRIC_LENS("Dielectric Lens"),
  @XmlEnumValue("Dielectric Rod")
  DIELECTRIC_ROD("Dielectric Rod"),
  @XmlEnumValue("Dipole")
  DIPOLE("Dipole"),
  @XmlEnumValue("Dipole Array")
  DIPOLE_ARRAY("Dipole Array"),
  @XmlEnumValue("Dipole Stacked")
  DIPOLE_STACKED("Dipole Stacked"),
  @XmlEnumValue("Dipole W/Reflector")
  DIPOLE_W_REFLECTOR("Dipole W/Reflector"),
  @XmlEnumValue("Discage")
  DISCAGE("Discage"),
  @XmlEnumValue("Discone")
  DISCONE("Discone"),
  @XmlEnumValue("Doublet")
  DOUBLET("Doublet"),
  @XmlEnumValue("Endfire Array")
  ENDFIRE_ARRAY("Endfire Array"),
  @XmlEnumValue("Equi-Angular Spiral")
  EQUI_ANGULAR_SPIRAL("Equi-Angular Spiral"),
  @XmlEnumValue("E-Sectoral Horn")
  E_SECTORAL_HORN("E-Sectoral Horn"),
  @XmlEnumValue("Fan Monopole")
  FAN_MONOPOLE("Fan Monopole"),
  @XmlEnumValue("Feed")
  FEED("Feed"),
  @XmlEnumValue("Ferrite Loop")
  FERRITE_LOOP("Ferrite Loop"),
  @XmlEnumValue("Ferrite Loop Stick")
  FERRITE_LOOP_STICK("Ferrite Loop Stick"),
  @XmlEnumValue("Fin Cap")
  FIN_CAP("Fin Cap"),
  @XmlEnumValue("Flat Plate")
  FLAT_PLATE("Flat Plate"),
  @XmlEnumValue("Flat Screen Reflector")
  FLAT_SCREEN_REFLECTOR("Flat Screen Reflector"),
  @XmlEnumValue("Flat Top")
  FLAT_TOP("Flat Top"),
  @XmlEnumValue("Flexible Tape")
  FLEXIBLE_TAPE("Flexible Tape"),
  @XmlEnumValue("Folded Dipole")
  FOLDED_DIPOLE("Folded Dipole"),
  @XmlEnumValue("Folded Dipole/W Ground Plane")
  FOLDED_DIPOLE_W_GROUND_PLANE("Folded Dipole/W Ground Plane"),
  @XmlEnumValue("Folded Helix")
  FOLDED_HELIX("Folded Helix"),
  @XmlEnumValue("Folded Monopole")
  FOLDED_MONOPOLE("Folded Monopole"),
  @XmlEnumValue("Folded Trapezoidal Log-Periodic Array")
  FOLDED_TRAPEZOIDAL_LOG_PERIODIC_ARRAY("Folded Trapezoidal Log-Periodic Array"),
  @XmlEnumValue("Franklin")
  FRANKLIN("Franklin"),
  @XmlEnumValue("Gregorian")
  GREGORIAN("Gregorian"),
  @XmlEnumValue("Ground Plane")
  GROUND_PLANE("Ground Plane"),
  @XmlEnumValue("Ground-Plane Whip")
  GROUND_PLANE_WHIP("Ground-Plane Whip"),
  @XmlEnumValue("Half Loop")
  HALF_LOOP("Half Loop"),
  @XmlEnumValue("Half Rhombic")
  HALF_RHOMBIC("Half Rhombic"),
  @XmlEnumValue("Halfwave Dipole")
  HALFWAVE_DIPOLE("Halfwave Dipole"),
  @XmlEnumValue("Halfwave Whip")
  HALFWAVE_WHIP("Halfwave Whip"),
  @XmlEnumValue("Halo")
  HALO("Halo"),
  @XmlEnumValue("Helical")
  HELICAL("Helical"),
  @XmlEnumValue("Helical Whip")
  HELICAL_WHIP("Helical Whip"),
  @XmlEnumValue("Helix Array")
  HELIX_ARRAY("Helix Array"),
  @XmlEnumValue("Hog Horn")
  HOG_HORN("Hog Horn"),
  @XmlEnumValue("Horizontal Dipole")
  HORIZONTAL_DIPOLE("Horizontal Dipole"),
  @XmlEnumValue("Horizontal Vee")
  HORIZONTAL_VEE("Horizontal Vee"),
  @XmlEnumValue("Horn")
  HORN("Horn"),
  @XmlEnumValue("H-Sectoral Horn")
  H_SECTORAL_HORN("H-Sectoral Horn"),
  @XmlEnumValue("Inverted L")
  INVERTED_L("Inverted L"),
  @XmlEnumValue("Inverted Cone")
  INVERTED_CONE("Inverted Cone"),
  @XmlEnumValue("Inverted Discone")
  INVERTED_DISCONE("Inverted Discone"),
  @XmlEnumValue("Inverted Vee")
  INVERTED_VEE("Inverted Vee"),
  @XmlEnumValue("Leaky Coax")
  LEAKY_COAX("Leaky Coax"),
  @XmlEnumValue("Lens")
  LENS("Lens"),
  @XmlEnumValue("Linear")
  LINEAR("Linear"),
  @XmlEnumValue("Log Conical Spiral")
  LOG_CONICAL_SPIRAL("Log Conical Spiral"),
  @XmlEnumValue("Log Periodic")
  LOG_PERIODIC("Log Periodic"),
  @XmlEnumValue("Log Periodic Array")
  LOG_PERIODIC_ARRAY("Log Periodic Array"),
  @XmlEnumValue("Long Wire")
  LONG_WIRE("Long Wire"),
  @XmlEnumValue("Loop")
  LOOP("Loop"),
  @XmlEnumValue("Loop Array")
  LOOP_ARRAY("Loop Array"),
  @XmlEnumValue("Luneburg Lens")
  LUNEBURG_LENS("Luneburg Lens"),
  @XmlEnumValue("Mattress")
  MATTRESS("Mattress"),
  @XmlEnumValue("Metal Plate Lens")
  METAL_PLATE_LENS("Metal Plate Lens"),
  @XmlEnumValue("Microstrip")
  MICROSTRIP("Microstrip"),
  @XmlEnumValue("Micro-Strip Array")
  MICRO_STRIP_ARRAY("Micro-Strip Array"),
  @XmlEnumValue("Monopole")
  MONOPOLE("Monopole"),
  @XmlEnumValue("Monopole Array")
  MONOPOLE_ARRAY("Monopole Array"),
  @XmlEnumValue("Monopole With Reflector")
  MONOPOLE_WITH_REFLECTOR("Monopole With Reflector"),
  @XmlEnumValue("Multi-Curtain Rhombic")
  MULTI_CURTAIN_RHOMBIC("Multi-Curtain Rhombic"),
  @XmlEnumValue("Multi-Horn Array")
  MULTI_HORN_ARRAY("Multi-Horn Array"),
  @XmlEnumValue("Multiple Slot")
  MULTIPLE_SLOT("Multiple Slot"),
  @XmlEnumValue("Nested Rhombics")
  NESTED_RHOMBICS("Nested Rhombics"),
  @XmlEnumValue("Normal Mode Helix")
  NORMAL_MODE_HELIX("Normal Mode Helix"),
  @XmlEnumValue("Open Wire")
  OPEN_WIRE("Open Wire"),
  @XmlEnumValue("Open-Ended Waveguide")
  OPEN_ENDED_WAVEGUIDE("Open-Ended Waveguide"),
  @XmlEnumValue("Orange Peel Reflector")
  ORANGE_PEEL_REFLECTOR("Orange Peel Reflector"),
  @XmlEnumValue("Organ Pipe")
  ORGAN_PIPE("Organ Pipe"),
  @XmlEnumValue("Parabolic Cylinder")
  PARABOLIC_CYLINDER("Parabolic Cylinder"),
  @XmlEnumValue("Parabolic High")
  PARABOLIC_HIGH("Parabolic High"),
  @XmlEnumValue("Parabolic Mesh")
  PARABOLIC_MESH("Parabolic Mesh"),
  @XmlEnumValue("Parabolic Reflector")
  PARABOLIC_REFLECTOR("Parabolic Reflector"),
  @XmlEnumValue("Parabolic Segment")
  PARABOLIC_SEGMENT("Parabolic Segment"),
  @XmlEnumValue("Parabolic Segment Mesh")
  PARABOLIC_SEGMENT_MESH("Parabolic Segment Mesh"),
  @XmlEnumValue("Passive Reflector")
  PASSIVE_REFLECTOR("Passive Reflector"),
  @XmlEnumValue("Patch")
  PATCH("Patch"),
  @XmlEnumValue("Periscope")
  PERISCOPE("Periscope"),
  @XmlEnumValue("Phased Array")
  PHASED_ARRAY("Phased Array"),
  @XmlEnumValue("Phased Array Dipole")
  PHASED_ARRAY_DIPOLE("Phased Array Dipole"),
  @XmlEnumValue("Phased Array Horn")
  PHASED_ARRAY_HORN("Phased Array Horn"),
  @XmlEnumValue("Phased Array Ridged Waveguide")
  PHASED_ARRAY_RIDGED_WAVEGUIDE("Phased Array Ridged Waveguide"),
  @XmlEnumValue("Phased Array Waveguide")
  PHASED_ARRAY_WAVEGUIDE("Phased Array Waveguide"),
  @XmlEnumValue("Phased Array Yagi")
  PHASED_ARRAY_YAGI("Phased Array Yagi"),
  @XmlEnumValue("Phased-Array Slotted Waveguide")
  PHASED_ARRAY_SLOTTED_WAVEGUIDE("Phased-Array Slotted Waveguide"),
  @XmlEnumValue("Pill Box")
  PILL_BOX("Pill Box"),
  @XmlEnumValue("Pine Cone")
  PINE_CONE("Pine Cone"),
  @XmlEnumValue("Planar Array")
  PLANAR_ARRAY("Planar Array"),
  @XmlEnumValue("Planar Slot")
  PLANAR_SLOT("Planar Slot"),
  @XmlEnumValue("Ported Coaxial Cable")
  PORTED_COAXIAL_CABLE("Ported Coaxial Cable"),
  @XmlEnumValue("Probe")
  PROBE("Probe"),
  @XmlEnumValue("Pyramidal Horn")
  PYRAMIDAL_HORN("Pyramidal Horn"),
  @XmlEnumValue("Quad Log Periodic")
  QUAD_LOG_PERIODIC("Quad Log Periodic"),
  @XmlEnumValue("Quadrafilar Helix")
  QUADRAFILAR_HELIX("Quadrafilar Helix"),
  @XmlEnumValue("Radial Line")
  RADIAL_LINE("Radial Line"),
  @XmlEnumValue("Rhombic")
  RHOMBIC("Rhombic"),
  @XmlEnumValue("Ridged Waveguide")
  RIDGED_WAVEGUIDE("Ridged Waveguide"),
  @XmlEnumValue("Rod")
  ROD("Rod"),
  @XmlEnumValue("Scimitar")
  SCIMITAR("Scimitar"),
  @XmlEnumValue("Single Curtain Rhombic")
  SINGLE_CURTAIN_RHOMBIC("Single Curtain Rhombic"),
  @XmlEnumValue("Single Slot")
  SINGLE_SLOT("Single Slot"),
  @XmlEnumValue("Single-Turn Loop")
  SINGLE_TURN_LOOP("Single-Turn Loop"),
  @XmlEnumValue("Skeleton Slot")
  SKELETON_SLOT("Skeleton Slot"),
  @XmlEnumValue("Skeleton Slot W/Reflector")
  SKELETON_SLOT_W_REFLECTOR("Skeleton Slot W/Reflector"),
  @XmlEnumValue("Sleeve Dipole")
  SLEEVE_DIPOLE("Sleeve Dipole"),
  @XmlEnumValue("Slot")
  SLOT("Slot"),
  @XmlEnumValue("Slot Array")
  SLOT_ARRAY("Slot Array"),
  @XmlEnumValue("Slotted Waveguide")
  SLOTTED_WAVEGUIDE("Slotted Waveguide"),
  @XmlEnumValue("Slotted Waveguide Planar Array")
  SLOTTED_WAVEGUIDE_PLANAR_ARRAY("Slotted Waveguide Planar Array"),
  @XmlEnumValue("Spiral")
  SPIRAL("Spiral"),
  @XmlEnumValue("Stacked Yagi")
  STACKED_YAGI("Stacked Yagi"),
  @XmlEnumValue("Standing-Wave Waveguide Planar Array")
  STANDING_WAVE_WAVEGUIDE_PLANAR_ARRAY("Standing-Wave Waveguide Planar Array"),
  @XmlEnumValue("Stripline")
  STRIPLINE("Stripline"),
  @XmlEnumValue("Stripline Dipole")
  STRIPLINE_DIPOLE("Stripline Dipole"),
  @XmlEnumValue("Stub")
  STUB("Stub"),
  @XmlEnumValue("Swastika")
  SWASTIKA("Swastika"),
  @XmlEnumValue("Symmetrical Tee")
  SYMMETRICAL_TEE("Symmetrical Tee"),
  @XmlEnumValue("Synthetic Aperture")
  SYNTHETIC_APERTURE("Synthetic Aperture"),
  @XmlEnumValue("Top Hat")
  TOP_HAT("Top Hat"),
  @XmlEnumValue("Tower")
  TOWER("Tower"),
  @XmlEnumValue("Trailing Wire")
  TRAILING_WIRE("Trailing Wire"),
  @XmlEnumValue("Traveling Wave")
  TRAVELING_WAVE("Traveling Wave"),
  @XmlEnumValue("Traveling-Wave Waveguide Planar Array")
  TRAVELING_WAVE_WAVEGUIDE_PLANAR_ARRAY("Traveling-Wave Waveguide Planar Array"),
  @XmlEnumValue("Trilinear Array")
  TRILINEAR_ARRAY("Trilinear Array"),
  @XmlEnumValue("Turnstile")
  TURNSTILE("Turnstile"),
  @XmlEnumValue("Vee")
  VEE("Vee"),
  @XmlEnumValue("Vertical Array")
  VERTICAL_ARRAY("Vertical Array"),
  @XmlEnumValue("Vertical Dipole")
  VERTICAL_DIPOLE("Vertical Dipole"),
  @XmlEnumValue("Vertical Half Rhombic")
  VERTICAL_HALF_RHOMBIC("Vertical Half Rhombic"),
  @XmlEnumValue("Vertical Radiator")
  VERTICAL_RADIATOR("Vertical Radiator"),
  @XmlEnumValue("Vertical Top Hat")
  VERTICAL_TOP_HAT("Vertical Top Hat"),
  @XmlEnumValue("Whip")
  WHIP("Whip"),
  @XmlEnumValue("Whip Half Wave")
  WHIP_HALF_WAVE("Whip Half Wave"),
  @XmlEnumValue("Whip Quarter Wave")
  WHIP_QUARTER_WAVE("Whip Quarter Wave"),
  @XmlEnumValue("Wullenweber Array")
  WULLENWEBER_ARRAY("Wullenweber Array"),
  @XmlEnumValue("Yagi Array")
  YAGI_ARRAY("Yagi Array"),
  @XmlEnumValue("Yagi-Unidirectional Array")
  YAGI_UNIDIRECTIONAL_ARRAY("Yagi-Unidirectional Array"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCAT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAT fromValue(String v) {
    for (ListCAT c : ListCAT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
