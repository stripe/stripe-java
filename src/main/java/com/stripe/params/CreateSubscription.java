package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateSubscription {
	@Nullable abstract Double applicationFeePercent();

	@Nullable abstract String coupon();

	@Nullable abstract String customer();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String plan();

	@Nullable abstract Integer quantity();

	@Nullable abstract String source();

	@Nullable abstract Double taxPercent();

	@Nullable abstract String trialEnd();

	@Nullable abstract Integer trialPeriodDays();

	public static Builder builder() {
		return new AutoValue_CreateSubscription.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (applicationFeePercent() != null) {
			m.put("application_fee_percent", applicationFeePercent());
		}
		if (coupon() != null) {
			m.put("coupon", coupon());
		}
		if (customer() != null) {
			m.put("customer", customer());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (plan() != null) {
			m.put("plan", plan());
		}
		if (quantity() != null) {
			m.put("quantity", quantity());
		}
		if (source() != null) {
			m.put("source", source());
		}
		if (taxPercent() != null) {
			m.put("tax_percent", taxPercent());
		}
		if (trialEnd() != null) {
			m.put("trial_end", trialEnd());
		}
		if (trialPeriodDays() != null) {
			m.put("trial_period_days", trialPeriodDays());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder applicationFeePercent(Double value);

		public abstract Builder coupon(String value);

		public abstract Builder customer(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder plan(String value);

		public abstract Builder quantity(Integer value);

		public abstract Builder source(String value);

		public abstract Builder taxPercent(Double value);

		public abstract Builder trialEnd(String value);

		public abstract Builder trialPeriodDays(Integer value);

		public abstract CreateSubscription build();
	}
}
