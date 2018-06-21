package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Topup extends ApiResource implements MetadataStore<Topup>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Integer amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  String description;
  Long expectedAvailabilityDate;
  String failureCode;
  String failureMessage;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  Source source;
  String statementDescriptor;
  String status;

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionId) {
    this.balanceTransaction = setExpandableFieldId(balanceTransactionId, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a topup.
   */
  public static Topup create(Map<String, Object> params)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return create(params, null);
  }

  /**
   * Create a topup.
   */
  public static Topup create(Map<String, Object> params, RequestOptions options)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, classUrl(Topup.class), params, Topup.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all topups.
   */
  public static TopupCollection list(Map<String, Object> params)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return list(params, null);
  }

  /**
   * List all topups.
   */
  public static TopupCollection list(Map<String, Object> params, RequestOptions options)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return requestCollection(classUrl(Topup.class), params, TopupCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a topup.
   */
  public static Topup retrieve(String id) throws AuthenticationException,
          InvalidRequestException, ApiConnectionException, CardException,
          ApiException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a topup.
   */
  public static Topup retrieve(String id, RequestOptions options)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a topup.
   */
  public static Topup retrieve(String id, Map<String, Object> params, RequestOptions options)
          throws AuthenticationException, InvalidRequestException,
          ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Topup.class, id), params, Topup.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a topup.
   */
  @Override
  public Topup update(Map<String, Object> params) throws AuthenticationException,
      InvalidRequestException, ApiConnectionException, CardException, ApiException {
    return update(params, null);
  }

  /**
   * Update a topup.
   */
  @Override
  public Topup update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return request(RequestMethod.POST, instanceUrl(Topup.class, id), params, Topup.class, options);
  }
  // </editor-fold>
}
