package com.feba.springboot.jdbc.example.springbootJDBCapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.feba.springboot.")
public class SpringbootJdbCapplicationApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		DBOperationService service = null;
		context = SpringApplication.run(SpringbootJdbCapplicationApplication.class, args);
		service=context.getBean("stuService", DBOperationService.class);
		System.out.println(service.getStudent(123456));
	}
}
