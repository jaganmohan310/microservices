package com.loan.product.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CreateProductComponent {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	private CreateProductRepository productRepository;
	
	@Value("${kafka.topic.product.info}")
    private String productInfoTopic;
	
	private static final Logger logger = LoggerFactory.getLogger(CreateProductComponent.class);
	
	@Autowired
	public CreateProductComponent(CreateProductRepository productRepository,
			KafkaTemplate<String, String> kafkaTemplate) {
		this.productRepository = productRepository;
		this.kafkaTemplate = kafkaTemplate;
	}

	public ProductCreate productCreate(CreateProductQuery query) {
		ProductCreate productCreate = productRepository.save(convertProductCreateEntity(query));
		 sendProductCreate(productCreate);
		return productCreate;
	}

	private void sendProductCreate(ProductCreate productCreate) {
		ObjectMapper mapperObj = new ObjectMapper();
		 String jsonStr=null;
		 try {
			  jsonStr = mapperObj.writeValueAsString(productCreate);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	   kafkaTemplate.send(productInfoTopic, productCreate.getProduct_ID().toString(), jsonStr);
	}

	private ProductCreate convertProductCreateEntity(CreateProductQuery query) {
		ProductCreate productCreate = new ProductCreate();
		productCreate.setProductType(query.getProductType());
		productCreate.setProductName(query.getProductName());
		productCreate.setProductStatus(query.getProductStatus());
		productCreate.setInterestRate(query.getInterestRate());
		productCreate.setMaxLoanAmount(query.getMaxLoanAmount());
		productCreate.setMinLoanAmount(query.getMinLoanAmount());
		productCreate.setMaxLoanTenure(query.getMaxLoanTenure());
		productCreate.setMinLoanTenure(query.getMinLoanTenure());
		return productCreate;
	}

}
