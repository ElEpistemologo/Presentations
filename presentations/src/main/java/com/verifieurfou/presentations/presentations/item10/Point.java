package com.verifieurfou.presentations.presentations.item10;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p41
 * 
 */
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void coucou() {}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (o == null || o.getClass() != getClass())
//			return false;
//		Point p = (Point) o;
//		return p.x == x && p.y == y;
//	}
	
}