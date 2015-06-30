package com.learning.bala.design_patterns.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	static{
		try{
			instance = new StaticBlockSingleton();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private StaticBlockSingleton(){
		
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
	
	public String printStaticBlockSingleton(){
		return "I am StaticBlockSingleton";
	}
}
