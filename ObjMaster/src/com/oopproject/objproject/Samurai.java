package com.oopproject.objproject;

public class Samurai extends Human{
	private static int counter;
	public Samurai() {
		super();
		health = 200;
		counter ++;
		
	}
	
	public void deathBlow(Human h) {
		h.health = 0;
		health = health/2;
	}
	
	public void meditate() {
		health = 200;
	}
	
	public void howMany() {
		System.out.println("number of samurais: " +counter );
	}
}
