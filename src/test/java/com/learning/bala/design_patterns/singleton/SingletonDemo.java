package com.learning.bala.design_patterns.singleton;

import org.junit.Test;

public class SingletonDemo {

	@Test
	public void checkSingleObj(){
		Singleton singleObj = Singleton.getInstance();
		Singleton singleObj1 = Singleton.getInstance();
		singleObj.display(singleObj);
		singleObj1.display(singleObj1);
	}
}
