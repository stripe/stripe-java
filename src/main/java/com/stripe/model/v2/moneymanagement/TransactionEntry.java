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
 * TransactionEntries represent individual money movements across different states within a
 * Transaction.
 */
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

  /** The delta to the FinancialAccount's balance. */
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

  /** Details copied from the transaction that this TransactionEntry belongs to. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionDetails extends StripeObject {
    /**
     * Closed Enum for now, and will be turned into an Open Enum soon. A descriptive category used
     * to classify the Transaction.
     *
     * <p>One of {@code adjustment}, {@code advance}, {@code anticipation_repayment}, {@code
     * balance_transfer}, {@code charge}, {@code charge_failure}, {@code climate_order_purchase},
     * {@code climate_order_refund}, {@code connect_collection_transfer}, {@code
     * connect_reserved_funds}, {@code contribution}, {@code currency_conversion}, {@code
     * dispute_reversal}, {@code financing_paydown}, {@code financing_paydown_reversal}, {@code
     * inbound_transfer}, {@code inbound_transfer_reversal}, {@code issuing_dispute}, {@code
     * issuing_dispute_fraud_liability_debit}, {@code issuing_dispute_provisional_credit}, {@code
     * issuing_dispute_provisional_credit_reversal}, {@code minimum_balance_hold}, {@code
     * network_cost}, {@code obligation}, {@code outbound_payment}, {@code
     * outbound_payment_reversal}, {@code outbound_transfer}, {@code outbound_transfer_reversal},
     * {@code partial_capture_reversal}, {@code payment_network_reserved_funds}, {@code
     * platform_earning}, {@code platform_earning_refund}, {@code platform_fee}, {@code
     * received_credit}, {@code received_credit_reversal}, {@code received_debit}, {@code
     * received_debit_reversal}, {@code refund_failure}, {@code return}, {@code
     * risk_reserved_funds}, {@code stripe_balance_payment_debit}, {@code
     * stripe_balance_payment_debit_reversal}, {@code stripe_fee}, {@code stripe_fee_tax}, {@code
     * transfer_reversal}, or {@code unreconciled_customer_funds}.
     */
    @SerializedName("category")
    String category;

    /** Indicates the FinancialAccount affected by this Transaction. */
    @SerializedName("financial_account")
    String financialAccount;

    /** Details about the Flow object that created the Transaction. */
    @SerializedName("flow")
    Flow flow;

    /** Details about the Flow object that created the Transaction. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Flow extends StripeObject {
      /** If applicable, the ID of the Adjustment that created this Transaction. */
      @SerializedName("adjustment")
      String adjustment;

      /** If applicable, the ID of the Application Fee that created this Transaction. */
      @SerializedName("application_fee")
      String applicationFee;

      /** If applicable, the ID of the Application Fee Refund that created this Transaction. */
      @SerializedName("application_fee_refund")
      String applicationFeeRefund;

      /** If applicable, the ID of the Charge that created this Transaction. */
      @SerializedName("charge")
      String charge;

      /**
       * In the future, this will be the ID of the currency conversion that created this
       * Transaction. For now, this field is always null.
       */
      @SerializedName("currency_conversion")
      String currencyConversion;

      /** If applicable, the ID of the Dispute that created this Transaction. */
      @SerializedName("dispute")
      String dispute;

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

      /** If applicable, the ID of the Payout that created this Transaction. */
      @SerializedName("payout")
      String payout;

      /** If applicable, the ID of the ReceivedCredit that created this Transaction. */
      @SerializedName("received_credit")
      String receivedCredit;

      /** If applicable, the ID of the ReceivedDebit that created this Transaction. */
      @SerializedName("received_debit")
      String receivedDebit;

      /** If applicable, the ID of the Refund that created this Transaction. */
      @SerializedName("refund")
      String refund;

      /** If applicable, the ID of the Reserve Hold that created this Transaction. */
      @SerializedName("reserve_hold")
      String reserveHold;

      /** If applicable, the ID of the Reserve Release that created this Transaction. */
      @SerializedName("reserve_release")
      String reserveRelease;

      /** If applicable, the ID of the Topup that created this Transaction. */
      @SerializedName("topup")
      String topup;

      /** If applicable, the ID of the Transfer that created this Transaction. */
      @SerializedName("transfer")
      String transfer;

      /** If applicable, the ID of the Transfer Reversal that created this Transaction. */
      @SerializedName("transfer_reversal")
      String transferReversal;

      /**
       * Open Enum. Type of the flow that created the Transaction. The field matching this value
       * will contain the ID of the flow.
       *
       * <p>One of {@code adjustment}, {@code application_fee}, {@code application_fee_refund},
       * {@code charge}, {@code currency_conversion}, {@code dispute}, {@code fee_transaction},
       * {@code inbound_transfer}, {@code outbound_payment}, {@code outbound_transfer}, {@code
       * payout}, {@code received_credit}, {@code received_debit}, {@code refund}, {@code
       * reserve_hold}, {@code reserve_release}, {@code topup}, {@code transfer}, or {@code
       * transfer_reversal}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
