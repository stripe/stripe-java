package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.*;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

public class Account extends APIResource implements HasId, MetadataStore<Account> {
	String id;
	String object;
	String businessLogo;
	String businessName;
	String businessPrimaryColor;
	@SerializedName("business_url")
	String businessURL;
	Boolean chargesEnabled;
	String country;
	Boolean debitNegativeBalances;
	AccountDeclineChargeOn declineChargeOn;
	String defaultCurrency;
	Boolean detailsSubmitted;
	String displayName;
	String email;
	ExternalAccountCollection externalAccounts;
	Keys keys;
	LegalEntity legalEntity;
	Boolean managed;
	Map<String, String> metadata;
	String productDescription;
	String statementDescriptor;
	String supportEmail;
	String supportPhone;
	@SerializedName("support_url")
	String supportURL;
	String timezone;
	AccountTosAcceptance tosAcceptance;
	AccountTransferSchedule transferSchedule;
	Boolean transfersEnabled;
	Verification verification;

	@Deprecated
	List<String> currenciesSupported;

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getBusinessLogo()
	{
		return businessLogo;
	}

	public String getBusinessName()
	{
		return businessName;
	}

	public String getBusinessPrimaryColor(){
		return businessPrimaryColor;
	}

	public void setBusinessPrimaryColor(String businessPrimaryColor){
		this.businessPrimaryColor = businessPrimaryColor;
	}

	public String getBusinessURL()
	{
		return businessURL;
	}

	public Boolean getChargesEnabled() {
		return chargesEnabled;
	}

	public String getCountry() {
		return country;
	}

	public Boolean getDebitNegativeBalances() {
		return debitNegativeBalances;
	}

	public void setDebitNegativeBalances(Boolean debitNegativeBalances) {
		this.debitNegativeBalances = debitNegativeBalances;
	}

	public AccountDeclineChargeOn getDeclineChargeOn(){
		return declineChargeOn;
	}

	public void setDeclineChargeOn(AccountDeclineChargeOn declineChargeOn){
		this.declineChargeOn = declineChargeOn;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public Boolean getDetailsSubmitted() {
		return detailsSubmitted;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getEmail() {
		return email;
	}

	public ExternalAccountCollection getExternalAccounts()
	{
		return externalAccounts;
	}

	public Keys getKeys()
	{
		return keys;
	}

	public LegalEntity getLegalEntity() {
		return legalEntity;
	}

	public Boolean getManaged()
	{
		return managed;
	}

	public Map<String, String> getMetadata()
	{
		return metadata;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public String getSupportEmail()
	{
		return supportEmail;
	}

	public String getSupportPhone()
	{
		return supportPhone;
	}

	public String getSupportURL()
	{
		return supportURL;
	}

	public String getTimezone() {
		return timezone;
	}

	public AccountTosAcceptance getTosAcceptance(){
		return tosAcceptance;
	}

	public void setTosAcceptance(AccountTosAcceptance tosAcceptance){
		this.tosAcceptance = tosAcceptance;
	}

	public AccountTransferSchedule getTransferSchedule(){
		return transferSchedule;
	}

	public void setTransferSchedule(AccountTransferSchedule transferSchedule){
		this.transferSchedule = transferSchedule;
	}

	public Boolean getTransfersEnabled() {
		return transfersEnabled;
	}

	public Verification getVerification() {
		return verification;
	}

	/**
	 * @deprecated
	 * Use the country_specs endpoint (https://stripe.com/docs/upgrades#2016-03-07)
	 */
	@Deprecated
	public List<String> getCurrenciesSupported() {
		return currenciesSupported;
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

	public static AccountCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
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
		return list(params, (RequestOptions) null);
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

	public Account reject(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Account.class, this.id) + "/reject", params, Account.class, (RequestOptions) null);
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
		return delete(null, (RequestOptions) null);
	}

	public DeletedAccount delete(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return delete(params, (RequestOptions) null);
	}

	public DeletedAccount delete(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(Account.class, this.id), params, DeletedAccount.class, options);
	}

	public static class Verification extends StripeObject {
		Boolean contacted;
		String disabledReason;
		Long dueBy;
		List<String> fieldsNeeded;

		public Boolean getContacted() {
			return contacted;
		}

		public String getDisabledReason() {
			return disabledReason;
		}

		public Long getDueBy() {
			return dueBy;
		}

		public List<String> getFieldsNeeded() {
			return fieldsNeeded;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			Verification ve = (Verification) o;
			return equals(contacted, ve.contacted) &&
				equals(disabledReason, ve.disabledReason) &&
				equals(dueBy, ve.dueBy) &&
				equals(fieldsNeeded, ve.fieldsNeeded);
		}
	}

	public static class Keys extends StripeObject {
		String publishable;
		String secret;

		public String getPublishable()
		{
			return publishable;
		}

		public String getSecret()
		{
			return secret;
		}
	}
}
