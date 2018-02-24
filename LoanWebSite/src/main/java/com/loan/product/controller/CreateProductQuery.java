package com.loan.product.controller;

import java.io.Serializable;

public class CreateProductQuery implements Serializable {

	private String productType;

	private String productName;

	private Long interestRate;

	private String productStatus;

	private Long minLoanTenure;

	private Long maxLoanTenure;

	private Long minLoanAmount;

	private Long maxLoanAmount;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
