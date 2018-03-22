package com.stripe.model;

import java.util.Map;

import com.stripe.net.APIResource;


public class SourceTransaction extends APIResource implements HasId, HasSourceTypeData {
	String id;
	String object;
	Long amount;
	Long created;
	String currency;
	String customerData;
	Boolean livemode;
	String source;
	String type;

	// Type-specific properties
	Map<String, String> typeData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerData() {
		return customerData;
	}

	public void setCustomerData(String customerData) {
		this.customerData = customerData;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Type-specific getters/setters

	public Map<String, String> getTypeData() {
		return typeData;
	}

	public void setTypeData(Map<String, String> typeData) {
		this.typeData = typeData;
	}
}
