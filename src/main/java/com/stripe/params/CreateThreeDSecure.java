package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateThreeDSecure {
	@Nullable abstract Integer amount();

	@Nullable abstract String card();

	@Nullable abstract String currency();

	@Nullable abstract String customer();

	@Nullable abstract String returnUrl();

	public static Builder builder() {
		return new AutoValue_CreateThreeDSecure.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (card() != null) {
			m.put("card", card());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (customer() != null) {
			m.put("customer", customer());
		}
		if (returnUrl() != null) {
			m.put("return_url", returnUrl());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder card(String value);

		public abstract Builder currency(String value);

		public abstract Builder customer(String value);

		public abstract Builder returnUrl(String value);

		public abstract CreateThreeDSecure build();
	}
}
