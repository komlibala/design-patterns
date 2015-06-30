package com.learning.bala.design_patterns.singleton;

import junit.framework.Assert;

import org.junit.Test;

public class ThreadSafeSingletonDemo {

	@Test
	public void testThreadsafeSingleton(){
		ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
		Assert.assertEquals("I am thread safe singleton", instance.printThreadsafeSingleton());
		ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstance();
		
		
		/*ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		Assert.assertEquals("I am thread safe singleton", instance1.printThreadsafeSingleton());
		*/
		
		
		System.out.println((instance==instance3));
	}
}
