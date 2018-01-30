package com.loan.customer.search.componet;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.customer.search.entity.Customer;
import com.loan.customer.search.repository.CustomerRepository;

@Component
public class SearchComponent {
	
	private CustomerRepository customerRepository;
	private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);
	
	
	@Autowired
	public SearchComponent(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	public List<Customer> search(SearchQuery query){
				return null; 
	}

}
