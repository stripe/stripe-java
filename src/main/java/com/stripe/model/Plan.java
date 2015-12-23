package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Plan extends APIResource implements MetadataStore<Plan>, HasId {

	Integer amount;
	String currency;
	String id;
	Long created;
	String interval;
	Integer intervalCount;
	String name;
	Boolean livemode;
	Integer trialPeriodDays;
	Map<String, String> metadata;
	String statementDescriptor;
	@Deprecated
	String statementDescription;

	public static Plan create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Plan retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public Plan update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public DeletedPlan delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete((RequestOptions) null);
	}

	@Deprecated
	public static Plan create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Plan create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Plan.class), params, Plan.class, options);
	}

	@Deprecated
	public static Plan retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Plan retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Plan.class, id), null, Plan.class, options);
	}

	@Deprecated
	public Plan update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Plan update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Plan.class, this.id), params, Plan.class, options);
	}

	public static PlanCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	public static PlanCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(Plan.class), params, PlanCollection.class, options);
	}

	@Deprecated
	public static PlanCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static PlanCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static PlanCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, options);
	}

	@Deprecated
	public DeletedPlan delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return delete(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public DeletedPlan delete(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.DELETE, instanceURL(Plan.class, this.id), null, DeletedPlan.class, options);
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public Integer getIntervalCount() {
		return intervalCount;
	}

	public void setIntervalCount(Integer intervalCount) {
		this.intervalCount = intervalCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Integer getTrialPeriodDays() {
		return trialPeriodDays;
	}

	public void setTrialPeriodDays(Integer trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public void setStatementDescriptor(String statementDescriptor) {
		this.statementDescriptor = statementDescriptor;
	}

	@Deprecated
	public String getStatementDescription() {
		return statementDescription;
	}

	@Deprecated
	public void setStatementDescription(String statementDescription) {
		this.statementDescription = statementDescription;
	}
}
