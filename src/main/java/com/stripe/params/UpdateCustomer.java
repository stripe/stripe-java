package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateCustomer {
	@Nullable abstract Integer accountBalance();

	@Nullable abstract String businessVatId();

	@Nullable abstract String coupon();

	@Nullable abstract String defaultSource();

	@Nullable abstract String description();

	@Nullable abstract String email();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String source();

	public static Builder builder() {
		return new AutoValue_UpdateCustomer.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (accountBalance() != null) {
			m.put("account_balance", accountBalance());
		}
		if (businessVatId() != null) {
			m.put("business_vat_id", businessVatId());
		}
		if (coupon() != null) {
			m.put("coupon", coupon());
		}
		if (defaultSource() != null) {
			m.put("default_source", defaultSource());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (email() != null) {
			m.put("email", email());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (source() != null) {
			m.put("source", source());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder accountBalance(Integer value);

		public abstract Builder businessVatId(String value);

		public abstract Builder coupon(String value);

		public abstract Builder defaultSource(String value);

		public abstract Builder description(String value);

		public abstract Builder email(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder source(String value);

		public abstract UpdateCustomer build();
	}
}
