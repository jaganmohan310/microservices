package com.loan.document.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Enabling Cross Origin Requests for a RESTful Web Service
@CrossOrigin
@RestController
@RequestMapping("/documentcreate")
public class DocumentCreateRestController {
	
	  private CreateDocumentComponent createDocumentComponent;
	 
	  @Autowired
	  public DocumentCreateRestController(CreateDocumentComponent createDocumentComponent){
	  this.createDocumentComponent = createDocumentComponent; }
	 

	@RequestMapping(value = "/documentcreatepath", method = RequestMethod.POST)
	public DocumentCreate search(@RequestBody CreateDocumentQuery query) {
		return createDocumentComponent.documentCreate(query);
	}

}
