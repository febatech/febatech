package com.feba.spring.hotel.vendor;

import com.feba.spring.hotel.HotelBooking;

public class TajHotel implements HotelBooking {
	
	public  TajHotel(){
		System.out.println("Welcome to Taj Hotel ....");
	}

	public final String bookRoom(int roomNumber) {
		return "Room booking done for the Room Number : "+roomNumber;
	}

}
