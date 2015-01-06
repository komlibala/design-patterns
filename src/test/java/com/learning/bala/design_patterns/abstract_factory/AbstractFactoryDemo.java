package com.learning.bala.design_patterns.abstract_factory;

import org.junit.Test;

public class AbstractFactoryDemo {

	@Test
	public void shapeFactoryTest(){
		AbstractFactory producer = FactoryProducer.getFactory("shape");
		Shape shape = producer.getShape("circle");
		shape.draw();
	}
	
	@Test
	public void colorFactoryTest(){
		AbstractFactory producer = FactoryProducer.getFactory("color");
		Color color = producer.getColor("red");
		color.fill();
	}
}
