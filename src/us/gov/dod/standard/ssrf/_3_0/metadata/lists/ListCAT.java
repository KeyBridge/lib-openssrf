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
  ADCOCK___ARRAY("Adcock Array"),
  @XmlEnumValue("Annular Slot")
  ANNULAR___SLOT("Annular Slot"),
  @XmlEnumValue("Aperture")
  APERTURE("Aperture"),
  @XmlEnumValue("Axial Mode Helix")
  AXIAL___MODE___HELIX("Axial Mode Helix"),
  @XmlEnumValue("Backfill Radiator")
  BACKFILL___RADIATOR("Backfill Radiator"),
  @XmlEnumValue("Backfire")
  BACKFIRE("Backfire"),
  @XmlEnumValue("Backfire Array")
  BACKFIRE___ARRAY("Backfire Array"),
  @XmlEnumValue("Balanced T")
  BALANCED___T("Balanced T"),
  @XmlEnumValue("Batwing")
  BATWING("Batwing"),
  @XmlEnumValue("Batwing Array")
  BATWING___ARRAY("Batwing Array"),
  @XmlEnumValue("Biconical")
  BICONICAL("Biconical"),
  @XmlEnumValue("Biconical Dipole")
  BICONICAL___DIPOLE("Biconical Dipole"),
  @XmlEnumValue("Biconical Horn")
  BICONICAL___HORN("Biconical Horn"),
  @XmlEnumValue("Billboard")
  BILLBOARD("Billboard"),
  @XmlEnumValue("Blade")
  BLADE("Blade"),
  @XmlEnumValue("Bow Tie")
  BOW___TIE("Bow Tie"),
  @XmlEnumValue("Bow Tie Array")
  BOW___TIE___ARRAY("Bow Tie Array"),
  @XmlEnumValue("Broadside Array")
  BROADSIDE___ARRAY("Broadside Array"),
  @XmlEnumValue("Cassegrain")
  CASSEGRAIN("Cassegrain"),
  @XmlEnumValue("Cavity Backed Dipole")
  CAVITY___BACKED___DIPOLE("Cavity Backed Dipole"),
  @XmlEnumValue("Cavity Backed Monopole")
  CAVITY___BACKED___MONOPOLE("Cavity Backed Monopole"),
  @XmlEnumValue("Cavity Backed Slot")
  CAVITY___BACKED___SLOT("Cavity Backed Slot"),
  @XmlEnumValue("Cavity Backed Spiral")
  CAVITY___BACKED___SPIRAL("Cavity Backed Spiral"),
  @XmlEnumValue("Clover Leaf")
  CLOVER___LEAF("Clover Leaf"),
  @XmlEnumValue("Coaxial Dipole")
  COAXIAL___DIPOLE("Coaxial Dipole"),
  @XmlEnumValue("Collinear Array")
  COLLINEAR___ARRAY("Collinear Array"),
  @XmlEnumValue("Conformal Array")
  CONFORMAL___ARRAY("Conformal Array"),
  @XmlEnumValue("Conical Horn")
  CONICAL___HORN("Conical Horn"),
  @XmlEnumValue("Conical Monopole")
  CONICAL___MONOPOLE("Conical Monopole"),
  @XmlEnumValue("Conical Spiral")
  CONICAL___SPIRAL("Conical Spiral"),
  @XmlEnumValue("Coplanar Array")
  COPLANAR___ARRAY("Coplanar Array"),
  @XmlEnumValue("Corner Reflector")
  CORNER___REFLECTOR("Corner Reflector"),
  @XmlEnumValue("Corrugated Horn")
  CORRUGATED___HORN("Corrugated Horn"),
  @XmlEnumValue("Corrugated Rod")
  CORRUGATED___ROD("Corrugated Rod"),
  @XmlEnumValue("Crossed Dipoles")
  CROSSED___DIPOLES("Crossed Dipoles"),
  @XmlEnumValue("Crossed Log Periodic Array")
  CROSSED___LOG___PERIODIC___ARRAY("Crossed Log Periodic Array"),
  @XmlEnumValue("Crossed Loops")
  CROSSED___LOOPS("Crossed Loops"),
  @XmlEnumValue("CSC2 Reflector")
  CSC_2___REFLECTOR("CSC2 Reflector"),
  @XmlEnumValue("Cubical Quad")
  CUBICAL___QUAD("Cubical Quad"),
  @XmlEnumValue("Cubical Quad Array")
  CUBICAL___QUAD___ARRAY("Cubical Quad Array"),
  @XmlEnumValue("Cup-Dipole")
  CUP___DIPOLE("Cup-Dipole"),
  @XmlEnumValue("Cup-Dipole-Array")
  CUP___DIPOLE___ARRAY("Cup-Dipole-Array"),
  @XmlEnumValue("Cylindrical Array")
  CYLINDRICAL___ARRAY("Cylindrical Array"),
  @XmlEnumValue("Cylindrical Slot")
  CYLINDRICAL___SLOT("Cylindrical Slot"),
  @XmlEnumValue("Dichroic")
  DICHROIC("Dichroic"),
  @XmlEnumValue("Dielectric Horn")
  DIELECTRIC___HORN("Dielectric Horn"),
  @XmlEnumValue("Dielectric Lens")
  DIELECTRIC___LENS("Dielectric Lens"),
  @XmlEnumValue("Dielectric Rod")
  DIELECTRIC___ROD("Dielectric Rod"),
  @XmlEnumValue("Dipole")
  DIPOLE("Dipole"),
  @XmlEnumValue("Dipole Array")
  DIPOLE___ARRAY("Dipole Array"),
  @XmlEnumValue("Dipole Stacked")
  DIPOLE___STACKED("Dipole Stacked"),
  @XmlEnumValue("Dipole W/Reflector")
  DIPOLE___W___REFLECTOR("Dipole W/Reflector"),
  @XmlEnumValue("Discage")
  DISCAGE("Discage"),
  @XmlEnumValue("Discone")
  DISCONE("Discone"),
  @XmlEnumValue("Doublet")
  DOUBLET("Doublet"),
  @XmlEnumValue("Endfire Array")
  ENDFIRE___ARRAY("Endfire Array"),
  @XmlEnumValue("Equi-Angular Spiral")
  EQUI___ANGULAR___SPIRAL("Equi-Angular Spiral"),
  @XmlEnumValue("E-Sectoral Horn")
  E___SECTORAL___HORN("E-Sectoral Horn"),
  @XmlEnumValue("Fan Monopole")
  FAN___MONOPOLE("Fan Monopole"),
  @XmlEnumValue("Feed")
  FEED("Feed"),
  @XmlEnumValue("Ferrite Loop")
  FERRITE___LOOP("Ferrite Loop"),
  @XmlEnumValue("Ferrite Loop Stick")
  FERRITE___LOOP___STICK("Ferrite Loop Stick"),
  @XmlEnumValue("Fin Cap")
  FIN___CAP("Fin Cap"),
  @XmlEnumValue("Flat Plate")
  FLAT___PLATE("Flat Plate"),
  @XmlEnumValue("Flat Screen Reflector")
  FLAT___SCREEN___REFLECTOR("Flat Screen Reflector"),
  @XmlEnumValue("Flat Top")
  FLAT___TOP("Flat Top"),
  @XmlEnumValue("Flexible Tape")
  FLEXIBLE___TAPE("Flexible Tape"),
  @XmlEnumValue("Folded Dipole")
  FOLDED___DIPOLE("Folded Dipole"),
  @XmlEnumValue("Folded Dipole/W Ground Plane")
  FOLDED___DIPOLE___W___GROUND___PLANE("Folded Dipole/W Ground Plane"),
  @XmlEnumValue("Folded Helix")
  FOLDED___HELIX("Folded Helix"),
  @XmlEnumValue("Folded Monopole")
  FOLDED___MONOPOLE("Folded Monopole"),
  @XmlEnumValue("Folded Trapezoidal Log-Periodic Array")
  FOLDED___TRAPEZOIDAL___LOG___PERIODIC___ARRAY("Folded Trapezoidal Log-Periodic Array"),
  @XmlEnumValue("Franklin")
  FRANKLIN("Franklin"),
  @XmlEnumValue("Gregorian")
  GREGORIAN("Gregorian"),
  @XmlEnumValue("Ground Plane")
  GROUND___PLANE("Ground Plane"),
  @XmlEnumValue("Ground-Plane Whip")
  GROUND___PLANE___WHIP("Ground-Plane Whip"),
  @XmlEnumValue("Half Loop")
  HALF___LOOP("Half Loop"),
  @XmlEnumValue("Half Rhombic")
  HALF___RHOMBIC("Half Rhombic"),
  @XmlEnumValue("Halfwave Dipole")
  HALFWAVE___DIPOLE("Halfwave Dipole"),
  @XmlEnumValue("Halfwave Whip")
  HALFWAVE___WHIP("Halfwave Whip"),
  @XmlEnumValue("Halo")
  HALO("Halo"),
  @XmlEnumValue("Helical")
  HELICAL("Helical"),
  @XmlEnumValue("Helical Whip")
  HELICAL___WHIP("Helical Whip"),
  @XmlEnumValue("Helix Array")
  HELIX___ARRAY("Helix Array"),
  @XmlEnumValue("Hog Horn")
  HOG___HORN("Hog Horn"),
  @XmlEnumValue("Horizontal Dipole")
  HORIZONTAL___DIPOLE("Horizontal Dipole"),
  @XmlEnumValue("Horizontal Vee")
  HORIZONTAL___VEE("Horizontal Vee"),
  @XmlEnumValue("Horn")
  HORN("Horn"),
  @XmlEnumValue("H-Sectoral Horn")
  H___SECTORAL___HORN("H-Sectoral Horn"),
  @XmlEnumValue("Inverted L")
  INVERTED___L("Inverted L"),
  @XmlEnumValue("Inverted Cone")
  INVERTED___CONE("Inverted Cone"),
  @XmlEnumValue("Inverted Discone")
  INVERTED___DISCONE("Inverted Discone"),
  @XmlEnumValue("Inverted Vee")
  INVERTED___VEE("Inverted Vee"),
  @XmlEnumValue("Leaky Coax")
  LEAKY___COAX("Leaky Coax"),
  @XmlEnumValue("Lens")
  LENS("Lens"),
  @XmlEnumValue("Linear")
  LINEAR("Linear"),
  @XmlEnumValue("Log Conical Spiral")
  LOG___CONICAL___SPIRAL("Log Conical Spiral"),
  @XmlEnumValue("Log Periodic")
  LOG___PERIODIC("Log Periodic"),
  @XmlEnumValue("Log Periodic Array")
  LOG___PERIODIC___ARRAY("Log Periodic Array"),
  @XmlEnumValue("Long Wire")
  LONG___WIRE("Long Wire"),
  @XmlEnumValue("Loop")
  LOOP("Loop"),
  @XmlEnumValue("Loop Array")
  LOOP___ARRAY("Loop Array"),
  @XmlEnumValue("Luneburg Lens")
  LUNEBURG___LENS("Luneburg Lens"),
  @XmlEnumValue("Mattress")
  MATTRESS("Mattress"),
  @XmlEnumValue("Metal Plate Lens")
  METAL___PLATE___LENS("Metal Plate Lens"),
  @XmlEnumValue("Microstrip")
  MICROSTRIP("Microstrip"),
  @XmlEnumValue("Micro-Strip Array")
  MICRO___STRIP___ARRAY("Micro-Strip Array"),
  @XmlEnumValue("Monopole")
  MONOPOLE("Monopole"),
  @XmlEnumValue("Monopole Array")
  MONOPOLE___ARRAY("Monopole Array"),
  @XmlEnumValue("Monopole With Reflector")
  MONOPOLE___WITH___REFLECTOR("Monopole With Reflector"),
  @XmlEnumValue("Multi-Curtain Rhombic")
  MULTI___CURTAIN___RHOMBIC("Multi-Curtain Rhombic"),
  @XmlEnumValue("Multi-Horn Array")
  MULTI___HORN___ARRAY("Multi-Horn Array"),
  @XmlEnumValue("Multiple Slot")
  MULTIPLE___SLOT("Multiple Slot"),
  @XmlEnumValue("Nested Rhombics")
  NESTED___RHOMBICS("Nested Rhombics"),
  @XmlEnumValue("Normal Mode Helix")
  NORMAL___MODE___HELIX("Normal Mode Helix"),
  @XmlEnumValue("Open Wire")
  OPEN___WIRE("Open Wire"),
  @XmlEnumValue("Open-Ended Waveguide")
  OPEN___ENDED___WAVEGUIDE("Open-Ended Waveguide"),
  @XmlEnumValue("Orange Peel Reflector")
  ORANGE___PEEL___REFLECTOR("Orange Peel Reflector"),
  @XmlEnumValue("Organ Pipe")
  ORGAN___PIPE("Organ Pipe"),
  @XmlEnumValue("Parabolic Cylinder")
  PARABOLIC___CYLINDER("Parabolic Cylinder"),
  @XmlEnumValue("Parabolic High")
  PARABOLIC___HIGH("Parabolic High"),
  @XmlEnumValue("Parabolic Mesh")
  PARABOLIC___MESH("Parabolic Mesh"),
  @XmlEnumValue("Parabolic Reflector")
  PARABOLIC___REFLECTOR("Parabolic Reflector"),
  @XmlEnumValue("Parabolic Segment")
  PARABOLIC___SEGMENT("Parabolic Segment"),
  @XmlEnumValue("Parabolic Segment Mesh")
  PARABOLIC___SEGMENT___MESH("Parabolic Segment Mesh"),
  @XmlEnumValue("Passive Reflector")
  PASSIVE___REFLECTOR("Passive Reflector"),
  @XmlEnumValue("Patch")
  PATCH("Patch"),
  @XmlEnumValue("Periscope")
  PERISCOPE("Periscope"),
  @XmlEnumValue("Phased Array")
  PHASED___ARRAY("Phased Array"),
  @XmlEnumValue("Phased Array Dipole")
  PHASED___ARRAY___DIPOLE("Phased Array Dipole"),
  @XmlEnumValue("Phased Array Horn")
  PHASED___ARRAY___HORN("Phased Array Horn"),
  @XmlEnumValue("Phased Array Ridged Waveguide")
  PHASED___ARRAY___RIDGED___WAVEGUIDE("Phased Array Ridged Waveguide"),
  @XmlEnumValue("Phased Array Waveguide")
  PHASED___ARRAY___WAVEGUIDE("Phased Array Waveguide"),
  @XmlEnumValue("Phased Array Yagi")
  PHASED___ARRAY___YAGI("Phased Array Yagi"),
  @XmlEnumValue("Phased-Array Slotted Waveguide")
  PHASED___ARRAY___SLOTTED___WAVEGUIDE("Phased-Array Slotted Waveguide"),
  @XmlEnumValue("Pill Box")
  PILL___BOX("Pill Box"),
  @XmlEnumValue("Pine Cone")
  PINE___CONE("Pine Cone"),
  @XmlEnumValue("Planar Array")
  PLANAR___ARRAY("Planar Array"),
  @XmlEnumValue("Planar Slot")
  PLANAR___SLOT("Planar Slot"),
  @XmlEnumValue("Ported Coaxial Cable")
  PORTED___COAXIAL___CABLE("Ported Coaxial Cable"),
  @XmlEnumValue("Probe")
  PROBE("Probe"),
  @XmlEnumValue("Pyramidal Horn")
  PYRAMIDAL___HORN("Pyramidal Horn"),
  @XmlEnumValue("Quad Log Periodic")
  QUAD___LOG___PERIODIC("Quad Log Periodic"),
  @XmlEnumValue("Quadrafilar Helix")
  QUADRAFILAR___HELIX("Quadrafilar Helix"),
  @XmlEnumValue("Radial Line")
  RADIAL___LINE("Radial Line"),
  @XmlEnumValue("Rhombic")
  RHOMBIC("Rhombic"),
  @XmlEnumValue("Ridged Waveguide")
  RIDGED___WAVEGUIDE("Ridged Waveguide"),
  @XmlEnumValue("Rod")
  ROD("Rod"),
  @XmlEnumValue("Scimitar")
  SCIMITAR("Scimitar"),
  @XmlEnumValue("Single Curtain Rhombic")
  SINGLE___CURTAIN___RHOMBIC("Single Curtain Rhombic"),
  @XmlEnumValue("Single Slot")
  SINGLE___SLOT("Single Slot"),
  @XmlEnumValue("Single-Turn Loop")
  SINGLE___TURN___LOOP("Single-Turn Loop"),
  @XmlEnumValue("Skeleton Slot")
  SKELETON___SLOT("Skeleton Slot"),
  @XmlEnumValue("Skeleton Slot W/Reflector")
  SKELETON___SLOT___W___REFLECTOR("Skeleton Slot W/Reflector"),
  @XmlEnumValue("Sleeve Dipole")
  SLEEVE___DIPOLE("Sleeve Dipole"),
  @XmlEnumValue("Slot")
  SLOT("Slot"),
  @XmlEnumValue("Slot Array")
  SLOT___ARRAY("Slot Array"),
  @XmlEnumValue("Slotted Waveguide")
  SLOTTED___WAVEGUIDE("Slotted Waveguide"),
  @XmlEnumValue("Slotted Waveguide Planar Array")
  SLOTTED___WAVEGUIDE___PLANAR___ARRAY("Slotted Waveguide Planar Array"),
  @XmlEnumValue("Spiral")
  SPIRAL("Spiral"),
  @XmlEnumValue("Stacked Yagi")
  STACKED___YAGI("Stacked Yagi"),
  @XmlEnumValue("Standing-Wave Waveguide Planar Array")
  STANDING___WAVE___WAVEGUIDE___PLANAR___ARRAY("Standing-Wave Waveguide Planar Array"),
  @XmlEnumValue("Stripline")
  STRIPLINE("Stripline"),
  @XmlEnumValue("Stripline Dipole")
  STRIPLINE___DIPOLE("Stripline Dipole"),
  @XmlEnumValue("Stub")
  STUB("Stub"),
  @XmlEnumValue("Swastika")
  SWASTIKA("Swastika"),
  @XmlEnumValue("Symmetrical Tee")
  SYMMETRICAL___TEE("Symmetrical Tee"),
  @XmlEnumValue("Synthetic Aperture")
  SYNTHETIC___APERTURE("Synthetic Aperture"),
  @XmlEnumValue("Top Hat")
  TOP___HAT("Top Hat"),
  @XmlEnumValue("Tower")
  TOWER("Tower"),
  @XmlEnumValue("Trailing Wire")
  TRAILING___WIRE("Trailing Wire"),
  @XmlEnumValue("Traveling Wave")
  TRAVELING___WAVE("Traveling Wave"),
  @XmlEnumValue("Traveling-Wave Waveguide Planar Array")
  TRAVELING___WAVE___WAVEGUIDE___PLANAR___ARRAY("Traveling-Wave Waveguide Planar Array"),
  @XmlEnumValue("Trilinear Array")
  TRILINEAR___ARRAY("Trilinear Array"),
  @XmlEnumValue("Turnstile")
  TURNSTILE("Turnstile"),
  @XmlEnumValue("Vee")
  VEE("Vee"),
  @XmlEnumValue("Vertical Array")
  VERTICAL___ARRAY("Vertical Array"),
  @XmlEnumValue("Vertical Dipole")
  VERTICAL___DIPOLE("Vertical Dipole"),
  @XmlEnumValue("Vertical Half Rhombic")
  VERTICAL___HALF___RHOMBIC("Vertical Half Rhombic"),
  @XmlEnumValue("Vertical Radiator")
  VERTICAL___RADIATOR("Vertical Radiator"),
  @XmlEnumValue("Vertical Top Hat")
  VERTICAL___TOP___HAT("Vertical Top Hat"),
  @XmlEnumValue("Whip")
  WHIP("Whip"),
  @XmlEnumValue("Whip Half Wave")
  WHIP___HALF___WAVE("Whip Half Wave"),
  @XmlEnumValue("Whip Quarter Wave")
  WHIP___QUARTER___WAVE("Whip Quarter Wave"),
  @XmlEnumValue("Wullenweber Array")
  WULLENWEBER___ARRAY("Wullenweber Array"),
  @XmlEnumValue("Yagi Array")
  YAGI___ARRAY("Yagi Array"),
  @XmlEnumValue("Yagi-Unidirectional Array")
  YAGI___UNIDIRECTIONAL___ARRAY("Yagi-Unidirectional Array"),
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
