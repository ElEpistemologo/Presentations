package com.verifieurfou.presentations.item10;

import java.awt.Color;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p44
 * 
 */
public class ColorPointComposed extends Point{
	private final Color color;

	public ColorPointComposed(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
}
