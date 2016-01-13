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

public class Account extends APIResource implements HasId, MetadataStore<Account> {
	String id;
	Boolean chargesEnabled;
	Boolean detailsSubmitted;
	Boolean transfersEnabled;
	Boolean debitNegativeBalances;
	List<String> currenciesSupported;
	String email;
	String statementDescriptor;
	String defaultCurrency;
	String country;
	String timezone;
	String displayName;
	Verification verification;
	LegalEntity legalEntity;
	Keys keys;
	Map<String, String> metadata;
	String businessName;
	String businessUrl;
	String businessLogo;
	String businessPrimaryColor;
	String supportPhone;
	String supportUrl;
	String supportEmail;
	String productDescription;
	Boolean managed;
	AccountDeclineChargeOn declineChargeOn;
	AccountTosAcceptance tosAcceptance;
	AccountTransferSchedule transferSchedule;
	ExternalAccountCollection externalAccounts;

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

	public Boolean getDebitNegativeBalances() {
		return debitNegativeBalances;
	}
	
	public void setDebitNegativeBalances(Boolean debitNegativeBalances) {
		this.debitNegativeBalances = debitNegativeBalances;
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

	public Keys getKeys()
	{
		return keys;
	}

	public Map<String, String> getMetadata()
	{
		return metadata;
	}

	public String getBusinessName()
	{
		return businessName;
	}

	public String getBusinessUrl()
	{
		return businessUrl;
	}

	public String getBusinessLogo()
	{
		return businessLogo;
	}

	public String getBusinessPrimaryColor(){
		return businessPrimaryColor;
	}

	public void setBusinessPrimaryColor(String businessPrimaryColor){
		this.businessPrimaryColor = businessPrimaryColor;
	}

	public String getSupportPhone()
	{
		return supportPhone;
	}

	public String getSupportUrl()
	{
		return supportUrl;
	}

	public String getSupportEmail()
	{
		return supportEmail;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public Boolean getManaged()
	{
		return managed;
	}

	public AccountDeclineChargeOn getDeclineChargeOn(){
		return declineChargeOn;
	}

	public void setDeclineChargeOn(AccountDeclineChargeOn declineChargeOn){
		this.declineChargeOn = declineChargeOn;
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

	public ExternalAccountCollection getExternalAccounts()
	{
		return externalAccounts;
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

	public Account update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Account.class, this.id), params, Account.class, options);
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

	public static class Keys extends StripeObject {
		String secret;
		String publishable;

		public String getSecret()
		{
			return secret;
		}

		public String getPublishable()
		{
			return publishable;
		}
	}
}
