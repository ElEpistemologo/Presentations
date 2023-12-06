package com.verifieurfou.presentations.item49_50_76;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.verifieurfou.presentations.item49_50_76.Hardware;
import com.verifieurfou.presentations.item49_50_76.TablettePerformante;
import com.verifieurfou.presentations.item49_50_76.Hardware.HardwareType;

class TablettePerformanteTest {

	@DisplayName("Invariant non assuré -> lowcost")
	@Test
//	@Disabled
	void highEnd() {
		var tablette = new TablettePerformante(new Hardware(HardwareType.HIGHEND));
		assertEquals(0, tablette.afficherCarte());
	}

	@DisplayName("Invariant non assuré -> lowcost")
	@Test
//	@Disabled
	void lowcost() {
//		var tablette = new TablettePerformante(new Hardware(HardwareType.LOWCOST));
//		assertEquals(0, tablette.afficherCarte());
		assertThrows(IllegalArgumentException.class, () -> new TablettePerformante(new Hardware(HardwareType.LOWCOST)));
	}

	@DisplayName("Invariant non assuré -> null pointer")
	@Test
//	@Disabled
	void nP() {
//		var tablette = new TablettePerformante(null);
//		assertEquals(0, tablette.afficherCarte());
		assertThrows(NullPointerException.class, () -> new TablettePerformante(null));
	}

	@DisplayName("Invariant non assuré -> hardware muté")
	@Test
//	@Disabled
	void highEndMuted() {
		Hardware hardware = new Hardware(HardwareType.HIGHEND);
		var tablette = new TablettePerformante(hardware);
		hardware.setHt(HardwareType.LOWCOST);
		assertEquals(0, tablette.afficherCarte());
	}

	@DisplayName("assertion dans une méthode privée")
	@Test
	@Disabled
	void assertTest() {
		var tablette = new TablettePerformante(new Hardware(HardwareType.LOWCOST));
		assertThrows(AssertionError.class, () -> tablette.afficherCarte());
	}

}
