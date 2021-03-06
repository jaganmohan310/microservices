package com.loan.customer.create;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateCustomerRepository  extends JpaRepository<CustomerCreate, Long> {

	CustomerCreate findBySocialSecuirtyId( String socialSecuirtyId);

	CustomerCreate findByCustomerID(Long customerId);
}
