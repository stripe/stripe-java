package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Payout extends APIResource implements MetadataStore<Payout>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long arrivalDate;
  Boolean automatic;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<ExternalAccount> destination;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> failureBalanceTransaction;
  String failureCode;
  String failureMessage;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String method;
  String sourceType;
  String statementDescriptor;
  String status;
  String type;

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="destination">
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String destinationID) {
    this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
  }

  public ExternalAccount getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(ExternalAccount c) {
    this.destination = new ExpandableField<ExternalAccount>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="failureBalanceTransaction">
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId()
        : null;
  }

  public void setFailureBalanceTransaction(String failureBalanceTransactionID) {
    this.failureBalanceTransaction
        = setExpandableFieldID(failureBalanceTransactionID, this.failureBalanceTransaction);
  }

  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getExpanded()
        : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction c) {
    this.failureBalanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="cancel">
  /**
   * Cancel a payout.
   */
  public Payout cancel()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel(null);
  }

  /**
   * Cancel a payout.
   */
  public Payout cancel(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Payout.class, this.id) + "/cancel", null,
        Payout.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a payout.
   */
  public static Payout create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create a payout.
   */
  public static Payout create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Payout.class), params, Payout.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all payouts.
   */
  public static PayoutCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all payouts.
   */
  public static PayoutCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return requestCollection(classURL(Payout.class), params, PayoutCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a payout.
   */
  public static Payout retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a payout.
   */
  public static Payout retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Payout.class, id), null, Payout.class, options);
  }

  /**
   * Retrieve a payout.
   */
  public static Payout retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Payout.class, id), params, Payout.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a payout.
   */
  @Override
  public Payout update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  /**
   * Update a payout.
   */
  @Override
  public Payout update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Payout.class, this.id), params, Payout.class,
        options);
  }
  // </editor-fold>
}
