package com.oopproject.zookeeper;

public class Bat extends Mammal {
	int num = 300;
	public Bat() {
		super();
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("WHOOOOSSHHH!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("yummmm");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("AtTack!");
		energyLevel -= 100;
	}
}
