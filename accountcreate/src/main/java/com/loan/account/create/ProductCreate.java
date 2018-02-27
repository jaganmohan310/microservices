package com.loan.account.create;


import java.io.Serializable;

public class ProductCreate implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2922300372866508555L;

	
	private Long product_ID;

	private String productType;

	private Long interestRate;
	
	private String productName;
	
	private String productStatus;

	private Long minLoanTenure;

	private Long maxLoanTenure;

	private Long minLoanAmount;

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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
