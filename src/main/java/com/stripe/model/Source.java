package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.io.IOException;
import java.util.Map;

public class Source extends ExternalAccount {
	Long amount;
	String clientSecret;
	Long created;
	String currency;
	String flow;
	Boolean livemode;
	SourceOwner owner;
	String status;
	String usage;
	String type;

	// Flow-specific properties
	SourceReceiverFlow receiver;
	SourceRedirectFlow redirect;
	SourceVerificationFlow verification;

	// Type-specific properties
	Map<String, String> typeData;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
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

	public String getFlow() {
		return flow;
	}

	public void setFlow(String flow) {
		this.flow = flow;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public SourceOwner getOwner() {
		return owner;
	}

	public void setOwner(SourceOwner owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Flow-specific getters/setters

	public SourceReceiverFlow getReceiver() {
		return receiver;
	}

	public void setReceiver(SourceReceiverFlow receiver) {
		this.receiver = receiver;
	}

	public SourceRedirectFlow getRedirect() {
		return redirect;
	}

	public void setRedirect(SourceRedirectFlow redirect) {
		this.redirect = redirect;
	}

	public SourceVerificationFlow getVerification() {
		return verification;
	}

	public void setVerification(SourceVerificationFlow verification) {
		this.verification = verification;
	}

	// Type-specific getters/setters

	public Map<String, String> getTypeData() {
		return typeData;
	}

	public void setTypeData(Map<String, String> typeData) {
		this.typeData = typeData;
	}

	// APIResource methods

	public String getSourceInstanceURL()
			throws InvalidRequestException {
		if (this.getCustomer() != null) {
			return String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(), this.getId());
		} else {
			return instanceURL(Source.class, this.getId());
		}
	}

	public static Source create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Source create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Source.class), params, Source.class, options);
	}

	public static Source retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static Source retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Source.class, id), null, Source.class, options);
	}

	@Override
	public Source verify(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return verify(params, (RequestOptions) null);
	}

	@Override
	public Source verify(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/verify", this.getSourceInstanceURL()), params, Source.class, options);
	}

	@Override
	public Source update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	@Override
	public Source update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getSourceInstanceURL(), params, Source.class, options);
	}
}
