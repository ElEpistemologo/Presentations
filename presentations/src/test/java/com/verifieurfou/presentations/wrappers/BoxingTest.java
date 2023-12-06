package com.verifieurfou.presentations.wrappers;

import org.junit.jupiter.api.Test;

class BoxingTest {

	@Test
	void testBoxed() {
		long before = System.currentTimeMillis();
		Long sum = 0L;
		
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		
		long after = System.currentTimeMillis();
		System.out.println(after - before);
	}
	
	@Test
	void testPrimitive() {
		long before = System.currentTimeMillis();
		long sum = 0l;
		
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		
		long after = System.currentTimeMillis();
		System.out.println(after - before);
	}

	@Test
	void testNullDereference() {
		Integer a = null;
		int b = a;
	}
}
