package com.verifieurfou.presentations.presentations.item49_50_76;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefensiveCopy {

	// possible de modifier le tableau depuis l'extérieur
	public final static String[] MY_OBJECTS = {"Opera", "Fmap"};
	
	// alternative 1
	public static final List<String> MY_OBJECTS_ENHANCED = Collections.unmodifiableList(Arrays.asList(MY_OBJECTS));
	
	// alternative 2
	public static final Object[] myObjects() {
		return MY_OBJECTS.clone();
	}
	
}
