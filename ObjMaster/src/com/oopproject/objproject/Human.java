package com.oopproject.objproject;

public class Human {
	int strength;
	int stealth;
	int intelligence;
	int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}

	public void attack(Human h) {
		h.health -= strength;
		System.out.println("health: " + h.health);
	}
	public void display() {
		System.out.println("strength: "+strength);
		System.out.println("stealth: "+stealth);
		System.out.println("intelligence: "+intelligence);
		System.out.println("health: "+health);
	}
}
