package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class Account extends APIResource {
	String id;
	Boolean chargesEnabled;
	Boolean detailsSubmitted;
	Boolean transfersEnabled;
	List<String> currenciesSupported;
	String email;
	String statementDescriptor;
	String defaultCurrency;
	String country;
	String timezone;
	String displayName;
	Verification verification;
	LegalEntity legalEntity;

	public String getId() {
		return id;
	}

	public Boolean getChargesEnabled() {
		return chargesEnabled;
	}

	public Boolean getDetailsSubmitted() {
		return detailsSubmitted;
	}

	public Boolean getTransfersEnabled() {
		return transfersEnabled;
	}

	public List<String> getCurrenciesSupported() {
		return currenciesSupported;
	}

	public String getEmail() {
		return email;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public String getCountry() {
		return country;
	}

	public String getTimezone() {
		return timezone;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Verification getVerification() {
		return verification;
	}

	public LegalEntity getLegalEntity() {
		return legalEntity;
	}

	public static Account create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Account create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Account.class), params, Account.class, options);
	}

	public static Account retrieve()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve((RequestOptions) null);
	}

	/**
	 * In order to preserve backwards-compatibility, this method does two things.
	 * If the parameter looks like an API key (starts with sk_), retrieve the
	 * account resource with no ID parameter set. Otherwise, use the String
	 * parameter as the account ID.
	 */
	@Deprecated
	public static Account retrieve(String apiKeyOrAccountId)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		if (null == apiKeyOrAccountId || apiKeyOrAccountId.startsWith("sk_")) {
			return retrieve(RequestOptions.builder().setApiKey(apiKeyOrAccountId).build());
		} else {
			return retrieve(apiKeyOrAccountId, (RequestOptions) null);
		}
	}

	public static Account retrieve(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(
			RequestMethod.GET,
			singleClassURL(Account.class),
			null,
			Account.class,
			options);
	}

	public static Account retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Account.class, id), null, Account.class, options);
	}

	public Account update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public Account update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Account.class, this.id), params, Account.class, options);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Account account = (Account) o;
		return equals(id, account.id) &&
			equals(chargesEnabled, account.chargesEnabled) &&
			equals(detailsSubmitted, account.detailsSubmitted) &&
			equals(transfersEnabled, account.transfersEnabled) &&
			equals(currenciesSupported, account.currenciesSupported) &&
			equals(email, account.email) &&
			equals(statementDescriptor, account.statementDescriptor) &&
			equals(defaultCurrency, account.defaultCurrency) &&
			equals(country, account.country) &&
			equals(timezone, account.timezone) &&
			equals(displayName, account.displayName) &&
			equals(verification, account.verification) &&
			equals(legalEntity, account.legalEntity);
	}

	public static class Verification extends StripeObject {
		List<String> fieldsNeeded;
		Long dueBy;
		Boolean contacted;

		public List<String> getFieldsNeeded() {
			return fieldsNeeded;
		}
		public Long getDueBy() {
			return dueBy;
		}
		public Boolean getContacted() {
			return contacted;
		}
	}
}
