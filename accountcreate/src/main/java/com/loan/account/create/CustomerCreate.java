package com.loan.account.create;

import java.io.Serializable;


public class CustomerCreate  implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4317288298970639481L;

	private Long customerID;

	private String firstName;

	private String lastName;

	
	private String dateofBirth;

	
	private Character gender;

	
	private String contactNumber;

	
	private String emailId;

	private String socialSecuirtyId;

	private String residentialAdreess;

	private String communicationAdreess;
	
	private String kycStatus;
	
	private Long creditScore;

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSocialSecuirtyId() {
		return socialSecuirtyId;
	}

	public void setSocialSecuirtyId(String socialSecuirtyId) {
		this.socialSecuirtyId = socialSecuirtyId;
	}

	public String getResidentialAdreess() {
		return residentialAdreess;
	}

	public void setResidentialAdreess(String residentialAdreess) {
		this.residentialAdreess = residentialAdreess;
	}

	public String getCommunicationAdreess() {
		return communicationAdreess;
	}

	public void setCommunicationAdreess(String communicationAdreess) {
		this.communicationAdreess = communicationAdreess;
	}

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public Long getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Long creditScore) {
		this.creditScore = creditScore;
	}
	
}
