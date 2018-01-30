package com.loan.customer.search.repository;

import com.loan.customer.search.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

}
