package com.example.restapi.model;

/**
 * @author chall
 *
 */
public class CustomerRegistrationResponse {
	String customerName;
	String custId;
	String phone;
	String email;
	String redistrationId;
	String rgistrationStatus;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getRedistrationId() {
		return redistrationId;
	}

	public void setRedistrationId(String redistrationId) {
		this.redistrationId = redistrationId;
	}

	public String getRgistrationStatus() {
		return rgistrationStatus;
	}

	public void setRgistrationStatus(String rgistrationStatus) {
		this.rgistrationStatus = rgistrationStatus;
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
