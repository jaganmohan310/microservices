package com.loan.customer.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loan.customer.search.componet.SearchComponent;
import com.loan.customer.search.componet.SearchQuery;
import com.loan.customer.search.entity.Customer;



//Enabling Cross Origin Requests for a RESTful Web Service
@CrossOrigin
@RestController
@RequestMapping("/search")
class SearchRestController {
	
	private SearchComponent searchComponent;
	
	@Autowired
	public SearchRestController(SearchComponent searchComponent){
		this.searchComponent = searchComponent;
	}
	
	@RequestMapping(value="/get", method = RequestMethod.POST)
	List<Customer> search(@RequestBody SearchQuery query){
		System.out.println("Input : "+ query);
		return searchComponent.search(query);
	}
 
}
