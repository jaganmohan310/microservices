package com.loan.customer.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	CreateCustomerComponent createCustomerComponent;
	
	@Autowired
	public Receiver(CreateCustomerComponent createCustomerComponent){
		this.createCustomerComponent = createCustomerComponent;
	}
	
    @KafkaListener(topics = "${kafka.topic.customer.create.info}")
    public void receive(@Payload(required = false) String value, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
    	LOGGER.info("received message Key='{}'", key);
    	LOGGER.info("received payload='{}'", value);
		createCustomerComponent.customerUpdate(key,value);
    }

	}