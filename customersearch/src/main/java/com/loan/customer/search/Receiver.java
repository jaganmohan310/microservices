package com.loan.customer.search;

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

	SearchComponent searchComponent;
	
	@Autowired
	public Receiver(SearchComponent searchComponent){
		this.searchComponent = searchComponent;
	}
	
    @KafkaListener(topics = "${kafka.topic.boot}")
    public void receive(@Payload(required = false) String value, @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
    	LOGGER.info("received message Key='{}'", key);
    	LOGGER.info("received payload='{}'", value);
    	ObjectMapper mapperObj = new ObjectMapper();
    	CustomerCreate customerCreate =null;
		try {
			customerCreate = mapperObj.readValue(value, CustomerCreate.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	searchComponent.createCustomerSearch(key , customerCreate);
    }

	}