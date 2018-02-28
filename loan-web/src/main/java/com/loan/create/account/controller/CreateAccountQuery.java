package com.loan.create.account.controller;

import java.io.Serializable;

public class CreateAccountQuery implements Serializable {

	private Long accountNumber;

	private String accountName;

	private Long approvedLoanAmount;

	private Long interestRate;

	private Long loanTenure;

	private Long disbursedLoanAmount;

	private Long first_Next_InstallmentAmount;

	private String firstNextInstallmentDate;

	private Long arrears;

	private Long charges;
	private Long customerId;

	private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getApprovedLoanAmount() {
		return approvedLoanAmount;
	}

	public void setApprovedLoanAmount(Long approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}

	public Long getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Long interestRate) {
		this.interestRate = interestRate;
	}

	public Long getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(Long loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Long getDisbursedLoanAmount() {
		return disbursedLoanAmount;
	}

	public void setDisbursedLoanAmount(Long disbursedLoanAmount) {
		this.disbursedLoanAmount = disbursedLoanAmount;
	}

	public Long getFirst_Next_InstallmentAmount() {
		return first_Next_InstallmentAmount;
	}

	public void setFirst_Next_InstallmentAmount(Long first_Next_InstallmentAmount) {
		this.first_Next_InstallmentAmount = first_Next_InstallmentAmount;
	}

	public String getFirstNextInstallmentDate() {
		return firstNextInstallmentDate;
	}

	public void setFirstNextInstallmentDate(String firstNextInstallmentDate) {
		this.firstNextInstallmentDate = firstNextInstallmentDate;
	}

	public Long getArrears() {
		return arrears;
	}

	public void setArrears(Long arrears) {
		this.arrears = arrears;
	}

	public Long getCharges() {
		return charges;
	}

	public void setCharges(Long charges) {
		this.charges = charges;
	}

}
