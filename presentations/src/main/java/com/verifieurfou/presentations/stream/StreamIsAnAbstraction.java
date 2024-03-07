package com.verifieurfou.presentations.stream;

import java.util.stream.IntStream;

public class StreamIsAnAbstraction {
	
	public static void main(String... args) {
		
		/*
		 * LAZY-SEEKING
		 */
		
		Runnable r = () -> System.out.println("coucou");
		
		long a = IntStream.of(0, 1, 2).map(i -> {
			r.run();
			return i;
		})
//		.filter(i -> i == 0)
		.count();
		
		System.out.println(a);
		
	}
	
	// "Exécuter des streams de façon lazy permet des optimisiations significatives [...] les opérations peuvent être fusionner en un seul passage sur la donée, minimisant ainsi les résultats intermédiaires" (doc java.util.stream)
	void lazy() {
		IntStream.of(0, 1, 2, 3, 4, 5)
			.anyMatch(i -> i == 1);
	}
	
	// NO STORAGE (doc java.util.stream)
	// "un stream n'est pas une structure de donnée qui stocke des éléments"
	
	void inWhatOrder2() {
		IntStream.of(0, 1, 2, 3, 4, 5)
			.map(i -> i++)
			.filter(i -> i > 2)
			.sum();
	}
	
	void inWhatOrder() {
		IntStream.of(0, 1, 2, 3, 4, 5)
			.filter(i -> i > 2)
			.map(i -> i++)
			.sum();
	}
	
}
