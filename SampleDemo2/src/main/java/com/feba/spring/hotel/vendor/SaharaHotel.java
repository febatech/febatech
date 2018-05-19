package com.feba.spring.hotel.vendor;

import com.feba.spring.hotel.HotelBooking;


public class SaharaHotel implements HotelBooking{
	
	public SaharaHotel(){
		System.out.println("Welcome to Sahara Hotels ...");
	}

	public final String bookRoom(int roomNumber) {
		return "Room booking completed for "+roomNumber;
	}

}
