package com.verifieurfou.presentations.statique;

import static java.lang.Math.cos;
import static java.lang.Math.PI;
import static java.lang.System.out;
import static java.util.Objects.requireNonNullElse;

public class ImportStatic {

	double a = Math.pow(2, 10);
	
	double b = Math.cos(Math.PI);
	double c = cos(PI);
	
	{
		out.println("sans import statique");
		requireNonNullElse(System.getProperty("am I null ?"), "default value");
	}
	
}
