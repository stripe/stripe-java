package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CaptureCharge {
	@Nullable abstract Integer amount();

	@Nullable abstract Integer applicationFee();

	@Nullable abstract String receiptEmail();

	@Nullable abstract String statementDescriptor();

	public static Builder builder() {
		return new AutoValue_CaptureCharge.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (applicationFee() != null) {
			m.put("application_fee", applicationFee());
		}
		if (receiptEmail() != null) {
			m.put("receipt_email", receiptEmail());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder applicationFee(Integer value);

		public abstract Builder receiptEmail(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract CaptureCharge build();
	}
}
