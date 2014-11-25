package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class Subscription extends APIResource implements MetadataStore<Subscription>{
	String id;
	Long currentPeriodEnd;
	Long currentPeriodStart;
	Boolean cancelAtPeriodEnd;
	String customer;
	Long start;
	String status;
	Long trialStart;
	Long trialEnd;
	Plan plan;
	Long canceledAt;
	Long endedAt;
	Integer quantity;
	Discount discount;
	Double applicationFeePercent;
	Map<String, String> metadata;

	public Subscription update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.getDefault());
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
		return request(RequestMethod.POST, this.getInstanceURL(), params, Subscription.class, options);
	}

	public Subscription cancel(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return cancel(params, RequestOptions.getDefault());
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
		return request(RequestMethod.DELETE, this.getInstanceURL(), params, Subscription.class, options);
	}

	public void deleteDiscount() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		deleteDiscount(RequestOptions.getDefault());
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
		request(RequestMethod.DELETE, String.format("%s/discount", this.getInstanceURL()), null, Discount.class, options);
	}

	public String getInstanceURL() {
		return String.format("%s/%s/subscriptions/%s", classURL(Customer.class), this.getCustomer(), this.getId());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;

	}
}
