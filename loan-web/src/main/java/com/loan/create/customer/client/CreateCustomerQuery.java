package com.loan.create.customer.client;

import java.io.Serializable;

public class CreateCustomerQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long customerID;
	
	private String firstName; 

	private String lastName;

	private String dateofBirth;

	private Character gender;

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	private String contactNumber;

	private String emailId;

	private String socialSecuirtyId;

	private String residentialAdreess;

	private String communicationAdreess;
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

}
