package com.stripe.model;

import java.util.Map;

public class EventData extends StripeObject {
	StripeObject object;
	Map<String, Object> previousAttributes;

	public StripeObject getObject() {
		return object;
	}

	public void setObject(StripeObject object) {
		this.object = object;
	}

	public Map<String, Object> getPreviousAttributes() {
		return previousAttributes;
	}

	public void setPreviousAttributes(Map<String, Object> previousAttributes) {
		this.previousAttributes = previousAttributes;
	}
}
