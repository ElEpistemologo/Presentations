package com.verifieurfou.presentations.presentations.item10;

import java.util.Objects;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p39-40
 * 
 */
public final class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		this.s = Objects.requireNonNull(s);
	}

	// Broken - violates symmetry!
//	@Override
//	public boolean equals(Object o) {
//		if (o instanceof CaseInsensitiveString) {
//			CaseInsensitiveString ocs = (CaseInsensitiveString) o;
//			return s.equalsIgnoreCase(ocs.s);
//		}
//		if (o instanceof String) { // One-way interoperability with String
//			String strArg = (String) o;
//			return s.equalsIgnoreCase(strArg);
//		}
//		return false;
//	}
	
	// Il faut retirer la tentative d'interopérabilité avec String
	@Override
	public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString &&
			s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
	}
	
}
