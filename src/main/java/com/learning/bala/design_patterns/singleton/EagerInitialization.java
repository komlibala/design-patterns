package com.learning.bala.design_patterns.singleton;

public class EagerInitialization {

	private static final EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization(){
		
	}
	
	public static EagerInitialization getInstance(){
		return instance;
	}
	
	public String printEagerInit(){
		return "I am eager init";
	}
}
