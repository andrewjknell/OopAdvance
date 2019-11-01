package com.objadvanced.calculator;

public class Calculator {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private double result;
	
	public Calculator() {
		
	}
	public void setOperOne(double x) {
		operandOne = x;
	}
	
	public void setOperTwo(double x) {
		operandTwo = x;
	}
	
	public void setOper(String n) {
		operation = n;
	}
	public void performOper(Calculator n) {
		if(n.operation == "+") {
			result = n.operandOne + n.operandTwo; 
		}
		if(n.operation == "-") {
			result = n.operandOne - n.operandTwo; 
		}
		if(n.operation == "*") {
			result = n.operandOne * n.operandTwo; 	
		}
		if(n.operation == "/") {
			result = n.operandOne / n.operandTwo; 	
		}

	}
	
	public double getResult() {
		return result;
	}
}
