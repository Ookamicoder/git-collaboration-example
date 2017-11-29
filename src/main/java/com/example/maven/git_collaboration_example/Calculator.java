package com.example.maven.git_collaboration_example;

public class Calculator {
	public int add(int firstNumber,int secondNumber) {
		return firstNumber+secondNumber;
	}
	
	public int subtract(int firstNumber,int secondNumber) {
		return firstNumber-secondNumber;
	}
	
	public int multiply(int firstNumber,int secondNumber) {
		return firstNumber*secondNumber;
	}
	
	public int divide(int firstNumber,int secondNumber) {
		int result = 0;
		
		try {
			result = firstNumber/secondNumber;
		}catch(ArithmeticException e) {
			e.getMessage();
			System.out.println("You can't divide by zero!");
		}
		return result;
	}
	
	public int square(int number) {
		return number*number;
	}
	
	public int cube(int number) {
		return number*number*number;
	}

}
