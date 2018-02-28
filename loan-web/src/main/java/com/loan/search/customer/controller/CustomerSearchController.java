package com.loan.search.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class CustomerSearchController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerSearchController.class);

	RestTemplate searchClient = new RestTemplate();	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String createCust(@ModelAttribute("search") SearchQuery search) {
		return "customerSearchHome";
	}
	
	@RequestMapping(value = "/searchCustomer", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute("search") SearchQuery search, Model model) {
		CustomerSearch query = searchClient.postForObject("http://localhost:8092/search/get", search, CustomerSearch.class);
		model.addAttribute("name", query);
		System.out.println("In search method");
		return "customerSearchResult";
	}
	


}