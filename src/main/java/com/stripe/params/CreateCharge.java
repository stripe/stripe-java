package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class CreateCharge {
	@Nullable abstract Integer amount();

	@Nullable abstract String application();

	@Nullable abstract Integer applicationFee();

	@Nullable abstract Boolean capture();

	@Nullable abstract String currency();

	@Nullable abstract String customer();

	@Nullable abstract String description();

	@Nullable abstract String externalId();

	@Nullable abstract String invoice();

	@Nullable abstract String invoiceSource();

	@Nullable abstract String ip();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String onBehalfOf();

	@Nullable abstract String paymentUserAgent();

	@Nullable abstract String receiptEmail();

	@Nullable abstract Boolean recurring();

	@Nullable abstract String referrer();

	@Nullable abstract String source();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract String transferGroup();

	@Nullable abstract Boolean uncaptured();

	@Nullable abstract String userAgent();

	public static Builder builder() {
		return new AutoValue_CreateCharge.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (amount() != null) {
			m.put("amount", amount());
		}
		if (application() != null) {
			m.put("application", application());
		}
		if (applicationFee() != null) {
			m.put("application_fee", applicationFee());
		}
		if (capture() != null) {
			m.put("capture", capture());
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
		if (externalId() != null) {
			m.put("external_id", externalId());
		}
		if (invoice() != null) {
			m.put("invoice", invoice());
		}
		if (invoiceSource() != null) {
			m.put("invoice_source", invoiceSource());
		}
		if (ip() != null) {
			m.put("ip", ip());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (onBehalfOf() != null) {
			m.put("on_behalf_of", onBehalfOf());
		}
		if (paymentUserAgent() != null) {
			m.put("payment_user_agent", paymentUserAgent());
		}
		if (receiptEmail() != null) {
			m.put("receipt_email", receiptEmail());
		}
		if (recurring() != null) {
			m.put("recurring", recurring());
		}
		if (referrer() != null) {
			m.put("referrer", referrer());
		}
		if (source() != null) {
			m.put("source", source());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		if (transferGroup() != null) {
			m.put("transfer_group", transferGroup());
		}
		if (uncaptured() != null) {
			m.put("uncaptured", uncaptured());
		}
		if (userAgent() != null) {
			m.put("user_agent", userAgent());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder amount(Integer value);

		public abstract Builder application(String value);

		public abstract Builder applicationFee(Integer value);

		public abstract Builder capture(Boolean value);

		public abstract Builder currency(String value);

		public abstract Builder customer(String value);

		public abstract Builder description(String value);

		public abstract Builder externalId(String value);

		public abstract Builder invoice(String value);

		public abstract Builder invoiceSource(String value);

		public abstract Builder ip(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder onBehalfOf(String value);

		public abstract Builder paymentUserAgent(String value);

		public abstract Builder receiptEmail(String value);

		public abstract Builder recurring(Boolean value);

		public abstract Builder referrer(String value);

		public abstract Builder source(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder transferGroup(String value);

		public abstract Builder uncaptured(Boolean value);

		public abstract Builder userAgent(String value);

		public abstract CreateCharge build();
	}
}
