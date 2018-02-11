package com.loan.customer.search;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	/*SearchComponent searchComponent;
	
	@Autowired
	public Receiver(SearchComponent searchComponent){
		this.searchComponent = searchComponent;
	}*/
	
    @KafkaListener(topics = "${kafka.topic.boot}")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
      LOGGER.info("received payload='{}'", consumerRecord.value());
      
    }
}