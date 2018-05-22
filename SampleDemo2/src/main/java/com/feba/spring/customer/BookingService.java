package com.feba.spring.customer;

import java.util.Random;

import com.feba.spring.hotel.HotelBooking;

public class BookingService {
	
	private HotelBooking hotelBooking;
	
	public BookingService(){
		System.out.println("Booking Service installized");
		//this.hotelBooking = hotelBooking;
	}
	
	public void setHotelBooking(HotelBooking hotelBooking){
		System.out.println("Setting HotelBooking..");
		this.hotelBooking = hotelBooking;
	}
	
	public String booking(){
		Random random = new Random();
		
		int roomNumber = random.nextInt(2000);
		String status = hotelBooking.bookRoom(roomNumber);
		return status+ ", Thank you  ";
	}

}
