package com.loan.product.create;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateProductRepository  extends JpaRepository<ProductCreate, Long> {

	
}
