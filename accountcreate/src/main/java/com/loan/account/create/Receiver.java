package com.loan.account.create;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class Receiver {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	 CreateAccountComponent createAccountComponent;
	
	@Autowired
	public Receiver(CreateAccountComponent createAccountComponent){
		this.createAccountComponent = createAccountComponent;
	}
	
    @KafkaListener(topics = "${kafka.topic.boot.product}")
    public void receiveProduct(@Payload(required = false) String value, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
    	LOGGER.info("received message Key='{}'", key);
    	LOGGER.info("received payload='{}'", value);
    	ObjectMapper mapperObj = new ObjectMapper();
    	ProductCreate productCreate =null;
		try {
			productCreate = mapperObj.readValue(value, ProductCreate.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		createAccountComponent.productCreate(productCreate);
    }
    
    @KafkaListener(topics = "${kafka.topic.boot}")
    public void receiveCustomer(@Payload(required = false) String value, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
    	LOGGER.info("received message Key='{}'", key);
    	LOGGER.info("received payload='{}'", value);
    	ObjectMapper mapperObj = new ObjectMapper();
    	CustomerCreate customerCreate =null;
		try {
			customerCreate = mapperObj.readValue(value, CustomerCreate.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
     createAccountComponent.customerCreate(customerCreate);
    }

	}