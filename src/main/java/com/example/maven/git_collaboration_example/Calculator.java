package com.example.maven.git_collaboration_example;

public class Calculator {
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public int divide(int firstNumber, int secondNumber) {
		int result = 0;

		try {
			result = firstNumber / secondNumber;
		} catch (ArithmeticException e) {
			e.getMessage();
			System.out.println("You can't divide by zero!");
		}
		return result;
	}

	public int square(int number) {
		int result = number * number;
		return result;
	}

	public int cube(int number) {
		return number * number * number;
	}

	public int areaOfCircle(int base, int height) {
		return (int) ((base * height) * Math.PI);
	}

	// methods for MadBar to add test cases for

	// MadBar: This method is the same as Multiply. Maybe conditions need to be
	// added to make sure percentageToCalculate isn't over 1.00. Though if the
	// user Wants to know what 315 percent of something is, this would work.
	
	// Till exempel 0.75*584930583 = 75 % av 584930583
	public double percent(double percentageToCalculate,
			double number) {
		return percentageToCalculate * number;
	}

	public double squareRoot(double numberToRoot) {
		return Math.sqrt(numberToRoot);
	}

}
