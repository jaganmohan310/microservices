package com.brownfield.pss.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class CustomerController {
	private Map<Long, CreateCustomerQuery> customerMap = new HashMap<>();
	RestTemplate custmerCreate = new RestTemplate();
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	public String submit(@ModelAttribute("customer") CreateCustomerQuery customer, BindingResult result,
			ModelMap model) {
		
		
		System.out.println("Creating FOrm the Ebnter");
		CreateCustomerQuery query= custmerCreate.postForObject("http://localhost:8090/customercreate/customercreatepath/", customer, CreateCustomerQuery.class);
      
        model.addAttribute("name", query);		
		return "Customer";
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String createForm(@ModelAttribute("customer") CreateCustomerQuery customer, BindingResult result) {
				return "demo";
	}

}
