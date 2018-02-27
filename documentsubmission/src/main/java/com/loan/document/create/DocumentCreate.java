package com.loan.document.create;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "CUSTOMER_DOCUMENTS")
@Entity
public class DocumentCreate implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3992373269953124295L;

	@Id
	@Column(name = "DOCUMENT_ID")
	private Long documentId;
	
	@Column(name="CUSTOMER_ID")
	private Long customerId;

	@Column(name = "DOCUMENT_NAME", nullable = false, insertable = true, updatable = true, length = 125)
	private String documentName;

	@Column(name = "DOCUMENT_TYPE ", nullable = false, insertable = true, updatable = true, length = 125)
	private String documentType;

	@Column(name = "DOCUMENT_VALID_FROM", nullable = false, insertable = true, updatable = true)
	private String documentValidFrom;

	@Column(name = "DOCUMENT_VALID_TO", insertable = true, updatable = true)
	private String documentValidTo;

	@Column(name = "DOCUMENT_STATUS", insertable = true, updatable = true)
	private String documentStatus;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

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
