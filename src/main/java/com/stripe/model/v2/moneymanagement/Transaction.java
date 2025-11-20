// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Use Transactions to view changes to your FinancialAccount balance over time. Every flow that
 * moves money, such as OutboundPayments or ReceivedCredits, will have one or more Transactions that
 * describes how the flow impacted your balance. Note that while the FinancialAccount balance will
 * always be up to date, be aware that Transactions and TransactionEntries are created shortly after
 * to reflect changes.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends StripeObject implements HasId {
  /** The amount of the Transaction. */
  @SerializedName("amount")
  Amount amount;

  /**
   * The delta to the FinancialAccount's balance. The balance_impact for the Transaction is equal to
   * sum of its TransactionEntries that have {@code effective_at}s in the past.
   */
  @SerializedName("balance_impact")
  BalanceImpact balanceImpact;

  /**
   * Open Enum. A descriptive category used to classify the Transaction.
   *
   * <p>One of {@code adjustment}, {@code currency_conversion}, {@code inbound_transfer}, {@code
   * outbound_payment}, {@code outbound_transfer}, {@code received_credit}, {@code received_debit},
   * {@code return}, or {@code stripe_fee}.
   */
  @SerializedName("category")
  String category;

  /**
   * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Indicates the FinancialAccount affected by this Transaction. */
  @SerializedName("financial_account")
  String financialAccount;

  /** Details about the Flow object that created the Transaction. */
  @SerializedName("flow")
  Flow flow;

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
   * <p>Equal to {@code v2.money_management.transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * Closed Enum. Current status of the Transaction. A Transaction is {@code pending} if either
   * {@code balance_impact.inbound_pending} or {@code balance_impact.outbound_pending} is non-zero.
   * A Transaction is {@code posted} if only {@code balance_impact.available} is non-zero. A
   * Transaction is {@code void} if there is no balance impact. {@code posted} and {@code void} are
   * terminal states, and no additional entries will be added to the Transaction.
   *
   * <p>One of {@code pending}, {@code posted}, or {@code void}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for when the Transaction transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The amount of the Transaction. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A non-negative integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
     */
    @SerializedName("value")
    Long value;
  }

  /**
   * The delta to the FinancialAccount's balance. The balance_impact for the Transaction is equal to
   * sum of its TransactionEntries that have {@code effective_at}s in the past.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceImpact extends StripeObject {
    /** Impact to the available balance. */
    @SerializedName("available")
    Available available;

    /** Impact to the inbound_pending balance. */
    @SerializedName("inbound_pending")
    InboundPending inboundPending;

    /** Impact to the outbound_pending balance. */
    @SerializedName("outbound_pending")
    OutboundPending outboundPending;

    /** Impact to the available balance. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Available extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      @SerializedName("value")
      Long value;
    }

    /** Impact to the inbound_pending balance. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InboundPending extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      @SerializedName("value")
      Long value;
    }

    /** Impact to the outbound_pending balance. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OutboundPending extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * A non-negative integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
       */
      @SerializedName("value")
      Long value;
    }
  }

  /** Details about the Flow object that created the Transaction. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Flow extends StripeObject {
    /** If applicable, the ID of the Adjustment that created this Transaction. */
    @SerializedName("adjustment")
    String adjustment;

    /**
     * In the future, this will be the ID of the currency conversion that created this Transaction.
     * For now, this field is always null.
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
     * Open Enum. Type of the flow that created the Transaction. The field matching this value will
     * contain the ID of the flow.
     *
     * <p>One of {@code adjustment}, {@code currency_conversion}, {@code fee_transaction}, {@code
     * inbound_transfer}, {@code outbound_payment}, {@code outbound_transfer}, {@code
     * received_credit}, or {@code received_debit}.
     */
    @SerializedName("type")
    String type;
  }

  /** Timestamps for when the Transaction transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The time at which the Transaction became posted. Only present if status == posted. */
    @SerializedName("posted_at")
    Instant postedAt;

    /** The time at which the Transaction became void. Only present if status == void. */
    @SerializedName("void_at")
    Instant voidAt;
  }
}
