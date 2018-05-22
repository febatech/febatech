package com.feba.spring.boot.sample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.feba.spring.boot.sample1.service.HelloMessageGeneratorService;

@SpringBootApplication
@ComponentScan(basePackages="com.feba.spring.boot.sample1.service")
public class SampleDemoApplication {
	public static void main(String args[]){
		ApplicationContext context = null;
		
		HelloMessageGeneratorService service = null;
		
		context = SpringApplication.run(SampleDemoApplication.class, args);
		
		service = context.getBean("helloMessage", HelloMessageGeneratorService.class);
		
		System.out.println(service.generateHelloMessage("Kishan"));
		
	}
	
}
