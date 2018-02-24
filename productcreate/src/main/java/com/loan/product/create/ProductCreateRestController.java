package com.loan.product.create;

import java.util.ArrayList;
import java.util.List;

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
	
	  private CreateProductComponent createProductComponent;
	 
	  @Autowired public ProductCreateRestController(CreateProductComponent createProductComponent){
	  this.createProductComponent = createProductComponent; }
	 

	@RequestMapping(value = "/productcreatepath", method = RequestMethod.POST)
	public ProductCreate search(@RequestBody CreateProductQuery query) {
		//ProductCreate
		System.out.println("Input Welcome");
		System.out.println("Query:" + query);
		//return query;
		return createProductComponent.productCreate(query);
	}

}
