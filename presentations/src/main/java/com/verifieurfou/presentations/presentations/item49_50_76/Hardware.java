package com.verifieurfou.presentations.presentations.item49_50_76;

public class Hardware{

	public enum HardwareType{
		LOWCOST(70), HIGHEND(20);
		
		int usageTemperature;

		private HardwareType(int temperatureUsage) {
			this.usageTemperature = temperatureUsage;
		}
	}
	
	private HardwareType ht;
	
	Hardware (HardwareType ht){
		this.ht = ht;
	}
	
	Hardware (Hardware ht){
		this.ht = ht.getHardwareType();
	}
	
	public HardwareType getHardwareType() {
		return ht;
	}

	public int getUsageTemperature() {
		return ht.usageTemperature;
	}

	public void setHt(HardwareType ht) {
		this.ht = ht;
	}
	
}
