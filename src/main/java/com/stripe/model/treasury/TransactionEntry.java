// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.model.issuing.Authorization;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.TransactionEntryListParams;
import com.stripe.param.treasury.TransactionEntryRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * TransactionEntries represent individual units of money movements within a single <a
 * href="https://api.stripe.com#transactions">Transaction</a>.
 */
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

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/transaction_entries";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TransactionEntryCollection.class);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(TransactionEntryListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Retrieves a list of TransactionEntry objects. */
  public static TransactionEntryCollection list(
      TransactionEntryListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/transaction_entries";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TransactionEntryCollection.class);
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
    String path = String.format("/v1/treasury/transaction_entries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, TransactionEntry.class);
  }

  /** Retrieves a TransactionEntry object. */
  public static TransactionEntry retrieve(
      String id, TransactionEntryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/transaction_entries/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, TransactionEntry.class);
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

  /**
   * For more details about FlowDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FlowDetails extends StripeObject {
    /**
     * You can reverse some <a href="https://api.stripe.com#received_credits">ReceivedCredits</a>
     * depending on their network and source flow. Reversing a ReceivedCredit leads to the creation
     * of a new object known as a CreditReversal.
     */
    @SerializedName("credit_reversal")
    CreditReversal creditReversal;

    /**
     * You can reverse some <a href="https://api.stripe.com#received_debits">ReceivedDebits</a>
     * depending on their network and source flow. Reversing a ReceivedDebit leads to the creation
     * of a new object known as a DebitReversal.
     */
    @SerializedName("debit_reversal")
    DebitReversal debitReversal;

    /**
     * Use <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/into/inbound-transfers">InboundTransfers</a>
     * to add funds to your <a href="https://api.stripe.com#financial_accounts">FinancialAccount</a>
     * via a PaymentMethod that is owned by you. The funds will be transferred via an ACH debit.
     *
     * <p>Related guide: <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/into/inbound-transfers">Moving
     * money with Treasury using InboundTransfer objects</a>
     */
    @SerializedName("inbound_transfer")
    InboundTransfer inboundTransfer;

    /**
     * When an <a href="https://docs.stripe.com/issuing">issued card</a> is used to make a purchase,
     * an Issuing {@code Authorization} object is created. <a
     * href="https://docs.stripe.com/issuing/purchases/authorizations">Authorizations</a> must be
     * approved for the purchase to be completed successfully.
     *
     * <p>Related guide: <a href="https://docs.stripe.com/issuing/purchases/authorizations">Issued
     * card authorizations</a>
     */
    @SerializedName("issuing_authorization")
    Authorization issuingAuthorization;

    /**
     * Use <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-payments">OutboundPayments</a>
     * to send funds to another party's external bank account or <a
     * href="https://api.stripe.com#financial_accounts">FinancialAccount</a>. To send money to an
     * account belonging to the same user, use an <a
     * href="https://api.stripe.com#outbound_transfers">OutboundTransfer</a>.
     *
     * <p>Simulate OutboundPayment state changes with the {@code
     * /v1/test_helpers/treasury/outbound_payments} endpoints. These methods can only be called on
     * test mode objects.
     *
     * <p>Related guide: <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-payments">Moving
     * money with Treasury using OutboundPayment objects</a>
     */
    @SerializedName("outbound_payment")
    OutboundPayment outboundPayment;

    /**
     * Use <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers">OutboundTransfers</a>
     * to transfer funds from a <a
     * href="https://api.stripe.com#financial_accounts">FinancialAccount</a> to a PaymentMethod
     * belonging to the same entity. To send funds to a different party, use <a
     * href="https://api.stripe.com#outbound_payments">OutboundPayments</a> instead. You can send
     * funds over ACH rails or through a domestic wire transfer to a user's own external bank
     * account.
     *
     * <p>Simulate OutboundTransfer state changes with the {@code
     * /v1/test_helpers/treasury/outbound_transfers} endpoints. These methods can only be called on
     * test mode objects.
     *
     * <p>Related guide: <a
     * href="https://docs.stripe.com/docs/treasury/moving-money/financial-accounts/out-of/outbound-transfers">Moving
     * money with Treasury using OutboundTransfer objects</a>
     */
    @SerializedName("outbound_transfer")
    OutboundTransfer outboundTransfer;

    /**
     * ReceivedCredits represent funds sent to a <a
     * href="https://api.stripe.com#financial_accounts">FinancialAccount</a> (for example, via ACH
     * or wire). These money movements are not initiated from the FinancialAccount.
     */
    @SerializedName("received_credit")
    ReceivedCredit receivedCredit;

    /**
     * ReceivedDebits represent funds pulled from a <a
     * href="https://api.stripe.com#financial_accounts">FinancialAccount</a>. These are not
     * initiated from the FinancialAccount.
     */
    @SerializedName("received_debit")
    ReceivedDebit receivedDebit;

    /**
     * Type of the flow that created the Transaction. Set to the same value as {@code flow_type}.
     *
     * <p>One of {@code credit_reversal}, {@code debit_reversal}, {@code inbound_transfer}, {@code
     * issuing_authorization}, {@code other}, {@code outbound_payment}, {@code outbound_transfer},
     * {@code received_credit}, or {@code received_debit}.
     */
    @SerializedName("type")
    String type;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(balanceImpact, responseGetter);
    trySetResponseGetter(flowDetails, responseGetter);
    trySetResponseGetter(transaction, responseGetter);
  }
}
