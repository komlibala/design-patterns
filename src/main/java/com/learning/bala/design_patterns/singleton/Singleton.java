package com.learning.bala.design_patterns.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	public void display(Singleton singleObj){
		System.out.println("Single object demo : "+singleObj);
	}
}
