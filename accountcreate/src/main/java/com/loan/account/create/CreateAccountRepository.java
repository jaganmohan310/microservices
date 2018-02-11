package com.loan.account.create;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateAccountRepository  extends JpaRepository<AccountCreate, Long> {

	
}
