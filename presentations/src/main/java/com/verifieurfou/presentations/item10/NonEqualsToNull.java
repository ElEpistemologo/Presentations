package com.verifieurfou.presentations.item10;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p46
 * 
 */
public class NonEqualsToNull {
//	@Override 
//	public boolean equals(Object o) {
//		if (o == null) return false; // pas nécessaire
//		
//		//-- suite non implémenté
//		return true;
//	}
	
	// JLS 15.20
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof NonEqualsToNull))
			return false;
		NonEqualsToNull mt = (NonEqualsToNull) o;

		// suite non implémenté
		return true;
	}
}
