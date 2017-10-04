package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class VerifySource {
	@Nullable abstract String verificationMethod();

	public static Builder builder() {
		return new AutoValue_VerifySource.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (verificationMethod() != null) {
			m.put("verification_method", verificationMethod());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder verificationMethod(String value);

		public abstract VerifySource build();
	}
}
