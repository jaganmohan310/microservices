package com.loan.account.create;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {

	Product findByProductType(String productType);

	
}
