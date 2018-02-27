package com.loan.product.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Enabling Cross Origin Requests for a RESTful Web Service
@CrossOrigin
@RestController
@RequestMapping("/productcreate")
public class ProductCreateRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductCreateRestController.class);
	
	  private CreateProductComponent createProductComponent;
	 
	  @Autowired public ProductCreateRestController(CreateProductComponent createProductComponent){
	  this.createProductComponent = createProductComponent; }
	 

	@RequestMapping(value = "/productcreatepath", method = RequestMethod.POST)
	public ProductCreate search(@RequestBody CreateProductQuery query) {
		logger.info("Enter  in to ProductCreate Service");
		return createProductComponent.productCreate(query);
	}

}
