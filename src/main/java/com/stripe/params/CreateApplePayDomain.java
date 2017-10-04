package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateApplePayDomain {
	@Nullable abstract String domainName();

	public static Builder builder() {
		return new AutoValue_CreateApplePayDomain.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (domainName() != null) {
			m.put("domain_name", domainName());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder domainName(String value);

		public abstract CreateApplePayDomain build();
	}
}
