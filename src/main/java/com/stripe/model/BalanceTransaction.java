package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
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
  Long amount;

  /** The date the transaction's net funds will become available in the Stripe balance. */
  Long availableOn;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  String description;

  BigDecimal exchangeRate;

  /** Fees (in %s) paid for this transaction. */
  Long fee;

  /** Detailed breakdown of fees (in %s) paid for this transaction. */
  List<Fee> feeDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** Net amount of the transaction, in %s. */
  Long net;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** The Stripe object to which this transaction is related. */
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransactionSource> source;

  /**
   * If the transaction's net funds are available in the Stripe balance yet. Either `available` or
   * `pending`.
   */
  String status;

  /**
   * Transaction type: `adjustment`, `advance`, `advance_funding`, `application_fee`,
   * `application_fee_refund`, `charge`, `connect_collection_transfer`,
   * `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_transaction`,
   * `payment`, `payment_failure_refund`, `payment_refund`, `payout`, `payout_cancel`,
   * `payout_failure`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`,
   * `stripe_fee`, `stripe_fx_fee`, `tax_fee`, `topup`, `topup_reversal`, `transfer`,
   * `transfer_cancel`, `transfer_failure`, or `transfer_refund`. [Learn
   * more](https://stripe.com/docs/reporting/balance-transaction-types) about balance transaction
   * types and what they represent.
   */
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
   */
  public static BalanceTransactionCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   */
  public static BalanceTransactionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/balance/history");
    return requestCollection(url, params, BalanceTransactionCollection.class, options);
  }

  /** Retrieves the balance transaction with the given ID. */
  public static BalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the balance transaction with the given ID. */
  public static BalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the balance transaction with the given ID. */
  public static BalanceTransaction retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format("%s%s", Stripe.getApiBase(), String.format("/v1/balance/history/%s", id));
    return request(ApiResource.RequestMethod.GET, url, params, BalanceTransaction.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fee extends StripeObject {
    /** Amount of the fee, in cents. */
    Long amount;

    String application;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    String currency;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    String description;

    /** Type of the fee, one of: `application_fee`, `stripe_fee` or `tax`. */
    String type;
  }
}
