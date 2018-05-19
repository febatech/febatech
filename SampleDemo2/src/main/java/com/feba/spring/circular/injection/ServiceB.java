package com.feba.spring.circular.injection;

public class ServiceB {
	
	ServiceA serviceA;
//	public ServiceB(ServiceA serviceA){
//		this.serviceA = serviceA;
//	}
	
public ServiceB(){
		// This is how internally Bean Controller will call Setter Injection
		//ServiceB b = new ServiceB();
		//b.setServiceA(serviceA);
	
		//This is how internally Bean Controller will call Constructor Injection 
		//ServiceB b = new ServiceB(serviceA)
	
	}
	
	public void setServiceA(ServiceA serviceA){
		this.serviceA= serviceA;
	}

}
