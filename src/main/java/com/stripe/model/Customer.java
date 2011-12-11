package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Customer extends APIResource {
	Long created;
	String id;
	String livemode;
	String description;
	Card activeCard;
	String email;
	String plan;
	Long trialEnd;
	Discount discount;
	NextRecurringCharge nextRecurringCharge;
	Subscription subscription;

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

	public String getLivemode() {
		return livemode;
	}

	public void setLivemode(String livemode) {
		this.livemode = livemode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Card getActiveCard() {
		return activeCard;
	}

	public void setActiveCard(Card activeCard) {
		this.activeCard = activeCard;
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

	public static Customer create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(Customer.class), params, Customer.class);
	}

	public static Customer retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Customer.class, id), null, Customer.class);
	}
	
	public static CustomerCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Customer.class), params, CustomerCollection.class);
	}
	
	public Customer update(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, instanceURL(Customer.class, this.id), params, Customer.class);
	}
	
	public DeletedCustomer delete() throws StripeException { 
		return request(RequestMethod.DELETE, instanceURL(Customer.class, this.id), null, DeletedCustomer.class);
	}
	
	public Subscription updateSubscription(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST,
				String.format("%s/subscription", instanceURL(Customer.class, this.id)),
				params, Subscription.class);
	}
	
	public Subscription cancelSubscription() throws StripeException {
		return cancelSubscription(null);
	}
	
	public Subscription cancelSubscription(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.DELETE,
				String.format("%s/subscription", instanceURL(Customer.class, this.id)),
				params, Subscription.class);
	}
}