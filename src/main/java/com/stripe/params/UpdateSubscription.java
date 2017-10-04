package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateSubscription {
	@Nullable abstract Double applicationFeePercent();

	@Nullable abstract String coupon();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String plan();

	@Nullable abstract Boolean prorate();

	@Nullable abstract Integer prorationDate();

	@Nullable abstract Integer quantity();

	@Nullable abstract String source();

	@Nullable abstract Double taxPercent();

	@Nullable abstract String trialEnd();

	public static Builder builder() {
		return new AutoValue_UpdateSubscription.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (applicationFeePercent() != null) {
			m.put("application_fee_percent", applicationFeePercent());
		}
		if (coupon() != null) {
			m.put("coupon", coupon());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (plan() != null) {
			m.put("plan", plan());
		}
		if (prorate() != null) {
			m.put("prorate", prorate());
		}
		if (prorationDate() != null) {
			m.put("proration_date", prorationDate());
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
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder applicationFeePercent(Double value);

		public abstract Builder coupon(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder plan(String value);

		public abstract Builder prorate(Boolean value);

		public abstract Builder prorationDate(Integer value);

		public abstract Builder quantity(Integer value);

		public abstract Builder source(String value);

		public abstract Builder taxPercent(Double value);

		public abstract Builder trialEnd(String value);

		public abstract UpdateSubscription build();
	}
}
