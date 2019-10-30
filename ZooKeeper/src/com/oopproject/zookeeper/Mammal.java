package com.oopproject.zookeeper;

public class Mammal {
	
	public int energyLevel;
	public Mammal() {
		energyLevel = 100; 
	}
	public Mammal(int num) {
		energyLevel = num;
	}
	
	public int displayEnergy() {
		System.out.println("energy level: " + energyLevel);
		return energyLevel;
	}
}
