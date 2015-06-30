package com.learning.bala.design_patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class BillPughSingletonDemo {

	@Test
	public void testBillPughSingleton(){
		BillPughSingleton instance = BillPughSingleton.getInstance();
		Assert.assertEquals("I am BillpughSingleton", instance.printBullPughSingleton());
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		System.out.println(instance == instance1);
	}
}
