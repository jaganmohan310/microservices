package com.loan.customer.search;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchComponent {

	private CustomerRepository customerRepository;

	private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);

	@Autowired
	public SearchComponent(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Transactional
	public CustomerSearch search(SearchQuery query) {
		CustomerSearch customerSearchList = customerRepository
				.findByLastNameOrSocialSecuirtyId(query.getLastName(), query.getSocialSecuirtyId());
		return customerSearchList;
	}

	@Transactional
	public void createCustomerSearch(String key, CustomerCreate customerCreate) {
		CustomerSearch customerSearch=null;
		 customerSearch= customerRepository.findOne(Long.valueOf(key));
		if(customerSearch!=null) {
			customerRepository.save(convertJsonToObject(customerCreate,customerSearch));
		} else {
			customerSearch = new CustomerSearch();
			customerSearch.setCustomerID(customerCreate.getCustomerID());
			customerRepository.save(convertJsonToObject(customerCreate, customerSearch));
		}
	}

	private CustomerSearch convertJsonToObject(CustomerCreate customerCreate,CustomerSearch customerSearch) {
		customerSearch.setCommunicationAdreess(customerCreate.getCommunicationAdreess());
		customerSearch.setContactNumber(customerCreate.getContactNumber());
		customerSearch.setCreditScore(customerCreate.getCreditScore());
		customerSearch.setDateofBirth(customerCreate.getDateofBirth());
		customerSearch.setEmailId(customerCreate.getEmailId());
		customerSearch.setFirstName(customerCreate.getFirstName());
		customerSearch.setGender(customerCreate.getGender());
		customerSearch.setKycStatus(customerCreate.getKycStatus());
		customerSearch.setLastName(customerCreate.getLastName());
		customerSearch.setResidentialAdreess(customerCreate.getResidentialAdreess());
		customerSearch.setSocialSecuirtyId(customerCreate.getSocialSecuirtyId());
		return customerSearch;
		
		
	}

	
}
