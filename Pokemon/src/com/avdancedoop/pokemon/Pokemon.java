package com.avdancedoop.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int pokes;
	
	public Pokemon() {
		name = "pokeman";
		health = 100;
		type = "poke";
		pokes++;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setHealth(int x) {
		health = x;
	}
	public void setType(String n) {
		type = n;
	}
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	
	public void attack(Pokemon p) {
		p.health -= 10;
	}
}
