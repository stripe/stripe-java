package com.stripe.model;

import com.stripe.net.APIResource;

public class Fee extends APIResource {
	String type;
	String application;
	Integer amount;
	String description;
	String currency;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
  }

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
