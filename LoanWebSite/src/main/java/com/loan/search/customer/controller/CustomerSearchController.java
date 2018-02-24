package com.loan.search.customer.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


import com.loan.create.account.controller.CreateAccountQuery;

@Controller
public class CustomerSearchController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerSearchController.class);

	RestTemplate searchClient = new RestTemplate();	

	@RequestMapping(value = "/searchCustomer", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute("search") SearchQuery search, Model model) {
		SearchQuery query = searchClient.postForObject("http://localhost:8090/search/get", search, SearchQuery.class);
		model.addAttribute("name", query);
		return "searchCustomerResult";
	}
	
	@RequestMapping(value = "/searchCust", method = RequestMethod.GET)
	public String createCust(@ModelAttribute("search") SearchQuery search, BindingResult result) {
		System.out.println("Searching Customer For Starting");
		return "search";
	}//


}