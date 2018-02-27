package com.loan.customer.create;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CreateCustomerComponent {

	@Value("${kafka.topic.customer.info}")
    private String customerInfoTopic;
	
	private KafkaTemplate<String, String> kafkaTemplate;
	private CreateCustomerRepository customerRepository;
	private static final Logger logger = LoggerFactory.getLogger(CreateCustomerComponent.class);

	@Autowired
	public CreateCustomerComponent(CreateCustomerRepository customerRepository,KafkaTemplate<String, String> kafkaTemplate) {
		this.customerRepository = customerRepository;
		this.kafkaTemplate =kafkaTemplate;
	}

	@Transactional
	public CustomerCreate customerCreate(CreateCustomerQuery query) {
		CustomerCreate customerCreate=null;
		CustomerCreate customer=	customerRepository.findBySocialSecuirtyId(query.getSocialSecuirtyId());
	     if(customer!=null) {
	    	 convertCustomerCreateEntity(query, customer);
	    	 customerCreate = customerRepository.save(customer);
	     }else {
	     customerCreate =new CustomerCreate();
	     customerCreate.setKycStatus("Inprogress");
		 customerCreate.setCreditScore(0L);
		 customerCreate =customerRepository.save(convertCustomerCreateEntity(query,customerCreate));
	     } 
		sendCustomer(customerCreate);
		 return customerCreate;
	}
	
	
	@Transactional
	public void customerUpdate(String customerId,String kycStatus) {
		CustomerCreate customer=	customerRepository.findByCustomerID(Long.valueOf(customerId));
		logger.info(customer.getKycStatus());
		customer.setKycStatus(kycStatus);
		logger.info(customer.getKycStatus());
		customerRepository.save(customer);
		logger.info(customer.getKycStatus());
	
	}

	private void sendCustomer(CustomerCreate customerCreate) {
		ObjectMapper mapperObj = new ObjectMapper();
		 String jsonStr=null;
		 try {
			  jsonStr = mapperObj.writeValueAsString(customerCreate);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		 kafkaTemplate.send(customerInfoTopic,customerCreate.getCustomerID().toString(), jsonStr);
	}

	private CustomerCreate convertCustomerCreateEntity(CreateCustomerQuery query, CustomerCreate customerCreate) {
		customerCreate.setLastName(query.getLastName());
		customerCreate.setFirstName(query.getFirstName());
		customerCreate.setDateofBirth(query.getDateofBirth());
		customerCreate.setGender(query.getGender());
		customerCreate.setContactNumber(query.getContactNumber());
		customerCreate.setEmailId(query.getEmailId());
		customerCreate.setSocialSecuirtyId(query.getSocialSecuirtyId());
		customerCreate.setResidentialAdreess(query.getResidentialAdreess());
		customerCreate.setCommunicationAdreess(query.getCommunicationAdreess());
		return customerCreate;
	}

}
