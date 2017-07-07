package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateOrder {
	@Nullable abstract String coupon();

	@Nullable abstract String currency();

	@Nullable abstract String customer();

	@Nullable abstract String email();

	@Nullable abstract Map<String, String> metadata();

	public static Builder builder() {
		return new AutoValue_CreateOrder.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (coupon() != null) {
			m.put("coupon", coupon());
		}
		if (currency() != null) {
			m.put("currency", currency());
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
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder coupon(String value);

		public abstract Builder currency(String value);

		public abstract Builder customer(String value);

		public abstract Builder email(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract CreateOrder build();
	}
}
