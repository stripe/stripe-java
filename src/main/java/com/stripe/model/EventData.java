package com.stripe.model;

import java.io.Serializable;
import java.util.Map;

public class EventData extends StripeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	Map<String, Object> previousAttributes;
	StripeObject object;
	
	public Map<String, Object> getPreviousAttributes() {
		return previousAttributes;
	}
	
	public void setPreviousAttributes(Map<String, Object> previousAttributes) {
		this.previousAttributes = previousAttributes;
	}

	public StripeObject getObject() {
		return object;
	}

	public void setObject(StripeObject object) {
		this.object = object;
	}
}
