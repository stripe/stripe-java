package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Refund extends APIResource implements MetadataStore<Charge>, HasId {
	Integer amount;
	String currency;
	Long created;
	String balanceTransaction;
	String id;
	String charge;
	String reason;
	Map<String, String> metadata;

	public Refund update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public static Refund retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static RefundCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, (RequestOptions) null);
	}

	public static Refund create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	@Deprecated
	public Refund update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public Refund update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Refund.class, id), params, Refund.class, options);
	}

	public static Refund retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Refund.class, id), null, Refund.class, options);
	}

	public static RefundCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, classURL(Refund.class), params, RefundCollection.class, options);
	}

	public static Refund create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Refund.class), params, Refund.class, options);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public String getBalanceTransaction() {
		return balanceTransaction;
	}
	public void setBalanceTransaction(String balanceTransaction) {
		this.balanceTransaction = balanceTransaction;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
