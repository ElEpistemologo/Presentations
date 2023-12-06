package com.verifieurfou.presentations.item10;

import java.awt.Color;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p41
 * 
 */
public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	// Broken - violates symmetry!
//	@Override
//	public boolean equals(Object o) {
//		if ( o == this) {
//			return true;
//		}
//		if (!(o instanceof ColorPoint cp)) {
//			return false;
//		}
//		return super.equals(o) && cp.color == color;
//	}
	
	// Broken - violates transitivity!
//	@Override
//	public boolean equals(Object o) {
//		if (o == this) {
//			return true;
//		}
//		if (!(o instanceof Point)) {
//			return false;
//		}
//		// If o is a normal Point, do a color-blind comparison
//		if (!(o instanceof ColorPoint cp)) {
//			return super.equals(o);
//		}
//		// o is a ColorPoint; do a full comparison
//		return super.equals(o) && ((ColorPoint) o).color == color;
//	}

}