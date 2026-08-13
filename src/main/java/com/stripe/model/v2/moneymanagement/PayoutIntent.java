// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** PayoutIntent represents an intent to send funds from a Financial Account to a payout method. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PayoutIntent extends StripeObject implements HasId {
  /** The monetary amount to be sent. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Controls whether the intent requires explicit confirmation before transitioning to pending.
   *
   * <p>One of {@code automatic}, or {@code manual}.
   */
  @SerializedName("confirmation_method")
  String confirmationMethod;

  /**
   * Time at which the PayoutIntent was created. Represented as a RFC 3339 date &amp; time UTC value
   * in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** An arbitrary string attached to the PayoutIntent. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Estimated fees and taxes. */
  @SerializedName("estimated_fees")
  List<PayoutIntent.EstimatedFee> estimatedFees;

  /** The FinancialAccount that funds are pulled from. */
  @SerializedName("from")
  From from;

  /** FX rate information for fee transparency. */
  @SerializedName("fx_quote")
  FxQuote fxQuote;

  /** Unique identifier for the PayoutIntent. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Details about the latest payout associated with this PayoutIntent. */
  @SerializedName("latest_payout")
  LatestPayout latestPayout;

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
   * Next action required for a PayoutIntent in the requires_action state. Populated when status is
   * requires_action.
   */
  @SerializedName("next_action")
  NextAction nextAction;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.payout_intent}.
   */
  @SerializedName("object")
  String object;

  /**
   * Details about the OutboundPayment notification settings for recipient. Only applicable to
   * OutboundPayment.
   */
  @SerializedName("recipient_notification")
  RecipientNotification recipientNotification;

  /** Scheduling options for the payout. If this is nil, we assume immediate execution. */
  @SerializedName("schedule_options")
  ScheduleOptions scheduleOptions;

  /**
   * The description that appears on the receiving end for the payout (for example, on a bank
   * statement).
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Open Enum. Current status of the PayoutIntent: {@code pending}, {@code processing}, {@code
   * posted}, {@code canceled}, {@code requires_action}.
   *
   * <p>One of {@code canceled}, {@code pending}, {@code posted}, {@code processing}, or {@code
   * requires_action}.
   */
  @SerializedName("status")
  String status;

  /** Hash containing timestamps of when transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** To which payout method the payout is sent. */
  @SerializedName("to")
  To to;

  /**
   * For more details about EstimatedFee, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EstimatedFee extends StripeObject {
    /** The fee amount. */
    @SerializedName("amount")
    Amount amount;

    /**
     * Tax charged for this fee, if applicable. Value expressed as a decimal string in major units.
     */
    @SerializedName("tax_amount")
    TaxAmount taxAmount;

    /**
     * Open Enum. The type of fee.
     *
     * <p>One of {@code cross_border_fee}, {@code foreign_exchange_fee}, {@code
     * instant_card_payout_fee}, {@code next_day_payout_fee}, {@code real_time_payout_fee}, {@code
     * stablecoin_payout_fee}, {@code stablecoin_routing_fee}, {@code standard_payout_fee}, or
     * {@code wire_payout_fee}.
     */
    @SerializedName("type")
    String type;

    /**
     * Tax charged for this fee, if applicable. Value expressed as a decimal string in major units.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxAmount extends StripeObject {
      /** Currency code. */
      @SerializedName("currency")
      String currency;

      /** Tax amount value represented as a decimal string in major units. */
      @SerializedName("value_decimal")
      String valueDecimal;
    }
  }

  /** The FinancialAccount that funds are pulled from. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The currency of the financial account. */
    @SerializedName("currency")
    String currency;

    /** Estimated amount to be debited from the financial account. */
    @SerializedName("debited")
    Amount debited;

    /** The FinancialAccount that funds are pulled from. */
    @SerializedName("financial_account")
    String financialAccount;
  }

  /** FX rate information for fee transparency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FxQuote extends StripeObject {
    /**
     * Open Enum. Duration of the FX rate lock.
     *
     * <p>One of {@code five_minutes}, or {@code none}.
     */
    @SerializedName("lock_duration")
    String lockDuration;

    /** Timestamp when the rate lock expires. Null when rate locking is not supported. */
    @SerializedName("lock_expires_at")
    Instant lockExpiresAt;

    /**
     * Open Enum. Lock status of the FX rate.
     *
     * <p>One of {@code active}, {@code expired}, or {@code none}.
     */
    @SerializedName("lock_status")
    String lockStatus;

    /** Key: source currency. Value: exchange rate from source currency to to_currency. */
    @SerializedName("rates")
    Map<String, PayoutIntent.FxQuote.Rate> rates;

    /** The destination currency. */
    @SerializedName("to_currency")
    String toCurrency;

    /**
     * For more details about Rate, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rate extends StripeObject {
      /**
       * The exchange rate going from_currency -&gt; to_currency, represented as a decimal string
       * (e.g., &quot;1.1520&quot;) to preserve the full precision of the rate.
       */
      @SerializedName("exchange_rate")
      String exchangeRate;
    }
  }

  /** Details about the latest payout associated with this PayoutIntent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LatestPayout extends StripeObject {
    /** The ID of the OutboundPayment, if applicable. */
    @SerializedName("outbound_payment")
    String outboundPayment;

    /** The ID of the OutboundTransfer, if applicable. */
    @SerializedName("outbound_transfer")
    String outboundTransfer;

    /**
     * The type of payout.
     *
     * <p>One of {@code outbound_payment}, or {@code outbound_transfer}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * Next action required for a PayoutIntent in the requires_action state. Populated when status is
   * requires_action.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    /** Details about a confirmation required. Populated when type is confirm. */
    @SerializedName("confirm")
    Confirm confirm;

    /** Details about a failure that requires user action. Populated when type is handle_failure. */
    @SerializedName("handle_failure")
    HandleFailure handleFailure;

    /**
     * Open Enum. The type of next action required.
     *
     * <p>One of {@code confirm}, or {@code handle_failure}.
     */
    @SerializedName("type")
    String type;

    /** Details about a confirmation required. Populated when type is confirm. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Confirm extends StripeObject {
      /**
       * Open Enum. The reason the PayoutIntent requires confirmation.
       *
       * <p>One of {@code automatically_required}, or {@code manually_requested}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** Details about a failure that requires user action. Populated when type is handle_failure. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class HandleFailure extends StripeObject {
      /**
       * Open Enum. The reason for the failure.
       *
       * <p>One of {@code account_not_configured_as_recipient}, {@code
       * currency_not_supported_for_financial_account_balance}, {@code currency_required}, {@code
       * feature_not_active_for_recipient}, {@code fx_rate_drift_exceeded_after_review}, {@code
       * insufficient_funds}, {@code payout_method_account_type_incorrect}, {@code
       * payout_method_amount_limit_exceeded}, {@code payout_method_canceled_by_customer}, {@code
       * payout_method_closed}, {@code payout_method_currency_unsupported}, {@code
       * payout_method_declined}, {@code payout_method_does_not_exist}, {@code
       * payout_method_expired}, {@code payout_method_holder_address_incorrect}, {@code
       * payout_method_holder_details_incorrect}, {@code payout_method_holder_name_incorrect},
       * {@code payout_method_invalid_account_number}, {@code payout_method_restricted}, {@code
       * payout_method_unsupported}, {@code payout_method_usage_frequency_limit_exceeded}, {@code
       * recalled}, {@code review_rejected}, {@code to_destination_invalid}, or {@code
       * unknown_failure}.
       */
      @SerializedName("failure_reason")
      String failureReason;
    }
  }

  /**
   * Details about the OutboundPayment notification settings for recipient. Only applicable to
   * OutboundPayment.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RecipientNotification extends StripeObject {
    /**
     * Closed Enum. Configuration option to enable or disable notifications to recipients. Do not
     * send notifications when setting is NONE. Default to account setting when setting is
     * CONFIGURED or not set.
     *
     * <p>One of {@code configured}, or {@code none}.
     */
    @SerializedName("setting")
    String setting;
  }

  /** Scheduling options for the payout. If this is nil, we assume immediate execution. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ScheduleOptions extends StripeObject {
    /** The date when the payout should be executed, in YYYY-MM-DD format. */
    @SerializedName("execute_on")
    String executeOn;
  }

  /** Hash containing timestamps of when transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when a PayoutIntent changed status to {@code canceled}. Represented as a
     * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * Timestamp describing when a PayoutIntent changed status to {@code posted}. Represented as a
     * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("posted_at")
    Instant postedAt;

    /**
     * Timestamp describing when a PayoutIntent changed status to {@code processing}. Represented as
     * a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("processing_at")
    Instant processingAt;

    /**
     * Timestamp describing when a PayoutIntent changed status to {@code requires_action}.
     * Represented as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("requires_action_at")
    Instant requiresActionAt;
  }

  /** To which payout method the payout is sent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** Estimated amount to be credited to the recipient in the destination currency. */
    @SerializedName("credited")
    Amount credited;

    /** The currency to send to the recipient. */
    @SerializedName("currency")
    String currency;

    /**
     * The payout method ID. Optional for OutboundPayment if recipient has default payment method.
     * Required for OutboundTransfer.
     */
    @SerializedName("payout_method")
    String payoutMethod;

    /** Payout method options for the PayoutIntent. */
    @SerializedName("payout_method_options")
    PayoutMethodOptions payoutMethodOptions;

    /** The recipient ID. Only relevant for OutboundPayment. */
    @SerializedName("recipient")
    String recipient;

    /** Payout method options for the PayoutIntent. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PayoutMethodOptions extends StripeObject {
      /** Options for bank account payout methods. */
      @SerializedName("bank_account")
      BankAccount bankAccount;

      /** Options for bank account payout methods. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BankAccount extends StripeObject {
        /** Per-network configuration options. */
        @SerializedName("preferred_network_options")
        PreferredNetworkOptions preferredNetworkOptions;

        /** The preferred networks to use for this PayoutIntent. */
        @SerializedName("preferred_networks")
        List<String> preferredNetworks;

        /** Per-network configuration options. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PreferredNetworkOptions extends StripeObject {
          /** ACH-specific network options. */
          @SerializedName("ach")
          Ach ach;

          /** ACH-specific network options. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Ach extends StripeObject {
            /**
             * Open Enum. ACH submission timing.
             *
             * <p>One of {@code next_day}, or {@code same_day}.
             */
            @SerializedName("submission")
            String submission;

            /**
             * The transaction purpose for this ACH payment.
             *
             * <p>Equal to {@code payroll}.
             */
            @SerializedName("transaction_purpose")
            String transactionPurpose;
          }
        }
      }
    }
  }
}
