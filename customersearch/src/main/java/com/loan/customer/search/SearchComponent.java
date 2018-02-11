package com.loan.customer.search;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchComponent {
	
	private CustomerRepository customerRepository;
	private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);
	
	@Autowired
	public SearchComponent(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	public List<CustomerSearch> search(SearchQuery query){
		List<CustomerSearch>  customerSearchList=customerRepository.findByLastNameOrSocialSecuirtyId(query.getLastName(), query.getSocialSecuirtyId());
		return customerSearchList; 
	}

}
