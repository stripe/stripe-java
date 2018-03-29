package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Payout extends APIResource implements MetadataStore<Payout>, HasId {
  String id;
  String object;
  Long amount;
  Long arrivalDate;
  Boolean automatic;
  ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  ExpandableField<ExternalAccount> destination;
  ExpandableField<BalanceTransaction> failureBalanceTransaction;
  String failureCode;
  String failureMessage;
  Boolean livemode;
  Map<String, String> metadata;
  String method;
  String sourceType;
  String statementDescriptor;
  String status;
  String type;

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

  public Long getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(Long arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public Boolean getAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
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

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
