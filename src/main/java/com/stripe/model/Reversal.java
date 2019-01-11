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
public class Reversal extends ApiResource implements MetadataStore<Transfer>, HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<Refund> destinationPaymentRefund;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<Refund> sourceRefund;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> transfer;

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

  // <editor-fold desc="destinationPaymentRefund">
  public String getDestinationPaymentRefund() {
    return (this.destinationPaymentRefund != null) ? this.destinationPaymentRefund.getId() : null;
  }

  public void setDestinationPaymentRefund(String destinationPaymentRefundId) {
    this.destinationPaymentRefund = setExpandableFieldId(destinationPaymentRefundId,
        this.destinationPaymentRefund);
  }

  public Refund getDestinationPaymentRefundObject() {
    return (this.destinationPaymentRefund != null)
        ? this.destinationPaymentRefund.getExpanded() : null;
  }

  public void setDestinationPaymentRefundObject(Refund c) {
    this.destinationPaymentRefund = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="sourceRefund">
  public String getSourceRefund() {
    return (this.sourceRefund != null) ? this.sourceRefund.getId() : null;
  }

  public void setSourceRefund(String sourceRefundId) {
    this.sourceRefund = setExpandableFieldId(sourceRefundId, this.sourceRefund);
  }

  public Refund getSourceRefundObject() {
    return (this.sourceRefund != null) ? this.sourceRefund.getExpanded() : null;
  }

  public void setSourceRefundObject(Refund c) {
    this.sourceRefund = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="transfer">
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String transferId) {
    this.transfer = setExpandableFieldId(transferId, this.transfer);
  }

  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer c) {
    this.transfer = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a reversal.
   */
  @Override
  public Reversal update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a reversal.
   */
  @Override
  public Reversal update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, this.getInstanceUrl(), params, Reversal.class, options);
  }
  // </editor-fold>

  protected String getInstanceUrl() {
    if (this.transfer != null) {
      return String.format("%s/%s/reversals/%s", classUrl(Transfer.class), this.getTransfer(),
          this.getId());
    }
    return null;
  }
}
