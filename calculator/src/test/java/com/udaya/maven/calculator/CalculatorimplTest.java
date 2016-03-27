package com.udaya.maven.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorimplTest {

	@Test
	public void addShouldReturnAResult() {
	     Calculator c = new Calculatorimpl();
	     int result = c.add(10,20);
	     assertEquals(30, result); 
	}
}
