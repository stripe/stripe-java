package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateSKU {
	@Nullable abstract Boolean active();

	@Nullable abstract String currency();

	@Nullable abstract String image();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract Integer price();

	@Nullable abstract String product();

	public static Builder builder() {
		return new AutoValue_UpdateSKU.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (active() != null) {
			m.put("active", active());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (image() != null) {
			m.put("image", image());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (price() != null) {
			m.put("price", price());
		}
		if (product() != null) {
			m.put("product", product());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder active(Boolean value);

		public abstract Builder currency(String value);

		public abstract Builder image(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder price(Integer value);

		public abstract Builder product(String value);

		public abstract UpdateSKU build();
	}
}
