// File generated from our OpenAPI spec
package com.stripe.model.v2.payments;

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
 * An OffSessionPayment allows you to create your own payment flow for recurring and unscheduled
 * payments. In a single API request, you can initiate a payment and leverage Stripe's AI-powered <a
 * href="https://docs.stripe.com/payments/off-session-payments/smart-retries">Smart Retries</a> to
 * choose the best times to retry failures to increase the chance of a successful payment. To
 * properly interface with OffSessionPayments, we recommend setting up an event destination to
 * listen to webhook notifications, as the OffSessionPayment will transition through its lifecycle
 * asynchronously. Related guide: <a
 * href="https://docs.stripe.com/payments/off-session-payments">Off-Session Payments API</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPayment extends StripeObject implements HasId {
  /** The total amount to collect, including tax when applicable. */
  @SerializedName("amount_total")
  Amount amountTotal;

  /** Details about automatic tax calculation. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Creation time of the OffSessionPayment. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Three-letter ISO currency code, in lowercase. */
  @SerializedName("currency")
  String currency;

  /** ID of the Customer to which this OffSessionPayment belongs, if one exists. */
  @SerializedName("customer")
  String customer;

  /**
   * ID of the Account representing the customer to which this OffSessionPayment belongs, if one
   * exists.
   */
  @SerializedName("customer_account")
  String customerAccount;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The reason why the OffSessionPayment failed.
   *
   * <p>One of {@code customer_invalid}, {@code exceeded_retry_window}, {@code
   * no_valid_payment_method}, {@code rejected_by_partner}, or {@code retries_exhausted}.
   */
  @SerializedName("failure_reason")
  String failureReason;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The persisted item groups for this OffSessionPayment, in their original order. Null for
   * raw-amount payments.
   */
  @SerializedName("items")
  List<OffSessionPayment.Item> items;

  /** Payment attempt record for the latest attempt, if one exists. */
  @SerializedName("latest_payment_attempt_record")
  String latestPaymentAttemptRecord;

  /**
   * Has the value true if the object exists in live mode or the value false if the object exists in
   * test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Learn more about <a
   * href="https://docs.stripe.com/payments/payment-intents#storing-information-in-metadata">storing
   * information in metadata</a>.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.payments.off_session_payment}.
   */
  @SerializedName("object")
  String object;

  /** ID of the payment method used in this OffSessionPayment. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment record associated with the OffSessionPayment. */
  @SerializedName("payment_record")
  String paymentRecord;

  /** Retry configuration and attempts for this OffSessionPayment. */
  @SerializedName("retries")
  Retries retries;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card
   * charge. This value overrides the account's default statement descriptor. For information about
   * requirements, including the 22-character limit, see the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">Statement Descriptor
   * docs</a>.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * Status of this OffSessionPayment, one of {@code pending_initial_attempt}, {@code
   * pending_retry}, {@code processing}, {@code failed}, {@code canceled}, {@code succeeded}, or
   * {@code paused}.
   */
  @SerializedName("status")
  String status;

  /** Provides a way to schedule deferred payments for cards and debits, in YYYY-MM-DD format. */
  @SerializedName("target_date")
  String targetDate;

  /** Test clock that can be used to advance the retry attempts in a sandbox. */
  @SerializedName("test_clock")
  String testClock;

  /** Subtotal and tax for an itemized OffSessionPayment. Null for raw-amount payments. */
  @SerializedName("total_details")
  TotalDetails totalDetails;

  /** Details about automatic tax calculation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Whether automatic tax calculation is enabled for this OffSessionPayment. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The account liable for tax. Null when automatic tax is disabled; otherwise, an object with
     * type set to {@code self}, indicating the account making the API request.
     */
    @SerializedName("liability")
    Liability liability;

    /**
     * The account liable for tax. Null when automatic tax is disabled; otherwise, an object with
     * type set to {@code self}, indicating the account making the API request.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Liability extends StripeObject {
      /**
       * The type of account liable for tax.
       *
       * <p>Equal to {@code self}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about Item, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Item extends StripeObject {
    /** The persisted one-time prices in this item group. */
    @SerializedName("one_time_price")
    OneTimePrice oneTimePrice;

    /**
     * The type of item. Currently, only {@code one_time_price} is supported.
     *
     * <p>Equal to {@code one_time_price}.
     */
    @SerializedName("type")
    String type;

    /** The persisted one-time prices in this item group. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OneTimePrice extends StripeObject {
      /** A description of this item group. */
      @SerializedName("description")
      String description;

      /** The resolved price IDs and quantities in their original order. */
      @SerializedName("items")
      List<OffSessionPayment.Item.OneTimePrice.InnerItem> items;

      /** Additional information about this item group. */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /**
       * For more details about InnerItem, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class InnerItem extends StripeObject {
        /** The ID of the resolved one-time Price. */
        @SerializedName("price")
        String price;

        /** Quantity of this price in the item group. */
        @SerializedName("quantity")
        Long quantity;
      }
    }
  }

  /** Retry configuration and attempts for this OffSessionPayment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Retries extends StripeObject {
    /** Number of authorization attempts so far. */
    @SerializedName("attempts")
    Long attempts;

    /** Whether retries are enabled for this OffSessionPayment. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /** Subtotal and tax for an itemized OffSessionPayment. Null for raw-amount payments. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** The subtotal of the items, including any inclusive tax and excluding exclusive tax. */
    @SerializedName("amount_subtotal")
    Amount amountSubtotal;

    /** The calculated tax amount, including zero. Null when automatic tax was disabled. */
    @SerializedName("amount_tax")
    Amount amountTax;
  }
}
