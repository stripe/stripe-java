// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionEntry extends StripeObject implements HasId {
  /** The delta to the FinancialAccount's balance. */
  @SerializedName("balance_impact")
  BalanceImpact balanceImpact;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Time at which the entry impacted (or will impact if it's in the future) the FinancialAccount
   * balance.
   */
  @SerializedName("effective_at")
  Instant effectiveAt;

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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.transaction_entry}.
   */
  @SerializedName("object")
  String object;

  /** The Transaction that this TransactionEntry belongs to. */
  @SerializedName("transaction")
  String transaction;

  /** Details copied from the transaction that this TransactionEntry belongs to. */
  @SerializedName("transaction_details")
  TransactionDetails transactionDetails;

  /**
   * For more details about BalanceImpact, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceImpact extends StripeObject {
    /** Impact to the available balance. */
    @SerializedName("available")
    Amount available;

    /** Impact to the inbound_pending balance. */
    @SerializedName("inbound_pending")
    Amount inboundPending;

    /** Impact to the outbound_pending balance. */
    @SerializedName("outbound_pending")
    Amount outboundPending;
  }

  /**
   * For more details about TransactionDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionDetails extends StripeObject {
    /**
     * Closed Enum for now, and will be turned into an Open Enum soon. A descriptive category used
     * to classify the Transaction.
     *
     * <p>One of {@code adjustment}, {@code currency_conversion}, {@code inbound_transfer}, {@code
     * outbound_payment}, {@code outbound_transfer}, {@code received_credit}, {@code
     * received_debit}, {@code return}, or {@code stripe_fee}.
     */
    @SerializedName("category")
    String category;

    /** Indicates the FinancialAccount affected by this Transaction. */
    @SerializedName("financial_account")
    String financialAccount;

    /** Details about the Flow object that created the Transaction. */
    @SerializedName("flow")
    Flow flow;

    /**
     * For more details about Flow, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Flow extends StripeObject {
      /** If applicable, the ID of the Adjustment that created this Transaction. */
      @SerializedName("adjustment")
      String adjustment;

      /**
       * In the future, this will be the ID of the currency conversion that created this
       * Transaction. For now, this field is always null.
       */
      @SerializedName("currency_conversion")
      String currencyConversion;

      /** If applicable, the ID of the FeeTransaction that created this Transaction. */
      @SerializedName("fee_transaction")
      String feeTransaction;

      /** If applicable, the ID of the InboundTransfer that created this Transaction. */
      @SerializedName("inbound_transfer")
      String inboundTransfer;

      /** If applicable, the ID of the OutboundPayment that created this Transaction. */
      @SerializedName("outbound_payment")
      String outboundPayment;

      /** If applicable, the ID of the OutboundTransfer that created this Transaction. */
      @SerializedName("outbound_transfer")
      String outboundTransfer;

      /** If applicable, the ID of the ReceivedCredit that created this Transaction. */
      @SerializedName("received_credit")
      String receivedCredit;

      /** If applicable, the ID of the ReceivedDebit that created this Transaction. */
      @SerializedName("received_debit")
      String receivedDebit;

      /**
       * Open Enum. Type of the flow that created the Transaction. The field matching this value
       * will contain the ID of the flow.
       *
       * <p>One of {@code adjustment}, {@code currency_conversion}, {@code fee_transaction}, {@code
       * inbound_transfer}, {@code outbound_payment}, {@code outbound_transfer}, {@code
       * received_credit}, or {@code received_debit}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
