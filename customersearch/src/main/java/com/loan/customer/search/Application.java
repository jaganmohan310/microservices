package com.loan.customer.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	
	
	 
}
