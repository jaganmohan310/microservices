package com.loan.account.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountComponent {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	private CreateAccountRepository accountRepository;
	private static final Logger logger = LoggerFactory.getLogger(CreateAccountComponent.class);

	@Autowired
	public CreateAccountComponent(CreateAccountRepository accountRepository,
			KafkaTemplate<String, String> kafkaTemplate) {
		this.accountRepository = accountRepository;
		this.kafkaTemplate = kafkaTemplate;
	}

	public AccountCreate accountCreate(CreateAccountQuery query) {
		AccountCreate accountCreate = accountRepository.save(convertAccountCreateEntity(query));
		kafkaTemplate.send("test", accountCreate.getAccountNumber().toString(), "camunda_jagan_ravi");
		return accountCreate;
	}

	private AccountCreate convertAccountCreateEntity(CreateAccountQuery query) {
		AccountCreate accountCreate = new AccountCreate();
		accountCreate.setAccountName(query.getAccountName());
		accountCreate.setApprovedLoanAmount(query.getApprovedLoanAmount());
		accountCreate.setArrears(query.getArrears());
		
		accountCreate.setCharges(query.getCharges());
		accountCreate.setDisbursedLoanAmount(query.getDisbursedLoanAmount());
		accountCreate.setFirst_Next_InstallmentAmount(query.getFirst_Next_InstallmentAmount());
		accountCreate.setFirstNextInstallmentDate(query.getFirstNextInstallmentDate());
		accountCreate.setInterestRate(query.getInterestRate());
		accountCreate.setLoanTenure(query.getLoanTenure());
		return accountCreate;
	}

}
