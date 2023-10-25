package com.verifieurfou.presentations.presentations.item10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.verifieurfou.presentations.presentations.item10.CaseInsensitiveString;

class CaseInsensitiveStringTest {

	@Test
	void equalsWithString() {
		CaseInsensitiveString cis = new CaseInsensitiveString("OPERA");
		String str = "opera";
		assertEquals(true, cis.equals(str));
	}
	
	// SYMMETRY
	@Test
	void testSymmetry() {
    	// Effraction sur la symmétrie
		CaseInsensitiveString cis = new CaseInsensitiveString("OPERA");
    	String str = "opera";
    	
    	assertEquals(cis.equals(str), str.equals(cis));
    	// car le equals de String renvoit faux si le paramètre n'est pas un String
    	
	}
	
	@Test
	void consequences() {
		CaseInsensitiveString cis = new CaseInsensitiveString("OPERA");
		final String str = "opera";
    	List<CaseInsensitiveString> list = new ArrayList<>();
    	list.add(cis);
    	assertEquals(true, list.contains(str));
		//peut retourne true, false, ou une Exception, dépendamment des implémentations du JDK
	}
	
	@Test
	void demo_Non_Operability() {
    	String a = "a";
    	StringBuilder aB = new StringBuilder("a");
    	StringBuffer aBuff = new StringBuffer("a");
    	
    	assertEquals(false, a.equals(aB));
    	assertEquals(false, a.equals(aBuff));
    	assertEquals(false, aB.equals(aBuff));
    	// String renvoit faux si l'argument n'est pas un String
	}
	
}
