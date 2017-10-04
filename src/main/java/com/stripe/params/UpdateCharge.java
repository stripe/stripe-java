package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateCharge {
	@Nullable abstract String description();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String receiptEmail();

	@Nullable abstract String transferGroup();

	public static Builder builder() {
		return new AutoValue_UpdateCharge.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (description() != null) {
			m.put("description", description());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (receiptEmail() != null) {
			m.put("receipt_email", receiptEmail());
		}
		if (transferGroup() != null) {
			m.put("transfer_group", transferGroup());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder description(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder receiptEmail(String value);

		public abstract Builder transferGroup(String value);

		public abstract UpdateCharge build();
	}
}
