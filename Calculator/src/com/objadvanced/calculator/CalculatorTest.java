package com.objadvanced.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperOne(10.4);
		c.setOperTwo(2.5);
		c.setOper("*");
		c.performOper(c);
		System.out.println(c.getResult());
	}

}
