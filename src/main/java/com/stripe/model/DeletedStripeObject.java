package com.stripe.model;

public interface DeletedStripeObject {
	String getId();
	void setId(String id);
	Boolean getDeleted();
	void setDeleted(Boolean deleted);
}