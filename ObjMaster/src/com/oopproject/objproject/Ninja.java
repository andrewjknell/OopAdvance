package com.oopproject.objproject;

public class Ninja extends Human {
	public Ninja() {
		super();
		stealth = 10;
	}
	
	public void steal(Human h) {
		health += h.stealth;
	}
	
	public void run(Human h) {
		h.health -= 10;
	}
	
}
