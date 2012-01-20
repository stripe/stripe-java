package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Notification extends APIResource {
	String id;
	String event;
	String livemode;
	Long created;
	Map<String, Object> data;

	public static Notification retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Notification.class, id), null, Notification.class);
	}

	public static NotificationCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Notification.class), params, NotificationCollection.class);
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
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

	public String getEvent() {
		return name;
	}

	public void setEvent(String name) {
		this.event = name;
	}

	public String getLivemode() {
		return livemode;
	}

	public void setLivemode(String livemode) {
		this.livemode = livemode;
	}

}