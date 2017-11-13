package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.*;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class Account extends APIResource implements HasId, MetadataStore<Account> {

	@Getter
	String id;
	@Getter @Setter
	String object;
	@Getter
	String businessLogo;
	@Getter
	String businessName;
	@Getter
	String businessPrimaryColor;
	@Getter
	@SerializedName("business_url")
	String businessURL;
	@Getter
	Boolean chargesEnabled;
	@Getter
	String country;
	@Getter @Setter
	Boolean debitNegativeBalances;
	@Getter @Setter
	AccountDeclineChargeOn declineChargeOn;
	@Getter
	String defaultCurrency;
	@Getter
	Boolean detailsSubmitted;
	@Getter
	String displayName;
	@Getter
	LoginLinkCollection loginLinks;
	@Getter
	String email;
	@Getter
	ExternalAccountCollection externalAccounts;
	@Getter
	Keys keys;
	@Getter
	LegalEntity legalEntity;

	/**
	 * @deprecated Use getType() instead.
	 */
	@Deprecated @Getter
	Boolean managed;
	@Getter
	Map<String, String> metadata;
	@Getter @Setter
	Boolean payoutsEnabled;
	@Getter @Setter
	AccountPayoutSchedule payoutSchedule;
	@Getter @Setter
	String productDescription;
	@Getter
	String statementDescriptor;
	@Getter
	String supportEmail;
	@Getter
	String supportPhone;
	@Getter
	@SerializedName("support_url")
	String supportURL;
	@Getter
	String timezone;
	@Getter @Setter
	AccountTosAcceptance tosAcceptance;
	@Setter
	AccountTransferSchedule transferSchedule;
	@Getter
	Boolean transfersEnabled;
	@Getter @Setter
	String type;
	@Getter
	Verification verification;

	/**
	 * @deprecated Use the country_specs endpoint (https://stripe.com/docs/upgrades#2016-03-07)
	 */
	@Getter
	@Deprecated
	List<String> currenciesSupported;

	public static Account create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Account create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Account.class), params, Account.class, options);
	}

	public static AccountCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static AccountCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(Account.class), params, AccountCollection.class, options);
	}

	@Deprecated
	public static AccountCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static AccountCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, options);
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
			return retrieve(apiKeyOrAccountId, null);
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

	public static Account retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Account.class, id), params, Account.class, options);
	}

	public Account update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public Account reject(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Account.class, this.id) + "/reject", params, Account.class, null);
	}

	public Account update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Account.class, this.id), params, Account.class, options);
	}

	public DeletedAccount delete()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete((RequestOptions) null);
	}

	public DeletedAccount delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(null, null);
	}

	public DeletedAccount delete(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(params, null);
	}

	public DeletedAccount delete(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(Account.class, this.id), params, DeletedAccount.class, options);
	}

	@Getter
	@EqualsAndHashCode(callSuper = false)
	public static class Verification extends StripeObject {
		Boolean contacted;
		String disabledReason;
		Long dueBy;
		List<String> fieldsNeeded;

	}

	@Getter
	public static class Keys extends StripeObject {
		String publishable;
		String secret;
	}
}
