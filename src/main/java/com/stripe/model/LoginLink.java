package com.stripe.model;

import com.stripe.net.APIResource;

public class LoginLink extends APIResource implements HasId {
	String object;
	Long created;
	String url;

	public String getId() {
		throw new UnsupportedOperationException("Login links are ephemeral and do not have an identifier");
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
