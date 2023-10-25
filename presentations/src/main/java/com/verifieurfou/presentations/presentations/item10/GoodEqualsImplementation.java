package com.verifieurfou.presentations.presentations.item10;

import java.util.Objects;

public class GoodEqualsImplementation {
	String str;
	double dbl;
	long lng;
	Object equalsTresCouteux;
	Object equalsRapide;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GoodEqualsImplementation other))
			return false;
		return Double.doubleToLongBits(dbl) == Double.doubleToLongBits(other.dbl) 
				&& lng == other.lng
				&& Objects.equals(str, other.str) // pas de NPE
				&& Objects.equals(equalsRapide, other.equalsRapide)
				&& Objects.equals(equalsTresCouteux, other.equalsTresCouteux);
	}

}
