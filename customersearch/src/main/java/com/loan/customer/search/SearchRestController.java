package com.loan.customer.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Enabling Cross Origin Requests for a RESTful Web Service
@CrossOrigin
@RestController
@RequestMapping("/search")
class SearchRestController {

	/*
	 * private SearchComponent searchComponent;
	 * 
	 * @Autowired public SearchRestController(SearchComponent searchComponent){
	 * this.searchComponent = searchComponent; }
	 */

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public List<CustomerSearch> search(@RequestBody SearchQuery query) {
		System.out.println("Input Welcome");
		System.out.println("Query:" + query);
		return new ArrayList<CustomerSearch>();
	}

}
