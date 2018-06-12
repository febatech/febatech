package com.feba.spring.examples.namespace;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeTest {
	
	public static void main(String args[]){
		BeanFactory factory = new FileSystemXmlApplicationContext("src/test/resources/com/feba/springXMLFile.xml");
		
		Employee emp = factory.getBean("employee", Employee.class);
		
		System.out.println(emp.toString());
	}

}
