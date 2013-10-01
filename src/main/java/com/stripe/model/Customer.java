package com.stripe.model;

import java.util.HashMap;
import java.util.Map;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;

public class Customer extends APIResource implements MetadataStore<Customer> {
	Long created;
	String id;
	Boolean livemode;
	Boolean deleted;
	String description;
	String defaultCard;
	String email;
	String plan;
	Long trialEnd;
	Discount discount;
	NextRecurringCharge nextRecurringCharge;
	Subscription subscription;
	Boolean delinquent;
	Integer accountBalance;
	CustomerCardCollection cards;
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

	public CustomerCardCollection getCards() {
		return cards;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
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

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
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

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public static Customer create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Customer retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public static CustomerCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, null);
	}

	public Customer update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public DeletedCustomer delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(null);
	}

	public Card createCard(String token) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(token, null);
	}

	public Card createCard(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return createCard(params, null);
	}

	public Subscription updateSubscription(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return updateSubscription(params, null);
	}

	public Subscription cancelSubscription() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancelSubscription(null, null);
	}

	public Subscription cancelSubscription(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancelSubscription(params, null);
	}

	public void deleteDiscount() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		deleteDiscount(null);
	}

	public static Customer create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Customer.class), params,
				Customer.class, apiKey);
	}

	public static Customer retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Customer.class, id),
				null, Customer.class, apiKey);
	}

	public static CustomerCollection all(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.GET, classURL(Customer.class), params,
				CustomerCollection.class, apiKey);
	}

	public Customer update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST,
				instanceURL(Customer.class, this.id), params, Customer.class,
				apiKey);
	}

	public DeletedCustomer delete(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.DELETE,
				instanceURL(Customer.class, this.id), null,
				DeletedCustomer.class, apiKey);
	}

	public Card createCard(String token, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		Map<String, Object> postParams = new HashMap<String, Object>();
		postParams.put("card", token);

		return createCard(postParams, apiKey);
	}

	public Card createCard(Map<String, Object> params, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(
				RequestMethod.POST,
				String.format("%s/cards",
						instanceURL(Customer.class, this.id)), params,
				Card.class, apiKey);
	}

	public Subscription updateSubscription(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(
				RequestMethod.POST,
				String.format("%s/subscription",
						instanceURL(Customer.class, this.id)), params,
				Subscription.class, apiKey);
	}

	public Subscription cancelSubscription(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancelSubscription(null, apiKey);
	}

	public Subscription cancelSubscription(Map<String, Object> params,
			String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(
				RequestMethod.DELETE,
				String.format("%s/subscription",
						instanceURL(Customer.class, this.id)), params,
				Subscription.class, apiKey);
	}

	public void deleteDiscount(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		request(RequestMethod.DELETE,
				String.format("%s/discount",
						instanceURL(Customer.class, this.id)), null,
				Discount.class, apiKey);
	}

}
