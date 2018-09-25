package com.example.restapi.controller;

import javax.validation.Valid;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.ApplicationRequestModel;
import com.example.restapi.model.CustomerRegistrationResponse;


@RestController
@Configuration
public class RestApiController {
	
	@RequestMapping(value="/customer", method= RequestMethod.POST)
	public CustomerRegistrationResponse registerCustomer(@Valid @RequestBody ApplicationRequestModel customer) {
		CustomerRegistrationResponse response = new CustomerRegistrationResponse();
		long id = (long) Math.random();
		response.setCustId(customer.getCusId());
		response.setCustomerName(customer.getCustomerName());
		response.setEmail(customer.getContactDetails().getEmail());
		response.setPhone(customer.getContactDetails().getPhone());
		response.setRedistrationId(String.valueOf(id));
		System.out.println(customer.getCusId());
		if (response.getRedistrationId() != null) {
			response.setRgistrationStatus("Success");
		} else {
			response.setRgistrationStatus("Fail");
		}
		System.out.println(response);
		return response;
		
	}

}
