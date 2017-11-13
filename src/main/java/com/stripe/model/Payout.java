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

import java.util.List;
import java.util.Map;

public class Payout extends APIResource implements MetadataStore<Payout>, HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long arrivalDate;
	ExpandableField<BalanceTransaction> balanceTransaction;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	ExpandableField<ExternalAccount> destination;
	ExpandableField<BalanceTransaction> failureBalanceTransaction;
	@Getter @Setter
	String failureCode;
	@Getter @Setter
	String failureMessage;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	@Getter @Setter
	String method;
	@Getter @Setter
	String sourceType;
	@Getter @Setter
	String statementDescriptor;
	@Getter @Setter
	String status;
	@Getter @Setter
	String type;

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

	public String getDestination() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.getId();
	}

	public void setDestination(String destinationID) {
		this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
	}

	public ExternalAccount getDestinationObject() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.getExpanded();
	}

	public void setDestinationObject(ExternalAccount c) {
		this.destination = new ExpandableField<ExternalAccount>(c.getId(), c);
	}

	public String getFailureBalanceTransaction() {
		if (this.failureBalanceTransaction == null) {
			return null;
		}
		return this.failureBalanceTransaction.getId();
	}

	public void setFailureBalanceTransaction(String failureBalanceTransactionID) {
		this.failureBalanceTransaction = setExpandableFieldID(failureBalanceTransactionID, this.failureBalanceTransaction);
	}

	public BalanceTransaction getFailureBalanceTransactionObject() {
		if (this.failureBalanceTransaction == null) {
			return null;
		}
		return this.failureBalanceTransaction.getExpanded();
	}

	public void setFailureBalanceTransactionObject(BalanceTransaction c) {
		this.failureBalanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
	}

	public Payout cancel()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancel(null);
	}

	public Payout cancel(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Payout.class, this.id) + "/cancel", null, Payout.class, options);
	}

	public static Payout create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, null);
	}

	public static Payout create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Payout.class), params, Payout.class, options);
	}

	public static PayoutCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static PayoutCollection list(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException, APIConnectionException,
			CardException, APIException {
		return requestCollection(classURL(Payout.class), params, PayoutCollection.class, options);
	}

	public static Payout retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, null);
	}

	public static Payout retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Payout.class, id), null, Payout.class, options);
	}

	public static Payout retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Payout.class, id), params, Payout.class, options);
	}

	public Payout update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, null);
	}

	public Payout update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Payout.class, this.id), params, Payout.class, options);
	}
}
