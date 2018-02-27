package com.loan.account.create;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

	Customer findByCustomerId(Long customerId);

	
}
