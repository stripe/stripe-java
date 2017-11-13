package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;


public class Subscription extends APIResource implements MetadataStore<Subscription>, HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Double applicationFeePercent;
	@Getter @Setter
	String billing;
	@Getter @Setter
	Boolean cancelAtPeriodEnd;
	@Getter @Setter
	Long canceledAt;
	@Getter @Setter
	Long created;
	@Getter @Setter
	Long currentPeriodEnd;
	@Getter @Setter
	Long currentPeriodStart;
	ExpandableField<Customer> customer;
	@Getter @Setter
	Integer daysUntilDue;
	@Getter @Setter
	Discount discount;
	@Getter @Setter
	Long endedAt;
	@Getter @Setter
	SubscriptionItemCollection subscriptionItems; // Previously items
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	Plan plan;
	@Getter @Setter
	Integer quantity;
	@Getter @Setter
	Long start;
	@Getter @Setter
	String status;
	@Getter @Setter
	Double taxPercent;
	@Getter @Setter
	Long trialEnd;
	@Getter @Setter
	Long trialStart;

	public String getCustomer() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getId();
	}

	public void setCustomer(String customerID) {
		this.customer = setExpandableFieldID(customerID, this.customer);
	}

	public Customer getCustomerObject() {
		if (this.customer == null) {
			return null;
		}
		return this.customer.getExpanded();
	}

	public void setCustomerObject(Customer c) {
		this.customer = new ExpandableField<Customer>(c.getId(), c);
	}

	@Deprecated
	public static SubscriptionCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static SubscriptionCollection all(Map<String, Object> params,
											 RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	public static Subscription create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Subscription create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Subscription.class), params, Subscription.class, options);
	}

	public static SubscriptionCollection list(Map<String, Object> params)
			throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, null);
	}

	public static SubscriptionCollection list(Map<String, Object> params,
											  RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Subscription.class), params, SubscriptionCollection.class, options);
	}

	public static Subscription retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public static Subscription retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Subscription.class, id), null, Subscription.class, options);
	}

	public static Subscription retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Subscription.class, id), params, Subscription.class, options);
	}

	public Subscription update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	@Deprecated
	public Subscription update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Subscription update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Subscription.class, id), params, Subscription.class, options);
	}

	public Subscription cancel(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancel(params, (RequestOptions) null);
	}

	@Deprecated
	public Subscription cancel(Map<String, Object> params, String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancel(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Subscription cancel(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, instanceURL(Subscription.class, id), params, Subscription.class, options);
	}

	public void deleteDiscount() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		deleteDiscount((RequestOptions) null);
	}

	@Deprecated
	public void deleteDiscount(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		RequestOptions result = null;
		if (apiKey != null) {
			result = RequestOptions.builder().setApiKey(apiKey).build();
		}
		deleteDiscount(result);
	}

	public void deleteDiscount(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		request(RequestMethod.DELETE, String.format("%s/discount", instanceURL(Subscription.class, id)), null, Discount.class, options);
	}
}
