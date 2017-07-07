package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateSource {
	@Nullable abstract Integer amount();

	@Nullable abstract String currency();

	@Nullable abstract String flow();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String token();

	@Nullable abstract String type();

	@Nullable abstract String usage();

	public static Builder builder() {
		return new AutoValue_CreateSource.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (currency() != null) {
			m.put("currency", currency());
		}
		if (flow() != null) {
			m.put("flow", flow());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (token() != null) {
			m.put("token", token());
		}
		if (type() != null) {
			m.put("type", type());
		}
		if (usage() != null) {
			m.put("usage", usage());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder currency(String value);

		public abstract Builder flow(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder token(String value);

		public abstract Builder type(String value);

		public abstract Builder usage(String value);

		public abstract CreateSource build();
	}
}
