package com.learning.bala.design_patterns.factory;

public class MathFactory {

	public static Math getMath(String type){
		if(type.equals("addition"))
			return new Addition();
		else if(type.equals("subtract"))
			return new Subtract();
		else if(type.equals("multiplication"))
			return new Multiplcation();
		else
			throw new RuntimeException("No class found for the type you given");
	}
}
