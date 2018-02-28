package com.loan.create.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class AccountCreateController {
	RestTemplate createAccount = new RestTemplate();

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String accountHome(@ModelAttribute("account") CreateAccountQuery account) {
		return "accountCreateHome";
	}
	
	@RequestMapping(value = "/accountCreate", method = RequestMethod.POST)
	public String createAccount(@ModelAttribute("account") CreateAccountQuery account, BindingResult result,
			ModelMap model) {
		System.out.println("************" + account.getFirstNextInstallmentDate());
		AccountCreate query = createAccount.postForObject("http://localhost:8094/accountcreate/accountcreatepath/",
				account, AccountCreate.class);
		model.addAttribute("name", query);
		return "accountCreateResult";
	}
}
