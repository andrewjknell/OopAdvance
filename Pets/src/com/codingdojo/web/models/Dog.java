package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	
	public Dog(String n, String b, int x) {
		super(n,b,x);
	}

	@Override
	public String showAffection() {
		if(getWeight() > 30) {
			return "sits next to me";
		} else {
			return "sits on my lap";
		}
	}
	
}
