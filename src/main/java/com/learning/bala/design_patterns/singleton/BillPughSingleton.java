package com.learning.bala.design_patterns.singleton;

public class BillPughSingleton {

	private BillPughSingleton(){
		
	}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
	
	public String printBullPughSingleton(){
		return "I am BillpughSingleton";
	}
}
