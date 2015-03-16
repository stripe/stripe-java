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

public class Customer extends APIResource implements MetadataStore<Customer> {
	Long created;
	String id;
	Boolean livemode;
	Boolean deleted;
	String description;
	String defaultCard;
	String defaultSource;
	String email;
	Long trialEnd;
	Discount discount;
	NextRecurringCharge nextRecurringCharge;
	CustomerSubscriptionCollection subscriptions;
	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	Subscription subscription;
	Boolean delinquent;
	Integer accountBalance;
	String currency;
	CustomerCardCollection cards;
	PaymentSourceCollection sources;
	Map<String, String> metadata;

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultCard() {
		return defaultCard;
	}

	public void setDefaultCard(String defaultCard) {
		this.defaultCard = defaultCard;
	}

	public String getDefaultSource() {
		return defaultSource;
	}

	public void setDefaultSource(String defaultSource) {
		this.defaultSource = defaultSource;
	}

	public CustomerCardCollection getCards() {
		return cards;
	}

	public PaymentSourceCollection getSources() {
		return sources;
	}

	public void setSources(PaymentSourceCollection sources) {
		this.sources = sources;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTrialEnd() {
		return trialEnd;
	}

	public void setTrialEnd(Long trialEnd) {
		this.trialEnd = trialEnd;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public NextRecurringCharge getNextRecurringCharge() {
		return nextRecurringCharge;
	}

	public void setNextRecurringCharge(NextRecurringCharge nextRecurringCharge) {
		this.nextRecurringCharge = nextRecurringCharge;
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public Subscription getSubscription() {
		return subscription;
	}

	/** 1/2014: Legacy (from before multiple subscriptions per customer) */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public CustomerSubscriptionCollection getSubscriptions() {
		return subscriptions;
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

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
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

	public static CustomerCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, (RequestOptions) null);
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

	@Deprecated
	public static CustomerCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return all(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static CustomerCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.GET, classURL(Customer.class), params, CustomerCollection.class, options);
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

	@Deprecated
	public Card createCard(String token, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, RequestOptions.builder().setApiKey(apiKey).build());
	}
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
