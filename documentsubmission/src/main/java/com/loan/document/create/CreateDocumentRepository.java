package com.loan.document.create;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateDocumentRepository extends JpaRepository<DocumentCreate, Long> {

	List<DocumentCreate> findByDocumentTypeInAndCustomerId(List<String> documentType,Long customerId);
}
