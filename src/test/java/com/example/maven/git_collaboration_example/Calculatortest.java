package com.example.maven.git_collaboration_example;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;


public class Calculatortest {

	Calculator c = new Calculator();
	static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Random r = new Random();
	
	
	@Test
	public void testAddMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method add with" + firstNumber + " and " + secondNumber);
			assertEquals(c.add(firstNumber, secondNumber), result);
		}
	}
	@Test
	public void testSubtractMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber - secondNumber;
			LOG.info("Testing the subtract add with" + firstNumber + " and " + secondNumber);
			assertEquals(c.subtract(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testMulitiplyMethod() {
		for(int i = 0; i <10 ;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber * secondNumber;
			LOG.info("Testing the mulitiply add with" + firstNumber + " and " + secondNumber);
			assertEquals(c.multiply(firstNumber, secondNumber), result);
		}
	}
	
	@Test
	public void testDivideMethod() {
		
		for(int i = 0;i<100;i++) {
			int firstNumber = r.nextInt(100);
			int secondNumber = r.nextInt(100);
			int result = 0;
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method divide with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(c.divide(firstNumber, secondNumber)), Math.round(result),1);
			//assertEquals(c.divide(firstNumber, secondNumber), result);			
		}
	}

}
