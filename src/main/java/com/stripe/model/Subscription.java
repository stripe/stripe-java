package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class Subscription extends APIResource implements MetadataStore<Subscription>, HasId {
	String id;
	Long currentPeriodEnd;
	Long currentPeriodStart;
	Boolean cancelAtPeriodEnd;
	String customer;
	Long start;
	Long created;
	String status;
	Long trialStart;
	Long trialEnd;
	Plan plan;
	Long canceledAt;
	Long endedAt;
	Integer quantity;
	Discount discount;
	Double applicationFeePercent;
	Double taxPercent;
	Map<String, String> metadata;

	public static Subscription create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Subscription create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Subscription.class), params, Subscription.class, options);
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

	public static Subscription retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static Subscription retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Subscription.class, id), null, Subscription.class, options);
	}

	public static SubscriptionCollection list(Map<String, Object> params)
			throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, (RequestOptions) null);
	}

	public static SubscriptionCollection list(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Subscription.class), params, SubscriptionCollection.class, options);
	}

	@Deprecated
	public static SubscriptionCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static SubscriptionCollection all(Map<String, Object> params,
			RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Long getCurrentPeriodEnd() {
		return currentPeriodEnd;
	}
	public void setCurrentPeriodEnd(Long currentPeriodEnd) {
		this.currentPeriodEnd = currentPeriodEnd;
	}
	public Long getCurrentPeriodStart() {
		return currentPeriodStart;
	}
	public void setCurrentPeriodStart(Long currentPeriodStart) {
		this.currentPeriodStart = currentPeriodStart;
	}
	public Boolean getCancelAtPeriodEnd() {
		return cancelAtPeriodEnd;
	}
	public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
		this.cancelAtPeriodEnd = cancelAtPeriodEnd;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Long getStart() {
		return start;
	}
	public void setStart(Long start) {
		this.start = start;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getTrialStart() {
		return trialStart;
	}
	public void setTrialStart(Long trialStart) {
		this.trialStart = trialStart;
	}
	public Long getTrialEnd() {
		return trialEnd;
	}
	public void setTrialEnd(Long trialEnd) {
		this.trialEnd = trialEnd;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public Long getCanceledAt() {
		return canceledAt;
	}
	public void setCanceledAt(Long canceledAt) {
		this.canceledAt = canceledAt;
	}
	public Long getEndedAt() {
		return endedAt;
	}
	public void setEndedAt(Long endedAt) {
		this.endedAt = endedAt;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public Double getApplicationFeePercent() {
		return applicationFeePercent;
	}
	public void setApplicationFeePercent(Double applicationFeePercent) {
		this.applicationFeePercent = applicationFeePercent;
	}
	public Double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
