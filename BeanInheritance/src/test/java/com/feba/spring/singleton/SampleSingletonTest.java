package com.feba.spring.singleton;

public class SampleSingletonTest {
	
	public static void main(String args[]){
		
		//SampleSingleton sampleObject = new SampleSingleton();
		SampleSingleton sampleObject = SampleSingleton.getInstance();
	}

}
