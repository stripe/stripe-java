// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Transaction records how a money movement flow affects your FinancialAccount balance. A flow can
 * create one or more Transactions.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends StripeObject implements HasId {
  /** The amount of the Transaction. */
  @SerializedName("amount")
  Amount amount;

  /**
   * The change to the FinancialAccount's balance. This is the sum of the balance impacts of this
   * Transaction's TransactionEntries with {@code effective_at} timestamps in the past.
   */
  @SerializedName("balance_impact")
  BalanceImpact balanceImpact;

  /**
   * Open Enum. A category used to classify the Transaction.
   *
   * <p>One of {@code adjustment}, {@code currency_conversion}, {@code inbound_transfer}, {@code
   * inbound_transfer_reversal}, {@code outbound_payment}, {@code outbound_payment_reversal}, {@code
   * outbound_transfer}, {@code outbound_transfer_reversal}, {@code received_credit}, {@code
   * received_credit_reversal}, {@code received_debit}, {@code received_debit_reversal}, {@code
   * stripe_fee}, or {@code stripe_fee_tax}.
   */
  @SerializedName("category")
  String category;

  /** Details about the counterparty to this Transaction. */
  @SerializedName("counterparty")
  Counterparty counterparty;

  /**
   * Time at which the object was created. Represented as an RFC 3339 timestamp in UTC with
   * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /**
   * A description of the Transaction. When applicable, the description is copied from the flow
   * object when the Transaction is created. You can update it using the Update Transaction
   * endpoint.
   */
  @SerializedName("description")
  String description;

  /** The ID of the FinancialAccount affected by this Transaction. */
  @SerializedName("financial_account")
  String financialAccount;

  /**
   * Details about the flow object that created the Transaction, such as an InboundTransfer or
   * OutboundPayment. {@code flow.type} identifies the kind of object. The corresponding field
   * contains its ID, when available: for an InboundTransfer, {@code flow.inbound_transfer} contains
   * the InboundTransfer's ID. Pass that ID to the {@code flow} parameter on List Transactions.
   */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.transaction}.
   */
  @SerializedName("object")
  String object;

  /**
   * Hosted transaction receipt that is provided when money movement is considered regulated under
   * Stripe's money transmission licenses. If not applicable, {@code regulatory_receipt.status} will
   * be {@code not_applicable} and no URL will be provided unless you opt in by calling {@code
   * /refresh_regulatory_receipt}.
   */
  @SerializedName("regulatory_receipt")
  RegulatoryReceipt regulatoryReceipt;

  /**
   * Closed Enum. The current status of the Transaction. A Transaction is {@code pending} if either
   * {@code balance_impact.inbound_pending} or {@code balance_impact.outbound_pending} is non-zero.
   * A Transaction is {@code posted} if only {@code balance_impact.available} is non-zero. A
   * Transaction is {@code void} if there is no balance impact. {@code posted} and {@code void} are
   * terminal states, and no additional TransactionEntries will be added to the Transaction.
   *
   * <p>One of {@code pending}, {@code posted}, or {@code void}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for when the Transaction transitioned to each status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The change to the FinancialAccount's balance. This is the sum of the balance impacts of this
   * Transaction's TransactionEntries with {@code effective_at} timestamps in the past.
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

  /** Details about the counterparty to this Transaction. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Counterparty extends StripeObject {
    /** Name of the counterparty. */
    @SerializedName("name")
    String name;
  }

  /**
   * Details about the flow object that created the Transaction, such as an InboundTransfer or
   * OutboundPayment. {@code flow.type} identifies the kind of object. The corresponding field
   * contains its ID, when available: for an InboundTransfer, {@code flow.inbound_transfer} contains
   * the InboundTransfer's ID. Pass that ID to the {@code flow} parameter on List Transactions.
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

  /**
   * Hosted transaction receipt that is provided when money movement is considered regulated under
   * Stripe's money transmission licenses. If not applicable, {@code regulatory_receipt.status} will
   * be {@code not_applicable} and no URL will be provided unless you opt in by calling {@code
   * /refresh_regulatory_receipt}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RegulatoryReceipt extends StripeObject {
    /**
     * Current availability of the regulatory receipt.
     *
     * <p>One of {@code available}, {@code not_applicable}, {@code pending}, or {@code url_expired}.
     */
    @SerializedName("status")
    String status;

    /** Hosted URL for the receipt. */
    @SerializedName("url")
    String url;

    /** Time until which {@code url} is valid. */
    @SerializedName("url_expires_at")
    Instant urlExpiresAt;
  }

  /** Timestamps for when the Transaction transitioned to each status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * The time at which the Transaction became {@code posted}. Only present when {@code status} is
     * {@code posted}.
     */
    @SerializedName("posted_at")
    Instant postedAt;

    /**
     * The time at which the Transaction became {@code void}. Only present when {@code status} is
     * {@code void}.
     */
    @SerializedName("void_at")
    Instant voidAt;
  }
}
