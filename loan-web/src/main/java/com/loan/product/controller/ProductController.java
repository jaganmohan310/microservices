package com.loan.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	RestTemplate productClient = new RestTemplate();	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greetingHomePage(@ModelAttribute("product") CreateProductQuery product) {
		return "index";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String productHome(@ModelAttribute("product") CreateProductQuery product) {
		return "productCreateHome";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute("product") CreateProductQuery product, Model model) {
		CreateProductQuery query = productClient.postForObject("http://localhost:8090/productcreate/productcreatepath", product, CreateProductQuery.class);
		model.addAttribute("name", query);
		return "productCreateResult";
	}
}