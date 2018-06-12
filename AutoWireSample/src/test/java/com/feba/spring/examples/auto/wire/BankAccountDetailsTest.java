package com.feba.spring.examples.auto.wire;

import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class BankAccountDetailsTest {
	
	

	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/test/resources/com/feba/applicationContext.xml"));
		//BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = new FileSystemXmlApplicationContext("src/test/resources/com/feba/applicationContext.xml");
//		CustomerInfo customer = factory.getBean("customer", CustomerInfo.class);
//		
//		System.out.println("Customer Id "+customer.getCustomerId());
//		System.out.println("Phone Number "+ customer.getPhoneNumber());
//		System.out.println("Address Street :"+customer.getAddress1().getStreetName());
		
		
		BankAccountDetails bankAccountDetails= factory.getBean("bankAccountDetails", BankAccountDetails.class);
		CustomerInfo customer = bankAccountDetails.getCustomerInfo();
		System.out.println("Customer Id "+customer.getCustomerId());
		System.out.println("Phone Number "+ customer.getPhoneNumber());
		System.out.println("Address Street :"+customer.getAddress1().getStreetName());
		System.out.println("Account Type : "+bankAccountDetails.getAccountType().getAccountType());
		Properties props = bankAccountDetails.getProps();
		
		System.out.println("Message  : "+props.getProperty("sample.txt.message"));
		System.out.println("Message 1 : "+props.getProperty("sample.txt.message1"));
	}

}
