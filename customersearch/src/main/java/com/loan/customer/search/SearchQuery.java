package com.loan.customer.search;

public class SearchQuery {

	private String lastName;
	private String socialSecuirtyId;
	private Long customerID;
	private String firstName;
	private String dateofBirth;
	private Character gender;
	private String contactNumber;
	private String emailId;
	private String communicationAdreess;
	private String residentialAdreess;

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

	public String getCommunicationAdreess() {
		return communicationAdreess;
	}

	public void setCommunicationAdreess(String communicationAdreess) {
		this.communicationAdreess = communicationAdreess;
	}

	public String getResidentialAdreess() {
		return residentialAdreess;
	}

	public void setResidentialAdreess(String residentialAdreess) {
		this.residentialAdreess = residentialAdreess;
	}

	public SearchQuery() {
		super();
	}

	@Override
	public String toString() {
		return "SearchQuery [lastName=" + lastName + ", socialSecuirtyId=" + socialSecuirtyId + "]";
	}

	public SearchQuery(String pannumber, String creationDate) {
		super();
		this.lastName = lastName;
		this.socialSecuirtyId = socialSecuirtyId;

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecuirtyId() {
		return socialSecuirtyId;
	}

	public void setSocialSecuirtyId(String socialSecuirtyId) {
		this.socialSecuirtyId = socialSecuirtyId;
	}

}
