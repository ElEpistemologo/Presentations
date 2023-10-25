package com.verifieurfou.presentations.presentations.item10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ColorPointTest {

	@Test
	void testAddingColor() {
		ColorPoint cpGreen = new ColorPoint(1, 2, Color.GREEN);
		ColorPoint cpgRed = new ColorPoint(1, 2, Color.RED);
		ColorPoint cpgRed2 = new ColorPoint(1, 2, Color.RED);
		
		assertEquals(false, cpGreen.equals(cpgRed));
		assertEquals(true, cpgRed2.equals(cpgRed));
	}
	
	@Test
	void testSymmetry() {
		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);
		
		// Avec cette première implémentation de equals la symmétrie n'est pas respecté
		assertEquals(true , cp.equals(p) == p.equals(cp));
		
	}
	
	@Test
	void testTransitivity() {
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
		
		assertEquals(p1.equals(p2), p2.equals(p1));
	}

	@Test
	void testColorPointComposed_withColor() {
		ColorPointComposed cpGreen = new ColorPointComposed(1, 2, Color.GREEN);
		ColorPointComposed cpgRed1 = new ColorPointComposed(1, 2, Color.RED);
		ColorPointComposed cpgRed2 = new ColorPointComposed(1, 2, Color.RED);
		
		assertEquals(false, cpGreen.equals(cpgRed1));
		assertEquals(true, cpgRed2.equals(cpgRed1));
	}
	
	@Test
	void testColorPointComposed_Symmetry() {
		Point p = new Point(1, 2);
		ColorPointComposed cp = new ColorPointComposed(1, 2, Color.RED);
		assertEquals(true , cp.equals(p) == p.equals(cp));
	}
	
	@Test
	void testColorPointComposed_Transitivity() {
		ColorPointComposed p1 = new ColorPointComposed(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPointComposed p3 = new ColorPointComposed(1, 2, Color.BLUE);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
	}
	
	@Test
	void testLiskovViolationConsequences() {
		var points = Set.of(new Point(-1, 0), new Point(1, 0));
		
		assertEquals(true, points.contains(new ColorPoint(-1, 0, Color.red)));
	}
	
}
