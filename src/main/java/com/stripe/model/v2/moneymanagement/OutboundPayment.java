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

/**
 * OutboundPayment represents a single money movement from one FinancialAccount you own to a payout
 * method someone else owns.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OutboundPayment extends StripeObject implements HasId {
  /** The amount and currency requested for this OutboundPayment. */
  @SerializedName("amount")
  Amount amount;

  /** Returns true if the OutboundPayment can be canceled, and false otherwise. */
  @SerializedName("cancelable")
  Boolean cancelable;

  /**
   * Time at which the OutboundPayment was created. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** An arbitrary string attached to the OutboundPayment. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The date when funds are expected to arrive in the payout method. This field is not set if the
   * payout method is in a {@code failed}, {@code canceled}, or {@code returned} state. Represented
   * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
   * 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("expected_arrival_date")
  Instant expectedArrivalDate;

  /** The FinancialAccount that funds were pulled from. */
  @SerializedName("from")
  From from;

  /** Unique identifier for the OutboundPayment. */
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
   * <p>Equal to {@code v2.money_management.outbound_payment}.
   */
  @SerializedName("object")
  String object;

  /** The PayoutIntent ID that triggered this OutboundPayment. */
  @SerializedName("payout_intent")
  String payoutIntent;

  /** Details about the OutboundPayment notification settings for recipient. */
  @SerializedName("recipient_notification")
  RecipientNotification recipientNotification;

  /**
   * The ID of the RecipientVerification for this OutboundPayment. Required where recipient-name
   * verification is mandated before creating an OutboundPayment.
   */
  @SerializedName("recipient_verification")
  String recipientVerification;

  /**
   * The description that appears on the receiving end of an OutboundPayment (for example, on a bank
   * statement). Defaults to {@code STRIPE} if not configured in the account settings.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Current status of the OutboundPayment. An OutboundPayment is {@code processing} after creation.
   * It becomes {@code posted} when funds leave the account, {@code failed} if it cannot be sent,
   * {@code canceled} if canceled before posting, or {@code returned} if the funds are returned.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code posted}, {@code processing}, or {@code
   * returned}.
   */
  @SerializedName("status")
  String status;

  /**
   * Status details for an OutboundPayment in a {@code processing}, {@code failed}, or {@code
   * returned} state.
   */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** To which payout method the OutboundPayment was sent. */
  @SerializedName("to")
  To to;

  /** Information to track this OutboundPayment with the recipient bank. */
  @SerializedName("tracking_details")
  TrackingDetails trackingDetails;

  /** The FinancialAccount that funds were pulled from. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The monetary amount debited from the sender, only set on responses. */
    @SerializedName("debited")
    Amount debited;

    /** The FinancialAccount that funds were pulled from. */
    @SerializedName("financial_account")
    String financialAccount;
  }

  /** Details about the OutboundPayment notification settings for recipient. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RecipientNotification extends StripeObject {
    /**
     * Closed Enum. Configuration option to enable or disable notifications to recipients. Do not
     * send notifications when {@code setting} is {@code none}. Use the account setting when {@code
     * setting} is {@code configured} or omitted.
     *
     * <p>One of {@code configured}, or {@code none}.
     */
    @SerializedName("setting")
    String setting;
  }

  /**
   * Status details for an OutboundPayment in a {@code processing}, {@code failed}, or {@code
   * returned} state.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** The {@code failed} status reason. */
    @SerializedName("failed")
    Failed failed;

    /** The {@code processing} status details. */
    @SerializedName("processing")
    Processing processing;

    /** The {@code returned} status reason. */
    @SerializedName("returned")
    Returned returned;

    /** The {@code failed} status reason. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * Open Enum. The {@code failed} status reason.
       *
       * <p>One of {@code fx_rate_drift_exceeded_after_review}, {@code
       * payout_method_amount_limit_exceeded}, {@code payout_method_declined}, {@code
       * payout_method_does_not_exist}, {@code payout_method_expired}, {@code
       * payout_method_unsupported}, {@code payout_method_usage_frequency_limit_exceeded}, {@code
       * review_rejected}, or {@code unknown_failure}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** The {@code processing} status details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Processing extends StripeObject {
      /**
       * Open Enum. The {@code processing} status reason.
       *
       * <p>Equal to {@code under_review}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** The {@code returned} status reason. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Returned extends StripeObject {
      /**
       * Open Enum. The {@code returned} status reason.
       *
       * <p>One of {@code payout_method_canceled_by_customer}, {@code payout_method_closed}, {@code
       * payout_method_currency_unsupported}, {@code payout_method_does_not_exist}, {@code
       * payout_method_holder_address_incorrect}, {@code payout_method_holder_details_incorrect},
       * {@code payout_method_holder_name_incorrect}, {@code payout_method_invalid_account_number},
       * {@code payout_method_restricted}, {@code recalled}, or {@code unknown_failure}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when an OutboundPayment changed status to {@code canceled}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * Timestamp describing when an OutboundPayment changed status to {@code failed}. Represented as
     * a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("failed_at")
    Instant failedAt;

    /**
     * Timestamp describing when an OutboundPayment changed status to {@code posted}. Represented as
     * a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("posted_at")
    Instant postedAt;

    /**
     * Timestamp describing when an OutboundPayment changed status to {@code returned}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("returned_at")
    Instant returnedAt;
  }

  /** To which payout method the OutboundPayment was sent. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The monetary amount being credited to the destination. */
    @SerializedName("credited")
    Amount credited;

    /** The payout method which the OutboundPayment uses to send payout. */
    @SerializedName("payout_method")
    String payoutMethod;

    /** Payout method options for the OutboundPayment. */
    @SerializedName("payout_method_options")
    PayoutMethodOptions payoutMethodOptions;

    /** To which account the OutboundPayment is sent. */
    @SerializedName("recipient")
    String recipient;

    /** Payout method options for the OutboundPayment. */
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

        /** The preferred networks to use for this OutboundPayment. */
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

  /** Information to track this OutboundPayment with the recipient bank. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TrackingDetails extends StripeObject {
    /** Bank account tracking details. */
    @SerializedName("bank_account")
    BankAccount bankAccount;

    /** Card tracking details. */
    @SerializedName("card")
    Card card;

    /**
     * The status of the tracking details for this OutboundPayment.
     *
     * <p>One of {@code pending}, {@code supported}, or {@code unsupported}.
     */
    @SerializedName("status")
    String status;

    /**
     * The type of tracking details for this OutboundPayment.
     *
     * <p>One of {@code bank_account}, or {@code card}.
     */
    @SerializedName("type")
    String type;

    /** Bank account tracking details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BankAccount extends StripeObject {
      /**
       * A unique identifier that can be used to track this OutboundPayment with the recipient bank.
       * Banks might call this a “reference number” or something similar.
       */
      @SerializedName("trace_id")
      String traceId;
    }

    /** Card tracking details. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * A unique identifier that can be used to track this OutboundPayment with the recipient card.
       */
      @SerializedName("retrieval_reference")
      String retrievalReference;
    }
  }
}
