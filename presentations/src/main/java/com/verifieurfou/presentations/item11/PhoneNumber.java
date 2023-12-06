package com.verifieurfou.presentations.item11;

import java.util.Objects;

/**
 * Bloch, Joshua. Effective Java. Third edition. Boston: Addison-Wesley, 2018. p48
 * 
 */
public final class PhoneNumber {
	private final int areaCode, prefix, lineNum;
	private Object obj;
	
	private int hashCode;
	
	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PhoneNumber pn)) 
			return false;
		return pn.lineNum == lineNum 
				&& pn.prefix == prefix 
				&& pn.areaCode == areaCode
				&& Objects.equals(pn.obj, obj);
	}
	
//	@Override
//	public int hashCode() {
//		return 42;
//	}
	
	// Typical hashCode method
//	@Override
//	public int hashCode() {
//		int result = Integer.hashCode(areaCode);
//		result = 31 * result + Integer.hashCode(prefix);
//		result = 31 * result + Integer.hashCode(prefix);
//		result = 31 * result + Objects.hashCode(obj);
//		return result;
//	}
	
	// Si les performances ne sont pas une contrainte (varargs + boxing)
//	@Override
//	public int hashCode() {
//		return Objects.hash(lineNum, prefix, areaCode, obj);
//	}
	
//	@Override
//	public int hashCode() {
//		int result = hashCode;
//		if (result == 0) {
//			result = Integer.hashCode(areaCode);
//			result = 31 * result + Integer.hashCode(prefix);
//			result = 31 * result + Integer.hashCode(prefix);
//			result = 31 * result + Objects.hashCode(obj);
//			hashCode = result;
//		}
//		return result;
//	}
	
}
