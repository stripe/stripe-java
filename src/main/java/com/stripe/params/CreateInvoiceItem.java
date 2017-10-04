package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateInvoiceItem {
	@Nullable abstract Integer amount();

	@Nullable abstract String currency();

	@Nullable abstract String customer();

	@Nullable abstract String description();

	@Nullable abstract Boolean discountable();

	@Nullable abstract String invoice();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String subscription();

	public static Builder builder() {
		return new AutoValue_CreateInvoiceItem.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (customer() != null) {
			m.put("customer", customer());
		}
		if (description() != null) {
			m.put("description", description());
		}
		if (discountable() != null) {
			m.put("discountable", discountable());
		}
		if (invoice() != null) {
			m.put("invoice", invoice());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (subscription() != null) {
			m.put("subscription", subscription());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder currency(String value);

		public abstract Builder customer(String value);

		public abstract Builder description(String value);

		public abstract Builder discountable(Boolean value);

		public abstract Builder invoice(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder subscription(String value);

		public abstract CreateInvoiceItem build();
	}
}
