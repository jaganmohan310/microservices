package com.loan.customer.search;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<CustomerSearch, Long> {

}
