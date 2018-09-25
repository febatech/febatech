package com.example.restapi.model;

import java.util.List;

public class Contact {

	private List<Addresses> address;
	private String phone;
	private String email;
	public List<Addresses> getAddress() {
		return address;
	}
	public void setAddress(List<Addresses> address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
