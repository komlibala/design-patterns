package com.learning.bala.design_patterns.abstract_factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type){
		if(type.equals("shape"))
			return new ShapeFactory();
		else if(type.equals("color"))
			return new ColorFactory();
		else
			return null;
	}
}
