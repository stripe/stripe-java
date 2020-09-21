// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TransferReversalUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransferReversal extends ApiResource
    implements MetadataStore<TransferReversal>, BalanceTransactionSource {
  /** Amount, in %s. */
  @SerializedName("amount")
  Long amount;

  /** Balance transaction that describes the impact on your account balance. */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** Linked payment refund for the transfer reversal. */
  @SerializedName("destination_payment_refund")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Refund> destinationPaymentRefund;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code transfer_reversal}.
   */
  @SerializedName("object")
  String object;

  /** ID of the refund responsible for the transfer reversal. */
  @SerializedName("source_refund")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Refund> sourceRefund;

  /** ID of the transfer that was reversed. */
  @SerializedName("transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> transfer;

  /** Get ID of expandable {@code balanceTransaction} object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded {@code balanceTransaction}. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code destinationPaymentRefund} object. */
  public String getDestinationPaymentRefund() {
    return (this.destinationPaymentRefund != null) ? this.destinationPaymentRefund.getId() : null;
  }

  public void setDestinationPaymentRefund(String id) {
    this.destinationPaymentRefund =
        ApiResource.setExpandableFieldId(id, this.destinationPaymentRefund);
  }

  /** Get expanded {@code destinationPaymentRefund}. */
  public Refund getDestinationPaymentRefundObject() {
    return (this.destinationPaymentRefund != null)
        ? this.destinationPaymentRefund.getExpanded()
        : null;
  }

  public void setDestinationPaymentRefundObject(Refund expandableObject) {
    this.destinationPaymentRefund =
        new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code sourceRefund} object. */
  public String getSourceRefund() {
    return (this.sourceRefund != null) ? this.sourceRefund.getId() : null;
  }

  public void setSourceRefund(String id) {
    this.sourceRefund = ApiResource.setExpandableFieldId(id, this.sourceRefund);
  }

  /** Get expanded {@code sourceRefund}. */
  public Refund getSourceRefundObject() {
    return (this.sourceRefund != null) ? this.sourceRefund.getExpanded() : null;
  }

  public void setSourceRefundObject(Refund expandableObject) {
    this.sourceRefund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code transfer} object. */
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String id) {
    this.transfer = ApiResource.setExpandableFieldId(id, this.transfer);
  }

  /** Get expanded {@code transfer}. */
  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer expandableObject) {
    this.transfer = new ExpandableField<Transfer>(expandableObject.getId(), expandableObject);
  }

  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  @Override
  public TransferReversal update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  @Override
  public TransferReversal update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/transfers/%s/reversals/%s",
                ApiResource.urlEncodeId(this.getTransfer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, TransferReversal.class, options);
  }

  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(TransferReversalUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified reversal by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>This request only accepts metadata and description as arguments.
   */
  public TransferReversal update(TransferReversalUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/transfers/%s/reversals/%s",
                ApiResource.urlEncodeId(this.getTransfer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, TransferReversal.class, options);
  }
}
