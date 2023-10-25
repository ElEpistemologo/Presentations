package com.verifieurfou.presentations.presentations.item49_50_76;

import static com.verifieurfou.presentations.presentations.item49_50_76.CheckStatePrecondition.Daytime.MATIN;
import static com.verifieurfou.presentations.presentations.item49_50_76.CheckStatePrecondition.Daytime.MIDI;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CheckStatePreconditionTest {

	@Test
	void wakeUpDuringDay() {
		CheckStatePrecondition midi = new CheckStatePrecondition(MIDI);
		assertThrows(IllegalStateException.class, () -> midi.wakeUp());
	}
	
	@Test
	void goToBedDuringNoon() {
		CheckStatePrecondition matin = new CheckStatePrecondition(MATIN);
		assertThrows(IllegalStateException.class, () -> matin.goToBed());
	}
	
	@Test
	void assertDemo1() {
		CheckStatePrecondition.assertAndPreconditions("123456");
	}
	
	@Test
	void assertDemo2() {
		assertThrows(AssertionError.class, () -> CheckStatePrecondition.assertAndPreconditions("123"));
	}

}
