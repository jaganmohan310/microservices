package com.loan.create.account.controller;

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
public class AccountCreateController {
	//private Map<Long, CreateDocumentQuery> customerMap = new HashMap<>();
	RestTemplate createAccount = new RestTemplate();

	@RequestMapping(value = "/accountCreate", method = RequestMethod.POST)
	public String createCustomer(@ModelAttribute("account") CreateAccountQuery account, BindingResult result,
			ModelMap model) {

		System.out.println("Welcome to SearchController");
		CreateAccountQuery query = createAccount.postForObject(
				"http://localhost:8090/accountcreate/accountcreatepath/", account, CreateAccountQuery.class);
		model.addAttribute("name", query);
		return "accountCreateResult";
	}//

	@RequestMapping(value = "/accCreate", method = RequestMethod.GET)
	public String createCust(@ModelAttribute("account") CreateAccountQuery account, BindingResult result) {
		System.out.println("Searching Customer For Starting");
		return "accountcreate";
	}//

}
