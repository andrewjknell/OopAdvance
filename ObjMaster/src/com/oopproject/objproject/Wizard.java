package com.oopproject.objproject;

public class Wizard extends Human {
	public Wizard() {
		super();
		health = 50;
		intelligence = 8;
		
	}
	
	public void heal(Human h) {
		h.health += intelligence;
		
	}
	
	public void fireBall(Human h) {
		h.health -= (intelligence*3);
	}
}
