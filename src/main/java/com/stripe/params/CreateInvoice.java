package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateInvoice {
	@Nullable abstract Integer applicationFee();

	@Nullable abstract String customer();

	@Nullable abstract String description();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract String subscription();

	@Nullable abstract Double taxPercent();

	public static Builder builder() {
		return new AutoValue_CreateInvoice.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (applicationFee() != null) {
			m.put("application_fee", applicationFee());
		}
		if (customer() != null) {
			m.put("customer", customer());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		if (subscription() != null) {
			m.put("subscription", subscription());
		}
		if (taxPercent() != null) {
			m.put("tax_percent", taxPercent());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder applicationFee(Integer value);

		public abstract Builder customer(String value);

		public abstract Builder description(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder subscription(String value);

		public abstract Builder taxPercent(Double value);

		public abstract CreateInvoice build();
	}
}
