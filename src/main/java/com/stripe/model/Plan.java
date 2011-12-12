package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Plan extends APIResource {
	Integer amount;
	String currency;
	String id;
	String interval;
	String name;
	String livemode;
	Integer trialPeriodDays;
	
	public static Plan create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(Plan.class), params, Plan.class);
	}

	public static Plan retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Plan.class, id), null, Plan.class);
	}

	public static Plan update(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, instanceURL(Plan.class, this.id), params, Plan.class);
	}
	
	public static PlanCollection all(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.GET, classURL(Plan.class), params, PlanCollection.class);
	}
	
	public DeletedPlan delete() throws StripeException { 
		return request(RequestMethod.DELETE, instanceURL(Plan.class, this.id), null, DeletedPlan.class);
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

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLivemode() {
		return livemode;
	}

	public void setLivemode(String livemode) {
		this.livemode = livemode;
	}

	public Integer getTrialPeriodDays() {
		return trialPeriodDays;
	}

	public void setTrialPeriodDays(Integer trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}
}