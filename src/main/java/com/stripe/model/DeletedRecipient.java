package com.stripe.model;


public class DeletedRecipient extends StripeObject implements DeletedStripeObject {
	String id;
	Boolean deleted;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
