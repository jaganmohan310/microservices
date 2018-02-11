package com.loan.account.create;

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
@RequestMapping("/accountcreate")
public class AccountCreateRestController {
	
	  private CreateAccountComponent createAccountComponent;
	 
	  @Autowired public AccountCreateRestController(CreateAccountComponent createAccountComponent){
	  this.createAccountComponent = createAccountComponent; }
	 

	@RequestMapping(value = "/accountcreatepath", method = RequestMethod.POST)
	public AccountCreate search(@RequestBody CreateAccountQuery query) {
		System.out.println("Input Welcome");
		System.out.println("Query:" + query);
		return createAccountComponent.accountCreate(query);
	}

}
