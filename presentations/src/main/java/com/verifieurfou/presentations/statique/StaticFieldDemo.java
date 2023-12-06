package com.verifieurfou.presentations.statique;

import java.util.ArrayList;
import java.util.List;

public class StaticFieldDemo {

	static int staticField; // a.k.a class field
	int instanceField;
	
	public StaticFieldDemo(int instanceFieldArg, int staticFieldArg) {
		staticField = staticFieldArg;
		instanceField = instanceFieldArg;
	}

	public static void main(String... args) {
		var objInstances = new ArrayList<StaticFieldDemo>();
		objInstances.add(new StaticFieldDemo(1, 11));
		objInstances.add(new StaticFieldDemo(2, 12));
		objInstances.add(new StaticFieldDemo(3, 13));
		printFields(objInstances);
	}
	
	static void printFields(List<StaticFieldDemo> objInstances) {
		objInstances.forEach(System.out::println);
	}

	@Override
	public String toString() {
		return String.format("staticField: %d; instanceField: %d", staticField, instanceField);
	}
	
}