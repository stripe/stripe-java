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
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

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
   * <p>Equal to `balance_transaction`.
   */
  @SerializedName("object")
  String object;

  /** The Stripe object to which this transaction is related. */
  @SerializedName("source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransactionSource> source;

  /**
   * If the transaction's net funds are available in the Stripe balance yet. Either `available` or
   * `pending`.
   */
  @SerializedName("status")
  String status;

  /**
   * Transaction type: `adjustment`, `advance`, `advance_funding`, `application_fee`,
   * `application_fee_refund`, `charge`, `connect_collection_transfer`,
   * `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_transaction`,
   * `payment`, `payment_failure_refund`, `payment_refund`, `payout`, `payout_cancel`,
   * `payout_failure`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`,
   * `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`,
   * `transfer_cancel`, `transfer_failure`, or `transfer_refund`. [Learn
   * more](https://stripe.com/docs/reports/balance-transaction-types) about balance transaction
   * types and what they represent.
   *
   * <p>One of `adjustment`, `advance`, `advance_funding`, `application_fee`,
   * `application_fee_refund`, `charge`, `connect_collection_transfer`,
   * `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_transaction`,
   * `payment`, `payment_failure_refund`, `payment_refund`, `payout`, `payout_cancel`,
   * `payout_failure`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`,
   * `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`,
   * `transfer_cancel`, `transfer_failure`, or `transfer_refund`.
   */
  @SerializedName("type")
  String type;

  /** Get id of expandable `source` object. */
  public String getSource() {
    return (this.source != null) ? this.source.getId() : null;
  }

  public void setSource(String id) {
    this.source = ApiResource.setExpandableFieldId(id, this.source);
  }

  /** Get expanded `source`. */
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

    @SerializedName("application")
    String application;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @SerializedName("currency")
    String currency;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /** Type of the fee, one of: `application_fee`, `stripe_fee` or `tax`. */
    @SerializedName("type")
    String type;
  }
}
