package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateSubscriptionItem {
	@Nullable abstract String plan();

	@Nullable abstract Boolean prorate();

	@Nullable abstract Integer prorationDate();

	@Nullable abstract Integer quantity();

	public static Builder builder() {
		return new AutoValue_UpdateSubscriptionItem.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
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
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder plan(String value);

		public abstract Builder prorate(Boolean value);

		public abstract Builder prorationDate(Integer value);

		public abstract Builder quantity(Integer value);

		public abstract UpdateSubscriptionItem build();
	}
}
