package com.loan.customer.search;

public class SearchQuery {

	private String lastName;
	private	String socialSecuirtyId;

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
