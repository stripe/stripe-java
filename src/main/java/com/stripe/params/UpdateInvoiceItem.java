package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateInvoiceItem {
	@Nullable abstract Integer amount();

	@Nullable abstract String description();

	@Nullable abstract Boolean discountable();

	@Nullable abstract Map<String, String> metadata();

	public static Builder builder() {
		return new AutoValue_UpdateInvoiceItem.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (discountable() != null) {
			m.put("discountable", discountable());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder description(String value);

		public abstract Builder discountable(Boolean value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract UpdateInvoiceItem build();
	}
}
