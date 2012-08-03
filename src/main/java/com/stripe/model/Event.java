package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Event extends APIResource {
	String id;
	String type;
	Boolean livemode;
	Long created;
	EventData data;
	Integer pendingWebhooks;

	public static Event retrieve(String id) throws StripeException {
		return retrieve(id, null);
	}

	public static EventCollection all(Map<String, Object> params) throws StripeException {
		return all(params, null);
	}

	public static Event retrieve(String id, String apiKey) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Event.class, id), null, Event.class, apiKey);
	}

	public static EventCollection all(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.GET, classURL(Event.class), params, EventCollection.class, apiKey);
	}

	public EventData getData() {
		return data;
	}

	public void setData(EventData data) {
		this.data = data;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String name) {
		this.type = name;
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
}
