package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Event extends APIResource implements HasId {
	String id;
	String object;
	String account;
	String apiVersion;
	Long created;
	EventData data;
	Boolean livemode;
	Integer pendingWebhooks;
	EventRequest request;
	String type;
	String userId;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public EventData getData() {
		return data;
	}

	public void setData(EventData data) {
		this.data = data;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Integer getPendingWebhooks() {
		return pendingWebhooks;
	}

	public void setPendingWebhooks(Integer pendingWebhooks) {
		this.pendingWebhooks = pendingWebhooks;
	}

	public EventRequest getRequest() {
		return request;
	}

	public void setRequest(EventRequest request) {
		this.request = request;
	}

	public String getType() {
		return type;
	}

	public void setType(String name) {
		this.type = name;
	}

	/** Legacy; use `getAccount` instead (https://stripe.com/docs/upgrades#2017-05-25) */
	@Deprecated
	public String getUserId() {
		return userId;
	}

	/** Legacy; use `setAccount` instead (https://stripe.com/docs/upgrades#2017-05-25) */
	@Deprecated
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static Event retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	@Deprecated
	public static Event retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static Event retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Event.class, id), null, Event.class, options);
	}

	public static EventCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static EventCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(Event.class), params, EventCollection.class, options);
	}

	@Deprecated
	public static EventCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static EventCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static EventCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, options);
	}
}
