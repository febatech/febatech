package com.feba.spring.singleton;

public class SampleSingleton {
	
	 static SampleSingleton instance= null;
	 
	 static transient String svs = "sample ";
	
	private SampleSingleton(){
		
	}
	
	public static synchronized  SampleSingleton getInstance(){
		
		if(instance == null){
			instance = new SampleSingleton();
		}
		
		return instance;
	}
	
	/*
	 * public static  SampleSingleton getInstance(){
		
		if(instance == null){
			instance = new SampleSingleton();
		}
		
		return instance;
	}
	
	private static SampleSingleton instance = new SampleSingleton();
	public static  SampleSingleton getInstance(){
	
		return instance;
	}
	 */

}
