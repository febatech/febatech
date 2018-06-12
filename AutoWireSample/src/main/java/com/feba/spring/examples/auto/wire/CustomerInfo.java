/**
 * 
 */
package com.feba.spring.examples.auto.wire;

/**
 * This class is Developed for AutoWireSample
 * Develop By @author sesharajusv
 * In May 25, 2018
 */
public class CustomerInfo {
	
	/**
	 * @return the address
	 */
	public Address getAddress1() {
		return address1;
	}
	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress1(Address address) {
		this.address1 = address;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	private Address address1;
	
	private long phoneNumber;
	private long customerId;
	

}
