package com.loan.customer.search;

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
@RequestMapping("/search")
public class SearchRestController {
	
	  private SearchComponent searchComponent;
	 
	  @Autowired public SearchRestController(SearchComponent searchComponent){
	  this.searchComponent = searchComponent; }
	 

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public List<CustomerSearch> search(@RequestBody SearchQuery query) {
		List<CustomerSearch> customerSearch= searchComponent.search(query);
		return customerSearch;
		
	}

}
