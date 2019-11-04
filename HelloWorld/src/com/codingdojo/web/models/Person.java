package com.codingdojo.web.models;

public class Person {
	private String name;
	private int age;
	
	public Person(String n, int x) {
		name = n;
		age = x;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int x) {
		age = x;
	}
	
	public String greeting() {
		return "hello my name is " + name + " and I am "+age+ " years old.";
	}
}
