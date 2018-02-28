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

	RestTemplate documentCreate = new RestTemplate();

	@RequestMapping(value = "/document", method = RequestMethod.GET)
	public String documentHome(@ModelAttribute("documents") CreateDocumentQuery document, ModelMap map) {
		System.out.println("Welcome to documents Page Controller****************");
		Map<String, String> documentType = new HashMap<String, String>();
		documentType.put("RESIDENTIALDOC", "RESIDENTIALDOC");
		documentType.put("BANKSTATEMENT", "BANKSTATEMENT");
		documentType.put("SOCILASECURITYID", "SOCILASECURITYID");
		documentType.put("PASSPORT", "PASSPORT");
		//Map<String, String> documentStatus = new HashMap<String, String>();
		//documentStatus.put("documentStatus", "VERIFIEDorSUBMITTED");
		//documentStatus.put("SUBMITTED", "SUBMITTED");
		//String VERIFIEDorSUBMITTED = "VERIFIEDorSUBMITTED";
		//map.addAttribute("documentStatus", VERIFIEDorSUBMITTED);
		map.addAttribute("documentType", documentType);
		// return countryList;
		return "documentCreateHome";
	}

	@RequestMapping(value = "/addDocument", method = RequestMethod.POST)
	public String entireDoc(@ModelAttribute("documents") CreateDocumentQuery documents, BindingResult result,
			ModelMap model) {
		String status = documents.getDocumentStatus();
		System.out.println("Status:" + status);
		String documentType = documents.getDocumentType();
		System.out.println("documentType:" + documentType);
		CreateDocumentQuery query = documentCreate.postForObject(
				"http://localhost:8093/documentcreate/documentcreatepath/", documents, CreateDocumentQuery.class);
		model.addAttribute("name", query);
		return "documentCreateResult";
	}

	@RequestMapping(value = "/addDoc", method = RequestMethod.GET)
	public String createDoc(@ModelAttribute("documents") CreateDocumentQuery document, BindingResult result) {
		System.out.println("DOcument Creating Starting");
		return "document";
	}//
}
