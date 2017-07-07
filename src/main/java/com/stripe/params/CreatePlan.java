package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreatePlan {
	@Nullable abstract Integer amount();

	@Nullable abstract String currency();

	@Nullable abstract String id();

	@Nullable abstract String interval();

	@Nullable abstract Integer intervalCount();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String name();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract Integer trialPeriodDays();

	public static Builder builder() {
		return new AutoValue_CreatePlan.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (id() != null) {
			m.put("id", id());
		}
		if (interval() != null) {
			m.put("interval", interval());
		}
		if (intervalCount() != null) {
			m.put("interval_count", intervalCount());
		}
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
		public abstract Builder amount(Integer value);

		public abstract Builder currency(String value);

		public abstract Builder id(String value);

		public abstract Builder interval(String value);

		public abstract Builder intervalCount(Integer value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder name(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder trialPeriodDays(Integer value);

		public abstract CreatePlan build();
	}
}
