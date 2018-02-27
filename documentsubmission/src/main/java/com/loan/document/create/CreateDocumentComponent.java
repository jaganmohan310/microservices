package com.loan.document.create;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CreateDocumentComponent {

	private KafkaTemplate<String, String> kafkaTemplate;

	private CreateDocumentRepository documentRepository;
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
		kafkaTemplate.send("test", documentCreate.getDocumentId().toString(), "camunda_jagan_ravi");
		return documentCreate;
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
