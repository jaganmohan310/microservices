package com.loan.create.customer.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class CustomerController {
	
	
	RestTemplate custmerCreate = new RestTemplate();
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customerHomePage(@ModelAttribute("customer") CreateCustomerQuery customer) {
		return "customerCreateHome";
	}
	
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	public String submit(@ModelAttribute("customer") CreateCustomerQuery customer, BindingResult result,
			ModelMap model) {
		CreateCustomerQuery query = custmerCreate.postForObject(
				"http://localhost:8091/customercreate/customercreatepath/", customer, CreateCustomerQuery.class);
		model.addAttribute("name", query);
		return "customerCreateResult";
	}
}
