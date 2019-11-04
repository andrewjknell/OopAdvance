package com.codingdojo.web.models;

public class Animal {
	private String name;
	private String breed;
	private int weight;
	
	public Animal(String n, String b, int x) {
		this.setName(n);
		this.setBreed(b);
		this.setWeight(x);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
