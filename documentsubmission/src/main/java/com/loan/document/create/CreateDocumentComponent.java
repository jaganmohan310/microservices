package com.loan.document.create;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateDocumentComponent {

	private KafkaTemplate<String, String> kafkaTemplate;

	private CreateDocumentRepository documentRepository;
	
	@Value("${kafka.topic.customer.info}")
    private String customerInfoTopic;
	
	private static final Logger logger = LoggerFactory.getLogger(CreateDocumentComponent.class);

	@Autowired
	public CreateDocumentComponent(CreateDocumentRepository documentRepository,
			KafkaTemplate<String, String> kafkaTemplate) {
		this.documentRepository = documentRepository;
		this.kafkaTemplate = kafkaTemplate;
	}

	@Transactional
	public DocumentCreate documentCreate(CreateDocumentQuery query) {
		DocumentCreate documentCreate = documentRepository.save(convertdocumentCreateEntity(query));
		List<String> documentTypeList = getDocumentTypeList();
		List<DocumentCreate> documentCreateList = documentRepository.findByDocumentTypeInAndCustomerId(documentTypeList,query.getCustomerId());
		if(documentCreateList.size() ==4) {
		kafkaTemplate.send(customerInfoTopic, documentCreate.getDocumentId().toString(), "VERIFIED");
		}else {
			kafkaTemplate.send(customerInfoTopic, documentCreate.getDocumentId().toString(), "PARTIALLY_VERIFIED");
		}
		return documentCreate;
	}

	private List<String> getDocumentTypeList() {
		List<String> documentTypeList = new ArrayList<>();
		documentTypeList.add("RESIDENTIALDOC");
		documentTypeList.add("BANKSTATEMENT");
		documentTypeList.add("SOCILASECURITYID");
		documentTypeList.add("PASSPORT");
		return documentTypeList;
	}

	private DocumentCreate convertdocumentCreateEntity(CreateDocumentQuery query) {
		DocumentCreate documentCreate = new DocumentCreate();
		documentCreate.setDocumentId(query.getDocumentId());
		documentCreate.setCustomerId(query.getCustomerId());
		documentCreate.setDocumentName(query.getDocumentName());
		documentCreate.setDocumentStatus(query.getDocumentStatus());
		documentCreate.setDocumentType(query.getDocumentType());
		documentCreate.setDocumentValidFrom(query.getDocumentValidFrom());
		documentCreate.setDocumentValidTo(query.getDocumentValidTo());

		return documentCreate;
	}

}
