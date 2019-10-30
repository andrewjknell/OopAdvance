package com.oopproject.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("throwing bananas");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("mmmm bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("climbed a tree");
		energyLevel -= 10;
	}
	
}
