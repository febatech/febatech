package com.feba.spring.examples.auto.wire;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountDetails {
	
	public BankAccountDetails(AccountType accountType, CustomerInfo customer){
		this.setAccountType(accountType);
		this.setCustomerInfo(customer);
	}
	
	private Properties props;
	
	public void setProps(Properties props){
		this.props = props;
	}
	
	public Properties getProps(){
		return this.props;
	}
	
	@Autowired
	private AccountType accountType;
	
	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @return the customerInfo
	 */
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	/**
	 * @param accountType the accountType to set
	 */
	private void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @param customerInfo the customerInfo to set
	 */
	private void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	private CustomerInfo customerInfo;

}
