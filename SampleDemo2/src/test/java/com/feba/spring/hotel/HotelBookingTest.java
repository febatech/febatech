package com.feba.spring.hotel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.feba.spring.circular.injection.ServiceA;
import com.feba.spring.customer.BookingService;

public class HotelBookingTest {
	
	public static void main(String args[]){
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/test/resources/com/feba/applicationContext.xml"));
		
		BookingService service = factory.getBean("bookingService", BookingService.class);
		String status = service.booking();
		System.out.println("Booking Service Message : "+status);
		
		ServiceA a= factory.getBean("serviceA", ServiceA.class);
		
	}

}
