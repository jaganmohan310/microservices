package com.loan.customer.search;

public class SearchQuery {

	String pannumber;
	String creationDate;

	public SearchQuery() {
		super();
	}

	@Override
	public String toString() {
		return "SearchQuery [pannumber=" + pannumber + ", creationDate=" + creationDate + "]";
	}

	public SearchQuery(String pannumber, String creationDate) {
		super();
		this.creationDate = creationDate;
		this.pannumber = pannumber;

	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

}
