package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateOrder {
	@Nullable abstract String coupon();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String selectedShippingMethod();

	@Nullable abstract String status();

	public static Builder builder() {
		return new AutoValue_UpdateOrder.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (coupon() != null) {
			m.put("coupon", coupon());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (selectedShippingMethod() != null) {
			m.put("selected_shipping_method", selectedShippingMethod());
		}
		if (status() != null) {
			m.put("status", status());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder coupon(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder selectedShippingMethod(String value);

		public abstract Builder status(String value);

		public abstract UpdateOrder build();
	}
}
