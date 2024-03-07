package com.verifieurfou.presentations.stream;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalleleStreams {

	// ForkJoinFramework
	
	public static void main(String[] args) {

		long before = System.currentTimeMillis();
		
//		sequential();
		parallel();
		
		System.out.println(System.currentTimeMillis() - before);
	}

	static void sequential() {
		Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime)
			.limit(100_000)
			.forEach(System.out::println);
	}
	
	/**
	 * javadoc limit(): While limit() is generally a cheap operation on sequential stream pipelines, it can be quite expensive on ordered parallel pipelines
	 * pareil pour skip(), takeWhile(), dropWhile(), 
	 */
	static void parallel() {
		Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime)
			.parallel()
			.limit(100_000)
			.unordered()
			.forEach(System.out::println);
	}
	
	// la parallélisation a un coût -> est-il compensé par le gain en vitesse ?
	
	void collectDetails() {
		List<Integer> collect = Stream.iterate(0, i -> i * i)
			.filter(i -> i % 3 == 0)
			.map(i -> i)
			.collect(Collectors.toList());
		// .toList()
		
//		 .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
	}

	void criminel() {
		
		Map<String, String> myMap = Map.of("Taha", "rt", "Valentin", "dev", "Guillaum", "dev");
		
		myMap.entrySet().parallelStream()
			.filter(t -> t.getValue().equals("dev"))
			.forEach(t -> {
				synchronized (myMap) {
					myMap.remove(t.getKey());
				}
			});
	}
	
}
