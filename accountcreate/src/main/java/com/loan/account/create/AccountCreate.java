package com.loan.account.create;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "ACCOUNT_CREATE")
@Entity
public class AccountCreate implements Serializable {

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4449755910624119662L;

	@Id
	@SequenceGenerator(name = "ACCOUNT_NUMBER", sequenceName = "ACCOUNT_CREATE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="ACCOUNT_NUMBER")
	private Long accountNumber;

	@Column(name = "ACCOUNT_NAME", nullable = false, insertable = true, updatable = true, length = 125)
	private String accountName;
	
	@Column(name = "PRODUCT_TYPE", nullable = false, insertable = true, updatable = true, length = 125)
	private String productType;
	
	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "APPROVED_LOAN_AMOUNT ", nullable = false, insertable = true, updatable = true, length = 125)
	private Long approvedLoanAmount;

	@Column(name = "INTEREST_RATE", nullable = false, insertable = true, updatable = true)
	private Long interestRate;

	@Column(name = "LOAN_TENURE", insertable = true, updatable = true)
	private Long loanTenure;

	@Column(name = "DISBURSED_LOAN_AMOUNT", nullable = false, insertable = true, updatable = true)
	private Long disbursedLoanAmount;

	@Column(name = "FIRST_NEXT_INSTALLMENT_AMOUNT", nullable = false, insertable = true, updatable = true)
	private Long first_Next_InstallmentAmount;

	@Column(name = "FIRST_NEXT_INSTALLMENT_DATE", nullable = false, insertable = true, updatable = true)
	private Long firstNextInstallmentDate;

	@Column(name = "ARREARS", nullable = false, insertable = true, updatable = true)
	private Long arrears;

	@Column(name = "CHARGES", nullable = false, insertable = true, updatable = true)
	private Long charges;

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
