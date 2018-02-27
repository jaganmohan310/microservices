package com.loan.account.create;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "PRODUCT")
@Entity
public class Product implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2922300372866508555L;

	@Id
	@Column(name = "PRODUCT_ID")
	private Long product_ID;

	@Column(name = "PRODUCT_TYPE", nullable = false, insertable = true, updatable = true, length = 125)
	private String productType;

	@Column(name = "INTEREST_RATE", nullable = false, insertable = true, updatable = true)
	private Long interestRate;

	@Column(name = "PRODUCT_STATUS", insertable = true, updatable = true)
	private String productStatus;

	@Column(name = "MIN_LOAN_TENURE", nullable = false, insertable = true, updatable = true)
	private Long minLoanTenure;

	@Column(name = "MAX_LOAN_TENURE", nullable = false, insertable = true, updatable = true)
	private Long maxLoanTenure;

	@Column(name = "MIN_LOAN_AMOUNT", nullable = false, insertable = true, updatable = true)
	private Long minLoanAmount;

	@Column(name = "MAX_LOAN_AMOUNT", nullable = false, insertable = true, updatable = true)
	private Long maxLoanAmount;

	public Long getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(Long product_ID) {
		this.product_ID = product_ID;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Long interestRate) {
		this.interestRate = interestRate;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public Long getMinLoanTenure() {
		return minLoanTenure;
	}

	public void setMinLoanTenure(Long minLoanTenure) {
		this.minLoanTenure = minLoanTenure;
	}

	public Long getMaxLoanTenure() {
		return maxLoanTenure;
	}

	public void setMaxLoanTenure(Long maxLoanTenure) {
		this.maxLoanTenure = maxLoanTenure;
	}

	public Long getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(Long minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public Long getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(Long maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

}
