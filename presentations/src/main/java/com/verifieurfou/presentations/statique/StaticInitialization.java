package com.verifieurfou.presentations.statique;

public class StaticInitialization {

	static int a = init();
	
	static int b = 6;
	
	static MyClass m;
	
	static {
		System.out.println(String.format("Initialisation: %s", StaticInitialization.class));
		MyClass.m();
	}
	
	public static void main(String... args) {
		var staticDemo = new StaticInitialization();
		System.out.println("coucou");
//		System.out.println(a);
		while(true);
	}
	
	static int init() {
		System.out.println("init variable a");
		return 3;
	}
}

