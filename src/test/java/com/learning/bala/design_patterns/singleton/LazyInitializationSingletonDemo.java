package com.learning.bala.design_patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazyInitializationSingletonDemo {

	@Test
	public void printLazyInitializationSingleton(){
		LazyInitializationSingleton instance = LazyInitializationSingleton.getOnstance();
		Assert.assertEquals("I am lazy initialization singleton", instance.printLazySingleton());
	}
}
