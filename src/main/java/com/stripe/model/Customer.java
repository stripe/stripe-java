package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

public class Customer extends APIResource implements MetadataStore<Customer>, HasId {
	String id;
	String object;
	Long accountBalance;
	String businessVatId;
	Long created;
	String currency;
	String defaultSource;
	Boolean deleted;
	Boolean delinquent;
	String description;
	Discount discount;
	String email;
	Boolean livemode;
	Map<String, String> metadata;
	ShippingDetails shipping;
	ExternalAccountCollection sources;
	CustomerSubscriptionCollection subscriptions;

	@Deprecated
	CustomerCardCollection cards;
	@Deprecated
	String defaultCard;
	@Deprecated
	NextRecurringCharge nextRecurringCharge;
	@Deprecated
	Subscription subscription;
	@Deprecated
	Long trialEnd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getBusinessVatId() {
		return businessVatId;
	}

	public void setBusinessVatId(String businessVatId) {
		this.businessVatId = businessVatId;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDefaultSource() {
		return defaultSource;
	}

	public void setDefaultSource(String defaultSource) {
		this.defaultSource = defaultSource;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public Boolean getDelinquent() {
		return delinquent;
	}

	public void setDelinquent(Boolean delinquent) {
		this.delinquent = delinquent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public ShippingDetails getShipping() {
		return shipping;
	}

	public void setShipping(ShippingDetails shipping) {
		this.shipping = shipping;
	}

	public ExternalAccountCollection getSources() {
		return sources;
	}

	public void setSources(ExternalAccountCollection sources) {
		this.sources = sources;
	}

	public CustomerSubscriptionCollection getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(CustomerSubscriptionCollection subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * @deprecated
	 * Use `sources` field (https://stripe.com/docs/upgrades#2015-02-18)
	 */
	@Deprecated
	public CustomerCardCollection getCards() {
		return cards;
	}

	/**
	 * @deprecated
	 * Use `default_source` field (https://stripe.com/docs/upgrades#2015-02-18)
	 */
	@Deprecated
	public String getDefaultCard() {
		return defaultCard;
	}

	/**
	 * @deprecated
	 * Use `default_source` field (https://stripe.com/docs/upgrades#2015-02-18)
	 */
	@Deprecated
	public void setDefaultCard(String defaultCard) {
		this.defaultCard = defaultCard;
	}

	/**
	 * @deprecated
	 * Use the upcoming invoice endpoint (https://stripe.com/docs/upgrades#2012-03-25)
	 */
	@Deprecated
	public NextRecurringCharge getNextRecurringCharge() {
		return nextRecurringCharge;
	}

	/**
	 * @deprecated
	 * Use the upcoming invoice endpoint (https://stripe.com/docs/upgrades#2012-03-25)
	 */
	@Deprecated
	public void setNextRecurringCharge(NextRecurringCharge nextRecurringCharge) {
		this.nextRecurringCharge = nextRecurringCharge;
	}

	/**
	 * @deprecated
	 * Use `subscriptions` field (https://stripe.com/docs/upgrades#2014-01-31)
	 */
	@Deprecated
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @deprecated
	 * Use `subscriptions` field (https://stripe.com/docs/upgrades#2014-01-31)
	 */
	@Deprecated
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	/**
	 * @deprecated
	 * Use `subscriptions` field (https://stripe.com/docs/upgrades#2014-01-31)
	 */
	@Deprecated
	public Long getTrialEnd() {
		return trialEnd;
	}

	/**
	 * @deprecated
	 * Use `subscriptions` field (https://stripe.com/docs/upgrades#2014-01-31)
	 */
	@Deprecated
	public void setTrialEnd(Long trialEnd) {
		this.trialEnd = trialEnd;
	}

	public static Customer create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Customer retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public Customer update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public DeletedCustomer delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete((RequestOptions) null);
	}

	public Card createCard(String token) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, (RequestOptions) null);
	}

	public Card createCard(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(params, (RequestOptions) null);
	}

	// Use `(BankAccount)customer.getSources().create(params)` instead.
	@Deprecated
	public BankAccount createBankAccount(String token) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createBankAccount(token, (RequestOptions) null);
	}

	@Deprecated
	public BankAccount createBankAccount(String token, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		Map<String, Object> postParams = new HashMap<String, Object>();
		postParams.put("bank_account", token);

		return createBankAccount(postParams, options);
	}

	@Deprecated
	public BankAccount createBankAccount(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createBankAccount(params, (RequestOptions) null);
	}

	@Deprecated
	public BankAccount createBankAccount(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/bank_accounts",
				instanceURL(Customer.class, this.id)), params, BankAccount.class, options);
	}

	public Subscription createSubscription(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createSubscription(params, (RequestOptions) null);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public Subscription updateSubscription(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return updateSubscription(params, (RequestOptions) null);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public Subscription cancelSubscription() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancelSubscription(null, (RequestOptions) null);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public Subscription cancelSubscription(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancelSubscription(params, (RequestOptions) null);
	}

	public void deleteDiscount() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		deleteDiscount((RequestOptions) null);
	}

	@Deprecated
	public static Customer create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Customer create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Customer.class), params, Customer.class, options);
	}

	@Deprecated
	public static Customer retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Customer retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Customer.class, id), null, Customer.class, options);
	}

	public static CustomerCollection list(Map<String, Object> params)
			throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, (RequestOptions) null);
	}

	public static CustomerCollection list(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Customer.class), params, CustomerCollection.class, options);
	}

	@Deprecated
	public static CustomerCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static CustomerCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static CustomerCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	@Deprecated
	public Customer update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Customer update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Customer.class, this.id), params, Customer.class, options);
	}

	@Deprecated
	public DeletedCustomer delete(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		RequestOptions result = null;
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public DeletedCustomer delete(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE, instanceURL(Customer.class, this.id), null, DeletedCustomer.class, options);
	}

	// Use `(Card)customer.getSources().create(params)` instead.
	@Deprecated
	public Card createCard(String token, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public Card createCard(String token, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		Map<String, Object> postParams = new HashMap<String, Object>();
		postParams.put("card", token);

		return createCard(postParams, options);
	}

	@Deprecated
	public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public Card createCard(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/cards",
						instanceURL(Customer.class, this.id)), params, Card.class, options);
	}

	@Deprecated
	public Subscription createSubscription(Map<String, Object> params, String apiKey) throws AuthenticationException,
		InvalidRequestException, APIConnectionException, CardException,
		APIException {
		return createSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Subscription createSubscription(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
		InvalidRequestException, APIConnectionException, CardException,
		APIException {
		return request(RequestMethod.POST, String.format("%s/subscriptions",
						instanceURL(Customer.class, this.id)), params, Subscription.class, options);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	@Deprecated
	public Subscription updateSubscription(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return updateSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public Subscription updateSubscription(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.POST, String.format("%s/subscription",
						instanceURL(Customer.class, this.id)), params, Subscription.class, options);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	@Deprecated
	public Subscription cancelSubscription(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancelSubscription(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Subscription cancelSubscription(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancelSubscription(null, options);
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	@Deprecated
	public Subscription cancelSubscription(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancelSubscription(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Subscription cancelSubscription(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, String.format("%s/subscription",
						instanceURL(Customer.class, this.id)), params, Subscription.class, options);
	}

	@Deprecated
	public void deleteDiscount(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		deleteDiscount(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public void deleteDiscount(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		request(RequestMethod.DELETE, String.format("%s/discount",
						instanceURL(Customer.class, this.id)), null, Discount.class, options);
	}

}
