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

/** TransactionEntries model funds moving between availability states for a given Transaction. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TransactionEntry extends StripeObject implements HasId {
  /**
   * The change to the FinancialAccount's balance that takes effect at this TransactionEntry's
   * {@code effective_at} timestamp.
   */
  @SerializedName("balance_impact")
  BalanceImpact balanceImpact;

  /**
   * Time at which the object was created. Represented as an RFC 3339 timestamp in UTC with
   * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /**
   * Time at which the TransactionEntry affects the FinancialAccount balance. This can be in the
   * past or future.
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

  /** The ID of the Transaction that this TransactionEntry belongs to. */
  @SerializedName("transaction")
  String transaction;

  /** Details copied from the Transaction that this TransactionEntry belongs to. */
  @SerializedName("transaction_details")
  TransactionDetails transactionDetails;

  /**
   * The change to the FinancialAccount's balance that takes effect at this TransactionEntry's
   * {@code effective_at} timestamp.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceImpact extends StripeObject {
    /** The change to the available balance. */
    @SerializedName("available")
    Amount available;

    /** The change to the {@code inbound_pending} balance. */
    @SerializedName("inbound_pending")
    Amount inboundPending;

    /** The change to the {@code outbound_pending} balance. */
    @SerializedName("outbound_pending")
    Amount outboundPending;
  }

  /** Details copied from the Transaction that this TransactionEntry belongs to. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransactionDetails extends StripeObject {
    /**
     * Open Enum. The category of this TransactionEntry's parent Transaction.
     *
     * <p>One of {@code adjustment}, {@code currency_conversion}, {@code inbound_transfer}, {@code
     * inbound_transfer_reversal}, {@code outbound_payment}, {@code outbound_payment_reversal},
     * {@code outbound_transfer}, {@code outbound_transfer_reversal}, {@code received_credit},
     * {@code received_credit_reversal}, {@code received_debit}, {@code received_debit_reversal},
     * {@code stripe_fee}, or {@code stripe_fee_tax}.
     */
    @SerializedName("category")
    String category;

    /** The ID of the FinancialAccount affected by this Transaction. */
    @SerializedName("financial_account")
    String financialAccount;

    /**
     * Details about the flow object that created the Transaction this entry belongs to, such as an
     * InboundTransfer or OutboundPayment. {@code transaction_details.flow.type} identifies the kind
     * of object. The corresponding field contains its ID, when available: for an InboundTransfer,
     * {@code transaction_details.flow.inbound_transfer} contains the InboundTransfer's ID. To list
     * entries for the parent Transaction, pass the TransactionEntry's {@code transaction} ID to the
     * {@code transaction} parameter on List Transaction Entries.
     */
    @SerializedName("flow")
    Flow flow;

    /**
     * Details about the flow object that created the Transaction this entry belongs to, such as an
     * InboundTransfer or OutboundPayment. {@code transaction_details.flow.type} identifies the kind
     * of object. The corresponding field contains its ID, when available: for an InboundTransfer,
     * {@code transaction_details.flow.inbound_transfer} contains the InboundTransfer's ID. To list
     * entries for the parent Transaction, pass the TransactionEntry's {@code transaction} ID to the
     * {@code transaction} parameter on List Transaction Entries.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Flow extends StripeObject {
      /** If applicable, the ID of the Adjustment that created this Transaction. */
      @SerializedName("adjustment")
      String adjustment;

      /** When available, the ID of the CurrencyConversion that created this Transaction. */
      @SerializedName("currency_conversion")
      String currencyConversion;

      /** If applicable, the ID of the FeeBatch that created this Transaction. */
      @SerializedName("fee_batch")
      String feeBatch;

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
       * Open Enum. The type of flow that created the Transaction. When available, the flow's ID is
       * provided in the corresponding field.
       *
       * <p>One of {@code adjustment}, {@code currency_conversion}, {@code fee_batch}, {@code
       * inbound_transfer}, {@code outbound_payment}, {@code outbound_transfer}, {@code
       * received_credit}, or {@code received_debit}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
