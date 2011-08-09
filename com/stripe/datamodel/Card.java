package com.stripe.datamodel;

public class Card {
	protected String type;
	protected String country;
	protected String exp_month;
	protected String exp_year;
	protected String last4;
	protected String id;
	
	public Card(){		
	}
	
	public Card(String type, String country, String exp_month, String exp_year,
			String last4, String id) {
		super();
		this.type = type;
		this.country = country;
		this.exp_month = exp_month;
		this.exp_year = exp_year;
		this.last4 = last4;
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getExp_month() {
		return exp_month;
	}
	public void setExp_month(String exp_month) {
		this.exp_month = exp_month;
	}
	public String getExp_year() {
		return exp_year;
	}
	public void setExp_year(String exp_year) {
		this.exp_year = exp_year;
	}

	public String getLast4() {
		return last4;
	}
	
	public void setLast4(String last4) {
		this.last4 = last4;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
