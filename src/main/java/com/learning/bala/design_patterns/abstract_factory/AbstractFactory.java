package com.learning.bala.design_patterns.abstract_factory;

public abstract class AbstractFactory {

	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}
