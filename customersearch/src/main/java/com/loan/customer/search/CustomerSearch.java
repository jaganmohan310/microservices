package com.loan.customer.search;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "CUSTOMER_SEARCH")
@Entity
public class CustomerSearch {

	@Id
	@SequenceGenerator(name = "CUSTOMER_ID", sequenceName = "CUSTOMER_SEARCH_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long customerID;

	@Column(name = "FIRST_NAME", nullable = false, insertable = true, updatable = true, length = 125)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false, insertable = true, updatable = true, length = 125)
	private String lastName;

	@Column(name = "DATE_OF_BIRTH", nullable = false, insertable = true, updatable = true)
	private LocalDate dateofBirth;

	@Column(name = "GENDER", nullable = false, insertable = true, updatable = true)
	private Character gender;

	@Column(name = "CONTACT_NUMBER", insertable = true, updatable = true,length=10)
	private String contactNumber;

	@Column(name = "EMAILID", insertable = true, updatable = true)
	private String emailId;

	@Column(name = "SOCIAL_SECURITY_ID", nullable = false, insertable = true, updatable = true)
	private String socialSecuirtyId;

	@Column(name = "RESIDENTIAL_ADDRESS", nullable = false, insertable = true, updatable = true)
	private String residentialAdreess;

	@Column(name = "COMMUNICATION_ADDRESS", nullable = false, insertable = true, updatable = true)
	private String communicationAdreess;

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

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
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
