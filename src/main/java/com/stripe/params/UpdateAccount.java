package com.stripe.params;

import com.google.auto.value.AutoValue;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nullable;

@AutoValue
public abstract class UpdateAccount {
	@Nullable abstract String businessLogo();

	@Nullable abstract String businessName();

	@Nullable abstract String businessPrimaryColor();

	@Nullable abstract String businessUrl();

	@Nullable abstract Boolean debitNegativeBalances();

	@Nullable abstract String defaultCurrency();

	@Nullable abstract String email();

	@Nullable abstract String externalAccount();

	@Nullable abstract Map<String, String> metadata();

	@Nullable abstract String payoutStatementDescriptor();

	@Nullable abstract String productDescription();

	@Nullable abstract String statementDescriptor();

	@Nullable abstract String supportEmail();

	@Nullable abstract String supportPhone();

	@Nullable abstract String supportUrl();

	public static Builder builder() {
		return new AutoValue_UpdateAccount.Builder();
	}

	public Map<String, Object> toMap() {
		Map<String, Object> m = new HashMap<String, Object>();
		if (businessLogo() != null) {
			m.put("business_logo", businessLogo());
		}
		if (businessName() != null) {
			m.put("business_name", businessName());
		}
		if (businessPrimaryColor() != null) {
			m.put("business_primary_color", businessPrimaryColor());
		}
		if (businessUrl() != null) {
			m.put("business_url", businessUrl());
		}
		if (debitNegativeBalances() != null) {
			m.put("debit_negative_balances", debitNegativeBalances());
		}
		if (defaultCurrency() != null) {
			m.put("default_currency", defaultCurrency());
		}
		if (email() != null) {
			m.put("email", email());
		}
		if (externalAccount() != null) {
			m.put("external_account", externalAccount());
		}
		if (metadata() != null) {
			m.put("metadata", metadata());
		}
		if (payoutStatementDescriptor() != null) {
			m.put("payout_statement_descriptor", payoutStatementDescriptor());
		}
		if (productDescription() != null) {
			m.put("product_description", productDescription());
		}
		if (statementDescriptor() != null) {
			m.put("statement_descriptor", statementDescriptor());
		}
		if (supportEmail() != null) {
			m.put("support_email", supportEmail());
		}
		if (supportPhone() != null) {
			m.put("support_phone", supportPhone());
		}
		if (supportUrl() != null) {
			m.put("support_url", supportUrl());
		}
		return m;
	}

	@AutoValue.Builder
	public abstract static class Builder {
		public abstract Builder businessLogo(String value);

		public abstract Builder businessName(String value);

		public abstract Builder businessPrimaryColor(String value);

		public abstract Builder businessUrl(String value);

		public abstract Builder debitNegativeBalances(Boolean value);

		public abstract Builder defaultCurrency(String value);

		public abstract Builder email(String value);

		public abstract Builder externalAccount(String value);

		public abstract Builder metadata(Map<String, String> value);

		public abstract Builder payoutStatementDescriptor(String value);

		public abstract Builder productDescription(String value);

		public abstract Builder statementDescriptor(String value);

		public abstract Builder supportEmail(String value);

		public abstract Builder supportPhone(String value);

		public abstract Builder supportUrl(String value);

		public abstract UpdateAccount build();
	}
}
