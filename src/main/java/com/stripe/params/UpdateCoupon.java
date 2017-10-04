package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateCoupon {
	@Nullable abstract Map<String, String> metadata();

	public static Builder builder() {
		return new AutoValue_UpdateCoupon.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder metadata(Map<String, String> value);

		public abstract UpdateCoupon build();
	}
}
