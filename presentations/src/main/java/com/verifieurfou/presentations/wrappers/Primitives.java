package com.verifieurfou.presentations.wrappers;

import java.util.Arrays;

import static java.lang.System.currentTimeMillis; 

/// Joshua Blosch, Effective Java item 61: "Prefer Primitive types to boxed primitives"

public class Primitives {

	public static void main(String[] args) {
		
		int[] primitiveArray = new int[1_000_000];
		Arrays.fill(primitiveArray, 0);
		while(true);
	}

}
