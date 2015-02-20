package com.stripe.model;

public interface DeletedStripeObject {
	public String getId();
	public void setId(String id);
	public Boolean getDeleted();
	public void setDeleted(Boolean deleted);
}