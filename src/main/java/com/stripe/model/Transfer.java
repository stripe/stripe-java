package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class Transfer extends APIResource implements MetadataStore<Transfer>, HasId {
	String id;
	String object;
	Long amount;
	Long amountReversed;
	String applicationFee;
	String balanceTransaction;
	BankAccount bankAccount;
	Long created;
	String currency;
	Long date;
	String description;
	String destination;
	String destinationPayment;
	String failureCode;
	String failureMessage;
	Boolean livemode;
	Map<String, String> metadata;
	TransferReversalCollection reversals;
	Boolean reversed;
	String sourceTransaction;
	String sourceType;
	String statementDescriptor;
	String status;
	String transferGroup;
	String type;

	@Deprecated
	BankAccount account;
	@Deprecated
	List<String> otherTransfers;
	@Deprecated
	String recipient;
	@Deprecated
	String statementDescription;
	@Deprecated
	Summary summary;

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

	public Long getAmountReversed() {
		return amountReversed;
	}

	public void setAmountReversed(Long amountReversed) {
		this.amountReversed = amountReversed;
	}

	public String getApplicationFee() {
		return applicationFee;
	}

	public void setApplicationFee(String applicationFee) {
		this.applicationFee = applicationFee;
	}

	public String getBalanceTransaction() {
		return balanceTransaction;
	}

	public void setBalanceTransaction(String balanceTransaction) {
		this.balanceTransaction = balanceTransaction;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
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

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestinationPayment() {
		return destinationPayment;
	}

	public void setDestinationPayment(String destinationPayment) {
		this.destinationPayment = destinationPayment;
	}

	public String getFailureCode() {
		return failureCode;
	}

	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	public TransferReversalCollection getReversals() {
		if (reversals.getURL() == null) {
			reversals.setURL(String.format("/v1/transfers/%s/reversals", getId()));
		}
		return reversals;
	}

	public Boolean getReversed() {
		return reversed;
	}

	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	public String getSourceTransaction() {
		return sourceTransaction;
	}

	public void setSourceTransaction(String sourceTransaction) {
		this.sourceTransaction = sourceTransaction;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getStatementDescriptor() {
		return statementDescriptor;
	}

	public void setStatementDescriptor(String statementDescriptor) {
		this.statementDescriptor = statementDescriptor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferGroup() {
		return this.transferGroup;
	}

	public void setTransferGroup(String transferGroup) {
		this.transferGroup = transferGroup;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @deprecated
	 * Use `bank_account` field (https://stripe.com/docs/upgrades#2014-05-19)
	 */
	@Deprecated
	public BankAccount getAccount() {
		return account;
	}

	/**
	 * @deprecated
	 * Use `bank_account` field (https://stripe.com/docs/upgrades#2014-05-19)
	 */
	@Deprecated
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	/**
	 * @deprecated
	 * Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Deprecated
	public List<String> getOtherTransfers() {
		return otherTransfers;
	}

	/**
	 * @deprecated
	 * Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Deprecated
	public void setOtherTransfers(List<String> otherTransfers) {
		this.otherTransfers = otherTransfers;
	}

	@Deprecated
	public String getRecipient() {
		return recipient;
	}

	@Deprecated
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	/**
	 * @deprecated
	 * Use `statement_descriptor` field (https://stripe.com/docs/upgrades#2014-12-17)
	 */
	@Deprecated
	public String getStatementDescription() {
		return statementDescription;
	}

	/**
	 * @deprecated
	 * Use `statement_descriptor` field (https://stripe.com/docs/upgrades#2014-12-17)
	 */
	@Deprecated
	public void setStatementDescription(String statementDescription) {
		this.statementDescription = statementDescription;
	}

	/**
	 * @deprecated
	 * Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Deprecated
	public Summary getSummary() {
		return summary;
	}

	/**
	 * @deprecated
	 * Use the balance history endpoint (https://stripe.com/docs/upgrades#2014-08-04)
	 */
	@Deprecated
	public void setSummary(Summary summary) {
		this.summary = summary;
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
	 * @deprecated
	 * Use Transfer.getReversals().create() instead of Transfer.cancel().
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

	public static TransferCollection list(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return list(params, (RequestOptions) null);
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
		return list(params, (RequestOptions) null);
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
