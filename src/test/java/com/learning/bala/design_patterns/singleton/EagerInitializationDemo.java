package com.learning.bala.design_patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class EagerInitializationDemo {

	@Test
	public void testEagerInit(){
		EagerInitialization instance = EagerInitialization.getInstance();
		Assert.assertEquals("I am eager init", instance.printEagerInit());
	}
}
