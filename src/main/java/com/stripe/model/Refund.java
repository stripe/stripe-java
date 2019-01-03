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
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> failureBalanceTransaction;
  String failureReason;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  String reason;
  String receiptNumber;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<Reversal> sourceTransferReversal;
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Reversal> transferReversal;

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
    this.balanceTransaction = new ExpandableField<>(c.getId(), c);
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
    this.charge = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="failureBalanceTransaction">
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
  }

  public void setFailureBalanceTransaction(String failureBalanceTransactionId) {
    this.failureBalanceTransaction = setExpandableFieldId(failureBalanceTransactionId,
        this.failureBalanceTransaction);
  }

  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null)
        ? this.failureBalanceTransaction.getExpanded() : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction c) {
    this.failureBalanceTransaction = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="sourceTransferReversal">
  public String getSourceTransferReversal() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getId() : null;
  }

  public void setSourceTransferReversal(String sourceTransferReversalId) {
    this.sourceTransferReversal = setExpandableFieldId(sourceTransferReversalId,
        this.sourceTransferReversal);
  }

  public Reversal getSourceTransferReversalObject() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getExpanded() : null;
  }

  public void setSourceTransferReversalObject(Reversal c) {
    this.sourceTransferReversal = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="transferReversal">
  public String getTransferReversal() {
    return (this.transferReversal != null) ? this.transferReversal.getId() : null;
  }

  public void setTransferReversal(String transferReversalId) {
    this.transferReversal = setExpandableFieldId(transferReversalId, this.transferReversal);
  }

  public Reversal getTransferReversalObject() {
    return (this.transferReversal != null) ? this.transferReversal.getExpanded() : null;
  }

  public void setTransferReversalObject(Reversal c) {
    this.transferReversal = new ExpandableField<>(c.getId(), c);
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
    return retrieve(id, null, options);
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
