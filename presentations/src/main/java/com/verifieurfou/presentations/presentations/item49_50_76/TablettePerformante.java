package com.verifieurfou.presentations.presentations.item49_50_76;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.google.common.base.Preconditions;
import com.verifieurfou.presentations.presentations.item49_50_76.Hardware.HardwareType;

/**
 * 
 * Une tablette performante doit toujours rester en dessous de 40°C
 * 
 */
public class TablettePerformante {

	private Hardware hardware;
	//private static final Hardware DEFAULT_HARDWARE = new Hardware(HardwareType.HIGHEND);
	
	//1
//	public TablettePerformante(Hardware hardware) {
//		this.hardware = hardware;
//	}
	
	// 2
//	public TablettePerformante(Hardware hardware) {
//		if (hardware.getHardwareType() != HardwareType.HIGHEND) throw new IllegalArgumentException();
//		this.hardware = hardware;
//	}
	
	//3
//	public TablettePerformante(Hardware hardware) {
//		Objects.requireNonNull(hardware);
//		if ( hardware.getHardwareType() != HardwareType.HIGHEND) throw new IllegalArgumentException();
//		this.hardware = hardware;
//	}
	
	//4
//	public TablettePerformante(Hardware hardware) {
//		Objects.requireNonNull(hardware);
//		if ( hardware.getHardwareType() != HardwareType.HIGHEND) throw new IllegalArgumentException();
//		this.hardware = new Hardware(hardware);
//	}
	
	//5
	public TablettePerformante(Hardware hardware) {
		Objects.requireNonNull(hardware);
		this.hardware = new Hardware(hardware);
		if (this.hardware.getHardwareType() != HardwareType.HIGHEND) throw new IllegalArgumentException();
	}
	
	public long afficherCarte() {
		if ( hardware.getUsageTemperature() >= 40) throw new RuntimeException("Tablette trop chaude, échec de l'API !!");
		else return 0;
//		return getCarte();
	}

}