package com.learning.bala.design_patterns.factory;

import static junit.framework.Assert.*;

import org.junit.Test;

public class FactoryDemo {

	@Test
	public void checkAddition(){
		Math math = MathFactory.getMath("addition");
		int addValue = math.calc(10, 20);
		assertEquals(30, addValue);
	}
	
	@Test
	public void checkSubtraction(){
		Math math = MathFactory.getMath("subtract");
		int subValue = math.calc(10, 20);
		assertEquals(-10, subValue);
	}
	
	@Test
	public void checkMultiplication(){
		Math math = MathFactory.getMath("multiplication");
		int mulValue = math.calc(10, 20);
		assertEquals(200, mulValue);
	}
	
	@Test(expected=RuntimeException.class)
	public void checkException(){
		Math math = MathFactory.getMath("exception");
		math.calc(10, 20);
	}
	
}
