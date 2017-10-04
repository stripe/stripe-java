package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateDispute {
	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract Boolean submit();

	public static Builder builder() {
		return new AutoValue_UpdateDispute.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (submit() != null) {
			m.put("submit", submit());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder submit(Boolean value);

		public abstract UpdateDispute build();
	}
}
