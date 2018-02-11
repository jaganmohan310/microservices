package com.loan.customer.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateCustomerComponent {

	private KafkaTemplate<String, String> kafkaTemplate;
	private CreateCustomerRepository customerRepository;
	private static final Logger logger = LoggerFactory.getLogger(CreateCustomerComponent.class);

	@Autowired
	public CreateCustomerComponent(CreateCustomerRepository customerRepository,KafkaTemplate<String, String> kafkaTemplate) {
		this.customerRepository = customerRepository;
		this.kafkaTemplate =kafkaTemplate;
	}

	public CustomerCreate customerCreate(CreateCustomerQuery query) {
		CustomerCreate customerCreate =customerRepository.save(convertCustomerCreateEntity(query));
		kafkaTemplate.send("test",customerCreate.getCustomerID().toString(), "jagan");
		 return customerCreate;
	}

	private CustomerCreate convertCustomerCreateEntity(CreateCustomerQuery query) {
		CustomerCreate customerCreate = new CustomerCreate();
		customerCreate.setLastName(query.getLastName());
		customerCreate.setFirstName(query.getFirstName());
		customerCreate.setDateofBirth(query.getDateofBirth());
		customerCreate.setGender(query.getGender());
		customerCreate.setContactNumber(query.getContactNumber());
		customerCreate.setEmailId(query.getEmailId());
		customerCreate.setSocialSecuirtyId(query.getSocialSecuirtyId());
		customerCreate.setResidentialAdreess(query.getResidentialAdreess());
		customerCreate.setCommunicationAdreess(query.getCommunicationAdreess());
		customerCreate.setKycStatus("Inprogress");
		customerCreate.setCreditScore(0L);
		return customerCreate;
	}

}
