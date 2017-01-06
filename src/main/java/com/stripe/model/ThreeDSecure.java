package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ThreeDSecure extends APIResource implements HasId {
	String id;
	String object;
	Long amount;
	Boolean authenticated;
	Card card;
	Long created;
	String currency;
	Boolean livemode;
	@SerializedName("redirect_url")
	String redirectURL;
	String status;

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

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
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

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getRedirectURL()
	{
		return redirectURL;
	}

	public void setRedirectURL(String redirectURL)
	{
		this.redirectURL = redirectURL;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static ThreeDSecure create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static ThreeDSecure create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, getClassURL(), params, ThreeDSecure.class, options);
	}

	public static ThreeDSecure retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static ThreeDSecure retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, getInstanceURL(id), null, ThreeDSecure.class, options);
	}

	private static String getClassURL() {
		return String.format("%s/v1/%s", Stripe.getApiBase(), "3d_secure");
	}

	private static String getInstanceURL(String id) {
		if (id != null || id.isEmpty()) {
			return String.format("%s/%s", getClassURL(), id);
		}
		return null;
	}
}
