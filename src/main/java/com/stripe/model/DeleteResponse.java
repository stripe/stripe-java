package com.stripe.model;

public class DeleteResponse {
	protected String id;
	protected boolean deleted;

	public DeleteResponse() {
	}

	public DeleteResponse(String id, boolean deleted) {
		super();
		this.id = id;
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
