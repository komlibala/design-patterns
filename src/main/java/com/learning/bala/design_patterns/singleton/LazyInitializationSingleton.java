package com.learning.bala.design_patterns.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton instance;

	/**
	 * 
	 * This implementation works fine in case of single threaded environment but
	 * when it comes to multithreaded systems, it can cause issues if multiple
	 * threads are inside the if loop at the same time. It will destroy the
	 * singleton pattern and both threads will get the different instances of
	 * singleton class
	 */
	public static LazyInitializationSingleton getOnstance() {
		if (instance == null)
			instance = new LazyInitializationSingleton();
		return instance;
	}

	public String printLazySingleton() {
		return "I am lazy initialization singleton";
	}
}
