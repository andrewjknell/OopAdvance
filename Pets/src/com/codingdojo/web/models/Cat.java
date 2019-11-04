package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{

	
	public Cat(String n, String b, int x) {
		super(n,b,x);
	}

	@Override
	public String showAffection() {
		if(getWeight() > 15) {
			return "youre fat";
		} else {
			return "sit on my lap";
		}
	}
}
