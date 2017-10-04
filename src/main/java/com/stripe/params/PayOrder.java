package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class PayOrder {
	@Nullable abstract Integer applicationFee();

	@Nullable abstract String customer();

	@Nullable abstract String email();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String shippingMethod();

	@Nullable abstract String source();

	public static Builder builder() {
		return new AutoValue_PayOrder.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (applicationFee() != null) {
			m.put("application_fee", applicationFee());
		}
		if (customer() != null) {
			m.put("customer", customer());
		}
		if (email() != null) {
			m.put("email", email());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (shippingMethod() != null) {
			m.put("shipping_method", shippingMethod());
		}
		if (source() != null) {
			m.put("source", source());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder applicationFee(Integer value);

		public abstract Builder customer(String value);

		public abstract Builder email(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder shippingMethod(String value);

		public abstract Builder source(String value);

		public abstract PayOrder build();
	}
}
