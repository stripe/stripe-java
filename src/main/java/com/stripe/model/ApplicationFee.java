package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ApplicationFee extends APIResource implements HasId {
	String id;
	String object;
	String account;
	Long amount;
	Long amountRefunded;
	String application;
	String balanceTransaction;
	String charge;
	Long created;
	String currency;
	Boolean livemode;
	String originatingTransaction;
	Boolean refunded;
	FeeRefundCollection refunds;

	@Deprecated
	String user;

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

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Long amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
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

	public String getOriginatingTransaction() {
		return originatingTransaction;
	}

	public void setOriginatingTransaction(String originatingTransaction) {
		this.originatingTransaction = originatingTransaction;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

	public FeeRefundCollection getRefunds() {
		// API versions 2014-07-26 and earlier render charge refunds as an array
		// instead of an object, meaning there is no sublist URL.
		if (refunds.getURL() == null) {
			refunds.setURL(String.format("/v1/application_fees/%s/refunds", getId()));
		}

		return refunds;
	}

	/**
	 * @deprecated
	 * Use `account` field (https://stripe.com/docs/upgrades#2013-12-03)
	 */
	@Deprecated
	public String getUser() {
		return user;
	}

	/**
	 * @deprecated
	 * Use `account` field (https://stripe.com/docs/upgrades#2013-12-03)
	 */
	@Deprecated
	public void setUser(String user) {
		this.user = user;
	}

	public static ApplicationFee retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}
	@Deprecated
	public static ApplicationFee retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static ApplicationFee retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(ApplicationFee.class, id), null, ApplicationFee.class, options);
	}

	public static ApplicationFeeCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	public static ApplicationFeeCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return requestCollection(classURL(ApplicationFee.class), params, ApplicationFeeCollection.class, options);
	}

	@Deprecated
	public static ApplicationFeeCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static ApplicationFeeCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static ApplicationFeeCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, options);
	}


	public ApplicationFee refund() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.refund(null, (RequestOptions) null);
	}
	public ApplicationFee refund(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return this.refund(params, (RequestOptions) null);
	}
	@Deprecated
	public ApplicationFee refund(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return this.refund(RequestOptions.builder().setApiKey(apiKey).build());
	}
	public ApplicationFee refund(RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return refund(null, options);
	}
	@Deprecated
	public ApplicationFee refund(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return refund(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public ApplicationFee refund(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/refund",
						instanceURL(ApplicationFee.class, this.getId())), params, ApplicationFee.class, options);
	}
}
