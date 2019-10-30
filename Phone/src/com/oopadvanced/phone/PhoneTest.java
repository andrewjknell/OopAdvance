package com.oopadvanced.phone;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99,"verizon", "ring ring");
		Iphone ten = new Iphone("X", 75,"verizon", "ring ading ding");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());

		ten.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());		
		
	}

}
