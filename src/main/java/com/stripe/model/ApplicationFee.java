package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ApplicationFee extends APIResource {
	Integer amount;
	Long created;
	String currency;
	String id;
	Boolean livemode;
	Boolean refunded;
	Integer amountRefunded;
	String account;
	String user;
	String application;
	String charge;
	FeeRefundCollection refunds;
	String balanceTransaction;

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

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

	public Integer getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Integer amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public FeeRefundCollection getRefunds() {
		// API versions 2014-07-26 and earlier render charge refunds as an array
		// instead of an object, meaning there is no sublist URL.
		if (refunds.getURL() == null) {
			refunds.setURL(String.format("/v1/application_fees/%s/refunds", getId()));
		}

		return refunds;
	}

	public String getBalanceTransaction() {
		return balanceTransaction;
	}

	public void setBalanceTransaction(String balanceTransaction) {
		this.balanceTransaction = balanceTransaction;
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

	public static ApplicationFeeCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, (RequestOptions) null);
	}
	@Deprecated
	public static ApplicationFeeCollection all(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return all(params, RequestOptions.builder().setApiKey(apiKey).build());
	}
	public static ApplicationFeeCollection all(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, classURL(ApplicationFee.class), params, ApplicationFeeCollection.class, options);
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
