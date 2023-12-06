package com.verifieurfou.presentations.wrappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Boxing {

	{
		float f;
		Float fW;
		
		double d; 
		Double dW;
		
		byte b;
		Byte bW;
		
		short s;
		Short sW;
		
		int i;
		Integer iW;
		
		long l;
		Long lW;
		
		boolean bo;
		Boolean boW;
		
		char c;
		Character cW;
	}
	
	void boxing_v1() {
		int a = 42;
		Integer aW = new Integer(a);
		
		// "auto" boxing
		int b = 42;
		Integer bW = b;
	}
	
	void unboxing_v1() {
		Integer aW = new Integer(42); 
		int a = aW.intValue();
		
		// "auto" unboxing
		Integer bW = new Integer(42);
		int b = bW;
	}
	
	void boxing_v2() {
		int a = 42;
		Integer aW = Integer.valueOf(a);
		
		// "auto" boxing
		int b = 42;
		Integer bW = b;
	}
	
	void unboxing_v2() {
		Integer aW = Integer.valueOf(42); 
		int a = aW.intValue();
		
		// "auto" unboxing
		Integer bW = 42;
		int b = bW;
	}
	
	void importantMethods() {
		int a = Integer.parseInt("10");
		Integer b = Integer.valueOf(10);
		Integer c = Integer.valueOf("10");
		double d = b.longValue();
		String valeur = "23";
		int valPrim = Integer.parseInt(valeur);
		Integer valBox = Integer.valueOf(valeur);
		
		Integer valeurBox = 42;
		double g = valeurBox.doubleValue();
		String binary = valeurBox.toBinaryString(valPrim); // 101010
		int max = Integer.max(valPrim, 28);
		int min= Integer.min(valPrim, 28);
	}
	
	void whyBoxing() {
		//List<int> notPossible;
		// Map<int, double> notPossibleEither;
		List<Integer> possible;
		Map<Integer, Double> possibleEither;
		
		Function<Integer, Double> e;
		IntFunction<Double> f;
		IntToDoubleFunction l;
		
		Predicate<?> g;
		DoublePredicate h;
		
		Stream i;
		IntStream j;
		DoubleStream k;
		
		Iterator a;
		PrimitiveIterator b;
		Spliterator c;
		Spliterator.OfInt d;
		
	}
}
