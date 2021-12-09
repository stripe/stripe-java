// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BalanceTransactionListParams;
import com.stripe.param.BalanceTransactionRetrieveParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceTransaction extends ApiResource implements HasId {
  /** Gross amount of the transaction, in %s. */
  @SerializedName("amount")
  Long amount;

  /** The date the transaction's net funds will become available in the Stripe balance. */
  @SerializedName("available_on")
  Long availableOn;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The exchange rate used, if applicable, for this transaction. Specifically, if money was
   * converted from currency A to currency B, then the {@code amount} in currency A, times {@code
   * exchange_rate}, would be the {@code amount} in currency B. For example, suppose you charged a
   * customer 10.00 EUR. Then the PaymentIntent's {@code amount} would be {@code 1000} and {@code
   * currency} would be {@code eur}. Suppose this was converted into 12.34 USD in your Stripe
   * account. Then the BalanceTransaction's {@code amount} would be {@code 1234}, {@code currency}
   * would be {@code usd}, and {@code exchange_rate} would be {@code 1.234}.
   */
  @SerializedName("exchange_rate")
  BigDecimal exchangeRate;

  /** Fees (in %s) paid for this transaction. */
  @SerializedName("fee")
  Long fee;

  /** Detailed breakdown of fees (in %s) paid for this transaction. */
  @SerializedName("fee_details")
  List<BalanceTransaction.Fee> feeDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Net amount of the transaction, in %s. */
  @SerializedName("net")
  Long net;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code balance_transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * <a href="https://stripe.com/docs/reports/reporting-categories">Learn more</a> about how
   * reporting categories can help you understand balance transactions from an accounting
   * perspective.
   */
  @SerializedName("reporting_category")
  String reportingCategory;

  /** The Stripe object to which this transaction is related. */
  @SerializedName("source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransactionSource> source;

  /**
   * If the transaction's net funds are available in the Stripe balance yet. Either {@code
   * available} or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Transaction type: {@code adjustment}, {@code advance}, {@code advance_funding}, {@code
   * anticipation_repayment}, {@code application_fee}, {@code application_fee_refund}, {@code
   * charge}, {@code connect_collection_transfer}, {@code contribution}, {@code
   * issuing_authorization_hold}, {@code issuing_authorization_release}, {@code issuing_dispute},
   * {@code issuing_transaction}, {@code payment}, {@code payment_failure_refund}, {@code
   * payment_refund}, {@code payout}, {@code payout_cancel}, {@code payout_failure}, {@code refund},
   * {@code refund_failure}, {@code reserve_transaction}, {@code reserved_funds}, {@code
   * stripe_fee}, {@code stripe_fx_fee}, {@code tax_fee}, {@code topup}, {@code topup_reversal},
   * {@code transfer}, {@code transfer_cancel}, {@code transfer_failure}, or {@code
   * transfer_refund}. <a href="https://stripe.com/docs/reports/balance-transaction-types">Learn
   * more</a> about balance transaction types and what they represent. If you are looking to
   * classify transactions for accounting purposes, you might want to consider {@code
   * reporting_category} instead.
   *
   * <p>One of {@code adjustment}, {@code advance}, {@code advance_funding}, {@code
   * anticipation_repayment}, {@code application_fee}, {@code application_fee_refund}, {@code
   * charge}, {@code connect_collection_transfer}, {@code contribution}, {@code
   * issuing_authorization_hold}, {@code issuing_authorization_release}, {@code issuing_dispute},
   * {@code issuing_transaction}, {@code payment}, {@code payment_failure_refund}, {@code
   * payment_refund}, {@code payout}, {@code payout_cancel}, {@code payout_failure}, {@code refund},
   * {@code refund_failure}, {@code reserve_transaction}, {@code reserved_funds}, {@code
   * stripe_fee}, {@code stripe_fx_fee}, {@code tax_fee}, {@code topup}, {@code topup_reversal},
   * {@code transfer}, {@code transfer_cancel}, {@code transfer_failure}, or {@code
   * transfer_refund}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code source} object. */
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String id) {
    this.source = ApiResource.setExpandableFieldId(id, this.source);
  }

  /** Get expanded {@code source}. */
  public BalanceTransactionSource getSourceObject() {
    return (this.source != null) ? this.source.getExpanded() : null;
  }

  public void setSourceObject(BalanceTransactionSource expandableObject) {
    this.source =
        new ExpandableField<BalanceTransactionSource>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path <code>
   * /v1/balance/history</code>.
   */
  public static BalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path <code>
   * /v1/balance/history</code>.
   */
  public static BalanceTransactionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance_transactions");
    return ApiResource.requestCollection(url, params, BalanceTransactionCollection.class, options);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path <code>
   * /v1/balance/history</code>.
   */
  public static BalanceTransactionCollection list(BalanceTransactionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path <code>
   * /v1/balance/history</code>.
   */
  public static BalanceTransactionCollection list(
      BalanceTransactionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance_transactions");
    return ApiResource.requestCollection(url, params, BalanceTransactionCollection.class, options);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path <code>/v1/balance/history/:id</code>.
   */
  public static BalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path <code>/v1/balance/history/:id</code>.
   */
  public static BalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path <code>/v1/balance/history/:id</code>.
   */
  public static BalanceTransaction retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/balance_transactions/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, BalanceTransaction.class, options);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path <code>/v1/balance/history/:id</code>.
   */
  public static BalanceTransaction retrieve(
      String id, BalanceTransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/balance_transactions/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, BalanceTransaction.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fee extends StripeObject {
    /** Amount of the fee, in cents. */
    @SerializedName("amount")
    Long amount;

    /** ID of the Connect application that earned the fee. */
    @SerializedName("application")
    String application;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /** Type of the fee, one of: {@code application_fee}, {@code stripe_fee} or {@code tax}. */
    @SerializedName("type")
    String type;
  }
}
