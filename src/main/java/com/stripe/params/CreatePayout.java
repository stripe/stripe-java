package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreatePayout {
	@Nullable abstract Integer amount();

	@Nullable abstract String currency();

	@Nullable abstract String description();

	@Nullable abstract String destination();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String method();

	@Nullable abstract String sourceType();

	@Nullable abstract String statementDescriptor();

	public static Builder builder() {
		return new AutoValue_CreatePayout.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (destination() != null) {
			m.put("destination", destination());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (method() != null) {
			m.put("method", method());
		}
		if (sourceType() != null) {
			m.put("source_type", sourceType());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder currency(String value);

		public abstract Builder description(String value);

		public abstract Builder destination(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder method(String value);

		public abstract Builder sourceType(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract CreatePayout build();
	}
}
