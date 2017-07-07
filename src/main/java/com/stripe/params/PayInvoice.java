package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class PayInvoice {
	@Nullable abstract String source();

	public static Builder builder() {
		return new AutoValue_PayInvoice.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (source() != null) {
			m.put("source", source());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder source(String value);

		public abstract PayInvoice build();
	}
}
