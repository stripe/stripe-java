package com.stripe.model;

import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Token extends APIResource {
	Integer amount;
	Long created;
	String currency;
	String id;
	String livemode;
	Boolean used;
	Card card;
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Long getCreated() {
		return created;
	}
	
	public void setCreated(Long created) {
		this.created = created;
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
	
	public String getLivemode() {
		return livemode;
	}
	
	public void setLivemode(String livemode) {
		this.livemode = livemode;
	}
	
	public Boolean getUsed() {
		return used;
	}
	
	public void setUsed(Boolean used) {
		this.used = used;
	}
	
	public Card getCard() {
		return card;
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	public static Token create(Map<String, Object> params) throws StripeException {
		return request(RequestMethod.POST, classURL(Token.class), params, Token.class);
	}

	public static Token retrieve(String id) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Token.class, id), null, Token.class);
	}
}
