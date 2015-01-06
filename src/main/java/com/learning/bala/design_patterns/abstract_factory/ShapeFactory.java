package com.learning.bala.design_patterns.abstract_factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape.equals("square"))
			return new Square();
		else if(shape.equals("rectrangle"))
			return new Rectangle();
		else if(shape.equals("circle"))
			return new Circle();
		else
			return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
