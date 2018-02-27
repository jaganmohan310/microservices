package com.loan.account.create;

import java.io.Serializable;

public class CreateAccountQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8228095967717285638L;

	private String accountName;
	
	private String productType;
	
	private Long customerId;

	private Long approvedLoanAmount;

	private Long interestRate;

	private Long loanTenure;

	private Long disbursedLoanAmount;

	private Long first_Next_InstallmentAmount;

	private Long firstNextInstallmentDate;

	private Long arrears;

	private Long charges;

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

	public Long getFirstNextInstallmentDate() {
		return firstNextInstallmentDate;
	}

	public void setFirstNextInstallmentDate(Long firstNextInstallmentDate) {
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
	

}
