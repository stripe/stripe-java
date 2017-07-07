package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateInvoice {
	@Nullable abstract Integer applicationFee();

	@Nullable abstract Boolean closed();

	@Nullable abstract String description();

	@Nullable abstract Boolean forgiven();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract Double taxPercent();

	public static Builder builder() {
		return new AutoValue_UpdateInvoice.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (applicationFee() != null) {
			m.put("application_fee", applicationFee());
		}
		if (closed() != null) {
			m.put("closed", closed());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (forgiven() != null) {
			m.put("forgiven", forgiven());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		if (taxPercent() != null) {
			m.put("tax_percent", taxPercent());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder applicationFee(Integer value);

		public abstract Builder closed(Boolean value);

		public abstract Builder description(String value);

		public abstract Builder forgiven(Boolean value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder taxPercent(Double value);

		public abstract UpdateInvoice build();
	}
}
