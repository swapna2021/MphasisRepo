package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		
		int expected=10;
		int actual = new Calculator().add(5, 5);
		assertEquals(expected,actual,"expected output for input 5,5 is 10");
		
	}
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4),"for input 4 result must be true");
	}
	
	@Test
	public void checkArraysTest() {
		int brr[]= {1,2,3,4,5};
		//assertArrayEquals( brr,new Calculator().checkArrays());
		assertSame(brr,new Calculator().checkArrays());
	}
	
	@Test
	public void checkAETest() {
		
		ArithmeticException ex=new ArithmeticException();
		
		//assertEquals(ex, new Calculator().checkAE());
		assertTrue(new Calculator().checkAE() instanceof RuntimeException);
	}

}
