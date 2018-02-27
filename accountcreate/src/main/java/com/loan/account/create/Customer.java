package com.loan.account.create;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CUSTOMER")
@Entity
public class Customer implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2922300372866508555L;

	@Id
	@Column(name = "CUSTOMER_ID")
	private Long customerId;

	@Column(name = "SOCIAL_SECURITY_ID", nullable = false, insertable = true, updatable = true, length = 125)
	private String socialsecurityId;

	@Column(name = "KYC_STATUS", nullable = false, insertable = true, updatable = true)
	private String keyStatus;

	@Column(name = "CREDIT_SCORE", nullable = false, insertable = true, updatable = true)
	private Long creditScore;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getSocialsecurityId() {
		return socialsecurityId;
	}

	public void setSocialsecurityId(String socialsecurityId) {
		this.socialsecurityId = socialsecurityId;
	}

	public String getKeyStatus() {
		return keyStatus;
	}

	public void setKeyStatus(String keyStatus) {
		this.keyStatus = keyStatus;
	}

	public Long getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Long creditScore) {
		this.creditScore = creditScore;
	}
	
	
}
