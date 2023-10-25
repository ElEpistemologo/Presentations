package com.verifieurfou.presentations.presentations.item11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PhoneNumberTest {

	@DisplayName("Conséquence lorsqu'on override pas aussi hashcode")
	@Test
//	@Disabled
	void test() {
		var pn = new PhoneNumber(1, 2, 3);
		Map<PhoneNumber, String> m = new HashMap<>();
		m.put(pn, "Jenny");
		
		assertEquals("Jenny", m.get(new PhoneNumber(1, 2, 3)));
	}

}
