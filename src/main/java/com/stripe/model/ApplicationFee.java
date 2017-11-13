package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class ApplicationFee extends APIResource implements HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	ExpandableField<Account> account;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long amountRefunded;
	ExpandableField<Application> application;
	ExpandableField<BalanceTransaction> balanceTransaction;
	ExpandableField<Charge> charge;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	Boolean livemode;
	ExpandableField<Charge> originatingTransaction;
	@Getter @Setter
	Boolean refunded;
	FeeRefundCollection refunds;

	/**
	 * @deprecated Use `account` field (https://stripe.com/docs/upgrades#2013-12-03)
	 */
	@Deprecated
	@Getter @Setter
	String user;

	public String getAccount() {
		if (this.account == null) {
			return null;
		}
		return this.account.getId();
	}

	public void setAccount(String accountID) {
		this.account = setExpandableFieldID(accountID, this.account);
	}

	public Account getAccountObject() {
		if (this.account == null) {
			return null;
		}
		return this.account.getExpanded();
	}

	public void setAccountObject(Account c) {
		this.account = new ExpandableField<Account>(c.getId(), c);
	}

	public String getApplication() {
		if (this.application == null) {
			return null;
		}
		return this.application.getId();
	}

	public void setApplication(String applicationID) {
		this.application = setExpandableFieldID(applicationID, this.application);
	}

	public Application getApplicationObject() {
		if (this.application == null) {
			return null;
		}
		return this.application.getExpanded();
	}

	public void setApplicationObject(Application c) {
		this.application = new ExpandableField<Application>(c.getId(), c);
	}

	public String getBalanceTransaction() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getId();
	}

	public void setBalanceTransaction(String balanceTransactionID) {
		this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
	}

	public BalanceTransaction getBalanceTransactionObject() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getExpanded();
	}

	public void setBalanceTransactionObject(BalanceTransaction c) {
		this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
	}

	public String getCharge() {
		if (this.charge == null) {
			return null;
		}
		return this.charge.getId();
	}

	public void setCharge(String chargeID) {
		this.charge = setExpandableFieldID(chargeID, this.charge);
	}

	public Charge getChargeObject() {
		if (this.charge == null) {
			return null;
		}
		return this.charge.getExpanded();
	}

	public void setChargeObject(Charge c) {
		this.charge = new ExpandableField<Charge>(c.getId(), c);
	}


	public String getOriginatingTransaction() {
		if (this.originatingTransaction == null) {
			return null;
		}
		return this.originatingTransaction.getId();
	}

	public void setOriginatingTransaction(String originatingTransactionID) {
		this.originatingTransaction = setExpandableFieldID(originatingTransactionID, this.originatingTransaction);
	}

	public Charge getOriginatingTransactionObject() {
		if (this.originatingTransaction == null) {
			return null;
		}
		return this.originatingTransaction.getExpanded();
	}

	public void setOriginatingTransactionObject(Charge c) {
		this.originatingTransaction = new ExpandableField<Charge>(c.getId(), c);
	}


	public FeeRefundCollection getRefunds() {
		// API versions 2014-07-26 and earlier render charge refunds as an array
		// instead of an object, meaning there is no sublist URL.
		if (refunds.getURL() == null) {
			refunds.setURL(String.format("/v1/application_fees/%s/refunds", getId()));
		}

		return refunds;
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
		return list(params, null);
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
		return list(params, null);
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
