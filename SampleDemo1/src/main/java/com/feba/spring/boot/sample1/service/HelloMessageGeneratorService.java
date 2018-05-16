package com.feba.spring.boot.sample1.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("helloMessage")
public class HelloMessageGeneratorService {
	
	public String generateHelloMessage(String name){
		Calendar cal = null;
		String message = "Hello, "+name;
		int hour=0;
		cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour<=12){
			message = "Good Morning, "+name;
		}else if(hour <=16 ){
			message = "Good Afternoon, "+name;
		}else if(hour <= 20 ){
			message = "Good Evening, "+name;
		}else if(hour <= 24){ 
			message = "Good Night, "+name;
		}
		return message;
	}

}
