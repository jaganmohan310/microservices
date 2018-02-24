package com.loan.document.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class DocumentController {
	//private Map<Long, CreateDocumentQuery> customerMap = new HashMap<>();
	RestTemplate documentCreate = new RestTemplate();

	@RequestMapping(value = "/addDocument", method = RequestMethod.POST)
	public String entireDoc(@ModelAttribute("documents") CreateDocumentQuery documents, BindingResult result,
			ModelMap model) {

		System.out.println("Welcome to DocumetController");
		CreateDocumentQuery query = documentCreate.postForObject(
				"http://localhost:8090/documentcreate/documentcreatepath/", documents, CreateDocumentQuery.class);
		model.addAttribute("name", query);
		return "documentResult";
	}//

	@RequestMapping(value = "/addDoc", method = RequestMethod.GET)
	public String createDoc(@ModelAttribute("documents") CreateDocumentQuery document, BindingResult result) {
		System.out.println("DOcument Creating Starting");
		return "document";
	}//

}
