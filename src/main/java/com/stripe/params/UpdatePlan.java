package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdatePlan {
	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String name();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract Integer trialPeriodDays();

	public static Builder builder() {
		return new AutoValue_UpdatePlan.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (name() != null) {
			m.put("name", name());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		if (trialPeriodDays() != null) {
			m.put("trial_period_days", trialPeriodDays());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder name(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder trialPeriodDays(Integer value);

		public abstract UpdatePlan build();
	}
}
