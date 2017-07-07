package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateCard {
	@Nullable abstract String addressCity();

	@Nullable abstract String addressCountry();

	@Nullable abstract String addressLine1();

	@Nullable abstract String addressLine2();

	@Nullable abstract String addressState();

	@Nullable abstract String addressZip();

	@Nullable abstract String expMonth();

	@Nullable abstract String expYear();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String name();

	public static Builder builder() {
		return new AutoValue_UpdateCard.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (addressCity() != null) {
			m.put("address_city", addressCity());
		}
		if (addressCountry() != null) {
			m.put("address_country", addressCountry());
		}
		if (addressLine1() != null) {
			m.put("address_line1", addressLine1());
		}
		if (addressLine2() != null) {
			m.put("address_line2", addressLine2());
		}
		if (addressState() != null) {
			m.put("address_state", addressState());
		}
		if (addressZip() != null) {
			m.put("address_zip", addressZip());
		}
		if (expMonth() != null) {
			m.put("exp_month", expMonth());
		}
		if (expYear() != null) {
			m.put("exp_year", expYear());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (name() != null) {
			m.put("name", name());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder addressCity(String value);

		public abstract Builder addressCountry(String value);

		public abstract Builder addressLine1(String value);

		public abstract Builder addressLine2(String value);

		public abstract Builder addressState(String value);

		public abstract Builder addressZip(String value);

		public abstract Builder expMonth(String value);

		public abstract Builder expYear(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder name(String value);

		public abstract UpdateCard build();
	}
}
