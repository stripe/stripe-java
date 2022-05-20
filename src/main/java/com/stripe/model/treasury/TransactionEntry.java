// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.treasury.TransactionEntryListParams;
import com.stripe.param.treasury.TransactionEntryRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionEntry extends ApiResource implements HasId {
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

  /** When the TransactionEntry will impact the FinancialAccount's balance. */
  @SerializedName("effective_at")
  Long effectiveAt;

  /** The FinancialAccount associated with this object. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Token of the flow associated with the TransactionEntry. */
  @SerializedName("flow")
  String flow;

  /** Details of the flow associated with the TransactionEntry. */
  @SerializedName("flow_details")
  FlowDetails flowDetails;

  /**
   * Type of the flow associated with the TransactionEntry.
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
   * <p>Equal to {@code treasury.transaction_entry}.
   */
  @SerializedName("object")
  String object;

  /** The Transaction associated with this object. */
  @SerializedName("transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transaction> transaction;

  /**
   * The specific money movement that generated the TransactionEntry.
   *
   * <p>One of {@code credit_reversal}, {@code credit_reversal_posting}, {@code debit_reversal},
   * {@code inbound_transfer}, {@code inbound_transfer_return}, {@code issuing_authorization_hold},
   * {@code issuing_authorization_release}, {@code other}, {@code outbound_payment}, {@code
   * outbound_payment_cancellation}, {@code outbound_payment_failure}, {@code
   * outbound_payment_posting}, {@code outbound_payment_return}, {@code outbound_transfer}, {@code
   * outbound_transfer_cancellation}, {@code outbound_transfer_failure}, {@code
   * outbound_transfer_posting}, {@code outbound_transfer_return}, {@code received_credit}, or
   * {@code received_debit}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code transaction} object. */
  public String getTransaction() {
    return (this.transaction != null) ? this.transaction.getId() : null;
  }

  public void setTransaction(String id) {
    this.transaction = ApiResource.setExpandableFieldId(id, this.transaction);
  }

  /** Get expanded {@code transaction}. */
  public Transaction getTransactionObject() {
    return (this.transaction != null) ? this.transaction.getExpanded() : null;
  }

  public void setTransactionObject(Transaction expandableObject) {
    this.transaction = new ExpandableField<Transaction>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves a TransactionEntry object. */
  public static TransactionEntry retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a TransactionEntry object. */
  public static TransactionEntry retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a TransactionEntry object. */
  public static TransactionEntry retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/transaction_entries/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, TransactionEntry.class, options);
  }

  /** Retrieves a TransactionEntry object. */
  public static TransactionEntry retrieve(
      String id, TransactionEntryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/treasury/transaction_entries/%s", ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, TransactionEntry.class, options);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/transaction_entries");
    return ApiResource.requestCollection(url, params, TransactionEntryCollection.class, options);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(TransactionEntryListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(
      TransactionEntryListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/transaction_entries");
    return ApiResource.requestCollection(url, params, TransactionEntryCollection.class, options);
  }

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
}
