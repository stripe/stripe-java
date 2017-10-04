package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class RejectAccount {
	@Nullable abstract String reason();

	public static Builder builder() {
		return new AutoValue_RejectAccount.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (reason() != null) {
			m.put("reason", reason());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder reason(String value);

		public abstract RejectAccount build();
	}
}
