package com.feba.spring.bean.inheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HyundaiI10Test {
	
	public static void main(String args[]){
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/test/resources/com/feba/applicationContext.xml"));
		
//		HyundaiI10 hundaiI10Base = factory.getBean("hundaiI10Base", HyundaiI10.class);
//		System.out.println("Car Details :  "+hundaiI10Base.toString());
//		
		HyundaiI10 magna = factory.getBean("magna", HyundaiI10.class);
		System.out.println("Car Details :  "+magna.toString());
		
		HyundaiI10 sportz = factory.getBean("sportz", HyundaiI10.class);
		System.out.println("Car Details :  "+sportz.toString());
		
		HyundaiI10 asta = factory.getBean("asta", HyundaiI10.class);
		System.out.println("Car Details :  "+asta.toString());
		
		HyundaiI10 base = factory.getBean("base", HyundaiI10.class);
		System.out.println("Car Details :  "+base.toString());
	}

}
