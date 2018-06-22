package com.stripe.model;

import com.stripe.exception.StripeException;
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
public class Refund extends ApiResource implements MetadataStore<Charge>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Charge> charge;
  Long created;
  String currency;
  String description;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String reason;
  String receiptNumber;
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

  // <editor-fold desc="charge">
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String chargeId) {
    this.charge = setExpandableFieldId(chargeId, this.charge);
  }

  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge c) {
    this.charge = new ExpandableField<Charge>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a refund.
   */
  public static Refund create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a refund.
   */
  public static Refund create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Refund.class), params, Refund.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all refunds.
   */
  public static RefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all refunds.
   */
  public static RefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Refund.class), params, RefundCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a refund.
   */
  public static Refund retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a refund.
   */
  public static Refund retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Refund.class, id), null, Refund.class, options);
  }

  /**
   * Retrieve a refund.
   */
  public static Refund retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Refund.class, id), params, Refund.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a refund.
   */
  @Override
  public Refund update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a refund.
   */
  @Override
  public Refund update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Refund.class, id), params, Refund.class,
        options);
  }
  // </editor-fold>
}
