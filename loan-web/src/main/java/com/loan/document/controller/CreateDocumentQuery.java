package com.loan.document.controller;

import java.io.Serializable;

public class CreateDocumentQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long documentId;

	private String documentName;

	private String documentType;

	private String documentValidFrom;

	private String documentValidTo;

	private String documentStatus;

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentValidFrom() {
		return documentValidFrom;
	}

	public void setDocumentValidFrom(String documentValidFrom) {
		this.documentValidFrom = documentValidFrom;
	}

	public String getDocumentValidTo() {
		return documentValidTo;
	}

	public void setDocumentValidTo(String documentValidTo) {
		this.documentValidTo = documentValidTo;
	}

	public String getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

}
