package com.loan.customer.search;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<CustomerSearch, Long> {

	List<CustomerSearch> findByLastNameOrSocialSecuirtyId(String lastName, String socialSecuirtyId);
	
	CustomerSearch findBySocialSecuirtyId(String socialSecuirtyId);
}
