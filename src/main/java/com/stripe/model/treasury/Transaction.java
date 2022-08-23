// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.treasury.TransactionListParams;
import com.stripe.param.treasury.TransactionRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Transactions represent changes to a <a
 * href="https://stripe.com/docs/api#financial_accounts">FinancialAccount's</a> balance.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource implements HasId {
  /** Amount (in cents) transferred. */
  @SerializedName("amount")
  Long amount;

  /** Change to a FinancialAccount's balance. */
  @SerializedName("balance_impact")
  BalanceImpact balanceImpact;

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
   * A list of TransactionEntries that are part of this Transaction. This cannot be expanded in any
   * list endpoints.
   */
  @SerializedName("entries")
  TransactionEntryCollection entries;

  /** The FinancialAccount associated with this object. */
  @SerializedName("financial_account")
  String financialAccount;

  /** ID of the flow that created the Transaction. */
  @SerializedName("flow")
  String flow;

  /** Details of the flow that created the Transaction. */
  @SerializedName("flow_details")
  FlowDetails flowDetails;

  /**
   * Type of the flow that created the Transaction.
   *
   * <p>One of {@code credit_reversal}, {@code debit_reversal}, {@code inbound_transfer}, {@code
   * issuing_authorization}, {@code other}, {@code outbound_payment}, {@code outbound_transfer},
   * {@code received_credit}, or {@code received_debit}.
   */
  @SerializedName("flow_type")
  String flowType;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code treasury.transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of the Transaction.
   *
   * <p>One of {@code open}, {@code posted}, or {@code void}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Retrieves a list of Transaction objects. */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of Transaction objects. */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/transactions");
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }

  /** Retrieves a list of Transaction objects. */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of Transaction objects. */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/transactions");
    return ApiResource.requestCollection(url, params, TransactionCollection.class, options);
  }

  /** Retrieves the details of an existing Transaction. */
  public static Transaction retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing Transaction. */
  public static Transaction retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing Transaction. */
  public static Transaction retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/transactions/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /** Retrieves the details of an existing Transaction. */
  public static Transaction retrieve(
      String id, TransactionRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/transactions/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /** Change to a FinancialAccount's balance. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceImpact extends StripeObject {
    /** The change made to funds the user can spend right now. */
    @SerializedName("cash")
    Long cash;

    /**
     * The change made to funds that are not spendable yet, but will become available at a later
     * time.
     */
    @SerializedName("inbound_pending")
    Long inboundPending;

    /**
     * The change made to funds in the account, but not spendable because they are being held for
     * pending outbound flows.
     */
    @SerializedName("outbound_pending")
    Long outboundPending;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Timestamp describing when the Transaction changed status to {@code posted}. */
    @SerializedName("posted_at")
    Long postedAt;

    /** Timestamp describing when the Transaction changed status to {@code void}. */
    @SerializedName("void_at")
    Long voidAt;
  }
}
