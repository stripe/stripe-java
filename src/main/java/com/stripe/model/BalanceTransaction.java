// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceTransactionListParams;
import com.stripe.param.BalanceTransactionRetrieveParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Balance transactions represent funds moving through your Stripe account. Stripe creates them for
 * every type of transaction that enters or leaves your Stripe account balance.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/reports/balance-transaction-types">Balance
 * transaction types</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BalanceTransaction extends ApiResource implements HasId {
  /**
   * Gross amount of this transaction (in cents (or local equivalent)). A positive value represents
   * funds charged to another party, and a negative value represents funds sent to another party.
   */
  @SerializedName("amount")
  Long amount;

  /** The date that the transaction's net funds become available in the Stripe balance. */
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
   * If applicable, this transaction uses an exchange rate. If money converts from currency A to
   * currency B, then the {@code amount} in currency A, multipled by the {@code exchange_rate},
   * equals the {@code amount} in currency B. For example, if you charge a customer 10.00 EUR, the
   * PaymentIntent's {@code amount} is {@code 1000} and {@code currency} is {@code eur}. If this
   * converts to 12.34 USD in your Stripe account, the BalanceTransaction's {@code amount} is {@code
   * 1234}, its {@code currency} is {@code usd}, and the {@code exchange_rate} is {@code 1.234}.
   */
  @SerializedName("exchange_rate")
  BigDecimal exchangeRate;

  /**
   * Fees (in cents (or local equivalent)) paid for this transaction. Represented as a positive
   * integer when assessed.
   */
  @SerializedName("fee")
  Long fee;

  /** Detailed breakdown of fees (in cents (or local equivalent)) paid for this transaction. */
  @SerializedName("fee_details")
  List<BalanceTransaction.FeeDetail> feeDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Net impact to a Stripe balance (in cents (or local equivalent)). A positive value represents
   * incrementing a Stripe balance, and a negative value decrementing a Stripe balance. You can
   * calculate the net impact of a transaction on a balance by {@code amount} - {@code fee}
   */
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
   * Learn more about how <a href="https://stripe.com/docs/reports/reporting-categories">reporting
   * categories</a> can help you understand balance transactions from an accounting perspective.
   */
  @SerializedName("reporting_category")
  String reportingCategory;

  /** This transaction relates to the Stripe object. */
  @SerializedName("source")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransactionSource> source;

  /**
   * The transaction's net funds status in the Stripe balance, which are either {@code available} or
   * {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Transaction type: {@code adjustment}, {@code advance}, {@code advance_funding}, {@code
   * anticipation_repayment}, {@code application_fee}, {@code application_fee_refund}, {@code
   * charge}, {@code connect_collection_transfer}, {@code contribution}, {@code
   * issuing_authorization_hold}, {@code issuing_authorization_release}, {@code issuing_dispute},
   * {@code issuing_transaction}, {@code obligation_inbound}, {@code obligation_outbound}, {@code
   * obligation_reversal_inbound}, {@code obligation_reversal_outbound}, {@code obligation_payout},
   * {@code obligation_payout_failure}, {@code payment}, {@code payment_failure_refund}, {@code
   * payment_refund}, {@code payment_reversal}, {@code payout}, {@code payout_cancel}, {@code
   * payout_failure}, {@code refund}, {@code refund_failure}, {@code reserve_transaction}, {@code
   * reserved_funds}, {@code stripe_fee}, {@code stripe_fx_fee}, {@code tax_fee}, {@code topup},
   * {@code topup_reversal}, {@code transfer}, {@code transfer_cancel}, {@code transfer_failure}, or
   * {@code transfer_refund}. Learn more about <a
   * href="https://stripe.com/docs/reports/balance-transaction-types">balance transaction types and
   * what they represent</a>. To classify transactions for accounting purposes, consider {@code
   * reporting_category} instead.
   *
   * <p>One of {@code adjustment}, {@code advance}, {@code advance_funding}, {@code
   * anticipation_repayment}, {@code application_fee}, {@code application_fee_refund}, {@code
   * charge}, {@code connect_collection_transfer}, {@code contribution}, {@code
   * issuing_authorization_hold}, {@code issuing_authorization_release}, {@code issuing_dispute},
   * {@code issuing_transaction}, {@code obligation_inbound}, {@code obligation_outbound}, {@code
   * obligation_payout}, {@code obligation_payout_failure}, {@code obligation_reversal_inbound},
   * {@code obligation_reversal_outbound}, {@code payment}, {@code payment_failure_refund}, {@code
   * payment_refund}, {@code payment_reversal}, {@code payout}, {@code payout_cancel}, {@code
   * payout_failure}, {@code refund}, {@code refund_failure}, {@code reserve_transaction}, {@code
   * reserved_funds}, {@code stripe_fee}, {@code stripe_fx_fee}, {@code tax_fee}, {@code topup},
   * {@code topup_reversal}, {@code transfer}, {@code transfer_cancel}, {@code transfer_failure}, or
   * {@code transfer_refund}.
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
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
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
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public static BalanceTransactionCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/balance_transactions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            BalanceTransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of transactions that have contributed to the Stripe account balance (e.g.,
   * charges, transfers, and so forth). The transactions are returned in sorted order, with the most
   * recent transactions appearing first.
   *
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
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
   * <p>Note that this endpoint was previously called “Balance history” and used the path {@code
   * /v1/balance/history}.
   */
  public static BalanceTransactionCollection list(
      BalanceTransactionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/balance_transactions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            BalanceTransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public static BalanceTransaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public static BalanceTransaction retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public static BalanceTransaction retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/balance_transactions/%s", ApiResource.urlEncodeId(id));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            BalanceTransaction.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the balance transaction with the given ID.
   *
   * <p>Note that this endpoint previously used the path {@code /v1/balance/history/:id}.
   */
  public static BalanceTransaction retrieve(
      String id, BalanceTransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/balance_transactions/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            BalanceTransaction.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FeeDetail extends StripeObject {
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(source, responseGetter);
  }
}
