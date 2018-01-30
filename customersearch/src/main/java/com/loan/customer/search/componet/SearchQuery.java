package com.loan.customer.search.componet;

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
	
	
}
