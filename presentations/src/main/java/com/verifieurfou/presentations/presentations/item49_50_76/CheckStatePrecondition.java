package com.verifieurfou.presentations.presentations.item49_50_76;

import java.util.Arrays;
import java.util.Objects;

import com.google.common.base.Preconditions;

public class CheckStatePrecondition {

	enum Daytime {
		MATIN, MIDI, SOIR, NUIT
	}
	
	private Daytime daytime;
	
	CheckStatePrecondition(Daytime dayTime){
		this.daytime = dayTime;
	}
	
	public void wakeUp() {
		Preconditions.checkState(daytime.equals(Daytime.MATIN));
	}

	public void goToBed() {
		Preconditions.checkState(daytime.equals(Daytime.SOIR));
	}
	
	// Exception au check immédiat des arguments
	public int sumOfNonZero(int[] array) throws PeteLeClaquage{
		Arrays.sort(array);
		Preconditions.checkArgument(Arrays.binarySearch(array, 0) < 0);
		
		int result = 0;
		for(int e: array) {
			if ( e == 0 ) {
				throw new PeteLeClaquage();
			}
			result += e;
		}
		
		return result;
	}
	
	// Guava
	public void guava(int[] array, int arrayIndex, String string) {
		Objects.requireNonNull(string);
		Preconditions.checkArgument(!string.isEmpty());
		Preconditions.checkNotNull(array);
		Preconditions.checkPositionIndex(arrayIndex, array.length);
	}
	
	public static void assertAndPreconditions(String str) {
		Objects.requireNonNull(str);
		
		internalComputation(str.length() - 5);
	}
	
	private static void internalComputation(int a) {
		assert a > 0;
		// Fait des truc avec a
	}
	
}

class PeteLeClaquage extends Exception{}
