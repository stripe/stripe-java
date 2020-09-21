// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FeeRefund extends ApiResource
    implements MetadataStore<FeeRefund>, BalanceTransactionSource {
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

  /** ID of the application fee that was refunded. */
  @SerializedName("fee")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ApplicationFee> fee;

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
   * <p>Equal to {@code fee_refund}.
   */
  @SerializedName("object")
  String object;

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

  /** Get ID of expandable {@code fee} object. */
  public String getFee() {
    return (this.fee != null) ? this.fee.getId() : null;
  }

  public void setFee(String id) {
    this.fee = ApiResource.setExpandableFieldId(id, this.fee);
  }

  /** Get expanded {@code fee}. */
  public ApplicationFee getFeeObject() {
    return (this.fee != null) ? this.fee.getExpanded() : null;
  }

  public void setFeeObject(ApplicationFee expandableObject) {
    this.fee = new ExpandableField<ApplicationFee>(expandableObject.getId(), expandableObject);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  @Override
  public FeeRefund update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  @Override
  public FeeRefund update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/application_fees/%s/refunds/%s",
                ApiResource.urlEncodeId(this.getFee()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(FeeRefundUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(FeeRefundUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/application_fees/%s/refunds/%s",
                ApiResource.urlEncodeId(this.getFee()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
  }
}
