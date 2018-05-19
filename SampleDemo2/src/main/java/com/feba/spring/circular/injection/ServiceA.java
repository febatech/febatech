package com.feba.spring.circular.injection;


public class ServiceA {
	
	ServiceB serviceB;
	
//	public ServiceA(ServiceB serviceB){
//		this.serviceB = serviceB;
//	}
	
	public ServiceA(){
		
	}
	
	public void setServiceB(ServiceB serviceB){
		this.serviceB= serviceB;
	}

}
