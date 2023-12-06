package com.verifieurfou.presentations.wrappers;

import static java.lang.System.currentTimeMillis;

import java.util.Arrays;

public class Wrappers {

	public static void main(String[] args) {
		Integer[] wrappersArray = new Integer[1_000_000];
		
		for(int i = 0; i < wrappersArray.length; i++) {
			wrappersArray[i] = new Integer(0);
		}
		while(true);
		
		
		
//		Long sum = 0L;
//		long sum = 0L;
//		
//		long milliBefore = currentTimeMillis();
//		for (long i = 0; i < Integer.MAX_VALUE; i++) {
//			sum += i;
//		}
//		
//		System.out.println(currentTimeMillis() - milliBefore);

	}

}
