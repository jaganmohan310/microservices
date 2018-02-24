package com.loan.product.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


import com.loan.create.account.controller.CreateAccountQuery;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	RestTemplate productClient = new RestTemplate();	

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute("product") CreateProductQuery product, Model model) {
		CreateProductQuery query = productClient.postForObject("http://localhost:8090/productcreate/productcreatepath", product, CreateProductQuery.class);
		model.addAttribute("name", query);
		return "productCreateResult";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String createCust(@ModelAttribute("product") CreateProductQuery product, BindingResult result) {
		System.out.println("Product Controller For Starting");
		return "product";
	}//


}