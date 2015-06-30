package com.learning.bala.design_patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class StaticBlockSingletonDemo {

	@Test
	public void staticBlockSingleton(){
		StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
		Assert.assertEquals("I am StaticBlockSingleton", instance.printStaticBlockSingleton());
	}
}
