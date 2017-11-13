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

public class Transfer extends APIResource implements MetadataStore<Transfer>, HasId {
	@Getter @Setter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	@Getter @Setter
	Long amountReversed;
	@Getter @Setter
	@Deprecated
	String applicationFee;
	ExpandableField<BalanceTransaction> balanceTransaction;
	@Getter @Setter
	BankAccount bankAccount;
	@Getter @Setter
	Long created;
	@Getter @Setter
	String currency;
	@Getter @Setter
	Long date;
	@Getter @Setter
	@Deprecated
	String description;
	ExpandableField<Account> destination;
	ExpandableField<Charge> destinationPayment;
	@Getter @Setter
	@Deprecated
	String failureCode;
	@Getter @Setter
	@Deprecated
	String failureMessage;
	@Getter @Setter
	Boolean livemode;
	@Getter @Setter
	Map<String, String> metadata;
	TransferReversalCollection reversals;
	@Getter @Setter
	Boolean reversed;
	ExpandableField<Charge> sourceTransaction;
	@Getter @Setter
	String sourceType;
	@Getter @Setter
	String statementDescriptor;
	@Getter @Setter
	@Deprecated
	String status;
	@Getter @Setter
	String transferGroup;
	@Getter @Setter
	@Deprecated
	String type;

	/**
	 * @deprecated Use `bankAccount` field (https://stripe.com/docs/upgrades#2014-05-19)
	 */
	@Getter @Setter
	@Deprecated
	BankAccount account;

	/**
	 * @deprecated Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Getter @Setter
	@Deprecated
	List<String> otherTransfers;
	@Getter @Setter
	@Deprecated
	String recipient;

	/**
	 * @deprecated Use `statementDescriptor` field (https://stripe.com/docs/upgrades#2014-12-17)
	 */
	@Getter @Setter
	@Deprecated
	String statementDescription;

	/**
	 * @deprecated Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Getter @Setter
	@Deprecated
	Summary summary;

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

	public Account getDestinationObject() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.getExpanded();
	}

	public void setDestinationObject(Account c) {
		this.destination = new ExpandableField<Account>(c.getId(), c);
	}

	public String getDestinationPayment() {
		if (this.destinationPayment == null) {
			return null;
		}
		return this.destinationPayment.getId();
	}

	public void setDestinationPayment(String destinationPaymentID) {
		this.destinationPayment = setExpandableFieldID(destinationPaymentID, this.destinationPayment);

	}

	public Charge getDestinationPaymentObject() {
		if (this.destinationPayment == null) {
			return null;
		}
		return this.destinationPayment.getExpanded();
	}

	public void setDestinationPaymentObject(Charge destinationPayment) {
		this.destinationPayment = new ExpandableField<Charge>(destinationPayment.getId(), destinationPayment);
	}

	public TransferReversalCollection getReversals() {
		if (reversals.getURL() == null) {
			reversals.setURL(String.format("/v1/transfers/%s/reversals", getId()));
		}
		return reversals;
	}

	@Deprecated
	public String getSourceTransaction() {
		if (this.sourceTransaction == null) {
			return null;
		}
		return this.sourceTransaction.getId();
	}

	@Deprecated
	public void setSourceTransaction(String sourceTransactionID) {
		this.sourceTransaction = setExpandableFieldID(sourceTransactionID, this.sourceTransaction);

	}

	@Deprecated
	public Charge getSourceTransactionObject() {
		if (this.sourceTransaction == null) {
			return null;
		}
		return this.sourceTransaction.getExpanded();
	}

	@Deprecated
	public void setSourceTransactionObject(Charge sourceTransaction) {
		this.sourceTransaction = new ExpandableField<Charge>(sourceTransaction.getId(), sourceTransaction);
	}

	public static Transfer create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, (RequestOptions) null);
	}

	public static Transfer retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	/**
	 * @deprecated Use Transfer.getReversals().create() instead of Transfer.cancel().
	 */
	@Deprecated
	public Transfer cancel()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancel((RequestOptions) null);
	}

	public Transfer update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public TransferTransactionCollection transactions(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return transactions(params, (RequestOptions) null);
	}

	@Deprecated
	public static Transfer create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return create(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static Transfer create(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, classURL(Transfer.class), params, Transfer.class, options);
	}

	@Deprecated
	public Transfer update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Transfer update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Transfer.class, this.id), params, Transfer.class, options);
	}

	@Deprecated
	public Transfer cancel(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return cancel(RequestOptions.builder().setApiKey(apiKey).build());
	}

	public Transfer cancel(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Transfer.class, this.id) + "/cancel", null, Transfer.class, options);
	}

	@Deprecated
	public static Transfer retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public static Transfer retrieve(String id, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Transfer.class, id), null, Transfer.class, options);
	}

	public static Transfer retrieve(String id, Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.GET, instanceURL(Transfer.class, id), params, Transfer.class, options);
	}

	public static TransferCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	public static TransferCollection list(Map<String, Object> params,
										  RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Transfer.class), params, TransferCollection.class, options);
	}

	@Deprecated
	public static TransferCollection all(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, null);
	}

	@Deprecated
	public static TransferCollection all(Map<String, Object> params,
										 String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	@Deprecated
	public static TransferCollection all(Map<String, Object> params,
										 RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	@Deprecated
	public TransferTransactionCollection transactions(
			Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return transactions(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public TransferTransactionCollection transactions(
			Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		String url = String.format("%s%s", instanceURL(Transfer.class, this.getId()), "/transactions");
		return requestCollection(url, params, TransferTransactionCollection.class, options);
	}
}
