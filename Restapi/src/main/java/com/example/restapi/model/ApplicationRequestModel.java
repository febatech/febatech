package com.example.restapi.model;

public class ApplicationRequestModel {
	private  String customerName;
	private  String cusId;
	private  Contact contactDetails;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public Contact getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(Contact contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
}
