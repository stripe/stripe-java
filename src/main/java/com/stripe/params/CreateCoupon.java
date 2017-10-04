package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateCoupon {
	@Nullable abstract Integer amountOff();

	@Nullable abstract String currency();

	@Nullable abstract String duration();

	@Nullable abstract Integer durationInMonths();

	@Nullable abstract String id();

	@Nullable abstract Integer maxRedemptions();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract Integer percentOff();

	@Nullable abstract Integer redeemBy();

	public static Builder builder() {
		return new AutoValue_CreateCoupon.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amountOff() != null) {
			m.put("amount_off", amountOff());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (duration() != null) {
			m.put("duration", duration());
		}
		if (durationInMonths() != null) {
			m.put("duration_in_months", durationInMonths());
		}
		if (id() != null) {
			m.put("id", id());
		}
		if (maxRedemptions() != null) {
			m.put("max_redemptions", maxRedemptions());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (percentOff() != null) {
			m.put("percent_off", percentOff());
		}
		if (redeemBy() != null) {
			m.put("redeem_by", redeemBy());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amountOff(Integer value);

		public abstract Builder currency(String value);

		public abstract Builder duration(String value);

		public abstract Builder durationInMonths(Integer value);

		public abstract Builder id(String value);

		public abstract Builder maxRedemptions(Integer value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder percentOff(Integer value);

		public abstract Builder redeemBy(Integer value);

		public abstract CreateCoupon build();
	}
}
