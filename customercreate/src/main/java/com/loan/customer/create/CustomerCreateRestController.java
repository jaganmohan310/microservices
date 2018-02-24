package com.loan.customer.create;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Enabling Cross Origin Requests for a RESTful Web Service
@CrossOrigin
@RestController
@RequestMapping("/customercreate")
public class CustomerCreateRestController {
	
	  private CreateCustomerComponent createCustomerComponent;
	 
	  @Autowired public CustomerCreateRestController(CreateCustomerComponent createCustomerComponent){
	  this.createCustomerComponent = createCustomerComponent; }
	 

	@RequestMapping(value = "/customercreatepath", method = RequestMethod.POST)
	public CreateCustomerQuery search(@RequestBody CreateCustomerQuery query) {
		System.out.println("Input Welcome");
		System.out.println("Query:" + query);
		return query;
	//	return createCustomerComponent.customerCreate(query);
	}

}
