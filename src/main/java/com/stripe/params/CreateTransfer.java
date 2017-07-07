package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateTransfer {
	@Nullable abstract Integer amount();

	@Nullable abstract String currency();

	@Nullable abstract String description();

	@Nullable abstract String destination();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String sourceTransaction();

	@Nullable abstract String sourceType();

	@Nullable abstract String transferGroup();

	public static Builder builder() {
		return new AutoValue_CreateTransfer.Builder();
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
		if (sourceTransaction() != null) {
			m.put("source_transaction", sourceTransaction());
		}
		if (sourceType() != null) {
			m.put("source_type", sourceType());
		}
		if (transferGroup() != null) {
			m.put("transfer_group", transferGroup());
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

		public abstract Builder sourceTransaction(String value);

		public abstract Builder sourceType(String value);

		public abstract Builder transferGroup(String value);

		public abstract CreateTransfer build();
	}
}
