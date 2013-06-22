package com.stripe.model;

import java.io.Serializable;

public class DeletedPlan extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

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